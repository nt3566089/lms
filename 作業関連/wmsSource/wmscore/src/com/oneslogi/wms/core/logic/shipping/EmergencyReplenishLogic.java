package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.OrQuery;

import com.oneslogi.base.dbflute.cbean.MLocationCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TAllocInstB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;

/**
 * 緊急補充ロジッククラス
 */
class EmergencyReplenishLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private TStockBhv tStockBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [#2961] 複数荷姿対応 2017.11.09 kawana Start
	// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
	@Inject
	private ProductShapeCalcLogic productShapeLogic;
	// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End
	// [#2961] 複数荷姿対応 2017.11.09 kawana End
	@Inject
	private EmergencyReplenishStockMoveLogic emergencyReplenishStockMoveLogic;

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

	/** 緊急補充ロケーション */
	protected class ReplenishLocationInfo {
		/** 補充先ロケーション */
		public MLocation location;
		/** 補充先ロケーション種別 */
		public ReplenishLocationType type;

		public ReplenishLocationInfo(MLocation location, ReplenishLocationType type) {
			this.location = location;
			this.type = type;
		}
	}

	/** 緊急補充処理の戻り値 */
	protected class ReplenishInfo {
		/** 緊急補充ロケーション情報 */
		public ReplenishLocationInfo locationInfo;
		/** 補充数 */
		public BigDecimal replenishNum;

		public ReplenishInfo(ReplenishLocationInfo locationInfo, BigDecimal replenishNum) {
			this.locationInfo = locationInfo;
			this.replenishNum = replenishNum;
		}
	}

	/** 補充先ロケーション種別 */
	public enum ReplenishLocationType {
		/** 緊急補充ゾーン */
		EM_ZONE_LOCATION,
		/** SKU補充ロケーション */
		SKU_REPLENISH_LOCATION,
		/** 引数のロケーション */
		ARGUMENT_LOCATION,
		/** 補充ロケーションなし */
		NOT_FOUND
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

	/**
	 * <h2>緊急補充処理。</h2>
	 * <pre>
	 * ピックロケーションに欠品した商品をバックロケーションから緊急補充を行う。
	 * 補充元のロケーション、補充先のロケーション、補充数を計算し、{@link EmergencyReplenishStockMoveLogic#stockMove(TStock, long, MLocation, long, long, String, String, String, ErrorStatus) 緊急補充在庫移動ロジック.在庫移動}で緊急補充を行う。
	 *
	 * 補充元(バックロケーション)の在庫は、パラメータの引当関連データから取得し、
	 * 補充先のロケーションは ロケーションマスタの補充設定、パラメータマスタの緊急補充設定から決定する。
	 * 補充先ロケーションへの補充数は 欠品数、パラメータマスタの緊急補充単位区分、ロケーションマスタの最大格納数商品荷姿ID より決定する。
	 *
	 * 補充先ロケーションの優先順位は次の通り
	 *  1.ロケーションマスタの補充商品設定
	 *  2.パラメータマスタの緊急補充ゾーン
	 * 優先順位が同じ場合は補充先ロケーションにある在庫の引当済数の少ないロケーションに補充する
	 *
	 * 【検索テーブル】
	 * ・荷主センタマスタ(パラメータマスタ)
	 * ・ロケーションマスタ
	 * ・在庫
	 *
	 * 【パラメータの使用項目】
	 *  (引当関連データ)
	 *  ・在庫リスト (補充元 在庫リストの取得と補充先 在庫の設定)
	 *
	 * </pre>
	 * @param centerId 荷主ID
	 * @param clientId センタID
	 * @param allocInstBody 引当指示ボディ
	 * @param replenishLocation
	 * @param stockOutNum 欠品数
	 * @param workNo 出庫指示バッチNo (在庫移動指示ヘッダに登録)
	 * @param processNo 処理No.
	 * @param allocData 引当関連データ
	 * @param sourceStockList 補充元在庫リスト
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return 補充情報 (補充ロケーション、補充数)
	 */
	protected ReplenishInfo replenish(long centerId, long clientId, TAllocInstB allocInstBody, MLocation replenishLocation, BigDecimal stockOutNum, String workNo, String processNo,
			StockAllocateData allocData, EmergencyReplenishLocationManager skuLocationManager, EmergencyReplenishZoneManager zoneLocationManager, List<TStock> sourceStockList, ErrorStatus errSts) {

		// ===== 初期処理 =====

		if (WCC.isZeroOrLess(stockOutNum)) {
			// 補充なし

			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
			return new ReplenishInfo(null, WCC.ZERO);
			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
		}

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
		List<TStock> backLocationStockList;
		if (sourceStockList == null) {
			backLocationStockList = allocData.getBackLocationStockList();
		} else {
			backLocationStockList = sourceStockList;
		}
		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End
		if (backLocationStockList.size() == 0) {
			// 補充元在庫なし

			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
			return new ReplenishInfo(null, WCC.ZERO);
			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
		}

		// パラメータマスタ、システム管理日付の取得
		MClientCenter clientCenter = selectClientCenterWithParam(clientId, centerId);
		String processDt = clientCenter.getSystemDt();
		MParam param = clientCenter.getMParamAsOne();

		StockAllocateSKU sku = StockAllocateSKU.builder()
				.productId(allocInstBody.getProductId())
				.stockTypeId(allocInstBody.getStockTypeId())
				.depositId(allocInstBody.getDepositId()).build();

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

		// ===== 補充ロケーションの取得 =====

		ReplenishLocationInfo replenishLocationInfo = getReplenishLocation(centerId, allocInstBody, replenishLocation, sku, skuLocationManager, zoneLocationManager);
		if (0 < getErrorManager().size()) {
			return null;
		}

		if (replenishLocationInfo.type == ReplenishLocationType.NOT_FOUND) {
			return new ReplenishInfo(replenishLocationInfo, WCC.ZERO);
		}

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

		// ===== 補充数の決定 =====

		// 補充元在庫の総数を計算
		BigDecimal allStockNum = WCC.ZERO;
		for (TStock stock : backLocationStockList) {
			allStockNum = WCC.add(allStockNum, stock.getChargeNum());
		}

		if (WCC.isZeroOrLess(allStockNum)) {
			// 補充元在庫なし

			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
			return new ReplenishInfo(replenishLocationInfo, WCC.ZERO);
			// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
		}

		// 補充数の計算
		BigDecimal replenishNum = stockOutNum;
		if (WCC.isLessThan(allStockNum, replenishNum)) {
			// 在庫数が補充数に足りない

			replenishNum = allStockNum;
		}

		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
		// [#2961] 複数荷姿対応 2017.11.09 kawana Start

		// 補充荷姿の入数
		long replenishShapeUnitNum = 0L;
		if (replenishLocationInfo.type == ReplenishLocationType.EM_ZONE_LOCATION) {

			// 緊急補充荷姿(ゾーン)の入数
			replenishShapeUnitNum = productShapeLogic.getEmReplenishUnitNumPiece(sku.getProductId());
		} else {

			// 最大格納数商品荷姿の入数
			replenishShapeUnitNum = productShapeLogic.getUnitNumPieceByProductShapeId(sku.getProductId(), replenishLocationInfo.location.getMaxStoreProductShapeId());
		}

		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		// 荷姿切上の判定に従い補充数を変更
		replenishNum = getReplenishNum(replenishShapeUnitNum, replenishNum, param, allStockNum);

		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End

		// ===== 在庫移動の実行 =====

		// 残り補充数
		BigDecimal restReplenishNum = replenishNum;

		// 補充元在庫分繰り返し
		for (TStock stock : backLocationStockList) {

			// 引当可能数
			BigDecimal chargeNum = stock.getChargeNum();
			if (WCC.isZeroOrLess(chargeNum)) {
				continue;
			}

			// 移動数
			BigDecimal moveNum;
			if (WCC.isLessThan(chargeNum, restReplenishNum)) {
				// 引当可能数が足りない

				moveNum = chargeNum;
			} else {
				// 足りる

				moveNum = restReplenishNum;
			}

			// 在庫移動実行
			TStockInout inout = emergencyReplenishStockMoveLogic.stockMove(stock, moveNum, replenishLocationInfo.location, centerId, clientId, workNo, processNo, processDt, errSts);
			if (0 < getErrorManager().size()) {

				// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start
				return null;
				// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
			}

			long replenishStockId = inout.getStockId();
			if (allocData.containsStock(replenishStockId)) {

				// 補充在庫を引当関連データに加算
				allocData.plusReplenishStock(replenishStockId, inout.getStockInoutNum());
			} else {

				// 補充在庫を引当関連データに追加
				TStock replenishStock = selectReplenishStock(centerId, replenishStockId);
				if (replenishStock != null) {
					// 引当禁止ロケに補充された場合はnull

					allocData.addReplenishStock(replenishStock);
				}
			}

			// 在庫の引当可能数を減らす(他の引当処理で使いまわすため)
			allocData.minusStockNum(stock.getStockId(), moveNum);

			// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正(補充先ロケの在庫反映をここから移動) 2017.05.22 kawana

			// 残りの補充数を確認
			restReplenishNum = WCC.subtract(restReplenishNum, moveNum);
			if (WCC.isZeroOrLess(restReplenishNum)) {
				// 全て補充済
				break;
			}
		}

		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

		// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana Start

		// ===== 補充ロケーションの在庫状況反映 =====

		zoneLocationManager.replenishStock(replenishLocationInfo.location.getLocationId(), replenishNum, sku);
		skuLocationManager.replenishStock(replenishLocationInfo.location.getLocationId(), replenishNum);

		// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana End

		return new ReplenishInfo(replenishLocationInfo, replenishNum);
		// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana Start

	/**
	 * 補充ロケーションの取得
	 *
	 * @return 補充情報(補充ロケーション、補充ロケーション種別を設定)
	 */
	protected ReplenishLocationInfo getReplenishLocation(long centerId, TAllocInstB allocInstBody, MLocation replenishLocation, StockAllocateSKU sku,
			EmergencyReplenishLocationManager skuLocationManager,
			EmergencyReplenishZoneManager zoneLocationManager) {

		// ===== 指定ロケーション =====

		if (replenishLocation != null) {

			MLocationCB cb = mLocationBhv.newMyConditionBean();
			cb.setupSelect_MZone().withMWarehouse();
			cb.setupSelect_MProductShapeByMaxStoreProductShapeId();
			cb.checkInvalidQuery();
			cb.query().setLocationId_Equal(replenishLocation.getLocationId());

			MLocation argLocation = mLocationBhv.selectEntity(cb);

			return new ReplenishLocationInfo(argLocation, ReplenishLocationType.ARGUMENT_LOCATION);
		}

		// ===== 商品補充ロケーション =====

		boolean isNullLot = CU.isNullOrEmpty(allocInstBody.getLot());
		boolean isNullLimitDt = CU.isNullOrEmpty(allocInstBody.getLimitDt());
		if (isNullLot && isNullLimitDt) {
			// ロット、期限日の指定がない場合

			// 補充ロケーション取得
			MLocation skuLocation = skuLocationManager.getHighPriorityReplenishLocation(allocInstBody.getWarehouseId());
			if (skuLocation != null) {
				return new ReplenishLocationInfo(skuLocation, ReplenishLocationType.SKU_REPLENISH_LOCATION);
			}
		}

		// ===== 緊急補充ゾーンのロケーション =====

		// 緊急補充ゾーンのロケーションを取得
		MLocation zoneLocation = zoneLocationManager.getHighPriorityReplenishLocation(sku, allocInstBody.getWarehouseId());
		if (zoneLocation != null) {
			return new ReplenishLocationInfo(zoneLocation, ReplenishLocationType.EM_ZONE_LOCATION);
		}

		return new ReplenishLocationInfo(null, ReplenishLocationType.NOT_FOUND);
	}

	/**
	 * <h2>補充先ロケーションリストの取得.</h2>
	 * <pre>
	 * 引数の引当在庫の補充ロケーションを検索する。
	 * (補充商品設定が引当在庫と一致するロケーションマスタを検索)
	 * </pre>
	 *
	 * @param sku 引当在庫のSKU(商品、在庫区分、預託)
	 * @return 補充先ロケーションリスト
	 */
	protected List<MLocation> getSkuReplenishLocationList(long centerId, final StockAllocateSKU sku) {

		// 補充SKUが一致するピックロケーションを検索
		MLocationCB locationCb = mLocationBhv.newMyConditionBean();
		locationCb.setupSelect_MZone().withMWarehouse();
		locationCb.setupSelect_MProductShapeByMaxStoreProductShapeId();
		locationCb.query().setCenterId_Equal(centerId);
		locationCb.query().setReplenishProductId_Equal(sku.getProductId());
		locationCb.query().setReplenishStockTypeId_Equal(sku.getStockTypeId());
		locationCb.query().setReplenishDepositId_Equal(sku.getDepositId());
		locationCb.query().setPickingLocationFlg_Equal_$1();
		locationCb.query().setAllocNgFlg_Equal_$0();

		List<MLocation> locationList = mLocationBhv.selectList(locationCb);

		// SKUが一致する在庫を取得(既にロケーションに入っている在庫)
		mLocationBhv.loadTStockList(locationList, new ConditionBeanSetupper<TStockCB>() {
			@Override
			public void setup(TStockCB stockCb) {
				stockCb.checkInvalidQuery();
				stockCb.orScopeQuery(new OrQuery<TStockCB>() {
					public void query(TStockCB orCb) {
						orCb.query().setChargeNum_GreaterThan(WCC.ZERO);
						orCb.query().setAllocNum_GreaterThan(WCC.ZERO);
					}
				});
			}
		});

		return locationList;
	}

	/**
	 * パラメータマスタに設定された補充ゾーンのロケーションリストを取得
	 *
	 * @param sku 商品のSKU(商品ID、在庫区分ID、預託ID)
	 * @param param パラメータマスタ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 緊急補充ロケーション
	 */
	protected List<MLocation> getReplenishZoneLocationList(Long emReplenishZoneId) {

		if (emReplenishZoneId == null) {

			// 設定なし
			return new ArrayList<MLocation>();
		}

		// 緊急補充ゾーンのロケーション取得
		MLocationCB locationCb = mLocationBhv.newMyConditionBean();
		locationCb.setupSelect_MZone().withMWarehouse();
		locationCb.setupSelect_MProductShapeByMaxStoreProductShapeId();
		locationCb.query().queryMZone().setZoneId_Equal(emReplenishZoneId);
		locationCb.query().setPickingLocationFlg_Equal_$1();
		locationCb.query().setAllocNgFlg_Equal_$0();

		List<MLocation> locationList = mLocationBhv.selectList(locationCb);

		// 緊急補充ロケーションの在庫を検索
		mLocationBhv.loadTStockList(locationList, new ConditionBeanSetupper<TStockCB>() {
			@Override
			public void setup(TStockCB stockCb) {
				stockCb.checkInvalidQuery();
				stockCb.orScopeQuery(new OrQuery<TStockCB>() {
					public void query(TStockCB orCb) {
						orCb.query().setChargeNum_GreaterThan(WCC.ZERO);
						orCb.query().setAllocNum_GreaterThan(WCC.ZERO);
					}
				});
			}
		});

		return locationList;
	}

	// [ON推-品向-1173] 補充ロケーションから引当する場合は他のロケーションから引当しないように変更 2016.07.19 kawana End

	/**
	 * 最大格納数荷姿切上の設定、ロケーションの格納荷姿から補充可能数を計算
	 *
	 * @param long 切上荷姿の入数
	 * @param replenishNum 補充数
	 * @param param パラメータマスタ
	 * @param allStockNum 補充在庫総数
	 * @return 補充ロケーションへの補充可能数
	 */
	private BigDecimal getReplenishNum(long unitNum, BigDecimal replenishNum, MParam param, BigDecimal allStockNum) {

		// 該当ロケーションへの補充数
		BigDecimal locationReplenishNum = replenishNum;

		// 最大格納数荷姿切上の場合
		if (param.isEmReplenishUnitCls$1()) {

			// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加(不要コード削除) 2016.06.21 kawana

			if (1 < unitNum) {
				// 入数単位に切上

				// 余り
				BigDecimal remainder = WCC.remainder(replenishNum, unitNum);

				if (WCC.isPositive(remainder)) {
					// 切上
					locationReplenishNum = WCC.subtract(WCC.add(locationReplenishNum, unitNum), remainder);

					if (WCC.isLessThan(allStockNum, locationReplenishNum)) {
						// 切上すると在庫数が足りない

						locationReplenishNum = replenishNum;
					}
				}
			}
		}

		return locationReplenishNum;
	}

	/**
	 * 補充ロケーションの比較クラス
	 *
	 * ・在庫の引当済数(小さい順)
	 * ・在庫の引当可能数(小さい順)
	 * ・ロケーションCD(小さい順)
	 */
	static class ReplenishLocationComparator implements Comparator<MLocation> {

		@Override
		public int compare(MLocation location1, MLocation location2) {

			// ===== 引当済数の比較 =====
			List<TStock> stockList1 = location1.getTStockList();
			BigDecimal allocNum1 = WCC.ZERO;
			BigDecimal chargeNum1 = WCC.ZERO;
			for (TStock s : stockList1) {
				allocNum1 = WCC.add(allocNum1, CU.nullToZero(s.getAllocNum()));
				chargeNum1 = WCC.add(chargeNum1, CU.nullToZero(s.getChargeNum()));
			}

			List<TStock> stockList2 = location2.getTStockList();
			BigDecimal allocNum2 = WCC.ZERO;
			BigDecimal chargeNum2 = WCC.ZERO;
			for (TStock s : stockList2) {
				allocNum2 = WCC.add(allocNum2, CU.nullToZero(s.getAllocNum()));
				chargeNum2 = WCC.add(chargeNum2, CU.nullToZero(s.getChargeNum()));
			}

			if (allocNum1 != allocNum2) {
				// 引当済数昇順
				BigDecimal diff = WCC.subtract(allocNum1, allocNum2);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			if (chargeNum1 != chargeNum2) {
				// 引当済数昇順
				BigDecimal diff = WCC.subtract(chargeNum1, chargeNum2);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			// ===== ロケーションCDの比較 =====
			String locationCd1 = location1.getLocationCd();
			String locationCd2 = location2.getLocationCd();

			return locationCd1.compareTo(locationCd2);
		}
	}

	/**
	 * <h2>荷主センタマスタを取得する</h2>
	 *
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return システム日付（文字列）
	 */
	private MClientCenter selectClientCenterWithParam(long clientId, long centerId) {

		MClientCenter condition = new MClientCenter();
		condition.setClientId(clientId);
		condition.setCenterId(centerId);

		// レスポンス対策 2016.01.22 kawana Start
		return clientCenterLogic.getUkEntityCacheable(condition);
		// レスポンス対策 2016.01.22 kawana End
	}

	/**
	 * 補充在庫の検索
	 *
	 * ※ 引当処理の検索と結合テーブル、条件を合わせている ※
	 *
	 * @param replenishStockId 補充在庫ID
	 * @return 補充在庫
	 */
	private TStock selectReplenishStock(long centerId, long replenishStockId) {

		TStockCB cb = tStockBhv.newMyConditionBean();

		// ===== 結合テーブル設定 =====

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start
		cb.setupSelect_MProduct();
		// [#2961] 複数荷姿対応 2017.11.09 kawana End
		cb.setupSelect_TLot();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MStockType();
		cb.setupSelect_MWarehouse();
		cb.setupSelect_MLocation().withMZone();
		cb.setupSelect_TStoreNo().withMCustomer();
		cb.setupSelect_MShape();

		// ===== 検索条件の設定 =====

		cb.query().setStockId_Equal(replenishStockId);
		cb.query().setChargeNum_GreaterThan(WCC.ZERO);
		cb.query().queryMLocation().setAllocNgFlg_Equal_$0();
		cb.query().queryMProduct().setShippingStopFlg_Equal_$0();

		// ===== 在庫検索実行 =====

		TStock stock = tStockBhv.selectEntity(cb);

		return stock;
	}
}
