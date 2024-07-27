package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class InventoryListDto extends ReportDto {

	//出力日時
	public String outputTime ;
	
	//センタ
	public String centerNm;
	
	//センタCD
	public String centerCd;
	
	//入力者
	public String inputUserNm;
	
	//入力者Cd
	public String inputUserCd;
	
	//ロケーション
	public String locationCd;	

	//JANCD
	public String janCd;
	
	//商品名称
	public String productNm;

	//販売組織/ユーザ
	public String salesOrgAndUser;

	//期限日
	public String limitDt;

	//製造日
	public String manufacturingDt;

	//ロット
	public String lot;

	//ケース数
	public BigDecimal caseNum;

	//棚卸数
	public BigDecimal inventoryNum;

	//棚卸担当者
	public String inventoryUserNm;
	
	//棚卸数変更者
	public String inventoryUpdUserNm;
	
	//修正前数量
	public BigDecimal inventoryModNum;
	
	//エリア
	public String areaCd;

	//在庫数
	public BigDecimal chargeNum;

	//棚卸差異数
	public BigDecimal diffNum;

	//未スキャン入荷ラベル
	public String noScanReceiveLabelNo;
	
	//ユーザーCd
	public String customerCd;

	public String getOutputTime() {
		return outputTime;
	}

	public void setOutputTime(String outputTime) {
		this.outputTime = outputTime;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	public String getJanCd() {
		return janCd;
	}

	public void setJanCd(String janCd) {
		this.janCd = janCd;
	}

	public String getProductNm() {
		return productNm;
	}

	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}

	public String getSalesOrgAndUser() {
		return salesOrgAndUser;
	}

	public void setSalesOrgAndUser(String salesOrgAndUser) {
		this.salesOrgAndUser = salesOrgAndUser;
	}

	public String getLimitDt() {
		return limitDt;
	}

	public void setLimitDt(String limitDt) {
		this.limitDt = limitDt;
	}

	public String getManufacturingDt() {
		return manufacturingDt;
	}

	public void setManufacturingDt(String manufacturingDt) {
		this.manufacturingDt = manufacturingDt;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public BigDecimal getCaseNum() {
		return caseNum;
	}

	public void setCaseNum(BigDecimal caseNum) {
		this.caseNum = caseNum;
	}

	public BigDecimal getInventoryNum() {
		return inventoryNum;
	}

	public void setInventoryNum(BigDecimal inventoryNum) {
		this.inventoryNum = inventoryNum;
	}

	public String getInventoryUserNm() {
		return inventoryUserNm;
	}

	public void setInventoryUserNm(String inventoryUserNm) {
		this.inventoryUserNm = inventoryUserNm;
	}

	public String getAreaCd() {
		return areaCd;
	}

	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}

	public BigDecimal getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
	}

	public BigDecimal getDiffNum() {
		return diffNum;
	}

	public void setDiffNum(BigDecimal diffNum) {
		this.diffNum = diffNum;
	}

	public String getNoScanReceiveLabelNo() {
		return noScanReceiveLabelNo;
	}

	public void setNoScanReceiveLabelNo(String noScanReceiveLabelNo) {
		this.noScanReceiveLabelNo = noScanReceiveLabelNo;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getInputUserNm() {
		return inputUserNm;
	}

	public void setInputUserNm(String inputUserNm) {
		this.inputUserNm = inputUserNm;
	}

	public String getInventoryUpdUserNm() {
		return inventoryUpdUserNm;
	}

	public void setInventoryUpdUserNm(String inventoryUpdUserNm) {
		this.inventoryUpdUserNm = inventoryUpdUserNm;
	}

	public BigDecimal getInventoryModNum() {
		return inventoryModNum;
	}

	public void setInventoryModNum(BigDecimal inventoryModNum) {
		this.inventoryModNum = inventoryModNum;
	}

	public String getInputUserCd() {
		return inputUserCd;
	}

	public void setInputUserCd(String inputUserCd) {
		this.inputUserCd = inputUserCd;
	}



}
