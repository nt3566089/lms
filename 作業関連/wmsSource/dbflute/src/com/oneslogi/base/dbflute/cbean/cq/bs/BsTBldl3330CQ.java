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
 * The base condition-query of t_bldl3330.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl3330CQ extends AbstractBsTBldl3330CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl3330CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl3330CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl3330) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl3330CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl3330CIQ xcreateCIQ() {
        TBldl3330CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl3330CIQ xnewCIQ() {
        return new TBldl3330CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl3330 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl3330CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl3330CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * BLDL3310_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_Bldl3310Id_Asc() { regOBA("BLDL3310_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL3310_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_Bldl3310Id_Desc() { regOBD("BLDL3310_ID"); return this; }

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
    public BsTBldl3330CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl3330CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl3330CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl3330CQ addOrderBy_ContractorNm_Asc() { regOBA("CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_ContractorNm_Desc() { regOBD("CONTRACTOR_NM"); return this; }

    protected ConditionValue _ecUserTypeCd;
    public ConditionValue xdfgetEcUserTypeCd()
    { if (_ecUserTypeCd == null) { _ecUserTypeCd = nCV(); }
      return _ecUserTypeCd; }
    protected ConditionValue xgetCValueEcUserTypeCd() { return xdfgetEcUserTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * EC_USER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_EcUserTypeCd_Asc() { regOBA("EC_USER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_USER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_EcUserTypeCd_Desc() { regOBD("EC_USER_TYPE_CD"); return this; }

    protected ConditionValue _fwNum;
    public ConditionValue xdfgetFwNum()
    { if (_fwNum == null) { _fwNum = nCV(); }
      return _fwNum; }
    protected ConditionValue xgetCValueFwNum() { return xdfgetFwNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_FwNum_Asc() { regOBA("FW_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_FwNum_Desc() { regOBD("FW_NUM"); return this; }

    protected ConditionValue _sanshaFwNum;
    public ConditionValue xdfgetSanshaFwNum()
    { if (_sanshaFwNum == null) { _sanshaFwNum = nCV(); }
      return _sanshaFwNum; }
    protected ConditionValue xgetCValueSanshaFwNum() { return xdfgetSanshaFwNum(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaFwNum_Asc() { regOBA("SANSHA_FW_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaFwNum_Desc() { regOBD("SANSHA_FW_NUM"); return this; }

    protected ConditionValue _sanshaUnNum;
    public ConditionValue xdfgetSanshaUnNum()
    { if (_sanshaUnNum == null) { _sanshaUnNum = nCV(); }
      return _sanshaUnNum; }
    protected ConditionValue xgetCValueSanshaUnNum() { return xdfgetSanshaUnNum(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaUnNum_Asc() { regOBA("SANSHA_UN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaUnNum_Desc() { regOBD("SANSHA_UN_NUM"); return this; }

    protected ConditionValue _sanshaShNum;
    public ConditionValue xdfgetSanshaShNum()
    { if (_sanshaShNum == null) { _sanshaShNum = nCV(); }
      return _sanshaShNum; }
    protected ConditionValue xgetCValueSanshaShNum() { return xdfgetSanshaShNum(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaShNum_Asc() { regOBA("SANSHA_SH_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaShNum_Desc() { regOBD("SANSHA_SH_NUM"); return this; }

    protected ConditionValue _sanshaHmNum;
    public ConditionValue xdfgetSanshaHmNum()
    { if (_sanshaHmNum == null) { _sanshaHmNum = nCV(); }
      return _sanshaHmNum; }
    protected ConditionValue xgetCValueSanshaHmNum() { return xdfgetSanshaHmNum(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_HM_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaHmNum_Asc() { regOBA("SANSHA_HM_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_HM_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaHmNum_Desc() { regOBD("SANSHA_HM_NUM"); return this; }

    protected ConditionValue _sanshaTotalNum;
    public ConditionValue xdfgetSanshaTotalNum()
    { if (_sanshaTotalNum == null) { _sanshaTotalNum = nCV(); }
      return _sanshaTotalNum; }
    protected ConditionValue xgetCValueSanshaTotalNum() { return xdfgetSanshaTotalNum(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaTotalNum_Asc() { regOBA("SANSHA_TOTAL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_SanshaTotalNum_Desc() { regOBD("SANSHA_TOTAL_NUM"); return this; }

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
    public BsTBldl3330CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl3330CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl3330CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl3330CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl3330CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl3330CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl3330CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl3330CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl3330CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3330CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl3330CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl3330CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl3330CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl3330CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl3330CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl3330CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl3330CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl3330CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl3330CQ> _myselfExistsMap;
    public Map<String, TBldl3330CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl3330CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl3330CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl3330CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl3330CB.class.getName(); }
    protected String xCQ() { return TBldl3330CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
