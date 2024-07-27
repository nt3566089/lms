package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlTagLabelCommon. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     DELIVERY_COURSE_NM, ARRIVAL_STORE_CD, TRACKING_NO, SLIP_CLIENT_ADDRESS, SLIP_CLIENT_NM, SLIP_CLIENT_TEL_NO, SALES_ORG_CD, SALES_ORG_TEL, WORK_DT, DELIV_ADDRESS, DELIV_CUSTOMER_NM, SHIPPING_TYPE_CD, DEPARTMENT, DELIV_TEL_NO, INVOICE_SUMMARY, TSIH_NIZOROE_NO, BOX_NO, BOX_NO_SUM, TPIH_NIZOROE_NO, DELIV_DT, DELIV_TZ, COD_FEE, TAG_OUT_FLG, LANE_CD
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
public abstract class BsSqlTagLabelCommonDto implements Serializable {

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
    /** DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** ARRIVAL_STORE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _arrivalStoreCd;

    /** TRACKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _trackingNo;

    /** SLIP_CLIENT_ADDRESS: {VARCHAR(510)} */
    @JsonKey
    protected String _slipClientAddress;

    /** SLIP_CLIENT_NM: {VARCHAR(510)} */
    @JsonKey
    protected String _slipClientNm;

    /** SLIP_CLIENT_TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _slipClientTelNo;

    /** SALES_ORG_CD: {VARCHAR(120)} */
    @JsonKey
    protected String _salesOrgCd;

    /** SALES_ORG_TEL: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgTel;

    /** WORK_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIV_ADDRESS: {VARCHAR(510)} */
    @JsonKey
    protected String _delivAddress;

    /** DELIV_CUSTOMER_NM: {VARCHAR(510)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingTypeCd;

    /** DEPARTMENT: {VARCHAR(30)} */
    @JsonKey
    protected String _department;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** INVOICE_SUMMARY: {VARCHAR(60)} */
    @JsonKey
    protected String _invoiceSummary;

    /** TSIH_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tsihNizoroeNo;

    /** BOX_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNo;

    /** BOX_NO_SUM: {VARCHAR(30)} */
    @JsonKey
    protected String _boxNoSum;

    /** TPIH_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tpihNizoroeNo;

    /** DELIV_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDt;

    /** DELIV_TZ: {VARCHAR(30)} */
    @JsonKey
    protected String _delivTz;

    /** COD_FEE: {BIGINT(20)} */
    @JsonKey
    protected Long _codFee;

