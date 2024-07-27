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
 * The DB meta of t_picking_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPickingBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPickingBDbm _instance = new TPickingBDbm();
    private TPickingBDbm() {}
    public static TPickingBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPickingB)et).getPickingBId(), (et, vl) -> ((TPickingB)et).setPickingBId(ctl(vl)), "pickingBId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getPickingHId(), (et, vl) -> ((TPickingB)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getShippingInstBId(), (et, vl) -> ((TPickingB)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getAllocInstBId(), (et, vl) -> ((TPickingB)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getStockId(), (et, vl) -> ((TPickingB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getPickingNum(), (et, vl) -> ((TPickingB)et).setPickingNum(ctb(vl)), "pickingNum");
        setupEpg(_epgMap, et -> ((TPickingB)et).getTempNo(), (et, vl) -> ((TPickingB)et).setTempNo((String)vl), "tempNo");
        setupEpg(_epgMap, et -> ((TPickingB)et).getTransitNum(), (et, vl) -> ((TPickingB)et).setTransitNum(ctb(vl)), "transitNum");
        setupEpg(_epgMap, et -> ((TPickingB)et).getShapeId(), (et, vl) -> ((TPickingB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getPickedNum(), (et, vl) -> ((TPickingB)et).setPickedNum(ctl(vl)), "pickedNum");
        setupEpg(_epgMap, et -> ((TPickingB)et).getPickingPaternCd(), (et, vl) -> ((TPickingB)et).setPickingPaternCd((String)vl), "pickingPaternCd");
        setupEpg(_epgMap, et -> ((TPickingB)et).getIndvLabelNo(), (et, vl) -> ((TPickingB)et).setIndvLabelNo((String)vl), "indvLabelNo");
        setupEpg(_epgMap, et -> ((TPickingB)et).getOldPickingBId(), (et, vl) -> ((TPickingB)et).setOldPickingBId(ctl(vl)), "oldPickingBId");
        setupEpg(_epgMap, et -> ((TPickingB)et).getDelFlg(), (et, vl) -> ((TPickingB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPickingB)et).getVersionNo(), (et, vl) -> ((TPickingB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPickingB)et).getControlNo(), (et, vl) -> ((TPickingB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPickingB)et).getAddDt(), (et, vl) -> ((TPickingB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPickingB)et).getAddUser(), (et, vl) -> ((TPickingB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPickingB)et).getAddProcess(), (et, vl) -> ((TPickingB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPickingB)et).getUpdDt(), (et, vl) -> ((TPickingB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPickingB)et).getUpdUser(), (et, vl) -> ((TPickingB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPickingB)et).getUpdProcess(), (et, vl) -> ((TPickingB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPickingB)et).getMShape(), (et, vl) -> ((TPickingB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TPickingB)et).getTPickingH(), (et, vl) -> ((TPickingB)et).setTPickingH((TPickingH)vl), "TPickingH");
        setupEfpg(_efpgMap, et -> ((TPickingB)et).getTStock(), (et, vl) -> ((TPickingB)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TPickingB)et).getTShippingInstB(), (et, vl) -> ((TPickingB)et).setTShippingInstB((TShippingInstB)vl), "TShippingInstB");
        setupEfpg(_efpgMap, et -> ((TPickingB)et).getTAllocInstB(), (et, vl) -> ((TPickingB)et).setTAllocInstB((TAllocInstB)vl), "TAllocInstB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_picking_b";
    protected final String _tableDispName = "t_picking_b";
    protected final String _tablePropertyName = "TPickingB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_picking_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingBId = cci("PICKING_B_ID", "PICKING_B_ID", null, null, Long.class, "pickingBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TPackingBList,TPickingRecordStockList", null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TPickingH", null, null, false);
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TShippingInstB", null, null, false);
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TAllocInstB", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnPickingNum = cci("PICKING_NUM", "PICKING_NUM", null, null, java.math.BigDecimal.class, "pickingNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTempNo = cci("TEMP_NO", "TEMP_NO", null, null, String.class, "tempNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransitNum = cci("TRANSIT_NUM", "TRANSIT_NUM", null, null, java.math.BigDecimal.class, "transitNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnPickedNum = cci("PICKED_NUM", "PICKED_NUM", null, null, Long.class, "pickedNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingPaternCd = cci("PICKING_PATERN_CD", "PICKING_PATERN_CD", null, null, String.class, "pickingPaternCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelNo = cci("INDV_LABEL_NO", "INDV_LABEL_NO", null, null, String.class, "indvLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldPickingBId = cci("OLD_PICKING_B_ID", "OLD_PICKING_B_ID", null, null, Long.class, "oldPickingBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
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
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBId() { return _columnPickingBId; }
    /**
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }
    /**
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNum() { return _columnPickingNum; }
    /**
     * TEMP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTempNo() { return _columnTempNo; }
    /**
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransitNum() { return _columnTransitNum; }
    /**
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * PICKED_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickedNum() { return _columnPickedNum; }
    /**
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingPaternCd() { return _columnPickingPaternCd; }
    /**
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelNo() { return _columnIndvLabelNo; }
    /**
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldPickingBId() { return _columnOldPickingBId; }
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
        ls.add(columnPickingBId());
        ls.add(columnPickingHId());
        ls.add(columnShippingInstBId());
        ls.add(columnAllocInstBId());
        ls.add(columnStockId());
        ls.add(columnPickingNum());
        ls.add(columnTempNo());
        ls.add(columnTransitNum());
        ls.add(columnShapeId());
        ls.add(columnPickedNum());
        ls.add(columnPickingPaternCd());
        ls.add(columnIndvLabelNo());
        ls.add(columnOldPickingBId());
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
    protected UniqueInfo cpui() { return hpcpui(columnPickingBId()); }
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
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_PICKING_B_FK5", "MShape", this, MShapeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPickingBList", false);
    }
    /**
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTPickingH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingHId(), TPickingHDbm.getInstance().columnPickingHId());
        return cfi("T_PICKING_B_FK3", "TPickingH", this, TPickingHDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TPickingBList", false);
    }
    /**
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_PICKING_B_FK1", "TStock", this, TStockDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TPickingBList", false);
    }
    /**
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TShippingInstBDbm.getInstance().columnShippingInstBId());
        return cfi("T_PICKING_B_FK4", "TShippingInstB", this, TShippingInstBDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TPickingBList", false);
    }
    /**
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocInstBDbm.getInstance().columnAllocInstBId());
        return cfi("T_PICKING_B_FK2", "TAllocInstB", this, TAllocInstBDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TPickingBList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_packing_b by PICKING_B_ID, named 'TPackingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingBId(), TPackingBDbm.getInstance().columnPickingBId());
        return cri("T_PACKING_B_FK2", "TPackingBList", this, TPackingBDbm.getInstance(), mp, false, "TPickingB");
    }
    /**
     * t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRecordStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPickingBId(), TPickingRecordStockDbm.getInstance().columnPickingBId());
        return cri("T_PICKING_RECORD_STOCK_FK1", "TPickingRecordStockList", this, TPickingRecordStockDbm.getInstance(), mp, false, "TPickingB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPickingB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPickingBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPickingBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPickingB> getEntityType() { return TPickingB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPickingB newEntity() { return new TPickingB(); }
    public TPickingB newMyEntity() { return new TPickingB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPickingB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPickingB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
