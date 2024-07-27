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
 * The DB meta of m_location. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MLocationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MLocationDbm _instance = new MLocationDbm();
    private MLocationDbm() {}
    public static MLocationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MLocation)et).getLocationId(), (et, vl) -> ((MLocation)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((MLocation)et).getCenterId(), (et, vl) -> ((MLocation)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MLocation)et).getZoneId(), (et, vl) -> ((MLocation)et).setZoneId(ctl(vl)), "zoneId");
        setupEpg(_epgMap, et -> ((MLocation)et).getLocationCd(), (et, vl) -> ((MLocation)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((MLocation)et).getLocationNm(), (et, vl) -> ((MLocation)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((MLocation)et).getPickingLocationFlg(), (et, vl) -> ((MLocation)et).setPickingLocationFlg((String)vl), "pickingLocationFlg");
        setupEpg(_epgMap, et -> ((MLocation)et).getPickingOrder(), (et, vl) -> ((MLocation)et).setPickingOrder(ctl(vl)), "pickingOrder");
        setupEpg(_epgMap, et -> ((MLocation)et).getLocationType(), (et, vl) -> ((MLocation)et).setLocationType((String)vl), "locationType");
        setupEpg(_epgMap, et -> ((MLocation)et).getAllocOrder(), (et, vl) -> ((MLocation)et).setAllocOrder(ctl(vl)), "allocOrder");
        setupEpg(_epgMap, et -> ((MLocation)et).getAllocNgFlg(), (et, vl) -> ((MLocation)et).setAllocNgFlg((String)vl), "allocNgFlg");
        setupEpg(_epgMap, et -> ((MLocation)et).getReplenishProductId(), (et, vl) -> ((MLocation)et).setReplenishProductId(ctl(vl)), "replenishProductId");
        setupEpg(_epgMap, et -> ((MLocation)et).getReplenishStockTypeId(), (et, vl) -> ((MLocation)et).setReplenishStockTypeId(ctl(vl)), "replenishStockTypeId");
        setupEpg(_epgMap, et -> ((MLocation)et).getReplenishDepositId(), (et, vl) -> ((MLocation)et).setReplenishDepositId(ctl(vl)), "replenishDepositId");
        setupEpg(_epgMap, et -> ((MLocation)et).getReplenishPNum(), (et, vl) -> ((MLocation)et).setReplenishPNum(ctb(vl)), "replenishPNum");
        setupEpg(_epgMap, et -> ((MLocation)et).getReplenishPProductShapeId(), (et, vl) -> ((MLocation)et).setReplenishPProductShapeId(ctl(vl)), "replenishPProductShapeId");
        setupEpg(_epgMap, et -> ((MLocation)et).getMaxStoreNum(), (et, vl) -> ((MLocation)et).setMaxStoreNum(ctb(vl)), "maxStoreNum");
        setupEpg(_epgMap, et -> ((MLocation)et).getMaxStoreProductShapeId(), (et, vl) -> ((MLocation)et).setMaxStoreProductShapeId(ctl(vl)), "maxStoreProductShapeId");
        setupEpg(_epgMap, et -> ((MLocation)et).getExternalWhFlg(), (et, vl) -> ((MLocation)et).setExternalWhFlg((String)vl), "externalWhFlg");
        setupEpg(_epgMap, et -> ((MLocation)et).getLocationAttribute(), (et, vl) -> ((MLocation)et).setLocationAttribute((String)vl), "locationAttribute");
        setupEpg(_epgMap, et -> ((MLocation)et).getDelFlg(), (et, vl) -> ((MLocation)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MLocation)et).getVersionNo(), (et, vl) -> ((MLocation)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MLocation)et).getControlNo(), (et, vl) -> ((MLocation)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MLocation)et).getAddDt(), (et, vl) -> ((MLocation)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MLocation)et).getAddUser(), (et, vl) -> ((MLocation)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MLocation)et).getAddProcess(), (et, vl) -> ((MLocation)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MLocation)et).getUpdDt(), (et, vl) -> ((MLocation)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MLocation)et).getUpdUser(), (et, vl) -> ((MLocation)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MLocation)et).getUpdProcess(), (et, vl) -> ((MLocation)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMCustomer(), (et, vl) -> ((MLocation)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMProductShapeByMaxStoreProductShapeId(), (et, vl) -> ((MLocation)et).setMProductShapeByMaxStoreProductShapeId((MProductShape)vl), "MProductShapeByMaxStoreProductShapeId");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMProductShapeByReplenishPProductShapeId(), (et, vl) -> ((MLocation)et).setMProductShapeByReplenishPProductShapeId((MProductShape)vl), "MProductShapeByReplenishPProductShapeId");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMZone(), (et, vl) -> ((MLocation)et).setMZone((MZone)vl), "MZone");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMCenter(), (et, vl) -> ((MLocation)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMProduct(), (et, vl) -> ((MLocation)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getMStockType(), (et, vl) -> ((MLocation)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getBClassDtlByAllocNgFlg(), (et, vl) -> ((MLocation)et).setBClassDtlByAllocNgFlg((BClassDtl)vl), "BClassDtlByAllocNgFlg");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getBClassDtlByDelFlg(), (et, vl) -> ((MLocation)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getBClassDtlByLocationType(), (et, vl) -> ((MLocation)et).setBClassDtlByLocationType((BClassDtl)vl), "BClassDtlByLocationType");
        setupEfpg(_efpgMap, et -> ((MLocation)et).getBClassDtlByPickingLocationFlg(), (et, vl) -> ((MLocation)et).setBClassDtlByPickingLocationFlg((BClassDtl)vl), "BClassDtlByPickingLocationFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_location";
    protected final String _tableDispName = "m_location";
    protected final String _tablePropertyName = "MLocation";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_location", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "HLocationAttributeList,MLocationReplenishProductList,TAllocInstBList,TInventoryBList,TMoveInstBList,TMoveRecordBList,TReceivePlanBList,TShippingInstBList,TStockList,TStoreRecordBList,WHtInventoryInputProdList,WHtPickingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtShippingPickingList,WHtTotalPickingList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnZoneId = cci("ZONE_ID", "ZONE_ID", null, null, Long.class, "zoneId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MZone", null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingLocationFlg = cci("PICKING_LOCATION_FLG", "PICKING_LOCATION_FLG", null, null, String.class, "pickingLocationFlg", null, false, false, true, "CHAR", 1, 0, null, "1", false, null, null, "BClassDtlByPickingLocationFlg", null, CDef.DefMeta.PickingLocationFlg, false);
    protected final ColumnInfo _columnPickingOrder = cci("PICKING_ORDER", "PICKING_ORDER", null, null, Long.class, "pickingOrder", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationType = cci("LOCATION_TYPE", "LOCATION_TYPE", null, null, String.class, "locationType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByLocationType", null, CDef.DefMeta.LocationType, false);
    protected final ColumnInfo _columnAllocOrder = cci("ALLOC_ORDER", "ALLOC_ORDER", null, null, Long.class, "allocOrder", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNgFlg = cci("ALLOC_NG_FLG", "ALLOC_NG_FLG", null, null, String.class, "allocNgFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByAllocNgFlg", null, CDef.DefMeta.AllcNgFlg, false);
    protected final ColumnInfo _columnReplenishProductId = cci("REPLENISH_PRODUCT_ID", "REPLENISH_PRODUCT_ID", null, null, Long.class, "replenishProductId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnReplenishStockTypeId = cci("REPLENISH_STOCK_TYPE_ID", "REPLENISH_STOCK_TYPE_ID", null, null, Long.class, "replenishStockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnReplenishDepositId = cci("REPLENISH_DEPOSIT_ID", "REPLENISH_DEPOSIT_ID", null, null, Long.class, "replenishDepositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnReplenishPNum = cci("REPLENISH_P_NUM", "REPLENISH_P_NUM", null, null, java.math.BigDecimal.class, "replenishPNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReplenishPProductShapeId = cci("REPLENISH_P_PRODUCT_SHAPE_ID", "REPLENISH_P_PRODUCT_SHAPE_ID", null, null, Long.class, "replenishPProductShapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProductShapeByReplenishPProductShapeId", null, null, false);
    protected final ColumnInfo _columnMaxStoreNum = cci("MAX_STORE_NUM", "MAX_STORE_NUM", null, null, java.math.BigDecimal.class, "maxStoreNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMaxStoreProductShapeId = cci("MAX_STORE_PRODUCT_SHAPE_ID", "MAX_STORE_PRODUCT_SHAPE_ID", null, null, Long.class, "maxStoreProductShapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProductShapeByMaxStoreProductShapeId", null, null, false);
    protected final ColumnInfo _columnExternalWhFlg = cci("EXTERNAL_WH_FLG", "EXTERNAL_WH_FLG", null, null, String.class, "externalWhFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationAttribute = cci("LOCATION_ATTRIBUTE", "LOCATION_ATTRIBUTE", null, null, String.class, "locationAttribute", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnZoneId() { return _columnZoneId; }
    /**
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * LOCATION_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationNm() { return _columnLocationNm; }
    /**
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingLocationFlg() { return _columnPickingLocationFlg; }
    /**
     * PICKING_ORDER: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingOrder() { return _columnPickingOrder; }
    /**
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationType() { return _columnLocationType; }
    /**
     * ALLOC_ORDER: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocOrder() { return _columnAllocOrder; }
    /**
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNgFlg() { return _columnAllocNgFlg; }
    /**
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishProductId() { return _columnReplenishProductId; }
    /**
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishStockTypeId() { return _columnReplenishStockTypeId; }
    /**
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishDepositId() { return _columnReplenishDepositId; }
    /**
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPNum() { return _columnReplenishPNum; }
    /**
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReplenishPProductShapeId() { return _columnReplenishPProductShapeId; }
    /**
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreNum() { return _columnMaxStoreNum; }
    /**
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMaxStoreProductShapeId() { return _columnMaxStoreProductShapeId; }
    /**
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnExternalWhFlg() { return _columnExternalWhFlg; }
    /**
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationAttribute() { return _columnLocationAttribute; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnLocationId());
        ls.add(columnCenterId());
        ls.add(columnZoneId());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnPickingLocationFlg());
        ls.add(columnPickingOrder());
        ls.add(columnLocationType());
        ls.add(columnAllocOrder());
        ls.add(columnAllocNgFlg());
        ls.add(columnReplenishProductId());
        ls.add(columnReplenishStockTypeId());
        ls.add(columnReplenishDepositId());
        ls.add(columnReplenishPNum());
        ls.add(columnReplenishPProductShapeId());
        ls.add(columnMaxStoreNum());
        ls.add(columnMaxStoreProductShapeId());
        ls.add(columnExternalWhFlg());
        ls.add(columnLocationAttribute());
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
    protected UniqueInfo cpui() { return hpcpui(columnLocationId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnLocationCd());
        return hpcui(ls);
    }

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
        return cfi("M_LOCATION_FK5", "MCustomer", this, MCustomerDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MLocationList", false);
    }
    /**
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProductShapeByMaxStoreProductShapeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMaxStoreProductShapeId(), MProductShapeDbm.getInstance().columnProductShapeId());
        return cfi("M_LOCATION_FK1", "MProductShapeByMaxStoreProductShapeId", this, MProductShapeDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MLocationByMaxStoreProductShapeIdList", false);
    }
    /**
     * m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProductShapeByReplenishPProductShapeId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishPProductShapeId(), MProductShapeDbm.getInstance().columnProductShapeId());
        return cfi("M_LOCATION_FK2", "MProductShapeByReplenishPProductShapeId", this, MProductShapeDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "MLocationByReplenishPProductShapeIdList", false);
    }
    /**
     * m_zone by my ZONE_ID, named 'MZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnZoneId(), MZoneDbm.getInstance().columnZoneId());
        return cfi("M_LOCATION_FK7", "MZone", this, MZoneDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "MLocationList", false);
    }
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_LOCATION_FK4", "MCenter", this, MCenterDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "MLocationList", false);
    }
    /**
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("M_LOCATION_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "MLocationList", false);
    }
    /**
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReplenishStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("M_LOCATION_FK6", "MStockType", this, MStockTypeDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "MLocationList", false);
    }
    /**
     * b_class_dtl by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByAllocNgFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocNgFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_LOCATION_ALLOC_NG_FLG", "BClassDtlByAllocNgFlg", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ALLC_NG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_LOCATION_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LOCATION_TYPE, named 'BClassDtlByLocationType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLocationType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_LOCATION_LOCATION_TYPE", "BClassDtlByLocationType", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOCATION_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByPickingLocationFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingLocationFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_LOCATION_PICKING_LOCATION_FLG", "BClassDtlByPickingLocationFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PICKING_LOCATION_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * h_location_attribute by LOCATION_ID, named 'HLocationAttributeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHLocationAttributeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), HLocationAttributeDbm.getInstance().columnLocationId());
        return cri("H_LOCATION_ATTRIBUTE_FK2", "HLocationAttributeList", this, HLocationAttributeDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * m_location_replenish_product by LOCATION_ID, named 'MLocationReplenishProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationReplenishProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationReplenishProductDbm.getInstance().columnLocationId());
        return cri("M_LOCATION_REPLENISH_PRODUCT_FK2", "MLocationReplenishProductList", this, MLocationReplenishProductDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_alloc_inst_b by LOCATION_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TAllocInstBDbm.getInstance().columnLocationId());
        return cri("T_ALLOC_INST_B_FK7", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_inventory_b by LOCATION_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TInventoryBDbm.getInstance().columnLocationId());
        return cri("T_INVENTORY_B_FK6", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_move_inst_b by LOCATION_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TMoveInstBDbm.getInstance().columnLocationId());
        return cri("T_MOVE_INST_B_FK6", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_move_record_b by LOCATION_ID, named 'TMoveRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TMoveRecordBDbm.getInstance().columnLocationId());
        return cri("T_MOVE_RECORD_B_FK4", "TMoveRecordBList", this, TMoveRecordBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_receive_plan_b by PLAN_LOCATION_ID, named 'TReceivePlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TReceivePlanBDbm.getInstance().columnPlanLocationId());
        return cri("T_RECEIVE_PLAN_B_FK1", "TReceivePlanBList", this, TReceivePlanBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_shipping_inst_b by LOCATION_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TShippingInstBDbm.getInstance().columnLocationId());
        return cri("T_SHIPPING_INST_B_FK1", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_stock by LOCATION_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TStockDbm.getInstance().columnLocationId());
        return cri("T_STOCK_FK2", "TStockList", this, TStockDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * t_store_record_b by STORE_LOCATION_ID, named 'TStoreRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), TStoreRecordBDbm.getInstance().columnStoreLocationId());
        return cri("T_STORE_RECORD_B_FK1", "TStoreRecordBList", this, TStoreRecordBDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_inventory_input_prod by LOC_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtInventoryInputProdDbm.getInstance().columnLocId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK2", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_picking by LOCATION_ID, named 'WHtPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtPickingDbm.getInstance().columnLocationId());
        return cri("W_HT_PICKING_FK5", "WHtPickingList", this, WHtPickingDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_receive_inspection by RCV_LOC_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtReceiveInspectionDbm.getInstance().columnRcvLocId());
        return cri("W_HT_RECEIVE_INSPECTION_FK6", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_receive_no_plan_insp by RCV_LOC_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtReceiveNoPlanInspDbm.getInstance().columnRcvLocId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK6", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_receive_store by LOC_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtReceiveStoreDbm.getInstance().columnLocId());
        return cri("W_HT_RECEIVE_STORE_FK1", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_shipping_picking by LOCATION_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtShippingPickingDbm.getInstance().columnLocationId());
        return cri("W_HT_SHIPPING_PICKING_FK5", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MLocation");
    }
    /**
     * w_ht_total_picking by LOCATION_ID, named 'WHtTotalPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtTotalPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), WHtTotalPickingDbm.getInstance().columnLocationId());
        return cri("W_HT_TOTAL_PICKING_FK4", "WHtTotalPickingList", this, WHtTotalPickingDbm.getInstance(), mp, false, "MLocation");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MLocation"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MLocationCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MLocationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MLocation> getEntityType() { return MLocation.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MLocation newEntity() { return new MLocation(); }
    public MLocation newMyEntity() { return new MLocation(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MLocation)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MLocation)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
