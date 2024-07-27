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
 * The DB meta of SqlInventoryListPrintReportData03. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlInventoryListPrintReportData03Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlInventoryListPrintReportData03Dbm _instance = new SqlInventoryListPrintReportData03Dbm();
    private SqlInventoryListPrintReportData03Dbm() {}
    public static SqlInventoryListPrintReportData03Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getChargeNum(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getInventoryNum(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getSalesname(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setSalesname((String)vl), "salesname");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getPlantnm(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setPlantnm((String)vl), "plantnm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getPlantCd(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getInventoryDt(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getCenterCd(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getCenterAbbr(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getProductCd(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getProductNm(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getJanCd(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getProductCategoryCls(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setProductCategoryCls((String)vl), "productCategoryCls");
        setupEpg(_epgMap, et -> ((SqlInventoryListPrintReportData03)et).getEvaluationUnitPrice(), (et, vl) -> ((SqlInventoryListPrintReportData03)et).setEvaluationUnitPrice(ctb(vl)), "evaluationUnitPrice");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlInventoryListPrintReportData03";
    protected final String _tableDispName = "SqlInventoryListPrintReportData03";
    protected final String _tablePropertyName = "sqlInventoryListPrintReportData03";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlInventoryListPrintReportData03", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesname = cci("SALESNAME", "SALESNAME", null, null, String.class, "salesname", null, false, false, false, "VARCHAR", 243, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantnm = cci("PLANTNM", "PLANTNM", null, null, String.class, "plantnm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCategoryCls = cci("PRODUCT_CATEGORY_CLS", "PRODUCT_CATEGORY_CLS", null, null, String.class, "productCategoryCls", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEvaluationUnitPrice = cci("EVALUATION_UNIT_PRICE", "EVALUATION_UNIT_PRICE", null, null, java.math.BigDecimal.class, "evaluationUnitPrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);

    /**
     * CHARGE_NUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * INVENTORY_NUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * SALESNAME: {VARCHAR(243)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesname() { return _columnSalesname; }
    /**
     * PLANTNM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantnm() { return _columnPlantnm; }
    /**
     * PLANT_CD: {VARCHAR(30), refers to t_inventory_h.PLANT_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantCd() { return _columnPlantCd; }
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
     * PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
    /**
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4), refers to m_product.EVALUATION_UNIT_PRICE}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEvaluationUnitPrice() { return _columnEvaluationUnitPrice; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnChargeNum());
        ls.add(columnInventoryNum());
        ls.add(columnSalesname());
        ls.add(columnPlantnm());
        ls.add(columnPlantCd());
        ls.add(columnInventoryDt());
        ls.add(columnCenterCd());
        ls.add(columnCenterAbbr());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnJanCd());
        ls.add(columnProductCategoryCls());
        ls.add(columnEvaluationUnitPrice());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData03"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlInventoryListPrintReportData03> getEntityType() { return SqlInventoryListPrintReportData03.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlInventoryListPrintReportData03 newEntity() { return new SqlInventoryListPrintReportData03(); }
    public SqlInventoryListPrintReportData03 newMyEntity() { return new SqlInventoryListPrintReportData03(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlInventoryListPrintReportData03)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlInventoryListPrintReportData03)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
