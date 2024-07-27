package com.oneslogi.wms.core.logic.shipping;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * パラメータマスタに対するロジッククラス。
 */
class ParamLogic extends AbstractWmsLogic {

	@Inject
	private MParamBhv bhv;

	// レスポンス対策 2016.01.22 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// レスポンス対策 2016.01.22 kawana End

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MParam getUkEntityWithDeletedCheck(MClientCenter entity) {
		if (entity.getClientId() == null) {
			return null;
		}
		if (entity.getCenterId() == null) {
			return null;
		}

		MParamCB cb = bhv.newMyConditionBean();
		cb.query().queryMClientCenter().setClientId_Equal(entity.getClientId());
		cb.query().queryMClientCenter().setCenterId_Equal(entity.getCenterId());

		return bhv.selectEntityWithDeletedCheck(cb);
	}

	// レスポンス対策 2016.01.22 kawana Start
	MParam getUkEntityUseCash(MClientCenter entity) {

		MClientCenter clientCenter = clientCenterLogic.getUkEntityCacheable(entity);
		if (clientCenter == null) {
			return null;
		}

		return clientCenter.getMParamAsOne();
	}
	// レスポンス対策 2016.01.22 kawana End
}