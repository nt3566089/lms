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
 * The DB meta of er_transfer_report. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErTransferReportDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErTransferReportDbm _instance = new ErTransferReportDbm();
    private ErTransferReportDbm() {}
    public static ErTransferReportDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getTransferReportId(), (et, vl) -> ((ErTransferReport)et).setTransferReportId(ctl(vl)), "transferReportId");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getReceiveCd(), (et, vl) -> ((ErTransferReport)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getReceiveRowId(), (et, vl) -> ((ErTransferReport)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getImportFlg(), (et, vl) -> ((ErTransferReport)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getErrorFlg(), (et, vl) -> ((ErTransferReport)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getErrorMessageCd(), (et, vl) -> ((ErTransferReport)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getHinmokuCd(), (et, vl) -> ((ErTransferReport)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getStockTransferDt(), (et, vl) -> ((ErTransferReport)et).setStockTransferDt((String)vl), "stockTransferDt");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getReceivePlantCd(), (et, vl) -> ((ErTransferReport)et).setReceivePlantCd((String)vl), "receivePlantCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getReceiveStorageSpaceCd(), (et, vl) -> ((ErTransferReport)et).setReceiveStorageSpaceCd((String)vl), "receiveStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getShippingPlantCd(), (et, vl) -> ((ErTransferReport)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getShippingStorageSpaceCd(), (et, vl) -> ((ErTransferReport)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getTransferTypeCd(), (et, vl) -> ((ErTransferReport)et).setTransferTypeCd((String)vl), "transferTypeCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getNum(), (et, vl) -> ((ErTransferReport)et).setNum(ctb(vl)), "num");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getHinmokuGroup(), (et, vl) -> ((ErTransferReport)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getJanCd(), (et, vl) -> ((ErTransferReport)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getProductNm(), (et, vl) -> ((ErTransferReport)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getS4SendFlg(), (et, vl) -> ((ErTransferReport)et).setS4SendFlg((String)vl), "s4SendFlg");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddYyyy(), (et, vl) -> ((ErTransferReport)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddMm(), (et, vl) -> ((ErTransferReport)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddDd(), (et, vl) -> ((ErTransferReport)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddHh(), (et, vl) -> ((ErTransferReport)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddMi(), (et, vl) -> ((ErTransferReport)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddSs(), (et, vl) -> ((ErTransferReport)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsAddUserCd(), (et, vl) -> ((ErTransferReport)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdYyyy(), (et, vl) -> ((ErTransferReport)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdMm(), (et, vl) -> ((ErTransferReport)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdDd(), (et, vl) -> ((ErTransferReport)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdHh(), (et, vl) -> ((ErTransferReport)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdMi(), (et, vl) -> ((ErTransferReport)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdSs(), (et, vl) -> ((ErTransferReport)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getWmsUpdUserCd(), (et, vl) -> ((ErTransferReport)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr01(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr02(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr03(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr04(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr04((String)vl), "dataTransferOnlyStr04");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr05(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr05((String)vl), "dataTransferOnlyStr05");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr06(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr06((String)vl), "dataTransferOnlyStr06");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr07(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr07((String)vl), "dataTransferOnlyStr07");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr08(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr08((String)vl), "dataTransferOnlyStr08");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDataTransferOnlyStr09(), (et, vl) -> ((ErTransferReport)et).setDataTransferOnlyStr09((String)vl), "dataTransferOnlyStr09");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getSpareStr(), (et, vl) -> ((ErTransferReport)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getDelFlg(), (et, vl) -> ((ErTransferReport)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getVersionNo(), (et, vl) -> ((ErTransferReport)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getControlNo(), (et, vl) -> ((ErTransferReport)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getAddDt(), (et, vl) -> ((ErTransferReport)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getAddUser(), (et, vl) -> ((ErTransferReport)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getAddProcess(), (et, vl) -> ((ErTransferReport)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getUpdDt(), (et, vl) -> ((ErTransferReport)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getUpdUser(), (et, vl) -> ((ErTransferReport)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErTransferReport)et).getUpdProcess(), (et, vl) -> ((ErTransferReport)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_transfer_report";
    protected final String _tableDispName = "er_transfer_report";
    protected final String _tablePropertyName = "erTransferReport";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_transfer_report", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTransferReportId = cci("TRANSFER_REPORT_ID", "TRANSFER_REPORT_ID", null, null, Long.class, "transferReportId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockTransferDt = cci("STOCK_TRANSFER_DT", "STOCK_TRANSFER_DT", null, null, String.class, "stockTransferDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlantCd = cci("RECEIVE_PLANT_CD", "RECEIVE_PLANT_CD", null, null, String.class, "receivePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveStorageSpaceCd = cci("RECEIVE_STORAGE_SPACE_CD", "RECEIVE_STORAGE_SPACE_CD", null, null, String.class, "receiveStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransferTypeCd = cci("TRANSFER_TYPE_CD", "TRANSFER_TYPE_CD", null, null, String.class, "transferTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, java.math.BigDecimal.class, "num", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS4SendFlg = cci("S4_SEND_FLG", "S4_SEND_FLG", null, null, String.class, "s4SendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnDataTransferOnlyStr01 = cci("DATA_TRANSFER_ONLY_STR01", "DATA_TRANSFER_ONLY_STR01", null, null, String.class, "dataTransferOnlyStr01", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr02 = cci("DATA_TRANSFER_ONLY_STR02", "DATA_TRANSFER_ONLY_STR02", null, null, String.class, "dataTransferOnlyStr02", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr03 = cci("DATA_TRANSFER_ONLY_STR03", "DATA_TRANSFER_ONLY_STR03", null, null, String.class, "dataTransferOnlyStr03", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr04 = cci("DATA_TRANSFER_ONLY_STR04", "DATA_TRANSFER_ONLY_STR04", null, null, String.class, "dataTransferOnlyStr04", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr05 = cci("DATA_TRANSFER_ONLY_STR05", "DATA_TRANSFER_ONLY_STR05", null, null, String.class, "dataTransferOnlyStr05", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr06 = cci("DATA_TRANSFER_ONLY_STR06", "DATA_TRANSFER_ONLY_STR06", null, null, String.class, "dataTransferOnlyStr06", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr07 = cci("DATA_TRANSFER_ONLY_STR07", "DATA_TRANSFER_ONLY_STR07", null, null, String.class, "dataTransferOnlyStr07", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr08 = cci("DATA_TRANSFER_ONLY_STR08", "DATA_TRANSFER_ONLY_STR08", null, null, String.class, "dataTransferOnlyStr08", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr09 = cci("DATA_TRANSFER_ONLY_STR09", "DATA_TRANSFER_ONLY_STR09", null, null, String.class, "dataTransferOnlyStr09", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransferReportId() { return _columnTransferReportId; }
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
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnErrorMessageCd() { return _columnErrorMessageCd; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockTransferDt() { return _columnStockTransferDt; }
    /**
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlantCd() { return _columnReceivePlantCd; }
    /**
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveStorageSpaceCd() { return _columnReceiveStorageSpaceCd; }
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
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransferTypeCd() { return _columnTransferTypeCd; }
    /**
     * NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * S4_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS4SendFlg() { return _columnS4SendFlg; }
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
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr01() { return _columnDataTransferOnlyStr01; }
    /**
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr02() { return _columnDataTransferOnlyStr02; }
    /**
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr03() { return _columnDataTransferOnlyStr03; }
    /**
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr04() { return _columnDataTransferOnlyStr04; }
    /**
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr05() { return _columnDataTransferOnlyStr05; }
    /**
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr06() { return _columnDataTransferOnlyStr06; }
    /**
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr07() { return _columnDataTransferOnlyStr07; }
    /**
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr08() { return _columnDataTransferOnlyStr08; }
    /**
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr09() { return _columnDataTransferOnlyStr09; }
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
        ls.add(columnTransferReportId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnHinmokuCd());
        ls.add(columnStockTransferDt());
        ls.add(columnReceivePlantCd());
        ls.add(columnReceiveStorageSpaceCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnTransferTypeCd());
        ls.add(columnNum());
        ls.add(columnHinmokuGroup());
        ls.add(columnJanCd());
        ls.add(columnProductNm());
        ls.add(columnS4SendFlg());
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
        ls.add(columnDataTransferOnlyStr01());
        ls.add(columnDataTransferOnlyStr02());
        ls.add(columnDataTransferOnlyStr03());
        ls.add(columnDataTransferOnlyStr04());
        ls.add(columnDataTransferOnlyStr05());
        ls.add(columnDataTransferOnlyStr06());
        ls.add(columnDataTransferOnlyStr07());
        ls.add(columnDataTransferOnlyStr08());
        ls.add(columnDataTransferOnlyStr09());
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
    protected UniqueInfo cpui() { return hpcpui(columnTransferReportId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErTransferReport"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErTransferReportCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErTransferReportBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErTransferReport> getEntityType() { return ErTransferReport.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErTransferReport newEntity() { return new ErTransferReport(); }
    public ErTransferReport newMyEntity() { return new ErTransferReport(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErTransferReport)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErTransferReport)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
