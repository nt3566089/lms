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
 * The condition-query for in-line of t_shipping_inst_b_print.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBPrintCIQ extends AbstractBsTShippingInstBPrintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTShippingInstBPrintCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TShippingInstBPrintCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTShippingInstBPrintCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstBPrintId() { return _myCQ.xdfgetShippingInstBPrintId(); }
    protected ConditionValue xgetCValueShippingInstBId() { return _myCQ.xdfgetShippingInstBId(); }
    public String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq)
    { return _myCQ.keepShippingInstBId_InScopeRelation_TShippingInstB(sq); }
    public String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq)
    { return _myCQ.keepShippingInstBId_NotInScopeRelation_TShippingInstB(sq); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueHinmokuGroupCd() { return _myCQ.xdfgetHinmokuGroupCd(); }
    protected ConditionValue xgetCValueSalesOrderNum() { return _myCQ.xdfgetSalesOrderNum(); }
    protected ConditionValue xgetCValueLogiWeightFlg() { return _myCQ.xdfgetLogiWeightFlg(); }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return _myCQ.xdfgetLogiAttentionTypeCd(); }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return _myCQ.xdfgetLogiSpecialTypeCd(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueEcOrderBranchNo() { return _myCQ.xdfgetEcOrderBranchNo(); }
    protected ConditionValue xgetCValueEcProductNmKanji() { return _myCQ.xdfgetEcProductNmKanji(); }
    protected ConditionValue xgetCValueDealTypeCd() { return _myCQ.xdfgetDealTypeCd(); }
    protected ConditionValue xgetCValueSpareStr() { return _myCQ.xdfgetSpareStr(); }
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
    public String keepScalarCondition(TShippingInstBPrintCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TShippingInstBPrintCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TShippingInstBPrintCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TShippingInstBPrintCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TShippingInstBPrintCB.class.getName(); }
    protected String xinCQ() { return TShippingInstBPrintCQ.class.getName(); }
}
