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
 * The base condition-query of w_ht_receive_inspection.
 * @author DBFlute(AutoGenerator)
 */
public class BsWHtReceiveInspectionCQ extends AbstractBsWHtReceiveInspectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WHtReceiveInspectionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWHtReceiveInspectionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from w_ht_receive_inspection) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WHtReceiveInspectionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WHtReceiveInspectionCIQ xcreateCIQ() {
        WHtReceiveInspectionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WHtReceiveInspectionCIQ xnewCIQ() {
        return new WHtReceiveInspectionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join w_ht_receive_inspection on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WHtReceiveInspectionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WHtReceiveInspectionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _htReceiveInspectionId;
    public ConditionValue xdfgetHtReceiveInspectionId()
    { if (_htReceiveInspectionId == null) { _htReceiveInspectionId = nCV(); }
      return _htReceiveInspectionId; }
    protected ConditionValue xgetCValueHtReceiveInspectionId() { return xdfgetHtReceiveInspectionId(); }

    /**
     * Add order-by as ascend. <br>
     * HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_HtReceiveInspectionId_Asc() { regOBA("HT_RECEIVE_INSPECTION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_RECEIVE_INSPECTION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_HtReceiveInspectionId_Desc() { regOBD("HT_RECEIVE_INSPECTION_ID"); return this; }

    protected ConditionValue _macAddress;
    public ConditionValue xdfgetMacAddress()
    { if (_macAddress == null) { _macAddress = nCV(); }
      return _macAddress; }
    protected ConditionValue xgetCValueMacAddress() { return xdfgetMacAddress(); }

    /**
     * Add order-by as ascend. <br>
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_WarehouseId_Asc() { regOBA("WAREHOUSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_WarehouseId_Desc() { regOBD("WAREHOUSE_ID"); return this; }

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
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _stkClsNm;
    public ConditionValue xdfgetStkClsNm()
    { if (_stkClsNm == null) { _stkClsNm = nCV(); }
      return _stkClsNm; }
    protected ConditionValue xgetCValueStkClsNm() { return xdfgetStkClsNm(); }

    /**
     * Add order-by as ascend. <br>
     * STK_CLS_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_StkClsNm_Asc() { regOBA("STK_CLS_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STK_CLS_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_StkClsNm_Desc() { regOBD("STK_CLS_NM"); return this; }

    protected ConditionValue _pieceQtyRcvOrd;
    public ConditionValue xdfgetPieceQtyRcvOrd()
    { if (_pieceQtyRcvOrd == null) { _pieceQtyRcvOrd = nCV(); }
      return _pieceQtyRcvOrd; }
    protected ConditionValue xgetCValuePieceQtyRcvOrd() { return xdfgetPieceQtyRcvOrd(); }

    /**
     * Add order-by as ascend. <br>
     * PIECE_QTY_RCV_ORD: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceQtyRcvOrd_Asc() { regOBA("PIECE_QTY_RCV_ORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIECE_QTY_RCV_ORD: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceQtyRcvOrd_Desc() { regOBD("PIECE_QTY_RCV_ORD"); return this; }

    protected ConditionValue _pieceQtyRcv;
    public ConditionValue xdfgetPieceQtyRcv()
    { if (_pieceQtyRcv == null) { _pieceQtyRcv = nCV(); }
      return _pieceQtyRcv; }
    protected ConditionValue xgetCValuePieceQtyRcv() { return xdfgetPieceQtyRcv(); }

    /**
     * Add order-by as ascend. <br>
     * PIECE_QTY_RCV: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceQtyRcv_Asc() { regOBA("PIECE_QTY_RCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIECE_QTY_RCV: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceQtyRcv_Desc() { regOBD("PIECE_QTY_RCV"); return this; }

    protected ConditionValue _rcvLocId;
    public ConditionValue xdfgetRcvLocId()
    { if (_rcvLocId == null) { _rcvLocId = nCV(); }
      return _rcvLocId; }
    protected ConditionValue xgetCValueRcvLocId() { return xdfgetRcvLocId(); }

    public Map<String, MLocationCQ> getRcvLocId_InScopeRelation_MLocation() { return xgetSQueMap("rcvLocId_InScopeRelation_MLocation"); }
    public String keepRcvLocId_InScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("rcvLocId_InScopeRelation_MLocation", sq); }

    public Map<String, MLocationCQ> getRcvLocId_NotInScopeRelation_MLocation() { return xgetSQueMap("rcvLocId_NotInScopeRelation_MLocation"); }
    public String keepRcvLocId_NotInScopeRelation_MLocation(MLocationCQ sq) { return xkeepSQue("rcvLocId_NotInScopeRelation_MLocation", sq); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LOC_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocId_Asc() { regOBA("RCV_LOC_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LOC_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocId_Desc() { regOBD("RCV_LOC_ID"); return this; }

    protected ConditionValue _rcvLocCd;
    public ConditionValue xdfgetRcvLocCd()
    { if (_rcvLocCd == null) { _rcvLocCd = nCV(); }
      return _rcvLocCd; }
    protected ConditionValue xgetCValueRcvLocCd() { return xdfgetRcvLocCd(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocCd_Asc() { regOBA("RCV_LOC_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LOC_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocCd_Desc() { regOBD("RCV_LOC_CD"); return this; }

    protected ConditionValue _rcvLocNm;
    public ConditionValue xdfgetRcvLocNm()
    { if (_rcvLocNm == null) { _rcvLocNm = nCV(); }
      return _rcvLocNm; }
    protected ConditionValue xgetCValueRcvLocNm() { return xdfgetRcvLocNm(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LOC_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocNm_Asc() { regOBA("RCV_LOC_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LOC_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_RcvLocNm_Desc() { regOBD("RCV_LOC_NM"); return this; }

    protected ConditionValue _htWorkNo;
    public ConditionValue xdfgetHtWorkNo()
    { if (_htWorkNo == null) { _htWorkNo = nCV(); }
      return _htWorkNo; }
    protected ConditionValue xgetCValueHtWorkNo() { return xdfgetHtWorkNo(); }

    /**
     * Add order-by as ascend. <br>
     * HT_WORK_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_HtWorkNo_Asc() { regOBA("HT_WORK_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_WORK_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_HtWorkNo_Desc() { regOBD("HT_WORK_NO"); return this; }

    protected ConditionValue _onsNum;
    public ConditionValue xdfgetOnsNum()
    { if (_onsNum == null) { _onsNum = nCV(); }
      return _onsNum; }
    protected ConditionValue xgetCValueOnsNum() { return xdfgetOnsNum(); }

    /**
     * Add order-by as ascend. <br>
     * ONS_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_OnsNum_Asc() { regOBA("ONS_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * ONS_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_OnsNum_Desc() { regOBD("ONS_NUM"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _labelSelect;
    public ConditionValue xdfgetLabelSelect()
    { if (_labelSelect == null) { _labelSelect = nCV(); }
      return _labelSelect; }
    protected ConditionValue xgetCValueLabelSelect() { return xdfgetLabelSelect(); }

    /**
     * Add order-by as ascend. <br>
     * LABEL_SELECT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_LabelSelect_Asc() { regOBA("LABEL_SELECT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABEL_SELECT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_LabelSelect_Desc() { regOBD("LABEL_SELECT"); return this; }

    protected ConditionValue _workStartDt;
    public ConditionValue xdfgetWorkStartDt()
    { if (_workStartDt == null) { _workStartDt = nCV(); }
      return _workStartDt; }
    protected ConditionValue xgetCValueWorkStartDt() { return xdfgetWorkStartDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_START_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_WorkStartDt_Asc() { regOBA("WORK_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_START_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_WorkStartDt_Desc() { regOBD("WORK_START_DT"); return this; }

    protected ConditionValue _workEndDt;
    public ConditionValue xdfgetWorkEndDt()
    { if (_workEndDt == null) { _workEndDt = nCV(); }
      return _workEndDt; }
    protected ConditionValue xgetCValueWorkEndDt() { return xdfgetWorkEndDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_END_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_WorkEndDt_Asc() { regOBA("WORK_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_END_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_WorkEndDt_Desc() { regOBD("WORK_END_DT"); return this; }

    protected ConditionValue _productionDt;
    public ConditionValue xdfgetProductionDt()
    { if (_productionDt == null) { _productionDt = nCV(); }
      return _productionDt; }
    protected ConditionValue xgetCValueProductionDt() { return xdfgetProductionDt(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCTION_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductionDt_Asc() { regOBA("PRODUCTION_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCTION_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ProductionDt_Desc() { regOBD("PRODUCTION_DT"); return this; }

    protected ConditionValue _inputAssistanceUnitNum;
    public ConditionValue xdfgetInputAssistanceUnitNum()
    { if (_inputAssistanceUnitNum == null) { _inputAssistanceUnitNum = nCV(); }
      return _inputAssistanceUnitNum; }
    protected ConditionValue xgetCValueInputAssistanceUnitNum() { return xdfgetInputAssistanceUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistanceUnitNum_Asc() { regOBA("INPUT_ASSISTANCE_UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_ASSISTANCE_UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistanceUnitNum_Desc() { regOBD("INPUT_ASSISTANCE_UNIT_NUM"); return this; }

    protected ConditionValue _inputAssistanceCaseNum;
    public ConditionValue xdfgetInputAssistanceCaseNum()
    { if (_inputAssistanceCaseNum == null) { _inputAssistanceCaseNum = nCV(); }
      return _inputAssistanceCaseNum; }
    protected ConditionValue xgetCValueInputAssistanceCaseNum() { return xdfgetInputAssistanceCaseNum(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistanceCaseNum_Asc() { regOBA("INPUT_ASSISTANCE_CASE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_ASSISTANCE_CASE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistanceCaseNum_Desc() { regOBD("INPUT_ASSISTANCE_CASE_NUM"); return this; }

    protected ConditionValue _inputAssistancePieceNum;
    public ConditionValue xdfgetInputAssistancePieceNum()
    { if (_inputAssistancePieceNum == null) { _inputAssistancePieceNum = nCV(); }
      return _inputAssistancePieceNum; }
    protected ConditionValue xgetCValueInputAssistancePieceNum() { return xdfgetInputAssistancePieceNum(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistancePieceNum_Asc() { regOBA("INPUT_ASSISTANCE_PIECE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_ASSISTANCE_PIECE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_InputAssistancePieceNum_Desc() { regOBD("INPUT_ASSISTANCE_PIECE_NUM"); return this; }

    protected ConditionValue _caseReceiveLabelNum;
    public ConditionValue xdfgetCaseReceiveLabelNum()
    { if (_caseReceiveLabelNum == null) { _caseReceiveLabelNum = nCV(); }
      return _caseReceiveLabelNum; }
    protected ConditionValue xgetCValueCaseReceiveLabelNum() { return xdfgetCaseReceiveLabelNum(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_RECEIVE_LABEL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_CaseReceiveLabelNum_Asc() { regOBA("CASE_RECEIVE_LABEL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_RECEIVE_LABEL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_CaseReceiveLabelNum_Desc() { regOBD("CASE_RECEIVE_LABEL_NUM"); return this; }

    protected ConditionValue _pieceReceiveLabelNum;
    public ConditionValue xdfgetPieceReceiveLabelNum()
    { if (_pieceReceiveLabelNum == null) { _pieceReceiveLabelNum = nCV(); }
      return _pieceReceiveLabelNum; }
    protected ConditionValue xgetCValuePieceReceiveLabelNum() { return xdfgetPieceReceiveLabelNum(); }

    /**
     * Add order-by as ascend. <br>
     * PIECE_RECEIVE_LABEL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceReceiveLabelNum_Asc() { regOBA("PIECE_RECEIVE_LABEL_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PIECE_RECEIVE_LABEL_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_PieceReceiveLabelNum_Desc() { regOBD("PIECE_RECEIVE_LABEL_NUM"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWHtReceiveInspectionCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtReceiveInspectionCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWHtReceiveInspectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWHtReceiveInspectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WHtReceiveInspectionCQ bq = (WHtReceiveInspectionCQ)bqs;
        WHtReceiveInspectionCQ uq = (WHtReceiveInspectionCQ)uqs;
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMWarehouse()) {
            uq.queryMWarehouse().reflectRelationOnUnionQuery(bq.queryMWarehouse(), uq.queryMWarehouse());
        }
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
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
        String nrp = xresolveNRP("w_ht_receive_inspection", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

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
        String nrp = xresolveNRP("w_ht_receive_inspection", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("w_ht_receive_inspection", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_location by my RCV_LOC_ID, named 'MLocation'.
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
        String nrp = xresolveNRP("w_ht_receive_inspection", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

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
        String nrp = xresolveNRP("w_ht_receive_inspection", "mWarehouse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MWarehouseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mWarehouse", nrp);
    }
    protected void xsetupOuterJoinMWarehouse() { xregOutJo("mWarehouse"); }
    public boolean hasConditionQueryMWarehouse() { return xhasQueRlMap("mWarehouse"); }

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
        String nrp = xresolveNRP("w_ht_receive_inspection", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

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
        String nrp = xresolveNRP("w_ht_receive_inspection", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, WHtReceiveInspectionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WHtReceiveInspectionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WHtReceiveInspectionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WHtReceiveInspectionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WHtReceiveInspectionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WHtReceiveInspectionCQ> _myselfExistsMap;
    public Map<String, WHtReceiveInspectionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WHtReceiveInspectionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WHtReceiveInspectionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WHtReceiveInspectionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WHtReceiveInspectionCB.class.getName(); }
    protected String xCQ() { return WHtReceiveInspectionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
