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
 * The condition-query for in-line of t_bldl5150.
 * @author DBFlute(AutoGenerator)
 */
public class TBldl5150CIQ extends AbstractBsTBldl5150CQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTBldl5150CQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TBldl5150CIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTBldl5150CQ myCQ) {
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
    protected ConditionValue xgetCValueBldl5150Id() { return _myCQ.xdfgetBldl5150Id(); }
    protected ConditionValue xgetCValueYearmonth() { return _myCQ.xdfgetYearmonth(); }
    protected ConditionValue xgetCValueBaseNm() { return _myCQ.xdfgetBaseNm(); }
    protected ConditionValue xgetCValueMonth() { return _myCQ.xdfgetMonth(); }
    protected ConditionValue xgetCValueRowNo() { return _myCQ.xdfgetRowNo(); }
    protected ConditionValue xgetCValueReceiveDt() { return _myCQ.xdfgetReceiveDt(); }
    protected ConditionValue xgetCValueFwRcvCnt() { return _myCQ.xdfgetFwRcvCnt(); }
    protected ConditionValue xgetCValueFwRcvNum() { return _myCQ.xdfgetFwRcvNum(); }
    protected ConditionValue xgetCValueFwCaseNum() { return _myCQ.xdfgetFwCaseNum(); }
    protected ConditionValue xgetCValueUnRcvCnt() { return _myCQ.xdfgetUnRcvCnt(); }
    protected ConditionValue xgetCValueUnRcvNum() { return _myCQ.xdfgetUnRcvNum(); }
    protected ConditionValue xgetCValueUnCaseNum() { return _myCQ.xdfgetUnCaseNum(); }
    protected ConditionValue xgetCValueShRcvCnt() { return _myCQ.xdfgetShRcvCnt(); }
    protected ConditionValue xgetCValueShRcvNum() { return _myCQ.xdfgetShRcvNum(); }
    protected ConditionValue xgetCValueShCaseNum() { return _myCQ.xdfgetShCaseNum(); }
    protected ConditionValue xgetCValueHmRcvCnt() { return _myCQ.xdfgetHmRcvCnt(); }
    protected ConditionValue xgetCValueHmRcvNum() { return _myCQ.xdfgetHmRcvNum(); }
    protected ConditionValue xgetCValueHmCaseNum() { return _myCQ.xdfgetHmCaseNum(); }
    protected ConditionValue xgetCValueTotalRcvNum() { return _myCQ.xdfgetTotalRcvNum(); }
    protected ConditionValue xgetCValueTotalCaseNum() { return _myCQ.xdfgetTotalCaseNum(); }
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
    public String keepScalarCondition(TBldl5150CQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TBldl5150CQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TBldl5150CQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TBldl5150CQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TBldl5150CB.class.getName(); }
    protected String xinCQ() { return TBldl5150CQ.class.getName(); }
}