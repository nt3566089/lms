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
 * The DB meta of t_inventory_r. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryRDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryRDbm _instance = new TInventoryRDbm();
    private TInventoryRDbm() {}
    public static TInventoryRDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryBId(), (et, vl) -> ((TInventoryR)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getTwlOutFlg(), (et, vl) -> ((TInventoryR)et).setTwlOutFlg((String)vl), "twlOutFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getTwlOutUserId(), (et, vl) -> ((TInventoryR)et).setTwlOutUserId(ctl(vl)), "twlOutUserId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getTwlOutDt(), (et, vl) -> ((TInventoryR)et).setTwlOutDt(cttp(vl)), "twlOutDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryDiffOutFlg(), (et, vl) -> ((TInventoryR)et).setInventoryDiffOutFlg((String)vl), "inventoryDiffOutFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryDiffOutUserId(), (et, vl) -> ((TInventoryR)et).setInventoryDiffOutUserId(ctl(vl)), "inventoryDiffOutUserId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryDiffOutDt(), (et, vl) -> ((TInventoryR)et).setInventoryDiffOutDt(cttp(vl)), "inventoryDiffOutDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordOutFlg(), (et, vl) -> ((TInventoryR)et).setInventoryRecordOutFlg((String)vl), "inventoryRecordOutFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordOutUserId(), (et, vl) -> ((TInventoryR)et).setInventoryRecordOutUserId(ctl(vl)), "inventoryRecordOutUserId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordOutDt(), (et, vl) -> ((TInventoryR)et).setInventoryRecordOutDt(cttp(vl)), "inventoryRecordOutDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordLocOutFlg(), (et, vl) -> ((TInventoryR)et).setInventoryRecordLocOutFlg((String)vl), "inventoryRecordLocOutFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordLocOutUserId(), (et, vl) -> ((TInventoryR)et).setInventoryRecordLocOutUserId(ctl(vl)), "inventoryRecordLocOutUserId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getInventoryRecordLocOutDt(), (et, vl) -> ((TInventoryR)et).setInventoryRecordLocOutDt(cttp(vl)), "inventoryRecordLocOutDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getStockDiffOutFlg(), (et, vl) -> ((TInventoryR)et).setStockDiffOutFlg((String)vl), "stockDiffOutFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getStockDiffOutUserId(), (et, vl) -> ((TInventoryR)et).setStockDiffOutUserId(ctl(vl)), "stockDiffOutUserId");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getStockDiffOutDt(), (et, vl) -> ((TInventoryR)et).setStockDiffOutDt(cttp(vl)), "stockDiffOutDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getDelFlg(), (et, vl) -> ((TInventoryR)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getVersionNo(), (et, vl) -> ((TInventoryR)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getControlNo(), (et, vl) -> ((TInventoryR)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getAddDt(), (et, vl) -> ((TInventoryR)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getAddUser(), (et, vl) -> ((TInventoryR)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getAddProcess(), (et, vl) -> ((TInventoryR)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getUpdDt(), (et, vl) -> ((TInventoryR)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getUpdUser(), (et, vl) -> ((TInventoryR)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryR)et).getUpdProcess(), (et, vl) -> ((TInventoryR)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBUserByInventoryRecordLocOutUserId(), (et, vl) -> ((TInventoryR)et).setBUserByInventoryRecordLocOutUserId((BUser)vl), "BUserByInventoryRecordLocOutUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBUserByStockDiffOutUserId(), (et, vl) -> ((TInventoryR)et).setBUserByStockDiffOutUserId((BUser)vl), "BUserByStockDiffOutUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBUserByTwlOutUserId(), (et, vl) -> ((TInventoryR)et).setBUserByTwlOutUserId((BUser)vl), "BUserByTwlOutUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBUserByInventoryRecordOutUserId(), (et, vl) -> ((TInventoryR)et).setBUserByInventoryRecordOutUserId((BUser)vl), "BUserByInventoryRecordOutUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getTInventoryB(), (et, vl) -> ((TInventoryR)et).setTInventoryB((TInventoryB)vl), "TInventoryB");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBUserByInventoryDiffOutUserId(), (et, vl) -> ((TInventoryR)et).setBUserByInventoryDiffOutUserId((BUser)vl), "BUserByInventoryDiffOutUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryR)et).getBClassDtlByTwlOutFlg(), (et, vl) -> ((TInventoryR)et).setBClassDtlByTwlOutFlg((BClassDtl)vl), "BClassDtlByTwlOutFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_inventory_r";
    protected final String _tableDispName = "t_inventory_r";
    protected final String _tablePropertyName = "TInventoryR";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_inventory_r", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TInventoryB", null, null, false);
    protected final ColumnInfo _columnTwlOutFlg = cci("TWL_OUT_FLG", "TWL_OUT_FLG", null, null, String.class, "twlOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByTwlOutFlg", null, CDef.DefMeta.ListOutFlg, false);
    protected final ColumnInfo _columnTwlOutUserId = cci("TWL_OUT_USER_ID", "TWL_OUT_USER_ID", null, null, Long.class, "twlOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByTwlOutUserId", null, null, false);
    protected final ColumnInfo _columnTwlOutDt = cci("TWL_OUT_DT", "TWL_OUT_DT", null, null, java.sql.Timestamp.class, "twlOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDiffOutFlg = cci("INVENTORY_DIFF_OUT_FLG", "INVENTORY_DIFF_OUT_FLG", null, null, String.class, "inventoryDiffOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDiffOutUserId = cci("INVENTORY_DIFF_OUT_USER_ID", "INVENTORY_DIFF_OUT_USER_ID", null, null, Long.class, "inventoryDiffOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByInventoryDiffOutUserId", null, null, false);
    protected final ColumnInfo _columnInventoryDiffOutDt = cci("INVENTORY_DIFF_OUT_DT", "INVENTORY_DIFF_OUT_DT", null, null, java.sql.Timestamp.class, "inventoryDiffOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryRecordOutFlg = cci("INVENTORY_RECORD_OUT_FLG", "INVENTORY_RECORD_OUT_FLG", null, null, String.class, "inventoryRecordOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryRecordOutUserId = cci("INVENTORY_RECORD_OUT_USER_ID", "INVENTORY_RECORD_OUT_USER_ID", null, null, Long.class, "inventoryRecordOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByInventoryRecordOutUserId", null, null, false);
    protected final ColumnInfo _columnInventoryRecordOutDt = cci("INVENTORY_RECORD_OUT_DT", "INVENTORY_RECORD_OUT_DT", null, null, java.sql.Timestamp.class, "inventoryRecordOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryRecordLocOutFlg = cci("INVENTORY_RECORD_LOC_OUT_FLG", "INVENTORY_RECORD_LOC_OUT_FLG", null, null, String.class, "inventoryRecordLocOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryRecordLocOutUserId = cci("INVENTORY_RECORD_LOC_OUT_USER_ID", "INVENTORY_RECORD_LOC_OUT_USER_ID", null, null, Long.class, "inventoryRecordLocOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByInventoryRecordLocOutUserId", null, null, false);
    protected final ColumnInfo _columnInventoryRecordLocOutDt = cci("INVENTORY_RECORD_LOC_OUT_DT", "INVENTORY_RECORD_LOC_OUT_DT", null, null, java.sql.Timestamp.class, "inventoryRecordLocOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockDiffOutFlg = cci("STOCK_DIFF_OUT_FLG", "STOCK_DIFF_OUT_FLG", null, null, String.class, "stockDiffOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockDiffOutUserId = cci("STOCK_DIFF_OUT_USER_ID", "STOCK_DIFF_OUT_USER_ID", null, null, Long.class, "stockDiffOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByStockDiffOutUserId", null, null, false);
    protected final ColumnInfo _columnStockDiffOutDt = cci("STOCK_DIFF_OUT_DT", "STOCK_DIFF_OUT_DT", null, null, java.sql.Timestamp.class, "stockDiffOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
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
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwlOutFlg() { return _columnTwlOutFlg; }
    /**
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwlOutUserId() { return _columnTwlOutUserId; }
    /**
     * TWL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwlOutDt() { return _columnTwlOutDt; }
    /**
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDiffOutFlg() { return _columnInventoryDiffOutFlg; }
    /**
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDiffOutUserId() { return _columnInventoryDiffOutUserId; }
    /**
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDiffOutDt() { return _columnInventoryDiffOutDt; }
    /**
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordOutFlg() { return _columnInventoryRecordOutFlg; }
    /**
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordOutUserId() { return _columnInventoryRecordOutUserId; }
    /**
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordOutDt() { return _columnInventoryRecordOutDt; }
    /**
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordLocOutFlg() { return _columnInventoryRecordLocOutFlg; }
    /**
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordLocOutUserId() { return _columnInventoryRecordLocOutUserId; }
    /**
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordLocOutDt() { return _columnInventoryRecordLocOutDt; }
    /**
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockDiffOutFlg() { return _columnStockDiffOutFlg; }
    /**
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockDiffOutUserId() { return _columnStockDiffOutUserId; }
    /**
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockDiffOutDt() { return _columnStockDiffOutDt; }
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
        ls.add(columnInventoryBId());
        ls.add(columnTwlOutFlg());
        ls.add(columnTwlOutUserId());
        ls.add(columnTwlOutDt());
        ls.add(columnInventoryDiffOutFlg());
        ls.add(columnInventoryDiffOutUserId());
        ls.add(columnInventoryDiffOutDt());
        ls.add(columnInventoryRecordOutFlg());
        ls.add(columnInventoryRecordOutUserId());
        ls.add(columnInventoryRecordOutDt());
        ls.add(columnInventoryRecordLocOutFlg());
        ls.add(columnInventoryRecordLocOutUserId());
        ls.add(columnInventoryRecordLocOutDt());
        ls.add(columnStockDiffOutFlg());
        ls.add(columnStockDiffOutUserId());
        ls.add(columnStockDiffOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryBId()); }
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
     * b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInventoryRecordLocOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryRecordLocOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_R_FK2", "BUserByInventoryRecordLocOutUserId", this, BUserDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryRByInventoryRecordLocOutUserIdList", false);
    }
    /**
     * b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByStockDiffOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockDiffOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_R_FK1", "BUserByStockDiffOutUserId", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TInventoryRByStockDiffOutUserIdList", false);
    }
    /**
     * b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByTwlOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTwlOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_R_FK5", "BUserByTwlOutUserId", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TInventoryRByTwlOutUserIdList", false);
    }
    /**
     * b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInventoryRecordOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryRecordOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_R_FK3", "BUserByInventoryRecordOutUserId", this, BUserDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TInventoryRByInventoryRecordOutUserIdList", false);
    }
    /**
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTInventoryB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryBDbm.getInstance().columnInventoryBId());
        return cfi("T_INVENTORY_R_FK6", "TInventoryB", this, TInventoryBDbm.getInstance(), mp, 4, null, true, false, false, false, null, null, false, "TInventoryRAsOne", false);
    }
    /**
     * b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInventoryDiffOutUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryDiffOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_R_FK4", "BUserByInventoryDiffOutUserId", this, BUserDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TInventoryRByInventoryDiffOutUserIdList", false);
    }
    /**
     * b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByTwlOutFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTwlOutFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_R_TWL_OUT_FLG", "BClassDtlByTwlOutFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIST_OUT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryR"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryRCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryRBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryR> getEntityType() { return TInventoryR.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryR newEntity() { return new TInventoryR(); }
    public TInventoryR newMyEntity() { return new TInventoryR(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryR)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryR)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
