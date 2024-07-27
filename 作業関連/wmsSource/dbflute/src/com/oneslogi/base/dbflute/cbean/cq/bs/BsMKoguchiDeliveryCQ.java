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
 * The base condition-query of m_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public class BsMKoguchiDeliveryCQ extends AbstractBsMKoguchiDeliveryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MKoguchiDeliveryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMKoguchiDeliveryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_koguchi_delivery) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MKoguchiDeliveryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MKoguchiDeliveryCIQ xcreateCIQ() {
        MKoguchiDeliveryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MKoguchiDeliveryCIQ xnewCIQ() {
        return new MKoguchiDeliveryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_koguchi_delivery on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MKoguchiDeliveryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MKoguchiDeliveryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _koguchiDeliveryId;
    public ConditionValue xdfgetKoguchiDeliveryId()
    { if (_koguchiDeliveryId == null) { _koguchiDeliveryId = nCV(); }
      return _koguchiDeliveryId; }
    protected ConditionValue xgetCValueKoguchiDeliveryId() { return xdfgetKoguchiDeliveryId(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryId_Asc() { regOBA("KOGUCHI_DELIVERY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryId_Desc() { regOBD("KOGUCHI_DELIVERY_ID"); return this; }

    protected ConditionValue _baseCd;
    public ConditionValue xdfgetBaseCd()
    { if (_baseCd == null) { _baseCd = nCV(); }
      return _baseCd; }
    protected ConditionValue xgetCValueBaseCd() { return xdfgetBaseCd(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

    protected ConditionValue _servSalesOrgId;
    public ConditionValue xdfgetServSalesOrgId()
    { if (_servSalesOrgId == null) { _servSalesOrgId = nCV(); }
      return _servSalesOrgId; }
    protected ConditionValue xgetCValueServSalesOrgId() { return xdfgetServSalesOrgId(); }

    public Map<String, MSalesOrgCQ> getServSalesOrgId_InScopeRelation_MSalesOrg() { return xgetSQueMap("servSalesOrgId_InScopeRelation_MSalesOrg"); }
    public String keepServSalesOrgId_InScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("servSalesOrgId_InScopeRelation_MSalesOrg", sq); }

    public Map<String, MSalesOrgCQ> getServSalesOrgId_NotInScopeRelation_MSalesOrg() { return xgetSQueMap("servSalesOrgId_NotInScopeRelation_MSalesOrg"); }
    public String keepServSalesOrgId_NotInScopeRelation_MSalesOrg(MSalesOrgCQ sq) { return xkeepSQue("servSalesOrgId_NotInScopeRelation_MSalesOrg", sq); }

    /**
     * Add order-by as ascend. <br>
     * SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgId_Asc() { regOBA("SERV_SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgId_Desc() { regOBD("SERV_SALES_ORG_ID"); return this; }

    protected ConditionValue _servSalesOrgCd;
    public ConditionValue xdfgetServSalesOrgCd()
    { if (_servSalesOrgCd == null) { _servSalesOrgCd = nCV(); }
      return _servSalesOrgCd; }
    protected ConditionValue xgetCValueServSalesOrgCd() { return xdfgetServSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgCd_Asc() { regOBA("SERV_SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgCd_Desc() { regOBD("SERV_SALES_ORG_CD"); return this; }

    protected ConditionValue _servSalesOrgNm;
    public ConditionValue xdfgetServSalesOrgNm()
    { if (_servSalesOrgNm == null) { _servSalesOrgNm = nCV(); }
      return _servSalesOrgNm; }
    protected ConditionValue xgetCValueServSalesOrgNm() { return xdfgetServSalesOrgNm(); }

    /**
     * Add order-by as ascend. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgNm_Asc() { regOBA("SERV_SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ServSalesOrgNm_Desc() { regOBD("SERV_SALES_ORG_NM"); return this; }

    protected ConditionValue _directFlg;
    public ConditionValue xdfgetDirectFlg()
    { if (_directFlg == null) { _directFlg = nCV(); }
      return _directFlg; }
    protected ConditionValue xgetCValueDirectFlg() { return xdfgetDirectFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_DirectFlg_Asc() { regOBA("DIRECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_DirectFlg_Desc() { regOBD("DIRECT_FLG"); return this; }

    protected ConditionValue _urgentFlg;
    public ConditionValue xdfgetUrgentFlg()
    { if (_urgentFlg == null) { _urgentFlg = nCV(); }
      return _urgentFlg; }
    protected ConditionValue xgetCValueUrgentFlg() { return xdfgetUrgentFlg(); }

    /**
     * Add order-by as ascend. <br>
     * URGENT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UrgentFlg_Asc() { regOBA("URGENT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * URGENT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UrgentFlg_Desc() { regOBD("URGENT_FLG"); return this; }

    protected ConditionValue _deliveryFlg;
    public ConditionValue xdfgetDeliveryFlg()
    { if (_deliveryFlg == null) { _deliveryFlg = nCV(); }
      return _deliveryFlg; }
    protected ConditionValue xgetCValueDeliveryFlg() { return xdfgetDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_DeliveryFlg_Asc() { regOBA("DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_DeliveryFlg_Desc() { regOBD("DELIVERY_FLG"); return this; }

    protected ConditionValue _koguchiDeliveryCd;
    public ConditionValue xdfgetKoguchiDeliveryCd()
    { if (_koguchiDeliveryCd == null) { _koguchiDeliveryCd = nCV(); }
      return _koguchiDeliveryCd; }
    protected ConditionValue xgetCValueKoguchiDeliveryCd() { return xdfgetKoguchiDeliveryCd(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryCd_Asc() { regOBA("KOGUCHI_DELIVERY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryCd_Desc() { regOBD("KOGUCHI_DELIVERY_CD"); return this; }

    protected ConditionValue _koguchiDeliveryNm;
    public ConditionValue xdfgetKoguchiDeliveryNm()
    { if (_koguchiDeliveryNm == null) { _koguchiDeliveryNm = nCV(); }
      return _koguchiDeliveryNm; }
    protected ConditionValue xgetCValueKoguchiDeliveryNm() { return xdfgetKoguchiDeliveryNm(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryNm_Asc() { regOBA("KOGUCHI_DELIVERY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryNm_Desc() { regOBD("KOGUCHI_DELIVERY_NM"); return this; }

    protected ConditionValue _uniDeliveryCd;
    public ConditionValue xdfgetUniDeliveryCd()
    { if (_uniDeliveryCd == null) { _uniDeliveryCd = nCV(); }
      return _uniDeliveryCd; }
    protected ConditionValue xgetCValueUniDeliveryCd() { return xdfgetUniDeliveryCd(); }

    /**
     * Add order-by as ascend. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UniDeliveryCd_Asc() { regOBA("UNI_DELIVERY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UniDeliveryCd_Desc() { regOBD("UNI_DELIVERY_CD"); return this; }

    protected ConditionValue _uniDeliveryNm;
    public ConditionValue xdfgetUniDeliveryNm()
    { if (_uniDeliveryNm == null) { _uniDeliveryNm = nCV(); }
      return _uniDeliveryNm; }
    protected ConditionValue xgetCValueUniDeliveryNm() { return xdfgetUniDeliveryNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UniDeliveryNm_Asc() { regOBA("UNI_DELIVERY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UniDeliveryNm_Desc() { regOBD("UNI_DELIVERY_NM"); return this; }

    protected ConditionValue _fwTypeCd;
    public ConditionValue xdfgetFwTypeCd()
    { if (_fwTypeCd == null) { _fwTypeCd = nCV(); }
      return _fwTypeCd; }
    protected ConditionValue xgetCValueFwTypeCd() { return xdfgetFwTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_FwTypeCd_Asc() { regOBA("FW_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_FwTypeCd_Desc() { regOBD("FW_TYPE_CD"); return this; }

    protected ConditionValue _mcaTypeCd;
    public ConditionValue xdfgetMcaTypeCd()
    { if (_mcaTypeCd == null) { _mcaTypeCd = nCV(); }
      return _mcaTypeCd; }
    protected ConditionValue xgetCValueMcaTypeCd() { return xdfgetMcaTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_McaTypeCd_Asc() { regOBA("MCA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_McaTypeCd_Desc() { regOBD("MCA_TYPE_CD"); return this; }

    protected ConditionValue _youhinTypeCd;
    public ConditionValue xdfgetYouhinTypeCd()
    { if (_youhinTypeCd == null) { _youhinTypeCd = nCV(); }
      return _youhinTypeCd; }
    protected ConditionValue xgetCValueYouhinTypeCd() { return xdfgetYouhinTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_YouhinTypeCd_Asc() { regOBA("YOUHIN_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_YouhinTypeCd_Desc() { regOBD("YOUHIN_TYPE_CD"); return this; }

    protected ConditionValue _carrierId;
    public ConditionValue xdfgetCarrierId()
    { if (_carrierId == null) { _carrierId = nCV(); }
      return _carrierId; }
    protected ConditionValue xgetCValueCarrierId() { return xdfgetCarrierId(); }

    public Map<String, MCarrierCQ> getCarrierId_InScopeRelation_MCarrier() { return xgetSQueMap("carrierId_InScopeRelation_MCarrier"); }
    public String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_InScopeRelation_MCarrier", sq); }

    public Map<String, MCarrierCQ> getCarrierId_NotInScopeRelation_MCarrier() { return xgetSQueMap("carrierId_NotInScopeRelation_MCarrier"); }
    public String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq) { return xkeepSQue("carrierId_NotInScopeRelation_MCarrier", sq); }

    /**
     * Add order-by as ascend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_CarrierId_Asc() { regOBA("CARRIER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_CarrierId_Desc() { regOBD("CARRIER_ID"); return this; }

    protected ConditionValue _reqSalesOrgId;
    public ConditionValue xdfgetReqSalesOrgId()
    { if (_reqSalesOrgId == null) { _reqSalesOrgId = nCV(); }
      return _reqSalesOrgId; }
    protected ConditionValue xgetCValueReqSalesOrgId() { return xdfgetReqSalesOrgId(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgId_Asc() { regOBA("REQ_SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgId_Desc() { regOBD("REQ_SALES_ORG_ID"); return this; }

    protected ConditionValue _reqSalesOrgCd;
    public ConditionValue xdfgetReqSalesOrgCd()
    { if (_reqSalesOrgCd == null) { _reqSalesOrgCd = nCV(); }
      return _reqSalesOrgCd; }
    protected ConditionValue xgetCValueReqSalesOrgCd() { return xdfgetReqSalesOrgCd(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgCd_Asc() { regOBA("REQ_SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgCd_Desc() { regOBD("REQ_SALES_ORG_CD"); return this; }

    protected ConditionValue _reqSalesOrgNm;
    public ConditionValue xdfgetReqSalesOrgNm()
    { if (_reqSalesOrgNm == null) { _reqSalesOrgNm = nCV(); }
      return _reqSalesOrgNm; }
    protected ConditionValue xgetCValueReqSalesOrgNm() { return xdfgetReqSalesOrgNm(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgNm_Asc() { regOBA("REQ_SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgNm_Desc() { regOBD("REQ_SALES_ORG_NM"); return this; }

    protected ConditionValue _reqSalesOrgBranchNm;
    public ConditionValue xdfgetReqSalesOrgBranchNm()
    { if (_reqSalesOrgBranchNm == null) { _reqSalesOrgBranchNm = nCV(); }
      return _reqSalesOrgBranchNm; }
    protected ConditionValue xgetCValueReqSalesOrgBranchNm() { return xdfgetReqSalesOrgBranchNm(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgBranchNm_Asc() { regOBA("REQ_SALES_ORG_BRANCH_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgBranchNm_Desc() { regOBD("REQ_SALES_ORG_BRANCH_NM"); return this; }

    protected ConditionValue _reqSalesOrgAddress1;
    public ConditionValue xdfgetReqSalesOrgAddress1()
    { if (_reqSalesOrgAddress1 == null) { _reqSalesOrgAddress1 = nCV(); }
      return _reqSalesOrgAddress1; }
    protected ConditionValue xgetCValueReqSalesOrgAddress1() { return xdfgetReqSalesOrgAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress1_Asc() { regOBA("REQ_SALES_ORG_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress1_Desc() { regOBD("REQ_SALES_ORG_ADDRESS1"); return this; }

    protected ConditionValue _reqSalesOrgAddress2;
    public ConditionValue xdfgetReqSalesOrgAddress2()
    { if (_reqSalesOrgAddress2 == null) { _reqSalesOrgAddress2 = nCV(); }
      return _reqSalesOrgAddress2; }
    protected ConditionValue xgetCValueReqSalesOrgAddress2() { return xdfgetReqSalesOrgAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress2_Asc() { regOBA("REQ_SALES_ORG_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress2_Desc() { regOBD("REQ_SALES_ORG_ADDRESS2"); return this; }

    protected ConditionValue _reqSalesOrgZipCd;
    public ConditionValue xdfgetReqSalesOrgZipCd()
    { if (_reqSalesOrgZipCd == null) { _reqSalesOrgZipCd = nCV(); }
      return _reqSalesOrgZipCd; }
    protected ConditionValue xgetCValueReqSalesOrgZipCd() { return xdfgetReqSalesOrgZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgZipCd_Asc() { regOBA("REQ_SALES_ORG_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgZipCd_Desc() { regOBD("REQ_SALES_ORG_ZIP_CD"); return this; }

    protected ConditionValue _reqSalesOrgTelNo;
    public ConditionValue xdfgetReqSalesOrgTelNo()
    { if (_reqSalesOrgTelNo == null) { _reqSalesOrgTelNo = nCV(); }
      return _reqSalesOrgTelNo; }
    protected ConditionValue xgetCValueReqSalesOrgTelNo() { return xdfgetReqSalesOrgTelNo(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgTelNo_Asc() { regOBA("REQ_SALES_ORG_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgTelNo_Desc() { regOBD("REQ_SALES_ORG_TEL_NO"); return this; }

    protected ConditionValue _reqSalesOrgFaxNo;
    public ConditionValue xdfgetReqSalesOrgFaxNo()
    { if (_reqSalesOrgFaxNo == null) { _reqSalesOrgFaxNo = nCV(); }
      return _reqSalesOrgFaxNo; }
    protected ConditionValue xgetCValueReqSalesOrgFaxNo() { return xdfgetReqSalesOrgFaxNo(); }

    /**
     * Add order-by as ascend. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgFaxNo_Asc() { regOBA("REQ_SALES_ORG_FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ReqSalesOrgFaxNo_Desc() { regOBD("REQ_SALES_ORG_FAX_NO"); return this; }

    protected ConditionValue _remark1;
    public ConditionValue xdfgetRemark1()
    { if (_remark1 == null) { _remark1 = nCV(); }
      return _remark1; }
    protected ConditionValue xgetCValueRemark1() { return xdfgetRemark1(); }

    /**
     * Add order-by as ascend. <br>
     * REMARK1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark1_Asc() { regOBA("REMARK1"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark1_Desc() { regOBD("REMARK1"); return this; }

    protected ConditionValue _remark2;
    public ConditionValue xdfgetRemark2()
    { if (_remark2 == null) { _remark2 = nCV(); }
      return _remark2; }
    protected ConditionValue xgetCValueRemark2() { return xdfgetRemark2(); }

    /**
     * Add order-by as ascend. <br>
     * REMARK2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark2_Asc() { regOBA("REMARK2"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark2_Desc() { regOBD("REMARK2"); return this; }

    protected ConditionValue _remark3;
    public ConditionValue xdfgetRemark3()
    { if (_remark3 == null) { _remark3 = nCV(); }
      return _remark3; }
    protected ConditionValue xgetCValueRemark3() { return xdfgetRemark3(); }

    /**
     * Add order-by as ascend. <br>
     * REMARK3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark3_Asc() { regOBA("REMARK3"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark3_Desc() { regOBD("REMARK3"); return this; }

    protected ConditionValue _remark4;
    public ConditionValue xdfgetRemark4()
    { if (_remark4 == null) { _remark4 = nCV(); }
      return _remark4; }
    protected ConditionValue xgetCValueRemark4() { return xdfgetRemark4(); }

    /**
     * Add order-by as ascend. <br>
     * REMARK4: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark4_Asc() { regOBA("REMARK4"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK4: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Remark4_Desc() { regOBD("REMARK4"); return this; }

    protected ConditionValue _indvOut;
    public ConditionValue xdfgetIndvOut()
    { if (_indvOut == null) { _indvOut = nCV(); }
      return _indvOut; }
    protected ConditionValue xgetCValueIndvOut() { return xdfgetIndvOut(); }

    /**
     * Add order-by as ascend. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_IndvOut_Asc() { regOBA("INDV_OUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_IndvOut_Desc() { regOBD("INDV_OUT"); return this; }

    protected ConditionValue _invoiceSummary;
    public ConditionValue xdfgetInvoiceSummary()
    { if (_invoiceSummary == null) { _invoiceSummary = nCV(); }
      return _invoiceSummary; }
    protected ConditionValue xgetCValueInvoiceSummary() { return xdfgetInvoiceSummary(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_InvoiceSummary_Asc() { regOBA("INVOICE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_InvoiceSummary_Desc() { regOBD("INVOICE_SUMMARY"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_Psam_Asc() { regOBA("PSAM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSAM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_Psam_Desc() { regOBD("PSAM"); return this; }

    protected ConditionValue _abolishDt;
    public ConditionValue xdfgetAbolishDt()
    { if (_abolishDt == null) { _abolishDt = nCV(); }
      return _abolishDt; }
    protected ConditionValue xgetCValueAbolishDt() { return xdfgetAbolishDt(); }

    /**
     * Add order-by as ascend. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_AbolishDt_Asc() { regOBA("ABOLISH_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_AbolishDt_Desc() { regOBD("ABOLISH_DT"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_FloorCompFlg_Asc() { regOBA("FLOOR_COMP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_FloorCompFlg_Desc() { regOBD("FLOOR_COMP_FLG"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMKoguchiDeliveryCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMKoguchiDeliveryCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMKoguchiDeliveryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMKoguchiDeliveryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MKoguchiDeliveryCQ bq = (MKoguchiDeliveryCQ)bqs;
        MKoguchiDeliveryCQ uq = (MKoguchiDeliveryCQ)uqs;
        if (bq.hasConditionQueryMSalesOrg()) {
            uq.queryMSalesOrg().reflectRelationOnUnionQuery(bq.queryMSalesOrg(), uq.queryMSalesOrg());
        }
        if (bq.hasConditionQueryMCarrier()) {
            uq.queryMCarrier().reflectRelationOnUnionQuery(bq.queryMCarrier(), uq.queryMCarrier());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_sales_org by my SERV_SALES_ORG_ID, named 'MSalesOrg'.
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
        String nrp = xresolveNRP("m_koguchi_delivery", "mSalesOrg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MSalesOrgCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mSalesOrg", nrp);
    }
    protected void xsetupOuterJoinMSalesOrg() { xregOutJo("mSalesOrg"); }
    public boolean hasConditionQueryMSalesOrg() { return xhasQueRlMap("mSalesOrg"); }

    /**
     * Get the condition-query for relation table. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCarrierCQ queryMCarrier() {
        return xdfgetConditionQueryMCarrier();
    }
    public MCarrierCQ xdfgetConditionQueryMCarrier() {
        String prop = "mCarrier";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCarrier()); xsetupOuterJoinMCarrier(); }
        return xgetQueRlMap(prop);
    }
    protected MCarrierCQ xcreateQueryMCarrier() {
        String nrp = xresolveNRP("m_koguchi_delivery", "mCarrier"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCarrierCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCarrier", nrp);
    }
    protected void xsetupOuterJoinMCarrier() { xregOutJo("mCarrier"); }
    public boolean hasConditionQueryMCarrier() { return xhasQueRlMap("mCarrier"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MKoguchiDeliveryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MKoguchiDeliveryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MKoguchiDeliveryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MKoguchiDeliveryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MKoguchiDeliveryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MKoguchiDeliveryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MKoguchiDeliveryCQ> _myselfExistsMap;
    public Map<String, MKoguchiDeliveryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MKoguchiDeliveryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MKoguchiDeliveryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MKoguchiDeliveryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MKoguchiDeliveryCB.class.getName(); }
    protected String xCQ() { return MKoguchiDeliveryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
