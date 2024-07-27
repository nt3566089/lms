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
 * The condition-query for in-line of b_user.
 * @author DBFlute(AutoGenerator)
 */
public class BUserCIQ extends AbstractBsBUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BUserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBUserCQ myCQ) {
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
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    public String keepUserId_ExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TEcOrderRList(TEcOrderRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TMoveInstRList(TMoveInstRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TStoreNoRList(TStoreNoRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TEcOrderRList(TEcOrderRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TMoveInstRList(TMoveInstRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TStoreNoRList(TStoreNoRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserCenterListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserClientListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_MUserDepositListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TEcOrderRListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TMoveInstRListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TMoveRecordBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TReceiveLabelListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TReceivePlanRListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TStoreNoRListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TStoreRecordRListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserCd() { return _myCQ.xdfgetUserCd(); }
    public String keepUserCd_ExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserCd_NotExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserCd_SpecifyDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserNm() { return _myCQ.xdfgetUserNm(); }
    protected ConditionValue xgetCValueCultureId() { return _myCQ.xdfgetCultureId(); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_InScopeRelation_BCulture(sq); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq)
    { return _myCQ.keepCultureId_NotInScopeRelation_BCulture(sq); }
    protected ConditionValue xgetCValueRoleGrpId() { return _myCQ.xdfgetRoleGrpId(); }
    public String keepRoleGrpId_InScopeRelation_BRoleGrp(BRoleGrpCQ sq)
    { return _myCQ.keepRoleGrpId_InScopeRelation_BRoleGrp(sq); }
    public String keepRoleGrpId_NotInScopeRelation_BRoleGrp(BRoleGrpCQ sq)
    { return _myCQ.keepRoleGrpId_NotInScopeRelation_BRoleGrp(sq); }
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
    public String keepScalarCondition(BUserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BUserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BUserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BUserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BUserCB.class.getName(); }
    protected String xinCQ() { return BUserCQ.class.getName(); }
}
