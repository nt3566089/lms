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
 * The base condition-query of m_nizoroe_patern.
 * @author DBFlute(AutoGenerator)
 */
public class BsMNizoroePaternCQ extends AbstractBsMNizoroePaternCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MNizoroePaternCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMNizoroePaternCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_nizoroe_patern) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MNizoroePaternCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MNizoroePaternCIQ xcreateCIQ() {
        MNizoroePaternCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MNizoroePaternCIQ xnewCIQ() {
        return new MNizoroePaternCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_nizoroe_patern on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MNizoroePaternCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MNizoroePaternCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _nizoroePaternId;
    public ConditionValue xdfgetNizoroePaternId()
    { if (_nizoroePaternId == null) { _nizoroePaternId = nCV(); }
      return _nizoroePaternId; }
    protected ConditionValue xgetCValueNizoroePaternId() { return xdfgetNizoroePaternId(); }

    public Map<String, MNizoroeCQ> xdfgetNizoroePaternId_ExistsReferrer_MNizoroeList() { return xgetSQueMap("nizoroePaternId_ExistsReferrer_MNizoroeList"); }
    public String keepNizoroePaternId_ExistsReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("nizoroePaternId_ExistsReferrer_MNizoroeList", sq); }

    public Map<String, MNizoroeCQ> xdfgetNizoroePaternId_NotExistsReferrer_MNizoroeList() { return xgetSQueMap("nizoroePaternId_NotExistsReferrer_MNizoroeList"); }
    public String keepNizoroePaternId_NotExistsReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("nizoroePaternId_NotExistsReferrer_MNizoroeList", sq); }

    public Map<String, MNizoroeCQ> xdfgetNizoroePaternId_SpecifyDerivedReferrer_MNizoroeList() { return xgetSQueMap("nizoroePaternId_SpecifyDerivedReferrer_MNizoroeList"); }
    public String keepNizoroePaternId_SpecifyDerivedReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("nizoroePaternId_SpecifyDerivedReferrer_MNizoroeList", sq); }

    public Map<String, MNizoroeCQ> xdfgetNizoroePaternId_QueryDerivedReferrer_MNizoroeList() { return xgetSQueMap("nizoroePaternId_QueryDerivedReferrer_MNizoroeList"); }
    public String keepNizoroePaternId_QueryDerivedReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("nizoroePaternId_QueryDerivedReferrer_MNizoroeList", sq); }
    public Map<String, Object> xdfgetNizoroePaternId_QueryDerivedReferrer_MNizoroeListParameter() { return xgetSQuePmMap("nizoroePaternId_QueryDerivedReferrer_MNizoroeList"); }
    public String keepNizoroePaternId_QueryDerivedReferrer_MNizoroeListParameter(Object pm) { return xkeepSQuePm("nizoroePaternId_QueryDerivedReferrer_MNizoroeList", pm); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroePaternId_Asc() { regOBA("NIZOROE_PATERN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroePaternId_Desc() { regOBD("NIZOROE_PATERN_ID"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_NizoroeTypeCd_Asc() { regOBA("NIZOROE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroeTypeCd_Desc() { regOBD("NIZOROE_TYPE_CD"); return this; }

    protected ConditionValue _nizoroeProcId;
    public ConditionValue xdfgetNizoroeProcId()
    { if (_nizoroeProcId == null) { _nizoroeProcId = nCV(); }
      return _nizoroeProcId; }
    protected ConditionValue xgetCValueNizoroeProcId() { return xdfgetNizoroeProcId(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroeProcId_Asc() { regOBA("NIZOROE_PROC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroeProcId_Desc() { regOBD("NIZOROE_PROC_ID"); return this; }

    protected ConditionValue _nizoroeProcNm;
    public ConditionValue xdfgetNizoroeProcNm()
    { if (_nizoroeProcNm == null) { _nizoroeProcNm = nCV(); }
      return _nizoroeProcNm; }
    protected ConditionValue xgetCValueNizoroeProcNm() { return xdfgetNizoroeProcNm(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroeProcNm_Asc() { regOBA("NIZOROE_PROC_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_NizoroeProcNm_Desc() { regOBD("NIZOROE_PROC_NM"); return this; }

    protected ConditionValue _programId;
    public ConditionValue xdfgetProgramId()
    { if (_programId == null) { _programId = nCV(); }
      return _programId; }
    protected ConditionValue xgetCValueProgramId() { return xdfgetProgramId(); }

    /**
     * Add order-by as ascend. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_ProgramId_Asc() { regOBA("PROGRAM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_ProgramId_Desc() { regOBD("PROGRAM_ID"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMNizoroePaternCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMNizoroePaternCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMNizoroePaternCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMNizoroePaternCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MNizoroePaternCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MNizoroePaternCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MNizoroePaternCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MNizoroePaternCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MNizoroePaternCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MNizoroePaternCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MNizoroePaternCQ> _myselfExistsMap;
    public Map<String, MNizoroePaternCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MNizoroePaternCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MNizoroePaternCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MNizoroePaternCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MNizoroePaternCB.class.getName(); }
    protected String xCQ() { return MNizoroePaternCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
