package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of h_location_attribute as TABLE. <br>
 * ロケーション属性履歴
 * <pre>
 * [primary-key]
 *     LOCATION_ATTRIBUTE_ID
 *
 * [column]
 *     LOCATION_ATTRIBUTE_ID, CENTER_ID, LOCATION_ID, HIST_NO, PREV_LOCATION_HIST, CURT_LOCATION_HIST, HIST_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, m_location
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mLocation
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsHLocationAttributeDto implements Serializable {

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
    /** LOCATION_ATTRIBUTE_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _locationAttributeId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** HIST_NO: {BIGINT(19)} */
    @JsonKey
    protected Long _histNo;

    /** PREV_LOCATION_HIST: {VARCHAR(30)} */
    @JsonKey
    protected String _prevLocationHist;

    /** CURT_LOCATION_HIST: {VARCHAR(30)} */
    @JsonKey
    protected String _curtLocationHist;

    /** HIST_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _histDt;

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
    public BsHLocationAttributeDto() {
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

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHLocationAttributeDto)) { return false; }
        final BsHLocationAttributeDto otherEntity = (BsHLocationAttributeDto)other;
        if (!helpComparingValue(getLocationAttributeId(), otherEntity.getLocationAttributeId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "h_location_attribute");
        result = xCH(result, getLocationAttributeId());
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
        sb.append(c).append(getLocationAttributeId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getHistNo());
        sb.append(c).append(getPrevLocationHist());
        sb.append(c).append(getCurtLocationHist());
        sb.append(c).append(getHistDt());
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
     * [get] LOCATION_ATTRIBUTE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション属性ID
     * @return The value of the column 'LOCATION_ATTRIBUTE_ID'. (NullAllowed)
     */
    public Long getLocationAttributeId() {
        return _locationAttributeId;
    }

    /**
     * [set] LOCATION_ATTRIBUTE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション属性ID
     * @param locationAttributeId The value of the column 'LOCATION_ATTRIBUTE_ID'. (NullAllowed)
     */
    public void setLocationAttributeId(Long locationAttributeId) {
        __modifiedProperties.add("locationAttributeId");
        this._locationAttributeId = locationAttributeId;
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
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] HIST_NO: {BIGINT(19)} <br>
     * 履歴番号
     * @return The value of the column 'HIST_NO'. (NullAllowed)
     */
    public Long getHistNo() {
        return _histNo;
    }

    /**
     * [set] HIST_NO: {BIGINT(19)} <br>
     * 履歴番号
     * @param histNo The value of the column 'HIST_NO'. (NullAllowed)
     */
    public void setHistNo(Long histNo) {
        __modifiedProperties.add("histNo");
        this._histNo = histNo;
    }

    /**
     * [get] PREV_LOCATION_HIST: {VARCHAR(30)} <br>
     * 前回ロケーション履歴
     * @return The value of the column 'PREV_LOCATION_HIST'. (NullAllowed)
     */
    public String getPrevLocationHist() {
        return _prevLocationHist;
    }

    /**
     * [set] PREV_LOCATION_HIST: {VARCHAR(30)} <br>
     * 前回ロケーション履歴
     * @param prevLocationHist The value of the column 'PREV_LOCATION_HIST'. (NullAllowed)
     */
    public void setPrevLocationHist(String prevLocationHist) {
        __modifiedProperties.add("prevLocationHist");
        this._prevLocationHist = prevLocationHist;
    }

    /**
     * [get] CURT_LOCATION_HIST: {VARCHAR(30)} <br>
     * 今回ロケーション履歴
     * @return The value of the column 'CURT_LOCATION_HIST'. (NullAllowed)
     */
    public String getCurtLocationHist() {
        return _curtLocationHist;
    }

    /**
     * [set] CURT_LOCATION_HIST: {VARCHAR(30)} <br>
     * 今回ロケーション履歴
     * @param curtLocationHist The value of the column 'CURT_LOCATION_HIST'. (NullAllowed)
     */
    public void setCurtLocationHist(String curtLocationHist) {
        __modifiedProperties.add("curtLocationHist");
        this._curtLocationHist = curtLocationHist;
    }

    /**
     * [get] HIST_DT: {VARCHAR(8)} <br>
     * 履歴日
     * @return The value of the column 'HIST_DT'. (NullAllowed)
     */
    public String getHistDt() {
        return _histDt;
    }

    /**
     * [set] HIST_DT: {VARCHAR(8)} <br>
     * 履歴日
     * @param histDt The value of the column 'HIST_DT'. (NullAllowed)
     */
    public void setHistDt(String histDt) {
        __modifiedProperties.add("histDt");
        this._histDt = histDt;
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
