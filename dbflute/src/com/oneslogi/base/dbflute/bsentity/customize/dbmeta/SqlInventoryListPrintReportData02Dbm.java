package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlInventoryListPrintReportData02. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryListPrintReportData02Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryListPrintReportData02Dbm _instance = new SqlInventoryListPrintReportData02Dbm();
    private SqlInventoryListPrintReportData02Dbm() {}
    public static SqlInventoryListPrintReportData02Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getInventoryBId(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getLot(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getLimitDt(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getChargeNum(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getInventoryNum(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getProdDt(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getAreaCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setAreaCd((String)vl), "areaCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getCenterCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getCenterAbbr(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getLocationCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getJanCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getDjanCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setDjanCd((String)vl), "djanCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getProductNm(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getSalesOrgCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getTenhanshaNm1(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getTenhanshaNm2(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getDepositCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getCustomerCd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getCustomerNm(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getUserNmUpd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setUserNmUpd((String)vl), "userNmUpd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getUserCdUpd(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setUserCdUpd((String)vl), "userCdUpd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getUserNm(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData02)et).getScancount(), (et, vl) -> ((SqlInventoryListPrintReportData02)et).setScancount(ctl(vl)), "scancount");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryListPrintReportData02";
    protected final String _tableDispName = "SqlInventoryListPrintReportData02";
    protected final String _tablePropertyName = "sqlInventoryListPrintReportData02";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryListPrintReportData02", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAreaCd = cci("AREA_CD", "AREA_CD", null, null, String.class, "areaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDjanCd = cci("DJAN_CD", "DJAN_CD", null, null, String.class, "djanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNmUpd = cci("USER_NM_UPD", "USER_NM_UPD", null, null, String.class, "userNmUpd", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCdUpd = cci("USER_CD_UPD", "USER_CD_UPD", null, null, String.class, "userCdUpd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScancount = cci("SCANCOUNT", "SCANCOUNT", null, null, Long.class, "scancount", null, false, false, false, "BIGINT", 21, 0, null, null, false, null, null, null, null, null, false);

    /**
     * INVENTORY_B_ID: {BIGINT(20), refers to t_inventory_b.INVENTORY_B_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * LOT: {VARCHAR(30), refers to t_inventory_b.LOT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {VARCHAR(8), refers to t_inventory_b.LIMIT_DT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * CHARGE_NUM: {DECIMAL(14, 4), refers to t_inventory_b.CHARGE_NUM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * INVENTORY_NUM: {DECIMAL(14, 4), refers to t_inventory_b.INVENTORY_NUM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * PROD_DT: {VARCHAR(8), refers to t_inventory_b.PROD_DT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * AREA_CD: {VARCHAR(30), refers to t_inventory_b.AREA_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAreaCd() { return _columnAreaCd; }
    /**
     * CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_ABBR: {VARCHAR(60), refers to m_center.CENTER_ABBR}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * DJAN_CD: {VARCHAR(30), refers to m_deposit_product.DEPOSIT_JAN_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDjanCd() { return _columnDjanCd; }
    /**
     * PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SALES_ORG_CD: {VARCHAR(30), refers to m_sales_org.SALES_ORG_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * TENHANSHA_NM1: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM1}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm1() { return _columnTenhanshaNm1; }
    /**
     * TENHANSHA_NM2: {VARCHAR(60), refers to m_sales_org.TENHANSHA_NM2}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm2() { return _columnTenhanshaNm2; }
    /**
     * DEPOSIT_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * CUSTOMER_CD: {VARCHAR(30), refers to m_customer.CUSTOMER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {VARCHAR(60), refers to m_customer.CUSTOMER_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * USER_NM_UPD: {VARCHAR(60), refers to b_user.USER_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNmUpd() { return _columnUserNmUpd; }
    /**
     * USER_CD_UPD: {VARCHAR(30), refers to b_user.USER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCdUpd() { return _columnUserCdUpd; }
    /**
     * USER_NM: {VARCHAR(60), refers to b_user.USER_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * SCANCOUNT: {BIGINT(21)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScancount() { return _columnScancount; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInventoryBId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnChargeNum());
        ls.add(columnInventoryNum());
        ls.add(columnProdDt());
        ls.add(columnAreaCd());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
        ls.add(columnLocationCd());
        ls.add(columnJanCd());
        ls.add(columnDjanCd());
        ls.add(columnProductNm());
        ls.add(columnSalesOrgCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnDepositCd());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnUserNmUpd());
        ls.add(columnUserCdUpd());
        ls.add(columnUserNm());
        ls.add(columnScancount());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData02"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryListPrintReportData02> getEntityType() { return SqlInventoryListPrintReportData02.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryListPrintReportData02 newEntity() { return new SqlInventoryListPrintReportData02(); }
    public SqlInventoryListPrintReportData02 newMyEntity() { return new SqlInventoryListPrintReportData02(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryListPrintReportData02)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryListPrintReportData02)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
