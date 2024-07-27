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
 * The condition-query for in-line of t_shipping_inst_h.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstHCIQ extends AbstractBsTShippingInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTShippingInstHCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TShippingInstHCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTShippingInstHCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingInstHId() { return _myCQ.xdfgetShippingInstHId(); }
    public String keepShippingInstHId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstHId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstHId_ExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepShippingInstHId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstHId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstHId_NotExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
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
    protected ConditionValue xgetCValueProcessTypeId() { return _myCQ.xdfgetProcessTypeId(); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_InScopeRelation_MProcessType(sq); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq)
    { return _myCQ.keepProcessTypeId_NotInScopeRelation_MProcessType(sq); }
    protected ConditionValue xgetCValueInputType() { return _myCQ.xdfgetInputType(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
    protected ConditionValue xgetCValueDelivPlanDt() { return _myCQ.xdfgetDelivPlanDt(); }
    protected ConditionValue xgetCValueDelivDt() { return _myCQ.xdfgetDelivDt(); }
    protected ConditionValue xgetCValueDelivTz() { return _myCQ.xdfgetDelivTz(); }
    protected ConditionValue xgetCValueClientShippingNo() { return _myCQ.xdfgetClientShippingNo(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueShippingStatus() { return _myCQ.xdfgetShippingStatus(); }
    protected ConditionValue xgetCValueSupplyCustomerId() { return _myCQ.xdfgetSupplyCustomerId(); }
    public String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq)
    { return _myCQ.keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(sq); }
    public String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq)
    { return _myCQ.keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(sq); }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return _myCQ.xdfgetSupplyCustomerCd(); }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return _myCQ.xdfgetSupplyCustomerNm(); }
    protected ConditionValue xgetCValueDelivCustomerId() { return _myCQ.xdfgetDelivCustomerId(); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(sq); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq)
    { return _myCQ.keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(sq); }
    protected ConditionValue xgetCValueDelivCustomerCd() { return _myCQ.xdfgetDelivCustomerCd(); }
    protected ConditionValue xgetCValueDelivZipCd() { return _myCQ.xdfgetDelivZipCd(); }
    public String keepDelivZipCd_InScopeRelation_MZipForDeliv(MZipCQ sq)
    { return _myCQ.keepDelivZipCd_InScopeRelation_MZipForDeliv(sq); }
    public String keepDelivZipCd_NotInScopeRelation_MZipForDeliv(MZipCQ sq)
    { return _myCQ.keepDelivZipCd_NotInScopeRelation_MZipForDeliv(sq); }
    protected ConditionValue xgetCValueDelivAddress1() { return _myCQ.xdfgetDelivAddress1(); }
    protected ConditionValue xgetCValueDelivAddress2() { return _myCQ.xdfgetDelivAddress2(); }
    protected ConditionValue xgetCValueDelivAddress3() { return _myCQ.xdfgetDelivAddress3(); }
    protected ConditionValue xgetCValueDelivAddressSupply() { return _myCQ.xdfgetDelivAddressSupply(); }
    protected ConditionValue xgetCValueDelivCustomerNm() { return _myCQ.xdfgetDelivCustomerNm(); }
    protected ConditionValue xgetCValueDelivCustomerNm1() { return _myCQ.xdfgetDelivCustomerNm1(); }
    protected ConditionValue xgetCValueDelivCustomerNm2() { return _myCQ.xdfgetDelivCustomerNm2(); }
    protected ConditionValue xgetCValueDelivTelNo() { return _myCQ.xdfgetDelivTelNo(); }
    protected ConditionValue xgetCValueDeliveryCourseId() { return _myCQ.xdfgetDeliveryCourseId(); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(sq); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq)
    { return _myCQ.keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(sq); }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return _myCQ.xdfgetDeliveryCourseCd(); }
    protected ConditionValue xgetCValueEmergencyFlg() { return _myCQ.xdfgetEmergencyFlg(); }
    protected ConditionValue xgetCValuePickingWorkMessage() { return _myCQ.xdfgetPickingWorkMessage(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValuePickingBatchNo() { return _myCQ.xdfgetPickingBatchNo(); }
    protected ConditionValue xgetCValueStockOutFlg() { return _myCQ.xdfgetStockOutFlg(); }
    protected ConditionValue xgetCValueAllocInstHId() { return _myCQ.xdfgetAllocInstHId(); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_InScopeRelation_TAllocInstH(sq); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq)
    { return _myCQ.keepAllocInstHId_NotInScopeRelation_TAllocInstH(sq); }
    protected ConditionValue xgetCValueCod() { return _myCQ.xdfgetCod(); }
    protected ConditionValue xgetCValueCodTax() { return _myCQ.xdfgetCodTax(); }
    protected ConditionValue xgetCValueTotalPrice() { return _myCQ.xdfgetTotalPrice(); }
    protected ConditionValue xgetCValueTotalTax() { return _myCQ.xdfgetTotalTax(); }
    protected ConditionValue xgetCValueNizoroeNo() { return _myCQ.xdfgetNizoroeNo(); }
    protected ConditionValue xgetCValueDaihyoNizoroeNo() { return _myCQ.xdfgetDaihyoNizoroeNo(); }
    protected ConditionValue xgetCValueNizoroeNo2() { return _myCQ.xdfgetNizoroeNo2(); }
    protected ConditionValue xgetCValueDaihyoNizoroeNo2() { return _myCQ.xdfgetDaihyoNizoroeNo2(); }
    protected ConditionValue xgetCValueShippingTypeId() { return _myCQ.xdfgetShippingTypeId(); }
    protected ConditionValue xgetCValueShippingTypeCd() { return _myCQ.xdfgetShippingTypeCd(); }
    protected ConditionValue xgetCValueCarrierId() { return _myCQ.xdfgetCarrierId(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueSalesOrderNo() { return _myCQ.xdfgetSalesOrderNo(); }
    protected ConditionValue xgetCValueSalesOrderSlipTypeCd() { return _myCQ.xdfgetSalesOrderSlipTypeCd(); }
    protected ConditionValue xgetCValueSalesOrderSlipNo() { return _myCQ.xdfgetSalesOrderSlipNo(); }
    protected ConditionValue xgetCValueOrderDt() { return _myCQ.xdfgetOrderDt(); }
    protected ConditionValue xgetCValueKokyakuCd() { return _myCQ.xdfgetKokyakuCd(); }
    protected ConditionValue xgetCValueShippingFee() { return _myCQ.xdfgetShippingFee(); }
    protected ConditionValue xgetCValueSeparateShippingFee() { return _myCQ.xdfgetSeparateShippingFee(); }
    protected ConditionValue xgetCValueCodFee() { return _myCQ.xdfgetCodFee(); }
    protected ConditionValue xgetCValueOrderNoDeliveryNote() { return _myCQ.xdfgetOrderNoDeliveryNote(); }
    protected ConditionValue xgetCValuePoint() { return _myCQ.xdfgetPoint(); }
    protected ConditionValue xgetCValueKoguchiDeliveryFlg() { return _myCQ.xdfgetKoguchiDeliveryFlg(); }
    protected ConditionValue xgetCValueRecordSendFlg() { return _myCQ.xdfgetRecordSendFlg(); }
    protected ConditionValue xgetCValueCarrierDataOutFlg() { return _myCQ.xdfgetCarrierDataOutFlg(); }
    protected ConditionValue xgetCValueKohaiContractorCd() { return _myCQ.xdfgetKohaiContractorCd(); }
    protected ConditionValue xgetCValueKohaiContractorNm() { return _myCQ.xdfgetKohaiContractorNm(); }
    protected ConditionValue xgetCValueShippingPlantCd() { return _myCQ.xdfgetShippingPlantCd(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueNizoroeId() { return _myCQ.xdfgetNizoroeId(); }
    protected ConditionValue xgetCValueNizoroeProcUnit() { return _myCQ.xdfgetNizoroeProcUnit(); }
    protected ConditionValue xgetCValueAccountId() { return _myCQ.xdfgetAccountId(); }
    protected ConditionValue xgetCValueAccountCd() { return _myCQ.xdfgetAccountCd(); }
    protected ConditionValue xgetCValueShippingReasonCd() { return _myCQ.xdfgetShippingReasonCd(); }
    protected ConditionValue xgetCValueTransferFlg() { return _myCQ.xdfgetTransferFlg(); }
    protected ConditionValue xgetCValueTenhanshaSalesOrderNo() { return _myCQ.xdfgetTenhanshaSalesOrderNo(); }
    protected ConditionValue xgetCValueDelivCd() { return _myCQ.xdfgetDelivCd(); }
    protected ConditionValue xgetCValueSalesOrderNum() { return _myCQ.xdfgetSalesOrderNum(); }
    protected ConditionValue xgetCValueDirectDeliveryTypeCd() { return _myCQ.xdfgetDirectDeliveryTypeCd(); }
    protected ConditionValue xgetCValueSplitDeliveryTypeCd() { return _myCQ.xdfgetSplitDeliveryTypeCd(); }
    protected ConditionValue xgetCValueCarrierTypeCd() { return _myCQ.xdfgetCarrierTypeCd(); }
    protected ConditionValue xgetCValueSpecifyDeliveryDt() { return _myCQ.xdfgetSpecifyDeliveryDt(); }
    protected ConditionValue xgetCValueSpecifyDeliveryTime() { return _myCQ.xdfgetSpecifyDeliveryTime(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueDestinationNmKana() { return _myCQ.xdfgetDestinationNmKana(); }
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
    protected ConditionValue xgetCValueEcOrderNo() { return _myCQ.xdfgetEcOrderNo(); }
    protected ConditionValue xgetCValuePaymentTypeCd() { return _myCQ.xdfgetPaymentTypeCd(); }
    protected ConditionValue xgetCValuePriceHiddenFlg() { return _myCQ.xdfgetPriceHiddenFlg(); }
    protected ConditionValue xgetCValuePaymentHiddenFlg() { return _myCQ.xdfgetPaymentHiddenFlg(); }
    protected ConditionValue xgetCValueDirectUpdFlg() { return _myCQ.xdfgetDirectUpdFlg(); }
    protected ConditionValue xgetCValueIfId() { return _myCQ.xdfgetIfId(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueCustomerNm() { return _myCQ.xdfgetCustomerNm(); }
    protected ConditionValue xgetCValuePsam() { return _myCQ.xdfgetPsam(); }
    protected ConditionValue xgetCValueFloorCompFlg() { return _myCQ.xdfgetFloorCompFlg(); }
    protected ConditionValue xgetCValueDeliveryType() { return _myCQ.xdfgetDeliveryType(); }
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
    public String keepScalarCondition(TShippingInstHCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TShippingInstHCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TShippingInstHCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TShippingInstHCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TShippingInstHCB.class.getName(); }
    protected String xinCQ() { return TShippingInstHCQ.class.getName(); }
}
