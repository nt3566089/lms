package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_carrier as TABLE. <br>
 * センタ運送業者マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, LARGE_ITEM_HADLING_FLG, HEAVY_ITEM_HADLING_FLG, HOLIDAY_CARRIER_FLG, OKINAWA_FLIGHT_FLG, BASE_DEFAULT_CARRIER_FLG, INSURANCE_CARRIER_CD, SLIP_TYPE_CD, BASE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, m_common_carrier, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     m_base_sales_org, m_carrier_box, m_carrier_decision, m_delivery_course, m_koguchi_delivery
 *
 * [foreign-property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mBaseSalesOrgList, mCarrierBoxList, mCarrierDecisionByCarrierId2List, mCarrierDecisionByCarrierId1List, mCarrierDecisionByCarrierId3List, mCarrierDecisionByCarrierIdList, mDeliveryCourseList, mKoguchiDeliveryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierDto implements Serializable {

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
    /** CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _carrierId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} */
    @JsonKey
    protected Long _commonCarrierId;

    /** CARRIER_CD: {+UQ, IX, VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierNm;

    /** CARRIER_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierAbbr;

    /** LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _largeItemHadlingFlg;

    /** HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _heavyItemHadlingFlg;

    /** HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _holidayCarrierFlg;

    /** OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _okinawaFlightFlg;

    /** BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _baseDefaultCarrierFlg;

    /** INSURANCE_CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _insuranceCarrierCd;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipTypeCd;

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

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
    public BsMCarrierDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MCommonCarrierDto _mCommonCarrier;

    public MCommonCarrierDto getMCommonCarrier() {
        return _mCommonCarrier;
    }

    public void setMCommonCarrier(MCommonCarrierDto mCommonCarrier) {
        this._mCommonCarrier = mCommonCarrier;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MBaseSalesOrgDto> _mBaseSalesOrgList;

    public List<MBaseSalesOrgDto> getMBaseSalesOrgList() {
        if (_mBaseSalesOrgList == null) { _mBaseSalesOrgList = new ArrayList<MBaseSalesOrgDto>(); }
        return _mBaseSalesOrgList;
    }

    public void setMBaseSalesOrgList(List<MBaseSalesOrgDto> mBaseSalesOrgList) {
        this._mBaseSalesOrgList = mBaseSalesOrgList;
    }

    protected List<MCarrierBoxDto> _mCarrierBoxList;

    public List<MCarrierBoxDto> getMCarrierBoxList() {
        if (_mCarrierBoxList == null) { _mCarrierBoxList = new ArrayList<MCarrierBoxDto>(); }
        return _mCarrierBoxList;
    }

    public void setMCarrierBoxList(List<MCarrierBoxDto> mCarrierBoxList) {
        this._mCarrierBoxList = mCarrierBoxList;
    }

    protected List<MCarrierDecisionDto> _mCarrierDecisionByCarrierId2List;

    public List<MCarrierDecisionDto> getMCarrierDecisionByCarrierId2List() {
        if (_mCarrierDecisionByCarrierId2List == null) { _mCarrierDecisionByCarrierId2List = new ArrayList<MCarrierDecisionDto>(); }
        return _mCarrierDecisionByCarrierId2List;
    }

    public void setMCarrierDecisionByCarrierId2List(List<MCarrierDecisionDto> mCarrierDecisionByCarrierId2List) {
        this._mCarrierDecisionByCarrierId2List = mCarrierDecisionByCarrierId2List;
    }

    protected List<MCarrierDecisionDto> _mCarrierDecisionByCarrierId1List;

    public List<MCarrierDecisionDto> getMCarrierDecisionByCarrierId1List() {
        if (_mCarrierDecisionByCarrierId1List == null) { _mCarrierDecisionByCarrierId1List = new ArrayList<MCarrierDecisionDto>(); }
        return _mCarrierDecisionByCarrierId1List;
    }

    public void setMCarrierDecisionByCarrierId1List(List<MCarrierDecisionDto> mCarrierDecisionByCarrierId1List) {
        this._mCarrierDecisionByCarrierId1List = mCarrierDecisionByCarrierId1List;
    }

    protected List<MCarrierDecisionDto> _mCarrierDecisionByCarrierId3List;

    public List<MCarrierDecisionDto> getMCarrierDecisionByCarrierId3List() {
        if (_mCarrierDecisionByCarrierId3List == null) { _mCarrierDecisionByCarrierId3List = new ArrayList<MCarrierDecisionDto>(); }
        return _mCarrierDecisionByCarrierId3List;
    }

    public void setMCarrierDecisionByCarrierId3List(List<MCarrierDecisionDto> mCarrierDecisionByCarrierId3List) {
        this._mCarrierDecisionByCarrierId3List = mCarrierDecisionByCarrierId3List;
    }

    protected List<MCarrierDecisionDto> _mCarrierDecisionByCarrierIdList;

    public List<MCarrierDecisionDto> getMCarrierDecisionByCarrierIdList() {
        if (_mCarrierDecisionByCarrierIdList == null) { _mCarrierDecisionByCarrierIdList = new ArrayList<MCarrierDecisionDto>(); }
        return _mCarrierDecisionByCarrierIdList;
    }

    public void setMCarrierDecisionByCarrierIdList(List<MCarrierDecisionDto> mCarrierDecisionByCarrierIdList) {
        this._mCarrierDecisionByCarrierIdList = mCarrierDecisionByCarrierIdList;
    }

    protected List<MDeliveryCourseDto> _mDeliveryCourseList;

    public List<MDeliveryCourseDto> getMDeliveryCourseList() {
        if (_mDeliveryCourseList == null) { _mDeliveryCourseList = new ArrayList<MDeliveryCourseDto>(); }
        return _mDeliveryCourseList;
    }

    public void setMDeliveryCourseList(List<MDeliveryCourseDto> mDeliveryCourseList) {
        this._mDeliveryCourseList = mDeliveryCourseList;
    }

    protected List<MKoguchiDeliveryDto> _mKoguchiDeliveryList;

    public List<MKoguchiDeliveryDto> getMKoguchiDeliveryList() {
        if (_mKoguchiDeliveryList == null) { _mKoguchiDeliveryList = new ArrayList<MKoguchiDeliveryDto>(); }
        return _mKoguchiDeliveryList;
    }

    public void setMKoguchiDeliveryList(List<MKoguchiDeliveryDto> mKoguchiDeliveryList) {
        this._mKoguchiDeliveryList = mKoguchiDeliveryList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCarrierDto)) { return false; }
        final BsMCarrierDto otherEntity = (BsMCarrierDto)other;
        if (!helpComparingValue(getCarrierId(), otherEntity.getCarrierId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_carrier");
        result = xCH(result, getCarrierId());
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
        sb.append(c).append(getCarrierId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCommonCarrierId());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getCarrierAbbr());
        sb.append(c).append(getLargeItemHadlingFlg());
        sb.append(c).append(getHeavyItemHadlingFlg());
        sb.append(c).append(getHolidayCarrierFlg());
        sb.append(c).append(getOkinawaFlightFlg());
        sb.append(c).append(getBaseDefaultCarrierFlg());
        sb.append(c).append(getInsuranceCarrierCd());
        sb.append(c).append(getSlipTypeCd());
        sb.append(c).append(getBaseCd());
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
     * [get] CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public Long getCarrierId() {
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public void setCarrierId(Long carrierId) {
        __modifiedProperties.add("carrierId");
        this._carrierId = carrierId;
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
     * [get] COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} <br>
     * 共通運送業者ID
     * @return The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public Long getCommonCarrierId() {
        return _commonCarrierId;
    }

    /**
     * [set] COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier} <br>
     * 共通運送業者ID
     * @param commonCarrierId The value of the column 'COMMON_CARRIER_ID'. (NullAllowed)
     */
    public void setCommonCarrierId(Long commonCarrierId) {
        __modifiedProperties.add("commonCarrierId");
        this._commonCarrierId = commonCarrierId;
    }

    /**
     * [get] CARRIER_CD: {+UQ, IX, VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {+UQ, IX, VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送業者名称
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送業者名称
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] CARRIER_ABBR: {VARCHAR(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public String getCarrierAbbr() {
        return _carrierAbbr;
    }

    /**
     * [set] CARRIER_ABBR: {VARCHAR(60)} <br>
     * 運送業者略称
     * @param carrierAbbr The value of the column 'CARRIER_ABBR'. (NullAllowed)
     */
    public void setCarrierAbbr(String carrierAbbr) {
        __modifiedProperties.add("carrierAbbr");
        this._carrierAbbr = carrierAbbr;
    }

    /**
     * [get] LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 大物取扱フラグ
     * @return The value of the column 'LARGE_ITEM_HADLING_FLG'. (NullAllowed)
     */
    public String getLargeItemHadlingFlg() {
        return _largeItemHadlingFlg;
    }

    /**
     * [set] LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 大物取扱フラグ
     * @param largeItemHadlingFlg The value of the column 'LARGE_ITEM_HADLING_FLG'. (NullAllowed)
     */
    public void setLargeItemHadlingFlg(String largeItemHadlingFlg) {
        __modifiedProperties.add("largeItemHadlingFlg");
        this._largeItemHadlingFlg = largeItemHadlingFlg;
    }

    /**
     * [get] HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 重量取扱フラグ
     * @return The value of the column 'HEAVY_ITEM_HADLING_FLG'. (NullAllowed)
     */
    public String getHeavyItemHadlingFlg() {
        return _heavyItemHadlingFlg;
    }

    /**
     * [set] HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 重量取扱フラグ
     * @param heavyItemHadlingFlg The value of the column 'HEAVY_ITEM_HADLING_FLG'. (NullAllowed)
     */
    public void setHeavyItemHadlingFlg(String heavyItemHadlingFlg) {
        __modifiedProperties.add("heavyItemHadlingFlg");
        this._heavyItemHadlingFlg = heavyItemHadlingFlg;
    }

    /**
     * [get] HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 休日振替運送業者フラグ
     * @return The value of the column 'HOLIDAY_CARRIER_FLG'. (NullAllowed)
     */
    public String getHolidayCarrierFlg() {
        return _holidayCarrierFlg;
    }

    /**
     * [set] HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 休日振替運送業者フラグ
     * @param holidayCarrierFlg The value of the column 'HOLIDAY_CARRIER_FLG'. (NullAllowed)
     */
    public void setHolidayCarrierFlg(String holidayCarrierFlg) {
        __modifiedProperties.add("holidayCarrierFlg");
        this._holidayCarrierFlg = holidayCarrierFlg;
    }

    /**
     * [get] OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 沖縄航空便振替フラグ
     * @return The value of the column 'OKINAWA_FLIGHT_FLG'. (NullAllowed)
     */
    public String getOkinawaFlightFlg() {
        return _okinawaFlightFlg;
    }

    /**
     * [set] OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 沖縄航空便振替フラグ
     * @param okinawaFlightFlg The value of the column 'OKINAWA_FLIGHT_FLG'. (NullAllowed)
     */
    public void setOkinawaFlightFlg(String okinawaFlightFlg) {
        __modifiedProperties.add("okinawaFlightFlg");
        this._okinawaFlightFlg = okinawaFlightFlg;
    }

    /**
     * [get] BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 拠点デフォルト運送業者フラグ
     * @return The value of the column 'BASE_DEFAULT_CARRIER_FLG'. (NullAllowed)
     */
    public String getBaseDefaultCarrierFlg() {
        return _baseDefaultCarrierFlg;
    }

    /**
     * [set] BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 拠点デフォルト運送業者フラグ
     * @param baseDefaultCarrierFlg The value of the column 'BASE_DEFAULT_CARRIER_FLG'. (NullAllowed)
     */
    public void setBaseDefaultCarrierFlg(String baseDefaultCarrierFlg) {
        __modifiedProperties.add("baseDefaultCarrierFlg");
        this._baseDefaultCarrierFlg = baseDefaultCarrierFlg;
    }

    /**
     * [get] INSURANCE_CARRIER_CD: {VARCHAR(30)} <br>
     * 保険品振替業者CD
     * @return The value of the column 'INSURANCE_CARRIER_CD'. (NullAllowed)
     */
    public String getInsuranceCarrierCd() {
        return _insuranceCarrierCd;
    }

    /**
     * [set] INSURANCE_CARRIER_CD: {VARCHAR(30)} <br>
     * 保険品振替業者CD
     * @param insuranceCarrierCd The value of the column 'INSURANCE_CARRIER_CD'. (NullAllowed)
     */
    public void setInsuranceCarrierCd(String insuranceCarrierCd) {
        __modifiedProperties.add("insuranceCarrierCd");
        this._insuranceCarrierCd = insuranceCarrierCd;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受渡表区分
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSlipTypeCd() {
        return _slipTypeCd;
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受渡表区分
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        __modifiedProperties.add("slipTypeCd");
        this._slipTypeCd = slipTypeCd;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed)
     */
    public String getBaseCd() {
        return _baseCd;
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed)
     */
    public void setBaseCd(String baseCd) {
        __modifiedProperties.add("baseCd");
        this._baseCd = baseCd;
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
