package com.oneslogi.wms.logic.shipping;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTAllocInstB;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTPackingH;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTPickingH;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstB;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstH;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MHolidayCB;
import com.oneslogi.base.dbflute.cbean.TAllocInstBCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.cbean.TPickingRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MHolidayBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPickingListPrintPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTagLabelCommonPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTagLabelYamatoPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MHoliday;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint;
import com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelCommon;
import com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelYamato;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.CasePickingListDto;
import com.oneslogi.wms.dto.report.IndividualCasePickingListDto;
import com.oneslogi.wms.dto.report.IndividualPieceTotalPickingListDto;
import com.oneslogi.wms.dto.report.MultiPickingListDto;
import com.oneslogi.wms.dto.report.OrderPickingListDto;
import com.oneslogi.wms.dto.report.PLPickingListDto;
import com.oneslogi.wms.dto.report.PieceNizoroeListIdManagDto;
import com.oneslogi.wms.dto.report.PiecePickingListDto;
import com.oneslogi.wms.dto.report.PieceTotalPickingListDto;
import com.oneslogi.wms.dto.report.SLPickingListDto;
import com.oneslogi.wms.dto.report.TotalPickingListDto;
import com.oneslogi.wms.dto.shipping.PickingListPrintDto;
import com.oneslogi.wms.logic.common.ReportLogic;

/**
 * ピッキングリスト発行データ取得ロジッククラス
 */
