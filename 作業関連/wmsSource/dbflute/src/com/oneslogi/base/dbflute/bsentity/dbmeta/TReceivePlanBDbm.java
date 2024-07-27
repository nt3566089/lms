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
 * The DB meta of t_receive_plan_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceivePlanBDbm _instance = new TReceivePlanBDbm();
    private TReceivePlanBDbm() {}
    public static TReceivePlanBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceivePlanBId(), (et, vl) -> ((TReceivePlanB)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceivePlanHId(), (et, vl) -> ((TReceivePlanB)et).setReceivePlanHId(ctl(vl)), "receivePlanHId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getLineNo(), (et, vl) -> ((TReceivePlanB)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getReceiveStatus(), (et, vl) -> ((TReceivePlanB)et).setReceiveStatus((String)vl), "receiveStatus");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanClientOrderNo(), (et, vl) -> ((TReceivePlanB)et).setPlanClientOrderNo((String)vl), "planClientOrderNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanWarehouseId(), (et, vl) -> ((TReceivePlanB)et).setPlanWarehouseId(ctl(vl)), "planWarehouseId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanWarehouseCd(), (et, vl) -> ((TReceivePlanB)et).setPlanWarehouseCd((String)vl), "planWarehouseCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getProductId(), (et, vl) -> ((TReceivePlanB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getProductCd(), (et, vl) -> ((TReceivePlanB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLot(), (et, vl) -> ((TReceivePlanB)et).setPlanLot((String)vl), "planLot");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLimitDt(), (et, vl) -> ((TReceivePlanB)et).setPlanLimitDt((String)vl), "planLimitDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLocationId(), (et, vl) -> ((TReceivePlanB)et).setPlanLocationId(ctl(vl)), "planLocationId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanLocationCd(), (et, vl) -> ((TReceivePlanB)et).setPlanLocationCd((String)vl), "planLocationCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanStoreLabelNo(), (et, vl) -> ((TReceivePlanB)et).setPlanStoreLabelNo((String)vl), "planStoreLabelNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanNum(), (et, vl) -> ((TReceivePlanB)et).setPlanNum(ctb(vl)), "planNum");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getErrorFlg(), (et, vl) -> ((TReceivePlanB)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getErrorMessageCd(), (et, vl) -> ((TReceivePlanB)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getStoreRowNo(), (et, vl) -> ((TReceivePlanB)et).setStoreRowNo((String)vl), "storeRowNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getPlanProdDt(), (et, vl) -> ((TReceivePlanB)et).setPlanProdDt((String)vl), "planProdDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getHinmokuGroup(), (et, vl) -> ((TReceivePlanB)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getHinmokuText(), (et, vl) -> ((TReceivePlanB)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getJanCd(), (et, vl) -> ((TReceivePlanB)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUnitNm(), (et, vl) -> ((TReceivePlanB)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getRemainingReceiveNum(), (et, vl) -> ((TReceivePlanB)et).setRemainingReceiveNum(ctb(vl)), "remainingReceiveNum");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getLotManagTypeId(), (et, vl) -> ((TReceivePlanB)et).setLotManagTypeId(ctl(vl)), "lotManagTypeId");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getLotManagTypeCd(), (et, vl) -> ((TReceivePlanB)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getShippingPlantCd(), (et, vl) -> ((TReceivePlanB)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getShippingStorageSpaceCd(), (et, vl) -> ((TReceivePlanB)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getRemainFlg(), (et, vl) -> ((TReceivePlanB)et).setRemainFlg((String)vl), "remainFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getWmSendFlg(), (et, vl) -> ((TReceivePlanB)et).setWmSendFlg((String)vl), "wmSendFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getLpSendFlg(), (et, vl) -> ((TReceivePlanB)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getDelFlg(), (et, vl) -> ((TReceivePlanB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getVersionNo(), (et, vl) -> ((TReceivePlanB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getControlNo(), (et, vl) -> ((TReceivePlanB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddDt(), (et, vl) -> ((TReceivePlanB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddUser(), (et, vl) -> ((TReceivePlanB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getAddProcess(), (et, vl) -> ((TReceivePlanB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdDt(), (et, vl) -> ((TReceivePlanB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdUser(), (et, vl) -> ((TReceivePlanB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceivePlanB)et).getUpdProcess(), (et, vl) -> ((TReceivePlanB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getTReceivePlanH(), (et, vl) -> ((TReceivePlanB)et).setTReceivePlanH((TReceivePlanH)vl), "TReceivePlanH");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMLocation(), (et, vl) -> ((TReceivePlanB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMWarehouse(), (et, vl) -> ((TReceivePlanB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getMProduct(), (et, vl) -> ((TReceivePlanB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TReceivePlanB)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getBClassDtlByReceiveStatus(), (et, vl) -> ((TReceivePlanB)et).setBClassDtlByReceiveStatus((BClassDtl)vl), "BClassDtlByReceiveStatus");
        setupEfpg(_efpgMap, et -> ((TReceivePlanB)et).getTReceivePlanSpareAsOne(), (et, vl) -> ((TReceivePlanB)et).setTReceivePlanSpareAsOne((TReceivePlanSpare)vl), "TReceivePlanSpareAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_receive_plan_b";
    protected final String _tableDispName = "t_receive_plan_b";
    protected final String _tablePropertyName = "TReceivePlanB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_receive_plan_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TReceiveLabelList,TReceivePlanDataTransferList,TStoreRecordBList", null, false);
    protected final ColumnInfo _columnReceivePlanHId = cci("RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", null, null, Long.class, "receivePlanHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TReceivePlanH", null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStatus = cci("RECEIVE_STATUS", "RECEIVE_STATUS", null, null, String.class, "receiveStatus", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByReceiveStatus", null, CDef.DefMeta.ReceiveStatus, false);
    protected final ColumnInfo _columnPlanClientOrderNo = cci("PLAN_CLIENT_ORDER_NO", "PLAN_CLIENT_ORDER_NO", null, null, String.class, "planClientOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanWarehouseId = cci("PLAN_WAREHOUSE_ID", "PLAN_WAREHOUSE_ID", null, null, Long.class, "planWarehouseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnPlanWarehouseCd = cci("PLAN_WAREHOUSE_CD", "PLAN_WAREHOUSE_CD", null, null, String.class, "planWarehouseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLot = cci("PLAN_LOT", "PLAN_LOT", null, null, String.class, "planLot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLimitDt = cci("PLAN_LIMIT_DT", "PLAN_LIMIT_DT", null, null, String.class, "planLimitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanLocationId = cci("PLAN_LOCATION_ID", "PLAN_LOCATION_ID", null, null, Long.class, "planLocationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnPlanLocationCd = cci("PLAN_LOCATION_CD", "PLAN_LOCATION_CD", null, null, String.class, "planLocationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanStoreLabelNo = cci("PLAN_STORE_LABEL_NO", "PLAN_STORE_LABEL_NO", null, null, String.class, "planStoreLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanNum = cci("PLAN_NUM", "PLAN_NUM", null, null, java.math.BigDecimal.class, "planNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreRowNo = cci("STORE_ROW_NO", "STORE_ROW_NO", null, null, String.class, "storeRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlanProdDt = cci("PLAN_PROD_DT", "PLAN_PROD_DT", null, null, String.class, "planProdDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemainingReceiveNum = cci("REMAINING_RECEIVE_NUM", "REMAINING_RECEIVE_NUM", null, null, java.math.BigDecimal.class, "remainingReceiveNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeId = cci("LOT_MANAG_TYPE_ID", "LOT_MANAG_TYPE_ID", null, null, Long.class, "lotManagTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemainFlg = cci("REMAIN_FLG", "REMAIN_FLG", null, null, String.class, "remainFlg", null, false, false, true, "CHAR", 1, 0, null, "1", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmSendFlg = cci("WM_SEND_FLG", "WM_SEND_FLG", null, null, String.class, "wmSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanHId() { return _columnReceivePlanHId; }
    /**
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStatus() { return _columnReceiveStatus; }
    /**
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanClientOrderNo() { return _columnPlanClientOrderNo; }
    /**
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanWarehouseId() { return _columnPlanWarehouseId; }
    /**
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanWarehouseCd() { return _columnPlanWarehouseCd; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PLAN_LOT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLot() { return _columnPlanLot; }
    /**
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLimitDt() { return _columnPlanLimitDt; }
    /**
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationId() { return _columnPlanLocationId; }
    /**
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanLocationCd() { return _columnPlanLocationCd; }
    /**
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanStoreLabelNo() { return _columnPlanStoreLabelNo; }
    /**
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanNum() { return _columnPlanNum; }
    /**
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * STORE_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRowNo() { return _columnStoreRowNo; }
    /**
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlanProdDt() { return _columnPlanProdDt; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
    /**
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuText() { return _columnHinmokuText; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * UNIT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemainingReceiveNum() { return _columnRemainingReceiveNum; }
    /**
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeId() { return _columnLotManagTypeId; }
    /**
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeCd() { return _columnLotManagTypeCd; }
    /**
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlantCd() { return _columnShippingPlantCd; }
    /**
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStorageSpaceCd() { return _columnShippingStorageSpaceCd; }
    /**
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemainFlg() { return _columnRemainFlg; }
    /**
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmSendFlg() { return _columnWmSendFlg; }
    /**
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
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
        ls.add(columnReceivePlanBId());
        ls.add(columnReceivePlanHId());
        ls.add(columnLineNo());
        ls.add(columnReceiveStatus());
        ls.add(columnPlanClientOrderNo());
        ls.add(columnPlanWarehouseId());
        ls.add(columnPlanWarehouseCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnPlanLot());
        ls.add(columnPlanLimitDt());
        ls.add(columnPlanLocationId());
        ls.add(columnPlanLocationCd());
        ls.add(columnPlanStoreLabelNo());
        ls.add(columnPlanNum());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnStoreRowNo());
        ls.add(columnPlanProdDt());
        ls.add(columnHinmokuGroup());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnUnitNm());
        ls.add(columnRemainingReceiveNum());
        ls.add(columnLotManagTypeId());
        ls.add(columnLotManagTypeCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnRemainFlg());
        ls.add(columnWmSendFlg());
        ls.add(columnLpSendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceivePlanBId()); }
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
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanHId(), TReceivePlanHDbm.getInstance().columnReceivePlanHId());
        return cfi("T_RECEIVE_PLAN_B_FK2", "TReceivePlanH", this, TReceivePlanHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * m_location by my PLAN_LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_RECEIVE_PLAN_B_FK1", "MLocation", this, MLocationDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPlanWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_RECEIVE_PLAN_B_FK3", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_RECEIVE_PLAN_B_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TReceivePlanBList", false);
    }
    /**
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_B_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByReceiveStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceiveStatus(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_RECEIVE_PLAN_B_RECEIVE_STATUS", "BClassDtlByReceiveStatus", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'RECEIVE_STATUS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTReceivePlanSpareAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanSpareDbm.getInstance().columnReceivePlanBId());
        return cfi("T_RECEIVE_PLAN_SPARE_FK1", "TReceivePlanSpareAsOne", this, TReceivePlanSpareDbm.getInstance(), mp, 6, null, true, false, true, false, null, null, false, "TReceivePlanB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceiveLabelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceiveLabelDbm.getInstance().columnReceivePlanBId());
        return cri("T_RECEIVE_LABEL_FK3", "TReceiveLabelList", this, TReceiveLabelDbm.getInstance(), mp, false, "TReceivePlanB");
    }
    /**
     * t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanDataTransferList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanDataTransferDbm.getInstance().columnReceivePlanBId());
        return cri("T_RECEIVE_PLAN_DATA_TRANSFER_FK1", "TReceivePlanDataTransferList", this, TReceivePlanDataTransferDbm.getInstance(), mp, false, "TReceivePlanB");
    }
    /**
     * t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TStoreRecordBDbm.getInstance().columnReceivePlanBId());
        return cri("T_STORE_RECORD_B_FK2", "TStoreRecordBList", this, TStoreRecordBDbm.getInstance(), mp, false, "TReceivePlanB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceivePlanB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceivePlanBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceivePlanB> getEntityType() { return TReceivePlanB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceivePlanB newEntity() { return new TReceivePlanB(); }
    public TReceivePlanB newMyEntity() { return new TReceivePlanB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceivePlanB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceivePlanB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
