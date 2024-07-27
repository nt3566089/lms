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
 * The DB meta of w_ht_loading. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WHtLoadingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WHtLoadingDbm _instance = new WHtLoadingDbm();
    private WHtLoadingDbm() {}
    public static WHtLoadingDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WHtLoading)et).getHtLoadingId(), (et, vl) -> ((WHtLoading)et).setHtLoadingId(ctl(vl)), "htLoadingId");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getMacAddress(), (et, vl) -> ((WHtLoading)et).setMacAddress((String)vl), "macAddress");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getClientId(), (et, vl) -> ((WHtLoading)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getCenterId(), (et, vl) -> ((WHtLoading)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getPackingHId(), (et, vl) -> ((WHtLoading)et).setPackingHId(ctl(vl)), "packingHId");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getCarrierTraceNum(), (et, vl) -> ((WHtLoading)et).setCarrierTraceNum((String)vl), "carrierTraceNum");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getShippingPackingNo(), (et, vl) -> ((WHtLoading)et).setShippingPackingNo((String)vl), "shippingPackingNo");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getDeliveryCourseId(), (et, vl) -> ((WHtLoading)et).setDeliveryCourseId(ctl(vl)), "deliveryCourseId");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getDelFlg(), (et, vl) -> ((WHtLoading)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getVersionNo(), (et, vl) -> ((WHtLoading)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getControlNo(), (et, vl) -> ((WHtLoading)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getAddDt(), (et, vl) -> ((WHtLoading)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getAddUser(), (et, vl) -> ((WHtLoading)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getAddProcess(), (et, vl) -> ((WHtLoading)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getUpdDt(), (et, vl) -> ((WHtLoading)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getUpdUser(), (et, vl) -> ((WHtLoading)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((WHtLoading)et).getUpdProcess(), (et, vl) -> ((WHtLoading)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((WHtLoading)et).getMClient(), (et, vl) -> ((WHtLoading)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((WHtLoading)et).getMCenter(), (et, vl) -> ((WHtLoading)et).setMCenter((MCenter)vl), "MCenter");
        setupEfpg(_efpgMap, et -> ((WHtLoading)et).getMDeliveryCourse(), (et, vl) -> ((WHtLoading)et).setMDeliveryCourse((MDeliveryCourse)vl), "MDeliveryCourse");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "w_ht_loading";
    protected final String _tableDispName = "w_ht_loading";
    protected final String _tablePropertyName = "WHtLoading";
    protected final TableSqlName _tableSqlName = new TableSqlName("w_ht_loading", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHtLoadingId = cci("HT_LOADING_ID", "HT_LOADING_ID", null, null, Long.class, "htLoadingId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMacAddress = cci("MAC_ADDRESS", "MAC_ADDRESS", null, null, String.class, "macAddress", null, false, false, true, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnPackingHId = cci("PACKING_H_ID", "PACKING_H_ID", null, null, Long.class, "packingHId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierTraceNum = cci("CARRIER_TRACE_NUM", "CARRIER_TRACE_NUM", null, null, String.class, "carrierTraceNum", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingPackingNo = cci("SHIPPING_PACKING_NO", "SHIPPING_PACKING_NO", null, null, String.class, "shippingPackingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliveryCourseId = cci("DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", null, null, Long.class, "deliveryCourseId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, "MDeliveryCourse", null, null, false);
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
     * HT_LOADING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHtLoadingId() { return _columnHtLoadingId; }
    /**
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMacAddress() { return _columnMacAddress; }
    /**
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * PACKING_H_ID: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingHId() { return _columnPackingHId; }
    /**
     * CARRIER_TRACE_NUM: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierTraceNum() { return _columnCarrierTraceNum; }
    /**
     * SHIPPING_PACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingPackingNo() { return _columnShippingPackingNo; }
    /**
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliveryCourseId() { return _columnDeliveryCourseId; }
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
        ls.add(columnHtLoadingId());
        ls.add(columnMacAddress());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnPackingHId());
        ls.add(columnCarrierTraceNum());
        ls.add(columnShippingPackingNo());
        ls.add(columnDeliveryCourseId());
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
    protected UniqueInfo cpui() { return hpcpui(columnHtLoadingId()); }
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
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("W_HT_LOADING_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "WHtLoadingList", false);
    }
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("W_HT_LOADING_FK3", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "WHtLoadingList", false);
    }
    /**
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMDeliveryCourse() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnDeliveryCourseId(), MDeliveryCourseDbm.getInstance().columnDeliveryCourseId());
        return cfi("W_HT_LOADING_FK1", "MDeliveryCourse", this, MDeliveryCourseDbm.getInstance(), mp, 2, null, false, false, false, false, null, null, false, "WHtLoadingList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.WHtLoading"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.WHtLoadingCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.WHtLoadingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WHtLoading> getEntityType() { return WHtLoading.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WHtLoading newEntity() { return new WHtLoading(); }
    public WHtLoading newMyEntity() { return new WHtLoading(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WHtLoading)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WHtLoading)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
