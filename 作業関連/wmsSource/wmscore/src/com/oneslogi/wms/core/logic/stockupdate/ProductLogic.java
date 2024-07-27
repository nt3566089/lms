package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 商品マスタに対するロジッククラス。
 */
class ProductLogic extends AbstractWmsLogic {

	@Inject
	private MProductBhv mProductBhv;

	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MProduct getPkEntityWithDeletedCheck(MProduct entity) {
		if (entity.getProductId() == null) {
			return null;
		}
		return mProductBhv.selectByPKValueWithDeletedCheck(entity.getProductId());
	}
}
