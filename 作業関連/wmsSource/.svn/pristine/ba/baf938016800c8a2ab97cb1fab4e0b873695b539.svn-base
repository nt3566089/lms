package com.oneslogi.wms.core.logic.stockupdate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.wms.core.WCC;

class TransitStockDto {

	/**
	 * 在庫としてのキー
	 */
	private StockKey stockKey;

	/**
	 * 入庫としてのキー
	 */
	private ReceiveKey receiveKey;

	/**
	 * 積送中数
	 */
	private BigDecimal transitNum = WCC.ZERO;

	/**
	 * 出庫数
	 */
	private BigDecimal pickingNum = WCC.ZERO;

	/**
	 * 変更した出庫ボディのID
	 */
	private Set<Long> modifyPickingBIdSet = new HashSet<Long>();

	/**
	 * 変更した在庫リスト(在庫IDで紐付け)
	 */
	private Map<Long, TStock> modifyStockMap = new HashMap<Long, TStock>();

	List<TPickingB> transitTPickingBList = new ArrayList<TPickingB>();

	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//	public TransitStockDto(StockKey stockKey) {
//		this.stockKey = stockKey;
//		this.receiveKey = new ReceiveKey(stockKey.clientId, stockKey.stockTypeId, stockKey.depositId, stockKey.productId, stockKey.lot, stockKey.limitDt);
//	}
//
//	public boolean equalsStock(TransitStockDto stock) {
//		return this.stockKey.equals(stock.stockKey);
//	}
//
//	public boolean equalsStock(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt) {
//		return this.stockKey.equals(new StockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt));
//	}
//
//	public boolean equalsStock(long clientId, long stockTypeId, long depositId, long productId, String lot, String limitDt) {
//		return this.receiveKey.equals(new ReceiveKey(clientId, stockTypeId, depositId, productId, lot, limitDt));
//	}
//
//	public static StockKey createStockKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt) {
//		return new StockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt);
//	}
//
//	public static ReceiveKey createReceiveKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt) {
//		return new ReceiveKey(clientId, stockTypeId, depositId, productId, lot, limitDt);
//	}
	public TransitStockDto(StockKey stockKey) {
		this.stockKey = stockKey;
		this.receiveKey = new ReceiveKey(stockKey.clientId, stockKey.stockTypeId, stockKey.depositId, stockKey.productId, stockKey.lot, stockKey.limitDt, stockKey.prodDt);
	}

	public boolean equalsStock(TransitStockDto stock) {
		return this.stockKey.equals(stock.stockKey);
	}

