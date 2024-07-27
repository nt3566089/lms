package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロケーションマスタに対するロジッククラス。
 */
class LocationLogic extends AbstractWmsLogic {

	@Inject
	private MLocationBhv mLocationBhv;

	/**
	 * プライマリキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MLocation getPkEntityWithDeletedCheck(MLocation entity) {
		if (entity.getLocationId() == null) {
			return null;
		}
		return mLocationBhv.selectByPKValueWithDeletedCheck(entity.getLocationId());
	}

	/**
	 * <h2>プライマリキーを条件に倉庫マスタを結合したエンティティを返す。</h2>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return 検索結果エンティティ
	 */
	MLocation getPkEntityWithWarehouseAndDeletedCheck(MLocation entity) {

		if (entity.getLocationId() == null) {
			return null;
		}

		MLocationCB cb = mLocationBhv.newMyConditionBean();
		cb.setupSelect_MZone().withMWarehouse();
		cb.query().setLocationId_Equal(entity.getLocationId());

		return mLocationBhv.selectEntityWithDeletedCheck(cb);
	}
}
