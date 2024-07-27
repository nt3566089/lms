package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.oneslogi.base.dbflute.cbean.cq.ciq.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The base condition-query of b_user.
 * @author DBFlute(AutoGenerator)
 */
public class BsBUserCQ extends AbstractBsBUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from b_user) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BUserCIQ xcreateCIQ() {
        BUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BUserCIQ xnewCIQ() {
        return new BUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join b_user on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, BUserAuthCQ> xdfgetUserId_ExistsReferrer_BUserAuthAsOne() { return xgetSQueMap("userId_ExistsReferrer_BUserAuthAsOne"); }
    public String keepUserId_ExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq) { return xkeepSQue("userId_ExistsReferrer_BUserAuthAsOne", sq); }

    public Map<String, MUserCenterCQ> xdfgetUserId_ExistsReferrer_MUserCenterList() { return xgetSQueMap("userId_ExistsReferrer_MUserCenterList"); }
    public String keepUserId_ExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("userId_ExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserClientCQ> xdfgetUserId_ExistsReferrer_MUserClientList() { return xgetSQueMap("userId_ExistsReferrer_MUserClientList"); }
    public String keepUserId_ExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("userId_ExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserDepositCQ> xdfgetUserId_ExistsReferrer_MUserDepositList() { return xgetSQueMap("userId_ExistsReferrer_MUserDepositList"); }
    public String keepUserId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("userId_ExistsReferrer_MUserDepositList", sq); }

    public Map<String, MUserLoginCQ> xdfgetUserId_ExistsReferrer_MUserLoginAsOne() { return xgetSQueMap("userId_ExistsReferrer_MUserLoginAsOne"); }
    public String keepUserId_ExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq) { return xkeepSQue("userId_ExistsReferrer_MUserLoginAsOne", sq); }

