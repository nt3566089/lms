package com.oneslogi.wms.core.logic.shipping;

class StockAllocateSKU {

	private long productId;
	private long stockTypeId;
	private long depositId;

	private StockAllocateSKU() {
	}

	private StockAllocateSKU(Builder builder) {
		productId = builder.productId;
		stockTypeId = builder.stockTypeId;
		depositId = builder.depositId;
	}

	static ProductBuilder builder() {
		return new Builder();
	}

	static interface ProductBuilder {
		StockTypeBuilder productId(long productId);
	}

	static interface StockTypeBuilder {
		DepositBuilder stockTypeId(long stockTypeId);
	}

	static interface DepositBuilder {
		Builder depositId(long depositId);
	}

	static class Builder implements ProductBuilder, StockTypeBuilder, DepositBuilder {

		private long productId;
		private long stockTypeId;
		private long depositId;

		private Builder() {
		}

		@Override
		public StockTypeBuilder productId(long productId) {
			this.productId = productId;
			return this;
		}

		@Override
		public DepositBuilder stockTypeId(long stockTypeId) {
			this.stockTypeId = stockTypeId;
			return this;
		}

		@Override
		public Builder depositId(long depositId) {
			this.depositId = depositId;
			return this;
		}

		StockAllocateSKU build() {
			return new StockAllocateSKU(this);
		}
	}

	// ===== 以下、ゲッタ
	/**
	 * @return productId
	 */
	long getProductId() {
		return productId;
	}

	/**
	 * @return stockTypeId
	 */
	long getStockTypeId() {
		return stockTypeId;
	}

	/**
	 * @return depositId
	 */
	long getDepositId() {
		return depositId;
	}

	// ===== 以下、ハッシュコード(自動生成)

	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (depositId ^ (depositId >>> 32));
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
		StockAllocateSKU other = (StockAllocateSKU) obj;
		if (depositId != other.depositId)
			return false;
		if (productId != other.productId)
			return false;
		if (stockTypeId != other.stockTypeId)
			return false;
		return true;
	}
}
