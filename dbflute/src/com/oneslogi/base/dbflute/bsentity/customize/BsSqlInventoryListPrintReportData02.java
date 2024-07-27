package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInventoryListPrintReportData02. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_B_ID, LOT, LIMIT_DT, CHARGE_NUM, INVENTORY_NUM, PROD_DT, AREA_CD, CENTER_CD, CENTER_ABBR, LOCATION_CD, JAN_CD, DJAN_CD, PRODUCT_NM, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, DEPOSIT_CD, CUSTOMER_CD, CUSTOMER_NM, USER_NM_UPD, USER_CD_UPD, USER_NM, SCANCOUNT
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
 * Long inventoryBId = entity.getInventoryBId();
 * String lot = entity.getLot();
 * String limitDt = entity.getLimitDt();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * String prodDt = entity.getProdDt();
 * String areaCd = entity.getAreaCd();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String locationCd = entity.getLocationCd();
 * String janCd = entity.getJanCd();
 * String djanCd = entity.getDjanCd();
 * String productNm = entity.getProductNm();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String depositCd = entity.getDepositCd();
 * String customerCd = entity.getCustomerCd();
 * String customerNm = entity.getCustomerNm();
 * String userNmUpd = entity.getUserNmUpd();
 * String userCdUpd = entity.getUserCdUpd();
 * String userNm = entity.getUserNm();
 * Long scancount = entity.getScancount();
 * entity.setInventoryBId(inventoryBId);
 * entity.setLot(lot);
 * entity.setLimitDt(limitDt);
 * entity.setChargeNum(chargeNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setProdDt(prodDt);
 * entity.setAreaCd(areaCd);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setLocationCd(locationCd);
 * entity.setJanCd(janCd);
 * entity.setDjanCd(djanCd);
 * entity.setProductNm(productNm);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setDepositCd(depositCd);
 * entity.setCustomerCd(customerCd);
 * entity.setCustomerNm(customerNm);
 * entity.setUserNmUpd(userNmUpd);
 * entity.setUserCdUpd(userCdUpd);
 * entity.setUserNm(userNm);
 * entity.setScancount(scancount);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInventoryListPrintReportData02 extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} */
    protected Long _inventoryBId;

    /** LOT: {VARCHAR(30), refers to t_inventory_b.LOT} */
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} */
    protected String _limitDt;

    /** CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} */
    protected java.math.BigDecimal _chargeNum;

    /** INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} */
    protected java.math.BigDecimal _inventoryNum;

    /** PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} */
    protected String _prodDt;

    /** AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} */
    protected String _areaCd;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    protected String _centerCd;

    /** CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR} */
    protected String _centerAbbr;

    /** LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD} */
    protected String _locationCd;

    /** JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD} */
    protected String _janCd;

    /** DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} */
    protected String _djanCd;

    /** PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM} */
    protected String _productNm;

    /** SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} */
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} */
    protected String _tenhanshaNm2;

    /** DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} */
    protected String _depositCd;

    /** CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} */
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} */
    protected String _customerNm;

    /** USER_NM_UPD: {VARCHAR(60), refers to b_user.USER_NM} */
    protected String _userNmUpd;

    /** USER_CD_UPD: {VARCHAR(30), refers to b_user.USER_CD} */
    protected String _userCdUpd;

    /** USER_NM: {VARCHAR(60), refers to b_user.USER_NM} */
    protected String _userNm;

    /** SCANCOUNT: {BIGINT(21)} */
    protected Long _scancount;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInventoryListPrintReportData02Dbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInventoryListPrintReportData02";
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
        if (obj instanceof BsSqlInventoryListPrintReportData02) {
            BsSqlInventoryListPrintReportData02 other = (BsSqlInventoryListPrintReportData02)obj;
            if (!xSV(_inventoryBId, other._inventoryBId)) { return false; }
            if (!xSV(_lot, other._lot)) { return false; }
            if (!xSV(_limitDt, other._limitDt)) { return false; }
            if (!xSV(_chargeNum, other._chargeNum)) { return false; }
            if (!xSV(_inventoryNum, other._inventoryNum)) { return false; }
            if (!xSV(_prodDt, other._prodDt)) { return false; }
            if (!xSV(_areaCd, other._areaCd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_janCd, other._janCd)) { return false; }
            if (!xSV(_djanCd, other._djanCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_salesOrgCd, other._salesOrgCd)) { return false; }
            if (!xSV(_tenhanshaNm1, other._tenhanshaNm1)) { return false; }
            if (!xSV(_tenhanshaNm2, other._tenhanshaNm2)) { return false; }
            if (!xSV(_depositCd, other._depositCd)) { return false; }
            if (!xSV(_customerCd, other._customerCd)) { return false; }
            if (!xSV(_customerNm, other._customerNm)) { return false; }
            if (!xSV(_userNmUpd, other._userNmUpd)) { return false; }
            if (!xSV(_userCdUpd, other._userCdUpd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_scancount, other._scancount)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryBId);
        hs = xCH(hs, _lot);
        hs = xCH(hs, _limitDt);
        hs = xCH(hs, _chargeNum);
        hs = xCH(hs, _inventoryNum);
        hs = xCH(hs, _prodDt);
        hs = xCH(hs, _areaCd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _janCd);
        hs = xCH(hs, _djanCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _salesOrgCd);
        hs = xCH(hs, _tenhanshaNm1);
        hs = xCH(hs, _tenhanshaNm2);
        hs = xCH(hs, _depositCd);
        hs = xCH(hs, _customerCd);
        hs = xCH(hs, _customerNm);
        hs = xCH(hs, _userNmUpd);
        hs = xCH(hs, _userCdUpd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _scancount);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryBId));
        sb.append(dm).append(xfND(_lot));
        sb.append(dm).append(xfND(_limitDt));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_prodDt));
        sb.append(dm).append(xfND(_areaCd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_djanCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_depositCd));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_customerNm));
        sb.append(dm).append(xfND(_userNmUpd));
        sb.append(dm).append(xfND(_userCdUpd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_scancount));
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
    public SqlInventoryListPrintReportData02 clone() {
        return (SqlInventoryListPrintReportData02)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryBId() {
        checkSpecifiedProperty("inventoryBId");
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryBId(Long inventoryBId) {
        registerModifiedProperty("inventoryBId");
        _inventoryBId = inventoryBId;
    }

    /**
     * [get] LOT: {VARCHAR(30), refers to t_inventory_b.LOT} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot() {
        checkSpecifiedProperty("lot");
        return convertEmptyToNull(_lot);
    }

    /**
     * [set] LOT: {VARCHAR(30), refers to t_inventory_b.LOT} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot(String lot) {
        registerModifiedProperty("lot");
        _lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getLimitDt() {
        checkSpecifiedProperty("limitDt");
        return convertEmptyToNull(_limitDt);
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLimitDt(String limitDt) {
        registerModifiedProperty("limitDt");
        _limitDt = limitDt;
    }

    /**
     * [get] CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} <br>
     * 引当可能数
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM} <br>
     * 引当可能数
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getProdDt() {
        checkSpecifiedProperty("prodDt");
        return convertEmptyToNull(_prodDt);
    }

    /**
     * [set] PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProdDt(String prodDt) {
        registerModifiedProperty("prodDt");
        _prodDt = prodDt;
    }

    /**
     * [get] AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} <br>
     * エリア
     * @return The value of the column 'AREA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getAreaCd() {
        checkSpecifiedProperty("areaCd");
        return convertEmptyToNull(_areaCd);
    }

    /**
     * [set] AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD} <br>
     * エリア
     * @param areaCd The value of the column 'AREA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAreaCd(String areaCd) {
        registerModifiedProperty("areaCd");
        _areaCd = areaCd;
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
     * [get] DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} <br>
     * 預りJANCD
     * @return The value of the column 'DJAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDjanCd() {
        checkSpecifiedProperty("djanCd");
        return convertEmptyToNull(_djanCd);
    }

    /**
     * [set] DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD} <br>
     * 預りJANCD
     * @param djanCd The value of the column 'DJAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDjanCd(String djanCd) {
        registerModifiedProperty("djanCd");
        _djanCd = djanCd;
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
     * [get] SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} <br>
     * 店販社名称１
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1} <br>
     * 店販社名称１
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} <br>
     * 店販社名称２
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2} <br>
     * 店販社名称２
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositCd() {
        checkSpecifiedProperty("depositCd");
        return convertEmptyToNull(_depositCd);
    }

    /**
     * [set] DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCd(String depositCd) {
        registerModifiedProperty("depositCd");
        _depositCd = depositCd;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerNm() {
        checkSpecifiedProperty("customerNm");
        return convertEmptyToNull(_customerNm);
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerNm(String customerNm) {
        registerModifiedProperty("customerNm");
        _customerNm = customerNm;
    }

    /**
     * [get] USER_NM_UPD: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @return The value of the column 'USER_NM_UPD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNmUpd() {
        checkSpecifiedProperty("userNmUpd");
        return convertEmptyToNull(_userNmUpd);
    }

    /**
     * [set] USER_NM_UPD: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @param userNmUpd The value of the column 'USER_NM_UPD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNmUpd(String userNmUpd) {
        registerModifiedProperty("userNmUpd");
        _userNmUpd = userNmUpd;
    }

    /**
     * [get] USER_CD_UPD: {VARCHAR(30), refers to b_user.USER_CD} <br>
     * ユーザCD
     * @return The value of the column 'USER_CD_UPD'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserCdUpd() {
        checkSpecifiedProperty("userCdUpd");
        return convertEmptyToNull(_userCdUpd);
    }

    /**
     * [set] USER_CD_UPD: {VARCHAR(30), refers to b_user.USER_CD} <br>
     * ユーザCD
     * @param userCdUpd The value of the column 'USER_CD_UPD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserCdUpd(String userCdUpd) {
        registerModifiedProperty("userCdUpd");
        _userCdUpd = userCdUpd;
    }

    /**
     * [get] USER_NM: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @return The value of the column 'USER_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserNm() {
        checkSpecifiedProperty("userNm");
        return convertEmptyToNull(_userNm);
    }

    /**
     * [set] USER_NM: {VARCHAR(60), refers to b_user.USER_NM} <br>
     * ユーザ名
     * @param userNm The value of the column 'USER_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserNm(String userNm) {
        registerModifiedProperty("userNm");
        _userNm = userNm;
    }

    /**
     * [get] SCANCOUNT: {BIGINT(21)} <br>
     * @return The value of the column 'SCANCOUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Long getScancount() {
        checkSpecifiedProperty("scancount");
        return _scancount;
    }

    /**
     * [set] SCANCOUNT: {BIGINT(21)} <br>
     * @param scancount The value of the column 'SCANCOUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setScancount(Long scancount) {
        registerModifiedProperty("scancount");
        _scancount = scancount;
    }
}
