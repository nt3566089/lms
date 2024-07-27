package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of t_shipping_inst_h as TABLE. <br>
 * 出荷指示ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, CARRIER_ID, CARRIER_CD, SALES_ORG_CD, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, ORDER_DT, KOKYAKU_CD, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, ORDER_NO_DELIVERY_NOTE, POINT, KOGUCHI_DELIVERY_FLG, RECORD_SEND_FLG, CARRIER_DATA_OUT_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, NIZOROE_ID, NIZOROE_PROC_UNIT, ACCOUNT_ID, ACCOUNT_CD, SHIPPING_REASON_CD, TRANSFER_FLG, TENHANSHA_SALES_ORDER_NO, DELIV_CD, SALES_ORDER_NUM, DIRECT_DELIVERY_TYPE_CD, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, DESTINATION_NM_KANA, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, EC_ORDER_NO, PAYMENT_TYPE_CD, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, DIRECT_UPD_FLG, IF_ID, CUSTOMER_CD, CUSTOMER_NM, PSAM, FLOOR_COMP_FLG, DELIVERY_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_delivery_course, m_process_type, m_customer, m_client, t_alloc_inst_h, m_center, m_zip(ForDeliv), b_class_dtl(ByDelivTz)
 *
 * [referrer table]
 *     t_ec_order_h, t_shipping_inst_b, t_shipping_inst_h_print
 *
 * [foreign property]
 *     mDeliveryCourse, mProcessType, mCustomerByDelivCustomerId, mClient, mCustomerBySupplyCustomerId, tAllocInstH, mCenter, mZipForDeliv, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer property]
 *     tEcOrderHList, tShippingInstBList, tShippingInstHPrintList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstHId = entity.getShippingInstHId();
 * Long clientId = entity.getClientId();
 * Long centerId = entity.getCenterId();
 * Long processTypeId = entity.getProcessTypeId();
 * String inputType = entity.getInputType();
 * String shippingDt = entity.getShippingDt();
 * String workDt = entity.getWorkDt();
 * String delivPlanDt = entity.getDelivPlanDt();
 * String delivDt = entity.getDelivDt();
 * String delivTz = entity.getDelivTz();
 * String clientShippingNo = entity.getClientShippingNo();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String shippingStatus = entity.getShippingStatus();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyCustomerCd = entity.getSupplyCustomerCd();
 * String supplyCustomerNm = entity.getSupplyCustomerNm();
 * Long delivCustomerId = entity.getDelivCustomerId();
 * String delivCustomerCd = entity.getDelivCustomerCd();
 * String delivZipCd = entity.getDelivZipCd();
 * String delivAddress1 = entity.getDelivAddress1();
 * String delivAddress2 = entity.getDelivAddress2();
 * String delivAddress3 = entity.getDelivAddress3();
 * String delivAddressSupply = entity.getDelivAddressSupply();
 * String delivCustomerNm = entity.getDelivCustomerNm();
 * String delivCustomerNm1 = entity.getDelivCustomerNm1();
 * String delivCustomerNm2 = entity.getDelivCustomerNm2();
 * String delivTelNo = entity.getDelivTelNo();
 * Long deliveryCourseId = entity.getDeliveryCourseId();
 * String deliveryCourseCd = entity.getDeliveryCourseCd();
 * String emergencyFlg = entity.getEmergencyFlg();
 * String pickingWorkMessage = entity.getPickingWorkMessage();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String pickingBatchNo = entity.getPickingBatchNo();
 * String stockOutFlg = entity.getStockOutFlg();
 * Long allocInstHId = entity.getAllocInstHId();
 * Long cod = entity.getCod();
 * Long codTax = entity.getCodTax();
 * java.math.BigDecimal totalPrice = entity.getTotalPrice();
 * java.math.BigDecimal totalTax = entity.getTotalTax();
 * String nizoroeNo = entity.getNizoroeNo();
 * String daihyoNizoroeNo = entity.getDaihyoNizoroeNo();
 * String nizoroeNo2 = entity.getNizoroeNo2();
 * String daihyoNizoroeNo2 = entity.getDaihyoNizoroeNo2();
 * Long shippingTypeId = entity.getShippingTypeId();
 * String shippingTypeCd = entity.getShippingTypeCd();
 * String carrierId = entity.getCarrierId();
 * String carrierCd = entity.getCarrierCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String salesOrderNo = entity.getSalesOrderNo();
 * String salesOrderSlipTypeCd = entity.getSalesOrderSlipTypeCd();
 * String salesOrderSlipNo = entity.getSalesOrderSlipNo();
 * String orderDt = entity.getOrderDt();
 * String kokyakuCd = entity.getKokyakuCd();
 * Long shippingFee = entity.getShippingFee();
 * Long separateShippingFee = entity.getSeparateShippingFee();
 * Long codFee = entity.getCodFee();
 * String orderNoDeliveryNote = entity.getOrderNoDeliveryNote();
 * Long point = entity.getPoint();
 * String koguchiDeliveryFlg = entity.getKoguchiDeliveryFlg();
 * String recordSendFlg = entity.getRecordSendFlg();
 * String carrierDataOutFlg = entity.getCarrierDataOutFlg();
 * String kohaiContractorCd = entity.getKohaiContractorCd();
 * String kohaiContractorNm = entity.getKohaiContractorNm();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * Long nizoroeId = entity.getNizoroeId();
 * String nizoroeProcUnit = entity.getNizoroeProcUnit();
 * Long accountId = entity.getAccountId();
 * String accountCd = entity.getAccountCd();
 * String shippingReasonCd = entity.getShippingReasonCd();
 * String transferFlg = entity.getTransferFlg();
 * String tenhanshaSalesOrderNo = entity.getTenhanshaSalesOrderNo();
 * String delivCd = entity.getDelivCd();
 * Long salesOrderNum = entity.getSalesOrderNum();
 * String directDeliveryTypeCd = entity.getDirectDeliveryTypeCd();
 * String splitDeliveryTypeCd = entity.getSplitDeliveryTypeCd();
 * String carrierTypeCd = entity.getCarrierTypeCd();
 * String specifyDeliveryDt = entity.getSpecifyDeliveryDt();
 * String specifyDeliveryTime = entity.getSpecifyDeliveryTime();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String destinationNmKana = entity.getDestinationNmKana();
 * String destinationFax = entity.getDestinationFax();
 * String kanjiMessage1 = entity.getKanjiMessage1();
 * String kanjiMessage2 = entity.getKanjiMessage2();
 * String kanjiMessage3 = entity.getKanjiMessage3();
 * String kanjiMessage4 = entity.getKanjiMessage4();
 * String kanjiMessage5 = entity.getKanjiMessage5();
 * String kanjiMessage6 = entity.getKanjiMessage6();
 * String kanjiMessage7 = entity.getKanjiMessage7();
 * String kanjiMessage8 = entity.getKanjiMessage8();
 * String kanjiMessage9 = entity.getKanjiMessage9();
 * String kanjiMessage10 = entity.getKanjiMessage10();
 * String kanaMessage1 = entity.getKanaMessage1();
 * String kanaMessage2 = entity.getKanaMessage2();
 * String kanaMessage3 = entity.getKanaMessage3();
 * String kanaMessage4 = entity.getKanaMessage4();
 * String kanaMessage5 = entity.getKanaMessage5();
 * String kanaMessage6 = entity.getKanaMessage6();
 * String kanaMessage7 = entity.getKanaMessage7();
 * String kanaMessage8 = entity.getKanaMessage8();
 * String kanaMessage9 = entity.getKanaMessage9();
 * String kanaMessage10 = entity.getKanaMessage10();
 * String deliveryNoteSummary = entity.getDeliveryNoteSummary();
 * String invoiceSummary = entity.getInvoiceSummary();
 * String ecOrderNo = entity.getEcOrderNo();
 * String paymentTypeCd = entity.getPaymentTypeCd();
 * String priceHiddenFlg = entity.getPriceHiddenFlg();
 * String paymentHiddenFlg = entity.getPaymentHiddenFlg();
 * String directUpdFlg = entity.getDirectUpdFlg();
 * String ifId = entity.getIfId();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String psam = entity.getPsam();
 * String floorCompFlg = entity.getFloorCompFlg();
 * String deliveryType = entity.getDeliveryType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstHId(shippingInstHId);
 * entity.setClientId(clientId);
 * entity.setCenterId(centerId);
 * entity.setProcessTypeId(processTypeId);
 * entity.setInputType(inputType);
 * entity.setShippingDt(shippingDt);
 * entity.setWorkDt(workDt);
 * entity.setDelivPlanDt(delivPlanDt);
 * entity.setDelivDt(delivDt);
 * entity.setDelivTz(delivTz);
 * entity.setClientShippingNo(clientShippingNo);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingStatus(shippingStatus);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyCustomerCd(supplyCustomerCd);
 * entity.setSupplyCustomerNm(supplyCustomerNm);
 * entity.setDelivCustomerId(delivCustomerId);
 * entity.setDelivCustomerCd(delivCustomerCd);
 * entity.setDelivZipCd(delivZipCd);
 * entity.setDelivAddress1(delivAddress1);
 * entity.setDelivAddress2(delivAddress2);
 * entity.setDelivAddress3(delivAddress3);
 * entity.setDelivAddressSupply(delivAddressSupply);
 * entity.setDelivCustomerNm(delivCustomerNm);
 * entity.setDelivCustomerNm1(delivCustomerNm1);
 * entity.setDelivCustomerNm2(delivCustomerNm2);
 * entity.setDelivTelNo(delivTelNo);
 * entity.setDeliveryCourseId(deliveryCourseId);
 * entity.setDeliveryCourseCd(deliveryCourseCd);
 * entity.setEmergencyFlg(emergencyFlg);
 * entity.setPickingWorkMessage(pickingWorkMessage);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setPickingBatchNo(pickingBatchNo);
 * entity.setStockOutFlg(stockOutFlg);
 * entity.setAllocInstHId(allocInstHId);
 * entity.setCod(cod);
 * entity.setCodTax(codTax);
 * entity.setTotalPrice(totalPrice);
 * entity.setTotalTax(totalTax);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setDaihyoNizoroeNo(daihyoNizoroeNo);
 * entity.setNizoroeNo2(nizoroeNo2);
 * entity.setDaihyoNizoroeNo2(daihyoNizoroeNo2);
 * entity.setShippingTypeId(shippingTypeId);
 * entity.setShippingTypeCd(shippingTypeCd);
 * entity.setCarrierId(carrierId);
 * entity.setCarrierCd(carrierCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setSalesOrderNo(salesOrderNo);
 * entity.setSalesOrderSlipTypeCd(salesOrderSlipTypeCd);
 * entity.setSalesOrderSlipNo(salesOrderSlipNo);
 * entity.setOrderDt(orderDt);
 * entity.setKokyakuCd(kokyakuCd);
 * entity.setShippingFee(shippingFee);
 * entity.setSeparateShippingFee(separateShippingFee);
 * entity.setCodFee(codFee);
 * entity.setOrderNoDeliveryNote(orderNoDeliveryNote);
 * entity.setPoint(point);
 * entity.setKoguchiDeliveryFlg(koguchiDeliveryFlg);
 * entity.setRecordSendFlg(recordSendFlg);
 * entity.setCarrierDataOutFlg(carrierDataOutFlg);
 * entity.setKohaiContractorCd(kohaiContractorCd);
 * entity.setKohaiContractorNm(kohaiContractorNm);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setNizoroeId(nizoroeId);
 * entity.setNizoroeProcUnit(nizoroeProcUnit);
 * entity.setAccountId(accountId);
 * entity.setAccountCd(accountCd);
 * entity.setShippingReasonCd(shippingReasonCd);
 * entity.setTransferFlg(transferFlg);
 * entity.setTenhanshaSalesOrderNo(tenhanshaSalesOrderNo);
 * entity.setDelivCd(delivCd);
 * entity.setSalesOrderNum(salesOrderNum);
 * entity.setDirectDeliveryTypeCd(directDeliveryTypeCd);
 * entity.setSplitDeliveryTypeCd(splitDeliveryTypeCd);
 * entity.setCarrierTypeCd(carrierTypeCd);
 * entity.setSpecifyDeliveryDt(specifyDeliveryDt);
 * entity.setSpecifyDeliveryTime(specifyDeliveryTime);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setDestinationNmKana(destinationNmKana);
 * entity.setDestinationFax(destinationFax);
 * entity.setKanjiMessage1(kanjiMessage1);
 * entity.setKanjiMessage2(kanjiMessage2);
 * entity.setKanjiMessage3(kanjiMessage3);
 * entity.setKanjiMessage4(kanjiMessage4);
 * entity.setKanjiMessage5(kanjiMessage5);
 * entity.setKanjiMessage6(kanjiMessage6);
 * entity.setKanjiMessage7(kanjiMessage7);
 * entity.setKanjiMessage8(kanjiMessage8);
 * entity.setKanjiMessage9(kanjiMessage9);
 * entity.setKanjiMessage10(kanjiMessage10);
 * entity.setKanaMessage1(kanaMessage1);
 * entity.setKanaMessage2(kanaMessage2);
 * entity.setKanaMessage3(kanaMessage3);
 * entity.setKanaMessage4(kanaMessage4);
 * entity.setKanaMessage5(kanaMessage5);
 * entity.setKanaMessage6(kanaMessage6);
 * entity.setKanaMessage7(kanaMessage7);
 * entity.setKanaMessage8(kanaMessage8);
 * entity.setKanaMessage9(kanaMessage9);
 * entity.setKanaMessage10(kanaMessage10);
 * entity.setDeliveryNoteSummary(deliveryNoteSummary);
 * entity.setInvoiceSummary(invoiceSummary);
 * entity.setEcOrderNo(ecOrderNo);
 * entity.setPaymentTypeCd(paymentTypeCd);
 * entity.setPriceHiddenFlg(priceHiddenFlg);
 * entity.setPaymentHiddenFlg(paymentHiddenFlg);
 * entity.setDirectUpdFlg(directUpdFlg);
 * entity.setIfId(ifId);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setPsam(psam);
 * entity.setFloorCompFlg(floorCompFlg);
 * entity.setDeliveryType(deliveryType);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingInstH extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shippingInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} */
    protected Long _processTypeId;

    /** INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    protected String _inputType;

    /** SHIPPING_DT: {IX, NotNull, VARCHAR(8)} */
    protected String _shippingDt;

    /** WORK_DT: {IX, VARCHAR(8)} */
    protected String _workDt;

    /** DELIV_PLAN_DT: {VARCHAR(8)} */
    protected String _delivPlanDt;

    /** DELIV_DT: {VARCHAR(8)} */
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} */
    protected String _delivTz;

    /** CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} */
    protected String _clientShippingNo;

    /** SHIPPING_SLIP_NO: {IX, VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} */
    protected String _shippingStatus;

    /** SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} */
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {VARCHAR(30)} */
    protected String _delivCustomerCd;

    /** DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} */
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {VARCHAR(255)} */
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {VARCHAR(255)} */
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {VARCHAR(255)} */
    protected String _delivAddress3;

    /** DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} */
    protected String _delivAddressSupply;

    /** DELIV_CUSTOMER_NM: {VARCHAR(255)} */
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM1: {VARCHAR(255)} */
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {VARCHAR(255)} */
    protected String _delivCustomerNm2;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} */
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {IX, VARCHAR(30)} */
    protected String _deliveryCourseCd;

    /** EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} */
    protected String _emergencyFlg;

    /** PICKING_WORK_MESSAGE: {VARCHAR(255)} */
    protected String _pickingWorkMessage;

    /** ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** PICKING_BATCH_NO: {IX, VARCHAR(30)} */
    protected String _pickingBatchNo;

    /** STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} */
    protected String _stockOutFlg;

    /** ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} */
    protected Long _allocInstHId;

    /** COD: {BIGINT(19)} */
    protected Long _cod;

    /** COD_TAX: {BIGINT(19)} */
    protected Long _codTax;

    /** TOTAL_PRICE: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _totalTax;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    protected String _daihyoNizoroeNo2;

    /** SHIPPING_TYPE_ID: {BIGINT(19)} */
    protected Long _shippingTypeId;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    protected String _shippingTypeCd;

    /** CARRIER_ID: {VARCHAR(30)} */
    protected String _carrierId;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    protected String _salesOrderNo;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _salesOrderSlipTypeCd;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    protected String _salesOrderSlipNo;

    /** ORDER_DT: {VARCHAR(8)} */
    protected String _orderDt;

    /** KOKYAKU_CD: {VARCHAR(30)} */
    protected String _kokyakuCd;

    /** SHIPPING_FEE: {BIGINT(19)} */
    protected Long _shippingFee;

    /** SEPARATE_SHIPPING_FEE: {BIGINT(19)} */
    protected Long _separateShippingFee;

    /** COD_FEE: {BIGINT(19)} */
    protected Long _codFee;

    /** ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} */
    protected String _orderNoDeliveryNote;

    /** POINT: {BIGINT(19)} */
    protected Long _point;

    /** KOGUCHI_DELIVERY_FLG: {CHAR(1)} */
    protected String _koguchiDeliveryFlg;

    /** RECORD_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _recordSendFlg;

    /** CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} */
    protected String _carrierDataOutFlg;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    protected String _kohaiContractorNm;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** NIZOROE_ID: {BIGINT(19)} */
    protected Long _nizoroeId;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    protected String _nizoroeProcUnit;

    /** ACCOUNT_ID: {BIGINT(19)} */
    protected Long _accountId;

    /** ACCOUNT_CD: {VARCHAR(30)} */
    protected String _accountCd;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    protected String _shippingReasonCd;

    /** TRANSFER_FLG: {CHAR(1)} */
    protected String _transferFlg;

    /** TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} */
    protected String _tenhanshaSalesOrderNo;

    /** DELIV_CD: {VARCHAR(30)} */
    protected String _delivCd;

    /** SALES_ORDER_NUM: {BIGINT(19)} */
    protected Long _salesOrderNum;

    /** DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    protected String _directDeliveryTypeCd;

    /** SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    protected String _splitDeliveryTypeCd;

    /** CARRIER_TYPE_CD: {VARCHAR(30)} */
    protected String _carrierTypeCd;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(30)} */
    protected String _specifyDeliveryTime;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** DESTINATION_NM_KANA: {VARCHAR(60)} */
    protected String _destinationNmKana;

    /** DESTINATION_FAX: {VARCHAR(30)} */
    protected String _destinationFax;

    /** KANJI_MESSAGE1: {VARCHAR(60)} */
    protected String _kanjiMessage1;

    /** KANJI_MESSAGE2: {VARCHAR(60)} */
    protected String _kanjiMessage2;

    /** KANJI_MESSAGE3: {VARCHAR(60)} */
    protected String _kanjiMessage3;

    /** KANJI_MESSAGE4: {VARCHAR(60)} */
    protected String _kanjiMessage4;

    /** KANJI_MESSAGE5: {VARCHAR(60)} */
    protected String _kanjiMessage5;

    /** KANJI_MESSAGE6: {VARCHAR(60)} */
    protected String _kanjiMessage6;

    /** KANJI_MESSAGE7: {VARCHAR(60)} */
    protected String _kanjiMessage7;

    /** KANJI_MESSAGE8: {VARCHAR(60)} */
    protected String _kanjiMessage8;

    /** KANJI_MESSAGE9: {VARCHAR(60)} */
    protected String _kanjiMessage9;

    /** KANJI_MESSAGE10: {VARCHAR(60)} */
    protected String _kanjiMessage10;

    /** KANA_MESSAGE1: {VARCHAR(60)} */
    protected String _kanaMessage1;

    /** KANA_MESSAGE2: {VARCHAR(60)} */
    protected String _kanaMessage2;

    /** KANA_MESSAGE3: {VARCHAR(60)} */
    protected String _kanaMessage3;

    /** KANA_MESSAGE4: {VARCHAR(60)} */
    protected String _kanaMessage4;

    /** KANA_MESSAGE5: {VARCHAR(60)} */
    protected String _kanaMessage5;

    /** KANA_MESSAGE6: {VARCHAR(60)} */
    protected String _kanaMessage6;

    /** KANA_MESSAGE7: {VARCHAR(60)} */
    protected String _kanaMessage7;

    /** KANA_MESSAGE8: {VARCHAR(60)} */
    protected String _kanaMessage8;

    /** KANA_MESSAGE9: {VARCHAR(60)} */
    protected String _kanaMessage9;

    /** KANA_MESSAGE10: {VARCHAR(60)} */
    protected String _kanaMessage10;

    /** DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} */
    protected String _deliveryNoteSummary;

    /** INVOICE_SUMMARY: {VARCHAR(60)} */
    protected String _invoiceSummary;

    /** EC_ORDER_NO: {VARCHAR(30)} */
    protected String _ecOrderNo;

    /** PAYMENT_TYPE_CD: {VARCHAR(30)} */
    protected String _paymentTypeCd;

    /** PRICE_HIDDEN_FLG: {CHAR(1)} */
    protected String _priceHiddenFlg;

    /** PAYMENT_HIDDEN_FLG: {CHAR(1)} */
    protected String _paymentHiddenFlg;

    /** DIRECT_UPD_FLG: {CHAR(1)} */
    protected String _directUpdFlg;

    /** IF_ID: {VARCHAR(30)} */
    protected String _ifId;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    protected String _customerNm;

    /** PSAM: {VARCHAR(30)} */
    protected String _psam;

    /** FLOOR_COMP_FLG: {CHAR(1)} */
    protected String _floorCompFlg;

    /** DELIVERY_TYPE: {VARCHAR(30)} */
    protected String _deliveryType;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "t_shipping_inst_h";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_shippingInstHId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.InputType getInputTypeAsInputType() {
        return CDef.InputType.codeOf(getInputType());
    }

    /**
     * Set the value of inputType as the classification of InputType. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setInputTypeAsInputType(CDef.InputType cdef) {
        setInputType(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelivTz getDelivTzAsDelivTz() {
        return CDef.DelivTz.codeOf(getDelivTz());
    }

    /**
     * Set the value of delivTz as the classification of DelivTz. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelivTzAsDelivTz(CDef.DelivTz cdef) {
        setDelivTz(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ShippingStatus getShippingStatusAsShippingStatus() {
        return CDef.ShippingStatus.codeOf(getShippingStatus());
    }

    /**
     * Set the value of shippingStatus as the classification of ShippingStatus. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setShippingStatusAsShippingStatus(CDef.ShippingStatus cdef) {
        setShippingStatus(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.EmergencyFlg getEmergencyFlgAsEmergencyFlg() {
        return CDef.EmergencyFlg.codeOf(getEmergencyFlg());
    }

    /**
     * Set the value of emergencyFlg as the classification of EmergencyFlg. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg cdef) {
        setEmergencyFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.ErrorFlg getErrorFlgAsErrorFlg() {
        return CDef.ErrorFlg.codeOf(getErrorFlg());
    }

    /**
     * Set the value of errorFlg as the classification of ErrorFlg. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setErrorFlgAsErrorFlg(CDef.ErrorFlg cdef) {
        setErrorFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of stockOutFlg as the classification of StockOutFlg. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.StockOutFlg getStockOutFlgAsStockOutFlg() {
        return CDef.StockOutFlg.codeOf(getStockOutFlg());
    }

    /**
     * Set the value of stockOutFlg as the classification of StockOutFlg. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setStockOutFlgAsStockOutFlg(CDef.StockOutFlg cdef) {
        setStockOutFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of inputType as $00 (00). <br>
     * $00: 画面入力
     */
    public void setInputType_$00() {
        setInputTypeAsInputType(CDef.InputType.$00);
    }

    /**
     * Set the value of inputType as $10 (10). <br>
     * $10: アップロード
     */
    public void setInputType_$10() {
        setInputTypeAsInputType(CDef.InputType.$10);
    }

    /**
     * Set the value of inputType as $20 (20). <br>
     * $20: EDI
     */
    public void setInputType_$20() {
        setInputTypeAsInputType(CDef.InputType.$20);
    }

    /**
     * Set the value of inputType as $30 (30). <br>
     * $30: HT
     */
    public void setInputType_$30() {
        setInputTypeAsInputType(CDef.InputType.$30);
    }

    /**
     * Set the value of delivTz as $A (A). <br>
     * $A: 午前中
     */
    public void setDelivTz_$A() {
        setDelivTzAsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Set the value of delivTz as $B (B). <br>
     * $B: 12時～14時
     */
    public void setDelivTz_$B() {
        setDelivTzAsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Set the value of delivTz as $C (C). <br>
     * $C: 14時～16時
     */
    public void setDelivTz_$C() {
        setDelivTzAsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Set the value of delivTz as $D (D). <br>
     * $D: 16時～18時
     */
    public void setDelivTz_$D() {
        setDelivTzAsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Set the value of delivTz as $E (E). <br>
     * $E: 18時～20時
     */
    public void setDelivTz_$E() {
        setDelivTzAsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Set the value of delivTz as $F (F). <br>
     * $F: 18時～21時
     */
    public void setDelivTz_$F() {
        setDelivTzAsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Set the value of delivTz as $G (G). <br>
     * $G: 19時～21時
     */
    public void setDelivTz_$G() {
        setDelivTzAsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Set the value of delivTz as $H (H). <br>
     * $H: 20時～21時
     */
    public void setDelivTz_$H() {
        setDelivTzAsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Set the value of delivTz as $I (I). <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_$I() {
        setDelivTzAsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Set the value of delivTz as $J (J). <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_$J() {
        setDelivTzAsDelivTz(CDef.DelivTz.$J);
    }

    /**
     * Set the value of shippingStatus as $10 (10). <br>
     * $10: 未出荷
     */
    public void setShippingStatus_$10() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$10);
    }

    /**
     * Set the value of shippingStatus as $15 (15). <br>
     * $15: 出庫指示中
     */
    public void setShippingStatus_$15() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$15);
    }

    /**
     * Set the value of shippingStatus as $20 (20). <br>
     * $20: 出庫指示解除中
     */
    public void setShippingStatus_$20() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$20);
    }

    /**
     * Set the value of shippingStatus as $25 (25). <br>
     * $25: 出庫指示済
     */
    public void setShippingStatus_$25() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$25);
    }

    /**
     * Set the value of shippingStatus as $30 (30). <br>
     * $30: ピッキング中
     */
    public void setShippingStatus_$30() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$30);
    }

    /**
     * Set the value of shippingStatus as $35 (35). <br>
     * $35: ピッキング済
     */
    public void setShippingStatus_$35() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$35);
    }

    /**
     * Set the value of shippingStatus as $40 (40). <br>
     * $40: 出荷検品中
     */
    public void setShippingStatus_$40() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$40);
    }

    /**
     * Set the value of shippingStatus as $45 (45). <br>
     * $45: 出荷検品中断
     */
    public void setShippingStatus_$45() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$45);
    }

    /**
     * Set the value of shippingStatus as $50 (50). <br>
     * $50: 出荷検品済
     */
    public void setShippingStatus_$50() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$50);
    }

    /**
     * Set the value of shippingStatus as $55 (55). <br>
     * $55: 出荷確定済
     */
    public void setShippingStatus_$55() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$55);
    }

    /**
     * Set the value of shippingStatus as $90 (90). <br>
     * $90: キャンセル
     */
    public void setShippingStatus_$90() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$90);
    }

    /**
     * Set the value of shippingStatus as $99 (99). <br>
     * $99: エラー有
     */
    public void setShippingStatus_$99() {
        setShippingStatusAsShippingStatus(CDef.ShippingStatus.$99);
    }

    /**
     * Set the value of emergencyFlg as $0 (0). <br>
     * $0: 通常
     */
    public void setEmergencyFlg_$0() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Set the value of emergencyFlg as $1 (1). <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_$1() {
        setEmergencyFlgAsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    /**
     * Set the value of errorFlg as $0 (0). <br>
     * $0: エラー無
     */
    public void setErrorFlg_$0() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Set the value of errorFlg as $1 (1). <br>
     * $1: エラー有
     */
    public void setErrorFlg_$1() {
        setErrorFlgAsErrorFlg(CDef.ErrorFlg.$1);
    }

    /**
     * Set the value of stockOutFlg as $0 (0). <br>
     * $0: 欠品無
     */
    public void setStockOutFlg_$0() {
        setStockOutFlgAsStockOutFlg(CDef.StockOutFlg.$0);
    }

    /**
     * Set the value of stockOutFlg as $1 (1). <br>
     * $1: 欠品有
     */
    public void setStockOutFlg_$1() {
        setStockOutFlgAsStockOutFlg(CDef.StockOutFlg.$1);
    }

    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of inputType $00? <br>
     * $00: 画面入力
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$00() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$00) : false;
    }

    /**
     * Is the value of inputType $10? <br>
     * $10: アップロード
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$10() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$10) : false;
    }

    /**
     * Is the value of inputType $20? <br>
     * $20: EDI
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$20() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$20) : false;
    }

    /**
     * Is the value of inputType $30? <br>
     * $30: HT
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isInputType$30() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.equals(CDef.InputType.$30) : false;
    }

    /**
     * Is the value of delivTz $A? <br>
     * $A: 午前中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$A() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$A) : false;
    }

    /**
     * Is the value of delivTz $B? <br>
     * $B: 12時～14時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$B() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$B) : false;
    }

    /**
     * Is the value of delivTz $C? <br>
     * $C: 14時～16時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$C() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$C) : false;
    }

    /**
     * Is the value of delivTz $D? <br>
     * $D: 16時～18時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$D() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$D) : false;
    }

    /**
     * Is the value of delivTz $E? <br>
     * $E: 18時～20時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$E() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$E) : false;
    }

    /**
     * Is the value of delivTz $F? <br>
     * $F: 18時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$F() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$F) : false;
    }

    /**
     * Is the value of delivTz $G? <br>
     * $G: 19時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$G() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$G) : false;
    }

    /**
     * Is the value of delivTz $H? <br>
     * $H: 20時～21時
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$H() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$H) : false;
    }

    /**
     * Is the value of delivTz $I? <br>
     * $I: 午前10時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$I() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$I) : false;
    }

    /**
     * Is the value of delivTz $J? <br>
     * $J: 午後5時まで
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelivTz$J() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.equals(CDef.DelivTz.$J) : false;
    }

    /**
     * Is the value of shippingStatus $10? <br>
     * $10: 未出荷
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$10() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$10) : false;
    }

    /**
     * Is the value of shippingStatus $15? <br>
     * $15: 出庫指示中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$15() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$15) : false;
    }

    /**
     * Is the value of shippingStatus $20? <br>
     * $20: 出庫指示解除中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$20() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$20) : false;
    }

    /**
     * Is the value of shippingStatus $25? <br>
     * $25: 出庫指示済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$25() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$25) : false;
    }

    /**
     * Is the value of shippingStatus $30? <br>
     * $30: ピッキング中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$30() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$30) : false;
    }

    /**
     * Is the value of shippingStatus $35? <br>
     * $35: ピッキング済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$35() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$35) : false;
    }

    /**
     * Is the value of shippingStatus $40? <br>
     * $40: 出荷検品中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$40() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$40) : false;
    }

    /**
     * Is the value of shippingStatus $45? <br>
     * $45: 出荷検品中断
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$45() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$45) : false;
    }

    /**
     * Is the value of shippingStatus $50? <br>
     * $50: 出荷検品済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$50() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$50) : false;
    }

    /**
     * Is the value of shippingStatus $55? <br>
     * $55: 出荷確定済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$55() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$55) : false;
    }

    /**
     * Is the value of shippingStatus $90? <br>
     * $90: キャンセル
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$90() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$90) : false;
    }

    /**
     * Is the value of shippingStatus $99? <br>
     * $99: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isShippingStatus$99() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.equals(CDef.ShippingStatus.$99) : false;
    }

    /**
     * Is the value of emergencyFlg $0? <br>
     * $0: 通常
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$0() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$0) : false;
    }

    /**
     * Is the value of emergencyFlg $1? <br>
     * $1: 緊急
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isEmergencyFlg$1() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.equals(CDef.EmergencyFlg.$1) : false;
    }

    /**
     * Is the value of errorFlg $0? <br>
     * $0: エラー無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$0() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$0) : false;
    }

    /**
     * Is the value of errorFlg $1? <br>
     * $1: エラー有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isErrorFlg$1() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.equals(CDef.ErrorFlg.$1) : false;
    }

    /**
     * Is the value of stockOutFlg $0? <br>
     * $0: 欠品無
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutFlg$0() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.equals(CDef.StockOutFlg.$0) : false;
    }

    /**
     * Is the value of stockOutFlg $1? <br>
     * $1: 欠品有
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isStockOutFlg$1() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.equals(CDef.StockOutFlg.$1) : false;
    }

    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'inputType' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getInputTypeName() {
        CDef.InputType cdef = getInputTypeAsInputType();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delivTz' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelivTzName() {
        CDef.DelivTz cdef = getDelivTzAsDelivTz();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'shippingStatus' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getShippingStatusName() {
        CDef.ShippingStatus cdef = getShippingStatusAsShippingStatus();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'emergencyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getEmergencyFlgName() {
        CDef.EmergencyFlg cdef = getEmergencyFlgAsEmergencyFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'errorFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getErrorFlgName() {
        CDef.ErrorFlg cdef = getErrorFlgAsErrorFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'stockOutFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getStockOutFlgName() {
        CDef.StockOutFlg cdef = getStockOutFlgAsStockOutFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. */
    protected MDeliveryCourse _mDeliveryCourse;

    /**
     * [get] m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'. <br>
     * @return The entity of foreign property 'MDeliveryCourse'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MDeliveryCourse getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    /**
     * [set] m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param mDeliveryCourse The entity of foreign property 'MDeliveryCourse'. (NullAllowed)
     */
    public void setMDeliveryCourse(MDeliveryCourse mDeliveryCourse) {
        _mDeliveryCourse = mDeliveryCourse;
    }

    /** m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. */
    protected MProcessType _mProcessType;

    /**
     * [get] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'. <br>
     * @return The entity of foreign property 'MProcessType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MProcessType getMProcessType() {
        return _mProcessType;
    }

    /**
     * [set] m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param mProcessType The entity of foreign property 'MProcessType'. (NullAllowed)
     */
    public void setMProcessType(MProcessType mProcessType) {
        _mProcessType = mProcessType;
    }

    /** m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. */
    protected MCustomer _mCustomerByDelivCustomerId;

    /**
     * [get] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerByDelivCustomerId() {
        return _mCustomerByDelivCustomerId;
    }

    /**
     * [set] m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param mCustomerByDelivCustomerId The entity of foreign property 'MCustomerByDelivCustomerId'. (NullAllowed)
     */
    public void setMCustomerByDelivCustomerId(MCustomer mCustomerByDelivCustomerId) {
        _mCustomerByDelivCustomerId = mCustomerByDelivCustomerId;
    }

    /** m_client by my CLIENT_ID, named 'MClient'. */
    protected MClient _mClient;

    /**
     * [get] m_client by my CLIENT_ID, named 'MClient'. <br>
     * @return The entity of foreign property 'MClient'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MClient getMClient() {
        return _mClient;
    }

    /**
     * [set] m_client by my CLIENT_ID, named 'MClient'.
     * @param mClient The entity of foreign property 'MClient'. (NullAllowed)
     */
    public void setMClient(MClient mClient) {
        _mClient = mClient;
    }

    /** m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. */
    protected MCustomer _mCustomerBySupplyCustomerId;

    /**
     * [get] m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'. <br>
     * @return The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCustomer getMCustomerBySupplyCustomerId() {
        return _mCustomerBySupplyCustomerId;
    }

    /**
     * [set] m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param mCustomerBySupplyCustomerId The entity of foreign property 'MCustomerBySupplyCustomerId'. (NullAllowed)
     */
    public void setMCustomerBySupplyCustomerId(MCustomer mCustomerBySupplyCustomerId) {
        _mCustomerBySupplyCustomerId = mCustomerBySupplyCustomerId;
    }

    /** t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'. */
    protected TAllocInstH _tAllocInstH;

    /**
     * [get] t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'. <br>
     * @return The entity of foreign property 'TAllocInstH'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public TAllocInstH getTAllocInstH() {
        return _tAllocInstH;
    }

    /**
     * [set] t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param tAllocInstH The entity of foreign property 'TAllocInstH'. (NullAllowed)
     */
    public void setTAllocInstH(TAllocInstH tAllocInstH) {
        _tAllocInstH = tAllocInstH;
    }

    /** m_center by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] m_center by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] m_center by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    /** m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'. */
    protected MZip _mZipForDeliv;

    /**
     * [get] m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'. <br>
     * @return The entity of foreign property 'MZipForDeliv'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MZip getMZipForDeliv() {
        return _mZipForDeliv;
    }

    /**
     * [set] m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @param mZipForDeliv The entity of foreign property 'MZipForDeliv'. (NullAllowed)
     */
    public void setMZipForDeliv(MZip mZipForDeliv) {
        _mZipForDeliv = mZipForDeliv;
    }

    /** b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'. */
    protected BClassDtl _bClassDtlByDelivTz;

    /**
     * [get] b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'. <br>
     * @return The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByDelivTz() {
        return _bClassDtlByDelivTz;
    }

    /**
     * [set] b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @param bClassDtlByDelivTz The entity of foreign property 'BClassDtlByDelivTz'. (NullAllowed)
     */
    public void setBClassDtlByDelivTz(BClassDtl bClassDtlByDelivTz) {
        _bClassDtlByDelivTz = bClassDtlByDelivTz;
    }

    /** b_class_dtl by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. */
    protected BClassDtl _bClassDtlByEmergencyFlg;

    /**
     * [get] b_class_dtl by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByEmergencyFlg() {
        return _bClassDtlByEmergencyFlg;
    }

    /**
     * [set] b_class_dtl by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @param bClassDtlByEmergencyFlg The entity of foreign property 'BClassDtlByEmergencyFlg'. (NullAllowed)
     */
    public void setBClassDtlByEmergencyFlg(BClassDtl bClassDtlByEmergencyFlg) {
        _bClassDtlByEmergencyFlg = bClassDtlByEmergencyFlg;
    }

    /** b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. */
    protected BClassDtl _bClassDtlByErrorFlg;

    /**
     * [get] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    /**
     * [set] b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @param bClassDtlByErrorFlg The entity of foreign property 'BClassDtlByErrorFlg'. (NullAllowed)
     */
    public void setBClassDtlByErrorFlg(BClassDtl bClassDtlByErrorFlg) {
        _bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    /** b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'. */
    protected BClassDtl _bClassDtlByInputType;

    /**
     * [get] b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'. <br>
     * @return The entity of foreign property 'BClassDtlByInputType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    /**
     * [set] b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @param bClassDtlByInputType The entity of foreign property 'BClassDtlByInputType'. (NullAllowed)
     */
    public void setBClassDtlByInputType(BClassDtl bClassDtlByInputType) {
        _bClassDtlByInputType = bClassDtlByInputType;
    }

    /** b_class_dtl by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'. */
    protected BClassDtl _bClassDtlByShippingStatus;

    /**
     * [get] b_class_dtl by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'. <br>
     * @return The entity of foreign property 'BClassDtlByShippingStatus'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByShippingStatus() {
        return _bClassDtlByShippingStatus;
    }

    /**
     * [set] b_class_dtl by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * @param bClassDtlByShippingStatus The entity of foreign property 'BClassDtlByShippingStatus'. (NullAllowed)
     */
    public void setBClassDtlByShippingStatus(BClassDtl bClassDtlByShippingStatus) {
        _bClassDtlByShippingStatus = bClassDtlByShippingStatus;
    }

    /** b_class_dtl by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'. */
    protected BClassDtl _bClassDtlByStockOutFlg;

    /**
     * [get] b_class_dtl by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'. <br>
     * @return The entity of foreign property 'BClassDtlByStockOutFlg'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByStockOutFlg() {
        return _bClassDtlByStockOutFlg;
    }

    /**
     * [set] b_class_dtl by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * @param bClassDtlByStockOutFlg The entity of foreign property 'BClassDtlByStockOutFlg'. (NullAllowed)
     */
    public void setBClassDtlByStockOutFlg(BClassDtl bClassDtlByStockOutFlg) {
        _bClassDtlByStockOutFlg = bClassDtlByStockOutFlg;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHList'. */
    protected List<TEcOrderH> _tEcOrderHList;

    /**
     * [get] t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * @return The entity list of referrer property 'TEcOrderHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TEcOrderH> getTEcOrderHList() {
        if (_tEcOrderHList == null) { _tEcOrderHList = newReferrerList(); }
        return _tEcOrderHList;
    }

    /**
     * [set] t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * @param tEcOrderHList The entity list of referrer property 'TEcOrderHList'. (NullAllowed)
     */
    public void setTEcOrderHList(List<TEcOrderH> tEcOrderHList) {
        _tEcOrderHList = tEcOrderHList;
    }

    /** t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBList'. */
    protected List<TShippingInstB> _tShippingInstBList;

    /**
     * [get] t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * @return The entity list of referrer property 'TShippingInstBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstB> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = newReferrerList(); }
        return _tShippingInstBList;
    }

    /**
     * [set] t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * @param tShippingInstBList The entity list of referrer property 'TShippingInstBList'. (NullAllowed)
     */
    public void setTShippingInstBList(List<TShippingInstB> tShippingInstBList) {
        _tShippingInstBList = tShippingInstBList;
    }

    /** t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintList'. */
    protected List<TShippingInstHPrint> _tShippingInstHPrintList;

    /**
     * [get] t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintList'.
     * @return The entity list of referrer property 'TShippingInstHPrintList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstHPrint> getTShippingInstHPrintList() {
        if (_tShippingInstHPrintList == null) { _tShippingInstHPrintList = newReferrerList(); }
        return _tShippingInstHPrintList;
    }

    /**
     * [set] t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintList'.
     * @param tShippingInstHPrintList The entity list of referrer property 'TShippingInstHPrintList'. (NullAllowed)
     */
    public void setTShippingInstHPrintList(List<TShippingInstHPrint> tShippingInstHPrintList) {
        _tShippingInstHPrintList = tShippingInstHPrintList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTShippingInstH) {
            BsTShippingInstH other = (BsTShippingInstH)obj;
            if (!xSV(_shippingInstHId, other._shippingInstHId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstHId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mDeliveryCourse != null)
        { sb.append(li).append(xbRDS(_mDeliveryCourse, "mDeliveryCourse")); }
        if (_mProcessType != null)
        { sb.append(li).append(xbRDS(_mProcessType, "mProcessType")); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerByDelivCustomerId, "mCustomerByDelivCustomerId")); }
        if (_mClient != null)
        { sb.append(li).append(xbRDS(_mClient, "mClient")); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(li).append(xbRDS(_mCustomerBySupplyCustomerId, "mCustomerBySupplyCustomerId")); }
        if (_tAllocInstH != null)
        { sb.append(li).append(xbRDS(_tAllocInstH, "tAllocInstH")); }
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        if (_mZipForDeliv != null)
        { sb.append(li).append(xbRDS(_mZipForDeliv, "mZipForDeliv")); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(li).append(xbRDS(_bClassDtlByDelivTz, "bClassDtlByDelivTz")); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByEmergencyFlg, "bClassDtlByEmergencyFlg")); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByErrorFlg, "bClassDtlByErrorFlg")); }
        if (_bClassDtlByInputType != null)
        { sb.append(li).append(xbRDS(_bClassDtlByInputType, "bClassDtlByInputType")); }
        if (_bClassDtlByShippingStatus != null)
        { sb.append(li).append(xbRDS(_bClassDtlByShippingStatus, "bClassDtlByShippingStatus")); }
        if (_bClassDtlByStockOutFlg != null)
        { sb.append(li).append(xbRDS(_bClassDtlByStockOutFlg, "bClassDtlByStockOutFlg")); }
        if (_tEcOrderHList != null) { for (TEcOrderH et : _tEcOrderHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tEcOrderHList")); } } }
        if (_tShippingInstBList != null) { for (TShippingInstB et : _tShippingInstBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstBList")); } } }
        if (_tShippingInstHPrintList != null) { for (TShippingInstHPrint et : _tShippingInstHPrintList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHPrintList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstHId));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_processTypeId));
        sb.append(dm).append(xfND(_inputType));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_workDt));
        sb.append(dm).append(xfND(_delivPlanDt));
        sb.append(dm).append(xfND(_delivDt));
        sb.append(dm).append(xfND(_delivTz));
        sb.append(dm).append(xfND(_clientShippingNo));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingStatus));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyCustomerCd));
        sb.append(dm).append(xfND(_supplyCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerId));
        sb.append(dm).append(xfND(_delivCustomerCd));
        sb.append(dm).append(xfND(_delivZipCd));
        sb.append(dm).append(xfND(_delivAddress1));
        sb.append(dm).append(xfND(_delivAddress2));
        sb.append(dm).append(xfND(_delivAddress3));
        sb.append(dm).append(xfND(_delivAddressSupply));
        sb.append(dm).append(xfND(_delivCustomerNm));
        sb.append(dm).append(xfND(_delivCustomerNm1));
        sb.append(dm).append(xfND(_delivCustomerNm2));
        sb.append(dm).append(xfND(_delivTelNo));
        sb.append(dm).append(xfND(_deliveryCourseId));
        sb.append(dm).append(xfND(_deliveryCourseCd));
        sb.append(dm).append(xfND(_emergencyFlg));
        sb.append(dm).append(xfND(_pickingWorkMessage));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_pickingBatchNo));
        sb.append(dm).append(xfND(_stockOutFlg));
        sb.append(dm).append(xfND(_allocInstHId));
        sb.append(dm).append(xfND(_cod));
        sb.append(dm).append(xfND(_codTax));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_totalTax));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_daihyoNizoroeNo));
        sb.append(dm).append(xfND(_nizoroeNo2));
        sb.append(dm).append(xfND(_daihyoNizoroeNo2));
        sb.append(dm).append(xfND(_shippingTypeId));
        sb.append(dm).append(xfND(_shippingTypeCd));
        sb.append(dm).append(xfND(_carrierId));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_salesOrderNo));
        sb.append(dm).append(xfND(_salesOrderSlipTypeCd));
        sb.append(dm).append(xfND(_salesOrderSlipNo));
        sb.append(dm).append(xfND(_orderDt));
        sb.append(dm).append(xfND(_kokyakuCd));
        sb.append(dm).append(xfND(_shippingFee));
        sb.append(dm).append(xfND(_separateShippingFee));
        sb.append(dm).append(xfND(_codFee));
        sb.append(dm).append(xfND(_orderNoDeliveryNote));
        sb.append(dm).append(xfND(_point));
        sb.append(dm).append(xfND(_koguchiDeliveryFlg));
        sb.append(dm).append(xfND(_recordSendFlg));
        sb.append(dm).append(xfND(_carrierDataOutFlg));
        sb.append(dm).append(xfND(_kohaiContractorCd));
        sb.append(dm).append(xfND(_kohaiContractorNm));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_nizoroeId));
        sb.append(dm).append(xfND(_nizoroeProcUnit));
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_accountCd));
        sb.append(dm).append(xfND(_shippingReasonCd));
        sb.append(dm).append(xfND(_transferFlg));
        sb.append(dm).append(xfND(_tenhanshaSalesOrderNo));
        sb.append(dm).append(xfND(_delivCd));
        sb.append(dm).append(xfND(_salesOrderNum));
        sb.append(dm).append(xfND(_directDeliveryTypeCd));
        sb.append(dm).append(xfND(_splitDeliveryTypeCd));
        sb.append(dm).append(xfND(_carrierTypeCd));
        sb.append(dm).append(xfND(_specifyDeliveryDt));
        sb.append(dm).append(xfND(_specifyDeliveryTime));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_destinationNmKana));
        sb.append(dm).append(xfND(_destinationFax));
        sb.append(dm).append(xfND(_kanjiMessage1));
        sb.append(dm).append(xfND(_kanjiMessage2));
        sb.append(dm).append(xfND(_kanjiMessage3));
        sb.append(dm).append(xfND(_kanjiMessage4));
        sb.append(dm).append(xfND(_kanjiMessage5));
        sb.append(dm).append(xfND(_kanjiMessage6));
        sb.append(dm).append(xfND(_kanjiMessage7));
        sb.append(dm).append(xfND(_kanjiMessage8));
        sb.append(dm).append(xfND(_kanjiMessage9));
        sb.append(dm).append(xfND(_kanjiMessage10));
        sb.append(dm).append(xfND(_kanaMessage1));
        sb.append(dm).append(xfND(_kanaMessage2));
        sb.append(dm).append(xfND(_kanaMessage3));
        sb.append(dm).append(xfND(_kanaMessage4));
        sb.append(dm).append(xfND(_kanaMessage5));
        sb.append(dm).append(xfND(_kanaMessage6));
        sb.append(dm).append(xfND(_kanaMessage7));
        sb.append(dm).append(xfND(_kanaMessage8));
        sb.append(dm).append(xfND(_kanaMessage9));
        sb.append(dm).append(xfND(_kanaMessage10));
        sb.append(dm).append(xfND(_deliveryNoteSummary));
        sb.append(dm).append(xfND(_invoiceSummary));
        sb.append(dm).append(xfND(_ecOrderNo));
        sb.append(dm).append(xfND(_paymentTypeCd));
        sb.append(dm).append(xfND(_priceHiddenFlg));
        sb.append(dm).append(xfND(_paymentHiddenFlg));
        sb.append(dm).append(xfND(_directUpdFlg));
        sb.append(dm).append(xfND(_ifId));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_psam));
        sb.append(dm).append(xfND(_floorCompFlg));
        sb.append(dm).append(xfND(_deliveryType));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mDeliveryCourse != null)
        { sb.append(dm).append("mDeliveryCourse"); }
        if (_mProcessType != null)
        { sb.append(dm).append("mProcessType"); }
        if (_mCustomerByDelivCustomerId != null)
        { sb.append(dm).append("mCustomerByDelivCustomerId"); }
        if (_mClient != null)
        { sb.append(dm).append("mClient"); }
        if (_mCustomerBySupplyCustomerId != null)
        { sb.append(dm).append("mCustomerBySupplyCustomerId"); }
        if (_tAllocInstH != null)
        { sb.append(dm).append("tAllocInstH"); }
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (_mZipForDeliv != null)
        { sb.append(dm).append("mZipForDeliv"); }
        if (_bClassDtlByDelivTz != null)
        { sb.append(dm).append("bClassDtlByDelivTz"); }
        if (_bClassDtlByEmergencyFlg != null)
        { sb.append(dm).append("bClassDtlByEmergencyFlg"); }
        if (_bClassDtlByErrorFlg != null)
        { sb.append(dm).append("bClassDtlByErrorFlg"); }
        if (_bClassDtlByInputType != null)
        { sb.append(dm).append("bClassDtlByInputType"); }
        if (_bClassDtlByShippingStatus != null)
        { sb.append(dm).append("bClassDtlByShippingStatus"); }
        if (_bClassDtlByStockOutFlg != null)
        { sb.append(dm).append("bClassDtlByStockOutFlg"); }
        if (_tEcOrderHList != null && !_tEcOrderHList.isEmpty())
        { sb.append(dm).append("tEcOrderHList"); }
        if (_tShippingInstBList != null && !_tShippingInstBList.isEmpty())
        { sb.append(dm).append("tShippingInstBList"); }
        if (_tShippingInstHPrintList != null && !_tShippingInstHPrintList.isEmpty())
        { sb.append(dm).append("tShippingInstHPrintList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TShippingInstH clone() {
        return (TShippingInstH)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstHId() {
        checkSpecifiedProperty("shippingInstHId");
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        registerModifiedProperty("shippingInstHId");
        _shippingInstHId = shippingInstHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getProcessTypeId() {
        checkSpecifiedProperty("processTypeId");
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setProcessTypeId(Long processTypeId) {
        registerModifiedProperty("processTypeId");
        _processTypeId = processTypeId;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getInputType() {
        checkSpecifiedProperty("inputType");
        return convertEmptyToNull(_inputType);
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputType(String inputType) {
        registerModifiedProperty("inputType");
        _inputType = inputType;
    }

    /**
     * [get] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (basically NotNull if update: for the constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getWorkDt() {
        checkSpecifiedProperty("workDt");
        return convertEmptyToNull(_workDt);
    }

    /**
     * [set] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkDt(String workDt) {
        registerModifiedProperty("workDt");
        _workDt = workDt;
    }

    /**
     * [get] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivPlanDt() {
        checkSpecifiedProperty("delivPlanDt");
        return convertEmptyToNull(_delivPlanDt);
    }

    /**
     * [set] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        registerModifiedProperty("delivPlanDt");
        _delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivDt() {
        checkSpecifiedProperty("delivDt");
        return convertEmptyToNull(_delivDt);
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivDt(String delivDt) {
        registerModifiedProperty("delivDt");
        _delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTz() {
        checkSpecifiedProperty("delivTz");
        return convertEmptyToNull(_delivTz);
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTz(String delivTz) {
        registerModifiedProperty("delivTz");
        _delivTz = delivTz;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientShippingNo() {
        checkSpecifiedProperty("clientShippingNo");
        return convertEmptyToNull(_clientShippingNo);
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientShippingNo(String clientShippingNo) {
        registerModifiedProperty("clientShippingNo");
        _clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (basically NotNull if selected: for the constraint)
     */
    public String getShippingStatus() {
        checkSpecifiedProperty("shippingStatus");
        return convertEmptyToNull(_shippingStatus);
    }

    /**
     * [set] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus} <br>
     * 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (basically NotNull if update: for the constraint)
     */
    public void setShippingStatus(String shippingStatus) {
        registerModifiedProperty("shippingStatus");
        _shippingStatus = shippingStatus;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerCd() {
        checkSpecifiedProperty("supplyCustomerCd");
        return convertEmptyToNull(_supplyCustomerCd);
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        registerModifiedProperty("supplyCustomerCd");
        _supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyCustomerNm() {
        checkSpecifiedProperty("supplyCustomerNm");
        return convertEmptyToNull(_supplyCustomerNm);
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        registerModifiedProperty("supplyCustomerNm");
        _supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDelivCustomerId() {
        checkSpecifiedProperty("delivCustomerId");
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        registerModifiedProperty("delivCustomerId");
        _delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerCd() {
        checkSpecifiedProperty("delivCustomerCd");
        return convertEmptyToNull(_delivCustomerCd);
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        registerModifiedProperty("delivCustomerCd");
        _delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivZipCd() {
        checkSpecifiedProperty("delivZipCd");
        return convertEmptyToNull(_delivZipCd);
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivZipCd(String delivZipCd) {
        registerModifiedProperty("delivZipCd");
        _delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress1() {
        checkSpecifiedProperty("delivAddress1");
        return convertEmptyToNull(_delivAddress1);
    }

    /**
     * [set] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress1(String delivAddress1) {
        registerModifiedProperty("delivAddress1");
        _delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress2() {
        checkSpecifiedProperty("delivAddress2");
        return convertEmptyToNull(_delivAddress2);
    }

    /**
     * [set] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress2(String delivAddress2) {
        registerModifiedProperty("delivAddress2");
        _delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddress3() {
        checkSpecifiedProperty("delivAddress3");
        return convertEmptyToNull(_delivAddress3);
    }

    /**
     * [set] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddress3(String delivAddress3) {
        registerModifiedProperty("delivAddress3");
        _delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivAddressSupply() {
        checkSpecifiedProperty("delivAddressSupply");
        return convertEmptyToNull(_delivAddressSupply);
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        registerModifiedProperty("delivAddressSupply");
        _delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm() {
        checkSpecifiedProperty("delivCustomerNm");
        return convertEmptyToNull(_delivCustomerNm);
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        registerModifiedProperty("delivCustomerNm");
        _delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm1() {
        checkSpecifiedProperty("delivCustomerNm1");
        return convertEmptyToNull(_delivCustomerNm1);
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        registerModifiedProperty("delivCustomerNm1");
        _delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCustomerNm2() {
        checkSpecifiedProperty("delivCustomerNm2");
        return convertEmptyToNull(_delivCustomerNm2);
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        registerModifiedProperty("delivCustomerNm2");
        _delivCustomerNm2 = delivCustomerNm2;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivTelNo() {
        checkSpecifiedProperty("delivTelNo");
        return convertEmptyToNull(_delivTelNo);
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivTelNo(String delivTelNo) {
        registerModifiedProperty("delivTelNo");
        _delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDeliveryCourseId() {
        checkSpecifiedProperty("deliveryCourseId");
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        registerModifiedProperty("deliveryCourseId");
        _deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {IX, VARCHAR(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryCourseCd() {
        checkSpecifiedProperty("deliveryCourseCd");
        return convertEmptyToNull(_deliveryCourseCd);
    }

    /**
     * [set] DELIVERY_COURSE_CD: {IX, VARCHAR(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        registerModifiedProperty("deliveryCourseCd");
        _deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmergencyFlg() {
        checkSpecifiedProperty("emergencyFlg");
        return convertEmptyToNull(_emergencyFlg);
    }

    /**
     * [set] EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        registerModifiedProperty("emergencyFlg");
        _emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingWorkMessage() {
        checkSpecifiedProperty("pickingWorkMessage");
        return convertEmptyToNull(_pickingWorkMessage);
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        registerModifiedProperty("pickingWorkMessage");
        _pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPickingBatchNo() {
        checkSpecifiedProperty("pickingBatchNo");
        return convertEmptyToNull(_pickingBatchNo);
    }

    /**
     * [set] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        registerModifiedProperty("pickingBatchNo");
        _pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockOutFlg() {
        checkSpecifiedProperty("stockOutFlg");
        return convertEmptyToNull(_stockOutFlg);
    }

    /**
     * [set] STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg} <br>
     * 欠品フラグ
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockOutFlg(String stockOutFlg) {
        registerModifiedProperty("stockOutFlg");
        _stockOutFlg = stockOutFlg;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAllocInstHId() {
        checkSpecifiedProperty("allocInstHId");
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAllocInstHId(Long allocInstHId) {
        registerModifiedProperty("allocInstHId");
        _allocInstHId = allocInstHId;
    }

    /**
     * [get] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @return The value of the column 'COD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCod() {
        checkSpecifiedProperty("cod");
        return _cod;
    }

    /**
     * [set] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @param cod The value of the column 'COD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCod(Long cod) {
        registerModifiedProperty("cod");
        _cod = cod;
    }

    /**
     * [get] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @return The value of the column 'COD_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCodTax() {
        checkSpecifiedProperty("codTax");
        return _codTax;
    }

    /**
     * [set] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @param codTax The value of the column 'COD_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodTax(Long codTax) {
        registerModifiedProperty("codTax");
        _codTax = codTax;
    }

    /**
     * [get] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalTax() {
        checkSpecifiedProperty("totalTax");
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        registerModifiedProperty("totalTax");
        _totalTax = totalTax;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo() {
        checkSpecifiedProperty("nizoroeNo");
        return convertEmptyToNull(_nizoroeNo);
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo(String nizoroeNo) {
        registerModifiedProperty("nizoroeNo");
        _nizoroeNo = nizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo() {
        checkSpecifiedProperty("daihyoNizoroeNo");
        return convertEmptyToNull(_daihyoNizoroeNo);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        registerModifiedProperty("daihyoNizoroeNo");
        _daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeNo2() {
        checkSpecifiedProperty("nizoroeNo2");
        return convertEmptyToNull(_nizoroeNo2);
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        registerModifiedProperty("nizoroeNo2");
        _nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDaihyoNizoroeNo2() {
        checkSpecifiedProperty("daihyoNizoroeNo2");
        return convertEmptyToNull(_daihyoNizoroeNo2);
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        registerModifiedProperty("daihyoNizoroeNo2");
        _daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @return The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingTypeId() {
        checkSpecifiedProperty("shippingTypeId");
        return _shippingTypeId;
    }

    /**
     * [set] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @param shippingTypeId The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTypeId(Long shippingTypeId) {
        registerModifiedProperty("shippingTypeId");
        _shippingTypeId = shippingTypeId;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTypeCd() {
        checkSpecifiedProperty("shippingTypeCd");
        return convertEmptyToNull(_shippingTypeCd);
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        registerModifiedProperty("shippingTypeCd");
        _shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] CARRIER_ID: {VARCHAR(30)} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierId() {
        checkSpecifiedProperty("carrierId");
        return convertEmptyToNull(_carrierId);
    }

    /**
     * [set] CARRIER_ID: {VARCHAR(30)} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierId(String carrierId) {
        registerModifiedProperty("carrierId");
        _carrierId = carrierId;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierCd() {
        checkSpecifiedProperty("carrierCd");
        return convertEmptyToNull(_carrierCd);
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierCd(String carrierCd) {
        registerModifiedProperty("carrierCd");
        _carrierCd = carrierCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @return The value of the column 'SALES_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderNo() {
        checkSpecifiedProperty("salesOrderNo");
        return convertEmptyToNull(_salesOrderNo);
    }

    /**
     * [set] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @param salesOrderNo The value of the column 'SALES_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderNo(String salesOrderNo) {
        registerModifiedProperty("salesOrderNo");
        _salesOrderNo = salesOrderNo;
    }

    /**
     * [get] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderSlipTypeCd() {
        checkSpecifiedProperty("salesOrderSlipTypeCd");
        return convertEmptyToNull(_salesOrderSlipTypeCd);
    }

    /**
     * [set] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderSlipTypeCd The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderSlipTypeCd(String salesOrderSlipTypeCd) {
        registerModifiedProperty("salesOrderSlipTypeCd");
        _salesOrderSlipTypeCd = salesOrderSlipTypeCd;
    }

    /**
     * [get] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @return The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrderSlipNo() {
        checkSpecifiedProperty("salesOrderSlipNo");
        return convertEmptyToNull(_salesOrderSlipNo);
    }

    /**
     * [set] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @param salesOrderSlipNo The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderSlipNo(String salesOrderSlipNo) {
        registerModifiedProperty("salesOrderSlipNo");
        _salesOrderSlipNo = salesOrderSlipNo;
    }

    /**
     * [get] ORDER_DT: {VARCHAR(8)} <br>
     * 注文日
     * @return The value of the column 'ORDER_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDt() {
        checkSpecifiedProperty("orderDt");
        return convertEmptyToNull(_orderDt);
    }

    /**
     * [set] ORDER_DT: {VARCHAR(8)} <br>
     * 注文日
     * @param orderDt The value of the column 'ORDER_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDt(String orderDt) {
        registerModifiedProperty("orderDt");
        _orderDt = orderDt;
    }

    /**
     * [get] KOKYAKU_CD: {VARCHAR(30)} <br>
     * 顧客CD
     * @return The value of the column 'KOKYAKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKokyakuCd() {
        checkSpecifiedProperty("kokyakuCd");
        return convertEmptyToNull(_kokyakuCd);
    }

    /**
     * [set] KOKYAKU_CD: {VARCHAR(30)} <br>
     * 顧客CD
     * @param kokyakuCd The value of the column 'KOKYAKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKokyakuCd(String kokyakuCd) {
        registerModifiedProperty("kokyakuCd");
        _kokyakuCd = kokyakuCd;
    }

    /**
     * [get] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @return The value of the column 'SHIPPING_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getShippingFee() {
        checkSpecifiedProperty("shippingFee");
        return _shippingFee;
    }

    /**
     * [set] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @param shippingFee The value of the column 'SHIPPING_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingFee(Long shippingFee) {
        registerModifiedProperty("shippingFee");
        _shippingFee = shippingFee;
    }

    /**
     * [get] SEPARATE_SHIPPING_FEE: {BIGINT(19)} <br>
     * 別途送料
     * @return The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSeparateShippingFee() {
        checkSpecifiedProperty("separateShippingFee");
        return _separateShippingFee;
    }

    /**
     * [set] SEPARATE_SHIPPING_FEE: {BIGINT(19)} <br>
     * 別途送料
     * @param separateShippingFee The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeparateShippingFee(Long separateShippingFee) {
        registerModifiedProperty("separateShippingFee");
        _separateShippingFee = separateShippingFee;
    }

    /**
     * [get] COD_FEE: {BIGINT(19)} <br>
     * 代引手数料
     * @return The value of the column 'COD_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCodFee() {
        checkSpecifiedProperty("codFee");
        return _codFee;
    }

    /**
     * [set] COD_FEE: {BIGINT(19)} <br>
     * 代引手数料
     * @param codFee The value of the column 'COD_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFee(Long codFee) {
        registerModifiedProperty("codFee");
        _codFee = codFee;
    }

    /**
     * [get] ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * 注文番号_納品書
     * @return The value of the column 'ORDER_NO_DELIVERY_NOTE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderNoDeliveryNote() {
        checkSpecifiedProperty("orderNoDeliveryNote");
        return convertEmptyToNull(_orderNoDeliveryNote);
    }

    /**
     * [set] ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * 注文番号_納品書
     * @param orderNoDeliveryNote The value of the column 'ORDER_NO_DELIVERY_NOTE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNoDeliveryNote(String orderNoDeliveryNote) {
        registerModifiedProperty("orderNoDeliveryNote");
        _orderNoDeliveryNote = orderNoDeliveryNote;
    }

    /**
     * [get] POINT: {BIGINT(19)} <br>
     * ポイント
     * @return The value of the column 'POINT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getPoint() {
        checkSpecifiedProperty("point");
        return _point;
    }

    /**
     * [set] POINT: {BIGINT(19)} <br>
     * ポイント
     * @param point The value of the column 'POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPoint(Long point) {
        registerModifiedProperty("point");
        _point = point;
    }

    /**
     * [get] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getKoguchiDeliveryFlg() {
        checkSpecifiedProperty("koguchiDeliveryFlg");
        return convertEmptyToNull(_koguchiDeliveryFlg);
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        registerModifiedProperty("koguchiDeliveryFlg");
        _koguchiDeliveryFlg = koguchiDeliveryFlg;
    }

    /**
     * [get] RECORD_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 実績送信フラグ
     * @return The value of the column 'RECORD_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getRecordSendFlg() {
        checkSpecifiedProperty("recordSendFlg");
        return convertEmptyToNull(_recordSendFlg);
    }

    /**
     * [set] RECORD_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 実績送信フラグ
     * @param recordSendFlg The value of the column 'RECORD_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRecordSendFlg(String recordSendFlg) {
        registerModifiedProperty("recordSendFlg");
        _recordSendFlg = recordSendFlg;
    }

    /**
     * [get] CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} <br>
     * 運送業者データ出力フラグ
     * @return The value of the column 'CARRIER_DATA_OUT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierDataOutFlg() {
        checkSpecifiedProperty("carrierDataOutFlg");
        return convertEmptyToNull(_carrierDataOutFlg);
    }

    /**
     * [set] CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]} <br>
     * 運送業者データ出力フラグ
     * @param carrierDataOutFlg The value of the column 'CARRIER_DATA_OUT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierDataOutFlg(String carrierDataOutFlg) {
        registerModifiedProperty("carrierDataOutFlg");
        _carrierDataOutFlg = carrierDataOutFlg;
    }

    /**
     * [get] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @return The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getKohaiContractorCd() {
        checkSpecifiedProperty("kohaiContractorCd");
        return convertEmptyToNull(_kohaiContractorCd);
    }

    /**
     * [set] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @param kohaiContractorCd The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKohaiContractorCd(String kohaiContractorCd) {
        registerModifiedProperty("kohaiContractorCd");
        _kohaiContractorCd = kohaiContractorCd;
    }

    /**
     * [get] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @return The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getKohaiContractorNm() {
        checkSpecifiedProperty("kohaiContractorNm");
        return convertEmptyToNull(_kohaiContractorNm);
    }

    /**
     * [set] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @param kohaiContractorNm The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKohaiContractorNm(String kohaiContractorNm) {
        registerModifiedProperty("kohaiContractorNm");
        _kohaiContractorNm = kohaiContractorNm;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPlantCd() {
        checkSpecifiedProperty("shippingPlantCd");
        return convertEmptyToNull(_shippingPlantCd);
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        registerModifiedProperty("shippingPlantCd");
        _shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStorageSpaceCd() {
        checkSpecifiedProperty("shippingStorageSpaceCd");
        return convertEmptyToNull(_shippingStorageSpaceCd);
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        registerModifiedProperty("shippingStorageSpaceCd");
        _shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] NIZOROE_ID: {BIGINT(19)} <br>
     * 荷揃処理ID
     * @return The value of the column 'NIZOROE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getNizoroeId() {
        checkSpecifiedProperty("nizoroeId");
        return _nizoroeId;
    }

    /**
     * [set] NIZOROE_ID: {BIGINT(19)} <br>
     * 荷揃処理ID
     * @param nizoroeId The value of the column 'NIZOROE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeId(Long nizoroeId) {
        registerModifiedProperty("nizoroeId");
        _nizoroeId = nizoroeId;
    }

    /**
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeProcUnit() {
        checkSpecifiedProperty("nizoroeProcUnit");
        return convertEmptyToNull(_nizoroeProcUnit);
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        registerModifiedProperty("nizoroeProcUnit");
        _nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] ACCOUNT_ID: {BIGINT(19)} <br>
     * 得意先ID
     * @return The value of the column 'ACCOUNT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {BIGINT(19)} <br>
     * 得意先ID
     * @param accountId The value of the column 'ACCOUNT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccountId(Long accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @return The value of the column 'ACCOUNT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAccountCd() {
        checkSpecifiedProperty("accountCd");
        return convertEmptyToNull(_accountCd);
    }

    /**
     * [set] ACCOUNT_CD: {VARCHAR(30)} <br>
     * 得意先CD
     * @param accountCd The value of the column 'ACCOUNT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccountCd(String accountCd) {
        registerModifiedProperty("accountCd");
        _accountCd = accountCd;
    }

    /**
     * [get] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingReasonCd() {
        checkSpecifiedProperty("shippingReasonCd");
        return convertEmptyToNull(_shippingReasonCd);
    }

    /**
     * [set] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @param shippingReasonCd The value of the column 'SHIPPING_REASON_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingReasonCd(String shippingReasonCd) {
        registerModifiedProperty("shippingReasonCd");
        _shippingReasonCd = shippingReasonCd;
    }

    /**
     * [get] TRANSFER_FLG: {CHAR(1)} <br>
     * 通常振替フラグ
     * @return The value of the column 'TRANSFER_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTransferFlg() {
        checkSpecifiedProperty("transferFlg");
        return convertEmptyToNull(_transferFlg);
    }

    /**
     * [set] TRANSFER_FLG: {CHAR(1)} <br>
     * 通常振替フラグ
     * @param transferFlg The value of the column 'TRANSFER_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransferFlg(String transferFlg) {
        registerModifiedProperty("transferFlg");
        _transferFlg = transferFlg;
    }

    /**
     * [get] TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_SALES_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaSalesOrderNo() {
        checkSpecifiedProperty("tenhanshaSalesOrderNo");
        return convertEmptyToNull(_tenhanshaSalesOrderNo);
    }

    /**
     * [set] TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaSalesOrderNo The value of the column 'TENHANSHA_SALES_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaSalesOrderNo(String tenhanshaSalesOrderNo) {
        registerModifiedProperty("tenhanshaSalesOrderNo");
        _tenhanshaSalesOrderNo = tenhanshaSalesOrderNo;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivCd() {
        checkSpecifiedProperty("delivCd");
        return convertEmptyToNull(_delivCd);
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivCd(String delivCd) {
        registerModifiedProperty("delivCd");
        _delivCd = delivCd;
    }

    /**
     * [get] SALES_ORDER_NUM: {BIGINT(19)} <br>
     * 受注数量
     * @return The value of the column 'SALES_ORDER_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSalesOrderNum() {
        checkSpecifiedProperty("salesOrderNum");
        return _salesOrderNum;
    }

    /**
     * [set] SALES_ORDER_NUM: {BIGINT(19)} <br>
     * 受注数量
     * @param salesOrderNum The value of the column 'SALES_ORDER_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrderNum(Long salesOrderNum) {
        registerModifiedProperty("salesOrderNum");
        _salesOrderNum = salesOrderNum;
    }

    /**
     * [get] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @return The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectDeliveryTypeCd() {
        checkSpecifiedProperty("directDeliveryTypeCd");
        return convertEmptyToNull(_directDeliveryTypeCd);
    }

    /**
     * [set] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @param directDeliveryTypeCd The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectDeliveryTypeCd(String directDeliveryTypeCd) {
        registerModifiedProperty("directDeliveryTypeCd");
        _directDeliveryTypeCd = directDeliveryTypeCd;
    }

    /**
     * [get] SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 分納区分
     * @return The value of the column 'SPLIT_DELIVERY_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSplitDeliveryTypeCd() {
        checkSpecifiedProperty("splitDeliveryTypeCd");
        return convertEmptyToNull(_splitDeliveryTypeCd);
    }

    /**
     * [set] SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 分納区分
     * @param splitDeliveryTypeCd The value of the column 'SPLIT_DELIVERY_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSplitDeliveryTypeCd(String splitDeliveryTypeCd) {
        registerModifiedProperty("splitDeliveryTypeCd");
        _splitDeliveryTypeCd = splitDeliveryTypeCd;
    }

    /**
     * [get] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @return The value of the column 'CARRIER_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarrierTypeCd() {
        checkSpecifiedProperty("carrierTypeCd");
        return convertEmptyToNull(_carrierTypeCd);
    }

    /**
     * [set] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @param carrierTypeCd The value of the column 'CARRIER_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarrierTypeCd(String carrierTypeCd) {
        registerModifiedProperty("carrierTypeCd");
        _carrierTypeCd = carrierTypeCd;
    }

    /**
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryDt() {
        checkSpecifiedProperty("specifyDeliveryDt");
        return convertEmptyToNull(_specifyDeliveryDt);
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @param specifyDeliveryDt The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
        registerModifiedProperty("specifyDeliveryDt");
        _specifyDeliveryDt = specifyDeliveryDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryTime() {
        checkSpecifiedProperty("specifyDeliveryTime");
        return convertEmptyToNull(_specifyDeliveryTime);
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        registerModifiedProperty("specifyDeliveryTime");
        _specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @return The value of the column 'DESTINATION_NM_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNmKana() {
        checkSpecifiedProperty("destinationNmKana");
        return convertEmptyToNull(_destinationNmKana);
    }

    /**
     * [set] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @param destinationNmKana The value of the column 'DESTINATION_NM_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNmKana(String destinationNmKana) {
        registerModifiedProperty("destinationNmKana");
        _destinationNmKana = destinationNmKana;
    }

    /**
     * [get] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @return The value of the column 'DESTINATION_FAX'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationFax() {
        checkSpecifiedProperty("destinationFax");
        return convertEmptyToNull(_destinationFax);
    }

    /**
     * [set] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @param destinationFax The value of the column 'DESTINATION_FAX'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationFax(String destinationFax) {
        registerModifiedProperty("destinationFax");
        _destinationFax = destinationFax;
    }

    /**
     * [get] KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * 漢字メッセージ_1
     * @return The value of the column 'KANJI_MESSAGE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage1() {
        checkSpecifiedProperty("kanjiMessage1");
        return convertEmptyToNull(_kanjiMessage1);
    }

    /**
     * [set] KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * 漢字メッセージ_1
     * @param kanjiMessage1 The value of the column 'KANJI_MESSAGE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage1(String kanjiMessage1) {
        registerModifiedProperty("kanjiMessage1");
        _kanjiMessage1 = kanjiMessage1;
    }

    /**
     * [get] KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * 漢字メッセージ_2
     * @return The value of the column 'KANJI_MESSAGE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage2() {
        checkSpecifiedProperty("kanjiMessage2");
        return convertEmptyToNull(_kanjiMessage2);
    }

    /**
     * [set] KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * 漢字メッセージ_2
     * @param kanjiMessage2 The value of the column 'KANJI_MESSAGE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage2(String kanjiMessage2) {
        registerModifiedProperty("kanjiMessage2");
        _kanjiMessage2 = kanjiMessage2;
    }

    /**
     * [get] KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * 漢字メッセージ_3
     * @return The value of the column 'KANJI_MESSAGE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage3() {
        checkSpecifiedProperty("kanjiMessage3");
        return convertEmptyToNull(_kanjiMessage3);
    }

    /**
     * [set] KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * 漢字メッセージ_3
     * @param kanjiMessage3 The value of the column 'KANJI_MESSAGE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage3(String kanjiMessage3) {
        registerModifiedProperty("kanjiMessage3");
        _kanjiMessage3 = kanjiMessage3;
    }

    /**
     * [get] KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * 漢字メッセージ_4
     * @return The value of the column 'KANJI_MESSAGE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage4() {
        checkSpecifiedProperty("kanjiMessage4");
        return convertEmptyToNull(_kanjiMessage4);
    }

    /**
     * [set] KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * 漢字メッセージ_4
     * @param kanjiMessage4 The value of the column 'KANJI_MESSAGE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage4(String kanjiMessage4) {
        registerModifiedProperty("kanjiMessage4");
        _kanjiMessage4 = kanjiMessage4;
    }

    /**
     * [get] KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * 漢字メッセージ_5
     * @return The value of the column 'KANJI_MESSAGE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage5() {
        checkSpecifiedProperty("kanjiMessage5");
        return convertEmptyToNull(_kanjiMessage5);
    }

    /**
     * [set] KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * 漢字メッセージ_5
     * @param kanjiMessage5 The value of the column 'KANJI_MESSAGE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage5(String kanjiMessage5) {
        registerModifiedProperty("kanjiMessage5");
        _kanjiMessage5 = kanjiMessage5;
    }

    /**
     * [get] KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * 漢字メッセージ_6
     * @return The value of the column 'KANJI_MESSAGE6'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage6() {
        checkSpecifiedProperty("kanjiMessage6");
        return convertEmptyToNull(_kanjiMessage6);
    }

    /**
     * [set] KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * 漢字メッセージ_6
     * @param kanjiMessage6 The value of the column 'KANJI_MESSAGE6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage6(String kanjiMessage6) {
        registerModifiedProperty("kanjiMessage6");
        _kanjiMessage6 = kanjiMessage6;
    }

    /**
     * [get] KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * 漢字メッセージ_7
     * @return The value of the column 'KANJI_MESSAGE7'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage7() {
        checkSpecifiedProperty("kanjiMessage7");
        return convertEmptyToNull(_kanjiMessage7);
    }

    /**
     * [set] KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * 漢字メッセージ_7
     * @param kanjiMessage7 The value of the column 'KANJI_MESSAGE7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage7(String kanjiMessage7) {
        registerModifiedProperty("kanjiMessage7");
        _kanjiMessage7 = kanjiMessage7;
    }

    /**
     * [get] KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * 漢字メッセージ_8
     * @return The value of the column 'KANJI_MESSAGE8'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage8() {
        checkSpecifiedProperty("kanjiMessage8");
        return convertEmptyToNull(_kanjiMessage8);
    }

    /**
     * [set] KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * 漢字メッセージ_8
     * @param kanjiMessage8 The value of the column 'KANJI_MESSAGE8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage8(String kanjiMessage8) {
        registerModifiedProperty("kanjiMessage8");
        _kanjiMessage8 = kanjiMessage8;
    }

    /**
     * [get] KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * 漢字メッセージ_9
     * @return The value of the column 'KANJI_MESSAGE9'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage9() {
        checkSpecifiedProperty("kanjiMessage9");
        return convertEmptyToNull(_kanjiMessage9);
    }

    /**
     * [set] KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * 漢字メッセージ_9
     * @param kanjiMessage9 The value of the column 'KANJI_MESSAGE9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage9(String kanjiMessage9) {
        registerModifiedProperty("kanjiMessage9");
        _kanjiMessage9 = kanjiMessage9;
    }

    /**
     * [get] KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * 漢字メッセージ_10
     * @return The value of the column 'KANJI_MESSAGE10'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanjiMessage10() {
        checkSpecifiedProperty("kanjiMessage10");
        return convertEmptyToNull(_kanjiMessage10);
    }

    /**
     * [set] KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * 漢字メッセージ_10
     * @param kanjiMessage10 The value of the column 'KANJI_MESSAGE10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanjiMessage10(String kanjiMessage10) {
        registerModifiedProperty("kanjiMessage10");
        _kanjiMessage10 = kanjiMessage10;
    }

    /**
     * [get] KANA_MESSAGE1: {VARCHAR(60)} <br>
     * カナメッセージ_1
     * @return The value of the column 'KANA_MESSAGE1'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage1() {
        checkSpecifiedProperty("kanaMessage1");
        return convertEmptyToNull(_kanaMessage1);
    }

    /**
     * [set] KANA_MESSAGE1: {VARCHAR(60)} <br>
     * カナメッセージ_1
     * @param kanaMessage1 The value of the column 'KANA_MESSAGE1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage1(String kanaMessage1) {
        registerModifiedProperty("kanaMessage1");
        _kanaMessage1 = kanaMessage1;
    }

    /**
     * [get] KANA_MESSAGE2: {VARCHAR(60)} <br>
     * カナメッセージ_2
     * @return The value of the column 'KANA_MESSAGE2'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage2() {
        checkSpecifiedProperty("kanaMessage2");
        return convertEmptyToNull(_kanaMessage2);
    }

    /**
     * [set] KANA_MESSAGE2: {VARCHAR(60)} <br>
     * カナメッセージ_2
     * @param kanaMessage2 The value of the column 'KANA_MESSAGE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage2(String kanaMessage2) {
        registerModifiedProperty("kanaMessage2");
        _kanaMessage2 = kanaMessage2;
    }

    /**
     * [get] KANA_MESSAGE3: {VARCHAR(60)} <br>
     * カナメッセージ_3
     * @return The value of the column 'KANA_MESSAGE3'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage3() {
        checkSpecifiedProperty("kanaMessage3");
        return convertEmptyToNull(_kanaMessage3);
    }

    /**
     * [set] KANA_MESSAGE3: {VARCHAR(60)} <br>
     * カナメッセージ_3
     * @param kanaMessage3 The value of the column 'KANA_MESSAGE3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage3(String kanaMessage3) {
        registerModifiedProperty("kanaMessage3");
        _kanaMessage3 = kanaMessage3;
    }

    /**
     * [get] KANA_MESSAGE4: {VARCHAR(60)} <br>
     * カナメッセージ_4
     * @return The value of the column 'KANA_MESSAGE4'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage4() {
        checkSpecifiedProperty("kanaMessage4");
        return convertEmptyToNull(_kanaMessage4);
    }

    /**
     * [set] KANA_MESSAGE4: {VARCHAR(60)} <br>
     * カナメッセージ_4
     * @param kanaMessage4 The value of the column 'KANA_MESSAGE4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage4(String kanaMessage4) {
        registerModifiedProperty("kanaMessage4");
        _kanaMessage4 = kanaMessage4;
    }

    /**
     * [get] KANA_MESSAGE5: {VARCHAR(60)} <br>
     * カナメッセージ_5
     * @return The value of the column 'KANA_MESSAGE5'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage5() {
        checkSpecifiedProperty("kanaMessage5");
        return convertEmptyToNull(_kanaMessage5);
    }

    /**
     * [set] KANA_MESSAGE5: {VARCHAR(60)} <br>
     * カナメッセージ_5
     * @param kanaMessage5 The value of the column 'KANA_MESSAGE5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage5(String kanaMessage5) {
        registerModifiedProperty("kanaMessage5");
        _kanaMessage5 = kanaMessage5;
    }

    /**
     * [get] KANA_MESSAGE6: {VARCHAR(60)} <br>
     * カナメッセージ_6
     * @return The value of the column 'KANA_MESSAGE6'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage6() {
        checkSpecifiedProperty("kanaMessage6");
        return convertEmptyToNull(_kanaMessage6);
    }

    /**
     * [set] KANA_MESSAGE6: {VARCHAR(60)} <br>
     * カナメッセージ_6
     * @param kanaMessage6 The value of the column 'KANA_MESSAGE6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage6(String kanaMessage6) {
        registerModifiedProperty("kanaMessage6");
        _kanaMessage6 = kanaMessage6;
    }

    /**
     * [get] KANA_MESSAGE7: {VARCHAR(60)} <br>
     * カナメッセージ_7
     * @return The value of the column 'KANA_MESSAGE7'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage7() {
        checkSpecifiedProperty("kanaMessage7");
        return convertEmptyToNull(_kanaMessage7);
    }

    /**
     * [set] KANA_MESSAGE7: {VARCHAR(60)} <br>
     * カナメッセージ_7
     * @param kanaMessage7 The value of the column 'KANA_MESSAGE7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage7(String kanaMessage7) {
        registerModifiedProperty("kanaMessage7");
        _kanaMessage7 = kanaMessage7;
    }

    /**
     * [get] KANA_MESSAGE8: {VARCHAR(60)} <br>
     * カナメッセージ_8
     * @return The value of the column 'KANA_MESSAGE8'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage8() {
        checkSpecifiedProperty("kanaMessage8");
        return convertEmptyToNull(_kanaMessage8);
    }

    /**
     * [set] KANA_MESSAGE8: {VARCHAR(60)} <br>
     * カナメッセージ_8
     * @param kanaMessage8 The value of the column 'KANA_MESSAGE8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage8(String kanaMessage8) {
        registerModifiedProperty("kanaMessage8");
        _kanaMessage8 = kanaMessage8;
    }

    /**
     * [get] KANA_MESSAGE9: {VARCHAR(60)} <br>
     * カナメッセージ_9
     * @return The value of the column 'KANA_MESSAGE9'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage9() {
        checkSpecifiedProperty("kanaMessage9");
        return convertEmptyToNull(_kanaMessage9);
    }

    /**
     * [set] KANA_MESSAGE9: {VARCHAR(60)} <br>
     * カナメッセージ_9
     * @param kanaMessage9 The value of the column 'KANA_MESSAGE9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage9(String kanaMessage9) {
        registerModifiedProperty("kanaMessage9");
        _kanaMessage9 = kanaMessage9;
    }

    /**
     * [get] KANA_MESSAGE10: {VARCHAR(60)} <br>
     * カナメッセージ_10
     * @return The value of the column 'KANA_MESSAGE10'. (NullAllowed even if selected: for no constraint)
     */
    public String getKanaMessage10() {
        checkSpecifiedProperty("kanaMessage10");
        return convertEmptyToNull(_kanaMessage10);
    }

    /**
     * [set] KANA_MESSAGE10: {VARCHAR(60)} <br>
     * カナメッセージ_10
     * @param kanaMessage10 The value of the column 'KANA_MESSAGE10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKanaMessage10(String kanaMessage10) {
        registerModifiedProperty("kanaMessage10");
        _kanaMessage10 = kanaMessage10;
    }

    /**
     * [get] DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * 納品書摘要
     * @return The value of the column 'DELIVERY_NOTE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryNoteSummary() {
        checkSpecifiedProperty("deliveryNoteSummary");
        return convertEmptyToNull(_deliveryNoteSummary);
    }

    /**
     * [set] DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * 納品書摘要
     * @param deliveryNoteSummary The value of the column 'DELIVERY_NOTE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryNoteSummary(String deliveryNoteSummary) {
        registerModifiedProperty("deliveryNoteSummary");
        _deliveryNoteSummary = deliveryNoteSummary;
    }

    /**
     * [get] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * 送り状摘要
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed even if selected: for no constraint)
     */
    public String getInvoiceSummary() {
        checkSpecifiedProperty("invoiceSummary");
        return convertEmptyToNull(_invoiceSummary);
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * 送り状摘要
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        registerModifiedProperty("invoiceSummary");
        _invoiceSummary = invoiceSummary;
    }

    /**
     * [get] EC_ORDER_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号
     * @return The value of the column 'EC_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcOrderNo() {
        checkSpecifiedProperty("ecOrderNo");
        return convertEmptyToNull(_ecOrderNo);
    }

    /**
     * [set] EC_ORDER_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号
     * @param ecOrderNo The value of the column 'EC_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderNo(String ecOrderNo) {
        registerModifiedProperty("ecOrderNo");
        _ecOrderNo = ecOrderNo;
    }

    /**
     * [get] PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * 決済区分
     * @return The value of the column 'PAYMENT_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentTypeCd() {
        checkSpecifiedProperty("paymentTypeCd");
        return convertEmptyToNull(_paymentTypeCd);
    }

    /**
     * [set] PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * 決済区分
     * @param paymentTypeCd The value of the column 'PAYMENT_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentTypeCd(String paymentTypeCd) {
        registerModifiedProperty("paymentTypeCd");
        _paymentTypeCd = paymentTypeCd;
    }

    /**
     * [get] PRICE_HIDDEN_FLG: {CHAR(1)} <br>
     * 金額非表示フラグ
     * @return The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceHiddenFlg() {
        checkSpecifiedProperty("priceHiddenFlg");
        return convertEmptyToNull(_priceHiddenFlg);
    }

    /**
     * [set] PRICE_HIDDEN_FLG: {CHAR(1)} <br>
     * 金額非表示フラグ
     * @param priceHiddenFlg The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceHiddenFlg(String priceHiddenFlg) {
        registerModifiedProperty("priceHiddenFlg");
        _priceHiddenFlg = priceHiddenFlg;
    }

    /**
     * [get] PAYMENT_HIDDEN_FLG: {CHAR(1)} <br>
     * 決済非表示フラグ
     * @return The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentHiddenFlg() {
        checkSpecifiedProperty("paymentHiddenFlg");
        return convertEmptyToNull(_paymentHiddenFlg);
    }

    /**
     * [set] PAYMENT_HIDDEN_FLG: {CHAR(1)} <br>
     * 決済非表示フラグ
     * @param paymentHiddenFlg The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentHiddenFlg(String paymentHiddenFlg) {
        registerModifiedProperty("paymentHiddenFlg");
        _paymentHiddenFlg = paymentHiddenFlg;
    }

    /**
     * [get] DIRECT_UPD_FLG: {CHAR(1)} <br>
     * 直送扱い更新フラグ
     * @return The value of the column 'DIRECT_UPD_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDirectUpdFlg() {
        checkSpecifiedProperty("directUpdFlg");
        return convertEmptyToNull(_directUpdFlg);
    }

    /**
     * [set] DIRECT_UPD_FLG: {CHAR(1)} <br>
     * 直送扱い更新フラグ
     * @param directUpdFlg The value of the column 'DIRECT_UPD_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDirectUpdFlg(String directUpdFlg) {
        registerModifiedProperty("directUpdFlg");
        _directUpdFlg = directUpdFlg;
    }

    /**
     * [get] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @return The value of the column 'IF_ID'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfId() {
        checkSpecifiedProperty("ifId");
        return convertEmptyToNull(_ifId);
    }

    /**
     * [set] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @param ifId The value of the column 'IF_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfId(String ifId) {
        registerModifiedProperty("ifId");
        _ifId = ifId;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @return The value of the column 'PSAM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPsam() {
        checkSpecifiedProperty("psam");
        return convertEmptyToNull(_psam);
    }

    /**
     * [set] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @param psam The value of the column 'PSAM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPsam(String psam) {
        registerModifiedProperty("psam");
        _psam = psam;
    }

    /**
     * [get] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @return The value of the column 'FLOOR_COMP_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloorCompFlg() {
        checkSpecifiedProperty("floorCompFlg");
        return convertEmptyToNull(_floorCompFlg);
    }

    /**
     * [set] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @param floorCompFlg The value of the column 'FLOOR_COMP_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloorCompFlg(String floorCompFlg) {
        registerModifiedProperty("floorCompFlg");
        _floorCompFlg = floorCompFlg;
    }

    /**
     * [get] DELIVERY_TYPE: {VARCHAR(30)} <br>
     * 配送種別
     * @return The value of the column 'DELIVERY_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeliveryType() {
        checkSpecifiedProperty("deliveryType");
        return convertEmptyToNull(_deliveryType);
    }

    /**
     * [set] DELIVERY_TYPE: {VARCHAR(30)} <br>
     * 配送種別
     * @param deliveryType The value of the column 'DELIVERY_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeliveryType(String deliveryType) {
        registerModifiedProperty("deliveryType");
        _deliveryType = deliveryType;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
