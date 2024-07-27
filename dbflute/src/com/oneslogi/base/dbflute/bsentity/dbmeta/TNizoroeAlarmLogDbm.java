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
 * The DB meta of t_nizoroe_alarm_log. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TNizoroeAlarmLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TNizoroeAlarmLogDbm _instance = new TNizoroeAlarmLogDbm();
    private TNizoroeAlarmLogDbm() {}
    public static TNizoroeAlarmLogDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getNizoroeAlarmLogId(), (et, vl) -> ((TNizoroeAlarmLog)et).setNizoroeAlarmLogId(ctl(vl)), "nizoroeAlarmLogId");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getNizoroeTypeCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setNizoroeTypeCd((String)vl), "nizoroeTypeCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getNizoroeProcUnit(), (et, vl) -> ((TNizoroeAlarmLog)et).setNizoroeProcUnit((String)vl), "nizoroeProcUnit");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getProcDt(), (et, vl) -> ((TNizoroeAlarmLog)et).setProcDt(cttp(vl)), "procDt");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getPrintFlg(), (et, vl) -> ((TNizoroeAlarmLog)et).setPrintFlg((String)vl), "printFlg");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getBaseCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getBaseNm(), (et, vl) -> ((TNizoroeAlarmLog)et).setBaseNm((String)vl), "baseNm");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getTypeCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setTypeCd((String)vl), "typeCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getAlarmTypeCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setAlarmTypeCd((String)vl), "alarmTypeCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getNizoroeNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getSalesOrderSlipNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setSalesOrderSlipNo((String)vl), "salesOrderSlipNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getShippingSlipNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getShippingSlipRowNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setShippingSlipRowNo((String)vl), "shippingSlipRowNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getProductId(), (et, vl) -> ((TNizoroeAlarmLog)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getProductCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getProductNm(), (et, vl) -> ((TNizoroeAlarmLog)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getSalesOrgId(), (et, vl) -> ((TNizoroeAlarmLog)et).setSalesOrgId(ctl(vl)), "salesOrgId");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getSalesOrgCd(), (et, vl) -> ((TNizoroeAlarmLog)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getSalesOrgNm1(), (et, vl) -> ((TNizoroeAlarmLog)et).setSalesOrgNm1((String)vl), "salesOrgNm1");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getSalesOrgNm2(), (et, vl) -> ((TNizoroeAlarmLog)et).setSalesOrgNm2((String)vl), "salesOrgNm2");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getDestinationNm1(), (et, vl) -> ((TNizoroeAlarmLog)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getDestinationNm2(), (et, vl) -> ((TNizoroeAlarmLog)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getStockOutNum(), (et, vl) -> ((TNizoroeAlarmLog)et).setStockOutNum(ctl(vl)), "stockOutNum");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getOutUserId(), (et, vl) -> ((TNizoroeAlarmLog)et).setOutUserId(ctl(vl)), "outUserId");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getOutDt(), (et, vl) -> ((TNizoroeAlarmLog)et).setOutDt(cttp(vl)), "outDt");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getDelFlg(), (et, vl) -> ((TNizoroeAlarmLog)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getVersionNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getControlNo(), (et, vl) -> ((TNizoroeAlarmLog)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getAddDt(), (et, vl) -> ((TNizoroeAlarmLog)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getAddUser(), (et, vl) -> ((TNizoroeAlarmLog)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getAddProcess(), (et, vl) -> ((TNizoroeAlarmLog)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getUpdDt(), (et, vl) -> ((TNizoroeAlarmLog)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getUpdUser(), (et, vl) -> ((TNizoroeAlarmLog)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TNizoroeAlarmLog)et).getUpdProcess(), (et, vl) -> ((TNizoroeAlarmLog)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TNizoroeAlarmLog)et).getMProduct(), (et, vl) -> ((TNizoroeAlarmLog)et).setMProduct((MProduct)vl), "MProduct");
        setupEfpg(_efpgMap, et -> ((TNizoroeAlarmLog)et).getBUser(), (et, vl) -> ((TNizoroeAlarmLog)et).setBUser((BUser)vl), "BUser");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_nizoroe_alarm_log";
    protected final String _tableDispName = "t_nizoroe_alarm_log";
    protected final String _tablePropertyName = "TNizoroeAlarmLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_nizoroe_alarm_log", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNizoroeAlarmLogId = cci("NIZOROE_ALARM_LOG_ID", "NIZOROE_ALARM_LOG_ID", null, null, Long.class, "nizoroeAlarmLogId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeTypeCd = cci("NIZOROE_TYPE_CD", "NIZOROE_TYPE_CD", null, null, String.class, "nizoroeTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeProcUnit = cci("NIZOROE_PROC_UNIT", "NIZOROE_PROC_UNIT", null, null, String.class, "nizoroeProcUnit", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcDt = cci("PROC_DT", "PROC_DT", null, null, java.sql.Timestamp.class, "procDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrintFlg = cci("PRINT_FLG", "PRINT_FLG", null, null, String.class, "printFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseNm = cci("BASE_NM", "BASE_NM", null, null, String.class, "baseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeCd = cci("TYPE_CD", "TYPE_CD", null, null, String.class, "typeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAlarmTypeCd = cci("ALARM_TYPE_CD", "ALARM_TYPE_CD", null, null, String.class, "alarmTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderSlipNo = cci("SALES_ORDER_SLIP_NO", "SALES_ORDER_SLIP_NO", null, null, String.class, "salesOrderSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipRowNo = cci("SHIPPING_SLIP_ROW_NO", "SHIPPING_SLIP_ROW_NO", null, null, String.class, "shippingSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MProduct", null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgId = cci("SALES_ORG_ID", "SALES_ORG_ID", null, null, Long.class, "salesOrgId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgNm1 = cci("SALES_ORG_NM1", "SALES_ORG_NM1", null, null, String.class, "salesOrgNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgNm2 = cci("SALES_ORG_NM2", "SALES_ORG_NM2", null, null, String.class, "salesOrgNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockOutNum = cci("STOCK_OUT_NUM", "STOCK_OUT_NUM", null, null, Long.class, "stockOutNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOutUserId = cci("OUT_USER_ID", "OUT_USER_ID", null, null, Long.class, "outUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnOutDt = cci("OUT_DT", "OUT_DT", null, null, java.sql.Timestamp.class, "outDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
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
     * NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeAlarmLogId() { return _columnNizoroeAlarmLogId; }
    /**
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeTypeCd() { return _columnNizoroeTypeCd; }
    /**
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeProcUnit() { return _columnNizoroeProcUnit; }
    /**
     * PROC_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcDt() { return _columnProcDt; }
    /**
     * PRINT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrintFlg() { return _columnPrintFlg; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * BASE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseNm() { return _columnBaseNm; }
    /**
     * TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeCd() { return _columnTypeCd; }
    /**
     * ALARM_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAlarmTypeCd() { return _columnAlarmTypeCd; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderSlipNo() { return _columnSalesOrderSlipNo; }
    /**
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipRowNo() { return _columnShippingSlipRowNo; }
    /**
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * SALES_ORG_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgId() { return _columnSalesOrgId; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * SALES_ORG_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgNm1() { return _columnSalesOrgNm1; }
    /**
     * SALES_ORG_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgNm2() { return _columnSalesOrgNm2; }
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
     * STOCK_OUT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockOutNum() { return _columnStockOutNum; }
    /**
     * OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutUserId() { return _columnOutUserId; }
    /**
     * OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOutDt() { return _columnOutDt; }
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
        ls.add(columnNizoroeAlarmLogId());
        ls.add(columnNizoroeTypeCd());
        ls.add(columnNizoroeProcUnit());
        ls.add(columnProcDt());
        ls.add(columnPrintFlg());
        ls.add(columnBaseCd());
        ls.add(columnBaseNm());
        ls.add(columnTypeCd());
        ls.add(columnAlarmTypeCd());
        ls.add(columnNizoroeNo());
        ls.add(columnSalesOrderSlipNo());
        ls.add(columnShippingSlipNo());
        ls.add(columnShippingSlipRowNo());
        ls.add(columnProductId());
        ls.add(columnProductCd());
        ls.add(columnProductNm());
        ls.add(columnSalesOrgId());
        ls.add(columnSalesOrgCd());
        ls.add(columnSalesOrgNm1());
        ls.add(columnSalesOrgNm2());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnStockOutNum());
        ls.add(columnOutUserId());
        ls.add(columnOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnNizoroeAlarmLogId()); }
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
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMProduct() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), MProductDbm.getInstance().columnProductId());
        return cfi("T_NIZOROE_ALARM_LOG_FK2", "MProduct", this, MProductDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TNizoroeAlarmLogList", false);
    }
    /**
     * b_user by my OUT_USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_NIZOROE_ALARM_LOG_FK1", "BUser", this, BUserDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TNizoroeAlarmLogList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TNizoroeAlarmLog"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TNizoroeAlarmLogCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TNizoroeAlarmLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TNizoroeAlarmLog> getEntityType() { return TNizoroeAlarmLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TNizoroeAlarmLog newEntity() { return new TNizoroeAlarmLog(); }
    public TNizoroeAlarmLog newMyEntity() { return new TNizoroeAlarmLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TNizoroeAlarmLog)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TNizoroeAlarmLog)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
