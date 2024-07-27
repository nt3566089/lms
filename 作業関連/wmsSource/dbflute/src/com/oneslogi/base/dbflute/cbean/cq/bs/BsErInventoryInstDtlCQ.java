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
 * The base condition-query of er_inventory_inst_dtl.
 * @author DBFlute(AutoGenerator)
 */
public class BsErInventoryInstDtlCQ extends AbstractBsErInventoryInstDtlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ErInventoryInstDtlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsErInventoryInstDtlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from er_inventory_inst_dtl) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ErInventoryInstDtlCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ErInventoryInstDtlCIQ xcreateCIQ() {
        ErInventoryInstDtlCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ErInventoryInstDtlCIQ xnewCIQ() {
        return new ErInventoryInstDtlCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join er_inventory_inst_dtl on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ErInventoryInstDtlCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ErInventoryInstDtlCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryInstDtlId;
    public ConditionValue xdfgetInventoryInstDtlId()
    { if (_inventoryInstDtlId == null) { _inventoryInstDtlId = nCV(); }
      return _inventoryInstDtlId; }
    protected ConditionValue xgetCValueInventoryInstDtlId() { return xdfgetInventoryInstDtlId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventoryInstDtlId_Asc() { regOBA("INVENTORY_INST_DTL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_INST_DTL_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventoryInstDtlId_Desc() { regOBD("INVENTORY_INST_DTL_ID"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ReceiveCd_Asc() { regOBA("RECEIVE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ReceiveCd_Desc() { regOBD("RECEIVE_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ReceiveRowId_Asc() { regOBA("RECEIVE_ROW_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ReceiveRowId_Desc() { regOBD("RECEIVE_ROW_ID"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ImportFlg_Asc() { regOBA("IMPORT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ImportFlg_Desc() { regOBD("IMPORT_FLG"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ErrorFlg_Asc() { regOBA("ERROR_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ErrorFlg_Desc() { regOBD("ERROR_FLG"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ErrorMessageCd_Asc() { regOBA("ERROR_MESSAGE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ErrorMessageCd_Desc() { regOBD("ERROR_MESSAGE_CD"); return this; }

    protected ConditionValue _inventorySlipNo;
    public ConditionValue xdfgetInventorySlipNo()
    { if (_inventorySlipNo == null) { _inventorySlipNo = nCV(); }
      return _inventorySlipNo; }
    protected ConditionValue xgetCValueInventorySlipNo() { return xdfgetInventorySlipNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventorySlipNo_Asc() { regOBA("INVENTORY_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventorySlipNo_Desc() { regOBD("INVENTORY_SLIP_NO"); return this; }

    protected ConditionValue _fiscalYear;
    public ConditionValue xdfgetFiscalYear()
    { if (_fiscalYear == null) { _fiscalYear = nCV(); }
      return _fiscalYear; }
    protected ConditionValue xgetCValueFiscalYear() { return xdfgetFiscalYear(); }

    /**
     * Add order-by as ascend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_FiscalYear_Asc() { regOBA("FISCAL_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_FiscalYear_Desc() { regOBD("FISCAL_YEAR"); return this; }

    protected ConditionValue _inventorySlipRowNo;
    public ConditionValue xdfgetInventorySlipRowNo()
    { if (_inventorySlipRowNo == null) { _inventorySlipRowNo = nCV(); }
      return _inventorySlipRowNo; }
    protected ConditionValue xgetCValueInventorySlipRowNo() { return xdfgetInventorySlipRowNo(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventorySlipRowNo_Asc() { regOBA("INVENTORY_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_InventorySlipRowNo_Desc() { regOBD("INVENTORY_SLIP_ROW_NO"); return this; }

    protected ConditionValue _plantCd;
    public ConditionValue xdfgetPlantCd()
    { if (_plantCd == null) { _plantCd = nCV(); }
      return _plantCd; }
    protected ConditionValue xgetCValuePlantCd() { return xdfgetPlantCd(); }

    /**
     * Add order-by as ascend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

    protected ConditionValue _storageSpaceCd;
    public ConditionValue xdfgetStorageSpaceCd()
    { if (_storageSpaceCd == null) { _storageSpaceCd = nCV(); }
      return _storageSpaceCd; }
    protected ConditionValue xgetCValueStorageSpaceCd() { return xdfgetStorageSpaceCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _referenceDt;
    public ConditionValue xdfgetReferenceDt()
    { if (_referenceDt == null) { _referenceDt = nCV(); }
      return _referenceDt; }
    protected ConditionValue xgetCValueReferenceDt() { return xdfgetReferenceDt(); }

    /**
     * Add order-by as ascend. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ReferenceDt_Asc() { regOBA("REFERENCE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERENCE_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ReferenceDt_Desc() { regOBD("REFERENCE_DT"); return this; }

    protected ConditionValue _hinmokuCd;
    public ConditionValue xdfgetHinmokuCd()
    { if (_hinmokuCd == null) { _hinmokuCd = nCV(); }
      return _hinmokuCd; }
    protected ConditionValue xgetCValueHinmokuCd() { return xdfgetHinmokuCd(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

    protected ConditionValue _stockNum;
    public ConditionValue xdfgetStockNum()
    { if (_stockNum == null) { _stockNum = nCV(); }
      return _stockNum; }
    protected ConditionValue xgetCValueStockNum() { return xdfgetStockNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_StockNum_Asc() { regOBA("STOCK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_StockNum_Desc() { regOBD("STOCK_NUM"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _productNmKanji;
    public ConditionValue xdfgetProductNmKanji()
    { if (_productNmKanji == null) { _productNmKanji = nCV(); }
      return _productNmKanji; }
    protected ConditionValue xgetCValueProductNmKanji() { return xdfgetProductNmKanji(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ProductNmKanji_Asc() { regOBA("PRODUCT_NM_KANJI"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ProductNmKanji_Desc() { regOBD("PRODUCT_NM_KANJI"); return this; }

    protected ConditionValue _barcode;
    public ConditionValue xdfgetBarcode()
    { if (_barcode == null) { _barcode = nCV(); }
      return _barcode; }
    protected ConditionValue xgetCValueBarcode() { return xdfgetBarcode(); }

    /**
     * Add order-by as ascend. <br>
     * BARCODE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_Barcode_Asc() { regOBA("BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BARCODE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_Barcode_Desc() { regOBD("BARCODE"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_DepositJanCd_Asc() { regOBA("DEPOSIT_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_DepositJanCd_Desc() { regOBD("DEPOSIT_JAN_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaNm1_Asc() { regOBA("TENHANSHA_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaNm1_Desc() { regOBD("TENHANSHA_NM1"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaNm2_Asc() { regOBA("TENHANSHA_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_TenhanshaNm2_Desc() { regOBD("TENHANSHA_NM2"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUserCd_Asc() { regOBA("SAP_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUserCd_Desc() { regOBD("SAP_USER_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUserNm_Asc() { regOBA("SAP_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUserNm_Desc() { regOBD("SAP_USER_NM"); return this; }

    protected ConditionValue _allocTypeCd;
    public ConditionValue xdfgetAllocTypeCd()
    { if (_allocTypeCd == null) { _allocTypeCd = nCV(); }
      return _allocTypeCd; }
    protected ConditionValue xgetCValueAllocTypeCd() { return xdfgetAllocTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_AllocTypeCd_Asc() { regOBA("ALLOC_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_AllocTypeCd_Desc() { regOBD("ALLOC_TYPE_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_LpSendFlg_Asc() { regOBA("LP_SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LP_SEND_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_LpSendFlg_Desc() { regOBD("LP_SEND_FLG"); return this; }

    protected ConditionValue _productType;
    public ConditionValue xdfgetProductType()
    { if (_productType == null) { _productType = nCV(); }
      return _productType; }
    protected ConditionValue xgetCValueProductType() { return xdfgetProductType(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ProductType_Asc() { regOBA("PRODUCT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ProductType_Desc() { regOBD("PRODUCT_TYPE"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapAddUserCd_Asc() { regOBA("SAP_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapAddUserCd_Desc() { regOBD("SAP_ADD_USER_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdUserCd_Asc() { regOBA("SAP_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SapUpdUserCd_Desc() { regOBD("SAP_UPD_USER_CD"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsErInventoryInstDtlCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsErInventoryInstDtlCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsErInventoryInstDtlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsErInventoryInstDtlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, ErInventoryInstDtlCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ErInventoryInstDtlCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ErInventoryInstDtlCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ErInventoryInstDtlCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ErInventoryInstDtlCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ErInventoryInstDtlCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ErInventoryInstDtlCQ> _myselfExistsMap;
    public Map<String, ErInventoryInstDtlCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ErInventoryInstDtlCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ErInventoryInstDtlCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ErInventoryInstDtlCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ErInventoryInstDtlCB.class.getName(); }
    protected String xCQ() { return ErInventoryInstDtlCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
