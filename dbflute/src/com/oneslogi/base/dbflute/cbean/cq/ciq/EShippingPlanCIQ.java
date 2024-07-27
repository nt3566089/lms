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
 * The condition-query for in-line of e_shipping_plan.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingPlanCIQ extends AbstractBsEShippingPlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingPlanCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingPlanCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingPlanCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingPlanId() { return _myCQ.xdfgetShippingPlanId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueShippingPlanSlipNo() { return _myCQ.xdfgetShippingPlanSlipNo(); }
    protected ConditionValue xgetCValueShippingPlanSlipRowNo() { return _myCQ.xdfgetShippingPlanSlipRowNo(); }
    protected ConditionValue xgetCValueSlipTypeCd() { return _myCQ.xdfgetSlipTypeCd(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueSalesOrderTypeCd() { return _myCQ.xdfgetSalesOrderTypeCd(); }
    protected ConditionValue xgetCValueShippingTypeCd() { return _myCQ.xdfgetShippingTypeCd(); }
    protected ConditionValue xgetCValueShippingReasonCd() { return _myCQ.xdfgetShippingReasonCd(); }
    protected ConditionValue xgetCValueHinmokuGroup() { return _myCQ.xdfgetHinmokuGroup(); }
    protected ConditionValue xgetCValueShippingNum() { return _myCQ.xdfgetShippingNum(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueDirectDeliveryTypeCd() { return _myCQ.xdfgetDirectDeliveryTypeCd(); }
    protected ConditionValue xgetCValueKoguchiDeliveryFlg() { return _myCQ.xdfgetKoguchiDeliveryFlg(); }
    protected ConditionValue xgetCValueStorePlantCd() { return _myCQ.xdfgetStorePlantCd(); }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return _myCQ.xdfgetStoreStorageSpaceCd(); }
    protected ConditionValue xgetCValueShippingPlantCd() { return _myCQ.xdfgetShippingPlantCd(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueTransactionTypeCd() { return _myCQ.xdfgetTransactionTypeCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaOrderNo() { return _myCQ.xdfgetTenhanshaOrderNo(); }
    protected ConditionValue xgetCValueKohaiContractorCd() { return _myCQ.xdfgetKohaiContractorCd(); }
    protected ConditionValue xgetCValueKohaiContractorNm() { return _myCQ.xdfgetKohaiContractorNm(); }
    protected ConditionValue xgetCValueDestinationCd() { return _myCQ.xdfgetDestinationCd(); }
    protected ConditionValue xgetCValueDestinationNm1() { return _myCQ.xdfgetDestinationNm1(); }
    protected ConditionValue xgetCValueDestinationNm2() { return _myCQ.xdfgetDestinationNm2(); }
    protected ConditionValue xgetCValueDestinationNmKana() { return _myCQ.xdfgetDestinationNmKana(); }
    protected ConditionValue xgetCValueDestinationZipCd() { return _myCQ.xdfgetDestinationZipCd(); }
    protected ConditionValue xgetCValueDestinationAddress1() { return _myCQ.xdfgetDestinationAddress1(); }
    protected ConditionValue xgetCValueDestinationAddress2() { return _myCQ.xdfgetDestinationAddress2(); }
    protected ConditionValue xgetCValueDestinationTel() { return _myCQ.xdfgetDestinationTel(); }
    protected ConditionValue xgetCValueDestinationFax() { return _myCQ.xdfgetDestinationFax(); }
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
    public String keepScalarCondition(EShippingPlanCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingPlanCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingPlanCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingPlanCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingPlanCB.class.getName(); }
    protected String xinCQ() { return EShippingPlanCQ.class.getName(); }
}
