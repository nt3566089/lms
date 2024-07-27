package com.oneslogi.wms.core.logic.stockupdate;

/**
 * 在庫検索ロジックで使用する検索条件。(ロット検索メソッドのパラメータとして使用)
 */
public final class StockSelectLotCondition {
	private long clientId;
	private long productId;
	private long stockTypeId;
	private long locationId;
	private long depositId;
	private long lotId;
	private long shapeId;
	private boolean isSetStoreDt;
	private String storeDt;
	private boolean joinStoreNo;
	// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start
	private boolean selectMerge;
	// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End
	// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
	private boolean forcedMerge;

	// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End

	private StockSelectLotCondition() {
	}

	private StockSelectLotCondition(Builder builder) {
		clientId = builder.clientId;
		productId = builder.productId;
		stockTypeId = builder.stockTypeId;
		locationId = builder.locationId;
		depositId = builder.depositId;
		lotId = builder.lotId;
		shapeId = builder.shapeId;
		storeDt = builder.storeDt;
		joinStoreNo = builder.joinStoreNo;
		isSetStoreDt = builder.isSetStoreDt;
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start
		selectMerge = builder.selectMerge;
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End
		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
		forcedMerge = builder.forcedMerge;
		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End
	}

	public static ClientBuilder builder() {
		return new Builder();
	}

	public static interface ClientBuilder {
		ProductBuilder clientId(long clientId);
	}

	public static interface ProductBuilder {
		StockTypeBuilder productId(long productId);
	}

	public static interface StockTypeBuilder {
		LocationBuilder stockTypeId(long stockTypeId);
	}

	public static interface LocationBuilder {
		DepositBuilder locationId(long locationId);
	}

	public static interface DepositBuilder {
		LotBuilder depositId(long depositId);
	}

	public static interface LotBuilder {
		ShapeBuilder lotId(long lotId);
	}

	public static interface ShapeBuilder {
		Builder shapeId(long shapeId);
	}

	/**
	 * 本クラスのビルダ
	 */
	public static class Builder implements ClientBuilder, ProductBuilder, StockTypeBuilder, LocationBuilder, DepositBuilder, LotBuilder, ShapeBuilder {

		private long clientId;
		private long productId;
		private long stockTypeId;
		private long locationId;
		private long depositId;
		private long lotId;
		private long shapeId;
		private boolean isSetStoreDt = false;
		private String storeDt;
		private boolean joinStoreNo = false;
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start
		private boolean selectMerge = false;
		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End
		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
		private boolean forcedMerge = false;

		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End

		private Builder() {
		}

		@Override
		public ProductBuilder clientId(long clientId) {
			this.clientId = clientId;
			return this;
		}

		@Override
		public StockTypeBuilder productId(long productId) {
			this.productId = productId;
			return this;
		}

		@Override
		public LocationBuilder stockTypeId(long stockTypeId) {
			this.stockTypeId = stockTypeId;
			return this;
		}

		@Override
		public DepositBuilder locationId(long locationId) {
			this.locationId = locationId;
			return this;
		}

		@Override
		public LotBuilder depositId(long depositId) {
			this.depositId = depositId;
			return this;
		}

		@Override
		public ShapeBuilder lotId(long lotId) {
			this.lotId = lotId;
			return this;
		}

		@Override
		public Builder shapeId(long shapeId) {
			this.shapeId = shapeId;
			return this;
		}

		public Builder storeDt(String storeDt) {
			this.isSetStoreDt = true;
			this.storeDt = storeDt;
			return this;
		}

		public Builder joinStoreNo(boolean joinStoreNo) {
			this.joinStoreNo = joinStoreNo;
			return this;
		}

		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana Start
		public Builder selectMerge(boolean selectMerge) {
			this.selectMerge = selectMerge;
			return this;
		}

		// [ON推-品向-1055] マージ先在庫の検索条件に移動中数、引当済数を追加 2016.04.07 kawana End

		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana Start
		public Builder forcedMerge(boolean forcedMerge) {
			this.forcedMerge = forcedMerge;
			return this;
		}

		// [ON推-品向-1169] 在庫移動先が複数件ある場合は、引当可能数の多い在庫にマージ 2016.07.04 kawana End

		public StockSelectLotCondition build() {
			return new StockSelectLotCondition(this);
		}
	}

	// ===== 以下、ゲッタ

	public long getClientId() {
		return clientId;
	}

	public long getProductId() {
		return productId;
	}

	public long getStockTypeId() {
		return stockTypeId;
	}

	public long getLocationId() {
		return locationId;
	}

	public long getDepositId() {
		return depositId;
	}

	public long getLotId() {
		return lotId;
	}

	public long getShapeId() {
		return shapeId;
	}

	public boolean isSetStoreDt() {
		return isSetStoreDt;
	}

	public String getStoreDt() {
		return storeDt;
	}

	public boolean isJoinStoreNo() {
		return joinStoreNo;
	}

	public boolean isSelectMerge() {
		return selectMerge;
	}

	public boolean isForcedMerge() {
		return forcedMerge;
	}
}
