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
 * The condition-query for in-line of w_product_input.
 * @author DBFlute(AutoGenerator)
 */
public class WProductInputCIQ extends AbstractBsWProductInputCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWProductInputCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WProductInputCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWProductInputCQ myCQ) {
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
    protected ConditionValue xgetCValueProductInputId() { return _myCQ.xdfgetProductInputId(); }
    protected ConditionValue xgetCValueClientCd() { return _myCQ.xdfgetClientCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueProductAbbr() { return _myCQ.xdfgetProductAbbr(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueLotManagFlg() { return _myCQ.xdfgetLotManagFlg(); }
    protected ConditionValue xgetCValueLimitDtManagFlg() { return _myCQ.xdfgetLimitDtManagFlg(); }
    protected ConditionValue xgetCValueReceiveLimitNum() { return _myCQ.xdfgetReceiveLimitNum(); }
    protected ConditionValue xgetCValueShippingLimitNum() { return _myCQ.xdfgetShippingLimitNum(); }
    protected ConditionValue xgetCValueMergeCls() { return _myCQ.xdfgetMergeCls(); }
    protected ConditionValue xgetCValueLotReverseFlg() { return _myCQ.xdfgetLotReverseFlg(); }
    protected ConditionValue xgetCValueLimitDtReverseFlg() { return _myCQ.xdfgetLimitDtReverseFlg(); }
    protected ConditionValue xgetCValueShippingStopFlg() { return _myCQ.xdfgetShippingStopFlg(); }
    protected ConditionValue xgetCValueShapeGrpCd() { return _myCQ.xdfgetShapeGrpCd(); }
    protected ConditionValue xgetCValueFixedPoint() { return _myCQ.xdfgetFixedPoint(); }
    protected ConditionValue xgetCValueLength() { return _myCQ.xdfgetLength(); }
    protected ConditionValue xgetCValueWidth() { return _myCQ.xdfgetWidth(); }
    protected ConditionValue xgetCValueHeight() { return _myCQ.xdfgetHeight(); }
    protected ConditionValue xgetCValueVolume() { return _myCQ.xdfgetVolume(); }
    protected ConditionValue xgetCValueNetWeight() { return _myCQ.xdfgetNetWeight(); }
    protected ConditionValue xgetCValueGrossWeight() { return _myCQ.xdfgetGrossWeight(); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
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
    public String keepScalarCondition(WProductInputCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WProductInputCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WProductInputCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WProductInputCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WProductInputCB.class.getName(); }
    protected String xinCQ() { return WProductInputCQ.class.getName(); }
}
