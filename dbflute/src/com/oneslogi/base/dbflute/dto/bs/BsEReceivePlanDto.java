package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of e_receive_plan as TABLE. <br>
 * 入荷予定受信テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_ID
 *
 * [column]
 *     RECEIVE_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STORE_SLIP_NO, STORE_SLIP_ROW_NO, SLIP_TYPE_CD, IF_ID, IF_NO, HINMOKU_CD, HINMOKU_GROUP, SANSHA_TYPE_CD, RECEIVE_REASON_CD, RECEIVE_REASON_NM, CUSTOMER_CD, CUSTOMER_NM, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DATE, HINMOKU_TEXT, JAN_CD, UNIT_NM, RECEIVE_PLAN_NUM, RECEIVE_REMAINING_NUM, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, MOD_TYPE_CD, DEPOSIT_JAN_CD, TIMES_NUM, ACCOUNT_ORDER_NO, SAP_SUPPLIER_CD, SAP_VENDER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, WMS_SEND_FLG, LP_SEND_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsEReceivePlanDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receivePlanId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** STORE_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeSlipNo;

    /** STORE_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeSlipRowNo;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipTypeCd;

    /** IF_ID: {VARCHAR(30)} */
    @JsonKey
    protected String _ifId;

    /** IF_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _ifNo;

    /** HINMOKU_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

    /** SANSHA_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sanshaTypeCd;

    /** RECEIVE_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveReasonCd;

    /** RECEIVE_REASON_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveReasonNm;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _customerNm;

    /** ORDER_DATE: {VARCHAR(30)} */
    @JsonKey
    protected String _orderDate;

    /** ORDER_TIME: {VARCHAR(30)} */
    @JsonKey
    protected String _orderTime;

    /** CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} */
    @JsonKey
    protected String _confirmedDeliveryDate;

    /** HINMOKU_TEXT: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** RECEIVE_PLAN_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _receivePlanNum;

    /** RECEIVE_REMAINING_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveRemainingNum;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storeStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _lotManagTypeCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _sapUserNm;

    /** MOD_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _modTypeCd;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositJanCd;

    /** TIMES_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _timesNum;

    /** ACCOUNT_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _accountOrderNo;

    /** SAP_SUPPLIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapSupplierCd;

    /** SAP_VENDER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapVenderCd;

    /** TODAY_FLG: {VARCHAR(30)} */
    @JsonKey
    protected String _todayFlg;

    /** SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} */
    @JsonKey
    protected String _sanshaDeliverySlipNo1;

    /** DATA_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTypeCd;

    /** WMS_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _wmsSendFlg;

    /** LP_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _lpSendFlg;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddSs;

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddUserCd;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdSs;

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdUserCd;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr03;

    /** DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr04;

    /** DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr05;

    /** DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr06;

    /** DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr07;

    /** DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr08;

    /** DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr09;

    /** DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr10;

    /** DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr11;

    /** DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr12;

    /** DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr13;

    /** DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr14;

    /** DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr15;

    /** DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr16;

    /** DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr17;

    /** DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr18;

    /** DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr19;

    /** DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr20;

    /** DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr21;

    /** DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr22;

    /** DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr23;

    /** DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr24;

    /** DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr25;

    /** DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} */
    @JsonKey
    protected String _dataTransferOnlyStr26;

    /** DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr27;

    /** DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr28;

    /** SPARE_STR: {VARCHAR(255)} */
    @JsonKey
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReceivePlanDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsEReceivePlanDto)) { return false; }
        final BsEReceivePlanDto otherEntity = (BsEReceivePlanDto)other;
        if (!helpComparingValue(getReceivePlanId(), otherEntity.getReceivePlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "e_receive_plan");
        result = xCH(result, getReceivePlanId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getReceivePlanId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getStoreSlipNo());
        sb.append(c).append(getStoreSlipRowNo());
        sb.append(c).append(getSlipTypeCd());
        sb.append(c).append(getIfId());
        sb.append(c).append(getIfNo());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getHinmokuGroup());
        sb.append(c).append(getSanshaTypeCd());
        sb.append(c).append(getReceiveReasonCd());
        sb.append(c).append(getReceiveReasonNm());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getOrderDate());
        sb.append(c).append(getOrderTime());
        sb.append(c).append(getConfirmedDeliveryDate());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getReceivePlanNum());
        sb.append(c).append(getReceiveRemainingNum());
        sb.append(c).append(getStorePlantCd());
        sb.append(c).append(getStoreStorageSpaceCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getLotManagTypeCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getTenhanshaNm1());
        sb.append(c).append(getTenhanshaNm2());
        sb.append(c).append(getSapUserCd());
        sb.append(c).append(getSapUserNm());
        sb.append(c).append(getModTypeCd());
        sb.append(c).append(getDepositJanCd());
        sb.append(c).append(getTimesNum());
        sb.append(c).append(getAccountOrderNo());
        sb.append(c).append(getSapSupplierCd());
        sb.append(c).append(getSapVenderCd());
        sb.append(c).append(getTodayFlg());
        sb.append(c).append(getSanshaDeliverySlipNo1());
        sb.append(c).append(getDataTypeCd());
        sb.append(c).append(getWmsSendFlg());
        sb.append(c).append(getLpSendFlg());
        sb.append(c).append(getSapAddYyyy());
        sb.append(c).append(getSapAddMm());
        sb.append(c).append(getSapAddDd());
        sb.append(c).append(getSapAddHh());
        sb.append(c).append(getSapAddMi());
        sb.append(c).append(getSapAddSs());
        sb.append(c).append(getSapAddUserCd());
        sb.append(c).append(getSapUpdYyyy());
        sb.append(c).append(getSapUpdMm());
        sb.append(c).append(getSapUpdDd());
        sb.append(c).append(getSapUpdHh());
        sb.append(c).append(getSapUpdMi());
        sb.append(c).append(getSapUpdSs());
        sb.append(c).append(getSapUpdUserCd());
        sb.append(c).append(getDataTransferOnlyStr01());
        sb.append(c).append(getDataTransferOnlyStr02());
        sb.append(c).append(getDataTransferOnlyStr03());
        sb.append(c).append(getDataTransferOnlyStr04());
        sb.append(c).append(getDataTransferOnlyStr05());
        sb.append(c).append(getDataTransferOnlyStr06());
        sb.append(c).append(getDataTransferOnlyStr07());
        sb.append(c).append(getDataTransferOnlyStr08());
        sb.append(c).append(getDataTransferOnlyStr09());
        sb.append(c).append(getDataTransferOnlyStr10());
        sb.append(c).append(getDataTransferOnlyStr11());
        sb.append(c).append(getDataTransferOnlyStr12());
        sb.append(c).append(getDataTransferOnlyStr13());
        sb.append(c).append(getDataTransferOnlyStr14());
        sb.append(c).append(getDataTransferOnlyStr15());
        sb.append(c).append(getDataTransferOnlyStr16());
        sb.append(c).append(getDataTransferOnlyStr17());
        sb.append(c).append(getDataTransferOnlyStr18());
        sb.append(c).append(getDataTransferOnlyStr19());
        sb.append(c).append(getDataTransferOnlyStr20());
        sb.append(c).append(getDataTransferOnlyStr21());
        sb.append(c).append(getDataTransferOnlyStr22());
        sb.append(c).append(getDataTransferOnlyStr23());
        sb.append(c).append(getDataTransferOnlyStr24());
        sb.append(c).append(getDataTransferOnlyStr25());
        sb.append(c).append(getDataTransferOnlyStr26());
        sb.append(c).append(getDataTransferOnlyStr27());
        sb.append(c).append(getDataTransferOnlyStr28());
        sb.append(c).append(getSpareStr());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定受信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getReceivePlanId() {
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定受信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setReceivePlanId(Long receivePlanId) {
        __modifiedProperties.add("receivePlanId");
        this._receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'STORE_SLIP_NO'. (NullAllowed)
     */
    public String getStoreSlipNo() {
        return _storeSlipNo;
    }

    /**
     * [set] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param storeSlipNo The value of the column 'STORE_SLIP_NO'. (NullAllowed)
     */
    public void setStoreSlipNo(String storeSlipNo) {
        __modifiedProperties.add("storeSlipNo");
        this._storeSlipNo = storeSlipNo;
    }

    /**
     * [get] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @return The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed)
     */
    public String getStoreSlipRowNo() {
        return _storeSlipRowNo;
    }

    /**
     * [set] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @param storeSlipRowNo The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed)
     */
    public void setStoreSlipRowNo(String storeSlipRowNo) {
        __modifiedProperties.add("storeSlipRowNo");
        this._storeSlipRowNo = storeSlipRowNo;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSlipTypeCd() {
        return _slipTypeCd;
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        __modifiedProperties.add("slipTypeCd");
        this._slipTypeCd = slipTypeCd;
    }

    /**
     * [get] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @return The value of the column 'IF_ID'. (NullAllowed)
     */
    public String getIfId() {
        return _ifId;
    }

    /**
     * [set] IF_ID: {VARCHAR(30)} <br>
     * IFID
     * @param ifId The value of the column 'IF_ID'. (NullAllowed)
     */
    public void setIfId(String ifId) {
        __modifiedProperties.add("ifId");
        this._ifId = ifId;
    }

    /**
     * [get] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @return The value of the column 'IF_NO'. (NullAllowed)
     */
    public String getIfNo() {
        return _ifNo;
    }

    /**
     * [set] IF_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @param ifNo The value of the column 'IF_NO'. (NullAllowed)
     */
    public void setIfNo(String ifNo) {
        __modifiedProperties.add("ifNo");
        this._ifNo = ifNo;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public String getHinmokuCd() {
        return _hinmokuCd;
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public void setHinmokuCd(String hinmokuCd) {
        __modifiedProperties.add("hinmokuCd");
        this._hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public String getHinmokuGroup() {
        return _hinmokuGroup;
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        __modifiedProperties.add("hinmokuGroup");
        this._hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @return The value of the column 'SANSHA_TYPE_CD'. (NullAllowed)
     */
    public String getSanshaTypeCd() {
        return _sanshaTypeCd;
    }

    /**
     * [set] SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * 3社区分
     * @param sanshaTypeCd The value of the column 'SANSHA_TYPE_CD'. (NullAllowed)
     */
    public void setSanshaTypeCd(String sanshaTypeCd) {
        __modifiedProperties.add("sanshaTypeCd");
        this._sanshaTypeCd = sanshaTypeCd;
    }

    /**
     * [get] RECEIVE_REASON_CD: {VARCHAR(30)} <br>
     * 入荷発生事由
     * @return The value of the column 'RECEIVE_REASON_CD'. (NullAllowed)
     */
    public String getReceiveReasonCd() {
        return _receiveReasonCd;
    }

    /**
     * [set] RECEIVE_REASON_CD: {VARCHAR(30)} <br>
     * 入荷発生事由
     * @param receiveReasonCd The value of the column 'RECEIVE_REASON_CD'. (NullAllowed)
     */
    public void setReceiveReasonCd(String receiveReasonCd) {
        __modifiedProperties.add("receiveReasonCd");
        this._receiveReasonCd = receiveReasonCd;
    }

    /**
     * [get] RECEIVE_REASON_NM: {VARCHAR(30)} <br>
     * 入荷発生事由名称
     * @return The value of the column 'RECEIVE_REASON_NM'. (NullAllowed)
     */
    public String getReceiveReasonNm() {
        return _receiveReasonNm;
    }

    /**
     * [set] RECEIVE_REASON_NM: {VARCHAR(30)} <br>
     * 入荷発生事由名称
     * @param receiveReasonNm The value of the column 'RECEIVE_REASON_NM'. (NullAllowed)
     */
    public void setReceiveReasonNm(String receiveReasonNm) {
        __modifiedProperties.add("receiveReasonNm");
        this._receiveReasonNm = receiveReasonNm;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先コード
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先コード
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] ORDER_DATE: {VARCHAR(30)} <br>
     * 発注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public String getOrderDate() {
        return _orderDate;
    }

    /**
     * [set] ORDER_DATE: {VARCHAR(30)} <br>
     * 発注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public void setOrderDate(String orderDate) {
        __modifiedProperties.add("orderDate");
        this._orderDate = orderDate;
    }

    /**
     * [get] ORDER_TIME: {VARCHAR(30)} <br>
     * 発注時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public String getOrderTime() {
        return _orderTime;
    }

    /**
     * [set] ORDER_TIME: {VARCHAR(30)} <br>
     * 発注時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public void setOrderTime(String orderTime) {
        __modifiedProperties.add("orderTime");
        this._orderTime = orderTime;
    }

    /**
     * [get] CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} <br>
     * 確定納期
     * @return The value of the column 'CONFIRMED_DELIVERY_DATE'. (NullAllowed)
     */
    public String getConfirmedDeliveryDate() {
        return _confirmedDeliveryDate;
    }

    /**
     * [set] CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} <br>
     * 確定納期
     * @param confirmedDeliveryDate The value of the column 'CONFIRMED_DELIVERY_DATE'. (NullAllowed)
     */
    public void setConfirmedDeliveryDate(String confirmedDeliveryDate) {
        __modifiedProperties.add("confirmedDeliveryDate");
        this._confirmedDeliveryDate = confirmedDeliveryDate;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public String getHinmokuText() {
        return _hinmokuText;
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(100)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public void setHinmokuText(String hinmokuText) {
        __modifiedProperties.add("hinmokuText");
        this._hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
    }

    /**
     * [get] RECEIVE_PLAN_NUM: {VARCHAR(30)} <br>
     * 入荷予定数量
     * @return The value of the column 'RECEIVE_PLAN_NUM'. (NullAllowed)
     */
    public String getReceivePlanNum() {
        return _receivePlanNum;
    }

    /**
     * [set] RECEIVE_PLAN_NUM: {VARCHAR(30)} <br>
     * 入荷予定数量
     * @param receivePlanNum The value of the column 'RECEIVE_PLAN_NUM'. (NullAllowed)
     */
    public void setReceivePlanNum(String receivePlanNum) {
        __modifiedProperties.add("receivePlanNum");
        this._receivePlanNum = receivePlanNum;
    }

    /**
     * [get] RECEIVE_REMAINING_NUM: {VARCHAR(30)} <br>
     * 入荷予定残数
     * @return The value of the column 'RECEIVE_REMAINING_NUM'. (NullAllowed)
     */
    public String getReceiveRemainingNum() {
        return _receiveRemainingNum;
    }

    /**
     * [set] RECEIVE_REMAINING_NUM: {VARCHAR(30)} <br>
     * 入荷予定残数
     * @param receiveRemainingNum The value of the column 'RECEIVE_REMAINING_NUM'. (NullAllowed)
     */
    public void setReceiveRemainingNum(String receiveRemainingNum) {
        __modifiedProperties.add("receiveRemainingNum");
        this._receiveRemainingNum = receiveRemainingNum;
    }

    /**
     * [get] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public String getStorePlantCd() {
        return _storePlantCd;
    }

    /**
     * [set] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public void setStorePlantCd(String storePlantCd) {
        __modifiedProperties.add("storePlantCd");
        this._storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStoreStorageSpaceCd() {
        return _storeStorageSpaceCd;
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        __modifiedProperties.add("storeStorageSpaceCd");
        this._storeStorageSpaceCd = storeStorageSpaceCd;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public String getShippingPlantCd() {
        return _shippingPlantCd;
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        __modifiedProperties.add("shippingPlantCd");
        this._shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getShippingStorageSpaceCd() {
        return _shippingStorageSpaceCd;
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        __modifiedProperties.add("shippingStorageSpaceCd");
        this._shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public String getLotManagTypeCd() {
        return _lotManagTypeCd;
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        __modifiedProperties.add("lotManagTypeCd");
        this._lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public String getTenhanshaCd() {
        return _tenhanshaCd;
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        __modifiedProperties.add("tenhanshaCd");
        this._tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public String getTenhanshaNm1() {
        return _tenhanshaNm1;
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        __modifiedProperties.add("tenhanshaNm1");
        this._tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public String getTenhanshaNm2() {
        return _tenhanshaNm2;
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        __modifiedProperties.add("tenhanshaNm2");
        this._tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザコード
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed)
     */
    public String getSapUserCd() {
        return _sapUserCd;
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザコード
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed)
     */
    public void setSapUserCd(String sapUserCd) {
        __modifiedProperties.add("sapUserCd");
        this._sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed)
     */
    public String getSapUserNm() {
        return _sapUserNm;
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed)
     */
    public void setSapUserNm(String sapUserNm) {
        __modifiedProperties.add("sapUserNm");
        this._sapUserNm = sapUserNm;
    }

    /**
     * [get] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @return The value of the column 'MOD_TYPE_CD'. (NullAllowed)
     */
    public String getModTypeCd() {
        return _modTypeCd;
    }

    /**
     * [set] MOD_TYPE_CD: {VARCHAR(30)} <br>
     * 修正区分
     * @param modTypeCd The value of the column 'MOD_TYPE_CD'. (NullAllowed)
     */
    public void setModTypeCd(String modTypeCd) {
        __modifiedProperties.add("modTypeCd");
        this._modTypeCd = modTypeCd;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public String getDepositJanCd() {
        return _depositJanCd;
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預りJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public void setDepositJanCd(String depositJanCd) {
        __modifiedProperties.add("depositJanCd");
        this._depositJanCd = depositJanCd;
    }

    /**
     * [get] TIMES_NUM: {VARCHAR(30)} <br>
     * 回数
     * @return The value of the column 'TIMES_NUM'. (NullAllowed)
     */
    public String getTimesNum() {
        return _timesNum;
    }

    /**
     * [set] TIMES_NUM: {VARCHAR(30)} <br>
     * 回数
     * @param timesNum The value of the column 'TIMES_NUM'. (NullAllowed)
     */
    public void setTimesNum(String timesNum) {
        __modifiedProperties.add("timesNum");
        this._timesNum = timesNum;
    }

    /**
     * [get] ACCOUNT_ORDER_NO: {VARCHAR(30)} <br>
     * 得意先注文番号
     * @return The value of the column 'ACCOUNT_ORDER_NO'. (NullAllowed)
     */
    public String getAccountOrderNo() {
        return _accountOrderNo;
    }

    /**
     * [set] ACCOUNT_ORDER_NO: {VARCHAR(30)} <br>
     * 得意先注文番号
     * @param accountOrderNo The value of the column 'ACCOUNT_ORDER_NO'. (NullAllowed)
     */
    public void setAccountOrderNo(String accountOrderNo) {
        __modifiedProperties.add("accountOrderNo");
        this._accountOrderNo = accountOrderNo;
    }

    /**
     * [get] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先コード
     * @return The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed)
     */
    public String getSapSupplierCd() {
        return _sapSupplierCd;
    }

    /**
     * [set] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先コード
     * @param sapSupplierCd The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed)
     */
    public void setSapSupplierCd(String sapSupplierCd) {
        __modifiedProperties.add("sapSupplierCd");
        this._sapSupplierCd = sapSupplierCd;
    }

    /**
     * [get] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先コード
     * @return The value of the column 'SAP_VENDER_CD'. (NullAllowed)
     */
    public String getSapVenderCd() {
        return _sapVenderCd;
    }

    /**
     * [set] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先コード
     * @param sapVenderCd The value of the column 'SAP_VENDER_CD'. (NullAllowed)
     */
    public void setSapVenderCd(String sapVenderCd) {
        __modifiedProperties.add("sapVenderCd");
        this._sapVenderCd = sapVenderCd;
    }

    /**
     * [get] TODAY_FLG: {VARCHAR(30)} <br>
     * 当日分フラグ
     * @return The value of the column 'TODAY_FLG'. (NullAllowed)
     */
    public String getTodayFlg() {
        return _todayFlg;
    }

    /**
     * [set] TODAY_FLG: {VARCHAR(30)} <br>
     * 当日分フラグ
     * @param todayFlg The value of the column 'TODAY_FLG'. (NullAllowed)
     */
    public void setTodayFlg(String todayFlg) {
        __modifiedProperties.add("todayFlg");
        this._todayFlg = todayFlg;
    }

    /**
     * [get] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @return The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed)
     */
    public String getSanshaDeliverySlipNo1() {
        return _sanshaDeliverySlipNo1;
    }

    /**
     * [set] SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * 3社納品書番号1
     * @param sanshaDeliverySlipNo1 The value of the column 'SANSHA_DELIVERY_SLIP_NO1'. (NullAllowed)
     */
    public void setSanshaDeliverySlipNo1(String sanshaDeliverySlipNo1) {
        __modifiedProperties.add("sanshaDeliverySlipNo1");
        this._sanshaDeliverySlipNo1 = sanshaDeliverySlipNo1;
    }

    /**
     * [get] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @return The value of the column 'DATA_TYPE_CD'. (NullAllowed)
     */
    public String getDataTypeCd() {
        return _dataTypeCd;
    }

    /**
     * [set] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分
     * @param dataTypeCd The value of the column 'DATA_TYPE_CD'. (NullAllowed)
     */
    public void setDataTypeCd(String dataTypeCd) {
        __modifiedProperties.add("dataTypeCd");
        this._dataTypeCd = dataTypeCd;
    }

    /**
     * [get] WMS_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WMS_SEND_FLG'. (NullAllowed)
     */
    public String getWmsSendFlg() {
        return _wmsSendFlg;
    }

    /**
     * [set] WMS_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @param wmsSendFlg The value of the column 'WMS_SEND_FLG'. (NullAllowed)
     */
    public void setWmsSendFlg(String wmsSendFlg) {
        __modifiedProperties.add("wmsSendFlg");
        this._wmsSendFlg = wmsSendFlg;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public String getLpSendFlg() {
        return _lpSendFlg;
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public void setLpSendFlg(String lpSendFlg) {
        __modifiedProperties.add("lpSendFlg");
        this._lpSendFlg = lpSendFlg;
    }

    /**
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public String getSapAddYyyy() {
        return _sapAddYyyy;
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        __modifiedProperties.add("sapAddYyyy");
        this._sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public String getSapAddMm() {
        return _sapAddMm;
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public void setSapAddMm(String sapAddMm) {
        __modifiedProperties.add("sapAddMm");
        this._sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public String getSapAddDd() {
        return _sapAddDd;
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public void setSapAddDd(String sapAddDd) {
        __modifiedProperties.add("sapAddDd");
        this._sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public String getSapAddHh() {
        return _sapAddHh;
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public void setSapAddHh(String sapAddHh) {
        __modifiedProperties.add("sapAddHh");
        this._sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public String getSapAddMi() {
        return _sapAddMi;
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public void setSapAddMi(String sapAddMi) {
        __modifiedProperties.add("sapAddMi");
        this._sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public String getSapAddSs() {
        return _sapAddSs;
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public void setSapAddSs(String sapAddSs) {
        __modifiedProperties.add("sapAddSs");
        this._sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public String getSapAddUserCd() {
        return _sapAddUserCd;
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        __modifiedProperties.add("sapAddUserCd");
        this._sapAddUserCd = sapAddUserCd;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public String getSapUpdYyyy() {
        return _sapUpdYyyy;
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        __modifiedProperties.add("sapUpdYyyy");
        this._sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public String getSapUpdMm() {
        return _sapUpdMm;
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public void setSapUpdMm(String sapUpdMm) {
        __modifiedProperties.add("sapUpdMm");
        this._sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public String getSapUpdDd() {
        return _sapUpdDd;
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public void setSapUpdDd(String sapUpdDd) {
        __modifiedProperties.add("sapUpdDd");
        this._sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public String getSapUpdHh() {
        return _sapUpdHh;
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public void setSapUpdHh(String sapUpdHh) {
        __modifiedProperties.add("sapUpdHh");
        this._sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public String getSapUpdMi() {
        return _sapUpdMi;
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public void setSapUpdMi(String sapUpdMi) {
        __modifiedProperties.add("sapUpdMi");
        this._sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public String getSapUpdSs() {
        return _sapUpdSs;
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public void setSapUpdSs(String sapUpdSs) {
        __modifiedProperties.add("sapUpdSs");
        this._sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public String getSapUpdUserCd() {
        return _sapUpdUserCd;
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        __modifiedProperties.add("sapUpdUserCd");
        this._sapUpdUserCd = sapUpdUserCd;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public String getDataTransferOnlyStr01() {
        return _dataTransferOnlyStr01;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        __modifiedProperties.add("dataTransferOnlyStr01");
        this._dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public String getDataTransferOnlyStr02() {
        return _dataTransferOnlyStr02;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        __modifiedProperties.add("dataTransferOnlyStr02");
        this._dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public String getDataTransferOnlyStr03() {
        return _dataTransferOnlyStr03;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        __modifiedProperties.add("dataTransferOnlyStr03");
        this._dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public String getDataTransferOnlyStr04() {
        return _dataTransferOnlyStr04;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @param dataTransferOnlyStr04 The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public void setDataTransferOnlyStr04(String dataTransferOnlyStr04) {
        __modifiedProperties.add("dataTransferOnlyStr04");
        this._dataTransferOnlyStr04 = dataTransferOnlyStr04;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public String getDataTransferOnlyStr05() {
        return _dataTransferOnlyStr05;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @param dataTransferOnlyStr05 The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public void setDataTransferOnlyStr05(String dataTransferOnlyStr05) {
        __modifiedProperties.add("dataTransferOnlyStr05");
        this._dataTransferOnlyStr05 = dataTransferOnlyStr05;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public String getDataTransferOnlyStr06() {
        return _dataTransferOnlyStr06;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @param dataTransferOnlyStr06 The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public void setDataTransferOnlyStr06(String dataTransferOnlyStr06) {
        __modifiedProperties.add("dataTransferOnlyStr06");
        this._dataTransferOnlyStr06 = dataTransferOnlyStr06;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public String getDataTransferOnlyStr07() {
        return _dataTransferOnlyStr07;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @param dataTransferOnlyStr07 The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public void setDataTransferOnlyStr07(String dataTransferOnlyStr07) {
        __modifiedProperties.add("dataTransferOnlyStr07");
        this._dataTransferOnlyStr07 = dataTransferOnlyStr07;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public String getDataTransferOnlyStr08() {
        return _dataTransferOnlyStr08;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @param dataTransferOnlyStr08 The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public void setDataTransferOnlyStr08(String dataTransferOnlyStr08) {
        __modifiedProperties.add("dataTransferOnlyStr08");
        this._dataTransferOnlyStr08 = dataTransferOnlyStr08;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public String getDataTransferOnlyStr09() {
        return _dataTransferOnlyStr09;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @param dataTransferOnlyStr09 The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public void setDataTransferOnlyStr09(String dataTransferOnlyStr09) {
        __modifiedProperties.add("dataTransferOnlyStr09");
        this._dataTransferOnlyStr09 = dataTransferOnlyStr09;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed)
     */
    public String getDataTransferOnlyStr10() {
        return _dataTransferOnlyStr10;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @param dataTransferOnlyStr10 The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed)
     */
    public void setDataTransferOnlyStr10(String dataTransferOnlyStr10) {
        __modifiedProperties.add("dataTransferOnlyStr10");
        this._dataTransferOnlyStr10 = dataTransferOnlyStr10;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed)
     */
    public String getDataTransferOnlyStr11() {
        return _dataTransferOnlyStr11;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @param dataTransferOnlyStr11 The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed)
     */
    public void setDataTransferOnlyStr11(String dataTransferOnlyStr11) {
        __modifiedProperties.add("dataTransferOnlyStr11");
        this._dataTransferOnlyStr11 = dataTransferOnlyStr11;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed)
     */
    public String getDataTransferOnlyStr12() {
        return _dataTransferOnlyStr12;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @param dataTransferOnlyStr12 The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed)
     */
    public void setDataTransferOnlyStr12(String dataTransferOnlyStr12) {
        __modifiedProperties.add("dataTransferOnlyStr12");
        this._dataTransferOnlyStr12 = dataTransferOnlyStr12;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed)
     */
    public String getDataTransferOnlyStr13() {
        return _dataTransferOnlyStr13;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @param dataTransferOnlyStr13 The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed)
     */
    public void setDataTransferOnlyStr13(String dataTransferOnlyStr13) {
        __modifiedProperties.add("dataTransferOnlyStr13");
        this._dataTransferOnlyStr13 = dataTransferOnlyStr13;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed)
     */
    public String getDataTransferOnlyStr14() {
        return _dataTransferOnlyStr14;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @param dataTransferOnlyStr14 The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed)
     */
    public void setDataTransferOnlyStr14(String dataTransferOnlyStr14) {
        __modifiedProperties.add("dataTransferOnlyStr14");
        this._dataTransferOnlyStr14 = dataTransferOnlyStr14;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed)
     */
    public String getDataTransferOnlyStr15() {
        return _dataTransferOnlyStr15;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @param dataTransferOnlyStr15 The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed)
     */
    public void setDataTransferOnlyStr15(String dataTransferOnlyStr15) {
        __modifiedProperties.add("dataTransferOnlyStr15");
        this._dataTransferOnlyStr15 = dataTransferOnlyStr15;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed)
     */
    public String getDataTransferOnlyStr16() {
        return _dataTransferOnlyStr16;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @param dataTransferOnlyStr16 The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed)
     */
    public void setDataTransferOnlyStr16(String dataTransferOnlyStr16) {
        __modifiedProperties.add("dataTransferOnlyStr16");
        this._dataTransferOnlyStr16 = dataTransferOnlyStr16;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed)
     */
    public String getDataTransferOnlyStr17() {
        return _dataTransferOnlyStr17;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @param dataTransferOnlyStr17 The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed)
     */
    public void setDataTransferOnlyStr17(String dataTransferOnlyStr17) {
        __modifiedProperties.add("dataTransferOnlyStr17");
        this._dataTransferOnlyStr17 = dataTransferOnlyStr17;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed)
     */
    public String getDataTransferOnlyStr18() {
        return _dataTransferOnlyStr18;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @param dataTransferOnlyStr18 The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed)
     */
    public void setDataTransferOnlyStr18(String dataTransferOnlyStr18) {
        __modifiedProperties.add("dataTransferOnlyStr18");
        this._dataTransferOnlyStr18 = dataTransferOnlyStr18;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed)
     */
    public String getDataTransferOnlyStr19() {
        return _dataTransferOnlyStr19;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @param dataTransferOnlyStr19 The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed)
     */
    public void setDataTransferOnlyStr19(String dataTransferOnlyStr19) {
        __modifiedProperties.add("dataTransferOnlyStr19");
        this._dataTransferOnlyStr19 = dataTransferOnlyStr19;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed)
     */
    public String getDataTransferOnlyStr20() {
        return _dataTransferOnlyStr20;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @param dataTransferOnlyStr20 The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed)
     */
    public void setDataTransferOnlyStr20(String dataTransferOnlyStr20) {
        __modifiedProperties.add("dataTransferOnlyStr20");
        this._dataTransferOnlyStr20 = dataTransferOnlyStr20;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed)
     */
    public String getDataTransferOnlyStr21() {
        return _dataTransferOnlyStr21;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @param dataTransferOnlyStr21 The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed)
     */
    public void setDataTransferOnlyStr21(String dataTransferOnlyStr21) {
        __modifiedProperties.add("dataTransferOnlyStr21");
        this._dataTransferOnlyStr21 = dataTransferOnlyStr21;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed)
     */
    public String getDataTransferOnlyStr22() {
        return _dataTransferOnlyStr22;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @param dataTransferOnlyStr22 The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed)
     */
    public void setDataTransferOnlyStr22(String dataTransferOnlyStr22) {
        __modifiedProperties.add("dataTransferOnlyStr22");
        this._dataTransferOnlyStr22 = dataTransferOnlyStr22;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed)
     */
    public String getDataTransferOnlyStr23() {
        return _dataTransferOnlyStr23;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @param dataTransferOnlyStr23 The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed)
     */
    public void setDataTransferOnlyStr23(String dataTransferOnlyStr23) {
        __modifiedProperties.add("dataTransferOnlyStr23");
        this._dataTransferOnlyStr23 = dataTransferOnlyStr23;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed)
     */
    public String getDataTransferOnlyStr24() {
        return _dataTransferOnlyStr24;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @param dataTransferOnlyStr24 The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed)
     */
    public void setDataTransferOnlyStr24(String dataTransferOnlyStr24) {
        __modifiedProperties.add("dataTransferOnlyStr24");
        this._dataTransferOnlyStr24 = dataTransferOnlyStr24;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed)
     */
    public String getDataTransferOnlyStr25() {
        return _dataTransferOnlyStr25;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @param dataTransferOnlyStr25 The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed)
     */
    public void setDataTransferOnlyStr25(String dataTransferOnlyStr25) {
        __modifiedProperties.add("dataTransferOnlyStr25");
        this._dataTransferOnlyStr25 = dataTransferOnlyStr25;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed)
     */
    public String getDataTransferOnlyStr26() {
        return _dataTransferOnlyStr26;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @param dataTransferOnlyStr26 The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed)
     */
    public void setDataTransferOnlyStr26(String dataTransferOnlyStr26) {
        __modifiedProperties.add("dataTransferOnlyStr26");
        this._dataTransferOnlyStr26 = dataTransferOnlyStr26;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed)
     */
    public String getDataTransferOnlyStr27() {
        return _dataTransferOnlyStr27;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @param dataTransferOnlyStr27 The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed)
     */
    public void setDataTransferOnlyStr27(String dataTransferOnlyStr27) {
        __modifiedProperties.add("dataTransferOnlyStr27");
        this._dataTransferOnlyStr27 = dataTransferOnlyStr27;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * SAP削除フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed)
     */
    public String getDataTransferOnlyStr28() {
        return _dataTransferOnlyStr28;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * SAP削除フラグ
     * @param dataTransferOnlyStr28 The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed)
     */
    public void setDataTransferOnlyStr28(String dataTransferOnlyStr28) {
        __modifiedProperties.add("dataTransferOnlyStr28");
        this._dataTransferOnlyStr28 = dataTransferOnlyStr28;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public String getSpareStr() {
        return _spareStr;
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public void setSpareStr(String spareStr) {
        __modifiedProperties.add("spareStr");
        this._spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
