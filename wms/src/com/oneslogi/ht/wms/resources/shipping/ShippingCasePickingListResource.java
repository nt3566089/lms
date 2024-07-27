package com.oneslogi.ht.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtShippingPickingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtShippingPickingDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtShippingPicking;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingCasePickingSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * ケースピッキング(登録内容参照)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingCasePickingList")
@HandyErrorReturnPath(returnURL = "ShippingCasePickingList/display")
public class ShippingCasePickingListResource extends HandyResourceBase {
	/* 共通関数群ユティリティクラス */
	@Inject
	private HandyCommonUtil util;
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingSelectLogic selectLogic;
	//[Ver3.0] unit of measure対応 2017.12.01 王 Start
	/* ケースピッキングデータ取得ロジッククラス */
	@Inject
	private ShippingCasePickingCheckLogic shippingCasePickingCheckLogic;
	//[Ver3.0] unit of measure対応 2017.12.01 王 End
	/**
	 * ケースピッキング(登録内容参照)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic,shippingCasePickingCheckLogic);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			ShippingCasePickingSelectLogic selectLogic,ShippingCasePickingCheckLogic shippingCasePickingCheckLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");
		WHtShippingPickingDto wHtShippingPickingDto = dto.getwHtShippingPickingDto();

		WHtShippingPickingDtoMapper wHtShippingPickingDtoMapper = new WHtShippingPickingDtoMapper();
		WHtShippingPicking wHtShippingPicking = wHtShippingPickingDtoMapper.mappingToEntity(wHtShippingPickingDto);

		//一覧画面表示項目を取得
		List<WHtShippingPicking> lstWHtShippingPicking = selectLogic.selectList(wHtShippingPicking, dto.getCasePickingNo());

		List<String> classCdList = new ArrayList<String>();
		classCdList.add("PICKING_FLG");//出庫フラグ→ 0:未出庫 1:出庫済

		// 区分値マスタより取得
		Map<String, Map<String, String>> bClassMap = selectLogic.getBClassInfo(classCdList);

		//出庫フラグの区分値リスト
		List<String> pickingFlgNmList = new ArrayList<String>();

		for (WHtShippingPicking whtsp : lstWHtShippingPicking) {

			String pickFlg = selectLogic.getPickingFlg(whtsp.getPickingBId());
			String pickFlgName = "";

			if (pickFlg != null) {
				pickFlgName = selectLogic.getBClassDtl(bClassMap, "PICKING_FLG", pickFlg).getVDict().getDictNm();
			}

			pickingFlgNmList.add(pickFlgName);
		}

		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		//[Ver3.0] unit of measure対応 2017.11.30 王 Start
		for (WHtShippingPicking whtsp : lstWHtShippingPicking) {
			// 入数の取得処理
			// 入数が取得できない場合
			if (!shippingCasePickingCheckLogic.getUnitNum(whtsp)) {
				//入数の設定
				whtsp.setUnitNum(1L);
			}

		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		dto.setLstWHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDtoList(lstWHtShippingPicking));
		dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));
		dto.setPickingFlgNmList(pickingFlgNmList);
		ses.setAttribute("ShippingCasePickingDto", dto);
		// [Ver3.0] unit of measure対応 2017.11.30 王 End

		//dto.setwHtShippingPickingDto(wHtShippingPickingDtoMapper.mappingToDto(wHtShippingPicking));

		//ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ケースピッキング(登録内容参照)画面表示を行います。
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

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 Start

		// 画面初期設定
		resource.initScreen("ShippingCasePickingListHT");

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());

		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("ShippingCasePickingList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("ShippingCasePickingList/next").itemCd("next").build()
				);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 潘 End

		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingCasePickingList.jsp", ses);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/prev")
	public void prev() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstWHtShippingPickingDto().size() - 1);
		}

		ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display();
	}

	/**
	 * 次時にコールされるメソッドです。<br>
	 * 次情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/next")
	public void next() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingCasePickingDto dto = (ShippingCasePickingDto) ses.getAttribute("ShippingCasePickingDto");

		if (dto.getPageIndex() < dto.getLstWHtShippingPickingDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("ShippingCasePickingDto", dto);

		//自画面表示
		display();
	}

}