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
 * The entity of es_receive_plan as TABLE. <br>
 * 入庫予定送信テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, SEND_FLG, STORE_SLIP_NO, STORE_SLIP_ROW_NO, SLIP_TYPE_CD, IF_ID, IF_NO, HINMOKU_CD, HINMOKU_GROUP, SANSHA_TYPE_CD, RECEIVE_REASON_CD, RECEIVE_REASON_NM, CUSTOMER_CD, CUSTOMER_NM, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DATE, HINMOKU_TEXT, JAN_CD, UNIT_NM, RECEIVE_PLAN_NUM, RECEIVE_REMAINING_NUM, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, MOD_TYPE_CD, DEPOSIT_JAN_CD, TIMES_NUM, ACCOUNT_ORDER_NO, SAP_SUPPLIER_CD, SAP_VENDER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Long receivePlanId = entity.getReceivePlanId();
 * String sendFlg = entity.getSendFlg();
 * String storeSlipNo = entity.getStoreSlipNo();
 * String storeSlipRowNo = entity.getStoreSlipRowNo();
 * String slipTypeCd = entity.getSlipTypeCd();
 * String ifId = entity.getIfId();
 * String ifNo = entity.getIfNo();
 * String hinmokuCd = entity.getHinmokuCd();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String sanshaTypeCd = entity.getSanshaTypeCd();
 * String receiveReasonCd = entity.getReceiveReasonCd();
 * String receiveReasonNm = entity.getReceiveReasonNm();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String orderDate = entity.getOrderDate();
 * String orderTime = entity.getOrderTime();
 * String confirmedDeliveryDate = entity.getConfirmedDeliveryDate();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String unitNm = entity.getUnitNm();
 * String receivePlanNum = entity.getReceivePlanNum();
 * String receiveRemainingNum = entity.getReceiveRemainingNum();
 * String storePlantCd = entity.getStorePlantCd();
 * String storeStorageSpaceCd = entity.getStoreStorageSpaceCd();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String lotManagTypeCd = entity.getLotManagTypeCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String sapUserCd = entity.getSapUserCd();
 * String sapUserNm = entity.getSapUserNm();
 * String modTypeCd = entity.getModTypeCd();
 * String depositJanCd = entity.getDepositJanCd();
 * String timesNum = entity.getTimesNum();
 * String accountOrderNo = entity.getAccountOrderNo();
 * String sapSupplierCd = entity.getSapSupplierCd();
 * String sapVenderCd = entity.getSapVenderCd();
 * String todayFlg = entity.getTodayFlg();
 * String sanshaDeliverySlipNo1 = entity.getSanshaDeliverySlipNo1();
 * String dataTypeCd = entity.getDataTypeCd();
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
 * String dataTransferOnlyStr04 = entity.getDataTransferOnlyStr04();
 * String dataTransferOnlyStr05 = entity.getDataTransferOnlyStr05();
 * String dataTransferOnlyStr06 = entity.getDataTransferOnlyStr06();
 * String dataTransferOnlyStr07 = entity.getDataTransferOnlyStr07();
 * String dataTransferOnlyStr08 = entity.getDataTransferOnlyStr08();
 * String dataTransferOnlyStr09 = entity.getDataTransferOnlyStr09();
 * String dataTransferOnlyStr10 = entity.getDataTransferOnlyStr10();
 * String dataTransferOnlyStr11 = entity.getDataTransferOnlyStr11();
 * String dataTransferOnlyStr12 = entity.getDataTransferOnlyStr12();
 * String dataTransferOnlyStr13 = entity.getDataTransferOnlyStr13();
 * String dataTransferOnlyStr14 = entity.getDataTransferOnlyStr14();
 * String dataTransferOnlyStr15 = entity.getDataTransferOnlyStr15();
 * String dataTransferOnlyStr16 = entity.getDataTransferOnlyStr16();
 * String dataTransferOnlyStr17 = entity.getDataTransferOnlyStr17();
 * String dataTransferOnlyStr18 = entity.getDataTransferOnlyStr18();
 * String dataTransferOnlyStr19 = entity.getDataTransferOnlyStr19();
 * String dataTransferOnlyStr20 = entity.getDataTransferOnlyStr20();
 * String dataTransferOnlyStr21 = entity.getDataTransferOnlyStr21();
 * String dataTransferOnlyStr22 = entity.getDataTransferOnlyStr22();
 * String dataTransferOnlyStr23 = entity.getDataTransferOnlyStr23();
 * String dataTransferOnlyStr24 = entity.getDataTransferOnlyStr24();
 * String dataTransferOnlyStr25 = entity.getDataTransferOnlyStr25();
 * String dataTransferOnlyStr26 = entity.getDataTransferOnlyStr26();
 * String dataTransferOnlyStr27 = entity.getDataTransferOnlyStr27();
 * String dataTransferOnlyStr28 = entity.getDataTransferOnlyStr28();
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
 * entity.setReceivePlanId(receivePlanId);
 * entity.setSendFlg(sendFlg);
 * entity.setStoreSlipNo(storeSlipNo);
 * entity.setStoreSlipRowNo(storeSlipRowNo);
 * entity.setSlipTypeCd(slipTypeCd);
 * entity.setIfId(ifId);
 * entity.setIfNo(ifNo);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setHinmokuGroup(hinmokuGroup);
 * entity.setSanshaTypeCd(sanshaTypeCd);
 * entity.setReceiveReasonCd(receiveReasonCd);
 * entity.setReceiveReasonNm(receiveReasonNm);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setOrderDate(orderDate);
 * entity.setOrderTime(orderTime);
 * entity.setConfirmedDeliveryDate(confirmedDeliveryDate);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setUnitNm(unitNm);
 * entity.setReceivePlanNum(receivePlanNum);
 * entity.setReceiveRemainingNum(receiveRemainingNum);
 * entity.setStorePlantCd(storePlantCd);
 * entity.setStoreStorageSpaceCd(storeStorageSpaceCd);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setLotManagTypeCd(lotManagTypeCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setSapUserCd(sapUserCd);
 * entity.setSapUserNm(sapUserNm);
 * entity.setModTypeCd(modTypeCd);
 * entity.setDepositJanCd(depositJanCd);
 * entity.setTimesNum(timesNum);
 * entity.setAccountOrderNo(accountOrderNo);
 * entity.setSapSupplierCd(sapSupplierCd);
 * entity.setSapVenderCd(sapVenderCd);
 * entity.setTodayFlg(todayFlg);
 * entity.setSanshaDeliverySlipNo1(sanshaDeliverySlipNo1);
 * entity.setDataTypeCd(dataTypeCd);
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
 * entity.setDataTransferOnlyStr04(dataTransferOnlyStr04);
 * entity.setDataTransferOnlyStr05(dataTransferOnlyStr05);
 * entity.setDataTransferOnlyStr06(dataTransferOnlyStr06);
 * entity.setDataTransferOnlyStr07(dataTransferOnlyStr07);
 * entity.setDataTransferOnlyStr08(dataTransferOnlyStr08);
 * entity.setDataTransferOnlyStr09(dataTransferOnlyStr09);
 * entity.setDataTransferOnlyStr10(dataTransferOnlyStr10);
 * entity.setDataTransferOnlyStr11(dataTransferOnlyStr11);
 * entity.setDataTransferOnlyStr12(dataTransferOnlyStr12);
 * entity.setDataTransferOnlyStr13(dataTransferOnlyStr13);
 * entity.setDataTransferOnlyStr14(dataTransferOnlyStr14);
 * entity.setDataTransferOnlyStr15(dataTransferOnlyStr15);
 * entity.setDataTransferOnlyStr16(dataTransferOnlyStr16);
 * entity.setDataTransferOnlyStr17(dataTransferOnlyStr17);
 * entity.setDataTransferOnlyStr18(dataTransferOnlyStr18);
 * entity.setDataTransferOnlyStr19(dataTransferOnlyStr19);
 * entity.setDataTransferOnlyStr20(dataTransferOnlyStr20);
 * entity.setDataTransferOnlyStr21(dataTransferOnlyStr21);
 * entity.setDataTransferOnlyStr22(dataTransferOnlyStr22);
 * entity.setDataTransferOnlyStr23(dataTransferOnlyStr23);
 * entity.setDataTransferOnlyStr24(dataTransferOnlyStr24);
 * entity.setDataTransferOnlyStr25(dataTransferOnlyStr25);
 * entity.setDataTransferOnlyStr26(dataTransferOnlyStr26);
 * entity.setDataTransferOnlyStr27(dataTransferOnlyStr27);
 * entity.setDataTransferOnlyStr28(dataTransferOnlyStr28);
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
public abstract class BsEsReceivePlan extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _receivePlanId;

    /** SEND_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _sendFlg;

    /** STORE_SLIP_NO: {VARCHAR(30)} */
    protected String _storeSlipNo;

    /** STORE_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _storeSlipRowNo;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    protected String _slipTypeCd;

    /** IF_ID: {VARCHAR(30)} */
    protected String _ifId;

    /** IF_NO: {VARCHAR(30)} */
    protected String _ifNo;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

    /** SANSHA_TYPE_CD: {VARCHAR(30)} */
    protected String _sanshaTypeCd;

    /** RECEIVE_REASON_CD: {VARCHAR(30)} */
    protected String _receiveReasonCd;

    /** RECEIVE_REASON_NM: {VARCHAR(30)} */
    protected String _receiveReasonNm;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    protected String _customerNm;

    /** ORDER_DATE: {VARCHAR(30)} */
    protected String _orderDate;

    /** ORDER_TIME: {VARCHAR(30)} */
    protected String _orderTime;

    /** CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} */
    protected String _confirmedDeliveryDate;

    /** HINMOKU_TEXT: {VARCHAR(100)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    protected String _unitNm;

    /** RECEIVE_PLAN_NUM: {VARCHAR(30)} */
    protected String _receivePlanNum;

    /** RECEIVE_REMAINING_NUM: {VARCHAR(30)} */
    protected String _receiveRemainingNum;

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

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    protected String _sapUserNm;

    /** MOD_TYPE_CD: {VARCHAR(30)} */
    protected String _modTypeCd;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    protected String _depositJanCd;

    /** TIMES_NUM: {VARCHAR(30)} */
    protected String _timesNum;

    /** ACCOUNT_ORDER_NO: {VARCHAR(30)} */
    protected String _accountOrderNo;

    /** SAP_SUPPLIER_CD: {VARCHAR(30)} */
    protected String _sapSupplierCd;

    /** SAP_VENDER_CD: {VARCHAR(30)} */
    protected String _sapVenderCd;

    /** TODAY_FLG: {VARCHAR(30)} */
    protected String _todayFlg;

    /** SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} */
    protected String _sanshaDeliverySlipNo1;

    /** DATA_TYPE_CD: {VARCHAR(30)} */
    protected String _dataTypeCd;

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

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr03;

    /** DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr04;

    /** DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} */
    protected String _dataTransferOnlyStr05;

    /** DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr06;

    /** DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr07;

    /** DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr08;

    /** DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr09;

    /** DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr10;

    /** DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr11;

    /** DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr12;

    /** DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr13;

    /** DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr14;

    /** DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr15;

    /** DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr16;

    /** DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr17;

    /** DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr18;

    /** DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr19;

    /** DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr20;

    /** DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr21;

    /** DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr22;

    /** DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr23;

    /** DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr24;

    /** DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr25;

    /** DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} */
    protected String _dataTransferOnlyStr26;

    /** DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr27;

    /** DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} */
    protected String _dataTransferOnlyStr28;

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
        return "es_receive_plan";
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
        if (_receivePlanId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
        if (obj instanceof BsEsReceivePlan) {
            BsEsReceivePlan other = (BsEsReceivePlan)obj;
            if (!xSV(_receivePlanId, other._receivePlanId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanId));
        sb.append(dm).append(xfND(_sendFlg));
        sb.append(dm).append(xfND(_storeSlipNo));
        sb.append(dm).append(xfND(_storeSlipRowNo));
        sb.append(dm).append(xfND(_slipTypeCd));
        sb.append(dm).append(xfND(_ifId));
        sb.append(dm).append(xfND(_ifNo));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_hinmokuGroup));
        sb.append(dm).append(xfND(_sanshaTypeCd));
        sb.append(dm).append(xfND(_receiveReasonCd));
        sb.append(dm).append(xfND(_receiveReasonNm));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_orderDate));
        sb.append(dm).append(xfND(_orderTime));
        sb.append(dm).append(xfND(_confirmedDeliveryDate));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_receivePlanNum));
        sb.append(dm).append(xfND(_receiveRemainingNum));
        sb.append(dm).append(xfND(_storePlantCd));
        sb.append(dm).append(xfND(_storeStorageSpaceCd));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_lotManagTypeCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_sapUserCd));
        sb.append(dm).append(xfND(_sapUserNm));
        sb.append(dm).append(xfND(_modTypeCd));
        sb.append(dm).append(xfND(_depositJanCd));
        sb.append(dm).append(xfND(_timesNum));
        sb.append(dm).append(xfND(_accountOrderNo));
        sb.append(dm).append(xfND(_sapSupplierCd));
        sb.append(dm).append(xfND(_sapVenderCd));
        sb.append(dm).append(xfND(_todayFlg));
        sb.append(dm).append(xfND(_sanshaDeliverySlipNo1));
        sb.append(dm).append(xfND(_dataTypeCd));
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
        sb.append(dm).append(xfND(_dataTransferOnlyStr04));
        sb.append(dm).append(xfND(_dataTransferOnlyStr05));
        sb.append(dm).append(xfND(_dataTransferOnlyStr06));
        sb.append(dm).append(xfND(_dataTransferOnlyStr07));
        sb.append(dm).append(xfND(_dataTransferOnlyStr08));
        sb.append(dm).append(xfND(_dataTransferOnlyStr09));
        sb.append(dm).append(xfND(_dataTransferOnlyStr10));
        sb.append(dm).append(xfND(_dataTransferOnlyStr11));
        sb.append(dm).append(xfND(_dataTransferOnlyStr12));
        sb.append(dm).append(xfND(_dataTransferOnlyStr13));
        sb.append(dm).append(xfND(_dataTransferOnlyStr14));
        sb.append(dm).append(xfND(_dataTransferOnlyStr15));
        sb.append(dm).append(xfND(_dataTransferOnlyStr16));
        sb.append(dm).append(xfND(_dataTransferOnlyStr17));
        sb.append(dm).append(xfND(_dataTransferOnlyStr18));
        sb.append(dm).append(xfND(_dataTransferOnlyStr19));
        sb.append(dm).append(xfND(_dataTransferOnlyStr20));
        sb.append(dm).append(xfND(_dataTransferOnlyStr21));
        sb.append(dm).append(xfND(_dataTransferOnlyStr22));
        sb.append(dm).append(xfND(_dataTransferOnlyStr23));
        sb.append(dm).append(xfND(_dataTransferOnlyStr24));
        sb.append(dm).append(xfND(_dataTransferOnlyStr25));
        sb.append(dm).append(xfND(_dataTransferOnlyStr26));
        sb.append(dm).append(xfND(_dataTransferOnlyStr27));
        sb.append(dm).append(xfND(_dataTransferOnlyStr28));
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
    public EsReceivePlan clone() {
        return (EsReceivePlan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)} <br>
     * 入庫予定送信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceivePlanId() {
        checkSpecifiedProperty("receivePlanId");
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)} <br>
     * 入庫予定送信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceivePlanId(Long receivePlanId) {
        registerModifiedProperty("receivePlanId");
        _receivePlanId = receivePlanId;
    }

    /**
     * [get] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'SEND_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getSendFlg() {
        checkSpecifiedProperty("sendFlg");
        return convertEmptyToNull(_sendFlg);
    }

    /**
     * [set] SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param sendFlg The value of the column 'SEND_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setSendFlg(String sendFlg) {
        registerModifiedProperty("sendFlg");
        _sendFlg = sendFlg;
    }

    /**
     * [get] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'STORE_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreSlipNo() {
        checkSpecifiedProperty("storeSlipNo");
        return convertEmptyToNull(_storeSlipNo);
    }

    /**
     * [set] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param storeSlipNo The value of the column 'STORE_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreSlipNo(String storeSlipNo) {
        registerModifiedProperty("storeSlipNo");
        _storeSlipNo = storeSlipNo;
    }

    /**
     * [get] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @return The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getStoreSlipRowNo() {
        checkSpecifiedProperty("storeSlipRowNo");
        return convertEmptyToNull(_storeSlipRowNo);
    }

    /**
     * [set] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @param storeSlipRowNo The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStoreSlipRowNo(String storeSlipRowNo) {
        registerModifiedProperty("storeSlipRowNo");
        _storeSlipRowNo = storeSlipRowNo;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSlipTypeCd() {
        checkSpecifiedProperty("slipTypeCd");
        return convertEmptyToNull(_slipTypeCd);
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        registerModifiedProperty("slipTypeCd");
        _slipTypeCd = slipTypeCd;
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
     * [get] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @return The value of the column 'IF_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfNo() {
        checkSpecifiedProperty("ifNo");
        return convertEmptyToNull(_ifNo);
    }

    /**
     * [set] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @param ifNo The value of the column 'IF_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfNo(String ifNo) {
        registerModifiedProperty("ifNo");
        _ifNo = ifNo;
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
     * [get] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @return The value of the column 'SANSHA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSanshaTypeCd() {
        checkSpecifiedProperty("sanshaTypeCd");
        return convertEmptyToNull(_sanshaTypeCd);
    }

    /**
     * [set] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @param sanshaTypeCd The value of the column 'SANSHA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaTypeCd(String sanshaTypeCd) {
        registerModifiedProperty("sanshaTypeCd");
        _sanshaTypeCd = sanshaTypeCd;
    }

    /**
     * [get] RECEIVE_REASON_CD: {VARCHAR(30)} <br>
     * 入荷発生事由
     * @return The value of the column 'RECEIVE_REASON_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveReasonCd() {
        checkSpecifiedProperty("receiveReasonCd");
        return convertEmptyToNull(_receiveReasonCd);
    }

    /**
     * [set] RECEIVE_REASON_CD: {VARCHAR(30)} <br>
     * 入荷発生事由
     * @param receiveReasonCd The value of the column 'RECEIVE_REASON_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveReasonCd(String receiveReasonCd) {
        registerModifiedProperty("receiveReasonCd");
        _receiveReasonCd = receiveReasonCd;
    }

    /**
     * [get] RECEIVE_REASON_NM: {VARCHAR(30)} <br>
     * 入荷発生事由名称
     * @return The value of the column 'RECEIVE_REASON_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveReasonNm() {
        checkSpecifiedProperty("receiveReasonNm");
        return convertEmptyToNull(_receiveReasonNm);
    }

    /**
     * [set] RECEIVE_REASON_NM: {VARCHAR(30)} <br>
     * 入荷発生事由名称
     * @param receiveReasonNm The value of the column 'RECEIVE_REASON_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveReasonNm(String receiveReasonNm) {
        registerModifiedProperty("receiveReasonNm");
        _receiveReasonNm = receiveReasonNm;
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
     * [get] ORDER_DATE: {VARCHAR(30)} <br>
     * 発注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderDate() {
        checkSpecifiedProperty("orderDate");
        return convertEmptyToNull(_orderDate);
    }

    /**
     * [set] ORDER_DATE: {VARCHAR(30)} <br>
     * 発注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderDate(String orderDate) {
        registerModifiedProperty("orderDate");
        _orderDate = orderDate;
    }

    /**
     * [get] ORDER_TIME: {VARCHAR(30)} <br>
     * 発注時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrderTime() {
        checkSpecifiedProperty("orderTime");
        return convertEmptyToNull(_orderTime);
    }

    /**
     * [set] ORDER_TIME: {VARCHAR(30)} <br>
     * 発注時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderTime(String orderTime) {
        registerModifiedProperty("orderTime");
        _orderTime = orderTime;
    }

    /**
     * [get] CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} <br>
     * 確定納期
     * @return The value of the column 'CONFIRMED_DELIVERY_DATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getConfirmedDeliveryDate() {
        checkSpecifiedProperty("confirmedDeliveryDate");
        return convertEmptyToNull(_confirmedDeliveryDate);
    }

    /**
     * [set] CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} <br>
     * 確定納期
     * @param confirmedDeliveryDate The value of the column 'CONFIRMED_DELIVERY_DATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setConfirmedDeliveryDate(String confirmedDeliveryDate) {
        registerModifiedProperty("confirmedDeliveryDate");
        _confirmedDeliveryDate = confirmedDeliveryDate;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
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
     * [get] RECEIVE_PLAN_NUM: {VARCHAR(30)} <br>
     * 入荷予定数量
     * @return The value of the column 'RECEIVE_PLAN_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivePlanNum() {
        checkSpecifiedProperty("receivePlanNum");
        return convertEmptyToNull(_receivePlanNum);
    }

    /**
     * [set] RECEIVE_PLAN_NUM: {VARCHAR(30)} <br>
     * 入荷予定数量
     * @param receivePlanNum The value of the column 'RECEIVE_PLAN_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanNum(String receivePlanNum) {
        registerModifiedProperty("receivePlanNum");
        _receivePlanNum = receivePlanNum;
    }

    /**
     * [get] RECEIVE_REMAINING_NUM: {VARCHAR(30)} <br>
     * 入荷予定残数
     * @return The value of the column 'RECEIVE_REMAINING_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveRemainingNum() {
        checkSpecifiedProperty("receiveRemainingNum");
        return convertEmptyToNull(_receiveRemainingNum);
    }

    /**
     * [set] RECEIVE_REMAINING_NUM: {VARCHAR(30)} <br>
     * 入荷予定残数
     * @param receiveRemainingNum The value of the column 'RECEIVE_REMAINING_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRemainingNum(String receiveRemainingNum) {
        registerModifiedProperty("receiveRemainingNum");
        _receiveRemainingNum = receiveRemainingNum;
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
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザコード
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserCd() {
        checkSpecifiedProperty("sapUserCd");
        return convertEmptyToNull(_sapUserCd);
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザコード
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserCd(String sapUserCd) {
        registerModifiedProperty("sapUserCd");
        _sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapUserNm() {
        checkSpecifiedProperty("sapUserNm");
        return convertEmptyToNull(_sapUserNm);
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapUserNm(String sapUserNm) {
        registerModifiedProperty("sapUserNm");
        _sapUserNm = sapUserNm;
    }

    /**
     * [get] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @return The value of the column 'MOD_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getModTypeCd() {
        checkSpecifiedProperty("modTypeCd");
        return convertEmptyToNull(_modTypeCd);
    }

    /**
     * [set] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @param modTypeCd The value of the column 'MOD_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setModTypeCd(String modTypeCd) {
        registerModifiedProperty("modTypeCd");
        _modTypeCd = modTypeCd;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositJanCd() {
        checkSpecifiedProperty("depositJanCd");
        return convertEmptyToNull(_depositJanCd);
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositJanCd(String depositJanCd) {
        registerModifiedProperty("depositJanCd");
        _depositJanCd = depositJanCd;
    }

    /**
     * [get] TIMES_NUM: {VARCHAR(30)} <br>
     * 回数
     * @return The value of the column 'TIMES_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public String getTimesNum() {
        checkSpecifiedProperty("timesNum");
        return convertEmptyToNull(_timesNum);
    }

    /**
     * [set] TIMES_NUM: {VARCHAR(30)} <br>
     * 回数
     * @param timesNum The value of the column 'TIMES_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimesNum(String timesNum) {
        registerModifiedProperty("timesNum");
        _timesNum = timesNum;
    }

    /**
     * [get] ACCOUNT_ORDER_NO: {VARCHAR(30)} <br>
     * 得意先注文番号
     * @return The value of the column 'ACCOUNT_ORDER_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getAccountOrderNo() {
        checkSpecifiedProperty("accountOrderNo");
        return convertEmptyToNull(_accountOrderNo);
    }

    /**
     * [set] ACCOUNT_ORDER_NO: {VARCHAR(30)} <br>
     * 得意先注文番号
     * @param accountOrderNo The value of the column 'ACCOUNT_ORDER_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAccountOrderNo(String accountOrderNo) {
        registerModifiedProperty("accountOrderNo");
        _accountOrderNo = accountOrderNo;
    }

    /**
     * [get] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先コード
     * @return The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapSupplierCd() {
        checkSpecifiedProperty("sapSupplierCd");
        return convertEmptyToNull(_sapSupplierCd);
    }

    /**
     * [set] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先コード
     * @param sapSupplierCd The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapSupplierCd(String sapSupplierCd) {
        registerModifiedProperty("sapSupplierCd");
        _sapSupplierCd = sapSupplierCd;
    }

    /**
     * [get] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先コード
     * @return The value of the column 'SAP_VENDER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSapVenderCd() {
        checkSpecifiedProperty("sapVenderCd");
        return convertEmptyToNull(_sapVenderCd);
    }

    /**
     * [set] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先コード
     * @param sapVenderCd The value of the column 'SAP_VENDER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSapVenderCd(String sapVenderCd) {
        registerModifiedProperty("sapVenderCd");
        _sapVenderCd = sapVenderCd;
    }

    /**
     * [get] TODAY_FLG: {VARCHAR(30)} <br>
     * 当日分フラグ
     * @return The value of the column 'TODAY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getTodayFlg() {
        checkSpecifiedProperty("todayFlg");
        return convertEmptyToNull(_todayFlg);
    }

    /**
     * [set] TODAY_FLG: {VARCHAR(30)} <br>
     * 当日分フラグ
     * @param todayFlg The value of the column 'TODAY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTodayFlg(String todayFlg) {
        registerModifiedProperty("todayFlg");
        _todayFlg = todayFlg;
    }

    /**
     * [get] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @return The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getSanshaDeliverySlipNo1() {
        checkSpecifiedProperty("sanshaDeliverySlipNo1");
        return convertEmptyToNull(_sanshaDeliverySlipNo1);
    }

    /**
     * [set] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @param sanshaDeliverySlipNo1 The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSanshaDeliverySlipNo1(String sanshaDeliverySlipNo1) {
        registerModifiedProperty("sanshaDeliverySlipNo1");
        _sanshaDeliverySlipNo1 = sanshaDeliverySlipNo1;
    }

    /**
     * [get] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @return The value of the column 'DATA_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTypeCd() {
        checkSpecifiedProperty("dataTypeCd");
        return convertEmptyToNull(_dataTypeCd);
    }

    /**
     * [set] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @param dataTypeCd The value of the column 'DATA_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTypeCd(String dataTypeCd) {
        registerModifiedProperty("dataTypeCd");
        _dataTypeCd = dataTypeCd;
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
     * 赤黒区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr01() {
        checkSpecifiedProperty("dataTransferOnlyStr01");
        return convertEmptyToNull(_dataTransferOnlyStr01);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        registerModifiedProperty("dataTransferOnlyStr01");
        _dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr02() {
        checkSpecifiedProperty("dataTransferOnlyStr02");
        return convertEmptyToNull(_dataTransferOnlyStr02);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        registerModifiedProperty("dataTransferOnlyStr02");
        _dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr03() {
        checkSpecifiedProperty("dataTransferOnlyStr03");
        return convertEmptyToNull(_dataTransferOnlyStr03);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        registerModifiedProperty("dataTransferOnlyStr03");
        _dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr04() {
        checkSpecifiedProperty("dataTransferOnlyStr04");
        return convertEmptyToNull(_dataTransferOnlyStr04);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @param dataTransferOnlyStr04 The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr04(String dataTransferOnlyStr04) {
        registerModifiedProperty("dataTransferOnlyStr04");
        _dataTransferOnlyStr04 = dataTransferOnlyStr04;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr05() {
        checkSpecifiedProperty("dataTransferOnlyStr05");
        return convertEmptyToNull(_dataTransferOnlyStr05);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @param dataTransferOnlyStr05 The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr05(String dataTransferOnlyStr05) {
        registerModifiedProperty("dataTransferOnlyStr05");
        _dataTransferOnlyStr05 = dataTransferOnlyStr05;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr06() {
        checkSpecifiedProperty("dataTransferOnlyStr06");
        return convertEmptyToNull(_dataTransferOnlyStr06);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @param dataTransferOnlyStr06 The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr06(String dataTransferOnlyStr06) {
        registerModifiedProperty("dataTransferOnlyStr06");
        _dataTransferOnlyStr06 = dataTransferOnlyStr06;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr07() {
        checkSpecifiedProperty("dataTransferOnlyStr07");
        return convertEmptyToNull(_dataTransferOnlyStr07);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @param dataTransferOnlyStr07 The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr07(String dataTransferOnlyStr07) {
        registerModifiedProperty("dataTransferOnlyStr07");
        _dataTransferOnlyStr07 = dataTransferOnlyStr07;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr08() {
        checkSpecifiedProperty("dataTransferOnlyStr08");
        return convertEmptyToNull(_dataTransferOnlyStr08);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @param dataTransferOnlyStr08 The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr08(String dataTransferOnlyStr08) {
        registerModifiedProperty("dataTransferOnlyStr08");
        _dataTransferOnlyStr08 = dataTransferOnlyStr08;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr09() {
        checkSpecifiedProperty("dataTransferOnlyStr09");
        return convertEmptyToNull(_dataTransferOnlyStr09);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @param dataTransferOnlyStr09 The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr09(String dataTransferOnlyStr09) {
        registerModifiedProperty("dataTransferOnlyStr09");
        _dataTransferOnlyStr09 = dataTransferOnlyStr09;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr10() {
        checkSpecifiedProperty("dataTransferOnlyStr10");
        return convertEmptyToNull(_dataTransferOnlyStr10);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @param dataTransferOnlyStr10 The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr10(String dataTransferOnlyStr10) {
        registerModifiedProperty("dataTransferOnlyStr10");
        _dataTransferOnlyStr10 = dataTransferOnlyStr10;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr11() {
        checkSpecifiedProperty("dataTransferOnlyStr11");
        return convertEmptyToNull(_dataTransferOnlyStr11);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @param dataTransferOnlyStr11 The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr11(String dataTransferOnlyStr11) {
        registerModifiedProperty("dataTransferOnlyStr11");
        _dataTransferOnlyStr11 = dataTransferOnlyStr11;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr12() {
        checkSpecifiedProperty("dataTransferOnlyStr12");
        return convertEmptyToNull(_dataTransferOnlyStr12);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @param dataTransferOnlyStr12 The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr12(String dataTransferOnlyStr12) {
        registerModifiedProperty("dataTransferOnlyStr12");
        _dataTransferOnlyStr12 = dataTransferOnlyStr12;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr13() {
        checkSpecifiedProperty("dataTransferOnlyStr13");
        return convertEmptyToNull(_dataTransferOnlyStr13);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @param dataTransferOnlyStr13 The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr13(String dataTransferOnlyStr13) {
        registerModifiedProperty("dataTransferOnlyStr13");
        _dataTransferOnlyStr13 = dataTransferOnlyStr13;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr14() {
        checkSpecifiedProperty("dataTransferOnlyStr14");
        return convertEmptyToNull(_dataTransferOnlyStr14);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @param dataTransferOnlyStr14 The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr14(String dataTransferOnlyStr14) {
        registerModifiedProperty("dataTransferOnlyStr14");
        _dataTransferOnlyStr14 = dataTransferOnlyStr14;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr15() {
        checkSpecifiedProperty("dataTransferOnlyStr15");
        return convertEmptyToNull(_dataTransferOnlyStr15);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @param dataTransferOnlyStr15 The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr15(String dataTransferOnlyStr15) {
        registerModifiedProperty("dataTransferOnlyStr15");
        _dataTransferOnlyStr15 = dataTransferOnlyStr15;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr16() {
        checkSpecifiedProperty("dataTransferOnlyStr16");
        return convertEmptyToNull(_dataTransferOnlyStr16);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @param dataTransferOnlyStr16 The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr16(String dataTransferOnlyStr16) {
        registerModifiedProperty("dataTransferOnlyStr16");
        _dataTransferOnlyStr16 = dataTransferOnlyStr16;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr17() {
        checkSpecifiedProperty("dataTransferOnlyStr17");
        return convertEmptyToNull(_dataTransferOnlyStr17);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @param dataTransferOnlyStr17 The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr17(String dataTransferOnlyStr17) {
        registerModifiedProperty("dataTransferOnlyStr17");
        _dataTransferOnlyStr17 = dataTransferOnlyStr17;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr18() {
        checkSpecifiedProperty("dataTransferOnlyStr18");
        return convertEmptyToNull(_dataTransferOnlyStr18);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @param dataTransferOnlyStr18 The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr18(String dataTransferOnlyStr18) {
        registerModifiedProperty("dataTransferOnlyStr18");
        _dataTransferOnlyStr18 = dataTransferOnlyStr18;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr19() {
        checkSpecifiedProperty("dataTransferOnlyStr19");
        return convertEmptyToNull(_dataTransferOnlyStr19);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @param dataTransferOnlyStr19 The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr19(String dataTransferOnlyStr19) {
        registerModifiedProperty("dataTransferOnlyStr19");
        _dataTransferOnlyStr19 = dataTransferOnlyStr19;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr20() {
        checkSpecifiedProperty("dataTransferOnlyStr20");
        return convertEmptyToNull(_dataTransferOnlyStr20);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @param dataTransferOnlyStr20 The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr20(String dataTransferOnlyStr20) {
        registerModifiedProperty("dataTransferOnlyStr20");
        _dataTransferOnlyStr20 = dataTransferOnlyStr20;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr21() {
        checkSpecifiedProperty("dataTransferOnlyStr21");
        return convertEmptyToNull(_dataTransferOnlyStr21);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @param dataTransferOnlyStr21 The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr21(String dataTransferOnlyStr21) {
        registerModifiedProperty("dataTransferOnlyStr21");
        _dataTransferOnlyStr21 = dataTransferOnlyStr21;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr22() {
        checkSpecifiedProperty("dataTransferOnlyStr22");
        return convertEmptyToNull(_dataTransferOnlyStr22);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @param dataTransferOnlyStr22 The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr22(String dataTransferOnlyStr22) {
        registerModifiedProperty("dataTransferOnlyStr22");
        _dataTransferOnlyStr22 = dataTransferOnlyStr22;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr23() {
        checkSpecifiedProperty("dataTransferOnlyStr23");
        return convertEmptyToNull(_dataTransferOnlyStr23);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @param dataTransferOnlyStr23 The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr23(String dataTransferOnlyStr23) {
        registerModifiedProperty("dataTransferOnlyStr23");
        _dataTransferOnlyStr23 = dataTransferOnlyStr23;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr24() {
        checkSpecifiedProperty("dataTransferOnlyStr24");
        return convertEmptyToNull(_dataTransferOnlyStr24);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @param dataTransferOnlyStr24 The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr24(String dataTransferOnlyStr24) {
        registerModifiedProperty("dataTransferOnlyStr24");
        _dataTransferOnlyStr24 = dataTransferOnlyStr24;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr25() {
        checkSpecifiedProperty("dataTransferOnlyStr25");
        return convertEmptyToNull(_dataTransferOnlyStr25);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @param dataTransferOnlyStr25 The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr25(String dataTransferOnlyStr25) {
        registerModifiedProperty("dataTransferOnlyStr25");
        _dataTransferOnlyStr25 = dataTransferOnlyStr25;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr26() {
        checkSpecifiedProperty("dataTransferOnlyStr26");
        return convertEmptyToNull(_dataTransferOnlyStr26);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @param dataTransferOnlyStr26 The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr26(String dataTransferOnlyStr26) {
        registerModifiedProperty("dataTransferOnlyStr26");
        _dataTransferOnlyStr26 = dataTransferOnlyStr26;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr27() {
        checkSpecifiedProperty("dataTransferOnlyStr27");
        return convertEmptyToNull(_dataTransferOnlyStr27);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @param dataTransferOnlyStr27 The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr27(String dataTransferOnlyStr27) {
        registerModifiedProperty("dataTransferOnlyStr27");
        _dataTransferOnlyStr27 = dataTransferOnlyStr27;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * SAP削除フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed even if selected: for no constraint)
     */
    public String getDataTransferOnlyStr28() {
        checkSpecifiedProperty("dataTransferOnlyStr28");
        return convertEmptyToNull(_dataTransferOnlyStr28);
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * SAP削除フラグ
     * @param dataTransferOnlyStr28 The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDataTransferOnlyStr28(String dataTransferOnlyStr28) {
        registerModifiedProperty("dataTransferOnlyStr28");
        _dataTransferOnlyStr28 = dataTransferOnlyStr28;
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
