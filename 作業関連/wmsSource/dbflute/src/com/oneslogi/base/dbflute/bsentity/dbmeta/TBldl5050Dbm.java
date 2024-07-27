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
 * The DB meta of t_bldl5050. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5050Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5050Dbm _instance = new TBldl5050Dbm();
    private TBldl5050Dbm() {}
    public static TBldl5050Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5050)et).getBldl5050Id(), (et, vl) -> ((TBldl5050)et).setBldl5050Id(ctl(vl)), "bldl5050Id");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getYearmonth(), (et, vl) -> ((TBldl5050)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getBaseNm(), (et, vl) -> ((TBldl5050)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getMonth(), (et, vl) -> ((TBldl5050)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getRowNo(), (et, vl) -> ((TBldl5050)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getShippingDt(), (et, vl) -> ((TBldl5050)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getFwItemCnt(), (et, vl) -> ((TBldl5050)et).setFwItemCnt(ctl(vl)), "fwItemCnt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getFwPickNum(), (et, vl) -> ((TBldl5050)et).setFwPickNum(ctl(vl)), "fwPickNum");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getFwRate(), (et, vl) -> ((TBldl5050)et).setFwRate(ctl(vl)), "fwRate");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUnItemCnt(), (et, vl) -> ((TBldl5050)et).setUnItemCnt(ctl(vl)), "unItemCnt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUnPickNum(), (et, vl) -> ((TBldl5050)et).setUnPickNum(ctl(vl)), "unPickNum");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUnRate(), (et, vl) -> ((TBldl5050)et).setUnRate(ctl(vl)), "unRate");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getShItemCnt(), (et, vl) -> ((TBldl5050)et).setShItemCnt(ctl(vl)), "shItemCnt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getShPickNum(), (et, vl) -> ((TBldl5050)et).setShPickNum(ctl(vl)), "shPickNum");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getShRate(), (et, vl) -> ((TBldl5050)et).setShRate(ctl(vl)), "shRate");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getHmItemCnt(), (et, vl) -> ((TBldl5050)et).setHmItemCnt(ctl(vl)), "hmItemCnt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getHmPickNum(), (et, vl) -> ((TBldl5050)et).setHmPickNum(ctl(vl)), "hmPickNum");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getHmRate(), (et, vl) -> ((TBldl5050)et).setHmRate(ctl(vl)), "hmRate");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getTotalItemCnt(), (et, vl) -> ((TBldl5050)et).setTotalItemCnt(ctl(vl)), "totalItemCnt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getTotalPickNum(), (et, vl) -> ((TBldl5050)et).setTotalPickNum(ctl(vl)), "totalPickNum");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getDelFlg(), (et, vl) -> ((TBldl5050)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getVersionNo(), (et, vl) -> ((TBldl5050)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getControlNo(), (et, vl) -> ((TBldl5050)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getAddDt(), (et, vl) -> ((TBldl5050)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getAddUser(), (et, vl) -> ((TBldl5050)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getAddProcess(), (et, vl) -> ((TBldl5050)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUpdDt(), (et, vl) -> ((TBldl5050)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUpdUser(), (et, vl) -> ((TBldl5050)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5050)et).getUpdProcess(), (et, vl) -> ((TBldl5050)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5050";
    protected final String _tableDispName = "t_bldl5050";
    protected final String _tablePropertyName = "TBldl5050";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5050", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5050Id = cci("BLDL5050_ID", "BLDL5050_ID", null, null, Long.class, "bldl5050Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwItemCnt = cci("FW_ITEM_CNT", "FW_ITEM_CNT", null, null, Long.class, "fwItemCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwPickNum = cci("FW_PICK_NUM", "FW_PICK_NUM", null, null, Long.class, "fwPickNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwRate = cci("FW_RATE", "FW_RATE", null, null, Long.class, "fwRate", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnItemCnt = cci("UN_ITEM_CNT", "UN_ITEM_CNT", null, null, Long.class, "unItemCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnPickNum = cci("UN_PICK_NUM", "UN_PICK_NUM", null, null, Long.class, "unPickNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnRate = cci("UN_RATE", "UN_RATE", null, null, Long.class, "unRate", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShItemCnt = cci("SH_ITEM_CNT", "SH_ITEM_CNT", null, null, Long.class, "shItemCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShPickNum = cci("SH_PICK_NUM", "SH_PICK_NUM", null, null, Long.class, "shPickNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShRate = cci("SH_RATE", "SH_RATE", null, null, Long.class, "shRate", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmItemCnt = cci("HM_ITEM_CNT", "HM_ITEM_CNT", null, null, Long.class, "hmItemCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmPickNum = cci("HM_PICK_NUM", "HM_PICK_NUM", null, null, Long.class, "hmPickNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHmRate = cci("HM_RATE", "HM_RATE", null, null, Long.class, "hmRate", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalItemCnt = cci("TOTAL_ITEM_CNT", "TOTAL_ITEM_CNT", null, null, Long.class, "totalItemCnt", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPickNum = cci("TOTAL_PICK_NUM", "TOTAL_PICK_NUM", null, null, Long.class, "totalPickNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5050Id() { return _columnBldl5050Id; }
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
     * SHIPPING_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * FW_ITEM_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwItemCnt() { return _columnFwItemCnt; }
    /**
     * FW_PICK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwPickNum() { return _columnFwPickNum; }
    /**
     * FW_RATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwRate() { return _columnFwRate; }
    /**
     * UN_ITEM_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnItemCnt() { return _columnUnItemCnt; }
    /**
     * UN_PICK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnPickNum() { return _columnUnPickNum; }
    /**
     * UN_RATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnRate() { return _columnUnRate; }
    /**
     * SH_ITEM_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShItemCnt() { return _columnShItemCnt; }
    /**
     * SH_PICK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShPickNum() { return _columnShPickNum; }
    /**
     * SH_RATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShRate() { return _columnShRate; }
    /**
     * HM_ITEM_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmItemCnt() { return _columnHmItemCnt; }
    /**
     * HM_PICK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmPickNum() { return _columnHmPickNum; }
    /**
     * HM_RATE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHmRate() { return _columnHmRate; }
    /**
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalItemCnt() { return _columnTotalItemCnt; }
    /**
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPickNum() { return _columnTotalPickNum; }
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
        ls.add(columnBldl5050Id());
        ls.add(columnYearmonth());
        ls.add(columnBaseNm());
        ls.add(columnMonth());
        ls.add(columnRowNo());
        ls.add(columnShippingDt());
        ls.add(columnFwItemCnt());
        ls.add(columnFwPickNum());
        ls.add(columnFwRate());
        ls.add(columnUnItemCnt());
        ls.add(columnUnPickNum());
        ls.add(columnUnRate());
        ls.add(columnShItemCnt());
        ls.add(columnShPickNum());
        ls.add(columnShRate());
        ls.add(columnHmItemCnt());
        ls.add(columnHmPickNum());
        ls.add(columnHmRate());
        ls.add(columnTotalItemCnt());
        ls.add(columnTotalPickNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5050Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5050"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5050CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5050Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5050> getEntityType() { return TBldl5050.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5050 newEntity() { return new TBldl5050(); }
    public TBldl5050 newMyEntity() { return new TBldl5050(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5050)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5050)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
