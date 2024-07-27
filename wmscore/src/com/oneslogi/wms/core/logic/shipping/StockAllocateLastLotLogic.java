package com.oneslogi.wms.core.logic.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TLastLotCB;
import com.oneslogi.base.dbflute.exbhv.TLastLotBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TLastLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫引当最終ロット管理ロジッククラス
 */
class StockAllocateLastLotLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TLastLotBhv tLastLotBhv;

	/** DBから取得した最終ロット */
	private Map<LastLotKey, TLastLot> selectLastLotMap = new HashMap<LastLotKey, TLastLot>();

	/** 出荷したロット */
	private Map<LastLotKey, List<TLastLot>> shipdLastLotMap = new HashMap<LastLotKey, List<TLastLot>>();

	private List<TLastLot> insertLastLotList = new ArrayList<TLastLot>();
	private List<TLastLot> updateLastLotList = new ArrayList<TLastLot>();

	/**
	 * <h2>最終ロット設定、出荷限界期限日設定を行う。</h2>
	 * <pre>
	 * 期限日逆転防止なしの場合、当処理をスキップする。
	 * 登録された最終ロット期限日と現在設定されている出荷限界期限日と比較して新しい期限日を
	 * 出荷限界期限日に設定する。
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ：納品先ID・出荷日
	 * @param allocInstBody 引当指示ボディ：期限日逆転防止フラグ・商品ID・出荷限界期限日
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void setLimitLot(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, ErrorStatus errSts) {

		if (allocInstBody.isLimitDtReverseFlg$0()) {
			// 期限日逆転防止なし
			return;
		}

		LastLotKey key = new LastLotKey(allocInstBody.getProductId(), allocInstHeader.getSupplyCustomerId());

		TLastLot lastLot = null;
		// DBから値を取得済みか
		if (selectLastLotMap.containsKey(key)) {

			// 検索したロットを返却
			lastLot = selectLastLotMap.get(key);
		} else {

			// DBから検索
			TLastLotCB cb = tLastLotBhv.newMyConditionBean();
			cb.setupSelect_TLot();
			cb.query().setCustomerId_Equal(allocInstHeader.getSupplyCustomerId());
			cb.query().setProductId_Equal(allocInstBody.getProductId());
			lastLot = tLastLotBhv.selectEntity(cb);
			selectLastLotMap.put(key, lastLot);
		}

		// 既に出荷済か
		if (shipdLastLotMap.containsKey(key)) {

			String shippingDt = allocInstHeader.getShippingDt();
			for (TLastLot shipdLastLot : shipdLastLotMap.get(key)) {

				String shippingDtLastLot = shipdLastLot.getShippingDt();

				if (0 < shippingDt.compareTo(shippingDtLastLot)) {
					// 出荷日より前の出荷ロットを返却
					lastLot = shipdLastLot;
					break;
				}
			}
		}

		if (lastLot != null) {

			// 現在設定されている期限日(商品出荷限界期限日)と比較
			String productLimitDt = allocInstBody.getShippingLimitDt();
			if (productLimitDt == null) {
				// 商品出荷限界期限日なし

				allocInstBody.setShippingLimitDt(lastLot.getTLot().getLimitDt());
			} else {
				// 商品出荷限界期限日あり

				// 最終ロットの方が後ろの日付の場合は上書き
				if (0 < lastLot.getTLot().getLimitDt().compareTo(productLimitDt)) {
					allocInstBody.setShippingLimitDt(lastLot.getTLot().getLimitDt());
				}
			}
		}
	}

	/**
	 * <h2>引当ロット設定を行う。</h2>
	 * <pre>
	 * 引当した在庫のロットを設定する。
	 *
	 * 期限日逆転防止なしの場合、当処理をスキップする。
	 *
	 * 引数の出荷日と出荷済ロットの最新出荷日を比較し、最終ロットを判定する。
	 * ・引数の出荷日の方が新しい場合、在庫引当したロットを最終ロットとする
	 * ・引数の出荷日と出荷済ロットの最新出荷日が等しい場合、期限日の新しい方を最終ロットとする
	 * ※既存の出荷データに無い場合、最終ロットを新規作成する。
	 *
	 * 以前に、引数の出荷日より新しい出荷日でこのメソッドの呼出しがあった場合、致命的エラーをスローする。
	 * （クラスの使用方法に違反しているため）
	 *
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ：納品先ID・出荷日
	 * @param allocInstBody 引当指示ボディ：期限日逆転防止フラグ・商品ID
	 * @param lot 在庫引当したロット：ロットID・商品ID・期限日
	 */
	protected void shipdLot(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, TLot lot) {

		if (allocInstBody.isLimitDtReverseFlg$0()) {
			// 期限日逆転防止なし
			return;
		}

		LastLotKey key = new LastLotKey(allocInstBody.getProductId(), allocInstHeader.getSupplyCustomerId());
		String shippingDt = allocInstHeader.getShippingDt();

		if (shipdLastLotMap.containsKey(key)) {

			List<TLastLot> lastLotList = shipdLastLotMap.get(key);
			// 1件目(最新の出荷日の引当ロット)
			TLastLot shipdLot = lastLotList.get(0);
			if (0 < shipdLot.getShippingDt().compareTo(shippingDt)) {
				// 既に出荷しているものより古い日付の出荷ロットは入れられない
				// 出荷日順で使用されることを前提とする

				getErrorManager().throwException(new IllegalArgumentException("ShipdLot do not add out order of shippingDt"));
			}

			// 出荷日が同じ場合は期限日の新しい方を最終ロットとする
			if (shipdLot.getShippingDt().equals(shippingDt)) {

				// 期限日の比較
				if (0 < lot.getLimitDt().compareTo(shipdLot.getTLot().getLimitDt())) {

					// 最新の出荷日での呼出しを前提としているため1件目に登録
					lastLotList.remove(0);

					TLastLot newLastLot = new TLastLot();
					newLastLot.setShippingDt(shippingDt);
					newLastLot.setLotId(lot.getLotId());
					newLastLot.setProductId(key.getProductId());
					newLastLot.setCustomerId(key.getCustomerId());
					newLastLot.setTLot(lot);

					lastLotList.add(0, newLastLot);
				}

			} else {

				TLastLot newLastLot = new TLastLot();
				newLastLot.setShippingDt(shippingDt);
				newLastLot.setLotId(lot.getLotId());
				newLastLot.setProductId(key.getProductId());
				newLastLot.setCustomerId(key.getCustomerId());
				newLastLot.setTLot(lot);

				lastLotList.add(0, newLastLot);
			}
		} else {
			TLastLot newLastLot = new TLastLot();
			newLastLot.setShippingDt(shippingDt);
			newLastLot.setLotId(lot.getLotId());
			newLastLot.setProductId(key.getProductId());
			newLastLot.setCustomerId(key.getCustomerId());
			newLastLot.setTLot(lot);

			List<TLastLot> lastLotList = new ArrayList<TLastLot>();
			lastLotList.add(newLastLot);

			shipdLastLotMap.put(key, lastLotList);
		}
	}

	/**
	 * <h2>最終ロット更新、登録を行う。</h2>
	 * <pre>
	 * 最終ロット設定、出荷限界期限日設定して、
	 * 最終ロットの更新または登録を一括で行う。
	 * </pre>
	 */
	protected void updateModifiedLastLot() {

		// 変更のある最終ロットを設定
		setModifiedLastLot();

		// 登録実行
		if (0 < insertLastLotList.size()) {
			tLastLotBhv.batchInsert(insertLastLotList);
		}

		// 更新実行
		if (0 < updateLastLotList.size()) {
			tLastLotBhv.batchUpdate(updateLastLotList);
		}
	}

	/**
	 * 設定された最終ロット、出荷ロットから変更最終ロット、登録最終ロットを設定
	 * 本メソッドを呼ばれた後、更新(登録)ロットの取得メソッドで設定された最終ロットを取得
	 */
	private void setModifiedLastLot() {
		// DBから取得したロットと出荷したロットを比較 (出荷日が一番大きいロット)

		for (Map.Entry<LastLotKey, List<TLastLot>> shipdLotEntry : shipdLastLotMap.entrySet()) {
			LastLotKey key = shipdLotEntry.getKey();

			// 最後の出荷日のロット情報を取得(ソート済なので1件目)
			TLastLot shipdLot = shipdLotEntry.getValue().get(0);
			// DBの最終
			TLastLot selectLastLot = selectLastLotMap.get(key);

			// 比較
			if (selectLastLot == null) {
				// DBになし
				TLastLot newLastLot = new TLastLot();
				newLastLot.setCustomerId(key.getCustomerId());
				newLastLot.setProductId(key.getProductId());
				newLastLot.setLotId(shipdLot.getLotId());

				insertLastLotList.add(newLastLot);
			} else {

				// 期限日を比較
				if (0 < (shipdLot.getTLot().getLimitDt()).compareTo(selectLastLot.getTLot().getLimitDt())) {

					selectLastLot.setLotId(shipdLot.getLotId());
					updateLastLotList.add(selectLastLot);
				}
			}
		}
	}

	/**
	 * 最終ロットキークラス
	 */
	protected static final class LastLotKey {

		private long productId;
		private long customerId;

		protected LastLotKey(long productId, long customerId) {
			this.productId = productId;
			this.customerId = customerId;
		}

		/**
		 * @return productId
		 */
		protected long getProductId() {
			return productId;
		}

		/**
		 * @return customerId
		 */
		protected long getCustomerId() {
			return customerId;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (customerId ^ (customerId >>> 32));
			result = prime * result + (int) (productId ^ (productId >>> 32));
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LastLotKey other = (LastLotKey) obj;
			if (customerId != other.customerId)
				return false;
			if (productId != other.productId)
				return false;
			return true;
		}
	}
}