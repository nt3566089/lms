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
 * The DB meta of w_ht_receive_store. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtReceiveStoreDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtReceiveStoreDbm _instance = new WHtReceiveStoreDbm();
    private WHtReceiveStoreDbm() {}
    public static WHtReceiveStoreDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getHtReceiveStoreId(), (et, vl) -> ((WHtReceiveStore)et).setHtReceiveStoreId(ctl(vl)), "htReceiveStoreId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getMacAddress(), (et, vl) -> ((WHtReceiveStore)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getClientId(), (et, vl) -> ((WHtReceiveStore)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getCenterId(), (et, vl) -> ((WHtReceiveStore)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getWarehouseId(), (et, vl) -> ((WHtReceiveStore)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLocId(), (et, vl) -> ((WHtReceiveStore)et).setLocId(ctl(vl)), "locId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLocCd(), (et, vl) -> ((WHtReceiveStore)et).setLocCd((String)vl), "locCd");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLocNm(), (et, vl) -> ((WHtReceiveStore)et).setLocNm((String)vl), "locNm");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getJanCd(), (et, vl) -> ((WHtReceiveStore)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getProductId(), (et, vl) -> ((WHtReceiveStore)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getProductCd(), (et, vl) -> ((WHtReceiveStore)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getProductNm(), (et, vl) -> ((WHtReceiveStore)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getStockTypeId(), (et, vl) -> ((WHtReceiveStore)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getStkClsNm(), (et, vl) -> ((WHtReceiveStore)et).setStkClsNm((String)vl), "stkClsNm");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getStoreNum(), (et, vl) -> ((WHtReceiveStore)et).setStoreNum(ctb(vl)), "storeNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getOnsNum(), (et, vl) -> ((WHtReceiveStore)et).setOnsNum((String)vl), "onsNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLotId(), (et, vl) -> ((WHtReceiveStore)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLot(), (et, vl) -> ((WHtReceiveStore)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getLimitDt(), (et, vl) -> ((WHtReceiveStore)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getPlanNum(), (et, vl) -> ((WHtReceiveStore)et).setPlanNum(ctb(vl)), "planNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getWorkStartDt(), (et, vl) -> ((WHtReceiveStore)et).setWorkStartDt(cttp(vl)), "workStartDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getWorkEndDt(), (et, vl) -> ((WHtReceiveStore)et).setWorkEndDt(cttp(vl)), "workEndDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getProductionDt(), (et, vl) -> ((WHtReceiveStore)et).setProductionDt((String)vl), "productionDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getInputAssistanceUnitNum(), (et, vl) -> ((WHtReceiveStore)et).setInputAssistanceUnitNum(ctl(vl)), "inputAssistanceUnitNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getInputAssistanceCaseNum(), (et, vl) -> ((WHtReceiveStore)et).setInputAssistanceCaseNum(ctb(vl)), "inputAssistanceCaseNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getInputAssistancePieceNum(), (et, vl) -> ((WHtReceiveStore)et).setInputAssistancePieceNum(ctb(vl)), "inputAssistancePieceNum");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getDelFlg(), (et, vl) -> ((WHtReceiveStore)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getVersionNo(), (et, vl) -> ((WHtReceiveStore)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getControlNo(), (et, vl) -> ((WHtReceiveStore)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getAddDt(), (et, vl) -> ((WHtReceiveStore)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getAddUser(), (et, vl) -> ((WHtReceiveStore)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getAddProcess(), (et, vl) -> ((WHtReceiveStore)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getUpdDt(), (et, vl) -> ((WHtReceiveStore)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getUpdUser(), (et, vl) -> ((WHtReceiveStore)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtReceiveStore)et).getUpdProcess(), (et, vl) -> ((WHtReceiveStore)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMCenter(), (et, vl) -> ((WHtReceiveStore)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMLocation(), (et, vl) -> ((WHtReceiveStore)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMStockType(), (et, vl) -> ((WHtReceiveStore)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMWarehouse(), (et, vl) -> ((WHtReceiveStore)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getTLot(), (et, vl) -> ((WHtReceiveStore)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMClient(), (et, vl) -> ((WHtReceiveStore)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtReceiveStore)et).getMProduct(), (et, vl) -> ((WHtReceiveStore)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "w_ht_receive_store";
    protected final String _tableDispName = "w_ht_receive_store";
    protected final String _tablePropertyName = "WHtReceiveStore";
    protected final TableSqlName _tableSqlName = new TableSqlName("w_ht_receive_store", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtReceiveStoreId = cci("HT_RECEIVE_STORE_ID", "HT_RECEIVE_STORE_ID", null, null, Long.class, "htReceiveStoreId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnLocId = cci("LOC_ID", "LOC_ID", null, null, Long.class, "locId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnLocCd = cci("LOC_CD", "LOC_CD", null, null, String.class, "locCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocNm = cci("LOC_NM", "LOC_NM", null, null, String.class, "locNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnStkClsNm = cci("STK_CLS_NM", "STK_CLS_NM", null, null, String.class, "stkClsNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNum = cci("STORE_NUM", "STORE_NUM", null, null, java.math.BigDecimal.class, "storeNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOnsNum = cci("ONS_NUM", "ONS_NUM", null, null, String.class, "onsNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, java.math.BigDecimal.class, "planNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkStartDt = cci("WORK_START_DT", "WORK_START_DT", null, null, java.sql.Timestamp.class, "workStartDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkEndDt = cci("WORK_END_DT", "WORK_END_DT", null, null, java.sql.Timestamp.class, "workEndDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductionDt = cci("PRODUCTION_DT", "PRODUCTION_DT", null, null, String.class, "productionDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputAssistanceUnitNum = cci("INPUT_ASSISTANCE_UNIT_NUM", "INPUT_ASSISTANCE_UNIT_NUM", null, null, Long.class, "inputAssistanceUnitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputAssistanceCaseNum = cci("INPUT_ASSISTANCE_CASE_NUM", "INPUT_ASSISTANCE_CASE_NUM", null, null, java.math.BigDecimal.class, "inputAssistanceCaseNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputAssistancePieceNum = cci("INPUT_ASSISTANCE_PIECE_NUM", "INPUT_ASSISTANCE_PIECE_NUM", null, null, java.math.BigDecimal.class, "inputAssistancePieceNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
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
     * HT_RECEIVE_STORE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtReceiveStoreId() { return _columnHtReceiveStoreId; }
    /**
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * LOC_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocId() { return _columnLocId; }
    /**
     * LOC_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocCd() { return _columnLocCd; }
    /**
     * LOC_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocNm() { return _columnLocNm; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STK_CLS_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStkClsNm() { return _columnStkClsNm; }
    /**
     * STORE_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNum() { return _columnStoreNum; }
    /**
     * ONS_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOnsNum() { return _columnOnsNum; }
    /**
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
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
     * PLAN_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * WORK_START_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkStartDt() { return _columnWorkStartDt; }
    /**
     * WORK_END_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkEndDt() { return _columnWorkEndDt; }
    /**
     * PRODUCTION_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductionDt() { return _columnProductionDt; }
    /**
     * INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputAssistanceUnitNum() { return _columnInputAssistanceUnitNum; }
    /**
     * INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputAssistanceCaseNum() { return _columnInputAssistanceCaseNum; }
    /**
     * INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputAssistancePieceNum() { return _columnInputAssistancePieceNum; }
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
        ls.add(columnHtReceiveStoreId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnWarehouseId());
        ls.add(columnLocId());
        ls.add(columnLocCd());
        ls.add(columnLocNm());
        ls.add(columnJanCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnStockTypeId());
        ls.add(columnStkClsNm());
        ls.add(columnStoreNum());
        ls.add(columnOnsNum());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnPlanNum());
        ls.add(columnWorkStartDt());
        ls.add(columnWorkEndDt());
        ls.add(columnProductionDt());
        ls.add(columnInputAssistanceUnitNum());
        ls.add(columnInputAssistanceCaseNum());
        ls.add(columnInputAssistancePieceNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtReceiveStoreId()); }
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
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_HT_RECEIVE_STORE_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * m_location by my LOC_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("W_HT_RECEIVE_STORE_FK1", "MLocation", this, MLocationDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("W_HT_RECEIVE_STORE_FK3", "MStockType", this, MStockTypeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("W_HT_RECEIVE_STORE_FK5", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("W_HT_RECEIVE_STORE_FK7", "TLot", this, TLotDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_RECEIVE_STORE_FK6", "MClient", this, MClientDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_HT_RECEIVE_STORE_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "WHtReceiveStoreList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtReceiveStore"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtReceiveStoreCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtReceiveStoreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtReceiveStore> getEntityType() { return WHtReceiveStore.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtReceiveStore newEntity() { return new WHtReceiveStore(); }
    public WHtReceiveStore newMyEntity() { return new WHtReceiveStore(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtReceiveStore)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtReceiveStore)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
