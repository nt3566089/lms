package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_plan_b as TABLE. <br>
 * 出荷予定ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_PLAN_B_ID
 *
 * [column]
 *     SHIPPING_PLAN_B_ID, SHIPPING_PLAN_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, HINMOKU_GROUP, HINMOKU_TEXT, UNIT_NM, STORE_STORAGE_SPACE_CD, STORE_PLANT_CD, TRANSACTION_TYPE_CD, CM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_plan_h
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingPlanH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingPlanBDto implements Serializable {

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
    /** SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingPlanBId;

    /** SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h} */
    @JsonKey
    protected Long _shippingPlanHId;

    /** LINE_NO: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _lineNo;

    /** WAREHOUSE_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _warehouseId;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** PRODUCT_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {IX, NotNull, VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** LOCATION_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** DEPOSIT_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _depositId;

    /** DEPOSIT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositCd;

    /** LOT_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _lotId;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** STORE_NO_ID: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _storeNoId;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** SHAPE_ID: {IX, BIGINT(19)} */
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

    /** ERROR_FLG: {CHAR(1)} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** ALLOC_INST_B_ID: {IX, BIGINT(19)} */
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

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    @JsonKey
    protected String _hinmokuText;

    /** UNIT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _unitNm;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(60)} */
    @JsonKey
    protected String _storeStorageSpaceCd;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storePlantCd;

    /** TRANSACTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transactionTypeCd;

    /** CM_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _cmSendFlg;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _lpSendFlg;

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
    public BsTShippingPlanBDto() {
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
    protected TShippingPlanHDto _tShippingPlanH;

    public TShippingPlanHDto getTShippingPlanH() {
        return _tShippingPlanH;
    }

    public void setTShippingPlanH(TShippingPlanHDto tShippingPlanH) {
        this._tShippingPlanH = tShippingPlanH;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingPlanBDto)) { return false; }
        final BsTShippingPlanBDto otherEntity = (BsTShippingPlanBDto)other;
        if (!helpComparingValue(getShippingPlanBId(), otherEntity.getShippingPlanBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_plan_b");
        result = xCH(result, getShippingPlanBId());
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
        sb.append(c).append(getShippingPlanBId());
        sb.append(c).append(getShippingPlanHId());
        sb.append(c).append(getLineNo());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
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
        sb.append(c).append(getHinmokuGroup());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getStoreStorageSpaceCd());
        sb.append(c).append(getStorePlantCd());
        sb.append(c).append(getTransactionTypeCd());
        sb.append(c).append(getCmSendFlg());
        sb.append(c).append(getLpSendFlg());
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
     * [get] SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定ボディID
     * @return The value of the column 'SHIPPING_PLAN_B_ID'. (NullAllowed)
     */
    public Long getShippingPlanBId() {
        return _shippingPlanBId;
    }

    /**
     * [set] SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷予定ボディID
     * @param shippingPlanBId The value of the column 'SHIPPING_PLAN_B_ID'. (NullAllowed)
     */
    public void setShippingPlanBId(Long shippingPlanBId) {
        __modifiedProperties.add("shippingPlanBId");
        this._shippingPlanBId = shippingPlanBId;
    }

    /**
     * [get] SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h} <br>
     * 出荷予定ヘッダID
     * @return The value of the column 'SHIPPING_PLAN_H_ID'. (NullAllowed)
     */
    public Long getShippingPlanHId() {
        return _shippingPlanHId;
    }

    /**
     * [set] SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h} <br>
     * 出荷予定ヘッダID
     * @param shippingPlanHId The value of the column 'SHIPPING_PLAN_H_ID'. (NullAllowed)
     */
    public void setShippingPlanHId(Long shippingPlanHId) {
        __modifiedProperties.add("shippingPlanHId");
        this._shippingPlanHId = shippingPlanHId;
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
     * [get] WAREHOUSE_ID: {IX, BIGINT(19)} <br>
     * 指定倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {IX, BIGINT(19)} <br>
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
     * [get] PRODUCT_ID: {IX, BIGINT(19)} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, BIGINT(19)} <br>
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
     * [get] LOCATION_ID: {IX, BIGINT(19)} <br>
     * 指定ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19)} <br>
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
     * [get] DEPOSIT_ID: {IX, BIGINT(19)} <br>
     * 預託ID
     * @return The value of the column 'DEPOSIT_ID'. (NullAllowed)
     */
    public Long getDepositId() {
        return _depositId;
    }

    /**
     * [set] DEPOSIT_ID: {IX, BIGINT(19)} <br>
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
     * [get] LOT_ID: {IX, BIGINT(19)} <br>
     * 指定ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19)} <br>
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
     * [get] STORE_NO_ID: {IX, BIGINT(19)} <br>
     * 指定入庫No.ID
     * @return The value of the column 'STORE_NO_ID'. (NullAllowed)
     */
    public Long getStoreNoId() {
        return _storeNoId;
    }

    /**
     * [set] STORE_NO_ID: {IX, BIGINT(19)} <br>
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
     * [get] SHAPE_ID: {IX, BIGINT(19)} <br>
     * 指定荷姿ID
     * @return The value of the column 'SHAPE_ID'. (NullAllowed)
     */
    public Long getShapeId() {
        return _shapeId;
    }

    /**
     * [set] SHAPE_ID: {IX, BIGINT(19)} <br>
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
     * [get] ERROR_FLG: {CHAR(1)} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1)} <br>
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
     * [get] ALLOC_INST_B_ID: {IX, BIGINT(19)} <br>
     * 引当指示ボディID
     * @return The value of the column 'ALLOC_INST_B_ID'. (NullAllowed)
     */
    public Long getAllocInstBId() {
        return _allocInstBId;
    }

    /**
     * [set] ALLOC_INST_B_ID: {IX, BIGINT(19)} <br>
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
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(60)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStoreStorageSpaceCd() {
        return _storeStorageSpaceCd;
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(60)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        __modifiedProperties.add("storeStorageSpaceCd");
        this._storeStorageSpaceCd = storeStorageSpaceCd;
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
