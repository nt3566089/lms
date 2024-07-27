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
 * The condition-query for in-line of t_shipping_record_b.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingRecordBCIQ extends AbstractBsTShippingRecordBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTShippingRecordBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TShippingRecordBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTShippingRecordBCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingRecordBId() { return _myCQ.xdfgetShippingRecordBId(); }
    protected ConditionValue xgetCValueShippingRecordHId() { return _myCQ.xdfgetShippingRecordHId(); }
    public String keepShippingRecordHId_InScopeRelation_TShippingRecordH(TShippingRecordHCQ sq)
    { return _myCQ.keepShippingRecordHId_InScopeRelation_TShippingRecordH(sq); }
    public String keepShippingRecordHId_NotInScopeRelation_TShippingRecordH(TShippingRecordHCQ sq)
    { return _myCQ.keepShippingRecordHId_NotInScopeRelation_TShippingRecordH(sq); }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return _myCQ.xdfgetShippingSlipRowNo(); }
    protected ConditionValue xgetCValueSn() { return _myCQ.xdfgetSn(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueNum() { return _myCQ.xdfgetNum(); }
    protected ConditionValue xgetCValueLotManagTypeCd() { return _myCQ.xdfgetLotManagTypeCd(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueConfirmedPackingNum() { return _myCQ.xdfgetConfirmedPackingNum(); }
    protected ConditionValue xgetCValueSrSendFlg() { return _myCQ.xdfgetSrSendFlg(); }
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
    public String keepScalarCondition(TShippingRecordBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TShippingRecordBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TShippingRecordBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TShippingRecordBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TShippingRecordBCB.class.getName(); }
    protected String xinCQ() { return TShippingRecordBCQ.class.getName(); }
}
