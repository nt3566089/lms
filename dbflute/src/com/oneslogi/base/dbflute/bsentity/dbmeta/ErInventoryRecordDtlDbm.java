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
 * The DB meta of er_inventory_record_dtl. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErInventoryRecordDtlDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErInventoryRecordDtlDbm _instance = new ErInventoryRecordDtlDbm();
    private ErInventoryRecordDtlDbm() {}
    public static ErInventoryRecordDtlDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getInventoryRecordDtlId(), (et, vl) -> ((ErInventoryRecordDtl)et).setInventoryRecordDtlId(ctl(vl)), "inventoryRecordDtlId");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getReceiveCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getReceiveRowId(), (et, vl) -> ((ErInventoryRecordDtl)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getImportFlg(), (et, vl) -> ((ErInventoryRecordDtl)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getErrorFlg(), (et, vl) -> ((ErInventoryRecordDtl)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getErrorMessageCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getInventorySlipNo(), (et, vl) -> ((ErInventoryRecordDtl)et).setInventorySlipNo((String)vl), "inventorySlipNo");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getFiscalYear(), (et, vl) -> ((ErInventoryRecordDtl)et).setFiscalYear((String)vl), "fiscalYear");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getInventorySlipRowNo(), (et, vl) -> ((ErInventoryRecordDtl)et).setInventorySlipRowNo((String)vl), "inventorySlipRowNo");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getPlantCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getStorageSpaceCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setStorageSpaceCd((String)vl), "storageSpaceCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getReferenceDt(), (et, vl) -> ((ErInventoryRecordDtl)et).setReferenceDt((String)vl), "referenceDt");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getHinmokuCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getStockNum(), (et, vl) -> ((ErInventoryRecordDtl)et).setStockNum(ctb(vl)), "stockNum");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getProductNmKanji(), (et, vl) -> ((ErInventoryRecordDtl)et).setProductNmKanji((String)vl), "productNmKanji");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getBarcode(), (et, vl) -> ((ErInventoryRecordDtl)et).setBarcode((String)vl), "barcode");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getDepositJanCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setDepositJanCd((String)vl), "depositJanCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getTenhanshaCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getSalesOrgCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getTenhanshaNm1(), (et, vl) -> ((ErInventoryRecordDtl)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getTenhanshaNm2(), (et, vl) -> ((ErInventoryRecordDtl)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getSapUserCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setSapUserCd((String)vl), "sapUserCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getSapUserNm(), (et, vl) -> ((ErInventoryRecordDtl)et).setSapUserNm((String)vl), "sapUserNm");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getAllocTypeCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setAllocTypeCd((String)vl), "allocTypeCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getS4SendFlg(), (et, vl) -> ((ErInventoryRecordDtl)et).setS4SendFlg((String)vl), "s4SendFlg");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddYyyy(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddMm(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddDd(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddHh(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddMi(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddSs(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsAddUserCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdYyyy(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdMm(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdDd(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdHh(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdMi(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdSs(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getWmsUpdUserCd(), (et, vl) -> ((ErInventoryRecordDtl)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getSpareStr(), (et, vl) -> ((ErInventoryRecordDtl)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getDelFlg(), (et, vl) -> ((ErInventoryRecordDtl)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getVersionNo(), (et, vl) -> ((ErInventoryRecordDtl)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getControlNo(), (et, vl) -> ((ErInventoryRecordDtl)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getAddDt(), (et, vl) -> ((ErInventoryRecordDtl)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getAddUser(), (et, vl) -> ((ErInventoryRecordDtl)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getAddProcess(), (et, vl) -> ((ErInventoryRecordDtl)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getUpdDt(), (et, vl) -> ((ErInventoryRecordDtl)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getUpdUser(), (et, vl) -> ((ErInventoryRecordDtl)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErInventoryRecordDtl)et).getUpdProcess(), (et, vl) -> ((ErInventoryRecordDtl)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_inventory_record_dtl";
    protected final String _tableDispName = "er_inventory_record_dtl";
    protected final String _tablePropertyName = "erInventoryRecordDtl";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_inventory_record_dtl", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryRecordDtlId = cci("INVENTORY_RECORD_DTL_ID", "INVENTORY_RECORD_DTL_ID", null, null, Long.class, "inventoryRecordDtlId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorySlipNo = cci("INVENTORY_SLIP_NO", "INVENTORY_SLIP_NO", null, null, String.class, "inventorySlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFiscalYear = cci("FISCAL_YEAR", "FISCAL_YEAR", null, null, String.class, "fiscalYear", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorySlipRowNo = cci("INVENTORY_SLIP_ROW_NO", "INVENTORY_SLIP_ROW_NO", null, null, String.class, "inventorySlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceCd = cci("STORAGE_SPACE_CD", "STORAGE_SPACE_CD", null, null, String.class, "storageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferenceDt = cci("REFERENCE_DT", "REFERENCE_DT", null, null, String.class, "referenceDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockNum = cci("STOCK_NUM", "STOCK_NUM", null, null, java.math.BigDecimal.class, "stockNum", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNmKanji = cci("PRODUCT_NM_KANJI", "PRODUCT_NM_KANJI", null, null, String.class, "productNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcode = cci("BARCODE", "BARCODE", null, null, String.class, "barcode", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositJanCd = cci("DEPOSIT_JAN_CD", "DEPOSIT_JAN_CD", null, null, String.class, "depositJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserCd = cci("SAP_USER_CD", "SAP_USER_CD", null, null, String.class, "sapUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserNm = cci("SAP_USER_NM", "SAP_USER_NM", null, null, String.class, "sapUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocTypeCd = cci("ALLOC_TYPE_CD", "ALLOC_TYPE_CD", null, null, String.class, "allocTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * INVENTORY_RECORD_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryRecordDtlId() { return _columnInventoryRecordDtlId; }
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
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventorySlipNo() { return _columnInventorySlipNo; }
    /**
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFiscalYear() { return _columnFiscalYear; }
    /**
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventorySlipRowNo() { return _columnInventorySlipRowNo; }
    /**
     * PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantCd() { return _columnPlantCd; }
    /**
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageSpaceCd() { return _columnStorageSpaceCd; }
    /**
     * REFERENCE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferenceDt() { return _columnReferenceDt; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockNum() { return _columnStockNum; }
    /**
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNmKanji() { return _columnProductNmKanji; }
    /**
     * BARCODE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBarcode() { return _columnBarcode; }
    /**
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositJanCd() { return _columnDepositJanCd; }
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
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm1() { return _columnTenhanshaNm1; }
    /**
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaNm2() { return _columnTenhanshaNm2; }
    /**
     * SAP_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUserCd() { return _columnSapUserCd; }
    /**
     * SAP_USER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUserNm() { return _columnSapUserNm; }
    /**
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocTypeCd() { return _columnAllocTypeCd; }
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
        ls.add(columnInventoryRecordDtlId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnInventorySlipNo());
        ls.add(columnFiscalYear());
        ls.add(columnInventorySlipRowNo());
        ls.add(columnPlantCd());
        ls.add(columnStorageSpaceCd());
        ls.add(columnReferenceDt());
        ls.add(columnHinmokuCd());
        ls.add(columnStockNum());
        ls.add(columnProductNmKanji());
        ls.add(columnBarcode());
        ls.add(columnDepositJanCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnSapUserCd());
        ls.add(columnSapUserNm());
        ls.add(columnAllocTypeCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryRecordDtlId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErInventoryRecordDtl"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErInventoryRecordDtlCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErInventoryRecordDtlBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErInventoryRecordDtl> getEntityType() { return ErInventoryRecordDtl.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErInventoryRecordDtl newEntity() { return new ErInventoryRecordDtl(); }
    public ErInventoryRecordDtl newMyEntity() { return new ErInventoryRecordDtl(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErInventoryRecordDtl)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErInventoryRecordDtl)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}