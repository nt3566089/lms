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
 * The entity of b_screen_role as TABLE. <br>
 * 画面権限マスタ
 * <pre>
 * [primary-key]
 *     SCREEN_ROLE_ID
 *
 * [column]
 *     SCREEN_ROLE_ID, ROLE_ID, SCREEN_ID, VISIBLE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SCREEN_ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_role, b_screen, b_class_dtl(ByVisible)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bRole, bScreen, bClassDtlByVisible
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long screenRoleId = entity.getScreenRoleId();
 * Long roleId = entity.getRoleId();
 * Long screenId = entity.getScreenId();
 * String visible = entity.getVisible();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setScreenRoleId(screenRoleId);
 * entity.setRoleId(roleId);
 * entity.setScreenId(screenId);
 * entity.setVisible(visible);
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
public abstract class BsBScreenRole extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SCREEN_ROLE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _screenRoleId;

    /** ROLE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role} */
    protected Long _roleId;

    /** SCREEN_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_screen} */
    protected Long _screenId;

    /** VISIBLE: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=Visible} */
    protected String _visible;

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
        return "b_screen_role";
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
        if (_screenRoleId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param roleId : UQ+, IX, NotNull, BIGINT(19), FK to b_role. (NotNull)
     * @param screenId : +UQ, IX, NotNull, BIGINT(19), FK to b_screen. (NotNull)
     */
    public void uniqueBy(Long roleId, Long screenId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("roleId");
        __uniqueDrivenProperties.addPropertyName("screenId");
        setRoleId(roleId);setScreenId(screenId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Visible getVisibleAsVisible() {
        return CDef.Visible.codeOf(getVisible());
    }

    /**
     * Set the value of visible as the classification of Visible. <br>
     * VISIBLE: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setVisibleAsVisible(CDef.Visible cdef) {
        setVisible(cdef != null ? cdef.code() : null);
    }

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
     * Set the value of visible as $0 (0). <br>
     * $0: 非表示
     */
    public void setVisible_$0() {
        setVisibleAsVisible(CDef.Visible.$0);
    }

    /**
     * Set the value of visible as $1 (1). <br>
     * $1: 表示
     */
    public void setVisible_$1() {
        setVisibleAsVisible(CDef.Visible.$1);
    }

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
     * Is the value of visible $0? <br>
     * $0: 非表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$0() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$0) : false;
    }

    /**
     * Is the value of visible $1? <br>
     * $1: 表示
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isVisible$1() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.equals(CDef.Visible.$1) : false;
    }

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
     * Get the value of the column 'visible' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getVisibleName() {
        CDef.Visible cdef = getVisibleAsVisible();
        return cdef != null ? cdef.name() : null;
    }

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
    /** b_role by my ROLE_ID, named 'BRole'. */
    protected BRole _bRole;

    /**
     * [get] b_role by my ROLE_ID, named 'BRole'. <br>
     * @return The entity of foreign property 'BRole'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BRole getBRole() {
        return _bRole;
    }

    /**
     * [set] b_role by my ROLE_ID, named 'BRole'.
     * @param bRole The entity of foreign property 'BRole'. (NullAllowed)
     */
    public void setBRole(BRole bRole) {
        _bRole = bRole;
    }

    /** b_screen by my SCREEN_ID, named 'BScreen'. */
    protected BScreen _bScreen;

    /**
     * [get] b_screen by my SCREEN_ID, named 'BScreen'. <br>
     * @return The entity of foreign property 'BScreen'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BScreen getBScreen() {
        return _bScreen;
    }

    /**
     * [set] b_screen by my SCREEN_ID, named 'BScreen'.
     * @param bScreen The entity of foreign property 'BScreen'. (NullAllowed)
     */
    public void setBScreen(BScreen bScreen) {
        _bScreen = bScreen;
    }

    /** b_class_dtl by my VISIBLE, named 'BClassDtlByVisible'. */
    protected BClassDtl _bClassDtlByVisible;

    /**
     * [get] b_class_dtl by my VISIBLE, named 'BClassDtlByVisible'. <br>
     * @return The entity of foreign property 'BClassDtlByVisible'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByVisible() {
        return _bClassDtlByVisible;
    }

    /**
     * [set] b_class_dtl by my VISIBLE, named 'BClassDtlByVisible'.
     * @param bClassDtlByVisible The entity of foreign property 'BClassDtlByVisible'. (NullAllowed)
     */
    public void setBClassDtlByVisible(BClassDtl bClassDtlByVisible) {
        _bClassDtlByVisible = bClassDtlByVisible;
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
        if (obj instanceof BsBScreenRole) {
            BsBScreenRole other = (BsBScreenRole)obj;
            if (!xSV(_screenRoleId, other._screenRoleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _screenRoleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bRole != null)
        { sb.append(li).append(xbRDS(_bRole, "bRole")); }
        if (_bScreen != null)
        { sb.append(li).append(xbRDS(_bScreen, "bScreen")); }
        if (_bClassDtlByVisible != null)
        { sb.append(li).append(xbRDS(_bClassDtlByVisible, "bClassDtlByVisible")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_screenRoleId));
        sb.append(dm).append(xfND(_roleId));
        sb.append(dm).append(xfND(_screenId));
        sb.append(dm).append(xfND(_visible));
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
        if (_bRole != null)
        { sb.append(dm).append("bRole"); }
        if (_bScreen != null)
        { sb.append(dm).append("bScreen"); }
        if (_bClassDtlByVisible != null)
        { sb.append(dm).append("bClassDtlByVisible"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BScreenRole clone() {
        return (BScreenRole)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SCREEN_ROLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 画面権限ID
     * @return The value of the column 'SCREEN_ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getScreenRoleId() {
        checkSpecifiedProperty("screenRoleId");
        return _screenRoleId;
    }

    /**
     * [set] SCREEN_ROLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 画面権限ID
     * @param screenRoleId The value of the column 'SCREEN_ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setScreenRoleId(Long screenRoleId) {
        registerModifiedProperty("screenRoleId");
        _screenRoleId = screenRoleId;
    }

    /**
     * [get] ROLE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRoleId() {
        checkSpecifiedProperty("roleId");
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleId(Long roleId) {
        registerModifiedProperty("roleId");
        _roleId = roleId;
    }

    /**
     * [get] SCREEN_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getScreenId() {
        checkSpecifiedProperty("screenId");
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (basically NotNull if update: for the constraint)
     */
    public void setScreenId(Long screenId) {
        registerModifiedProperty("screenId");
        _screenId = screenId;
    }

    /**
     * [get] VISIBLE: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @return The value of the column 'VISIBLE'. (basically NotNull if selected: for the constraint)
     */
    public String getVisible() {
        checkSpecifiedProperty("visible");
        return convertEmptyToNull(_visible);
    }

    /**
     * [set] VISIBLE: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=Visible} <br>
     * 表示可否
     * @param visible The value of the column 'VISIBLE'. (basically NotNull if update: for the constraint)
     */
    public void setVisible(String visible) {
        registerModifiedProperty("visible");
        _visible = visible;
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
