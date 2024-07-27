package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTagLabelCommonPmb;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelCommon;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.TagLabelCommonDto;

/**
 * 汎用荷札発行ロジック
 */
public class TagLabelCommonPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;


	/**
	 * <h2>汎用荷札の発行(全件).</h2>
	 * <pre>
	 * 汎用荷札No.を発行する。
	 * 印刷後に汎用荷札No.発行フラグを発行済に更新する。
	 * 既に発行済の汎用荷札も発行される。
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
	public List<TagLabelCommonDto> printAll(PrintParamDto printParamDto, Long controlNo, ErrorStatus errSts) throws Exception {
		// 帳票出力データ取得処理
		List<TagLabelCommonDto> dataList = new ArrayList<TagLabelCommonDto>();

		//検索結果
		//荷札ヤマトデータ取得を行う
		List<SqlTagLabelCommon> resultSQL = null;

		// 外出しSQLの定義
		String path = TAllocInstHBhv.PATH_selectSqlTagLabelCommon;

		// 検索条件の設定
		SqlTagLabelCommonPmb pmb = new SqlTagLabelCommonPmb();
		pmb.setControlNo(controlNo);

		// 検索実行
		Class<SqlTagLabelCommon> entityType = SqlTagLabelCommon.class;

		TagLabelCommonDto redto = null;

		resultSQL = selectList(tAllocInstHBhv, path, pmb, entityType);

		for (SqlTagLabelCommon row : resultSQL) {
			redto = new TagLabelCommonDto();
			//（荷札）運送便名称
			redto.setDeliveryCourseNm(row.getDeliveryCourseNm());
			//（荷札）着店CD（バーコード）
			redto.setArrivalStoreCdBarCode(row.getArrivalStoreCd());
			//（荷札）着店CD1
			int index = row.getArrivalStoreCd().indexOf("-");
			redto.setArrivalStoreCd1(row.getArrivalStoreCd().substring(0, index));
			//（荷札）着店CD2
			redto.setArrivalStoreCd2(row.getArrivalStoreCd().substring(index + 1, row.getArrivalStoreCd().length()));
			//（荷札）問合せ番号（バーコード）
			redto.setTrackingNoBarCode(row.getTrackingNo());
			//（荷札）問合せ番号
			redto.setTrackingNo(row.getTrackingNo());
			//（荷札）住所
			redto.setSlipClientAddress(row.getSlipClientAddress());
			//（荷札）名称
			redto.setSlipClientNm(row.getSlipClientNm());
			//（荷札）電話番号
			redto.setSlipClientTelNo(row.getSlipClientTelNo());
			//（荷札）問合せ部門
			redto.setSalesOrgCd(row.getSalesOrgCd());
			//（荷札）問合せ部門電話番号
			redto.setSalesOrgTel(row.getSalesOrgTel());
			//（荷札）出荷日2
			if (!CU.isNullOrEmpty(row.getWorkDt())) {
				redto.setWorkDt(row.getWorkDt().substring(0, 4) + "." + row.getWorkDt().substring(4, 6) + "." + row.getWorkDt().substring(6, 8));
			}
			//（荷札）お届け先：住所
			redto.setDelivAddress(row.getDelivAddress());
			//（荷札）お届け先：名称
			redto.setDelivCustomerNm(row.getDelivCustomerNm());
			if (!CU.isNullOrEmpty(row.getShippingTypeCd()) && "03".equals(row.getShippingTypeCd())) {
				//（荷札）発注区分
				redto.setShippingTypeCd(row.getShippingTypeCd());
				//（荷札）部門
				redto.setDepartment(row.getDepartment());
			}
			//（荷札）お届け先：電話番号
			redto.setDelivTelNo(row.getDelivTelNo());
			//（荷札）摘要
			redto.setInvoiceSummary(row.getInvoiceSummary());
			//（荷札）荷揃番号（バーコード）
			redto.setNizoroeNoBarCode(row.getTsihNizoroeNo());
			//（荷札）箱番号
			if (!CU.isNullOrEmpty(row.getBoxNo())) {
				redto.setBoxNo(row.getBoxNo() + "/" + row.getBoxNoSum());
			}
			//（荷札）荷揃番号
			redto.setNizoroeNo(row.getTpihNizoroeNo());
			//（荷札）指定配達日2
			if (!CU.isNullOrEmpty(row.getDelivDt())) {
				redto.setDelivDt(row.getDelivDt().substring(2, 4) + "." + row.getDelivDt().substring(4, 6) + "." + row.getDelivDt().substring(6, 8));
			}
			//（荷札）配達時間2
			redto.setDelivTz(row.getDelivTz());
			//（荷札）金額2
			BigDecimal codeFree = new BigDecimal(CU.nullToZero(row.getCodFee()));
			redto.setCodFee(codeFree);
			//（荷札）ソータ用番号（バーコード）
			redto.setSorterNoBarCode("25240300" + row.getLaneCd() + "5");
			//（荷札）ソータ用番号
			redto.setSorterNo("25240300" + row.getLaneCd() + "5");
			//（荷札）再発行マーク
			redto.setTagOutFlg(row.getTagOutFlg());

			dataList.add(redto);

		}

		// 荷札ヤマト発行用Dtoに変換
		List<TagLabelCommonDto> reportDtoList = dataList;

		return reportDtoList;
	}

	/**
	 * <h2>汎用荷札の指示処理を行う。</h2>
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