	public boolean equalsStock(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt, String prodDt) {
		return this.stockKey.equals(new StockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt, prodDt));
	}

	public boolean equalsStock(long clientId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String prodDt) {
		return this.receiveKey.equals(new ReceiveKey(clientId, stockTypeId, depositId, productId, lot, limitDt, prodDt));
	}

	public static StockKey createStockKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt, String prodDt) {
		return new StockKey(clientId, supplierId, stockTypeId, depositId, productId, lot, limitDt, storeDt, prodDt);
	}

	public static ReceiveKey createReceiveKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String prodDt) {
		return new ReceiveKey(clientId, stockTypeId, depositId, productId, lot, limitDt, prodDt);
	}
	//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]

	/**
	 * 積送中在庫を追加する
	 * @param pickingB 加算する出庫ボディ
	 */
	public void addTransitStock(TPickingB pickingB) {
		this.transitNum = WCC.add(this.transitNum, pickingB.getTransitNum());
		this.pickingNum = WCC.add(this.pickingNum, pickingB.getPickingNum());
		transitTPickingBList.add(pickingB);
	}

	/**
	 * @return 積送中数
	 */
	public BigDecimal getTransitNum() {
		return this.transitNum;
	}

	/**
	 * @return 積送中数を加算できる数
	 */
	public BigDecimal getLimitPlusNum() {
		return WCC.subtract(this.pickingNum, this.transitNum);
	}

	/**
	 * @return 積送中数を減算できる数
	 */
	public BigDecimal getLimitMinusNum() {
		return this.transitNum;
	}

	/**
	 * <h2>積送中数を加算する</h2>
	 * <pre>
	 * 出庫ボディ、在庫の積送中数を加算し変更リストに加える
	 * 変更した出庫ボディはgetModifyPickingBListで、
	 * 変更した在庫はgetModifyStockListで取得出来る。
	 * </pre>
	 *
	 * @param transitNum 減算する数
	 */
	public void plusTransitNum(BigDecimal transitNum) {

		if (WCC.isLessThan(this.pickingNum, (WCC.add(this.transitNum, transitNum)))) {
			// システム異常
			throw new IllegalStateException("lack of pickingNum.");
		}

		// 当クラスの積送中数から減算
		this.transitNum = WCC.add(this.transitNum, transitNum);

		// tmpTransitNumを足していく
		BigDecimal tmpTransitNum = transitNum;
		for (TPickingB body : transitTPickingBList) {

			// 積送中数と出庫数の差分
			BigDecimal bodyDiffNum = WCC.subtract(body.getPickingNum(), body.getTransitNum());
			if (WCC.isZeroOrLess(bodyDiffNum)) {
				// これ以上、積送中数に加算できない
				continue;
			}

			// 加算する数
			BigDecimal plusNum = WCC.ZERO;
			if (WCC.isLessThan(bodyDiffNum, tmpTransitNum)) {
				plusNum = bodyDiffNum;
			} else {
				plusNum = tmpTransitNum;
			}

			// 出庫ボディに加算し変更リストに設定
			body.setTransitNum(WCC.add(body.getTransitNum(), plusNum));
			modifyPickingBIdSet.add(body.getPickingBId().longValue());

			// 在庫に加算
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			long stockId = body.getStockId();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			TStock stock;
			if (modifyStockMap.containsKey(stockId)) {
				// 既に変更された在庫のため変更後の在庫を編集
				stock = modifyStockMap.get(stockId);
			} else {
				// 新たに変更する在庫
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				stock = body.getTStock();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				modifyStockMap.put(stockId, stock);
			}
			stock.setTransitNum(WCC.add(stock.getTransitNum(), plusNum));

			// 当処理の残り積送中数から減算
			tmpTransitNum = WCC.subtract(tmpTransitNum, plusNum);
			if (WCC.isZero(tmpTransitNum)) {
				break;
			}
		}

		if (WCC.isNotZero(tmpTransitNum)) {
			// システム異常
			throw new IllegalStateException("lack of pickingNum.");
		}
	}

	/**
	 * <h2>積送中数を減算する</h2>
	 * <pre>
	 * 出庫ボディ、在庫の積送中数を減らし変更リストに加える
	 * 変更した出庫ボディはgetModifyPickingBListで、
	 * 変更した在庫はgetModifyStockListで取得出来る。
	 * </pre>
	 *
	 * @param transitNum 減算する数
	 */
	public void minusTransitNum(BigDecimal transitNum) {

		if (WCC.isLessThan(this.transitNum, transitNum)) {
			// システム異常
			throw new IllegalStateException("lack of transitNum.");
		}

		// 当クラスの積送中数から減算
		this.transitNum = WCC.subtract(this.transitNum, transitNum);

		// tmpTransitNumを減らしていく
		BigDecimal tmpTransitNum = transitNum;
		for (TPickingB body : transitTPickingBList) {
			BigDecimal bodyTransitNum = body.getTransitNum();
			if (WCC.isZero(bodyTransitNum)) {
				continue;
			}

			// 減算する数
			BigDecimal minusNum = WCC.ZERO;
			if (WCC.isLessThan(bodyTransitNum, tmpTransitNum)) {
				minusNum = bodyTransitNum;
			} else {
				minusNum = tmpTransitNum;
			}

			// 出庫ボディから減算し変更リストに設定
			body.setTransitNum(WCC.subtract(bodyTransitNum, minusNum));
			modifyPickingBIdSet.add(body.getPickingBId().longValue());

			// 在庫から減算
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			long stockId = body.getStockId();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			TStock stock;
			if (modifyStockMap.containsKey(stockId)) {
				// 既に変更された在庫のため変更後の在庫を編集
				stock = modifyStockMap.get(stockId);
			} else {
				// 新たに変更する在庫
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				stock = body.getTStock();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
				modifyStockMap.put(stockId, stock);
			}
			stock.setTransitNum(WCC.subtract(stock.getTransitNum(), minusNum));

			// 当処理の残り積送中数から減算
			tmpTransitNum = WCC.subtract(tmpTransitNum, minusNum);
			if (WCC.isZero(tmpTransitNum)) {
				break;
			}
		}

		if (WCC.isNotZero(tmpTransitNum)) {
			// システム異常
			throw new IllegalStateException("lack of transitNum.");
		}
	}

	/**
	 * 変更した出庫ボディのリストを返却
	 * @return 変更出庫ボディリスト
	 */
	public List<TPickingB> getModifyPickingBList() {

		List<TPickingB> list = new ArrayList<TPickingB>();
		for (TPickingB body : transitTPickingBList) {
			long id = body.getPickingBId();
			if (modifyPickingBIdSet.contains(id)) {
				list.add(body);
			}
		}
		return list;
	}

	/**
	 * 変更した在庫のリストを取得する
	 */
	public List<TStock> getModifyStockList() {
		List<TStock> list = new ArrayList<TStock>();
		list.addAll(modifyStockMap.values());
		return list;
	}

	/**
	 * 変更リストを空にする
	 */
	public void clearModifyList() {
		modifyPickingBIdSet.clear();
		modifyStockMap.clear();
	}

	/**
	 * @return clientId
	 */
	public long getClientId() {
		return stockKey.clientId;
	}

	/**
	 * @return supplierId
	 */
	public Long getSupplierId() {
		return stockKey.supplierId;
	}

	/**
	 * @return stockTypeId
	 */
	public long getStockTypeId() {
		return stockKey.stockTypeId;
	}

	/**
	 * @return depositId
	 */
	public long getDepositId() {
		return stockKey.depositId;
	}

	/**
	 * @return productId
	 */
	public long getProductId() {
		return stockKey.productId;
	}

	/**
	 * @return lot
	 */
	public String getLot() {
		return stockKey.lot;
	}

	/**
	 * @return limitDt
	 */
	public String getLimitDt() {
		return stockKey.limitDt;
	}

