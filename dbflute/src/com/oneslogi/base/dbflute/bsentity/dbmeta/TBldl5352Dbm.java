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
 * The DB meta of t_bldl5352. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5352Dbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TBldl5352Dbm _instance = new TBldl5352Dbm();
    private TBldl5352Dbm() {}
    public static TBldl5352Dbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TBldl5352)et).getBldl5352Id(), (et, vl) -> ((TBldl5352)et).setBldl5352Id(ctl(vl)), "bldl5352Id");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getYearmonth(), (et, vl) -> ((TBldl5352)et).setYearmonth((String)vl), "yearmonth");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getMonth(), (et, vl) -> ((TBldl5352)et).setMonth((String)vl), "month");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSalesOrgCd(), (et, vl) -> ((TBldl5352)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSalesOrgNm(), (et, vl) -> ((TBldl5352)et).setSalesOrgNm((String)vl), "salesOrgNm");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getRowNo(), (et, vl) -> ((TBldl5352)et).setRowNo((String)vl), "rowNo");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getDate(), (et, vl) -> ((TBldl5352)et).setDate((String)vl), "date");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getHoliday(), (et, vl) -> ((TBldl5352)et).setHoliday((String)vl), "holiday");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSoukaFwNum(), (et, vl) -> ((TBldl5352)et).setSoukaFwNum(ctl(vl)), "soukaFwNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSoukaUnNum(), (et, vl) -> ((TBldl5352)et).setSoukaUnNum(ctl(vl)), "soukaUnNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSoukaShNum(), (et, vl) -> ((TBldl5352)et).setSoukaShNum(ctl(vl)), "soukaShNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getSoukaTotalNum(), (et, vl) -> ((TBldl5352)et).setSoukaTotalNum(ctl(vl)), "soukaTotalNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getKoshigayaFwNum(), (et, vl) -> ((TBldl5352)et).setKoshigayaFwNum(ctl(vl)), "koshigayaFwNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getKoshigayaUnNum(), (et, vl) -> ((TBldl5352)et).setKoshigayaUnNum(ctl(vl)), "koshigayaUnNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getKoshigayaShNum(), (et, vl) -> ((TBldl5352)et).setKoshigayaShNum(ctl(vl)), "koshigayaShNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getKoshigayaTotalNum(), (et, vl) -> ((TBldl5352)et).setKoshigayaTotalNum(ctl(vl)), "koshigayaTotalNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getTotalNum(), (et, vl) -> ((TBldl5352)et).setTotalNum(ctl(vl)), "totalNum");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getDelFlg(), (et, vl) -> ((TBldl5352)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getVersionNo(), (et, vl) -> ((TBldl5352)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getControlNo(), (et, vl) -> ((TBldl5352)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getAddDt(), (et, vl) -> ((TBldl5352)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getAddUser(), (et, vl) -> ((TBldl5352)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getAddProcess(), (et, vl) -> ((TBldl5352)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getUpdDt(), (et, vl) -> ((TBldl5352)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getUpdUser(), (et, vl) -> ((TBldl5352)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TBldl5352)et).getUpdProcess(), (et, vl) -> ((TBldl5352)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_bldl5352";
    protected final String _tableDispName = "t_bldl5352";
    protected final String _tablePropertyName = "TBldl5352";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_bldl5352", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBldl5352Id = cci("BLDL5352_ID", "BLDL5352_ID", null, null, Long.class, "bldl5352Id", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnYearmonth = cci("YEARMONTH", "YEARMONTH", null, null, String.class, "yearmonth", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMonth = cci("MONTH", "MONTH", null, null, String.class, "month", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgNm = cci("SALES_ORG_NM", "SALES_ORG_NM", null, null, String.class, "salesOrgNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRowNo = cci("ROW_NO", "ROW_NO", null, null, String.class, "rowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDate = cci("DATE", "DATE", null, null, String.class, "date", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHoliday = cci("HOLIDAY", "HOLIDAY", null, null, String.class, "holiday", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoukaFwNum = cci("SOUKA_FW_NUM", "SOUKA_FW_NUM", null, null, Long.class, "soukaFwNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoukaUnNum = cci("SOUKA_UN_NUM", "SOUKA_UN_NUM", null, null, Long.class, "soukaUnNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoukaShNum = cci("SOUKA_SH_NUM", "SOUKA_SH_NUM", null, null, Long.class, "soukaShNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSoukaTotalNum = cci("SOUKA_TOTAL_NUM", "SOUKA_TOTAL_NUM", null, null, Long.class, "soukaTotalNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoshigayaFwNum = cci("KOSHIGAYA_FW_NUM", "KOSHIGAYA_FW_NUM", null, null, Long.class, "koshigayaFwNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoshigayaUnNum = cci("KOSHIGAYA_UN_NUM", "KOSHIGAYA_UN_NUM", null, null, Long.class, "koshigayaUnNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoshigayaShNum = cci("KOSHIGAYA_SH_NUM", "KOSHIGAYA_SH_NUM", null, null, Long.class, "koshigayaShNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoshigayaTotalNum = cci("KOSHIGAYA_TOTAL_NUM", "KOSHIGAYA_TOTAL_NUM", null, null, Long.class, "koshigayaTotalNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalNum = cci("TOTAL_NUM", "TOTAL_NUM", null, null, Long.class, "totalNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * BLDL5352_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBldl5352Id() { return _columnBldl5352Id; }
    /**
     * YEARMONTH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnYearmonth() { return _columnYearmonth; }
    /**
     * MONTH: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMonth() { return _columnMonth; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * SALES_ORG_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgNm() { return _columnSalesOrgNm; }
    /**
     * ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRowNo() { return _columnRowNo; }
    /**
     * DATE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDate() { return _columnDate; }
    /**
     * HOLIDAY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHoliday() { return _columnHoliday; }
    /**
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoukaFwNum() { return _columnSoukaFwNum; }
    /**
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoukaUnNum() { return _columnSoukaUnNum; }
    /**
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoukaShNum() { return _columnSoukaShNum; }
    /**
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSoukaTotalNum() { return _columnSoukaTotalNum; }
    /**
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoshigayaFwNum() { return _columnKoshigayaFwNum; }
    /**
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoshigayaUnNum() { return _columnKoshigayaUnNum; }
    /**
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoshigayaShNum() { return _columnKoshigayaShNum; }
    /**
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoshigayaTotalNum() { return _columnKoshigayaTotalNum; }
    /**
     * TOTAL_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalNum() { return _columnTotalNum; }
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
        ls.add(columnBldl5352Id());
        ls.add(columnYearmonth());
        ls.add(columnMonth());
        ls.add(columnSalesOrgCd());
        ls.add(columnSalesOrgNm());
        ls.add(columnRowNo());
        ls.add(columnDate());
        ls.add(columnHoliday());
        ls.add(columnSoukaFwNum());
        ls.add(columnSoukaUnNum());
        ls.add(columnSoukaShNum());
        ls.add(columnSoukaTotalNum());
        ls.add(columnKoshigayaFwNum());
        ls.add(columnKoshigayaUnNum());
        ls.add(columnKoshigayaShNum());
        ls.add(columnKoshigayaTotalNum());
        ls.add(columnTotalNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnBldl5352Id()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TBldl5352"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TBldl5352CB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TBldl5352Bhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TBldl5352> getEntityType() { return TBldl5352.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TBldl5352 newEntity() { return new TBldl5352(); }
    public TBldl5352 newMyEntity() { return new TBldl5352(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TBldl5352)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TBldl5352)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}