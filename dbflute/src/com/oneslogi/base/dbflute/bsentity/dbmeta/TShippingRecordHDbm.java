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
 * The DB meta of t_shipping_record_h. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TShippingRecordHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TShippingRecordHDbm _instance = new TShippingRecordHDbm();
    private TShippingRecordHDbm() {}
    public static TShippingRecordHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getShippingRecordHId(), (et, vl) -> ((TShippingRecordH)et).setShippingRecordHId(ctl(vl)), "shippingRecordHId");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getClientId(), (et, vl) -> ((TShippingRecordH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getShippingSlipNo(), (et, vl) -> ((TShippingRecordH)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getSalesOrderNo(), (et, vl) -> ((TShippingRecordH)et).setSalesOrderNo((String)vl), "salesOrderNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getShippingDt(), (et, vl) -> ((TShippingRecordH)et).setShippingDt((String)vl), "shippingDt");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getShippingStorageSpaceCd(), (et, vl) -> ((TShippingRecordH)et).setShippingStorageSpaceCd((String)vl), "shippingStorageSpaceCd");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getNizoroeNo(), (et, vl) -> ((TShippingRecordH)et).setNizoroeNo((String)vl), "nizoroeNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getDaihyoNizoroeNo(), (et, vl) -> ((TShippingRecordH)et).setDaihyoNizoroeNo((String)vl), "daihyoNizoroeNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getCarrierSlipNo(), (et, vl) -> ((TShippingRecordH)et).setCarrierSlipNo((String)vl), "carrierSlipNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getCarrierCd(), (et, vl) -> ((TShippingRecordH)et).setCarrierCd((String)vl), "carrierCd");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getCarrierRnm(), (et, vl) -> ((TShippingRecordH)et).setCarrierRnm((String)vl), "carrierRnm");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getSalesNo2(), (et, vl) -> ((TShippingRecordH)et).setSalesNo2((String)vl), "salesNo2");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getDeliverySlipNo(), (et, vl) -> ((TShippingRecordH)et).setDeliverySlipNo((String)vl), "deliverySlipNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getDStr(), (et, vl) -> ((TShippingRecordH)et).setDStr((String)vl), "DStr");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getIStr(), (et, vl) -> ((TShippingRecordH)et).setIStr((String)vl), "IStr");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getS4SendFlg(), (et, vl) -> ((TShippingRecordH)et).setS4SendFlg((String)vl), "s4SendFlg");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getDelFlg(), (et, vl) -> ((TShippingRecordH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getVersionNo(), (et, vl) -> ((TShippingRecordH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getControlNo(), (et, vl) -> ((TShippingRecordH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getAddDt(), (et, vl) -> ((TShippingRecordH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getAddUser(), (et, vl) -> ((TShippingRecordH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getAddProcess(), (et, vl) -> ((TShippingRecordH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getUpdDt(), (et, vl) -> ((TShippingRecordH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getUpdUser(), (et, vl) -> ((TShippingRecordH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TShippingRecordH)et).getUpdProcess(), (et, vl) -> ((TShippingRecordH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TShippingRecordH)et).getMClient(), (et, vl) -> ((TShippingRecordH)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_shipping_record_h";
    protected final String _tableDispName = "t_shipping_record_h";
    protected final String _tablePropertyName = "TShippingRecordH";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_shipping_record_h", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnShippingRecordHId = cci("SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", null, null, Long.class, "shippingRecordHId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TShippingRecordBList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesOrderNo = cci("SALES_ORDER_NO", "SALES_ORDER_NO", null, null, String.class, "salesOrderNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingDt = cci("SHIPPING_DT", "SHIPPING_DT", null, null, String.class, "shippingDt", null, false, false, true, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingStorageSpaceCd = cci("SHIPPING_STORAGE_SPACE_CD", "SHIPPING_STORAGE_SPACE_CD", null, null, String.class, "shippingStorageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNizoroeNo = cci("NIZOROE_NO", "NIZOROE_NO", null, null, String.class, "nizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDaihyoNizoroeNo = cci("DAIHYO_NIZOROE_NO", "DAIHYO_NIZOROE_NO", null, null, String.class, "daihyoNizoroeNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierSlipNo = cci("CARRIER_SLIP_NO", "CARRIER_SLIP_NO", null, null, String.class, "carrierSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierCd = cci("CARRIER_CD", "CARRIER_CD", null, null, String.class, "carrierCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierRnm = cci("CARRIER_RNM", "CARRIER_RNM", null, null, String.class, "carrierRnm", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSalesNo2 = cci("SALES_NO2", "SALES_NO2", null, null, String.class, "salesNo2", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeliverySlipNo = cci("DELIVERY_SLIP_NO", "DELIVERY_SLIP_NO", null, null, String.class, "deliverySlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDStr = cci("D_STR", "D_STR", null, null, String.class, "DStr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIStr = cci("I_STR", "I_STR", null, null, String.class, "IStr", null, false, false, false, "VARCHAR", 60, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnS4SendFlg = cci("S4_SEND_FLG", "S4_SEND_FLG", null, null, String.class, "s4SendFlg", null, false, false, false, "CHAR", 1, 0, null, null, false, null, null, null, null, null, false);
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
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingRecordHId() { return _columnShippingRecordHId; }
    /**
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipNo() { return _columnShippingSlipNo; }
    /**
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesOrderNo() { return _columnSalesOrderNo; }
    /**
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingDt() { return _columnShippingDt; }
    /**
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingStorageSpaceCd() { return _columnShippingStorageSpaceCd; }
    /**
     * NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNizoroeNo() { return _columnNizoroeNo; }
    /**
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDaihyoNizoroeNo() { return _columnDaihyoNizoroeNo; }
    /**
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipNo() { return _columnCarrierSlipNo; }
    /**
     * CARRIER_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierCd() { return _columnCarrierCd; }
    /**
     * CARRIER_RNM: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierRnm() { return _columnCarrierRnm; }
    /**
     * SALES_NO2: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSalesNo2() { return _columnSalesNo2; }
    /**
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeliverySlipNo() { return _columnDeliverySlipNo; }
    /**
     * D_STR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDStr() { return _columnDStr; }
    /**
     * I_STR: {VARCHAR(60)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIStr() { return _columnIStr; }
    /**
     * S4_SEND_FLG: {CHAR(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnS4SendFlg() { return _columnS4SendFlg; }
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
        ls.add(columnShippingRecordHId());
        ls.add(columnClientId());
        ls.add(columnShippingSlipNo());
        ls.add(columnSalesOrderNo());
        ls.add(columnShippingDt());
        ls.add(columnShippingStorageSpaceCd());
        ls.add(columnNizoroeNo());
        ls.add(columnDaihyoNizoroeNo());
        ls.add(columnCarrierSlipNo());
        ls.add(columnCarrierCd());
        ls.add(columnCarrierRnm());
        ls.add(columnSalesNo2());
        ls.add(columnDeliverySlipNo());
        ls.add(columnDStr());
        ls.add(columnIStr());
        ls.add(columnS4SendFlg());
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
    protected UniqueInfo cpui() { return hpcpui(columnShippingRecordHId()); }
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
        return cfi("T_SHIPPING_RECORD_H_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TShippingRecordHList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTShippingRecordBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnShippingRecordHId(), TShippingRecordBDbm.getInstance().columnShippingRecordHId());
        return cri("T_SHIPPING_RECORD_B_FK1", "TShippingRecordBList", this, TShippingRecordBDbm.getInstance(), mp, false, "TShippingRecordH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TShippingRecordH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TShippingRecordHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TShippingRecordHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TShippingRecordH> getEntityType() { return TShippingRecordH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TShippingRecordH newEntity() { return new TShippingRecordH(); }
    public TShippingRecordH newMyEntity() { return new TShippingRecordH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TShippingRecordH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TShippingRecordH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
