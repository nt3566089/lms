package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_general as TABLE. <br>
 * 汎用マスタ
 * <pre>
 * [primary-key]
 *     GENERAL_ID
 *
 * [column]
 *     GENERAL_ID, CENTER_ID, CENTER_CD, GENERAL_MASTER_TYPE, GENERAL_MASTER_TYPE_NM, GENERAL_CD, GENERAL_NM, GENERAL_ABBR, CHARACTER1, CHARACTER2, CHARACTER3, CHARACTER4, CHARACTER5, CHARACTER6, CHARACTER7, CHARACTER8, CHARACTER9, CHARACTER10, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10, COMMENT1, COMMENT2, DEFAULT_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     GENERAL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMGeneralDto implements Serializable {

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
    /** GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _generalId;

    /** CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** CENTER_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _centerCd;

    /** GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} */
    @JsonKey
    protected String _generalMasterType;

    /** GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _generalMasterTypeNm;

    /** GENERAL_CD: {+UQ, VARCHAR(30)} */
    @JsonKey
    protected String _generalCd;

    /** GENERAL_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _generalNm;

    /** GENERAL_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _generalAbbr;

    /** CHARACTER1: {VARCHAR(100)} */
    @JsonKey
    protected String _character1;

    /** CHARACTER2: {VARCHAR(100)} */
    @JsonKey
    protected String _character2;

    /** CHARACTER3: {VARCHAR(100)} */
    @JsonKey
    protected String _character3;

    /** CHARACTER4: {VARCHAR(100)} */
    @JsonKey
    protected String _character4;

    /** CHARACTER5: {VARCHAR(100)} */
    @JsonKey
    protected String _character5;

    /** CHARACTER6: {VARCHAR(100)} */
    @JsonKey
    protected String _character6;

    /** CHARACTER7: {VARCHAR(100)} */
    @JsonKey
    protected String _character7;

    /** CHARACTER8: {VARCHAR(100)} */
    @JsonKey
    protected String _character8;

    /** CHARACTER9: {VARCHAR(100)} */
    @JsonKey
    protected String _character9;

    /** CHARACTER10: {VARCHAR(100)} */
    @JsonKey
    protected String _character10;

    /** NUM1: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num1;

    /** NUM2: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num2;

    /** NUM3: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num3;

    /** NUM4: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num4;

    /** NUM5: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num5;

    /** NUM6: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num6;

    /** NUM7: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num7;

    /** NUM8: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num8;

    /** NUM9: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num9;

    /** NUM10: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num10;

    /** COMMENT1: {VARCHAR(255)} */
    @JsonKey
    protected String _comment1;

    /** COMMENT2: {VARCHAR(255)} */
    @JsonKey
    protected String _comment2;

    /** DEFAULT_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _defaultType;

    /** SYSTEM_TYPE: {VARCHAR(30)} */
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
    public BsMGeneralDto() {
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMGeneralDto)) { return false; }
        final BsMGeneralDto otherEntity = (BsMGeneralDto)other;
        if (!helpComparingValue(getGeneralId(), otherEntity.getGeneralId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_general");
        result = xCH(result, getGeneralId());
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
        sb.append(c).append(getGeneralId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getGeneralMasterType());
        sb.append(c).append(getGeneralMasterTypeNm());
        sb.append(c).append(getGeneralCd());
        sb.append(c).append(getGeneralNm());
        sb.append(c).append(getGeneralAbbr());
        sb.append(c).append(getCharacter1());
        sb.append(c).append(getCharacter2());
        sb.append(c).append(getCharacter3());
        sb.append(c).append(getCharacter4());
        sb.append(c).append(getCharacter5());
        sb.append(c).append(getCharacter6());
        sb.append(c).append(getCharacter7());
        sb.append(c).append(getCharacter8());
        sb.append(c).append(getCharacter9());
        sb.append(c).append(getCharacter10());
        sb.append(c).append(getNum1());
        sb.append(c).append(getNum2());
        sb.append(c).append(getNum3());
        sb.append(c).append(getNum4());
        sb.append(c).append(getNum5());
        sb.append(c).append(getNum6());
        sb.append(c).append(getNum7());
        sb.append(c).append(getNum8());
        sb.append(c).append(getNum9());
        sb.append(c).append(getNum10());
        sb.append(c).append(getComment1());
        sb.append(c).append(getComment2());
        sb.append(c).append(getDefaultType());
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
     * [get] GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 汎用マスタID
     * @return The value of the column 'GENERAL_ID'. (NullAllowed)
     */
    public Long getGeneralId() {
        return _generalId;
    }

    /**
     * [set] GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 汎用マスタID
     * @param generalId The value of the column 'GENERAL_ID'. (NullAllowed)
     */
    public void setGeneralId(Long generalId) {
        __modifiedProperties.add("generalId");
        this._generalId = generalId;
    }

    /**
     * [get] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(100)} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(100)} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} <br>
     * 汎用マスタ区分
     * @return The value of the column 'GENERAL_MASTER_TYPE'. (NullAllowed)
     */
    public String getGeneralMasterType() {
        return _generalMasterType;
    }

    /**
     * [set] GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} <br>
     * 汎用マスタ区分
     * @param generalMasterType The value of the column 'GENERAL_MASTER_TYPE'. (NullAllowed)
     */
    public void setGeneralMasterType(String generalMasterType) {
        __modifiedProperties.add("generalMasterType");
        this._generalMasterType = generalMasterType;
    }

    /**
     * [get] GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} <br>
     * 汎用マスタ区分名称
     * @return The value of the column 'GENERAL_MASTER_TYPE_NM'. (NullAllowed)
     */
    public String getGeneralMasterTypeNm() {
        return _generalMasterTypeNm;
    }

    /**
     * [set] GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} <br>
     * 汎用マスタ区分名称
     * @param generalMasterTypeNm The value of the column 'GENERAL_MASTER_TYPE_NM'. (NullAllowed)
     */
    public void setGeneralMasterTypeNm(String generalMasterTypeNm) {
        __modifiedProperties.add("generalMasterTypeNm");
        this._generalMasterTypeNm = generalMasterTypeNm;
    }

    /**
     * [get] GENERAL_CD: {+UQ, VARCHAR(30)} <br>
     * 汎用CD
     * @return The value of the column 'GENERAL_CD'. (NullAllowed)
     */
    public String getGeneralCd() {
        return _generalCd;
    }

    /**
     * [set] GENERAL_CD: {+UQ, VARCHAR(30)} <br>
     * 汎用CD
     * @param generalCd The value of the column 'GENERAL_CD'. (NullAllowed)
     */
    public void setGeneralCd(String generalCd) {
        __modifiedProperties.add("generalCd");
        this._generalCd = generalCd;
    }

    /**
     * [get] GENERAL_NM: {VARCHAR(60)} <br>
     * 汎用名称
     * @return The value of the column 'GENERAL_NM'. (NullAllowed)
     */
    public String getGeneralNm() {
        return _generalNm;
    }

    /**
     * [set] GENERAL_NM: {VARCHAR(60)} <br>
     * 汎用名称
     * @param generalNm The value of the column 'GENERAL_NM'. (NullAllowed)
     */
    public void setGeneralNm(String generalNm) {
        __modifiedProperties.add("generalNm");
        this._generalNm = generalNm;
    }

    /**
     * [get] GENERAL_ABBR: {VARCHAR(60)} <br>
     * 汎用略称
     * @return The value of the column 'GENERAL_ABBR'. (NullAllowed)
     */
    public String getGeneralAbbr() {
        return _generalAbbr;
    }

    /**
     * [set] GENERAL_ABBR: {VARCHAR(60)} <br>
     * 汎用略称
     * @param generalAbbr The value of the column 'GENERAL_ABBR'. (NullAllowed)
     */
    public void setGeneralAbbr(String generalAbbr) {
        __modifiedProperties.add("generalAbbr");
        this._generalAbbr = generalAbbr;
    }

    /**
     * [get] CHARACTER1: {VARCHAR(100)} <br>
     * キャラクタ１
     * @return The value of the column 'CHARACTER1'. (NullAllowed)
     */
    public String getCharacter1() {
        return _character1;
    }

    /**
     * [set] CHARACTER1: {VARCHAR(100)} <br>
     * キャラクタ１
     * @param character1 The value of the column 'CHARACTER1'. (NullAllowed)
     */
    public void setCharacter1(String character1) {
        __modifiedProperties.add("character1");
        this._character1 = character1;
    }

    /**
     * [get] CHARACTER2: {VARCHAR(100)} <br>
     * キャラクタ２
     * @return The value of the column 'CHARACTER2'. (NullAllowed)
     */
    public String getCharacter2() {
        return _character2;
    }

    /**
     * [set] CHARACTER2: {VARCHAR(100)} <br>
     * キャラクタ２
     * @param character2 The value of the column 'CHARACTER2'. (NullAllowed)
     */
    public void setCharacter2(String character2) {
        __modifiedProperties.add("character2");
        this._character2 = character2;
    }

    /**
     * [get] CHARACTER3: {VARCHAR(100)} <br>
     * キャラクタ３
     * @return The value of the column 'CHARACTER3'. (NullAllowed)
     */
    public String getCharacter3() {
        return _character3;
    }

    /**
     * [set] CHARACTER3: {VARCHAR(100)} <br>
     * キャラクタ３
     * @param character3 The value of the column 'CHARACTER3'. (NullAllowed)
     */
    public void setCharacter3(String character3) {
        __modifiedProperties.add("character3");
        this._character3 = character3;
    }

    /**
     * [get] CHARACTER4: {VARCHAR(100)} <br>
     * キャラクタ４
     * @return The value of the column 'CHARACTER4'. (NullAllowed)
     */
    public String getCharacter4() {
        return _character4;
    }

    /**
     * [set] CHARACTER4: {VARCHAR(100)} <br>
     * キャラクタ４
     * @param character4 The value of the column 'CHARACTER4'. (NullAllowed)
     */
    public void setCharacter4(String character4) {
        __modifiedProperties.add("character4");
        this._character4 = character4;
    }

    /**
     * [get] CHARACTER5: {VARCHAR(100)} <br>
     * キャラクタ５
     * @return The value of the column 'CHARACTER5'. (NullAllowed)
     */
    public String getCharacter5() {
        return _character5;
    }

    /**
     * [set] CHARACTER5: {VARCHAR(100)} <br>
     * キャラクタ５
     * @param character5 The value of the column 'CHARACTER5'. (NullAllowed)
     */
    public void setCharacter5(String character5) {
        __modifiedProperties.add("character5");
        this._character5 = character5;
    }

    /**
     * [get] CHARACTER6: {VARCHAR(100)} <br>
     * キャラクタ６
     * @return The value of the column 'CHARACTER6'. (NullAllowed)
     */
    public String getCharacter6() {
        return _character6;
    }

    /**
     * [set] CHARACTER6: {VARCHAR(100)} <br>
     * キャラクタ６
     * @param character6 The value of the column 'CHARACTER6'. (NullAllowed)
     */
    public void setCharacter6(String character6) {
        __modifiedProperties.add("character6");
        this._character6 = character6;
    }

    /**
     * [get] CHARACTER7: {VARCHAR(100)} <br>
     * キャラクタ７
     * @return The value of the column 'CHARACTER7'. (NullAllowed)
     */
    public String getCharacter7() {
        return _character7;
    }

    /**
     * [set] CHARACTER7: {VARCHAR(100)} <br>
     * キャラクタ７
     * @param character7 The value of the column 'CHARACTER7'. (NullAllowed)
     */
    public void setCharacter7(String character7) {
        __modifiedProperties.add("character7");
        this._character7 = character7;
    }

    /**
     * [get] CHARACTER8: {VARCHAR(100)} <br>
     * キャラクタ８
     * @return The value of the column 'CHARACTER8'. (NullAllowed)
     */
    public String getCharacter8() {
        return _character8;
    }

    /**
     * [set] CHARACTER8: {VARCHAR(100)} <br>
     * キャラクタ８
     * @param character8 The value of the column 'CHARACTER8'. (NullAllowed)
     */
    public void setCharacter8(String character8) {
        __modifiedProperties.add("character8");
        this._character8 = character8;
    }

    /**
     * [get] CHARACTER9: {VARCHAR(100)} <br>
     * キャラクタ９
     * @return The value of the column 'CHARACTER9'. (NullAllowed)
     */
    public String getCharacter9() {
        return _character9;
    }

    /**
     * [set] CHARACTER9: {VARCHAR(100)} <br>
     * キャラクタ９
     * @param character9 The value of the column 'CHARACTER9'. (NullAllowed)
     */
    public void setCharacter9(String character9) {
        __modifiedProperties.add("character9");
        this._character9 = character9;
    }

    /**
     * [get] CHARACTER10: {VARCHAR(100)} <br>
     * キャラクタ１０
     * @return The value of the column 'CHARACTER10'. (NullAllowed)
     */
    public String getCharacter10() {
        return _character10;
    }

    /**
     * [set] CHARACTER10: {VARCHAR(100)} <br>
     * キャラクタ１０
     * @param character10 The value of the column 'CHARACTER10'. (NullAllowed)
     */
    public void setCharacter10(String character10) {
        __modifiedProperties.add("character10");
        this._character10 = character10;
    }

    /**
     * [get] NUM1: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１
     * @return The value of the column 'NUM1'. (NullAllowed)
     */
    public java.math.BigDecimal getNum1() {
        return _num1;
    }

    /**
     * [set] NUM1: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１
     * @param num1 The value of the column 'NUM1'. (NullAllowed)
     */
    public void setNum1(java.math.BigDecimal num1) {
        __modifiedProperties.add("num1");
        this._num1 = num1;
    }

    /**
     * [get] NUM2: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー２
     * @return The value of the column 'NUM2'. (NullAllowed)
     */
    public java.math.BigDecimal getNum2() {
        return _num2;
    }

    /**
     * [set] NUM2: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー２
     * @param num2 The value of the column 'NUM2'. (NullAllowed)
     */
    public void setNum2(java.math.BigDecimal num2) {
        __modifiedProperties.add("num2");
        this._num2 = num2;
    }

    /**
     * [get] NUM3: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー３
     * @return The value of the column 'NUM3'. (NullAllowed)
     */
    public java.math.BigDecimal getNum3() {
        return _num3;
    }

    /**
     * [set] NUM3: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー３
     * @param num3 The value of the column 'NUM3'. (NullAllowed)
     */
    public void setNum3(java.math.BigDecimal num3) {
        __modifiedProperties.add("num3");
        this._num3 = num3;
    }

    /**
     * [get] NUM4: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー４
     * @return The value of the column 'NUM4'. (NullAllowed)
     */
    public java.math.BigDecimal getNum4() {
        return _num4;
    }

    /**
     * [set] NUM4: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー４
     * @param num4 The value of the column 'NUM4'. (NullAllowed)
     */
    public void setNum4(java.math.BigDecimal num4) {
        __modifiedProperties.add("num4");
        this._num4 = num4;
    }

    /**
     * [get] NUM5: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー５
     * @return The value of the column 'NUM5'. (NullAllowed)
     */
    public java.math.BigDecimal getNum5() {
        return _num5;
    }

    /**
     * [set] NUM5: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー５
     * @param num5 The value of the column 'NUM5'. (NullAllowed)
     */
    public void setNum5(java.math.BigDecimal num5) {
        __modifiedProperties.add("num5");
        this._num5 = num5;
    }

    /**
     * [get] NUM6: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー６
     * @return The value of the column 'NUM6'. (NullAllowed)
     */
    public java.math.BigDecimal getNum6() {
        return _num6;
    }

    /**
     * [set] NUM6: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー６
     * @param num6 The value of the column 'NUM6'. (NullAllowed)
     */
    public void setNum6(java.math.BigDecimal num6) {
        __modifiedProperties.add("num6");
        this._num6 = num6;
    }

    /**
     * [get] NUM7: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー７
     * @return The value of the column 'NUM7'. (NullAllowed)
     */
    public java.math.BigDecimal getNum7() {
        return _num7;
    }

    /**
     * [set] NUM7: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー７
     * @param num7 The value of the column 'NUM7'. (NullAllowed)
     */
    public void setNum7(java.math.BigDecimal num7) {
        __modifiedProperties.add("num7");
        this._num7 = num7;
    }

    /**
     * [get] NUM8: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー８
     * @return The value of the column 'NUM8'. (NullAllowed)
     */
    public java.math.BigDecimal getNum8() {
        return _num8;
    }

    /**
     * [set] NUM8: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー８
     * @param num8 The value of the column 'NUM8'. (NullAllowed)
     */
    public void setNum8(java.math.BigDecimal num8) {
        __modifiedProperties.add("num8");
        this._num8 = num8;
    }

    /**
     * [get] NUM9: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー９
     * @return The value of the column 'NUM9'. (NullAllowed)
     */
    public java.math.BigDecimal getNum9() {
        return _num9;
    }

    /**
     * [set] NUM9: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー９
     * @param num9 The value of the column 'NUM9'. (NullAllowed)
     */
    public void setNum9(java.math.BigDecimal num9) {
        __modifiedProperties.add("num9");
        this._num9 = num9;
    }

    /**
     * [get] NUM10: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１０
     * @return The value of the column 'NUM10'. (NullAllowed)
     */
    public java.math.BigDecimal getNum10() {
        return _num10;
    }

    /**
     * [set] NUM10: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１０
     * @param num10 The value of the column 'NUM10'. (NullAllowed)
     */
    public void setNum10(java.math.BigDecimal num10) {
        __modifiedProperties.add("num10");
        this._num10 = num10;
    }

    /**
     * [get] COMMENT1: {VARCHAR(255)} <br>
     * コメント１
     * @return The value of the column 'COMMENT1'. (NullAllowed)
     */
    public String getComment1() {
        return _comment1;
    }

    /**
     * [set] COMMENT1: {VARCHAR(255)} <br>
     * コメント１
     * @param comment1 The value of the column 'COMMENT1'. (NullAllowed)
     */
    public void setComment1(String comment1) {
        __modifiedProperties.add("comment1");
        this._comment1 = comment1;
    }

    /**
     * [get] COMMENT2: {VARCHAR(255)} <br>
     * コメント２
     * @return The value of the column 'COMMENT2'. (NullAllowed)
     */
    public String getComment2() {
        return _comment2;
    }

    /**
     * [set] COMMENT2: {VARCHAR(255)} <br>
     * コメント２
     * @param comment2 The value of the column 'COMMENT2'. (NullAllowed)
     */
    public void setComment2(String comment2) {
        __modifiedProperties.add("comment2");
        this._comment2 = comment2;
    }

    /**
     * [get] DEFAULT_TYPE: {VARCHAR(30)} <br>
     * デフォルト区分
     * @return The value of the column 'DEFAULT_TYPE'. (NullAllowed)
     */
    public String getDefaultType() {
        return _defaultType;
    }

    /**
     * [set] DEFAULT_TYPE: {VARCHAR(30)} <br>
     * デフォルト区分
     * @param defaultType The value of the column 'DEFAULT_TYPE'. (NullAllowed)
     */
    public void setDefaultType(String defaultType) {
        __modifiedProperties.add("defaultType");
        this._defaultType = defaultType;
    }

    /**
     * [get] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム区分
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public String getSystemType() {
        return _systemType;
    }

    /**
     * [set] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム区分
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
