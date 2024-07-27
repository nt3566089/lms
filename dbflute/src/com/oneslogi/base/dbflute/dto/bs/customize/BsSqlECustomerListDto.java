package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlECustomerList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CUSTOMER_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CLIENT_CD, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, ALLOC_ORDER, SHIPPING_STOP_FLG, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, CENTER_CD, DELIVERY_COURSE_CD, DELIVERY_ORDER, DELIVERY_READTIME, MESSAGE_NM, CLIENT_ID, CLIENT_NM, MZ_ZIP_ID, ZIP_ADDRESS1, ZIP_ADDRESS2, ZIP_ADDRESS3, CENTER_ID, CENTER_NM, DELIVERY_COURSE_NM, DELIVERY_COURSE_ID, MDC_VERSION_NO, MCU_CUSTOMER_ID, MCU_VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlECustomerListDto implements Serializable {

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
    /** CUSTOMER_ID: {BIGINT(20), refers to e_customer.CUSTOMER_ID} */
    @JsonKey
    protected Long _customerId;

    /** RECEIVE_CD: {VARCHAR(30), refers to e_customer.RECEIVE_CD} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_customer.RECEIVE_ROW_ID} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_customer.IMPORT_FLG} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_customer.ERROR_FLG} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_customer.ERROR_MESSAGE_CD} */
    @JsonKey
    protected String _errorMessageCd;

    /** CLIENT_CD: {VARCHAR(255), refers to e_customer.CLIENT_CD} */
    @JsonKey
    protected String _clientCd;

    /** CUSTOMER_CD: {VARCHAR(255), refers to e_customer.CUSTOMER_CD} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(255), refers to e_customer.CUSTOMER_NM} */
    @JsonKey
    protected String _customerNm;

    /** CUSTOMER_ABBR: {VARCHAR(255), refers to e_customer.CUSTOMER_ABBR} */
    @JsonKey
    protected String _customerAbbr;

    /** VENDOR_FLG: {VARCHAR(255), refers to e_customer.VENDOR_FLG} */
    @JsonKey
    protected String _vendorFlg;

    /** DELIVERY_FLG: {VARCHAR(255), refers to e_customer.DELIVERY_FLG} */
    @JsonKey
    protected String _deliveryFlg;

    /** ONETIME_FLG: {VARCHAR(255), refers to e_customer.ONETIME_FLG} */
    @JsonKey
    protected String _onetimeFlg;

    /** DEPOSIT_FLG: {VARCHAR(255), refers to e_customer.DEPOSIT_FLG} */
    @JsonKey
    protected String _depositFlg;

    /** ZIP_CD: {VARCHAR(255), refers to e_customer.ZIP_CD} */
    @JsonKey
    protected String _zipCd;

    /** ADDRESS1: {VARCHAR(255), refers to e_customer.ADDRESS1} */
    @JsonKey
    protected String _address1;

    /** ADDRESS2: {VARCHAR(255), refers to e_customer.ADDRESS2} */
    @JsonKey
    protected String _address2;

    /** ADDRESS3: {VARCHAR(255), refers to e_customer.ADDRESS3} */
    @JsonKey
    protected String _address3;

    /** TEL_NO: {VARCHAR(255), refers to e_customer.TEL_NO} */
    @JsonKey
    protected String _telNo;

    /** ALLOC_ORDER: {VARCHAR(255), refers to e_customer.ALLOC_ORDER} */
    @JsonKey
    protected String _allocOrder;

    /** SHIPPING_STOP_FLG: {VARCHAR(255), refers to e_customer.SHIPPING_STOP_FLG} */
    @JsonKey
    protected String _shippingStopFlg;

    /** LOT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LOT_REVERSE_FLG} */
    @JsonKey
    protected String _lotReverseFlg;

    /** LIMIT_DT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LIMIT_DT_REVERSE_FLG} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** CENTER_CD: {VARCHAR(255), refers to e_customer.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** DELIVERY_COURSE_CD: {VARCHAR(255), refers to e_customer.DELIVERY_COURSE_CD} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_ORDER: {VARCHAR(255), refers to e_customer.DELIVERY_ORDER} */
    @JsonKey
    protected String _deliveryOrder;

    /** DELIVERY_READTIME: {VARCHAR(255), refers to e_customer.DELIVERY_READTIME} */
    @JsonKey
    protected String _deliveryReadtime;

    /** MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} */
    @JsonKey
    protected String _messageNm;

    /** CLIENT_ID: {BIGINT(20), refers to m_client.CLIENT_ID} */
    @JsonKey
    protected Long _clientId;

    /** CLIENT_NM: {VARCHAR(60), refers to m_client.CLIENT_NM} */
    @JsonKey
    protected String _clientNm;

    /** MZ_ZIP_ID: {BIGINT(20), refers to m_zip.ZIP_ID} */
    @JsonKey
    protected Long _mzZipId;

    /** ZIP_ADDRESS1: {VARCHAR(255), refers to m_zip.ADDRESS1} */
    @JsonKey
    protected String _zipAddress1;

    /** ZIP_ADDRESS2: {VARCHAR(255), refers to m_zip.ADDRESS2} */
    @JsonKey
    protected String _zipAddress2;

    /** ZIP_ADDRESS3: {VARCHAR(255), refers to m_zip.ADDRESS3} */
    @JsonKey
    protected String _zipAddress3;

    /** CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_NM: {VARCHAR(60), refers to m_center.CENTER_NM} */
    @JsonKey
    protected String _centerNm;

    /** DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** DELIVERY_COURSE_ID: {BIGINT(20), refers to m_delivery_course.DELIVERY_COURSE_ID} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** MDC_VERSION_NO: {BIGINT(20), refers to m_delivery_course.VERSION_NO} */
    @JsonKey
    protected Long _mdcVersionNo;

    /** MCU_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} */
    @JsonKey
    protected Long _mcuCustomerId;

    /** MCU_VERSION_NO: {BIGINT(20), refers to m_customer.VERSION_NO} */
    @JsonKey
    protected Long _mcuVersionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlECustomerListDto() {
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
        if (other == null || !(other instanceof BsSqlECustomerListDto)) { return false; }
        final BsSqlECustomerListDto otherEntity = (BsSqlECustomerListDto)other;
        if (!helpComparingValue(getCustomerId(), otherEntity.getCustomerId())) { return false; }
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getCustomerCd(), otherEntity.getCustomerCd())) { return false; }
        if (!helpComparingValue(getCustomerNm(), otherEntity.getCustomerNm())) { return false; }
        if (!helpComparingValue(getCustomerAbbr(), otherEntity.getCustomerAbbr())) { return false; }
        if (!helpComparingValue(getVendorFlg(), otherEntity.getVendorFlg())) { return false; }
        if (!helpComparingValue(getDeliveryFlg(), otherEntity.getDeliveryFlg())) { return false; }
        if (!helpComparingValue(getOnetimeFlg(), otherEntity.getOnetimeFlg())) { return false; }
        if (!helpComparingValue(getDepositFlg(), otherEntity.getDepositFlg())) { return false; }
        if (!helpComparingValue(getZipCd(), otherEntity.getZipCd())) { return false; }
        if (!helpComparingValue(getAddress1(), otherEntity.getAddress1())) { return false; }
        if (!helpComparingValue(getAddress2(), otherEntity.getAddress2())) { return false; }
        if (!helpComparingValue(getAddress3(), otherEntity.getAddress3())) { return false; }
        if (!helpComparingValue(getTelNo(), otherEntity.getTelNo())) { return false; }
        if (!helpComparingValue(getAllocOrder(), otherEntity.getAllocOrder())) { return false; }
        if (!helpComparingValue(getShippingStopFlg(), otherEntity.getShippingStopFlg())) { return false; }
        if (!helpComparingValue(getLotReverseFlg(), otherEntity.getLotReverseFlg())) { return false; }
        if (!helpComparingValue(getLimitDtReverseFlg(), otherEntity.getLimitDtReverseFlg())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryOrder(), otherEntity.getDeliveryOrder())) { return false; }
        if (!helpComparingValue(getDeliveryReadtime(), otherEntity.getDeliveryReadtime())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getClientId(), otherEntity.getClientId())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getMzZipId(), otherEntity.getMzZipId())) { return false; }
        if (!helpComparingValue(getZipAddress1(), otherEntity.getZipAddress1())) { return false; }
        if (!helpComparingValue(getZipAddress2(), otherEntity.getZipAddress2())) { return false; }
        if (!helpComparingValue(getZipAddress3(), otherEntity.getZipAddress3())) { return false; }
        if (!helpComparingValue(getCenterId(), otherEntity.getCenterId())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getDeliveryCourseId(), otherEntity.getDeliveryCourseId())) { return false; }
        if (!helpComparingValue(getMdcVersionNo(), otherEntity.getMdcVersionNo())) { return false; }
        if (!helpComparingValue(getMcuCustomerId(), otherEntity.getMcuCustomerId())) { return false; }
        if (!helpComparingValue(getMcuVersionNo(), otherEntity.getMcuVersionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlECustomerList");
        result = xCH(result, getCustomerId());
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getClientCd());
        result = xCH(result, getCustomerCd());
        result = xCH(result, getCustomerNm());
        result = xCH(result, getCustomerAbbr());
        result = xCH(result, getVendorFlg());
        result = xCH(result, getDeliveryFlg());
        result = xCH(result, getOnetimeFlg());
        result = xCH(result, getDepositFlg());
        result = xCH(result, getZipCd());
        result = xCH(result, getAddress1());
        result = xCH(result, getAddress2());
        result = xCH(result, getAddress3());
        result = xCH(result, getTelNo());
        result = xCH(result, getAllocOrder());
        result = xCH(result, getShippingStopFlg());
        result = xCH(result, getLotReverseFlg());
        result = xCH(result, getLimitDtReverseFlg());
        result = xCH(result, getCenterCd());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryOrder());
        result = xCH(result, getDeliveryReadtime());
        result = xCH(result, getMessageNm());
        result = xCH(result, getClientId());
        result = xCH(result, getClientNm());
        result = xCH(result, getMzZipId());
        result = xCH(result, getZipAddress1());
        result = xCH(result, getZipAddress2());
        result = xCH(result, getZipAddress3());
        result = xCH(result, getCenterId());
        result = xCH(result, getCenterNm());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getDeliveryCourseId());
        result = xCH(result, getMdcVersionNo());
        result = xCH(result, getMcuCustomerId());
        result = xCH(result, getMcuVersionNo());
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
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getCustomerAbbr());
        sb.append(c).append(getVendorFlg());
        sb.append(c).append(getDeliveryFlg());
        sb.append(c).append(getOnetimeFlg());
        sb.append(c).append(getDepositFlg());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getAddress1());
        sb.append(c).append(getAddress2());
        sb.append(c).append(getAddress3());
        sb.append(c).append(getTelNo());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getShippingStopFlg());
        sb.append(c).append(getLotReverseFlg());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryOrder());
        sb.append(c).append(getDeliveryReadtime());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getClientId());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getMzZipId());
        sb.append(c).append(getZipAddress1());
        sb.append(c).append(getZipAddress2());
        sb.append(c).append(getZipAddress3());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getMdcVersionNo());
        sb.append(c).append(getMcuCustomerId());
        sb.append(c).append(getMcuVersionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CUSTOMER_ID: {BIGINT(20), refers to e_customer.CUSTOMER_ID} <br>
     * 取引先マスタ受信ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {BIGINT(20), refers to e_customer.CUSTOMER_ID} <br>
     * 取引先マスタ受信ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_customer.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_customer.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_customer.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_customer.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_customer.IMPORT_FLG} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_customer.IMPORT_FLG} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_customer.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_customer.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_customer.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_customer.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(255), refers to e_customer.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(255), refers to e_customer.CLIENT_CD} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(255), refers to e_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(255), refers to e_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(255), refers to e_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(255), refers to e_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] CUSTOMER_ABBR: {VARCHAR(255), refers to e_customer.CUSTOMER_ABBR} <br>
     * 取引先略称
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public String getCustomerAbbr() {
        return _customerAbbr;
    }

    /**
     * [set] CUSTOMER_ABBR: {VARCHAR(255), refers to e_customer.CUSTOMER_ABBR} <br>
     * 取引先略称
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed)
     */
    public void setCustomerAbbr(String customerAbbr) {
        __modifiedProperties.add("customerAbbr");
        this._customerAbbr = customerAbbr;
    }

    /**
     * [get] VENDOR_FLG: {VARCHAR(255), refers to e_customer.VENDOR_FLG} <br>
     * 仕入先フラグ
     * @return The value of the column 'VENDOR_FLG'. (NullAllowed)
     */
    public String getVendorFlg() {
        return _vendorFlg;
    }

    /**
     * [set] VENDOR_FLG: {VARCHAR(255), refers to e_customer.VENDOR_FLG} <br>
     * 仕入先フラグ
     * @param vendorFlg The value of the column 'VENDOR_FLG'. (NullAllowed)
     */
    public void setVendorFlg(String vendorFlg) {
        __modifiedProperties.add("vendorFlg");
        this._vendorFlg = vendorFlg;
    }

    /**
     * [get] DELIVERY_FLG: {VARCHAR(255), refers to e_customer.DELIVERY_FLG} <br>
     * 納品先フラグ
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public String getDeliveryFlg() {
        return _deliveryFlg;
    }

    /**
     * [set] DELIVERY_FLG: {VARCHAR(255), refers to e_customer.DELIVERY_FLG} <br>
     * 納品先フラグ
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        __modifiedProperties.add("deliveryFlg");
        this._deliveryFlg = deliveryFlg;
    }

    /**
     * [get] ONETIME_FLG: {VARCHAR(255), refers to e_customer.ONETIME_FLG} <br>
     * ワンタイムフラグ
     * @return The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public String getOnetimeFlg() {
        return _onetimeFlg;
    }

    /**
     * [set] ONETIME_FLG: {VARCHAR(255), refers to e_customer.ONETIME_FLG} <br>
     * ワンタイムフラグ
     * @param onetimeFlg The value of the column 'ONETIME_FLG'. (NullAllowed)
     */
    public void setOnetimeFlg(String onetimeFlg) {
        __modifiedProperties.add("onetimeFlg");
        this._onetimeFlg = onetimeFlg;
    }

    /**
     * [get] DEPOSIT_FLG: {VARCHAR(255), refers to e_customer.DEPOSIT_FLG} <br>
     * 預託先フラグ
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public String getDepositFlg() {
        return _depositFlg;
    }

    /**
     * [set] DEPOSIT_FLG: {VARCHAR(255), refers to e_customer.DEPOSIT_FLG} <br>
     * 預託先フラグ
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public void setDepositFlg(String depositFlg) {
        __modifiedProperties.add("depositFlg");
        this._depositFlg = depositFlg;
    }

    /**
     * [get] ZIP_CD: {VARCHAR(255), refers to e_customer.ZIP_CD} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {VARCHAR(255), refers to e_customer.ZIP_CD} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] ADDRESS1: {VARCHAR(255), refers to e_customer.ADDRESS1} <br>
     * 住所1
     * @return The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public String getAddress1() {
        return _address1;
    }

    /**
     * [set] ADDRESS1: {VARCHAR(255), refers to e_customer.ADDRESS1} <br>
     * 住所1
     * @param address1 The value of the column 'ADDRESS1'. (NullAllowed)
     */
    public void setAddress1(String address1) {
        __modifiedProperties.add("address1");
        this._address1 = address1;
    }

    /**
     * [get] ADDRESS2: {VARCHAR(255), refers to e_customer.ADDRESS2} <br>
     * 住所2
     * @return The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public String getAddress2() {
        return _address2;
    }

    /**
     * [set] ADDRESS2: {VARCHAR(255), refers to e_customer.ADDRESS2} <br>
     * 住所2
     * @param address2 The value of the column 'ADDRESS2'. (NullAllowed)
     */
    public void setAddress2(String address2) {
        __modifiedProperties.add("address2");
        this._address2 = address2;
    }

    /**
     * [get] ADDRESS3: {VARCHAR(255), refers to e_customer.ADDRESS3} <br>
     * 住所3
     * @return The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public String getAddress3() {
        return _address3;
    }

    /**
     * [set] ADDRESS3: {VARCHAR(255), refers to e_customer.ADDRESS3} <br>
     * 住所3
     * @param address3 The value of the column 'ADDRESS3'. (NullAllowed)
     */
    public void setAddress3(String address3) {
        __modifiedProperties.add("address3");
        this._address3 = address3;
    }

    /**
     * [get] TEL_NO: {VARCHAR(255), refers to e_customer.TEL_NO} <br>
     * 電話番号
     * @return The value of the column 'TEL_NO'. (NullAllowed)
     */
    public String getTelNo() {
        return _telNo;
    }

    /**
     * [set] TEL_NO: {VARCHAR(255), refers to e_customer.TEL_NO} <br>
     * 電話番号
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed)
     */
    public void setTelNo(String telNo) {
        __modifiedProperties.add("telNo");
        this._telNo = telNo;
    }

    /**
     * [get] ALLOC_ORDER: {VARCHAR(255), refers to e_customer.ALLOC_ORDER} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public String getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {VARCHAR(255), refers to e_customer.ALLOC_ORDER} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(String allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] SHIPPING_STOP_FLG: {VARCHAR(255), refers to e_customer.SHIPPING_STOP_FLG} <br>
     * 出荷停止フラグ
     * @return The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public String getShippingStopFlg() {
        return _shippingStopFlg;
    }

    /**
     * [set] SHIPPING_STOP_FLG: {VARCHAR(255), refers to e_customer.SHIPPING_STOP_FLG} <br>
     * 出荷停止フラグ
     * @param shippingStopFlg The value of the column 'SHIPPING_STOP_FLG'. (NullAllowed)
     */
    public void setShippingStopFlg(String shippingStopFlg) {
        __modifiedProperties.add("shippingStopFlg");
        this._shippingStopFlg = shippingStopFlg;
    }

    /**
     * [get] LOT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LOT_REVERSE_FLG} <br>
     * ロット逆転防止フラグ
     * @return The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLotReverseFlg() {
        return _lotReverseFlg;
    }

    /**
     * [set] LOT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LOT_REVERSE_FLG} <br>
     * ロット逆転防止フラグ
     * @param lotReverseFlg The value of the column 'LOT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLotReverseFlg(String lotReverseFlg) {
        __modifiedProperties.add("lotReverseFlg");
        this._lotReverseFlg = lotReverseFlg;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LIMIT_DT_REVERSE_FLG} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {VARCHAR(255), refers to e_customer.LIMIT_DT_REVERSE_FLG} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(255), refers to e_customer.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(255), refers to e_customer.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(255), refers to e_customer.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(255), refers to e_customer.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_ORDER: {VARCHAR(255), refers to e_customer.DELIVERY_ORDER} <br>
     * 配送順
     * @return The value of the column 'DELIVERY_ORDER'. (NullAllowed)
     */
    public String getDeliveryOrder() {
        return _deliveryOrder;
    }

    /**
     * [set] DELIVERY_ORDER: {VARCHAR(255), refers to e_customer.DELIVERY_ORDER} <br>
     * 配送順
     * @param deliveryOrder The value of the column 'DELIVERY_ORDER'. (NullAllowed)
     */
    public void setDeliveryOrder(String deliveryOrder) {
        __modifiedProperties.add("deliveryOrder");
        this._deliveryOrder = deliveryOrder;
    }

    /**
     * [get] DELIVERY_READTIME: {VARCHAR(255), refers to e_customer.DELIVERY_READTIME} <br>
     * 配送リードタイム
     * @return The value of the column 'DELIVERY_READTIME'. (NullAllowed)
     */
    public String getDeliveryReadtime() {
        return _deliveryReadtime;
    }

    /**
     * [set] DELIVERY_READTIME: {VARCHAR(255), refers to e_customer.DELIVERY_READTIME} <br>
     * 配送リードタイム
     * @param deliveryReadtime The value of the column 'DELIVERY_READTIME'. (NullAllowed)
     */
    public void setDeliveryReadtime(String deliveryReadtime) {
        __modifiedProperties.add("deliveryReadtime");
        this._deliveryReadtime = deliveryReadtime;
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
     * [get] CLIENT_ID: {BIGINT(20), refers to m_client.CLIENT_ID} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {BIGINT(20), refers to m_client.CLIENT_ID} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CLIENT_NM: {VARCHAR(60), refers to m_client.CLIENT_NM} <br>
     * 荷主名称
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {VARCHAR(60), refers to m_client.CLIENT_NM} <br>
     * 荷主名称
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] MZ_ZIP_ID: {BIGINT(20), refers to m_zip.ZIP_ID} <br>
     * 郵便番号ID
     * @return The value of the column 'MZ_ZIP_ID'. (NullAllowed)
     */
    public Long getMzZipId() {
        return _mzZipId;
    }

    /**
     * [set] MZ_ZIP_ID: {BIGINT(20), refers to m_zip.ZIP_ID} <br>
     * 郵便番号ID
     * @param mzZipId The value of the column 'MZ_ZIP_ID'. (NullAllowed)
     */
    public void setMzZipId(Long mzZipId) {
        __modifiedProperties.add("mzZipId");
        this._mzZipId = mzZipId;
    }

    /**
     * [get] ZIP_ADDRESS1: {VARCHAR(255), refers to m_zip.ADDRESS1} <br>
     * 都道府県
     * @return The value of the column 'ZIP_ADDRESS1'. (NullAllowed)
     */
    public String getZipAddress1() {
        return _zipAddress1;
    }

    /**
     * [set] ZIP_ADDRESS1: {VARCHAR(255), refers to m_zip.ADDRESS1} <br>
     * 都道府県
     * @param zipAddress1 The value of the column 'ZIP_ADDRESS1'. (NullAllowed)
     */
    public void setZipAddress1(String zipAddress1) {
        __modifiedProperties.add("zipAddress1");
        this._zipAddress1 = zipAddress1;
    }

    /**
     * [get] ZIP_ADDRESS2: {VARCHAR(255), refers to m_zip.ADDRESS2} <br>
     * 市区町村
     * @return The value of the column 'ZIP_ADDRESS2'. (NullAllowed)
     */
    public String getZipAddress2() {
        return _zipAddress2;
    }

    /**
     * [set] ZIP_ADDRESS2: {VARCHAR(255), refers to m_zip.ADDRESS2} <br>
     * 市区町村
     * @param zipAddress2 The value of the column 'ZIP_ADDRESS2'. (NullAllowed)
     */
    public void setZipAddress2(String zipAddress2) {
        __modifiedProperties.add("zipAddress2");
        this._zipAddress2 = zipAddress2;
    }

    /**
     * [get] ZIP_ADDRESS3: {VARCHAR(255), refers to m_zip.ADDRESS3} <br>
     * 町域
     * @return The value of the column 'ZIP_ADDRESS3'. (NullAllowed)
     */
    public String getZipAddress3() {
        return _zipAddress3;
    }

    /**
     * [set] ZIP_ADDRESS3: {VARCHAR(255), refers to m_zip.ADDRESS3} <br>
     * 町域
     * @param zipAddress3 The value of the column 'ZIP_ADDRESS3'. (NullAllowed)
     */
    public void setZipAddress3(String zipAddress3) {
        __modifiedProperties.add("zipAddress3");
        this._zipAddress3 = zipAddress3;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to m_center.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_NM: {VARCHAR(60), refers to m_center.CENTER_NM} <br>
     * センタ名称
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {VARCHAR(60), refers to m_center.CENTER_NM} <br>
     * センタ名称
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] DELIVERY_COURSE_ID: {BIGINT(20), refers to m_delivery_course.DELIVERY_COURSE_ID} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {BIGINT(20), refers to m_delivery_course.DELIVERY_COURSE_ID} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] MDC_VERSION_NO: {BIGINT(20), refers to m_delivery_course.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'MDC_VERSION_NO'. (NullAllowed)
     */
    public Long getMdcVersionNo() {
        return _mdcVersionNo;
    }

    /**
     * [set] MDC_VERSION_NO: {BIGINT(20), refers to m_delivery_course.VERSION_NO} <br>
     * バージョンNo.
     * @param mdcVersionNo The value of the column 'MDC_VERSION_NO'. (NullAllowed)
     */
    public void setMdcVersionNo(Long mdcVersionNo) {
        __modifiedProperties.add("mdcVersionNo");
        this._mdcVersionNo = mdcVersionNo;
    }

    /**
     * [get] MCU_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @return The value of the column 'MCU_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getMcuCustomerId() {
        return _mcuCustomerId;
    }

    /**
     * [set] MCU_CUSTOMER_ID: {BIGINT(20), refers to m_customer.CUSTOMER_ID} <br>
     * 取引先ID
     * @param mcuCustomerId The value of the column 'MCU_CUSTOMER_ID'. (NullAllowed)
     */
    public void setMcuCustomerId(Long mcuCustomerId) {
        __modifiedProperties.add("mcuCustomerId");
        this._mcuCustomerId = mcuCustomerId;
    }

    /**
     * [get] MCU_VERSION_NO: {BIGINT(20), refers to m_customer.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'MCU_VERSION_NO'. (NullAllowed)
     */
    public Long getMcuVersionNo() {
        return _mcuVersionNo;
    }

    /**
     * [set] MCU_VERSION_NO: {BIGINT(20), refers to m_customer.VERSION_NO} <br>
     * バージョンNo.
     * @param mcuVersionNo The value of the column 'MCU_VERSION_NO'. (NullAllowed)
     */
    public void setMcuVersionNo(Long mcuVersionNo) {
        __modifiedProperties.add("mcuVersionNo");
        this._mcuVersionNo = mcuVersionNo;
    }

}
