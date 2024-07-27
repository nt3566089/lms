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
 * The base condition-query of t_bldl5353.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5353CQ extends AbstractBsTBldl5353CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5353CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5353CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5353) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5353CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5353CIQ xcreateCIQ() {
        TBldl5353CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5353CIQ xnewCIQ() {
        return new TBldl5353CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5353 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5353CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5353CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5353Id;
    public ConditionValue xdfgetBldl5353Id()
    { if (_bldl5353Id == null) { _bldl5353Id = nCV(); }
      return _bldl5353Id; }
    protected ConditionValue xgetCValueBldl5353Id() { return xdfgetBldl5353Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5353_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Bldl5353Id_Asc() { regOBA("BLDL5353_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5353_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Bldl5353Id_Desc() { regOBD("BLDL5353_ID"); return this; }

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
    public BsTBldl5353CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5353CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

    protected ConditionValue _salesOrgCd;
    public ConditionValue xdfgetSalesOrgCd()
    { if (_salesOrgCd == null) { _salesOrgCd = nCV(); }
      return _salesOrgCd; }
    protected ConditionValue xgetCValueSalesOrgCd() { return xdfgetSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _salesOrgNm;
    public ConditionValue xdfgetSalesOrgNm()
    { if (_salesOrgNm == null) { _salesOrgNm = nCV(); }
      return _salesOrgNm; }
    protected ConditionValue xgetCValueSalesOrgNm() { return xdfgetSalesOrgNm(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SalesOrgNm_Asc() { regOBA("SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SalesOrgNm_Desc() { regOBD("SALES_ORG_NM"); return this; }

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
    public BsTBldl5353CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

    protected ConditionValue _date;
    public ConditionValue xdfgetDate()
    { if (_date == null) { _date = nCV(); }
      return _date; }
    protected ConditionValue xgetCValueDate() { return xdfgetDate(); }

    /**
     * Add order-by as ascend. <br>
     * DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Date_Asc() { regOBA("DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Date_Desc() { regOBD("DATE"); return this; }

    protected ConditionValue _holiday;
    public ConditionValue xdfgetHoliday()
    { if (_holiday == null) { _holiday = nCV(); }
      return _holiday; }
    protected ConditionValue xgetCValueHoliday() { return xdfgetHoliday(); }

    /**
     * Add order-by as ascend. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Holiday_Asc() { regOBA("HOLIDAY"); return this; }

    /**
     * Add order-by as descend. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_Holiday_Desc() { regOBD("HOLIDAY"); return this; }

    protected ConditionValue _soukaFwNum;
    public ConditionValue xdfgetSoukaFwNum()
    { if (_soukaFwNum == null) { _soukaFwNum = nCV(); }
      return _soukaFwNum; }
    protected ConditionValue xgetCValueSoukaFwNum() { return xdfgetSoukaFwNum(); }

    /**
     * Add order-by as ascend. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaFwNum_Asc() { regOBA("SOUKA_FW_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaFwNum_Desc() { regOBD("SOUKA_FW_NUM"); return this; }

    protected ConditionValue _soukaUnNum;
    public ConditionValue xdfgetSoukaUnNum()
    { if (_soukaUnNum == null) { _soukaUnNum = nCV(); }
      return _soukaUnNum; }
    protected ConditionValue xgetCValueSoukaUnNum() { return xdfgetSoukaUnNum(); }

    /**
     * Add order-by as ascend. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaUnNum_Asc() { regOBA("SOUKA_UN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaUnNum_Desc() { regOBD("SOUKA_UN_NUM"); return this; }

    protected ConditionValue _soukaShNum;
    public ConditionValue xdfgetSoukaShNum()
    { if (_soukaShNum == null) { _soukaShNum = nCV(); }
      return _soukaShNum; }
    protected ConditionValue xgetCValueSoukaShNum() { return xdfgetSoukaShNum(); }

    /**
     * Add order-by as ascend. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaShNum_Asc() { regOBA("SOUKA_SH_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaShNum_Desc() { regOBD("SOUKA_SH_NUM"); return this; }

    protected ConditionValue _soukaTotalNum;
    public ConditionValue xdfgetSoukaTotalNum()
    { if (_soukaTotalNum == null) { _soukaTotalNum = nCV(); }
      return _soukaTotalNum; }
    protected ConditionValue xgetCValueSoukaTotalNum() { return xdfgetSoukaTotalNum(); }

    /**
     * Add order-by as ascend. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaTotalNum_Asc() { regOBA("SOUKA_TOTAL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_SoukaTotalNum_Desc() { regOBD("SOUKA_TOTAL_NUM"); return this; }

    protected ConditionValue _koshigayaFwNum;
    public ConditionValue xdfgetKoshigayaFwNum()
    { if (_koshigayaFwNum == null) { _koshigayaFwNum = nCV(); }
      return _koshigayaFwNum; }
    protected ConditionValue xgetCValueKoshigayaFwNum() { return xdfgetKoshigayaFwNum(); }

    /**
     * Add order-by as ascend. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaFwNum_Asc() { regOBA("KOSHIGAYA_FW_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaFwNum_Desc() { regOBD("KOSHIGAYA_FW_NUM"); return this; }

    protected ConditionValue _koshigayaUnNum;
    public ConditionValue xdfgetKoshigayaUnNum()
    { if (_koshigayaUnNum == null) { _koshigayaUnNum = nCV(); }
      return _koshigayaUnNum; }
    protected ConditionValue xgetCValueKoshigayaUnNum() { return xdfgetKoshigayaUnNum(); }

    /**
     * Add order-by as ascend. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaUnNum_Asc() { regOBA("KOSHIGAYA_UN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaUnNum_Desc() { regOBD("KOSHIGAYA_UN_NUM"); return this; }

    protected ConditionValue _koshigayaShNum;
    public ConditionValue xdfgetKoshigayaShNum()
    { if (_koshigayaShNum == null) { _koshigayaShNum = nCV(); }
      return _koshigayaShNum; }
    protected ConditionValue xgetCValueKoshigayaShNum() { return xdfgetKoshigayaShNum(); }

    /**
     * Add order-by as ascend. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaShNum_Asc() { regOBA("KOSHIGAYA_SH_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaShNum_Desc() { regOBD("KOSHIGAYA_SH_NUM"); return this; }

    protected ConditionValue _koshigayaTotalNum;
    public ConditionValue xdfgetKoshigayaTotalNum()
    { if (_koshigayaTotalNum == null) { _koshigayaTotalNum = nCV(); }
      return _koshigayaTotalNum; }
    protected ConditionValue xgetCValueKoshigayaTotalNum() { return xdfgetKoshigayaTotalNum(); }

    /**
     * Add order-by as ascend. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaTotalNum_Asc() { regOBA("KOSHIGAYA_TOTAL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_KoshigayaTotalNum_Desc() { regOBD("KOSHIGAYA_TOTAL_NUM"); return this; }

    protected ConditionValue _totalNum;
    public ConditionValue xdfgetTotalNum()
    { if (_totalNum == null) { _totalNum = nCV(); }
      return _totalNum; }
    protected ConditionValue xgetCValueTotalNum() { return xdfgetTotalNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_TotalNum_Asc() { regOBA("TOTAL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_TotalNum_Desc() { regOBD("TOTAL_NUM"); return this; }

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
    public BsTBldl5353CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5353CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5353CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5353CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5353CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5353CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5353CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5353CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5353CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5353CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5353CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5353CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5353CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5353CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5353CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5353CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5353CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5353CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5353CQ> _myselfExistsMap;
    public Map<String, TBldl5353CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5353CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5353CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5353CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5353CB.class.getName(); }
    protected String xCQ() { return TBldl5353CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
