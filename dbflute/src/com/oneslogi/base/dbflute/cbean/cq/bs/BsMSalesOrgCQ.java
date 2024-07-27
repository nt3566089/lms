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
 * The base condition-query of m_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public class BsMSalesOrgCQ extends AbstractBsMSalesOrgCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MSalesOrgCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMSalesOrgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_sales_org) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MSalesOrgCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MSalesOrgCIQ xcreateCIQ() {
        MSalesOrgCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MSalesOrgCIQ xnewCIQ() {
        return new MSalesOrgCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_sales_org on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MSalesOrgCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MSalesOrgCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _salesOrgId;
    public ConditionValue xdfgetSalesOrgId()
    { if (_salesOrgId == null) { _salesOrgId = nCV(); }
      return _salesOrgId; }
    protected ConditionValue xgetCValueSalesOrgId() { return xdfgetSalesOrgId(); }

    public Map<String, MBaseSalesOrgCQ> xdfgetSalesOrgId_ExistsReferrer_MBaseSalesOrgList() { return xgetSQueMap("salesOrgId_ExistsReferrer_MBaseSalesOrgList"); }
    public String keepSalesOrgId_ExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_MBaseSalesOrgList", sq); }

    public Map<String, MCarrierDecisionCQ> xdfgetSalesOrgId_ExistsReferrer_MCarrierDecisionList() { return xgetSQueMap("salesOrgId_ExistsReferrer_MCarrierDecisionList"); }
    public String keepSalesOrgId_ExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_MCarrierDecisionList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetSalesOrgId_ExistsReferrer_MCustomerPickingList() { return xgetSQueMap("salesOrgId_ExistsReferrer_MCustomerPickingList"); }
    public String keepSalesOrgId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_MCustomerPickingList", sq); }

    public Map<String, MDepositProductCQ> xdfgetSalesOrgId_ExistsReferrer_MDepositProductList() { return xgetSQueMap("salesOrgId_ExistsReferrer_MDepositProductList"); }
    public String keepSalesOrgId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_MDepositProductList", sq); }

    public Map<String, MKoguchiDeliveryCQ> xdfgetSalesOrgId_ExistsReferrer_MKoguchiDeliveryList() { return xgetSQueMap("salesOrgId_ExistsReferrer_MKoguchiDeliveryList"); }
    public String keepSalesOrgId_ExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_MKoguchiDeliveryList", sq); }

    public Map<String, TInventoryBCQ> xdfgetSalesOrgId_ExistsReferrer_TInventoryBList() { return xgetSQueMap("salesOrgId_ExistsReferrer_TInventoryBList"); }
    public String keepSalesOrgId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("salesOrgId_ExistsReferrer_TInventoryBList", sq); }

    public Map<String, MBaseSalesOrgCQ> xdfgetSalesOrgId_NotExistsReferrer_MBaseSalesOrgList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_MBaseSalesOrgList"); }
    public String keepSalesOrgId_NotExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_MBaseSalesOrgList", sq); }

    public Map<String, MCarrierDecisionCQ> xdfgetSalesOrgId_NotExistsReferrer_MCarrierDecisionList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_MCarrierDecisionList"); }
    public String keepSalesOrgId_NotExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_MCarrierDecisionList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetSalesOrgId_NotExistsReferrer_MCustomerPickingList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_MCustomerPickingList"); }
    public String keepSalesOrgId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_MCustomerPickingList", sq); }

    public Map<String, MDepositProductCQ> xdfgetSalesOrgId_NotExistsReferrer_MDepositProductList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_MDepositProductList"); }
    public String keepSalesOrgId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_MDepositProductList", sq); }

    public Map<String, MKoguchiDeliveryCQ> xdfgetSalesOrgId_NotExistsReferrer_MKoguchiDeliveryList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_MKoguchiDeliveryList"); }
    public String keepSalesOrgId_NotExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_MKoguchiDeliveryList", sq); }

    public Map<String, TInventoryBCQ> xdfgetSalesOrgId_NotExistsReferrer_TInventoryBList() { return xgetSQueMap("salesOrgId_NotExistsReferrer_TInventoryBList"); }
    public String keepSalesOrgId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("salesOrgId_NotExistsReferrer_TInventoryBList", sq); }

    public Map<String, MBaseSalesOrgCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList", sq); }

    public Map<String, MCarrierDecisionCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList", sq); }

    public Map<String, MCustomerPickingCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_MCustomerPickingList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_MCustomerPickingList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_MCustomerPickingList", sq); }

    public Map<String, MDepositProductCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_MDepositProductList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_MDepositProductList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_MDepositProductList", sq); }

    public Map<String, MKoguchiDeliveryCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList", sq); }

    public Map<String, TInventoryBCQ> xdfgetSalesOrgId_SpecifyDerivedReferrer_TInventoryBList() { return xgetSQueMap("salesOrgId_SpecifyDerivedReferrer_TInventoryBList"); }
    public String keepSalesOrgId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("salesOrgId_SpecifyDerivedReferrer_TInventoryBList", sq); }

    public Map<String, MBaseSalesOrgCQ> xdfgetSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_MBaseSalesOrgList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_MBaseSalesOrgList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_MBaseSalesOrgList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_MBaseSalesOrgList", pm); }

    public Map<String, MCarrierDecisionCQ> xdfgetSalesOrgId_QueryDerivedReferrer_MCarrierDecisionList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_MCarrierDecisionList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_MCarrierDecisionList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_MCarrierDecisionListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_MCarrierDecisionList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_MCarrierDecisionList", pm); }

    public Map<String, MCustomerPickingCQ> xdfgetSalesOrgId_QueryDerivedReferrer_MCustomerPickingList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_MCustomerPickingList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_MCustomerPickingList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_MCustomerPickingListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_MCustomerPickingList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_MCustomerPickingList", pm); }

    public Map<String, MDepositProductCQ> xdfgetSalesOrgId_QueryDerivedReferrer_MDepositProductList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_MDepositProductList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_MDepositProductList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_MDepositProductListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_MDepositProductList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MDepositProductListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_MDepositProductList", pm); }

    public Map<String, MKoguchiDeliveryCQ> xdfgetSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList", pm); }

    public Map<String, TInventoryBCQ> xdfgetSalesOrgId_QueryDerivedReferrer_TInventoryBList() { return xgetSQueMap("salesOrgId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq) { return xkeepSQue("salesOrgId_QueryDerivedReferrer_TInventoryBList", sq); }
    public Map<String, Object> xdfgetSalesOrgId_QueryDerivedReferrer_TInventoryBListParameter() { return xgetSQuePmMap("salesOrgId_QueryDerivedReferrer_TInventoryBList"); }
    public String keepSalesOrgId_QueryDerivedReferrer_TInventoryBListParameter(Object pm) { return xkeepSQuePm("salesOrgId_QueryDerivedReferrer_TInventoryBList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_SalesOrgId_Asc() { regOBA("SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_SalesOrgId_Desc() { regOBD("SALES_ORG_ID"); return this; }

    protected ConditionValue _salesOrgCd;
    public ConditionValue xdfgetSalesOrgCd()
    { if (_salesOrgCd == null) { _salesOrgCd = nCV(); }
      return _salesOrgCd; }
    protected ConditionValue xgetCValueSalesOrgCd() { return xdfgetSalesOrgCd(); }

    public Map<String, TShippingInstHCQ> xdfgetSalesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList() { return xgetSQueMap("salesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList"); }
    public String keepSalesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq) { return xkeepSQue("salesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetSalesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList() { return xgetSQueMap("salesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList"); }
    public String keepSalesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq) { return xkeepSQue("salesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetSalesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList() { return xgetSQueMap("salesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList"); }
    public String keepSalesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq) { return xkeepSQue("salesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList", sq); }

    public Map<String, TShippingInstHCQ> xdfgetSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList() { return xgetSQueMap("salesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList"); }
    public String keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq) { return xkeepSQue("salesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList", sq); }
    public Map<String, Object> xdfgetSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgListParameter() { return xgetSQuePmMap("salesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList"); }
    public String keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgListParameter(Object pm) { return xkeepSQuePm("salesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList", pm); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _purchaseOrgCd;
    public ConditionValue xdfgetPurchaseOrgCd()
    { if (_purchaseOrgCd == null) { _purchaseOrgCd = nCV(); }
      return _purchaseOrgCd; }
    protected ConditionValue xgetCValuePurchaseOrgCd() { return xdfgetPurchaseOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PurchaseOrgCd_Asc() { regOBA("PURCHASE_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PurchaseOrgCd_Desc() { regOBD("PURCHASE_ORG_CD"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_TenhanshaNm1_Asc() { regOBA("TENHANSHA_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaNm1_Desc() { regOBD("TENHANSHA_NM1"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_TenhanshaNm2_Asc() { regOBA("TENHANSHA_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaNm2_Desc() { regOBD("TENHANSHA_NM2"); return this; }

    protected ConditionValue _tenhanshaZipCd;
    public ConditionValue xdfgetTenhanshaZipCd()
    { if (_tenhanshaZipCd == null) { _tenhanshaZipCd = nCV(); }
      return _tenhanshaZipCd; }
    protected ConditionValue xgetCValueTenhanshaZipCd() { return xdfgetTenhanshaZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaZipCd_Asc() { regOBA("TENHANSHA_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaZipCd_Desc() { regOBD("TENHANSHA_ZIP_CD"); return this; }

    protected ConditionValue _tenhanshaPrefecture;
    public ConditionValue xdfgetTenhanshaPrefecture()
    { if (_tenhanshaPrefecture == null) { _tenhanshaPrefecture = nCV(); }
      return _tenhanshaPrefecture; }
    protected ConditionValue xgetCValueTenhanshaPrefecture() { return xdfgetTenhanshaPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaPrefecture_Asc() { regOBA("TENHANSHA_PREFECTURE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaPrefecture_Desc() { regOBD("TENHANSHA_PREFECTURE"); return this; }

    protected ConditionValue _tenhanshaAddress1;
    public ConditionValue xdfgetTenhanshaAddress1()
    { if (_tenhanshaAddress1 == null) { _tenhanshaAddress1 = nCV(); }
      return _tenhanshaAddress1; }
    protected ConditionValue xgetCValueTenhanshaAddress1() { return xdfgetTenhanshaAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaAddress1_Asc() { regOBA("TENHANSHA_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaAddress1_Desc() { regOBD("TENHANSHA_ADDRESS1"); return this; }

    protected ConditionValue _tenhanshaAddress2;
    public ConditionValue xdfgetTenhanshaAddress2()
    { if (_tenhanshaAddress2 == null) { _tenhanshaAddress2 = nCV(); }
      return _tenhanshaAddress2; }
    protected ConditionValue xgetCValueTenhanshaAddress2() { return xdfgetTenhanshaAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaAddress2_Asc() { regOBA("TENHANSHA_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaAddress2_Desc() { regOBD("TENHANSHA_ADDRESS2"); return this; }

    protected ConditionValue _tenhanshaTelNo;
    public ConditionValue xdfgetTenhanshaTelNo()
    { if (_tenhanshaTelNo == null) { _tenhanshaTelNo = nCV(); }
      return _tenhanshaTelNo; }
    protected ConditionValue xgetCValueTenhanshaTelNo() { return xdfgetTenhanshaTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaTelNo_Asc() { regOBA("TENHANSHA_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaTelNo_Desc() { regOBD("TENHANSHA_TEL_NO"); return this; }

    protected ConditionValue _tenhanshaFaxNo;
    public ConditionValue xdfgetTenhanshaFaxNo()
    { if (_tenhanshaFaxNo == null) { _tenhanshaFaxNo = nCV(); }
      return _tenhanshaFaxNo; }
    protected ConditionValue xgetCValueTenhanshaFaxNo() { return xdfgetTenhanshaFaxNo(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaFaxNo_Asc() { regOBA("TENHANSHA_FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_TenhanshaFaxNo_Desc() { regOBD("TENHANSHA_FAX_NO"); return this; }

    protected ConditionValue _plantNormal;
    public ConditionValue xdfgetPlantNormal()
    { if (_plantNormal == null) { _plantNormal = nCV(); }
      return _plantNormal; }
    protected ConditionValue xgetCValuePlantNormal() { return xdfgetPlantNormal(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PlantNormal_Asc() { regOBA("PLANT_NORMAL"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PlantNormal_Desc() { regOBD("PLANT_NORMAL"); return this; }

    protected ConditionValue _plantDeposit;
    public ConditionValue xdfgetPlantDeposit()
    { if (_plantDeposit == null) { _plantDeposit = nCV(); }
      return _plantDeposit; }
    protected ConditionValue xgetCValuePlantDeposit() { return xdfgetPlantDeposit(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PlantDeposit_Asc() { regOBA("PLANT_DEPOSIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_PlantDeposit_Desc() { regOBD("PLANT_DEPOSIT"); return this; }

    protected ConditionValue _lpSendFlg;
    public ConditionValue xdfgetLpSendFlg()
    { if (_lpSendFlg == null) { _lpSendFlg = nCV(); }
      return _lpSendFlg; }
    protected ConditionValue xgetCValueLpSendFlg() { return xdfgetLpSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

    protected ConditionValue _wmsSendFlg;
    public ConditionValue xdfgetWmsSendFlg()
    { if (_wmsSendFlg == null) { _wmsSendFlg = nCV(); }
      return _wmsSendFlg; }
    protected ConditionValue xgetCValueWmsSendFlg() { return xdfgetWmsSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_WmsSendFlg_Asc() { regOBA("WMS_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_WmsSendFlg_Desc() { regOBD("WMS_SEND_FLG"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMSalesOrgCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMSalesOrgCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMSalesOrgCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMSalesOrgCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, MSalesOrgCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MSalesOrgCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MSalesOrgCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MSalesOrgCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MSalesOrgCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MSalesOrgCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MSalesOrgCQ> _myselfExistsMap;
    public Map<String, MSalesOrgCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MSalesOrgCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MSalesOrgCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MSalesOrgCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MSalesOrgCB.class.getName(); }
    protected String xCQ() { return MSalesOrgCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
