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
 * The DB meta of b_func_role. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BFuncRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BFuncRoleDbm _instance = new BFuncRoleDbm();
    private BFuncRoleDbm() {}
    public static BFuncRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BFuncRole)et).getFuncRoleId(), (et, vl) -> ((BFuncRole)et).setFuncRoleId(ctl(vl)), "funcRoleId");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getFuncId(), (et, vl) -> ((BFuncRole)et).setFuncId(ctl(vl)), "funcId");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getRoleId(), (et, vl) -> ((BFuncRole)et).setRoleId(ctl(vl)), "roleId");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getUsable(), (et, vl) -> ((BFuncRole)et).setUsable((String)vl), "usable");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getDelFlg(), (et, vl) -> ((BFuncRole)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getVersionNo(), (et, vl) -> ((BFuncRole)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getControlNo(), (et, vl) -> ((BFuncRole)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getAddDt(), (et, vl) -> ((BFuncRole)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getAddUser(), (et, vl) -> ((BFuncRole)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getAddProcess(), (et, vl) -> ((BFuncRole)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getUpdDt(), (et, vl) -> ((BFuncRole)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getUpdUser(), (et, vl) -> ((BFuncRole)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BFuncRole)et).getUpdProcess(), (et, vl) -> ((BFuncRole)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BFuncRole)et).getBFunc(), (et, vl) -> ((BFuncRole)et).setBFunc((BFunc)vl), "BFunc");
        setupEfpg(_efpgMap, et -> ((BFuncRole)et).getBRole(), (et, vl) -> ((BFuncRole)et).setBRole((BRole)vl), "BRole");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "b_func_role";
    protected final String _tableDispName = "b_func_role";
    protected final String _tablePropertyName = "BFuncRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("b_func_role", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFuncRoleId = cci("FUNC_ROLE_ID", "FUNC_ROLE_ID", null, null, Long.class, "funcRoleId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFuncId = cci("FUNC_ID", "FUNC_ID", null, null, Long.class, "funcId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "BFunc", null, null, false);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, Long.class, "roleId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "BRole", null, null, false);
    protected final ColumnInfo _columnUsable = cci("USABLE", "USABLE", null, null, String.class, "usable", null, false, false, true, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * FUNC_ROLE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncRoleId() { return _columnFuncRoleId; }
    /**
     * FUNC_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_func}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFuncId() { return _columnFuncId; }
    /**
     * ROLE_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    /**
     * USABLE: {NotNull, CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUsable() { return _columnUsable; }
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
        ls.add(columnFuncRoleId());
        ls.add(columnFuncId());
        ls.add(columnRoleId());
        ls.add(columnUsable());
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
    protected UniqueInfo cpui() { return hpcpui(columnFuncRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnRoleId());
        ls.add(columnFuncId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * b_func by my FUNC_ID, named 'BFunc'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBFunc() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFuncId(), BFuncDbm.getInstance().columnFuncId());
        return cfi("B_FUNC_ROLE_FK1", "BFunc", this, BFuncDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BFuncRoleList", false);
    }
    /**
     * b_role by my ROLE_ID, named 'BRole'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBRole() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleId(), BRoleDbm.getInstance().columnRoleId());
        return cfi("B_FUNC_ROLE_FK2", "BRole", this, BRoleDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BFuncRoleList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BFuncRole"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BFuncRoleCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BFuncRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BFuncRole> getEntityType() { return BFuncRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BFuncRole newEntity() { return new BFuncRole(); }
    public BFuncRole newMyEntity() { return new BFuncRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BFuncRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BFuncRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
