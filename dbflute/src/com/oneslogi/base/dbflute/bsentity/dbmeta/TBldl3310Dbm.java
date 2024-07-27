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
 * The DB meta of t_bldl3310. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl3310Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl3310Dbm _instance = new TBldl3310Dbm();
    private TBldl3310Dbm() {}
    public static TBldl3310Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl3310)et).getBldl3310Id(), (et, vl) -> ((TBldl3310)et).setBldl3310Id(ctl(vl)), "bldl3310Id");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getYearmonth(), (et, vl) -> ((TBldl3310)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getBaseNm(), (et, vl) -> ((TBldl3310)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getMonth(), (et, vl) -> ((TBldl3310)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getContractorNm(), (et, vl) -> ((TBldl3310)et).setContractorNm((String)vl), "contractorNm");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getEcTypeCd(), (et, vl) -> ((TBldl3310)et).setEcTypeCd((String)vl), "ecTypeCd");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getFwPrice(), (et, vl) -> ((TBldl3310)et).setFwPrice(ctl(vl)), "fwPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getSanshaFwPrice(), (et, vl) -> ((TBldl3310)et).setSanshaFwPrice(ctl(vl)), "sanshaFwPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getSanshaUnPrice(), (et, vl) -> ((TBldl3310)et).setSanshaUnPrice(ctl(vl)), "sanshaUnPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getSanshaShPrice(), (et, vl) -> ((TBldl3310)et).setSanshaShPrice(ctl(vl)), "sanshaShPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getSanshaHmPrice(), (et, vl) -> ((TBldl3310)et).setSanshaHmPrice(ctl(vl)), "sanshaHmPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getSanshaTotalPrice(), (et, vl) -> ((TBldl3310)et).setSanshaTotalPrice(ctl(vl)), "sanshaTotalPrice");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getDelFlg(), (et, vl) -> ((TBldl3310)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getVersionNo(), (et, vl) -> ((TBldl3310)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getControlNo(), (et, vl) -> ((TBldl3310)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getAddDt(), (et, vl) -> ((TBldl3310)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getAddUser(), (et, vl) -> ((TBldl3310)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getAddProcess(), (et, vl) -> ((TBldl3310)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getUpdDt(), (et, vl) -> ((TBldl3310)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getUpdUser(), (et, vl) -> ((TBldl3310)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl3310)et).getUpdProcess(), (et, vl) -> ((TBldl3310)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl3310";
    protected final String _tableDispName = "t_bldl3310";
    protected final String _tablePropertyName = "TBldl3310";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl3310", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl3310Id = cci("BLDL3310_ID", "BLDL3310_ID", null, null, Long.class, "bldl3310Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnContractorNm = cci("CONTRACTOR_NM", "CONTRACTOR_NM", null, null, String.class, "contractorNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcTypeCd = cci("EC_TYPE_CD", "EC_TYPE_CD", null, null, String.class, "ecTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFwPrice = cci("FW_PRICE", "FW_PRICE", null, null, Long.class, "fwPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaFwPrice = cci("SANSHA_FW_PRICE", "SANSHA_FW_PRICE", null, null, Long.class, "sanshaFwPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaUnPrice = cci("SANSHA_UN_PRICE", "SANSHA_UN_PRICE", null, null, Long.class, "sanshaUnPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaShPrice = cci("SANSHA_SH_PRICE", "SANSHA_SH_PRICE", null, null, Long.class, "sanshaShPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaHmPrice = cci("SANSHA_HM_PRICE", "SANSHA_HM_PRICE", null, null, Long.class, "sanshaHmPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaTotalPrice = cci("SANSHA_TOTAL_PRICE", "SANSHA_TOTAL_PRICE", null, null, Long.class, "sanshaTotalPrice", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl3310Id() { return _columnBldl3310Id; }
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
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnContractorNm() { return _columnContractorNm; }
    /**
     * EC_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcTypeCd() { return _columnEcTypeCd; }
    /**
     * FW_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFwPrice() { return _columnFwPrice; }
    /**
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaFwPrice() { return _columnSanshaFwPrice; }
    /**
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaUnPrice() { return _columnSanshaUnPrice; }
    /**
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaShPrice() { return _columnSanshaShPrice; }
    /**
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaHmPrice() { return _columnSanshaHmPrice; }
    /**
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaTotalPrice() { return _columnSanshaTotalPrice; }
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
        ls.add(columnBldl3310Id());
        ls.add(columnYearmonth());
        ls.add(columnBaseNm());
        ls.add(columnMonth());
        ls.add(columnContractorNm());
        ls.add(columnEcTypeCd());
        ls.add(columnFwPrice());
        ls.add(columnSanshaFwPrice());
        ls.add(columnSanshaUnPrice());
        ls.add(columnSanshaShPrice());
        ls.add(columnSanshaHmPrice());
        ls.add(columnSanshaTotalPrice());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl3310Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl3310"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl3310CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl3310Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl3310> getEntityType() { return TBldl3310.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl3310 newEntity() { return new TBldl3310(); }
    public TBldl3310 newMyEntity() { return new TBldl3310(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl3310)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl3310)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}