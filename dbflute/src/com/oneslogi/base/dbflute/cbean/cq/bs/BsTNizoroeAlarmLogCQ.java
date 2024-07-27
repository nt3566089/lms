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
 * The base condition-query of t_nizoroe_alarm_log.
 * @author DBFlute(AutoGenerator)
 */
public class BsTNizoroeAlarmLogCQ extends AbstractBsTNizoroeAlarmLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TNizoroeAlarmLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTNizoroeAlarmLogCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_nizoroe_alarm_log) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TNizoroeAlarmLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TNizoroeAlarmLogCIQ xcreateCIQ() {
        TNizoroeAlarmLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TNizoroeAlarmLogCIQ xnewCIQ() {
        return new TNizoroeAlarmLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_nizoroe_alarm_log on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TNizoroeAlarmLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TNizoroeAlarmLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _nizoroeAlarmLogId;
    public ConditionValue xdfgetNizoroeAlarmLogId()
    { if (_nizoroeAlarmLogId == null) { _nizoroeAlarmLogId = nCV(); }
      return _nizoroeAlarmLogId; }
    protected ConditionValue xgetCValueNizoroeAlarmLogId() { return xdfgetNizoroeAlarmLogId(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeAlarmLogId_Asc() { regOBA("NIZOROE_ALARM_LOG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeAlarmLogId_Desc() { regOBD("NIZOROE_ALARM_LOG_ID"); return this; }

    protected ConditionValue _nizoroeTypeCd;
    public ConditionValue xdfgetNizoroeTypeCd()
    { if (_nizoroeTypeCd == null) { _nizoroeTypeCd = nCV(); }
      return _nizoroeTypeCd; }
    protected ConditionValue xgetCValueNizoroeTypeCd() { return xdfgetNizoroeTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeTypeCd_Asc() { regOBA("NIZOROE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeTypeCd_Desc() { regOBD("NIZOROE_TYPE_CD"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeProcUnit_Asc() { regOBA("NIZOROE_PROC_UNIT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeProcUnit_Desc() { regOBD("NIZOROE_PROC_UNIT"); return this; }

    protected ConditionValue _procDt;
    public ConditionValue xdfgetProcDt()
    { if (_procDt == null) { _procDt = nCV(); }
      return _procDt; }
    protected ConditionValue xgetCValueProcDt() { return xdfgetProcDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROC_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProcDt_Asc() { regOBA("PROC_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROC_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProcDt_Desc() { regOBD("PROC_DT"); return this; }

    protected ConditionValue _printFlg;
    public ConditionValue xdfgetPrintFlg()
    { if (_printFlg == null) { _printFlg = nCV(); }
      return _printFlg; }
    protected ConditionValue xgetCValuePrintFlg() { return xdfgetPrintFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PRINT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_PrintFlg_Asc() { regOBA("PRINT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRINT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_PrintFlg_Desc() { regOBD("PRINT_FLG"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_BaseCd_Asc() { regOBA("BASE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_BaseCd_Desc() { regOBD("BASE_CD"); return this; }

    protected ConditionValue _baseNm;
    public ConditionValue xdfgetBaseNm()
    { if (_baseNm == null) { _baseNm = nCV(); }
      return _baseNm; }
    protected ConditionValue xgetCValueBaseNm() { return xdfgetBaseNm(); }

    /**
     * Add order-by as ascend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_BaseNm_Asc() { regOBA("BASE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * BASE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_BaseNm_Desc() { regOBD("BASE_NM"); return this; }

    protected ConditionValue _typeCd;
    public ConditionValue xdfgetTypeCd()
    { if (_typeCd == null) { _typeCd = nCV(); }
      return _typeCd; }
    protected ConditionValue xgetCValueTypeCd() { return xdfgetTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_TypeCd_Asc() { regOBA("TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_TypeCd_Desc() { regOBD("TYPE_CD"); return this; }

    protected ConditionValue _alarmTypeCd;
    public ConditionValue xdfgetAlarmTypeCd()
    { if (_alarmTypeCd == null) { _alarmTypeCd = nCV(); }
      return _alarmTypeCd; }
    protected ConditionValue xgetCValueAlarmTypeCd() { return xdfgetAlarmTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * ALARM_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_AlarmTypeCd_Asc() { regOBA("ALARM_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALARM_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_AlarmTypeCd_Desc() { regOBD("ALARM_TYPE_CD"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeNo_Asc() { regOBA("NIZOROE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_NizoroeNo_Desc() { regOBD("NIZOROE_NO"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrderSlipNo_Asc() { regOBA("SALES_ORDER_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrderSlipNo_Desc() { regOBD("SALES_ORDER_SLIP_NO"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_ShippingSlipRowNo_Asc() { regOBA("SHIPPING_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ShippingSlipRowNo_Desc() { regOBD("SHIPPING_SLIP_ROW_NO"); return this; }

    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    public Map<String, MProductCQ> getProductId_InScopeRelation_MProduct() { return xgetSQueMap("productId_InScopeRelation_MProduct"); }
    public String keepProductId_InScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_InScopeRelation_MProduct", sq); }

    public Map<String, MProductCQ> getProductId_NotInScopeRelation_MProduct() { return xgetSQueMap("productId_NotInScopeRelation_MProduct"); }
    public String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq) { return xkeepSQue("productId_NotInScopeRelation_MProduct", sq); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productCd;
    public ConditionValue xdfgetProductCd()
    { if (_productCd == null) { _productCd = nCV(); }
      return _productCd; }
    protected ConditionValue xgetCValueProductCd() { return xdfgetProductCd(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductCd_Asc() { regOBA("PRODUCT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductCd_Desc() { regOBD("PRODUCT_CD"); return this; }

    protected ConditionValue _productNm;
    public ConditionValue xdfgetProductNm()
    { if (_productNm == null) { _productNm = nCV(); }
      return _productNm; }
    protected ConditionValue xgetCValueProductNm() { return xdfgetProductNm(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgId_Asc() { regOBA("SALES_ORG_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgId_Desc() { regOBD("SALES_ORG_ID"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

    protected ConditionValue _salesOrgNm1;
    public ConditionValue xdfgetSalesOrgNm1()
    { if (_salesOrgNm1 == null) { _salesOrgNm1 = nCV(); }
      return _salesOrgNm1; }
    protected ConditionValue xgetCValueSalesOrgNm1() { return xdfgetSalesOrgNm1(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgNm1_Asc() { regOBA("SALES_ORG_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgNm1_Desc() { regOBD("SALES_ORG_NM1"); return this; }

    protected ConditionValue _salesOrgNm2;
    public ConditionValue xdfgetSalesOrgNm2()
    { if (_salesOrgNm2 == null) { _salesOrgNm2 = nCV(); }
      return _salesOrgNm2; }
    protected ConditionValue xgetCValueSalesOrgNm2() { return xdfgetSalesOrgNm2(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORG_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgNm2_Asc() { regOBA("SALES_ORG_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_SalesOrgNm2_Desc() { regOBD("SALES_ORG_NM2"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

    protected ConditionValue _stockOutNum;
    public ConditionValue xdfgetStockOutNum()
    { if (_stockOutNum == null) { _stockOutNum = nCV(); }
      return _stockOutNum; }
    protected ConditionValue xgetCValueStockOutNum() { return xdfgetStockOutNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_OUT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_StockOutNum_Asc() { regOBA("STOCK_OUT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_OUT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_StockOutNum_Desc() { regOBD("STOCK_OUT_NUM"); return this; }

    protected ConditionValue _outUserId;
    public ConditionValue xdfgetOutUserId()
    { if (_outUserId == null) { _outUserId = nCV(); }
      return _outUserId; }
    protected ConditionValue xgetCValueOutUserId() { return xdfgetOutUserId(); }

    public Map<String, BUserCQ> getOutUserId_InScopeRelation_BUser() { return xgetSQueMap("outUserId_InScopeRelation_BUser"); }
    public String keepOutUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("outUserId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getOutUserId_NotInScopeRelation_BUser() { return xgetSQueMap("outUserId_NotInScopeRelation_BUser"); }
    public String keepOutUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("outUserId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_OutUserId_Asc() { regOBA("OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_OutUserId_Desc() { regOBD("OUT_USER_ID"); return this; }

    protected ConditionValue _outDt;
    public ConditionValue xdfgetOutDt()
    { if (_outDt == null) { _outDt = nCV(); }
      return _outDt; }
    protected ConditionValue xgetCValueOutDt() { return xdfgetOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_OutDt_Asc() { regOBA("OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_OutDt_Desc() { regOBD("OUT_DT"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTNizoroeAlarmLogCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTNizoroeAlarmLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTNizoroeAlarmLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TNizoroeAlarmLogCQ bq = (TNizoroeAlarmLogCQ)bqs;
        TNizoroeAlarmLogCQ uq = (TNizoroeAlarmLogCQ)uqs;
        if (bq.hasConditionQueryMProduct()) {
            uq.queryMProduct().reflectRelationOnUnionQuery(bq.queryMProduct(), uq.queryMProduct());
        }
        if (bq.hasConditionQueryBUser()) {
            uq.queryBUser().reflectRelationOnUnionQuery(bq.queryBUser(), uq.queryBUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The instance of condition-query. (NotNull)
     */
    public MProductCQ queryMProduct() {
        return xdfgetConditionQueryMProduct();
    }
    public MProductCQ xdfgetConditionQueryMProduct() {
        String prop = "mProduct";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMProduct()); xsetupOuterJoinMProduct(); }
        return xgetQueRlMap(prop);
    }
    protected MProductCQ xcreateQueryMProduct() {
        String nrp = xresolveNRP("t_nizoroe_alarm_log", "mProduct"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MProductCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mProduct", nrp);
    }
    protected void xsetupOuterJoinMProduct() { xregOutJo("mProduct"); }
    public boolean hasConditionQueryMProduct() { return xhasQueRlMap("mProduct"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my OUT_USER_ID, named 'BUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUser() {
        return xdfgetConditionQueryBUser();
    }
    public BUserCQ xdfgetConditionQueryBUser() {
        String prop = "bUser";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUser()); xsetupOuterJoinBUser(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUser() {
        String nrp = xresolveNRP("t_nizoroe_alarm_log", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUser", nrp);
    }
    protected void xsetupOuterJoinBUser() { xregOutJo("bUser"); }
    public boolean hasConditionQueryBUser() { return xhasQueRlMap("bUser"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TNizoroeAlarmLogCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TNizoroeAlarmLogCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TNizoroeAlarmLogCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TNizoroeAlarmLogCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TNizoroeAlarmLogCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TNizoroeAlarmLogCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TNizoroeAlarmLogCQ> _myselfExistsMap;
    public Map<String, TNizoroeAlarmLogCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TNizoroeAlarmLogCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TNizoroeAlarmLogCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TNizoroeAlarmLogCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TNizoroeAlarmLogCB.class.getName(); }
    protected String xCQ() { return TNizoroeAlarmLogCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
