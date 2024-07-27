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
 * The DB meta of m_nizoroe. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MNizoroeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MNizoroeDbm _instance = new MNizoroeDbm();
    private MNizoroeDbm() {}
    public static MNizoroeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MNizoroe)et).getNizoroeId(), (et, vl) -> ((MNizoroe)et).setNizoroeId(ctl(vl)), "nizoroeId");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getCenterId(), (et, vl) -> ((MNizoroe)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getBaseCd(), (et, vl) -> ((MNizoroe)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getNizoroePaternId(), (et, vl) -> ((MNizoroe)et).setNizoroePaternId(ctl(vl)), "nizoroePaternId");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getDelFlg(), (et, vl) -> ((MNizoroe)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getVersionNo(), (et, vl) -> ((MNizoroe)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getControlNo(), (et, vl) -> ((MNizoroe)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getAddDt(), (et, vl) -> ((MNizoroe)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getAddUser(), (et, vl) -> ((MNizoroe)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getAddProcess(), (et, vl) -> ((MNizoroe)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getUpdDt(), (et, vl) -> ((MNizoroe)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getUpdUser(), (et, vl) -> ((MNizoroe)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MNizoroe)et).getUpdProcess(), (et, vl) -> ((MNizoroe)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MNizoroe)et).getMCenter(), (et, vl) -> ((MNizoroe)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MNizoroe)et).getMNizoroePatern(), (et, vl) -> ((MNizoroe)et).setMNizoroePatern((MNizoroePatern)vl), "MNizoroePatern");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_nizoroe";
    protected final String _tableDispName = "m_nizoroe";
    protected final String _tablePropertyName = "MNizoroe";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_nizoroe", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNizoroeId = cci("NIZOROE_ID", "NIZOROE_ID", null, null, Long.class, "nizoroeId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroePaternId = cci("NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", null, null, Long.class, "nizoroePaternId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MNizoroePatern", null, null, false);
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
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * NIZOROE_PATERN_ID: {IX, BIGINT(19), FK to m_nizoroe_patern}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroePaternId() { return _columnNizoroePaternId; }
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
        ls.add(columnCenterId());
        ls.add(columnBaseCd());
        ls.add(columnNizoroePaternId());
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
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_NIZOROE_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MNizoroeList", false);
    }
    /**
     * m_nizoroe_patern by my NIZOROE_PATERN_ID, named 'MNizoroePatern'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMNizoroePatern() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNizoroePaternId(), MNizoroePaternDbm.getInstance().columnNizoroePaternId());
        return cfi("M_NIZOROE_FK1", "MNizoroePatern", this, MNizoroePaternDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MNizoroeList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MNizoroe"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MNizoroeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MNizoroeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MNizoroe> getEntityType() { return MNizoroe.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MNizoroe newEntity() { return new MNizoroe(); }
    public MNizoroe newMyEntity() { return new MNizoroe(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MNizoroe)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MNizoroe)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
