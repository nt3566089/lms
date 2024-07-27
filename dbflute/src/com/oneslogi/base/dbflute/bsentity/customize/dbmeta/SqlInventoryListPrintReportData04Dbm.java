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
 * The DB meta of SqlInventoryListPrintReportData04. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryListPrintReportData04Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryListPrintReportData04Dbm _instance = new SqlInventoryListPrintReportData04Dbm();
    private SqlInventoryListPrintReportData04Dbm() {}
    public static SqlInventoryListPrintReportData04Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getSuminvnum(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setSuminvnum(ctb(vl)), "suminvnum");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getProductCd(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getLocationCd(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getInventoryDt(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getCenterCd(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getCenterAbbr(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getProductNm(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getJanCd(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData04)et).getProductCategoryCls(), (et, vl) -> ((SqlInventoryListPrintReportData04)et).setProductCategoryCls((String)vl), "productCategoryCls");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryListPrintReportData04";
    protected final String _tableDispName = "SqlInventoryListPrintReportData04";
    protected final String _tablePropertyName = "sqlInventoryListPrintReportData04";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryListPrintReportData04", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSuminvnum = cci("SUMINVNUM", "SUMINVNUM", null, null, java.math.BigDecimal.class, "suminvnum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCategoryCls = cci("PRODUCT_CATEGORY_CLS", "PRODUCT_CATEGORY_CLS", null, null, String.class, "productCategoryCls", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * SUMINVNUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuminvnum() { return _columnSuminvnum; }
    /**
     * PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOCATION_CD: {VARCHAR(30), refers to m_location.LOCATION_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * INVENTORY_DT: {VARCHAR(8), refers to t_inventory_h.INVENTORY_DT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
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
     * PRODUCT_NM: {VARCHAR(255), refers to m_product.PRODUCT_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * JAN_CD: {VARCHAR(30), refers to m_product.JAN_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30), refers to m_product.PRODUCT_CATEGORY_CLS}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCls() { return _columnProductCategoryCls; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSuminvnum());
        ls.add(columnProductCd());
        ls.add(columnLocationCd());
        ls.add(columnInventoryDt());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
        ls.add(columnProductNm());
        ls.add(columnJanCd());
        ls.add(columnProductCategoryCls());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData04"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryListPrintReportData04> getEntityType() { return SqlInventoryListPrintReportData04.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryListPrintReportData04 newEntity() { return new SqlInventoryListPrintReportData04(); }
    public SqlInventoryListPrintReportData04 newMyEntity() { return new SqlInventoryListPrintReportData04(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryListPrintReportData04)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryListPrintReportData04)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
