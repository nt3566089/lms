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
 * The DB meta of t_inventory_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryBDbm _instance = new TInventoryBDbm();
    private TInventoryBDbm() {}
    public static TInventoryBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryBId(), (et, vl) -> ((TInventoryB)et).setInventoryBId(ctl(vl)), "inventoryBId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryHId(), (et, vl) -> ((TInventoryB)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockId(), (et, vl) -> ((TInventoryB)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getWarehouseId(), (et, vl) -> ((TInventoryB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getProductId(), (et, vl) -> ((TInventoryB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockTypeId(), (et, vl) -> ((TInventoryB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLocationId(), (et, vl) -> ((TInventoryB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDepositId(), (et, vl) -> ((TInventoryB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLotId(), (et, vl) -> ((TInventoryB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLot(), (et, vl) -> ((TInventoryB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getLimitDt(), (et, vl) -> ((TInventoryB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreNoId(), (et, vl) -> ((TInventoryB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreLabelNo(), (et, vl) -> ((TInventoryB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStoreDt(), (et, vl) -> ((TInventoryB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSupplierId(), (et, vl) -> ((TInventoryB)et).setSupplierId(ctl(vl)), "supplierId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSupplierCd(), (et, vl) -> ((TInventoryB)et).setSupplierCd((String)vl), "supplierCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getShapeId(), (et, vl) -> ((TInventoryB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUnitNum(), (et, vl) -> ((TInventoryB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getChargeNum(), (et, vl) -> ((TInventoryB)et).setChargeNum(ctb(vl)), "chargeNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAllocNum(), (et, vl) -> ((TInventoryB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getMoveNum(), (et, vl) -> ((TInventoryB)et).setMoveNum(ctb(vl)), "moveNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryNum(), (et, vl) -> ((TInventoryB)et).setInventoryNum(ctb(vl)), "inventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInputType(), (et, vl) -> ((TInventoryB)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getStockAdjustFlg(), (et, vl) -> ((TInventoryB)et).setStockAdjustFlg((String)vl), "stockAdjustFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getMoveInstHId(), (et, vl) -> ((TInventoryB)et).setMoveInstHId(ctl(vl)), "moveInstHId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getHtInputInventoryNum(), (et, vl) -> ((TInventoryB)et).setHtInputInventoryNum(ctb(vl)), "htInputInventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getWebInputInventoryNum(), (et, vl) -> ((TInventoryB)et).setWebInputInventoryNum(ctb(vl)), "webInputInventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAjisInputInventoryNum(), (et, vl) -> ((TInventoryB)et).setAjisInputInventoryNum(ctb(vl)), "ajisInputInventoryNum");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getProdDt(), (et, vl) -> ((TInventoryB)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAreaCd(), (et, vl) -> ((TInventoryB)et).setAreaCd((String)vl), "areaCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getSalesOrgId(), (et, vl) -> ((TInventoryB)et).setSalesOrgId(ctl(vl)), "salesOrgId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAccountId(), (et, vl) -> ((TInventoryB)et).setAccountId(ctl(vl)), "accountId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAllocTypeCd(), (et, vl) -> ((TInventoryB)et).setAllocTypeCd((String)vl), "allocTypeCd");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getS4SendFlg(), (et, vl) -> ((TInventoryB)et).setS4SendFlg((String)vl), "s4SendFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getCmSendFlg(), (et, vl) -> ((TInventoryB)et).setCmSendFlg((String)vl), "cmSendFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryUserId(), (et, vl) -> ((TInventoryB)et).setInventoryUserId(ctl(vl)), "inventoryUserId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getInventoryUpdUserId(), (et, vl) -> ((TInventoryB)et).setInventoryUpdUserId(ctl(vl)), "inventoryUpdUserId");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getReceiveDt(), (et, vl) -> ((TInventoryB)et).setReceiveDt((String)vl), "receiveDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getDelFlg(), (et, vl) -> ((TInventoryB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getVersionNo(), (et, vl) -> ((TInventoryB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getControlNo(), (et, vl) -> ((TInventoryB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddDt(), (et, vl) -> ((TInventoryB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddUser(), (et, vl) -> ((TInventoryB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getAddProcess(), (et, vl) -> ((TInventoryB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdDt(), (et, vl) -> ((TInventoryB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdUser(), (et, vl) -> ((TInventoryB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryB)et).getUpdProcess(), (et, vl) -> ((TInventoryB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMStockType(), (et, vl) -> ((TInventoryB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTLot(), (et, vl) -> ((TInventoryB)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMWarehouse(), (et, vl) -> ((TInventoryB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMShape(), (et, vl) -> ((TInventoryB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBUserByInventoryUpdUserId(), (et, vl) -> ((TInventoryB)et).setBUserByInventoryUpdUserId((BUser)vl), "BUserByInventoryUpdUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTMoveInstH(), (et, vl) -> ((TInventoryB)et).setTMoveInstH((TMoveInstH)vl), "TMoveInstH");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMSalesOrg(), (et, vl) -> ((TInventoryB)et).setMSalesOrg((MSalesOrg)vl), "MSalesOrg");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMCustomerByAccountId(), (et, vl) -> ((TInventoryB)et).setMCustomerByAccountId((MCustomer)vl), "MCustomerByAccountId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMLocation(), (et, vl) -> ((TInventoryB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMProduct(), (et, vl) -> ((TInventoryB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBUserByInventoryUserId(), (et, vl) -> ((TInventoryB)et).setBUserByInventoryUserId((BUser)vl), "BUserByInventoryUserId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTStock(), (et, vl) -> ((TInventoryB)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTInventoryH(), (et, vl) -> ((TInventoryB)et).setTInventoryH((TInventoryH)vl), "TInventoryH");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTStoreNo(), (et, vl) -> ((TInventoryB)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMCustomerByDepositId(), (et, vl) -> ((TInventoryB)et).setMCustomerByDepositId((MCustomer)vl), "MCustomerByDepositId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getMCustomerBySupplierId(), (et, vl) -> ((TInventoryB)et).setMCustomerBySupplierId((MCustomer)vl), "MCustomerBySupplierId");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBClassDtlByInputType(), (et, vl) -> ((TInventoryB)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getBClassDtlByStockAdjustFlg(), (et, vl) -> ((TInventoryB)et).setBClassDtlByStockAdjustFlg((BClassDtl)vl), "BClassDtlByStockAdjustFlg");
        setupEfpg(_efpgMap, et -> ((TInventoryB)et).getTInventoryRAsOne(), (et, vl) -> ((TInventoryB)et).setTInventoryRAsOne((TInventoryR)vl), "TInventoryRAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_inventory_b";
    protected final String _tableDispName = "t_inventory_b";
    protected final String _tablePropertyName = "TInventoryB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_inventory_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryBId = cci("INVENTORY_B_ID", "INVENTORY_B_ID", null, null, Long.class, "inventoryBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TInventoryInpHistList,TInventoryReceiveLabelList", null, false);
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TInventoryH", null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomerByDepositId", null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplierId = cci("SUPPLIER_ID", "SUPPLIER_ID", null, null, Long.class, "supplierId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomerBySupplierId", null, null, false);
    protected final ColumnInfo _columnSupplierCd = cci("SUPPLIER_CD", "SUPPLIER_CD", null, null, String.class, "supplierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnChargeNum = cci("CHARGE_NUM", "CHARGE_NUM", null, null, java.math.BigDecimal.class, "chargeNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoveNum = cci("MOVE_NUM", "MOVE_NUM", null, null, java.math.BigDecimal.class, "moveNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryNum = cci("INVENTORY_NUM", "INVENTORY_NUM", null, null, java.math.BigDecimal.class, "inventoryNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnStockAdjustFlg = cci("STOCK_ADJUST_FLG", "STOCK_ADJUST_FLG", null, null, String.class, "stockAdjustFlg", null, false, false, true, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByStockAdjustFlg", null, CDef.DefMeta.StockMoveFlg, false);
    protected final ColumnInfo _columnMoveInstHId = cci("MOVE_INST_H_ID", "MOVE_INST_H_ID", null, null, Long.class, "moveInstHId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TMoveInstH", null, null, false);
    protected final ColumnInfo _columnHtInputInventoryNum = cci("HT_INPUT_INVENTORY_NUM", "HT_INPUT_INVENTORY_NUM", null, null, java.math.BigDecimal.class, "htInputInventoryNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWebInputInventoryNum = cci("WEB_INPUT_INVENTORY_NUM", "WEB_INPUT_INVENTORY_NUM", null, null, java.math.BigDecimal.class, "webInputInventoryNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAjisInputInventoryNum = cci("AJIS_INPUT_INVENTORY_NUM", "AJIS_INPUT_INVENTORY_NUM", null, null, java.math.BigDecimal.class, "ajisInputInventoryNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAreaCd = cci("AREA_CD", "AREA_CD", null, null, String.class, "areaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgId = cci("SALES_ORG_ID", "SALES_ORG_ID", null, null, Long.class, "salesOrgId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MSalesOrg", null, null, false);
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, null, Long.class, "accountId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomerByAccountId", null, null, false);
    protected final ColumnInfo _columnAllocTypeCd = cci("ALLOC_TYPE_CD", "ALLOC_TYPE_CD", null, null, String.class, "allocTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS4SendFlg = cci("S4_SEND_FLG", "S4_SEND_FLG", null, null, String.class, "s4SendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmSendFlg = cci("CM_SEND_FLG", "CM_SEND_FLG", null, null, String.class, "cmSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryUserId = cci("INVENTORY_USER_ID", "INVENTORY_USER_ID", null, null, Long.class, "inventoryUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByInventoryUserId", null, null, false);
    protected final ColumnInfo _columnInventoryUpdUserId = cci("INVENTORY_UPD_USER_ID", "INVENTORY_UPD_USER_ID", null, null, Long.class, "inventoryUpdUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUserByInventoryUpdUserId", null, null, false);
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
     * INVENTORY_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryBId() { return _columnInventoryBId; }
    /**
     * INVENTORY_H_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
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
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNoId() { return _columnStoreNoId; }
    /**
     * STORE_LABEL_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * STORE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierId() { return _columnSupplierId; }
    /**
     * SUPPLIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplierCd() { return _columnSupplierCd; }
    /**
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeId() { return _columnShapeId; }
    /**
     * UNIT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnChargeNum() { return _columnChargeNum; }
    /**
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocNum() { return _columnAllocNum; }
    /**
     * MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveNum() { return _columnMoveNum; }
    /**
     * INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryNum() { return _columnInventoryNum; }
    /**
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * STOCK_ADJUST_FLG: {NotNull, CHAR(1), FK to B_CLASS_DTL, classification=StockMoveFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockAdjustFlg() { return _columnStockAdjustFlg; }
    /**
     * MOVE_INST_H_ID: {IX, BIGINT(19), FK to t_move_inst_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoveInstHId() { return _columnMoveInstHId; }
    /**
     * HT_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtInputInventoryNum() { return _columnHtInputInventoryNum; }
    /**
     * WEB_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWebInputInventoryNum() { return _columnWebInputInventoryNum; }
    /**
     * AJIS_INPUT_INVENTORY_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAjisInputInventoryNum() { return _columnAjisInputInventoryNum; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * AREA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAreaCd() { return _columnAreaCd; }
    /**
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgId() { return _columnSalesOrgId; }
    /**
     * ACCOUNT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocTypeCd() { return _columnAllocTypeCd; }
    /**
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS4SendFlg() { return _columnS4SendFlg; }
    /**
     * CM_SEND_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmSendFlg() { return _columnCmSendFlg; }
    /**
     * INVENTORY_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryUserId() { return _columnInventoryUserId; }
    /**
     * INVENTORY_UPD_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryUpdUserId() { return _columnInventoryUpdUserId; }
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
        ls.add(columnInventoryBId());
        ls.add(columnInventoryHId());
        ls.add(columnStockId());
        ls.add(columnWarehouseId());
        ls.add(columnProductId());
        ls.add(columnStockTypeId());
        ls.add(columnLocationId());
        ls.add(columnDepositId());
        ls.add(columnLotId());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreNoId());
        ls.add(columnStoreLabelNo());
        ls.add(columnStoreDt());
        ls.add(columnSupplierId());
        ls.add(columnSupplierCd());
        ls.add(columnShapeId());
        ls.add(columnUnitNum());
        ls.add(columnChargeNum());
        ls.add(columnAllocNum());
        ls.add(columnMoveNum());
        ls.add(columnInventoryNum());
        ls.add(columnInputType());
        ls.add(columnStockAdjustFlg());
        ls.add(columnMoveInstHId());
        ls.add(columnHtInputInventoryNum());
        ls.add(columnWebInputInventoryNum());
        ls.add(columnAjisInputInventoryNum());
        ls.add(columnProdDt());
        ls.add(columnAreaCd());
        ls.add(columnSalesOrgId());
        ls.add(columnAccountId());
        ls.add(columnAllocTypeCd());
        ls.add(columnS4SendFlg());
        ls.add(columnCmSendFlg());
        ls.add(columnInventoryUserId());
        ls.add(columnInventoryUpdUserId());
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
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMStockType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockTypeId(), MStockTypeDbm.getInstance().columnStockTypeId());
        return cfi("T_INVENTORY_B_FK5", "MStockType", this, MStockTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_INVENTORY_B_FK15", "TLot", this, TLotDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_INVENTORY_B_FK9", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_INVENTORY_B_FK2", "MShape", this, MShapeDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * b_user by my INVENTORY_UPD_USER_ID, named 'BUserByInventoryUpdUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInventoryUpdUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryUpdUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_B_FK1", "BUserByInventoryUpdUserId", this, BUserDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TInventoryBByInventoryUpdUserIdList", false);
    }
    /**
     * t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTMoveInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMoveInstHId(), TMoveInstHDbm.getInstance().columnMoveInstHId());
        return cfi("T_INVENTORY_B_FK11", "TMoveInstH", this, TMoveInstHDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMSalesOrg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSalesOrgId(), MSalesOrgDbm.getInstance().columnSalesOrgId());
        return cfi("T_INVENTORY_B_FK16", "MSalesOrg", this, MSalesOrgDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_customer by my ACCOUNT_ID, named 'MCustomerByAccountId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByAccountId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAccountId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_B_FK13", "MCustomerByAccountId", this, MCustomerDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TInventoryBByAccountIdList", false);
    }
    /**
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_INVENTORY_B_FK6", "MLocation", this, MLocationDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_INVENTORY_B_FK4", "MProduct", this, MProductDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * b_user by my INVENTORY_USER_ID, named 'BUserByInventoryUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUserByInventoryUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_INVENTORY_B_FK12", "BUserByInventoryUserId", this, BUserDbm.getInstance(), mp, 10, null, false, false, false, false, null, null, false, "TInventoryBByInventoryUserIdList", false);
    }
    /**
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_INVENTORY_B_FK14", "TStock", this, TStockDbm.getInstance(), mp, 11, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTInventoryH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), TInventoryHDbm.getInstance().columnInventoryHId());
        return cfi("T_INVENTORY_B_FK7", "TInventoryH", this, TInventoryHDbm.getInstance(), mp, 12, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_INVENTORY_B_FK3", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 13, null, false, false, false, false, null, null, false, "TInventoryBList", false);
    }
    /**
     * m_customer by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerByDepositId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_B_FK10", "MCustomerByDepositId", this, MCustomerDbm.getInstance(), mp, 14, null, false, false, false, false, null, null, false, "TInventoryBByDepositIdList", false);
    }
    /**
     * m_customer by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomerBySupplierId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnSupplierId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_INVENTORY_B_FK8", "MCustomerBySupplierId", this, MCustomerDbm.getInstance(), mp, 15, null, false, false, false, false, null, null, false, "TInventoryBBySupplierIdList", false);
    }
    /**
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_B_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStockAdjustFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockAdjustFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_INVENTORY_B_STOCK_ADJUST_FLG", "BClassDtlByStockAdjustFlg", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STOCK_MOVE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * t_inventory_r by INVENTORY_B_ID, named 'TInventoryRAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTInventoryRAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryRDbm.getInstance().columnInventoryBId());
        return cfi("T_INVENTORY_R_FK6", "TInventoryRAsOne", this, TInventoryRDbm.getInstance(), mp, 18, null, true, false, true, false, null, null, false, "TInventoryB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_inventory_inp_hist by INVENTORY_B_ID, named 'TInventoryInpHistList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryInpHistList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryInpHistDbm.getInstance().columnInventoryBId());
        return cri("T_INVENTORY_INP_HIST_FK1", "TInventoryInpHistList", this, TInventoryInpHistDbm.getInstance(), mp, false, "TInventoryB");
    }
    /**
     * t_inventory_receive_label by INVENTORY_B_ID, named 'TInventoryReceiveLabelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryReceiveLabelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryBId(), TInventoryReceiveLabelDbm.getInstance().columnInventoryBId());
        return cri("T_INVENTORY_RECEIVE_LABEL_FK1", "TInventoryReceiveLabelList", this, TInventoryReceiveLabelDbm.getInstance(), mp, false, "TInventoryB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryB> getEntityType() { return TInventoryB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryB newEntity() { return new TInventoryB(); }
    public TInventoryB newMyEntity() { return new TInventoryB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
