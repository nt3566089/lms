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
 * The base condition-query of m_center.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCenterCQ extends AbstractBsMCenterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCenterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCenterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_center) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCenterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCenterCIQ xcreateCIQ() {
        MCenterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCenterCIQ xnewCIQ() {
        return new MCenterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_center on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCenterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCenterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, HLocationAttributeCQ> xdfgetCenterId_ExistsReferrer_HLocationAttributeList() { return xgetSQueMap("centerId_ExistsReferrer_HLocationAttributeList"); }
    public String keepCenterId_ExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("centerId_ExistsReferrer_HLocationAttributeList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_ExistsReferrer_MBoxList() { return xgetSQueMap("centerId_ExistsReferrer_MBoxList"); }
    public String keepCenterId_ExistsReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_ExistsReferrer_MBoxGrpList() { return xgetSQueMap("centerId_ExistsReferrer_MBoxGrpList"); }
    public String keepCenterId_ExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_ExistsReferrer_MCarrierList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierList"); }
    public String keepCenterId_ExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_ExistsReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_ExistsReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_ExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_ExistsReferrer_MCenterClassList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterClassList"); }
    public String keepCenterId_ExistsReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_ExistsReferrer_MCenterColList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterColList"); }
    public String keepCenterId_ExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_ExistsReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterCustomerList"); }
    public String keepCenterId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_ExistsReferrer_MCenterItemList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterItemList"); }
    public String keepCenterId_ExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_ExistsReferrer_MCenterScreenList() { return xgetSQueMap("centerId_ExistsReferrer_MCenterScreenList"); }
    public String keepCenterId_ExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_ExistsReferrer_MClientCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MClientCenterList"); }
    public String keepCenterId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetCenterId_ExistsReferrer_MCustomerPickingList() { return xgetSQueMap("centerId_ExistsReferrer_MCustomerPickingList"); }
    public String keepCenterId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MCustomerPickingList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_ExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_ExistsReferrer_MDeliveryCourseList"); }
    public String keepCenterId_ExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MGeneralCQ> xdfgetCenterId_ExistsReferrer_MGeneralList() { return xgetSQueMap("centerId_ExistsReferrer_MGeneralList"); }
    public String keepCenterId_ExistsReferrer_MGeneralList(MGeneralCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MGeneralList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_ExistsReferrer_MLocationList() { return xgetSQueMap("centerId_ExistsReferrer_MLocationList"); }
    public String keepCenterId_ExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MLocationList", sq); }

    public Map<String, MNizoroeCQ> xdfgetCenterId_ExistsReferrer_MNizoroeList() { return xgetSQueMap("centerId_ExistsReferrer_MNizoroeList"); }
    public String keepCenterId_ExistsReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MNizoroeList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_ExistsReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MNumberingCenterList"); }
    public String keepCenterId_ExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_ExistsReferrer_MUserCenterList() { return xgetSQueMap("centerId_ExistsReferrer_MUserCenterList"); }
    public String keepCenterId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_ExistsReferrer_MUserLoginList() { return xgetSQueMap("centerId_ExistsReferrer_MUserLoginList"); }
    public String keepCenterId_ExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_ExistsReferrer_MWarehouseList() { return xgetSQueMap("centerId_ExistsReferrer_MWarehouseList"); }
    public String keepCenterId_ExistsReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_ExistsReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_ExistsReferrer_MWebHtInfoList"); }
    public String keepCenterId_ExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_ExistsReferrer_TAllocInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TAllocInstHList"); }
    public String keepCenterId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("centerId_ExistsReferrer_TEcOrderHList"); }
    public String keepCenterId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_ExistsReferrer_TInventoryHList() { return xgetSQueMap("centerId_ExistsReferrer_TInventoryHList"); }
    public String keepCenterId_ExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_ExistsReferrer_TMoveInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TMoveInstHList"); }
    public String keepCenterId_ExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_ExistsReferrer_TPackingHList() { return xgetSQueMap("centerId_ExistsReferrer_TPackingHList"); }
    public String keepCenterId_ExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPackingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_ExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_ExistsReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_ExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_ExistsReferrer_TPickingHList() { return xgetSQueMap("centerId_ExistsReferrer_TPickingHList"); }
    public String keepCenterId_ExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_ExistsReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_ExistsReferrer_TReceivePlanHList"); }
    public String keepCenterId_ExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_ExistsReferrer_TSerialNoList() { return xgetSQueMap("centerId_ExistsReferrer_TSerialNoList"); }
    public String keepCenterId_ExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_ExistsReferrer_TShippingInstHList() { return xgetSQueMap("centerId_ExistsReferrer_TShippingInstHList"); }
    public String keepCenterId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_ExistsReferrer_TStoreRecordHList"); }
    public String keepCenterId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_ExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_ExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_ExistsReferrer_WHtLoadingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtLoadingList"); }
    public String keepCenterId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetCenterId_ExistsReferrer_WHtPickingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtPickingList"); }
    public String keepCenterId_ExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_ExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_ExistsReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_ExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_ExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_ExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_ExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_ExistsReferrer_WHtShippingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtShippingList"); }
    public String keepCenterId_ExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_ExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtShippingPickingList"); }
    public String keepCenterId_ExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetCenterId_ExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("centerId_ExistsReferrer_WHtTotalPickingList"); }
    public String keepCenterId_ExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_ExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_ExistsReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_ExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_ExistsReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_ExistsReferrer_WShippingInterruptList"); }
    public String keepCenterId_ExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_ExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetCenterId_NotExistsReferrer_HLocationAttributeList() { return xgetSQueMap("centerId_NotExistsReferrer_HLocationAttributeList"); }
    public String keepCenterId_NotExistsReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_HLocationAttributeList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_NotExistsReferrer_MBoxList() { return xgetSQueMap("centerId_NotExistsReferrer_MBoxList"); }
    public String keepCenterId_NotExistsReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_NotExistsReferrer_MBoxGrpList() { return xgetSQueMap("centerId_NotExistsReferrer_MBoxGrpList"); }
    public String keepCenterId_NotExistsReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_NotExistsReferrer_MCarrierList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_NotExistsReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_NotExistsReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_NotExistsReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_NotExistsReferrer_MCenterClassList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterClassList"); }
    public String keepCenterId_NotExistsReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_NotExistsReferrer_MCenterColList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterColList"); }
    public String keepCenterId_NotExistsReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_NotExistsReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterCustomerList"); }
    public String keepCenterId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_NotExistsReferrer_MCenterItemList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterItemList"); }
    public String keepCenterId_NotExistsReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_NotExistsReferrer_MCenterScreenList() { return xgetSQueMap("centerId_NotExistsReferrer_MCenterScreenList"); }
    public String keepCenterId_NotExistsReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_NotExistsReferrer_MClientCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MClientCenterList"); }
    public String keepCenterId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetCenterId_NotExistsReferrer_MCustomerPickingList() { return xgetSQueMap("centerId_NotExistsReferrer_MCustomerPickingList"); }
    public String keepCenterId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MCustomerPickingList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_NotExistsReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_NotExistsReferrer_MDeliveryCourseList"); }
    public String keepCenterId_NotExistsReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MDeliveryCourseList", sq); }

    public Map<String, MGeneralCQ> xdfgetCenterId_NotExistsReferrer_MGeneralList() { return xgetSQueMap("centerId_NotExistsReferrer_MGeneralList"); }
    public String keepCenterId_NotExistsReferrer_MGeneralList(MGeneralCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MGeneralList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_NotExistsReferrer_MLocationList() { return xgetSQueMap("centerId_NotExistsReferrer_MLocationList"); }
    public String keepCenterId_NotExistsReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MLocationList", sq); }

    public Map<String, MNizoroeCQ> xdfgetCenterId_NotExistsReferrer_MNizoroeList() { return xgetSQueMap("centerId_NotExistsReferrer_MNizoroeList"); }
    public String keepCenterId_NotExistsReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MNizoroeList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_NotExistsReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MNumberingCenterList"); }
    public String keepCenterId_NotExistsReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_NotExistsReferrer_MUserCenterList() { return xgetSQueMap("centerId_NotExistsReferrer_MUserCenterList"); }
    public String keepCenterId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_NotExistsReferrer_MUserLoginList() { return xgetSQueMap("centerId_NotExistsReferrer_MUserLoginList"); }
    public String keepCenterId_NotExistsReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_NotExistsReferrer_MWarehouseList() { return xgetSQueMap("centerId_NotExistsReferrer_MWarehouseList"); }
    public String keepCenterId_NotExistsReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_NotExistsReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_NotExistsReferrer_MWebHtInfoList"); }
    public String keepCenterId_NotExistsReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_NotExistsReferrer_TAllocInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TAllocInstHList"); }
    public String keepCenterId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("centerId_NotExistsReferrer_TEcOrderHList"); }
    public String keepCenterId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_NotExistsReferrer_TInventoryHList() { return xgetSQueMap("centerId_NotExistsReferrer_TInventoryHList"); }
    public String keepCenterId_NotExistsReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_NotExistsReferrer_TMoveInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TMoveInstHList"); }
    public String keepCenterId_NotExistsReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_NotExistsReferrer_TPackingHList() { return xgetSQueMap("centerId_NotExistsReferrer_TPackingHList"); }
    public String keepCenterId_NotExistsReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPackingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_NotExistsReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_NotExistsReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_NotExistsReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_NotExistsReferrer_TPickingHList() { return xgetSQueMap("centerId_NotExistsReferrer_TPickingHList"); }
    public String keepCenterId_NotExistsReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_NotExistsReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_NotExistsReferrer_TReceivePlanHList"); }
    public String keepCenterId_NotExistsReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_NotExistsReferrer_TSerialNoList() { return xgetSQueMap("centerId_NotExistsReferrer_TSerialNoList"); }
    public String keepCenterId_NotExistsReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_NotExistsReferrer_TShippingInstHList() { return xgetSQueMap("centerId_NotExistsReferrer_TShippingInstHList"); }
    public String keepCenterId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TShippingInstHList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepCenterId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_NotExistsReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_NotExistsReferrer_WHtLoadingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtLoadingList"); }
    public String keepCenterId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetCenterId_NotExistsReferrer_WHtPickingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtPickingList"); }
    public String keepCenterId_NotExistsReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_NotExistsReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_NotExistsReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_NotExistsReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_NotExistsReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_NotExistsReferrer_WHtShippingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtShippingList"); }
    public String keepCenterId_NotExistsReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_NotExistsReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtShippingPickingList"); }
    public String keepCenterId_NotExistsReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetCenterId_NotExistsReferrer_WHtTotalPickingList() { return xgetSQueMap("centerId_NotExistsReferrer_WHtTotalPickingList"); }
    public String keepCenterId_NotExistsReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_NotExistsReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_NotExistsReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_NotExistsReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_NotExistsReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_NotExistsReferrer_WShippingInterruptList"); }
    public String keepCenterId_NotExistsReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_NotExistsReferrer_WShippingInterruptList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetCenterId_SpecifyDerivedReferrer_HLocationAttributeList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_HLocationAttributeList"); }
    public String keepCenterId_SpecifyDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_HLocationAttributeList", sq); }

    public Map<String, MBoxCQ> xdfgetCenterId_SpecifyDerivedReferrer_MBoxList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MBoxList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MBoxList", sq); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_SpecifyDerivedReferrer_MBoxGrpList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MBoxGrpList", sq); }

    public Map<String, MCarrierCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierList", sq); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipSgwList", sq); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipYmtList", sq); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCarrierSlipYupkList", sq); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterClassList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterClassList", sq); }

    public Map<String, MCenterColCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterColList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterColList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterColList", sq); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterCustomerList", sq); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterItemList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterItemList", sq); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCenterScreenList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCenterScreenList", sq); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MClientCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MClientCenterList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetCenterId_SpecifyDerivedReferrer_MCustomerPickingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MCustomerPickingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MCustomerPickingList", sq); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_SpecifyDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MDeliveryCourseList", sq); }

    public Map<String, MGeneralCQ> xdfgetCenterId_SpecifyDerivedReferrer_MGeneralList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MGeneralList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MGeneralList(MGeneralCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MGeneralList", sq); }

    public Map<String, MLocationCQ> xdfgetCenterId_SpecifyDerivedReferrer_MLocationList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MLocationList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MLocationList", sq); }

    public Map<String, MNizoroeCQ> xdfgetCenterId_SpecifyDerivedReferrer_MNizoroeList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MNizoroeList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MNizoroeList", sq); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MNumberingCenterList", sq); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_SpecifyDerivedReferrer_MUserCenterList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MUserCenterList", sq); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_SpecifyDerivedReferrer_MUserLoginList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MUserLoginList", sq); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_SpecifyDerivedReferrer_MWarehouseList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MWarehouseList", sq); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_SpecifyDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_MWebHtInfoList", sq); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TAllocInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TAllocInstHList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TInventoryHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TInventoryHList", sq); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TMoveInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TMoveInstHList", sq); }

    public Map<String, TPackingHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPackingHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPackingHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPackingHList", sq); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPicMthdRcmdList", sq); }

    public Map<String, TPickingHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TPickingHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TPickingHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TPickingHList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TReceivePlanHList", sq); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_SpecifyDerivedReferrer_TSerialNoList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TSerialNoList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TShippingInstHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TShippingInstHList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtInventoryInputProdList", sq); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtLoadingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtLoadingList", sq); }

    public Map<String, WHtPickingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtPickingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtPickingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtPickingList", sq); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveInspectionList", sq); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspList", sq); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtReceiveStoreList", sq); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList", sq); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtSerialShippingInspList", sq); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtShippingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtShippingList", sq); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtShippingPickingList", sq); }

    public Map<String, WHtTotalPickingCQ> xdfgetCenterId_SpecifyDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WHtTotalPickingList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WHtTotalPickingList", sq); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WSglRowShipInspHList", sq); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_SpecifyDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_SpecifyDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_SpecifyDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_SpecifyDerivedReferrer_WShippingInterruptList", sq); }

    public Map<String, HLocationAttributeCQ> xdfgetCenterId_QueryDerivedReferrer_HLocationAttributeList() { return xgetSQueMap("centerId_QueryDerivedReferrer_HLocationAttributeList"); }
    public String keepCenterId_QueryDerivedReferrer_HLocationAttributeList(HLocationAttributeCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_HLocationAttributeList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_HLocationAttributeListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_HLocationAttributeList"); }
    public String keepCenterId_QueryDerivedReferrer_HLocationAttributeListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_HLocationAttributeList", pm); }

    public Map<String, MBoxCQ> xdfgetCenterId_QueryDerivedReferrer_MBoxList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MBoxList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxList(MBoxCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MBoxList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MBoxListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MBoxList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MBoxList", pm); }

    public Map<String, MBoxGrpCQ> xdfgetCenterId_QueryDerivedReferrer_MBoxGrpList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpList(MBoxGrpCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MBoxGrpList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MBoxGrpListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MBoxGrpList"); }
    public String keepCenterId_QueryDerivedReferrer_MBoxGrpListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MBoxGrpList", pm); }

    public Map<String, MCarrierCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierList", pm); }

    public Map<String, MCarrierSlipSgwCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipSgwList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwList(MCarrierSlipSgwCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipSgwList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipSgwList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipSgwListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipSgwList", pm); }

    public Map<String, MCarrierSlipYmtCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYmtList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtList(MCarrierSlipYmtCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipYmtList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipYmtList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYmtListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipYmtList", pm); }

    public Map<String, MCarrierSlipYupkCQ> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYupkList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkList(MCarrierSlipYupkCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCarrierSlipYupkList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCarrierSlipYupkList"); }
    public String keepCenterId_QueryDerivedReferrer_MCarrierSlipYupkListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCarrierSlipYupkList", pm); }

    public Map<String, MCenterClassCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterClassList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassList(MCenterClassCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterClassList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterClassListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterClassList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterClassListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterClassList", pm); }

    public Map<String, MCenterColCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterColList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterColList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterColList(MCenterColCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterColList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterColListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterColList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterColListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterColList", pm); }

    public Map<String, MCenterCustomerCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterCustomerList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterCustomerList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterCustomerListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterCustomerList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterCustomerListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterCustomerList", pm); }

    public Map<String, MCenterItemCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterItemList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemList(MCenterItemCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterItemList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterItemListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterItemList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterItemListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterItemList", pm); }

    public Map<String, MCenterScreenCQ> xdfgetCenterId_QueryDerivedReferrer_MCenterScreenList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenList(MCenterScreenCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCenterScreenList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCenterScreenListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCenterScreenList"); }
    public String keepCenterId_QueryDerivedReferrer_MCenterScreenListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCenterScreenList", pm); }

    public Map<String, MClientCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MClientCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MClientCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MClientCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MClientCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MClientCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MClientCenterList", pm); }

    public Map<String, MCustomerPickingCQ> xdfgetCenterId_QueryDerivedReferrer_MCustomerPickingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MCustomerPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MCustomerPickingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MCustomerPickingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MCustomerPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_MCustomerPickingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MCustomerPickingList", pm); }

    public Map<String, MDeliveryCourseCQ> xdfgetCenterId_QueryDerivedReferrer_MDeliveryCourseList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseList(MDeliveryCourseCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MDeliveryCourseList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MDeliveryCourseList"); }
    public String keepCenterId_QueryDerivedReferrer_MDeliveryCourseListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MDeliveryCourseList", pm); }

    public Map<String, MGeneralCQ> xdfgetCenterId_QueryDerivedReferrer_MGeneralList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MGeneralList"); }
    public String keepCenterId_QueryDerivedReferrer_MGeneralList(MGeneralCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MGeneralList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MGeneralListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MGeneralList"); }
    public String keepCenterId_QueryDerivedReferrer_MGeneralListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MGeneralList", pm); }

    public Map<String, MLocationCQ> xdfgetCenterId_QueryDerivedReferrer_MLocationList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCenterId_QueryDerivedReferrer_MLocationList(MLocationCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MLocationList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MLocationListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MLocationList"); }
    public String keepCenterId_QueryDerivedReferrer_MLocationListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MLocationList", pm); }

    public Map<String, MNizoroeCQ> xdfgetCenterId_QueryDerivedReferrer_MNizoroeList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MNizoroeList"); }
    public String keepCenterId_QueryDerivedReferrer_MNizoroeList(MNizoroeCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MNizoroeList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MNizoroeListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MNizoroeList"); }
    public String keepCenterId_QueryDerivedReferrer_MNizoroeListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MNizoroeList", pm); }

    public Map<String, MNumberingCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MNumberingCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterList(MNumberingCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MNumberingCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MNumberingCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MNumberingCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MNumberingCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MNumberingCenterList", pm); }

    public Map<String, MUserCenterCQ> xdfgetCenterId_QueryDerivedReferrer_MUserCenterList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MUserCenterList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MUserCenterListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserCenterListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MUserCenterList", pm); }

    public Map<String, MUserLoginCQ> xdfgetCenterId_QueryDerivedReferrer_MUserLoginList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginList(MUserLoginCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MUserLoginList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MUserLoginListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MUserLoginList"); }
    public String keepCenterId_QueryDerivedReferrer_MUserLoginListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MUserLoginList", pm); }

    public Map<String, MWarehouseCQ> xdfgetCenterId_QueryDerivedReferrer_MWarehouseList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseList(MWarehouseCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MWarehouseList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MWarehouseListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MWarehouseList"); }
    public String keepCenterId_QueryDerivedReferrer_MWarehouseListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MWarehouseList", pm); }

    public Map<String, MWebHtInfoCQ> xdfgetCenterId_QueryDerivedReferrer_MWebHtInfoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoList(MWebHtInfoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_MWebHtInfoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_MWebHtInfoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_MWebHtInfoList"); }
    public String keepCenterId_QueryDerivedReferrer_MWebHtInfoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_MWebHtInfoList", pm); }

    public Map<String, TAllocInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TAllocInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TAllocInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TAllocInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TAllocInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TAllocInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TAllocInstHList", pm); }

    public Map<String, TEcOrderHCQ> xdfgetCenterId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepCenterId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TInventoryHCQ> xdfgetCenterId_QueryDerivedReferrer_TInventoryHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHList(TInventoryHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TInventoryHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TInventoryHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TInventoryHList"); }
    public String keepCenterId_QueryDerivedReferrer_TInventoryHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TInventoryHList", pm); }

    public Map<String, TMoveInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TMoveInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHList(TMoveInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TMoveInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TMoveInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TMoveInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TMoveInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TMoveInstHList", pm); }

    public Map<String, TPackingHCQ> xdfgetCenterId_QueryDerivedReferrer_TPackingHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPackingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPackingHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPackingHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPackingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPackingHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPackingHList", pm); }

    public Map<String, TPicMthdRcmdCQ> xdfgetCenterId_QueryDerivedReferrer_TPicMthdRcmdList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdList(TPicMthdRcmdCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPicMthdRcmdList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPicMthdRcmdList"); }
    public String keepCenterId_QueryDerivedReferrer_TPicMthdRcmdListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPicMthdRcmdList", pm); }

    public Map<String, TPickingHCQ> xdfgetCenterId_QueryDerivedReferrer_TPickingHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TPickingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TPickingHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TPickingHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TPickingHList"); }
    public String keepCenterId_QueryDerivedReferrer_TPickingHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TPickingHList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetCenterId_QueryDerivedReferrer_TReceivePlanHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHList(TReceivePlanHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TReceivePlanHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TReceivePlanHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TReceivePlanHList"); }
    public String keepCenterId_QueryDerivedReferrer_TReceivePlanHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TReceivePlanHList", pm); }

    public Map<String, TSerialNoCQ> xdfgetCenterId_QueryDerivedReferrer_TSerialNoList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoList(TSerialNoCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TSerialNoList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TSerialNoListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TSerialNoList"); }
    public String keepCenterId_QueryDerivedReferrer_TSerialNoListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TSerialNoList", pm); }

    public Map<String, TShippingInstHCQ> xdfgetCenterId_QueryDerivedReferrer_TShippingInstHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TShippingInstHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TShippingInstHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TShippingInstHList"); }
    public String keepCenterId_QueryDerivedReferrer_TShippingInstHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TShippingInstHList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetCenterId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepCenterId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    public Map<String, WHtInventoryInputProdCQ> xdfgetCenterId_QueryDerivedReferrer_WHtInventoryInputProdList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtInventoryInputProdList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtInventoryInputProdList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtInventoryInputProdList", pm); }

    public Map<String, WHtLoadingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtLoadingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtLoadingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtLoadingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtLoadingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtLoadingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtLoadingList", pm); }

    public Map<String, WHtPickingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtPickingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtPickingList(WHtPickingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtPickingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtPickingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtPickingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtPickingList", pm); }

    public Map<String, WHtReceiveInspectionCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveInspectionList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionList(WHtReceiveInspectionCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveInspectionList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveInspectionList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveInspectionListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveInspectionList", pm); }

    public Map<String, WHtReceiveNoPlanInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspList(WHtReceiveNoPlanInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveNoPlanInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveNoPlanInspList", pm); }

    public Map<String, WHtReceiveStoreCQ> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveStoreList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreList(WHtReceiveStoreCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtReceiveStoreList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtReceiveStoreList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtReceiveStoreListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtReceiveStoreList", pm); }

    public Map<String, WHtSerialReceiveInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtSerialReceiveInspList", pm); }

    public Map<String, WHtSerialShippingInspCQ> xdfgetCenterId_QueryDerivedReferrer_WHtSerialShippingInspList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtSerialShippingInspList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtSerialShippingInspList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtSerialShippingInspList", pm); }

    public Map<String, WHtShippingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtShippingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingList(WHtShippingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtShippingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtShippingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtShippingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtShippingList", pm); }

    public Map<String, WHtShippingPickingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtShippingPickingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingList(WHtShippingPickingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtShippingPickingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtShippingPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtShippingPickingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtShippingPickingList", pm); }

    public Map<String, WHtTotalPickingCQ> xdfgetCenterId_QueryDerivedReferrer_WHtTotalPickingList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtTotalPickingList(WHtTotalPickingCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WHtTotalPickingList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WHtTotalPickingListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WHtTotalPickingList"); }
    public String keepCenterId_QueryDerivedReferrer_WHtTotalPickingListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WHtTotalPickingList", pm); }

    public Map<String, WSglRowShipInspHCQ> xdfgetCenterId_QueryDerivedReferrer_WSglRowShipInspHList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHList(WSglRowShipInspHCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WSglRowShipInspHList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WSglRowShipInspHList"); }
    public String keepCenterId_QueryDerivedReferrer_WSglRowShipInspHListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WSglRowShipInspHList", pm); }

    public Map<String, WShippingInterruptCQ> xdfgetCenterId_QueryDerivedReferrer_WShippingInterruptList() { return xgetSQueMap("centerId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptList(WShippingInterruptCQ sq) { return xkeepSQue("centerId_QueryDerivedReferrer_WShippingInterruptList", sq); }
    public Map<String, Object> xdfgetCenterId_QueryDerivedReferrer_WShippingInterruptListParameter() { return xgetSQuePmMap("centerId_QueryDerivedReferrer_WShippingInterruptList"); }
    public String keepCenterId_QueryDerivedReferrer_WShippingInterruptListParameter(Object pm) { return xkeepSQuePm("centerId_QueryDerivedReferrer_WShippingInterruptList", pm); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _centerNm;
    public ConditionValue xdfgetCenterNm()
    { if (_centerNm == null) { _centerNm = nCV(); }
      return _centerNm; }
    protected ConditionValue xgetCValueCenterNm() { return xdfgetCenterNm(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterNm_Asc() { regOBA("CENTER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterNm_Desc() { regOBD("CENTER_NM"); return this; }

    protected ConditionValue _centerAbbr;
    public ConditionValue xdfgetCenterAbbr()
    { if (_centerAbbr == null) { _centerAbbr = nCV(); }
      return _centerAbbr; }
    protected ConditionValue xgetCValueCenterAbbr() { return xdfgetCenterAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterAbbr_Asc() { regOBA("CENTER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CenterAbbr_Desc() { regOBD("CENTER_ABBR"); return this; }

    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {IX, BIGINT(19), FK to b_culture}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _timeZoneId;
    public ConditionValue xdfgetTimeZoneId()
    { if (_timeZoneId == null) { _timeZoneId = nCV(); }
      return _timeZoneId; }
    protected ConditionValue xgetCValueTimeZoneId() { return xdfgetTimeZoneId(); }

    public Map<String, BTimeZoneCQ> getTimeZoneId_InScopeRelation_BTimeZone() { return xgetSQueMap("timeZoneId_InScopeRelation_BTimeZone"); }
    public String keepTimeZoneId_InScopeRelation_BTimeZone(BTimeZoneCQ sq) { return xkeepSQue("timeZoneId_InScopeRelation_BTimeZone", sq); }

    public Map<String, BTimeZoneCQ> getTimeZoneId_NotInScopeRelation_BTimeZone() { return xgetSQueMap("timeZoneId_NotInScopeRelation_BTimeZone"); }
    public String keepTimeZoneId_NotInScopeRelation_BTimeZone(BTimeZoneCQ sq) { return xkeepSQue("timeZoneId_NotInScopeRelation_BTimeZone", sq); }

    /**
     * Add order-by as ascend. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TimeZoneId_Asc() { regOBA("TIME_ZONE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIME_ZONE_ID: {IX, BIGINT(19), FK to b_time_zone}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TimeZoneId_Desc() { regOBD("TIME_ZONE_ID"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /**
     * Add order-by as ascend. <br>
     * ADDRESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address_Asc() { regOBA("ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADDRESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_Address_Desc() { regOBD("ADDRESS"); return this; }

    protected ConditionValue _telNo;
    public ConditionValue xdfgetTelNo()
    { if (_telNo == null) { _telNo = nCV(); }
      return _telNo; }
    protected ConditionValue xgetCValueTelNo() { return xdfgetTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TelNo_Asc() { regOBA("TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_TelNo_Desc() { regOBD("TEL_NO"); return this; }

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
    public BsMCenterCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCenterCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCenterCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCenterCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCenterCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCenterCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCenterCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCenterCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCenterCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCenterCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCenterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCenterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCenterCQ bq = (MCenterCQ)bqs;
        MCenterCQ uq = (MCenterCQ)uqs;
        if (bq.hasConditionQueryBTimeZone()) {
            uq.queryBTimeZone().reflectRelationOnUnionQuery(bq.queryBTimeZone(), uq.queryBTimeZone());
        }
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
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
     * b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     * @return The instance of condition-query. (NotNull)
     */
    public BTimeZoneCQ queryBTimeZone() {
        return xdfgetConditionQueryBTimeZone();
    }
    public BTimeZoneCQ xdfgetConditionQueryBTimeZone() {
        String prop = "bTimeZone";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBTimeZone()); xsetupOuterJoinBTimeZone(); }
        return xgetQueRlMap(prop);
    }
    protected BTimeZoneCQ xcreateQueryBTimeZone() {
        String nrp = xresolveNRP("m_center", "bTimeZone"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BTimeZoneCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bTimeZone", nrp);
    }
    protected void xsetupOuterJoinBTimeZone() { xregOutJo("bTimeZone"); }
    public boolean hasConditionQueryBTimeZone() { return xhasQueRlMap("bTimeZone"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("m_center", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

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
        String nrp = xresolveNRP("m_center", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, MCenterCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCenterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCenterCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCenterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCenterCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCenterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCenterCQ> _myselfExistsMap;
    public Map<String, MCenterCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCenterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCenterCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCenterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCenterCB.class.getName(); }
    protected String xCQ() { return MCenterCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
