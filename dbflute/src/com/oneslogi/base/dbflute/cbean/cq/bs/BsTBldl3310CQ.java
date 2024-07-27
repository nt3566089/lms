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
 * The base condition-query of t_bldl3310.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl3310CQ extends AbstractBsTBldl3310CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl3310CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl3310CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl3310) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl3310CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl3310CIQ xcreateCIQ() {
        TBldl3310CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl3310CIQ xnewCIQ() {
        return new TBldl3310CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl3310 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl3310CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl3310CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl3310Id;
    public ConditionValue xdfgetBldl3310Id()
    { if (_bldl3310Id == null) { _bldl3310Id = nCV(); }
      return _bldl3310Id; }
    protected ConditionValue xgetCValueBldl3310Id() { return xdfgetBldl3310Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Bldl3310Id_Asc() { regOBA("BLDL3310_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Bldl3310Id_Desc() { regOBD("BLDL3310_ID"); return this; }

    protected ConditionValue _yearmonth;
    public ConditionValue xdfgetYearmonth()
    { if (_yearmonth == null) { _yearmonth = nCV(); }
      return _yearmonth; }
    protected ConditionValue xgetCValueYearmonth() { return xdfgetYearmonth(); }

    /**
     * Add order-by as ascend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

    protected ConditionValue _baseNm;
    public ConditionValue xdfgetBaseNm()
    { if (_baseNm == null) { _baseNm = nCV(); }
      return _baseNm; }
    protected ConditionValue xgetCValueBaseNm() { return xdfgetBaseNm(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

    protected ConditionValue _month;
    public ConditionValue xdfgetMonth()
    { if (_month == null) { _month = nCV(); }
      return _month; }
    protected ConditionValue xgetCValueMonth() { return xdfgetMonth(); }

    /**
     * Add order-by as ascend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

    protected ConditionValue _contractorNm;
    public ConditionValue xdfgetContractorNm()
    { if (_contractorNm == null) { _contractorNm = nCV(); }
      return _contractorNm; }
    protected ConditionValue xgetCValueContractorNm() { return xdfgetContractorNm(); }

    /**
     * Add order-by as ascend. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_ContractorNm_Asc() { regOBA("CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_ContractorNm_Desc() { regOBD("CONTRACTOR_NM"); return this; }

    protected ConditionValue _ecTypeCd;
    public ConditionValue xdfgetEcTypeCd()
    { if (_ecTypeCd == null) { _ecTypeCd = nCV(); }
      return _ecTypeCd; }
    protected ConditionValue xgetCValueEcTypeCd() { return xdfgetEcTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_EcTypeCd_Asc() { regOBA("EC_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_EcTypeCd_Desc() { regOBD("EC_TYPE_CD"); return this; }

    protected ConditionValue _fwPrice;
    public ConditionValue xdfgetFwPrice()
    { if (_fwPrice == null) { _fwPrice = nCV(); }
      return _fwPrice; }
    protected ConditionValue xgetCValueFwPrice() { return xdfgetFwPrice(); }

    /**
     * Add order-by as ascend. <br>
     * FW_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_FwPrice_Asc() { regOBA("FW_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_FwPrice_Desc() { regOBD("FW_PRICE"); return this; }

    protected ConditionValue _sanshaFwPrice;
    public ConditionValue xdfgetSanshaFwPrice()
    { if (_sanshaFwPrice == null) { _sanshaFwPrice = nCV(); }
      return _sanshaFwPrice; }
    protected ConditionValue xgetCValueSanshaFwPrice() { return xdfgetSanshaFwPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaFwPrice_Asc() { regOBA("SANSHA_FW_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaFwPrice_Desc() { regOBD("SANSHA_FW_PRICE"); return this; }

    protected ConditionValue _sanshaUnPrice;
    public ConditionValue xdfgetSanshaUnPrice()
    { if (_sanshaUnPrice == null) { _sanshaUnPrice = nCV(); }
      return _sanshaUnPrice; }
    protected ConditionValue xgetCValueSanshaUnPrice() { return xdfgetSanshaUnPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaUnPrice_Asc() { regOBA("SANSHA_UN_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaUnPrice_Desc() { regOBD("SANSHA_UN_PRICE"); return this; }

    protected ConditionValue _sanshaShPrice;
    public ConditionValue xdfgetSanshaShPrice()
    { if (_sanshaShPrice == null) { _sanshaShPrice = nCV(); }
      return _sanshaShPrice; }
    protected ConditionValue xgetCValueSanshaShPrice() { return xdfgetSanshaShPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaShPrice_Asc() { regOBA("SANSHA_SH_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaShPrice_Desc() { regOBD("SANSHA_SH_PRICE"); return this; }

    protected ConditionValue _sanshaHmPrice;
    public ConditionValue xdfgetSanshaHmPrice()
    { if (_sanshaHmPrice == null) { _sanshaHmPrice = nCV(); }
      return _sanshaHmPrice; }
    protected ConditionValue xgetCValueSanshaHmPrice() { return xdfgetSanshaHmPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaHmPrice_Asc() { regOBA("SANSHA_HM_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaHmPrice_Desc() { regOBD("SANSHA_HM_PRICE"); return this; }

    protected ConditionValue _sanshaTotalPrice;
    public ConditionValue xdfgetSanshaTotalPrice()
    { if (_sanshaTotalPrice == null) { _sanshaTotalPrice = nCV(); }
      return _sanshaTotalPrice; }
    protected ConditionValue xgetCValueSanshaTotalPrice() { return xdfgetSanshaTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaTotalPrice_Asc() { regOBA("SANSHA_TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_SanshaTotalPrice_Desc() { regOBD("SANSHA_TOTAL_PRICE"); return this; }

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
    public BsTBldl3310CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl3310CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl3310CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl3310CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl3310CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl3310CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl3310CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl3310CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl3310CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3310CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl3310CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl3310CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl3310CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl3310CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl3310CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl3310CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl3310CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl3310CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl3310CQ> _myselfExistsMap;
    public Map<String, TBldl3310CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl3310CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl3310CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl3310CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl3310CB.class.getName(); }
    protected String xCQ() { return TBldl3310CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
