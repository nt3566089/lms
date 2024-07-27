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
 * The base condition-query of m_carrier_decision.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierDecisionCQ extends AbstractBsMCarrierDecisionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierDecisionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierDecisionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_carrier_decision) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MCarrierDecisionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MCarrierDecisionCIQ xcreateCIQ() {
        MCarrierDecisionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MCarrierDecisionCIQ xnewCIQ() {
        return new MCarrierDecisionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_carrier_decision on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MCarrierDecisionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MCarrierDecisionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _carrierDecisionId;
    public ConditionValue xdfgetCarrierDecisionId()
    { if (_carrierDecisionId == null) { _carrierDecisionId = nCV(); }
      return _carrierDecisionId; }
    protected ConditionValue xgetCValueCarrierDecisionId() { return xdfgetCarrierDecisionId(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierDecisionId_Asc() { regOBA("CARRIER_DECISION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierDecisionId_Desc() { regOBD("CARRIER_DECISION_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _zipCd;
    public ConditionValue xdfgetZipCd()
    { if (_zipCd == null) { _zipCd = nCV(); }
      return _zipCd; }
    protected ConditionValue xgetCValueZipCd() { return xdfgetZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_ZipCd_Asc() { regOBA("ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ZIP_CD: {IX, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_ZipCd_Desc() { regOBD("ZIP_CD"); return this; }

    protected ConditionValue _salesOrgId;
    public ConditionValue xdfgetSalesOrgId()
    { if (_salesOrgId == null) { _salesOrgId = nCV(); }
      return _salesOrgId; }
    protected ConditionValue xgetCValueSalesOrgId() { return xdfgetSalesOrgId(); }

    public Map<String, MSalesOrgCQ> getSalesOrgId_InScopeRelation_MSalesOrg() { return xgetSQueMap("salesOrgId_InScopeRelation_MSalesOrg"); }
    public String keepSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("salesOrgId_InScopeRelation_MSalesOrg", sq); }

    public Map<String, MSalesOrgCQ> getSalesOrgId_NotInScopeRelation_MSalesOrg() { return xgetSQueMap("salesOrgId_NotInScopeRelation_MSalesOrg"); }
    public String keepSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("salesOrgId_NotInScopeRelation_MSalesOrg", sq); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_SalesOrgId_Asc() { regOBA("SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_SalesOrgId_Desc() { regOBD("SALES_ORG_ID"); return this; }

    protected ConditionValue _salesOrgCd;
    public ConditionValue xdfgetSalesOrgCd()
    { if (_salesOrgCd == null) { _salesOrgCd = nCV(); }
      return _salesOrgCd; }
    protected ConditionValue xgetCValueSalesOrgCd() { return xdfgetSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {IX+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _customerId;
    public ConditionValue xdfgetCustomerId()
    { if (_customerId == null) { _customerId = nCV(); }
      return _customerId; }
    protected ConditionValue xgetCValueCustomerId() { return xdfgetCustomerId(); }

    public Map<String, MCustomerCQ> getCustomerId_InScopeRelation_MCustomer() { return xgetSQueMap("customerId_InScopeRelation_MCustomer"); }
    public String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_InScopeRelation_MCustomer", sq); }

    public Map<String, MCustomerCQ> getCustomerId_NotInScopeRelation_MCustomer() { return xgetSQueMap("customerId_NotInScopeRelation_MCustomer"); }
    public String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq) { return xkeepSQue("customerId_NotInScopeRelation_MCustomer", sq); }

    /**
     * Add order-by as ascend. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CustomerId_Asc() { regOBA("CUSTOMER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CustomerId_Desc() { regOBD("CUSTOMER_ID"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

    protected ConditionValue _directKohaiTypeCd;
    public ConditionValue xdfgetDirectKohaiTypeCd()
    { if (_directKohaiTypeCd == null) { _directKohaiTypeCd = nCV(); }
      return _directKohaiTypeCd; }
    protected ConditionValue xgetCValueDirectKohaiTypeCd() { return xdfgetDirectKohaiTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_DirectKohaiTypeCd_Asc() { regOBA("DIRECT_KOHAI_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_DirectKohaiTypeCd_Desc() { regOBD("DIRECT_KOHAI_TYPE_CD"); return this; }

    protected ConditionValue _prefecture;
    public ConditionValue xdfgetPrefecture()
    { if (_prefecture == null) { _prefecture = nCV(); }
      return _prefecture; }
    protected ConditionValue xgetCValuePrefecture() { return xdfgetPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_Prefecture_Asc() { regOBA("PREFECTURE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PREFECTURE: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_Prefecture_Desc() { regOBD("PREFECTURE"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    public Map<String, MCarrierCQ> getCarrierId_InScopeRelation_MCarrierByCarrierId() { return xgetSQueMap("carrierId_InScopeRelation_MCarrierByCarrierId"); }
    public String keepCarrierId_InScopeRelation_MCarrierByCarrierId(MCarrierCQ sq) { return xkeepSQue("carrierId_InScopeRelation_MCarrierByCarrierId", sq); }

    public Map<String, MCarrierCQ> getCarrierId_NotInScopeRelation_MCarrierByCarrierId() { return xgetSQueMap("carrierId_NotInScopeRelation_MCarrierByCarrierId"); }
    public String keepCarrierId_NotInScopeRelation_MCarrierByCarrierId(MCarrierCQ sq) { return xkeepSQue("carrierId_NotInScopeRelation_MCarrierByCarrierId", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _carrierId1;
    public ConditionValue xdfgetCarrierId1()
    { if (_carrierId1 == null) { _carrierId1 = nCV(); }
      return _carrierId1; }
    protected ConditionValue xgetCValueCarrierId1() { return xdfgetCarrierId1(); }

    public Map<String, MCarrierCQ> getCarrierId1_InScopeRelation_MCarrierByCarrierId1() { return xgetSQueMap("carrierId1_InScopeRelation_MCarrierByCarrierId1"); }
    public String keepCarrierId1_InScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq) { return xkeepSQue("carrierId1_InScopeRelation_MCarrierByCarrierId1", sq); }

    public Map<String, MCarrierCQ> getCarrierId1_NotInScopeRelation_MCarrierByCarrierId1() { return xgetSQueMap("carrierId1_NotInScopeRelation_MCarrierByCarrierId1"); }
    public String keepCarrierId1_NotInScopeRelation_MCarrierByCarrierId1(MCarrierCQ sq) { return xkeepSQue("carrierId1_NotInScopeRelation_MCarrierByCarrierId1", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId1_Asc() { regOBA("CARRIER_ID1"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId1_Desc() { regOBD("CARRIER_ID1"); return this; }

    protected ConditionValue _carrierCd1;
    public ConditionValue xdfgetCarrierCd1()
    { if (_carrierCd1 == null) { _carrierCd1 = nCV(); }
      return _carrierCd1; }
    protected ConditionValue xgetCValueCarrierCd1() { return xdfgetCarrierCd1(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd1_Asc() { regOBA("CARRIER_CD1"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd1_Desc() { regOBD("CARRIER_CD1"); return this; }

    protected ConditionValue _carrierId2;
    public ConditionValue xdfgetCarrierId2()
    { if (_carrierId2 == null) { _carrierId2 = nCV(); }
      return _carrierId2; }
    protected ConditionValue xgetCValueCarrierId2() { return xdfgetCarrierId2(); }

    public Map<String, MCarrierCQ> getCarrierId2_InScopeRelation_MCarrierByCarrierId2() { return xgetSQueMap("carrierId2_InScopeRelation_MCarrierByCarrierId2"); }
    public String keepCarrierId2_InScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq) { return xkeepSQue("carrierId2_InScopeRelation_MCarrierByCarrierId2", sq); }

    public Map<String, MCarrierCQ> getCarrierId2_NotInScopeRelation_MCarrierByCarrierId2() { return xgetSQueMap("carrierId2_NotInScopeRelation_MCarrierByCarrierId2"); }
    public String keepCarrierId2_NotInScopeRelation_MCarrierByCarrierId2(MCarrierCQ sq) { return xkeepSQue("carrierId2_NotInScopeRelation_MCarrierByCarrierId2", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId2_Asc() { regOBA("CARRIER_ID2"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId2_Desc() { regOBD("CARRIER_ID2"); return this; }

    protected ConditionValue _carrierCd2;
    public ConditionValue xdfgetCarrierCd2()
    { if (_carrierCd2 == null) { _carrierCd2 = nCV(); }
      return _carrierCd2; }
    protected ConditionValue xgetCValueCarrierCd2() { return xdfgetCarrierCd2(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd2_Asc() { regOBA("CARRIER_CD2"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD2: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd2_Desc() { regOBD("CARRIER_CD2"); return this; }

    protected ConditionValue _carrierId3;
    public ConditionValue xdfgetCarrierId3()
    { if (_carrierId3 == null) { _carrierId3 = nCV(); }
      return _carrierId3; }
    protected ConditionValue xgetCValueCarrierId3() { return xdfgetCarrierId3(); }

    public Map<String, MCarrierCQ> getCarrierId3_InScopeRelation_MCarrierByCarrierId3() { return xgetSQueMap("carrierId3_InScopeRelation_MCarrierByCarrierId3"); }
    public String keepCarrierId3_InScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq) { return xkeepSQue("carrierId3_InScopeRelation_MCarrierByCarrierId3", sq); }

    public Map<String, MCarrierCQ> getCarrierId3_NotInScopeRelation_MCarrierByCarrierId3() { return xgetSQueMap("carrierId3_NotInScopeRelation_MCarrierByCarrierId3"); }
    public String keepCarrierId3_NotInScopeRelation_MCarrierByCarrierId3(MCarrierCQ sq) { return xkeepSQue("carrierId3_NotInScopeRelation_MCarrierByCarrierId3", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId3_Asc() { regOBA("CARRIER_ID3"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierId3_Desc() { regOBD("CARRIER_ID3"); return this; }

    protected ConditionValue _carrierCd3;
    public ConditionValue xdfgetCarrierCd3()
    { if (_carrierCd3 == null) { _carrierCd3 = nCV(); }
      return _carrierCd3; }
    protected ConditionValue xgetCValueCarrierCd3() { return xdfgetCarrierCd3(); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd3_Asc() { regOBA("CARRIER_CD3"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD3: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_CarrierCd3_Desc() { regOBD("CARRIER_CD3"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMCarrierDecisionCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMCarrierDecisionCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMCarrierDecisionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMCarrierDecisionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MCarrierDecisionCQ bq = (MCarrierDecisionCQ)bqs;
        MCarrierDecisionCQ uq = (MCarrierDecisionCQ)uqs;
        if (bq.hasConditionQueryMCustomer()) {
            uq.queryMCustomer().reflectRelationOnUnionQuery(bq.queryMCustomer(), uq.queryMCustomer());
        }
        if (bq.hasConditionQueryMCarrierByCarrierId2()) {
            uq.queryMCarrierByCarrierId2().reflectRelationOnUnionQuery(bq.queryMCarrierByCarrierId2(), uq.queryMCarrierByCarrierId2());
        }
        if (bq.hasConditionQueryMCarrierByCarrierId1()) {
            uq.queryMCarrierByCarrierId1().reflectRelationOnUnionQuery(bq.queryMCarrierByCarrierId1(), uq.queryMCarrierByCarrierId1());
        }
        if (bq.hasConditionQueryMCarrierByCarrierId3()) {
            uq.queryMCarrierByCarrierId3().reflectRelationOnUnionQuery(bq.queryMCarrierByCarrierId3(), uq.queryMCarrierByCarrierId3());
        }
        if (bq.hasConditionQueryMCarrierByCarrierId()) {
            uq.queryMCarrierByCarrierId().reflectRelationOnUnionQuery(bq.queryMCarrierByCarrierId(), uq.queryMCarrierByCarrierId());
        }
        if (bq.hasConditionQueryMSalesOrg()) {
            uq.queryMSalesOrg().reflectRelationOnUnionQuery(bq.queryMSalesOrg(), uq.queryMSalesOrg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCustomerCQ queryMCustomer() {
        return xdfgetConditionQueryMCustomer();
    }
    public MCustomerCQ xdfgetConditionQueryMCustomer() {
        String prop = "mCustomer";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCustomer()); xsetupOuterJoinMCustomer(); }
        return xgetQueRlMap(prop);
    }
    protected MCustomerCQ xcreateQueryMCustomer() {
        String nrp = xresolveNRP("m_carrier_decision", "mCustomer"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCustomerCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCustomer", nrp);
    }
    protected void xsetupOuterJoinMCustomer() { xregOutJo("mCustomer"); }
    public boolean hasConditionQueryMCustomer() { return xhasQueRlMap("mCustomer"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrierByCarrierId2() {
        return xdfgetConditionQueryMCarrierByCarrierId2();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrierByCarrierId2() {
        String prop = "mCarrierByCarrierId2";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierByCarrierId2()); xsetupOuterJoinMCarrierByCarrierId2(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrierByCarrierId2() {
        String nrp = xresolveNRP("m_carrier_decision", "mCarrierByCarrierId2"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierByCarrierId2", nrp);
    }
    protected void xsetupOuterJoinMCarrierByCarrierId2() { xregOutJo("mCarrierByCarrierId2"); }
    public boolean hasConditionQueryMCarrierByCarrierId2() { return xhasQueRlMap("mCarrierByCarrierId2"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrierByCarrierId1() {
        return xdfgetConditionQueryMCarrierByCarrierId1();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrierByCarrierId1() {
        String prop = "mCarrierByCarrierId1";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierByCarrierId1()); xsetupOuterJoinMCarrierByCarrierId1(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrierByCarrierId1() {
        String nrp = xresolveNRP("m_carrier_decision", "mCarrierByCarrierId1"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierByCarrierId1", nrp);
    }
    protected void xsetupOuterJoinMCarrierByCarrierId1() { xregOutJo("mCarrierByCarrierId1"); }
    public boolean hasConditionQueryMCarrierByCarrierId1() { return xhasQueRlMap("mCarrierByCarrierId1"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrierByCarrierId3() {
        return xdfgetConditionQueryMCarrierByCarrierId3();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrierByCarrierId3() {
        String prop = "mCarrierByCarrierId3";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierByCarrierId3()); xsetupOuterJoinMCarrierByCarrierId3(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrierByCarrierId3() {
        String nrp = xresolveNRP("m_carrier_decision", "mCarrierByCarrierId3"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierByCarrierId3", nrp);
    }
    protected void xsetupOuterJoinMCarrierByCarrierId3() { xregOutJo("mCarrierByCarrierId3"); }
    public boolean hasConditionQueryMCarrierByCarrierId3() { return xhasQueRlMap("mCarrierByCarrierId3"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrierByCarrierId() {
        return xdfgetConditionQueryMCarrierByCarrierId();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrierByCarrierId() {
        String prop = "mCarrierByCarrierId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrierByCarrierId()); xsetupOuterJoinMCarrierByCarrierId(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrierByCarrierId() {
        String nrp = xresolveNRP("m_carrier_decision", "mCarrierByCarrierId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrierByCarrierId", nrp);
    }
    protected void xsetupOuterJoinMCarrierByCarrierId() { xregOutJo("mCarrierByCarrierId"); }
    public boolean hasConditionQueryMCarrierByCarrierId() { return xhasQueRlMap("mCarrierByCarrierId"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * @return The instance of condition-query. (NotNull)
     */
    public MSalesOrgCQ queryMSalesOrg() {
        return xdfgetConditionQueryMSalesOrg();
    }
    public MSalesOrgCQ xdfgetConditionQueryMSalesOrg() {
        String prop = "mSalesOrg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMSalesOrg()); xsetupOuterJoinMSalesOrg(); }
        return xgetQueRlMap(prop);
    }
    protected MSalesOrgCQ xcreateQueryMSalesOrg() {
        String nrp = xresolveNRP("m_carrier_decision", "mSalesOrg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MSalesOrgCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mSalesOrg", nrp);
    }
    protected void xsetupOuterJoinMSalesOrg() { xregOutJo("mSalesOrg"); }
    public boolean hasConditionQueryMSalesOrg() { return xhasQueRlMap("mSalesOrg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MCarrierDecisionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MCarrierDecisionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MCarrierDecisionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MCarrierDecisionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MCarrierDecisionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MCarrierDecisionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MCarrierDecisionCQ> _myselfExistsMap;
    public Map<String, MCarrierDecisionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MCarrierDecisionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MCarrierDecisionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MCarrierDecisionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MCarrierDecisionCB.class.getName(); }
    protected String xCQ() { return MCarrierDecisionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
