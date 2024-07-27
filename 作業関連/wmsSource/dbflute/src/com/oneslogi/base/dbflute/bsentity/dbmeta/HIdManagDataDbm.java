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
 * The DB meta of h_id_manag_data. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class HIdManagDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final HIdManagDataDbm _instance = new HIdManagDataDbm();
    private HIdManagDataDbm() {}
    public static HIdManagDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((HIdManagData)et).getIdManagDataId(), (et, vl) -> ((HIdManagData)et).setIdManagDataId(ctl(vl)), "idManagDataId");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getIdManagNo(), (et, vl) -> ((HIdManagData)et).setIdManagNo((String)vl), "idManagNo");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getTenhanshaCd(), (et, vl) -> ((HIdManagData)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getSalesOrgCd(), (et, vl) -> ((HIdManagData)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getCustomerCd(), (et, vl) -> ((HIdManagData)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getProductCd(), (et, vl) -> ((HIdManagData)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getHinmokuText(), (et, vl) -> ((HIdManagData)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getJanCd(), (et, vl) -> ((HIdManagData)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getUnitNm(), (et, vl) -> ((HIdManagData)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getSharedProductTypeCd(), (et, vl) -> ((HIdManagData)et).setSharedProductTypeCd((String)vl), "sharedProductTypeCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getCustomerOrderNo(), (et, vl) -> ((HIdManagData)et).setCustomerOrderNo((String)vl), "customerOrderNo");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDelivCd(), (et, vl) -> ((HIdManagData)et).setDelivCd((String)vl), "delivCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationZipCd(), (et, vl) -> ((HIdManagData)et).setDestinationZipCd((String)vl), "destinationZipCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationAddress1(), (et, vl) -> ((HIdManagData)et).setDestinationAddress1((String)vl), "destinationAddress1");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationAddress2(), (et, vl) -> ((HIdManagData)et).setDestinationAddress2((String)vl), "destinationAddress2");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationNm1(), (et, vl) -> ((HIdManagData)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationNm2(), (et, vl) -> ((HIdManagData)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDestinationTel(), (et, vl) -> ((HIdManagData)et).setDestinationTel((String)vl), "destinationTel");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getEmpIdCd(), (et, vl) -> ((HIdManagData)et).setEmpIdCd((String)vl), "empIdCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getEmpNm(), (et, vl) -> ((HIdManagData)et).setEmpNm((String)vl), "empNm");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getStoreDt(), (et, vl) -> ((HIdManagData)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getInventoryDt(), (et, vl) -> ((HIdManagData)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getPickingDt(), (et, vl) -> ((HIdManagData)et).setPickingDt((String)vl), "pickingDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getProductReturnDt(), (et, vl) -> ((HIdManagData)et).setProductReturnDt((String)vl), "productReturnDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getWasteReturnDt(), (et, vl) -> ((HIdManagData)et).setWasteReturnDt((String)vl), "wasteReturnDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getIdManagAbolitionTypeCd(), (et, vl) -> ((HIdManagData)et).setIdManagAbolitionTypeCd((String)vl), "idManagAbolitionTypeCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getSpareTypeCd(), (et, vl) -> ((HIdManagData)et).setSpareTypeCd((String)vl), "spareTypeCd");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataExtFlgPicking(), (et, vl) -> ((HIdManagData)et).setDataExtFlgPicking((String)vl), "dataExtFlgPicking");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataAddDtPicking(), (et, vl) -> ((HIdManagData)et).setDataAddDtPicking((String)vl), "dataAddDtPicking");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataExtFlgReturn(), (et, vl) -> ((HIdManagData)et).setDataExtFlgReturn((String)vl), "dataExtFlgReturn");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataAddDtReturn(), (et, vl) -> ((HIdManagData)et).setDataAddDtReturn((String)vl), "dataAddDtReturn");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataExtFlgWaste(), (et, vl) -> ((HIdManagData)et).setDataExtFlgWaste((String)vl), "dataExtFlgWaste");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDataAddDtWaste(), (et, vl) -> ((HIdManagData)et).setDataAddDtWaste((String)vl), "dataAddDtWaste");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getWorkDt(), (et, vl) -> ((HIdManagData)et).setWorkDt((String)vl), "workDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getDelFlg(), (et, vl) -> ((HIdManagData)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getVersionNo(), (et, vl) -> ((HIdManagData)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getControlNo(), (et, vl) -> ((HIdManagData)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getAddDt(), (et, vl) -> ((HIdManagData)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getAddUser(), (et, vl) -> ((HIdManagData)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getAddProcess(), (et, vl) -> ((HIdManagData)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getUpdDt(), (et, vl) -> ((HIdManagData)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getUpdUser(), (et, vl) -> ((HIdManagData)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((HIdManagData)et).getUpdProcess(), (et, vl) -> ((HIdManagData)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "h_id_manag_data";
    protected final String _tableDispName = "h_id_manag_data";
    protected final String _tablePropertyName = "HIdManagData";
    protected final TableSqlName _tableSqlName = new TableSqlName("h_id_manag_data", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIdManagDataId = cci("ID_MANAG_DATA_ID", "ID_MANAG_DATA_ID", null, null, Long.class, "idManagDataId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdManagNo = cci("ID_MANAG_NO", "ID_MANAG_NO", null, null, String.class, "idManagNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSharedProductTypeCd = cci("SHARED_PRODUCT_TYPE_CD", "SHARED_PRODUCT_TYPE_CD", null, null, String.class, "sharedProductTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerOrderNo = cci("CUSTOMER_ORDER_NO", "CUSTOMER_ORDER_NO", null, null, String.class, "customerOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCd = cci("DELIV_CD", "DELIV_CD", null, null, String.class, "delivCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationZipCd = cci("DESTINATION_ZIP_CD", "DESTINATION_ZIP_CD", null, null, String.class, "destinationZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress1 = cci("DESTINATION_ADDRESS1", "DESTINATION_ADDRESS1", null, null, String.class, "destinationAddress1", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress2 = cci("DESTINATION_ADDRESS2", "DESTINATION_ADDRESS2", null, null, String.class, "destinationAddress2", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationTel = cci("DESTINATION_TEL", "DESTINATION_TEL", null, null, String.class, "destinationTel", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpIdCd = cci("EMP_ID_CD", "EMP_ID_CD", null, null, String.class, "empIdCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpNm = cci("EMP_NM", "EMP_NM", null, null, String.class, "empNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingDt = cci("PICKING_DT", "PICKING_DT", null, null, String.class, "pickingDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductReturnDt = cci("PRODUCT_RETURN_DT", "PRODUCT_RETURN_DT", null, null, String.class, "productReturnDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWasteReturnDt = cci("WASTE_RETURN_DT", "WASTE_RETURN_DT", null, null, String.class, "wasteReturnDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdManagAbolitionTypeCd = cci("ID_MANAG_ABOLITION_TYPE_CD", "ID_MANAG_ABOLITION_TYPE_CD", null, null, String.class, "idManagAbolitionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareTypeCd = cci("SPARE_TYPE_CD", "SPARE_TYPE_CD", null, null, String.class, "spareTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgPicking = cci("DATA_EXT_FLG_PICKING", "DATA_EXT_FLG_PICKING", null, null, String.class, "dataExtFlgPicking", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtPicking = cci("DATA_ADD_DT_PICKING", "DATA_ADD_DT_PICKING", null, null, String.class, "dataAddDtPicking", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgReturn = cci("DATA_EXT_FLG_RETURN", "DATA_EXT_FLG_RETURN", null, null, String.class, "dataExtFlgReturn", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtReturn = cci("DATA_ADD_DT_RETURN", "DATA_ADD_DT_RETURN", null, null, String.class, "dataAddDtReturn", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgWaste = cci("DATA_EXT_FLG_WASTE", "DATA_EXT_FLG_WASTE", null, null, String.class, "dataExtFlgWaste", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtWaste = cci("DATA_ADD_DT_WASTE", "DATA_ADD_DT_WASTE", null, null, String.class, "dataAddDtWaste", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWorkDt = cci("WORK_DT", "WORK_DT", null, null, String.class, "workDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
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
     * ID_MANAG_DATA_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdManagDataId() { return _columnIdManagDataId; }
    /**
     * ID_MANAG_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdManagNo() { return _columnIdManagNo; }
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
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerCd() { return _columnCustomerCd; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
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
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * SHARED_PRODUCT_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSharedProductTypeCd() { return _columnSharedProductTypeCd; }
    /**
     * CUSTOMER_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCustomerOrderNo() { return _columnCustomerOrderNo; }
    /**
     * DELIV_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelivCd() { return _columnDelivCd; }
    /**
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationZipCd() { return _columnDestinationZipCd; }
    /**
     * DESTINATION_ADDRESS1: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress1() { return _columnDestinationAddress1; }
    /**
     * DESTINATION_ADDRESS2: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress2() { return _columnDestinationAddress2; }
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
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationTel() { return _columnDestinationTel; }
    /**
     * EMP_ID_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpIdCd() { return _columnEmpIdCd; }
    /**
     * EMP_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmpNm() { return _columnEmpNm; }
    /**
     * STORE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * INVENTORY_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PICKING_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingDt() { return _columnPickingDt; }
    /**
     * PRODUCT_RETURN_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductReturnDt() { return _columnProductReturnDt; }
    /**
     * WASTE_RETURN_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWasteReturnDt() { return _columnWasteReturnDt; }
    /**
     * ID_MANAG_ABOLITION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdManagAbolitionTypeCd() { return _columnIdManagAbolitionTypeCd; }
    /**
     * SPARE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareTypeCd() { return _columnSpareTypeCd; }
    /**
     * DATA_EXT_FLG_PICKING: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgPicking() { return _columnDataExtFlgPicking; }
    /**
     * DATA_ADD_DT_PICKING: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtPicking() { return _columnDataAddDtPicking; }
    /**
     * DATA_EXT_FLG_RETURN: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgReturn() { return _columnDataExtFlgReturn; }
    /**
     * DATA_ADD_DT_RETURN: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtReturn() { return _columnDataAddDtReturn; }
    /**
     * DATA_EXT_FLG_WASTE: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgWaste() { return _columnDataExtFlgWaste; }
    /**
     * DATA_ADD_DT_WASTE: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtWaste() { return _columnDataAddDtWaste; }
    /**
     * WORK_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnWorkDt() { return _columnWorkDt; }
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
        ls.add(columnIdManagDataId());
        ls.add(columnIdManagNo());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnCustomerCd());
        ls.add(columnProductCd());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnUnitNm());
        ls.add(columnSharedProductTypeCd());
        ls.add(columnCustomerOrderNo());
        ls.add(columnDelivCd());
        ls.add(columnDestinationZipCd());
        ls.add(columnDestinationAddress1());
        ls.add(columnDestinationAddress2());
        ls.add(columnDestinationNm1());
        ls.add(columnDestinationNm2());
        ls.add(columnDestinationTel());
        ls.add(columnEmpIdCd());
        ls.add(columnEmpNm());
        ls.add(columnStoreDt());
        ls.add(columnInventoryDt());
        ls.add(columnPickingDt());
        ls.add(columnProductReturnDt());
        ls.add(columnWasteReturnDt());
        ls.add(columnIdManagAbolitionTypeCd());
        ls.add(columnSpareTypeCd());
        ls.add(columnDataExtFlgPicking());
        ls.add(columnDataAddDtPicking());
        ls.add(columnDataExtFlgReturn());
        ls.add(columnDataAddDtReturn());
        ls.add(columnDataExtFlgWaste());
        ls.add(columnDataAddDtWaste());
        ls.add(columnWorkDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnIdManagDataId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.HIdManagData"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.HIdManagDataCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.HIdManagDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<HIdManagData> getEntityType() { return HIdManagData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public HIdManagData newEntity() { return new HIdManagData(); }
    public HIdManagData newMyEntity() { return new HIdManagData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((HIdManagData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((HIdManagData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
