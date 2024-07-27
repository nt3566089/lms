package com.oneslogi.wms.resources.shipping;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.PickingStatus;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.dto.customize.SqlPackingListUpdateDto;
import com.oneslogi.base.dbflute.dtomapper.TAllocInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TPackingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlPackingListUpdateDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.TagLabelCommonDto;
import com.oneslogi.wms.dto.report.TagLabelYamatoDto;
import com.oneslogi.wms.dto.shipping.PackingUpdateSelectDto;
import com.oneslogi.wms.dto.shipping.TagLabelPrintParamDto;
import com.oneslogi.wms.logic.common.BoxLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ParamLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.shipping.PackingInfoUpdateLogic;
import com.oneslogi.wms.logic.shipping.PackingUpdateSelectLogic;
import com.oneslogi.wms.logic.shipping.PickingListPrintSelectLogic;
import com.oneslogi.wms.logic.shipping.PieceShippingInspectLogic;
import com.oneslogi.wms.logic.shipping.TagLabelCommonPrintLogic;
import com.oneslogi.wms.logic.shipping.TagLabelJpPrintLogic;
import com.oneslogi.wms.logic.shipping.TagLabelYamatoPrintLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * 梱包明細修正画面のリソースクラス
 */
@Path("/shipping/packingListUpdate")
public class PackingListUpdateResource extends AbstractWmsResource {
	
	// ミドリ安全様向けカスタマイズ対応 定数定義追加 2024.7.15 張 Add [S]
	// ===== 定数定義 =====
	/** 荷札印刷区分<br>01:汎用荷札<br><b>02:荷札ヤマト</b><br>03:荷札JP */
	private static final String TAG_PRINT_TYPE_CD_$02 = "02";
	/** 荷札印刷区分<br>01:汎用荷札<br>02:荷札ヤマト<br><b>03:荷札JP</b> */
	private static final String TAG_PRINT_TYPE_CD_$03 = "03";
	private static final String TAG_LABLE_YAMATO = "TagLabelYamato";
	private static final String TAG_LABLE_COMMON = "TagLabelCommon";
	private static final String TAG_LABLE_JP = "InventoryStockDiffList"; //TagLabelJp
	/** 梱包明細ラベル */
	private static final String REPORT_CD_SCM = "StockDiffList"; //PakcingSCMLabel
	// ミドリ安全様向けカスタマイズ対応 定数定義追加 2024.7.15 張 Add [E]

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
		 * 梱包明細修正データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int PACKING_LIST_CHECK_FAILED = 3;
		/**
		 * 梱包情報更新異常
		 */
		protected static final int PACKING_LIST_UPDATE_FAILED = 4;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int T_PICKING_R_UPDATE_FAILED = 5;
		/**
		 * 荷札用帳票コード異常
		 */
		protected static final int TAG_REPORT_CD_FAILED = 6;
		/**
		 * 荷札発行異常
		 */
		protected static final int TAG_LABEL_PRINT_FAILED = 7;
		// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		/**
		 * 排他チェック異常
		 */
		protected static final int CHECK_UPDATE_FAILED = 8;
		/**
		 * 届先情報更新異常
		 */
		protected static final int DELIVERY_INFO_UPDATE_FAILED = 9;
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		/**
		 * 梱包明細発行異常
		 */
		protected static final int PACKINGLIST_TAG_LABEL_PRINT_FAILED = 10;
	}

	// ===== 使用テーブル =====

	@Inject
	TPickingHBhv tPickingHBHV;
	@Inject
	TPickingBBhv tPickingBBHV;
	
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Mod [S]
	@Inject
	TPackingHBhv tPackingHBHV;
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Mod [S]

	// ===== 使用ロジック =====
	@Inject
	private PackingUpdateSelectLogic selectLogic;
	
	@Inject
	private PackingInfoUpdateLogic updateLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private BoxLogic boxLogic;
	// ミドリ安全様向けカスタマイズ対応  checkLogic削除 2024.7.15 張 Del [S]
//	@Inject
//	private ShipStatusCheckLogic shipStatusCheckLogic;
	// ミドリ安全様向けカスタマイズ対応  checkLogic削除 2024.7.15 張 Del [S]

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReportLogic reportLogic;
	// ミドリ安全様向けカスタマイズ対応  削除 2024.7.15 張 Del [S]
