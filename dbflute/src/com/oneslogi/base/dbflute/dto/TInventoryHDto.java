package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTInventoryHDto;

/**
 * The entity of T_INVENTORY_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryHDto extends BsTInventoryHDto {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** 棚卸日(From) */
    private String inventoryDtFrom;

    /** 棚卸日(To) */
    private String inventoryDtTo;

	/**
	 * @return inventoryDtFrom
	 */
	public String getInventoryDtFrom() {
		return inventoryDtFrom;
	}

	// ===== 以下Eclipse自動生成のアクセサメソッド =====

	/**
	 * @param inventoryDtFrom セットする inventoryDtFrom
	 */
	public void setInventoryDtFrom(String inventoryDtFrom) {
		this.inventoryDtFrom = inventoryDtFrom;
	}

	/**
	 * @return inventoryDtTo
	 */
	public String getInventoryDtTo() {
		return inventoryDtTo;
	}

	/**
	 * @param inventoryDtTo セットする inventoryDtTo
	 */
	public void setInventoryDtTo(String inventoryDtTo) {
		this.inventoryDtTo = inventoryDtTo;
	}

    /** 棚卸帳票発行区分 */
    private String inventoryPrintType;
    
    /** 棚卸リスト発行区分 */
    private String inventoryListPrintType;
    
    /** 棚卸差異 */
    private String inventoryDiff;
    
    /** 差異金額非表示 */
    private String diffPriceHiddenFlg;
    
    /** 棚卸担当者 */
    private String inventoryUserCd;
    
    /** 棚卸指示日 */
    private String inventoryInstDt;
    
    /** 棚卸担当者名称 */
    private String userNm;
    
	public String getInventoryPrintType() {
		return inventoryPrintType;
	}

	public void setInventoryPrintType(String inventoryPrintType) {
		this.inventoryPrintType = inventoryPrintType;
	}

	public String getInventoryListPrintType() {
		return inventoryListPrintType;
	}

	public void setInventoryListPrintType(String inventoryListPrintType) {
		this.inventoryListPrintType = inventoryListPrintType;
	}

	public String getInventoryDiff() {
		return inventoryDiff;
	}

	public void setInventoryDiff(String inventoryDiff) {
		this.inventoryDiff = inventoryDiff;
	}

	public String getDiffPriceHiddenFlg() {
		return diffPriceHiddenFlg;
	}

	public void setDiffPriceHiddenFlg(String diffPriceHiddenFlg) {
		this.diffPriceHiddenFlg = diffPriceHiddenFlg;
	}

	public String getInventoryUserCd() {
		return inventoryUserCd;
	}

	public void setInventoryUserCd(String inventoryUserCd) {
		this.inventoryUserCd = inventoryUserCd;
	}

	public String getInventoryInstDt() {
		return inventoryInstDt;
	}

	public void setInventoryInstDt(String inventoryInstDt) {
		this.inventoryInstDt = inventoryInstDt;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

}
