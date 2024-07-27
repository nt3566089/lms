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
 * The entity of p_subrep_layout as TABLE. <br>
 * サブレポートレイアウトマスタ
 * <pre>
 * [primary-key]
 *     SUBREP_LAYOUT_ID
 *
 * [column]
 *     SUBREP_LAYOUT_ID, REPORT_LAYOUT_ID, SUBREP_LAYOUT_DATA, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SUBREP_LAYOUT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     p_report_layout
 *
 * [referrer table]
 *     p_subrep_layout_item
 *
 * [foreign property]
 *     pReportLayout
 *
 * [referrer property]
 *     pSubrepLayoutItemList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long subrepLayoutId = entity.getSubrepLayoutId();
 * Long reportLayoutId = entity.getReportLayoutId();
 * String subrepLayoutData = entity.getSubrepLayoutData();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSubrepLayoutId(subrepLayoutId);
 * entity.setReportLayoutId(reportLayoutId);
 * entity.setSubrepLayoutData(subrepLayoutData);
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
public abstract class BsPSubrepLayout extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _subrepLayoutId;

    /** REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout} */
    protected Long _reportLayoutId;

    /** SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)} */
    protected String _subrepLayoutData;

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
        return "p_subrep_layout";
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
        if (_subrepLayoutId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param reportLayoutId : UQ, NotNull, BIGINT(19), FK to p_report_layout. (NotNull)
     */
    public void uniqueBy(Long reportLayoutId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("reportLayoutId");
        setReportLayoutId(reportLayoutId);
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
    /** p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'. */
    protected PReportLayout _pReportLayout;

    /**
     * [get] p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'. <br>
     * @return The entity of foreign property 'PReportLayout'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public PReportLayout getPReportLayout() {
        return _pReportLayout;
    }

    /**
     * [set] p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @param pReportLayout The entity of foreign property 'PReportLayout'. (NullAllowed)
     */
    public void setPReportLayout(PReportLayout pReportLayout) {
        _pReportLayout = pReportLayout;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** p_subrep_layout_item by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'. */
    protected List<PSubrepLayoutItem> _pSubrepLayoutItemList;

    /**
     * [get] p_subrep_layout_item by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * @return The entity list of referrer property 'PSubrepLayoutItemList'. (NotNull: even if no loading, returns empty list)
     */
    public List<PSubrepLayoutItem> getPSubrepLayoutItemList() {
        if (_pSubrepLayoutItemList == null) { _pSubrepLayoutItemList = newReferrerList(); }
        return _pSubrepLayoutItemList;
    }

    /**
     * [set] p_subrep_layout_item by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * @param pSubrepLayoutItemList The entity list of referrer property 'PSubrepLayoutItemList'. (NullAllowed)
     */
    public void setPSubrepLayoutItemList(List<PSubrepLayoutItem> pSubrepLayoutItemList) {
        _pSubrepLayoutItemList = pSubrepLayoutItemList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPSubrepLayout) {
            BsPSubrepLayout other = (BsPSubrepLayout)obj;
            if (!xSV(_subrepLayoutId, other._subrepLayoutId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _subrepLayoutId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_pReportLayout != null)
        { sb.append(li).append(xbRDS(_pReportLayout, "pReportLayout")); }
        if (_pSubrepLayoutItemList != null) { for (PSubrepLayoutItem et : _pSubrepLayoutItemList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "pSubrepLayoutItemList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_subrepLayoutId));
        sb.append(dm).append(xfND(_reportLayoutId));
        sb.append(dm).append(xfND(_subrepLayoutData));
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
        if (_pReportLayout != null)
        { sb.append(dm).append("pReportLayout"); }
        if (_pSubrepLayoutItemList != null && !_pSubrepLayoutItemList.isEmpty())
        { sb.append(dm).append("pSubrepLayoutItemList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PSubrepLayout clone() {
        return (PSubrepLayout)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * サブレポートレイアウトID
     * @return The value of the column 'SUBREP_LAYOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSubrepLayoutId() {
        checkSpecifiedProperty("subrepLayoutId");
        return _subrepLayoutId;
    }

    /**
     * [set] SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * サブレポートレイアウトID
     * @param subrepLayoutId The value of the column 'SUBREP_LAYOUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSubrepLayoutId(Long subrepLayoutId) {
        registerModifiedProperty("subrepLayoutId");
        _subrepLayoutId = subrepLayoutId;
    }

    /**
     * [get] REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout} <br>
     * 帳票レイアウトID
     * @return The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReportLayoutId() {
        checkSpecifiedProperty("reportLayoutId");
        return _reportLayoutId;
    }

    /**
     * [set] REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout} <br>
     * 帳票レイアウトID
     * @param reportLayoutId The value of the column 'REPORT_LAYOUT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReportLayoutId(Long reportLayoutId) {
        registerModifiedProperty("reportLayoutId");
        _reportLayoutId = reportLayoutId;
    }

    /**
     * [get] SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @return The value of the column 'SUBREP_LAYOUT_DATA'. (basically NotNull if selected: for the constraint)
     */
    public String getSubrepLayoutData() {
        checkSpecifiedProperty("subrepLayoutData");
        return convertEmptyToNull(_subrepLayoutData);
    }

    /**
     * [set] SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)} <br>
     * サブレポートレイアウトデータ
     * @param subrepLayoutData The value of the column 'SUBREP_LAYOUT_DATA'. (basically NotNull if update: for the constraint)
     */
    public void setSubrepLayoutData(String subrepLayoutData) {
        registerModifiedProperty("subrepLayoutData");
        _subrepLayoutData = subrepLayoutData;
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
