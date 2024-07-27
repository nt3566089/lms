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
 * The base condition-query of t_nizoroe.
 * @author DBFlute(AutoGenerator)
 */
public class BsTNizoroeCQ extends AbstractBsTNizoroeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TNizoroeCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTNizoroeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_nizoroe) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TNizoroeCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TNizoroeCIQ xcreateCIQ() {
        TNizoroeCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TNizoroeCIQ xnewCIQ() {
        return new TNizoroeCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_nizoroe on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TNizoroeCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TNizoroeCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _nizoroeId;
    public ConditionValue xdfgetNizoroeId()
    { if (_nizoroeId == null) { _nizoroeId = nCV(); }
      return _nizoroeId; }
    protected ConditionValue xgetCValueNizoroeId() { return xdfgetNizoroeId(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeId_Asc() { regOBA("NIZOROE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeId_Desc() { regOBD("NIZOROE_ID"); return this; }

    protected ConditionValue _baseCd;
    public ConditionValue xdfgetBaseCd()
    { if (_baseCd == null) { _baseCd = nCV(); }
      return _baseCd; }
    protected ConditionValue xgetCValueBaseCd() { return xdfgetBaseCd(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

    protected ConditionValue _nizoroeProcUnit;
    public ConditionValue xdfgetNizoroeProcUnit()
    { if (_nizoroeProcUnit == null) { _nizoroeProcUnit = nCV(); }
      return _nizoroeProcUnit; }
    protected ConditionValue xgetCValueNizoroeProcUnit() { return xdfgetNizoroeProcUnit(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeProcUnit_Asc() { regOBA("NIZOROE_PROC_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeProcUnit_Desc() { regOBD("NIZOROE_PROC_UNIT"); return this; }

    protected ConditionValue _nizoroeTypeCd;
    public ConditionValue xdfgetNizoroeTypeCd()
    { if (_nizoroeTypeCd == null) { _nizoroeTypeCd = nCV(); }
      return _nizoroeTypeCd; }
    protected ConditionValue xgetCValueNizoroeTypeCd() { return xdfgetNizoroeTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeTypeCd_Asc() { regOBA("NIZOROE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_NizoroeTypeCd_Desc() { regOBD("NIZOROE_TYPE_CD"); return this; }

    protected ConditionValue _status;
    public ConditionValue xdfgetStatus()
    { if (_status == null) { _status = nCV(); }
      return _status; }
    protected ConditionValue xgetCValueStatus() { return xdfgetStatus(); }

    /**
     * Add order-by as ascend. <br>
     * STATUS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_Status_Asc() { regOBA("STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * STATUS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_Status_Desc() { regOBD("STATUS"); return this; }

    protected ConditionValue _procDt;
    public ConditionValue xdfgetProcDt()
    { if (_procDt == null) { _procDt = nCV(); }
      return _procDt; }
    protected ConditionValue xgetCValueProcDt() { return xdfgetProcDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROC_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcDt_Asc() { regOBA("PROC_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROC_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcDt_Desc() { regOBD("PROC_DT"); return this; }

    protected ConditionValue _procStartTime;
    public ConditionValue xdfgetProcStartTime()
    { if (_procStartTime == null) { _procStartTime = nCV(); }
      return _procStartTime; }
    protected ConditionValue xgetCValueProcStartTime() { return xdfgetProcStartTime(); }

    /**
     * Add order-by as ascend. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcStartTime_Asc() { regOBA("PROC_START_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcStartTime_Desc() { regOBD("PROC_START_TIME"); return this; }

    protected ConditionValue _procEndTime;
    public ConditionValue xdfgetProcEndTime()
    { if (_procEndTime == null) { _procEndTime = nCV(); }
      return _procEndTime; }
    protected ConditionValue xgetCValueProcEndTime() { return xdfgetProcEndTime(); }

    /**
     * Add order-by as ascend. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcEndTime_Asc() { regOBA("PROC_END_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ProcEndTime_Desc() { regOBD("PROC_END_TIME"); return this; }

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
    public BsTNizoroeCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTNizoroeCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTNizoroeCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTNizoroeCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTNizoroeCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTNizoroeCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTNizoroeCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTNizoroeCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTNizoroeCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTNizoroeCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTNizoroeCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTNizoroeCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TNizoroeCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TNizoroeCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TNizoroeCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TNizoroeCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TNizoroeCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TNizoroeCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TNizoroeCQ> _myselfExistsMap;
    public Map<String, TNizoroeCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TNizoroeCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TNizoroeCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TNizoroeCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TNizoroeCB.class.getName(); }
    protected String xCQ() { return TNizoroeCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
