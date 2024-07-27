package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_inst_b as TABLE. <br>
 * 出荷指示ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, TAX_RATE, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, HINMOKU_TEXT, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DELIV_CD, TRANSACTION_TYPE_CD, WM_SEND_FLG, LP_SEND_FLG, CM_SEND_FLG, EMP_ID_CD, EMP_NM, US3F_TYPE_CD, HINMOKU_GROUP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_stock_type, t_store_no, m_location, t_alloc_inst_b, m_shape, m_product, t_lot, m_customer, m_warehouse, t_shipping_inst_h, b_class_dtl(ByErrorFlg), t_shipping_inst_spare(AsOne)
 *
 * [referrer-table]
 *     t_picking_b, t_shipping_inst_b_print, t_shipping_inst_data_transfer, t_shipping_inst_spare
 *
 * [foreign-property]
 *     mStockType, tStoreNo, mLocation, tAllocInstB, mShape, mProduct, tLot, mCustomer, mWarehouse, tShippingInstH, bClassDtlByErrorFlg, tShippingInstSpareAsOne
 *
 * [referrer-property]
 *     tPickingBList, tShippingInstBPrintList, tShippingInstDataTransferList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingInstBDto implements Serializable {

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
    /** SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingInstBId;

    /** SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} */
    @JsonKey
    protected Long _shippingInstHId;

    /** LINE_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    @JsonKey
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {IX, NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** STOCK_TYPE_CD: {NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _stockTypeCd;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _depositId;

    /** DEPOSIT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositCd;

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

    /** UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unitNum;

    /** INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} */
    @JsonKey
    protected Long _allocInstBId;

    /** ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _allocNum;

    /** STOCK_OUT_NUM: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _stockOutNum;

    /** UNIT_PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _unitPrice;

    /** PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _price;

    /** TAX: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _tax;

    /** CASE_PIECE_TYPE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _casePieceTypeId;

    /** CASE_PIECE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _casePieceTypeCd;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** TAX_RATE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _taxRate;

    /** LOGI_WEIGHT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _logiWeightFlg;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiSpecialTypeCd;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    @JsonKey
    protected String _hinmokuText;

    /** UNIT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _unitNm;

    /** EC_UNIT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _ecUnitNm;

    /** SAMPLE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sampleTypeCd;

    /** EC_ORDER_BRANCH_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _ecOrderBranchNo;

    /** EC_PRODUCT_NM_KANJI: {VARCHAR(60)} */
    @JsonKey
    protected String _ecProductNmKanji;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storeStorageSpaceCd;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _lotManagTypeCd;

    /** DELIV_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _delivCd;

    /** TRANSACTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transactionTypeCd;

    /** WM_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _wmSendFlg;

    /** LP_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _lpSendFlg;

    /** CM_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _cmSendFlg;

    /** EMP_ID_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _empIdCd;

    /** EMP_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _empNm;

    /** US3F_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _us3fTypeCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

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
    public BsTShippingInstBDto() {
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

    protected TStoreNoDto _tStoreNo;

    public TStoreNoDto getTStoreNo() {
        return _tStoreNo;
    }

    public void setTStoreNo(TStoreNoDto tStoreNo) {
        this._tStoreNo = tStoreNo;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected TAllocInstBDto _tAllocInstB;

    public TAllocInstBDto getTAllocInstB() {
        return _tAllocInstB;
    }

    public void setTAllocInstB(TAllocInstBDto tAllocInstB) {
        this._tAllocInstB = tAllocInstB;
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

    protected TLotDto _tLot;

    public TLotDto getTLot() {
        return _tLot;
    }

    public void setTLot(TLotDto tLot) {
        this._tLot = tLot;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MWarehouseDto _mWarehouse;

    public MWarehouseDto getMWarehouse() {
        return _mWarehouse;
    }

    public void setMWarehouse(MWarehouseDto mWarehouse) {
        this._mWarehouse = mWarehouse;
    }

    protected TShippingInstHDto _tShippingInstH;

    public TShippingInstHDto getTShippingInstH() {
        return _tShippingInstH;
    }

    public void setTShippingInstH(TShippingInstHDto tShippingInstH) {
        this._tShippingInstH = tShippingInstH;
    }

    protected BClassDtlDto _bClassDtlByErrorFlg;

    public BClassDtlDto getBClassDtlByErrorFlg() {
        return _bClassDtlByErrorFlg;
    }

    public void setBClassDtlByErrorFlg(BClassDtlDto bClassDtlByErrorFlg) {
        this._bClassDtlByErrorFlg = bClassDtlByErrorFlg;
    }

    protected TShippingInstSpareDto _tShippingInstSpareAsOne;

    public TShippingInstSpareDto getTShippingInstSpareAsOne() {
        return _tShippingInstSpareAsOne;
    }

    public void setTShippingInstSpareAsOne(TShippingInstSpareDto TShippingInstSpareAsOne) {
        this._tShippingInstSpareAsOne = TShippingInstSpareAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TPickingBDto> _tPickingBList;

    public List<TPickingBDto> getTPickingBList() {
        if (_tPickingBList == null) { _tPickingBList = new ArrayList<TPickingBDto>(); }
        return _tPickingBList;
    }

    public void setTPickingBList(List<TPickingBDto> tPickingBList) {
        this._tPickingBList = tPickingBList;
    }

    protected List<TShippingInstBPrintDto> _tShippingInstBPrintList;

    public List<TShippingInstBPrintDto> getTShippingInstBPrintList() {
        if (_tShippingInstBPrintList == null) { _tShippingInstBPrintList = new ArrayList<TShippingInstBPrintDto>(); }
        return _tShippingInstBPrintList;
    }

    public void setTShippingInstBPrintList(List<TShippingInstBPrintDto> tShippingInstBPrintList) {
        this._tShippingInstBPrintList = tShippingInstBPrintList;
    }

    protected List<TShippingInstDataTransferDto> _tShippingInstDataTransferList;

    public List<TShippingInstDataTransferDto> getTShippingInstDataTransferList() {
        if (_tShippingInstDataTransferList == null) { _tShippingInstDataTransferList = new ArrayList<TShippingInstDataTransferDto>(); }
        return _tShippingInstDataTransferList;
    }

    public void setTShippingInstDataTransferList(List<TShippingInstDataTransferDto> tShippingInstDataTransferList) {
        this._tShippingInstDataTransferList = tShippingInstDataTransferList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingInstBDto)) { return false; }
        final BsTShippingInstBDto otherEntity = (BsTShippingInstBDto)other;
        if (!helpComparingValue(getShippingInstBId(), otherEntity.getShippingInstBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_inst_b");
        result = xCH(result, getShippingInstBId());
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
        sb.append(c).append(getShippingInstBId());
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getStockTypeCd());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getDepositId());
        sb.append(c).append(getDepositCd());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getStoreNoId());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getShapeId());
        sb.append(c).append(getShapeCd());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getAllocInstBId());
        sb.append(c).append(getAllocNum());
        sb.append(c).append(getStockOutNum());
        sb.append(c).append(getUnitPrice());
        sb.append(c).append(getPrice());
        sb.append(c).append(getTax());
        sb.append(c).append(getCasePieceTypeId());
        sb.append(c).append(getCasePieceTypeCd());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getTaxRate());
        sb.append(c).append(getLogiWeightFlg());
        sb.append(c).append(getLogiAttentionTypeCd());
        sb.append(c).append(getLogiSpecialTypeCd());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getEcUnitNm());
        sb.append(c).append(getSampleTypeCd());
        sb.append(c).append(getEcOrderBranchNo());
        sb.append(c).append(getEcProductNmKanji());
        sb.append(c).append(getStorePlantCd());
        sb.append(c).append(getStoreStorageSpaceCd());
        sb.append(c).append(getLotManagTypeCd());
        sb.append(c).append(getDelivCd());
        sb.append(c).append(getTransactionTypeCd());
        sb.append(c).append(getWmSendFlg());
        sb.append(c).append(getLpSendFlg());
        sb.append(c).append(getCmSendFlg());
        sb.append(c).append(getEmpIdCd());
        sb.append(c).append(getEmpNm());
        sb.append(c).append(getUs3fTypeCd());
        sb.append(c).append(getHinmokuGroup());
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
     * [get] SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

    /**
     * [get] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行No.
     * @return The value of the column 'LINE_NO'. (NullAllowed)
     */
    public Long getLineNo() {
        return _lineNo;
    }

    /**
     * [set] LINE_NO: {NotNull, BIGINT(19)} <br>
     * 行No.
     * @param lineNo The value of the column 'LINE_NO'. (NullAllowed)
     */
    public void setLineNo(Long lineNo) {
        __modifiedProperties.add("lineNo");
        this._lineNo = lineNo;
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
     * [get] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 指定倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * 指定倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
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
     * [get] PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
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
     * [get] STOCK_TYPE_CD: {NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getStockTypeCd() {
        return _stockTypeCd;
    }

    /**
     * [set] STOCK_TYPE_CD: {NotNull, VARCHAR(30)} <br>
     * 在庫区分CD
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setStockTypeCd(String stockTypeCd) {
        __modifiedProperties.add("stockTypeCd");
        this._stockTypeCd = stockTypeCd;
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
     * [get] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public Long getAllocInstBId() {
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b} <br>
     * 引当指示ボディID
     * @param allocInstBId The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public void setAllocInstBId(Long allocInstBId) {
        __modifiedProperties.add("allocInstBId");
        this._allocInstBId = allocInstBId;
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
     * [get] STOCK_OUT_NUM: {DECIMAL(14, 4)} <br>
     * 欠品数
     * @return The value of the column 'STOCK_OUT_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStockOutNum() {
        return _stockOutNum;
    }

    /**
     * [set] STOCK_OUT_NUM: {DECIMAL(14, 4)} <br>
     * 欠品数
     * @param stockOutNum The value of the column 'STOCK_OUT_NUM'. (NullAllowed)
     */
    public void setStockOutNum(java.math.BigDecimal stockOutNum) {
        __modifiedProperties.add("stockOutNum");
        this._stockOutNum = stockOutNum;
    }

    /**
     * [get] UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 単価
     * @return The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getUnitPrice() {
        return _unitPrice;
    }

    /**
     * [set] UNIT_PRICE: {DECIMAL(14, 4)} <br>
     * 単価
     * @param unitPrice The value of the column 'UNIT_PRICE'. (NullAllowed)
     */
    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        __modifiedProperties.add("unitPrice");
        this._unitPrice = unitPrice;
    }

    /**
     * [get] PRICE: {DECIMAL(14, 4)} <br>
     * 金額
     * @return The value of the column 'PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice() {
        return _price;
    }

    /**
     * [set] PRICE: {DECIMAL(14, 4)} <br>
     * 金額
     * @param price The value of the column 'PRICE'. (NullAllowed)
     */
    public void setPrice(java.math.BigDecimal price) {
        __modifiedProperties.add("price");
        this._price = price;
    }

    /**
     * [get] TAX: {DECIMAL(14, 4)} <br>
     * 消費税
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {DECIMAL(14, 4)} <br>
     * 消費税
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(java.math.BigDecimal tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] CASE_PIECE_TYPE_ID: {BIGINT(19)} <br>
     * ケースバラ指定区分ID
     * @return The value of the column 'CASE_PIECE_TYPE_ID'. (NullAllowed)
     */
    public Long getCasePieceTypeId() {
        return _casePieceTypeId;
    }

    /**
     * [set] CASE_PIECE_TYPE_ID: {BIGINT(19)} <br>
     * ケースバラ指定区分ID
     * @param casePieceTypeId The value of the column 'CASE_PIECE_TYPE_ID'. (NullAllowed)
     */
    public void setCasePieceTypeId(Long casePieceTypeId) {
        __modifiedProperties.add("casePieceTypeId");
        this._casePieceTypeId = casePieceTypeId;
    }

    /**
     * [get] CASE_PIECE_TYPE_CD: {VARCHAR(30)} <br>
     * ケースバラ指定区分CD
     * @return The value of the column 'CASE_PIECE_TYPE_CD'. (NullAllowed)
     */
    public String getCasePieceTypeCd() {
        return _casePieceTypeCd;
    }

    /**
     * [set] CASE_PIECE_TYPE_CD: {VARCHAR(30)} <br>
     * ケースバラ指定区分CD
     * @param casePieceTypeCd The value of the column 'CASE_PIECE_TYPE_CD'. (NullAllowed)
     */
    public void setCasePieceTypeCd(String casePieceTypeCd) {
        __modifiedProperties.add("casePieceTypeCd");
        this._casePieceTypeCd = casePieceTypeCd;
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
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] TAX_RATE: {DECIMAL(14, 4)} <br>
     * 消費税率
     * @return The value of the column 'TAX_RATE'. (NullAllowed)
     */
    public java.math.BigDecimal getTaxRate() {
        return _taxRate;
    }

    /**
     * [set] TAX_RATE: {DECIMAL(14, 4)} <br>
     * 消費税率
     * @param taxRate The value of the column 'TAX_RATE'. (NullAllowed)
     */
    public void setTaxRate(java.math.BigDecimal taxRate) {
        __modifiedProperties.add("taxRate");
        this._taxRate = taxRate;
    }

    /**
     * [get] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @return The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed)
     */
    public String getLogiWeightFlg() {
        return _logiWeightFlg;
    }

    /**
     * [set] LOGI_WEIGHT_FLG: {CHAR(1)} <br>
     * 物流重量物フラグ
     * @param logiWeightFlg The value of the column 'LOGI_WEIGHT_FLG'. (NullAllowed)
     */
    public void setLogiWeightFlg(String logiWeightFlg) {
        __modifiedProperties.add("logiWeightFlg");
        this._logiWeightFlg = logiWeightFlg;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public String getLogiAttentionTypeCd() {
        return _logiAttentionTypeCd;
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        __modifiedProperties.add("logiAttentionTypeCd");
        this._logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public String getLogiSpecialTypeCd() {
        return _logiSpecialTypeCd;
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        __modifiedProperties.add("logiSpecialTypeCd");
        this._logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public String getHinmokuText() {
        return _hinmokuText;
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public void setHinmokuText(String hinmokuText) {
        __modifiedProperties.add("hinmokuText");
        this._hinmokuText = hinmokuText;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
    }

    /**
     * [get] EC_UNIT_NM: {VARCHAR(60)} <br>
     * EC単位名
     * @return The value of the column 'EC_UNIT_NM'. (NullAllowed)
     */
    public String getEcUnitNm() {
        return _ecUnitNm;
    }

    /**
     * [set] EC_UNIT_NM: {VARCHAR(60)} <br>
     * EC単位名
     * @param ecUnitNm The value of the column 'EC_UNIT_NM'. (NullAllowed)
     */
    public void setEcUnitNm(String ecUnitNm) {
        __modifiedProperties.add("ecUnitNm");
        this._ecUnitNm = ecUnitNm;
    }

    /**
     * [get] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @return The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed)
     */
    public String getSampleTypeCd() {
        return _sampleTypeCd;
    }

    /**
     * [set] SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * サンプル区分
     * @param sampleTypeCd The value of the column 'SAMPLE_TYPE_CD'. (NullAllowed)
     */
    public void setSampleTypeCd(String sampleTypeCd) {
        __modifiedProperties.add("sampleTypeCd");
        this._sampleTypeCd = sampleTypeCd;
    }

    /**
     * [get] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @return The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed)
     */
    public String getEcOrderBranchNo() {
        return _ecOrderBranchNo;
    }

    /**
     * [set] EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * ＥＣ発注番号_枝番
     * @param ecOrderBranchNo The value of the column 'EC_ORDER_BRANCH_NO'. (NullAllowed)
     */
    public void setEcOrderBranchNo(String ecOrderBranchNo) {
        __modifiedProperties.add("ecOrderBranchNo");
        this._ecOrderBranchNo = ecOrderBranchNo;
    }

    /**
     * [get] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @return The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public String getEcProductNmKanji() {
        return _ecProductNmKanji;
    }

    /**
     * [set] EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * EC品名漢字
     * @param ecProductNmKanji The value of the column 'EC_PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public void setEcProductNmKanji(String ecProductNmKanji) {
        __modifiedProperties.add("ecProductNmKanji");
        this._ecProductNmKanji = ecProductNmKanji;
    }

    /**
     * [get] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public String getStorePlantCd() {
        return _storePlantCd;
    }

    /**
     * [set] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public void setStorePlantCd(String storePlantCd) {
        __modifiedProperties.add("storePlantCd");
        this._storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStoreStorageSpaceCd() {
        return _storeStorageSpaceCd;
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        __modifiedProperties.add("storeStorageSpaceCd");
        this._storeStorageSpaceCd = storeStorageSpaceCd;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public String getLotManagTypeCd() {
        return _lotManagTypeCd;
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        __modifiedProperties.add("lotManagTypeCd");
        this._lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @return The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public String getDelivCd() {
        return _delivCd;
    }

    /**
     * [set] DELIV_CD: {VARCHAR(30)} <br>
     * 納入先CD
     * @param delivCd The value of the column 'DELIV_CD'. (NullAllowed)
     */
    public void setDelivCd(String delivCd) {
        __modifiedProperties.add("delivCd");
        this._delivCd = delivCd;
    }

    /**
     * [get] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed)
     */
    public String getTransactionTypeCd() {
        return _transactionTypeCd;
    }

    /**
     * [set] TRANSACTION_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param transactionTypeCd The value of the column 'TRANSACTION_TYPE_CD'. (NullAllowed)
     */
    public void setTransactionTypeCd(String transactionTypeCd) {
        __modifiedProperties.add("transactionTypeCd");
        this._transactionTypeCd = transactionTypeCd;
    }

    /**
     * [get] WM_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public String getWmSendFlg() {
        return _wmSendFlg;
    }

    /**
     * [set] WM_SEND_FLG: {CHAR(1)} <br>
     * WMS送信済フラグ
     * @param wmSendFlg The value of the column 'WM_SEND_FLG'. (NullAllowed)
     */
    public void setWmSendFlg(String wmSendFlg) {
        __modifiedProperties.add("wmSendFlg");
        this._wmSendFlg = wmSendFlg;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public String getLpSendFlg() {
        return _lpSendFlg;
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1)} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed)
     */
    public void setLpSendFlg(String lpSendFlg) {
        __modifiedProperties.add("lpSendFlg");
        this._lpSendFlg = lpSendFlg;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public String getCmSendFlg() {
        return _cmSendFlg;
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1)} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public void setCmSendFlg(String cmSendFlg) {
        __modifiedProperties.add("cmSendFlg");
        this._cmSendFlg = cmSendFlg;
    }

    /**
     * [get] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @return The value of the column 'EMP_ID_CD'. (NullAllowed)
     */
    public String getEmpIdCd() {
        return _empIdCd;
    }

    /**
     * [set] EMP_ID_CD: {VARCHAR(30)} <br>
     * 社員識別CD
     * @param empIdCd The value of the column 'EMP_ID_CD'. (NullAllowed)
     */
    public void setEmpIdCd(String empIdCd) {
        __modifiedProperties.add("empIdCd");
        this._empIdCd = empIdCd;
    }

    /**
     * [get] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @return The value of the column 'EMP_NM'. (NullAllowed)
     */
    public String getEmpNm() {
        return _empNm;
    }

    /**
     * [set] EMP_NM: {VARCHAR(60)} <br>
     * 社員氏名
     * @param empNm The value of the column 'EMP_NM'. (NullAllowed)
     */
    public void setEmpNm(String empNm) {
        __modifiedProperties.add("empNm");
        this._empNm = empNm;
    }

    /**
     * [get] US3F_TYPE_CD: {VARCHAR(30)} <br>
     * US3階区分
     * @return The value of the column 'US3F_TYPE_CD'. (NullAllowed)
     */
    public String getUs3fTypeCd() {
        return _us3fTypeCd;
    }

    /**
     * [set] US3F_TYPE_CD: {VARCHAR(30)} <br>
     * US3階区分
     * @param us3fTypeCd The value of the column 'US3F_TYPE_CD'. (NullAllowed)
     */
    public void setUs3fTypeCd(String us3fTypeCd) {
        __modifiedProperties.add("us3fTypeCd");
        this._us3fTypeCd = us3fTypeCd;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public String getHinmokuGroup() {
        return _hinmokuGroup;
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        __modifiedProperties.add("hinmokuGroup");
        this._hinmokuGroup = hinmokuGroup;
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
