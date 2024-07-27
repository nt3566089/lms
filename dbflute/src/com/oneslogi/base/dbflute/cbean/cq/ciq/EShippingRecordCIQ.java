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
 * The condition-query for in-line of e_shipping_record.
 * @author DBFlute(AutoGenerator)
 */
public class EShippingRecordCIQ extends AbstractBsEShippingRecordCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEShippingRecordCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EShippingRecordCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEShippingRecordCQ myCQ) {
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
    protected ConditionValue xgetCValueShippingRecordId() { return _myCQ.xdfgetShippingRecordId(); }
    protected ConditionValue xgetCValueSendFlg() { return _myCQ.xdfgetSendFlg(); }
    protected ConditionValue xgetCValueShippingSlipNo() { return _myCQ.xdfgetShippingSlipNo(); }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return _myCQ.xdfgetShippingSlipRowNo(); }
    protected ConditionValue xgetCValueSn() { return _myCQ.xdfgetSn(); }
    protected ConditionValue xgetCValueSalesOrderNo() { return _myCQ.xdfgetSalesOrderNo(); }
    protected ConditionValue xgetCValueHinmokuCd() { return _myCQ.xdfgetHinmokuCd(); }
    protected ConditionValue xgetCValueShippingDt() { return _myCQ.xdfgetShippingDt(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueNum() { return _myCQ.xdfgetNum(); }
    protected ConditionValue xgetCValueLotManagTypeCd() { return _myCQ.xdfgetLotManagTypeCd(); }
    protected ConditionValue xgetCValueLot() { return _myCQ.xdfgetLot(); }
    protected ConditionValue xgetCValueCarrierSlipNo() { return _myCQ.xdfgetCarrierSlipNo(); }
    protected ConditionValue xgetCValueCarrierCd() { return _myCQ.xdfgetCarrierCd(); }
    protected ConditionValue xgetCValueCarrierRnm() { return _myCQ.xdfgetCarrierRnm(); }
    protected ConditionValue xgetCValueConfirmedPackingNum() { return _myCQ.xdfgetConfirmedPackingNum(); }
    protected ConditionValue xgetCValueSalesNo2() { return _myCQ.xdfgetSalesNo2(); }
    protected ConditionValue xgetCValueDeliverySlipNo() { return _myCQ.xdfgetDeliverySlipNo(); }
    protected ConditionValue xgetCValueDStr() { return _myCQ.xdfgetDStr(); }
    protected ConditionValue xgetCValueIStr() { return _myCQ.xdfgetIStr(); }
    protected ConditionValue xgetCValueIfId() { return _myCQ.xdfgetIfId(); }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return _myCQ.xdfgetShippingStorageSpaceCd(); }
    protected ConditionValue xgetCValueNizoroeNo() { return _myCQ.xdfgetNizoroeNo(); }
    protected ConditionValue xgetCValuePlSendFlg() { return _myCQ.xdfgetPlSendFlg(); }
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
    public String keepScalarCondition(EShippingRecordCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EShippingRecordCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EShippingRecordCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EShippingRecordCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EShippingRecordCB.class.getName(); }
    protected String xinCQ() { return EShippingRecordCQ.class.getName(); }
}
