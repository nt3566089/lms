package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_nizoroe as TABLE. <br>
 * 荷揃処理
 * <pre>
 * [primary-key]
 *     NIZOROE_ID
 *
 * [column]
 *     NIZOROE_ID, BASE_CD, NIZOROE_PROC_UNIT, NIZOROE_TYPE_CD, STATUS, PROC_DT, PROC_START_TIME, PROC_END_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ID
 *
 * [version-no]
 *     VERSION_NO
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
public abstract class BsTNizoroeDto implements Serializable {

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
    /** NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _nizoroeId;

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeProcUnit;

    /** NIZOROE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeTypeCd;

    /** STATUS: {VARCHAR(30)} */
    @JsonKey
    protected String _status;

    /** PROC_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _procDt;

    /** PROC_START_TIME: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _procStartTime;

    /** PROC_END_TIME: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _procEndTime;

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
    public BsTNizoroeDto() {
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
        if (other == null || !(other instanceof BsTNizoroeDto)) { return false; }
        final BsTNizoroeDto otherEntity = (BsTNizoroeDto)other;
        if (!helpComparingValue(getNizoroeId(), otherEntity.getNizoroeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_nizoroe");
        result = xCH(result, getNizoroeId());
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
        sb.append(c).append(getNizoroeId());
        sb.append(c).append(getBaseCd());
        sb.append(c).append(getNizoroeProcUnit());
        sb.append(c).append(getNizoroeTypeCd());
        sb.append(c).append(getStatus());
        sb.append(c).append(getProcDt());
        sb.append(c).append(getProcStartTime());
        sb.append(c).append(getProcEndTime());
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
     * [get] NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理ID
     * @return The value of the column 'NIZOROE_ID'. (NullAllowed)
     */
    public Long getNizoroeId() {
        return _nizoroeId;
    }

    /**
     * [set] NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理ID
     * @param nizoroeId The value of the column 'NIZOROE_ID'. (NullAllowed)
     */
    public void setNizoroeId(Long nizoroeId) {
        __modifiedProperties.add("nizoroeId");
        this._nizoroeId = nizoroeId;
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
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public String getNizoroeProcUnit() {
        return _nizoroeProcUnit;
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        __modifiedProperties.add("nizoroeProcUnit");
        this._nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @return The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public String getNizoroeTypeCd() {
        return _nizoroeTypeCd;
    }

    /**
     * [set] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @param nizoroeTypeCd The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public void setNizoroeTypeCd(String nizoroeTypeCd) {
        __modifiedProperties.add("nizoroeTypeCd");
        this._nizoroeTypeCd = nizoroeTypeCd;
    }

    /**
     * [get] STATUS: {VARCHAR(30)} <br>
     * 実行ステータス
     * @return The value of the column 'STATUS'. (NullAllowed)
     */
    public String getStatus() {
        return _status;
    }

    /**
     * [set] STATUS: {VARCHAR(30)} <br>
     * 実行ステータス
     * @param status The value of the column 'STATUS'. (NullAllowed)
     */
    public void setStatus(String status) {
        __modifiedProperties.add("status");
        this._status = status;
    }

    /**
     * [get] PROC_DT: {VARCHAR(8)} <br>
     * 処理日
     * @return The value of the column 'PROC_DT'. (NullAllowed)
     */
    public String getProcDt() {
        return _procDt;
    }

    /**
     * [set] PROC_DT: {VARCHAR(8)} <br>
     * 処理日
     * @param procDt The value of the column 'PROC_DT'. (NullAllowed)
     */
    public void setProcDt(String procDt) {
        __modifiedProperties.add("procDt");
        this._procDt = procDt;
    }

    /**
     * [get] PROC_START_TIME: {DATETIME(19)} <br>
     * 処理開始時刻
     * @return The value of the column 'PROC_START_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcStartTime() {
        return _procStartTime;
    }

    /**
     * [set] PROC_START_TIME: {DATETIME(19)} <br>
     * 処理開始時刻
     * @param procStartTime The value of the column 'PROC_START_TIME'. (NullAllowed)
     */
    public void setProcStartTime(java.sql.Timestamp procStartTime) {
        __modifiedProperties.add("procStartTime");
        this._procStartTime = procStartTime;
    }

    /**
     * [get] PROC_END_TIME: {DATETIME(19)} <br>
     * 処理終了時刻
     * @return The value of the column 'PROC_END_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcEndTime() {
        return _procEndTime;
    }

    /**
     * [set] PROC_END_TIME: {DATETIME(19)} <br>
     * 処理終了時刻
     * @param procEndTime The value of the column 'PROC_END_TIME'. (NullAllowed)
     */
    public void setProcEndTime(java.sql.Timestamp procEndTime) {
        __modifiedProperties.add("procEndTime");
        this._procEndTime = procEndTime;
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
