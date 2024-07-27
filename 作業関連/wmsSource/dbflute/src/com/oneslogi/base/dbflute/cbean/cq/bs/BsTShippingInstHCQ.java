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
 * The base condition-query of t_shipping_inst_h.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstHCQ extends AbstractBsTShippingInstHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_inst_h) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstHCIQ xcreateCIQ() {
        TShippingInstHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstHCIQ xnewCIQ() {
        return new TShippingInstHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_inst_h on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_ExistsReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_ExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_ExistsReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHPrintCQ> xdfgetShippingInstHId_ExistsReferrer_TShippingInstHPrintList() { return xgetSQueMap("shippingInstHId_ExistsReferrer_TShippingInstHPrintList"); }
    public String keepShippingInstHId_ExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq) { return xkeepSQue("shippingInstHId_ExistsReferrer_TShippingInstHPrintList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_NotExistsReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_NotExistsReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_NotExistsReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHPrintCQ> xdfgetShippingInstHId_NotExistsReferrer_TShippingInstHPrintList() { return xgetSQueMap("shippingInstHId_NotExistsReferrer_TShippingInstHPrintList"); }
    public String keepShippingInstHId_NotExistsReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq) { return xkeepSQue("shippingInstHId_NotExistsReferrer_TShippingInstHPrintList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_TEcOrderHList", sq); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_TShippingInstBList", sq); }

    public Map<String, TShippingInstHPrintCQ> xdfgetShippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList() { return xgetSQueMap("shippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList"); }
    public String keepShippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq) { return xkeepSQue("shippingInstHId_SpecifyDerivedReferrer_TShippingInstHPrintList", sq); }

    public Map<String, TEcOrderHCQ> xdfgetShippingInstHId_QueryDerivedReferrer_TEcOrderHList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHList(TEcOrderHCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_TEcOrderHList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_TEcOrderHList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TEcOrderHListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_TEcOrderHList", pm); }

    public Map<String, TShippingInstBCQ> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstBList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_TShippingInstBList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_TShippingInstBList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstBListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_TShippingInstBList", pm); }

    public Map<String, TShippingInstHPrintCQ> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList() { return xgetSQueMap("shippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList(TShippingInstHPrintCQ sq) { return xkeepSQue("shippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList", sq); }
    public Map<String, Object> xdfgetShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintListParameter() { return xgetSQuePmMap("shippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList"); }
    public String keepShippingInstHId_QueryDerivedReferrer_TShippingInstHPrintListParameter(Object pm) { return xkeepSQuePm("shippingInstHId_QueryDerivedReferrer_TShippingInstHPrintList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

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
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _workDt;
    public ConditionValue xdfgetWorkDt()
    { if (_workDt == null) { _workDt = nCV(); }
      return _workDt; }
    protected ConditionValue xgetCValueWorkDt() { return xdfgetWorkDt(); }

    /**
     * Add order-by as ascend. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

    protected ConditionValue _delivPlanDt;
    public ConditionValue xdfgetDelivPlanDt()
    { if (_delivPlanDt == null) { _delivPlanDt = nCV(); }
      return _delivPlanDt; }
    protected ConditionValue xgetCValueDelivPlanDt() { return xdfgetDelivPlanDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

    protected ConditionValue _delivDt;
    public ConditionValue xdfgetDelivDt()
    { if (_delivDt == null) { _delivDt = nCV(); }
      return _delivDt; }
    protected ConditionValue xgetCValueDelivDt() { return xdfgetDelivDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

    protected ConditionValue _delivTz;
    public ConditionValue xdfgetDelivTz()
    { if (_delivTz == null) { _delivTz = nCV(); }
      return _delivTz; }
    protected ConditionValue xgetCValueDelivTz() { return xdfgetDelivTz(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

    protected ConditionValue _clientShippingNo;
    public ConditionValue xdfgetClientShippingNo()
    { if (_clientShippingNo == null) { _clientShippingNo = nCV(); }
      return _clientShippingNo; }
    protected ConditionValue xgetCValueClientShippingNo() { return xdfgetClientShippingNo(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientShippingNo_Asc() { regOBA("CLIENT_SHIPPING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ClientShippingNo_Desc() { regOBD("CLIENT_SHIPPING_NO"); return this; }

    protected ConditionValue _shippingSlipNo;
    public ConditionValue xdfgetShippingSlipNo()
    { if (_shippingSlipNo == null) { _shippingSlipNo = nCV(); }
      return _shippingSlipNo; }
    protected ConditionValue xgetCValueShippingSlipNo() { return xdfgetShippingSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _shippingStatus;
    public ConditionValue xdfgetShippingStatus()
    { if (_shippingStatus == null) { _shippingStatus = nCV(); }
      return _shippingStatus; }
    protected ConditionValue xgetCValueShippingStatus() { return xdfgetShippingStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStatus_Asc() { regOBA("SHIPPING_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ShippingStatus}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStatus_Desc() { regOBD("SHIPPING_STATUS"); return this; }

    protected ConditionValue _supplyCustomerId;
    public ConditionValue xdfgetSupplyCustomerId()
    { if (_supplyCustomerId == null) { _supplyCustomerId = nCV(); }
      return _supplyCustomerId; }
    protected ConditionValue xgetCValueSupplyCustomerId() { return xdfgetSupplyCustomerId(); }

    public Map<String, MCustomerCQ> getSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId() { return xgetSQueMap("supplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId"); }
    public String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq) { return xkeepSQue("supplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId", sq); }

    public Map<String, MCustomerCQ> getSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId() { return xgetSQueMap("supplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId"); }
    public String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq) { return xkeepSQue("supplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerId_Asc() { regOBA("SUPPLY_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerId_Desc() { regOBD("SUPPLY_CUSTOMER_ID"); return this; }

    protected ConditionValue _supplyCustomerCd;
    public ConditionValue xdfgetSupplyCustomerCd()
    { if (_supplyCustomerCd == null) { _supplyCustomerCd = nCV(); }
      return _supplyCustomerCd; }
    protected ConditionValue xgetCValueSupplyCustomerCd() { return xdfgetSupplyCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

    protected ConditionValue _supplyCustomerNm;
    public ConditionValue xdfgetSupplyCustomerNm()
    { if (_supplyCustomerNm == null) { _supplyCustomerNm = nCV(); }
      return _supplyCustomerNm; }
    protected ConditionValue xgetCValueSupplyCustomerNm() { return xdfgetSupplyCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerId;
    public ConditionValue xdfgetDelivCustomerId()
    { if (_delivCustomerId == null) { _delivCustomerId = nCV(); }
      return _delivCustomerId; }
    protected ConditionValue xgetCValueDelivCustomerId() { return xdfgetDelivCustomerId(); }

    public Map<String, MCustomerCQ> getDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId() { return xgetSQueMap("delivCustomerId_InScopeRelation_MCustomerByDelivCustomerId"); }
    public String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_InScopeRelation_MCustomerByDelivCustomerId", sq); }

    public Map<String, MCustomerCQ> getDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId() { return xgetSQueMap("delivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId"); }
    public String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq) { return xkeepSQue("delivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

    protected ConditionValue _delivCustomerCd;
    public ConditionValue xdfgetDelivCustomerCd()
    { if (_delivCustomerCd == null) { _delivCustomerCd = nCV(); }
      return _delivCustomerCd; }
    protected ConditionValue xgetCValueDelivCustomerCd() { return xdfgetDelivCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    public Map<String, MZipCQ> getDelivZipCd_InScopeRelation_MZipForDeliv() { return xgetSQueMap("delivZipCd_InScopeRelation_MZipForDeliv"); }
    public String keepDelivZipCd_InScopeRelation_MZipForDeliv(MZipCQ sq) { return xkeepSQue("delivZipCd_InScopeRelation_MZipForDeliv", sq); }

    public Map<String, MZipCQ> getDelivZipCd_NotInScopeRelation_MZipForDeliv() { return xgetSQueMap("delivZipCd_NotInScopeRelation_MZipForDeliv"); }
    public String keepDelivZipCd_NotInScopeRelation_MZipForDeliv(MZipCQ sq) { return xkeepSQue("delivZipCd_NotInScopeRelation_MZipForDeliv", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {VARCHAR(30), FK to M_ZIP}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

    protected ConditionValue _delivAddress1;
    public ConditionValue xdfgetDelivAddress1()
    { if (_delivAddress1 == null) { _delivAddress1 = nCV(); }
      return _delivAddress1; }
    protected ConditionValue xgetCValueDelivAddress1() { return xdfgetDelivAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

    protected ConditionValue _delivAddress2;
    public ConditionValue xdfgetDelivAddress2()
    { if (_delivAddress2 == null) { _delivAddress2 = nCV(); }
      return _delivAddress2; }
    protected ConditionValue xgetCValueDelivAddress2() { return xdfgetDelivAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

    protected ConditionValue _delivAddress3;
    public ConditionValue xdfgetDelivAddress3()
    { if (_delivAddress3 == null) { _delivAddress3 = nCV(); }
      return _delivAddress3; }
    protected ConditionValue xgetCValueDelivAddress3() { return xdfgetDelivAddress3(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

    protected ConditionValue _delivAddressSupply;
    public ConditionValue xdfgetDelivAddressSupply()
    { if (_delivAddressSupply == null) { _delivAddressSupply = nCV(); }
      return _delivAddressSupply; }
    protected ConditionValue xgetCValueDelivAddressSupply() { return xdfgetDelivAddressSupply(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

    protected ConditionValue _delivCustomerNm;
    public ConditionValue xdfgetDelivCustomerNm()
    { if (_delivCustomerNm == null) { _delivCustomerNm = nCV(); }
      return _delivCustomerNm; }
    protected ConditionValue xgetCValueDelivCustomerNm() { return xdfgetDelivCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm_Asc() { regOBA("DELIV_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm_Desc() { regOBD("DELIV_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerNm1;
    public ConditionValue xdfgetDelivCustomerNm1()
    { if (_delivCustomerNm1 == null) { _delivCustomerNm1 = nCV(); }
      return _delivCustomerNm1; }
    protected ConditionValue xgetCValueDelivCustomerNm1() { return xdfgetDelivCustomerNm1(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm1_Asc() { regOBA("DELIV_CUSTOMER_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm1_Desc() { regOBD("DELIV_CUSTOMER_NM1"); return this; }

    protected ConditionValue _delivCustomerNm2;
    public ConditionValue xdfgetDelivCustomerNm2()
    { if (_delivCustomerNm2 == null) { _delivCustomerNm2 = nCV(); }
      return _delivCustomerNm2; }
    protected ConditionValue xgetCValueDelivCustomerNm2() { return xdfgetDelivCustomerNm2(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm2_Asc() { regOBA("DELIV_CUSTOMER_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCustomerNm2_Desc() { regOBD("DELIV_CUSTOMER_NM2"); return this; }

    protected ConditionValue _delivTelNo;
    public ConditionValue xdfgetDelivTelNo()
    { if (_delivTelNo == null) { _delivTelNo = nCV(); }
      return _delivTelNo; }
    protected ConditionValue xgetCValueDelivTelNo() { return xdfgetDelivTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_InScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_InScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_InScopeRelation_MDeliveryCourse", sq); }

    public Map<String, MDeliveryCourseCQ> getDeliveryCourseId_NotInScopeRelation_MDeliveryCourse() { return xgetSQueMap("deliveryCourseId_NotInScopeRelation_MDeliveryCourse"); }
    public String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq) { return xkeepSQue("deliveryCourseId_NotInScopeRelation_MDeliveryCourse", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _emergencyFlg;
    public ConditionValue xdfgetEmergencyFlg()
    { if (_emergencyFlg == null) { _emergencyFlg = nCV(); }
      return _emergencyFlg; }
    protected ConditionValue xgetCValueEmergencyFlg() { return xdfgetEmergencyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

    protected ConditionValue _pickingWorkMessage;
    public ConditionValue xdfgetPickingWorkMessage()
    { if (_pickingWorkMessage == null) { _pickingWorkMessage = nCV(); }
      return _pickingWorkMessage; }
    protected ConditionValue xgetCValuePickingWorkMessage() { return xdfgetPickingWorkMessage(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingWorkMessage_Asc() { regOBA("PICKING_WORK_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingWorkMessage_Desc() { regOBD("PICKING_WORK_MESSAGE"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _pickingBatchNo;
    public ConditionValue xdfgetPickingBatchNo()
    { if (_pickingBatchNo == null) { _pickingBatchNo = nCV(); }
      return _pickingBatchNo; }
    protected ConditionValue xgetCValuePickingBatchNo() { return xdfgetPickingBatchNo(); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingBatchNo_Asc() { regOBA("PICKING_BATCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PickingBatchNo_Desc() { regOBD("PICKING_BATCH_NO"); return this; }

    protected ConditionValue _stockOutFlg;
    public ConditionValue xdfgetStockOutFlg()
    { if (_stockOutFlg == null) { _stockOutFlg = nCV(); }
      return _stockOutFlg; }
    protected ConditionValue xgetCValueStockOutFlg() { return xdfgetStockOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_StockOutFlg_Asc() { regOBA("STOCK_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StockOutFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_StockOutFlg_Desc() { regOBD("STOCK_OUT_FLG"); return this; }

    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_InScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_InScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_InScopeRelation_TAllocInstH", sq); }

    public Map<String, TAllocInstHCQ> getAllocInstHId_NotInScopeRelation_TAllocInstH() { return xgetSQueMap("allocInstHId_NotInScopeRelation_TAllocInstH"); }
    public String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq) { return xkeepSQue("allocInstHId_NotInScopeRelation_TAllocInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19), FK to t_alloc_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

    protected ConditionValue _cod;
    public ConditionValue xdfgetCod()
    { if (_cod == null) { _cod = nCV(); }
      return _cod; }
    protected ConditionValue xgetCValueCod() { return xdfgetCod(); }

    /**
     * Add order-by as ascend. <br>
     * COD: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Cod_Asc() { regOBA("COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Cod_Desc() { regOBD("COD"); return this; }

    protected ConditionValue _codTax;
    public ConditionValue xdfgetCodTax()
    { if (_codTax == null) { _codTax = nCV(); }
      return _codTax; }
    protected ConditionValue xgetCValueCodTax() { return xdfgetCodTax(); }

    /**
     * Add order-by as ascend. <br>
     * COD_TAX: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodTax_Asc() { regOBA("COD_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_TAX: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodTax_Desc() { regOBD("COD_TAX"); return this; }

    protected ConditionValue _totalPrice;
    public ConditionValue xdfgetTotalPrice()
    { if (_totalPrice == null) { _totalPrice = nCV(); }
      return _totalPrice; }
    protected ConditionValue xgetCValueTotalPrice() { return xdfgetTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

    protected ConditionValue _totalTax;
    public ConditionValue xdfgetTotalTax()
    { if (_totalTax == null) { _totalTax = nCV(); }
      return _totalTax; }
    protected ConditionValue xgetCValueTotalTax() { return xdfgetTotalTax(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalTax_Asc() { regOBA("TOTAL_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TotalTax_Desc() { regOBD("TOTAL_TAX"); return this; }

    protected ConditionValue _nizoroeNo;
    public ConditionValue xdfgetNizoroeNo()
    { if (_nizoroeNo == null) { _nizoroeNo = nCV(); }
      return _nizoroeNo; }
    protected ConditionValue xgetCValueNizoroeNo() { return xdfgetNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

    protected ConditionValue _daihyoNizoroeNo;
    public ConditionValue xdfgetDaihyoNizoroeNo()
    { if (_daihyoNizoroeNo == null) { _daihyoNizoroeNo = nCV(); }
      return _daihyoNizoroeNo; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo() { return xdfgetDaihyoNizoroeNo(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DaihyoNizoroeNo_Asc() { regOBA("DAIHYO_NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DaihyoNizoroeNo_Desc() { regOBD("DAIHYO_NIZOROE_NO"); return this; }

    protected ConditionValue _nizoroeNo2;
    public ConditionValue xdfgetNizoroeNo2()
    { if (_nizoroeNo2 == null) { _nizoroeNo2 = nCV(); }
      return _nizoroeNo2; }
    protected ConditionValue xgetCValueNizoroeNo2() { return xdfgetNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeNo2_Asc() { regOBA("NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeNo2_Desc() { regOBD("NIZOROE_NO2"); return this; }

    protected ConditionValue _daihyoNizoroeNo2;
    public ConditionValue xdfgetDaihyoNizoroeNo2()
    { if (_daihyoNizoroeNo2 == null) { _daihyoNizoroeNo2 = nCV(); }
      return _daihyoNizoroeNo2; }
    protected ConditionValue xgetCValueDaihyoNizoroeNo2() { return xdfgetDaihyoNizoroeNo2(); }

    /**
     * Add order-by as ascend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DaihyoNizoroeNo2_Asc() { regOBA("DAIHYO_NIZOROE_NO2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DaihyoNizoroeNo2_Desc() { regOBD("DAIHYO_NIZOROE_NO2"); return this; }

    protected ConditionValue _shippingTypeId;
    public ConditionValue xdfgetShippingTypeId()
    { if (_shippingTypeId == null) { _shippingTypeId = nCV(); }
      return _shippingTypeId; }
    protected ConditionValue xgetCValueShippingTypeId() { return xdfgetShippingTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingTypeId_Asc() { regOBA("SHIPPING_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingTypeId_Desc() { regOBD("SHIPPING_TYPE_ID"); return this; }

    protected ConditionValue _shippingTypeCd;
    public ConditionValue xdfgetShippingTypeCd()
    { if (_shippingTypeCd == null) { _shippingTypeCd = nCV(); }
      return _shippingTypeCd; }
    protected ConditionValue xgetCValueShippingTypeCd() { return xdfgetShippingTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingTypeCd_Asc() { regOBA("SHIPPING_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingTypeCd_Desc() { regOBD("SHIPPING_TYPE_CD"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

    protected ConditionValue _carrierCd;
    public ConditionValue xdfgetCarrierCd()
    { if (_carrierCd == null) { _carrierCd = nCV(); }
      return _carrierCd; }
    protected ConditionValue xgetCValueCarrierCd() { return xdfgetCarrierCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _salesOrderNo;
    public ConditionValue xdfgetSalesOrderNo()
    { if (_salesOrderNo == null) { _salesOrderNo = nCV(); }
      return _salesOrderNo; }
    protected ConditionValue xgetCValueSalesOrderNo() { return xdfgetSalesOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderNo_Asc() { regOBA("SALES_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderNo_Desc() { regOBD("SALES_ORDER_NO"); return this; }

    protected ConditionValue _salesOrderSlipTypeCd;
    public ConditionValue xdfgetSalesOrderSlipTypeCd()
    { if (_salesOrderSlipTypeCd == null) { _salesOrderSlipTypeCd = nCV(); }
      return _salesOrderSlipTypeCd; }
    protected ConditionValue xgetCValueSalesOrderSlipTypeCd() { return xdfgetSalesOrderSlipTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderSlipTypeCd_Asc() { regOBA("SALES_ORDER_SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderSlipTypeCd_Desc() { regOBD("SALES_ORDER_SLIP_TYPE_CD"); return this; }

    protected ConditionValue _salesOrderSlipNo;
    public ConditionValue xdfgetSalesOrderSlipNo()
    { if (_salesOrderSlipNo == null) { _salesOrderSlipNo = nCV(); }
      return _salesOrderSlipNo; }
    protected ConditionValue xgetCValueSalesOrderSlipNo() { return xdfgetSalesOrderSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderSlipNo_Asc() { regOBA("SALES_ORDER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderSlipNo_Desc() { regOBD("SALES_ORDER_SLIP_NO"); return this; }

    protected ConditionValue _orderDt;
    public ConditionValue xdfgetOrderDt()
    { if (_orderDt == null) { _orderDt = nCV(); }
      return _orderDt; }
    protected ConditionValue xgetCValueOrderDt() { return xdfgetOrderDt(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_OrderDt_Asc() { regOBA("ORDER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_OrderDt_Desc() { regOBD("ORDER_DT"); return this; }

    protected ConditionValue _kokyakuCd;
    public ConditionValue xdfgetKokyakuCd()
    { if (_kokyakuCd == null) { _kokyakuCd = nCV(); }
      return _kokyakuCd; }
    protected ConditionValue xgetCValueKokyakuCd() { return xdfgetKokyakuCd(); }

    /**
     * Add order-by as ascend. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KokyakuCd_Asc() { regOBA("KOKYAKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KokyakuCd_Desc() { regOBD("KOKYAKU_CD"); return this; }

    protected ConditionValue _shippingFee;
    public ConditionValue xdfgetShippingFee()
    { if (_shippingFee == null) { _shippingFee = nCV(); }
      return _shippingFee; }
    protected ConditionValue xgetCValueShippingFee() { return xdfgetShippingFee(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingFee_Asc() { regOBA("SHIPPING_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingFee_Desc() { regOBD("SHIPPING_FEE"); return this; }

    protected ConditionValue _separateShippingFee;
    public ConditionValue xdfgetSeparateShippingFee()
    { if (_separateShippingFee == null) { _separateShippingFee = nCV(); }
      return _separateShippingFee; }
    protected ConditionValue xgetCValueSeparateShippingFee() { return xdfgetSeparateShippingFee(); }

    /**
     * Add order-by as ascend. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SeparateShippingFee_Asc() { regOBA("SEPARATE_SHIPPING_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEPARATE_SHIPPING_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SeparateShippingFee_Desc() { regOBD("SEPARATE_SHIPPING_FEE"); return this; }

    protected ConditionValue _codFee;
    public ConditionValue xdfgetCodFee()
    { if (_codFee == null) { _codFee = nCV(); }
      return _codFee; }
    protected ConditionValue xgetCValueCodFee() { return xdfgetCodFee(); }

    /**
     * Add order-by as ascend. <br>
     * COD_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodFee_Asc() { regOBA("COD_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_FEE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CodFee_Desc() { regOBD("COD_FEE"); return this; }

    protected ConditionValue _orderNoDeliveryNote;
    public ConditionValue xdfgetOrderNoDeliveryNote()
    { if (_orderNoDeliveryNote == null) { _orderNoDeliveryNote = nCV(); }
      return _orderNoDeliveryNote; }
    protected ConditionValue xgetCValueOrderNoDeliveryNote() { return xdfgetOrderNoDeliveryNote(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_OrderNoDeliveryNote_Asc() { regOBA("ORDER_NO_DELIVERY_NOTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_OrderNoDeliveryNote_Desc() { regOBD("ORDER_NO_DELIVERY_NOTE"); return this; }

    protected ConditionValue _point;
    public ConditionValue xdfgetPoint()
    { if (_point == null) { _point = nCV(); }
      return _point; }
    protected ConditionValue xgetCValuePoint() { return xdfgetPoint(); }

    /**
     * Add order-by as ascend. <br>
     * POINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Point_Asc() { regOBA("POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Point_Desc() { regOBD("POINT"); return this; }

    protected ConditionValue _koguchiDeliveryFlg;
    public ConditionValue xdfgetKoguchiDeliveryFlg()
    { if (_koguchiDeliveryFlg == null) { _koguchiDeliveryFlg = nCV(); }
      return _koguchiDeliveryFlg; }
    protected ConditionValue xgetCValueKoguchiDeliveryFlg() { return xdfgetKoguchiDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KoguchiDeliveryFlg_Asc() { regOBA("KOGUCHI_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KoguchiDeliveryFlg_Desc() { regOBD("KOGUCHI_DELIVERY_FLG"); return this; }

    protected ConditionValue _recordSendFlg;
    public ConditionValue xdfgetRecordSendFlg()
    { if (_recordSendFlg == null) { _recordSendFlg = nCV(); }
      return _recordSendFlg; }
    protected ConditionValue xgetCValueRecordSendFlg() { return xdfgetRecordSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_RecordSendFlg_Asc() { regOBA("RECORD_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECORD_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_RecordSendFlg_Desc() { regOBD("RECORD_SEND_FLG"); return this; }

    protected ConditionValue _carrierDataOutFlg;
    public ConditionValue xdfgetCarrierDataOutFlg()
    { if (_carrierDataOutFlg == null) { _carrierDataOutFlg = nCV(); }
      return _carrierDataOutFlg; }
    protected ConditionValue xgetCValueCarrierDataOutFlg() { return xdfgetCarrierDataOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierDataOutFlg_Asc() { regOBA("CARRIER_DATA_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_DATA_OUT_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierDataOutFlg_Desc() { regOBD("CARRIER_DATA_OUT_FLG"); return this; }

    protected ConditionValue _kohaiContractorCd;
    public ConditionValue xdfgetKohaiContractorCd()
    { if (_kohaiContractorCd == null) { _kohaiContractorCd = nCV(); }
      return _kohaiContractorCd; }
    protected ConditionValue xgetCValueKohaiContractorCd() { return xdfgetKohaiContractorCd(); }

    /**
     * Add order-by as ascend. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KohaiContractorCd_Asc() { regOBA("KOHAI_CONTRACTOR_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KohaiContractorCd_Desc() { regOBD("KOHAI_CONTRACTOR_CD"); return this; }

    protected ConditionValue _kohaiContractorNm;
    public ConditionValue xdfgetKohaiContractorNm()
    { if (_kohaiContractorNm == null) { _kohaiContractorNm = nCV(); }
      return _kohaiContractorNm; }
    protected ConditionValue xgetCValueKohaiContractorNm() { return xdfgetKohaiContractorNm(); }

    /**
     * Add order-by as ascend. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KohaiContractorNm_Asc() { regOBA("KOHAI_CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KohaiContractorNm_Desc() { regOBD("KOHAI_CONTRACTOR_NM"); return this; }

    protected ConditionValue _shippingPlantCd;
    public ConditionValue xdfgetShippingPlantCd()
    { if (_shippingPlantCd == null) { _shippingPlantCd = nCV(); }
      return _shippingPlantCd; }
    protected ConditionValue xgetCValueShippingPlantCd() { return xdfgetShippingPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

    protected ConditionValue _shippingStorageSpaceCd;
    public ConditionValue xdfgetShippingStorageSpaceCd()
    { if (_shippingStorageSpaceCd == null) { _shippingStorageSpaceCd = nCV(); }
      return _shippingStorageSpaceCd; }
    protected ConditionValue xgetCValueShippingStorageSpaceCd() { return xdfgetShippingStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _nizoroeId;
    public ConditionValue xdfgetNizoroeId()
    { if (_nizoroeId == null) { _nizoroeId = nCV(); }
      return _nizoroeId; }
    protected ConditionValue xgetCValueNizoroeId() { return xdfgetNizoroeId(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeId_Asc() { regOBA("NIZOROE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeId_Desc() { regOBD("NIZOROE_ID"); return this; }

    protected ConditionValue _nizoroeProcUnit;
    public ConditionValue xdfgetNizoroeProcUnit()
    { if (_nizoroeProcUnit == null) { _nizoroeProcUnit = nCV(); }
      return _nizoroeProcUnit; }
    protected ConditionValue xgetCValueNizoroeProcUnit() { return xdfgetNizoroeProcUnit(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeProcUnit_Asc() { regOBA("NIZOROE_PROC_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_NizoroeProcUnit_Desc() { regOBD("NIZOROE_PROC_UNIT"); return this; }

    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    /**
     * Add order-by as ascend. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _accountCd;
    public ConditionValue xdfgetAccountCd()
    { if (_accountCd == null) { _accountCd = nCV(); }
      return _accountCd; }
    protected ConditionValue xgetCValueAccountCd() { return xdfgetAccountCd(); }

    /**
     * Add order-by as ascend. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AccountCd_Asc() { regOBA("ACCOUNT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AccountCd_Desc() { regOBD("ACCOUNT_CD"); return this; }

    protected ConditionValue _shippingReasonCd;
    public ConditionValue xdfgetShippingReasonCd()
    { if (_shippingReasonCd == null) { _shippingReasonCd = nCV(); }
      return _shippingReasonCd; }
    protected ConditionValue xgetCValueShippingReasonCd() { return xdfgetShippingReasonCd(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingReasonCd_Asc() { regOBA("SHIPPING_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ShippingReasonCd_Desc() { regOBD("SHIPPING_REASON_CD"); return this; }

    protected ConditionValue _transferFlg;
    public ConditionValue xdfgetTransferFlg()
    { if (_transferFlg == null) { _transferFlg = nCV(); }
      return _transferFlg; }
    protected ConditionValue xgetCValueTransferFlg() { return xdfgetTransferFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TransferFlg_Asc() { regOBA("TRANSFER_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TransferFlg_Desc() { regOBD("TRANSFER_FLG"); return this; }

    protected ConditionValue _tenhanshaSalesOrderNo;
    public ConditionValue xdfgetTenhanshaSalesOrderNo()
    { if (_tenhanshaSalesOrderNo == null) { _tenhanshaSalesOrderNo = nCV(); }
      return _tenhanshaSalesOrderNo; }
    protected ConditionValue xgetCValueTenhanshaSalesOrderNo() { return xdfgetTenhanshaSalesOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TenhanshaSalesOrderNo_Asc() { regOBA("TENHANSHA_SALES_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TenhanshaSalesOrderNo_Desc() { regOBD("TENHANSHA_SALES_ORDER_NO"); return this; }

    protected ConditionValue _delivCd;
    public ConditionValue xdfgetDelivCd()
    { if (_delivCd == null) { _delivCd = nCV(); }
      return _delivCd; }
    protected ConditionValue xgetCValueDelivCd() { return xdfgetDelivCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCd_Asc() { regOBA("DELIV_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelivCd_Desc() { regOBD("DELIV_CD"); return this; }

    protected ConditionValue _salesOrderNum;
    public ConditionValue xdfgetSalesOrderNum()
    { if (_salesOrderNum == null) { _salesOrderNum = nCV(); }
      return _salesOrderNum; }
    protected ConditionValue xgetCValueSalesOrderNum() { return xdfgetSalesOrderNum(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderNum_Asc() { regOBA("SALES_ORDER_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SalesOrderNum_Desc() { regOBD("SALES_ORDER_NUM"); return this; }

    protected ConditionValue _directDeliveryTypeCd;
    public ConditionValue xdfgetDirectDeliveryTypeCd()
    { if (_directDeliveryTypeCd == null) { _directDeliveryTypeCd = nCV(); }
      return _directDeliveryTypeCd; }
    protected ConditionValue xgetCValueDirectDeliveryTypeCd() { return xdfgetDirectDeliveryTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DirectDeliveryTypeCd_Asc() { regOBA("DIRECT_DELIVERY_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DirectDeliveryTypeCd_Desc() { regOBD("DIRECT_DELIVERY_TYPE_CD"); return this; }

    protected ConditionValue _splitDeliveryTypeCd;
    public ConditionValue xdfgetSplitDeliveryTypeCd()
    { if (_splitDeliveryTypeCd == null) { _splitDeliveryTypeCd = nCV(); }
      return _splitDeliveryTypeCd; }
    protected ConditionValue xgetCValueSplitDeliveryTypeCd() { return xdfgetSplitDeliveryTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SplitDeliveryTypeCd_Asc() { regOBA("SPLIT_DELIVERY_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SplitDeliveryTypeCd_Desc() { regOBD("SPLIT_DELIVERY_TYPE_CD"); return this; }

    protected ConditionValue _carrierTypeCd;
    public ConditionValue xdfgetCarrierTypeCd()
    { if (_carrierTypeCd == null) { _carrierTypeCd = nCV(); }
      return _carrierTypeCd; }
    protected ConditionValue xgetCValueCarrierTypeCd() { return xdfgetCarrierTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierTypeCd_Asc() { regOBA("CARRIER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CarrierTypeCd_Desc() { regOBD("CARRIER_TYPE_CD"); return this; }

    protected ConditionValue _specifyDeliveryDt;
    public ConditionValue xdfgetSpecifyDeliveryDt()
    { if (_specifyDeliveryDt == null) { _specifyDeliveryDt = nCV(); }
      return _specifyDeliveryDt; }
    protected ConditionValue xgetCValueSpecifyDeliveryDt() { return xdfgetSpecifyDeliveryDt(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SpecifyDeliveryDt_Asc() { regOBA("SPECIFY_DELIVERY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SpecifyDeliveryDt_Desc() { regOBD("SPECIFY_DELIVERY_DT"); return this; }

    protected ConditionValue _specifyDeliveryTime;
    public ConditionValue xdfgetSpecifyDeliveryTime()
    { if (_specifyDeliveryTime == null) { _specifyDeliveryTime = nCV(); }
      return _specifyDeliveryTime; }
    protected ConditionValue xgetCValueSpecifyDeliveryTime() { return xdfgetSpecifyDeliveryTime(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SpecifyDeliveryTime_Asc() { regOBA("SPECIFY_DELIVERY_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_SpecifyDeliveryTime_Desc() { regOBD("SPECIFY_DELIVERY_TIME"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

    protected ConditionValue _destinationNmKana;
    public ConditionValue xdfgetDestinationNmKana()
    { if (_destinationNmKana == null) { _destinationNmKana = nCV(); }
      return _destinationNmKana; }
    protected ConditionValue xgetCValueDestinationNmKana() { return xdfgetDestinationNmKana(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DestinationNmKana_Asc() { regOBA("DESTINATION_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DestinationNmKana_Desc() { regOBD("DESTINATION_NM_KANA"); return this; }

    protected ConditionValue _destinationFax;
    public ConditionValue xdfgetDestinationFax()
    { if (_destinationFax == null) { _destinationFax = nCV(); }
      return _destinationFax; }
    protected ConditionValue xgetCValueDestinationFax() { return xdfgetDestinationFax(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DestinationFax_Asc() { regOBA("DESTINATION_FAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DestinationFax_Desc() { regOBD("DESTINATION_FAX"); return this; }

    protected ConditionValue _kanjiMessage1;
    public ConditionValue xdfgetKanjiMessage1()
    { if (_kanjiMessage1 == null) { _kanjiMessage1 = nCV(); }
      return _kanjiMessage1; }
    protected ConditionValue xgetCValueKanjiMessage1() { return xdfgetKanjiMessage1(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage1_Asc() { regOBA("KANJI_MESSAGE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage1_Desc() { regOBD("KANJI_MESSAGE1"); return this; }

    protected ConditionValue _kanjiMessage2;
    public ConditionValue xdfgetKanjiMessage2()
    { if (_kanjiMessage2 == null) { _kanjiMessage2 = nCV(); }
      return _kanjiMessage2; }
    protected ConditionValue xgetCValueKanjiMessage2() { return xdfgetKanjiMessage2(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage2_Asc() { regOBA("KANJI_MESSAGE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage2_Desc() { regOBD("KANJI_MESSAGE2"); return this; }

    protected ConditionValue _kanjiMessage3;
    public ConditionValue xdfgetKanjiMessage3()
    { if (_kanjiMessage3 == null) { _kanjiMessage3 = nCV(); }
      return _kanjiMessage3; }
    protected ConditionValue xgetCValueKanjiMessage3() { return xdfgetKanjiMessage3(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage3_Asc() { regOBA("KANJI_MESSAGE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage3_Desc() { regOBD("KANJI_MESSAGE3"); return this; }

    protected ConditionValue _kanjiMessage4;
    public ConditionValue xdfgetKanjiMessage4()
    { if (_kanjiMessage4 == null) { _kanjiMessage4 = nCV(); }
      return _kanjiMessage4; }
    protected ConditionValue xgetCValueKanjiMessage4() { return xdfgetKanjiMessage4(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage4_Asc() { regOBA("KANJI_MESSAGE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage4_Desc() { regOBD("KANJI_MESSAGE4"); return this; }

    protected ConditionValue _kanjiMessage5;
    public ConditionValue xdfgetKanjiMessage5()
    { if (_kanjiMessage5 == null) { _kanjiMessage5 = nCV(); }
      return _kanjiMessage5; }
    protected ConditionValue xgetCValueKanjiMessage5() { return xdfgetKanjiMessage5(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage5_Asc() { regOBA("KANJI_MESSAGE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage5_Desc() { regOBD("KANJI_MESSAGE5"); return this; }

    protected ConditionValue _kanjiMessage6;
    public ConditionValue xdfgetKanjiMessage6()
    { if (_kanjiMessage6 == null) { _kanjiMessage6 = nCV(); }
      return _kanjiMessage6; }
    protected ConditionValue xgetCValueKanjiMessage6() { return xdfgetKanjiMessage6(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage6_Asc() { regOBA("KANJI_MESSAGE6"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage6_Desc() { regOBD("KANJI_MESSAGE6"); return this; }

    protected ConditionValue _kanjiMessage7;
    public ConditionValue xdfgetKanjiMessage7()
    { if (_kanjiMessage7 == null) { _kanjiMessage7 = nCV(); }
      return _kanjiMessage7; }
    protected ConditionValue xgetCValueKanjiMessage7() { return xdfgetKanjiMessage7(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage7_Asc() { regOBA("KANJI_MESSAGE7"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage7_Desc() { regOBD("KANJI_MESSAGE7"); return this; }

    protected ConditionValue _kanjiMessage8;
    public ConditionValue xdfgetKanjiMessage8()
    { if (_kanjiMessage8 == null) { _kanjiMessage8 = nCV(); }
      return _kanjiMessage8; }
    protected ConditionValue xgetCValueKanjiMessage8() { return xdfgetKanjiMessage8(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage8_Asc() { regOBA("KANJI_MESSAGE8"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage8_Desc() { regOBD("KANJI_MESSAGE8"); return this; }

    protected ConditionValue _kanjiMessage9;
    public ConditionValue xdfgetKanjiMessage9()
    { if (_kanjiMessage9 == null) { _kanjiMessage9 = nCV(); }
      return _kanjiMessage9; }
    protected ConditionValue xgetCValueKanjiMessage9() { return xdfgetKanjiMessage9(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage9_Asc() { regOBA("KANJI_MESSAGE9"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage9_Desc() { regOBD("KANJI_MESSAGE9"); return this; }

    protected ConditionValue _kanjiMessage10;
    public ConditionValue xdfgetKanjiMessage10()
    { if (_kanjiMessage10 == null) { _kanjiMessage10 = nCV(); }
      return _kanjiMessage10; }
    protected ConditionValue xgetCValueKanjiMessage10() { return xdfgetKanjiMessage10(); }

    /**
     * Add order-by as ascend. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage10_Asc() { regOBA("KANJI_MESSAGE10"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanjiMessage10_Desc() { regOBD("KANJI_MESSAGE10"); return this; }

    protected ConditionValue _kanaMessage1;
    public ConditionValue xdfgetKanaMessage1()
    { if (_kanaMessage1 == null) { _kanaMessage1 = nCV(); }
      return _kanaMessage1; }
    protected ConditionValue xgetCValueKanaMessage1() { return xdfgetKanaMessage1(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage1_Asc() { regOBA("KANA_MESSAGE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage1_Desc() { regOBD("KANA_MESSAGE1"); return this; }

    protected ConditionValue _kanaMessage2;
    public ConditionValue xdfgetKanaMessage2()
    { if (_kanaMessage2 == null) { _kanaMessage2 = nCV(); }
      return _kanaMessage2; }
    protected ConditionValue xgetCValueKanaMessage2() { return xdfgetKanaMessage2(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage2_Asc() { regOBA("KANA_MESSAGE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage2_Desc() { regOBD("KANA_MESSAGE2"); return this; }

    protected ConditionValue _kanaMessage3;
    public ConditionValue xdfgetKanaMessage3()
    { if (_kanaMessage3 == null) { _kanaMessage3 = nCV(); }
      return _kanaMessage3; }
    protected ConditionValue xgetCValueKanaMessage3() { return xdfgetKanaMessage3(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage3_Asc() { regOBA("KANA_MESSAGE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage3_Desc() { regOBD("KANA_MESSAGE3"); return this; }

    protected ConditionValue _kanaMessage4;
    public ConditionValue xdfgetKanaMessage4()
    { if (_kanaMessage4 == null) { _kanaMessage4 = nCV(); }
      return _kanaMessage4; }
    protected ConditionValue xgetCValueKanaMessage4() { return xdfgetKanaMessage4(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage4_Asc() { regOBA("KANA_MESSAGE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage4_Desc() { regOBD("KANA_MESSAGE4"); return this; }

    protected ConditionValue _kanaMessage5;
    public ConditionValue xdfgetKanaMessage5()
    { if (_kanaMessage5 == null) { _kanaMessage5 = nCV(); }
      return _kanaMessage5; }
    protected ConditionValue xgetCValueKanaMessage5() { return xdfgetKanaMessage5(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage5_Asc() { regOBA("KANA_MESSAGE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage5_Desc() { regOBD("KANA_MESSAGE5"); return this; }

    protected ConditionValue _kanaMessage6;
    public ConditionValue xdfgetKanaMessage6()
    { if (_kanaMessage6 == null) { _kanaMessage6 = nCV(); }
      return _kanaMessage6; }
    protected ConditionValue xgetCValueKanaMessage6() { return xdfgetKanaMessage6(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage6_Asc() { regOBA("KANA_MESSAGE6"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage6_Desc() { regOBD("KANA_MESSAGE6"); return this; }

    protected ConditionValue _kanaMessage7;
    public ConditionValue xdfgetKanaMessage7()
    { if (_kanaMessage7 == null) { _kanaMessage7 = nCV(); }
      return _kanaMessage7; }
    protected ConditionValue xgetCValueKanaMessage7() { return xdfgetKanaMessage7(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage7_Asc() { regOBA("KANA_MESSAGE7"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage7_Desc() { regOBD("KANA_MESSAGE7"); return this; }

    protected ConditionValue _kanaMessage8;
    public ConditionValue xdfgetKanaMessage8()
    { if (_kanaMessage8 == null) { _kanaMessage8 = nCV(); }
      return _kanaMessage8; }
    protected ConditionValue xgetCValueKanaMessage8() { return xdfgetKanaMessage8(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage8_Asc() { regOBA("KANA_MESSAGE8"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage8_Desc() { regOBD("KANA_MESSAGE8"); return this; }

    protected ConditionValue _kanaMessage9;
    public ConditionValue xdfgetKanaMessage9()
    { if (_kanaMessage9 == null) { _kanaMessage9 = nCV(); }
      return _kanaMessage9; }
    protected ConditionValue xgetCValueKanaMessage9() { return xdfgetKanaMessage9(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage9_Asc() { regOBA("KANA_MESSAGE9"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage9_Desc() { regOBD("KANA_MESSAGE9"); return this; }

    protected ConditionValue _kanaMessage10;
    public ConditionValue xdfgetKanaMessage10()
    { if (_kanaMessage10 == null) { _kanaMessage10 = nCV(); }
      return _kanaMessage10; }
    protected ConditionValue xgetCValueKanaMessage10() { return xdfgetKanaMessage10(); }

    /**
     * Add order-by as ascend. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage10_Asc() { regOBA("KANA_MESSAGE10"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_KanaMessage10_Desc() { regOBD("KANA_MESSAGE10"); return this; }

    protected ConditionValue _deliveryNoteSummary;
    public ConditionValue xdfgetDeliveryNoteSummary()
    { if (_deliveryNoteSummary == null) { _deliveryNoteSummary = nCV(); }
      return _deliveryNoteSummary; }
    protected ConditionValue xgetCValueDeliveryNoteSummary() { return xdfgetDeliveryNoteSummary(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryNoteSummary_Asc() { regOBA("DELIVERY_NOTE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryNoteSummary_Desc() { regOBD("DELIVERY_NOTE_SUMMARY"); return this; }

    protected ConditionValue _invoiceSummary;
    public ConditionValue xdfgetInvoiceSummary()
    { if (_invoiceSummary == null) { _invoiceSummary = nCV(); }
      return _invoiceSummary; }
    protected ConditionValue xgetCValueInvoiceSummary() { return xdfgetInvoiceSummary(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InvoiceSummary_Asc() { regOBA("INVOICE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_InvoiceSummary_Desc() { regOBD("INVOICE_SUMMARY"); return this; }

    protected ConditionValue _ecOrderNo;
    public ConditionValue xdfgetEcOrderNo()
    { if (_ecOrderNo == null) { _ecOrderNo = nCV(); }
      return _ecOrderNo; }
    protected ConditionValue xgetCValueEcOrderNo() { return xdfgetEcOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EcOrderNo_Asc() { regOBA("EC_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_EcOrderNo_Desc() { regOBD("EC_ORDER_NO"); return this; }

    protected ConditionValue _paymentTypeCd;
    public ConditionValue xdfgetPaymentTypeCd()
    { if (_paymentTypeCd == null) { _paymentTypeCd = nCV(); }
      return _paymentTypeCd; }
    protected ConditionValue xgetCValuePaymentTypeCd() { return xdfgetPaymentTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PaymentTypeCd_Asc() { regOBA("PAYMENT_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PaymentTypeCd_Desc() { regOBD("PAYMENT_TYPE_CD"); return this; }

    protected ConditionValue _priceHiddenFlg;
    public ConditionValue xdfgetPriceHiddenFlg()
    { if (_priceHiddenFlg == null) { _priceHiddenFlg = nCV(); }
      return _priceHiddenFlg; }
    protected ConditionValue xgetCValuePriceHiddenFlg() { return xdfgetPriceHiddenFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PriceHiddenFlg_Asc() { regOBA("PRICE_HIDDEN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_HIDDEN_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PriceHiddenFlg_Desc() { regOBD("PRICE_HIDDEN_FLG"); return this; }

    protected ConditionValue _paymentHiddenFlg;
    public ConditionValue xdfgetPaymentHiddenFlg()
    { if (_paymentHiddenFlg == null) { _paymentHiddenFlg = nCV(); }
      return _paymentHiddenFlg; }
    protected ConditionValue xgetCValuePaymentHiddenFlg() { return xdfgetPaymentHiddenFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PaymentHiddenFlg_Asc() { regOBA("PAYMENT_HIDDEN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_HIDDEN_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_PaymentHiddenFlg_Desc() { regOBD("PAYMENT_HIDDEN_FLG"); return this; }

    protected ConditionValue _directUpdFlg;
    public ConditionValue xdfgetDirectUpdFlg()
    { if (_directUpdFlg == null) { _directUpdFlg = nCV(); }
      return _directUpdFlg; }
    protected ConditionValue xgetCValueDirectUpdFlg() { return xdfgetDirectUpdFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DirectUpdFlg_Asc() { regOBA("DIRECT_UPD_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_UPD_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DirectUpdFlg_Desc() { regOBD("DIRECT_UPD_FLG"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_IfId_Asc() { regOBA("IF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_IfId_Desc() { regOBD("IF_ID"); return this; }

    protected ConditionValue _customerCd;
    public ConditionValue xdfgetCustomerCd()
    { if (_customerCd == null) { _customerCd = nCV(); }
      return _customerCd; }
    protected ConditionValue xgetCValueCustomerCd() { return xdfgetCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _customerNm;
    public ConditionValue xdfgetCustomerNm()
    { if (_customerNm == null) { _customerNm = nCV(); }
      return _customerNm; }
    protected ConditionValue xgetCValueCustomerNm() { return xdfgetCustomerNm(); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _psam;
    public ConditionValue xdfgetPsam()
    { if (_psam == null) { _psam = nCV(); }
      return _psam; }
    protected ConditionValue xgetCValuePsam() { return xdfgetPsam(); }

    /**
     * Add order-by as ascend. <br>
     * PSAM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Psam_Asc() { regOBA("PSAM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSAM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_Psam_Desc() { regOBD("PSAM"); return this; }

    protected ConditionValue _floorCompFlg;
    public ConditionValue xdfgetFloorCompFlg()
    { if (_floorCompFlg == null) { _floorCompFlg = nCV(); }
      return _floorCompFlg; }
    protected ConditionValue xgetCValueFloorCompFlg() { return xdfgetFloorCompFlg(); }

    /**
     * Add order-by as ascend. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_FloorCompFlg_Asc() { regOBA("FLOOR_COMP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_FloorCompFlg_Desc() { regOBD("FLOOR_COMP_FLG"); return this; }

    protected ConditionValue _deliveryType;
    public ConditionValue xdfgetDeliveryType()
    { if (_deliveryType == null) { _deliveryType = nCV(); }
      return _deliveryType; }
    protected ConditionValue xgetCValueDeliveryType() { return xdfgetDeliveryType(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryType_Asc() { regOBA("DELIVERY_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DeliveryType_Desc() { regOBD("DELIVERY_TYPE"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstHCQ bq = (TShippingInstHCQ)bqs;
        TShippingInstHCQ uq = (TShippingInstHCQ)uqs;
        if (bq.hasConditionQueryMDeliveryCourse()) {
            uq.queryMDeliveryCourse().reflectRelationOnUnionQuery(bq.queryMDeliveryCourse(), uq.queryMDeliveryCourse());
        }
        if (bq.hasConditionQueryMProcessType()) {
            uq.queryMProcessType().reflectRelationOnUnionQuery(bq.queryMProcessType(), uq.queryMProcessType());
        }
        if (bq.hasConditionQueryMCustomerByDelivCustomerId()) {
            uq.queryMCustomerByDelivCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerByDelivCustomerId(), uq.queryMCustomerByDelivCustomerId());
        }
        if (bq.hasConditionQueryMClient()) {
            uq.queryMClient().reflectRelationOnUnionQuery(bq.queryMClient(), uq.queryMClient());
        }
        if (bq.hasConditionQueryMCustomerBySupplyCustomerId()) {
            uq.queryMCustomerBySupplyCustomerId().reflectRelationOnUnionQuery(bq.queryMCustomerBySupplyCustomerId(), uq.queryMCustomerBySupplyCustomerId());
        }
        if (bq.hasConditionQueryTAllocInstH()) {
            uq.queryTAllocInstH().reflectRelationOnUnionQuery(bq.queryTAllocInstH(), uq.queryTAllocInstH());
        }
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
        if (bq.hasConditionQueryMZipForDeliv()) {
            uq.queryMZipForDeliv().reflectRelationOnUnionQuery(bq.queryMZipForDeliv(), uq.queryMZipForDeliv());
        }
        if (bq.hasConditionQueryBClassDtlByDelivTz()) {
            uq.queryBClassDtlByDelivTz().reflectRelationOnUnionQuery(bq.queryBClassDtlByDelivTz(), uq.queryBClassDtlByDelivTz());
        }
        if (bq.hasConditionQueryBClassDtlByEmergencyFlg()) {
            uq.queryBClassDtlByEmergencyFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByEmergencyFlg(), uq.queryBClassDtlByEmergencyFlg());
        }
        if (bq.hasConditionQueryBClassDtlByErrorFlg()) {
            uq.queryBClassDtlByErrorFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByErrorFlg(), uq.queryBClassDtlByErrorFlg());
        }
        if (bq.hasConditionQueryBClassDtlByInputType()) {
            uq.queryBClassDtlByInputType().reflectRelationOnUnionQuery(bq.queryBClassDtlByInputType(), uq.queryBClassDtlByInputType());
        }
        if (bq.hasConditionQueryBClassDtlByShippingStatus()) {
            uq.queryBClassDtlByShippingStatus().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingStatus(), uq.queryBClassDtlByShippingStatus());
        }
        if (bq.hasConditionQueryBClassDtlByStockOutFlg()) {
            uq.queryBClassDtlByStockOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByStockOutFlg(), uq.queryBClassDtlByStockOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @return The instance of condition-query. (NotNull)
     */
    public MDeliveryCourseCQ queryMDeliveryCourse() {
        return xdfgetConditionQueryMDeliveryCourse();
    }
    public MDeliveryCourseCQ xdfgetConditionQueryMDeliveryCourse() {
        String prop = "mDeliveryCourse";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMDeliveryCourse()); xsetupOuterJoinMDeliveryCourse(); }
        return xgetQueRlMap(prop);
    }
    protected MDeliveryCourseCQ xcreateQueryMDeliveryCourse() {
        String nrp = xresolveNRP("t_shipping_inst_h", "mDeliveryCourse"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MDeliveryCourseCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mDeliveryCourse", nrp);
    }
    protected void xsetupOuterJoinMDeliveryCourse() { xregOutJo("mDeliveryCourse"); }
    public boolean hasConditionQueryMDeliveryCourse() { return xhasQueRlMap("mDeliveryCourse"); }

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
        String nrp = xresolveNRP("t_shipping_inst_h", "mProcessType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProcessTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProcessType", nrp);
    }
    protected void xsetupOuterJoinMProcessType() { xregOutJo("mProcessType"); }
    public boolean hasConditionQueryMProcessType() { return xhasQueRlMap("mProcessType"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerByDelivCustomerId() {
        return xdfgetConditionQueryMCustomerByDelivCustomerId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerByDelivCustomerId() {
        String prop = "mCustomerByDelivCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerByDelivCustomerId()); xsetupOuterJoinMCustomerByDelivCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerByDelivCustomerId() {
        String nrp = xresolveNRP("t_shipping_inst_h", "mCustomerByDelivCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerByDelivCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCustomerByDelivCustomerId() { xregOutJo("mCustomerByDelivCustomerId"); }
    public boolean hasConditionQueryMCustomerByDelivCustomerId() { return xhasQueRlMap("mCustomerByDelivCustomerId"); }

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
        String nrp = xresolveNRP("t_shipping_inst_h", "mClient"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MClientCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mClient", nrp);
    }
    protected void xsetupOuterJoinMClient() { xregOutJo("mClient"); }
    public boolean hasConditionQueryMClient() { return xhasQueRlMap("mClient"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomerBySupplyCustomerId() {
        return xdfgetConditionQueryMCustomerBySupplyCustomerId();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomerBySupplyCustomerId() {
        String prop = "mCustomerBySupplyCustomerId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomerBySupplyCustomerId()); xsetupOuterJoinMCustomerBySupplyCustomerId(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomerBySupplyCustomerId() {
        String nrp = xresolveNRP("t_shipping_inst_h", "mCustomerBySupplyCustomerId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomerBySupplyCustomerId", nrp);
    }
    protected void xsetupOuterJoinMCustomerBySupplyCustomerId() { xregOutJo("mCustomerBySupplyCustomerId"); }
    public boolean hasConditionQueryMCustomerBySupplyCustomerId() { return xhasQueRlMap("mCustomerBySupplyCustomerId"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TAllocInstHCQ queryTAllocInstH() {
        return xdfgetConditionQueryTAllocInstH();
    }
    public TAllocInstHCQ xdfgetConditionQueryTAllocInstH() {
        String prop = "tAllocInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTAllocInstH()); xsetupOuterJoinTAllocInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TAllocInstHCQ xcreateQueryTAllocInstH() {
        String nrp = xresolveNRP("t_shipping_inst_h", "tAllocInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TAllocInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tAllocInstH", nrp);
    }
    protected void xsetupOuterJoinTAllocInstH() { xregOutJo("tAllocInstH"); }
    public boolean hasConditionQueryTAllocInstH() { return xhasQueRlMap("tAllocInstH"); }

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
        String nrp = xresolveNRP("t_shipping_inst_h", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_zip by my DELIV_ZIP_CD, named 'MZipForDeliv'.
     * @return The instance of condition-query. (NotNull)
     */
    public MZipCQ queryMZipForDeliv() {
        return xdfgetConditionQueryMZipForDeliv();
    }
    public MZipCQ xdfgetConditionQueryMZipForDeliv() {
        String prop = "mZipForDeliv";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMZipForDeliv()); xsetupOuterJoinMZipForDeliv(); }
        return xgetQueRlMap(prop);
    }
    protected MZipCQ xcreateQueryMZipForDeliv() {
        String nrp = xresolveNRP("t_shipping_inst_h", "mZipForDeliv"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MZipCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mZipForDeliv", nrp);
    }
    protected void xsetupOuterJoinMZipForDeliv() { xregOutJo("mZipForDeliv"); }
    public boolean hasConditionQueryMZipForDeliv() { return xhasQueRlMap("mZipForDeliv"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my DELIV_TZ, named 'BClassDtlByDelivTz'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByDelivTz() {
        return xdfgetConditionQueryBClassDtlByDelivTz();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByDelivTz() {
        String prop = "bClassDtlByDelivTz";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByDelivTz()); xsetupOuterJoinBClassDtlByDelivTz(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByDelivTz() {
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByDelivTz"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByDelivTz", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByDelivTz() { xregOutJo("bClassDtlByDelivTz"); }
    public boolean hasConditionQueryBClassDtlByDelivTz() { return xhasQueRlMap("bClassDtlByDelivTz"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my EMERGENCY_FLG, named 'BClassDtlByEmergencyFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByEmergencyFlg() {
        return xdfgetConditionQueryBClassDtlByEmergencyFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByEmergencyFlg() {
        String prop = "bClassDtlByEmergencyFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByEmergencyFlg()); xsetupOuterJoinBClassDtlByEmergencyFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByEmergencyFlg() {
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByEmergencyFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByEmergencyFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByEmergencyFlg() { xregOutJo("bClassDtlByEmergencyFlg"); }
    public boolean hasConditionQueryBClassDtlByEmergencyFlg() { return xhasQueRlMap("bClassDtlByEmergencyFlg"); }

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
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByErrorFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByInputType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInputType", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInputType() { xregOutJo("bClassDtlByInputType"); }
    public boolean hasConditionQueryBClassDtlByInputType() { return xhasQueRlMap("bClassDtlByInputType"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SHIPPING_STATUS, named 'BClassDtlByShippingStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingStatus() {
        return xdfgetConditionQueryBClassDtlByShippingStatus();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingStatus() {
        String prop = "bClassDtlByShippingStatus";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingStatus()); xsetupOuterJoinBClassDtlByShippingStatus(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingStatus() {
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByShippingStatus"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingStatus", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingStatus() { xregOutJo("bClassDtlByShippingStatus"); }
    public boolean hasConditionQueryBClassDtlByShippingStatus() { return xhasQueRlMap("bClassDtlByShippingStatus"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my STOCK_OUT_FLG, named 'BClassDtlByStockOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByStockOutFlg() {
        return xdfgetConditionQueryBClassDtlByStockOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByStockOutFlg() {
        String prop = "bClassDtlByStockOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByStockOutFlg()); xsetupOuterJoinBClassDtlByStockOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByStockOutFlg() {
        String nrp = xresolveNRP("t_shipping_inst_h", "bClassDtlByStockOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByStockOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByStockOutFlg() { xregOutJo("bClassDtlByStockOutFlg"); }
    public boolean hasConditionQueryBClassDtlByStockOutFlg() { return xhasQueRlMap("bClassDtlByStockOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingInstHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingInstHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingInstHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingInstHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingInstHCQ> _myselfExistsMap;
    public Map<String, TShippingInstHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingInstHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingInstHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingInstHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstHCB.class.getName(); }
    protected String xCQ() { return TShippingInstHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
