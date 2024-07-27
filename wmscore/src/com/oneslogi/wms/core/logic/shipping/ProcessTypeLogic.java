package com.oneslogi.wms.core.logic.shipping;

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
	 * ユニークキーを条件にエンティティを返す。(キャッシュ使用)
	 * 検索条件がNULLの場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	MProcessType getUkEntityCacheable(MProcessType entity) {

		if (CU.isNullOrEmpty(entity.getProcessTypeCd())) {
			return null;
		}

		MProcessTypeCB cb = mProcessTypeBhv.newMyConditionBean();
		cb.query().setProcessTypeCd_Equal(entity.getProcessTypeCd());

		return selectEntityCacheable(mProcessTypeBhv, cb);
	}
}
