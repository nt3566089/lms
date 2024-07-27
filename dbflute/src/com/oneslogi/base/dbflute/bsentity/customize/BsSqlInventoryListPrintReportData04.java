package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryListPrintReportData04. <br>
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
 * java.math.BigDecimal suminvnum = entity.getSuminvnum();
 * String productCd = entity.getProductCd();
 * String locationCd = entity.getLocationCd();
 * String inventoryDt = entity.getInventoryDt();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String productNm = entity.getProductNm();
 * String janCd = entity.getJanCd();
 * String productCategoryCls = entity.getProductCategoryCls();
 * entity.setSuminvnum(suminvnum);
 * entity.setProductCd(productCd);
 * entity.setLocationCd(locationCd);
 * entity.setInventoryDt(inventoryDt);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setProductNm(productNm);
 * entity.setJanCd(janCd);
 * entity.setProductCategoryCls(productCategoryCls);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryListPrintReportData04 extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SUMINVNUM: {DECIMAL(36, 4)} */
    protected java.math.BigDecimal _suminvnum;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    protected String _productCd;

    /** LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} */
    protected String _locationCd;

    /** INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT} */
    protected String _inventoryDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    protected String _centerAbbr;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    protected String _productNm;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    protected String _janCd;

    /** PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS} */
    protected String _productCategoryCls;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryListPrintReportData04Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryListPrintReportData04";
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
        if (obj instanceof BsSqlInventoryListPrintReportData04) {
            BsSqlInventoryListPrintReportData04 other = (BsSqlInventoryListPrintReportData04)obj;
            if (!xSV(_suminvnum, other._suminvnum)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_productCategoryCls, other._productCategoryCls)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _suminvnum);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _productCategoryCls);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_suminvnum));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_productCategoryCls));
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
    public SqlInventoryListPrintReportData04 clone() {
        return (SqlInventoryListPrintReportData04)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SUMINVNUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'SUMINVNUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSuminvnum() {
        checkSpecifiedProperty("suminvnum");
        return _suminvnum;
    }

    /**
     * [set] SUMINVNUM: {DECIMAL(36, 4)} <br>
     * @param suminvnum The value of the column 'SUMINVNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuminvnum(java.math.BigDecimal suminvnum) {
        registerModifiedProperty("suminvnum");
        _suminvnum = suminvnum;
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
     * [get] LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
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
}
