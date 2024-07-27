package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_inventory_r as TABLE. <br>
 * 棚卸帳票
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, INVENTORY_DIFF_OUT_FLG, INVENTORY_DIFF_OUT_USER_ID, INVENTORY_DIFF_OUT_DT, INVENTORY_RECORD_OUT_FLG, INVENTORY_RECORD_OUT_USER_ID, INVENTORY_RECORD_OUT_DT, INVENTORY_RECORD_LOC_OUT_FLG, INVENTORY_RECORD_LOC_OUT_USER_ID, INVENTORY_RECORD_LOC_OUT_DT, STOCK_DIFF_OUT_FLG, STOCK_DIFF_OUT_USER_ID, STOCK_DIFF_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_user, t_inventory_b, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     bUserByInventoryRecordLocOutUserId, bUserByStockDiffOutUserId, bUserByTwlOutUserId, bUserByInventoryRecordOutUserId, tInventoryB, bUserByInventoryDiffOutUserId, bClassDtlByTwlOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryRDto implements Serializable {

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
    /** INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} */
    @JsonKey
    protected Long _inventoryBId;

    /** TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _twlOutFlg;

    /** TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _twlOutUserId;

    /** TWL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _twlOutDt;

    /** INVENTORY_DIFF_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _inventoryDiffOutFlg;

    /** INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _inventoryDiffOutUserId;

    /** INVENTORY_DIFF_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _inventoryDiffOutDt;

    /** INVENTORY_RECORD_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _inventoryRecordOutFlg;

    /** INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _inventoryRecordOutUserId;

    /** INVENTORY_RECORD_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _inventoryRecordOutDt;

    /** INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _inventoryRecordLocOutFlg;

    /** INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _inventoryRecordLocOutUserId;

    /** INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _inventoryRecordLocOutDt;

    /** STOCK_DIFF_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _stockDiffOutFlg;

    /** STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _stockDiffOutUserId;

    /** STOCK_DIFF_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _stockDiffOutDt;

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
    public BsTInventoryRDto() {
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
    protected BUserDto _bUserByInventoryRecordLocOutUserId;

    public BUserDto getBUserByInventoryRecordLocOutUserId() {
        return _bUserByInventoryRecordLocOutUserId;
    }

    public void setBUserByInventoryRecordLocOutUserId(BUserDto bUserByInventoryRecordLocOutUserId) {
        this._bUserByInventoryRecordLocOutUserId = bUserByInventoryRecordLocOutUserId;
    }

    protected BUserDto _bUserByStockDiffOutUserId;

    public BUserDto getBUserByStockDiffOutUserId() {
        return _bUserByStockDiffOutUserId;
    }

    public void setBUserByStockDiffOutUserId(BUserDto bUserByStockDiffOutUserId) {
        this._bUserByStockDiffOutUserId = bUserByStockDiffOutUserId;
    }

    protected BUserDto _bUserByTwlOutUserId;

    public BUserDto getBUserByTwlOutUserId() {
        return _bUserByTwlOutUserId;
    }

    public void setBUserByTwlOutUserId(BUserDto bUserByTwlOutUserId) {
        this._bUserByTwlOutUserId = bUserByTwlOutUserId;
    }

    protected BUserDto _bUserByInventoryRecordOutUserId;

    public BUserDto getBUserByInventoryRecordOutUserId() {
        return _bUserByInventoryRecordOutUserId;
    }

    public void setBUserByInventoryRecordOutUserId(BUserDto bUserByInventoryRecordOutUserId) {
        this._bUserByInventoryRecordOutUserId = bUserByInventoryRecordOutUserId;
    }

    protected TInventoryBDto _tInventoryB;

    public TInventoryBDto getTInventoryB() {
        return _tInventoryB;
    }

    public void setTInventoryB(TInventoryBDto tInventoryB) {
        this._tInventoryB = tInventoryB;
    }

    protected BUserDto _bUserByInventoryDiffOutUserId;

    public BUserDto getBUserByInventoryDiffOutUserId() {
        return _bUserByInventoryDiffOutUserId;
    }

    public void setBUserByInventoryDiffOutUserId(BUserDto bUserByInventoryDiffOutUserId) {
        this._bUserByInventoryDiffOutUserId = bUserByInventoryDiffOutUserId;
    }

    protected BClassDtlDto _bClassDtlByTwlOutFlg;

    public BClassDtlDto getBClassDtlByTwlOutFlg() {
        return _bClassDtlByTwlOutFlg;
    }

    public void setBClassDtlByTwlOutFlg(BClassDtlDto bClassDtlByTwlOutFlg) {
        this._bClassDtlByTwlOutFlg = bClassDtlByTwlOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryRDto)) { return false; }
        final BsTInventoryRDto otherEntity = (BsTInventoryRDto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_inventory_r");
        result = xCH(result, getInventoryBId());
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
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getTwlOutFlg());
        sb.append(c).append(getTwlOutUserId());
        sb.append(c).append(getTwlOutDt());
        sb.append(c).append(getInventoryDiffOutFlg());
        sb.append(c).append(getInventoryDiffOutUserId());
        sb.append(c).append(getInventoryDiffOutDt());
        sb.append(c).append(getInventoryRecordOutFlg());
        sb.append(c).append(getInventoryRecordOutUserId());
        sb.append(c).append(getInventoryRecordOutDt());
        sb.append(c).append(getInventoryRecordLocOutFlg());
        sb.append(c).append(getInventoryRecordLocOutUserId());
        sb.append(c).append(getInventoryRecordLocOutDt());
        sb.append(c).append(getStockDiffOutFlg());
        sb.append(c).append(getStockDiffOutUserId());
        sb.append(c).append(getStockDiffOutDt());
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
     * [get] INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 棚卸作業リスト出力フラグ
     * @return The value of the column 'TWL_OUT_FLG'. (NullAllowed)
     */
    public String getTwlOutFlg() {
        return _twlOutFlg;
    }

    /**
     * [set] TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 棚卸作業リスト出力フラグ
     * @param twlOutFlg The value of the column 'TWL_OUT_FLG'. (NullAllowed)
     */
    public void setTwlOutFlg(String twlOutFlg) {
        __modifiedProperties.add("twlOutFlg");
        this._twlOutFlg = twlOutFlg;
    }

    /**
     * [get] TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸作業リスト出力者ID
     * @return The value of the column 'TWL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getTwlOutUserId() {
        return _twlOutUserId;
    }

    /**
     * [set] TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸作業リスト出力者ID
     * @param twlOutUserId The value of the column 'TWL_OUT_USER_ID'. (NullAllowed)
     */
    public void setTwlOutUserId(Long twlOutUserId) {
        __modifiedProperties.add("twlOutUserId");
        this._twlOutUserId = twlOutUserId;
    }

    /**
     * [get] TWL_OUT_DT: {DATETIME(19)} <br>
     * 棚卸作業リスト出力日時
     * @return The value of the column 'TWL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTwlOutDt() {
        return _twlOutDt;
    }

    /**
     * [set] TWL_OUT_DT: {DATETIME(19)} <br>
     * 棚卸作業リスト出力日時
     * @param twlOutDt The value of the column 'TWL_OUT_DT'. (NullAllowed)
     */
    public void setTwlOutDt(java.sql.Timestamp twlOutDt) {
        __modifiedProperties.add("twlOutDt");
        this._twlOutDt = twlOutDt;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 棚卸在庫差異表出力フラグ
     * @return The value of the column 'INVENTORY_DIFF_OUT_FLG'. (NullAllowed)
     */
    public String getInventoryDiffOutFlg() {
        return _inventoryDiffOutFlg;
    }

    /**
     * [set] INVENTORY_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 棚卸在庫差異表出力フラグ
     * @param inventoryDiffOutFlg The value of the column 'INVENTORY_DIFF_OUT_FLG'. (NullAllowed)
     */
    public void setInventoryDiffOutFlg(String inventoryDiffOutFlg) {
        __modifiedProperties.add("inventoryDiffOutFlg");
        this._inventoryDiffOutFlg = inventoryDiffOutFlg;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸在庫差異表出力者ID
     * @return The value of the column 'INVENTORY_DIFF_OUT_USER_ID'. (NullAllowed)
     */
    public Long getInventoryDiffOutUserId() {
        return _inventoryDiffOutUserId;
    }

    /**
     * [set] INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 棚卸在庫差異表出力者ID
     * @param inventoryDiffOutUserId The value of the column 'INVENTORY_DIFF_OUT_USER_ID'. (NullAllowed)
     */
    public void setInventoryDiffOutUserId(Long inventoryDiffOutUserId) {
        __modifiedProperties.add("inventoryDiffOutUserId");
        this._inventoryDiffOutUserId = inventoryDiffOutUserId;
    }

    /**
     * [get] INVENTORY_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 棚卸在庫差異表出力日時
     * @return The value of the column 'INVENTORY_DIFF_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInventoryDiffOutDt() {
        return _inventoryDiffOutDt;
    }

    /**
     * [set] INVENTORY_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 棚卸在庫差異表出力日時
     * @param inventoryDiffOutDt The value of the column 'INVENTORY_DIFF_OUT_DT'. (NullAllowed)
     */
    public void setInventoryDiffOutDt(java.sql.Timestamp inventoryDiffOutDt) {
        __modifiedProperties.add("inventoryDiffOutDt");
        this._inventoryDiffOutDt = inventoryDiffOutDt;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表兼差異表出力フラグ
     * @return The value of the column 'INVENTORY_RECORD_OUT_FLG'. (NullAllowed)
     */
    public String getInventoryRecordOutFlg() {
        return _inventoryRecordOutFlg;
    }

    /**
     * [set] INVENTORY_RECORD_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表兼差異表出力フラグ
     * @param inventoryRecordOutFlg The value of the column 'INVENTORY_RECORD_OUT_FLG'. (NullAllowed)
     */
    public void setInventoryRecordOutFlg(String inventoryRecordOutFlg) {
        __modifiedProperties.add("inventoryRecordOutFlg");
        this._inventoryRecordOutFlg = inventoryRecordOutFlg;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表兼差異表出力者ID
     * @return The value of the column 'INVENTORY_RECORD_OUT_USER_ID'. (NullAllowed)
     */
    public Long getInventoryRecordOutUserId() {
        return _inventoryRecordOutUserId;
    }

    /**
     * [set] INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表兼差異表出力者ID
     * @param inventoryRecordOutUserId The value of the column 'INVENTORY_RECORD_OUT_USER_ID'. (NullAllowed)
     */
    public void setInventoryRecordOutUserId(Long inventoryRecordOutUserId) {
        __modifiedProperties.add("inventoryRecordOutUserId");
        this._inventoryRecordOutUserId = inventoryRecordOutUserId;
    }

    /**
     * [get] INVENTORY_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表兼差異表出力日時
     * @return The value of the column 'INVENTORY_RECORD_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInventoryRecordOutDt() {
        return _inventoryRecordOutDt;
    }

    /**
     * [set] INVENTORY_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表兼差異表出力日時
     * @param inventoryRecordOutDt The value of the column 'INVENTORY_RECORD_OUT_DT'. (NullAllowed)
     */
    public void setInventoryRecordOutDt(java.sql.Timestamp inventoryRecordOutDt) {
        __modifiedProperties.add("inventoryRecordOutDt");
        this._inventoryRecordOutDt = inventoryRecordOutDt;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力フラグ
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_FLG'. (NullAllowed)
     */
    public String getInventoryRecordLocOutFlg() {
        return _inventoryRecordLocOutFlg;
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力フラグ
     * @param inventoryRecordLocOutFlg The value of the column 'INVENTORY_RECORD_LOC_OUT_FLG'. (NullAllowed)
     */
    public void setInventoryRecordLocOutFlg(String inventoryRecordLocOutFlg) {
        __modifiedProperties.add("inventoryRecordLocOutFlg");
        this._inventoryRecordLocOutFlg = inventoryRecordLocOutFlg;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表(LOC表示あり)出力者ID
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_USER_ID'. (NullAllowed)
     */
    public Long getInventoryRecordLocOutUserId() {
        return _inventoryRecordLocOutUserId;
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 商品別棚卸実績表(LOC表示あり)出力者ID
     * @param inventoryRecordLocOutUserId The value of the column 'INVENTORY_RECORD_LOC_OUT_USER_ID'. (NullAllowed)
     */
    public void setInventoryRecordLocOutUserId(Long inventoryRecordLocOutUserId) {
        __modifiedProperties.add("inventoryRecordLocOutUserId");
        this._inventoryRecordLocOutUserId = inventoryRecordLocOutUserId;
    }

    /**
     * [get] INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力日時
     * @return The value of the column 'INVENTORY_RECORD_LOC_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInventoryRecordLocOutDt() {
        return _inventoryRecordLocOutDt;
    }

    /**
     * [set] INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)} <br>
     * 商品別棚卸実績表(LOC表示あり)出力日時
     * @param inventoryRecordLocOutDt The value of the column 'INVENTORY_RECORD_LOC_OUT_DT'. (NullAllowed)
     */
    public void setInventoryRecordLocOutDt(java.sql.Timestamp inventoryRecordLocOutDt) {
        __modifiedProperties.add("inventoryRecordLocOutDt");
        this._inventoryRecordLocOutDt = inventoryRecordLocOutDt;
    }

    /**
     * [get] STOCK_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 在庫差異確認表出力フラグ
     * @return The value of the column 'STOCK_DIFF_OUT_FLG'. (NullAllowed)
     */
    public String getStockDiffOutFlg() {
        return _stockDiffOutFlg;
    }

    /**
     * [set] STOCK_DIFF_OUT_FLG: {CHAR(1)} <br>
     * 在庫差異確認表出力フラグ
     * @param stockDiffOutFlg The value of the column 'STOCK_DIFF_OUT_FLG'. (NullAllowed)
     */
    public void setStockDiffOutFlg(String stockDiffOutFlg) {
        __modifiedProperties.add("stockDiffOutFlg");
        this._stockDiffOutFlg = stockDiffOutFlg;
    }

    /**
     * [get] STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 在庫差異確認表出力者ID
     * @return The value of the column 'STOCK_DIFF_OUT_USER_ID'. (NullAllowed)
     */
    public Long getStockDiffOutUserId() {
        return _stockDiffOutUserId;
    }

    /**
     * [set] STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 在庫差異確認表出力者ID
     * @param stockDiffOutUserId The value of the column 'STOCK_DIFF_OUT_USER_ID'. (NullAllowed)
     */
    public void setStockDiffOutUserId(Long stockDiffOutUserId) {
        __modifiedProperties.add("stockDiffOutUserId");
        this._stockDiffOutUserId = stockDiffOutUserId;
    }

    /**
     * [get] STOCK_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 在庫差異確認表出力日時
     * @return The value of the column 'STOCK_DIFF_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getStockDiffOutDt() {
        return _stockDiffOutDt;
    }

    /**
     * [set] STOCK_DIFF_OUT_DT: {DATETIME(19)} <br>
     * 在庫差異確認表出力日時
     * @param stockDiffOutDt The value of the column 'STOCK_DIFF_OUT_DT'. (NullAllowed)
     */
    public void setStockDiffOutDt(java.sql.Timestamp stockDiffOutDt) {
        __modifiedProperties.add("stockDiffOutDt");
        this._stockDiffOutDt = stockDiffOutDt;
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
