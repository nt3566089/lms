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
 * The DB meta of er_sales_org. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErSalesOrgDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErSalesOrgDbm _instance = new ErSalesOrgDbm();
    private ErSalesOrgDbm() {}
    public static ErSalesOrgDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSalesOrgId(), (et, vl) -> ((ErSalesOrg)et).setSalesOrgId(ctl(vl)), "salesOrgId");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getReceiveCd(), (et, vl) -> ((ErSalesOrg)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getReceiveRowId(), (et, vl) -> ((ErSalesOrg)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getImportFlg(), (et, vl) -> ((ErSalesOrg)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getErrorFlg(), (et, vl) -> ((ErSalesOrg)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getErrorMessageCd(), (et, vl) -> ((ErSalesOrg)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSalesOrgCd(), (et, vl) -> ((ErSalesOrg)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getPurchaseOrgCd(), (et, vl) -> ((ErSalesOrg)et).setPurchaseOrgCd((String)vl), "purchaseOrgCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaCd(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaNm1(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaNm1((String)vl), "tenhanshaNm1");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaNm2(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaNm2((String)vl), "tenhanshaNm2");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaZipCd(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaZipCd((String)vl), "tenhanshaZipCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaPrefecture(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaPrefecture((String)vl), "tenhanshaPrefecture");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaAddress1(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaAddress1((String)vl), "tenhanshaAddress1");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaAddress2(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaAddress2((String)vl), "tenhanshaAddress2");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaTelNo(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaTelNo((String)vl), "tenhanshaTelNo");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getTenhanshaFaxNo(), (et, vl) -> ((ErSalesOrg)et).setTenhanshaFaxNo((String)vl), "tenhanshaFaxNo");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getPlantNormal(), (et, vl) -> ((ErSalesOrg)et).setPlantNormal((String)vl), "plantNormal");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getPlantDeposit(), (et, vl) -> ((ErSalesOrg)et).setPlantDeposit((String)vl), "plantDeposit");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddYyyy(), (et, vl) -> ((ErSalesOrg)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddMm(), (et, vl) -> ((ErSalesOrg)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddDd(), (et, vl) -> ((ErSalesOrg)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddHh(), (et, vl) -> ((ErSalesOrg)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddMi(), (et, vl) -> ((ErSalesOrg)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddSs(), (et, vl) -> ((ErSalesOrg)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapAddUserCd(), (et, vl) -> ((ErSalesOrg)et).setSapAddUserCd((String)vl), "sapAddUserCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdYyyy(), (et, vl) -> ((ErSalesOrg)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdMm(), (et, vl) -> ((ErSalesOrg)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdDd(), (et, vl) -> ((ErSalesOrg)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdHh(), (et, vl) -> ((ErSalesOrg)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdMi(), (et, vl) -> ((ErSalesOrg)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdSs(), (et, vl) -> ((ErSalesOrg)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSapUpdUserCd(), (et, vl) -> ((ErSalesOrg)et).setSapUpdUserCd((String)vl), "sapUpdUserCd");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getSpareStr(), (et, vl) -> ((ErSalesOrg)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getDelFlg(), (et, vl) -> ((ErSalesOrg)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getVersionNo(), (et, vl) -> ((ErSalesOrg)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getControlNo(), (et, vl) -> ((ErSalesOrg)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getAddDt(), (et, vl) -> ((ErSalesOrg)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getAddUser(), (et, vl) -> ((ErSalesOrg)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getAddProcess(), (et, vl) -> ((ErSalesOrg)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getUpdDt(), (et, vl) -> ((ErSalesOrg)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getUpdUser(), (et, vl) -> ((ErSalesOrg)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErSalesOrg)et).getUpdProcess(), (et, vl) -> ((ErSalesOrg)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_sales_org";
    protected final String _tableDispName = "er_sales_org";
    protected final String _tablePropertyName = "erSalesOrg";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_sales_org", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSalesOrgId = cci("SALES_ORG_ID", "SALES_ORG_ID", null, null, Long.class, "salesOrgId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPurchaseOrgCd = cci("PURCHASE_ORG_CD", "PURCHASE_ORG_CD", null, null, String.class, "purchaseOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm1 = cci("TENHANSHA_NM1", "TENHANSHA_NM1", null, null, String.class, "tenhanshaNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaNm2 = cci("TENHANSHA_NM2", "TENHANSHA_NM2", null, null, String.class, "tenhanshaNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaZipCd = cci("TENHANSHA_ZIP_CD", "TENHANSHA_ZIP_CD", null, null, String.class, "tenhanshaZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaPrefecture = cci("TENHANSHA_PREFECTURE", "TENHANSHA_PREFECTURE", null, null, String.class, "tenhanshaPrefecture", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaAddress1 = cci("TENHANSHA_ADDRESS1", "TENHANSHA_ADDRESS1", null, null, String.class, "tenhanshaAddress1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaAddress2 = cci("TENHANSHA_ADDRESS2", "TENHANSHA_ADDRESS2", null, null, String.class, "tenhanshaAddress2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaTelNo = cci("TENHANSHA_TEL_NO", "TENHANSHA_TEL_NO", null, null, String.class, "tenhanshaTelNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaFaxNo = cci("TENHANSHA_FAX_NO", "TENHANSHA_FAX_NO", null, null, String.class, "tenhanshaFaxNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantNormal = cci("PLANT_NORMAL", "PLANT_NORMAL", null, null, String.class, "plantNormal", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantDeposit = cci("PLANT_DEPOSIT", "PLANT_DEPOSIT", null, null, String.class, "plantDeposit", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SALES_ORG_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgId() { return _columnSalesOrgId; }
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
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrgCd() { return _columnSalesOrgCd; }
    /**
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseOrgCd() { return _columnPurchaseOrgCd; }
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
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaZipCd() { return _columnTenhanshaZipCd; }
    /**
     * TENHANSHA_PREFECTURE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaPrefecture() { return _columnTenhanshaPrefecture; }
    /**
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaAddress1() { return _columnTenhanshaAddress1; }
    /**
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaAddress2() { return _columnTenhanshaAddress2; }
    /**
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaTelNo() { return _columnTenhanshaTelNo; }
    /**
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTenhanshaFaxNo() { return _columnTenhanshaFaxNo; }
    /**
     * PLANT_NORMAL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantNormal() { return _columnPlantNormal; }
    /**
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantDeposit() { return _columnPlantDeposit; }
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
        ls.add(columnSalesOrgId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnPurchaseOrgCd());
        ls.add(columnTenhanshaCd());
        ls.add(columnTenhanshaNm1());
        ls.add(columnTenhanshaNm2());
        ls.add(columnTenhanshaZipCd());
        ls.add(columnTenhanshaPrefecture());
        ls.add(columnTenhanshaAddress1());
        ls.add(columnTenhanshaAddress2());
        ls.add(columnTenhanshaTelNo());
        ls.add(columnTenhanshaFaxNo());
        ls.add(columnPlantNormal());
        ls.add(columnPlantDeposit());
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
    protected UniqueInfo cpui() { return hpcpui(columnSalesOrgId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErSalesOrg"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErSalesOrgCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErSalesOrgBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErSalesOrg> getEntityType() { return ErSalesOrg.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErSalesOrg newEntity() { return new ErSalesOrg(); }
    public ErSalesOrg newMyEntity() { return new ErSalesOrg(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErSalesOrg)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErSalesOrg)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
