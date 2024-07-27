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
 * The entity of t_nizoroe as TABLE. <br>
 * 荷揃処理
 * <pre>
 * [primary-key]
 *     NIZOROE_ID
 *
 * [column]
 *     NIZOROE_ID, BASE_CD, NIZOROE_PROC_UNIT, NIZOROE_TYPE_CD, STATUS, PROC_DT, PROC_START_TIME, PROC_END_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long nizoroeId = entity.getNizoroeId();
 * String baseCd = entity.getBaseCd();
 * String nizoroeProcUnit = entity.getNizoroeProcUnit();
 * String nizoroeTypeCd = entity.getNizoroeTypeCd();
 * String status = entity.getStatus();
 * String procDt = entity.getProcDt();
 * java.sql.Timestamp procStartTime = entity.getProcStartTime();
 * java.sql.Timestamp procEndTime = entity.getProcEndTime();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setNizoroeId(nizoroeId);
 * entity.setBaseCd(baseCd);
 * entity.setNizoroeProcUnit(nizoroeProcUnit);
 * entity.setNizoroeTypeCd(nizoroeTypeCd);
 * entity.setStatus(status);
 * entity.setProcDt(procDt);
 * entity.setProcStartTime(procStartTime);
 * entity.setProcEndTime(procEndTime);
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
public abstract class BsTNizoroe extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _nizoroeId;

    /** BASE_CD: {VARCHAR(30)} */
    protected String _baseCd;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    protected String _nizoroeProcUnit;

    /** NIZOROE_TYPE_CD: {VARCHAR(30)} */
    protected String _nizoroeTypeCd;

    /** STATUS: {VARCHAR(30)} */
    protected String _status;

    /** PROC_DT: {VARCHAR(8)} */
    protected String _procDt;

    /** PROC_START_TIME: {DATETIME(19)} */
    protected java.sql.Timestamp _procStartTime;

    /** PROC_END_TIME: {DATETIME(19)} */
    protected java.sql.Timestamp _procEndTime;

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
        return "t_nizoroe";
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
        if (_nizoroeId == null) { return false; }
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
        if (obj instanceof BsTNizoroe) {
            BsTNizoroe other = (BsTNizoroe)obj;
            if (!xSV(_nizoroeId, other._nizoroeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nizoroeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_nizoroeId));
        sb.append(dm).append(xfND(_baseCd));
        sb.append(dm).append(xfND(_nizoroeProcUnit));
        sb.append(dm).append(xfND(_nizoroeTypeCd));
        sb.append(dm).append(xfND(_status));
        sb.append(dm).append(xfND(_procDt));
        sb.append(dm).append(xfND(_procStartTime));
        sb.append(dm).append(xfND(_procEndTime));
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
        return "";
    }

    @Override
    public TNizoroe clone() {
        return (TNizoroe)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理ID
     * @return The value of the column 'NIZOROE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getNizoroeId() {
        checkSpecifiedProperty("nizoroeId");
        return _nizoroeId;
    }

    /**
     * [set] NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理ID
     * @param nizoroeId The value of the column 'NIZOROE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setNizoroeId(Long nizoroeId) {
        registerModifiedProperty("nizoroeId");
        _nizoroeId = nizoroeId;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getBaseCd() {
        checkSpecifiedProperty("baseCd");
        return convertEmptyToNull(_baseCd);
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBaseCd(String baseCd) {
        registerModifiedProperty("baseCd");
        _baseCd = baseCd;
    }

    /**
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeProcUnit() {
        checkSpecifiedProperty("nizoroeProcUnit");
        return convertEmptyToNull(_nizoroeProcUnit);
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        registerModifiedProperty("nizoroeProcUnit");
        _nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @return The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getNizoroeTypeCd() {
        checkSpecifiedProperty("nizoroeTypeCd");
        return convertEmptyToNull(_nizoroeTypeCd);
    }

    /**
     * [set] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @param nizoroeTypeCd The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNizoroeTypeCd(String nizoroeTypeCd) {
        registerModifiedProperty("nizoroeTypeCd");
        _nizoroeTypeCd = nizoroeTypeCd;
    }

    /**
     * [get] STATUS: {VARCHAR(30)} <br>
     * 実行ステータス
     * @return The value of the column 'STATUS'. (NullAllowed even if selected: for no constraint)
     */
    public String getStatus() {
        checkSpecifiedProperty("status");
        return convertEmptyToNull(_status);
    }

    /**
     * [set] STATUS: {VARCHAR(30)} <br>
     * 実行ステータス
     * @param status The value of the column 'STATUS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatus(String status) {
        registerModifiedProperty("status");
        _status = status;
    }

    /**
     * [get] PROC_DT: {VARCHAR(8)} <br>
     * 処理日
     * @return The value of the column 'PROC_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProcDt() {
        checkSpecifiedProperty("procDt");
        return convertEmptyToNull(_procDt);
    }

    /**
     * [set] PROC_DT: {VARCHAR(8)} <br>
     * 処理日
     * @param procDt The value of the column 'PROC_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcDt(String procDt) {
        registerModifiedProperty("procDt");
        _procDt = procDt;
    }

    /**
     * [get] PROC_START_TIME: {DATETIME(19)} <br>
     * 処理開始時刻
     * @return The value of the column 'PROC_START_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcStartTime() {
        checkSpecifiedProperty("procStartTime");
        return _procStartTime;
    }

    /**
     * [set] PROC_START_TIME: {DATETIME(19)} <br>
     * 処理開始時刻
     * @param procStartTime The value of the column 'PROC_START_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcStartTime(java.sql.Timestamp procStartTime) {
        registerModifiedProperty("procStartTime");
        _procStartTime = procStartTime;
    }

    /**
     * [get] PROC_END_TIME: {DATETIME(19)} <br>
     * 処理終了時刻
     * @return The value of the column 'PROC_END_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getProcEndTime() {
        checkSpecifiedProperty("procEndTime");
        return _procEndTime;
    }

    /**
     * [set] PROC_END_TIME: {DATETIME(19)} <br>
     * 処理終了時刻
     * @param procEndTime The value of the column 'PROC_END_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProcEndTime(java.sql.Timestamp procEndTime) {
        registerModifiedProperty("procEndTime");
        _procEndTime = procEndTime;
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
