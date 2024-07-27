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
 * The condition-query for in-line of er_inventory_report_sum.
 * @author DBFlute(AutoGenerator)
 */
public class ErInventoryReportSumCIQ extends AbstractBsErInventoryReportSumCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsErInventoryReportSumCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ErInventoryReportSumCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsErInventoryReportSumCQ myCQ) {
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
    protected ConditionValue xgetCValueInventoryReportSumId() { return _myCQ.xdfgetInventoryReportSumId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueInventorySlipNo() { return _myCQ.xdfgetInventorySlipNo(); }
    protected ConditionValue xgetCValueFiscalYear() { return _myCQ.xdfgetFiscalYear(); }
    protected ConditionValue xgetCValueInventorySlipRowNo() { return _myCQ.xdfgetInventorySlipRowNo(); }
    protected ConditionValue xgetCValuePlantCd() { return _myCQ.xdfgetPlantCd(); }
    protected ConditionValue xgetCValueStorageSpaceCd() { return _myCQ.xdfgetStorageSpaceCd(); }
    protected ConditionValue xgetCValueReferenceDt() { return _myCQ.xdfgetReferenceDt(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueStockNum() { return _myCQ.xdfgetStockNum(); }
    protected ConditionValue xgetCValueProductNmKanji() { return _myCQ.xdfgetProductNmKanji(); }
    protected ConditionValue xgetCValueBarcode() { return _myCQ.xdfgetBarcode(); }
    protected ConditionValue xgetCValueDepositJanCd() { return _myCQ.xdfgetDepositJanCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaNm1() { return _myCQ.xdfgetTenhanshaNm1(); }
    protected ConditionValue xgetCValueTenhanshaNm2() { return _myCQ.xdfgetTenhanshaNm2(); }
    protected ConditionValue xgetCValueSapUserCd() { return _myCQ.xdfgetSapUserCd(); }
    protected ConditionValue xgetCValueSapUserNm() { return _myCQ.xdfgetSapUserNm(); }
    protected ConditionValue xgetCValueAllocTypeCd() { return _myCQ.xdfgetAllocTypeCd(); }
    protected ConditionValue xgetCValueS4SendFlg() { return _myCQ.xdfgetS4SendFlg(); }
    protected ConditionValue xgetCValueWmsAddYyyy() { return _myCQ.xdfgetWmsAddYyyy(); }
    protected ConditionValue xgetCValueWmsAddMm() { return _myCQ.xdfgetWmsAddMm(); }
    protected ConditionValue xgetCValueWmsAddDd() { return _myCQ.xdfgetWmsAddDd(); }
    protected ConditionValue xgetCValueWmsAddHh() { return _myCQ.xdfgetWmsAddHh(); }
    protected ConditionValue xgetCValueWmsAddMi() { return _myCQ.xdfgetWmsAddMi(); }
    protected ConditionValue xgetCValueWmsAddSs() { return _myCQ.xdfgetWmsAddSs(); }
    protected ConditionValue xgetCValueWmsAddUserCd() { return _myCQ.xdfgetWmsAddUserCd(); }
    protected ConditionValue xgetCValueWmsUpdYyyy() { return _myCQ.xdfgetWmsUpdYyyy(); }
    protected ConditionValue xgetCValueWmsUpdMm() { return _myCQ.xdfgetWmsUpdMm(); }
    protected ConditionValue xgetCValueWmsUpdDd() { return _myCQ.xdfgetWmsUpdDd(); }
    protected ConditionValue xgetCValueWmsUpdHh() { return _myCQ.xdfgetWmsUpdHh(); }
    protected ConditionValue xgetCValueWmsUpdMi() { return _myCQ.xdfgetWmsUpdMi(); }
    protected ConditionValue xgetCValueWmsUpdSs() { return _myCQ.xdfgetWmsUpdSs(); }
    protected ConditionValue xgetCValueWmsUpdUserCd() { return _myCQ.xdfgetWmsUpdUserCd(); }
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
    public String keepScalarCondition(ErInventoryReportSumCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ErInventoryReportSumCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ErInventoryReportSumCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ErInventoryReportSumCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ErInventoryReportSumCB.class.getName(); }
    protected String xinCQ() { return ErInventoryReportSumCQ.class.getName(); }
}
