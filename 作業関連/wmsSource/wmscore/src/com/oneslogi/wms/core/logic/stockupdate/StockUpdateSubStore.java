package com.oneslogi.wms.core.logic.stockupdate;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.allcommon.CDef.StoreNoMergeFlg;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.TStockReportBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TReceiveLabel;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStockReport;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;

/**
 * 在庫更新(入庫)クラス
 */
class StockUpdateSubStore extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TStockReportBhv tStockReportBhv;
	@Inject
	private TStockInoutBhv tStockInoutBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private StockUpdateCheckLogic stockUpdateCheckLogic;
	@Inject
	private StockSelectLogic stockSelectLogic;
	@Inject
	private LotManageLogic lotManageLogic;
	@Inject
	private StoreNoManageLogic storeNoManageLogic;
	@Inject
	private LocationLogic locationLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana Start
	@Inject
	private ProductShapeCalcLogic productShapeLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana End
	@Inject
	private ProductLogic productLogic;
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
	@Inject
	private ReceiveLabelManageLogic receiveLabelManageLogic;
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]
	// ===== 内部使用 列挙型 =====

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(ここから削除してStockUpdateCheckLogicに移動) 2018.04.11 kawana Delete

	private enum ManageStoreDtFlg {
		TRUE,
		FALSE
	}

	private enum LotConditionType {
		NOMAL,
		MERGE,
		FORCED_MERGE
	}

	// 呼出メソッド
	enum StoreCallMethod {
		RECEIVE,
		MOVE,
		ADJUST
	}

	/**
	 * <h2>入庫の在庫更新。</h2>
	 * <pre>
	 * 入庫の在庫更新処理
	 * パラメータの在庫、在庫受払情報で在庫を追加する。
	 *
	 * ・入庫No.マージの場合は マージ先在庫の数量を加算
	 * ・入庫ラベルNo.が指定されている場合は 同じ入庫ラベルNo.の在庫の数量を加算
	 * ・上記以外の場合、新規に在庫を登録する
	 *   入庫No.を新規に登録し、ロットが登録されていない場合はロットを新規に登録する
	 *
	 * 【検索テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 *   ・採番マスタ
	 *   ・倉庫マスタ
	 *   ・荷姿マスタ
	 *   ・商品荷姿マスタ
	 *   ・商品マスタ
	 *   ・ロケーションマスタ
	 *
	 * 【更新または登録テーブル】
	 *   ・在庫
	 *   ・在庫日報
	 * 【登録テーブル】
	 *   ・ロット
	 *   ・入庫No.
	 *   ・在庫受払
	 *
	 * </pre>
	 * @param instHeader 在庫移動指示ヘッダ
	 * @param instBody 在庫移動指示ボディ
	 * @param recordBody 在庫移動実績ボディ
	 * @param errSts エラーステータス
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	void storeStock(TStock stock, TStockInout stockInout, MClientCenter clientCenter, StoreCallMethod method, ErrorStatus errSts) {
	void storeStock(TStock stock, TStockInout stockInout, MClientCenter clientCenter, StoreCallMethod method, List<TReceiveLabel> receiveLabelList, ErrorStatus errSts) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		MParam param = clientCenter.getMParamAsOne();

		// システム日付
		String systemDt = clientCenter.getSystemDt();

		if (stock.getTStoreNo() == null) {
			stock.setTStoreNo(new TStoreNo());
		}

		// 入庫日設定
		if (CU.isNullOrEmpty(stock.getTStoreNo().getStoreDt())) {
			stock.getTStoreNo().setStoreDt(systemDt);
		}

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		// ピース荷姿ID設定
		stock.setShapeId(productShapeLogic.getPieceShapeId(stock.getProductId()));
		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// ロットID設定
		if (stock.getLotId() == null) {
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//			TLot lot = lotManageLogic.selectOrInsertLot(stock.getProductId(), stock.getTLot().getLot(), stock.getTLot().getLimitDt());
			TLot lot = lotManageLogic.selectOrInsertLot(stock.getProductId(), stock.getTLot().getLot(), stock.getTLot().getLimitDt(), stock.getTLot().getProdDt(), stock.getTLot().getReceiveDt());
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
			stock.setLotId(lot.getLotId());

			stock.setTLot(lot);
		}

		MProduct product = stock.getMProduct();
		if (product == null) {

			MProduct entity = new MProduct();
			entity.setProductId(stock.getProductId());

			product = productLogic.getPkEntityWithDeletedCheck(entity);

			stock.setMProduct(product);
		}

		MLocation location = stock.getMLocation();

		if (location == null) {

			MLocation entity = new MLocation();
			entity.setLocationId(stock.getLocationId());

			location = locationLogic.getPkEntityWithDeletedCheck(entity);

			stock.setMLocation(location);
		}

		// ===== 在庫マージ =====

		// 入庫日管理フラグ
		ManageStoreDtFlg manageStoreDtFlg = ManageStoreDtFlg.FALSE;
		if (clientCenter.getMParamAsOne().isStoreDtFlg$1()) {
			manageStoreDtFlg = ManageStoreDtFlg.TRUE;
		}

		// 入庫No.マージ設定確認
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe
		CDef.StoreNoMergeFlg mergeFlg = stockUpdateCheckLogic.onsNumMergeCheck(param, product, location);

		if (mergeFlg == StoreNoMergeFlg.$1) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe
			// マージする

			// マージ先在庫をロット検索
			StockSelectLotCondition lotCondition = createLotCondition(stock, manageStoreDtFlg, LotConditionType.MERGE);
			TStock lotStock = stockSelectLogic.selectByLot(lotCondition, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			if (lotStock != null) {
				// マージ先在庫あり

				// [#3149] 入数の変更チェックを削除 2017.12.04 kawana

				// ===== 在庫更新 =====

				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				updateStock(lotStock, stockInout, systemDt, method);
				updateStock(lotStock, stockInout, systemDt, method, receiveLabelList);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
				return;
			}
		}

		// ===== 入庫ラベルNo.の在庫更新 =====

		String storeLabelNo = stock.getTStoreNo().getStoreLabelNo();

		if (!CU.isNullOrEmpty(storeLabelNo)) {
			// 入庫ラベルNo.が設定されている場合

			// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start
			TStock storeNoStock = selectByStoreNo(storeLabelNo, stock, clientCenter.getMParamAsOne().getStoreDtFlgAsStoreDtFlg(), errSts);
			// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End
			if (0 < getErrorManager().size()) {
				return;
			}

			if (storeNoStock != null) {

				// ===== 在庫更新 =====
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//				updateStock(storeNoStock, stockInout, systemDt, method);
				updateStock(storeNoStock, stockInout, systemDt, method, receiveLabelList);
				//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]
				return;
			}
		}

		// ===== 新規登録 =====

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//		insertStock(stock, stockInout, systemDt, method);
		insertStock(stock, stockInout, systemDt, method, receiveLabelList);
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

	}

	/**
	 * 入庫ラベルNo.指定で在庫検索
	 */
	private TStock selectByStoreNo(String storeLabelNo, TStock stock, CDef.StoreDtFlg manageStoreDtFlg, ErrorStatus errSts) {

		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana Start

		// 入庫ラベルNo.不正チェック
		stockUpdateCheckLogic.checkStoreLabelNo(storeLabelNo, stock, manageStoreDtFlg, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(StockUpdateCheckLogicに移動) 2018.04.11 kawana End

		// 登録先の在庫の取得
		TStockCB stockCb = tStockBhv.newMyConditionBean();
		stockCb.setupSelect_TStockReportAsOne();

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		stockCb.setupSelect_MLocation();
		stockCb.specify().specifyMLocation().columnLocationCd();
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

		stockCb.checkInvalidQuery();
		stockCb.query().queryTStoreNo().setStoreLabelNo_Equal(storeLabelNo);
		stockCb.query().setLocationId_Equal(stock.getLocationId());
		// ON推-品向-420対応で不正な条件(荷主ID)が指定されていたのを削除 2015.12.28 kawana

		List<TStock> storeLabelStockList = tStockBhv.selectList(stockCb);

		// ===== 結果の判定 =====

		int selectStockSize = storeLabelStockList.size();
		if (2 <= selectStockSize) {
			// エラー管理クラスにエラーを登録
			getErrorManager().add(errSts, WmsCoreMessageConst.ONS_LABEL_NUMBER_DUPLICATE_ERROR);
			return null;
		}

		if (selectStockSize == 1) {
			return storeLabelStockList.get(0);
		} else {
			return null;
		}

	}

	// [#4285] 入庫ラベルNo.の在庫一致チェックをpublic化(ここから削除してStockUpdateCheckLogicに移動) 2018.04.11 kawana Delete

	/**
	 * <h2>在庫更新(加算)</h2>
	 * <pre>
	 * ・在庫の更新
	 * ・在庫日報の更新
	 * ・在庫受払の登録
	 * </pre>
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private void updateStock(TStock stock, TStockInout inout, String systemDt, StoreCallMethod method) {
	private void updateStock(TStock stock, TStockInout inout, String systemDt, StoreCallMethod method, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 在庫更新 =====

		stock.setChargeNum(WCC.add(stock.getChargeNum(), inout.getStockInoutNum()));

		tStockBhv.update(stock);

		// ===== 在庫日報更新 =====

		TStockReport stockReport = stock.getTStockReportAsOne();
		addStockReportNum(inout, method, stockReport);

		tStockReportBhv.update(stockReport);

		// ===== 在庫受払登録 =====

		insertInout(inout, stock.getStockId(), systemDt);


		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.InsertOrUpdateLabel(receiveLabelList, stock.getStockId(), stock.getMLocation().getLocationCd());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

	}

	/**
	 * 在庫日報の数字加算
	 */
	private void addStockReportNum(TStockInout inout, StoreCallMethod method, TStockReport stockReport) {
		switch (method) {
		case ADJUST:
			stockReport.setAdjPlsNumDay(WCC.add(CU.nullToZero(stockReport.getAdjPlsNumDay()), inout.getStockInoutNum()));
			stockReport.setAdjPlsNumMonth(WCC.add(CU.nullToZero(stockReport.getAdjPlsNumMonth()), inout.getStockInoutNum()));
			break;
		case MOVE:
			stockReport.setMovePlsNumDay(WCC.add(CU.nullToZero(stockReport.getMovePlsNumDay()), inout.getStockInoutNum()));
			stockReport.setMovePlsNumMonth(WCC.add(CU.nullToZero(stockReport.getMovePlsNumMonth()), inout.getStockInoutNum()));
			break;
		case RECEIVE:
			stockReport.setStoreNumDay(WCC.add(CU.nullToZero(stockReport.getStoreNumDay()), inout.getStockInoutNum()));
			stockReport.setStoreNumMonth(WCC.add(CU.nullToZero(stockReport.getStoreNumMonth()), inout.getStockInoutNum()));
			// 入庫日も設定？
			break;
		default:
			getErrorManager().throwException(new IllegalArgumentException("StoreCallMethod is illegal."));
			break;
		}
	}

	/**
	 * <h2>在庫登録</h2>
	 * <pre>
	 * ・在庫の登録
	 * ・在庫日報の登録
	 * ・在庫受払の登録
	 * </pre>
	 */
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [S]
//	private void insertStock(TStock stock, TStockInout inout, String systemDt, StoreCallMethod method) {
	private void insertStock(TStock stock, TStockInout inout, String systemDt, StoreCallMethod method, List<TReceiveLabel> receiveLabelList) {
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Mod [E]

		// ===== 入庫No.取得または登録 =====

		TStoreNo storeNo = stock.getTStoreNo();
		String storeLabelNo = storeNo.getStoreLabelNo();
		String storeDt = storeNo.getStoreDt();

		if (CU.isNullOrEmpty(storeLabelNo)) {
			// 入庫ラベルの指定がない場合

			// 入庫ラベルを採番して登録した入庫Noを取得
			storeNo = storeNoManageLogic.insertNewNumberingLabel(storeNo.getSupplierId(), storeDt, storeNo.getOldStoreNumId());
		} else {

			// 検索または登録した入庫Noを取得
			storeNo = storeNoManageLogic.selectOrInsertStoreNo(storeLabelNo, storeNo.getSupplierId(), storeDt, storeNo.getOldStoreNumId());
		}

		// ===== 在庫登録 =====

		stock.setWarehouseId(getWarehouseId(stock.getLocationId()));
		stock.setStoreNoId(storeNo.getStoreNoId());
		// [#3149] 入数の設定を削除 2017.12.04 kawana
		stock.setChargeNum(inout.getStockInoutNum());

		tStockBhv.insert(stock);

		// ===== 在庫日報登録 =====

		TStockReport stockReport = new TStockReport();
		stockReport.setStockId(stock.getStockId());
		addStockReportNum(inout, method, stockReport);

		tStockReportBhv.insert(stockReport);

		// ===== 在庫受払登録 =====

		insertInout(inout, stock.getStockId(), systemDt);

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [S]
		// 入荷ラベル情報を登録する。
		receiveLabelManageLogic.InsertOrUpdateLabel(receiveLabelList, stock.getStockId(), stock.getMLocation().getLocationCd());
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.19 ma.omori.gf Add [E]

	}

	/**
	 * 在庫受払の登録
	 */
	private void insertInout(TStockInout inout, long stockId, String systemDt) {

		// ===== 在庫受払登録 =====

		inout.setProcessDt(systemDt);
		inout.setCorrectType_$0();
		inout.setStockId(stockId);
		inout.setInoutType_$0();

		tStockInoutBhv.insert(inout);
	}

	// [#3149] 入数チェックの除去 (未使用になったメソッドの削除) 2017.12.04 kawana

	/**
	 * 倉庫IDの取得
	 *
	 * @param locationId ロケーションID
	 * @return 倉庫ID
	 */
	private long getWarehouseId(long locationId) {

		MLocation condition = new MLocation();
		condition.setLocationId(locationId);

		return locationLogic.getPkEntityWithWarehouseAndDeletedCheck(condition).getMZone().getWarehouseId();
	}

	//【Ver1.1.1】[C-CWMS-0035] 在庫区分IDの取得メソッドを削除 2015.08.12 hayashi

	// [#3149] 入数チェックの除去 (未使用になったメソッドの削除) 2017.12.04 kawana

	/**
	 * ロット検索条件の作成
	 */
	private StockSelectLotCondition createLotCondition(TStock stock, ManageStoreDtFlg manageStoreDtFlg, LotConditionType type) {

		// ロット検索の条件
		StockSelectLotCondition.Builder lotCondition = StockSelectLotCondition.builder()
				.clientId(stock.getClientId())
				.productId(stock.getProductId())
				.stockTypeId(stock.getStockTypeId())
				.locationId(stock.getLocationId())
				.depositId(stock.getDepositId())
				.lotId(stock.getLotId())
				.shapeId(stock.getShapeId())
				.joinStoreNo(true);

		if (manageStoreDtFlg == ManageStoreDtFlg.TRUE) {

			// 入庫日管理あり
			lotCondition.storeDt(stock.getTStoreNo().getStoreDt());
		}

		switch (type) {
		case FORCED_MERGE:
			lotCondition.selectMerge(true).forcedMerge(true);
			break;
		case MERGE:
			lotCondition.selectMerge(true);
			break;
		case NOMAL:
		default:
			break;

		}

		return lotCondition.build();
	}
}
