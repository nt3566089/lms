package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class PieceTotalPickingListDto extends ReportDto {

	/** ピッキンググループNo. */
	private String pickingGroupNo;
	/** 在庫区分CD */
	private String stockTypeCd;
	/** 出庫指示バッチNo */
	private String pickingBatchNo;
	/** ゾーンCD */
	private String zoneCd;
	/** 再発行マーク */
	private String nizoroeOutFlg;
	/** 帳票発行日時 */
	private String nizoroeOutDt;
	/** センタCd */
	private String centerCd;
	/** センタ略称 */
	private String centerAbbr;
	/** 作業予定日 */
	private String workDt;
	/** 出荷区分 */
	private String shippingTypeNm;
	/** 代表荷揃番号 */
	private String daihyoNizoroeNo2;
	/** 代表荷揃番号(バーコード) */
	private String daihyoNizoroeNoBarCd;
	/** 代表荷揃番号ハイフンなし */
	private String daihyoNizoroeNo;
	/** 得意先Cd */
	private String accountCd;
	/** 得意先名称 */
	private String customerNm;
	/** 商品CD */
	private String productCd;
	/** 商品略称 */
	private String productAbbr;
	/** JANCD */
	private String janCd;
	/** 製造日 */
	private String prodDt;
	/** 期限日 */
	private String limitDt;
	/** 入荷日 */
	private String receiveDt;
	/** ロット */
	private String lot;
	/** ロケ */
	private String locationNm;
	/** 数量 */
	private BigDecimal pickingNum;
	/** 単位 */
	private String unitNm;
	// ミドリ安全様向けカスタマイズ対応 荷揃表発行の属性追加 2024.07.18 苗 Add [S]
	/** 出荷区分CD */
	private String shippingTypeCd;
	/** ピッキングパターンCD */
	private String pickingPaternCd;
	// ミドリ安全様向けカスタマイズ対応 荷揃表発行の属性追加 2024.07.18 苗 Add [E]
	public String getPickingGroupNo() {
		return pickingGroupNo;
	}
	public void setPickingGroupNo(String pickingGroupNo) {
		this.pickingGroupNo = pickingGroupNo;
	}
	public String getStockTypeCd() {
		return stockTypeCd;
	}
	public void setStockTypeCd(String stockTypeCd) {
		this.stockTypeCd = stockTypeCd;
	}
	public String getPickingBatchNo() {
		return pickingBatchNo;
	}
	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getNizoroeOutFlg() {
		return nizoroeOutFlg;
	}
	public void setNizoroeOutFlg(String nizoroeOutFlg) {
		this.nizoroeOutFlg = nizoroeOutFlg;
	}
	public String getNizoroeOutDt() {
		return nizoroeOutDt;
	}
	public void setNizoroeOutDt(String nizoroeOutDt) {
		this.nizoroeOutDt = nizoroeOutDt;
	}
	public String getCenterCd() {
		return centerCd;
	}
	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}
	public String getCenterAbbr() {
		return centerAbbr;
	}
	public void setCenterAbbr(String centerAbbr) {
		this.centerAbbr = centerAbbr;
	}
	public String getWorkDt() {
		return workDt;
	}
	public void setWorkDt(String workDt) {
		this.workDt = workDt;
	}
	public String getShippingTypeNm() {
		return shippingTypeNm;
	}
	public void setShippingTypeNm(String shippingTypeNm) {
		this.shippingTypeNm = shippingTypeNm;
	}
	public String getDaihyoNizoroeNo2() {
		return daihyoNizoroeNo2;
	}
	public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
		this.daihyoNizoroeNo2 = daihyoNizoroeNo2;
	}
	public String getDaihyoNizoroeNoBarCd() {
		return daihyoNizoroeNoBarCd;
	}
	public void setDaihyoNizoroeNoBarCd(String daihyoNizoroeNoBarCd) {
		this.daihyoNizoroeNoBarCd = daihyoNizoroeNoBarCd;
	}
	public String getDaihyoNizoroeNo() {
		return daihyoNizoroeNo;
	}
	public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
		this.daihyoNizoroeNo = daihyoNizoroeNo;
	}
	public String getAccountCd() {
		return accountCd;
	}
	public void setAccountCd(String accountCd) {
		this.accountCd = accountCd;
	}
	public String getCustomerNm() {
		return customerNm;
	}
	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getProductAbbr() {
		return productAbbr;
	}
	public void setProductAbbr(String productAbbr) {
		this.productAbbr = productAbbr;
	}
	public String getJanCd() {
		return janCd;
	}
	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}
	public String getProdDt() {
		return prodDt;
	}
	public void setProdDt(String prodDt) {
		this.prodDt = prodDt;
	}
	public String getLimitDt() {
		return limitDt;
	}
	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}
	public String getReceiveDt() {
		return receiveDt;
	}
	public void setReceiveDt(String receiveDt) {
		this.receiveDt = receiveDt;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getLocationNm() {
		return locationNm;
	}
	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}
	public BigDecimal getPickingNum() {
		return pickingNum;
	}
	public void setPickingNum(BigDecimal pickingNum) {
		this.pickingNum = pickingNum;
	}
	public String getUnitNm() {
		return unitNm;
	}
	public void setUnitNm(String unitNm) {
		this.unitNm = unitNm;
	}
	// ミドリ安全様向けカスタマイズ対応 バラ荷揃表の属性追加 2024.07.18 苗 Add [S]
	public String getPickingPaternCd() {
		return pickingPaternCd;
	}
	public void setPickingPaternCd(String pickingPaternCd) {
		this.pickingPaternCd = pickingPaternCd;
	}
	public String getShippingTypeCd() {
		return shippingTypeCd;
	}
	public void setShippingTypeCd(String shippingTypeCd) {
		this.shippingTypeCd = shippingTypeCd;
	}
	// ミドリ安全様向けカスタマイズ対応 バラ荷揃表の属性追加 2024.07.18 苗 Add [E]

}
