package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TAllocInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocLotBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.WmsCorePropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;
import com.oneslogi.wms.core.logic.shipping.EmergencyReplenishLogic.ReplenishInfo;
import com.oneslogi.wms.core.logic.shipping.StockAllocateReplenishInstLogic.ReplenishInstInfo;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateCheckLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;

/**
 * 在庫引当ロジッククラス
 */
public class StockAllocateLogic extends AbstractWmsLogic {

	// レスポンス対策 - 処理全体を見直し修正 2016.02.24 kawana

	// ===== 使用テーブル =====

	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
	@Inject
	private TAllocInstBBhv tAllocInstBBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPickingBBhv tPickingBBhv;
	@Inject
	private TPickingRBhv tPickingRBhv;
	@Inject
	private TAllocLotBhv tAllocLotBhv;
	@Inject
	private TStockBhv tStockBhv;
	// 2014/09/29 仕様変更により引当指示ヘッダ、ボディのBhvを削除(項番5～6)

	// ===== 使用ロジッククラス =====

	@Inject
	private StockUpdateLogic stockUpdateLogic;
	// [C-CWMS-0025] 在庫の引当順序を設定できるように変更 2015.05.11 kawana Start
	@Inject
	private ParamLogic paramLogic;
	// [C-CWMS-0025] 在庫の引当順序を設定できるように変更 2015.05.11 kawana End
	// [C-CWMS-0050] 緊急補充機能を追加(在庫の取得メソッドを抽出) 2016.01.07 kawana Start
	@Inject
	private EmergencyReplenishLogic emergencyReplenishLogic;
	// [C-CWMS-0050] 緊急補充機能を追加(在庫の取得メソッドを抽出) 2016.01.07 kawana End
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana Start
	@Inject
	private CustomerLogic customerLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.08 kawana End
	@Inject
	private StockAllocateLastLotLogic lastLotLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana Start
	@Inject
	private ProductShapeCalcLogic productShapeCalcLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana End
	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
	@Inject
	private StockAllocateReplenishInstLogic stockAllocateReplenishInstLogic;
	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

	// ===== 公開変数 =====

	// [ON推-品向-1086] 緊急補充、欠品メッセージの管理を呼出し元で行うように変更 2016.04.08 kawana Start
	/** 引当状況 */
	public static class AllocateState {
		/** 欠品有無 (true:欠品有) */
		public boolean isStockOut = false;
		/** 緊急補充有無 (true:緊急補充有) */
		public boolean didReplenish = false;
	}

	// [ON推-品向-1086] 緊急補充、欠品メッセージの管理を呼出し元で行うように変更 2016.04.08 kawana End

	// ===== 内部変数 =====

	/** 引当状況(戻り値に使用) */
	private AllocateState state;

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

	/** 緊急補充ゾーン管理クラス */
	private EmergencyReplenishZoneManager emergencyReplenishZoneManager;

	/** 緊急補充ロケーション管理クラス */
	private EmergencyReplenishLocationManager emergencyReplenishLocationManager;

	/** 引当種別 */
	private enum AllocateType {
		CASE,
		PIECE
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

