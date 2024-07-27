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
 * The base condition-query of t_bldl5250.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5250CQ extends AbstractBsTBldl5250CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5250CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5250CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5250) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5250CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5250CIQ xcreateCIQ() {
        TBldl5250CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5250CIQ xnewCIQ() {
        return new TBldl5250CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5250 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5250CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5250CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5250Id;
    public ConditionValue xdfgetBldl5250Id()
    { if (_bldl5250Id == null) { _bldl5250Id = nCV(); }
      return _bldl5250Id; }
    protected ConditionValue xgetCValueBldl5250Id() { return xdfgetBldl5250Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5250_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Bldl5250Id_Asc() { regOBA("BLDL5250_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5250_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Bldl5250Id_Desc() { regOBD("BLDL5250_ID"); return this; }

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
    public BsTBldl5250CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5250CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl5250CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

    protected ConditionValue _transferTypeCd;
    public ConditionValue xdfgetTransferTypeCd()
    { if (_transferTypeCd == null) { _transferTypeCd = nCV(); }
      return _transferTypeCd; }
    protected ConditionValue xgetCValueTransferTypeCd() { return xdfgetTransferTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_TransferTypeCd_Asc() { regOBA("TRANSFER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_TransferTypeCd_Desc() { regOBD("TRANSFER_TYPE_CD"); return this; }

    protected ConditionValue _transferDt;
    public ConditionValue xdfgetTransferDt()
    { if (_transferDt == null) { _transferDt = nCV(); }
      return _transferDt; }
    protected ConditionValue xgetCValueTransferDt() { return xdfgetTransferDt(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_TransferDt_Asc() { regOBA("TRANSFER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_TransferDt_Desc() { regOBD("TRANSFER_DT"); return this; }

    protected ConditionValue _beforeLocCd;
    public ConditionValue xdfgetBeforeLocCd()
    { if (_beforeLocCd == null) { _beforeLocCd = nCV(); }
      return _beforeLocCd; }
    protected ConditionValue xgetCValueBeforeLocCd() { return xdfgetBeforeLocCd(); }

    /**
     * Add order-by as ascend. <br>
     * BEFORE_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_BeforeLocCd_Asc() { regOBA("BEFORE_LOC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEFORE_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_BeforeLocCd_Desc() { regOBD("BEFORE_LOC_CD"); return this; }

    protected ConditionValue _afterLocCd;
    public ConditionValue xdfgetAfterLocCd()
    { if (_afterLocCd == null) { _afterLocCd = nCV(); }
      return _afterLocCd; }
    protected ConditionValue xgetCValueAfterLocCd() { return xdfgetAfterLocCd(); }

    /**
     * Add order-by as ascend. <br>
     * AFTER_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_AfterLocCd_Asc() { regOBA("AFTER_LOC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * AFTER_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_AfterLocCd_Desc() { regOBD("AFTER_LOC_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _num;
    public ConditionValue xdfgetNum()
    { if (_num == null) { _num = nCV(); }
      return _num; }
    protected ConditionValue xgetCValueNum() { return xdfgetNum(); }

    /**
     * Add order-by as ascend. <br>
     * NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Num_Asc() { regOBA("NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_Num_Desc() { regOBD("NUM"); return this; }

    protected ConditionValue _caseNum;
    public ConditionValue xdfgetCaseNum()
    { if (_caseNum == null) { _caseNum = nCV(); }
      return _caseNum; }
    protected ConditionValue xgetCValueCaseNum() { return xdfgetCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_CaseNum_Asc() { regOBA("CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_CaseNum_Desc() { regOBD("CASE_NUM"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _userNm;
    public ConditionValue xdfgetUserNm()
    { if (_userNm == null) { _userNm = nCV(); }
      return _userNm; }
    protected ConditionValue xgetCValueUserNm() { return xdfgetUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UserNm_Asc() { regOBA("USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UserNm_Desc() { regOBD("USER_NM"); return this; }

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
    public BsTBldl5250CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5250CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5250CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5250CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5250CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5250CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5250CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5250CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5250CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5250CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5250CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5250CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5250CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5250CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5250CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5250CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5250CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5250CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5250CQ> _myselfExistsMap;
    public Map<String, TBldl5250CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5250CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5250CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5250CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5250CB.class.getName(); }
    protected String xCQ() { return TBldl5250CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
