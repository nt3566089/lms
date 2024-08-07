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
 * The condition-query for in-line of w_ht_shipping.
 * @author DBFlute(AutoGenerator)
 */
public class WHtShippingCIQ extends AbstractBsWHtShippingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsWHtShippingCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public WHtShippingCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsWHtShippingCQ myCQ) {
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
    protected ConditionValue xgetCValueHtShippingId() { return _myCQ.xdfgetHtShippingId(); }
    protected ConditionValue xgetCValueMacAddress() { return _myCQ.xdfgetMacAddress(); }
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
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
    protected ConditionValue xgetCValueNizoroeNo() { return _myCQ.xdfgetNizoroeNo(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueSpgQtyOns() { return _myCQ.xdfgetSpgQtyOns(); }
    protected ConditionValue xgetCValueSpgQtyRemain() { return _myCQ.xdfgetSpgQtyRemain(); }
    protected ConditionValue xgetCValuePieceNo() { return _myCQ.xdfgetPieceNo(); }
    protected ConditionValue xgetCValueSpgWorkComment() { return _myCQ.xdfgetSpgWorkComment(); }
    protected ConditionValue xgetCValueBoxId() { return _myCQ.xdfgetBoxId(); }
    public String keepBoxId_InScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepBoxId_InScopeRelation_MBox(sq); }
    public String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq)
    { return _myCQ.keepBoxId_NotInScopeRelation_MBox(sq); }
    protected ConditionValue xgetCValueBoxCd() { return _myCQ.xdfgetBoxCd(); }
    protected ConditionValue xgetCValueBoxNm() { return _myCQ.xdfgetBoxNm(); }
    protected ConditionValue xgetCValuePickingWorkNo() { return _myCQ.xdfgetPickingWorkNo(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueConsumeDt() { return _myCQ.xdfgetConsumeDt(); }
    protected ConditionValue xgetCValueProdDt() { return _myCQ.xdfgetProdDt(); }
    protected ConditionValue xgetCValueIndvLabelNo() { return _myCQ.xdfgetIndvLabelNo(); }
    protected ConditionValue xgetCValueExpectedShipmentNo() { return _myCQ.xdfgetExpectedShipmentNo(); }
    protected ConditionValue xgetCValueForceCopleteFlg() { return _myCQ.xdfgetForceCopleteFlg(); }
    protected ConditionValue xgetCValueSuspendFlg() { return _myCQ.xdfgetSuspendFlg(); }
    protected ConditionValue xgetCValueReceiveLabelNo() { return _myCQ.xdfgetReceiveLabelNo(); }
    protected ConditionValue xgetCValueNizoroeNo2() { return _myCQ.xdfgetNizoroeNo2(); }
    protected ConditionValue xgetCValueDaihyoNizoroeNo() { return _myCQ.xdfgetDaihyoNizoroeNo(); }
    protected ConditionValue xgetCValueDaihyoNizoroeNo2() { return _myCQ.xdfgetDaihyoNizoroeNo2(); }
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
    public String keepScalarCondition(WHtShippingCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(WHtShippingCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(WHtShippingCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(WHtShippingCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return WHtShippingCB.class.getName(); }
    protected String xinCQ() { return WHtShippingCQ.class.getName(); }
}
