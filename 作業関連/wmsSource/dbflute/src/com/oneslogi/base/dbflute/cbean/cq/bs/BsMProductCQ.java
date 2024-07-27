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
 * The base condition-query of m_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsMProductCQ extends AbstractBsMProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MProductCIQ xcreateCIQ() {
        MProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MProductCIQ xnewCIQ() {
        return new MProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, HStockBookCQ> xdfgetProductId_ExistsReferrer_HStockBookList() { return xgetSQueMap("productId_ExistsReferrer_HStockBookList"); }
    public String keepProductId_ExistsReferrer_HStockBookList(HStockBookCQ sq) { return xkeepSQue("productId_ExistsReferrer_HStockBookList", sq); }

    public Map<String, MDepositProductCQ> xdfgetProductId_ExistsReferrer_MDepositProductList() { return xgetSQueMap("productId_ExistsReferrer_MDepositProductList"); }
    public String keepProductId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("productId_ExistsReferrer_MDepositProductList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_ExistsReferrer_MLocationList() { return xgetSQueMap("productId_ExistsReferrer_MLocationList"); }
    public String keepProductId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetProductId_ExistsReferrer_MLocationReplenishProductList() { return xgetSQueMap("productId_ExistsReferrer_MLocationReplenishProductList"); }
    public String keepProductId_ExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("productId_ExistsReferrer_MLocationReplenishProductList", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_ExistsReferrer_MProductShapeList() { return xgetSQueMap("productId_ExistsReferrer_MProductShapeList"); }
    public String keepProductId_ExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_ExistsReferrer_MProductShapeList", sq); }

    public Map<String, MSetParentCQ> xdfgetProductId_ExistsReferrer_MSetParentAsOne() { return xgetSQueMap("productId_ExistsReferrer_MSetParentAsOne"); }
    public String keepProductId_ExistsReferrer_MSetParentAsOne(MSetParentCQ sq) { return xkeepSQue("productId_ExistsReferrer_MSetParentAsOne", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_ExistsReferrer_MSetStructureList() { return xgetSQueMap("productId_ExistsReferrer_MSetStructureList"); }
    public String keepProductId_ExistsReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_ExistsReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_ExistsReferrer_TAllocInstBList() { return xgetSQueMap("productId_ExistsReferrer_TAllocInstBList"); }
    public String keepProductId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_ExistsReferrer_TAllocLotList() { return xgetSQueMap("productId_ExistsReferrer_TAllocLotList"); }
    public String keepProductId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("productId_ExistsReferrer_TInventoryBList"); }
    public String keepProductId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_ExistsReferrer_TKeepingLotList() { return xgetSQueMap("productId_ExistsReferrer_TKeepingLotList"); }
    public String keepProductId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_ExistsReferrer_TLastLotList() { return xgetSQueMap("productId_ExistsReferrer_TLastLotList"); }
    public String keepProductId_ExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_ExistsReferrer_TLotList() { return xgetSQueMap("productId_ExistsReferrer_TLotList"); }
    public String keepProductId_ExistsReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_ExistsReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_ExistsReferrer_TMoveInstBList() { return xgetSQueMap("productId_ExistsReferrer_TMoveInstBList"); }
    public String keepProductId_ExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetProductId_ExistsReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("productId_ExistsReferrer_TNizoroeAlarmLogList"); }
    public String keepProductId_ExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("productId_ExistsReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TOperationLogCQ> xdfgetProductId_ExistsReferrer_TOperationLogList() { return xgetSQueMap("productId_ExistsReferrer_TOperationLogList"); }
    public String keepProductId_ExistsReferrer_TOperationLogList(TOperationLogCQ sq) { return xkeepSQue("productId_ExistsReferrer_TOperationLogList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_ExistsReferrer_TReceivePlanBList() { return xgetSQueMap("productId_ExistsReferrer_TReceivePlanBList"); }
    public String keepProductId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("productId_ExistsReferrer_TSerialNoList"); }
    public String keepProductId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("productId_ExistsReferrer_TShippingInstBList"); }
    public String keepProductId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_ExistsReferrer_TStockList() { return xgetSQueMap("productId_ExistsReferrer_TStockList"); }
    public String keepProductId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStockBookCQ> xdfgetProductId_ExistsReferrer_TStockBookList() { return xgetSQueMap("productId_ExistsReferrer_TStockBookList"); }
    public String keepProductId_ExistsReferrer_TStockBookList(TStockBookCQ sq) { return xkeepSQue("productId_ExistsReferrer_TStockBookList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetProductId_ExistsReferrer_WHtPickingList() { return xgetSQueMap("productId_ExistsReferrer_WHtPickingList"); }
    public String keepProductId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepProductId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("productId_ExistsReferrer_WHtShippingList"); }
    public String keepProductId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepProductId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetProductId_ExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("productId_ExistsReferrer_WHtTotalPickingList"); }
    public String keepProductId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("productId_ExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepProductId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("productId_ExistsReferrer_WShippingInterruptList"); }
    public String keepProductId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, HStockBookCQ> xdfgetProductId_NotExistsReferrer_HStockBookList() { return xgetSQueMap("productId_NotExistsReferrer_HStockBookList"); }
    public String keepProductId_NotExistsReferrer_HStockBookList(HStockBookCQ sq) { return xkeepSQue("productId_NotExistsReferrer_HStockBookList", sq); }

    public Map<String, MDepositProductCQ> xdfgetProductId_NotExistsReferrer_MDepositProductList() { return xgetSQueMap("productId_NotExistsReferrer_MDepositProductList"); }
    public String keepProductId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MDepositProductList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_NotExistsReferrer_MLocationList() { return xgetSQueMap("productId_NotExistsReferrer_MLocationList"); }
    public String keepProductId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetProductId_NotExistsReferrer_MLocationReplenishProductList() { return xgetSQueMap("productId_NotExistsReferrer_MLocationReplenishProductList"); }
    public String keepProductId_NotExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MLocationReplenishProductList", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_NotExistsReferrer_MProductShapeList() { return xgetSQueMap("productId_NotExistsReferrer_MProductShapeList"); }
    public String keepProductId_NotExistsReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MProductShapeList", sq); }

    public Map<String, MSetParentCQ> xdfgetProductId_NotExistsReferrer_MSetParentAsOne() { return xgetSQueMap("productId_NotExistsReferrer_MSetParentAsOne"); }
    public String keepProductId_NotExistsReferrer_MSetParentAsOne(MSetParentCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MSetParentAsOne", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_NotExistsReferrer_MSetStructureList() { return xgetSQueMap("productId_NotExistsReferrer_MSetStructureList"); }
    public String keepProductId_NotExistsReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_NotExistsReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_NotExistsReferrer_TAllocInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TAllocInstBList"); }
    public String keepProductId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_NotExistsReferrer_TAllocLotList() { return xgetSQueMap("productId_NotExistsReferrer_TAllocLotList"); }
    public String keepProductId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("productId_NotExistsReferrer_TInventoryBList"); }
    public String keepProductId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_NotExistsReferrer_TKeepingLotList() { return xgetSQueMap("productId_NotExistsReferrer_TKeepingLotList"); }
    public String keepProductId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_NotExistsReferrer_TLastLotList() { return xgetSQueMap("productId_NotExistsReferrer_TLastLotList"); }
    public String keepProductId_NotExistsReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_NotExistsReferrer_TLotList() { return xgetSQueMap("productId_NotExistsReferrer_TLotList"); }
    public String keepProductId_NotExistsReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_NotExistsReferrer_TMoveInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TMoveInstBList"); }
    public String keepProductId_NotExistsReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TMoveInstBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetProductId_NotExistsReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("productId_NotExistsReferrer_TNizoroeAlarmLogList"); }
    public String keepProductId_NotExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TOperationLogCQ> xdfgetProductId_NotExistsReferrer_TOperationLogList() { return xgetSQueMap("productId_NotExistsReferrer_TOperationLogList"); }
    public String keepProductId_NotExistsReferrer_TOperationLogList(TOperationLogCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TOperationLogList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_NotExistsReferrer_TReceivePlanBList() { return xgetSQueMap("productId_NotExistsReferrer_TReceivePlanBList"); }
    public String keepProductId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("productId_NotExistsReferrer_TSerialNoList"); }
    public String keepProductId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("productId_NotExistsReferrer_TShippingInstBList"); }
    public String keepProductId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_NotExistsReferrer_TStockList() { return xgetSQueMap("productId_NotExistsReferrer_TStockList"); }
    public String keepProductId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStockBookCQ> xdfgetProductId_NotExistsReferrer_TStockBookList() { return xgetSQueMap("productId_NotExistsReferrer_TStockBookList"); }
    public String keepProductId_NotExistsReferrer_TStockBookList(TStockBookCQ sq) { return xkeepSQue("productId_NotExistsReferrer_TStockBookList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetProductId_NotExistsReferrer_WHtPickingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtPickingList"); }
    public String keepProductId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepProductId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtShippingList"); }
    public String keepProductId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepProductId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetProductId_NotExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("productId_NotExistsReferrer_WHtTotalPickingList"); }
    public String keepProductId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepProductId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("productId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepProductId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, HStockBookCQ> xdfgetProductId_SpecifyDerivedReferrer_HStockBookList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_HStockBookList"); }
    public String keepProductId_SpecifyDerivedReferrer_HStockBookList(HStockBookCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_HStockBookList", sq); }

    public Map<String, MDepositProductCQ> xdfgetProductId_SpecifyDerivedReferrer_MDepositProductList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MDepositProductList"); }
    public String keepProductId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MDepositProductList", sq); }

    public Map<String, MLocationCQ> xdfgetProductId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepProductId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MLocationReplenishProductCQ> xdfgetProductId_SpecifyDerivedReferrer_MLocationReplenishProductList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MLocationReplenishProductList"); }
    public String keepProductId_SpecifyDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MLocationReplenishProductList", sq); }

    public Map<String, MProductShapeCQ> xdfgetProductId_SpecifyDerivedReferrer_MProductShapeList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MProductShapeList"); }
    public String keepProductId_SpecifyDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MProductShapeList", sq); }

    public Map<String, MSetStructureCQ> xdfgetProductId_SpecifyDerivedReferrer_MSetStructureList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_MSetStructureList"); }
    public String keepProductId_SpecifyDerivedReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_MSetStructureList", sq); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TAllocInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TAllocInstBList", sq); }

    public Map<String, TAllocLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TAllocLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TAllocLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TAllocLotList", sq); }

    public Map<String, TInventoryBCQ> xdfgetProductId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TKeepingLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TKeepingLotList", sq); }

    public Map<String, TLastLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TLastLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TLastLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TLastLotList", sq); }

    public Map<String, TLotCQ> xdfgetProductId_SpecifyDerivedReferrer_TLotList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TLotList"); }
    public String keepProductId_SpecifyDerivedReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TLotList", sq); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TMoveInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TMoveInstBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetProductId_SpecifyDerivedReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepProductId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TOperationLogCQ> xdfgetProductId_SpecifyDerivedReferrer_TOperationLogList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TOperationLogList"); }
    public String keepProductId_SpecifyDerivedReferrer_TOperationLogList(TOperationLogCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TOperationLogList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_SpecifyDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TReceivePlanBList", sq); }

    public Map<String, TSerialNoCQ> xdfgetProductId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepProductId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TStockCQ> xdfgetProductId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TStockList"); }
    public String keepProductId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStockBookCQ> xdfgetProductId_SpecifyDerivedReferrer_TStockBookList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_TStockBookList"); }
    public String keepProductId_SpecifyDerivedReferrer_TStockBookList(TStockBookCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_TStockBookList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtPickingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtPickingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtPickingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtShippingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetProductId_SpecifyDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WHtTotalPickingList"); }
    public String keepProductId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("productId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, HStockBookCQ> xdfgetProductId_QueryDerivedReferrer_HStockBookList() { return xgetSQueMap("productId_QueryDerivedReferrer_HStockBookList"); }
    public String keepProductId_QueryDerivedReferrer_HStockBookList(HStockBookCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_HStockBookList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_HStockBookListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_HStockBookList"); }
    public String keepProductId_QueryDerivedReferrer_HStockBookListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_HStockBookList", pm); }

    public Map<String, MDepositProductCQ> xdfgetProductId_QueryDerivedReferrer_MDepositProductList() { return xgetSQueMap("productId_QueryDerivedReferrer_MDepositProductList"); }
    public String keepProductId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MDepositProductList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MDepositProductListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MDepositProductList"); }
    public String keepProductId_QueryDerivedReferrer_MDepositProductListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MDepositProductList", pm); }

    public Map<String, MLocationCQ> xdfgetProductId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("productId_QueryDerivedReferrer_MLocationList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MLocationList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MLocationReplenishProductCQ> xdfgetProductId_QueryDerivedReferrer_MLocationReplenishProductList() { return xgetSQueMap("productId_QueryDerivedReferrer_MLocationReplenishProductList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MLocationReplenishProductList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MLocationReplenishProductListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MLocationReplenishProductList"); }
    public String keepProductId_QueryDerivedReferrer_MLocationReplenishProductListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MLocationReplenishProductList", pm); }

    public Map<String, MProductShapeCQ> xdfgetProductId_QueryDerivedReferrer_MProductShapeList() { return xgetSQueMap("productId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepProductId_QueryDerivedReferrer_MProductShapeList(MProductShapeCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MProductShapeList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MProductShapeListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MProductShapeList"); }
    public String keepProductId_QueryDerivedReferrer_MProductShapeListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MProductShapeList", pm); }

    public Map<String, MSetStructureCQ> xdfgetProductId_QueryDerivedReferrer_MSetStructureList() { return xgetSQueMap("productId_QueryDerivedReferrer_MSetStructureList"); }
    public String keepProductId_QueryDerivedReferrer_MSetStructureList(MSetStructureCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_MSetStructureList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_MSetStructureListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_MSetStructureList"); }
    public String keepProductId_QueryDerivedReferrer_MSetStructureListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_MSetStructureList", pm); }

    public Map<String, TAllocInstBCQ> xdfgetProductId_QueryDerivedReferrer_TAllocInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TAllocInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TAllocInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TAllocInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TAllocInstBList", pm); }

    public Map<String, TAllocLotCQ> xdfgetProductId_QueryDerivedReferrer_TAllocLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TAllocLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TAllocLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TAllocLotList"); }
    public String keepProductId_QueryDerivedReferrer_TAllocLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TAllocLotList", pm); }

    public Map<String, TInventoryBCQ> xdfgetProductId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepProductId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepProductId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TInventoryBList", pm); }

    public Map<String, TKeepingLotCQ> xdfgetProductId_QueryDerivedReferrer_TKeepingLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TKeepingLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TKeepingLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TKeepingLotList"); }
    public String keepProductId_QueryDerivedReferrer_TKeepingLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TKeepingLotList", pm); }

    public Map<String, TLastLotCQ> xdfgetProductId_QueryDerivedReferrer_TLastLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TLastLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TLastLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TLastLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TLastLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLastLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TLastLotList", pm); }

    public Map<String, TLotCQ> xdfgetProductId_QueryDerivedReferrer_TLotList() { return xgetSQueMap("productId_QueryDerivedReferrer_TLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLotList(TLotCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TLotList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TLotListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TLotList"); }
    public String keepProductId_QueryDerivedReferrer_TLotListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TLotList", pm); }

    public Map<String, TMoveInstBCQ> xdfgetProductId_QueryDerivedReferrer_TMoveInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBList(TMoveInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TMoveInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TMoveInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TMoveInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TMoveInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TMoveInstBList", pm); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetProductId_QueryDerivedReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("productId_QueryDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TNizoroeAlarmLogList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepProductId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TNizoroeAlarmLogList", pm); }

    public Map<String, TOperationLogCQ> xdfgetProductId_QueryDerivedReferrer_TOperationLogList() { return xgetSQueMap("productId_QueryDerivedReferrer_TOperationLogList"); }
    public String keepProductId_QueryDerivedReferrer_TOperationLogList(TOperationLogCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TOperationLogList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TOperationLogListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TOperationLogList"); }
    public String keepProductId_QueryDerivedReferrer_TOperationLogListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TOperationLogList", pm); }

    public Map<String, TReceivePlanBCQ> xdfgetProductId_QueryDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TReceivePlanBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TReceivePlanBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepProductId_QueryDerivedReferrer_TReceivePlanBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TReceivePlanBList", pm); }

    public Map<String, TSerialNoCQ> xdfgetProductId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("productId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepProductId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepProductId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetProductId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("productId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepProductId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TStockCQ> xdfgetProductId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("productId_QueryDerivedReferrer_TStockList"); }
    public String keepProductId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TStockList"); }
    public String keepProductId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStockBookCQ> xdfgetProductId_QueryDerivedReferrer_TStockBookList() { return xgetSQueMap("productId_QueryDerivedReferrer_TStockBookList"); }
    public String keepProductId_QueryDerivedReferrer_TStockBookList(TStockBookCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_TStockBookList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_TStockBookListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_TStockBookList"); }
    public String keepProductId_QueryDerivedReferrer_TStockBookListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_TStockBookList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetProductId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepProductId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtPickingCQ> xdfgetProductId_QueryDerivedReferrer_WHtPickingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtPickingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtPickingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtPickingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtPickingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetProductId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepProductId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtShippingCQ> xdfgetProductId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetProductId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WHtTotalPickingCQ> xdfgetProductId_QueryDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("productId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WHtTotalPickingList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WHtTotalPickingListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepProductId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WHtTotalPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetProductId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("productId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepProductId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetProductId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("productId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("productId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetProductId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("productId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepProductId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("productId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {NotNull, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _productAbbr;
    public ConditionValue xdfgetProductAbbr()
    { if (_productAbbr == null) { _productAbbr = nCV(); }
      return _productAbbr; }
    protected ConditionValue xgetCValueProductAbbr() { return xdfgetProductAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductAbbr_Asc() { regOBA("PRODUCT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductAbbr_Desc() { regOBD("PRODUCT_ABBR"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _lotManagFlg;
    public ConditionValue xdfgetLotManagFlg()
    { if (_lotManagFlg == null) { _lotManagFlg = nCV(); }
      return _lotManagFlg; }
    protected ConditionValue xgetCValueLotManagFlg() { return xdfgetLotManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotManagFlg_Asc() { regOBA("LOT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotManagFlg_Desc() { regOBD("LOT_MANAG_FLG"); return this; }

    protected ConditionValue _limitDtManagFlg;
    public ConditionValue xdfgetLimitDtManagFlg()
    { if (_limitDtManagFlg == null) { _limitDtManagFlg = nCV(); }
      return _limitDtManagFlg; }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return xdfgetLimitDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtManagFlg_Asc() { regOBA("LIMIT_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtManagFlg_Desc() { regOBD("LIMIT_DT_MANAG_FLG"); return this; }

    protected ConditionValue _receiveLimitNum;
    public ConditionValue xdfgetReceiveLimitNum()
    { if (_receiveLimitNum == null) { _receiveLimitNum = nCV(); }
      return _receiveLimitNum; }
    protected ConditionValue xgetCValueReceiveLimitNum() { return xdfgetReceiveLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ReceiveLimitNum_Asc() { regOBA("RECEIVE_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ReceiveLimitNum_Desc() { regOBD("RECEIVE_LIMIT_NUM"); return this; }

    protected ConditionValue _shippingLimitNum;
    public ConditionValue xdfgetShippingLimitNum()
    { if (_shippingLimitNum == null) { _shippingLimitNum = nCV(); }
      return _shippingLimitNum; }
    protected ConditionValue xgetCValueShippingLimitNum() { return xdfgetShippingLimitNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingLimitNum_Asc() { regOBA("SHIPPING_LIMIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingLimitNum_Desc() { regOBD("SHIPPING_LIMIT_NUM"); return this; }

    protected ConditionValue _mergeCls;
    public ConditionValue xdfgetMergeCls()
    { if (_mergeCls == null) { _mergeCls = nCV(); }
      return _mergeCls; }
    protected ConditionValue xgetCValueMergeCls() { return xdfgetMergeCls(); }

    /**
     * Add order-by as ascend. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_MergeCls_Asc() { regOBA("MERGE_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_MergeCls_Desc() { regOBD("MERGE_CLS"); return this; }

    protected ConditionValue _lotReverseFlg;
    public ConditionValue xdfgetLotReverseFlg()
    { if (_lotReverseFlg == null) { _lotReverseFlg = nCV(); }
      return _lotReverseFlg; }
    protected ConditionValue xgetCValueLotReverseFlg() { return xdfgetLotReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotReverseFlg_Asc() { regOBA("LOT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LotReverseFlg_Desc() { regOBD("LOT_REVERSE_FLG"); return this; }

    protected ConditionValue _limitDtReverseFlg;
    public ConditionValue xdfgetLimitDtReverseFlg()
    { if (_limitDtReverseFlg == null) { _limitDtReverseFlg = nCV(); }
      return _limitDtReverseFlg; }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return xdfgetLimitDtReverseFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtReverseFlg_Asc() { regOBA("LIMIT_DT_REVERSE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LimitDtReverseFlg_Desc() { regOBD("LIMIT_DT_REVERSE_FLG"); return this; }

    protected ConditionValue _shippingStopFlg;
    public ConditionValue xdfgetShippingStopFlg()
    { if (_shippingStopFlg == null) { _shippingStopFlg = nCV(); }
      return _shippingStopFlg; }
    protected ConditionValue xgetCValueShippingStopFlg() { return xdfgetShippingStopFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingStopFlg_Asc() { regOBA("SHIPPING_STOP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShippingStopFlg_Desc() { regOBD("SHIPPING_STOP_FLG"); return this; }

    protected ConditionValue _fixedPoint;
    public ConditionValue xdfgetFixedPoint()
    { if (_fixedPoint == null) { _fixedPoint = nCV(); }
      return _fixedPoint; }
    protected ConditionValue xgetCValueFixedPoint() { return xdfgetFixedPoint(); }

    /**
     * Add order-by as ascend. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FixedPoint_Asc() { regOBA("FIXED_POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * FIXED_POINT: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FixedPoint_Desc() { regOBD("FIXED_POINT"); return this; }

    protected ConditionValue _shapeGrpId;
    public ConditionValue xdfgetShapeGrpId()
    { if (_shapeGrpId == null) { _shapeGrpId = nCV(); }
      return _shapeGrpId; }
    protected ConditionValue xgetCValueShapeGrpId() { return xdfgetShapeGrpId(); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_InScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_InScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_InScopeRelation_MShapeGrp", sq); }

    public Map<String, MShapeGrpCQ> getShapeGrpId_NotInScopeRelation_MShapeGrp() { return xgetSQueMap("shapeGrpId_NotInScopeRelation_MShapeGrp"); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq) { return xkeepSQue("shapeGrpId_NotInScopeRelation_MShapeGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

    protected ConditionValue _nmfcCode;
    public ConditionValue xdfgetNmfcCode()
    { if (_nmfcCode == null) { _nmfcCode = nCV(); }
      return _nmfcCode; }
    protected ConditionValue xgetCValueNmfcCode() { return xdfgetNmfcCode(); }

    /**
     * Add order-by as ascend. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NmfcCode_Asc() { regOBA("NMFC_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * NMFC_CODE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NmfcCode_Desc() { regOBD("NMFC_CODE"); return this; }

    protected ConditionValue _freightCls;
    public ConditionValue xdfgetFreightCls()
    { if (_freightCls == null) { _freightCls = nCV(); }
      return _freightCls; }
    protected ConditionValue xgetCValueFreightCls() { return xdfgetFreightCls(); }

    /**
     * Add order-by as ascend. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FreightCls_Asc() { regOBA("FREIGHT_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FreightCls_Desc() { regOBD("FREIGHT_CLS"); return this; }

    protected ConditionValue _counntryOfOrigin;
    public ConditionValue xdfgetCounntryOfOrigin()
    { if (_counntryOfOrigin == null) { _counntryOfOrigin = nCV(); }
      return _counntryOfOrigin; }
    protected ConditionValue xgetCValueCounntryOfOrigin() { return xdfgetCounntryOfOrigin(); }

    /**
     * Add order-by as ascend. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CounntryOfOrigin_Asc() { regOBA("COUNNTRY_OF_ORIGIN"); return this; }

    /**
     * Add order-by as descend. <br>
     * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CounntryOfOrigin_Desc() { regOBD("COUNNTRY_OF_ORIGIN"); return this; }

    protected ConditionValue _unitVal;
    public ConditionValue xdfgetUnitVal()
    { if (_unitVal == null) { _unitVal = nCV(); }
      return _unitVal; }
    protected ConditionValue xgetCValueUnitVal() { return xdfgetUnitVal(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitVal_Asc() { regOBA("UNIT_VAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_VAL: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitVal_Desc() { regOBD("UNIT_VAL"); return this; }

    protected ConditionValue _htsCd;
    public ConditionValue xdfgetHtsCd()
    { if (_htsCd == null) { _htsCd = nCV(); }
      return _htsCd; }
    protected ConditionValue xgetCValueHtsCd() { return xdfgetHtsCd(); }

    /**
     * Add order-by as ascend. <br>
     * HTS_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HtsCd_Asc() { regOBA("HTS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HTS_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HtsCd_Desc() { regOBD("HTS_CD"); return this; }

    protected ConditionValue _productCategoryCls;
    public ConditionValue xdfgetProductCategoryCls()
    { if (_productCategoryCls == null) { _productCategoryCls = nCV(); }
      return _productCategoryCls; }
    protected ConditionValue xgetCValueProductCategoryCls() { return xdfgetProductCategoryCls(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCategoryCls_Asc() { regOBA("PRODUCT_CATEGORY_CLS"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProductCategoryCls_Desc() { regOBD("PRODUCT_CATEGORY_CLS"); return this; }

    protected ConditionValue _prodDtManagFlg;
    public ConditionValue xdfgetProdDtManagFlg()
    { if (_prodDtManagFlg == null) { _prodDtManagFlg = nCV(); }
      return _prodDtManagFlg; }
    protected ConditionValue xgetCValueProdDtManagFlg() { return xdfgetProdDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtManagFlg_Asc() { regOBA("PROD_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtManagFlg_Desc() { regOBD("PROD_DT_MANAG_FLG"); return this; }

    protected ConditionValue _prodDtLimitDaysRcv;
    public ConditionValue xdfgetProdDtLimitDaysRcv()
    { if (_prodDtLimitDaysRcv == null) { _prodDtLimitDaysRcv = nCV(); }
      return _prodDtLimitDaysRcv; }
    protected ConditionValue xgetCValueProdDtLimitDaysRcv() { return xdfgetProdDtLimitDaysRcv(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtLimitDaysRcv_Asc() { regOBA("PROD_DT_LIMIT_DAYS_RCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtLimitDaysRcv_Desc() { regOBD("PROD_DT_LIMIT_DAYS_RCV"); return this; }

    protected ConditionValue _prodDtLimitDaysShp;
    public ConditionValue xdfgetProdDtLimitDaysShp()
    { if (_prodDtLimitDaysShp == null) { _prodDtLimitDaysShp = nCV(); }
      return _prodDtLimitDaysShp; }
    protected ConditionValue xgetCValueProdDtLimitDaysShp() { return xdfgetProdDtLimitDaysShp(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtLimitDaysShp_Asc() { regOBA("PROD_DT_LIMIT_DAYS_SHP"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ProdDtLimitDaysShp_Desc() { regOBD("PROD_DT_LIMIT_DAYS_SHP"); return this; }

    protected ConditionValue _serialManagFlg;
    public ConditionValue xdfgetSerialManagFlg()
    { if (_serialManagFlg == null) { _serialManagFlg = nCV(); }
      return _serialManagFlg; }
    protected ConditionValue xgetCValueSerialManagFlg() { return xdfgetSerialManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SerialManagFlg_Asc() { regOBA("SERIAL_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_SerialManagFlg_Desc() { regOBD("SERIAL_MANAG_FLG"); return this; }

    protected ConditionValue _ocrDateFormat;
    public ConditionValue xdfgetOcrDateFormat()
    { if (_ocrDateFormat == null) { _ocrDateFormat = nCV(); }
      return _ocrDateFormat; }
    protected ConditionValue xgetCValueOcrDateFormat() { return xdfgetOcrDateFormat(); }

    /**
     * Add order-by as ascend. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_OcrDateFormat_Asc() { regOBA("OCR_DATE_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_OcrDateFormat_Desc() { regOBD("OCR_DATE_FORMAT"); return this; }

    protected ConditionValue _insuranceFlg;
    public ConditionValue xdfgetInsuranceFlg()
    { if (_insuranceFlg == null) { _insuranceFlg = nCV(); }
      return _insuranceFlg; }
    protected ConditionValue xgetCValueInsuranceFlg() { return xdfgetInsuranceFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_InsuranceFlg_Asc() { regOBA("INSURANCE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_InsuranceFlg_Desc() { regOBD("INSURANCE_FLG"); return this; }

    protected ConditionValue _noOkinawaFlightFlg;
    public ConditionValue xdfgetNoOkinawaFlightFlg()
    { if (_noOkinawaFlightFlg == null) { _noOkinawaFlightFlg = nCV(); }
      return _noOkinawaFlightFlg; }
    protected ConditionValue xgetCValueNoOkinawaFlightFlg() { return xdfgetNoOkinawaFlightFlg(); }

    /**
     * Add order-by as ascend. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NoOkinawaFlightFlg_Asc() { regOBA("NO_OKINAWA_FLIGHT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_NoOkinawaFlightFlg_Desc() { regOBD("NO_OKINAWA_FLIGHT_FLG"); return this; }

    protected ConditionValue _heavyItemFlg;
    public ConditionValue xdfgetHeavyItemFlg()
    { if (_heavyItemFlg == null) { _heavyItemFlg = nCV(); }
      return _heavyItemFlg; }
    protected ConditionValue xgetCValueHeavyItemFlg() { return xdfgetHeavyItemFlg(); }

    /**
     * Add order-by as ascend. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HeavyItemFlg_Asc() { regOBA("HEAVY_ITEM_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HeavyItemFlg_Desc() { regOBD("HEAVY_ITEM_FLG"); return this; }

    protected ConditionValue _largeItemFlg;
    public ConditionValue xdfgetLargeItemFlg()
    { if (_largeItemFlg == null) { _largeItemFlg = nCV(); }
      return _largeItemFlg; }
    protected ConditionValue xgetCValueLargeItemFlg() { return xdfgetLargeItemFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LargeItemFlg_Asc() { regOBA("LARGE_ITEM_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LargeItemFlg_Desc() { regOBD("LARGE_ITEM_FLG"); return this; }

    protected ConditionValue _hinmokuGroupCd;
    public ConditionValue xdfgetHinmokuGroupCd()
    { if (_hinmokuGroupCd == null) { _hinmokuGroupCd = nCV(); }
      return _hinmokuGroupCd; }
    protected ConditionValue xgetCValueHinmokuGroupCd() { return xdfgetHinmokuGroupCd(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HinmokuGroupCd_Asc() { regOBA("HINMOKU_GROUP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_HinmokuGroupCd_Desc() { regOBD("HINMOKU_GROUP_CD"); return this; }

    protected ConditionValue _caseTypeCd;
    public ConditionValue xdfgetCaseTypeCd()
    { if (_caseTypeCd == null) { _caseTypeCd = nCV(); }
      return _caseTypeCd; }
    protected ConditionValue xgetCValueCaseTypeCd() { return xdfgetCaseTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CaseTypeCd_Asc() { regOBA("CASE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CaseTypeCd_Desc() { regOBD("CASE_TYPE_CD"); return this; }

    protected ConditionValue _evaluationUnitPrice;
    public ConditionValue xdfgetEvaluationUnitPrice()
    { if (_evaluationUnitPrice == null) { _evaluationUnitPrice = nCV(); }
      return _evaluationUnitPrice; }
    protected ConditionValue xgetCValueEvaluationUnitPrice() { return xdfgetEvaluationUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_EvaluationUnitPrice_Asc() { regOBA("EVALUATION_UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_EvaluationUnitPrice_Desc() { regOBD("EVALUATION_UNIT_PRICE"); return this; }

    protected ConditionValue _logiSpecialTypeCd;
    public ConditionValue xdfgetLogiSpecialTypeCd()
    { if (_logiSpecialTypeCd == null) { _logiSpecialTypeCd = nCV(); }
      return _logiSpecialTypeCd; }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return xdfgetLogiSpecialTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

    protected ConditionValue _logiAttentionTypeCd;
    public ConditionValue xdfgetLogiAttentionTypeCd()
    { if (_logiAttentionTypeCd == null) { _logiAttentionTypeCd = nCV(); }
      return _logiAttentionTypeCd; }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return xdfgetLogiAttentionTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _oldJanCd;
    public ConditionValue xdfgetOldJanCd()
    { if (_oldJanCd == null) { _oldJanCd = nCV(); }
      return _oldJanCd; }
    protected ConditionValue xgetCValueOldJanCd() { return xdfgetOldJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_OldJanCd_Asc() { regOBA("OLD_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_OldJanCd_Desc() { regOBD("OLD_JAN_CD"); return this; }

    protected ConditionValue _recomendLocationCd;
    public ConditionValue xdfgetRecomendLocationCd()
    { if (_recomendLocationCd == null) { _recomendLocationCd = nCV(); }
      return _recomendLocationCd; }
    protected ConditionValue xgetCValueRecomendLocationCd() { return xdfgetRecomendLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_RecomendLocationCd_Asc() { regOBA("RECOMEND_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECOMEND_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_RecomendLocationCd_Desc() { regOBD("RECOMEND_LOCATION_CD"); return this; }

    protected ConditionValue _recomendLocationTypeCd;
    public ConditionValue xdfgetRecomendLocationTypeCd()
    { if (_recomendLocationTypeCd == null) { _recomendLocationTypeCd = nCV(); }
      return _recomendLocationTypeCd; }
    protected ConditionValue xgetCValueRecomendLocationTypeCd() { return xdfgetRecomendLocationTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_RecomendLocationTypeCd_Asc() { regOBA("RECOMEND_LOCATION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_RecomendLocationTypeCd_Desc() { regOBD("RECOMEND_LOCATION_TYPE_CD"); return this; }

    protected ConditionValue _innerJanCd;
    public ConditionValue xdfgetInnerJanCd()
    { if (_innerJanCd == null) { _innerJanCd = nCV(); }
      return _innerJanCd; }
    protected ConditionValue xgetCValueInnerJanCd() { return xdfgetInnerJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_InnerJanCd_Asc() { regOBA("INNER_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * INNER_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_InnerJanCd_Desc() { regOBD("INNER_JAN_CD"); return this; }

    protected ConditionValue _createDate;
    public ConditionValue xdfgetCreateDate()
    { if (_createDate == null) { _createDate = nCV(); }
      return _createDate; }
    protected ConditionValue xgetCValueCreateDate() { return xdfgetCreateDate(); }

    /**
     * Add order-by as ascend. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CreateDate_Asc() { regOBA("CREATE_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATE_DATE: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CreateDate_Desc() { regOBD("CREATE_DATE"); return this; }

    protected ConditionValue _createTime;
    public ConditionValue xdfgetCreateTime()
    { if (_createTime == null) { _createTime = nCV(); }
      return _createTime; }
    protected ConditionValue xgetCValueCreateTime() { return xdfgetCreateTime(); }

    /**
     * Add order-by as ascend. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CreateTime_Asc() { regOBA("CREATE_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * CREATE_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_CreateTime_Desc() { regOBD("CREATE_TIME"); return this; }

    protected ConditionValue _floorRefStockNum;
    public ConditionValue xdfgetFloorRefStockNum()
    { if (_floorRefStockNum == null) { _floorRefStockNum = nCV(); }
      return _floorRefStockNum; }
    protected ConditionValue xgetCValueFloorRefStockNum() { return xdfgetFloorRefStockNum(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FloorRefStockNum_Asc() { regOBA("FLOOR_REF_STOCK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_FloorRefStockNum_Desc() { regOBD("FLOOR_REF_STOCK_NUM"); return this; }

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
    public BsMProductCQ addOrderBy_WmSendFlg_Asc() { regOBA("WM_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_WmSendFlg_Desc() { regOBD("WM_SEND_FLG"); return this; }

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
    public BsMProductCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

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
    public BsMProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MProductCQ bq = (MProductCQ)bqs;
        MProductCQ uq = (MProductCQ)uqs;
        if (bq.hasConditionQueryMShapeGrp()) {
            uq.queryMShapeGrp().reflectRelationOnUnionQuery(bq.queryMShapeGrp(), uq.queryMShapeGrp());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtManagFlg()) {
            uq.queryBClassDtlByLimitDtManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtManagFlg(), uq.queryBClassDtlByLimitDtManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLimitDtReverseFlg()) {
            uq.queryBClassDtlByLimitDtReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLimitDtReverseFlg(), uq.queryBClassDtlByLimitDtReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotManagFlg()) {
            uq.queryBClassDtlByLotManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotManagFlg(), uq.queryBClassDtlByLotManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLotReverseFlg()) {
            uq.queryBClassDtlByLotReverseFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLotReverseFlg(), uq.queryBClassDtlByLotReverseFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMergeCls()) {
            uq.queryBClassDtlByMergeCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByMergeCls(), uq.queryBClassDtlByMergeCls());
        }
        if (bq.hasConditionQueryBClassDtlByShippingStopFlg()) {
            uq.queryBClassDtlByShippingStopFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingStopFlg(), uq.queryBClassDtlByShippingStopFlg());
        }
        if (bq.hasConditionQueryBClassDtlByFreightCls()) {
            uq.queryBClassDtlByFreightCls().reflectRelationOnUnionQuery(bq.queryBClassDtlByFreightCls(), uq.queryBClassDtlByFreightCls());
        }
        if (bq.hasConditionQueryBClassDtlByProdDtManagFlg()) {
            uq.queryBClassDtlByProdDtManagFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByProdDtManagFlg(), uq.queryBClassDtlByProdDtManagFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLogiSpecialTypeCd()) {
            uq.queryBClassDtlByLogiSpecialTypeCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByLogiSpecialTypeCd(), uq.queryBClassDtlByLogiSpecialTypeCd());
        }
        if (bq.hasConditionQueryBClassDtlByOcrDateFormat()) {
            uq.queryBClassDtlByOcrDateFormat().reflectRelationOnUnionQuery(bq.queryBClassDtlByOcrDateFormat(), uq.queryBClassDtlByOcrDateFormat());
        }
        if (bq.hasConditionQueryBClassDtlByInsuranceFlg()) {
            uq.queryBClassDtlByInsuranceFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInsuranceFlg(), uq.queryBClassDtlByInsuranceFlg());
        }
        if (bq.hasConditionQueryBClassDtlByNoOkinawaFlightFlg()) {
            uq.queryBClassDtlByNoOkinawaFlightFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByNoOkinawaFlightFlg(), uq.queryBClassDtlByNoOkinawaFlightFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLogiAttentionTypeCd()) {
            uq.queryBClassDtlByLogiAttentionTypeCd().reflectRelationOnUnionQuery(bq.queryBClassDtlByLogiAttentionTypeCd(), uq.queryBClassDtlByLogiAttentionTypeCd());
        }
        if (bq.hasConditionQueryBClassDtlByHeavyItemFlg()) {
            uq.queryBClassDtlByHeavyItemFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByHeavyItemFlg(), uq.queryBClassDtlByHeavyItemFlg());
        }
        if (bq.hasConditionQueryBClassDtlByLargeItemFlg()) {
            uq.queryBClassDtlByLargeItemFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByLargeItemFlg(), uq.queryBClassDtlByLargeItemFlg());
        }
        if (bq.hasConditionQueryMSetParentAsOne()) {
            uq.queryMSetParentAsOne().reflectRelationOnUnionQuery(bq.queryMSetParentAsOne(), uq.queryMSetParentAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public MShapeGrpCQ queryMShapeGrp() {
        return xdfgetConditionQueryMShapeGrp();
    }
    public MShapeGrpCQ xdfgetConditionQueryMShapeGrp() {
        String prop = "mShapeGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMShapeGrp()); xsetupOuterJoinMShapeGrp(); }
        return xgetQueRlMap(prop);
    }
    protected MShapeGrpCQ xcreateQueryMShapeGrp() {
        String nrp = xresolveNRP("m_product", "mShapeGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShapeGrp", nrp);
    }
    protected void xsetupOuterJoinMShapeGrp() { xregOutJo("mShapeGrp"); }
    public boolean hasConditionQueryMShapeGrp() { return xhasQueRlMap("mShapeGrp"); }

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
        String nrp = xresolveNRP("m_product", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

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
        String nrp = xresolveNRP("m_product", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtManagFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtManagFlg() {
        String prop = "bClassDtlByLimitDtManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtManagFlg()); xsetupOuterJoinBClassDtlByLimitDtManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtManagFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLimitDtManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtManagFlg() { xregOutJo("bClassDtlByLimitDtManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtManagFlg() { return xhasQueRlMap("bClassDtlByLimitDtManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLimitDtReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLimitDtReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLimitDtReverseFlg() {
        String prop = "bClassDtlByLimitDtReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLimitDtReverseFlg()); xsetupOuterJoinBClassDtlByLimitDtReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLimitDtReverseFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLimitDtReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLimitDtReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLimitDtReverseFlg() { xregOutJo("bClassDtlByLimitDtReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLimitDtReverseFlg() { return xhasQueRlMap("bClassDtlByLimitDtReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotManagFlg() {
        return xdfgetConditionQueryBClassDtlByLotManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotManagFlg() {
        String prop = "bClassDtlByLotManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotManagFlg()); xsetupOuterJoinBClassDtlByLotManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotManagFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLotManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotManagFlg() { xregOutJo("bClassDtlByLotManagFlg"); }
    public boolean hasConditionQueryBClassDtlByLotManagFlg() { return xhasQueRlMap("bClassDtlByLotManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLotReverseFlg() {
        return xdfgetConditionQueryBClassDtlByLotReverseFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLotReverseFlg() {
        String prop = "bClassDtlByLotReverseFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLotReverseFlg()); xsetupOuterJoinBClassDtlByLotReverseFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLotReverseFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLotReverseFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLotReverseFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLotReverseFlg() { xregOutJo("bClassDtlByLotReverseFlg"); }
    public boolean hasConditionQueryBClassDtlByLotReverseFlg() { return xhasQueRlMap("bClassDtlByLotReverseFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMergeCls() {
        return xdfgetConditionQueryBClassDtlByMergeCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMergeCls() {
        String prop = "bClassDtlByMergeCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMergeCls()); xsetupOuterJoinBClassDtlByMergeCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMergeCls() {
        String nrp = xresolveNRP("m_product", "bClassDtlByMergeCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMergeCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMergeCls() { xregOutJo("bClassDtlByMergeCls"); }
    public boolean hasConditionQueryBClassDtlByMergeCls() { return xhasQueRlMap("bClassDtlByMergeCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingStopFlg() {
        return xdfgetConditionQueryBClassDtlByShippingStopFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingStopFlg() {
        String prop = "bClassDtlByShippingStopFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingStopFlg()); xsetupOuterJoinBClassDtlByShippingStopFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingStopFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByShippingStopFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingStopFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingStopFlg() { xregOutJo("bClassDtlByShippingStopFlg"); }
    public boolean hasConditionQueryBClassDtlByShippingStopFlg() { return xhasQueRlMap("bClassDtlByShippingStopFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByFreightCls() {
        return xdfgetConditionQueryBClassDtlByFreightCls();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByFreightCls() {
        String prop = "bClassDtlByFreightCls";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByFreightCls()); xsetupOuterJoinBClassDtlByFreightCls(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByFreightCls() {
        String nrp = xresolveNRP("m_product", "bClassDtlByFreightCls"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByFreightCls", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByFreightCls() { xregOutJo("bClassDtlByFreightCls"); }
    public boolean hasConditionQueryBClassDtlByFreightCls() { return xhasQueRlMap("bClassDtlByFreightCls"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByProdDtManagFlg() {
        return xdfgetConditionQueryBClassDtlByProdDtManagFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByProdDtManagFlg() {
        String prop = "bClassDtlByProdDtManagFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByProdDtManagFlg()); xsetupOuterJoinBClassDtlByProdDtManagFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByProdDtManagFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByProdDtManagFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByProdDtManagFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByProdDtManagFlg() { xregOutJo("bClassDtlByProdDtManagFlg"); }
    public boolean hasConditionQueryBClassDtlByProdDtManagFlg() { return xhasQueRlMap("bClassDtlByProdDtManagFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLogiSpecialTypeCd() {
        return xdfgetConditionQueryBClassDtlByLogiSpecialTypeCd();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLogiSpecialTypeCd() {
        String prop = "bClassDtlByLogiSpecialTypeCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLogiSpecialTypeCd()); xsetupOuterJoinBClassDtlByLogiSpecialTypeCd(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLogiSpecialTypeCd() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLogiSpecialTypeCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLogiSpecialTypeCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLogiSpecialTypeCd() { xregOutJo("bClassDtlByLogiSpecialTypeCd"); }
    public boolean hasConditionQueryBClassDtlByLogiSpecialTypeCd() { return xhasQueRlMap("bClassDtlByLogiSpecialTypeCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByOcrDateFormat() {
        return xdfgetConditionQueryBClassDtlByOcrDateFormat();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByOcrDateFormat() {
        String prop = "bClassDtlByOcrDateFormat";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByOcrDateFormat()); xsetupOuterJoinBClassDtlByOcrDateFormat(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByOcrDateFormat() {
        String nrp = xresolveNRP("m_product", "bClassDtlByOcrDateFormat"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByOcrDateFormat", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByOcrDateFormat() { xregOutJo("bClassDtlByOcrDateFormat"); }
    public boolean hasConditionQueryBClassDtlByOcrDateFormat() { return xhasQueRlMap("bClassDtlByOcrDateFormat"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInsuranceFlg() {
        return xdfgetConditionQueryBClassDtlByInsuranceFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInsuranceFlg() {
        String prop = "bClassDtlByInsuranceFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInsuranceFlg()); xsetupOuterJoinBClassDtlByInsuranceFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInsuranceFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByInsuranceFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInsuranceFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInsuranceFlg() { xregOutJo("bClassDtlByInsuranceFlg"); }
    public boolean hasConditionQueryBClassDtlByInsuranceFlg() { return xhasQueRlMap("bClassDtlByInsuranceFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByNoOkinawaFlightFlg() {
        return xdfgetConditionQueryBClassDtlByNoOkinawaFlightFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByNoOkinawaFlightFlg() {
        String prop = "bClassDtlByNoOkinawaFlightFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByNoOkinawaFlightFlg()); xsetupOuterJoinBClassDtlByNoOkinawaFlightFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByNoOkinawaFlightFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByNoOkinawaFlightFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByNoOkinawaFlightFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByNoOkinawaFlightFlg() { xregOutJo("bClassDtlByNoOkinawaFlightFlg"); }
    public boolean hasConditionQueryBClassDtlByNoOkinawaFlightFlg() { return xhasQueRlMap("bClassDtlByNoOkinawaFlightFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLogiAttentionTypeCd() {
        return xdfgetConditionQueryBClassDtlByLogiAttentionTypeCd();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLogiAttentionTypeCd() {
        String prop = "bClassDtlByLogiAttentionTypeCd";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLogiAttentionTypeCd()); xsetupOuterJoinBClassDtlByLogiAttentionTypeCd(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLogiAttentionTypeCd() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLogiAttentionTypeCd"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLogiAttentionTypeCd", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLogiAttentionTypeCd() { xregOutJo("bClassDtlByLogiAttentionTypeCd"); }
    public boolean hasConditionQueryBClassDtlByLogiAttentionTypeCd() { return xhasQueRlMap("bClassDtlByLogiAttentionTypeCd"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByHeavyItemFlg() {
        return xdfgetConditionQueryBClassDtlByHeavyItemFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByHeavyItemFlg() {
        String prop = "bClassDtlByHeavyItemFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByHeavyItemFlg()); xsetupOuterJoinBClassDtlByHeavyItemFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByHeavyItemFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByHeavyItemFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByHeavyItemFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByHeavyItemFlg() { xregOutJo("bClassDtlByHeavyItemFlg"); }
    public boolean hasConditionQueryBClassDtlByHeavyItemFlg() { return xhasQueRlMap("bClassDtlByHeavyItemFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByLargeItemFlg() {
        return xdfgetConditionQueryBClassDtlByLargeItemFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByLargeItemFlg() {
        String prop = "bClassDtlByLargeItemFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByLargeItemFlg()); xsetupOuterJoinBClassDtlByLargeItemFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByLargeItemFlg() {
        String nrp = xresolveNRP("m_product", "bClassDtlByLargeItemFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByLargeItemFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByLargeItemFlg() { xregOutJo("bClassDtlByLargeItemFlg"); }
    public boolean hasConditionQueryBClassDtlByLargeItemFlg() { return xhasQueRlMap("bClassDtlByLargeItemFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MSetParentCQ queryMSetParentAsOne() { return xdfgetConditionQueryMSetParentAsOne(); }
    public MSetParentCQ xdfgetConditionQueryMSetParentAsOne() {
        String prop = "mSetParentAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMSetParentAsOne()); xsetupOuterJoinMSetParentAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MSetParentCQ xcreateQueryMSetParentAsOne() {
        String nrp = xresolveNRP("m_product", "mSetParentAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MSetParentCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mSetParentAsOne", nrp);
    }
    protected void xsetupOuterJoinMSetParentAsOne() { xregOutJo("mSetParentAsOne"); }
    public boolean hasConditionQueryMSetParentAsOne() { return xhasQueRlMap("mSetParentAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MProductCQ> _myselfExistsMap;
    public Map<String, MProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MProductCB.class.getName(); }
    protected String xCQ() { return MProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
