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
 * The condition-query for in-line of er_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public class ErSalesOrgCIQ extends AbstractBsErSalesOrgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsErSalesOrgCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ErSalesOrgCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsErSalesOrgCQ myCQ) {
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
    protected ConditionValue xgetCValueSalesOrgId() { return _myCQ.xdfgetSalesOrgId(); }
    protected ConditionValue xgetCValueReceiveCd() { return _myCQ.xdfgetReceiveCd(); }
    protected ConditionValue xgetCValueReceiveRowId() { return _myCQ.xdfgetReceiveRowId(); }
    protected ConditionValue xgetCValueImportFlg() { return _myCQ.xdfgetImportFlg(); }
    protected ConditionValue xgetCValueErrorFlg() { return _myCQ.xdfgetErrorFlg(); }
    protected ConditionValue xgetCValueErrorMessageCd() { return _myCQ.xdfgetErrorMessageCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValuePurchaseOrgCd() { return _myCQ.xdfgetPurchaseOrgCd(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueTenhanshaNm1() { return _myCQ.xdfgetTenhanshaNm1(); }
    protected ConditionValue xgetCValueTenhanshaNm2() { return _myCQ.xdfgetTenhanshaNm2(); }
    protected ConditionValue xgetCValueTenhanshaZipCd() { return _myCQ.xdfgetTenhanshaZipCd(); }
    protected ConditionValue xgetCValueTenhanshaPrefecture() { return _myCQ.xdfgetTenhanshaPrefecture(); }
    protected ConditionValue xgetCValueTenhanshaAddress1() { return _myCQ.xdfgetTenhanshaAddress1(); }
    protected ConditionValue xgetCValueTenhanshaAddress2() { return _myCQ.xdfgetTenhanshaAddress2(); }
    protected ConditionValue xgetCValueTenhanshaTelNo() { return _myCQ.xdfgetTenhanshaTelNo(); }
    protected ConditionValue xgetCValueTenhanshaFaxNo() { return _myCQ.xdfgetTenhanshaFaxNo(); }
    protected ConditionValue xgetCValuePlantNormal() { return _myCQ.xdfgetPlantNormal(); }
    protected ConditionValue xgetCValuePlantDeposit() { return _myCQ.xdfgetPlantDeposit(); }
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
    public String keepScalarCondition(ErSalesOrgCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ErSalesOrgCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ErSalesOrgCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ErSalesOrgCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ErSalesOrgCB.class.getName(); }
    protected String xinCQ() { return ErSalesOrgCQ.class.getName(); }
}
