package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPLPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     WMS_SHIPPING_SLIP_NO, SHIPPING_SLIP_NO, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CENTER_CD, CENTER_NM, CENTER_ABBR, WAREHOUSE_CD, WAREHOUSE_NM, WAREHOUSE_ABBR, WORK_DT, DELIV_DT, PICKING_GROUP_NO, CARRIER_CD, CARRIER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, PICKING_WORK_NO, DELIV_UNIT_NO, SHIPPING_PACKING_NO, BOX_CD, BOX_NM, PACKING_CAL_CLS, PICKING_WORK_MESSAGE, PICKING_WORK_MESSAGE_COUNT, LOCATION_CD, LOCATION_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, PL_OUT_FLG, JANCD, STORE_LABEL_NO, STORE_DT, LOT, LIMIT_DT, PICKING_NUM, TEMP_NO, SEEDING_NO, CART_NO, BUCKET_COL_NO, BUCKET_ROW_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlPLPickingListPrintDto implements Serializable {

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
    /** WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsShippingSlipNo;

    /** SHIPPING_SLIP_NO: {BIGINT(21)} */
    @JsonKey
    protected Long _shippingSlipNo;

    /** CLIENT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _clientNm;

    /** CLIENT_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _clientAbbr;

    /** CENTER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _centerNm;

    /** CENTER_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _centerAbbr;

    /** WAREHOUSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _warehouseCd;

    /** WAREHOUSE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _warehouseNm;

    /** WAREHOUSE_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _warehouseAbbr;

    /** WORK_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _workDt;

    /** DELIV_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _delivDt;

    /** PICKING_GROUP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingGroupNo;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** PICKING_WORK_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** DELIV_UNIT_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _delivUnitNo;

    /** SHIPPING_PACKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} */
    @JsonKey
    protected String _boxNm;

    /** PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} */
    @JsonKey
    protected String _packingCalCls;

    /** PICKING_WORK_MESSAGE: {VARCHAR(255)} */
    @JsonKey
    protected String _pickingWorkMessage;

    /** PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} */
    @JsonKey
    protected Long _pickingWorkMessageCount;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _locationNm;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} */
    @JsonKey
    protected String _productNm;

    /** PL_OUT_FLG: {CHAR(1), refers to t_picking_r.PL_OUT_FLG, classification=ListOutFlg} */
    @JsonKey
    protected String _plOutFlg;

    /** JANCD: {VARCHAR(30), refers to m_product.JAN_CD} */
    @JsonKey
    protected String _jancd;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** STORE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _storeDt;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** PICKING_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNum;

    /** TEMP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tempNo;

    /** SEEDING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _seedingNo;

    /** CART_NO: {BIGINT(20)} */
    @JsonKey
    protected Long _cartNo;

    /** BUCKET_COL_NO: {BIGINT(20)} */
    @JsonKey
    protected Long _bucketColNo;

    /** BUCKET_ROW_NO: {BIGINT(20)} */
    @JsonKey
    protected Long _bucketRowNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPLPickingListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlPLPickingListPrintDto)) { return false; }
        final BsSqlPLPickingListPrintDto otherEntity = (BsSqlPLPickingListPrintDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPLPickingListPrint");
        result = xCH(result, getProductId());
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
        sb.append(c).append(getWmsShippingSlipNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getClientAbbr());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getWarehouseCd());
        sb.append(c).append(getWarehouseNm());
        sb.append(c).append(getWarehouseAbbr());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getPickingGroupNo());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getDelivUnitNo());
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getPackingCalCls());
        sb.append(c).append(getPickingWorkMessage());
        sb.append(c).append(getPickingWorkMessageCount());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getPlOutFlg());
        sb.append(c).append(getJancd());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getStoreDt());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getPickingNum());
        sb.append(c).append(getTempNo());
        sb.append(c).append(getSeedingNo());
        sb.append(c).append(getCartNo());
        sb.append(c).append(getBucketColNo());
        sb.append(c).append(getBucketRowNo());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getWmsShippingSlipNo() {
        return _wmsShippingSlipNo;
    }

    /**
     * [set] WMS_SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * @param wmsShippingSlipNo The value of the column 'WMS_SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setWmsShippingSlipNo(String wmsShippingSlipNo) {
        __modifiedProperties.add("wmsShippingSlipNo");
        this._wmsShippingSlipNo = wmsShippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {BIGINT(21)} <br>
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public Long getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {BIGINT(21)} <br>
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(Long shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public void setClientCd(String clientCd) {
        __modifiedProperties.add("clientCd");
        this._clientCd = clientCd;
    }

    /**
     * [get] CLIENT_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public String getClientNm() {
        return _clientNm;
    }

    /**
     * [set] CLIENT_NM: {VARCHAR(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed)
     */
    public void setClientNm(String clientNm) {
        __modifiedProperties.add("clientNm");
        this._clientNm = clientNm;
    }

    /**
     * [get] CLIENT_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public String getClientAbbr() {
        return _clientAbbr;
    }

    /**
     * [set] CLIENT_ABBR: {VARCHAR(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed)
     */
    public void setClientAbbr(String clientAbbr) {
        __modifiedProperties.add("clientAbbr");
        this._clientAbbr = clientAbbr;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {VARCHAR(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] CENTER_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60)} <br>
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public String getWarehouseCd() {
        return _warehouseCd;
    }

    /**
     * [set] WAREHOUSE_CD: {VARCHAR(30)} <br>
     * @param warehouseCd The value of the column 'WAREHOUSE_CD'. (NullAllowed)
     */
    public void setWarehouseCd(String warehouseCd) {
        __modifiedProperties.add("warehouseCd");
        this._warehouseCd = warehouseCd;
    }

    /**
     * [get] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public String getWarehouseNm() {
        return _warehouseNm;
    }

    /**
     * [set] WAREHOUSE_NM: {VARCHAR(60)} <br>
     * @param warehouseNm The value of the column 'WAREHOUSE_NM'. (NullAllowed)
     */
    public void setWarehouseNm(String warehouseNm) {
        __modifiedProperties.add("warehouseNm");
        this._warehouseNm = warehouseNm;
    }

    /**
     * [get] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * @return The value of the column 'WAREHOUSE_ABBR'. (NullAllowed)
     */
    public String getWarehouseAbbr() {
        return _warehouseAbbr;
    }

    /**
     * [set] WAREHOUSE_ABBR: {VARCHAR(60)} <br>
     * @param warehouseAbbr The value of the column 'WAREHOUSE_ABBR'. (NullAllowed)
     */
    public void setWarehouseAbbr(String warehouseAbbr) {
        __modifiedProperties.add("warehouseAbbr");
        this._warehouseAbbr = warehouseAbbr;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(8)} <br>
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8)} <br>
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] PICKING_GROUP_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public String getPickingGroupNo() {
        return _pickingGroupNo;
    }

    /**
     * [set] PICKING_GROUP_NO: {VARCHAR(30)} <br>
     * @param pickingGroupNo The value of the column 'PICKING_GROUP_NO'. (NullAllowed)
     */
    public void setPickingGroupNo(String pickingGroupNo) {
        __modifiedProperties.add("pickingGroupNo");
        this._pickingGroupNo = pickingGroupNo;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(30)} <br>
     * @param supplyCustomerCd The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public void setSupplyCustomerCd(String supplyCustomerCd) {
        __modifiedProperties.add("supplyCustomerCd");
        this._supplyCustomerCd = supplyCustomerCd;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] DELIV_UNIT_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public String getDelivUnitNo() {
        return _delivUnitNo;
    }

    /**
     * [set] DELIV_UNIT_NO: {VARCHAR(30)} <br>
     * @param delivUnitNo The value of the column 'DELIV_UNIT_NO'. (NullAllowed)
     */
    public void setDelivUnitNo(String delivUnitNo) {
        __modifiedProperties.add("delivUnitNo");
        this._delivUnitNo = delivUnitNo;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {VARCHAR(30), refers to m_box.BOX_CD} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {VARCHAR(60), refers to m_box.BOX_NM} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分<br>
     * // cls(PackingCalCls)
     * @return The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public String getPackingCalCls() {
        return _packingCalCls;
    }

    /**
     * [set] PACKING_CAL_CLS: {VARCHAR(30), refers to m_param.PACKING_CAL_CLS, classification=PackingCalCls} <br>
     * 梱包計算処理区分<br>
     * // cls(PackingCalCls)
     * @param packingCalCls The value of the column 'PACKING_CAL_CLS'. (NullAllowed)
     */
    public void setPackingCalCls(String packingCalCls) {
        __modifiedProperties.add("packingCalCls");
        this._packingCalCls = packingCalCls;
    }

    /**
     * [get] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public String getPickingWorkMessage() {
        return _pickingWorkMessage;
    }

    /**
     * [set] PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * @param pickingWorkMessage The value of the column 'PICKING_WORK_MESSAGE'. (NullAllowed)
     */
    public void setPickingWorkMessage(String pickingWorkMessage) {
        __modifiedProperties.add("pickingWorkMessage");
        this._pickingWorkMessage = pickingWorkMessage;
    }

    /**
     * [get] PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} <br>
     * @return The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed)
     */
    public Long getPickingWorkMessageCount() {
        return _pickingWorkMessageCount;
    }

    /**
     * [set] PICKING_WORK_MESSAGE_COUNT: {BIGINT(21)} <br>
     * @param pickingWorkMessageCount The value of the column 'PICKING_WORK_MESSAGE_COUNT'. (NullAllowed)
     */
    public void setPickingWorkMessageCount(Long pickingWorkMessageCount) {
        __modifiedProperties.add("pickingWorkMessageCount");
        this._pickingWorkMessageCount = pickingWorkMessageCount;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(60)} <br>
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
    }

    /**
     * [get] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} <br>
     * 商品略称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60), refers to m_product.PRODUCT_ABBR} <br>
     * 商品略称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PL_OUT_FLG: {CHAR(1), refers to t_picking_r.PL_OUT_FLG, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ<br>
     * // cls(ListOutFlg)
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public String getPlOutFlg() {
        return _plOutFlg;
    }

    /**
     * [set] PL_OUT_FLG: {CHAR(1), refers to t_picking_r.PL_OUT_FLG, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ<br>
     * // cls(ListOutFlg)
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public void setPlOutFlg(String plOutFlg) {
        __modifiedProperties.add("plOutFlg");
        this._plOutFlg = plOutFlg;
    }

    /**
     * [get] JANCD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @return The value of the column 'JANCD'. (NullAllowed)
     */
    public String getJancd() {
        return _jancd;
    }

    /**
     * [set] JANCD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @param jancd The value of the column 'JANCD'. (NullAllowed)
     */
    public void setJancd(String jancd) {
        __modifiedProperties.add("jancd");
        this._jancd = jancd;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] STORE_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'STORE_DT'. (NullAllowed)
     */
    public String getStoreDt() {
        return _storeDt;
    }

    /**
     * [set] STORE_DT: {VARCHAR(8)} <br>
     * @param storeDt The value of the column 'STORE_DT'. (NullAllowed)
     */
    public void setStoreDt(String storeDt) {
        __modifiedProperties.add("storeDt");
        this._storeDt = storeDt;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNum() {
        return _pickingNum;
    }

    /**
     * [set] PICKING_NUM: {DECIMAL(36, 4)} <br>
     * @param pickingNum The value of the column 'PICKING_NUM'. (NullAllowed)
     */
    public void setPickingNum(java.math.BigDecimal pickingNum) {
        __modifiedProperties.add("pickingNum");
        this._pickingNum = pickingNum;
    }

    /**
     * [get] TEMP_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public String getTempNo() {
        return _tempNo;
    }

    /**
     * [set] TEMP_NO: {VARCHAR(30)} <br>
     * @param tempNo The value of the column 'TEMP_NO'. (NullAllowed)
     */
    public void setTempNo(String tempNo) {
        __modifiedProperties.add("tempNo");
        this._tempNo = tempNo;
    }

    /**
     * [get] SEEDING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public String getSeedingNo() {
        return _seedingNo;
    }

    /**
     * [set] SEEDING_NO: {VARCHAR(30)} <br>
     * @param seedingNo The value of the column 'SEEDING_NO'. (NullAllowed)
     */
    public void setSeedingNo(String seedingNo) {
        __modifiedProperties.add("seedingNo");
        this._seedingNo = seedingNo;
    }

    /**
     * [get] CART_NO: {BIGINT(20)} <br>
     * @return The value of the column 'CART_NO'. (NullAllowed)
     */
    public Long getCartNo() {
        return _cartNo;
    }

    /**
     * [set] CART_NO: {BIGINT(20)} <br>
     * @param cartNo The value of the column 'CART_NO'. (NullAllowed)
     */
    public void setCartNo(Long cartNo) {
        __modifiedProperties.add("cartNo");
        this._cartNo = cartNo;
    }

    /**
     * [get] BUCKET_COL_NO: {BIGINT(20)} <br>
     * @return The value of the column 'BUCKET_COL_NO'. (NullAllowed)
     */
    public Long getBucketColNo() {
        return _bucketColNo;
    }

    /**
     * [set] BUCKET_COL_NO: {BIGINT(20)} <br>
     * @param bucketColNo The value of the column 'BUCKET_COL_NO'. (NullAllowed)
     */
    public void setBucketColNo(Long bucketColNo) {
        __modifiedProperties.add("bucketColNo");
        this._bucketColNo = bucketColNo;
    }

    /**
     * [get] BUCKET_ROW_NO: {BIGINT(20)} <br>
     * @return The value of the column 'BUCKET_ROW_NO'. (NullAllowed)
     */
    public Long getBucketRowNo() {
        return _bucketRowNo;
    }

    /**
     * [set] BUCKET_ROW_NO: {BIGINT(20)} <br>
     * @param bucketRowNo The value of the column 'BUCKET_ROW_NO'. (NullAllowed)
     */
    public void setBucketRowNo(Long bucketRowNo) {
        __modifiedProperties.add("bucketRowNo");
        this._bucketRowNo = bucketRowNo;
    }

}
