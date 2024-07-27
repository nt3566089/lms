package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_receive_plan_h as TABLE. <br>
 * 入荷予定ヘッダ
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, SAP_RECEIVE_SLIP_NO, SLIP_TYPE_ID, SLIP_TYPE_CD, PURCHASE_ORDER_NO, RECEIVE_REASON_CD, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DT, PLANT_CD, STORAGE_SPACE_CD, TENHANSHA_CD, SALES_ORG_ID, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, CUSTOMER_ORDER_NO, SAP_VENDER_CD, SAP_SUPPLIER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, SANSHA_TYPE_CD, RECEIVE_REASON_NM, MOD_TYPE_CD, IF_ID, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, m_customer, m_client, m_process_type, t_picking_h, t_receive_plan_h, m_stock_type, b_class_dtl(ByCenterTransitFlg), t_receive_plan_r(AsOne)
 *
 * [referrer-table]
 *     t_receive_plan_b, t_receive_plan_h, t_store_record_h, t_receive_plan_r
 *
 * [foreign-property]
 *     mCenter, mCustomerByPlanSupplierId, mClient, mProcessType, tPickingH, tReceivePlanHSelf, mStockType, mCustomerByPlanDepositId, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne
 *
 * [referrer-property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceivePlanHDto implements Serializable {

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
    /** RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receivePlanHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} */
    @JsonKey
    protected Long _processTypeId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _receivePlanDt;

    /** PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _planClientReceiveNo;

    /** RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _receiveSlipNo;

    /** PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _planSupplierId;

    /** PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _planSupplierCd;

    /** PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _planDepositId;

    /** PLAN_DEPOSIT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _planDepositCd;

    /** RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} */
    @JsonKey
    protected String _receiveStatus;

    /** INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} */
    @JsonKey
    protected String _receiveDeliveryStatus;

    /** OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} */
    @JsonKey
    protected Long _oldReceivePlanHId;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} */
    @JsonKey
    protected String _centerTransitFlg;

    /** PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} */
    @JsonKey
    protected Long _pickingHId;

    /** SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _sapReceiveSlipNo;

    /** SLIP_TYPE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _slipTypeId;

    /** SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _slipTypeCd;

    /** PURCHASE_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _purchaseOrderNo;

    /** RECEIVE_REASON_CD: {VARCHAR(255)} */
    @JsonKey
    protected String _receiveReasonCd;

    /** ORDER_DATE: {VARCHAR(8)} */
    @JsonKey
    protected String _orderDate;

    /** ORDER_TIME: {VARCHAR(6)} */
    @JsonKey
    protected String _orderTime;

    /** CONFIRMED_DELIVERY_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _confirmedDeliveryDt;

    /** PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storageSpaceCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** SALES_ORG_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _salesOrgId;

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

    /** CUSTOMER_ORDER_NO: {VARCHAR(100)} */
    @JsonKey
    protected String _customerOrderNo;

    /** SAP_VENDER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapVenderCd;

    /** SAP_SUPPLIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapSupplierCd;

    /** TODAY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _todayFlg;

    /** SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} */
    @JsonKey
    protected String _sanshaDeliverySlipNo1;

    /** DATA_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTypeCd;

    /** SANSHA_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sanshaTypeCd;

    /** RECEIVE_REASON_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _receiveReasonNm;

    /** MOD_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _modTypeCd;

    /** IF_ID: {VARCHAR(30)} */
    @JsonKey
    protected String _ifId;

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
    public BsTReceivePlanHDto() {
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

    protected MCustomerDto _mCustomerByPlanSupplierId;

    public MCustomerDto getMCustomerByPlanSupplierId() {
        return _mCustomerByPlanSupplierId;
    }

    public void setMCustomerByPlanSupplierId(MCustomerDto mCustomerByPlanSupplierId) {
        this._mCustomerByPlanSupplierId = mCustomerByPlanSupplierId;
    }

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

    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected TReceivePlanHDto _tReceivePlanHSelf;

    public TReceivePlanHDto getTReceivePlanHSelf() {
        return _tReceivePlanHSelf;
    }

    public void setTReceivePlanHSelf(TReceivePlanHDto tReceivePlanHSelf) {
        this._tReceivePlanHSelf = tReceivePlanHSelf;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected MCustomerDto _mCustomerByPlanDepositId;

    public MCustomerDto getMCustomerByPlanDepositId() {
        return _mCustomerByPlanDepositId;
    }

    public void setMCustomerByPlanDepositId(MCustomerDto mCustomerByPlanDepositId) {
        this._mCustomerByPlanDepositId = mCustomerByPlanDepositId;
    }

    protected BClassDtlDto _bClassDtlByCenterTransitFlg;

    public BClassDtlDto getBClassDtlByCenterTransitFlg() {
        return _bClassDtlByCenterTransitFlg;
    }

    public void setBClassDtlByCenterTransitFlg(BClassDtlDto bClassDtlByCenterTransitFlg) {
        this._bClassDtlByCenterTransitFlg = bClassDtlByCenterTransitFlg;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByReceiveDeliveryStatus;

    public BClassDtlDto getBClassDtlByReceiveDeliveryStatus() {
        return _bClassDtlByReceiveDeliveryStatus;
    }

    public void setBClassDtlByReceiveDeliveryStatus(BClassDtlDto bClassDtlByReceiveDeliveryStatus) {
        this._bClassDtlByReceiveDeliveryStatus = bClassDtlByReceiveDeliveryStatus;
    }

    protected BClassDtlDto _bClassDtlByReceiveStatus;

    public BClassDtlDto getBClassDtlByReceiveStatus() {
        return _bClassDtlByReceiveStatus;
    }

    public void setBClassDtlByReceiveStatus(BClassDtlDto bClassDtlByReceiveStatus) {
        this._bClassDtlByReceiveStatus = bClassDtlByReceiveStatus;
    }

    protected TReceivePlanRDto _tReceivePlanRAsOne;

    public TReceivePlanRDto getTReceivePlanRAsOne() {
        return _tReceivePlanRAsOne;
    }

    public void setTReceivePlanRAsOne(TReceivePlanRDto TReceivePlanRAsOne) {
        this._tReceivePlanRAsOne = TReceivePlanRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TReceivePlanBDto> _tReceivePlanBList;

    public List<TReceivePlanBDto> getTReceivePlanBList() {
        if (_tReceivePlanBList == null) { _tReceivePlanBList = new ArrayList<TReceivePlanBDto>(); }
        return _tReceivePlanBList;
    }

    public void setTReceivePlanBList(List<TReceivePlanBDto> tReceivePlanBList) {
        this._tReceivePlanBList = tReceivePlanBList;
    }

    protected List<TReceivePlanHDto> _tReceivePlanHSelfList;

    public List<TReceivePlanHDto> getTReceivePlanHSelfList() {
        if (_tReceivePlanHSelfList == null) { _tReceivePlanHSelfList = new ArrayList<TReceivePlanHDto>(); }
        return _tReceivePlanHSelfList;
    }

    public void setTReceivePlanHSelfList(List<TReceivePlanHDto> tReceivePlanHSelfList) {
        this._tReceivePlanHSelfList = tReceivePlanHSelfList;
    }

    protected List<TStoreRecordHDto> _tStoreRecordHList;

    public List<TStoreRecordHDto> getTStoreRecordHList() {
        if (_tStoreRecordHList == null) { _tStoreRecordHList = new ArrayList<TStoreRecordHDto>(); }
        return _tStoreRecordHList;
    }

    public void setTStoreRecordHList(List<TStoreRecordHDto> tStoreRecordHList) {
        this._tStoreRecordHList = tStoreRecordHList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTReceivePlanHDto)) { return false; }
        final BsTReceivePlanHDto otherEntity = (BsTReceivePlanHDto)other;
        if (!helpComparingValue(getReceivePlanHId(), otherEntity.getReceivePlanHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_receive_plan_h");
        result = xCH(result, getReceivePlanHId());
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
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getReceivePlanDt());
        sb.append(c).append(getPlanClientReceiveNo());
        sb.append(c).append(getReceiveSlipNo());
        sb.append(c).append(getPlanSupplierId());
        sb.append(c).append(getPlanSupplierCd());
        sb.append(c).append(getPlanDepositId());
        sb.append(c).append(getPlanDepositCd());
        sb.append(c).append(getReceiveStatus());
        sb.append(c).append(getInputType());
        sb.append(c).append(getReceiveDeliveryStatus());
        sb.append(c).append(getOldReceivePlanHId());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getCenterTransitFlg());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getSapReceiveSlipNo());
        sb.append(c).append(getSlipTypeId());
        sb.append(c).append(getSlipTypeCd());
        sb.append(c).append(getPurchaseOrderNo());
        sb.append(c).append(getReceiveReasonCd());
        sb.append(c).append(getOrderDate());
        sb.append(c).append(getOrderTime());
        sb.append(c).append(getConfirmedDeliveryDt());
        sb.append(c).append(getPlantCd());
        sb.append(c).append(getStorageSpaceCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getTenhanshaNm1());
        sb.append(c).append(getTenhanshaNm2());
        sb.append(c).append(getSapUserCd());
        sb.append(c).append(getSapUserNm());
        sb.append(c).append(getCustomerOrderNo());
        sb.append(c).append(getSapVenderCd());
        sb.append(c).append(getSapSupplierCd());
        sb.append(c).append(getTodayFlg());
        sb.append(c).append(getSanshaDeliverySlipNo1());
        sb.append(c).append(getDataTypeCd());
        sb.append(c).append(getSanshaTypeCd());
        sb.append(c).append(getReceiveReasonNm());
        sb.append(c).append(getModTypeCd());
        sb.append(c).append(getIfId());
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
     * [get] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷予定ヘッダID
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        __modifiedProperties.add("receivePlanHId");
        this._receivePlanHId = receivePlanHId;
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
     * [get] PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入荷予定日
     * @return The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public String getReceivePlanDt() {
        return _receivePlanDt;
    }

    /**
     * [set] RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入荷予定日
     * @param receivePlanDt The value of the column 'RECEIVE_PLAN_DT'. (NullAllowed)
     */
    public void setReceivePlanDt(String receivePlanDt) {
        __modifiedProperties.add("receivePlanDt");
        this._receivePlanDt = receivePlanDt;
    }

    /**
     * [get] PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客入荷指示No.
     * @return The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getPlanClientReceiveNo() {
        return _planClientReceiveNo;
    }

    /**
     * [set] PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 予定顧客入荷指示No.
     * @param planClientReceiveNo The value of the column 'PLAN_CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setPlanClientReceiveNo(String planClientReceiveNo) {
        __modifiedProperties.add("planClientReceiveNo");
        this._planClientReceiveNo = planClientReceiveNo;
    }

    /**
     * [get] RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} <br>
     * WMS入荷伝票No.
     * @return The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public String getReceiveSlipNo() {
        return _receiveSlipNo;
    }

    /**
     * [set] RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} <br>
     * WMS入荷伝票No.
     * @param receiveSlipNo The value of the column 'RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public void setReceiveSlipNo(String receiveSlipNo) {
        __modifiedProperties.add("receiveSlipNo");
        this._receiveSlipNo = receiveSlipNo;
    }

    /**
     * [get] PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定仕入先ID
     * @return The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed)
     */
    public Long getPlanSupplierId() {
        return _planSupplierId;
    }

    /**
     * [set] PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定仕入先ID
     * @param planSupplierId The value of the column 'PLAN_SUPPLIER_ID'. (NullAllowed)
     */
    public void setPlanSupplierId(Long planSupplierId) {
        __modifiedProperties.add("planSupplierId");
        this._planSupplierId = planSupplierId;
    }

    /**
     * [get] PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} <br>
     * 予定仕入先CD
     * @return The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public String getPlanSupplierCd() {
        return _planSupplierCd;
    }

    /**
     * [set] PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} <br>
     * 予定仕入先CD
     * @param planSupplierCd The value of the column 'PLAN_SUPPLIER_CD'. (NullAllowed)
     */
    public void setPlanSupplierCd(String planSupplierCd) {
        __modifiedProperties.add("planSupplierCd");
        this._planSupplierCd = planSupplierCd;
    }

    /**
     * [get] PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定預託ID
     * @return The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed)
     */
    public Long getPlanDepositId() {
        return _planDepositId;
    }

    /**
     * [set] PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 予定預託ID
     * @param planDepositId The value of the column 'PLAN_DEPOSIT_ID'. (NullAllowed)
     */
    public void setPlanDepositId(Long planDepositId) {
        __modifiedProperties.add("planDepositId");
        this._planDepositId = planDepositId;
    }

    /**
     * [get] PLAN_DEPOSIT_CD: {VARCHAR(30)} <br>
     * 予定預託CD
     * @return The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public String getPlanDepositCd() {
        return _planDepositCd;
    }

    /**
     * [set] PLAN_DEPOSIT_CD: {VARCHAR(30)} <br>
     * 予定預託CD
     * @param planDepositCd The value of the column 'PLAN_DEPOSIT_CD'. (NullAllowed)
     */
    public void setPlanDepositCd(String planDepositCd) {
        __modifiedProperties.add("planDepositCd");
        this._planDepositCd = planDepositCd;
    }

    /**
     * [get] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @return The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public String getReceiveStatus() {
        return _receiveStatus;
    }

    /**
     * [set] RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param receiveStatus The value of the column 'RECEIVE_STATUS'. (NullAllowed)
     */
    public void setReceiveStatus(String receiveStatus) {
        __modifiedProperties.add("receiveStatus");
        this._receiveStatus = receiveStatus;
    }

    /**
     * [get] INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @return The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed)
     */
    public String getReceiveDeliveryStatus() {
        return _receiveDeliveryStatus;
    }

    /**
     * [set] RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param receiveDeliveryStatus The value of the column 'RECEIVE_DELIVERY_STATUS'. (NullAllowed)
     */
    public void setReceiveDeliveryStatus(String receiveDeliveryStatus) {
        __modifiedProperties.add("receiveDeliveryStatus");
        this._receiveDeliveryStatus = receiveDeliveryStatus;
    }

    /**
     * [get] OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} <br>
     * 元入荷予定ヘッダID
     * @return The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getOldReceivePlanHId() {
        return _oldReceivePlanHId;
    }

    /**
     * [set] OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h} <br>
     * 元入荷予定ヘッダID
     * @param oldReceivePlanHId The value of the column 'OLD_RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public void setOldReceivePlanHId(Long oldReceivePlanHId) {
        __modifiedProperties.add("oldReceivePlanHId");
        this._oldReceivePlanHId = oldReceivePlanHId;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
     * [get] CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @return The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public String getCenterTransitFlg() {
        return _centerTransitFlg;
    }

    /**
     * [set] CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param centerTransitFlg The value of the column 'CENTER_TRANSIT_FLG'. (NullAllowed)
     */
    public void setCenterTransitFlg(String centerTransitFlg) {
        __modifiedProperties.add("centerTransitFlg");
        this._centerTransitFlg = centerTransitFlg;
    }

    /**
     * [get] PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} <br>
     * センタ間移動出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h} <br>
     * センタ間移動出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'SAP_RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public String getSapReceiveSlipNo() {
        return _sapReceiveSlipNo;
    }

    /**
     * [set] SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param sapReceiveSlipNo The value of the column 'SAP_RECEIVE_SLIP_NO'. (NullAllowed)
     */
    public void setSapReceiveSlipNo(String sapReceiveSlipNo) {
        __modifiedProperties.add("sapReceiveSlipNo");
        this._sapReceiveSlipNo = sapReceiveSlipNo;
    }

    /**
     * [get] SLIP_TYPE_ID: {BIGINT(19)} <br>
     * 伝票種別ID
     * @return The value of the column 'SLIP_TYPE_ID'. (NullAllowed)
     */
    public Long getSlipTypeId() {
        return _slipTypeId;
    }

    /**
     * [set] SLIP_TYPE_ID: {BIGINT(19)} <br>
     * 伝票種別ID
     * @param slipTypeId The value of the column 'SLIP_TYPE_ID'. (NullAllowed)
     */
    public void setSlipTypeId(Long slipTypeId) {
        __modifiedProperties.add("slipTypeId");
        this._slipTypeId = slipTypeId;
    }

    /**
     * [get] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別CD
     * @return The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSlipTypeCd() {
        return _slipTypeCd;
    }

    /**
     * [set] SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 伝票種別CD
     * @param slipTypeCd The value of the column 'SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSlipTypeCd(String slipTypeCd) {
        __modifiedProperties.add("slipTypeCd");
        this._slipTypeCd = slipTypeCd;
    }

    /**
     * [get] PURCHASE_ORDER_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @return The value of the column 'PURCHASE_ORDER_NO'. (NullAllowed)
     */
    public String getPurchaseOrderNo() {
        return _purchaseOrderNo;
    }

    /**
     * [set] PURCHASE_ORDER_NO: {VARCHAR(30)} <br>
     * IF用番号
     * @param purchaseOrderNo The value of the column 'PURCHASE_ORDER_NO'. (NullAllowed)
     */
    public void setPurchaseOrderNo(String purchaseOrderNo) {
        __modifiedProperties.add("purchaseOrderNo");
        this._purchaseOrderNo = purchaseOrderNo;
    }

    /**
     * [get] RECEIVE_REASON_CD: {VARCHAR(255)} <br>
     * 入荷発生事由CD
     * @return The value of the column 'RECEIVE_REASON_CD'. (NullAllowed)
     */
    public String getReceiveReasonCd() {
        return _receiveReasonCd;
    }

    /**
     * [set] RECEIVE_REASON_CD: {VARCHAR(255)} <br>
     * 入荷発生事由CD
     * @param receiveReasonCd The value of the column 'RECEIVE_REASON_CD'. (NullAllowed)
     */
    public void setReceiveReasonCd(String receiveReasonCd) {
        __modifiedProperties.add("receiveReasonCd");
        this._receiveReasonCd = receiveReasonCd;
    }

    /**
     * [get] ORDER_DATE: {VARCHAR(8)} <br>
     * 発注日
     * @return The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public String getOrderDate() {
        return _orderDate;
    }

    /**
     * [set] ORDER_DATE: {VARCHAR(8)} <br>
     * 発注日
     * @param orderDate The value of the column 'ORDER_DATE'. (NullAllowed)
     */
    public void setOrderDate(String orderDate) {
        __modifiedProperties.add("orderDate");
        this._orderDate = orderDate;
    }

    /**
     * [get] ORDER_TIME: {VARCHAR(6)} <br>
     * 発注時刻
     * @return The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public String getOrderTime() {
        return _orderTime;
    }

    /**
     * [set] ORDER_TIME: {VARCHAR(6)} <br>
     * 発注時刻
     * @param orderTime The value of the column 'ORDER_TIME'. (NullAllowed)
     */
    public void setOrderTime(String orderTime) {
        __modifiedProperties.add("orderTime");
        this._orderTime = orderTime;
    }

    /**
     * [get] CONFIRMED_DELIVERY_DT: {VARCHAR(8)} <br>
     * 確定納期
     * @return The value of the column 'CONFIRMED_DELIVERY_DT'. (NullAllowed)
     */
    public String getConfirmedDeliveryDt() {
        return _confirmedDeliveryDt;
    }

    /**
     * [set] CONFIRMED_DELIVERY_DT: {VARCHAR(8)} <br>
     * 確定納期
     * @param confirmedDeliveryDt The value of the column 'CONFIRMED_DELIVERY_DT'. (NullAllowed)
     */
    public void setConfirmedDeliveryDt(String confirmedDeliveryDt) {
        __modifiedProperties.add("confirmedDeliveryDt");
        this._confirmedDeliveryDt = confirmedDeliveryDt;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public String getPlantCd() {
        return _plantCd;
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public void setPlantCd(String plantCd) {
        __modifiedProperties.add("plantCd");
        this._plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStorageSpaceCd() {
        return _storageSpaceCd;
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        __modifiedProperties.add("storageSpaceCd");
        this._storageSpaceCd = storageSpaceCd;
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
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
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
     * SAPユーザCD
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed)
     */
    public String getSapUserCd() {
        return _sapUserCd;
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
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
     * [get] CUSTOMER_ORDER_NO: {VARCHAR(100)} <br>
     * 得意先注文番号
     * @return The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed)
     */
    public String getCustomerOrderNo() {
        return _customerOrderNo;
    }

    /**
     * [set] CUSTOMER_ORDER_NO: {VARCHAR(100)} <br>
     * 得意先注文番号
     * @param customerOrderNo The value of the column 'CUSTOMER_ORDER_NO'. (NullAllowed)
     */
    public void setCustomerOrderNo(String customerOrderNo) {
        __modifiedProperties.add("customerOrderNo");
        this._customerOrderNo = customerOrderNo;
    }

    /**
     * [get] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先CD
     * @return The value of the column 'SAP_VENDER_CD'. (NullAllowed)
     */
    public String getSapVenderCd() {
        return _sapVenderCd;
    }

    /**
     * [set] SAP_VENDER_CD: {VARCHAR(30)} <br>
     * SAP発注先CD
     * @param sapVenderCd The value of the column 'SAP_VENDER_CD'. (NullAllowed)
     */
    public void setSapVenderCd(String sapVenderCd) {
        __modifiedProperties.add("sapVenderCd");
        this._sapVenderCd = sapVenderCd;
    }

    /**
     * [get] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先CD
     * @return The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed)
     */
    public String getSapSupplierCd() {
        return _sapSupplierCd;
    }

    /**
     * [set] SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * SAP仕入先CD
     * @param sapSupplierCd The value of the column 'SAP_SUPPLIER_CD'. (NullAllowed)
     */
    public void setSapSupplierCd(String sapSupplierCd) {
        __modifiedProperties.add("sapSupplierCd");
        this._sapSupplierCd = sapSupplierCd;
    }

    /**
     * [get] TODAY_FLG: {CHAR(1)} <br>
     * 当日分フラグ
     * @return The value of the column 'TODAY_FLG'. (NullAllowed)
     */
    public String getTodayFlg() {
        return _todayFlg;
    }

    /**
     * [set] TODAY_FLG: {CHAR(1)} <br>
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
     * データ区分CD
     * @return The value of the column 'DATA_TYPE_CD'. (NullAllowed)
     */
    public String getDataTypeCd() {
        return _dataTypeCd;
    }

    /**
     * [set] DATA_TYPE_CD: {VARCHAR(30)} <br>
     * データ区分CD
     * @param dataTypeCd The value of the column 'DATA_TYPE_CD'. (NullAllowed)
     */
    public void setDataTypeCd(String dataTypeCd) {
        __modifiedProperties.add("dataTypeCd");
        this._dataTypeCd = dataTypeCd;
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
     * [get] RECEIVE_REASON_NM: {VARCHAR(60)} <br>
     * 入荷発生事由名称
     * @return The value of the column 'RECEIVE_REASON_NM'. (NullAllowed)
     */
    public String getReceiveReasonNm() {
        return _receiveReasonNm;
    }

    /**
     * [set] RECEIVE_REASON_NM: {VARCHAR(60)} <br>
     * 入荷発生事由名称
     * @param receiveReasonNm The value of the column 'RECEIVE_REASON_NM'. (NullAllowed)
     */
    public void setReceiveReasonNm(String receiveReasonNm) {
        __modifiedProperties.add("receiveReasonNm");
        this._receiveReasonNm = receiveReasonNm;
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
