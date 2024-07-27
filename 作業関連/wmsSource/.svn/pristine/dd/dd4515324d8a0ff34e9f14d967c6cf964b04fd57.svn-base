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
 * The condition-query for in-line of t_picking_r.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingRCIQ extends AbstractBsTPickingRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPickingRCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPickingRCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsTPickingRCQ myCQ) {
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
    protected ConditionValue xgetCValuePickingHId() { return _myCQ.xdfgetPickingHId(); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_InScopeRelation_TPickingH(sq); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq)
    { return _myCQ.keepPickingHId_NotInScopeRelation_TPickingH(sq); }
    protected ConditionValue xgetCValueOplOutFlg() { return _myCQ.xdfgetOplOutFlg(); }
    protected ConditionValue xgetCValueTplOutFlg() { return _myCQ.xdfgetTplOutFlg(); }
    protected ConditionValue xgetCValueMltOutFlg() { return _myCQ.xdfgetMltOutFlg(); }
    protected ConditionValue xgetCValueSplOutFlg() { return _myCQ.xdfgetSplOutFlg(); }
    protected ConditionValue xgetCValuePl1OutFlg() { return _myCQ.xdfgetPl1OutFlg(); }
    protected ConditionValue xgetCValuePl1OutUserId() { return _myCQ.xdfgetPl1OutUserId(); }
    public String keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(BUserCQ sq)
    { return _myCQ.keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(sq); }
    public String keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(BUserCQ sq)
    { return _myCQ.keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(sq); }
    protected ConditionValue xgetCValuePl1OutDt() { return _myCQ.xdfgetPl1OutDt(); }
    protected ConditionValue xgetCValuePlOutFlg() { return _myCQ.xdfgetPlOutFlg(); }
    protected ConditionValue xgetCValuePlOutUserId() { return _myCQ.xdfgetPlOutUserId(); }
    public String keepPlOutUserId_InScopeRelation_BUserByPlOutUserId(BUserCQ sq)
    { return _myCQ.keepPlOutUserId_InScopeRelation_BUserByPlOutUserId(sq); }
    public String keepPlOutUserId_NotInScopeRelation_BUserByPlOutUserId(BUserCQ sq)
    { return _myCQ.keepPlOutUserId_NotInScopeRelation_BUserByPlOutUserId(sq); }
    protected ConditionValue xgetCValuePlOutDt() { return _myCQ.xdfgetPlOutDt(); }
    protected ConditionValue xgetCValueSlOutFlg() { return _myCQ.xdfgetSlOutFlg(); }
    protected ConditionValue xgetCValuePl2OutFlg() { return _myCQ.xdfgetPl2OutFlg(); }
    protected ConditionValue xgetCValuePl2OutUserId() { return _myCQ.xdfgetPl2OutUserId(); }
    public String keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(BUserCQ sq)
    { return _myCQ.keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(sq); }
    public String keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(BUserCQ sq)
    { return _myCQ.keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(sq); }
    protected ConditionValue xgetCValuePl2OutDt() { return _myCQ.xdfgetPl2OutDt(); }
    protected ConditionValue xgetCValueCaseOutFlg() { return _myCQ.xdfgetCaseOutFlg(); }
    protected ConditionValue xgetCValueCaseOutUserId() { return _myCQ.xdfgetCaseOutUserId(); }
    public String keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(BUserCQ sq)
    { return _myCQ.keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(sq); }
    public String keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(BUserCQ sq)
    { return _myCQ.keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(sq); }
    protected ConditionValue xgetCValueCaseOutDt() { return _myCQ.xdfgetCaseOutDt(); }
    protected ConditionValue xgetCValuePackingOutFlg() { return _myCQ.xdfgetPackingOutFlg(); }
    protected ConditionValue xgetCValuePackingOutUserId() { return _myCQ.xdfgetPackingOutUserId(); }
    public String keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(BUserCQ sq)
    { return _myCQ.keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(sq); }
    public String keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(BUserCQ sq)
    { return _myCQ.keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(sq); }
    protected ConditionValue xgetCValuePackingOutDt() { return _myCQ.xdfgetPackingOutDt(); }
    protected ConditionValue xgetCValueSlipOutFlg() { return _myCQ.xdfgetSlipOutFlg(); }
    protected ConditionValue xgetCValueSlipOutUserId() { return _myCQ.xdfgetSlipOutUserId(); }
    public String keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(BUserCQ sq)
    { return _myCQ.keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(sq); }
    public String keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(BUserCQ sq)
    { return _myCQ.keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(sq); }
    protected ConditionValue xgetCValueSlipOutDt() { return _myCQ.xdfgetSlipOutDt(); }
    protected ConditionValue xgetCValueInvoiceCreateFlg() { return _myCQ.xdfgetInvoiceCreateFlg(); }
    protected ConditionValue xgetCValueInvoiceCreateDt() { return _myCQ.xdfgetInvoiceCreateDt(); }
    protected ConditionValue xgetCValueInvoiceIssueNum() { return _myCQ.xdfgetInvoiceIssueNum(); }
    protected ConditionValue xgetCValueShippingRecordOutFlg() { return _myCQ.xdfgetShippingRecordOutFlg(); }
    protected ConditionValue xgetCValueShippingRecordOutUserId() { return _myCQ.xdfgetShippingRecordOutUserId(); }
    public String keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq)
    { return _myCQ.keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(sq); }
    public String keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq)
    { return _myCQ.keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(sq); }
    protected ConditionValue xgetCValueShippingRecordOutDt() { return _myCQ.xdfgetShippingRecordOutDt(); }
    protected ConditionValue xgetCValueBolOutFlg() { return _myCQ.xdfgetBolOutFlg(); }
    protected ConditionValue xgetCValueBolOutUserId() { return _myCQ.xdfgetBolOutUserId(); }
    public String keepBolOutUserId_InScopeRelation_BUserByBolOutUserId(BUserCQ sq)
    { return _myCQ.keepBolOutUserId_InScopeRelation_BUserByBolOutUserId(sq); }
    public String keepBolOutUserId_NotInScopeRelation_BUserByBolOutUserId(BUserCQ sq)
    { return _myCQ.keepBolOutUserId_NotInScopeRelation_BUserByBolOutUserId(sq); }
    protected ConditionValue xgetCValueBolOutDt() { return _myCQ.xdfgetBolOutDt(); }
    protected ConditionValue xgetCValueTagOutFlg() { return _myCQ.xdfgetTagOutFlg(); }
    protected ConditionValue xgetCValueTagOutUserId() { return _myCQ.xdfgetTagOutUserId(); }
    public String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq)
    { return _myCQ.keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(sq); }
    public String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq)
    { return _myCQ.keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(sq); }
    protected ConditionValue xgetCValueTagOutDt() { return _myCQ.xdfgetTagOutDt(); }
    protected ConditionValue xgetCValueDelivOutFlg() { return _myCQ.xdfgetDelivOutFlg(); }
    protected ConditionValue xgetCValueDelivOutUserId() { return _myCQ.xdfgetDelivOutUserId(); }
    public String keepDelivOutUserId_InScopeRelation_BUserByDelivOutUserId(BUserCQ sq)
    { return _myCQ.keepDelivOutUserId_InScopeRelation_BUserByDelivOutUserId(sq); }
    public String keepDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId(BUserCQ sq)
    { return _myCQ.keepDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId(sq); }
    protected ConditionValue xgetCValueDelivOutDt() { return _myCQ.xdfgetDelivOutDt(); }
    protected ConditionValue xgetCValuePllOutFlg() { return _myCQ.xdfgetPllOutFlg(); }
    protected ConditionValue xgetCValuePllOutUserId() { return _myCQ.xdfgetPllOutUserId(); }
    public String keepPllOutUserId_InScopeRelation_BUserByPllOutUserId(BUserCQ sq)
    { return _myCQ.keepPllOutUserId_InScopeRelation_BUserByPllOutUserId(sq); }
    public String keepPllOutUserId_NotInScopeRelation_BUserByPllOutUserId(BUserCQ sq)
    { return _myCQ.keepPllOutUserId_NotInScopeRelation_BUserByPllOutUserId(sq); }
    protected ConditionValue xgetCValuePllOutDt() { return _myCQ.xdfgetPllOutDt(); }
    protected ConditionValue xgetCValueNizoroeOutFlg() { return _myCQ.xdfgetNizoroeOutFlg(); }
    protected ConditionValue xgetCValueNizoroeOutUserId() { return _myCQ.xdfgetNizoroeOutUserId(); }
    public String keepNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq)
    { return _myCQ.keepNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId(sq); }
    public String keepNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq)
    { return _myCQ.keepNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId(sq); }
    protected ConditionValue xgetCValueNizoroeOutDt() { return _myCQ.xdfgetNizoroeOutDt(); }
    protected ConditionValue xgetCValueIndvSupplyOutFlg() { return _myCQ.xdfgetIndvSupplyOutFlg(); }
    protected ConditionValue xgetCValueIndvSupplyOutUserId() { return _myCQ.xdfgetIndvSupplyOutUserId(); }
    public String keepIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq)
    { return _myCQ.keepIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId(sq); }
    public String keepIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq)
    { return _myCQ.keepIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId(sq); }
    protected ConditionValue xgetCValueIndvSupplyOutDt() { return _myCQ.xdfgetIndvSupplyOutDt(); }
    protected ConditionValue xgetCValueIndvLabelOutFlg() { return _myCQ.xdfgetIndvLabelOutFlg(); }
    protected ConditionValue xgetCValueIndvLabelOutUserId() { return _myCQ.xdfgetIndvLabelOutUserId(); }
    public String keepIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq)
    { return _myCQ.keepIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId(sq); }
    public String keepIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq)
    { return _myCQ.keepIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId(sq); }
    protected ConditionValue xgetCValueIndvLabelOutDt() { return _myCQ.xdfgetIndvLabelOutDt(); }
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
    public String keepScalarCondition(TPickingRCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(TPickingRCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(TPickingRCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(TPickingRCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return TPickingRCB.class.getName(); }
    protected String xinCQ() { return TPickingRCQ.class.getName(); }
}
