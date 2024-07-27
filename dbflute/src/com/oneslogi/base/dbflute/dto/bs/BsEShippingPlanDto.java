package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of e_shipping_plan as TABLE. <br>
 * 出荷予定受信テーブル
 * <pre>
 * [primary-key]
 *     SHIPPING_PLAN_ID
 *
 * [column]
 *     SHIPPING_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_PLAN_SLIP_NO, SHIPPING_PLAN_SLIP_ROW_NO, SLIP_TYPE_CD, SHIPPING_DT, HINMOKU_CD, SALES_ORDER_TYPE_CD, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSACTION_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_ID
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
public abstract class BsEShippingPlanDto implements Serializable {

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
    /** SHIPPING_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingPlanId;

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

    /** SHIPPING_PLAN_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlanSlipNo;

    /** SHIPPING_PLAN_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlanSlipRowNo;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipTypeCd;

    /** SHIPPING_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingDt;

    /** HINMOKU_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuCd;

    /** SALES_ORDER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderTypeCd;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingTypeCd;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingReasonCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

    /** SHIPPING_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingNum;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    @JsonKey
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _directDeliveryTypeCd;

    /** KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} */
    @JsonKey
    protected String _koguchiDeliveryFlg;

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

    /** TRANSACTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transactionTypeCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** TENHANSHA_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaOrderNo;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _kohaiContractorNm;

    /** DESTINATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationCd;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm2;

    /** DESTINATION_NM_KANA: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNmKana;

    /** DESTINATION_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationAddress2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationTel;

    /** DESTINATION_FAX: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationFax;

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
    public BsEShippingPlanDto() {
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
        if (other == null || !(other instanceof BsEShippingPlanDto)) { return false; }
        final BsEShippingPlanDto otherEntity = (BsEShippingPlanDto)other;
        if (!helpComparingValue(getShippingPlanId(), otherEntity.getShippingPlanId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "e_shipping_plan");
        result = xCH(result, getShippingPlanId());
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
        sb.append(c).append(getShippingPlanId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getShippingPlanSlipNo());
        sb.append(c).append(getShippingPlanSlipRowNo());
        sb.append(c).append(getSlipTypeCd());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getSalesOrderTypeCd());
        sb.append(c).append(getShippingTypeCd());
        sb.append(c).append(getShippingReasonCd());
        sb.append(c).append(getHinmokuGroup());
        sb.append(c).append(getShippingNum());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getDirectDeliveryTypeCd());
        sb.append(c).append(getKoguchiDeliveryFlg());
        sb.append(c).append(getStorePlantCd());
        sb.append(c).append(getStoreStorageSpaceCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getTransactionTypeCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getTenhanshaOrderNo());
        sb.append(c).append(getKohaiContractorCd());
        sb.append(c).append(getKohaiContractorNm());
        sb.append(c).append(getDestinationCd());
        sb.append(c).append(getDestinationNm1());
        sb.append(c).append(getDestinationNm2());
        sb.append(c).append(getDestinationNmKana());
        sb.append(c).append(getDestinationZipCd());
        sb.append(c).append(getDestinationAddress1());
        sb.append(c).append(getDestinationAddress2());
        sb.append(c).append(getDestinationTel());
        sb.append(c).append(getDestinationFax());
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
     * [get] SHIPPING_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定受信ID
     * @return The value of the column 'SHIPPING_PLAN_ID'. (NullAllowed)
     */
    public Long getShippingPlanId() {
        return _shippingPlanId;
    }

