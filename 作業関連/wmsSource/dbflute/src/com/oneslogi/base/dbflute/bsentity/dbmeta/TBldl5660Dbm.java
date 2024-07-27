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
 * The DB meta of t_bldl5660. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5660Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5660Dbm _instance = new TBldl5660Dbm();
    private TBldl5660Dbm() {}
    public static TBldl5660Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5660)et).getBldl5660Id(), (et, vl) -> ((TBldl5660)et).setBldl5660Id(ctl(vl)), "bldl5660Id");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getYearmonth(), (et, vl) -> ((TBldl5660)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getBaseNm(), (et, vl) -> ((TBldl5660)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getMonth(), (et, vl) -> ((TBldl5660)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getRowNo(), (et, vl) -> ((TBldl5660)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getShippingDt(), (et, vl) -> ((TBldl5660)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getFwShippingCnt(), (et, vl) -> ((TBldl5660)et).setFwShippingCnt(ctl(vl)), "fwShippingCnt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getFwShippingNum(), (et, vl) -> ((TBldl5660)et).setFwShippingNum(ctl(vl)), "fwShippingNum");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getShShippingCnt(), (et, vl) -> ((TBldl5660)et).setShShippingCnt(ctl(vl)), "shShippingCnt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getShShippingNum(), (et, vl) -> ((TBldl5660)et).setShShippingNum(ctl(vl)), "shShippingNum");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getHmShippingCnt(), (et, vl) -> ((TBldl5660)et).setHmShippingCnt(ctl(vl)), "hmShippingCnt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getHmShippingNum(), (et, vl) -> ((TBldl5660)et).setHmShippingNum(ctl(vl)), "hmShippingNum");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getTotalShippingCnt(), (et, vl) -> ((TBldl5660)et).setTotalShippingCnt(ctl(vl)), "totalShippingCnt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getTotalShippingNum(), (et, vl) -> ((TBldl5660)et).setTotalShippingNum(ctl(vl)), "totalShippingNum");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getDelFlg(), (et, vl) -> ((TBldl5660)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getVersionNo(), (et, vl) -> ((TBldl5660)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getControlNo(), (et, vl) -> ((TBldl5660)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getAddDt(), (et, vl) -> ((TBldl5660)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getAddUser(), (et, vl) -> ((TBldl5660)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getAddProcess(), (et, vl) -> ((TBldl5660)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getUpdDt(), (et, vl) -> ((TBldl5660)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getUpdUser(), (et, vl) -> ((TBldl5660)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5660)et).getUpdProcess(), (et, vl) -> ((TBldl5660)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5660";
    protected final String _tableDispName = "t_bldl5660";
    protected final String _tablePropertyName = "TBldl5660";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5660", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5660Id = cci("BLDL5660_ID", "BLDL5660_ID", null, null, Long.class, "bldl5660Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwShippingCnt = cci("FW_SHIPPING_CNT", "FW_SHIPPING_CNT", null, null, Long.class, "fwShippingCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwShippingNum = cci("FW_SHIPPING_NUM", "FW_SHIPPING_NUM", null, null, Long.class, "fwShippingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShShippingCnt = cci("SH_SHIPPING_CNT", "SH_SHIPPING_CNT", null, null, Long.class, "shShippingCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShShippingNum = cci("SH_SHIPPING_NUM", "SH_SHIPPING_NUM", null, null, Long.class, "shShippingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmShippingCnt = cci("HM_SHIPPING_CNT", "HM_SHIPPING_CNT", null, null, Long.class, "hmShippingCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmShippingNum = cci("HM_SHIPPING_NUM", "HM_SHIPPING_NUM", null, null, Long.class, "hmShippingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalShippingCnt = cci("TOTAL_SHIPPING_CNT", "TOTAL_SHIPPING_CNT", null, null, Long.class, "totalShippingCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalShippingNum = cci("TOTAL_SHIPPING_NUM", "TOTAL_SHIPPING_NUM", null, null, Long.class, "totalShippingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5660_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5660Id() { return _columnBldl5660Id; }
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
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwShippingCnt() { return _columnFwShippingCnt; }
    /**
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwShippingNum() { return _columnFwShippingNum; }
    /**
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShShippingCnt() { return _columnShShippingCnt; }
    /**
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShShippingNum() { return _columnShShippingNum; }
    /**
     * HM_SHIPPING_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmShippingCnt() { return _columnHmShippingCnt; }
    /**
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmShippingNum() { return _columnHmShippingNum; }
    /**
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalShippingCnt() { return _columnTotalShippingCnt; }
    /**
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalShippingNum() { return _columnTotalShippingNum; }
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
        ls.add(columnBldl5660Id());
        ls.add(columnYearmonth());
        ls.add(columnBaseNm());
        ls.add(columnMonth());
        ls.add(columnRowNo());
        ls.add(columnShippingDt());
        ls.add(columnFwShippingCnt());
        ls.add(columnFwShippingNum());
        ls.add(columnShShippingCnt());
        ls.add(columnShShippingNum());
        ls.add(columnHmShippingCnt());
        ls.add(columnHmShippingNum());
        ls.add(columnTotalShippingCnt());
        ls.add(columnTotalShippingNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5660Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5660"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5660CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5660Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5660> getEntityType() { return TBldl5660.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5660 newEntity() { return new TBldl5660(); }
    public TBldl5660 newMyEntity() { return new TBldl5660(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5660)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5660)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
