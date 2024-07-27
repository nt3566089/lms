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
 * The DB meta of e_transfer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ETransferDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ETransferDbm _instance = new ETransferDbm();
    private ETransferDbm() {}
    public static ETransferDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ETransfer)et).getTransferId(), (et, vl) -> ((ETransfer)et).setTransferId(ctl(vl)), "transferId");
        setupEpg(_epgMap, et -> ((ETransfer)et).getSendFlg(), (et, vl) -> ((ETransfer)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((ETransfer)et).getHinmokuCd(), (et, vl) -> ((ETransfer)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getStockTransferDt(), (et, vl) -> ((ETransfer)et).setStockTransferDt((String)vl), "stockTransferDt");
        setupEpg(_epgMap, et -> ((ETransfer)et).getReceivePlantCd(), (et, vl) -> ((ETransfer)et).setReceivePlantCd((String)vl), "receivePlantCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getReceiveStorageSpaceCd(), (et, vl) -> ((ETransfer)et).setReceiveStorageSpaceCd((String)vl), "receiveStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getShippingPlantCd(), (et, vl) -> ((ETransfer)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getShippingStorageSpaceCd(), (et, vl) -> ((ETransfer)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getTransferTypeCd(), (et, vl) -> ((ETransfer)et).setTransferTypeCd((String)vl), "transferTypeCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getNum(), (et, vl) -> ((ETransfer)et).setNum(ctb(vl)), "num");
        setupEpg(_epgMap, et -> ((ETransfer)et).getHinmokuGroup(), (et, vl) -> ((ETransfer)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((ETransfer)et).getJanCd(), (et, vl) -> ((ETransfer)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getProductNm(), (et, vl) -> ((ETransfer)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddYyyy(), (et, vl) -> ((ETransfer)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddMm(), (et, vl) -> ((ETransfer)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddDd(), (et, vl) -> ((ETransfer)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddHh(), (et, vl) -> ((ETransfer)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddMi(), (et, vl) -> ((ETransfer)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddSs(), (et, vl) -> ((ETransfer)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsAddUserCd(), (et, vl) -> ((ETransfer)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdYyyy(), (et, vl) -> ((ETransfer)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdMm(), (et, vl) -> ((ETransfer)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdDd(), (et, vl) -> ((ETransfer)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdHh(), (et, vl) -> ((ETransfer)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdMi(), (et, vl) -> ((ETransfer)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdSs(), (et, vl) -> ((ETransfer)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ETransfer)et).getWmsUpdUserCd(), (et, vl) -> ((ETransfer)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr01(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr02(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr03(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr04(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr04((String)vl), "dataTransferOnlyStr04");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr05(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr05((String)vl), "dataTransferOnlyStr05");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr06(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr06((String)vl), "dataTransferOnlyStr06");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr07(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr07((String)vl), "dataTransferOnlyStr07");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr08(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr08((String)vl), "dataTransferOnlyStr08");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDataTransferOnlyStr09(), (et, vl) -> ((ETransfer)et).setDataTransferOnlyStr09((String)vl), "dataTransferOnlyStr09");
        setupEpg(_epgMap, et -> ((ETransfer)et).getSpareStr(), (et, vl) -> ((ETransfer)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ETransfer)et).getDelFlg(), (et, vl) -> ((ETransfer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ETransfer)et).getVersionNo(), (et, vl) -> ((ETransfer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ETransfer)et).getControlNo(), (et, vl) -> ((ETransfer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ETransfer)et).getAddDt(), (et, vl) -> ((ETransfer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ETransfer)et).getAddUser(), (et, vl) -> ((ETransfer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ETransfer)et).getAddProcess(), (et, vl) -> ((ETransfer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ETransfer)et).getUpdDt(), (et, vl) -> ((ETransfer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ETransfer)et).getUpdUser(), (et, vl) -> ((ETransfer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ETransfer)et).getUpdProcess(), (et, vl) -> ((ETransfer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_transfer";
    protected final String _tableDispName = "e_transfer";
    protected final String _tablePropertyName = "ETransfer";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_transfer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTransferId = cci("TRANSFER_ID", "TRANSFER_ID", null, null, Long.class, "transferId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransferId() { return _columnTransferId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
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
        ls.add(columnTransferId());
        ls.add(columnSendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnTransferId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ETransfer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ETransferCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ETransferBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ETransfer> getEntityType() { return ETransfer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ETransfer newEntity() { return new ETransfer(); }
    public ETransfer newMyEntity() { return new ETransfer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ETransfer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ETransfer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
