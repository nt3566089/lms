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
 * The DB meta of t_operation_log. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TOperationLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TOperationLogDbm _instance = new TOperationLogDbm();
    private TOperationLogDbm() {}
    public static TOperationLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TOperationLog)et).getOperationLogId(), (et, vl) -> ((TOperationLog)et).setOperationLogId(ctl(vl)), "operationLogId");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getClientCd(), (et, vl) -> ((TOperationLog)et).setClientCd((String)vl), "clientCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getCenterCd(), (et, vl) -> ((TOperationLog)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getWorkCd(), (et, vl) -> ((TOperationLog)et).setWorkCd((String)vl), "workCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getWorkDt(), (et, vl) -> ((TOperationLog)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getMacAddress(), (et, vl) -> ((TOperationLog)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getUserCd(), (et, vl) -> ((TOperationLog)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getTraceItem(), (et, vl) -> ((TOperationLog)et).setTraceItem((String)vl), "traceItem");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getProductId(), (et, vl) -> ((TOperationLog)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getJanCd(), (et, vl) -> ((TOperationLog)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getProductCd(), (et, vl) -> ((TOperationLog)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getProductNm(), (et, vl) -> ((TOperationLog)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getLocationCd(), (et, vl) -> ((TOperationLog)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getLocationNm(), (et, vl) -> ((TOperationLog)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getLot(), (et, vl) -> ((TOperationLog)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getLimitDt(), (et, vl) -> ((TOperationLog)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getProdDt(), (et, vl) -> ((TOperationLog)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getDelFlg(), (et, vl) -> ((TOperationLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getVersionNo(), (et, vl) -> ((TOperationLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getControlNo(), (et, vl) -> ((TOperationLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getAddDt(), (et, vl) -> ((TOperationLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getAddUser(), (et, vl) -> ((TOperationLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getAddProcess(), (et, vl) -> ((TOperationLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getUpdDt(), (et, vl) -> ((TOperationLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getUpdUser(), (et, vl) -> ((TOperationLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TOperationLog)et).getUpdProcess(), (et, vl) -> ((TOperationLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TOperationLog)et).getMProduct(), (et, vl) -> ((TOperationLog)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_operation_log";
    protected final String _tableDispName = "t_operation_log";
    protected final String _tablePropertyName = "TOperationLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_operation_log", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOperationLogId = cci("OPERATION_LOG_ID", "OPERATION_LOG_ID", null, null, Long.class, "operationLogId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientCd = cci("CLIENT_CD", "CLIENT_CD", null, null, String.class, "clientCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkCd = cci("WORK_CD", "WORK_CD", null, null, String.class, "workCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTraceItem = cci("TRACE_ITEM", "TRACE_ITEM", null, null, String.class, "traceItem", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * OPERATION_LOG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOperationLogId() { return _columnOperationLogId; }
    /**
     * CLIENT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientCd() { return _columnClientCd; }
    /**
     * CENTER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * WORK_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkCd() { return _columnWorkCd; }
    /**
     * WORK_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * MAC_ADDRESS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * TRACE_ITEM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTraceItem() { return _columnTraceItem; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * LOT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
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
        ls.add(columnOperationLogId());
        ls.add(columnClientCd());
        ls.add(columnCenterCd());
        ls.add(columnWorkCd());
        ls.add(columnWorkDt());
        ls.add(columnMacAddress());
        ls.add(columnUserCd());
        ls.add(columnTraceItem());
        ls.add(columnProductId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnProdDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnOperationLogId()); }
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
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_OPERATION_LOG_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TOperationLogList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TOperationLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TOperationLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TOperationLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TOperationLog> getEntityType() { return TOperationLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TOperationLog newEntity() { return new TOperationLog(); }
    public TOperationLog newMyEntity() { return new TOperationLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TOperationLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TOperationLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
