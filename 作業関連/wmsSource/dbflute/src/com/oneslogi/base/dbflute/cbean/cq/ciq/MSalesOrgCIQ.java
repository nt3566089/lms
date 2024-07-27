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
 * The condition-query for in-line of m_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public class MSalesOrgCIQ extends AbstractBsMSalesOrgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMSalesOrgCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MSalesOrgCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMSalesOrgCQ myCQ) {
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
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    public String keepSalesOrgId_ExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_ExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_ExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MDepositProductListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSalesOrgId_QueryDerivedReferrer_TInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValuePurchaseOrgCd() { return _myCQ.xdfgetPurchaseOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueTenhanshaNm1() { return _myCQ.xdfgetTenhanshaNm1(); }
    protected ConditionValue xgetCValueTenhanshaNm2() { return _myCQ.xdfgetTenhanshaNm2(); }
    protected ConditionValue xgetCValueTenhanshaZipCd() { return _myCQ.xdfgetTenhanshaZipCd(); }
    protected ConditionValue xgetCValueTenhanshaPrefecture() { return _myCQ.xdfgetTenhanshaPrefecture(); }
    protected ConditionValue xgetCValueTenhanshaAddress1() { return _myCQ.xdfgetTenhanshaAddress1(); }
    protected ConditionValue xgetCValueTenhanshaAddress2() { return _myCQ.xdfgetTenhanshaAddress2(); }
    protected ConditionValue xgetCValueTenhanshaTelNo() { return _myCQ.xdfgetTenhanshaTelNo(); }
    protected ConditionValue xgetCValueTenhanshaFaxNo() { return _myCQ.xdfgetTenhanshaFaxNo(); }
    protected ConditionValue xgetCValuePlantNormal() { return _myCQ.xdfgetPlantNormal(); }
    protected ConditionValue xgetCValuePlantDeposit() { return _myCQ.xdfgetPlantDeposit(); }
    protected ConditionValue xgetCValueLpSendFlg() { return _myCQ.xdfgetLpSendFlg(); }
    protected ConditionValue xgetCValueWmsSendFlg() { return _myCQ.xdfgetWmsSendFlg(); }
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
    public String keepScalarCondition(MSalesOrgCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MSalesOrgCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MSalesOrgCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MSalesOrgCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MSalesOrgCB.class.getName(); }
    protected String xinCQ() { return MSalesOrgCQ.class.getName(); }
}
