package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlDeliverySlipListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CLIENT_CD, CLIENT_NM, CENTER_CD, CENTER_NM, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, SHIPPING_DT, DELIV_DT, SHIPPING_SLIP_NO, CLIENT_SHIPPING_NO, PRODUCT_CD, PRODUCT_NM, TEL_NO, LOT, LIMIT_DT, PICKING_NUM, PACKING_OUT_FLG, PICKING_WORK_NO, TOTAL_PRICE, TOTAL_TAX, PRICE, TAX, SHIPPING_INST_B_ID
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
public abstract class BsSqlDeliverySlipListPrintDto implements Serializable {

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
    /** CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} */
    @JsonKey
    protected String _clientCd;

    /** CLIENT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _clientNm;

    /** CENTER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _centerNm;

    /** SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_shipping_inst_h.SUPPLY_CUSTOMER_CD} */
    @JsonKey
    protected String _supplyCustomerCd;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** SHIPPING_DT: {VARCHAR(8), refers to t_shipping_inst_h.SHIPPING_DT} */
    @JsonKey
    protected String _shippingDt;

    /** DELIV_DT: {VARCHAR(8), refers to t_shipping_inst_h.DELIV_DT} */
    @JsonKey
    protected String _delivDt;

    /** SHIPPING_SLIP_NO: {VARCHAR(30), refers to t_shipping_inst_h.SHIPPING_SLIP_NO} */
    @JsonKey
    protected String _shippingSlipNo;

    /** CLIENT_SHIPPING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _telNo;

    /** LOT: {VARCHAR(30), refers to t_lot.LOT} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8), refers to t_lot.LIMIT_DT} */
    @JsonKey
    protected String _limitDt;

    /** PICKING_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNum;

    /** PACKING_OUT_FLG: {CHAR(1), refers to t_picking_r.PACKING_OUT_FLG, classification=ListOutFlg} */
    @JsonKey
    protected String _packingOutFlg;

    /** PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} */
    @JsonKey
    protected String _pickingWorkNo;

