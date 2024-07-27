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
 * The entity of m_import_type_b as TABLE. <br>
 * 取込種別ボディマスタ
 * <pre>
 * [primary-key]
 *     IMPORT_TYPE_B_ID
 *
 * [column]
 *     IMPORT_TYPE_B_ID, IMPORT_TYPE_ID, COLUMN_NO, EDI_COLUMN_ID, UPLOAD_COLUMN_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     IMPORT_TYPE_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_import_type, m_edi_column
 *
 * [referrer table]
 *     m_import_type_b_copy_b, m_import_type_b_copy_h
 *
 * [foreign property]
 *     mImportType, mEdiColumn
 *
 * [referrer property]
 *     mImportTypeBCopyBList, mImportTypeBCopyHList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long importTypeBId = entity.getImportTypeBId();
 * Long importTypeId = entity.getImportTypeId();
 * Long columnNo = entity.getColumnNo();
 * Long ediColumnId = entity.getEdiColumnId();
 * String uploadColumnNm = entity.getUploadColumnNm();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setImportTypeBId(importTypeBId);
 * entity.setImportTypeId(importTypeId);
 * entity.setColumnNo(columnNo);
 * entity.setEdiColumnId(ediColumnId);
 * entity.setUploadColumnNm(uploadColumnNm);
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
public abstract class BsMImportTypeB extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** IMPORT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _importTypeBId;

    /** IMPORT_TYPE_ID: {IX, BIGINT(19), FK to m_import_type} */
    protected Long _importTypeId;

    /** COLUMN_NO: {BIGINT(19)} */
    protected Long _columnNo;

    /** EDI_COLUMN_ID: {IX, BIGINT(19), FK to m_edi_column} */
    protected Long _ediColumnId;

    /** UPLOAD_COLUMN_NM: {VARCHAR(100)} */
    protected String _uploadColumnNm;

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
        return "m_import_type_b";
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
        if (_importTypeBId == null) { return false; }
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
    /** m_import_type by my IMPORT_TYPE_ID, named 'MImportType'. */
    protected MImportType _mImportType;

    /**
     * [get] m_import_type by my IMPORT_TYPE_ID, named 'MImportType'. <br>
     * @return The entity of foreign property 'MImportType'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MImportType getMImportType() {
        return _mImportType;
    }

    /**
     * [set] m_import_type by my IMPORT_TYPE_ID, named 'MImportType'.
     * @param mImportType The entity of foreign property 'MImportType'. (NullAllowed)
     */
    public void setMImportType(MImportType mImportType) {
        _mImportType = mImportType;
    }

    /** m_edi_column by my EDI_COLUMN_ID, named 'MEdiColumn'. */
    protected MEdiColumn _mEdiColumn;

    /**
     * [get] m_edi_column by my EDI_COLUMN_ID, named 'MEdiColumn'. <br>
     * @return The entity of foreign property 'MEdiColumn'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public MEdiColumn getMEdiColumn() {
        return _mEdiColumn;
    }

    /**
     * [set] m_edi_column by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @param mEdiColumn The entity of foreign property 'MEdiColumn'. (NullAllowed)
     */
    public void setMEdiColumn(MEdiColumn mEdiColumn) {
        _mEdiColumn = mEdiColumn;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_import_type_b_copy_b by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'. */
    protected List<MImportTypeBCopyB> _mImportTypeBCopyBList;

    /**
     * [get] m_import_type_b_copy_b by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * @return The entity list of referrer property 'MImportTypeBCopyBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MImportTypeBCopyB> getMImportTypeBCopyBList() {
        if (_mImportTypeBCopyBList == null) { _mImportTypeBCopyBList = newReferrerList(); }
        return _mImportTypeBCopyBList;
    }

    /**
     * [set] m_import_type_b_copy_b by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyBList'.
     * @param mImportTypeBCopyBList The entity list of referrer property 'MImportTypeBCopyBList'. (NullAllowed)
     */
    public void setMImportTypeBCopyBList(List<MImportTypeBCopyB> mImportTypeBCopyBList) {
        _mImportTypeBCopyBList = mImportTypeBCopyBList;
    }

    /** m_import_type_b_copy_h by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'. */
    protected List<MImportTypeBCopyH> _mImportTypeBCopyHList;

    /**
     * [get] m_import_type_b_copy_h by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * @return The entity list of referrer property 'MImportTypeBCopyHList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MImportTypeBCopyH> getMImportTypeBCopyHList() {
        if (_mImportTypeBCopyHList == null) { _mImportTypeBCopyHList = newReferrerList(); }
        return _mImportTypeBCopyHList;
    }

    /**
     * [set] m_import_type_b_copy_h by IMPORT_TYPE_B_ID, named 'MImportTypeBCopyHList'.
     * @param mImportTypeBCopyHList The entity list of referrer property 'MImportTypeBCopyHList'. (NullAllowed)
     */
    public void setMImportTypeBCopyHList(List<MImportTypeBCopyH> mImportTypeBCopyHList) {
        _mImportTypeBCopyHList = mImportTypeBCopyHList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMImportTypeB) {
            BsMImportTypeB other = (BsMImportTypeB)obj;
            if (!xSV(_importTypeBId, other._importTypeBId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _importTypeBId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mImportType != null)
        { sb.append(li).append(xbRDS(_mImportType, "mImportType")); }
        if (_mEdiColumn != null)
        { sb.append(li).append(xbRDS(_mEdiColumn, "mEdiColumn")); }
        if (_mImportTypeBCopyBList != null) { for (MImportTypeBCopyB et : _mImportTypeBCopyBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mImportTypeBCopyBList")); } } }
        if (_mImportTypeBCopyHList != null) { for (MImportTypeBCopyH et : _mImportTypeBCopyHList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mImportTypeBCopyHList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_importTypeBId));
        sb.append(dm).append(xfND(_importTypeId));
        sb.append(dm).append(xfND(_columnNo));
        sb.append(dm).append(xfND(_ediColumnId));
        sb.append(dm).append(xfND(_uploadColumnNm));
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
        if (_mImportType != null)
        { sb.append(dm).append("mImportType"); }
        if (_mEdiColumn != null)
        { sb.append(dm).append("mEdiColumn"); }
        if (_mImportTypeBCopyBList != null && !_mImportTypeBCopyBList.isEmpty())
        { sb.append(dm).append("mImportTypeBCopyBList"); }
        if (_mImportTypeBCopyHList != null && !_mImportTypeBCopyHList.isEmpty())
        { sb.append(dm).append("mImportTypeBCopyHList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MImportTypeB clone() {
        return (MImportTypeB)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] IMPORT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 取込種別ボディID
     * @return The value of the column 'IMPORT_TYPE_B_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getImportTypeBId() {
        checkSpecifiedProperty("importTypeBId");
        return _importTypeBId;
    }

    /**
     * [set] IMPORT_TYPE_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 取込種別ボディID
     * @param importTypeBId The value of the column 'IMPORT_TYPE_B_ID'. (basically NotNull if update: for the constraint)
     */
    public void setImportTypeBId(Long importTypeBId) {
        registerModifiedProperty("importTypeBId");
        _importTypeBId = importTypeBId;
    }

    /**
     * [get] IMPORT_TYPE_ID: {IX, BIGINT(19), FK to m_import_type} <br>
     * 取込種別ID
     * @return The value of the column 'IMPORT_TYPE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getImportTypeId() {
        checkSpecifiedProperty("importTypeId");
        return _importTypeId;
    }

    /**
     * [set] IMPORT_TYPE_ID: {IX, BIGINT(19), FK to m_import_type} <br>
     * 取込種別ID
     * @param importTypeId The value of the column 'IMPORT_TYPE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportTypeId(Long importTypeId) {
        registerModifiedProperty("importTypeId");
        _importTypeId = importTypeId;
    }

    /**
     * [get] COLUMN_NO: {BIGINT(19)} <br>
     * 列番号
     * @return The value of the column 'COLUMN_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getColumnNo() {
        checkSpecifiedProperty("columnNo");
        return _columnNo;
    }

    /**
     * [set] COLUMN_NO: {BIGINT(19)} <br>
     * 列番号
     * @param columnNo The value of the column 'COLUMN_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setColumnNo(Long columnNo) {
        registerModifiedProperty("columnNo");
        _columnNo = columnNo;
    }

    /**
     * [get] EDI_COLUMN_ID: {IX, BIGINT(19), FK to m_edi_column} <br>
     * EDI項目ID
     * @return The value of the column 'EDI_COLUMN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getEdiColumnId() {
        checkSpecifiedProperty("ediColumnId");
        return _ediColumnId;
    }

    /**
     * [set] EDI_COLUMN_ID: {IX, BIGINT(19), FK to m_edi_column} <br>
     * EDI項目ID
     * @param ediColumnId The value of the column 'EDI_COLUMN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEdiColumnId(Long ediColumnId) {
        registerModifiedProperty("ediColumnId");
        _ediColumnId = ediColumnId;
    }

    /**
     * [get] UPLOAD_COLUMN_NM: {VARCHAR(100)} <br>
     * アップロード列名
     * @return The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUploadColumnNm() {
        checkSpecifiedProperty("uploadColumnNm");
        return convertEmptyToNull(_uploadColumnNm);
    }

    /**
     * [set] UPLOAD_COLUMN_NM: {VARCHAR(100)} <br>
     * アップロード列名
     * @param uploadColumnNm The value of the column 'UPLOAD_COLUMN_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUploadColumnNm(String uploadColumnNm) {
        registerModifiedProperty("uploadColumnNm");
        _uploadColumnNm = uploadColumnNm;
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
