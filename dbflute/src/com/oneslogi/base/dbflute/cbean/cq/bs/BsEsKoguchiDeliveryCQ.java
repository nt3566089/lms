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
 * The base condition-query of es_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public class BsEsKoguchiDeliveryCQ extends AbstractBsEsKoguchiDeliveryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EsKoguchiDeliveryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEsKoguchiDeliveryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from es_koguchi_delivery) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EsKoguchiDeliveryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EsKoguchiDeliveryCIQ xcreateCIQ() {
        EsKoguchiDeliveryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EsKoguchiDeliveryCIQ xnewCIQ() {
        return new EsKoguchiDeliveryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join es_koguchi_delivery on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EsKoguchiDeliveryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EsKoguchiDeliveryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * KOGUCHI_DELIVERY_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryId_Asc() { regOBA("KOGUCHI_DELIVERY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryId_Desc() { regOBD("KOGUCHI_DELIVERY_ID"); return this; }

    protected ConditionValue _sendFlg;
    public ConditionValue xdfgetSendFlg()
    { if (_sendFlg == null) { _sendFlg = nCV(); }
      return _sendFlg; }
    protected ConditionValue xgetCValueSendFlg() { return xdfgetSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ServSalesOrgCd_Asc() { regOBA("SERV_SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERV_SALES_ORG_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ServSalesOrgCd_Desc() { regOBD("SERV_SALES_ORG_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ServSalesOrgNm_Asc() { regOBA("SERV_SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERV_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ServSalesOrgNm_Desc() { regOBD("SERV_SALES_ORG_NM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_DirectFlg_Asc() { regOBA("DIRECT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_DirectFlg_Desc() { regOBD("DIRECT_FLG"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UrgentFlg_Asc() { regOBA("URGENT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * URGENT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UrgentFlg_Desc() { regOBD("URGENT_FLG"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_DeliveryFlg_Asc() { regOBA("DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_DeliveryFlg_Desc() { regOBD("DELIVERY_FLG"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryCd_Asc() { regOBA("KOGUCHI_DELIVERY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryCd_Desc() { regOBD("KOGUCHI_DELIVERY_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryNm_Asc() { regOBA("KOGUCHI_DELIVERY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_KoguchiDeliveryNm_Desc() { regOBD("KOGUCHI_DELIVERY_NM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UniDeliveryCd_Asc() { regOBA("UNI_DELIVERY_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNI_DELIVERY_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UniDeliveryCd_Desc() { regOBD("UNI_DELIVERY_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UniDeliveryNm_Asc() { regOBA("UNI_DELIVERY_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNI_DELIVERY_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UniDeliveryNm_Desc() { regOBD("UNI_DELIVERY_NM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_FwTypeCd_Asc() { regOBA("FW_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * FW_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_FwTypeCd_Desc() { regOBD("FW_TYPE_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_McaTypeCd_Asc() { regOBA("MCA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MCA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_McaTypeCd_Desc() { regOBD("MCA_TYPE_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_YouhinTypeCd_Asc() { regOBA("YOUHIN_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * YOUHIN_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_YouhinTypeCd_Desc() { regOBD("YOUHIN_TYPE_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgCd_Asc() { regOBA("REQ_SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgCd_Desc() { regOBD("REQ_SALES_ORG_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgNm_Asc() { regOBA("REQ_SALES_ORG_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgNm_Desc() { regOBD("REQ_SALES_ORG_NM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgBranchNm_Asc() { regOBA("REQ_SALES_ORG_BRANCH_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgBranchNm_Desc() { regOBD("REQ_SALES_ORG_BRANCH_NM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress1_Asc() { regOBA("REQ_SALES_ORG_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress1_Desc() { regOBD("REQ_SALES_ORG_ADDRESS1"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress2_Asc() { regOBA("REQ_SALES_ORG_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgAddress2_Desc() { regOBD("REQ_SALES_ORG_ADDRESS2"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgZipCd_Asc() { regOBA("REQ_SALES_ORG_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgZipCd_Desc() { regOBD("REQ_SALES_ORG_ZIP_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgTelNo_Asc() { regOBA("REQ_SALES_ORG_TEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgTelNo_Desc() { regOBD("REQ_SALES_ORG_TEL_NO"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgFaxNo_Asc() { regOBA("REQ_SALES_ORG_FAX_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ReqSalesOrgFaxNo_Desc() { regOBD("REQ_SALES_ORG_FAX_NO"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark1_Asc() { regOBA("REMARK1"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark1_Desc() { regOBD("REMARK1"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark2_Asc() { regOBA("REMARK2"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark2_Desc() { regOBD("REMARK2"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark3_Asc() { regOBA("REMARK3"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK3: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark3_Desc() { regOBD("REMARK3"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark4_Asc() { regOBA("REMARK4"); return this; }

    /**
     * Add order-by as descend. <br>
     * REMARK4: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_Remark4_Desc() { regOBD("REMARK4"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_IndvOut_Asc() { regOBA("INDV_OUT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_OUT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_IndvOut_Desc() { regOBD("INDV_OUT"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_InvoiceSummary_Asc() { regOBA("INVOICE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_InvoiceSummary_Desc() { regOBD("INVOICE_SUMMARY"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_Psam_Asc() { regOBA("PSAM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PSAM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_Psam_Desc() { regOBD("PSAM"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_AbolishDt_Asc() { regOBA("ABOLISH_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ABOLISH_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_AbolishDt_Desc() { regOBD("ABOLISH_DT"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_FloorCompFlg_Asc() { regOBA("FLOOR_COMP_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_FloorCompFlg_Desc() { regOBD("FLOOR_COMP_FLG"); return this; }

    protected ConditionValue _sapAddYyyy;
    public ConditionValue xdfgetSapAddYyyy()
    { if (_sapAddYyyy == null) { _sapAddYyyy = nCV(); }
      return _sapAddYyyy; }
    protected ConditionValue xgetCValueSapAddYyyy() { return xdfgetSapAddYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

    protected ConditionValue _sapAddMm;
    public ConditionValue xdfgetSapAddMm()
    { if (_sapAddMm == null) { _sapAddMm = nCV(); }
      return _sapAddMm; }
    protected ConditionValue xgetCValueSapAddMm() { return xdfgetSapAddMm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

    protected ConditionValue _sapAddDd;
    public ConditionValue xdfgetSapAddDd()
    { if (_sapAddDd == null) { _sapAddDd = nCV(); }
      return _sapAddDd; }
    protected ConditionValue xgetCValueSapAddDd() { return xdfgetSapAddDd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

    protected ConditionValue _sapAddHh;
    public ConditionValue xdfgetSapAddHh()
    { if (_sapAddHh == null) { _sapAddHh = nCV(); }
      return _sapAddHh; }
    protected ConditionValue xgetCValueSapAddHh() { return xdfgetSapAddHh(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

    protected ConditionValue _sapAddMi;
    public ConditionValue xdfgetSapAddMi()
    { if (_sapAddMi == null) { _sapAddMi = nCV(); }
      return _sapAddMi; }
    protected ConditionValue xgetCValueSapAddMi() { return xdfgetSapAddMi(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

    protected ConditionValue _sapAddSs;
    public ConditionValue xdfgetSapAddSs()
    { if (_sapAddSs == null) { _sapAddSs = nCV(); }
      return _sapAddSs; }
    protected ConditionValue xgetCValueSapAddSs() { return xdfgetSapAddSs(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

    protected ConditionValue _sapAddUserCd;
    public ConditionValue xdfgetSapAddUserCd()
    { if (_sapAddUserCd == null) { _sapAddUserCd = nCV(); }
      return _sapAddUserCd; }
    protected ConditionValue xgetCValueSapAddUserCd() { return xdfgetSapAddUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddUserCd_Asc() { regOBA("SAP_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapAddUserCd_Desc() { regOBD("SAP_ADD_USER_CD"); return this; }

    protected ConditionValue _sapUpdYyyy;
    public ConditionValue xdfgetSapUpdYyyy()
    { if (_sapUpdYyyy == null) { _sapUpdYyyy = nCV(); }
      return _sapUpdYyyy; }
    protected ConditionValue xgetCValueSapUpdYyyy() { return xdfgetSapUpdYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

    protected ConditionValue _sapUpdMm;
    public ConditionValue xdfgetSapUpdMm()
    { if (_sapUpdMm == null) { _sapUpdMm = nCV(); }
      return _sapUpdMm; }
    protected ConditionValue xgetCValueSapUpdMm() { return xdfgetSapUpdMm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

    protected ConditionValue _sapUpdDd;
    public ConditionValue xdfgetSapUpdDd()
    { if (_sapUpdDd == null) { _sapUpdDd = nCV(); }
      return _sapUpdDd; }
    protected ConditionValue xgetCValueSapUpdDd() { return xdfgetSapUpdDd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

    protected ConditionValue _sapUpdHh;
    public ConditionValue xdfgetSapUpdHh()
    { if (_sapUpdHh == null) { _sapUpdHh = nCV(); }
      return _sapUpdHh; }
    protected ConditionValue xgetCValueSapUpdHh() { return xdfgetSapUpdHh(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

    protected ConditionValue _sapUpdMi;
    public ConditionValue xdfgetSapUpdMi()
    { if (_sapUpdMi == null) { _sapUpdMi = nCV(); }
      return _sapUpdMi; }
    protected ConditionValue xgetCValueSapUpdMi() { return xdfgetSapUpdMi(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

    protected ConditionValue _sapUpdSs;
    public ConditionValue xdfgetSapUpdSs()
    { if (_sapUpdSs == null) { _sapUpdSs = nCV(); }
      return _sapUpdSs; }
    protected ConditionValue xgetCValueSapUpdSs() { return xdfgetSapUpdSs(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

    protected ConditionValue _sapUpdUserCd;
    public ConditionValue xdfgetSapUpdUserCd()
    { if (_sapUpdUserCd == null) { _sapUpdUserCd = nCV(); }
      return _sapUpdUserCd; }
    protected ConditionValue xgetCValueSapUpdUserCd() { return xdfgetSapUpdUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdUserCd_Asc() { regOBA("SAP_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SapUpdUserCd_Desc() { regOBD("SAP_UPD_USER_CD"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsKoguchiDeliveryCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEsKoguchiDeliveryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEsKoguchiDeliveryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EsKoguchiDeliveryCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EsKoguchiDeliveryCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EsKoguchiDeliveryCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EsKoguchiDeliveryCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EsKoguchiDeliveryCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EsKoguchiDeliveryCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EsKoguchiDeliveryCQ> _myselfExistsMap;
    public Map<String, EsKoguchiDeliveryCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EsKoguchiDeliveryCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EsKoguchiDeliveryCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EsKoguchiDeliveryCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EsKoguchiDeliveryCB.class.getName(); }
    protected String xCQ() { return EsKoguchiDeliveryCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
