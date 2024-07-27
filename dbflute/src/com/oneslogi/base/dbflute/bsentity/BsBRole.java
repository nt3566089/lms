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
 * The entity of b_role as TABLE. <br>
 * 権限マスタ
 * <pre>
 * [primary-key]
 *     ROLE_ID
 *
 * [column]
 *     ROLE_ID, ROLE_CD, DICT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ROLE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_dict, v_dict
 *
 * [referrer table]
 *     b_col_role, b_func_role, b_item_role, b_role_grp_dtl, b_screen_role
 *
 * [foreign property]
 *     bDict, vDict
 *
 * [referrer property]
 *     bColRoleList, bFuncRoleList, bItemRoleList, bRoleGrpDtlList, bScreenRoleList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long roleId = entity.getRoleId();
 * String roleCd = entity.getRoleCd();
 * Long dictId = entity.getDictId();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setRoleId(roleId);
 * entity.setRoleCd(roleCd);
 * entity.setDictId(dictId);
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
public abstract class BsBRole extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ROLE_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _roleId;

    /** ROLE_CD: {UQ, NotNull, VARCHAR(30)} */
    protected String _roleCd;

    /** DICT_ID: {IX, BIGINT(19), FK to b_dict} */
    protected Long _dictId;

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
        return "b_role";
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
        if (_roleId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param roleCd : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String roleCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("roleCd");
        setRoleCd(roleCd);
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
    /** b_dict by my DICT_ID, named 'BDict'. */
    protected BDict _bDict;

    /**
     * [get] b_dict by my DICT_ID, named 'BDict'. <br>
     * @return The entity of foreign property 'BDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BDict getBDict() {
        return _bDict;
    }

    /**
     * [set] b_dict by my DICT_ID, named 'BDict'.
     * @param bDict The entity of foreign property 'BDict'. (NullAllowed)
     */
    public void setBDict(BDict bDict) {
        _bDict = bDict;
    }

    /** v_dict by my DICT_ID, named 'VDict'. */
    protected VDict _vDict;

    /**
     * [get] v_dict by my DICT_ID, named 'VDict'. <br>
     * @return The entity of foreign property 'VDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VDict getVDict() {
        return _vDict;
    }

    /**
     * [set] v_dict by my DICT_ID, named 'VDict'.
     * @param vDict The entity of foreign property 'VDict'. (NullAllowed)
     */
    public void setVDict(VDict vDict) {
        _vDict = vDict;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** b_col_role by ROLE_ID, named 'BColRoleList'. */
    protected List<BColRole> _bColRoleList;

    /**
     * [get] b_col_role by ROLE_ID, named 'BColRoleList'.
     * @return The entity list of referrer property 'BColRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BColRole> getBColRoleList() {
        if (_bColRoleList == null) { _bColRoleList = newReferrerList(); }
        return _bColRoleList;
    }

    /**
     * [set] b_col_role by ROLE_ID, named 'BColRoleList'.
     * @param bColRoleList The entity list of referrer property 'BColRoleList'. (NullAllowed)
     */
    public void setBColRoleList(List<BColRole> bColRoleList) {
        _bColRoleList = bColRoleList;
    }

    /** b_func_role by ROLE_ID, named 'BFuncRoleList'. */
    protected List<BFuncRole> _bFuncRoleList;

    /**
     * [get] b_func_role by ROLE_ID, named 'BFuncRoleList'.
     * @return The entity list of referrer property 'BFuncRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BFuncRole> getBFuncRoleList() {
        if (_bFuncRoleList == null) { _bFuncRoleList = newReferrerList(); }
        return _bFuncRoleList;
    }

    /**
     * [set] b_func_role by ROLE_ID, named 'BFuncRoleList'.
     * @param bFuncRoleList The entity list of referrer property 'BFuncRoleList'. (NullAllowed)
     */
    public void setBFuncRoleList(List<BFuncRole> bFuncRoleList) {
        _bFuncRoleList = bFuncRoleList;
    }

    /** b_item_role by ROLE_ID, named 'BItemRoleList'. */
    protected List<BItemRole> _bItemRoleList;

    /**
     * [get] b_item_role by ROLE_ID, named 'BItemRoleList'.
     * @return The entity list of referrer property 'BItemRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BItemRole> getBItemRoleList() {
        if (_bItemRoleList == null) { _bItemRoleList = newReferrerList(); }
        return _bItemRoleList;
    }

    /**
     * [set] b_item_role by ROLE_ID, named 'BItemRoleList'.
     * @param bItemRoleList The entity list of referrer property 'BItemRoleList'. (NullAllowed)
     */
    public void setBItemRoleList(List<BItemRole> bItemRoleList) {
        _bItemRoleList = bItemRoleList;
    }

    /** b_role_grp_dtl by ROLE_ID, named 'BRoleGrpDtlList'. */
    protected List<BRoleGrpDtl> _bRoleGrpDtlList;

    /**
     * [get] b_role_grp_dtl by ROLE_ID, named 'BRoleGrpDtlList'.
     * @return The entity list of referrer property 'BRoleGrpDtlList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BRoleGrpDtl> getBRoleGrpDtlList() {
        if (_bRoleGrpDtlList == null) { _bRoleGrpDtlList = newReferrerList(); }
        return _bRoleGrpDtlList;
    }

    /**
     * [set] b_role_grp_dtl by ROLE_ID, named 'BRoleGrpDtlList'.
     * @param bRoleGrpDtlList The entity list of referrer property 'BRoleGrpDtlList'. (NullAllowed)
     */
    public void setBRoleGrpDtlList(List<BRoleGrpDtl> bRoleGrpDtlList) {
        _bRoleGrpDtlList = bRoleGrpDtlList;
    }

    /** b_screen_role by ROLE_ID, named 'BScreenRoleList'. */
    protected List<BScreenRole> _bScreenRoleList;

    /**
     * [get] b_screen_role by ROLE_ID, named 'BScreenRoleList'.
     * @return The entity list of referrer property 'BScreenRoleList'. (NotNull: even if no loading, returns empty list)
     */
    public List<BScreenRole> getBScreenRoleList() {
        if (_bScreenRoleList == null) { _bScreenRoleList = newReferrerList(); }
        return _bScreenRoleList;
    }

    /**
     * [set] b_screen_role by ROLE_ID, named 'BScreenRoleList'.
     * @param bScreenRoleList The entity list of referrer property 'BScreenRoleList'. (NullAllowed)
     */
    public void setBScreenRoleList(List<BScreenRole> bScreenRoleList) {
        _bScreenRoleList = bScreenRoleList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsBRole) {
            BsBRole other = (BsBRole)obj;
            if (!xSV(_roleId, other._roleId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _roleId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_bColRoleList != null) { for (BColRole et : _bColRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bColRoleList")); } } }
        if (_bFuncRoleList != null) { for (BFuncRole et : _bFuncRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bFuncRoleList")); } } }
        if (_bItemRoleList != null) { for (BItemRole et : _bItemRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bItemRoleList")); } } }
        if (_bRoleGrpDtlList != null) { for (BRoleGrpDtl et : _bRoleGrpDtlList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bRoleGrpDtlList")); } } }
        if (_bScreenRoleList != null) { for (BScreenRole et : _bScreenRoleList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "bScreenRoleList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_roleId));
        sb.append(dm).append(xfND(_roleCd));
        sb.append(dm).append(xfND(_dictId));
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
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_bColRoleList != null && !_bColRoleList.isEmpty())
        { sb.append(dm).append("bColRoleList"); }
        if (_bFuncRoleList != null && !_bFuncRoleList.isEmpty())
        { sb.append(dm).append("bFuncRoleList"); }
        if (_bItemRoleList != null && !_bItemRoleList.isEmpty())
        { sb.append(dm).append("bItemRoleList"); }
        if (_bRoleGrpDtlList != null && !_bRoleGrpDtlList.isEmpty())
        { sb.append(dm).append("bRoleGrpDtlList"); }
        if (_bScreenRoleList != null && !_bScreenRoleList.isEmpty())
        { sb.append(dm).append("bScreenRoleList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BRole clone() {
        return (BRole)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ROLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 権限ID
     * @return The value of the column 'ROLE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRoleId() {
        checkSpecifiedProperty("roleId");
        return _roleId;
    }

    /**
     * [set] ROLE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 権限ID
     * @param roleId The value of the column 'ROLE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleId(Long roleId) {
        registerModifiedProperty("roleId");
        _roleId = roleId;
    }

    /**
     * [get] ROLE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 権限CD
     * @return The value of the column 'ROLE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getRoleCd() {
        checkSpecifiedProperty("roleCd");
        return convertEmptyToNull(_roleCd);
    }

    /**
     * [set] ROLE_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * 権限CD
     * @param roleCd The value of the column 'ROLE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setRoleCd(String roleCd) {
        registerModifiedProperty("roleCd");
        _roleCd = roleCd;
    }

    /**
     * [get] DICT_ID: {IX, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDictId() {
        checkSpecifiedProperty("dictId");
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDictId(Long dictId) {
        registerModifiedProperty("dictId");
        _dictId = dictId;
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
