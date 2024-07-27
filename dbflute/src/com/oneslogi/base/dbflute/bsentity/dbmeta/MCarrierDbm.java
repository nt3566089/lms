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
 * The DB meta of m_carrier. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCarrierDbm _instance = new MCarrierDbm();
    private MCarrierDbm() {}
    public static MCarrierDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCarrier)et).getCarrierId(), (et, vl) -> ((MCarrier)et).setCarrierId(ctl(vl)), "carrierId");
        setupEpg(_epgMap, et -> ((MCarrier)et).getCenterId(), (et, vl) -> ((MCarrier)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCarrier)et).getCommonCarrierId(), (et, vl) -> ((MCarrier)et).setCommonCarrierId(ctl(vl)), "commonCarrierId");
        setupEpg(_epgMap, et -> ((MCarrier)et).getCarrierCd(), (et, vl) -> ((MCarrier)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((MCarrier)et).getCarrierNm(), (et, vl) -> ((MCarrier)et).setCarrierNm((String)vl), "carrierNm");
        setupEpg(_epgMap, et -> ((MCarrier)et).getCarrierAbbr(), (et, vl) -> ((MCarrier)et).setCarrierAbbr((String)vl), "carrierAbbr");
        setupEpg(_epgMap, et -> ((MCarrier)et).getLargeItemHadlingFlg(), (et, vl) -> ((MCarrier)et).setLargeItemHadlingFlg((String)vl), "largeItemHadlingFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getHeavyItemHadlingFlg(), (et, vl) -> ((MCarrier)et).setHeavyItemHadlingFlg((String)vl), "heavyItemHadlingFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getHolidayCarrierFlg(), (et, vl) -> ((MCarrier)et).setHolidayCarrierFlg((String)vl), "holidayCarrierFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getOkinawaFlightFlg(), (et, vl) -> ((MCarrier)et).setOkinawaFlightFlg((String)vl), "okinawaFlightFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getBaseDefaultCarrierFlg(), (et, vl) -> ((MCarrier)et).setBaseDefaultCarrierFlg((String)vl), "baseDefaultCarrierFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getInsuranceCarrierCd(), (et, vl) -> ((MCarrier)et).setInsuranceCarrierCd((String)vl), "insuranceCarrierCd");
        setupEpg(_epgMap, et -> ((MCarrier)et).getSlipTypeCd(), (et, vl) -> ((MCarrier)et).setSlipTypeCd((String)vl), "slipTypeCd");
        setupEpg(_epgMap, et -> ((MCarrier)et).getBaseCd(), (et, vl) -> ((MCarrier)et).setBaseCd((String)vl), "baseCd");
        setupEpg(_epgMap, et -> ((MCarrier)et).getProperFlg(), (et, vl) -> ((MCarrier)et).setProperFlg((String)vl), "properFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getLaneCd(), (et, vl) -> ((MCarrier)et).setLaneCd((String)vl), "laneCd");
        setupEpg(_epgMap, et -> ((MCarrier)et).getDelFlg(), (et, vl) -> ((MCarrier)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCarrier)et).getVersionNo(), (et, vl) -> ((MCarrier)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCarrier)et).getControlNo(), (et, vl) -> ((MCarrier)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCarrier)et).getAddDt(), (et, vl) -> ((MCarrier)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCarrier)et).getAddUser(), (et, vl) -> ((MCarrier)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCarrier)et).getAddProcess(), (et, vl) -> ((MCarrier)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCarrier)et).getUpdDt(), (et, vl) -> ((MCarrier)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCarrier)et).getUpdUser(), (et, vl) -> ((MCarrier)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCarrier)et).getUpdProcess(), (et, vl) -> ((MCarrier)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCarrier)et).getMCenter(), (et, vl) -> ((MCarrier)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((MCarrier)et).getMCommonCarrier(), (et, vl) -> ((MCarrier)et).setMCommonCarrier((MCommonCarrier)vl), "MCommonCarrier");
        setupEfpg(_efpgMap, et -> ((MCarrier)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCarrier)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_carrier";
    protected final String _tableDispName = "m_carrier";
    protected final String _tablePropertyName = "MCarrier";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_carrier", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCarrierId = cci("CARRIER_ID", "CARRIER_ID", null, null, Long.class, "carrierId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "MBaseSalesOrgList,MCarrierBoxList,MCarrierDecisionByCarrierId2List,MCarrierDecisionByCarrierId1List,MCarrierDecisionByCarrierId3List,MCarrierDecisionByCarrierIdList,MDeliveryCourseList,MKoguchiDeliveryList", null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnCommonCarrierId = cci("COMMON_CARRIER_ID", "COMMON_CARRIER_ID", null, null, Long.class, "commonCarrierId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MCommonCarrier", null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierNm = cci("CARRIER_NM", "CARRIER_NM", null, null, String.class, "carrierNm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierAbbr = cci("CARRIER_ABBR", "CARRIER_ABBR", null, null, String.class, "carrierAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLargeItemHadlingFlg = cci("LARGE_ITEM_HADLING_FLG", "LARGE_ITEM_HADLING_FLG", null, null, String.class, "largeItemHadlingFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHeavyItemHadlingFlg = cci("HEAVY_ITEM_HADLING_FLG", "HEAVY_ITEM_HADLING_FLG", null, null, String.class, "heavyItemHadlingFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHolidayCarrierFlg = cci("HOLIDAY_CARRIER_FLG", "HOLIDAY_CARRIER_FLG", null, null, String.class, "holidayCarrierFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOkinawaFlightFlg = cci("OKINAWA_FLIGHT_FLG", "OKINAWA_FLIGHT_FLG", null, null, String.class, "okinawaFlightFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseDefaultCarrierFlg = cci("BASE_DEFAULT_CARRIER_FLG", "BASE_DEFAULT_CARRIER_FLG", null, null, String.class, "baseDefaultCarrierFlg", null, false, false, true, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInsuranceCarrierCd = cci("INSURANCE_CARRIER_CD", "INSURANCE_CARRIER_CD", null, null, String.class, "insuranceCarrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSlipTypeCd = cci("SLIP_TYPE_CD", "SLIP_TYPE_CD", null, null, String.class, "slipTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBaseCd = cci("BASE_CD", "BASE_CD", null, null, String.class, "baseCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProperFlg = cci("PROPER_FLG", "PROPER_FLG", null, null, String.class, "properFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLaneCd = cci("LANE_CD", "LANE_CD", null, null, String.class, "laneCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CARRIER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierId() { return _columnCarrierId; }
    /**
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * COMMON_CARRIER_ID: {IX, BIGINT(19), FK to m_common_carrier}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommonCarrierId() { return _columnCommonCarrierId; }
    /**
     * CARRIER_CD: {+UQ, IX, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_NM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierNm() { return _columnCarrierNm; }
    /**
     * CARRIER_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierAbbr() { return _columnCarrierAbbr; }
    /**
     * LARGE_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeItemHadlingFlg() { return _columnLargeItemHadlingFlg; }
    /**
     * HEAVY_ITEM_HADLING_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHeavyItemHadlingFlg() { return _columnHeavyItemHadlingFlg; }
    /**
     * HOLIDAY_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHolidayCarrierFlg() { return _columnHolidayCarrierFlg; }
    /**
     * OKINAWA_FLIGHT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOkinawaFlightFlg() { return _columnOkinawaFlightFlg; }
    /**
     * BASE_DEFAULT_CARRIER_FLG: {NotNull, CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseDefaultCarrierFlg() { return _columnBaseDefaultCarrierFlg; }
    /**
     * INSURANCE_CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInsuranceCarrierCd() { return _columnInsuranceCarrierCd; }
    /**
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSlipTypeCd() { return _columnSlipTypeCd; }
    /**
     * BASE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBaseCd() { return _columnBaseCd; }
    /**
     * PROPER_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProperFlg() { return _columnProperFlg; }
    /**
     * LANE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLaneCd() { return _columnLaneCd; }
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
        ls.add(columnCarrierId());
        ls.add(columnCenterId());
        ls.add(columnCommonCarrierId());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierNm());
        ls.add(columnCarrierAbbr());
        ls.add(columnLargeItemHadlingFlg());
        ls.add(columnHeavyItemHadlingFlg());
        ls.add(columnHolidayCarrierFlg());
        ls.add(columnOkinawaFlightFlg());
        ls.add(columnBaseDefaultCarrierFlg());
        ls.add(columnInsuranceCarrierCd());
        ls.add(columnSlipTypeCd());
        ls.add(columnBaseCd());
        ls.add(columnProperFlg());
        ls.add(columnLaneCd());
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
    protected UniqueInfo cpui() { return hpcpui(columnCarrierId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnCenterId());
        ls.add(columnCarrierCd());
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
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("M_CARRIER_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCarrierList", false);
    }
    /**
     * m_common_carrier by my COMMON_CARRIER_ID, named 'MCommonCarrier'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCommonCarrier() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommonCarrierId(), MCommonCarrierDbm.getInstance().columnCommonCarrierId());
        return cfi("M_CARRIER_FK2", "MCommonCarrier", this, MCommonCarrierDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCarrierList", false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CARRIER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBaseSalesOrgList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MBaseSalesOrgDbm.getInstance().columnCarrierId());
        return cri("M_BASE_SALES_ORG_FK2", "MBaseSalesOrgList", this, MBaseSalesOrgDbm.getInstance(), mp, false, "MCarrier");
    }
    /**
     * m_carrier_box by CARRIER_ID, named 'MCarrierBoxList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierBoxList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierBoxDbm.getInstance().columnCarrierId());
        return cri("M_CARRIER_BOX_FK2", "MCarrierBoxList", this, MCarrierBoxDbm.getInstance(), mp, false, "MCarrier");
    }
    /**
     * m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2List'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierDecisionByCarrierId2List() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDecisionDbm.getInstance().columnCarrierId2());
        return cri("M_CARRIER_DECISION_FK2", "MCarrierDecisionByCarrierId2List", this, MCarrierDecisionDbm.getInstance(), mp, false, "MCarrierByCarrierId2");
    }
    /**
     * m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1List'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierDecisionByCarrierId1List() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDecisionDbm.getInstance().columnCarrierId1());
        return cri("M_CARRIER_DECISION_FK1", "MCarrierDecisionByCarrierId1List", this, MCarrierDecisionDbm.getInstance(), mp, false, "MCarrierByCarrierId1");
    }
    /**
     * m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3List'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierDecisionByCarrierId3List() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDecisionDbm.getInstance().columnCarrierId3());
        return cri("M_CARRIER_DECISION_FK6", "MCarrierDecisionByCarrierId3List", this, MCarrierDecisionDbm.getInstance(), mp, false, "MCarrierByCarrierId3");
    }
    /**
     * m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierDecisionByCarrierIdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MCarrierDecisionDbm.getInstance().columnCarrierId());
        return cri("M_CARRIER_DECISION_FK4", "MCarrierDecisionByCarrierIdList", this, MCarrierDecisionDbm.getInstance(), mp, false, "MCarrierByCarrierId");
    }
    /**
     * m_delivery_course by CARRIER_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MDeliveryCourseDbm.getInstance().columnCarrierId());
        return cri("M_DELIVERY_COURSE_FK5", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCarrier");
    }
    /**
     * m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMKoguchiDeliveryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCarrierId(), MKoguchiDeliveryDbm.getInstance().columnCarrierId());
        return cri("M_KOGUCHI_DELIVERY_FK2", "MKoguchiDeliveryList", this, MKoguchiDeliveryDbm.getInstance(), mp, false, "MCarrier");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCarrier"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCarrierCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCarrierBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCarrier> getEntityType() { return MCarrier.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCarrier newEntity() { return new MCarrier(); }
    public MCarrier newMyEntity() { return new MCarrier(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCarrier)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCarrier)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
