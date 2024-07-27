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
 * The base condition-query of t_shipping_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingPlanHCQ extends AbstractBsTShippingPlanHCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingPlanHCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingPlanHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_plan_h) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingPlanHCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingPlanHCIQ xcreateCIQ() {
        TShippingPlanHCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingPlanHCIQ xnewCIQ() {
        return new TShippingPlanHCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_plan_h on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingPlanHCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingPlanHCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingPlanHId;
    public ConditionValue xdfgetShippingPlanHId()
    { if (_shippingPlanHId == null) { _shippingPlanHId = nCV(); }
      return _shippingPlanHId; }
    protected ConditionValue xgetCValueShippingPlanHId() { return xdfgetShippingPlanHId(); }

    public Map<String, TShippingPlanBCQ> xdfgetShippingPlanHId_ExistsReferrer_TShippingPlanBList() { return xgetSQueMap("shippingPlanHId_ExistsReferrer_TShippingPlanBList"); }
    public String keepShippingPlanHId_ExistsReferrer_TShippingPlanBList(TShippingPlanBCQ sq) { return xkeepSQue("shippingPlanHId_ExistsReferrer_TShippingPlanBList", sq); }

    public Map<String, TShippingPlanBCQ> xdfgetShippingPlanHId_NotExistsReferrer_TShippingPlanBList() { return xgetSQueMap("shippingPlanHId_NotExistsReferrer_TShippingPlanBList"); }
    public String keepShippingPlanHId_NotExistsReferrer_TShippingPlanBList(TShippingPlanBCQ sq) { return xkeepSQue("shippingPlanHId_NotExistsReferrer_TShippingPlanBList", sq); }

    public Map<String, TShippingPlanBCQ> xdfgetShippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList() { return xgetSQueMap("shippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList"); }
    public String keepShippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList(TShippingPlanBCQ sq) { return xkeepSQue("shippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList", sq); }

    public Map<String, TShippingPlanBCQ> xdfgetShippingPlanHId_QueryDerivedReferrer_TShippingPlanBList() { return xgetSQueMap("shippingPlanHId_QueryDerivedReferrer_TShippingPlanBList"); }
    public String keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBList(TShippingPlanBCQ sq) { return xkeepSQue("shippingPlanHId_QueryDerivedReferrer_TShippingPlanBList", sq); }
    public Map<String, Object> xdfgetShippingPlanHId_QueryDerivedReferrer_TShippingPlanBListParameter() { return xgetSQuePmMap("shippingPlanHId_QueryDerivedReferrer_TShippingPlanBList"); }
    public String keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBListParameter(Object pm) { return xkeepSQuePm("shippingPlanHId_QueryDerivedReferrer_TShippingPlanBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingPlanHId_Asc() { regOBA("SHIPPING_PLAN_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingPlanHId_Desc() { regOBD("SHIPPING_PLAN_H_ID"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ClientId_Asc() { regOBA("CLIENT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ClientId_Desc() { regOBD("CLIENT_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _processTypeId;
    public ConditionValue xdfgetProcessTypeId()
    { if (_processTypeId == null) { _processTypeId = nCV(); }
      return _processTypeId; }
    protected ConditionValue xgetCValueProcessTypeId() { return xdfgetProcessTypeId(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ProcessTypeId_Asc() { regOBA("PROCESS_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ProcessTypeId_Desc() { regOBD("PROCESS_TYPE_ID"); return this; }

    protected ConditionValue _inputType;
    public ConditionValue xdfgetInputType()
    { if (_inputType == null) { _inputType = nCV(); }
      return _inputType; }
    protected ConditionValue xgetCValueInputType() { return xdfgetInputType(); }

    /**
     * Add order-by as ascend. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_InputType_Asc() { regOBA("INPUT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_InputType_Desc() { regOBD("INPUT_TYPE"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_WorkDt_Asc() { regOBA("WORK_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_WorkDt_Desc() { regOBD("WORK_DT"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivPlanDt_Asc() { regOBA("DELIV_PLAN_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivPlanDt_Desc() { regOBD("DELIV_PLAN_DT"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivDt_Asc() { regOBA("DELIV_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivDt_Desc() { regOBD("DELIV_DT"); return this; }

    protected ConditionValue _delivTz;
    public ConditionValue xdfgetDelivTz()
    { if (_delivTz == null) { _delivTz = nCV(); }
      return _delivTz; }
    protected ConditionValue xgetCValueDelivTz() { return xdfgetDelivTz(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivTz_Asc() { regOBA("DELIV_TZ"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivTz_Desc() { regOBD("DELIV_TZ"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ClientShippingNo_Asc() { regOBA("CLIENT_SHIPPING_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ClientShippingNo_Desc() { regOBD("CLIENT_SHIPPING_NO"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _shippingStatus;
    public ConditionValue xdfgetShippingStatus()
    { if (_shippingStatus == null) { _shippingStatus = nCV(); }
      return _shippingStatus; }
    protected ConditionValue xgetCValueShippingStatus() { return xdfgetShippingStatus(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingStatus_Asc() { regOBA("SHIPPING_STATUS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingStatus_Desc() { regOBD("SHIPPING_STATUS"); return this; }

    protected ConditionValue _supplyCustomerId;
    public ConditionValue xdfgetSupplyCustomerId()
    { if (_supplyCustomerId == null) { _supplyCustomerId = nCV(); }
      return _supplyCustomerId; }
    protected ConditionValue xgetCValueSupplyCustomerId() { return xdfgetSupplyCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerId_Asc() { regOBA("SUPPLY_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerId_Desc() { regOBD("SUPPLY_CUSTOMER_ID"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerCd_Asc() { regOBA("SUPPLY_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerCd_Desc() { regOBD("SUPPLY_CUSTOMER_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerNm_Asc() { regOBA("SUPPLY_CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SupplyCustomerNm_Desc() { regOBD("SUPPLY_CUSTOMER_NM"); return this; }

    protected ConditionValue _delivCustomerId;
    public ConditionValue xdfgetDelivCustomerId()
    { if (_delivCustomerId == null) { _delivCustomerId = nCV(); }
      return _delivCustomerId; }
    protected ConditionValue xgetCValueDelivCustomerId() { return xdfgetDelivCustomerId(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivCustomerId_Asc() { regOBA("DELIV_CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivCustomerId_Desc() { regOBD("DELIV_CUSTOMER_ID"); return this; }

    protected ConditionValue _delivCustomerCd;
    public ConditionValue xdfgetDelivCustomerCd()
    { if (_delivCustomerCd == null) { _delivCustomerCd = nCV(); }
      return _delivCustomerCd; }
    protected ConditionValue xgetCValueDelivCustomerCd() { return xdfgetDelivCustomerCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivCustomerCd_Asc() { regOBA("DELIV_CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivCustomerCd_Desc() { regOBD("DELIV_CUSTOMER_CD"); return this; }

    protected ConditionValue _delivZipCd;
    public ConditionValue xdfgetDelivZipCd()
    { if (_delivZipCd == null) { _delivZipCd = nCV(); }
      return _delivZipCd; }
    protected ConditionValue xgetCValueDelivZipCd() { return xdfgetDelivZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivZipCd_Asc() { regOBA("DELIV_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivZipCd_Desc() { regOBD("DELIV_ZIP_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivAddress1_Asc() { regOBA("DELIV_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivAddress1_Desc() { regOBD("DELIV_ADDRESS1"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivAddress2_Asc() { regOBA("DELIV_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivAddress2_Desc() { regOBD("DELIV_ADDRESS2"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivAddress3_Asc() { regOBA("DELIV_ADDRESS3"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivAddress3_Desc() { regOBD("DELIV_ADDRESS3"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivAddressSupply_Asc() { regOBA("DELIV_ADDRESS_SUPPLY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivAddressSupply_Desc() { regOBD("DELIV_ADDRESS_SUPPLY"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelivTelNo_Asc() { regOBA("DELIV_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelivTelNo_Desc() { regOBD("DELIV_TEL_NO"); return this; }

    protected ConditionValue _deliveryCourseId;
    public ConditionValue xdfgetDeliveryCourseId()
    { if (_deliveryCourseId == null) { _deliveryCourseId = nCV(); }
      return _deliveryCourseId; }
    protected ConditionValue xgetCValueDeliveryCourseId() { return xdfgetDeliveryCourseId(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DeliveryCourseId_Asc() { regOBA("DELIVERY_COURSE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DeliveryCourseId_Desc() { regOBD("DELIVERY_COURSE_ID"); return this; }

    protected ConditionValue _deliveryCourseCd;
    public ConditionValue xdfgetDeliveryCourseCd()
    { if (_deliveryCourseCd == null) { _deliveryCourseCd = nCV(); }
      return _deliveryCourseCd; }
    protected ConditionValue xgetCValueDeliveryCourseCd() { return xdfgetDeliveryCourseCd(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DeliveryCourseCd_Asc() { regOBA("DELIVERY_COURSE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DeliveryCourseCd_Desc() { regOBD("DELIVERY_COURSE_CD"); return this; }

    protected ConditionValue _emergencyFlg;
    public ConditionValue xdfgetEmergencyFlg()
    { if (_emergencyFlg == null) { _emergencyFlg = nCV(); }
      return _emergencyFlg; }
    protected ConditionValue xgetCValueEmergencyFlg() { return xdfgetEmergencyFlg(); }

    /**
     * Add order-by as ascend. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_EmergencyFlg_Asc() { regOBA("EMERGENCY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_EmergencyFlg_Desc() { regOBD("EMERGENCY_FLG"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_PickingWorkMessage_Asc() { regOBA("PICKING_WORK_MESSAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_PickingWorkMessage_Desc() { regOBD("PICKING_WORK_MESSAGE"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_PickingBatchNo_Asc() { regOBA("PICKING_BATCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_PickingBatchNo_Desc() { regOBD("PICKING_BATCH_NO"); return this; }

    protected ConditionValue _stockOutFlg;
    public ConditionValue xdfgetStockOutFlg()
    { if (_stockOutFlg == null) { _stockOutFlg = nCV(); }
      return _stockOutFlg; }
    protected ConditionValue xgetCValueStockOutFlg() { return xdfgetStockOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_StockOutFlg_Asc() { regOBA("STOCK_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_StockOutFlg_Desc() { regOBD("STOCK_OUT_FLG"); return this; }

    protected ConditionValue _allocInstHId;
    public ConditionValue xdfgetAllocInstHId()
    { if (_allocInstHId == null) { _allocInstHId = nCV(); }
      return _allocInstHId; }
    protected ConditionValue xgetCValueAllocInstHId() { return xdfgetAllocInstHId(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_AllocInstHId_Asc() { regOBA("ALLOC_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_AllocInstHId_Desc() { regOBD("ALLOC_INST_H_ID"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_Cod_Asc() { regOBA("COD"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_Cod_Desc() { regOBD("COD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_CodTax_Asc() { regOBA("COD_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_TAX: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_CodTax_Desc() { regOBD("COD_TAX"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_TotalTax_Asc() { regOBA("TOTAL_TAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_TotalTax_Desc() { regOBD("TOTAL_TAX"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_SlipTypeCd_Asc() { regOBA("SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SlipTypeCd_Desc() { regOBD("SLIP_TYPE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_SalesOrderSlipTypeCd_Asc() { regOBA("SALES_ORDER_SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SalesOrderSlipTypeCd_Desc() { regOBD("SALES_ORDER_SLIP_TYPE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DirectDeliveryTypeCd_Asc() { regOBA("DIRECT_DELIVERY_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DirectDeliveryTypeCd_Desc() { regOBD("DIRECT_DELIVERY_TYPE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingTypeId_Asc() { regOBA("SHIPPING_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingTypeId_Desc() { regOBD("SHIPPING_TYPE_ID"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingTypeCd_Asc() { regOBA("SHIPPING_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingTypeCd_Desc() { regOBD("SHIPPING_TYPE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_KoguchiDeliveryFlg_Asc() { regOBA("KOGUCHI_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_KoguchiDeliveryFlg_Desc() { regOBD("KOGUCHI_DELIVERY_FLG"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_KohaiContractorCd_Asc() { regOBA("KOHAI_CONTRACTOR_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_KohaiContractorCd_Desc() { regOBD("KOHAI_CONTRACTOR_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_KohaiContractorNm_Asc() { regOBA("KOHAI_CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_KohaiContractorNm_Desc() { regOBD("KOHAI_CONTRACTOR_NM"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingReasonCd_Asc() { regOBA("SHIPPING_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingReasonCd_Desc() { regOBD("SHIPPING_REASON_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

    protected ConditionValue _tenhanshaOrderNo;
    public ConditionValue xdfgetTenhanshaOrderNo()
    { if (_tenhanshaOrderNo == null) { _tenhanshaOrderNo = nCV(); }
      return _tenhanshaOrderNo; }
    protected ConditionValue xgetCValueTenhanshaOrderNo() { return xdfgetTenhanshaOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_TenhanshaOrderNo_Asc() { regOBA("TENHANSHA_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_TenhanshaOrderNo_Desc() { regOBD("TENHANSHA_ORDER_NO"); return this; }

    protected ConditionValue _destinationCd;
    public ConditionValue xdfgetDestinationCd()
    { if (_destinationCd == null) { _destinationCd = nCV(); }
      return _destinationCd; }
    protected ConditionValue xgetCValueDestinationCd() { return xdfgetDestinationCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationCd_Asc() { regOBA("DESTINATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationCd_Desc() { regOBD("DESTINATION_CD"); return this; }

    protected ConditionValue _destinationNm1;
    public ConditionValue xdfgetDestinationNm1()
    { if (_destinationNm1 == null) { _destinationNm1 = nCV(); }
      return _destinationNm1; }
    protected ConditionValue xgetCValueDestinationNm1() { return xdfgetDestinationNm1(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

    protected ConditionValue _destinationNm2;
    public ConditionValue xdfgetDestinationNm2()
    { if (_destinationNm2 == null) { _destinationNm2 = nCV(); }
      return _destinationNm2; }
    protected ConditionValue xgetCValueDestinationNm2() { return xdfgetDestinationNm2(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DestinationNmKana_Asc() { regOBA("DESTINATION_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationNmKana_Desc() { regOBD("DESTINATION_NM_KANA"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DestinationFax_Asc() { regOBA("DESTINATION_FAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DestinationFax_Desc() { regOBD("DESTINATION_FAX"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingPlanHCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingPlanHCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingPlanHCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingPlanHCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingPlanHCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingPlanHCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingPlanHCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingPlanHCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingPlanHCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingPlanHCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingPlanHCQ> _myselfExistsMap;
    public Map<String, TShippingPlanHCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingPlanHCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingPlanHCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingPlanHCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingPlanHCB.class.getName(); }
    protected String xCQ() { return TShippingPlanHCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
