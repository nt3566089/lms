package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.Comparator;

import org.apache.commons.collections.comparators.ComparatorChain;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;

/**
 * 引当在庫ソートクラス
 */
class StockAllocateComparator extends ComparatorChain {

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
	/**
	 * 引当種別
	 */
	private enum AllocateType {
		PIECE_ALLOCATE,
		CASE_ALLOCATE,
		NONE
	}

	/**
	 * <h2>引当在庫のコンパレータを作成。</h2>
	 * <pre>
	 * 引数に指定された引当ソートキーに従い、コンパレータを作成する。
	 * ・ロット
	 * ・ロットソート順
	 * ・期限日
	 * ・ロケーションCD
	 * ・ロケーション引当順序
	 * ・ゾーンCD
	 * ・入庫ラベルNo.
	 * ・入庫日
	 *
	 * ただし、ロケーションCD、ロケーション引当順序、ゾーンCDよりも緊急補充ロケーションが優先される
	 * </pre>
	 * @param sortkeys 引当ソートキーの配列
	 */
	static StockAllocateComparator newInstance(String[] sortkeys) {

		return new StockAllocateComparator(sortkeys, AllocateType.NONE);
	}

	/**
	 * <h2>引当在庫のコンパレータを作成。</h2>
	 * <pre>
	 * 引数に指定された引当ソートキーに従い、コンパレータを作成する。
	 * ・ロット
	 * ・ロットソート順
	 * ・期限日
	 * ・ロケーションCD
	 * ・ロケーション引当順序
	 * ・ゾーンCD
	 * ・入庫ラベルNo.
	 * ・入庫日
	 *
	 * ただし、ロケーションCD、ロケーション引当順序、ゾーンCDの引当順よりも緊急補充ロケーションが優先される
	 * また、バックロケーションよりもピックロケーションが優先される (ロット、ロットソート順、期限日のソートの優先度が高い場合は、その優先度に従う)
	 * </pre>
	 * @param sortkeys 引当ソートキーの配列
	 */
	static StockAllocateComparator newInstancePieceAllocate(String[] sortkeys) {

		return new StockAllocateComparator(sortkeys, AllocateType.PIECE_ALLOCATE);
	}

