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
 * The base condition-query of t_shipping_inst_b.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstBCQ extends AbstractBsTShippingInstBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_inst_b) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstBCIQ xcreateCIQ() {
        TShippingInstBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstBCIQ xnewCIQ() {
        return new TShippingInstBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_inst_b on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, TPickingBCQ> xdfgetShippingInstBId_ExistsReferrer_TPickingBList() { return xgetSQueMap("shippingInstBId_ExistsReferrer_TPickingBList"); }
    public String keepShippingInstBId_ExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBPrintCQ> xdfgetShippingInstBId_ExistsReferrer_TShippingInstBPrintList() { return xgetSQueMap("shippingInstBId_ExistsReferrer_TShippingInstBPrintList"); }
    public String keepShippingInstBId_ExistsReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_TShippingInstBPrintList", sq); }

    public Map<String, TShippingInstDataTransferCQ> xdfgetShippingInstBId_ExistsReferrer_TShippingInstDataTransferList() { return xgetSQueMap("shippingInstBId_ExistsReferrer_TShippingInstDataTransferList"); }
    public String keepShippingInstBId_ExistsReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_TShippingInstDataTransferList", sq); }

    public Map<String, TShippingInstSpareCQ> xdfgetShippingInstBId_ExistsReferrer_TShippingInstSpareAsOne() { return xgetSQueMap("shippingInstBId_ExistsReferrer_TShippingInstSpareAsOne"); }
    public String keepShippingInstBId_ExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq) { return xkeepSQue("shippingInstBId_ExistsReferrer_TShippingInstSpareAsOne", sq); }

    public Map<String, TPickingBCQ> xdfgetShippingInstBId_NotExistsReferrer_TPickingBList() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_TPickingBList"); }
    public String keepShippingInstBId_NotExistsReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBPrintCQ> xdfgetShippingInstBId_NotExistsReferrer_TShippingInstBPrintList() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_TShippingInstBPrintList"); }
    public String keepShippingInstBId_NotExistsReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_TShippingInstBPrintList", sq); }

    public Map<String, TShippingInstDataTransferCQ> xdfgetShippingInstBId_NotExistsReferrer_TShippingInstDataTransferList() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_TShippingInstDataTransferList"); }
    public String keepShippingInstBId_NotExistsReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_TShippingInstDataTransferList", sq); }

    public Map<String, TShippingInstSpareCQ> xdfgetShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne() { return xgetSQueMap("shippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne"); }
    public String keepShippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne(TShippingInstSpareCQ sq) { return xkeepSQue("shippingInstBId_NotExistsReferrer_TShippingInstSpareAsOne", sq); }

    public Map<String, TPickingBCQ> xdfgetShippingInstBId_SpecifyDerivedReferrer_TPickingBList() { return xgetSQueMap("shippingInstBId_SpecifyDerivedReferrer_TPickingBList"); }
    public String keepShippingInstBId_SpecifyDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shippingInstBId_SpecifyDerivedReferrer_TPickingBList", sq); }

    public Map<String, TShippingInstBPrintCQ> xdfgetShippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList() { return xgetSQueMap("shippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList"); }
    public String keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq) { return xkeepSQue("shippingInstBId_SpecifyDerivedReferrer_TShippingInstBPrintList", sq); }

    public Map<String, TShippingInstDataTransferCQ> xdfgetShippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList() { return xgetSQueMap("shippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList"); }
    public String keepShippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq) { return xkeepSQue("shippingInstBId_SpecifyDerivedReferrer_TShippingInstDataTransferList", sq); }

    public Map<String, TPickingBCQ> xdfgetShippingInstBId_QueryDerivedReferrer_TPickingBList() { return xgetSQueMap("shippingInstBId_QueryDerivedReferrer_TPickingBList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TPickingBList(TPickingBCQ sq) { return xkeepSQue("shippingInstBId_QueryDerivedReferrer_TPickingBList", sq); }
    public Map<String, Object> xdfgetShippingInstBId_QueryDerivedReferrer_TPickingBListParameter() { return xgetSQuePmMap("shippingInstBId_QueryDerivedReferrer_TPickingBList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TPickingBListParameter(Object pm) { return xkeepSQuePm("shippingInstBId_QueryDerivedReferrer_TPickingBList", pm); }

    public Map<String, TShippingInstBPrintCQ> xdfgetShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList() { return xgetSQueMap("shippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList(TShippingInstBPrintCQ sq) { return xkeepSQue("shippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList", sq); }
    public Map<String, Object> xdfgetShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintListParameter() { return xgetSQuePmMap("shippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TShippingInstBPrintListParameter(Object pm) { return xkeepSQuePm("shippingInstBId_QueryDerivedReferrer_TShippingInstBPrintList", pm); }

    public Map<String, TShippingInstDataTransferCQ> xdfgetShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList() { return xgetSQueMap("shippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList(TShippingInstDataTransferCQ sq) { return xkeepSQue("shippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList", sq); }
    public Map<String, Object> xdfgetShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferListParameter() { return xgetSQuePmMap("shippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList"); }
    public String keepShippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferListParameter(Object pm) { return xkeepSQuePm("shippingInstBId_QueryDerivedReferrer_TShippingInstDataTransferList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_InScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_InScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_InScopeRelation_TShippingInstH", sq); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_NotInScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_NotInScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_NotInScopeRelation_TShippingInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

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
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

    protected ConditionValue _warehouseCd;
    public ConditionValue xdfgetWarehouseCd()
    { if (_warehouseCd == null) { _warehouseCd = nCV(); }
      return _warehouseCd; }
    protected ConditionValue xgetCValueWarehouseCd() { return xdfgetWarehouseCd(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _stockTypeCd;
    public ConditionValue xdfgetStockTypeCd()
    { if (_stockTypeCd == null) { _stockTypeCd = nCV(); }
      return _stockTypeCd; }
    protected ConditionValue xgetCValueStockTypeCd() { return xdfgetStockTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockTypeCd_Asc() { regOBA("STOCK_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockTypeCd_Desc() { regOBD("STOCK_TYPE_CD"); return this; }

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
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

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
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

    protected ConditionValue _depositCd;
    public ConditionValue xdfgetDepositCd()
    { if (_depositCd == null) { _depositCd = nCV(); }
      return _depositCd; }
    protected ConditionValue xgetCValueDepositCd() { return xdfgetDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

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
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {IX, BIGINT(19), FK to t_store_no}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

    protected ConditionValue _storeLabelNo;
    public ConditionValue xdfgetStoreLabelNo()
    { if (_storeLabelNo == null) { _storeLabelNo = nCV(); }
      return _storeLabelNo; }
    protected ConditionValue xgetCValueStoreLabelNo() { return xdfgetStoreLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

    protected ConditionValue _shapeCd;
    public ConditionValue xdfgetShapeCd()
    { if (_shapeCd == null) { _shapeCd = nCV(); }
      return _shapeCd; }
    protected ConditionValue xgetCValueShapeCd() { return xdfgetShapeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _allocInstBId;
    public ConditionValue xdfgetAllocInstBId()
    { if (_allocInstBId == null) { _allocInstBId = nCV(); }
      return _allocInstBId; }
    protected ConditionValue xgetCValueAllocInstBId() { return xdfgetAllocInstBId(); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_InScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_InScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_InScopeRelation_TAllocInstB", sq); }

    public Map<String, TAllocInstBCQ> getAllocInstBId_NotInScopeRelation_TAllocInstB() { return xgetSQueMap("allocInstBId_NotInScopeRelation_TAllocInstB"); }
    public String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq) { return xkeepSQue("allocInstBId_NotInScopeRelation_TAllocInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

    protected ConditionValue _stockOutNum;
    public ConditionValue xdfgetStockOutNum()
    { if (_stockOutNum == null) { _stockOutNum = nCV(); }
      return _stockOutNum; }
    protected ConditionValue xgetCValueStockOutNum() { return xdfgetStockOutNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockOutNum_Asc() { regOBA("STOCK_OUT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StockOutNum_Desc() { regOBD("STOCK_OUT_NUM"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

    protected ConditionValue _price;
    public ConditionValue xdfgetPrice()
    { if (_price == null) { _price = nCV(); }
      return _price; }
    protected ConditionValue xgetCValuePrice() { return xdfgetPrice(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Price_Asc() { regOBA("PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Price_Desc() { regOBD("PRICE"); return this; }

    protected ConditionValue _tax;
    public ConditionValue xdfgetTax()
    { if (_tax == null) { _tax = nCV(); }
      return _tax; }
    protected ConditionValue xgetCValueTax() { return xdfgetTax(); }

    /**
     * Add order-by as ascend. <br>
     * TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

    protected ConditionValue _casePieceTypeId;
    public ConditionValue xdfgetCasePieceTypeId()
    { if (_casePieceTypeId == null) { _casePieceTypeId = nCV(); }
      return _casePieceTypeId; }
    protected ConditionValue xgetCValueCasePieceTypeId() { return xdfgetCasePieceTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CasePieceTypeId_Asc() { regOBA("CASE_PIECE_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CasePieceTypeId_Desc() { regOBD("CASE_PIECE_TYPE_ID"); return this; }

    protected ConditionValue _casePieceTypeCd;
    public ConditionValue xdfgetCasePieceTypeCd()
    { if (_casePieceTypeCd == null) { _casePieceTypeCd = nCV(); }
      return _casePieceTypeCd; }
    protected ConditionValue xgetCValueCasePieceTypeCd() { return xdfgetCasePieceTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CasePieceTypeCd_Asc() { regOBA("CASE_PIECE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CasePieceTypeCd_Desc() { regOBD("CASE_PIECE_TYPE_CD"); return this; }

    protected ConditionValue _prodDt;
    public ConditionValue xdfgetProdDt()
    { if (_prodDt == null) { _prodDt = nCV(); }
      return _prodDt; }
    protected ConditionValue xgetCValueProdDt() { return xdfgetProdDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _taxRate;
    public ConditionValue xdfgetTaxRate()
    { if (_taxRate == null) { _taxRate = nCV(); }
      return _taxRate; }
    protected ConditionValue xgetCValueTaxRate() { return xdfgetTaxRate(); }

    /**
     * Add order-by as ascend. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_TaxRate_Asc() { regOBA("TAX_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX_RATE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_TaxRate_Desc() { regOBD("TAX_RATE"); return this; }

    protected ConditionValue _logiWeightFlg;
    public ConditionValue xdfgetLogiWeightFlg()
    { if (_logiWeightFlg == null) { _logiWeightFlg = nCV(); }
      return _logiWeightFlg; }
    protected ConditionValue xgetCValueLogiWeightFlg() { return xdfgetLogiWeightFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiWeightFlg_Asc() { regOBA("LOGI_WEIGHT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiWeightFlg_Desc() { regOBD("LOGI_WEIGHT_FLG"); return this; }

    protected ConditionValue _logiAttentionTypeCd;
    public ConditionValue xdfgetLogiAttentionTypeCd()
    { if (_logiAttentionTypeCd == null) { _logiAttentionTypeCd = nCV(); }
      return _logiAttentionTypeCd; }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return xdfgetLogiAttentionTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

    protected ConditionValue _logiSpecialTypeCd;
    public ConditionValue xdfgetLogiSpecialTypeCd()
    { if (_logiSpecialTypeCd == null) { _logiSpecialTypeCd = nCV(); }
      return _logiSpecialTypeCd; }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return xdfgetLogiSpecialTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _ecUnitNm;
    public ConditionValue xdfgetEcUnitNm()
    { if (_ecUnitNm == null) { _ecUnitNm = nCV(); }
      return _ecUnitNm; }
    protected ConditionValue xgetCValueEcUnitNm() { return xdfgetEcUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcUnitNm_Asc() { regOBA("EC_UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcUnitNm_Desc() { regOBD("EC_UNIT_NM"); return this; }

    protected ConditionValue _sampleTypeCd;
    public ConditionValue xdfgetSampleTypeCd()
    { if (_sampleTypeCd == null) { _sampleTypeCd = nCV(); }
      return _sampleTypeCd; }
    protected ConditionValue xgetCValueSampleTypeCd() { return xdfgetSampleTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_SampleTypeCd_Asc() { regOBA("SAMPLE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_SampleTypeCd_Desc() { regOBD("SAMPLE_TYPE_CD"); return this; }

    protected ConditionValue _ecOrderBranchNo;
    public ConditionValue xdfgetEcOrderBranchNo()
    { if (_ecOrderBranchNo == null) { _ecOrderBranchNo = nCV(); }
      return _ecOrderBranchNo; }
    protected ConditionValue xgetCValueEcOrderBranchNo() { return xdfgetEcOrderBranchNo(); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcOrderBranchNo_Asc() { regOBA("EC_ORDER_BRANCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcOrderBranchNo_Desc() { regOBD("EC_ORDER_BRANCH_NO"); return this; }

    protected ConditionValue _ecProductNmKanji;
    public ConditionValue xdfgetEcProductNmKanji()
    { if (_ecProductNmKanji == null) { _ecProductNmKanji = nCV(); }
      return _ecProductNmKanji; }
    protected ConditionValue xgetCValueEcProductNmKanji() { return xdfgetEcProductNmKanji(); }

    /**
     * Add order-by as ascend. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcProductNmKanji_Asc() { regOBA("EC_PRODUCT_NM_KANJI"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EcProductNmKanji_Desc() { regOBD("EC_PRODUCT_NM_KANJI"); return this; }

    protected ConditionValue _storePlantCd;
    public ConditionValue xdfgetStorePlantCd()
    { if (_storePlantCd == null) { _storePlantCd = nCV(); }
      return _storePlantCd; }
    protected ConditionValue xgetCValueStorePlantCd() { return xdfgetStorePlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StorePlantCd_Asc() { regOBA("STORE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StorePlantCd_Desc() { regOBD("STORE_PLANT_CD"); return this; }

    protected ConditionValue _storeStorageSpaceCd;
    public ConditionValue xdfgetStoreStorageSpaceCd()
    { if (_storeStorageSpaceCd == null) { _storeStorageSpaceCd = nCV(); }
      return _storeStorageSpaceCd; }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return xdfgetStoreStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreStorageSpaceCd_Asc() { regOBA("STORE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_StoreStorageSpaceCd_Desc() { regOBD("STORE_STORAGE_SPACE_CD"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_LotManagTypeCd_Asc() { regOBA("LOT_MANAG_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LotManagTypeCd_Desc() { regOBD("LOT_MANAG_TYPE_CD"); return this; }

    protected ConditionValue _delivCd;
    public ConditionValue xdfgetDelivCd()
    { if (_delivCd == null) { _delivCd = nCV(); }
      return _delivCd; }
    protected ConditionValue xgetCValueDelivCd() { return xdfgetDelivCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DelivCd_Asc() { regOBA("DELIV_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DelivCd_Desc() { regOBD("DELIV_CD"); return this; }

    protected ConditionValue _transactionTypeCd;
    public ConditionValue xdfgetTransactionTypeCd()
    { if (_transactionTypeCd == null) { _transactionTypeCd = nCV(); }
      return _transactionTypeCd; }
    protected ConditionValue xgetCValueTransactionTypeCd() { return xdfgetTransactionTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_TransactionTypeCd_Asc() { regOBA("TRANSACTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_TransactionTypeCd_Desc() { regOBD("TRANSACTION_TYPE_CD"); return this; }

    protected ConditionValue _wmSendFlg;
    public ConditionValue xdfgetWmSendFlg()
    { if (_wmSendFlg == null) { _wmSendFlg = nCV(); }
      return _wmSendFlg; }
    protected ConditionValue xgetCValueWmSendFlg() { return xdfgetWmSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WmSendFlg_Asc() { regOBA("WM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WM_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_WmSendFlg_Desc() { regOBD("WM_SEND_FLG"); return this; }

    protected ConditionValue _lpSendFlg;
    public ConditionValue xdfgetLpSendFlg()
    { if (_lpSendFlg == null) { _lpSendFlg = nCV(); }
      return _lpSendFlg; }
    protected ConditionValue xgetCValueLpSendFlg() { return xdfgetLpSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

    protected ConditionValue _cmSendFlg;
    public ConditionValue xdfgetCmSendFlg()
    { if (_cmSendFlg == null) { _cmSendFlg = nCV(); }
      return _cmSendFlg; }
    protected ConditionValue xgetCValueCmSendFlg() { return xdfgetCmSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CmSendFlg_Asc() { regOBA("CM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_CmSendFlg_Desc() { regOBD("CM_SEND_FLG"); return this; }

    protected ConditionValue _empIdCd;
    public ConditionValue xdfgetEmpIdCd()
    { if (_empIdCd == null) { _empIdCd = nCV(); }
      return _empIdCd; }
    protected ConditionValue xgetCValueEmpIdCd() { return xdfgetEmpIdCd(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EmpIdCd_Asc() { regOBA("EMP_ID_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EmpIdCd_Desc() { regOBD("EMP_ID_CD"); return this; }

    protected ConditionValue _empNm;
    public ConditionValue xdfgetEmpNm()
    { if (_empNm == null) { _empNm = nCV(); }
      return _empNm; }
    protected ConditionValue xgetCValueEmpNm() { return xdfgetEmpNm(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EmpNm_Asc() { regOBA("EMP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_EmpNm_Desc() { regOBD("EMP_NM"); return this; }

    protected ConditionValue _us3fTypeCd;
    public ConditionValue xdfgetUs3fTypeCd()
    { if (_us3fTypeCd == null) { _us3fTypeCd = nCV(); }
      return _us3fTypeCd; }
    protected ConditionValue xgetCValueUs3fTypeCd() { return xdfgetUs3fTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Us3fTypeCd_Asc() { regOBA("US3F_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * US3F_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_Us3fTypeCd_Desc() { regOBD("US3F_TYPE_CD"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstBCQ bq = (TShippingInstBCQ)bqs;
        TShippingInstBCQ uq = (TShippingInstBCQ)uqs;
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryTStoreNo()) {
            uq.queryTStoreNo().reflectRelationOnUnionQuery(bq.queryTStoreNo(), uq.queryTStoreNo());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryTAllocInstB()) {
            uq.queryTAllocInstB().reflectRelationOnUnionQuery(bq.queryTAllocInstB(), uq.queryTAllocInstB());
        }
        if (bq.hasConditionQueryMShape()) {
            uq.queryMShape().reflectRelationOnUnionQuery(bq.queryMShape(), uq.queryMShape());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTShippingInstH()) {
            uq.queryTShippingInstH().reflectRelationOnUnionQuery(bq.queryTShippingInstH(), uq.queryTShippingInstH());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryTShippingInstSpareAsOne()) {
            uq.queryTShippingInstSpareAsOne().reflectRelationOnUnionQuery(bq.queryTShippingInstSpareAsOne(), uq.queryTShippingInstSpareAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("t_shipping_inst_b", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "tStoreNo"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStoreNoCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStoreNo", nrp);
    }
    protected void xsetupOuterJoinTStoreNo() { xregOutJo("tStoreNo"); }
    public boolean hasConditionQueryTStoreNo() { return xhasQueRlMap("tStoreNo"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstBCQ queryTAllocInstB() {
        return xdfgetConditionQueryTAllocInstB();
    }
    public TAllocInstBCQ xdfgetConditionQueryTAllocInstB() {
        String prop = "tAllocInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstB()); xsetupOuterJoinTAllocInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstBCQ xcreateQueryTAllocInstB() {
        String nrp = xresolveNRP("t_shipping_inst_b", "tAllocInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstB", nrp);
    }
    protected void xsetupOuterJoinTAllocInstB() { xregOutJo("tAllocInstB"); }
    public boolean hasConditionQueryTAllocInstB() { return xhasQueRlMap("tAllocInstB"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "mShape"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShape", nrp);
    }
    protected void xsetupOuterJoinMShape() { xregOutJo("mShape"); }
    public boolean hasConditionQueryMShape() { return xhasQueRlMap("mShape"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstHCQ queryTShippingInstH() {
        return xdfgetConditionQueryTShippingInstH();
    }
    public TShippingInstHCQ xdfgetConditionQueryTShippingInstH() {
        String prop = "tShippingInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstH()); xsetupOuterJoinTShippingInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstHCQ xcreateQueryTShippingInstH() {
        String nrp = xresolveNRP("t_shipping_inst_b", "tShippingInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstH", nrp);
    }
    protected void xsetupOuterJoinTShippingInstH() { xregOutJo("tShippingInstH"); }
    public boolean hasConditionQueryTShippingInstH() { return xhasQueRlMap("tShippingInstH"); }

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
        String nrp = xresolveNRP("t_shipping_inst_b", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstSpareCQ queryTShippingInstSpareAsOne() { return xdfgetConditionQueryTShippingInstSpareAsOne(); }
    public TShippingInstSpareCQ xdfgetConditionQueryTShippingInstSpareAsOne() {
        String prop = "tShippingInstSpareAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstSpareAsOne()); xsetupOuterJoinTShippingInstSpareAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstSpareCQ xcreateQueryTShippingInstSpareAsOne() {
        String nrp = xresolveNRP("t_shipping_inst_b", "tShippingInstSpareAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstSpareCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstSpareAsOne", nrp);
    }
    protected void xsetupOuterJoinTShippingInstSpareAsOne() { xregOutJo("tShippingInstSpareAsOne"); }
    public boolean hasConditionQueryTShippingInstSpareAsOne() { return xhasQueRlMap("tShippingInstSpareAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingInstBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingInstBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingInstBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingInstBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingInstBCQ> _myselfExistsMap;
    public Map<String, TShippingInstBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingInstBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingInstBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingInstBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstBCB.class.getName(); }
    protected String xCQ() { return TShippingInstBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}