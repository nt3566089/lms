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
 * The base condition-query of t_bldl5060.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5060CQ extends AbstractBsTBldl5060CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5060CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5060CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5060) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5060CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5060CIQ xcreateCIQ() {
        TBldl5060CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5060CIQ xnewCIQ() {
        return new TBldl5060CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5060 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5060CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5060CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5060Id;
    public ConditionValue xdfgetBldl5060Id()
    { if (_bldl5060Id == null) { _bldl5060Id = nCV(); }
      return _bldl5060Id; }
    protected ConditionValue xgetCValueBldl5060Id() { return xdfgetBldl5060Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_Bldl5060Id_Asc() { regOBA("BLDL5060_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_Bldl5060Id_Desc() { regOBD("BLDL5060_ID"); return this; }

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
    public BsTBldl5060CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5060CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl5060CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl5060CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _returnDt;
    public ConditionValue xdfgetReturnDt()
    { if (_returnDt == null) { _returnDt = nCV(); }
      return _returnDt; }
    protected ConditionValue xgetCValueReturnDt() { return xdfgetReturnDt(); }

    /**
     * Add order-by as ascend. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ReturnDt_Asc() { regOBA("RETURN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ReturnDt_Desc() { regOBD("RETURN_DT"); return this; }

    protected ConditionValue _fwReturnCnt;
    public ConditionValue xdfgetFwReturnCnt()
    { if (_fwReturnCnt == null) { _fwReturnCnt = nCV(); }
      return _fwReturnCnt; }
    protected ConditionValue xgetCValueFwReturnCnt() { return xdfgetFwReturnCnt(); }

    /**
     * Add order-by as ascend. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_FwReturnCnt_Asc() { regOBA("FW_RETURN_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_FwReturnCnt_Desc() { regOBD("FW_RETURN_CNT"); return this; }

    protected ConditionValue _fwReturnNum;
    public ConditionValue xdfgetFwReturnNum()
    { if (_fwReturnNum == null) { _fwReturnNum = nCV(); }
      return _fwReturnNum; }
    protected ConditionValue xgetCValueFwReturnNum() { return xdfgetFwReturnNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_FwReturnNum_Asc() { regOBA("FW_RETURN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_FwReturnNum_Desc() { regOBD("FW_RETURN_NUM"); return this; }

    protected ConditionValue _unReturnCnt;
    public ConditionValue xdfgetUnReturnCnt()
    { if (_unReturnCnt == null) { _unReturnCnt = nCV(); }
      return _unReturnCnt; }
    protected ConditionValue xgetCValueUnReturnCnt() { return xdfgetUnReturnCnt(); }

    /**
     * Add order-by as ascend. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UnReturnCnt_Asc() { regOBA("UN_RETURN_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UnReturnCnt_Desc() { regOBD("UN_RETURN_CNT"); return this; }

    protected ConditionValue _unReturnNum;
    public ConditionValue xdfgetUnReturnNum()
    { if (_unReturnNum == null) { _unReturnNum = nCV(); }
      return _unReturnNum; }
    protected ConditionValue xgetCValueUnReturnNum() { return xdfgetUnReturnNum(); }

    /**
     * Add order-by as ascend. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UnReturnNum_Asc() { regOBA("UN_RETURN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UnReturnNum_Desc() { regOBD("UN_RETURN_NUM"); return this; }

    protected ConditionValue _shReturnCnt;
    public ConditionValue xdfgetShReturnCnt()
    { if (_shReturnCnt == null) { _shReturnCnt = nCV(); }
      return _shReturnCnt; }
    protected ConditionValue xgetCValueShReturnCnt() { return xdfgetShReturnCnt(); }

    /**
     * Add order-by as ascend. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ShReturnCnt_Asc() { regOBA("SH_RETURN_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ShReturnCnt_Desc() { regOBD("SH_RETURN_CNT"); return this; }

    protected ConditionValue _shReturnNum;
    public ConditionValue xdfgetShReturnNum()
    { if (_shReturnNum == null) { _shReturnNum = nCV(); }
      return _shReturnNum; }
    protected ConditionValue xgetCValueShReturnNum() { return xdfgetShReturnNum(); }

    /**
     * Add order-by as ascend. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ShReturnNum_Asc() { regOBA("SH_RETURN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ShReturnNum_Desc() { regOBD("SH_RETURN_NUM"); return this; }

    protected ConditionValue _hmReturnCnt;
    public ConditionValue xdfgetHmReturnCnt()
    { if (_hmReturnCnt == null) { _hmReturnCnt = nCV(); }
      return _hmReturnCnt; }
    protected ConditionValue xgetCValueHmReturnCnt() { return xdfgetHmReturnCnt(); }

    /**
     * Add order-by as ascend. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_HmReturnCnt_Asc() { regOBA("HM_RETURN_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_HmReturnCnt_Desc() { regOBD("HM_RETURN_CNT"); return this; }

    protected ConditionValue _hmReturnNum;
    public ConditionValue xdfgetHmReturnNum()
    { if (_hmReturnNum == null) { _hmReturnNum = nCV(); }
      return _hmReturnNum; }
    protected ConditionValue xgetCValueHmReturnNum() { return xdfgetHmReturnNum(); }

    /**
     * Add order-by as ascend. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_HmReturnNum_Asc() { regOBA("HM_RETURN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_HmReturnNum_Desc() { regOBD("HM_RETURN_NUM"); return this; }

    protected ConditionValue _totalReturnCnt;
    public ConditionValue xdfgetTotalReturnCnt()
    { if (_totalReturnCnt == null) { _totalReturnCnt = nCV(); }
      return _totalReturnCnt; }
    protected ConditionValue xgetCValueTotalReturnCnt() { return xdfgetTotalReturnCnt(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_TotalReturnCnt_Asc() { regOBA("TOTAL_RETURN_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_TotalReturnCnt_Desc() { regOBD("TOTAL_RETURN_CNT"); return this; }

    protected ConditionValue _totalReturnNum;
    public ConditionValue xdfgetTotalReturnNum()
    { if (_totalReturnNum == null) { _totalReturnNum = nCV(); }
      return _totalReturnNum; }
    protected ConditionValue xgetCValueTotalReturnNum() { return xdfgetTotalReturnNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_TotalReturnNum_Asc() { regOBA("TOTAL_RETURN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_TotalReturnNum_Desc() { regOBD("TOTAL_RETURN_NUM"); return this; }

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
    public BsTBldl5060CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5060CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5060CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5060CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5060CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5060CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5060CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5060CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5060CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5060CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5060CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5060CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5060CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5060CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5060CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5060CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5060CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5060CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5060CQ> _myselfExistsMap;
    public Map<String, TBldl5060CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5060CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5060CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5060CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5060CB.class.getName(); }
    protected String xCQ() { return TBldl5060CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
