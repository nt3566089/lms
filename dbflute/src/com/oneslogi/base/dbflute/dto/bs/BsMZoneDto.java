package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_zone as TABLE. <br>
 * ゾーンマスタ
 * <pre>
 * [primary-key]
 *     ZONE_ID
 *
 * [column]
 *     ZONE_ID, WAREHOUSE_ID, ZONE_CD, ZONE_NM, PICKING_ORDER, FLOOR_CD, STORAGE_SPACE_CD, REPLENISH_TYPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZONE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_warehouse, b_class_dtl(ByDelFlg)
 *
 * [referrer-table]
 *     m_location, m_param, t_inventory_inst
 *
 * [foreign-property]
 *     mWarehouse, bClassDtlByDelFlg
 *
 * [referrer-property]
 *     mLocationList, mParamList, tInventoryInstList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMZoneDto implements Serializable {

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
    /** ZONE_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _zoneId;

    /** WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse} */
    @JsonKey
    protected Long _warehouseId;

    /** ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _zoneCd;

    /** ZONE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _zoneNm;

    /** PICKING_ORDER: {BIGINT(19)} */
    @JsonKey
    protected Long _pickingOrder;

    /** FLOOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _floorCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storageSpaceCd;

    /** REPLENISH_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _replenishTypeCd;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} */
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
    public BsMZoneDto() {
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
    protected MWarehouseDto _mWarehouse;

    public MWarehouseDto getMWarehouse() {
        return _mWarehouse;
    }

    public void setMWarehouse(MWarehouseDto mWarehouse) {
        this._mWarehouse = mWarehouse;
    }

    protected BClassDtlDto _bClassDtlByDelFlg;

    public BClassDtlDto getBClassDtlByDelFlg() {
        return _bClassDtlByDelFlg;
    }

    public void setBClassDtlByDelFlg(BClassDtlDto bClassDtlByDelFlg) {
        this._bClassDtlByDelFlg = bClassDtlByDelFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<MLocationDto> _mLocationList;

    public List<MLocationDto> getMLocationList() {
        if (_mLocationList == null) { _mLocationList = new ArrayList<MLocationDto>(); }
        return _mLocationList;
    }

    public void setMLocationList(List<MLocationDto> mLocationList) {
        this._mLocationList = mLocationList;
    }

    protected List<MParamDto> _mParamList;

    public List<MParamDto> getMParamList() {
        if (_mParamList == null) { _mParamList = new ArrayList<MParamDto>(); }
        return _mParamList;
    }

    public void setMParamList(List<MParamDto> mParamList) {
        this._mParamList = mParamList;
    }

    protected List<TInventoryInstDto> _tInventoryInstList;

    public List<TInventoryInstDto> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = new ArrayList<TInventoryInstDto>(); }
        return _tInventoryInstList;
    }

    public void setTInventoryInstList(List<TInventoryInstDto> tInventoryInstList) {
        this._tInventoryInstList = tInventoryInstList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMZoneDto)) { return false; }
        final BsMZoneDto otherEntity = (BsMZoneDto)other;
        if (!helpComparingValue(getZoneId(), otherEntity.getZoneId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_zone");
        result = xCH(result, getZoneId());
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
        sb.append(c).append(getZoneId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getZoneNm());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getFloorCd());
        sb.append(c).append(getStorageSpaceCd());
        sb.append(c).append(getReplenishTypeCd());
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
     * [get] ZONE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public Long getZoneId() {
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public void setZoneId(Long zoneId) {
        __modifiedProperties.add("zoneId");
        this._zoneId = zoneId;
    }

    /**
     * [get] WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] ZONE_NM: {VARCHAR(60)} <br>
     * ゾーン名称
     * @return The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public String getZoneNm() {
        return _zoneNm;
    }

    /**
     * [set] ZONE_NM: {VARCHAR(60)} <br>
     * ゾーン名称
     * @param zoneNm The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public void setZoneNm(String zoneNm) {
        __modifiedProperties.add("zoneNm");
        this._zoneNm = zoneNm;
    }

    /**
     * [get] PICKING_ORDER: {BIGINT(19)} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public Long getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {BIGINT(19)} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(Long pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] FLOOR_CD: {VARCHAR(30)} <br>
     * フロアCD
     * @return The value of the column 'FLOOR_CD'. (NullAllowed)
     */
    public String getFloorCd() {
        return _floorCd;
    }

    /**
     * [set] FLOOR_CD: {VARCHAR(30)} <br>
     * フロアCD
     * @param floorCd The value of the column 'FLOOR_CD'. (NullAllowed)
     */
    public void setFloorCd(String floorCd) {
        __modifiedProperties.add("floorCd");
        this._floorCd = floorCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStorageSpaceCd() {
        return _storageSpaceCd;
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        __modifiedProperties.add("storageSpaceCd");
        this._storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] REPLENISH_TYPE_CD: {VARCHAR(30)} <br>
     * 定期補充元区分
     * @return The value of the column 'REPLENISH_TYPE_CD'. (NullAllowed)
     */
    public String getReplenishTypeCd() {
        return _replenishTypeCd;
    }

    /**
     * [set] REPLENISH_TYPE_CD: {VARCHAR(30)} <br>
     * 定期補充元区分
     * @param replenishTypeCd The value of the column 'REPLENISH_TYPE_CD'. (NullAllowed)
     */
    public void setReplenishTypeCd(String replenishTypeCd) {
        __modifiedProperties.add("replenishTypeCd");
        this._replenishTypeCd = replenishTypeCd;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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