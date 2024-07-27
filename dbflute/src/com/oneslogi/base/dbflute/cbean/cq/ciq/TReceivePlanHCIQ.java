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
 * The condition-query for in-line of t_receive_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanHCIQ extends AbstractBsTReceivePlanHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTReceivePlanHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TReceivePlanHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTReceivePlanHCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanHId() { return _myCQ.xdfgetReceivePlanHId(); }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanHId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanHId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueStockTypeId() { return _myCQ.xdfgetStockTypeId(); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_InScopeRelation_MStockType(sq); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq)
    { return _myCQ.keepStockTypeId_NotInScopeRelation_MStockType(sq); }
    protected ConditionValue xgetCValueReceivePlanDt() { return _myCQ.xdfgetReceivePlanDt(); }
    protected ConditionValue xgetCValuePlanClientReceiveNo() { return _myCQ.xdfgetPlanClientReceiveNo(); }
    protected ConditionValue xgetCValueReceiveSlipNo() { return _myCQ.xdfgetReceiveSlipNo(); }
    protected ConditionValue xgetCValuePlanSupplierId() { return _myCQ.xdfgetPlanSupplierId(); }
    public String keepPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq)
    { return _myCQ.keepPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId(sq); }
    public String keepPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq)
    { return _myCQ.keepPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId(sq); }
    protected ConditionValue xgetCValuePlanSupplierCd() { return _myCQ.xdfgetPlanSupplierCd(); }
    protected ConditionValue xgetCValuePlanDepositId() { return _myCQ.xdfgetPlanDepositId(); }
    public String keepPlanDepositId_InScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq)
    { return _myCQ.keepPlanDepositId_InScopeRelation_MCustomerByPlanDepositId(sq); }
    public String keepPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq)
    { return _myCQ.keepPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId(sq); }
    protected ConditionValue xgetCValuePlanDepositCd() { return _myCQ.xdfgetPlanDepositCd(); }
    protected ConditionValue xgetCValueReceiveStatus() { return _myCQ.xdfgetReceiveStatus(); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueReceiveDeliveryStatus() { return _myCQ.xdfgetReceiveDeliveryStatus(); }
    protected ConditionValue xgetCValueOldReceivePlanHId() { return _myCQ.xdfgetOldReceivePlanHId(); }
    public String keepOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq)
    { return _myCQ.keepOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf(sq); }
    public String keepOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq)
    { return _myCQ.keepOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf(sq); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueCenterTransitFlg() { return _myCQ.xdfgetCenterTransitFlg(); }
    protected ConditionValue xgetCValuePickingHId() { return _myCQ.xdfgetPickingHId(); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_InScopeRelation_TPickingH(sq); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_NotInScopeRelation_TPickingH(sq); }
    protected ConditionValue xgetCValueSapReceiveSlipNo() { return _myCQ.xdfgetSapReceiveSlipNo(); }
    protected ConditionValue xgetCValueSlipTypeId() { return _myCQ.xdfgetSlipTypeId(); }
    protected ConditionValue xgetCValueSlipTypeCd() { return _myCQ.xdfgetSlipTypeCd(); }
    protected ConditionValue xgetCValuePurchaseOrderNo() { return _myCQ.xdfgetPurchaseOrderNo(); }
    protected ConditionValue xgetCValueReceiveReasonCd() { return _myCQ.xdfgetReceiveReasonCd(); }
    protected ConditionValue xgetCValueOrderDate() { return _myCQ.xdfgetOrderDate(); }
    protected ConditionValue xgetCValueOrderTime() { return _myCQ.xdfgetOrderTime(); }
    protected ConditionValue xgetCValueConfirmedDeliveryDt() { return _myCQ.xdfgetConfirmedDeliveryDt(); }
    protected ConditionValue xgetCValuePlantCd() { return _myCQ.xdfgetPlantCd(); }
    protected ConditionValue xgetCValueStorageSpaceCd() { return _myCQ.xdfgetStorageSpaceCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaNm1() { return _myCQ.xdfgetTenhanshaNm1(); }
    protected ConditionValue xgetCValueTenhanshaNm2() { return _myCQ.xdfgetTenhanshaNm2(); }
    protected ConditionValue xgetCValueSapUserCd() { return _myCQ.xdfgetSapUserCd(); }
    protected ConditionValue xgetCValueSapUserNm() { return _myCQ.xdfgetSapUserNm(); }
    protected ConditionValue xgetCValueCustomerOrderNo() { return _myCQ.xdfgetCustomerOrderNo(); }
    protected ConditionValue xgetCValueSapVenderCd() { return _myCQ.xdfgetSapVenderCd(); }
    protected ConditionValue xgetCValueSapSupplierCd() { return _myCQ.xdfgetSapSupplierCd(); }
    protected ConditionValue xgetCValueTodayFlg() { return _myCQ.xdfgetTodayFlg(); }
    protected ConditionValue xgetCValueSanshaDeliverySlipNo1() { return _myCQ.xdfgetSanshaDeliverySlipNo1(); }
    protected ConditionValue xgetCValueDataTypeCd() { return _myCQ.xdfgetDataTypeCd(); }
    protected ConditionValue xgetCValueSanshaTypeCd() { return _myCQ.xdfgetSanshaTypeCd(); }
    protected ConditionValue xgetCValueReceiveReasonNm() { return _myCQ.xdfgetReceiveReasonNm(); }
    protected ConditionValue xgetCValueModTypeCd() { return _myCQ.xdfgetModTypeCd(); }
    protected ConditionValue xgetCValueIfId() { return _myCQ.xdfgetIfId(); }
    protected ConditionValue xgetCValueSpareStr() { return _myCQ.xdfgetSpareStr(); }
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
    public String keepScalarCondition(TReceivePlanHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TReceivePlanHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TReceivePlanHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TReceivePlanHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TReceivePlanHCB.class.getName(); }
    protected String xinCQ() { return TReceivePlanHCQ.class.getName(); }
}
