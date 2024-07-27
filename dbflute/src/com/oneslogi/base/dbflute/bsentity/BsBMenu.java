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
 * The entity of b_menu as TABLE. <br>
 * メニューマスタ
 * <pre>
 * [primary-key]
 *     MENU_ID
 *
 * [column]
 *     MENU_ID, MENU_GRP_ID, SCREEN_ID, DICT_ID, URL_PATH, VIEW_ORDER, TARGET_WINDOW, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_menu_grp, b_screen, b_dict, v_dict, v_ht_dict, b_class_dtl(ByTargetWindow)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bMenuGrp, bScreen, bDict, vDict, vHtDict, bClassDtlByTargetWindow
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long menuId = entity.getMenuId();
 * Long menuGrpId = entity.getMenuGrpId();
 * Long screenId = entity.getScreenId();
 * Long dictId = entity.getDictId();
 * String urlPath = entity.getUrlPath();
 * Long viewOrder = entity.getViewOrder();
 * String targetWindow = entity.getTargetWindow();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setMenuId(menuId);
 * entity.setMenuGrpId(menuGrpId);
 * entity.setScreenId(screenId);
 * entity.setDictId(dictId);
 * entity.setUrlPath(urlPath);
 * entity.setViewOrder(viewOrder);
 * entity.setTargetWindow(targetWindow);
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
public abstract class BsBMenu extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MENU_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _menuId;

    /** MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} */
    protected Long _menuGrpId;

    /** SCREEN_ID: {IX, BIGINT(19), FK to b_screen} */
    protected Long _screenId;

    /** DICT_ID: {IX, BIGINT(19), FK to b_dict} */
    protected Long _dictId;

    /** URL_PATH: {VARCHAR(255)} */
    protected String _urlPath;

    /** VIEW_ORDER: {BIGINT(19)} */
    protected Long _viewOrder;

    /** TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} */
    protected String _targetWindow;

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
        return "b_menu";
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
        if (_menuId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of targetWindow as the classification of TargetWindow. <br>
     * TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TargetWindow getTargetWindowAsTargetWindow() {
        return CDef.TargetWindow.codeOf(getTargetWindow());
    }

    /**
     * Set the value of targetWindow as the classification of TargetWindow. <br>
     * TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTargetWindowAsTargetWindow(CDef.TargetWindow cdef) {
        setTargetWindow(cdef != null ? cdef.code() : null);
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
     * Set the value of targetWindow as $0 (0). <br>
     * $0: 同一ウインドウで開く
     */
    public void setTargetWindow_$0() {
        setTargetWindowAsTargetWindow(CDef.TargetWindow.$0);
    }

    /**
     * Set the value of targetWindow as $1 (1). <br>
     * $1: 別ウインドウを新規で開く
     */
    public void setTargetWindow_$1() {
        setTargetWindowAsTargetWindow(CDef.TargetWindow.$1);
    }

    /**
     * Set the value of targetWindow as $2 (2). <br>
     * $2: 別ウインドウを同一画面で開く
     */
    public void setTargetWindow_$2() {
        setTargetWindowAsTargetWindow(CDef.TargetWindow.$2);
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
     * Is the value of targetWindow $0? <br>
     * $0: 同一ウインドウで開く
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTargetWindow$0() {
        CDef.TargetWindow cdef = getTargetWindowAsTargetWindow();
        return cdef != null ? cdef.equals(CDef.TargetWindow.$0) : false;
    }

    /**
     * Is the value of targetWindow $1? <br>
     * $1: 別ウインドウを新規で開く
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTargetWindow$1() {
        CDef.TargetWindow cdef = getTargetWindowAsTargetWindow();
        return cdef != null ? cdef.equals(CDef.TargetWindow.$1) : false;
    }

    /**
     * Is the value of targetWindow $2? <br>
     * $2: 別ウインドウを同一画面で開く
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTargetWindow$2() {
        CDef.TargetWindow cdef = getTargetWindowAsTargetWindow();
        return cdef != null ? cdef.equals(CDef.TargetWindow.$2) : false;
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
     * Get the value of the column 'targetWindow' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getTargetWindowName() {
        CDef.TargetWindow cdef = getTargetWindowAsTargetWindow();
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
    /** b_menu_grp by my MENU_GRP_ID, named 'BMenuGrp'. */
    protected BMenuGrp _bMenuGrp;

    /**
     * [get] b_menu_grp by my MENU_GRP_ID, named 'BMenuGrp'. <br>
     * @return The entity of foreign property 'BMenuGrp'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BMenuGrp getBMenuGrp() {
        return _bMenuGrp;
    }

    /**
     * [set] b_menu_grp by my MENU_GRP_ID, named 'BMenuGrp'.
     * @param bMenuGrp The entity of foreign property 'BMenuGrp'. (NullAllowed)
     */
    public void setBMenuGrp(BMenuGrp bMenuGrp) {
        _bMenuGrp = bMenuGrp;
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

    /** v_ht_dict by my DICT_ID, named 'VHtDict'. */
    protected VHtDict _vHtDict;

    /**
     * [get] v_ht_dict by my DICT_ID, named 'VHtDict'. <br>
     * @return The entity of foreign property 'VHtDict'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public VHtDict getVHtDict() {
        return _vHtDict;
    }

    /**
     * [set] v_ht_dict by my DICT_ID, named 'VHtDict'.
     * @param vHtDict The entity of foreign property 'VHtDict'. (NullAllowed)
     */
    public void setVHtDict(VHtDict vHtDict) {
        _vHtDict = vHtDict;
    }

    /** b_class_dtl by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'. */
    protected BClassDtl _bClassDtlByTargetWindow;

    /**
     * [get] b_class_dtl by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'. <br>
     * @return The entity of foreign property 'BClassDtlByTargetWindow'. (NullAllowed: when e.g. null FK column, no setupSelect)
     */
    public BClassDtl getBClassDtlByTargetWindow() {
        return _bClassDtlByTargetWindow;
    }

    /**
     * [set] b_class_dtl by my TARGET_WINDOW, named 'BClassDtlByTargetWindow'.
     * @param bClassDtlByTargetWindow The entity of foreign property 'BClassDtlByTargetWindow'. (NullAllowed)
     */
    public void setBClassDtlByTargetWindow(BClassDtl bClassDtlByTargetWindow) {
        _bClassDtlByTargetWindow = bClassDtlByTargetWindow;
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
        if (obj instanceof BsBMenu) {
            BsBMenu other = (BsBMenu)obj;
            if (!xSV(_menuId, other._menuId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _menuId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_bMenuGrp != null)
        { sb.append(li).append(xbRDS(_bMenuGrp, "bMenuGrp")); }
        if (_bScreen != null)
        { sb.append(li).append(xbRDS(_bScreen, "bScreen")); }
        if (_bDict != null)
        { sb.append(li).append(xbRDS(_bDict, "bDict")); }
        if (_vDict != null)
        { sb.append(li).append(xbRDS(_vDict, "vDict")); }
        if (_vHtDict != null)
        { sb.append(li).append(xbRDS(_vHtDict, "vHtDict")); }
        if (_bClassDtlByTargetWindow != null)
        { sb.append(li).append(xbRDS(_bClassDtlByTargetWindow, "bClassDtlByTargetWindow")); }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_menuId));
        sb.append(dm).append(xfND(_menuGrpId));
        sb.append(dm).append(xfND(_screenId));
        sb.append(dm).append(xfND(_dictId));
        sb.append(dm).append(xfND(_urlPath));
        sb.append(dm).append(xfND(_viewOrder));
        sb.append(dm).append(xfND(_targetWindow));
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
        if (_bMenuGrp != null)
        { sb.append(dm).append("bMenuGrp"); }
        if (_bScreen != null)
        { sb.append(dm).append("bScreen"); }
        if (_bDict != null)
        { sb.append(dm).append("bDict"); }
        if (_vDict != null)
        { sb.append(dm).append("vDict"); }
        if (_vHtDict != null)
        { sb.append(dm).append("vHtDict"); }
        if (_bClassDtlByTargetWindow != null)
        { sb.append(dm).append("bClassDtlByTargetWindow"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public BMenu clone() {
        return (BMenu)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MENU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューID
     * @return The value of the column 'MENU_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMenuId() {
        checkSpecifiedProperty("menuId");
        return _menuId;
    }

    /**
     * [set] MENU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューID
     * @param menuId The value of the column 'MENU_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMenuId(Long menuId) {
        registerModifiedProperty("menuId");
        _menuId = menuId;
    }

    /**
     * [get] MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} <br>
     * メニューグループID
     * @return The value of the column 'MENU_GRP_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMenuGrpId() {
        checkSpecifiedProperty("menuGrpId");
        return _menuGrpId;
    }

    /**
     * [set] MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} <br>
     * メニューグループID
     * @param menuGrpId The value of the column 'MENU_GRP_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMenuGrpId(Long menuGrpId) {
        registerModifiedProperty("menuGrpId");
        _menuGrpId = menuGrpId;
    }

    /**
     * [get] SCREEN_ID: {IX, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getScreenId() {
        checkSpecifiedProperty("screenId");
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {IX, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScreenId(Long screenId) {
        registerModifiedProperty("screenId");
        _screenId = screenId;
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
     * [get] URL_PATH: {VARCHAR(255)} <br>
     * URLパス
     * @return The value of the column 'URL_PATH'. (NullAllowed even if selected: for no constraint)
     */
    public String getUrlPath() {
        checkSpecifiedProperty("urlPath");
        return convertEmptyToNull(_urlPath);
    }

    /**
     * [set] URL_PATH: {VARCHAR(255)} <br>
     * URLパス
     * @param urlPath The value of the column 'URL_PATH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUrlPath(String urlPath) {
        registerModifiedProperty("urlPath");
        _urlPath = urlPath;
    }

    /**
     * [get] VIEW_ORDER: {BIGINT(19)} <br>
     * 表示順
     * @return The value of the column 'VIEW_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Long getViewOrder() {
        checkSpecifiedProperty("viewOrder");
        return _viewOrder;
    }

    /**
     * [set] VIEW_ORDER: {BIGINT(19)} <br>
     * 表示順
     * @param viewOrder The value of the column 'VIEW_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setViewOrder(Long viewOrder) {
        registerModifiedProperty("viewOrder");
        _viewOrder = viewOrder;
    }

    /**
     * [get] TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @return The value of the column 'TARGET_WINDOW'. (NullAllowed even if selected: for no constraint)
     */
    public String getTargetWindow() {
        checkSpecifiedProperty("targetWindow");
        return convertEmptyToNull(_targetWindow);
    }

    /**
     * [set] TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param targetWindow The value of the column 'TARGET_WINDOW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTargetWindow(String targetWindow) {
        registerModifiedProperty("targetWindow");
        _targetWindow = targetWindow;
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
