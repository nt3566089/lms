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
 * The base condition-query of p_subrep_layout.
 * @author DBFlute(AutoGenerator)
 */
public class BsPSubrepLayoutCQ extends AbstractBsPSubrepLayoutCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PSubrepLayoutCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPSubrepLayoutCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from p_subrep_layout) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PSubrepLayoutCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PSubrepLayoutCIQ xcreateCIQ() {
        PSubrepLayoutCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PSubrepLayoutCIQ xnewCIQ() {
        return new PSubrepLayoutCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join p_subrep_layout on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PSubrepLayoutCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PSubrepLayoutCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _subrepLayoutId;
    public ConditionValue xdfgetSubrepLayoutId()
    { if (_subrepLayoutId == null) { _subrepLayoutId = nCV(); }
      return _subrepLayoutId; }
    protected ConditionValue xgetCValueSubrepLayoutId() { return xdfgetSubrepLayoutId(); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetSubrepLayoutId_ExistsReferrer_PSubrepLayoutItemList() { return xgetSQueMap("subrepLayoutId_ExistsReferrer_PSubrepLayoutItemList"); }
    public String keepSubrepLayoutId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("subrepLayoutId_ExistsReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetSubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList() { return xgetSQueMap("subrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList"); }
    public String keepSubrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("subrepLayoutId_NotExistsReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetSubrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList() { return xgetSQueMap("subrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepSubrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("subrepLayoutId_SpecifyDerivedReferrer_PSubrepLayoutItemList", sq); }

    public Map<String, PSubrepLayoutItemCQ> xdfgetSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList() { return xgetSQueMap("subrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq) { return xkeepSQue("subrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList", sq); }
    public Map<String, Object> xdfgetSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemListParameter() { return xgetSQuePmMap("subrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList"); }
    public String keepSubrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object pm) { return xkeepSQuePm("subrepLayoutId_QueryDerivedReferrer_PSubrepLayoutItemList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_SubrepLayoutId_Asc() { regOBA("SUBREP_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_SubrepLayoutId_Desc() { regOBD("SUBREP_LAYOUT_ID"); return this; }

    protected ConditionValue _reportLayoutId;
    public ConditionValue xdfgetReportLayoutId()
    { if (_reportLayoutId == null) { _reportLayoutId = nCV(); }
      return _reportLayoutId; }
    protected ConditionValue xgetCValueReportLayoutId() { return xdfgetReportLayoutId(); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_InScopeRelation_PReportLayout() { return xgetSQueMap("reportLayoutId_InScopeRelation_PReportLayout"); }
    public String keepReportLayoutId_InScopeRelation_PReportLayout(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_InScopeRelation_PReportLayout", sq); }

    public Map<String, PReportLayoutCQ> getReportLayoutId_NotInScopeRelation_PReportLayout() { return xgetSQueMap("reportLayoutId_NotInScopeRelation_PReportLayout"); }
    public String keepReportLayoutId_NotInScopeRelation_PReportLayout(PReportLayoutCQ sq) { return xkeepSQue("reportLayoutId_NotInScopeRelation_PReportLayout", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_ReportLayoutId_Asc() { regOBA("REPORT_LAYOUT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPORT_LAYOUT_ID: {UQ, NotNull, BIGINT(19), FK to p_report_layout}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_ReportLayoutId_Desc() { regOBD("REPORT_LAYOUT_ID"); return this; }

    protected ConditionValue _subrepLayoutData;
    public ConditionValue xdfgetSubrepLayoutData()
    { if (_subrepLayoutData == null) { _subrepLayoutData = nCV(); }
      return _subrepLayoutData; }
    protected ConditionValue xgetCValueSubrepLayoutData() { return xdfgetSubrepLayoutData(); }

    /**
     * Add order-by as ascend. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_SubrepLayoutData_Asc() { regOBA("SUBREP_LAYOUT_DATA"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUBREP_LAYOUT_DATA: {NotNull, LONGTEXT(2147483647)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_SubrepLayoutData_Desc() { regOBD("SUBREP_LAYOUT_DATA"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsPSubrepLayoutCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsPSubrepLayoutCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsPSubrepLayoutCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPSubrepLayoutCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        PSubrepLayoutCQ bq = (PSubrepLayoutCQ)bqs;
        PSubrepLayoutCQ uq = (PSubrepLayoutCQ)uqs;
        if (bq.hasConditionQueryPReportLayout()) {
            uq.queryPReportLayout().reflectRelationOnUnionQuery(bq.queryPReportLayout(), uq.queryPReportLayout());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The instance of condition-query. (NotNull)
     */
    public PReportLayoutCQ queryPReportLayout() {
        return xdfgetConditionQueryPReportLayout();
    }
    public PReportLayoutCQ xdfgetConditionQueryPReportLayout() {
        String prop = "pReportLayout";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryPReportLayout()); xsetupOuterJoinPReportLayout(); }
        return xgetQueRlMap(prop);
    }
    protected PReportLayoutCQ xcreateQueryPReportLayout() {
        String nrp = xresolveNRP("p_subrep_layout", "pReportLayout"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new PReportLayoutCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "pReportLayout", nrp);
    }
    protected void xsetupOuterJoinPReportLayout() { xregOutJo("pReportLayout"); }
    public boolean hasConditionQueryPReportLayout() { return xhasQueRlMap("pReportLayout"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, PSubrepLayoutCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PSubrepLayoutCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PSubrepLayoutCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PSubrepLayoutCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PSubrepLayoutCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PSubrepLayoutCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PSubrepLayoutCQ> _myselfExistsMap;
    public Map<String, PSubrepLayoutCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PSubrepLayoutCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PSubrepLayoutCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PSubrepLayoutCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PSubrepLayoutCB.class.getName(); }
    protected String xCQ() { return PSubrepLayoutCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
