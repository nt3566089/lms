package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of m_general as TABLE. <br>
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
 * [foreign table]
 *     m_center
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long generalId = entity.getGeneralId();
 * Long centerId = entity.getCenterId();
 * String centerCd = entity.getCenterCd();
 * String generalMasterType = entity.getGeneralMasterType();
 * String generalMasterTypeNm = entity.getGeneralMasterTypeNm();
 * String generalCd = entity.getGeneralCd();
 * String generalNm = entity.getGeneralNm();
 * String generalAbbr = entity.getGeneralAbbr();
 * String character1 = entity.getCharacter1();
 * String character2 = entity.getCharacter2();
 * String character3 = entity.getCharacter3();
 * String character4 = entity.getCharacter4();
 * String character5 = entity.getCharacter5();
 * String character6 = entity.getCharacter6();
 * String character7 = entity.getCharacter7();
 * String character8 = entity.getCharacter8();
 * String character9 = entity.getCharacter9();
 * String character10 = entity.getCharacter10();
 * java.math.BigDecimal num1 = entity.getNum1();
 * java.math.BigDecimal num2 = entity.getNum2();
 * java.math.BigDecimal num3 = entity.getNum3();
 * java.math.BigDecimal num4 = entity.getNum4();
 * java.math.BigDecimal num5 = entity.getNum5();
 * java.math.BigDecimal num6 = entity.getNum6();
 * java.math.BigDecimal num7 = entity.getNum7();
 * java.math.BigDecimal num8 = entity.getNum8();
 * java.math.BigDecimal num9 = entity.getNum9();
 * java.math.BigDecimal num10 = entity.getNum10();
 * String comment1 = entity.getComment1();
 * String comment2 = entity.getComment2();
 * String defaultType = entity.getDefaultType();
 * String systemType = entity.getSystemType();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setGeneralId(generalId);
 * entity.setCenterId(centerId);
 * entity.setCenterCd(centerCd);
 * entity.setGeneralMasterType(generalMasterType);
 * entity.setGeneralMasterTypeNm(generalMasterTypeNm);
 * entity.setGeneralCd(generalCd);
 * entity.setGeneralNm(generalNm);
 * entity.setGeneralAbbr(generalAbbr);
 * entity.setCharacter1(character1);
 * entity.setCharacter2(character2);
 * entity.setCharacter3(character3);
 * entity.setCharacter4(character4);
 * entity.setCharacter5(character5);
 * entity.setCharacter6(character6);
 * entity.setCharacter7(character7);
 * entity.setCharacter8(character8);
 * entity.setCharacter9(character9);
 * entity.setCharacter10(character10);
 * entity.setNum1(num1);
 * entity.setNum2(num2);
 * entity.setNum3(num3);
 * entity.setNum4(num4);
 * entity.setNum5(num5);
 * entity.setNum6(num6);
 * entity.setNum7(num7);
 * entity.setNum8(num8);
 * entity.setNum9(num9);
 * entity.setNum10(num10);
 * entity.setComment1(comment1);
 * entity.setComment2(comment2);
 * entity.setDefaultType(defaultType);
 * entity.setSystemType(systemType);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMGeneral extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _generalId;

    /** CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} */
    protected Long _centerId;

    /** CENTER_CD: {VARCHAR(100)} */
    protected String _centerCd;

    /** GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} */
    protected String _generalMasterType;

    /** GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} */
    protected String _generalMasterTypeNm;

    /** GENERAL_CD: {+UQ, VARCHAR(30)} */
    protected String _generalCd;

    /** GENERAL_NM: {VARCHAR(60)} */
    protected String _generalNm;

    /** GENERAL_ABBR: {VARCHAR(60)} */
    protected String _generalAbbr;

    /** CHARACTER1: {VARCHAR(100)} */
    protected String _character1;

    /** CHARACTER2: {VARCHAR(100)} */
    protected String _character2;

    /** CHARACTER3: {VARCHAR(100)} */
    protected String _character3;

    /** CHARACTER4: {VARCHAR(100)} */
    protected String _character4;

    /** CHARACTER5: {VARCHAR(100)} */
    protected String _character5;

    /** CHARACTER6: {VARCHAR(100)} */
    protected String _character6;

    /** CHARACTER7: {VARCHAR(100)} */
    protected String _character7;

    /** CHARACTER8: {VARCHAR(100)} */
    protected String _character8;

    /** CHARACTER9: {VARCHAR(100)} */
    protected String _character9;

    /** CHARACTER10: {VARCHAR(100)} */
    protected String _character10;

    /** NUM1: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num1;

    /** NUM2: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num2;

    /** NUM3: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num3;

    /** NUM4: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num4;

    /** NUM5: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num5;

    /** NUM6: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num6;

    /** NUM7: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num7;

    /** NUM8: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num8;

    /** NUM9: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num9;

    /** NUM10: {DECIMAL(14, 4), default=[0.0000]} */
    protected java.math.BigDecimal _num10;

    /** COMMENT1: {VARCHAR(255)} */
    protected String _comment1;

    /** COMMENT2: {VARCHAR(255)} */
    protected String _comment2;

    /** DEFAULT_TYPE: {VARCHAR(30)} */
    protected String _defaultType;

    /** SYSTEM_TYPE: {VARCHAR(30)} */
    protected String _systemType;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_general";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_generalId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param generalMasterType : UQ+, VARCHAR(30). (NotNull)
     * @param generalCd : +UQ, VARCHAR(30). (NotNull)
     * @param centerId : +UQ, IX, NotNull, BIGINT(19), FK to m_center. (NotNull)
     */
    public void uniqueBy(String generalMasterType, String generalCd, Long centerId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("generalMasterType");
        __uniqueDrivenProperties.addPropertyName("generalCd");
        __uniqueDrivenProperties.addPropertyName("centerId");
        setGeneralMasterType(generalMasterType);setGeneralCd(generalCd);setCenterId(centerId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** m_center by my CENTER_ID, named 'MCenter'. */
    protected MCenter _mCenter;

    /**
     * [get] m_center by my CENTER_ID, named 'MCenter'. <br>
     * @return The entity of foreign property 'MCenter'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MCenter getMCenter() {
        return _mCenter;
    }

    /**
     * [set] m_center by my CENTER_ID, named 'MCenter'.
     * @param mCenter The entity of foreign property 'MCenter'. (NullAllowed)
     */
    public void setMCenter(MCenter mCenter) {
        _mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMGeneral) {
            BsMGeneral other = (BsMGeneral)obj;
            if (!xSV(_generalId, other._generalId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _generalId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(li).append(xbRDS(_mCenter, "mCenter")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_generalId));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_generalMasterType));
        sb.append(dm).append(xfND(_generalMasterTypeNm));
        sb.append(dm).append(xfND(_generalCd));
        sb.append(dm).append(xfND(_generalNm));
        sb.append(dm).append(xfND(_generalAbbr));
        sb.append(dm).append(xfND(_character1));
        sb.append(dm).append(xfND(_character2));
        sb.append(dm).append(xfND(_character3));
        sb.append(dm).append(xfND(_character4));
        sb.append(dm).append(xfND(_character5));
        sb.append(dm).append(xfND(_character6));
        sb.append(dm).append(xfND(_character7));
        sb.append(dm).append(xfND(_character8));
        sb.append(dm).append(xfND(_character9));
        sb.append(dm).append(xfND(_character10));
        sb.append(dm).append(xfND(_num1));
        sb.append(dm).append(xfND(_num2));
        sb.append(dm).append(xfND(_num3));
        sb.append(dm).append(xfND(_num4));
        sb.append(dm).append(xfND(_num5));
        sb.append(dm).append(xfND(_num6));
        sb.append(dm).append(xfND(_num7));
        sb.append(dm).append(xfND(_num8));
        sb.append(dm).append(xfND(_num9));
        sb.append(dm).append(xfND(_num10));
        sb.append(dm).append(xfND(_comment1));
        sb.append(dm).append(xfND(_comment2));
        sb.append(dm).append(xfND(_defaultType));
        sb.append(dm).append(xfND(_systemType));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mCenter != null)
        { sb.append(dm).append("mCenter"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MGeneral clone() {
        return (MGeneral)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 汎用マスタID
     * @return The value of the column 'GENERAL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGeneralId() {
        checkSpecifiedProperty("generalId");
        return _generalId;
    }

    /**
     * [set] GENERAL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 汎用マスタID
     * @param generalId The value of the column 'GENERAL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGeneralId(Long generalId) {
        registerModifiedProperty("generalId");
        _generalId = generalId;
    }

    /**
     * [get] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(100)} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(100)} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} <br>
     * 汎用マスタ区分
     * @return The value of the column 'GENERAL_MASTER_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralMasterType() {
        checkSpecifiedProperty("generalMasterType");
        return convertEmptyToNull(_generalMasterType);
    }

    /**
     * [set] GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)} <br>
     * 汎用マスタ区分
     * @param generalMasterType The value of the column 'GENERAL_MASTER_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralMasterType(String generalMasterType) {
        registerModifiedProperty("generalMasterType");
        _generalMasterType = generalMasterType;
    }

    /**
     * [get] GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} <br>
     * 汎用マスタ区分名称
     * @return The value of the column 'GENERAL_MASTER_TYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralMasterTypeNm() {
        checkSpecifiedProperty("generalMasterTypeNm");
        return convertEmptyToNull(_generalMasterTypeNm);
    }

    /**
     * [set] GENERAL_MASTER_TYPE_NM: {VARCHAR(60)} <br>
     * 汎用マスタ区分名称
     * @param generalMasterTypeNm The value of the column 'GENERAL_MASTER_TYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralMasterTypeNm(String generalMasterTypeNm) {
        registerModifiedProperty("generalMasterTypeNm");
        _generalMasterTypeNm = generalMasterTypeNm;
    }

    /**
     * [get] GENERAL_CD: {+UQ, VARCHAR(30)} <br>
     * 汎用CD
     * @return The value of the column 'GENERAL_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralCd() {
        checkSpecifiedProperty("generalCd");
        return convertEmptyToNull(_generalCd);
    }

    /**
     * [set] GENERAL_CD: {+UQ, VARCHAR(30)} <br>
     * 汎用CD
     * @param generalCd The value of the column 'GENERAL_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralCd(String generalCd) {
        registerModifiedProperty("generalCd");
        _generalCd = generalCd;
    }

    /**
     * [get] GENERAL_NM: {VARCHAR(60)} <br>
     * 汎用名称
     * @return The value of the column 'GENERAL_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralNm() {
        checkSpecifiedProperty("generalNm");
        return convertEmptyToNull(_generalNm);
    }

    /**
     * [set] GENERAL_NM: {VARCHAR(60)} <br>
     * 汎用名称
     * @param generalNm The value of the column 'GENERAL_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralNm(String generalNm) {
        registerModifiedProperty("generalNm");
        _generalNm = generalNm;
    }

    /**
     * [get] GENERAL_ABBR: {VARCHAR(60)} <br>
     * 汎用略称
     * @return The value of the column 'GENERAL_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getGeneralAbbr() {
        checkSpecifiedProperty("generalAbbr");
        return convertEmptyToNull(_generalAbbr);
    }

    /**
     * [set] GENERAL_ABBR: {VARCHAR(60)} <br>
     * 汎用略称
     * @param generalAbbr The value of the column 'GENERAL_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeneralAbbr(String generalAbbr) {
        registerModifiedProperty("generalAbbr");
        _generalAbbr = generalAbbr;
    }

    /**
     * [get] CHARACTER1: {VARCHAR(100)} <br>
     * キャラクタ１
     * @return The value of the column 'CHARACTER1'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter1() {
        checkSpecifiedProperty("character1");
        return convertEmptyToNull(_character1);
    }

    /**
     * [set] CHARACTER1: {VARCHAR(100)} <br>
     * キャラクタ１
     * @param character1 The value of the column 'CHARACTER1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter1(String character1) {
        registerModifiedProperty("character1");
        _character1 = character1;
    }

    /**
     * [get] CHARACTER2: {VARCHAR(100)} <br>
     * キャラクタ２
     * @return The value of the column 'CHARACTER2'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter2() {
        checkSpecifiedProperty("character2");
        return convertEmptyToNull(_character2);
    }

    /**
     * [set] CHARACTER2: {VARCHAR(100)} <br>
     * キャラクタ２
     * @param character2 The value of the column 'CHARACTER2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter2(String character2) {
        registerModifiedProperty("character2");
        _character2 = character2;
    }

    /**
     * [get] CHARACTER3: {VARCHAR(100)} <br>
     * キャラクタ３
     * @return The value of the column 'CHARACTER3'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter3() {
        checkSpecifiedProperty("character3");
        return convertEmptyToNull(_character3);
    }

    /**
     * [set] CHARACTER3: {VARCHAR(100)} <br>
     * キャラクタ３
     * @param character3 The value of the column 'CHARACTER3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter3(String character3) {
        registerModifiedProperty("character3");
        _character3 = character3;
    }

    /**
     * [get] CHARACTER4: {VARCHAR(100)} <br>
     * キャラクタ４
     * @return The value of the column 'CHARACTER4'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter4() {
        checkSpecifiedProperty("character4");
        return convertEmptyToNull(_character4);
    }

    /**
     * [set] CHARACTER4: {VARCHAR(100)} <br>
     * キャラクタ４
     * @param character4 The value of the column 'CHARACTER4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter4(String character4) {
        registerModifiedProperty("character4");
        _character4 = character4;
    }

    /**
     * [get] CHARACTER5: {VARCHAR(100)} <br>
     * キャラクタ５
     * @return The value of the column 'CHARACTER5'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter5() {
        checkSpecifiedProperty("character5");
        return convertEmptyToNull(_character5);
    }

    /**
     * [set] CHARACTER5: {VARCHAR(100)} <br>
     * キャラクタ５
     * @param character5 The value of the column 'CHARACTER5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter5(String character5) {
        registerModifiedProperty("character5");
        _character5 = character5;
    }

    /**
     * [get] CHARACTER6: {VARCHAR(100)} <br>
     * キャラクタ６
     * @return The value of the column 'CHARACTER6'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter6() {
        checkSpecifiedProperty("character6");
        return convertEmptyToNull(_character6);
    }

    /**
     * [set] CHARACTER6: {VARCHAR(100)} <br>
     * キャラクタ６
     * @param character6 The value of the column 'CHARACTER6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter6(String character6) {
        registerModifiedProperty("character6");
        _character6 = character6;
    }

    /**
     * [get] CHARACTER7: {VARCHAR(100)} <br>
     * キャラクタ７
     * @return The value of the column 'CHARACTER7'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter7() {
        checkSpecifiedProperty("character7");
        return convertEmptyToNull(_character7);
    }

    /**
     * [set] CHARACTER7: {VARCHAR(100)} <br>
     * キャラクタ７
     * @param character7 The value of the column 'CHARACTER7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter7(String character7) {
        registerModifiedProperty("character7");
        _character7 = character7;
    }

    /**
     * [get] CHARACTER8: {VARCHAR(100)} <br>
     * キャラクタ８
     * @return The value of the column 'CHARACTER8'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter8() {
        checkSpecifiedProperty("character8");
        return convertEmptyToNull(_character8);
    }

    /**
     * [set] CHARACTER8: {VARCHAR(100)} <br>
     * キャラクタ８
     * @param character8 The value of the column 'CHARACTER8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter8(String character8) {
        registerModifiedProperty("character8");
        _character8 = character8;
    }

    /**
     * [get] CHARACTER9: {VARCHAR(100)} <br>
     * キャラクタ９
     * @return The value of the column 'CHARACTER9'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter9() {
        checkSpecifiedProperty("character9");
        return convertEmptyToNull(_character9);
    }

    /**
     * [set] CHARACTER9: {VARCHAR(100)} <br>
     * キャラクタ９
     * @param character9 The value of the column 'CHARACTER9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter9(String character9) {
        registerModifiedProperty("character9");
        _character9 = character9;
    }

    /**
     * [get] CHARACTER10: {VARCHAR(100)} <br>
     * キャラクタ１０
     * @return The value of the column 'CHARACTER10'. (NullAllowed even if selected: for no constraint)
     */
    public String getCharacter10() {
        checkSpecifiedProperty("character10");
        return convertEmptyToNull(_character10);
    }

    /**
     * [set] CHARACTER10: {VARCHAR(100)} <br>
     * キャラクタ１０
     * @param character10 The value of the column 'CHARACTER10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCharacter10(String character10) {
        registerModifiedProperty("character10");
        _character10 = character10;
    }

    /**
     * [get] NUM1: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１
     * @return The value of the column 'NUM1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum1() {
        checkSpecifiedProperty("num1");
        return _num1;
    }

    /**
     * [set] NUM1: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１
     * @param num1 The value of the column 'NUM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum1(java.math.BigDecimal num1) {
        registerModifiedProperty("num1");
        _num1 = num1;
    }

    /**
     * [get] NUM2: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー２
     * @return The value of the column 'NUM2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum2() {
        checkSpecifiedProperty("num2");
        return _num2;
    }

    /**
     * [set] NUM2: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー２
     * @param num2 The value of the column 'NUM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum2(java.math.BigDecimal num2) {
        registerModifiedProperty("num2");
        _num2 = num2;
    }

    /**
     * [get] NUM3: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー３
     * @return The value of the column 'NUM3'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum3() {
        checkSpecifiedProperty("num3");
        return _num3;
    }

    /**
     * [set] NUM3: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー３
     * @param num3 The value of the column 'NUM3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum3(java.math.BigDecimal num3) {
        registerModifiedProperty("num3");
        _num3 = num3;
    }

    /**
     * [get] NUM4: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー４
     * @return The value of the column 'NUM4'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum4() {
        checkSpecifiedProperty("num4");
        return _num4;
    }

    /**
     * [set] NUM4: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー４
     * @param num4 The value of the column 'NUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum4(java.math.BigDecimal num4) {
        registerModifiedProperty("num4");
        _num4 = num4;
    }

    /**
     * [get] NUM5: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー５
     * @return The value of the column 'NUM5'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum5() {
        checkSpecifiedProperty("num5");
        return _num5;
    }

    /**
     * [set] NUM5: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー５
     * @param num5 The value of the column 'NUM5'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum5(java.math.BigDecimal num5) {
        registerModifiedProperty("num5");
        _num5 = num5;
    }

    /**
     * [get] NUM6: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー６
     * @return The value of the column 'NUM6'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum6() {
        checkSpecifiedProperty("num6");
        return _num6;
    }

    /**
     * [set] NUM6: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー６
     * @param num6 The value of the column 'NUM6'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum6(java.math.BigDecimal num6) {
        registerModifiedProperty("num6");
        _num6 = num6;
    }

    /**
     * [get] NUM7: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー７
     * @return The value of the column 'NUM7'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum7() {
        checkSpecifiedProperty("num7");
        return _num7;
    }

    /**
     * [set] NUM7: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー７
     * @param num7 The value of the column 'NUM7'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum7(java.math.BigDecimal num7) {
        registerModifiedProperty("num7");
        _num7 = num7;
    }

    /**
     * [get] NUM8: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー８
     * @return The value of the column 'NUM8'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum8() {
        checkSpecifiedProperty("num8");
        return _num8;
    }

    /**
     * [set] NUM8: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー８
     * @param num8 The value of the column 'NUM8'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum8(java.math.BigDecimal num8) {
        registerModifiedProperty("num8");
        _num8 = num8;
    }

    /**
     * [get] NUM9: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー９
     * @return The value of the column 'NUM9'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum9() {
        checkSpecifiedProperty("num9");
        return _num9;
    }

    /**
     * [set] NUM9: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー９
     * @param num9 The value of the column 'NUM9'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum9(java.math.BigDecimal num9) {
        registerModifiedProperty("num9");
        _num9 = num9;
    }

    /**
     * [get] NUM10: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１０
     * @return The value of the column 'NUM10'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getNum10() {
        checkSpecifiedProperty("num10");
        return _num10;
    }

    /**
     * [set] NUM10: {DECIMAL(14, 4), default=[0.0000]} <br>
     * ナンバー１０
     * @param num10 The value of the column 'NUM10'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNum10(java.math.BigDecimal num10) {
        registerModifiedProperty("num10");
        _num10 = num10;
    }

    /**
     * [get] COMMENT1: {VARCHAR(255)} <br>
     * コメント１
     * @return The value of the column 'COMMENT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment1() {
        checkSpecifiedProperty("comment1");
        return convertEmptyToNull(_comment1);
    }

    /**
     * [set] COMMENT1: {VARCHAR(255)} <br>
     * コメント１
     * @param comment1 The value of the column 'COMMENT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment1(String comment1) {
        registerModifiedProperty("comment1");
        _comment1 = comment1;
    }

    /**
     * [get] COMMENT2: {VARCHAR(255)} <br>
     * コメント２
     * @return The value of the column 'COMMENT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getComment2() {
        checkSpecifiedProperty("comment2");
        return convertEmptyToNull(_comment2);
    }

    /**
     * [set] COMMENT2: {VARCHAR(255)} <br>
     * コメント２
     * @param comment2 The value of the column 'COMMENT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setComment2(String comment2) {
        registerModifiedProperty("comment2");
        _comment2 = comment2;
    }

    /**
     * [get] DEFAULT_TYPE: {VARCHAR(30)} <br>
     * デフォルト区分
     * @return The value of the column 'DEFAULT_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getDefaultType() {
        checkSpecifiedProperty("defaultType");
        return convertEmptyToNull(_defaultType);
    }

    /**
     * [set] DEFAULT_TYPE: {VARCHAR(30)} <br>
     * デフォルト区分
     * @param defaultType The value of the column 'DEFAULT_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefaultType(String defaultType) {
        registerModifiedProperty("defaultType");
        _defaultType = defaultType;
    }

    /**
     * [get] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム区分
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getSystemType() {
        checkSpecifiedProperty("systemType");
        return convertEmptyToNull(_systemType);
    }

    /**
     * [set] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム区分
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSystemType(String systemType) {
        registerModifiedProperty("systemType");
        _systemType = systemType;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
