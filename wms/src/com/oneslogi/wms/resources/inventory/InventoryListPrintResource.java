package com.oneslogi.wms.resources.inventory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.PriceDiffHidden;
import com.oneslogi.base.dbflute.dtomapper.TInventoryBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TInventoryHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryReceiveLabel;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.inventory.InventoryListPrintDto;
import com.oneslogi.wms.dto.report.InventoryListDto;
import com.oneslogi.wms.dto.report.InventoryListProductDto;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.inventory.InventoryListPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * 棚卸関連リスト発行に必要な各種情報を取得するクラス。
 */
@Path("/inventory/inventoryListPrint")
public class InventoryListPrintResource extends AbstractWmsResource {

	//01:棚卸在庫差異表
	private static final String REPORT_CD_01 = "InventoryStockDiffList";
	//02:在庫差異確認表
	private static final String REPORT_CD_02 = "StockDiffList";
	//03:商品別棚卸実績表兼差異表
	private static final String REPORT_CD_03 = "ProductInventoryDiffList";
	//04:商品別棚卸実績表(LOC表示あり)
	private static final String REPORT_CD_04 = "ProductInventoryListLoc";

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
		 * 01:棚卸在庫差異表発行データ取得異常
		 */
		protected static final int REPORTCD1_ERROR = 2;
		/**
		 * 02:在庫差異確認表発行データ取得異常
		 */
		protected static final int REPORTCD2_ERROR = 3;
		/**
		 * 03:商品別棚卸実績表兼差異表発行データ取得異常
		 */
		protected static final int REPORTCD3_ERROR = 4;
		/**
		 * 04:商品別棚卸実績表(LOC表示あり)発行データ取得異常
		 */
		protected static final int REPORTCD4_ERROR = 5;
	}

	@Inject
	private ReportLogic reportLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private PrintLogic printLogic;
	@Inject
	private InventoryListPrintLogic inventoryListPrintLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return InventoryListPrintDto 棚卸作業リスト画面用DTO
	 */
	@GET
	@Path("/init")
	public InventoryListPrintDto init(@QueryParam("inventoryPrintType") String inventoryPrintType) {
		InventoryListPrintDto dto = new InventoryListPrintDto();

		// 発行帳票を指定
		if(inventoryPrintType != null && !inventoryPrintType.isEmpty()) {
			switch(inventoryPrintType) {
				case "01":
					dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_01);
					break;
				case "02":
					dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_02);
					break;
				case "03":
					dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_03);
					break;
				case "04":
					dto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_04);
					break;
				default:
			}
		}
		return dto;
	}

	/**
	 * <h2>棚卸作業リスト発行。</h2>
	 * <pre>
	 * ・コントロールNo.を更新してから、棚卸作業リストデータを取得する
	 * ・帳票を発行する
	 * ・エラーがない場合は、データベースに棚卸帳票データを更新する
	 * ・・棚卸作業リスト出力フラグ
	 * </pre>
	 * @param InventoryListPrintDto 棚卸作業リスト画面用DTO
	 * @return InventoryListPrintDto 棚卸作業リスト画面用DTO
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public InventoryListPrintDto print(final InventoryListPrintDto inventoryListPrintDto) throws Exception {

		// 棚卸ヘッダ
		TInventoryHDtoMapper headerMapper = new TInventoryHDtoMapper();
		TInventoryH head = headerMapper.mappingToEntity(inventoryListPrintDto.data.head);
		// 棚卸ボディ
		TInventoryBDtoMapper bodyMapper = new TInventoryBDtoMapper();
		TInventoryB body = bodyMapper.mappingToEntity(inventoryListPrintDto.data.body);
		
		// 棚卸ヘッダR
		TInventoryHDtoMapper headerRMapper = new TInventoryHDtoMapper();
		TInventoryH headR = headerRMapper.mappingToEntity(inventoryListPrintDto.data.headR);
		// 棚卸ボディR
		TInventoryBDtoMapper bodyRMapper = new TInventoryBDtoMapper();
		TInventoryB bodyR = bodyRMapper.mappingToEntity(inventoryListPrintDto.data.bodyR);
		
		//帳票データの初期化
		List<TInventoryB> entityDataList = new ArrayList<TInventoryB>();
		
		//棚卸帳票発行区分取得
		String inventoryPrintType = head.getInventoryPrintType();
		//棚卸帳票発行区分取得R
		String inventoryPrintTypeR = headR.getInventoryPrintType();
		
		//差異リスト出力プリントの場合
		if(inventoryPrintType == null || inventoryPrintType.isEmpty()) {
			inventoryPrintType = inventoryPrintTypeR;
		}
		//コントロールNo.を採番する
		Long controlNo = numberingCenterLogic.getControlNo();
		List<InventoryListDto> reportData = new ArrayList<InventoryListDto>();
		List<InventoryListProductDto> reportProductData = new ArrayList<InventoryListProductDto>();
		//棚卸在庫差異データ取得
		if (CDef.InventoryListType.$01.code().equals(inventoryPrintType))  {
			entityDataList = inventoryListPrintLogic.getReportData01(head, body, new ErrorStatus(StatusCode.REPORTCD1_ERROR));
			// 結果判定
			if (getErrorManager().size() > 0) {
				return null;
			}
			inventoryListPrintLogic.updateControlNo1_2_3_4(entityDataList, controlNo, new ErrorStatus(StatusCode.REPORTCD1_ERROR));
		//在庫差異確認データ取得
		}else if (CDef.InventoryListType.$02.code().equals(inventoryPrintType)) {
			entityDataList = inventoryListPrintLogic.getReportData02(head, body, new ErrorStatus(StatusCode.REPORTCD2_ERROR));
			// 結果判定
			if (getErrorManager().size() > 0) {
				return null;
			}
			inventoryListPrintLogic.updateControlNo1_2_3_4(entityDataList, controlNo, new ErrorStatus(StatusCode.REPORTCD2_ERROR));
		//商品別棚卸実績兼差異データ取得
		}else if (CDef.InventoryListType.$03.code().equals(inventoryPrintType)) {
			entityDataList = inventoryListPrintLogic.getReportData03(headR, bodyR, new ErrorStatus(StatusCode.REPORTCD3_ERROR));
			// 結果判定
			if (getErrorManager().size() > 0) {
				return null;
			}
			List<TInventoryB> bids = inventoryListPrintLogic.getBodyIdsFor03_04(headR, bodyR);
			inventoryListPrintLogic.updateControlNo1_2_3_4(bids, controlNo, new ErrorStatus(StatusCode.REPORTCD3_ERROR));
		//商品別棚卸実績(LOC表示あり)データ取得
		}else if (CDef.InventoryListType.$04.code().equals(inventoryPrintType)) {
			entityDataList = inventoryListPrintLogic.getReportData04(headR, bodyR, new ErrorStatus(StatusCode.REPORTCD4_ERROR));
			// 結果判定
			if (getErrorManager().size() > 0) {
				return null;
			}
			List<TInventoryB> bids = inventoryListPrintLogic.getBodyIdsFor03_04(headR, bodyR);
			inventoryListPrintLogic.updateControlNo1_2_3_4(bids, controlNo, new ErrorStatus(StatusCode.REPORTCD4_ERROR));
		}
		if (CDef.InventoryListType.$01.code().equals(inventoryPrintType))  {
			reportData = getReportDataList01(entityDataList);
		//在庫差異確認データ取得
		}else if (CDef.InventoryListType.$02.code().equals(inventoryPrintType)) {
			reportData = getReportDataList02(entityDataList);
		//商品別棚卸実績兼差異データ取得
		}else if (CDef.InventoryListType.$03.code().equals(inventoryPrintType)) {
			reportProductData = getReportDataList03(headR,entityDataList);
		//商品別棚卸実績(LOC表示あり)データ取得
		}else if (CDef.InventoryListType.$04.code().equals(inventoryPrintType)) {
			reportProductData = getReportDataList04(entityDataList);
		}
		//帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);

		//棚卸差異帳票を発行する
		if(Arrays.asList(CDef.InventoryListType.$01.code(),CDef.InventoryListType.$02.code()).contains(inventoryPrintType)) {
			inventoryListPrintDto.printBasicData.outputData = json.format(reportData);
		}else if(Arrays.asList(CDef.InventoryListType.$03.code(),CDef.InventoryListType.$04.code()).contains(inventoryPrintType)) {
			inventoryListPrintDto.printBasicData.outputData = json.format(reportProductData);
		}
		
		printLogic.print(inventoryListPrintDto);

		InventoryListPrintDto ret = new InventoryListPrintDto();
		ret.output = inventoryListPrintDto.output;

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		inventoryListPrintLogic.updateOutFLg1_2(controlNo, inventoryPrintType, new ErrorStatus(StatusCode.REPORTCD2_ERROR));
		inventoryListPrintLogic.updateOutFLg3_4(controlNo, inventoryPrintType, new ErrorStatus(StatusCode.REPORTCD3_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			return null;
		}
		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);
		return ret;
	}

	/**
	 * <h2>棚卸関連リスト発行-棚卸在庫差異表データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸関連リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディ
	 * @param String inventoryPrintType 棚卸帳票発行区分
	 * @return List<InventoryListDto> 棚卸在庫差異表帳票用DTO
	 */
	private List<InventoryListDto> getReportDataList01(List<TInventoryB> entityDataList) {
		List<InventoryListDto> reportDataList = new ArrayList<InventoryListDto>();
		//通常の場合、棚卸関連リスト発行の所有者が【ＦＷ統括部、ヘルメット統括部、エムシーアパレル株式会社、ミドリ安全用品株式会社】
		List<String> gengeralList =  Arrays.asList("P135", "P161", "P801", "P900");
		//預り品Cd
		//棚卸作業リスト作成
		entityDataList.forEach(entity -> {
			boolean isGeneral = false;
			if(gengeralList.contains(entity.getMCustomerByDepositId() == null ? "" :  entity.getMCustomerByDepositId().getCustomerCd())) {
				isGeneral = true;
			}
			InventoryListDto dto = new InventoryListDto();
			SimpleDateFormat outTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String outDt = outTimeFormat.format(Timestamp.valueOf(LocalDateTime.now()));
			String centerCd = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterCd();
			String centerAbbr = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterAbbr();
			String centerNm = centerAbbr == null ? (centerCd) : (centerCd == null ? centerAbbr : centerCd + ":" + centerAbbr);
			String salesOrgCd = entity.getMSalesOrg() == null ? null : entity.getMSalesOrg().getSalesOrgCd();
			String salesOrgNm = entity.getMSalesOrg() == null ? null :
				(entity.getMSalesOrg().getTenhanshaNm1() == null ? entity.getMSalesOrg().getTenhanshaNm2() : entity.getMSalesOrg().getTenhanshaNm1() + entity.getMSalesOrg().getTenhanshaNm2());
			String customerCd = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerCd();
			String customerNm = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerNm();
			String salesPart = salesOrgNm == null ? (salesOrgCd) : (salesOrgCd == null ? salesOrgNm : salesOrgCd + ":" + salesOrgNm);
			String userPart = customerNm == null ? (customerCd) : (customerCd == null ? customerNm : customerCd + ":" + customerNm);
			String salesOrgAndUser = isGeneral ? "" : (userPart == null ? salesPart : (salesPart + "/" + userPart));
			String noScanlabel = (entity.getTInventoryReceiveLabelList() == null || entity.getTInventoryReceiveLabelList().isEmpty()) ? "" 
					: entity.getTInventoryReceiveLabelList().stream().map(TInventoryReceiveLabel :: getReceiveLabelNo).collect(Collectors.joining(","));;
			String limitDt = "";
			if(entity.getLimitDt() != null) {
				String year = entity.getLimitDt().substring(0, 4);
				String month = entity.getLimitDt().substring(4, 6);
				String day = entity.getLimitDt().substring(6, 8);
				limitDt = String.join("/", year,month,day);
			}
			String prodDt = "";
			if(entity.getProdDt() != null) {
				String year = entity.getProdDt().substring(0, 4);
				String month = entity.getProdDt().substring(4, 6);
				String day = entity.getProdDt().substring(6, 8);
				prodDt = String.join("/", year,month,day);
			}
			dto.cultureId = getCultureId();
			//出力日時
			dto.setOutputTime(outDt);
			//センタ
			dto.setCenterNm(centerNm);
			//センタCD
			dto.setCenterCd(centerCd);
			//ロケーション
			dto.setLocationCd(entity.getMLocation() == null ? "" : entity.getMLocation().getLocationCd());
			//JANCD
			dto.setJanCd(isGeneral ? entity.getMProduct().getJanCd() : entity.getdJanCd());
			//商品名称
			dto.setProductNm(entity.getMProduct() == null ? "" : entity.getMProduct().getProductNm());
			//販売組織/ユーザ
			dto.setSalesOrgAndUser(salesOrgAndUser);
			//期限日
			dto.setLimitDt(limitDt == null ? "": limitDt.toString());
			//製造日
			dto.setManufacturingDt(prodDt == null ? "" : prodDt.toString());
			//ロット
			dto.setLot(entity.getLot());
			//ケース数
			dto.setCaseNum(entity.getScanCount());
			//棚卸数
			dto.setInventoryNum(entity.getInventoryNum());
			//棚卸担当者
			dto.setInventoryUserNm(entity.getBUserByInventoryUserId() == null ? "" : entity.getBUserByInventoryUserId().getUserNm());
			//エリア
			dto.setAreaCd(entity.getAreaCd());
			//在庫数
			dto.setChargeNum(entity.getChargeNum());
			//棚卸差異数
			dto.setDiffNum(entity.getInventoryNum().subtract(entity.getChargeNum()));
			//未スキャン入荷ラベル
			dto.setNoScanReceiveLabelNo(noScanlabel);
			reportDataList.add(dto);
		});
	    return reportDataList;
	}

	/**
	 * <h2>棚卸関連リスト発行-在庫差異確認表データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸関連リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディ
	 * @return List<InventoryListDto> 在庫差異確認表帳票用DTO
	 */
	private List<InventoryListDto> getReportDataList02(List<TInventoryB> entityDataList) {
		List<InventoryListDto> reportDataList = new ArrayList<InventoryListDto>();
		//通常の場合、棚卸関連リスト発行の所有者が【ＦＷ統括部、ヘルメット統括部、エムシーアパレル株式会社、ミドリ安全用品株式会社】
		List<String> gengeralList =  Arrays.asList("P135", "P161", "P801", "P900");
		//棚卸作業リスト作成
		entityDataList.forEach(entity -> {
			boolean isGeneral = false;
			if(gengeralList.contains(entity.getMCustomerByDepositId() == null ? "" :  entity.getMCustomerByDepositId().getCustomerCd())) {
				isGeneral = true;
			}
			InventoryListDto dto = new InventoryListDto();
			SimpleDateFormat outTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String outDt = outTimeFormat.format(Timestamp.valueOf(LocalDateTime.now()));
			String centerCd = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterCd();
			String centerAbbr = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterAbbr();
			String centerNm = centerAbbr == null ? (centerCd) : (centerCd == null ? centerAbbr : centerCd + ":" + centerAbbr);
			String salesOrgCd = entity.getMSalesOrg() == null ? null : entity.getMSalesOrg().getSalesOrgCd();
			String salesOrgNm = entity.getMSalesOrg() == null ? null :
				(entity.getMSalesOrg().getTenhanshaNm1() == null ? entity.getMSalesOrg().getTenhanshaNm2() : entity.getMSalesOrg().getTenhanshaNm1() + entity.getMSalesOrg().getTenhanshaNm2());
			String customerCd = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerCd();
			String customerNm = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerNm();
			String salesPart = salesOrgNm == null ? (salesOrgCd) : (salesOrgCd == null ? salesOrgNm : salesOrgCd + ":" + salesOrgNm);
			String userPart = customerNm == null ? (customerCd) : (customerCd == null ? customerNm : customerCd + ":" + customerNm);
			String salesOrgAndUser = isGeneral ? "" : (userPart == null ? salesPart : (salesPart + "/" + userPart));
			String inputUserNm = entity.getUpdateUserNm() == null ? entity.getUpdateUserCd() : 
				( entity.getUpdateUserCd() == null ? entity.getUpdateUserNm() : entity.getUpdateUserCd() + ":" + entity.getUpdateUserNm());
			String limitDt = "";
			if(entity.getLimitDt() != null) {
				String year = entity.getLimitDt().substring(0, 4);
				String month = entity.getLimitDt().substring(4, 6);
				String day = entity.getLimitDt().substring(6, 8);
				limitDt = String.join("/", year,month,day);
			}
			String prodDt = "";
			if(entity.getProdDt() != null) {
				String year = entity.getProdDt().substring(0, 4);
				String month = entity.getProdDt().substring(4, 6);
				String day = entity.getProdDt().substring(6, 8);
				prodDt = String.join("/", year,month,day);
			}
			dto.cultureId = getCultureId();
			//出力日時
			dto.setOutputTime(outDt);
			//センタ
			dto.setCenterNm(centerNm);
			//センタCD
			dto.setCenterCd(centerCd);
			//入力者
			dto.setInputUserNm(inputUserNm);
			//入力者Cd
			dto.setInputUserCd(entity.getUpdateUserCd());
			//ロケーション
			dto.setLocationCd(entity.getMLocation() == null ? "" : entity.getMLocation().getLocationCd());
			//JANCD
			dto.setJanCd(isGeneral ? entity.getMProduct().getJanCd() : entity.getdJanCd());
			//商品名称
			dto.setProductNm(entity.getMProduct() == null ? "" : entity.getMProduct().getProductNm());
			//販売組織/ユーザ
			dto.setSalesOrgAndUser(salesOrgAndUser);
			//期限日
			dto.setLimitDt(limitDt == null ? "": limitDt.toString());
			//製造日
			dto.setManufacturingDt(prodDt == null ? "" : prodDt.toString());
			//ロット
			dto.setLot(entity.getLot());
			//ケース数
			dto.setCaseNum(entity.getScanCount());
			//棚卸担当者
			dto.setInventoryUserNm(entity.getBUserByInventoryUserId() == null ? "" : entity.getBUserByInventoryUserId().getUserNm());
			//棚卸数変更者
			dto.setInventoryUpdUserNm(entity.getUpdateUserNm());
			//エリア
			dto.setAreaCd(entity.getAreaCd());
			//修正前数量
			dto.setInventoryModNum(entity.getInventoryModNum());
			//棚卸数
			dto.setInventoryNum(entity.getInventoryNum());
			//在庫数
			dto.setChargeNum(entity.getChargeNum());
			//棚卸差異数
			dto.setDiffNum(entity.getInventoryNum().subtract(entity.getChargeNum()));
			reportDataList.add(dto);
		});
	    return reportDataList;
	}
	
	/**
	 * <h2>棚卸関連リスト発行-商品別棚卸実績表兼差異表データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸関連リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryH> 棚卸ヘッダー
	 * @param List<TInventoryB> 棚卸ボディ
	 * @return List<InventoryListProductDto> 商品別棚卸実績表兼差異表帳票用DTO
	 */
	private List<InventoryListProductDto> getReportDataList03(TInventoryH head, List<TInventoryB> entityDataList) {
		List<InventoryListProductDto> reportDataList = new ArrayList<InventoryListProductDto>();
		//通常の場合、棚卸関連リスト発行の所有者が【ＦＷ統括部、ヘルメット統括部、エムシーアパレル株式会社、ミドリ安全用品株式会社】
	//	List<String> gengeralList =  Arrays.asList("P135", "P161", "P801", "P900");
	
		//棚卸作業リスト作成
		entityDataList.forEach(entity -> {
		//	boolean isGeneral = false;
		//	if(gengeralList.contains(entity.getMCustomerByDepositId() == null ? "" :  entity.getMCustomerByDepositId().getCustomerCd())) {
		//		isGeneral = true;
		//	}
			InventoryListProductDto dto = new InventoryListProductDto();
			SimpleDateFormat outTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String outDt = outTimeFormat.format(Timestamp.valueOf(LocalDateTime.now()));
			String centerCd = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterCd();
			String centerAbbr = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterAbbr();
			String centerNm = centerAbbr == null ? (centerCd) : (centerCd == null ? centerAbbr : centerCd + ":" + centerAbbr);
		//	String salesOrgCd = entity.getMSalesOrg() == null ? null : entity.getMSalesOrg().getSalesOrgCd();
		//	String salesOrgNm = entity.getMSalesOrg() == null ? null :
		//		(entity.getMSalesOrg().getTenhanshaNm1() == null ? entity.getMSalesOrg().getTenhanshaNm2() : entity.getMSalesOrg().getTenhanshaNm1() + entity.getMSalesOrg().getTenhanshaNm2());
			//String customerCd = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerCd();
		//	String customerNm = entity.getMCustomerByAccountId() == null ? null : entity.getMCustomerByAccountId().getCustomerNm();
		//	String salesPart = salesOrgNm == null ? (salesOrgCd) : (salesOrgCd == null ? salesOrgNm : salesOrgCd + ":" + salesOrgNm);
		//	String userPart = customerNm == null ? (customerCd) : (customerCd == null ? customerNm : customerCd + ":" + customerNm);
		//	String salesOrgAndUser = isGeneral ? "" : (userPart == null ? salesPart : (salesPart + "/" + userPart));
			String typeNm = entity.getMProduct() == null ? "" : 
				(entity.getTypeNm() == null ? entity.getMProduct().getProductCategoryCls() :
					(entity.getMProduct().getProductCategoryCls() == null ? entity.getTypeNm() : entity.getMProduct().getProductCategoryCls() + ":" + entity.getTypeNm()));
			String inventoryDt = "";
			if(entity.getTInventoryH().getInventoryDt() != null) {
				String year = entity.getTInventoryH().getInventoryDt().substring(0, 4);
				String month = entity.getTInventoryH().getInventoryDt().substring(4, 6);
				String day = entity.getTInventoryH().getInventoryDt().substring(6, 8);
				inventoryDt = String.join("/", year,month,day);
			}
			
			dto.cultureId = getCultureId();
			//出力日時
			dto.setOutputTime(outDt);
			//センタ
			dto.setCenterNm(centerNm);
			//センタCD
			dto.setCenterCd(centerCd);
			//部門
			dto.setPlantNm(entity.getPlantNm() == null ? "" : entity.getTInventoryH().getPlantCd() + ":" + entity.getPlantNm());
			//棚卸日
			dto.setInventoryDt(inventoryDt);
			//品種
			dto.setTypeNm(typeNm);
			//棚卸差異
			dto.setDiffNm(entity.getInventoryDiffNm());
			//商品CD
			dto.setProductCd(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd());
			//JANCD
			dto.setJanCd( entity.getMProduct() == null ? "" : entity.getMProduct().getJanCd() );
			//商品名称
			dto.setProductNm(entity.getMProduct() == null ? "" : entity.getMProduct().getProductNm());
			//現在庫数
			dto.setChargeNum(entity.getChargeNum());
			//棚卸数量
			dto.setInventoryNum(entity.getInventoryNum());
			//ユーザCD
			//dto.setCustomerCd(customerCd);
			//部門CD
			dto.setPlantCd(entity.getTInventoryH().getPlantCd());
			//販売組織CD
		//	dto.setSalesOrgCd(salesOrgCd);
			//品種CD
			dto.setTypeCd(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCategoryCls());
			BigDecimal chargeNum = entity.getChargeNum() == null ? WCC.ZERO : entity.getChargeNum();
			BigDecimal inventoryNum = entity.getInventoryNum() == null ? WCC.ZERO : entity.getInventoryNum();
			//差異数量＋
			dto.setDiffNumP(WCC.ZERO);
			dto.setDiffMoneyP(WCC.ZERO);
			if(chargeNum.compareTo(inventoryNum) < 0) {
				BigDecimal diffp = inventoryNum.subtract(chargeNum);
				dto.setDiffNumP(diffp);
				//差異金額＋
				if(!PriceDiffHidden.$01.code().equals(head.getDiffPriceHiddenFlg())) {
					BigDecimal diffMoneyP = diffp.multiply(entity.getMProduct() == null ? WCC.ZERO : 
						(entity.getMProduct() == null || entity.getMProduct().getEvaluationUnitPrice() == null) ? WCC.ZERO : entity.getMProduct().getEvaluationUnitPrice());
					dto.setDiffMoneyP(diffMoneyP);
				}
			}
			//差異数量－
			dto.setDiffNumM(WCC.ZERO);
			dto.setDiffMoneyM(WCC.ZERO);
			if(chargeNum.compareTo(inventoryNum) > 0) {
				BigDecimal diffm = chargeNum.subtract(inventoryNum);
				dto.setDiffNumM(diffm);
				//差異金額－
				if(!PriceDiffHidden.$01.code().equals(head.getDiffPriceHiddenFlg())) {
					BigDecimal diffMoneyM = diffm.multiply(entity.getMProduct() == null ? WCC.ZERO : 
						(entity.getMProduct() == null || entity.getMProduct().getEvaluationUnitPrice() == null) ? WCC.ZERO : entity.getMProduct().getEvaluationUnitPrice());
					dto.setDiffMoneyM(diffMoneyM);
				}
			}
			//販売組織/ユーザ
			dto.setSalesOrgAndUser(entity.getSalesUserNm());
			reportDataList.add(dto);
		});
	    return reportDataList;
	}
	
	/**
	 * <h2>棚卸関連リスト発行-商品別棚卸実績表(LOC表示あり)データ取得。</h2>
	 * <pre>
	 * ・帳票用DTOの作成
	 * ・棚卸関連リスト発行データを取得する
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディ
	 * @return List<InventoryListProductDto> 商品別棚卸実績表(LOC表示あり)帳票用DTO
	 */
	private List<InventoryListProductDto> getReportDataList04(List<TInventoryB> entityDataList) {
		List<InventoryListProductDto> reportDataList = new ArrayList<InventoryListProductDto>();
		int sumlocation = 0;
		InventoryListProductDto temp = new InventoryListProductDto();
		String productCd = "";
		String locationCd = "";
		boolean isChangeLocation = false;
		int size = entityDataList.size();
		int countSize = 0;
		//棚卸作業リスト作成
		for(TInventoryB entity : entityDataList) {
			countSize++;
			InventoryListProductDto dto = new InventoryListProductDto();
			SimpleDateFormat outTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String outDt = outTimeFormat.format(Timestamp.valueOf(LocalDateTime.now()));
			String centerCd = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterCd();
			String centerAbbr = (entity.getTInventoryH() == null || entity.getTInventoryH().getMCenter() == null) ? null : entity.getTInventoryH().getMCenter().getCenterAbbr();
			String centerNm = centerAbbr == null ? (centerCd) : (centerCd == null ? centerAbbr : centerCd + ":" + centerAbbr);
			String typeNm = entity.getMProduct() == null ? "" : 
				(entity.getTypeNm() == null ? entity.getMProduct().getProductCategoryCls() :
					(entity.getMProduct().getProductCategoryCls() == null ? entity.getTypeNm() : entity.getMProduct().getProductCategoryCls() + ":" + entity.getTypeNm()));
			String inventoryDt = "";
			if(entity.getTInventoryH().getInventoryDt() != null) {
				String year = entity.getTInventoryH().getInventoryDt().substring(0, 4);
				String month = entity.getTInventoryH().getInventoryDt().substring(4, 6);
				String day = entity.getTInventoryH().getInventoryDt().substring(6, 8);
				inventoryDt = String.join("/", year,month,day);
			}
			dto.cultureId = getCultureId();
			//出力日時
			dto.setOutputTime(outDt);
			//センタ
			dto.setCenterNm(centerNm);
			//センタCD
			dto.setCenterCd(centerCd);
			//棚卸日
			dto.setInventoryDt(inventoryDt);
			//品種
			dto.setTypeNm(typeNm);
			//棚卸差異
			dto.setDiffNm(entity.getInventoryDiffNm());
			//商品CD
			dto.setProductCd(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd());
			String janCd = "";
			String productNm = "";
			if(!productCd.equals(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd())) {
				janCd = entity.getMProduct() == null ? "" : entity.getMProduct().getJanCd();
				productNm = entity.getMProduct() == null ? "" : entity.getMProduct().getProductNm();
			}
			//JANCD
			dto.setJanCd(janCd);
			//商品名称
			dto.setProductNm(productNm);
			//ロケーション
			dto.setLocationCd(entity.getMLocation() == null ? "" : entity.getMLocation().getLocationCd());
			//棚卸数量
			dto.setInventoryNum(entity.getInventoryNum());
			//品種CD
			dto.setTypeCd(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCategoryCls());
			//ロケーション合計
			dto.setSumLocation(0);
			if(productCd.equals(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd()) &&
					!locationCd.equals(entity.getMLocation() == null ? "" : entity.getMLocation().getLocationCd())) {
				isChangeLocation = true;
			}
			if(!productCd.equals(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd()) && isChangeLocation) {
				temp.setSumLocation(sumlocation);
				isChangeLocation = false;
			}
			if(!productCd.equals(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd())) {
				sumlocation = 0;
			}
			
			sumlocation += entity.getInventoryNum().intValue();
			if(countSize == size && productCd.equals(entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd())) {
				dto.setSumLocation(sumlocation);
			}
			productCd = entity.getMProduct() == null ? "" : entity.getMProduct().getProductCd();
			locationCd = entity.getMLocation() == null ? "" : entity.getMLocation().getLocationCd();
			temp = dto;
			reportDataList.add(dto);
		};
	    return reportDataList;
	}
	
}
