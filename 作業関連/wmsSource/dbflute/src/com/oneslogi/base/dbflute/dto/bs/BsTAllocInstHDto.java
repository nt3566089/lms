package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_alloc_inst_h as TABLE. <br>
 * 引当指示ヘッダ
 * <pre>
 * [primary-key]
 *     ALLOC_INST_H_ID
 *
 * [column]
 *     ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, 共通管理送信済フラグ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client, m_process_type, m_center, m_delivery_course, m_customer, t_picking_h, m_center_customer(ByDelivCustomerId), b_class_dtl(ByDelivTz)
 *
 * [referrer-table]
 *     t_alloc_inst_b, t_packing_h, t_picking_h, t_shipping_inst_h
 *
 * [foreign-property]
 *     mClient, mProcessType, mCenter, mDeliveryCourse, mCustomerBySupplyCustomerId, mCustomerByDelivCustomerId, tPickingH, mCenterCustomerByDelivCustomerId, mCenterCustomerBySupplyCustomerId, bClassDtlByDelivTz
 *
 * [referrer-property]
 *     tAllocInstBList, tPackingHList, tPickingHList, tShippingInstHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTAllocInstHDto implements Serializable {

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
    /** ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} */
    @JsonKey
    protected Long _allocInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} */
    @JsonKey
    protected Long _processTypeId;

    /** SHIPPING_DT: {IX, VARCHAR(8)} */
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

    /** DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} */
    @JsonKey
    protected String _delivTz;

    /** SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _supplyCustomerId;

    /** SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _delivCustomerId;

    /** DELIV_CUSTOMER_CD: {VARCHAR(30)} */
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

    /** DELIV_CUSTOMER_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm;

    /** DELIV_CUSTOMER_NM1: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm1;

    /** DELIV_CUSTOMER_NM2: {VARCHAR(255)} */
    @JsonKey
    protected String _delivCustomerNm2;

    /** DELIV_TEL_NO: {VARCHAR(255)} */
    @JsonKey
    protected String _delivTelNo;

    /** DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} */
    @JsonKey
    protected Long _deliveryCourseId;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(30)} */
    @JsonKey
    protected String _specifyDeliveryTime;

    /** 共通管理送信済フラグ: {CHAR(1)} */
    @JsonKey
    protected String _共通管理送信済フラグ;

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
    public BsTAllocInstHDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MProcessTypeDto _mProcessType;

    public MProcessTypeDto getMProcessType() {
        return _mProcessType;
    }

    public void setMProcessType(MProcessTypeDto mProcessType) {
        this._mProcessType = mProcessType;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MDeliveryCourseDto _mDeliveryCourse;

    public MDeliveryCourseDto getMDeliveryCourse() {
        return _mDeliveryCourse;
    }

    public void setMDeliveryCourse(MDeliveryCourseDto mDeliveryCourse) {
        this._mDeliveryCourse = mDeliveryCourse;
    }

    protected MCustomerDto _mCustomerBySupplyCustomerId;

    public MCustomerDto getMCustomerBySupplyCustomerId() {
        return _mCustomerBySupplyCustomerId;
    }

    public void setMCustomerBySupplyCustomerId(MCustomerDto mCustomerBySupplyCustomerId) {
        this._mCustomerBySupplyCustomerId = mCustomerBySupplyCustomerId;
    }

    protected MCustomerDto _mCustomerByDelivCustomerId;

    public MCustomerDto getMCustomerByDelivCustomerId() {
        return _mCustomerByDelivCustomerId;
    }

    public void setMCustomerByDelivCustomerId(MCustomerDto mCustomerByDelivCustomerId) {
        this._mCustomerByDelivCustomerId = mCustomerByDelivCustomerId;
    }

    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected MCenterCustomerDto _mCenterCustomerByDelivCustomerId;

    public MCenterCustomerDto getMCenterCustomerByDelivCustomerId() {
        return _mCenterCustomerByDelivCustomerId;
    }

    public void setMCenterCustomerByDelivCustomerId(MCenterCustomerDto mCenterCustomerByDelivCustomerId) {
        this._mCenterCustomerByDelivCustomerId = mCenterCustomerByDelivCustomerId;
    }

    protected MCenterCustomerDto _mCenterCustomerBySupplyCustomerId;

    public MCenterCustomerDto getMCenterCustomerBySupplyCustomerId() {
        return _mCenterCustomerBySupplyCustomerId;
    }

    public void setMCenterCustomerBySupplyCustomerId(MCenterCustomerDto mCenterCustomerBySupplyCustomerId) {
        this._mCenterCustomerBySupplyCustomerId = mCenterCustomerBySupplyCustomerId;
    }

    protected BClassDtlDto _bClassDtlByDelivTz;

    public BClassDtlDto getBClassDtlByDelivTz() {
        return _bClassDtlByDelivTz;
    }

    public void setBClassDtlByDelivTz(BClassDtlDto bClassDtlByDelivTz) {
        this._bClassDtlByDelivTz = bClassDtlByDelivTz;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TAllocInstBDto> _tAllocInstBList;

    public List<TAllocInstBDto> getTAllocInstBList() {
        if (_tAllocInstBList == null) { _tAllocInstBList = new ArrayList<TAllocInstBDto>(); }
        return _tAllocInstBList;
    }

    public void setTAllocInstBList(List<TAllocInstBDto> tAllocInstBList) {
        this._tAllocInstBList = tAllocInstBList;
    }

    protected List<TPackingHDto> _tPackingHList;

    public List<TPackingHDto> getTPackingHList() {
        if (_tPackingHList == null) { _tPackingHList = new ArrayList<TPackingHDto>(); }
        return _tPackingHList;
    }

    public void setTPackingHList(List<TPackingHDto> tPackingHList) {
        this._tPackingHList = tPackingHList;
    }

    protected List<TPickingHDto> _tPickingHList;

    public List<TPickingHDto> getTPickingHList() {
        if (_tPickingHList == null) { _tPickingHList = new ArrayList<TPickingHDto>(); }
        return _tPickingHList;
    }

    public void setTPickingHList(List<TPickingHDto> tPickingHList) {
        this._tPickingHList = tPickingHList;
    }

    protected List<TShippingInstHDto> _tShippingInstHList;

    public List<TShippingInstHDto> getTShippingInstHList() {
        if (_tShippingInstHList == null) { _tShippingInstHList = new ArrayList<TShippingInstHDto>(); }
        return _tShippingInstHList;
    }

    public void setTShippingInstHList(List<TShippingInstHDto> tShippingInstHList) {
        this._tShippingInstHList = tShippingInstHList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTAllocInstHDto)) { return false; }
        final BsTAllocInstHDto otherEntity = (BsTAllocInstHDto)other;
        if (!helpComparingValue(getAllocInstHId(), otherEntity.getAllocInstHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_alloc_inst_h");
        result = xCH(result, getAllocInstHId());
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
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivPlanDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getDelivTz());
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
        sb.append(c).append(getDelivCustomerNm());
        sb.append(c).append(getDelivCustomerNm1());
        sb.append(c).append(getDelivCustomerNm2());
        sb.append(c).append(getDelivTelNo());
        sb.append(c).append(getDeliveryCourseId());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo2());
        sb.append(c).append(getSpecifyDeliveryDt());
        sb.append(c).append(getSpecifyDeliveryTime());
        sb.append(c).append(get共通管理送信済フラグ());
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
     * [get] ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] SHIPPING_DT: {IX, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {IX, VARCHAR(8)} <br>
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
     * [get] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @return The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public String getDelivTz() {
        return _delivTz;
    }

    /**
     * [set] DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param delivTz The value of the column 'DELIV_TZ'. (NullAllowed)
     */
    public void setDelivTz(String delivTz) {
        __modifiedProperties.add("delivTz");
        this._delivTz = delivTz;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 納品先ID
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getSupplyCustomerId() {
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
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
     * [get] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @return The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public Long getDelivCustomerId() {
        return _delivCustomerId;
    }

    /**
     * [set] DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 届先ID
     * @param delivCustomerId The value of the column 'DELIV_CUSTOMER_ID'. (NullAllowed)
     */
    public void setDelivCustomerId(Long delivCustomerId) {
        __modifiedProperties.add("delivCustomerId");
        this._delivCustomerId = delivCustomerId;
    }

    /**
     * [get] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * 届先CD
     * @return The value of the column 'DELIV_CUSTOMER_CD'. (NullAllowed)
     */
    public String getDelivCustomerCd() {
        return _delivCustomerCd;
    }

    /**
     * [set] DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
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
     * [get] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @return The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public String getDelivCustomerNm() {
        return _delivCustomerNm;
    }

    /**
     * [set] DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * 届先名称
     * @param delivCustomerNm The value of the column 'DELIV_CUSTOMER_NM'. (NullAllowed)
     */
    public void setDelivCustomerNm(String delivCustomerNm) {
        __modifiedProperties.add("delivCustomerNm");
        this._delivCustomerNm = delivCustomerNm;
    }

    /**
     * [get] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @return The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public String getDelivCustomerNm1() {
        return _delivCustomerNm1;
    }

    /**
     * [set] DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * 届先名称1
     * @param delivCustomerNm1 The value of the column 'DELIV_CUSTOMER_NM1'. (NullAllowed)
     */
    public void setDelivCustomerNm1(String delivCustomerNm1) {
        __modifiedProperties.add("delivCustomerNm1");
        this._delivCustomerNm1 = delivCustomerNm1;
    }

    /**
     * [get] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @return The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public String getDelivCustomerNm2() {
        return _delivCustomerNm2;
    }

    /**
     * [set] DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * 届先名称2
     * @param delivCustomerNm2 The value of the column 'DELIV_CUSTOMER_NM2'. (NullAllowed)
     */
    public void setDelivCustomerNm2(String delivCustomerNm2) {
        __modifiedProperties.add("delivCustomerNm2");
        this._delivCustomerNm2 = delivCustomerNm2;
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
     * [get] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @return The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public Long getDeliveryCourseId() {
        return _deliveryCourseId;
    }

    /**
     * [set] DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course} <br>
     * 配送コースID
     * @param deliveryCourseId The value of the column 'DELIVERY_COURSE_ID'. (NullAllowed)
     */
    public void setDeliveryCourseId(Long deliveryCourseId) {
        __modifiedProperties.add("deliveryCourseId");
        this._deliveryCourseId = deliveryCourseId;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo() {
        return _daihyoNizoroeNo;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        __modifiedProperties.add("daihyoNizoroeNo");
        this._daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public String getNizoroeNo2() {
        return _nizoroeNo2;
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        __modifiedProperties.add("nizoroeNo2");
        this._nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public String getSpecifyDeliveryDt() {
        return _specifyDeliveryDt;
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @param specifyDeliveryDt The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
        __modifiedProperties.add("specifyDeliveryDt");
        this._specifyDeliveryDt = specifyDeliveryDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public String getSpecifyDeliveryTime() {
        return _specifyDeliveryTime;
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        __modifiedProperties.add("specifyDeliveryTime");
        this._specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] 共通管理送信済フラグ: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @return The value of the column '共通管理送信済フラグ'. (NullAllowed)
     */
    public String get共通管理送信済フラグ() {
        return _共通管理送信済フラグ;
    }

    /**
     * [set] 共通管理送信済フラグ: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @param 共通管理送信済フラグ The value of the column '共通管理送信済フラグ'. (NullAllowed)
     */
    public void set共通管理送信済フラグ(String 共通管理送信済フラグ) {
        __modifiedProperties.add("共通管理送信済フラグ");
        this._共通管理送信済フラグ = 共通管理送信済フラグ;
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
