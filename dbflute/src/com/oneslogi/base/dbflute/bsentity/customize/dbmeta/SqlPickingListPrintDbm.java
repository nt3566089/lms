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
 * The DB meta of SqlPickingListPrint. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlPickingListPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlPickingListPrintDbm _instance = new SqlPickingListPrintDbm();
    private SqlPickingListPrintDbm() {}
    public static SqlPickingListPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getNizoroeNo2(), (et, vl) -> ((SqlPickingListPrint)et).setNizoroeNo2((String)vl), "nizoroeNo2");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDaihyoNizoroeNo2(), (et, vl) -> ((SqlPickingListPrint)et).setDaihyoNizoroeNo2((String)vl), "daihyoNizoroeNo2");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSupplyCustomerNm(), (et, vl) -> ((SqlPickingListPrint)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDeliveryCourseCd(), (et, vl) -> ((SqlPickingListPrint)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDeliveryCourseNm(), (et, vl) -> ((SqlPickingListPrint)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCarrierCd(), (et, vl) -> ((SqlPickingListPrint)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCarrierNm(), (et, vl) -> ((SqlPickingListPrint)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getKohaiContractorCd(), (et, vl) -> ((SqlPickingListPrint)et).setKohaiContractorCd((String)vl), "kohaiContractorCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getKohaiContractorNm(), (et, vl) -> ((SqlPickingListPrint)et).setKohaiContractorNm((String)vl), "kohaiContractorNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getShippingDt(), (et, vl) -> ((SqlPickingListPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getWorkDt(), (et, vl) -> ((SqlPickingListPrint)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getShippingFixedDt(), (et, vl) -> ((SqlPickingListPrint)et).setShippingFixedDt((String)vl), "shippingFixedDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getClientShippingNo(), (et, vl) -> ((SqlPickingListPrint)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getProcessTypeCd(), (et, vl) -> ((SqlPickingListPrint)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getProcessTypeNm(), (et, vl) -> ((SqlPickingListPrint)et).setProcessTypeNm((String)vl), "processTypeNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getShippingTypeCd(), (et, vl) -> ((SqlPickingListPrint)et).setShippingTypeCd((String)vl), "shippingTypeCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getShippingTypeNm(), (et, vl) -> ((SqlPickingListPrint)et).setShippingTypeNm((String)vl), "shippingTypeNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getSlipCnt(), (et, vl) -> ((SqlPickingListPrint)et).setSlipCnt(ctl(vl)), "slipCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getLineCnt(), (et, vl) -> ((SqlPickingListPrint)et).setLineCnt(ctl(vl)), "lineCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getItemCnt(), (et, vl) -> ((SqlPickingListPrint)et).setItemCnt(ctl(vl)), "itemCnt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getInstNum(), (et, vl) -> ((SqlPickingListPrint)et).setInstNum(ctb(vl)), "instNum");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPackingNum(), (et, vl) -> ((SqlPickingListPrint)et).setPackingNum(ctb(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getNizoroeOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setNizoroeOutFlg((String)vl), "nizoroeOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getNizoroeOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setNizoroeOutNm((String)vl), "nizoroeOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getNizoroeOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setNizoroeOutDt(cttp(vl)), "nizoroeOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutFlg((String)vl), "tagOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutNm((String)vl), "tagOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getTagOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setTagOutDt(cttp(vl)), "tagOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDelivOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setDelivOutFlg((String)vl), "delivOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDelivOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setDelivOutNm((String)vl), "delivOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getDelivOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setDelivOutDt(cttp(vl)), "delivOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPllOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setPllOutFlg((String)vl), "pllOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPllOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setPllOutNm((String)vl), "pllOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPllOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setPllOutDt(cttp(vl)), "pllOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvSupplyOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setIndvSupplyOutFlg((String)vl), "indvSupplyOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvSupplyOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setIndvSupplyOutNm((String)vl), "indvSupplyOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvSupplyOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setIndvSupplyOutDt(cttp(vl)), "indvSupplyOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvLabelOutFlg(), (et, vl) -> ((SqlPickingListPrint)et).setIndvLabelOutFlg((String)vl), "indvLabelOutFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvLabelOutNm(), (et, vl) -> ((SqlPickingListPrint)et).setIndvLabelOutNm((String)vl), "indvLabelOutNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIndvLabelOutDt(), (et, vl) -> ((SqlPickingListPrint)et).setIndvLabelOutDt(cttp(vl)), "indvLabelOutDt");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCenterCd(), (et, vl) -> ((SqlPickingListPrint)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getCenterNm(), (et, vl) -> ((SqlPickingListPrint)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getEmergencyFlg(), (et, vl) -> ((SqlPickingListPrint)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getPickingStatusCd(), (et, vl) -> ((SqlPickingListPrint)et).setPickingStatusCd((String)vl), "pickingStatusCd");
        setupEpg(_epgMap, et -> ((SqlPickingListPrint)et).getIdManagPrintTypeCd(), (et, vl) -> ((SqlPickingListPrint)et).setIdManagPrintTypeCd((String)vl), "idManagPrintTypeCd");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlPickingListPrint";
    protected final String _tableDispName = "SqlPickingListPrint";
    protected final String _tablePropertyName = "sqlPickingListPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlPickingListPrint", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNizoroeNo2 = cci("NIZOROE_NO2", "NIZOROE_NO2", null, null, String.class, "nizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo2 = cci("DAIHYO_NIZOROE_NO2", "DAIHYO_NIZOROE_NO2", null, null, String.class, "daihyoNizoroeNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorCd = cci("KOHAI_CONTRACTOR_CD", "KOHAI_CONTRACTOR_CD", null, null, String.class, "kohaiContractorCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorNm = cci("KOHAI_CONTRACTOR_NM", "KOHAI_CONTRACTOR_NM", null, null, String.class, "kohaiContractorNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingFixedDt = cci("SHIPPING_FIXED_DT", "SHIPPING_FIXED_DT", null, null, String.class, "shippingFixedDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeNm = cci("PROCESS_TYPE_NM", "PROCESS_TYPE_NM", null, null, String.class, "processTypeNm", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeCd = cci("SHIPPING_TYPE_CD", "SHIPPING_TYPE_CD", null, null, String.class, "shippingTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeNm = cci("SHIPPING_TYPE_NM", "SHIPPING_TYPE_NM", null, null, String.class, "shippingTypeNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipCnt = cci("SLIP_CNT", "SLIP_CNT", null, null, Long.class, "slipCnt", null, false, false, false, "BIGINT", 21, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineCnt = cci("LINE_CNT", "LINE_CNT", null, null, Long.class, "lineCnt", null, false, false, false, "BIGINT", 21, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnItemCnt = cci("ITEM_CNT", "ITEM_CNT", null, null, Long.class, "itemCnt", null, false, false, false, "BIGINT", 21, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstNum = cci("INST_NUM", "INST_NUM", null, null, java.math.BigDecimal.class, "instNum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, java.math.BigDecimal.class, "packingNum", null, false, false, false, "DECIMAL", 36, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeOutFlg = cci("NIZOROE_OUT_FLG", "NIZOROE_OUT_FLG", null, null, String.class, "nizoroeOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeOutNm = cci("NIZOROE_OUT_NM", "NIZOROE_OUT_NM", null, null, String.class, "nizoroeOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeOutDt = cci("NIZOROE_OUT_DT", "NIZOROE_OUT_DT", null, null, java.sql.Timestamp.class, "nizoroeOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutFlg = cci("TAG_OUT_FLG", "TAG_OUT_FLG", null, null, String.class, "tagOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutNm = cci("TAG_OUT_NM", "TAG_OUT_NM", null, null, String.class, "tagOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTagOutDt = cci("TAG_OUT_DT", "TAG_OUT_DT", null, null, java.sql.Timestamp.class, "tagOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivOutFlg = cci("DELIV_OUT_FLG", "DELIV_OUT_FLG", null, null, String.class, "delivOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivOutNm = cci("DELIV_OUT_NM", "DELIV_OUT_NM", null, null, String.class, "delivOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivOutDt = cci("DELIV_OUT_DT", "DELIV_OUT_DT", null, null, java.sql.Timestamp.class, "delivOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPllOutFlg = cci("PLL_OUT_FLG", "PLL_OUT_FLG", null, null, String.class, "pllOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPllOutNm = cci("PLL_OUT_NM", "PLL_OUT_NM", null, null, String.class, "pllOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPllOutDt = cci("PLL_OUT_DT", "PLL_OUT_DT", null, null, java.sql.Timestamp.class, "pllOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutFlg = cci("INDV_SUPPLY_OUT_FLG", "INDV_SUPPLY_OUT_FLG", null, null, String.class, "indvSupplyOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutNm = cci("INDV_SUPPLY_OUT_NM", "INDV_SUPPLY_OUT_NM", null, null, String.class, "indvSupplyOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvSupplyOutDt = cci("INDV_SUPPLY_OUT_DT", "INDV_SUPPLY_OUT_DT", null, null, java.sql.Timestamp.class, "indvSupplyOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelOutFlg = cci("INDV_LABEL_OUT_FLG", "INDV_LABEL_OUT_FLG", null, null, String.class, "indvLabelOutFlg", null, false, false, false, "VARCHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelOutNm = cci("INDV_LABEL_OUT_NM", "INDV_LABEL_OUT_NM", null, null, String.class, "indvLabelOutNm", null, false, false, false, "NULL", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIndvLabelOutDt = cci("INDV_LABEL_OUT_DT", "INDV_LABEL_OUT_DT", null, null, java.sql.Timestamp.class, "indvLabelOutDt", null, false, false, false, "DATETIME", 23, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingStatusCd = cci("PICKING_STATUS_CD", "PICKING_STATUS_CD", null, null, String.class, "pickingStatusCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdManagPrintTypeCd = cci("ID_MANAG_PRINT_TYPE_CD", "ID_MANAG_PRINT_TYPE_CD", null, null, String.class, "idManagPrintTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo2() { return _columnNizoroeNo2; }
    /**
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo2() { return _columnDaihyoNizoroeNo2; }
    /**
     * SUPPLY_CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * DELIVERY_COURSE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }
    /**
     * CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKohaiContractorCd() { return _columnKohaiContractorCd; }
    /**
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKohaiContractorNm() { return _columnKohaiContractorNm; }
    /**
     * SHIPPING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingFixedDt() { return _columnShippingFixedDt; }
    /**
     * CLIENT_SHIPPING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * PROCESS_TYPE_NM: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeNm() { return _columnProcessTypeNm; }
    /**
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeCd() { return _columnShippingTypeCd; }
    /**
     * SHIPPING_TYPE_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeNm() { return _columnShippingTypeNm; }
    /**
     * SLIP_CNT: {BIGINT(21)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipCnt() { return _columnSlipCnt; }
    /**
     * LINE_CNT: {BIGINT(21)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineCnt() { return _columnLineCnt; }
    /**
     * ITEM_CNT: {BIGINT(21)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnItemCnt() { return _columnItemCnt; }
    /**
     * INST_NUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstNum() { return _columnInstNum; }
    /**
     * PACKING_NUM: {DECIMAL(36, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
    /**
     * NIZOROE_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutFlg() { return _columnNizoroeOutFlg; }
    /**
     * NIZOROE_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutNm() { return _columnNizoroeOutNm; }
    /**
     * NIZOROE_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeOutDt() { return _columnNizoroeOutDt; }
    /**
     * TAG_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutFlg() { return _columnTagOutFlg; }
    /**
     * TAG_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutNm() { return _columnTagOutNm; }
    /**
     * TAG_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTagOutDt() { return _columnTagOutDt; }
    /**
     * DELIV_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutFlg() { return _columnDelivOutFlg; }
    /**
     * DELIV_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutNm() { return _columnDelivOutNm; }
    /**
     * DELIV_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivOutDt() { return _columnDelivOutDt; }
    /**
     * PLL_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutFlg() { return _columnPllOutFlg; }
    /**
     * PLL_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutNm() { return _columnPllOutNm; }
    /**
     * PLL_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPllOutDt() { return _columnPllOutDt; }
    /**
     * INDV_SUPPLY_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutFlg() { return _columnIndvSupplyOutFlg; }
    /**
     * INDV_SUPPLY_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutNm() { return _columnIndvSupplyOutNm; }
    /**
     * INDV_SUPPLY_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvSupplyOutDt() { return _columnIndvSupplyOutDt; }
    /**
     * INDV_LABEL_OUT_FLG: {VARCHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutFlg() { return _columnIndvLabelOutFlg; }
    /**
     * INDV_LABEL_OUT_NM: {NULL}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutNm() { return _columnIndvLabelOutNm; }
    /**
     * INDV_LABEL_OUT_DT: {DATETIME(23)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIndvLabelOutDt() { return _columnIndvLabelOutDt; }
    /**
     * CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * EMERGENCY_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * PICKING_STATUS_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingStatusCd() { return _columnPickingStatusCd; }
    /**
     * ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdManagPrintTypeCd() { return _columnIdManagPrintTypeCd; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNizoroeNo2());
        ls.add(columnDaihyoNizoroeNo2());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnDeliveryCourseNm());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnKohaiContractorCd());
        ls.add(columnKohaiContractorNm());
        ls.add(columnShippingDt());
        ls.add(columnWorkDt());
        ls.add(columnShippingFixedDt());
        ls.add(columnClientShippingNo());
        ls.add(columnProcessTypeCd());
        ls.add(columnProcessTypeNm());
        ls.add(columnShippingTypeCd());
        ls.add(columnShippingTypeNm());
        ls.add(columnSlipCnt());
        ls.add(columnLineCnt());
        ls.add(columnItemCnt());
        ls.add(columnInstNum());
        ls.add(columnPackingNum());
        ls.add(columnNizoroeOutFlg());
        ls.add(columnNizoroeOutNm());
        ls.add(columnNizoroeOutDt());
        ls.add(columnTagOutFlg());
        ls.add(columnTagOutNm());
        ls.add(columnTagOutDt());
        ls.add(columnDelivOutFlg());
        ls.add(columnDelivOutNm());
        ls.add(columnDelivOutDt());
        ls.add(columnPllOutFlg());
        ls.add(columnPllOutNm());
        ls.add(columnPllOutDt());
        ls.add(columnIndvSupplyOutFlg());
        ls.add(columnIndvSupplyOutNm());
        ls.add(columnIndvSupplyOutDt());
        ls.add(columnIndvLabelOutFlg());
        ls.add(columnIndvLabelOutNm());
        ls.add(columnIndvLabelOutDt());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnEmergencyFlg());
        ls.add(columnPickingStatusCd());
        ls.add(columnIdManagPrintTypeCd());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlPickingListPrint"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlPickingListPrint> getEntityType() { return SqlPickingListPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlPickingListPrint newEntity() { return new SqlPickingListPrint(); }
    public SqlPickingListPrint newMyEntity() { return new SqlPickingListPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlPickingListPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlPickingListPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
