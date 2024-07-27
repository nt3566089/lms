package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_inventory_inst as TABLE. <br>
 * 棚卸指示
 * <pre>
 * [primary-key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, INVENTORY_H_ID, DEPOSIT_ID, STOCK_TYPE_ID, FROM_LOCATION_CD, TO_LOCATION_CD, ZONE_ID, FROM_STOCK_INOUT_DT, TO_STOCK_INOUT_DT, STOCK_EXIST_ONLY_FLG, FISCAL_YEAR, LP_SEND_FLG, WM_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_stock_type, m_zone, m_customer, t_inventory_h, b_class_dtl(ByStockExistOnlyFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mStockType, mZone, mCustomer, tInventoryH, bClassDtlByStockExistOnlyFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryInstDto implements Serializable {

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
    /** INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryInstId;

    /** INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} */
    @JsonKey
    protected Long _inventoryHId;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _depositId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** FROM_LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _fromLocationCd;

    /** TO_LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _toLocationCd;

    /** ZONE_ID: {IX, BIGINT(19), FK to m_zone} */
    @JsonKey
    protected Long _zoneId;

    /** FROM_STOCK_INOUT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _fromStockInoutDt;

    /** TO_STOCK_INOUT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _toStockInoutDt;

    /** STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} */
    @JsonKey
    protected String _stockExistOnlyFlg;

    /** FISCAL_YEAR: {VARCHAR(30)} */
    @JsonKey
    protected String _fiscalYear;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _lpSendFlg;

    /** WM_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _wmSendFlg;

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
    public BsTInventoryInstDto() {
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
    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected MZoneDto _mZone;

    public MZoneDto getMZone() {
        return _mZone;
    }

    public void setMZone(MZoneDto mZone) {
        this._mZone = mZone;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected TInventoryHDto _tInventoryH;

    public TInventoryHDto getTInventoryH() {
        return _tInventoryH;
    }

    public void setTInventoryH(TInventoryHDto tInventoryH) {
        this._tInventoryH = tInventoryH;
    }

    protected BClassDtlDto _bClassDtlByStockExistOnlyFlg;

    public BClassDtlDto getBClassDtlByStockExistOnlyFlg() {
        return _bClassDtlByStockExistOnlyFlg;
    }

    public void setBClassDtlByStockExistOnlyFlg(BClassDtlDto bClassDtlByStockExistOnlyFlg) {
        this._bClassDtlByStockExistOnlyFlg = bClassDtlByStockExistOnlyFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryInstDto)) { return false; }
        final BsTInventoryInstDto otherEntity = (BsTInventoryInstDto)other;
        if (!helpComparingValue(getInventoryInstId(), otherEntity.getInventoryInstId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_inventory_inst");
        result = xCH(result, getInventoryInstId());
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
        sb.append(c).append(getInventoryInstId());
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getFromLocationCd());
        sb.append(c).append(getToLocationCd());
        sb.append(c).append(getZoneId());
        sb.append(c).append(getFromStockInoutDt());
        sb.append(c).append(getToStockInoutDt());
        sb.append(c).append(getStockExistOnlyFlg());
        sb.append(c).append(getFiscalYear());
        sb.append(c).append(getLpSendFlg());
        sb.append(c).append(getWmSendFlg());
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
     * [get] INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸指示ID
     * @return The value of the column 'INVENTORY_INST_ID'. (NullAllowed)
     */
    public Long getInventoryInstId() {
        return _inventoryInstId;
    }

    /**
     * [set] INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸指示ID
     * @param inventoryInstId The value of the column 'INVENTORY_INST_ID'. (NullAllowed)
     */
    public void setInventoryInstId(Long inventoryInstId) {
        __modifiedProperties.add("inventoryInstId");
        this._inventoryInstId = inventoryInstId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] FROM_LOCATION_CD: {VARCHAR(30)} <br>
     * FROMロケーションCD
     * @return The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public String getFromLocationCd() {
        return _fromLocationCd;
    }

    /**
     * [set] FROM_LOCATION_CD: {VARCHAR(30)} <br>
     * FROMロケーションCD
     * @param fromLocationCd The value of the column 'FROM_LOCATION_CD'. (NullAllowed)
     */
    public void setFromLocationCd(String fromLocationCd) {
        __modifiedProperties.add("fromLocationCd");
        this._fromLocationCd = fromLocationCd;
    }

    /**
     * [get] TO_LOCATION_CD: {VARCHAR(30)} <br>
     * TOロケーションCD
     * @return The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public String getToLocationCd() {
        return _toLocationCd;
    }

    /**
     * [set] TO_LOCATION_CD: {VARCHAR(30)} <br>
     * TOロケーションCD
     * @param toLocationCd The value of the column 'TO_LOCATION_CD'. (NullAllowed)
     */
    public void setToLocationCd(String toLocationCd) {
        __modifiedProperties.add("toLocationCd");
        this._toLocationCd = toLocationCd;
    }

    /**
     * [get] ZONE_ID: {IX, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @return The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public Long getZoneId() {
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {IX, BIGINT(19), FK to m_zone} <br>
     * ゾーンID
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public void setZoneId(Long zoneId) {
        __modifiedProperties.add("zoneId");
        this._zoneId = zoneId;
    }

    /**
     * [get] FROM_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * FROM受払日
     * @return The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed)
     */
    public String getFromStockInoutDt() {
        return _fromStockInoutDt;
    }

    /**
     * [set] FROM_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * FROM受払日
     * @param fromStockInoutDt The value of the column 'FROM_STOCK_INOUT_DT'. (NullAllowed)
     */
    public void setFromStockInoutDt(String fromStockInoutDt) {
        __modifiedProperties.add("fromStockInoutDt");
        this._fromStockInoutDt = fromStockInoutDt;
    }

    /**
     * [get] TO_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * TO受払日
     * @return The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed)
     */
    public String getToStockInoutDt() {
        return _toStockInoutDt;
    }

    /**
     * [set] TO_STOCK_INOUT_DT: {VARCHAR(8)} <br>
     * TO受払日
     * @param toStockInoutDt The value of the column 'TO_STOCK_INOUT_DT'. (NullAllowed)
     */
    public void setToStockInoutDt(String toStockInoutDt) {
        __modifiedProperties.add("toStockInoutDt");
        this._toStockInoutDt = toStockInoutDt;
    }

    /**
     * [get] STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @return The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed)
     */
    public String getStockExistOnlyFlg() {
        return _stockExistOnlyFlg;
    }

    /**
     * [set] STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg} <br>
     * 在庫有のみフラグ
     * @param stockExistOnlyFlg The value of the column 'STOCK_EXIST_ONLY_FLG'. (NullAllowed)
     */
    public void setStockExistOnlyFlg(String stockExistOnlyFlg) {
        __modifiedProperties.add("stockExistOnlyFlg");
        this._stockExistOnlyFlg = stockExistOnlyFlg;
    }

    /**
     * [get] FISCAL_YEAR: {VARCHAR(30)} <br>
     * 会計年度
     * @return The value of the column 'FISCAL_YEAR'. (NullAllowed)
     */
    public String getFiscalYear() {
        return _fiscalYear;
    }

    /**
     * [set] FISCAL_YEAR: {VARCHAR(30)} <br>
     * 会計年度
     * @param fiscalYear The value of the column 'FISCAL_YEAR'. (NullAllowed)
     */
    public void setFiscalYear(String fiscalYear) {
        __modifiedProperties.add("fiscalYear");
        this._fiscalYear = fiscalYear;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public String getLpSendFlg() {
        return _lpSendFlg;
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public void setLpSendFlg(String lpSendFlg) {
        __modifiedProperties.add("lpSendFlg");
        this._lpSendFlg = lpSendFlg;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public String getWmSendFlg() {
        return _wmSendFlg;
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public void setWmSendFlg(String wmSendFlg) {
        __modifiedProperties.add("wmSendFlg");
        this._wmSendFlg = wmSendFlg;
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
