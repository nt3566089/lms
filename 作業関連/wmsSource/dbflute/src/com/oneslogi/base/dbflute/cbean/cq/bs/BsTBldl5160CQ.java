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
 * The base condition-query of t_bldl5160.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5160CQ extends AbstractBsTBldl5160CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5160CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5160CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5160) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5160CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5160CIQ xcreateCIQ() {
        TBldl5160CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5160CIQ xnewCIQ() {
        return new TBldl5160CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5160 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5160CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5160CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5160Id;
    public ConditionValue xdfgetBldl5160Id()
    { if (_bldl5160Id == null) { _bldl5160Id = nCV(); }
      return _bldl5160Id; }
    protected ConditionValue xgetCValueBldl5160Id() { return xdfgetBldl5160Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_Bldl5160Id_Asc() { regOBA("BLDL5160_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_Bldl5160Id_Desc() { regOBD("BLDL5160_ID"); return this; }

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
    public BsTBldl5160CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5160CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl5160CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl5160CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _receiveDt;
    public ConditionValue xdfgetReceiveDt()
    { if (_receiveDt == null) { _receiveDt = nCV(); }
      return _receiveDt; }
    protected ConditionValue xgetCValueReceiveDt() { return xdfgetReceiveDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ReceiveDt_Asc() { regOBA("RECEIVE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ReceiveDt_Desc() { regOBD("RECEIVE_DT"); return this; }

    protected ConditionValue _fwReceiveCnt;
    public ConditionValue xdfgetFwReceiveCnt()
    { if (_fwReceiveCnt == null) { _fwReceiveCnt = nCV(); }
      return _fwReceiveCnt; }
    protected ConditionValue xgetCValueFwReceiveCnt() { return xdfgetFwReceiveCnt(); }

    /**
     * Add order-by as ascend. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwReceiveCnt_Asc() { regOBA("FW_RECEIVE_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwReceiveCnt_Desc() { regOBD("FW_RECEIVE_CNT"); return this; }

    protected ConditionValue _fwReceiveNum;
    public ConditionValue xdfgetFwReceiveNum()
    { if (_fwReceiveNum == null) { _fwReceiveNum = nCV(); }
      return _fwReceiveNum; }
    protected ConditionValue xgetCValueFwReceiveNum() { return xdfgetFwReceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwReceiveNum_Asc() { regOBA("FW_RECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwReceiveNum_Desc() { regOBD("FW_RECEIVE_NUM"); return this; }

    protected ConditionValue _fwCaseNum;
    public ConditionValue xdfgetFwCaseNum()
    { if (_fwCaseNum == null) { _fwCaseNum = nCV(); }
      return _fwCaseNum; }
    protected ConditionValue xgetCValueFwCaseNum() { return xdfgetFwCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwCaseNum_Asc() { regOBA("FW_CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_FwCaseNum_Desc() { regOBD("FW_CASE_NUM"); return this; }

    protected ConditionValue _unReceiveCnt;
    public ConditionValue xdfgetUnReceiveCnt()
    { if (_unReceiveCnt == null) { _unReceiveCnt = nCV(); }
      return _unReceiveCnt; }
    protected ConditionValue xgetCValueUnReceiveCnt() { return xdfgetUnReceiveCnt(); }

    /**
     * Add order-by as ascend. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnReceiveCnt_Asc() { regOBA("UN_RECEIVE_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnReceiveCnt_Desc() { regOBD("UN_RECEIVE_CNT"); return this; }

    protected ConditionValue _unReceiveNum;
    public ConditionValue xdfgetUnReceiveNum()
    { if (_unReceiveNum == null) { _unReceiveNum = nCV(); }
      return _unReceiveNum; }
    protected ConditionValue xgetCValueUnReceiveNum() { return xdfgetUnReceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnReceiveNum_Asc() { regOBA("UN_RECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnReceiveNum_Desc() { regOBD("UN_RECEIVE_NUM"); return this; }

    protected ConditionValue _unCaseNum;
    public ConditionValue xdfgetUnCaseNum()
    { if (_unCaseNum == null) { _unCaseNum = nCV(); }
      return _unCaseNum; }
    protected ConditionValue xgetCValueUnCaseNum() { return xdfgetUnCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnCaseNum_Asc() { regOBA("UN_CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UnCaseNum_Desc() { regOBD("UN_CASE_NUM"); return this; }

    protected ConditionValue _shReceiveCnt;
    public ConditionValue xdfgetShReceiveCnt()
    { if (_shReceiveCnt == null) { _shReceiveCnt = nCV(); }
      return _shReceiveCnt; }
    protected ConditionValue xgetCValueShReceiveCnt() { return xdfgetShReceiveCnt(); }

    /**
     * Add order-by as ascend. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShReceiveCnt_Asc() { regOBA("SH_RECEIVE_CNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShReceiveCnt_Desc() { regOBD("SH_RECEIVE_CNT"); return this; }

    protected ConditionValue _shReceiveNum;
    public ConditionValue xdfgetShReceiveNum()
    { if (_shReceiveNum == null) { _shReceiveNum = nCV(); }
      return _shReceiveNum; }
    protected ConditionValue xgetCValueShReceiveNum() { return xdfgetShReceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShReceiveNum_Asc() { regOBA("SH_RECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShReceiveNum_Desc() { regOBD("SH_RECEIVE_NUM"); return this; }

    protected ConditionValue _shCaseNum;
    public ConditionValue xdfgetShCaseNum()
    { if (_shCaseNum == null) { _shCaseNum = nCV(); }
      return _shCaseNum; }
    protected ConditionValue xgetCValueShCaseNum() { return xdfgetShCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShCaseNum_Asc() { regOBA("SH_CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ShCaseNum_Desc() { regOBD("SH_CASE_NUM"); return this; }

    protected ConditionValue _totalReceiveNum;
    public ConditionValue xdfgetTotalReceiveNum()
    { if (_totalReceiveNum == null) { _totalReceiveNum = nCV(); }
      return _totalReceiveNum; }
    protected ConditionValue xgetCValueTotalReceiveNum() { return xdfgetTotalReceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_TotalReceiveNum_Asc() { regOBA("TOTAL_RECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_TotalReceiveNum_Desc() { regOBD("TOTAL_RECEIVE_NUM"); return this; }

    protected ConditionValue _totalCaseNum;
    public ConditionValue xdfgetTotalCaseNum()
    { if (_totalCaseNum == null) { _totalCaseNum = nCV(); }
      return _totalCaseNum; }
    protected ConditionValue xgetCValueTotalCaseNum() { return xdfgetTotalCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_TotalCaseNum_Asc() { regOBA("TOTAL_CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_TotalCaseNum_Desc() { regOBD("TOTAL_CASE_NUM"); return this; }

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
    public BsTBldl5160CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5160CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5160CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5160CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5160CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5160CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5160CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5160CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5160CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5160CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5160CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5160CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5160CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5160CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5160CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5160CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5160CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5160CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5160CQ> _myselfExistsMap;
    public Map<String, TBldl5160CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5160CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5160CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5160CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5160CB.class.getName(); }
    protected String xCQ() { return TBldl5160CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
