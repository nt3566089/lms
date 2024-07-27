package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of b_class_grp as TABLE. <br>
 * 区分値グループマスタ
 * <pre>
 * [primary-key]
 *     CLASS_GRP_ID
 *
 * [column]
 *     CLASS_GRP_ID, CLASS_GRP_CD, CLASS_GRP_COMMENT, CLASS_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLASS_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_class
 *
 * [referrer-table]
 *     b_class_grp_dtl
 *
 * [foreign-property]
 *     bClass
 *
 * [referrer-property]
 *     bClassGrpDtlList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBClassGrpDto implements Serializable {

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
    /** CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _classGrpId;

    /** CLASS_GRP_CD: {+UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _classGrpCd;

    /** CLASS_GRP_COMMENT: {VARCHAR(60)} */
    @JsonKey
    protected String _classGrpComment;

    /** CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_class} */
    @JsonKey
    protected Long _classId;

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
    public BsBClassGrpDto() {
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
    protected BClassDto _bClass;

    public BClassDto getBClass() {
        return _bClass;
    }

    public void setBClass(BClassDto bClass) {
        this._bClass = bClass;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BClassGrpDtlDto> _bClassGrpDtlList;

    public List<BClassGrpDtlDto> getBClassGrpDtlList() {
        if (_bClassGrpDtlList == null) { _bClassGrpDtlList = new ArrayList<BClassGrpDtlDto>(); }
        return _bClassGrpDtlList;
    }

    public void setBClassGrpDtlList(List<BClassGrpDtlDto> bClassGrpDtlList) {
        this._bClassGrpDtlList = bClassGrpDtlList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBClassGrpDto)) { return false; }
        final BsBClassGrpDto otherEntity = (BsBClassGrpDto)other;
        if (!helpComparingValue(getClassGrpId(), otherEntity.getClassGrpId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "b_class_grp");
        result = xCH(result, getClassGrpId());
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
        sb.append(c).append(getClassGrpId());
        sb.append(c).append(getClassGrpCd());
        sb.append(c).append(getClassGrpComment());
        sb.append(c).append(getClassId());
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
     * [get] CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 区分値グループID
     * @return The value of the column 'CLASS_GRP_ID'. (NullAllowed)
     */
    public Long getClassGrpId() {
        return _classGrpId;
    }

    /**
     * [set] CLASS_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 区分値グループID
     * @param classGrpId The value of the column 'CLASS_GRP_ID'. (NullAllowed)
     */
    public void setClassGrpId(Long classGrpId) {
        __modifiedProperties.add("classGrpId");
        this._classGrpId = classGrpId;
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
     * [get] CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_class} <br>
     * 区分値ID
     * @return The value of the column 'CLASS_ID'. (NullAllowed)
     */
    public Long getClassId() {
        return _classId;
    }

    /**
     * [set] CLASS_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_class} <br>
     * 区分値ID
     * @param classId The value of the column 'CLASS_ID'. (NullAllowed)
     */
    public void setClassId(Long classId) {
        __modifiedProperties.add("classId");
        this._classId = classId;
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