//	@Inject
//	private TagLabelPrintLogic tagLabelPrintLogic;
	// ミドリ安全様向けカスタマイズ対応  削除 2024.7.15 張 Del [E]
	@Inject
	private PieceShippingInspectLogic pieceShippingInspectLogic;
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [S]
	@Inject
	private PickingListPrintSelectLogic pickingListPrintSelectLogic;
	@Inject
	private TagLabelYamatoPrintLogic tagLabelYamatoPrintLogic;
	@Inject
	private TagLabelCommonPrintLogic tagLableCommonPrintLogic;
	@Inject
	private TagLabelJpPrintLogic tagLableJpPrintLogic;
	@Inject
	private PrintLogic printLogic;
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [E]

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return PackingUpdateSelectDto 梱包明細修正画面用DTO
	 */
	@GET
	@Path("/init")
	public PackingUpdateSelectDto init() {
		return new PackingUpdateSelectDto();
	}
	
	/**
	 * <h2>検索結果のexcel出力</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、梱包データを取得
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return PackingUpdateSelectDto 梱包明細修正画面用DTO
	 */
	@GET
	@Path("/excelOutPut")
	public PackingUpdateSelectDto packingListUpdateExcelout(PackingUpdateSelectDto packingUpdateSelectDto) throws IOException  {
		PackingUpdateSelectDto packingListUpdateDto = new PackingUpdateSelectDto();

		// Entity変換
		TPackingHDtoMapper headerMapper = new TPackingHDtoMapper();
		TPackingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		PagingResultBean<SqlPackingListUpdate> page = selectLogic.select(header, packingUpdateSelectDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		
		setupInputCheckForSearch(header, page, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED), true);
		
			
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return packingListUpdateDto;
		}

		// Dto変換処理
		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdateDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		packingListUpdateDto.paging = packingUpdateSelectDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		packingListUpdateDto.data.list = list;

		for (SqlPackingListUpdateDto selectDto : list) {
			// 検索時の梱包ヘッダIDと荷材No.を退避 (更新時に使用)
			packingListUpdateDto.data.boxNoMap.put(selectDto.getBoxNo(), selectDto.getPackingHId());
		}
		return packingListUpdateDto;
	}
	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、梱包データを取得
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return PackingUpdateSelectDto 梱包明細修正画面用DTO
	 */
	@GET
	@Path("/search")
	public PackingUpdateSelectDto packingListUpdateDataSearch(PackingUpdateSelectDto packingUpdateSelectDto) throws IOException  {

		PackingUpdateSelectDto packingListUpdateDto = new PackingUpdateSelectDto();

		// Entity変換
		TPackingHDtoMapper headerMapper = new TPackingHDtoMapper();
		TPackingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		PagingResultBean<SqlPackingListUpdate> page = selectLogic.select(header, packingUpdateSelectDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// ミドリ安全様向けカスタマイズ対応  チェック処理修正 2024.7.15 張 Mod [S]
//		if (page.size() == 0) {
//			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
//			// 梱包ヘッダのチェックのみ
//			setupInputCheck(header, null, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
//			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
//			// 結果判定
//			if (getErrorManager().size() > 0) {
//				// 処理中止
//				return packingListUpdateDto;
//			}
//		}
		setupInputCheckForSearch(header, page, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED), false);
		// ミドリ安全様向けカスタマイズ対応  チェック処理修正 2024.7.15 張 Mod [E]
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return packingListUpdateDto;
		}

		// Dto変換処理
		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdateDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		packingListUpdateDto.paging = packingUpdateSelectDto.paging;

		// こちらのサンプルを動かしたい場合はこの部分のコメントを外しDto側も修正する事
		packingListUpdateDto.data.list = list;

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		for (SqlPackingListUpdateDto selectDto : list) {
			// 検索時の梱包ヘッダIDと荷材No.を退避 (更新時に使用)
			packingListUpdateDto.data.boxNoMap.put(selectDto.getBoxNo(), selectDto.getPackingHId());
		}
		
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		TAllocInstH tAllocInstH = new TAllocInstH();
		tAllocInstH.setAllocInstHId(page.get(0).getAllocInstHId());
		tAllocInstH.setVersionNo(page.get(0).getVersionNo());
		// ミドリ安全様向けカスタマイズ対応  値設定削除 2024.7.15 張 Del [S]
//		tAllocInstH.setDelivDt(page.get(0).getDelivDt());
//		tAllocInstH.setDelivTz(page.get(0).getDelivTz());
//		tAllocInstH.setDelivZipCd(page.get(0).getDelivZipCd());
//		tAllocInstH.setDelivTelNo(page.get(0).getDelivTelNo());
//		tAllocInstH.setDelivAddress1(page.get(0).getDelivAddress1());
//		tAllocInstH.setDelivAddress2(page.get(0).getDelivAddress2());
//		tAllocInstH.setDelivAddress3(page.get(0).getDelivAddress3());
//		tAllocInstH.setDelivCustomerNm(page.get(0).getDelivCustomerNm());
//		tAllocInstH.setVersionNo(page.get(0).getVersionNo());
//		tAllocInstH.setIsChanged(false);
		// ミドリ安全様向けカスタマイズ対応  値設定削除 2024.7.15 張 Del [E]
		TAllocInstHDtoMapper footerMapper = new TAllocInstHDtoMapper();
		packingListUpdateDto.data.footer = footerMapper.mappingToDto(tAllocInstH);
