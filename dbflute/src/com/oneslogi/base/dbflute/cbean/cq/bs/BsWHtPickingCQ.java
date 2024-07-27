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
 * The base condition-query of w_ht_picking.
 * @author DBFlute(AutoGenerator)
 */
public class BsWHtPickingCQ extends AbstractBsWHtPickingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WHtPickingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWHtPickingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from w_ht_picking) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WHtPickingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WHtPickingCIQ xcreateCIQ() {
        WHtPickingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WHtPickingCIQ xnewCIQ() {
        return new WHtPickingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join w_ht_picking on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WHtPickingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WHtPickingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _htPickingId;
    public ConditionValue xdfgetHtPickingId()
    { if (_htPickingId == null) { _htPickingId = nCV(); }
      return _htPickingId; }
    protected ConditionValue xgetCValueHtPickingId() { return xdfgetHtPickingId(); }

    /**
     * Add order-by as ascend. <br>
     * HT_PICKING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_HtPickingId_Asc() { regOBA("HT_PICKING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * HT_PICKING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_HtPickingId_Desc() { regOBD("HT_PICKING_ID"); return this; }

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
    public BsWHtPickingCQ addOrderBy_MacAddress_Asc() { regOBA("MAC_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAC_ADDRESS: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_MacAddress_Desc() { regOBD("MAC_ADDRESS"); return this; }

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
    public BsWHtPickingCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsWHtPickingCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _pickingBId;
    public ConditionValue xdfgetPickingBId()
    { if (_pickingBId == null) { _pickingBId = nCV(); }
      return _pickingBId; }
    protected ConditionValue xgetCValuePickingBId() { return xdfgetPickingBId(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_B_ID: {IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_PickingBId_Asc() { regOBA("PICKING_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_B_ID: {IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_PickingBId_Desc() { regOBD("PICKING_B_ID"); return this; }

    protected ConditionValue _nizoroeNo;
    public ConditionValue xdfgetNizoroeNo()
    { if (_nizoroeNo == null) { _nizoroeNo = nCV(); }
      return _nizoroeNo; }
    protected ConditionValue xgetCValueNizoroeNo() { return xdfgetNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

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
    public BsWHtPickingCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsWHtPickingCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

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
    public BsWHtPickingCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _instNum;
    public ConditionValue xdfgetInstNum()
    { if (_instNum == null) { _instNum = nCV(); }
      return _instNum; }
    protected ConditionValue xgetCValueInstNum() { return xdfgetInstNum(); }

    /**
     * Add order-by as ascend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_InstNum_Asc() { regOBA("INST_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_InstNum_Desc() { regOBD("INST_NUM"); return this; }

    protected ConditionValue _spgQtyOns;
    public ConditionValue xdfgetSpgQtyOns()
    { if (_spgQtyOns == null) { _spgQtyOns = nCV(); }
      return _spgQtyOns; }
    protected ConditionValue xgetCValueSpgQtyOns() { return xdfgetSpgQtyOns(); }

    /**
     * Add order-by as ascend. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SpgQtyOns_Asc() { regOBA("SPG_QTY_ONS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SpgQtyOns_Desc() { regOBD("SPG_QTY_ONS"); return this; }

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
    public BsWHtPickingCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
    public BsWHtPickingCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _locationNm;
    public ConditionValue xdfgetLocationNm()
    { if (_locationNm == null) { _locationNm = nCV(); }
      return _locationNm; }
    protected ConditionValue xgetCValueLocationNm() { return xdfgetLocationNm(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

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
    public BsWHtPickingCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_WorkStartDt_Asc() { regOBA("WORK_START_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_START_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_WorkStartDt_Desc() { regOBD("WORK_START_DT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_WorkEndDt_Asc() { regOBA("WORK_END_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_END_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_WorkEndDt_Desc() { regOBD("WORK_END_DT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_StoreLabelNo_Asc() { regOBA("STORE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_LABEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_StoreLabelNo_Desc() { regOBD("STORE_LABEL_NO"); return this; }

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
    public BsWHtPickingCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {IX, BIGINT(19), FK to t_lot}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

    protected ConditionValue _pickingFlg;
    public ConditionValue xdfgetPickingFlg()
    { if (_pickingFlg == null) { _pickingFlg = nCV(); }
      return _pickingFlg; }
    protected ConditionValue xgetCValuePickingFlg() { return xdfgetPickingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_PickingFlg_Asc() { regOBA("PICKING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_PickingFlg_Desc() { regOBD("PICKING_FLG"); return this; }

    protected ConditionValue _skipNum;
    public ConditionValue xdfgetSkipNum()
    { if (_skipNum == null) { _skipNum = nCV(); }
      return _skipNum; }
    protected ConditionValue xgetCValueSkipNum() { return xdfgetSkipNum(); }

    /**
     * Add order-by as ascend. <br>
     * SKIP_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SkipNum_Asc() { regOBA("SKIP_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SKIP_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SkipNum_Desc() { regOBD("SKIP_NUM"); return this; }

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
    public BsWHtPickingCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

    protected ConditionValue _forceCopleteFlg;
    public ConditionValue xdfgetForceCopleteFlg()
    { if (_forceCopleteFlg == null) { _forceCopleteFlg = nCV(); }
      return _forceCopleteFlg; }
    protected ConditionValue xgetCValueForceCopleteFlg() { return xdfgetForceCopleteFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FORCE_COPLETE_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ForceCopleteFlg_Asc() { regOBA("FORCE_COPLETE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FORCE_COPLETE_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ForceCopleteFlg_Desc() { regOBD("FORCE_COPLETE_FLG"); return this; }

    protected ConditionValue _daihyoNizoroeNo;
    public ConditionValue xdfgetDaihyoNizoroeNo()
    { if (_daihyoNizoroeNo == null) { _daihyoNizoroeNo = nCV(); }
      return _daihyoNizoroeNo; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo() { return xdfgetDaihyoNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_DaihyoNizoroeNo_Asc() { regOBA("DAIHYO_NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_DaihyoNizoroeNo_Desc() { regOBD("DAIHYO_NIZOROE_NO"); return this; }

    protected ConditionValue _nizoroeNo2;
    public ConditionValue xdfgetNizoroeNo2()
    { if (_nizoroeNo2 == null) { _nizoroeNo2 = nCV(); }
      return _nizoroeNo2; }
    protected ConditionValue xgetCValueNizoroeNo2() { return xdfgetNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_NizoroeNo2_Asc() { regOBA("NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_NizoroeNo2_Desc() { regOBD("NIZOROE_NO2"); return this; }

    protected ConditionValue _daihyoNizoroeNo2;
    public ConditionValue xdfgetDaihyoNizoroeNo2()
    { if (_daihyoNizoroeNo2 == null) { _daihyoNizoroeNo2 = nCV(); }
      return _daihyoNizoroeNo2; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo2() { return xdfgetDaihyoNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_DaihyoNizoroeNo2_Asc() { regOBA("DAIHYO_NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_DaihyoNizoroeNo2_Desc() { regOBD("DAIHYO_NIZOROE_NO2"); return this; }

    protected ConditionValue _suspendFlg;
    public ConditionValue xdfgetSuspendFlg()
    { if (_suspendFlg == null) { _suspendFlg = nCV(); }
      return _suspendFlg; }
    protected ConditionValue xgetCValueSuspendFlg() { return xdfgetSuspendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SUSPEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SuspendFlg_Asc() { regOBA("SUSPEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUSPEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_SuspendFlg_Desc() { regOBD("SUSPEND_FLG"); return this; }

    protected ConditionValue _workGroupKey;
    public ConditionValue xdfgetWorkGroupKey()
    { if (_workGroupKey == null) { _workGroupKey = nCV(); }
      return _workGroupKey; }
    protected ConditionValue xgetCValueWorkGroupKey() { return xdfgetWorkGroupKey(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_WorkGroupKey_Asc() { regOBA("WORK_GROUP_KEY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_GROUP_KEY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_WorkGroupKey_Desc() { regOBD("WORK_GROUP_KEY"); return this; }

    protected ConditionValue _anotherPickingFlg;
    public ConditionValue xdfgetAnotherPickingFlg()
    { if (_anotherPickingFlg == null) { _anotherPickingFlg = nCV(); }
      return _anotherPickingFlg; }
    protected ConditionValue xgetCValueAnotherPickingFlg() { return xdfgetAnotherPickingFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ANOTHER_PICKING_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_AnotherPickingFlg_Asc() { regOBA("ANOTHER_PICKING_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ANOTHER_PICKING_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_AnotherPickingFlg_Desc() { regOBD("ANOTHER_PICKING_FLG"); return this; }

    protected ConditionValue _lapNum;
    public ConditionValue xdfgetLapNum()
    { if (_lapNum == null) { _lapNum = nCV(); }
      return _lapNum; }
    protected ConditionValue xgetCValueLapNum() { return xdfgetLapNum(); }

    /**
     * Add order-by as ascend. <br>
     * LAP_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LapNum_Asc() { regOBA("LAP_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAP_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_LapNum_Desc() { regOBD("LAP_NUM"); return this; }

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
    public BsWHtPickingCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsWHtPickingCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsWHtPickingCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsWHtPickingCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsWHtPickingCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsWHtPickingCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsWHtPickingCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsWHtPickingCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsWHtPickingCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsWHtPickingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWHtPickingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        WHtPickingCQ bq = (WHtPickingCQ)bqs;
        WHtPickingCQ uq = (WHtPickingCQ)uqs;
        if (bq.hasConditionQueryTLot()) {
            uq.queryTLot().reflectRelationOnUnionQuery(bq.queryTLot(), uq.queryTLot());
        }
        if (bq.hasConditionQueryMLocation()) {
            uq.queryMLocation().reflectRelationOnUnionQuery(bq.queryMLocation(), uq.queryMLocation());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("w_ht_picking", "tLot"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TLotCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tLot", nrp);
    }
    protected void xsetupOuterJoinTLot() { xregOutJo("tLot"); }
    public boolean hasConditionQueryTLot() { return xhasQueRlMap("tLot"); }

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
        String nrp = xresolveNRP("w_ht_picking", "mLocation"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MLocationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mLocation", nrp);
    }
    protected void xsetupOuterJoinMLocation() { xregOutJo("mLocation"); }
    public boolean hasConditionQueryMLocation() { return xhasQueRlMap("mLocation"); }

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
        String nrp = xresolveNRP("w_ht_picking", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("w_ht_picking", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("w_ht_picking", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WHtPickingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WHtPickingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WHtPickingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WHtPickingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WHtPickingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WHtPickingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WHtPickingCQ> _myselfExistsMap;
    public Map<String, WHtPickingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WHtPickingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WHtPickingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WHtPickingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WHtPickingCB.class.getName(); }
    protected String xCQ() { return WHtPickingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