	/**
	 * <h2>引当在庫のコンパレータを作成。</h2>
	 * <pre>
	 * 引数に指定された引当ソートキーに従い、コンパレータを作成する。
	 * ・ロット
	 * ・ロットソート順
	 * ・期限日
	 * ・ロケーションCD
	 * ・ロケーション引当順序
	 * ・ゾーンCD
	 * ・入庫ラベルNo.
	 * ・入庫日
	 *
	 * ただし、ロケーションCD、ロケーション引当順序、ゾーンCDの引当順よりも緊急補充ロケーションが優先される
	 * また、ピックロケーションよりもバックロケーションが優先される (ロット、ロットソート順、期限日のソートの優先度が高い場合は、その優先度に従う)
	 * </pre>
	 * @param sortkeys 引当ソートキーの配列
	 */
	static StockAllocateComparator newInstanceCaseAllcate(String[] sortkeys) {

		return new StockAllocateComparator(sortkeys, AllocateType.CASE_ALLOCATE);
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

	/**
	 * <h2>引当在庫のコンストラクタを定義する。</h2>
	 * <pre>
	 * 引数に下記指定された引当ソートキーに従い、コンパレータを作成する。
	 * ・ロット
	 * ・ロットソート順
	 * ・期限日
	 * ・ロケーションCD
	 * ・ロケーション引当順序
	 * ・ゾーンCD
	 * ・入庫ラベルNo.
	 * ・入庫日
	 * </pre>
	 * @param sortkeys 引当ソートキーの配列
	 */
	private StockAllocateComparator(String[] sortkeys, AllocateType allocType) {

		// 補充ロケーション優先 未追加フラグ
		boolean unaddedReplenishLocationComparator = true;
		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
		// ピックロケーション優先 未追加フラグ
		boolean unaddedPickLocationComparator = true;
		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

		for (String sortkeyStr : sortkeys) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
			CDef.AllocSortKey sortkey = CDef.AllocSortKey.codeOf(sortkeyStr);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End

			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start
			switch (sortkey) {
			case $lot:
			case $lotOrder:
			case $limitDt:
				break;
			case $locationCd:
			case $locationOrder:
			case $zoneCd:
				// 補充ロケーション優先
				addReplenishLocationComparator(unaddedReplenishLocationComparator, allocType);
				unaddedReplenishLocationComparator = false;
				// ピックロケーション・バックロケーション優先
				addPickLocationComparator(unaddedPickLocationComparator, allocType);
				unaddedPickLocationComparator = false;
				break;
			case $storeDt:
			case $storeLabelNo:
				// ピックロケーション・バックロケーション優先
				addPickLocationComparator(unaddedPickLocationComparator, allocType);
				unaddedPickLocationComparator = false;
				break;
			}
			// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

			switch (sortkey) {
			case $lot:
				// ロット
				this.addComparator(new LotComparator());
				break;
			case $lotOrder:
				// ロットソート順
				this.addComparator(new LotSortComparator());
				break;
			case $limitDt:
				// 期限日
				this.addComparator(new LimitDtComparator());
				break;
			case $locationCd:
				// ロケーションCD
				this.addComparator(new LocationCdComparator());
				break;
			case $locationOrder:
				// ロケーション引当順序
				this.addComparator(new LocationAllocOrderComparator());
				break;
			case $zoneCd:
				// ゾーンCD
				this.addComparator(new ZoneCdComparator());
				break;
			case $storeLabelNo:
				// 入庫ラベルNo.
				this.addComparator(new StoreLabelComparator());
				break;
			case $storeDt:
				// 入庫日
				this.addComparator(new StoreDtComparator());
				break;
			}
		}

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

		// 補充ロケーション優先
		addReplenishLocationComparator(unaddedReplenishLocationComparator, allocType);
		// ピックロケーション・バックロケーション優先
		addPickLocationComparator(unaddedPickLocationComparator, allocType);

		// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

	/**
	 * 補充ロケーション優先を追加
	 */
	private void addReplenishLocationComparator(boolean unaddedReplenishLocationComparator, AllocateType allocType) {

		if (!unaddedReplenishLocationComparator) {
			return;
		}

		if (allocType != AllocateType.CASE_ALLOCATE) {
			// 補充ロケーションを優先

			this.addComparator(new ReplenishLocationComparator());
			unaddedReplenishLocationComparator = false;
		}
	}

	/**
	 * ピックロケーション優先またはバックロケーション優先を追加
	 */
	private void addPickLocationComparator(boolean unaddedPickLocationComparator, AllocateType allocType) {

		if (!unaddedPickLocationComparator) {
			return;
		}

		switch (allocType) {
		case PIECE_ALLOCATE:
			this.addComparator(new PickLocationComparator());
			break;
		case CASE_ALLOCATE:
			this.addComparator(new PickLocationComparator(), false);
			break;
		case NONE:
			break;
		}
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

	private class LotComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String lot1 = CU.nullToStr(s1.chaseTLot().getLot());
			String lot2 = CU.nullToStr(s2.chaseTLot().getLot());
			return lot1.compareTo(lot2);
		}
	}