//		packingListUpdateDto.data.footerOld = footerMapper.mappingToDto(tAllocInstH);
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei Start
//		packingListUpdateDto.data.select.updDt = page.get(0).getUpdDt();
//		packingListUpdateDto.data.select.count = page.get(0).getCount();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei

		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana Start
		MClientCenter mc = new MClientCenter();
		mc.setCenterId(mCenter.getCenterId());
		mc.setClientId(mClient.getClientId());
		MParam mp = paramLogic.getUkEntityWithDeletedCheck(mc);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		CDef.AfterTagOutFlg afterTagOutFlg = mp.getAfterTagOutFlgAsAfterTagOutFlg();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
		if (afterTagOutFlg != null) {
			switch (afterTagOutFlg) {
			// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana Start
			case $1: // バラ出荷検品後のみ出力
			case $3: // バラ・ケース出荷検品後に出力
				// [#360] 検品後荷札出力フラグの区分値を0始まりに変更 2016.12.12 kawana End
				packingListUpdateDto.data.tagLabelPrintFlg = 1;
				break;
			default:
				packingListUpdateDto.data.tagLabelPrintFlg = 0;
				break;
			}
		} else {
			packingListUpdateDto.data.tagLabelPrintFlg = 0;
		}
		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana End
		return packingListUpdateDto;
	}
	
	// ミドリ安全様向けカスタマイズ対応  追加更新チェック追加 2024.7.15 張 Add [S]
	/**
	 * <h2>追加更新チェック。</h2>
	 * <pre>
	 * 追加更新ボタン押下後、チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/addUpdateCheck")
	public StatusDto addUpdateCheck(PackingUpdateSelectDto packingUpdateSelectDto) {
		// Entity変換
		TPackingHDtoMapper headerMapper = new TPackingHDtoMapper();
		TPackingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		//SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		//List<SqlPackingListUpdate> list = mapper.mappingToEntityList(packingUpdateSelectDto.data.list);

		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());
		
		List<TPackingH> page = selectLogic.selectAddUpdate(header, errRetSts(StatusCode.NOT_FOUND_DATA));

		setupInputCheckForPreRegister(page, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		return null;
	}
	// ミドリ安全様向けカスタマイズ対応  追加更新チェック追加 2024.7.15 張 Add [E]

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(PackingUpdateSelectDto packingUpdateSelectDto) {
		// Entity変換
		// ミドリ安全様向けカスタマイズ対応  Entity変換修正 2024.7.15 張 Mod [S]
//		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
//		TPickingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		TPackingHDtoMapper headerMapper = new TPackingHDtoMapper();
		TPackingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		// ミドリ安全様向けカスタマイズ対応  Entity変換修正 2024.7.15 張 Mod [E]
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdate> list = mapper.mappingToEntityList(packingUpdateSelectDto.data.list);
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

		// ミドリ安全様向けカスタマイズ対応  荷主ID取得削除 2024.7.15 張 Del [S]
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		// ミドリ安全様向けカスタマイズ対応  荷主ID取得削除 2024.7.15 張 Del [E]
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());
		
		PagingResultBean<SqlPackingListUpdate> page = selectLogic.select(header, packingUpdateSelectDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		// ミドリ安全様向けカスタマイズ対応  登録チェック修正 2024.7.15 張 Mod [S]
		//setupInputCheck(header, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		setupInputCheckForRegister(header, page, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		// ミドリ安全様向けカスタマイズ対応  登録チェック修正 2024.7.15 張 Mod [E]
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		// 確認メッセージを登録
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
		return null;
	}
	
	/**
	 * <h2>入力チェック組み立て。検索の場合</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・出荷状態チェック
	 * ・画面で入力されたCDを元にIDを取得し、データに設定する
	 * ・梱包荷材入力チェック
	 * ・梱包荷材存在チェック
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 出荷状態チェック異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param header 梱包ヘッダ用DTO
	 * @param bodyList 梱包データー明細
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void setupInputCheckForSearch(TPackingH header,List<SqlPackingListUpdate> bodyList, ErrorStatus errSts, boolean isExcel) {
		if(bodyList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
		if(!isExcel) {
			boolean isError = false;
			// ===== 梱包明細のチェック =====
			for (SqlPackingListUpdate body : bodyList) {
	
				// ===== 荷材マスタ存在チェック =====
				if (body.getBoxCd() == null || selectLogic.countBoxCd(body.getBoxCd(), header.getCenterId()) == 0) {
					isError = true;
				}
			}
			if(isError) {
				// 荷材未入力エラー
				this.getErrorManager().add(errSts, WmsMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR);
			}
		}
	}

	/**
	 * <h2>登録チェック組み立て。/h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・出荷状態チェック
	 * ・画面で入力されたCDを元にIDを取得し、データに設定する
	 * ・梱包荷材入力チェック
	 * ・梱包荷材存在チェック
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 出荷状態チェック異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param header 梱包ヘッダ用DTO
	 * @param bodyList 梱包データー明細
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void setupInputCheckForRegister(TPackingH header,PagingResultBean<SqlPackingListUpdate> page, List<SqlPackingListUpdate> bodyList, ErrorStatus errSts) {
		//荷揃番号
		
//		String nizoroeNo2 = header.getNizoroeNo2();
//		Long clientId = header.getClientId();
//		Long centerId = header.getCenterId();
//		TPackingHCB cb = tPackingHBHV.newMyConditionBean();
//		cb.query().setClientId_Equal(clientId);
//		cb.query().setCenterId_Equal(centerId);
//		cb.query().setNizoroeNo2_Equal(nizoroeNo2);
//		List<TPackingH> tPackingHList = tPackingHBHV.selectList(cb);
		//荷揃番号の梱包データが存在しない
		if(page.size() == 0 ) {
			this.getErrorManager().add(errSts, WmsMessageConst.PACKING_LIST_UPDATE_DATA_ALREADY_UPDATED_ERROR);
			return;
		}
		Set<Long> pickingHIds = page.stream().map(o -> {
			return o.getPickingHId();
		}).collect(Collectors.toSet());
		AtomicBoolean isErrorA = new AtomicBoolean(false);
		AtomicBoolean isErrorB = new AtomicBoolean(false);
		pickingHIds.forEach(id -> {
			TPickingHCB cb2 = tPickingHBHV.newMyConditionBean();
			cb2.query().setPickingHId_Equal(id);
			TPickingH tpickingH = tPickingHBHV.selectEntityWithDeletedCheck(cb2);
			if (tpickingH.isPickingStatus$55()) {
				isErrorA.set(true);
			} else if(tpickingH.isPickingStatus$30() || tpickingH.isPickingStatus$40() || tpickingH.isPickingStatus$45()) {
				isErrorB.set(true);
			}
		});
		if(isErrorA.get() || isErrorB.get()) {
			if(isErrorA.get()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIPPING_CONFIRM_ERROR);
			}
			if(isErrorB.get()) {
				this.getErrorManager().add(errSts, WmsMessageConst.WORKING_PACKING_ERROR);
			}
			return;
		}
		// ===== 梱包明細のチェック =====
		for (SqlPackingListUpdate body : bodyList) {

			if (WCC.isZero(body.getPackingNumSum())) {
				// 梱包数=0
				continue;
			}

			// ===== 荷材マスタ存在チェック =====
			if (body.getBoxCd() == null || selectLogic.countBoxCd(body.getBoxCd(), header.getCenterId()) == 0) {
				// 荷材未入力エラー
				this.getErrorManager().add(errSts, WmsMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR);
			}
			if (0 < getErrorManager().size()) {
				// 荷材マスタ未存在
				return;
			}
			MBox boxC = new MBox();
			boxC.setBoxCd(body.getBoxCd());
			boxC.setCenterId(header.getCenterId());
			MBox box = boxLogic.getUkEntity(boxC, errSts);
			if (0 < getErrorManager().size()) {
				// 荷材マスタ未存在
				return;
			}
			body.setBoxId(box.getBoxId());
		}
		
	}
	
	/**
	 * <h2>追加更新チェック組み立て。/h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・出荷状態チェック
	 * ・画面で入力されたCDを元にIDを取得し、データに設定する
	 * ・梱包荷材入力チェック
	 * ・梱包荷材存在チェック
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 出荷状態チェック異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param page 梱包データー明細
	 * @param errSts エラー時に設定するエラーステータス
	 */
	protected void setupInputCheckForPreRegister(List<TPackingH> page, ErrorStatus errSts) {
		//出庫ステータスリスト
		List<String> pickStatus = page.stream().map(o -> {
			return o.getTPickingH().getPickingStatus();
		}).collect(Collectors.toList());
		AtomicBoolean isErrorA = new AtomicBoolean(false);
		AtomicBoolean isErrorB = new AtomicBoolean(false);
		pickStatus.forEach(st -> {
			if (PickingStatus.$55.code().equals(st)) {
				isErrorA.set(true);
			} else if(Arrays.asList(PickingStatus.$30.code(), PickingStatus.$40.code(), PickingStatus.$45.code()).contains(st)) {
				isErrorB.set(true);
			}
		});
		if(isErrorA.get() || isErrorB.get()) {
			if(isErrorA.get()) {
				this.getErrorManager().add(errSts, WmsMessageConst.SHIPPING_CONFIRM_ERROR);
			}
			if(isErrorB.get()) {
				this.getErrorManager().add(errSts, WmsMessageConst.WORKING_PACKING_ERROR);
			}
			return;
		}
	}
	
	//ミドリ安全様向けカスタマイズ対応  チェック処理削除 2024.07.15 張 Del [S]
	/**
	 * <h2>入力チェック組み立て。</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・出荷状態チェック
	 * ・画面で入力されたCDを元にIDを取得し、データに設定する
	 * ・梱包荷材入力チェック
	 * ・梱包荷材存在チェック
	 *
	 * 戻り値を下記のように設定する
	 * チェックエラー : 出荷状態チェック異常
	 * チェック正常 : 正常
	 *
	 * </pre>
	 * @param header 出庫ヘッダ用DTO
	 * @param errSts エラー時に設定するエラーステータス
	 */
