package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_location_replenish_product as TABLE. <br>
 * ロケーション補充商品マスタ
 * <pre>
 * [primary-key]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [column]
 *     LOCATION_REPLENISH_PRODUCT_ID, LOCATION_ID, REPLENISH_PRODUCT_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, MAX_STORE_PRODUCT_SHAPE_ID, MAX_STORE_NUM, REPLENISH_STOCK_TYPE_ID, REPLENISH_P_PRODUCT_SHAPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_customer, m_product_shape, m_shape, m_product, m_location, m_stock_type
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCustomer, mProductShape, mShape, mProduct, mLocation, mStockType
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMLocationReplenishProductDto implements Serializable {

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
    /** LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _locationReplenishProductId;

    /** LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _replenishProductId;

    /** REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _replenishDepositId;

    /** REPLENISH_P_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _replenishPNum;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} */
    @JsonKey
    protected Long _maxStoreProductShapeId;

    /** MAX_STORE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _maxStoreNum;

    /** REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _replenishStockTypeId;

    /** REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    @JsonKey
    protected Long _replenishPProductShapeId;

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
    public BsMLocationReplenishProductDto() {
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
    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MProductShapeDto _mProductShape;

    public MProductShapeDto getMProductShape() {
        return _mProductShape;
    }

    public void setMProductShape(MProductShapeDto mProductShape) {
        this._mProductShape = mProductShape;
    }

    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMLocationReplenishProductDto)) { return false; }
        final BsMLocationReplenishProductDto otherEntity = (BsMLocationReplenishProductDto)other;
        if (!helpComparingValue(getLocationReplenishProductId(), otherEntity.getLocationReplenishProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_location_replenish_product");
        result = xCH(result, getLocationReplenishProductId());
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
        sb.append(c).append(getLocationReplenishProductId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getReplenishProductId());
        sb.append(c).append(getReplenishDepositId());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getMaxStoreProductShapeId());
        sb.append(c).append(getMaxStoreNum());
        sb.append(c).append(getReplenishStockTypeId());
        sb.append(c).append(getReplenishPProductShapeId());
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
     * [get] LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション補充商品ID
     * @return The value of the column 'LOCATION_REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public Long getLocationReplenishProductId() {
        return _locationReplenishProductId;
    }

    /**
     * [set] LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ロケーション補充商品ID
     * @param locationReplenishProductId The value of the column 'LOCATION_REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public void setLocationReplenishProductId(Long locationReplenishProductId) {
        __modifiedProperties.add("locationReplenishProductId");
        this._locationReplenishProductId = locationReplenishProductId;
    }

    /**
     * [get] LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 補充商品ID
     * @return The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public Long getReplenishProductId() {
        return _replenishProductId;
    }

    /**
     * [set] REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 補充商品ID
     * @param replenishProductId The value of the column 'REPLENISH_PRODUCT_ID'. (NullAllowed)
     */
    public void setReplenishProductId(Long replenishProductId) {
        __modifiedProperties.add("replenishProductId");
        this._replenishProductId = replenishProductId;
    }

    /**
     * [get] REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 補充預託ID
     * @return The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public Long getReplenishDepositId() {
        return _replenishDepositId;
    }

    /**
     * [set] REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 補充預託ID
     * @param replenishDepositId The value of the column 'REPLENISH_DEPOSIT_ID'. (NullAllowed)
     */
    public void setReplenishDepositId(Long replenishDepositId) {
        __modifiedProperties.add("replenishDepositId");
        this._replenishDepositId = replenishDepositId;
    }

    /**
     * [get] REPLENISH_P_NUM: {BIGINT(19)} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public Long getReplenishPNum() {
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {BIGINT(19)} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setReplenishPNum(Long replenishPNum) {
        __modifiedProperties.add("replenishPNum");
        this._replenishPNum = replenishPNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getMaxStoreProductShapeId() {
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape} <br>
     * 最大格納数商品荷姿ID
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        __modifiedProperties.add("maxStoreProductShapeId");
        this._maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] MAX_STORE_NUM: {BIGINT(19)} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public Long getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {BIGINT(19)} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(Long maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 補充在庫区分ID
     * @return The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getReplenishStockTypeId() {
        return _replenishStockTypeId;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} <br>
     * 補充在庫区分ID
     * @param replenishStockTypeId The value of the column 'REPLENISH_STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setReplenishStockTypeId(Long replenishStockTypeId) {
        __modifiedProperties.add("replenishStockTypeId");
        this._replenishStockTypeId = replenishStockTypeId;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 補充点商品荷姿ID
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getReplenishPProductShapeId() {
        return _replenishPProductShapeId;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 補充点商品荷姿ID
     * @param replenishPProductShapeId The value of the column 'REPLENISH_P_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setReplenishPProductShapeId(Long replenishPProductShapeId) {
        __modifiedProperties.add("replenishPProductShapeId");
        this._replenishPProductShapeId = replenishPProductShapeId;
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
