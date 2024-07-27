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
 * The condition-query for in-line of t_receive_plan_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanDataTransferCIQ extends AbstractBsTReceivePlanDataTransferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTReceivePlanDataTransferCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TReceivePlanDataTransferCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTReceivePlanDataTransferCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanDataTransferId() { return _myCQ.xdfgetReceivePlanDataTransferId(); }
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_InScopeRelation_TReceivePlanB(sq); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(sq); }
    protected ConditionValue xgetCValueDataTransferOnlyStr01() { return _myCQ.xdfgetDataTransferOnlyStr01(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr02() { return _myCQ.xdfgetDataTransferOnlyStr02(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr03() { return _myCQ.xdfgetDataTransferOnlyStr03(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr04() { return _myCQ.xdfgetDataTransferOnlyStr04(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr05() { return _myCQ.xdfgetDataTransferOnlyStr05(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr06() { return _myCQ.xdfgetDataTransferOnlyStr06(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr07() { return _myCQ.xdfgetDataTransferOnlyStr07(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr08() { return _myCQ.xdfgetDataTransferOnlyStr08(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr09() { return _myCQ.xdfgetDataTransferOnlyStr09(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr10() { return _myCQ.xdfgetDataTransferOnlyStr10(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr11() { return _myCQ.xdfgetDataTransferOnlyStr11(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr12() { return _myCQ.xdfgetDataTransferOnlyStr12(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr13() { return _myCQ.xdfgetDataTransferOnlyStr13(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr14() { return _myCQ.xdfgetDataTransferOnlyStr14(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr15() { return _myCQ.xdfgetDataTransferOnlyStr15(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr16() { return _myCQ.xdfgetDataTransferOnlyStr16(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr17() { return _myCQ.xdfgetDataTransferOnlyStr17(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr18() { return _myCQ.xdfgetDataTransferOnlyStr18(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr19() { return _myCQ.xdfgetDataTransferOnlyStr19(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr20() { return _myCQ.xdfgetDataTransferOnlyStr20(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr21() { return _myCQ.xdfgetDataTransferOnlyStr21(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr22() { return _myCQ.xdfgetDataTransferOnlyStr22(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr23() { return _myCQ.xdfgetDataTransferOnlyStr23(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr24() { return _myCQ.xdfgetDataTransferOnlyStr24(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr25() { return _myCQ.xdfgetDataTransferOnlyStr25(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr26() { return _myCQ.xdfgetDataTransferOnlyStr26(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr27() { return _myCQ.xdfgetDataTransferOnlyStr27(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr28() { return _myCQ.xdfgetDataTransferOnlyStr28(); }
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
    public String keepScalarCondition(TReceivePlanDataTransferCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TReceivePlanDataTransferCB.class.getName(); }
    protected String xinCQ() { return TReceivePlanDataTransferCQ.class.getName(); }
}
