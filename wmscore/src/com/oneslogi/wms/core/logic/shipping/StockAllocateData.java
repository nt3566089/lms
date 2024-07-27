package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TAllocLot;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;

/**
 * 在庫引当ロジッククラス
 */
class StockAllocateData {

	/** 全在庫マップ (キー:在庫ID) */
	private Map<Long, TStock> stockMap = new HashMap<>();

	/** 引当対象のピックロケ在庫リスト */
	private List<TStock> pickLocationStockList;

	/** 引当対象のバックロケ在庫リスト */
	private List<TStock> backLocationStockList;
	// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana Start
	/** 緊急補充在庫リスト */
	private List<TStock> addReplenishStockList = new ArrayList<TStock>();
	// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana End

	/** ケース荷姿 */
	MProductShape caseShape;

	/** 登録 在庫受払リスト */
	private List<TStockInout> insertStockInoutList = new ArrayList<TStockInout>();

	/** 出庫ヘッダマップ (キー：引当指示ヘッダID) */
	private Map<Long, TPickingH> pickingHMap;

	/** 登録 出庫ボディリスト */
	private List<TPickingB> insertPickingBList = new ArrayList<TPickingB>();

	/** 登録 引当ロット */
	private Map<Long, TAllocLot> insertAllocLotMap = new HashMap<Long, TAllocLot>();

	/**
	 * <h2>在庫リストを設定する。</h2>
	 * <pre>
	 * 引数の在庫リストからケース荷姿を取得する。
	 *
	 * 引数の在庫リストをピックロケーションの在庫リスト、バックロケーションの在庫リストにわけて管理する。
	 *
	 * </pre>
	 * @param stockList 在庫リスト：在庫ID
	 * @param caseProductShape ケースの商品荷姿
	 */
	protected void setStockList(List<TStock> stockList, MProductShape caseProductShape) {

		pickLocationStockList = new ArrayList<TStock>();
		backLocationStockList = new ArrayList<TStock>();

		if (stockList.size() == 0) {
			return;
		}

		// [#2961] 複数荷姿対応 2017.11.09 kawana Start

		// ケース荷姿を取得
		caseShape = caseProductShape;

		// [#2961] 複数荷姿対応 2017.11.09 kawana End

		for (TStock stock : stockList) {

			// ※※※ 引当可能数が0の在庫でも補充される可能性があるためスキップしないこと ※※※

			long stockId = stock.getStockId();

			if (stockMap.containsKey(stockId)) {
				stock = stockMap.get(stockId);
			} else {
				stockMap.put(stockId, stock);
			}

			// [1.1.4-CT-073] 緊急補充したのに補充したロケから引当されない問題を修正 2016.05.31 kawana
			// (引当可能数が0の在庫の場合にスキップする処理を削除)

			// ピックロケーションの判断
			if (isPickLocationStock(stock)) {
				// ピックロケーション

				pickLocationStockList.add(stock);
			} else {
				// バックロケーション

				backLocationStockList.add(stock);
			}
		}
	}

	/**
	 * <h2>在庫リストを取得する。</h2>
	 * <pre>
	 * 在庫リストを取得する。
	 * </pre>
	 * @return List<TStock> 在庫リスト(ピックロケーションの在庫、バックロケーションの在庫の順)
	 */
	protected List<TStock> getStockList() {

		List<TStock> stockList = new ArrayList<TStock>();
		stockList.addAll(pickLocationStockList);
		stockList.addAll(backLocationStockList);

		return stockList;
	}

	/**
	 * <h2>バックロケーションの在庫リストを取得する。</h2>
	 * <pre>
	 * バックロケーションの在庫リストを取得する。
	 * </pre>
	 * @return List<TStock> バックロケーションの在庫リスト
	 */
	protected List<TStock> getBackLocationStockList() {

		return backLocationStockList;
	}

