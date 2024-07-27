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
 * The DB meta of t_shipping_plan_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingPlanBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingPlanBDbm _instance = new TShippingPlanBDbm();
    private TShippingPlanBDbm() {}
    public static TShippingPlanBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getShippingPlanBId(), (et, vl) -> ((TShippingPlanB)et).setShippingPlanBId(ctl(vl)), "shippingPlanBId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getShippingPlanHId(), (et, vl) -> ((TShippingPlanB)et).setShippingPlanHId(ctl(vl)), "shippingPlanHId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLineNo(), (et, vl) -> ((TShippingPlanB)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getWarehouseId(), (et, vl) -> ((TShippingPlanB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getWarehouseCd(), (et, vl) -> ((TShippingPlanB)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getProductId(), (et, vl) -> ((TShippingPlanB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getProductCd(), (et, vl) -> ((TShippingPlanB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLocationId(), (et, vl) -> ((TShippingPlanB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLocationCd(), (et, vl) -> ((TShippingPlanB)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getDepositId(), (et, vl) -> ((TShippingPlanB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getDepositCd(), (et, vl) -> ((TShippingPlanB)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLotId(), (et, vl) -> ((TShippingPlanB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLot(), (et, vl) -> ((TShippingPlanB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLimitDt(), (et, vl) -> ((TShippingPlanB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getStoreNoId(), (et, vl) -> ((TShippingPlanB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getStoreLabelNo(), (et, vl) -> ((TShippingPlanB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getShapeId(), (et, vl) -> ((TShippingPlanB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getShapeCd(), (et, vl) -> ((TShippingPlanB)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUnitNum(), (et, vl) -> ((TShippingPlanB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getInstNum(), (et, vl) -> ((TShippingPlanB)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getErrorFlg(), (et, vl) -> ((TShippingPlanB)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getErrorMessageCd(), (et, vl) -> ((TShippingPlanB)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getAllocInstBId(), (et, vl) -> ((TShippingPlanB)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getAllocNum(), (et, vl) -> ((TShippingPlanB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getStockOutNum(), (et, vl) -> ((TShippingPlanB)et).setStockOutNum(ctb(vl)), "stockOutNum");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUnitPrice(), (et, vl) -> ((TShippingPlanB)et).setUnitPrice(ctb(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getPrice(), (et, vl) -> ((TShippingPlanB)et).setPrice(ctb(vl)), "price");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getTax(), (et, vl) -> ((TShippingPlanB)et).setTax(ctb(vl)), "tax");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getCasePieceTypeId(), (et, vl) -> ((TShippingPlanB)et).setCasePieceTypeId(ctl(vl)), "casePieceTypeId");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getCasePieceTypeCd(), (et, vl) -> ((TShippingPlanB)et).setCasePieceTypeCd((String)vl), "casePieceTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getProdDt(), (et, vl) -> ((TShippingPlanB)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getJanCd(), (et, vl) -> ((TShippingPlanB)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getHinmokuGroup(), (et, vl) -> ((TShippingPlanB)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getHinmokuText(), (et, vl) -> ((TShippingPlanB)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUnitNm(), (et, vl) -> ((TShippingPlanB)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getStoreStorageSpaceCd(), (et, vl) -> ((TShippingPlanB)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getStorePlantCd(), (et, vl) -> ((TShippingPlanB)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getTransactionTypeCd(), (et, vl) -> ((TShippingPlanB)et).setTransactionTypeCd((String)vl), "transactionTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getCmSendFlg(), (et, vl) -> ((TShippingPlanB)et).setCmSendFlg((String)vl), "cmSendFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getLpSendFlg(), (et, vl) -> ((TShippingPlanB)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getDelFlg(), (et, vl) -> ((TShippingPlanB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getVersionNo(), (et, vl) -> ((TShippingPlanB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getControlNo(), (et, vl) -> ((TShippingPlanB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getAddDt(), (et, vl) -> ((TShippingPlanB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getAddUser(), (et, vl) -> ((TShippingPlanB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getAddProcess(), (et, vl) -> ((TShippingPlanB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUpdDt(), (et, vl) -> ((TShippingPlanB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUpdUser(), (et, vl) -> ((TShippingPlanB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingPlanB)et).getUpdProcess(), (et, vl) -> ((TShippingPlanB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShippingPlanB)et).getTShippingPlanH(), (et, vl) -> ((TShippingPlanB)et).setTShippingPlanH((TShippingPlanH)vl), "TShippingPlanH");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_plan_b";
    protected final String _tableDispName = "t_shipping_plan_b";
    protected final String _tablePropertyName = "TShippingPlanB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_plan_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingPlanBId = cci("SHIPPING_PLAN_B_ID", "SHIPPING_PLAN_B_ID", null, null, Long.class, "shippingPlanBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlanHId = cci("SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", null, null, Long.class, "shippingPlanHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TShippingPlanH", null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutNum = cci("STOCK_OUT_NUM", "STOCK_OUT_NUM", null, null, java.math.BigDecimal.class, "stockOutNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, java.math.BigDecimal.class, "unitPrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("PRICE", "PRICE", null, null, java.math.BigDecimal.class, "price", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, java.math.BigDecimal.class, "tax", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePieceTypeId = cci("CASE_PIECE_TYPE_ID", "CASE_PIECE_TYPE_ID", null, null, Long.class, "casePieceTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePieceTypeCd = cci("CASE_PIECE_TYPE_CD", "CASE_PIECE_TYPE_CD", null, null, String.class, "casePieceTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransactionTypeCd = cci("TRANSACTION_TYPE_CD", "TRANSACTION_TYPE_CD", null, null, String.class, "transactionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmSendFlg = cci("CM_SEND_FLG", "CM_SEND_FLG", null, null, String.class, "cmSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlanBId() { return _columnShippingPlanBId; }
    /**
     * SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlanHId() { return _columnShippingPlanHId; }
    /**
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WAREHOUSE_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * LOCATION_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * DEPOSIT_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * LOT_ID: {IX, BIGINT(19)}
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
     * STORE_NO_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * SHAPE_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * SHAPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeCd() { return _columnShapeCd; }
    /**
     * UNIT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * ERROR_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * ALLOC_INST_B_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstBId() { return _columnAllocInstBId; }
    /**
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutNum() { return _columnStockOutNum; }
    /**
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitPrice() { return _columnUnitPrice; }
    /**
     * PRICE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrice() { return _columnPrice; }
    /**
     * TAX: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTax() { return _columnTax; }
    /**
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePieceTypeId() { return _columnCasePieceTypeId; }
    /**
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePieceTypeCd() { return _columnCasePieceTypeCd; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
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
     * UNIT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * STORE_STORAGE_SPACE_CD: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
    /**
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransactionTypeCd() { return _columnTransactionTypeCd; }
    /**
     * CM_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmSendFlg() { return _columnCmSendFlg; }
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
        ls.add(columnShippingPlanBId());
        ls.add(columnShippingPlanHId());
        ls.add(columnLineNo());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnLocationId());
        ls.add(columnLocationCd());
        ls.add(columnDepositId());
        ls.add(columnDepositCd());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnShapeId());
        ls.add(columnShapeCd());
        ls.add(columnUnitNum());
        ls.add(columnInstNum());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnAllocInstBId());
        ls.add(columnAllocNum());
        ls.add(columnStockOutNum());
        ls.add(columnUnitPrice());
        ls.add(columnPrice());
        ls.add(columnTax());
        ls.add(columnCasePieceTypeId());
        ls.add(columnCasePieceTypeCd());
        ls.add(columnProdDt());
        ls.add(columnJanCd());
        ls.add(columnHinmokuGroup());
        ls.add(columnHinmokuText());
        ls.add(columnUnitNm());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnStorePlantCd());
        ls.add(columnTransactionTypeCd());
        ls.add(columnCmSendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingPlanBId()); }
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
     * t_shipping_plan_h by my SHIPPING_PLAN_H_ID, named 'TShippingPlanH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingPlanH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingPlanHId(), TShippingPlanHDbm.getInstance().columnShippingPlanHId());
        return cfi("T_SHIPPING_PLAN_B_FK1", "TShippingPlanH", this, TShippingPlanHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TShippingPlanBList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingPlanB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingPlanBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingPlanBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingPlanB> getEntityType() { return TShippingPlanB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingPlanB newEntity() { return new TShippingPlanB(); }
    public TShippingPlanB newMyEntity() { return new TShippingPlanB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingPlanB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingPlanB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
