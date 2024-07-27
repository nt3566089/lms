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
 * The DB meta of t_stock_book. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStockBookDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStockBookDbm _instance = new TStockBookDbm();
    private TStockBookDbm() {}
    public static TStockBookDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStockBook)et).getStockBookId(), (et, vl) -> ((TStockBook)et).setStockBookId(ctl(vl)), "stockBookId");
        setupEpg(_epgMap, et -> ((TStockBook)et).getBaseCd(), (et, vl) -> ((TStockBook)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((TStockBook)et).getBaseTypeCd(), (et, vl) -> ((TStockBook)et).setBaseTypeCd((String)vl), "baseTypeCd");
        setupEpg(_epgMap, et -> ((TStockBook)et).getVarietyTypeCd(), (et, vl) -> ((TStockBook)et).setVarietyTypeCd((String)vl), "varietyTypeCd");
        setupEpg(_epgMap, et -> ((TStockBook)et).getProductId(), (et, vl) -> ((TStockBook)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TStockBook)et).getChargeNum(), (et, vl) -> ((TStockBook)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((TStockBook)et).getAllocNum(), (et, vl) -> ((TStockBook)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TStockBook)et).getSalesOrgCd(), (et, vl) -> ((TStockBook)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TStockBook)et).getSalesOrgNm(), (et, vl) -> ((TStockBook)et).setSalesOrgNm((String)vl), "salesOrgNm");
        setupEpg(_epgMap, et -> ((TStockBook)et).getUserCd(), (et, vl) -> ((TStockBook)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((TStockBook)et).getUserNm(), (et, vl) -> ((TStockBook)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((TStockBook)et).getDelFlg(), (et, vl) -> ((TStockBook)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStockBook)et).getVersionNo(), (et, vl) -> ((TStockBook)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStockBook)et).getControlNo(), (et, vl) -> ((TStockBook)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStockBook)et).getAddDt(), (et, vl) -> ((TStockBook)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStockBook)et).getAddUser(), (et, vl) -> ((TStockBook)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStockBook)et).getAddProcess(), (et, vl) -> ((TStockBook)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStockBook)et).getUpdDt(), (et, vl) -> ((TStockBook)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStockBook)et).getUpdUser(), (et, vl) -> ((TStockBook)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStockBook)et).getUpdProcess(), (et, vl) -> ((TStockBook)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStockBook)et).getMProduct(), (et, vl) -> ((TStockBook)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_stock_book";
    protected final String _tableDispName = "t_stock_book";
    protected final String _tablePropertyName = "TStockBook";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_stock_book", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStockBookId = cci("STOCK_BOOK_ID", "STOCK_BOOK_ID", null, null, Long.class, "stockBookId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseTypeCd = cci("BASE_TYPE_CD", "BASE_TYPE_CD", null, null, String.class, "baseTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVarietyTypeCd = cci("VARIETY_TYPE_CD", "VARIETY_TYPE_CD", null, null, String.class, "varietyTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgNm = cci("SALES_ORG_NM", "SALES_ORG_NM", null, null, String.class, "salesOrgNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * STOCK_BOOK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockBookId() { return _columnStockBookId; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseTypeCd() { return _columnBaseTypeCd; }
    /**
     * VARIETY_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVarietyTypeCd() { return _columnVarietyTypeCd; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * CHARGE_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * ALLOC_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * SALES_ORG_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgNm() { return _columnSalesOrgNm; }
    /**
     * USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
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
        ls.add(columnStockBookId());
        ls.add(columnBaseCd());
        ls.add(columnBaseTypeCd());
        ls.add(columnVarietyTypeCd());
        ls.add(columnProductId());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnSalesOrgCd());
        ls.add(columnSalesOrgNm());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnStockBookId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_STOCK_BOOK_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStockBookList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStockBook"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStockBookCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStockBookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStockBook> getEntityType() { return TStockBook.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStockBook newEntity() { return new TStockBook(); }
    public TStockBook newMyEntity() { return new TStockBook(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStockBook)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStockBook)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}