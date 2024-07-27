package com.oneslogi.wms.dto.report;

import com.oneslogi.base.dto.ReportDto;

/**
 * 荷札ヤマト
 */
public class TagLabelYamatoDto extends ReportDto implements Cloneable {

	/** （配逹票）着店CD（バーコード） */
	private String arrivalStoreCdBarCode;
	/** （配逹票）着店CD */
	private String arrivalStoreCd;
	/** （配逹票）お届け先：電話番号 */
	private String delivTelNo;
	/** （配逹票）お届け先：郵便番号 */
	private String delivZipCd;
	/** （配逹票）お届け先：住所 */
	private String delivAddress;
	/** （配逹票）お届け先：名称 */
	private String delivCustomerNm;
	/** （配逹票）ご依頼主：電話番号 */
	private String slipClientTelNo;
	/** （配逹票）ご依頼主：郵便番号 */
	private String slipClientZipCd;
	/** （配逹票）ご依頼主：住所 */
	private String slipClientAddress;
	/** （配逹票）ご依頼主：名称 */
	private String slipClientNm;
	/** （配逹票）お問い合わせ送り状番号 */
	private String carrierTraceNum;
	/** （配逹票）受付日(年) */
	private String workDtY;
	/** （配逹票）受付日(月) */
	private String workDtM;
	/** （配逹票）受付日 */
	private String workDt;
	/** （配逹票）配逹希望日(月) */
	private String delivDtM;
	/** （配逹票）配逹希望日(日) */
	private String delivDt;
	/** （配逹票）配逹希望時間帯 */
	private String delivTz;
	/** （配逹票）品名 */
	private String slipItemNm;
	/** （配逹票）箱番号 */
	private String boxNo;
	/** （配逹票）記事 */
	private String article;
	/** （配逹票）荷材サイズCD */
	private String boxSizeCd;
	/** （配逹票）発店CD */
	private String sendCd;
	/** （配逹票）荷揃番号 */
	private String nizoroeNo;
	/** （配逹票）問い合わせ番号（バーコード） */
	private String trackingNoBarCode;
	/** （配逹票）問い合わせ番号 */
	private String trackingNo;
	/** （貼付票）お届け先：電話番号 */
	private String delivTelNoH;
	/** （貼付票）お届け先：郵便番号 */
	private String delivZipCdH;
	/** （貼付票）お届け先：住所 */
	private String delivAddressH;
	/** （貼付票）お届け先：名称 */
	private String delivCustomerNmH;
	/** （貼付票）ご依頼主：電話番号 */
	private String slipClientTelNoH;
	/** （貼付票）ご依頼主：郵便番号 */
	private String slipClientZipCdH;
	/** （貼付票）ご依頼主：住所 */
	private String slipClientAddressH;
	/** （貼付票）ご依頼主：名称 */
	private String slipClientNmH;
	/** （貼付票）お問い合わせ送り状番号 */
	private String carrierTraceNumH;
	/** （貼付票）受付日(年) */
	private String receptDtYH;
	/** （貼付票）受付日(月) */
	private String receptDtMH;
	/** （貼付票）受付日 */
	private String receptDtH;
	/** （貼付票）配逹希望日(月) */
	private String delivDtMH;
	/** （貼付票）配逹希望日(日) */
	private String delivDtH;
	/** （貼付票）配逹希望時間帯 */
	private String delivTzH;
	/** （貼付票）品名 */
	private String slipItemNmH;
	/** （貼付票）記事 */
	private String articleH;
	/** （貼付票）発店CD */
	private String sendCdH;
	/** （貼付票）問い合わせ番号（バーコード） */
	private String trackingNoBarCodeH;
	/** （貼付票）問い合わせ番号 */
	private String trackingNoH;
	/** （貼付票）箱番号 */
	private String boxNoH;
	/** （荷札）運送便名称 */
	private String deliveryCourseNm;
	public String getArrivalStoreCdBarCode() {
		return arrivalStoreCdBarCode;
	}
	public void setArrivalStoreCdBarCode(String arrivalStoreCdBarCode) {
		this.arrivalStoreCdBarCode = arrivalStoreCdBarCode;
	}
	public String getArrivalStoreCd() {
		return arrivalStoreCd;
	}
	public void setArrivalStoreCd(String arrivalStoreCd) {
		this.arrivalStoreCd = arrivalStoreCd;
	}
	public String getDelivTelNo() {
		return delivTelNo;
	}
	public void setDelivTelNo(String delivTelNo) {
		this.delivTelNo = delivTelNo;
	}
	public String getDelivZipCd() {
		return delivZipCd;
	}
	public void setDelivZipCd(String delivZipCd) {
		this.delivZipCd = delivZipCd;
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
	public String getSlipClientTelNo() {
		return slipClientTelNo;
	}
	public void setSlipClientTelNo(String slipClientTelNo) {
		this.slipClientTelNo = slipClientTelNo;
	}
	public String getSlipClientZipCd() {
		return slipClientZipCd;
	}
	public void setSlipClientZipCd(String slipClientZipCd) {
		this.slipClientZipCd = slipClientZipCd;
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
	public String getCarrierTraceNum() {
		return carrierTraceNum;
	}
	public void setCarrierTraceNum(String carrierTraceNum) {
		this.carrierTraceNum = carrierTraceNum;
	}
	public String getWorkDtY() {
		return workDtY;
	}
	public void setWorkDtY(String workDtY) {
		this.workDtY = workDtY;
	}
	public String getWorkDtM() {
		return workDtM;
	}
	public void setWorkDtM(String workDtM) {
		this.workDtM = workDtM;
	}
	public String getWorkDt() {
		return workDt;
	}
	public void setWorkDt(String workDt) {
		this.workDt = workDt;
	}
	public String getDelivDtM() {
		return delivDtM;
	}
	public void setDelivDtM(String delivDtM) {
		this.delivDtM = delivDtM;
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
	public String getSlipItemNm() {
		return slipItemNm;
	}
	public void setSlipItemNm(String slipItemNm) {
		this.slipItemNm = slipItemNm;
	}
	public String getBoxNo() {
		return boxNo;
	}
	public void setBoxNo(String boxNo) {
		this.boxNo = boxNo;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getBoxSizeCd() {
		return boxSizeCd;
	}
	public void setBoxSizeCd(String boxSizeCd) {
		this.boxSizeCd = boxSizeCd;
	}
	public String getSendCd() {
		return sendCd;
	}
	public void setSendCd(String sendCd) {
		this.sendCd = sendCd;
	}
	public String getNizoroeNo() {
		return nizoroeNo;
	}
	public void setNizoroeNo(String nizoroeNo) {
		this.nizoroeNo = nizoroeNo;
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
	public String getDelivTelNoH() {
		return delivTelNoH;
	}
	public void setDelivTelNoH(String delivTelNoH) {
		this.delivTelNoH = delivTelNoH;
	}
	public String getDelivZipCdH() {
		return delivZipCdH;
	}
	public void setDelivZipCdH(String delivZipCdH) {
		this.delivZipCdH = delivZipCdH;
	}
	public String getDelivAddressH() {
		return delivAddressH;
	}
	public void setDelivAddressH(String delivAddressH) {
		this.delivAddressH = delivAddressH;
	}
	public String getDelivCustomerNmH() {
		return delivCustomerNmH;
	}
	public void setDelivCustomerNmH(String delivCustomerNmH) {
		this.delivCustomerNmH = delivCustomerNmH;
	}
	public String getSlipClientTelNoH() {
		return slipClientTelNoH;
	}
	public void setSlipClientTelNoH(String slipClientTelNoH) {
		this.slipClientTelNoH = slipClientTelNoH;
	}
	public String getSlipClientZipCdH() {
		return slipClientZipCdH;
	}
	public void setSlipClientZipCdH(String slipClientZipCdH) {
		this.slipClientZipCdH = slipClientZipCdH;
	}
	public String getSlipClientAddressH() {
		return slipClientAddressH;
	}
	public void setSlipClientAddressH(String slipClientAddressH) {
		this.slipClientAddressH = slipClientAddressH;
	}
	public String getSlipClientNmH() {
		return slipClientNmH;
	}
	public void setSlipClientNmH(String slipClientNmH) {
		this.slipClientNmH = slipClientNmH;
	}
	public String getCarrierTraceNumH() {
		return carrierTraceNumH;
	}
	public void setCarrierTraceNumH(String carrierTraceNumH) {
		this.carrierTraceNumH = carrierTraceNumH;
	}
	public String getReceptDtYH() {
		return receptDtYH;
	}
	public void setReceptDtYH(String receptDtYH) {
		this.receptDtYH = receptDtYH;
	}
	public String getReceptDtMH() {
		return receptDtMH;
	}
	public void setReceptDtMH(String receptDtMH) {
		this.receptDtMH = receptDtMH;
	}
	public String getReceptDtH() {
		return receptDtH;
	}
	public void setReceptDtH(String receptDtH) {
		this.receptDtH = receptDtH;
	}
	public String getDelivDtMH() {
		return delivDtMH;
	}
	public void setDelivDtMH(String delivDtMH) {
		this.delivDtMH = delivDtMH;
	}
	public String getDelivDtH() {
		return delivDtH;
	}
	public void setDelivDtH(String delivDtH) {
		this.delivDtH = delivDtH;
	}
	public String getDelivTzH() {
		return delivTzH;
	}
	public void setDelivTzH(String delivTzH) {
		this.delivTzH = delivTzH;
	}
	public String getSlipItemNmH() {
		return slipItemNmH;
	}
	public void setSlipItemNmH(String slipItemNmH) {
		this.slipItemNmH = slipItemNmH;
	}
	public String getArticleH() {
		return articleH;
	}
	public void setArticleH(String articleH) {
		this.articleH = articleH;
	}
	public String getSendCdH() {
		return sendCdH;
	}
	public void setSendCdH(String sendCdH) {
		this.sendCdH = sendCdH;
	}
	public String getTrackingNoBarCodeH() {
		return trackingNoBarCodeH;
	}
	public void setTrackingNoBarCodeH(String trackingNoBarCodeH) {
		this.trackingNoBarCodeH = trackingNoBarCodeH;
	}
	public String getTrackingNoH() {
		return trackingNoH;
	}
	public void setTrackingNoH(String trackingNoH) {
		this.trackingNoH = trackingNoH;
	}
	public String getBoxNoH() {
		return boxNoH;
	}
	public void setBoxNoH(String boxNoH) {
		this.boxNoH = boxNoH;
	}
	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}
	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

}
