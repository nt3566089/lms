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
 * The DB meta of es_inventory_inst. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EsInventoryInstDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EsInventoryInstDbm _instance = new EsInventoryInstDbm();
    private EsInventoryInstDbm() {}
    public static EsInventoryInstDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getInventoryInstId(), (et, vl) -> ((EsInventoryInst)et).setInventoryInstId(ctl(vl)), "inventoryInstId");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSendFlg(), (et, vl) -> ((EsInventoryInst)et).setSendFlg((String)vl), "sendFlg");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getInventorySlipNo(), (et, vl) -> ((EsInventoryInst)et).setInventorySlipNo((String)vl), "inventorySlipNo");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getInventorySlipRowNo(), (et, vl) -> ((EsInventoryInst)et).setInventorySlipRowNo((String)vl), "inventorySlipRowNo");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getPlantCd(), (et, vl) -> ((EsInventoryInst)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getStorageSpaceCd(), (et, vl) -> ((EsInventoryInst)et).setStorageSpaceCd((String)vl), "storageSpaceCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getReferenceDt(), (et, vl) -> ((EsInventoryInst)et).setReferenceDt((String)vl), "referenceDt");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getUnitNm(), (et, vl) -> ((EsInventoryInst)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddYyyy(), (et, vl) -> ((EsInventoryInst)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddMm(), (et, vl) -> ((EsInventoryInst)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddDd(), (et, vl) -> ((EsInventoryInst)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddHh(), (et, vl) -> ((EsInventoryInst)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddMi(), (et, vl) -> ((EsInventoryInst)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddSs(), (et, vl) -> ((EsInventoryInst)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapAddUserCd(), (et, vl) -> ((EsInventoryInst)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdYyyy(), (et, vl) -> ((EsInventoryInst)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdMm(), (et, vl) -> ((EsInventoryInst)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdDd(), (et, vl) -> ((EsInventoryInst)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdHh(), (et, vl) -> ((EsInventoryInst)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdMi(), (et, vl) -> ((EsInventoryInst)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdSs(), (et, vl) -> ((EsInventoryInst)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUpdUserCd(), (et, vl) -> ((EsInventoryInst)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getProductNmKanji(), (et, vl) -> ((EsInventoryInst)et).setProductNmKanji((String)vl), "productNmKanji");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getBarcode(), (et, vl) -> ((EsInventoryInst)et).setBarcode((String)vl), "barcode");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getDepositJanCd(), (et, vl) -> ((EsInventoryInst)et).setDepositJanCd((String)vl), "depositJanCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getTenhanshaCd(), (et, vl) -> ((EsInventoryInst)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getTenhanshaNm1(), (et, vl) -> ((EsInventoryInst)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getTenhanshaNm2(), (et, vl) -> ((EsInventoryInst)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUserCd(), (et, vl) -> ((EsInventoryInst)et).setSapUserCd((String)vl), "sapUserCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSapUserNm(), (et, vl) -> ((EsInventoryInst)et).setSapUserNm((String)vl), "sapUserNm");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getProductType(), (et, vl) -> ((EsInventoryInst)et).setProductType((String)vl), "productType");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getAllocTypeCd(), (et, vl) -> ((EsInventoryInst)et).setAllocTypeCd((String)vl), "allocTypeCd");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getSpareStr(), (et, vl) -> ((EsInventoryInst)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getDelFlg(), (et, vl) -> ((EsInventoryInst)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getVersionNo(), (et, vl) -> ((EsInventoryInst)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getControlNo(), (et, vl) -> ((EsInventoryInst)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getAddDt(), (et, vl) -> ((EsInventoryInst)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getAddUser(), (et, vl) -> ((EsInventoryInst)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getAddProcess(), (et, vl) -> ((EsInventoryInst)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getUpdDt(), (et, vl) -> ((EsInventoryInst)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getUpdUser(), (et, vl) -> ((EsInventoryInst)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EsInventoryInst)et).getUpdProcess(), (et, vl) -> ((EsInventoryInst)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "es_inventory_inst";
    protected final String _tableDispName = "es_inventory_inst";
    protected final String _tablePropertyName = "esInventoryInst";
    protected final TableSqlName _tableSqlName = new TableSqlName("es_inventory_inst", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryInstId = cci("INVENTORY_INST_ID", "INVENTORY_INST_ID", null, null, Long.class, "inventoryInstId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSendFlg = cci("SEND_FLG", "SEND_FLG", null, null, String.class, "sendFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorySlipNo = cci("INVENTORY_SLIP_NO", "INVENTORY_SLIP_NO", null, null, String.class, "inventorySlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventorySlipRowNo = cci("INVENTORY_SLIP_ROW_NO", "INVENTORY_SLIP_ROW_NO", null, null, String.class, "inventorySlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceCd = cci("STORAGE_SPACE_CD", "STORAGE_SPACE_CD", null, null, String.class, "storageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReferenceDt = cci("REFERENCE_DT", "REFERENCE_DT", null, null, String.class, "referenceDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserCd = cci("SAP_ADD_USER_CD", "SAP_ADD_USER_CD", null, null, String.class, "sapAddUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserCd = cci("SAP_UPD_USER_CD", "SAP_UPD_USER_CD", null, null, String.class, "sapUpdUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNmKanji = cci("PRODUCT_NM_KANJI", "PRODUCT_NM_KANJI", null, null, String.class, "productNmKanji", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBarcode = cci("BARCODE", "BARCODE", null, null, String.class, "barcode", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositJanCd = cci("DEPOSIT_JAN_CD", "DEPOSIT_JAN_CD", null, null, String.class, "depositJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserCd = cci("SAP_USER_CD", "SAP_USER_CD", null, null, String.class, "sapUserCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUserNm = cci("SAP_USER_NM", "SAP_USER_NM", null, null, String.class, "sapUserNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductType = cci("PRODUCT_TYPE", "PRODUCT_TYPE", null, null, String.class, "productType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAllocTypeCd = cci("ALLOC_TYPE_CD", "ALLOC_TYPE_CD", null, null, String.class, "allocTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * INVENTORY_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstId() { return _columnInventoryInstId; }
    /**
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSendFlg() { return _columnSendFlg; }
    /**
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventorySlipNo() { return _columnInventorySlipNo; }
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
     * REFERENCE_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReferenceDt() { return _columnReferenceDt; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddYyyy() { return _columnSapAddYyyy; }
    /**
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMm() { return _columnSapAddMm; }
    /**
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddDd() { return _columnSapAddDd; }
    /**
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddHh() { return _columnSapAddHh; }
    /**
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddMi() { return _columnSapAddMi; }
    /**
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddSs() { return _columnSapAddSs; }
    /**
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserCd() { return _columnSapAddUserCd; }
    /**
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdYyyy() { return _columnSapUpdYyyy; }
    /**
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMm() { return _columnSapUpdMm; }
    /**
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdDd() { return _columnSapUpdDd; }
    /**
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdHh() { return _columnSapUpdHh; }
    /**
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdMi() { return _columnSapUpdMi; }
    /**
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdSs() { return _columnSapUpdSs; }
    /**
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserCd() { return _columnSapUpdUserCd; }
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
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductType() { return _columnProductType; }
    /**
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAllocTypeCd() { return _columnAllocTypeCd; }
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
        ls.add(columnInventoryInstId());
        ls.add(columnSendFlg());
        ls.add(columnInventorySlipNo());
        ls.add(columnInventorySlipRowNo());
        ls.add(columnPlantCd());
        ls.add(columnStorageSpaceCd());
        ls.add(columnReferenceDt());
        ls.add(columnUnitNm());
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserCd());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserCd());
        ls.add(columnProductNmKanji());
        ls.add(columnBarcode());
        ls.add(columnDepositJanCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnSapUserCd());
        ls.add(columnSapUserNm());
        ls.add(columnProductType());
        ls.add(columnAllocTypeCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryInstId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EsInventoryInst"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EsInventoryInstCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EsInventoryInstBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EsInventoryInst> getEntityType() { return EsInventoryInst.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EsInventoryInst newEntity() { return new EsInventoryInst(); }
    public EsInventoryInst newMyEntity() { return new EsInventoryInst(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EsInventoryInst)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EsInventoryInst)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
