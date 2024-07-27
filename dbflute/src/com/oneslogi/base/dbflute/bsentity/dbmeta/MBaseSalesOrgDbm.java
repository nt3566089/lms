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
 * The DB meta of m_base_sales_org. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MBaseSalesOrgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MBaseSalesOrgDbm _instance = new MBaseSalesOrgDbm();
    private MBaseSalesOrgDbm() {}
    public static MBaseSalesOrgDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getBaseSalesOrgId(), (et, vl) -> ((MBaseSalesOrg)et).setBaseSalesOrgId(ctl(vl)), "baseSalesOrgId");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getBaseCd(), (et, vl) -> ((MBaseSalesOrg)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getSalesOrgId(), (et, vl) -> ((MBaseSalesOrg)et).setSalesOrgId(ctl(vl)), "salesOrgId");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getCarrierId(), (et, vl) -> ((MBaseSalesOrg)et).setCarrierId(ctl(vl)), "carrierId");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getCarrierCd(), (et, vl) -> ((MBaseSalesOrg)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getDelFlg(), (et, vl) -> ((MBaseSalesOrg)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getVersionNo(), (et, vl) -> ((MBaseSalesOrg)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getControlNo(), (et, vl) -> ((MBaseSalesOrg)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getAddDt(), (et, vl) -> ((MBaseSalesOrg)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getAddUser(), (et, vl) -> ((MBaseSalesOrg)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getAddProcess(), (et, vl) -> ((MBaseSalesOrg)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getUpdDt(), (et, vl) -> ((MBaseSalesOrg)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getUpdUser(), (et, vl) -> ((MBaseSalesOrg)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MBaseSalesOrg)et).getUpdProcess(), (et, vl) -> ((MBaseSalesOrg)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MBaseSalesOrg)et).getMCarrier(), (et, vl) -> ((MBaseSalesOrg)et).setMCarrier((MCarrier)vl), "MCarrier");
        setupEfpg(_efpgMap, et -> ((MBaseSalesOrg)et).getMSalesOrg(), (et, vl) -> ((MBaseSalesOrg)et).setMSalesOrg((MSalesOrg)vl), "MSalesOrg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_base_sales_org";
    protected final String _tableDispName = "m_base_sales_org";
    protected final String _tablePropertyName = "MBaseSalesOrg";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_base_sales_org", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBaseSalesOrgId = cci("BASE_SALES_ORG_ID", "BASE_SALES_ORG_ID", null, null, Long.class, "baseSalesOrgId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgId = cci("SALES_ORG_ID", "SALES_ORG_ID", null, null, Long.class, "salesOrgId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MSalesOrg", null, null, false);
    protected final ColumnInfo _columnCarrierId = cci("CARRIER_ID", "CARRIER_ID", null, null, Long.class, "carrierId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCarrier", null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * BASE_SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseSalesOrgId() { return _columnBaseSalesOrgId; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgId() { return _columnSalesOrgId; }
    /**
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierId() { return _columnCarrierId; }
    /**
     * CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
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
        ls.add(columnBaseSalesOrgId());
        ls.add(columnBaseCd());
        ls.add(columnSalesOrgId());
        ls.add(columnCarrierId());
        ls.add(columnCarrierCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnBaseSalesOrgId()); }
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
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCarrier() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDbm.getInstance().columnCarrierId());
        return cfi("M_BASE_SALES_ORG_FK2", "MCarrier", this, MCarrierDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MBaseSalesOrgList", false);
    }
    /**
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMSalesOrg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MSalesOrgDbm.getInstance().columnSalesOrgId());
        return cfi("M_BASE_SALES_ORG_FK1", "MSalesOrg", this, MSalesOrgDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MBaseSalesOrgList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MBaseSalesOrg"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MBaseSalesOrgCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MBaseSalesOrgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MBaseSalesOrg> getEntityType() { return MBaseSalesOrg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MBaseSalesOrg newEntity() { return new MBaseSalesOrg(); }
    public MBaseSalesOrg newMyEntity() { return new MBaseSalesOrg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MBaseSalesOrg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MBaseSalesOrg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
