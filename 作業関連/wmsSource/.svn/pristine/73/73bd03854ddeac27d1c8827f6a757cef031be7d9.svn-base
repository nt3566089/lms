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
 * The DB meta of m_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MProductDbm _instance = new MProductDbm();
    private MProductDbm() {}
    public static MProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MProduct)et).getProductId(), (et, vl) -> ((MProduct)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((MProduct)et).getClientId(), (et, vl) -> ((MProduct)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductCd(), (et, vl) -> ((MProduct)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductNm(), (et, vl) -> ((MProduct)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductAbbr(), (et, vl) -> ((MProduct)et).setProductAbbr((String)vl), "productAbbr");
        setupEpg(_epgMap, et -> ((MProduct)et).getJanCd(), (et, vl) -> ((MProduct)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotManagFlg(), (et, vl) -> ((MProduct)et).setLotManagFlg((String)vl), "lotManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLimitDtManagFlg(), (et, vl) -> ((MProduct)et).setLimitDtManagFlg((String)vl), "limitDtManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getReceiveLimitNum(), (et, vl) -> ((MProduct)et).setReceiveLimitNum(ctl(vl)), "receiveLimitNum");
        setupEpg(_epgMap, et -> ((MProduct)et).getShippingLimitNum(), (et, vl) -> ((MProduct)et).setShippingLimitNum(ctl(vl)), "shippingLimitNum");
        setupEpg(_epgMap, et -> ((MProduct)et).getMergeCls(), (et, vl) -> ((MProduct)et).setMergeCls((String)vl), "mergeCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getLotReverseFlg(), (et, vl) -> ((MProduct)et).setLotReverseFlg((String)vl), "lotReverseFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLimitDtReverseFlg(), (et, vl) -> ((MProduct)et).setLimitDtReverseFlg((String)vl), "limitDtReverseFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getShippingStopFlg(), (et, vl) -> ((MProduct)et).setShippingStopFlg((String)vl), "shippingStopFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getFixedPoint(), (et, vl) -> ((MProduct)et).setFixedPoint(ctb(vl)), "fixedPoint");
        setupEpg(_epgMap, et -> ((MProduct)et).getShapeGrpId(), (et, vl) -> ((MProduct)et).setShapeGrpId(ctl(vl)), "shapeGrpId");
        setupEpg(_epgMap, et -> ((MProduct)et).getNmfcCode(), (et, vl) -> ((MProduct)et).setNmfcCode((String)vl), "nmfcCode");
        setupEpg(_epgMap, et -> ((MProduct)et).getFreightCls(), (et, vl) -> ((MProduct)et).setFreightCls((String)vl), "freightCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getCounntryOfOrigin(), (et, vl) -> ((MProduct)et).setCounntryOfOrigin((String)vl), "counntryOfOrigin");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnitVal(), (et, vl) -> ((MProduct)et).setUnitVal(ctb(vl)), "unitVal");
        setupEpg(_epgMap, et -> ((MProduct)et).getHtsCd(), (et, vl) -> ((MProduct)et).setHtsCd((String)vl), "htsCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getProductCategoryCls(), (et, vl) -> ((MProduct)et).setProductCategoryCls((String)vl), "productCategoryCls");
        setupEpg(_epgMap, et -> ((MProduct)et).getProdDtManagFlg(), (et, vl) -> ((MProduct)et).setProdDtManagFlg((String)vl), "prodDtManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getProdDtLimitDaysRcv(), (et, vl) -> ((MProduct)et).setProdDtLimitDaysRcv(ctl(vl)), "prodDtLimitDaysRcv");
        setupEpg(_epgMap, et -> ((MProduct)et).getProdDtLimitDaysShp(), (et, vl) -> ((MProduct)et).setProdDtLimitDaysShp(ctl(vl)), "prodDtLimitDaysShp");
        setupEpg(_epgMap, et -> ((MProduct)et).getSerialManagFlg(), (et, vl) -> ((MProduct)et).setSerialManagFlg((String)vl), "serialManagFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getOcrDateFormat(), (et, vl) -> ((MProduct)et).setOcrDateFormat((String)vl), "ocrDateFormat");
        setupEpg(_epgMap, et -> ((MProduct)et).getInsuranceFlg(), (et, vl) -> ((MProduct)et).setInsuranceFlg((String)vl), "insuranceFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getNoOkinawaFlightFlg(), (et, vl) -> ((MProduct)et).setNoOkinawaFlightFlg((String)vl), "noOkinawaFlightFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getHeavyItemFlg(), (et, vl) -> ((MProduct)et).setHeavyItemFlg((String)vl), "heavyItemFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLargeItemFlg(), (et, vl) -> ((MProduct)et).setLargeItemFlg((String)vl), "largeItemFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getHinmokuGroupCd(), (et, vl) -> ((MProduct)et).setHinmokuGroupCd((String)vl), "hinmokuGroupCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getCaseTypeCd(), (et, vl) -> ((MProduct)et).setCaseTypeCd((String)vl), "caseTypeCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getEvaluationUnitPrice(), (et, vl) -> ((MProduct)et).setEvaluationUnitPrice(ctb(vl)), "evaluationUnitPrice");
        setupEpg(_epgMap, et -> ((MProduct)et).getLogiSpecialTypeCd(), (et, vl) -> ((MProduct)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getLogiAttentionTypeCd(), (et, vl) -> ((MProduct)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getUnitNm(), (et, vl) -> ((MProduct)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((MProduct)et).getOldJanCd(), (et, vl) -> ((MProduct)et).setOldJanCd((String)vl), "oldJanCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getRecomendLocationCd(), (et, vl) -> ((MProduct)et).setRecomendLocationCd((String)vl), "recomendLocationCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getRecomendLocationTypeCd(), (et, vl) -> ((MProduct)et).setRecomendLocationTypeCd((String)vl), "recomendLocationTypeCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getInnerJanCd(), (et, vl) -> ((MProduct)et).setInnerJanCd((String)vl), "innerJanCd");
        setupEpg(_epgMap, et -> ((MProduct)et).getCreateDate(), (et, vl) -> ((MProduct)et).setCreateDate((String)vl), "createDate");
        setupEpg(_epgMap, et -> ((MProduct)et).getCreateTime(), (et, vl) -> ((MProduct)et).setCreateTime((String)vl), "createTime");
        setupEpg(_epgMap, et -> ((MProduct)et).getFloorRefStockNum(), (et, vl) -> ((MProduct)et).setFloorRefStockNum(ctb(vl)), "floorRefStockNum");
        setupEpg(_epgMap, et -> ((MProduct)et).getWmSendFlg(), (et, vl) -> ((MProduct)et).setWmSendFlg((String)vl), "wmSendFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getLpSendFlg(), (et, vl) -> ((MProduct)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getDelFlg(), (et, vl) -> ((MProduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MProduct)et).getVersionNo(), (et, vl) -> ((MProduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MProduct)et).getControlNo(), (et, vl) -> ((MProduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddDt(), (et, vl) -> ((MProduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddUser(), (et, vl) -> ((MProduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MProduct)et).getAddProcess(), (et, vl) -> ((MProduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdDt(), (et, vl) -> ((MProduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdUser(), (et, vl) -> ((MProduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MProduct)et).getUpdProcess(), (et, vl) -> ((MProduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMShapeGrp(), (et, vl) -> ((MProduct)et).setMShapeGrp((MShapeGrp)vl), "MShapeGrp");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMClient(), (et, vl) -> ((MProduct)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByDelFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLimitDtManagFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLimitDtManagFlg((BClassDtl)vl), "BClassDtlByLimitDtManagFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLimitDtReverseFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLimitDtReverseFlg((BClassDtl)vl), "BClassDtlByLimitDtReverseFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLotManagFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLotManagFlg((BClassDtl)vl), "BClassDtlByLotManagFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLotReverseFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLotReverseFlg((BClassDtl)vl), "BClassDtlByLotReverseFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByMergeCls(), (et, vl) -> ((MProduct)et).setBClassDtlByMergeCls((BClassDtl)vl), "BClassDtlByMergeCls");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByShippingStopFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByShippingStopFlg((BClassDtl)vl), "BClassDtlByShippingStopFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByFreightCls(), (et, vl) -> ((MProduct)et).setBClassDtlByFreightCls((BClassDtl)vl), "BClassDtlByFreightCls");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByProdDtManagFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByProdDtManagFlg((BClassDtl)vl), "BClassDtlByProdDtManagFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLogiSpecialTypeCd(), (et, vl) -> ((MProduct)et).setBClassDtlByLogiSpecialTypeCd((BClassDtl)vl), "BClassDtlByLogiSpecialTypeCd");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByOcrDateFormat(), (et, vl) -> ((MProduct)et).setBClassDtlByOcrDateFormat((BClassDtl)vl), "BClassDtlByOcrDateFormat");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByInsuranceFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByInsuranceFlg((BClassDtl)vl), "BClassDtlByInsuranceFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByNoOkinawaFlightFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByNoOkinawaFlightFlg((BClassDtl)vl), "BClassDtlByNoOkinawaFlightFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLogiAttentionTypeCd(), (et, vl) -> ((MProduct)et).setBClassDtlByLogiAttentionTypeCd((BClassDtl)vl), "BClassDtlByLogiAttentionTypeCd");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByHeavyItemFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByHeavyItemFlg((BClassDtl)vl), "BClassDtlByHeavyItemFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getBClassDtlByLargeItemFlg(), (et, vl) -> ((MProduct)et).setBClassDtlByLargeItemFlg((BClassDtl)vl), "BClassDtlByLargeItemFlg");
        setupEfpg(_efpgMap, et -> ((MProduct)et).getMSetParentAsOne(), (et, vl) -> ((MProduct)et).setMSetParentAsOne((MSetParent)vl), "MSetParentAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_product";
    protected final String _tableDispName = "m_product";
    protected final String _tablePropertyName = "MProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "HStockBookList,MDepositProductList,MLocationList,MLocationReplenishProductList,MProductShapeList,MSetStructureList,TAllocInstBList,TAllocLotList,TInventoryBList,TKeepingLotList,TLastLotList,TLotList,TMoveInstBList,TNizoroeAlarmLogList,TOperationLogList,TReceivePlanBList,TSerialNoList,TShippingInstBList,TStockList,TStockBookList,WHtInventoryInputProdList,WHtPickingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtShippingList,WHtShippingPickingList,WHtTotalPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductAbbr = cci("PRODUCT_ABBR", "PRODUCT_ABBR", null, null, String.class, "productAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagFlg = cci("LOT_MANAG_FLG", "LOT_MANAG_FLG", null, null, String.class, "lotManagFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByLotManagFlg", null, CDef.DefMeta.LotManagFlg, false);
    protected final ColumnInfo _columnLimitDtManagFlg = cci("LIMIT_DT_MANAG_FLG", "LIMIT_DT_MANAG_FLG", null, null, String.class, "limitDtManagFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByLimitDtManagFlg", null, CDef.DefMeta.LimitDtManagFlg, false);
    protected final ColumnInfo _columnReceiveLimitNum = cci("RECEIVE_LIMIT_NUM", "RECEIVE_LIMIT_NUM", null, null, Long.class, "receiveLimitNum", null, false, false, false, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingLimitNum = cci("SHIPPING_LIMIT_NUM", "SHIPPING_LIMIT_NUM", null, null, Long.class, "shippingLimitNum", null, false, false, false, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMergeCls = cci("MERGE_CLS", "MERGE_CLS", null, null, String.class, "mergeCls", null, false, false, true, "VARCHAR", 30, 0, null, "02", false, null, null, "BClassDtlByMergeCls", null, CDef.DefMeta.MergeCls, false);
    protected final ColumnInfo _columnLotReverseFlg = cci("LOT_REVERSE_FLG", "LOT_REVERSE_FLG", null, null, String.class, "lotReverseFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByLotReverseFlg", null, CDef.DefMeta.LotReverseFlg, false);
    protected final ColumnInfo _columnLimitDtReverseFlg = cci("LIMIT_DT_REVERSE_FLG", "LIMIT_DT_REVERSE_FLG", null, null, String.class, "limitDtReverseFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByLimitDtReverseFlg", null, CDef.DefMeta.LimitDtReverseFlg, false);
    protected final ColumnInfo _columnShippingStopFlg = cci("SHIPPING_STOP_FLG", "SHIPPING_STOP_FLG", null, null, String.class, "shippingStopFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByShippingStopFlg", null, CDef.DefMeta.ShippingStopFlg, false);
    protected final ColumnInfo _columnFixedPoint = cci("FIXED_POINT", "FIXED_POINT", null, null, java.math.BigDecimal.class, "fixedPoint", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShapeGrpId = cci("SHAPE_GRP_ID", "SHAPE_GRP_ID", null, null, Long.class, "shapeGrpId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MShapeGrp", null, null, false);
    protected final ColumnInfo _columnNmfcCode = cci("NMFC_CODE", "NMFC_CODE", null, null, String.class, "nmfcCode", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFreightCls = cci("FREIGHT_CLS", "FREIGHT_CLS", null, null, String.class, "freightCls", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByFreightCls", null, CDef.DefMeta.FreightCls, false);
    protected final ColumnInfo _columnCounntryOfOrigin = cci("COUNNTRY_OF_ORIGIN", "COUNNTRY_OF_ORIGIN", null, null, String.class, "counntryOfOrigin", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitVal = cci("UNIT_VAL", "UNIT_VAL", null, null, java.math.BigDecimal.class, "unitVal", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtsCd = cci("HTS_CD", "HTS_CD", null, null, String.class, "htsCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCategoryCls = cci("PRODUCT_CATEGORY_CLS", "PRODUCT_CATEGORY_CLS", null, null, String.class, "productCategoryCls", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDtManagFlg = cci("PROD_DT_MANAG_FLG", "PROD_DT_MANAG_FLG", null, null, String.class, "prodDtManagFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByProdDtManagFlg", null, CDef.DefMeta.ProdDtManagFlg, false);
    protected final ColumnInfo _columnProdDtLimitDaysRcv = cci("PROD_DT_LIMIT_DAYS_RCV", "PROD_DT_LIMIT_DAYS_RCV", null, null, Long.class, "prodDtLimitDaysRcv", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDtLimitDaysShp = cci("PROD_DT_LIMIT_DAYS_SHP", "PROD_DT_LIMIT_DAYS_SHP", null, null, Long.class, "prodDtLimitDaysShp", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialManagFlg = cci("SERIAL_MANAG_FLG", "SERIAL_MANAG_FLG", null, null, String.class, "serialManagFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOcrDateFormat = cci("OCR_DATE_FORMAT", "OCR_DATE_FORMAT", null, null, String.class, "ocrDateFormat", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByOcrDateFormat", null, CDef.DefMeta.OcrDateFormat, false);
    protected final ColumnInfo _columnInsuranceFlg = cci("INSURANCE_FLG", "INSURANCE_FLG", null, null, String.class, "insuranceFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByInsuranceFlg", null, CDef.DefMeta.InsuranceFlg, false);
    protected final ColumnInfo _columnNoOkinawaFlightFlg = cci("NO_OKINAWA_FLIGHT_FLG", "NO_OKINAWA_FLIGHT_FLG", null, null, String.class, "noOkinawaFlightFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByNoOkinawaFlightFlg", null, CDef.DefMeta.NoOkinawaFlightFlg, false);
    protected final ColumnInfo _columnHeavyItemFlg = cci("HEAVY_ITEM_FLG", "HEAVY_ITEM_FLG", null, null, String.class, "heavyItemFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByHeavyItemFlg", null, CDef.DefMeta.HeavyItemFlg, false);
    protected final ColumnInfo _columnLargeItemFlg = cci("LARGE_ITEM_FLG", "LARGE_ITEM_FLG", null, null, String.class, "largeItemFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, "BClassDtlByLargeItemFlg", null, CDef.DefMeta.LargeItemFlg, false);
    protected final ColumnInfo _columnHinmokuGroupCd = cci("HINMOKU_GROUP_CD", "HINMOKU_GROUP_CD", null, null, String.class, "hinmokuGroupCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseTypeCd = cci("CASE_TYPE_CD", "CASE_TYPE_CD", null, null, String.class, "caseTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEvaluationUnitPrice = cci("EVALUATION_UNIT_PRICE", "EVALUATION_UNIT_PRICE", null, null, java.math.BigDecimal.class, "evaluationUnitPrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByLogiSpecialTypeCd", null, CDef.DefMeta.LogiSpecialTypeCd, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByLogiAttentionTypeCd", null, CDef.DefMeta.LogiAttentionTypeCd, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldJanCd = cci("OLD_JAN_CD", "OLD_JAN_CD", null, null, String.class, "oldJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecomendLocationCd = cci("RECOMEND_LOCATION_CD", "RECOMEND_LOCATION_CD", null, null, String.class, "recomendLocationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecomendLocationTypeCd = cci("RECOMEND_LOCATION_TYPE_CD", "RECOMEND_LOCATION_TYPE_CD", null, null, String.class, "recomendLocationTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInnerJanCd = cci("INNER_JAN_CD", "INNER_JAN_CD", null, null, String.class, "innerJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("CREATE_DATE", "CREATE_DATE", null, null, String.class, "createDate", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateTime = cci("CREATE_TIME", "CREATE_TIME", null, null, String.class, "createTime", null, false, false, false, "VARCHAR", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFloorRefStockNum = cci("FLOOR_REF_STOCK_NUM", "FLOOR_REF_STOCK_NUM", null, null, java.math.BigDecimal.class, "floorRefStockNum", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmSendFlg = cci("WM_SEND_FLG", "WM_SEND_FLG", null, null, String.class, "wmSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductAbbr() { return _columnProductAbbr; }
    /**
     * JAN_CD: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagFlg() { return _columnLotManagFlg; }
    /**
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtManagFlg() { return _columnLimitDtManagFlg; }
    /**
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLimitNum() { return _columnReceiveLimitNum; }
    /**
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingLimitNum() { return _columnShippingLimitNum; }
    /**
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMergeCls() { return _columnMergeCls; }
    /**
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotReverseFlg() { return _columnLotReverseFlg; }
    /**
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDtReverseFlg() { return _columnLimitDtReverseFlg; }
    /**
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStopFlg() { return _columnShippingStopFlg; }
    /**
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixedPoint() { return _columnFixedPoint; }
    /**
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShapeGrpId() { return _columnShapeGrpId; }
    /**
     * NMFC_CODE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNmfcCode() { return _columnNmfcCode; }
    /**
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFreightCls() { return _columnFreightCls; }
    /**
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCounntryOfOrigin() { return _columnCounntryOfOrigin; }
    /**
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitVal() { return _columnUnitVal; }
    /**
     * HTS_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtsCd() { return _columnHtsCd; }
    /**
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCls() { return _columnProductCategoryCls; }
    /**
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtManagFlg() { return _columnProdDtManagFlg; }
    /**
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtLimitDaysRcv() { return _columnProdDtLimitDaysRcv; }
    /**
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtLimitDaysShp() { return _columnProdDtLimitDaysShp; }
    /**
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialManagFlg() { return _columnSerialManagFlg; }
    /**
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOcrDateFormat() { return _columnOcrDateFormat; }
    /**
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsuranceFlg() { return _columnInsuranceFlg; }
    /**
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNoOkinawaFlightFlg() { return _columnNoOkinawaFlightFlg; }
    /**
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeavyItemFlg() { return _columnHeavyItemFlg; }
    /**
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeItemFlg() { return _columnLargeItemFlg; }
    /**
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroupCd() { return _columnHinmokuGroupCd; }
    /**
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseTypeCd() { return _columnCaseTypeCd; }
    /**
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEvaluationUnitPrice() { return _columnEvaluationUnitPrice; }
    /**
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiSpecialTypeCd() { return _columnLogiSpecialTypeCd; }
    /**
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiAttentionTypeCd() { return _columnLogiAttentionTypeCd; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldJanCd() { return _columnOldJanCd; }
    /**
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecomendLocationCd() { return _columnRecomendLocationCd; }
    /**
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecomendLocationTypeCd() { return _columnRecomendLocationTypeCd; }
    /**
     * INNER_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInnerJanCd() { return _columnInnerJanCd; }
    /**
     * CREATE_DATE: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDate() { return _columnCreateDate; }
    /**
     * CREATE_TIME: {VARCHAR(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateTime() { return _columnCreateTime; }
    /**
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFloorRefStockNum() { return _columnFloorRefStockNum; }
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
        ls.add(columnProductId());
        ls.add(columnClientId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnProductAbbr());
        ls.add(columnJanCd());
        ls.add(columnLotManagFlg());
        ls.add(columnLimitDtManagFlg());
        ls.add(columnReceiveLimitNum());
        ls.add(columnShippingLimitNum());
        ls.add(columnMergeCls());
        ls.add(columnLotReverseFlg());
        ls.add(columnLimitDtReverseFlg());
        ls.add(columnShippingStopFlg());
        ls.add(columnFixedPoint());
        ls.add(columnShapeGrpId());
        ls.add(columnNmfcCode());
        ls.add(columnFreightCls());
        ls.add(columnCounntryOfOrigin());
        ls.add(columnUnitVal());
        ls.add(columnHtsCd());
        ls.add(columnProductCategoryCls());
        ls.add(columnProdDtManagFlg());
        ls.add(columnProdDtLimitDaysRcv());
        ls.add(columnProdDtLimitDaysShp());
        ls.add(columnSerialManagFlg());
        ls.add(columnOcrDateFormat());
        ls.add(columnInsuranceFlg());
        ls.add(columnNoOkinawaFlightFlg());
        ls.add(columnHeavyItemFlg());
        ls.add(columnLargeItemFlg());
        ls.add(columnHinmokuGroupCd());
        ls.add(columnCaseTypeCd());
        ls.add(columnEvaluationUnitPrice());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnUnitNm());
        ls.add(columnOldJanCd());
        ls.add(columnRecomendLocationCd());
        ls.add(columnRecomendLocationTypeCd());
        ls.add(columnInnerJanCd());
        ls.add(columnCreateDate());
        ls.add(columnCreateTime());
        ls.add(columnFloorRefStockNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnProductCd());
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
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMShapeGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShapeGrpId(), MShapeGrpDbm.getInstance().columnShapeGrpId());
        return cfi("M_PRODUCT_FK2", "MShapeGrp", this, MShapeGrpDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MProductList", false);
    }
    /**
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("M_PRODUCT_FK1", "MClient", this, MClientDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MProductList", false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LIMIT_DT_MANAG_FLG", "BClassDtlByLimitDtManagFlg", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLimitDtReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLimitDtReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LIMIT_DT_REVERSE_FLG", "BClassDtlByLimitDtReverseFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LIMIT_DT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOT_MANAG_FLG", "BClassDtlByLotManagFlg", this, BClassDtlDbm.getInstance(), mp, 5, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLotReverseFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLotReverseFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOT_REVERSE_FLG", "BClassDtlByLotReverseFlg", this, BClassDtlDbm.getInstance(), mp, 6, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOT_REVERSE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByMergeCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMergeCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_MERGE_CLS", "BClassDtlByMergeCls", this, BClassDtlDbm.getInstance(), mp, 7, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'MERGE_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByShippingStopFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingStopFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_SHIPPING_STOP_FLG", "BClassDtlByShippingStopFlg", this, BClassDtlDbm.getInstance(), mp, 8, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'SHIPPING_STOP_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByFreightCls() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFreightCls(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_FREIGHT_CLS", "BClassDtlByFreightCls", this, BClassDtlDbm.getInstance(), mp, 9, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'FREIGHT_CLS'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByProdDtManagFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProdDtManagFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_PROD_DT_MANAG_FLG", "BClassDtlByProdDtManagFlg", this, BClassDtlDbm.getInstance(), mp, 10, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'PROD_DT_MANAG_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLogiSpecialTypeCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogiSpecialTypeCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOGI_SPECIAL_TYPE_CD", "BClassDtlByLogiSpecialTypeCd", this, BClassDtlDbm.getInstance(), mp, 11, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOGI_SPECIAL_TYPE_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByOcrDateFormat() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOcrDateFormat(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_OCR_DATE_FORMAT", "BClassDtlByOcrDateFormat", this, BClassDtlDbm.getInstance(), mp, 12, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'OCR_DATE_FORMAT'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInsuranceFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInsuranceFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_INSURANCE_FLG", "BClassDtlByInsuranceFlg", this, BClassDtlDbm.getInstance(), mp, 13, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INSURANCE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByNoOkinawaFlightFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnNoOkinawaFlightFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_NO_OKINAWA_FLIGHT_FLG", "BClassDtlByNoOkinawaFlightFlg", this, BClassDtlDbm.getInstance(), mp, 14, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'NO_OKINAWA_FLIGHT_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLogiAttentionTypeCd() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLogiAttentionTypeCd(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LOGI_ATTENTION_TYPE_CD", "BClassDtlByLogiAttentionTypeCd", this, BClassDtlDbm.getInstance(), mp, 15, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LOGI_ATTENTION_TYPE_CD'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByHeavyItemFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnHeavyItemFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_HEAVY_ITEM_FLG", "BClassDtlByHeavyItemFlg", this, BClassDtlDbm.getInstance(), mp, 16, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'HEAVY_ITEM_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByLargeItemFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnLargeItemFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_PRODUCT_LARGE_ITEM_FLG", "BClassDtlByLargeItemFlg", this, BClassDtlDbm.getInstance(), mp, 17, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'LARGE_ITEM_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMSetParentAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MSetParentDbm.getInstance().columnProductId());
        return cfi("M_SET_PARENT_FK1", "MSetParentAsOne", this, MSetParentDbm.getInstance(), mp, 18, null, true, false, true, false, null, null, false, "MProduct", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHStockBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), HStockBookDbm.getInstance().columnProductId());
        return cri("H_STOCK_BOOK_FK1", "HStockBookList", this, HStockBookDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDepositProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MDepositProductDbm.getInstance().columnProductId());
        return cri("M_DEPOSIT_PRODUCT_FK3", "MDepositProductList", this, MDepositProductDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MLocationDbm.getInstance().columnReplenishProductId());
        return cri("M_LOCATION_FK3", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationReplenishProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MLocationReplenishProductDbm.getInstance().columnReplenishProductId());
        return cri("M_LOCATION_REPLENISH_PRODUCT_FK1", "MLocationReplenishProductList", this, MLocationReplenishProductDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMProductShapeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductShapeDbm.getInstance().columnProductId());
        return cri("M_PRODUCT_SHAPE_FK1", "MProductShapeList", this, MProductShapeDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMSetStructureList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MSetStructureDbm.getInstance().columnProductId());
        return cri("M_SET_STRUCTURE_FK2", "MSetStructureList", this, MSetStructureDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TAllocInstBDbm.getInstance().columnProductId());
        return cri("T_ALLOC_INST_B_FK8", "TAllocInstBList", this, TAllocInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TAllocLotDbm.getInstance().columnProductId());
        return cri("T_ALLOC_LOT_FK1", "TAllocLotList", this, TAllocLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TInventoryBDbm.getInstance().columnProductId());
        return cri("T_INVENTORY_B_FK4", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTKeepingLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TKeepingLotDbm.getInstance().columnProductId());
        return cri("T_KEEPING_LOT_FK3", "TKeepingLotList", this, TKeepingLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLastLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TLastLotDbm.getInstance().columnProductId());
        return cri("T_LAST_LOT_FK2", "TLastLotList", this, TLastLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_lot by PRODUCT_ID, named 'TLotList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTLotList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TLotDbm.getInstance().columnProductId());
        return cri("T_LOT_FK1", "TLotList", this, TLotDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TMoveInstBDbm.getInstance().columnProductId());
        return cri("T_MOVE_INST_B_FK3", "TMoveInstBList", this, TMoveInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTNizoroeAlarmLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TNizoroeAlarmLogDbm.getInstance().columnProductId());
        return cri("T_NIZOROE_ALARM_LOG_FK2", "TNizoroeAlarmLogList", this, TNizoroeAlarmLogDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTOperationLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TOperationLogDbm.getInstance().columnProductId());
        return cri("T_OPERATION_LOG_FK1", "TOperationLogList", this, TOperationLogDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TReceivePlanBDbm.getInstance().columnProductId());
        return cri("T_RECEIVE_PLAN_B_FK4", "TReceivePlanBList", this, TReceivePlanBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TSerialNoDbm.getInstance().columnProductId());
        return cri("T_SERIAL_NO_FK3", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TShippingInstBDbm.getInstance().columnProductId());
        return cri("T_SHIPPING_INST_B_FK2", "TShippingInstBList", this, TShippingInstBDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_stock by PRODUCT_ID, named 'TStockList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TStockDbm.getInstance().columnProductId());
        return cri("T_STOCK_FK9", "TStockList", this, TStockDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), TStockBookDbm.getInstance().columnProductId());
        return cri("T_STOCK_BOOK_FK1", "TStockBookList", this, TStockBookDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtInventoryInputProdDbm.getInstance().columnProductId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK6", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtPickingDbm.getInstance().columnProductId());
        return cri("W_HT_PICKING_FK1", "WHtPickingList", this, WHtPickingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveInspectionDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_INSPECTION_FK1", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveNoPlanInspDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK1", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtReceiveStoreDbm.getInstance().columnProductId());
        return cri("W_HT_RECEIVE_STORE_FK4", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtShippingDbm.getInstance().columnProductId());
        return cri("W_HT_SHIPPING_FK4", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtShippingPickingDbm.getInstance().columnProductId());
        return cri("W_HT_SHIPPING_PICKING_FK3", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtTotalPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WHtTotalPickingDbm.getInstance().columnProductId());
        return cri("W_HT_TOTAL_PICKING_FK3", "WHtTotalPickingList", this, WHtTotalPickingDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WSglRowShipInspHDbm.getInstance().columnProductId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK2", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MProduct");
    }
    /**
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), WShippingInterruptDbm.getInstance().columnProductId());
        return cri("W_SHIPPING_INTERRUPT_FK2", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MProduct");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MProduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MProductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MProduct> getEntityType() { return MProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MProduct newEntity() { return new MProduct(); }
    public MProduct newMyEntity() { return new MProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
