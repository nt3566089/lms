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
 * The DB meta of t_bldl5150. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5150Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5150Dbm _instance = new TBldl5150Dbm();
    private TBldl5150Dbm() {}
    public static TBldl5150Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5150)et).getBldl5150Id(), (et, vl) -> ((TBldl5150)et).setBldl5150Id(ctl(vl)), "bldl5150Id");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getYearmonth(), (et, vl) -> ((TBldl5150)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getBaseNm(), (et, vl) -> ((TBldl5150)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getMonth(), (et, vl) -> ((TBldl5150)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getRowNo(), (et, vl) -> ((TBldl5150)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getReceiveDt(), (et, vl) -> ((TBldl5150)et).setReceiveDt((String)vl), "receiveDt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getFwRcvCnt(), (et, vl) -> ((TBldl5150)et).setFwRcvCnt(ctl(vl)), "fwRcvCnt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getFwRcvNum(), (et, vl) -> ((TBldl5150)et).setFwRcvNum(ctl(vl)), "fwRcvNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getFwCaseNum(), (et, vl) -> ((TBldl5150)et).setFwCaseNum(ctl(vl)), "fwCaseNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUnRcvCnt(), (et, vl) -> ((TBldl5150)et).setUnRcvCnt(ctl(vl)), "unRcvCnt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUnRcvNum(), (et, vl) -> ((TBldl5150)et).setUnRcvNum(ctl(vl)), "unRcvNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUnCaseNum(), (et, vl) -> ((TBldl5150)et).setUnCaseNum(ctl(vl)), "unCaseNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getShRcvCnt(), (et, vl) -> ((TBldl5150)et).setShRcvCnt(ctl(vl)), "shRcvCnt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getShRcvNum(), (et, vl) -> ((TBldl5150)et).setShRcvNum(ctl(vl)), "shRcvNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getShCaseNum(), (et, vl) -> ((TBldl5150)et).setShCaseNum(ctl(vl)), "shCaseNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getHmRcvCnt(), (et, vl) -> ((TBldl5150)et).setHmRcvCnt(ctl(vl)), "hmRcvCnt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getHmRcvNum(), (et, vl) -> ((TBldl5150)et).setHmRcvNum(ctl(vl)), "hmRcvNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getHmCaseNum(), (et, vl) -> ((TBldl5150)et).setHmCaseNum(ctl(vl)), "hmCaseNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getTotalRcvNum(), (et, vl) -> ((TBldl5150)et).setTotalRcvNum(ctl(vl)), "totalRcvNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getTotalCaseNum(), (et, vl) -> ((TBldl5150)et).setTotalCaseNum(ctl(vl)), "totalCaseNum");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getDelFlg(), (et, vl) -> ((TBldl5150)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getVersionNo(), (et, vl) -> ((TBldl5150)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getControlNo(), (et, vl) -> ((TBldl5150)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getAddDt(), (et, vl) -> ((TBldl5150)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getAddUser(), (et, vl) -> ((TBldl5150)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getAddProcess(), (et, vl) -> ((TBldl5150)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUpdDt(), (et, vl) -> ((TBldl5150)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUpdUser(), (et, vl) -> ((TBldl5150)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5150)et).getUpdProcess(), (et, vl) -> ((TBldl5150)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5150";
    protected final String _tableDispName = "t_bldl5150";
    protected final String _tablePropertyName = "TBldl5150";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5150", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5150Id = cci("BLDL5150_ID", "BLDL5150_ID", null, null, Long.class, "bldl5150Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDt = cci("RECEIVE_DT", "RECEIVE_DT", null, null, String.class, "receiveDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwRcvCnt = cci("FW_RCV_CNT", "FW_RCV_CNT", null, null, Long.class, "fwRcvCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwRcvNum = cci("FW_RCV_NUM", "FW_RCV_NUM", null, null, Long.class, "fwRcvNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwCaseNum = cci("FW_CASE_NUM", "FW_CASE_NUM", null, null, Long.class, "fwCaseNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnRcvCnt = cci("UN_RCV_CNT", "UN_RCV_CNT", null, null, Long.class, "unRcvCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnRcvNum = cci("UN_RCV_NUM", "UN_RCV_NUM", null, null, Long.class, "unRcvNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnCaseNum = cci("UN_CASE_NUM", "UN_CASE_NUM", null, null, Long.class, "unCaseNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShRcvCnt = cci("SH_RCV_CNT", "SH_RCV_CNT", null, null, Long.class, "shRcvCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShRcvNum = cci("SH_RCV_NUM", "SH_RCV_NUM", null, null, Long.class, "shRcvNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShCaseNum = cci("SH_CASE_NUM", "SH_CASE_NUM", null, null, Long.class, "shCaseNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmRcvCnt = cci("HM_RCV_CNT", "HM_RCV_CNT", null, null, Long.class, "hmRcvCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmRcvNum = cci("HM_RCV_NUM", "HM_RCV_NUM", null, null, Long.class, "hmRcvNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmCaseNum = cci("HM_CASE_NUM", "HM_CASE_NUM", null, null, Long.class, "hmCaseNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalRcvNum = cci("TOTAL_RCV_NUM", "TOTAL_RCV_NUM", null, null, Long.class, "totalRcvNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalCaseNum = cci("TOTAL_CASE_NUM", "TOTAL_CASE_NUM", null, null, Long.class, "totalCaseNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5150_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5150Id() { return _columnBldl5150Id; }
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
     * RECEIVE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDt() { return _columnReceiveDt; }
    /**
     * FW_RCV_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwRcvCnt() { return _columnFwRcvCnt; }
    /**
     * FW_RCV_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwRcvNum() { return _columnFwRcvNum; }
    /**
     * FW_CASE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwCaseNum() { return _columnFwCaseNum; }
    /**
     * UN_RCV_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnRcvCnt() { return _columnUnRcvCnt; }
    /**
     * UN_RCV_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnRcvNum() { return _columnUnRcvNum; }
    /**
     * UN_CASE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnCaseNum() { return _columnUnCaseNum; }
    /**
     * SH_RCV_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShRcvCnt() { return _columnShRcvCnt; }
    /**
     * SH_RCV_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShRcvNum() { return _columnShRcvNum; }
    /**
     * SH_CASE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShCaseNum() { return _columnShCaseNum; }
    /**
     * HM_RCV_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmRcvCnt() { return _columnHmRcvCnt; }
    /**
     * HM_RCV_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmRcvNum() { return _columnHmRcvNum; }
    /**
     * HM_CASE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmCaseNum() { return _columnHmCaseNum; }
    /**
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalRcvNum() { return _columnTotalRcvNum; }
    /**
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalCaseNum() { return _columnTotalCaseNum; }
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
        ls.add(columnBldl5150Id());
        ls.add(columnYearmonth());
        ls.add(columnBaseNm());
        ls.add(columnMonth());
        ls.add(columnRowNo());
        ls.add(columnReceiveDt());
        ls.add(columnFwRcvCnt());
        ls.add(columnFwRcvNum());
        ls.add(columnFwCaseNum());
        ls.add(columnUnRcvCnt());
        ls.add(columnUnRcvNum());
        ls.add(columnUnCaseNum());
        ls.add(columnShRcvCnt());
        ls.add(columnShRcvNum());
        ls.add(columnShCaseNum());
        ls.add(columnHmRcvCnt());
        ls.add(columnHmRcvNum());
        ls.add(columnHmCaseNum());
        ls.add(columnTotalRcvNum());
        ls.add(columnTotalCaseNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5150Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5150"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5150CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5150Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5150> getEntityType() { return TBldl5150.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5150 newEntity() { return new TBldl5150(); }
    public TBldl5150 newMyEntity() { return new TBldl5150(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5150)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5150)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
