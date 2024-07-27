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
 * The DB meta of t_bldl5120. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5120Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5120Dbm _instance = new TBldl5120Dbm();
    private TBldl5120Dbm() {}
    public static TBldl5120Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5120)et).getBldl5120Id(), (et, vl) -> ((TBldl5120)et).setBldl5120Id(ctl(vl)), "bldl5120Id");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getYearmonth(), (et, vl) -> ((TBldl5120)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getMonth(), (et, vl) -> ((TBldl5120)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getCarrierCd(), (et, vl) -> ((TBldl5120)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getCarrierNm(), (et, vl) -> ((TBldl5120)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getRowNo(), (et, vl) -> ((TBldl5120)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getShippingDt(), (et, vl) -> ((TBldl5120)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getKamataStore(), (et, vl) -> ((TBldl5120)et).setKamataStore(ctl(vl)), "kamataStore");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getKamataDirect(), (et, vl) -> ((TBldl5120)et).setKamataDirect(ctl(vl)), "kamataDirect");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getKashiwaStore(), (et, vl) -> ((TBldl5120)et).setKashiwaStore(ctl(vl)), "kashiwaStore");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getKashiwaDirect(), (et, vl) -> ((TBldl5120)et).setKashiwaDirect(ctl(vl)), "kashiwaDirect");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getStoreTotal(), (et, vl) -> ((TBldl5120)et).setStoreTotal(ctl(vl)), "storeTotal");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getDirectTotal(), (et, vl) -> ((TBldl5120)et).setDirectTotal(ctl(vl)), "directTotal");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getTotalPackNum(), (et, vl) -> ((TBldl5120)et).setTotalPackNum(ctl(vl)), "totalPackNum");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getDelFlg(), (et, vl) -> ((TBldl5120)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getVersionNo(), (et, vl) -> ((TBldl5120)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getControlNo(), (et, vl) -> ((TBldl5120)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getAddDt(), (et, vl) -> ((TBldl5120)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getAddUser(), (et, vl) -> ((TBldl5120)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getAddProcess(), (et, vl) -> ((TBldl5120)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getUpdDt(), (et, vl) -> ((TBldl5120)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getUpdUser(), (et, vl) -> ((TBldl5120)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5120)et).getUpdProcess(), (et, vl) -> ((TBldl5120)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5120";
    protected final String _tableDispName = "t_bldl5120";
    protected final String _tablePropertyName = "TBldl5120";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5120", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5120Id = cci("BLDL5120_ID", "BLDL5120_ID", null, null, Long.class, "bldl5120Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKamataStore = cci("KAMATA_STORE", "KAMATA_STORE", null, null, Long.class, "kamataStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKamataDirect = cci("KAMATA_DIRECT", "KAMATA_DIRECT", null, null, Long.class, "kamataDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKashiwaStore = cci("KASHIWA_STORE", "KASHIWA_STORE", null, null, Long.class, "kashiwaStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKashiwaDirect = cci("KASHIWA_DIRECT", "KASHIWA_DIRECT", null, null, Long.class, "kashiwaDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreTotal = cci("STORE_TOTAL", "STORE_TOTAL", null, null, Long.class, "storeTotal", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectTotal = cci("DIRECT_TOTAL", "DIRECT_TOTAL", null, null, Long.class, "directTotal", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPackNum = cci("TOTAL_PACK_NUM", "TOTAL_PACK_NUM", null, null, Long.class, "totalPackNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5120Id() { return _columnBldl5120Id; }
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
     * CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNo() { return _columnRowNo; }
    /**
     * SHIPPING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * KAMATA_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKamataStore() { return _columnKamataStore; }
    /**
     * KAMATA_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKamataDirect() { return _columnKamataDirect; }
    /**
     * KASHIWA_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKashiwaStore() { return _columnKashiwaStore; }
    /**
     * KASHIWA_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKashiwaDirect() { return _columnKashiwaDirect; }
    /**
     * STORE_TOTAL: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreTotal() { return _columnStoreTotal; }
    /**
     * DIRECT_TOTAL: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectTotal() { return _columnDirectTotal; }
    /**
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPackNum() { return _columnTotalPackNum; }
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
        ls.add(columnBldl5120Id());
        ls.add(columnYearmonth());
        ls.add(columnMonth());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnRowNo());
        ls.add(columnShippingDt());
        ls.add(columnKamataStore());
        ls.add(columnKamataDirect());
        ls.add(columnKashiwaStore());
        ls.add(columnKashiwaDirect());
        ls.add(columnStoreTotal());
        ls.add(columnDirectTotal());
        ls.add(columnTotalPackNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5120Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5120"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5120CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5120Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5120> getEntityType() { return TBldl5120.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5120 newEntity() { return new TBldl5120(); }
    public TBldl5120 newMyEntity() { return new TBldl5120(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5120)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5120)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
