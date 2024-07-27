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
 * The condition-query for in-line of t_bldl5100.
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5100CIQ extends AbstractBsTBldl5100CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTBldl5100CQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TBldl5100CIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTBldl5100CQ myCQ) {
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
    protected ConditionValue xgetCValueBldl5100Id() { return _myCQ.xdfgetBldl5100Id(); }
    protected ConditionValue xgetCValueYearmonth() { return _myCQ.xdfgetYearmonth(); }
    protected ConditionValue xgetCValueBaseNm() { return _myCQ.xdfgetBaseNm(); }
    protected ConditionValue xgetCValueMonth() { return _myCQ.xdfgetMonth(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierNm() { return _myCQ.xdfgetCarrierNm(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueFwStore() { return _myCQ.xdfgetFwStore(); }
    protected ConditionValue xgetCValueFwDirect() { return _myCQ.xdfgetFwDirect(); }
    protected ConditionValue xgetCValueUnStore() { return _myCQ.xdfgetUnStore(); }
    protected ConditionValue xgetCValueUnDirect() { return _myCQ.xdfgetUnDirect(); }
    protected ConditionValue xgetCValueShStore() { return _myCQ.xdfgetShStore(); }
    protected ConditionValue xgetCValueShDirect() { return _myCQ.xdfgetShDirect(); }
    protected ConditionValue xgetCValueHmStore() { return _myCQ.xdfgetHmStore(); }
    protected ConditionValue xgetCValueHmDirect() { return _myCQ.xdfgetHmDirect(); }
    protected ConditionValue xgetCValueTotalStore() { return _myCQ.xdfgetTotalStore(); }
    protected ConditionValue xgetCValueTotalDirect() { return _myCQ.xdfgetTotalDirect(); }
    protected ConditionValue xgetCValueKoguchiInclude() { return _myCQ.xdfgetKoguchiInclude(); }
    protected ConditionValue xgetCValueKoguchiConst() { return _myCQ.xdfgetKoguchiConst(); }
    protected ConditionValue xgetCValueTotalPackNum() { return _myCQ.xdfgetTotalPackNum(); }
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
    public String keepScalarCondition(TBldl5100CQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TBldl5100CQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TBldl5100CQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TBldl5100CQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TBldl5100CB.class.getName(); }
    protected String xinCQ() { return TBldl5100CQ.class.getName(); }
}
