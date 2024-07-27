package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of t_inventory_h.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryHCQ extends AbstractBsTInventoryHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_inventory_h) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryHCIQ xcreateCIQ() {
        TInventoryHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryHCIQ xnewCIQ() {
        return new TInventoryHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_inventory_h on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryHId;
    public ConditionValue xdfgetInventoryHId()
    { if (_inventoryHId == null) { _inventoryHId = nCV(); }
      return _inventoryHId; }
    protected ConditionValue xgetCValueInventoryHId() { return xdfgetInventoryHId(); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_ExistsReferrer_TInventoryBList"); }
    public String keepInventoryHId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_ExistsReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_ExistsReferrer_TInventoryInstList"); }
    public String keepInventoryHId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_ExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_NotExistsReferrer_TInventoryBList"); }
    public String keepInventoryHId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_NotExistsReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_NotExistsReferrer_TInventoryInstList"); }
    public String keepInventoryHId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_NotExistsReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_SpecifyDerivedReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_SpecifyDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_SpecifyDerivedReferrer_TInventoryInstList", sq); }

    public Map<String, TInventoryBCQ> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("inventoryHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("inventoryHId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("inventoryHId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("inventoryHId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TInventoryInstCQ> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryInstList() { return xgetSQueMap("inventoryHId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq) { return xkeepSQue("inventoryHId_QueryDerivedReferrer_TInventoryInstList", sq); }
    public Map<String, Object> xdfgetInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter() { return xgetSQuePmMap("inventoryHId_QueryDerivedReferrer_TInventoryInstList"); }
    public String keepInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter(Object pm) { return xkeepSQuePm("inventoryHId_QueryDerivedReferrer_TInventoryInstList", pm); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryHId_Asc() { regOBA("INVENTORY_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryHId_Desc() { regOBD("INVENTORY_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _batchNum;
    public ConditionValue xdfgetBatchNum()
    { if (_batchNum == null) { _batchNum = nCV(); }
      return _batchNum; }
    protected ConditionValue xgetCValueBatchNum() { return xdfgetBatchNum(); }

    /**
     * Add order-by as ascend. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_BatchNum_Asc() { regOBA("BATCH_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_BatchNum_Desc() { regOBD("BATCH_NUM"); return this; }

    protected ConditionValue _inventoryDt;
    public ConditionValue xdfgetInventoryDt()
    { if (_inventoryDt == null) { _inventoryDt = nCV(); }
      return _inventoryDt; }
    protected ConditionValue xgetCValueInventoryDt() { return xdfgetInventoryDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDt_Asc() { regOBA("INVENTORY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDt_Desc() { regOBD("INVENTORY_DT"); return this; }

    protected ConditionValue _plantCd;
    public ConditionValue xdfgetPlantCd()
    { if (_plantCd == null) { _plantCd = nCV(); }
      return _plantCd; }
    protected ConditionValue xgetCValuePlantCd() { return xdfgetPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

    protected ConditionValue _storageSpaceCd;
    public ConditionValue xdfgetStorageSpaceCd()
    { if (_storageSpaceCd == null) { _storageSpaceCd = nCV(); }
      return _storageSpaceCd; }
    protected ConditionValue xgetCValueStorageSpaceCd() { return xdfgetStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _inventoryInstNo;
    public ConditionValue xdfgetInventoryInstNo()
    { if (_inventoryInstNo == null) { _inventoryInstNo = nCV(); }
      return _inventoryInstNo; }
    protected ConditionValue xgetCValueInventoryInstNo() { return xdfgetInventoryInstNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryInstNo_Asc() { regOBA("INVENTORY_INST_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryInstNo_Desc() { regOBD("INVENTORY_INST_NO"); return this; }

    protected ConditionValue _inventoryStatusTypeId;
    public ConditionValue xdfgetInventoryStatusTypeId()
    { if (_inventoryStatusTypeId == null) { _inventoryStatusTypeId = nCV(); }
      return _inventoryStatusTypeId; }
    protected ConditionValue xgetCValueInventoryStatusTypeId() { return xdfgetInventoryStatusTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryStatusTypeId_Asc() { regOBA("INVENTORY_STATUS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryStatusTypeId_Desc() { regOBD("INVENTORY_STATUS_TYPE_ID"); return this; }

    protected ConditionValue _inventoryStatusTypeCd;
    public ConditionValue xdfgetInventoryStatusTypeCd()
    { if (_inventoryStatusTypeCd == null) { _inventoryStatusTypeCd = nCV(); }
      return _inventoryStatusTypeCd; }
    protected ConditionValue xgetCValueInventoryStatusTypeCd() { return xdfgetInventoryStatusTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryStatusTypeCd_Asc() { regOBA("INVENTORY_STATUS_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryStatusTypeCd_Desc() { regOBD("INVENTORY_STATUS_TYPE_CD"); return this; }

    protected ConditionValue _instRecvTime;
    public ConditionValue xdfgetInstRecvTime()
    { if (_instRecvTime == null) { _instRecvTime = nCV(); }
      return _instRecvTime; }
    protected ConditionValue xgetCValueInstRecvTime() { return xdfgetInstRecvTime(); }

    /**
     * Add order-by as ascend. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InstRecvTime_Asc() { regOBA("INST_RECV_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InstRecvTime_Desc() { regOBD("INST_RECV_TIME"); return this; }

    protected ConditionValue _reportSendTime;
    public ConditionValue xdfgetReportSendTime()
    { if (_reportSendTime == null) { _reportSendTime = nCV(); }
      return _reportSendTime; }
    protected ConditionValue xgetCValueReportSendTime() { return xdfgetReportSendTime(); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ReportSendTime_Asc() { regOBA("REPORT_SEND_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ReportSendTime_Desc() { regOBD("REPORT_SEND_TIME"); return this; }

    protected ConditionValue _inventoryUpdateFlg;
    public ConditionValue xdfgetInventoryUpdateFlg()
    { if (_inventoryUpdateFlg == null) { _inventoryUpdateFlg = nCV(); }
      return _inventoryUpdateFlg; }
    protected ConditionValue xgetCValueInventoryUpdateFlg() { return xdfgetInventoryUpdateFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryUpdateFlg_Asc() { regOBA("INVENTORY_UPDATE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryUpdateFlg_Desc() { regOBD("INVENTORY_UPDATE_FLG"); return this; }

    protected ConditionValue _inventoryDataStatus;
    public ConditionValue xdfgetInventoryDataStatus()
    { if (_inventoryDataStatus == null) { _inventoryDataStatus = nCV(); }
      return _inventoryDataStatus; }
    protected ConditionValue xgetCValueInventoryDataStatus() { return xdfgetInventoryDataStatus(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDataStatus_Asc() { regOBA("INVENTORY_DATA_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_InventoryDataStatus_Desc() { regOBD("INVENTORY_DATA_STATUS"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTInventoryHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryHCQ bq = (TInventoryHCQ)bqs;
        TInventoryHCQ uq = (TInventoryHCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("t_inventory_h", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("t_inventory_h", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryHCQ> _myselfExistsMap;
    public Map<String, TInventoryHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryHCB.class.getName(); }
    protected String xCQ() { return TInventoryHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
