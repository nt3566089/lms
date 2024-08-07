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
 * The condition-query for in-line of w_work.
 * @author DBFlute(AutoGenerator)
 */
public class WWorkCIQ extends AbstractBsWWorkCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWWorkCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WWorkCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWWorkCQ myCQ) {
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
    protected ConditionValue xgetCValueWorkId() { return _myCQ.xdfgetWorkId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueWorkUserCd() { return _myCQ.xdfgetWorkUserCd(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueClockInFlg() { return _myCQ.xdfgetClockInFlg(); }
    protected ConditionValue xgetCValueClockOutFlg() { return _myCQ.xdfgetClockOutFlg(); }
    protected ConditionValue xgetCValueEntryStartDt() { return _myCQ.xdfgetEntryStartDt(); }
    protected ConditionValue xgetCValueEntryStartTm() { return _myCQ.xdfgetEntryStartTm(); }
    protected ConditionValue xgetCValueEntryEndDt() { return _myCQ.xdfgetEntryEndDt(); }
    protected ConditionValue xgetCValueEntryEndTm() { return _myCQ.xdfgetEntryEndTm(); }
    protected ConditionValue xgetCValueBreakStartFlg() { return _myCQ.xdfgetBreakStartFlg(); }
    protected ConditionValue xgetCValueBreakStartDt() { return _myCQ.xdfgetBreakStartDt(); }
    protected ConditionValue xgetCValueBreakStartTm() { return _myCQ.xdfgetBreakStartTm(); }
    protected ConditionValue xgetCValueBreakEndDt() { return _myCQ.xdfgetBreakEndDt(); }
    protected ConditionValue xgetCValueBreakEndTm() { return _myCQ.xdfgetBreakEndTm(); }
    protected ConditionValue xgetCValueForcedClockOutFlg() { return _myCQ.xdfgetForcedClockOutFlg(); }
    protected ConditionValue xgetCValueWorkFlg() { return _myCQ.xdfgetWorkFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMsg() { return _myCQ.xdfgetErrorMsg(); }
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
    public String keepScalarCondition(WWorkCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WWorkCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WWorkCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WWorkCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WWorkCB.class.getName(); }
    protected String xinCQ() { return WWorkCQ.class.getName(); }
}
