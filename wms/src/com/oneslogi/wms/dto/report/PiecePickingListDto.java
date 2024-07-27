package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

public class PiecePickingListDto extends ReportDto {

	/** オーダーID */
	private String orderId;
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
	/** 配達指定日 */
	private String specifyDeliveryDt;
	/** 曜日、休日 */
	private String holidays;
	/** 荷揃番号 */
	private String nizoroeNo2;
	/** 荷揃番号(バーコード) */
	private String nizoroeNoBarCd;
	/** 荷揃番号 */
	private String nizoroeNo;
	/** 運送便Cd */
	private String deliveryCourseCd;
	/** 運送便名称 */
	private String deliveryCourseNm;
	/** 送り先 */
	private String delivZipCd;
	/** 届先住所1 */
	private String delivAddress1;
	/** 届先住所2 */
	private String delivAddress2;
	/** 届先名称1 */
	private String delivCustomerNm1;
	/** 届先名称2 */
	private String delivCustomerNm2;
	/** 取扱部門 */
	private String salesOrgCd;
	/** 店販社名称１ */
	private String tenhanshaNm1;
	/** 店販社名称２ */
	private String tenhanshaNm2;
	/** 店販社住所１ */
	private String tenhanshaAddress1;
	/** 店販社住所２ */
	private String tenhanshaAddress2;
	/** 商品CD */
	private String productCd;
	/** 商品名称 */
	private String productNm;
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
	private Long pickedNum;
	/** 単位 */
	private String unitNm;
	// ミドリ安全様向けカスタマイズ対応 荷揃表発行の属性追加 2024.07.18 苗 Add [S]
	/** 出荷区分CD */
	private String shippingTypeCd;
	/** ピッキングパターンCD */
	private String pickingPaternCd;
	// ミドリ安全様向けカスタマイズ対応 荷揃表発行の属性追加 2024.07.18 苗 Add [E]
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getSpecifyDeliveryDt() {
		return specifyDeliveryDt;
	}
	public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
		this.specifyDeliveryDt = specifyDeliveryDt;
	}
	public String getHolidays() {
		return holidays;
	}
	public void setHolidays(String holidays) {
		this.holidays = holidays;
	}
	public String getNizoroeNo2() {
		return nizoroeNo2;
	}
	public void setNizoroeNo2(String nizoroeNo2) {
		this.nizoroeNo2 = nizoroeNo2;
	}
	public String getNizoroeNoBarCd() {
		return nizoroeNoBarCd;
	}
	public void setNizoroeNoBarCd(String nizoroeNoBarCd) {
		this.nizoroeNoBarCd = nizoroeNoBarCd;
	}
	public String getNizoroeNo() {
		return nizoroeNo;
	}
	public void setNizoroeNo(String nizoroeNo) {
		this.nizoroeNo = nizoroeNo;
	}
	public String getDeliveryCourseCd() {
		return deliveryCourseCd;
	}
	public void setDeliveryCourseCd(String deliveryCourseCd) {
		this.deliveryCourseCd = deliveryCourseCd;
	}
	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}
	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}
	public String getDelivZipCd() {
		return delivZipCd;
	}
	public void setDelivZipCd(String delivZipCd) {
		this.delivZipCd = delivZipCd;
	}
	public String getDelivAddress1() {
		return delivAddress1;
	}
	public void setDelivAddress1(String delivAddress1) {
		this.delivAddress1 = delivAddress1;
	}
	public String getDelivAddress2() {
		return delivAddress2;
	}
	public void setDelivAddress2(String delivAddress2) {
		this.delivAddress2 = delivAddress2;
	}
	public String getDelivCustomerNm1() {
		return delivCustomerNm1;
	}
	public void setDelivCustomerNm1(String delivCustomerNm1) {
		this.delivCustomerNm1 = delivCustomerNm1;
	}
	public String getDelivCustomerNm2() {
		return delivCustomerNm2;
	}
	public void setDelivCustomerNm2(String delivCustomerNm2) {
		this.delivCustomerNm2 = delivCustomerNm2;
	}
	public String getSalesOrgCd() {
		return salesOrgCd;
	}
	public void setSalesOrgCd(String salesOrgCd) {
		this.salesOrgCd = salesOrgCd;
	}
	public String getTenhanshaNm1() {
		return tenhanshaNm1;
	}
	public void setTenhanshaNm1(String tenhanshaNm1) {
		this.tenhanshaNm1 = tenhanshaNm1;
	}
	public String getTenhanshaNm2() {
		return tenhanshaNm2;
	}
	public void setTenhanshaNm2(String tenhanshaNm2) {
		this.tenhanshaNm2 = tenhanshaNm2;
	}
	public String getTenhanshaAddress1() {
		return tenhanshaAddress1;
	}
	public void setTenhanshaAddress1(String tenhanshaAddress1) {
		this.tenhanshaAddress1 = tenhanshaAddress1;
	}
	public String getTenhanshaAddress2() {
		return tenhanshaAddress2;
	}
	public void setTenhanshaAddress2(String tenhanshaAddress2) {
		this.tenhanshaAddress2 = tenhanshaAddress2;
	}
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
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
	public Long getPickedNum() {
		return pickedNum;
	}
	public void setPickedNum(Long pickedNum) {
		this.pickedNum = pickedNum;
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
