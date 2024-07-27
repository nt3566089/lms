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
 * The DB meta of t_bldl5340. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5340Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5340Dbm _instance = new TBldl5340Dbm();
    private TBldl5340Dbm() {}
    public static TBldl5340Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5340)et).getBldl5340Id(), (et, vl) -> ((TBldl5340)et).setBldl5340Id(ctl(vl)), "bldl5340Id");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getYearmonth(), (et, vl) -> ((TBldl5340)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getMonth(), (et, vl) -> ((TBldl5340)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getSalesOrgCd(), (et, vl) -> ((TBldl5340)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getSalesOrgNm(), (et, vl) -> ((TBldl5340)et).setSalesOrgNm((String)vl), "salesOrgNm");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getRelatedCategory(), (et, vl) -> ((TBldl5340)et).setRelatedCategory((String)vl), "relatedCategory");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getRowNo(), (et, vl) -> ((TBldl5340)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getProductCd(), (et, vl) -> ((TBldl5340)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getDepositJanCd(), (et, vl) -> ((TBldl5340)et).setDepositJanCd((String)vl), "depositJanCd");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getProductNm(), (et, vl) -> ((TBldl5340)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getDepositStockNum(), (et, vl) -> ((TBldl5340)et).setDepositStockNum(ctl(vl)), "depositStockNum");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getDepositWhNm(), (et, vl) -> ((TBldl5340)et).setDepositWhNm((String)vl), "depositWhNm");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getDepositUserNm(), (et, vl) -> ((TBldl5340)et).setDepositUserNm((String)vl), "depositUserNm");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getDelFlg(), (et, vl) -> ((TBldl5340)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getVersionNo(), (et, vl) -> ((TBldl5340)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getControlNo(), (et, vl) -> ((TBldl5340)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getAddDt(), (et, vl) -> ((TBldl5340)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getAddUser(), (et, vl) -> ((TBldl5340)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getAddProcess(), (et, vl) -> ((TBldl5340)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getUpdDt(), (et, vl) -> ((TBldl5340)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getUpdUser(), (et, vl) -> ((TBldl5340)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5340)et).getUpdProcess(), (et, vl) -> ((TBldl5340)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5340";
    protected final String _tableDispName = "t_bldl5340";
    protected final String _tablePropertyName = "TBldl5340";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5340", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5340Id = cci("BLDL5340_ID", "BLDL5340_ID", null, null, Long.class, "bldl5340Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgNm = cci("SALES_ORG_NM", "SALES_ORG_NM", null, null, String.class, "salesOrgNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRelatedCategory = cci("RELATED_CATEGORY", "RELATED_CATEGORY", null, null, String.class, "relatedCategory", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositJanCd = cci("DEPOSIT_JAN_CD", "DEPOSIT_JAN_CD", null, null, String.class, "depositJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositStockNum = cci("DEPOSIT_STOCK_NUM", "DEPOSIT_STOCK_NUM", null, null, Long.class, "depositStockNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositWhNm = cci("DEPOSIT_WH_NM", "DEPOSIT_WH_NM", null, null, String.class, "depositWhNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositUserNm = cci("DEPOSIT_USER_NM", "DEPOSIT_USER_NM", null, null, String.class, "depositUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5340_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5340Id() { return _columnBldl5340Id; }
    /**
     * YEARMONTH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYearmonth() { return _columnYearmonth; }
    /**
     * MONTH: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonth() { return _columnMonth; }
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
     * RELATED_CATEGORY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRelatedCategory() { return _columnRelatedCategory; }
    /**
     * ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNo() { return _columnRowNo; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositJanCd() { return _columnDepositJanCd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * DEPOSIT_STOCK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositStockNum() { return _columnDepositStockNum; }
    /**
     * DEPOSIT_WH_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositWhNm() { return _columnDepositWhNm; }
    /**
     * DEPOSIT_USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositUserNm() { return _columnDepositUserNm; }
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
        ls.add(columnBldl5340Id());
        ls.add(columnYearmonth());
        ls.add(columnMonth());
        ls.add(columnSalesOrgCd());
        ls.add(columnSalesOrgNm());
        ls.add(columnRelatedCategory());
        ls.add(columnRowNo());
        ls.add(columnProductCd());
        ls.add(columnDepositJanCd());
        ls.add(columnProductNm());
        ls.add(columnDepositStockNum());
        ls.add(columnDepositWhNm());
        ls.add(columnDepositUserNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5340Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5340"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5340CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5340Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5340> getEntityType() { return TBldl5340.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5340 newEntity() { return new TBldl5340(); }
    public TBldl5340 newMyEntity() { return new TBldl5340(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5340)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5340)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
