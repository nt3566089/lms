package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主センタマスタに対するロジッククラス。
 */
class ClientCenterLogic extends AbstractWmsLogic {

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MClientCenter getUkEntityWithDeletedCheck(MClientCenter entity) {

		MClientCenterCB cb = newUkCb(entity);
		if (cb == null) {
			return null;
		}
		return mClientCenterBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。(キャッシュ使用)
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MClientCenter getUkEntityCacheable(MClientCenter entity) {

		return getUkEntityCacheable(entity, null);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。(キャッシュ使用)
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private MClientCenter getUkEntityCacheable(MClientCenter entity, ErrorStatus errSts) {

		return getUkEntity(entity, errSts, true);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private MClientCenter getUkEntity(MClientCenter entity, ErrorStatus errSts, boolean cacheable) {

		MClientCenterCB cb = newUkCb(entity);
		if (cb == null) {
			return null;
		}

		MClientCenter clientCenter;
		if (cacheable) {
			clientCenter = selectEntityCacheable(mClientCenterBhv, cb);
		} else {
			clientCenter = mClientCenterBhv.selectEntity(cb);
		}

		if (clientCenter == null) {
			// 検索対象なし
			this.getErrorManager().add(errSts, WmsCoreMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
		}

		return clientCenter;

	}

	/**
	 * ユニークキー条件の作成
	 * @param entity
	 * @return
	 */
	private MClientCenterCB newUkCb(MClientCenter entity) {
		if (entity.getClientId() == null) {
			return null;
		}
		if (entity.getCenterId() == null) {
			return null;
		}

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		cb.setupSelect_MParamAsOne();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setCenterId_Equal(entity.getCenterId());

		return cb;
	}
}
