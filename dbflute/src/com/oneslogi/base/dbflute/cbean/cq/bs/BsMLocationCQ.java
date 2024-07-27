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
 * The base condition-query of m_location.
 * @author DBFlute(AutoGenerator)
 */
public class BsMLocationCQ extends AbstractBsMLocationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MLocationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMLocationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_location) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MLocationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MLocationCIQ xcreateCIQ() {
        MLocationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MLocationCIQ xnewCIQ() {
        return new MLocationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_location on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MLocationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MLocationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    public Map<String, HLocationAttributeCQ> xdfgetLocationId_ExistsReferrer_HLocationAttributeList() { return xgetSQueMap("locationId_ExistsReferrer_HLocationAttributeList"); }
    public String keepLocationId_ExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("locationId_ExistsReferrer_HLocationAttributeList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetLocationId_ExistsReferrer_MLocationReplenishProductList() { return xgetSQueMap("locationId_ExistsReferrer_MLocationReplenishProductList"); }
    public String keepLocationId_ExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("locationId_ExistsReferrer_MLocationReplenishProductList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLocationId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("locationId_ExistsReferrer_TAllocInstBList"); }
    public String keepLocationId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLocationId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("locationId_ExistsReferrer_TInventoryBList"); }
    public String keepLocationId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLocationId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("locationId_ExistsReferrer_TMoveInstBList"); }
    public String keepLocationId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetLocationId_ExistsReferrer_TMoveRecordBList() { return xgetSQueMap("locationId_ExistsReferrer_TMoveRecordBList"); }
    public String keepLocationId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetLocationId_ExistsReferrer_TReceivePlanBList() { return xgetSQueMap("locationId_ExistsReferrer_TReceivePlanBList"); }
    public String keepLocationId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLocationId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("locationId_ExistsReferrer_TShippingInstBList"); }
    public String keepLocationId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLocationId_ExistsReferrer_TStockList() { return xgetSQueMap("locationId_ExistsReferrer_TStockList"); }
    public String keepLocationId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetLocationId_ExistsReferrer_TStoreRecordBList() { return xgetSQueMap("locationId_ExistsReferrer_TStoreRecordBList"); }
    public String keepLocationId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("locationId_ExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLocationId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("locationId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepLocationId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLocationId_ExistsReferrer_WHtPickingList() { return xgetSQueMap("locationId_ExistsReferrer_WHtPickingList"); }
    public String keepLocationId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLocationId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("locationId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepLocationId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLocationId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("locationId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLocationId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLocationId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("locationId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepLocationId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLocationId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("locationId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepLocationId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLocationId_ExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("locationId_ExistsReferrer_WHtTotalPickingList"); }
    public String keepLocationId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("locationId_ExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetLocationId_NotExistsReferrer_HLocationAttributeList() { return xgetSQueMap("locationId_NotExistsReferrer_HLocationAttributeList"); }
    public String keepLocationId_NotExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_HLocationAttributeList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetLocationId_NotExistsReferrer_MLocationReplenishProductList() { return xgetSQueMap("locationId_NotExistsReferrer_MLocationReplenishProductList"); }
    public String keepLocationId_NotExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_MLocationReplenishProductList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLocationId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("locationId_NotExistsReferrer_TAllocInstBList"); }
    public String keepLocationId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLocationId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("locationId_NotExistsReferrer_TInventoryBList"); }
    public String keepLocationId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLocationId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("locationId_NotExistsReferrer_TMoveInstBList"); }
    public String keepLocationId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetLocationId_NotExistsReferrer_TMoveRecordBList() { return xgetSQueMap("locationId_NotExistsReferrer_TMoveRecordBList"); }
    public String keepLocationId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetLocationId_NotExistsReferrer_TReceivePlanBList() { return xgetSQueMap("locationId_NotExistsReferrer_TReceivePlanBList"); }
    public String keepLocationId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLocationId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("locationId_NotExistsReferrer_TShippingInstBList"); }
    public String keepLocationId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLocationId_NotExistsReferrer_TStockList() { return xgetSQueMap("locationId_NotExistsReferrer_TStockList"); }
    public String keepLocationId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetLocationId_NotExistsReferrer_TStoreRecordBList() { return xgetSQueMap("locationId_NotExistsReferrer_TStoreRecordBList"); }
    public String keepLocationId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_TStoreRecordBList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLocationId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepLocationId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLocationId_NotExistsReferrer_WHtPickingList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtPickingList"); }
    public String keepLocationId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLocationId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepLocationId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLocationId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLocationId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLocationId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepLocationId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLocationId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepLocationId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLocationId_NotExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("locationId_NotExistsReferrer_WHtTotalPickingList"); }
    public String keepLocationId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("locationId_NotExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetLocationId_SpecifyDerivedReferrer_HLocationAttributeList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_HLocationAttributeList"); }
    public String keepLocationId_SpecifyDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_HLocationAttributeList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetLocationId_SpecifyDerivedReferrer_MLocationReplenishProductList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_MLocationReplenishProductList"); }
    public String keepLocationId_SpecifyDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_MLocationReplenishProductList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TMoveRecordBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TMoveRecordBList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TReceivePlanBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TReceivePlanBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLocationId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TStockList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStoreRecordBCQ> xdfgetLocationId_SpecifyDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_TStoreRecordBList"); }
    public String keepLocationId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_TStoreRecordBList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtPickingList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtPickingList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLocationId_SpecifyDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("locationId_SpecifyDerivedReferrer_WHtTotalPickingList"); }
    public String keepLocationId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("locationId_SpecifyDerivedReferrer_WHtTotalPickingList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetLocationId_QueryDerivedReferrer_HLocationAttributeList() { return xgetSQueMap("locationId_QueryDerivedReferrer_HLocationAttributeList"); }
    public String keepLocationId_QueryDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_HLocationAttributeList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_HLocationAttributeListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_HLocationAttributeList"); }
    public String keepLocationId_QueryDerivedReferrer_HLocationAttributeListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_HLocationAttributeList", pm); }

    public Map<String, MLocationReplenishProductCQ> xdfgetLocationId_QueryDerivedReferrer_MLocationReplenishProductList() { return xgetSQueMap("locationId_QueryDerivedReferrer_MLocationReplenishProductList"); }
    public String keepLocationId_QueryDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_MLocationReplenishProductList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_MLocationReplenishProductListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_MLocationReplenishProductList"); }
    public String keepLocationId_QueryDerivedReferrer_MLocationReplenishProductListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_MLocationReplenishProductList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetLocationId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TInventoryBCQ> xdfgetLocationId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepLocationId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepLocationId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetLocationId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TMoveRecordBCQ> xdfgetLocationId_QueryDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepLocationId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TMoveRecordBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TMoveRecordBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepLocationId_QueryDerivedReferrer_TMoveRecordBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TMoveRecordBList", pm); }

    public Map<String, TReceivePlanBCQ> xdfgetLocationId_QueryDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepLocationId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TReceivePlanBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TReceivePlanBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepLocationId_QueryDerivedReferrer_TReceivePlanBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TReceivePlanBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetLocationId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepLocationId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetLocationId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TStockList"); }
    public String keepLocationId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TStockList"); }
    public String keepLocationId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStoreRecordBCQ> xdfgetLocationId_QueryDerivedReferrer_TStoreRecordBList() { return xgetSQueMap("locationId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepLocationId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_TStoreRecordBList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_TStoreRecordBListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_TStoreRecordBList"); }
    public String keepLocationId_QueryDerivedReferrer_TStoreRecordBListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_TStoreRecordBList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLocationId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtPickingCQ> xdfgetLocationId_QueryDerivedReferrer_WHtPickingList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtPickingList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtPickingListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtPickingListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtPickingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetLocationId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WHtTotalPickingCQ> xdfgetLocationId_QueryDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("locationId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("locationId_QueryDerivedReferrer_WHtTotalPickingList", sq); }
    public Map<String, Object> xdfgetLocationId_QueryDerivedReferrer_WHtTotalPickingListParameter() { return xgetSQuePmMap("locationId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepLocationId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object pm) { return xkeepSQuePm("locationId_QueryDerivedReferrer_WHtTotalPickingList", pm); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

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
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {UQ+, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _zoneId;
    public ConditionValue xdfgetZoneId()
    { if (_zoneId == null) { _zoneId = nCV(); }
      return _zoneId; }
    protected ConditionValue xgetCValueZoneId() { return xdfgetZoneId(); }

    public Map<String, MZoneCQ> getZoneId_InScopeRelation_MZone() { return xgetSQueMap("zoneId_InScopeRelation_MZone"); }
    public String keepZoneId_InScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_InScopeRelation_MZone", sq); }

    public Map<String, MZoneCQ> getZoneId_NotInScopeRelation_MZone() { return xgetSQueMap("zoneId_NotInScopeRelation_MZone"); }
    public String keepZoneId_NotInScopeRelation_MZone(MZoneCQ sq) { return xkeepSQue("zoneId_NotInScopeRelation_MZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ZoneId_Asc() { regOBA("ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZONE_ID: {IX, NotNull, BIGINT(19), FK to m_zone}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ZoneId_Desc() { regOBD("ZONE_ID"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

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
    public BsMLocationCQ addOrderBy_LocationNm_Asc() { regOBA("LOCATION_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationNm_Desc() { regOBD("LOCATION_NM"); return this; }

    protected ConditionValue _pickingLocationFlg;
    public ConditionValue xdfgetPickingLocationFlg()
    { if (_pickingLocationFlg == null) { _pickingLocationFlg = nCV(); }
      return _pickingLocationFlg; }
    protected ConditionValue xgetCValuePickingLocationFlg() { return xdfgetPickingLocationFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_PickingLocationFlg_Asc() { regOBA("PICKING_LOCATION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_LOCATION_FLG: {NotNull, CHAR(1), default=[1], FK to B_CLASS_DTL, classification=PickingLocationFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_PickingLocationFlg_Desc() { regOBD("PICKING_LOCATION_FLG"); return this; }

    protected ConditionValue _pickingOrder;
    public ConditionValue xdfgetPickingOrder()
    { if (_pickingOrder == null) { _pickingOrder = nCV(); }
      return _pickingOrder; }
    protected ConditionValue xgetCValuePickingOrder() { return xdfgetPickingOrder(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_PickingOrder_Asc() { regOBA("PICKING_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_ORDER: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_PickingOrder_Desc() { regOBD("PICKING_ORDER"); return this; }

    protected ConditionValue _locationType;
    public ConditionValue xdfgetLocationType()
    { if (_locationType == null) { _locationType = nCV(); }
      return _locationType; }
    protected ConditionValue xgetCValueLocationType() { return xdfgetLocationType(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationType_Asc() { regOBA("LOCATION_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=LocationType}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationType_Desc() { regOBD("LOCATION_TYPE"); return this; }

    protected ConditionValue _allocOrder;
    public ConditionValue xdfgetAllocOrder()
    { if (_allocOrder == null) { _allocOrder = nCV(); }
      return _allocOrder; }
    protected ConditionValue xgetCValueAllocOrder() { return xdfgetAllocOrder(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AllocOrder_Asc() { regOBA("ALLOC_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AllocOrder_Desc() { regOBD("ALLOC_ORDER"); return this; }

    protected ConditionValue _allocNgFlg;
    public ConditionValue xdfgetAllocNgFlg()
    { if (_allocNgFlg == null) { _allocNgFlg = nCV(); }
      return _allocNgFlg; }
    protected ConditionValue xgetCValueAllocNgFlg() { return xdfgetAllocNgFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AllocNgFlg_Asc() { regOBA("ALLOC_NG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_NG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=AllcNgFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AllocNgFlg_Desc() { regOBD("ALLOC_NG_FLG"); return this; }

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
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishProductId_Asc() { regOBA("REPLENISH_PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishProductId_Desc() { regOBD("REPLENISH_PRODUCT_ID"); return this; }

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
    public BsMLocationCQ addOrderBy_ReplenishStockTypeId_Asc() { regOBA("REPLENISH_STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishStockTypeId_Desc() { regOBD("REPLENISH_STOCK_TYPE_ID"); return this; }

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
    public BsMLocationCQ addOrderBy_ReplenishDepositId_Asc() { regOBA("REPLENISH_DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishDepositId_Desc() { regOBD("REPLENISH_DEPOSIT_ID"); return this; }

    protected ConditionValue _replenishPNum;
    public ConditionValue xdfgetReplenishPNum()
    { if (_replenishPNum == null) { _replenishPNum = nCV(); }
      return _replenishPNum; }
    protected ConditionValue xgetCValueReplenishPNum() { return xdfgetReplenishPNum(); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishPNum_Asc() { regOBA("REPLENISH_P_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishPNum_Desc() { regOBD("REPLENISH_P_NUM"); return this; }

    protected ConditionValue _replenishPProductShapeId;
    public ConditionValue xdfgetReplenishPProductShapeId()
    { if (_replenishPProductShapeId == null) { _replenishPProductShapeId = nCV(); }
      return _replenishPProductShapeId; }
    protected ConditionValue xgetCValueReplenishPProductShapeId() { return xdfgetReplenishPProductShapeId(); }

    public Map<String, MProductShapeCQ> getReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId() { return xgetSQueMap("replenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId"); }
    public String keepReplenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq) { return xkeepSQue("replenishPProductShapeId_InScopeRelation_MProductShapeByReplenishPProductShapeId", sq); }

    public Map<String, MProductShapeCQ> getReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId() { return xgetSQueMap("replenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId"); }
    public String keepReplenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId(MProductShapeCQ sq) { return xkeepSQue("replenishPProductShapeId_NotInScopeRelation_MProductShapeByReplenishPProductShapeId", sq); }

    /**
     * Add order-by as ascend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishPProductShapeId_Asc() { regOBA("REPLENISH_P_PRODUCT_SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ReplenishPProductShapeId_Desc() { regOBD("REPLENISH_P_PRODUCT_SHAPE_ID"); return this; }

    protected ConditionValue _maxStoreNum;
    public ConditionValue xdfgetMaxStoreNum()
    { if (_maxStoreNum == null) { _maxStoreNum = nCV(); }
      return _maxStoreNum; }
    protected ConditionValue xgetCValueMaxStoreNum() { return xdfgetMaxStoreNum(); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_MaxStoreNum_Asc() { regOBA("MAX_STORE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_MaxStoreNum_Desc() { regOBD("MAX_STORE_NUM"); return this; }

    protected ConditionValue _maxStoreProductShapeId;
    public ConditionValue xdfgetMaxStoreProductShapeId()
    { if (_maxStoreProductShapeId == null) { _maxStoreProductShapeId = nCV(); }
      return _maxStoreProductShapeId; }
    protected ConditionValue xgetCValueMaxStoreProductShapeId() { return xdfgetMaxStoreProductShapeId(); }

    public Map<String, MProductShapeCQ> getMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId() { return xgetSQueMap("maxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId"); }
    public String keepMaxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq) { return xkeepSQue("maxStoreProductShapeId_InScopeRelation_MProductShapeByMaxStoreProductShapeId", sq); }

    public Map<String, MProductShapeCQ> getMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId() { return xgetSQueMap("maxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId"); }
    public String keepMaxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId(MProductShapeCQ sq) { return xkeepSQue("maxStoreProductShapeId_NotInScopeRelation_MProductShapeByMaxStoreProductShapeId", sq); }

    /**
     * Add order-by as ascend. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_MaxStoreProductShapeId_Asc() { regOBA("MAX_STORE_PRODUCT_SHAPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_product_shape}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_MaxStoreProductShapeId_Desc() { regOBD("MAX_STORE_PRODUCT_SHAPE_ID"); return this; }

    protected ConditionValue _externalWhFlg;
    public ConditionValue xdfgetExternalWhFlg()
    { if (_externalWhFlg == null) { _externalWhFlg = nCV(); }
      return _externalWhFlg; }
    protected ConditionValue xgetCValueExternalWhFlg() { return xdfgetExternalWhFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ExternalWhFlg_Asc() { regOBA("EXTERNAL_WH_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXTERNAL_WH_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ExternalWhFlg_Desc() { regOBD("EXTERNAL_WH_FLG"); return this; }

    protected ConditionValue _locationAttribute;
    public ConditionValue xdfgetLocationAttribute()
    { if (_locationAttribute == null) { _locationAttribute = nCV(); }
      return _locationAttribute; }
    protected ConditionValue xgetCValueLocationAttribute() { return xdfgetLocationAttribute(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationAttribute_Asc() { regOBA("LOCATION_ATTRIBUTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ATTRIBUTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_LocationAttribute_Desc() { regOBD("LOCATION_ATTRIBUTE"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMLocationCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMLocationCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMLocationCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMLocationCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMLocationCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMLocationCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMLocationCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMLocationCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMLocationCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMLocationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMLocationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MLocationCQ bq = (MLocationCQ)bqs;
        MLocationCQ uq = (MLocationCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMProductShapeByMaxStoreProductShapeId()) {
            uq.queryMProductShapeByMaxStoreProductShapeId().reflectRelationOnUnionQuery(bq.queryMProductShapeByMaxStoreProductShapeId(), uq.queryMProductShapeByMaxStoreProductShapeId());
        }
        if (bq.hasConditionQueryMProductShapeByReplenishPProductShapeId()) {
            uq.queryMProductShapeByReplenishPProductShapeId().reflectRelationOnUnionQuery(bq.queryMProductShapeByReplenishPProductShapeId(), uq.queryMProductShapeByReplenishPProductShapeId());
        }
        if (bq.hasConditionQueryMZone()) {
            uq.queryMZone().reflectRelationOnUnionQuery(bq.queryMZone(), uq.queryMZone());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryBClassDtlByAllocNgFlg()) {
            uq.queryBClassDtlByAllocNgFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByAllocNgFlg(), uq.queryBClassDtlByAllocNgFlg());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLocationType()) {
            uq.queryBClassDtlByLocationType().reflectRelationOnUnionQuery(bq.queryBClassDtlByLocationType(), uq.queryBClassDtlByLocationType());
        }
        if (bq.hasConditionQueryBClassDtlByPickingLocationFlg()) {
            uq.queryBClassDtlByPickingLocationFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPickingLocationFlg(), uq.queryBClassDtlByPickingLocationFlg());
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
        String nrp = xresolveNRP("m_location", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShapeByMaxStoreProductShapeId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductShapeCQ queryMProductShapeByMaxStoreProductShapeId() {
        return xdfgetConditionQueryMProductShapeByMaxStoreProductShapeId();
    }
    public MProductShapeCQ xdfgetConditionQueryMProductShapeByMaxStoreProductShapeId() {
        String prop = "mProductShapeByMaxStoreProductShapeId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductShapeByMaxStoreProductShapeId()); xsetupOuterJoinMProductShapeByMaxStoreProductShapeId(); }
        return xgetQueRlMap(prop);
    }
    protected MProductShapeCQ xcreateQueryMProductShapeByMaxStoreProductShapeId() {
        String nrp = xresolveNRP("m_location", "mProductShapeByMaxStoreProductShapeId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductShapeByMaxStoreProductShapeId", nrp);
    }
    protected void xsetupOuterJoinMProductShapeByMaxStoreProductShapeId() { xregOutJo("mProductShapeByMaxStoreProductShapeId"); }
    public boolean hasConditionQueryMProductShapeByMaxStoreProductShapeId() { return xhasQueRlMap("mProductShapeByMaxStoreProductShapeId"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_product_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MProductShapeByReplenishPProductShapeId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductShapeCQ queryMProductShapeByReplenishPProductShapeId() {
        return xdfgetConditionQueryMProductShapeByReplenishPProductShapeId();
    }
    public MProductShapeCQ xdfgetConditionQueryMProductShapeByReplenishPProductShapeId() {
        String prop = "mProductShapeByReplenishPProductShapeId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProductShapeByReplenishPProductShapeId()); xsetupOuterJoinMProductShapeByReplenishPProductShapeId(); }
        return xgetQueRlMap(prop);
    }
    protected MProductShapeCQ xcreateQueryMProductShapeByReplenishPProductShapeId() {
        String nrp = xresolveNRP("m_location", "mProductShapeByReplenishPProductShapeId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductShapeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProductShapeByReplenishPProductShapeId", nrp);
    }
    protected void xsetupOuterJoinMProductShapeByReplenishPProductShapeId() { xregOutJo("mProductShapeByReplenishPProductShapeId"); }
    public boolean hasConditionQueryMProductShapeByReplenishPProductShapeId() { return xhasQueRlMap("mProductShapeByReplenishPProductShapeId"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_zone by my ZONE_ID, named 'MZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZoneCQ queryMZone() {
        return xdfgetConditionQueryMZone();
    }
    public MZoneCQ xdfgetConditionQueryMZone() {
        String prop = "mZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZone()); xsetupOuterJoinMZone(); }
        return xgetQueRlMap(prop);
    }
    protected MZoneCQ xcreateQueryMZone() {
        String nrp = xresolveNRP("m_location", "mZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZone", nrp);
    }
    protected void xsetupOuterJoinMZone() { xregOutJo("mZone"); }
    public boolean hasConditionQueryMZone() { return xhasQueRlMap("mZone"); }

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
        String nrp = xresolveNRP("m_location", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

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
        String nrp = xresolveNRP("m_location", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

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
        String nrp = xresolveNRP("m_location", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my ALLOC_NG_FLG, named 'BClassDtlByAllocNgFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByAllocNgFlg() {
        return xdfgetConditionQueryBClassDtlByAllocNgFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByAllocNgFlg() {
        String prop = "bClassDtlByAllocNgFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByAllocNgFlg()); xsetupOuterJoinBClassDtlByAllocNgFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByAllocNgFlg() {
        String nrp = xresolveNRP("m_location", "bClassDtlByAllocNgFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByAllocNgFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByAllocNgFlg() { xregOutJo("bClassDtlByAllocNgFlg"); }
    public boolean hasConditionQueryBClassDtlByAllocNgFlg() { return xhasQueRlMap("bClassDtlByAllocNgFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("m_location", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LOCATION_TYPE, named 'BClassDtlByLocationType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLocationType() {
        return xdfgetConditionQueryBClassDtlByLocationType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLocationType() {
        String prop = "bClassDtlByLocationType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLocationType()); xsetupOuterJoinBClassDtlByLocationType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLocationType() {
        String nrp = xresolveNRP("m_location", "bClassDtlByLocationType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLocationType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLocationType() { xregOutJo("bClassDtlByLocationType"); }
    public boolean hasConditionQueryBClassDtlByLocationType() { return xhasQueRlMap("bClassDtlByLocationType"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PICKING_LOCATION_FLG, named 'BClassDtlByPickingLocationFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPickingLocationFlg() {
        return xdfgetConditionQueryBClassDtlByPickingLocationFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPickingLocationFlg() {
        String prop = "bClassDtlByPickingLocationFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPickingLocationFlg()); xsetupOuterJoinBClassDtlByPickingLocationFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPickingLocationFlg() {
        String nrp = xresolveNRP("m_location", "bClassDtlByPickingLocationFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPickingLocationFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPickingLocationFlg() { xregOutJo("bClassDtlByPickingLocationFlg"); }
    public boolean hasConditionQueryBClassDtlByPickingLocationFlg() { return xhasQueRlMap("bClassDtlByPickingLocationFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MLocationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MLocationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MLocationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MLocationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MLocationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MLocationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MLocationCQ> _myselfExistsMap;
    public Map<String, MLocationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MLocationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MLocationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MLocationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MLocationCB.class.getName(); }
    protected String xCQ() { return MLocationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
