package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_delivery_course as TABLE. <br>
 * 配送コースマスタ
 * <pre>
 * [primary-key]
 *     DELIVERY_COURSE_ID
 *
 * [column]
 *     DELIVERY_COURSE_ID, CENTER_ID, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_ID, PICKING_TIME, STOWAGE_TIME, SHIPPING_TIME, CARRIER_SLIP_YMT_ID, CARRIER_SLIP_SGW_ID, CARRIER_SLIP_YUPK_ID, TRACKING_NUMBERING_KEY, TRACKING_NUMBERING_AFTER_KEY, TRACKING_NUMBERING_UNIT, TAG_TYPE, TAG_TYPE_AFTER, TAG_DATA_TYPE, PAYMENT_TERM, CARRIER_TYPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DELIVERY_COURSE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_carrier, m_carrier_slip_yupk, m_carrier_slip_sgw, m_carrier_slip_ymt, m_center, b_class_dtl(ByDelFlg), m_center_class_dtl(ByTagDataType)
 *
 * [referrer-table]
 *     m_center_customer, m_param, t_alloc_inst_h, t_shipping_inst_h, w_ht_loading
 *
 * [foreign-property]
 *     mCarrier, mCarrierSlipYupk, mCarrierSlipSgw, mCarrierSlipYmt, mCenter, bClassDtlByDelFlg, mCenterClassDtlByTagDataType, mCenterClassDtlByTagType, mCenterClassDtlByTagTypeAfter, bClassDtlByTrackingNumberingUnit, bClassDtlByPaymentTerm
 *
 * [referrer-property]
 *     mCenterCustomerList, mParamList, tAllocInstHList, tShippingInstHList, wHtLoadingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMDeliveryCourseDto implements Serializable {

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
    /** DELIVERY_COURSE_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** DELIVERY_COURSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {NotNull, VARCHAR(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_ID: {IX, NotNull, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId;

    /** PICKING_TIME: {VARCHAR(60)} */
    @JsonKey
    protected String _pickingTime;

    /** STOWAGE_TIME: {VARCHAR(60)} */
    @JsonKey
    protected String _stowageTime;

    /** SHIPPING_TIME: {VARCHAR(60)} */
    @JsonKey
    protected String _shippingTime;

    /** CARRIER_SLIP_YMT_ID: {IX, BIGINT(19), FK to m_carrier_slip_ymt} */
    @JsonKey
    protected Long _carrierSlipYmtId;

    /** CARRIER_SLIP_SGW_ID: {IX, BIGINT(19), FK to m_carrier_slip_sgw} */
    @JsonKey
    protected Long _carrierSlipSgwId;

    /** CARRIER_SLIP_YUPK_ID: {IX, BIGINT(19), FK to m_carrier_slip_yupk} */
    @JsonKey
    protected Long _carrierSlipYupkId;

    /** TRACKING_NUMBERING_KEY: {VARCHAR(30)} */
    @JsonKey
    protected String _trackingNumberingKey;

    /** TRACKING_NUMBERING_AFTER_KEY: {VARCHAR(30)} */
    @JsonKey
    protected String _trackingNumberingAfterKey;

    /** TRACKING_NUMBERING_UNIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} */
    @JsonKey
    protected String _trackingNumberingUnit;

    /** TAG_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} */
    @JsonKey
    protected String _tagType;

    /** TAG_TYPE_AFTER: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} */
    @JsonKey
    protected String _tagTypeAfter;

    /** TAG_DATA_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} */
    @JsonKey
    protected String _tagDataType;

    /** PAYMENT_TERM: {VARCHAR(30), FK to B_CLASS_DTL, classification=PaymentTerm} */
    @JsonKey
    protected String _paymentTerm;

    /** CARRIER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierTypeCd;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMDeliveryCourseDto() {
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
    protected MCarrierDto _mCarrier;

    public MCarrierDto getMCarrier() {
        return _mCarrier;
    }

    public void setMCarrier(MCarrierDto mCarrier) {
        this._mCarrier = mCarrier;
    }

    protected MCarrierSlipYupkDto _mCarrierSlipYupk;

    public MCarrierSlipYupkDto getMCarrierSlipYupk() {
        return _mCarrierSlipYupk;
    }

    public void setMCarrierSlipYupk(MCarrierSlipYupkDto mCarrierSlipYupk) {
        this._mCarrierSlipYupk = mCarrierSlipYupk;
    }

    protected MCarrierSlipSgwDto _mCarrierSlipSgw;

    public MCarrierSlipSgwDto getMCarrierSlipSgw() {
        return _mCarrierSlipSgw;
    }

    public void setMCarrierSlipSgw(MCarrierSlipSgwDto mCarrierSlipSgw) {
        this._mCarrierSlipSgw = mCarrierSlipSgw;
    }

    protected MCarrierSlipYmtDto _mCarrierSlipYmt;

    public MCarrierSlipYmtDto getMCarrierSlipYmt() {
        return _mCarrierSlipYmt;
    }

    public void setMCarrierSlipYmt(MCarrierSlipYmtDto mCarrierSlipYmt) {
        this._mCarrierSlipYmt = mCarrierSlipYmt;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByTagDataType;

    public MCenterClassDtlDto getMCenterClassDtlByTagDataType() {
        return _mCenterClassDtlByTagDataType;
    }

    public void setMCenterClassDtlByTagDataType(MCenterClassDtlDto mCenterClassDtlByTagDataType) {
        this._mCenterClassDtlByTagDataType = mCenterClassDtlByTagDataType;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByTagType;

    public MCenterClassDtlDto getMCenterClassDtlByTagType() {
        return _mCenterClassDtlByTagType;
    }

    public void setMCenterClassDtlByTagType(MCenterClassDtlDto mCenterClassDtlByTagType) {
        this._mCenterClassDtlByTagType = mCenterClassDtlByTagType;
    }

    protected MCenterClassDtlDto _mCenterClassDtlByTagTypeAfter;

    public MCenterClassDtlDto getMCenterClassDtlByTagTypeAfter() {
        return _mCenterClassDtlByTagTypeAfter;
    }

    public void setMCenterClassDtlByTagTypeAfter(MCenterClassDtlDto mCenterClassDtlByTagTypeAfter) {
        this._mCenterClassDtlByTagTypeAfter = mCenterClassDtlByTagTypeAfter;
    }

    protected BClassDtlDto _bClassDtlByTrackingNumberingUnit;

    public BClassDtlDto getBClassDtlByTrackingNumberingUnit() {
        return _bClassDtlByTrackingNumberingUnit;
    }

    public void setBClassDtlByTrackingNumberingUnit(BClassDtlDto bClassDtlByTrackingNumberingUnit) {
        this._bClassDtlByTrackingNumberingUnit = bClassDtlByTrackingNumberingUnit;
    }

    protected BClassDtlDto _bClassDtlByPaymentTerm;

    public BClassDtlDto getBClassDtlByPaymentTerm() {
        return _bClassDtlByPaymentTerm;
    }

    public void setBClassDtlByPaymentTerm(BClassDtlDto bClassDtlByPaymentTerm) {
        this._bClassDtlByPaymentTerm = bClassDtlByPaymentTerm;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MCenterCustomerDto> _mCenterCustomerList;

    public List<MCenterCustomerDto> getMCenterCustomerList() {
        if (_mCenterCustomerList == null) { _mCenterCustomerList = new ArrayList<MCenterCustomerDto>(); }
        return _mCenterCustomerList;
    }

    public void setMCenterCustomerList(List<MCenterCustomerDto> mCenterCustomerList) {
        this._mCenterCustomerList = mCenterCustomerList;
    }

    protected List<MParamDto> _mParamList;

    public List<MParamDto> getMParamList() {
        if (_mParamList == null) { _mParamList = new ArrayList<MParamDto>(); }
        return _mParamList;
    }

    public void setMParamList(List<MParamDto> mParamList) {
        this._mParamList = mParamList;
    }

    protected List<TAllocInstHDto> _tAllocInstHList;

    public List<TAllocInstHDto> getTAllocInstHList() {
        if (_tAllocInstHList == null) { _tAllocInstHList = new ArrayList<TAllocInstHDto>(); }
        return _tAllocInstHList;
    }

    public void setTAllocInstHList(List<TAllocInstHDto> tAllocInstHList) {
        this._tAllocInstHList = tAllocInstHList;
    }

    protected List<TShippingInstHDto> _tShippingInstHList;

    public List<TShippingInstHDto> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHList;
    }

    public void setTShippingInstHList(List<TShippingInstHDto> tShippingInstHList) {
        this._tShippingInstHList = tShippingInstHList;
    }

    protected List<WHtLoadingDto> _wHtLoadingList;

    public List<WHtLoadingDto> getWHtLoadingList() {
        if (_wHtLoadingList == null) { _wHtLoadingList = new ArrayList<WHtLoadingDto>(); }
        return _wHtLoadingList;
    }

    public void setWHtLoadingList(List<WHtLoadingDto> wHtLoadingList) {
        this._wHtLoadingList = wHtLoadingList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMDeliveryCourseDto)) { return false; }
        final BsMDeliveryCourseDto otherEntity = (BsMDeliveryCourseDto)other;
        if (!helpComparingValue(getDeliveryCourseId(), otherEntity.getDeliveryCourseId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_delivery_course");
        result = xCH(result, getDeliveryCourseId());
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
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierId());
        sb.append(c).append(getPickingTime());
        sb.append(c).append(getStowageTime());
        sb.append(c).append(getShippingTime());
        sb.append(c).append(getCarrierSlipYmtId());
        sb.append(c).append(getCarrierSlipSgwId());
        sb.append(c).append(getCarrierSlipYupkId());
        sb.append(c).append(getTrackingNumberingKey());
        sb.append(c).append(getTrackingNumberingAfterKey());
        sb.append(c).append(getTrackingNumberingUnit());
        sb.append(c).append(getTagType());
        sb.append(c).append(getTagTypeAfter());
        sb.append(c).append(getTagDataType());
        sb.append(c).append(getPaymentTerm());
        sb.append(c).append(getCarrierTypeCd());
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
     * [get] DELIVERY_COURSE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {NotNull, VARCHAR(60)} <br>
     * 配送コース名称
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {NotNull, VARCHAR(60)} <br>
     * 配送コース名称
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_ID: {IX, NotNull, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public Long getCarrierId() {
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {IX, NotNull, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public void setCarrierId(Long carrierId) {
        __modifiedProperties.add("carrierId");
        this._carrierId = carrierId;
    }

    /**
     * [get] PICKING_TIME: {VARCHAR(60)} <br>
     * 出庫開始時刻
     * @return The value of the column 'PICKING_TIME'. (NullAllowed)
     */
    public String getPickingTime() {
        return _pickingTime;
    }

    /**
     * [set] PICKING_TIME: {VARCHAR(60)} <br>
     * 出庫開始時刻
     * @param pickingTime The value of the column 'PICKING_TIME'. (NullAllowed)
     */
    public void setPickingTime(String pickingTime) {
        __modifiedProperties.add("pickingTime");
        this._pickingTime = pickingTime;
    }

    /**
     * [get] STOWAGE_TIME: {VARCHAR(60)} <br>
     * 積込予定時刻
     * @return The value of the column 'STOWAGE_TIME'. (NullAllowed)
     */
    public String getStowageTime() {
        return _stowageTime;
    }

    /**
     * [set] STOWAGE_TIME: {VARCHAR(60)} <br>
     * 積込予定時刻
     * @param stowageTime The value of the column 'STOWAGE_TIME'. (NullAllowed)
     */
    public void setStowageTime(String stowageTime) {
        __modifiedProperties.add("stowageTime");
        this._stowageTime = stowageTime;
    }

    /**
     * [get] SHIPPING_TIME: {VARCHAR(60)} <br>
     * 出荷予定時刻
     * @return The value of the column 'SHIPPING_TIME'. (NullAllowed)
     */
    public String getShippingTime() {
        return _shippingTime;
    }

    /**
     * [set] SHIPPING_TIME: {VARCHAR(60)} <br>
     * 出荷予定時刻
     * @param shippingTime The value of the column 'SHIPPING_TIME'. (NullAllowed)
     */
    public void setShippingTime(String shippingTime) {
        __modifiedProperties.add("shippingTime");
        this._shippingTime = shippingTime;
    }

    /**
     * [get] CARRIER_SLIP_YMT_ID: {IX, BIGINT(19), FK to m_carrier_slip_ymt} <br>
     * ヤマト送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed)
     */
    public Long getCarrierSlipYmtId() {
        return _carrierSlipYmtId;
    }

    /**
     * [set] CARRIER_SLIP_YMT_ID: {IX, BIGINT(19), FK to m_carrier_slip_ymt} <br>
     * ヤマト送り状定義ID
     * @param carrierSlipYmtId The value of the column 'CARRIER_SLIP_YMT_ID'. (NullAllowed)
     */
    public void setCarrierSlipYmtId(Long carrierSlipYmtId) {
        __modifiedProperties.add("carrierSlipYmtId");
        this._carrierSlipYmtId = carrierSlipYmtId;
    }

    /**
     * [get] CARRIER_SLIP_SGW_ID: {IX, BIGINT(19), FK to m_carrier_slip_sgw} <br>
     * 佐川送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed)
     */
    public Long getCarrierSlipSgwId() {
        return _carrierSlipSgwId;
    }

    /**
     * [set] CARRIER_SLIP_SGW_ID: {IX, BIGINT(19), FK to m_carrier_slip_sgw} <br>
     * 佐川送り状定義ID
     * @param carrierSlipSgwId The value of the column 'CARRIER_SLIP_SGW_ID'. (NullAllowed)
     */
    public void setCarrierSlipSgwId(Long carrierSlipSgwId) {
        __modifiedProperties.add("carrierSlipSgwId");
        this._carrierSlipSgwId = carrierSlipSgwId;
    }

    /**
     * [get] CARRIER_SLIP_YUPK_ID: {IX, BIGINT(19), FK to m_carrier_slip_yupk} <br>
     * ゆうパック送り状定義ID
     * @return The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed)
     */
    public Long getCarrierSlipYupkId() {
        return _carrierSlipYupkId;
    }

    /**
     * [set] CARRIER_SLIP_YUPK_ID: {IX, BIGINT(19), FK to m_carrier_slip_yupk} <br>
     * ゆうパック送り状定義ID
     * @param carrierSlipYupkId The value of the column 'CARRIER_SLIP_YUPK_ID'. (NullAllowed)
     */
    public void setCarrierSlipYupkId(Long carrierSlipYupkId) {
        __modifiedProperties.add("carrierSlipYupkId");
        this._carrierSlipYupkId = carrierSlipYupkId;
    }

    /**
     * [get] TRACKING_NUMBERING_KEY: {VARCHAR(30)} <br>
     * 追跡番号採番キー
     * @return The value of the column 'TRACKING_NUMBERING_KEY'. (NullAllowed)
     */
    public String getTrackingNumberingKey() {
        return _trackingNumberingKey;
    }

    /**
     * [set] TRACKING_NUMBERING_KEY: {VARCHAR(30)} <br>
     * 追跡番号採番キー
     * @param trackingNumberingKey The value of the column 'TRACKING_NUMBERING_KEY'. (NullAllowed)
     */
    public void setTrackingNumberingKey(String trackingNumberingKey) {
        __modifiedProperties.add("trackingNumberingKey");
        this._trackingNumberingKey = trackingNumberingKey;
    }

    /**
     * [get] TRACKING_NUMBERING_AFTER_KEY: {VARCHAR(30)} <br>
     * 追跡番号採番キー(代引時、2枚目以降)
     * @return The value of the column 'TRACKING_NUMBERING_AFTER_KEY'. (NullAllowed)
     */
    public String getTrackingNumberingAfterKey() {
        return _trackingNumberingAfterKey;
    }

    /**
     * [set] TRACKING_NUMBERING_AFTER_KEY: {VARCHAR(30)} <br>
     * 追跡番号採番キー(代引時、2枚目以降)
     * @param trackingNumberingAfterKey The value of the column 'TRACKING_NUMBERING_AFTER_KEY'. (NullAllowed)
     */
    public void setTrackingNumberingAfterKey(String trackingNumberingAfterKey) {
        __modifiedProperties.add("trackingNumberingAfterKey");
        this._trackingNumberingAfterKey = trackingNumberingAfterKey;
    }

    /**
     * [get] TRACKING_NUMBERING_UNIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @return The value of the column 'TRACKING_NUMBERING_UNIT'. (NullAllowed)
     */
    public String getTrackingNumberingUnit() {
        return _trackingNumberingUnit;
    }

    /**
     * [set] TRACKING_NUMBERING_UNIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param trackingNumberingUnit The value of the column 'TRACKING_NUMBERING_UNIT'. (NullAllowed)
     */
    public void setTrackingNumberingUnit(String trackingNumberingUnit) {
        __modifiedProperties.add("trackingNumberingUnit");
        this._trackingNumberingUnit = trackingNumberingUnit;
    }

    /**
     * [get] TAG_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @return The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public String getTagType() {
        return _tagType;
    }

    /**
     * [set] TAG_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param tagType The value of the column 'TAG_TYPE'. (NullAllowed)
     */
    public void setTagType(String tagType) {
        __modifiedProperties.add("tagType");
        this._tagType = tagType;
    }

    /**
     * [get] TAG_TYPE_AFTER: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @return The value of the column 'TAG_TYPE_AFTER'. (NullAllowed)
     */
    public String getTagTypeAfter() {
        return _tagTypeAfter;
    }

    /**
     * [set] TAG_TYPE_AFTER: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param tagTypeAfter The value of the column 'TAG_TYPE_AFTER'. (NullAllowed)
     */
    public void setTagTypeAfter(String tagTypeAfter) {
        __modifiedProperties.add("tagTypeAfter");
        this._tagTypeAfter = tagTypeAfter;
    }

    /**
     * [get] TAG_DATA_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @return The value of the column 'TAG_DATA_TYPE'. (NullAllowed)
     */
    public String getTagDataType() {
        return _tagDataType;
    }

    /**
     * [set] TAG_DATA_TYPE: {VARCHAR(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param tagDataType The value of the column 'TAG_DATA_TYPE'. (NullAllowed)
     */
    public void setTagDataType(String tagDataType) {
        __modifiedProperties.add("tagDataType");
        this._tagDataType = tagDataType;
    }

    /**
     * [get] PAYMENT_TERM: {VARCHAR(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @return The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public String getPaymentTerm() {
        return _paymentTerm;
    }

    /**
     * [set] PAYMENT_TERM: {VARCHAR(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param paymentTerm The value of the column 'PAYMENT_TERM'. (NullAllowed)
     */
    public void setPaymentTerm(String paymentTerm) {
        __modifiedProperties.add("paymentTerm");
        this._paymentTerm = paymentTerm;
    }

    /**
     * [get] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @return The value of the column 'CARRIER_TYPE_CD'. (NullAllowed)
     */
    public String getCarrierTypeCd() {
        return _carrierTypeCd;
    }

    /**
     * [set] CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * 運送会社区分
     * @param carrierTypeCd The value of the column 'CARRIER_TYPE_CD'. (NullAllowed)
     */
    public void setCarrierTypeCd(String carrierTypeCd) {
        __modifiedProperties.add("carrierTypeCd");
        this._carrierTypeCd = carrierTypeCd;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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
