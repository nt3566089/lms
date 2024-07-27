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
 * The DB meta of t_store_record_b. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordBDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TStoreRecordBDbm _instance = new TStoreRecordBDbm();
    private TStoreRecordBDbm() {}
    public static TStoreRecordBDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreRecordBId(), (et, vl) -> ((TStoreRecordB)et).setStoreRecordBId(ctl(vl)), "storeRecordBId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreRecordHId(), (et, vl) -> ((TStoreRecordB)et).setStoreRecordHId(ctl(vl)), "storeRecordHId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getReceivePlanBId(), (et, vl) -> ((TStoreRecordB)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getProcessNo(), (et, vl) -> ((TStoreRecordB)et).setProcessNo((String)vl), "processNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getClientOrderNo(), (et, vl) -> ((TStoreRecordB)et).setClientOrderNo((String)vl), "clientOrderNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getLot(), (et, vl) -> ((TStoreRecordB)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getLimitDt(), (et, vl) -> ((TStoreRecordB)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreDt(), (et, vl) -> ((TStoreRecordB)et).setStoreDt((String)vl), "storeDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreNum(), (et, vl) -> ((TStoreRecordB)et).setStoreNum(ctb(vl)), "storeNum");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreFlg(), (et, vl) -> ((TStoreRecordB)et).setStoreFlg((String)vl), "storeFlg");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreLocationId(), (et, vl) -> ((TStoreRecordB)et).setStoreLocationId(ctl(vl)), "storeLocationId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getInputType(), (et, vl) -> ((TStoreRecordB)et).setInputType((String)vl), "inputType");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getHtStoreInspectionDt(), (et, vl) -> ((TStoreRecordB)et).setHtStoreInspectionDt((String)vl), "htStoreInspectionDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getHtStoreInspectionUserId(), (et, vl) -> ((TStoreRecordB)et).setHtStoreInspectionUserId((String)vl), "htStoreInspectionUserId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreRecordBComment(), (et, vl) -> ((TStoreRecordB)et).setStoreRecordBComment((String)vl), "storeRecordBComment");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getProdDt(), (et, vl) -> ((TStoreRecordB)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreReasonCd(), (et, vl) -> ((TStoreRecordB)et).setStoreReasonCd((String)vl), "storeReasonCd");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getReceiveNo(), (et, vl) -> ((TStoreRecordB)et).setReceiveNo((String)vl), "receiveNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getProcessTypeCd(), (et, vl) -> ((TStoreRecordB)et).setProcessTypeCd((String)vl), "processTypeCd");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getSlipNo(), (et, vl) -> ((TStoreRecordB)et).setSlipNo((String)vl), "slipNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getReceiveUnitNum(), (et, vl) -> ((TStoreRecordB)et).setReceiveUnitNum(ctl(vl)), "receiveUnitNum");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getStoreRecordSendFlg(), (et, vl) -> ((TStoreRecordB)et).setStoreRecordSendFlg((String)vl), "storeRecordSendFlg");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getTransferSendFlg(), (et, vl) -> ((TStoreRecordB)et).setTransferSendFlg((String)vl), "transferSendFlg");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getProductStoreStatus(), (et, vl) -> ((TStoreRecordB)et).setProductStoreStatus((String)vl), "productStoreStatus");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getUserId(), (et, vl) -> ((TStoreRecordB)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getCmSendFlgStore(), (et, vl) -> ((TStoreRecordB)et).setCmSendFlgStore((String)vl), "cmSendFlgStore");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getCmSendFlgTransfer(), (et, vl) -> ((TStoreRecordB)et).setCmSendFlgTransfer((String)vl), "cmSendFlgTransfer");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getDelFlg(), (et, vl) -> ((TStoreRecordB)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getVersionNo(), (et, vl) -> ((TStoreRecordB)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getControlNo(), (et, vl) -> ((TStoreRecordB)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getAddDt(), (et, vl) -> ((TStoreRecordB)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getAddUser(), (et, vl) -> ((TStoreRecordB)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getAddProcess(), (et, vl) -> ((TStoreRecordB)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getUpdDt(), (et, vl) -> ((TStoreRecordB)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getUpdUser(), (et, vl) -> ((TStoreRecordB)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TStoreRecordB)et).getUpdProcess(), (et, vl) -> ((TStoreRecordB)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TStoreRecordB)et).getTStoreRecordH(), (et, vl) -> ((TStoreRecordB)et).setTStoreRecordH((TStoreRecordH)vl), "TStoreRecordH");
        setupEfpg(_efpgMap, et -> ((TStoreRecordB)et).getTReceivePlanB(), (et, vl) -> ((TStoreRecordB)et).setTReceivePlanB((TReceivePlanB)vl), "TReceivePlanB");
        setupEfpg(_efpgMap, et -> ((TStoreRecordB)et).getMLocation(), (et, vl) -> ((TStoreRecordB)et).setMLocation((MLocation)vl), "MLocation");
        setupEfpg(_efpgMap, et -> ((TStoreRecordB)et).getBClassDtlByInputType(), (et, vl) -> ((TStoreRecordB)et).setBClassDtlByInputType((BClassDtl)vl), "BClassDtlByInputType");
        setupEfpg(_efpgMap, et -> ((TStoreRecordB)et).getBClassDtlByStoreFlg(), (et, vl) -> ((TStoreRecordB)et).setBClassDtlByStoreFlg((BClassDtl)vl), "BClassDtlByStoreFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_store_record_b";
    protected final String _tableDispName = "t_store_record_b";
    protected final String _tablePropertyName = "TStoreRecordB";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_store_record_b", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStoreRecordBId = cci("STORE_RECORD_B_ID", "STORE_RECORD_B_ID", null, null, Long.class, "storeRecordBId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TStockInoutList", null, false);
    protected final ColumnInfo _columnStoreRecordHId = cci("STORE_RECORD_H_ID", "STORE_RECORD_H_ID", null, null, Long.class, "storeRecordHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TStoreRecordH", null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TReceivePlanB", null, null, false);
    protected final ColumnInfo _columnProcessNo = cci("PROCESS_NO", "PROCESS_NO", null, null, String.class, "processNo", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientOrderNo = cci("CLIENT_ORDER_NO", "CLIENT_ORDER_NO", null, null, String.class, "clientOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreDt = cci("STORE_DT", "STORE_DT", null, null, String.class, "storeDt", null, false, false, true, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreNum = cci("STORE_NUM", "STORE_NUM", null, null, java.math.BigDecimal.class, "storeNum", null, false, false, true, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreFlg = cci("STORE_FLG", "STORE_FLG", null, null, String.class, "storeFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, "BClassDtlByStoreFlg", null, CDef.DefMeta.StoreFlg, false);
    protected final ColumnInfo _columnStoreLocationId = cci("STORE_LOCATION_ID", "STORE_LOCATION_ID", null, null, Long.class, "storeLocationId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MLocation", null, null, false);
    protected final ColumnInfo _columnInputType = cci("INPUT_TYPE", "INPUT_TYPE", null, null, String.class, "inputType", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, "BClassDtlByInputType", null, CDef.DefMeta.InputType, false);
    protected final ColumnInfo _columnHtStoreInspectionDt = cci("HT_STORE_INSPECTION_DT", "HT_STORE_INSPECTION_DT", null, null, String.class, "htStoreInspectionDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHtStoreInspectionUserId = cci("HT_STORE_INSPECTION_USER_ID", "HT_STORE_INSPECTION_USER_ID", null, null, String.class, "htStoreInspectionUserId", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreRecordBComment = cci("STORE_RECORD_B_COMMENT", "STORE_RECORD_B_COMMENT", null, null, String.class, "storeRecordBComment", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreReasonCd = cci("STORE_REASON_CD", "STORE_REASON_CD", null, null, String.class, "storeReasonCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveNo = cci("RECEIVE_NO", "RECEIVE_NO", null, null, String.class, "receiveNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProcessTypeCd = cci("PROCESS_TYPE_CD", "PROCESS_TYPE_CD", null, null, String.class, "processTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipNo = cci("SLIP_NO", "SLIP_NO", null, null, String.class, "slipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveUnitNum = cci("RECEIVE_UNIT_NUM", "RECEIVE_UNIT_NUM", null, null, Long.class, "receiveUnitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreRecordSendFlg = cci("STORE_RECORD_SEND_FLG", "STORE_RECORD_SEND_FLG", null, null, String.class, "storeRecordSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTransferSendFlg = cci("TRANSFER_SEND_FLG", "TRANSFER_SEND_FLG", null, null, String.class, "transferSendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductStoreStatus = cci("PRODUCT_STORE_STATUS", "PRODUCT_STORE_STATUS", null, null, String.class, "productStoreStatus", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmSendFlgStore = cci("CM_SEND_FLG_STORE", "CM_SEND_FLG_STORE", null, null, String.class, "cmSendFlgStore", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCmSendFlgTransfer = cci("CM_SEND_FLG_TRANSFER", "CM_SEND_FLG_TRANSFER", null, null, String.class, "cmSendFlgTransfer", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
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
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBId() { return _columnStoreRecordBId; }
    /**
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordHId() { return _columnStoreRecordHId; }
    /**
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProcessNo() { return _columnProcessNo; }
    /**
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientOrderNo() { return _columnClientOrderNo; }
    /**
     * LOT: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLot() { return _columnLot; }
    /**
     * LIMIT_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLimitDt() { return _columnLimitDt; }
    /**
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreDt() { return _columnStoreDt; }
    /**
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreNum() { return _columnStoreNum; }
    /**
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreFlg() { return _columnStoreFlg; }
    /**
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreLocationId() { return _columnStoreLocationId; }
    /**
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInputType() { return _columnInputType; }
    /**
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtStoreInspectionDt() { return _columnHtStoreInspectionDt; }
    /**
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtStoreInspectionUserId() { return _columnHtStoreInspectionUserId; }
    /**
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordBComment() { return _columnStoreRecordBComment; }
    /**
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * STORE_REASON_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreReasonCd() { return _columnStoreReasonCd; }
    /**
     * RECEIVE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveNo() { return _columnReceiveNo; }
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
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveUnitNum() { return _columnReceiveUnitNum; }
    /**
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreRecordSendFlg() { return _columnStoreRecordSendFlg; }
    /**
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTransferSendFlg() { return _columnTransferSendFlg; }
    /**
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStoreStatus() { return _columnProductStoreStatus; }
    /**
     * USER_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmSendFlgStore() { return _columnCmSendFlgStore; }
    /**
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCmSendFlgTransfer() { return _columnCmSendFlgTransfer; }
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
        ls.add(columnStoreRecordBId());
        ls.add(columnStoreRecordHId());
        ls.add(columnReceivePlanBId());
        ls.add(columnProcessNo());
        ls.add(columnClientOrderNo());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnStoreDt());
        ls.add(columnStoreNum());
        ls.add(columnStoreFlg());
        ls.add(columnStoreLocationId());
        ls.add(columnInputType());
        ls.add(columnHtStoreInspectionDt());
        ls.add(columnHtStoreInspectionUserId());
        ls.add(columnStoreRecordBComment());
        ls.add(columnProdDt());
        ls.add(columnStoreReasonCd());
        ls.add(columnReceiveNo());
        ls.add(columnProcessTypeCd());
        ls.add(columnSlipNo());
        ls.add(columnReceiveUnitNum());
        ls.add(columnStoreRecordSendFlg());
        ls.add(columnTransferSendFlg());
        ls.add(columnProductStoreStatus());
        ls.add(columnUserId());
        ls.add(columnCmSendFlgStore());
        ls.add(columnCmSendFlgTransfer());
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
    protected UniqueInfo cpui() { return hpcpui(columnStoreRecordBId()); }
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
    /**
     * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStoreRecordH() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordHId(), TStoreRecordHDbm.getInstance().columnStoreRecordHId());
        return cfi("T_STORE_RECORD_B_FK3", "TStoreRecordH", this, TStoreRecordHDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TStoreRecordBList", false);
    }
    /**
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanBDbm.getInstance().columnReceivePlanBId());
        return cfi("T_STORE_RECORD_B_FK2", "TReceivePlanB", this, TReceivePlanBDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TStoreRecordBList", false);
    }
    /**
     * m_location by my STORE_LOCATION_ID, named 'MLocation'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMLocation() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreLocationId(), MLocationDbm.getInstance().columnLocationId());
        return cfi("T_STORE_RECORD_B_FK1", "MLocation", this, MLocationDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TStoreRecordBList", false);
    }
    /**
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByInputType() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInputType(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_STORE_RECORD_B_INPUT_TYPE", "BClassDtlByInputType", this, BClassDtlDbm.getInstance(), mp, 3, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'INPUT_TYPE'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_class_dtl by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByStoreFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_T_STORE_RECORD_B_STORE_FLG", "BClassDtlByStoreFlg", this, BClassDtlDbm.getInstance(), mp, 4, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'STORE_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_stock_inout by STORE_RECORD_B_ID, named 'TStockInoutList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStockInoutList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStoreRecordBId(), TStockInoutDbm.getInstance().columnStoreRecordBId());
        return cri("T_STOCK_INOUT_FK4", "TStockInoutList", this, TStockInoutDbm.getInstance(), mp, false, "TStoreRecordB");
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TStoreRecordB"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TStoreRecordBCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TStoreRecordBBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TStoreRecordB> getEntityType() { return TStoreRecordB.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TStoreRecordB newEntity() { return new TStoreRecordB(); }
    public TStoreRecordB newMyEntity() { return new TStoreRecordB(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TStoreRecordB)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TStoreRecordB)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
