package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of b_dict as TABLE. <br>
 * 辞書マスタ
 * <pre>
 * [primary-key]
 *     DICT_ID
 *
 * [column]
 *     DICT_ID, DICT_NM, DATA_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_class_dtl(ByDataType), b_dict_valid(AsOne), m_ht_dict(AsOne)
 *
 * [referrer-table]
 *     b_arg, b_class_dtl, b_col, b_culture, b_dict_culture, b_item, b_menu, b_menu_grp, b_role, b_role_grp, b_screen, m_center_class_dtl, m_center_col, m_center_item, m_center_screen, m_client_col, m_client_item, m_client_screen, m_process_type, m_shape, m_stock_type, p_report_layout_item, p_subrep_layout_item, b_dict_valid, m_ht_dict
 *
 * [foreign-property]
 *     bClassDtlByDataType, bDictValidAsOne, mHtDictAsOne
 *
 * [referrer-property]
 *     bArgList, bClassDtlList, bColList, bCultureList, bDictCultureList, bItemList, bMenuList, bMenuGrpList, bRoleList, bRoleGrpList, bScreenList, mCenterClassDtlList, mCenterColList, mCenterItemList, mCenterScreenList, mClientColList, mClientItemList, mClientScreenList, mProcessTypeList, mShapeByShapeDictIdList, mShapeByShapeUnitDictIdList, mStockTypeList, pReportLayoutItemList, pSubrepLayoutItemList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsBDictDto implements Serializable {

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
    /** DICT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _dictId;

    /** DICT_NM: {UQ, NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _dictNm;

    /** DATA_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=DataType} */
    @JsonKey
    protected String _dataType;

    /** SYSTEM_TYPE: {VARCHAR(30)} */
    @JsonKey
    protected String _systemType;

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
    public BsBDictDto() {
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
    protected BClassDtlDto _bClassDtlByDataType;

    public BClassDtlDto getBClassDtlByDataType() {
        return _bClassDtlByDataType;
    }

    public void setBClassDtlByDataType(BClassDtlDto bClassDtlByDataType) {
        this._bClassDtlByDataType = bClassDtlByDataType;
    }

    protected BDictValidDto _bDictValidAsOne;

    public BDictValidDto getBDictValidAsOne() {
        return _bDictValidAsOne;
    }

    public void setBDictValidAsOne(BDictValidDto BDictValidAsOne) {
        this._bDictValidAsOne = BDictValidAsOne;
    }

    protected MHtDictDto _mHtDictAsOne;

    public MHtDictDto getMHtDictAsOne() {
        return _mHtDictAsOne;
    }

    public void setMHtDictAsOne(MHtDictDto MHtDictAsOne) {
        this._mHtDictAsOne = MHtDictAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<BArgDto> _bArgList;

    public List<BArgDto> getBArgList() {
        if (_bArgList == null) { _bArgList = new ArrayList<BArgDto>(); }
        return _bArgList;
    }

    public void setBArgList(List<BArgDto> bArgList) {
        this._bArgList = bArgList;
    }

    protected List<BClassDtlDto> _bClassDtlList;

    public List<BClassDtlDto> getBClassDtlList() {
        if (_bClassDtlList == null) { _bClassDtlList = new ArrayList<BClassDtlDto>(); }
        return _bClassDtlList;
    }

    public void setBClassDtlList(List<BClassDtlDto> bClassDtlList) {
        this._bClassDtlList = bClassDtlList;
    }

    protected List<BColDto> _bColList;

    public List<BColDto> getBColList() {
        if (_bColList == null) { _bColList = new ArrayList<BColDto>(); }
        return _bColList;
    }

    public void setBColList(List<BColDto> bColList) {
        this._bColList = bColList;
    }

    protected List<BCultureDto> _bCultureList;

    public List<BCultureDto> getBCultureList() {
        if (_bCultureList == null) { _bCultureList = new ArrayList<BCultureDto>(); }
        return _bCultureList;
    }

    public void setBCultureList(List<BCultureDto> bCultureList) {
        this._bCultureList = bCultureList;
    }

    protected List<BDictCultureDto> _bDictCultureList;

    public List<BDictCultureDto> getBDictCultureList() {
        if (_bDictCultureList == null) { _bDictCultureList = new ArrayList<BDictCultureDto>(); }
        return _bDictCultureList;
    }

    public void setBDictCultureList(List<BDictCultureDto> bDictCultureList) {
        this._bDictCultureList = bDictCultureList;
    }

    protected List<BItemDto> _bItemList;

    public List<BItemDto> getBItemList() {
        if (_bItemList == null) { _bItemList = new ArrayList<BItemDto>(); }
        return _bItemList;
    }

    public void setBItemList(List<BItemDto> bItemList) {
        this._bItemList = bItemList;
    }

    protected List<BMenuDto> _bMenuList;

    public List<BMenuDto> getBMenuList() {
        if (_bMenuList == null) { _bMenuList = new ArrayList<BMenuDto>(); }
        return _bMenuList;
    }

    public void setBMenuList(List<BMenuDto> bMenuList) {
        this._bMenuList = bMenuList;
    }

    protected List<BMenuGrpDto> _bMenuGrpList;

    public List<BMenuGrpDto> getBMenuGrpList() {
        if (_bMenuGrpList == null) { _bMenuGrpList = new ArrayList<BMenuGrpDto>(); }
        return _bMenuGrpList;
    }

    public void setBMenuGrpList(List<BMenuGrpDto> bMenuGrpList) {
        this._bMenuGrpList = bMenuGrpList;
    }

    protected List<BRoleDto> _bRoleList;

    public List<BRoleDto> getBRoleList() {
        if (_bRoleList == null) { _bRoleList = new ArrayList<BRoleDto>(); }
        return _bRoleList;
    }

    public void setBRoleList(List<BRoleDto> bRoleList) {
        this._bRoleList = bRoleList;
    }

    protected List<BRoleGrpDto> _bRoleGrpList;

    public List<BRoleGrpDto> getBRoleGrpList() {
        if (_bRoleGrpList == null) { _bRoleGrpList = new ArrayList<BRoleGrpDto>(); }
        return _bRoleGrpList;
    }

    public void setBRoleGrpList(List<BRoleGrpDto> bRoleGrpList) {
        this._bRoleGrpList = bRoleGrpList;
    }

    protected List<BScreenDto> _bScreenList;

    public List<BScreenDto> getBScreenList() {
        if (_bScreenList == null) { _bScreenList = new ArrayList<BScreenDto>(); }
        return _bScreenList;
    }

    public void setBScreenList(List<BScreenDto> bScreenList) {
        this._bScreenList = bScreenList;
    }

    protected List<MCenterClassDtlDto> _mCenterClassDtlList;

    public List<MCenterClassDtlDto> getMCenterClassDtlList() {
        if (_mCenterClassDtlList == null) { _mCenterClassDtlList = new ArrayList<MCenterClassDtlDto>(); }
        return _mCenterClassDtlList;
    }

    public void setMCenterClassDtlList(List<MCenterClassDtlDto> mCenterClassDtlList) {
        this._mCenterClassDtlList = mCenterClassDtlList;
    }

    protected List<MCenterColDto> _mCenterColList;

    public List<MCenterColDto> getMCenterColList() {
        if (_mCenterColList == null) { _mCenterColList = new ArrayList<MCenterColDto>(); }
        return _mCenterColList;
    }

    public void setMCenterColList(List<MCenterColDto> mCenterColList) {
        this._mCenterColList = mCenterColList;
    }

    protected List<MCenterItemDto> _mCenterItemList;

    public List<MCenterItemDto> getMCenterItemList() {
        if (_mCenterItemList == null) { _mCenterItemList = new ArrayList<MCenterItemDto>(); }
        return _mCenterItemList;
    }

    public void setMCenterItemList(List<MCenterItemDto> mCenterItemList) {
        this._mCenterItemList = mCenterItemList;
    }

    protected List<MCenterScreenDto> _mCenterScreenList;

    public List<MCenterScreenDto> getMCenterScreenList() {
        if (_mCenterScreenList == null) { _mCenterScreenList = new ArrayList<MCenterScreenDto>(); }
        return _mCenterScreenList;
    }

    public void setMCenterScreenList(List<MCenterScreenDto> mCenterScreenList) {
        this._mCenterScreenList = mCenterScreenList;
    }

    protected List<MClientColDto> _mClientColList;

    public List<MClientColDto> getMClientColList() {
        if (_mClientColList == null) { _mClientColList = new ArrayList<MClientColDto>(); }
        return _mClientColList;
    }

    public void setMClientColList(List<MClientColDto> mClientColList) {
        this._mClientColList = mClientColList;
    }

    protected List<MClientItemDto> _mClientItemList;

    public List<MClientItemDto> getMClientItemList() {
        if (_mClientItemList == null) { _mClientItemList = new ArrayList<MClientItemDto>(); }
        return _mClientItemList;
    }

    public void setMClientItemList(List<MClientItemDto> mClientItemList) {
        this._mClientItemList = mClientItemList;
    }

    protected List<MClientScreenDto> _mClientScreenList;

    public List<MClientScreenDto> getMClientScreenList() {
        if (_mClientScreenList == null) { _mClientScreenList = new ArrayList<MClientScreenDto>(); }
        return _mClientScreenList;
    }

    public void setMClientScreenList(List<MClientScreenDto> mClientScreenList) {
        this._mClientScreenList = mClientScreenList;
    }

    protected List<MProcessTypeDto> _mProcessTypeList;

    public List<MProcessTypeDto> getMProcessTypeList() {
        if (_mProcessTypeList == null) { _mProcessTypeList = new ArrayList<MProcessTypeDto>(); }
        return _mProcessTypeList;
    }

    public void setMProcessTypeList(List<MProcessTypeDto> mProcessTypeList) {
        this._mProcessTypeList = mProcessTypeList;
    }

    protected List<MShapeDto> _mShapeByShapeDictIdList;

    public List<MShapeDto> getMShapeByShapeDictIdList() {
        if (_mShapeByShapeDictIdList == null) { _mShapeByShapeDictIdList = new ArrayList<MShapeDto>(); }
        return _mShapeByShapeDictIdList;
    }

    public void setMShapeByShapeDictIdList(List<MShapeDto> mShapeByShapeDictIdList) {
        this._mShapeByShapeDictIdList = mShapeByShapeDictIdList;
    }

    protected List<MShapeDto> _mShapeByShapeUnitDictIdList;

    public List<MShapeDto> getMShapeByShapeUnitDictIdList() {
        if (_mShapeByShapeUnitDictIdList == null) { _mShapeByShapeUnitDictIdList = new ArrayList<MShapeDto>(); }
        return _mShapeByShapeUnitDictIdList;
    }

    public void setMShapeByShapeUnitDictIdList(List<MShapeDto> mShapeByShapeUnitDictIdList) {
        this._mShapeByShapeUnitDictIdList = mShapeByShapeUnitDictIdList;
    }

    protected List<MStockTypeDto> _mStockTypeList;

    public List<MStockTypeDto> getMStockTypeList() {
        if (_mStockTypeList == null) { _mStockTypeList = new ArrayList<MStockTypeDto>(); }
        return _mStockTypeList;
    }

    public void setMStockTypeList(List<MStockTypeDto> mStockTypeList) {
        this._mStockTypeList = mStockTypeList;
    }

    protected List<PReportLayoutItemDto> _pReportLayoutItemList;

    public List<PReportLayoutItemDto> getPReportLayoutItemList() {
        if (_pReportLayoutItemList == null) { _pReportLayoutItemList = new ArrayList<PReportLayoutItemDto>(); }
        return _pReportLayoutItemList;
    }

    public void setPReportLayoutItemList(List<PReportLayoutItemDto> pReportLayoutItemList) {
        this._pReportLayoutItemList = pReportLayoutItemList;
    }

    protected List<PSubrepLayoutItemDto> _pSubrepLayoutItemList;

    public List<PSubrepLayoutItemDto> getPSubrepLayoutItemList() {
        if (_pSubrepLayoutItemList == null) { _pSubrepLayoutItemList = new ArrayList<PSubrepLayoutItemDto>(); }
        return _pSubrepLayoutItemList;
    }

    public void setPSubrepLayoutItemList(List<PSubrepLayoutItemDto> pSubrepLayoutItemList) {
        this._pSubrepLayoutItemList = pSubrepLayoutItemList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBDictDto)) { return false; }
        final BsBDictDto otherEntity = (BsBDictDto)other;
        if (!helpComparingValue(getDictId(), otherEntity.getDictId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "b_dict");
        result = xCH(result, getDictId());
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
        sb.append(c).append(getDictId());
        sb.append(c).append(getDictNm());
        sb.append(c).append(getDataType());
        sb.append(c).append(getSystemType());
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
     * [get] DICT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 辞書ID
     * @return The value of the column 'DICT_ID'. (NullAllowed)
     */
    public Long getDictId() {
        return _dictId;
    }

    /**
     * [set] DICT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 辞書ID
     * @param dictId The value of the column 'DICT_ID'. (NullAllowed)
     */
    public void setDictId(Long dictId) {
        __modifiedProperties.add("dictId");
        this._dictId = dictId;
    }

    /**
     * [get] DICT_NM: {UQ, NotNull, VARCHAR(100)} <br>
     * 辞書名
     * @return The value of the column 'DICT_NM'. (NullAllowed)
     */
    public String getDictNm() {
        return _dictNm;
    }

    /**
     * [set] DICT_NM: {UQ, NotNull, VARCHAR(100)} <br>
     * 辞書名
     * @param dictNm The value of the column 'DICT_NM'. (NullAllowed)
     */
    public void setDictNm(String dictNm) {
        __modifiedProperties.add("dictNm");
        this._dictNm = dictNm;
    }

    /**
     * [get] DATA_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @return The value of the column 'DATA_TYPE'. (NullAllowed)
     */
    public String getDataType() {
        return _dataType;
    }

    /**
     * [set] DATA_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param dataType The value of the column 'DATA_TYPE'. (NullAllowed)
     */
    public void setDataType(String dataType) {
        __modifiedProperties.add("dataType");
        this._dataType = dataType;
    }

    /**
     * [get] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム種別
     * @return The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public String getSystemType() {
        return _systemType;
    }

    /**
     * [set] SYSTEM_TYPE: {VARCHAR(30)} <br>
     * システム種別
     * @param systemType The value of the column 'SYSTEM_TYPE'. (NullAllowed)
     */
    public void setSystemType(String systemType) {
        __modifiedProperties.add("systemType");
        this._systemType = systemType;
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
