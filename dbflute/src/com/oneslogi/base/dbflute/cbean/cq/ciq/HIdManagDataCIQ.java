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
 * The condition-query for in-line of h_id_manag_data.
 * @author DBFlute(AutoGenerator)
 */
public class HIdManagDataCIQ extends AbstractBsHIdManagDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsHIdManagDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public HIdManagDataCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsHIdManagDataCQ myCQ) {
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
    protected ConditionValue xgetCValueIdManagDataId() { return _myCQ.xdfgetIdManagDataId(); }
    protected ConditionValue xgetCValueIdManagNo() { return _myCQ.xdfgetIdManagNo(); }
    protected ConditionValue xgetCValueTenhanshaCd() { return _myCQ.xdfgetTenhanshaCd(); }
    protected ConditionValue xgetCValueSalesOrgCd() { return _myCQ.xdfgetSalesOrgCd(); }
    protected ConditionValue xgetCValueCustomerCd() { return _myCQ.xdfgetCustomerCd(); }
    protected ConditionValue xgetCValueProductCd() { return _myCQ.xdfgetProductCd(); }
    protected ConditionValue xgetCValueHinmokuText() { return _myCQ.xdfgetHinmokuText(); }
    protected ConditionValue xgetCValueJanCd() { return _myCQ.xdfgetJanCd(); }
    protected ConditionValue xgetCValueUnitNm() { return _myCQ.xdfgetUnitNm(); }
    protected ConditionValue xgetCValueSharedProductTypeCd() { return _myCQ.xdfgetSharedProductTypeCd(); }
    protected ConditionValue xgetCValueCustomerOrderNo() { return _myCQ.xdfgetCustomerOrderNo(); }
    protected ConditionValue xgetCValueDelivCd() { return _myCQ.xdfgetDelivCd(); }
    protected ConditionValue xgetCValueDestinationZipCd() { return _myCQ.xdfgetDestinationZipCd(); }
    protected ConditionValue xgetCValueDestinationAddress1() { return _myCQ.xdfgetDestinationAddress1(); }
    protected ConditionValue xgetCValueDestinationAddress2() { return _myCQ.xdfgetDestinationAddress2(); }
    protected ConditionValue xgetCValueDestinationNm1() { return _myCQ.xdfgetDestinationNm1(); }
    protected ConditionValue xgetCValueDestinationNm2() { return _myCQ.xdfgetDestinationNm2(); }
    protected ConditionValue xgetCValueDestinationTel() { return _myCQ.xdfgetDestinationTel(); }
    protected ConditionValue xgetCValueEmpIdCd() { return _myCQ.xdfgetEmpIdCd(); }
    protected ConditionValue xgetCValueEmpNm() { return _myCQ.xdfgetEmpNm(); }
    protected ConditionValue xgetCValueStoreDt() { return _myCQ.xdfgetStoreDt(); }
    protected ConditionValue xgetCValueInventoryDt() { return _myCQ.xdfgetInventoryDt(); }
    protected ConditionValue xgetCValuePickingDt() { return _myCQ.xdfgetPickingDt(); }
    protected ConditionValue xgetCValueProductReturnDt() { return _myCQ.xdfgetProductReturnDt(); }
    protected ConditionValue xgetCValueWasteReturnDt() { return _myCQ.xdfgetWasteReturnDt(); }
    protected ConditionValue xgetCValueIdManagAbolitionTypeCd() { return _myCQ.xdfgetIdManagAbolitionTypeCd(); }
    protected ConditionValue xgetCValueSpareTypeCd() { return _myCQ.xdfgetSpareTypeCd(); }
    protected ConditionValue xgetCValueDataExtFlgPicking() { return _myCQ.xdfgetDataExtFlgPicking(); }
    protected ConditionValue xgetCValueDataAddDtPicking() { return _myCQ.xdfgetDataAddDtPicking(); }
    protected ConditionValue xgetCValueDataExtFlgReturn() { return _myCQ.xdfgetDataExtFlgReturn(); }
    protected ConditionValue xgetCValueDataAddDtReturn() { return _myCQ.xdfgetDataAddDtReturn(); }
    protected ConditionValue xgetCValueDataExtFlgWaste() { return _myCQ.xdfgetDataExtFlgWaste(); }
    protected ConditionValue xgetCValueDataAddDtWaste() { return _myCQ.xdfgetDataAddDtWaste(); }
    protected ConditionValue xgetCValueWorkDt() { return _myCQ.xdfgetWorkDt(); }
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
    public String keepScalarCondition(HIdManagDataCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(HIdManagDataCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(HIdManagDataCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(HIdManagDataCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return HIdManagDataCB.class.getName(); }
    protected String xinCQ() { return HIdManagDataCQ.class.getName(); }
}