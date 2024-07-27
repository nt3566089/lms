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
 * The condition-query for in-line of h_inventory_h.
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryHCIQ extends AbstractBsHInventoryHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHInventoryHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HInventoryHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHInventoryHCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryHId() { return _myCQ.xdfgetInventoryHId(); }
    public String keepInventoryHId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepInventoryHId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepInventoryHId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepInventoryHId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepInventoryHId_QueryDerivedReferrer_HInventoryBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueHistDt() { return _myCQ.xdfgetHistDt(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueClientNm() { return _myCQ.xdfgetClientNm(); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    protected ConditionValue xgetCValueCenterCd() { return _myCQ.xdfgetCenterCd(); }
    protected ConditionValue xgetCValueCenterNm() { return _myCQ.xdfgetCenterNm(); }
    protected ConditionValue xgetCValueInventoryDt() { return _myCQ.xdfgetInventoryDt(); }
    protected ConditionValue xgetCValueBatchNum() { return _myCQ.xdfgetBatchNum(); }
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
    public String keepScalarCondition(HInventoryHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HInventoryHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HInventoryHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HInventoryHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HInventoryHCB.class.getName(); }
    protected String xinCQ() { return HInventoryHCQ.class.getName(); }
}