    public Map<String, TEcOrderRCQ> xdfgetUserId_ExistsReferrer_TEcOrderRList() { return xgetSQueMap("userId_ExistsReferrer_TEcOrderRList"); }
    public String keepUserId_ExistsReferrer_TEcOrderRList(TEcOrderRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TEcOrderRList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryBByInventoryUpdUserIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_ExistsReferrer_TInventoryBByInventoryUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryBByInventoryUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryBByInventoryUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryRByStockDiffOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_ExistsReferrer_TInventoryRByTwlOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryRByTwlOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryRByTwlOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryRByInventoryRecordOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TInventoryRByInventoryDiffOutUserIdList", sq); }

    public Map<String, TMoveInstRCQ> xdfgetUserId_ExistsReferrer_TMoveInstRList() { return xgetSQueMap("userId_ExistsReferrer_TMoveInstRList"); }
    public String keepUserId_ExistsReferrer_TMoveInstRList(TMoveInstRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TMoveInstRList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetUserId_ExistsReferrer_TMoveRecordBList() { return xgetSQueMap("userId_ExistsReferrer_TMoveRecordBList"); }
    public String keepUserId_ExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("userId_ExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetUserId_ExistsReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("userId_ExistsReferrer_TNizoroeAlarmLogList"); }
    public String keepUserId_ExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("userId_ExistsReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_ExistsReferrer_TPackingRByStwOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPackingRByStwOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPackingRByStwOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_ExistsReferrer_TPackingRByInspectionOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPackingRByInspectionOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPackingRByInspectionOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_ExistsReferrer_TPackingRByTagOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPackingRByTagOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPackingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByCaseOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByCaseOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByCaseOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByBolOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByBolOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByBolOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByPl1OutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByPl1OutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByPl1OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByTagOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByTagOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByShippingRecordOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByDelivOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByDelivOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByDelivOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByIndvSupplyOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByPackingOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByPackingOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByPackingOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByPlOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByPlOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByPlOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByIndvLabelOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByPl2OutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByPl2OutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByPl2OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRBySlipOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRBySlipOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRBySlipOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByNizoroeOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByNizoroeOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByNizoroeOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_ExistsReferrer_TPickingRByPllOutUserIdList() { return xgetSQueMap("userId_ExistsReferrer_TPickingRByPllOutUserIdList"); }
    public String keepUserId_ExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TPickingRByPllOutUserIdList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetUserId_ExistsReferrer_TReceiveLabelList() { return xgetSQueMap("userId_ExistsReferrer_TReceiveLabelList"); }
    public String keepUserId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("userId_ExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanRCQ> xdfgetUserId_ExistsReferrer_TReceivePlanRList() { return xgetSQueMap("userId_ExistsReferrer_TReceivePlanRList"); }
    public String keepUserId_ExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TReceivePlanRList", sq); }

    public Map<String, TStoreNoRCQ> xdfgetUserId_ExistsReferrer_TStoreNoRList() { return xgetSQueMap("userId_ExistsReferrer_TStoreNoRList"); }
    public String keepUserId_ExistsReferrer_TStoreNoRList(TStoreNoRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TStoreNoRList", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetUserId_ExistsReferrer_TStoreRecordRList() { return xgetSQueMap("userId_ExistsReferrer_TStoreRecordRList"); }
    public String keepUserId_ExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq) { return xkeepSQue("userId_ExistsReferrer_TStoreRecordRList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetUserId_ExistsReferrer_WSglRowShipInspBList() { return xgetSQueMap("userId_ExistsReferrer_WSglRowShipInspBList"); }
    public String keepUserId_ExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("userId_ExistsReferrer_WSglRowShipInspBList", sq); }

    public Map<String, BUserAuthCQ> xdfgetUserId_NotExistsReferrer_BUserAuthAsOne() { return xgetSQueMap("userId_NotExistsReferrer_BUserAuthAsOne"); }
    public String keepUserId_NotExistsReferrer_BUserAuthAsOne(BUserAuthCQ sq) { return xkeepSQue("userId_NotExistsReferrer_BUserAuthAsOne", sq); }

    public Map<String, MUserCenterCQ> xdfgetUserId_NotExistsReferrer_MUserCenterList() { return xgetSQueMap("userId_NotExistsReferrer_MUserCenterList"); }
    public String keepUserId_NotExistsReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("userId_NotExistsReferrer_MUserCenterList", sq); }

    public Map<String, MUserClientCQ> xdfgetUserId_NotExistsReferrer_MUserClientList() { return xgetSQueMap("userId_NotExistsReferrer_MUserClientList"); }
    public String keepUserId_NotExistsReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("userId_NotExistsReferrer_MUserClientList", sq); }

    public Map<String, MUserDepositCQ> xdfgetUserId_NotExistsReferrer_MUserDepositList() { return xgetSQueMap("userId_NotExistsReferrer_MUserDepositList"); }
    public String keepUserId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("userId_NotExistsReferrer_MUserDepositList", sq); }

    public Map<String, MUserLoginCQ> xdfgetUserId_NotExistsReferrer_MUserLoginAsOne() { return xgetSQueMap("userId_NotExistsReferrer_MUserLoginAsOne"); }
    public String keepUserId_NotExistsReferrer_MUserLoginAsOne(MUserLoginCQ sq) { return xkeepSQue("userId_NotExistsReferrer_MUserLoginAsOne", sq); }

    public Map<String, TEcOrderRCQ> xdfgetUserId_NotExistsReferrer_TEcOrderRList() { return xgetSQueMap("userId_NotExistsReferrer_TEcOrderRList"); }
    public String keepUserId_NotExistsReferrer_TEcOrderRList(TEcOrderRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TEcOrderRList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryBByInventoryUpdUserIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_NotExistsReferrer_TInventoryBByInventoryUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryBByInventoryUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryBByInventoryUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryRByInventoryRecordLocOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryRByStockDiffOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryRByTwlOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryRByTwlOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryRByInventoryRecordOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TInventoryRByInventoryDiffOutUserIdList", sq); }

    public Map<String, TMoveInstRCQ> xdfgetUserId_NotExistsReferrer_TMoveInstRList() { return xgetSQueMap("userId_NotExistsReferrer_TMoveInstRList"); }
    public String keepUserId_NotExistsReferrer_TMoveInstRList(TMoveInstRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TMoveInstRList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetUserId_NotExistsReferrer_TMoveRecordBList() { return xgetSQueMap("userId_NotExistsReferrer_TMoveRecordBList"); }
    public String keepUserId_NotExistsReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TMoveRecordBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetUserId_NotExistsReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("userId_NotExistsReferrer_TNizoroeAlarmLogList"); }
    public String keepUserId_NotExistsReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_NotExistsReferrer_TPackingRByStwOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPackingRByStwOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPackingRByStwOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPackingRByInspectionOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPackingRByInspectionOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_NotExistsReferrer_TPackingRByTagOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPackingRByTagOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPackingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByCaseOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByCaseOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByCaseOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByBolOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByBolOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByBolOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByPl1OutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByPl1OutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByPl1OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByTagOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByTagOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByShippingRecordOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByDelivOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByDelivOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByDelivOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByIndvSupplyOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByPackingOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByPackingOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByPackingOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByPlOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByPlOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByPlOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByIndvLabelOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByPl2OutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByPl2OutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByPl2OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRBySlipOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRBySlipOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRBySlipOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByNizoroeOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_NotExistsReferrer_TPickingRByPllOutUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_TPickingRByPllOutUserIdList"); }
    public String keepUserId_NotExistsReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TPickingRByPllOutUserIdList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetUserId_NotExistsReferrer_TReceiveLabelList() { return xgetSQueMap("userId_NotExistsReferrer_TReceiveLabelList"); }
    public String keepUserId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanRCQ> xdfgetUserId_NotExistsReferrer_TReceivePlanRList() { return xgetSQueMap("userId_NotExistsReferrer_TReceivePlanRList"); }
    public String keepUserId_NotExistsReferrer_TReceivePlanRList(TReceivePlanRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TReceivePlanRList", sq); }

    public Map<String, TStoreNoRCQ> xdfgetUserId_NotExistsReferrer_TStoreNoRList() { return xgetSQueMap("userId_NotExistsReferrer_TStoreNoRList"); }
    public String keepUserId_NotExistsReferrer_TStoreNoRList(TStoreNoRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TStoreNoRList", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetUserId_NotExistsReferrer_TStoreRecordRList() { return xgetSQueMap("userId_NotExistsReferrer_TStoreRecordRList"); }
    public String keepUserId_NotExistsReferrer_TStoreRecordRList(TStoreRecordRCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TStoreRecordRList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetUserId_NotExistsReferrer_WSglRowShipInspBList() { return xgetSQueMap("userId_NotExistsReferrer_WSglRowShipInspBList"); }
    public String keepUserId_NotExistsReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("userId_NotExistsReferrer_WSglRowShipInspBList", sq); }

    public Map<String, MUserCenterCQ> xdfgetUserId_SpecifyDerivedReferrer_MUserCenterList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_MUserCenterList"); }
    public String keepUserId_SpecifyDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_MUserCenterList", sq); }

    public Map<String, MUserClientCQ> xdfgetUserId_SpecifyDerivedReferrer_MUserClientList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_MUserClientList"); }
    public String keepUserId_SpecifyDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_MUserClientList", sq); }

    public Map<String, MUserDepositCQ> xdfgetUserId_SpecifyDerivedReferrer_MUserDepositList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_MUserDepositList"); }
    public String keepUserId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_MUserDepositList", sq); }

    public Map<String, TEcOrderRCQ> xdfgetUserId_SpecifyDerivedReferrer_TEcOrderRList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TEcOrderRList"); }
    public String keepUserId_SpecifyDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TEcOrderRList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryBByInventoryUpdUserIdList", sq); }

    public Map<String, TInventoryBCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryBByInventoryUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryRByStockDiffOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryRByTwlOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList", sq); }

    public Map<String, TInventoryRCQ> xdfgetUserId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList", sq); }

    public Map<String, TMoveInstRCQ> xdfgetUserId_SpecifyDerivedReferrer_TMoveInstRList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TMoveInstRList"); }
    public String keepUserId_SpecifyDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TMoveInstRList", sq); }

    public Map<String, TMoveRecordBCQ> xdfgetUserId_SpecifyDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TMoveRecordBList"); }
    public String keepUserId_SpecifyDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TMoveRecordBList", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetUserId_SpecifyDerivedReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepUserId_SpecifyDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TNizoroeAlarmLogList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPackingRByStwOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPackingRByInspectionOutUserIdList", sq); }

    public Map<String, TPackingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPackingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByCaseOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByBolOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByPl1OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByTagOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByShippingRecordOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByDelivOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByIndvSupplyOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByPackingOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByPlOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByIndvLabelOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByPl2OutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRBySlipOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByNizoroeOutUserIdList", sq); }

    public Map<String, TPickingRCQ> xdfgetUserId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TPickingRByPllOutUserIdList", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetUserId_SpecifyDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TReceiveLabelList"); }
    public String keepUserId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TReceiveLabelList", sq); }

    public Map<String, TReceivePlanRCQ> xdfgetUserId_SpecifyDerivedReferrer_TReceivePlanRList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TReceivePlanRList"); }
    public String keepUserId_SpecifyDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TReceivePlanRList", sq); }

    public Map<String, TStoreNoRCQ> xdfgetUserId_SpecifyDerivedReferrer_TStoreNoRList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TStoreNoRList"); }
    public String keepUserId_SpecifyDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TStoreNoRList", sq); }

    public Map<String, TStoreRecordRCQ> xdfgetUserId_SpecifyDerivedReferrer_TStoreRecordRList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TStoreRecordRList"); }
    public String keepUserId_SpecifyDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TStoreRecordRList", sq); }

    public Map<String, WSglRowShipInspBCQ> xdfgetUserId_SpecifyDerivedReferrer_WSglRowShipInspBList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_WSglRowShipInspBList"); }
    public String keepUserId_SpecifyDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_WSglRowShipInspBList", sq); }

    public Map<String, MUserCenterCQ> xdfgetUserId_QueryDerivedReferrer_MUserCenterList() { return xgetSQueMap("userId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepUserId_QueryDerivedReferrer_MUserCenterList(MUserCenterCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_MUserCenterList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_MUserCenterListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_MUserCenterList"); }
    public String keepUserId_QueryDerivedReferrer_MUserCenterListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_MUserCenterList", pm); }

    public Map<String, MUserClientCQ> xdfgetUserId_QueryDerivedReferrer_MUserClientList() { return xgetSQueMap("userId_QueryDerivedReferrer_MUserClientList"); }
    public String keepUserId_QueryDerivedReferrer_MUserClientList(MUserClientCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_MUserClientList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_MUserClientListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_MUserClientList"); }
    public String keepUserId_QueryDerivedReferrer_MUserClientListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_MUserClientList", pm); }

    public Map<String, MUserDepositCQ> xdfgetUserId_QueryDerivedReferrer_MUserDepositList() { return xgetSQueMap("userId_QueryDerivedReferrer_MUserDepositList"); }
    public String keepUserId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_MUserDepositList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_MUserDepositListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_MUserDepositList"); }
    public String keepUserId_QueryDerivedReferrer_MUserDepositListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_MUserDepositList", pm); }

    public Map<String, TEcOrderRCQ> xdfgetUserId_QueryDerivedReferrer_TEcOrderRList() { return xgetSQueMap("userId_QueryDerivedReferrer_TEcOrderRList"); }
    public String keepUserId_QueryDerivedReferrer_TEcOrderRList(TEcOrderRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TEcOrderRList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TEcOrderRListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TEcOrderRList"); }
    public String keepUserId_QueryDerivedReferrer_TEcOrderRListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TEcOrderRList", pm); }

    public Map<String, TInventoryBCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryBByInventoryUpdUserIdList", pm); }

    public Map<String, TInventoryBCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList(TInventoryBCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryBByInventoryUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryBByInventoryUserIdList", pm); }

    public Map<String, TInventoryRCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordLocOutUserIdList", pm); }

    public Map<String, TInventoryRCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryRByStockDiffOutUserIdList", pm); }

    public Map<String, TInventoryRCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryRByTwlOutUserIdList", pm); }

    public Map<String, TInventoryRCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryRByInventoryRecordOutUserIdList", pm); }

    public Map<String, TInventoryRCQ> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList(TInventoryRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TInventoryRByInventoryDiffOutUserIdList", pm); }

    public Map<String, TMoveInstRCQ> xdfgetUserId_QueryDerivedReferrer_TMoveInstRList() { return xgetSQueMap("userId_QueryDerivedReferrer_TMoveInstRList"); }
    public String keepUserId_QueryDerivedReferrer_TMoveInstRList(TMoveInstRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TMoveInstRList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TMoveInstRListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TMoveInstRList"); }
    public String keepUserId_QueryDerivedReferrer_TMoveInstRListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TMoveInstRList", pm); }

    public Map<String, TMoveRecordBCQ> xdfgetUserId_QueryDerivedReferrer_TMoveRecordBList() { return xgetSQueMap("userId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepUserId_QueryDerivedReferrer_TMoveRecordBList(TMoveRecordBCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TMoveRecordBList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TMoveRecordBListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TMoveRecordBList"); }
    public String keepUserId_QueryDerivedReferrer_TMoveRecordBListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TMoveRecordBList", pm); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetUserId_QueryDerivedReferrer_TNizoroeAlarmLogList() { return xgetSQueMap("userId_QueryDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogList(TNizoroeAlarmLogCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TNizoroeAlarmLogList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TNizoroeAlarmLogList"); }
    public String keepUserId_QueryDerivedReferrer_TNizoroeAlarmLogListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TNizoroeAlarmLogList", pm); }

    public Map<String, TPackingRCQ> xdfgetUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPackingRByStwOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPackingRByStwOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPackingRByStwOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByStwOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPackingRByStwOutUserIdList", pm); }

    public Map<String, TPackingRCQ> xdfgetUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPackingRByInspectionOutUserIdList", pm); }

    public Map<String, TPackingRCQ> xdfgetUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPackingRByTagOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdList(TPackingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPackingRByTagOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPackingRByTagOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPackingRByTagOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPackingRByTagOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByCaseOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByCaseOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByBolOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByBolOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByBolOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByBolOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByBolOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl1OutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByPl1OutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByTagOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByTagOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByTagOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByTagOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByTagOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByShippingRecordOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByDelivOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByDelivOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByIndvSupplyOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPackingOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByPackingOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByPlOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByPlOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByPlOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPlOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByPlOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByIndvLabelOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPl2OutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByPl2OutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRBySlipOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRBySlipOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByNizoroeOutUserIdList", pm); }

    public Map<String, TPickingRCQ> xdfgetUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_TPickingRByPllOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdList(TPickingRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TPickingRByPllOutUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TPickingRByPllOutUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_TPickingRByPllOutUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TPickingRByPllOutUserIdList", pm); }

    public Map<String, TReceiveLabelCQ> xdfgetUserId_QueryDerivedReferrer_TReceiveLabelList() { return xgetSQueMap("userId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepUserId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TReceiveLabelList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TReceiveLabelListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TReceiveLabelList"); }
    public String keepUserId_QueryDerivedReferrer_TReceiveLabelListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TReceiveLabelList", pm); }

    public Map<String, TReceivePlanRCQ> xdfgetUserId_QueryDerivedReferrer_TReceivePlanRList() { return xgetSQueMap("userId_QueryDerivedReferrer_TReceivePlanRList"); }
    public String keepUserId_QueryDerivedReferrer_TReceivePlanRList(TReceivePlanRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TReceivePlanRList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TReceivePlanRListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TReceivePlanRList"); }
    public String keepUserId_QueryDerivedReferrer_TReceivePlanRListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TReceivePlanRList", pm); }

    public Map<String, TStoreNoRCQ> xdfgetUserId_QueryDerivedReferrer_TStoreNoRList() { return xgetSQueMap("userId_QueryDerivedReferrer_TStoreNoRList"); }
    public String keepUserId_QueryDerivedReferrer_TStoreNoRList(TStoreNoRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TStoreNoRList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TStoreNoRListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TStoreNoRList"); }
    public String keepUserId_QueryDerivedReferrer_TStoreNoRListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TStoreNoRList", pm); }

    public Map<String, TStoreRecordRCQ> xdfgetUserId_QueryDerivedReferrer_TStoreRecordRList() { return xgetSQueMap("userId_QueryDerivedReferrer_TStoreRecordRList"); }
    public String keepUserId_QueryDerivedReferrer_TStoreRecordRList(TStoreRecordRCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TStoreRecordRList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TStoreRecordRListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TStoreRecordRList"); }
    public String keepUserId_QueryDerivedReferrer_TStoreRecordRListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TStoreRecordRList", pm); }

    public Map<String, WSglRowShipInspBCQ> xdfgetUserId_QueryDerivedReferrer_WSglRowShipInspBList() { return xgetSQueMap("userId_QueryDerivedReferrer_WSglRowShipInspBList"); }
    public String keepUserId_QueryDerivedReferrer_WSglRowShipInspBList(WSglRowShipInspBCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_WSglRowShipInspBList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_WSglRowShipInspBListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_WSglRowShipInspBList"); }
    public String keepUserId_QueryDerivedReferrer_WSglRowShipInspBListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_WSglRowShipInspBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _userCd;
    public ConditionValue xdfgetUserCd()
    { if (_userCd == null) { _userCd = nCV(); }
      return _userCd; }
    protected ConditionValue xgetCValueUserCd() { return xdfgetUserCd(); }

    public Map<String, TPackingHCQ> xdfgetUserCd_ExistsReferrer_TPackingHByUpdUserList() { return xgetSQueMap("userCd_ExistsReferrer_TPackingHByUpdUserList"); }
    public String keepUserCd_ExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq) { return xkeepSQue("userCd_ExistsReferrer_TPackingHByUpdUserList", sq); }

    public Map<String, TPackingHCQ> xdfgetUserCd_NotExistsReferrer_TPackingHByUpdUserList() { return xgetSQueMap("userCd_NotExistsReferrer_TPackingHByUpdUserList"); }
    public String keepUserCd_NotExistsReferrer_TPackingHByUpdUserList(TPackingHCQ sq) { return xkeepSQue("userCd_NotExistsReferrer_TPackingHByUpdUserList", sq); }

    public Map<String, TPackingHCQ> xdfgetUserCd_SpecifyDerivedReferrer_TPackingHByUpdUserList() { return xgetSQueMap("userCd_SpecifyDerivedReferrer_TPackingHByUpdUserList"); }
    public String keepUserCd_SpecifyDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq) { return xkeepSQue("userCd_SpecifyDerivedReferrer_TPackingHByUpdUserList", sq); }

    public Map<String, TPackingHCQ> xdfgetUserCd_QueryDerivedReferrer_TPackingHByUpdUserList() { return xgetSQueMap("userCd_QueryDerivedReferrer_TPackingHByUpdUserList"); }
    public String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserList(TPackingHCQ sq) { return xkeepSQue("userCd_QueryDerivedReferrer_TPackingHByUpdUserList", sq); }
    public Map<String, Object> xdfgetUserCd_QueryDerivedReferrer_TPackingHByUpdUserListParameter() { return xgetSQuePmMap("userCd_QueryDerivedReferrer_TPackingHByUpdUserList"); }
    public String keepUserCd_QueryDerivedReferrer_TPackingHByUpdUserListParameter(Object pm) { return xkeepSQuePm("userCd_QueryDerivedReferrer_TPackingHByUpdUserList", pm); }

    /**
     * Add order-by as ascend. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserCd_Asc() { regOBA("USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_CD: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserCd_Desc() { regOBD("USER_CD"); return this; }

    protected ConditionValue _userNm;
    public ConditionValue xdfgetUserNm()
    { if (_userNm == null) { _userNm = nCV(); }
      return _userNm; }
    protected ConditionValue xgetCValueUserNm() { return xdfgetUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserNm_Asc() { regOBA("USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NM: {NotNull, VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UserNm_Desc() { regOBD("USER_NM"); return this; }

    protected ConditionValue _cultureId;
    public ConditionValue xdfgetCultureId()
    { if (_cultureId == null) { _cultureId = nCV(); }
      return _cultureId; }
    protected ConditionValue xgetCValueCultureId() { return xdfgetCultureId(); }

    public Map<String, BCultureCQ> getCultureId_InScopeRelation_BCulture() { return xgetSQueMap("cultureId_InScopeRelation_BCulture"); }
    public String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_InScopeRelation_BCulture", sq); }

    public Map<String, BCultureCQ> getCultureId_NotInScopeRelation_BCulture() { return xgetSQueMap("cultureId_NotInScopeRelation_BCulture"); }
    public String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq) { return xkeepSQue("cultureId_NotInScopeRelation_BCulture", sq); }

    /**
     * Add order-by as ascend. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_CultureId_Asc() { regOBA("CULTURE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CULTURE_ID: {IX, NotNull, BIGINT(19), FK to b_culture}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_CultureId_Desc() { regOBD("CULTURE_ID"); return this; }

    protected ConditionValue _roleGrpId;
    public ConditionValue xdfgetRoleGrpId()
    { if (_roleGrpId == null) { _roleGrpId = nCV(); }
      return _roleGrpId; }
    protected ConditionValue xgetCValueRoleGrpId() { return xdfgetRoleGrpId(); }

    public Map<String, BRoleGrpCQ> getRoleGrpId_InScopeRelation_BRoleGrp() { return xgetSQueMap("roleGrpId_InScopeRelation_BRoleGrp"); }
    public String keepRoleGrpId_InScopeRelation_BRoleGrp(BRoleGrpCQ sq) { return xkeepSQue("roleGrpId_InScopeRelation_BRoleGrp", sq); }

    public Map<String, BRoleGrpCQ> getRoleGrpId_NotInScopeRelation_BRoleGrp() { return xgetSQueMap("roleGrpId_NotInScopeRelation_BRoleGrp"); }
    public String keepRoleGrpId_NotInScopeRelation_BRoleGrp(BRoleGrpCQ sq) { return xkeepSQue("roleGrpId_NotInScopeRelation_BRoleGrp", sq); }

    /**
     * Add order-by as ascend. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_RoleGrpId_Asc() { regOBA("ROLE_GRP_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_GRP_ID: {IX, BIGINT(19), FK to b_role_grp}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_RoleGrpId_Desc() { regOBD("ROLE_GRP_ID"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /**
     * Add order-by as ascend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    protected ConditionValue _controlNo;
    public ConditionValue xdfgetControlNo()
    { if (_controlNo == null) { _controlNo = nCV(); }
      return _controlNo; }
    protected ConditionValue xgetCValueControlNo() { return xdfgetControlNo(); }

    /**
     * Add order-by as ascend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

    protected ConditionValue _addDt;
    public ConditionValue xdfgetAddDt()
    { if (_addDt == null) { _addDt = nCV(); }
      return _addDt; }
    protected ConditionValue xgetCValueAddDt() { return xdfgetAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

    protected ConditionValue _addUser;
    public ConditionValue xdfgetAddUser()
    { if (_addUser == null) { _addUser = nCV(); }
      return _addUser; }
    protected ConditionValue xgetCValueAddUser() { return xdfgetAddUser(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

    protected ConditionValue _addProcess;
    public ConditionValue xdfgetAddProcess()
    { if (_addProcess == null) { _addProcess = nCV(); }
      return _addProcess; }
    protected ConditionValue xgetCValueAddProcess() { return xdfgetAddProcess(); }

    /**
     * Add order-by as ascend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

    protected ConditionValue _updDt;
    public ConditionValue xdfgetUpdDt()
    { if (_updDt == null) { _updDt = nCV(); }
      return _updDt; }
    protected ConditionValue xgetCValueUpdDt() { return xdfgetUpdDt(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

    protected ConditionValue _updUser;
    public ConditionValue xdfgetUpdUser()
    { if (_updUser == null) { _updUser = nCV(); }
      return _updUser; }
    protected ConditionValue xgetCValueUpdUser() { return xdfgetUpdUser(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

    protected ConditionValue _updProcess;
    public ConditionValue xdfgetUpdProcess()
    { if (_updProcess == null) { _updProcess = nCV(); }
      return _updProcess; }
    protected ConditionValue xgetCValueUpdProcess() { return xdfgetUpdProcess(); }

    /**
     * Add order-by as ascend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsBUserCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsBUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsBUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        BUserCQ bq = (BUserCQ)bqs;
        BUserCQ uq = (BUserCQ)uqs;
        if (bq.hasConditionQueryBCulture()) {
            uq.queryBCulture().reflectRelationOnUnionQuery(bq.queryBCulture(), uq.queryBCulture());
        }
        if (bq.hasConditionQueryBRoleGrp()) {
            uq.queryBRoleGrp().reflectRelationOnUnionQuery(bq.queryBRoleGrp(), uq.queryBRoleGrp());
        }
        if (bq.hasConditionQueryBClassDtlByDelFlg()) {
            uq.queryBClassDtlByDelFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelFlg(), uq.queryBClassDtlByDelFlg());
        }
        if (bq.hasConditionQueryBUserAuthAsOne()) {
            uq.queryBUserAuthAsOne().reflectRelationOnUnionQuery(bq.queryBUserAuthAsOne(), uq.queryBUserAuthAsOne());
        }
        if (bq.hasConditionQueryMUserLoginAsOne()) {
            uq.queryMUserLoginAsOne().reflectRelationOnUnionQuery(bq.queryMUserLoginAsOne(), uq.queryMUserLoginAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The instance of condition-query. (NotNull)
     */
    public BCultureCQ queryBCulture() {
        return xdfgetConditionQueryBCulture();
    }
    public BCultureCQ xdfgetConditionQueryBCulture() {
        String prop = "bCulture";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBCulture()); xsetupOuterJoinBCulture(); }
        return xgetQueRlMap(prop);
    }
    protected BCultureCQ xcreateQueryBCulture() {
        String nrp = xresolveNRP("b_user", "bCulture"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BCultureCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bCulture", nrp);
    }
    protected void xsetupOuterJoinBCulture() { xregOutJo("bCulture"); }
    public boolean hasConditionQueryBCulture() { return xhasQueRlMap("bCulture"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_role_grp by my ROLE_GRP_ID, named 'BRoleGrp'.
     * @return The instance of condition-query. (NotNull)
     */
    public BRoleGrpCQ queryBRoleGrp() {
        return xdfgetConditionQueryBRoleGrp();
    }
    public BRoleGrpCQ xdfgetConditionQueryBRoleGrp() {
        String prop = "bRoleGrp";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBRoleGrp()); xsetupOuterJoinBRoleGrp(); }
        return xgetQueRlMap(prop);
    }
    protected BRoleGrpCQ xcreateQueryBRoleGrp() {
        String nrp = xresolveNRP("b_user", "bRoleGrp"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BRoleGrpCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bRoleGrp", nrp);
    }
    protected void xsetupOuterJoinBRoleGrp() { xregOutJo("bRoleGrp"); }
    public boolean hasConditionQueryBRoleGrp() { return xhasQueRlMap("bRoleGrp"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelFlg() {
        return xdfgetConditionQueryBClassDtlByDelFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelFlg() {
        String prop = "bClassDtlByDelFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelFlg()); xsetupOuterJoinBClassDtlByDelFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelFlg() {
        String nrp = xresolveNRP("b_user", "bClassDtlByDelFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelFlg() { xregOutJo("bClassDtlByDelFlg"); }
    public boolean hasConditionQueryBClassDtlByDelFlg() { return xhasQueRlMap("bClassDtlByDelFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user_auth by USER_ID, named 'BUserAuthAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserAuthCQ queryBUserAuthAsOne() { return xdfgetConditionQueryBUserAuthAsOne(); }
    public BUserAuthCQ xdfgetConditionQueryBUserAuthAsOne() {
        String prop = "bUserAuthAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserAuthAsOne()); xsetupOuterJoinBUserAuthAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected BUserAuthCQ xcreateQueryBUserAuthAsOne() {
        String nrp = xresolveNRP("b_user", "bUserAuthAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserAuthCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserAuthAsOne", nrp);
    }
    protected void xsetupOuterJoinBUserAuthAsOne() { xregOutJo("bUserAuthAsOne"); }
    public boolean hasConditionQueryBUserAuthAsOne() { return xhasQueRlMap("bUserAuthAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_user_login by USER_ID, named 'MUserLoginAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MUserLoginCQ queryMUserLoginAsOne() { return xdfgetConditionQueryMUserLoginAsOne(); }
    public MUserLoginCQ xdfgetConditionQueryMUserLoginAsOne() {
        String prop = "mUserLoginAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMUserLoginAsOne()); xsetupOuterJoinMUserLoginAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MUserLoginCQ xcreateQueryMUserLoginAsOne() {
        String nrp = xresolveNRP("b_user", "mUserLoginAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MUserLoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mUserLoginAsOne", nrp);
    }
    protected void xsetupOuterJoinMUserLoginAsOne() { xregOutJo("mUserLoginAsOne"); }
    public boolean hasConditionQueryMUserLoginAsOne() { return xhasQueRlMap("mUserLoginAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, BUserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(BUserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, BUserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(BUserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, BUserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(BUserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, BUserCQ> _myselfExistsMap;
    public Map<String, BUserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(BUserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, BUserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(BUserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BUserCB.class.getName(); }
    protected String xCQ() { return BUserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}