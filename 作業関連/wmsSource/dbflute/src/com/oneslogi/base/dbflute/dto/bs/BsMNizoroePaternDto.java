package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_nizoroe_patern as TABLE. <br>
 * 荷揃パターンマスタ
 * <pre>
 * [primary-key]
 *     NIZOROE_PATERN_ID
 *
 * [column]
 *     NIZOROE_PATERN_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_ID, NIZOROE_PROC_NM, PROGRAM_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_PATERN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     m_nizoroe
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     mNizoroeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMNizoroePaternDto implements Serializable {

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
    /** NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _nizoroePaternId;

    /** NIZOROE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeTypeCd;

    /** NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeProcId;

    /** NIZOROE_PROC_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _nizoroeProcNm;

    /** PROGRAM_ID: {VARCHAR(60)} */
    @JsonKey
    protected String _programId;

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
    public BsMNizoroePaternDto() {
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
    protected List<MNizoroeDto> _mNizoroeList;

    public List<MNizoroeDto> getMNizoroeList() {
        if (_mNizoroeList == null) { _mNizoroeList = new ArrayList<MNizoroeDto>(); }
        return _mNizoroeList;
    }

    public void setMNizoroeList(List<MNizoroeDto> mNizoroeList) {
        this._mNizoroeList = mNizoroeList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMNizoroePaternDto)) { return false; }
        final BsMNizoroePaternDto otherEntity = (BsMNizoroePaternDto)other;
        if (!helpComparingValue(getNizoroePaternId(), otherEntity.getNizoroePaternId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_nizoroe_patern");
        result = xCH(result, getNizoroePaternId());
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
        sb.append(c).append(getNizoroePaternId());
        sb.append(c).append(getNizoroeTypeCd());
        sb.append(c).append(getNizoroeProcId());
        sb.append(c).append(getNizoroeProcNm());
        sb.append(c).append(getProgramId());
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
     * [get] NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃パターンID
     * @return The value of the column 'NIZOROE_PATERN_ID'. (NullAllowed)
     */
    public Long getNizoroePaternId() {
        return _nizoroePaternId;
    }

    /**
     * [set] NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃パターンID
     * @param nizoroePaternId The value of the column 'NIZOROE_PATERN_ID'. (NullAllowed)
     */
    public void setNizoroePaternId(Long nizoroePaternId) {
        __modifiedProperties.add("nizoroePaternId");
        this._nizoroePaternId = nizoroePaternId;
    }

    /**
     * [get] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃区分
     * @return The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public String getNizoroeTypeCd() {
        return _nizoroeTypeCd;
    }

    /**
     * [set] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃区分
     * @param nizoroeTypeCd The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public void setNizoroeTypeCd(String nizoroeTypeCd) {
        __modifiedProperties.add("nizoroeTypeCd");
        this._nizoroeTypeCd = nizoroeTypeCd;
    }

    /**
     * [get] NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷揃処理ID
     * @return The value of the column 'NIZOROE_PROC_ID'. (NullAllowed)
     */
    public String getNizoroeProcId() {
        return _nizoroeProcId;
    }

    /**
     * [set] NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * 荷揃処理ID
     * @param nizoroeProcId The value of the column 'NIZOROE_PROC_ID'. (NullAllowed)
     */
    public void setNizoroeProcId(String nizoroeProcId) {
        __modifiedProperties.add("nizoroeProcId");
        this._nizoroeProcId = nizoroeProcId;
    }

    /**
     * [get] NIZOROE_PROC_NM: {VARCHAR(60)} <br>
     * 荷揃処理名称
     * @return The value of the column 'NIZOROE_PROC_NM'. (NullAllowed)
     */
    public String getNizoroeProcNm() {
        return _nizoroeProcNm;
    }

    /**
     * [set] NIZOROE_PROC_NM: {VARCHAR(60)} <br>
     * 荷揃処理名称
     * @param nizoroeProcNm The value of the column 'NIZOROE_PROC_NM'. (NullAllowed)
     */
    public void setNizoroeProcNm(String nizoroeProcNm) {
        __modifiedProperties.add("nizoroeProcNm");
        this._nizoroeProcNm = nizoroeProcNm;
    }

    /**
     * [get] PROGRAM_ID: {VARCHAR(60)} <br>
     * プログラムID
     * @return The value of the column 'PROGRAM_ID'. (NullAllowed)
     */
    public String getProgramId() {
        return _programId;
    }

    /**
     * [set] PROGRAM_ID: {VARCHAR(60)} <br>
     * プログラムID
     * @param programId The value of the column 'PROGRAM_ID'. (NullAllowed)
     */
    public void setProgramId(String programId) {
        __modifiedProperties.add("programId");
        this._programId = programId;
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
