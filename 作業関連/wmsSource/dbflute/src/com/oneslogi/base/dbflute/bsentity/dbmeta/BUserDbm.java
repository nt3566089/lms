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
 * The DB meta of b_user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BUserDbm _instance = new BUserDbm();
    private BUserDbm() {}
    public static BUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((BUser)et).getUserId(), (et, vl) -> ((BUser)et).setUserId(ctl(vl)), "userId");
        setupEpg(_epgMap, et -> ((BUser)et).getUserCd(), (et, vl) -> ((BUser)et).setUserCd((String)vl), "userCd");
        setupEpg(_epgMap, et -> ((BUser)et).getUserNm(), (et, vl) -> ((BUser)et).setUserNm((String)vl), "userNm");
        setupEpg(_epgMap, et -> ((BUser)et).getCultureId(), (et, vl) -> ((BUser)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((BUser)et).getRoleGrpId(), (et, vl) -> ((BUser)et).setRoleGrpId(ctl(vl)), "roleGrpId");
        setupEpg(_epgMap, et -> ((BUser)et).getDelFlg(), (et, vl) -> ((BUser)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((BUser)et).getVersionNo(), (et, vl) -> ((BUser)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((BUser)et).getControlNo(), (et, vl) -> ((BUser)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((BUser)et).getAddDt(), (et, vl) -> ((BUser)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((BUser)et).getAddUser(), (et, vl) -> ((BUser)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((BUser)et).getAddProcess(), (et, vl) -> ((BUser)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((BUser)et).getUpdDt(), (et, vl) -> ((BUser)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((BUser)et).getUpdUser(), (et, vl) -> ((BUser)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((BUser)et).getUpdProcess(), (et, vl) -> ((BUser)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((BUser)et).getBCulture(), (et, vl) -> ((BUser)et).setBCulture((BCulture)vl), "BCulture");
        setupEfpg(_efpgMap, et -> ((BUser)et).getBRoleGrp(), (et, vl) -> ((BUser)et).setBRoleGrp((BRoleGrp)vl), "BRoleGrp");
        setupEfpg(_efpgMap, et -> ((BUser)et).getBClassDtlByDelFlg(), (et, vl) -> ((BUser)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
        setupEfpg(_efpgMap, et -> ((BUser)et).getBUserAuthAsOne(), (et, vl) -> ((BUser)et).setBUserAuthAsOne((BUserAuth)vl), "BUserAuthAsOne");
        setupEfpg(_efpgMap, et -> ((BUser)et).getMUserLoginAsOne(), (et, vl) -> ((BUser)et).setMUserLoginAsOne((MUserLogin)vl), "MUserLoginAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "b_user";
    protected final String _tableDispName = "b_user";
    protected final String _tablePropertyName = "BUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("b_user", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, Long.class, "userId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "MUserCenterList,MUserClientList,MUserDepositList,TEcOrderRList,TInventoryBByInventoryUpdUserIdList,TInventoryBByInventoryUserIdList,TInventoryRByInventoryRecordLocOutUserIdList,TInventoryRByStockDiffOutUserIdList,TInventoryRByTwlOutUserIdList,TInventoryRByInventoryRecordOutUserIdList,TInventoryRByInventoryDiffOutUserIdList,TMoveInstRList,TMoveRecordBList,TNizoroeAlarmLogList,TPackingRByStwOutUserIdList,TPackingRByInspectionOutUserIdList,TPackingRByTagOutUserIdList,TPickingRByCaseOutUserIdList,TPickingRByBolOutUserIdList,TPickingRByPl1OutUserIdList,TPickingRByTagOutUserIdList,TPickingRByShippingRecordOutUserIdList,TPickingRByDelivOutUserIdList,TPickingRByIndvSupplyOutUserIdList,TPickingRByPackingOutUserIdList,TPickingRByPlOutUserIdList,TPickingRByIndvLabelOutUserIdList,TPickingRByPl2OutUserIdList,TPickingRBySlipOutUserIdList,TPickingRByNizoroeOutUserIdList,TPickingRByPllOutUserIdList,TReceiveLabelList,TReceivePlanRList,TStoreNoRList,TStoreRecordRList,WSglRowShipInspBList", null, false);
    protected final ColumnInfo _columnUserCd = cci("USER_CD", "USER_CD", null, null, String.class, "userCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, "TPackingHByUpdUserList", null, false);
    protected final ColumnInfo _columnUserNm = cci("USER_NM", "USER_NM", null, null, String.class, "userNm", null, false, false, true, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
    protected final ColumnInfo _columnRoleGrpId = cci("ROLE_GRP_ID", "ROLE_GRP_ID", null, null, Long.class, "roleGrpId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BRoleGrp", null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("DEL_FLG", "DEL_FLG", null, null, String.class, "delFlg", null, false, false, true, "CHAR", 1, 0, null, "0", true, null, null, "BClassDtlByDelFlg", null, CDef.DefMeta.DelFlg, false);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, Long.class, "versionNo", null, false, false, true, "BIGINT", 19, 0, null, "0", true, OptimisticLockType.VERSION_NO, null, null, null, null, false);
    protected final ColumnInfo _columnControlNo = cci("CONTROL_NO", "CONTROL_NO", null, null, Long.class, "controlNo", null, false, false, false, "BIGINT", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddDt = cci("ADD_DT", "ADD_DT", null, null, java.sql.Timestamp.class, "addDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddUser = cci("ADD_USER", "ADD_USER", null, null, String.class, "addUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddProcess = cci("ADD_PROCESS", "ADD_PROCESS", null, null, String.class, "addProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdDt = cci("UPD_DT", "UPD_DT", null, null, java.sql.Timestamp.class, "updDt", null, false, false, false, "DATETIME", 19, 0, 3, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdUser = cci("UPD_USER", "UPD_USER", null, null, String.class, "updUser", null, false, false, false, "VARCHAR", 60, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdProcess = cci("UPD_PROCESS", "UPD_PROCESS", null, null, String.class, "updProcess", null, false, false, false, "VARCHAR", 255, 0, null, null, true, null, null, null, null, null, false);

    /**
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserCd() { return _columnUserCd; }
    /**
     * USER_NM: {NotNull, VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserNm() { return _columnUserNm; }
    /**
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
    /**
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRoleGrpId() { return _columnRoleGrpId; }
    /**
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
        ls.add(columnUserId());
        ls.add(columnUserCd());
        ls.add(columnUserNm());
        ls.add(columnCultureId());
        ls.add(columnRoleGrpId());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUserCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("B_USER_FK1", "BCulture", this, BCultureDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "BUserList", false);
    }
    /**
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBRoleGrp() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRoleGrpId(), BRoleGrpDbm.getInstance().columnRoleGrpId());
        return cfi("B_USER_FK2", "BRoleGrp", this, BRoleGrpDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "BUserList", false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_B_USER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }
    /**
     * b_user_auth by USER_ID, named 'BUserAuthAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignBUserAuthAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), BUserAuthDbm.getInstance().columnUserId());
        return cfi("B_USER_AUTH_FK1", "BUserAuthAsOne", this, BUserAuthDbm.getInstance(), mp, 3, null, true, false, true, false, null, null, false, "BUser", false);
    }
    /**
     * m_user_login by USER_ID, named 'MUserLoginAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignMUserLoginAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), MUserLoginDbm.getInstance().columnUserId());
        return cfi("M_USER_LOGIN_FK2", "MUserLoginAsOne", this, MUserLoginDbm.getInstance(), mp, 4, null, true, false, true, false, null, null, false, "BUser", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_user_center by USER_ID, named 'MUserCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), MUserCenterDbm.getInstance().columnUserId());
        return cri("M_USER_CENTER_FK2", "MUserCenterList", this, MUserCenterDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * m_user_client by USER_ID, named 'MUserClientList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserClientList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), MUserClientDbm.getInstance().columnUserId());
        return cri("M_USER_CLIENT_FK1", "MUserClientList", this, MUserClientDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * m_user_deposit by USER_ID, named 'MUserDepositList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserDepositList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), MUserDepositDbm.getInstance().columnUserId());
        return cri("M_USER_DEPOSIT_FK2", "MUserDepositList", this, MUserDepositDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_ec_order_r by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderRList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TEcOrderRDbm.getInstance().columnStatementOutUserId());
        return cri("T_EC_ORDER_R_FK2", "TEcOrderRList", this, TEcOrderRDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_inventory_b by INVENTORY_UPD_USER_ID, named 'TInventoryBByInventoryUpdUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBByInventoryUpdUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryBDbm.getInstance().columnInventoryUpdUserId());
        return cri("T_INVENTORY_B_FK1", "TInventoryBByInventoryUpdUserIdList", this, TInventoryBDbm.getInstance(), mp, false, "BUserByInventoryUpdUserId");
    }
    /**
     * t_inventory_b by INVENTORY_USER_ID, named 'TInventoryBByInventoryUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBByInventoryUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryBDbm.getInstance().columnInventoryUserId());
        return cri("T_INVENTORY_B_FK12", "TInventoryBByInventoryUserIdList", this, TInventoryBDbm.getInstance(), mp, false, "BUserByInventoryUserId");
    }
    /**
     * t_inventory_r by INVENTORY_RECORD_LOC_OUT_USER_ID, named 'TInventoryRByInventoryRecordLocOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryRByInventoryRecordLocOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryRDbm.getInstance().columnInventoryRecordLocOutUserId());
        return cri("T_INVENTORY_R_FK2", "TInventoryRByInventoryRecordLocOutUserIdList", this, TInventoryRDbm.getInstance(), mp, false, "BUserByInventoryRecordLocOutUserId");
    }
    /**
     * t_inventory_r by STOCK_DIFF_OUT_USER_ID, named 'TInventoryRByStockDiffOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryRByStockDiffOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryRDbm.getInstance().columnStockDiffOutUserId());
        return cri("T_INVENTORY_R_FK1", "TInventoryRByStockDiffOutUserIdList", this, TInventoryRDbm.getInstance(), mp, false, "BUserByStockDiffOutUserId");
    }
    /**
     * t_inventory_r by TWL_OUT_USER_ID, named 'TInventoryRByTwlOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryRByTwlOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryRDbm.getInstance().columnTwlOutUserId());
        return cri("T_INVENTORY_R_FK5", "TInventoryRByTwlOutUserIdList", this, TInventoryRDbm.getInstance(), mp, false, "BUserByTwlOutUserId");
    }
    /**
     * t_inventory_r by INVENTORY_RECORD_OUT_USER_ID, named 'TInventoryRByInventoryRecordOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryRByInventoryRecordOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryRDbm.getInstance().columnInventoryRecordOutUserId());
        return cri("T_INVENTORY_R_FK3", "TInventoryRByInventoryRecordOutUserIdList", this, TInventoryRDbm.getInstance(), mp, false, "BUserByInventoryRecordOutUserId");
    }
    /**
     * t_inventory_r by INVENTORY_DIFF_OUT_USER_ID, named 'TInventoryRByInventoryDiffOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryRByInventoryDiffOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TInventoryRDbm.getInstance().columnInventoryDiffOutUserId());
        return cri("T_INVENTORY_R_FK4", "TInventoryRByInventoryDiffOutUserIdList", this, TInventoryRDbm.getInstance(), mp, false, "BUserByInventoryDiffOutUserId");
    }
    /**
     * t_move_inst_r by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstRList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TMoveInstRDbm.getInstance().columnInstOutUserId());
        return cri("T_MOVE_INST_R_FK2", "TMoveInstRList", this, TMoveInstRDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_move_record_b by USER_ID, named 'TMoveRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TMoveRecordBDbm.getInstance().columnUserId());
        return cri("T_MOVE_RECORD_B_FK2", "TMoveRecordBList", this, TMoveRecordBDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_nizoroe_alarm_log by OUT_USER_ID, named 'TNizoroeAlarmLogList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTNizoroeAlarmLogList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TNizoroeAlarmLogDbm.getInstance().columnOutUserId());
        return cri("T_NIZOROE_ALARM_LOG_FK1", "TNizoroeAlarmLogList", this, TNizoroeAlarmLogDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_packing_r by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingRByStwOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPackingRDbm.getInstance().columnStwOutUserId());
        return cri("T_PACKING_R_FK2", "TPackingRByStwOutUserIdList", this, TPackingRDbm.getInstance(), mp, false, "BUserByStwOutUserId");
    }
    /**
     * t_packing_r by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingRByInspectionOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPackingRDbm.getInstance().columnInspectionOutUserId());
        return cri("T_PACKING_R_FK3", "TPackingRByInspectionOutUserIdList", this, TPackingRDbm.getInstance(), mp, false, "BUserByInspectionOutUserId");
    }
    /**
     * t_packing_r by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingRByTagOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPackingRDbm.getInstance().columnTagOutUserId());
        return cri("T_PACKING_R_FK4", "TPackingRByTagOutUserIdList", this, TPackingRDbm.getInstance(), mp, false, "BUserByTagOutUserId");
    }
    /**
     * t_picking_r by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByCaseOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnCaseOutUserId());
        return cri("T_PICKING_R_FK14", "TPickingRByCaseOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByCaseOutUserId");
    }
    /**
     * t_picking_r by BOL_OUT_USER_ID, named 'TPickingRByBolOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByBolOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnBolOutUserId());
        return cri("T_PICKING_R_FK10", "TPickingRByBolOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByBolOutUserId");
    }
    /**
     * t_picking_r by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByPl1OutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnPl1OutUserId());
        return cri("T_PICKING_R_FK9", "TPickingRByPl1OutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByPl1OutUserId");
    }
    /**
     * t_picking_r by TAG_OUT_USER_ID, named 'TPickingRByTagOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByTagOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnTagOutUserId());
        return cri("T_PICKING_R_FK11", "TPickingRByTagOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByTagOutUserId");
    }
    /**
     * t_picking_r by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByShippingRecordOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnShippingRecordOutUserId());
        return cri("T_PICKING_R_FK13", "TPickingRByShippingRecordOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByShippingRecordOutUserId");
    }
    /**
     * t_picking_r by DELIV_OUT_USER_ID, named 'TPickingRByDelivOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByDelivOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnDelivOutUserId());
        return cri("T_PICKING_R_FK3", "TPickingRByDelivOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByDelivOutUserId");
    }
    /**
     * t_picking_r by INDV_SUPPLY_OUT_USER_ID, named 'TPickingRByIndvSupplyOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByIndvSupplyOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnIndvSupplyOutUserId());
        return cri("T_PICKING_R_FK6", "TPickingRByIndvSupplyOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByIndvSupplyOutUserId");
    }
    /**
     * t_picking_r by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByPackingOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnPackingOutUserId());
        return cri("T_PICKING_R_FK7", "TPickingRByPackingOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByPackingOutUserId");
    }
    /**
     * t_picking_r by PL_OUT_USER_ID, named 'TPickingRByPlOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByPlOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnPlOutUserId());
        return cri("T_PICKING_R_FK12", "TPickingRByPlOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByPlOutUserId");
    }
    /**
     * t_picking_r by INDV_LABEL_OUT_USER_ID, named 'TPickingRByIndvLabelOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByIndvLabelOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnIndvLabelOutUserId());
        return cri("T_PICKING_R_FK5", "TPickingRByIndvLabelOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByIndvLabelOutUserId");
    }
    /**
     * t_picking_r by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByPl2OutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnPl2OutUserId());
        return cri("T_PICKING_R_FK8", "TPickingRByPl2OutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByPl2OutUserId");
    }
    /**
     * t_picking_r by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRBySlipOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnSlipOutUserId());
        return cri("T_PICKING_R_FK15", "TPickingRBySlipOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserBySlipOutUserId");
    }
    /**
     * t_picking_r by NIZOROE_OUT_USER_ID, named 'TPickingRByNizoroeOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByNizoroeOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnNizoroeOutUserId());
        return cri("T_PICKING_R_FK1", "TPickingRByNizoroeOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByNizoroeOutUserId");
    }
    /**
     * t_picking_r by PLL_OUT_USER_ID, named 'TPickingRByPllOutUserIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingRByPllOutUserIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TPickingRDbm.getInstance().columnPllOutUserId());
        return cri("T_PICKING_R_FK2", "TPickingRByPllOutUserIdList", this, TPickingRDbm.getInstance(), mp, false, "BUserByPllOutUserId");
    }
    /**
     * t_receive_label by RCV_LBL_OUT_USER_ID, named 'TReceiveLabelList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceiveLabelList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TReceiveLabelDbm.getInstance().columnRcvLblOutUserId());
        return cri("T_RECEIVE_LABEL_FK2", "TReceiveLabelList", this, TReceiveLabelDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_receive_plan_r by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanRList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TReceivePlanRDbm.getInstance().columnRplOutUserId());
        return cri("T_RECEIVE_PLAN_R_FK1", "TReceivePlanRList", this, TReceivePlanRDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_store_no_r by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreNoRList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TStoreNoRDbm.getInstance().columnTwlOutUserId());
        return cri("T_STORE_NO_R_FK2", "TStoreNoRList", this, TStoreNoRDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_store_record_r by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordRList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), TStoreRecordRDbm.getInstance().columnReceiveRecordOutUserId());
        return cri("T_STORE_RECORD_R_FK1", "TStoreRecordRList", this, TStoreRecordRDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * w_sgl_row_ship_insp_b by USER_ID, named 'WSglRowShipInspBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), WSglRowShipInspBDbm.getInstance().columnUserId());
        return cri("W_SGL_ROW_SHIP_INSP_B_FK3", "WSglRowShipInspBList", this, WSglRowShipInspBDbm.getInstance(), mp, false, "BUser");
    }
    /**
     * t_packing_h by UPD_USER, named 'TPackingHByUpdUserList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHByUpdUserList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserCd(), TPackingHDbm.getInstance().columnUpdUser());
        return cri("FK_T_PACKING_H_TO_B_USER_BY_UPD", "TPackingHByUpdUserList", this, TPackingHDbm.getInstance(), mp, false, "BUserByUpdUser");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.BUser"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.BUserCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.BUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BUser> getEntityType() { return BUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public BUser newEntity() { return new BUser(); }
    public BUser newMyEntity() { return new BUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((BUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((BUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
