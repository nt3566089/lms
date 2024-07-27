package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of b_menu as TABLE. <br>
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
 * [foreign-table]
 *     b_menu_grp, b_screen, b_dict, v_dict, v_ht_dict, b_class_dtl(ByTargetWindow)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bMenuGrp, bScreen, bDict, vDict, vHtDict, bClassDtlByTargetWindow
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBMenuDto implements Serializable {

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
    /** MENU_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _menuId;

    /** MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} */
    @JsonKey
    protected Long _menuGrpId;

    /** SCREEN_ID: {IX, BIGINT(19), FK to b_screen} */
    @JsonKey
    protected Long _screenId;

    /** DICT_ID: {IX, BIGINT(19), FK to b_dict} */
    @JsonKey
    protected Long _dictId;

    /** URL_PATH: {VARCHAR(255)} */
    @JsonKey
    protected String _urlPath;

    /** VIEW_ORDER: {BIGINT(19)} */
    @JsonKey
    protected Long _viewOrder;

    /** TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} */
    @JsonKey
    protected String _targetWindow;

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
    public BsBMenuDto() {
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
    protected BMenuGrpDto _bMenuGrp;

    public BMenuGrpDto getBMenuGrp() {
        return _bMenuGrp;
    }

    public void setBMenuGrp(BMenuGrpDto bMenuGrp) {
        this._bMenuGrp = bMenuGrp;
    }

    protected BScreenDto _bScreen;

    public BScreenDto getBScreen() {
        return _bScreen;
    }

    public void setBScreen(BScreenDto bScreen) {
        this._bScreen = bScreen;
    }

    protected BDictDto _bDict;

    public BDictDto getBDict() {
        return _bDict;
    }

    public void setBDict(BDictDto bDict) {
        this._bDict = bDict;
    }

    protected VDictDto _vDict;

    public VDictDto getVDict() {
        return _vDict;
    }

    public void setVDict(VDictDto vDict) {
        this._vDict = vDict;
    }

    protected VHtDictDto _vHtDict;

    public VHtDictDto getVHtDict() {
        return _vHtDict;
    }

    public void setVHtDict(VHtDictDto vHtDict) {
        this._vHtDict = vHtDict;
    }

    protected BClassDtlDto _bClassDtlByTargetWindow;

    public BClassDtlDto getBClassDtlByTargetWindow() {
        return _bClassDtlByTargetWindow;
    }

    public void setBClassDtlByTargetWindow(BClassDtlDto bClassDtlByTargetWindow) {
        this._bClassDtlByTargetWindow = bClassDtlByTargetWindow;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBMenuDto)) { return false; }
        final BsBMenuDto otherEntity = (BsBMenuDto)other;
        if (!helpComparingValue(getMenuId(), otherEntity.getMenuId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "b_menu");
        result = xCH(result, getMenuId());
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
        sb.append(c).append(getMenuId());
        sb.append(c).append(getMenuGrpId());
        sb.append(c).append(getScreenId());
        sb.append(c).append(getDictId());
        sb.append(c).append(getUrlPath());
        sb.append(c).append(getViewOrder());
        sb.append(c).append(getTargetWindow());
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
     * [get] MENU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューID
     * @return The value of the column 'MENU_ID'. (NullAllowed)
     */
    public Long getMenuId() {
        return _menuId;
    }

    /**
     * [set] MENU_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューID
     * @param menuId The value of the column 'MENU_ID'. (NullAllowed)
     */
    public void setMenuId(Long menuId) {
        __modifiedProperties.add("menuId");
        this._menuId = menuId;
    }

    /**
     * [get] MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} <br>
     * メニューグループID
     * @return The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public Long getMenuGrpId() {
        return _menuGrpId;
    }

    /**
     * [set] MENU_GRP_ID: {IX, NotNull, BIGINT(19), FK to b_menu_grp} <br>
     * メニューグループID
     * @param menuGrpId The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public void setMenuGrpId(Long menuGrpId) {
        __modifiedProperties.add("menuGrpId");
        this._menuGrpId = menuGrpId;
    }

    /**
     * [get] SCREEN_ID: {IX, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @return The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public Long getScreenId() {
        return _screenId;
    }

    /**
     * [set] SCREEN_ID: {IX, BIGINT(19), FK to b_screen} <br>
     * 画面ID
     * @param screenId The value of the column 'SCREEN_ID'. (NullAllowed)
     */
    public void setScreenId(Long screenId) {
        __modifiedProperties.add("screenId");
        this._screenId = screenId;
    }

    /**
     * [get] DICT_ID: {IX, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
    }

    /**
     * [get] URL_PATH: {VARCHAR(255)} <br>
     * URLパス
     * @return The value of the column 'URL_PATH'. (NullAllowed)
     */
    public String getUrlPath() {
        return _urlPath;
    }

    /**
     * [set] URL_PATH: {VARCHAR(255)} <br>
     * URLパス
     * @param urlPath The value of the column 'URL_PATH'. (NullAllowed)
     */
    public void setUrlPath(String urlPath) {
        __modifiedProperties.add("urlPath");
        this._urlPath = urlPath;
    }

    /**
     * [get] VIEW_ORDER: {BIGINT(19)} <br>
     * 表示順
     * @return The value of the column 'VIEW_ORDER'. (NullAllowed)
     */
    public Long getViewOrder() {
        return _viewOrder;
    }

    /**
     * [set] VIEW_ORDER: {BIGINT(19)} <br>
     * 表示順
     * @param viewOrder The value of the column 'VIEW_ORDER'. (NullAllowed)
     */
    public void setViewOrder(Long viewOrder) {
        __modifiedProperties.add("viewOrder");
        this._viewOrder = viewOrder;
    }

    /**
     * [get] TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @return The value of the column 'TARGET_WINDOW'. (NullAllowed)
     */
    public String getTargetWindow() {
        return _targetWindow;
    }

    /**
     * [set] TARGET_WINDOW: {VARCHAR(30), FK to B_CLASS_DTL, classification=TargetWindow} <br>
     * ターゲットウインドウ
     * @param targetWindow The value of the column 'TARGET_WINDOW'. (NullAllowed)
     */
    public void setTargetWindow(String targetWindow) {
        __modifiedProperties.add("targetWindow");
        this._targetWindow = targetWindow;
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
