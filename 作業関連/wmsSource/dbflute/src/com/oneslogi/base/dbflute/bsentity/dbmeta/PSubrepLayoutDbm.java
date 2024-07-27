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
 * The DB meta of p_subrep_layout. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PSubrepLayoutDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PSubrepLayoutDbm _instance = new PSubrepLayoutDbm();
    private PSubrepLayoutDbm() {}
    public static PSubrepLayoutDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getSubrepLayoutId(), (et, vl) -> ((PSubrepLayout)et).setSubrepLayoutId(ctl(vl)), "subrepLayoutId");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getReportLayoutId(), (et, vl) -> ((PSubrepLayout)et).setReportLayoutId(ctl(vl)), "reportLayoutId");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getSubrepLayoutData(), (et, vl) -> ((PSubrepLayout)et).setSubrepLayoutData((String)vl), "subrepLayoutData");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getDelFlg(), (et, vl) -> ((PSubrepLayout)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getVersionNo(), (et, vl) -> ((PSubrepLayout)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getControlNo(), (et, vl) -> ((PSubrepLayout)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getAddDt(), (et, vl) -> ((PSubrepLayout)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getAddUser(), (et, vl) -> ((PSubrepLayout)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getAddProcess(), (et, vl) -> ((PSubrepLayout)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getUpdDt(), (et, vl) -> ((PSubrepLayout)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getUpdUser(), (et, vl) -> ((PSubrepLayout)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((PSubrepLayout)et).getUpdProcess(), (et, vl) -> ((PSubrepLayout)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PSubrepLayout)et).getPReportLayout(), (et, vl) -> ((PSubrepLayout)et).setPReportLayout((PReportLayout)vl), "PReportLayout");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "p_subrep_layout";
    protected final String _tableDispName = "p_subrep_layout";
    protected final String _tablePropertyName = "PSubrepLayout";
    protected final TableSqlName _tableSqlName = new TableSqlName("p_subrep_layout", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSubrepLayoutId = cci("SUBREP_LAYOUT_ID", "SUBREP_LAYOUT_ID", null, null, Long.class, "subrepLayoutId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "PSubrepLayoutItemList", null, false);
    protected final ColumnInfo _columnReportLayoutId = cci("REPORT_LAYOUT_ID", "REPORT_LAYOUT_ID", null, null, Long.class, "reportLayoutId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "PReportLayout", null, null, false);
    protected final ColumnInfo _columnSubrepLayoutData = cci("SUBREP_LAYOUT_DATA", "SUBREP_LAYOUT_DATA", null, null, String.class, "subrepLayoutData", null, false, false, true, "LONGTEXT", 2147483647, 0, null, null, false, null, null, null, null, null, false);
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
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutId() { return _columnSubrepLayoutId; }
    /**
     * REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportLayoutId() { return _columnReportLayoutId; }
    /**
     * SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubrepLayoutData() { return _columnSubrepLayoutData; }
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
        ls.add(columnSubrepLayoutId());
        ls.add(columnReportLayoutId());
        ls.add(columnSubrepLayoutData());
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
    protected UniqueInfo cpui() { return hpcpui(columnSubrepLayoutId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnReportLayoutId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPReportLayout() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReportLayoutId(), PReportLayoutDbm.getInstance().columnReportLayoutId());
        return cfi("P_SUBREP_LAYOUT_FK1", "PReportLayout", this, PReportLayoutDbm.getInstance(), mp, 0, null, true, false, false, false, null, null, false, "PSubrepLayoutAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * p_subrep_layout_item by SUBREP_LAYOUT_ID, named 'PSubrepLayoutItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPSubrepLayoutItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSubrepLayoutId(), PSubrepLayoutItemDbm.getInstance().columnSubrepLayoutId());
        return cri("P_SUBREP_LAYOUT_ITEM_FK1", "PSubrepLayoutItemList", this, PSubrepLayoutItemDbm.getInstance(), mp, false, "PSubrepLayout");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.PSubrepLayout"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.PSubrepLayoutCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.PSubrepLayoutBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PSubrepLayout> getEntityType() { return PSubrepLayout.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PSubrepLayout newEntity() { return new PSubrepLayout(); }
    public PSubrepLayout newMyEntity() { return new PSubrepLayout(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PSubrepLayout)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PSubrepLayout)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
