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
 * The DB meta of t_receive_label. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TReceiveLabelDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TReceiveLabelDbm _instance = new TReceiveLabelDbm();
    private TReceiveLabelDbm() {}
    public static TReceiveLabelDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReceiveLabelId(), (et, vl) -> ((TReceiveLabel)et).setReceiveLabelId(ctl(vl)), "receiveLabelId");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getStockId(), (et, vl) -> ((TReceiveLabel)et).setStockId(ctl(vl)), "stockId");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReceiveLabelNo(), (et, vl) -> ((TReceiveLabel)et).setReceiveLabelNo((String)vl), "receiveLabelNo");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getNum(), (et, vl) -> ((TReceiveLabel)et).setNum(ctb(vl)), "num");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getOwnerCd(), (et, vl) -> ((TReceiveLabel)et).setOwnerCd((String)vl), "ownerCd");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getOwnerAbbr(), (et, vl) -> ((TReceiveLabel)et).setOwnerAbbr((String)vl), "ownerAbbr");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getRecommendLocationCd(), (et, vl) -> ((TReceiveLabel)et).setRecommendLocationCd((String)vl), "recommendLocationCd");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getLocationCd(), (et, vl) -> ((TReceiveLabel)et).setLocationCd((String)vl), "locationCd");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getJancd(), (et, vl) -> ((TReceiveLabel)et).setJancd((String)vl), "jancd");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getProductNm(), (et, vl) -> ((TReceiveLabel)et).setProductNm((String)vl), "productNm");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getUnitNm(), (et, vl) -> ((TReceiveLabel)et).setUnitNm((String)vl), "unitNm");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getLot(), (et, vl) -> ((TReceiveLabel)et).setLot((String)vl), "lot");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getLimitDt(), (et, vl) -> ((TReceiveLabel)et).setLimitDt((String)vl), "limitDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getProdDt(), (et, vl) -> ((TReceiveLabel)et).setProdDt((String)vl), "prodDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReceiveDt(), (et, vl) -> ((TReceiveLabel)et).setReceiveDt((String)vl), "receiveDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getDepositFlg(), (et, vl) -> ((TReceiveLabel)et).setDepositFlg((String)vl), "depositFlg");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReprintFlg(), (et, vl) -> ((TReceiveLabel)et).setReprintFlg((String)vl), "reprintFlg");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReceiveUnitNum(), (et, vl) -> ((TReceiveLabel)et).setReceiveUnitNum(ctl(vl)), "receiveUnitNum");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getReceivePlanBId(), (et, vl) -> ((TReceiveLabel)et).setReceivePlanBId(ctl(vl)), "receivePlanBId");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getRcvLblOutUserId(), (et, vl) -> ((TReceiveLabel)et).setRcvLblOutUserId(ctl(vl)), "rcvLblOutUserId");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getRcvLblOutDt(), (et, vl) -> ((TReceiveLabel)et).setRcvLblOutDt(cttp(vl)), "rcvLblOutDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getDelFlg(), (et, vl) -> ((TReceiveLabel)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getVersionNo(), (et, vl) -> ((TReceiveLabel)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getControlNo(), (et, vl) -> ((TReceiveLabel)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getAddDt(), (et, vl) -> ((TReceiveLabel)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getAddUser(), (et, vl) -> ((TReceiveLabel)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getAddProcess(), (et, vl) -> ((TReceiveLabel)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getUpdDt(), (et, vl) -> ((TReceiveLabel)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getUpdUser(), (et, vl) -> ((TReceiveLabel)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TReceiveLabel)et).getUpdProcess(), (et, vl) -> ((TReceiveLabel)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TReceiveLabel)et).getTReceivePlanB(), (et, vl) -> ((TReceiveLabel)et).setTReceivePlanB((TReceivePlanB)vl), "TReceivePlanB");
        setupEfpg(_efpgMap, et -> ((TReceiveLabel)et).getTStock(), (et, vl) -> ((TReceiveLabel)et).setTStock((TStock)vl), "TStock");
        setupEfpg(_efpgMap, et -> ((TReceiveLabel)et).getBUser(), (et, vl) -> ((TReceiveLabel)et).setBUser((BUser)vl), "BUser");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_receive_label";
    protected final String _tableDispName = "t_receive_label";
    protected final String _tablePropertyName = "TReceiveLabel";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_receive_label", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnReceiveLabelId = cci("RECEIVE_LABEL_ID", "RECEIVE_LABEL_ID", null, null, Long.class, "receiveLabelId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStockId = cci("STOCK_ID", "STOCK_ID", null, null, Long.class, "stockId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "TStock", null, null, false);
    protected final ColumnInfo _columnReceiveLabelNo = cci("RECEIVE_LABEL_NO", "RECEIVE_LABEL_NO", null, null, String.class, "receiveLabelNo", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, java.math.BigDecimal.class, "num", null, false, false, false, "DECIMAL", 14, 4, null, "0.0000", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerCd = cci("OWNER_CD", "OWNER_CD", null, null, String.class, "ownerCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOwnerAbbr = cci("OWNER_ABBR", "OWNER_ABBR", null, null, String.class, "ownerAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRecommendLocationCd = cci("RECOMMEND_LOCATION_CD", "RECOMMEND_LOCATION_CD", null, null, String.class, "recommendLocationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationCd = cci("LOCATION_CD", "LOCATION_CD", null, null, String.class, "locationCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnJancd = cci("JANCD", "JANCD", null, null, String.class, "jancd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductNm = cci("PRODUCT_NM", "PRODUCT_NM", null, null, String.class, "productNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnitNm = cci("UNIT_NM", "UNIT_NM", null, null, String.class, "unitNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLot = cci("LOT", "LOT", null, null, String.class, "lot", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLimitDt = cci("LIMIT_DT", "LIMIT_DT", null, null, String.class, "limitDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProdDt = cci("PROD_DT", "PROD_DT", null, null, String.class, "prodDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveDt = cci("RECEIVE_DT", "RECEIVE_DT", null, null, String.class, "receiveDt", null, false, false, false, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDepositFlg = cci("DEPOSIT_FLG", "DEPOSIT_FLG", null, null, String.class, "depositFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReprintFlg = cci("REPRINT_FLG", "REPRINT_FLG", null, null, String.class, "reprintFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceiveUnitNum = cci("RECEIVE_UNIT_NUM", "RECEIVE_UNIT_NUM", null, null, Long.class, "receiveUnitNum", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReceivePlanBId = cci("RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", null, null, Long.class, "receivePlanBId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "TReceivePlanB", null, null, false);
    protected final ColumnInfo _columnRcvLblOutUserId = cci("RCV_LBL_OUT_USER_ID", "RCV_LBL_OUT_USER_ID", null, null, Long.class, "rcvLblOutUserId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BUser", null, null, false);
    protected final ColumnInfo _columnRcvLblOutDt = cci("RCV_LBL_OUT_DT", "RCV_LBL_OUT_DT", null, null, java.sql.Timestamp.class, "rcvLblOutDt", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
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
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLabelId() { return _columnReceiveLabelId; }
    /**
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStockId() { return _columnStockId; }
    /**
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveLabelNo() { return _columnReceiveLabelNo; }
    /**
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * OWNER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerCd() { return _columnOwnerCd; }
    /**
     * OWNER_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOwnerAbbr() { return _columnOwnerAbbr; }
    /**
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRecommendLocationCd() { return _columnRecommendLocationCd; }
    /**
     * LOCATION_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationCd() { return _columnLocationCd; }
    /**
     * JANCD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnJancd() { return _columnJancd; }
    /**
     * PRODUCT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductNm() { return _columnProductNm; }
    /**
     * UNIT_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnitNm() { return _columnUnitNm; }
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
     * PROD_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProdDt() { return _columnProdDt; }
    /**
     * RECEIVE_DT: {VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveDt() { return _columnReceiveDt; }
    /**
     * DEPOSIT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDepositFlg() { return _columnDepositFlg; }
    /**
     * REPRINT_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReprintFlg() { return _columnReprintFlg; }
    /**
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceiveUnitNum() { return _columnReceiveUnitNum; }
    /**
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReceivePlanBId() { return _columnReceivePlanBId; }
    /**
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvLblOutUserId() { return _columnRcvLblOutUserId; }
    /**
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRcvLblOutDt() { return _columnRcvLblOutDt; }
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
        ls.add(columnReceiveLabelId());
        ls.add(columnStockId());
        ls.add(columnReceiveLabelNo());
        ls.add(columnNum());
        ls.add(columnOwnerCd());
        ls.add(columnOwnerAbbr());
        ls.add(columnRecommendLocationCd());
        ls.add(columnLocationCd());
        ls.add(columnJancd());
        ls.add(columnProductNm());
        ls.add(columnUnitNm());
        ls.add(columnLot());
        ls.add(columnLimitDt());
        ls.add(columnProdDt());
        ls.add(columnReceiveDt());
        ls.add(columnDepositFlg());
        ls.add(columnReprintFlg());
        ls.add(columnReceiveUnitNum());
        ls.add(columnReceivePlanBId());
        ls.add(columnRcvLblOutUserId());
        ls.add(columnRcvLblOutDt());
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
    protected UniqueInfo cpui() { return hpcpui(columnReceiveLabelId()); }
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
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTReceivePlanB() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnReceivePlanBId(), TReceivePlanBDbm.getInstance().columnReceivePlanBId());
        return cfi("T_RECEIVE_LABEL_FK3", "TReceivePlanB", this, TReceivePlanBDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TReceiveLabelList", false);
    }
    /**
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignTStock() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnStockId(), TStockDbm.getInstance().columnStockId());
        return cfi("T_RECEIVE_LABEL_FK1", "TStock", this, TStockDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TReceiveLabelList", false);
    }
    /**
     * b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRcvLblOutUserId(), BUserDbm.getInstance().columnUserId());
        return cfi("T_RECEIVE_LABEL_FK2", "BUser", this, BUserDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "TReceiveLabelList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TReceiveLabel"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TReceiveLabelCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TReceiveLabelBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TReceiveLabel> getEntityType() { return TReceiveLabel.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TReceiveLabel newEntity() { return new TReceiveLabel(); }
    public TReceiveLabel newMyEntity() { return new TReceiveLabel(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TReceiveLabel)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TReceiveLabel)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
