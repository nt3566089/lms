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
 * The DB meta of t_packing_list. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TPackingListDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TPackingListDbm _instance = new TPackingListDbm();
    private TPackingListDbm() {}
    public static TPackingListDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TPackingList)et).getPackingListId(), (et, vl) -> ((TPackingList)et).setPackingListId(ctl(vl)), "packingListId");
        setupEpg(_epgMap, et -> ((TPackingList)et).getClientId(), (et, vl) -> ((TPackingList)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TPackingList)et).getShippingSlipNo(), (et, vl) -> ((TPackingList)et).setShippingSlipNo((String)vl), "shippingSlipNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getPackingNo(), (et, vl) -> ((TPackingList)et).setPackingNo((String)vl), "packingNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getPackingRowNo(), (et, vl) -> ((TPackingList)et).setPackingRowNo((String)vl), "packingRowNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getShippingSlipRowNo(), (et, vl) -> ((TPackingList)et).setShippingSlipRowNo((String)vl), "shippingSlipRowNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getShippingSlipRowNoSn(), (et, vl) -> ((TPackingList)et).setShippingSlipRowNoSn((String)vl), "shippingSlipRowNoSn");
        setupEpg(_epgMap, et -> ((TPackingList)et).getProductCd(), (et, vl) -> ((TPackingList)et).setProductCd((String)vl), "productCd");
        setupEpg(_epgMap, et -> ((TPackingList)et).getNum(), (et, vl) -> ((TPackingList)et).setNum(ctl(vl)), "num");
        setupEpg(_epgMap, et -> ((TPackingList)et).getCarrierSlipNo(), (et, vl) -> ((TPackingList)et).setCarrierSlipNo((String)vl), "carrierSlipNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getDelFlg(), (et, vl) -> ((TPackingList)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TPackingList)et).getVersionNo(), (et, vl) -> ((TPackingList)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getControlNo(), (et, vl) -> ((TPackingList)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TPackingList)et).getAddDt(), (et, vl) -> ((TPackingList)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TPackingList)et).getAddUser(), (et, vl) -> ((TPackingList)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TPackingList)et).getAddProcess(), (et, vl) -> ((TPackingList)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TPackingList)et).getUpdDt(), (et, vl) -> ((TPackingList)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TPackingList)et).getUpdUser(), (et, vl) -> ((TPackingList)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TPackingList)et).getUpdProcess(), (et, vl) -> ((TPackingList)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TPackingList)et).getMClient(), (et, vl) -> ((TPackingList)et).setMClient((MClient)vl), "MClient");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_packing_list";
    protected final String _tableDispName = "t_packing_list";
    protected final String _tablePropertyName = "TPackingList";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_packing_list", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPackingListId = cci("PACKING_LIST_ID", "PACKING_LIST_ID", null, null, Long.class, "packingListId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnShippingSlipNo = cci("SHIPPING_SLIP_NO", "SHIPPING_SLIP_NO", null, null, String.class, "shippingSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingNo = cci("PACKING_NO", "PACKING_NO", null, null, String.class, "packingNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPackingRowNo = cci("PACKING_ROW_NO", "PACKING_ROW_NO", null, null, String.class, "packingRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipRowNo = cci("SHIPPING_SLIP_ROW_NO", "SHIPPING_SLIP_ROW_NO", null, null, String.class, "shippingSlipRowNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnShippingSlipRowNoSn = cci("SHIPPING_SLIP_ROW_NO_SN", "SHIPPING_SLIP_ROW_NO_SN", null, null, String.class, "shippingSlipRowNoSn", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnProductCd = cci("PRODUCT_CD", "PRODUCT_CD", null, null, String.class, "productCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNum = cci("NUM", "NUM", null, null, Long.class, "num", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCarrierSlipNo = cci("CARRIER_SLIP_NO", "CARRIER_SLIP_NO", null, null, String.class, "carrierSlipNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
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
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingListId() { return _columnPackingListId; }
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
     * PACKING_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingNo() { return _columnPackingNo; }
    /**
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPackingRowNo() { return _columnPackingRowNo; }
    /**
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipRowNo() { return _columnShippingSlipRowNo; }
    /**
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnShippingSlipRowNoSn() { return _columnShippingSlipRowNoSn; }
    /**
     * PRODUCT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCd() { return _columnProductCd; }
    /**
     * NUM: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNum() { return _columnNum; }
    /**
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCarrierSlipNo() { return _columnCarrierSlipNo; }
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
        ls.add(columnPackingListId());
        ls.add(columnClientId());
        ls.add(columnShippingSlipNo());
        ls.add(columnPackingNo());
        ls.add(columnPackingRowNo());
        ls.add(columnShippingSlipRowNo());
        ls.add(columnShippingSlipRowNoSn());
        ls.add(columnProductCd());
        ls.add(columnNum());
        ls.add(columnCarrierSlipNo());
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
    protected UniqueInfo cpui() { return hpcpui(columnPackingListId()); }
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
        return cfi("T_PACKING_LIST_FK1", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TPackingListList", false);
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TPackingList"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TPackingListCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TPackingListBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TPackingList> getEntityType() { return TPackingList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TPackingList newEntity() { return new TPackingList(); }
    public TPackingList newMyEntity() { return new TPackingList(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TPackingList)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TPackingList)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
