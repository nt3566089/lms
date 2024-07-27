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
 * The DB meta of t_shipping_plan_h. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingPlanHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingPlanHDbm _instance = new TShippingPlanHDbm();
    private TShippingPlanHDbm() {}
    public static TShippingPlanHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingPlanHId(), (et, vl) -> ((TShippingPlanH)et).setShippingPlanHId(ctl(vl)), "shippingPlanHId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getClientId(), (et, vl) -> ((TShippingPlanH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getCenterId(), (et, vl) -> ((TShippingPlanH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getProcessTypeId(), (et, vl) -> ((TShippingPlanH)et).setProcessTypeId(ctl(vl)), "processTypeId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getInputType(), (et, vl) -> ((TShippingPlanH)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingDt(), (et, vl) -> ((TShippingPlanH)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getWorkDt(), (et, vl) -> ((TShippingPlanH)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivPlanDt(), (et, vl) -> ((TShippingPlanH)et).setDelivPlanDt((String)vl), "delivPlanDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivDt(), (et, vl) -> ((TShippingPlanH)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivTz(), (et, vl) -> ((TShippingPlanH)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getClientShippingNo(), (et, vl) -> ((TShippingPlanH)et).setClientShippingNo((String)vl), "clientShippingNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingSlipNo(), (et, vl) -> ((TShippingPlanH)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingStatus(), (et, vl) -> ((TShippingPlanH)et).setShippingStatus((String)vl), "shippingStatus");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSupplyCustomerId(), (et, vl) -> ((TShippingPlanH)et).setSupplyCustomerId(ctl(vl)), "supplyCustomerId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSupplyCustomerCd(), (et, vl) -> ((TShippingPlanH)et).setSupplyCustomerCd((String)vl), "supplyCustomerCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSupplyCustomerNm(), (et, vl) -> ((TShippingPlanH)et).setSupplyCustomerNm((String)vl), "supplyCustomerNm");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivCustomerId(), (et, vl) -> ((TShippingPlanH)et).setDelivCustomerId(ctl(vl)), "delivCustomerId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivCustomerCd(), (et, vl) -> ((TShippingPlanH)et).setDelivCustomerCd((String)vl), "delivCustomerCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivZipCd(), (et, vl) -> ((TShippingPlanH)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivAddress1(), (et, vl) -> ((TShippingPlanH)et).setDelivAddress1((String)vl), "delivAddress1");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivAddress2(), (et, vl) -> ((TShippingPlanH)et).setDelivAddress2((String)vl), "delivAddress2");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivAddress3(), (et, vl) -> ((TShippingPlanH)et).setDelivAddress3((String)vl), "delivAddress3");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivAddressSupply(), (et, vl) -> ((TShippingPlanH)et).setDelivAddressSupply((String)vl), "delivAddressSupply");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelivTelNo(), (et, vl) -> ((TShippingPlanH)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDeliveryCourseId(), (et, vl) -> ((TShippingPlanH)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDeliveryCourseCd(), (et, vl) -> ((TShippingPlanH)et).setDeliveryCourseCd((String)vl), "deliveryCourseCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getEmergencyFlg(), (et, vl) -> ((TShippingPlanH)et).setEmergencyFlg((String)vl), "emergencyFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getPickingWorkMessage(), (et, vl) -> ((TShippingPlanH)et).setPickingWorkMessage((String)vl), "pickingWorkMessage");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getErrorFlg(), (et, vl) -> ((TShippingPlanH)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getErrorMessageCd(), (et, vl) -> ((TShippingPlanH)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getPickingBatchNo(), (et, vl) -> ((TShippingPlanH)et).setPickingBatchNo((String)vl), "pickingBatchNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getStockOutFlg(), (et, vl) -> ((TShippingPlanH)et).setStockOutFlg((String)vl), "stockOutFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getAllocInstHId(), (et, vl) -> ((TShippingPlanH)et).setAllocInstHId(ctl(vl)), "allocInstHId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getCod(), (et, vl) -> ((TShippingPlanH)et).setCod(ctl(vl)), "cod");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getCodTax(), (et, vl) -> ((TShippingPlanH)et).setCodTax(ctl(vl)), "codTax");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getTotalPrice(), (et, vl) -> ((TShippingPlanH)et).setTotalPrice(ctb(vl)), "totalPrice");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getTotalTax(), (et, vl) -> ((TShippingPlanH)et).setTotalTax(ctb(vl)), "totalTax");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSlipTypeCd(), (et, vl) -> ((TShippingPlanH)et).setSlipTypeCd((String)vl), "slipTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSalesOrderSlipTypeCd(), (et, vl) -> ((TShippingPlanH)et).setSalesOrderSlipTypeCd((String)vl), "salesOrderSlipTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDirectDeliveryTypeCd(), (et, vl) -> ((TShippingPlanH)et).setDirectDeliveryTypeCd((String)vl), "directDeliveryTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingTypeId(), (et, vl) -> ((TShippingPlanH)et).setShippingTypeId(ctl(vl)), "shippingTypeId");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingTypeCd(), (et, vl) -> ((TShippingPlanH)et).setShippingTypeCd((String)vl), "shippingTypeCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getSalesOrgCd(), (et, vl) -> ((TShippingPlanH)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getKoguchiDeliveryFlg(), (et, vl) -> ((TShippingPlanH)et).setKoguchiDeliveryFlg((String)vl), "koguchiDeliveryFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getKohaiContractorCd(), (et, vl) -> ((TShippingPlanH)et).setKohaiContractorCd((String)vl), "kohaiContractorCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getKohaiContractorNm(), (et, vl) -> ((TShippingPlanH)et).setKohaiContractorNm((String)vl), "kohaiContractorNm");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingReasonCd(), (et, vl) -> ((TShippingPlanH)et).setShippingReasonCd((String)vl), "shippingReasonCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingPlantCd(), (et, vl) -> ((TShippingPlanH)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getShippingStorageSpaceCd(), (et, vl) -> ((TShippingPlanH)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getTenhanshaCd(), (et, vl) -> ((TShippingPlanH)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getTenhanshaOrderNo(), (et, vl) -> ((TShippingPlanH)et).setTenhanshaOrderNo((String)vl), "tenhanshaOrderNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDestinationCd(), (et, vl) -> ((TShippingPlanH)et).setDestinationCd((String)vl), "destinationCd");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDestinationNm1(), (et, vl) -> ((TShippingPlanH)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDestinationNm2(), (et, vl) -> ((TShippingPlanH)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDestinationNmKana(), (et, vl) -> ((TShippingPlanH)et).setDestinationNmKana((String)vl), "destinationNmKana");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDestinationFax(), (et, vl) -> ((TShippingPlanH)et).setDestinationFax((String)vl), "destinationFax");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getDelFlg(), (et, vl) -> ((TShippingPlanH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getVersionNo(), (et, vl) -> ((TShippingPlanH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getControlNo(), (et, vl) -> ((TShippingPlanH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getAddDt(), (et, vl) -> ((TShippingPlanH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getAddUser(), (et, vl) -> ((TShippingPlanH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getAddProcess(), (et, vl) -> ((TShippingPlanH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getUpdDt(), (et, vl) -> ((TShippingPlanH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getUpdUser(), (et, vl) -> ((TShippingPlanH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingPlanH)et).getUpdProcess(), (et, vl) -> ((TShippingPlanH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_plan_h";
    protected final String _tableDispName = "t_shipping_plan_h";
    protected final String _tablePropertyName = "TShippingPlanH";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_plan_h", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingPlanHId = cci("SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", null, null, Long.class, "shippingPlanHId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TShippingPlanBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeId = cci("PROCESS_TYPE_ID", "PROCESS_TYPE_ID", null, null, Long.class, "processTypeId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, true, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivPlanDt = cci("DELIV_PLAN_DT", "DELIV_PLAN_DT", null, null, String.class, "delivPlanDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientShippingNo = cci("CLIENT_SHIPPING_NO", "CLIENT_SHIPPING_NO", null, null, String.class, "clientShippingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStatus = cci("SHIPPING_STATUS", "SHIPPING_STATUS", null, null, String.class, "shippingStatus", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerId = cci("SUPPLY_CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", null, null, Long.class, "supplyCustomerId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerCd = cci("SUPPLY_CUSTOMER_CD", "SUPPLY_CUSTOMER_CD", null, null, String.class, "supplyCustomerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplyCustomerNm = cci("SUPPLY_CUSTOMER_NM", "SUPPLY_CUSTOMER_NM", null, null, String.class, "supplyCustomerNm", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerId = cci("DELIV_CUSTOMER_ID", "DELIV_CUSTOMER_ID", null, null, Long.class, "delivCustomerId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerCd = cci("DELIV_CUSTOMER_CD", "DELIV_CUSTOMER_CD", null, null, String.class, "delivCustomerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress1 = cci("DELIV_ADDRESS1", "DELIV_ADDRESS1", null, null, String.class, "delivAddress1", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress2 = cci("DELIV_ADDRESS2", "DELIV_ADDRESS2", null, null, String.class, "delivAddress2", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress3 = cci("DELIV_ADDRESS3", "DELIV_ADDRESS3", null, null, String.class, "delivAddress3", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddressSupply = cci("DELIV_ADDRESS_SUPPLY", "DELIV_ADDRESS_SUPPLY", null, null, String.class, "delivAddressSupply", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseCd = cci("DELIVERY_COURSE_CD", "DELIVERY_COURSE_CD", null, null, String.class, "deliveryCourseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmergencyFlg = cci("EMERGENCY_FLG", "EMERGENCY_FLG", null, null, String.class, "emergencyFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingWorkMessage = cci("PICKING_WORK_MESSAGE", "PICKING_WORK_MESSAGE", null, null, String.class, "pickingWorkMessage", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingBatchNo = cci("PICKING_BATCH_NO", "PICKING_BATCH_NO", null, null, String.class, "pickingBatchNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutFlg = cci("STOCK_OUT_FLG", "STOCK_OUT_FLG", null, null, String.class, "stockOutFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocInstHId = cci("ALLOC_INST_H_ID", "ALLOC_INST_H_ID", null, null, Long.class, "allocInstHId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCod = cci("COD", "COD", null, null, Long.class, "cod", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodTax = cci("COD_TAX", "COD_TAX", null, null, Long.class, "codTax", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalPrice = cci("TOTAL_PRICE", "TOTAL_PRICE", null, null, java.math.BigDecimal.class, "totalPrice", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTotalTax = cci("TOTAL_TAX", "TOTAL_TAX", null, null, java.math.BigDecimal.class, "totalTax", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipTypeCd = cci("SLIP_TYPE_CD", "SLIP_TYPE_CD", null, null, String.class, "slipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipTypeCd = cci("SALES_ORDER_SLIP_TYPE_CD", "SALES_ORDER_SLIP_TYPE_CD", null, null, String.class, "salesOrderSlipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDirectDeliveryTypeCd = cci("DIRECT_DELIVERY_TYPE_CD", "DIRECT_DELIVERY_TYPE_CD", null, null, String.class, "directDeliveryTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeId = cci("SHIPPING_TYPE_ID", "SHIPPING_TYPE_ID", null, null, Long.class, "shippingTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingTypeCd = cci("SHIPPING_TYPE_CD", "SHIPPING_TYPE_CD", null, null, String.class, "shippingTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiDeliveryFlg = cci("KOGUCHI_DELIVERY_FLG", "KOGUCHI_DELIVERY_FLG", null, null, String.class, "koguchiDeliveryFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorCd = cci("KOHAI_CONTRACTOR_CD", "KOHAI_CONTRACTOR_CD", null, null, String.class, "kohaiContractorCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKohaiContractorNm = cci("KOHAI_CONTRACTOR_NM", "KOHAI_CONTRACTOR_NM", null, null, String.class, "kohaiContractorNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingReasonCd = cci("SHIPPING_REASON_CD", "SHIPPING_REASON_CD", null, null, String.class, "shippingReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaOrderNo = cci("TENHANSHA_ORDER_NO", "TENHANSHA_ORDER_NO", null, null, String.class, "tenhanshaOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationCd = cci("DESTINATION_CD", "DESTINATION_CD", null, null, String.class, "destinationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNmKana = cci("DESTINATION_NM_KANA", "DESTINATION_NM_KANA", null, null, String.class, "destinationNmKana", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationFax = cci("DESTINATION_FAX", "DESTINATION_FAX", null, null, String.class, "destinationFax", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPlanHId() { return _columnShippingPlanHId; }
    /**
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeId() { return _columnProcessTypeId; }
    /**
     * INPUT_TYPE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * WORK_DT: {IX, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
    /**
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivPlanDt() { return _columnDelivPlanDt; }
    /**
     * DELIV_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDt() { return _columnDelivDt; }
    /**
     * DELIV_TZ: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTz() { return _columnDelivTz; }
    /**
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientShippingNo() { return _columnClientShippingNo; }
    /**
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStatus() { return _columnShippingStatus; }
    /**
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerId() { return _columnSupplyCustomerId; }
    /**
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerCd() { return _columnSupplyCustomerCd; }
    /**
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplyCustomerNm() { return _columnSupplyCustomerNm; }
    /**
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerId() { return _columnDelivCustomerId; }
    /**
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerCd() { return _columnDelivCustomerCd; }
    /**
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress1() { return _columnDelivAddress1; }
    /**
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress2() { return _columnDelivAddress2; }
    /**
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress3() { return _columnDelivAddress3; }
    /**
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddressSupply() { return _columnDelivAddressSupply; }
    /**
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
    /**
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseCd() { return _columnDeliveryCourseCd; }
    /**
     * EMERGENCY_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmergencyFlg() { return _columnEmergencyFlg; }
    /**
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingWorkMessage() { return _columnPickingWorkMessage; }
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
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingBatchNo() { return _columnPickingBatchNo; }
    /**
     * STOCK_OUT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutFlg() { return _columnStockOutFlg; }
    /**
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocInstHId() { return _columnAllocInstHId; }
    /**
     * COD: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCod() { return _columnCod; }
    /**
     * COD_TAX: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodTax() { return _columnCodTax; }
    /**
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalPrice() { return _columnTotalPrice; }
    /**
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTotalTax() { return _columnTotalTax; }
    /**
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipTypeCd() { return _columnSlipTypeCd; }
    /**
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipTypeCd() { return _columnSalesOrderSlipTypeCd; }
    /**
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDirectDeliveryTypeCd() { return _columnDirectDeliveryTypeCd; }
    /**
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeId() { return _columnShippingTypeId; }
    /**
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingTypeCd() { return _columnShippingTypeCd; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryFlg() { return _columnKoguchiDeliveryFlg; }
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
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingReasonCd() { return _columnShippingReasonCd; }
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
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaCd() { return _columnTenhanshaCd; }
    /**
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaOrderNo() { return _columnTenhanshaOrderNo; }
    /**
     * DESTINATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationCd() { return _columnDestinationCd; }
    /**
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm1() { return _columnDestinationNm1; }
    /**
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNm2() { return _columnDestinationNm2; }
    /**
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationNmKana() { return _columnDestinationNmKana; }
    /**
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationFax() { return _columnDestinationFax; }
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
        ls.add(columnShippingPlanHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnProcessTypeId());
        ls.add(columnInputType());
        ls.add(columnShippingDt());
        ls.add(columnWorkDt());
        ls.add(columnDelivPlanDt());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnClientShippingNo());
        ls.add(columnShippingSlipNo());
        ls.add(columnShippingStatus());
        ls.add(columnSupplyCustomerId());
        ls.add(columnSupplyCustomerCd());
        ls.add(columnSupplyCustomerNm());
        ls.add(columnDelivCustomerId());
        ls.add(columnDelivCustomerCd());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivAddress1());
        ls.add(columnDelivAddress2());
        ls.add(columnDelivAddress3());
        ls.add(columnDelivAddressSupply());
        ls.add(columnDelivTelNo());
        ls.add(columnDeliveryCourseId());
        ls.add(columnDeliveryCourseCd());
        ls.add(columnEmergencyFlg());
        ls.add(columnPickingWorkMessage());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnPickingBatchNo());
        ls.add(columnStockOutFlg());
        ls.add(columnAllocInstHId());
        ls.add(columnCod());
        ls.add(columnCodTax());
        ls.add(columnTotalPrice());
        ls.add(columnTotalTax());
        ls.add(columnSlipTypeCd());
        ls.add(columnSalesOrderSlipTypeCd());
        ls.add(columnDirectDeliveryTypeCd());
        ls.add(columnShippingTypeId());
        ls.add(columnShippingTypeCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnKoguchiDeliveryFlg());
        ls.add(columnKohaiContractorCd());
        ls.add(columnKohaiContractorNm());
        ls.add(columnShippingReasonCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnTenhanshaOrderNo());
        ls.add(columnDestinationCd());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnDestinationNmKana());
        ls.add(columnDestinationFax());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingPlanHId()); }
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
    /**
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingPlanBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingPlanHId(), TShippingPlanBDbm.getInstance().columnShippingPlanHId());
        return cri("T_SHIPPING_PLAN_B_FK1", "TShippingPlanBList", this, TShippingPlanBDbm.getInstance(), mp, false, "TShippingPlanH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingPlanH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingPlanHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingPlanHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingPlanH> getEntityType() { return TShippingPlanH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingPlanH newEntity() { return new TShippingPlanH(); }
    public TShippingPlanH newMyEntity() { return new TShippingPlanH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingPlanH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingPlanH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
