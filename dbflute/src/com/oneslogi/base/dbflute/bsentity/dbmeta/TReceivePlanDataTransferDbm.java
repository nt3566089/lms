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
 * The DB meta of t_receive_plan_data_transfer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanDataTransferDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceivePlanDataTransferDbm _instance = new TReceivePlanDataTransferDbm();
    private TReceivePlanDataTransferDbm() {}
    public static TReceivePlanDataTransferDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getReceivePlanDataTransferId(), (et, vl) -> ((TReceivePlanDataTransfer)et).setReceivePlanDataTransferId(ctl(vl)), "receivePlanDataTransferId");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getReceivePlanBId(), (et, vl) -> ((TReceivePlanDataTransfer)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr01(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr01((String)vl), "dataTransferOnlyStr01");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr02(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr02((String)vl), "dataTransferOnlyStr02");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr03(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr03((String)vl), "dataTransferOnlyStr03");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr04(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr04((String)vl), "dataTransferOnlyStr04");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr05(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr05((String)vl), "dataTransferOnlyStr05");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr06(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr06((String)vl), "dataTransferOnlyStr06");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr07(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr07((String)vl), "dataTransferOnlyStr07");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr08(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr08((String)vl), "dataTransferOnlyStr08");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr09(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr09((String)vl), "dataTransferOnlyStr09");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr10(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr10((String)vl), "dataTransferOnlyStr10");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr11(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr11((String)vl), "dataTransferOnlyStr11");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr12(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr12((String)vl), "dataTransferOnlyStr12");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr13(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr13((String)vl), "dataTransferOnlyStr13");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr14(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr14((String)vl), "dataTransferOnlyStr14");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr15(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr15((String)vl), "dataTransferOnlyStr15");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr16(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr16((String)vl), "dataTransferOnlyStr16");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr17(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr17((String)vl), "dataTransferOnlyStr17");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr18(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr18((String)vl), "dataTransferOnlyStr18");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr19(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr19((String)vl), "dataTransferOnlyStr19");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr20(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr20((String)vl), "dataTransferOnlyStr20");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr21(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr21((String)vl), "dataTransferOnlyStr21");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr22(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr22((String)vl), "dataTransferOnlyStr22");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr23(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr23((String)vl), "dataTransferOnlyStr23");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr24(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr24((String)vl), "dataTransferOnlyStr24");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr25(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr25((String)vl), "dataTransferOnlyStr25");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr26(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr26((String)vl), "dataTransferOnlyStr26");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr27(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr27((String)vl), "dataTransferOnlyStr27");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDataTransferOnlyStr28(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDataTransferOnlyStr28((String)vl), "dataTransferOnlyStr28");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getDelFlg(), (et, vl) -> ((TReceivePlanDataTransfer)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getVersionNo(), (et, vl) -> ((TReceivePlanDataTransfer)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getControlNo(), (et, vl) -> ((TReceivePlanDataTransfer)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getAddDt(), (et, vl) -> ((TReceivePlanDataTransfer)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getAddUser(), (et, vl) -> ((TReceivePlanDataTransfer)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getAddProcess(), (et, vl) -> ((TReceivePlanDataTransfer)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getUpdDt(), (et, vl) -> ((TReceivePlanDataTransfer)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getUpdUser(), (et, vl) -> ((TReceivePlanDataTransfer)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceivePlanDataTransfer)et).getUpdProcess(), (et, vl) -> ((TReceivePlanDataTransfer)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceivePlanDataTransfer)et).getTReceivePlanB(), (et, vl) -> ((TReceivePlanDataTransfer)et).setTReceivePlanB((TReceivePlanB)vl), "TReceivePlanB");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_receive_plan_data_transfer";
    protected final String _tableDispName = "t_receive_plan_data_transfer";
    protected final String _tablePropertyName = "TReceivePlanDataTransfer";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_receive_plan_data_transfer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceivePlanDataTransferId = cci("RECEIVE_PLAN_DATA_TRANSFER_ID", "RECEIVE_PLAN_DATA_TRANSFER_ID", null, null, Long.class, "receivePlanDataTransferId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, true, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TReceivePlanB", null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr01 = cci("DATA_TRANSFER_ONLY_STR01", "DATA_TRANSFER_ONLY_STR01", null, null, String.class, "dataTransferOnlyStr01", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr02 = cci("DATA_TRANSFER_ONLY_STR02", "DATA_TRANSFER_ONLY_STR02", null, null, String.class, "dataTransferOnlyStr02", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr03 = cci("DATA_TRANSFER_ONLY_STR03", "DATA_TRANSFER_ONLY_STR03", null, null, String.class, "dataTransferOnlyStr03", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr04 = cci("DATA_TRANSFER_ONLY_STR04", "DATA_TRANSFER_ONLY_STR04", null, null, String.class, "dataTransferOnlyStr04", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr05 = cci("DATA_TRANSFER_ONLY_STR05", "DATA_TRANSFER_ONLY_STR05", null, null, String.class, "dataTransferOnlyStr05", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr06 = cci("DATA_TRANSFER_ONLY_STR06", "DATA_TRANSFER_ONLY_STR06", null, null, String.class, "dataTransferOnlyStr06", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr07 = cci("DATA_TRANSFER_ONLY_STR07", "DATA_TRANSFER_ONLY_STR07", null, null, String.class, "dataTransferOnlyStr07", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr08 = cci("DATA_TRANSFER_ONLY_STR08", "DATA_TRANSFER_ONLY_STR08", null, null, String.class, "dataTransferOnlyStr08", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr09 = cci("DATA_TRANSFER_ONLY_STR09", "DATA_TRANSFER_ONLY_STR09", null, null, String.class, "dataTransferOnlyStr09", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr10 = cci("DATA_TRANSFER_ONLY_STR10", "DATA_TRANSFER_ONLY_STR10", null, null, String.class, "dataTransferOnlyStr10", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr11 = cci("DATA_TRANSFER_ONLY_STR11", "DATA_TRANSFER_ONLY_STR11", null, null, String.class, "dataTransferOnlyStr11", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr12 = cci("DATA_TRANSFER_ONLY_STR12", "DATA_TRANSFER_ONLY_STR12", null, null, String.class, "dataTransferOnlyStr12", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr13 = cci("DATA_TRANSFER_ONLY_STR13", "DATA_TRANSFER_ONLY_STR13", null, null, String.class, "dataTransferOnlyStr13", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr14 = cci("DATA_TRANSFER_ONLY_STR14", "DATA_TRANSFER_ONLY_STR14", null, null, String.class, "dataTransferOnlyStr14", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr15 = cci("DATA_TRANSFER_ONLY_STR15", "DATA_TRANSFER_ONLY_STR15", null, null, String.class, "dataTransferOnlyStr15", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr16 = cci("DATA_TRANSFER_ONLY_STR16", "DATA_TRANSFER_ONLY_STR16", null, null, String.class, "dataTransferOnlyStr16", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr17 = cci("DATA_TRANSFER_ONLY_STR17", "DATA_TRANSFER_ONLY_STR17", null, null, String.class, "dataTransferOnlyStr17", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr18 = cci("DATA_TRANSFER_ONLY_STR18", "DATA_TRANSFER_ONLY_STR18", null, null, String.class, "dataTransferOnlyStr18", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr19 = cci("DATA_TRANSFER_ONLY_STR19", "DATA_TRANSFER_ONLY_STR19", null, null, String.class, "dataTransferOnlyStr19", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr20 = cci("DATA_TRANSFER_ONLY_STR20", "DATA_TRANSFER_ONLY_STR20", null, null, String.class, "dataTransferOnlyStr20", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr21 = cci("DATA_TRANSFER_ONLY_STR21", "DATA_TRANSFER_ONLY_STR21", null, null, String.class, "dataTransferOnlyStr21", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr22 = cci("DATA_TRANSFER_ONLY_STR22", "DATA_TRANSFER_ONLY_STR22", null, null, String.class, "dataTransferOnlyStr22", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr23 = cci("DATA_TRANSFER_ONLY_STR23", "DATA_TRANSFER_ONLY_STR23", null, null, String.class, "dataTransferOnlyStr23", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr24 = cci("DATA_TRANSFER_ONLY_STR24", "DATA_TRANSFER_ONLY_STR24", null, null, String.class, "dataTransferOnlyStr24", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr25 = cci("DATA_TRANSFER_ONLY_STR25", "DATA_TRANSFER_ONLY_STR25", null, null, String.class, "dataTransferOnlyStr25", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr26 = cci("DATA_TRANSFER_ONLY_STR26", "DATA_TRANSFER_ONLY_STR26", null, null, String.class, "dataTransferOnlyStr26", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr27 = cci("DATA_TRANSFER_ONLY_STR27", "DATA_TRANSFER_ONLY_STR27", null, null, String.class, "dataTransferOnlyStr27", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDataTransferOnlyStr28 = cci("DATA_TRANSFER_ONLY_STR28", "DATA_TRANSFER_ONLY_STR28", null, null, String.class, "dataTransferOnlyStr28", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanDataTransferId() { return _columnReceivePlanDataTransferId; }
    /**
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr01() { return _columnDataTransferOnlyStr01; }
    /**
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr02() { return _columnDataTransferOnlyStr02; }
    /**
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr03() { return _columnDataTransferOnlyStr03; }
    /**
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr04() { return _columnDataTransferOnlyStr04; }
    /**
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr05() { return _columnDataTransferOnlyStr05; }
    /**
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr06() { return _columnDataTransferOnlyStr06; }
    /**
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr07() { return _columnDataTransferOnlyStr07; }
    /**
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr08() { return _columnDataTransferOnlyStr08; }
    /**
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr09() { return _columnDataTransferOnlyStr09; }
    /**
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr10() { return _columnDataTransferOnlyStr10; }
    /**
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr11() { return _columnDataTransferOnlyStr11; }
    /**
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr12() { return _columnDataTransferOnlyStr12; }
    /**
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr13() { return _columnDataTransferOnlyStr13; }
    /**
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr14() { return _columnDataTransferOnlyStr14; }
    /**
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr15() { return _columnDataTransferOnlyStr15; }
    /**
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr16() { return _columnDataTransferOnlyStr16; }
    /**
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr17() { return _columnDataTransferOnlyStr17; }
    /**
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr18() { return _columnDataTransferOnlyStr18; }
    /**
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr19() { return _columnDataTransferOnlyStr19; }
    /**
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr20() { return _columnDataTransferOnlyStr20; }
    /**
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr21() { return _columnDataTransferOnlyStr21; }
    /**
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr22() { return _columnDataTransferOnlyStr22; }
    /**
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr23() { return _columnDataTransferOnlyStr23; }
    /**
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr24() { return _columnDataTransferOnlyStr24; }
    /**
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr25() { return _columnDataTransferOnlyStr25; }
    /**
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr26() { return _columnDataTransferOnlyStr26; }
    /**
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr27() { return _columnDataTransferOnlyStr27; }
    /**
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDataTransferOnlyStr28() { return _columnDataTransferOnlyStr28; }
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
        ls.add(columnReceivePlanDataTransferId());
        ls.add(columnReceivePlanBId());
        ls.add(columnDataTransferOnlyStr01());
        ls.add(columnDataTransferOnlyStr02());
        ls.add(columnDataTransferOnlyStr03());
        ls.add(columnDataTransferOnlyStr04());
        ls.add(columnDataTransferOnlyStr05());
        ls.add(columnDataTransferOnlyStr06());
        ls.add(columnDataTransferOnlyStr07());
        ls.add(columnDataTransferOnlyStr08());
        ls.add(columnDataTransferOnlyStr09());
        ls.add(columnDataTransferOnlyStr10());
        ls.add(columnDataTransferOnlyStr11());
        ls.add(columnDataTransferOnlyStr12());
        ls.add(columnDataTransferOnlyStr13());
        ls.add(columnDataTransferOnlyStr14());
        ls.add(columnDataTransferOnlyStr15());
        ls.add(columnDataTransferOnlyStr16());
        ls.add(columnDataTransferOnlyStr17());
        ls.add(columnDataTransferOnlyStr18());
        ls.add(columnDataTransferOnlyStr19());
        ls.add(columnDataTransferOnlyStr20());
        ls.add(columnDataTransferOnlyStr21());
        ls.add(columnDataTransferOnlyStr22());
        ls.add(columnDataTransferOnlyStr23());
        ls.add(columnDataTransferOnlyStr24());
        ls.add(columnDataTransferOnlyStr25());
        ls.add(columnDataTransferOnlyStr26());
        ls.add(columnDataTransferOnlyStr27());
        ls.add(columnDataTransferOnlyStr28());
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
    protected UniqueInfo cpui() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnReceivePlanDataTransferId());
        ls.add(columnReceivePlanBId());
        return hpcpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanBDbm.getInstance().columnReceivePlanBId());
        return cfi("T_RECEIVE_PLAN_DATA_TRANSFER_FK1", "TReceivePlanB", this, TReceivePlanBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TReceivePlanDataTransferList", false);
    }

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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceivePlanDataTransfer"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceivePlanDataTransferCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceivePlanDataTransferBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceivePlanDataTransfer> getEntityType() { return TReceivePlanDataTransfer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceivePlanDataTransfer newEntity() { return new TReceivePlanDataTransfer(); }
    public TReceivePlanDataTransfer newMyEntity() { return new TReceivePlanDataTransfer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceivePlanDataTransfer)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceivePlanDataTransfer)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
