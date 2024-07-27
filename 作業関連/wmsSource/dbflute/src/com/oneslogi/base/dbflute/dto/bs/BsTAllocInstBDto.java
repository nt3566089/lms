package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_alloc_inst_b as TABLE. <br>
 * 引当指示ボディ
 * <pre>
 * [primary-key]
 *     ALLOC_INST_B_ID
 *
 * [column]
 *     ALLOC_INST_B_ID, ALLOC_INST_H_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, LIMIT_DT_REVERSE_FLG, SHIPPING_LIMIT_DT, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, UNIT_NUM, INST_NUM, PROCESS_NO, ALLOC_NUM, PROD_DT, PROD_DT_MANAG_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ALLOC_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_location, m_stock_type, t_lot, m_warehouse, m_customer, t_alloc_inst_h, m_product, t_store_no, m_shape, b_class_dtl(ByLimitDtManagFlg), t_alloc_lot(AsOne)
 *
 * [referrer-table]
 *     t_packing_b, t_picking_b, t_shipping_inst_b, t_stock_inout, t_alloc_lot
 *
 * [foreign-property]
 *     mLocation, mStockType, tLot, mWarehouse, mCustomer, tAllocInstH, mProduct, tStoreNo, mShape, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, tAllocLotAsOne
 *
 * [referrer-property]
 *     tPackingBList, tPickingBList, tShippingInstBList, tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTAllocInstBDto implements Serializable {

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
    /** ALLOC_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _allocInstBId;

    /** ALLOC_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_alloc_inst_h} */
    @JsonKey
    protected Long _allocInstHId;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    @JsonKey
    protected Long _warehouseId;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _depositId;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} */
    @JsonKey
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** SHAPE_ID: {IX, BIGINT(19), FK to m_shape} */
    @JsonKey
    protected Long _shapeId;

    /** SHAPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shapeCd;

    /** LIMIT_DT_REVERSE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} */
    @JsonKey
    protected String _limitDtReverseFlg;

    /** SHIPPING_LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingLimitDt;

    /** LOT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LotManagFlg} */
    @JsonKey
    protected String _lotManagFlg;

    /** LIMIT_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} */
    @JsonKey
    protected String _limitDtManagFlg;

    /** UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unitNum;

    /** INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** PROCESS_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _processNo;

    /** ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** PROD_DT_MANAG_FLG: {CHAR(1)} */
    @JsonKey
    protected String _prodDtManagFlg;

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
    public BsTAllocInstBDto() {
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

    protected TLotDto _tLot;

    public TLotDto getTLot() {
        return _tLot;
    }

    public void setTLot(TLotDto tLot) {
        this._tLot = tLot;
    }

    protected MWarehouseDto _mWarehouse;

    public MWarehouseDto getMWarehouse() {
        return _mWarehouse;
    }

    public void setMWarehouse(MWarehouseDto mWarehouse) {
        this._mWarehouse = mWarehouse;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected TAllocInstHDto _tAllocInstH;

    public TAllocInstHDto getTAllocInstH() {
        return _tAllocInstH;
    }

    public void setTAllocInstH(TAllocInstHDto tAllocInstH) {
        this._tAllocInstH = tAllocInstH;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected TStoreNoDto _tStoreNo;

    public TStoreNoDto getTStoreNo() {
        return _tStoreNo;
    }

    public void setTStoreNo(TStoreNoDto tStoreNo) {
        this._tStoreNo = tStoreNo;
    }

    protected MShapeDto _mShape;

    public MShapeDto getMShape() {
        return _mShape;
    }

    public void setMShape(MShapeDto mShape) {
        this._mShape = mShape;
    }

    protected BClassDtlDto _bClassDtlByLimitDtManagFlg;

    public BClassDtlDto getBClassDtlByLimitDtManagFlg() {
        return _bClassDtlByLimitDtManagFlg;
    }

    public void setBClassDtlByLimitDtManagFlg(BClassDtlDto bClassDtlByLimitDtManagFlg) {
        this._bClassDtlByLimitDtManagFlg = bClassDtlByLimitDtManagFlg;
    }

    protected BClassDtlDto _bClassDtlByLimitDtReverseFlg;

    public BClassDtlDto getBClassDtlByLimitDtReverseFlg() {
        return _bClassDtlByLimitDtReverseFlg;
    }

    public void setBClassDtlByLimitDtReverseFlg(BClassDtlDto bClassDtlByLimitDtReverseFlg) {
        this._bClassDtlByLimitDtReverseFlg = bClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlDto _bClassDtlByLotManagFlg;

    public BClassDtlDto getBClassDtlByLotManagFlg() {
        return _bClassDtlByLotManagFlg;
    }

    public void setBClassDtlByLotManagFlg(BClassDtlDto bClassDtlByLotManagFlg) {
        this._bClassDtlByLotManagFlg = bClassDtlByLotManagFlg;
    }

    protected TAllocLotDto _tAllocLotAsOne;

    public TAllocLotDto getTAllocLotAsOne() {
        return _tAllocLotAsOne;
    }

    public void setTAllocLotAsOne(TAllocLotDto TAllocLotAsOne) {
        this._tAllocLotAsOne = TAllocLotAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPackingBDto> _tPackingBList;

    public List<TPackingBDto> getTPackingBList() {
        if (_tPackingBList == null) { _tPackingBList = new ArrayList<TPackingBDto>(); }
        return _tPackingBList;
    }

    public void setTPackingBList(List<TPackingBDto> tPackingBList) {
        this._tPackingBList = tPackingBList;
    }

    protected List<TPickingBDto> _tPickingBList;

    public List<TPickingBDto> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = new ArrayList<TPickingBDto>(); }
        return _tPickingBList;
    }

    public void setTPickingBList(List<TPickingBDto> tPickingBList) {
        this._tPickingBList = tPickingBList;
    }

    protected List<TShippingInstBDto> _tShippingInstBList;

    public List<TShippingInstBDto> getTShippingInstBList() {
        if (_tShippingInstBList == null) { _tShippingInstBList = new ArrayList<TShippingInstBDto>(); }
        return _tShippingInstBList;
    }

    public void setTShippingInstBList(List<TShippingInstBDto> tShippingInstBList) {
        this._tShippingInstBList = tShippingInstBList;
    }

    protected List<TStockInoutDto> _tStockInoutList;

    public List<TStockInoutDto> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutList;
    }

    public void setTStockInoutList(List<TStockInoutDto> tStockInoutList) {
        this._tStockInoutList = tStockInoutList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTAllocInstBDto)) { return false; }
        final BsTAllocInstBDto otherEntity = (BsTAllocInstBDto)other;
        if (!helpComparingValue(getAllocInstBId(), otherEntity.getAllocInstBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_alloc_inst_b");
        result = xCH(result, getAllocInstBId());
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
        sb.append(c).append(getAllocInstBId());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getStoreNoId());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getShapeCd());
        sb.append(c).append(getLimitDtReverseFlg());
        sb.append(c).append(getShippingLimitDt());
        sb.append(c).append(getLotManagFlg());
        sb.append(c).append(getLimitDtManagFlg());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getProdDtManagFlg());
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
     * [get] ALLOC_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public Long getAllocInstBId() {
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public void setAllocInstBId(Long allocInstBId) {
        __modifiedProperties.add("allocInstBId");
        this._allocInstBId = allocInstBId;
    }

    /**
     * [get] ALLOC_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_alloc_inst_h} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 指定倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 指定倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
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
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 指定ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * 指定ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * 指定ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * 指定ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
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
     * [get] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * 指定ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * 指定ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * 指定ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * 指定ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 指定期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 指定期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 指定入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public Long getStoreNoId() {
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no} <br>
     * 指定入庫No.ID
     * @param storeNoId The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public void setStoreNoId(Long storeNoId) {
        __modifiedProperties.add("storeNoId");
        this._storeNoId = storeNoId;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 指定入庫ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 指定入庫ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 指定荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19), FK to m_shape} <br>
     * 指定荷姿ID
     * @param shapeId The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public void setShapeId(Long shapeId) {
        __modifiedProperties.add("shapeId");
        this._shapeId = shapeId;
    }

    /**
     * [get] SHAPE_CD: {VARCHAR(30)} <br>
     * 指定荷姿CD
     * @return The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public String getShapeCd() {
        return _shapeCd;
    }

    /**
     * [set] SHAPE_CD: {VARCHAR(30)} <br>
     * 指定荷姿CD
     * @param shapeCd The value of the column 'SHAPE_CD'. (NullAllowed)
     */
    public void setShapeCd(String shapeCd) {
        __modifiedProperties.add("shapeCd");
        this._shapeCd = shapeCd;
    }

    /**
     * [get] LIMIT_DT_REVERSE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @return The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public String getLimitDtReverseFlg() {
        return _limitDtReverseFlg;
    }

    /**
     * [set] LIMIT_DT_REVERSE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param limitDtReverseFlg The value of the column 'LIMIT_DT_REVERSE_FLG'. (NullAllowed)
     */
    public void setLimitDtReverseFlg(String limitDtReverseFlg) {
        __modifiedProperties.add("limitDtReverseFlg");
        this._limitDtReverseFlg = limitDtReverseFlg;
    }

    /**
     * [get] SHIPPING_LIMIT_DT: {VARCHAR(8)} <br>
     * 出荷限界期限日
     * @return The value of the column 'SHIPPING_LIMIT_DT'. (NullAllowed)
     */
    public String getShippingLimitDt() {
        return _shippingLimitDt;
    }

    /**
     * [set] SHIPPING_LIMIT_DT: {VARCHAR(8)} <br>
     * 出荷限界期限日
     * @param shippingLimitDt The value of the column 'SHIPPING_LIMIT_DT'. (NullAllowed)
     */
    public void setShippingLimitDt(String shippingLimitDt) {
        __modifiedProperties.add("shippingLimitDt");
        this._shippingLimitDt = shippingLimitDt;
    }

    /**
     * [get] LOT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @return The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public String getLotManagFlg() {
        return _lotManagFlg;
    }

    /**
     * [set] LOT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LotManagFlg} <br>
     * ロット管理フラグ
     * @param lotManagFlg The value of the column 'LOT_MANAG_FLG'. (NullAllowed)
     */
    public void setLotManagFlg(String lotManagFlg) {
        __modifiedProperties.add("lotManagFlg");
        this._lotManagFlg = lotManagFlg;
    }

    /**
     * [get] LIMIT_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @return The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getLimitDtManagFlg() {
        return _limitDtManagFlg;
    }

    /**
     * [set] LIMIT_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LimitDtManagFlg} <br>
     * 期限日管理フラグ
     * @param limitDtManagFlg The value of the column 'LIMIT_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setLimitDtManagFlg(String limitDtManagFlg) {
        __modifiedProperties.add("limitDtManagFlg");
        this._limitDtManagFlg = limitDtManagFlg;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(19)} <br>
     * 指定入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(19)} <br>
     * 指定入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] PROCESS_NO: {VARCHAR(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public String getProcessNo() {
        return _processNo;
    }

    /**
     * [set] PROCESS_NO: {VARCHAR(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public void setProcessNo(String processNo) {
        __modifiedProperties.add("processNo");
        this._processNo = processNo;
    }

    /**
     * [get] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @return The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getAllocNum() {
        return _allocNum;
    }

    /**
     * [set] ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 引当済数
     * @param allocNum The value of the column 'ALLOC_NUM'. (NullAllowed)
     */
    public void setAllocNum(java.math.BigDecimal allocNum) {
        __modifiedProperties.add("allocNum");
        this._allocNum = allocNum;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 指定製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 指定製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] PROD_DT_MANAG_FLG: {CHAR(1)} <br>
     * 製造日管理フラグ
     * @return The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed)
     */
    public String getProdDtManagFlg() {
        return _prodDtManagFlg;
    }

    /**
     * [set] PROD_DT_MANAG_FLG: {CHAR(1)} <br>
     * 製造日管理フラグ
     * @param prodDtManagFlg The value of the column 'PROD_DT_MANAG_FLG'. (NullAllowed)
     */
    public void setProdDtManagFlg(String prodDtManagFlg) {
        __modifiedProperties.add("prodDtManagFlg");
        this._prodDtManagFlg = prodDtManagFlg;
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
