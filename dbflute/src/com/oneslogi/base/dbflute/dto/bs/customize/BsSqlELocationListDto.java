package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlELocationList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     LOCATION_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_CD, LOCATION_CD, LOCATION_NM, WAREHOUSE_CD, ZONE_CD, LOCATION_TYPE, PICKING_LOCATION_FLG, ALLOC_NG_FLG, PICKING_ORDER, ALLOC_ORDER, CLIENT_CD, REPLENISH_PRODUCT_CD, REPLENISH_STOCK_TYPE_CD, REPLENISH_DEPOSIT_CD, REPLENISH_DEPOSIT_NM, REPLENISH_P_NUM, REPLENISH_P_PRODUCT_SHAPE_CD, MAX_STORE_NUM, MAX_STORE_PRODUCT_SHAPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS, ZONE_ID, ZONE_NM, WAREHOUSE_NM, WAREHOUSE_ID, PRODUCT_ID, REPLENISH_PRODUCT_SHAPE_ID, REPLENISH_PRODUCT_SHAPE_NM, MAX_STORE_PRODUCT_SHAPE_ID, MAX_STORE_PRODUCT_SHAPE_NM, MESSAGE_NM, MLOCATION_ID, MVERSION_NO
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
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlELocationListDto implements Serializable {

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
    /** LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} */
    @JsonKey
    protected Long _locationId;

    /** RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} */
    @JsonKey
    protected String _errorMessageCd;

    /** CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} */
    @JsonKey
    protected String _locationNm;

    /** WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} */
    @JsonKey
    protected String _warehouseCd;

    /** ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} */
    @JsonKey
    protected String _zoneCd;

    /** LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} */
    @JsonKey
    protected String _locationType;

    /** PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} */
    @JsonKey
    protected String _pickingLocationFlg;

    /** ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} */
    @JsonKey
    protected String _allocNgFlg;

    /** PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} */
    @JsonKey
    protected String _pickingOrder;

    /** ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} */
    @JsonKey
    protected String _allocOrder;

    /** CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} */
    @JsonKey
    protected String _clientCd;

    /** REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} */
    @JsonKey
    protected String _replenishProductCd;

    /** REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} */
    @JsonKey
    protected String _replenishStockTypeCd;

    /** REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} */
    @JsonKey
    protected String _replenishDepositCd;

    /** REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    @JsonKey
    protected String _replenishDepositNm;

    /** REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} */
    @JsonKey
    protected String _replenishPNum;

    /** REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} */
    @JsonKey
    protected String _replenishPProductShapeCd;

    /** MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} */
    @JsonKey
    protected String _maxStoreNum;

    /** MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} */
    @JsonKey
    protected String _maxStoreProductShapeCd;

    /** DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} */
    @JsonKey
    protected String _updProcess;

    /** ZONE_ID: {BIGINT(20)} */
    @JsonKey
    protected Long _zoneId;

    /** ZONE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _zoneNm;

    /** WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} */
    @JsonKey
    protected String _warehouseNm;

    /** WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} */
    @JsonKey
    protected Long _warehouseId;

    /** PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} */
    @JsonKey
    protected Long _replenishProductShapeId;

    /** REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} */
    @JsonKey
    protected String _replenishProductShapeNm;

    /** MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} */
    @JsonKey
    protected Long _maxStoreProductShapeId;

    /** MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} */
    @JsonKey
    protected String _maxStoreProductShapeNm;

    /** MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} */
    @JsonKey
    protected String _messageNm;

    /** MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} */
    @JsonKey
    protected Long _mlocationId;

    /** MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} */
    @JsonKey
    protected Long _mversionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlELocationListDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlELocationListDto)) { return false; }
        final BsSqlELocationListDto otherEntity = (BsSqlELocationListDto)other;
        if (!helpComparingValue(getLocationId(), otherEntity.getLocationId())) { return false; }
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getLocationNm(), otherEntity.getLocationNm())) { return false; }
        if (!helpComparingValue(getWarehouseCd(), otherEntity.getWarehouseCd())) { return false; }
        if (!helpComparingValue(getZoneCd(), otherEntity.getZoneCd())) { return false; }
        if (!helpComparingValue(getLocationType(), otherEntity.getLocationType())) { return false; }
        if (!helpComparingValue(getPickingLocationFlg(), otherEntity.getPickingLocationFlg())) { return false; }
        if (!helpComparingValue(getAllocNgFlg(), otherEntity.getAllocNgFlg())) { return false; }
        if (!helpComparingValue(getPickingOrder(), otherEntity.getPickingOrder())) { return false; }
        if (!helpComparingValue(getAllocOrder(), otherEntity.getAllocOrder())) { return false; }
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getReplenishProductCd(), otherEntity.getReplenishProductCd())) { return false; }
        if (!helpComparingValue(getReplenishStockTypeCd(), otherEntity.getReplenishStockTypeCd())) { return false; }
        if (!helpComparingValue(getReplenishDepositCd(), otherEntity.getReplenishDepositCd())) { return false; }
        if (!helpComparingValue(getReplenishDepositNm(), otherEntity.getReplenishDepositNm())) { return false; }
        if (!helpComparingValue(getReplenishPNum(), otherEntity.getReplenishPNum())) { return false; }
        if (!helpComparingValue(getReplenishPProductShapeCd(), otherEntity.getReplenishPProductShapeCd())) { return false; }
        if (!helpComparingValue(getMaxStoreNum(), otherEntity.getMaxStoreNum())) { return false; }
        if (!helpComparingValue(getMaxStoreProductShapeCd(), otherEntity.getMaxStoreProductShapeCd())) { return false; }
        if (!helpComparingValue(getDelFlg(), otherEntity.getDelFlg())) { return false; }
        if (!helpComparingValue(getVersionNo(), otherEntity.getVersionNo())) { return false; }
        if (!helpComparingValue(getControlNo(), otherEntity.getControlNo())) { return false; }
        if (!helpComparingValue(getAddDt(), otherEntity.getAddDt())) { return false; }
        if (!helpComparingValue(getAddUser(), otherEntity.getAddUser())) { return false; }
        if (!helpComparingValue(getAddProcess(), otherEntity.getAddProcess())) { return false; }
        if (!helpComparingValue(getUpdDt(), otherEntity.getUpdDt())) { return false; }
        if (!helpComparingValue(getUpdUser(), otherEntity.getUpdUser())) { return false; }
        if (!helpComparingValue(getUpdProcess(), otherEntity.getUpdProcess())) { return false; }
        if (!helpComparingValue(getZoneId(), otherEntity.getZoneId())) { return false; }
        if (!helpComparingValue(getZoneNm(), otherEntity.getZoneNm())) { return false; }
        if (!helpComparingValue(getWarehouseNm(), otherEntity.getWarehouseNm())) { return false; }
        if (!helpComparingValue(getWarehouseId(), otherEntity.getWarehouseId())) { return false; }
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getReplenishProductShapeId(), otherEntity.getReplenishProductShapeId())) { return false; }
        if (!helpComparingValue(getReplenishProductShapeNm(), otherEntity.getReplenishProductShapeNm())) { return false; }
        if (!helpComparingValue(getMaxStoreProductShapeId(), otherEntity.getMaxStoreProductShapeId())) { return false; }
        if (!helpComparingValue(getMaxStoreProductShapeNm(), otherEntity.getMaxStoreProductShapeNm())) { return false; }
        if (!helpComparingValue(getMessageNm(), otherEntity.getMessageNm())) { return false; }
        if (!helpComparingValue(getMlocationId(), otherEntity.getMlocationId())) { return false; }
        if (!helpComparingValue(getMversionNo(), otherEntity.getMversionNo())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlELocationList");
        result = xCH(result, getLocationId());
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
        result = xCH(result, getCenterCd());
        result = xCH(result, getLocationCd());
        result = xCH(result, getLocationNm());
        result = xCH(result, getWarehouseCd());
        result = xCH(result, getZoneCd());
        result = xCH(result, getLocationType());
        result = xCH(result, getPickingLocationFlg());
        result = xCH(result, getAllocNgFlg());
        result = xCH(result, getPickingOrder());
        result = xCH(result, getAllocOrder());
        result = xCH(result, getClientCd());
        result = xCH(result, getReplenishProductCd());
        result = xCH(result, getReplenishStockTypeCd());
        result = xCH(result, getReplenishDepositCd());
        result = xCH(result, getReplenishDepositNm());
        result = xCH(result, getReplenishPNum());
        result = xCH(result, getReplenishPProductShapeCd());
        result = xCH(result, getMaxStoreNum());
        result = xCH(result, getMaxStoreProductShapeCd());
        result = xCH(result, getDelFlg());
        result = xCH(result, getVersionNo());
        result = xCH(result, getControlNo());
        result = xCH(result, getAddDt());
        result = xCH(result, getAddUser());
        result = xCH(result, getAddProcess());
        result = xCH(result, getUpdDt());
        result = xCH(result, getUpdUser());
        result = xCH(result, getUpdProcess());
        result = xCH(result, getZoneId());
        result = xCH(result, getZoneNm());
        result = xCH(result, getWarehouseNm());
        result = xCH(result, getWarehouseId());
        result = xCH(result, getProductId());
        result = xCH(result, getReplenishProductShapeId());
        result = xCH(result, getReplenishProductShapeNm());
        result = xCH(result, getMaxStoreProductShapeId());
        result = xCH(result, getMaxStoreProductShapeNm());
        result = xCH(result, getMessageNm());
        result = xCH(result, getMlocationId());
        result = xCH(result, getMversionNo());
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
        sb.append(c).append(getLocationId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getZoneCd());
        sb.append(c).append(getLocationType());
        sb.append(c).append(getPickingLocationFlg());
        sb.append(c).append(getAllocNgFlg());
        sb.append(c).append(getPickingOrder());
        sb.append(c).append(getAllocOrder());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getReplenishProductCd());
        sb.append(c).append(getReplenishStockTypeCd());
        sb.append(c).append(getReplenishDepositCd());
        sb.append(c).append(getReplenishDepositNm());
        sb.append(c).append(getReplenishPNum());
        sb.append(c).append(getReplenishPProductShapeCd());
        sb.append(c).append(getMaxStoreNum());
        sb.append(c).append(getMaxStoreProductShapeCd());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        sb.append(c).append(getZoneId());
        sb.append(c).append(getZoneNm());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getWarehouseId());
        sb.append(c).append(getProductId());
        sb.append(c).append(getReplenishProductShapeId());
        sb.append(c).append(getReplenishProductShapeNm());
        sb.append(c).append(getMaxStoreProductShapeId());
        sb.append(c).append(getMaxStoreProductShapeNm());
        sb.append(c).append(getMessageNm());
        sb.append(c).append(getMlocationId());
        sb.append(c).append(getMversionNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} <br>
     * ロケーションマスタ受信ID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {BIGINT(20), refers to e_location.LOCATION_ID} <br>
     * ロケーションマスタ受信ID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_location.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_location.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_location.IMPORT_FLG} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_location.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_location.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(255), refers to e_location.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(255), refers to e_location.LOCATION_CD} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(255), refers to e_location.LOCATION_NM} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(255), refers to e_location.WAREHOUSE_CD} <br>
     * 倉庫CD
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} <br>
     * ゾーンCD
     * @return The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public String getZoneCd() {
        return _zoneCd;
    }

    /**
     * [set] ZONE_CD: {VARCHAR(255), refers to e_location.ZONE_CD} <br>
     * ゾーンCD
     * @param zoneCd The value of the column 'ZONE_CD'. (NullAllowed)
     */
    public void setZoneCd(String zoneCd) {
        __modifiedProperties.add("zoneCd");
        this._zoneCd = zoneCd;
    }

    /**
     * [get] LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} <br>
     * ロケーション種別
     * @return The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public String getLocationType() {
        return _locationType;
    }

    /**
     * [set] LOCATION_TYPE: {VARCHAR(255), refers to e_location.LOCATION_TYPE} <br>
     * ロケーション種別
     * @param locationType The value of the column 'LOCATION_TYPE'. (NullAllowed)
     */
    public void setLocationType(String locationType) {
        __modifiedProperties.add("locationType");
        this._locationType = locationType;
    }

    /**
     * [get] PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} <br>
     * ピックロケフラグ
     * @return The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public String getPickingLocationFlg() {
        return _pickingLocationFlg;
    }

    /**
     * [set] PICKING_LOCATION_FLG: {VARCHAR(255), refers to e_location.PICKING_LOCATION_FLG} <br>
     * ピックロケフラグ
     * @param pickingLocationFlg The value of the column 'PICKING_LOCATION_FLG'. (NullAllowed)
     */
    public void setPickingLocationFlg(String pickingLocationFlg) {
        __modifiedProperties.add("pickingLocationFlg");
        this._pickingLocationFlg = pickingLocationFlg;
    }

    /**
     * [get] ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} <br>
     * 引当禁止フラグ
     * @return The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public String getAllocNgFlg() {
        return _allocNgFlg;
    }

    /**
     * [set] ALLOC_NG_FLG: {VARCHAR(255), refers to e_location.ALLOC_NG_FLG} <br>
     * 引当禁止フラグ
     * @param allocNgFlg The value of the column 'ALLOC_NG_FLG'. (NullAllowed)
     */
    public void setAllocNgFlg(String allocNgFlg) {
        __modifiedProperties.add("allocNgFlg");
        this._allocNgFlg = allocNgFlg;
    }

    /**
     * [get] PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} <br>
     * ピッキング順序
     * @return The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public String getPickingOrder() {
        return _pickingOrder;
    }

    /**
     * [set] PICKING_ORDER: {VARCHAR(255), refers to e_location.PICKING_ORDER} <br>
     * ピッキング順序
     * @param pickingOrder The value of the column 'PICKING_ORDER'. (NullAllowed)
     */
    public void setPickingOrder(String pickingOrder) {
        __modifiedProperties.add("pickingOrder");
        this._pickingOrder = pickingOrder;
    }

    /**
     * [get] ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} <br>
     * 引当順序
     * @return The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public String getAllocOrder() {
        return _allocOrder;
    }

    /**
     * [set] ALLOC_ORDER: {VARCHAR(255), refers to e_location.ALLOC_ORDER} <br>
     * 引当順序
     * @param allocOrder The value of the column 'ALLOC_ORDER'. (NullAllowed)
     */
    public void setAllocOrder(String allocOrder) {
        __modifiedProperties.add("allocOrder");
        this._allocOrder = allocOrder;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(255), refers to e_location.CLIENT_CD} <br>
     * 荷主CD
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} <br>
     * 補充商品CD
     * @return The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed)
     */
    public String getReplenishProductCd() {
        return _replenishProductCd;
    }

    /**
     * [set] REPLENISH_PRODUCT_CD: {VARCHAR(255), refers to e_location.REPLENISH_PRODUCT_CD} <br>
     * 補充商品CD
     * @param replenishProductCd The value of the column 'REPLENISH_PRODUCT_CD'. (NullAllowed)
     */
    public void setReplenishProductCd(String replenishProductCd) {
        __modifiedProperties.add("replenishProductCd");
        this._replenishProductCd = replenishProductCd;
    }

    /**
     * [get] REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} <br>
     * 補充在庫区分CD
     * @return The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed)
     */
    public String getReplenishStockTypeCd() {
        return _replenishStockTypeCd;
    }

    /**
     * [set] REPLENISH_STOCK_TYPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_STOCK_TYPE_CD} <br>
     * 補充在庫区分CD
     * @param replenishStockTypeCd The value of the column 'REPLENISH_STOCK_TYPE_CD'. (NullAllowed)
     */
    public void setReplenishStockTypeCd(String replenishStockTypeCd) {
        __modifiedProperties.add("replenishStockTypeCd");
        this._replenishStockTypeCd = replenishStockTypeCd;
    }

    /**
     * [get] REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} <br>
     * 補充預託CD
     * @return The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed)
     */
    public String getReplenishDepositCd() {
        return _replenishDepositCd;
    }

    /**
     * [set] REPLENISH_DEPOSIT_CD: {VARCHAR(255), refers to e_location.REPLENISH_DEPOSIT_CD} <br>
     * 補充預託CD
     * @param replenishDepositCd The value of the column 'REPLENISH_DEPOSIT_CD'. (NullAllowed)
     */
    public void setReplenishDepositCd(String replenishDepositCd) {
        __modifiedProperties.add("replenishDepositCd");
        this._replenishDepositCd = replenishDepositCd;
    }

    /**
     * [get] REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'REPLENISH_DEPOSIT_NM'. (NullAllowed)
     */
    public String getReplenishDepositNm() {
        return _replenishDepositNm;
    }

    /**
     * [set] REPLENISH_DEPOSIT_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param replenishDepositNm The value of the column 'REPLENISH_DEPOSIT_NM'. (NullAllowed)
     */
    public void setReplenishDepositNm(String replenishDepositNm) {
        __modifiedProperties.add("replenishDepositNm");
        this._replenishDepositNm = replenishDepositNm;
    }

    /**
     * [get] REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} <br>
     * 補充点
     * @return The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public String getReplenishPNum() {
        return _replenishPNum;
    }

    /**
     * [set] REPLENISH_P_NUM: {VARCHAR(255), refers to e_location.REPLENISH_P_NUM} <br>
     * 補充点
     * @param replenishPNum The value of the column 'REPLENISH_P_NUM'. (NullAllowed)
     */
    public void setReplenishPNum(String replenishPNum) {
        __modifiedProperties.add("replenishPNum");
        this._replenishPNum = replenishPNum;
    }

    /**
     * [get] REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} <br>
     * 補充点商品荷姿CD
     * @return The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public String getReplenishPProductShapeCd() {
        return _replenishPProductShapeCd;
    }

    /**
     * [set] REPLENISH_P_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.REPLENISH_P_PRODUCT_SHAPE_CD} <br>
     * 補充点商品荷姿CD
     * @param replenishPProductShapeCd The value of the column 'REPLENISH_P_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public void setReplenishPProductShapeCd(String replenishPProductShapeCd) {
        __modifiedProperties.add("replenishPProductShapeCd");
        this._replenishPProductShapeCd = replenishPProductShapeCd;
    }

    /**
     * [get] MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} <br>
     * 最大格納数
     * @return The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public String getMaxStoreNum() {
        return _maxStoreNum;
    }

    /**
     * [set] MAX_STORE_NUM: {VARCHAR(255), refers to e_location.MAX_STORE_NUM} <br>
     * 最大格納数
     * @param maxStoreNum The value of the column 'MAX_STORE_NUM'. (NullAllowed)
     */
    public void setMaxStoreNum(String maxStoreNum) {
        __modifiedProperties.add("maxStoreNum");
        this._maxStoreNum = maxStoreNum;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} <br>
     * 最大格納数商品荷姿CD
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public String getMaxStoreProductShapeCd() {
        return _maxStoreProductShapeCd;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_CD: {VARCHAR(255), refers to e_location.MAX_STORE_PRODUCT_SHAPE_CD} <br>
     * 最大格納数商品荷姿CD
     * @param maxStoreProductShapeCd The value of the column 'MAX_STORE_PRODUCT_SHAPE_CD'. (NullAllowed)
     */
    public void setMaxStoreProductShapeCd(String maxStoreProductShapeCd) {
        __modifiedProperties.add("maxStoreProductShapeCd");
        this._maxStoreProductShapeCd = maxStoreProductShapeCd;
    }

    /**
     * [get] DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {CHAR(1), refers to e_location.DEL_FLG, classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {BIGINT(20), refers to e_location.VERSION_NO} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {BIGINT(20), refers to e_location.CONTROL_NO} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(23), refers to e_location.ADD_DT} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60), refers to e_location.ADD_USER} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255), refers to e_location.ADD_PROCESS} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(23), refers to e_location.UPD_DT} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60), refers to e_location.UPD_USER} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255), refers to e_location.UPD_PROCESS} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

    /**
     * [get] ZONE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public Long getZoneId() {
        return _zoneId;
    }

    /**
     * [set] ZONE_ID: {BIGINT(20)} <br>
     * @param zoneId The value of the column 'ZONE_ID'. (NullAllowed)
     */
    public void setZoneId(Long zoneId) {
        __modifiedProperties.add("zoneId");
        this._zoneId = zoneId;
    }

    /**
     * [get] ZONE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public String getZoneNm() {
        return _zoneNm;
    }

    /**
     * [set] ZONE_NM: {VARCHAR(60)} <br>
     * @param zoneNm The value of the column 'ZONE_NM'. (NullAllowed)
     */
    public void setZoneNm(String zoneNm) {
        __modifiedProperties.add("zoneNm");
        this._zoneNm = zoneNm;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} <br>
     * 倉庫名称
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60), refers to m_warehouse.WAREHOUSE_NM} <br>
     * 倉庫名称
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} <br>
     * 倉庫ID
     * @return The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public Long getWarehouseId() {
        return _warehouseId;
    }

    /**
     * [set] WAREHOUSE_ID: {BIGINT(20), refers to m_warehouse.WAREHOUSE_ID} <br>
     * 倉庫ID
     * @param warehouseId The value of the column 'WAREHOUSE_ID'. (NullAllowed)
     */
    public void setWarehouseId(Long warehouseId) {
        __modifiedProperties.add("warehouseId");
        this._warehouseId = warehouseId;
    }

    /**
     * [get] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getReplenishProductShapeId() {
        return _replenishProductShapeId;
    }

    /**
     * [set] REPLENISH_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @param replenishProductShapeId The value of the column 'REPLENISH_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setReplenishProductShapeId(Long replenishProductShapeId) {
        __modifiedProperties.add("replenishProductShapeId");
        this._replenishProductShapeId = replenishProductShapeId;
    }

    /**
     * [get] REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'REPLENISH_PRODUCT_SHAPE_NM'. (NullAllowed)
     */
    public String getReplenishProductShapeNm() {
        return _replenishProductShapeNm;
    }

    /**
     * [set] REPLENISH_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @param replenishProductShapeNm The value of the column 'REPLENISH_PRODUCT_SHAPE_NM'. (NullAllowed)
     */
    public void setReplenishProductShapeNm(String replenishProductShapeNm) {
        __modifiedProperties.add("replenishProductShapeNm");
        this._replenishProductShapeNm = replenishProductShapeNm;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public Long getMaxStoreProductShapeId() {
        return _maxStoreProductShapeId;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_ID: {BIGINT(20)} <br>
     * @param maxStoreProductShapeId The value of the column 'MAX_STORE_PRODUCT_SHAPE_ID'. (NullAllowed)
     */
    public void setMaxStoreProductShapeId(Long maxStoreProductShapeId) {
        __modifiedProperties.add("maxStoreProductShapeId");
        this._maxStoreProductShapeId = maxStoreProductShapeId;
    }

    /**
     * [get] MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'MAX_STORE_PRODUCT_SHAPE_NM'. (NullAllowed)
     */
    public String getMaxStoreProductShapeNm() {
        return _maxStoreProductShapeNm;
    }

    /**
     * [set] MAX_STORE_PRODUCT_SHAPE_NM: {VARCHAR(100)} <br>
     * @param maxStoreProductShapeNm The value of the column 'MAX_STORE_PRODUCT_SHAPE_NM'. (NullAllowed)
     */
    public void setMaxStoreProductShapeNm(String maxStoreProductShapeNm) {
        __modifiedProperties.add("maxStoreProductShapeNm");
        this._maxStoreProductShapeNm = maxStoreProductShapeNm;
    }

    /**
     * [get] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @return The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public String getMessageNm() {
        return _messageNm;
    }

    /**
     * [set] MESSAGE_NM: {VARCHAR(255), refers to b_message.MESSAGE_NM} <br>
     * メッセージ
     * @param messageNm The value of the column 'MESSAGE_NM'. (NullAllowed)
     */
    public void setMessageNm(String messageNm) {
        __modifiedProperties.add("messageNm");
        this._messageNm = messageNm;
    }

    /**
     * [get] MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} <br>
     * ロケーションID
     * @return The value of the column 'MLOCATION_ID'. (NullAllowed)
     */
    public Long getMlocationId() {
        return _mlocationId;
    }

    /**
     * [set] MLOCATION_ID: {BIGINT(20), refers to m_location.LOCATION_ID} <br>
     * ロケーションID
     * @param mlocationId The value of the column 'MLOCATION_ID'. (NullAllowed)
     */
    public void setMlocationId(Long mlocationId) {
        __modifiedProperties.add("mlocationId");
        this._mlocationId = mlocationId;
    }

    /**
     * [get] MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} <br>
     * バージョンNo.
     * @return The value of the column 'MVERSION_NO'. (NullAllowed)
     */
    public Long getMversionNo() {
        return _mversionNo;
    }

    /**
     * [set] MVERSION_NO: {BIGINT(20), refers to m_location.VERSION_NO} <br>
     * バージョンNo.
     * @param mversionNo The value of the column 'MVERSION_NO'. (NullAllowed)
     */
    public void setMversionNo(Long mversionNo) {
        __modifiedProperties.add("mversionNo");
        this._mversionNo = mversionNo;
    }

}
