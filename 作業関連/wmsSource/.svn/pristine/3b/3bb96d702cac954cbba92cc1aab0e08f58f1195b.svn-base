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
 * The DB meta of h_location_attribute. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HLocationAttributeDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HLocationAttributeDbm _instance = new HLocationAttributeDbm();
    private HLocationAttributeDbm() {}
    public static HLocationAttributeDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getLocationAttributeId(), (et, vl) -> ((HLocationAttribute)et).setLocationAttributeId(ctl(vl)), "locationAttributeId");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getCenterId(), (et, vl) -> ((HLocationAttribute)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getLocationId(), (et, vl) -> ((HLocationAttribute)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getHistNo(), (et, vl) -> ((HLocationAttribute)et).setHistNo(ctl(vl)), "histNo");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getPrevLocationHist(), (et, vl) -> ((HLocationAttribute)et).setPrevLocationHist((String)vl), "prevLocationHist");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getCurtLocationHist(), (et, vl) -> ((HLocationAttribute)et).setCurtLocationHist((String)vl), "curtLocationHist");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getHistDt(), (et, vl) -> ((HLocationAttribute)et).setHistDt((String)vl), "histDt");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getDelFlg(), (et, vl) -> ((HLocationAttribute)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getVersionNo(), (et, vl) -> ((HLocationAttribute)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getControlNo(), (et, vl) -> ((HLocationAttribute)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getAddDt(), (et, vl) -> ((HLocationAttribute)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getAddUser(), (et, vl) -> ((HLocationAttribute)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getAddProcess(), (et, vl) -> ((HLocationAttribute)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getUpdDt(), (et, vl) -> ((HLocationAttribute)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getUpdUser(), (et, vl) -> ((HLocationAttribute)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HLocationAttribute)et).getUpdProcess(), (et, vl) -> ((HLocationAttribute)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((HLocationAttribute)et).getMCenter(), (et, vl) -> ((HLocationAttribute)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((HLocationAttribute)et).getMLocation(), (et, vl) -> ((HLocationAttribute)et).setMLocation((MLocation)vl), "MLocation");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "h_location_attribute";
    protected final String _tableDispName = "h_location_attribute";
    protected final String _tablePropertyName = "HLocationAttribute";
    protected final TableSqlName _tableSqlName = new TableSqlName("h_location_attribute", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationAttributeId = cci("LOCATION_ATTRIBUTE_ID", "LOCATION_ATTRIBUTE_ID", null, null, Long.class, "locationAttributeId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnHistNo = cci("HIST_NO", "HIST_NO", null, null, Long.class, "histNo", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrevLocationHist = cci("PREV_LOCATION_HIST", "PREV_LOCATION_HIST", null, null, String.class, "prevLocationHist", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCurtLocationHist = cci("CURT_LOCATION_HIST", "CURT_LOCATION_HIST", null, null, String.class, "curtLocationHist", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHistDt = cci("HIST_DT", "HIST_DT", null, null, String.class, "histDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * LOCATION_ATTRIBUTE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationAttributeId() { return _columnLocationAttributeId; }
    /**
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * HIST_NO: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistNo() { return _columnHistNo; }
    /**
     * PREV_LOCATION_HIST: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrevLocationHist() { return _columnPrevLocationHist; }
    /**
     * CURT_LOCATION_HIST: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCurtLocationHist() { return _columnCurtLocationHist; }
    /**
     * HIST_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHistDt() { return _columnHistDt; }
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
        ls.add(columnLocationAttributeId());
        ls.add(columnCenterId());
        ls.add(columnLocationId());
        ls.add(columnHistNo());
        ls.add(columnPrevLocationHist());
        ls.add(columnCurtLocationHist());
        ls.add(columnHistDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnLocationAttributeId()); }
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
        return cfi("H_LOCATION_ATTRIBUTE_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "HLocationAttributeList", false);
    }
    /**
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("H_LOCATION_ATTRIBUTE_FK2", "MLocation", this, MLocationDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "HLocationAttributeList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HLocationAttribute"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HLocationAttributeCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HLocationAttributeBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HLocationAttribute> getEntityType() { return HLocationAttribute.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HLocationAttribute newEntity() { return new HLocationAttribute(); }
    public HLocationAttribute newMyEntity() { return new HLocationAttribute(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HLocationAttribute)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HLocationAttribute)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
