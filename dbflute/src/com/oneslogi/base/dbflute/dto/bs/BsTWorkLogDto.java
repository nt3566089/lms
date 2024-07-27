package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_work_log as TABLE. <br>
 * 作業実績
 * <pre>
 * [primary-key]
 *     WORK_LOG_ID
 *
 * [column]
 *     WORK_LOG_ID, CLIENT_CD, CENTER_CD, USER_CD, WORK_CD, WORK_DT, WORK_START_DT, WORK_END_DT, WORK_QTY, TRACE_ITEM, MAC_ADDRESS, WORK_STATUS, WORK_LOG_OUT_FLG, WORK_LOG_OUT_DT, FORCE_COMPLETE_FLG, WORK_QTY_CS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_class_dtl(ByWorkStatus)
 *
 * [referrer-table]
 *     t_work_data
 *
 * [foreign-property]
 *     bClassDtlByWorkStatus, bClassDtlByWorkLogOutFlg
 *
 * [referrer-property]
 *     tWorkDataList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTWorkLogDto implements Serializable {

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
    /** WORK_LOG_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _workLogId;

    /** CLIENT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _clientCd;

    /** CENTER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _userCd;

    /** WORK_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _workCd;

    /** WORK_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** WORK_START_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workEndDt;

    /** WORK_QTY: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _workQty;

    /** TRACE_ITEM: {VARCHAR(255)} */
    @JsonKey
    protected String _traceItem;

    /** MAC_ADDRESS: {VARCHAR(60)} */
    @JsonKey
    protected String _macAddress;

    /** WORK_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=WorkStatus} */
    @JsonKey
    protected String _workStatus;

    /** WORK_LOG_OUT_FLG: {IX, CHAR(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} */
    @JsonKey
    protected String _workLogOutFlg;

    /** WORK_LOG_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workLogOutDt;

    /** FORCE_COMPLETE_FLG: {CHAR(1)} */
    @JsonKey
    protected String _forceCompleteFlg;

    /** WORK_QTY_CS: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _workQtyCs;

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
    public BsTWorkLogDto() {
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
    protected BClassDtlDto _bClassDtlByWorkStatus;

    public BClassDtlDto getBClassDtlByWorkStatus() {
        return _bClassDtlByWorkStatus;
    }

    public void setBClassDtlByWorkStatus(BClassDtlDto bClassDtlByWorkStatus) {
        this._bClassDtlByWorkStatus = bClassDtlByWorkStatus;
    }

    protected BClassDtlDto _bClassDtlByWorkLogOutFlg;

    public BClassDtlDto getBClassDtlByWorkLogOutFlg() {
        return _bClassDtlByWorkLogOutFlg;
    }

    public void setBClassDtlByWorkLogOutFlg(BClassDtlDto bClassDtlByWorkLogOutFlg) {
        this._bClassDtlByWorkLogOutFlg = bClassDtlByWorkLogOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TWorkDataDto> _tWorkDataList;

    public List<TWorkDataDto> getTWorkDataList() {
        if (_tWorkDataList == null) { _tWorkDataList = new ArrayList<TWorkDataDto>(); }
        return _tWorkDataList;
    }

    public void setTWorkDataList(List<TWorkDataDto> tWorkDataList) {
        this._tWorkDataList = tWorkDataList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTWorkLogDto)) { return false; }
        final BsTWorkLogDto otherEntity = (BsTWorkLogDto)other;
        if (!helpComparingValue(getWorkLogId(), otherEntity.getWorkLogId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_work_log");
        result = xCH(result, getWorkLogId());
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
        sb.append(c).append(getWorkLogId());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getUserCd());
        sb.append(c).append(getWorkCd());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getWorkStartDt());
        sb.append(c).append(getWorkEndDt());
        sb.append(c).append(getWorkQty());
        sb.append(c).append(getTraceItem());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getWorkStatus());
        sb.append(c).append(getWorkLogOutFlg());
        sb.append(c).append(getWorkLogOutDt());
        sb.append(c).append(getForceCompleteFlg());
        sb.append(c).append(getWorkQtyCs());
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
     * [get] WORK_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 作業実績ID
     * @return The value of the column 'WORK_LOG_ID'. (NullAllowed)
     */
    public Long getWorkLogId() {
        return _workLogId;
    }

    /**
     * [set] WORK_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 作業実績ID
     * @param workLogId The value of the column 'WORK_LOG_ID'. (NullAllowed)
     */
    public void setWorkLogId(Long workLogId) {
        __modifiedProperties.add("workLogId");
        this._workLogId = workLogId;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(30)} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30)} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] USER_CD: {VARCHAR(30)} <br>
     * ユーザCD
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {VARCHAR(30)} <br>
     * ユーザCD
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
    }

    /**
     * [get] WORK_CD: {VARCHAR(30)} <br>
     * 作業CD
     * @return The value of the column 'WORK_CD'. (NullAllowed)
     */
    public String getWorkCd() {
        return _workCd;
    }

    /**
     * [set] WORK_CD: {VARCHAR(30)} <br>
     * 作業CD
     * @param workCd The value of the column 'WORK_CD'. (NullAllowed)
     */
    public void setWorkCd(String workCd) {
        __modifiedProperties.add("workCd");
        this._workCd = workCd;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] WORK_START_DT: {DATETIME(19)} <br>
     * 作業開始日時
     * @return The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkStartDt() {
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {DATETIME(19)} <br>
     * 作業開始日時
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        __modifiedProperties.add("workStartDt");
        this._workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {DATETIME(19)} <br>
     * 作業終了日時
     * @return The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkEndDt() {
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {DATETIME(19)} <br>
     * 作業終了日時
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        __modifiedProperties.add("workEndDt");
        this._workEndDt = workEndDt;
    }

    /**
     * [get] WORK_QTY: {DECIMAL(14, 4)} <br>
     * 作業数量
     * @return The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getWorkQty() {
        return _workQty;
    }

    /**
     * [set] WORK_QTY: {DECIMAL(14, 4)} <br>
     * 作業数量
     * @param workQty The value of the column 'WORK_QTY'. (NullAllowed)
     */
    public void setWorkQty(java.math.BigDecimal workQty) {
        __modifiedProperties.add("workQty");
        this._workQty = workQty;
    }

    /**
     * [get] TRACE_ITEM: {VARCHAR(255)} <br>
     * トレース項目
     * @return The value of the column 'TRACE_ITEM'. (NullAllowed)
     */
    public String getTraceItem() {
        return _traceItem;
    }

    /**
     * [set] TRACE_ITEM: {VARCHAR(255)} <br>
     * トレース項目
     * @param traceItem The value of the column 'TRACE_ITEM'. (NullAllowed)
     */
    public void setTraceItem(String traceItem) {
        __modifiedProperties.add("traceItem");
        this._traceItem = traceItem;
    }

    /**
     * [get] MAC_ADDRESS: {VARCHAR(60)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * [set] MAC_ADDRESS: {VARCHAR(60)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public void setMacAddress(String macAddress) {
        __modifiedProperties.add("macAddress");
        this._macAddress = macAddress;
    }

    /**
     * [get] WORK_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * @return The value of the column 'WORK_STATUS'. (NullAllowed)
     */
    public String getWorkStatus() {
        return _workStatus;
    }

    /**
     * [set] WORK_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=WorkStatus} <br>
     * 作業ステータス
     * @param workStatus The value of the column 'WORK_STATUS'. (NullAllowed)
     */
    public void setWorkStatus(String workStatus) {
        __modifiedProperties.add("workStatus");
        this._workStatus = workStatus;
    }

    /**
     * [get] WORK_LOG_OUT_FLG: {IX, CHAR(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * @return The value of the column 'WORK_LOG_OUT_FLG'. (NullAllowed)
     */
    public String getWorkLogOutFlg() {
        return _workLogOutFlg;
    }

    /**
     * [set] WORK_LOG_OUT_FLG: {IX, CHAR(1), FK to B_CLASS_DTL, classification=WorkLogOutFlg} <br>
     * 作業実績出力フラグ
     * @param workLogOutFlg The value of the column 'WORK_LOG_OUT_FLG'. (NullAllowed)
     */
    public void setWorkLogOutFlg(String workLogOutFlg) {
        __modifiedProperties.add("workLogOutFlg");
        this._workLogOutFlg = workLogOutFlg;
    }

    /**
     * [get] WORK_LOG_OUT_DT: {DATETIME(19)} <br>
     * 作業実績出力日時
     * @return The value of the column 'WORK_LOG_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkLogOutDt() {
        return _workLogOutDt;
    }

    /**
     * [set] WORK_LOG_OUT_DT: {DATETIME(19)} <br>
     * 作業実績出力日時
     * @param workLogOutDt The value of the column 'WORK_LOG_OUT_DT'. (NullAllowed)
     */
    public void setWorkLogOutDt(java.sql.Timestamp workLogOutDt) {
        __modifiedProperties.add("workLogOutDt");
        this._workLogOutDt = workLogOutDt;
    }

    /**
     * [get] FORCE_COMPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @return The value of the column 'FORCE_COMPLETE_FLG'. (NullAllowed)
     */
    public String getForceCompleteFlg() {
        return _forceCompleteFlg;
    }

    /**
     * [set] FORCE_COMPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @param forceCompleteFlg The value of the column 'FORCE_COMPLETE_FLG'. (NullAllowed)
     */
    public void setForceCompleteFlg(String forceCompleteFlg) {
        __modifiedProperties.add("forceCompleteFlg");
        this._forceCompleteFlg = forceCompleteFlg;
    }

    /**
     * [get] WORK_QTY_CS: {DECIMAL(14, 4)} <br>
     * 作業数量（ケース）
     * @return The value of the column 'WORK_QTY_CS'. (NullAllowed)
     */
    public java.math.BigDecimal getWorkQtyCs() {
        return _workQtyCs;
    }

    /**
     * [set] WORK_QTY_CS: {DECIMAL(14, 4)} <br>
     * 作業数量（ケース）
     * @param workQtyCs The value of the column 'WORK_QTY_CS'. (NullAllowed)
     */
    public void setWorkQtyCs(java.math.BigDecimal workQtyCs) {
        __modifiedProperties.add("workQtyCs");
        this._workQtyCs = workQtyCs;
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