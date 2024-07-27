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
 * The base condition-query of t_shipping_inst_h_print.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstHPrintCQ extends AbstractBsTShippingInstHPrintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstHPrintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstHPrintCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_inst_h_print) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstHPrintCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstHPrintCIQ xcreateCIQ() {
        TShippingInstHPrintCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstHPrintCIQ xnewCIQ() {
        return new TShippingInstHPrintCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_inst_h_print on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstHPrintCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstHPrintCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstHPrintId;
    public ConditionValue xdfgetShippingInstHPrintId()
    { if (_shippingInstHPrintId == null) { _shippingInstHPrintId = nCV(); }
      return _shippingInstHPrintId; }
    protected ConditionValue xgetCValueShippingInstHPrintId() { return xdfgetShippingInstHPrintId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingInstHPrintId_Asc() { regOBA("SHIPPING_INST_H_PRINT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingInstHPrintId_Desc() { regOBD("SHIPPING_INST_H_PRINT_ID"); return this; }

    protected ConditionValue _shippingInstHId;
    public ConditionValue xdfgetShippingInstHId()
    { if (_shippingInstHId == null) { _shippingInstHId = nCV(); }
      return _shippingInstHId; }
    protected ConditionValue xgetCValueShippingInstHId() { return xdfgetShippingInstHId(); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_InScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_InScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_InScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_InScopeRelation_TShippingInstH", sq); }

    public Map<String, TShippingInstHCQ> getShippingInstHId_NotInScopeRelation_TShippingInstH() { return xgetSQueMap("shippingInstHId_NotInScopeRelation_TShippingInstH"); }
    public String keepShippingInstHId_NotInScopeRelation_TShippingInstH(TShippingInstHCQ sq) { return xkeepSQue("shippingInstHId_NotInScopeRelation_TShippingInstH", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingInstHId_Asc() { regOBA("SHIPPING_INST_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingInstHId_Desc() { regOBD("SHIPPING_INST_H_ID"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderNo_Asc() { regOBA("SALES_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderNo_Desc() { regOBD("SALES_ORDER_NO"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderSlipTypeCd_Asc() { regOBA("SALES_ORDER_SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderSlipTypeCd_Desc() { regOBD("SALES_ORDER_SLIP_TYPE_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderSlipNo_Asc() { regOBA("SALES_ORDER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SalesOrderSlipNo_Desc() { regOBD("SALES_ORDER_SLIP_NO"); return this; }

    protected ConditionValue _shippingReason;
    public ConditionValue xdfgetShippingReason()
    { if (_shippingReason == null) { _shippingReason = nCV(); }
      return _shippingReason; }
    protected ConditionValue xgetCValueShippingReason() { return xdfgetShippingReason(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_REASON: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingReason_Asc() { regOBA("SHIPPING_REASON"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_REASON: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingReason_Desc() { regOBD("SHIPPING_REASON"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_KoguchiDeliveryFlg_Asc() { regOBA("KOGUCHI_DELIVERY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_KoguchiDeliveryFlg_Desc() { regOBD("KOGUCHI_DELIVERY_FLG"); return this; }

    protected ConditionValue _shippingDt;
    public ConditionValue xdfgetShippingDt()
    { if (_shippingDt == null) { _shippingDt = nCV(); }
      return _shippingDt; }
    protected ConditionValue xgetCValueShippingDt() { return xdfgetShippingDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_SpecifyDeliveryDt_Asc() { regOBA("SPECIFY_DELIVERY_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SpecifyDeliveryDt_Desc() { regOBD("SPECIFY_DELIVERY_DT"); return this; }

    protected ConditionValue _specifyDeliveryTime;
    public ConditionValue xdfgetSpecifyDeliveryTime()
    { if (_specifyDeliveryTime == null) { _specifyDeliveryTime = nCV(); }
      return _specifyDeliveryTime; }
    protected ConditionValue xgetCValueSpecifyDeliveryTime() { return xdfgetSpecifyDeliveryTime(); }

    /**
     * Add order-by as ascend. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SpecifyDeliveryTime_Asc() { regOBA("SPECIFY_DELIVERY_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(6)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SpecifyDeliveryTime_Desc() { regOBD("SPECIFY_DELIVERY_TIME"); return this; }

    protected ConditionValue _tenhanshaId;
    public ConditionValue xdfgetTenhanshaId()
    { if (_tenhanshaId == null) { _tenhanshaId = nCV(); }
      return _tenhanshaId; }
    protected ConditionValue xgetCValueTenhanshaId() { return xdfgetTenhanshaId(); }

    /**
     * Add order-by as ascend. <br>
     * TENHANSHA_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_TenhanshaId_Asc() { regOBA("TENHANSHA_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_TenhanshaId_Desc() { regOBD("TENHANSHA_ID"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_TenhanshaOrderNo_Asc() { regOBA("TENHANSHA_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_TenhanshaOrderNo_Desc() { regOBD("TENHANSHA_ORDER_NO"); return this; }

    protected ConditionValue _contractorNm;
    public ConditionValue xdfgetContractorNm()
    { if (_contractorNm == null) { _contractorNm = nCV(); }
      return _contractorNm; }
    protected ConditionValue xgetCValueContractorNm() { return xdfgetContractorNm(); }

    /**
     * Add order-by as ascend. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ContractorNm_Asc() { regOBA("CONTRACTOR_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ContractorNm_Desc() { regOBD("CONTRACTOR_NM"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationCd_Asc() { regOBA("DESTINATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationCd_Desc() { regOBD("DESTINATION_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

    protected ConditionValue _destinationZipCd;
    public ConditionValue xdfgetDestinationZipCd()
    { if (_destinationZipCd == null) { _destinationZipCd = nCV(); }
      return _destinationZipCd; }
    protected ConditionValue xgetCValueDestinationZipCd() { return xdfgetDestinationZipCd(); }

    /**
     * Add order-by as ascend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationZipCd_Asc() { regOBA("DESTINATION_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationZipCd_Desc() { regOBD("DESTINATION_ZIP_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationAddress1_Asc() { regOBA("DESTINATION_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationAddress1_Desc() { regOBD("DESTINATION_ADDRESS1"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationAddress2_Asc() { regOBA("DESTINATION_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationAddress2_Desc() { regOBD("DESTINATION_ADDRESS2"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DestinationTel_Asc() { regOBA("DESTINATION_TEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DestinationTel_Desc() { regOBD("DESTINATION_TEL"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DealTypeCd_Asc() { regOBA("DEAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DealTypeCd_Desc() { regOBD("DEAL_TYPE_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstHPrintCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstHPrintCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstHPrintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstHPrintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstHPrintCQ bq = (TShippingInstHPrintCQ)bqs;
        TShippingInstHPrintCQ uq = (TShippingInstHPrintCQ)uqs;
        if (bq.hasConditionQueryTShippingInstH()) {
            uq.queryTShippingInstH().reflectRelationOnUnionQuery(bq.queryTShippingInstH(), uq.queryTShippingInstH());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstHCQ queryTShippingInstH() {
        return xdfgetConditionQueryTShippingInstH();
    }
    public TShippingInstHCQ xdfgetConditionQueryTShippingInstH() {
        String prop = "tShippingInstH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstH()); xsetupOuterJoinTShippingInstH(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstHCQ xcreateQueryTShippingInstH() {
        String nrp = xresolveNRP("t_shipping_inst_h_print", "tShippingInstH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstH", nrp);
    }
    protected void xsetupOuterJoinTShippingInstH() { xregOutJo("tShippingInstH"); }
    public boolean hasConditionQueryTShippingInstH() { return xhasQueRlMap("tShippingInstH"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstHPrintCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstHPrintCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingInstHPrintCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingInstHPrintCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingInstHPrintCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingInstHPrintCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingInstHPrintCQ> _myselfExistsMap;
    public Map<String, TShippingInstHPrintCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingInstHPrintCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingInstHPrintCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingInstHPrintCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstHPrintCB.class.getName(); }
    protected String xCQ() { return TShippingInstHPrintCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