	/**
	 * <h2>ピックロケーションの在庫リストを取得する。</h2>
	 * <pre>
	 * ピックロケーションの在庫リストを取得する。
	 * </pre>
	 * @return List<TStock> ピックロケーションの在庫リスト
	 */
	protected List<TStock> getPickLocationStockList() {

		return pickLocationStockList;
	}

	// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana Start

	/**
	 * <h2>緊急補充で追加された在庫リストを取得する。</h2>
	 * <pre>
	 * 緊急補充で追加された在庫リストを取得する。
	 * </pre>
	 * @return List<TStock> 緊急補充にて追加の在庫リスト
	 */
	protected List<TStock> getAddReplenishStockList() {

		return addReplenishStockList;
	}

	// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana End

	/**
	 * <h2>ケース荷姿を取得する。</h2>
	 * <pre>
	 * ケース荷姿を取得する。
	 * </pre>
	 * @return MProductShape ケース荷姿
	 */
	protected MProductShape getCaseShape() {

		return caseShape;
	}

	/**
	 * <h2>在庫数を減算する。</h2>
	 * <pre>
	 * 引数をキーに在庫を取得し、引当可能数を減算する。
	 * </pre>
	 * @param stockId 在庫ID
	 * @param minusNum 減算数
	 */
	protected void minusStockNum(long stockId, BigDecimal minusNum) {

		TStock updateStock = stockMap.get(stockId);
		BigDecimal stockNum = WCC.subtract(updateStock.getChargeNum(), minusNum);
		updateStock.setChargeNum(stockNum);
	}

	/**
	 * <h2>在庫が登録されているか確認する。</h2>
	 * <pre>
	 * 在庫が登録されているか確認する。
	 * </pre>
	 * @param stockId 在庫ID
	 * @return boolean true : 登録済
	 */
	protected boolean containsStock(long stockId) {
		return stockMap.containsKey(stockId);
	}

	/**
	 * <h2>補充在庫を加算する。</h2>
	 * <pre>
	 * 引数をキーに補充在庫を取得し、引当可能数を加算する。
	 * </pre>
	 * @param stockId 在庫ID
	 * @param plusNum 加算数
	 */
	protected void plusReplenishStock(long stockId, BigDecimal plusNum) {

		TStock updateStock = stockMap.get(stockId);
		BigDecimal stockNum = WCC.add(updateStock.getChargeNum(), plusNum);
		updateStock.setChargeNum(stockNum);
	}

	/**
	 * <h2>補充在庫を在庫リストに追加する。</h2>
	 * <pre>
	 * 補充在庫を在庫リストに追加する。
	 * </pre>
	 * @param stock 在庫：在庫ID
	 */
	protected void addReplenishStock(TStock stock) {

		long stockId = stock.getStockId();
		if (stockMap.containsKey(stockId)) {
			throw new IllegalStateException("add stock is existing");
		}

		stockMap.put(stockId, stock);
		if (isPickLocationStock(stock)) {
			pickLocationStockList.add(stock);
		} else {
			backLocationStockList.add(stock);
		}

		// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana Start
		addReplenishStockList.add(stock);
		// [1.1.4-CT-056] 緊急補充してもバックロケーションから引当される不具合を修正 2016.05.24 kawana End
	}

	/**
	 * <h2>在庫受払を追加する。</h2>
	 * <pre>
	 * 在庫受払を追加する。
	 * </pre>
	 * @param stockInout 在庫受払：全項目
	 */
	protected void addInsertStockInout(TStockInout stockInout) {
		insertStockInoutList.add(stockInout);
	}

	/**
	 * <h2>在庫受払リストを取得する。</h2>
	 * <pre>
	 * 登録 在庫受払リストの取得を行う。
	 * </pre>
	 * @return List<TStockInout> 登録対象の在庫受払リスト
	 */
	protected List<TStockInout> getInsertStockInoutList() {
		return insertStockInoutList;
	}

