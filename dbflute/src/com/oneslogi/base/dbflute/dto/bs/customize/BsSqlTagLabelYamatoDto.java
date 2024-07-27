package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTagLabelYamato. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     ARRIVAL_STORE_CD, DELIV_TEL_NO, DELIV_ZIP_CD, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SLIP_CLIENT_TEL_NO, SLIP_CLIENT_ZIP_CD, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, CARRIER_TRACE_NUM, WORK_DT, DELIV_DT, DELIV_TZ, SLIP_ITEM_NM, BOX_NO, BOX_NO_SUM, ARTICLE, BOX_SIZE_CD, SEND_CD, NIZOROE_NO, TRACKING_NO, DELIV_TEL_NO_H, DELIV_ZIP_CD_H, DELIV_ADDRESS_H, DELIV_CUSTOMER_NM_H, SLIP_CLIENT_TEL_NO_H, SLIP_CLIENT_ZIP_CD_H, SLIP_CLIENT_ADDRESS_H, SLIP_CLIENT_NM_H, CARRIER_TRACE_NUM_H, WORK_DT_H, DELIV_DT_H, DELIV_TZ_H, SLIP_ITEM_NM_H, ARTICLE_H, SEND_CD_H, TRACKING_NO_H, BOX_NO_H, BOX_NO_H_SUM, DELIVERY_COURSE_NM
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
public abstract class BsSqlTagLabelYamatoDto implements Serializable {

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
    /** ARRIVAL_STORE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _arrivalStoreCd;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIV_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivZipCd;

    /** DELIV_ADDRESS: {VARCHAR(510)} */
    @JsonKey
    protected String _delivAddress;

    /** DELIV_CUSTOMER_NM: {VARCHAR(510)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** SLIP_CLIENT_TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _slipClientTelNo;

    /** SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipClientZipCd;

    /** SLIP_CLIENT_ADDRESS: {VARCHAR(240)} */
    @JsonKey
    protected String _slipClientAddress;

    /** SLIP_CLIENT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _slipClientNm;

    /** CARRIER_TRACE_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** WORK_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIV_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    @JsonKey
    protected String _delivTz;

    /** SLIP_ITEM_NM: {VARCHAR(180)} */
    @JsonKey
    protected String _slipItemNm;

    /** BOX_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNo;

    /** BOX_NO_SUM: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNoSum;

    /** ARTICLE: {VARCHAR(255)} */
    @JsonKey
    protected String _article;

    /** BOX_SIZE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _boxSizeCd;

    /** SEND_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sendCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** TRACKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _trackingNo;

    /** DELIV_TEL_NO_H: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNoH;

    /** DELIV_ZIP_CD_H: {VARCHAR(30)} */
    @JsonKey
    protected String _delivZipCdH;

    /** DELIV_ADDRESS_H: {VARCHAR(510)} */
    @JsonKey
    protected String _delivAddressH;

    /** DELIV_CUSTOMER_NM_H: {VARCHAR(510)} */
    @JsonKey
    protected String _delivCustomerNmH;

    /** SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} */
    @JsonKey
    protected String _slipClientTelNoH;

    /** SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} */
    @JsonKey
    protected String _slipClientZipCdH;

    /** SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} */
    @JsonKey
    protected String _slipClientAddressH;

    /** SLIP_CLIENT_NM_H: {VARCHAR(60)} */
    @JsonKey
    protected String _slipClientNmH;

    /** CARRIER_TRACE_NUM_H: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierTraceNumH;

    /** WORK_DT_H: {VARCHAR(8)} */
    @JsonKey
    protected String _workDtH;

    /** DELIV_DT_H: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDtH;

    /** DELIV_TZ_H: {VARCHAR(30)} */
    @JsonKey
    protected String _delivTzH;

    /** SLIP_ITEM_NM_H: {VARCHAR(180)} */
    @JsonKey
    protected String _slipItemNmH;

    /** ARTICLE_H: {VARCHAR(255)} */
    @JsonKey
    protected String _articleH;

    /** SEND_CD_H: {VARCHAR(30)} */
    @JsonKey
    protected String _sendCdH;

    /** TRACKING_NO_H: {VARCHAR(30)} */
    @JsonKey
    protected String _trackingNoH;

