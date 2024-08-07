package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_data_input_type_b as TABLE. <br>
 * 初期データ取込種別ボディマスタ
 * <pre>
 * [primary-key]
 *     DATA_INPUT_TYPE_B_ID
 *
 * [column]
 *     DATA_INPUT_TYPE_B_ID, DATA_INPUT_TYPE_ID, COL_NO, COL_NM, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DATA_INPUT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_data_input_type
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mDataInputType
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMDataInputTypeBDto implements Serializable {

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
    /** DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _dataInputTypeBId;

    /** DATA_INPUT_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_data_input_type} */
    @JsonKey
    protected Long _dataInputTypeId;

    /** COL_NO: {BIGINT(19)} */
    @JsonKey
    protected Long _colNo;

    /** COL_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _colNm;

    /** UPLOAD_COLUMN_NM: {VARCHAR(100)} */
    @JsonKey
    protected String _uploadColumnNm;

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
    public BsMDataInputTypeBDto() {
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
    protected MDataInputTypeDto _mDataInputType;

    public MDataInputTypeDto getMDataInputType() {
        return _mDataInputType;
    }

    public void setMDataInputType(MDataInputTypeDto mDataInputType) {
        this._mDataInputType = mDataInputType;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMDataInputTypeBDto)) { return false; }
        final BsMDataInputTypeBDto otherEntity = (BsMDataInputTypeBDto)other;
        if (!helpComparingValue(getDataInputTypeBId(), otherEntity.getDataInputTypeBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_data_input_type_b");
        result = xCH(result, getDataInputTypeBId());
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
        sb.append(c).append(getDataInputTypeBId());
        sb.append(c).append(getDataInputTypeId());
        sb.append(c).append(getColNo());
        sb.append(c).append(getColNm());
        sb.append(c).append(getUploadColumnNm());
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
     * [get] DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 初期データ取込種別ボディID
     * @return The value of the column 'DATA_INPUT_TYPE_B_ID'. (NullAllowed)
     */
    public Long getDataInputTypeBId() {
        return _dataInputTypeBId;
    }

    /**
     * [set] DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 初期データ取込種別ボディID
     * @param dataInputTypeBId The value of the column 'DATA_INPUT_TYPE_B_ID'. (NullAllowed)
     */
    public void setDataInputTypeBId(Long dataInputTypeBId) {
        __modifiedProperties.add("dataInputTypeBId");
        this._dataInputTypeBId = dataInputTypeBId;
    }

    /**
     * [get] DATA_INPUT_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_data_input_type} <br>
     * 初期データ取込種別ID
     * @return The value of the column 'DATA_INPUT_TYPE_ID'. (NullAllowed)
     */
    public Long getDataInputTypeId() {
        return _dataInputTypeId;
    }

    /**
     * [set] DATA_INPUT_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_data_input_type} <br>
     * 初期データ取込種別ID
     * @param dataInputTypeId The value of the column 'DATA_INPUT_TYPE_ID'. (NullAllowed)
     */
    public void setDataInputTypeId(Long dataInputTypeId) {
        __modifiedProperties.add("dataInputTypeId");
        this._dataInputTypeId = dataInputTypeId;
    }

    /**
     * [get] COL_NO: {BIGINT(19)} <br>
     * 列番号
     * @return The value of the column 'COL_NO'. (NullAllowed)
     */
    public Long getColNo() {
        return _colNo;
    }

    /**
     * [set] COL_NO: {BIGINT(19)} <br>
     * 列番号
     * @param colNo The value of the column 'COL_NO'. (NullAllowed)
     */
    public void setColNo(Long colNo) {
        __modifiedProperties.add("colNo");
        this._colNo = colNo;
    }

    /**
     * [get] COL_NM: {VARCHAR(60)} <br>
     * 列名称
     * @return The value of the column 'COL_NM'. (NullAllowed)
     */
    public String getColNm() {
        return _colNm;
    }

    /**
     * [set] COL_NM: {VARCHAR(60)} <br>
     * 列名称
     * @param colNm The value of the column 'COL_NM'. (NullAllowed)
     */
    public void setColNm(String colNm) {
        __modifiedProperties.add("colNm");
        this._colNm = colNm;
    }

    /**
     * [get] UPLOAD_COLUMN_NM: {VARCHAR(100)} <br>
     * アップロード列名
     * @return The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed)
     */
    public String getUploadColumnNm() {
        return _uploadColumnNm;
    }

    /**
     * [set] UPLOAD_COLUMN_NM: {VARCHAR(100)} <br>
     * アップロード列名
     * @param uploadColumnNm The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed)
     */
    public void setUploadColumnNm(String uploadColumnNm) {
        __modifiedProperties.add("uploadColumnNm");
        this._uploadColumnNm = uploadColumnNm;
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
