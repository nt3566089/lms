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
 * The DB meta of t_shipping_inst_h_print. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstHPrintDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingInstHPrintDbm _instance = new TShippingInstHPrintDbm();
    private TShippingInstHPrintDbm() {}
    public static TShippingInstHPrintDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingInstHPrintId(), (et, vl) -> ((TShippingInstHPrint)et).setShippingInstHPrintId(ctl(vl)), "shippingInstHPrintId");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingInstHId(), (et, vl) -> ((TShippingInstHPrint)et).setShippingInstHId(ctl(vl)), "shippingInstHId");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSalesOrderNo(), (et, vl) -> ((TShippingInstHPrint)et).setSalesOrderNo((String)vl), "salesOrderNo");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSalesOrderSlipTypeCd(), (et, vl) -> ((TShippingInstHPrint)et).setSalesOrderSlipTypeCd((String)vl), "salesOrderSlipTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSalesOrderSlipNo(), (et, vl) -> ((TShippingInstHPrint)et).setSalesOrderSlipNo((String)vl), "salesOrderSlipNo");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingReason(), (et, vl) -> ((TShippingInstHPrint)et).setShippingReason((String)vl), "shippingReason");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getLogiAttentionTypeCd(), (et, vl) -> ((TShippingInstHPrint)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getLogiSpecialTypeCd(), (et, vl) -> ((TShippingInstHPrint)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getKoguchiDeliveryFlg(), (et, vl) -> ((TShippingInstHPrint)et).setKoguchiDeliveryFlg((String)vl), "koguchiDeliveryFlg");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingDt(), (et, vl) -> ((TShippingInstHPrint)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSpecifyDeliveryDt(), (et, vl) -> ((TShippingInstHPrint)et).setSpecifyDeliveryDt((String)vl), "specifyDeliveryDt");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSpecifyDeliveryTime(), (et, vl) -> ((TShippingInstHPrint)et).setSpecifyDeliveryTime((String)vl), "specifyDeliveryTime");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getTenhanshaId(), (et, vl) -> ((TShippingInstHPrint)et).setTenhanshaId(ctl(vl)), "tenhanshaId");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getTenhanshaOrderNo(), (et, vl) -> ((TShippingInstHPrint)et).setTenhanshaOrderNo((String)vl), "tenhanshaOrderNo");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getContractorNm(), (et, vl) -> ((TShippingInstHPrint)et).setContractorNm((String)vl), "contractorNm");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationCd(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationCd((String)vl), "destinationCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationNm1(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationNm2(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationZipCd(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationZipCd((String)vl), "destinationZipCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationAddress1(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationAddress1((String)vl), "destinationAddress1");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationAddress2(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationAddress2((String)vl), "destinationAddress2");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDestinationTel(), (et, vl) -> ((TShippingInstHPrint)et).setDestinationTel((String)vl), "destinationTel");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingPlantCd(), (et, vl) -> ((TShippingInstHPrint)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getShippingStorageSpaceCd(), (et, vl) -> ((TShippingInstHPrint)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDealTypeCd(), (et, vl) -> ((TShippingInstHPrint)et).setDealTypeCd((String)vl), "dealTypeCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getCustomerCd(), (et, vl) -> ((TShippingInstHPrint)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getCustomerNm(), (et, vl) -> ((TShippingInstHPrint)et).setCustomerNm((String)vl), "customerNm");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getSpareStr(), (et, vl) -> ((TShippingInstHPrint)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getDelFlg(), (et, vl) -> ((TShippingInstHPrint)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getVersionNo(), (et, vl) -> ((TShippingInstHPrint)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getControlNo(), (et, vl) -> ((TShippingInstHPrint)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getAddDt(), (et, vl) -> ((TShippingInstHPrint)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getAddUser(), (et, vl) -> ((TShippingInstHPrint)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getAddProcess(), (et, vl) -> ((TShippingInstHPrint)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getUpdDt(), (et, vl) -> ((TShippingInstHPrint)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getUpdUser(), (et, vl) -> ((TShippingInstHPrint)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingInstHPrint)et).getUpdProcess(), (et, vl) -> ((TShippingInstHPrint)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShippingInstHPrint)et).getTShippingInstH(), (et, vl) -> ((TShippingInstHPrint)et).setTShippingInstH((TShippingInstH)vl), "TShippingInstH");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_inst_h_print";
    protected final String _tableDispName = "t_shipping_inst_h_print";
    protected final String _tablePropertyName = "TShippingInstHPrint";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_inst_h_print", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingInstHPrintId = cci("SHIPPING_INST_H_PRINT_ID", "SHIPPING_INST_H_PRINT_ID", null, null, Long.class, "shippingInstHPrintId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingInstHId = cci("SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", null, null, Long.class, "shippingInstHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TShippingInstH", null, null, false);
    protected final ColumnInfo _columnSalesOrderNo = cci("SALES_ORDER_NO", "SALES_ORDER_NO", null, null, String.class, "salesOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipTypeCd = cci("SALES_ORDER_SLIP_TYPE_CD", "SALES_ORDER_SLIP_TYPE_CD", null, null, String.class, "salesOrderSlipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipNo = cci("SALES_ORDER_SLIP_NO", "SALES_ORDER_SLIP_NO", null, null, String.class, "salesOrderSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingReason = cci("SHIPPING_REASON", "SHIPPING_REASON", null, null, String.class, "shippingReason", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnKoguchiDeliveryFlg = cci("KOGUCHI_DELIVERY_FLG", "KOGUCHI_DELIVERY_FLG", null, null, String.class, "koguchiDeliveryFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecifyDeliveryDt = cci("SPECIFY_DELIVERY_DT", "SPECIFY_DELIVERY_DT", null, null, String.class, "specifyDeliveryDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpecifyDeliveryTime = cci("SPECIFY_DELIVERY_TIME", "SPECIFY_DELIVERY_TIME", null, null, String.class, "specifyDeliveryTime", null, false, false, false, "VARCHAR", 6, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaId = cci("TENHANSHA_ID", "TENHANSHA_ID", null, null, Long.class, "tenhanshaId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaOrderNo = cci("TENHANSHA_ORDER_NO", "TENHANSHA_ORDER_NO", null, null, String.class, "tenhanshaOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnContractorNm = cci("CONTRACTOR_NM", "CONTRACTOR_NM", null, null, String.class, "contractorNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationCd = cci("DESTINATION_CD", "DESTINATION_CD", null, null, String.class, "destinationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationZipCd = cci("DESTINATION_ZIP_CD", "DESTINATION_ZIP_CD", null, null, String.class, "destinationZipCd", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress1 = cci("DESTINATION_ADDRESS1", "DESTINATION_ADDRESS1", null, null, String.class, "destinationAddress1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress2 = cci("DESTINATION_ADDRESS2", "DESTINATION_ADDRESS2", null, null, String.class, "destinationAddress2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationTel = cci("DESTINATION_TEL", "DESTINATION_TEL", null, null, String.class, "destinationTel", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDealTypeCd = cci("DEAL_TYPE_CD", "DEAL_TYPE_CD", null, null, String.class, "dealTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerNm = cci("CUSTOMER_NM", "CUSTOMER_NM", null, null, String.class, "customerNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHPrintId() { return _columnShippingInstHPrintId; }
    /**
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingInstHId() { return _columnShippingInstHId; }
    /**
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderNo() { return _columnSalesOrderNo; }
    /**
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipTypeCd() { return _columnSalesOrderSlipTypeCd; }
    /**
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipNo() { return _columnSalesOrderSlipNo; }
    /**
     * SHIPPING_REASON: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingReason() { return _columnShippingReason; }
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
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnKoguchiDeliveryFlg() { return _columnKoguchiDeliveryFlg; }
    /**
     * SHIPPING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecifyDeliveryDt() { return _columnSpecifyDeliveryDt; }
    /**
     * SPECIFY_DELIVERY_TIME: {VARCHAR(6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpecifyDeliveryTime() { return _columnSpecifyDeliveryTime; }
    /**
     * TENHANSHA_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaId() { return _columnTenhanshaId; }
    /**
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaOrderNo() { return _columnTenhanshaOrderNo; }
    /**
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnContractorNm() { return _columnContractorNm; }
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
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationZipCd() { return _columnDestinationZipCd; }
    /**
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress1() { return _columnDestinationAddress1; }
    /**
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress2() { return _columnDestinationAddress2; }
    /**
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationTel() { return _columnDestinationTel; }
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
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDealTypeCd() { return _columnDealTypeCd; }
    /**
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerNm() { return _columnCustomerNm; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
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
        ls.add(columnShippingInstHPrintId());
        ls.add(columnShippingInstHId());
        ls.add(columnSalesOrderNo());
        ls.add(columnSalesOrderSlipTypeCd());
        ls.add(columnSalesOrderSlipNo());
        ls.add(columnShippingReason());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnKoguchiDeliveryFlg());
        ls.add(columnShippingDt());
        ls.add(columnSpecifyDeliveryDt());
        ls.add(columnSpecifyDeliveryTime());
        ls.add(columnTenhanshaId());
        ls.add(columnTenhanshaOrderNo());
        ls.add(columnContractorNm());
        ls.add(columnDestinationCd());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnDestinationZipCd());
        ls.add(columnDestinationAddress1());
        ls.add(columnDestinationAddress2());
        ls.add(columnDestinationTel());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnDealTypeCd());
        ls.add(columnCustomerCd());
        ls.add(columnCustomerNm());
        ls.add(columnSpareStr());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingInstHPrintId()); }
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
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTShippingInstH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingInstHId(), TShippingInstHDbm.getInstance().columnShippingInstHId());
        return cfi("T_SHIPPING_INST_H_PRINT_FK1", "TShippingInstH", this, TShippingInstHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TShippingInstHPrintList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingInstHPrint"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingInstHPrintCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingInstHPrintBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingInstHPrint> getEntityType() { return TShippingInstHPrint.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingInstHPrint newEntity() { return new TShippingInstHPrint(); }
    public TShippingInstHPrint newMyEntity() { return new TShippingInstHPrint(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingInstHPrint)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingInstHPrint)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