//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
	/**
	 * @return prodDt
	 */
	public String getProdDt() {
		return stockKey.prodDt;
	}
//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

	/**
	 * @return storeDt
	 */
	public String getStoreDt() {
		return stockKey.storeDt;
	}

	public static class StockKey {

		private long clientId;
		private Long supplierId;
		private long stockTypeId;
		private long depositId;
		private long productId;
		private String lot;
		private String limitDt;
		private String storeDt;

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
		private String prodDt;

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]


		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//		private StockKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt) {
		private StockKey(long clientId, Long supplierId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String storeDt, String prodDt) {
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
			this.clientId = clientId;
			this.supplierId = supplierId;
			this.stockTypeId = stockTypeId;
			this.depositId = depositId;
			this.productId = productId;
			this.lot = lot;
			this.limitDt = limitDt;
			this.storeDt = storeDt;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			this.prodDt = prodDt;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (clientId ^ (clientId >>> 32));
			result = prime * result + (int) (depositId ^ (depositId >>> 32));
			result = prime * result + ((limitDt == null) ? 0 : limitDt.hashCode());
			result = prime * result + ((lot == null) ? 0 : lot.hashCode());
			result = prime * result + (int) (productId ^ (productId >>> 32));
			result = prime * result + (int) (stockTypeId ^ (stockTypeId >>> 32));
			result = prime * result + ((storeDt == null) ? 0 : storeDt.hashCode());
			result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			result = prime * result + ((prodDt == null) ? 0 : prodDt.hashCode());
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

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
			StockKey other = (StockKey) obj;
			if (clientId != other.clientId)
				return false;
			if (depositId != other.depositId)
				return false;
			if (limitDt == null) {
				if (other.limitDt != null)
					return false;
			} else if (!limitDt.equals(other.limitDt))
				return false;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			if (prodDt == null) {
				if (other.prodDt != null)
					return false;
			} else if (!prodDt.equals(other.prodDt))
				return false;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]
			if (lot == null) {
				if (other.lot != null)
					return false;
			} else if (!lot.equals(other.lot))
				return false;
			if (productId != other.productId)
				return false;
			if (stockTypeId != other.stockTypeId)
				return false;
			if (storeDt == null) {
				if (other.storeDt != null)
					return false;
			} else if (!storeDt.equals(other.storeDt))
				return false;
			if (supplierId == null) {
				if (other.supplierId != null)
					return false;
			} else if (!supplierId.equals(other.supplierId))
				return false;
			return true;
		}
	}

	public static class ReceiveKey {

		private long clientId;
		private long stockTypeId;
		private long depositId;
		private long productId;
		private String lot;
		private String limitDt;
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
		private String prodDt;
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [S]
//		private ReceiveKey(long clientId, long stockTypeId, long depositId, long productId, String lot, String limitDt) {
		private ReceiveKey(long clientId, long stockTypeId, long depositId, long productId, String lot, String limitDt, String prodDt) {
		//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Mod [E]
			this.clientId = clientId;
			this.stockTypeId = stockTypeId;
			this.depositId = depositId;
			this.productId = productId;
			this.lot = lot;
			this.limitDt = limitDt;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			this.prodDt = prodDt;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]
		}

		/* (非 Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (clientId ^ (clientId >>> 32));
			result = prime * result + (int) (depositId ^ (depositId >>> 32));
			result = prime * result + ((limitDt == null) ? 0 : limitDt.hashCode());
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			result = prime * result + ((prodDt == null) ? 0 : prodDt.hashCode());
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]
			result = prime * result + ((lot == null) ? 0 : lot.hashCode());
			result = prime * result + (int) (productId ^ (productId >>> 32));
			result = prime * result + (int) (stockTypeId ^ (stockTypeId >>> 32));
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
			ReceiveKey other = (ReceiveKey) obj;
			if (clientId != other.clientId)
				return false;
			if (depositId != other.depositId)
				return false;
			if (limitDt == null) {
				if (other.limitDt != null)
					return false;
			} else if (!limitDt.equals(other.limitDt))
				return false;

			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [S]
			if (prodDt == null) {
				if (other.prodDt != null)
					return false;
			} else if (!prodDt.equals(other.prodDt))
				return false;
			//ミドリ安全様向けカスタマイズ対応 製造日追加 入荷日をロットに移動 2024.06.18 ma.omori.gf Add [E]

			if (lot == null) {
				if (other.lot != null)
					return false;
			} else if (!lot.equals(other.lot))
				return false;
			if (productId != other.productId)
				return false;
			if (stockTypeId != other.stockTypeId)
				return false;
			return true;
		}
	}
}
