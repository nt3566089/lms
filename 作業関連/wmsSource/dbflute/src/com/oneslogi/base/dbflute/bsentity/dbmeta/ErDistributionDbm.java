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
 * The DB meta of er_distribution. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErDistributionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErDistributionDbm _instance = new ErDistributionDbm();
    private ErDistributionDbm() {}
    public static ErDistributionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErDistribution)et).getDistributionId(), (et, vl) -> ((ErDistribution)et).setDistributionId(ctl(vl)), "distributionId");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getReceiveCd(), (et, vl) -> ((ErDistribution)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getReceiveRowId(), (et, vl) -> ((ErDistribution)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getErrorFlg(), (et, vl) -> ((ErDistribution)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getErrorMessageCd(), (et, vl) -> ((ErDistribution)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getImportFlg(), (et, vl) -> ((ErDistribution)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getStoreSlipNo(), (et, vl) -> ((ErDistribution)et).setStoreSlipNo((String)vl), "storeSlipNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getStoreSlipRowNo(), (et, vl) -> ((ErDistribution)et).setStoreSlipRowNo((String)vl), "storeSlipRowNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getStoreReasonCd(), (et, vl) -> ((ErDistribution)et).setStoreReasonCd((String)vl), "storeReasonCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getShippingSlipNo(), (et, vl) -> ((ErDistribution)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getShippingSlipRowNo(), (et, vl) -> ((ErDistribution)et).setShippingSlipRowNo((String)vl), "shippingSlipRowNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getShippingReasonCd(), (et, vl) -> ((ErDistribution)et).setShippingReasonCd((String)vl), "shippingReasonCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getStorePlantCd(), (et, vl) -> ((ErDistribution)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getStoreStorageSpaceCd(), (et, vl) -> ((ErDistribution)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getShippingPlantCd(), (et, vl) -> ((ErDistribution)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getShippingStorageSpaceCd(), (et, vl) -> ((ErDistribution)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getHinmokuCd(), (et, vl) -> ((ErDistribution)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getHinmokuText(), (et, vl) -> ((ErDistribution)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getJanCd(), (et, vl) -> ((ErDistribution)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getNum(), (et, vl) -> ((ErDistribution)et).setNum((String)vl), "num");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddYyyy(), (et, vl) -> ((ErDistribution)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddMm(), (et, vl) -> ((ErDistribution)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddDd(), (et, vl) -> ((ErDistribution)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddHh(), (et, vl) -> ((ErDistribution)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddMi(), (et, vl) -> ((ErDistribution)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddSs(), (et, vl) -> ((ErDistribution)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsAddUserCd(), (et, vl) -> ((ErDistribution)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdYyyy(), (et, vl) -> ((ErDistribution)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdMm(), (et, vl) -> ((ErDistribution)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdDd(), (et, vl) -> ((ErDistribution)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdHh(), (et, vl) -> ((ErDistribution)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdMi(), (et, vl) -> ((ErDistribution)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdSs(), (et, vl) -> ((ErDistribution)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getWmsUpdUserCd(), (et, vl) -> ((ErDistribution)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getSpareStr(), (et, vl) -> ((ErDistribution)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getDelFlg(), (et, vl) -> ((ErDistribution)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getVersionNo(), (et, vl) -> ((ErDistribution)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getControlNo(), (et, vl) -> ((ErDistribution)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getAddDt(), (et, vl) -> ((ErDistribution)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getAddUser(), (et, vl) -> ((ErDistribution)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getAddProcess(), (et, vl) -> ((ErDistribution)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getUpdDt(), (et, vl) -> ((ErDistribution)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getUpdUser(), (et, vl) -> ((ErDistribution)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErDistribution)et).getUpdProcess(), (et, vl) -> ((ErDistribution)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_distribution";
    protected final String _tableDispName = "er_distribution";
    protected final String _tablePropertyName = "erDistribution";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_distribution", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDistributionId = cci("DISTRIBUTION_ID", "DISTRIBUTION_ID", null, null, Long.class, "distributionId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipNo = cci("STORE_SLIP_NO", "STORE_SLIP_NO", null, null, String.class, "storeSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipRowNo = cci("STORE_SLIP_ROW_NO", "STORE_SLIP_ROW_NO", null, null, String.class, "storeSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreReasonCd = cci("STORE_REASON_CD", "STORE_REASON_CD", null, null, String.class, "storeReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipRowNo = cci("SHIPPING_SLIP_ROW_NO", "SHIPPING_SLIP_ROW_NO", null, null, String.class, "shippingSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingReasonCd = cci("SHIPPING_REASON_CD", "SHIPPING_REASON_CD", null, null, String.class, "shippingReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, String.class, "num", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * DISTRIBUTION_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDistributionId() { return _columnDistributionId; }
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
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImportFlg() { return _columnImportFlg; }
    /**
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreSlipNo() { return _columnStoreSlipNo; }
    /**
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreSlipRowNo() { return _columnStoreSlipRowNo; }
    /**
     * STORE_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreReasonCd() { return _columnStoreReasonCd; }
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
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingReasonCd() { return _columnShippingReasonCd; }
    /**
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
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
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuText() { return _columnHinmokuText; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
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
        ls.add(columnDistributionId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnImportFlg());
        ls.add(columnStoreSlipNo());
        ls.add(columnStoreSlipRowNo());
        ls.add(columnStoreReasonCd());
        ls.add(columnShippingSlipNo());
        ls.add(columnShippingSlipRowNo());
        ls.add(columnShippingReasonCd());
        ls.add(columnStorePlantCd());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnNum());
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
    protected UniqueInfo cpui() { return hpcpui(columnDistributionId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErDistribution"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErDistributionCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErDistributionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErDistribution> getEntityType() { return ErDistribution.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErDistribution newEntity() { return new ErDistribution(); }
    public ErDistribution newMyEntity() { return new ErDistribution(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErDistribution)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErDistribution)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
