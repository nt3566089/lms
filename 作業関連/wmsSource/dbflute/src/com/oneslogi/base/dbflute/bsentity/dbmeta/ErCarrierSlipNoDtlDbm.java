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
 * The DB meta of er_carrier_slip_no_dtl. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErCarrierSlipNoDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErCarrierSlipNoDtlDbm _instance = new ErCarrierSlipNoDtlDbm();
    private ErCarrierSlipNoDtlDbm() {}
    public static ErCarrierSlipNoDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getCarrierSlipNoDtlId(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setCarrierSlipNoDtlId(ctl(vl)), "carrierSlipNoDtlId");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getReceiveCd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getReceiveRowId(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getImportFlg(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getErrorFlg(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getErrorMessageCd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getShippingSlipNo(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getCarrierSlipNo(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setCarrierSlipNo((String)vl), "carrierSlipNo");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getNizoroeNo(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getNizoroeNoSn(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setNizoroeNoSn((String)vl), "nizoroeNoSn");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getShippingDt(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getCarrierCd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getCarrierNm(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getPackingNum(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setPackingNum(ctl(vl)), "packingNum");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddYyyy(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddMm(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddDd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddHh(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddMi(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddSs(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsAddUserCd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdYyyy(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdMm(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdDd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdHh(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdMi(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdSs(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getWmsUpdUserCd(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getSpareStr(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getDelFlg(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getVersionNo(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getControlNo(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getAddDt(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getAddUser(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getAddProcess(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getUpdDt(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getUpdUser(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErCarrierSlipNoDtl)et).getUpdProcess(), (et, vl) -> ((ErCarrierSlipNoDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_carrier_slip_no_dtl";
    protected final String _tableDispName = "er_carrier_slip_no_dtl";
    protected final String _tablePropertyName = "erCarrierSlipNoDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_carrier_slip_no_dtl", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierSlipNoDtlId = cci("CARRIER_SLIP_NO_DTL_ID", "CARRIER_SLIP_NO_DTL_ID", null, null, Long.class, "carrierSlipNoDtlId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierSlipNo = cci("CARRIER_SLIP_NO", "CARRIER_SLIP_NO", null, null, String.class, "carrierSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNoSn = cci("NIZOROE_NO_SN", "NIZOROE_NO_SN", null, null, String.class, "nizoroeNoSn", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNum = cci("PACKING_NUM", "PACKING_NUM", null, null, Long.class, "packingNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddYyyy = cci("WMS_ADD_YYYY", "WMS_ADD_YYYY", null, null, String.class, "wmsAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddMm = cci("WMS_ADD_MM", "WMS_ADD_MM", null, null, String.class, "wmsAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddDd = cci("WMS_ADD_DD", "WMS_ADD_DD", null, null, String.class, "wmsAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddHh = cci("WMS_ADD_HH", "WMS_ADD_HH", null, null, String.class, "wmsAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddMi = cci("WMS_ADD_MI", "WMS_ADD_MI", null, null, String.class, "wmsAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddSs = cci("WMS_ADD_SS", "WMS_ADD_SS", null, null, String.class, "wmsAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddUserCd = cci("WMS_ADD_USER_CD", "WMS_ADD_USER_CD", null, null, String.class, "wmsAddUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdYyyy = cci("WMS_UPD_YYYY", "WMS_UPD_YYYY", null, null, String.class, "wmsUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdMm = cci("WMS_UPD_MM", "WMS_UPD_MM", null, null, String.class, "wmsUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdDd = cci("WMS_UPD_DD", "WMS_UPD_DD", null, null, String.class, "wmsUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdHh = cci("WMS_UPD_HH", "WMS_UPD_HH", null, null, String.class, "wmsUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdMi = cci("WMS_UPD_MI", "WMS_UPD_MI", null, null, String.class, "wmsUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdSs = cci("WMS_UPD_SS", "WMS_UPD_SS", null, null, String.class, "wmsUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdUserCd = cci("WMS_UPD_USER_CD", "WMS_UPD_USER_CD", null, null, String.class, "wmsUpdUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CARRIER_SLIP_NO_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipNoDtlId() { return _columnCarrierSlipNoDtlId; }
    /**
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveCd() { return _columnReceiveCd; }
    /**
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveRowId() { return _columnReceiveRowId; }
    /**
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorFlg() { return _columnErrorFlg; }
    /**
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipNo() { return _columnCarrierSlipNo; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * NIZOROE_NO_SN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNoSn() { return _columnNizoroeNoSn; }
    /**
     * SHIPPING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * PACKING_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNum() { return _columnPackingNum; }
    /**
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddYyyy() { return _columnWmsAddYyyy; }
    /**
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddMm() { return _columnWmsAddMm; }
    /**
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddDd() { return _columnWmsAddDd; }
    /**
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddHh() { return _columnWmsAddHh; }
    /**
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddMi() { return _columnWmsAddMi; }
    /**
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddSs() { return _columnWmsAddSs; }
    /**
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddUserCd() { return _columnWmsAddUserCd; }
    /**
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdYyyy() { return _columnWmsUpdYyyy; }
    /**
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdMm() { return _columnWmsUpdMm; }
    /**
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdDd() { return _columnWmsUpdDd; }
    /**
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdHh() { return _columnWmsUpdHh; }
    /**
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdMi() { return _columnWmsUpdMi; }
    /**
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdSs() { return _columnWmsUpdSs; }
    /**
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdUserCd() { return _columnWmsUpdUserCd; }
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
        ls.add(columnCarrierSlipNoDtlId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnShippingSlipNo());
        ls.add(columnCarrierSlipNo());
        ls.add(columnNizoroeNo());
        ls.add(columnNizoroeNoSn());
        ls.add(columnShippingDt());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnPackingNum());
        ls.add(columnWmsAddYyyy());
        ls.add(columnWmsAddMm());
        ls.add(columnWmsAddDd());
        ls.add(columnWmsAddHh());
        ls.add(columnWmsAddMi());
        ls.add(columnWmsAddSs());
        ls.add(columnWmsAddUserCd());
        ls.add(columnWmsUpdYyyy());
        ls.add(columnWmsUpdMm());
        ls.add(columnWmsUpdDd());
        ls.add(columnWmsUpdHh());
        ls.add(columnWmsUpdMi());
        ls.add(columnWmsUpdSs());
        ls.add(columnWmsUpdUserCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierSlipNoDtlId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErCarrierSlipNoDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErCarrierSlipNoDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErCarrierSlipNoDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErCarrierSlipNoDtl> getEntityType() { return ErCarrierSlipNoDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErCarrierSlipNoDtl newEntity() { return new ErCarrierSlipNoDtl(); }
    public ErCarrierSlipNoDtl newMyEntity() { return new ErCarrierSlipNoDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErCarrierSlipNoDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErCarrierSlipNoDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
