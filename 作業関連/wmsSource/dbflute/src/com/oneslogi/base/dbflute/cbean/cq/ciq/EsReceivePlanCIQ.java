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
 * The condition-query for in-line of es_receive_plan.
 * @author DBFlute(AutoGenerator)
 */
public class EsReceivePlanCIQ extends AbstractBsEsReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEsReceivePlanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EsReceivePlanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEsReceivePlanCQ myCQ) {
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
    protected ConditionValue xgetCValueReceivePlanId() { return _myCQ.xdfgetReceivePlanId(); }
    protected ConditionValue xgetCValueSendFlg() { return _myCQ.xdfgetSendFlg(); }
    protected ConditionValue xgetCValueStoreSlipNo() { return _myCQ.xdfgetStoreSlipNo(); }
    protected ConditionValue xgetCValueStoreSlipRowNo() { return _myCQ.xdfgetStoreSlipRowNo(); }
    protected ConditionValue xgetCValueSlipTypeCd() { return _myCQ.xdfgetSlipTypeCd(); }
    protected ConditionValue xgetCValueIfId() { return _myCQ.xdfgetIfId(); }
    protected ConditionValue xgetCValueIfNo() { return _myCQ.xdfgetIfNo(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueHinmokuGroup() { return _myCQ.xdfgetHinmokuGroup(); }
    protected ConditionValue xgetCValueSanshaTypeCd() { return _myCQ.xdfgetSanshaTypeCd(); }
    protected ConditionValue xgetCValueReceiveReasonCd() { return _myCQ.xdfgetReceiveReasonCd(); }
    protected ConditionValue xgetCValueReceiveReasonNm() { return _myCQ.xdfgetReceiveReasonNm(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValueOrderDate() { return _myCQ.xdfgetOrderDate(); }
    protected ConditionValue xgetCValueOrderTime() { return _myCQ.xdfgetOrderTime(); }
    protected ConditionValue xgetCValueConfirmedDeliveryDate() { return _myCQ.xdfgetConfirmedDeliveryDate(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueReceivePlanNum() { return _myCQ.xdfgetReceivePlanNum(); }
    protected ConditionValue xgetCValueReceiveRemainingNum() { return _myCQ.xdfgetReceiveRemainingNum(); }
    protected ConditionValue xgetCValueStorePlantCd() { return _myCQ.xdfgetStorePlantCd(); }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return _myCQ.xdfgetStoreStorageSpaceCd(); }
    protected ConditionValue xgetCValueShippingPlantCd() { return _myCQ.xdfgetShippingPlantCd(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueLotManagTypeCd() { return _myCQ.xdfgetLotManagTypeCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaNm1() { return _myCQ.xdfgetTenhanshaNm1(); }
    protected ConditionValue xgetCValueTenhanshaNm2() { return _myCQ.xdfgetTenhanshaNm2(); }
    protected ConditionValue xgetCValueSapUserCd() { return _myCQ.xdfgetSapUserCd(); }
    protected ConditionValue xgetCValueSapUserNm() { return _myCQ.xdfgetSapUserNm(); }
    protected ConditionValue xgetCValueModTypeCd() { return _myCQ.xdfgetModTypeCd(); }
    protected ConditionValue xgetCValueDepositJanCd() { return _myCQ.xdfgetDepositJanCd(); }
    protected ConditionValue xgetCValueTimesNum() { return _myCQ.xdfgetTimesNum(); }
    protected ConditionValue xgetCValueAccountOrderNo() { return _myCQ.xdfgetAccountOrderNo(); }
    protected ConditionValue xgetCValueSapSupplierCd() { return _myCQ.xdfgetSapSupplierCd(); }
    protected ConditionValue xgetCValueSapVenderCd() { return _myCQ.xdfgetSapVenderCd(); }
    protected ConditionValue xgetCValueTodayFlg() { return _myCQ.xdfgetTodayFlg(); }
    protected ConditionValue xgetCValueSanshaDeliverySlipNo1() { return _myCQ.xdfgetSanshaDeliverySlipNo1(); }
    protected ConditionValue xgetCValueDataTypeCd() { return _myCQ.xdfgetDataTypeCd(); }
    protected ConditionValue xgetCValueSapAddYyyy() { return _myCQ.xdfgetSapAddYyyy(); }
    protected ConditionValue xgetCValueSapAddMm() { return _myCQ.xdfgetSapAddMm(); }
    protected ConditionValue xgetCValueSapAddDd() { return _myCQ.xdfgetSapAddDd(); }
    protected ConditionValue xgetCValueSapAddHh() { return _myCQ.xdfgetSapAddHh(); }
    protected ConditionValue xgetCValueSapAddMi() { return _myCQ.xdfgetSapAddMi(); }
    protected ConditionValue xgetCValueSapAddSs() { return _myCQ.xdfgetSapAddSs(); }
    protected ConditionValue xgetCValueSapAddUserCd() { return _myCQ.xdfgetSapAddUserCd(); }
    protected ConditionValue xgetCValueSapUpdYyyy() { return _myCQ.xdfgetSapUpdYyyy(); }
    protected ConditionValue xgetCValueSapUpdMm() { return _myCQ.xdfgetSapUpdMm(); }
    protected ConditionValue xgetCValueSapUpdDd() { return _myCQ.xdfgetSapUpdDd(); }
    protected ConditionValue xgetCValueSapUpdHh() { return _myCQ.xdfgetSapUpdHh(); }
    protected ConditionValue xgetCValueSapUpdMi() { return _myCQ.xdfgetSapUpdMi(); }
    protected ConditionValue xgetCValueSapUpdSs() { return _myCQ.xdfgetSapUpdSs(); }
    protected ConditionValue xgetCValueSapUpdUserCd() { return _myCQ.xdfgetSapUpdUserCd(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr01() { return _myCQ.xdfgetDataTransferOnlyStr01(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr02() { return _myCQ.xdfgetDataTransferOnlyStr02(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr03() { return _myCQ.xdfgetDataTransferOnlyStr03(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr04() { return _myCQ.xdfgetDataTransferOnlyStr04(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr05() { return _myCQ.xdfgetDataTransferOnlyStr05(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr06() { return _myCQ.xdfgetDataTransferOnlyStr06(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr07() { return _myCQ.xdfgetDataTransferOnlyStr07(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr08() { return _myCQ.xdfgetDataTransferOnlyStr08(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr09() { return _myCQ.xdfgetDataTransferOnlyStr09(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr10() { return _myCQ.xdfgetDataTransferOnlyStr10(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr11() { return _myCQ.xdfgetDataTransferOnlyStr11(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr12() { return _myCQ.xdfgetDataTransferOnlyStr12(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr13() { return _myCQ.xdfgetDataTransferOnlyStr13(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr14() { return _myCQ.xdfgetDataTransferOnlyStr14(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr15() { return _myCQ.xdfgetDataTransferOnlyStr15(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr16() { return _myCQ.xdfgetDataTransferOnlyStr16(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr17() { return _myCQ.xdfgetDataTransferOnlyStr17(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr18() { return _myCQ.xdfgetDataTransferOnlyStr18(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr19() { return _myCQ.xdfgetDataTransferOnlyStr19(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr20() { return _myCQ.xdfgetDataTransferOnlyStr20(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr21() { return _myCQ.xdfgetDataTransferOnlyStr21(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr22() { return _myCQ.xdfgetDataTransferOnlyStr22(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr23() { return _myCQ.xdfgetDataTransferOnlyStr23(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr24() { return _myCQ.xdfgetDataTransferOnlyStr24(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr25() { return _myCQ.xdfgetDataTransferOnlyStr25(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr26() { return _myCQ.xdfgetDataTransferOnlyStr26(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr27() { return _myCQ.xdfgetDataTransferOnlyStr27(); }
    protected ConditionValue xgetCValueDataTransferOnlyStr28() { return _myCQ.xdfgetDataTransferOnlyStr28(); }
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
    public String keepScalarCondition(EsReceivePlanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EsReceivePlanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EsReceivePlanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EsReceivePlanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EsReceivePlanCB.class.getName(); }
    protected String xinCQ() { return EsReceivePlanCQ.class.getName(); }
}
