package com.oneslogi.ht.wms.resources.receive;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionLimitDtDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;

/**
 * 予定無し入荷(詳細)期限日入力画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionLimitDt")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionLimitDt/display")
public class ReceiveNoPlanInspectionLimitDtResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;

	/**
	 * ロット入力画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		wHtReceiveNoPlanInspecDto.setLot("");
		wHtReceiveNoPlanInspecDto.setLimitDt("");

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 期限日入力画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionLimitDtHT");
		// 非表示ボタンｍの設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLimitDt/send").build());

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionQty/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLimitDt/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionLimitDt.jsp", ses);

	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、以下画面に遷移可能です
	 *     期限日確認画面
	 *     汎用No入力画面
	 *     検品確認入力画面
	 * @param bean 画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionLimitDtDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		wHtReceiveNoPlanInspecDto.setLimitDt(bean.getLimitDt());

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

		// 期限日チェック
		try {
			SimpleDateFormat dateValid = new SimpleDateFormat("yyyyMMdd");
			dateValid.setLenient(false);
			Date dt = dateValid.parse(bean.getLimitDt());

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			dto.setLimitDt(dateFormat.format(dt));
		} catch (Exception ex) {
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATE_ERROR);
			return;
		}

		// 期限日の入力チェックを行う
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto.getMProduct());
		mProduct.setProductCd(wHtReceiveNoPlanInspecDto.getProductCd());

		MClient mClient = new MClient();
		mClient.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

		TLot tLot = new TLot();
		tLot.setLimitDt(bean.getLimitDt());

		if (!lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, new ErrorStatus())) {
			return;
		}

		// ===【JAN入力】画面で入力したJAN/商品コードの期限日逆転防止フラグが'1：管理する'の場合は入荷限界日のチェックを行う。===
		TReceivePlanH planHeader = new TReceivePlanH();
		List<TReceivePlanB> planBodyList = new ArrayList<TReceivePlanB>();
		TReceivePlanB tReceivePlanB = new TReceivePlanB();
		tReceivePlanB.setReceivePlanBId(1l);
		tReceivePlanB.setProductId(wHtReceiveNoPlanInspecDto.getProductId());
		planBodyList.add(tReceivePlanB);

		TStoreRecordH recordHeader = new TStoreRecordH();
		recordHeader.setCenterId(wHtReceiveNoPlanInspecDto.getCenterId());
		recordHeader.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

		TStoreRecordB tStoreRecordB = new TStoreRecordB();
		tStoreRecordB.setReceivePlanBId(tReceivePlanB.getReceivePlanBId());
		tStoreRecordB.setLimitDt(bean.getLimitDt());

		List<TStoreRecordB> recordBodyList = new ArrayList<TStoreRecordB>();
		recordBodyList.add(tStoreRecordB);

		// 期限日逆転防止フラグが'1：管理する'の場合は入荷限界日のチェックを行う。
		stockUpdateCheckLogic.receiveLimitDateCheck(planHeader, planBodyList, recordHeader, recordBodyList, new ErrorStatus());

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return;
		}

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setPastStoreDtFlg(dto.getMParamDto().getPastStoreDtFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (getWarnManager().size() > 0) {
			// 期限日が入荷限界日を過ぎている場合
			if (mParam.getPastStoreDtFlg().equals("0")) {
				// パラメータマスタの過去日入力可フラグが'0：不可'の場合
				getErrorManager().add(new ErrorStatus(), WmsMessageConst.INPUT_LIMIT_DATE_OVER_ERROR);
				return;
			} else {
				// 期限日確認画面へ遷移する
				getWarnManager().clear();
				ReceiveNoPlanInspectionSendLimitDtResource.load(this, util);
				return;
			}
		}

		// 画面で選択した内容に応じて遷移先画面を変更する
		if (dto.getLabelKbn().equals("1")) {
			// 入庫No.管理フラグが'0：管理しない'、入庫ラベル使用を選択した場合
			// ロケ入力画面へ遷移する
			ReceiveNoPlanInspectionLocResource.load(this, util);
		} else {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveNoPlanInspectionLabelInputResource.load(this, util);
		}
	}
}
