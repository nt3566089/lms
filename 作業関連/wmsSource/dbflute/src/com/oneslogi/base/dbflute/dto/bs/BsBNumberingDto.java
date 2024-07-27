package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of b_numbering as TABLE. <br>
 * 採番マスタ
 * <pre>
 * [primary-key]
 *     NUMBERING_ID
 *
 * [column]
 *     NUMBERING_ID, BIZ_CD, BIZ_NM, LENGTH, FIXED_VALUE, FIXED_DT_FORMAT, PRESENT_NUMBER, INC_NUMBER, MIN_NUMBER, MAX_NUMBER, CHECK_DIGIT, SYSTEM_TYPE, CASH_COUNT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NUMBERING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_class_dtl(ByCheckDigit)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bClassDtlByCheckDigit
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBNumberingDto implements Serializable {

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
    /** NUMBERING_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _numberingId;

    /** BIZ_CD: {UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _bizCd;

    /** BIZ_NM: {NotNull, VARCHAR(60)} */
    @JsonKey
    protected String _bizNm;

    /** LENGTH: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _length;

    /** FIXED_VALUE: {VARCHAR(30)} */
    @JsonKey
    protected String _fixedValue;

    /** FIXED_DT_FORMAT: {VARCHAR(30)} */
    @JsonKey
    protected String _fixedDtFormat;

    /** PRESENT_NUMBER: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _presentNumber;

    /** INC_NUMBER: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _incNumber;

    /** MIN_NUMBER: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _minNumber;

    /** MAX_NUMBER: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _maxNumber;

    /** CHECK_DIGIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=CheckDigit} */
    @JsonKey
    protected String _checkDigit;

    /** SYSTEM_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _systemType;

    /** CASH_COUNT: {BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _cashCount;

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
    public BsBNumberingDto() {
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
    protected BClassDtlDto _bClassDtlByCheckDigit;

    public BClassDtlDto getBClassDtlByCheckDigit() {
        return _bClassDtlByCheckDigit;
    }

    public void setBClassDtlByCheckDigit(BClassDtlDto bClassDtlByCheckDigit) {
        this._bClassDtlByCheckDigit = bClassDtlByCheckDigit;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBNumberingDto)) { return false; }
        final BsBNumberingDto otherEntity = (BsBNumberingDto)other;
        if (!helpComparingValue(getNumberingId(), otherEntity.getNumberingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "b_numbering");
        result = xCH(result, getNumberingId());
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
        sb.append(c).append(getNumberingId());
        sb.append(c).append(getBizCd());
        sb.append(c).append(getBizNm());
        sb.append(c).append(getLength());
        sb.append(c).append(getFixedValue());
        sb.append(c).append(getFixedDtFormat());
        sb.append(c).append(getPresentNumber());
        sb.append(c).append(getIncNumber());
        sb.append(c).append(getMinNumber());
        sb.append(c).append(getMaxNumber());
        sb.append(c).append(getCheckDigit());
        sb.append(c).append(getSystemType());
        sb.append(c).append(getCashCount());
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
     * [get] NUMBERING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 採番ID
     * @return The value of the column 'NUMBERING_ID'. (NullAllowed)
     */
    public Long getNumberingId() {
        return _numberingId;
    }

    /**
     * [set] NUMBERING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 採番ID
     * @param numberingId The value of the column 'NUMBERING_ID'. (NullAllowed)
     */
    public void setNumberingId(Long numberingId) {
        __modifiedProperties.add("numberingId");
        this._numberingId = numberingId;
    }

    /**
     * [get] BIZ_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 業務CD
     * @return The value of the column 'BIZ_CD'. (NullAllowed)
     */
    public String getBizCd() {
        return _bizCd;
    }

    /**
     * [set] BIZ_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 業務CD
     * @param bizCd The value of the column 'BIZ_CD'. (NullAllowed)
     */
    public void setBizCd(String bizCd) {
        __modifiedProperties.add("bizCd");
        this._bizCd = bizCd;
    }

    /**
     * [get] BIZ_NM: {NotNull, VARCHAR(60)} <br>
     * 業務名称
     * @return The value of the column 'BIZ_NM'. (NullAllowed)
     */
    public String getBizNm() {
        return _bizNm;
    }

    /**
     * [set] BIZ_NM: {NotNull, VARCHAR(60)} <br>
     * 業務名称
     * @param bizNm The value of the column 'BIZ_NM'. (NullAllowed)
     */
    public void setBizNm(String bizNm) {
        __modifiedProperties.add("bizNm");
        this._bizNm = bizNm;
    }

    /**
     * [get] LENGTH: {NotNull, BIGINT(19)} <br>
     * 桁数
     * @return The value of the column 'LENGTH'. (NullAllowed)
     */
    public Long getLength() {
        return _length;
    }

    /**
     * [set] LENGTH: {NotNull, BIGINT(19)} <br>
     * 桁数
     * @param length The value of the column 'LENGTH'. (NullAllowed)
     */
    public void setLength(Long length) {
        __modifiedProperties.add("length");
        this._length = length;
    }

    /**
     * [get] FIXED_VALUE: {VARCHAR(30)} <br>
     * 固定値
     * @return The value of the column 'FIXED_VALUE'. (NullAllowed)
     */
    public String getFixedValue() {
        return _fixedValue;
    }

    /**
     * [set] FIXED_VALUE: {VARCHAR(30)} <br>
     * 固定値
     * @param fixedValue The value of the column 'FIXED_VALUE'. (NullAllowed)
     */
    public void setFixedValue(String fixedValue) {
        __modifiedProperties.add("fixedValue");
        this._fixedValue = fixedValue;
    }

    /**
     * [get] FIXED_DT_FORMAT: {VARCHAR(30)} <br>
     * 固定日付フォーマット
     * @return The value of the column 'FIXED_DT_FORMAT'. (NullAllowed)
     */
    public String getFixedDtFormat() {
        return _fixedDtFormat;
    }

    /**
     * [set] FIXED_DT_FORMAT: {VARCHAR(30)} <br>
     * 固定日付フォーマット
     * @param fixedDtFormat The value of the column 'FIXED_DT_FORMAT'. (NullAllowed)
     */
    public void setFixedDtFormat(String fixedDtFormat) {
        __modifiedProperties.add("fixedDtFormat");
        this._fixedDtFormat = fixedDtFormat;
    }

    /**
     * [get] PRESENT_NUMBER: {NotNull, BIGINT(19)} <br>
     * 現在値
     * @return The value of the column 'PRESENT_NUMBER'. (NullAllowed)
     */
    public Long getPresentNumber() {
        return _presentNumber;
    }

    /**
     * [set] PRESENT_NUMBER: {NotNull, BIGINT(19)} <br>
     * 現在値
     * @param presentNumber The value of the column 'PRESENT_NUMBER'. (NullAllowed)
     */
    public void setPresentNumber(Long presentNumber) {
        __modifiedProperties.add("presentNumber");
        this._presentNumber = presentNumber;
    }

    /**
     * [get] INC_NUMBER: {NotNull, BIGINT(19)} <br>
     * 増分値
     * @return The value of the column 'INC_NUMBER'. (NullAllowed)
     */
    public Long getIncNumber() {
        return _incNumber;
    }

    /**
     * [set] INC_NUMBER: {NotNull, BIGINT(19)} <br>
     * 増分値
     * @param incNumber The value of the column 'INC_NUMBER'. (NullAllowed)
     */
    public void setIncNumber(Long incNumber) {
        __modifiedProperties.add("incNumber");
        this._incNumber = incNumber;
    }

    /**
     * [get] MIN_NUMBER: {NotNull, BIGINT(19)} <br>
     * 最小値
     * @return The value of the column 'MIN_NUMBER'. (NullAllowed)
     */
    public Long getMinNumber() {
        return _minNumber;
    }

    /**
     * [set] MIN_NUMBER: {NotNull, BIGINT(19)} <br>
     * 最小値
     * @param minNumber The value of the column 'MIN_NUMBER'. (NullAllowed)
     */
    public void setMinNumber(Long minNumber) {
        __modifiedProperties.add("minNumber");
        this._minNumber = minNumber;
    }

    /**
     * [get] MAX_NUMBER: {NotNull, BIGINT(19)} <br>
     * 最大値
     * @return The value of the column 'MAX_NUMBER'. (NullAllowed)
     */
    public Long getMaxNumber() {
        return _maxNumber;
    }

    /**
     * [set] MAX_NUMBER: {NotNull, BIGINT(19)} <br>
     * 最大値
     * @param maxNumber The value of the column 'MAX_NUMBER'. (NullAllowed)
     */
    public void setMaxNumber(Long maxNumber) {
        __modifiedProperties.add("maxNumber");
        this._maxNumber = maxNumber;
    }

    /**
     * [get] CHECK_DIGIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @return The value of the column 'CHECK_DIGIT'. (NullAllowed)
     */
    public String getCheckDigit() {
        return _checkDigit;
    }

    /**
     * [set] CHECK_DIGIT: {VARCHAR(30), FK to B_CLASS_DTL, classification=CheckDigit} <br>
     * チェックディジット
     * @param checkDigit The value of the column 'CHECK_DIGIT'. (NullAllowed)
     */
    public void setCheckDigit(String checkDigit) {
        __modifiedProperties.add("checkDigit");
        this._checkDigit = checkDigit;
    }

    /**
     * [get] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public String getSystemType() {
        return _systemType;
    }

    /**
     * [set] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public void setSystemType(String systemType) {
        __modifiedProperties.add("systemType");
        this._systemType = systemType;
    }

    /**
     * [get] CASH_COUNT: {BIGINT(19), default=[0]} <br>
     * キャッシュ数
     * @return The value of the column 'CASH_COUNT'. (NullAllowed)
     */
    public Long getCashCount() {
        return _cashCount;
    }

    /**
     * [set] CASH_COUNT: {BIGINT(19), default=[0]} <br>
     * キャッシュ数
     * @param cashCount The value of the column 'CASH_COUNT'. (NullAllowed)
     */
    public void setCashCount(Long cashCount) {
        __modifiedProperties.add("cashCount");
        this._cashCount = cashCount;
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
