package com.oneslogi.base.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The DB meta of m_sales_org. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MSalesOrgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MSalesOrgDbm _instance = new MSalesOrgDbm();
    private MSalesOrgDbm() {}
    public static MSalesOrgDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getSalesOrgId(), (et, vl) -> ((MSalesOrg)et).setSalesOrgId(ctl(vl)), "salesOrgId");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getSalesOrgCd(), (et, vl) -> ((MSalesOrg)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getPurchaseOrgCd(), (et, vl) -> ((MSalesOrg)et).setPurchaseOrgCd((String)vl), "purchaseOrgCd");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaCd(), (et, vl) -> ((MSalesOrg)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaNm1(), (et, vl) -> ((MSalesOrg)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaNm2(), (et, vl) -> ((MSalesOrg)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaZipCd(), (et, vl) -> ((MSalesOrg)et).setTenhanshaZipCd((String)vl), "tenhanshaZipCd");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaPrefecture(), (et, vl) -> ((MSalesOrg)et).setTenhanshaPrefecture((String)vl), "tenhanshaPrefecture");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaAddress1(), (et, vl) -> ((MSalesOrg)et).setTenhanshaAddress1((String)vl), "tenhanshaAddress1");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaAddress2(), (et, vl) -> ((MSalesOrg)et).setTenhanshaAddress2((String)vl), "tenhanshaAddress2");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaTelNo(), (et, vl) -> ((MSalesOrg)et).setTenhanshaTelNo((String)vl), "tenhanshaTelNo");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getTenhanshaFaxNo(), (et, vl) -> ((MSalesOrg)et).setTenhanshaFaxNo((String)vl), "tenhanshaFaxNo");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getPlantNormal(), (et, vl) -> ((MSalesOrg)et).setPlantNormal((String)vl), "plantNormal");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getPlantDeposit(), (et, vl) -> ((MSalesOrg)et).setPlantDeposit((String)vl), "plantDeposit");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getLpSendFlg(), (et, vl) -> ((MSalesOrg)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getWmsSendFlg(), (et, vl) -> ((MSalesOrg)et).setWmsSendFlg((String)vl), "wmsSendFlg");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getSpareStr(), (et, vl) -> ((MSalesOrg)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getDelFlg(), (et, vl) -> ((MSalesOrg)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getVersionNo(), (et, vl) -> ((MSalesOrg)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getControlNo(), (et, vl) -> ((MSalesOrg)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getAddDt(), (et, vl) -> ((MSalesOrg)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getAddUser(), (et, vl) -> ((MSalesOrg)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getAddProcess(), (et, vl) -> ((MSalesOrg)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getUpdDt(), (et, vl) -> ((MSalesOrg)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getUpdUser(), (et, vl) -> ((MSalesOrg)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MSalesOrg)et).getUpdProcess(), (et, vl) -> ((MSalesOrg)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_sales_org";
    protected final String _tableDispName = "m_sales_org";
    protected final String _tablePropertyName = "MSalesOrg";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_sales_org", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSalesOrgId = cci("SALES_ORG_ID", "SALES_ORG_ID", null, null, Long.class, "salesOrgId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "MBaseSalesOrgList,MCarrierDecisionList,MCustomerPickingList,MDepositProductList,MKoguchiDeliveryList,TInventoryBList", null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseOrgCd = cci("PURCHASE_ORG_CD", "PURCHASE_ORG_CD", null, null, String.class, "purchaseOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaZipCd = cci("TENHANSHA_ZIP_CD", "TENHANSHA_ZIP_CD", null, null, String.class, "tenhanshaZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaPrefecture = cci("TENHANSHA_PREFECTURE", "TENHANSHA_PREFECTURE", null, null, String.class, "tenhanshaPrefecture", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaAddress1 = cci("TENHANSHA_ADDRESS1", "TENHANSHA_ADDRESS1", null, null, String.class, "tenhanshaAddress1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaAddress2 = cci("TENHANSHA_ADDRESS2", "TENHANSHA_ADDRESS2", null, null, String.class, "tenhanshaAddress2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaTelNo = cci("TENHANSHA_TEL_NO", "TENHANSHA_TEL_NO", null, null, String.class, "tenhanshaTelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaFaxNo = cci("TENHANSHA_FAX_NO", "TENHANSHA_FAX_NO", null, null, String.class, "tenhanshaFaxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantNormal = cci("PLANT_NORMAL", "PLANT_NORMAL", null, null, String.class, "plantNormal", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantDeposit = cci("PLANT_DEPOSIT", "PLANT_DEPOSIT", null, null, String.class, "plantDeposit", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsSendFlg = cci("WMS_SEND_FLG", "WMS_SEND_FLG", null, null, String.class, "wmsSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, null, null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgId() { return _columnSalesOrgId; }
    /**
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseOrgCd() { return _columnPurchaseOrgCd; }
    /**
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaCd() { return _columnTenhanshaCd; }
    /**
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm1() { return _columnTenhanshaNm1; }
    /**
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm2() { return _columnTenhanshaNm2; }
    /**
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaZipCd() { return _columnTenhanshaZipCd; }
    /**
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaPrefecture() { return _columnTenhanshaPrefecture; }
    /**
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaAddress1() { return _columnTenhanshaAddress1; }
    /**
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaAddress2() { return _columnTenhanshaAddress2; }
    /**
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaTelNo() { return _columnTenhanshaTelNo; }
    /**
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaFaxNo() { return _columnTenhanshaFaxNo; }
    /**
     * PLANT_NORMAL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantNormal() { return _columnPlantNormal; }
    /**
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantDeposit() { return _columnPlantDeposit; }
    /**
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
    /**
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsSendFlg() { return _columnWmsSendFlg; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
    /**
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnControlNo() { return _columnControlNo; }
    /**
     * ADD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddDt() { return _columnAddDt; }
    /**
     * ADD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddUser() { return _columnAddUser; }
    /**
     * ADD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddProcess() { return _columnAddProcess; }
    /**
     * UPD_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdDt() { return _columnUpdDt; }
    /**
     * UPD_USER: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdUser() { return _columnUpdUser; }
    /**
     * UPD_PROCESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdProcess() { return _columnUpdProcess; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSalesOrgId());
        ls.add(columnSalesOrgCd());
        ls.add(columnPurchaseOrgCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnTenhanshaZipCd());
        ls.add(columnTenhanshaPrefecture());
        ls.add(columnTenhanshaAddress1());
        ls.add(columnTenhanshaAddress2());
        ls.add(columnTenhanshaTelNo());
        ls.add(columnTenhanshaFaxNo());
        ls.add(columnPlantNormal());
        ls.add(columnPlantDeposit());
        ls.add(columnLpSendFlg());
        ls.add(columnWmsSendFlg());
        ls.add(columnSpareStr());
        ls.add(columnDelFlg());
        ls.add(columnVersionNo());
        ls.add(columnControlNo());
        ls.add(columnAddDt());
        ls.add(columnAddUser());
        ls.add(columnAddProcess());
        ls.add(columnUpdDt());
        ls.add(columnUpdUser());
        ls.add(columnUpdProcess());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnSalesOrgId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnSalesOrgCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBaseSalesOrgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MBaseSalesOrgDbm.getInstance().columnSalesOrgId());
        return cri("M_BASE_SALES_ORG_FK1", "MBaseSalesOrgList", this, MBaseSalesOrgDbm.getInstance(), mp, false, "MSalesOrg");
    }
    /**
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierDecisionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MCarrierDecisionDbm.getInstance().columnSalesOrgId());
        return cri("M_CARRIER_DECISION_FK3", "MCarrierDecisionList", this, MCarrierDecisionDbm.getInstance(), mp, false, "MSalesOrg");
    }
    /**
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCustomerPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MCustomerPickingDbm.getInstance().columnSalesOrgId());
        return cri("M_CUSTOMER_PICKING_FK2", "MCustomerPickingList", this, MCustomerPickingDbm.getInstance(), mp, false, "MSalesOrg");
    }
    /**
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDepositProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MDepositProductDbm.getInstance().columnSalesOrgId());
        return cri("M_DEPOSIT_PRODUCT_FK1", "MDepositProductList", this, MDepositProductDbm.getInstance(), mp, false, "MSalesOrg");
    }
    /**
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMKoguchiDeliveryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MKoguchiDeliveryDbm.getInstance().columnServSalesOrgId());
        return cri("M_KOGUCHI_DELIVERY_FK1", "MKoguchiDeliveryList", this, MKoguchiDeliveryDbm.getInstance(), mp, false, "MSalesOrg");
    }
    /**
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), TInventoryBDbm.getInstance().columnSalesOrgId());
        return cri("T_INVENTORY_B_FK16", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MSalesOrg");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnDelFlg(), columnVersionNo(), columnControlNo(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnDelFlg(), columnAddDt(), columnAddUser(), columnAddProcess(), columnUpdDt(), columnUpdUser(), columnUpdProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdDt(), columnUpdUser(), columnUpdProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MSalesOrg"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MSalesOrgCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MSalesOrgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MSalesOrg> getEntityType() { return MSalesOrg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MSalesOrg newEntity() { return new MSalesOrg(); }
    public MSalesOrg newMyEntity() { return new MSalesOrg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MSalesOrg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MSalesOrg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
