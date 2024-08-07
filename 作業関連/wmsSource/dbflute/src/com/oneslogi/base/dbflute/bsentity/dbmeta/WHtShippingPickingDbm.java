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
 * The DB meta of w_ht_shipping_picking. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingPickingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtShippingPickingDbm _instance = new WHtShippingPickingDbm();
    private WHtShippingPickingDbm() {}
    public static WHtShippingPickingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getHtShippingPickingId(), (et, vl) -> ((WHtShippingPicking)et).setHtShippingPickingId(ctl(vl)), "htShippingPickingId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getMacAddress(), (et, vl) -> ((WHtShippingPicking)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getClientId(), (et, vl) -> ((WHtShippingPicking)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getCenterId(), (et, vl) -> ((WHtShippingPicking)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getPickingBId(), (et, vl) -> ((WHtShippingPicking)et).setPickingBId(ctl(vl)), "pickingBId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getNizoroeNo(), (et, vl) -> ((WHtShippingPicking)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getProductId(), (et, vl) -> ((WHtShippingPicking)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getJanCd(), (et, vl) -> ((WHtShippingPicking)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getProductCd(), (et, vl) -> ((WHtShippingPicking)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getProductNm(), (et, vl) -> ((WHtShippingPicking)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getInstNum(), (et, vl) -> ((WHtShippingPicking)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getSpgQtyOns(), (et, vl) -> ((WHtShippingPicking)et).setSpgQtyOns(ctb(vl)), "spgQtyOns");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLocationId(), (et, vl) -> ((WHtShippingPicking)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLocationCd(), (et, vl) -> ((WHtShippingPicking)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLocationNm(), (et, vl) -> ((WHtShippingPicking)et).setLocationNm((String)vl), "locationNm");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLot(), (et, vl) -> ((WHtShippingPicking)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLimitDt(), (et, vl) -> ((WHtShippingPicking)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getWorkStartDt(), (et, vl) -> ((WHtShippingPicking)et).setWorkStartDt(cttp(vl)), "workStartDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getWorkEndDt(), (et, vl) -> ((WHtShippingPicking)et).setWorkEndDt(cttp(vl)), "workEndDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getStoreLabelNo(), (et, vl) -> ((WHtShippingPicking)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLotId(), (et, vl) -> ((WHtShippingPicking)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getPickingFlg(), (et, vl) -> ((WHtShippingPicking)et).setPickingFlg((String)vl), "pickingFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getSkipNum(), (et, vl) -> ((WHtShippingPicking)et).setSkipNum(ctl(vl)), "skipNum");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getPickingWorkNo(), (et, vl) -> ((WHtShippingPicking)et).setPickingWorkNo((String)vl), "pickingWorkNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getProdDt(), (et, vl) -> ((WHtShippingPicking)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getForceCopleteFlg(), (et, vl) -> ((WHtShippingPicking)et).setForceCopleteFlg((String)vl), "forceCopleteFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getDaihyoNizoroeNo(), (et, vl) -> ((WHtShippingPicking)et).setDaihyoNizoroeNo((String)vl), "daihyoNizoroeNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getNizoroeNo2(), (et, vl) -> ((WHtShippingPicking)et).setNizoroeNo2((String)vl), "nizoroeNo2");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getDaihyoNizoroeNo2(), (et, vl) -> ((WHtShippingPicking)et).setDaihyoNizoroeNo2((String)vl), "daihyoNizoroeNo2");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getSuspendFlg(), (et, vl) -> ((WHtShippingPicking)et).setSuspendFlg((String)vl), "suspendFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getWorkGroupKey(), (et, vl) -> ((WHtShippingPicking)et).setWorkGroupKey((String)vl), "workGroupKey");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getAnotherPickingFlg(), (et, vl) -> ((WHtShippingPicking)et).setAnotherPickingFlg((String)vl), "anotherPickingFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getLapNum(), (et, vl) -> ((WHtShippingPicking)et).setLapNum(ctl(vl)), "lapNum");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getMultiPickFlg(), (et, vl) -> ((WHtShippingPicking)et).setMultiPickFlg((String)vl), "multiPickFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getMultiMacAddress(), (et, vl) -> ((WHtShippingPicking)et).setMultiMacAddress((String)vl), "multiMacAddress");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getDelFlg(), (et, vl) -> ((WHtShippingPicking)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getVersionNo(), (et, vl) -> ((WHtShippingPicking)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getControlNo(), (et, vl) -> ((WHtShippingPicking)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getAddDt(), (et, vl) -> ((WHtShippingPicking)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getAddUser(), (et, vl) -> ((WHtShippingPicking)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getAddProcess(), (et, vl) -> ((WHtShippingPicking)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getUpdDt(), (et, vl) -> ((WHtShippingPicking)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getUpdUser(), (et, vl) -> ((WHtShippingPicking)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtShippingPicking)et).getUpdProcess(), (et, vl) -> ((WHtShippingPicking)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtShippingPicking)et).getMCenter(), (et, vl) -> ((WHtShippingPicking)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtShippingPicking)et).getMClient(), (et, vl) -> ((WHtShippingPicking)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtShippingPicking)et).getMLocation(), (et, vl) -> ((WHtShippingPicking)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((WHtShippingPicking)et).getTLot(), (et, vl) -> ((WHtShippingPicking)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((WHtShippingPicking)et).getMProduct(), (et, vl) -> ((WHtShippingPicking)et).setMProduct((MProduct)vl), "MProduct");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "w_ht_shipping_picking";
    protected final String _tableDispName = "w_ht_shipping_picking";
    protected final String _tablePropertyName = "WHtShippingPicking";
    protected final TableSqlName _tableSqlName = new TableSqlName("w_ht_shipping_picking", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtShippingPickingId = cci("HT_SHIPPING_PICKING_ID", "HT_SHIPPING_PICKING_ID", null, null, Long.class, "htShippingPickingId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnPickingBId = cci("PICKING_B_ID", "PICKING_B_ID", null, null, Long.class, "pickingBId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpgQtyOns = cci("SPG_QTY_ONS", "SPG_QTY_ONS", null, null, java.math.BigDecimal.class, "spgQtyOns", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationNm = cci("LOCATION_NM", "LOCATION_NM", null, null, String.class, "locationNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkStartDt = cci("WORK_START_DT", "WORK_START_DT", null, null, java.sql.Timestamp.class, "workStartDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkEndDt = cci("WORK_END_DT", "WORK_END_DT", null, null, java.sql.Timestamp.class, "workEndDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnPickingFlg = cci("PICKING_FLG", "PICKING_FLG", null, null, String.class, "pickingFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSkipNum = cci("SKIP_NUM", "SKIP_NUM", null, null, Long.class, "skipNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkNo = cci("PICKING_WORK_NO", "PICKING_WORK_NO", null, null, String.class, "pickingWorkNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnForceCopleteFlg = cci("FORCE_COPLETE_FLG", "FORCE_COPLETE_FLG", null, null, String.class, "forceCopleteFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo = cci("DAIHYO_NIZOROE_NO", "DAIHYO_NIZOROE_NO", null, null, String.class, "daihyoNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo2 = cci("NIZOROE_NO2", "NIZOROE_NO2", null, null, String.class, "nizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo2 = cci("DAIHYO_NIZOROE_NO2", "DAIHYO_NIZOROE_NO2", null, null, String.class, "daihyoNizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSuspendFlg = cci("SUSPEND_FLG", "SUSPEND_FLG", null, null, String.class, "suspendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkGroupKey = cci("WORK_GROUP_KEY", "WORK_GROUP_KEY", null, null, String.class, "workGroupKey", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAnotherPickingFlg = cci("ANOTHER_PICKING_FLG", "ANOTHER_PICKING_FLG", null, null, String.class, "anotherPickingFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLapNum = cci("LAP_NUM", "LAP_NUM", null, null, Long.class, "lapNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMultiPickFlg = cci("MULTI_PICK_FLG", "MULTI_PICK_FLG", null, null, String.class, "multiPickFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMultiMacAddress = cci("MULTI_MAC_ADDRESS", "MULTI_MAC_ADDRESS", null, null, String.class, "multiMacAddress", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * HT_SHIPPING_PICKING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtShippingPickingId() { return _columnHtShippingPickingId; }
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
     * PICKING_B_ID: {IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBId() { return _columnPickingBId; }
    /**
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpgQtyOns() { return _columnSpgQtyOns; }
    /**
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
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
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotId() { return _columnLotId; }
    /**
     * PICKING_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingFlg() { return _columnPickingFlg; }
    /**
     * SKIP_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSkipNum() { return _columnSkipNum; }
    /**
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkNo() { return _columnPickingWorkNo; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * FORCE_COPLETE_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnForceCopleteFlg() { return _columnForceCopleteFlg; }
    /**
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo() { return _columnDaihyoNizoroeNo; }
    /**
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo2() { return _columnNizoroeNo2; }
    /**
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo2() { return _columnDaihyoNizoroeNo2; }
    /**
     * SUSPEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSuspendFlg() { return _columnSuspendFlg; }
    /**
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkGroupKey() { return _columnWorkGroupKey; }
    /**
     * ANOTHER_PICKING_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAnotherPickingFlg() { return _columnAnotherPickingFlg; }
    /**
     * LAP_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLapNum() { return _columnLapNum; }
    /**
     * MULTI_PICK_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiPickFlg() { return _columnMultiPickFlg; }
    /**
     * MULTI_MAC_ADDRESS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMultiMacAddress() { return _columnMultiMacAddress; }
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
        ls.add(columnHtShippingPickingId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnPickingBId());
        ls.add(columnNizoroeNo());
        ls.add(columnProductId());
        ls.add(columnJanCd());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnInstNum());
        ls.add(columnSpgQtyOns());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnLocationNm());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnWorkStartDt());
        ls.add(columnWorkEndDt());
        ls.add(columnStoreLabelNo());
        ls.add(columnLotId());
        ls.add(columnPickingFlg());
        ls.add(columnSkipNum());
        ls.add(columnPickingWorkNo());
        ls.add(columnProdDt());
        ls.add(columnForceCopleteFlg());
        ls.add(columnDaihyoNizoroeNo());
        ls.add(columnNizoroeNo2());
        ls.add(columnDaihyoNizoroeNo2());
        ls.add(columnSuspendFlg());
        ls.add(columnWorkGroupKey());
        ls.add(columnAnotherPickingFlg());
        ls.add(columnLapNum());
        ls.add(columnMultiPickFlg());
        ls.add(columnMultiMacAddress());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtShippingPickingId()); }
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
        return cfi("W_HT_SHIPPING_PICKING_FK2", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtShippingPickingList", false);
    }
    /**
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_SHIPPING_PICKING_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtShippingPickingList", false);
    }
    /**
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("W_HT_SHIPPING_PICKING_FK5", "MLocation", this, MLocationDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtShippingPickingList", false);
    }
    /**
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("W_HT_SHIPPING_PICKING_FK4", "TLot", this, TLotDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "WHtShippingPickingList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("W_HT_SHIPPING_PICKING_FK3", "MProduct", this, MProductDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "WHtShippingPickingList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtShippingPicking"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtShippingPickingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtShippingPickingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtShippingPicking> getEntityType() { return WHtShippingPicking.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtShippingPicking newEntity() { return new WHtShippingPicking(); }
    public WHtShippingPicking newMyEntity() { return new WHtShippingPicking(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtShippingPicking)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtShippingPicking)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