	private class LotSortComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String lotSort1 = CU.nullToStr(s1.chaseTLot().getLotSort());
			String lotSort2 = CU.nullToStr(s2.chaseTLot().getLotSort());
			return lotSort1.compareTo(lotSort2);
		}
	}

	private class LimitDtComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String limitDt1 = nullToLastDt(s1.chaseTLot().getLimitDt());
			String limitDt2 = nullToLastDt(s2.chaseTLot().getLimitDt());
			return limitDt1.compareTo(limitDt2);
		}
	}

	private class LocationCdComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String locationCd1 = CU.nullToStr(s1.chaseMLocation().getLocationCd());
			String locationCd2 = CU.nullToStr(s2.chaseMLocation().getLocationCd());
			return locationCd1.compareTo(locationCd2);
		}
	}

	private class LocationAllocOrderComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			long allocOrder1 = nullToValue(s1.chaseMLocation().getAllocOrder(), true);
			long allocOrder2 = nullToValue(s2.chaseMLocation().getAllocOrder(), true);
			long diff = allocOrder1 - allocOrder2;
			if (diff < 0) {
				return -1;
			} else if (0 < diff) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private class ZoneCdComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String zoneCd1 = CU.nullToStr(s1.chaseMLocation().chaseMZone().getZoneCd());
			String zoneCd2 = CU.nullToStr(s2.chaseMLocation().chaseMZone().getZoneCd());
			return zoneCd1.compareTo(zoneCd2);
		}
	}

	private class StoreLabelComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String storeLabelNo1 = CU.nullToStr(s1.chaseTStoreNo().getStoreLabelNo());
			String storeLabelNo2 = CU.nullToStr(s2.chaseTStoreNo().getStoreLabelNo());
			return storeLabelNo1.compareTo(storeLabelNo2);
		}
	}

	private class StoreDtComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {
			String storeDt1 = nullToLastDt(s1.chaseTStoreNo().getStoreDt());
			String storeDt2 = nullToLastDt(s2.chaseTStoreNo().getStoreDt());
			return storeDt1.compareTo(storeDt2);
		}
	}

	private class ReplenishLocationComparator implements Comparator<TStock> {

		@Override
		public int compare(TStock stock1, TStock stock2) {

			if (isPickLocationStock(stock1) && isPickLocationStock(stock2)) {

				boolean isReplenishStock1 = isReplenishStock(stock1);
				boolean isReplenishStock2 = isReplenishStock(stock2);

				if (isReplenishStock1 && isReplenishStock2) {

					BigDecimal allocNum1 = stock1.getAllocNum();
					BigDecimal allocNum2 = stock2.getAllocNum();

					// 引当済数 昇順
					BigDecimal diff = WCC.subtract(allocNum1, allocNum2);
					if (WCC.isNegative(diff)) {
						return -1;
					} else if (WCC.isPositive(diff)) {
						return 1;
					}
				} else {

					// 補充ロケーションを優先
					if (isReplenishStock1) {
						return -1;
						// [新ｿﾘV2-051] ロケーション引当順序が適用されない 2016.08.08 kawana Start
					} else if (isReplenishStock2) {
						// [新ｿﾘV2-051] ロケーション引当順序が適用されない 2016.08.08 kawana End
						return 1;
					}
				}
			}

			return 0;
		}

		private boolean isPickLocationStock(TStock stock) {
			return stock.chaseMLocation().isPickingLocationFlg$1();
		}

		private boolean isReplenishStock(TStock stock) {
			if (CU.isNotNullAndEquals(stock.chaseMLocation().getReplenishProductId(), stock.getProductId())
					&& CU.isNotNullAndEquals(stock.chaseMLocation().getReplenishStockTypeId(), stock.getStockTypeId())
					&& CU.isNotNullAndEquals(stock.chaseMLocation().getReplenishDepositId(), stock.getDepositId())) {

				return true;
			} else {
				return false;
			}
		}
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana Start

	/**
	 * ピックロケーションの在庫を優先
	 */
	private class PickLocationComparator implements Comparator<TStock> {
		@Override
		public int compare(TStock s1, TStock s2) {

			boolean isPickingLocation1 = s1.chaseMLocation().isPickingLocationFlg$1();
			boolean isPickingLocation2 = s2.chaseMLocation().isPickingLocationFlg$1();

			if (isPickingLocation1 = isPickingLocation2) {
				return 0;
			}

			// ピックロケーションを優先
			if (isPickingLocation1) {
				return -1;
			} else {
				return 1;
			}
		}
	}

	// [#6599][v3.1] 期限日逆転防止の引当で古い期限日の在庫が残ってしまう問題を修正 2019.07.17 kawana End

	private static String nullToLastDt(String value) {

		if (value == null) {
			return "99999999";
		} else {
			return value;
		}
	}

	private static long nullToValue(Long value, boolean toLast) {

		if (value == null) {
			if (toLast) {
				return Long.MAX_VALUE;
			} else {
				return Long.MIN_VALUE;
			}
		} else {
			return value;
		}
	}
}
