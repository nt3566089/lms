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
 * The condition-query for in-line of m_general.
 * @author DBFlute(AutoGenerator)
 */
public class MGeneralCIQ extends AbstractBsMGeneralCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMGeneralCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MGeneralCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMGeneralCQ myCQ) {
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
    protected ConditionValue xgetCValueGeneralId() { return _myCQ.xdfgetGeneralId(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueGeneralMasterType() { return _myCQ.xdfgetGeneralMasterType(); }
    protected ConditionValue xgetCValueGeneralMasterTypeNm() { return _myCQ.xdfgetGeneralMasterTypeNm(); }
    protected ConditionValue xgetCValueGeneralCd() { return _myCQ.xdfgetGeneralCd(); }
    protected ConditionValue xgetCValueGeneralNm() { return _myCQ.xdfgetGeneralNm(); }
    protected ConditionValue xgetCValueGeneralAbbr() { return _myCQ.xdfgetGeneralAbbr(); }
    protected ConditionValue xgetCValueCharacter1() { return _myCQ.xdfgetCharacter1(); }
    protected ConditionValue xgetCValueCharacter2() { return _myCQ.xdfgetCharacter2(); }
    protected ConditionValue xgetCValueCharacter3() { return _myCQ.xdfgetCharacter3(); }
    protected ConditionValue xgetCValueCharacter4() { return _myCQ.xdfgetCharacter4(); }
    protected ConditionValue xgetCValueCharacter5() { return _myCQ.xdfgetCharacter5(); }
    protected ConditionValue xgetCValueCharacter6() { return _myCQ.xdfgetCharacter6(); }
    protected ConditionValue xgetCValueCharacter7() { return _myCQ.xdfgetCharacter7(); }
    protected ConditionValue xgetCValueCharacter8() { return _myCQ.xdfgetCharacter8(); }
    protected ConditionValue xgetCValueCharacter9() { return _myCQ.xdfgetCharacter9(); }
    protected ConditionValue xgetCValueCharacter10() { return _myCQ.xdfgetCharacter10(); }
    protected ConditionValue xgetCValueNum1() { return _myCQ.xdfgetNum1(); }
    protected ConditionValue xgetCValueNum2() { return _myCQ.xdfgetNum2(); }
    protected ConditionValue xgetCValueNum3() { return _myCQ.xdfgetNum3(); }
    protected ConditionValue xgetCValueNum4() { return _myCQ.xdfgetNum4(); }
    protected ConditionValue xgetCValueNum5() { return _myCQ.xdfgetNum5(); }
    protected ConditionValue xgetCValueNum6() { return _myCQ.xdfgetNum6(); }
    protected ConditionValue xgetCValueNum7() { return _myCQ.xdfgetNum7(); }
    protected ConditionValue xgetCValueNum8() { return _myCQ.xdfgetNum8(); }
    protected ConditionValue xgetCValueNum9() { return _myCQ.xdfgetNum9(); }
    protected ConditionValue xgetCValueNum10() { return _myCQ.xdfgetNum10(); }
    protected ConditionValue xgetCValueComment1() { return _myCQ.xdfgetComment1(); }
    protected ConditionValue xgetCValueComment2() { return _myCQ.xdfgetComment2(); }
    protected ConditionValue xgetCValueDefaultType() { return _myCQ.xdfgetDefaultType(); }
    protected ConditionValue xgetCValueSystemType() { return _myCQ.xdfgetSystemType(); }
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
    public String keepScalarCondition(MGeneralCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MGeneralCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MGeneralCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MGeneralCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MGeneralCB.class.getName(); }
    protected String xinCQ() { return MGeneralCQ.class.getName(); }
}
