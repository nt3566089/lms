package com.oneslogi.wms.dto.report;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlCasePickingListPrintDto;
import com.oneslogi.base.dto.BaseDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class CasePickingListDto extends SqlCasePickingListPrintDto {

	//帳票CD
	private String reportCd;

	private String printFlg;

	private long cultureId;

	private String lineNo;
	// [Ver3.0] unit of measure対応 2017.11.24 NIU Start
	//入数
	private String stringUnitNum;

	//総ピック内訳
	private String totalBreakdown;

	//ピック内訳
	private String breakdown;

	//最小梱包単位
	private String minimumPackingUnit;
	// [Ver3.0] unit of measure対応 2017.11.24 NIU End

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 Start
	//商品CD列の印刷フラグ
	private String printProductCdFlg = "true";
	//商品CD列以外の印刷フラグ
	private String printProductCdElseFlg = "true";
	// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana Start
	//罫線(サブ)の印刷フラグ
	private String printSubLineFlg = "false";
	// [#5703][v3.1] ページング時の罫線不正を修正 2018.11.26 kawana End
	//罫線の印刷フラグ
	private String printLineFlg = "false";
	//総ケース数
	private BigDecimal totalCaseNum;
	//総ピース数
	private BigDecimal totalPieceNum;
	//総ピック数
	private BigDecimal totalPickNum;
	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 End

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
	//入庫日
	private String storeDt;
	//入庫No.管理フラグ
	private String storeNoFlg;

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [#1942] SD用に追加した項目を削除 2017.06.20 kawana

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	private String fromShippingPackingNo;

	private String toShippingPackingNo;
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
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
	/** 代表荷揃番号 */
	private String daihyoNizoroeNo2;
	/** 代表荷揃番号(バーコード) */
	private String daihyoNizoroeNoBarCd;
	/** 代表荷揃番号ハイフンなし */
	private String daihyoNizoroeNo;
	/** 運送便CD */
	private String deliveryCourseCd;
	/** 運送便名称 */
	private String deliveryCourseNm;
	/** 総ケース数 */
	private Integer pickedTotal;
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
	/** 届先住所1 */
	private String delivAddress1;
	/** 届先住所2 */
	private String delivAddress2;
	/** 届先住所3 */
	private String delivAddress3;
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
	public String getReportCd() {
		return reportCd;
	}

	public long getCultureId() {
		return cultureId;
	}

	public void setCultureId(long cultureId) {
		this.cultureId = cultureId;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public void setReportCd(String reportCd) {
		this.reportCd = reportCd;
	}

	public String getPrintFlg() {
		return printFlg;
	}

	public void setPrintFlg(String printFlg) {
		this.printFlg = printFlg;
	}

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 Start
	public String getPrintProductCdFlg() {
		return printProductCdFlg;
	}

	public void setPrintProductCdFlg(String printProductCdFlg) {
		this.printProductCdFlg = printProductCdFlg;
	}

	public String getPrintProductCdElseFlg() {
		return printProductCdElseFlg;
	}

	public void setPrintProductCdElseFlg(String printProductCdElseFlg) {
		this.printProductCdElseFlg = printProductCdElseFlg;
	}

	public BigDecimal getTotalCaseNum() {
		return totalCaseNum;
	}

	public void setTotalCaseNum(BigDecimal totalCaseNum) {
		this.totalCaseNum = totalCaseNum;
	}

	public BigDecimal getTotalPieceNum() {
		return totalPieceNum;
	}

	public void setTotalPieceNum(BigDecimal totalPieceNum) {
		this.totalPieceNum = totalPieceNum;
	}

	public BigDecimal getTotalPickNum() {
		return totalPickNum;
	}

	public void setTotalPickNum(BigDecimal totalPickNum) {
		this.totalPickNum = totalPickNum;
	}

	public String getPrintSubLineFlg() {
		return printSubLineFlg;
	}

	public void setPrintSubLineFlg(String printSubLineFlg) {
		this.printSubLineFlg = printSubLineFlg;
	}

	public String getPrintLineFlg() {
		return printLineFlg;
	}

	public void setPrintLineFlg(String printLineFlg) {
		this.printLineFlg = printLineFlg;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 NIU Start
	//入数
	public String getStringUnitNum() {
		return stringUnitNum;
	}

	public void setStringUnitNum(String stringUnitNum) {
		this.stringUnitNum = stringUnitNum;
	}

	//総ピック内訳
	public String getTotalBreakdown() {
		return totalBreakdown;
	}

	public void setTotalBreakdown(String totalBreakdown) {
		this.totalBreakdown = totalBreakdown;
	}

	//ピック内訳
	public String getBreakdown() {
		return breakdown;
	}

	public void setBreakdown(String breakdown) {
		this.breakdown = breakdown;
	}

	//最小梱包単位
	public String getMinimumPackingUnit() {
		return minimumPackingUnit;
	}

	public void setMinimumPackingUnit(String minimumPackingUnit) {
		this.minimumPackingUnit = minimumPackingUnit;
	}

	// [Ver3.0] unit of measure対応 2017.11.21 NIU End

	//[Ver1.1.4][ON推-仕様変更] 2016.02.17 chou 追加 End

	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add Start
	public String getStoreDt() {
		return storeDt;
	}

	public void setStoreDt(String storeDt) {
		this.storeDt = storeDt;
	}

	public String getStoreNoFlg() {
		return storeNoFlg;
	}

	public void setStoreNoFlg(String storeNoFlg) {
		this.storeNoFlg = storeNoFlg;
	}
	//[ON推-1.1.4-CT-042]CT指摘の修正対応 2016.05.19 chou Add End

	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara Start
	public String getFromShippingPackingNo() {
		return fromShippingPackingNo;
	}

	public void setFromShippingPackingNo(String fromShippingPackingNo) {
		this.fromShippingPackingNo = fromShippingPackingNo;
	}

	public String getToShippingPackingNo() {
		return toShippingPackingNo;
	}

	public void setToShippingPackingNo(String toShippingPackingNo) {
		this.toShippingPackingNo = toShippingPackingNo;
	}
	// [#3110] 帳票レイアウト変更 jancd表示の統一 2018.01.25 fujiwara End
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
	public Integer getPickedTotal() {
		return pickedTotal;
	}
	public void setPickedTotal(Integer pickedTotal) {
		this.pickedTotal = pickedTotal;
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
	public String getDelivAddress3() {
		return delivAddress3;
	}
	public void setDelivAddress3(String delivAddress3) {
		this.delivAddress3 = delivAddress3;
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
