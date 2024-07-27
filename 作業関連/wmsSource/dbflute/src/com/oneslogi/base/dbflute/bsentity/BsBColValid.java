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
 * The entity of b_col_valid as TABLE. <br>
 * 列検証マスタ
 * <pre>
 * [primary-key]
 *     COL_ID
 *
 * [column]
 *     COL_ID, INPUT_LIMIT, LIMIT_MESSAGE_CD, MIN_CHARS, MAX_CHARS, MIN_NUMBER, MAX_NUMBER, INTEGER_LENGTH, DECIMAL_LENGTH, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_col
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bCol
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long colId = entity.getColId();
 * String inputLimit = entity.getInputLimit();
 * String limitMessageCd = entity.getLimitMessageCd();
 * Long minChars = entity.getMinChars();
 * Long maxChars = entity.getMaxChars();
 * java.math.BigDecimal minNumber = entity.getMinNumber();
 * java.math.BigDecimal maxNumber = entity.getMaxNumber();
 * Long integerLength = entity.getIntegerLength();
 * Long decimalLength = entity.getDecimalLength();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setColId(colId);
 * entity.setInputLimit(inputLimit);
 * entity.setLimitMessageCd(limitMessageCd);
 * entity.setMinChars(minChars);
 * entity.setMaxChars(maxChars);
 * entity.setMinNumber(minNumber);
 * entity.setMaxNumber(maxNumber);
 * entity.setIntegerLength(integerLength);
 * entity.setDecimalLength(decimalLength);
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
public abstract class BsBColValid extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COL_ID: {PK, NotNull, BIGINT(19), FK to b_col} */
    protected Long _colId;

    /** INPUT_LIMIT: {VARCHAR(100)} */
    protected String _inputLimit;

    /** LIMIT_MESSAGE_CD: {VARCHAR(100)} */
    protected String _limitMessageCd;

    /** MIN_CHARS: {BIGINT(19)} */
    protected Long _minChars;

    /** MAX_CHARS: {BIGINT(19)} */
    protected Long _maxChars;

    /** MIN_NUMBER: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _minNumber;

    /** MAX_NUMBER: {DECIMAL(14, 4)} */
    protected java.math.BigDecimal _maxNumber;

    /** INTEGER_LENGTH: {BIGINT(19)} */
    protected Long _integerLength;

    /** DECIMAL_LENGTH: {BIGINT(19)} */
    protected Long _decimalLength;

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
        return "b_col_valid";
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
        if (_colId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
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
    /** b_col by my COL_ID, named 'BCol'. */
    protected BCol _bCol;

    /**
     * [get] b_col by my COL_ID, named 'BCol'. <br>
     * @return The entity of foreign property 'BCol'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BCol getBCol() {
        return _bCol;
    }

    /**
     * [set] b_col by my COL_ID, named 'BCol'.
     * @param bCol The entity of foreign property 'BCol'. (NullAllowed)
     */
    public void setBCol(BCol bCol) {
        _bCol = bCol;
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
        if (obj instanceof BsBColValid) {
            BsBColValid other = (BsBColValid)obj;
            if (!xSV(_colId, other._colId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _colId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bCol != null)
        { sb.append(li).append(xbRDS(_bCol, "bCol")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_colId));
        sb.append(dm).append(xfND(_inputLimit));
        sb.append(dm).append(xfND(_limitMessageCd));
        sb.append(dm).append(xfND(_minChars));
        sb.append(dm).append(xfND(_maxChars));
        sb.append(dm).append(xfND(_minNumber));
        sb.append(dm).append(xfND(_maxNumber));
        sb.append(dm).append(xfND(_integerLength));
        sb.append(dm).append(xfND(_decimalLength));
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
        if (_bCol != null)
        { sb.append(dm).append("bCol"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BColValid clone() {
        return (BColValid)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COL_ID: {PK, NotNull, BIGINT(19), FK to b_col} <br>
     * 列ID
     * @return The value of the column 'COL_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getColId() {
        checkSpecifiedProperty("colId");
        return _colId;
    }

    /**
     * [set] COL_ID: {PK, NotNull, BIGINT(19), FK to b_col} <br>
     * 列ID
     * @param colId The value of the column 'COL_ID'. (basically NotNull if update: for the constraint)
     */
    public void setColId(Long colId) {
        registerModifiedProperty("colId");
        _colId = colId;
    }

    /**
     * [get] INPUT_LIMIT: {VARCHAR(100)} <br>
     * 文字入力制限
     * @return The value of the column 'INPUT_LIMIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInputLimit() {
        checkSpecifiedProperty("inputLimit");
        return convertEmptyToNull(_inputLimit);
    }

    /**
     * [set] INPUT_LIMIT: {VARCHAR(100)} <br>
     * 文字入力制限
     * @param inputLimit The value of the column 'INPUT_LIMIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInputLimit(String inputLimit) {
        registerModifiedProperty("inputLimit");
        _inputLimit = inputLimit;
    }

    /**
     * [get] LIMIT_MESSAGE_CD: {VARCHAR(100)} <br>
     * 制限メッセージCD
     * @return The value of the column 'LIMIT_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitMessageCd() {
        checkSpecifiedProperty("limitMessageCd");
        return convertEmptyToNull(_limitMessageCd);
    }

    /**
     * [set] LIMIT_MESSAGE_CD: {VARCHAR(100)} <br>
     * 制限メッセージCD
     * @param limitMessageCd The value of the column 'LIMIT_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitMessageCd(String limitMessageCd) {
        registerModifiedProperty("limitMessageCd");
        _limitMessageCd = limitMessageCd;
    }

    /**
     * [get] MIN_CHARS: {BIGINT(19)} <br>
     * 最小文字数
     * @return The value of the column 'MIN_CHARS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMinChars() {
        checkSpecifiedProperty("minChars");
        return _minChars;
    }

    /**
     * [set] MIN_CHARS: {BIGINT(19)} <br>
     * 最小文字数
     * @param minChars The value of the column 'MIN_CHARS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMinChars(Long minChars) {
        registerModifiedProperty("minChars");
        _minChars = minChars;
    }

    /**
     * [get] MAX_CHARS: {BIGINT(19)} <br>
     * 最大文字数
     * @return The value of the column 'MAX_CHARS'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMaxChars() {
        checkSpecifiedProperty("maxChars");
        return _maxChars;
    }

    /**
     * [set] MAX_CHARS: {BIGINT(19)} <br>
     * 最大文字数
     * @param maxChars The value of the column 'MAX_CHARS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxChars(Long maxChars) {
        registerModifiedProperty("maxChars");
        _maxChars = maxChars;
    }

    /**
     * [get] MIN_NUMBER: {DECIMAL(14, 4)} <br>
     * 最小値
     * @return The value of the column 'MIN_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMinNumber() {
        checkSpecifiedProperty("minNumber");
        return _minNumber;
    }

    /**
     * [set] MIN_NUMBER: {DECIMAL(14, 4)} <br>
     * 最小値
     * @param minNumber The value of the column 'MIN_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMinNumber(java.math.BigDecimal minNumber) {
        registerModifiedProperty("minNumber");
        _minNumber = minNumber;
    }

    /**
     * [get] MAX_NUMBER: {DECIMAL(14, 4)} <br>
     * 最大値
     * @return The value of the column 'MAX_NUMBER'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMaxNumber() {
        checkSpecifiedProperty("maxNumber");
        return _maxNumber;
    }

    /**
     * [set] MAX_NUMBER: {DECIMAL(14, 4)} <br>
     * 最大値
     * @param maxNumber The value of the column 'MAX_NUMBER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxNumber(java.math.BigDecimal maxNumber) {
        registerModifiedProperty("maxNumber");
        _maxNumber = maxNumber;
    }

    /**
     * [get] INTEGER_LENGTH: {BIGINT(19)} <br>
     * 整数桁数
     * @return The value of the column 'INTEGER_LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getIntegerLength() {
        checkSpecifiedProperty("integerLength");
        return _integerLength;
    }

    /**
     * [set] INTEGER_LENGTH: {BIGINT(19)} <br>
     * 整数桁数
     * @param integerLength The value of the column 'INTEGER_LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIntegerLength(Long integerLength) {
        registerModifiedProperty("integerLength");
        _integerLength = integerLength;
    }

    /**
     * [get] DECIMAL_LENGTH: {BIGINT(19)} <br>
     * 小数桁数
     * @return The value of the column 'DECIMAL_LENGTH'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDecimalLength() {
        checkSpecifiedProperty("decimalLength");
        return _decimalLength;
    }

    /**
     * [set] DECIMAL_LENGTH: {BIGINT(19)} <br>
     * 小数桁数
     * @param decimalLength The value of the column 'DECIMAL_LENGTH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDecimalLength(Long decimalLength) {
        registerModifiedProperty("decimalLength");
        _decimalLength = decimalLength;
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
