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
 * The condition-query for in-line of m_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public class MKoguchiDeliveryCIQ extends AbstractBsMKoguchiDeliveryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMKoguchiDeliveryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MKoguchiDeliveryCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMKoguchiDeliveryCQ myCQ) {
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
    protected ConditionValue xgetCValueKoguchiDeliveryId() { return _myCQ.xdfgetKoguchiDeliveryId(); }
    protected ConditionValue xgetCValueBaseCd() { return _myCQ.xdfgetBaseCd(); }
    protected ConditionValue xgetCValueServSalesOrgId() { return _myCQ.xdfgetServSalesOrgId(); }
    public String keepServSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepServSalesOrgId_InScopeRelation_MSalesOrg(sq); }
    public String keepServSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepServSalesOrgId_NotInScopeRelation_MSalesOrg(sq); }
    protected ConditionValue xgetCValueServSalesOrgCd() { return _myCQ.xdfgetServSalesOrgCd(); }
    protected ConditionValue xgetCValueServSalesOrgNm() { return _myCQ.xdfgetServSalesOrgNm(); }
    protected ConditionValue xgetCValueDirectFlg() { return _myCQ.xdfgetDirectFlg(); }
    protected ConditionValue xgetCValueUrgentFlg() { return _myCQ.xdfgetUrgentFlg(); }
    protected ConditionValue xgetCValueDeliveryFlg() { return _myCQ.xdfgetDeliveryFlg(); }
    protected ConditionValue xgetCValueKoguchiDeliveryCd() { return _myCQ.xdfgetKoguchiDeliveryCd(); }
    protected ConditionValue xgetCValueKoguchiDeliveryNm() { return _myCQ.xdfgetKoguchiDeliveryNm(); }
    protected ConditionValue xgetCValueUniDeliveryCd() { return _myCQ.xdfgetUniDeliveryCd(); }
    protected ConditionValue xgetCValueUniDeliveryNm() { return _myCQ.xdfgetUniDeliveryNm(); }
    protected ConditionValue xgetCValueFwTypeCd() { return _myCQ.xdfgetFwTypeCd(); }
    protected ConditionValue xgetCValueMcaTypeCd() { return _myCQ.xdfgetMcaTypeCd(); }
    protected ConditionValue xgetCValueYouhinTypeCd() { return _myCQ.xdfgetYouhinTypeCd(); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_InScopeRelation_MCarrier(sq); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_NotInScopeRelation_MCarrier(sq); }
    protected ConditionValue xgetCValueReqSalesOrgId() { return _myCQ.xdfgetReqSalesOrgId(); }
    protected ConditionValue xgetCValueReqSalesOrgCd() { return _myCQ.xdfgetReqSalesOrgCd(); }
    protected ConditionValue xgetCValueReqSalesOrgNm() { return _myCQ.xdfgetReqSalesOrgNm(); }
    protected ConditionValue xgetCValueReqSalesOrgBranchNm() { return _myCQ.xdfgetReqSalesOrgBranchNm(); }
    protected ConditionValue xgetCValueReqSalesOrgAddress1() { return _myCQ.xdfgetReqSalesOrgAddress1(); }
    protected ConditionValue xgetCValueReqSalesOrgAddress2() { return _myCQ.xdfgetReqSalesOrgAddress2(); }
    protected ConditionValue xgetCValueReqSalesOrgZipCd() { return _myCQ.xdfgetReqSalesOrgZipCd(); }
    protected ConditionValue xgetCValueReqSalesOrgTelNo() { return _myCQ.xdfgetReqSalesOrgTelNo(); }
    protected ConditionValue xgetCValueReqSalesOrgFaxNo() { return _myCQ.xdfgetReqSalesOrgFaxNo(); }
    protected ConditionValue xgetCValueRemark1() { return _myCQ.xdfgetRemark1(); }
    protected ConditionValue xgetCValueRemark2() { return _myCQ.xdfgetRemark2(); }
    protected ConditionValue xgetCValueRemark3() { return _myCQ.xdfgetRemark3(); }
    protected ConditionValue xgetCValueRemark4() { return _myCQ.xdfgetRemark4(); }
    protected ConditionValue xgetCValueIndvOut() { return _myCQ.xdfgetIndvOut(); }
    protected ConditionValue xgetCValueInvoiceSummary() { return _myCQ.xdfgetInvoiceSummary(); }
    protected ConditionValue xgetCValuePsam() { return _myCQ.xdfgetPsam(); }
    protected ConditionValue xgetCValueAbolishDt() { return _myCQ.xdfgetAbolishDt(); }
    protected ConditionValue xgetCValueFloorCompFlg() { return _myCQ.xdfgetFloorCompFlg(); }
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
    public String keepScalarCondition(MKoguchiDeliveryCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MKoguchiDeliveryCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MKoguchiDeliveryCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MKoguchiDeliveryCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MKoguchiDeliveryCB.class.getName(); }
    protected String xinCQ() { return MKoguchiDeliveryCQ.class.getName(); }
}
