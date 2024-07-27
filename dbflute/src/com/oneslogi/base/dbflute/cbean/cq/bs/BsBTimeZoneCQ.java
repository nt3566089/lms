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
 * The base condition-query of b_time_zone.
 * @author DBFlute(AutoGenerator)
 */
public class BsBTimeZoneCQ extends AbstractBsBTimeZoneCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BTimeZoneCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBTimeZoneCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from b_time_zone) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BTimeZoneCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BTimeZoneCIQ xcreateCIQ() {
        BTimeZoneCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BTimeZoneCIQ xnewCIQ() {
        return new BTimeZoneCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join b_time_zone on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BTimeZoneCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BTimeZoneCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _timeZoneId;
    public ConditionValue xdfgetTimeZoneId()
    { if (_timeZoneId == null) { _timeZoneId = nCV(); }
      return _timeZoneId; }
    protected ConditionValue xgetCValueTimeZoneId() { return xdfgetTimeZoneId(); }

    public Map<String, BSystemCQ> xdfgetTimeZoneId_ExistsReferrer_BSystemList() { return xgetSQueMap("timeZoneId_ExistsReferrer_BSystemList"); }
    public String keepTimeZoneId_ExistsReferrer_BSystemList(BSystemCQ sq) { return xkeepSQue("timeZoneId_ExistsReferrer_BSystemList", sq); }

    public Map<String, MCenterCQ> xdfgetTimeZoneId_ExistsReferrer_MCenterList() { return xgetSQueMap("timeZoneId_ExistsReferrer_MCenterList"); }
    public String keepTimeZoneId_ExistsReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("timeZoneId_ExistsReferrer_MCenterList", sq); }

    public Map<String, BSystemCQ> xdfgetTimeZoneId_NotExistsReferrer_BSystemList() { return xgetSQueMap("timeZoneId_NotExistsReferrer_BSystemList"); }
    public String keepTimeZoneId_NotExistsReferrer_BSystemList(BSystemCQ sq) { return xkeepSQue("timeZoneId_NotExistsReferrer_BSystemList", sq); }

    public Map<String, MCenterCQ> xdfgetTimeZoneId_NotExistsReferrer_MCenterList() { return xgetSQueMap("timeZoneId_NotExistsReferrer_MCenterList"); }
    public String keepTimeZoneId_NotExistsReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("timeZoneId_NotExistsReferrer_MCenterList", sq); }

    public Map<String, BSystemCQ> xdfgetTimeZoneId_SpecifyDerivedReferrer_BSystemList() { return xgetSQueMap("timeZoneId_SpecifyDerivedReferrer_BSystemList"); }
    public String keepTimeZoneId_SpecifyDerivedReferrer_BSystemList(BSystemCQ sq) { return xkeepSQue("timeZoneId_SpecifyDerivedReferrer_BSystemList", sq); }

    public Map<String, MCenterCQ> xdfgetTimeZoneId_SpecifyDerivedReferrer_MCenterList() { return xgetSQueMap("timeZoneId_SpecifyDerivedReferrer_MCenterList"); }
    public String keepTimeZoneId_SpecifyDerivedReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("timeZoneId_SpecifyDerivedReferrer_MCenterList", sq); }

    public Map<String, BSystemCQ> xdfgetTimeZoneId_QueryDerivedReferrer_BSystemList() { return xgetSQueMap("timeZoneId_QueryDerivedReferrer_BSystemList"); }
    public String keepTimeZoneId_QueryDerivedReferrer_BSystemList(BSystemCQ sq) { return xkeepSQue("timeZoneId_QueryDerivedReferrer_BSystemList", sq); }
    public Map<String, Object> xdfgetTimeZoneId_QueryDerivedReferrer_BSystemListParameter() { return xgetSQuePmMap("timeZoneId_QueryDerivedReferrer_BSystemList"); }
    public String keepTimeZoneId_QueryDerivedReferrer_BSystemListParameter(Object pm) { return xkeepSQuePm("timeZoneId_QueryDerivedReferrer_BSystemList", pm); }

    public Map<String, MCenterCQ> xdfgetTimeZoneId_QueryDerivedReferrer_MCenterList() { return xgetSQueMap("timeZoneId_QueryDerivedReferrer_MCenterList"); }
    public String keepTimeZoneId_QueryDerivedReferrer_MCenterList(MCenterCQ sq) { return xkeepSQue("timeZoneId_QueryDerivedReferrer_MCenterList", sq); }
    public Map<String, Object> xdfgetTimeZoneId_QueryDerivedReferrer_MCenterListParameter() { return xgetSQuePmMap("timeZoneId_QueryDerivedReferrer_MCenterList"); }
    public String keepTimeZoneId_QueryDerivedReferrer_MCenterListParameter(Object pm) { return xkeepSQuePm("timeZoneId_QueryDerivedReferrer_MCenterList", pm); }

    /**
     * Add order-by as ascend. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_TimeZoneId_Asc() { regOBA("TIME_ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_ZONE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_TimeZoneId_Desc() { regOBD("TIME_ZONE_ID"); return this; }

    protected ConditionValue _timeZoneCd;
    public ConditionValue xdfgetTimeZoneCd()
    { if (_timeZoneCd == null) { _timeZoneCd = nCV(); }
      return _timeZoneCd; }
    protected ConditionValue xgetCValueTimeZoneCd() { return xdfgetTimeZoneCd(); }

    /**
     * Add order-by as ascend. <br>
     * TIME_ZONE_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_TimeZoneCd_Asc() { regOBA("TIME_ZONE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_ZONE_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_TimeZoneCd_Desc() { regOBD("TIME_ZONE_CD"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsBTimeZoneCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBTimeZoneCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsBTimeZoneCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsBTimeZoneCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, BTimeZoneCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BTimeZoneCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BTimeZoneCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BTimeZoneCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BTimeZoneCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BTimeZoneCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BTimeZoneCQ> _myselfExistsMap;
    public Map<String, BTimeZoneCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BTimeZoneCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BTimeZoneCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BTimeZoneCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BTimeZoneCB.class.getName(); }
    protected String xCQ() { return BTimeZoneCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
