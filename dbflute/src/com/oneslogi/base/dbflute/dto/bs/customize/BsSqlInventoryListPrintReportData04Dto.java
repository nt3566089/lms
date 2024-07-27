package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryListPrintReportData04. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SUMINVNUM, PRODUCT_CD, LOCATION_CD, INVENTORY_DT, CENTER_CD, CENTER_ABBR, PRODUCT_NM, JAN_CD, PRODUCT_CATEGORY_CLS
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
public abstract class BsSqlInventoryListPrintReportData04Dto implements Serializable {

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
    /** SUMINVNUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _suminvnum;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} */
    @JsonKey
    protected String _locationCd;

    /** INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} */
    @JsonKey
    protected String _inventoryDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    @JsonKey
    protected String _centerAbbr;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    @JsonKey
    protected String _productNm;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} */
    @JsonKey
    protected String _productCategoryCls;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryListPrintReportData04Dto() {
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
        if (other == null || !(other instanceof BsSqlInventoryListPrintReportData04Dto)) { return false; }
        final BsSqlInventoryListPrintReportData04Dto otherEntity = (BsSqlInventoryListPrintReportData04Dto)other;
        if (!helpComparingValue(getSuminvnum(), otherEntity.getSuminvnum())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getProductCategoryCls(), otherEntity.getProductCategoryCls())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryListPrintReportData04");
        result = xCH(result, getSuminvnum());
        result = xCH(result, getProductCd());
        result = xCH(result, getLocationCd());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getProductNm());
        result = xCH(result, getJanCd());
        result = xCH(result, getProductCategoryCls());
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
        sb.append(c).append(getSuminvnum());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductCategoryCls());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUMINVNUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'SUMINVNUM'. (NullAllowed)
     */
    public java.math.BigDecimal getSuminvnum() {
        return _suminvnum;
    }

    /**
     * [set] SUMINVNUM: {DECIMAL(36, 4)} <br>
     * @param suminvnum The value of the column 'SUMINVNUM'. (NullAllowed)
     */
    public void setSuminvnum(java.math.BigDecimal suminvnum) {
        __modifiedProperties.add("suminvnum");
        this._suminvnum = suminvnum;
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
     * [get] LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} <br>
     * センタ略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public String getCenterAbbr() {
        return _centerAbbr;
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} <br>
     * センタ略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed)
     */
    public void setCenterAbbr(String centerAbbr) {
        __modifiedProperties.add("centerAbbr");
        this._centerAbbr = centerAbbr;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} <br>
     * 品種区分
     * @return The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed)
     */
    public String getProductCategoryCls() {
        return _productCategoryCls;
    }

    /**
     * [set] PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} <br>
     * 品種区分
     * @param productCategoryCls The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed)
     */
    public void setProductCategoryCls(String productCategoryCls) {
        __modifiedProperties.add("productCategoryCls");
        this._productCategoryCls = productCategoryCls;
    }

}
