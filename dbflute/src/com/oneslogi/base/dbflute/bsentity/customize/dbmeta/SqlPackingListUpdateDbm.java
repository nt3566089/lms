package com.oneslogi.base.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The DB meta of SqlPackingListUpdate. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPackingListUpdateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPackingListUpdateDbm _instance = new SqlPackingListUpdateDbm();
    private SqlPackingListUpdateDbm() {}
    public static SqlPackingListUpdateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPickingNumSum(), (et, vl) -> ((SqlPackingListUpdate)et).setPickingNumSum(ctb(vl)), "pickingNumSum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPackingNumSum(), (et, vl) -> ((SqlPackingListUpdate)et).setPackingNumSum(ctb(vl)), "packingNumSum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPackingHId(), (et, vl) -> ((SqlPackingListUpdate)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterId(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getClientId(), (et, vl) -> ((SqlPackingListUpdate)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProcessTypeId(), (et, vl) -> ((SqlPackingListUpdate)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterCd(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCenterNm(), (et, vl) -> ((SqlPackingListUpdate)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getBoxCd(), (et, vl) -> ((SqlPackingListUpdate)et).setBoxCd((String)vl), "boxCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getBoxNm(), (et, vl) -> ((SqlPackingListUpdate)et).setBoxNm((String)vl), "boxNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductCd(), (et, vl) -> ((SqlPackingListUpdate)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getJanCd(), (et, vl) -> ((SqlPackingListUpdate)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getUnitNm(), (et, vl) -> ((SqlPackingListUpdate)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductNm(), (et, vl) -> ((SqlPackingListUpdate)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProductId(), (et, vl) -> ((SqlPackingListUpdate)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getVersionNo(), (et, vl) -> ((SqlPackingListUpdate)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getAllocInstHId(), (et, vl) -> ((SqlPackingListUpdate)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPickingHId(), (et, vl) -> ((SqlPackingListUpdate)et).setPickingHId(ctl(vl)), "pickingHId");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getOldBid(), (et, vl) -> ((SqlPackingListUpdate)et).setOldBid(ctl(vl)), "oldBid");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getPackingStatus(), (et, vl) -> ((SqlPackingListUpdate)et).setPackingStatus((String)vl), "packingStatus");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCasePickingNo(), (et, vl) -> ((SqlPackingListUpdate)et).setCasePickingNo((String)vl), "casePickingNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getReceiveLabelNo(), (et, vl) -> ((SqlPackingListUpdate)et).setReceiveLabelNo((String)vl), "receiveLabelNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getNizoroeNo(), (et, vl) -> ((SqlPackingListUpdate)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getNizoroeNo2(), (et, vl) -> ((SqlPackingListUpdate)et).setNizoroeNo2((String)vl), "nizoroeNo2");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDaihyoNizoroeNo(), (et, vl) -> ((SqlPackingListUpdate)et).setDaihyoNizoroeNo((String)vl), "daihyoNizoroeNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDaihyoNizoroeNo2(), (et, vl) -> ((SqlPackingListUpdate)et).setDaihyoNizoroeNo2((String)vl), "daihyoNizoroeNo2");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getShippingPackingNo(), (et, vl) -> ((SqlPackingListUpdate)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCarrierTraceNum(), (et, vl) -> ((SqlPackingListUpdate)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getLot(), (et, vl) -> ((SqlPackingListUpdate)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getLimitDt(), (et, vl) -> ((SqlPackingListUpdate)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getProdDt(), (et, vl) -> ((SqlPackingListUpdate)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getDepositCd(), (et, vl) -> ((SqlPackingListUpdate)et).setDepositCd((String)vl), "depositCd");
        setupEpg(_epgMap, et -> ((SqlPackingListUpdate)et).getCustomerNm(), (et, vl) -> ((SqlPackingListUpdate)et).setCustomerNm((String)vl), "customerNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPackingListUpdate";
    protected final String _tableDispName = "SqlPackingListUpdate";
    protected final String _tablePropertyName = "sqlPackingListUpdate";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPackingListUpdate", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPickingNumSum = cci("PICKING_NUM_SUM", "PICKING_NUM_SUM", null, null, java.math.BigDecimal.class, "pickingNumSum", null, false, false, false, "DECIMAL", 41, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNumSum = cci("PACKING_NUM_SUM", "PACKING_NUM_SUM", null, null, java.math.BigDecimal.class, "packingNumSum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxCd = cci("BOX_CD", "BOX_CD", null, null, String.class, "boxCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNm = cci("BOX_NM", "BOX_NM", null, null, String.class, "boxNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, false, "BIGINT", 20, 0, null, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingHId = cci("PICKING_H_ID", "PICKING_H_ID", null, null, Long.class, "pickingHId", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldBid = cci("OLD_BID", "OLD_BID", null, null, Long.class, "oldBid", null, false, false, false, "BIGINT", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingStatus = cci("PACKING_STATUS", "PACKING_STATUS", null, null, String.class, "packingStatus", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCasePickingNo = cci("CASE_PICKING_NO", "CASE_PICKING_NO", null, null, String.class, "casePickingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveLabelNo = cci("RECEIVE_LABEL_NO", "RECEIVE_LABEL_NO", null, null, String.class, "receiveLabelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo2 = cci("NIZOROE_NO2", "NIZOROE_NO2", null, null, String.class, "nizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo = cci("DAIHYO_NIZOROE_NO", "DAIHYO_NIZOROE_NO", null, null, String.class, "daihyoNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo2 = cci("DAIHYO_NIZOROE_NO2", "DAIHYO_NIZOROE_NO2", null, null, String.class, "daihyoNizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositCd = cci("DEPOSIT_CD", "DEPOSIT_CD", null, null, String.class, "depositCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * PICKING_NUM_SUM: {DECIMAL(41)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingNumSum() { return _columnPickingNumSum; }
    /**
     * PACKING_NUM_SUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNumSum() { return _columnPackingNumSum; }
    /**
     * PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * CENTER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * BOX_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxCd() { return _columnBoxCd; }
    /**
     * BOX_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNm() { return _columnBoxNm; }
    /**
     * PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * PRODUCT_NM: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * VERSION_NO: {BIGINT(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    /**
     * ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingHId() { return _columnPickingHId; }
    /**
     * OLD_BID: {BIGINT(20), refers to t_packing_b.PACKING_B_ID}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldBid() { return _columnOldBid; }
    /**
     * PACKING_STATUS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingStatus() { return _columnPackingStatus; }
    /**
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCasePickingNo() { return _columnCasePickingNo; }
    /**
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLabelNo() { return _columnReceiveLabelNo; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo2() { return _columnNizoroeNo2; }
    /**
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo() { return _columnDaihyoNizoroeNo; }
    /**
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo2() { return _columnDaihyoNizoroeNo2; }
    /**
     * SHIPPING_PACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * CARRIER_TRACE_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
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
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositCd() { return _columnDepositCd; }
    /**
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPickingNumSum());
        ls.add(columnPackingNumSum());
        ls.add(columnPackingHId());
        ls.add(columnCenterId());
        ls.add(columnClientId());
        ls.add(columnProcessTypeId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnBoxCd());
        ls.add(columnBoxNm());
        ls.add(columnProductCd());
        ls.add(columnJanCd());
        ls.add(columnUnitNm());
        ls.add(columnProductNm());
        ls.add(columnProductId());
        ls.add(columnVersionNo());
        ls.add(columnAllocInstHId());
        ls.add(columnPickingHId());
        ls.add(columnOldBid());
        ls.add(columnPackingStatus());
        ls.add(columnCasePickingNo());
        ls.add(columnReceiveLabelNo());
        ls.add(columnNizoroeNo());
        ls.add(columnNizoroeNo2());
        ls.add(columnDaihyoNizoroeNo());
        ls.add(columnDaihyoNizoroeNo2());
        ls.add(columnShippingPackingNo());
        ls.add(columnCarrierTraceNum());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnProdDt());
        ls.add(columnDepositCd());
        ls.add(columnCustomerNm());
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

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPackingListUpdate> getEntityType() { return SqlPackingListUpdate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPackingListUpdate newEntity() { return new SqlPackingListUpdate(); }
    public SqlPackingListUpdate newMyEntity() { return new SqlPackingListUpdate(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPackingListUpdate)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPackingListUpdate)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
