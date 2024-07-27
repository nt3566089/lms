package com.oneslogi.wms.core.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 取引先マスタに対するロジッククラス。
 */
class CustomerLogic extends AbstractWmsLogic {

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * センタを取得(キャッシュ使用)
	 * 引数の取引先ID、荷主IDを使用しセンタマスタを検索し返却する
	 *
	 * @param entity 取引先マスタ(取引先ID、荷主ID)
	 * @return 取引先のセンタ
	 */
	MCenter getCenterCacheable(MCustomer entity) {

		return getCenter(entity, true);
	}

	/**
	 * センタを取得
	 * 引数の取引先ID、荷主IDを使用しセンタマスタを検索し返却する
	 *
	 * @param entity 取引先マスタ(取引先ID、荷主ID)
	 * @param cacheable キャッシュ使用有無
	 * @return 取引先のセンタ
	 */
	private MCenter getCenter(MCustomer entity, boolean cacheable) {

		Long customerId = entity.getCustomerId();
		if (customerId == null) {
			return null;
		}

		Long clientId = entity.getClientId();
		if (clientId == null) {
			return null;
		}

		// 削除フラグ停止前の状態を保存
		boolean backupAutoDelFlg = this.getBehaviorAutoDelFlg();

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.checkInvalidQuery();
		cb.query().setClientId_Equal(clientId);
		cb.query().setCustomerId_Equal(customerId);

		MClientCenter clientCenter = null;
		if (cacheable) {

			clientCenter = selectEntityCacheable(mClientCenterBhv, cb);
		} else {

			clientCenter = mClientCenterBhv.selectEntity(cb);
		}

		// 削除フラグの条件付加を復元
		this.setBehaviorAutoDelFlg(backupAutoDelFlg);

		if (clientCenter == null) {
			return null;
		}

		return clientCenter.getMCenter();
	}
}
