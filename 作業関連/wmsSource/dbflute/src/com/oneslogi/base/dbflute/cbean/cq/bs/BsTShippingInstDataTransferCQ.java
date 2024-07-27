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
 * The base condition-query of t_shipping_inst_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstDataTransferCQ extends AbstractBsTShippingInstDataTransferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstDataTransferCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstDataTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_inst_data_transfer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstDataTransferCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstDataTransferCIQ xcreateCIQ() {
        TShippingInstDataTransferCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstDataTransferCIQ xnewCIQ() {
        return new TShippingInstDataTransferCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_inst_data_transfer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstDataTransferCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstDataTransferCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstDataTransferId;
    public ConditionValue xdfgetShippingInstDataTransferId()
    { if (_shippingInstDataTransferId == null) { _shippingInstDataTransferId = nCV(); }
      return _shippingInstDataTransferId; }
    protected ConditionValue xgetCValueShippingInstDataTransferId() { return xdfgetShippingInstDataTransferId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_ShippingInstDataTransferId_Asc() { regOBA("SHIPPING_INST_DATA_TRANSFER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_ShippingInstDataTransferId_Desc() { regOBD("SHIPPING_INST_DATA_TRANSFER_ID"); return this; }

    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_InScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_InScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_InScopeRelation_TShippingInstB", sq); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_NotInScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_NotInScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_NotInScopeRelation_TShippingInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _dataTransferOnlyStr01;
    public ConditionValue xdfgetDataTransferOnlyStr01()
    { if (_dataTransferOnlyStr01 == null) { _dataTransferOnlyStr01 = nCV(); }
      return _dataTransferOnlyStr01; }
    protected ConditionValue xgetCValueDataTransferOnlyStr01() { return xdfgetDataTransferOnlyStr01(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

    protected ConditionValue _dataTransferOnlyStr02;
    public ConditionValue xdfgetDataTransferOnlyStr02()
    { if (_dataTransferOnlyStr02 == null) { _dataTransferOnlyStr02 = nCV(); }
      return _dataTransferOnlyStr02; }
    protected ConditionValue xgetCValueDataTransferOnlyStr02() { return xdfgetDataTransferOnlyStr02(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr02_Asc() { regOBA("DATA_TRANSFER_ONLY_STR02"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr02_Desc() { regOBD("DATA_TRANSFER_ONLY_STR02"); return this; }

    protected ConditionValue _dataTransferOnlyStr03;
    public ConditionValue xdfgetDataTransferOnlyStr03()
    { if (_dataTransferOnlyStr03 == null) { _dataTransferOnlyStr03 = nCV(); }
      return _dataTransferOnlyStr03; }
    protected ConditionValue xgetCValueDataTransferOnlyStr03() { return xdfgetDataTransferOnlyStr03(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr03_Asc() { regOBA("DATA_TRANSFER_ONLY_STR03"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DataTransferOnlyStr03_Desc() { regOBD("DATA_TRANSFER_ONLY_STR03"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstDataTransferCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstDataTransferCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstDataTransferCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstDataTransferCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstDataTransferCQ bq = (TShippingInstDataTransferCQ)bqs;
        TShippingInstDataTransferCQ uq = (TShippingInstDataTransferCQ)uqs;
        if (bq.hasConditionQueryTShippingInstB()) {
            uq.queryTShippingInstB().reflectRelationOnUnionQuery(bq.queryTShippingInstB(), uq.queryTShippingInstB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstBCQ queryTShippingInstB() {
        return xdfgetConditionQueryTShippingInstB();
    }
    public TShippingInstBCQ xdfgetConditionQueryTShippingInstB() {
        String prop = "tShippingInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstB()); xsetupOuterJoinTShippingInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstBCQ xcreateQueryTShippingInstB() {
        String nrp = xresolveNRP("t_shipping_inst_data_transfer", "tShippingInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstB", nrp);
    }
    protected void xsetupOuterJoinTShippingInstB() { xregOutJo("tShippingInstB"); }
    public boolean hasConditionQueryTShippingInstB() { return xhasQueRlMap("tShippingInstB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstDataTransferCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstDataTransferCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstDataTransferCB.class.getName(); }
    protected String xCQ() { return TShippingInstDataTransferCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
