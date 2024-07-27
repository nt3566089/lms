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
 * The DB meta of m_center. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MCenterDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MCenterDbm _instance = new MCenterDbm();
    private MCenterDbm() {}
    public static MCenterDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterId(), (et, vl) -> ((MCenter)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterCd(), (et, vl) -> ((MCenter)et).setCenterCd((String)vl), "centerCd");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterNm(), (et, vl) -> ((MCenter)et).setCenterNm((String)vl), "centerNm");
        setupEpg(_epgMap, et -> ((MCenter)et).getCenterAbbr(), (et, vl) -> ((MCenter)et).setCenterAbbr((String)vl), "centerAbbr");
        setupEpg(_epgMap, et -> ((MCenter)et).getCultureId(), (et, vl) -> ((MCenter)et).setCultureId(ctl(vl)), "cultureId");
        setupEpg(_epgMap, et -> ((MCenter)et).getTimeZoneId(), (et, vl) -> ((MCenter)et).setTimeZoneId(ctl(vl)), "timeZoneId");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddress(), (et, vl) -> ((MCenter)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((MCenter)et).getTelNo(), (et, vl) -> ((MCenter)et).setTelNo((String)vl), "telNo");
        setupEpg(_epgMap, et -> ((MCenter)et).getDelFlg(), (et, vl) -> ((MCenter)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((MCenter)et).getVersionNo(), (et, vl) -> ((MCenter)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((MCenter)et).getControlNo(), (et, vl) -> ((MCenter)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddDt(), (et, vl) -> ((MCenter)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddUser(), (et, vl) -> ((MCenter)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((MCenter)et).getAddProcess(), (et, vl) -> ((MCenter)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdDt(), (et, vl) -> ((MCenter)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdUser(), (et, vl) -> ((MCenter)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((MCenter)et).getUpdProcess(), (et, vl) -> ((MCenter)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBTimeZone(), (et, vl) -> ((MCenter)et).setBTimeZone((BTimeZone)vl), "BTimeZone");
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBCulture(), (et, vl) -> ((MCenter)et).setBCulture((BCulture)vl), "BCulture");
        setupEfpg(_efpgMap, et -> ((MCenter)et).getBClassDtlByDelFlg(), (et, vl) -> ((MCenter)et).setBClassDtlByDelFlg((BClassDtl)vl), "BClassDtlByDelFlg");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "m_center";
    protected final String _tableDispName = "m_center";
    protected final String _tablePropertyName = "MCenter";
    protected final TableSqlName _tableSqlName = new TableSqlName("m_center", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "HLocationAttributeList,MBoxList,MBoxGrpList,MCarrierList,MCarrierSlipSgwList,MCarrierSlipYmtList,MCarrierSlipYupkList,MCenterClassList,MCenterColList,MCenterCustomerList,MCenterItemList,MCenterScreenList,MClientCenterList,MCustomerPickingList,MDeliveryCourseList,MGeneralList,MLocationList,MNizoroeList,MNumberingCenterList,MUserCenterList,MUserLoginList,MWarehouseList,MWebHtInfoList,TAllocInstHList,TEcOrderHList,TInventoryHList,TMoveInstHList,TPackingHList,TPicMthdRcmdList,TPickingHList,TReceivePlanHList,TSerialNoList,TShippingInstHList,TStoreRecordHList,WHtInventoryInputProdList,WHtLoadingList,WHtPickingList,WHtReceiveInspectionList,WHtReceiveNoPlanInspList,WHtReceiveStoreList,WHtSerialReceiveInspList,WHtSerialShippingInspList,WHtShippingList,WHtShippingPickingList,WHtTotalPickingList,WSglRowShipInspHList,WShippingInterruptList", null, false);
    protected final ColumnInfo _columnCenterCd = cci("CENTER_CD", "CENTER_CD", null, null, String.class, "centerCd", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterNm = cci("CENTER_NM", "CENTER_NM", null, null, String.class, "centerNm", null, false, false, true, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCenterAbbr = cci("CENTER_ABBR", "CENTER_ABBR", null, null, String.class, "centerAbbr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCultureId = cci("CULTURE_ID", "CULTURE_ID", null, null, Long.class, "cultureId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BCulture", null, null, false);
    protected final ColumnInfo _columnTimeZoneId = cci("TIME_ZONE_ID", "TIME_ZONE_ID", null, null, Long.class, "timeZoneId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "BTimeZone", null, null, false);
    protected final ColumnInfo _columnAddress = cci("ADDRESS", "ADDRESS", null, null, String.class, "address", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTelNo = cci("TEL_NO", "TEL_NO", null, null, String.class, "telNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterCd() { return _columnCenterCd; }
    /**
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterNm() { return _columnCenterNm; }
    /**
     * CENTER_ABBR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterAbbr() { return _columnCenterAbbr; }
    /**
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCultureId() { return _columnCultureId; }
    /**
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTimeZoneId() { return _columnTimeZoneId; }
    /**
     * ADDRESS: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * TEL_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTelNo() { return _columnTelNo; }
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
        ls.add(columnCenterId());
        ls.add(columnCenterCd());
        ls.add(columnCenterNm());
        ls.add(columnCenterAbbr());
        ls.add(columnCultureId());
        ls.add(columnTimeZoneId());
        ls.add(columnAddress());
        ls.add(columnTelNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnCenterId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnCenterCd()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBTimeZone() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTimeZoneId(), BTimeZoneDbm.getInstance().columnTimeZoneId());
        return cfi("M_CENTER_FK2", "BTimeZone", this, BTimeZoneDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "MCenterList", false);
    }
    /**
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBCulture() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCultureId(), BCultureDbm.getInstance().columnCultureId());
        return cfi("M_CENTER_FK1", "BCulture", this, BCultureDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "MCenterList", false);
    }
    /**
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignBClassDtlByDelFlg() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDelFlg(), BClassDtlDbm.getInstance().columnClassDtlCd());
        return cfi("FK_M_CENTER_DEL_FLG", "BClassDtlByDelFlg", this, BClassDtlDbm.getInstance(), mp, 2, null, false, false, false, true, "$$foreignAlias$$.DEL_FLG = '0'\n            AND EXISTS \n              ($$sqbegin$$\n                SELECT * \n                  FROM B_CLASS C\n                  WHERE C.CLASS_ID = $$foreignAlias$$.CLASS_ID\n                    AND C.CLASS_CD  = 'DEL_FLG'\n                    AND C.DEL_FLG   = '0'\n              )$$sqend$$", null, false, null, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerHLocationAttributeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), HLocationAttributeDbm.getInstance().columnCenterId());
        return cri("H_LOCATION_ATTRIBUTE_FK1", "HLocationAttributeList", this, HLocationAttributeDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_box by CENTER_ID, named 'MBoxList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MBoxDbm.getInstance().columnCenterId());
        return cri("M_BOX_FK1", "MBoxList", this, MBoxDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMBoxGrpList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MBoxGrpDbm.getInstance().columnCenterId());
        return cri("M_BOX_GRP_FK1", "MBoxGrpList", this, MBoxGrpDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_carrier by CENTER_ID, named 'MCarrierList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_FK1", "MCarrierList", this, MCarrierDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipSgwList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipSgwDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_SGW_FK1", "MCarrierSlipSgwList", this, MCarrierSlipSgwDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipYmtList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipYmtDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_YMT_FK1", "MCarrierSlipYmtList", this, MCarrierSlipYmtDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCarrierSlipYupkList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCarrierSlipYupkDbm.getInstance().columnCenterId());
        return cri("M_CARRIER_SLIP_YUPK_FK1", "MCarrierSlipYupkList", this, MCarrierSlipYupkDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_center_class by CENTER_ID, named 'MCenterClassList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterClassList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterClassDbm.getInstance().columnCenterId());
        return cri("M_CENTER_CLASS_FK1", "MCenterClassList", this, MCenterClassDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_center_col by CENTER_ID, named 'MCenterColList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterColList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterColDbm.getInstance().columnCenterId());
        return cri("M_CENTER_COL_FK3", "MCenterColList", this, MCenterColDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterCustomerList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterCustomerDbm.getInstance().columnCenterId());
        return cri("M_CENTER_CUSTOMER_FK3", "MCenterCustomerList", this, MCenterCustomerDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_center_item by CENTER_ID, named 'MCenterItemList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterItemList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterItemDbm.getInstance().columnCenterId());
        return cri("M_CENTER_ITEM_FK1", "MCenterItemList", this, MCenterItemDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCenterScreenList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterScreenDbm.getInstance().columnCenterId());
        return cri("M_CENTER_SCREEN_FK3", "MCenterScreenList", this, MCenterScreenDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_client_center by CENTER_ID, named 'MClientCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMClientCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MClientCenterDbm.getInstance().columnCenterId());
        return cri("M_CLIENT_CENTER_FK3", "MClientCenterList", this, MClientCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMCustomerPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCustomerPickingDbm.getInstance().columnCenterId());
        return cri("M_CUSTOMER_PICKING_FK1", "MCustomerPickingList", this, MCustomerPickingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMDeliveryCourseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MDeliveryCourseDbm.getInstance().columnCenterId());
        return cri("M_DELIVERY_COURSE_FK4", "MDeliveryCourseList", this, MDeliveryCourseDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_general by CENTER_ID, named 'MGeneralList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMGeneralList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MGeneralDbm.getInstance().columnCenterId());
        return cri("M_GENERAL_FK1", "MGeneralList", this, MGeneralDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_location by CENTER_ID, named 'MLocationList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMLocationList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MLocationDbm.getInstance().columnCenterId());
        return cri("M_LOCATION_FK4", "MLocationList", this, MLocationDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMNizoroeList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MNizoroeDbm.getInstance().columnCenterId());
        return cri("M_NIZOROE_FK2", "MNizoroeList", this, MNizoroeDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMNumberingCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MNumberingCenterDbm.getInstance().columnCenterId());
        return cri("M_NUMBERING_CENTER_FK1", "MNumberingCenterList", this, MNumberingCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_user_center by CENTER_ID, named 'MUserCenterList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserCenterList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MUserCenterDbm.getInstance().columnCenterId());
        return cri("M_USER_CENTER_FK1", "MUserCenterList", this, MUserCenterDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_user_login by CENTER_ID, named 'MUserLoginList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMUserLoginList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MUserLoginDbm.getInstance().columnCenterId());
        return cri("M_USER_LOGIN_FK3", "MUserLoginList", this, MUserLoginDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWarehouseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MWarehouseDbm.getInstance().columnCenterId());
        return cri("M_WAREHOUSE_FK1", "MWarehouseList", this, MWarehouseDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerMWebHtInfoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MWebHtInfoDbm.getInstance().columnCenterId());
        return cri("M_WEB_HT_INFO_FK2", "MWebHtInfoList", this, MWebHtInfoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTAllocInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TAllocInstHDbm.getInstance().columnCenterId());
        return cri("T_ALLOC_INST_H_FK3", "TAllocInstHList", this, TAllocInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTEcOrderHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TEcOrderHDbm.getInstance().columnCenterId());
        return cri("T_EC_ORDER_H_FK3", "TEcOrderHList", this, TEcOrderHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TInventoryHDbm.getInstance().columnCenterId());
        return cri("T_INVENTORY_H_FK1", "TInventoryHList", this, TInventoryHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTMoveInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TMoveInstHDbm.getInstance().columnCenterId());
        return cri("T_MOVE_INST_H_FK3", "TMoveInstHList", this, TMoveInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_packing_h by CENTER_ID, named 'TPackingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPackingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPackingHDbm.getInstance().columnCenterId());
        return cri("T_PACKING_H_FK4", "TPackingHList", this, TPackingHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPicMthdRcmdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPicMthdRcmdDbm.getInstance().columnCenterId());
        return cri("T_PIC_MTHD_RCMD_FK2", "TPicMthdRcmdList", this, TPicMthdRcmdDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_picking_h by CENTER_ID, named 'TPickingHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTPickingHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TPickingHDbm.getInstance().columnCenterId());
        return cri("T_PICKING_H_FK2", "TPickingHList", this, TPickingHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTReceivePlanHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TReceivePlanHDbm.getInstance().columnCenterId());
        return cri("T_RECEIVE_PLAN_H_FK2", "TReceivePlanHList", this, TReceivePlanHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTSerialNoList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TSerialNoDbm.getInstance().columnCenterId());
        return cri("T_SERIAL_NO_FK1", "TSerialNoList", this, TSerialNoDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingInstHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TShippingInstHDbm.getInstance().columnCenterId());
        return cri("T_SHIPPING_INST_H_FK7", "TShippingInstHList", this, TShippingInstHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTStoreRecordHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), TStoreRecordHDbm.getInstance().columnCenterId());
        return cri("T_STORE_RECORD_H_FK2", "TStoreRecordHList", this, TStoreRecordHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtInventoryInputProdList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtInventoryInputProdDbm.getInstance().columnCenterId());
        return cri("W_HT_INVENTORY_INPUT_PROD_FK8", "WHtInventoryInputProdList", this, WHtInventoryInputProdDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtLoadingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtLoadingDbm.getInstance().columnCenterId());
        return cri("W_HT_LOADING_FK3", "WHtLoadingList", this, WHtLoadingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtPickingDbm.getInstance().columnCenterId());
        return cri("W_HT_PICKING_FK3", "WHtPickingList", this, WHtPickingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveInspectionList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveInspectionDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_INSPECTION_FK5", "WHtReceiveInspectionList", this, WHtReceiveInspectionDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveNoPlanInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveNoPlanInspDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_NO_PLAN_INSP_FK4", "WHtReceiveNoPlanInspList", this, WHtReceiveNoPlanInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtReceiveStoreList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtReceiveStoreDbm.getInstance().columnCenterId());
        return cri("W_HT_RECEIVE_STORE_FK2", "WHtReceiveStoreList", this, WHtReceiveStoreDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialReceiveInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtSerialReceiveInspDbm.getInstance().columnCenterId());
        return cri("W_HT_SERIAL_RECEIVE_INSP_FK2", "WHtSerialReceiveInspList", this, WHtSerialReceiveInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtSerialShippingInspList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtSerialShippingInspDbm.getInstance().columnCenterId());
        return cri("W_HT_SERIAL_SHIPPING_INSP_FK1", "WHtSerialShippingInspList", this, WHtSerialShippingInspDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtShippingDbm.getInstance().columnCenterId());
        return cri("W_HT_SHIPPING_FK2", "WHtShippingList", this, WHtShippingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtShippingPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtShippingPickingDbm.getInstance().columnCenterId());
        return cri("W_HT_SHIPPING_PICKING_FK2", "WHtShippingPickingList", this, WHtShippingPickingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWHtTotalPickingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WHtTotalPickingDbm.getInstance().columnCenterId());
        return cri("W_HT_TOTAL_PICKING_FK1", "WHtTotalPickingList", this, WHtTotalPickingDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWSglRowShipInspHList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WSglRowShipInspHDbm.getInstance().columnCenterId());
        return cri("W_SGL_ROW_SHIP_INSP_H_FK1", "WSglRowShipInspHList", this, WSglRowShipInspHDbm.getInstance(), mp, false, "MCenter");
    }
    /**
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerWShippingInterruptList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), WShippingInterruptDbm.getInstance().columnCenterId());
        return cri("W_SHIPPING_INTERRUPT_FK4", "WShippingInterruptList", this, WShippingInterruptDbm.getInstance(), mp, false, "MCenter");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.MCenter"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.MCenterCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.MCenterBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MCenter> getEntityType() { return MCenter.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MCenter newEntity() { return new MCenter(); }
    public MCenter newMyEntity() { return new MCenter(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MCenter)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MCenter)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
