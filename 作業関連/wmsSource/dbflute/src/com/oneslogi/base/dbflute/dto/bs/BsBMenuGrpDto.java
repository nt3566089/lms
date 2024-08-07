package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of b_menu_grp as TABLE. <br>
 * メニューグループマスタ
 * <pre>
 * [primary-key]
 *     MENU_GRP_ID
 *
 * [column]
 *     MENU_GRP_ID, MENU_GRP_CD, DICT_ID, PARENT_MENU_GRP_ID, VIEW_ORDER, VISIBLE_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MENU_GRP_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_menu_grp, b_dict, v_dict, v_ht_dict
 *
 * [referrer-table]
 *     b_menu, b_menu_grp
 *
 * [foreign-property]
 *     bMenuGrpSelf, bDict, vDict, vHtDict
 *
 * [referrer-property]
 *     bMenuList, bMenuGrpSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBMenuGrpDto implements Serializable {

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
    /** MENU_GRP_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _menuGrpId;

    /** MENU_GRP_CD: {UQ, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _menuGrpCd;

    /** DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} */
    @JsonKey
    protected Long _dictId;

    /** PARENT_MENU_GRP_ID: {IX, BIGINT(19), FK to b_menu_grp} */
    @JsonKey
    protected Long _parentMenuGrpId;

    /** VIEW_ORDER: {BIGINT(19)} */
    @JsonKey
    protected Long _viewOrder;

    /** VISIBLE_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _visibleType;

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
    public BsBMenuGrpDto() {
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
    protected BMenuGrpDto _bMenuGrpSelf;

    public BMenuGrpDto getBMenuGrpSelf() {
        return _bMenuGrpSelf;
    }

    public void setBMenuGrpSelf(BMenuGrpDto bMenuGrpSelf) {
        this._bMenuGrpSelf = bMenuGrpSelf;
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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BMenuDto> _bMenuList;

    public List<BMenuDto> getBMenuList() {
        if (_bMenuList == null) { _bMenuList = new ArrayList<BMenuDto>(); }
        return _bMenuList;
    }

    public void setBMenuList(List<BMenuDto> bMenuList) {
        this._bMenuList = bMenuList;
    }

    protected List<BMenuGrpDto> _bMenuGrpSelfList;

    public List<BMenuGrpDto> getBMenuGrpSelfList() {
        if (_bMenuGrpSelfList == null) { _bMenuGrpSelfList = new ArrayList<BMenuGrpDto>(); }
        return _bMenuGrpSelfList;
    }

    public void setBMenuGrpSelfList(List<BMenuGrpDto> bMenuGrpSelfList) {
        this._bMenuGrpSelfList = bMenuGrpSelfList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBMenuGrpDto)) { return false; }
        final BsBMenuGrpDto otherEntity = (BsBMenuGrpDto)other;
        if (!helpComparingValue(getMenuGrpId(), otherEntity.getMenuGrpId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "b_menu_grp");
        result = xCH(result, getMenuGrpId());
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
        sb.append(c).append(getMenuGrpId());
        sb.append(c).append(getMenuGrpCd());
        sb.append(c).append(getDictId());
        sb.append(c).append(getParentMenuGrpId());
        sb.append(c).append(getViewOrder());
        sb.append(c).append(getVisibleType());
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
     * [get] MENU_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューグループID
     * @return The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public Long getMenuGrpId() {
        return _menuGrpId;
    }

    /**
     * [set] MENU_GRP_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * メニューグループID
     * @param menuGrpId The value of the column 'MENU_GRP_ID'. (NullAllowed)
     */
    public void setMenuGrpId(Long menuGrpId) {
        __modifiedProperties.add("menuGrpId");
        this._menuGrpId = menuGrpId;
    }

    /**
     * [get] MENU_GRP_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * メニューグループCD
     * @return The value of the column 'MENU_GRP_CD'. (NullAllowed)
     */
    public String getMenuGrpCd() {
        return _menuGrpCd;
    }

    /**
     * [set] MENU_GRP_CD: {UQ, NotNull, VARCHAR(30)} <br>
     * メニューグループCD
     * @param menuGrpCd The value of the column 'MENU_GRP_CD'. (NullAllowed)
     */
    public void setMenuGrpCd(String menuGrpCd) {
        __modifiedProperties.add("menuGrpCd");
        this._menuGrpCd = menuGrpCd;
    }

    /**
     * [get] DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {IX, NotNull, BIGINT(19), FK to b_dict} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
    }

    /**
     * [get] PARENT_MENU_GRP_ID: {IX, BIGINT(19), FK to b_menu_grp} <br>
     * 親メニューグループID
     * @return The value of the column 'PARENT_MENU_GRP_ID'. (NullAllowed)
     */
    public Long getParentMenuGrpId() {
        return _parentMenuGrpId;
    }

    /**
     * [set] PARENT_MENU_GRP_ID: {IX, BIGINT(19), FK to b_menu_grp} <br>
     * 親メニューグループID
     * @param parentMenuGrpId The value of the column 'PARENT_MENU_GRP_ID'. (NullAllowed)
     */
    public void setParentMenuGrpId(Long parentMenuGrpId) {
        __modifiedProperties.add("parentMenuGrpId");
        this._parentMenuGrpId = parentMenuGrpId;
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
     * [get] VISIBLE_TYPE: {VARCHAR(30)} <br>
     * 表示種別
     * @return The value of the column 'VISIBLE_TYPE'. (NullAllowed)
     */
    public String getVisibleType() {
        return _visibleType;
    }

    /**
     * [set] VISIBLE_TYPE: {VARCHAR(30)} <br>
     * 表示種別
     * @param visibleType The value of the column 'VISIBLE_TYPE'. (NullAllowed)
     */
    public void setVisibleType(String visibleType) {
        __modifiedProperties.add("visibleType");
        this._visibleType = visibleType;
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
