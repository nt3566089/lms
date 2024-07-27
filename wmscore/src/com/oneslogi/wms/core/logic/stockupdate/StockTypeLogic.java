package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫区分マスタチェック処理ロジッククラス
 */
class StockTypeLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	/**
	 * <h2>プライマリキーを条件にエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * 下記テーブルのデータを取得する。
	 * ・在庫区分マスタ
	 *
	 * 【パラメータの使用項目】
	 *  在庫区分マスタ
	 *  ・在庫区分ID
	 * </pre>
	 * @param mStockType 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MStockType getPkEntityWithDeletedCheck(MStockType mStockType) {
		if (mStockType.getStockTypeId() == null) {
			return null;
		}
		return mStockTypeBhv.selectByPKValueWithDeletedCheck(mStockType.getStockTypeId());
	}

}