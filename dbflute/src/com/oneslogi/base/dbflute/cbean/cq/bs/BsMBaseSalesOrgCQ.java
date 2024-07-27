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
 * The base condition-query of m_base_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public class BsMBaseSalesOrgCQ extends AbstractBsMBaseSalesOrgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MBaseSalesOrgCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMBaseSalesOrgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_base_sales_org) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MBaseSalesOrgCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MBaseSalesOrgCIQ xcreateCIQ() {
        MBaseSalesOrgCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MBaseSalesOrgCIQ xnewCIQ() {
        return new MBaseSalesOrgCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_base_sales_org on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MBaseSalesOrgCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MBaseSalesOrgCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _baseSalesOrgId;
    public ConditionValue xdfgetBaseSalesOrgId()
    { if (_baseSalesOrgId == null) { _baseSalesOrgId = nCV(); }
      return _baseSalesOrgId; }
    protected ConditionValue xgetCValueBaseSalesOrgId() { return xdfgetBaseSalesOrgId(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_BaseSalesOrgId_Asc() { regOBA("BASE_SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_BaseSalesOrgId_Desc() { regOBD("BASE_SALES_ORG_ID"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

    protected ConditionValue _salesOrgId;
    public ConditionValue xdfgetSalesOrgId()
    { if (_salesOrgId == null) { _salesOrgId = nCV(); }
      return _salesOrgId; }
    protected ConditionValue xgetCValueSalesOrgId() { return xdfgetSalesOrgId(); }

    public Map<String, MSalesOrgCQ> getSalesOrgId_InScopeRelation_MSalesOrg() { return xgetSQueMap("salesOrgId_InScopeRelation_MSalesOrg"); }
    public String keepSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("salesOrgId_InScopeRelation_MSalesOrg", sq); }

    public Map<String, MSalesOrgCQ> getSalesOrgId_NotInScopeRelation_MSalesOrg() { return xgetSQueMap("salesOrgId_NotInScopeRelation_MSalesOrg"); }
    public String keepSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("salesOrgId_NotInScopeRelation_MSalesOrg", sq); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_SalesOrgId_Asc() { regOBA("SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_SalesOrgId_Desc() { regOBD("SALES_ORG_ID"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    public Map<String, MCarrierCQ> getCarrierId_InScopeRelation_MCarrier() { return xgetSQueMap("carrierId_InScopeRelation_MCarrier"); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_InScopeRelation_MCarrier", sq); }

    public Map<String, MCarrierCQ> getCarrierId_NotInScopeRelation_MCarrier() { return xgetSQueMap("carrierId_NotInScopeRelation_MCarrier"); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_NotInScopeRelation_MCarrier", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMBaseSalesOrgCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMBaseSalesOrgCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMBaseSalesOrgCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMBaseSalesOrgCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MBaseSalesOrgCQ bq = (MBaseSalesOrgCQ)bqs;
        MBaseSalesOrgCQ uq = (MBaseSalesOrgCQ)uqs;
        if (bq.hasConditionQueryMCarrier()) {
            uq.queryMCarrier().reflectRelationOnUnionQuery(bq.queryMCarrier(), uq.queryMCarrier());
        }
        if (bq.hasConditionQueryMSalesOrg()) {
            uq.queryMSalesOrg().reflectRelationOnUnionQuery(bq.queryMSalesOrg(), uq.queryMSalesOrg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrier() {
        return xdfgetConditionQueryMCarrier();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrier() {
        String prop = "mCarrier";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrier()); xsetupOuterJoinMCarrier(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrier() {
        String nrp = xresolveNRP("m_base_sales_org", "mCarrier"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrier", nrp);
    }
    protected void xsetupOuterJoinMCarrier() { xregOutJo("mCarrier"); }
    public boolean hasConditionQueryMCarrier() { return xhasQueRlMap("mCarrier"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @return The instance of condition-query. (NotNull)
     */
    public MSalesOrgCQ queryMSalesOrg() {
        return xdfgetConditionQueryMSalesOrg();
    }
    public MSalesOrgCQ xdfgetConditionQueryMSalesOrg() {
        String prop = "mSalesOrg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMSalesOrg()); xsetupOuterJoinMSalesOrg(); }
        return xgetQueRlMap(prop);
    }
    protected MSalesOrgCQ xcreateQueryMSalesOrg() {
        String nrp = xresolveNRP("m_base_sales_org", "mSalesOrg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MSalesOrgCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mSalesOrg", nrp);
    }
    protected void xsetupOuterJoinMSalesOrg() { xregOutJo("mSalesOrg"); }
    public boolean hasConditionQueryMSalesOrg() { return xhasQueRlMap("mSalesOrg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MBaseSalesOrgCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MBaseSalesOrgCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MBaseSalesOrgCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MBaseSalesOrgCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MBaseSalesOrgCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MBaseSalesOrgCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MBaseSalesOrgCQ> _myselfExistsMap;
    public Map<String, MBaseSalesOrgCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MBaseSalesOrgCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MBaseSalesOrgCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MBaseSalesOrgCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MBaseSalesOrgCB.class.getName(); }
    protected String xCQ() { return MBaseSalesOrgCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}