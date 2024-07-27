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
 * The base condition-query of es_shipping_inst.
 * @author DBFlute(AutoGenerator)
 */
public class BsEsShippingInstCQ extends AbstractBsEsShippingInstCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EsShippingInstCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEsShippingInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from es_shipping_inst) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EsShippingInstCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EsShippingInstCIQ xcreateCIQ() {
        EsShippingInstCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EsShippingInstCIQ xnewCIQ() {
        return new EsShippingInstCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join es_shipping_inst on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EsShippingInstCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EsShippingInstCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstId;
    public ConditionValue xdfgetShippingInstId()
    { if (_shippingInstId == null) { _shippingInstId = nCV(); }
      return _shippingInstId; }
    protected ConditionValue xgetCValueShippingInstId() { return xdfgetShippingInstId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingInstId_Asc() { regOBA("SHIPPING_INST_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingInstId_Desc() { regOBD("SHIPPING_INST_ID"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

    protected ConditionValue _shippingSlipNo;
    public ConditionValue xdfgetShippingSlipNo()
    { if (_shippingSlipNo == null) { _shippingSlipNo = nCV(); }
      return _shippingSlipNo; }
    protected ConditionValue xgetCValueShippingSlipNo() { return xdfgetShippingSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

    protected ConditionValue _shippingSlipRowNo;
    public ConditionValue xdfgetShippingSlipRowNo()
    { if (_shippingSlipRowNo == null) { _shippingSlipRowNo = nCV(); }
      return _shippingSlipRowNo; }
    protected ConditionValue xgetCValueShippingSlipRowNo() { return xdfgetShippingSlipRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingSlipRowNo_Asc() { regOBA("SHIPPING_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingSlipRowNo_Desc() { regOBD("SHIPPING_SLIP_ROW_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SalesOrderNo_Asc() { regOBA("SALES_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrderNo_Desc() { regOBD("SALES_ORDER_NO"); return this; }

    protected ConditionValue _hinmokuCd;
    public ConditionValue xdfgetHinmokuCd()
    { if (_hinmokuCd == null) { _hinmokuCd = nCV(); }
      return _hinmokuCd; }
    protected ConditionValue xgetCValueHinmokuCd() { return xdfgetHinmokuCd(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SalesOrderSlipTypeCd_Asc() { regOBA("SALES_ORDER_SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrderSlipTypeCd_Desc() { regOBD("SALES_ORDER_SLIP_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SalesOrderSlipNo_Asc() { regOBA("SALES_ORDER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrderSlipNo_Desc() { regOBD("SALES_ORDER_SLIP_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_ShippingTypeCd_Asc() { regOBA("SHIPPING_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingTypeCd_Desc() { regOBD("SHIPPING_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_ShippingReasonCd_Asc() { regOBA("SHIPPING_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingReasonCd_Desc() { regOBD("SHIPPING_REASON_CD"); return this; }

    protected ConditionValue _hinmokuGroup;
    public ConditionValue xdfgetHinmokuGroup()
    { if (_hinmokuGroup == null) { _hinmokuGroup = nCV(); }
      return _hinmokuGroup; }
    protected ConditionValue xgetCValueHinmokuGroup() { return xdfgetHinmokuGroup(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

    protected ConditionValue _shippingNum;
    public ConditionValue xdfgetShippingNum()
    { if (_shippingNum == null) { _shippingNum = nCV(); }
      return _shippingNum; }
    protected ConditionValue xgetCValueShippingNum() { return xdfgetShippingNum(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingNum_Asc() { regOBA("SHIPPING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingNum_Desc() { regOBD("SHIPPING_NUM"); return this; }

    protected ConditionValue _salesOrderNum;
    public ConditionValue xdfgetSalesOrderNum()
    { if (_salesOrderNum == null) { _salesOrderNum = nCV(); }
      return _salesOrderNum; }
    protected ConditionValue xgetCValueSalesOrderNum() { return xdfgetSalesOrderNum(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrderNum_Asc() { regOBA("SALES_ORDER_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrderNum_Desc() { regOBD("SALES_ORDER_NUM"); return this; }

    protected ConditionValue _hinmokuText;
    public ConditionValue xdfgetHinmokuText()
    { if (_hinmokuText == null) { _hinmokuText = nCV(); }
      return _hinmokuText; }
    protected ConditionValue xgetCValueHinmokuText() { return xdfgetHinmokuText(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

    protected ConditionValue _janCd;
    public ConditionValue xdfgetJanCd()
    { if (_janCd == null) { _janCd = nCV(); }
      return _janCd; }
    protected ConditionValue xgetCValueJanCd() { return xdfgetJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _ecUnitNm;
    public ConditionValue xdfgetEcUnitNm()
    { if (_ecUnitNm == null) { _ecUnitNm = nCV(); }
      return _ecUnitNm; }
    protected ConditionValue xgetCValueEcUnitNm() { return xdfgetEcUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcUnitNm_Asc() { regOBA("EC_UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcUnitNm_Desc() { regOBD("EC_UNIT_NM"); return this; }

    protected ConditionValue _sampleTypeCd;
    public ConditionValue xdfgetSampleTypeCd()
    { if (_sampleTypeCd == null) { _sampleTypeCd = nCV(); }
      return _sampleTypeCd; }
    protected ConditionValue xgetCValueSampleTypeCd() { return xdfgetSampleTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SampleTypeCd_Asc() { regOBA("SAMPLE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SampleTypeCd_Desc() { regOBD("SAMPLE_TYPE_CD"); return this; }

    protected ConditionValue _logiWeightFlg;
    public ConditionValue xdfgetLogiWeightFlg()
    { if (_logiWeightFlg == null) { _logiWeightFlg = nCV(); }
      return _logiWeightFlg; }
    protected ConditionValue xgetCValueLogiWeightFlg() { return xdfgetLogiWeightFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiWeightFlg_Asc() { regOBA("LOGI_WEIGHT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiWeightFlg_Desc() { regOBD("LOGI_WEIGHT_FLG"); return this; }

    protected ConditionValue _logiAttentionTypeCd;
    public ConditionValue xdfgetLogiAttentionTypeCd()
    { if (_logiAttentionTypeCd == null) { _logiAttentionTypeCd = nCV(); }
      return _logiAttentionTypeCd; }
    protected ConditionValue xgetCValueLogiAttentionTypeCd() { return xdfgetLogiAttentionTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

    protected ConditionValue _logiSpecialTypeCd;
    public ConditionValue xdfgetLogiSpecialTypeCd()
    { if (_logiSpecialTypeCd == null) { _logiSpecialTypeCd = nCV(); }
      return _logiSpecialTypeCd; }
    protected ConditionValue xgetCValueLogiSpecialTypeCd() { return xdfgetLogiSpecialTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DirectDeliveryTypeCd_Asc() { regOBA("DIRECT_DELIVERY_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DirectDeliveryTypeCd_Desc() { regOBD("DIRECT_DELIVERY_TYPE_CD"); return this; }

    protected ConditionValue _koguchiDeliveryFlg;
    public ConditionValue xdfgetKoguchiDeliveryFlg()
    { if (_koguchiDeliveryFlg == null) { _koguchiDeliveryFlg = nCV(); }
      return _koguchiDeliveryFlg; }
    protected ConditionValue xgetCValueKoguchiDeliveryFlg() { return xdfgetKoguchiDeliveryFlg(); }

    /**
     * Add order-by as ascend. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KoguchiDeliveryFlg_Asc() { regOBA("KOGUCHI_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KoguchiDeliveryFlg_Desc() { regOBD("KOGUCHI_DELIVERY_FLG"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SplitDeliveryTypeCd_Asc() { regOBA("SPLIT_DELIVERY_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SplitDeliveryTypeCd_Desc() { regOBD("SPLIT_DELIVERY_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_CarrierTypeCd_Asc() { regOBA("CARRIER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CarrierTypeCd_Desc() { regOBD("CARRIER_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_CarrierCd_Asc() { regOBA("CARRIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CarrierCd_Desc() { regOBD("CARRIER_CD"); return this; }

    protected ConditionValue _expressCd;
    public ConditionValue xdfgetExpressCd()
    { if (_expressCd == null) { _expressCd = nCV(); }
      return _expressCd; }
    protected ConditionValue xgetCValueExpressCd() { return xdfgetExpressCd(); }

    /**
     * Add order-by as ascend. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ExpressCd_Asc() { regOBA("EXPRESS_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ExpressCd_Desc() { regOBD("EXPRESS_CD"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

    protected ConditionValue _specifyDeliveryDt;
    public ConditionValue xdfgetSpecifyDeliveryDt()
    { if (_specifyDeliveryDt == null) { _specifyDeliveryDt = nCV(); }
      return _specifyDeliveryDt; }
    protected ConditionValue xgetCValueSpecifyDeliveryDt() { return xdfgetSpecifyDeliveryDt(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SpecifyDeliveryDt_Asc() { regOBA("SPECIFY_DELIVERY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SpecifyDeliveryDt_Desc() { regOBD("SPECIFY_DELIVERY_DT"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SpecifyDeliveryTime_Asc() { regOBA("SPECIFY_DELIVERY_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SpecifyDeliveryTime_Desc() { regOBD("SPECIFY_DELIVERY_TIME"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_TenhanshaOrderNo_Asc() { regOBA("TENHANSHA_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_TenhanshaOrderNo_Desc() { regOBD("TENHANSHA_ORDER_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KohaiContractorCd_Asc() { regOBA("KOHAI_CONTRACTOR_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KohaiContractorCd_Desc() { regOBD("KOHAI_CONTRACTOR_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KohaiContractorNm_Asc() { regOBA("KOHAI_CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KohaiContractorNm_Desc() { regOBD("KOHAI_CONTRACTOR_NM"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DestinationCd_Asc() { regOBA("DESTINATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationCd_Desc() { regOBD("DESTINATION_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DestinationNmKana_Asc() { regOBA("DESTINATION_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationNmKana_Desc() { regOBD("DESTINATION_NM_KANA"); return this; }

    protected ConditionValue _destinationZipCd;
    public ConditionValue xdfgetDestinationZipCd()
    { if (_destinationZipCd == null) { _destinationZipCd = nCV(); }
      return _destinationZipCd; }
    protected ConditionValue xgetCValueDestinationZipCd() { return xdfgetDestinationZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationZipCd_Asc() { regOBA("DESTINATION_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationZipCd_Desc() { regOBD("DESTINATION_ZIP_CD"); return this; }

    protected ConditionValue _destinationAddress1;
    public ConditionValue xdfgetDestinationAddress1()
    { if (_destinationAddress1 == null) { _destinationAddress1 = nCV(); }
      return _destinationAddress1; }
    protected ConditionValue xgetCValueDestinationAddress1() { return xdfgetDestinationAddress1(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationAddress1_Asc() { regOBA("DESTINATION_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationAddress1_Desc() { regOBD("DESTINATION_ADDRESS1"); return this; }

    protected ConditionValue _destinationAddress2;
    public ConditionValue xdfgetDestinationAddress2()
    { if (_destinationAddress2 == null) { _destinationAddress2 = nCV(); }
      return _destinationAddress2; }
    protected ConditionValue xgetCValueDestinationAddress2() { return xdfgetDestinationAddress2(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationAddress2_Asc() { regOBA("DESTINATION_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationAddress2_Desc() { regOBD("DESTINATION_ADDRESS2"); return this; }

    protected ConditionValue _destinationTel;
    public ConditionValue xdfgetDestinationTel()
    { if (_destinationTel == null) { _destinationTel = nCV(); }
      return _destinationTel; }
    protected ConditionValue xgetCValueDestinationTel() { return xdfgetDestinationTel(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationTel_Asc() { regOBA("DESTINATION_TEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationTel_Desc() { regOBD("DESTINATION_TEL"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DestinationFax_Asc() { regOBA("DESTINATION_FAX"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DestinationFax_Desc() { regOBD("DESTINATION_FAX"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage1_Asc() { regOBA("KANJI_MESSAGE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage1_Desc() { regOBD("KANJI_MESSAGE1"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage2_Asc() { regOBA("KANJI_MESSAGE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage2_Desc() { regOBD("KANJI_MESSAGE2"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage3_Asc() { regOBA("KANJI_MESSAGE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage3_Desc() { regOBD("KANJI_MESSAGE3"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage4_Asc() { regOBA("KANJI_MESSAGE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage4_Desc() { regOBD("KANJI_MESSAGE4"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage5_Asc() { regOBA("KANJI_MESSAGE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage5_Desc() { regOBD("KANJI_MESSAGE5"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage6_Asc() { regOBA("KANJI_MESSAGE6"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage6_Desc() { regOBD("KANJI_MESSAGE6"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage7_Asc() { regOBA("KANJI_MESSAGE7"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage7_Desc() { regOBD("KANJI_MESSAGE7"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage8_Asc() { regOBA("KANJI_MESSAGE8"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage8_Desc() { regOBD("KANJI_MESSAGE8"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage9_Asc() { regOBA("KANJI_MESSAGE9"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage9_Desc() { regOBD("KANJI_MESSAGE9"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanjiMessage10_Asc() { regOBA("KANJI_MESSAGE10"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanjiMessage10_Desc() { regOBD("KANJI_MESSAGE10"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage1_Asc() { regOBA("KANA_MESSAGE1"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage1_Desc() { regOBD("KANA_MESSAGE1"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage2_Asc() { regOBA("KANA_MESSAGE2"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage2_Desc() { regOBD("KANA_MESSAGE2"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage3_Asc() { regOBA("KANA_MESSAGE3"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage3_Desc() { regOBD("KANA_MESSAGE3"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage4_Asc() { regOBA("KANA_MESSAGE4"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage4_Desc() { regOBD("KANA_MESSAGE4"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage5_Asc() { regOBA("KANA_MESSAGE5"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage5_Desc() { regOBD("KANA_MESSAGE5"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage6_Asc() { regOBA("KANA_MESSAGE6"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage6_Desc() { regOBD("KANA_MESSAGE6"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage7_Asc() { regOBA("KANA_MESSAGE7"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage7_Desc() { regOBD("KANA_MESSAGE7"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage8_Asc() { regOBA("KANA_MESSAGE8"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage8_Desc() { regOBD("KANA_MESSAGE8"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage9_Asc() { regOBA("KANA_MESSAGE9"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage9_Desc() { regOBD("KANA_MESSAGE9"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KanaMessage10_Asc() { regOBA("KANA_MESSAGE10"); return this; }

    /**
     * Add order-by as descend. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KanaMessage10_Desc() { regOBD("KANA_MESSAGE10"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DeliveryNoteSummary_Asc() { regOBA("DELIVERY_NOTE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DeliveryNoteSummary_Desc() { regOBD("DELIVERY_NOTE_SUMMARY"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_InvoiceSummary_Asc() { regOBA("INVOICE_SUMMARY"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_InvoiceSummary_Desc() { regOBD("INVOICE_SUMMARY"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_EcOrderNo_Asc() { regOBA("EC_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcOrderNo_Desc() { regOBD("EC_ORDER_NO"); return this; }

    protected ConditionValue _ecOrderBranchNo;
    public ConditionValue xdfgetEcOrderBranchNo()
    { if (_ecOrderBranchNo == null) { _ecOrderBranchNo = nCV(); }
      return _ecOrderBranchNo; }
    protected ConditionValue xgetCValueEcOrderBranchNo() { return xdfgetEcOrderBranchNo(); }

    /**
     * Add order-by as ascend. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcOrderBranchNo_Asc() { regOBA("EC_ORDER_BRANCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcOrderBranchNo_Desc() { regOBD("EC_ORDER_BRANCH_NO"); return this; }

    protected ConditionValue _ecProductNmKanji;
    public ConditionValue xdfgetEcProductNmKanji()
    { if (_ecProductNmKanji == null) { _ecProductNmKanji = nCV(); }
      return _ecProductNmKanji; }
    protected ConditionValue xgetCValueEcProductNmKanji() { return xdfgetEcProductNmKanji(); }

    /**
     * Add order-by as ascend. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcProductNmKanji_Asc() { regOBA("EC_PRODUCT_NM_KANJI"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EcProductNmKanji_Desc() { regOBD("EC_PRODUCT_NM_KANJI"); return this; }

    protected ConditionValue _orderDt;
    public ConditionValue xdfgetOrderDt()
    { if (_orderDt == null) { _orderDt = nCV(); }
      return _orderDt; }
    protected ConditionValue xgetCValueOrderDt() { return xdfgetOrderDt(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_OrderDt_Asc() { regOBA("ORDER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_OrderDt_Desc() { regOBD("ORDER_DT"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_KokyakuCd_Asc() { regOBA("KOKYAKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_KokyakuCd_Desc() { regOBD("KOKYAKU_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_PaymentTypeCd_Asc() { regOBA("PAYMENT_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_PaymentTypeCd_Desc() { regOBD("PAYMENT_TYPE_CD"); return this; }

    protected ConditionValue _totalPrice;
    public ConditionValue xdfgetTotalPrice()
    { if (_totalPrice == null) { _totalPrice = nCV(); }
      return _totalPrice; }
    protected ConditionValue xgetCValueTotalPrice() { return xdfgetTotalPrice(); }

    /**
     * Add order-by as ascend. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_TotalPrice_Asc() { regOBA("TOTAL_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_TotalPrice_Desc() { regOBD("TOTAL_PRICE"); return this; }

    protected ConditionValue _shippingFee;
    public ConditionValue xdfgetShippingFee()
    { if (_shippingFee == null) { _shippingFee = nCV(); }
      return _shippingFee; }
    protected ConditionValue xgetCValueShippingFee() { return xdfgetShippingFee(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingFee_Asc() { regOBA("SHIPPING_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingFee_Desc() { regOBD("SHIPPING_FEE"); return this; }

    protected ConditionValue _separateShippingFee;
    public ConditionValue xdfgetSeparateShippingFee()
    { if (_separateShippingFee == null) { _separateShippingFee = nCV(); }
      return _separateShippingFee; }
    protected ConditionValue xgetCValueSeparateShippingFee() { return xdfgetSeparateShippingFee(); }

    /**
     * Add order-by as ascend. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SeparateShippingFee_Asc() { regOBA("SEPARATE_SHIPPING_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SeparateShippingFee_Desc() { regOBD("SEPARATE_SHIPPING_FEE"); return this; }

    protected ConditionValue _codFee;
    public ConditionValue xdfgetCodFee()
    { if (_codFee == null) { _codFee = nCV(); }
      return _codFee; }
    protected ConditionValue xgetCValueCodFee() { return xdfgetCodFee(); }

    /**
     * Add order-by as ascend. <br>
     * COD_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CodFee_Asc() { regOBA("COD_FEE"); return this; }

    /**
     * Add order-by as descend. <br>
     * COD_FEE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CodFee_Desc() { regOBD("COD_FEE"); return this; }

    protected ConditionValue _salesTaxRate;
    public ConditionValue xdfgetSalesTaxRate()
    { if (_salesTaxRate == null) { _salesTaxRate = nCV(); }
      return _salesTaxRate; }
    protected ConditionValue xgetCValueSalesTaxRate() { return xdfgetSalesTaxRate(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesTaxRate_Asc() { regOBA("SALES_TAX_RATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SalesTaxRate_Desc() { regOBD("SALES_TAX_RATE"); return this; }

    protected ConditionValue _priceHiddenFlg;
    public ConditionValue xdfgetPriceHiddenFlg()
    { if (_priceHiddenFlg == null) { _priceHiddenFlg = nCV(); }
      return _priceHiddenFlg; }
    protected ConditionValue xgetCValuePriceHiddenFlg() { return xdfgetPriceHiddenFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_PriceHiddenFlg_Asc() { regOBA("PRICE_HIDDEN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_PriceHiddenFlg_Desc() { regOBD("PRICE_HIDDEN_FLG"); return this; }

    protected ConditionValue _paymentHiddenFlg;
    public ConditionValue xdfgetPaymentHiddenFlg()
    { if (_paymentHiddenFlg == null) { _paymentHiddenFlg = nCV(); }
      return _paymentHiddenFlg; }
    protected ConditionValue xgetCValuePaymentHiddenFlg() { return xdfgetPaymentHiddenFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_PaymentHiddenFlg_Asc() { regOBA("PAYMENT_HIDDEN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_PaymentHiddenFlg_Desc() { regOBD("PAYMENT_HIDDEN_FLG"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_OrderNoDeliveryNote_Asc() { regOBA("ORDER_NO_DELIVERY_NOTE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_OrderNoDeliveryNote_Desc() { regOBD("ORDER_NO_DELIVERY_NOTE"); return this; }

    protected ConditionValue _point;
    public ConditionValue xdfgetPoint()
    { if (_point == null) { _point = nCV(); }
      return _point; }
    protected ConditionValue xgetCValuePoint() { return xdfgetPoint(); }

    /**
     * Add order-by as ascend. <br>
     * POINT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_Point_Asc() { regOBA("POINT"); return this; }

    /**
     * Add order-by as descend. <br>
     * POINT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_Point_Desc() { regOBD("POINT"); return this; }

    protected ConditionValue _storePlantCd;
    public ConditionValue xdfgetStorePlantCd()
    { if (_storePlantCd == null) { _storePlantCd = nCV(); }
      return _storePlantCd; }
    protected ConditionValue xgetCValueStorePlantCd() { return xdfgetStorePlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_StorePlantCd_Asc() { regOBA("STORE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_StorePlantCd_Desc() { regOBD("STORE_PLANT_CD"); return this; }

    protected ConditionValue _storeStorageSpaceCd;
    public ConditionValue xdfgetStoreStorageSpaceCd()
    { if (_storeStorageSpaceCd == null) { _storeStorageSpaceCd = nCV(); }
      return _storeStorageSpaceCd; }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return xdfgetStoreStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_StoreStorageSpaceCd_Asc() { regOBA("STORE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_StoreStorageSpaceCd_Desc() { regOBD("STORE_STORAGE_SPACE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _lotManagTypeCd;
    public ConditionValue xdfgetLotManagTypeCd()
    { if (_lotManagTypeCd == null) { _lotManagTypeCd = nCV(); }
      return _lotManagTypeCd; }
    protected ConditionValue xgetCValueLotManagTypeCd() { return xdfgetLotManagTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LotManagTypeCd_Asc() { regOBA("LOT_MANAG_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_LotManagTypeCd_Desc() { regOBD("LOT_MANAG_TYPE_CD"); return this; }

    protected ConditionValue _dealTypeCd;
    public ConditionValue xdfgetDealTypeCd()
    { if (_dealTypeCd == null) { _dealTypeCd = nCV(); }
      return _dealTypeCd; }
    protected ConditionValue xgetCValueDealTypeCd() { return xdfgetDealTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DealTypeCd_Asc() { regOBA("DEAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DealTypeCd_Desc() { regOBD("DEAL_TYPE_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DelivCd_Asc() { regOBA("DELIV_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DelivCd_Desc() { regOBD("DELIV_CD"); return this; }

    protected ConditionValue _empIdCd;
    public ConditionValue xdfgetEmpIdCd()
    { if (_empIdCd == null) { _empIdCd = nCV(); }
      return _empIdCd; }
    protected ConditionValue xgetCValueEmpIdCd() { return xdfgetEmpIdCd(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EmpIdCd_Asc() { regOBA("EMP_ID_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EmpIdCd_Desc() { regOBD("EMP_ID_CD"); return this; }

    protected ConditionValue _empNm;
    public ConditionValue xdfgetEmpNm()
    { if (_empNm == null) { _empNm = nCV(); }
      return _empNm; }
    protected ConditionValue xgetCValueEmpNm() { return xdfgetEmpNm(); }

    /**
     * Add order-by as ascend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EmpNm_Asc() { regOBA("EMP_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * EMP_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_EmpNm_Desc() { regOBD("EMP_NM"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapAddUserCd_Asc() { regOBA("SAP_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapAddUserCd_Desc() { regOBD("SAP_ADD_USER_CD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SapUpdUserCd_Asc() { regOBA("SAP_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SapUpdUserCd_Desc() { regOBD("SAP_UPD_USER_CD"); return this; }

    protected ConditionValue _dataTransferOnlyStr01;
    public ConditionValue xdfgetDataTransferOnlyStr01()
    { if (_dataTransferOnlyStr01 == null) { _dataTransferOnlyStr01 = nCV(); }
      return _dataTransferOnlyStr01; }
    protected ConditionValue xgetCValueDataTransferOnlyStr01() { return xdfgetDataTransferOnlyStr01(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

    protected ConditionValue _dataTransferOnlyStr02;
    public ConditionValue xdfgetDataTransferOnlyStr02()
    { if (_dataTransferOnlyStr02 == null) { _dataTransferOnlyStr02 = nCV(); }
      return _dataTransferOnlyStr02; }
    protected ConditionValue xgetCValueDataTransferOnlyStr02() { return xdfgetDataTransferOnlyStr02(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr02_Asc() { regOBA("DATA_TRANSFER_ONLY_STR02"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr02_Desc() { regOBD("DATA_TRANSFER_ONLY_STR02"); return this; }

    protected ConditionValue _dataTransferOnlyStr03;
    public ConditionValue xdfgetDataTransferOnlyStr03()
    { if (_dataTransferOnlyStr03 == null) { _dataTransferOnlyStr03 = nCV(); }
      return _dataTransferOnlyStr03; }
    protected ConditionValue xgetCValueDataTransferOnlyStr03() { return xdfgetDataTransferOnlyStr03(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr03_Asc() { regOBA("DATA_TRANSFER_ONLY_STR03"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DataTransferOnlyStr03_Desc() { regOBD("DATA_TRANSFER_ONLY_STR03"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEsShippingInstCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsShippingInstCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEsShippingInstCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEsShippingInstCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EsShippingInstCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EsShippingInstCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EsShippingInstCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EsShippingInstCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EsShippingInstCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EsShippingInstCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EsShippingInstCQ> _myselfExistsMap;
    public Map<String, EsShippingInstCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EsShippingInstCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EsShippingInstCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EsShippingInstCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EsShippingInstCB.class.getName(); }
    protected String xCQ() { return EsShippingInstCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
