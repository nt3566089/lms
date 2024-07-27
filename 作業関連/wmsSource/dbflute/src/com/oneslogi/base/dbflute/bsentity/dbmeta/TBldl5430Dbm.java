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
 * The DB meta of t_bldl5430. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5430Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5430Dbm _instance = new TBldl5430Dbm();
    private TBldl5430Dbm() {}
    public static TBldl5430Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5430)et).getBldl5430Id(), (et, vl) -> ((TBldl5430)et).setBldl5430Id(ctl(vl)), "bldl5430Id");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getYearmonth(), (et, vl) -> ((TBldl5430)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getMonth(), (et, vl) -> ((TBldl5430)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getShippingDt(), (et, vl) -> ((TBldl5430)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getDestinationNm1(), (et, vl) -> ((TBldl5430)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getDestinationNm2(), (et, vl) -> ((TBldl5430)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getProductCd(), (et, vl) -> ((TBldl5430)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getProductNm(), (et, vl) -> ((TBldl5430)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getShippingNum(), (et, vl) -> ((TBldl5430)et).setShippingNum(ctl(vl)), "shippingNum");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getKohaiCustomerNm(), (et, vl) -> ((TBldl5430)et).setKohaiCustomerNm((String)vl), "kohaiCustomerNm");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getNizoroeCnt(), (et, vl) -> ((TBldl5430)et).setNizoroeCnt(ctl(vl)), "nizoroeCnt");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getDelFlg(), (et, vl) -> ((TBldl5430)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getVersionNo(), (et, vl) -> ((TBldl5430)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getControlNo(), (et, vl) -> ((TBldl5430)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getAddDt(), (et, vl) -> ((TBldl5430)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getAddUser(), (et, vl) -> ((TBldl5430)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getAddProcess(), (et, vl) -> ((TBldl5430)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getUpdDt(), (et, vl) -> ((TBldl5430)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getUpdUser(), (et, vl) -> ((TBldl5430)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5430)et).getUpdProcess(), (et, vl) -> ((TBldl5430)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5430";
    protected final String _tableDispName = "t_bldl5430";
    protected final String _tablePropertyName = "TBldl5430";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5430", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5430Id = cci("BLDL5430_ID", "BLDL5430_ID", null, null, Long.class, "bldl5430Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingNum = cci("SHIPPING_NUM", "SHIPPING_NUM", null, null, Long.class, "shippingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiCustomerNm = cci("KOHAI_CUSTOMER_NM", "KOHAI_CUSTOMER_NM", null, null, String.class, "kohaiCustomerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeCnt = cci("NIZOROE_CNT", "NIZOROE_CNT", null, null, Long.class, "nizoroeCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5430_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5430Id() { return _columnBldl5430Id; }
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
     * SHIPPING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm1() { return _columnDestinationNm1; }
    /**
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm2() { return _columnDestinationNm2; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SHIPPING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingNum() { return _columnShippingNum; }
    /**
     * KOHAI_CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKohaiCustomerNm() { return _columnKohaiCustomerNm; }
    /**
     * NIZOROE_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeCnt() { return _columnNizoroeCnt; }
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
        ls.add(columnBldl5430Id());
        ls.add(columnYearmonth());
        ls.add(columnMonth());
        ls.add(columnShippingDt());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnShippingNum());
        ls.add(columnKohaiCustomerNm());
        ls.add(columnNizoroeCnt());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5430Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5430"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5430CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5430Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5430> getEntityType() { return TBldl5430.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5430 newEntity() { return new TBldl5430(); }
    public TBldl5430 newMyEntity() { return new TBldl5430(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5430)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5430)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
