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
 * The entity of e_shipping_inst as TABLE. <br>
 * 出荷指示受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_ID
 *
 * [column]
 *     SHIPPING_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SALES_ORDER_NO, HINMOKU_CD, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, NIZOROE_NO, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, CARRIER_CD, EXPRESS_CD, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, UNIT_PRICE, EC_ORDER_NO, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, ORDER_DT, KOKYAKU_CD, PAYMENT_TYPE_CD, TOTAL_PRICE, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, SALES_TAX_RATE, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, ORDER_NO_DELIVERY_NOTE, POINT, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, DELIV_CD, EMP_ID_CD, EMP_NM, IF_ID, DESTINATION_PREFECTURE, PSAM, FLOOR_COMP_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long shippingInstId = entity.getShippingInstId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String shippingSlipRowNo = entity.getShippingSlipRowNo();
 * String salesOrderNo = entity.getSalesOrderNo();
 * String hinmokuCd = entity.getHinmokuCd();
 * String salesOrderSlipTypeCd = entity.getSalesOrderSlipTypeCd();
 * String salesOrderSlipNo = entity.getSalesOrderSlipNo();
 * String nizoroeNo = entity.getNizoroeNo();
 * String shippingTypeCd = entity.getShippingTypeCd();
 * String shippingReasonCd = entity.getShippingReasonCd();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String shippingNum = entity.getShippingNum();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String unitNm = entity.getUnitNm();
 * String ecUnitNm = entity.getEcUnitNm();
 * String sampleTypeCd = entity.getSampleTypeCd();
 * String logiWeightFlg = entity.getLogiWeightFlg();
 * String logiAttentionTypeCd = entity.getLogiAttentionTypeCd();
 * String logiSpecialTypeCd = entity.getLogiSpecialTypeCd();
 * String directDeliveryTypeCd = entity.getDirectDeliveryTypeCd();
 * String koguchiDeliveryFlg = entity.getKoguchiDeliveryFlg();
 * String splitDeliveryTypeCd = entity.getSplitDeliveryTypeCd();
 * String carrierTypeCd = entity.getCarrierTypeCd();
 * String carrierCd = entity.getCarrierCd();
 * String expressCd = entity.getExpressCd();
 * String shippingDt = entity.getShippingDt();
 * String specifyDeliveryDt = entity.getSpecifyDeliveryDt();
 * String specifyDeliveryTime = entity.getSpecifyDeliveryTime();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaOrderNo = entity.getTenhanshaOrderNo();
 * String kohaiContractorCd = entity.getKohaiContractorCd();
 * String kohaiContractorNm = entity.getKohaiContractorNm();
 * String destinationCd = entity.getDestinationCd();
 * String destinationNm1 = entity.getDestinationNm1();
 * String destinationNm2 = entity.getDestinationNm2();
 * String destinationNmKana = entity.getDestinationNmKana();
 * String destinationZipCd = entity.getDestinationZipCd();
 * String destinationAddress1 = entity.getDestinationAddress1();
 * String destinationAddress2 = entity.getDestinationAddress2();
 * String destinationTel = entity.getDestinationTel();
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
 * String unitPrice = entity.getUnitPrice();
 * String ecOrderNo = entity.getEcOrderNo();
 * String ecOrderBranchNo = entity.getEcOrderBranchNo();
 * String ecProductNmKanji = entity.getEcProductNmKanji();
 * String orderDt = entity.getOrderDt();
 * String kokyakuCd = entity.getKokyakuCd();
 * String paymentTypeCd = entity.getPaymentTypeCd();
 * String totalPrice = entity.getTotalPrice();
 * String shippingFee = entity.getShippingFee();
 * String separateShippingFee = entity.getSeparateShippingFee();
 * String codFee = entity.getCodFee();
 * String salesTaxRate = entity.getSalesTaxRate();
 * String priceHiddenFlg = entity.getPriceHiddenFlg();
 * String paymentHiddenFlg = entity.getPaymentHiddenFlg();
 * String orderNoDeliveryNote = entity.getOrderNoDeliveryNote();
 * String point = entity.getPoint();
 * String storePlantCd = entity.getStorePlantCd();
 * String storeStorageSpaceCd = entity.getStoreStorageSpaceCd();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String lotManagTypeCd = entity.getLotManagTypeCd();
 * String dealTypeCd = entity.getDealTypeCd();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String delivCd = entity.getDelivCd();
 * String empIdCd = entity.getEmpIdCd();
 * String empNm = entity.getEmpNm();
 * String ifId = entity.getIfId();
 * String destinationPrefecture = entity.getDestinationPrefecture();
 * String psam = entity.getPsam();
 * String floorCompFlg = entity.getFloorCompFlg();
 * String sapAddYyyy = entity.getSapAddYyyy();
 * String sapAddMm = entity.getSapAddMm();
 * String sapAddDd = entity.getSapAddDd();
 * String sapAddHh = entity.getSapAddHh();
 * String sapAddMi = entity.getSapAddMi();
 * String sapAddSs = entity.getSapAddSs();
 * String sapAddUserCd = entity.getSapAddUserCd();
 * String sapUpdYyyy = entity.getSapUpdYyyy();
 * String sapUpdMm = entity.getSapUpdMm();
 * String sapUpdDd = entity.getSapUpdDd();
 * String sapUpdHh = entity.getSapUpdHh();
 * String sapUpdMi = entity.getSapUpdMi();
 * String sapUpdSs = entity.getSapUpdSs();
 * String sapUpdUserCd = entity.getSapUpdUserCd();
 * String dataTransferOnlyStr01 = entity.getDataTransferOnlyStr01();
 * String dataTransferOnlyStr02 = entity.getDataTransferOnlyStr02();
 * String dataTransferOnlyStr03 = entity.getDataTransferOnlyStr03();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setShippingInstId(shippingInstId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingSlipRowNo(shippingSlipRowNo);
 * entity.setSalesOrderNo(salesOrderNo);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setSalesOrderSlipTypeCd(salesOrderSlipTypeCd);
 * entity.setSalesOrderSlipNo(salesOrderSlipNo);
 * entity.setNizoroeNo(nizoroeNo);
 * entity.setShippingTypeCd(shippingTypeCd);
 * entity.setShippingReasonCd(shippingReasonCd);
 * entity.setHinmokuGroup(hinmokuGroup);
 * entity.setShippingNum(shippingNum);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setUnitNm(unitNm);
 * entity.setEcUnitNm(ecUnitNm);
 * entity.setSampleTypeCd(sampleTypeCd);
 * entity.setLogiWeightFlg(logiWeightFlg);
 * entity.setLogiAttentionTypeCd(logiAttentionTypeCd);
 * entity.setLogiSpecialTypeCd(logiSpecialTypeCd);
 * entity.setDirectDeliveryTypeCd(directDeliveryTypeCd);
 * entity.setKoguchiDeliveryFlg(koguchiDeliveryFlg);
 * entity.setSplitDeliveryTypeCd(splitDeliveryTypeCd);
 * entity.setCarrierTypeCd(carrierTypeCd);
 * entity.setCarrierCd(carrierCd);
 * entity.setExpressCd(expressCd);
 * entity.setShippingDt(shippingDt);
 * entity.setSpecifyDeliveryDt(specifyDeliveryDt);
 * entity.setSpecifyDeliveryTime(specifyDeliveryTime);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaOrderNo(tenhanshaOrderNo);
 * entity.setKohaiContractorCd(kohaiContractorCd);
 * entity.setKohaiContractorNm(kohaiContractorNm);
 * entity.setDestinationCd(destinationCd);
 * entity.setDestinationNm1(destinationNm1);
 * entity.setDestinationNm2(destinationNm2);
 * entity.setDestinationNmKana(destinationNmKana);
 * entity.setDestinationZipCd(destinationZipCd);
 * entity.setDestinationAddress1(destinationAddress1);
 * entity.setDestinationAddress2(destinationAddress2);
 * entity.setDestinationTel(destinationTel);
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
 * entity.setUnitPrice(unitPrice);
 * entity.setEcOrderNo(ecOrderNo);
 * entity.setEcOrderBranchNo(ecOrderBranchNo);
 * entity.setEcProductNmKanji(ecProductNmKanji);
 * entity.setOrderDt(orderDt);
 * entity.setKokyakuCd(kokyakuCd);
 * entity.setPaymentTypeCd(paymentTypeCd);
 * entity.setTotalPrice(totalPrice);
 * entity.setShippingFee(shippingFee);
 * entity.setSeparateShippingFee(separateShippingFee);
 * entity.setCodFee(codFee);
 * entity.setSalesTaxRate(salesTaxRate);
 * entity.setPriceHiddenFlg(priceHiddenFlg);
 * entity.setPaymentHiddenFlg(paymentHiddenFlg);
 * entity.setOrderNoDeliveryNote(orderNoDeliveryNote);
 * entity.setPoint(point);
 * entity.setStorePlantCd(storePlantCd);
 * entity.setStoreStorageSpaceCd(storeStorageSpaceCd);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setLotManagTypeCd(lotManagTypeCd);
 * entity.setDealTypeCd(dealTypeCd);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setDelivCd(delivCd);
 * entity.setEmpIdCd(empIdCd);
 * entity.setEmpNm(empNm);
 * entity.setIfId(ifId);
 * entity.setDestinationPrefecture(destinationPrefecture);
 * entity.setPsam(psam);
 * entity.setFloorCompFlg(floorCompFlg);
 * entity.setSapAddYyyy(sapAddYyyy);
 * entity.setSapAddMm(sapAddMm);
 * entity.setSapAddDd(sapAddDd);
 * entity.setSapAddHh(sapAddHh);
 * entity.setSapAddMi(sapAddMi);
 * entity.setSapAddSs(sapAddSs);
 * entity.setSapAddUserCd(sapAddUserCd);
 * entity.setSapUpdYyyy(sapUpdYyyy);
 * entity.setSapUpdMm(sapUpdMm);
 * entity.setSapUpdDd(sapUpdDd);
 * entity.setSapUpdHh(sapUpdHh);
 * entity.setSapUpdMi(sapUpdMi);
 * entity.setSapUpdSs(sapUpdSs);
 * entity.setSapUpdUserCd(sapUpdUserCd);
 * entity.setDataTransferOnlyStr01(dataTransferOnlyStr01);
 * entity.setDataTransferOnlyStr02(dataTransferOnlyStr02);
 * entity.setDataTransferOnlyStr03(dataTransferOnlyStr03);
 * entity.setSpareStr(spareStr);
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
public abstract class BsEShippingInst extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _shippingInstId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _shippingSlipRowNo;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    protected String _salesOrderNo;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _salesOrderSlipTypeCd;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    protected String _salesOrderSlipNo;

    /** NIZOROE_NO: {VARCHAR(30)} */
    protected String _nizoroeNo;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    protected String _shippingTypeCd;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    protected String _shippingReasonCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

    /** SHIPPING_NUM: {VARCHAR(30)} */
    protected String _shippingNum;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

    /** EC_UNIT_NM: {VARCHAR(30)} */
    protected String _ecUnitNm;

    /** SAMPLE_TYPE_CD: {VARCHAR(30)} */
    protected String _sampleTypeCd;

    /** LOGI_WEIGHT_FLG: {VARCHAR(30)} */
    protected String _logiWeightFlg;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    protected String _logiSpecialTypeCd;

    /** DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    protected String _directDeliveryTypeCd;

    /** KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} */
    protected String _koguchiDeliveryFlg;

    /** SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    protected String _splitDeliveryTypeCd;

    /** CARRIER_TYPE_CD: {VARCHAR(30)} */
    protected String _carrierTypeCd;

    /** CARRIER_CD: {VARCHAR(30)} */
    protected String _carrierCd;

    /** EXPRESS_CD: {VARCHAR(30)} */
    protected String _expressCd;

    /** SHIPPING_DT: {VARCHAR(30)} */
    protected String _shippingDt;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(30)} */
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(30)} */
    protected String _specifyDeliveryTime;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** TENHANSHA_ORDER_NO: {VARCHAR(30)} */
    protected String _tenhanshaOrderNo;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    protected String _kohaiContractorNm;

    /** DESTINATION_CD: {VARCHAR(30)} */
    protected String _destinationCd;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    protected String _destinationNm2;

    /** DESTINATION_NM_KANA: {VARCHAR(60)} */
    protected String _destinationNmKana;

    /** DESTINATION_ZIP_CD: {VARCHAR(30)} */
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(60)} */
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(60)} */
    protected String _destinationAddress2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    protected String _destinationTel;

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

    /** UNIT_PRICE: {VARCHAR(30)} */
    protected String _unitPrice;

    /** EC_ORDER_NO: {VARCHAR(30)} */
    protected String _ecOrderNo;

    /** EC_ORDER_BRANCH_NO: {VARCHAR(30)} */
    protected String _ecOrderBranchNo;

    /** EC_PRODUCT_NM_KANJI: {VARCHAR(60)} */
    protected String _ecProductNmKanji;

    /** ORDER_DT: {VARCHAR(30)} */
    protected String _orderDt;

    /** KOKYAKU_CD: {VARCHAR(30)} */
    protected String _kokyakuCd;

    /** PAYMENT_TYPE_CD: {VARCHAR(30)} */
    protected String _paymentTypeCd;

    /** TOTAL_PRICE: {VARCHAR(30)} */
    protected String _totalPrice;

    /** SHIPPING_FEE: {VARCHAR(30)} */
    protected String _shippingFee;

    /** SEPARATE_SHIPPING_FEE: {VARCHAR(30)} */
    protected String _separateShippingFee;

    /** COD_FEE: {VARCHAR(30)} */
    protected String _codFee;

    /** SALES_TAX_RATE: {VARCHAR(30)} */
    protected String _salesTaxRate;

    /** PRICE_HIDDEN_FLG: {VARCHAR(30)} */
    protected String _priceHiddenFlg;

    /** PAYMENT_HIDDEN_FLG: {VARCHAR(30)} */
    protected String _paymentHiddenFlg;

    /** ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} */
    protected String _orderNoDeliveryNote;

    /** POINT: {VARCHAR(30)} */
    protected String _point;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _storeStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    protected String _lotManagTypeCd;

    /** DEAL_TYPE_CD: {VARCHAR(30)} */
    protected String _dealTypeCd;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    protected String _customerNm;

    /** DELIV_CD: {VARCHAR(30)} */
    protected String _delivCd;

    /** EMP_ID_CD: {VARCHAR(30)} */
    protected String _empIdCd;

    /** EMP_NM: {VARCHAR(60)} */
    protected String _empNm;

    /** IF_ID: {VARCHAR(30)} */
    protected String _ifId;

    /** DESTINATION_PREFECTURE: {VARCHAR(30)} */
    protected String _destinationPrefecture;

    /** PSAM: {VARCHAR(30)} */
    protected String _psam;

    /** FLOOR_COMP_FLG: {CHAR(1)} */
    protected String _floorCompFlg;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    protected String _sapAddSs;

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    protected String _sapAddUserCd;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    protected String _sapUpdSs;

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    protected String _sapUpdUserCd;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr03;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

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
        return "e_shipping_inst";
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
        if (_shippingInstId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     */
    public void uniqueBy(String receiveCd, Long receiveRowId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("receiveCd");
        __uniqueDrivenProperties.addPropertyName("receiveRowId");
        setReceiveCd(receiveCd);setReceiveRowId(receiveRowId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
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
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEShippingInst) {
            BsEShippingInst other = (BsEShippingInst)obj;
            if (!xSV(_shippingInstId, other._shippingInstId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _shippingInstId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_shippingInstId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingSlipRowNo));
        sb.append(dm).append(xfND(_salesOrderNo));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_salesOrderSlipTypeCd));
        sb.append(dm).append(xfND(_salesOrderSlipNo));
        sb.append(dm).append(xfND(_nizoroeNo));
        sb.append(dm).append(xfND(_shippingTypeCd));
        sb.append(dm).append(xfND(_shippingReasonCd));
        sb.append(dm).append(xfND(_hinmokuGroup));
        sb.append(dm).append(xfND(_shippingNum));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_ecUnitNm));
        sb.append(dm).append(xfND(_sampleTypeCd));
        sb.append(dm).append(xfND(_logiWeightFlg));
        sb.append(dm).append(xfND(_logiAttentionTypeCd));
        sb.append(dm).append(xfND(_logiSpecialTypeCd));
        sb.append(dm).append(xfND(_directDeliveryTypeCd));
        sb.append(dm).append(xfND(_koguchiDeliveryFlg));
        sb.append(dm).append(xfND(_splitDeliveryTypeCd));
        sb.append(dm).append(xfND(_carrierTypeCd));
        sb.append(dm).append(xfND(_carrierCd));
        sb.append(dm).append(xfND(_expressCd));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_specifyDeliveryDt));
        sb.append(dm).append(xfND(_specifyDeliveryTime));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaOrderNo));
        sb.append(dm).append(xfND(_kohaiContractorCd));
        sb.append(dm).append(xfND(_kohaiContractorNm));
        sb.append(dm).append(xfND(_destinationCd));
        sb.append(dm).append(xfND(_destinationNm1));
        sb.append(dm).append(xfND(_destinationNm2));
        sb.append(dm).append(xfND(_destinationNmKana));
        sb.append(dm).append(xfND(_destinationZipCd));
        sb.append(dm).append(xfND(_destinationAddress1));
        sb.append(dm).append(xfND(_destinationAddress2));
        sb.append(dm).append(xfND(_destinationTel));
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
        sb.append(dm).append(xfND(_unitPrice));
        sb.append(dm).append(xfND(_ecOrderNo));
        sb.append(dm).append(xfND(_ecOrderBranchNo));
        sb.append(dm).append(xfND(_ecProductNmKanji));
        sb.append(dm).append(xfND(_orderDt));
        sb.append(dm).append(xfND(_kokyakuCd));
        sb.append(dm).append(xfND(_paymentTypeCd));
        sb.append(dm).append(xfND(_totalPrice));
        sb.append(dm).append(xfND(_shippingFee));
        sb.append(dm).append(xfND(_separateShippingFee));
        sb.append(dm).append(xfND(_codFee));
        sb.append(dm).append(xfND(_salesTaxRate));
        sb.append(dm).append(xfND(_priceHiddenFlg));
        sb.append(dm).append(xfND(_paymentHiddenFlg));
        sb.append(dm).append(xfND(_orderNoDeliveryNote));
        sb.append(dm).append(xfND(_point));
        sb.append(dm).append(xfND(_storePlantCd));
        sb.append(dm).append(xfND(_storeStorageSpaceCd));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_lotManagTypeCd));
        sb.append(dm).append(xfND(_dealTypeCd));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_delivCd));
        sb.append(dm).append(xfND(_empIdCd));
        sb.append(dm).append(xfND(_empNm));
        sb.append(dm).append(xfND(_ifId));
        sb.append(dm).append(xfND(_destinationPrefecture));
        sb.append(dm).append(xfND(_psam));
        sb.append(dm).append(xfND(_floorCompFlg));
        sb.append(dm).append(xfND(_sapAddYyyy));
        sb.append(dm).append(xfND(_sapAddMm));
        sb.append(dm).append(xfND(_sapAddDd));
        sb.append(dm).append(xfND(_sapAddHh));
        sb.append(dm).append(xfND(_sapAddMi));
        sb.append(dm).append(xfND(_sapAddSs));
        sb.append(dm).append(xfND(_sapAddUserCd));
        sb.append(dm).append(xfND(_sapUpdYyyy));
        sb.append(dm).append(xfND(_sapUpdMm));
        sb.append(dm).append(xfND(_sapUpdDd));
        sb.append(dm).append(xfND(_sapUpdHh));
        sb.append(dm).append(xfND(_sapUpdMi));
        sb.append(dm).append(xfND(_sapUpdSs));
        sb.append(dm).append(xfND(_sapUpdUserCd));
        sb.append(dm).append(xfND(_dataTransferOnlyStr01));
        sb.append(dm).append(xfND(_dataTransferOnlyStr02));
        sb.append(dm).append(xfND(_dataTransferOnlyStr03));
        sb.append(dm).append(xfND(_spareStr));
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
        return "";
    }

    @Override
    public EShippingInst clone() {
        return (EShippingInst)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示受信ID
     * @return The value of the column 'SHIPPING_INST_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getShippingInstId() {
        checkSpecifiedProperty("shippingInstId");
        return _shippingInstId;
    }

    /**
     * [set] SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示受信ID
     * @param shippingInstId The value of the column 'SHIPPING_INST_ID'. (basically NotNull if update: for the constraint)
     */
    public void setShippingInstId(Long shippingInstId) {
        registerModifiedProperty("shippingInstId");
        _shippingInstId = shippingInstId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
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
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipRowNo() {
        checkSpecifiedProperty("shippingSlipRowNo");
        return convertEmptyToNull(_shippingSlipRowNo);
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @param shippingSlipRowNo The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipRowNo(String shippingSlipRowNo) {
        registerModifiedProperty("shippingSlipRowNo");
        _shippingSlipRowNo = shippingSlipRowNo;
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
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
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
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingTypeCd() {
        checkSpecifiedProperty("shippingTypeCd");
        return convertEmptyToNull(_shippingTypeCd);
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        registerModifiedProperty("shippingTypeCd");
        _shippingTypeCd = shippingTypeCd;
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
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroup() {
        checkSpecifiedProperty("hinmokuGroup");
        return convertEmptyToNull(_hinmokuGroup);
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        registerModifiedProperty("hinmokuGroup");
        _hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] SHIPPING_NUM: {VARCHAR(30)} <br>
     * 出荷数
     * @return The value of the column 'SHIPPING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingNum() {
        checkSpecifiedProperty("shippingNum");
        return convertEmptyToNull(_shippingNum);
    }

    /**
     * [set] SHIPPING_NUM: {VARCHAR(30)} <br>
     * 出荷数
     * @param shippingNum The value of the column 'SHIPPING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingNum(String shippingNum) {
        registerModifiedProperty("shippingNum");
        _shippingNum = shippingNum;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] EC_UNIT_NM: {VARCHAR(30)} <br>
     * EC単位名
     * @return The value of the column 'EC_UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcUnitNm() {
        checkSpecifiedProperty("ecUnitNm");
        return convertEmptyToNull(_ecUnitNm);
    }

    /**
     * [set] EC_UNIT_NM: {VARCHAR(30)} <br>
     * EC単位名
     * @param ecUnitNm The value of the column 'EC_UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcUnitNm(String ecUnitNm) {
        registerModifiedProperty("ecUnitNm");
        _ecUnitNm = ecUnitNm;
    }

    /**
     * [get] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @return The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSampleTypeCd() {
        checkSpecifiedProperty("sampleTypeCd");
        return convertEmptyToNull(_sampleTypeCd);
    }

    /**
     * [set] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @param sampleTypeCd The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSampleTypeCd(String sampleTypeCd) {
        registerModifiedProperty("sampleTypeCd");
        _sampleTypeCd = sampleTypeCd;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiWeightFlg() {
        checkSpecifiedProperty("logiWeightFlg");
        return convertEmptyToNull(_logiWeightFlg);
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        registerModifiedProperty("logiWeightFlg");
        _logiWeightFlg = logiWeightFlg;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiAttentionTypeCd() {
        checkSpecifiedProperty("logiAttentionTypeCd");
        return convertEmptyToNull(_logiAttentionTypeCd);
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        registerModifiedProperty("logiAttentionTypeCd");
        _logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLogiSpecialTypeCd() {
        checkSpecifiedProperty("logiSpecialTypeCd");
        return convertEmptyToNull(_logiSpecialTypeCd);
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        registerModifiedProperty("logiSpecialTypeCd");
        _logiSpecialTypeCd = logiSpecialTypeCd;
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
     * [get] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getKoguchiDeliveryFlg() {
        checkSpecifiedProperty("koguchiDeliveryFlg");
        return convertEmptyToNull(_koguchiDeliveryFlg);
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        registerModifiedProperty("koguchiDeliveryFlg");
        _koguchiDeliveryFlg = koguchiDeliveryFlg;
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
     * [get] EXPRESS_CD: {VARCHAR(30)} <br>
     * 運送便CD
     * @return The value of the column 'EXPRESS_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getExpressCd() {
        checkSpecifiedProperty("expressCd");
        return convertEmptyToNull(_expressCd);
    }

    /**
     * [set] EXPRESS_CD: {VARCHAR(30)} <br>
     * 運送便CD
     * @param expressCd The value of the column 'EXPRESS_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpressCd(String expressCd) {
        registerModifiedProperty("expressCd");
        _expressCd = expressCd;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(30)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpecifyDeliveryDt() {
        checkSpecifiedProperty("specifyDeliveryDt");
        return convertEmptyToNull(_specifyDeliveryDt);
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(30)} <br>
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
     * [get] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaOrderNo() {
        checkSpecifiedProperty("tenhanshaOrderNo");
        return convertEmptyToNull(_tenhanshaOrderNo);
    }

    /**
     * [set] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaOrderNo The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaOrderNo(String tenhanshaOrderNo) {
        registerModifiedProperty("tenhanshaOrderNo");
        _tenhanshaOrderNo = tenhanshaOrderNo;
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
     * [get] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationCd() {
        checkSpecifiedProperty("destinationCd");
        return convertEmptyToNull(_destinationCd);
    }

    /**
     * [set] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationCd(String destinationCd) {
        registerModifiedProperty("destinationCd");
        _destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm1() {
        checkSpecifiedProperty("destinationNm1");
        return convertEmptyToNull(_destinationNm1);
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm1(String destinationNm1) {
        registerModifiedProperty("destinationNm1");
        _destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm2() {
        checkSpecifiedProperty("destinationNm2");
        return convertEmptyToNull(_destinationNm2);
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm2(String destinationNm2) {
        registerModifiedProperty("destinationNm2");
        _destinationNm2 = destinationNm2;
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
     * [get] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationZipCd() {
        checkSpecifiedProperty("destinationZipCd");
        return convertEmptyToNull(_destinationZipCd);
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        registerModifiedProperty("destinationZipCd");
        _destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress1() {
        checkSpecifiedProperty("destinationAddress1");
        return convertEmptyToNull(_destinationAddress1);
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        registerModifiedProperty("destinationAddress1");
        _destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress2() {
        checkSpecifiedProperty("destinationAddress2");
        return convertEmptyToNull(_destinationAddress2);
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        registerModifiedProperty("destinationAddress2");
        _destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationTel() {
        checkSpecifiedProperty("destinationTel");
        return convertEmptyToNull(_destinationTel);
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationTel(String destinationTel) {
        registerModifiedProperty("destinationTel");
        _destinationTel = destinationTel;
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
     * [get] UNIT_PRICE: {VARCHAR(30)} <br>
     * 商品単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitPrice() {
        checkSpecifiedProperty("unitPrice");
        return convertEmptyToNull(_unitPrice);
    }

    /**
     * [set] UNIT_PRICE: {VARCHAR(30)} <br>
     * 商品単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitPrice(String unitPrice) {
        registerModifiedProperty("unitPrice");
        _unitPrice = unitPrice;
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
     * [get] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @return The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcOrderBranchNo() {
        checkSpecifiedProperty("ecOrderBranchNo");
        return convertEmptyToNull(_ecOrderBranchNo);
    }

    /**
     * [set] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @param ecOrderBranchNo The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcOrderBranchNo(String ecOrderBranchNo) {
        registerModifiedProperty("ecOrderBranchNo");
        _ecOrderBranchNo = ecOrderBranchNo;
    }

    /**
     * [get] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @return The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed even if selected: for no constraint)
     */
    public String getEcProductNmKanji() {
        checkSpecifiedProperty("ecProductNmKanji");
        return convertEmptyToNull(_ecProductNmKanji);
    }

    /**
     * [set] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @param ecProductNmKanji The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEcProductNmKanji(String ecProductNmKanji) {
        registerModifiedProperty("ecProductNmKanji");
        _ecProductNmKanji = ecProductNmKanji;
    }

    /**
     * [get] ORDER_DT: {VARCHAR(30)} <br>
     * 注文日
     * @return The value of the column 'ORDER_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDt() {
        checkSpecifiedProperty("orderDt");
        return convertEmptyToNull(_orderDt);
    }

    /**
     * [set] ORDER_DT: {VARCHAR(30)} <br>
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
     * [get] TOTAL_PRICE: {VARCHAR(30)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTotalPrice() {
        checkSpecifiedProperty("totalPrice");
        return convertEmptyToNull(_totalPrice);
    }

    /**
     * [set] TOTAL_PRICE: {VARCHAR(30)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalPrice(String totalPrice) {
        registerModifiedProperty("totalPrice");
        _totalPrice = totalPrice;
    }

    /**
     * [get] SHIPPING_FEE: {VARCHAR(30)} <br>
     * 送料
     * @return The value of the column 'SHIPPING_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingFee() {
        checkSpecifiedProperty("shippingFee");
        return convertEmptyToNull(_shippingFee);
    }

    /**
     * [set] SHIPPING_FEE: {VARCHAR(30)} <br>
     * 送料
     * @param shippingFee The value of the column 'SHIPPING_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingFee(String shippingFee) {
        registerModifiedProperty("shippingFee");
        _shippingFee = shippingFee;
    }

    /**
     * [get] SEPARATE_SHIPPING_FEE: {VARCHAR(30)} <br>
     * 別途送料
     * @return The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSeparateShippingFee() {
        checkSpecifiedProperty("separateShippingFee");
        return convertEmptyToNull(_separateShippingFee);
    }

    /**
     * [set] SEPARATE_SHIPPING_FEE: {VARCHAR(30)} <br>
     * 別途送料
     * @param separateShippingFee The value of the column 'SEPARATE_SHIPPING_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSeparateShippingFee(String separateShippingFee) {
        registerModifiedProperty("separateShippingFee");
        _separateShippingFee = separateShippingFee;
    }

    /**
     * [get] COD_FEE: {VARCHAR(30)} <br>
     * 代引手数料
     * @return The value of the column 'COD_FEE'. (NullAllowed even if selected: for no constraint)
     */
    public String getCodFee() {
        checkSpecifiedProperty("codFee");
        return convertEmptyToNull(_codFee);
    }

    /**
     * [set] COD_FEE: {VARCHAR(30)} <br>
     * 代引手数料
     * @param codFee The value of the column 'COD_FEE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCodFee(String codFee) {
        registerModifiedProperty("codFee");
        _codFee = codFee;
    }

    /**
     * [get] SALES_TAX_RATE: {VARCHAR(30)} <br>
     * 消費税率
     * @return The value of the column 'SALES_TAX_RATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesTaxRate() {
        checkSpecifiedProperty("salesTaxRate");
        return convertEmptyToNull(_salesTaxRate);
    }

    /**
     * [set] SALES_TAX_RATE: {VARCHAR(30)} <br>
     * 消費税率
     * @param salesTaxRate The value of the column 'SALES_TAX_RATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesTaxRate(String salesTaxRate) {
        registerModifiedProperty("salesTaxRate");
        _salesTaxRate = salesTaxRate;
    }

    /**
     * [get] PRICE_HIDDEN_FLG: {VARCHAR(30)} <br>
     * 金額非表示フラグ
     * @return The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPriceHiddenFlg() {
        checkSpecifiedProperty("priceHiddenFlg");
        return convertEmptyToNull(_priceHiddenFlg);
    }

    /**
     * [set] PRICE_HIDDEN_FLG: {VARCHAR(30)} <br>
     * 金額非表示フラグ
     * @param priceHiddenFlg The value of the column 'PRICE_HIDDEN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPriceHiddenFlg(String priceHiddenFlg) {
        registerModifiedProperty("priceHiddenFlg");
        _priceHiddenFlg = priceHiddenFlg;
    }

    /**
     * [get] PAYMENT_HIDDEN_FLG: {VARCHAR(30)} <br>
     * 決済非表示フラグ
     * @return The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getPaymentHiddenFlg() {
        checkSpecifiedProperty("paymentHiddenFlg");
        return convertEmptyToNull(_paymentHiddenFlg);
    }

    /**
     * [set] PAYMENT_HIDDEN_FLG: {VARCHAR(30)} <br>
     * 決済非表示フラグ
     * @param paymentHiddenFlg The value of the column 'PAYMENT_HIDDEN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPaymentHiddenFlg(String paymentHiddenFlg) {
        registerModifiedProperty("paymentHiddenFlg");
        _paymentHiddenFlg = paymentHiddenFlg;
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
     * [get] POINT: {VARCHAR(30)} <br>
     * ポイント
     * @return The value of the column 'POINT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPoint() {
        checkSpecifiedProperty("point");
        return convertEmptyToNull(_point);
    }

    /**
     * [set] POINT: {VARCHAR(30)} <br>
     * ポイント
     * @param point The value of the column 'POINT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPoint(String point) {
        registerModifiedProperty("point");
        _point = point;
    }

    /**
     * [get] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStorePlantCd() {
        checkSpecifiedProperty("storePlantCd");
        return convertEmptyToNull(_storePlantCd);
    }

    /**
     * [set] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStorePlantCd(String storePlantCd) {
        registerModifiedProperty("storePlantCd");
        _storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreStorageSpaceCd() {
        checkSpecifiedProperty("storeStorageSpaceCd");
        return convertEmptyToNull(_storeStorageSpaceCd);
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        registerModifiedProperty("storeStorageSpaceCd");
        _storeStorageSpaceCd = storeStorageSpaceCd;
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
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLotManagTypeCd() {
        checkSpecifiedProperty("lotManagTypeCd");
        return convertEmptyToNull(_lotManagTypeCd);
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        registerModifiedProperty("lotManagTypeCd");
        _lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'DEAL_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDealTypeCd() {
        checkSpecifiedProperty("dealTypeCd");
        return convertEmptyToNull(_dealTypeCd);
    }

    /**
     * [set] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param dealTypeCd The value of the column 'DEAL_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDealTypeCd(String dealTypeCd) {
        registerModifiedProperty("dealTypeCd");
        _dealTypeCd = dealTypeCd;
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
     * [get] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @return The value of the column 'EMP_ID_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpIdCd() {
        checkSpecifiedProperty("empIdCd");
        return convertEmptyToNull(_empIdCd);
    }

    /**
     * [set] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @param empIdCd The value of the column 'EMP_ID_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpIdCd(String empIdCd) {
        registerModifiedProperty("empIdCd");
        _empIdCd = empIdCd;
    }

    /**
     * [get] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @return The value of the column 'EMP_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getEmpNm() {
        checkSpecifiedProperty("empNm");
        return convertEmptyToNull(_empNm);
    }

    /**
     * [set] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @param empNm The value of the column 'EMP_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEmpNm(String empNm) {
        registerModifiedProperty("empNm");
        _empNm = empNm;
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
     * [get] DESTINATION_PREFECTURE: {VARCHAR(30)} <br>
     * 送り先都道府県
     * @return The value of the column 'DESTINATION_PREFECTURE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationPrefecture() {
        checkSpecifiedProperty("destinationPrefecture");
        return convertEmptyToNull(_destinationPrefecture);
    }

    /**
     * [set] DESTINATION_PREFECTURE: {VARCHAR(30)} <br>
     * 送り先都道府県
     * @param destinationPrefecture The value of the column 'DESTINATION_PREFECTURE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationPrefecture(String destinationPrefecture) {
        registerModifiedProperty("destinationPrefecture");
        _destinationPrefecture = destinationPrefecture;
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
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddYyyy() {
        checkSpecifiedProperty("sapAddYyyy");
        return convertEmptyToNull(_sapAddYyyy);
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        registerModifiedProperty("sapAddYyyy");
        _sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMm() {
        checkSpecifiedProperty("sapAddMm");
        return convertEmptyToNull(_sapAddMm);
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMm(String sapAddMm) {
        registerModifiedProperty("sapAddMm");
        _sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddDd() {
        checkSpecifiedProperty("sapAddDd");
        return convertEmptyToNull(_sapAddDd);
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddDd(String sapAddDd) {
        registerModifiedProperty("sapAddDd");
        _sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddHh() {
        checkSpecifiedProperty("sapAddHh");
        return convertEmptyToNull(_sapAddHh);
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddHh(String sapAddHh) {
        registerModifiedProperty("sapAddHh");
        _sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddMi() {
        checkSpecifiedProperty("sapAddMi");
        return convertEmptyToNull(_sapAddMi);
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddMi(String sapAddMi) {
        registerModifiedProperty("sapAddMi");
        _sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddSs() {
        checkSpecifiedProperty("sapAddSs");
        return convertEmptyToNull(_sapAddSs);
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddSs(String sapAddSs) {
        registerModifiedProperty("sapAddSs");
        _sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapAddUserCd() {
        checkSpecifiedProperty("sapAddUserCd");
        return convertEmptyToNull(_sapAddUserCd);
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        registerModifiedProperty("sapAddUserCd");
        _sapAddUserCd = sapAddUserCd;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdYyyy() {
        checkSpecifiedProperty("sapUpdYyyy");
        return convertEmptyToNull(_sapUpdYyyy);
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        registerModifiedProperty("sapUpdYyyy");
        _sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMm() {
        checkSpecifiedProperty("sapUpdMm");
        return convertEmptyToNull(_sapUpdMm);
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMm(String sapUpdMm) {
        registerModifiedProperty("sapUpdMm");
        _sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdDd() {
        checkSpecifiedProperty("sapUpdDd");
        return convertEmptyToNull(_sapUpdDd);
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdDd(String sapUpdDd) {
        registerModifiedProperty("sapUpdDd");
        _sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdHh() {
        checkSpecifiedProperty("sapUpdHh");
        return convertEmptyToNull(_sapUpdHh);
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdHh(String sapUpdHh) {
        registerModifiedProperty("sapUpdHh");
        _sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdMi() {
        checkSpecifiedProperty("sapUpdMi");
        return convertEmptyToNull(_sapUpdMi);
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdMi(String sapUpdMi) {
        registerModifiedProperty("sapUpdMi");
        _sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdSs() {
        checkSpecifiedProperty("sapUpdSs");
        return convertEmptyToNull(_sapUpdSs);
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdSs(String sapUpdSs) {
        registerModifiedProperty("sapUpdSs");
        _sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUpdUserCd() {
        checkSpecifiedProperty("sapUpdUserCd");
        return convertEmptyToNull(_sapUpdUserCd);
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        registerModifiedProperty("sapUpdUserCd");
        _sapUpdUserCd = sapUpdUserCd;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * ヘルメット区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr01() {
        checkSpecifiedProperty("dataTransferOnlyStr01");
        return convertEmptyToNull(_dataTransferOnlyStr01);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * ヘルメット区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        registerModifiedProperty("dataTransferOnlyStr01");
        _dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * マーク名称
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr02() {
        checkSpecifiedProperty("dataTransferOnlyStr02");
        return convertEmptyToNull(_dataTransferOnlyStr02);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * マーク名称
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        registerModifiedProperty("dataTransferOnlyStr02");
        _dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * ステータス
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr03() {
        checkSpecifiedProperty("dataTransferOnlyStr03");
        return convertEmptyToNull(_dataTransferOnlyStr03);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * ステータス
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        registerModifiedProperty("dataTransferOnlyStr03");
        _dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
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
