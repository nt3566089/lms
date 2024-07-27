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
 * The condition-query for in-line of e_product.
 * @author DBFlute(AutoGenerator)
 */
public class EProductCIQ extends AbstractBsEProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEProductCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EProductCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEProductCQ myCQ) {
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
    protected ConditionValue xgetCValueProductId() { return _myCQ.xdfgetProductId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueHinmokuGroupCd() { return _myCQ.xdfgetHinmokuGroupCd(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueSizeNm() { return _myCQ.xdfgetSizeNm(); }
    protected ConditionValue xgetCValueCaseTypeCd() { return _myCQ.xdfgetCaseTypeCd(); }
    protected ConditionValue xgetCValueUnitNum() { return _myCQ.xdfgetUnitNum(); }
    protected ConditionValue xgetCValueLogiWeightFlg() { return _myCQ.xdfgetLogiWeightFlg(); }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return _myCQ.xdfgetLogiSpecialTypeCd(); }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return _myCQ.xdfgetLogiAttentionTypeCd(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueOldJanCd() { return _myCQ.xdfgetOldJanCd(); }
    protected ConditionValue xgetCValueSapAddDt() { return _myCQ.xdfgetSapAddDt(); }
    protected ConditionValue xgetCValueSapAddTime() { return _myCQ.xdfgetSapAddTime(); }
    protected ConditionValue xgetCValueStorageLocationTypeCd() { return _myCQ.xdfgetStorageLocationTypeCd(); }
    protected ConditionValue xgetCValueMedicalManagFlg() { return _myCQ.xdfgetMedicalManagFlg(); }
    protected ConditionValue xgetCValueProdDtManagFlg() { return _myCQ.xdfgetProdDtManagFlg(); }
    protected ConditionValue xgetCValueProdDtLimitDaysRcv() { return _myCQ.xdfgetProdDtLimitDaysRcv(); }
    protected ConditionValue xgetCValueProdDtLimitDaysShp() { return _myCQ.xdfgetProdDtLimitDaysShp(); }
    protected ConditionValue xgetCValueNizoroe10Num() { return _myCQ.xdfgetNizoroe10Num(); }
    protected ConditionValue xgetCValueSerialManagFlg() { return _myCQ.xdfgetSerialManagFlg(); }
    protected ConditionValue xgetCValueOcrDateFormat() { return _myCQ.xdfgetOcrDateFormat(); }
    protected ConditionValue xgetCValueLpSendFlg() { return _myCQ.xdfgetLpSendFlg(); }
    protected ConditionValue xgetCValueSapAddYyyy() { return _myCQ.xdfgetSapAddYyyy(); }
    protected ConditionValue xgetCValueSapAddMm() { return _myCQ.xdfgetSapAddMm(); }
    protected ConditionValue xgetCValueSapAddDd() { return _myCQ.xdfgetSapAddDd(); }
    protected ConditionValue xgetCValueSapAddHh() { return _myCQ.xdfgetSapAddHh(); }
    protected ConditionValue xgetCValueSapAddMi() { return _myCQ.xdfgetSapAddMi(); }
    protected ConditionValue xgetCValueSapAddSs() { return _myCQ.xdfgetSapAddSs(); }
    protected ConditionValue xgetCValueSapAddUserNm() { return _myCQ.xdfgetSapAddUserNm(); }
    protected ConditionValue xgetCValueSapUpdYyyy() { return _myCQ.xdfgetSapUpdYyyy(); }
    protected ConditionValue xgetCValueSapUpdMm() { return _myCQ.xdfgetSapUpdMm(); }
    protected ConditionValue xgetCValueSapUpdDd() { return _myCQ.xdfgetSapUpdDd(); }
    protected ConditionValue xgetCValueSapUpdHh() { return _myCQ.xdfgetSapUpdHh(); }
    protected ConditionValue xgetCValueSapUpdMi() { return _myCQ.xdfgetSapUpdMi(); }
    protected ConditionValue xgetCValueSapUpdSs() { return _myCQ.xdfgetSapUpdSs(); }
    protected ConditionValue xgetCValueSapUpdUserNm() { return _myCQ.xdfgetSapUpdUserNm(); }
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
    public String keepScalarCondition(EProductCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EProductCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EProductCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EProductCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EProductCB.class.getName(); }
    protected String xinCQ() { return EProductCQ.class.getName(); }
}