    /** BOX_NO_H: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNoH;

    /** BOX_NO_H_SUM: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNoHSum;

    /** DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} */
    @JsonKey
    protected String _deliveryCourseNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTagLabelYamatoDto() {
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
        if (other == null || !(other instanceof BsSqlTagLabelYamatoDto)) { return false; }
        final BsSqlTagLabelYamatoDto otherEntity = (BsSqlTagLabelYamatoDto)other;
        if (!helpComparingValue(getArrivalStoreCd(), otherEntity.getArrivalStoreCd())) { return false; }
        if (!helpComparingValue(getDelivTelNo(), otherEntity.getDelivTelNo())) { return false; }
        if (!helpComparingValue(getDelivZipCd(), otherEntity.getDelivZipCd())) { return false; }
        if (!helpComparingValue(getDelivAddress(), otherEntity.getDelivAddress())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getSlipClientTelNo(), otherEntity.getSlipClientTelNo())) { return false; }
        if (!helpComparingValue(getSlipClientZipCd(), otherEntity.getSlipClientZipCd())) { return false; }
        if (!helpComparingValue(getSlipClientAddress(), otherEntity.getSlipClientAddress())) { return false; }
        if (!helpComparingValue(getSlipClientNm(), otherEntity.getSlipClientNm())) { return false; }
        if (!helpComparingValue(getCarrierTraceNum(), otherEntity.getCarrierTraceNum())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getDelivDt(), otherEntity.getDelivDt())) { return false; }
        if (!helpComparingValue(getDelivTz(), otherEntity.getDelivTz())) { return false; }
        if (!helpComparingValue(getSlipItemNm(), otherEntity.getSlipItemNm())) { return false; }
        if (!helpComparingValue(getBoxNo(), otherEntity.getBoxNo())) { return false; }
        if (!helpComparingValue(getBoxNoSum(), otherEntity.getBoxNoSum())) { return false; }
        if (!helpComparingValue(getArticle(), otherEntity.getArticle())) { return false; }
        if (!helpComparingValue(getBoxSizeCd(), otherEntity.getBoxSizeCd())) { return false; }
        if (!helpComparingValue(getSendCd(), otherEntity.getSendCd())) { return false; }
        if (!helpComparingValue(getNizoroeNo(), otherEntity.getNizoroeNo())) { return false; }
        if (!helpComparingValue(getTrackingNo(), otherEntity.getTrackingNo())) { return false; }
        if (!helpComparingValue(getDelivTelNoH(), otherEntity.getDelivTelNoH())) { return false; }
        if (!helpComparingValue(getDelivZipCdH(), otherEntity.getDelivZipCdH())) { return false; }
        if (!helpComparingValue(getDelivAddressH(), otherEntity.getDelivAddressH())) { return false; }
        if (!helpComparingValue(getDelivCustomerNmH(), otherEntity.getDelivCustomerNmH())) { return false; }
        if (!helpComparingValue(getSlipClientTelNoH(), otherEntity.getSlipClientTelNoH())) { return false; }
        if (!helpComparingValue(getSlipClientZipCdH(), otherEntity.getSlipClientZipCdH())) { return false; }
        if (!helpComparingValue(getSlipClientAddressH(), otherEntity.getSlipClientAddressH())) { return false; }
        if (!helpComparingValue(getSlipClientNmH(), otherEntity.getSlipClientNmH())) { return false; }
        if (!helpComparingValue(getCarrierTraceNumH(), otherEntity.getCarrierTraceNumH())) { return false; }
        if (!helpComparingValue(getWorkDtH(), otherEntity.getWorkDtH())) { return false; }
        if (!helpComparingValue(getDelivDtH(), otherEntity.getDelivDtH())) { return false; }
        if (!helpComparingValue(getDelivTzH(), otherEntity.getDelivTzH())) { return false; }
        if (!helpComparingValue(getSlipItemNmH(), otherEntity.getSlipItemNmH())) { return false; }
        if (!helpComparingValue(getArticleH(), otherEntity.getArticleH())) { return false; }
        if (!helpComparingValue(getSendCdH(), otherEntity.getSendCdH())) { return false; }
        if (!helpComparingValue(getTrackingNoH(), otherEntity.getTrackingNoH())) { return false; }
        if (!helpComparingValue(getBoxNoH(), otherEntity.getBoxNoH())) { return false; }
        if (!helpComparingValue(getBoxNoHSum(), otherEntity.getBoxNoHSum())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTagLabelYamato");
        result = xCH(result, getArrivalStoreCd());
        result = xCH(result, getDelivTelNo());
        result = xCH(result, getDelivZipCd());
        result = xCH(result, getDelivAddress());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getSlipClientTelNo());
        result = xCH(result, getSlipClientZipCd());
        result = xCH(result, getSlipClientAddress());
        result = xCH(result, getSlipClientNm());
        result = xCH(result, getCarrierTraceNum());
        result = xCH(result, getWorkDt());
        result = xCH(result, getDelivDt());
        result = xCH(result, getDelivTz());
        result = xCH(result, getSlipItemNm());
        result = xCH(result, getBoxNo());
        result = xCH(result, getBoxNoSum());
        result = xCH(result, getArticle());
        result = xCH(result, getBoxSizeCd());
        result = xCH(result, getSendCd());
        result = xCH(result, getNizoroeNo());
        result = xCH(result, getTrackingNo());
        result = xCH(result, getDelivTelNoH());
        result = xCH(result, getDelivZipCdH());
        result = xCH(result, getDelivAddressH());
        result = xCH(result, getDelivCustomerNmH());
        result = xCH(result, getSlipClientTelNoH());
        result = xCH(result, getSlipClientZipCdH());
        result = xCH(result, getSlipClientAddressH());
        result = xCH(result, getSlipClientNmH());
        result = xCH(result, getCarrierTraceNumH());
        result = xCH(result, getWorkDtH());
        result = xCH(result, getDelivDtH());
        result = xCH(result, getDelivTzH());
        result = xCH(result, getSlipItemNmH());
        result = xCH(result, getArticleH());
        result = xCH(result, getSendCdH());
        result = xCH(result, getTrackingNoH());
        result = xCH(result, getBoxNoH());
        result = xCH(result, getBoxNoHSum());
        result = xCH(result, getDeliveryCourseNm());
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
        sb.append(c).append(getArrivalStoreCd());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDelivZipCd());
        sb.append(c).append(getDelivAddress());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getSlipClientTelNo());
        sb.append(c).append(getSlipClientZipCd());
        sb.append(c).append(getSlipClientAddress());
        sb.append(c).append(getSlipClientNm());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getSlipItemNm());
        sb.append(c).append(getBoxNo());
        sb.append(c).append(getBoxNoSum());
        sb.append(c).append(getArticle());
        sb.append(c).append(getBoxSizeCd());
        sb.append(c).append(getSendCd());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getTrackingNo());
        sb.append(c).append(getDelivTelNoH());
        sb.append(c).append(getDelivZipCdH());
        sb.append(c).append(getDelivAddressH());
        sb.append(c).append(getDelivCustomerNmH());
        sb.append(c).append(getSlipClientTelNoH());
        sb.append(c).append(getSlipClientZipCdH());
        sb.append(c).append(getSlipClientAddressH());
        sb.append(c).append(getSlipClientNmH());
        sb.append(c).append(getCarrierTraceNumH());
        sb.append(c).append(getWorkDtH());
        sb.append(c).append(getDelivDtH());
        sb.append(c).append(getDelivTzH());
        sb.append(c).append(getSlipItemNmH());
        sb.append(c).append(getArticleH());
        sb.append(c).append(getSendCdH());
        sb.append(c).append(getTrackingNoH());
        sb.append(c).append(getBoxNoH());
        sb.append(c).append(getBoxNoHSum());
        sb.append(c).append(getDeliveryCourseNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ARRIVAL_STORE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed)
     */
    public String getArrivalStoreCd() {
        return _arrivalStoreCd;
    }

    /**
     * [set] ARRIVAL_STORE_CD: {VARCHAR(30)} <br>
     * @param arrivalStoreCd The value of the column 'ARRIVAL_STORE_CD'. (NullAllowed)
     */
    public void setArrivalStoreCd(String arrivalStoreCd) {
        __modifiedProperties.add("arrivalStoreCd");
        this._arrivalStoreCd = arrivalStoreCd;
    }

    /**
     * [get] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public String getDelivTelNo() {
        return _delivTelNo;
    }

    /**
     * [set] DELIV_TEL_NO: {VARCHAR(255)} <br>
     * @param delivTelNo The value of the column 'DELIV_TEL_NO'. (NullAllowed)
     */
    public void setDelivTelNo(String delivTelNo) {
        __modifiedProperties.add("delivTelNo");
        this._delivTelNo = delivTelNo;
    }

    /**
     * [get] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public String getDelivZipCd() {
        return _delivZipCd;
    }

    /**
     * [set] DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * @param delivZipCd The value of the column 'DELIV_ZIP_CD'. (NullAllowed)
     */
    public void setDelivZipCd(String delivZipCd) {
        __modifiedProperties.add("delivZipCd");
        this._delivZipCd = delivZipCd;
    }

    /**
     * [get] DELIV_ADDRESS: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_ADDRESS'. (NullAllowed)
     */
    public String getDelivAddress() {
        return _delivAddress;
    }

    /**
     * [set] DELIV_ADDRESS: {VARCHAR(510)} <br>
     * @param delivAddress The value of the column 'DELIV_ADDRESS'. (NullAllowed)
     */
    public void setDelivAddress(String delivAddress) {
        __modifiedProperties.add("delivAddress");
        this._delivAddress = delivAddress;
    }

    /**
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(510)} <br>
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed)
     */
    public String getSlipClientTelNo() {
        return _slipClientTelNo;
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO: {VARCHAR(30)} <br>
     * @param slipClientTelNo The value of the column 'SLIP_CLIENT_TEL_NO'. (NullAllowed)
     */
    public void setSlipClientTelNo(String slipClientTelNo) {
        __modifiedProperties.add("slipClientTelNo");
        this._slipClientTelNo = slipClientTelNo;
    }

    /**
     * [get] SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed)
     */
    public String getSlipClientZipCd() {
        return _slipClientZipCd;
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD: {VARCHAR(30)} <br>
     * @param slipClientZipCd The value of the column 'SLIP_CLIENT_ZIP_CD'. (NullAllowed)
     */
    public void setSlipClientZipCd(String slipClientZipCd) {
        __modifiedProperties.add("slipClientZipCd");
        this._slipClientZipCd = slipClientZipCd;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS: {VARCHAR(240)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed)
     */
    public String getSlipClientAddress() {
        return _slipClientAddress;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS: {VARCHAR(240)} <br>
     * @param slipClientAddress The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed)
     */
    public void setSlipClientAddress(String slipClientAddress) {
        __modifiedProperties.add("slipClientAddress");
        this._slipClientAddress = slipClientAddress;
    }

    /**
     * [get] SLIP_CLIENT_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public String getSlipClientNm() {
        return _slipClientNm;
    }

    /**
     * [set] SLIP_CLIENT_NM: {VARCHAR(60)} <br>
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public void setSlipClientNm(String slipClientNm) {
        __modifiedProperties.add("slipClientNm");
        this._slipClientNm = slipClientNm;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] DELIV_TZ: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30)} <br>
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] SLIP_ITEM_NM: {VARCHAR(180)} <br>
     * @return The value of the column 'SLIP_ITEM_NM'. (NullAllowed)
     */
    public String getSlipItemNm() {
        return _slipItemNm;
    }

    /**
     * [set] SLIP_ITEM_NM: {VARCHAR(180)} <br>
     * @param slipItemNm The value of the column 'SLIP_ITEM_NM'. (NullAllowed)
     */
    public void setSlipItemNm(String slipItemNm) {
        __modifiedProperties.add("slipItemNm");
        this._slipItemNm = slipItemNm;
    }

    /**
     * [get] BOX_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO'. (NullAllowed)
     */
    public String getBoxNo() {
        return _boxNo;
    }

    /**
     * [set] BOX_NO: {VARCHAR(30)} <br>
     * @param boxNo The value of the column 'BOX_NO'. (NullAllowed)
     */
    public void setBoxNo(String boxNo) {
        __modifiedProperties.add("boxNo");
        this._boxNo = boxNo;
    }

    /**
     * [get] BOX_NO_SUM: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_SUM'. (NullAllowed)
     */
    public String getBoxNoSum() {
        return _boxNoSum;
    }

    /**
     * [set] BOX_NO_SUM: {VARCHAR(30)} <br>
     * @param boxNoSum The value of the column 'BOX_NO_SUM'. (NullAllowed)
     */
    public void setBoxNoSum(String boxNoSum) {
        __modifiedProperties.add("boxNoSum");
        this._boxNoSum = boxNoSum;
    }

    /**
     * [get] ARTICLE: {VARCHAR(255)} <br>
     * @return The value of the column 'ARTICLE'. (NullAllowed)
     */
    public String getArticle() {
        return _article;
    }

    /**
     * [set] ARTICLE: {VARCHAR(255)} <br>
     * @param article The value of the column 'ARTICLE'. (NullAllowed)
     */
    public void setArticle(String article) {
        __modifiedProperties.add("article");
        this._article = article;
    }

    /**
     * [get] BOX_SIZE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_SIZE_CD'. (NullAllowed)
     */
    public String getBoxSizeCd() {
        return _boxSizeCd;
    }

    /**
     * [set] BOX_SIZE_CD: {VARCHAR(30)} <br>
     * @param boxSizeCd The value of the column 'BOX_SIZE_CD'. (NullAllowed)
     */
    public void setBoxSizeCd(String boxSizeCd) {
        __modifiedProperties.add("boxSizeCd");
        this._boxSizeCd = boxSizeCd;
    }

    /**
     * [get] SEND_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SEND_CD'. (NullAllowed)
     */
    public String getSendCd() {
        return _sendCd;
    }

    /**
     * [set] SEND_CD: {VARCHAR(30)} <br>
     * @param sendCd The value of the column 'SEND_CD'. (NullAllowed)
     */
    public void setSendCd(String sendCd) {
        __modifiedProperties.add("sendCd");
        this._sendCd = sendCd;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] TRACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TRACKING_NO'. (NullAllowed)
     */
    public String getTrackingNo() {
        return _trackingNo;
    }

    /**
     * [set] TRACKING_NO: {VARCHAR(30)} <br>
     * @param trackingNo The value of the column 'TRACKING_NO'. (NullAllowed)
     */
    public void setTrackingNo(String trackingNo) {
        __modifiedProperties.add("trackingNo");
        this._trackingNo = trackingNo;
    }

    /**
     * [get] DELIV_TEL_NO_H: {VARCHAR(255)} <br>
     * @return The value of the column 'DELIV_TEL_NO_H'. (NullAllowed)
     */
    public String getDelivTelNoH() {
        return _delivTelNoH;
    }

    /**
     * [set] DELIV_TEL_NO_H: {VARCHAR(255)} <br>
     * @param delivTelNoH The value of the column 'DELIV_TEL_NO_H'. (NullAllowed)
     */
    public void setDelivTelNoH(String delivTelNoH) {
        __modifiedProperties.add("delivTelNoH");
        this._delivTelNoH = delivTelNoH;
    }

    /**
     * [get] DELIV_ZIP_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_ZIP_CD_H'. (NullAllowed)
     */
    public String getDelivZipCdH() {
        return _delivZipCdH;
    }

    /**
     * [set] DELIV_ZIP_CD_H: {VARCHAR(30)} <br>
     * @param delivZipCdH The value of the column 'DELIV_ZIP_CD_H'. (NullAllowed)
     */
    public void setDelivZipCdH(String delivZipCdH) {
        __modifiedProperties.add("delivZipCdH");
        this._delivZipCdH = delivZipCdH;
    }

    /**
     * [get] DELIV_ADDRESS_H: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_ADDRESS_H'. (NullAllowed)
     */
    public String getDelivAddressH() {
        return _delivAddressH;
    }

    /**
     * [set] DELIV_ADDRESS_H: {VARCHAR(510)} <br>
     * @param delivAddressH The value of the column 'DELIV_ADDRESS_H'. (NullAllowed)
     */
    public void setDelivAddressH(String delivAddressH) {
        __modifiedProperties.add("delivAddressH");
        this._delivAddressH = delivAddressH;
    }

    /**
     * [get] DELIV_CUSTOMER_NM_H: {VARCHAR(510)} <br>
     * @return The value of the column 'DELIV_CUSTOMER_NM_H'. (NullAllowed)
     */
    public String getDelivCustomerNmH() {
        return _delivCustomerNmH;
    }

    /**
     * [set] DELIV_CUSTOMER_NM_H: {VARCHAR(510)} <br>
     * @param delivCustomerNmH The value of the column 'DELIV_CUSTOMER_NM_H'. (NullAllowed)
     */
    public void setDelivCustomerNmH(String delivCustomerNmH) {
        __modifiedProperties.add("delivCustomerNmH");
        this._delivCustomerNmH = delivCustomerNmH;
    }

    /**
     * [get] SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_TEL_NO_H'. (NullAllowed)
     */
    public String getSlipClientTelNoH() {
        return _slipClientTelNoH;
    }

    /**
     * [set] SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)} <br>
     * @param slipClientTelNoH The value of the column 'SLIP_CLIENT_TEL_NO_H'. (NullAllowed)
     */
    public void setSlipClientTelNoH(String slipClientTelNoH) {
        __modifiedProperties.add("slipClientTelNoH");
        this._slipClientTelNoH = slipClientTelNoH;
    }

    /**
     * [get] SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SLIP_CLIENT_ZIP_CD_H'. (NullAllowed)
     */
    public String getSlipClientZipCdH() {
        return _slipClientZipCdH;
    }

    /**
     * [set] SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)} <br>
     * @param slipClientZipCdH The value of the column 'SLIP_CLIENT_ZIP_CD_H'. (NullAllowed)
     */
    public void setSlipClientZipCdH(String slipClientZipCdH) {
        __modifiedProperties.add("slipClientZipCdH");
        this._slipClientZipCdH = slipClientZipCdH;
    }

    /**
     * [get] SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS_H'. (NullAllowed)
     */
    public String getSlipClientAddressH() {
        return _slipClientAddressH;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)} <br>
     * @param slipClientAddressH The value of the column 'SLIP_CLIENT_ADDRESS_H'. (NullAllowed)
     */
    public void setSlipClientAddressH(String slipClientAddressH) {
        __modifiedProperties.add("slipClientAddressH");
        this._slipClientAddressH = slipClientAddressH;
    }

    /**
     * [get] SLIP_CLIENT_NM_H: {VARCHAR(60)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM_H'. (NullAllowed)
     */
    public String getSlipClientNmH() {
        return _slipClientNmH;
    }

    /**
     * [set] SLIP_CLIENT_NM_H: {VARCHAR(60)} <br>
     * @param slipClientNmH The value of the column 'SLIP_CLIENT_NM_H'. (NullAllowed)
     */
    public void setSlipClientNmH(String slipClientNmH) {
        __modifiedProperties.add("slipClientNmH");
        this._slipClientNmH = slipClientNmH;
    }

    /**
     * [get] CARRIER_TRACE_NUM_H: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM_H'. (NullAllowed)
     */
    public String getCarrierTraceNumH() {
        return _carrierTraceNumH;
    }

    /**
     * [set] CARRIER_TRACE_NUM_H: {VARCHAR(30)} <br>
     * @param carrierTraceNumH The value of the column 'CARRIER_TRACE_NUM_H'. (NullAllowed)
     */
    public void setCarrierTraceNumH(String carrierTraceNumH) {
        __modifiedProperties.add("carrierTraceNumH");
        this._carrierTraceNumH = carrierTraceNumH;
    }

    /**
     * [get] WORK_DT_H: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT_H'. (NullAllowed)
     */
    public String getWorkDtH() {
        return _workDtH;
    }

    /**
     * [set] WORK_DT_H: {VARCHAR(8)} <br>
     * @param workDtH The value of the column 'WORK_DT_H'. (NullAllowed)
     */
    public void setWorkDtH(String workDtH) {
        __modifiedProperties.add("workDtH");
        this._workDtH = workDtH;
    }

    /**
     * [get] DELIV_DT_H: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT_H'. (NullAllowed)
     */
    public String getDelivDtH() {
        return _delivDtH;
    }

    /**
     * [set] DELIV_DT_H: {VARCHAR(8)} <br>
     * @param delivDtH The value of the column 'DELIV_DT_H'. (NullAllowed)
     */
    public void setDelivDtH(String delivDtH) {
        __modifiedProperties.add("delivDtH");
        this._delivDtH = delivDtH;
    }

    /**
     * [get] DELIV_TZ_H: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_TZ_H'. (NullAllowed)
     */
    public String getDelivTzH() {
        return _delivTzH;
    }

    /**
     * [set] DELIV_TZ_H: {VARCHAR(30)} <br>
     * @param delivTzH The value of the column 'DELIV_TZ_H'. (NullAllowed)
     */
    public void setDelivTzH(String delivTzH) {
        __modifiedProperties.add("delivTzH");
        this._delivTzH = delivTzH;
    }

    /**
     * [get] SLIP_ITEM_NM_H: {VARCHAR(180)} <br>
     * @return The value of the column 'SLIP_ITEM_NM_H'. (NullAllowed)
     */
    public String getSlipItemNmH() {
        return _slipItemNmH;
    }

    /**
     * [set] SLIP_ITEM_NM_H: {VARCHAR(180)} <br>
     * @param slipItemNmH The value of the column 'SLIP_ITEM_NM_H'. (NullAllowed)
     */
    public void setSlipItemNmH(String slipItemNmH) {
        __modifiedProperties.add("slipItemNmH");
        this._slipItemNmH = slipItemNmH;
    }

    /**
     * [get] ARTICLE_H: {VARCHAR(255)} <br>
     * @return The value of the column 'ARTICLE_H'. (NullAllowed)
     */
    public String getArticleH() {
        return _articleH;
    }

    /**
     * [set] ARTICLE_H: {VARCHAR(255)} <br>
     * @param articleH The value of the column 'ARTICLE_H'. (NullAllowed)
     */
    public void setArticleH(String articleH) {
        __modifiedProperties.add("articleH");
        this._articleH = articleH;
    }

    /**
     * [get] SEND_CD_H: {VARCHAR(30)} <br>
     * @return The value of the column 'SEND_CD_H'. (NullAllowed)
     */
    public String getSendCdH() {
        return _sendCdH;
    }

    /**
     * [set] SEND_CD_H: {VARCHAR(30)} <br>
     * @param sendCdH The value of the column 'SEND_CD_H'. (NullAllowed)
     */
    public void setSendCdH(String sendCdH) {
        __modifiedProperties.add("sendCdH");
        this._sendCdH = sendCdH;
    }

    /**
     * [get] TRACKING_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'TRACKING_NO_H'. (NullAllowed)
     */
    public String getTrackingNoH() {
        return _trackingNoH;
    }

    /**
     * [set] TRACKING_NO_H: {VARCHAR(30)} <br>
     * @param trackingNoH The value of the column 'TRACKING_NO_H'. (NullAllowed)
     */
    public void setTrackingNoH(String trackingNoH) {
        __modifiedProperties.add("trackingNoH");
        this._trackingNoH = trackingNoH;
    }

    /**
     * [get] BOX_NO_H: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_H'. (NullAllowed)
     */
    public String getBoxNoH() {
        return _boxNoH;
    }

    /**
     * [set] BOX_NO_H: {VARCHAR(30)} <br>
     * @param boxNoH The value of the column 'BOX_NO_H'. (NullAllowed)
     */
    public void setBoxNoH(String boxNoH) {
        __modifiedProperties.add("boxNoH");
        this._boxNoH = boxNoH;
    }

    /**
     * [get] BOX_NO_H_SUM: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_NO_H_SUM'. (NullAllowed)
     */
    public String getBoxNoHSum() {
        return _boxNoHSum;
    }

    /**
     * [set] BOX_NO_H_SUM: {VARCHAR(30)} <br>
     * @param boxNoHSum The value of the column 'BOX_NO_H_SUM'. (NullAllowed)
     */
    public void setBoxNoHSum(String boxNoHSum) {
        __modifiedProperties.add("boxNoHSum");
        this._boxNoHSum = boxNoHSum;
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

}
