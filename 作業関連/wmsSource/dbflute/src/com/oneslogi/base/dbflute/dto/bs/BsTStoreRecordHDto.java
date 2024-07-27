package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_store_record_h as TABLE. <br>
 * 入庫実績ヘッダ
 * <pre>
 * [primary-key]
 *     STORE_RECORD_H_ID
 *
 * [column]
 *     STORE_RECORD_H_ID, RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, CLIENT_RECEIVE_NO, SUPPLIER_ID, DEPOSIT_ID, STORE_RECORD_H_COMMENT, S4_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STORE_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_stock_type, m_customer, m_client, m_process_type, m_center, t_receive_plan_h, t_store_record_r(AsOne)
 *
 * [referrer-table]
 *     t_store_record_b, t_store_record_r
 *
 * [foreign-property]
 *     mStockType, mCustomerBySupplierId, mClient, mCustomerByDepositId, mProcessType, mCenter, tReceivePlanH, tStoreRecordRAsOne
 *
 * [referrer-property]
 *     tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTStoreRecordHDto implements Serializable {

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
    /** STORE_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _storeRecordHId;

    /** RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} */
    @JsonKey
    protected Long _receivePlanHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type} */
    @JsonKey
    protected Long _processTypeId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _clientReceiveNo;

    /** SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _supplierId;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _depositId;

    /** STORE_RECORD_H_COMMENT: {VARCHAR(255)} */
    @JsonKey
    protected String _storeRecordHComment;

    /** S4_SEND_FLG: {VARCHAR(30)} */
    @JsonKey
    protected String _s4SendFlg;

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
    public BsTStoreRecordHDto() {
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
    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected MCustomerDto _mCustomerBySupplierId;

    public MCustomerDto getMCustomerBySupplierId() {
        return _mCustomerBySupplierId;
    }

    public void setMCustomerBySupplierId(MCustomerDto mCustomerBySupplierId) {
        this._mCustomerBySupplierId = mCustomerBySupplierId;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCustomerDto _mCustomerByDepositId;

    public MCustomerDto getMCustomerByDepositId() {
        return _mCustomerByDepositId;
    }

    public void setMCustomerByDepositId(MCustomerDto mCustomerByDepositId) {
        this._mCustomerByDepositId = mCustomerByDepositId;
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

    protected TReceivePlanHDto _tReceivePlanH;

    public TReceivePlanHDto getTReceivePlanH() {
        return _tReceivePlanH;
    }

    public void setTReceivePlanH(TReceivePlanHDto tReceivePlanH) {
        this._tReceivePlanH = tReceivePlanH;
    }

    protected TStoreRecordRDto _tStoreRecordRAsOne;

    public TStoreRecordRDto getTStoreRecordRAsOne() {
        return _tStoreRecordRAsOne;
    }

    public void setTStoreRecordRAsOne(TStoreRecordRDto TStoreRecordRAsOne) {
        this._tStoreRecordRAsOne = TStoreRecordRAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TStoreRecordBDto> _tStoreRecordBList;

    public List<TStoreRecordBDto> getTStoreRecordBList() {
        if (_tStoreRecordBList == null) { _tStoreRecordBList = new ArrayList<TStoreRecordBDto>(); }
        return _tStoreRecordBList;
    }

    public void setTStoreRecordBList(List<TStoreRecordBDto> tStoreRecordBList) {
        this._tStoreRecordBList = tStoreRecordBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTStoreRecordHDto)) { return false; }
        final BsTStoreRecordHDto otherEntity = (BsTStoreRecordHDto)other;
        if (!helpComparingValue(getStoreRecordHId(), otherEntity.getStoreRecordHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_store_record_h");
        result = xCH(result, getStoreRecordHId());
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
        sb.append(c).append(getStoreRecordHId());
        sb.append(c).append(getReceivePlanHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getClientReceiveNo());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getStoreRecordHComment());
        sb.append(c).append(getS4SendFlg());
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
     * [get] STORE_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫実績ヘッダID
     * @return The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public Long getStoreRecordHId() {
        return _storeRecordHId;
    }

    /**
     * [set] STORE_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫実績ヘッダID
     * @param storeRecordHId The value of the column 'STORE_RECORD_H_ID'. (NullAllowed)
     */
    public void setStoreRecordHId(Long storeRecordHId) {
        __modifiedProperties.add("storeRecordHId");
        this._storeRecordHId = storeRecordHId;
    }

    /**
     * [get] RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} <br>
     * 入荷予定ヘッダID
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed)
     */
    public Long getReceivePlanHId() {
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h} <br>
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
     * [get] CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 顧客入荷指示No.
     * @return The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public String getClientReceiveNo() {
        return _clientReceiveNo;
    }

    /**
     * [set] CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * 顧客入荷指示No.
     * @param clientReceiveNo The value of the column 'CLIENT_RECEIVE_NO'. (NullAllowed)
     */
    public void setClientReceiveNo(String clientReceiveNo) {
        __modifiedProperties.add("clientReceiveNo");
        this._clientReceiveNo = clientReceiveNo;
    }

    /**
     * [get] SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public void setSupplierId(Long supplierId) {
        __modifiedProperties.add("supplierId");
        this._supplierId = supplierId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] STORE_RECORD_H_COMMENT: {VARCHAR(255)} <br>
     * 入庫実績ヘッダ備考
     * @return The value of the column 'STORE_RECORD_H_COMMENT'. (NullAllowed)
     */
    public String getStoreRecordHComment() {
        return _storeRecordHComment;
    }

    /**
     * [set] STORE_RECORD_H_COMMENT: {VARCHAR(255)} <br>
     * 入庫実績ヘッダ備考
     * @param storeRecordHComment The value of the column 'STORE_RECORD_H_COMMENT'. (NullAllowed)
     */
    public void setStoreRecordHComment(String storeRecordHComment) {
        __modifiedProperties.add("storeRecordHComment");
        this._storeRecordHComment = storeRecordHComment;
    }

    /**
     * [get] S4_SEND_FLG: {VARCHAR(30)} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public String getS4SendFlg() {
        return _s4SendFlg;
    }

    /**
     * [set] S4_SEND_FLG: {VARCHAR(30)} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public void setS4SendFlg(String s4SendFlg) {
        __modifiedProperties.add("s4SendFlg");
        this._s4SendFlg = s4SendFlg;
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
