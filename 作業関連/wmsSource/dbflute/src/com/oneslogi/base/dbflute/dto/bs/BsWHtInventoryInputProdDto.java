package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of w_ht_inventory_input_prod as TABLE. <br>
 * 商品棚卸ワーク
 * <pre>
 * [primary-key]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [column]
 *     HT_INVENTORY_INPUT_PROD_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, INVENTORY_H_ID, RCV_LABEL_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, LOC_ID, LOC_CD, LOC_NM, JAN_CD, CONSIGNMENT_CLS_ID, CONSIGNMENT_CLS_NM, STOCK_TYPE_ID, STK_CLS_NM, LOT_ID, LOT, LIMIT_DT, QTY, INVENTORY_B_VERSION_NO, CR_DT, WORK_START_DT, WORK_END_DT, PRODUCTION_DT, UNIT_NM, AREA_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_location, m_stock_type, t_lot, m_warehouse, m_product, m_center, m_client, m_customer
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mLocation, mStockType, tLot, mWarehouse, mProduct, mCenter, mClient, mCustomer
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWHtInventoryInputProdDto implements Serializable {

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
    /** HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _htInventoryInputProdId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _macAddress;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} */
    @JsonKey
    protected Long _warehouseId;

    /** INVENTORY_H_ID: {UQ+, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryHId;

    /** RCV_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rcvLabelNo;

    /** PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** LOC_ID: {+UQ, IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locId;

    /** LOC_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locCd;

    /** LOC_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _locNm;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** CONSIGNMENT_CLS_ID: {+UQ, IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _consignmentClsId;

    /** CONSIGNMENT_CLS_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _consignmentClsNm;

    /** STOCK_TYPE_ID: {+UQ, IX, BIGINT(19), FK to m_stock_type} */
    @JsonKey
    protected Long _stockTypeId;

    /** STK_CLS_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _stkClsNm;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {+UQ, VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {+UQ, VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** QTY: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _qty;

    /** INVENTORY_B_VERSION_NO: {+UQ, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryBVersionNo;

    /** CR_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _crDt;

    /** WORK_START_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workEndDt;

    /** PRODUCTION_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _productionDt;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** AREA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _areaCd;

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
    public BsWHtInventoryInputProdDto() {
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

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWHtInventoryInputProdDto)) { return false; }
        final BsWHtInventoryInputProdDto otherEntity = (BsWHtInventoryInputProdDto)other;
        if (!helpComparingValue(getHtInventoryInputProdId(), otherEntity.getHtInventoryInputProdId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "w_ht_inventory_input_prod");
        result = xCH(result, getHtInventoryInputProdId());
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
        sb.append(c).append(getHtInventoryInputProdId());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getRcvLabelNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getLocId());
        sb.append(c).append(getLocCd());
        sb.append(c).append(getLocNm());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getConsignmentClsId());
        sb.append(c).append(getConsignmentClsNm());
        sb.append(c).append(getStockTypeId());
        sb.append(c).append(getStkClsNm());
        sb.append(c).append(getLotId());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getQty());
        sb.append(c).append(getInventoryBVersionNo());
        sb.append(c).append(getCrDt());
        sb.append(c).append(getWorkStartDt());
        sb.append(c).append(getWorkEndDt());
        sb.append(c).append(getProductionDt());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getAreaCd());
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
     * [get] HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品棚卸ワークID
     * @return The value of the column 'HT_INVENTORY_INPUT_PROD_ID'. (NullAllowed)
     */
    public Long getHtInventoryInputProdId() {
        return _htInventoryInputProdId;
    }

    /**
     * [set] HT_INVENTORY_INPUT_PROD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 商品棚卸ワークID
     * @param htInventoryInputProdId The value of the column 'HT_INVENTORY_INPUT_PROD_ID'. (NullAllowed)
     */
    public void setHtInventoryInputProdId(Long htInventoryInputProdId) {
        __modifiedProperties.add("htInventoryInputProdId");
        this._htInventoryInputProdId = htInventoryInputProdId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public void setMacAddress(String macAddress) {
        __modifiedProperties.add("macAddress");
        this._macAddress = macAddress;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] INVENTORY_H_ID: {UQ+, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {UQ+, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] RCV_LABEL_NO: {VARCHAR(30)} <br>
     * 入庫ラベルＮＯ
     * @return The value of the column 'RCV_LABEL_NO'. (NullAllowed)
     */
    public String getRcvLabelNo() {
        return _rcvLabelNo;
    }

    /**
     * [set] RCV_LABEL_NO: {VARCHAR(30)} <br>
     * 入庫ラベルＮＯ
     * @param rcvLabelNo The value of the column 'RCV_LABEL_NO'. (NullAllowed)
     */
    public void setRcvLabelNo(String rcvLabelNo) {
        __modifiedProperties.add("rcvLabelNo");
        this._rcvLabelNo = rcvLabelNo;
    }

    /**
     * [get] PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
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
     * [get] LOC_ID: {+UQ, IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOC_ID'. (NullAllowed)
     */
    public Long getLocId() {
        return _locId;
    }

    /**
     * [set] LOC_ID: {+UQ, IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locId The value of the column 'LOC_ID'. (NullAllowed)
     */
    public void setLocId(Long locId) {
        __modifiedProperties.add("locId");
        this._locId = locId;
    }

    /**
     * [get] LOC_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOC_CD'. (NullAllowed)
     */
    public String getLocCd() {
        return _locCd;
    }

    /**
     * [set] LOC_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @param locCd The value of the column 'LOC_CD'. (NullAllowed)
     */
    public void setLocCd(String locCd) {
        __modifiedProperties.add("locCd");
        this._locCd = locCd;
    }

    /**
     * [get] LOC_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOC_NM'. (NullAllowed)
     */
    public String getLocNm() {
        return _locNm;
    }

    /**
     * [set] LOC_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @param locNm The value of the column 'LOC_NM'. (NullAllowed)
     */
    public void setLocNm(String locNm) {
        __modifiedProperties.add("locNm");
        this._locNm = locNm;
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
     * [get] CONSIGNMENT_CLS_ID: {+UQ, IX, BIGINT(19), FK to m_customer} <br>
     * 預託在庫区分ID
     * @return The value of the column 'CONSIGNMENT_CLS_ID'. (NullAllowed)
     */
    public Long getConsignmentClsId() {
        return _consignmentClsId;
    }

    /**
     * [set] CONSIGNMENT_CLS_ID: {+UQ, IX, BIGINT(19), FK to m_customer} <br>
     * 預託在庫区分ID
     * @param consignmentClsId The value of the column 'CONSIGNMENT_CLS_ID'. (NullAllowed)
     */
    public void setConsignmentClsId(Long consignmentClsId) {
        __modifiedProperties.add("consignmentClsId");
        this._consignmentClsId = consignmentClsId;
    }

    /**
     * [get] CONSIGNMENT_CLS_NM: {VARCHAR(60)} <br>
     * 預託在庫区分名称
     * @return The value of the column 'CONSIGNMENT_CLS_NM'. (NullAllowed)
     */
    public String getConsignmentClsNm() {
        return _consignmentClsNm;
    }

    /**
     * [set] CONSIGNMENT_CLS_NM: {VARCHAR(60)} <br>
     * 預託在庫区分名称
     * @param consignmentClsNm The value of the column 'CONSIGNMENT_CLS_NM'. (NullAllowed)
     */
    public void setConsignmentClsNm(String consignmentClsNm) {
        __modifiedProperties.add("consignmentClsNm");
        this._consignmentClsNm = consignmentClsNm;
    }

    /**
     * [get] STOCK_TYPE_ID: {+UQ, IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @return The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public Long getStockTypeId() {
        return _stockTypeId;
    }

    /**
     * [set] STOCK_TYPE_ID: {+UQ, IX, BIGINT(19), FK to m_stock_type} <br>
     * 在庫区分ID
     * @param stockTypeId The value of the column 'STOCK_TYPE_ID'. (NullAllowed)
     */
    public void setStockTypeId(Long stockTypeId) {
        __modifiedProperties.add("stockTypeId");
        this._stockTypeId = stockTypeId;
    }

    /**
     * [get] STK_CLS_NM: {VARCHAR(60)} <br>
     * 在庫区分名称
     * @return The value of the column 'STK_CLS_NM'. (NullAllowed)
     */
    public String getStkClsNm() {
        return _stkClsNm;
    }

    /**
     * [set] STK_CLS_NM: {VARCHAR(60)} <br>
     * 在庫区分名称
     * @param stkClsNm The value of the column 'STK_CLS_NM'. (NullAllowed)
     */
    public void setStkClsNm(String stkClsNm) {
        __modifiedProperties.add("stkClsNm");
        this._stkClsNm = stkClsNm;
    }

    /**
     * [get] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] LOT: {+UQ, VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {+UQ, VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {+UQ, VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {+UQ, VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] QTY: {DECIMAL(14, 4)} <br>
     * 数量
     * @return The value of the column 'QTY'. (NullAllowed)
     */
    public java.math.BigDecimal getQty() {
        return _qty;
    }

    /**
     * [set] QTY: {DECIMAL(14, 4)} <br>
     * 数量
     * @param qty The value of the column 'QTY'. (NullAllowed)
     */
    public void setQty(java.math.BigDecimal qty) {
        __modifiedProperties.add("qty");
        this._qty = qty;
    }

    /**
     * [get] INVENTORY_B_VERSION_NO: {+UQ, BIGINT(19)} <br>
     * 棚卸ボディバージョンNo.
     * @return The value of the column 'INVENTORY_B_VERSION_NO'. (NullAllowed)
     */
    public Long getInventoryBVersionNo() {
        return _inventoryBVersionNo;
    }

    /**
     * [set] INVENTORY_B_VERSION_NO: {+UQ, BIGINT(19)} <br>
     * 棚卸ボディバージョンNo.
     * @param inventoryBVersionNo The value of the column 'INVENTORY_B_VERSION_NO'. (NullAllowed)
     */
    public void setInventoryBVersionNo(Long inventoryBVersionNo) {
        __modifiedProperties.add("inventoryBVersionNo");
        this._inventoryBVersionNo = inventoryBVersionNo;
    }

    /**
     * [get] CR_DT: {DATETIME(19)} <br>
     * 登録日付
     * @return The value of the column 'CR_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCrDt() {
        return _crDt;
    }

    /**
     * [set] CR_DT: {DATETIME(19)} <br>
     * 登録日付
     * @param crDt The value of the column 'CR_DT'. (NullAllowed)
     */
    public void setCrDt(java.sql.Timestamp crDt) {
        __modifiedProperties.add("crDt");
        this._crDt = crDt;
    }

    /**
     * [get] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @return The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkStartDt() {
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        __modifiedProperties.add("workStartDt");
        this._workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @return The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkEndDt() {
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        __modifiedProperties.add("workEndDt");
        this._workEndDt = workEndDt;
    }

    /**
     * [get] PRODUCTION_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PRODUCTION_DT'. (NullAllowed)
     */
    public String getProductionDt() {
        return _productionDt;
    }

    /**
     * [set] PRODUCTION_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param productionDt The value of the column 'PRODUCTION_DT'. (NullAllowed)
     */
    public void setProductionDt(String productionDt) {
        __modifiedProperties.add("productionDt");
        this._productionDt = productionDt;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * 単位
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * 単位
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
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
