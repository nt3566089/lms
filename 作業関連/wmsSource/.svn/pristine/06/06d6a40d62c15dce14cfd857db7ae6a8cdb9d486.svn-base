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
 * The condition-query for in-line of m_carrier_decision.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierDecisionCIQ extends AbstractBsMCarrierDecisionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMCarrierDecisionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MCarrierDecisionCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMCarrierDecisionCQ myCQ) {
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
    protected ConditionValue xgetCValueCarrierDecisionId() { return _myCQ.xdfgetCarrierDecisionId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueZipCd() { return _myCQ.xdfgetZipCd(); }
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    public String keepSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepSalesOrgId_InScopeRelation_MSalesOrg(sq); }
    public String keepSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepSalesOrgId_NotInScopeRelation_MSalesOrg(sq); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_InScopeRelation_MCustomer(sq); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueDirectKohaiTypeCd() { return _myCQ.xdfgetDirectKohaiTypeCd(); }
    protected ConditionValue xgetCValuePrefecture() { return _myCQ.xdfgetPrefecture(); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    public String keepCarrierId_InScopeRelation_MCarrierByCarrierId(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_InScopeRelation_MCarrierByCarrierId(sq); }
    public String keepCarrierId_NotInScopeRelation_MCarrierByCarrierId(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_NotInScopeRelation_MCarrierByCarrierId(sq); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierId1() { return _myCQ.xdfgetCarrierId1(); }
    public String keepCarrierId1_InScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq)
    { return _myCQ.keepCarrierId1_InScopeRelation_MCarrierByCarrierId1(sq); }
    public String keepCarrierId1_NotInScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq)
    { return _myCQ.keepCarrierId1_NotInScopeRelation_MCarrierByCarrierId1(sq); }
    protected ConditionValue xgetCValueCarrierCd1() { return _myCQ.xdfgetCarrierCd1(); }
    protected ConditionValue xgetCValueCarrierId2() { return _myCQ.xdfgetCarrierId2(); }
    public String keepCarrierId2_InScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq)
    { return _myCQ.keepCarrierId2_InScopeRelation_MCarrierByCarrierId2(sq); }
    public String keepCarrierId2_NotInScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq)
    { return _myCQ.keepCarrierId2_NotInScopeRelation_MCarrierByCarrierId2(sq); }
    protected ConditionValue xgetCValueCarrierCd2() { return _myCQ.xdfgetCarrierCd2(); }
    protected ConditionValue xgetCValueCarrierId3() { return _myCQ.xdfgetCarrierId3(); }
    public String keepCarrierId3_InScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq)
    { return _myCQ.keepCarrierId3_InScopeRelation_MCarrierByCarrierId3(sq); }
    public String keepCarrierId3_NotInScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq)
    { return _myCQ.keepCarrierId3_NotInScopeRelation_MCarrierByCarrierId3(sq); }
    protected ConditionValue xgetCValueCarrierCd3() { return _myCQ.xdfgetCarrierCd3(); }
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
    public String keepScalarCondition(MCarrierDecisionCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MCarrierDecisionCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MCarrierDecisionCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MCarrierDecisionCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MCarrierDecisionCB.class.getName(); }
    protected String xinCQ() { return MCarrierDecisionCQ.class.getName(); }
}
