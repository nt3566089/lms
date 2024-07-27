/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.util.List;

import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
/**
 * 梱包明細修正データチェックロジッククラス
 */
public class PackingUpdateCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	
	/**
	 * <h2>梱包明細修正のチェックを行う。</h2>
	 * <pre>
	 * 梱包明細修正時、出庫ヘッダのチェックを行う。
	 * 出庫ヘッダ.出庫ステータスが"50"(検品済)以外の場合、梱包明細修正は不可とする。
	 * エラーメッセージをエラー管理クラスに登録する。
	 * </pre>
	 * @param pickHeaderList 出庫ヘッダリスト：出庫ステータス
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkPickingStatus(List<TPickingH> pickHeaderList, ErrorStatus errSts) {
		// ===== pickHeaderListのデータ件数分繰返 =====
		for (TPickingH head : pickHeaderList) {
			if (head.isPickingStatus$55()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIPPING_CONFIRM_ERROR);
			} else if(head.isPickingStatus$30() || head.isPickingStatus$40() || head.isPickingStatus$45()) {
				this.getErrorManager().add(errSts, WmsMessageConst.WORKING_PACKING_ERROR);
			}
		}
	}

}

