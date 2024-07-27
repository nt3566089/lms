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
 * The DB meta of e_store_record. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EStoreRecordDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EStoreRecordDbm _instance = new EStoreRecordDbm();
    private EStoreRecordDbm() {}
    public static EStoreRecordDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreRecordId(), (et, vl) -> ((EStoreRecord)et).setStoreRecordId(ctl(vl)), "storeRecordId");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSendFlg(), (et, vl) -> ((EStoreRecord)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreSlipNo(), (et, vl) -> ((EStoreRecord)et).setStoreSlipNo((String)vl), "storeSlipNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreSlipRowNo(), (et, vl) -> ((EStoreRecord)et).setStoreSlipRowNo((String)vl), "storeSlipRowNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSlipTypeCd(), (et, vl) -> ((EStoreRecord)et).setSlipTypeCd((String)vl), "slipTypeCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSn(), (et, vl) -> ((EStoreRecord)et).setSn(ctl(vl)), "sn");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getIfNo(), (et, vl) -> ((EStoreRecord)et).setIfNo((String)vl), "ifNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getHinmokuCd(), (et, vl) -> ((EStoreRecord)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getJanCd(), (et, vl) -> ((EStoreRecord)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreReasonCd(), (et, vl) -> ((EStoreRecord)et).setStoreReasonCd((String)vl), "storeReasonCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreDt(), (et, vl) -> ((EStoreRecord)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getNum(), (et, vl) -> ((EStoreRecord)et).setNum(ctb(vl)), "num");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getLotManagTypeCd(), (et, vl) -> ((EStoreRecord)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getLot(), (et, vl) -> ((EStoreRecord)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getReceiveNo(), (et, vl) -> ((EStoreRecord)et).setReceiveNo((String)vl), "receiveNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getShippingPlantCd(), (et, vl) -> ((EStoreRecord)et).setShippingPlantCd((String)vl), "shippingPlantCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getShippingStorageSpaceCd(), (et, vl) -> ((EStoreRecord)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStorePlantCd(), (et, vl) -> ((EStoreRecord)et).setStorePlantCd((String)vl), "storePlantCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getStoreStorageSpaceCd(), (et, vl) -> ((EStoreRecord)et).setStoreStorageSpaceCd((String)vl), "storeStorageSpaceCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getTenhanshaCd(), (et, vl) -> ((EStoreRecord)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSalesOrgCd(), (et, vl) -> ((EStoreRecord)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSanshaDeliverySlipNo1(), (et, vl) -> ((EStoreRecord)et).setSanshaDeliverySlipNo1((String)vl), "sanshaDeliverySlipNo1");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getDataTypeCd(), (et, vl) -> ((EStoreRecord)et).setDataTypeCd((String)vl), "dataTypeCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getProcessTypeCd(), (et, vl) -> ((EStoreRecord)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSlipNo(), (et, vl) -> ((EStoreRecord)et).setSlipNo((String)vl), "slipNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddYyyy(), (et, vl) -> ((EStoreRecord)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddMm(), (et, vl) -> ((EStoreRecord)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddDd(), (et, vl) -> ((EStoreRecord)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddHh(), (et, vl) -> ((EStoreRecord)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddMi(), (et, vl) -> ((EStoreRecord)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddSs(), (et, vl) -> ((EStoreRecord)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsAddUserNm(), (et, vl) -> ((EStoreRecord)et).setWmsAddUserNm((String)vl), "wmsAddUserNm");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdYyyy(), (et, vl) -> ((EStoreRecord)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdMm(), (et, vl) -> ((EStoreRecord)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdDd(), (et, vl) -> ((EStoreRecord)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdHh(), (et, vl) -> ((EStoreRecord)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdMi(), (et, vl) -> ((EStoreRecord)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdSs(), (et, vl) -> ((EStoreRecord)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getWmsUpdUserNm(), (et, vl) -> ((EStoreRecord)et).setWmsUpdUserNm((String)vl), "wmsUpdUserNm");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getDataTransferOnlyStr01(), (et, vl) -> ((EStoreRecord)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getSpareStr(), (et, vl) -> ((EStoreRecord)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getDelFlg(), (et, vl) -> ((EStoreRecord)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getVersionNo(), (et, vl) -> ((EStoreRecord)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getControlNo(), (et, vl) -> ((EStoreRecord)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getAddDt(), (et, vl) -> ((EStoreRecord)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getAddUser(), (et, vl) -> ((EStoreRecord)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getAddProcess(), (et, vl) -> ((EStoreRecord)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getUpdDt(), (et, vl) -> ((EStoreRecord)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getUpdUser(), (et, vl) -> ((EStoreRecord)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EStoreRecord)et).getUpdProcess(), (et, vl) -> ((EStoreRecord)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_store_record";
    protected final String _tableDispName = "e_store_record";
    protected final String _tablePropertyName = "EStoreRecord";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_store_record", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordId = cci("STORE_RECORD_ID", "STORE_RECORD_ID", null, null, Long.class, "storeRecordId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipNo = cci("STORE_SLIP_NO", "STORE_SLIP_NO", null, null, String.class, "storeSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreSlipRowNo = cci("STORE_SLIP_ROW_NO", "STORE_SLIP_ROW_NO", null, null, String.class, "storeSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipTypeCd = cci("SLIP_TYPE_CD", "SLIP_TYPE_CD", null, null, String.class, "slipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSn = cci("SN", "SN", null, null, Long.class, "sn", null, false, false, false, "BIGINT", 19, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIfNo = cci("IF_NO", "IF_NO", null, null, String.class, "ifNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreReasonCd = cci("STORE_REASON_CD", "STORE_REASON_CD", null, null, String.class, "storeReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, java.math.BigDecimal.class, "num", null, false, false, false, "DECIMAL", 14, 4, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveNo = cci("RECEIVE_NO", "RECEIVE_NO", null, null, String.class, "receiveNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPlantCd = cci("SHIPPING_PLANT_CD", "SHIPPING_PLANT_CD", null, null, String.class, "shippingPlantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorePlantCd = cci("STORE_PLANT_CD", "STORE_PLANT_CD", null, null, String.class, "storePlantCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreStorageSpaceCd = cci("STORE_STORAGE_SPACE_CD", "STORE_STORAGE_SPACE_CD", null, null, String.class, "storeStorageSpaceCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSanshaDeliverySlipNo1 = cci("SANSHA_DELIVERY_SLIP_NO1", "SANSHA_DELIVERY_SLIP_NO1", null, null, String.class, "sanshaDeliverySlipNo1", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTypeCd = cci("DATA_TYPE_CD", "DATA_TYPE_CD", null, null, String.class, "dataTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("SLIP_NO", "SLIP_NO", null, null, String.class, "slipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddYyyy = cci("WMS_ADD_YYYY", "WMS_ADD_YYYY", null, null, String.class, "wmsAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddMm = cci("WMS_ADD_MM", "WMS_ADD_MM", null, null, String.class, "wmsAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddDd = cci("WMS_ADD_DD", "WMS_ADD_DD", null, null, String.class, "wmsAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddHh = cci("WMS_ADD_HH", "WMS_ADD_HH", null, null, String.class, "wmsAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddMi = cci("WMS_ADD_MI", "WMS_ADD_MI", null, null, String.class, "wmsAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddSs = cci("WMS_ADD_SS", "WMS_ADD_SS", null, null, String.class, "wmsAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsAddUserNm = cci("WMS_ADD_USER_NM", "WMS_ADD_USER_NM", null, null, String.class, "wmsAddUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdYyyy = cci("WMS_UPD_YYYY", "WMS_UPD_YYYY", null, null, String.class, "wmsUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdMm = cci("WMS_UPD_MM", "WMS_UPD_MM", null, null, String.class, "wmsUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdDd = cci("WMS_UPD_DD", "WMS_UPD_DD", null, null, String.class, "wmsUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdHh = cci("WMS_UPD_HH", "WMS_UPD_HH", null, null, String.class, "wmsUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdMi = cci("WMS_UPD_MI", "WMS_UPD_MI", null, null, String.class, "wmsUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdSs = cci("WMS_UPD_SS", "WMS_UPD_SS", null, null, String.class, "wmsUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWmsUpdUserNm = cci("WMS_UPD_USER_NM", "WMS_UPD_USER_NM", null, null, String.class, "wmsUpdUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr01 = cci("DATA_TRANSFER_ONLY_STR01", "DATA_TRANSFER_ONLY_STR01", null, null, String.class, "dataTransferOnlyStr01", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * STORE_RECORD_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordId() { return _columnStoreRecordId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
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
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipTypeCd() { return _columnSlipTypeCd; }
    /**
     * SN: {BIGINT(19), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSn() { return _columnSn; }
    /**
     * IF_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIfNo() { return _columnIfNo; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJanCd() { return _columnJanCd; }
    /**
     * STORE_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreReasonCd() { return _columnStoreReasonCd; }
    /**
     * STORE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * NUM: {DECIMAL(14, 4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLotManagTypeCd() { return _columnLotManagTypeCd; }
    /**
     * LOT: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * RECEIVE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveNo() { return _columnReceiveNo; }
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
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorePlantCd() { return _columnStorePlantCd; }
    /**
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreStorageSpaceCd() { return _columnStoreStorageSpaceCd; }
    /**
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaCd() { return _columnTenhanshaCd; }
    /**
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSanshaDeliverySlipNo1() { return _columnSanshaDeliverySlipNo1; }
    /**
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTypeCd() { return _columnDataTypeCd; }
    /**
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessTypeCd() { return _columnProcessTypeCd; }
    /**
     * SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipNo() { return _columnSlipNo; }
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
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsAddUserNm() { return _columnWmsAddUserNm; }
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
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWmsUpdUserNm() { return _columnWmsUpdUserNm; }
    /**
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr01() { return _columnDataTransferOnlyStr01; }
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
        ls.add(columnStoreRecordId());
        ls.add(columnSendFlg());
        ls.add(columnStoreSlipNo());
        ls.add(columnStoreSlipRowNo());
        ls.add(columnSlipTypeCd());
        ls.add(columnSn());
        ls.add(columnIfNo());
        ls.add(columnHinmokuCd());
        ls.add(columnJanCd());
        ls.add(columnStoreReasonCd());
        ls.add(columnStoreDt());
        ls.add(columnNum());
        ls.add(columnLotManagTypeCd());
        ls.add(columnLot());
        ls.add(columnReceiveNo());
        ls.add(columnShippingPlantCd());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnStorePlantCd());
        ls.add(columnStoreStorageSpaceCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnSanshaDeliverySlipNo1());
        ls.add(columnDataTypeCd());
        ls.add(columnProcessTypeCd());
        ls.add(columnSlipNo());
        ls.add(columnWmsAddYyyy());
        ls.add(columnWmsAddMm());
        ls.add(columnWmsAddDd());
        ls.add(columnWmsAddHh());
        ls.add(columnWmsAddMi());
        ls.add(columnWmsAddSs());
        ls.add(columnWmsAddUserNm());
        ls.add(columnWmsUpdYyyy());
        ls.add(columnWmsUpdMm());
        ls.add(columnWmsUpdDd());
        ls.add(columnWmsUpdHh());
        ls.add(columnWmsUpdMi());
        ls.add(columnWmsUpdSs());
        ls.add(columnWmsUpdUserNm());
        ls.add(columnDataTransferOnlyStr01());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EStoreRecord"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EStoreRecordCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EStoreRecordBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EStoreRecord> getEntityType() { return EStoreRecord.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EStoreRecord newEntity() { return new EStoreRecord(); }
    public EStoreRecord newMyEntity() { return new EStoreRecord(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EStoreRecord)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EStoreRecord)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
