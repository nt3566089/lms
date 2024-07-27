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
 * The DB meta of t_lot. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TLotDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TLotDbm _instance = new TLotDbm();
    private TLotDbm() {}
    public static TLotDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TLot)et).getLotId(), (et, vl) -> ((TLot)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TLot)et).getProductId(), (et, vl) -> ((TLot)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TLot)et).getLot(), (et, vl) -> ((TLot)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TLot)et).getLotSort(), (et, vl) -> ((TLot)et).setLotSort((String)vl), "lotSort");
        setupEpg(_epgMap, et -> ((TLot)et).getLimitDt(), (et, vl) -> ((TLot)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TLot)et).getProdDt(), (et, vl) -> ((TLot)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TLot)et).getReceiveDt(), (et, vl) -> ((TLot)et).setReceiveDt((String)vl), "receiveDt");
        setupEpg(_epgMap, et -> ((TLot)et).getDelFlg(), (et, vl) -> ((TLot)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TLot)et).getVersionNo(), (et, vl) -> ((TLot)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TLot)et).getControlNo(), (et, vl) -> ((TLot)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TLot)et).getAddDt(), (et, vl) -> ((TLot)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TLot)et).getAddUser(), (et, vl) -> ((TLot)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TLot)et).getAddProcess(), (et, vl) -> ((TLot)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdDt(), (et, vl) -> ((TLot)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdUser(), (et, vl) -> ((TLot)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TLot)et).getUpdProcess(), (et, vl) -> ((TLot)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TLot)et).getMProduct(), (et, vl) -> ((TLot)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_lot";
    protected final String _tableDispName = "t_lot";
    protected final String _tablePropertyName = "TLot";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_lot", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TAllocInstBList,TAllocLotList,TInventoryBList,TKeepingLotList,TLastLotList,TMoveInstBList,TShippingInstBList,TStockList,WHtInventoryInputProdList,WHtPickingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtShippingPickingList,WHtTotalPickingList", null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotSort = cci("LOT_SORT", "LOT_SORT", null, null, String.class, "lotSort", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDt = cci("RECEIVE_DT", "RECEIVE_DT", null, null, String.class, "receiveDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * LOT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * LOT: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LOT_SORT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotSort() { return _columnLotSort; }
    /**
     * LIMIT_DT: {IX, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * RECEIVE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDt() { return _columnReceiveDt; }
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
        ls.add(columnLotId());
        ls.add(columnProductId());
        ls.add(columnLot());
        ls.add(columnLotSort());
        ls.add(columnLimitDt());
        ls.add(columnProdDt());
        ls.add(columnReceiveDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnLotId()); }
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
        return cfi("T_LOT_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TLotList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_alloc_inst_b by LOT_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TAllocInstBDbm.getInstance().columnLotId());
        return cri("T_ALLOC_INST_B_FK3", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_alloc_lot by LOT_ID, named 'TAllocLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TAllocLotDbm.getInstance().columnLotId());
        return cri("T_ALLOC_LOT_FK4", "TAllocLotList", this, TAllocLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_inventory_b by LOT_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TInventoryBDbm.getInstance().columnLotId());
        return cri("T_INVENTORY_B_FK15", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_keeping_lot by LOT_ID, named 'TKeepingLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTKeepingLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TKeepingLotDbm.getInstance().columnLotId());
        return cri("T_KEEPING_LOT_FK2", "TKeepingLotList", this, TKeepingLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_last_lot by LOT_ID, named 'TLastLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLastLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLastLotDbm.getInstance().columnLotId());
        return cri("T_LAST_LOT_FK1", "TLastLotList", this, TLastLotDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_move_inst_b by LOT_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TMoveInstBDbm.getInstance().columnLotId());
        return cri("T_MOVE_INST_B_FK11", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_shipping_inst_b by LOT_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TShippingInstBDbm.getInstance().columnLotId());
        return cri("T_SHIPPING_INST_B_FK7", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * t_stock by LOT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TStockDbm.getInstance().columnLotId());
        return cri("T_STOCK_FK5", "TStockList", this, TStockDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_inventory_input_prod by LOT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtInventoryInputProdDbm.getInstance().columnLotId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK5", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_picking by LOT_ID, named 'WHtPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtPickingDbm.getInstance().columnLotId());
        return cri("W_HT_PICKING_FK4", "WHtPickingList", this, WHtPickingDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_receive_inspection by LOT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveInspectionDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_INSPECTION_FK4", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_receive_no_plan_insp by LOT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveNoPlanInspDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK7", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_receive_store by LOT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtReceiveStoreDbm.getInstance().columnLotId());
        return cri("W_HT_RECEIVE_STORE_FK7", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_shipping_picking by LOT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtShippingPickingDbm.getInstance().columnLotId());
        return cri("W_HT_SHIPPING_PICKING_FK4", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "TLot");
    }
    /**
     * w_ht_total_picking by LOT_ID, named 'WHtTotalPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtTotalPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), WHtTotalPickingDbm.getInstance().columnLotId());
        return cri("W_HT_TOTAL_PICKING_FK5", "WHtTotalPickingList", this, WHtTotalPickingDbm.getInstance(), mp, false, "TLot");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TLot"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TLotCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TLotBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TLot> getEntityType() { return TLot.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TLot newEntity() { return new TLot(); }
    public TLot newMyEntity() { return new TLot(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TLot)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TLot)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
