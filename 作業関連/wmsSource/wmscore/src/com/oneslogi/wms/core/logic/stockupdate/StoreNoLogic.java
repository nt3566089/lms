package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入庫No.チェック処理ロジッククラス
 */
class StoreNoLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreNoBhv tStorenoBhv;

	/**
	 * <h2>ユニークキーを条件にエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 * <pre>
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	TStoreNo getUkEntity(TStoreNo entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * <h2>ユニークキーを条件にエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 * <pre>
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private TStoreNo getUkEntity(TStoreNo entity, ErrorStatus errSts) {
		TStoreNo resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsCoreMessageConst.WAREHOUSE_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	/**
	 * <h2>ユニークキーを条件にエンティティを返す。</h2>
	 * <pre>
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 * <pre>
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private TStoreNo getUkEntityWithDeletedCheck(TStoreNo entity) {
		if (CU.isNullOrEmpty(entity.getStoreLabelNo())) {
			return null;
		}

		TStoreNoCB cb = tStorenoBhv.newMyConditionBean();
		cb.query().setStoreLabelNo_Equal(entity.getStoreLabelNo());
		return tStorenoBhv.selectEntityWithDeletedCheck(cb);
	}

}