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
 * The condition-query for in-line of t_inventory_r.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryRCIQ extends AbstractBsTInventoryRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTInventoryRCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TInventoryRCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTInventoryRCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryBId() { return _myCQ.xdfgetInventoryBId(); }
    public String keepInventoryBId_InScopeRelation_TInventoryB(TInventoryBCQ sq)
    { return _myCQ.keepInventoryBId_InScopeRelation_TInventoryB(sq); }
    public String keepInventoryBId_NotInScopeRelation_TInventoryB(TInventoryBCQ sq)
    { return _myCQ.keepInventoryBId_NotInScopeRelation_TInventoryB(sq); }
    protected ConditionValue xgetCValueTwlOutFlg() { return _myCQ.xdfgetTwlOutFlg(); }
    protected ConditionValue xgetCValueTwlOutUserId() { return _myCQ.xdfgetTwlOutUserId(); }
    public String keepTwlOutUserId_InScopeRelation_BUserByTwlOutUserId(BUserCQ sq)
    { return _myCQ.keepTwlOutUserId_InScopeRelation_BUserByTwlOutUserId(sq); }
    public String keepTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId(BUserCQ sq)
    { return _myCQ.keepTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId(sq); }
    protected ConditionValue xgetCValueTwlOutDt() { return _myCQ.xdfgetTwlOutDt(); }
    protected ConditionValue xgetCValueInventoryDiffOutFlg() { return _myCQ.xdfgetInventoryDiffOutFlg(); }
    protected ConditionValue xgetCValueInventoryDiffOutUserId() { return _myCQ.xdfgetInventoryDiffOutUserId(); }
    public String keepInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId(sq); }
    public String keepInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId(sq); }
    protected ConditionValue xgetCValueInventoryDiffOutDt() { return _myCQ.xdfgetInventoryDiffOutDt(); }
    protected ConditionValue xgetCValueInventoryRecordOutFlg() { return _myCQ.xdfgetInventoryRecordOutFlg(); }
    protected ConditionValue xgetCValueInventoryRecordOutUserId() { return _myCQ.xdfgetInventoryRecordOutUserId(); }
    public String keepInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId(sq); }
    public String keepInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId(sq); }
    protected ConditionValue xgetCValueInventoryRecordOutDt() { return _myCQ.xdfgetInventoryRecordOutDt(); }
    protected ConditionValue xgetCValueInventoryRecordLocOutFlg() { return _myCQ.xdfgetInventoryRecordLocOutFlg(); }
    protected ConditionValue xgetCValueInventoryRecordLocOutUserId() { return _myCQ.xdfgetInventoryRecordLocOutUserId(); }
    public String keepInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId(sq); }
    public String keepInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq)
    { return _myCQ.keepInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId(sq); }
    protected ConditionValue xgetCValueInventoryRecordLocOutDt() { return _myCQ.xdfgetInventoryRecordLocOutDt(); }
    protected ConditionValue xgetCValueStockDiffOutFlg() { return _myCQ.xdfgetStockDiffOutFlg(); }
    protected ConditionValue xgetCValueStockDiffOutUserId() { return _myCQ.xdfgetStockDiffOutUserId(); }
    public String keepStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq)
    { return _myCQ.keepStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId(sq); }
    public String keepStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq)
    { return _myCQ.keepStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId(sq); }
    protected ConditionValue xgetCValueStockDiffOutDt() { return _myCQ.xdfgetStockDiffOutDt(); }
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
    public String keepScalarCondition(TInventoryRCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TInventoryRCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TInventoryRCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TInventoryRCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TInventoryRCB.class.getName(); }
    protected String xinCQ() { return TInventoryRCQ.class.getName(); }
}
