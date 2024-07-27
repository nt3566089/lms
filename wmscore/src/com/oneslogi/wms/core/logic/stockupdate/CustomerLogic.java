package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタに対するロジッククラス。
 */
class CustomerLogic extends AbstractWmsLogic {

	@Inject
	private MCustomerBhv mCustomerBhv;

	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MCustomer getPkEntityWithDeletedCheck(MCustomer entity) {
		if (entity.getCustomerId() == null) {
			return null;
		}
		return mCustomerBhv.selectByPKValueWithDeletedCheck(entity.getCustomerId());
	}
}
