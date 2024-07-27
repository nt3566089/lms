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
 * The base condition-query of t_bldl3350.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl3350CQ extends AbstractBsTBldl3350CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl3350CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl3350CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl3350) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl3350CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl3350CIQ xcreateCIQ() {
        TBldl3350CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl3350CIQ xnewCIQ() {
        return new TBldl3350CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl3350 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl3350CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl3350CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl3350Id;
    public ConditionValue xdfgetBldl3350Id()
    { if (_bldl3350Id == null) { _bldl3350Id = nCV(); }
      return _bldl3350Id; }
    protected ConditionValue xgetCValueBldl3350Id() { return xdfgetBldl3350Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Bldl3350Id_Asc() { regOBA("BLDL3350_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Bldl3350Id_Desc() { regOBD("BLDL3350_ID"); return this; }

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
    public BsTBldl3350CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl3350CQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

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
    public BsTBldl3350CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl3350CQ addOrderBy_SalesOrgNm_Asc() { regOBA("SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_SalesOrgNm_Desc() { regOBD("SALES_ORG_NM"); return this; }

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
    public BsTBldl3350CQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _yamatoShippingNum;
    public ConditionValue xdfgetYamatoShippingNum()
    { if (_yamatoShippingNum == null) { _yamatoShippingNum = nCV(); }
      return _yamatoShippingNum; }
    protected ConditionValue xgetCValueYamatoShippingNum() { return xdfgetYamatoShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_YamatoShippingNum_Asc() { regOBA("YAMATO_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_YamatoShippingNum_Desc() { regOBD("YAMATO_SHIPPING_NUM"); return this; }

    protected ConditionValue _yamatoEcShippingNum;
    public ConditionValue xdfgetYamatoEcShippingNum()
    { if (_yamatoEcShippingNum == null) { _yamatoEcShippingNum = nCV(); }
      return _yamatoEcShippingNum; }
    protected ConditionValue xgetCValueYamatoEcShippingNum() { return xdfgetYamatoEcShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_YamatoEcShippingNum_Asc() { regOBA("YAMATO_EC_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_YamatoEcShippingNum_Desc() { regOBD("YAMATO_EC_SHIPPING_NUM"); return this; }

    protected ConditionValue _sagawaShippingNum;
    public ConditionValue xdfgetSagawaShippingNum()
    { if (_sagawaShippingNum == null) { _sagawaShippingNum = nCV(); }
      return _sagawaShippingNum; }
    protected ConditionValue xgetCValueSagawaShippingNum() { return xdfgetSagawaShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_SagawaShippingNum_Asc() { regOBA("SAGAWA_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_SagawaShippingNum_Desc() { regOBD("SAGAWA_SHIPPING_NUM"); return this; }

    protected ConditionValue _sagawaEcShippingNum;
    public ConditionValue xdfgetSagawaEcShippingNum()
    { if (_sagawaEcShippingNum == null) { _sagawaEcShippingNum = nCV(); }
      return _sagawaEcShippingNum; }
    protected ConditionValue xgetCValueSagawaEcShippingNum() { return xdfgetSagawaEcShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_SagawaEcShippingNum_Asc() { regOBA("SAGAWA_EC_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_SagawaEcShippingNum_Desc() { regOBD("SAGAWA_EC_SHIPPING_NUM"); return this; }

    protected ConditionValue _sagawa2ShippingNum;
    public ConditionValue xdfgetSagawa2ShippingNum()
    { if (_sagawa2ShippingNum == null) { _sagawa2ShippingNum = nCV(); }
      return _sagawa2ShippingNum; }
    protected ConditionValue xgetCValueSagawa2ShippingNum() { return xdfgetSagawa2ShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Sagawa2ShippingNum_Asc() { regOBA("SAGAWA2_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Sagawa2ShippingNum_Desc() { regOBD("SAGAWA2_SHIPPING_NUM"); return this; }

    protected ConditionValue _sagawa2EcShippingNum;
    public ConditionValue xdfgetSagawa2EcShippingNum()
    { if (_sagawa2EcShippingNum == null) { _sagawa2EcShippingNum = nCV(); }
      return _sagawa2EcShippingNum; }
    protected ConditionValue xgetCValueSagawa2EcShippingNum() { return xdfgetSagawa2EcShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Sagawa2EcShippingNum_Asc() { regOBA("SAGAWA2_EC_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_Sagawa2EcShippingNum_Desc() { regOBD("SAGAWA2_EC_SHIPPING_NUM"); return this; }

    protected ConditionValue _otherShippingNum;
    public ConditionValue xdfgetOtherShippingNum()
    { if (_otherShippingNum == null) { _otherShippingNum = nCV(); }
      return _otherShippingNum; }
    protected ConditionValue xgetCValueOtherShippingNum() { return xdfgetOtherShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_OtherShippingNum_Asc() { regOBA("OTHER_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_OtherShippingNum_Desc() { regOBD("OTHER_SHIPPING_NUM"); return this; }

    protected ConditionValue _otherEcShippingNum;
    public ConditionValue xdfgetOtherEcShippingNum()
    { if (_otherEcShippingNum == null) { _otherEcShippingNum = nCV(); }
      return _otherEcShippingNum; }
    protected ConditionValue xgetCValueOtherEcShippingNum() { return xdfgetOtherEcShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_OtherEcShippingNum_Asc() { regOBA("OTHER_EC_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_OtherEcShippingNum_Desc() { regOBD("OTHER_EC_SHIPPING_NUM"); return this; }

    protected ConditionValue _cancelShippingNum;
    public ConditionValue xdfgetCancelShippingNum()
    { if (_cancelShippingNum == null) { _cancelShippingNum = nCV(); }
      return _cancelShippingNum; }
    protected ConditionValue xgetCValueCancelShippingNum() { return xdfgetCancelShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_CancelShippingNum_Asc() { regOBA("CANCEL_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_CancelShippingNum_Desc() { regOBD("CANCEL_SHIPPING_NUM"); return this; }

    protected ConditionValue _cancelEcShippingNum;
    public ConditionValue xdfgetCancelEcShippingNum()
    { if (_cancelEcShippingNum == null) { _cancelEcShippingNum = nCV(); }
      return _cancelEcShippingNum; }
    protected ConditionValue xgetCValueCancelEcShippingNum() { return xdfgetCancelEcShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_CancelEcShippingNum_Asc() { regOBA("CANCEL_EC_SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_CancelEcShippingNum_Desc() { regOBD("CANCEL_EC_SHIPPING_NUM"); return this; }

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
    public BsTBldl3350CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl3350CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl3350CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl3350CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl3350CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl3350CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl3350CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl3350CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl3350CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl3350CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl3350CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl3350CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl3350CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl3350CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl3350CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl3350CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl3350CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl3350CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl3350CQ> _myselfExistsMap;
    public Map<String, TBldl3350CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl3350CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl3350CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl3350CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl3350CB.class.getName(); }
    protected String xCQ() { return TBldl3350CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
