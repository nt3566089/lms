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
 * The DB meta of SqlTagLabelYamato. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SqlTagLabelYamatoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SqlTagLabelYamatoDbm _instance = new SqlTagLabelYamatoDbm();
    private SqlTagLabelYamatoDbm() {}
    public static SqlTagLabelYamatoDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getArrivalStoreCd(), (et, vl) -> ((SqlTagLabelYamato)et).setArrivalStoreCd((String)vl), "arrivalStoreCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivTelNo(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivTelNo((String)vl), "delivTelNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivZipCd(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivZipCd((String)vl), "delivZipCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivAddress(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivAddress((String)vl), "delivAddress");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivCustomerNm(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivCustomerNm((String)vl), "delivCustomerNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientTelNo(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientTelNo((String)vl), "slipClientTelNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientZipCd(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientZipCd((String)vl), "slipClientZipCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientAddress(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientAddress((String)vl), "slipClientAddress");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientNm(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientNm((String)vl), "slipClientNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getCarrierTraceNum(), (et, vl) -> ((SqlTagLabelYamato)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getWorkDt(), (et, vl) -> ((SqlTagLabelYamato)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivDt(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivDt((String)vl), "delivDt");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivTz(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivTz((String)vl), "delivTz");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipItemNm(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipItemNm((String)vl), "slipItemNm");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getBoxNo(), (et, vl) -> ((SqlTagLabelYamato)et).setBoxNo((String)vl), "boxNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getBoxNoSum(), (et, vl) -> ((SqlTagLabelYamato)et).setBoxNoSum((String)vl), "boxNoSum");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getArticle(), (et, vl) -> ((SqlTagLabelYamato)et).setArticle((String)vl), "article");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getBoxSizeCd(), (et, vl) -> ((SqlTagLabelYamato)et).setBoxSizeCd((String)vl), "boxSizeCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSendCd(), (et, vl) -> ((SqlTagLabelYamato)et).setSendCd((String)vl), "sendCd");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getNizoroeNo(), (et, vl) -> ((SqlTagLabelYamato)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getTrackingNo(), (et, vl) -> ((SqlTagLabelYamato)et).setTrackingNo((String)vl), "trackingNo");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivTelNoH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivTelNoH((String)vl), "delivTelNoH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivZipCdH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivZipCdH((String)vl), "delivZipCdH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivAddressH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivAddressH((String)vl), "delivAddressH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivCustomerNmH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivCustomerNmH((String)vl), "delivCustomerNmH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientTelNoH(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientTelNoH((String)vl), "slipClientTelNoH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientZipCdH(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientZipCdH((String)vl), "slipClientZipCdH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientAddressH(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientAddressH((String)vl), "slipClientAddressH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipClientNmH(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipClientNmH((String)vl), "slipClientNmH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getCarrierTraceNumH(), (et, vl) -> ((SqlTagLabelYamato)et).setCarrierTraceNumH((String)vl), "carrierTraceNumH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getWorkDtH(), (et, vl) -> ((SqlTagLabelYamato)et).setWorkDtH((String)vl), "workDtH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivDtH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivDtH((String)vl), "delivDtH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDelivTzH(), (et, vl) -> ((SqlTagLabelYamato)et).setDelivTzH((String)vl), "delivTzH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSlipItemNmH(), (et, vl) -> ((SqlTagLabelYamato)et).setSlipItemNmH((String)vl), "slipItemNmH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getArticleH(), (et, vl) -> ((SqlTagLabelYamato)et).setArticleH((String)vl), "articleH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getSendCdH(), (et, vl) -> ((SqlTagLabelYamato)et).setSendCdH((String)vl), "sendCdH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getTrackingNoH(), (et, vl) -> ((SqlTagLabelYamato)et).setTrackingNoH((String)vl), "trackingNoH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getBoxNoH(), (et, vl) -> ((SqlTagLabelYamato)et).setBoxNoH((String)vl), "boxNoH");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getBoxNoHSum(), (et, vl) -> ((SqlTagLabelYamato)et).setBoxNoHSum((String)vl), "boxNoHSum");
        setupEpg(_epgMap, et -> ((SqlTagLabelYamato)et).getDeliveryCourseNm(), (et, vl) -> ((SqlTagLabelYamato)et).setDeliveryCourseNm((String)vl), "deliveryCourseNm");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SqlTagLabelYamato";
    protected final String _tableDispName = "SqlTagLabelYamato";
    protected final String _tablePropertyName = "sqlTagLabelYamato";
    protected final TableSqlName _tableSqlName = new TableSqlName("SqlTagLabelYamato", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnArrivalStoreCd = cci("ARRIVAL_STORE_CD", "ARRIVAL_STORE_CD", null, null, String.class, "arrivalStoreCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNo = cci("DELIV_TEL_NO", "DELIV_TEL_NO", null, null, String.class, "delivTelNo", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCd = cci("DELIV_ZIP_CD", "DELIV_ZIP_CD", null, null, String.class, "delivZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddress = cci("DELIV_ADDRESS", "DELIV_ADDRESS", null, null, String.class, "delivAddress", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNm = cci("DELIV_CUSTOMER_NM", "DELIV_CUSTOMER_NM", null, null, String.class, "delivCustomerNm", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientTelNo = cci("SLIP_CLIENT_TEL_NO", "SLIP_CLIENT_TEL_NO", null, null, String.class, "slipClientTelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientZipCd = cci("SLIP_CLIENT_ZIP_CD", "SLIP_CLIENT_ZIP_CD", null, null, String.class, "slipClientZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddress = cci("SLIP_CLIENT_ADDRESS", "SLIP_CLIENT_ADDRESS", null, null, String.class, "slipClientAddress", null, false, false, false, "VARCHAR", 240, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNm = cci("SLIP_CLIENT_NM", "SLIP_CLIENT_NM", null, null, String.class, "slipClientNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDt = cci("DELIV_DT", "DELIV_DT", null, null, String.class, "delivDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTz = cci("DELIV_TZ", "DELIV_TZ", null, null, String.class, "delivTz", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNm = cci("SLIP_ITEM_NM", "SLIP_ITEM_NM", null, null, String.class, "slipItemNm", null, false, false, false, "VARCHAR", 180, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNo = cci("BOX_NO", "BOX_NO", null, null, String.class, "boxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNoSum = cci("BOX_NO_SUM", "BOX_NO_SUM", null, null, String.class, "boxNoSum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticle = cci("ARTICLE", "ARTICLE", null, null, String.class, "article", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxSizeCd = cci("BOX_SIZE_CD", "BOX_SIZE_CD", null, null, String.class, "boxSizeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCd = cci("SEND_CD", "SEND_CD", null, null, String.class, "sendCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingNo = cci("TRACKING_NO", "TRACKING_NO", null, null, String.class, "trackingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTelNoH = cci("DELIV_TEL_NO_H", "DELIV_TEL_NO_H", null, null, String.class, "delivTelNoH", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivZipCdH = cci("DELIV_ZIP_CD_H", "DELIV_ZIP_CD_H", null, null, String.class, "delivZipCdH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivAddressH = cci("DELIV_ADDRESS_H", "DELIV_ADDRESS_H", null, null, String.class, "delivAddressH", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCustomerNmH = cci("DELIV_CUSTOMER_NM_H", "DELIV_CUSTOMER_NM_H", null, null, String.class, "delivCustomerNmH", null, false, false, false, "VARCHAR", 510, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientTelNoH = cci("SLIP_CLIENT_TEL_NO_H", "SLIP_CLIENT_TEL_NO_H", null, null, String.class, "slipClientTelNoH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientZipCdH = cci("SLIP_CLIENT_ZIP_CD_H", "SLIP_CLIENT_ZIP_CD_H", null, null, String.class, "slipClientZipCdH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientAddressH = cci("SLIP_CLIENT_ADDRESS_H", "SLIP_CLIENT_ADDRESS_H", null, null, String.class, "slipClientAddressH", null, false, false, false, "VARCHAR", 240, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipClientNmH = cci("SLIP_CLIENT_NM_H", "SLIP_CLIENT_NM_H", null, null, String.class, "slipClientNmH", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNumH = cci("CARRIER_TRACE_NUM_H", "CARRIER_TRACE_NUM_H", null, null, String.class, "carrierTraceNumH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDtH = cci("WORK_DT_H", "WORK_DT_H", null, null, String.class, "workDtH", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivDtH = cci("DELIV_DT_H", "DELIV_DT_H", null, null, String.class, "delivDtH", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivTzH = cci("DELIV_TZ_H", "DELIV_TZ_H", null, null, String.class, "delivTzH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipItemNmH = cci("SLIP_ITEM_NM_H", "SLIP_ITEM_NM_H", null, null, String.class, "slipItemNmH", null, false, false, false, "VARCHAR", 180, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnArticleH = cci("ARTICLE_H", "ARTICLE_H", null, null, String.class, "articleH", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendCdH = cci("SEND_CD_H", "SEND_CD_H", null, null, String.class, "sendCdH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTrackingNoH = cci("TRACKING_NO_H", "TRACKING_NO_H", null, null, String.class, "trackingNoH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNoH = cci("BOX_NO_H", "BOX_NO_H", null, null, String.class, "boxNoH", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBoxNoHSum = cci("BOX_NO_H_SUM", "BOX_NO_H_SUM", null, null, String.class, "boxNoHSum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseNm = cci("DELIVERY_COURSE_NM", "DELIVERY_COURSE_NM", null, null, String.class, "deliveryCourseNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);

    /**
     * ARRIVAL_STORE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArrivalStoreCd() { return _columnArrivalStoreCd; }
    /**
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNo() { return _columnDelivTelNo; }
    /**
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCd() { return _columnDelivZipCd; }
    /**
     * DELIV_ADDRESS: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddress() { return _columnDelivAddress; }
    /**
     * DELIV_CUSTOMER_NM: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNm() { return _columnDelivCustomerNm; }
    /**
     * SLIP_CLIENT_TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientTelNo() { return _columnSlipClientTelNo; }
    /**
     * SLIP_CLIENT_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientZipCd() { return _columnSlipClientZipCd; }
    /**
     * SLIP_CLIENT_ADDRESS: {VARCHAR(240)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddress() { return _columnSlipClientAddress; }
    /**
     * SLIP_CLIENT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNm() { return _columnSlipClientNm; }
    /**
     * CARRIER_TRACE_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * WORK_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
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
     * SLIP_ITEM_NM: {VARCHAR(180)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNm() { return _columnSlipItemNm; }
    /**
     * BOX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNo() { return _columnBoxNo; }
    /**
     * BOX_NO_SUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNoSum() { return _columnBoxNoSum; }
    /**
     * ARTICLE: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticle() { return _columnArticle; }
    /**
     * BOX_SIZE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxSizeCd() { return _columnBoxSizeCd; }
    /**
     * SEND_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCd() { return _columnSendCd; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * TRACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNo() { return _columnTrackingNo; }
    /**
     * DELIV_TEL_NO_H: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTelNoH() { return _columnDelivTelNoH; }
    /**
     * DELIV_ZIP_CD_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivZipCdH() { return _columnDelivZipCdH; }
    /**
     * DELIV_ADDRESS_H: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivAddressH() { return _columnDelivAddressH; }
    /**
     * DELIV_CUSTOMER_NM_H: {VARCHAR(510)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCustomerNmH() { return _columnDelivCustomerNmH; }
    /**
     * SLIP_CLIENT_TEL_NO_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientTelNoH() { return _columnSlipClientTelNoH; }
    /**
     * SLIP_CLIENT_ZIP_CD_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientZipCdH() { return _columnSlipClientZipCdH; }
    /**
     * SLIP_CLIENT_ADDRESS_H: {VARCHAR(240)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientAddressH() { return _columnSlipClientAddressH; }
    /**
     * SLIP_CLIENT_NM_H: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipClientNmH() { return _columnSlipClientNmH; }
    /**
     * CARRIER_TRACE_NUM_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNumH() { return _columnCarrierTraceNumH; }
    /**
     * WORK_DT_H: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDtH() { return _columnWorkDtH; }
    /**
     * DELIV_DT_H: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivDtH() { return _columnDelivDtH; }
    /**
     * DELIV_TZ_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivTzH() { return _columnDelivTzH; }
    /**
     * SLIP_ITEM_NM_H: {VARCHAR(180)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipItemNmH() { return _columnSlipItemNmH; }
    /**
     * ARTICLE_H: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnArticleH() { return _columnArticleH; }
    /**
     * SEND_CD_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendCdH() { return _columnSendCdH; }
    /**
     * TRACKING_NO_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTrackingNoH() { return _columnTrackingNoH; }
    /**
     * BOX_NO_H: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNoH() { return _columnBoxNoH; }
    /**
     * BOX_NO_H_SUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBoxNoHSum() { return _columnBoxNoHSum; }
    /**
     * DELIVERY_COURSE_NM: {VARCHAR(60), refers to m_delivery_course.DELIVERY_COURSE_NM}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseNm() { return _columnDeliveryCourseNm; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnArrivalStoreCd());
        ls.add(columnDelivTelNo());
        ls.add(columnDelivZipCd());
        ls.add(columnDelivAddress());
        ls.add(columnDelivCustomerNm());
        ls.add(columnSlipClientTelNo());
        ls.add(columnSlipClientZipCd());
        ls.add(columnSlipClientAddress());
        ls.add(columnSlipClientNm());
        ls.add(columnCarrierTraceNum());
        ls.add(columnWorkDt());
        ls.add(columnDelivDt());
        ls.add(columnDelivTz());
        ls.add(columnSlipItemNm());
        ls.add(columnBoxNo());
        ls.add(columnBoxNoSum());
        ls.add(columnArticle());
        ls.add(columnBoxSizeCd());
        ls.add(columnSendCd());
        ls.add(columnNizoroeNo());
        ls.add(columnTrackingNo());
        ls.add(columnDelivTelNoH());
        ls.add(columnDelivZipCdH());
        ls.add(columnDelivAddressH());
        ls.add(columnDelivCustomerNmH());
        ls.add(columnSlipClientTelNoH());
        ls.add(columnSlipClientZipCdH());
        ls.add(columnSlipClientAddressH());
        ls.add(columnSlipClientNmH());
        ls.add(columnCarrierTraceNumH());
        ls.add(columnWorkDtH());
        ls.add(columnDelivDtH());
        ls.add(columnDelivTzH());
        ls.add(columnSlipItemNmH());
        ls.add(columnArticleH());
        ls.add(columnSendCdH());
        ls.add(columnTrackingNoH());
        ls.add(columnBoxNoH());
        ls.add(columnBoxNoHSum());
        ls.add(columnDeliveryCourseNm());
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.customize.SqlTagLabelYamato"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SqlTagLabelYamato> getEntityType() { return SqlTagLabelYamato.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SqlTagLabelYamato newEntity() { return new SqlTagLabelYamato(); }
    public SqlTagLabelYamato newMyEntity() { return new SqlTagLabelYamato(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SqlTagLabelYamato)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SqlTagLabelYamato)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
