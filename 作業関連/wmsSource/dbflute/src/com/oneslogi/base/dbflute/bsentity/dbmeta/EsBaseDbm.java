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
 * The DB meta of es_base. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EsBaseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EsBaseDbm _instance = new EsBaseDbm();
    private EsBaseDbm() {}
    public static EsBaseDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EsBase)et).getBaseId(), (et, vl) -> ((EsBase)et).setBaseId(ctl(vl)), "baseId");
        setupEpg(_epgMap, et -> ((EsBase)et).getSendFlg(), (et, vl) -> ((EsBase)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((EsBase)et).getBaseCd(), (et, vl) -> ((EsBase)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((EsBase)et).getBaseNm(), (et, vl) -> ((EsBase)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((EsBase)et).getBaseTypeCd(), (et, vl) -> ((EsBase)et).setBaseTypeCd((String)vl), "baseTypeCd");
        setupEpg(_epgMap, et -> ((EsBase)et).getForeignFlg(), (et, vl) -> ((EsBase)et).setForeignFlg((String)vl), "foreignFlg");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddYyyy(), (et, vl) -> ((EsBase)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddMm(), (et, vl) -> ((EsBase)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddDd(), (et, vl) -> ((EsBase)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddHh(), (et, vl) -> ((EsBase)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddMi(), (et, vl) -> ((EsBase)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddSs(), (et, vl) -> ((EsBase)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapAddUserCd(), (et, vl) -> ((EsBase)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdYyyy(), (et, vl) -> ((EsBase)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdMm(), (et, vl) -> ((EsBase)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdDd(), (et, vl) -> ((EsBase)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdHh(), (et, vl) -> ((EsBase)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdMi(), (et, vl) -> ((EsBase)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdSs(), (et, vl) -> ((EsBase)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EsBase)et).getSapUpdUserCd(), (et, vl) -> ((EsBase)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EsBase)et).getSpareStr(), (et, vl) -> ((EsBase)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EsBase)et).getDelFlg(), (et, vl) -> ((EsBase)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EsBase)et).getVersionNo(), (et, vl) -> ((EsBase)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EsBase)et).getControlNo(), (et, vl) -> ((EsBase)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EsBase)et).getAddDt(), (et, vl) -> ((EsBase)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EsBase)et).getAddUser(), (et, vl) -> ((EsBase)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EsBase)et).getAddProcess(), (et, vl) -> ((EsBase)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EsBase)et).getUpdDt(), (et, vl) -> ((EsBase)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EsBase)et).getUpdUser(), (et, vl) -> ((EsBase)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EsBase)et).getUpdProcess(), (et, vl) -> ((EsBase)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "es_base";
    protected final String _tableDispName = "es_base";
    protected final String _tablePropertyName = "esBase";
    protected final TableSqlName _tableSqlName = new TableSqlName("es_base", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBaseId = cci("BASE_ID", "BASE_ID", null, null, Long.class, "baseId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseTypeCd = cci("BASE_TYPE_CD", "BASE_TYPE_CD", null, null, String.class, "baseTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForeignFlg = cci("FOREIGN_FLG", "FOREIGN_FLG", null, null, String.class, "foreignFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserCd = cci("SAP_ADD_USER_CD", "SAP_ADD_USER_CD", null, null, String.class, "sapAddUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserCd = cci("SAP_UPD_USER_CD", "SAP_UPD_USER_CD", null, null, String.class, "sapUpdUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * BASE_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseId() { return _columnBaseId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * BASE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseNm() { return _columnBaseNm; }
    /**
     * BASE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseTypeCd() { return _columnBaseTypeCd; }
    /**
     * FOREIGN_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForeignFlg() { return _columnForeignFlg; }
    /**
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddYyyy() { return _columnSapAddYyyy; }
    /**
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMm() { return _columnSapAddMm; }
    /**
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddDd() { return _columnSapAddDd; }
    /**
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddHh() { return _columnSapAddHh; }
    /**
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMi() { return _columnSapAddMi; }
    /**
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddSs() { return _columnSapAddSs; }
    /**
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserCd() { return _columnSapAddUserCd; }
    /**
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdYyyy() { return _columnSapUpdYyyy; }
    /**
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMm() { return _columnSapUpdMm; }
    /**
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdDd() { return _columnSapUpdDd; }
    /**
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdHh() { return _columnSapUpdHh; }
    /**
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMi() { return _columnSapUpdMi; }
    /**
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdSs() { return _columnSapUpdSs; }
    /**
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserCd() { return _columnSapUpdUserCd; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
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
        ls.add(columnBaseId());
        ls.add(columnSendFlg());
        ls.add(columnBaseCd());
        ls.add(columnBaseNm());
        ls.add(columnBaseTypeCd());
        ls.add(columnForeignFlg());
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserCd());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserCd());
        ls.add(columnSpareStr());
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
    protected UniqueInfo cpui() { return hpcpui(columnBaseId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EsBase"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EsBaseCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EsBaseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EsBase> getEntityType() { return EsBase.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EsBase newEntity() { return new EsBase(); }
    public EsBase newMyEntity() { return new EsBase(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EsBase)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EsBase)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
