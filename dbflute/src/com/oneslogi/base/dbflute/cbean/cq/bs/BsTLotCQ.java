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
 * The base condition-query of t_lot.
 * @author DBFlute(AutoGenerator)
 */
public class BsTLotCQ extends AbstractBsTLotCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TLotCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTLotCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_lot) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TLotCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TLotCIQ xcreateCIQ() {
        TLotCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TLotCIQ xnewCIQ() {
        return new TLotCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_lot on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TLotCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TLotCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _lotId;
    public ConditionValue xdfgetLotId()
    { if (_lotId == null) { _lotId = nCV(); }
      return _lotId; }
    protected ConditionValue xgetCValueLotId() { return xdfgetLotId(); }

    public Map<String, TAllocInstBCQ> xdfgetLotId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("lotId_ExistsReferrer_TAllocInstBList"); }
    public String keepLotId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetLotId_ExistsReferrer_TAllocLotList() { return xgetSQueMap("lotId_ExistsReferrer_TAllocLotList"); }
    public String keepLotId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLotId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("lotId_ExistsReferrer_TInventoryBList"); }
    public String keepLotId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetLotId_ExistsReferrer_TKeepingLotList() { return xgetSQueMap("lotId_ExistsReferrer_TKeepingLotList"); }
    public String keepLotId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetLotId_ExistsReferrer_TLastLotList() { return xgetSQueMap("lotId_ExistsReferrer_TLastLotList"); }
    public String keepLotId_ExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLotId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("lotId_ExistsReferrer_TMoveInstBList"); }
    public String keepLotId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLotId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("lotId_ExistsReferrer_TShippingInstBList"); }
    public String keepLotId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLotId_ExistsReferrer_TStockList() { return xgetSQueMap("lotId_ExistsReferrer_TStockList"); }
    public String keepLotId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("lotId_ExistsReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLotId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("lotId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepLotId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLotId_ExistsReferrer_WHtPickingList() { return xgetSQueMap("lotId_ExistsReferrer_WHtPickingList"); }
    public String keepLotId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLotId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("lotId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepLotId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLotId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("lotId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLotId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLotId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("lotId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepLotId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLotId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("lotId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepLotId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLotId_ExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("lotId_ExistsReferrer_WHtTotalPickingList"); }
    public String keepLotId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("lotId_ExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLotId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("lotId_NotExistsReferrer_TAllocInstBList"); }
    public String keepLotId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetLotId_NotExistsReferrer_TAllocLotList() { return xgetSQueMap("lotId_NotExistsReferrer_TAllocLotList"); }
    public String keepLotId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLotId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("lotId_NotExistsReferrer_TInventoryBList"); }
    public String keepLotId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetLotId_NotExistsReferrer_TKeepingLotList() { return xgetSQueMap("lotId_NotExistsReferrer_TKeepingLotList"); }
    public String keepLotId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetLotId_NotExistsReferrer_TLastLotList() { return xgetSQueMap("lotId_NotExistsReferrer_TLastLotList"); }
    public String keepLotId_NotExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLotId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("lotId_NotExistsReferrer_TMoveInstBList"); }
    public String keepLotId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLotId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("lotId_NotExistsReferrer_TShippingInstBList"); }
    public String keepLotId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLotId_NotExistsReferrer_TStockList() { return xgetSQueMap("lotId_NotExistsReferrer_TStockList"); }
    public String keepLotId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLotId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepLotId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLotId_NotExistsReferrer_WHtPickingList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtPickingList"); }
    public String keepLotId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLotId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepLotId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLotId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLotId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLotId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepLotId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLotId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepLotId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLotId_NotExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("lotId_NotExistsReferrer_WHtTotalPickingList"); }
    public String keepLotId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("lotId_NotExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLotId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepLotId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetLotId_SpecifyDerivedReferrer_TAllocLotList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TAllocLotList"); }
    public String keepLotId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetLotId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepLotId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetLotId_SpecifyDerivedReferrer_TKeepingLotList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TKeepingLotList"); }
    public String keepLotId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetLotId_SpecifyDerivedReferrer_TLastLotList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TLastLotList"); }
    public String keepLotId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TLastLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetLotId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepLotId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetLotId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepLotId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetLotId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_TStockList"); }
    public String keepLotId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtPickingList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtPickingList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetLotId_SpecifyDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("lotId_SpecifyDerivedReferrer_WHtTotalPickingList"); }
    public String keepLotId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("lotId_SpecifyDerivedReferrer_WHtTotalPickingList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetLotId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TAllocLotCQ> xdfgetLotId_QueryDerivedReferrer_TAllocLotList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepLotId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TAllocLotList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TAllocLotListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepLotId_QueryDerivedReferrer_TAllocLotListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TAllocLotList", pm); }

    public Map<String, TInventoryBCQ> xdfgetLotId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepLotId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepLotId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TKeepingLotCQ> xdfgetLotId_QueryDerivedReferrer_TKeepingLotList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepLotId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TKeepingLotList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TKeepingLotListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepLotId_QueryDerivedReferrer_TKeepingLotListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TKeepingLotList", pm); }

    public Map<String, TLastLotCQ> xdfgetLotId_QueryDerivedReferrer_TLastLotList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TLastLotList"); }
    public String keepLotId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TLastLotList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TLastLotListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TLastLotList"); }
    public String keepLotId_QueryDerivedReferrer_TLastLotListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TLastLotList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetLotId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetLotId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepLotId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetLotId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("lotId_QueryDerivedReferrer_TStockList"); }
    public String keepLotId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_TStockList"); }
    public String keepLotId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetLotId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepLotId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtPickingCQ> xdfgetLotId_QueryDerivedReferrer_WHtPickingList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtPickingList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtPickingListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtPickingListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtPickingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetLotId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetLotId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepLotId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetLotId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WHtTotalPickingCQ> xdfgetLotId_QueryDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("lotId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("lotId_QueryDerivedReferrer_WHtTotalPickingList", sq); }
    public Map<String, Object> xdfgetLotId_QueryDerivedReferrer_WHtTotalPickingListParameter() { return xgetSQuePmMap("lotId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepLotId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object pm) { return xkeepSQuePm("lotId_QueryDerivedReferrer_WHtTotalPickingList", pm); }

    /**
     * Add order-by as ascend. <br>
     * LOT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LotId_Asc() { regOBA("LOT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LotId_Desc() { regOBD("LOT_ID"); return this; }

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
    public BsTLotCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _lotSort;
    public ConditionValue xdfgetLotSort()
    { if (_lotSort == null) { _lotSort = nCV(); }
      return _lotSort; }
    protected ConditionValue xgetCValueLotSort() { return xdfgetLotSort(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_SORT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LotSort_Asc() { regOBA("LOT_SORT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_SORT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LotSort_Desc() { regOBD("LOT_SORT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {IX, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {IX, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

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
    public BsTLotCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

    protected ConditionValue _receiveDt;
    public ConditionValue xdfgetReceiveDt()
    { if (_receiveDt == null) { _receiveDt = nCV(); }
      return _receiveDt; }
    protected ConditionValue xgetCValueReceiveDt() { return xdfgetReceiveDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_ReceiveDt_Asc() { regOBA("RECEIVE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_ReceiveDt_Desc() { regOBD("RECEIVE_DT"); return this; }

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
    public BsTLotCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTLotCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTLotCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTLotCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTLotCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTLotCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTLotCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTLotCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTLotCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTLotCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTLotCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTLotCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TLotCQ bq = (TLotCQ)bqs;
        TLotCQ uq = (TLotCQ)uqs;
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = xresolveNRP("t_lot", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TLotCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TLotCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TLotCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TLotCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TLotCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TLotCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TLotCQ> _myselfExistsMap;
    public Map<String, TLotCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TLotCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TLotCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TLotCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TLotCB.class.getName(); }
    protected String xCQ() { return TLotCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
