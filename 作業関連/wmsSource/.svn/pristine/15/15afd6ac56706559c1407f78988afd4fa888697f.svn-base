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
 * The DB meta of t_nizoroe. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TNizoroeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TNizoroeDbm _instance = new TNizoroeDbm();
    private TNizoroeDbm() {}
    public static TNizoroeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TNizoroe)et).getNizoroeId(), (et, vl) -> ((TNizoroe)et).setNizoroeId(ctl(vl)), "nizoroeId");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getBaseCd(), (et, vl) -> ((TNizoroe)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getNizoroeProcUnit(), (et, vl) -> ((TNizoroe)et).setNizoroeProcUnit((String)vl), "nizoroeProcUnit");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getNizoroeTypeCd(), (et, vl) -> ((TNizoroe)et).setNizoroeTypeCd((String)vl), "nizoroeTypeCd");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getStatus(), (et, vl) -> ((TNizoroe)et).setStatus((String)vl), "status");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getProcDt(), (et, vl) -> ((TNizoroe)et).setProcDt((String)vl), "procDt");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getProcStartTime(), (et, vl) -> ((TNizoroe)et).setProcStartTime(cttp(vl)), "procStartTime");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getProcEndTime(), (et, vl) -> ((TNizoroe)et).setProcEndTime(cttp(vl)), "procEndTime");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getDelFlg(), (et, vl) -> ((TNizoroe)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getVersionNo(), (et, vl) -> ((TNizoroe)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getControlNo(), (et, vl) -> ((TNizoroe)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getAddDt(), (et, vl) -> ((TNizoroe)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getAddUser(), (et, vl) -> ((TNizoroe)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getAddProcess(), (et, vl) -> ((TNizoroe)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getUpdDt(), (et, vl) -> ((TNizoroe)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getUpdUser(), (et, vl) -> ((TNizoroe)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TNizoroe)et).getUpdProcess(), (et, vl) -> ((TNizoroe)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_nizoroe";
    protected final String _tableDispName = "t_nizoroe";
    protected final String _tablePropertyName = "TNizoroe";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_nizoroe", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNizoroeId = cci("NIZOROE_ID", "NIZOROE_ID", null, null, Long.class, "nizoroeId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeProcUnit = cci("NIZOROE_PROC_UNIT", "NIZOROE_PROC_UNIT", null, null, String.class, "nizoroeProcUnit", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeTypeCd = cci("NIZOROE_TYPE_CD", "NIZOROE_TYPE_CD", null, null, String.class, "nizoroeTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStatus = cci("STATUS", "STATUS", null, null, String.class, "status", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcDt = cci("PROC_DT", "PROC_DT", null, null, String.class, "procDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcStartTime = cci("PROC_START_TIME", "PROC_START_TIME", null, null, java.sql.Timestamp.class, "procStartTime", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcEndTime = cci("PROC_END_TIME", "PROC_END_TIME", null, null, java.sql.Timestamp.class, "procEndTime", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
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
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeId() { return _columnNizoroeId; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeProcUnit() { return _columnNizoroeProcUnit; }
    /**
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeTypeCd() { return _columnNizoroeTypeCd; }
    /**
     * STATUS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStatus() { return _columnStatus; }
    /**
     * PROC_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcDt() { return _columnProcDt; }
    /**
     * PROC_START_TIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcStartTime() { return _columnProcStartTime; }
    /**
     * PROC_END_TIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcEndTime() { return _columnProcEndTime; }
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
        ls.add(columnNizoroeId());
        ls.add(columnBaseCd());
        ls.add(columnNizoroeProcUnit());
        ls.add(columnNizoroeTypeCd());
        ls.add(columnStatus());
        ls.add(columnProcDt());
        ls.add(columnProcStartTime());
        ls.add(columnProcEndTime());
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
    protected UniqueInfo cpui() { return hpcpui(columnNizoroeId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TNizoroe"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TNizoroeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TNizoroeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TNizoroe> getEntityType() { return TNizoroe.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TNizoroe newEntity() { return new TNizoroe(); }
    public TNizoroe newMyEntity() { return new TNizoroe(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TNizoroe)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TNizoroe)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
