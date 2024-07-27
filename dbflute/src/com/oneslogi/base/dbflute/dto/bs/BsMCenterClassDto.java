package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_center_class as TABLE. <br>
 * センタ区分値マスタ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_ID
 *
 * [column]
 *     CENTER_CLASS_ID, CENTER_ID, CLASS_CD, CLASS_COMMENT, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, b_class_dtl(BySystemType)
 *
 * [referrer-table]
 *     m_center_class_dtl, m_center_class_grp
 *
 * [foreign-property]
 *     mCenter, bClassDtlBySystemType
 *
 * [referrer-property]
 *     mCenterClassDtlList, mCenterClassGrpList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterClassDto implements Serializable {

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
    /** CENTER_CLASS_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _centerClassId;

    /** CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** CLASS_CD: {+UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _classCd;

    /** CLASS_COMMENT: {VARCHAR(60)} */
    @JsonKey
    protected String _classComment;

    /** SYSTEM_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=SystemType} */
    @JsonKey
    protected String _systemType;

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
    public BsMCenterClassDto() {
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

    protected BClassDtlDto _bClassDtlBySystemType;

    public BClassDtlDto getBClassDtlBySystemType() {
        return _bClassDtlBySystemType;
    }

    public void setBClassDtlBySystemType(BClassDtlDto bClassDtlBySystemType) {
        this._bClassDtlBySystemType = bClassDtlBySystemType;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MCenterClassDtlDto> _mCenterClassDtlList;

    public List<MCenterClassDtlDto> getMCenterClassDtlList() {
        if (_mCenterClassDtlList == null) { _mCenterClassDtlList = new ArrayList<MCenterClassDtlDto>(); }
        return _mCenterClassDtlList;
    }

    public void setMCenterClassDtlList(List<MCenterClassDtlDto> mCenterClassDtlList) {
        this._mCenterClassDtlList = mCenterClassDtlList;
    }

    protected List<MCenterClassGrpDto> _mCenterClassGrpList;

    public List<MCenterClassGrpDto> getMCenterClassGrpList() {
        if (_mCenterClassGrpList == null) { _mCenterClassGrpList = new ArrayList<MCenterClassGrpDto>(); }
        return _mCenterClassGrpList;
    }

    public void setMCenterClassGrpList(List<MCenterClassGrpDto> mCenterClassGrpList) {
        this._mCenterClassGrpList = mCenterClassGrpList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterClassDto)) { return false; }
        final BsMCenterClassDto otherEntity = (BsMCenterClassDto)other;
        if (!helpComparingValue(getCenterClassId(), otherEntity.getCenterClassId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_center_class");
        result = xCH(result, getCenterClassId());
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
        sb.append(c).append(getCenterClassId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClassCd());
        sb.append(c).append(getClassComment());
        sb.append(c).append(getSystemType());
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
     * [get] CENTER_CLASS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタ区分値ID
     * @return The value of the column 'CENTER_CLASS_ID'. (NullAllowed)
     */
    public Long getCenterClassId() {
        return _centerClassId;
    }

    /**
     * [set] CENTER_CLASS_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタ区分値ID
     * @param centerClassId The value of the column 'CENTER_CLASS_ID'. (NullAllowed)
     */
    public void setCenterClassId(Long centerClassId) {
        __modifiedProperties.add("centerClassId");
        this._centerClassId = centerClassId;
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
     * [get] CLASS_CD: {+UQ, NotNull, VARCHAR(30)} <br>
     * 区分値CD
     * @return The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public String getClassCd() {
        return _classCd;
    }

    /**
     * [set] CLASS_CD: {+UQ, NotNull, VARCHAR(30)} <br>
     * 区分値CD
     * @param classCd The value of the column 'CLASS_CD'. (NullAllowed)
     */
    public void setClassCd(String classCd) {
        __modifiedProperties.add("classCd");
        this._classCd = classCd;
    }

    /**
     * [get] CLASS_COMMENT: {VARCHAR(60)} <br>
     * 区分値解説
     * @return The value of the column 'CLASS_COMMENT'. (NullAllowed)
     */
    public String getClassComment() {
        return _classComment;
    }

    /**
     * [set] CLASS_COMMENT: {VARCHAR(60)} <br>
     * 区分値解説
     * @param classComment The value of the column 'CLASS_COMMENT'. (NullAllowed)
     */
    public void setClassComment(String classComment) {
        __modifiedProperties.add("classComment");
        this._classComment = classComment;
    }

    /**
     * [get] SYSTEM_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public String getSystemType() {
        return _systemType;
    }

    /**
     * [set] SYSTEM_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public void setSystemType(String systemType) {
        __modifiedProperties.add("systemType");
        this._systemType = systemType;
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