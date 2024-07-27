package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷材マスタメンテナンス取得ロジッククラス。
 */
public class BoxMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MBoxBhv mBoxBhv;

	/**
	 * <h2>荷材マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに、件数をチェックし、荷材マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mBox 荷材マスタ：センタID・荷材CD・荷材名称・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MBox> 荷材グループマスタリスト
	 */
	public List<MBox> select(MBox mBox, ErrorStatus errSts) {

		List<MBox> result = null;

		// ===== 荷材マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MBoxCB cb = mBoxBhv.newMyConditionBean();
		//荷主センタ変更対応 201７.01.18 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.01.18 sja End
		// センタIDの設定
		cb.query().setCenterId_Equal(mBox.getCenterId());
		// 荷材CDの設定
		cb.query().setBoxCd_PrefixSearch(mBox.getBoxCd());
		// 荷材名称の設定
		cb.query().setBoxNm_LikeSearch(mBox.getBoxNm(), new LikeSearchOption().likeContain());
		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mBox.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_BoxCd_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 荷材マスタ検索実行 =====
		result = selectList(mBoxBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}