package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class TagLabelCommonDto extends ReportDto {

	/** （荷札）運送便名称 */
	private String deliveryCourseNm;
	/** （荷札）着店CD（バーコード */
	private String arrivalStoreCdBarCode;
	/** （荷札）着店CD1 */
	private String arrivalStoreCd1;
	/** （荷札）着店CD2 */
	private String arrivalStoreCd2;
	/** （荷札）問合せ番号（バーコード） */
	private String trackingNoBarCode;
	/** （荷札）問合せ番号 */
	private String trackingNo;
	/** （荷札）住所 */
	private String slipClientAddress;
	/** （荷札）名称 */
	private String slipClientNm;
	/** （荷札）電話番号 */
	private String slipClientTelNo;
	/** （荷札）問合せ部門 */
	private String salesOrgCd;
	/** （荷札）問合せ部門電話番号 */
	private String salesOrgTel;
	/** （荷札）出荷日2 */
	private String workDt;
	/** （荷札）お届け先：住所 */
	private String delivAddress;
	/** （荷札）お届け先：名称 */
	private String delivCustomerNm;
	/** （荷札）発注区分 */
	private String shippingTypeCd;
	/** （荷札）部門*/
	private String department;
	/** （荷札）お届け先：電話番号 */
	private String delivTelNo;
	/** （荷札）摘要 */
	private String invoiceSummary;
	/** （荷札）荷揃番号（バーコード） */
	private String nizoroeNoBarCode;
	/** （荷札）箱番号 */
	private String boxNo;
	/** （荷札）荷揃番号 */
	private String nizoroeNo;
	/** （荷札）指定配達日2 */
	private String delivDt;
	/** （荷札）配達時間2 */
	private String delivTz;
	/** （荷札）金額2 */
	public BigDecimal codFee;
	/** （荷札）ソータ用番号（バーコード） */
	private String sorterNoBarCode;
	/** （荷札）ソータ用番号 */
	private String sorterNo;
	/** （荷札）再発行マーク */
	private String tagOutFlg;
	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}
	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}
	public String getArrivalStoreCdBarCode() {
		return arrivalStoreCdBarCode;
	}
	public void setArrivalStoreCdBarCode(String arrivalStoreCdBarCode) {
		this.arrivalStoreCdBarCode = arrivalStoreCdBarCode;
	}
	public String getArrivalStoreCd1() {
		return arrivalStoreCd1;
	}
	public void setArrivalStoreCd1(String arrivalStoreCd1) {
		this.arrivalStoreCd1 = arrivalStoreCd1;
	}
	public String getArrivalStoreCd2() {
		return arrivalStoreCd2;
	}
	public void setArrivalStoreCd2(String arrivalStoreCd2) {
		this.arrivalStoreCd2 = arrivalStoreCd2;
	}
	public String getTrackingNoBarCode() {
		return trackingNoBarCode;
	}
	public void setTrackingNoBarCode(String trackingNoBarCode) {
		this.trackingNoBarCode = trackingNoBarCode;
	}
	public String getTrackingNo() {
		return trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}
	public String getSlipClientAddress() {
		return slipClientAddress;
	}
	public void setSlipClientAddress(String slipClientAddress) {
		this.slipClientAddress = slipClientAddress;
	}
	public String getSlipClientNm() {
		return slipClientNm;
	}
	public void setSlipClientNm(String slipClientNm) {
		this.slipClientNm = slipClientNm;
	}
	public String getSlipClientTelNo() {
		return slipClientTelNo;
	}
	public void setSlipClientTelNo(String slipClientTelNo) {
		this.slipClientTelNo = slipClientTelNo;
	}
	public String getSalesOrgCd() {
		return salesOrgCd;
	}
	public void setSalesOrgCd(String salesOrgCd) {
		this.salesOrgCd = salesOrgCd;
	}
	public String getSalesOrgTel() {
		return salesOrgTel;
	}
	public void setSalesOrgTel(String salesOrgTel) {
		this.salesOrgTel = salesOrgTel;
	}
	public String getWorkDt() {
		return workDt;
	}
	public void setWorkDt(String workDt) {
		this.workDt = workDt;
	}
	public String getDelivAddress() {
		return delivAddress;
	}
	public void setDelivAddress(String delivAddress) {
		this.delivAddress = delivAddress;
	}
	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}
	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}
	public String getShippingTypeCd() {
		return shippingTypeCd;
	}
	public void setShippingTypeCd(String shippingTypeCd) {
		this.shippingTypeCd = shippingTypeCd;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDelivTelNo() {
		return delivTelNo;
	}
	public void setDelivTelNo(String delivTelNo) {
		this.delivTelNo = delivTelNo;
	}
	public String getInvoiceSummary() {
		return invoiceSummary;
	}
	public void setInvoiceSummary(String invoiceSummary) {
		this.invoiceSummary = invoiceSummary;
	}
	public String getNizoroeNoBarCode() {
		return nizoroeNoBarCode;
	}
	public void setNizoroeNoBarCode(String nizoroeNoBarCode) {
		this.nizoroeNoBarCode = nizoroeNoBarCode;
	}
	public String getBoxNo() {
		return boxNo;
	}
	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}
	public String getNizoroeNo() {
		return nizoroeNo;
	}
	public void setNizoroeNo(String nizoroeNo) {
		this.nizoroeNo = nizoroeNo;
	}
	public String getDelivDt() {
		return delivDt;
	}
	public void setDelivDt(String delivDt) {
		this.delivDt = delivDt;
	}
	public String getDelivTz() {
		return delivTz;
	}
	public void setDelivTz(String delivTz) {
		this.delivTz = delivTz;
	}
	public BigDecimal getCodFee() {
		return codFee;
	}
	public void setCodFee(BigDecimal codFee) {
		this.codFee = codFee;
	}
	public String getSorterNoBarCode() {
		return sorterNoBarCode;
	}
	public void setSorterNoBarCode(String sorterNoBarCode) {
		this.sorterNoBarCode = sorterNoBarCode;
	}
	public String getSorterNo() {
		return sorterNo;
	}
	public void setSorterNo(String sorterNo) {
		this.sorterNo = sorterNo;
	}
	public String getTagOutFlg() {
		return tagOutFlg;
	}
	public void setTagOutFlg(String tagOutFlg) {
		this.tagOutFlg = tagOutFlg;
	}

}
