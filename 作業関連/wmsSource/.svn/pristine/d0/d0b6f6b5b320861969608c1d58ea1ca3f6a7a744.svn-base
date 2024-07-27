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
 * The condition-query for in-line of e_distribution.
 * @author DBFlute(AutoGenerator)
 */
public class EDistributionCIQ extends AbstractBsEDistributionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEDistributionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EDistributionCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEDistributionCQ myCQ) {
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
    protected ConditionValue xgetCValueDistributionId() { return _myCQ.xdfgetDistributionId(); }
    protected ConditionValue xgetCValueSendFlg() { return _myCQ.xdfgetSendFlg(); }
    protected ConditionValue xgetCValueStoreSlipNo() { return _myCQ.xdfgetStoreSlipNo(); }
    protected ConditionValue xgetCValueStoreSlipRowNo() { return _myCQ.xdfgetStoreSlipRowNo(); }
    protected ConditionValue xgetCValueStoreReasonCd() { return _myCQ.xdfgetStoreReasonCd(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return _myCQ.xdfgetShippingSlipRowNo(); }
    protected ConditionValue xgetCValueShippingReasonCd() { return _myCQ.xdfgetShippingReasonCd(); }
    protected ConditionValue xgetCValueStorePlantCd() { return _myCQ.xdfgetStorePlantCd(); }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return _myCQ.xdfgetStoreStorageSpaceCd(); }
    protected ConditionValue xgetCValueShippingPlantCd() { return _myCQ.xdfgetShippingPlantCd(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueNum() { return _myCQ.xdfgetNum(); }
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
    public String keepScalarCondition(EDistributionCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EDistributionCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EDistributionCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EDistributionCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EDistributionCB.class.getName(); }
    protected String xinCQ() { return EDistributionCQ.class.getName(); }
}
