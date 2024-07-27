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
 * The condition-query for in-line of t_nizoroe_alarm_log.
 * @author DBFlute(AutoGenerator)
 */
public class TNizoroeAlarmLogCIQ extends AbstractBsTNizoroeAlarmLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTNizoroeAlarmLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TNizoroeAlarmLogCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTNizoroeAlarmLogCQ myCQ) {
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
    protected ConditionValue xgetCValueNizoroeAlarmLogId() { return _myCQ.xdfgetNizoroeAlarmLogId(); }
    protected ConditionValue xgetCValueNizoroeTypeCd() { return _myCQ.xdfgetNizoroeTypeCd(); }
    protected ConditionValue xgetCValueNizoroeProcUnit() { return _myCQ.xdfgetNizoroeProcUnit(); }
    protected ConditionValue xgetCValueProcDt() { return _myCQ.xdfgetProcDt(); }
    protected ConditionValue xgetCValuePrintFlg() { return _myCQ.xdfgetPrintFlg(); }
    protected ConditionValue xgetCValueBaseCd() { return _myCQ.xdfgetBaseCd(); }
    protected ConditionValue xgetCValueBaseNm() { return _myCQ.xdfgetBaseNm(); }
    protected ConditionValue xgetCValueTypeCd() { return _myCQ.xdfgetTypeCd(); }
    protected ConditionValue xgetCValueAlarmTypeCd() { return _myCQ.xdfgetAlarmTypeCd(); }
    protected ConditionValue xgetCValueNizoroeNo() { return _myCQ.xdfgetNizoroeNo(); }
    protected ConditionValue xgetCValueSalesOrderSlipNo() { return _myCQ.xdfgetSalesOrderSlipNo(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return _myCQ.xdfgetShippingSlipRowNo(); }
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_MProduct(sq); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_MProduct(sq); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueProductNm() { return _myCQ.xdfgetProductNm(); }
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueSalesOrgNm1() { return _myCQ.xdfgetSalesOrgNm1(); }
    protected ConditionValue xgetCValueSalesOrgNm2() { return _myCQ.xdfgetSalesOrgNm2(); }
    protected ConditionValue xgetCValueDestinationNm1() { return _myCQ.xdfgetDestinationNm1(); }
    protected ConditionValue xgetCValueDestinationNm2() { return _myCQ.xdfgetDestinationNm2(); }
    protected ConditionValue xgetCValueStockOutNum() { return _myCQ.xdfgetStockOutNum(); }
    protected ConditionValue xgetCValueOutUserId() { return _myCQ.xdfgetOutUserId(); }
    public String keepOutUserId_InScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepOutUserId_InScopeRelation_BUser(sq); }
    public String keepOutUserId_NotInScopeRelation_BUser(BUserCQ sq)
    { return _myCQ.keepOutUserId_NotInScopeRelation_BUser(sq); }
    protected ConditionValue xgetCValueOutDt() { return _myCQ.xdfgetOutDt(); }
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
    public String keepScalarCondition(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TNizoroeAlarmLogCB.class.getName(); }
    protected String xinCQ() { return TNizoroeAlarmLogCQ.class.getName(); }
}
