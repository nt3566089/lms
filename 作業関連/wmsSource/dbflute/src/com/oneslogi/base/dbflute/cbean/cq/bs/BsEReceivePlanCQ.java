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
 * The base condition-query of e_receive_plan.
 * @author DBFlute(AutoGenerator)
 */
public class BsEReceivePlanCQ extends AbstractBsEReceivePlanCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EReceivePlanCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from e_receive_plan) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EReceivePlanCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EReceivePlanCIQ xcreateCIQ() {
        EReceivePlanCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EReceivePlanCIQ xnewCIQ() {
        return new EReceivePlanCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join e_receive_plan on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EReceivePlanCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EReceivePlanCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanId;
    public ConditionValue xdfgetReceivePlanId()
    { if (_receivePlanId == null) { _receivePlanId = nCV(); }
      return _receivePlanId; }
    protected ConditionValue xgetCValueReceivePlanId() { return xdfgetReceivePlanId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanId_Asc() { regOBA("RECEIVE_PLAN_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanId_Desc() { regOBD("RECEIVE_PLAN_ID"); return this; }

    protected ConditionValue _receiveCd;
    public ConditionValue xdfgetReceiveCd()
    { if (_receiveCd == null) { _receiveCd = nCV(); }
      return _receiveCd; }
    protected ConditionValue xgetCValueReceiveCd() { return xdfgetReceiveCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

    protected ConditionValue _receiveRowId;
    public ConditionValue xdfgetReceiveRowId()
    { if (_receiveRowId == null) { _receiveRowId = nCV(); }
      return _receiveRowId; }
    protected ConditionValue xgetCValueReceiveRowId() { return xdfgetReceiveRowId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

    protected ConditionValue _importFlg;
    public ConditionValue xdfgetImportFlg()
    { if (_importFlg == null) { _importFlg = nCV(); }
      return _importFlg; }
    protected ConditionValue xgetCValueImportFlg() { return xdfgetImportFlg(); }

    /**
     * Add order-by as ascend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _storeSlipNo;
    public ConditionValue xdfgetStoreSlipNo()
    { if (_storeSlipNo == null) { _storeSlipNo = nCV(); }
      return _storeSlipNo; }
    protected ConditionValue xgetCValueStoreSlipNo() { return xdfgetStoreSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StoreSlipNo_Asc() { regOBA("STORE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StoreSlipNo_Desc() { regOBD("STORE_SLIP_NO"); return this; }

    protected ConditionValue _storeSlipRowNo;
    public ConditionValue xdfgetStoreSlipRowNo()
    { if (_storeSlipRowNo == null) { _storeSlipRowNo = nCV(); }
      return _storeSlipRowNo; }
    protected ConditionValue xgetCValueStoreSlipRowNo() { return xdfgetStoreSlipRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StoreSlipRowNo_Asc() { regOBA("STORE_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StoreSlipRowNo_Desc() { regOBD("STORE_SLIP_ROW_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SlipTypeCd_Asc() { regOBA("SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SlipTypeCd_Desc() { regOBD("SLIP_TYPE_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_IfId_Asc() { regOBA("IF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_IfId_Desc() { regOBD("IF_ID"); return this; }

    protected ConditionValue _ifNo;
    public ConditionValue xdfgetIfNo()
    { if (_ifNo == null) { _ifNo = nCV(); }
      return _ifNo; }
    protected ConditionValue xgetCValueIfNo() { return xdfgetIfNo(); }

    /**
     * Add order-by as ascend. <br>
     * IF_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_IfNo_Asc() { regOBA("IF_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_IfNo_Desc() { regOBD("IF_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SanshaTypeCd_Asc() { regOBA("SANSHA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SanshaTypeCd_Desc() { regOBD("SANSHA_TYPE_CD"); return this; }

    protected ConditionValue _receiveReasonCd;
    public ConditionValue xdfgetReceiveReasonCd()
    { if (_receiveReasonCd == null) { _receiveReasonCd = nCV(); }
      return _receiveReasonCd; }
    protected ConditionValue xgetCValueReceiveReasonCd() { return xdfgetReceiveReasonCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveReasonCd_Asc() { regOBA("RECEIVE_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveReasonCd_Desc() { regOBD("RECEIVE_REASON_CD"); return this; }

    protected ConditionValue _receiveReasonNm;
    public ConditionValue xdfgetReceiveReasonNm()
    { if (_receiveReasonNm == null) { _receiveReasonNm = nCV(); }
      return _receiveReasonNm; }
    protected ConditionValue xgetCValueReceiveReasonNm() { return xdfgetReceiveReasonNm(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveReasonNm_Asc() { regOBA("RECEIVE_REASON_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveReasonNm_Desc() { regOBD("RECEIVE_REASON_NM"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_CustomerNm_Asc() { regOBA("CUSTOMER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_CustomerNm_Desc() { regOBD("CUSTOMER_NM"); return this; }

    protected ConditionValue _orderDate;
    public ConditionValue xdfgetOrderDate()
    { if (_orderDate == null) { _orderDate = nCV(); }
      return _orderDate; }
    protected ConditionValue xgetCValueOrderDate() { return xdfgetOrderDate(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_OrderDate_Asc() { regOBA("ORDER_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_OrderDate_Desc() { regOBD("ORDER_DATE"); return this; }

    protected ConditionValue _orderTime;
    public ConditionValue xdfgetOrderTime()
    { if (_orderTime == null) { _orderTime = nCV(); }
      return _orderTime; }
    protected ConditionValue xgetCValueOrderTime() { return xdfgetOrderTime(); }

    /**
     * Add order-by as ascend. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_OrderTime_Asc() { regOBA("ORDER_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_OrderTime_Desc() { regOBD("ORDER_TIME"); return this; }

    protected ConditionValue _confirmedDeliveryDate;
    public ConditionValue xdfgetConfirmedDeliveryDate()
    { if (_confirmedDeliveryDate == null) { _confirmedDeliveryDate = nCV(); }
      return _confirmedDeliveryDate; }
    protected ConditionValue xgetCValueConfirmedDeliveryDate() { return xdfgetConfirmedDeliveryDate(); }

    /**
     * Add order-by as ascend. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ConfirmedDeliveryDate_Asc() { regOBA("CONFIRMED_DELIVERY_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ConfirmedDeliveryDate_Desc() { regOBD("CONFIRMED_DELIVERY_DATE"); return this; }

    protected ConditionValue _hinmokuText;
    public ConditionValue xdfgetHinmokuText()
    { if (_hinmokuText == null) { _hinmokuText = nCV(); }
      return _hinmokuText; }
    protected ConditionValue xgetCValueHinmokuText() { return xdfgetHinmokuText(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _receivePlanNum;
    public ConditionValue xdfgetReceivePlanNum()
    { if (_receivePlanNum == null) { _receivePlanNum = nCV(); }
      return _receivePlanNum; }
    protected ConditionValue xgetCValueReceivePlanNum() { return xdfgetReceivePlanNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanNum_Asc() { regOBA("RECEIVE_PLAN_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceivePlanNum_Desc() { regOBD("RECEIVE_PLAN_NUM"); return this; }

    protected ConditionValue _receiveRemainingNum;
    public ConditionValue xdfgetReceiveRemainingNum()
    { if (_receiveRemainingNum == null) { _receiveRemainingNum = nCV(); }
      return _receiveRemainingNum; }
    protected ConditionValue xgetCValueReceiveRemainingNum() { return xdfgetReceiveRemainingNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRemainingNum_Asc() { regOBA("RECEIVE_REMAINING_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ReceiveRemainingNum_Desc() { regOBD("RECEIVE_REMAINING_NUM"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_StorePlantCd_Asc() { regOBA("STORE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StorePlantCd_Desc() { regOBD("STORE_PLANT_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_StoreStorageSpaceCd_Asc() { regOBA("STORE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_StoreStorageSpaceCd_Desc() { regOBD("STORE_STORAGE_SPACE_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_LotManagTypeCd_Asc() { regOBA("LOT_MANAG_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_LotManagTypeCd_Desc() { regOBD("LOT_MANAG_TYPE_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_TenhanshaNm1_Asc() { regOBA("TENHANSHA_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TenhanshaNm1_Desc() { regOBD("TENHANSHA_NM1"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_TenhanshaNm2_Asc() { regOBA("TENHANSHA_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TenhanshaNm2_Desc() { regOBD("TENHANSHA_NM2"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUserCd_Asc() { regOBA("SAP_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUserCd_Desc() { regOBD("SAP_USER_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUserNm_Asc() { regOBA("SAP_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUserNm_Desc() { regOBD("SAP_USER_NM"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ModTypeCd_Asc() { regOBA("MOD_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ModTypeCd_Desc() { regOBD("MOD_TYPE_CD"); return this; }

    protected ConditionValue _depositJanCd;
    public ConditionValue xdfgetDepositJanCd()
    { if (_depositJanCd == null) { _depositJanCd = nCV(); }
      return _depositJanCd; }
    protected ConditionValue xgetCValueDepositJanCd() { return xdfgetDepositJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DepositJanCd_Asc() { regOBA("DEPOSIT_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DepositJanCd_Desc() { regOBD("DEPOSIT_JAN_CD"); return this; }

    protected ConditionValue _timesNum;
    public ConditionValue xdfgetTimesNum()
    { if (_timesNum == null) { _timesNum = nCV(); }
      return _timesNum; }
    protected ConditionValue xgetCValueTimesNum() { return xdfgetTimesNum(); }

    /**
     * Add order-by as ascend. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TimesNum_Asc() { regOBA("TIMES_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TimesNum_Desc() { regOBD("TIMES_NUM"); return this; }

    protected ConditionValue _accountOrderNo;
    public ConditionValue xdfgetAccountOrderNo()
    { if (_accountOrderNo == null) { _accountOrderNo = nCV(); }
      return _accountOrderNo; }
    protected ConditionValue xgetCValueAccountOrderNo() { return xdfgetAccountOrderNo(); }

    /**
     * Add order-by as ascend. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AccountOrderNo_Asc() { regOBA("ACCOUNT_ORDER_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AccountOrderNo_Desc() { regOBD("ACCOUNT_ORDER_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapSupplierCd_Asc() { regOBA("SAP_SUPPLIER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapSupplierCd_Desc() { regOBD("SAP_SUPPLIER_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapVenderCd_Asc() { regOBA("SAP_VENDER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapVenderCd_Desc() { regOBD("SAP_VENDER_CD"); return this; }

    protected ConditionValue _todayFlg;
    public ConditionValue xdfgetTodayFlg()
    { if (_todayFlg == null) { _todayFlg = nCV(); }
      return _todayFlg; }
    protected ConditionValue xgetCValueTodayFlg() { return xdfgetTodayFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TodayFlg_Asc() { regOBA("TODAY_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_TodayFlg_Desc() { regOBD("TODAY_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SanshaDeliverySlipNo1_Asc() { regOBA("SANSHA_DELIVERY_SLIP_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SanshaDeliverySlipNo1_Desc() { regOBD("SANSHA_DELIVERY_SLIP_NO1"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_DataTypeCd_Asc() { regOBA("DATA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTypeCd_Desc() { regOBD("DATA_TYPE_CD"); return this; }

    protected ConditionValue _wmsSendFlg;
    public ConditionValue xdfgetWmsSendFlg()
    { if (_wmsSendFlg == null) { _wmsSendFlg = nCV(); }
      return _wmsSendFlg; }
    protected ConditionValue xgetCValueWmsSendFlg() { return xdfgetWmsSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_WmsSendFlg_Asc() { regOBA("WMS_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_WmsSendFlg_Desc() { regOBD("WMS_SEND_FLG"); return this; }

    protected ConditionValue _lpSendFlg;
    public ConditionValue xdfgetLpSendFlg()
    { if (_lpSendFlg == null) { _lpSendFlg = nCV(); }
      return _lpSendFlg; }
    protected ConditionValue xgetCValueLpSendFlg() { return xdfgetLpSendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapAddUserCd_Asc() { regOBA("SAP_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapAddUserCd_Desc() { regOBD("SAP_ADD_USER_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SapUpdUserCd_Asc() { regOBA("SAP_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SapUpdUserCd_Desc() { regOBD("SAP_UPD_USER_CD"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

    protected ConditionValue _dataTransferOnlyStr02;
    public ConditionValue xdfgetDataTransferOnlyStr02()
    { if (_dataTransferOnlyStr02 == null) { _dataTransferOnlyStr02 = nCV(); }
      return _dataTransferOnlyStr02; }
    protected ConditionValue xgetCValueDataTransferOnlyStr02() { return xdfgetDataTransferOnlyStr02(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr02_Asc() { regOBA("DATA_TRANSFER_ONLY_STR02"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr02_Desc() { regOBD("DATA_TRANSFER_ONLY_STR02"); return this; }

    protected ConditionValue _dataTransferOnlyStr03;
    public ConditionValue xdfgetDataTransferOnlyStr03()
    { if (_dataTransferOnlyStr03 == null) { _dataTransferOnlyStr03 = nCV(); }
      return _dataTransferOnlyStr03; }
    protected ConditionValue xgetCValueDataTransferOnlyStr03() { return xdfgetDataTransferOnlyStr03(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr03_Asc() { regOBA("DATA_TRANSFER_ONLY_STR03"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr03_Desc() { regOBD("DATA_TRANSFER_ONLY_STR03"); return this; }

    protected ConditionValue _dataTransferOnlyStr04;
    public ConditionValue xdfgetDataTransferOnlyStr04()
    { if (_dataTransferOnlyStr04 == null) { _dataTransferOnlyStr04 = nCV(); }
      return _dataTransferOnlyStr04; }
    protected ConditionValue xgetCValueDataTransferOnlyStr04() { return xdfgetDataTransferOnlyStr04(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr04_Asc() { regOBA("DATA_TRANSFER_ONLY_STR04"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr04_Desc() { regOBD("DATA_TRANSFER_ONLY_STR04"); return this; }

    protected ConditionValue _dataTransferOnlyStr05;
    public ConditionValue xdfgetDataTransferOnlyStr05()
    { if (_dataTransferOnlyStr05 == null) { _dataTransferOnlyStr05 = nCV(); }
      return _dataTransferOnlyStr05; }
    protected ConditionValue xgetCValueDataTransferOnlyStr05() { return xdfgetDataTransferOnlyStr05(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr05_Asc() { regOBA("DATA_TRANSFER_ONLY_STR05"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr05_Desc() { regOBD("DATA_TRANSFER_ONLY_STR05"); return this; }

    protected ConditionValue _dataTransferOnlyStr06;
    public ConditionValue xdfgetDataTransferOnlyStr06()
    { if (_dataTransferOnlyStr06 == null) { _dataTransferOnlyStr06 = nCV(); }
      return _dataTransferOnlyStr06; }
    protected ConditionValue xgetCValueDataTransferOnlyStr06() { return xdfgetDataTransferOnlyStr06(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr06_Asc() { regOBA("DATA_TRANSFER_ONLY_STR06"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr06_Desc() { regOBD("DATA_TRANSFER_ONLY_STR06"); return this; }

    protected ConditionValue _dataTransferOnlyStr07;
    public ConditionValue xdfgetDataTransferOnlyStr07()
    { if (_dataTransferOnlyStr07 == null) { _dataTransferOnlyStr07 = nCV(); }
      return _dataTransferOnlyStr07; }
    protected ConditionValue xgetCValueDataTransferOnlyStr07() { return xdfgetDataTransferOnlyStr07(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr07_Asc() { regOBA("DATA_TRANSFER_ONLY_STR07"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr07_Desc() { regOBD("DATA_TRANSFER_ONLY_STR07"); return this; }

    protected ConditionValue _dataTransferOnlyStr08;
    public ConditionValue xdfgetDataTransferOnlyStr08()
    { if (_dataTransferOnlyStr08 == null) { _dataTransferOnlyStr08 = nCV(); }
      return _dataTransferOnlyStr08; }
    protected ConditionValue xgetCValueDataTransferOnlyStr08() { return xdfgetDataTransferOnlyStr08(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr08_Asc() { regOBA("DATA_TRANSFER_ONLY_STR08"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr08_Desc() { regOBD("DATA_TRANSFER_ONLY_STR08"); return this; }

    protected ConditionValue _dataTransferOnlyStr09;
    public ConditionValue xdfgetDataTransferOnlyStr09()
    { if (_dataTransferOnlyStr09 == null) { _dataTransferOnlyStr09 = nCV(); }
      return _dataTransferOnlyStr09; }
    protected ConditionValue xgetCValueDataTransferOnlyStr09() { return xdfgetDataTransferOnlyStr09(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr09_Asc() { regOBA("DATA_TRANSFER_ONLY_STR09"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr09_Desc() { regOBD("DATA_TRANSFER_ONLY_STR09"); return this; }

    protected ConditionValue _dataTransferOnlyStr10;
    public ConditionValue xdfgetDataTransferOnlyStr10()
    { if (_dataTransferOnlyStr10 == null) { _dataTransferOnlyStr10 = nCV(); }
      return _dataTransferOnlyStr10; }
    protected ConditionValue xgetCValueDataTransferOnlyStr10() { return xdfgetDataTransferOnlyStr10(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr10_Asc() { regOBA("DATA_TRANSFER_ONLY_STR10"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr10_Desc() { regOBD("DATA_TRANSFER_ONLY_STR10"); return this; }

    protected ConditionValue _dataTransferOnlyStr11;
    public ConditionValue xdfgetDataTransferOnlyStr11()
    { if (_dataTransferOnlyStr11 == null) { _dataTransferOnlyStr11 = nCV(); }
      return _dataTransferOnlyStr11; }
    protected ConditionValue xgetCValueDataTransferOnlyStr11() { return xdfgetDataTransferOnlyStr11(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr11_Asc() { regOBA("DATA_TRANSFER_ONLY_STR11"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr11_Desc() { regOBD("DATA_TRANSFER_ONLY_STR11"); return this; }

    protected ConditionValue _dataTransferOnlyStr12;
    public ConditionValue xdfgetDataTransferOnlyStr12()
    { if (_dataTransferOnlyStr12 == null) { _dataTransferOnlyStr12 = nCV(); }
      return _dataTransferOnlyStr12; }
    protected ConditionValue xgetCValueDataTransferOnlyStr12() { return xdfgetDataTransferOnlyStr12(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr12_Asc() { regOBA("DATA_TRANSFER_ONLY_STR12"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr12_Desc() { regOBD("DATA_TRANSFER_ONLY_STR12"); return this; }

    protected ConditionValue _dataTransferOnlyStr13;
    public ConditionValue xdfgetDataTransferOnlyStr13()
    { if (_dataTransferOnlyStr13 == null) { _dataTransferOnlyStr13 = nCV(); }
      return _dataTransferOnlyStr13; }
    protected ConditionValue xgetCValueDataTransferOnlyStr13() { return xdfgetDataTransferOnlyStr13(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr13_Asc() { regOBA("DATA_TRANSFER_ONLY_STR13"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr13_Desc() { regOBD("DATA_TRANSFER_ONLY_STR13"); return this; }

    protected ConditionValue _dataTransferOnlyStr14;
    public ConditionValue xdfgetDataTransferOnlyStr14()
    { if (_dataTransferOnlyStr14 == null) { _dataTransferOnlyStr14 = nCV(); }
      return _dataTransferOnlyStr14; }
    protected ConditionValue xgetCValueDataTransferOnlyStr14() { return xdfgetDataTransferOnlyStr14(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr14_Asc() { regOBA("DATA_TRANSFER_ONLY_STR14"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr14_Desc() { regOBD("DATA_TRANSFER_ONLY_STR14"); return this; }

    protected ConditionValue _dataTransferOnlyStr15;
    public ConditionValue xdfgetDataTransferOnlyStr15()
    { if (_dataTransferOnlyStr15 == null) { _dataTransferOnlyStr15 = nCV(); }
      return _dataTransferOnlyStr15; }
    protected ConditionValue xgetCValueDataTransferOnlyStr15() { return xdfgetDataTransferOnlyStr15(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr15_Asc() { regOBA("DATA_TRANSFER_ONLY_STR15"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr15_Desc() { regOBD("DATA_TRANSFER_ONLY_STR15"); return this; }

    protected ConditionValue _dataTransferOnlyStr16;
    public ConditionValue xdfgetDataTransferOnlyStr16()
    { if (_dataTransferOnlyStr16 == null) { _dataTransferOnlyStr16 = nCV(); }
      return _dataTransferOnlyStr16; }
    protected ConditionValue xgetCValueDataTransferOnlyStr16() { return xdfgetDataTransferOnlyStr16(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr16_Asc() { regOBA("DATA_TRANSFER_ONLY_STR16"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr16_Desc() { regOBD("DATA_TRANSFER_ONLY_STR16"); return this; }

    protected ConditionValue _dataTransferOnlyStr17;
    public ConditionValue xdfgetDataTransferOnlyStr17()
    { if (_dataTransferOnlyStr17 == null) { _dataTransferOnlyStr17 = nCV(); }
      return _dataTransferOnlyStr17; }
    protected ConditionValue xgetCValueDataTransferOnlyStr17() { return xdfgetDataTransferOnlyStr17(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr17_Asc() { regOBA("DATA_TRANSFER_ONLY_STR17"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr17_Desc() { regOBD("DATA_TRANSFER_ONLY_STR17"); return this; }

    protected ConditionValue _dataTransferOnlyStr18;
    public ConditionValue xdfgetDataTransferOnlyStr18()
    { if (_dataTransferOnlyStr18 == null) { _dataTransferOnlyStr18 = nCV(); }
      return _dataTransferOnlyStr18; }
    protected ConditionValue xgetCValueDataTransferOnlyStr18() { return xdfgetDataTransferOnlyStr18(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr18_Asc() { regOBA("DATA_TRANSFER_ONLY_STR18"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr18_Desc() { regOBD("DATA_TRANSFER_ONLY_STR18"); return this; }

    protected ConditionValue _dataTransferOnlyStr19;
    public ConditionValue xdfgetDataTransferOnlyStr19()
    { if (_dataTransferOnlyStr19 == null) { _dataTransferOnlyStr19 = nCV(); }
      return _dataTransferOnlyStr19; }
    protected ConditionValue xgetCValueDataTransferOnlyStr19() { return xdfgetDataTransferOnlyStr19(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr19_Asc() { regOBA("DATA_TRANSFER_ONLY_STR19"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr19_Desc() { regOBD("DATA_TRANSFER_ONLY_STR19"); return this; }

    protected ConditionValue _dataTransferOnlyStr20;
    public ConditionValue xdfgetDataTransferOnlyStr20()
    { if (_dataTransferOnlyStr20 == null) { _dataTransferOnlyStr20 = nCV(); }
      return _dataTransferOnlyStr20; }
    protected ConditionValue xgetCValueDataTransferOnlyStr20() { return xdfgetDataTransferOnlyStr20(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr20_Asc() { regOBA("DATA_TRANSFER_ONLY_STR20"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr20_Desc() { regOBD("DATA_TRANSFER_ONLY_STR20"); return this; }

    protected ConditionValue _dataTransferOnlyStr21;
    public ConditionValue xdfgetDataTransferOnlyStr21()
    { if (_dataTransferOnlyStr21 == null) { _dataTransferOnlyStr21 = nCV(); }
      return _dataTransferOnlyStr21; }
    protected ConditionValue xgetCValueDataTransferOnlyStr21() { return xdfgetDataTransferOnlyStr21(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr21_Asc() { regOBA("DATA_TRANSFER_ONLY_STR21"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr21_Desc() { regOBD("DATA_TRANSFER_ONLY_STR21"); return this; }

    protected ConditionValue _dataTransferOnlyStr22;
    public ConditionValue xdfgetDataTransferOnlyStr22()
    { if (_dataTransferOnlyStr22 == null) { _dataTransferOnlyStr22 = nCV(); }
      return _dataTransferOnlyStr22; }
    protected ConditionValue xgetCValueDataTransferOnlyStr22() { return xdfgetDataTransferOnlyStr22(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr22_Asc() { regOBA("DATA_TRANSFER_ONLY_STR22"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr22_Desc() { regOBD("DATA_TRANSFER_ONLY_STR22"); return this; }

    protected ConditionValue _dataTransferOnlyStr23;
    public ConditionValue xdfgetDataTransferOnlyStr23()
    { if (_dataTransferOnlyStr23 == null) { _dataTransferOnlyStr23 = nCV(); }
      return _dataTransferOnlyStr23; }
    protected ConditionValue xgetCValueDataTransferOnlyStr23() { return xdfgetDataTransferOnlyStr23(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr23_Asc() { regOBA("DATA_TRANSFER_ONLY_STR23"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr23_Desc() { regOBD("DATA_TRANSFER_ONLY_STR23"); return this; }

    protected ConditionValue _dataTransferOnlyStr24;
    public ConditionValue xdfgetDataTransferOnlyStr24()
    { if (_dataTransferOnlyStr24 == null) { _dataTransferOnlyStr24 = nCV(); }
      return _dataTransferOnlyStr24; }
    protected ConditionValue xgetCValueDataTransferOnlyStr24() { return xdfgetDataTransferOnlyStr24(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr24_Asc() { regOBA("DATA_TRANSFER_ONLY_STR24"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr24_Desc() { regOBD("DATA_TRANSFER_ONLY_STR24"); return this; }

    protected ConditionValue _dataTransferOnlyStr25;
    public ConditionValue xdfgetDataTransferOnlyStr25()
    { if (_dataTransferOnlyStr25 == null) { _dataTransferOnlyStr25 = nCV(); }
      return _dataTransferOnlyStr25; }
    protected ConditionValue xgetCValueDataTransferOnlyStr25() { return xdfgetDataTransferOnlyStr25(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr25_Asc() { regOBA("DATA_TRANSFER_ONLY_STR25"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr25_Desc() { regOBD("DATA_TRANSFER_ONLY_STR25"); return this; }

    protected ConditionValue _dataTransferOnlyStr26;
    public ConditionValue xdfgetDataTransferOnlyStr26()
    { if (_dataTransferOnlyStr26 == null) { _dataTransferOnlyStr26 = nCV(); }
      return _dataTransferOnlyStr26; }
    protected ConditionValue xgetCValueDataTransferOnlyStr26() { return xdfgetDataTransferOnlyStr26(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr26_Asc() { regOBA("DATA_TRANSFER_ONLY_STR26"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr26_Desc() { regOBD("DATA_TRANSFER_ONLY_STR26"); return this; }

    protected ConditionValue _dataTransferOnlyStr27;
    public ConditionValue xdfgetDataTransferOnlyStr27()
    { if (_dataTransferOnlyStr27 == null) { _dataTransferOnlyStr27 = nCV(); }
      return _dataTransferOnlyStr27; }
    protected ConditionValue xgetCValueDataTransferOnlyStr27() { return xdfgetDataTransferOnlyStr27(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr27_Asc() { regOBA("DATA_TRANSFER_ONLY_STR27"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr27_Desc() { regOBD("DATA_TRANSFER_ONLY_STR27"); return this; }

    protected ConditionValue _dataTransferOnlyStr28;
    public ConditionValue xdfgetDataTransferOnlyStr28()
    { if (_dataTransferOnlyStr28 == null) { _dataTransferOnlyStr28 = nCV(); }
      return _dataTransferOnlyStr28; }
    protected ConditionValue xgetCValueDataTransferOnlyStr28() { return xdfgetDataTransferOnlyStr28(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr28_Asc() { regOBA("DATA_TRANSFER_ONLY_STR28"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DataTransferOnlyStr28_Desc() { regOBD("DATA_TRANSFER_ONLY_STR28"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEReceivePlanCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEReceivePlanCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEReceivePlanCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEReceivePlanCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EReceivePlanCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EReceivePlanCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EReceivePlanCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EReceivePlanCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EReceivePlanCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EReceivePlanCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EReceivePlanCQ> _myselfExistsMap;
    public Map<String, EReceivePlanCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EReceivePlanCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EReceivePlanCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EReceivePlanCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EReceivePlanCB.class.getName(); }
    protected String xCQ() { return EReceivePlanCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
