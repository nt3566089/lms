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
 * The base condition-query of m_client.
 * @author DBFlute(AutoGenerator)
 */
public class BsMClientCQ extends AbstractBsMClientCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MClientCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMClientCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_client) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MClientCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MClientCIQ xcreateCIQ() {
        MClientCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MClientCIQ xnewCIQ() {
        return new MClientCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_client on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MClientCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MClientCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCenterCQ> xdfgetClientId_ExistsReferrer_MClientCenterList() { return xgetSQueMap("clientId_ExistsReferrer_MClientCenterList"); }
    public String keepClientId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_ExistsReferrer_MClientColList() { return xgetSQueMap("clientId_ExistsReferrer_MClientColList"); }
    public String keepClientId_ExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_ExistsReferrer_MClientItemList() { return xgetSQueMap("clientId_ExistsReferrer_MClientItemList"); }
    public String keepClientId_ExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_ExistsReferrer_MClientScreenList() { return xgetSQueMap("clientId_ExistsReferrer_MClientScreenList"); }
    public String keepClientId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_ExistsReferrer_MCustomerList() { return xgetSQueMap("clientId_ExistsReferrer_MCustomerList"); }
    public String keepClientId_ExistsReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_ExistsReferrer_MImportTypeList() { return xgetSQueMap("clientId_ExistsReferrer_MImportTypeList"); }
    public String keepClientId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MImportTypeList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_ExistsReferrer_MProductList() { return xgetSQueMap("clientId_ExistsReferrer_MProductList"); }
    public String keepClientId_ExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_ExistsReferrer_MShapeGrpList() { return xgetSQueMap("clientId_ExistsReferrer_MShapeGrpList"); }
    public String keepClientId_ExistsReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_ExistsReferrer_MUserClientList() { return xgetSQueMap("clientId_ExistsReferrer_MUserClientList"); }
    public String keepClientId_ExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_ExistsReferrer_MUserLoginList() { return xgetSQueMap("clientId_ExistsReferrer_MUserLoginList"); }
    public String keepClientId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_ExistsReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_ExistsReferrer_MWebHtInfoList"); }
    public String keepClientId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TAllocInstHList"); }
    public String keepClientId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("clientId_ExistsReferrer_TEcOrderHList"); }
    public String keepClientId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_ExistsReferrer_TInventoryHList() { return xgetSQueMap("clientId_ExistsReferrer_TInventoryHList"); }
    public String keepClientId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_ExistsReferrer_TMoveInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TMoveInstHList"); }
    public String keepClientId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_ExistsReferrer_TPackingHList() { return xgetSQueMap("clientId_ExistsReferrer_TPackingHList"); }
    public String keepClientId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPackingListCQ> xdfgetClientId_ExistsReferrer_TPackingListList() { return xgetSQueMap("clientId_ExistsReferrer_TPackingListList"); }
    public String keepClientId_ExistsReferrer_TPackingListList(TPackingListCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPackingListList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_ExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_ExistsReferrer_TPicMthdRcmdList"); }
    public String keepClientId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_ExistsReferrer_TPickingHList() { return xgetSQueMap("clientId_ExistsReferrer_TPickingHList"); }
    public String keepClientId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_ExistsReferrer_TReceivePlanHList"); }
    public String keepClientId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("clientId_ExistsReferrer_TSerialNoList"); }
    public String keepClientId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("clientId_ExistsReferrer_TShippingInstHList"); }
    public String keepClientId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TShippingRecordHCQ> xdfgetClientId_ExistsReferrer_TShippingRecordHList() { return xgetSQueMap("clientId_ExistsReferrer_TShippingRecordHList"); }
    public String keepClientId_ExistsReferrer_TShippingRecordHList(TShippingRecordHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TShippingRecordHList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_ExistsReferrer_TStockList() { return xgetSQueMap("clientId_ExistsReferrer_TStockList"); }
    public String keepClientId_ExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TStockList", sq); }

    public Map<String, TStockRecordCQ> xdfgetClientId_ExistsReferrer_TStockRecordList() { return xgetSQueMap("clientId_ExistsReferrer_TStockRecordList"); }
    public String keepClientId_ExistsReferrer_TStockRecordList(TStockRecordCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TStockRecordList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_ExistsReferrer_TStoreRecordHList"); }
    public String keepClientId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTransferCQ> xdfgetClientId_ExistsReferrer_TTransferList() { return xgetSQueMap("clientId_ExistsReferrer_TTransferList"); }
    public String keepClientId_ExistsReferrer_TTransferList(TTransferCQ sq) { return xkeepSQue("clientId_ExistsReferrer_TTransferList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_ExistsReferrer_WHtLoadingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtLoadingList"); }
    public String keepClientId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetClientId_ExistsReferrer_WHtPickingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtPickingList"); }
    public String keepClientId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepClientId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_ExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_ExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_ExistsReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtShippingList"); }
    public String keepClientId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepClientId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetClientId_ExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("clientId_ExistsReferrer_WHtTotalPickingList"); }
    public String keepClientId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepClientId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_ExistsReferrer_WShippingInterruptList"); }
    public String keepClientId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_NotExistsReferrer_MClientCenterList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientCenterList"); }
    public String keepClientId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_NotExistsReferrer_MClientColList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientColList"); }
    public String keepClientId_NotExistsReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_NotExistsReferrer_MClientItemList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientItemList"); }
    public String keepClientId_NotExistsReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_NotExistsReferrer_MClientScreenList() { return xgetSQueMap("clientId_NotExistsReferrer_MClientScreenList"); }
    public String keepClientId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_NotExistsReferrer_MCustomerList() { return xgetSQueMap("clientId_NotExistsReferrer_MCustomerList"); }
    public String keepClientId_NotExistsReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_NotExistsReferrer_MImportTypeList() { return xgetSQueMap("clientId_NotExistsReferrer_MImportTypeList"); }
    public String keepClientId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MImportTypeList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_NotExistsReferrer_MProductList() { return xgetSQueMap("clientId_NotExistsReferrer_MProductList"); }
    public String keepClientId_NotExistsReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_NotExistsReferrer_MShapeGrpList() { return xgetSQueMap("clientId_NotExistsReferrer_MShapeGrpList"); }
    public String keepClientId_NotExistsReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_NotExistsReferrer_MUserClientList() { return xgetSQueMap("clientId_NotExistsReferrer_MUserClientList"); }
    public String keepClientId_NotExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_NotExistsReferrer_MUserLoginList() { return xgetSQueMap("clientId_NotExistsReferrer_MUserLoginList"); }
    public String keepClientId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_NotExistsReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_NotExistsReferrer_MWebHtInfoList"); }
    public String keepClientId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TAllocInstHList"); }
    public String keepClientId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("clientId_NotExistsReferrer_TEcOrderHList"); }
    public String keepClientId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_NotExistsReferrer_TInventoryHList() { return xgetSQueMap("clientId_NotExistsReferrer_TInventoryHList"); }
    public String keepClientId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_NotExistsReferrer_TMoveInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TMoveInstHList"); }
    public String keepClientId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("clientId_NotExistsReferrer_TPackingHList"); }
    public String keepClientId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPackingListCQ> xdfgetClientId_NotExistsReferrer_TPackingListList() { return xgetSQueMap("clientId_NotExistsReferrer_TPackingListList"); }
    public String keepClientId_NotExistsReferrer_TPackingListList(TPackingListCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPackingListList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_NotExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_NotExistsReferrer_TPicMthdRcmdList"); }
    public String keepClientId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("clientId_NotExistsReferrer_TPickingHList"); }
    public String keepClientId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepClientId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("clientId_NotExistsReferrer_TSerialNoList"); }
    public String keepClientId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("clientId_NotExistsReferrer_TShippingInstHList"); }
    public String keepClientId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TShippingRecordHCQ> xdfgetClientId_NotExistsReferrer_TShippingRecordHList() { return xgetSQueMap("clientId_NotExistsReferrer_TShippingRecordHList"); }
    public String keepClientId_NotExistsReferrer_TShippingRecordHList(TShippingRecordHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TShippingRecordHList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_NotExistsReferrer_TStockList() { return xgetSQueMap("clientId_NotExistsReferrer_TStockList"); }
    public String keepClientId_NotExistsReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TStockList", sq); }

    public Map<String, TStockRecordCQ> xdfgetClientId_NotExistsReferrer_TStockRecordList() { return xgetSQueMap("clientId_NotExistsReferrer_TStockRecordList"); }
    public String keepClientId_NotExistsReferrer_TStockRecordList(TStockRecordCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TStockRecordList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepClientId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TTransferCQ> xdfgetClientId_NotExistsReferrer_TTransferList() { return xgetSQueMap("clientId_NotExistsReferrer_TTransferList"); }
    public String keepClientId_NotExistsReferrer_TTransferList(TTransferCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_TTransferList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_NotExistsReferrer_WHtLoadingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtLoadingList"); }
    public String keepClientId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetClientId_NotExistsReferrer_WHtPickingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtPickingList"); }
    public String keepClientId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepClientId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_NotExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_NotExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtShippingList"); }
    public String keepClientId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepClientId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetClientId_NotExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("clientId_NotExistsReferrer_WHtTotalPickingList"); }
    public String keepClientId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepClientId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepClientId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientCenterList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientCenterList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientCenterList", sq); }

    public Map<String, MClientColCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientColList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientColList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientColList", sq); }

    public Map<String, MClientItemCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientItemList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientItemList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientItemList", sq); }

    public Map<String, MClientScreenCQ> xdfgetClientId_SpecifyDerivedReferrer_MClientScreenList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MClientScreenList"); }
    public String keepClientId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MClientScreenList", sq); }

    public Map<String, MCustomerCQ> xdfgetClientId_SpecifyDerivedReferrer_MCustomerList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MCustomerList"); }
    public String keepClientId_SpecifyDerivedReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MCustomerList", sq); }

    public Map<String, MImportTypeCQ> xdfgetClientId_SpecifyDerivedReferrer_MImportTypeList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MImportTypeList"); }
    public String keepClientId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MImportTypeList", sq); }

    public Map<String, MProductCQ> xdfgetClientId_SpecifyDerivedReferrer_MProductList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MProductList"); }
    public String keepClientId_SpecifyDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MProductList", sq); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_SpecifyDerivedReferrer_MShapeGrpList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_SpecifyDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MShapeGrpList", sq); }

    public Map<String, MUserClientCQ> xdfgetClientId_SpecifyDerivedReferrer_MUserClientList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MUserClientList"); }
    public String keepClientId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MUserClientList", sq); }

    public Map<String, MUserLoginCQ> xdfgetClientId_SpecifyDerivedReferrer_MUserLoginList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MUserLoginList"); }
    public String keepClientId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MUserLoginList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_SpecifyDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetClientId_SpecifyDerivedReferrer_TInventoryHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TInventoryHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TMoveInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetClientId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPackingListCQ> xdfgetClientId_SpecifyDerivedReferrer_TPackingListList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPackingListList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPackingListList(TPackingListCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPackingListList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_SpecifyDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetClientId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetClientId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepClientId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TShippingRecordHCQ> xdfgetClientId_SpecifyDerivedReferrer_TShippingRecordHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TShippingRecordHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TShippingRecordHList(TShippingRecordHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TShippingRecordHList", sq); }

    public Map<String, TStockCQ> xdfgetClientId_SpecifyDerivedReferrer_TStockList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TStockList"); }
    public String keepClientId_SpecifyDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TStockList", sq); }

    public Map<String, TStockRecordCQ> xdfgetClientId_SpecifyDerivedReferrer_TStockRecordList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TStockRecordList"); }
    public String keepClientId_SpecifyDerivedReferrer_TStockRecordList(TStockRecordCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TStockRecordList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, TTransferCQ> xdfgetClientId_SpecifyDerivedReferrer_TTransferList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_TTransferList"); }
    public String keepClientId_SpecifyDerivedReferrer_TTransferList(TTransferCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_TTransferList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtLoadingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtPickingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtPickingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetClientId_SpecifyDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WHtTotalPickingList"); }
    public String keepClientId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, MClientCenterCQ> xdfgetClientId_QueryDerivedReferrer_MClientCenterList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepClientId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientCenterList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientCenterListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepClientId_QueryDerivedReferrer_MClientCenterListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientCenterList", pm); }

    public Map<String, MClientColCQ> xdfgetClientId_QueryDerivedReferrer_MClientColList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientColList"); }
    public String keepClientId_QueryDerivedReferrer_MClientColList(MClientColCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientColList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientColListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientColList"); }
    public String keepClientId_QueryDerivedReferrer_MClientColListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientColList", pm); }

    public Map<String, MClientItemCQ> xdfgetClientId_QueryDerivedReferrer_MClientItemList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientItemList"); }
    public String keepClientId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientItemList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientItemListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientItemList"); }
    public String keepClientId_QueryDerivedReferrer_MClientItemListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientItemList", pm); }

    public Map<String, MClientScreenCQ> xdfgetClientId_QueryDerivedReferrer_MClientScreenList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepClientId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MClientScreenList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MClientScreenListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MClientScreenList"); }
    public String keepClientId_QueryDerivedReferrer_MClientScreenListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MClientScreenList", pm); }

    public Map<String, MCustomerCQ> xdfgetClientId_QueryDerivedReferrer_MCustomerList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MCustomerList"); }
    public String keepClientId_QueryDerivedReferrer_MCustomerList(MCustomerCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MCustomerList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MCustomerListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MCustomerList"); }
    public String keepClientId_QueryDerivedReferrer_MCustomerListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MCustomerList", pm); }

    public Map<String, MImportTypeCQ> xdfgetClientId_QueryDerivedReferrer_MImportTypeList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepClientId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MImportTypeList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MImportTypeListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MImportTypeList"); }
    public String keepClientId_QueryDerivedReferrer_MImportTypeListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MImportTypeList", pm); }

    public Map<String, MProductCQ> xdfgetClientId_QueryDerivedReferrer_MProductList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MProductList"); }
    public String keepClientId_QueryDerivedReferrer_MProductList(MProductCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MProductList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MProductListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MProductList"); }
    public String keepClientId_QueryDerivedReferrer_MProductListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MProductList", pm); }

    public Map<String, MShapeGrpCQ> xdfgetClientId_QueryDerivedReferrer_MShapeGrpList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MShapeGrpList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MShapeGrpListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MShapeGrpList"); }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MShapeGrpList", pm); }

    public Map<String, MUserClientCQ> xdfgetClientId_QueryDerivedReferrer_MUserClientList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MUserClientList"); }
    public String keepClientId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MUserClientList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MUserClientListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MUserClientList"); }
    public String keepClientId_QueryDerivedReferrer_MUserClientListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MUserClientList", pm); }

    public Map<String, MUserLoginCQ> xdfgetClientId_QueryDerivedReferrer_MUserLoginList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepClientId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MUserLoginList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MUserLoginListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepClientId_QueryDerivedReferrer_MUserLoginListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MUserLoginList", pm); }

    public Map<String, MWebHtInfoCQ> xdfgetClientId_QueryDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_MWebHtInfoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_MWebHtInfoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_MWebHtInfoList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetClientId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TEcOrderHCQ> xdfgetClientId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TInventoryHCQ> xdfgetClientId_QueryDerivedReferrer_TInventoryHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepClientId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TInventoryHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TInventoryHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepClientId_QueryDerivedReferrer_TInventoryHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TInventoryHList", pm); }

    public Map<String, TMoveInstHCQ> xdfgetClientId_QueryDerivedReferrer_TMoveInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TMoveInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TMoveInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TMoveInstHList", pm); }

    public Map<String, TPackingHCQ> xdfgetClientId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPackingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPackingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPackingListCQ> xdfgetClientId_QueryDerivedReferrer_TPackingListList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPackingListList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingListList(TPackingListCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPackingListList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPackingListListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPackingListList"); }
    public String keepClientId_QueryDerivedReferrer_TPackingListListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPackingListList", pm); }

    public Map<String, TPicMthdRcmdCQ> xdfgetClientId_QueryDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPicMthdRcmdList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPicMthdRcmdList", pm); }

    public Map<String, TPickingHCQ> xdfgetClientId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TPickingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TPickingHList"); }
    public String keepClientId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetClientId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TSerialNoCQ> xdfgetClientId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepClientId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepClientId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetClientId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, TShippingRecordHCQ> xdfgetClientId_QueryDerivedReferrer_TShippingRecordHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TShippingRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingRecordHList(TShippingRecordHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TShippingRecordHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TShippingRecordHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TShippingRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TShippingRecordHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TShippingRecordHList", pm); }

    public Map<String, TStockCQ> xdfgetClientId_QueryDerivedReferrer_TStockList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TStockList"); }
    public String keepClientId_QueryDerivedReferrer_TStockList(TStockCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TStockList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TStockListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TStockList"); }
    public String keepClientId_QueryDerivedReferrer_TStockListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TStockList", pm); }

    public Map<String, TStockRecordCQ> xdfgetClientId_QueryDerivedReferrer_TStockRecordList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TStockRecordList"); }
    public String keepClientId_QueryDerivedReferrer_TStockRecordList(TStockRecordCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TStockRecordList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TStockRecordListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TStockRecordList"); }
    public String keepClientId_QueryDerivedReferrer_TStockRecordListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TStockRecordList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetClientId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, TTransferCQ> xdfgetClientId_QueryDerivedReferrer_TTransferList() { return xgetSQueMap("clientId_QueryDerivedReferrer_TTransferList"); }
    public String keepClientId_QueryDerivedReferrer_TTransferList(TTransferCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_TTransferList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_TTransferListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_TTransferList"); }
    public String keepClientId_QueryDerivedReferrer_TTransferListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_TTransferList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetClientId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtLoadingCQ> xdfgetClientId_QueryDerivedReferrer_WHtLoadingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtLoadingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtLoadingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtLoadingList", pm); }

    public Map<String, WHtPickingCQ> xdfgetClientId_QueryDerivedReferrer_WHtPickingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtPickingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtPickingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtPickingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtPickingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetClientId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtSerialReceiveInspList", pm); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetClientId_QueryDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtSerialShippingInspList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtSerialShippingInspList", pm); }

    public Map<String, WHtShippingCQ> xdfgetClientId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetClientId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WHtTotalPickingCQ> xdfgetClientId_QueryDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WHtTotalPickingList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WHtTotalPickingListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepClientId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WHtTotalPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetClientId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetClientId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("clientId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("clientId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetClientId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("clientId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("clientId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _clientCd;
    public ConditionValue xdfgetClientCd()
    { if (_clientCd == null) { _clientCd = nCV(); }
      return _clientCd; }
    protected ConditionValue xgetCValueClientCd() { return xdfgetClientCd(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientCd_Asc() { regOBA("CLIENT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientCd_Desc() { regOBD("CLIENT_CD"); return this; }

    protected ConditionValue _clientNm;
    public ConditionValue xdfgetClientNm()
    { if (_clientNm == null) { _clientNm = nCV(); }
      return _clientNm; }
    protected ConditionValue xgetCValueClientNm() { return xdfgetClientNm(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientNm_Asc() { regOBA("CLIENT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientNm_Desc() { regOBD("CLIENT_NM"); return this; }

    protected ConditionValue _clientAbbr;
    public ConditionValue xdfgetClientAbbr()
    { if (_clientAbbr == null) { _clientAbbr = nCV(); }
      return _clientAbbr; }
    protected ConditionValue xgetCValueClientAbbr() { return xdfgetClientAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientAbbr_Asc() { regOBA("CLIENT_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ClientAbbr_Desc() { regOBD("CLIENT_ABBR"); return this; }

    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCustomerCQ> getCustomerId_InScopeRelation_MCustomer() { return xgetSQueMap("customerId_InScopeRelation_MCustomer"); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getCustomerId_NotInScopeRelation_MCustomer() { return xgetSQueMap("customerId_NotInScopeRelation_MCustomer"); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

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
    public BsMClientCQ addOrderBy_ShapeGrpId_Asc() { regOBA("SHAPE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ShapeGrpId_Desc() { regOBD("SHAPE_GRP_ID"); return this; }

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
    public BsMClientCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMClientCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMClientCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMClientCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMClientCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMClientCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMClientCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMClientCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMClientCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMClientCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMClientCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMClientCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MClientCQ bq = (MClientCQ)bqs;
        MClientCQ uq = (MClientCQ)uqs;
        if (bq.hasConditionQueryMShapeGrp()) {
            uq.queryMShapeGrp().reflectRelationOnUnionQuery(bq.queryMShapeGrp(), uq.queryMShapeGrp());
        }
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
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
        String nrp = xresolveNRP("m_client", "mShapeGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MShapeGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mShapeGrp", nrp);
    }
    protected void xsetupOuterJoinMShapeGrp() { xregOutJo("mShapeGrp"); }
    public boolean hasConditionQueryMShapeGrp() { return xhasQueRlMap("mShapeGrp"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
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
        String nrp = xresolveNRP("m_client", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

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
        String nrp = xresolveNRP("m_client", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MClientCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MClientCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MClientCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MClientCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MClientCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MClientCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MClientCQ> _myselfExistsMap;
    public Map<String, MClientCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MClientCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MClientCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MClientCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MClientCB.class.getName(); }
    protected String xCQ() { return MClientCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
