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
 * The condition-query for in-line of e_shipping_inst.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingInstCIQ extends AbstractBsEShippingInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingInstCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingInstCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingInstCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstId() { return _myCQ.xdfgetShippingInstId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return _myCQ.xdfgetShippingSlipRowNo(); }
    protected ConditionValue xgetCValueSalesOrderNo() { return _myCQ.xdfgetSalesOrderNo(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueSalesOrderSlipTypeCd() { return _myCQ.xdfgetSalesOrderSlipTypeCd(); }
    protected ConditionValue xgetCValueSalesOrderSlipNo() { return _myCQ.xdfgetSalesOrderSlipNo(); }
    protected ConditionValue xgetCValueNizoroeNo() { return _myCQ.xdfgetNizoroeNo(); }
    protected ConditionValue xgetCValueShippingTypeCd() { return _myCQ.xdfgetShippingTypeCd(); }
    protected ConditionValue xgetCValueShippingReasonCd() { return _myCQ.xdfgetShippingReasonCd(); }
    protected ConditionValue xgetCValueHinmokuGroup() { return _myCQ.xdfgetHinmokuGroup(); }
    protected ConditionValue xgetCValueShippingNum() { return _myCQ.xdfgetShippingNum(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueEcUnitNm() { return _myCQ.xdfgetEcUnitNm(); }
    protected ConditionValue xgetCValueSampleTypeCd() { return _myCQ.xdfgetSampleTypeCd(); }
    protected ConditionValue xgetCValueLogiWeightFlg() { return _myCQ.xdfgetLogiWeightFlg(); }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return _myCQ.xdfgetLogiAttentionTypeCd(); }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return _myCQ.xdfgetLogiSpecialTypeCd(); }
    protected ConditionValue xgetCValueDirectDeliveryTypeCd() { return _myCQ.xdfgetDirectDeliveryTypeCd(); }
    protected ConditionValue xgetCValueKoguchiDeliveryFlg() { return _myCQ.xdfgetKoguchiDeliveryFlg(); }
    protected ConditionValue xgetCValueSplitDeliveryTypeCd() { return _myCQ.xdfgetSplitDeliveryTypeCd(); }
    protected ConditionValue xgetCValueCarrierTypeCd() { return _myCQ.xdfgetCarrierTypeCd(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueExpressCd() { return _myCQ.xdfgetExpressCd(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueSpecifyDeliveryDt() { return _myCQ.xdfgetSpecifyDeliveryDt(); }
    protected ConditionValue xgetCValueSpecifyDeliveryTime() { return _myCQ.xdfgetSpecifyDeliveryTime(); }
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
    protected ConditionValue xgetCValueKanjiMessage1() { return _myCQ.xdfgetKanjiMessage1(); }
    protected ConditionValue xgetCValueKanjiMessage2() { return _myCQ.xdfgetKanjiMessage2(); }
    protected ConditionValue xgetCValueKanjiMessage3() { return _myCQ.xdfgetKanjiMessage3(); }
    protected ConditionValue xgetCValueKanjiMessage4() { return _myCQ.xdfgetKanjiMessage4(); }
    protected ConditionValue xgetCValueKanjiMessage5() { return _myCQ.xdfgetKanjiMessage5(); }
    protected ConditionValue xgetCValueKanjiMessage6() { return _myCQ.xdfgetKanjiMessage6(); }
    protected ConditionValue xgetCValueKanjiMessage7() { return _myCQ.xdfgetKanjiMessage7(); }
    protected ConditionValue xgetCValueKanjiMessage8() { return _myCQ.xdfgetKanjiMessage8(); }
    protected ConditionValue xgetCValueKanjiMessage9() { return _myCQ.xdfgetKanjiMessage9(); }
    protected ConditionValue xgetCValueKanjiMessage10() { return _myCQ.xdfgetKanjiMessage10(); }
    protected ConditionValue xgetCValueKanaMessage1() { return _myCQ.xdfgetKanaMessage1(); }
    protected ConditionValue xgetCValueKanaMessage2() { return _myCQ.xdfgetKanaMessage2(); }
    protected ConditionValue xgetCValueKanaMessage3() { return _myCQ.xdfgetKanaMessage3(); }
    protected ConditionValue xgetCValueKanaMessage4() { return _myCQ.xdfgetKanaMessage4(); }
    protected ConditionValue xgetCValueKanaMessage5() { return _myCQ.xdfgetKanaMessage5(); }
    protected ConditionValue xgetCValueKanaMessage6() { return _myCQ.xdfgetKanaMessage6(); }
    protected ConditionValue xgetCValueKanaMessage7() { return _myCQ.xdfgetKanaMessage7(); }
    protected ConditionValue xgetCValueKanaMessage8() { return _myCQ.xdfgetKanaMessage8(); }
    protected ConditionValue xgetCValueKanaMessage9() { return _myCQ.xdfgetKanaMessage9(); }
    protected ConditionValue xgetCValueKanaMessage10() { return _myCQ.xdfgetKanaMessage10(); }
    protected ConditionValue xgetCValueDeliveryNoteSummary() { return _myCQ.xdfgetDeliveryNoteSummary(); }
    protected ConditionValue xgetCValueInvoiceSummary() { return _myCQ.xdfgetInvoiceSummary(); }
    protected ConditionValue xgetCValueUnitPrice() { return _myCQ.xdfgetUnitPrice(); }
    protected ConditionValue xgetCValueEcOrderNo() { return _myCQ.xdfgetEcOrderNo(); }
    protected ConditionValue xgetCValueEcOrderBranchNo() { return _myCQ.xdfgetEcOrderBranchNo(); }
    protected ConditionValue xgetCValueEcProductNmKanji() { return _myCQ.xdfgetEcProductNmKanji(); }
    protected ConditionValue xgetCValueOrderDt() { return _myCQ.xdfgetOrderDt(); }
    protected ConditionValue xgetCValueKokyakuCd() { return _myCQ.xdfgetKokyakuCd(); }
    protected ConditionValue xgetCValuePaymentTypeCd() { return _myCQ.xdfgetPaymentTypeCd(); }
    protected ConditionValue xgetCValueTotalPrice() { return _myCQ.xdfgetTotalPrice(); }
    protected ConditionValue xgetCValueShippingFee() { return _myCQ.xdfgetShippingFee(); }
    protected ConditionValue xgetCValueSeparateShippingFee() { return _myCQ.xdfgetSeparateShippingFee(); }
    protected ConditionValue xgetCValueCodFee() { return _myCQ.xdfgetCodFee(); }
    protected ConditionValue xgetCValueSalesTaxRate() { return _myCQ.xdfgetSalesTaxRate(); }
    protected ConditionValue xgetCValuePriceHiddenFlg() { return _myCQ.xdfgetPriceHiddenFlg(); }
    protected ConditionValue xgetCValuePaymentHiddenFlg() { return _myCQ.xdfgetPaymentHiddenFlg(); }
    protected ConditionValue xgetCValueOrderNoDeliveryNote() { return _myCQ.xdfgetOrderNoDeliveryNote(); }
    protected ConditionValue xgetCValuePoint() { return _myCQ.xdfgetPoint(); }
    protected ConditionValue xgetCValueStorePlantCd() { return _myCQ.xdfgetStorePlantCd(); }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return _myCQ.xdfgetStoreStorageSpaceCd(); }
    protected ConditionValue xgetCValueShippingPlantCd() { return _myCQ.xdfgetShippingPlantCd(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueLotManagTypeCd() { return _myCQ.xdfgetLotManagTypeCd(); }
    protected ConditionValue xgetCValueDealTypeCd() { return _myCQ.xdfgetDealTypeCd(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValueDelivCd() { return _myCQ.xdfgetDelivCd(); }
    protected ConditionValue xgetCValueEmpIdCd() { return _myCQ.xdfgetEmpIdCd(); }
    protected ConditionValue xgetCValueEmpNm() { return _myCQ.xdfgetEmpNm(); }
    protected ConditionValue xgetCValueIfId() { return _myCQ.xdfgetIfId(); }
    protected ConditionValue xgetCValueDestinationPrefecture() { return _myCQ.xdfgetDestinationPrefecture(); }
    protected ConditionValue xgetCValuePsam() { return _myCQ.xdfgetPsam(); }
    protected ConditionValue xgetCValueFloorCompFlg() { return _myCQ.xdfgetFloorCompFlg(); }
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
    public String keepScalarCondition(EShippingInstCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingInstCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingInstCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingInstCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingInstCB.class.getName(); }
    protected String xinCQ() { return EShippingInstCQ.class.getName(); }
}
