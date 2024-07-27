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
 * The condition-query for in-line of m_base_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public class MBaseSalesOrgCIQ extends AbstractBsMBaseSalesOrgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMBaseSalesOrgCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MBaseSalesOrgCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMBaseSalesOrgCQ myCQ) {
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
    protected ConditionValue xgetCValueBaseSalesOrgId() { return _myCQ.xdfgetBaseSalesOrgId(); }
    protected ConditionValue xgetCValueBaseCd() { return _myCQ.xdfgetBaseCd(); }
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    public String keepSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepSalesOrgId_InScopeRelation_MSalesOrg(sq); }
    public String keepSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq)
    { return _myCQ.keepSalesOrgId_NotInScopeRelation_MSalesOrg(sq); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_InScopeRelation_MCarrier(sq); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq)
    { return _myCQ.keepCarrierId_NotInScopeRelation_MCarrier(sq); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
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
    public String keepScalarCondition(MBaseSalesOrgCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MBaseSalesOrgCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MBaseSalesOrgCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MBaseSalesOrgCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MBaseSalesOrgCB.class.getName(); }
    protected String xinCQ() { return MBaseSalesOrgCQ.class.getName(); }
}
