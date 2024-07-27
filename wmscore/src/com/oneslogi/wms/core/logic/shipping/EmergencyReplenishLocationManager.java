package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.wms.core.WCC;

class EmergencyReplenishLocationManager {

	/** 緊急補充ロケーション管理マップ(キー：ロケーションID) */
	Map<Long, ReplenishLocationInfo> locationMap = new HashMap<Long, ReplenishLocationInfo>();

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
	 */
	public EmergencyReplenishLocationManager(List<MLocation> replenishLocationList) {

		for (MLocation location : replenishLocationList) {

			ReplenishLocationInfo info = new ReplenishLocationInfo();
			info.location = location;
			info.warehouseId = location.getMZone().getWarehouseId();

			for (TStock stock : location.getTStockList()) {
				info.plusChargeNum(stock.getChargeNum());
				info.plusAllocNum(stock.getAllocNum());
			}

			locationMap.put(location.getLocationId(), info);
		}
	}

	/**
	 * <h2>管理対象ロケーションへの在庫補充を反映.<h2>
	 * @param locationId ロケーションID
	 * @param replenishNum 補充数
	 */
	public void replenishStock(long locationId, BigDecimal replenishNum) {
		ReplenishLocationInfo info = locationMap.get(locationId);
		if (info == null) {
			// 管理対象外
			return;
		}

		info.plusChargeNum(replenishNum);
	}

	/**
	 * <h2>管理対象ロケーションの在庫引当を反映.<h2>
	 * @param locationId ロケーションID
	 * @param allocNum 引当数
	 */
	public void allocStock(long locationId, BigDecimal allocNum) {
		ReplenishLocationInfo info = locationMap.get(locationId);
		if (info == null) {
			// 管理対象外
			return;
		}

		// 引当可能数から減算し、引当済数に加算
		info.minusChargeNum(allocNum);
		info.plusAllocNum(allocNum);
	}

	/**
	 * <h2>優先補充ロケーションの取得.<h2>
	 * <pre>
	 * 現在の管理上の在庫数(引当済数、引当可能数)から
	 * 最優先で使用される補充ロケーションを取得
	 * </pre>
	 * @return 最優先の補充ロケーション (対象の補充ロケーションがない場合は null)
	 */
	public MLocation getHighPriorityReplenishLocation() {
		return getHighPriorityReplenishLocation(null);
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
	public MLocation getHighPriorityReplenishLocation(Long warehouseId) {

		List<ReplenishLocationInfo> infoList = new ArrayList<ReplenishLocationInfo>(locationMap.values());
		if (infoList.size() < 1) {
			return null;
		}

		// 優先度順にソート
		Collections.sort(infoList, new ReplenishLocationComparator());
		if (warehouseId == null) {
			// 指定倉庫なし

			return infoList.get(0).location;
		}

		// 指定倉庫と一致するロケーションを返却
		for (ReplenishLocationInfo info : infoList) {
			if (info.warehouseId == warehouseId.longValue()) {
				return info.location;
			}
		}

		// 指定倉庫と一致する補充ロケーションなし
		return null;
	}

	/**
	 * 補充ロケーション情報クラス
	 */
	protected static class ReplenishLocationInfo {

		MLocation location;
		long warehouseId;
		BigDecimal chargeNum = WCC.ZERO;
		BigDecimal allocNum = WCC.ZERO;

		public void plusChargeNum(BigDecimal num) {
			chargeNum = WCC.add(chargeNum, num);
		}

		public void minusChargeNum(BigDecimal num) {
			chargeNum = WCC.subtract(chargeNum, num);
		}

		public void plusAllocNum(BigDecimal num) {
			allocNum = WCC.add(allocNum, num);
		}
	}

	/**
	 * 補充ロケーションの比較クラス
	 *
	 * ・在庫の引当済数(小さい順)
	 * ・在庫の引当可能数(小さい順)
	 * ・ロケーションCD(小さい順)
	 */
	protected static class ReplenishLocationComparator implements Comparator<ReplenishLocationInfo> {

		@Override
		public int compare(ReplenishLocationInfo location1, ReplenishLocationInfo location2) {

			// ===== 引当済数の比較 =====
			if (location1.allocNum != location2.allocNum) {
				// 引当済数昇順
				BigDecimal diff = WCC.subtract(location1.allocNum, location2.allocNum);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			// ===== 引当可能数の比較 =====
			if (location1.chargeNum != location2.chargeNum) {
				// 引当可能数昇順
				BigDecimal diff = WCC.subtract(location1.chargeNum, location2.chargeNum);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			// ===== ロケーションCDの比較 =====
			String locationCd1 = location1.location.getLocationCd();
			String locationCd2 = location2.location.getLocationCd();

			return locationCd1.compareTo(locationCd2);
		}
	}
}
