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
 * The base condition-query of t_picking_record_stock.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingRecordStockCQ extends AbstractBsTPickingRecordStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingRecordStockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingRecordStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_picking_record_stock) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPickingRecordStockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPickingRecordStockCIQ xcreateCIQ() {
        TPickingRecordStockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPickingRecordStockCIQ xnewCIQ() {
        return new TPickingRecordStockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_picking_record_stock on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPickingRecordStockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPickingRecordStockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingRecordStockId;
    public ConditionValue xdfgetPickingRecordStockId()
    { if (_pickingRecordStockId == null) { _pickingRecordStockId = nCV(); }
      return _pickingRecordStockId; }
    protected ConditionValue xgetCValuePickingRecordStockId() { return xdfgetPickingRecordStockId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingRecordStockId_Asc() { regOBA("PICKING_RECORD_STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_RECORD_STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingRecordStockId_Desc() { regOBD("PICKING_RECORD_STOCK_ID"); return this; }

    protected ConditionValue _pickingBId;
    public ConditionValue xdfgetPickingBId()
    { if (_pickingBId == null) { _pickingBId = nCV(); }
      return _pickingBId; }
    protected ConditionValue xgetCValuePickingBId() { return xdfgetPickingBId(); }

    public Map<String, TPickingBCQ> getPickingBId_InScopeRelation_TPickingB() { return xgetSQueMap("pickingBId_InScopeRelation_TPickingB"); }
    public String keepPickingBId_InScopeRelation_TPickingB(TPickingBCQ sq) { return xkeepSQue("pickingBId_InScopeRelation_TPickingB", sq); }

    public Map<String, TPickingBCQ> getPickingBId_NotInScopeRelation_TPickingB() { return xgetSQueMap("pickingBId_NotInScopeRelation_TPickingB"); }
    public String keepPickingBId_NotInScopeRelation_TPickingB(TPickingBCQ sq) { return xkeepSQue("pickingBId_NotInScopeRelation_TPickingB", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingBId_Asc() { regOBA("PICKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingBId_Desc() { regOBD("PICKING_B_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _pickingNum;
    public ConditionValue xdfgetPickingNum()
    { if (_pickingNum == null) { _pickingNum = nCV(); }
      return _pickingNum; }
    protected ConditionValue xgetCValuePickingNum() { return xdfgetPickingNum(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingNum_Asc() { regOBA("PICKING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_PickingNum_Desc() { regOBD("PICKING_NUM"); return this; }

    protected ConditionValue _在庫調整済フラグ;
    public ConditionValue xdfget在庫調整済フラグ()
    { if (_在庫調整済フラグ == null) { _在庫調整済フラグ = nCV(); }
      return _在庫調整済フラグ; }
    protected ConditionValue xgetCValue在庫調整済フラグ() { return xdfget在庫調整済フラグ(); }

    /**
     * Add order-by as ascend. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_在庫調整済フラグ_Asc() { regOBA("在庫調整済フラグ"); return this; }

    /**
     * Add order-by as descend. <br>
     * 在庫調整済フラグ: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_在庫調整済フラグ_Desc() { regOBD("在庫調整済フラグ"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPickingRecordStockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTPickingRecordStockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPickingRecordStockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPickingRecordStockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPickingRecordStockCQ bq = (TPickingRecordStockCQ)bqs;
        TPickingRecordStockCQ uq = (TPickingRecordStockCQ)uqs;
        if (bq.hasConditionQueryTPickingB()) {
            uq.queryTPickingB().reflectRelationOnUnionQuery(bq.queryTPickingB(), uq.queryTPickingB());
        }
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingBCQ queryTPickingB() {
        return xdfgetConditionQueryTPickingB();
    }
    public TPickingBCQ xdfgetConditionQueryTPickingB() {
        String prop = "tPickingB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingB()); xsetupOuterJoinTPickingB(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingBCQ xcreateQueryTPickingB() {
        String nrp = xresolveNRP("t_picking_record_stock", "tPickingB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingB", nrp);
    }
    protected void xsetupOuterJoinTPickingB() { xregOutJo("tPickingB"); }
    public boolean hasConditionQueryTPickingB() { return xhasQueRlMap("tPickingB"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("t_picking_record_stock", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPickingRecordStockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPickingRecordStockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPickingRecordStockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPickingRecordStockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPickingRecordStockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPickingRecordStockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPickingRecordStockCQ> _myselfExistsMap;
    public Map<String, TPickingRecordStockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPickingRecordStockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPickingRecordStockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPickingRecordStockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPickingRecordStockCB.class.getName(); }
    protected String xCQ() { return TPickingRecordStockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
