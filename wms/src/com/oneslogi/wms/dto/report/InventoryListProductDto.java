package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import com.oneslogi.base.dto.ReportDto;

public class InventoryListProductDto extends ReportDto {

	//出力日時
	public String outputTime ;
	
	//センタ
	public String centerNm;
	
	//センタCD
	public String centerCd;
	
	//棚卸日
	public String inventoryDt;
	
	//部門
	public String plantNm;
	
	//部門CD
	public String plantCd;
	
	//品種
	public String typeNm;
	
	//品種Cd
	public String typeCd;
	
	//棚卸差異
	public String diffNm;
	
	//JANCD
	public String janCd;
	
	//商品名称
	public String productNm;
	
	//商品Cd
	public String productCd;
	
	//販売組織/ユーザ
	public String salesOrgAndUser;
	
	//販売組織Cd
	public String salesOrgCd;
	
	//ユーザーCd
	public String customerCd;
	
	//ロケーションCd
	public String locationCd;
	
	//ロケーション合計
	public int sumLocation;
	
	//現在庫数
	public BigDecimal chargeNum;
	public BigDecimal totalChargeNum;
	
	//棚卸数
	public BigDecimal inventoryNum;
	public BigDecimal totalInventoryNum;

	//差異数量＋
	public BigDecimal diffNumP;
	public BigDecimal totalDiffNumP;
	
	//差異数量-
	public BigDecimal diffNumM;
	public BigDecimal totalDiffNumM;
	
	//差異金額＋
	public BigDecimal diffMoneyP;
	public BigDecimal totalDiffMoneyP;
	
	//差異金額－
	public BigDecimal diffMoneyM;
	public BigDecimal totalDiffMoneyM;

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

	public BigDecimal getInventoryNum() {
		return inventoryNum;
	}

	public void setInventoryNum(BigDecimal inventoryNum) {
		this.inventoryNum = inventoryNum;
	}

	public BigDecimal getChargeNum() {
		return chargeNum;
	}

	public void setChargeNum(BigDecimal chargeNum) {
		this.chargeNum = chargeNum;
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

	public String getInventoryDt() {
		return inventoryDt;
	}

	public void setInventoryDt(String inventoryDt) {
		this.inventoryDt = inventoryDt;
	}

	public String getPlantNm() {
		return plantNm;
	}

	public void setPlantNm(String plantNm) {
		this.plantNm = plantNm;
	}

	public String getPlantCd() {
		return plantCd;
	}

	public void setPlantCd(String plantCd) {
		this.plantCd = plantCd;
	}

	public String getSalesOrgCd() {
		return salesOrgCd;
	}

	public void setSalesOrgCd(String salesOrgCd) {
		this.salesOrgCd = salesOrgCd;
	}

	public String getTypeCd() {
		return typeCd;
	}

	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	public String getTypeNm() {
		return typeNm;
	}

	public void setTypeNm(String typeNm) {
		this.typeNm = typeNm;
	}

	public String getDiffNm() {
		return diffNm;
	}

	public void setDiffNm(String diffNm) {
		this.diffNm = diffNm;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public BigDecimal getDiffNumP() {
		return diffNumP;
	}

	public void setDiffNumP(BigDecimal diffNumP) {
		this.diffNumP = diffNumP;
	}

	public BigDecimal getDiffNumM() {
		return diffNumM;
	}

	public void setDiffNumM(BigDecimal diffNumM) {
		this.diffNumM = diffNumM;
	}

	public BigDecimal getDiffMoneyP() {
		return diffMoneyP;
	}

	public void setDiffMoneyP(BigDecimal diffMoneyP) {
		this.diffMoneyP = diffMoneyP;
	}

	public BigDecimal getDiffMoneyM() {
		return diffMoneyM;
	}

	public void setDiffMoneyM(BigDecimal diffMoneyM) {
		this.diffMoneyM = diffMoneyM;
	}

	public BigDecimal getTotalChargeNum() {
		return totalChargeNum;
	}

	public void setTotalChargeNum(BigDecimal totalChargeNum) {
		this.totalChargeNum = totalChargeNum;
	}

	public BigDecimal getTotalInventoryNum() {
		return totalInventoryNum;
	}

	public void setTotalInventoryNum(BigDecimal totalInventoryNum) {
		this.totalInventoryNum = totalInventoryNum;
	}

	public BigDecimal getTotalDiffNumP() {
		return totalDiffNumP;
	}

	public void setTotalDiffNumP(BigDecimal totalDiffNumP) {
		this.totalDiffNumP = totalDiffNumP;
	}

	public BigDecimal getTotalDiffNumM() {
		return totalDiffNumM;
	}

	public void setTotalDiffNumM(BigDecimal totalDiffNumM) {
		this.totalDiffNumM = totalDiffNumM;
	}

	public BigDecimal getTotalDiffMoneyP() {
		return totalDiffMoneyP;
	}

	public void setTotalDiffMoneyP(BigDecimal totalDiffMoneyP) {
		this.totalDiffMoneyP = totalDiffMoneyP;
	}

	public BigDecimal getTotalDiffMoneyM() {
		return totalDiffMoneyM;
	}

	public void setTotalDiffMoneyM(BigDecimal totalDiffMoneyM) {
		this.totalDiffMoneyM = totalDiffMoneyM;
	}

	public String getLocationCd() {
		return locationCd;
	}

	public void setLocationCd(String locationCd) {
		this.locationCd = locationCd;
	}

	public int getSumLocation() {
		return sumLocation;
	}

	public void setSumLocation(int sumLocation) {
		this.sumLocation = sumLocation;
	}
	
}
