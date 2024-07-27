package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlInventoryListPrintReportData03. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CHARGE_NUM, INVENTORY_NUM, SALESNAME, PLANTNM, PLANT_CD, INVENTORY_DT, CENTER_CD, CENTER_ABBR, PRODUCT_CD, PRODUCT_NM, JAN_CD, PRODUCT_CATEGORY_CLS, EVALUATION_UNIT_PRICE
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
public abstract class BsSqlInventoryListPrintReportData03Dto implements Serializable {

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
    /** CHARGE_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _chargeNum;

    /** INVENTORY_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** SALESNAME: {VARCHAR(243)} */
    @JsonKey
    protected String _salesname;

    /** PLANTNM: {VARCHAR(60)} */
    @JsonKey
    protected String _plantnm;

    /** PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} */
    @JsonKey
    protected String _plantCd;

    /** INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} */
    @JsonKey
    protected String _inventoryDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    @JsonKey
    protected String _centerAbbr;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    @JsonKey
    protected String _productNm;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} */
    @JsonKey
    protected String _productCategoryCls;

    /** EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} */
    @JsonKey
    protected java.math.BigDecimal _evaluationUnitPrice;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlInventoryListPrintReportData03Dto() {
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
        if (other == null || !(other instanceof BsSqlInventoryListPrintReportData03Dto)) { return false; }
        final BsSqlInventoryListPrintReportData03Dto otherEntity = (BsSqlInventoryListPrintReportData03Dto)other;
        if (!helpComparingValue(getChargeNum(), otherEntity.getChargeNum())) { return false; }
        if (!helpComparingValue(getInventoryNum(), otherEntity.getInventoryNum())) { return false; }
        if (!helpComparingValue(getSalesname(), otherEntity.getSalesname())) { return false; }
        if (!helpComparingValue(getPlantnm(), otherEntity.getPlantnm())) { return false; }
        if (!helpComparingValue(getPlantCd(), otherEntity.getPlantCd())) { return false; }
        if (!helpComparingValue(getInventoryDt(), otherEntity.getInventoryDt())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterAbbr(), otherEntity.getCenterAbbr())) { return false; }
        if (!helpComparingValue(getProductCd(), otherEntity.getProductCd())) { return false; }
        if (!helpComparingValue(getProductNm(), otherEntity.getProductNm())) { return false; }
        if (!helpComparingValue(getJanCd(), otherEntity.getJanCd())) { return false; }
        if (!helpComparingValue(getProductCategoryCls(), otherEntity.getProductCategoryCls())) { return false; }
        if (!helpComparingValue(getEvaluationUnitPrice(), otherEntity.getEvaluationUnitPrice())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlInventoryListPrintReportData03");
        result = xCH(result, getChargeNum());
        result = xCH(result, getInventoryNum());
        result = xCH(result, getSalesname());
        result = xCH(result, getPlantnm());
        result = xCH(result, getPlantCd());
        result = xCH(result, getInventoryDt());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterAbbr());
        result = xCH(result, getProductCd());
        result = xCH(result, getProductNm());
        result = xCH(result, getJanCd());
        result = xCH(result, getProductCategoryCls());
        result = xCH(result, getEvaluationUnitPrice());
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
        sb.append(c).append(getChargeNum());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getSalesname());
        sb.append(c).append(getPlantnm());
        sb.append(c).append(getPlantCd());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterAbbr());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductCategoryCls());
        sb.append(c).append(getEvaluationUnitPrice());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CHARGE_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getChargeNum() {
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {DECIMAL(36, 4)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        __modifiedProperties.add("chargeNum");
        this._chargeNum = chargeNum;
    }

    /**
     * [get] INVENTORY_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {DECIMAL(36, 4)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] SALESNAME: {VARCHAR(243)} <br>
     * @return The value of the column 'SALESNAME'. (NullAllowed)
     */
    public String getSalesname() {
        return _salesname;
    }

    /**
     * [set] SALESNAME: {VARCHAR(243)} <br>
     * @param salesname The value of the column 'SALESNAME'. (NullAllowed)
     */
    public void setSalesname(String salesname) {
        __modifiedProperties.add("salesname");
        this._salesname = salesname;
    }

    /**
     * [get] PLANTNM: {VARCHAR(60)} <br>
     * @return The value of the column 'PLANTNM'. (NullAllowed)
     */
    public String getPlantnm() {
        return _plantnm;
    }

    /**
     * [set] PLANTNM: {VARCHAR(60)} <br>
     * @param plantnm The value of the column 'PLANTNM'. (NullAllowed)
     */
    public void setPlantnm(String plantnm) {
        __modifiedProperties.add("plantnm");
        this._plantnm = plantnm;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public String getPlantCd() {
        return _plantCd;
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public void setPlantCd(String plantCd) {
        __modifiedProperties.add("plantCd");
        this._plantCd = plantCd;
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

    /**
     * [get] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} <br>
     * 評価単価
     * @return The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed)
     */
    public java.math.BigDecimal getEvaluationUnitPrice() {
        return _evaluationUnitPrice;
    }

    /**
     * [set] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} <br>
     * 評価単価
     * @param evaluationUnitPrice The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed)
     */
    public void setEvaluationUnitPrice(java.math.BigDecimal evaluationUnitPrice) {
        __modifiedProperties.add("evaluationUnitPrice");
        this._evaluationUnitPrice = evaluationUnitPrice;
    }

}