//	protected void setupInputCheck(TPickingH header, List<SqlPackingListUpdate> bodyList, ErrorStatus errSts) {
//
//		TPickingHCB cb = tPickingHBHV.newMyConditionBean();
//		cb.query().setClientId_Equal(header.getClientId());
//		cb.query().setCenterId_Equal(header.getCenterId());
//		cb.query().setPickingWorkNo_Equal(header.getPickingWorkNo());
//		List<TPickingH> tPickingH = tPickingHBHV.selectList(cb);
//		if (tPickingH.size() == 0 ) {
//
//			// [#2286] エラーメッセージを排他エラーから未存在エラーに修正 2017.08.28 miyabe Start
//			// [#7412][v3.1][OSS] 排他エラー時のメッセージを変更 2020/05/13 KAI MOD START
//			//this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//			this.getErrorManager().add(errSts, WmsMessageConst.PACKING_LIST_UPDATE_DATA_ALREADY_UPDATED_ERROR);
//			// [#7412][v3.1][OSS] 排他エラー時のメッセージを変更 2020/05/13 KAI MOD END
//			// [#2286] エラーメッセージを排他エラーから未存在エラーに修正 2017.08.28 miyabe End
//			return;
//		} else {
//			shipStatusCheckLogic.packingUpdate(null, null, tPickingH, null, errSts);
//			if (getErrorManager().size() > 0) {
//				return;
//			}
//		}
//
//		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
//		// 現在のステータスを設定
//		header.setPickingStatus(tPickingH.get(0).getPickingStatus());
//		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
//
//		TPickingBCB cb2 = tPickingBBHV.newMyConditionBean();
//		cb2.setupSelect_TPickingH();
//		cb2.query().queryTPickingH().setClientId_Equal(header.getClientId());
//		cb2.query().queryTPickingH().setCenterId_Equal(header.getCenterId());
//		cb2.query().queryTPickingH().setPickingWorkNo_Equal(header.getPickingWorkNo());
//		List<TPickingB> tPickingB = tPickingBBHV.selectList(cb2);
//		if (tPickingB.size() == 0 ) {
//			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
//			this.getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
//			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
//			return;
//		}
//		// 20141013 SJA_ZHU 追加 [ON推-CT3-209対応] End
//
//		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
//
//		// ===== 梱包明細のチェック =====
//
//		if (bodyList == null) {
//			return;
//		}
//
//		for (SqlPackingListUpdate body : bodyList) {
//
//			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.04.20 kawana Start
//
//			if (WCC.isZero(body.getPackingNumSum())) {
//				// 梱包数=0
//				continue;
//			}
//
//			// [#4451] 梱包数が0の場合は荷材CDチェックをしないように修正 2018.04.20 kawana End
//
//			// ===== 荷材マスタ存在チェック =====
//
//			if (body.getBoxCd() == null) {
//				// 荷材未入力エラー
//				this.getErrorManager().add(errSts, WmsMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR);
//			}
//
//			MBox boxC = new MBox();
//			boxC.setBoxCd(body.getBoxCd());
//			// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana Start
//			boxC.setCenterId(header.getCenterId());
//			// [ON推-品向-834] 別センタに同じ荷材CDがあると致命的エラー 2015.07.02 kawana End
//			// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
//			MBox box = boxLogic.getUkEntity(boxC, errSts);
//			if (0 < getErrorManager().size()) {
//				// 荷材マスタ未存在
//				return;
//			}
//			body.setBoxId(box.getBoxId());
//			// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
//		}
//		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End
//
//	}
	//ミドリ安全様向けカスタマイズ対応  チェック処理削除 2024.07.15 張 Del [E]

	/**
	 * <h2>梱包情報更新。</h2>
	 * <pre>
	 * 登録データの入力チェック組み立てを行う
	 * エラーがない場合は、データベースに梱包明細修正データを登録し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param packingUpdateSelectDto 梱包明細修正画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto packingInfoUpdate(PackingUpdateSelectDto packingUpdateSelectDto) {
		// Entity変換
		// ミドリ安全様向けカスタマイズ対応  Entity変換修正 2024.7.15 張 Mod [S]
//		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
//		TPickingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		TPackingHDtoMapper headerMapper = new TPackingHDtoMapper();
		TPackingH header = headerMapper.mappingToEntity(packingUpdateSelectDto.data.search);
		// ミドリ安全様向けカスタマイズ対応  Entity変換修正 2024.7.15 張 Mod [E]
		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		header.setClientId(mClient.getClientId());
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		header.setCenterId(mCenter.getCenterId());

		SqlPackingListUpdateDtoMapper mapper = new SqlPackingListUpdateDtoMapper();
		List<SqlPackingListUpdate> list = mapper.mappingToEntityList(packingUpdateSelectDto.data.list);

		PagingResultBean<SqlPackingListUpdate> page = selectLogic.select(header, packingUpdateSelectDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
		// ミドリ安全様向けカスタマイズ対応  登録チェック修正 2024.7.15 張 Mod [S]
		//setupInputCheck(header, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		setupInputCheckForRegister(header, page, list, errRetSts(StatusCode.PACKING_LIST_CHECK_FAILED));
		// ミドリ安全様向けカスタマイズ対応  登録チェック修正 2024.7.15 張 Mod [E]
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start

		for (SqlPackingListUpdate body : list){

			String boxNo = body.getBoxNo();
			// 荷材No.にあった梱包ヘッダIDを設定 (新規の場合はnull)
			body.setPackingHId(packingUpdateSelectDto.data.boxNoMap.get(boxNo));
		}

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		
		
		TAllocInstHDtoMapper footerMapper = new TAllocInstHDtoMapper();
		TAllocInstH tAllocInstH = footerMapper.mappingToEntity(packingUpdateSelectDto.data.footer);
		// ミドリ安全様向けカスタマイズ対応  荷札情報更新削除 2024.7.15 張 Del [S]
		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示(入力チェックの位置を上に移動) 2016.06.21 kawana

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] Start

		//TShippingInstH tShipInstHeader = new TShippingInstH();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei Start
		//tShipInstHeader.setUpdDt(packingUpdateSelectDto.data.select.updDt);
		//int rowCount = packingUpdateSelectDto.data.select.count.intValue();
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei End

		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei

		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] End

		// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana Start

		// 出荷データの排他チェック
		//updateLogic.checkShippingInstHUpdate(header, tShipInstHeader, rowCount, errRetSts(StatusCode.CHECK_UPDATE_FAILED));
		//if (0 < getErrorManager().size()) {
		//	return null;
		//}
		// ミドリ安全様向けカスタマイズ対応  荷札情報更新削除 2024.7.15 張 Del [E]
		
		// 梱包情報の更新
		// ミドリ安全様向けカスタマイズ対応  更新処理修正 2024.7.15 張 Mod [S]
		//PackingInfoUpdateLogic.UpdateInfo updateInfo = updateLogic.update(header, tAllocInstH, list, errRetSts(StatusCode.PACKING_LIST_UPDATE_FAILED));
		//排他チェック
		updateLogic.checkPackingLIstUpdate(list, errRetSts(StatusCode.PACKING_LIST_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}
		PackingInfoUpdateLogic.UpdateInfo updateInfo = updateLogic.update(header, tAllocInstH, list, errRetSts(StatusCode.PACKING_LIST_UPDATE_FAILED));
		// ミドリ安全様向けカスタマイズ対応  更新処理修正 2024.7.15 張 Mod [E]
		
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ミドリ安全様向けカスタマイズ対応  届先情報削除 2024.7.15 張 Del [S]
		// 届先情報の更新
//		if (tAllocInstH.isIsChanged()) {
//
//			updateLogic.updateDeliveryInfo(header, tAllocInstH, errRetSts(StatusCode.DELIVERY_INFO_UPDATE_FAILED));
//			if (getErrorManager().size() > 0) {
//				// 処理中止
//				return null;
//			}
//		}
		// ミドリ安全様向けカスタマイズ対応  届先情報削除 2024.7.15 張 Del [E]
		
		// ミドリ安全様向けカスタマイズ対応  完了メッセージ修正 2024.7.15 張 Mod [S]
		// 完了メッセージの登録
		//addUpdateSuccessMessage(updateInfo, tAllocInstH.isIsChanged());
		// ミドリ安全様向けカスタマイズ対応  完了メッセージ修正 2024.7.15 張 Mod [E]
		addUpdateSuccessMessage(updateInfo);
		return null;
	}

	
	/**
	 * <h2>梱包情報更新の完了メッセージ登録。</h2>
	 */
	private void addUpdateSuccessMessage(PackingInfoUpdateLogic.UpdateInfo updateInfo) {

//		if (changedDelivInfo) {
//			// 届先の変更
//
//			getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
//		} else {
			if (updateInfo.modifiedPackingHCount) {
				// 梱包個口数に変更あり

				if (updateInfo.doClearTagOut) {
					//箱No数に増減があり、配送コースの追跡番号採番単位が荷揃番号単位の場合
					// 荷札出力のクリアあり

					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
				} else {
					// 荷札出力のクリアなし

					if (updateInfo.doAddPacking) {
						//箱No数の増減があり、配送コースの追跡番号採番単位が梱包単位の場合 かつ 箱Noの追加がある場合
						// 梱包の追加あり

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_ADD_PACKING_INFORMATION);
					} else {
						//箱No数の増減があり、配送コースの追跡番号採番単位が梱包単位の場合 かつ 箱Noの追加がない場合
						// 梱包の追加なし

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_INFORMATION);
					}
				}
			} else {
				// 梱包個口数に変更なし

				if (updateInfo.doClearTagOut) {
					//箱No削除数と追加数が等しい場合(どちらも1以上) で 配送コースの追跡番号採番単位が荷揃番号単位の場合
					// 荷札出力のクリアあり
					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_REPRINT_TAG_INFORMATION);
				} else {
					// 荷札出力のクリアなし

					if (updateInfo.doAddPacking) {
						//箱No削除数と追加数が等しい場合(どちらも1以上)で 配送コースの追跡番号採番単位が梱包単位の場合
						// 荷札出力のクリアあり (梱包の削除 == 梱包の追加 かつ 荷札出力単位が出荷梱包No.)

						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_ADD_PACKING_INFORMATION);
					} else {
						//帳票出力の更新を伴わない変更の場合
						// 梱包の追加なし

						getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
					}
				}

			}
