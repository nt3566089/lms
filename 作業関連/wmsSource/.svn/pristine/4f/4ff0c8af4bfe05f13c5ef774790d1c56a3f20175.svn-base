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
 * The condition-query for in-line of t_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public class TReceiveLabelCIQ extends AbstractBsTReceiveLabelCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTReceiveLabelCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TReceiveLabelCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTReceiveLabelCQ myCQ) {
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
    protected ConditionValue xgetCValueReceiveLabelId() { return _myCQ.xdfgetReceiveLabelId(); }
    protected ConditionValue xgetCValueStockId() { return _myCQ.xdfgetStockId(); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_InScopeRelation_TStock(sq); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq)
    { return _myCQ.keepStockId_NotInScopeRelation_TStock(sq); }
    protected ConditionValue xgetCValueReceiveLabelNo() { return _myCQ.xdfgetReceiveLabelNo(); }
    protected ConditionValue xgetCValueNum() { return _myCQ.xdfgetNum(); }
    protected ConditionValue xgetCValueOwnerCd() { return _myCQ.xdfgetOwnerCd(); }
    protected ConditionValue xgetCValueOwnerAbbr() { return _myCQ.xdfgetOwnerAbbr(); }
    protected ConditionValue xgetCValueRecommendLocationCd() { return _myCQ.xdfgetRecommendLocationCd(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueJancd() { return _myCQ.xdfgetJancd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueProdDt() { return _myCQ.xdfgetProdDt(); }
    protected ConditionValue xgetCValueReceiveDt() { return _myCQ.xdfgetReceiveDt(); }
    protected ConditionValue xgetCValueDepositFlg() { return _myCQ.xdfgetDepositFlg(); }
    protected ConditionValue xgetCValueReprintFlg() { return _myCQ.xdfgetReprintFlg(); }
    protected ConditionValue xgetCValueReceiveUnitNum() { return _myCQ.xdfgetReceiveUnitNum(); }
    protected ConditionValue xgetCValueReceivePlanBId() { return _myCQ.xdfgetReceivePlanBId(); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_InScopeRelation_TReceivePlanB(sq); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq)
    { return _myCQ.keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(sq); }
    protected ConditionValue xgetCValueRcvLblOutUserId() { return _myCQ.xdfgetRcvLblOutUserId(); }
    public String keepRcvLblOutUserId_InScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepRcvLblOutUserId_InScopeRelation_BUser(sq); }
    public String keepRcvLblOutUserId_NotInScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepRcvLblOutUserId_NotInScopeRelation_BUser(sq); }
    protected ConditionValue xgetCValueRcvLblOutDt() { return _myCQ.xdfgetRcvLblOutDt(); }
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
    public String keepScalarCondition(TReceiveLabelCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TReceiveLabelCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TReceiveLabelCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TReceiveLabelCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TReceiveLabelCB.class.getName(); }
    protected String xinCQ() { return TReceiveLabelCQ.class.getName(); }
}
