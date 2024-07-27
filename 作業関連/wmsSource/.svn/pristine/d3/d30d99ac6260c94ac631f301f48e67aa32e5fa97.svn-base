package com.oneslogi.wms.core.logic.stockupdate;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫更新チェッククラス
 */
public class StockUpdateCheckLogic extends AbstractWmsLogic {

	// ===== 使用ロジッククラス =====
	@Inject
	private StockSelectLogic stockLogic;
	@Inject
	private ProductLogic productLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private ParamLogic paramLogic;
	@Inject
	private CustomerLogic customerLogic;
	// 在庫区分マスタ.逆転防止有効フラグを追加 2016.03.10 kawana Start
	@Inject
	private StockTypeLogic stockTypeLogic;
	// 在庫区分マスタ.逆転防止有効フラグを追加 2016.03.10 kawana End
	//[1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw Start
	@Inject
	private TStockBhv tStockBhv;
	//[1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw End

	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateLogicから移動) 2018.04.11 kawana Start

	// ===== enum =====

	/** 0在庫の除外フラグ */
	enum ExcludeZeroNumStock {
		/** 除外する */
		TRUE,
		/** 除外しない */
		FALSE
	}

	// [ON推-品向-437] 既存の入庫ラベルNo.チェックを追加 2014.12.15 kawana Start
	// 在庫一致チェックの戻り値
	enum ResStockMatchCheck {
		OK,
		NG,
		// [#3149] 入数チェックの除去 - NG_UNIT_NUMを削除 2017.12.04 kawana
		STOCK_NONE
	}

	// [ON推-品向-437] 既存の入庫ラベルNo.チェックを追加 2014.12.15 kawana End

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateLogicから移動) 2018.04.11 kawana End

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start
	/**
	 * <h2>入荷限界日の設定。</h2>
	 * <pre>
	 * 商品の入荷限界日を入荷実績ボディに設定する
	 *
	 * 【検索テーブル】
	 *   ・商品マスタ
	 *   ・荷主センタマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・入荷予定ボディID
	 *  ・商品ID
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  (入庫実績ボディ)
	 *  ・入荷予定ボディID
	 *  ・期限日
	 * </pre>
	 * @param planHeader		入荷予定ヘッダ
	 * @param planBodyList		入庫予定ボディリスト
	 * @param recordHeader		入庫実績ヘッダ
	 * @param recordBodyList	入庫実績ボディリスト
	 */
	public void setReceiveLimitDate(TReceivePlanH planHeader, List<TReceivePlanB> planBodyList, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList) {
		setReceiveLimitDate(planHeader, planBodyList, recordHeader, recordBodyList, null, false);
	}

	/**
	 * <h2>入荷限界日チェック。</h2>
	 * <pre>
	 * 商品の入荷限界日チェック
	 * パラメータの商品IDで登録されている商品に対して入荷限界日のチェックを行う
	 *
	 * 【検索テーブル】
	 *   ・商品マスタ
	 *   ・荷主センタマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・入荷予定ボディID
	 *  ・商品ID
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  (入庫実績ボディ)
	 *  ・入荷予定ボディID
	 *  ・期限日
	 * </pre>
	 * @param planHeader		入荷予定ヘッダ
	 * @param planBodyList		入庫予定ボディリスト
	 * @param recordHeader		入庫実績ヘッダ
	 * @param recordBodyList	入庫実績ボディリスト
	 */
	public void receiveLimitDateCheck(TReceivePlanH planHeader, List<TReceivePlanB> planBodyList, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList) {
		receiveLimitDateCheck(planHeader, planBodyList, recordHeader, recordBodyList, null);
	}

	/**
	 * <h2>入荷限界日チェック。</h2>
	 * <pre>
	 * 商品の入荷限界日チェック
	 * パラメータの商品IDで登録されている商品に対して入荷限界日のチェックを行う
	 * パラメータの期限日が入荷限界日を過ぎている場合は、エラー管理クラスにエラーを登録する
	 *
	 * 【検索テーブル】
	 *   ・商品マスタ
	 *   ・荷主センタマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (入荷予定ボディ)
	 *  ・入荷予定ボディID
	 *  ・商品ID
	 *  (入庫実績ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  (入庫実績ボディ)
	 *  ・入荷予定ボディID
	 *  ・期限日
	 * </pre>
	 * @param planHeader		入荷予定ヘッダ
	 * @param planBodyList		入庫予定ボディリスト
	 * @param recordHeader		入庫実績ヘッダ
	 * @param recordBodyList	入庫実績ボディリスト
	 * @param errSts			エラーステータス
	 */
	public void receiveLimitDateCheck(TReceivePlanH planHeader, List<TReceivePlanB> planBodyList, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts) {
		setReceiveLimitDate(planHeader, planBodyList, recordHeader, recordBodyList, errSts, true);
	}

	private void setReceiveLimitDate(TReceivePlanH planHeader, List<TReceivePlanB> planBodyList, TStoreRecordH recordHeader, List<TStoreRecordB> recordBodyList, ErrorStatus errSts, boolean withCheck) {

		// ===== 初期処理 =====

		// 入荷予定ボディMapの作成（キー入荷予定ボディID）
		HashMap<Long, TReceivePlanB> planBMap = new HashMap<Long, TReceivePlanB>();
		for (TReceivePlanB planB : planBodyList) {

			planBMap.put(planB.getReceivePlanBId(), planB);
		}

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
		boolean isWarn = false;
		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.21 ma.omori.gf Add [S]
		boolean isProdDtWarn = false;
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.21 ma.omori.gf Add [E]

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
		// システム日付の取得
		MClientCenter clientCenterC = new MClientCenter();
		clientCenterC.setClientId(recordHeader.getClientId());
		clientCenterC.setCenterId(recordHeader.getCenterId());
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithDeletedCheck(clientCenterC);
		String systemDt = clientCenter.getSystemDt();
		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

		// ===== bodyListのデータ件数分繰返 =====
		for (TStoreRecordB body : recordBodyList) {

			// [ON推-品向-812] 商品マスタ未存在の商品が登録されている場合に致命的エラー 2015.05.15 kawana Start
			Long productId = planBMap.get(body.getReceivePlanBId()).getProductId();
			if (productId == null) {

				body.setLimitDtNgFlg("0");
				body.setMaxLimitDt(null);

				continue;
			}
			// [ON推-品向-812] 商品マスタ未存在の商品が登録されている場合に致命的エラー 2015.05.15 kawana End

			// ===== 商品マスタの検索 =====
			MProduct productC = new MProduct();
			// [ON推-品向-812] 商品マスタ未存在の商品が登録されている場合に致命的エラー 2015.05.15 kawana Start
			productC.setProductId(productId);
			// [ON推-品向-812] 商品マスタ未存在の商品が登録されている場合に致命的エラー 2015.05.15 kawana End
			MProduct product = productLogic.getPkEntityWithDeletedCheck(productC);

			// ===== 入荷限界日チェック =====
			// [ON推-品向-573] 期限日チェック有無の判断を期限日逆転防止フラグではなく期限日数が0の場合は無効になるように変更 2015.04.23 kawana Start
			// 商品マスタ.入荷期限日数
			long productLimitNum = CU.nullToZero(product.getReceiveLimitNum());

			if (product.isLimitDtManagFlg$1() && productLimitNum != 0) {
				// 期限日管理有り かつ 期限日数が0以外の場合

				// [ON推-品向-573] 期限日チェック有無の判断を期限日逆転防止フラグではなく期限日数が0の場合は無効になるように変更 2015.04.23 kawana End

				// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
				// 入庫日
				String storeDtStr = body.getStoreDt();
				if (CU.isNullOrEmpty(storeDtStr)) {
					// 空の場合は荷主センタマスタのシステム日付を使用
					storeDtStr = systemDt;
				}
				// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

				Calendar limitDtCal = Calendar.getInstance();
				Calendar bodyLimitDtCal = Calendar.getInstance();

				try {
					// 入荷限界日の計算
					// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
					Date storeDt = dateFormat.parse(storeDtStr);
					limitDtCal.setTime(storeDt);
					// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End
					limitDtCal.add(Calendar.DATE, (int) productLimitNum);

					if (withCheck) {
						// 実績ボディの期限日
						Date bodyLimitDt = dateFormat.parse(body.getLimitDt());
						bodyLimitDtCal.setTime(bodyLimitDt);
					}
				} catch (ParseException e) {
					getErrorManager().throwException(e);
				}

				if (withCheck) {
					// 期限日チェック
					if (0 < limitDtCal.compareTo(bodyLimitDtCal)) {

						// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
						body.setLimitDtNgFlg("1");
						isWarn = true;
					} else {

						body.setLimitDtNgFlg("0");
					}
				}
				body.setMaxLimitDt(CU.calendarToString(limitDtCal));

				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
			} else if (product.isProdDtManagFlg$1() && CU.nullToZero(product.getProdDtLimitDaysRcv()) != 0) {
				// 製造日管理有り かつ 入荷製造日限界日数が0以外の場合

				// 入庫日
				String storeDtStr = body.getStoreDt();
				if (CU.isNullOrEmpty(storeDtStr)) {
					// 空の場合は荷主センタマスタのシステム日付を使用
					storeDtStr = systemDt;
				}

				Calendar prodLimitDtCal = Calendar.getInstance();
				Calendar bodyProdDtCal = Calendar.getInstance();

				try {
					// 入荷限界日の計算
					Date storeDt = dateFormat.parse(storeDtStr);
					prodLimitDtCal.setTime(storeDt);
					prodLimitDtCal.add(Calendar.DATE, CU.nullToZero(product.getProdDtLimitDaysRcv()).intValue() * -1);

					if (withCheck) {
						// 実績ボディの製造日
						Date bodyProdDt = dateFormat.parse(body.getProdDt());
						bodyProdDtCal.setTime(bodyProdDt);
					}
				} catch (ParseException e) {
					getErrorManager().throwException(e);
				}

				if (withCheck) {
					// 期限日チェック
					if ( prodLimitDtCal.compareTo(bodyProdDtCal) > 0) {

						// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
						body.setLimitDtNgFlg("1");
						isProdDtWarn = true;
					} else {

						body.setLimitDtNgFlg("0");
					}
				}
				body.setMaxLimitDt(CU.calendarToString(prodLimitDtCal));
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

			} else {

				body.setLimitDtNgFlg("0");
				body.setMaxLimitDt(null);
				// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End
			}
		}

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
		if (withCheck && isWarn && errSts != null) {
			// 警告メッセージを警告管理クラスに登録
			getWarnManager().add(warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()), WmsCoreMessageConst.STOCK_RESULT_REGISTER_LIMIT_DATE_OVER_INFORMATION);
		}

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.21 ma.omori.gf Add [S]
		if (withCheck && isProdDtWarn && errSts != null) {
			// 警告メッセージを警告管理クラスに登録
			getWarnManager().add(warnRetSts(errSts.getInnerStatus(), errSts.getStatusCd(), errSts.getRowIndex()), WmsCoreMessageConst.STOCK_RESULT_REGISTER_PRODUCT_DATE_OVER_INFORMATION);
		}
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.21 ma.omori.gf Add [E]

		// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End
	}

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana End

	/**
	 * <h2>全数出庫チェック。</h2>
	 * <pre>
	 * 全数出庫フラグの設定
	 * パラメータの入庫No.IDまたはその他の在庫情報で在庫を検索する
	 * 検索した在庫の引当可能数とパラメータの在庫移動実績数を比較し、全数出庫が部分出庫かを判断し、
	 * パラメータの全数出庫フラグに設定する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・荷姿ID
	 *  ・入庫No.ID
	 *  (在庫移動実績ボディ)
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader	在庫移動指示ヘッダ
	 * @param instBodyPicking	在庫移動指示ボディ(出庫)
	 * @param instBodyStore	在庫移動指示ボディ(入庫)
	 * @param recordBody	在庫移動実績ボディ
	 * @param errSts	エラーステータス
	 */
	public void allStockMoveIOutCheck(TMoveInstH instHeader, TMoveInstB instBodyPicking, TMoveInstB instBodyStore, TMoveRecordB recordBody, ErrorStatus errSts) {

		// ===== 在庫検索 =====

		// 検索条件
		Long storeNoId = instBodyPicking.getStoreNoId();

		TStock stock;
		if (storeNoId != null) {
			//  instBody.入庫NoIDが指定されている場合

			// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana Start
			stock = stockLogic.selectByStoreNo(storeNoId, errSts);
			// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana End
		} else {
			//  instBody.入庫NoIDが指定されていない場合

			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
			stock = stockLogic.selectByLot(StockSelectLotCondition.builder().clientId(instHeader.getClientId()).productId(instBodyPicking.getProductId()).stockTypeId(instBodyPicking.getStockTypeId())
					.locationId(recordBody.getLocationId()).depositId(instBodyPicking.getDepositId()).lotId(instBodyPicking.getLotId()).shapeId(instBodyPicking.getShapeId()).build()
					, errSts);
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
		}

		if (0 < getErrorManager().size()) {

			return;
		}

		// 結果確認
		if (stock == null) {
			// 0件の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.STOCK_DATA_NOT_FOUND_ERROR);
			// 処理終了
			return;
		}

		// [セット品対応] 全数出庫チェックでの２重の在庫検索を改善 2015.11.16 kawana Start

		//  全数出庫フラグの設定
		allStockMoveIOutCheck(instHeader, instBodyPicking, instBodyStore, recordBody, stock, errSts);

		// [セット品対応] 全数出庫チェックでの２重の在庫検索を改善 2015.11.16 kawana End
	}

	// [セット品対応] 全数出庫チェックでの２重の在庫検索を改善 2015.11.16 kawana Start

	/**
	 * <h2>全数出庫チェック。</h2>
	 * <pre>
	 * 全数出庫フラグの設定
	 * パラメータの入庫No.IDまたはその他の在庫情報で在庫を検索する
	 * 検索した在庫の引当可能数とパラメータの在庫移動実績数を比較し、全数出庫が部分出庫かを判断し、
	 * パラメータの全数出庫フラグに設定する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・ロットID
	 *  ・荷姿ID
	 *  ・入庫No.ID
	 *  (在庫移動実績ボディ)
	 *  ・ロケーションID
	 *  ・在庫移動実績数
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyPicking 在庫移動指示ボディ(出庫)
	 * @param instBodyStore 在庫移動指示ボディ(入庫)
	 * @param recordBody 在庫移動実績ボディ
	 * @param moveStock 移動在庫
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void allStockMoveIOutCheck(TMoveInstH instHeader, TMoveInstB instBodyPicking, TMoveInstB instBodyStore, TMoveRecordB recordBody, TStock moveStock, ErrorStatus errSts) {

		// ===== 全数出庫フラグ設定 =====
		// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana Start
		if (isAllShipping(moveStock, instHeader, instBodyStore, recordBody)) {
			// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana End

			// 全数出庫
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe Start
			recordBody.setAllShippingFlg_$1();
		} else {

			// 部分出庫
			recordBody.setAllShippingFlg_$0();
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 区分値マスタ変更に伴い誤字修正 2017.06.28 miyabe End
		}
	}

	// [セット品対応] 全数出庫チェックでの２重の在庫検索を改善 2015.11.16 kawana End

	// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana Start

	/**
	 * <h2>在庫移動が全数移動かの判定(在庫単位)。</h2>
	 * <pre>
	 * パラメータの移動元在庫と入庫の在庫移動データを比較し、
	 * 在庫移動が全数移動となるかを判定する。
	 *
	 * </pre>
	 *
	 * @param stock 移動元在庫
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBodyStore 在庫移動指示ボディ(入庫)
	 * @param recordBody 在庫移動実績ボディ(入庫)
	 *
	 * @return true:全数移動 false:部分移動
	 */
	public boolean isAllShipping(TStock stock, TMoveInstH instHeader, TMoveInstB instBodyStore, TMoveRecordB recordBody) {

		// 引当可能数と移動数
		if (stock.getChargeNum().compareTo(recordBody.getMoveNum()) != 0) {

			return false;
		}

		// 引当済数
		if (!WCC.isZero(stock.getAllocNum())) {

			return false;
		}

		// 在庫区分ID
		if (instBodyStore.getStockTypeId() == null ? false : (stock.getStockTypeId().longValue() != instBodyStore.getStockTypeId().longValue())) {
			return false;
		}

		// 預託ID
		if (instBodyStore.getDepositId() == null ? false : (stock.getDepositId().longValue() != instBodyStore.getDepositId().longValue())) {
			return false;
		}

		// 荷姿ID
		if (instBodyStore.getShapeId() == null ? false : (stock.getShapeId().longValue() != instBodyStore.getShapeId().longValue())) {
			return false;
		}

		// ロットID
		if (instBodyStore.getLotId() == null ? false : (stock.getLotId().longValue() != instBodyStore.getLotId().longValue())) {
			return false;
		}

		// 荷主ID
		if (instHeader.getClientId() == null ? false : (stock.getClientId().longValue() != instHeader.getClientId().longValue())) {
			return false;
		}

		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana Start
		// 仕入先ID
		if (stock.getTStoreNo().getSupplierId() == null) {
			if (instBodyStore.getSupplierId() != null) {
				return false;
			}
		} else {
			if (!stock.getTStoreNo().getSupplierId().equals(instBodyStore.getSupplierId())) {
				return false;
			}
		}
		// [ON推-品向-438] 全数出庫のチェックに仕入先の一致チェックを追加 2014.12.15 kawana End

		return true;
	}

	// [ON推-品向-398] 全数出庫の判定に預託、在庫区分などを追加 2014.12.04 kawana End

	/**
	 * <h2>入庫NOマージチェック。</h2>
	 * <pre>
	 * 入庫Noマージフラグの設定
	 * 下記の判断材料からパラメータの入庫Noマージフラグを設定する
	 * ・入庫Noマージ区分（パラメータマスタ/商品マスタ）
	 * ・ロケーション種別
	 * ・ピックロケフラグ
	 *
	 * 【検索テーブル】
	 *   ・パラメータマスタ
	 *   ・商品マスタ
	 *   ・ロケーションマスタ
	 *
	 * 【パラメータの使用項目】
	 *  (在庫移動指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  (在庫移動指示ボディ[入庫])
	 *  ・商品ID
	 *  (在庫移動実績ボディ)
	 *  ・ロケーションID
	 *
	 * </pre>
	 * @param instHeader	在庫移動指示ヘッダ
	 * @param instBody		在庫移動指示ボディ[入庫]
	 * @param recordBody	在庫移動実績ボディ
	 * @param errSts		エラーステータス
	 */
	public void onsNumMergeCheck(TMoveInstH instHeader, TMoveInstB instBody, TMoveRecordB recordBody, ErrorStatus errSts) {

		// ===== パラメータマスタ検索 =====
		MClientCenter paramC = new MClientCenter();
		paramC.setClientId(instHeader.getClientId());
		paramC.setCenterId(instHeader.getCenterId());

		MParam param = paramLogic.getUkEntityWithDeletedCheck(paramC);

		// ===== 商品マスタ検索 =====
		MProduct productC = new MProduct();
		productC.setProductId(instBody.getProductId());

		MProduct product = productLogic.getPkEntityWithDeletedCheck(productC);

		// ===== ロケーションマスタ検索 =====
		MLocation locationC = new MLocation();
		locationC.setLocationId(recordBody.getLocationId());

		MLocation location = locationLogic.getPkEntityWithDeletedCheck(locationC);

		// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start
		// ===== 入庫マージフラグの設定 =====
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		recordBody.setStoreNoMergeFlgAsStoreNoMergeFlg(onsNumMergeCheck(param, product, location));
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End
	}

	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana Start

	/**
	 * <h2>入庫NOマージチェック。</h2>
	 * <pre>
	 * 入庫Noマージフラグの判定
	 * 下記の判断材料からパラメータの入庫Noマージフラグを判定し返却する
	 * ・入庫Noマージ区分（パラメータマスタ/商品マスタ）
	 * ・ロケーション種別 (ロケーションマスタ)
	 * ・ピックロケフラグ (ロケーションマスタ)
	 * </pre>
	 *
	 * @param param パラメータマスタ
	 * @param product 対象の商品マスタ
	 * @param location 対象のロケーションマスタ
	 * @return StoreNoMergeFlg 入庫Noマージフラグ (0:マージしない、1:マージする)
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
	public CDef.StoreNoMergeFlg onsNumMergeCheck(MParam param, MProduct product, MLocation location) {

		if (location.isLocationType$01()) {
			// 入庫仮ロケーション の場合

			return CDef.StoreNoMergeFlg.$0;
		}

		if (!param.isStoreNoFlg$1()) {
			// 入庫No管理フラグ ＝ 管理する 以外 の場合

			return CDef.StoreNoMergeFlg.$1;
		}

		// ===== 以降、入庫No管理フラグ ＝ 管理する ===

		if (param.isMergeCls$02() || product.isMergeCls$02()) {
			// パラメータマスタ.入庫Noマージ区分 ＝ マージする もしくは
			// 商品マスタ.入庫Noマージ区分 ＝ マージする の場合

			return CDef.StoreNoMergeFlg.$1;
		}

		if (param.isMergeCls$01() || product.isMergeCls$01()) {
			// パラメータマスタ.入庫Noマージ区分 ＝ ピックロケのみ自動マージ もしくは
			// 商品マスタ.入庫Noマージ区分 ＝ ピックロケのみ自動マージ の場合

			if (location.isPickingLocationFlg$1()) {
				// ピックロケーション の場合

				return CDef.StoreNoMergeFlg.$1;
			}
		}

		return CDef.StoreNoMergeFlg.$0;
	}
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
	// [#192][2.1.0-CT-031] 在庫調整(新規)の在庫チェックに入庫日管理フラグの考慮追加 2016.11.10 kawana End

	// レスポンス対策 - 期限日逆転防止チェック内の商品検索、取引先検索をパラメータに変更 2016.01.26 kawana Start

	/**
	 * <h2>期限日逆転防止チェック。</h2>
	 * <pre>
	 * 出荷期限日逆転防止の設定
	 * 引当指示ボディの下記項目を設定する
	 * ・ロット管理フラグ
	 * ・期限日管理フラグ
	 * ・期限日逆転防止フラグ
	 * ・出荷限界期限日
	 *
	 * 【検索テーブル】
	 *   ・取引先マスタ
	 *   ・商品マスタ
	 *   ・在庫区分マスタ
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・納品先ID
	 *  ・出荷日
	 *  (引当指示ボディ)
	 *  ・商品ID
	 *  ・指定ロケーションID
	 *  ・指定ロットID
	 *  ・指定期限日
	 *
	 * </pre>
	 * @param header	引当指示ヘッダ
	 * @param body		引当指示ボディ
	 * @param errSts	エラーステータス
	 */
	public void limitDateManagementCheck(TAllocInstH header, TAllocInstB body, ErrorStatus errSts) {

		limitDateManagementCheck(header, body, null, null, null, errSts);
	}

	/**
	 * <h2>期限日逆転防止チェック。</h2>
	 * <pre>
	 * 出荷期限日逆転防止の設定
	 * 引当指示ボディの下記項目を設定する
	 * ・ロット管理フラグ
	 * ・期限日管理フラグ
	 * ・期限日逆転防止フラグ
	 * ・出荷限界期限日
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・出荷日
	 *  (引当指示ボディ)
	 *  ・指定ロケーションCD
	 *  ・指定ロット
	 *  ・指定期限日
	 *
	 * @param header 引当指示ヘッダ
	 * @param body 引当指示ボディ
	 * @param supplyCustomer 納品取引先マスタ
	 * @param product 商品マスタ
	 * @param stockType 在庫区分マスタ
	 * @param errSts エラーステータス
	 */
	public void limitDateManagementCheck(TAllocInstH header, TAllocInstB body, MCustomer supplyCustomer, MProduct product, MStockType stockType, ErrorStatus errSts) {

		if (product == null) {

			// ===== 商品マスタ検索 =====
			MProduct productC = new MProduct();
			productC.setProductId(body.getProductId());
			product = productLogic.getPkEntityWithDeletedCheck(productC);
		}

		// ===== ロット管理フラグ設定 =====
		body.setLotManagFlg(product.getLotManagFlg());

		// ===== 期限日管理フラグ設定 =====
		body.setLimitDtManagFlg(product.getLimitDtManagFlg());

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		body.setProdDtManagFlg(product.getProdDtManagFlg());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

		// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana Start
		// ===== 商品の期限日管理フラグの確認 =====
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//		if (product.isLimitDtManagFlg$0()) {
		if (product.isLimitDtManagFlg$0() && product.isProdDtManagFlg$0()) {
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
			// 期限日管理なし

			body.setLimitDtReverseFlg_$0();
			body.setShippingLimitDt(null);
			return;
		}
		// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana End

		// ===== 在庫の指定確認 =====
		// [SK2-065] ロットID、ロケーションIDのチェックからロット、ロケーションCDのチェックに変更（未設定のため) 2014.12.16 kawana Start
		if ((body.getLot() != null) ||
				(body.getLimitDt() != null) ||
				(body.getLocationCd() != null)
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
				|| (body.getProdDt() != null)
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]
				) {
			// ロットの指定がある場合
			// 期限日の指定がある場合
			// ロケーションCDの指定がある場合
			// [SK2-065] ロットID、ロケーションIDのチェックからロット、ロケーションCDのチェックに変更（未設定のため) 2014.12.16 kawana End

			body.setLimitDtReverseFlg_$0();
			body.setShippingLimitDt(null);
			return;
		}

		if (supplyCustomer == null) {

			// ===== 取引先マスタ検索 =====
			MCustomer customerC = new MCustomer();
			customerC.setCustomerId(header.getSupplyCustomerId());
			supplyCustomer = customerLogic.getPkEntityWithDeletedCheck(customerC);
		}

		// 在庫区分マスタ.逆転防止有効フラグを追加 2016.03.10 kawana Start
		if (stockType == null) {
			MStockType stockTypeC = new MStockType();
			stockTypeC.setStockTypeId(body.getStockTypeId());
			stockType = stockTypeLogic.getPkEntityWithDeletedCheck(stockTypeC);
		}

		// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana Start

		// ===== 期限日逆転防止フラグの設定 =====
		if (supplyCustomer.isLimitDtReverseFlg$1() &&
				product.isLimitDtReverseFlg$1() &&
				stockType.isReverseValidFlg$1()) {
			// 納品先(取引先)マスタ.期限日逆転防止フラグ = 管理する
			// 商品マスタ.期限日逆転防止フラグ = 管理する
			// 在庫区分マスタ.逆転防止有効フラグ = 有効

			// 在庫区分マスタ.逆転防止有効フラグを追加 2016.03.10 kawanaEnd

			body.setLimitDtReverseFlg_$1();
		} else {
			body.setLimitDtReverseFlg_$0();
		}

		// ===== 期限日逆転防止フラグの設定 =====
		// 商品マスタ.出荷限界日数
		long productLimitNum = CU.nullToZero(product.getShippingLimitNum());
		//[ver2.3][2752]出荷限界日数チェック条件に逆転防止有効フラグを追加 2017.09.29 miyabe Start
		if (productLimitNum == 0 || stockType.isReverseValidFlg$0()) {
			//[ver2.3][2752]出荷限界日数チェック条件に逆転防止有効フラグを追加 2017.09.29 miyabe End

			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
			// 商品マスタ.出荷限界日数
			long productProdDtLimitNum = CU.nullToZero(product.getProdDtLimitDaysShp());
			if (productProdDtLimitNum == 0 || stockType.isReverseValidFlg$0()) {

				// 出荷限界日数のチェックなし
				body.setShippingLimitDt(null);
			} else {
				try {
					// 出荷限界日の計算
					Date shippingDt = dateFormat.parse(header.getShippingDt());
					Calendar limitDtCal = Calendar.getInstance();
					limitDtCal.setTime(shippingDt);
					limitDtCal.add(Calendar.DATE, (int) productProdDtLimitNum * -1);

					// ボディに設定
					body.setShippingLimitDt(dateFormat.format(limitDtCal.getTime()));

				} catch (ParseException e) {
					getErrorManager().throwException(e);
				}
			}
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]
		} else {
			try {
				// 出荷限界日の計算
				Date shippingDt = dateFormat.parse(header.getShippingDt());
				Calendar limitDtCal = Calendar.getInstance();
				limitDtCal.setTime(shippingDt);
				limitDtCal.add(Calendar.DATE, (int) productLimitNum);

				// ボディに設定
				body.setShippingLimitDt(dateFormat.format(limitDtCal.getTime()));

			} catch (ParseException e) {
				getErrorManager().throwException(e);
			}
		}
		// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana End



	}

	// レスポンス対策 - 期限日逆転防止チェック内の商品検索、取引先検索をパラメータに変更 2016.01.26 kawana End

	// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana Start
	// [1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw Start
	/**
	 * <h2>在庫移動が全数移動かの判定(商品単位)。</h2>
	 * <pre>
	 * 商品、在庫区分、預託で商品を検索し、（ロット、期限日、入庫日などで分けない）
	 * 在庫移動の指示数と現在の在庫総数が一致している場合は全数移動と判定する。
	 *
	 *【パラメータの使用項目】
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・ロケーションID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・指示数
	 *
	 * </pre>
	 *
	 * @param tMoveInstB 在庫移動指示ボディ
	 *
	 * @return true:全数移動 false:部分移動
	 */
	public boolean isAllShippingProduct(TMoveInstB tMoveInstB) {

		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setProductId_Equal(tMoveInstB.getProductId());
		cb.query().setLocationId_Equal(tMoveInstB.getLocationId());
		cb.query().setStockTypeId_Equal(tMoveInstB.getStockTypeId());
		cb.query().setDepositId_Equal(tMoveInstB.getDepositId());
		List<TStock> stockList = tStockBhv.selectList(cb);

		BigDecimal sumChargeNum = WCC.ZERO;
		for (TStock tStock : stockList) {
			sumChargeNum = WCC.add(sumChargeNum, tStock.getChargeNum());
		}

		BigDecimal instNum = tMoveInstB.getInstNum();
		// [#5891][v3.0]HT在庫移動で全数移動しても補充ロケが引き継がれない不具合を修正 2019.01.15 kawana Start
		if (WCC.isEqual(sumChargeNum, instNum)) {
			// [#5891][v3.0]HT在庫移動で全数移動しても補充ロケが引き継がれない不具合を修正 2019.01.15 kawana End

			return true;
		}

		return false;
	}

	// [1.1.4-CT-096] ロケーションID、商品ID単位で全数移動チェック 2016.6.17 nayzaw End

	// [1.1.4-CT-095] HT在庫移動処理でロケーションID、商品ID,在庫区分、預託単位で全数移動チェック 2016.6.21 nayzaw Start
	/**
	 * <h2>在庫移動が全数移動かの判定(商品単位)(移動入庫時の判定)。</h2>
	 * <pre>
	 * 商品、在庫区分、預託で商品を検索し、（ロット、期限日、入庫日などで分けない）
	 * 在庫移動の指示数と移動数、現在の在庫総数から全数移動かを判定する。
	 *
	 *【パラメータの使用項目】
	 *  (在庫移動指示ボディ)
	 *  ・商品ID
	 *  ・ロケーションID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・指示数
	 * </pre>
	 *
	 * @param tMoveInstB 在庫移動指示ボディ
	 *
	 * @return true:全数移動 false:部分移動
	 */
	public boolean isAllShippingProductStore(TMoveInstB tMoveInstB) {

		TStockCB cb = tStockBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setProductId_Equal(tMoveInstB.getProductId());
		cb.query().setLocationId_Equal(tMoveInstB.getLocationId());
		cb.query().setStockTypeId_Equal(tMoveInstB.getStockTypeId());
		cb.query().setDepositId_Equal(tMoveInstB.getDepositId());
		List<TStock> stockList = tStockBhv.selectList(cb);

		BigDecimal sumChargeNum = WCC.ZERO;
		BigDecimal sumMoveNum = WCC.ZERO;
		for (TStock tStock : stockList) {
			sumChargeNum = WCC.add(sumChargeNum, tStock.getChargeNum());
			sumMoveNum = WCC.add(sumMoveNum, tStock.getMoveNum());
		}

		BigDecimal instNum = tMoveInstB.getInstNum();
		// [#5891][v3.0]HT在庫移動で全数移動しても補充ロケが引き継がれない不具合を修正 2019.01.15 kawana Start
		if (WCC.isEqual(sumMoveNum, instNum) && WCC.isZero(sumChargeNum)) {
			// [#5891][v3.0]HT在庫移動で全数移動しても補充ロケが引き継がれない不具合を修正 2019.01.15 kawana End

			return true;
		}

		return false;
	}
	// [1.1.4-CT-095] HT在庫移動処理でロケーションID、商品ID,在庫区分、預託単位で全数移動チェック 2016.6.21 nayzaw End
	// [#188][2.1.0-CT-029]HT在庫移動の部分移動で補充ロケが移動される不具合を修正 2016.11.14 kawana End

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateLogicから移動) 2018.04.11 kawana Start

	/**
	 * <h2>入庫ラベルNoのチェック.</h2>
	 * <pre>
	 * 入庫ラベルNo.で登録されている在庫を検索し、
	 * 引数の在庫と情報が一致しているかチェックする。
	 *
	 * 一致していない場合はエラー管理クラスにエラーを登録する。
	 *
	 * 【チェック内容】
	 * ・荷主ID
	 * ・商品ID
	 * ・在庫区分ID
	 * ・預託ID
	 * ・ロットID
	 * ・仕入先ID ※未指定の場合は対象外
	 * ・入庫日 ※入庫日管理フラグが1の場合
	 * ・ロケーションID ※在庫数が1以上のものが別ロケーソンに存在するかをチェック
	 *
	 * </pre>
	 *
	 * @param storeLabelNo 登録する入庫ラベルNo.
	 * @param stock 在庫情報
	 * @param storeDtFlg 入庫日管理フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkStoreLabelNo(String storeLabelNo, TStock stock, CDef.StoreDtFlg storeDtFlg, ErrorStatus errSts) {

		// SKU等の一致チェック
		switch (checkMatchStock(storeLabelNo, stock, storeDtFlg, StockUpdateCheckLogic.ExcludeZeroNumStock.FALSE)) {
		case OK:
			break;
		case NG:
			if (storeDtFlg == CDef.StoreDtFlg.$1) {
				getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_IS_MANAGE_STORE_DT_ERROR, storeLabelNo);
			} else {
				getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_ERROR, storeLabelNo);
			}
			return;
		case STOCK_NONE:
			return;
		}

		// 別ロケーションでの使用チェック (在庫が1以上)
		TStockCB stockCheckCb = tStockBhv.newMyConditionBean();

		stockCheckCb.checkInvalidQuery();
		stockCheckCb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		stockCheckCb.query().setLocationId_NotEqual(stock.getLocationId());
		stockCheckCb.query().setChargeNum_GreaterThan(WCC.ZERO);

		int otherStockSize = tStockBhv.selectCount(stockCheckCb);

		if (1 <= otherStockSize) {
			// 1件以上の場合

			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_OTHER_LOCATION_ERROR);
			return;
		}
	}

	/**
	 * <h2>入庫ラベルNoのチェック.</h2>
	 * <pre>
	 * 入庫ラベルNo.で登録されている在庫を検索し、
	 * 引数の在庫と情報が一致しているかチェックする。
	 *
	 * 【チェック内容】
	 * ・荷主ID
	 * ・商品ID
	 * ・在庫区分ID
	 * ・預託ID
	 * ・ロットID
	 * ・仕入先ID ※未指定の場合は対象外
	 * ・入庫日 ※入庫日管理フラグが1の場合
	 *
	 * </pre>
	 * @return ResStockMatchCheck チェック結果
	 */
	ResStockMatchCheck checkMatchStock(String storeLabelNo, TStock stock, CDef.StoreDtFlg manageStoreDtFlg, ExcludeZeroNumStock excludeZeroNumStock) {

		// 入庫ラベルNoで検索
		TStockCB checkInfoCb = tStockBhv.newMyConditionBean();
		checkInfoCb.checkInvalidQuery();
		checkInfoCb.setupSelect_TStoreNo();
		// [C-CWMS-0048] 入庫日管理対応(不要になった処理を削除) 2015.12.28 kawana
		checkInfoCb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana
		// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana Start
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		if (excludeZeroNumStock == ExcludeZeroNumStock.TRUE) {
			// 在庫数0の在庫は比較対象としない

			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
			checkInfoCb.orScopeQuery(new OrQuery<TStockCB>() {
				public void query(TStockCB orCB) {
					orCB.query().setChargeNum_GreaterThan(WCC.ZERO);
					orCB.query().setAllocNum_GreaterThan(WCC.ZERO);
					orCB.query().setMoveNum_GreaterThan(WCC.ZERO);
				}
			});
		}
		// [ON推-品向-1155] 入荷実績訂正するとマージ先在庫の在庫区分などが変わってしまう問題を修正 2016.05.12 kawana End
		checkInfoCb.fetchFirst(1);

		// 検索実行
		TStock checkInfoStock = tStockBhv.selectEntity(checkInfoCb);

		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		// [ON推-品向-442] 在庫移動[入庫]の入庫ラベルNo.チェックを追加(チェック処理の抜出) 2015.04.23 kawana Start
		// 在庫の比較結果を返却
		return checkMatchStock(checkInfoStock, stock, manageStoreDtFlg);
		// [ON推-品向-442] 在庫移動[入庫]の入庫ラベルNo.チェックを追加(チェック処理の抜出) 2015.04.23 kawana End
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
	}

	// [ON推-品向-437] 既存の入庫ラベルNo.チェックを追加 2014.12.16 kawana End

	// [ON推-品向-442] 在庫移動[入庫]の入庫ラベルNo.チェックを追加 2015.04.23 kawana Start
	/**
	 * <h2>在庫の一致チェック。</h2>
	 * <pre>
	 * 引数の在庫と情報が一致しているかチェックする。
	 *
	 * 【チェック内容】
	 * 荷主ID、商品ID、在庫区分ID、預託ID、ロットID、仕入先ID、
	 * (入庫日管理フラグが1の場合)入庫日
	 * </pre>
	 * @param selectStock 検索した在庫情報
	 * @param checkStock チェックする在庫情報
	 * @param setLotId true:ロットID設定済 false:ロットID未設定
	 * @return ResStockMatchCheck チェック結果
	 */
	private ResStockMatchCheck checkMatchStock(TStock selectStock, TStock checkStock, CDef.StoreDtFlg manageStoreDtFlg) {
		if (selectStock == null) {
			// 在庫に登録なし
			return ResStockMatchCheck.STOCK_NONE;
		}

		// 入力内容との一致確認
		if ((selectStock.getClientId().longValue() != checkStock.getClientId().longValue()) ||
				(selectStock.getProductId().longValue() != checkStock.getProductId().longValue()) ||
				(selectStock.getStockTypeId().longValue() != checkStock.getStockTypeId().longValue()) ||
				(selectStock.getDepositId().longValue() != checkStock.getDepositId().longValue()) ||
				// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
				(!equals(selectStock.getLotId(), checkStock.getLotId()))) { // ロットIDは入力側のnullがありえる
			// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

			// NG
			return ResStockMatchCheck.NG;
		}

		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start

		// 仕入先の一致確認
		if (selectStock.getTStoreNo().getSupplierId() == null) {
			if (checkStock.chaseTStoreNo().getSupplierId() != null) {
				return ResStockMatchCheck.NG;
			}
		} else {
			if (checkStock.chaseTStoreNo().getSupplierId() != null) {
				// 入力がない場合はチェックしない

				if (!selectStock.getTStoreNo().getSupplierId().equals(checkStock.chaseTStoreNo().getSupplierId())) {
					return ResStockMatchCheck.NG;
				}
			}
		}

		// 入庫日の一致確認
		// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana Start
		if (manageStoreDtFlg == CDef.StoreDtFlg.$1) {
			// [#52] マージされた全在庫の期限日が変わってしまう問題を解消 2016.10.18 kawana End
			if (selectStock.getTStoreNo().getStoreDt() == null) {
				if (checkStock.chaseTStoreNo().getStoreDt() != null) {
					return ResStockMatchCheck.NG;
				}
			} else {
				if (!selectStock.getTStoreNo().getStoreDt().equals(checkStock.chaseTStoreNo().getStoreDt())) {
					return ResStockMatchCheck.NG;
				}
			}
		}
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End

		// [#3149] 入数の変更チェックを削除 2017.12.04 kawana

		return ResStockMatchCheck.OK;
	}

	/**
	 * 比較(どちらかがnullの場合はfalse)
	 */
	private boolean equals(Long l1, Long l2) {

		if (l1 == null && l2 == null) {
			return true;
		}

		if (l1 == null || l2 == null) {
			return false;
		}

		return l1.longValue() == l2.longValue();
	}

	// [ON推-品向-442] 在庫移動[入庫]の入庫ラベルNo.チェックを追加 2015.04.23 kawana End

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateLogicから移動) 2018.04.11 kawana End
}
