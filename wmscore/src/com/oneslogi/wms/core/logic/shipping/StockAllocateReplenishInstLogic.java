package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 補充数取得ロジック
 */
class StockAllocateReplenishInstLogic extends AbstractWmsLogic {

	class ReplenishInstInfo {
		public BigDecimal replenishNum = WCC.ZERO;
		public List<TStock> sourceStockList = new ArrayList<TStock>();
	}

	public ReplenishInstInfo getReplenishInstInfo(List<TStock> allStockList, BigDecimal instNum) {

		ReplenishInstInfo result = new ReplenishInstInfo();

		// 残指示数
		BigDecimal remainNum = instNum;

		for (TStock stock : allStockList) {

			// 在庫の引当数を計算
			BigDecimal chargeNum = stock.getChargeNum();
			if (WCC.isZeroOrLess(chargeNum)) {
				// 引当可能数なし
				continue;
			}

			// 残指示数と引当可能数の小さい方を引当数とする
			BigDecimal allocNum = CU.least(remainNum, chargeNum);

			if (!stock.getMLocation().isPickingLocationFlg$1()) {
				// バックロケ

				result.replenishNum = WCC.add(result.replenishNum, allocNum);
				result.sourceStockList.add(stock);
			}

			// 残り指示数を減らす
			remainNum = WCC.subtract(remainNum, allocNum);

			// 残り指示数が0以下の場合は引当終了
			if (WCC.isZeroOrLess(remainNum)) {
				break;
			}
		}

		return result;
	}

}