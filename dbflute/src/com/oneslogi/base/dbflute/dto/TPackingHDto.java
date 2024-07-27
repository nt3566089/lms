package com.oneslogi.base.dbflute.dto;

import com.oneslogi.base.dbflute.dto.bs.BsTPackingHDto;

/**
 * The entity of t_packing_h.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHDto extends BsTPackingHDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	//発行条件
	private String printCondition;

	//作業日/出荷日/納品日
	private String takingShippingDtFlg;

	//日付(From)
	private String dtFrom;

	//日付(To)
	private String dtTo;

	//顧客出荷指示№
	private String clientShippingNo;

	//配送コースCD
	private String deliveryCourseCd;

	//配送コース名
	private String deliveryCourseNm;

	//運送業者CD
	private String carrierCd;

	//納品先名
	private String supplyCustomerNm;

	//届先名
	private String delivCustomerNm;

	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  Start
	// 出庫指示バッチNo.
	protected String pickingBatchNo;
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/02  End

	public String getPrintCondition() {
		return printCondition;
	}

	public void setPrintCondition(String printCondition) {
		this.printCondition = printCondition;
	}

	public String getTakingShippingDtFlg() {
		return takingShippingDtFlg;
	}

	public void setTakingShippingDtFlg(String takingShippingDtFlg) {
		this.takingShippingDtFlg = takingShippingDtFlg;
	}

	public String getDtFrom() {
		return dtFrom;
	}

	public void setDtFrom(String dtFrom) {
		this.dtFrom = dtFrom;
	}

	public String getDtTo() {
		return dtTo;
	}

	public void setDtTo(String dtTo) {
		this.dtTo = dtTo;
	}

	public String getClientShippingNo() {
		return clientShippingNo;
	}

	public void setClientShippingNo(String clientShippingNo) {
		this.clientShippingNo = clientShippingNo;
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

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getSupplyCustomerNm() {
		return supplyCustomerNm;
	}

	public void setSupplyCustomerNm(String supplyCustomerNm) {
		this.supplyCustomerNm = supplyCustomerNm;
	}

	public String getDelivCustomerNm() {
		return delivCustomerNm;
	}

	public void setDelivCustomerNm(String delivCustomerNm) {
		this.delivCustomerNm = delivCustomerNm;
	}

	public String getPickingBatchNo() {
		return pickingBatchNo;
	}

	public void setPickingBatchNo(String pickingBatchNo) {
		this.pickingBatchNo = pickingBatchNo;
	}

	// ミドリ安全様向けカスタマイズ対応 梱包明細一覧画面検索条件を追加 2024.07.18 蒋 Add [S]

	// 検索基準日
	private String takingShippingFlg;
	// 荷揃番号(From)
	private String nizoroeNo2From;
	// 荷揃番号(To)
	private String nizoroeNo2To;
	// 代表荷揃番号(From)
	private String daihyoNizoroeNo2From;
	// 代表荷揃番号(To)
	private String daihyoNizoroeNo2To;
	// 出荷区分
	private String shippingTypeCd;
	// 商品CD
	private String productCd;
	// 商品名
	private String productNm;
	// janCd
	private String janCd;
	// 販売組織CD
	private String salesOrgCd;
	// 販売組織名
	private String salesOrgNm;

	public String getTakingShippingFlg() {
		return takingShippingFlg;
	}

	public void setTakingShippingFlg(String takingShippingFlg) {
		this.takingShippingFlg = takingShippingFlg;
	}

	public String getNizoroeNo2From() {
		return nizoroeNo2From;
	}

	public void setNizoroeNo2From(String nizoroeNo2From) {
		this.nizoroeNo2From = nizoroeNo2From;
	}

	public String getNizoroeNo2To() {
		return nizoroeNo2To;
	}

	public void setNizoroeNo2To(String nizoroeNo2To) {
		this.nizoroeNo2To = nizoroeNo2To;
	}

	public String getDaihyoNizoroeNo2From() {
		return daihyoNizoroeNo2From;
	}

	public void setDaihyoNizoroeNo2From(String daihyoNizoroeNo2From) {
		this.daihyoNizoroeNo2From = daihyoNizoroeNo2From;
	}

	public String getDaihyoNizoroeNo2To() {
		return daihyoNizoroeNo2To;
	}

	public void setDaihyoNizoroeNo2To(String daihyoNizoroeNo2To) {
		this.daihyoNizoroeNo2To = daihyoNizoroeNo2To;
	}

	public String getShippingTypeCd() {
		return shippingTypeCd;
	}

	public void setShippingTypeCd(String shippingTypeCd) {
		this.shippingTypeCd = shippingTypeCd;
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

	public String getSalesOrgCd() {
		return salesOrgCd;
	}

	public void setSalesOrgCd(String salesOrgCd) {
		this.salesOrgCd = salesOrgCd;
	}

	public String getSalesOrgNm() {
		return salesOrgNm;
	}

	public void setSalesOrgNm(String salesOrgNm) {
		this.salesOrgNm = salesOrgNm;
	}

	// ミドリ安全様向けカスタマイズ対応 梱包明細一覧画面検索条件を追加 2024.07.18 蒋 Add [E]
	// ミドリ安全様向けカスタマイズ対応  商品CD追加 2024.7.15 張 Add [S]
	//商品CD
	private String pCd;

	public String getpCd() {
		return pCd;
	}

	public void setpCd(String pCd) {
		this.pCd = pCd;
	}
	// ミドリ安全様向けカスタマイズ対応  商品CD追加 2024.7.15 張 Add [E]

}