//		}
	}

	/**
	 * <h2>梱包情報更新の完了メッセージ登録。</h2>
	 */
//	private void addUpdateSuccessMessage(PackingInfoUpdateLogic.UpdateInfo updateInfo, boolean changedDelivInfo) {
//
//		if (changedDelivInfo) {
//			// 届先の変更
//
//			getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
//		} else {
//			if (updateInfo.modifiedPackingHCount) {
//				// 梱包個口数に変更あり
//
//				if (updateInfo.doClearTagOut) {
//					// 荷札出力のクリアあり
//
//					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION);
//				} else {
//					// 荷札出力のクリアなし
//
//					if (updateInfo.doAddPacking) {
//						// 梱包の追加あり
//
//						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_ADD_PACKING_INFORMATION);
//					} else {
//						// 梱包の追加なし
//
//						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_INFORMATION);
//					}
//				}
//			} else {
//				// 梱包個口数に変更なし
//
//				if (updateInfo.doClearTagOut) {
//					// 荷札出力のクリアあり (梱包の削除 == 梱包の追加 かつ 荷札出力単位が出庫作業No.)
//
//					getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_REPRINT_TAG_INFORMATION);
//				} else {
//					// 荷札出力のクリアなし
//
//					if (updateInfo.doAddPacking) {
//						// 荷札出力のクリアあり (梱包の削除 == 梱包の追加 かつ 荷札出力単位が出荷梱包No.)
//
//						getWarnManager().add(warnRetSts(StatusCode.SUCCESS), WmsMessageConst.PACKING_UPDATE_COMPLETE_ADD_PACKING_INFORMATION);
//					} else {
//						// 梱包の追加なし
//
//						getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
//					}
//				}
//
//			}
//		}
//	}

	// [#2913] 梱包明細修正を差分更新に変更 2018.02.20 kawana End

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
	/**
	 * <h2>梱包明細発行の帳票IDの取得・設定。</h2>
	 * <pre>
	 * 梱包明細発行ロジックを使用し、荷札発行の帳票CDを取得。
	 * 帳票CDを帳票IDに変換し戻り値に設定する。
	 * </pre>
	 * @param tagLabelPrintParamDto 梱包明細発行用パラメータDTO
	 * @return 梱包明細用の帳票IDを設定した梱包明細発行用パラメータDTO
	 */
	@POST
	@Path("/getPackingListReportIdList")
	public TagLabelPrintParamDto getPackingListReportIdList(final TagLabelPrintParamDto tagLabelPrintParamDto) throws Exception{
		// 梱包明細用の帳票IDを設定
		tagLabelPrintParamDto.printBasicData.reportId = reportLogic.getReportId(REPORT_CD_SCM);
		return tagLabelPrintParamDto;
	}

	/**
	 * <h2>荷札用の帳票IDの取得・設定。</h2>
	 * <pre>
	 * 荷札発行ロジックを使用し、荷札発行の帳票CDを取得。
	 * 帳票CDを帳票IDに変換し戻り値に設定する。
	 * </pre>
	 * @param tagLabelPrintParamDto 荷札発行用パラメータDTO
	 * @return 荷札用の帳票IDを設定した荷札発行用パラメータDTO
	 */
	@POST
	@Path("/getTagLabelReportIdList")
	public TagLabelPrintParamDto getTagLabelReportIdList(final TagLabelPrintParamDto tagLabelPrintParamDto) throws Exception{

		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;

		// 出庫作業No.の検品
		TPackingH tPackingH = new TPackingH();
		tPackingH.setCenterId(centerId);
		tPackingH.setNizoroeNo2(targetNo);
		//出庫ヘッダーの荷揃番号
		List<TPackingH> tPickingHList = selectLogic.selectNizoroe(tPackingH, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			return null;
		}
		TPackingH tPickingH = tPickingHList.get(0);
		
		//荷札印刷区分
		String tagPrintTypeCd = tPickingH.getTPickingH().getTagPrintTypeCd();
		

		if (!CU.isNullOrEmpty(tagPrintTypeCd)) {
			if (TAG_PRINT_TYPE_CD_$02.equals(tagPrintTypeCd)) {
				// 荷札ヤマト
				tagLabelPrintParamDto.printBasicData.reportId = reportLogic.getReportId(TAG_LABLE_YAMATO);
			}else if (TAG_PRINT_TYPE_CD_$03.equals(tagPrintTypeCd)) {
				// 荷札JP
				tagLabelPrintParamDto.printBasicData.reportId = reportLogic.getReportId(TAG_LABLE_JP);
				// 発行
			}else {
				// 汎用荷札
				tagLabelPrintParamDto.printBasicData.reportId = reportLogic.getReportId(TAG_LABLE_COMMON);
			}
		}

		return tagLabelPrintParamDto;
	}

	/**
	 * <h2>梱包明細発行。</h2>
	 * <pre>
	 * 梱包明細発行ロジックを使用し、梱包明細を発行。
	 * </pre>
	 * @param tagLabelPrintParamDto 梱包明細発行用パラメータDTO
	 * @return 梱包明細処理を通した梱包明細発行用パラメータDTO
	 */
	@POST
	@Path("/printPackingListTagLabel")
	public TagLabelPrintParamDto printPackingListTagLabel(final TagLabelPrintParamDto tagLabelPrintParamDto) throws Exception{
		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;
		//Long reportId = tagLabelPrintParamDto.printBasicData.reportId;

		// コントロールNo.採番
		final long controlNo = numberingCenterLogic.getControlNo();
		
		// 荷揃番号の検品
		TPackingH tPackingH = new TPackingH();
		tPackingH.setCenterId(centerId);
		tPackingH.setNizoroeNo2(targetNo);
		//出庫ヘッダーの荷揃番号
		List<TPackingH> tPickingHList = selectLogic.selectNizoroe(tPackingH, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			return null;
		}
		TPackingH tPickingH = tPickingHList.get(0);
		
		TPickingH pickingH = new TPickingH();
		pickingH.setPickingHId(tPickingH.getTPickingH().getPickingHId());

		TPickingR pickingR = new TPickingR();
		pickingR.setControlNo(controlNo);
		
		pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		if (0 < getErrorManager().size()) {
			return null;
		}
		
		JSON json = new JSON();
		json.setSuppressNull(true);
		// 発行
		// 発行データreportId
		// TODO:DTOセット処理
		List<TPickingH> packingDataList = pickingListPrintSelectLogic.getPackingListLabelDataList(pickingR, errRetSts(StatusCode.PACKINGLIST_TAG_LABEL_PRINT_FAILED));
//		
//		if(packingDataList!=null && packingDataList.size()>0) {
//			// 帳票を発行
//			tagLabelPrintParamDto.printBasicData.reportLayoutId = selectLogic.selectReportLayoutId(reportId);
//			tagLabelPrintParamDto.printBasicData.outputData = json.format(packingDataList);
//
//			printLogic.print(tagLabelPrintParamDto);
//		}
		// 出庫帳票更新
		pieceShippingInspectLogic.updateTPickingRPillOutFlg(controlNo, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
		if( 0 < getErrorManager().size() ) {
			return null;
		}
		
		return tagLabelPrintParamDto;
	}
	/**
	 * <h2>荷札発行。</h2>
	 * <pre>
	 * 荷札発行ロジックを使用し、荷札を発行。
	 * </pre>
	 * @param tagLabelPrintParamDto 荷札発行用パラメータDTO
	 * @return 発行処理を通した荷札発行用パラメータDTO
	 */
	@POST
	@Path("/printTagLabel")
	public TagLabelPrintParamDto printTagLabel(final TagLabelPrintParamDto tagLabelPrintParamDto) throws Exception{


		// 入力情報取出
		final long centerId = tagLabelPrintParamDto.data.centerId;
		final String targetNo = tagLabelPrintParamDto.data.targetNo;

		// コントロールNo.採番
		final long controlNo = numberingCenterLogic.getControlNo();
		
		// 荷揃番号の検品
		TPackingH tPackingH = new TPackingH();
		tPackingH.setCenterId(centerId);
		tPackingH.setNizoroeNo2(targetNo);
		//出庫ヘッダーの荷揃番号
		List<TPackingH> tPickingHList = selectLogic.selectNizoroe(tPackingH, errRetSts(StatusCode.NOT_FOUND_DATA));
		if (0 < getErrorManager().size()) {
			return null;
		}
		TPackingH tPickingH = tPickingHList.get(0);
		//荷札印刷区分
		String tagPrintTypeCd = tPickingH.getTPickingH().getTagPrintTypeCd();
		
		TPickingH pickingH = new TPickingH();
		pickingH.setPickingHId(tPickingH.getTPickingH().getPickingHId());

		TPickingR pickingR = new TPickingR();
		pickingR.setControlNo(controlNo);


		// 発行データ
		List<?> printDto = null;
		PrintParamDto printParam=new PrintParamDto();
		if (!CU.isNullOrEmpty(tagPrintTypeCd)) {
			if (TAG_PRINT_TYPE_CD_$02.equals(tagPrintTypeCd)) {
				// 荷札ヤマト
				// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
				// ===== コントロールNo.設定 =====
				pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
				if (0 < getErrorManager().size()) {
					return null;
				}
				// 発行
				List<TagLabelYamatoDto> tagLabelYamato = tagLabelYamatoPrintLogic.printAll(null, controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

				if(tagLabelYamato!=null && tagLabelYamato.size()>0) {
					printDto =tagLabelYamato;

					// 帳票を発行
					printParam=setParamPrintDto(TAG_LABLE_YAMATO,printDto, tagLabelPrintParamDto);
					printLogic.print(printParam);
					tagLabelPrintParamDto.output = printParam.output;
				}
				// 出庫帳票更新
				pieceShippingInspectLogic.updateTPickingRTagOutFlg(controlNo, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			}else if (TAG_PRINT_TYPE_CD_$03.equals(tagPrintTypeCd)) {
				// 荷札JP
				// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
				pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
				if (0 < getErrorManager().size()) {
					return null;
				}
				// 発行
				List<TShippingInstH> tagLabelJp = tagLableJpPrintLogic.printAll(controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));
//
//				if(tagLabelJp!=null && tagLabelJp.size()>0) {
//					printDto =tagLabelJp;
//
//					// 帳票を発行
//						printParam=setParamPrintDto(TAG_LABLE_JP,printDto,tagLabelPrintParamDto);
//
//						printLogic.print(printParam);
//						tagLabelPrintParamDto.output = printParam.output;
//				}
				// 出庫帳票更新
				pieceShippingInspectLogic.updateTPickingRTagOutFlg(controlNo, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			}else {
				// 汎用荷札
				// ピッキングリスト発行データ取得.コントロールNo更新メソッドを呼出し
				pieceShippingInspectLogic.tPickingRUpdate(pickingR, pickingH, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
				if (0 < getErrorManager().size()) {
					return null;
				}
				// 発行
				List<TagLabelCommonDto> tagLabelCommon = tagLableCommonPrintLogic.printAll(null, controlNo, errRetSts(StatusCode.NOT_FOUND_DATA));

				if(tagLabelCommon!=null && tagLabelCommon.size()>0) {
					printDto =tagLabelCommon;

					// 帳票を発行
					printParam=setParamPrintDto(TAG_LABLE_COMMON,printDto,tagLabelPrintParamDto);
					printLogic.print(printParam);
					tagLabelPrintParamDto.output = printParam.output;
				}
				// 出庫帳票更新
				pieceShippingInspectLogic.updateTPickingRTagOutFlg(controlNo, errRetSts(StatusCode.T_PICKING_R_UPDATE_FAILED));
			}
		}
		if( 0 < getErrorManager().size() ) {
			return null;
		}
		
		return tagLabelPrintParamDto;
	}
	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
	
	/**
	 * 帳票設定
	 * @param labelCd 帳票コード
	 * @param list
	 * @return
	 */
	private PrintParamDto setParamPrintDto(String labelCd, List<?> list,PrintParamDto printParamDto) {

		  JSON json = new JSON();
		  json.setSuppressNull(true);
		  Long scmLabelId = reportLogic.getReportId(labelCd);
		  printParamDto.printBasicData.reportId = scmLabelId;
		  printParamDto.printBasicData.reportLayoutId = selectLogic.selectReportLayoutId(scmLabelId);
		  printParamDto.printBasicData.outputData = json.format(list);

		  return printParamDto;
	}
}
