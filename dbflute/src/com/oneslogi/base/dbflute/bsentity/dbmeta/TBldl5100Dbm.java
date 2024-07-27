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
 * The DB meta of t_bldl5100. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5100Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5100Dbm _instance = new TBldl5100Dbm();
    private TBldl5100Dbm() {}
    public static TBldl5100Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5100)et).getBldl5100Id(), (et, vl) -> ((TBldl5100)et).setBldl5100Id(ctl(vl)), "bldl5100Id");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getYearmonth(), (et, vl) -> ((TBldl5100)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getBaseNm(), (et, vl) -> ((TBldl5100)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getMonth(), (et, vl) -> ((TBldl5100)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getCarrierCd(), (et, vl) -> ((TBldl5100)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getCarrierNm(), (et, vl) -> ((TBldl5100)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getShippingDt(), (et, vl) -> ((TBldl5100)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getFwStore(), (et, vl) -> ((TBldl5100)et).setFwStore(ctl(vl)), "fwStore");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getFwDirect(), (et, vl) -> ((TBldl5100)et).setFwDirect(ctl(vl)), "fwDirect");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getUnStore(), (et, vl) -> ((TBldl5100)et).setUnStore(ctl(vl)), "unStore");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getUnDirect(), (et, vl) -> ((TBldl5100)et).setUnDirect(ctl(vl)), "unDirect");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getShStore(), (et, vl) -> ((TBldl5100)et).setShStore(ctl(vl)), "shStore");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getShDirect(), (et, vl) -> ((TBldl5100)et).setShDirect(ctl(vl)), "shDirect");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getHmStore(), (et, vl) -> ((TBldl5100)et).setHmStore(ctl(vl)), "hmStore");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getHmDirect(), (et, vl) -> ((TBldl5100)et).setHmDirect(ctl(vl)), "hmDirect");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getTotalStore(), (et, vl) -> ((TBldl5100)et).setTotalStore(ctl(vl)), "totalStore");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getTotalDirect(), (et, vl) -> ((TBldl5100)et).setTotalDirect(ctl(vl)), "totalDirect");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getKoguchiInclude(), (et, vl) -> ((TBldl5100)et).setKoguchiInclude(ctl(vl)), "koguchiInclude");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getKoguchiConst(), (et, vl) -> ((TBldl5100)et).setKoguchiConst(ctl(vl)), "koguchiConst");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getTotalPackNum(), (et, vl) -> ((TBldl5100)et).setTotalPackNum(ctl(vl)), "totalPackNum");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getDelFlg(), (et, vl) -> ((TBldl5100)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getVersionNo(), (et, vl) -> ((TBldl5100)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getControlNo(), (et, vl) -> ((TBldl5100)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getAddDt(), (et, vl) -> ((TBldl5100)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getAddUser(), (et, vl) -> ((TBldl5100)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getAddProcess(), (et, vl) -> ((TBldl5100)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getUpdDt(), (et, vl) -> ((TBldl5100)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getUpdUser(), (et, vl) -> ((TBldl5100)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5100)et).getUpdProcess(), (et, vl) -> ((TBldl5100)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5100";
    protected final String _tableDispName = "t_bldl5100";
    protected final String _tablePropertyName = "TBldl5100";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5100", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5100Id = cci("BLDL5100_ID", "BLDL5100_ID", null, null, Long.class, "bldl5100Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwStore = cci("FW_STORE", "FW_STORE", null, null, Long.class, "fwStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwDirect = cci("FW_DIRECT", "FW_DIRECT", null, null, Long.class, "fwDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnStore = cci("UN_STORE", "UN_STORE", null, null, Long.class, "unStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnDirect = cci("UN_DIRECT", "UN_DIRECT", null, null, Long.class, "unDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShStore = cci("SH_STORE", "SH_STORE", null, null, Long.class, "shStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShDirect = cci("SH_DIRECT", "SH_DIRECT", null, null, Long.class, "shDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmStore = cci("HM_STORE", "HM_STORE", null, null, Long.class, "hmStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmDirect = cci("HM_DIRECT", "HM_DIRECT", null, null, Long.class, "hmDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalStore = cci("TOTAL_STORE", "TOTAL_STORE", null, null, Long.class, "totalStore", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalDirect = cci("TOTAL_DIRECT", "TOTAL_DIRECT", null, null, Long.class, "totalDirect", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiInclude = cci("KOGUCHI_INCLUDE", "KOGUCHI_INCLUDE", null, null, Long.class, "koguchiInclude", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiConst = cci("KOGUCHI_CONST", "KOGUCHI_CONST", null, null, Long.class, "koguchiConst", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5100_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5100Id() { return _columnBldl5100Id; }
    /**
     * YEARMONTH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYearmonth() { return _columnYearmonth; }
    /**
     * BASE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseNm() { return _columnBaseNm; }
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
     * CARRIER_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * SHIPPING_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * FW_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwStore() { return _columnFwStore; }
    /**
     * FW_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwDirect() { return _columnFwDirect; }
    /**
     * UN_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnStore() { return _columnUnStore; }
    /**
     * UN_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnDirect() { return _columnUnDirect; }
    /**
     * SH_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShStore() { return _columnShStore; }
    /**
     * SH_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShDirect() { return _columnShDirect; }
    /**
     * HM_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmStore() { return _columnHmStore; }
    /**
     * HM_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmDirect() { return _columnHmDirect; }
    /**
     * TOTAL_STORE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalStore() { return _columnTotalStore; }
    /**
     * TOTAL_DIRECT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalDirect() { return _columnTotalDirect; }
    /**
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiInclude() { return _columnKoguchiInclude; }
    /**
     * KOGUCHI_CONST: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiConst() { return _columnKoguchiConst; }
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
        ls.add(columnBldl5100Id());
        ls.add(columnYearmonth());
        ls.add(columnBaseNm());
        ls.add(columnMonth());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnShippingDt());
        ls.add(columnFwStore());
        ls.add(columnFwDirect());
        ls.add(columnUnStore());
        ls.add(columnUnDirect());
        ls.add(columnShStore());
        ls.add(columnShDirect());
        ls.add(columnHmStore());
        ls.add(columnHmDirect());
        ls.add(columnTotalStore());
        ls.add(columnTotalDirect());
        ls.add(columnKoguchiInclude());
        ls.add(columnKoguchiConst());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5100Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5100"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5100CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5100Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5100> getEntityType() { return TBldl5100.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5100 newEntity() { return new TBldl5100(); }
    public TBldl5100 newMyEntity() { return new TBldl5100(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5100)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5100)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