	/**
	 * <h2>在庫引当処理。</h2>
	 * <pre>
	 * コントロールNo.を検索条件に引当指示ボディを検索し、引当指示に従い以下の順番で在庫引当を行う。
	 * 引当する在庫のロケーション順などはパラメータマスタの引当ソートキーに従う。
	 *
	 * 1. 期限日管理、期限日逆転管理をする場合、
	 *    ピックロケーションの在庫からバックロケーションの在庫の期限日より古い在庫を引当
	 * 2. 商品のケース数で割り切れる在庫数をバックロケーションから引当 (ケース引当)
	 * 3. ピックロケーションに在庫数が足りない場合は緊急補充ロジック.緊急補充を呼出して在庫を補充
	 * 4. ピックロケーション、バックロケーションから残りの在庫を引当
	 *
	 * 商品の出荷限界期限日の計算は{@link StockUpdateCheckLogic#limitDateManagementCheck(TAllocInstH, TAllocInstB, MCustomer, MProduct ,com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新チェックロジック.期限日逆転防止チェック}を使用する。
	 * 納品先ごとの最終出荷期限日の計算は{@link StockAllocateLastLotLogic#setLimitLot(TAllocInstH, TAllocInstB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫引当用最終ロットロジック.最終出荷期限日設定}を使用する。
	 * ピックロケーションに在庫数が足りない時の緊急補充処理は{@link EmergencyReplenishLogic#replenish(long, long, TAllocInstB, long, String, String, StockAllocateData, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 緊急補充ロジック.緊急補充}を使用する。
	 * 在庫受払の作成は{@link StockUpdateLogic#newShipedStockInout(long, long, TAllocInstH, TAllocInstB, String) 在庫更新ロジック.出庫[黒]在庫受作成}を使用し、
	 * 在庫・在庫日報の更新、在庫受払の登録は{@link StockUpdateLogic#shipedBatch(List, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新ロジック.出庫[黒]一括処理}を使用する。
	 *
	 * このメソッドで「ピッキンググループNo」「届先単位No」「出庫作業No」を採番マスタより採番する。
	 *
	 * 【検索テーブル】
	 * ・出荷指示ボディ(引当指示ボディ)
	 * ・在庫
	 * ・最終ロット
	 * ・荷主センタマスタ
	 * ・パラメータマスタ
	 *
	 * 【更新テーブル】
	 * ・出荷指示ボディ
	 * ・引当指示ボディ
	 * ・最終ロット
	 *
	 * 【登録テーブル】
	 * ・出庫ヘッダ
	 * ・出庫帳票
	 * ・出庫ボディ
	 * ・引当ロット
	 * ・最終ロット
	 *
	 * 【パラメータの使用項目】
	 *  (出荷指示ヘッダ)
	 *  ・センタID
	 *  ・荷主ID
	 *  ・コントロールNo.
	 *
	 * </pre>
	 *
	 * @param shippingInstHead 出荷指示ヘッダ
	 * @param pickingBatchNo 出庫指示バッチNo
	 * @param processNo 処理No
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return 引当状態クラス
	 */
	public AllocateState allocate(TShippingInstH shippingInstHead, String pickingBatchNo, String processNo, ErrorStatus errSts) {

		state = new AllocateState();

		// ===== 対象データ検索(コントロールNo) =====

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();
		final long controlNo = shippingInstHead.getControlNo();

		List<TAllocInstB> allocBodyList = selectAllocateList(centerId, clientId, controlNo, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

		// ===== 緊急補充ゾーンの検索、管理 =====

		// 引当済の在庫数により補充先が変わるため、緊急補充ゾーンの在庫状況を管理する
		// 在庫の補充、引当が発生した場合は、管理クラスに反映させ、緊急補充をする時の補充先は管理クラスから取得する

		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(centerId);
		mccCb.setClientId(clientId);
		MParam param = paramLogic.getUkEntityUseCash(mccCb);

		List<MLocation> replenishZoneLocationList = emergencyReplenishLogic.getReplenishZoneLocationList(param.getEmReplenishZoneId());
		emergencyReplenishZoneManager = new EmergencyReplenishZoneManager(replenishZoneLocationList, param.getEmReplenishAllocCls());

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// ===== 引当前処理(出庫ヘッダ、出庫帳票の登録、商品IDごとに引当指示をまとめる 等) =====

		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(pickingGroupNo削除) 2018.08.22 kawana Delete

		// 出庫ヘッダマップ (キー：引当指示ヘッダID)
		Map<Long, TPickingH> pickingHMap = new HashMap<Long, TPickingH>();
		// 届先単位No.マップ (キー：届先単位キー)
		Map<DelivKey, String> delivUnitNoMap = new HashMap<DelivKey, String>();

		// [1.1.4-CT-040] 緊急補充(引当順序)の順番を商品CD順になるように変更 2016.05.19 kawana Start
		// 引当指示を商品、在庫区分、預託でまとめる
		Map<StockAllocateSKU, List<TAllocInstB>> batchProductAllocBodyMap = new LinkedHashMap<StockAllocateSKU, List<TAllocInstB>>();
		// [1.1.4-CT-040] 緊急補充(引当順序)の順番を商品CD順になるように変更 2016.05.19 kawana End

		for (TAllocInstB allocInstB : allocBodyList) {

			// ===== 出庫ヘッダ、出庫帳票の作成 =====

			TAllocInstH allocInstH = allocInstB.getTAllocInstH();
			long allocInstHId = allocInstH.getAllocInstHId();
			if (!pickingHMap.containsKey(allocInstHId)) {
				// 出庫ヘッダ、出庫帳票作成

				DelivKey delivKey = createDelivKey(allocInstH);

				String delivUnitNo;
				if (delivUnitNoMap.containsKey(delivKey)) {

					delivUnitNo = delivUnitNoMap.get(delivKey);
				} else {
					// 採番

					delivUnitNo = numberingLogic.getNumbering(centerId, WmsCoreNumberingConst.DELIV_UNIT_NO);
					delivUnitNoMap.put(delivKey, delivUnitNo);
				}

				// [#5131][v3.1] ピッキングリストの採番を発行時に変更(pickingGroupNo削除) 2018.08.22 kawana Start
				TPickingH pickingH = insertPickingH(allocInstH, delivUnitNo, errSts);
				// [#5131][v3.1] ピッキングリストの採番を発行時に変更(pickingGroupNo削除) 2018.08.22 kawana End
				if (getErrorManager().size() > 0) {
					return null;
				}

				pickingHMap.put(allocInstHId, pickingH);
			}

			// ===== 商品、在庫区分、預託ごとにまとめる =====

			StockAllocateSKU sku = StockAllocateSKU.builder()
					.productId(allocInstB.getProductId())
					.stockTypeId(allocInstB.getStockTypeId())
					.depositId(allocInstB.getDepositId()).build();

			if (batchProductAllocBodyMap.containsKey(sku)) {

				batchProductAllocBodyMap.get(sku).add(allocInstB);
			} else {

				List<TAllocInstB> allocInstBList = new ArrayList<TAllocInstB>();
				allocInstBList.add(allocInstB);
				batchProductAllocBodyMap.put(sku, allocInstBList);
			}
		}

		List<TStockInout> insertStockInoutList = new ArrayList<TStockInout>();
		List<TAllocLot> insertAllocLotList = new ArrayList<TAllocLot>();
		List<TPickingB> insertPickingBList = new ArrayList<TPickingB>();

		// 商品ID毎に処理する
		for (Map.Entry<StockAllocateSKU, List<TAllocInstB>> entry : batchProductAllocBodyMap.entrySet()) {

			StockAllocateSKU sku = entry.getKey();
			List<TAllocInstB> allocInstBList = entry.getValue();

			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

			// ===== 補充ロケーションの検索、管理 =====

			List<MLocation> skuReplenishLocationList = emergencyReplenishLogic.getSkuReplenishLocationList(centerId, sku);
			emergencyReplenishLocationManager = new EmergencyReplenishLocationManager(skuReplenishLocationList);

			// ===== 在庫引当 =====

			StockAllocateData allocData = new StockAllocateData();
			allocData.setPickingHMap(pickingHMap);

			allocate(centerId, clientId, sku, allocInstBList, pickingBatchNo, processNo, allocData, errSts);
			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
			if (0 < getErrorManager().size()) {
				return null;
			}

			// 登録、更新データの抜出
			insertStockInoutList.addAll(allocData.getInsertStockInoutList());
			insertAllocLotList.addAll(allocData.getInsertAllocLot());
			insertPickingBList.addAll(allocData.getInsertPickingBList());
		}

		// ===== 在庫、在庫日報、在庫受払の登録 =====

		stockUpdateLogic.shipedBatch(insertStockInoutList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 引当指示ボディ、出荷指示ボディ、出荷指示ヘッダの更新 =====

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
		Set<Long> shippingInstHIdSet = new HashSet<Long>();
		Set<Long> stockOutIdSet = new HashSet<Long>();
		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		for (TAllocInstB allocInstB : allocBodyList) {

			// 引当指示ボディ更新実行
			tAllocInstBBhv.update(allocInstB);

			for (TShippingInstB shippingInstB : allocInstB.getTShippingInstBList()) {

				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

				// 更新対象の出荷指示ヘッダID
				shippingInstHIdSet.add(shippingInstB.getShippingInstHId());

				// 出荷指示ボディ更新実行
				tShippingInstBBhv.update(shippingInstB);

				// 欠品有無を確認
				if (WCC.isPositive(shippingInstB.getStockOutNum())) {

					// 欠品の出荷指示ヘッダID
					stockOutIdSet.add(shippingInstB.getShippingInstHId());

					// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

					state.isStockOut = true;
				}
			}
		}

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

		// ===== 欠品フラグの更新 =====

		updateStockOutFlg(shippingInstHIdSet, stockOutIdSet);

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		// ===== 引当ロットの登録 =====

		tAllocLotBhv.batchInsert(insertAllocLotList);

		// ===== 最終ロットの更新 =====

		lastLotLogic.updateModifiedLastLot();

		// ===== 出庫ボディの登録 =====

		if (0 < insertPickingBList.size()) {

			// [#5131][v3.1] ピッキングリストの採番を発行時に変更(setTempNoWithSort呼出削除) 2018.08.22 kawana Delete

			// 出庫ボディ一括登録
			tPickingBBhv.batchInsert(insertPickingBList);
		}

		return state;
	}

	/**
	 * 引当対象データを検索する。
	 * 商品CD、納品先 - 引当順、出荷日、緊急フラグ、納品先CDでソートする
	 *
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param controlNo 検索条件のコントロールNo.
	 * @param errSts エラー時に設定するステータス
	 * @return 検索した引当指示ボディリスト
	 */
	private List<TAllocInstB> selectAllocateList(final long centerId, final long clientId, final long controlNo, ErrorStatus errSts) {
		TShippingInstBCB cb = tShippingInstBBhv.newMyConditionBean();
		cb.setupSelect_TAllocInstB().withTAllocInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_TAllocInstB().withMProduct();
		cb.setupSelect_TAllocInstB().withMStockType();
		cb.setupSelect_TShippingInstH();

		// 検索条件(コントロールNo.)
		cb.checkInvalidQuery();
		cb.query().queryTShippingInstH().setCenterId_Equal(centerId);
		cb.query().queryTShippingInstH().setClientId_Equal(clientId);
		cb.query().queryTShippingInstH().setControlNo_Equal(controlNo);

		// ソート順の設定
		cb.query().queryTAllocInstB().queryMProduct().addOrderBy_ProductCd_Asc();
		cb.query().queryTAllocInstB().queryTAllocInstH().queryMCustomerBySupplyCustomerId().addOrderBy_AllocOrder_Asc().withNullsLast();
		cb.query().queryTAllocInstB().queryTAllocInstH().addOrderBy_ShippingDt_Asc();
		cb.query().queryTShippingInstH().addOrderBy_EmergencyFlg_Desc().withNullsLast();
		cb.query().queryTAllocInstB().queryTAllocInstH().addOrderBy_SupplyCustomerCd_Asc();
		// [#6721][v3.1]在庫引当の伝票引当順のソートキーに顧客出荷指示No.を追加 2019.09.26 kawana Start
		cb.query().queryTShippingInstH().addOrderBy_ClientShippingNo_Asc().withNullsLast();
		cb.query().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc();
		cb.query().addOrderBy_LineNo_Asc().withNullsLast();
		cb.addOrderBy_PK_Asc();
		// [#6721][v3.1]在庫引当の伝票引当順のソートキーに顧客出荷指示No.を追加 2019.09.26 kawana End

		List<TShippingInstB> selectShippingInstBList = tShippingInstBBhv.selectList(cb);
		if (selectShippingInstBList.size() == 0) {
			// 対象データなし
			this.getErrorManager().add(errSts, WmsCoreMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 引当指示ボディリストの作成 =====
		List<TAllocInstB> allocBodyList = new ArrayList<TAllocInstB>();
		Map<Long, TAllocInstB> allocBodyMap = new HashMap<Long, TAllocInstB>();
		for (TShippingInstB shippingInstB : selectShippingInstBList) {

			long allocInstBId = shippingInstB.getAllocInstBId();

			// [ON推-品向-1126] 指示数0の場合に欠品となる問題を修正 2016.04.18 kawana Start

			// 指示数 <= 引当数
			if (WCC.isLessEqual(shippingInstB.getInstNum(), CU.nullToZero(shippingInstB.getAllocNum()))) {
				// 欠品なし

				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana Start
				shippingInstB.setStockOutNum(WCC.ZERO);
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana End
			} else {
				// 欠品あり

				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana Start
				shippingInstB.setStockOutNum(WCC.subtract(shippingInstB.getInstNum(), CU.nullToZero(shippingInstB.getAllocNum())));
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.27 kawana End
			}

			// [ON推-品向-1126] 指示数0の場合に欠品となる問題を修正 2016.04.18 kawana End

			TAllocInstB allocInstB;
			if (allocBodyMap.containsKey(allocInstBId)) {

				allocInstB = allocBodyMap.get(allocInstBId);
			} else {

				allocInstB = shippingInstB.getTAllocInstB();

				allocBodyList.add(allocInstB);
				allocBodyMap.put(allocInstBId, allocInstB);
			}

			allocInstB.getTShippingInstBList().add(shippingInstB);
		}

		return allocBodyList;
	}

	// 標準引当、商品単位引当の分かれていたのを商品単位引当てのみに変更(不要な処理の削除) 2016.07.19 kawana

	/**
	 * 商品単位引当
	 */
	private void allocate(long centerId, long clientId, StockAllocateSKU sku, List<TAllocInstB> allocInstBodyList, String pickingBatchNo, String processNo, StockAllocateData allocData,
			ErrorStatus errSts) {

		// ===== 引当在庫を検索 =====

		// 検索条件を作成
		TAllocInstH selectConditionHeader = new TAllocInstH();
		selectConditionHeader.setCenterId(centerId);
		selectConditionHeader.setClientId(clientId);
		TAllocInstB selectConditionBody = new TAllocInstB();
		selectConditionBody.setProductId(sku.getProductId());
		selectConditionBody.setStockTypeId(sku.getStockTypeId());
		selectConditionBody.setDepositId(sku.getDepositId());

		// １件のみ対象の場合は、絞り込み条件を追加
		if (allocInstBodyList.size() == 1) {
			selectConditionBody.setLocationId(allocInstBodyList.get(0).getLocationId());
			selectConditionBody.setLocationCd(allocInstBodyList.get(0).getLocationCd());
			selectConditionBody.setLotId(allocInstBodyList.get(0).getLotId());
			selectConditionBody.setLot(allocInstBodyList.get(0).getLot());
			selectConditionBody.setLimitDt(allocInstBodyList.get(0).getLimitDt());
		}

		List<TStock> selectStockList = selectStockList(selectConditionHeader, selectConditionBody, true, true);
		if (selectStockList.size() == 0) {
			// 引当在庫なし
			return;
		}

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// 引当商品のケース荷姿を取得
		MProductShape caseProductShape = productShapeCalcLogic.getCaseProductShape(sku.getProductId());
		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// 引当指示ボディの件数分 繰返
		for (TAllocInstB allocBody : allocInstBodyList) {

			TAllocInstH allocHeader = allocBody.getTAllocInstH();

			// 納品先 出荷停止チェック
			if (allocHeader.chaseMCustomerBySupplyCustomerId().isShippingStopFlg$1()) {
				// 出荷停止

				// 引当なし
				allocBody.setAllocNum(WCC.ZERO);
				return;
			}

			// ===== 期限日、最終ロット期限日の設定 =====
			setLimitDt(allocHeader, allocBody, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana Start

			// ===== 対象在庫の抜粋 =====

			// 検索した在庫リストと緊急補充した在庫リストから対象を抜粋
			List<TStock> stockList = new ArrayList<TStock>();
			stockList.addAll(selectStockList);
			stockList.addAll(allocData.getAddReplenishStockList());

			List<TStock> targetStockList = new ArrayList<TStock>();
			for (TStock stock : stockList) {

				// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana End

				if (isTargetStock(stock, allocBody)) {
					targetStockList.add(stock);
				}
			}

			// [#2961] 複数荷姿対応 2017.11.09 kawana Start
			allocData.setStockList(targetStockList, caseProductShape);
			// [#2961] 複数荷姿対応 2017.11.09 kawana End

			// ===== 引当処理 =====
			allocate(allocBody, pickingBatchNo, processNo, allocData, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}
	}

	// [C-CWMS-0050] 緊急補充機能を追加(在庫の取得メソッドを抽出) 2016.01.07 kawana Start

	/**
	 * <p>補充元(バックロケーション)の引当在庫の検索処理.</p>
	 * <pre>
	 * パラメータの設定項目を検索条件に引当可能な在庫を検索する。
	 * 戻り値の在庫のソート順はパラメータマスタの引当ソートキーに従う。
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *
	 *  (引当指示ボディ)
	 *  ・指定倉庫ID
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・指定ロケーションCD
	 *  ・指定ロット
	 *  ・指定期限日
	 *  ・出荷限界期限日
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 *
	 * @return 引当可能な在庫のリスト
	 */
	public List<TStock> selectReplenishStockList(TAllocInstH allocInstHeader, TAllocInstB allocInstBody) {

		// 引当在庫を検索
		List<TStock> stockList = selectStockList(allocInstHeader, allocInstBody, false, true);
		return stockList;
	}

	/**
	 * <p>引当在庫の検索処理.</p>
	 * <pre>
	 * パラメータの設定項目を検索条件に引当可能な在庫を検索する。
	 * 戻り値の在庫のソート順はパラメータマスタの引当順を適用する。
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 *  ・荷主ID
	 *  ・センタID
	 *  (引当指示ボディ)
	 *  ・指定倉庫ID
	 *  ・商品ID
	 *  ・在庫区分ID
	 *  ・預託ID
	 *  ・指定ロケーションCD
	 *  ・指定ロット
	 *  ・指定期限日
	 *  ・出荷限界期限日
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 * @param doSelectPickLocation ピックロケーションの検索有無
	 * @param doSelectBackLocation バックロケーションの検索有無
	 * @return 引当可能な在庫のリスト
	 */
	private List<TStock> selectStockList(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, boolean doSelectPickLocation, boolean doSelectBackLocation) {

		final long centerId = allocInstHeader.getCenterId();
		final long clientId = allocInstHeader.getClientId();

		// 検索条件の設定
		TStockCB cb = tStockBhv.newMyConditionBean();

		// ===== 結合テーブル設定 =====

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana Start
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start
		cb.setupSelect_MProduct();
		// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End
		// [#2961] 複数荷姿対応 2017.11.09 kawana End
		cb.setupSelect_TLot();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MStockType();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation().withMZone();
		cb.setupSelect_TStoreNo().withMCustomer();
		cb.setupSelect_MShape();
		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana End

		// ===== 検索条件の設定 =====

		cb.query().setClientId_Equal(clientId);
		cb.query().queryMLocation().setCenterId_Equal(centerId);
		cb.query().setWarehouseId_Equal(allocInstBody.getWarehouseId());
		cb.query().setProductId_Equal(allocInstBody.getProductId());
		cb.query().setStockTypeId_Equal(allocInstBody.getStockTypeId());
		cb.query().setDepositId_Equal(allocInstBody.getDepositId());
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);

		if (allocInstBody.getLocationCd() != null
				|| allocInstBody.getLot() != null
				|| allocInstBody.getLimitDt() != null) {

			// ロケーションまたはロットまたは期限日の指定あり

			String modeLot = CU.nullToStr(getPropertyValue(WmsCorePropertyConst.STOCK_ALLOCATION_MODE_BY_LOT_ID));
			String modeLoc = CU.nullToStr(getPropertyValue(WmsCorePropertyConst.STOCK_ALLOCATION_MODE_BY_LOCATION_ID));

			if (modeLot.equals("") || modeLot.equals("0")) {
				cb.query().queryTLot().setLot_Equal(allocInstBody.getLot());
				cb.query().queryTLot().setLimitDt_Equal(allocInstBody.getLimitDt());
			} else {
				if (allocInstBody.getLotId() == null) {
					cb.query().queryTLot().setLot_Equal(allocInstBody.getLot());
					cb.query().queryTLot().setLimitDt_Equal(allocInstBody.getLimitDt());
				} else {
					cb.query().setLotId_Equal(allocInstBody.getLotId());
				}
			}

			if (modeLoc.equals("") || modeLoc.equals("0")) {
				cb.query().queryMLocation().setLocationCd_Equal(allocInstBody.getLocationCd());
			} else {
				if (allocInstBody.getLocationId() == null) {
					cb.query().queryMLocation().setLocationCd_Equal(allocInstBody.getLocationCd());
				} else {
					cb.query().setLocationId_Equal(allocInstBody.getLocationId());
				}
			}

			// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana Start
		} else if (!CU.isNullOrEmpty(allocInstBody.getShippingLimitDt())) {
			// [ON推-品向-573] 期限日数は逆転防止フラグではなく期限日数が0の場合は無効 2015.04.23 kawana End

			cb.query().queryTLot().setLimitDt_GreaterEqual(allocInstBody.getShippingLimitDt());
		}

		cb.query().queryMLocation().setAllocNgFlg_Equal_$0();
		cb.query().queryMProduct().setShippingStopFlg_Equal_$0();

		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana Start
		if (!doSelectPickLocation || !doSelectBackLocation) {

			if (doSelectPickLocation) {
				// ピックロケーションの在庫を検索
				cb.query().queryMLocation().setPickingLocationFlg_Equal_$1();
			}

			if (doSelectBackLocation) {
				// バックロケーションの在庫を検索
				cb.query().queryMLocation().setPickingLocationFlg_Equal_$0();
			}
		}
		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana End

		// ===== 在庫検索実行 =====
		List<TStock> stockList = tStockBhv.selectList(cb);

		// [C-CWMS-0025] 在庫の引当順序を設定できるように変更 2015.05.11 kawana Start

		// ===== 引当順にソート =====

		sortStockList(centerId, clientId, stockList);

		return stockList;
	}

	/**
	 * 引当在庫をソート
	 */
	@SuppressWarnings("unchecked")
	private void sortStockList(long centerId, long clientId, List<TStock> stockList) {

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
		// 引当順取得
		String[] sortkeys = getSortKeys(centerId, clientId);
		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
		// ソート実行
		Collections.sort(stockList, StockAllocateComparator.newInstance(sortkeys));
		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

	/**
	 * 引当在庫をソート
	 */
	@SuppressWarnings("unchecked")
	private void sortStockListCaseAllocatePriorityLimitDt(long centerId, long clientId, List<TStock> stockList) {

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
		// 引当順取得
		String[] sortkeys = getSortKeysPriorityLimitDt(centerId, clientId);
		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// ソート実行
		Collections.sort(stockList, StockAllocateComparator.newInstanceCaseAllcate(sortkeys));
	}

	/**
	 * 引当在庫をソート
	 */
	@SuppressWarnings("unchecked")
	private void sortStockListPieceAllocatePriorityLimitDt(long centerId, long clientId, List<TStock> stockList) {

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
		// 引当順取得
		String[] sortkeys = getSortKeysPriorityLimitDt(centerId, clientId);
		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// ソート実行
		Collections.sort(stockList, StockAllocateComparator.newInstancePieceAllocate(sortkeys));
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
	/**
	 * 引当順取得
	 */
	private String[] getSortKeys(long centerId, long clientId) {

		return getSortKeys(centerId, clientId, false);
	}

	/**
	 * 引当順取得(期限日最優先)
	 */
	private String[] getSortKeysPriorityLimitDt(long centerId, long clientId) {

		return getSortKeys(centerId, clientId, true);
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

	/**
	 * 引当順取得
	 */
	private String[] getSortKeys(long centerId, long clientId, boolean addLimitDt) {
		// パラメータマスタから引当順序設定を取得
		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(centerId);
		mccCb.setClientId(clientId);
		MParam param = paramLogic.getUkEntityUseCash(mccCb);

		String allocSortKey = param.getAllocSortKey();

		String[] sortkeys;
		if (!CU.isNullOrEmpty(allocSortKey)) {
			// 引当順序の設定あり

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
			if (addLimitDt) {
				allocSortKey = new StringBuilder().append(CDef.AllocSortKey.$limitDt.code()).append(",").append(allocSortKey).toString();
			}
			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

			sortkeys = allocSortKey.split(",");
		} else {

			// [ON推-品向-877] デフォルトのソート順を変更 2015.07.16 kawana Start
			sortkeys = new String[] {
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
					CDef.AllocSortKey.$limitDt.code(),
					CDef.AllocSortKey.$locationOrder.code(),
					CDef.AllocSortKey.$storeLabelNo.code(),
					CDef.AllocSortKey.$lot.code(),
					CDef.AllocSortKey.$locationCd.code()
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			};
			// ソート順の設定
			// [ON推-品向-877] デフォルトのソート順を変更 2015.07.16 kawana End
		}
		// [C-CWMS-0025] 在庫の引当順序を設定できるように変更 2015.05.11 kawana End
		return sortkeys;
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

	// [C-CWMS-0050] 緊急補充機能を追加(在庫の取得メソッドを抽出) 2016.01.07 kawana End

	/**
	 * 期限日、最終ロット期限日の設定
	 *
	 * @param allocHeader 引当指示ヘッダ
	 * @param allocBody 引当指示ボディ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void setLimitDt(TAllocInstH allocHeader, TAllocInstB allocBody, ErrorStatus errSts) {

		// 期限日フラグの設定、商品期限日の設定
		stockUpdateCheckLogic.limitDateManagementCheck(allocHeader, allocBody, allocHeader.getMCustomerBySupplyCustomerId(), allocBody.getMProduct(), allocBody.getMStockType(), errSts);
		if (getErrorManager().size() > 0) {
			return;
		}

		// 最終ロット期限日の設定
		lastLotLogic.setLimitLot(allocHeader, allocBody, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}
	}

	/**
	 * 引当指示ボディ1件づつの引当処理
	 * パラメータの引当関連データには引当元の在庫が検索済みであること
	 *
	 * @param allocBody 引当指示ボディ
	 * @param pickingBatchNo 出庫作業No.
	 * @param processNo 処理No.
	 * @param allocData 引当関連データ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void allocate(TAllocInstB allocBody, String pickingBatchNo, String processNo, StockAllocateData allocData, ErrorStatus errSts) {

		TAllocInstH allocHeader = allocBody.getTAllocInstH();

		// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
		// パラメータマスタから引当順序設定を取得
		MClientCenter mccCb = new MClientCenter();
		mccCb.setCenterId(allocHeader.getCenterId());
		mccCb.setClientId(allocHeader.getClientId());
		MParam param = paramLogic.getUkEntityUseCash(mccCb);
		// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

		// ===== 在庫引当 =====

		// ケース荷姿を取得
		MProductShape caseShape = allocData.getCaseShape();
		boolean doCaseAlloc = false;
		// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
		if (param.isCasePicFlg$1()
				&& caseShape != null
				// [#2961] 複数荷姿対応 2017.11.09 kawana Start
				&& 0 < caseShape.getUnitNumPiece()) {
			// [#2961] 複数荷姿対応 2017.11.09 kawana End
			// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End

			// ケース引当有り
			doCaseAlloc = true;
		}

		if (doCaseAlloc) {
			// ケース引当あり

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正(ケース前のピース引当を削除) 2019.07.17 kawana Delete

			// ケース単位の引当
			caseAlloc(allocHeader, allocBody, allocData, errSts);
			if (getErrorManager().size() > 0) {
				return;
			}
		}

		// ピース単位の引当
		pieceAlloc(allocHeader, allocBody, pickingBatchNo, processNo, allocData, errSts);
		if (getErrorManager().size() > 0) {
			return;
		}
	}

	// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正(ケース前のピース引当(limitDtReverseAllocメソッド)を削除) 2019.07.17 kawana Delete

	/**
	 * <h2>ケース単位で引当処理をする</h2>
	 * <pre>
	 * バックロケからケース入数単位で引当する。
	 * ピックロケ、ケース入数の余りは割り当てない。
	 * </pre>
	 *
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 * @param allocData 引当関連データ
	 * @param errSts エラー時のエラー情報への設定値
	 */
	private void caseAlloc(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, StockAllocateData allocData, ErrorStatus errSts) {

		// バックロケーションからケース単位で引当
		backLocationCaseAlloc(allocInstHeader, allocInstBody, allocData);

		// バックロケーションからピース単位で引当(ケース入数で割り切れる数のみ)
		backLocationPieceAlloc(allocInstHeader, allocInstBody, allocData);
	}

	/**
	 * <h2>バックロケーションの引当処理をする(ケース単位)</h2>
	 * <pre>
	 * バックロケからケース入数単位で引当する。
	 * </pre>
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 * @param allocData 引当関連データ
	 * @return 引当てた在庫受払のリスト
	 */
	private void backLocationCaseAlloc(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, StockAllocateData allocData) {

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		long unitNum = allocData.getCaseShape().getUnitNumPiece();
		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// 全引当済数
		BigDecimal allAllocNum = CU.nullToZero(allocInstBody.getAllocNum());
		// 残指示数
		BigDecimal instNum = WCC.subtract(allocInstBody.getInstNum(), allAllocNum);
		// 残りの引当指示ケース数(指示数 - 引当済数)
		BigDecimal instCaseNum = WCC.divide(instNum, unitNum);

		if (WCC.isZeroOrLess(instCaseNum)) {
			// 指示ケース数が0以下
			return;
		}

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

		// ケース引当用在庫リストを新規作成
		List<TStock> allocateStockList = new ArrayList<TStock>(allocData.getBackLocationStockList());

		if (allocInstBody.isLimitDtReverseFlg$1()) {
			// 期限日逆転防止あり

			// ピックロケーションも対象に追加
			allocateStockList.addAll(allocData.getPickLocationStockList());
			// 期限日優先のソート
			sortStockListCaseAllocatePriorityLimitDt(allocInstHeader.getCenterId(), allocInstHeader.getClientId(), allocateStockList);
		}

		int allBackLocationCount = allocData.getBackLocationStockList().size();
		int backLocationCount = 0;

		String tmpLimitDt = "";
		BigDecimal tmpChargeNum = WCC.ZERO;

		// ===== 引当在庫の件数分繰返 =====
		for (TStock stock : allocateStockList) {

			if (allBackLocationCount <= backLocationCount) {
				// 全てのバックロケが処理済
				break;
			}

			if (!stock.getMLocation().isPickingLocationFlg$1()) {
				// バックロケーション
				backLocationCount++;
			}

			// 引当可能数
			BigDecimal stockChargeNum = stock.getChargeNum();
			if (WCC.isZeroOrLess(stockChargeNum)) {
				// 引当可能数なし
				continue;
			}

			// 期限日
			String limitDt = CU.nullToStr(stock.getTLot().getLimitDt());

			if (allocInstBody.isLimitDtReverseFlg$1()) {
				// 期限日逆転防止

				// 以前の期限日の引当可能数の残あり
				if (tmpChargeNum != WCC.ZERO && !limitDt.equals(tmpLimitDt)) {

					BigDecimal allocNum = CU.least(instNum, tmpChargeNum);

					// 残り指示数を減らす
					instNum = WCC.subtract(instNum, allocNum);
					// 残り指示ピース数が0以下の場合は繰返終了
					if (WCC.isZeroOrLess(instNum)) {
						break;
					}
					instCaseNum = WCC.divide(instNum, unitNum);

					// 期限日順のピース引当をするためケース数が0以下でもreturnしない
					// ※ returnすると合算ケースが作られ逆転してしまうため

					tmpLimitDt = "";
					tmpChargeNum = WCC.ZERO;
				}

				if (stock.getMLocation().isPickingLocationFlg$1()) {
					// ピックロケーション

					// 指示数と引当可能数の小さい方を引当数とする
					BigDecimal allocNum = CU.least(instNum, stockChargeNum);

					// 引当関連データの設定 (引当はピースピッキングで行う)
					setAllocData(allocInstHeader, allocInstBody, stock, allocNum, AllocateType.PIECE, allocData);

					// 残り指示数を減らす
					instNum = WCC.subtract(instNum, allocNum);
					// 残り指示ピース数が0以下の場合は繰返終了
					if (WCC.isZeroOrLess(instNum)) {
						break;
					}
					instCaseNum = WCC.divide(instNum, unitNum);

					// 期限日順のピース引当をするためケース数が0以下でもreturnしない
					// ※ returnすると合算ケースが作られ逆転してしまうため

					// 残り指示ピース数が0以下の場合は繰返終了
					if (WCC.isZeroOrLess(instNum)) {
						break;
					}
					continue;
				}
			}

			// 在庫の引当可能ケース数
			BigDecimal stockChargeCaseNum = WCC.divide(stockChargeNum, unitNum);
			if (WCC.isZeroOrLess(stockChargeCaseNum) || WCC.isZeroOrLess(instCaseNum)) {
				// ケース引当 不可

				if (allocInstBody.isLimitDtReverseFlg$1()) {

					if (!limitDt.equals(tmpLimitDt)) {

						tmpLimitDt = limitDt;
						tmpChargeNum = stockChargeNum;
					} else {
						tmpChargeNum = WCC.add(tmpChargeNum, stockChargeNum);
					}
				}
				continue;
			}

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

			// 引当ケース数 (指示ケース数と引当可能ケース数の小さい方)
			BigDecimal allocCaseNum = CU.least(instCaseNum, stockChargeCaseNum);
			// 引当数
			BigDecimal allocNum = WCC.multiply(allocCaseNum, unitNum);

			// 引当関連データの設定
			setAllocData(allocInstHeader, allocInstBody, stock, allocNum, AllocateType.CASE, allocData);

			// 残り指示数を減らす
			instNum = WCC.subtract(instNum, allocNum);
			instCaseNum = WCC.divide(instNum, unitNum);

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

			if (allocInstBody.isLimitDtReverseFlg$1()) {

				// 残り指示ピース数が0以下の場合は繰返終了
				// 期限日順のピース引当をするためケース数が0以下でもreturnしない
				// ※ returnすると合算ケースが作られ逆転してしまうため
				if (WCC.isZeroOrLess(instNum)) {
					break;
				}

				// ケース引当後の引当可能数
				stockChargeNum = stock.getChargeNum();
				if (!WCC.isZeroOrLess(stockChargeNum)) {
					// 引当可能数の残あり

					if (!limitDt.equals(tmpLimitDt)) {

						tmpLimitDt = limitDt;
						tmpChargeNum = stockChargeNum;
					} else {
						tmpChargeNum = WCC.add(tmpChargeNum, stockChargeNum);
					}
				}
			} else {

				// 残り指示ケース数が0以下の場合は繰返終了
				if (WCC.isZeroOrLess(instCaseNum)) {
					break;
				}
			}
			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End
		}
	}

	/**
	 * <h2>バックロケーションの引当処理をする(ピース)</h2>
	 * <pre>
	 * バックロケからピース(バラ)で引当する。
	 * ケース入数で割り切れる数のみを引当する。
	 * </pre>
	 *
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 * @param allocData 引当関連データ
	 * @return 引当てた在庫受払のリスト
	 */
	private void backLocationPieceAlloc(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, StockAllocateData allocData) {

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// ケース入数
		long unitNum = allocData.getCaseShape().getUnitNumPiece();
		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// 引当済数
		BigDecimal allAllocNum = CU.nullToZero(allocInstBody.getAllocNum());
		// 残りの引当指示ケース数
		BigDecimal instCaseNum = WCC.divide((WCC.subtract(allocInstBody.getInstNum(), allAllocNum)), unitNum);

		if (WCC.isZeroOrLess(instCaseNum)) {
			// 指示ケース数が0以下
			return;
		}

		List<TStock> backLocationStockList = allocData.getBackLocationStockList();

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

		if (allocInstBody.isLimitDtReverseFlg$1()) {
			// 期限日逆転防止あり

			// 期限日優先のソート
			sortStockListCaseAllocatePriorityLimitDt(allocInstHeader.getCenterId(), allocInstHeader.getClientId(), backLocationStockList);
		}

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

		// ===== 在庫ケース数を計算 =====

		// 全在庫ピース数
		BigDecimal allStockPieceNum = WCC.ZERO;
		// 引当対象の在庫リスト
		List<TStock> allocStockList = new ArrayList<TStock>();
		for (TStock stock : backLocationStockList) {

			BigDecimal chargeNum = stock.getChargeNum();
			if (WCC.isZeroOrLess(chargeNum)) {
				// 引当可能数が0以下
				continue;
			}

			// 在庫数に加算
			allStockPieceNum = WCC.add(allStockPieceNum, chargeNum);

			// 引当在庫リストに追加
			allocStockList.add(stock);
		}

		// 全在庫ケース数
		BigDecimal allCaseNum = WCC.divide(allStockPieceNum, unitNum);
		if (WCC.isZeroOrLess(allCaseNum)) {

			// 在庫ケース数が0以下
			return;
		}

		// ===== 引当指示数を計算 =====
		BigDecimal instPieceNum = WCC.ZERO;
		if (WCC.isLessEqual(instCaseNum, allCaseNum)) {
			// 指示数より在庫数が多い場合

			// 指示数を引当
			instPieceNum = WCC.multiply(instCaseNum, unitNum);
		} else {
			// 在庫数より指示数が多い場合

			// 在庫数を引当
			instPieceNum = WCC.multiply(allCaseNum, unitNum);
		}

		// ===== 引当 =====
		for (TStock stock : allocStockList) {

			// 在庫数
			BigDecimal chargeNum = stock.getChargeNum();

			// 引当数を計算
			BigDecimal allocNum;
			if (WCC.isLessEqual(instPieceNum, chargeNum)) {
				// 指示数より在庫数が多い場合

				// 全引当数を引当
				allocNum = instPieceNum;
			} else {
				// 在庫数より指示数が多い場合

				// 在庫数を引当
				allocNum = chargeNum;
			}

			// 引当関連データの設定
			setAllocData(allocInstHeader, allocInstBody, stock, allocNum, AllocateType.CASE, allocData);

			// 残り指示数を減らす
			instPieceNum = WCC.subtract(instPieceNum, allocNum);

			// 残り指示数が0以下の場合は繰返終了
			if (WCC.isZeroOrLess(instPieceNum)) {
				break;
			}
		}
	}

	// [C-CWMS-0050] 緊急補充機能を追加(在庫の取得メソッドを抽出) 2016.01.07 kawana End

	// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana Start

	/**
	 * ピース単位で引当処理をする
	 *
	 * @param allocInstHeader 引当指示ヘッダ
	 * @param allocInstBody 引当指示ボディ
	 * @param pickingBatchNo 出庫指示バッチNo.
	 * @param processNo 処理No
	 * @param allocData 引当関連データ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	private void pieceAlloc(TAllocInstH allocInstHeader, TAllocInstB allocInstBody, String pickingBatchNo, String processNo, StockAllocateData allocData, ErrorStatus errSts) {

		// 全引当済数
		BigDecimal allAllocNum = CU.nullToZero(allocInstBody.getAllocNum());
		// 残りの引当指示数(指示数 - 引当済数)
		BigDecimal instNum = WCC.subtract(allocInstBody.getInstNum(), allAllocNum);

		if (WCC.isZeroOrLess(instNum)) {
			return;
		}

		List<TStock> pickLocationStockList = allocData.getPickLocationStockList();

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

		boolean doAllocAllFromReplenishLocation = false;
		MLocation replenishLocation = null;

		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana Start

		final long centerId = allocInstHeader.getCenterId();
		final long clientId = allocInstHeader.getClientId();

		// ===== 緊急補充を行うか判定 =====

		// [ON推-品向-1079] ロケーション指定の場合は緊急補充しない 2016.04.08 kawana Start
		if (CU.isNullOrEmpty(allocInstBody.getLocationCd())) {
			// [ON推-品向-1079] ロケーション指定の場合は緊急補充しない 2016.04.08 kawana End

			// 補充ロケーションから全ての在庫を引当するかを判定
			doAllocAllFromReplenishLocation = doAllocAllFromReplenishLocation(centerId, clientId, allocInstBody);

			// 補充ロケーション、欠品数の指定
			BigDecimal stockOutNum = WCC.ZERO;
			if (doAllocAllFromReplenishLocation) {
				// 補充ロケーションから全引当

				// 在庫が足りている補充ロケーションを取得
				replenishLocation = getCanAllocAllReplenishLocation(allocInstBody, pickLocationStockList, instNum);
				if (replenishLocation == null) {
					// 在庫が足りない

					// 緊急補充先の補充ロケーションの取得 (優先度に従ったもの)
					replenishLocation = emergencyReplenishLocationManager.getHighPriorityReplenishLocation(allocInstBody.getWarehouseId());
					if (replenishLocation != null) {
						// 補充ロケーションあり

						// 緊急補充先ロケーションの欠品数を取得
						stockOutNum = getStockOutNumReplenishLocation(replenishLocation, pickLocationStockList, instNum);
					}
				}
			}

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
			List<TStock> sourceStockList = null;
			if (replenishLocation == null) {

				if (allocInstBody.isLimitDtReverseFlg$1()) {
					// 逆転防止あり

					// ピックロケーションを優先に引当
					List<TStock> stockList = new ArrayList<TStock>();
					stockList.addAll(pickLocationStockList);
					stockList.addAll(allocData.getBackLocationStockList());

					// 再ソート
					sortStockListPieceAllocatePriorityLimitDt(centerId, clientId, stockList);

					ReplenishInstInfo replenishInstInfo = stockAllocateReplenishInstLogic.getReplenishInstInfo(stockList, instNum);
					stockOutNum = replenishInstInfo.replenishNum;
					sourceStockList = replenishInstInfo.sourceStockList;
				} else {

					// 全ピックロケーションの欠品数
					stockOutNum = getStockOutNumPickLocation(pickLocationStockList, instNum);
				}
			}
			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

			// 欠品数のチェック
			if (WCC.isPositive(stockOutNum)) {
				// 緊急補充あり

				// ===== 緊急補充の実行 =====

				// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
				// 緊急補充を実行
				ReplenishInfo replenishInfo = emergencyReplenishLogic.replenish(centerId, clientId, allocInstBody, replenishLocation, stockOutNum, pickingBatchNo, processNo, allocData,
						emergencyReplenishLocationManager, emergencyReplenishZoneManager, sourceStockList, errSts);
				// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End
				if (0 < getErrorManager().size()) {
					return;
				}

				if (WCC.isPositive(replenishInfo.replenishNum)) {
					// 補充あり

					state.didReplenish = true;

					// 補充在庫を適用するため在庫リストを再設定
					pickLocationStockList = allocData.getPickLocationStockList();

					// 再ソート(補充在庫が最後尾になるため)
					sortStockList(centerId, clientId, pickLocationStockList);
				}
			}

			// [ON推-品向-1079] ロケーション指定の場合は緊急補充しない 2016.04.08 kawana Start
		}
		// [ON推-品向-1079] ロケーション指定の場合は緊急補充しない 2016.04.08 kawana End

		// ピックロケーションを優先に引当
		List<TStock> stockList = new ArrayList<TStock>();
		stockList.addAll(pickLocationStockList);
		stockList.addAll(allocData.getBackLocationStockList());

		// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana End

		if (doAllocAllFromReplenishLocation && replenishLocation != null) {

			// ===== 補充ロケーションの在庫を最優先で引当 =====

			for (TStock stock : pickLocationStockList) {

				if (stock.getLocationId().longValue() != replenishLocation.getLocationId().longValue()) {
					// 補充ロケーションではないためピック対象外
					continue;
				}

				// 在庫の引当数を計算
				BigDecimal chargeNum = stock.getChargeNum();
				if (WCC.isZeroOrLess(chargeNum)) {
					// 引当可能数なし
					continue;
				}

				// 指示数と引当可能数の小さい方を引当数とする
				BigDecimal allocNum = CU.least(instNum, chargeNum);

				// 引当関連データの設定
				setAllocData(allocInstHeader, allocInstBody, stock, allocNum, AllocateType.PIECE, allocData);

				// 残り指示数を減らす
				instNum = WCC.subtract(instNum, allocNum);

				// 残り指示数が0以下の場合は引当終了
				if (WCC.isZeroOrLess(instNum)) {
					return;
				}
			}
		}

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// ===== 引当 =====

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
		if (allocInstBody.isLimitDtReverseFlg$1()) {
			// 逆転防止あり

			// 再ソート
			sortStockListPieceAllocatePriorityLimitDt(centerId, clientId, stockList);
		}
		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

		for (TStock stock : stockList) {

			// 在庫の引当数を計算
			BigDecimal stockChargeNum = stock.getChargeNum();
			if (WCC.isZeroOrLess(stockChargeNum)) {
				// 引当可能数なし
				continue;
			}

			// 指示数と引当可能数の小さい方を引当数とする
			BigDecimal allocNum = CU.least(instNum, stockChargeNum);

			// 引当関連データの設定
			setAllocData(allocInstHeader, allocInstBody, stock, allocNum, AllocateType.PIECE, allocData);

			// 残り指示数を減らす
			instNum = WCC.subtract(instNum, allocNum);

			// 残り指示数が0以下の場合は繰返終了
			if (WCC.isZeroOrLess(instNum)) {
				return;
			}
		}

	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

	/**
	 * 全て在庫を引当可能な補充ロケーションを取得
	 * 補充ロケーションがない場合はnullを返却
	 *
	 * @param allocInstBody 引当指示ボディ
	 * @param stockList ピック対象の在庫リスト
	 * @param instNum 指示数
	 *
	 * @return 引当可能な補充ロケーション
	 */
	private MLocation getCanAllocAllReplenishLocation(TAllocInstB allocInstBody, List<TStock> stockList, BigDecimal instNum) {

		for (TStock stock : stockList) {

			if (stock.chaseMLocation().isPickingLocationFlg$0()) {
				// バックロケは対象外

				continue;
			}

			// 在庫ロケーション
			MLocation location = stock.getMLocation();
			if (location.getReplenishProductId() == null
					|| location.getReplenishStockTypeId() == null
					|| location.getReplenishDepositId() == null) {
				// 補充商品の設定なし

				continue;
			}

			// 在庫と補充商品の比較

			StockAllocateSKU stockSku = StockAllocateSKU.builder()
					.productId(stock.getProductId())
					.stockTypeId(stock.getStockTypeId())
					.depositId(stock.getDepositId()).build();

			StockAllocateSKU replenishSku = StockAllocateSKU.builder()
					.productId(location.getReplenishProductId())
					.stockTypeId(location.getReplenishStockTypeId())
					.depositId(location.getReplenishDepositId()).build();

			if (!stockSku.equals(replenishSku)) {
				// 別商品の補充先ロケーション

				continue;
			}

			if (WCC.isLessThan(instNum, stock.getChargeNum())) {
				// 全数を引当可能

				return location;
			}
		}

		// 全数を引当可能な補充ロケーションなし
		return null;
	}

	/**
	 * 補充ロケーションからのみ引当するかを判定 (補充ロケーションから最優先で引当)
	 */
	private boolean doAllocAllFromReplenishLocation(long centerId, long clientId, TAllocInstB allocInstBody) {

		boolean isNullLot = CU.isNullOrEmpty(allocInstBody.getLot());
		boolean isNullLimitDt = CU.isNullOrEmpty(allocInstBody.getLimitDt());
		if (!isNullLot || !isNullLimitDt) {
			// ロット、期限日の指定がある場合

			return false;
		}

		String[] sortkeys = getSortKeys(centerId, clientId);

		for (String sortkeyStr : sortkeys) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.AllocSortKey sortkey = CDef.AllocSortKey.codeOf(sortkeyStr);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			switch (sortkey) {
			case $storeLabelNo:
				break;
			case $limitDt:
				if (allocInstBody.isLimitDtManagFlg$1()) {
					return false;
				}
				break;
			case $lot:
			case $lotOrder:
				if (allocInstBody.isLotManagFlg$1()) {
					return false;
				}
				break;
			case $locationCd:
				// ロケーションCD
				return true;
			case $locationOrder:
				// ロケーション引当順序
				return true;
			case $zoneCd:
				// ゾーンCD
				return true;
			case $storeDt:
				// 入庫日
				return false;
			}
		}

		return true;
	}

	/**
	 * 補充ロケーションのみで引当する場合の欠品数を取得
	 */
	private BigDecimal getStockOutNumReplenishLocation(MLocation replenishLocation, List<TStock> pickLocationStockList, BigDecimal instNum) {
		// 欠品数を指示数に設定
		BigDecimal stockOutNum = instNum;

		for (TStock stock : pickLocationStockList) {

			if (stock.chaseMLocation().isPickingLocationFlg$0()) {
				// バックロケは対象外

				continue;
			}

			if (replenishLocation.getLocationId().longValue() != stock.getLocationId().longValue()) {
				// 補充ロケーションではないためピック対象外

				continue;
			}

			BigDecimal chargeNum = stock.getChargeNum();
			// 指示数から引当可能数を引く
			stockOutNum = WCC.subtract(stockOutNum, chargeNum);

			if (WCC.isZeroOrLess(stockOutNum)) {
				// 欠品なし
				stockOutNum = WCC.ZERO;
				break;
			}
		}

		return stockOutNum;
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正(ケース前のピース引当(getOldestLimitDtCaseStockメソッド)を削除) 2019.07.17 kawana Delete

	// [C-CWMS-0049] ケース引当機能を追加 2015.11.24 kawana End

	// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana Start

	/**
	 * ピックロケーションのみから引当てた場合の欠品数を取得
	 *
	 * @param stockList 引当て対象の在庫リスト
	 * @param instNum 指示数
	 * @return ピックロケーションの欠品数
	 */
	private BigDecimal getStockOutNumPickLocation(List<TStock> stockList, BigDecimal instNum) {

		// 欠品数を指示数に設定
		BigDecimal stockOutNum = instNum;

		for (TStock stock : stockList) {
			if (stock.chaseMLocation().isPickingLocationFlg$0()) {
				// バックロケは対象外
				continue;
			}

			BigDecimal chargeNum = stock.getChargeNum();
			// 指示数から引当可能数を引く
			stockOutNum = WCC.subtract(stockOutNum, chargeNum);

			if (WCC.isZeroOrLess(stockOutNum)) {
				// 欠品なし
				stockOutNum = WCC.ZERO;
				break;
			}
		}

		return stockOutNum;
	}

	/**
	 * 出庫ヘッダ、出庫帳票の登録
	 */
	private TPickingH insertPickingH(TAllocInstH allocInstH, String delivUnitNo, ErrorStatus errSts) {

		// ===== 出庫ヘッダの登録 =====

		String pickingWorkNo = numberingLogic.getNumbering(allocInstH.getCenterId(), WmsCoreNumberingConst.PICKING_WORK_NO);

		TPickingH pickingHeader = new TPickingH();
		pickingHeader.setClientId(allocInstH.getClientId());
		pickingHeader.setCenterId(allocInstH.getCenterId());
		pickingHeader.setProcessTypeId(allocInstH.getProcessTypeId());
		pickingHeader.setDelivUnitNo(delivUnitNo);
		pickingHeader.setPickingWorkNo(pickingWorkNo);
		pickingHeader.setAllocInstHId(allocInstH.getAllocInstHId());
		pickingHeader.setPickingStatus_$25();
		// 種蒔きNo.を出庫ヘッダから梱包ヘッダに移動(種蒔きNoの設定を削除) 2016.01.28 kawana
		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(pickingHeader.setPIckingGroupNo削除) 2018.08.22 kawana Delete
		// [#5119][v3.1] 単行ピックフラグ設定処理 2018.08.01 kawana Start
		pickingHeader.setSglRowPicFlg_$0();
		// [#5119][v3.1] 単行ピックフラグ設定処理 2018.08.01 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
		// センタ間移動フラグ設定
		boolean centerTransitFlg = isCenterTransit(allocInstH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		if (centerTransitFlg) {
			pickingHeader.setCenterTransitFlg_$1();
		} else {
			pickingHeader.setCenterTransitFlg_$0();
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End

		// 出庫ヘッダの登録実行
		tPickingHBhv.insert(pickingHeader);

		// 変数出庫ヘッダID ＝ 出庫ヘッダの登録時の出庫ヘッダID
		long pickingHId = pickingHeader.getPickingHId();

		// ===== 出庫帳票の登録 =====

		TPickingR pickingR = new TPickingR();
		pickingR.setPickingHId(pickingHId);
		pickingR.setOplOutFlg_$0();
		pickingR.setTplOutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
		pickingR.setMltOutFlg_$0();
		pickingR.setSplOutFlg_$0();
		pickingR.setPl1OutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
		pickingR.setPlOutFlg_$0();
		pickingR.setSlOutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
		pickingR.setPl2OutFlg_$0();
		pickingR.setCaseOutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
		pickingR.setPackingOutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana Start
		pickingR.setSlipOutFlg_$0();
		// [#5133][v3.1] 1次ピッキングリスト発行フラグ、2次ピッキングリスト発行フラグの更新 2018.08.24 kawana End
		pickingR.setInvoiceCreateFlg_$0();
		// [C-CWMS-0060] 出荷実績出力バッチ作成時追加 2016.10.07 shimizu Start
		pickingR.setShippingRecordOutFlg_$0();
		// [C-CWMS-0060] 出荷実績出力バッチ作成時追加 2016.10.07 shimizu End

		// 出庫帳票の登録実行
		tPickingRBhv.insert(pickingR);

		return pickingHeader;
	}

	/**
	 * センタ間移動の出荷かを判定
	 *
	 * @param shippingInstH 出荷指示ヘッダ
	 * @return true:センタ間移動
	 */
	private boolean isCenterTransit(TAllocInstH allocInstH, ErrorStatus errSts) {

		long centerId = allocInstH.getCenterId();
		long clientId = allocInstH.getClientId();
		long supplyCustomerId = allocInstH.getSupplyCustomerId();

		MCustomer customerCondition = new MCustomer();
		customerCondition.setClientId(clientId);
		customerCondition.setCustomerId(supplyCustomerId);

		// 移動先(納品先)センタを取得
		MCenter supplyCenter = customerLogic.getCenterCacheable(customerCondition);
		if (supplyCenter == null) {
			// 納品先はセンタではない

			return false;
		}

		long supplyCenterId = supplyCenter.getCenterId();

		// ===== 移動元センタと移動先センタが異なっているかを確認 =====
		if (supplyCenterId == centerId) {
			// 移動元と移動先が同じためエラーを設定

			getErrorManager().add(errSts, WmsCoreMessageConst.SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR);
			return false;
		}

		// ===== 移動元センタの取引先登録チェック =====
		MClientCenter clientCenterCondition = new MClientCenter();
		clientCenterCondition.setClientId(clientId);
		clientCenterCondition.setCenterId(centerId);
		MClientCenter clientCenter = clientCenterLogic.getUkEntityWithCustomerCacheable(clientCenterCondition);

		if (clientCenter == null || clientCenter.getMCustomer() == null) {
			// 移動元センタの取引先登録なしのためエラーを設定

			getErrorManager().add(errSts, WmsCoreMessageConst.CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR);
			return false;
		}

		return true;
	}

	/**
	 * 在庫引当した後の引当データの設定
	 *
	 * ・在庫数の更新(減らす)
	 * ・在庫受払の作成
	 * ・引当済数の設定(引当指示ボディ、出荷指示ボディ)
	 * ・引当ロットの作成
	 * ・欠品フラグの更新(出荷指示ボディ)
	 * ・出庫ボディの作成
	 * ・補充ロケーションへの反映
	 */
	private void setAllocData(TAllocInstH allocInstH, TAllocInstB allocInstB, TStock stock, BigDecimal allocNum, AllocateType allocType, StockAllocateData allocData) {

		long stockId = stock.getStockId();

		// 在庫の引当可能数を減らす(他の引当処理で使いまわすため)
		allocData.minusStockNum(stockId, allocNum);

		// 在庫受払を作成
		TStockInout inout = stockUpdateLogic.newShipedStockInout(stockId, allocNum, allocInstH, allocInstB, allocInstH.getWorkDt());
		allocData.addInsertStockInout(inout);

		// ===== 引当ロット登録 =====

		long allocInstBId = allocInstB.getAllocInstBId();
		long customerId = allocInstH.getSupplyCustomerId();
		long productId = allocInstB.getProductId();
		TLot lot = stock.getTLot();

		allocData.addInsertAllocLot(allocInstBId, customerId, productId, lot);

		// 最終ロット管理の出荷ロットに追加
		lastLotLogic.shipdLot(allocInstH, allocInstB, lot);

		// ===== 引当済数の設定 (引当指示ボディ) =====

		allocInstB.setAllocNum(WCC.add(allocInstB.getAllocNum(), allocNum));

		// ===== 引当済数の設定 (出荷指示ボディ) =====

		List<TShippingInstB> shippingInstBList = allocInstB.getTShippingInstBList();
		BigDecimal tmpAllocNum = allocNum;
		for (TShippingInstB shippingInstB : shippingInstBList) {

			BigDecimal instNum = shippingInstB.getInstNum();
			BigDecimal shippingAllocNum = shippingInstB.getAllocNum();

			// 残指示数
			BigDecimal remainderInstNum = WCC.subtract(instNum, shippingAllocNum);
			if (WCC.isZeroOrLess(remainderInstNum)) {
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
				shippingInstB.setStockOutNum(WCC.ZERO);
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
				continue;
			}

			// 追加引当済数
			BigDecimal addAllocNum;

			// 指示数 <= 引当数
			if (WCC.isLessEqual(remainderInstNum, tmpAllocNum)) {
				// 欠品なし

				// 残りの指示数を追加引当済数に設定
				addAllocNum = remainderInstNum;
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutFlg設定削除) 2018.07.23 kawana Delete
			} else {
				// 欠品あり

				// 全てを追加引当済数に設定
				addAllocNum = tmpAllocNum;
				// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutFlg設定削除) 2018.07.23 kawana Delete
			}

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
			BigDecimal totalAllocNum = WCC.add(shippingAllocNum, addAllocNum);
			// 引当済数を更新
			shippingInstB.setAllocNum(totalAllocNum);
			shippingInstB.setStockOutNum(WCC.subtract(instNum, totalAllocNum));
			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

			// ===== 出庫ボディを作成して追加 =====
			addPickingB(shippingInstB, allocInstB, stock, addAllocNum, allocType, allocData);

			// 残りの引当済数を更新
			tmpAllocNum = WCC.subtract(tmpAllocNum, addAllocNum);
			if (WCC.isZeroOrLess(tmpAllocNum)) {
				break;
			}
		}

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

		// ===== 補充ロケーションへの反映 =====

		emergencyReplenishZoneManager.allocStock(stock.getLocationId(), allocNum);
		emergencyReplenishLocationManager.allocStock(stock.getLocationId(), allocNum);

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
	}

	/**
	 * 出庫ボディを引当データに追加する
	 *
	 * @param shippingInstB 出荷指示ボディ
	 * @param allocInstB 引当指示ボディ
	 * @param stock 在庫
	 * @param pickingNum 出庫数
	 * @param allocType 引当種別(ケース、ピース)
	 * @param allocData 引当データ
	 */
	private void addPickingB(TShippingInstB shippingInstB, TAllocInstB allocInstB, TStock stock, BigDecimal pickingNum, AllocateType allocType, StockAllocateData allocData) {

		TPickingB pickingB = new TPickingB();
		pickingB.setPickingHId(allocData.getPickingH(allocInstB.getAllocInstHId()).getPickingHId());
		pickingB.setShippingInstBId(shippingInstB.getShippingInstBId());
		pickingB.setAllocInstBId(allocInstB.getAllocInstBId());
		pickingB.setStockId(stock.getStockId());
		pickingB.setPickingNum(pickingNum);
		if (allocType == AllocateType.CASE) {
			// [#2961] 複数荷姿対応 2017.11.09 kawana Start
			pickingB.setShapeId(allocData.getCaseShape().getMShapeGrpDtl().getShapeId());
			// [#2961] 複数荷姿対応 2017.11.09 kawana End
		}

		pickingB.setTStock(stock);

		allocData.addInsertPickingB(pickingB);
	}

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start

	/**
	 * 欠品フラグ更新
	 */
	private void updateStockOutFlg(Set<Long> shippingInstHIdSet, Set<Long> stockOutIdSet) {

		// 最大更新件数
		int maxBatchCount = getPropertyIntValue(WmsCorePropertyConst.BATCH_DATA_COUNT);

		// 更新値
		TShippingInstH updateEntity = tShippingInstHBhv.newMyEntity();
		updateEntity.setStockOutFlg_$0();
		TShippingInstH updateStockOutEntity = tShippingInstHBhv.newMyEntity();
		updateStockOutEntity.setStockOutFlg_$1();

		// 条件のIDセット
		Set<Long> conditionIdSet = new HashSet<Long>();
		Set<Long> conditionStockOutIdSet = new HashSet<Long>();

		for (long shippingInstHId : shippingInstHIdSet) {

			if (stockOutIdSet.contains(shippingInstHId)) {
				// 欠品あり

				conditionStockOutIdSet.add(shippingInstHId);
				if (maxBatchCount <= conditionStockOutIdSet.size()) {
					// 最大更新件数を超過

					// 更新実行 (欠品あり)
					updateStockOutFlg(updateStockOutEntity, conditionStockOutIdSet);
					conditionStockOutIdSet.clear();
				}
			} else {
				// 欠品なし

				conditionIdSet.add(shippingInstHId);

				if (maxBatchCount <= conditionIdSet.size()) {
					// 最大更新件数を超過

					// 更新実行 (欠品なし)
					updateStockOutFlg(updateEntity, conditionIdSet);
					conditionIdSet.clear();
				}
			}
		}

		if (0 < conditionStockOutIdSet.size()) {

			// 更新実行 (欠品あり)
			updateStockOutFlg(updateStockOutEntity, conditionStockOutIdSet);
		}

		if (0 < conditionIdSet.size()) {

			// 更新実行 (欠品なし)
			updateStockOutFlg(updateEntity, conditionIdSet);
		}
	}

	/**
	 * 出荷指示ヘッダ更新
	 */
	private void updateStockOutFlg(TShippingInstH updateEntity, Set<Long> shippingInstHIdSet) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.query().setShippingInstHId_InScope(shippingInstHIdSet);

		tShippingInstHBhv.queryUpdate(updateEntity, cb);
	}

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(setTempNoWithSort, nullToMaxメソッド削除) 2018.08.22 kawana Delete

	/**
	 * 届先キーの作成
	 *
	 * @param allocHeader 引当指示ヘッダ
	 * @return 届け先キー
	 */
	private DelivKey createDelivKey(TAllocInstH allocHeader) {
		// 届先単位No.の設定
		long processTypeId = allocHeader.getProcessTypeId();
		String shippingDt = allocHeader.getShippingDt();
		String delivPlanDt = allocHeader.getDelivPlanDt();
		String delivDt = allocHeader.getDelivDt();
		String delivTz = allocHeader.getDelivTz();
		Long delivCourseId = allocHeader.getDeliveryCourseId();
		Long delivCustomerId = allocHeader.getDelivCustomerId();
		String delivCustomerCd = allocHeader.getDelivCustomerCd();
		String delivZipCd = allocHeader.getDelivZipCd();
		String delivAddress1 = allocHeader.getDelivAddress1();
		String delivAddress2 = allocHeader.getDelivAddress2();
		String delivAddress3 = allocHeader.getDelivAddress3();
		String delivAddressSupply = allocHeader.getDelivAddressSupply();
		String delivCustomerNm = allocHeader.getDelivCustomerNm();
		String delivTelNo = allocHeader.getDelivTelNo();

		// 届先単位キー作成
		DelivKey delivKey = DelivKey.builder().processTypeId(processTypeId).shippingDt(shippingDt).delivPlanDt(delivPlanDt).delivDt(delivDt).delivTz(delivTz).delivCourseId(delivCourseId)
				.delivCustomerId(delivCustomerId).delivCustomerCd(delivCustomerCd).delivZipCd(delivZipCd).delivAddress1(delivAddress1).delivAddress2(delivAddress2)
				.delivAddress3(delivAddress3).delivAddressSupply(delivAddressSupply).delivCustomerNm(delivCustomerNm).delivTelNo(delivTelNo).build();
		return delivKey;
	}

	/**
	 * 届先単位キー
	 */
	static final class DelivKey {
		private long processTypeId;
		private String shippingDt;
		private String delivPlanDt;
		private String delivDt;
		private String delivTz;
		private Long delivCourseId;
		private Long delivCustomerId;
		private String delivCustomerCd;
		private String delivZipCd;
		private String delivAddress1;
		private String delivAddress2;
		private String delivAddress3;
		private String delivAddressSupply;
		private String delivCustomerNm;
		private String delivTelNo;

		private DelivKey() {
		}

		private DelivKey(Builder builder) {
			this.processTypeId = builder.processTypeId;
			this.shippingDt = builder.shippingDt;
			this.delivPlanDt = builder.delivPlanDt;
			this.delivDt = builder.delivDt;
			this.delivTz = builder.delivTz;
			this.delivCourseId = builder.delivCourseId;
			this.delivCustomerId = builder.delivCustomerId;
			this.delivCustomerCd = builder.delivCustomerCd;
			this.delivZipCd = builder.delivZipCd;
			this.delivAddress1 = builder.delivAddress1;
			this.delivAddress2 = builder.delivAddress2;
			this.delivAddress3 = builder.delivAddress3;
			this.delivAddressSupply = builder.delivAddressSupply;
			this.delivCustomerNm = builder.delivCustomerNm;
			this.delivTelNo = builder.delivTelNo;
		}

		public static ProcessTypeBuilder builder() {
			return new Builder();
		}

		public static interface ProcessTypeBuilder {
			ShippingDtBuilder processTypeId(long processTypeId);
		}

		public static interface ShippingDtBuilder {
			Builder shippingDt(String shippingDt);
		}

		public static class Builder implements ProcessTypeBuilder, ShippingDtBuilder {

			private long processTypeId;
			private String shippingDt;
			private String delivPlanDt;
			private String delivDt;
			private String delivTz;
			private Long delivCourseId;
			private Long delivCustomerId;
			private String delivCustomerCd;
			private String delivZipCd;
			private String delivAddress1;
			private String delivAddress2;
			private String delivAddress3;
			private String delivAddressSupply;
			private String delivCustomerNm;
			private String delivTelNo;

			private Builder() {
			}

			@Override
			public ShippingDtBuilder processTypeId(long processTypeId) {
				this.processTypeId = processTypeId;
				return this;
			}

			@Override
			public Builder shippingDt(String shippingDt) {
				this.shippingDt = shippingDt;
				return this;
			}

			public Builder delivPlanDt(String delivPlanDt) {
				this.delivPlanDt = delivPlanDt;
				return this;
			}

			public Builder delivDt(String delivDt) {
				this.delivDt = delivDt;
				return this;
			}

			public Builder delivTz(String delivTz) {
				this.delivTz = delivTz;
				return this;
			}

			public Builder delivCourseId(Long delivCourseId) {
				this.delivCourseId = delivCourseId;
				return this;
			}

			public Builder delivCustomerId(Long delivCustomerId) {
				this.delivCustomerId = delivCustomerId;
				return this;
			}

			public Builder delivCustomerCd(String delivCustomerCd) {
				this.delivCustomerCd = delivCustomerCd;
				return this;
			}

			public Builder delivZipCd(String delivZipCd) {
				this.delivZipCd = delivZipCd;
				return this;
			}

			public Builder delivAddress1(String delivAddress1) {
				this.delivAddress1 = delivAddress1;
				return this;
			}

			public Builder delivAddress2(String delivAddress2) {
				this.delivAddress2 = delivAddress2;
				return this;
			}

			public Builder delivAddress3(String delivAddress3) {
				this.delivAddress3 = delivAddress3;
				return this;
			}

			public Builder delivAddressSupply(String delivAddressSupply) {
				this.delivAddressSupply = delivAddressSupply;
				return this;
			}

			public Builder delivCustomerNm(String delivCustomerNm) {
				this.delivCustomerNm = delivCustomerNm;
				return this;
			}

			public Builder delivTelNo(String delivTelNo) {
				this.delivTelNo = delivTelNo;
				return this;
			}

			public DelivKey build() {
				return new DelivKey(this);
			}
		}

		// ===== 以下、ゲッタ

		/**
		 * @return processTypeId
		 */
		public long getProcessTypeId() {
			return processTypeId;
		}

		/**
		 * @return shippingDt
		 */
		public String getShippingDt() {
			return shippingDt;
		}

		/**
		 * @return delivPlanDt
		 */
		public String getDelivPlanDt() {
			return delivPlanDt;
		}

		/**
		 * @return delivDt
		 */
		public String getDelivDt() {
			return delivDt;
		}

		/**
		 * @return delivTz
		 */
		public String getDelivTz() {
			return delivTz;
		}

		/**
		 * @return delivCourseId
		 */
		public Long getDelivCourseId() {
			return delivCourseId;
		}

		/**
		 * @return delivCustomerId
		 */
		public Long getDelivCustomerId() {
			return delivCustomerId;
		}

		/**
		 * @return delivCustomerCd
		 */
		public String getDelivCustomerCd() {
			return delivCustomerCd;
		}

		/**
		 * @return delivZipCd
		 */
		public String getDelivZipCd() {
			return delivZipCd;
		}

		/**
		 * @return delivAddress1
		 */
		public String getDelivAddress1() {
			return delivAddress1;
		}

		/**
		 * @return delivAddress2
		 */
		public String getDelivAddress2() {
			return delivAddress2;
		}

		/**
		 * @return delivAddress3
		 */
		public String getDelivAddress3() {
			return delivAddress3;
		}

		/**
		 * @return delivAddressSupply
		 */
		public String getDelivAddressSupply() {
			return delivAddressSupply;
		}

		/**
		 * @return delivCustomerNm
		 */
		public String getDelivCustomerNm() {
			return delivCustomerNm;
		}

		/**
		 * @return delivTelNo
		 */
		public String getDelivTelNo() {
			return delivTelNo;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((delivAddress1 == null) ? 0 : delivAddress1.hashCode());
			result = prime * result + ((delivAddress2 == null) ? 0 : delivAddress2.hashCode());
			result = prime * result + ((delivAddress3 == null) ? 0 : delivAddress3.hashCode());
			result = prime * result + ((delivAddressSupply == null) ? 0 : delivAddressSupply.hashCode());
			result = prime * result + ((delivCourseId == null) ? 0 : delivCourseId.hashCode());
			result = prime * result + ((delivCustomerCd == null) ? 0 : delivCustomerCd.hashCode());
			result = prime * result + ((delivCustomerId == null) ? 0 : delivCustomerId.hashCode());
			result = prime * result + ((delivCustomerNm == null) ? 0 : delivCustomerNm.hashCode());
			result = prime * result + ((delivDt == null) ? 0 : delivDt.hashCode());
			result = prime * result + ((delivPlanDt == null) ? 0 : delivPlanDt.hashCode());
			result = prime * result + ((delivTelNo == null) ? 0 : delivTelNo.hashCode());
			result = prime * result + ((delivTz == null) ? 0 : delivTz.hashCode());
			result = prime * result + ((delivZipCd == null) ? 0 : delivZipCd.hashCode());
			result = prime * result + (int) (processTypeId ^ (processTypeId >>> 32));
			result = prime * result + ((shippingDt == null) ? 0 : shippingDt.hashCode());
			return result;
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DelivKey other = (DelivKey) obj;
			if (delivAddress1 == null) {
				if (other.delivAddress1 != null)
					return false;
			} else if (!delivAddress1.equals(other.delivAddress1))
				return false;
			if (delivAddress2 == null) {
				if (other.delivAddress2 != null)
					return false;
			} else if (!delivAddress2.equals(other.delivAddress2))
				return false;
			if (delivAddress3 == null) {
				if (other.delivAddress3 != null)
					return false;
			} else if (!delivAddress3.equals(other.delivAddress3))
				return false;
			if (delivAddressSupply == null) {
				if (other.delivAddressSupply != null)
					return false;
			} else if (!delivAddressSupply.equals(other.delivAddressSupply))
				return false;
			if (delivCourseId == null) {
				if (other.delivCourseId != null)
					return false;
			} else if (!delivCourseId.equals(other.delivCourseId))
				return false;
			if (delivCustomerCd == null) {
				if (other.delivCustomerCd != null)
					return false;
			} else if (!delivCustomerCd.equals(other.delivCustomerCd))
				return false;
			if (delivCustomerId == null) {
				if (other.delivCustomerId != null)
					return false;
			} else if (!delivCustomerId.equals(other.delivCustomerId))
				return false;
			if (delivCustomerNm == null) {
				if (other.delivCustomerNm != null)
					return false;
			} else if (!delivCustomerNm.equals(other.delivCustomerNm))
				return false;
			if (delivDt == null) {
				if (other.delivDt != null)
					return false;
			} else if (!delivDt.equals(other.delivDt))
				return false;
			if (delivPlanDt == null) {
				if (other.delivPlanDt != null)
					return false;
			} else if (!delivPlanDt.equals(other.delivPlanDt))
				return false;
			if (delivTelNo == null) {
				if (other.delivTelNo != null)
					return false;
			} else if (!delivTelNo.equals(other.delivTelNo))
				return false;
			if (delivTz == null) {
				if (other.delivTz != null)
					return false;
			} else if (!delivTz.equals(other.delivTz))
				return false;
			if (delivZipCd == null) {
				if (other.delivZipCd != null)
					return false;
			} else if (!delivZipCd.equals(other.delivZipCd))
				return false;
			if (processTypeId != other.processTypeId)
				return false;
			if (shippingDt == null) {
				if (other.shippingDt != null)
					return false;
			} else if (!shippingDt.equals(other.shippingDt))
				return false;
			return true;
		}
	}

	// [C-CWMS-0050] 緊急補充機能を追加 2016.01.07 kawana End

	/**
	 * 引当対象の在庫か判定
	 * @param stock 在庫
	 * @param allocInstBody 引当指示ボディ
	 * @return true : 引当対象の在庫
	 */
	private boolean isTargetStock(TStock stock, TAllocInstB allocInstBody) {

		if (allocInstBody.getWarehouseId() != null) {
			if (allocInstBody.getWarehouseId() != stock.getWarehouseId().longValue()) {
				return false;
			}
		}

		boolean isNullLocationCd = CU.isNullOrEmpty(allocInstBody.getLocationCd());

		if (!isNullLocationCd) {
			if (!allocInstBody.getLocationCd().equals(stock.getMLocation().getLocationCd())) {
				return false;
			}
		}

		boolean isNullLot = CU.isNullOrEmpty(allocInstBody.getLot());

		if (!isNullLot) {
			if (!allocInstBody.getLot().equals(stock.getTLot().getLot())) {
				return false;
			}
		}

		boolean isNullLimitDt = CU.isNullOrEmpty(allocInstBody.getLimitDt());

		if (!isNullLimitDt) {
			if (!allocInstBody.getLimitDt().equals(stock.getTLot().getLimitDt())) {
				return false;
			}
		}

		boolean isNullShippingLimitDt = CU.isNullOrEmpty(allocInstBody.getShippingLimitDt());

		if (isNullLocationCd && isNullLot && isNullLimitDt && !isNullShippingLimitDt) {

			if (0 < allocInstBody.getShippingLimitDt().compareTo(stock.getTLot().getLimitDt())) {
				return false;
			}
		}

		// 全一致
		return true;
	}
}