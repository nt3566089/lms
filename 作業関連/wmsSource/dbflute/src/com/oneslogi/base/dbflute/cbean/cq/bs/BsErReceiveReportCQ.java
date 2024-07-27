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
 * The base condition-query of er_receive_report.
 * @author DBFlute(AutoGenerator)
 */
public class BsErReceiveReportCQ extends AbstractBsErReceiveReportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ErReceiveReportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsErReceiveReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from er_receive_report) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ErReceiveReportCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ErReceiveReportCIQ xcreateCIQ() {
        ErReceiveReportCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ErReceiveReportCIQ xnewCIQ() {
        return new ErReceiveReportCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join er_receive_report on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ErReceiveReportCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ErReceiveReportCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receiveReportId;
    public ConditionValue xdfgetReceiveReportId()
    { if (_receiveReportId == null) { _receiveReportId = nCV(); }
      return _receiveReportId; }
    protected ConditionValue xgetCValueReceiveReportId() { return xdfgetReceiveReportId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveReportId_Asc() { regOBA("RECEIVE_REPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveReportId_Desc() { regOBD("RECEIVE_REPORT_ID"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

    protected ConditionValue _errorFlg;
    public ConditionValue xdfgetErrorFlg()
    { if (_errorFlg == null) { _errorFlg = nCV(); }
      return _errorFlg; }
    protected ConditionValue xgetCValueErrorFlg() { return xdfgetErrorFlg(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

    protected ConditionValue _errorMessageCd;
    public ConditionValue xdfgetErrorMessageCd()
    { if (_errorMessageCd == null) { _errorMessageCd = nCV(); }
      return _errorMessageCd; }
    protected ConditionValue xgetCValueErrorMessageCd() { return xdfgetErrorMessageCd(); }

    /**
     * Add order-by as ascend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_StoreSlipNo_Asc() { regOBA("STORE_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreSlipNo_Desc() { regOBD("STORE_SLIP_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_StoreSlipRowNo_Asc() { regOBA("STORE_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreSlipRowNo_Desc() { regOBD("STORE_SLIP_ROW_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_SlipTypeCd_Asc() { regOBA("SLIP_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SlipTypeCd_Desc() { regOBD("SLIP_TYPE_CD"); return this; }

    protected ConditionValue _sn;
    public ConditionValue xdfgetSn()
    { if (_sn == null) { _sn = nCV(); }
      return _sn; }
    protected ConditionValue xgetCValueSn() { return xdfgetSn(); }

    /**
     * Add order-by as ascend. <br>
     * SN: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Sn_Asc() { regOBA("SN"); return this; }

    /**
     * Add order-by as descend. <br>
     * SN: {BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Sn_Desc() { regOBD("SN"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_IfId_Asc() { regOBA("IF_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_ID: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_IfId_Desc() { regOBD("IF_ID"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_IfNo_Asc() { regOBA("IF_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * IF_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_IfNo_Desc() { regOBD("IF_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _storeReasonCd;
    public ConditionValue xdfgetStoreReasonCd()
    { if (_storeReasonCd == null) { _storeReasonCd = nCV(); }
      return _storeReasonCd; }
    protected ConditionValue xgetCValueStoreReasonCd() { return xdfgetStoreReasonCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreReasonCd_Asc() { regOBA("STORE_REASON_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreReasonCd_Desc() { regOBD("STORE_REASON_CD"); return this; }

    protected ConditionValue _storeDt;
    public ConditionValue xdfgetStoreDt()
    { if (_storeDt == null) { _storeDt = nCV(); }
      return _storeDt; }
    protected ConditionValue xgetCValueStoreDt() { return xdfgetStoreDt(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreDt_Asc() { regOBA("STORE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreDt_Desc() { regOBD("STORE_DT"); return this; }

    protected ConditionValue _num;
    public ConditionValue xdfgetNum()
    { if (_num == null) { _num = nCV(); }
      return _num; }
    protected ConditionValue xgetCValueNum() { return xdfgetNum(); }

    /**
     * Add order-by as ascend. <br>
     * NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Num_Asc() { regOBA("NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Num_Desc() { regOBD("NUM"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_LotManagTypeCd_Asc() { regOBA("LOT_MANAG_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_LotManagTypeCd_Desc() { regOBD("LOT_MANAG_TYPE_CD"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _receiveNo;
    public ConditionValue xdfgetReceiveNo()
    { if (_receiveNo == null) { _receiveNo = nCV(); }
      return _receiveNo; }
    protected ConditionValue xgetCValueReceiveNo() { return xdfgetReceiveNo(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveNo_Asc() { regOBA("RECEIVE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ReceiveNo_Desc() { regOBD("RECEIVE_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _storePlantCd;
    public ConditionValue xdfgetStorePlantCd()
    { if (_storePlantCd == null) { _storePlantCd = nCV(); }
      return _storePlantCd; }
    protected ConditionValue xgetCValueStorePlantCd() { return xdfgetStorePlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StorePlantCd_Asc() { regOBA("STORE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StorePlantCd_Desc() { regOBD("STORE_PLANT_CD"); return this; }

    protected ConditionValue _storeStorageSpaceCd;
    public ConditionValue xdfgetStoreStorageSpaceCd()
    { if (_storeStorageSpaceCd == null) { _storeStorageSpaceCd = nCV(); }
      return _storeStorageSpaceCd; }
    protected ConditionValue xgetCValueStoreStorageSpaceCd() { return xdfgetStoreStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreStorageSpaceCd_Asc() { regOBA("STORE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_StoreStorageSpaceCd_Desc() { regOBD("STORE_STORAGE_SPACE_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_SanshaDeliverySlipNo1_Asc() { regOBA("SANSHA_DELIVERY_SLIP_NO1"); return this; }

    /**
     * Add order-by as descend. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SanshaDeliverySlipNo1_Desc() { regOBD("SANSHA_DELIVERY_SLIP_NO1"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_DataTypeCd_Asc() { regOBA("DATA_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_DataTypeCd_Desc() { regOBD("DATA_TYPE_CD"); return this; }

    protected ConditionValue _processTypeCd;
    public ConditionValue xdfgetProcessTypeCd()
    { if (_processTypeCd == null) { _processTypeCd = nCV(); }
      return _processTypeCd; }
    protected ConditionValue xgetCValueProcessTypeCd() { return xdfgetProcessTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ProcessTypeCd_Asc() { regOBA("PROCESS_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ProcessTypeCd_Desc() { regOBD("PROCESS_TYPE_CD"); return this; }

    protected ConditionValue _slipNo;
    public ConditionValue xdfgetSlipNo()
    { if (_slipNo == null) { _slipNo = nCV(); }
      return _slipNo; }
    protected ConditionValue xgetCValueSlipNo() { return xdfgetSlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SlipNo_Asc() { regOBA("SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SlipNo_Desc() { regOBD("SLIP_NO"); return this; }

    protected ConditionValue _wmsAddYyyy;
    public ConditionValue xdfgetWmsAddYyyy()
    { if (_wmsAddYyyy == null) { _wmsAddYyyy = nCV(); }
      return _wmsAddYyyy; }
    protected ConditionValue xgetCValueWmsAddYyyy() { return xdfgetWmsAddYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddYyyy_Asc() { regOBA("WMS_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddYyyy_Desc() { regOBD("WMS_ADD_YYYY"); return this; }

    protected ConditionValue _wmsAddMm;
    public ConditionValue xdfgetWmsAddMm()
    { if (_wmsAddMm == null) { _wmsAddMm = nCV(); }
      return _wmsAddMm; }
    protected ConditionValue xgetCValueWmsAddMm() { return xdfgetWmsAddMm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddMm_Asc() { regOBA("WMS_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddMm_Desc() { regOBD("WMS_ADD_MM"); return this; }

    protected ConditionValue _wmsAddDd;
    public ConditionValue xdfgetWmsAddDd()
    { if (_wmsAddDd == null) { _wmsAddDd = nCV(); }
      return _wmsAddDd; }
    protected ConditionValue xgetCValueWmsAddDd() { return xdfgetWmsAddDd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddDd_Asc() { regOBA("WMS_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddDd_Desc() { regOBD("WMS_ADD_DD"); return this; }

    protected ConditionValue _wmsAddHh;
    public ConditionValue xdfgetWmsAddHh()
    { if (_wmsAddHh == null) { _wmsAddHh = nCV(); }
      return _wmsAddHh; }
    protected ConditionValue xgetCValueWmsAddHh() { return xdfgetWmsAddHh(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddHh_Asc() { regOBA("WMS_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddHh_Desc() { regOBD("WMS_ADD_HH"); return this; }

    protected ConditionValue _wmsAddMi;
    public ConditionValue xdfgetWmsAddMi()
    { if (_wmsAddMi == null) { _wmsAddMi = nCV(); }
      return _wmsAddMi; }
    protected ConditionValue xgetCValueWmsAddMi() { return xdfgetWmsAddMi(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddMi_Asc() { regOBA("WMS_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddMi_Desc() { regOBD("WMS_ADD_MI"); return this; }

    protected ConditionValue _wmsAddSs;
    public ConditionValue xdfgetWmsAddSs()
    { if (_wmsAddSs == null) { _wmsAddSs = nCV(); }
      return _wmsAddSs; }
    protected ConditionValue xgetCValueWmsAddSs() { return xdfgetWmsAddSs(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddSs_Asc() { regOBA("WMS_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddSs_Desc() { regOBD("WMS_ADD_SS"); return this; }

    protected ConditionValue _wmsAddUserNm;
    public ConditionValue xdfgetWmsAddUserNm()
    { if (_wmsAddUserNm == null) { _wmsAddUserNm = nCV(); }
      return _wmsAddUserNm; }
    protected ConditionValue xgetCValueWmsAddUserNm() { return xdfgetWmsAddUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddUserNm_Asc() { regOBA("WMS_ADD_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsAddUserNm_Desc() { regOBD("WMS_ADD_USER_NM"); return this; }

    protected ConditionValue _wmsUpdYyyy;
    public ConditionValue xdfgetWmsUpdYyyy()
    { if (_wmsUpdYyyy == null) { _wmsUpdYyyy = nCV(); }
      return _wmsUpdYyyy; }
    protected ConditionValue xgetCValueWmsUpdYyyy() { return xdfgetWmsUpdYyyy(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdYyyy_Asc() { regOBA("WMS_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdYyyy_Desc() { regOBD("WMS_UPD_YYYY"); return this; }

    protected ConditionValue _wmsUpdMm;
    public ConditionValue xdfgetWmsUpdMm()
    { if (_wmsUpdMm == null) { _wmsUpdMm = nCV(); }
      return _wmsUpdMm; }
    protected ConditionValue xgetCValueWmsUpdMm() { return xdfgetWmsUpdMm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdMm_Asc() { regOBA("WMS_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdMm_Desc() { regOBD("WMS_UPD_MM"); return this; }

    protected ConditionValue _wmsUpdDd;
    public ConditionValue xdfgetWmsUpdDd()
    { if (_wmsUpdDd == null) { _wmsUpdDd = nCV(); }
      return _wmsUpdDd; }
    protected ConditionValue xgetCValueWmsUpdDd() { return xdfgetWmsUpdDd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdDd_Asc() { regOBA("WMS_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdDd_Desc() { regOBD("WMS_UPD_DD"); return this; }

    protected ConditionValue _wmsUpdHh;
    public ConditionValue xdfgetWmsUpdHh()
    { if (_wmsUpdHh == null) { _wmsUpdHh = nCV(); }
      return _wmsUpdHh; }
    protected ConditionValue xgetCValueWmsUpdHh() { return xdfgetWmsUpdHh(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdHh_Asc() { regOBA("WMS_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdHh_Desc() { regOBD("WMS_UPD_HH"); return this; }

    protected ConditionValue _wmsUpdMi;
    public ConditionValue xdfgetWmsUpdMi()
    { if (_wmsUpdMi == null) { _wmsUpdMi = nCV(); }
      return _wmsUpdMi; }
    protected ConditionValue xgetCValueWmsUpdMi() { return xdfgetWmsUpdMi(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdMi_Asc() { regOBA("WMS_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdMi_Desc() { regOBD("WMS_UPD_MI"); return this; }

    protected ConditionValue _wmsUpdSs;
    public ConditionValue xdfgetWmsUpdSs()
    { if (_wmsUpdSs == null) { _wmsUpdSs = nCV(); }
      return _wmsUpdSs; }
    protected ConditionValue xgetCValueWmsUpdSs() { return xdfgetWmsUpdSs(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdSs_Asc() { regOBA("WMS_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdSs_Desc() { regOBD("WMS_UPD_SS"); return this; }

    protected ConditionValue _wmsUpdUserNm;
    public ConditionValue xdfgetWmsUpdUserNm()
    { if (_wmsUpdUserNm == null) { _wmsUpdUserNm = nCV(); }
      return _wmsUpdUserNm; }
    protected ConditionValue xgetCValueWmsUpdUserNm() { return xdfgetWmsUpdUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdUserNm_Asc() { regOBA("WMS_UPD_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_WmsUpdUserNm_Desc() { regOBD("WMS_UPD_USER_NM"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsErReceiveReportCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErReceiveReportCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsErReceiveReportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsErReceiveReportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ErReceiveReportCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ErReceiveReportCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ErReceiveReportCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ErReceiveReportCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ErReceiveReportCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ErReceiveReportCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ErReceiveReportCQ> _myselfExistsMap;
    public Map<String, ErReceiveReportCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ErReceiveReportCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ErReceiveReportCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ErReceiveReportCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ErReceiveReportCB.class.getName(); }
    protected String xCQ() { return ErReceiveReportCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
