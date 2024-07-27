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
 * The DB meta of t_inventory_h. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryHDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TInventoryHDbm _instance = new TInventoryHDbm();
    private TInventoryHDbm() {}
    public static TInventoryHDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryHId(), (et, vl) -> ((TInventoryH)et).setInventoryHId(ctl(vl)), "inventoryHId");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getClientId(), (et, vl) -> ((TInventoryH)et).setClientId(ctl(vl)), "clientId");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getCenterId(), (et, vl) -> ((TInventoryH)et).setCenterId(ctl(vl)), "centerId");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getBatchNum(), (et, vl) -> ((TInventoryH)et).setBatchNum(ctl(vl)), "batchNum");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryDt(), (et, vl) -> ((TInventoryH)et).setInventoryDt((String)vl), "inventoryDt");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getPlantCd(), (et, vl) -> ((TInventoryH)et).setPlantCd((String)vl), "plantCd");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getStorageSpaceCd(), (et, vl) -> ((TInventoryH)et).setStorageSpaceCd((String)vl), "storageSpaceCd");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryInstNo(), (et, vl) -> ((TInventoryH)et).setInventoryInstNo((String)vl), "inventoryInstNo");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryStatusTypeId(), (et, vl) -> ((TInventoryH)et).setInventoryStatusTypeId(ctl(vl)), "inventoryStatusTypeId");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryStatusTypeCd(), (et, vl) -> ((TInventoryH)et).setInventoryStatusTypeCd((String)vl), "inventoryStatusTypeCd");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInstRecvTime(), (et, vl) -> ((TInventoryH)et).setInstRecvTime(cttp(vl)), "instRecvTime");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getReportSendTime(), (et, vl) -> ((TInventoryH)et).setReportSendTime(cttp(vl)), "reportSendTime");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryUpdateFlg(), (et, vl) -> ((TInventoryH)et).setInventoryUpdateFlg((String)vl), "inventoryUpdateFlg");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getInventoryDataStatus(), (et, vl) -> ((TInventoryH)et).setInventoryDataStatus((String)vl), "inventoryDataStatus");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getDelFlg(), (et, vl) -> ((TInventoryH)et).setDelFlg((String)vl), "delFlg");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getVersionNo(), (et, vl) -> ((TInventoryH)et).setVersionNo(ctl(vl)), "versionNo");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getControlNo(), (et, vl) -> ((TInventoryH)et).setControlNo(ctl(vl)), "controlNo");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getAddDt(), (et, vl) -> ((TInventoryH)et).setAddDt(cttp(vl)), "addDt");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getAddUser(), (et, vl) -> ((TInventoryH)et).setAddUser((String)vl), "addUser");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getAddProcess(), (et, vl) -> ((TInventoryH)et).setAddProcess((String)vl), "addProcess");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getUpdDt(), (et, vl) -> ((TInventoryH)et).setUpdDt(cttp(vl)), "updDt");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getUpdUser(), (et, vl) -> ((TInventoryH)et).setUpdUser((String)vl), "updUser");
        setupEpg(_epgMap, et -> ((TInventoryH)et).getUpdProcess(), (et, vl) -> ((TInventoryH)et).setUpdProcess((String)vl), "updProcess");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((TInventoryH)et).getMClient(), (et, vl) -> ((TInventoryH)et).setMClient((MClient)vl), "MClient");
        setupEfpg(_efpgMap, et -> ((TInventoryH)et).getMCenter(), (et, vl) -> ((TInventoryH)et).setMCenter((MCenter)vl), "MCenter");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_inventory_h";
    protected final String _tableDispName = "t_inventory_h";
    protected final String _tablePropertyName = "TInventoryH";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_inventory_h", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInventoryHId = cci("INVENTORY_H_ID", "INVENTORY_H_ID", null, null, Long.class, "inventoryHId", null, true, true, true, "BIGINT", 19, 0, null, null, false, null, null, null, "TInventoryBList,TInventoryInstList", null, false);
    protected final ColumnInfo _columnClientId = cci("CLIENT_ID", "CLIENT_ID", null, null, Long.class, "clientId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MClient", null, null, false);
    protected final ColumnInfo _columnCenterId = cci("CENTER_ID", "CENTER_ID", null, null, Long.class, "centerId", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, "MCenter", null, null, false);
    protected final ColumnInfo _columnBatchNum = cci("BATCH_NUM", "BATCH_NUM", null, null, Long.class, "batchNum", null, false, false, true, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDt = cci("INVENTORY_DT", "INVENTORY_DT", null, null, String.class, "inventoryDt", null, false, false, true, "VARCHAR", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlantCd = cci("PLANT_CD", "PLANT_CD", null, null, String.class, "plantCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStorageSpaceCd = cci("STORAGE_SPACE_CD", "STORAGE_SPACE_CD", null, null, String.class, "storageSpaceCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryInstNo = cci("INVENTORY_INST_NO", "INVENTORY_INST_NO", null, null, String.class, "inventoryInstNo", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryStatusTypeId = cci("INVENTORY_STATUS_TYPE_ID", "INVENTORY_STATUS_TYPE_ID", null, null, Long.class, "inventoryStatusTypeId", null, false, false, false, "BIGINT", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryStatusTypeCd = cci("INVENTORY_STATUS_TYPE_CD", "INVENTORY_STATUS_TYPE_CD", null, null, String.class, "inventoryStatusTypeCd", null, false, false, false, "VARCHAR", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInstRecvTime = cci("INST_RECV_TIME", "INST_RECV_TIME", null, null, java.sql.Timestamp.class, "instRecvTime", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnReportSendTime = cci("REPORT_SEND_TIME", "REPORT_SEND_TIME", null, null, java.sql.Timestamp.class, "reportSendTime", null, false, false, false, "DATETIME", 19, 0, 3, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryUpdateFlg = cci("INVENTORY_UPDATE_FLG", "INVENTORY_UPDATE_FLG", null, null, String.class, "inventoryUpdateFlg", null, false, false, false, "CHAR", 1, 0, null, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnInventoryDataStatus = cci("INVENTORY_DATA_STATUS", "INVENTORY_DATA_STATUS", null, null, String.class, "inventoryDataStatus", null, false, false, false, "VARCHAR", 30, 0, null, "00", false, null, null, null, null, null, false);
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
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryHId() { return _columnInventoryHId; }
    /**
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCenterId() { return _columnCenterId; }
    /**
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBatchNum() { return _columnBatchNum; }
    /**
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDt() { return _columnInventoryDt; }
    /**
     * PLANT_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlantCd() { return _columnPlantCd; }
    /**
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStorageSpaceCd() { return _columnStorageSpaceCd; }
    /**
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryInstNo() { return _columnInventoryInstNo; }
    /**
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryStatusTypeId() { return _columnInventoryStatusTypeId; }
    /**
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryStatusTypeCd() { return _columnInventoryStatusTypeCd; }
    /**
     * INST_RECV_TIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInstRecvTime() { return _columnInstRecvTime; }
    /**
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReportSendTime() { return _columnReportSendTime; }
    /**
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryUpdateFlg() { return _columnInventoryUpdateFlg; }
    /**
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInventoryDataStatus() { return _columnInventoryDataStatus; }
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
        ls.add(columnInventoryHId());
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnBatchNum());
        ls.add(columnInventoryDt());
        ls.add(columnPlantCd());
        ls.add(columnStorageSpaceCd());
        ls.add(columnInventoryInstNo());
        ls.add(columnInventoryStatusTypeId());
        ls.add(columnInventoryStatusTypeCd());
        ls.add(columnInstRecvTime());
        ls.add(columnReportSendTime());
        ls.add(columnInventoryUpdateFlg());
        ls.add(columnInventoryDataStatus());
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
    protected UniqueInfo cpui() { return hpcpui(columnInventoryHId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnClientId());
        ls.add(columnCenterId());
        ls.add(columnInventoryDt());
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
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMClient() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnClientId(), MClientDbm.getInstance().columnClientId());
        return cfi("T_INVENTORY_H_FK2", "MClient", this, MClientDbm.getInstance(), mp, 0, null, false, false, false, false, null, null, false, "TInventoryHList", false);
    }
    /**
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMCenter() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCenterId(), MCenterDbm.getInstance().columnCenterId());
        return cfi("T_INVENTORY_H_FK1", "MCenter", this, MCenterDbm.getInstance(), mp, 1, null, false, false, false, false, null, null, false, "TInventoryHList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * t_inventory_b by INVENTORY_H_ID, named 'TInventoryBList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryBList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), TInventoryBDbm.getInstance().columnInventoryHId());
        return cri("T_INVENTORY_B_FK7", "TInventoryBList", this, TInventoryBDbm.getInstance(), mp, false, "TInventoryH");
    }
    /**
     * t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTInventoryInstList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnInventoryHId(), TInventoryInstDbm.getInstance().columnInventoryHId());
        return cri("T_INVENTORY_INST_FK1", "TInventoryInstList", this, TInventoryInstDbm.getInstance(), mp, false, "TInventoryH");
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
    public String getEntityTypeName() { return "com.oneslogi.base.dbflute.exentity.TInventoryH"; }
    public String getConditionBeanTypeName() { return "com.oneslogi.base.dbflute.cbean.TInventoryHCB"; }
    public String getBehaviorTypeName() { return "com.oneslogi.base.dbflute.exbhv.TInventoryHBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TInventoryH> getEntityType() { return TInventoryH.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TInventoryH newEntity() { return new TInventoryH(); }
    public TInventoryH newMyEntity() { return new TInventoryH(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TInventoryH)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TInventoryH)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
