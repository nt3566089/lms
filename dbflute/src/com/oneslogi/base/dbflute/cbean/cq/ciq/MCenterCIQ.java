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
 * The condition-query for in-line of m_center.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterCIQ extends AbstractBsMCenterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCenterCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCenterCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCenterCQ myCQ) {
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
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_ExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MGeneralList(MGeneralCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MNizoroeList(MNizoroeCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MGeneralList(MGeneralCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MNizoroeList(MNizoroeCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MGeneralList(MGeneralCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MNizoroeList(MNizoroeCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_HLocationAttributeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MCustomerPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MGeneralList(MGeneralCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MGeneralListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNizoroeList(MNizoroeCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNizoroeListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueCenterAbbr() { return _myCQ.xdfgetCenterAbbr(); }
    protected ConditionValue xgetCValueCultureId() { return _myCQ.xdfgetCultureId(); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_InScopeRelation_BCulture(sq); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_NotInScopeRelation_BCulture(sq); }
    protected ConditionValue xgetCValueTimeZoneId() { return _myCQ.xdfgetTimeZoneId(); }
    public String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq)
    { return _myCQ.keepTimeZoneId_InScopeRelation_BTimeZone(sq); }
    public String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq)
    { return _myCQ.keepTimeZoneId_NotInScopeRelation_BTimeZone(sq); }
    protected ConditionValue xgetCValueAddress() { return _myCQ.xdfgetAddress(); }
    protected ConditionValue xgetCValueTelNo() { return _myCQ.xdfgetTelNo(); }
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
    public String keepScalarCondition(MCenterCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCenterCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCenterCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCenterCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCenterCB.class.getName(); }
    protected String xinCQ() { return MCenterCQ.class.getName(); }
}
