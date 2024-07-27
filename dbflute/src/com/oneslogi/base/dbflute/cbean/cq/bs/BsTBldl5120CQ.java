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
 * The base condition-query of t_bldl5120.
 * @author DBFlute(AutoGenerator)
 */
public class BsTBldl5120CQ extends AbstractBsTBldl5120CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TBldl5120CIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTBldl5120CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_bldl5120) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TBldl5120CIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TBldl5120CIQ xcreateCIQ() {
        TBldl5120CIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TBldl5120CIQ xnewCIQ() {
        return new TBldl5120CIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_bldl5120 on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TBldl5120CIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TBldl5120CIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _bldl5120Id;
    public ConditionValue xdfgetBldl5120Id()
    { if (_bldl5120Id == null) { _bldl5120Id = nCV(); }
      return _bldl5120Id; }
    protected ConditionValue xgetCValueBldl5120Id() { return xdfgetBldl5120Id(); }

    /**
     * Add order-by as ascend. <br>
     * BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_Bldl5120Id_Asc() { regOBA("BLDL5120_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_Bldl5120Id_Desc() { regOBD("BLDL5120_ID"); return this; }

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
    public BsTBldl5120CQ addOrderBy_Yearmonth_Asc() { regOBA("YEARMONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_Yearmonth_Desc() { regOBD("YEARMONTH"); return this; }

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
    public BsTBldl5120CQ addOrderBy_Month_Asc() { regOBA("MONTH"); return this; }

    /**
     * Add order-by as descend. <br>
     * MONTH: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_Month_Desc() { regOBD("MONTH"); return this; }

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
    public BsTBldl5120CQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierNm;
    public ConditionValue xdfgetCarrierNm()
    { if (_carrierNm == null) { _carrierNm = nCV(); }
      return _carrierNm; }
    protected ConditionValue xgetCValueCarrierNm() { return xdfgetCarrierNm(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

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
    public BsTBldl5120CQ addOrderBy_RowNo_Asc() { regOBA("ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_RowNo_Desc() { regOBD("ROW_NO"); return this; }

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
    public BsTBldl5120CQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _kamataStore;
    public ConditionValue xdfgetKamataStore()
    { if (_kamataStore == null) { _kamataStore = nCV(); }
      return _kamataStore; }
    protected ConditionValue xgetCValueKamataStore() { return xdfgetKamataStore(); }

    /**
     * Add order-by as ascend. <br>
     * KAMATA_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KamataStore_Asc() { regOBA("KAMATA_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * KAMATA_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KamataStore_Desc() { regOBD("KAMATA_STORE"); return this; }

    protected ConditionValue _kamataDirect;
    public ConditionValue xdfgetKamataDirect()
    { if (_kamataDirect == null) { _kamataDirect = nCV(); }
      return _kamataDirect; }
    protected ConditionValue xgetCValueKamataDirect() { return xdfgetKamataDirect(); }

    /**
     * Add order-by as ascend. <br>
     * KAMATA_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KamataDirect_Asc() { regOBA("KAMATA_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * KAMATA_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KamataDirect_Desc() { regOBD("KAMATA_DIRECT"); return this; }

    protected ConditionValue _kashiwaStore;
    public ConditionValue xdfgetKashiwaStore()
    { if (_kashiwaStore == null) { _kashiwaStore = nCV(); }
      return _kashiwaStore; }
    protected ConditionValue xgetCValueKashiwaStore() { return xdfgetKashiwaStore(); }

    /**
     * Add order-by as ascend. <br>
     * KASHIWA_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KashiwaStore_Asc() { regOBA("KASHIWA_STORE"); return this; }

    /**
     * Add order-by as descend. <br>
     * KASHIWA_STORE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KashiwaStore_Desc() { regOBD("KASHIWA_STORE"); return this; }

    protected ConditionValue _kashiwaDirect;
    public ConditionValue xdfgetKashiwaDirect()
    { if (_kashiwaDirect == null) { _kashiwaDirect = nCV(); }
      return _kashiwaDirect; }
    protected ConditionValue xgetCValueKashiwaDirect() { return xdfgetKashiwaDirect(); }

    /**
     * Add order-by as ascend. <br>
     * KASHIWA_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KashiwaDirect_Asc() { regOBA("KASHIWA_DIRECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * KASHIWA_DIRECT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_KashiwaDirect_Desc() { regOBD("KASHIWA_DIRECT"); return this; }

    protected ConditionValue _storeTotal;
    public ConditionValue xdfgetStoreTotal()
    { if (_storeTotal == null) { _storeTotal = nCV(); }
      return _storeTotal; }
    protected ConditionValue xgetCValueStoreTotal() { return xdfgetStoreTotal(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_TOTAL: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_StoreTotal_Asc() { regOBA("STORE_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_TOTAL: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_StoreTotal_Desc() { regOBD("STORE_TOTAL"); return this; }

    protected ConditionValue _directTotal;
    public ConditionValue xdfgetDirectTotal()
    { if (_directTotal == null) { _directTotal = nCV(); }
      return _directTotal; }
    protected ConditionValue xgetCValueDirectTotal() { return xdfgetDirectTotal(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECT_TOTAL: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_DirectTotal_Asc() { regOBA("DIRECT_TOTAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_TOTAL: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_DirectTotal_Desc() { regOBD("DIRECT_TOTAL"); return this; }

    protected ConditionValue _totalPackNum;
    public ConditionValue xdfgetTotalPackNum()
    { if (_totalPackNum == null) { _totalPackNum = nCV(); }
      return _totalPackNum; }
    protected ConditionValue xgetCValueTotalPackNum() { return xdfgetTotalPackNum(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_TotalPackNum_Asc() { regOBA("TOTAL_PACK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_TotalPackNum_Desc() { regOBD("TOTAL_PACK_NUM"); return this; }

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
    public BsTBldl5120CQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTBldl5120CQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTBldl5120CQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTBldl5120CQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTBldl5120CQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTBldl5120CQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTBldl5120CQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTBldl5120CQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTBldl5120CQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTBldl5120CQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTBldl5120CQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTBldl5120CQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TBldl5120CQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TBldl5120CQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TBldl5120CQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TBldl5120CQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TBldl5120CQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TBldl5120CQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TBldl5120CQ> _myselfExistsMap;
    public Map<String, TBldl5120CQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TBldl5120CQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TBldl5120CQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TBldl5120CQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TBldl5120CB.class.getName(); }
    protected String xCQ() { return TBldl5120CQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}