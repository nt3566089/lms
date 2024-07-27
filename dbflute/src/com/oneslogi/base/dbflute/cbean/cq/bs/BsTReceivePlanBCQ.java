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
 * The base condition-query of t_receive_plan_b.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanBCQ extends AbstractBsTReceivePlanBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_receive_plan_b) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReceivePlanBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReceivePlanBCIQ xcreateCIQ() {
        TReceivePlanBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReceivePlanBCIQ xnewCIQ() {
        return new TReceivePlanBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_receive_plan_b on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReceivePlanBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReceivePlanBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    public Map<String, TReceiveLabelCQ> xdfgetReceivePlanBId_ExistsReferrer_TReceiveLabelList() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TReceiveLabelList"); }
    public String keepReceivePlanBId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanDataTransferCQ> xdfgetReceivePlanBId_ExistsReferrer_TReceivePlanDataTransferList() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TReceivePlanDataTransferList"); }
    public String keepReceivePlanBId_ExistsReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TReceivePlanDataTransferList", sq); }

    public Map<String, TReceivePlanSpareCQ> xdfgetReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne"); }
    public String keepReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_ExistsReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_ExistsReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_ExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetReceivePlanBId_NotExistsReferrer_TReceiveLabelList() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TReceiveLabelList"); }
    public String keepReceivePlanBId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanDataTransferCQ> xdfgetReceivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList"); }
    public String keepReceivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList", sq); }

    public Map<String, TReceivePlanSpareCQ> xdfgetReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne"); }
    public String keepReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_NotExistsReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_NotExistsReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_NotExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetReceivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("receivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList"); }
    public String keepReceivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("receivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanDataTransferCQ> xdfgetReceivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList() { return xgetSQueMap("receivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList"); }
    public String keepReceivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq) { return xkeepSQue("receivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetReceivePlanBId_QueryDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("receivePlanBId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("receivePlanBId_QueryDerivedReferrer_TReceiveLabelList", sq); }
    public Map<String, Object> xdfgetReceivePlanBId_QueryDerivedReferrer_TReceiveLabelListParameter() { return xgetSQuePmMap("receivePlanBId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelListParameter(Object pm) { return xkeepSQuePm("receivePlanBId_QueryDerivedReferrer_TReceiveLabelList", pm); }

    public Map<String, TReceivePlanDataTransferCQ> xdfgetReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList() { return xgetSQueMap("receivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq) { return xkeepSQue("receivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList", sq); }
    public Map<String, Object> xdfgetReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferListParameter() { return xgetSQuePmMap("receivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferListParameter(Object pm) { return xkeepSQuePm("receivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList", pm); }

    public Map<String, TStoreRecordBCQ> xdfgetReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList", sq); }
    public Map<String, Object> xdfgetReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter() { return xgetSQuePmMap("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter(Object pm) { return xkeepSQuePm("receivePlanBId_QueryDerivedReferrer_TStoreRecordBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_InScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_InScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_InScopeRelation_TReceivePlanH", sq); }

    public Map<String, TReceivePlanHCQ> getReceivePlanHId_NotInScopeRelation_TReceivePlanH() { return xgetSQueMap("receivePlanHId_NotInScopeRelation_TReceivePlanH"); }
    public String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_NotInScopeRelation_TReceivePlanH", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _lineNo;
    public ConditionValue xdfgetLineNo()
    { if (_lineNo == null) { _lineNo = nCV(); }
      return _lineNo; }
    protected ConditionValue xgetCValueLineNo() { return xdfgetLineNo(); }

    /**
     * Add order-by as ascend. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _receiveStatus;
    public ConditionValue xdfgetReceiveStatus()
    { if (_receiveStatus == null) { _receiveStatus = nCV(); }
      return _receiveStatus; }
    protected ConditionValue xgetCValueReceiveStatus() { return xdfgetReceiveStatus(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceiveStatus_Asc() { regOBA("RECEIVE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ReceiveStatus_Desc() { regOBD("RECEIVE_STATUS"); return this; }

    protected ConditionValue _planClientOrderNo;
    public ConditionValue xdfgetPlanClientOrderNo()
    { if (_planClientOrderNo == null) { _planClientOrderNo = nCV(); }
      return _planClientOrderNo; }
    protected ConditionValue xgetCValuePlanClientOrderNo() { return xdfgetPlanClientOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanClientOrderNo_Asc() { regOBA("PLAN_CLIENT_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanClientOrderNo_Desc() { regOBD("PLAN_CLIENT_ORDER_NO"); return this; }

    protected ConditionValue _planWarehouseId;
    public ConditionValue xdfgetPlanWarehouseId()
    { if (_planWarehouseId == null) { _planWarehouseId = nCV(); }
      return _planWarehouseId; }
    protected ConditionValue xgetCValuePlanWarehouseId() { return xdfgetPlanWarehouseId(); }

    public Map<String, MWarehouseCQ> getPlanWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("planWarehouseId_InScopeRelation_MWarehouse"); }
    public String keepPlanWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("planWarehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getPlanWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("planWarehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepPlanWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("planWarehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseId_Asc() { regOBA("PLAN_WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseId_Desc() { regOBD("PLAN_WAREHOUSE_ID"); return this; }

    protected ConditionValue _planWarehouseCd;
    public ConditionValue xdfgetPlanWarehouseCd()
    { if (_planWarehouseCd == null) { _planWarehouseCd = nCV(); }
      return _planWarehouseCd; }
    protected ConditionValue xgetCValuePlanWarehouseCd() { return xdfgetPlanWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseCd_Asc() { regOBA("PLAN_WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanWarehouseCd_Desc() { regOBD("PLAN_WAREHOUSE_CD"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _planLot;
    public ConditionValue xdfgetPlanLot()
    { if (_planLot == null) { _planLot = nCV(); }
      return _planLot; }
    protected ConditionValue xgetCValuePlanLot() { return xdfgetPlanLot(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLot_Asc() { regOBA("PLAN_LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLot_Desc() { regOBD("PLAN_LOT"); return this; }

    protected ConditionValue _planLimitDt;
    public ConditionValue xdfgetPlanLimitDt()
    { if (_planLimitDt == null) { _planLimitDt = nCV(); }
      return _planLimitDt; }
    protected ConditionValue xgetCValuePlanLimitDt() { return xdfgetPlanLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLimitDt_Asc() { regOBA("PLAN_LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLimitDt_Desc() { regOBD("PLAN_LIMIT_DT"); return this; }

    protected ConditionValue _planLocationId;
    public ConditionValue xdfgetPlanLocationId()
    { if (_planLocationId == null) { _planLocationId = nCV(); }
      return _planLocationId; }
    protected ConditionValue xgetCValuePlanLocationId() { return xdfgetPlanLocationId(); }

    public Map<String, MLocationCQ> getPlanLocationId_InScopeRelation_MLocation() { return xgetSQueMap("planLocationId_InScopeRelation_MLocation"); }
    public String keepPlanLocationId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("planLocationId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getPlanLocationId_NotInScopeRelation_MLocation() { return xgetSQueMap("planLocationId_NotInScopeRelation_MLocation"); }
    public String keepPlanLocationId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("planLocationId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationId_Asc() { regOBA("PLAN_LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationId_Desc() { regOBD("PLAN_LOCATION_ID"); return this; }

    protected ConditionValue _planLocationCd;
    public ConditionValue xdfgetPlanLocationCd()
    { if (_planLocationCd == null) { _planLocationCd = nCV(); }
      return _planLocationCd; }
    protected ConditionValue xgetCValuePlanLocationCd() { return xdfgetPlanLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationCd_Asc() { regOBA("PLAN_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanLocationCd_Desc() { regOBD("PLAN_LOCATION_CD"); return this; }

    protected ConditionValue _planStoreLabelNo;
    public ConditionValue xdfgetPlanStoreLabelNo()
    { if (_planStoreLabelNo == null) { _planStoreLabelNo = nCV(); }
      return _planStoreLabelNo; }
    protected ConditionValue xgetCValuePlanStoreLabelNo() { return xdfgetPlanStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanStoreLabelNo_Asc() { regOBA("PLAN_STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanStoreLabelNo_Desc() { regOBD("PLAN_STORE_LABEL_NO"); return this; }

    protected ConditionValue _planNum;
    public ConditionValue xdfgetPlanNum()
    { if (_planNum == null) { _planNum = nCV(); }
      return _planNum; }
    protected ConditionValue xgetCValuePlanNum() { return xdfgetPlanNum(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanNum_Asc() { regOBA("PLAN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanNum_Desc() { regOBD("PLAN_NUM"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _storeRowNo;
    public ConditionValue xdfgetStoreRowNo()
    { if (_storeRowNo == null) { _storeRowNo = nCV(); }
      return _storeRowNo; }
    protected ConditionValue xgetCValueStoreRowNo() { return xdfgetStoreRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_StoreRowNo_Asc() { regOBA("STORE_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_StoreRowNo_Desc() { regOBD("STORE_ROW_NO"); return this; }

    protected ConditionValue _planProdDt;
    public ConditionValue xdfgetPlanProdDt()
    { if (_planProdDt == null) { _planProdDt = nCV(); }
      return _planProdDt; }
    protected ConditionValue xgetCValuePlanProdDt() { return xdfgetPlanProdDt(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanProdDt_Asc() { regOBA("PLAN_PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_PlanProdDt_Desc() { regOBD("PLAN_PROD_DT"); return this; }

    protected ConditionValue _hinmokuGroup;
    public ConditionValue xdfgetHinmokuGroup()
    { if (_hinmokuGroup == null) { _hinmokuGroup = nCV(); }
      return _hinmokuGroup; }
    protected ConditionValue xgetCValueHinmokuGroup() { return xdfgetHinmokuGroup(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

    protected ConditionValue _hinmokuText;
    public ConditionValue xdfgetHinmokuText()
    { if (_hinmokuText == null) { _hinmokuText = nCV(); }
      return _hinmokuText; }
    protected ConditionValue xgetCValueHinmokuText() { return xdfgetHinmokuText(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _remainingReceiveNum;
    public ConditionValue xdfgetRemainingReceiveNum()
    { if (_remainingReceiveNum == null) { _remainingReceiveNum = nCV(); }
      return _remainingReceiveNum; }
    protected ConditionValue xgetCValueRemainingReceiveNum() { return xdfgetRemainingReceiveNum(); }

    /**
     * Add order-by as ascend. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_RemainingReceiveNum_Asc() { regOBA("REMAINING_RECEIVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_RemainingReceiveNum_Desc() { regOBD("REMAINING_RECEIVE_NUM"); return this; }

    protected ConditionValue _lotManagTypeId;
    public ConditionValue xdfgetLotManagTypeId()
    { if (_lotManagTypeId == null) { _lotManagTypeId = nCV(); }
      return _lotManagTypeId; }
    protected ConditionValue xgetCValueLotManagTypeId() { return xdfgetLotManagTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LotManagTypeId_Asc() { regOBA("LOT_MANAG_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LotManagTypeId_Desc() { regOBD("LOT_MANAG_TYPE_ID"); return this; }

    protected ConditionValue _lotManagTypeCd;
    public ConditionValue xdfgetLotManagTypeCd()
    { if (_lotManagTypeCd == null) { _lotManagTypeCd = nCV(); }
      return _lotManagTypeCd; }
    protected ConditionValue xgetCValueLotManagTypeCd() { return xdfgetLotManagTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LotManagTypeCd_Asc() { regOBA("LOT_MANAG_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LotManagTypeCd_Desc() { regOBD("LOT_MANAG_TYPE_CD"); return this; }

    protected ConditionValue _shippingPlantCd;
    public ConditionValue xdfgetShippingPlantCd()
    { if (_shippingPlantCd == null) { _shippingPlantCd = nCV(); }
      return _shippingPlantCd; }
    protected ConditionValue xgetCValueShippingPlantCd() { return xdfgetShippingPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

    protected ConditionValue _shippingStorageSpaceCd;
    public ConditionValue xdfgetShippingStorageSpaceCd()
    { if (_shippingStorageSpaceCd == null) { _shippingStorageSpaceCd = nCV(); }
      return _shippingStorageSpaceCd; }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return xdfgetShippingStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _remainFlg;
    public ConditionValue xdfgetRemainFlg()
    { if (_remainFlg == null) { _remainFlg = nCV(); }
      return _remainFlg; }
    protected ConditionValue xgetCValueRemainFlg() { return xdfgetRemainFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_RemainFlg_Asc() { regOBA("REMAIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_RemainFlg_Desc() { regOBD("REMAIN_FLG"); return this; }

    protected ConditionValue _wmSendFlg;
    public ConditionValue xdfgetWmSendFlg()
    { if (_wmSendFlg == null) { _wmSendFlg = nCV(); }
      return _wmSendFlg; }
    protected ConditionValue xgetCValueWmSendFlg() { return xdfgetWmSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_WmSendFlg_Asc() { regOBA("WM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_WmSendFlg_Desc() { regOBD("WM_SEND_FLG"); return this; }

    protected ConditionValue _lpSendFlg;
    public ConditionValue xdfgetLpSendFlg()
    { if (_lpSendFlg == null) { _lpSendFlg = nCV(); }
      return _lpSendFlg; }
    protected ConditionValue xgetCValueLpSendFlg() { return xdfgetLpSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTReceivePlanBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTReceivePlanBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReceivePlanBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReceivePlanBCQ bq = (TReceivePlanBCQ)bqs;
        TReceivePlanBCQ uq = (TReceivePlanBCQ)uqs;
        if (bq.hasConditionQueryTReceivePlanH()) {
            uq.queryTReceivePlanH().reflectRelationOnUnionQuery(bq.queryTReceivePlanH(), uq.queryTReceivePlanH());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveStatus()) {
            uq.queryBClassDtlByReceiveStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveStatus(), uq.queryBClassDtlByReceiveStatus());
        }
        if (bq.hasConditionQueryTReceivePlanSpareAsOne()) {
            uq.queryTReceivePlanSpareAsOne().reflectRelationOnUnionQuery(bq.queryTReceivePlanSpareAsOne(), uq.queryTReceivePlanSpareAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanHCQ queryTReceivePlanH() {
        return xdfgetConditionQueryTReceivePlanH();
    }
    public TReceivePlanHCQ xdfgetConditionQueryTReceivePlanH() {
        String prop = "tReceivePlanH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanH()); xsetupOuterJoinTReceivePlanH(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanHCQ xcreateQueryTReceivePlanH() {
        String nrp = xresolveNRP("t_receive_plan_b", "tReceivePlanH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanH", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanH() { xregOutJo("tReceivePlanH"); }
    public boolean hasConditionQueryTReceivePlanH() { return xhasQueRlMap("tReceivePlanH"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_location by my PLAN_LOCATION_ID, named 'MLocation'.
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
        String nrp = xresolveNRP("t_receive_plan_b", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MWarehouseCQ queryMWarehouse() {
        return xdfgetConditionQueryMWarehouse();
    }
    public MWarehouseCQ xdfgetConditionQueryMWarehouse() {
        String prop = "mWarehouse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMWarehouse()); xsetupOuterJoinMWarehouse(); }
        return xgetQueRlMap(prop);
    }
    protected MWarehouseCQ xcreateQueryMWarehouse() {
        String nrp = xresolveNRP("t_receive_plan_b", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
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
        String nrp = xresolveNRP("t_receive_plan_b", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorFlg() {
        return xdfgetConditionQueryBClassDtlByErrorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorFlg() {
        String prop = "bClassDtlByErrorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorFlg()); xsetupOuterJoinBClassDtlByErrorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorFlg() {
        String nrp = xresolveNRP("t_receive_plan_b", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveStatus() {
        return xdfgetConditionQueryBClassDtlByReceiveStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveStatus() {
        String prop = "bClassDtlByReceiveStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveStatus()); xsetupOuterJoinBClassDtlByReceiveStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveStatus() {
        String nrp = xresolveNRP("t_receive_plan_b", "bClassDtlByReceiveStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveStatus() { xregOutJo("bClassDtlByReceiveStatus"); }
    public boolean hasConditionQueryBClassDtlByReceiveStatus() { return xhasQueRlMap("bClassDtlByReceiveStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanSpareCQ queryTReceivePlanSpareAsOne() { return xdfgetConditionQueryTReceivePlanSpareAsOne(); }
    public TReceivePlanSpareCQ xdfgetConditionQueryTReceivePlanSpareAsOne() {
        String prop = "tReceivePlanSpareAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanSpareAsOne()); xsetupOuterJoinTReceivePlanSpareAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanSpareCQ xcreateQueryTReceivePlanSpareAsOne() {
        String nrp = xresolveNRP("t_receive_plan_b", "tReceivePlanSpareAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanSpareCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanSpareAsOne", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanSpareAsOne() { xregOutJo("tReceivePlanSpareAsOne"); }
    public boolean hasConditionQueryTReceivePlanSpareAsOne() { return xhasQueRlMap("tReceivePlanSpareAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReceivePlanBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReceivePlanBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReceivePlanBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReceivePlanBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReceivePlanBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReceivePlanBCQ> _myselfExistsMap;
    public Map<String, TReceivePlanBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReceivePlanBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReceivePlanBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReceivePlanBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReceivePlanBCB.class.getName(); }
    protected String xCQ() { return TReceivePlanBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