    /** TAG_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _tagOutFlg;

    /** LANE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _laneCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlTagLabelCommonDto() {
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
        if (other == null || !(other instanceof BsSqlTagLabelCommonDto)) { return false; }
        final BsSqlTagLabelCommonDto otherEntity = (BsSqlTagLabelCommonDto)other;
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getArrivalStoreCd(), otherEntity.getArrivalStoreCd())) { return false; }
        if (!helpComparingValue(getTrackingNo(), otherEntity.getTrackingNo())) { return false; }
        if (!helpComparingValue(getSlipClientAddress(), otherEntity.getSlipClientAddress())) { return false; }
        if (!helpComparingValue(getSlipClientNm(), otherEntity.getSlipClientNm())) { return false; }
        if (!helpComparingValue(getSlipClientTelNo(), otherEntity.getSlipClientTelNo())) { return false; }
        if (!helpComparingValue(getSalesOrgCd(), otherEntity.getSalesOrgCd())) { return false; }
        if (!helpComparingValue(getSalesOrgTel(), otherEntity.getSalesOrgTel())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getDelivAddress(), otherEntity.getDelivAddress())) { return false; }
        if (!helpComparingValue(getDelivCustomerNm(), otherEntity.getDelivCustomerNm())) { return false; }
        if (!helpComparingValue(getShippingTypeCd(), otherEntity.getShippingTypeCd())) { return false; }
        if (!helpComparingValue(getDepartment(), otherEntity.getDepartment())) { return false; }
        if (!helpComparingValue(getDelivTelNo(), otherEntity.getDelivTelNo())) { return false; }
        if (!helpComparingValue(getInvoiceSummary(), otherEntity.getInvoiceSummary())) { return false; }
        if (!helpComparingValue(getTsihNizoroeNo(), otherEntity.getTsihNizoroeNo())) { return false; }
        if (!helpComparingValue(getBoxNo(), otherEntity.getBoxNo())) { return false; }
        if (!helpComparingValue(getBoxNoSum(), otherEntity.getBoxNoSum())) { return false; }
        if (!helpComparingValue(getTpihNizoroeNo(), otherEntity.getTpihNizoroeNo())) { return false; }
        if (!helpComparingValue(getDelivDt(), otherEntity.getDelivDt())) { return false; }
        if (!helpComparingValue(getDelivTz(), otherEntity.getDelivTz())) { return false; }
        if (!helpComparingValue(getCodFee(), otherEntity.getCodFee())) { return false; }
        if (!helpComparingValue(getTagOutFlg(), otherEntity.getTagOutFlg())) { return false; }
        if (!helpComparingValue(getLaneCd(), otherEntity.getLaneCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlTagLabelCommon");
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getArrivalStoreCd());
        result = xCH(result, getTrackingNo());
        result = xCH(result, getSlipClientAddress());
        result = xCH(result, getSlipClientNm());
        result = xCH(result, getSlipClientTelNo());
        result = xCH(result, getSalesOrgCd());
        result = xCH(result, getSalesOrgTel());
        result = xCH(result, getWorkDt());
        result = xCH(result, getDelivAddress());
        result = xCH(result, getDelivCustomerNm());
        result = xCH(result, getShippingTypeCd());
        result = xCH(result, getDepartment());
        result = xCH(result, getDelivTelNo());
        result = xCH(result, getInvoiceSummary());
        result = xCH(result, getTsihNizoroeNo());
        result = xCH(result, getBoxNo());
        result = xCH(result, getBoxNoSum());
        result = xCH(result, getTpihNizoroeNo());
        result = xCH(result, getDelivDt());
        result = xCH(result, getDelivTz());
        result = xCH(result, getCodFee());
        result = xCH(result, getTagOutFlg());
        result = xCH(result, getLaneCd());
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
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getArrivalStoreCd());
        sb.append(c).append(getTrackingNo());
        sb.append(c).append(getSlipClientAddress());
        sb.append(c).append(getSlipClientNm());
        sb.append(c).append(getSlipClientTelNo());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getSalesOrgTel());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivAddress());
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getShippingTypeCd());
        sb.append(c).append(getDepartment());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getInvoiceSummary());
        sb.append(c).append(getTsihNizoroeNo());
        sb.append(c).append(getBoxNo());
        sb.append(c).append(getBoxNoSum());
        sb.append(c).append(getTpihNizoroeNo());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
        sb.append(c).append(getCodFee());
        sb.append(c).append(getTagOutFlg());
        sb.append(c).append(getLaneCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] SLIP_CLIENT_ADDRESS: {VARCHAR(510)} <br>
     * @return The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed)
     */
    public String getSlipClientAddress() {
        return _slipClientAddress;
    }

    /**
     * [set] SLIP_CLIENT_ADDRESS: {VARCHAR(510)} <br>
     * @param slipClientAddress The value of the column 'SLIP_CLIENT_ADDRESS'. (NullAllowed)
     */
    public void setSlipClientAddress(String slipClientAddress) {
        __modifiedProperties.add("slipClientAddress");
        this._slipClientAddress = slipClientAddress;
    }

    /**
     * [get] SLIP_CLIENT_NM: {VARCHAR(510)} <br>
     * @return The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public String getSlipClientNm() {
        return _slipClientNm;
    }

    /**
     * [set] SLIP_CLIENT_NM: {VARCHAR(510)} <br>
     * @param slipClientNm The value of the column 'SLIP_CLIENT_NM'. (NullAllowed)
     */
    public void setSlipClientNm(String slipClientNm) {
        __modifiedProperties.add("slipClientNm");
        this._slipClientNm = slipClientNm;
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
     * [get] SALES_ORG_CD: {VARCHAR(120)} <br>
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(120)} <br>
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORG_TEL: {VARCHAR(30)} <br>
     * @return The value of the column 'SALES_ORG_TEL'. (NullAllowed)
     */
    public String getSalesOrgTel() {
        return _salesOrgTel;
    }

