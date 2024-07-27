package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryListPrintReportData03. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * String salesname = entity.getSalesname();
 * String plantnm = entity.getPlantnm();
 * String plantCd = entity.getPlantCd();
 * String inventoryDt = entity.getInventoryDt();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String janCd = entity.getJanCd();
 * String productCategoryCls = entity.getProductCategoryCls();
 * java.math.BigDecimal evaluationUnitPrice = entity.getEvaluationUnitPrice();
 * entity.setChargeNum(chargeNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setSalesname(salesname);
 * entity.setPlantnm(plantnm);
 * entity.setPlantCd(plantCd);
 * entity.setInventoryDt(inventoryDt);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setJanCd(janCd);
 * entity.setProductCategoryCls(productCategoryCls);
 * entity.setEvaluationUnitPrice(evaluationUnitPrice);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryListPrintReportData03 extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** CHARGE_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _chargeNum;

    /** INVENTORY_NUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _inventoryNum;

    /** SALESNAME: {VARCHAR(243)} */
    protected String _salesname;

    /** PLANTNM: {VARCHAR(60)} */
    protected String _plantnm;

    /** PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} */
    protected String _plantCd;

    /** INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} */
    protected String _inventoryDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    protected String _centerAbbr;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    protected String _productNm;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    protected String _janCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} */
    protected String _productCategoryCls;

    /** EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} */
    protected java.math.BigDecimal _evaluationUnitPrice;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryListPrintReportData03Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryListPrintReportData03";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlInventoryListPrintReportData03) {
            BsSqlInventoryListPrintReportData03 other = (BsSqlInventoryListPrintReportData03)obj;
            if (!xSV(_chargeNum, other._chargeNum)) { return false; }
            if (!xSV(_inventoryNum, other._inventoryNum)) { return false; }
            if (!xSV(_salesname, other._salesname)) { return false; }
            if (!xSV(_plantnm, other._plantnm)) { return false; }
            if (!xSV(_plantCd, other._plantCd)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_productCategoryCls, other._productCategoryCls)) { return false; }
            if (!xSV(_evaluationUnitPrice, other._evaluationUnitPrice)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _chargeNum);
        hs = xCH(hs, _inventoryNum);
        hs = xCH(hs, _salesname);
        hs = xCH(hs, _plantnm);
        hs = xCH(hs, _plantCd);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _productCategoryCls);
        hs = xCH(hs, _evaluationUnitPrice);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_salesname));
        sb.append(dm).append(xfND(_plantnm));
        sb.append(dm).append(xfND(_plantCd));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productCategoryCls));
        sb.append(dm).append(xfND(_evaluationUnitPrice));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlInventoryListPrintReportData03 clone() {
        return (SqlInventoryListPrintReportData03)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] CHARGE_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {DECIMAL(36, 4)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] INVENTORY_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {DECIMAL(36, 4)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] SALESNAME: {VARCHAR(243)} <br>
     * @return The value of the column 'SALESNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesname() {
        checkSpecifiedProperty("salesname");
        return convertEmptyToNull(_salesname);
    }

    /**
     * [set] SALESNAME: {VARCHAR(243)} <br>
     * @param salesname The value of the column 'SALESNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesname(String salesname) {
        registerModifiedProperty("salesname");
        _salesname = salesname;
    }

    /**
     * [get] PLANTNM: {VARCHAR(60)} <br>
     * @return The value of the column 'PLANTNM'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantnm() {
        checkSpecifiedProperty("plantnm");
        return convertEmptyToNull(_plantnm);
    }

    /**
     * [set] PLANTNM: {VARCHAR(60)} <br>
     * @param plantnm The value of the column 'PLANTNM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantnm(String plantnm) {
        registerModifiedProperty("plantnm");
        _plantnm = plantnm;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantCd() {
        checkSpecifiedProperty("plantCd");
        return convertEmptyToNull(_plantCd);
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantCd(String plantCd) {
        registerModifiedProperty("plantCd");
        _plantCd = plantCd;
    }

    /**
     * [get] INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterCd() {
        checkSpecifiedProperty("centerCd");
        return convertEmptyToNull(_centerCd);
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterCd(String centerCd) {
        registerModifiedProperty("centerCd");
        _centerCd = centerCd;
    }

    /**
     * [get] CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} <br>
     * センタ略称
     * @return The value of the column 'CENTER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCenterAbbr() {
        checkSpecifiedProperty("centerAbbr");
        return convertEmptyToNull(_centerAbbr);
    }

    /**
     * [set] CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} <br>
     * センタ略称
     * @param centerAbbr The value of the column 'CENTER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterAbbr(String centerAbbr) {
        registerModifiedProperty("centerAbbr");
        _centerAbbr = centerAbbr;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} <br>
     * 品種区分
     * @return The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCategoryCls() {
        checkSpecifiedProperty("productCategoryCls");
        return convertEmptyToNull(_productCategoryCls);
    }

    /**
     * [set] PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} <br>
     * 品種区分
     * @param productCategoryCls The value of the column 'PRODUCT_CATEGORY_CLS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCategoryCls(String productCategoryCls) {
        registerModifiedProperty("productCategoryCls");
        _productCategoryCls = productCategoryCls;
    }

    /**
     * [get] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} <br>
     * 評価単価
     * @return The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getEvaluationUnitPrice() {
        checkSpecifiedProperty("evaluationUnitPrice");
        return _evaluationUnitPrice;
    }

    /**
     * [set] EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE} <br>
     * 評価単価
     * @param evaluationUnitPrice The value of the column 'EVALUATION_UNIT_PRICE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEvaluationUnitPrice(java.math.BigDecimal evaluationUnitPrice) {
        registerModifiedProperty("evaluationUnitPrice");
        _evaluationUnitPrice = evaluationUnitPrice;
    }
}
