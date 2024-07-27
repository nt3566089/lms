package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of m_sales_org as TABLE. <br>
 * 販売組織マスタ
 * <pre>
 * [primary-key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, LP_SEND_FLG, WMS_SEND_FLG, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     m_base_sales_org, m_carrier_decision, m_customer_picking, m_deposit_product, m_koguchi_delivery, t_inventory_b, t_shipping_inst_h
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mBaseSalesOrgList, mCarrierDecisionList, mCustomerPickingList, mDepositProductList, mKoguchiDeliveryList, tInventoryBList, tShippingInstHBySalesOrgList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long salesOrgId = entity.getSalesOrgId();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String purchaseOrgCd = entity.getPurchaseOrgCd();
 * String tenhanshaCd = entity.getTenhanshaCd();
 * String tenhanshaNm1 = entity.getTenhanshaNm1();
 * String tenhanshaNm2 = entity.getTenhanshaNm2();
 * String tenhanshaZipCd = entity.getTenhanshaZipCd();
 * String tenhanshaPrefecture = entity.getTenhanshaPrefecture();
 * String tenhanshaAddress1 = entity.getTenhanshaAddress1();
 * String tenhanshaAddress2 = entity.getTenhanshaAddress2();
 * String tenhanshaTelNo = entity.getTenhanshaTelNo();
 * String tenhanshaFaxNo = entity.getTenhanshaFaxNo();
 * String plantNormal = entity.getPlantNormal();
 * String plantDeposit = entity.getPlantDeposit();
 * String lpSendFlg = entity.getLpSendFlg();
 * String wmsSendFlg = entity.getWmsSendFlg();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSalesOrgId(salesOrgId);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setPurchaseOrgCd(purchaseOrgCd);
 * entity.setTenhanshaCd(tenhanshaCd);
 * entity.setTenhanshaNm1(tenhanshaNm1);
 * entity.setTenhanshaNm2(tenhanshaNm2);
 * entity.setTenhanshaZipCd(tenhanshaZipCd);
 * entity.setTenhanshaPrefecture(tenhanshaPrefecture);
 * entity.setTenhanshaAddress1(tenhanshaAddress1);
 * entity.setTenhanshaAddress2(tenhanshaAddress2);
 * entity.setTenhanshaTelNo(tenhanshaTelNo);
 * entity.setTenhanshaFaxNo(tenhanshaFaxNo);
 * entity.setPlantNormal(plantNormal);
 * entity.setPlantDeposit(plantDeposit);
 * entity.setLpSendFlg(lpSendFlg);
 * entity.setWmsSendFlg(wmsSendFlg);
 * entity.setSpareStr(spareStr);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMSalesOrg extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {UQ, VARCHAR(30)} */
    protected String _salesOrgCd;

    /** PURCHASE_ORG_CD: {VARCHAR(30)} */
    protected String _purchaseOrgCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    protected String _tenhanshaCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    protected String _tenhanshaNm2;

    /** TENHANSHA_ZIP_CD: {VARCHAR(30)} */
    protected String _tenhanshaZipCd;

    /** TENHANSHA_PREFECTURE: {VARCHAR(60)} */
    protected String _tenhanshaPrefecture;

    /** TENHANSHA_ADDRESS1: {VARCHAR(60)} */
    protected String _tenhanshaAddress1;

    /** TENHANSHA_ADDRESS2: {VARCHAR(60)} */
    protected String _tenhanshaAddress2;

    /** TENHANSHA_TEL_NO: {VARCHAR(30)} */
    protected String _tenhanshaTelNo;

    /** TENHANSHA_FAX_NO: {VARCHAR(30)} */
    protected String _tenhanshaFaxNo;

    /** PLANT_NORMAL: {VARCHAR(30)} */
    protected String _plantNormal;

    /** PLANT_DEPOSIT: {VARCHAR(30)} */
    protected String _plantDeposit;

    /** LP_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _lpSendFlg;

    /** WMS_SEND_FLG: {CHAR(1), default=[0]} */
    protected String _wmsSendFlg;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "m_sales_org";
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
        if (_salesOrgId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param salesOrgCd : UQ, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String salesOrgCd) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("salesOrgCd");
        setSalesOrgCd(salesOrgCd);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'. */
    protected List<MBaseSalesOrg> _mBaseSalesOrgList;

    /**
     * [get] m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * @return The entity list of referrer property 'MBaseSalesOrgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MBaseSalesOrg> getMBaseSalesOrgList() {
        if (_mBaseSalesOrgList == null) { _mBaseSalesOrgList = newReferrerList(); }
        return _mBaseSalesOrgList;
    }

    /**
     * [set] m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * @param mBaseSalesOrgList The entity list of referrer property 'MBaseSalesOrgList'. (NullAllowed)
     */
    public void setMBaseSalesOrgList(List<MBaseSalesOrg> mBaseSalesOrgList) {
        _mBaseSalesOrgList = mBaseSalesOrgList;
    }

    /** m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'. */
    protected List<MCarrierDecision> _mCarrierDecisionList;

    /**
     * [get] m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * @return The entity list of referrer property 'MCarrierDecisionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCarrierDecision> getMCarrierDecisionList() {
        if (_mCarrierDecisionList == null) { _mCarrierDecisionList = newReferrerList(); }
        return _mCarrierDecisionList;
    }

    /**
     * [set] m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * @param mCarrierDecisionList The entity list of referrer property 'MCarrierDecisionList'. (NullAllowed)
     */
    public void setMCarrierDecisionList(List<MCarrierDecision> mCarrierDecisionList) {
        _mCarrierDecisionList = mCarrierDecisionList;
    }

    /** m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'. */
    protected List<MCustomerPicking> _mCustomerPickingList;

    /**
     * [get] m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * @return The entity list of referrer property 'MCustomerPickingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MCustomerPicking> getMCustomerPickingList() {
        if (_mCustomerPickingList == null) { _mCustomerPickingList = newReferrerList(); }
        return _mCustomerPickingList;
    }

    /**
     * [set] m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * @param mCustomerPickingList The entity list of referrer property 'MCustomerPickingList'. (NullAllowed)
     */
    public void setMCustomerPickingList(List<MCustomerPicking> mCustomerPickingList) {
        _mCustomerPickingList = mCustomerPickingList;
    }

    /** m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'. */
    protected List<MDepositProduct> _mDepositProductList;

    /**
     * [get] m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * @return The entity list of referrer property 'MDepositProductList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MDepositProduct> getMDepositProductList() {
        if (_mDepositProductList == null) { _mDepositProductList = newReferrerList(); }
        return _mDepositProductList;
    }

    /**
     * [set] m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * @param mDepositProductList The entity list of referrer property 'MDepositProductList'. (NullAllowed)
     */
    public void setMDepositProductList(List<MDepositProduct> mDepositProductList) {
        _mDepositProductList = mDepositProductList;
    }

    /** m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'. */
    protected List<MKoguchiDelivery> _mKoguchiDeliveryList;

    /**
     * [get] m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * @return The entity list of referrer property 'MKoguchiDeliveryList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MKoguchiDelivery> getMKoguchiDeliveryList() {
        if (_mKoguchiDeliveryList == null) { _mKoguchiDeliveryList = newReferrerList(); }
        return _mKoguchiDeliveryList;
    }

    /**
     * [set] m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * @param mKoguchiDeliveryList The entity list of referrer property 'MKoguchiDeliveryList'. (NullAllowed)
     */
    public void setMKoguchiDeliveryList(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        _mKoguchiDeliveryList = mKoguchiDeliveryList;
    }

    /** t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'. */
    protected List<TInventoryB> _tInventoryBList;

    /**
     * [get] t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * @return The entity list of referrer property 'TInventoryBList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TInventoryB> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = newReferrerList(); }
        return _tInventoryBList;
    }

    /**
     * [set] t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * @param tInventoryBList The entity list of referrer property 'TInventoryBList'. (NullAllowed)
     */
    public void setTInventoryBList(List<TInventoryB> tInventoryBList) {
        _tInventoryBList = tInventoryBList;
    }

    /** t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHBySalesOrgList'. */
    protected List<TShippingInstH> _tShippingInstHBySalesOrgList;

    /**
     * [get] t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHBySalesOrgList'.
     * @return The entity list of referrer property 'TShippingInstHBySalesOrgList'. (NotNull: even if no loading, returns empty list)
     */
    public List<TShippingInstH> getTShippingInstHBySalesOrgList() {
        if (_tShippingInstHBySalesOrgList == null) { _tShippingInstHBySalesOrgList = newReferrerList(); }
        return _tShippingInstHBySalesOrgList;
    }

    /**
     * [set] t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHBySalesOrgList'.
     * @param tShippingInstHBySalesOrgList The entity list of referrer property 'TShippingInstHBySalesOrgList'. (NullAllowed)
     */
    public void setTShippingInstHBySalesOrgList(List<TShippingInstH> tShippingInstHBySalesOrgList) {
        _tShippingInstHBySalesOrgList = tShippingInstHBySalesOrgList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMSalesOrg) {
            BsMSalesOrg other = (BsMSalesOrg)obj;
            if (!xSV(_salesOrgId, other._salesOrgId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _salesOrgId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_mBaseSalesOrgList != null) { for (MBaseSalesOrg et : _mBaseSalesOrgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mBaseSalesOrgList")); } } }
        if (_mCarrierDecisionList != null) { for (MCarrierDecision et : _mCarrierDecisionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCarrierDecisionList")); } } }
        if (_mCustomerPickingList != null) { for (MCustomerPicking et : _mCustomerPickingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mCustomerPickingList")); } } }
        if (_mDepositProductList != null) { for (MDepositProduct et : _mDepositProductList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mDepositProductList")); } } }
        if (_mKoguchiDeliveryList != null) { for (MKoguchiDelivery et : _mKoguchiDeliveryList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "mKoguchiDeliveryList")); } } }
        if (_tInventoryBList != null) { for (TInventoryB et : _tInventoryBList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tInventoryBList")); } } }
        if (_tShippingInstHBySalesOrgList != null) { for (TShippingInstH et : _tShippingInstHBySalesOrgList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tShippingInstHBySalesOrgList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_salesOrgId));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_purchaseOrgCd));
        sb.append(dm).append(xfND(_tenhanshaCd));
        sb.append(dm).append(xfND(_tenhanshaNm1));
        sb.append(dm).append(xfND(_tenhanshaNm2));
        sb.append(dm).append(xfND(_tenhanshaZipCd));
        sb.append(dm).append(xfND(_tenhanshaPrefecture));
        sb.append(dm).append(xfND(_tenhanshaAddress1));
        sb.append(dm).append(xfND(_tenhanshaAddress2));
        sb.append(dm).append(xfND(_tenhanshaTelNo));
        sb.append(dm).append(xfND(_tenhanshaFaxNo));
        sb.append(dm).append(xfND(_plantNormal));
        sb.append(dm).append(xfND(_plantDeposit));
        sb.append(dm).append(xfND(_lpSendFlg));
        sb.append(dm).append(xfND(_wmsSendFlg));
        sb.append(dm).append(xfND(_spareStr));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_mBaseSalesOrgList != null && !_mBaseSalesOrgList.isEmpty())
        { sb.append(dm).append("mBaseSalesOrgList"); }
        if (_mCarrierDecisionList != null && !_mCarrierDecisionList.isEmpty())
        { sb.append(dm).append("mCarrierDecisionList"); }
        if (_mCustomerPickingList != null && !_mCustomerPickingList.isEmpty())
        { sb.append(dm).append("mCustomerPickingList"); }
        if (_mDepositProductList != null && !_mDepositProductList.isEmpty())
        { sb.append(dm).append("mDepositProductList"); }
        if (_mKoguchiDeliveryList != null && !_mKoguchiDeliveryList.isEmpty())
        { sb.append(dm).append("mKoguchiDeliveryList"); }
        if (_tInventoryBList != null && !_tInventoryBList.isEmpty())
        { sb.append(dm).append("tInventoryBList"); }
        if (_tShippingInstHBySalesOrgList != null && !_tShippingInstHBySalesOrgList.isEmpty())
        { sb.append(dm).append("tShippingInstHBySalesOrgList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MSalesOrg clone() {
        return (MSalesOrg)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSalesOrgId() {
        checkSpecifiedProperty("salesOrgId");
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSalesOrgId(Long salesOrgId) {
        registerModifiedProperty("salesOrgId");
        _salesOrgId = salesOrgId;
    }

    /**
     * [get] SALES_ORG_CD: {UQ, VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {UQ, VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] PURCHASE_ORG_CD: {VARCHAR(30)} <br>
     * 購買組織CD
     * @return The value of the column 'PURCHASE_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPurchaseOrgCd() {
        checkSpecifiedProperty("purchaseOrgCd");
        return convertEmptyToNull(_purchaseOrgCd);
    }

    /**
     * [set] PURCHASE_ORG_CD: {VARCHAR(30)} <br>
     * 購買組織CD
     * @param purchaseOrgCd The value of the column 'PURCHASE_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPurchaseOrgCd(String purchaseOrgCd) {
        registerModifiedProperty("purchaseOrgCd");
        _purchaseOrgCd = purchaseOrgCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaCd() {
        checkSpecifiedProperty("tenhanshaCd");
        return convertEmptyToNull(_tenhanshaCd);
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        registerModifiedProperty("tenhanshaCd");
        _tenhanshaCd = tenhanshaCd;
    }

    /**
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称１
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm1() {
        checkSpecifiedProperty("tenhanshaNm1");
        return convertEmptyToNull(_tenhanshaNm1);
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名称１
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        registerModifiedProperty("tenhanshaNm1");
        _tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称２
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaNm2() {
        checkSpecifiedProperty("tenhanshaNm2");
        return convertEmptyToNull(_tenhanshaNm2);
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名称２
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        registerModifiedProperty("tenhanshaNm2");
        _tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] TENHANSHA_ZIP_CD: {VARCHAR(30)} <br>
     * 店販社郵便番号
     * @return The value of the column 'TENHANSHA_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaZipCd() {
        checkSpecifiedProperty("tenhanshaZipCd");
        return convertEmptyToNull(_tenhanshaZipCd);
    }

    /**
     * [set] TENHANSHA_ZIP_CD: {VARCHAR(30)} <br>
     * 店販社郵便番号
     * @param tenhanshaZipCd The value of the column 'TENHANSHA_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaZipCd(String tenhanshaZipCd) {
        registerModifiedProperty("tenhanshaZipCd");
        _tenhanshaZipCd = tenhanshaZipCd;
    }

    /**
     * [get] TENHANSHA_PREFECTURE: {VARCHAR(60)} <br>
     * 店販社都道府県
     * @return The value of the column 'TENHANSHA_PREFECTURE'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaPrefecture() {
        checkSpecifiedProperty("tenhanshaPrefecture");
        return convertEmptyToNull(_tenhanshaPrefecture);
    }

    /**
     * [set] TENHANSHA_PREFECTURE: {VARCHAR(60)} <br>
     * 店販社都道府県
     * @param tenhanshaPrefecture The value of the column 'TENHANSHA_PREFECTURE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaPrefecture(String tenhanshaPrefecture) {
        registerModifiedProperty("tenhanshaPrefecture");
        _tenhanshaPrefecture = tenhanshaPrefecture;
    }

    /**
     * [get] TENHANSHA_ADDRESS1: {VARCHAR(60)} <br>
     * 店販社住所１
     * @return The value of the column 'TENHANSHA_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaAddress1() {
        checkSpecifiedProperty("tenhanshaAddress1");
        return convertEmptyToNull(_tenhanshaAddress1);
    }

    /**
     * [set] TENHANSHA_ADDRESS1: {VARCHAR(60)} <br>
     * 店販社住所１
     * @param tenhanshaAddress1 The value of the column 'TENHANSHA_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaAddress1(String tenhanshaAddress1) {
        registerModifiedProperty("tenhanshaAddress1");
        _tenhanshaAddress1 = tenhanshaAddress1;
    }

    /**
     * [get] TENHANSHA_ADDRESS2: {VARCHAR(60)} <br>
     * 店販社住所２
     * @return The value of the column 'TENHANSHA_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaAddress2() {
        checkSpecifiedProperty("tenhanshaAddress2");
        return convertEmptyToNull(_tenhanshaAddress2);
    }

    /**
     * [set] TENHANSHA_ADDRESS2: {VARCHAR(60)} <br>
     * 店販社住所２
     * @param tenhanshaAddress2 The value of the column 'TENHANSHA_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaAddress2(String tenhanshaAddress2) {
        registerModifiedProperty("tenhanshaAddress2");
        _tenhanshaAddress2 = tenhanshaAddress2;
    }

    /**
     * [get] TENHANSHA_TEL_NO: {VARCHAR(30)} <br>
     * 店販社電話番号
     * @return The value of the column 'TENHANSHA_TEL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaTelNo() {
        checkSpecifiedProperty("tenhanshaTelNo");
        return convertEmptyToNull(_tenhanshaTelNo);
    }

    /**
     * [set] TENHANSHA_TEL_NO: {VARCHAR(30)} <br>
     * 店販社電話番号
     * @param tenhanshaTelNo The value of the column 'TENHANSHA_TEL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaTelNo(String tenhanshaTelNo) {
        registerModifiedProperty("tenhanshaTelNo");
        _tenhanshaTelNo = tenhanshaTelNo;
    }

    /**
     * [get] TENHANSHA_FAX_NO: {VARCHAR(30)} <br>
     * 店販社ＦＡＸ番号
     * @return The value of the column 'TENHANSHA_FAX_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getTenhanshaFaxNo() {
        checkSpecifiedProperty("tenhanshaFaxNo");
        return convertEmptyToNull(_tenhanshaFaxNo);
    }

    /**
     * [set] TENHANSHA_FAX_NO: {VARCHAR(30)} <br>
     * 店販社ＦＡＸ番号
     * @param tenhanshaFaxNo The value of the column 'TENHANSHA_FAX_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTenhanshaFaxNo(String tenhanshaFaxNo) {
        registerModifiedProperty("tenhanshaFaxNo");
        _tenhanshaFaxNo = tenhanshaFaxNo;
    }

    /**
     * [get] PLANT_NORMAL: {VARCHAR(30)} <br>
     * プラント_通常品
     * @return The value of the column 'PLANT_NORMAL'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantNormal() {
        checkSpecifiedProperty("plantNormal");
        return convertEmptyToNull(_plantNormal);
    }

    /**
     * [set] PLANT_NORMAL: {VARCHAR(30)} <br>
     * プラント_通常品
     * @param plantNormal The value of the column 'PLANT_NORMAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantNormal(String plantNormal) {
        registerModifiedProperty("plantNormal");
        _plantNormal = plantNormal;
    }

    /**
     * [get] PLANT_DEPOSIT: {VARCHAR(30)} <br>
     * プラント_預かり品
     * @return The value of the column 'PLANT_DEPOSIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getPlantDeposit() {
        checkSpecifiedProperty("plantDeposit");
        return convertEmptyToNull(_plantDeposit);
    }

    /**
     * [set] PLANT_DEPOSIT: {VARCHAR(30)} <br>
     * プラント_預かり品
     * @param plantDeposit The value of the column 'PLANT_DEPOSIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPlantDeposit(String plantDeposit) {
        registerModifiedProperty("plantDeposit");
        _plantDeposit = plantDeposit;
    }

    /**
     * [get] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @return The value of the column 'LP_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getLpSendFlg() {
        checkSpecifiedProperty("lpSendFlg");
        return convertEmptyToNull(_lpSendFlg);
    }

    /**
     * [set] LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 物流ポータル送信済フラグ
     * @param lpSendFlg The value of the column 'LP_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLpSendFlg(String lpSendFlg) {
        registerModifiedProperty("lpSendFlg");
        _lpSendFlg = lpSendFlg;
    }

    /**
     * [get] WMS_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @return The value of the column 'WMS_SEND_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsSendFlg() {
        checkSpecifiedProperty("wmsSendFlg");
        return convertEmptyToNull(_wmsSendFlg);
    }

    /**
     * [set] WMS_SEND_FLG: {CHAR(1), default=[0]} <br>
     * WMS送信済フラグ
     * @param wmsSendFlg The value of the column 'WMS_SEND_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsSendFlg(String wmsSendFlg) {
        registerModifiedProperty("wmsSendFlg");
        _wmsSendFlg = wmsSendFlg;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
