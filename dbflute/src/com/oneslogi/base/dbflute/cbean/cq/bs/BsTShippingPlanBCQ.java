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
 * The base condition-query of t_shipping_plan_b.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingPlanBCQ extends AbstractBsTShippingPlanBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingPlanBCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingPlanBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_plan_b) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingPlanBCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingPlanBCIQ xcreateCIQ() {
        TShippingPlanBCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingPlanBCIQ xnewCIQ() {
        return new TShippingPlanBCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_plan_b on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingPlanBCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingPlanBCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingPlanBId;
    public ConditionValue xdfgetShippingPlanBId()
    { if (_shippingPlanBId == null) { _shippingPlanBId = nCV(); }
      return _shippingPlanBId; }
    protected ConditionValue xgetCValueShippingPlanBId() { return xdfgetShippingPlanBId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShippingPlanBId_Asc() { regOBA("SHIPPING_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShippingPlanBId_Desc() { regOBD("SHIPPING_PLAN_B_ID"); return this; }

    protected ConditionValue _shippingPlanHId;
    public ConditionValue xdfgetShippingPlanHId()
    { if (_shippingPlanHId == null) { _shippingPlanHId = nCV(); }
      return _shippingPlanHId; }
    protected ConditionValue xgetCValueShippingPlanHId() { return xdfgetShippingPlanHId(); }

    public Map<String, TShippingPlanHCQ> getShippingPlanHId_InScopeRelation_TShippingPlanH() { return xgetSQueMap("shippingPlanHId_InScopeRelation_TShippingPlanH"); }
    public String keepShippingPlanHId_InScopeRelation_TShippingPlanH(TShippingPlanHCQ sq) { return xkeepSQue("shippingPlanHId_InScopeRelation_TShippingPlanH", sq); }

    public Map<String, TShippingPlanHCQ> getShippingPlanHId_NotInScopeRelation_TShippingPlanH() { return xgetSQueMap("shippingPlanHId_NotInScopeRelation_TShippingPlanH"); }
    public String keepShippingPlanHId_NotInScopeRelation_TShippingPlanH(TShippingPlanHCQ sq) { return xkeepSQue("shippingPlanHId_NotInScopeRelation_TShippingPlanH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShippingPlanHId_Asc() { regOBA("SHIPPING_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_plan_h}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShippingPlanHId_Desc() { regOBD("SHIPPING_PLAN_H_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_LineNo_Asc() { regOBA("LINE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LineNo_Desc() { regOBD("LINE_NO"); return this; }

    protected ConditionValue _warehouseId;
    public ConditionValue xdfgetWarehouseId()
    { if (_warehouseId == null) { _warehouseId = nCV(); }
      return _warehouseId; }
    protected ConditionValue xgetCValueWarehouseId() { return xdfgetWarehouseId(); }

    /**
     * Add order-by as ascend. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_WarehouseCd_Asc() { regOBA("WAREHOUSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_WarehouseCd_Desc() { regOBD("WAREHOUSE_CD"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _depositId;
    public ConditionValue xdfgetDepositId()
    { if (_depositId == null) { _depositId = nCV(); }
      return _depositId; }
    protected ConditionValue xgetCValueDepositId() { return xdfgetDepositId(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_DepositId_Asc() { regOBA("DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_DepositId_Desc() { regOBD("DEPOSIT_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_DepositCd_Asc() { regOBA("DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_DepositCd_Desc() { regOBD("DEPOSIT_CD"); return this; }

    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _storeNoId;
    public ConditionValue xdfgetStoreNoId()
    { if (_storeNoId == null) { _storeNoId = nCV(); }
      return _storeNoId; }
    protected ConditionValue xgetCValueStoreNoId() { return xdfgetStoreNoId(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_NO_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StoreNoId_Asc() { regOBA("STORE_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_NO_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StoreNoId_Desc() { regOBD("STORE_NO_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

    protected ConditionValue _shapeId;
    public ConditionValue xdfgetShapeId()
    { if (_shapeId == null) { _shapeId = nCV(); }
      return _shapeId; }
    protected ConditionValue xgetCValueShapeId() { return xdfgetShapeId(); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShapeId_Asc() { regOBA("SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShapeId_Desc() { regOBD("SHAPE_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_ShapeCd_Asc() { regOBA("SHAPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ShapeCd_Desc() { regOBD("SHAPE_CD"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _allocInstBId;
    public ConditionValue xdfgetAllocInstBId()
    { if (_allocInstBId == null) { _allocInstBId = nCV(); }
      return _allocInstBId; }
    protected ConditionValue xgetCValueAllocInstBId() { return xdfgetAllocInstBId(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AllocInstBId_Asc() { regOBA("ALLOC_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AllocInstBId_Desc() { regOBD("ALLOC_INST_B_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_AllocNum_Asc() { regOBA("ALLOC_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AllocNum_Desc() { regOBD("ALLOC_NUM"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_StockOutNum_Asc() { regOBA("STOCK_OUT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StockOutNum_Desc() { regOBD("STOCK_OUT_NUM"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_Price_Asc() { regOBA("PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_Price_Desc() { regOBD("PRICE"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_Tax_Asc() { regOBA("TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_Tax_Desc() { regOBD("TAX"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_CasePieceTypeId_Asc() { regOBA("CASE_PIECE_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PIECE_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_CasePieceTypeId_Desc() { regOBD("CASE_PIECE_TYPE_ID"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_CasePieceTypeCd_Asc() { regOBA("CASE_PIECE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_PIECE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_CasePieceTypeCd_Desc() { regOBD("CASE_PIECE_TYPE_CD"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _storeStorageSpaceCd;
    public ConditionValue xdfgetStoreStorageSpaceCd()
    { if (_storeStorageSpaceCd == null) { _storeStorageSpaceCd = nCV(); }
      return _storeStorageSpaceCd; }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return xdfgetStoreStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StoreStorageSpaceCd_Asc() { regOBA("STORE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StoreStorageSpaceCd_Desc() { regOBD("STORE_STORAGE_SPACE_CD"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_StorePlantCd_Asc() { regOBA("STORE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_StorePlantCd_Desc() { regOBD("STORE_PLANT_CD"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_TransactionTypeCd_Asc() { regOBA("TRANSACTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSACTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_TransactionTypeCd_Desc() { regOBD("TRANSACTION_TYPE_CD"); return this; }

    protected ConditionValue _cmSendFlg;
    public ConditionValue xdfgetCmSendFlg()
    { if (_cmSendFlg == null) { _cmSendFlg = nCV(); }
      return _cmSendFlg; }
    protected ConditionValue xgetCValueCmSendFlg() { return xdfgetCmSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_CmSendFlg_Asc() { regOBA("CM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_CmSendFlg_Desc() { regOBD("CM_SEND_FLG"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingPlanBCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanBCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingPlanBCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingPlanBCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingPlanBCQ bq = (TShippingPlanBCQ)bqs;
        TShippingPlanBCQ uq = (TShippingPlanBCQ)uqs;
        if (bq.hasConditionQueryTShippingPlanH()) {
            uq.queryTShippingPlanH().reflectRelationOnUnionQuery(bq.queryTShippingPlanH(), uq.queryTShippingPlanH());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_plan_h by my SHIPPING_PLAN_H_ID, named 'TShippingPlanH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingPlanHCQ queryTShippingPlanH() {
        return xdfgetConditionQueryTShippingPlanH();
    }
    public TShippingPlanHCQ xdfgetConditionQueryTShippingPlanH() {
        String prop = "tShippingPlanH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingPlanH()); xsetupOuterJoinTShippingPlanH(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingPlanHCQ xcreateQueryTShippingPlanH() {
        String nrp = xresolveNRP("t_shipping_plan_b", "tShippingPlanH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingPlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingPlanH", nrp);
    }
    protected void xsetupOuterJoinTShippingPlanH() { xregOutJo("tShippingPlanH"); }
    public boolean hasConditionQueryTShippingPlanH() { return xhasQueRlMap("tShippingPlanH"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingPlanBCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingPlanBCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingPlanBCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingPlanBCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingPlanBCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingPlanBCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingPlanBCQ> _myselfExistsMap;
    public Map<String, TShippingPlanBCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingPlanBCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingPlanBCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingPlanBCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingPlanBCB.class.getName(); }
    protected String xCQ() { return TShippingPlanBCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
