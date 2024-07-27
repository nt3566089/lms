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
 * The condition-query for in-line of t_bldl3350.
 * @author DBFlute(AutoGenerator)
 */
public class TBldl3350CIQ extends AbstractBsTBldl3350CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTBldl3350CQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TBldl3350CIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTBldl3350CQ myCQ) {
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
    protected ConditionValue xgetCValueBldl3350Id() { return _myCQ.xdfgetBldl3350Id(); }
    protected ConditionValue xgetCValueYearmonth() { return _myCQ.xdfgetYearmonth(); }
    protected ConditionValue xgetCValueBaseNm() { return _myCQ.xdfgetBaseNm(); }
    protected ConditionValue xgetCValueMonth() { return _myCQ.xdfgetMonth(); }
    protected ConditionValue xgetCValueSalesOrgNm() { return _myCQ.xdfgetSalesOrgNm(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueYamatoShippingNum() { return _myCQ.xdfgetYamatoShippingNum(); }
    protected ConditionValue xgetCValueYamatoEcShippingNum() { return _myCQ.xdfgetYamatoEcShippingNum(); }
    protected ConditionValue xgetCValueSagawaShippingNum() { return _myCQ.xdfgetSagawaShippingNum(); }
    protected ConditionValue xgetCValueSagawaEcShippingNum() { return _myCQ.xdfgetSagawaEcShippingNum(); }
    protected ConditionValue xgetCValueSagawa2ShippingNum() { return _myCQ.xdfgetSagawa2ShippingNum(); }
    protected ConditionValue xgetCValueSagawa2EcShippingNum() { return _myCQ.xdfgetSagawa2EcShippingNum(); }
    protected ConditionValue xgetCValueOtherShippingNum() { return _myCQ.xdfgetOtherShippingNum(); }
    protected ConditionValue xgetCValueOtherEcShippingNum() { return _myCQ.xdfgetOtherEcShippingNum(); }
    protected ConditionValue xgetCValueCancelShippingNum() { return _myCQ.xdfgetCancelShippingNum(); }
    protected ConditionValue xgetCValueCancelEcShippingNum() { return _myCQ.xdfgetCancelEcShippingNum(); }
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
    public String keepScalarCondition(TBldl3350CQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TBldl3350CQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TBldl3350CQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TBldl3350CQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TBldl3350CB.class.getName(); }
    protected String xinCQ() { return TBldl3350CQ.class.getName(); }
}
