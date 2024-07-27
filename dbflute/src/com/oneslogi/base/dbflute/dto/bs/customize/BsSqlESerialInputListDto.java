package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlESerialInputList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, SERIAL_INPUT_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CENTER_CD, PROCESS_TYPE, PROCESS_TYPE_NM, PRODUCT_CD, PRODUCT_ID, PRODUCT_NM, SERIAL_NO, SUPPLIER_CD, SUPPLIER_NM, SUPPLIER_ID, SUPPLIER_NM2, RECEIVE_SLIP_NO, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_NM2, PICKING_WORK_NO, WORK_DT, MESSAGE_NM, VERSION_NO, CONTROL_NO
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
public abstract class BsSqlESerialInputListDto implements Serializable {

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
    /** RECEIVE_CD: {VARCHAR(30), refers to e_serial_input.RECEIVE_CD} */
    @JsonKey
    protected String _receiveCd;

    /** SERIAL_INPUT_ID: {BIGINT(20), refers to e_serial_input.SERIAL_INPUT_ID} */
    @JsonKey
    protected Long _serialInputId;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_serial_input.RECEIVE_ROW_ID} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_serial_input.IMPORT_FLG} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_serial_input.ERROR_FLG} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_serial_input.ERROR_MESSAGE_CD} */
    @JsonKey
    protected String _errorMessageCd;

    /** CLIENT_CD: {VARCHAR(255), refers to e_serial_input.CLIENT_CD} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_CD: {VARCHAR(255), refers to e_serial_input.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** PROCESS_TYPE: {VARCHAR(255), refers to e_serial_input.PROCESS_TYPE} */
    @JsonKey
    protected String _processType;

    /** PROCESS_TYPE_NM: {VARCHAR(100), refers to v_dict.DICT_NM} */
    @JsonKey
    protected String _processTypeNm;

    /** PRODUCT_CD: {VARCHAR(255), refers to e_serial_input.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    @JsonKey
    protected String _productNm;

    /** SERIAL_NO: {VARCHAR(255), refers to e_serial_input.SERIAL_NO} */
    @JsonKey
    protected String _serialNo;

    /** SUPPLIER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLIER_CD} */
    @JsonKey
    protected String _supplierCd;

    /** SUPPLIER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLIER_NM} */
    @JsonKey
    protected String _supplierNm;

    /** SUPPLIER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} */
    @JsonKey
    protected Long _supplierId;

    /** SUPPLIER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    @JsonKey
    protected String _supplierNm2;

    /** RECEIVE_SLIP_NO: {VARCHAR(255), refers to e_serial_input.RECEIVE_SLIP_NO} */
    @JsonKey
    protected String _receiveSlipNo;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_CD} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_NM} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SUPPLY_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    @JsonKey
    protected String _supplyCustomerNm2;

    /** PICKING_WORK_NO: {VARCHAR(255), refers to e_serial_input.PICKING_WORK_NO} */
    @JsonKey
    protected String _pickingWorkNo;

    /** WORK_DT: {VARCHAR(255), refers to e_serial_input.WORK_DT} */
    @JsonKey
    protected String _workDt;

    /** MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} */
    @JsonKey
    protected String _messageNm;

    /** VERSION_NO: {BIGINT(20), refers to e_serial_input.VERSION_NO} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {BIGINT(20), refers to e_serial_input.CONTROL_NO} */
    @JsonKey
    protected Long _controlNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlESerialInputListDto() {
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
        if (other == null || !(other instanceof BsSqlESerialInputListDto)) { return false; }
        final BsSqlESerialInputListDto otherEntity = (BsSqlESerialInputListDto)other;
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getSerialInputId(), otherEntity.getSerialInputId())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getProcessType(), otherEntity.getProcessType())) { return false; }
        if (!helpComparingValue(getProcessTypeNm(), otherEntity.getProcessTypeNm())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getSerialNo(), otherEntity.getSerialNo())) { return false; }
        if (!helpComparingValue(getSupplierCd(), otherEntity.getSupplierCd())) { return false; }
        if (!helpComparingValue(getSupplierNm(), otherEntity.getSupplierNm())) { return false; }
        if (!helpComparingValue(getSupplierId(), otherEntity.getSupplierId())) { return false; }
        if (!helpComparingValue(getSupplierNm2(), otherEntity.getSupplierNm2())) { return false; }
        if (!helpComparingValue(getReceiveSlipNo(), otherEntity.getReceiveSlipNo())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerId(), otherEntity.getSupplyCustomerId())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm2(), otherEntity.getSupplyCustomerNm2())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlESerialInputList");
        result = xCH(result, getReceiveCd());
        result = xCH(result, getSerialInputId());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getCenterCd());
        result = xCH(result, getProcessType());
        result = xCH(result, getProcessTypeNm());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductId());
        result = xCH(result, getProductNm());
        result = xCH(result, getSerialNo());
        result = xCH(result, getSupplierCd());
        result = xCH(result, getSupplierNm());
        result = xCH(result, getSupplierId());
        result = xCH(result, getSupplierNm2());
        result = xCH(result, getReceiveSlipNo());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getSupplyCustomerId());
        result = xCH(result, getSupplyCustomerNm2());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getWorkDt());
        result = xCH(result, getMessageNm());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
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
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getSerialInputId());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getProcessType());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSerialNo());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getSupplierNm());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getSupplierNm2());
        sb.append(c).append(getReceiveSlipNo());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getSupplyCustomerId());
        sb.append(c).append(getSupplyCustomerNm2());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_serial_input.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_serial_input.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] SERIAL_INPUT_ID: {BIGINT(20), refers to e_serial_input.SERIAL_INPUT_ID} <br>
     * シリアルNo.受信テーブルID
     * @return The value of the column 'SERIAL_INPUT_ID'. (NullAllowed)
     */
    public Long getSerialInputId() {
        return _serialInputId;
    }

    /**
     * [set] SERIAL_INPUT_ID: {BIGINT(20), refers to e_serial_input.SERIAL_INPUT_ID} <br>
     * シリアルNo.受信テーブルID
     * @param serialInputId The value of the column 'SERIAL_INPUT_ID'. (NullAllowed)
     */
    public void setSerialInputId(Long serialInputId) {
        __modifiedProperties.add("serialInputId");
        this._serialInputId = serialInputId;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_serial_input.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_serial_input.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_serial_input.IMPORT_FLG} <br>
     * 取込フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_serial_input.IMPORT_FLG} <br>
     * 取込フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_serial_input.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_serial_input.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_serial_input.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_serial_input.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(255), refers to e_serial_input.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(255), refers to e_serial_input.CLIENT_CD} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(255), refers to e_serial_input.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(255), refers to e_serial_input.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] PROCESS_TYPE: {VARCHAR(255), refers to e_serial_input.PROCESS_TYPE} <br>
     * 処理区分
     * @return The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public String getProcessType() {
        return _processType;
    }

    /**
     * [set] PROCESS_TYPE: {VARCHAR(255), refers to e_serial_input.PROCESS_TYPE} <br>
     * 処理区分
     * @param processType The value of the column 'PROCESS_TYPE'. (NullAllowed)
     */
    public void setProcessType(String processType) {
        __modifiedProperties.add("processType");
        this._processType = processType;
    }

    /**
     * [get] PROCESS_TYPE_NM: {VARCHAR(100), refers to v_dict.DICT_NM} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public String getProcessTypeNm() {
        return _processTypeNm;
    }

    /**
     * [set] PROCESS_TYPE_NM: {VARCHAR(100), refers to v_dict.DICT_NM} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public void setProcessTypeNm(String processTypeNm) {
        __modifiedProperties.add("processTypeNm");
        this._processTypeNm = processTypeNm;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(255), refers to e_serial_input.PRODUCT_CD} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(255), refers to e_serial_input.PRODUCT_CD} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] SERIAL_NO: {VARCHAR(255), refers to e_serial_input.SERIAL_NO} <br>
     * シリアルNo.
     * @return The value of the column 'SERIAL_NO'. (NullAllowed)
     */
    public String getSerialNo() {
        return _serialNo;
    }

    /**
     * [set] SERIAL_NO: {VARCHAR(255), refers to e_serial_input.SERIAL_NO} <br>
     * シリアルNo.
     * @param serialNo The value of the column 'SERIAL_NO'. (NullAllowed)
     */
    public void setSerialNo(String serialNo) {
        __modifiedProperties.add("serialNo");
        this._serialNo = serialNo;
    }

    /**
     * [get] SUPPLIER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLIER_CD} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLIER_CD} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] SUPPLIER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLIER_NM} <br>
     * 仕入先名称
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public String getSupplierNm() {
        return _supplierNm;
    }

    /**
     * [set] SUPPLIER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLIER_NM} <br>
     * 仕入先名称
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public void setSupplierNm(String supplierNm) {
        __modifiedProperties.add("supplierNm");
        this._supplierNm = supplierNm;
    }

    /**
     * [get] SUPPLIER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public void setSupplierId(Long supplierId) {
        __modifiedProperties.add("supplierId");
        this._supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'SUPPLIER_NM2'. (NullAllowed)
     */
    public String getSupplierNm2() {
        return _supplierNm2;
    }

    /**
     * [set] SUPPLIER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param supplierNm2 The value of the column 'SUPPLIER_NM2'. (NullAllowed)
     */
    public void setSupplierNm2(String supplierNm2) {
        __modifiedProperties.add("supplierNm2");
        this._supplierNm2 = supplierNm2;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {VARCHAR(255), refers to e_serial_input.RECEIVE_SLIP_NO} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public String getReceiveSlipNo() {
        return _receiveSlipNo;
    }

    /**
     * [set] RECEIVE_SLIP_NO: {VARCHAR(255), refers to e_serial_input.RECEIVE_SLIP_NO} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        __modifiedProperties.add("receiveSlipNo");
        this._receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_CD} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_CD} <br>
     * 納品先CD
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_NM} <br>
     * 納品先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(255), refers to e_serial_input.SUPPLY_CUSTOMER_NM} <br>
     * 納品先名称
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        __modifiedProperties.add("supplyCustomerId");
        this._supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getSupplyCustomerNm2() {
        return _supplyCustomerNm2;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM2: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param supplyCustomerNm2 The value of the column 'SUPPLY_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setSupplyCustomerNm2(String supplyCustomerNm2) {
        __modifiedProperties.add("supplyCustomerNm2");
        this._supplyCustomerNm2 = supplyCustomerNm2;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(255), refers to e_serial_input.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(255), refers to e_serial_input.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] WORK_DT: {VARCHAR(255), refers to e_serial_input.WORK_DT} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(255), refers to e_serial_input.WORK_DT} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] VERSION_NO: {BIGINT(20), refers to e_serial_input.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {BIGINT(20), refers to e_serial_input.VERSION_NO} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {BIGINT(20), refers to e_serial_input.CONTROL_NO} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {BIGINT(20), refers to e_serial_input.CONTROL_NO} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

}