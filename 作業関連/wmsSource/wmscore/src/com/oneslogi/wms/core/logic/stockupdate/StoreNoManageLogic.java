package com.oneslogi.wms.core.logic.stockupdate;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exbhv.TStoreNoRBhv;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.TStoreNoR;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫No管理クラス。
 */
class StoreNoManageLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreNoBhv tStoreNoBhv;
	@Inject
	private TStoreNoRBhv tStoreNoRBhv;

	// ===== 使用ロジック =====
	@Inject
	private StoreNoLogic storeNoLogic;
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;

	// インスタンスMAP
	private Map<StoreNoKey, TStoreNo> storeNoInstances = new HashMap<StoreNoKey, TStoreNo>();

	// 入庫Noのキークラス
	private static class StoreNoKey {

		private String storeLabelNo;

		private StoreNoKey(String storeLabelNo) {
			this.storeLabelNo = storeLabelNo;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((storeLabelNo == null) ? 0 : storeLabelNo.hashCode());
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
			StoreNoKey other = (StoreNoKey) obj;
			if (storeLabelNo == null) {
				if (other.storeLabelNo != null)
					return false;
			} else if (!storeLabelNo.equals(other.storeLabelNo))
				return false;
			return true;
		}
	}

	/**
	 * <h2>入庫Noの検索</h2>
	 * <pre>
	 * 引数の情報の入庫Noをデータベースから検索し返却する。
	 * また、同じ引数の情報の場合、(当オブジェクトのインスタンス毎)
	 * データベースの検索はせずにキャッシュした入庫Noを返却する。
	 * </pre>
	 * @param storeLabelNo 入庫ラベルNo
	 * @return 検索した入庫No(未登録の場合はnull)
	 */
	TStoreNo selectStoreNo(String storeLabelNo) {

		// 入庫Noキー
		StoreNoKey key = new StoreNoKey(storeLabelNo);

		// 取得済の場合はマップから返す
		if (storeNoInstances.containsKey(key)) {
			return storeNoInstances.get(key);
		}

		// データベースから検索
		TStoreNo storeNoC = new TStoreNo();
		storeNoC.setStoreLabelNo(storeLabelNo);

		TStoreNo selectStoreNo = storeNoLogic.getUkEntity(storeNoC);

		// 登録済の場合は取得した入庫Noを返す
		if (selectStoreNo != null) {
			storeNoInstances.put(key, selectStoreNo);
		}

		return selectStoreNo;
	}

	/**
	 * <h2>入庫Noの検索または登録</h2>
	 * <pre>
	 * 引数の情報の入庫Noをデータベースから検索し返却する。
	 * データベースに登録がない場合は登録し、登録した入庫Noを返却する。
	 * また、同じ引数の情報の場合、(当オブジェクトのインスタンス毎)
	 * データベースの検索はせずにキャッシュした入庫Noを返却する。
	 * </pre>
	 * @param storeLabelNo 入庫ラベルNo
	 * @param supplierId 仕入先ID
	 * @param storeDt 入庫日
	 * @param oldStoreNoId 元入庫NoID
	 * @return 検索または登録した入庫No
	 */
	protected TStoreNo selectOrInsertStoreNo(String storeLabelNo, Long supplierId, String storeDt, Long oldStoreNoId) {

		// 入庫Noを検索
		TStoreNo selectStoreNo = selectStoreNo(storeLabelNo);

		// 登録済の場合は取得した入庫Noを返す
		if (selectStoreNo != null) {
			return selectStoreNo;
		}

		// 入庫Noを登録して返す
		TStoreNo insertStoreNo = new TStoreNo();
		insertStoreNo.setStoreLabelNo(storeLabelNo);
		insertStoreNo.setSupplierId(supplierId);
		insertStoreNo.setStoreDt(storeDt);
		insertStoreNo.setOldStoreNumId(oldStoreNoId);

		tStoreNoBhv.insert(insertStoreNo);

		// 入庫No.帳票登録
		TStoreNoR insertStoreNoR = new TStoreNoR();
		insertStoreNoR.setStoreNoId(insertStoreNo.getStoreNoId());
		insertStoreNoR.setTwlOutFlg_$0();
		tStoreNoRBhv.insert(insertStoreNoR);

		// 入庫Noキー
		StoreNoKey key = new StoreNoKey(insertStoreNo.getStoreLabelNo());
		storeNoInstances.put(key, insertStoreNo);

		return insertStoreNo;
	}

	/**
	 * <h2>新しい入庫ラベルNoで登録して返却</h2>
	 * @param supplierId 仕入先ID
	 * @param storeDt 入庫日
	 * @param oldStoreNoId 元入庫NoID
	 * @return 登録した入庫ラベルNo
	 */
	protected TStoreNo insertNewNumberingLabel(Long supplierId, String storeDt, Long oldStoreNoId) {

		// 入庫Noを登録して返す
		TStoreNo insertStoreNo = new TStoreNo();
		insertStoreNo.setStoreLabelNo(storeLabelNoNumberingLogic.numbering());
		insertStoreNo.setSupplierId(supplierId);
		insertStoreNo.setStoreDt(storeDt);
		insertStoreNo.setOldStoreNumId(oldStoreNoId);

		tStoreNoBhv.insert(insertStoreNo);

		// 入庫No.帳票登録
		TStoreNoR insertStoreNoR = new TStoreNoR();
		insertStoreNoR.setStoreNoId(insertStoreNo.getStoreNoId());
		insertStoreNoR.setTwlOutFlg_$0();
		tStoreNoRBhv.insert(insertStoreNoR);

		// 入庫Noキー
		StoreNoKey key = new StoreNoKey(insertStoreNo.getStoreLabelNo());
		storeNoInstances.put(key, insertStoreNo);

		return insertStoreNo;
	}

	/**
	 * <h2>入庫Noを上書き更新して返却</h2>
	 * @param storeNo 対象の入庫No
	 * @param storeLabelNo 入庫ラベルNo
	 * @param supplierId 仕入先ID
	 * @param storeDt 入庫日
	 * @param oldStoreNoId 元入庫NoID
	 * @return 更新した入庫No
	 */
	protected TStoreNo updateOverWrite(TStoreNo storeNo, Long supplierId, String storeDt) {

		// 入庫Noを更新して返す
		storeNo.setSupplierId(supplierId);
		storeNo.setStoreDt(storeDt);

		tStoreNoBhv.update(storeNo);

		// 入庫Noキー
		StoreNoKey key = new StoreNoKey(storeNo.getStoreLabelNo());
		storeNoInstances.put(key, storeNo);

		return storeNo;
	}
}
