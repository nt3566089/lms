package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.ShippingSlipType;
import com.oneslogi.base.dbflute.dto.customize.SqlPickingListPrintDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlPickingListPrintDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.CasePickingListDto;
import com.oneslogi.wms.dto.report.IndividualCasePickingListDto;
import com.oneslogi.wms.dto.report.IndividualPieceTotalPickingListDto;
import com.oneslogi.wms.dto.report.PieceNizoroeListIdManagDto;
import com.oneslogi.wms.dto.report.PiecePickingListDto;
import com.oneslogi.wms.dto.report.PieceTotalPickingListDto;
import com.oneslogi.wms.dto.report.TagLabelCommonDto;
import com.oneslogi.wms.dto.report.TagLabelYamatoDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintParamDto;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.TagLabelCommonPrintLogic;
import com.oneslogi.wms.logic.shipping.TagLabelYamatoPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * ピッキングリスト発行画面のリソースクラス。
 */
@Path("/shipping/pickingListPrint")
public class PickingListPrintResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/** バラ荷揃表 */
	private static final String REPORT_CD_PIECE = "PiecePickingList";
	/** バラ荷揃表(個体管理用) */
	private static final String REPORT_CD_PIECE_MANAG = "PieceNizoroeListIdManag";
	/** 直送店送納品書 */
	private static final String REPORT_CD_SLIP_DOS = "DirectOrStoreDeliverySlipList";
	/** 納品明細書(個体管理) */
	private static final String REPORT_CD_SLIP_MANAG = "DeliverySlipListIdManag";
	/** EC納品書 */
	private static final String REPORT_CD_SLIP_EC = "EcDeliverySlipList";
	/** 物品送付案内書 */
	private static final String REPORT_CD_GUIDE = "GoodsSendingGuide";
	/** 汎用荷札 */
	private static final String REPORT_CD_TAG_COMMON = "TagLabelCommon";
	/** 荷札ヤマト */
	private static final String REPORT_CD_TAG_YMT = "TagLabelYamato";
	/** 荷札JP */
	private static final String REPORT_CD_TAG_JP = "TagLabelJp";

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 2;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int PICKING_DATA_SELECT_FAILED = 3;
		/**
		 * レポートID取得異常
		 */
		protected static final int GET_REPORT_CD_FAILED = 4;
		/**
		 * 帳票発行データ取得異常
		 */
		protected static final int GET_PRINT_DATA_LIST_FAILED = 5;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private PickingListPrintSelectLogic selectLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private TagLabelCommonPrintLogic tagLabelCommonPrintLogic;
	@Inject
	private TagLabelYamatoPrintLogic tagLabelYamatoPrintLogic;

	/**
	 * <h2>初期処理(通常)。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PickingListPrintDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/initNormal")
	public PickingListPrintDto initNormal() {

		// 画面用DTO作成
		PickingListPrintDto pickingListPrintDto = new PickingListPrintDto();

		return pickingListPrintDto;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * ・データベースにピッキングリスト発行データを取得する
	 * </pre>
	 * @param pickingListPrintDto ピッキングリスト発行画面用DTO
	 * @return PickingListPrintDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/search")
	public PickingListPrintDto search(PickingListPrintDto pickingListPrintDto) {

		PickingListPrintDto resultPickingListPrintDto = new PickingListPrintDto();

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(pickingListPrintDto.data.head);

		// ピッキングリスト発行データ取得
		List<SqlPickingListPrint> selectEntity = selectLogic.select(tPickingH, pickingListPrintDto.paging,
				errRetSts(StatusCode.PICKING_DATA_SELECT_FAILED));

		//エラーが存在する場合
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		SqlPickingListPrintDtoMapper mapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrintDto> list = mapper.mappingToDtoList(selectEntity);

		//検索結果詰め替え処理
		resultPickingListPrintDto.paging = pickingListPrintDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		resultPickingListPrintDto.data.list = list;

		return resultPickingListPrintDto;
	}

	/**
	 * <h2>ピッキングリスト発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、出庫帳票データを取得する。
	 * 帳票を発行する。
	 * エラーがない場合は、データベースに出庫帳票データを更新する
	 *
	 * ・オーダーピッキングリスト出力フラグ
	 * ・トータルピッキングリスト出力フラグ
	 * ・摘み取りピッキングリスト出力フラグ
	 * ・種蒔きピッキングリスト出力フラグ
	 * </pre>
	 * @param pickingListPrintDto ピッキングリスト発行画面用DTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
//
	@GET
	@Path("/print")
	public PickingListPrintParamDto print(final PickingListPrintParamDto pickingListPrintDto) throws Exception {

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo更新 =====

		// ヘッダ部Entity変換
		TPickingHDtoMapper mapper = new TPickingHDtoMapper();
		TPickingH head = mapper.mappingToEntity(pickingListPrintDto.data.head);

		// 明細部Entity変換
		SqlPickingListPrintDtoMapper bodyMapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> bodyList = bodyMapper.mappingToEntityList(pickingListPrintDto.data.list);


		//コントロールNo更新
		TPickingR tPickingRUpdate = new TPickingR(); //出庫帳票(更新用)
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>(); //出庫ヘッダリスト
		TPickingR tPickingRSearch = new TPickingR(); //出庫帳票(検索用)

		// エンティティ編集
		// 出庫帳票(更新用)
		tPickingRUpdate.setControlNo(controlNo);

		for (SqlPickingListPrint body : bodyList) {
			TPickingH pickingH = new TPickingH();
			// 荷揃番号_ハイフンあり
			pickingH.setNizoroeNo2(body.getNizoroeNo2());

			tPickingHList.add(pickingH);
		}

		// 出庫帳票(検索用)
		tPickingRSearch.setControlNo(controlNo);

		// 発行データ取得.コントロールNo更新メソッドを呼出し
		selectLogic.updateControlNo(head, tPickingHList, tPickingRUpdate, pickingListPrintDto.printBasicData.reportId, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

		JSON json = new JSON();
		json.setSuppressNull(true);

		ShippingSlipType shippingSlipType = CDef.ShippingSlipType.codeOf(head.getShippingSlipType());

		switch (shippingSlipType) {
		case $01: // 発行区分で[01：バラ荷揃表]が選択された場合
			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_PIECE))) {
				List<PiecePickingListDto> dataList = selectLogic.getPieceNizoroeDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
				pickingListPrintDto.printBasicData.outputData = json.format(dataList);
			}

			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_PIECE_MANAG))) {
				List<PieceNizoroeListIdManagDto> dataList = selectLogic.getPieceNizoroeIdManagDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
				pickingListPrintDto.printBasicData.outputData = json.format(dataList);
			}

			break;
		case $02: // 発行区分で[02：ケース荷揃表]が選択された場合
			List<CasePickingListDto> casePickingDataList = selectLogic.getCasePickingDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
			pickingListPrintDto.printBasicData.outputData = json.format(casePickingDataList);

			break;
		case $03: // 発行区分で[03：バラトータル荷揃表(戸配)]が選択された場合
			List<IndividualPieceTotalPickingListDto> indivdualPieceTotalPickingDataList = selectLogic.getIndivdualPieceTotalPickingDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
			pickingListPrintDto.printBasicData.outputData = json.format(indivdualPieceTotalPickingDataList);

			break;
		case $04: // 発行区分で[04：ケース荷揃表(戸配)]が選択された場合
			List<IndividualCasePickingListDto> individualCasePickingDataList = selectLogic.getIndividualCasePickingDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
			pickingListPrintDto.printBasicData.outputData = json.format(individualCasePickingDataList);

			break;
		case $05: // 発行区分で[05：バラトータル荷揃表]が選択された場合
			List<PieceTotalPickingListDto> pieceTotalPickingDataList = selectLogic.getPieceTotalPickingDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
			pickingListPrintDto.printBasicData.outputData = json.format(pieceTotalPickingDataList);

			break;
		case $06: // 発行区分で[06：摘み取りリスト]が選択された場合
			List<TPickingH> plDataList = selectLogic.getPLDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

			// TODO:DTOセット処理

			break;
		case $07: // 発行区分で[07：納品書]が選択された場合
			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_SLIP_DOS))) {
				// 直送店送納品書
				List<TPickingH> dataList = selectLogic.getDirectOrStoreDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

				// TODO:DTOセット処理
			}

			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_SLIP_MANAG))) {
				// 納品明細書(個体管理)
				List<TShippingInstH> dataList = selectLogic.getIdManagDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

				// TODO:DTOセット処理
			}

			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_SLIP_EC))) {
				// EC納品書
				List<TPickingH> dataList = selectLogic.getECDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

				// TODO:DTOセット処理
			}

			if (pickingListPrintDto.printBasicData.reportId.equals(reportLogic.getReportId(REPORT_CD_GUIDE))) {
				// 物品送付案内書
				List<TPickingH> dataList = selectLogic.getGoodsSendingDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

				// TODO:DTOセット処理
			}
			break;
		case $08: // 発行区分で[08：荷札]が選択された場合
			Long reportId = pickingListPrintDto.printBasicData.reportId;

			if (reportId.equals(reportLogic.getReportId(REPORT_CD_TAG_COMMON))) {
				// 汎用荷札
				List<TagLabelCommonDto> dataList = tagLabelCommonPrintLogic.printAll(pickingListPrintDto, controlNo, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
				pickingListPrintDto.printBasicData.outputData = json.format(dataList);
			}

			if (reportId.equals(reportLogic.getReportId(REPORT_CD_TAG_YMT))) {
				// 荷札ヤマト
				List<TagLabelYamatoDto> dataList = tagLabelYamatoPrintLogic.printAll(pickingListPrintDto, controlNo, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));
				pickingListPrintDto.printBasicData.outputData = json.format(dataList);
			}

			if (reportId.equals(reportLogic.getReportId(REPORT_CD_TAG_JP))) {
				// 荷札JP
				List<TShippingInstH> dataList = selectLogic.getTagLabelJpDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

				// TODO:DTOセット処理
			}

			break;
		case $09: // 発行区分で[09：一体型伝票(荷札、納品書)]が選択された場合
			// 戸配_一体型伝票(荷札、納品書)
			Map<String, Map<String, Map<String, List<?>>>> result = selectLogic.getAllInOneDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

			// TODO:DTOセット処理

			break;
		case $10: // 発行区分で[10：梱包明細]が選択された場合
			List<TPickingH> packingDataList = selectLogic.getPackingListLabelDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

			// TODO:DTOセット処理

			break;
		case $11: // 発行区分で[11：個別貼り付けラベル]が選択された場合
			List<TShippingInstH> indvLabelDataList = selectLogic.getIndvLabelDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

			// TODO:DTOセット処理

			break;
		case $12: // 発行区分で[12：個人別支給明細]が選択された場合
			List<TShippingInstH> indvSupplyDetailDataList = selectLogic.getIndvSupplyDetailDataList(tPickingRSearch, errRetSts(StatusCode.GET_PRINT_DATA_LIST_FAILED));

			// TODO:DTOセット処理

			break;
		default:
			getErrorManager().throwException(new IllegalStateException("ShippingSlipType is illegal."));
			break;
		}

		printLogic.print(pickingListPrintDto);

		// 帳票出力済フラグ、日時更新
		selectLogic.updateOutFlg(head, tPickingRSearch.getControlNo());

		// コントロールNoクリア
		selectLogic.clearControlNo(tPickingRSearch.getControlNo());

		// 完了メッセージ表示
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return pickingListPrintDto;
	}

	/**
	 * <h2>レポートIDを取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @param pickingListPrintDto レポートDTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
	@GET
	@Path("/getReportId")
	public PickingListPrintParamDto getReportId(final PickingListPrintParamDto pickingListPrintDto) {

		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		TPickingH tPickingH = headerMapper.mappingToEntity(pickingListPrintDto.data.head);

		// 明細部Entity変換
		SqlPickingListPrintDtoMapper mapper = new SqlPickingListPrintDtoMapper();
		List<SqlPickingListPrint> list = mapper.mappingToEntityList(pickingListPrintDto.data.list);

		// ===== コントロールNo.採番 =====

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo更新
		TPickingR tPickingRUpdate = new TPickingR(); //出庫帳票(更新用)
		List<TPickingH> tPickingHList = new ArrayList<TPickingH>(); //出庫ヘッダリスト
		TPickingR tPickingRSearch = new TPickingR(); //出庫帳票(検索用)

		// エンティティ編集
		// 出庫帳票(更新用)
		tPickingRUpdate.setControlNo(controlNo);

		for (SqlPickingListPrint body : list) {
			TPickingH pickingH = new TPickingH();
			// 荷揃番号_ハイフンあり
			pickingH.setNizoroeNo2(body.getNizoroeNo2());

			tPickingHList.add(pickingH);
		}

		// 出庫帳票(検索用)
		tPickingRSearch.setControlNo(controlNo);

		// 発行データ取得.コントロールNo更新メソッドを呼出し
		selectLogic.updateControlNo(tPickingH, tPickingHList, tPickingRUpdate, null, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));

		if( 0 < getErrorManager().size() ) {
			return null;
		}

		// ===== 対象データの取得 =====
		List<String> listReportCd = selectLogic.getReportCdList(tPickingH, tPickingRSearch, errRetSts(StatusCode.GET_REPORT_CD_FAILED));

		// 発行帳票を指定
		PickingListPrintParamDto pickingPrintDto = new PickingListPrintParamDto();
		Long reportId = null;
		pickingPrintDto.data.listReportId.clear();

		for (String reportCd : listReportCd) {
			reportId = reportLogic.getReportId(reportCd);
			pickingPrintDto.data.listReportId.add(reportId);
		}

		pickingPrintDto.data.listReportId = pickingPrintDto.data.listReportId.stream().distinct().collect(Collectors.toList());

		// コントロールNoクリアメソッドを呼出し
		selectLogic.clearControlNo(tPickingRSearch.getControlNo());

		return pickingPrintDto;
	}
}
