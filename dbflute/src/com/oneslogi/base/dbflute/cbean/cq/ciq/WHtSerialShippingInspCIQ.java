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
 * The condition-query for in-line of w_ht_serial_shipping_insp.
 * @author DBFlute(AutoGenerator)
 */
public class WHtSerialShippingInspCIQ extends AbstractBsWHtSerialShippingInspCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWHtSerialShippingInspCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WHtSerialShippingInspCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWHtSerialShippingInspCQ myCQ) {
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
    protected ConditionValue xgetCValueHtSerialShippingInspId() { return _myCQ.xdfgetHtSerialShippingInspId(); }
    protected ConditionValue xgetCValueMacAddress() { return _myCQ.xdfgetMacAddress(); }
    protected ConditionValue xgetCValueClientId() { return _myCQ.xdfgetClientId(); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_InScopeRelation_MClient(sq); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq)
    { return _myCQ.keepClientId_NotInScopeRelation_MClient(sq); }
    protected ConditionValue xgetCValueCenterId() { return _myCQ.xdfgetCenterId(); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_InScopeRelation_MCenter(sq); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq)
    { return _myCQ.keepCenterId_NotInScopeRelation_MCenter(sq); }
    protected ConditionValue xgetCValuePickingWorkNo() { return _myCQ.xdfgetPickingWorkNo(); }
    protected ConditionValue xgetCValueCustomerId() { return _myCQ.xdfgetCustomerId(); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_InScopeRelation_MCustomer(sq); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq)
    { return _myCQ.keepCustomerId_NotInScopeRelation_MCustomer(sq); }
    protected ConditionValue xgetCValueSpgWorkComment() { return _myCQ.xdfgetSpgWorkComment(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueSerialNo() { return _myCQ.xdfgetSerialNo(); }
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
    public String keepScalarCondition(WHtSerialShippingInspCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WHtSerialShippingInspCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WHtSerialShippingInspCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WHtSerialShippingInspCB.class.getName(); }
    protected String xinCQ() { return WHtSerialShippingInspCQ.class.getName(); }
}