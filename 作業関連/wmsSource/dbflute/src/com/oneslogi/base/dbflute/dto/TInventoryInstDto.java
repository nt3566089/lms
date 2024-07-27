package com.oneslogi.base.dbflute.dto;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryInstDto;

/**
 * The entity of T_INVENTORY_INST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstDto extends BsTInventoryInstDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

	// ===== 検索条件 =====

    /** ピース差異 */
    private BigDecimal pieceQty;

    /** ケース差異 */
    private Long caseQty;

    /** 差異数(以上) */
    private BigDecimal diffQtyUp;

    /** 比較条件 */
    private String inventoryLocationProduct;

    /** 棚卸データ有 */
    private String stockTakingInput;

    /** アンマッチ有 */
	private String unmatch;

	/** ロケーション名称 FROM*/
	private String fromLocationNm;

	/** ロケーション名称 TO*/
	private String toLocationNm;

	// ===== 以下Eclipse自動生成のアクセサメソッド =====


	/**
	 * @return pieceQty ピース差異
	 */
	public BigDecimal getPieceQty() {
		return pieceQty;
	}

	/**
	 * @param pieceQty セットする ピース差異
	 */
	public void setPieceQty(BigDecimal pieceQty) {
		this.pieceQty = pieceQty;
	}

	/**
	 * @return diffQtyUp 差異数(以上)
	 */
	public BigDecimal getDiffQtyUp() {
		return diffQtyUp;
	}

	/**
	 * @param pieceQty セットする 差異数(以上)
	 */
	public void setDiffQtyUp(BigDecimal diffQtyUp) {
		this.diffQtyUp = diffQtyUp;
	}
	/**
	 * @return caseQty ケース差異
	 */
	public Long getCaseQty() {
		return caseQty;
	}

	/**
	 * @param caseQty セットする ケース差異
	 */
	public void setCaseQty(Long caseQty) {
		this.caseQty = caseQty;
	}

	/**
	 * @return inventoryLocationProduct
	 */
	public String getInventoryLocationProduct() {
		return inventoryLocationProduct;
	}

	/**
	 * @param inventoryLocationProduct セットする inventoryLocationProduct
	 */
	public void setInventoryLocationProduct(String inventoryLocationProduct) {
		this.inventoryLocationProduct = inventoryLocationProduct;
	}

	/**
	 * @return stockTakingInput 棚卸データ有
	 */
	public String getStockTakingInput() {
		return stockTakingInput;
	}

	/**
	 * @param stockTakingInput 棚卸データ有
	 */
	public void setStockTakingInput(String stockTakingInput) {
		this.stockTakingInput = stockTakingInput;
	}

	/**
	 * @return unmatch アンマッチ有
	 */
	public String getUnmatch() {
		return unmatch;
	}

	/**
	 * @param unmatch アンマッチ有
	 */
	public void setUnmatch(String unmatch) {
		this.unmatch = unmatch;
	}

	/**
	 * @return fromLocationNm ロケーション名称 FROM
	 */
	public String getFromLocationNm() {
		return fromLocationNm;
	}

	/**
	 * @param fromLocationNm ロケーション名称 FROM
	 */
	public void setFromLocationNm(String fromLocationNm) {
		this.fromLocationNm = fromLocationNm;
	}

	/**
	 * @return toLocationNm ロケーション名称 TO
	 */
	public String getToLocationNm() {
		return toLocationNm;
	}

	/**
	 * @param toLocationNm ロケーション名称 TO
	 */
	public void setToLocationNm(String toLocationNm) {
		this.toLocationNm = toLocationNm;
	}

}
