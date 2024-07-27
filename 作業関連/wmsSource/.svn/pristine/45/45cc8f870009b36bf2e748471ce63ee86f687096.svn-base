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
 * The base condition-query of t_receive_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanHCQ extends AbstractBsTReceivePlanHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_receive_plan_h) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReceivePlanHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReceivePlanHCIQ xcreateCIQ() {
        TReceivePlanHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReceivePlanHCIQ xnewCIQ() {
        return new TReceivePlanHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_receive_plan_h on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReceivePlanHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReceivePlanHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanHId;
    public ConditionValue xdfgetReceivePlanHId()
    { if (_receivePlanHId == null) { _receivePlanHId = nCV(); }
      return _receivePlanHId; }
    protected ConditionValue xgetCValueReceivePlanHId() { return xdfgetReceivePlanHId(); }

    public Map<String, TReceivePlanBCQ> xdfgetReceivePlanHId_ExistsReferrer_TReceivePlanBList() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TReceivePlanBList"); }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetReceivePlanHId_ExistsReferrer_TReceivePlanHSelfList() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TReceivePlanHSelfList"); }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TReceivePlanHSelfList", sq); }

    public Map<String, TReceivePlanRCQ> xdfgetReceivePlanHId_ExistsReferrer_TReceivePlanRAsOne() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TReceivePlanRAsOne"); }
    public String keepReceivePlanHId_ExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TReceivePlanRAsOne", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetReceivePlanHId_ExistsReferrer_TStoreRecordHList() { return xgetSQueMap("receivePlanHId_ExistsReferrer_TStoreRecordHList"); }
    public String keepReceivePlanHId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("receivePlanHId_ExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetReceivePlanHId_NotExistsReferrer_TReceivePlanBList() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TReceivePlanBList"); }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TReceivePlanBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TReceivePlanHSelfList"); }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TReceivePlanHSelfList", sq); }

    public Map<String, TReceivePlanRCQ> xdfgetReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TReceivePlanRAsOne"); }
    public String keepReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TReceivePlanRAsOne", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetReceivePlanHId_NotExistsReferrer_TStoreRecordHList() { return xgetSQueMap("receivePlanHId_NotExistsReferrer_TStoreRecordHList"); }
    public String keepReceivePlanHId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("receivePlanHId_NotExistsReferrer_TStoreRecordHList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("receivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList"); }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList() { return xgetSQueMap("receivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList"); }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList", sq); }

    public Map<String, TStoreRecordHCQ> xdfgetReceivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("receivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList"); }
    public String keepReceivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("receivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList", sq); }

    public Map<String, TReceivePlanBCQ> xdfgetReceivePlanHId_QueryDerivedReferrer_TReceivePlanBList() { return xgetSQueMap("receivePlanHId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanHId_QueryDerivedReferrer_TReceivePlanBList", sq); }
    public Map<String, Object> xdfgetReceivePlanHId_QueryDerivedReferrer_TReceivePlanBListParameter() { return xgetSQuePmMap("receivePlanHId_QueryDerivedReferrer_TReceivePlanBList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBListParameter(Object pm) { return xkeepSQuePm("receivePlanHId_QueryDerivedReferrer_TReceivePlanBList", pm); }

    public Map<String, TReceivePlanHCQ> xdfgetReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList() { return xgetSQueMap("receivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq) { return xkeepSQue("receivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList", sq); }
    public Map<String, Object> xdfgetReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfListParameter() { return xgetSQuePmMap("receivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfListParameter(Object pm) { return xkeepSQuePm("receivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList", pm); }

    public Map<String, TStoreRecordHCQ> xdfgetReceivePlanHId_QueryDerivedReferrer_TStoreRecordHList() { return xgetSQueMap("receivePlanHId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq) { return xkeepSQue("receivePlanHId_QueryDerivedReferrer_TStoreRecordHList", sq); }
    public Map<String, Object> xdfgetReceivePlanHId_QueryDerivedReferrer_TStoreRecordHListParameter() { return xgetSQuePmMap("receivePlanHId_QueryDerivedReferrer_TStoreRecordHList"); }
    public String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHListParameter(Object pm) { return xkeepSQuePm("receivePlanHId_QueryDerivedReferrer_TStoreRecordHList", pm); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceivePlanHId_Asc() { regOBA("RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceivePlanHId_Desc() { regOBD("RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    public Map<String, MClientCQ> getClientId_InScopeRelation_MClient() { return xgetSQueMap("clientId_InScopeRelation_MClient"); }
    public String keepClientId_InScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_InScopeRelation_MClient", sq); }

    public Map<String, MClientCQ> getClientId_NotInScopeRelation_MClient() { return xgetSQueMap("clientId_NotInScopeRelation_MClient"); }
    public String keepClientId_NotInScopeRelation_MClient(MClientCQ sq) { return xkeepSQue("clientId_NotInScopeRelation_MClient", sq); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_InScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_InScopeRelation_MProcessType"); }
    public String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_InScopeRelation_MProcessType", sq); }

    public Map<String, MProcessTypeCQ> getProcessTypeId_NotInScopeRelation_MProcessType() { return xgetSQueMap("processTypeId_NotInScopeRelation_MProcessType"); }
    public String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq) { return xkeepSQue("processTypeId_NotInScopeRelation_MProcessType", sq); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _stockTypeId;
    public ConditionValue xdfgetStockTypeId()
    { if (_stockTypeId == null) { _stockTypeId = nCV(); }
      return _stockTypeId; }
    protected ConditionValue xgetCValueStockTypeId() { return xdfgetStockTypeId(); }

    public Map<String, MStockTypeCQ> getStockTypeId_InScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_InScopeRelation_MStockType"); }
    public String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_InScopeRelation_MStockType", sq); }

    public Map<String, MStockTypeCQ> getStockTypeId_NotInScopeRelation_MStockType() { return xgetSQueMap("stockTypeId_NotInScopeRelation_MStockType"); }
    public String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq) { return xkeepSQue("stockTypeId_NotInScopeRelation_MStockType", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_StockTypeId_Asc() { regOBA("STOCK_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_StockTypeId_Desc() { regOBD("STOCK_TYPE_ID"); return this; }

    protected ConditionValue _receivePlanDt;
    public ConditionValue xdfgetReceivePlanDt()
    { if (_receivePlanDt == null) { _receivePlanDt = nCV(); }
      return _receivePlanDt; }
    protected ConditionValue xgetCValueReceivePlanDt() { return xdfgetReceivePlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceivePlanDt_Asc() { regOBA("RECEIVE_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceivePlanDt_Desc() { regOBD("RECEIVE_PLAN_DT"); return this; }

    protected ConditionValue _planClientReceiveNo;
    public ConditionValue xdfgetPlanClientReceiveNo()
    { if (_planClientReceiveNo == null) { _planClientReceiveNo = nCV(); }
      return _planClientReceiveNo; }
    protected ConditionValue xgetCValuePlanClientReceiveNo() { return xdfgetPlanClientReceiveNo(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanClientReceiveNo_Asc() { regOBA("PLAN_CLIENT_RECEIVE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanClientReceiveNo_Desc() { regOBD("PLAN_CLIENT_RECEIVE_NO"); return this; }

    protected ConditionValue _receiveSlipNo;
    public ConditionValue xdfgetReceiveSlipNo()
    { if (_receiveSlipNo == null) { _receiveSlipNo = nCV(); }
      return _receiveSlipNo; }
    protected ConditionValue xgetCValueReceiveSlipNo() { return xdfgetReceiveSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveSlipNo_Asc() { regOBA("RECEIVE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveSlipNo_Desc() { regOBD("RECEIVE_SLIP_NO"); return this; }

    protected ConditionValue _planSupplierId;
    public ConditionValue xdfgetPlanSupplierId()
    { if (_planSupplierId == null) { _planSupplierId = nCV(); }
      return _planSupplierId; }
    protected ConditionValue xgetCValuePlanSupplierId() { return xdfgetPlanSupplierId(); }

    public Map<String, MCustomerCQ> getPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId() { return xgetSQueMap("planSupplierId_InScopeRelation_MCustomerByPlanSupplierId"); }
    public String keepPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq) { return xkeepSQue("planSupplierId_InScopeRelation_MCustomerByPlanSupplierId", sq); }

    public Map<String, MCustomerCQ> getPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId() { return xgetSQueMap("planSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId"); }
    public String keepPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq) { return xkeepSQue("planSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanSupplierId_Asc() { regOBA("PLAN_SUPPLIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanSupplierId_Desc() { regOBD("PLAN_SUPPLIER_ID"); return this; }

    protected ConditionValue _planSupplierCd;
    public ConditionValue xdfgetPlanSupplierCd()
    { if (_planSupplierCd == null) { _planSupplierCd = nCV(); }
      return _planSupplierCd; }
    protected ConditionValue xgetCValuePlanSupplierCd() { return xdfgetPlanSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanSupplierCd_Asc() { regOBA("PLAN_SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanSupplierCd_Desc() { regOBD("PLAN_SUPPLIER_CD"); return this; }

    protected ConditionValue _planDepositId;
    public ConditionValue xdfgetPlanDepositId()
    { if (_planDepositId == null) { _planDepositId = nCV(); }
      return _planDepositId; }
    protected ConditionValue xgetCValuePlanDepositId() { return xdfgetPlanDepositId(); }

    public Map<String, MCustomerCQ> getPlanDepositId_InScopeRelation_MCustomerByPlanDepositId() { return xgetSQueMap("planDepositId_InScopeRelation_MCustomerByPlanDepositId"); }
    public String keepPlanDepositId_InScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq) { return xkeepSQue("planDepositId_InScopeRelation_MCustomerByPlanDepositId", sq); }

    public Map<String, MCustomerCQ> getPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId() { return xgetSQueMap("planDepositId_NotInScopeRelation_MCustomerByPlanDepositId"); }
    public String keepPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq) { return xkeepSQue("planDepositId_NotInScopeRelation_MCustomerByPlanDepositId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanDepositId_Asc() { regOBA("PLAN_DEPOSIT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanDepositId_Desc() { regOBD("PLAN_DEPOSIT_ID"); return this; }

    protected ConditionValue _planDepositCd;
    public ConditionValue xdfgetPlanDepositCd()
    { if (_planDepositCd == null) { _planDepositCd = nCV(); }
      return _planDepositCd; }
    protected ConditionValue xgetCValuePlanDepositCd() { return xdfgetPlanDepositCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanDepositCd_Asc() { regOBA("PLAN_DEPOSIT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlanDepositCd_Desc() { regOBD("PLAN_DEPOSIT_CD"); return this; }

    protected ConditionValue _receiveStatus;
    public ConditionValue xdfgetReceiveStatus()
    { if (_receiveStatus == null) { _receiveStatus = nCV(); }
      return _receiveStatus; }
    protected ConditionValue xgetCValueReceiveStatus() { return xdfgetReceiveStatus(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveStatus_Asc() { regOBA("RECEIVE_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveStatus_Desc() { regOBD("RECEIVE_STATUS"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _receiveDeliveryStatus;
    public ConditionValue xdfgetReceiveDeliveryStatus()
    { if (_receiveDeliveryStatus == null) { _receiveDeliveryStatus = nCV(); }
      return _receiveDeliveryStatus; }
    protected ConditionValue xgetCValueReceiveDeliveryStatus() { return xdfgetReceiveDeliveryStatus(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveDeliveryStatus_Asc() { regOBA("RECEIVE_DELIVERY_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveDeliveryStatus_Desc() { regOBD("RECEIVE_DELIVERY_STATUS"); return this; }

    protected ConditionValue _oldReceivePlanHId;
    public ConditionValue xdfgetOldReceivePlanHId()
    { if (_oldReceivePlanHId == null) { _oldReceivePlanHId = nCV(); }
      return _oldReceivePlanHId; }
    protected ConditionValue xgetCValueOldReceivePlanHId() { return xdfgetOldReceivePlanHId(); }

    public Map<String, TReceivePlanHCQ> getOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf() { return xgetSQueMap("oldReceivePlanHId_InScopeRelation_TReceivePlanHSelf"); }
    public String keepOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq) { return xkeepSQue("oldReceivePlanHId_InScopeRelation_TReceivePlanHSelf", sq); }

    public Map<String, TReceivePlanHCQ> getOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf() { return xgetSQueMap("oldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf"); }
    public String keepOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq) { return xkeepSQue("oldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf", sq); }

    /**
     * Add order-by as ascend. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OldReceivePlanHId_Asc() { regOBA("OLD_RECEIVE_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OldReceivePlanHId_Desc() { regOBD("OLD_RECEIVE_PLAN_H_ID"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _centerTransitFlg;
    public ConditionValue xdfgetCenterTransitFlg()
    { if (_centerTransitFlg == null) { _centerTransitFlg = nCV(); }
      return _centerTransitFlg; }
    protected ConditionValue xgetCValueCenterTransitFlg() { return xdfgetCenterTransitFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CenterTransitFlg_Asc() { regOBA("CENTER_TRANSIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CenterTransitFlg_Desc() { regOBD("CENTER_TRANSIT_FLG"); return this; }

    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPickingHCQ> getPickingHId_InScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_InScopeRelation_TPickingH"); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_InScopeRelation_TPickingH", sq); }

    public Map<String, TPickingHCQ> getPickingHId_NotInScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_NotInScopeRelation_TPickingH"); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_NotInScopeRelation_TPickingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

    protected ConditionValue _sapReceiveSlipNo;
    public ConditionValue xdfgetSapReceiveSlipNo()
    { if (_sapReceiveSlipNo == null) { _sapReceiveSlipNo = nCV(); }
      return _sapReceiveSlipNo; }
    protected ConditionValue xgetCValueSapReceiveSlipNo() { return xdfgetSapReceiveSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapReceiveSlipNo_Asc() { regOBA("SAP_RECEIVE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapReceiveSlipNo_Desc() { regOBD("SAP_RECEIVE_SLIP_NO"); return this; }

    protected ConditionValue _slipTypeId;
    public ConditionValue xdfgetSlipTypeId()
    { if (_slipTypeId == null) { _slipTypeId = nCV(); }
      return _slipTypeId; }
    protected ConditionValue xgetCValueSlipTypeId() { return xdfgetSlipTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SlipTypeId_Asc() { regOBA("SLIP_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SlipTypeId_Desc() { regOBD("SLIP_TYPE_ID"); return this; }

    protected ConditionValue _slipTypeCd;
    public ConditionValue xdfgetSlipTypeCd()
    { if (_slipTypeCd == null) { _slipTypeCd = nCV(); }
      return _slipTypeCd; }
    protected ConditionValue xgetCValueSlipTypeCd() { return xdfgetSlipTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SlipTypeCd_Asc() { regOBA("SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SlipTypeCd_Desc() { regOBD("SLIP_TYPE_CD"); return this; }

    protected ConditionValue _purchaseOrderNo;
    public ConditionValue xdfgetPurchaseOrderNo()
    { if (_purchaseOrderNo == null) { _purchaseOrderNo = nCV(); }
      return _purchaseOrderNo; }
    protected ConditionValue xgetCValuePurchaseOrderNo() { return xdfgetPurchaseOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PurchaseOrderNo_Asc() { regOBA("PURCHASE_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PurchaseOrderNo_Desc() { regOBD("PURCHASE_ORDER_NO"); return this; }

    protected ConditionValue _receiveReasonCd;
    public ConditionValue xdfgetReceiveReasonCd()
    { if (_receiveReasonCd == null) { _receiveReasonCd = nCV(); }
      return _receiveReasonCd; }
    protected ConditionValue xgetCValueReceiveReasonCd() { return xdfgetReceiveReasonCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveReasonCd_Asc() { regOBA("RECEIVE_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveReasonCd_Desc() { regOBD("RECEIVE_REASON_CD"); return this; }

    protected ConditionValue _orderDate;
    public ConditionValue xdfgetOrderDate()
    { if (_orderDate == null) { _orderDate = nCV(); }
      return _orderDate; }
    protected ConditionValue xgetCValueOrderDate() { return xdfgetOrderDate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OrderDate_Asc() { regOBA("ORDER_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OrderDate_Desc() { regOBD("ORDER_DATE"); return this; }

    protected ConditionValue _orderTime;
    public ConditionValue xdfgetOrderTime()
    { if (_orderTime == null) { _orderTime = nCV(); }
      return _orderTime; }
    protected ConditionValue xgetCValueOrderTime() { return xdfgetOrderTime(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OrderTime_Asc() { regOBA("ORDER_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_OrderTime_Desc() { regOBD("ORDER_TIME"); return this; }

    protected ConditionValue _confirmedDeliveryDt;
    public ConditionValue xdfgetConfirmedDeliveryDt()
    { if (_confirmedDeliveryDt == null) { _confirmedDeliveryDt = nCV(); }
      return _confirmedDeliveryDt; }
    protected ConditionValue xgetCValueConfirmedDeliveryDt() { return xdfgetConfirmedDeliveryDt(); }

    /**
     * Add order-by as ascend. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ConfirmedDeliveryDt_Asc() { regOBA("CONFIRMED_DELIVERY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ConfirmedDeliveryDt_Desc() { regOBD("CONFIRMED_DELIVERY_DT"); return this; }

    protected ConditionValue _plantCd;
    public ConditionValue xdfgetPlantCd()
    { if (_plantCd == null) { _plantCd = nCV(); }
      return _plantCd; }
    protected ConditionValue xgetCValuePlantCd() { return xdfgetPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

    protected ConditionValue _storageSpaceCd;
    public ConditionValue xdfgetStorageSpaceCd()
    { if (_storageSpaceCd == null) { _storageSpaceCd = nCV(); }
      return _storageSpaceCd; }
    protected ConditionValue xgetCValueStorageSpaceCd() { return xdfgetStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _tenhanshaCd;
    public ConditionValue xdfgetTenhanshaCd()
    { if (_tenhanshaCd == null) { _tenhanshaCd = nCV(); }
      return _tenhanshaCd; }
    protected ConditionValue xgetCValueTenhanshaCd() { return xdfgetTenhanshaCd(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

    protected ConditionValue _salesOrgId;
    public ConditionValue xdfgetSalesOrgId()
    { if (_salesOrgId == null) { _salesOrgId = nCV(); }
      return _salesOrgId; }
    protected ConditionValue xgetCValueSalesOrgId() { return xdfgetSalesOrgId(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SalesOrgId_Asc() { regOBA("SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SalesOrgId_Desc() { regOBD("SALES_ORG_ID"); return this; }

    protected ConditionValue _salesOrgCd;
    public ConditionValue xdfgetSalesOrgCd()
    { if (_salesOrgCd == null) { _salesOrgCd = nCV(); }
      return _salesOrgCd; }
    protected ConditionValue xgetCValueSalesOrgCd() { return xdfgetSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _tenhanshaNm1;
    public ConditionValue xdfgetTenhanshaNm1()
    { if (_tenhanshaNm1 == null) { _tenhanshaNm1 = nCV(); }
      return _tenhanshaNm1; }
    protected ConditionValue xgetCValueTenhanshaNm1() { return xdfgetTenhanshaNm1(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaNm1_Asc() { regOBA("TENHANSHA_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaNm1_Desc() { regOBD("TENHANSHA_NM1"); return this; }

    protected ConditionValue _tenhanshaNm2;
    public ConditionValue xdfgetTenhanshaNm2()
    { if (_tenhanshaNm2 == null) { _tenhanshaNm2 = nCV(); }
      return _tenhanshaNm2; }
    protected ConditionValue xgetCValueTenhanshaNm2() { return xdfgetTenhanshaNm2(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaNm2_Asc() { regOBA("TENHANSHA_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TenhanshaNm2_Desc() { regOBD("TENHANSHA_NM2"); return this; }

    protected ConditionValue _sapUserCd;
    public ConditionValue xdfgetSapUserCd()
    { if (_sapUserCd == null) { _sapUserCd = nCV(); }
      return _sapUserCd; }
    protected ConditionValue xgetCValueSapUserCd() { return xdfgetSapUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapUserCd_Asc() { regOBA("SAP_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapUserCd_Desc() { regOBD("SAP_USER_CD"); return this; }

    protected ConditionValue _sapUserNm;
    public ConditionValue xdfgetSapUserNm()
    { if (_sapUserNm == null) { _sapUserNm = nCV(); }
      return _sapUserNm; }
    protected ConditionValue xgetCValueSapUserNm() { return xdfgetSapUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapUserNm_Asc() { regOBA("SAP_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapUserNm_Desc() { regOBD("SAP_USER_NM"); return this; }

    protected ConditionValue _customerOrderNo;
    public ConditionValue xdfgetCustomerOrderNo()
    { if (_customerOrderNo == null) { _customerOrderNo = nCV(); }
      return _customerOrderNo; }
    protected ConditionValue xgetCValueCustomerOrderNo() { return xdfgetCustomerOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CustomerOrderNo_Asc() { regOBA("CUSTOMER_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_CustomerOrderNo_Desc() { regOBD("CUSTOMER_ORDER_NO"); return this; }

    protected ConditionValue _sapVenderCd;
    public ConditionValue xdfgetSapVenderCd()
    { if (_sapVenderCd == null) { _sapVenderCd = nCV(); }
      return _sapVenderCd; }
    protected ConditionValue xgetCValueSapVenderCd() { return xdfgetSapVenderCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapVenderCd_Asc() { regOBA("SAP_VENDER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapVenderCd_Desc() { regOBD("SAP_VENDER_CD"); return this; }

    protected ConditionValue _sapSupplierCd;
    public ConditionValue xdfgetSapSupplierCd()
    { if (_sapSupplierCd == null) { _sapSupplierCd = nCV(); }
      return _sapSupplierCd; }
    protected ConditionValue xgetCValueSapSupplierCd() { return xdfgetSapSupplierCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapSupplierCd_Asc() { regOBA("SAP_SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SapSupplierCd_Desc() { regOBD("SAP_SUPPLIER_CD"); return this; }

    protected ConditionValue _todayFlg;
    public ConditionValue xdfgetTodayFlg()
    { if (_todayFlg == null) { _todayFlg = nCV(); }
      return _todayFlg; }
    protected ConditionValue xgetCValueTodayFlg() { return xdfgetTodayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TODAY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TodayFlg_Asc() { regOBA("TODAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TODAY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_TodayFlg_Desc() { regOBD("TODAY_FLG"); return this; }

    protected ConditionValue _sanshaDeliverySlipNo1;
    public ConditionValue xdfgetSanshaDeliverySlipNo1()
    { if (_sanshaDeliverySlipNo1 == null) { _sanshaDeliverySlipNo1 = nCV(); }
      return _sanshaDeliverySlipNo1; }
    protected ConditionValue xgetCValueSanshaDeliverySlipNo1() { return xdfgetSanshaDeliverySlipNo1(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SanshaDeliverySlipNo1_Asc() { regOBA("SANSHA_DELIVERY_SLIP_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SanshaDeliverySlipNo1_Desc() { regOBD("SANSHA_DELIVERY_SLIP_NO1"); return this; }

    protected ConditionValue _dataTypeCd;
    public ConditionValue xdfgetDataTypeCd()
    { if (_dataTypeCd == null) { _dataTypeCd = nCV(); }
      return _dataTypeCd; }
    protected ConditionValue xgetCValueDataTypeCd() { return xdfgetDataTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_DataTypeCd_Asc() { regOBA("DATA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_DataTypeCd_Desc() { regOBD("DATA_TYPE_CD"); return this; }

    protected ConditionValue _sanshaTypeCd;
    public ConditionValue xdfgetSanshaTypeCd()
    { if (_sanshaTypeCd == null) { _sanshaTypeCd = nCV(); }
      return _sanshaTypeCd; }
    protected ConditionValue xgetCValueSanshaTypeCd() { return xdfgetSanshaTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SanshaTypeCd_Asc() { regOBA("SANSHA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SanshaTypeCd_Desc() { regOBD("SANSHA_TYPE_CD"); return this; }

    protected ConditionValue _receiveReasonNm;
    public ConditionValue xdfgetReceiveReasonNm()
    { if (_receiveReasonNm == null) { _receiveReasonNm = nCV(); }
      return _receiveReasonNm; }
    protected ConditionValue xgetCValueReceiveReasonNm() { return xdfgetReceiveReasonNm(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveReasonNm_Asc() { regOBA("RECEIVE_REASON_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ReceiveReasonNm_Desc() { regOBD("RECEIVE_REASON_NM"); return this; }

    protected ConditionValue _modTypeCd;
    public ConditionValue xdfgetModTypeCd()
    { if (_modTypeCd == null) { _modTypeCd = nCV(); }
      return _modTypeCd; }
    protected ConditionValue xgetCValueModTypeCd() { return xdfgetModTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ModTypeCd_Asc() { regOBA("MOD_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ModTypeCd_Desc() { regOBD("MOD_TYPE_CD"); return this; }

    protected ConditionValue _ifId;
    public ConditionValue xdfgetIfId()
    { if (_ifId == null) { _ifId = nCV(); }
      return _ifId; }
    protected ConditionValue xgetCValueIfId() { return xdfgetIfId(); }

    /**
     * Add order-by as ascend. <br>
     * IF_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_IfId_Asc() { regOBA("IF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_IfId_Desc() { regOBD("IF_ID"); return this; }

    protected ConditionValue _spareStr;
    public ConditionValue xdfgetSpareStr()
    { if (_spareStr == null) { _spareStr = nCV(); }
      return _spareStr; }
    protected ConditionValue xgetCValueSpareStr() { return xdfgetSpareStr(); }

    /**
     * Add order-by as ascend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

    protected ConditionValue _delFlg;
    public ConditionValue xdfgetDelFlg()
    { if (_delFlg == null) { _delFlg = nCV(); }
      return _delFlg; }
    protected ConditionValue xgetCValueDelFlg() { return xdfgetDelFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTReceivePlanHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTReceivePlanHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReceivePlanHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReceivePlanHCQ bq = (TReceivePlanHCQ)bqs;
        TReceivePlanHCQ uq = (TReceivePlanHCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMCustomerByPlanSupplierId()) {
            uq.queryMCustomerByPlanSupplierId().reflectRelationOnUnionQuery(bq.queryMCustomerByPlanSupplierId(), uq.queryMCustomerByPlanSupplierId());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryTReceivePlanHSelf()) {
            uq.queryTReceivePlanHSelf().reflectRelationOnUnionQuery(bq.queryTReceivePlanHSelf(), uq.queryTReceivePlanHSelf());
        }
        if (bq.hasConditionQueryMStockType()) {
            uq.queryMStockType().reflectRelationOnUnionQuery(bq.queryMStockType(), uq.queryMStockType());
        }
        if (bq.hasConditionQueryMCustomerByPlanDepositId()) {
            uq.queryMCustomerByPlanDepositId().reflectRelationOnUnionQuery(bq.queryMCustomerByPlanDepositId(), uq.queryMCustomerByPlanDepositId());
        }
        if (bq.hasConditionQueryBClassDtlByCenterTransitFlg()) {
            uq.queryBClassDtlByCenterTransitFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCenterTransitFlg(), uq.queryBClassDtlByCenterTransitFlg());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveDeliveryStatus()) {
            uq.queryBClassDtlByReceiveDeliveryStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveDeliveryStatus(), uq.queryBClassDtlByReceiveDeliveryStatus());
        }
        if (bq.hasConditionQueryBClassDtlByReceiveStatus()) {
            uq.queryBClassDtlByReceiveStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByReceiveStatus(), uq.queryBClassDtlByReceiveStatus());
        }
        if (bq.hasConditionQueryTReceivePlanRAsOne()) {
            uq.queryTReceivePlanRAsOne().reflectRelationOnUnionQuery(bq.queryTReceivePlanRAsOne(), uq.queryTReceivePlanRAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("t_receive_plan_h", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByPlanSupplierId() {
        return xdfgetConditionQueryMCustomerByPlanSupplierId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByPlanSupplierId() {
        String prop = "mCustomerByPlanSupplierId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByPlanSupplierId()); xsetupOuterJoinMCustomerByPlanSupplierId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByPlanSupplierId() {
        String nrp = xresolveNRP("t_receive_plan_h", "mCustomerByPlanSupplierId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByPlanSupplierId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByPlanSupplierId() { xregOutJo("mCustomerByPlanSupplierId"); }
    public boolean hasConditionQueryMCustomerByPlanSupplierId() { return xhasQueRlMap("mCustomerByPlanSupplierId"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The instance of condition-query. (NotNull)
     */
    public MClientCQ queryMClient() {
        return xdfgetConditionQueryMClient();
    }
    public MClientCQ xdfgetConditionQueryMClient() {
        String prop = "mClient";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMClient()); xsetupOuterJoinMClient(); }
        return xgetQueRlMap(prop);
    }
    protected MClientCQ xcreateQueryMClient() {
        String nrp = xresolveNRP("t_receive_plan_h", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProcessTypeCQ queryMProcessType() {
        return xdfgetConditionQueryMProcessType();
    }
    public MProcessTypeCQ xdfgetConditionQueryMProcessType() {
        String prop = "mProcessType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProcessType()); xsetupOuterJoinMProcessType(); }
        return xgetQueRlMap(prop);
    }
    protected MProcessTypeCQ xcreateQueryMProcessType() {
        String nrp = xresolveNRP("t_receive_plan_h", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingHCQ queryTPickingH() {
        return xdfgetConditionQueryTPickingH();
    }
    public TPickingHCQ xdfgetConditionQueryTPickingH() {
        String prop = "tPickingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingH()); xsetupOuterJoinTPickingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingHCQ xcreateQueryTPickingH() {
        String nrp = xresolveNRP("t_receive_plan_h", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanHCQ queryTReceivePlanHSelf() {
        return xdfgetConditionQueryTReceivePlanHSelf();
    }
    public TReceivePlanHCQ xdfgetConditionQueryTReceivePlanHSelf() {
        String prop = "tReceivePlanHSelf";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanHSelf()); xsetupOuterJoinTReceivePlanHSelf(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanHCQ xcreateQueryTReceivePlanHSelf() {
        String nrp = xresolveNRP("t_receive_plan_h", "tReceivePlanHSelf"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanHSelf", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanHSelf() { xregOutJo("tReceivePlanHSelf"); }
    public boolean hasConditionQueryTReceivePlanHSelf() { return xhasQueRlMap("tReceivePlanHSelf"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The instance of condition-query. (NotNull)
     */
    public MStockTypeCQ queryMStockType() {
        return xdfgetConditionQueryMStockType();
    }
    public MStockTypeCQ xdfgetConditionQueryMStockType() {
        String prop = "mStockType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMStockType()); xsetupOuterJoinMStockType(); }
        return xgetQueRlMap(prop);
    }
    protected MStockTypeCQ xcreateQueryMStockType() {
        String nrp = xresolveNRP("t_receive_plan_h", "mStockType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MStockTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mStockType", nrp);
    }
    protected void xsetupOuterJoinMStockType() { xregOutJo("mStockType"); }
    public boolean hasConditionQueryMStockType() { return xhasQueRlMap("mStockType"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByPlanDepositId() {
        return xdfgetConditionQueryMCustomerByPlanDepositId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByPlanDepositId() {
        String prop = "mCustomerByPlanDepositId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByPlanDepositId()); xsetupOuterJoinMCustomerByPlanDepositId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByPlanDepositId() {
        String nrp = xresolveNRP("t_receive_plan_h", "mCustomerByPlanDepositId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByPlanDepositId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByPlanDepositId() { xregOutJo("mCustomerByPlanDepositId"); }
    public boolean hasConditionQueryMCustomerByPlanDepositId() { return xhasQueRlMap("mCustomerByPlanDepositId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCenterTransitFlg() {
        return xdfgetConditionQueryBClassDtlByCenterTransitFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCenterTransitFlg() {
        String prop = "bClassDtlByCenterTransitFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCenterTransitFlg()); xsetupOuterJoinBClassDtlByCenterTransitFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCenterTransitFlg() {
        String nrp = xresolveNRP("t_receive_plan_h", "bClassDtlByCenterTransitFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCenterTransitFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCenterTransitFlg() { xregOutJo("bClassDtlByCenterTransitFlg"); }
    public boolean hasConditionQueryBClassDtlByCenterTransitFlg() { return xhasQueRlMap("bClassDtlByCenterTransitFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByErrorFlg() {
        return xdfgetConditionQueryBClassDtlByErrorFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByErrorFlg() {
        String prop = "bClassDtlByErrorFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByErrorFlg()); xsetupOuterJoinBClassDtlByErrorFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByErrorFlg() {
        String nrp = xresolveNRP("t_receive_plan_h", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByErrorFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByErrorFlg() { xregOutJo("bClassDtlByErrorFlg"); }
    public boolean hasConditionQueryBClassDtlByErrorFlg() { return xhasQueRlMap("bClassDtlByErrorFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInputType() {
        return xdfgetConditionQueryBClassDtlByInputType();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInputType() {
        String prop = "bClassDtlByInputType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInputType()); xsetupOuterJoinBClassDtlByInputType(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInputType() {
        String nrp = xresolveNRP("t_receive_plan_h", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveDeliveryStatus() {
        return xdfgetConditionQueryBClassDtlByReceiveDeliveryStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveDeliveryStatus() {
        String prop = "bClassDtlByReceiveDeliveryStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveDeliveryStatus()); xsetupOuterJoinBClassDtlByReceiveDeliveryStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveDeliveryStatus() {
        String nrp = xresolveNRP("t_receive_plan_h", "bClassDtlByReceiveDeliveryStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveDeliveryStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveDeliveryStatus() { xregOutJo("bClassDtlByReceiveDeliveryStatus"); }
    public boolean hasConditionQueryBClassDtlByReceiveDeliveryStatus() { return xhasQueRlMap("bClassDtlByReceiveDeliveryStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByReceiveStatus() {
        return xdfgetConditionQueryBClassDtlByReceiveStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByReceiveStatus() {
        String prop = "bClassDtlByReceiveStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByReceiveStatus()); xsetupOuterJoinBClassDtlByReceiveStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByReceiveStatus() {
        String nrp = xresolveNRP("t_receive_plan_h", "bClassDtlByReceiveStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByReceiveStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByReceiveStatus() { xregOutJo("bClassDtlByReceiveStatus"); }
    public boolean hasConditionQueryBClassDtlByReceiveStatus() { return xhasQueRlMap("bClassDtlByReceiveStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanRCQ queryTReceivePlanRAsOne() { return xdfgetConditionQueryTReceivePlanRAsOne(); }
    public TReceivePlanRCQ xdfgetConditionQueryTReceivePlanRAsOne() {
        String prop = "tReceivePlanRAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanRAsOne()); xsetupOuterJoinTReceivePlanRAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanRCQ xcreateQueryTReceivePlanRAsOne() {
        String nrp = xresolveNRP("t_receive_plan_h", "tReceivePlanRAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanRCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanRAsOne", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanRAsOne() { xregOutJo("tReceivePlanRAsOne"); }
    public boolean hasConditionQueryTReceivePlanRAsOne() { return xhasQueRlMap("tReceivePlanRAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReceivePlanHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReceivePlanHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReceivePlanHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReceivePlanHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReceivePlanHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReceivePlanHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReceivePlanHCQ> _myselfExistsMap;
    public Map<String, TReceivePlanHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReceivePlanHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReceivePlanHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReceivePlanHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReceivePlanHCB.class.getName(); }
    protected String xCQ() { return TReceivePlanHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
