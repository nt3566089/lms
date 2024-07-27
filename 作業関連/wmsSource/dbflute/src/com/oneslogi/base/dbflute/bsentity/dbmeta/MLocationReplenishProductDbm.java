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
 * The DB meta of m_location_replenish_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MLocationReplenishProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MLocationReplenishProductDbm _instance = new MLocationReplenishProductDbm();
    private MLocationReplenishProductDbm() {}
    public static MLocationReplenishProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getLocationReplenishProductId(), (et, vl) -> ((MLocationReplenishProduct)et).setLocationReplenishProductId(ctl(vl)), "locationReplenishProductId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getLocationId(), (et, vl) -> ((MLocationReplenishProduct)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getReplenishProductId(), (et, vl) -> ((MLocationReplenishProduct)et).setReplenishProductId(ctl(vl)), "replenishProductId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getReplenishDepositId(), (et, vl) -> ((MLocationReplenishProduct)et).setReplenishDepositId(ctl(vl)), "replenishDepositId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getReplenishPNum(), (et, vl) -> ((MLocationReplenishProduct)et).setReplenishPNum(ctl(vl)), "replenishPNum");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getMaxStoreProductShapeId(), (et, vl) -> ((MLocationReplenishProduct)et).setMaxStoreProductShapeId(ctl(vl)), "maxStoreProductShapeId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getMaxStoreNum(), (et, vl) -> ((MLocationReplenishProduct)et).setMaxStoreNum(ctl(vl)), "maxStoreNum");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getReplenishStockTypeId(), (et, vl) -> ((MLocationReplenishProduct)et).setReplenishStockTypeId(ctl(vl)), "replenishStockTypeId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getReplenishPProductShapeId(), (et, vl) -> ((MLocationReplenishProduct)et).setReplenishPProductShapeId(ctl(vl)), "replenishPProductShapeId");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getDelFlg(), (et, vl) -> ((MLocationReplenishProduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getVersionNo(), (et, vl) -> ((MLocationReplenishProduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getControlNo(), (et, vl) -> ((MLocationReplenishProduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getAddDt(), (et, vl) -> ((MLocationReplenishProduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getAddUser(), (et, vl) -> ((MLocationReplenishProduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getAddProcess(), (et, vl) -> ((MLocationReplenishProduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getUpdDt(), (et, vl) -> ((MLocationReplenishProduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getUpdUser(), (et, vl) -> ((MLocationReplenishProduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MLocationReplenishProduct)et).getUpdProcess(), (et, vl) -> ((MLocationReplenishProduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMCustomer(), (et, vl) -> ((MLocationReplenishProduct)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMProductShape(), (et, vl) -> ((MLocationReplenishProduct)et).setMProductShape((MProductShape)vl), "MProductShape");
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMShape(), (et, vl) -> ((MLocationReplenishProduct)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMProduct(), (et, vl) -> ((MLocationReplenishProduct)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMLocation(), (et, vl) -> ((MLocationReplenishProduct)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((MLocationReplenishProduct)et).getMStockType(), (et, vl) -> ((MLocationReplenishProduct)et).setMStockType((MStockType)vl), "MStockType");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_location_replenish_product";
    protected final String _tableDispName = "m_location_replenish_product";
    protected final String _tablePropertyName = "MLocationReplenishProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_location_replenish_product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationReplenishProductId = cci("LOCATION_REPLENISH_PRODUCT_ID", "LOCATION_REPLENISH_PRODUCT_ID", null, null, Long.class, "locationReplenishProductId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnReplenishProductId = cci("REPLENISH_PRODUCT_ID", "REPLENISH_PRODUCT_ID", null, null, Long.class, "replenishProductId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnReplenishDepositId = cci("REPLENISH_DEPOSIT_ID", "REPLENISH_DEPOSIT_ID", null, null, Long.class, "replenishDepositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, Long.class, "replenishPNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeId = cci("MAX_STORE_PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", null, null, Long.class, "maxStoreProductShapeId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProductShape", null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, Long.class, "maxStoreNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeId = cci("REPLENISH_STOCK_TYPE_ID", "REPLENISH_STOCK_TYPE_ID", null, null, Long.class, "replenishStockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeId = cci("REPLENISH_P_PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", null, null, Long.class, "replenishPProductShapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShape", null, null, false);
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
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationReplenishProductId() { return _columnLocationReplenishProductId; }
    /**
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductId() { return _columnReplenishProductId; }
    /**
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositId() { return _columnReplenishDepositId; }
    /**
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeId() { return _columnMaxStoreProductShapeId; }
    /**
     * MAX_STORE_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeId() { return _columnReplenishStockTypeId; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeId() { return _columnReplenishPProductShapeId; }
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
        ls.add(columnLocationReplenishProductId());
        ls.add(columnLocationId());
        ls.add(columnReplenishProductId());
        ls.add(columnReplenishDepositId());
        ls.add(columnReplenishPNum());
        ls.add(columnMaxStoreProductShapeId());
        ls.add(columnMaxStoreNum());
        ls.add(columnReplenishStockTypeId());
        ls.add(columnReplenishPProductShapeId());
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
    protected UniqueInfo cpui() { return hpcpui(columnLocationReplenishProductId()); }
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
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK5", "MCustomer", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
    }
    /**
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProductShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMaxStoreProductShapeId(), MProductShapeDbm.getInstance().columnProductShapeId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK4", "MProductShape", this, MProductShapeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
    }
    /**
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishPProductShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK6", "MShape", this, MShapeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
    }
    /**
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK1", "MProduct", this, MProductDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
    }
    /**
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK2", "MLocation", this, MLocationDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
    }
    /**
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("M_LOCATION_REPLENISH_PRODUCT_FK3", "MStockType", this, MStockTypeDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "MLocationReplenishProductList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MLocationReplenishProduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MLocationReplenishProductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MLocationReplenishProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MLocationReplenishProduct> getEntityType() { return MLocationReplenishProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MLocationReplenishProduct newEntity() { return new MLocationReplenishProduct(); }
    public MLocationReplenishProduct newMyEntity() { return new MLocationReplenishProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MLocationReplenishProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MLocationReplenishProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