    /**
     * [set] SALES_ORG_TEL: {VARCHAR(30)} <br>
     * @param salesOrgTel The value of the column 'SALES_ORG_TEL'. (NullAllowed)
     */
    public void setSalesOrgTel(String salesOrgTel) {
        __modifiedProperties.add("salesOrgTel");
        this._salesOrgTel = salesOrgTel;
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
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public String getShippingTypeCd() {
        return _shippingTypeCd;
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        __modifiedProperties.add("shippingTypeCd");
        this._shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] DEPARTMENT: {VARCHAR(30)} <br>
     * @return The value of the column 'DEPARTMENT'. (NullAllowed)
     */
    public String getDepartment() {
        return _department;
    }

    /**
     * [set] DEPARTMENT: {VARCHAR(30)} <br>
     * @param department The value of the column 'DEPARTMENT'. (NullAllowed)
     */
    public void setDepartment(String department) {
        __modifiedProperties.add("department");
        this._department = department;
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
     * [get] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public String getInvoiceSummary() {
        return _invoiceSummary;
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        __modifiedProperties.add("invoiceSummary");
        this._invoiceSummary = invoiceSummary;
    }

    /**
     * [get] TSIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TSIH_NIZOROE_NO'. (NullAllowed)
     */
    public String getTsihNizoroeNo() {
        return _tsihNizoroeNo;
    }

    /**
     * [set] TSIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @param tsihNizoroeNo The value of the column 'TSIH_NIZOROE_NO'. (NullAllowed)
     */
    public void setTsihNizoroeNo(String tsihNizoroeNo) {
        __modifiedProperties.add("tsihNizoroeNo");
        this._tsihNizoroeNo = tsihNizoroeNo;
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
     * [get] TPIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TPIH_NIZOROE_NO'. (NullAllowed)
     */
    public String getTpihNizoroeNo() {
        return _tpihNizoroeNo;
    }

    /**
     * [set] TPIH_NIZOROE_NO: {VARCHAR(30)} <br>
     * @param tpihNizoroeNo The value of the column 'TPIH_NIZOROE_NO'. (NullAllowed)
     */
    public void setTpihNizoroeNo(String tpihNizoroeNo) {
        __modifiedProperties.add("tpihNizoroeNo");
        this._tpihNizoroeNo = tpihNizoroeNo;
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
     * [get] COD_FEE: {BIGINT(20)} <br>
     * @return The value of the column 'COD_FEE'. (NullAllowed)
     */
    public Long getCodFee() {
        return _codFee;
    }

    /**
     * [set] COD_FEE: {BIGINT(20)} <br>
     * @param codFee The value of the column 'COD_FEE'. (NullAllowed)
     */
    public void setCodFee(Long codFee) {
        __modifiedProperties.add("codFee");
        this._codFee = codFee;
    }

    /**
     * [get] TAG_OUT_FLG: {CHAR(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public String getTagOutFlg() {
        return _tagOutFlg;
    }

    /**
     * [set] TAG_OUT_FLG: {CHAR(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public void setTagOutFlg(String tagOutFlg) {
        __modifiedProperties.add("tagOutFlg");
        this._tagOutFlg = tagOutFlg;
    }

    /**
     * [get] LANE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'LANE_CD'. (NullAllowed)
     */
    public String getLaneCd() {
        return _laneCd;
    }

    /**
     * [set] LANE_CD: {VARCHAR(30)} <br>
     * @param laneCd The value of the column 'LANE_CD'. (NullAllowed)
     */
    public void setLaneCd(String laneCd) {
        __modifiedProperties.add("laneCd");
        this._laneCd = laneCd;
    }

}
