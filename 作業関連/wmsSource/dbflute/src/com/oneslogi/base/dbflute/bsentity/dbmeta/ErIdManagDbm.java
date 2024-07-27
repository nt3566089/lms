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
 * The DB meta of er_id_manag. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErIdManagDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErIdManagDbm _instance = new ErIdManagDbm();
    private ErIdManagDbm() {}
    public static ErIdManagDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErIdManag)et).getIdManagId(), (et, vl) -> ((ErIdManag)et).setIdManagId(ctl(vl)), "idManagId");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getReceiveCd(), (et, vl) -> ((ErIdManag)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getReceiveRowId(), (et, vl) -> ((ErIdManag)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getImportFlg(), (et, vl) -> ((ErIdManag)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getErrorFlg(), (et, vl) -> ((ErIdManag)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getErrorMessageCd(), (et, vl) -> ((ErIdManag)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getIdManagNo(), (et, vl) -> ((ErIdManag)et).setIdManagNo((String)vl), "idManagNo");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getTenhanshaCd(), (et, vl) -> ((ErIdManag)et).setTenhanshaCd((String)vl), "tenhanshaCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getSalesOrgCd(), (et, vl) -> ((ErIdManag)et).setSalesOrgCd((String)vl), "salesOrgCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getCustomerCd(), (et, vl) -> ((ErIdManag)et).setCustomerCd((String)vl), "customerCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getHinmokuCd(), (et, vl) -> ((ErIdManag)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getHinmokuText(), (et, vl) -> ((ErIdManag)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getJanCd(), (et, vl) -> ((ErIdManag)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getUnitNm(), (et, vl) -> ((ErIdManag)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getSharedProductTypeCd(), (et, vl) -> ((ErIdManag)et).setSharedProductTypeCd((String)vl), "sharedProductTypeCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getCustomerOrderNo(), (et, vl) -> ((ErIdManag)et).setCustomerOrderNo((String)vl), "customerOrderNo");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDelivCd(), (et, vl) -> ((ErIdManag)et).setDelivCd((String)vl), "delivCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationZipCd(), (et, vl) -> ((ErIdManag)et).setDestinationZipCd((String)vl), "destinationZipCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationAddress1(), (et, vl) -> ((ErIdManag)et).setDestinationAddress1((String)vl), "destinationAddress1");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationAddress2(), (et, vl) -> ((ErIdManag)et).setDestinationAddress2((String)vl), "destinationAddress2");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationNm1(), (et, vl) -> ((ErIdManag)et).setDestinationNm1((String)vl), "destinationNm1");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationNm2(), (et, vl) -> ((ErIdManag)et).setDestinationNm2((String)vl), "destinationNm2");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDestinationTel(), (et, vl) -> ((ErIdManag)et).setDestinationTel((String)vl), "destinationTel");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getEmpIdCd(), (et, vl) -> ((ErIdManag)et).setEmpIdCd((String)vl), "empIdCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getEmpNm(), (et, vl) -> ((ErIdManag)et).setEmpNm((String)vl), "empNm");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getStoreDt(), (et, vl) -> ((ErIdManag)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getInventoryDt(), (et, vl) -> ((ErIdManag)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getPickingDt(), (et, vl) -> ((ErIdManag)et).setPickingDt((String)vl), "pickingDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getProductReturnDt(), (et, vl) -> ((ErIdManag)et).setProductReturnDt((String)vl), "productReturnDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWasteReturnDt(), (et, vl) -> ((ErIdManag)et).setWasteReturnDt((String)vl), "wasteReturnDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getIdManagAbolitionTypeCd(), (et, vl) -> ((ErIdManag)et).setIdManagAbolitionTypeCd((String)vl), "idManagAbolitionTypeCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getSpareTypeCd(), (et, vl) -> ((ErIdManag)et).setSpareTypeCd((String)vl), "spareTypeCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataExtFlgPicking(), (et, vl) -> ((ErIdManag)et).setDataExtFlgPicking((String)vl), "dataExtFlgPicking");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataAddDtPicking(), (et, vl) -> ((ErIdManag)et).setDataAddDtPicking((String)vl), "dataAddDtPicking");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataExtFlgReturn(), (et, vl) -> ((ErIdManag)et).setDataExtFlgReturn((String)vl), "dataExtFlgReturn");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataAddDtReturn(), (et, vl) -> ((ErIdManag)et).setDataAddDtReturn((String)vl), "dataAddDtReturn");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataExtFlgWaste(), (et, vl) -> ((ErIdManag)et).setDataExtFlgWaste((String)vl), "dataExtFlgWaste");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDataAddDtWaste(), (et, vl) -> ((ErIdManag)et).setDataAddDtWaste((String)vl), "dataAddDtWaste");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getSpareStr(), (et, vl) -> ((ErIdManag)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddYyyy(), (et, vl) -> ((ErIdManag)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddMm(), (et, vl) -> ((ErIdManag)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddDd(), (et, vl) -> ((ErIdManag)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddHh(), (et, vl) -> ((ErIdManag)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddMi(), (et, vl) -> ((ErIdManag)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddSs(), (et, vl) -> ((ErIdManag)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsAddUserCd(), (et, vl) -> ((ErIdManag)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdYyyy(), (et, vl) -> ((ErIdManag)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdMm(), (et, vl) -> ((ErIdManag)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdDd(), (et, vl) -> ((ErIdManag)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdHh(), (et, vl) -> ((ErIdManag)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdMi(), (et, vl) -> ((ErIdManag)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdSs(), (et, vl) -> ((ErIdManag)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getWmsUpdUserCd(), (et, vl) -> ((ErIdManag)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getDelFlg(), (et, vl) -> ((ErIdManag)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getVersionNo(), (et, vl) -> ((ErIdManag)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getControlNo(), (et, vl) -> ((ErIdManag)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getAddDt(), (et, vl) -> ((ErIdManag)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getAddUser(), (et, vl) -> ((ErIdManag)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getAddProcess(), (et, vl) -> ((ErIdManag)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getUpdDt(), (et, vl) -> ((ErIdManag)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getUpdUser(), (et, vl) -> ((ErIdManag)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErIdManag)et).getUpdProcess(), (et, vl) -> ((ErIdManag)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_id_manag";
    protected final String _tableDispName = "er_id_manag";
    protected final String _tablePropertyName = "erIdManag";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_id_manag", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnIdManagId = cci("ID_MANAG_ID", "ID_MANAG_ID", null, null, Long.class, "idManagId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdManagNo = cci("ID_MANAG_NO", "ID_MANAG_NO", null, null, String.class, "idManagNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTenhanshaCd = cci("TENHANSHA_CD", "TENHANSHA_CD", null, null, String.class, "tenhanshaCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrgCd = cci("SALES_ORG_CD", "SALES_ORG_CD", null, null, String.class, "salesOrgCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerCd = cci("CUSTOMER_CD", "CUSTOMER_CD", null, null, String.class, "customerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSharedProductTypeCd = cci("SHARED_PRODUCT_TYPE_CD", "SHARED_PRODUCT_TYPE_CD", null, null, String.class, "sharedProductTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCustomerOrderNo = cci("CUSTOMER_ORDER_NO", "CUSTOMER_ORDER_NO", null, null, String.class, "customerOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelivCd = cci("DELIV_CD", "DELIV_CD", null, null, String.class, "delivCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationZipCd = cci("DESTINATION_ZIP_CD", "DESTINATION_ZIP_CD", null, null, String.class, "destinationZipCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress1 = cci("DESTINATION_ADDRESS1", "DESTINATION_ADDRESS1", null, null, String.class, "destinationAddress1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationAddress2 = cci("DESTINATION_ADDRESS2", "DESTINATION_ADDRESS2", null, null, String.class, "destinationAddress2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm1 = cci("DESTINATION_NM1", "DESTINATION_NM1", null, null, String.class, "destinationNm1", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationNm2 = cci("DESTINATION_NM2", "DESTINATION_NM2", null, null, String.class, "destinationNm2", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDestinationTel = cci("DESTINATION_TEL", "DESTINATION_TEL", null, null, String.class, "destinationTel", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpIdCd = cci("EMP_ID_CD", "EMP_ID_CD", null, null, String.class, "empIdCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmpNm = cci("EMP_NM", "EMP_NM", null, null, String.class, "empNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPickingDt = cci("PICKING_DT", "PICKING_DT", null, null, String.class, "pickingDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductReturnDt = cci("PRODUCT_RETURN_DT", "PRODUCT_RETURN_DT", null, null, String.class, "productReturnDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnWasteReturnDt = cci("WASTE_RETURN_DT", "WASTE_RETURN_DT", null, null, String.class, "wasteReturnDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIdManagAbolitionTypeCd = cci("ID_MANAG_ABOLITION_TYPE_CD", "ID_MANAG_ABOLITION_TYPE_CD", null, null, String.class, "idManagAbolitionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareTypeCd = cci("SPARE_TYPE_CD", "SPARE_TYPE_CD", null, null, String.class, "spareTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgPicking = cci("DATA_EXT_FLG_PICKING", "DATA_EXT_FLG_PICKING", null, null, String.class, "dataExtFlgPicking", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtPicking = cci("DATA_ADD_DT_PICKING", "DATA_ADD_DT_PICKING", null, null, String.class, "dataAddDtPicking", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgReturn = cci("DATA_EXT_FLG_RETURN", "DATA_EXT_FLG_RETURN", null, null, String.class, "dataExtFlgReturn", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtReturn = cci("DATA_ADD_DT_RETURN", "DATA_ADD_DT_RETURN", null, null, String.class, "dataAddDtReturn", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataExtFlgWaste = cci("DATA_EXT_FLG_WASTE", "DATA_EXT_FLG_WASTE", null, null, String.class, "dataExtFlgWaste", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataAddDtWaste = cci("DATA_ADD_DT_WASTE", "DATA_ADD_DT_WASTE", null, null, String.class, "dataAddDtWaste", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSpareStr = cci("SPARE_STR", "SPARE_STR", null, null, String.class, "spareStr", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
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
     * ID_MANAG_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIdManagId() { return _columnIdManagId; }
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
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDestinationAddress1() { return _columnDestinationAddress1; }
    /**
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
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
     * STORE_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * INVENTORY_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PICKING_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPickingDt() { return _columnPickingDt; }
    /**
     * PRODUCT_RETURN_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductReturnDt() { return _columnProductReturnDt; }
    /**
     * WASTE_RETURN_DT: {VARCHAR(30)}
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
     * DATA_EXT_FLG_PICKING: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgPicking() { return _columnDataExtFlgPicking; }
    /**
     * DATA_ADD_DT_PICKING: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtPicking() { return _columnDataAddDtPicking; }
    /**
     * DATA_EXT_FLG_RETURN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgReturn() { return _columnDataExtFlgReturn; }
    /**
     * DATA_ADD_DT_RETURN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtReturn() { return _columnDataAddDtReturn; }
    /**
     * DATA_EXT_FLG_WASTE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataExtFlgWaste() { return _columnDataExtFlgWaste; }
    /**
     * DATA_ADD_DT_WASTE: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataAddDtWaste() { return _columnDataAddDtWaste; }
    /**
     * SPARE_STR: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSpareStr() { return _columnSpareStr; }
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
        ls.add(columnIdManagId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnIdManagNo());
        ls.add(columnTenhanshaCd());
        ls.add(columnSalesOrgCd());
        ls.add(columnCustomerCd());
        ls.add(columnHinmokuCd());
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
        ls.add(columnSpareStr());
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
    protected UniqueInfo cpui() { return hpcpui(columnIdManagId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErIdManag"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErIdManagCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErIdManagBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErIdManag> getEntityType() { return ErIdManag.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErIdManag newEntity() { return new ErIdManag(); }
    public ErIdManag newMyEntity() { return new ErIdManag(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErIdManag)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErIdManag)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
