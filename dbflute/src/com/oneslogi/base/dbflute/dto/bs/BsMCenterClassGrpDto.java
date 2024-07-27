package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_center_class_grp as TABLE. <br>
 * センタ区分値グループマスタ
 * <pre>
 * [primary-key]
 *     CENTER_CLASS_GRP_ID
 *
 * [column]
 *     CENTER_CLASS_GRP_ID, CLASS_GRP_CD, CLASS_GRP_COMMENT, CENTER_CLASS_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_CLASS_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center_class
 *
 * [referrer-table]
 *     m_center_class_grp_dtl
 *
 * [foreign-property]
 *     mCenterClass
 *
 * [referrer-property]
 *     mCenterClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCenterClassGrpDto implements Serializable {

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
    /** CENTER_CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _centerClassGrpId;

    /** CLASS_GRP_CD: {+UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _classGrpCd;

    /** CLASS_GRP_COMMENT: {VARCHAR(60)} */
    @JsonKey
    protected String _classGrpComment;

    /** CENTER_CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_center_class} */
    @JsonKey
    protected Long _centerClassId;

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
    public BsMCenterClassGrpDto() {
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
    protected MCenterClassDto _mCenterClass;

    public MCenterClassDto getMCenterClass() {
        return _mCenterClass;
    }

    public void setMCenterClass(MCenterClassDto mCenterClass) {
        this._mCenterClass = mCenterClass;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MCenterClassGrpDtlDto> _mCenterClassGrpDtlList;

    public List<MCenterClassGrpDtlDto> getMCenterClassGrpDtlList() {
        if (_mCenterClassGrpDtlList == null) { _mCenterClassGrpDtlList = new ArrayList<MCenterClassGrpDtlDto>(); }
        return _mCenterClassGrpDtlList;
    }

    public void setMCenterClassGrpDtlList(List<MCenterClassGrpDtlDto> mCenterClassGrpDtlList) {
        this._mCenterClassGrpDtlList = mCenterClassGrpDtlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCenterClassGrpDto)) { return false; }
        final BsMCenterClassGrpDto otherEntity = (BsMCenterClassGrpDto)other;
        if (!helpComparingValue(getCenterClassGrpId(), otherEntity.getCenterClassGrpId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_center_class_grp");
        result = xCH(result, getCenterClassGrpId());
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
        sb.append(c).append(getCenterClassGrpId());
        sb.append(c).append(getClassGrpCd());
        sb.append(c).append(getClassGrpComment());
        sb.append(c).append(getCenterClassId());
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
     * [get] CENTER_CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタ区分値グループID
     * @return The value of the column 'CENTER_CLASS_GRP_ID'. (NullAllowed)
     */
    public Long getCenterClassGrpId() {
        return _centerClassGrpId;
    }

    /**
     * [set] CENTER_CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * センタ区分値グループID
     * @param centerClassGrpId The value of the column 'CENTER_CLASS_GRP_ID'. (NullAllowed)
     */
    public void setCenterClassGrpId(Long centerClassGrpId) {
        __modifiedProperties.add("centerClassGrpId");
        this._centerClassGrpId = centerClassGrpId;
    }

    /**
     * [get] CLASS_GRP_CD: {+UQ, NotNull, VARCHAR(30)} <br>
     * 区分値グループCD
     * @return The value of the column 'CLASS_GRP_CD'. (NullAllowed)
     */
    public String getClassGrpCd() {
        return _classGrpCd;
    }

    /**
     * [set] CLASS_GRP_CD: {+UQ, NotNull, VARCHAR(30)} <br>
     * 区分値グループCD
     * @param classGrpCd The value of the column 'CLASS_GRP_CD'. (NullAllowed)
     */
    public void setClassGrpCd(String classGrpCd) {
        __modifiedProperties.add("classGrpCd");
        this._classGrpCd = classGrpCd;
    }

    /**
     * [get] CLASS_GRP_COMMENT: {VARCHAR(60)} <br>
     * 区分値グループ解説
     * @return The value of the column 'CLASS_GRP_COMMENT'. (NullAllowed)
     */
    public String getClassGrpComment() {
        return _classGrpComment;
    }

    /**
     * [set] CLASS_GRP_COMMENT: {VARCHAR(60)} <br>
     * 区分値グループ解説
     * @param classGrpComment The value of the column 'CLASS_GRP_COMMENT'. (NullAllowed)
     */
    public void setClassGrpComment(String classGrpComment) {
        __modifiedProperties.add("classGrpComment");
        this._classGrpComment = classGrpComment;
    }

    /**
     * [get] CENTER_CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_center_class} <br>
     * センタ区分値ID
     * @return The value of the column 'CENTER_CLASS_ID'. (NullAllowed)
     */
    public Long getCenterClassId() {
        return _centerClassId;
    }

    /**
     * [set] CENTER_CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_center_class} <br>
     * センタ区分値ID
     * @param centerClassId The value of the column 'CENTER_CLASS_ID'. (NullAllowed)
     */
    public void setCenterClassId(Long centerClassId) {
        __modifiedProperties.add("centerClassId");
        this._centerClassId = centerClassId;
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