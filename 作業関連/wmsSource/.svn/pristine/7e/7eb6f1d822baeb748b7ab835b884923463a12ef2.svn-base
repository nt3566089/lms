package com.oneslogi.base.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.bs.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of m_client.
 * @author DBFlute(AutoGenerator)
 */
public class MClientCIQ extends AbstractBsMClientCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMClientCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MClientCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMClientCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPackingListList(TPackingListCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TShippingRecordHList(TShippingRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TStockRecordList(TStockRecordCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_TTransferList(TTransferCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPackingListList(TPackingListCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TShippingRecordHList(TShippingRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TStockRecordList(TStockRecordCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_TTransferList(TTransferCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPackingListList(TPackingListCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TShippingRecordHList(TShippingRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TStockRecordList(TStockRecordCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_TTransferList(TTransferCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientColList(MClientColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientItemList(MClientItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientScreenList(MClientScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MClientScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCustomerList(MCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MImportTypeList(MImportTypeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MImportTypeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MProductList(MProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpList(MShapeGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MShapeGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserClientListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MUserLoginListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TInventoryHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingListList(TPackingListCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPackingListListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TSerialNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingRecordHList(TShippingRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TShippingRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockList(TStockCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockRecordList(TStockRecordCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStockRecordListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTransferList(TTransferCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_TTransferListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClientId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueClientAbbr() { return _myCQ.xdfgetClientAbbr(); }
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_InScopeRelation_MCustomer(sq); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueShapeGrpId() { return _myCQ.xdfgetShapeGrpId(); }
    public String keepShapeGrpId_InScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_InScopeRelation_MShapeGrp(sq); }
    public String keepShapeGrpId_NotInScopeRelation_MShapeGrp(MShapeGrpCQ sq)
    { return _myCQ.keepShapeGrpId_NotInScopeRelation_MShapeGrp(sq); }
    protected ConditionValue xgetCValueDelFlg() { return _myCQ.xdfgetDelFlg(); }
    protected ConditionValue xgetCValueVersionNo() { return _myCQ.xdfgetVersionNo(); }
    protected ConditionValue xgetCValueControlNo() { return _myCQ.xdfgetControlNo(); }
    protected ConditionValue xgetCValueAddDt() { return _myCQ.xdfgetAddDt(); }
    protected ConditionValue xgetCValueAddUser() { return _myCQ.xdfgetAddUser(); }
    protected ConditionValue xgetCValueAddProcess() { return _myCQ.xdfgetAddProcess(); }
    protected ConditionValue xgetCValueUpdDt() { return _myCQ.xdfgetUpdDt(); }
    protected ConditionValue xgetCValueUpdUser() { return _myCQ.xdfgetUpdUser(); }
    protected ConditionValue xgetCValueUpdProcess() { return _myCQ.xdfgetUpdProcess(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(MClientCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MClientCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MClientCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MClientCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MClientCB.class.getName(); }
    protected String xinCQ() { return MClientCQ.class.getName(); }
}