public class PickingListPrintSelectLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/** バラ荷揃表 */
	private static final String REPORT_CD_PIECE = "PiecePickingList";
	/** バラ荷揃表(個体管理用) */
	private static final String REPORT_CD_PIECE_MANAG = "PieceNizoroeListIdManag";
	/** ケース荷揃表 */
	private static final String REPORT_CD_CASE = "CasePickingList";
	/** バラトータル荷揃表(戸配) */
	private static final String REPORT_CD_TOTAL = "PieceTotalPickingList";
	/** ケース荷揃表(戸配) */
	private static final String REPORT_CD_INDV_CASE = "IndividualCasePickingList";
	/** 摘み取りリスト */
	private static final String REPORT_CD_PL = "PLPickingList";
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
	/** 戸配一体型伝票(荷札、納品書) */
	private static final String REPORT_CD_SLIP_ALL = "AllInOneDeliverySlipList";
	/** 梱包明細ラベル */
	private static final String REPORT_CD_SCM = "PakcingSCMLabel";
	/** 個別貼り付けラベル */
	private static final String REPORT_CD_INDV = "IndvLabel";
	/** 個人別支給明細 */
	private static final String REPORT_CD_INDV_DETAIL = "IndvSupplyDetail";

	/** 曜日：月曜日 */
	public static final String MANDAY = "月";
	/** 曜日：火曜日 */
	public static final String TUESDAY = "火";
	/** 曜日：水曜日 */
	public static final String WEDNESDAY = "水";
	/** 曜日：木曜日 */
	public static final String THURSDAY = "木";
	/** 曜日：金曜日 */
	public static final String FRIDAY = "金";
	/** 曜日：土曜日 */
	public static final String SATURDAY = "土";
	/** 曜日：日曜日 */
	public static final String SUNDAY = "日";

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	@Inject
	private MHolidayBhv mHolidayBhv;

	// ===== 使用ロジック =====
	@Inject
	private ReportLogic reportLogic;

	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しピッキングリストの発行データを取得する。
	 * データ存在する場合、センタ区分値マスタより表示名称を設定する。
	 *
	 * 検索検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・ピッキンググループNo.・作業日/出荷日区分・日付(From)・日付(To)・ピッキング方法・発行区分・配送コースCD
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlPickingListPrint> ピッキングリスト発行データ
	 */
	public PagingResultBean<SqlPickingListPrint> select(TPickingH tPickingH, PickingListPrintDto.PagingData paging,
			ErrorStatus errSts) {

		PagingResultBean<SqlPickingListPrint> result = null;

		// ===== 出庫指示一覧データ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlPickingListPrint;

		// 検索条件の設定
		SqlPickingListPrintPmb pmb = setCondition(tPickingH);

		// 検索実行
		Class<SqlPickingListPrint> entityType = SqlPickingListPrint.class;
		result = selectPage(tPickingHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 区分値マスタより取得
		BClassDtlCB cbCCD = bClassDtlBhv.newConditionBean();
		cbCCD.specify().columnClassDtlCd();
		cbCCD.specify().columnDictId();
		cbCCD.setupSelect_BClass();
		cbCCD.specify().specifyBClass().columnClassCd();
		cbCCD.setupSelect_VDict(getCultureId());
		cbCCD.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("SHIPPING_TYPE");
		classCdList.add("PRINT_FLG");

		cbCCD.query().queryBClass().setClassCd_InScope(classCdList);
		cbCCD.query().queryBClass().addOrderBy_ClassCd_Asc();
		cbCCD.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cbCCD);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl mCenterClassDtl : bClassList) {
			if (classCd.equals(mCenterClassDtl.getBClass().getClassCd())) {
				dtlMap.put(mCenterClassDtl.getClassDtlCd(), mCenterClassDtl.getVDict().getDictNm());
			} else {
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(mCenterClassDtl.getClassDtlCd(), mCenterClassDtl.getVDict().getDictNm());
				classCd = mCenterClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		for (SqlPickingListPrint sql : result) {
			if (bClassMap.containsKey("SHIPPING_TYPE")) {
				// 出荷区分
				if (bClassMap.get("SHIPPING_TYPE").containsKey(sql.getShippingTypeCd())) {
					sql.setShippingTypeNm(bClassMap.get("SHIPPING_TYPE").get(sql.getShippingTypeCd()));
				}
			}

			if (bClassMap.containsKey("PRINT_FLG")) {
				// 荷揃表発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getNizoroeOutFlg())) {
					sql.setNizoroeOutNm(bClassMap.get("PRINT_FLG").get(sql.getNizoroeOutFlg()));
				}

				// 荷札発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getTagOutFlg())) {
					sql.setTagOutNm(bClassMap.get("PRINT_FLG").get(sql.getTagOutFlg()));
				}

				// 納品書発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getDelivOutFlg())) {
					sql.setDelivOutNm(bClassMap.get("PRINT_FLG").get(sql.getDelivOutFlg()));
				}

				// 梱包明細発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getPllOutFlg())) {
					sql.setPllOutNm(bClassMap.get("PRINT_FLG").get(sql.getPllOutFlg()));
				}

				// 個人別支給明細発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getIndvSupplyOutFlg())) {
					sql.setIndvSupplyOutNm(bClassMap.get("PRINT_FLG").get(sql.getIndvSupplyOutFlg()));
				}

				// 個別貼り付けラベル発行
				if (bClassMap.get("PRINT_FLG").containsKey(sql.getIndvLabelOutFlg())) {
					sql.setIndvLabelOutNm(bClassMap.get("PRINT_FLG").get(sql.getIndvLabelOutFlg()));
				}
			}
		}
		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQLの検索条件を設定する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：荷主ID・センタID・出庫作業No.・ピッキンググループNo.・作業日/出荷日区分・日付(From)・日付(To)・ピッキング方法・発行区分・配送コースCD
	 * @return SqlPickingListPrintPmb 検索条件
	 */
	protected SqlPickingListPrintPmb setCondition(TPickingH tPickingH) {

		// 検索条件の設定
		SqlPickingListPrintPmb pmb = new SqlPickingListPrintPmb();
		pmb.setCenterCd(tPickingH.getMCenter().getCenterCd()); // センタCD
		pmb.setSearchReferenceDt(tPickingH.getSearchReferenceDt()); // 検索基準日
		pmb.setDtFrom(tPickingH.getDtFrom()); // 日付(From)
		pmb.setDtTo(tPickingH.getDtTo()); // 日付(To)
		pmb.setShippingSlipType(tPickingH.getShippingSlipType()); // 出荷帳票発行区分
		pmb.setPrintStatus(tPickingH.getPrintStatus()); // 発行状況
		pmb.setDeliveryCourseCd(tPickingH.getDeliveryCourseCd()); // 運送便CD
		pmb.setCarrierCd(tPickingH.getCarrierCd()); // 運送業者CD
		pmb.setNizoroeNo2From(tPickingH.getNizoroeNo2From()); // 荷揃番号(From)
		pmb.setNizoroeNo2To(tPickingH.getNizoroeNo2To()); // 荷揃番号(To)
		pmb.setDaihyoNizoroeNo2From(tPickingH.getDaihyoNizoroeNo2From()); // 代表荷揃番号(From)
		pmb.setDaihyoNizoroeNo2To(tPickingH.getDaihyoNizoroeNo2To()); // 代表荷揃番号(To)
		pmb.setClientShippingNo_PrefixSearch(tPickingH.getClientShippingNo()); // 発注伝票番号
		pmb.setCultureId(getCultureId());

		return pmb;
	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 *
	 * 出庫帳票を更新する。
	 *
	 * </pre>
	 * @param update 出庫帳票(更新用)
	 * @param report 出庫帳票(検索用)：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void tPickingRUpdate(TPickingR update, TPickingR report, ErrorStatus errSts) {

	}

	/**
	 * <h2>出庫帳票を更新する。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票を更新する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ：リスト発行区分・発行状況
	 * @param tPickingHList 出庫ヘッダリスト：荷主ID, センタID, ピッキンググループNo., 出庫作業No.
	 * @param update 出庫帳票(更新用)：全項目
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return int 更新件数
	 */
	public int updateControlNo(final TPickingH tPickingH, List<TPickingH> tPickingHList, TPickingR update, Long reportId, ErrorStatus errStatus) {

		// 出荷指示ヘッダリストのデータ件数分繰返
		int updateCount = 0;

		CDef.ShippingSlipType shippingSlipType = CDef.ShippingSlipType.codeOf(tPickingH.getShippingSlipType());

		for (final TPickingH pickingH : tPickingHList) {

			// ===== 出庫帳票データ更新 =====

			TPickingRCB cb = tPickingRBhv.newMyConditionBean();

			//検索条件
			cb.query().queryTPickingH().setNizoroeNo2_Equal(pickingH.getNizoroeNo2());
			cb.query().queryTPickingH().setPrintStatus_Equal(tPickingH.getPrintStatus());

			switch (shippingSlipType) {
			case $01: // 発行区分で[01：バラ荷揃表]が選択された場合
				cb.query().queryTPickingH().setNizoroePrintTypeCd_Equal("01");

				if (reportId == reportLogic.getReportId(REPORT_CD_PIECE_MANAG)) {
					List<String> idManagPrintTypeCdList = new ArrayList<String>();

					// '01'(預り品)
					idManagPrintTypeCdList.add("01");
					// '02'(個体管理品)
					idManagPrintTypeCdList.add("02");
					// 個体管理印刷区分
					cb.query().queryTPickingH().setIdManagPrintTypeCd_InScope(idManagPrintTypeCdList);
				}

				break;
			case $02: // 発行区分で[02：ケース荷揃表]が選択された場合
				cb.query().queryTPickingH().setNizoroePrintTypeCd_Equal("02");
				break;
			case $03: // 発行区分で[03：バラトータル荷揃表(戸配)]が選択された場合
				cb.query().queryTPickingH().setNizoroePrintTypeCd_Equal("03");
				break;
			case $04: // 発行区分で[04：ケース荷揃表(戸配)]が選択された場合
				cb.query().queryTPickingH().setNizoroePrintTypeCd_Equal("04");
				break;
			case $05: // 発行区分で[05：バラトータル荷揃表]が選択された場合
				cb.query().queryTPickingH().setNizoroePrintTypeCd_Equal("05");
				break;
			case $06: // 発行区分で[06：摘み取りリスト]が選択された場合
				cb.query().setPlOutFlg_Equal_$1();
				break;
			case $07: // 発行区分で[07：納品書]が選択された場合
				cb.query().setDelivOutFlg_Equal("1");
				if (reportId == reportLogic.getReportId(REPORT_CD_SLIP_DOS)) {
					// 直送店送納品書
					cb.query().queryTPickingH().setDelivPrintTypeCd_Equal("01");
				} else if (reportId == reportLogic.getReportId(REPORT_CD_SLIP_MANAG)) {
					// 納品明細書(個体管理)
					cb.query().queryTPickingH().setDelivPrintTypeCd_Equal("02");
				} else if (reportId == reportLogic.getReportId(REPORT_CD_SLIP_EC)) {
					// EC納品書
					cb.query().queryTPickingH().setDelivPrintTypeCd_Equal("03");
				} else if (reportId == reportLogic.getReportId(REPORT_CD_GUIDE)) {
					// 物品送付案内書
					cb.query().queryTPickingH().setDelivPrintTypeCd_Equal("04");
				}
				break;
			case $08: // 発行区分で[08：荷札]が選択された場合
				cb.query().setTagOutFlg_Equal("1");
				if (reportId == reportLogic.getReportId(REPORT_CD_TAG_COMMON)) {
					// 汎用荷札
					cb.query().queryTPickingH().setTagPrintTypeCd_Equal("01");
				} else if (reportId == reportLogic.getReportId(REPORT_CD_TAG_YMT)) {
					// 荷札ヤマト
					cb.query().queryTPickingH().setTagPrintTypeCd_Equal("02");
				} else if (reportId == reportLogic.getReportId(REPORT_CD_TAG_JP)) {
					// 荷札JP
					cb.query().queryTPickingH().setTagPrintTypeCd_Equal("03");
				}
				break;
			case $09: // 発行区分で[09：一体型伝票(荷札、納品書)]が選択された場合
				cb.query().queryTPickingH().setIntegPrintFlg_Equal("1");
			case $10: // 発行区分で[10：梱包明細]が選択された場合
				cb.query().setPllOutFlg_Equal("1");
				break;
			case $11: // 発行区分で[11：個別貼り付けラベル]が選択された場合
				cb.query().queryTPickingH().setIdManagPrintTypeCd_Equal("02");
				break;
			case $12: // 発行区分で[12：個人別支給明細]が選択された場合
				cb.query().setIndvSupplyOutFlg_Equal("1");
				break;
			default:
				getErrorManager().throwException(new IllegalStateException("ShippingSlipType is illegal."));
				break;
			}

			// ===== 出庫帳票の更新 =====
			int updCnt = tPickingRBhv.queryUpdate(update, cb);
			updateCount = updateCount + updCnt;
		}

	    return updateCount;
	}

	/**
	 * <h2>コントロールNo.をクリアする。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、出庫帳票のコントロールNo.をクリアする。
	 * </pre>
	 * @param controlNo コントロールNo.
	 */
	public void clearControlNo(long controlNo) {

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		TPickingR update = new TPickingR();
		update.setControlNo(null);

		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>オーダーピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param storeNoFlg
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<OrderPickingListDto> オーダーピッキングリストデータ取得用DTOリスト
	 */
	public List<OrderPickingListDto> getOrderDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<OrderPickingListDto> sqlOrderPickingListPrintList = new ArrayList<OrderPickingListDto>();

		return sqlOrderPickingListPrintList;
	}

	/**
	 * <h2>摘み取りピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<PLPickingListDto> 摘み取りピッキングリスト取得用DTOリスト
	 */
	public List<PLPickingListDto> getPLDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<PLPickingListDto> SqlPLPickingListPrintList = new ArrayList<PLPickingListDto>();

		return SqlPLPickingListPrintList;
	}

	/**
	 * <h2>トータルピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<TotalPickingListDto> トータルピッキングリスト取得用DTOリスト
	 */
	public List<TotalPickingListDto> getTotalDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<TotalPickingListDto> dataList = new ArrayList<TotalPickingListDto>();

		return dataList;
	}

	/**
	 * <h2>種蒔きピッキングリストデータ取得。</h2>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param tPickingH 出庫ヘッダ
	 * @param storeNoFlg 入庫No.管理フラグ
	 * @param errSts エラー時に登録するエラーステータス
	 * @return List<SLPickingListDto> 種蒔きピッキングリスト取得用DTOリスト
	 */
	public List<SLPickingListDto> getSLDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<SLPickingListDto> dataList = new ArrayList<SLPickingListDto>();

		return dataList;

	}

	/**
	* <h2>ケースピッキングリストデータ取得。</h2>
	* @param tPickingR 出庫帳票(更新用)
	* @param errSts エラー時に登録するエラーステータス
	 * @param storeNoFlg 入庫No.管理フラグ
	* @return List<CasePickingListPrintDto> ケースピッキングリスト取得用DTOリスト
	*/
	public List<CasePickingListDto> getCaseDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<CasePickingListDto> printDtoList = new ArrayList<CasePickingListDto>();

		return printDtoList;
	}

	/**
	* <h2>マルチピッキングリストデータ取得。</h2>
	* @param tPickingR 出庫帳票(更新用)
	* @param storeNoFlg 入庫No.管理フラグ
	* @param errSts エラー時に登録するエラーステータス
	* @return List<MultiPickingListPrintDto> マルチピッキングリスト取得用DTOリスト
	*/
	public List<MultiPickingListDto> getMultiDataList(TPickingR tPickingR, String storeNoFlg, ErrorStatus errSts) {

		List<MultiPickingListDto> dataList = new ArrayList<MultiPickingListDto>();

		return dataList;

	}

	/**
	 * <h2>レポートCDを取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・レポートCDをキーにレポートID取り出し
	 * ・レポートIDを画面用DTOに設定
	 * </pre>
	 * @param pickingListPrintDto レポートDTO
	 * @return PickingListPrintParamDto ピッキングリスト発行画面用DTO
	 */
	public List<String> getReportCdList(TPickingH tPickingH, TPickingR tPickingR, ErrorStatus errSts) {
		List<String> listReportCd = new ArrayList<String>();

		// 発行データ取得
		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.setupSelect_MSalesOrgBySalesOrg();
		cb.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();

		cb.specify().specifyTAllocInstH().specifyTPickingH().derivedTPickingBList().max(new SubQuery<TPickingBCB>() {
			@Override
			public void query(TPickingBCB tPickingBCb) {
				tPickingBCb.specify().columnPickingPaternCd();
				setDelFlg(tPickingBCb);
			}
		}, TShippingInstH.ALIAS_maxPickingPaternCd);

		cb.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		List<TShippingInstH> dataList = tShippingInstHBhv.selectList(cb);

		CDef.ShippingSlipType shippingSlipType = CDef.ShippingSlipType.codeOf(tPickingH.getShippingSlipType());

		for (TShippingInstH data : dataList) {
			// ピッキングパターンCD
			String pickingPaternCd = data.getMaxPickingPaternCd();
			// 出荷区分
			String shippingTypeCd = data.getShippingTypeCd();
			// 個体管理印刷フラグ
			String idManagPrintTypeCd = data.chaseTAllocInstH().chaseTPickingH().getIdManagPrintTypeCd();
			// フロア完結区分
			String floorCompFlg = data.getFloorCompFlg();
			// 受注伝票タイプ
			String salesOrderSlipTypeCd = data.getSalesOrderSlipTypeCd();

			switch (shippingSlipType) {
			case $01: // 発行区分で[01：バラ荷揃表]が選択された場合
				if (CU.equals(idManagPrintTypeCd, "01") || CU.equals(idManagPrintTypeCd, "02")) {
					// 個体管理印刷フラグ IN ('01'(預り品)、'02'(個体管理品))

					// ピッキングパターンCDがバラオーダー以外または、預り品または、個体管理品以外の場合
					if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$1.code())) {
						this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_DEPOSIT_OR_ID_MANAG_PRODUCT_EXCEPT_PIECE_ORDER_ERROR);
						return null;
					}
					// バラ荷揃表(個体管理用)
					listReportCd.add(REPORT_CD_PIECE_MANAG);
				} else {
					// ピッキングパターンCDがバラオーダー以外または、通常品以外の場合
					if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$1.code())) {
						this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_NORMAL_PRODUCT_EXCEPT_PIECE_ORDER_ERROR);
						return null;
					}
					// バラ荷揃表
					listReportCd.add(REPORT_CD_PIECE);
				}
				break;
			case $02: // 発行区分で[02：ケース荷揃表]が選択された場合
				// ピッキングパターンCDがケーストータル以外または、出荷区分が直送、店送り以外の場合
				if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$2.code())
						|| (!CU.equals(shippingTypeCd, CDef.ShippingType.$01.code())
								&& !CU.equals(shippingTypeCd, CDef.ShippingType.$03.code()))) {
					this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_DIRECT_OR_STORE_DELIVERY_EXCEPT_CASE_TOTAL_ERROR);
					return null;
				}
				// ケース荷揃表
				listReportCd.add(REPORT_CD_CASE);
				break;
			case $03: // 発行区分で[03：バラトータル荷揃表(戸配)]が選択された場合
				// ピッキングパターンCDがバラトータル以外または、出荷区分が戸配以外の場合
				if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$3.code())
						|| !CU.equals(shippingTypeCd, CDef.ShippingType.$02.code())) {
					this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_KOHAI_DELIVERY_EXCEPT_PIECE_TOTAL_ERROR);
					return null;
				}
				// バラトータル荷揃表(戸配)
				listReportCd.add(REPORT_CD_TOTAL);
				break;
			case $04: // 発行区分で[04：ケース荷揃表(戸配)]が選択された場合
				// ピッキングパターンCDがケーストータル以外または、出荷区分が戸配以外の場合
				if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$2.code())
						|| !CU.equals(shippingTypeCd, CDef.ShippingType.$02.code())) {
					this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_KOHAI_DELIVERY_EXCEPT_CASE_TOTAL_ERROR);
					return null;
				}
				// ケース荷揃表(戸配)
				listReportCd.add(REPORT_CD_INDV_CASE);
				break;
			case $05: // 発行区分で[05：バラトータル荷揃表]が選択された場合
				// ピッキングパターンCDがバラトータル以外または、出荷区分が直送、店送り以外の場合
				if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$3.code())
						|| (!CU.equals(shippingTypeCd, CDef.ShippingType.$01.code())
								&& !CU.equals(shippingTypeCd, CDef.ShippingType.$03.code()))) {
					this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_ACCOUNT_TOTAL_EXCEPT_PIECE_TOTAL_ERROR);
					return null;
				}
				// バラトータル荷揃表
				listReportCd.add(REPORT_CD_PIECE);
				break;
			case $06: // 発行区分で[06：摘み取りリスト]が選択された場合
				// ピッキングパターンCDがバラトータル以外または、出荷区分が直送、店送り以外の場合
				if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$3.code())
						|| (!CU.equals(shippingTypeCd, CDef.ShippingType.$01.code())
								&& !CU.equals(shippingTypeCd, CDef.ShippingType.$03.code()))) {
					this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_OTHER_THAN_DIRECT_OR_STORE_DELIVERY_EXCEPT_CASE_TOTAL_ERROR);
					return null;
				}
				// 摘み取りリスト
				listReportCd.add(REPORT_CD_PL);
				break;
			case $07: // 発行区分で[07：納品書]が選択された場合
				String delivPrintTypeCd = data.chaseTAllocInstH().chaseTPickingH().getDelivPrintTypeCd();
				if (CU.equals(delivPrintTypeCd, "01")) {
					// 納品書印刷区分 = '01'(直送店送納品書)

					// 出荷区分が直送、店送り以外の場合
					if (!CU.equals(shippingTypeCd, CDef.ShippingType.$01.code())
									&& !CU.equals(shippingTypeCd, CDef.ShippingType.$03.code())) {
						this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_EXCEPT_DIRECT_OR_STORE_DELIVERY_ERROR);
						return null;
					}
					// 直送店送納品書
					listReportCd.add(REPORT_CD_SLIP_DOS);
				} else if (CU.equals(delivPrintTypeCd, "02")) {
					// 納品書印刷区分 = '02'(納品明細書(個体管理))

					// 預り品区分が個体管理品以外の場合
					if (!CU.equals(idManagPrintTypeCd, "02")) {
						this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_REPRINT_EXCEPT_ID_MANG_PRODUCT_ERROR);
						return null;
					}
					// 納品明細書(個体管理)
					listReportCd.add(REPORT_CD_SLIP_MANAG);
				} else if (CU.equals(delivPrintTypeCd, "03")) {
					// 納品書印刷区分 = '03'(EC納品書)

					// 受注伝票タイプがEコマースの場合
					if (CU.equals(salesOrderSlipTypeCd, "ZBB7")) {
						this.getErrorManager().add(errSts, WmsMessageConst.EC_DELIVERY_SLIP_CANNOT_PRINT_EXCEPT_EC_ORDER_ERROR);
						return null;
					}
					// EC納品書
					listReportCd.add(REPORT_CD_SLIP_EC);
				} else if (CU.equals(delivPrintTypeCd, "04")) {
					// 納品書印刷区分 = '04'(物品送付案内書)

					// ピッキングパターンCDがバラオーダー以外または、
					// 出荷区分が直送、店送りで預り品区分が預り品以外の場合または、
					// 出荷区分が戸配で預り品が通常品且つ、フロア完結区分がフロア完結しないの場合
					if (!CU.equals(pickingPaternCd, CDef.PickingPatternCd.$1.code()) ||
							(CU.equals(shippingTypeCd, CDef.ShippingType.$01.code())
									&& CU.equals(shippingTypeCd, CDef.ShippingType.$03.code())
									&& CU.equals(idManagPrintTypeCd, "01"))
							||
							(CU.equals(shippingTypeCd, CDef.ShippingType.$02.code())
									&& !CU.equals(idManagPrintTypeCd, "01")
									&& !CU.equals(idManagPrintTypeCd, "02")
									&& CU.equals(floorCompFlg, "0"))) {
						this.getErrorManager().add(errSts, WmsMessageConst.PICKING_PATTERN_CANNOT_REPRINT_ERROR);
						return null;
					}
					// 物品送付案内書
					listReportCd.add(REPORT_CD_GUIDE);
				}
				break;
			case $08: // 発行区分で[08：荷札]が選択された場合
				String tagPrintTypeCd = data.chaseTAllocInstH().chaseTPickingH().getTagPrintTypeCd();
				if (CU.equals(tagPrintTypeCd, "01")) {
					// 荷札印刷区分 = '01'(汎用荷札)
					// 汎用荷札
					listReportCd.add(REPORT_CD_TAG_COMMON);
				} else if (CU.equals(tagPrintTypeCd, "02")) {
					// 荷札印刷区分 = '02'(荷札ヤマト)
					// 荷札ヤマト
					listReportCd.add(REPORT_CD_TAG_YMT);
				} else if (CU.equals(tagPrintTypeCd, "03")) {
					// 荷札印刷区分 = '03'(荷札JP)
					// 荷札JP
					listReportCd.add(REPORT_CD_TAG_JP);
				}
				break;
			case $09: // 発行区分で[09：一体型伝票(荷札、納品書)]が選択された場合
				String integPrintFlg = data.chaseTAllocInstH().chaseTPickingH().getIntegPrintFlg();
				if (CU.equals(integPrintFlg, "1")) {
					// 一体型伝票印刷フラグ = '1'
					// 戸配一体型伝票(荷札、納品書)
					listReportCd.add(REPORT_CD_SLIP_ALL);
				}
				break;
			case $10: // 発行区分で[10：梱包明細]が選択された場合
				// 梱包明細
				listReportCd.add(REPORT_CD_SCM);
				break;
			case $11: // 発行区分で[11：個別貼り付けラベル]が選択された場合
				// 個別貼り付けラベル
				listReportCd.add(REPORT_CD_INDV);
				break;
			case $12: // 発行区分で[12：個人別支給明細]が選択された場合
				// 個人別支給明細
				listReportCd.add(REPORT_CD_INDV_DETAIL);
				break;
			default:
				getErrorManager().throwException(new IllegalStateException("ShippingSlipType is illegal."));
				listReportCd.add("");
				break;
			}
		}

		return listReportCd;
	}

	/**
	 * <h2>帳票出力済フラグ、日時更新。</h2>
	 * <pre>
	 * 引数を絞り込み条件に設定し、帳票出力済フラグ、日時を更新する。
	 * </pre>
	 * @param tPickingH 出庫ヘッダ
	 * @param controlNo コントロールNo.
	 */
	public void updateOutFlg(TPickingH tPickingH, long controlNo) {

		TPickingRCB cb = tPickingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);

		TPickingR update = new TPickingR();

		CDef.ShippingSlipType shippingSlipType = CDef.ShippingSlipType.codeOf(tPickingH.getShippingSlipType());

		switch (shippingSlipType) {
		case $01: // 発行区分で[01：バラ荷揃表]が選択された場合
		case $02: // 発行区分で[02：ケース荷揃表]が選択された場合
		case $03: // 発行区分で[03：バラトータル荷揃表(戸配)]が選択された場合
		case $04: // 発行区分で[04：ケース荷揃表(戸配)]が選択された場合
		case $05: // 発行区分で[05：バラトータル荷揃表]が選択された場合
			update.setNizoroeOutFlg("1");
			update.setNizoroeOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $06: // 発行区分で[06：摘み取りリスト]が選択された場合
			update.setPlOutFlg_$1();
			update.setPlOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $07: // 発行区分で[07：納品書]が選択された場合
			update.setDelivOutFlg("1");
			update.setDelivOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $08: // 発行区分で[08：荷札]が選択された場合
			update.setTagOutFlg("1");
			update.setTagOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $09: // 発行区分で[09：一体型伝票(荷札、納品書)]が選択された場合
			update.setTagOutFlg("1");
			update.setTagOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			update.setPllOutFlg("1");
			update.setPllOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $10: // 発行区分で[10：梱包明細]が選択された場合
			update.setPllOutFlg("1");
			update.setPllOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $11: // 発行区分で[11：個別貼り付けラベル]が選択された場合
			update.setIndvSupplyOutFlg("1");
			update.setIndvSupplyOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		case $12: // 発行区分で[12：個人別支給明細]が選択された場合
			update.setIndvLabelOutFlg("1");
			update.setIndvLabelOutDt(new java.sql.Timestamp(System.currentTimeMillis()));
			break;
		default:
			getErrorManager().throwException(new IllegalStateException("ShippingSlipType is illegal."));
			break;
		}

		tPickingRBhv.queryUpdate(update, cb);
	}

	/**
	 * <h2>直送店送納品書データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから直送店送納品書データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> getDirectOrStoreDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TPickingH> result = null;

		// ===== 直送店送納品書発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();
		tPickingHCB.setupSelect_TAllocInstH();
		tPickingHCB.setupSelect_TAllocInstH().withMCenter();
		tPickingHCB.setupSelect_TAllocInstH().withMDeliveryCourse();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		tPickingHCB.query().queryTPickingRAsOne().addOrderBy_DelivOutFlg_Asc();
		tPickingHCB.query().queryTAllocInstH().queryMCenter().addOrderBy_CenterCd_Asc();

		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				subCB.setupSelect_TStock().withMProduct();
				subCB.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
			}
		});

		// 出荷指示ヘッダを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTShippingInstHList(new ConditionBeanSetupper<TShippingInstHCB>() {
					public void setup(TShippingInstHCB subCB) {
						subCB.setupSelect_MSalesOrgBySalesOrg();
						subCB.query().addOrderBy_WorkDt_Asc();
						subCB.query().addOrderBy_PickingBatchNo_Asc();
						subCB.query().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
						subCB.query().addOrderBy_DaihyoNizoroeNo_Asc();
						subCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo_Asc();
						subCB.query().addOrderBy_ClientShippingNo_Asc();
					}
				});
			}
		});

		// 引当指示ボディを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTAllocInstBList(new ConditionBeanSetupper<TAllocInstBCB>() {
					public void setup(TAllocInstBCB subCB) {
						subCB.query().setDelFlg_Equal_$0();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTAllocInstB>() {
					// 出荷指示ボディを検索
					public void handle(LoaderOfTAllocInstB subLoader) {
						subLoader.loadTShippingInstBList(new ConditionBeanSetupper<TShippingInstBCB>() {
							public void setup(TShippingInstBCB subCB) {
								subCB.query().setDelFlg_Equal_$0();
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>EC納品書データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからEC納品書データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> getECDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TPickingH> result = null;

		// ===== EC納品書発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();
		tPickingHCB.setupSelect_TAllocInstH();
		tPickingHCB.setupSelect_TAllocInstH().withMCenter();
		tPickingHCB.setupSelect_TAllocInstH().withMDeliveryCourse();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		if (tPickingR.getTPickingH() != null) {
			tPickingHCB.query().setNizoroeNo2_Equal(tPickingR.getTPickingH().getNizoroeNo2());
		}

		tPickingHCB.query().queryTPickingRAsOne().addOrderBy_DelivOutFlg_Asc();

		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				subCB.setupSelect_TStock().withMProduct();
				subCB.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
			}
		});

		// 出荷指示ヘッダを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTShippingInstHList(new ConditionBeanSetupper<TShippingInstHCB>() {
					public void setup(TShippingInstHCB subCB) {
						subCB.setupSelect_MSalesOrgBySalesOrg();
						subCB.query().addOrderBy_OrderDt_Asc();
						subCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
						subCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo_Asc();
						subCB.query().addOrderBy_KokyakuCd_Asc();
						subCB.query().addOrderBy_ClientShippingNo_Asc();
						subCB.query().addOrderBy_WorkDt_Asc();
					}
				});
			}
		});

		// 引当指示ボディを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTAllocInstBList(new ConditionBeanSetupper<TAllocInstBCB>() {
					public void setup(TAllocInstBCB subCB) {
						subCB.query().setDelFlg_Equal_$0();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTAllocInstB>() {
					// 出荷指示ボディを検索
					public void handle(LoaderOfTAllocInstB subLoader) {
						subLoader.loadTShippingInstBList(new ConditionBeanSetupper<TShippingInstBCB>() {
							public void setup(TShippingInstBCB subCB) {
								subCB.query().setDelFlg_Equal_$0();
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>物品送付案内書データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから物品送付案内書データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> getGoodsSendingDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TPickingH> result = null;

		// ===== 物品送付案内書発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();
		tPickingHCB.setupSelect_TAllocInstH();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		if (tPickingR.getTPickingH() != null) {
			tPickingHCB.query().setNizoroeNo2_Equal(tPickingR.getTPickingH().getNizoroeNo2());
		}

		tPickingHCB.query().queryTPickingRAsOne().addOrderBy_DelivOutFlg_Asc();
		tPickingHCB.query().queryTAllocInstH().queryMCenter().addOrderBy_CenterCd_Asc();

		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				subCB.setupSelect_TStock().withMProduct();
			}
		});

		// 出荷指示ヘッダを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTShippingInstHList(new ConditionBeanSetupper<TShippingInstHCB>() {
					public void setup(TShippingInstHCB subCB) {
						subCB.setupSelect_MSalesOrgBySalesOrg();
						subCB.query().addOrderBy_WorkDt_Asc();
						subCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
						subCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo_Asc();
					}
				});
			}
		});

		// 引当指示ボディを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTAllocInstBList(new ConditionBeanSetupper<TAllocInstBCB>() {
					public void setup(TAllocInstBCB subCB) {
						subCB.setupSelect_MProduct();
						subCB.query().queryMProduct().addOrderBy_ProductNm_Asc();
						subCB.query().addOrderBy_AllocNum_Asc();
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>摘み取りリストデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから摘み取りリストデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> getPLDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TPickingH> result = null;

		// ===== 摘み取りリスト発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();
		tPickingHCB.setupSelect_TAllocInstH();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		tPickingHCB.query().addOrderBy_NizoroeNo2_Asc();
		tPickingHCB.query().addOrderBy_DaihyoNizoroeNo2_Asc();

		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出庫ボディを検索
		tPickingHBhv.loadTPickingBList(result, new ConditionBeanSetupper<TPickingBCB>() {
			public void setup(TPickingBCB subCB) {
				subCB.setupSelect_TStock().withMProduct();
				subCB.setupSelect_TStock().withTLot();
			}
		});

		// 出荷指示ヘッダを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.pulloutTAllocInstH().loadTShippingInstHList(new ConditionBeanSetupper<TShippingInstHCB>() {
					public void setup(TShippingInstHCB subCB) {
						subCB.setupSelect_MCenter();
						subCB.setupSelect_MDeliveryCourse();
						subCB.setupSelect_MSalesOrgBySalesOrg();
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>納品明細書(個体管理)データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから納品明細書(個体管理)データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstH> 出荷指示ヘッダリスト
	 */
	public List<TShippingInstH> getIdManagDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TShippingInstH> result = null;

		// ===== 納品明細書(個体管理)発行データ取得 =====
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_MSalesOrgBySalesOrg();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();

		// 検索条件の設定
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		tShippingInstHCB.query().addOrderBy_DaihyoNizoroeNo_Asc();
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo_Asc();
		tShippingInstHCB.query().addOrderBy_ClientShippingNo_Asc();

		// 検索実行
		result = selectListToReport(tShippingInstHBhv, tShippingInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出荷指示ボディを検索
		tShippingInstHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstH>() {
			public void handle(LoaderOfTShippingInstH loader) {
				loader.loadTShippingInstBList(new ConditionBeanSetupper<TShippingInstBCB>() {
					public void setup(TShippingInstBCB subCB) {
						subCB.setupSelect_MProduct();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
					// 出庫ボディを検索
					public void handle(LoaderOfTShippingInstB subLoader) {
						subLoader.loadTPickingBList(new ConditionBeanSetupper<TPickingBCB>() {
							public void setup(TPickingBCB subCB) {
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>荷札JPデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷札JPデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstH> 出荷指示ヘッダリスト
	 */
	public List<TShippingInstH> getTagLabelJpDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TShippingInstH> result = null;

		// ===== 荷札JP発行データ取得 =====
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_MDeliveryCourse();
		tShippingInstHCB.setupSelect_MCenter();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();

		// 検索条件の設定
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		if (tPickingR.getTPickingH() != null) {
			tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().setNizoroeNo2_Equal(tPickingR.getTPickingH().getNizoroeNo2());
		}

		// 検索実行
		result = selectListToReport(tShippingInstHBhv, tShippingInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出荷指示ボディを検索
		tShippingInstHBhv.loadTShippingInstBList(result, new ConditionBeanSetupper<TShippingInstBCB>() {
			public void setup(TShippingInstBCB subCB) {
				subCB.query().addOrderBy_WarehouseCd_Asc();
			}
		});

		// 梱包ヘッダを検索
		tShippingInstHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstH>() {
			public void handle(LoaderOfTShippingInstH loader) {
				loader.pulloutTAllocInstH().loadTPackingHList(new ConditionBeanSetupper<TPackingHCB>() {
					public void setup(TPackingHCB subCB) {
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().addOrderBy_ShippingPackingNo_Asc();
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>戸配_一体型伝票(荷札、納品書)データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから戸配_一体型伝票(荷札、納品書)データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return Map<String, Map<String, Map<String, List<?>>>> 戸配_一体型伝票(荷札、納品書)データ
	 */
	public Map<String, Map<String, Map<String, List<?>>>> getAllInOneDataList(TPickingR tPickingR, ErrorStatus errSts) {

		// ===== 発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		tPickingHCB.query().setIntegPrintFlg_Equal("1");
		tPickingHCB.query().addOrderBy_NizoroeNo2_Asc();

		List<TPickingH> tPickingHList = tPickingHBhv.selectList(tPickingHCB);

		Map<String, Map<String, Map<String, List<?>>>> result = new HashMap<>();

		for (TPickingH tPickingH : tPickingHList) {
			Map<String, Map<String, List<?>>> dataMap = new HashMap<>();

			// 荷札印刷区分
			String tagPrintTypeCd = tPickingH.getTagPrintTypeCd();
			// 納品書印刷区分
			String delivPrintTypeCd = tPickingH.getDelivPrintTypeCd();

			tPickingR.setTPickingH(tPickingH);

			Map<String, List<?>> tagMap = new HashMap<>();
			// ===== 荷札発行データ取得 =====
			if (CU.equals(tagPrintTypeCd, "01")) {
				// 荷札印刷区分 = '01'(汎用荷札)
				// 汎用荷札
				// 外出しSQLの定義
				String path = TAllocInstHBhv.PATH_selectSqlTagLabelCommon;

				// 検索条件の設定
				SqlTagLabelCommonPmb pmb = new SqlTagLabelCommonPmb();
				pmb.setControlNo(tPickingR.getControlNo());
				pmb.setNizoroeNo2(tPickingH.getNizoroeNo2());

				// 検索実行
				List<SqlTagLabelCommon> tagLabelList = selectList(tAllocInstHBhv, path, pmb, SqlTagLabelCommon.class);

				tagMap.put(tagPrintTypeCd, tagLabelList);
				dataMap.put("TAG", tagMap);
			} else if (CU.equals(tagPrintTypeCd, "02")) {
				// 荷札印刷区分 = '02'(荷札ヤマト)
				// 荷札ヤマト
				// 外出しSQLの定義
				String path = TShippingInstHBhv.PATH_selectSqlTagLabelYamato;

				// 検索条件の設定
				SqlTagLabelYamatoPmb pmb = new SqlTagLabelYamatoPmb();
				pmb.setControlNo(tPickingR.getControlNo());
				pmb.setNizoroeNo2(tPickingH.getNizoroeNo2());

				// 検索実行
				List<SqlTagLabelYamato> tagLabelList = selectList(tShippingInstHBhv, path, pmb, SqlTagLabelYamato.class);

				tagMap.put(tagPrintTypeCd, tagLabelList);
				dataMap.put("TAG", tagMap);
			} else if (CU.equals(tagPrintTypeCd, "03")) {
				// 荷札印刷区分 = '03'(荷札JP)
				// 荷札JP
				List<TShippingInstH> tagLabelList = this.getTagLabelJpDataList(tPickingR, errSts);

				tagMap.put(tagPrintTypeCd, tagLabelList);
				dataMap.put("TAG", tagMap);
			}

			Map<String, List<?>> delivMap = new HashMap<>();
			// ===== 納品書発行データ取得 =====
			if (CU.equals(delivPrintTypeCd, "03")) {
				// 納品書印刷区分 = '03'(EC納品書)

				// EC納品書
				List<TPickingH> deliverySlipList = this.getECDataList(tPickingR, errSts);

				delivMap.put(delivPrintTypeCd, deliverySlipList);
				dataMap.put("DELIV", delivMap);
			} else if (CU.equals(delivPrintTypeCd, "04")) {
				// 納品書印刷区分 = '04'(物品送付案内書)

				// 物品送付案内書
				List<TPickingH> deliverySlipList = this.getGoodsSendingDataList(tPickingR, errSts);

				delivMap.put(delivPrintTypeCd, deliverySlipList);
				dataMap.put("DELIV", delivMap);
			}

			result.put(tPickingH.getNizoroeNo2(), dataMap);
		}

		return result;
	}

	/**
	 * <h2>梱包明細ラベルデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから梱包明細ラベルデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> getPackingListLabelDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TPickingH> result = null;

		// ===== 梱包明細ラベル発行データ取得 =====
		TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();
		tPickingHCB.setupSelect_TPickingRAsOne();
		tPickingHCB.setupSelect_TAllocInstH();

		// 検索条件の設定
		tPickingHCB.query().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		tPickingHCB.query().addOrderBy_NizoroeNo_Asc();

		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 梱包ヘッダを検索
		tPickingHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTPickingH>() {
			public void handle(LoaderOfTPickingH loader) {
				loader.loadTPackingHList(new ConditionBeanSetupper<TPackingHCB>() {
					public void setup(TPackingHCB subCB) {
						subCB.query().setDelFlg_Equal_$0();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTPackingH>() {
					// 梱包ボディを検索
					public void handle(LoaderOfTPackingH subLoader) {
						subLoader.loadTPackingBList(new ConditionBeanSetupper<TPackingBCB>() {
							public void setup(TPackingBCB subCB) {
								subCB.setupSelect_TPickingB().withTStock().withMProduct();
								subCB.query().queryTPickingB().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
								subCB.query().addOrderBy_PackingNum_Asc();
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>個別貼り付けラベルデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから個別貼り付けラベルデータを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstH> 出荷指示ヘッダリスト
	 */
	public List<TShippingInstH> getIndvLabelDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TShippingInstH> result = null;

		// ===== 個別貼り付けラベル発行データ取得 =====
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();

		// 検索条件の設定
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());
		tShippingInstHCB.query().addOrderBy_NizoroeNo_Asc();

		// 検索実行
		result = selectListToReport(tShippingInstHBhv, tShippingInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出荷指示ボディを検索
		tShippingInstHBhv.loadTShippingInstBList(result, new ConditionBeanSetupper<TShippingInstBCB>() {
			public void setup(TShippingInstBCB subCB) {
				subCB.setupSelect_MProduct();
				subCB.query().addOrderBy_EmpIdCd_Asc();
				subCB.query().addOrderBy_ProductCd_Asc();
				subCB.query().queryMProduct().addOrderBy_ProductNm_Asc();
			}
		});

		// 出荷指示ボディを検索
		tShippingInstHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstH>() {
			public void handle(LoaderOfTShippingInstH loader) {
				loader.loadTShippingInstBList(new ConditionBeanSetupper<TShippingInstBCB>() {
					public void setup(TShippingInstBCB subCB) {
						subCB.setupSelect_MProduct();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
					// 出庫ボディを検索
					public void handle(LoaderOfTShippingInstB subLoader) {
						subLoader.loadTPickingBList(new ConditionBeanSetupper<TPickingBCB>() {
							public void setup(TPickingBCB subCB) {
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>個人別支給明細データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから個人別支給明細データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TShippingInstH> 出荷指示ヘッダリスト
	 */
	public List<TShippingInstH> getIndvSupplyDetailDataList(TPickingR tPickingR, ErrorStatus errSts) {
		List<TShippingInstH> result = null;

		// =====個人別支給明細発行データ取得 =====
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_MSalesOrgBySalesOrg();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();

		// 検索条件の設定
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo_Asc();
		tShippingInstHCB.query().addOrderBy_DelivCustomerCd_Asc();
		tShippingInstHCB.query().addOrderBy_DelivCustomerCd_Asc();

		// 検索実行
		result = selectListToReport(tShippingInstHBhv, tShippingInstHCB);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出荷指示ボディを検索
		tShippingInstHBhv.loadTShippingInstBList(result, new ConditionBeanSetupper<TShippingInstBCB>() {
			public void setup(TShippingInstBCB subCB) {
				subCB.setupSelect_MProduct();
				subCB.query().addOrderBy_WarehouseCd_Asc();
			}
		});

		// 出荷指示ボディを検索
		tShippingInstHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstH>() {
			public void handle(LoaderOfTShippingInstH loader) {
				loader.loadTShippingInstBList(new ConditionBeanSetupper<TShippingInstBCB>() {
					public void setup(TShippingInstBCB subCB) {
						subCB.setupSelect_MProduct();
					}
				}).withNestedReferrer(new ReferrerLoaderHandler<LoaderOfTShippingInstB>() {
					// 出庫ボディを検索
					public void handle(LoaderOfTShippingInstB subLoader) {
						subLoader.loadTPickingBList(new ConditionBeanSetupper<TPickingBCB>() {
							public void setup(TPickingBCB subCB) {
							}
						});
					}
				});
			}
		});

		return result;
	}

	/**
	 * <h2>バラ荷揃表データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからバラ荷揃表データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PiecePickingListDto> バラ荷揃表発行データリスト
	 */
	public List<PiecePickingListDto> getPieceNizoroeDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<PiecePickingListDto> dataList = new ArrayList<PiecePickingListDto>();

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withMLocation().withMZone();

		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMDeliveryCourse();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withBClassDtlByShippingTypeCd().withVDict(getCultureId());
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMSalesOrgBySalesOrg();

		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTPickingH().addOrderBy_NizoroeNo_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ProdDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ReceiveDt_Asc();
		cb.query().addOrderBy_PickedNum_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		String weekDays = "";
		String holidays = "";
		String specifyDeliveryDt = "";
		String centerCd = "";

		for (TPickingB result : selectList) {

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				TLot tLot = new TLot();
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			PiecePickingListDto dto = new PiecePickingListDto();

			// オーダーID
			dto.setOrderId(result.getTShippingInstB().getTShippingInstH().getClientShippingNo());
			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日時
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 出荷区分
			dto.setShippingTypeNm(result.getTShippingInstB().getTShippingInstH().getBClassDtlByShippingTypeCd().getVDict().getDictNm());
			// 配達指定日
			dto.setSpecifyDeliveryDt(result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt());
			// 配達指定日が空でない場合、曜日を取得する
			if (!CU.isNullOrEmpty(result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt())) {
				specifyDeliveryDt = result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt();
				weekDays = this.getDayOfWeek(specifyDeliveryDt);
				// センタCdが空でない場合、祝日を取得する
				if (!CU.isNullOrEmpty(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd())) {
					centerCd = result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd();
					holidays = this.getHolidays(specifyDeliveryDt, centerCd);
					if (!CU.isNullOrEmpty(holidays)) {
						holidays = "・" + holidays;
					}
				}
			}
			// 曜日、祝日
			dto.setHolidays(weekDays + holidays);
			// 荷揃番号
			dto.setNizoroeNo2(result.getTPickingH().getNizoroeNo2());
			// 荷揃番号(バーコード)
			dto.setNizoroeNoBarCd(result.getTPickingH().getNizoroeNo());
			// 荷揃番号
			dto.setNizoroeNo(result.getTPickingH().getNizoroeNo());
			// 運送便Cd
			dto.setDeliveryCourseCd(result.getTShippingInstB().getTShippingInstH().getDeliveryCourseCd());
			// 運送便名称
			dto.setDeliveryCourseNm(result.getTShippingInstB().getTShippingInstH().getMDeliveryCourse().getDeliveryCourseNm());
			// 送り先
			dto.setDelivZipCd(result.getTShippingInstB().getTShippingInstH().getDelivZipCd());
			// 届先住所1
			dto.setDelivAddress1(result.getTShippingInstB().getTShippingInstH().getDelivAddress1());
			// 届先住所2
			dto.setDelivAddress2(result.getTShippingInstB().getTShippingInstH().getDelivAddress2());
			// 届先名称1
			dto.setDelivCustomerNm1(result.getTShippingInstB().getTShippingInstH().getDelivCustomerNm1());
			// 届先名称2
			dto.setDelivCustomerNm2(result.getTShippingInstB().getTShippingInstH().getDelivCustomerNm2());
			// 取扱部門
			dto.setSalesOrgCd(result.getTShippingInstB().getTShippingInstH().getSalesOrgCd());
			// 店販社名称１
			dto.setTenhanshaNm1(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaNm1());
			// 店販社名称２
			dto.setTenhanshaNm2(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaNm2());
			// 店販社住所１
			dto.setTenhanshaAddress1(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaAddress1());
			// 店販社住所２
			dto.setTenhanshaAddress2(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaAddress2());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品名称
			dto.setProductNm(result.getTStock().getMProduct().getProductNm());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 数量
			dto.setPickedNum(result.getPickedNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);
		}

		return dataList;
	}

	/**
	 * <h2>曜日を取得する</h2>
	 *
	 * <pre>
	 * 曜日を取得する
	 * </pre>
	 * @param specifyDeliveryDt 配達指定日
	 * @return dayOfWeek 曜日
	 */
	public String getDayOfWeek(String specifyDeliveryDt) {
		// 日付フォーマット用
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		// 日付型の変換
		LocalDate date = LocalDate.parse(specifyDeliveryDt, formatter);

		// ==== 曜日CDを取得する ====
		DayOfWeek dayOfWeek = date.getDayOfWeek();

		String dayOfWeekCd = "";
		switch(dayOfWeek.getValue()) {

		case 1:
	        //月曜日
			dayOfWeekCd = MANDAY;
			break;
	    case 2:
	        //火曜日
	    	dayOfWeekCd = TUESDAY;
	    	break;
	    case 3:
	        //水曜日
	    	dayOfWeekCd = WEDNESDAY;
	    	break;
	    case 4:
	        //木曜日
	    	dayOfWeekCd = THURSDAY;
	    	break;
	    case 5:
	        //金曜日
	    	dayOfWeekCd = FRIDAY;
	    	break;
	    case 6:
	        //土曜日
	    	dayOfWeekCd = SATURDAY;
	    	break;
	    case 7:
	    	//日曜日
	    	dayOfWeekCd = SUNDAY;
	    	break;
		}
		return dayOfWeekCd;
	}

	/**
	 * <h2>祝日を取得する</h2>
	 *
	 * <pre>
	 * 祝日を取得する
	 * </pre>
	 * @param specifyDeliveryDt 配達指定日
	 * @return dayOfWeek 祝日
	 */
	public String getHolidays(String specifyDeliveryDt, String centerCd) {
		// 祝日データ取得処理

		MHolidayCB cb = mHolidayBhv.newConditionBean();

		cb.setupSelect_BClassDtlByNationalHolidayFlg().withVDict(getCultureId());
		// 拠点CD
		cb.query().setBaseCd_Equal(centerCd);
		// カレンダー日付
		cb.query().setCalenderDt_Equal(specifyDeliveryDt);
		// 祝日フラグ = '1'
		cb.query().setNationalHolidayFlg_Equal_$1();
		cb.fetchFirst(1);

		// 検索結果
		MHoliday selecEntity = mHolidayBhv.selectEntity(cb);

		String holidays = "";
		if (selecEntity != null && selecEntity.getBClassDtlByNationalHolidayFlg() != null
				&& selecEntity.getBClassDtlByNationalHolidayFlg().getVDict() != null) {
			holidays = selecEntity.getBClassDtlByNationalHolidayFlg().getVDict().getDictNm().substring(0, 1);
		}

		return holidays;
	}

	/**
	 * <h2>バラ荷揃表(預り品・個体管理用)データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからバラ荷揃表(預り品・個体管理用)データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PieceNizoroeListIdManagDto> バラ荷揃表(預り品・個体管理用)発行データリスト
	 */
	public List<PieceNizoroeListIdManagDto> getPieceNizoroeIdManagDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<PieceNizoroeListIdManagDto> dataList = new ArrayList<PieceNizoroeListIdManagDto>();

		List<String> idManagPrintTypeCdList = new ArrayList<String>();
		// '01'(預り品)
		idManagPrintTypeCdList.add("01");
		// '02'(個体管理品)
		idManagPrintTypeCdList.add("02");

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMClient();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMDeliveryCourse();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMClient();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withBClassDtlByShippingTypeCd().withVDict(getCultureId());
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMSalesOrgBySalesOrg();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCustomerBySupplyCustomerId();

		// 個体管理印刷区分
		cb.query().queryTPickingH().setIdManagPrintTypeCd_InScope(idManagPrintTypeCdList);
		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMClient().addOrderBy_ClientCd_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_DeliveryCourseCd_Asc();
		cb.query().queryTPickingH().addOrderBy_NizoroeNo_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ProdDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ReceiveDt_Asc();
		cb.query().addOrderBy_PickedNum_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		String weekDays = "";
		String holidays = "";
		String specifyDeliveryDt = "";
		String centerCd = "";

		for (TPickingB result : selectList) {

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				TLot tLot = new TLot();
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			PieceNizoroeListIdManagDto dto = new PieceNizoroeListIdManagDto();

			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日付
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd")
					.format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// 帳票発行時刻
			dto.setNizoroeOutTime(new SimpleDateFormat("HH:mm")
					.format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 出荷区分
			dto.setShippingTypeNm(result.getTShippingInstB().getTShippingInstH().getBClassDtlByShippingTypeCd().getVDict().getDictNm());
			// 配達指定日
			dto.setSpecifyDeliveryDt(result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt());
			// 配達指定日が空でない場合、曜日を取得する
			if (!CU.isNullOrEmpty(result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt())) {
				specifyDeliveryDt = result.getTShippingInstB().getTShippingInstH().getSpecifyDeliveryDt();
				weekDays = this.getDayOfWeek(specifyDeliveryDt);
				// センタCdが空でない場合、祝日を取得する
				if (!CU.isNullOrEmpty(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd())) {
					centerCd = result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd();
					holidays = this.getHolidays(specifyDeliveryDt, centerCd);
					if (!CU.isNullOrEmpty(holidays)) {
						holidays = "・" + holidays;
					}
				}
			}
			// 曜日、祝日
			dto.setHolidays(weekDays + holidays);
			// 荷揃番号
			dto.setNizoroeNo2(result.getTPickingH().getNizoroeNo2());
			// 荷揃番号(バーコード)
			dto.setNizoroeNoBarCd(result.getTPickingH().getNizoroeNo());
			// 荷揃番号
			dto.setNizoroeNo(result.getTPickingH().getNizoroeNo());
			// 運送便Cd
			dto.setDeliveryCourseCd(result.getTShippingInstB().getTShippingInstH().getDeliveryCourseCd());
			// 運送便名称
			dto.setDeliveryCourseNm(result.getTShippingInstB().getTShippingInstH().getMDeliveryCourse().getDeliveryCourseNm());
			// ユーザ
			dto.setCustomerNm(result.getTShippingInstB().getTShippingInstH().getMCustomerByAccoutId().getCustomerNm());
			// 送り先
			dto.setDelivZipCd(result.getTShippingInstB().getTShippingInstH().getDelivZipCd());
			// 届先住所1
			dto.setDelivAddress1(result.getTShippingInstB().getTShippingInstH().getDelivAddress1());
			// 届先住所2
			dto.setDelivAddress2(result.getTShippingInstB().getTShippingInstH().getDelivAddress2());
			// 取扱部門
			dto.setSalesOrgCd(result.getTShippingInstB().getTShippingInstH().getSalesOrgCd());
			// 店販社名称１
			dto.setTenhanshaNm1(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaNm1());
			// 店販社名称２
			dto.setTenhanshaNm2(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaNm2());
			// 店販社住所１
			dto.setTenhanshaAddress1(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaAddress1());
			// 店販社住所２
			dto.setTenhanshaAddress2(result.getTShippingInstB().getTShippingInstH().getMSalesOrgBySalesOrg().getTenhanshaAddress2());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品名称
			dto.setProductNm(result.getTStock().getMProduct().getProductNm());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 数量
			dto.setPickedNum(result.getPickedNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);

		}

		return dataList;
	}

	/**
	 * <h2>ケース荷揃表データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからケース荷揃表データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<CasePickingListDto> ケース荷揃表発行データリスト
	 */
	public List<CasePickingListDto> getCasePickingDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<CasePickingListDto> dataList = new ArrayList<CasePickingListDto>();

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withMWarehouse();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withMLocation().withMZone();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMDeliveryCourse();
		//梱包ヘッダの梱包ヘッダIDのCOUNT値を抽出
		cb.specify().specifyTPickingH().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB subCB) {
				subCB.specify().columnPackingHId();
				setDelFlg(subCB);
			}
		}, TPickingB.ALIAS_sumPackingCount);
		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTPickingH().queryTPickingRAsOne().addOrderBy_NizoroeOutFlg_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTStock().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ProdDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ReceiveDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_DelivCustomerCd_Asc();
		cb.query().addOrderBy_PickedNum_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		for (TPickingB result : selectList) {

			// 配送コースマスタデータが存在しない場合
			if(result.getTShippingInstB().getTShippingInstH().getMDeliveryCourse() == null) {
				MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
				result.getTShippingInstB().getTShippingInstH().setMDeliveryCourse(mDeliveryCourse);
			}

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				MZone mZone = new MZone();
				TLot tLot = new TLot();
				mLocation.setMZone(mZone);
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			CasePickingListDto dto = new CasePickingListDto();

			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日時
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 運送便Cd
			dto.setDeliveryCourseCd(result.getTShippingInstB().getTShippingInstH().getMDeliveryCourse().getDeliveryCourseCd());
			// 運送便名称
			dto.setDeliveryCourseNm(result.getTShippingInstB().getTShippingInstH().getMDeliveryCourse().getDeliveryCourseNm());
			// 総ケース数
			dto.setPickedTotal(result.getSumPackingCount());
			// 代表荷揃番号
			dto.setDaihyoNizoroeNo2(result.getTPickingH().getDaihyoNizoroeNo2());
			// 代表荷揃番号（バーコード)
			dto.setDaihyoNizoroeNoBarCd(result.getTPickingH().getDaihyoNizoroeNo());
			// 代表荷揃番号ハイフンなし
			dto.setDaihyoNizoroeNo(result.getTPickingH().getDaihyoNizoroeNo());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品名称
			dto.setProductNm(result.getTStock().getMProduct().getProductNm());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// 送り先届先住所1
			dto.setDelivAddress1(result.getTShippingInstB().getTShippingInstH().getDelivAddress1());
			// 送り先届先住所2
			dto.setDelivAddress2(result.getTShippingInstB().getTShippingInstH().getDelivAddress2());
			// 送り先届先住所3
			dto.setDelivAddress3(result.getTShippingInstB().getTShippingInstH().getDelivAddress3());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// 出庫数
			dto.setPickedNum(result.getPickedNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);

		}

		return dataList;
	}

	/**
	 * <h2>バラトータル荷揃表(戸配)データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからバラトータル荷揃表(戸配)データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<IndividualPieceTotalPickingListDto> バラトータル荷揃表(戸配)発行データリスト
	 */
	public List<IndividualPieceTotalPickingListDto> getIndivdualPieceTotalPickingDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<IndividualPieceTotalPickingListDto> dataList = new ArrayList<IndividualPieceTotalPickingListDto>();

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withMLocation().withMZone();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();

		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTPickingH().queryTPickingRAsOne().addOrderBy_NizoroeOutFlg_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
		cb.query().queryTPickingH().addOrderBy_PickingGroupNo_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();
		cb.query().addOrderBy_TempNo_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		for (TPickingB result : selectList) {

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				MZone mZone = new MZone();
				TLot tLot = new TLot();
				mLocation.setMZone(mZone);
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			IndividualPieceTotalPickingListDto dto = new IndividualPieceTotalPickingListDto();

			// ピッキンググループNo.
			dto.setPickingGroupNo(result.getTPickingH().getPickingGroupNo());
			// 倉庫CD
			dto.setWarehouseCd(result.getTShippingInstB().getWarehouseCd());
			// 在庫区分CD
			dto.setStockTypeCd(result.getTShippingInstB().getStockTypeCd());
			// 出庫指示バッチNo
			dto.setPickingBatchNo(result.getTShippingInstB().getTShippingInstH().getPickingBatchNo());
			// ゾーンCD
			dto.setZoneCd(result.getTStock().getMLocation().getMZone().getZoneCd());
			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日時
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 戸口契約先Cd
			dto.setKohaiContractorCd(result.getTShippingInstB().getTShippingInstH().getKohaiContractorCd());
			// 戸口契約先名称
			dto.setKohaiContractorNm(result.getTShippingInstB().getTShippingInstH().getKohaiContractorNm());
			// 代表荷揃番号
			dto.setDaihyoNizoroeNo2(result.getTPickingH().getDaihyoNizoroeNo2());
			// 代表荷揃番号（バーコード)
			dto.setDaihyoNizoroeNoBarCd(result.getTPickingH().getDaihyoNizoroeNo());
			// 代表荷揃番号ハイフンなし
			dto.setDaihyoNizoroeNo(result.getTPickingH().getDaihyoNizoroeNo());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品略称
			dto.setProductAbbr(result.getTStock().getMProduct().getProductAbbr());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 出庫数
			dto.setPickedNum(result.getPickedNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);

		}

		return dataList;
	}

	/**
	 * <h2>ケース荷揃表(戸配)データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからケース荷揃表(戸配)データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<IndividualCasePickingListDto> ケース荷揃表(戸配)発行データリスト
	 */
	public List<IndividualCasePickingListDto> getIndividualCasePickingDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<IndividualCasePickingListDto> dataList = new ArrayList<IndividualCasePickingListDto>();

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withMWarehouse();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withMLocation().withMZone();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();

		//梱包ヘッダの梱包ヘッダIDのCOUNT値を抽出
		cb.specify().specifyTPickingH().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
			@Override
			public void query(TPackingHCB subCB) {
				subCB.specify().columnPackingHId();
				setDelFlg(subCB);
			}
		}, TPickingB.ALIAS_sumPackingCount);
		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTPickingH().queryTPickingRAsOne().addOrderBy_NizoroeOutFlg_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTShippingInstB().addOrderBy_WarehouseCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ProdDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_ReceiveDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_DelivCustomerCd_Asc();
		cb.query().addOrderBy_PickedNum_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		for (TPickingB result : selectList) {

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				MZone mZone = new MZone();
				TLot tLot = new TLot();
				mLocation.setMZone(mZone);
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			IndividualCasePickingListDto dto = new IndividualCasePickingListDto();

			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日時
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// 帳票発行時刻
			dto.setNizoroeOutTime(new SimpleDateFormat("HH:mm").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 戸口契約先Cd
			dto.setKohaiContractorCd(result.getTShippingInstB().getTShippingInstH().getKohaiContractorCd());
			// 戸口契約先名称
			dto.setKohaiContractorNm(result.getTShippingInstB().getTShippingInstH().getKohaiContractorNm());
			// 総ケース数
			dto.setPickedTotal(result.getSumPackingCount());
			// 代表荷揃番号
			dto.setDaihyoNizoroeNo2(result.getTPickingH().getDaihyoNizoroeNo2());
			// 代表荷揃番号（バーコード)
			dto.setDaihyoNizoroeNoBarCd(result.getTPickingH().getDaihyoNizoroeNo());
			// 代表荷揃番号ハイフンなし
			dto.setDaihyoNizoroeNo(result.getTPickingH().getDaihyoNizoroeNo());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品名称
			dto.setProductAbbr(result.getTStock().getMProduct().getProductAbbr());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// 出庫数
			dto.setPickedNum(result.getPickedNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);

		}

		return dataList;
	}

	/**
	 * <h2>バラトータル荷揃表データを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからバラトータル荷揃表データを取得する。
	 *
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tPickingR 出庫帳票(更新用)
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PieceTotalPickingListDto> バラトータル荷揃表発行データリスト
	 */
	public List<PieceTotalPickingListDto> getPieceTotalPickingDataList(TPickingR tPickingR, ErrorStatus errSts) {
		// 帳票出力データ取得処理
		List<PieceTotalPickingListDto> dataList = new ArrayList<PieceTotalPickingListDto>();

		TPickingBCB cb = tPickingBBhv.newConditionBean();

		cb.setupSelect_TPickingH();
		cb.setupSelect_TPickingH().withTAllocInstH();
		cb.setupSelect_TPickingH().withTPickingRAsOne();
		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withMLocation();
		cb.setupSelect_TStock().withMLocation().withMZone();

		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCenter();
		cb.setupSelect_TShippingInstB().withTShippingInstH().withBClassDtlByShippingTypeCd().withVDict(getCultureId());
		cb.setupSelect_TShippingInstB().withTShippingInstH().withMCustomerByAccoutId();

		// コントロールNo.
		cb.query().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(tPickingR.getControlNo());

		// 出力順
		cb.query().queryTPickingH().queryTPickingRAsOne().addOrderBy_NizoroeOutFlg_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryTPickingH().queryTAllocInstH().addOrderBy_WorkDt_Asc();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_PickingBatchNo_Asc();
		cb.query().queryTPickingH().addOrderBy_DaihyoNizoroeNo_Asc();
		cb.query().queryTPickingH().addOrderBy_PickingGroupNo_Asc();
		cb.query().queryTShippingInstB().addOrderBy_StockTypeCd_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().queryMZone().addOrderBy_ZoneCd_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_PickingOrder_Asc();
		cb.query().queryTStock().queryMLocation().addOrderBy_LocationCd_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductNm_Asc();
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_LimitDt_Asc();
		cb.query().queryTStock().queryTLot().addOrderBy_Lot_Asc();

		// 検索結果
		List<TPickingB> selectList = tPickingBBhv.selectList(cb);

		for (TPickingB result : selectList) {

			// 在庫データが存在しない場合
			if(result.getTStock() == null) {
				TStock tStock = new TStock();
				MProduct mProduct = new MProduct();
				MLocation mLocation = new MLocation();
				MZone mZone = new MZone();
				TLot tLot = new TLot();
				mLocation.setMZone(mZone);
				tStock.setMProduct(mProduct);
				tStock.setMLocation(mLocation);
				tStock.setTLot(tLot);
				result.setTStock(tStock);
			}

			PieceTotalPickingListDto dto = new PieceTotalPickingListDto();

			// ピッキンググループNo.
			dto.setPickingGroupNo(result.getTPickingH().getPickingGroupNo());
			// 在庫区分CD
			dto.setStockTypeCd(result.getTShippingInstB().getStockTypeCd());
			// 出庫指示バッチNo
			dto.setPickingBatchNo(result.getTShippingInstB().getTShippingInstH().getPickingBatchNo());
			// ゾーンCD
			dto.setZoneCd(result.getTStock().getMLocation().getMZone().getZoneCd());
			// 再発行マーク
			dto.setNizoroeOutFlg(result.getTPickingH().getTPickingRAsOne().getNizoroeOutFlg());
			// 帳票発行日時
			dto.setNizoroeOutDt(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(result.getTPickingH().getTPickingRAsOne().getNizoroeOutDt()));
			// センタCd
			dto.setCenterCd(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterCd());
			// センタ略称
			dto.setCenterAbbr(result.getTShippingInstB().getTShippingInstH().getMCenter().getCenterAbbr());
			// 作業予定日
			dto.setWorkDt(result.getTPickingH().getTAllocInstH().getWorkDt());
			// 出荷区分
			dto.setShippingTypeNm(result.getTShippingInstB().getTShippingInstH().getBClassDtlByShippingTypeCd().getVDict().getDictNm());
			// 得意先Cd
			dto.setAccountCd(result.getTShippingInstB().getTShippingInstH().getAccountCd());
			// 得意先名称
			dto.setCustomerNm(result.getTShippingInstB().getTShippingInstH().getMCustomerByAccoutId().getCustomerNm());
			// 代表荷揃番号
			dto.setDaihyoNizoroeNo2(result.getTPickingH().getDaihyoNizoroeNo2());
			// 代表荷揃番号（バーコード)
			dto.setDaihyoNizoroeNoBarCd(result.getTPickingH().getDaihyoNizoroeNo());
			// 代表荷揃番号ハイフンなし
			dto.setDaihyoNizoroeNo(result.getTPickingH().getDaihyoNizoroeNo());
			// 商品CD
			if (result.getTStock().getMProduct().getProductCd().length() > 20) {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd().substring(0, 20));
			} else {
				dto.setProductCd(result.getTStock().getMProduct().getProductCd());
			}
			// 商品略称
			dto.setProductAbbr(result.getTStock().getMProduct().getProductAbbr());
			// JANCD
			dto.setJanCd(result.getTStock().getMProduct().getJanCd());
			// 製造日
			dto.setProdDt(result.getTStock().getTLot().getProdDt());
			// 期限日
			dto.setLimitDt(result.getTStock().getTLot().getLimitDt());
			// 入荷日
			dto.setReceiveDt(result.getTStock().getTLot().getReceiveDt());
			// ロット
			dto.setLot(result.getTStock().getTLot().getLot());
			// ロケ
			dto.setLocationNm(result.getTStock().getMLocation().getLocationNm());
			// 出庫数
			dto.setPickingNum(result.getPickingNum());
			// 単位
			dto.setUnitNm(result.getTStock().getMProduct().getUnitNm());

			dataList.add(dto);

		}

		return dataList;
	}
}
