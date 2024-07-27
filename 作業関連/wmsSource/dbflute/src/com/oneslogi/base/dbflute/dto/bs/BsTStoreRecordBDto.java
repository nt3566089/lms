package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_store_record_b as TABLE. <br>
 * 入庫実績ボディ
 * <pre>
 * [primary-key]
 *     STORE_RECORD_B_ID
 *
 * [column]
 *     STORE_RECORD_B_ID, STORE_RECORD_H_ID, RECEIVE_PLAN_B_ID, PROCESS_NO, CLIENT_ORDER_NO, LOT, LIMIT_DT, STORE_DT, STORE_NUM, STORE_FLG, STORE_LOCATION_ID, INPUT_TYPE, HT_STORE_INSPECTION_DT, HT_STORE_INSPECTION_USER_ID, STORE_RECORD_B_COMMENT, PROD_DT, STORE_REASON_CD, RECEIVE_NO, PROCESS_TYPE_CD, SLIP_NO, RECEIVE_UNIT_NUM, STORE_RECORD_SEND_FLG, TRANSFER_SEND_FLG, PRODUCT_STORE_STATUS, USER_ID, CM_SEND_FLG_STORE, CM_SEND_FLG_TRANSFER, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_store_record_h, t_receive_plan_b, m_location, b_class_dtl(ByInputType)
 *
 * [referrer-table]
 *     t_stock_inout
 *
 * [foreign-property]
 *     tStoreRecordH, tReceivePlanB, mLocation, bClassDtlByInputType, bClassDtlByStoreFlg
 *
 * [referrer-property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTStoreRecordBDto implements Serializable {

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
    /** STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _storeRecordBId;

    /** STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h} */
    @JsonKey
    protected Long _storeRecordHId;

    /** RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b} */
    @JsonKey
    protected Long _receivePlanBId;

    /** PROCESS_NO: {NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _processNo;

    /** CLIENT_ORDER_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _clientOrderNo;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** STORE_DT: {IX, NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _storeDt;

    /** STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _storeNum;

    /** STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} */
    @JsonKey
    protected String _storeFlg;

    /** STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _storeLocationId;

    /** INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** HT_STORE_INSPECTION_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _htStoreInspectionDt;

    /** HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)} */
    @JsonKey
    protected String _htStoreInspectionUserId;

    /** STORE_RECORD_B_COMMENT: {VARCHAR(255)} */
    @JsonKey
    protected String _storeRecordBComment;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** STORE_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storeReasonCd;

    /** RECEIVE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveNo;

    /** PROCESS_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _processTypeCd;

    /** SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _slipNo;

    /** RECEIVE_UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _receiveUnitNum;

    /** STORE_RECORD_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _storeRecordSendFlg;

    /** TRANSFER_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _transferSendFlg;

    /** PRODUCT_STORE_STATUS: {VARCHAR(30)} */
    @JsonKey
    protected String _productStoreStatus;

    /** USER_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _userId;

    /** CM_SEND_FLG_STORE: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _cmSendFlgStore;

    /** CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _cmSendFlgTransfer;

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
    public BsTStoreRecordBDto() {
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
    protected TStoreRecordHDto _tStoreRecordH;

    public TStoreRecordHDto getTStoreRecordH() {
        return _tStoreRecordH;
    }

    public void setTStoreRecordH(TStoreRecordHDto tStoreRecordH) {
        this._tStoreRecordH = tStoreRecordH;
    }

    protected TReceivePlanBDto _tReceivePlanB;

    public TReceivePlanBDto getTReceivePlanB() {
        return _tReceivePlanB;
    }

    public void setTReceivePlanB(TReceivePlanBDto tReceivePlanB) {
        this._tReceivePlanB = tReceivePlanB;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByStoreFlg;

    public BClassDtlDto getBClassDtlByStoreFlg() {
        return _bClassDtlByStoreFlg;
    }

    public void setBClassDtlByStoreFlg(BClassDtlDto bClassDtlByStoreFlg) {
        this._bClassDtlByStoreFlg = bClassDtlByStoreFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TStockInoutDto> _tStockInoutList;

    public List<TStockInoutDto> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutList;
    }

    public void setTStockInoutList(List<TStockInoutDto> tStockInoutList) {
        this._tStockInoutList = tStockInoutList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTStoreRecordBDto)) { return false; }
        final BsTStoreRecordBDto otherEntity = (BsTStoreRecordBDto)other;
        if (!helpComparingValue(getStoreRecordBId(), otherEntity.getStoreRecordBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_store_record_b");
        result = xCH(result, getStoreRecordBId());
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
        sb.append(c).append(getStoreRecordBId());
        sb.append(c).append(getStoreRecordHId());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getClientOrderNo());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getStoreNum());
        sb.append(c).append(getStoreFlg());
        sb.append(c).append(getStoreLocationId());
        sb.append(c).append(getInputType());
        sb.append(c).append(getHtStoreInspectionDt());
        sb.append(c).append(getHtStoreInspectionUserId());
        sb.append(c).append(getStoreRecordBComment());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getStoreReasonCd());
        sb.append(c).append(getReceiveNo());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getSlipNo());
        sb.append(c).append(getReceiveUnitNum());
        sb.append(c).append(getStoreRecordSendFlg());
        sb.append(c).append(getTransferSendFlg());
        sb.append(c).append(getProductStoreStatus());
        sb.append(c).append(getUserId());
        sb.append(c).append(getCmSendFlgStore());
        sb.append(c).append(getCmSendFlgTransfer());
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
     * [get] STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫実績ボディID
     * @return The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getStoreRecordBId() {
        return _storeRecordBId;
    }

    /**
     * [set] STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫実績ボディID
     * @param storeRecordBId The value of the column 'STORE_RECORD_B_ID'. (NullAllowed)
     */
    public void setStoreRecordBId(Long storeRecordBId) {
        __modifiedProperties.add("storeRecordBId");
        this._storeRecordBId = storeRecordBId;
    }

    /**
     * [get] STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public Long getStoreRecordHId() {
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        __modifiedProperties.add("storeRecordHId");
        this._storeRecordHId = storeRecordHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public String getProcessNo() {
        return _processNo;
    }

    /**
     * [set] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public void setProcessNo(String processNo) {
        __modifiedProperties.add("processNo");
        this._processNo = processNo;
    }

    /**
     * [get] CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * 顧客発注No.
     * @return The value of the column 'CLIENT_ORDER_NO'. (NullAllowed)
     */
    public String getClientOrderNo() {
        return _clientOrderNo;
    }

    /**
     * [set] CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * 顧客発注No.
     * @param clientOrderNo The value of the column 'CLIENT_ORDER_NO'. (NullAllowed)
     */
    public void setClientOrderNo(String clientOrderNo) {
        __modifiedProperties.add("clientOrderNo");
        this._clientOrderNo = clientOrderNo;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] STORE_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {IX, NotNull, VARCHAR(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 入庫数
     * @return The value of the column 'STORE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStoreNum() {
        return _storeNum;
    }

    /**
     * [set] STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 入庫数
     * @param storeNum The value of the column 'STORE_NUM'. (NullAllowed)
     */
    public void setStoreNum(java.math.BigDecimal storeNum) {
        __modifiedProperties.add("storeNum");
        this._storeNum = storeNum;
    }

    /**
     * [get] STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @return The value of the column 'STORE_FLG'. (NullAllowed)
     */
    public String getStoreFlg() {
        return _storeFlg;
    }

    /**
     * [set] STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 入庫格納フラグ
     * @param storeFlg The value of the column 'STORE_FLG'. (NullAllowed)
     */
    public void setStoreFlg(String storeFlg) {
        __modifiedProperties.add("storeFlg");
        this._storeFlg = storeFlg;
    }

    /**
     * [get] STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 入庫格納ロケーションID
     * @return The value of the column 'STORE_LOCATION_ID'. (NullAllowed)
     */
    public Long getStoreLocationId() {
        return _storeLocationId;
    }

    /**
     * [set] STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 入庫格納ロケーションID
     * @param storeLocationId The value of the column 'STORE_LOCATION_ID'. (NullAllowed)
     */
    public void setStoreLocationId(Long storeLocationId) {
        __modifiedProperties.add("storeLocationId");
        this._storeLocationId = storeLocationId;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] HT_STORE_INSPECTION_DT: {VARCHAR(8)} <br>
     * HT検品完了日
     * @return The value of the column 'HT_STORE_INSPECTION_DT'. (NullAllowed)
     */
    public String getHtStoreInspectionDt() {
        return _htStoreInspectionDt;
    }

    /**
     * [set] HT_STORE_INSPECTION_DT: {VARCHAR(8)} <br>
     * HT検品完了日
     * @param htStoreInspectionDt The value of the column 'HT_STORE_INSPECTION_DT'. (NullAllowed)
     */
    public void setHtStoreInspectionDt(String htStoreInspectionDt) {
        __modifiedProperties.add("htStoreInspectionDt");
        this._htStoreInspectionDt = htStoreInspectionDt;
    }

    /**
     * [get] HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)} <br>
     * HT検品担当者ID
     * @return The value of the column 'HT_STORE_INSPECTION_USER_ID'. (NullAllowed)
     */
    public String getHtStoreInspectionUserId() {
        return _htStoreInspectionUserId;
    }

    /**
     * [set] HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)} <br>
     * HT検品担当者ID
     * @param htStoreInspectionUserId The value of the column 'HT_STORE_INSPECTION_USER_ID'. (NullAllowed)
     */
    public void setHtStoreInspectionUserId(String htStoreInspectionUserId) {
        __modifiedProperties.add("htStoreInspectionUserId");
        this._htStoreInspectionUserId = htStoreInspectionUserId;
    }

    /**
     * [get] STORE_RECORD_B_COMMENT: {VARCHAR(255)} <br>
     * 入庫実績ボディ備考
     * @return The value of the column 'STORE_RECORD_B_COMMENT'. (NullAllowed)
     */
    public String getStoreRecordBComment() {
        return _storeRecordBComment;
    }

    /**
     * [set] STORE_RECORD_B_COMMENT: {VARCHAR(255)} <br>
     * 入庫実績ボディ備考
     * @param storeRecordBComment The value of the column 'STORE_RECORD_B_COMMENT'. (NullAllowed)
     */
    public void setStoreRecordBComment(String storeRecordBComment) {
        __modifiedProperties.add("storeRecordBComment");
        this._storeRecordBComment = storeRecordBComment;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由CD
     * @return The value of the column 'STORE_REASON_CD'. (NullAllowed)
     */
    public String getStoreReasonCd() {
        return _storeReasonCd;
    }

    /**
     * [set] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由CD
     * @param storeReasonCd The value of the column 'STORE_REASON_CD'. (NullAllowed)
     */
    public void setStoreReasonCd(String storeReasonCd) {
        __modifiedProperties.add("storeReasonCd");
        this._storeReasonCd = storeReasonCd;
    }

    /**
     * [get] RECEIVE_NO: {VARCHAR(30)} <br>
     * 入荷番号
     * @return The value of the column 'RECEIVE_NO'. (NullAllowed)
     */
    public String getReceiveNo() {
        return _receiveNo;
    }

    /**
     * [set] RECEIVE_NO: {VARCHAR(30)} <br>
     * 入荷番号
     * @param receiveNo The value of the column 'RECEIVE_NO'. (NullAllowed)
     */
    public void setReceiveNo(String receiveNo) {
        __modifiedProperties.add("receiveNo");
        this._receiveNo = receiveNo;
    }

    /**
     * [get] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * 処理区分
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * 処理区分
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
    }

    /**
     * [get] SLIP_NO: {VARCHAR(30)} <br>
     * 伝票番号
     * @return The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public String getSlipNo() {
        return _slipNo;
    }

    /**
     * [set] SLIP_NO: {VARCHAR(30)} <br>
     * 伝票番号
     * @param slipNo The value of the column 'SLIP_NO'. (NullAllowed)
     */
    public void setSlipNo(String slipNo) {
        __modifiedProperties.add("slipNo");
        this._slipNo = slipNo;
    }

    /**
     * [get] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @return The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed)
     */
    public Long getReceiveUnitNum() {
        return _receiveUnitNum;
    }

    /**
     * [set] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @param receiveUnitNum The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed)
     */
    public void setReceiveUnitNum(Long receiveUnitNum) {
        __modifiedProperties.add("receiveUnitNum");
        this._receiveUnitNum = receiveUnitNum;
    }

    /**
     * [get] STORE_RECORD_SEND_FLG: {CHAR(1)} <br>
     * 入庫実績送信済フラグ
     * @return The value of the column 'STORE_RECORD_SEND_FLG'. (NullAllowed)
     */
    public String getStoreRecordSendFlg() {
        return _storeRecordSendFlg;
    }

    /**
     * [set] STORE_RECORD_SEND_FLG: {CHAR(1)} <br>
     * 入庫実績送信済フラグ
     * @param storeRecordSendFlg The value of the column 'STORE_RECORD_SEND_FLG'. (NullAllowed)
     */
    public void setStoreRecordSendFlg(String storeRecordSendFlg) {
        __modifiedProperties.add("storeRecordSendFlg");
        this._storeRecordSendFlg = storeRecordSendFlg;
    }

    /**
     * [get] TRANSFER_SEND_FLG: {CHAR(1)} <br>
     * 振替送信済フラグ
     * @return The value of the column 'TRANSFER_SEND_FLG'. (NullAllowed)
     */
    public String getTransferSendFlg() {
        return _transferSendFlg;
    }

    /**
     * [set] TRANSFER_SEND_FLG: {CHAR(1)} <br>
     * 振替送信済フラグ
     * @param transferSendFlg The value of the column 'TRANSFER_SEND_FLG'. (NullAllowed)
     */
    public void setTransferSendFlg(String transferSendFlg) {
        __modifiedProperties.add("transferSendFlg");
        this._transferSendFlg = transferSendFlg;
    }

    /**
     * [get] PRODUCT_STORE_STATUS: {VARCHAR(30)} <br>
     * 商品別入庫ステータス
     * @return The value of the column 'PRODUCT_STORE_STATUS'. (NullAllowed)
     */
    public String getProductStoreStatus() {
        return _productStoreStatus;
    }

    /**
     * [set] PRODUCT_STORE_STATUS: {VARCHAR(30)} <br>
     * 商品別入庫ステータス
     * @param productStoreStatus The value of the column 'PRODUCT_STORE_STATUS'. (NullAllowed)
     */
    public void setProductStoreStatus(String productStoreStatus) {
        __modifiedProperties.add("productStoreStatus");
        this._productStoreStatus = productStoreStatus;
    }

    /**
     * [get] USER_ID: {BIGINT(19)} <br>
     * 担当者ID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {BIGINT(19)} <br>
     * 担当者ID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] CM_SEND_FLG_STORE: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ_入庫実績
     * @return The value of the column 'CM_SEND_FLG_STORE'. (NullAllowed)
     */
    public String getCmSendFlgStore() {
        return _cmSendFlgStore;
    }

    /**
     * [set] CM_SEND_FLG_STORE: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ_入庫実績
     * @param cmSendFlgStore The value of the column 'CM_SEND_FLG_STORE'. (NullAllowed)
     */
    public void setCmSendFlgStore(String cmSendFlgStore) {
        __modifiedProperties.add("cmSendFlgStore");
        this._cmSendFlgStore = cmSendFlgStore;
    }

    /**
     * [get] CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ_振替
     * @return The value of the column 'CM_SEND_FLG_TRANSFER'. (NullAllowed)
     */
    public String getCmSendFlgTransfer() {
        return _cmSendFlgTransfer;
    }

    /**
     * [set] CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ_振替
     * @param cmSendFlgTransfer The value of the column 'CM_SEND_FLG_TRANSFER'. (NullAllowed)
     */
    public void setCmSendFlgTransfer(String cmSendFlgTransfer) {
        __modifiedProperties.add("cmSendFlgTransfer");
        this._cmSendFlgTransfer = cmSendFlgTransfer;
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
