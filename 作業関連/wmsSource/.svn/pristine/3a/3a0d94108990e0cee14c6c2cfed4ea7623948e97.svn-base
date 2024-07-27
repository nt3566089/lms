package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_plan_h as TABLE. <br>
 * 出荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_PLAN_H_ID
 *
 * [column]
 *     SHIPPING_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, SLIP_TYPE_CD, SALES_ORDER_SLIP_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, SALES_ORG_CD, KOGUCHI_DELIVERY_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_REASON_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TENHANSHA_CD, TENHANSHA_ORDER_NO, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_FAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     t_shipping_plan_b
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     tShippingPlanBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingPlanHDto implements Serializable {

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
    /** SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingPlanHId;

    /** CLIENT_ID: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _processTypeId;

    /** INPUT_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _inputType;

    /** SHIPPING_DT: {IX, NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** WORK_DT: {IX, VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIV_PLAN_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivPlanDt;

    /** DELIV_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    @JsonKey
    protected String _delivTz;

    /** CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** SHIPPING_SLIP_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _shippingStatus;

    /** SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _delivCustomerCd;

    /** DELIV_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_ADDRESS1: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress1;

    /** DELIV_ADDRESS2: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress2;

    /** DELIV_ADDRESS3: {VARCHAR(255)} */
    @JsonKey
    protected String _delivAddress3;

    /** DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} */
    @JsonKey
    protected String _delivAddressSupply;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** DELIVERY_COURSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** EMERGENCY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** PICKING_WORK_MESSAGE: {VARCHAR(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

    /** ERROR_FLG: {CHAR(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** PICKING_BATCH_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _pickingBatchNo;

    /** STOCK_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _stockOutFlg;

    /** ALLOC_INST_H_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _allocInstHId;

    /** COD: {BIGINT(19)} */
    @JsonKey
    protected Long _cod;

    /** COD_TAX: {BIGINT(19)} */
    @JsonKey
    protected Long _codTax;

    /** TOTAL_PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalTax;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipTypeCd;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipTypeCd;

    /** DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _directDeliveryTypeCd;

    /** SHIPPING_TYPE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingTypeId;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingTypeCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** KOGUCHI_DELIVERY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _koguchiDeliveryFlg;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _kohaiContractorNm;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingReasonCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** TENHANSHA_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaOrderNo;

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

    /** DESTINATION_FAX: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationFax;

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
    public BsTShippingPlanHDto() {
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
    protected List<TShippingPlanBDto> _tShippingPlanBList;

    public List<TShippingPlanBDto> getTShippingPlanBList() {
        if (_tShippingPlanBList == null) { _tShippingPlanBList = new ArrayList<TShippingPlanBDto>(); }
        return _tShippingPlanBList;
    }

    public void setTShippingPlanBList(List<TShippingPlanBDto> tShippingPlanBList) {
        this._tShippingPlanBList = tShippingPlanBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingPlanHDto)) { return false; }
        final BsTShippingPlanHDto otherEntity = (BsTShippingPlanHDto)other;
        if (!helpComparingValue(getShippingPlanHId(), otherEntity.getShippingPlanHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_plan_h");
        result = xCH(result, getShippingPlanHId());
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
        sb.append(c).append(getShippingPlanHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getInputType());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivPlanDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getShippingStatus());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDelivCustomerId());
        sb.append(c).append(getDelivCustomerCd());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivAddress1());
        sb.append(c).append(getDelivAddress2());
        sb.append(c).append(getDelivAddress3());
        sb.append(c).append(getDelivAddressSupply());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getPickingWorkMessage());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getPickingBatchNo());
        sb.append(c).append(getStockOutFlg());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getCod());
        sb.append(c).append(getCodTax());
        sb.append(c).append(getTotalPrice());
        sb.append(c).append(getTotalTax());
        sb.append(c).append(getSlipTypeCd());
        sb.append(c).append(getSalesOrderSlipTypeCd());
        sb.append(c).append(getDirectDeliveryTypeCd());
        sb.append(c).append(getShippingTypeId());
        sb.append(c).append(getShippingTypeCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getKoguchiDeliveryFlg());
        sb.append(c).append(getKohaiContractorCd());
        sb.append(c).append(getKohaiContractorNm());
        sb.append(c).append(getShippingReasonCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getTenhanshaOrderNo());
        sb.append(c).append(getDestinationCd());
        sb.append(c).append(getDestinationNm1());
        sb.append(c).append(getDestinationNm2());
        sb.append(c).append(getDestinationNmKana());
        sb.append(c).append(getDestinationFax());
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
     * [get] SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定ヘッダID
     * @return The value of the column 'SHIPPING_PLAN_H_ID'. (NullAllowed)
     */
    public Long getShippingPlanHId() {
        return _shippingPlanHId;
    }

    /**
     * [set] SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定ヘッダID
     * @param shippingPlanHId The value of the column 'SHIPPING_PLAN_H_ID'. (NullAllowed)
     */
    public void setShippingPlanHId(Long shippingPlanHId) {
        __modifiedProperties.add("shippingPlanHId");
        this._shippingPlanHId = shippingPlanHId;
    }

    /**
     * [get] CLIENT_ID: {NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {NotNull, BIGINT(19)} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {NotNull, BIGINT(19)} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {NotNull, BIGINT(19)} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30)} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30)} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {IX, VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @return The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public String getDelivPlanDt() {
        return _delivPlanDt;
    }

    /**
     * [set] DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * 納品予定日
     * @param delivPlanDt The value of the column 'DELIV_PLAN_DT'. (NullAllowed)
     */
    public void setDelivPlanDt(String delivPlanDt) {
        __modifiedProperties.add("delivPlanDt");
        this._delivPlanDt = delivPlanDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30)} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30)} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * 顧客出荷指示No.
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
     * WMS出荷伝票No.
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)} <br>
     * 出荷ステータス
     * @return The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public String getShippingStatus() {
        return _shippingStatus;
    }

    /**
     * [set] SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)} <br>
     * 出荷ステータス
     * @param shippingStatus The value of the column 'SHIPPING_STATUS'. (NullAllowed)
     */
    public void setShippingStatus(String shippingStatus) {
        __modifiedProperties.add("shippingStatus");
        this._shippingStatus = shippingStatus;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)} <br>
     * 納品先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19)} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDelivCustomerId() {
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19)} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        __modifiedProperties.add("delivCustomerId");
        this._delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * 届先CD
     * @param delivCustomerCd The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public void setDelivCustomerCd(String delivCustomerCd) {
        __modifiedProperties.add("delivCustomerCd");
        this._delivCustomerCd = delivCustomerCd;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * 届先郵便番号
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * 届先郵便番号
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @return The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public String getDelivAddress1() {
        return _delivAddress1;
    }

    /**
     * [set] DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * 届先住所1
     * @param delivAddress1 The value of the column 'DELIV_ADDRESS1'. (NullAllowed)
     */
    public void setDelivAddress1(String delivAddress1) {
        __modifiedProperties.add("delivAddress1");
        this._delivAddress1 = delivAddress1;
    }

    /**
     * [get] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @return The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public String getDelivAddress2() {
        return _delivAddress2;
    }

    /**
     * [set] DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * 届先住所2
     * @param delivAddress2 The value of the column 'DELIV_ADDRESS2'. (NullAllowed)
     */
    public void setDelivAddress2(String delivAddress2) {
        __modifiedProperties.add("delivAddress2");
        this._delivAddress2 = delivAddress2;
    }

    /**
     * [get] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @return The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public String getDelivAddress3() {
        return _delivAddress3;
    }

    /**
     * [set] DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * 届先住所3
     * @param delivAddress3 The value of the column 'DELIV_ADDRESS3'. (NullAllowed)
     */
    public void setDelivAddress3(String delivAddress3) {
        __modifiedProperties.add("delivAddress3");
        this._delivAddress3 = delivAddress3;
    }

    /**
     * [get] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @return The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public String getDelivAddressSupply() {
        return _delivAddressSupply;
    }

    /**
     * [set] DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * 届先住所補足
     * @param delivAddressSupply The value of the column 'DELIV_ADDRESS_SUPPLY'. (NullAllowed)
     */
    public void setDelivAddressSupply(String delivAddressSupply) {
        __modifiedProperties.add("delivAddressSupply");
        this._delivAddressSupply = delivAddressSupply;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * 届先電話番号
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {IX, BIGINT(19)} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, BIGINT(19)} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] EMERGENCY_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * 出庫作業メッセージ
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1)} <br>
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
     * [get] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @return The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public String getPickingBatchNo() {
        return _pickingBatchNo;
    }

    /**
     * [set] PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * 出庫指示バッチNo.
     * @param pickingBatchNo The value of the column 'PICKING_BATCH_NO'. (NullAllowed)
     */
    public void setPickingBatchNo(String pickingBatchNo) {
        __modifiedProperties.add("pickingBatchNo");
        this._pickingBatchNo = pickingBatchNo;
    }

    /**
     * [get] STOCK_OUT_FLG: {CHAR(1)} <br>
     * 欠品フラグ
     * @return The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public String getStockOutFlg() {
        return _stockOutFlg;
    }

    /**
     * [set] STOCK_OUT_FLG: {CHAR(1)} <br>
     * 欠品フラグ
     * @param stockOutFlg The value of the column 'STOCK_OUT_FLG'. (NullAllowed)
     */
    public void setStockOutFlg(String stockOutFlg) {
        __modifiedProperties.add("stockOutFlg");
        this._stockOutFlg = stockOutFlg;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, BIGINT(19)} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, BIGINT(19)} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @return The value of the column 'COD'. (NullAllowed)
     */
    public Long getCod() {
        return _cod;
    }

    /**
     * [set] COD: {BIGINT(19)} <br>
     * 代引請求額
     * @param cod The value of the column 'COD'. (NullAllowed)
     */
    public void setCod(Long cod) {
        __modifiedProperties.add("cod");
        this._cod = cod;
    }

    /**
     * [get] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @return The value of the column 'COD_TAX'. (NullAllowed)
     */
    public Long getCodTax() {
        return _codTax;
    }

    /**
     * [set] COD_TAX: {BIGINT(19)} <br>
     * 代引消費税
     * @param codTax The value of the column 'COD_TAX'. (NullAllowed)
     */
    public void setCodTax(Long codTax) {
        __modifiedProperties.add("codTax");
        this._codTax = codTax;
    }

    /**
     * [get] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalPrice() {
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * 合計金額
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        __modifiedProperties.add("totalPrice");
        this._totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalTax() {
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * 合計消費税
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        __modifiedProperties.add("totalTax");
        this._totalTax = totalTax;
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
     * [get] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSalesOrderSlipTypeCd() {
        return _salesOrderSlipTypeCd;
    }

    /**
     * [set] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderSlipTypeCd The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSalesOrderSlipTypeCd(String salesOrderSlipTypeCd) {
        __modifiedProperties.add("salesOrderSlipTypeCd");
        this._salesOrderSlipTypeCd = salesOrderSlipTypeCd;
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
     * [get] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @return The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed)
     */
    public Long getShippingTypeId() {
        return _shippingTypeId;
    }

    /**
     * [set] SHIPPING_TYPE_ID: {BIGINT(19)} <br>
     * 出荷区分ID
     * @param shippingTypeId The value of the column 'SHIPPING_TYPE_ID'. (NullAllowed)
     */
    public void setShippingTypeId(Long shippingTypeId) {
        __modifiedProperties.add("shippingTypeId");
        this._shippingTypeId = shippingTypeId;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public String getShippingTypeCd() {
        return _shippingTypeCd;
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * 出荷区分CD
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        __modifiedProperties.add("shippingTypeCd");
        this._shippingTypeCd = shippingTypeCd;
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
     * [get] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public String getKoguchiDeliveryFlg() {
        return _koguchiDeliveryFlg;
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        __modifiedProperties.add("koguchiDeliveryFlg");
        this._koguchiDeliveryFlg = koguchiDeliveryFlg;
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
