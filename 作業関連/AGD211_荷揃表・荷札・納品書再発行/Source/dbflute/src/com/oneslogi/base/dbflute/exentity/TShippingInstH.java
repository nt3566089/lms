package com.oneslogi.base.dbflute.exentity;

import java.sql.Timestamp;

import com.oneslogi.base.dbflute.bsentity.BsTShippingInstH;

/**
 * The entity of T_SHIPPING_INST_H.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstH extends BsTShippingInstH {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	// ===== chaseメソッド(DBFlute 1.0.5N ⇒ 1.2.0対応) =====

	public MCustomer chaseMCustomerBySupplyCustomerId() {
		return _mCustomerBySupplyCustomerId != null ? _mCustomerBySupplyCustomerId : new MCustomer();
	}

	public MDeliveryCourse chaseMDeliveryCourse() {
		return _mDeliveryCourse != null ? _mDeliveryCourse : new MDeliveryCourse();
	}

	public TAllocInstH chaseTAllocInstH() {
		return _tAllocInstH != null ? _tAllocInstH : new TAllocInstH();
	}

	// ======================================================

	// ===== 導出カラム =====

	// 出荷日/作業日
	long shippingWorkDtFlg = 0;

	//add by wangsm 20140725 start

	//出荷日(From)
	private String shippingDtFrom;

	//出荷日(To)
	private String shippingDtTo;

	//未出荷全件
	private Integer noAllcDisplayFlg;

	//運送業者
	private String carrierCd;

	//エラーメッセージ
	private String headMessageNm;

	//配送コース名称
	private String deliveryCourseNm;

	//納品先CD
	private String customerCd;

	//納品先名称
	private String customerNm;

	//作業日/出荷日
	private String takingShippingFlg;

	//日付(From)
	private String dtFrom;

	//日付(To)
	private String dtTo;

	//商品CD
	private String productCd;

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(stockOutFlg削除) 2018.07.23 kawana Delete

	//出庫作業No.
	private String pickingWorkNo;

	//add by wangsm 20140725 end

	//処理区分CD
	private String processTypeCd;

	//作業日(From)
	private String workDtFrom;

	//作業日(To)
	private String workDtTo;

	//欠品有無のみ
	private String noStockOutFlg;

	//キャンセルデータ表示
	private String cancelDisplay;

	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
	//作業メッセージ有無
	private String pickingWorkMessageFlg;
	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End

	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu Start
	// 預託
	private String depositCustomerCd;

	// ユーザCD
	private String referenceUserCd;
	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu End

	private String chkErrorShow;

	private String emergencyFlgNm;

	private long receiveId;

	private String errorProcessMet;

	private String delivTzNm;

	//ミドリ安全様向けカスタマイズ対応 出荷検品一覧(運送業者)を追加 2024.06.19 dageni Add [S]
	//完了非表示
	private Integer completeHidden;
	//品種
	private String productcategoryCls;

	public Integer getCompleteHidden() {
		return completeHidden;
	}

	public void setCompleteHidden(Integer completeHidden) {
		this.completeHidden = completeHidden;
	}

	public String getProductcategoryCls() {
		return productcategoryCls;
	}

	public void setProductcategoryCls(String productcategoryCls) {
		this.productcategoryCls = productcategoryCls;
	}

	//ミドリ安全様向けカスタマイズ対応 出荷検品一覧(運送業者)を追加 2024.06.19 dageni Add [E]
	// ミドリ安全様向けカスタマイズ対応 「ピッキング状況(商品別)」画面の属性追加 2024.06.17 苗 Add [S]
	// 荷揃番号(From)
	private String nizoroeNo2From;
	// 荷揃番号(To)
	private String nizoroeNo2To;
	// 代表荷揃番号(From)
	private String daihyoNizoroeNo2From;
	// 代表荷揃番号(To)
	private String daihyoNizoroeNo2To;
	// ロケーションCD
	private String locationCd;
	// ロケーションNM
	private String locationNm;
	// JANCD
	private String janCd;
	// JANNM
	private String janNm;
	// 出荷ステータス
	private String pickingStatus;
	// 出荷処理区分
	private String processType;
	// 所有者
	private String depositCd;
	// ケース/バラ区分
	private String casePieceType;
	// ピッキング済非表示
	private String pickedHidden;
	// 出荷区分
	private String shippingStatusCd;
	// ミドリ安全様向けカスタマイズ対応 「ピッキング状況(商品別)」画面の属性追加 2024.06.17 苗 Add [E]
	// ミドリ安全様向けカスタマイズ対応 「出荷検品一覧(荷揃番号別)・運送業者変更」画面の属性追加 2024.06.27 王 Add [S]
	// 配達指定日無
	private String deliveryDtFlg;
	// 配達指定日無
	private String inspectedHidden;
	// 配達指定日・配達時間帯変更
	private String changeDeliveryDtTime;
	// 運送便CD
	private String deliveryCourseCdBatchCd;
	// 運送便名称
	private String deliveryCourseCdBatchNm;
	// ミドリ安全様向けカスタマイズ対応 「出荷検品一覧(荷揃番号別)・運送業者変更」画面の属性追加 2024.06.27 王 Add [E]

//	ミドリ安全様向けカスタマイズ対応 戸口ピッキング・仕分け状況一覧を新規作成 2024.07.05 YJS.Cui Add [S]
	// 仕分状態
	private String sortedCondition;
//	ミドリ安全様向けカスタマイズ対応 戸口ピッキング・仕分け状況一覧を新規作成 2024.07.05 YJS.Cui Add [E]
//	ミドリ安全様向けカスタマイズ対応 戸口送付先一覧を新規作成 2024.07.10 YJS.Cui Add [S]
	// 送り先名称
	private String destinationNm;
//	ミドリ安全様向けカスタマイズ対応 戸口送付先一覧を新規作成 2024.07.10 YJS.Cui Add [E]

	// ミドリ安全様向けカスタマイズ対応 フロア完結フラグ追加 2024.07.17 Zheng Add [S]
	public static final String ALIAS_maxFloorCompFlg = "MAX_FLOOR_COMP_FLG";
	private String maxFloorCompFlg;

	public static final String ALIAS_maxPickingPaternCd = "MAX_PICKING_PATERN_CD";
	private String maxPickingPaternCd;
	// ミドリ安全様向けカスタマイズ対応 フロア完結フラグ追加 2024.07.17 Zheng Add [E]

	// ===== 以下Eclipse自動生成のアクセサメソッド =====
	public String getDelivTzNm() {
		return delivTzNm;
	}

	public void setDelivTzNm(String delivTzNm) {
		this.delivTzNm = delivTzNm;
	}

	public String getErrorProcessMet() {
		return errorProcessMet;
	}

	public void setErrorProcessMet(String errorProcessMet) {
		this.errorProcessMet = errorProcessMet;
	}

	public String getEmergencyFlgNm() {
		return emergencyFlgNm;
	}

	public long getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(long receiveId) {
		this.receiveId = receiveId;
	}

	public void setEmergencyFlgNm(String emergencyFlgNm) {
		this.emergencyFlgNm = emergencyFlgNm;
	}

	public String getChkErrorShow() {
		return chkErrorShow;
	}

	public void setChkErrorShow(String chkErrorShow) {
		this.chkErrorShow = chkErrorShow;
	}

	public long getShippingWorkDtFlg() {
		return shippingWorkDtFlg;
	}

	public void setShippingWorkDtFlg(long shippingWorkDtFlg) {
		this.shippingWorkDtFlg = shippingWorkDtFlg;
	}

	public String getShippingDtFrom() {
		return shippingDtFrom;
	}

	public void setShippingDtFrom(String shippingDtFrom) {
		this.shippingDtFrom = shippingDtFrom;
	}

	public String getShippingDtTo() {
		return shippingDtTo;
	}

	public void setShippingDtTo(String shippingDtTo) {
		this.shippingDtTo = shippingDtTo;
	}

	public Integer getNoAllcDisplayFlg() {
		return noAllcDisplayFlg;
	}

	public void setNoAllcDisplayFlg(Integer noAllcDisplayFlg) {
		this.noAllcDisplayFlg = noAllcDisplayFlg;
	}

	public String getCarrierCd() {
		return carrierCd;
	}

	public void setCarrierCd(String carrierCd) {
		this.carrierCd = carrierCd;
	}

	public String getHeadMessageNm() {
		return headMessageNm;
	}

	public void setHeadMessageNm(String headMessageNm) {
		this.headMessageNm = headMessageNm;
	}

	public String getCustomerCd() {
		return customerCd;
	}

	public void setCustomerCd(String customerCd) {
		this.customerCd = customerCd;
	}

	public String getTakingShippingFlg() {
		return takingShippingFlg;
	}

	public void setTakingShippingFlg(String takingShippingFlg) {
		this.takingShippingFlg = takingShippingFlg;
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

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProcessTypeCd() {
		return processTypeCd;
	}

	public void setProcessTypeCd(String processTypeCd) {
		this.processTypeCd = processTypeCd;
	}

	public String getDeliveryCourseNm() {
		return deliveryCourseNm;
	}

	public void setDeliveryCourseNm(String deliveryCourseNm) {
		this.deliveryCourseNm = deliveryCourseNm;
	}

	public String getCustomerNm() {
		return customerNm;
	}

	public void setCustomerNm(String customerNm) {
		this.customerNm = customerNm;
	}

	public String getPickingWorkNo() {
		return pickingWorkNo;
	}

	public void setPickingWorkNo(String pickingWorkNo) {
		this.pickingWorkNo = pickingWorkNo;
	}

	public String getWorkDtFrom() {
		return workDtFrom;
	}

	public void setWorkDtFrom(String workDtFrom) {
		this.workDtFrom = workDtFrom;
	}

	public String getWorkDtTo() {
		return workDtTo;
	}

	public void setWorkDtTo(String workDtTo) {
		this.workDtTo = workDtTo;
	}

	public static final String ALIAS_maxUpdDt = "MAX_UPD_DT";
	private Timestamp maxUpdDt;

	public Timestamp getMaxUpdDt() {
		return maxUpdDt;
	}

	public void setMaxUpdDt(Timestamp maxUpdDt) {
		this.maxUpdDt = maxUpdDt;
	}

	public String getNoStockOutFlg() {
		return noStockOutFlg;
	}

	public void setNoStockOutFlg(String noStockOutFlg) {
		this.noStockOutFlg = noStockOutFlg;
	}

	public String getCancelDisplay() {
		return cancelDisplay;
	}

	public void setCancelDisplay(String cancelDisplay) {
		this.cancelDisplay = cancelDisplay;
	}

	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
	public String getPickingWorkMessageFlg() {
		return pickingWorkMessageFlg;
	}

	public void setPickingWorkMessageFlg(String pickingWorkMessageFlg) {
		this.pickingWorkMessageFlg = pickingWorkMessageFlg;
	}
	// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End

	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu Start
	public String getDepositCustomerCd() {
		return depositCustomerCd;
	}

	public void setDepositCustomerCd(String depositCustomerCd) {
		this.depositCustomerCd = depositCustomerCd;
	}

	public String getReferenceUserCd() {
		return referenceUserCd;
	}

	public void setReferenceUserCd(String referenceUserCd) {
		this.referenceUserCd = referenceUserCd;
	}
	// [WMS Ver3.0][#3136] 検索条件に「預託」「ユーザCD」を追加 2017.12.14 shimizu End

	// ミドリ安全様向けカスタマイズ対応 「ピッキング状況(商品別)」画面の属性追加 2024.06.17 苗 Add [S]
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

	public String getPickingStatus() {
		return pickingStatus;
	}

	public void setPickingStatus(String pickingStatus) {
		this.pickingStatus = pickingStatus;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getDepositCd() {
		return depositCd;
	}

	public void setDepositCd(String depositCd) {
		this.depositCd = depositCd;
	}

	public String getCasePieceType() {
		return casePieceType;
	}

	public void setCasePieceType(String casePieceType) {
		this.casePieceType = casePieceType;
	}

	public String getPickedHidden() {
		return pickedHidden;
	}

	public void setPickedHidden(String pickedHidden) {
		this.pickedHidden = pickedHidden;
	}

	public String getJanNm() {
		return janNm;
	}

	public void setJanNm(String janNm) {
		this.janNm = janNm;
	}

	public String getLocationNm() {
		return locationNm;
	}

	public void setLocationNm(String locationNm) {
		this.locationNm = locationNm;
	}

	public String getShippingStatusCd() {
		return shippingStatusCd;
	}

	public void setShippingStatusCd(String shippingStatusCd) {
		this.shippingStatusCd = shippingStatusCd;
	}
	// ミドリ安全様向けカスタマイズ対応 「ピッキング状況(商品別)」画面の属性追加 2024.06.17 苗 Add [E]
	// ミドリ安全様向けカスタマイズ対応 「出荷検品一覧(荷揃番号別)・運送業者変更」画面の属性追加 2024.06.27 王 Add [S]
	public String getDeliveryDtFlg() {
		return deliveryDtFlg;
	}

	public void setDeliveryDtFlg(String deliveryDtFlg) {
		this.deliveryDtFlg = deliveryDtFlg;
	}

	public String getInspectedHidden() {
		return inspectedHidden;
	}

	public void setInspectedHidden(String inspectedHidden) {
		this.inspectedHidden = inspectedHidden;
	}

	public String getChangeDeliveryDtTime() {
		return changeDeliveryDtTime;
	}

	public void setChangeDeliveryDtTime(String changeDeliveryDtTime) {
		this.changeDeliveryDtTime = changeDeliveryDtTime;
	}

	public String getDeliveryCourseCdBatchCd() {
		return deliveryCourseCdBatchCd;
	}

	public void setDeliveryCourseCdBatchCd(String deliveryCourseCdBatchCd) {
		this.deliveryCourseCdBatchCd = deliveryCourseCdBatchCd;
	}

	public String getDeliveryCourseCdBatchNm() {
		return deliveryCourseCdBatchNm;
	}

	public void setDeliveryCourseCdBatchNm(String deliveryCourseCdBatchNm) {
		this.deliveryCourseCdBatchNm = deliveryCourseCdBatchNm;
	}
	// ミドリ安全様向けカスタマイズ対応 「出荷検品一覧(荷揃番号別)・運送業者変更」画面の属性追加 2024.06.27 王 Add [E]
//	ミドリ安全様向けカスタマイズ対応 戸口ピッキング・仕分け状況一覧を新規作成 2024.07.05 YJS.Cui Add [S]
	public String getSortedCondition() {
		return sortedCondition;
	}

	public void setSortedCondition(String sortedCondition) {
		this.sortedCondition = sortedCondition;
	}
//	ミドリ安全様向けカスタマイズ対応 戸口ピッキング・仕分け状況一覧を新規作成 2024.07.05 YJS.Cui Add [E]
//	ミドリ安全様向けカスタマイズ対応 戸口送付先一覧を新規作成 2024.07.10 YJS.Cui Add [S]
	public String getDestinationNm() {
		return destinationNm;
	}

	public void setDestinationNm(String destinationNm) {
		this.destinationNm = destinationNm;
	}
//	ミドリ安全様向けカスタマイズ対応 戸口送付先一覧を新規作成 2024.07.10 YJS.Cui Add [E]
	// ミドリ安全様向けカスタマイズ対応 フロア完結フラグ追加 2024.07.17 Zheng Add [S]
	public String getMaxFloorCompFlg() {
		return maxFloorCompFlg;
	}

	public void setMaxFloorCompFlg(String maxFloorCompFlg) {
		this.maxFloorCompFlg = maxFloorCompFlg;
	}

	public String getMaxPickingPaternCd() {
		return maxPickingPaternCd;
	}

	public void setMaxPickingPaternCd(String maxPickingPaternCd) {
		this.maxPickingPaternCd = maxPickingPaternCd;
	}
	// ミドリ安全様向けカスタマイズ対応 フロア完結フラグ追加 2024.07.17 Zheng Add [E]
}
