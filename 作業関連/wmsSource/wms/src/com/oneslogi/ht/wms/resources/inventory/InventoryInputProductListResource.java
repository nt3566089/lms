package com.oneslogi.ht.wms.resources.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.dtomapper.WHtInventoryInputProdDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtInventoryInputProd;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductWkSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 商品棚卸入力(登録内容参照)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductList")
@HandyErrorReturnPath(returnURL = "InventoryInputProductList/display")
public class InventoryInputProductListResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private InventoryInputProductWkSelectLogic selectLogic;

	/**
	 * 商品棚卸入力(登録内容参照)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception {
		//自画面初期化
		load(this, util, backUrl, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, String backUrl,
			InventoryInputProductWkSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		WHtInventoryInputProdDtoMapper wHtInventoryInputProdDtoMapper = new WHtInventoryInputProdDtoMapper();
		WHtInventoryInputProd wHtInventoryInputProd = wHtInventoryInputProdDtoMapper.mappingToEntity(wHtInventoryInputProdDto);

		//一覧画面表示項目を取得
		List<WHtInventoryInputProd> lstWHtinventory = selectLogic.selectList(wHtInventoryInputProd);
		// エラー有りの場合は終了
		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setPageIndex(0);
		dto.setBackUrl(backUrl);

		dto.setLstWHtInventoryInputProdDto(wHtInventoryInputProdDtoMapper.mappingToDtoList(lstWHtinventory));
		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 商品棚卸入力(登録内容参照)画面表示を行います。
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

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD Start
		resource.initScreen("InventoryInputProductListHT");
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url(dto.getBackUrl()).itemCd("return").build());
		//フッタボタン（右）設定
		resource.setPageButton(
				ButtonInfo.builder().url("InventoryInputProductList/prev").itemCd("prev").build(),
				ButtonInfo.builder().url("InventoryInputProductList/next").itemCd("next").build()
				);
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30  ライ MOD END
		//登録内容参照へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductList.jsp",ses);
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

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		if (dto.getPageIndex() > 0) {
			dto.setPageIndex(dto.getPageIndex() - 1);
		} else {
			dto.setPageIndex(dto.getLstWHtInventoryInputProdDto().size() - 1);
		}

		ses.setAttribute("InventoryInputProductDto", dto);

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

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		if (dto.getPageIndex() < dto.getLstWHtInventoryInputProdDto().size() - 1) {
			dto.setPageIndex(dto.getPageIndex() + 1);
		} else {
			dto.setPageIndex(0);
		}

		ses.setAttribute("InventoryInputProductDto", dto);

		//自画面表示
		display();
	}

}
