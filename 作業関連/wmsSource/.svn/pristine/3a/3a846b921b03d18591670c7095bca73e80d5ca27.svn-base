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
 * The condition-query for in-line of t_shipping_plan_b.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingPlanBCIQ extends AbstractBsTShippingPlanBCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTShippingPlanBCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TShippingPlanBCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTShippingPlanBCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingPlanBId() { return _myCQ.xdfgetShippingPlanBId(); }
    protected ConditionValue xgetCValueShippingPlanHId() { return _myCQ.xdfgetShippingPlanHId(); }
    public String keepShippingPlanHId_InScopeRelation_TShippingPlanH(TShippingPlanHCQ sq)
    { return _myCQ.keepShippingPlanHId_InScopeRelation_TShippingPlanH(sq); }
    public String keepShippingPlanHId_NotInScopeRelation_TShippingPlanH(TShippingPlanHCQ sq)
    { return _myCQ.keepShippingPlanHId_NotInScopeRelation_TShippingPlanH(sq); }
    protected ConditionValue xgetCValueLineNo() { return _myCQ.xdfgetLineNo(); }
    protected ConditionValue xgetCValueWarehouseId() { return _myCQ.xdfgetWarehouseId(); }
    protected ConditionValue xgetCValueWarehouseCd() { return _myCQ.xdfgetWarehouseCd(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueLocationId() { return _myCQ.xdfgetLocationId(); }
    protected ConditionValue xgetCValueLocationCd() { return _myCQ.xdfgetLocationCd(); }
    protected ConditionValue xgetCValueDepositId() { return _myCQ.xdfgetDepositId(); }
    protected ConditionValue xgetCValueDepositCd() { return _myCQ.xdfgetDepositCd(); }
    protected ConditionValue xgetCValueLotId() { return _myCQ.xdfgetLotId(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueLimitDt() { return _myCQ.xdfgetLimitDt(); }
    protected ConditionValue xgetCValueStoreNoId() { return _myCQ.xdfgetStoreNoId(); }
    protected ConditionValue xgetCValueStoreLabelNo() { return _myCQ.xdfgetStoreLabelNo(); }
    protected ConditionValue xgetCValueShapeId() { return _myCQ.xdfgetShapeId(); }
    protected ConditionValue xgetCValueShapeCd() { return _myCQ.xdfgetShapeCd(); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueInstNum() { return _myCQ.xdfgetInstNum(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueAllocInstBId() { return _myCQ.xdfgetAllocInstBId(); }
    protected ConditionValue xgetCValueAllocNum() { return _myCQ.xdfgetAllocNum(); }
    protected ConditionValue xgetCValueStockOutNum() { return _myCQ.xdfgetStockOutNum(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValuePrice() { return _myCQ.xdfgetPrice(); }
    protected ConditionValue xgetCValueTax() { return _myCQ.xdfgetTax(); }
    protected ConditionValue xgetCValueCasePieceTypeId() { return _myCQ.xdfgetCasePieceTypeId(); }
    protected ConditionValue xgetCValueCasePieceTypeCd() { return _myCQ.xdfgetCasePieceTypeCd(); }
    protected ConditionValue xgetCValueProdDt() { return _myCQ.xdfgetProdDt(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueHinmokuGroup() { return _myCQ.xdfgetHinmokuGroup(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return _myCQ.xdfgetStoreStorageSpaceCd(); }
    protected ConditionValue xgetCValueStorePlantCd() { return _myCQ.xdfgetStorePlantCd(); }
    protected ConditionValue xgetCValueTransactionTypeCd() { return _myCQ.xdfgetTransactionTypeCd(); }
    protected ConditionValue xgetCValueCmSendFlg() { return _myCQ.xdfgetCmSendFlg(); }
    protected ConditionValue xgetCValueLpSendFlg() { return _myCQ.xdfgetLpSendFlg(); }
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
    public String keepScalarCondition(TShippingPlanBCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TShippingPlanBCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TShippingPlanBCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TShippingPlanBCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TShippingPlanBCB.class.getName(); }
    protected String xinCQ() { return TShippingPlanBCQ.class.getName(); }
}
