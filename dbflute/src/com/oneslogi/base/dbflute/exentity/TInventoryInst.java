package com.oneslogi.base.dbflute.exentity;

import java.math.BigDecimal;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsentity.BsTInventoryInst;

/**
 * The entity of T_INVENTORY_INST.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInst extends BsTInventoryInst {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** ピース差異 */
    private BigDecimal pieceQty;

    /** ケース差異 */
    private Long caseQty;

    /** 差異数(以上) */
    private BigDecimal diffQtyUp;

    /** 比較条件 */
    private String inventoryLocationProduct;

	/** ロケーション名称 FROM*/
	private String fromLocationNm;

	/** ロケーション名称 TO*/
	private String toLocationNm;

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

	/** 棚卸データ有 */
    private String stockTakingInput;

    /** アンマッチ有 */
	private String unmatch;

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
     * $0: 棚卸データ無し
     */
    public boolean isStockTakingInput$0() {
        CDef.StockTakingInput cdef = CDef.StockTakingInput.codeOf(getStockTakingInput());
        return cdef != null ? cdef.equals(CDef.StockTakingInput.$0) : false;
    }

    /**
     * $1: 棚卸データ有のみ
     */
    public boolean isStockTakingInput$1() {
        CDef.StockTakingInput cdef = CDef.StockTakingInput.codeOf(getStockTakingInput());
        return cdef != null ? cdef.equals(CDef.StockTakingInput.$1) : false;
    }

    /**
     * $0: アンマッチ無し
     */
    public boolean isUnmatch$0() {
    	// [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang start
    	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
        CDef.Unmatch cdef = CDef.Unmatch.codeOf(getUnmatch());
        return cdef != null ? cdef.equals(CDef.Unmatch.$0) : false;
        // [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang end
    }

    /**
     * $1: アンマッチ有のみ
     */
    public boolean isUnmatch$1() {
    	// [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang start
        CDef.Unmatch cdef = CDef.Unmatch.codeOf(getUnmatch());
        return cdef != null ? cdef.equals(CDef.Unmatch.$1) : false;
        // [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
        // [ON推-CT2-449] DFPROP変更 2014.11.25 xiazhang end
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
