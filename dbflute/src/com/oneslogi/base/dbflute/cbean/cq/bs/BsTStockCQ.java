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
 * The base condition-query of t_stock.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStockCQ extends AbstractBsTStockCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStockCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStockCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_stock) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TStockCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TStockCIQ xcreateCIQ() {
        TStockCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TStockCIQ xnewCIQ() {
        return new TStockCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_stock on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TStockCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TStockCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TInventoryBCQ> xdfgetStockId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("stockId_ExistsReferrer_TInventoryBList"); }
    public String keepStockId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TPickingBCQ> xdfgetStockId_ExistsReferrer_TPickingBList() { return xgetSQueMap("stockId_ExistsReferrer_TPickingBList"); }
    public String keepStockId_ExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TPickingBList", sq); }

    public Map<String, TPickingRecordStockCQ> xdfgetStockId_ExistsReferrer_TPickingRecordStockList() { return xgetSQueMap("stockId_ExistsReferrer_TPickingRecordStockList"); }
    public String keepStockId_ExistsReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TPickingRecordStockList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetStockId_ExistsReferrer_TReceiveLabelList() { return xgetSQueMap("stockId_ExistsReferrer_TReceiveLabelList"); }
    public String keepStockId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TScmLabelCQ> xdfgetStockId_ExistsReferrer_TScmLabelList() { return xgetSQueMap("stockId_ExistsReferrer_TScmLabelList"); }
    public String keepStockId_ExistsReferrer_TScmLabelList(TScmLabelCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TScmLabelList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockId_ExistsReferrer_TStockInoutList() { return xgetSQueMap("stockId_ExistsReferrer_TStockInoutList"); }
    public String keepStockId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockReportCQ> xdfgetStockId_ExistsReferrer_TStockReportAsOne() { return xgetSQueMap("stockId_ExistsReferrer_TStockReportAsOne"); }
    public String keepStockId_ExistsReferrer_TStockReportAsOne(TStockReportCQ sq) { return xkeepSQue("stockId_ExistsReferrer_TStockReportAsOne", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("stockId_NotExistsReferrer_TInventoryBList"); }
    public String keepStockId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TPickingBCQ> xdfgetStockId_NotExistsReferrer_TPickingBList() { return xgetSQueMap("stockId_NotExistsReferrer_TPickingBList"); }
    public String keepStockId_NotExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TPickingBList", sq); }

    public Map<String, TPickingRecordStockCQ> xdfgetStockId_NotExistsReferrer_TPickingRecordStockList() { return xgetSQueMap("stockId_NotExistsReferrer_TPickingRecordStockList"); }
    public String keepStockId_NotExistsReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TPickingRecordStockList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetStockId_NotExistsReferrer_TReceiveLabelList() { return xgetSQueMap("stockId_NotExistsReferrer_TReceiveLabelList"); }
    public String keepStockId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TScmLabelCQ> xdfgetStockId_NotExistsReferrer_TScmLabelList() { return xgetSQueMap("stockId_NotExistsReferrer_TScmLabelList"); }
    public String keepStockId_NotExistsReferrer_TScmLabelList(TScmLabelCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TScmLabelList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockId_NotExistsReferrer_TStockInoutList() { return xgetSQueMap("stockId_NotExistsReferrer_TStockInoutList"); }
    public String keepStockId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TStockInoutList", sq); }

    public Map<String, TStockReportCQ> xdfgetStockId_NotExistsReferrer_TStockReportAsOne() { return xgetSQueMap("stockId_NotExistsReferrer_TStockReportAsOne"); }
    public String keepStockId_NotExistsReferrer_TStockReportAsOne(TStockReportCQ sq) { return xkeepSQue("stockId_NotExistsReferrer_TStockReportAsOne", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepStockId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TPickingBCQ> xdfgetStockId_SpecifyDerivedReferrer_TPickingBList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TPickingBList"); }
    public String keepStockId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TPickingBList", sq); }

    public Map<String, TPickingRecordStockCQ> xdfgetStockId_SpecifyDerivedReferrer_TPickingRecordStockList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TPickingRecordStockList"); }
    public String keepStockId_SpecifyDerivedReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TPickingRecordStockList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetStockId_SpecifyDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TReceiveLabelList"); }
    public String keepStockId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TReceiveLabelList", sq); }

    public Map<String, TScmLabelCQ> xdfgetStockId_SpecifyDerivedReferrer_TScmLabelList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TScmLabelList"); }
    public String keepStockId_SpecifyDerivedReferrer_TScmLabelList(TScmLabelCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TScmLabelList", sq); }

    public Map<String, TStockInoutCQ> xdfgetStockId_SpecifyDerivedReferrer_TStockInoutList() { return xgetSQueMap("stockId_SpecifyDerivedReferrer_TStockInoutList"); }
    public String keepStockId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("stockId_SpecifyDerivedReferrer_TStockInoutList", sq); }

    public Map<String, TInventoryBCQ> xdfgetStockId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStockId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepStockId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TPickingBCQ> xdfgetStockId_QueryDerivedReferrer_TPickingBList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TPickingBList"); }
    public String keepStockId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TPickingBList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TPickingBListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TPickingBList"); }
    public String keepStockId_QueryDerivedReferrer_TPickingBListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TPickingBList", pm); }

    public Map<String, TPickingRecordStockCQ> xdfgetStockId_QueryDerivedReferrer_TPickingRecordStockList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TPickingRecordStockList"); }
    public String keepStockId_QueryDerivedReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TPickingRecordStockList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TPickingRecordStockListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TPickingRecordStockList"); }
    public String keepStockId_QueryDerivedReferrer_TPickingRecordStockListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TPickingRecordStockList", pm); }

    public Map<String, TReceiveLabelCQ> xdfgetStockId_QueryDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepStockId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TReceiveLabelList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TReceiveLabelListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepStockId_QueryDerivedReferrer_TReceiveLabelListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TReceiveLabelList", pm); }

    public Map<String, TScmLabelCQ> xdfgetStockId_QueryDerivedReferrer_TScmLabelList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TScmLabelList"); }
    public String keepStockId_QueryDerivedReferrer_TScmLabelList(TScmLabelCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TScmLabelList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TScmLabelListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TScmLabelList"); }
    public String keepStockId_QueryDerivedReferrer_TScmLabelListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TScmLabelList", pm); }

    public Map<String, TStockInoutCQ> xdfgetStockId_QueryDerivedReferrer_TStockInoutList() { return xgetSQueMap("stockId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepStockId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq) { return xkeepSQue("stockId_QueryDerivedReferrer_TStockInoutList", sq); }
    public Map<String, Object> xdfgetStockId_QueryDerivedReferrer_TStockInoutListParameter() { return xgetSQuePmMap("stockId_QueryDerivedReferrer_TStockInoutList"); }
    public String keepStockId_QueryDerivedReferrer_TStockInoutListParameter(Object pm) { return xkeepSQuePm("stockId_QueryDerivedReferrer_TStockInoutList", pm); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    public Map<String, MWarehouseCQ> getWarehouseId_InScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_InScopeRelation_MWarehouse"); }
    public String keepWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_InScopeRelation_MWarehouse", sq); }

    public Map<String, MWarehouseCQ> getWarehouseId_NotInScopeRelation_MWarehouse() { return xgetSQueMap("warehouseId_NotInScopeRelation_MWarehouse"); }
    public String keepWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq) { return xkeepSQue("warehouseId_NotInScopeRelation_MWarehouse", sq); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, NotNull, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
     * PRODUCT_ID: {IX+, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX+, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX+, NotNull, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

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
     * LOCATION_ID: {+UQ, IX+, NotNull, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {+UQ, IX+, NotNull, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    public Map<String, MCustomerCQ> getDepositId_InScopeRelation_MCustomer() { return xgetSQueMap("depositId_InScopeRelation_MCustomer"); }
    public String keepDepositId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getDepositId_NotInScopeRelation_MCustomer() { return xgetSQueMap("depositId_NotInScopeRelation_MCustomer"); }
    public String keepDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("depositId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX+, NotNull, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX+, NotNull, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    public Map<String, TLotCQ> getLotId_InScopeRelation_TLot() { return xgetSQueMap("lotId_InScopeRelation_TLot"); }
    public String keepLotId_InScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_InScopeRelation_TLot", sq); }

    public Map<String, TLotCQ> getLotId_NotInScopeRelation_TLot() { return xgetSQueMap("lotId_NotInScopeRelation_TLot"); }
    public String keepLotId_NotInScopeRelation_TLot(TLotCQ sq) { return xkeepSQue("lotId_NotInScopeRelation_TLot", sq); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX+, NotNull, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX+, NotNull, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    public Map<String, MShapeCQ> getShapeId_InScopeRelation_MShape() { return xgetSQueMap("shapeId_InScopeRelation_MShape"); }
    public String keepShapeId_InScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_InScopeRelation_MShape", sq); }

    public Map<String, MShapeCQ> getShapeId_NotInScopeRelation_MShape() { return xgetSQueMap("shapeId_NotInScopeRelation_MShape"); }
    public String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq) { return xkeepSQue("shapeId_NotInScopeRelation_MShape", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    public Map<String, TStoreNoCQ> getStoreNoId_InScopeRelation_TStoreNo() { return xgetSQueMap("storeNoId_InScopeRelation_TStoreNo"); }
    public String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq) { return xkeepSQue("storeNoId_InScopeRelation_TStoreNo", sq); }

    public Map<String, TStoreNoCQ> getStoreNoId_NotInScopeRelation_TStoreNo() { return xgetSQueMap("storeNoId_NotInScopeRelation_TStoreNo"); }
    public String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq) { return xkeepSQue("storeNoId_NotInScopeRelation_TStoreNo", sq); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, BIGINT(19), FK to t_store_no}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {UQ+, IX, NotNull, BIGINT(19), FK to t_store_no}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _chargeNum;
    public ConditionValue xdfgetChargeNum()
    { if (_chargeNum == null) { _chargeNum = nCV(); }
      return _chargeNum; }
    protected ConditionValue xgetCValueChargeNum() { return xdfgetChargeNum(); }

    /**
     * Add order-by as ascend. <br>
     * CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ChargeNum_Asc() { regOBA("CHARGE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARGE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ChargeNum_Desc() { regOBD("CHARGE_NUM"); return this; }

    protected ConditionValue _allocNum;
    public ConditionValue xdfgetAllocNum()
    { if (_allocNum == null) { _allocNum = nCV(); }
      return _allocNum; }
    protected ConditionValue xgetCValueAllocNum() { return xdfgetAllocNum(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

    protected ConditionValue _moveNum;
    public ConditionValue xdfgetMoveNum()
    { if (_moveNum == null) { _moveNum = nCV(); }
      return _moveNum; }
    protected ConditionValue xgetCValueMoveNum() { return xdfgetMoveNum(); }

    /**
     * Add order-by as ascend. <br>
     * MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_MoveNum_Asc() { regOBA("MOVE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOVE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_MoveNum_Desc() { regOBD("MOVE_NUM"); return this; }

    protected ConditionValue _transitNum;
    public ConditionValue xdfgetTransitNum()
    { if (_transitNum == null) { _transitNum = nCV(); }
      return _transitNum; }
    protected ConditionValue xgetCValueTransitNum() { return xdfgetTransitNum(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSIT_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_TransitNum_Asc() { regOBA("TRANSIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSIT_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_TransitNum_Desc() { regOBD("TRANSIT_NUM"); return this; }

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
    public BsTStockCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTStockCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTStockCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTStockCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTStockCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTStockCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTStockCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTStockCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTStockCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTStockCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTStockCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTStockCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TStockCQ bq = (TStockCQ)bqs;
        TStockCQ uq = (TStockCQ)uqs;
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTStoreNo()) {
            uq.queryTStoreNo().reflectRelationOnUnionQuery(bq.queryTStoreNo(), uq.queryTStoreNo());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryTStockReportAsOne()) {
            uq.queryTStockReportAsOne().reflectRelationOnUnionQuery(bq.queryTStockReportAsOne(), uq.queryTStockReportAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("t_stock", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
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
        String nrp = xresolveNRP("t_stock", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_shape by my SHAPE_ID, named 'MShape'.
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
        String nrp = xresolveNRP("t_stock", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The instance of condition-query. (NotNull)
     */
    public TLotCQ queryTLot() {
        return xdfgetConditionQueryTLot();
    }
    public TLotCQ xdfgetConditionQueryTLot() {
        String prop = "tLot";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTLot()); xsetupOuterJoinTLot(); }
        return xgetQueRlMap(prop);
    }
    protected TLotCQ xcreateQueryTLot() {
        String nrp = xresolveNRP("t_stock", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
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
        String nrp = xresolveNRP("t_stock", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStoreNoCQ queryTStoreNo() {
        return xdfgetConditionQueryTStoreNo();
    }
    public TStoreNoCQ xdfgetConditionQueryTStoreNo() {
        String prop = "tStoreNo";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStoreNo()); xsetupOuterJoinTStoreNo(); }
        return xgetQueRlMap(prop);
    }
    protected TStoreNoCQ xcreateQueryTStoreNo() {
        String nrp = xresolveNRP("t_stock", "tStoreNo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNo", nrp);
    }
    protected void xsetupOuterJoinTStoreNo() { xregOutJo("tStoreNo"); }
    public boolean hasConditionQueryTStoreNo() { return xhasQueRlMap("tStoreNo"); }

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
        String nrp = xresolveNRP("t_stock", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
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
        String nrp = xresolveNRP("t_stock", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("t_stock", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_stock_report by STOCK_ID, named 'TStockReportAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockReportCQ queryTStockReportAsOne() { return xdfgetConditionQueryTStockReportAsOne(); }
    public TStockReportCQ xdfgetConditionQueryTStockReportAsOne() {
        String prop = "tStockReportAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStockReportAsOne()); xsetupOuterJoinTStockReportAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TStockReportCQ xcreateQueryTStockReportAsOne() {
        String nrp = xresolveNRP("t_stock", "tStockReportAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockReportCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStockReportAsOne", nrp);
    }
    protected void xsetupOuterJoinTStockReportAsOne() { xregOutJo("tStockReportAsOne"); }
    public boolean hasConditionQueryTStockReportAsOne() { return xhasQueRlMap("tStockReportAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TStockCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TStockCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TStockCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TStockCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TStockCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TStockCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TStockCQ> _myselfExistsMap;
    public Map<String, TStockCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TStockCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TStockCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TStockCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TStockCB.class.getName(); }
    protected String xCQ() { return TStockCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
