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
 * The DB meta of t_shipping_inst_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingInstBDbm _instance = new TShippingInstBDbm();
    private TShippingInstBDbm() {}
    public static TShippingInstBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getShippingInstBId(), (et, vl) -> ((TShippingInstB)et).setShippingInstBId(ctl(vl)), "shippingInstBId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getShippingInstHId(), (et, vl) -> ((TShippingInstB)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLineNo(), (et, vl) -> ((TShippingInstB)et).setLineNo(ctl(vl)), "lineNo");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getWarehouseId(), (et, vl) -> ((TShippingInstB)et).setWarehouseId(ctl(vl)), "warehouseId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getWarehouseCd(), (et, vl) -> ((TShippingInstB)et).setWarehouseCd((String)vl), "warehouseCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getProductId(), (et, vl) -> ((TShippingInstB)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getProductCd(), (et, vl) -> ((TShippingInstB)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStockTypeId(), (et, vl) -> ((TShippingInstB)et).setStockTypeId(ctl(vl)), "stockTypeId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStockTypeCd(), (et, vl) -> ((TShippingInstB)et).setStockTypeCd((String)vl), "stockTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLocationId(), (et, vl) -> ((TShippingInstB)et).setLocationId(ctl(vl)), "locationId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLocationCd(), (et, vl) -> ((TShippingInstB)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getDepositId(), (et, vl) -> ((TShippingInstB)et).setDepositId(ctl(vl)), "depositId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getDepositCd(), (et, vl) -> ((TShippingInstB)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLotId(), (et, vl) -> ((TShippingInstB)et).setLotId(ctl(vl)), "lotId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLot(), (et, vl) -> ((TShippingInstB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLimitDt(), (et, vl) -> ((TShippingInstB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStoreNoId(), (et, vl) -> ((TShippingInstB)et).setStoreNoId(ctl(vl)), "storeNoId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStoreLabelNo(), (et, vl) -> ((TShippingInstB)et).setStoreLabelNo((String)vl), "storeLabelNo");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getShapeId(), (et, vl) -> ((TShippingInstB)et).setShapeId(ctl(vl)), "shapeId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getShapeCd(), (et, vl) -> ((TShippingInstB)et).setShapeCd((String)vl), "shapeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUnitNum(), (et, vl) -> ((TShippingInstB)et).setUnitNum(ctl(vl)), "unitNum");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getInstNum(), (et, vl) -> ((TShippingInstB)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getErrorFlg(), (et, vl) -> ((TShippingInstB)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getErrorMessageCd(), (et, vl) -> ((TShippingInstB)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getAllocInstBId(), (et, vl) -> ((TShippingInstB)et).setAllocInstBId(ctl(vl)), "allocInstBId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getAllocNum(), (et, vl) -> ((TShippingInstB)et).setAllocNum(ctb(vl)), "allocNum");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStockOutNum(), (et, vl) -> ((TShippingInstB)et).setStockOutNum(ctb(vl)), "stockOutNum");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUnitPrice(), (et, vl) -> ((TShippingInstB)et).setUnitPrice(ctb(vl)), "unitPrice");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getPrice(), (et, vl) -> ((TShippingInstB)et).setPrice(ctb(vl)), "price");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getTax(), (et, vl) -> ((TShippingInstB)et).setTax(ctb(vl)), "tax");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getCasePieceTypeId(), (et, vl) -> ((TShippingInstB)et).setCasePieceTypeId(ctl(vl)), "casePieceTypeId");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getCasePieceTypeCd(), (et, vl) -> ((TShippingInstB)et).setCasePieceTypeCd((String)vl), "casePieceTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getProdDt(), (et, vl) -> ((TShippingInstB)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getJanCd(), (et, vl) -> ((TShippingInstB)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getTaxRate(), (et, vl) -> ((TShippingInstB)et).setTaxRate(ctb(vl)), "taxRate");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLogiWeightFlg(), (et, vl) -> ((TShippingInstB)et).setLogiWeightFlg((String)vl), "logiWeightFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLogiAttentionTypeCd(), (et, vl) -> ((TShippingInstB)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLogiSpecialTypeCd(), (et, vl) -> ((TShippingInstB)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getHinmokuText(), (et, vl) -> ((TShippingInstB)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUnitNm(), (et, vl) -> ((TShippingInstB)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getEcUnitNm(), (et, vl) -> ((TShippingInstB)et).setEcUnitNm((String)vl), "ecUnitNm");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getSampleTypeCd(), (et, vl) -> ((TShippingInstB)et).setSampleTypeCd((String)vl), "sampleTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getEcOrderBranchNo(), (et, vl) -> ((TShippingInstB)et).setEcOrderBranchNo((String)vl), "ecOrderBranchNo");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getEcProductNmKanji(), (et, vl) -> ((TShippingInstB)et).setEcProductNmKanji((String)vl), "ecProductNmKanji");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStorePlantCd(), (et, vl) -> ((TShippingInstB)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getStoreStorageSpaceCd(), (et, vl) -> ((TShippingInstB)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLotManagTypeCd(), (et, vl) -> ((TShippingInstB)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getDelivCd(), (et, vl) -> ((TShippingInstB)et).setDelivCd((String)vl), "delivCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getTransactionTypeCd(), (et, vl) -> ((TShippingInstB)et).setTransactionTypeCd((String)vl), "transactionTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getWmSendFlg(), (et, vl) -> ((TShippingInstB)et).setWmSendFlg((String)vl), "wmSendFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getLpSendFlg(), (et, vl) -> ((TShippingInstB)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getCmSendFlg(), (et, vl) -> ((TShippingInstB)et).setCmSendFlg((String)vl), "cmSendFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getEmpIdCd(), (et, vl) -> ((TShippingInstB)et).setEmpIdCd((String)vl), "empIdCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getEmpNm(), (et, vl) -> ((TShippingInstB)et).setEmpNm((String)vl), "empNm");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUs3fTypeCd(), (et, vl) -> ((TShippingInstB)et).setUs3fTypeCd((String)vl), "us3fTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getHinmokuGroup(), (et, vl) -> ((TShippingInstB)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getDelFlg(), (et, vl) -> ((TShippingInstB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getVersionNo(), (et, vl) -> ((TShippingInstB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getControlNo(), (et, vl) -> ((TShippingInstB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getAddDt(), (et, vl) -> ((TShippingInstB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getAddUser(), (et, vl) -> ((TShippingInstB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getAddProcess(), (et, vl) -> ((TShippingInstB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUpdDt(), (et, vl) -> ((TShippingInstB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUpdUser(), (et, vl) -> ((TShippingInstB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingInstB)et).getUpdProcess(), (et, vl) -> ((TShippingInstB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMStockType(), (et, vl) -> ((TShippingInstB)et).setMStockType((MStockType)vl), "MStockType");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getTStoreNo(), (et, vl) -> ((TShippingInstB)et).setTStoreNo((TStoreNo)vl), "TStoreNo");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMLocation(), (et, vl) -> ((TShippingInstB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getTAllocInstB(), (et, vl) -> ((TShippingInstB)et).setTAllocInstB((TAllocInstB)vl), "TAllocInstB");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMShape(), (et, vl) -> ((TShippingInstB)et).setMShape((MShape)vl), "MShape");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMProduct(), (et, vl) -> ((TShippingInstB)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getTLot(), (et, vl) -> ((TShippingInstB)et).setTLot((TLot)vl), "TLot");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMCustomer(), (et, vl) -> ((TShippingInstB)et).setMCustomer((MCustomer)vl), "MCustomer");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getMWarehouse(), (et, vl) -> ((TShippingInstB)et).setMWarehouse((MWarehouse)vl), "MWarehouse");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getTShippingInstH(), (et, vl) -> ((TShippingInstB)et).setTShippingInstH((TShippingInstH)vl), "TShippingInstH");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getBClassDtlByErrorFlg(), (et, vl) -> ((TShippingInstB)et).setBClassDtlByErrorFlg((BClassDtl)vl), "BClassDtlByErrorFlg");
        setupEfpg(_efpgMap, et -> ((TShippingInstB)et).getTShippingInstSpareAsOne(), (et, vl) -> ((TShippingInstB)et).setTShippingInstSpareAsOne((TShippingInstSpare)vl), "TShippingInstSpareAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_inst_b";
    protected final String _tableDispName = "t_shipping_inst_b";
    protected final String _tablePropertyName = "TShippingInstB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_inst_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstBId = cci("SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", null, null, Long.class, "shippingInstBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TPickingBList,TShippingInstBPrintList,TShippingInstDataTransferList", null, false);
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TShippingInstH", null, null, false);
    protected final ColumnInfo _columnLineNo = cci("LINE_NO", "LINE_NO", null, null, Long.class, "lineNo", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWarehouseId = cci("WAREHOUSE_ID", "WAREHOUSE_ID", null, null, Long.class, "warehouseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MWarehouse", null, null, false);
    protected final ColumnInfo _columnWarehouseCd = cci("WAREHOUSE_CD", "WAREHOUSE_CD", null, null, String.class, "warehouseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTypeId = cci("STOCK_TYPE_ID", "STOCK_TYPE_ID", null, null, Long.class, "stockTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MStockType", null, null, false);
    protected final ColumnInfo _columnStockTypeCd = cci("STOCK_TYPE_CD", "STOCK_TYPE_CD", null, null, String.class, "stockTypeCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Long.class, "locationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositId = cci("DEPOSIT_ID", "DEPOSIT_ID", null, null, Long.class, "depositId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCustomer", null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotId = cci("LOT_ID", "LOT_ID", null, null, Long.class, "lotId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TLot", null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNoId = cci("STORE_NO_ID", "STORE_NO_ID", null, null, Long.class, "storeNoId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TStoreNo", null, null, false);
    protected final ColumnInfo _columnStoreLabelNo = cci("STORE_LABEL_NO", "STORE_LABEL_NO", null, null, String.class, "storeLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeId = cci("SHAPE_ID", "SHAPE_ID", null, null, Long.class, "shapeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShape", null, null, false);
    protected final ColumnInfo _columnShapeCd = cci("SHAPE_CD", "SHAPE_CD", null, null, String.class, "shapeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, Long.class, "unitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByErrorFlg", null, CDef.DefMeta.ErrorFlg, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstBId = cci("ALLOC_INST_B_ID", "ALLOC_INST_B_ID", null, null, Long.class, "allocInstBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TAllocInstB", null, null, false);
    protected final ColumnInfo _columnAllocNum = cci("ALLOC_NUM", "ALLOC_NUM", null, null, java.math.BigDecimal.class, "allocNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutNum = cci("STOCK_OUT_NUM", "STOCK_OUT_NUM", null, null, java.math.BigDecimal.class, "stockOutNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitPrice = cci("UNIT_PRICE", "UNIT_PRICE", null, null, java.math.BigDecimal.class, "unitPrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrice = cci("PRICE", "PRICE", null, null, java.math.BigDecimal.class, "price", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTax = cci("TAX", "TAX", null, null, java.math.BigDecimal.class, "tax", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePieceTypeId = cci("CASE_PIECE_TYPE_ID", "CASE_PIECE_TYPE_ID", null, null, Long.class, "casePieceTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePieceTypeCd = cci("CASE_PIECE_TYPE_CD", "CASE_PIECE_TYPE_CD", null, null, String.class, "casePieceTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTaxRate = cci("TAX_RATE", "TAX_RATE", null, null, java.math.BigDecimal.class, "taxRate", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiWeightFlg = cci("LOGI_WEIGHT_FLG", "LOGI_WEIGHT_FLG", null, null, String.class, "logiWeightFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcUnitNm = cci("EC_UNIT_NM", "EC_UNIT_NM", null, null, String.class, "ecUnitNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSampleTypeCd = cci("SAMPLE_TYPE_CD", "SAMPLE_TYPE_CD", null, null, String.class, "sampleTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcOrderBranchNo = cci("EC_ORDER_BRANCH_NO", "EC_ORDER_BRANCH_NO", null, null, String.class, "ecOrderBranchNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEcProductNmKanji = cci("EC_PRODUCT_NM_KANJI", "EC_PRODUCT_NM_KANJI", null, null, String.class, "ecProductNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCd = cci("DELIV_CD", "DELIV_CD", null, null, String.class, "delivCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransactionTypeCd = cci("TRANSACTION_TYPE_CD", "TRANSACTION_TYPE_CD", null, null, String.class, "transactionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmSendFlg = cci("WM_SEND_FLG", "WM_SEND_FLG", null, null, String.class, "wmSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmSendFlg = cci("CM_SEND_FLG", "CM_SEND_FLG", null, null, String.class, "cmSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpIdCd = cci("EMP_ID_CD", "EMP_ID_CD", null, null, String.class, "empIdCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpNm = cci("EMP_NM", "EMP_NM", null, null, String.class, "empNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUs3fTypeCd = cci("US3F_TYPE_CD", "US3F_TYPE_CD", null, null, String.class, "us3fTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstBId() { return _columnShippingInstBId; }
    /**
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineNo() { return _columnLineNo; }
    /**
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseId() { return _columnWarehouseId; }
    /**
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWarehouseCd() { return _columnWarehouseCd; }
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
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeId() { return _columnStockTypeId; }
    /**
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTypeCd() { return _columnStockTypeCd; }
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
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositId() { return _columnDepositId; }
    /**
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
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
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLabelNo() { return _columnStoreLabelNo; }
    /**
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
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
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
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
     * TAX_RATE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaxRate() { return _columnTaxRate; }
    /**
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiWeightFlg() { return _columnLogiWeightFlg; }
    /**
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiAttentionTypeCd() { return _columnLogiAttentionTypeCd; }
    /**
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiSpecialTypeCd() { return _columnLogiSpecialTypeCd; }
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
     * EC_UNIT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcUnitNm() { return _columnEcUnitNm; }
    /**
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSampleTypeCd() { return _columnSampleTypeCd; }
    /**
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcOrderBranchNo() { return _columnEcOrderBranchNo; }
    /**
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEcProductNmKanji() { return _columnEcProductNmKanji; }
    /**
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
    /**
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeCd() { return _columnLotManagTypeCd; }
    /**
     * DELIV_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCd() { return _columnDelivCd; }
    /**
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransactionTypeCd() { return _columnTransactionTypeCd; }
    /**
     * WM_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmSendFlg() { return _columnWmSendFlg; }
    /**
     * LP_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
    /**
     * CM_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmSendFlg() { return _columnCmSendFlg; }
    /**
     * EMP_ID_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpIdCd() { return _columnEmpIdCd; }
    /**
     * EMP_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpNm() { return _columnEmpNm; }
    /**
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUs3fTypeCd() { return _columnUs3fTypeCd; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
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
        ls.add(columnShippingInstBId());
        ls.add(columnShippingInstHId());
        ls.add(columnLineNo());
        ls.add(columnWarehouseId());
        ls.add(columnWarehouseCd());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnStockTypeId());
        ls.add(columnStockTypeCd());
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
        ls.add(columnTaxRate());
        ls.add(columnLogiWeightFlg());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnHinmokuText());
        ls.add(columnUnitNm());
        ls.add(columnEcUnitNm());
        ls.add(columnSampleTypeCd());
        ls.add(columnEcOrderBranchNo());
        ls.add(columnEcProductNmKanji());
        ls.add(columnStorePlantCd());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnLotManagTypeCd());
        ls.add(columnDelivCd());
        ls.add(columnTransactionTypeCd());
        ls.add(columnWmSendFlg());
        ls.add(columnLpSendFlg());
        ls.add(columnCmSendFlg());
        ls.add(columnEmpIdCd());
        ls.add(columnEmpNm());
        ls.add(columnUs3fTypeCd());
        ls.add(columnHinmokuGroup());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstBId()); }
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
        return cfi("T_SHIPPING_INST_B_FK3", "MStockType", this, MStockTypeDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreNo() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreNoId(), TStoreNoDbm.getInstance().columnStoreNoId());
        return cfi("T_SHIPPING_INST_B_FK6", "TStoreNo", this, TStoreNoDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_SHIPPING_INST_B_FK1", "MLocation", this, MLocationDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTAllocInstB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAllocInstBId(), TAllocInstBDbm.getInstance().columnAllocInstBId());
        return cfi("T_SHIPPING_INST_B_FK4", "TAllocInstB", this, TAllocInstBDbm.getInstance(), mp, 3, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShape() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeId(), MShapeDbm.getInstance().columnShapeId());
        return cfi("T_SHIPPING_INST_B_FK8", "MShape", this, MShapeDbm.getInstance(), mp, 4, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_SHIPPING_INST_B_FK2", "MProduct", this, MProductDbm.getInstance(), mp, 5, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTLot() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotId(), TLotDbm.getInstance().columnLotId());
        return cfi("T_SHIPPING_INST_B_FK7", "TLot", this, TLotDbm.getInstance(), mp, 6, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCustomer() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDepositId(), MCustomerDbm.getInstance().columnCustomerId());
        return cfi("T_SHIPPING_INST_B_FK9", "MCustomer", this, MCustomerDbm.getInstance(), mp, 7, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMWarehouse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnWarehouseId(), MWarehouseDbm.getInstance().columnWarehouseId());
        return cfi("T_SHIPPING_INST_B_FK10", "MWarehouse", this, MWarehouseDbm.getInstance(), mp, 8, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstHId(), TShippingInstHDbm.getInstance().columnShippingInstHId());
        return cfi("T_SHIPPING_INST_B_FK5", "TShippingInstH", this, TShippingInstHDbm.getInstance(), mp, 9, null, false, false, false, false, null, null, false, "TShippingInstBList", false);
    }
    /**
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByErrorFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnErrorFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_SHIPPING_INST_B_ERROR_FLG", "BClassDtlByErrorFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'ERROR_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTShippingInstSpareAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TShippingInstSpareDbm.getInstance().columnShippingInstBId());
        return cfi("T_SHIPPING_INST_SPARE_FK1", "TShippingInstSpareAsOne", this, TShippingInstSpareDbm.getInstance(), mp, 11, null, true, false, true, false, null, null, false, "TShippingInstB", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TPickingBDbm.getInstance().columnShippingInstBId());
        return cri("T_PICKING_B_FK4", "TPickingBList", this, TPickingBDbm.getInstance(), mp, false, "TShippingInstB");
    }
    /**
     * t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBPrintList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TShippingInstBPrintDbm.getInstance().columnShippingInstBId());
        return cri("T_SHIPPING_INST_B_PRINT_FK1", "TShippingInstBPrintList", this, TShippingInstBPrintDbm.getInstance(), mp, false, "TShippingInstB");
    }
    /**
     * t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstDataTransferList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstBId(), TShippingInstDataTransferDbm.getInstance().columnShippingInstBId());
        return cri("T_SHIPPING_INST_DATA_TRANSFER_FK1", "TShippingInstDataTransferList", this, TShippingInstDataTransferDbm.getInstance(), mp, false, "TShippingInstB");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingInstB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingInstBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingInstB> getEntityType() { return TShippingInstB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingInstB newEntity() { return new TShippingInstB(); }
    public TShippingInstB newMyEntity() { return new TShippingInstB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingInstB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingInstB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
