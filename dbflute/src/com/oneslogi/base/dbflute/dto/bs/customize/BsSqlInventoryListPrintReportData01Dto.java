package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryListPrintReportData01. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, LOT, LIMIT_DT, CHARGE_NUM, INVENTORY_NUM, PROD_DT, AREA_CD, DEPOSIT_CD, CUSTOMER_CD, CUSTOMER_NM, CENTER_CD, CENTER_ABBR, LOCATION_CD, JAN_CD, DJAN_CD, PRODUCT_NM, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, USER_NM, SCANCOUNT
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
public abstract class BsSqlInventoryListPrintReportData01Dto implements Serializable {

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
    /** INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} */
    @JsonKey
    protected Long _inventoryBId;

    /** LOT: {VARCHAR(30), refers to t_inventory_b.LOT} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} */
    @JsonKey
    protected String _limitDt;

    /** CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} */
    @JsonKey
    protected String _prodDt;

    /** AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} */
    @JsonKey
    protected String _areaCd;

    /** DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} */
    @JsonKey
    protected String _depositCd;

    /** CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    @JsonKey
    protected String _customerNm;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    @JsonKey
    protected String _centerAbbr;

    /** LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} */
    @JsonKey
    protected String _locationCd;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    @JsonKey
    protected String _janCd;

    /** DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} */
    @JsonKey
    protected String _djanCd;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    @JsonKey
    protected String _productNm;

    /** SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} */
    @JsonKey
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} */
    @JsonKey
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} */
    @JsonKey
    protected String _tenhanshaNm2;

    /** USER_NM: {VARCHAR(60), refers to b_user.USER_NM} */
    @JsonKey
    protected String _userNm;

    /** SCANCOUNT: {BIGINT(21)} */
    @JsonKey
    protected Long _scancount;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryListPrintReportData01Dto() {
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
        if (other == null || !(other instanceof BsSqlInventoryListPrintReportData01Dto)) { return false; }
        final BsSqlInventoryListPrintReportData01Dto otherEntity = (BsSqlInventoryListPrintReportData01Dto)other;
        if (!helpComparingValue(getInventoryBId(), otherEntity.getInventoryBId())) { return false; }
        if (!helpComparingValue(getLot(), otherEntity.getLot())) { return false; }
        if (!helpComparingValue(getLimitDt(), otherEntity.getLimitDt())) { return false; }
        if (!helpComparingValue(getChargeNum(), otherEntity.getChargeNum())) { return false; }
        if (!helpComparingValue(getInventoryNum(), otherEntity.getInventoryNum())) { return false; }
        if (!helpComparingValue(getProdDt(), otherEntity.getProdDt())) { return false; }
        if (!helpComparingValue(getAreaCd(), otherEntity.getAreaCd())) { return false; }
        if (!helpComparingValue(getDepositCd(), otherEntity.getDepositCd())) { return false; }
        if (!helpComparingValue(getCustomerCd(), otherEntity.getCustomerCd())) { return false; }
        if (!helpComparingValue(getCustomerNm(), otherEntity.getCustomerNm())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getLocationCd(), otherEntity.getLocationCd())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getDjanCd(), otherEntity.getDjanCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getSalesOrgCd(), otherEntity.getSalesOrgCd())) { return false; }
        if (!helpComparingValue(getTenhanshaNm1(), otherEntity.getTenhanshaNm1())) { return false; }
        if (!helpComparingValue(getTenhanshaNm2(), otherEntity.getTenhanshaNm2())) { return false; }
        if (!helpComparingValue(getUserNm(), otherEntity.getUserNm())) { return false; }
        if (!helpComparingValue(getScancount(), otherEntity.getScancount())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryListPrintReportData01");
        result = xCH(result, getInventoryBId());
        result = xCH(result, getLot());
        result = xCH(result, getLimitDt());
        result = xCH(result, getChargeNum());
        result = xCH(result, getInventoryNum());
        result = xCH(result, getProdDt());
        result = xCH(result, getAreaCd());
        result = xCH(result, getDepositCd());
        result = xCH(result, getCustomerCd());
        result = xCH(result, getCustomerNm());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getLocationCd());
        result = xCH(result, getJanCd());
        result = xCH(result, getDjanCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getSalesOrgCd());
        result = xCH(result, getTenhanshaNm1());
        result = xCH(result, getTenhanshaNm2());
        result = xCH(result, getUserNm());
        result = xCH(result, getScancount());
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
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getAreaCd());
        sb.append(c).append(getDepositCd());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getDjanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getTenhanshaNm1());
        sb.append(c).append(getTenhanshaNm2());
        sb.append(c).append(getUserNm());
        sb.append(c).append(getScancount());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] LOT: {VARCHAR(30), refers to t_inventory_b.LOT} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30), refers to t_inventory_b.LOT} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} <br>
     * エリア
     * @return The value of the column 'AREA_CD'. (NullAllowed)
     */
    public String getAreaCd() {
        return _areaCd;
    }

    /**
     * [set] AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} <br>
     * エリア
     * @param areaCd The value of the column 'AREA_CD'. (NullAllowed)
     */
    public void setAreaCd(String areaCd) {
        __modifiedProperties.add("areaCd");
        this._areaCd = areaCd;
    }

    /**
     * [get] DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public String getDepositCd() {
        return _depositCd;
    }

    /**
     * [set] DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public void setDepositCd(String depositCd) {
        __modifiedProperties.add("depositCd");
        this._depositCd = depositCd;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
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
     * [get] DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} <br>
     * 預りJANCD
     * @return The value of the column 'DJAN_CD'. (NullAllowed)
     */
    public String getDjanCd() {
        return _djanCd;
    }

    /**
     * [set] DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} <br>
     * 預りJANCD
     * @param djanCd The value of the column 'DJAN_CD'. (NullAllowed)
     */
    public void setDjanCd(String djanCd) {
        __modifiedProperties.add("djanCd");
        this._djanCd = djanCd;
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
     * [get] SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} <br>
     * 店販社名称１
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public String getTenhanshaNm1() {
        return _tenhanshaNm1;
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} <br>
     * 店販社名称１
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        __modifiedProperties.add("tenhanshaNm1");
        this._tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} <br>
     * 店販社名称２
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public String getTenhanshaNm2() {
        return _tenhanshaNm2;
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} <br>
     * 店販社名称２
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        __modifiedProperties.add("tenhanshaNm2");
        this._tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] USER_NM: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
    }

    /**
     * [get] SCANCOUNT: {BIGINT(21)} <br>
     * @return The value of the column 'SCANCOUNT'. (NullAllowed)
     */
    public Long getScancount() {
        return _scancount;
    }

    /**
     * [set] SCANCOUNT: {BIGINT(21)} <br>
     * @param scancount The value of the column 'SCANCOUNT'. (NullAllowed)
     */
    public void setScancount(Long scancount) {
        __modifiedProperties.add("scancount");
        this._scancount = scancount;
    }

}
