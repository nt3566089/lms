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
 * The DB meta of er_scm_label. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ErScmLabelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ErScmLabelDbm _instance = new ErScmLabelDbm();
    private ErScmLabelDbm() {}
    public static ErScmLabelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getScmLabelId(), (et, vl) -> ((ErScmLabel)et).setScmLabelId(ctl(vl)), "scmLabelId");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getReceiveCd(), (et, vl) -> ((ErScmLabel)et).setReceiveCd((String)vl), "receiveCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getReceiveRowId(), (et, vl) -> ((ErScmLabel)et).setReceiveRowId(ctl(vl)), "receiveRowId");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getImportFlg(), (et, vl) -> ((ErScmLabel)et).setImportFlg((String)vl), "importFlg");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getErrorFlg(), (et, vl) -> ((ErScmLabel)et).setErrorFlg((String)vl), "errorFlg");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getErrorMessageCd(), (et, vl) -> ((ErScmLabel)et).setErrorMessageCd((String)vl), "errorMessageCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getShippingSlipNo(), (et, vl) -> ((ErScmLabel)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getPackingNo(), (et, vl) -> ((ErScmLabel)et).setPackingNo((String)vl), "packingNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getCartonIdNo(), (et, vl) -> ((ErScmLabel)et).setCartonIdNo((String)vl), "cartonIdNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getSn(), (et, vl) -> ((ErScmLabel)et).setSn((String)vl), "sn");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getManagTypeCd(), (et, vl) -> ((ErScmLabel)et).setManagTypeCd((String)vl), "managTypeCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getHinmokuCd(), (et, vl) -> ((ErScmLabel)et).setHinmokuCd((String)vl), "hinmokuCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getHinmokuGroup(), (et, vl) -> ((ErScmLabel)et).setHinmokuGroup((String)vl), "hinmokuGroup");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getHinmokuText(), (et, vl) -> ((ErScmLabel)et).setHinmokuText((String)vl), "hinmokuText");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getJanCd(), (et, vl) -> ((ErScmLabel)et).setJanCd((String)vl), "janCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getNum(), (et, vl) -> ((ErScmLabel)et).setNum((String)vl), "num");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getSerialNo(), (et, vl) -> ((ErScmLabel)et).setSerialNo((String)vl), "serialNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getLotManagTypeCd(), (et, vl) -> ((ErScmLabel)et).setLotManagTypeCd((String)vl), "lotManagTypeCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getLot(), (et, vl) -> ((ErScmLabel)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getLimitDt(), (et, vl) -> ((ErScmLabel)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getProdDt(), (et, vl) -> ((ErScmLabel)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddYyyy(), (et, vl) -> ((ErScmLabel)et).setWmsAddYyyy((String)vl), "wmsAddYyyy");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddMm(), (et, vl) -> ((ErScmLabel)et).setWmsAddMm((String)vl), "wmsAddMm");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddDd(), (et, vl) -> ((ErScmLabel)et).setWmsAddDd((String)vl), "wmsAddDd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddHh(), (et, vl) -> ((ErScmLabel)et).setWmsAddHh((String)vl), "wmsAddHh");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddMi(), (et, vl) -> ((ErScmLabel)et).setWmsAddMi((String)vl), "wmsAddMi");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddSs(), (et, vl) -> ((ErScmLabel)et).setWmsAddSs((String)vl), "wmsAddSs");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsAddUserCd(), (et, vl) -> ((ErScmLabel)et).setWmsAddUserCd((String)vl), "wmsAddUserCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdYyyy(), (et, vl) -> ((ErScmLabel)et).setWmsUpdYyyy((String)vl), "wmsUpdYyyy");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdMm(), (et, vl) -> ((ErScmLabel)et).setWmsUpdMm((String)vl), "wmsUpdMm");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdDd(), (et, vl) -> ((ErScmLabel)et).setWmsUpdDd((String)vl), "wmsUpdDd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdHh(), (et, vl) -> ((ErScmLabel)et).setWmsUpdHh((String)vl), "wmsUpdHh");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdMi(), (et, vl) -> ((ErScmLabel)et).setWmsUpdMi((String)vl), "wmsUpdMi");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdSs(), (et, vl) -> ((ErScmLabel)et).setWmsUpdSs((String)vl), "wmsUpdSs");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getWmsUpdUserCd(), (et, vl) -> ((ErScmLabel)et).setWmsUpdUserCd((String)vl), "wmsUpdUserCd");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getSpareStr(), (et, vl) -> ((ErScmLabel)et).setSpareStr((String)vl), "spareStr");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getDelFlg(), (et, vl) -> ((ErScmLabel)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getVersionNo(), (et, vl) -> ((ErScmLabel)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getControlNo(), (et, vl) -> ((ErScmLabel)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getAddDt(), (et, vl) -> ((ErScmLabel)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getAddUser(), (et, vl) -> ((ErScmLabel)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getAddProcess(), (et, vl) -> ((ErScmLabel)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getUpdDt(), (et, vl) -> ((ErScmLabel)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getUpdUser(), (et, vl) -> ((ErScmLabel)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((ErScmLabel)et).getUpdProcess(), (et, vl) -> ((ErScmLabel)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "er_scm_label";
    protected final String _tableDispName = "er_scm_label";
    protected final String _tablePropertyName = "erScmLabel";
    protected final TableSqlName _tableSqlName = new TableSqlName("er_scm_label", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScmLabelId = cci("SCM_LABEL_ID", "SCM_LABEL_ID", null, null, Long.class, "scmLabelId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveCd = cci("RECEIVE_CD", "RECEIVE_CD", null, null, String.class, "receiveCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveRowId = cci("RECEIVE_ROW_ID", "RECEIVE_ROW_ID", null, null, Long.class, "receiveRowId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImportFlg = cci("IMPORT_FLG", "IMPORT_FLG", null, null, String.class, "importFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorFlg = cci("ERROR_FLG", "ERROR_FLG", null, null, String.class, "errorFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnErrorMessageCd = cci("ERROR_MESSAGE_CD", "ERROR_MESSAGE_CD", null, null, String.class, "errorMessageCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNo = cci("PACKING_NO", "PACKING_NO", null, null, String.class, "packingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCartonIdNo = cci("CARTON_ID_NO", "CARTON_ID_NO", null, null, String.class, "cartonIdNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSn = cci("SN", "SN", null, null, String.class, "sn", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnManagTypeCd = cci("MANAG_TYPE_CD", "MANAG_TYPE_CD", null, null, String.class, "managTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuCd = cci("HINMOKU_CD", "HINMOKU_CD", null, null, String.class, "hinmokuCd", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuGroup = cci("HINMOKU_GROUP", "HINMOKU_GROUP", null, null, String.class, "hinmokuGroup", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHinmokuText = cci("HINMOKU_TEXT", "HINMOKU_TEXT", null, null, String.class, "hinmokuText", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJanCd = cci("JAN_CD", "JAN_CD", null, null, String.class, "janCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, String.class, "num", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSerialNo = cci("SERIAL_NO", "SERIAL_NO", null, null, String.class, "serialNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLotManagTypeCd = cci("LOT_MANAG_TYPE_CD", "LOT_MANAG_TYPE_CD", null, null, String.class, "lotManagTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * SCM_LABEL_ID: {PK, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScmLabelId() { return _columnScmLabelId; }
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
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * PACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNo() { return _columnPackingNo; }
    /**
     * CARTON_ID_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCartonIdNo() { return _columnCartonIdNo; }
    /**
     * SN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSn() { return _columnSn; }
    /**
     * MANAG_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnManagTypeCd() { return _columnManagTypeCd; }
    /**
     * HINMOKU_CD: {VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuCd() { return _columnHinmokuCd; }
    /**
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHinmokuGroup() { return _columnHinmokuGroup; }
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
     * SERIAL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSerialNo() { return _columnSerialNo; }
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
     * LIMIT_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * PROD_DT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
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
        ls.add(columnScmLabelId());
        ls.add(columnReceiveCd());
        ls.add(columnReceiveRowId());
        ls.add(columnImportFlg());
        ls.add(columnErrorFlg());
        ls.add(columnErrorMessageCd());
        ls.add(columnShippingSlipNo());
        ls.add(columnPackingNo());
        ls.add(columnCartonIdNo());
        ls.add(columnSn());
        ls.add(columnManagTypeCd());
        ls.add(columnHinmokuCd());
        ls.add(columnHinmokuGroup());
        ls.add(columnHinmokuText());
        ls.add(columnJanCd());
        ls.add(columnNum());
        ls.add(columnSerialNo());
        ls.add(columnLotManagTypeCd());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnProdDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnScmLabelId()); }
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.ErScmLabel"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.ErScmLabelCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.ErScmLabelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ErScmLabel> getEntityType() { return ErScmLabel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ErScmLabel newEntity() { return new ErScmLabel(); }
    public ErScmLabel newMyEntity() { return new ErScmLabel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ErScmLabel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ErScmLabel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
