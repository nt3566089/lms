package com.oneslogi.wms.core.logic.stockupdate;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロット管理ロジッククラス
 */
class LotManageLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TLotBhv tLotBhv;

	// ===== 使用ロジック =====
	@Inject
	private LotLogic lotLogic;

	// インスタンスMAP
	private Map<LotKey, TLot> lotInstances = new HashMap<LotKey, TLot>();

	// ロットのキークラス
	private static class LotKey {

		private long productId;
		private String lot;
		private String limitDt;

		private LotKey(long productId, String lot, String limitDt) {
			this.productId = productId;
			this.lot = lot;
			this.limitDt = limitDt;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((limitDt == null) ? 0 : limitDt.hashCode());
			result = prime * result + ((lot == null) ? 0 : lot.hashCode());
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
			LotKey other = (LotKey) obj;
			if (limitDt == null) {
				if (other.limitDt != null)
					return false;
			} else if (!limitDt.equals(other.limitDt))
				return false;
			if (lot == null) {
				if (other.lot != null)
					return false;
			} else if (!lot.equals(other.lot))
				return false;
			if (productId != other.productId)
				return false;
			return true;
		}
	}

	/**
	 * <h2>ロットの検索を行う。</h2>
	 * <pre>
	 * 引数を条件にデータベースからロットを検索して返却する。
	 * また、同じ引数の情報の場合、(当オブジェクトのインスタンス毎)
	 * データベースの検索はせずにキャッシュしたロットを返却する。
	 * </pre>
	 * @param productId 商品ID
	 * @param lot ロット
	 * @param limitDt 期限日
	 * @return TLot 検索したロット(未登録の場合はnull)
	 */
	TLot selectLot(long productId, String lot, String limitDt) {

		// ロットキー
		LotKey key = new LotKey(productId, lot, limitDt);

		// 取得済の場合はマップから返す
		if (lotInstances.containsKey(key)) {
			return lotInstances.get(key);
		}

		// データベースから検索
		TLot lotC = new TLot();
		lotC.setProductId(productId);
		lotC.setLot(lot);
		lotC.setLimitDt(limitDt);

		TLot selectLot = lotLogic.getUkEntity(lotC);

		// 登録済の場合は取得したロットを返す
		if (selectLot != null) {
			lotInstances.put(key, selectLot);
		}

		return selectLot;
	}

	/**
	 * <h2>ロットの検索または登録を行う。</h2>
	 * <pre>
	 * 引数を条件にデータベースからロットを検索して返却する。
	 * データベースに登録がない場合は登録し、登録したロットを返却する。
	 * また、同じ引数の情報の場合、(当オブジェクトのインスタンス毎)
	 * データベースの検索はせずにキャッシュしたロットを返却する。
	 * </pre>
	 * @param productId 商品ID
	 * @param lot ロット
	 * @param limitDt 期限日
	 * @return TLot ロット
	 */
	TLot selectOrInsertLot(long productId, String lot, String limitDt) {

		// ロットを検索
		TLot selectLot = selectLot(productId, lot, limitDt);

		// 登録済の場合は取得したロットを返す
		if (selectLot != null) {
			return selectLot;
		}

		// ロットを登録して返す
		TLot insertLot = new TLot();
		insertLot.setProductId(productId);
		insertLot.setLot(lot);
		insertLot.setLimitDt(limitDt);

		tLotBhv.insert(insertLot);

		// ロットキー
		LotKey key = new LotKey(productId, lot, limitDt);
		lotInstances.put(key, insertLot);

		return insertLot;
	}
}
