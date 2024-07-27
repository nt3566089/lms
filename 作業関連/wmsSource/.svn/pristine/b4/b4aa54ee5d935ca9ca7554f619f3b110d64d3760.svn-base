package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.TLotCB;
import com.oneslogi.base.dbflute.exbhv.TLotBhv;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ロットテーブルに対するロジッククラス。
 */
class LotLogic extends AbstractWmsLogic {

	@Inject
	private TLotBhv tLotBhv;

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 必須項目の検索条件がNULLの場合、NULLを返す。
	 * 必須項目以外の検索条件がNULLの場合は検索条件に追加する。（WHERE 項目 = null)
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private TLot getUkEntityWithDeletedCheck(TLot entity) {

		if (entity.getProductId() == null) {
			return null;
		}

		TLotCB cb = tLotBhv.newMyConditionBean();
		cb.query().setProductId_Equal(entity.getProductId());
		if (CU.isNullOrEmpty(entity.getLot())) {
			cb.query().setLot_IsNullOrEmpty();
		} else {
			cb.query().setLot_Equal(entity.getLot());
		}
		if (CU.isNullOrEmpty(entity.getLimitDt())) {
			cb.query().setLimitDt_IsNullOrEmpty();
		} else {
			cb.query().setLimitDt_Equal(entity.getLimitDt());
		}

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
		// 製造日
		if (CU.isNullOrEmpty(entity.getProdDt())) {
			cb.query().setProdDt_IsNullOrEmpty();
		} else {
			cb.query().setProdDt_Equal(entity.getProdDt());
		}
		// 入荷日
		if (CU.isNullOrEmpty(entity.getReceiveDt())) {
			cb.query().setReceiveDt_IsNullOrEmpty();
		} else {
			cb.query().setReceiveDt_Equal(entity.getReceiveDt());
		}
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

		return tLotBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 必須項目の検索条件がNULLの場合、NULLを返す。
	 * 必須項目以外の検索条件がNULLの場合は検索条件に追加する。（WHERE 項目 = null)
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	TLot getUkEntity(TLot entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * ※※※ 必要であればメッセージ定義後に本メソッドを public に変更すること
	 *
	 * ユニークキーを条件にエンティティを返す。
	 * 必須項目の検索条件がNULLの場合、NULLを返す。
	 * 必須項目以外の検索条件がNULLの場合は検索条件に追加する。（WHERE 項目 = null)
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	private TLot getUkEntity(TLot entity, ErrorStatus errSts) {
		TLot resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsCoreMessageConst.LOT_NOT_FOUND_IN_LOT_MASTER_ERROR);
		}
		return resultEntity;
	}
}
