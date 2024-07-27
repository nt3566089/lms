package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of h_inventory_b as TABLE. <br>
 * 棚卸ボディ履歴
 * <pre>
 * [primary-key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, LOT_ID, LOT, LIMIT_DT, SHAPE_ID, STORE_NO_ID, STORE_LABEL_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, STORE_DT, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, HT_INPUT_INVENTORY_NUM, WEB_INPUT_INVENTORY_NUM, AJIS_INPUT_INVENTORY_NUM, PROD_DT, AREA_CD, SALES_ORG_ID, ACCOUNT_ID, ALLOC_TYPE_CD, S4_SEND_FLG, CM_SEND_FLG, INVENTORY_USER_ID, INVENTORY_UPD_USER_ID, RECEIVE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_shape, m_stock_type, h_move_h, h_stock, h_inventory_h, b_class_dtl(ByInputType)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mShape, mStockType, hMoveH, hStock, hInventoryH, bClassDtlByInputType, bClassDtlByStockAdjustFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsHInventoryBDto implements Serializable {

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
    /** INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryBId;

    /** INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to h_inventory_h} */
    @JsonKey
    protected Long _inventoryHId;

    /** STOCK_ID: {IX, BIGINT(19), FK to h_stock} */
    @JsonKey
    protected Long _stockId;

    /** WAREHOUSE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** PRODUCT_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {IX, VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** LOCATION_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _locationNm;

    /** DEPOSIT_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _depositId;

    /** DEPOSIT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositCd;

    /** DEPOSIT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _depositNm;

    /** LOT_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    @JsonKey
    protected Long _shapeId;

    /** STORE_NO_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** SUPPLIER_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _supplierId;

    /** SUPPLIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _supplierCd;

    /** SUPPLIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _supplierNm;

    /** STORE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _storeDt;

    /** UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unitNum;

    /** CHARGE_NUM: {NotNull, DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** ALLOC_NUM: {NotNull, DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** MOVE_NUM: {NotNull, DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _moveNum;

    /** INVENTORY_NUM: {NotNull, DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} */
    @JsonKey
    protected String _inputType;

    /** STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} */
    @JsonKey
    protected String _stockAdjustFlg;

    /** MOVE_INST_H_ID: {IX, BIGINT(19), FK to h_move_h} */
    @JsonKey
    protected Long _moveInstHId;

    /** HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _htInputInventoryNum;

    /** WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _webInputInventoryNum;

    /** AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _ajisInputInventoryNum;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** AREA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _areaCd;

    /** SALES_ORG_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _salesOrgId;

    /** ACCOUNT_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _accountId;

    /** ALLOC_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _allocTypeCd;

    /** S4_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _s4SendFlg;

    /** CM_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _cmSendFlg;

    /** INVENTORY_USER_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _inventoryUserId;

    /** INVENTORY_UPD_USER_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _inventoryUpdUserId;

    /** RECEIVE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _receiveDt;

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
    public BsHInventoryBDto() {
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
    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected MStockTypeDto _mStockType;

    public MStockTypeDto getMStockType() {
        return _mStockType;
    }

    public void setMStockType(MStockTypeDto mStockType) {
        this._mStockType = mStockType;
    }

    protected HMoveHDto _hMoveH;

    public HMoveHDto getHMoveH() {
        return _hMoveH;
    }

    public void setHMoveH(HMoveHDto hMoveH) {
        this._hMoveH = hMoveH;
    }

    protected HStockDto _hStock;

    public HStockDto getHStock() {
        return _hStock;
    }

    public void setHStock(HStockDto hStock) {
        this._hStock = hStock;
    }

    protected HInventoryHDto _hInventoryH;

    public HInventoryHDto getHInventoryH() {
        return _hInventoryH;
    }

    public void setHInventoryH(HInventoryHDto hInventoryH) {
        this._hInventoryH = hInventoryH;
    }

    protected BClassDtlDto _bClassDtlByInputType;

    public BClassDtlDto getBClassDtlByInputType() {
        return _bClassDtlByInputType;
    }

    public void setBClassDtlByInputType(BClassDtlDto bClassDtlByInputType) {
        this._bClassDtlByInputType = bClassDtlByInputType;
    }

    protected BClassDtlDto _bClassDtlByStockAdjustFlg;

    public BClassDtlDto getBClassDtlByStockAdjustFlg() {
        return _bClassDtlByStockAdjustFlg;
    }

    public void setBClassDtlByStockAdjustFlg(BClassDtlDto bClassDtlByStockAdjustFlg) {
        this._bClassDtlByStockAdjustFlg = bClassDtlByStockAdjustFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHInventoryBDto)) { return false; }
        final BsHInventoryBDto otherEntity = (BsHInventoryBDto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "h_inventory_b");
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
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getDepositCd());
        sb.append(c).append(getDepositNm());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getStoreNoId());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getSupplierId());
        sb.append(c).append(getSupplierCd());
        sb.append(c).append(getSupplierNm());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getMoveNum());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getInputType());
        sb.append(c).append(getStockAdjustFlg());
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getHtInputInventoryNum());
        sb.append(c).append(getWebInputInventoryNum());
        sb.append(c).append(getAjisInputInventoryNum());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getAreaCd());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getAccountId());
        sb.append(c).append(getAllocTypeCd());
        sb.append(c).append(getS4SendFlg());
        sb.append(c).append(getCmSendFlg());
        sb.append(c).append(getInventoryUserId());
        sb.append(c).append(getInventoryUpdUserId());
        sb.append(c).append(getReceiveDt());
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
     * [get] INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to h_inventory_h} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to h_inventory_h} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] STOCK_ID: {IX, BIGINT(19), FK to h_stock} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, BIGINT(19), FK to h_stock} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] WAREHOUSE_ID: {BIGINT(19)} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {BIGINT(19)} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * 倉庫名称
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * 倉庫名称
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] PRODUCT_ID: {BIGINT(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {BIGINT(19)} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {IX, VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX, VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
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
     * [get] LOCATION_ID: {BIGINT(19)} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {BIGINT(19)} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] DEPOSIT_ID: {BIGINT(19)} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {BIGINT(19)} <br>
     * 預託ID
     * @param depositId The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public void setDepositId(Long depositId) {
        __modifiedProperties.add("depositId");
        this._depositId = depositId;
    }

    /**
     * [get] DEPOSIT_CD: {VARCHAR(30)} <br>
     * 預託CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public String getDepositCd() {
        return _depositCd;
    }

    /**
     * [set] DEPOSIT_CD: {VARCHAR(30)} <br>
     * 預託CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public void setDepositCd(String depositCd) {
        __modifiedProperties.add("depositCd");
        this._depositCd = depositCd;
    }

    /**
     * [get] DEPOSIT_NM: {VARCHAR(60)} <br>
     * 預託名称
     * @return The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public String getDepositNm() {
        return _depositNm;
    }

    /**
     * [set] DEPOSIT_NM: {VARCHAR(60)} <br>
     * 預託名称
     * @param depositNm The value of the column 'DEPOSIT_NM'. (NullAllowed)
     */
    public void setDepositNm(String depositNm) {
        __modifiedProperties.add("depositNm");
        this._depositNm = depositNm;
    }

    /**
     * [get] LOT_ID: {BIGINT(19)} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {BIGINT(19)} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] STORE_NO_ID: {BIGINT(19)} <br>
     * 入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public Long getStoreNoId() {
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {BIGINT(19)} <br>
     * 入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public void setStoreNoId(Long storeNoId) {
        __modifiedProperties.add("storeNoId");
        this._storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] SUPPLIER_ID: {BIGINT(19)} <br>
     * 仕入先ID
     * @return The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public Long getSupplierId() {
        return _supplierId;
    }

    /**
     * [set] SUPPLIER_ID: {BIGINT(19)} <br>
     * 仕入先ID
     * @param supplierId The value of the column 'SUPPLIER_ID'. (NullAllowed)
     */
    public void setSupplierId(Long supplierId) {
        __modifiedProperties.add("supplierId");
        this._supplierId = supplierId;
    }

    /**
     * [get] SUPPLIER_CD: {VARCHAR(30)} <br>
     * 仕入先CD
     * @return The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public String getSupplierCd() {
        return _supplierCd;
    }

    /**
     * [set] SUPPLIER_CD: {VARCHAR(30)} <br>
     * 仕入先CD
     * @param supplierCd The value of the column 'SUPPLIER_CD'. (NullAllowed)
     */
    public void setSupplierCd(String supplierCd) {
        __modifiedProperties.add("supplierCd");
        this._supplierCd = supplierCd;
    }

    /**
     * [get] SUPPLIER_NM: {VARCHAR(60)} <br>
     * 仕入先名称
     * @return The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public String getSupplierNm() {
        return _supplierNm;
    }

    /**
     * [set] SUPPLIER_NM: {VARCHAR(60)} <br>
     * 仕入先名称
     * @param supplierNm The value of the column 'SUPPLIER_NM'. (NullAllowed)
     */
    public void setSupplierNm(String supplierNm) {
        __modifiedProperties.add("supplierNm");
        this._supplierNm = supplierNm;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * 入庫日
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] CHARGE_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] MOVE_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 移動中数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum() {
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 移動中数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        __modifiedProperties.add("moveNum");
        this._moveNum = moveNum;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @return The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public String getInputType() {
        return _inputType;
    }

    /**
     * [set] INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param inputType The value of the column 'INPUT_TYPE'. (NullAllowed)
     */
    public void setInputType(String inputType) {
        __modifiedProperties.add("inputType");
        this._inputType = inputType;
    }

    /**
     * [get] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @return The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public String getStockAdjustFlg() {
        return _stockAdjustFlg;
    }

    /**
     * [set] STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg} <br>
     * 在庫調整フラグ
     * @param stockAdjustFlg The value of the column 'STOCK_ADJUST_FLG'. (NullAllowed)
     */
    public void setStockAdjustFlg(String stockAdjustFlg) {
        __modifiedProperties.add("stockAdjustFlg");
        this._stockAdjustFlg = stockAdjustFlg;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, BIGINT(19), FK to h_move_h} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, BIGINT(19), FK to h_move_h} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * HT入力棚卸数量
     * @return The value of the column 'HT_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getHtInputInventoryNum() {
        return _htInputInventoryNum;
    }

    /**
     * [set] HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * HT入力棚卸数量
     * @param htInputInventoryNum The value of the column 'HT_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public void setHtInputInventoryNum(java.math.BigDecimal htInputInventoryNum) {
        __modifiedProperties.add("htInputInventoryNum");
        this._htInputInventoryNum = htInputInventoryNum;
    }

    /**
     * [get] WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 画面入力棚卸数量
     * @return The value of the column 'WEB_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getWebInputInventoryNum() {
        return _webInputInventoryNum;
    }

    /**
     * [set] WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 画面入力棚卸数量
     * @param webInputInventoryNum The value of the column 'WEB_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public void setWebInputInventoryNum(java.math.BigDecimal webInputInventoryNum) {
        __modifiedProperties.add("webInputInventoryNum");
        this._webInputInventoryNum = webInputInventoryNum;
    }

    /**
     * [get] AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * エイジス取込棚卸数量
     * @return The value of the column 'AJIS_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAjisInputInventoryNum() {
        return _ajisInputInventoryNum;
    }

    /**
     * [set] AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * エイジス取込棚卸数量
     * @param ajisInputInventoryNum The value of the column 'AJIS_INPUT_INVENTORY_NUM'. (NullAllowed)
     */
    public void setAjisInputInventoryNum(java.math.BigDecimal ajisInputInventoryNum) {
        __modifiedProperties.add("ajisInputInventoryNum");
        this._ajisInputInventoryNum = ajisInputInventoryNum;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] AREA_CD: {VARCHAR(30)} <br>
     * エリア
     * @return The value of the column 'AREA_CD'. (NullAllowed)
     */
    public String getAreaCd() {
        return _areaCd;
    }

    /**
     * [set] AREA_CD: {VARCHAR(30)} <br>
     * エリア
     * @param areaCd The value of the column 'AREA_CD'. (NullAllowed)
     */
    public void setAreaCd(String areaCd) {
        __modifiedProperties.add("areaCd");
        this._areaCd = areaCd;
    }

    /**
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] ACCOUNT_ID: {BIGINT(19)} <br>
     * 得意先ID
     * @return The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public Long getAccountId() {
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {BIGINT(19)} <br>
     * 得意先ID
     * @param accountId The value of the column 'ACCOUNT_ID'. (NullAllowed)
     */
    public void setAccountId(Long accountId) {
        __modifiedProperties.add("accountId");
        this._accountId = accountId;
    }

    /**
     * [get] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @return The value of the column 'ALLOC_TYPE_CD'. (NullAllowed)
     */
    public String getAllocTypeCd() {
        return _allocTypeCd;
    }

    /**
     * [set] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @param allocTypeCd The value of the column 'ALLOC_TYPE_CD'. (NullAllowed)
     */
    public void setAllocTypeCd(String allocTypeCd) {
        __modifiedProperties.add("allocTypeCd");
        this._allocTypeCd = allocTypeCd;
    }

    /**
     * [get] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public String getS4SendFlg() {
        return _s4SendFlg;
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public void setS4SendFlg(String s4SendFlg) {
        __modifiedProperties.add("s4SendFlg");
        this._s4SendFlg = s4SendFlg;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public String getCmSendFlg() {
        return _cmSendFlg;
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public void setCmSendFlg(String cmSendFlg) {
        __modifiedProperties.add("cmSendFlg");
        this._cmSendFlg = cmSendFlg;
    }

    /**
     * [get] INVENTORY_USER_ID: {BIGINT(19)} <br>
     * 棚卸担当者ID
     * @return The value of the column 'INVENTORY_USER_ID'. (NullAllowed)
     */
    public Long getInventoryUserId() {
        return _inventoryUserId;
    }

    /**
     * [set] INVENTORY_USER_ID: {BIGINT(19)} <br>
     * 棚卸担当者ID
     * @param inventoryUserId The value of the column 'INVENTORY_USER_ID'. (NullAllowed)
     */
    public void setInventoryUserId(Long inventoryUserId) {
        __modifiedProperties.add("inventoryUserId");
        this._inventoryUserId = inventoryUserId;
    }

    /**
     * [get] INVENTORY_UPD_USER_ID: {BIGINT(19)} <br>
     * 棚卸変更担当者ID
     * @return The value of the column 'INVENTORY_UPD_USER_ID'. (NullAllowed)
     */
    public Long getInventoryUpdUserId() {
        return _inventoryUpdUserId;
    }

    /**
     * [set] INVENTORY_UPD_USER_ID: {BIGINT(19)} <br>
     * 棚卸変更担当者ID
     * @param inventoryUpdUserId The value of the column 'INVENTORY_UPD_USER_ID'. (NullAllowed)
     */
    public void setInventoryUpdUserId(Long inventoryUpdUserId) {
        __modifiedProperties.add("inventoryUpdUserId");
        this._inventoryUpdUserId = inventoryUpdUserId;
    }

    /**
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public String getReceiveDt() {
        return _receiveDt;
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public void setReceiveDt(String receiveDt) {
        __modifiedProperties.add("receiveDt");
        this._receiveDt = receiveDt;
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