    /**
     * [set] SHIPPING_PLAN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定受信ID
     * @param shippingPlanId The value of the column 'SHIPPING_PLAN_ID'. (NullAllowed)
     */
    public void setShippingPlanId(Long shippingPlanId) {
        __modifiedProperties.add("shippingPlanId");
        this._shippingPlanId = shippingPlanId;
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
     * [get] SHIPPING_PLAN_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷予定伝票番号
     * @return The value of the column 'SHIPPING_PLAN_SLIP_NO'. (NullAllowed)
     */
    public String getShippingPlanSlipNo() {
        return _shippingPlanSlipNo;
    }

    /**
     * [set] SHIPPING_PLAN_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷予定伝票番号
     * @param shippingPlanSlipNo The value of the column 'SHIPPING_PLAN_SLIP_NO'. (NullAllowed)
     */
    public void setShippingPlanSlipNo(String shippingPlanSlipNo) {
        __modifiedProperties.add("shippingPlanSlipNo");
        this._shippingPlanSlipNo = shippingPlanSlipNo;
    }

    /**
     * [get] SHIPPING_PLAN_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷予定明細番号
     * @return The value of the column 'SHIPPING_PLAN_SLIP_ROW_NO'. (NullAllowed)
     */
    public String getShippingPlanSlipRowNo() {
        return _shippingPlanSlipRowNo;
    }

    /**
     * [set] SHIPPING_PLAN_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷予定明細番号
     * @param shippingPlanSlipRowNo The value of the column 'SHIPPING_PLAN_SLIP_ROW_NO'. (NullAllowed)
     */
    public void setShippingPlanSlipRowNo(String shippingPlanSlipRowNo) {
        __modifiedProperties.add("shippingPlanSlipRowNo");
        this._shippingPlanSlipRowNo = shippingPlanSlipRowNo;
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
     * [get] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public String getHinmokuCd() {
        return _hinmokuCd;
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public void setHinmokuCd(String hinmokuCd) {
        __modifiedProperties.add("hinmokuCd");
        this._hinmokuCd = hinmokuCd;
    }

    /**
     * [get] SALES_ORDER_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_TYPE_CD'. (NullAllowed)
     */
    public String getSalesOrderTypeCd() {
        return _salesOrderTypeCd;
    }

    /**
     * [set] SALES_ORDER_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderTypeCd The value of the column 'SALES_ORDER_TYPE_CD'. (NullAllowed)
     */
    public void setSalesOrderTypeCd(String salesOrderTypeCd) {
        __modifiedProperties.add("salesOrderTypeCd");
        this._salesOrderTypeCd = salesOrderTypeCd;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public String getShippingTypeCd() {
        return _shippingTypeCd;
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        __modifiedProperties.add("shippingTypeCd");
        this._shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public String getShippingReasonCd() {
        return _shippingReasonCd;
    }

    /**
     * [set] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @param shippingReasonCd The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public void setShippingReasonCd(String shippingReasonCd) {
        __modifiedProperties.add("shippingReasonCd");
        this._shippingReasonCd = shippingReasonCd;
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
     * [get] SHIPPING_NUM: {VARCHAR(30)} <br>
     * 出荷数
     * @return The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public String getShippingNum() {
        return _shippingNum;
    }

    /**
     * [set] SHIPPING_NUM: {VARCHAR(30)} <br>
     * 出荷数
     * @param shippingNum The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public void setShippingNum(String shippingNum) {
        __modifiedProperties.add("shippingNum");
        this._shippingNum = shippingNum;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public String getHinmokuText() {
        return _hinmokuText;
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public void setHinmokuText(String hinmokuText) {
        __modifiedProperties.add("hinmokuText");
        this._hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
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
     * [get] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @return The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public String getDirectDeliveryTypeCd() {
        return _directDeliveryTypeCd;
    }

    /**
     * [set] DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * 直送区分
     * @param directDeliveryTypeCd The value of the column 'DIRECT_DELIVERY_TYPE_CD'. (NullAllowed)
     */
    public void setDirectDeliveryTypeCd(String directDeliveryTypeCd) {
        __modifiedProperties.add("directDeliveryTypeCd");
        this._directDeliveryTypeCd = directDeliveryTypeCd;
    }

    /**
     * [get] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public String getKoguchiDeliveryFlg() {
        return _koguchiDeliveryFlg;
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        __modifiedProperties.add("koguchiDeliveryFlg");
        this._koguchiDeliveryFlg = koguchiDeliveryFlg;
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
     * [get] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed)
     */
    public String getTransactionTypeCd() {
        return _transactionTypeCd;
    }

    /**
     * [set] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param transactionTypeCd The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed)
     */
    public void setTransactionTypeCd(String transactionTypeCd) {
        __modifiedProperties.add("transactionTypeCd");
        this._transactionTypeCd = transactionTypeCd;
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
     * [get] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed)
     */
    public String getTenhanshaOrderNo() {
        return _tenhanshaOrderNo;
    }

    /**
     * [set] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaOrderNo The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed)
     */
    public void setTenhanshaOrderNo(String tenhanshaOrderNo) {
        __modifiedProperties.add("tenhanshaOrderNo");
        this._tenhanshaOrderNo = tenhanshaOrderNo;
    }

    /**
     * [get] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @return The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public String getKohaiContractorCd() {
        return _kohaiContractorCd;
    }

    /**
     * [set] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸配契約先CD
     * @param kohaiContractorCd The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public void setKohaiContractorCd(String kohaiContractorCd) {
        __modifiedProperties.add("kohaiContractorCd");
        this._kohaiContractorCd = kohaiContractorCd;
    }

    /**
     * [get] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @return The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public String getKohaiContractorNm() {
        return _kohaiContractorNm;
    }

    /**
     * [set] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @param kohaiContractorNm The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public void setKohaiContractorNm(String kohaiContractorNm) {
        __modifiedProperties.add("kohaiContractorNm");
        this._kohaiContractorNm = kohaiContractorNm;
    }

    /**
     * [get] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public String getDestinationCd() {
        return _destinationCd;
    }

    /**
     * [set] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public void setDestinationCd(String destinationCd) {
        __modifiedProperties.add("destinationCd");
        this._destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public String getDestinationNm1() {
        return _destinationNm1;
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public void setDestinationNm1(String destinationNm1) {
        __modifiedProperties.add("destinationNm1");
        this._destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public String getDestinationNm2() {
        return _destinationNm2;
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public void setDestinationNm2(String destinationNm2) {
        __modifiedProperties.add("destinationNm2");
        this._destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @return The value of the column 'DESTINATION_NM_KANA'. (NullAllowed)
     */
    public String getDestinationNmKana() {
        return _destinationNmKana;
    }

    /**
     * [set] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @param destinationNmKana The value of the column 'DESTINATION_NM_KANA'. (NullAllowed)
     */
    public void setDestinationNmKana(String destinationNmKana) {
        __modifiedProperties.add("destinationNmKana");
        this._destinationNmKana = destinationNmKana;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public String getDestinationZipCd() {
        return _destinationZipCd;
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        __modifiedProperties.add("destinationZipCd");
        this._destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所1
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public String getDestinationAddress1() {
        return _destinationAddress1;
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所1
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        __modifiedProperties.add("destinationAddress1");
        this._destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所2
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public String getDestinationAddress2() {
        return _destinationAddress2;
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所2
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        __modifiedProperties.add("destinationAddress2");
        this._destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public String getDestinationTel() {
        return _destinationTel;
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public void setDestinationTel(String destinationTel) {
        __modifiedProperties.add("destinationTel");
        this._destinationTel = destinationTel;
    }

    /**
     * [get] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @return The value of the column 'DESTINATION_FAX'. (NullAllowed)
     */
    public String getDestinationFax() {
        return _destinationFax;
    }

    /**
     * [set] DESTINATION_FAX: {VARCHAR(30)} <br>
     * 送り先ＦＡＸ番号
     * @param destinationFax The value of the column 'DESTINATION_FAX'. (NullAllowed)
     */
    public void setDestinationFax(String destinationFax) {
        __modifiedProperties.add("destinationFax");
        this._destinationFax = destinationFax;
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
