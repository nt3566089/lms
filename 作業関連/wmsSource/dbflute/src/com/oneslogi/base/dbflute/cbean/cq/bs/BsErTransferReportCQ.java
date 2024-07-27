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
 * The base condition-query of er_transfer_report.
 * @author DBFlute(AutoGenerator)
 */
public class BsErTransferReportCQ extends AbstractBsErTransferReportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ErTransferReportCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsErTransferReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from er_transfer_report) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ErTransferReportCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ErTransferReportCIQ xcreateCIQ() {
        ErTransferReportCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ErTransferReportCIQ xnewCIQ() {
        return new ErTransferReportCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join er_transfer_report on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ErTransferReportCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ErTransferReportCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _transferReportId;
    public ConditionValue xdfgetTransferReportId()
    { if (_transferReportId == null) { _transferReportId = nCV(); }
      return _transferReportId; }
    protected ConditionValue xgetCValueTransferReportId() { return xdfgetTransferReportId(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_TransferReportId_Asc() { regOBA("TRANSFER_REPORT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_TransferReportId_Desc() { regOBD("TRANSFER_REPORT_ID"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

    protected ConditionValue _stockTransferDt;
    public ConditionValue xdfgetStockTransferDt()
    { if (_stockTransferDt == null) { _stockTransferDt = nCV(); }
      return _stockTransferDt; }
    protected ConditionValue xgetCValueStockTransferDt() { return xdfgetStockTransferDt(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_StockTransferDt_Asc() { regOBA("STOCK_TRANSFER_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_StockTransferDt_Desc() { regOBD("STOCK_TRANSFER_DT"); return this; }

    protected ConditionValue _receivePlantCd;
    public ConditionValue xdfgetReceivePlantCd()
    { if (_receivePlantCd == null) { _receivePlantCd = nCV(); }
      return _receivePlantCd; }
    protected ConditionValue xgetCValueReceivePlantCd() { return xdfgetReceivePlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceivePlantCd_Asc() { regOBA("RECEIVE_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceivePlantCd_Desc() { regOBD("RECEIVE_PLANT_CD"); return this; }

    protected ConditionValue _receiveStorageSpaceCd;
    public ConditionValue xdfgetReceiveStorageSpaceCd()
    { if (_receiveStorageSpaceCd == null) { _receiveStorageSpaceCd = nCV(); }
      return _receiveStorageSpaceCd; }
    protected ConditionValue xgetCValueReceiveStorageSpaceCd() { return xdfgetReceiveStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceiveStorageSpaceCd_Asc() { regOBA("RECEIVE_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ReceiveStorageSpaceCd_Desc() { regOBD("RECEIVE_STORAGE_SPACE_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _transferTypeCd;
    public ConditionValue xdfgetTransferTypeCd()
    { if (_transferTypeCd == null) { _transferTypeCd = nCV(); }
      return _transferTypeCd; }
    protected ConditionValue xgetCValueTransferTypeCd() { return xdfgetTransferTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_TransferTypeCd_Asc() { regOBA("TRANSFER_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_TransferTypeCd_Desc() { regOBD("TRANSFER_TYPE_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_Num_Asc() { regOBA("NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM: {DECIMAL(14, 4)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_Num_Desc() { regOBD("NUM"); return this; }

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
    public BsErTransferReportCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

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
    public BsErTransferReportCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

    protected ConditionValue _s4SendFlg;
    public ConditionValue xdfgetS4SendFlg()
    { if (_s4SendFlg == null) { _s4SendFlg = nCV(); }
      return _s4SendFlg; }
    protected ConditionValue xgetCValueS4SendFlg() { return xdfgetS4SendFlg(); }

    /**
     * Add order-by as ascend. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_S4SendFlg_Asc() { regOBA("S4_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_S4SendFlg_Desc() { regOBD("S4_SEND_FLG"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddYyyy_Asc() { regOBA("WMS_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddYyyy_Desc() { regOBD("WMS_ADD_YYYY"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddMm_Asc() { regOBA("WMS_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddMm_Desc() { regOBD("WMS_ADD_MM"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddDd_Asc() { regOBA("WMS_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddDd_Desc() { regOBD("WMS_ADD_DD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddHh_Asc() { regOBA("WMS_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddHh_Desc() { regOBD("WMS_ADD_HH"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddMi_Asc() { regOBA("WMS_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddMi_Desc() { regOBD("WMS_ADD_MI"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsAddSs_Asc() { regOBA("WMS_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddSs_Desc() { regOBD("WMS_ADD_SS"); return this; }

    protected ConditionValue _wmsAddUserCd;
    public ConditionValue xdfgetWmsAddUserCd()
    { if (_wmsAddUserCd == null) { _wmsAddUserCd = nCV(); }
      return _wmsAddUserCd; }
    protected ConditionValue xgetCValueWmsAddUserCd() { return xdfgetWmsAddUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddUserCd_Asc() { regOBA("WMS_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsAddUserCd_Desc() { regOBD("WMS_ADD_USER_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdYyyy_Asc() { regOBA("WMS_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdYyyy_Desc() { regOBD("WMS_UPD_YYYY"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdMm_Asc() { regOBA("WMS_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdMm_Desc() { regOBD("WMS_UPD_MM"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdDd_Asc() { regOBA("WMS_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdDd_Desc() { regOBD("WMS_UPD_DD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdHh_Asc() { regOBA("WMS_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdHh_Desc() { regOBD("WMS_UPD_HH"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdMi_Asc() { regOBA("WMS_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdMi_Desc() { regOBD("WMS_UPD_MI"); return this; }

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
    public BsErTransferReportCQ addOrderBy_WmsUpdSs_Asc() { regOBA("WMS_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdSs_Desc() { regOBD("WMS_UPD_SS"); return this; }

    protected ConditionValue _wmsUpdUserCd;
    public ConditionValue xdfgetWmsUpdUserCd()
    { if (_wmsUpdUserCd == null) { _wmsUpdUserCd = nCV(); }
      return _wmsUpdUserCd; }
    protected ConditionValue xgetCValueWmsUpdUserCd() { return xdfgetWmsUpdUserCd(); }

    /**
     * Add order-by as ascend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdUserCd_Asc() { regOBA("WMS_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_WmsUpdUserCd_Desc() { regOBD("WMS_UPD_USER_CD"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr02_Asc() { regOBA("DATA_TRANSFER_ONLY_STR02"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr02_Desc() { regOBD("DATA_TRANSFER_ONLY_STR02"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr03_Asc() { regOBA("DATA_TRANSFER_ONLY_STR03"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr03_Desc() { regOBD("DATA_TRANSFER_ONLY_STR03"); return this; }

    protected ConditionValue _dataTransferOnlyStr04;
    public ConditionValue xdfgetDataTransferOnlyStr04()
    { if (_dataTransferOnlyStr04 == null) { _dataTransferOnlyStr04 = nCV(); }
      return _dataTransferOnlyStr04; }
    protected ConditionValue xgetCValueDataTransferOnlyStr04() { return xdfgetDataTransferOnlyStr04(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr04_Asc() { regOBA("DATA_TRANSFER_ONLY_STR04"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr04_Desc() { regOBD("DATA_TRANSFER_ONLY_STR04"); return this; }

    protected ConditionValue _dataTransferOnlyStr05;
    public ConditionValue xdfgetDataTransferOnlyStr05()
    { if (_dataTransferOnlyStr05 == null) { _dataTransferOnlyStr05 = nCV(); }
      return _dataTransferOnlyStr05; }
    protected ConditionValue xgetCValueDataTransferOnlyStr05() { return xdfgetDataTransferOnlyStr05(); }

    /**
     * Add order-by as ascend. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr05_Asc() { regOBA("DATA_TRANSFER_ONLY_STR05"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr05_Desc() { regOBD("DATA_TRANSFER_ONLY_STR05"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr06_Asc() { regOBA("DATA_TRANSFER_ONLY_STR06"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr06_Desc() { regOBD("DATA_TRANSFER_ONLY_STR06"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr07_Asc() { regOBA("DATA_TRANSFER_ONLY_STR07"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr07_Desc() { regOBD("DATA_TRANSFER_ONLY_STR07"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr08_Asc() { regOBA("DATA_TRANSFER_ONLY_STR08"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr08_Desc() { regOBD("DATA_TRANSFER_ONLY_STR08"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr09_Asc() { regOBA("DATA_TRANSFER_ONLY_STR09"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DataTransferOnlyStr09_Desc() { regOBD("DATA_TRANSFER_ONLY_STR09"); return this; }

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
    public BsErTransferReportCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsErTransferReportCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsErTransferReportCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsErTransferReportCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsErTransferReportCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsErTransferReportCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsErTransferReportCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsErTransferReportCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsErTransferReportCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsErTransferReportCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErTransferReportCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsErTransferReportCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsErTransferReportCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ErTransferReportCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ErTransferReportCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ErTransferReportCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ErTransferReportCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ErTransferReportCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ErTransferReportCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ErTransferReportCQ> _myselfExistsMap;
    public Map<String, ErTransferReportCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ErTransferReportCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ErTransferReportCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ErTransferReportCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ErTransferReportCB.class.getName(); }
    protected String xCQ() { return ErTransferReportCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
