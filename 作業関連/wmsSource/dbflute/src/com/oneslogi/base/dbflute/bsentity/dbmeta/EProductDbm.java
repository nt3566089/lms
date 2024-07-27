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
 * The DB meta of e_product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EProductDbm _instance = new EProductDbm();
    private EProductDbm() {}
    public static EProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EProduct)et).getProductId(), (et, vl) -> ((EProduct)et).setProductId(ctl(vl)), "productId");
        setupEpg(_epgMap, et -> ((EProduct)et).getReceiveCd(), (et, vl) -> ((EProduct)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getReceiveRowId(), (et, vl) -> ((EProduct)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((EProduct)et).getImportFlg(), (et, vl) -> ((EProduct)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getErrorFlg(), (et, vl) -> ((EProduct)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getErrorMessageCd(), (et, vl) -> ((EProduct)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getHinmokuCd(), (et, vl) -> ((EProduct)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getHinmokuGroupCd(), (et, vl) -> ((EProduct)et).setHinmokuGroupCd((String)vl), "hinmokuGroupCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getHinmokuText(), (et, vl) -> ((EProduct)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((EProduct)et).getJanCd(), (et, vl) -> ((EProduct)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getSizeNm(), (et, vl) -> ((EProduct)et).setSizeNm((String)vl), "sizeNm");
        setupEpg(_epgMap, et -> ((EProduct)et).getCaseTypeCd(), (et, vl) -> ((EProduct)et).setCaseTypeCd((String)vl), "caseTypeCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getUnitNum(), (et, vl) -> ((EProduct)et).setUnitNum((String)vl), "unitNum");
        setupEpg(_epgMap, et -> ((EProduct)et).getLogiWeightFlg(), (et, vl) -> ((EProduct)et).setLogiWeightFlg((String)vl), "logiWeightFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getLogiSpecialTypeCd(), (et, vl) -> ((EProduct)et).setLogiSpecialTypeCd((String)vl), "logiSpecialTypeCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getLogiAttentionTypeCd(), (et, vl) -> ((EProduct)et).setLogiAttentionTypeCd((String)vl), "logiAttentionTypeCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getUnitNm(), (et, vl) -> ((EProduct)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((EProduct)et).getOldJanCd(), (et, vl) -> ((EProduct)et).setOldJanCd((String)vl), "oldJanCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddDt(), (et, vl) -> ((EProduct)et).setSapAddDt((String)vl), "sapAddDt");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddTime(), (et, vl) -> ((EProduct)et).setSapAddTime((String)vl), "sapAddTime");
        setupEpg(_epgMap, et -> ((EProduct)et).getStorageLocationTypeCd(), (et, vl) -> ((EProduct)et).setStorageLocationTypeCd((String)vl), "storageLocationTypeCd");
        setupEpg(_epgMap, et -> ((EProduct)et).getMedicalManagFlg(), (et, vl) -> ((EProduct)et).setMedicalManagFlg((String)vl), "medicalManagFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getProdDtManagFlg(), (et, vl) -> ((EProduct)et).setProdDtManagFlg((String)vl), "prodDtManagFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getProdDtLimitDaysRcv(), (et, vl) -> ((EProduct)et).setProdDtLimitDaysRcv((String)vl), "prodDtLimitDaysRcv");
        setupEpg(_epgMap, et -> ((EProduct)et).getProdDtLimitDaysShp(), (et, vl) -> ((EProduct)et).setProdDtLimitDaysShp((String)vl), "prodDtLimitDaysShp");
        setupEpg(_epgMap, et -> ((EProduct)et).getNizoroe10Num(), (et, vl) -> ((EProduct)et).setNizoroe10Num((String)vl), "nizoroe10Num");
        setupEpg(_epgMap, et -> ((EProduct)et).getSerialManagFlg(), (et, vl) -> ((EProduct)et).setSerialManagFlg((String)vl), "serialManagFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getOcrDateFormat(), (et, vl) -> ((EProduct)et).setOcrDateFormat((String)vl), "ocrDateFormat");
        setupEpg(_epgMap, et -> ((EProduct)et).getLpSendFlg(), (et, vl) -> ((EProduct)et).setLpSendFlg((String)vl), "lpSendFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddYyyy(), (et, vl) -> ((EProduct)et).setSapAddYyyy((String)vl), "sapAddYyyy");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddMm(), (et, vl) -> ((EProduct)et).setSapAddMm((String)vl), "sapAddMm");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddDd(), (et, vl) -> ((EProduct)et).setSapAddDd((String)vl), "sapAddDd");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddHh(), (et, vl) -> ((EProduct)et).setSapAddHh((String)vl), "sapAddHh");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddMi(), (et, vl) -> ((EProduct)et).setSapAddMi((String)vl), "sapAddMi");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddSs(), (et, vl) -> ((EProduct)et).setSapAddSs((String)vl), "sapAddSs");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapAddUserNm(), (et, vl) -> ((EProduct)et).setSapAddUserNm((String)vl), "sapAddUserNm");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdYyyy(), (et, vl) -> ((EProduct)et).setSapUpdYyyy((String)vl), "sapUpdYyyy");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdMm(), (et, vl) -> ((EProduct)et).setSapUpdMm((String)vl), "sapUpdMm");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdDd(), (et, vl) -> ((EProduct)et).setSapUpdDd((String)vl), "sapUpdDd");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdHh(), (et, vl) -> ((EProduct)et).setSapUpdHh((String)vl), "sapUpdHh");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdMi(), (et, vl) -> ((EProduct)et).setSapUpdMi((String)vl), "sapUpdMi");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdSs(), (et, vl) -> ((EProduct)et).setSapUpdSs((String)vl), "sapUpdSs");
        setupEpg(_epgMap, et -> ((EProduct)et).getSapUpdUserNm(), (et, vl) -> ((EProduct)et).setSapUpdUserNm((String)vl), "sapUpdUserNm");
        setupEpg(_epgMap, et -> ((EProduct)et).getSpareStr(), (et, vl) -> ((EProduct)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((EProduct)et).getDelFlg(), (et, vl) -> ((EProduct)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((EProduct)et).getVersionNo(), (et, vl) -> ((EProduct)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((EProduct)et).getControlNo(), (et, vl) -> ((EProduct)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((EProduct)et).getAddDt(), (et, vl) -> ((EProduct)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((EProduct)et).getAddUser(), (et, vl) -> ((EProduct)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((EProduct)et).getAddProcess(), (et, vl) -> ((EProduct)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((EProduct)et).getUpdDt(), (et, vl) -> ((EProduct)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((EProduct)et).getUpdUser(), (et, vl) -> ((EProduct)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((EProduct)et).getUpdProcess(), (et, vl) -> ((EProduct)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "e_product";
    protected final String _tableDispName = "e_product";
    protected final String _tablePropertyName = "EProduct";
    protected final TableSqlName _tableSqlName = new TableSqlName("e_product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("PRODUCT_ID", "PRODUCT_ID", null, null, Long.class, "productId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroupCd = cci("HINMOKU_GROUP_CD", "HINMOKU_GROUP_CD", null, null, String.class, "hinmokuGroupCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSizeNm = cci("SIZE_NM", "SIZE_NM", null, null, String.class, "sizeNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCaseTypeCd = cci("CASE_TYPE_CD", "CASE_TYPE_CD", null, null, String.class, "caseTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNum = cci("UNIT_NUM", "UNIT_NUM", null, null, String.class, "unitNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiWeightFlg = cci("LOGI_WEIGHT_FLG", "LOGI_WEIGHT_FLG", null, null, String.class, "logiWeightFlg", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiSpecialTypeCd = cci("LOGI_SPECIAL_TYPE_CD", "LOGI_SPECIAL_TYPE_CD", null, null, String.class, "logiSpecialTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLogiAttentionTypeCd = cci("LOGI_ATTENTION_TYPE_CD", "LOGI_ATTENTION_TYPE_CD", null, null, String.class, "logiAttentionTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOldJanCd = cci("OLD_JAN_CD", "OLD_JAN_CD", null, null, String.class, "oldJanCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDt = cci("SAP_ADD_DT", "SAP_ADD_DT", null, null, String.class, "sapAddDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddTime = cci("SAP_ADD_TIME", "SAP_ADD_TIME", null, null, String.class, "sapAddTime", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageLocationTypeCd = cci("STORAGE_LOCATION_TYPE_CD", "STORAGE_LOCATION_TYPE_CD", null, null, String.class, "storageLocationTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMedicalManagFlg = cci("MEDICAL_MANAG_FLG", "MEDICAL_MANAG_FLG", null, null, String.class, "medicalManagFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDtManagFlg = cci("PROD_DT_MANAG_FLG", "PROD_DT_MANAG_FLG", null, null, String.class, "prodDtManagFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDtLimitDaysRcv = cci("PROD_DT_LIMIT_DAYS_RCV", "PROD_DT_LIMIT_DAYS_RCV", null, null, String.class, "prodDtLimitDaysRcv", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDtLimitDaysShp = cci("PROD_DT_LIMIT_DAYS_SHP", "PROD_DT_LIMIT_DAYS_SHP", null, null, String.class, "prodDtLimitDaysShp", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroe10Num = cci("NIZOROE_10_NUM", "NIZOROE_10_NUM", null, null, String.class, "nizoroe10Num", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialManagFlg = cci("SERIAL_MANAG_FLG", "SERIAL_MANAG_FLG", null, null, String.class, "serialManagFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOcrDateFormat = cci("OCR_DATE_FORMAT", "OCR_DATE_FORMAT", null, null, String.class, "ocrDateFormat", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLpSendFlg = cci("LP_SEND_FLG", "LP_SEND_FLG", null, null, String.class, "lpSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddYyyy = cci("SAP_ADD_YYYY", "SAP_ADD_YYYY", null, null, String.class, "sapAddYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMm = cci("SAP_ADD_MM", "SAP_ADD_MM", null, null, String.class, "sapAddMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddDd = cci("SAP_ADD_DD", "SAP_ADD_DD", null, null, String.class, "sapAddDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddHh = cci("SAP_ADD_HH", "SAP_ADD_HH", null, null, String.class, "sapAddHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddMi = cci("SAP_ADD_MI", "SAP_ADD_MI", null, null, String.class, "sapAddMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddSs = cci("SAP_ADD_SS", "SAP_ADD_SS", null, null, String.class, "sapAddSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapAddUserNm = cci("SAP_ADD_USER_NM", "SAP_ADD_USER_NM", null, null, String.class, "sapAddUserNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdYyyy = cci("SAP_UPD_YYYY", "SAP_UPD_YYYY", null, null, String.class, "sapUpdYyyy", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMm = cci("SAP_UPD_MM", "SAP_UPD_MM", null, null, String.class, "sapUpdMm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdDd = cci("SAP_UPD_DD", "SAP_UPD_DD", null, null, String.class, "sapUpdDd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdHh = cci("SAP_UPD_HH", "SAP_UPD_HH", null, null, String.class, "sapUpdHh", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdMi = cci("SAP_UPD_MI", "SAP_UPD_MI", null, null, String.class, "sapUpdMi", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdSs = cci("SAP_UPD_SS", "SAP_UPD_SS", null, null, String.class, "sapUpdSs", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSapUpdUserNm = cci("SAP_UPD_USER_NM", "SAP_UPD_USER_NM", null, null, String.class, "sapUpdUserNm", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
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
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroupCd() { return _columnHinmokuGroupCd; }
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
     * SIZE_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSizeNm() { return _columnSizeNm; }
    /**
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCaseTypeCd() { return _columnCaseTypeCd; }
    /**
     * UNIT_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNum() { return _columnUnitNum; }
    /**
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiWeightFlg() { return _columnLogiWeightFlg; }
    /**
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiSpecialTypeCd() { return _columnLogiSpecialTypeCd; }
    /**
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLogiAttentionTypeCd() { return _columnLogiAttentionTypeCd; }
    /**
     * UNIT_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
    /**
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOldJanCd() { return _columnOldJanCd; }
    /**
     * SAP_ADD_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddDt() { return _columnSapAddDt; }
    /**
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddTime() { return _columnSapAddTime; }
    /**
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageLocationTypeCd() { return _columnStorageLocationTypeCd; }
    /**
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMedicalManagFlg() { return _columnMedicalManagFlg; }
    /**
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtManagFlg() { return _columnProdDtManagFlg; }
    /**
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtLimitDaysRcv() { return _columnProdDtLimitDaysRcv; }
    /**
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDtLimitDaysShp() { return _columnProdDtLimitDaysShp; }
    /**
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroe10Num() { return _columnNizoroe10Num; }
    /**
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialManagFlg() { return _columnSerialManagFlg; }
    /**
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOcrDateFormat() { return _columnOcrDateFormat; }
    /**
     * LP_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLpSendFlg() { return _columnLpSendFlg; }
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
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapAddUserNm() { return _columnSapAddUserNm; }
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
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSapUpdUserNm() { return _columnSapUpdUserNm; }
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
        ls.add(columnProductId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuGroupCd());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnSizeNm());
        ls.add(columnCaseTypeCd());
        ls.add(columnUnitNum());
        ls.add(columnLogiWeightFlg());
        ls.add(columnLogiSpecialTypeCd());
        ls.add(columnLogiAttentionTypeCd());
        ls.add(columnUnitNm());
        ls.add(columnOldJanCd());
        ls.add(columnSapAddDt());
        ls.add(columnSapAddTime());
        ls.add(columnStorageLocationTypeCd());
        ls.add(columnMedicalManagFlg());
        ls.add(columnProdDtManagFlg());
        ls.add(columnProdDtLimitDaysRcv());
        ls.add(columnProdDtLimitDaysShp());
        ls.add(columnNizoroe10Num());
        ls.add(columnSerialManagFlg());
        ls.add(columnOcrDateFormat());
        ls.add(columnLpSendFlg());
        ls.add(columnSapAddYyyy());
        ls.add(columnSapAddMm());
        ls.add(columnSapAddDd());
        ls.add(columnSapAddHh());
        ls.add(columnSapAddMi());
        ls.add(columnSapAddSs());
        ls.add(columnSapAddUserNm());
        ls.add(columnSapUpdYyyy());
        ls.add(columnSapUpdMm());
        ls.add(columnSapUpdDd());
        ls.add(columnSapUpdHh());
        ls.add(columnSapUpdMi());
        ls.add(columnSapUpdSs());
        ls.add(columnSapUpdUserNm());
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
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.EProduct"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.EProductCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.EProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EProduct> getEntityType() { return EProduct.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EProduct newEntity() { return new EProduct(); }
    public EProduct newMyEntity() { return new EProduct(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EProduct)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EProduct)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
