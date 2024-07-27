package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveInspection;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.resources.HandyMenuResource;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;

/**
 * 完了確認(伝票No単位)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionSendWorkNo")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionSendWorkNo/display")
public class ReceiveInspectionSendWorkNoResource extends HandyMenuResource {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionDeleteLogic deleteLogic;
	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana Start
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana End
	@Inject
	private ReceiveInspectionSelectLogic selectLogic;

	/**
	 * 完了確認(伝票No単位)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 完了確認(伝票No単位)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}

	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionSendWorkNoHT",VIEW_TEMPLATE_NORMAL);

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionJan/display").itemCd("no").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionSendWorkNo/yes").itemCd("yes").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionSendWorkNo.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * 検品完了画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/yes")
	public void yes() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		WHtReceiveInspection wHtReceiveInspection = new WHtReceiveInspection();
		wHtReceiveInspection.setHtWorkNo(dto.getTReceivePlanBDto().getTReceivePlanH().getReceiveSlipNo());
		wHtReceiveInspection.setMacAddress(dto.getMacAddress());

		//[HT1.5-CT1-030] 完了ボタン押下時点で入荷済に更新 2015/06/25 KAI ADD STAST
		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());

		// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana Start

		// 入荷ステータスを入荷済に更新
		statusUpdateLogic.recceivedUpdateOnlyHeader(tReceivePlanH.getReceivePlanHId(), new ErrorStatus());

		// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana End

		//[HT1.5-CT1-030] 完了ボタン押下時点で入荷済に更新 2015/06/25 KAI ADD END

		//入荷検品ワークテーブルをクリア
		deleteLogic.clearWHtReceiveInspection(wHtReceiveInspection);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana Start

		// ===== 検品完了画面を表示 =====

		String dialogScreenCd = "ReceiveInspectionEndHT";

		// 画面初期設定
		initScreen(dialogScreenCd, VIEW_TEMPLATE_OPERATION_END);

		// 終了ボタン設定
		setReturnButton(ButtonInfo.builder().url("ReceiveInspectionSendWorkNo/onEndDialogEnd").itemCd("end").type(BUTTON_URL_JUMP_NO_DATA).build());
		// 継続ボタン設定
		setSendButton(ButtonInfo.builder().url("ReceiveInspectionSendWorkNo/onEndDialogContinue").itemCd("continue").type(BUTTON_URL_JUMP_NO_DATA).build());

		// ダイアログ表示
		displayCommonDialog(dialogScreenCd);

		// [#3027] HT項目辞書化対応(画面マスタ連携) - 共通ダイアログ 2017.11.30 kawana End
	}

	/**
	 * 検品完了画面終了時にコールされるメソッドです。<br>
	 * セッションをクリア、メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogEnd")
	public void onEndDialogEnd() throws Exception {

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana Start

		// 機能単位セッションをクリア
		ReceiveInspectionResource.removeSession(this, util, deleteLogic);

		// メニュー表示
		displaySubMenu(MENU_GROUP_CD_RECEIVE);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.21 kawana End
	}

	/**
	 * 検品完了画面継続時にコールされるメソッドです。<br>
	 * 伝票No入力画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/onEndDialogContinue")
	public void onEndDialogContinue() throws Exception {

		//伝票No入力画面を表示
		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA Start */
//		ReceiveInspectionWorkNoResource.load(this, util);
		ReceiveInspectionWorkNoResource.load(this, util,selectLogic);
		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA End */

	}
}