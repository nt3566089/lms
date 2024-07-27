package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 処理区分マスタに対するロジッククラス。
 */
class ProcessTypeLogic extends AbstractWmsLogic {

	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MProcessType getUkEntityWithDeletedCheck(MProcessType entity) {

		if (CU.isNullOrEmpty(entity.getProcessTypeCd())) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());

		return mProcessTypeBhv.selectEntityWithDeletedCheck(cb);
	}
}