    /** TOTAL_PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalPrice;

    /** TOTAL_TAX: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _totalTax;

    /** PRICE: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _price;

    /** TAX: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _tax;

    /** SHIPPING_INST_B_ID: {BIGINT(20), refers to t_shipping_inst_b.SHIPPING_INST_B_ID} */
    @JsonKey
    protected Long _shippingInstBId;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlDeliverySlipListPrintDto() {
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
        if (other == null || !(other instanceof BsSqlDeliverySlipListPrintDto)) { return false; }
        final BsSqlDeliverySlipListPrintDto otherEntity = (BsSqlDeliverySlipListPrintDto)other;
        if (!helpComparingValue(getClientCd(), otherEntity.getClientCd())) { return false; }
        if (!helpComparingValue(getClientNm(), otherEntity.getClientNm())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getSupplyCustomerCd(), otherEntity.getSupplyCustomerCd())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getDelivDt(), otherEntity.getDelivDt())) { return false; }
        if (!helpComparingValue(getShippingSlipNo(), otherEntity.getShippingSlipNo())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getTelNo(), otherEntity.getTelNo())) { return false; }
        if (!helpComparingValue(getLot(), otherEntity.getLot())) { return false; }
        if (!helpComparingValue(getLimitDt(), otherEntity.getLimitDt())) { return false; }
        if (!helpComparingValue(getPickingNum(), otherEntity.getPickingNum())) { return false; }
        if (!helpComparingValue(getPackingOutFlg(), otherEntity.getPackingOutFlg())) { return false; }
        if (!helpComparingValue(getPickingWorkNo(), otherEntity.getPickingWorkNo())) { return false; }
        if (!helpComparingValue(getTotalPrice(), otherEntity.getTotalPrice())) { return false; }
        if (!helpComparingValue(getTotalTax(), otherEntity.getTotalTax())) { return false; }
        if (!helpComparingValue(getPrice(), otherEntity.getPrice())) { return false; }
        if (!helpComparingValue(getTax(), otherEntity.getTax())) { return false; }
        if (!helpComparingValue(getShippingInstBId(), otherEntity.getShippingInstBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlDeliverySlipListPrint");
        result = xCH(result, getClientCd());
        result = xCH(result, getClientNm());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getSupplyCustomerCd());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getShippingDt());
        result = xCH(result, getDelivDt());
        result = xCH(result, getShippingSlipNo());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getTelNo());
        result = xCH(result, getLot());
        result = xCH(result, getLimitDt());
        result = xCH(result, getPickingNum());
        result = xCH(result, getPackingOutFlg());
        result = xCH(result, getPickingWorkNo());
        result = xCH(result, getTotalPrice());
        result = xCH(result, getTotalTax());
        result = xCH(result, getPrice());
        result = xCH(result, getTax());
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
        sb.append(c).append(getClientCd());
        sb.append(c).append(getClientNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getSupplyCustomerCd());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getDelivDt());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getTelNo());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getPickingNum());
        sb.append(c).append(getPackingOutFlg());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getTotalPrice());
        sb.append(c).append(getTotalTax());
        sb.append(c).append(getPrice());
        sb.append(c).append(getTax());
        sb.append(c).append(getShippingInstBId());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} <br>
     * 荷主CD
     * @return The value of the column 'CLIENT_CD'. (NullAllowed)
     */
    public String getClientCd() {
        return _clientCd;
    }

    /**
     * [set] CLIENT_CD: {VARCHAR(30), refers to m_client.CLIENT_CD} <br>
     * 荷主CD
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
     * [get] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_shipping_inst_h.SUPPLY_CUSTOMER_CD} <br>
     * 納品先CD
     * @return The value of the column 'SUPPLY_CUSTOMER_CD'. (NullAllowed)
     */
    public String getSupplyCustomerCd() {
        return _supplyCustomerCd;
    }

    /**
     * [set] SUPPLY_CUSTOMER_CD: {VARCHAR(30), refers to t_shipping_inst_h.SUPPLY_CUSTOMER_CD} <br>
     * 納品先CD
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
     * [get] SHIPPING_DT: {VARCHAR(8), refers to t_shipping_inst_h.SHIPPING_DT} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8), refers to t_shipping_inst_h.SHIPPING_DT} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] DELIV_DT: {VARCHAR(8), refers to t_shipping_inst_h.DELIV_DT} <br>
     * 納品指定日
     * @return The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public String getDelivDt() {
        return _delivDt;
    }

    /**
     * [set] DELIV_DT: {VARCHAR(8), refers to t_shipping_inst_h.DELIV_DT} <br>
     * 納品指定日
     * @param delivDt The value of the column 'DELIV_DT'. (NullAllowed)
     */
    public void setDelivDt(String delivDt) {
        __modifiedProperties.add("delivDt");
        this._delivDt = delivDt;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30), refers to t_shipping_inst_h.SHIPPING_SLIP_NO} <br>
     * WMS出荷伝票No.
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30), refers to t_shipping_inst_h.SHIPPING_SLIP_NO} <br>
     * WMS出荷伝票No.
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
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
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] TEL_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'TEL_NO'. (NullAllowed)
     */
    public String getTelNo() {
        return _telNo;
    }

    /**
     * [set] TEL_NO: {VARCHAR(30)} <br>
     * @param telNo The value of the column 'TEL_NO'. (NullAllowed)
     */
    public void setTelNo(String telNo) {
        __modifiedProperties.add("telNo");
        this._telNo = telNo;
    }

    /**
     * [get] LOT: {VARCHAR(30), refers to t_lot.LOT} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30), refers to t_lot.LOT} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8), refers to t_lot.LIMIT_DT} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8), refers to t_lot.LIMIT_DT} <br>
     * 期限日
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
     * [get] PACKING_OUT_FLG: {CHAR(1), refers to t_picking_r.PACKING_OUT_FLG, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ<br>
     * // cls(ListOutFlg)
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public String getPackingOutFlg() {
        return _packingOutFlg;
    }

    /**
     * [set] PACKING_OUT_FLG: {CHAR(1), refers to t_picking_r.PACKING_OUT_FLG, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ<br>
     * // cls(ListOutFlg)
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        __modifiedProperties.add("packingOutFlg");
        this._packingOutFlg = packingOutFlg;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30), refers to t_picking_h.PICKING_WORK_NO} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalPrice() {
        return _totalPrice;
    }

    /**
     * [set] TOTAL_PRICE: {DECIMAL(14, 4)} <br>
     * @param totalPrice The value of the column 'TOTAL_PRICE'. (NullAllowed)
     */
    public void setTotalPrice(java.math.BigDecimal totalPrice) {
        __modifiedProperties.add("totalPrice");
        this._totalPrice = totalPrice;
    }

    /**
     * [get] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTotalTax() {
        return _totalTax;
    }

    /**
     * [set] TOTAL_TAX: {DECIMAL(14, 4)} <br>
     * @param totalTax The value of the column 'TOTAL_TAX'. (NullAllowed)
     */
    public void setTotalTax(java.math.BigDecimal totalTax) {
        __modifiedProperties.add("totalTax");
        this._totalTax = totalTax;
    }

    /**
     * [get] PRICE: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getPrice() {
        return _price;
    }

    /**
     * [set] PRICE: {DECIMAL(14, 4)} <br>
     * @param price The value of the column 'PRICE'. (NullAllowed)
     */
    public void setPrice(java.math.BigDecimal price) {
        __modifiedProperties.add("price");
        this._price = price;
    }

    /**
     * [get] TAX: {DECIMAL(14, 4)} <br>
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public java.math.BigDecimal getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {DECIMAL(14, 4)} <br>
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(java.math.BigDecimal tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] SHIPPING_INST_B_ID: {BIGINT(20), refers to t_shipping_inst_b.SHIPPING_INST_B_ID} <br>
     * 出荷指示ボディID
     * @return The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public Long getShippingInstBId() {
        return _shippingInstBId;
    }

    /**
     * [set] SHIPPING_INST_B_ID: {BIGINT(20), refers to t_shipping_inst_b.SHIPPING_INST_B_ID} <br>
     * 出荷指示ボディID
     * @param shippingInstBId The value of the column 'SHIPPING_INST_B_ID'. (NullAllowed)
     */
    public void setShippingInstBId(Long shippingInstBId) {
        __modifiedProperties.add("shippingInstBId");
        this._shippingInstBId = shippingInstBId;
    }

}
