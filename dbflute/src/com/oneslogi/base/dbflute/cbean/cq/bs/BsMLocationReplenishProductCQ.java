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
 * The base condition-query of m_location_replenish_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsMLocationReplenishProductCQ extends AbstractBsMLocationReplenishProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MLocationReplenishProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMLocationReplenishProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_location_replenish_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MLocationReplenishProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MLocationReplenishProductCIQ xcreateCIQ() {
        MLocationReplenishProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MLocationReplenishProductCIQ xnewCIQ() {
        return new MLocationReplenishProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_location_replenish_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MLocationReplenishProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MLocationReplenishProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _locationReplenishProductId;
    public ConditionValue xdfgetLocationReplenishProductId()
    { if (_locationReplenishProductId == null) { _locationReplenishProductId = nCV(); }
      return _locationReplenishProductId; }
    protected ConditionValue xgetCValueLocationReplenishProductId() { return xdfgetLocationReplenishProductId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_LocationReplenishProductId_Asc() { regOBA("LOCATION_REPLENISH_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_LocationReplenishProductId_Desc() { regOBD("LOCATION_REPLENISH_PRODUCT_ID"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    public Map<String, MLocationCQ> getLocationId_InScopeRelation_MLocation() { return xgetSQueMap("locationId_InScopeRelation_MLocation"); }
    public String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("locationId_NotInScopeRelation_MLocation"); }
    public String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("locationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _replenishProductId;
    public ConditionValue xdfgetReplenishProductId()
    { if (_replenishProductId == null) { _replenishProductId = nCV(); }
      return _replenishProductId; }
    protected ConditionValue xgetCValueReplenishProductId() { return xdfgetReplenishProductId(); }

    public Map<String, MProductCQ> getReplenishProductId_InScopeRelation_MProduct() { return xgetSQueMap("replenishProductId_InScopeRelation_MProduct"); }
    public String keepReplenishProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("replenishProductId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getReplenishProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("replenishProductId_NotInScopeRelation_MProduct"); }
    public String keepReplenishProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("replenishProductId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishProductId_Asc() { regOBA("REPLENISH_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishProductId_Desc() { regOBD("REPLENISH_PRODUCT_ID"); return this; }

    protected ConditionValue _replenishDepositId;
    public ConditionValue xdfgetReplenishDepositId()
    { if (_replenishDepositId == null) { _replenishDepositId = nCV(); }
      return _replenishDepositId; }
    protected ConditionValue xgetCValueReplenishDepositId() { return xdfgetReplenishDepositId(); }

    public Map<String, MCustomerCQ> getReplenishDepositId_InScopeRelation_MCustomer() { return xgetSQueMap("replenishDepositId_InScopeRelation_MCustomer"); }
    public String keepReplenishDepositId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("replenishDepositId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getReplenishDepositId_NotInScopeRelation_MCustomer() { return xgetSQueMap("replenishDepositId_NotInScopeRelation_MCustomer"); }
    public String keepReplenishDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("replenishDepositId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishDepositId_Asc() { regOBA("REPLENISH_DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishDepositId_Desc() { regOBD("REPLENISH_DEPOSIT_ID"); return this; }

    protected ConditionValue _replenishPNum;
    public ConditionValue xdfgetReplenishPNum()
    { if (_replenishPNum == null) { _replenishPNum = nCV(); }
      return _replenishPNum; }
    protected ConditionValue xgetCValueReplenishPNum() { return xdfgetReplenishPNum(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishPNum_Asc() { regOBA("REPLENISH_P_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishPNum_Desc() { regOBD("REPLENISH_P_NUM"); return this; }

    protected ConditionValue _maxStoreProductShapeId;
    public ConditionValue xdfgetMaxStoreProductShapeId()
    { if (_maxStoreProductShapeId == null) { _maxStoreProductShapeId = nCV(); }
      return _maxStoreProductShapeId; }
    protected ConditionValue xgetCValueMaxStoreProductShapeId() { return xdfgetMaxStoreProductShapeId(); }

    public Map<String, MProductShapeCQ> getMaxStoreProductShapeId_InScopeRelation_MProductShape() { return xgetSQueMap("maxStoreProductShapeId_InScopeRelation_MProductShape"); }
    public String keepMaxStoreProductShapeId_InScopeRelation_MProductShape(MProductShapeCQ sq) { return xkeepSQue("maxStoreProductShapeId_InScopeRelation_MProductShape", sq); }

    public Map<String, MProductShapeCQ> getMaxStoreProductShapeId_NotInScopeRelation_MProductShape() { return xgetSQueMap("maxStoreProductShapeId_NotInScopeRelation_MProductShape"); }
    public String keepMaxStoreProductShapeId_NotInScopeRelation_MProductShape(MProductShapeCQ sq) { return xkeepSQue("maxStoreProductShapeId_NotInScopeRelation_MProductShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_MaxStoreProductShapeId_Asc() { regOBA("MAX_STORE_PRODUCT_SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_MaxStoreProductShapeId_Desc() { regOBD("MAX_STORE_PRODUCT_SHAPE_ID"); return this; }

    protected ConditionValue _maxStoreNum;
    public ConditionValue xdfgetMaxStoreNum()
    { if (_maxStoreNum == null) { _maxStoreNum = nCV(); }
      return _maxStoreNum; }
    protected ConditionValue xgetCValueMaxStoreNum() { return xdfgetMaxStoreNum(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_MaxStoreNum_Asc() { regOBA("MAX_STORE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_MaxStoreNum_Desc() { regOBD("MAX_STORE_NUM"); return this; }

    protected ConditionValue _replenishStockTypeId;
    public ConditionValue xdfgetReplenishStockTypeId()
    { if (_replenishStockTypeId == null) { _replenishStockTypeId = nCV(); }
      return _replenishStockTypeId; }
    protected ConditionValue xgetCValueReplenishStockTypeId() { return xdfgetReplenishStockTypeId(); }

    public Map<String, MStockTypeCQ> getReplenishStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("replenishStockTypeId_InScopeRelation_MStockType"); }
    public String keepReplenishStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("replenishStockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getReplenishStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("replenishStockTypeId_NotInScopeRelation_MStockType"); }
    public String keepReplenishStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("replenishStockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishStockTypeId_Asc() { regOBA("REPLENISH_STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishStockTypeId_Desc() { regOBD("REPLENISH_STOCK_TYPE_ID"); return this; }

    protected ConditionValue _replenishPProductShapeId;
    public ConditionValue xdfgetReplenishPProductShapeId()
    { if (_replenishPProductShapeId == null) { _replenishPProductShapeId = nCV(); }
      return _replenishPProductShapeId; }
    protected ConditionValue xgetCValueReplenishPProductShapeId() { return xdfgetReplenishPProductShapeId(); }

    public Map<String, MShapeCQ> getReplenishPProductShapeId_InScopeRelation_MShape() { return xgetSQueMap("replenishPProductShapeId_InScopeRelation_MShape"); }
    public String keepReplenishPProductShapeId_InScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("replenishPProductShapeId_InScopeRelation_MShape", sq); }

    public Map<String, MShapeCQ> getReplenishPProductShapeId_NotInScopeRelation_MShape() { return xgetSQueMap("replenishPProductShapeId_NotInScopeRelation_MShape"); }
    public String keepReplenishPProductShapeId_NotInScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("replenishPProductShapeId_NotInScopeRelation_MShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishPProductShapeId_Asc() { regOBA("REPLENISH_P_PRODUCT_SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ReplenishPProductShapeId_Desc() { regOBD("REPLENISH_P_PRODUCT_SHAPE_ID"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMLocationReplenishProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMLocationReplenishProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMLocationReplenishProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMLocationReplenishProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MLocationReplenishProductCQ bq = (MLocationReplenishProductCQ)bqs;
        MLocationReplenishProductCQ uq = (MLocationReplenishProductCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMProductShape()) {
            uq.queryMProductShape().reflectRelationOnUnionQuery(bq.queryMProductShape(), uq.queryMProductShape());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("m_location_replenish_product", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductShapeCQ queryMProductShape() {
        return xdfgetConditionQueryMProductShape();
    }
    public MProductShapeCQ xdfgetConditionQueryMProductShape() {
        String prop = "mProductShape";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductShape()); xsetupOuterJoinMProductShape(); }
        return xgetQueRlMap(prop);
    }
    protected MProductShapeCQ xcreateQueryMProductShape() {
        String nrp = xresolveNRP("m_location_replenish_product", "mProductShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductShape", nrp);
    }
    protected void xsetupOuterJoinMProductShape() { xregOutJo("mProductShape"); }
    public boolean hasConditionQueryMProductShape() { return xhasQueRlMap("mProductShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeCQ queryMShape() {
        return xdfgetConditionQueryMShape();
    }
    public MShapeCQ xdfgetConditionQueryMShape() {
        String prop = "mShape";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShape()); xsetupOuterJoinMShape(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeCQ xcreateQueryMShape() {
        String nrp = xresolveNRP("m_location_replenish_product", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("m_location_replenish_product", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The instance of condition-query. (NotNull)
     */
    public MLocationCQ queryMLocation() {
        return xdfgetConditionQueryMLocation();
    }
    public MLocationCQ xdfgetConditionQueryMLocation() {
        String prop = "mLocation";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMLocation()); xsetupOuterJoinMLocation(); }
        return xgetQueRlMap(prop);
    }
    protected MLocationCQ xcreateQueryMLocation() {
        String nrp = xresolveNRP("m_location_replenish_product", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("m_location_replenish_product", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MLocationReplenishProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MLocationReplenishProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MLocationReplenishProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MLocationReplenishProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MLocationReplenishProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MLocationReplenishProductCQ> _myselfExistsMap;
    public Map<String, MLocationReplenishProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MLocationReplenishProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MLocationReplenishProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MLocationReplenishProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MLocationReplenishProductCB.class.getName(); }
    protected String xCQ() { return MLocationReplenishProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
