package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.util.CU;

class EmergencyReplenishZoneManager extends EmergencyReplenishLocationManager {

	String allocClsCd;

	/**
	 * <h2>コンストラクタ.</h2>
	 * <pre>
	 * 引数に設定された補充ロケーションを管理対象とする。
	 * ※※※ 注意 : 補充ロケーションは以下の条件を満たしていること
	 *  ・現在の引当可能数、引当済数を算出するため、在庫がloadされていること。
	 *    (getTStockList()を使用して算出)
	 *  ・ゾーンが結合されていること。
	 *    (倉庫指定の引当を考慮し倉庫IDを使用)
	 *
	 * </pre>
	 * @param replenishLocationList 補充ロケーションリスト
	 * @param emReplenishAllocClsCd 補充ロケ割付区分CD
	 */
	public EmergencyReplenishZoneManager(List<MLocation> replenishLocationList, String emReplenishAllocClsCd) {
		super(replenishLocationList);

		for (MLocation location : replenishLocationList) {

			ReplenishZoneLocationInfo info = new ReplenishZoneLocationInfo();
			info.location = location;
			info.warehouseId = location.getMZone().getWarehouseId();

			for (TStock stock : location.getTStockList()) {
				info.plusChargeNum(stock.getChargeNum());
				info.plusAllocNum(stock.getAllocNum());
				info.addStockSku(stock);
			}

			locationMap.put(location.getLocationId(), info);
		}

		this.allocClsCd = emReplenishAllocClsCd;
	}

	@Deprecated
	@Override
	public void replenishStock(long locationId, BigDecimal replenishNum) {
		throw new RuntimeException("This method is unavailable.");
	}

	/**
	 * <h2>管理対象ロケーションへの在庫補充を反映.<h2>
	 * @param locationId ロケーションID
	 * @param replenishNum 補充数
	 */
	public void replenishStock(long locationId, BigDecimal replenishNum, StockAllocateSKU sku) {
		super.replenishStock(locationId, replenishNum);
		ReplenishLocationInfo info = locationMap.get(locationId);
		if (info != null) {
			// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana Start
			((ReplenishZoneLocationInfo) info).addStockSku(sku);
			// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana End
		}
	}

	@Deprecated
	@Override
	public MLocation getHighPriorityReplenishLocation() {
		throw new RuntimeException("This method is unavailable.");
	}

	@Deprecated
	@Override
	public MLocation getHighPriorityReplenishLocation(Long warehouseId) {
		throw new RuntimeException("This method is unavailable.");
	}

	/**
	 * <h2>優先補充ロケーションの取得(倉庫指定).<h2>
	 * <pre>
	 * 現在の管理上の在庫数(引当済数、引当可能数)から
	 * 指定された倉庫の中で最優先で使用される補充ロケーションを取得
	 *
	 * </pre>
	 * @param warehouseId 倉庫ID
	 * @return 最優先の補充ロケーション (対象の補充ロケーションがない場合は null)
	 */
	public MLocation getHighPriorityReplenishLocation(StockAllocateSKU sku) {
		return getHighPriorityReplenishLocation(sku, null);
	}

	/**
	 * <h2>優先補充ロケーションの取得(倉庫指定).<h2>
	 * <pre>
	 * 現在の管理上の在庫数(引当済数、引当可能数)から
	 * 指定された倉庫の中で最優先で使用される補充ロケーションを取得
	 *
	 * </pre>
	 * @param warehouseId 倉庫ID
	 * @return 最優先の補充ロケーション (対象の補充ロケーションがない場合は null)
	 */
	public MLocation getHighPriorityReplenishLocation(StockAllocateSKU sku, Long warehouseId) {
		List<ReplenishLocationInfo> infoList = new ArrayList<ReplenishLocationInfo>(locationMap.values());
		if (infoList.size() < 1) {
			return null;
		}

		List<ReplenishLocationInfo> warehouseInfoList = new ArrayList<ReplenishLocationInfo>();
		if (warehouseId != null) {
			// 倉庫の指定あり

			// 指定倉庫と一致するロケーションを抜出
			for (ReplenishLocationInfo info : infoList) {
				if (info.warehouseId == warehouseId.longValue()) {
					warehouseInfoList.add(info);
				}
			}
		} else {
			// 倉庫の指定なし

			warehouseInfoList.addAll(infoList);
		}

		if (warehouseInfoList.size() < 1) {
			return null;
		}

		// 優先度順にソート
		Collections.sort(warehouseInfoList, new ReplenishLocationComparator());
		if (CU.isNullOrEmpty(allocClsCd)) {
			return warehouseInfoList.get(0).location;
		}
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
		switch (CDef.ReplenishAllocCls.codeOf(allocClsCd)) {
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End
		default:
		case $0:
			// 同一SKUは同じロケに割り付け

			for (ReplenishLocationInfo info : warehouseInfoList) {
				for (StockAllocateSKU s : ((ReplenishZoneLocationInfo) info).stockSkuSet) {

					if (sku.equals(s)) {

						return info.location;
					}
				}
			}

			// 引当済在庫がないため新しいロケ(引当済数が一番小さいロケ)を返す
			return warehouseInfoList.get(0).location;
		case $1:
			// 補充ごとにロケを割り付け

			// 新しいロケ(引当済数が一番小さいロケ)を返す
			return warehouseInfoList.get(0).location;
		}
	}

	/**
	 * 補充ロケーション情報クラス
	 */
	protected class ReplenishZoneLocationInfo extends ReplenishLocationInfo {
		Set<StockAllocateSKU> stockSkuSet = new HashSet<StockAllocateSKU>();

		// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana Start
		void addStockSku(StockAllocateSKU sku) {

			stockSkuSet.add(sku);
		}
		// [#1809] 補充ロケ(補充ゾーン使用)の割付順不正を修正 2017.05.22 kawana End

		void addStockSku(TStock stock) {

			StockAllocateSKU sku = StockAllocateSKU.builder()
					.productId(stock.getProductId())
					.stockTypeId(stock.getStockTypeId())
					.depositId(stock.getDepositId()).build();

			stockSkuSet.add(sku);
		}
	}
}
