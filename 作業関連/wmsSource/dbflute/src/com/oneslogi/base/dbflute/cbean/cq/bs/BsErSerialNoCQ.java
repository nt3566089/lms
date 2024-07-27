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
 * The base condition-query of er_serial_no.
 * @author DBFlute(AutoGenerator)
 */
public class BsErSerialNoCQ extends AbstractBsErSerialNoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ErSerialNoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsErSerialNoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from er_serial_no) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ErSerialNoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ErSerialNoCIQ xcreateCIQ() {
        ErSerialNoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ErSerialNoCIQ xnewCIQ() {
        return new ErSerialNoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join er_serial_no on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ErSerialNoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ErSerialNoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _serialNoId;
    public ConditionValue xdfgetSerialNoId()
    { if (_serialNoId == null) { _serialNoId = nCV(); }
      return _serialNoId; }
    protected ConditionValue xgetCValueSerialNoId() { return xdfgetSerialNoId(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SerialNoId_Asc() { regOBA("SERIAL_NO_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SerialNoId_Desc() { regOBD("SERIAL_NO_ID"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ShippingSlipNo_Asc() { regOBA("SHIPPING_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ShippingSlipNo_Desc() { regOBD("SHIPPING_SLIP_NO"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ShippingSlipRowNo_Asc() { regOBA("SHIPPING_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ShippingSlipRowNo_Desc() { regOBD("SHIPPING_SLIP_ROW_NO"); return this; }

    protected ConditionValue _serialNo;
    public ConditionValue xdfgetSerialNo()
    { if (_serialNo == null) { _serialNo = nCV(); }
      return _serialNo; }
    protected ConditionValue xgetCValueSerialNo() { return xdfgetSerialNo(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SerialNo_Asc() { regOBA("SERIAL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SerialNo_Desc() { regOBD("SERIAL_NO"); return this; }

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
    public BsErSerialNoCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_HinmokuGroup_Asc() { regOBA("HINMOKU_GROUP"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_HinmokuGroup_Desc() { regOBD("HINMOKU_GROUP"); return this; }

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
    public BsErSerialNoCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsErSerialNoCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _unitNm;
    public ConditionValue xdfgetUnitNm()
    { if (_unitNm == null) { _unitNm = nCV(); }
      return _unitNm; }
    protected ConditionValue xgetCValueUnitNm() { return xdfgetUnitNm(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

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
    public BsErSerialNoCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ShippingDt_Asc() { regOBA("SHIPPING_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ShippingDt_Desc() { regOBD("SHIPPING_DT"); return this; }

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
    public BsErSerialNoCQ addOrderBy_CustomerCd_Asc() { regOBA("CUSTOMER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_CustomerCd_Desc() { regOBD("CUSTOMER_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationCd_Asc() { regOBA("DESTINATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationCd_Desc() { regOBD("DESTINATION_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationNm1_Asc() { regOBA("DESTINATION_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationNm1_Desc() { regOBD("DESTINATION_NM1"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationNm2_Asc() { regOBA("DESTINATION_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationNm2_Desc() { regOBD("DESTINATION_NM2"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationNmKana_Asc() { regOBA("DESTINATION_NM_KANA"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationNmKana_Desc() { regOBD("DESTINATION_NM_KANA"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationZipCd_Asc() { regOBA("DESTINATION_ZIP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationZipCd_Desc() { regOBD("DESTINATION_ZIP_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationAddress1_Asc() { regOBA("DESTINATION_ADDRESS1"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationAddress1_Desc() { regOBD("DESTINATION_ADDRESS1"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationAddress2_Asc() { regOBA("DESTINATION_ADDRESS2"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationAddress2_Desc() { regOBD("DESTINATION_ADDRESS2"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DestinationTel_Asc() { regOBA("DESTINATION_TEL"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DestinationTel_Desc() { regOBD("DESTINATION_TEL"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ShippingPlantCd_Asc() { regOBA("SHIPPING_PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ShippingPlantCd_Desc() { regOBD("SHIPPING_PLANT_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ShippingStorageSpaceCd_Asc() { regOBA("SHIPPING_STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ShippingStorageSpaceCd_Desc() { regOBD("SHIPPING_STORAGE_SPACE_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddYyyy_Asc() { regOBA("WMS_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddYyyy_Desc() { regOBD("WMS_ADD_YYYY"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddMm_Asc() { regOBA("WMS_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddMm_Desc() { regOBD("WMS_ADD_MM"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddDd_Asc() { regOBA("WMS_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddDd_Desc() { regOBD("WMS_ADD_DD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddHh_Asc() { regOBA("WMS_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddHh_Desc() { regOBD("WMS_ADD_HH"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddMi_Asc() { regOBA("WMS_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddMi_Desc() { regOBD("WMS_ADD_MI"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddSs_Asc() { regOBA("WMS_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddSs_Desc() { regOBD("WMS_ADD_SS"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsAddUserCd_Asc() { regOBA("WMS_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsAddUserCd_Desc() { regOBD("WMS_ADD_USER_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdYyyy_Asc() { regOBA("WMS_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdYyyy_Desc() { regOBD("WMS_UPD_YYYY"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdMm_Asc() { regOBA("WMS_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdMm_Desc() { regOBD("WMS_UPD_MM"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdDd_Asc() { regOBA("WMS_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdDd_Desc() { regOBD("WMS_UPD_DD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdHh_Asc() { regOBA("WMS_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdHh_Desc() { regOBD("WMS_UPD_HH"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdMi_Asc() { regOBA("WMS_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdMi_Desc() { regOBD("WMS_UPD_MI"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdSs_Asc() { regOBA("WMS_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdSs_Desc() { regOBD("WMS_UPD_SS"); return this; }

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
    public BsErSerialNoCQ addOrderBy_WmsUpdUserCd_Asc() { regOBA("WMS_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_WmsUpdUserCd_Desc() { regOBD("WMS_UPD_USER_CD"); return this; }

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
    public BsErSerialNoCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsErSerialNoCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsErSerialNoCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsErSerialNoCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsErSerialNoCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsErSerialNoCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsErSerialNoCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsErSerialNoCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsErSerialNoCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsErSerialNoCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErSerialNoCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsErSerialNoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsErSerialNoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ErSerialNoCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ErSerialNoCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ErSerialNoCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ErSerialNoCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ErSerialNoCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ErSerialNoCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ErSerialNoCQ> _myselfExistsMap;
    public Map<String, ErSerialNoCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ErSerialNoCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ErSerialNoCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ErSerialNoCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ErSerialNoCB.class.getName(); }
    protected String xCQ() { return ErSerialNoCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
