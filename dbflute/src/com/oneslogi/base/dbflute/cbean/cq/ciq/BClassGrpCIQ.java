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
 * The condition-query for in-line of b_class_grp.
 * @author DBFlute(AutoGenerator)
 */
public class BClassGrpCIQ extends AbstractBsBClassGrpCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBClassGrpCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BClassGrpCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBClassGrpCQ myCQ) {
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
    protected ConditionValue xgetCValueClassGrpId() { return _myCQ.xdfgetClassGrpId(); }
    public String keepClassGrpId_ExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepClassGrpId_NotExistsReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepClassGrpId_SpecifyDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlList(BClassGrpDtlCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepClassGrpId_QueryDerivedReferrer_BClassGrpDtlListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueClassGrpCd() { return _myCQ.xdfgetClassGrpCd(); }
    protected ConditionValue xgetCValueClassGrpComment() { return _myCQ.xdfgetClassGrpComment(); }
    protected ConditionValue xgetCValueClassId() { return _myCQ.xdfgetClassId(); }
    public String keepClassId_InScopeRelation_BClass(BClassCQ sq)
    { return _myCQ.keepClassId_InScopeRelation_BClass(sq); }
    public String keepClassId_NotInScopeRelation_BClass(BClassCQ sq)
    { return _myCQ.keepClassId_NotInScopeRelation_BClass(sq); }
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
    public String keepScalarCondition(BClassGrpCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BClassGrpCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BClassGrpCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BClassGrpCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BClassGrpCB.class.getName(); }
    protected String xinCQ() { return BClassGrpCQ.class.getName(); }
}
