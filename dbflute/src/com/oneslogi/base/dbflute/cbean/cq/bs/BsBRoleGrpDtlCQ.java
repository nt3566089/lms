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
 * The base condition-query of b_role_grp_dtl.
 * @author DBFlute(AutoGenerator)
 */
public class BsBRoleGrpDtlCQ extends AbstractBsBRoleGrpDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BRoleGrpDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBRoleGrpDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from b_role_grp_dtl) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BRoleGrpDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BRoleGrpDtlCIQ xcreateCIQ() {
        BRoleGrpDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BRoleGrpDtlCIQ xnewCIQ() {
        return new BRoleGrpDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join b_role_grp_dtl on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BRoleGrpDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BRoleGrpDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _roleGrpDtlId;
    public ConditionValue xdfgetRoleGrpDtlId()
    { if (_roleGrpDtlId == null) { _roleGrpDtlId = nCV(); }
      return _roleGrpDtlId; }
    protected ConditionValue xgetCValueRoleGrpDtlId() { return xdfgetRoleGrpDtlId(); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleGrpDtlId_Asc() { regOBA("ROLE_GRP_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_GRP_DTL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleGrpDtlId_Desc() { regOBD("ROLE_GRP_DTL_ID"); return this; }

    protected ConditionValue _roleGrpId;
    public ConditionValue xdfgetRoleGrpId()
    { if (_roleGrpId == null) { _roleGrpId = nCV(); }
      return _roleGrpId; }
    protected ConditionValue xgetCValueRoleGrpId() { return xdfgetRoleGrpId(); }

    public Map<String, BRoleGrpCQ> getRoleGrpId_InScopeRelation_BRoleGrp() { return xgetSQueMap("roleGrpId_InScopeRelation_BRoleGrp"); }
    public String keepRoleGrpId_InScopeRelation_BRoleGrp(BRoleGrpCQ sq) { return xkeepSQue("roleGrpId_InScopeRelation_BRoleGrp", sq); }

    public Map<String, BRoleGrpCQ> getRoleGrpId_NotInScopeRelation_BRoleGrp() { return xgetSQueMap("roleGrpId_NotInScopeRelation_BRoleGrp"); }
    public String keepRoleGrpId_NotInScopeRelation_BRoleGrp(BRoleGrpCQ sq) { return xkeepSQue("roleGrpId_NotInScopeRelation_BRoleGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role_grp}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleGrpId_Asc() { regOBA("ROLE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_GRP_ID: {UQ+, IX, NotNull, BIGINT(19), FK to b_role_grp}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleGrpId_Desc() { regOBD("ROLE_GRP_ID"); return this; }

    protected ConditionValue _roleId;
    public ConditionValue xdfgetRoleId()
    { if (_roleId == null) { _roleId = nCV(); }
      return _roleId; }
    protected ConditionValue xgetCValueRoleId() { return xdfgetRoleId(); }

    public Map<String, BRoleCQ> getRoleId_InScopeRelation_BRole() { return xgetSQueMap("roleId_InScopeRelation_BRole"); }
    public String keepRoleId_InScopeRelation_BRole(BRoleCQ sq) { return xkeepSQue("roleId_InScopeRelation_BRole", sq); }

    public Map<String, BRoleCQ> getRoleId_NotInScopeRelation_BRole() { return xgetSQueMap("roleId_NotInScopeRelation_BRole"); }
    public String keepRoleId_NotInScopeRelation_BRole(BRoleCQ sq) { return xkeepSQue("roleId_NotInScopeRelation_BRole", sq); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_role}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_ID: {+UQ, IX, NotNull, BIGINT(19), FK to b_role}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _applyOrder;
    public ConditionValue xdfgetApplyOrder()
    { if (_applyOrder == null) { _applyOrder = nCV(); }
      return _applyOrder; }
    protected ConditionValue xgetCValueApplyOrder() { return xdfgetApplyOrder(); }

    /**
     * Add order-by as ascend. <br>
     * APPLY_ORDER: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_ApplyOrder_Asc() { regOBA("APPLY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * APPLY_ORDER: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_ApplyOrder_Desc() { regOBD("APPLY_ORDER"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBRoleGrpDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBRoleGrpDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBRoleGrpDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBRoleGrpDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BRoleGrpDtlCQ bq = (BRoleGrpDtlCQ)bqs;
        BRoleGrpDtlCQ uq = (BRoleGrpDtlCQ)uqs;
        if (bq.hasConditionQueryBRole()) {
            uq.queryBRole().reflectRelationOnUnionQuery(bq.queryBRole(), uq.queryBRole());
        }
        if (bq.hasConditionQueryBRoleGrp()) {
            uq.queryBRoleGrp().reflectRelationOnUnionQuery(bq.queryBRoleGrp(), uq.queryBRoleGrp());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * b_role by my ROLE_ID, named 'BRole'.
     * @return The instance of condition-query. (NotNull)
     */
    public BRoleCQ queryBRole() {
        return xdfgetConditionQueryBRole();
    }
    public BRoleCQ xdfgetConditionQueryBRole() {
        String prop = "bRole";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBRole()); xsetupOuterJoinBRole(); }
        return xgetQueRlMap(prop);
    }
    protected BRoleCQ xcreateQueryBRole() {
        String nrp = xresolveNRP("b_role_grp_dtl", "bRole"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BRoleCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bRole", nrp);
    }
    protected void xsetupOuterJoinBRole() { xregOutJo("bRole"); }
    public boolean hasConditionQueryBRole() { return xhasQueRlMap("bRole"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public BRoleGrpCQ queryBRoleGrp() {
        return xdfgetConditionQueryBRoleGrp();
    }
    public BRoleGrpCQ xdfgetConditionQueryBRoleGrp() {
        String prop = "bRoleGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBRoleGrp()); xsetupOuterJoinBRoleGrp(); }
        return xgetQueRlMap(prop);
    }
    protected BRoleGrpCQ xcreateQueryBRoleGrp() {
        String nrp = xresolveNRP("b_role_grp_dtl", "bRoleGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BRoleGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bRoleGrp", nrp);
    }
    protected void xsetupOuterJoinBRoleGrp() { xregOutJo("bRoleGrp"); }
    public boolean hasConditionQueryBRoleGrp() { return xhasQueRlMap("bRoleGrp"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BRoleGrpDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BRoleGrpDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BRoleGrpDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BRoleGrpDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BRoleGrpDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BRoleGrpDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BRoleGrpDtlCQ> _myselfExistsMap;
    public Map<String, BRoleGrpDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BRoleGrpDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BRoleGrpDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BRoleGrpDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BRoleGrpDtlCB.class.getName(); }
    protected String xCQ() { return BRoleGrpDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
