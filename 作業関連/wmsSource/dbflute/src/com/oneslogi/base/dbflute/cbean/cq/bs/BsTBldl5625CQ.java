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
 * The base condition-query of t_bldl5625.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5625CQ extends AbstractBsTBldl5625CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5625CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5625CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5625) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5625CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5625CIQ xcreateCIQ() {
        TBldl5625CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5625CIQ xnewCIQ() {
        return new TBldl5625CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5625 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5625CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5625CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5625Id;
    public ConditionValue xdfgetBldl5625Id()
    { if (_bldl5625Id == null) { _bldl5625Id = nCV(); }
      return _bldl5625Id; }
    protected ConditionValue xgetCValueBldl5625Id() { return xdfgetBldl5625Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_Bldl5625Id_Asc() { regOBA("BLDL5625_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_Bldl5625Id_Desc() { regOBD("BLDL5625_ID"); return this; }

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
    public BsTBldl5625CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5625CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl5625CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

    protected ConditionValue _rowNo;
    public ConditionValue xdfgetRowNo()
    { if (_rowNo == null) { _rowNo = nCV(); }
      return _rowNo; }
    protected ConditionValue xgetCValueRowNo() { return xdfgetRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _fwShippingCnt;
    public ConditionValue xdfgetFwShippingCnt()
    { if (_fwShippingCnt == null) { _fwShippingCnt = nCV(); }
      return _fwShippingCnt; }
    protected ConditionValue xgetCValueFwShippingCnt() { return xdfgetFwShippingCnt(); }

    /**
     * Add order-by as ascend. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_FwShippingCnt_Asc() { regOBA("FW_SHIPPING_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_FwShippingCnt_Desc() { regOBD("FW_SHIPPING_CNT"); return this; }

    protected ConditionValue _fwShippingNum;
    public ConditionValue xdfgetFwShippingNum()
    { if (_fwShippingNum == null) { _fwShippingNum = nCV(); }
      return _fwShippingNum; }
    protected ConditionValue xgetCValueFwShippingNum() { return xdfgetFwShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_FwShippingNum_Asc() { regOBA("FW_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_FwShippingNum_Desc() { regOBD("FW_SHIPPING_NUM"); return this; }

    protected ConditionValue _unShippingCnt;
    public ConditionValue xdfgetUnShippingCnt()
    { if (_unShippingCnt == null) { _unShippingCnt = nCV(); }
      return _unShippingCnt; }
    protected ConditionValue xgetCValueUnShippingCnt() { return xdfgetUnShippingCnt(); }

    /**
     * Add order-by as ascend. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UnShippingCnt_Asc() { regOBA("UN_SHIPPING_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UnShippingCnt_Desc() { regOBD("UN_SHIPPING_CNT"); return this; }

    protected ConditionValue _unShippingNum;
    public ConditionValue xdfgetUnShippingNum()
    { if (_unShippingNum == null) { _unShippingNum = nCV(); }
      return _unShippingNum; }
    protected ConditionValue xgetCValueUnShippingNum() { return xdfgetUnShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UnShippingNum_Asc() { regOBA("UN_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UnShippingNum_Desc() { regOBD("UN_SHIPPING_NUM"); return this; }

    protected ConditionValue _shShippingCnt;
    public ConditionValue xdfgetShShippingCnt()
    { if (_shShippingCnt == null) { _shShippingCnt = nCV(); }
      return _shShippingCnt; }
    protected ConditionValue xgetCValueShShippingCnt() { return xdfgetShShippingCnt(); }

    /**
     * Add order-by as ascend. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShShippingCnt_Asc() { regOBA("SH_SHIPPING_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShShippingCnt_Desc() { regOBD("SH_SHIPPING_CNT"); return this; }

    protected ConditionValue _shShippingNum;
    public ConditionValue xdfgetShShippingNum()
    { if (_shShippingNum == null) { _shShippingNum = nCV(); }
      return _shShippingNum; }
    protected ConditionValue xgetCValueShShippingNum() { return xdfgetShShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShShippingNum_Asc() { regOBA("SH_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ShShippingNum_Desc() { regOBD("SH_SHIPPING_NUM"); return this; }

    protected ConditionValue _totalShippingCnt;
    public ConditionValue xdfgetTotalShippingCnt()
    { if (_totalShippingCnt == null) { _totalShippingCnt = nCV(); }
      return _totalShippingCnt; }
    protected ConditionValue xgetCValueTotalShippingCnt() { return xdfgetTotalShippingCnt(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_TotalShippingCnt_Asc() { regOBA("TOTAL_SHIPPING_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_TotalShippingCnt_Desc() { regOBD("TOTAL_SHIPPING_CNT"); return this; }

    protected ConditionValue _totalShippingNum;
    public ConditionValue xdfgetTotalShippingNum()
    { if (_totalShippingNum == null) { _totalShippingNum = nCV(); }
      return _totalShippingNum; }
    protected ConditionValue xgetCValueTotalShippingNum() { return xdfgetTotalShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_TotalShippingNum_Asc() { regOBA("TOTAL_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_TotalShippingNum_Desc() { regOBD("TOTAL_SHIPPING_NUM"); return this; }

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
    public BsTBldl5625CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5625CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5625CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5625CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5625CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5625CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5625CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5625CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5625CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5625CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5625CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5625CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5625CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5625CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5625CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5625CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5625CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5625CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5625CQ> _myselfExistsMap;
    public Map<String, TBldl5625CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5625CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5625CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5625CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5625CB.class.getName(); }
    protected String xCQ() { return TBldl5625CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