	/**
	 * ピックロケーションの在庫かを判定
	 * @param stock 在庫
	 * @return boolean true : ピックロケーションの在庫
	 */
	private boolean isPickLocationStock(TStock stock) {

		return stock.getMLocation().isPickingLocationFlg$1();
	}

	/**
	 * <h2>出庫ヘッダマップを設定する。</h2>
	 * <pre>
	 * 出庫ヘッダマップ (キー：引当指示ヘッダID)の設定を行う。
	 * </pre>
	 * @param pickingHMap 出庫ヘッダマップ
	 */
	protected void setPickingHMap(Map<Long, TPickingH> pickingHMap) {

		this.pickingHMap = pickingHMap;
	}

	/**
	 * <h2>出庫ヘッダを取得する。</h2>
	 * <pre>
	 * 出庫ヘッダの取得 (キー：引当指示ヘッダID)の設定を行う。
	 * </pre>
	 * @param allocInstHId 引当指示ヘッダID
	 * @return TPickingH 出庫ヘッダ
	 */
	protected TPickingH getPickingH(long allocInstHId) {

		return pickingHMap.get(allocInstHId);
	}

	/**
	 * <h2>出庫ボディを追加する。</h2>
	 * <pre>
	 * 登録 出庫ボディの追加を行う。
	 * </pre>
	 * @param pickingB 出庫ボディ：全項目
	 */
	protected void addInsertPickingB(TPickingB pickingB) {
		insertPickingBList.add(pickingB);
	}

	/**
	 * <h2>出庫ボディリストを取得する。</h2>
	 * <pre>
	 * 登録 出庫ボディリストの取得を行う。
	 * </pre>
	 * @return List<TPickingB> 登録対象の出庫ボディリスト
	 */
	protected List<TPickingB> getInsertPickingBList() {
		return insertPickingBList;
	}

	/**
	 * <h2>引当ロットを設定する。</h2>
	 * <pre>
	 * 引当ロットを一括登録するため、引当ロットを保存しておく。
	 * 同じ引当指示ボディIDで引当ロットの登録がある場合は、期限日を比較し、期限日の新しい方に上書きする。
	 * 存在しない場合、新規作成して設定する。
	 *
	 * </pre>
	 * @param allocInstBId 引当指示ボディID
	 * @param customerId 納品先ID
	 * @param productId 商品ID
	 * @param lot 引当したロット：全項目
	 */
	protected void addInsertAllocLot(long allocInstBId, long customerId, long productId, TLot lot) {

		if (insertAllocLotMap.containsKey(allocInstBId)) {
			// 期限日の比較

			TAllocLot allocLot = insertAllocLotMap.get(allocInstBId);
			if (dateEmptyToZero(allocLot.getTLot().getLimitDt()).compareTo(dateEmptyToZero(lot.getLimitDt())) < 0) {

				// 期限日が新しい場合は置換
				allocLot.setLotId(lot.getLotId());
				allocLot.setTLot(lot);
			}
		} else {
			// 新規作成

			TAllocLot allocLot = new TAllocLot();
			allocLot.setAllocInstBId(allocInstBId);
			allocLot.setCustomerId(customerId);
			allocLot.setProductId(productId);
			allocLot.setLotId(lot.getLotId());
			allocLot.setTLot(lot);

			insertAllocLotMap.put(allocInstBId, allocLot);
		}
	}

	/**
	 * <h2>登録された引当ロットの取得する。</h2>
	 * <pre>
	 * 登録された引当ロットの取得する。
	 * </pre>
	 * @return List<TAllocLot> 登録対象の引当ロットリスト
	 */
	protected List<TAllocLot> getInsertAllocLot() {
		return new ArrayList<TAllocLot>(insertAllocLotMap.values());
	}

	/**
	 * 日付文字列が空文字の場合は00000000を返す
	 */
	private String dateEmptyToZero(String dateString) {

		if (CU.isNullOrEmpty(dateString)) {
			return "00000000";
		}

		return dateString;
	}
}