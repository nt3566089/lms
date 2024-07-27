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
 * The base condition-query of t_invoice_tracking.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInvoiceTrackingCQ extends AbstractBsTInvoiceTrackingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInvoiceTrackingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInvoiceTrackingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_invoice_tracking) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInvoiceTrackingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInvoiceTrackingCIQ xcreateCIQ() {
        TInvoiceTrackingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInvoiceTrackingCIQ xnewCIQ() {
        return new TInvoiceTrackingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_invoice_tracking on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInvoiceTrackingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInvoiceTrackingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _invoiceTrackingId;
    public ConditionValue xdfgetInvoiceTrackingId()
    { if (_invoiceTrackingId == null) { _invoiceTrackingId = nCV(); }
      return _invoiceTrackingId; }
    protected ConditionValue xgetCValueInvoiceTrackingId() { return xdfgetInvoiceTrackingId(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_TRACKING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_InvoiceTrackingId_Asc() { regOBA("INVOICE_TRACKING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_TRACKING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_InvoiceTrackingId_Desc() { regOBD("INVOICE_TRACKING_ID"); return this; }

    protected ConditionValue _carrierSlipNo;
    public ConditionValue xdfgetCarrierSlipNo()
    { if (_carrierSlipNo == null) { _carrierSlipNo = nCV(); }
      return _carrierSlipNo; }
    protected ConditionValue xgetCValueCarrierSlipNo() { return xdfgetCarrierSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_CarrierSlipNo_Asc() { regOBA("CARRIER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_CarrierSlipNo_Desc() { regOBD("CARRIER_SLIP_NO"); return this; }

    protected ConditionValue _nizoroeNo;
    public ConditionValue xdfgetNizoroeNo()
    { if (_nizoroeNo == null) { _nizoroeNo = nCV(); }
      return _nizoroeNo; }
    protected ConditionValue xgetCValueNizoroeNo() { return xdfgetNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

    protected ConditionValue _shippingSlipNo;
    public ConditionValue xdfgetShippingSlipNo()
    { if (_shippingSlipNo == null) { _shippingSlipNo = nCV(); }
      return _shippingSlipNo; }
    protected ConditionValue xgetCValueShippingSlipNo() { return xdfgetShippingSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _packingNo;
    public ConditionValue xdfgetPackingNo()
    { if (_packingNo == null) { _packingNo = nCV(); }
      return _packingNo; }
    protected ConditionValue xgetCValuePackingNo() { return xdfgetPackingNo(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_PackingNo_Asc() { regOBA("PACKING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_PackingNo_Desc() { regOBD("PACKING_NO"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_CarrierNm_Asc() { regOBA("CARRIER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_CarrierNm_Desc() { regOBD("CARRIER_NM"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInvoiceTrackingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInvoiceTrackingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInvoiceTrackingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInvoiceTrackingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, TInvoiceTrackingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInvoiceTrackingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInvoiceTrackingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInvoiceTrackingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInvoiceTrackingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInvoiceTrackingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInvoiceTrackingCQ> _myselfExistsMap;
    public Map<String, TInvoiceTrackingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInvoiceTrackingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInvoiceTrackingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInvoiceTrackingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInvoiceTrackingCB.class.getName(); }
    protected String xCQ() { return TInvoiceTrackingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
