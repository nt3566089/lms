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
 * The DB meta of b_password_policy. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BPasswordPolicyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BPasswordPolicyDbm _instance = new BPasswordPolicyDbm();
    private BPasswordPolicyDbm() {}
    public static BPasswordPolicyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getPasswordPolicyId(), (et, vl) -> ((BPasswordPolicy)et).setPasswordPolicyId(ctl(vl)), "passwordPolicyId");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getPasswordPolicyNm(), (et, vl) -> ((BPasswordPolicy)et).setPasswordPolicyNm((String)vl), "passwordPolicyNm");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getFirstChangeControl(), (et, vl) -> ((BPasswordPolicy)et).setFirstChangeControl((String)vl), "firstChangeControl");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinLength(), (et, vl) -> ((BPasswordPolicy)et).setMinLength(ctl(vl)), "minLength");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinAlpha(), (et, vl) -> ((BPasswordPolicy)et).setMinAlpha(ctl(vl)), "minAlpha");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinLowerCase(), (et, vl) -> ((BPasswordPolicy)et).setMinLowerCase(ctl(vl)), "minLowerCase");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinUpperCase(), (et, vl) -> ((BPasswordPolicy)et).setMinUpperCase(ctl(vl)), "minUpperCase");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinNumbers(), (et, vl) -> ((BPasswordPolicy)et).setMinNumbers(ctl(vl)), "minNumbers");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMinSymbol(), (et, vl) -> ((BPasswordPolicy)et).setMinSymbol(ctl(vl)), "minSymbol");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMaxAge(), (et, vl) -> ((BPasswordPolicy)et).setMaxAge(ctl(vl)), "maxAge");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getMaxFailure(), (et, vl) -> ((BPasswordPolicy)et).setMaxFailure(ctl(vl)), "maxFailure");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getDelFlg(), (et, vl) -> ((BPasswordPolicy)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getVersionNo(), (et, vl) -> ((BPasswordPolicy)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getControlNo(), (et, vl) -> ((BPasswordPolicy)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getAddDt(), (et, vl) -> ((BPasswordPolicy)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getAddUser(), (et, vl) -> ((BPasswordPolicy)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getAddProcess(), (et, vl) -> ((BPasswordPolicy)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getUpdDt(), (et, vl) -> ((BPasswordPolicy)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getUpdUser(), (et, vl) -> ((BPasswordPolicy)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BPasswordPolicy)et).getUpdProcess(), (et, vl) -> ((BPasswordPolicy)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "b_password_policy";
    protected final String _tableDispName = "b_password_policy";
    protected final String _tablePropertyName = "BPasswordPolicy";
    protected final TableSqlName _tableSqlName = new TableSqlName("b_password_policy", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPasswordPolicyId = cci("PASSWORD_POLICY_ID", "PASSWORD_POLICY_ID", null, null, Long.class, "passwordPolicyId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPasswordPolicyNm = cci("PASSWORD_POLICY_NM", "PASSWORD_POLICY_NM", null, null, String.class, "passwordPolicyNm", null, false, false, true, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstChangeControl = cci("FIRST_CHANGE_CONTROL", "FIRST_CHANGE_CONTROL", null, null, String.class, "firstChangeControl", null, false, false, true, "VARCHAR", 30, 0, null, "00", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinLength = cci("MIN_LENGTH", "MIN_LENGTH", null, null, Long.class, "minLength", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinAlpha = cci("MIN_ALPHA", "MIN_ALPHA", null, null, Long.class, "minAlpha", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinLowerCase = cci("MIN_LOWER_CASE", "MIN_LOWER_CASE", null, null, Long.class, "minLowerCase", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinUpperCase = cci("MIN_UPPER_CASE", "MIN_UPPER_CASE", null, null, Long.class, "minUpperCase", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinNumbers = cci("MIN_NUMBERS", "MIN_NUMBERS", null, null, Long.class, "minNumbers", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMinSymbol = cci("MIN_SYMBOL", "MIN_SYMBOL", null, null, Long.class, "minSymbol", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxAge = cci("MAX_AGE", "MAX_AGE", null, null, Long.class, "maxAge", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxFailure = cci("MAX_FAILURE", "MAX_FAILURE", null, null, Long.class, "maxFailure", null, false, false, true, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
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
     * PASSWORD_POLICY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPasswordPolicyId() { return _columnPasswordPolicyId; }
    /**
     * PASSWORD_POLICY_NM: {UQ, NotNull, VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPasswordPolicyNm() { return _columnPasswordPolicyNm; }
    /**
     * FIRST_CHANGE_CONTROL: {NotNull, VARCHAR(30), default=[00]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstChangeControl() { return _columnFirstChangeControl; }
    /**
     * MIN_LENGTH: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinLength() { return _columnMinLength; }
    /**
     * MIN_ALPHA: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinAlpha() { return _columnMinAlpha; }
    /**
     * MIN_LOWER_CASE: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinLowerCase() { return _columnMinLowerCase; }
    /**
     * MIN_UPPER_CASE: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinUpperCase() { return _columnMinUpperCase; }
    /**
     * MIN_NUMBERS: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinNumbers() { return _columnMinNumbers; }
    /**
     * MIN_SYMBOL: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMinSymbol() { return _columnMinSymbol; }
    /**
     * MAX_AGE: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxAge() { return _columnMaxAge; }
    /**
     * MAX_FAILURE: {NotNull, BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxFailure() { return _columnMaxFailure; }
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
        ls.add(columnPasswordPolicyId());
        ls.add(columnPasswordPolicyNm());
        ls.add(columnFirstChangeControl());
        ls.add(columnMinLength());
        ls.add(columnMinAlpha());
        ls.add(columnMinLowerCase());
        ls.add(columnMinUpperCase());
        ls.add(columnMinNumbers());
        ls.add(columnMinSymbol());
        ls.add(columnMaxAge());
        ls.add(columnMaxFailure());
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
    protected UniqueInfo cpui() { return hpcpui(columnPasswordPolicyId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnPasswordPolicyNm()); }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BPasswordPolicy"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BPasswordPolicyCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BPasswordPolicyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BPasswordPolicy> getEntityType() { return BPasswordPolicy.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BPasswordPolicy newEntity() { return new BPasswordPolicy(); }
    public BPasswordPolicy newMyEntity() { return new BPasswordPolicy(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BPasswordPolicy)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BPasswordPolicy)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
