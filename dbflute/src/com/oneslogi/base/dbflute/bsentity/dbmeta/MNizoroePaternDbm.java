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
 * The DB meta of m_nizoroe_patern. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MNizoroePaternDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MNizoroePaternDbm _instance = new MNizoroePaternDbm();
    private MNizoroePaternDbm() {}
    public static MNizoroePaternDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getNizoroePaternId(), (et, vl) -> ((MNizoroePatern)et).setNizoroePaternId(ctl(vl)), "nizoroePaternId");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getNizoroeTypeCd(), (et, vl) -> ((MNizoroePatern)et).setNizoroeTypeCd((String)vl), "nizoroeTypeCd");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getNizoroeProcId(), (et, vl) -> ((MNizoroePatern)et).setNizoroeProcId((String)vl), "nizoroeProcId");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getNizoroeProcNm(), (et, vl) -> ((MNizoroePatern)et).setNizoroeProcNm((String)vl), "nizoroeProcNm");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getProgramId(), (et, vl) -> ((MNizoroePatern)et).setProgramId((String)vl), "programId");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getDelFlg(), (et, vl) -> ((MNizoroePatern)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getVersionNo(), (et, vl) -> ((MNizoroePatern)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getControlNo(), (et, vl) -> ((MNizoroePatern)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getAddDt(), (et, vl) -> ((MNizoroePatern)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getAddUser(), (et, vl) -> ((MNizoroePatern)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getAddProcess(), (et, vl) -> ((MNizoroePatern)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getUpdDt(), (et, vl) -> ((MNizoroePatern)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getUpdUser(), (et, vl) -> ((MNizoroePatern)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MNizoroePatern)et).getUpdProcess(), (et, vl) -> ((MNizoroePatern)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_nizoroe_patern";
    protected final String _tableDispName = "m_nizoroe_patern";
    protected final String _tablePropertyName = "MNizoroePatern";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_nizoroe_patern", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNizoroePaternId = cci("NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", null, null, Long.class, "nizoroePaternId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "MNizoroeList", null, false);
    protected final ColumnInfo _columnNizoroeTypeCd = cci("NIZOROE_TYPE_CD", "NIZOROE_TYPE_CD", null, null, String.class, "nizoroeTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeProcId = cci("NIZOROE_PROC_ID", "NIZOROE_PROC_ID", null, null, String.class, "nizoroeProcId", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeProcNm = cci("NIZOROE_PROC_NM", "NIZOROE_PROC_NM", null, null, String.class, "nizoroeProcNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProgramId = cci("PROGRAM_ID", "PROGRAM_ID", null, null, String.class, "programId", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
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
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroePaternId() { return _columnNizoroePaternId; }
    /**
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeTypeCd() { return _columnNizoroeTypeCd; }
    /**
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeProcId() { return _columnNizoroeProcId; }
    /**
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeProcNm() { return _columnNizoroeProcNm; }
    /**
     * PROGRAM_ID: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProgramId() { return _columnProgramId; }
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
        ls.add(columnNizoroePaternId());
        ls.add(columnNizoroeTypeCd());
        ls.add(columnNizoroeProcId());
        ls.add(columnNizoroeProcNm());
        ls.add(columnProgramId());
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
    protected UniqueInfo cpui() { return hpcpui(columnNizoroePaternId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnNizoroeProcId()); }

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
    /**
     * m_nizoroe by NIZOROE_PATERN_ID, named 'MNizoroeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMNizoroeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNizoroePaternId(), MNizoroeDbm.getInstance().columnNizoroePaternId());
        return cri("M_NIZOROE_FK1", "MNizoroeList", this, MNizoroeDbm.getInstance(), mp, false, "MNizoroePatern");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MNizoroePatern"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MNizoroePaternCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MNizoroePaternBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MNizoroePatern> getEntityType() { return MNizoroePatern.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MNizoroePatern newEntity() { return new MNizoroePatern(); }
    public MNizoroePatern newMyEntity() { return new MNizoroePatern(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MNizoroePatern)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MNizoroePatern)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
