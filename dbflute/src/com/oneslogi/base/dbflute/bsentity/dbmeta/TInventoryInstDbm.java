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
 * The DB meta of t_inventory_inst. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryInstDbm _instance = new TInventoryInstDbm();
    private TInventoryInstDbm() {}
    public static TInventoryInstDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getInventoryInstId(), (et, vl) -> ((TInventoryInst)et).setInventoryInstId(ctl(vl)), "inventoryInstId");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getInventoryHId(), (et, vl) -> ((TInventoryInst)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getDepositId(), (et, vl) -> ((TInventoryInst)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getStockTypeId(), (et, vl) -> ((TInventoryInst)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getFromLocationCd(), (et, vl) -> ((TInventoryInst)et).setFromLocationCd((String)vl), "fromLocationCd");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getToLocationCd(), (et, vl) -> ((TInventoryInst)et).setToLocationCd((String)vl), "toLocationCd");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getZoneId(), (et, vl) -> ((TInventoryInst)et).setZoneId(ctl(vl)), "zoneId");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getFromStockInoutDt(), (et, vl) -> ((TInventoryInst)et).setFromStockInoutDt((String)vl), "fromStockInoutDt");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getToStockInoutDt(), (et, vl) -> ((TInventoryInst)et).setToStockInoutDt((String)vl), "toStockInoutDt");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getStockExistOnlyFlg(), (et, vl) -> ((TInventoryInst)et).setStockExistOnlyFlg((String)vl), "stockExistOnlyFlg");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getFiscalYear(), (et, vl) -> ((TInventoryInst)et).setFiscalYear((String)vl), "fiscalYear");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getLpSendFlg(), (et, vl) -> ((TInventoryInst)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getWmSendFlg(), (et, vl) -> ((TInventoryInst)et).setWmSendFlg((String)vl), "wmSendFlg");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getDelFlg(), (et, vl) -> ((TInventoryInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getVersionNo(), (et, vl) -> ((TInventoryInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getControlNo(), (et, vl) -> ((TInventoryInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getAddDt(), (et, vl) -> ((TInventoryInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getAddUser(), (et, vl) -> ((TInventoryInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getAddProcess(), (et, vl) -> ((TInventoryInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getUpdDt(), (et, vl) -> ((TInventoryInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getUpdUser(), (et, vl) -> ((TInventoryInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryInst)et).getUpdProcess(), (et, vl) -> ((TInventoryInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryInst)et).getMStockType(), (et, vl) -> ((TInventoryInst)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TInventoryInst)et).getMZone(), (et, vl) -> ((TInventoryInst)et).setMZone((MZone)vl), "MZone");
        setupEfpg(_efpgMap, et -> ((TInventoryInst)et).getMCustomer(), (et, vl) -> ((TInventoryInst)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TInventoryInst)et).getTInventoryH(), (et, vl) -> ((TInventoryInst)et).setTInventoryH((TInventoryH)vl), "TInventoryH");
        setupEfpg(_efpgMap, et -> ((TInventoryInst)et).getBClassDtlByStockExistOnlyFlg(), (et, vl) -> ((TInventoryInst)et).setBClassDtlByStockExistOnlyFlg((BClassDtl)vl), "BClassDtlByStockExistOnlyFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_inventory_inst";
    protected final String _tableDispName = "t_inventory_inst";
    protected final String _tablePropertyName = "TInventoryInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_inventory_inst", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryInstId = cci("INVENTORY_INST_ID", "INVENTORY_INST_ID", null, null, Long.class, "inventoryInstId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TInventoryH", null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnFromLocationCd = cci("FROM_LOCATION_CD", "FROM_LOCATION_CD", null, null, String.class, "fromLocationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToLocationCd = cci("TO_LOCATION_CD", "TO_LOCATION_CD", null, null, String.class, "toLocationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnZoneId = cci("ZONE_ID", "ZONE_ID", null, null, Long.class, "zoneId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MZone", null, null, false);
    protected final ColumnInfo _columnFromStockInoutDt = cci("FROM_STOCK_INOUT_DT", "FROM_STOCK_INOUT_DT", null, null, String.class, "fromStockInoutDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnToStockInoutDt = cci("TO_STOCK_INOUT_DT", "TO_STOCK_INOUT_DT", null, null, String.class, "toStockInoutDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockExistOnlyFlg = cci("STOCK_EXIST_ONLY_FLG", "STOCK_EXIST_ONLY_FLG", null, null, String.class, "stockExistOnlyFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByStockExistOnlyFlg", null, CDef.DefMeta.StockExistOnlyFlg, false);
    protected final ColumnInfo _columnFiscalYear = cci("FISCAL_YEAR", "FISCAL_YEAR", null, null, String.class, "fiscalYear", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmSendFlg = cci("WM_SEND_FLG", "WM_SEND_FLG", null, null, String.class, "wmSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * INVENTORY_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstId() { return _columnInventoryInstId; }
    /**
     * INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * FROM_LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromLocationCd() { return _columnFromLocationCd; }
    /**
     * TO_LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToLocationCd() { return _columnToLocationCd; }
    /**
     * ZONE_ID: {IX, BIGINT(19), FK to m_zone}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneId() { return _columnZoneId; }
    /**
     * FROM_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromStockInoutDt() { return _columnFromStockInoutDt; }
    /**
     * TO_STOCK_INOUT_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToStockInoutDt() { return _columnToStockInoutDt; }
    /**
     * STOCK_EXIST_ONLY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockExistOnlyFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockExistOnlyFlg() { return _columnStockExistOnlyFlg; }
    /**
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFiscalYear() { return _columnFiscalYear; }
    /**
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
    /**
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmSendFlg() { return _columnWmSendFlg; }
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
        ls.add(columnInventoryInstId());
        ls.add(columnInventoryHId());
        ls.add(columnDepositId());
        ls.add(columnStockTypeId());
        ls.add(columnFromLocationCd());
        ls.add(columnToLocationCd());
        ls.add(columnZoneId());
        ls.add(columnFromStockInoutDt());
        ls.add(columnToStockInoutDt());
        ls.add(columnStockExistOnlyFlg());
        ls.add(columnFiscalYear());
        ls.add(columnLpSendFlg());
        ls.add(columnWmSendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryInstId()); }
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
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_INVENTORY_INST_FK4", "MStockType", this, MStockTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryInstList", false);
    }
    /**
     * m_zone by my ZONE_ID, named 'MZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZoneId(), MZoneDbm.getInstance().columnZoneId());
        return cfi("T_INVENTORY_INST_FK2", "MZone", this, MZoneDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TInventoryInstList", false);
    }
    /**
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_INST_FK3", "MCustomer", this, MCustomerDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TInventoryInstList", false);
    }
    /**
     * t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTInventoryH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), TInventoryHDbm.getInstance().columnInventoryHId());
        return cfi("T_INVENTORY_INST_FK1", "TInventoryH", this, TInventoryHDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TInventoryInstList", false);
    }
    /**
     * b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockExistOnlyFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockExistOnlyFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_INST_STOCK_EXIST_ONLY_FLG", "BClassDtlByStockExistOnlyFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_EXIST_ONLY_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryInst> getEntityType() { return TInventoryInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryInst newEntity() { return new TInventoryInst(); }
    public TInventoryInst newMyEntity() { return new TInventoryInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
