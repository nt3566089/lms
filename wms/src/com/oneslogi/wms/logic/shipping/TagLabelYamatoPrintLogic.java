package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTagLabelYamatoPmb;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelYamato;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.TagLabelYamatoDto;

/**
 * 荷札ヤマト発行ロジッククラス
 */
public class TagLabelYamatoPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;


	/**
	 * <h2>荷札ヤマトの発行(全件).</h2>
	 * <pre>
	 * 荷札ヤマトNo.を発行する。
	 * 印刷後に荷札ヤマトNo.発行フラグを発行済に更新する。
	 * 既に発行済の荷札ヤマトも発行される。
	 *
	 * </pre>
	 *
	 * @param printParamDto 画面で印刷設定を行った印刷パラメータ
	 * @param centerId センタID
	 * @param stockIdSet 在庫IDセット
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @throws Exception 帳票発行(PrintLogic.print)の例外
	 */
	public List<TagLabelYamatoDto> printAll(PrintParamDto printParamDto, Long controlNo, ErrorStatus errSts) throws Exception {
		// 帳票出力データ取得処理
		List<TagLabelYamatoDto> dataList = new ArrayList<TagLabelYamatoDto>();

		//検索結果
		//荷札ヤマトデータ取得を行う
		List<SqlTagLabelYamato> resultSQL = null;

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlTagLabelYamato;

		// 検索条件の設定
		SqlTagLabelYamatoPmb pmb = new SqlTagLabelYamatoPmb();
		pmb.setControlNo(controlNo);

		// 検索実行
		Class<SqlTagLabelYamato> entityType = SqlTagLabelYamato.class;

		TagLabelYamatoDto redto = null;

		resultSQL = selectList(tShippingInstHBhv, path, pmb, entityType);

		for (SqlTagLabelYamato row : resultSQL) {
			redto = new TagLabelYamatoDto();
			//（配逹票）着店CD（バーコード）
			redto.setArrivalStoreCdBarCode(row.getArrivalStoreCd());
			if ("0".equals(row.getArrivalStoreCd().substring(0, 1))) {
				//（配逹票）着店CD
				redto.setArrivalStoreCd(row.getArrivalStoreCd().substring(1, 3) + "-" + row.getArrivalStoreCd().substring(3, 5) + "-" +  row.getArrivalStoreCd().substring(5, 7));
			}else {
				//（配逹票）着店CD
				redto.setArrivalStoreCd(row.getArrivalStoreCd().substring(0, 2) + "-" + row.getArrivalStoreCd().substring(2, 4) + "-" +  row.getArrivalStoreCd().substring(4, 6));
			}
			//（配逹票）お届け先：電話番号
			redto.setDelivTelNo(row.getDelivTelNo());
			//（配逹票）お届け先：郵便番号
			redto.setDelivZipCd(row.getDelivZipCd());
			//（配逹票）お届け先：住所
			redto.setDelivAddress(row.getDelivAddress());
			//（配逹票）お届け先：名称
			redto.setDelivCustomerNm(row.getDelivCustomerNm());
			//（配逹票）ご依頼主：電話番号
			redto.setSlipClientTelNo(row.getSlipClientTelNo());
			//（配逹票）ご依頼主：郵便番号
			redto.setSlipClientZipCd(row.getSlipClientZipCd());
			//（配逹票）ご依頼主：住所
			redto.setSlipClientAddress(row.getSlipClientAddress());
			//（配逹票）ご依頼主：名称
			redto.setSlipClientNm(row.getSlipClientNm());
			//（配逹票）お問い合わせ送り状番号
			redto.setCarrierTraceNum(row.getCarrierTraceNum());
			// 受付日
			if (!CU.isNullOrEmpty(row.getWorkDt())) {
				//（配逹票）受付日(年)
				redto.setWorkDtY(row.getWorkDt().substring(2, 4));
				//（配逹票）受付日(月)
				redto.setWorkDtM(row.getWorkDt().substring(4, 6));
				//（配逹票）受付日
				redto.setWorkDt(row.getWorkDt().substring(6, 8));
			}
			// 配逹希望日
			if (!CU.isNullOrEmpty(row.getDelivDt())) {
				//（配逹票）配逹希望日(月)
				redto.setDelivDtM(row.getDelivDt().substring(4, 6));
				//（配逹票）配逹希望日(日)
				redto.setDelivDt(row.getDelivDt().substring(6, 8));
			}
			//（配逹票）配逹希望時間帯
			redto.setDelivTz(row.getDelivTz());
			//（配逹票）品名
			redto.setSlipItemNm(row.getSlipItemNm());
			//（配逹票）箱番号
			redto.setBoxNo(row.getBoxNo() + "/" + row.getBoxNoSum());
			//（配逹票）記事
			redto.setArticle(row.getArticle());
			//（配逹票）荷材サイズCD
			redto.setBoxSizeCd(row.getBoxSizeCd());
			//（配逹票）発店CD
			redto.setSendCd(row.getSendCd());
			//（配逹票）荷揃番号
			redto.setNizoroeNo(row.getNizoroeNo());
			//（配逹票）問い合わせ番号
			redto.setTrackingNo(row.getTrackingNo());
			//（貼付票）お届け先：電話番号
			redto.setDelivTelNoH(row.getDelivTelNoH());
			//（貼付票）お届け先：郵便番号
			redto.setDelivZipCdH(row.getDelivZipCdH());
			//（貼付票）お届け先：住所
			redto.setDelivAddressH(row.getDelivAddressH());
			//（貼付票）お届け先：名称
			redto.setDelivCustomerNmH(row.getDelivCustomerNmH());
			//（貼付票）ご依頼主：電話番号
			redto.setSlipClientTelNoH(row.getSlipClientTelNoH());
			//（貼付票）ご依頼主：郵便番号
			redto.setSlipClientZipCdH(row.getSlipClientZipCdH());
			//（貼付票）ご依頼主：住所
			redto.setSlipClientAddressH(row.getSlipClientAddressH());
			//（貼付票）ご依頼主：名称
			redto.setSlipClientNmH(row.getSlipClientNmH());
			//（貼付票）お問い合わせ送り状番号
			redto.setCarrierTraceNumH(row.getCarrierTraceNumH());
			// 受付日
			if (!CU.isNullOrEmpty(row.getWorkDtH())) {
				//（配逹票）受付日(年)
				redto.setReceptDtYH(row.getWorkDtH().substring(2, 4));
				//（配逹票）受付日(月)
				redto.setReceptDtMH(row.getWorkDtH().substring(4, 6));
				//（配逹票）受付日
				redto.setReceptDtH(row.getWorkDtH().substring(6, 8));
			}
			// 配逹希望日
			if (!CU.isNullOrEmpty(row.getDelivDtH())) {
				//（配逹票）配逹希望日(月)
				redto.setDelivDtMH(row.getDelivDtH().substring(4, 6));
				//（配逹票）配逹希望日(日)
				redto.setDelivDtH(row.getDelivDtH().substring(6, 8));
			}
			//（貼付票）配逹希望時間帯
			redto.setDelivTzH(row.getDelivTzH());
			//（貼付票）品名
			redto.setSlipItemNmH(row.getSlipItemNmH());
			//（貼付票）記事
			redto.setArticleH(row.getArticleH());
			//（貼付票）発店CD
			redto.setSendCdH(row.getSendCdH());
			//（貼付票）問い合わせ番号
			redto.setTrackingNoH(row.getTrackingNoH());
			//（貼付票）箱番号
			redto.setBoxNoH(row.getBoxNoH() + "/" + row.getBoxNoHSum());

			dataList.add(redto);

		}

		// 荷札ヤマト発行用Dtoに変換
		List<TagLabelYamatoDto> reportDtoList = dataList;

		return reportDtoList;
	}

	/**
	 * <h2>荷札ヤマトの指示処理を行う。</h2>
	 * <pre>
	 * 引数チェックを行い、引数がNULLの場合、致命的例外をスローする。
	 * その後、下記処理を行う。
	 * ・荷札ヤマト登録
	 * </pre>
	 * @param controlNo：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateWithControlNo(Long controlNo, ErrorStatus errSts) {

		//更新処理
		TPickingR tPickingR = new TPickingR();
		tPickingR.setControlNo(null);
		// ===== 初期処理 =====
		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(controlNo);

		// ===== 更新実行 =====
		tPickingRBhv.queryUpdate(tPickingR, cb);

	}
}
