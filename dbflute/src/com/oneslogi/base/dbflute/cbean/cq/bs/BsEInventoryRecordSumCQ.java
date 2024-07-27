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
 * The base condition-query of e_inventory_record_sum.
 * @author DBFlute(AutoGenerator)
 */
public class BsEInventoryRecordSumCQ extends AbstractBsEInventoryRecordSumCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EInventoryRecordSumCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEInventoryRecordSumCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from e_inventory_record_sum) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EInventoryRecordSumCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EInventoryRecordSumCIQ xcreateCIQ() {
        EInventoryRecordSumCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EInventoryRecordSumCIQ xnewCIQ() {
        return new EInventoryRecordSumCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join e_inventory_record_sum on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EInventoryRecordSumCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EInventoryRecordSumCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryRecordSumId;
    public ConditionValue xdfgetInventoryRecordSumId()
    { if (_inventoryRecordSumId == null) { _inventoryRecordSumId = nCV(); }
      return _inventoryRecordSumId; }
    protected ConditionValue xgetCValueInventoryRecordSumId() { return xdfgetInventoryRecordSumId(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_SUM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_InventoryRecordSumId_Asc() { regOBA("INVENTORY_RECORD_SUM_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_SUM_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_InventoryRecordSumId_Desc() { regOBD("INVENTORY_RECORD_SUM_ID"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_InventorySlipNo_Asc() { regOBA("INVENTORY_SLIP_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_InventorySlipNo_Desc() { regOBD("INVENTORY_SLIP_NO"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_FiscalYear_Asc() { regOBA("FISCAL_YEAR"); return this; }

    /**
     * Add order-by as descend. <br>
     * FISCAL_YEAR: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_FiscalYear_Desc() { regOBD("FISCAL_YEAR"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_InventorySlipRowNo_Asc() { regOBA("INVENTORY_SLIP_ROW_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_SLIP_ROW_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_InventorySlipRowNo_Desc() { regOBD("INVENTORY_SLIP_ROW_NO"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_PlantCd_Asc() { regOBA("PLANT_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_PlantCd_Desc() { regOBD("PLANT_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_StorageSpaceCd_Asc() { regOBA("STORAGE_SPACE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_StorageSpaceCd_Desc() { regOBD("STORAGE_SPACE_CD"); return this; }

    protected ConditionValue _referenceDt;
    public ConditionValue xdfgetReferenceDt()
    { if (_referenceDt == null) { _referenceDt = nCV(); }
      return _referenceDt; }
    protected ConditionValue xgetCValueReferenceDt() { return xdfgetReferenceDt(); }

    /**
     * Add order-by as ascend. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_ReferenceDt_Asc() { regOBA("REFERENCE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * REFERENCE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_ReferenceDt_Desc() { regOBD("REFERENCE_DT"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

    protected ConditionValue _stockNum;
    public ConditionValue xdfgetStockNum()
    { if (_stockNum == null) { _stockNum = nCV(); }
      return _stockNum; }
    protected ConditionValue xgetCValueStockNum() { return xdfgetStockNum(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_StockNum_Asc() { regOBA("STOCK_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_StockNum_Desc() { regOBD("STOCK_NUM"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_ProductNmKanji_Asc() { regOBA("PRODUCT_NM_KANJI"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_ProductNmKanji_Desc() { regOBD("PRODUCT_NM_KANJI"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_Barcode_Asc() { regOBA("BARCODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * BARCODE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_Barcode_Desc() { regOBD("BARCODE"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_DepositJanCd_Asc() { regOBA("DEPOSIT_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_DepositJanCd_Desc() { regOBD("DEPOSIT_JAN_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaCd_Asc() { regOBA("TENHANSHA_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaCd_Desc() { regOBD("TENHANSHA_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_SalesOrgCd_Asc() { regOBA("SALES_ORG_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_SalesOrgCd_Desc() { regOBD("SALES_ORG_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaNm1_Asc() { regOBA("TENHANSHA_NM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaNm1_Desc() { regOBD("TENHANSHA_NM1"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaNm2_Asc() { regOBA("TENHANSHA_NM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_TenhanshaNm2_Desc() { regOBD("TENHANSHA_NM2"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_SapUserCd_Asc() { regOBA("SAP_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_SapUserCd_Desc() { regOBD("SAP_USER_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_SapUserNm_Asc() { regOBA("SAP_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_SapUserNm_Desc() { regOBD("SAP_USER_NM"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_AllocTypeCd_Asc() { regOBA("ALLOC_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * ALLOC_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_AllocTypeCd_Desc() { regOBD("ALLOC_TYPE_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddYyyy_Asc() { regOBA("WMS_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddYyyy_Desc() { regOBD("WMS_ADD_YYYY"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddMm_Asc() { regOBA("WMS_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddMm_Desc() { regOBD("WMS_ADD_MM"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddDd_Asc() { regOBA("WMS_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddDd_Desc() { regOBD("WMS_ADD_DD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddHh_Asc() { regOBA("WMS_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddHh_Desc() { regOBD("WMS_ADD_HH"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddMi_Asc() { regOBA("WMS_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddMi_Desc() { regOBD("WMS_ADD_MI"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddSs_Asc() { regOBA("WMS_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddSs_Desc() { regOBD("WMS_ADD_SS"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddUserCd_Asc() { regOBA("WMS_ADD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsAddUserCd_Desc() { regOBD("WMS_ADD_USER_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdYyyy_Asc() { regOBA("WMS_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdYyyy_Desc() { regOBD("WMS_UPD_YYYY"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdMm_Asc() { regOBA("WMS_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdMm_Desc() { regOBD("WMS_UPD_MM"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdDd_Asc() { regOBA("WMS_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdDd_Desc() { regOBD("WMS_UPD_DD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdHh_Asc() { regOBA("WMS_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdHh_Desc() { regOBD("WMS_UPD_HH"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdMi_Asc() { regOBA("WMS_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdMi_Desc() { regOBD("WMS_UPD_MI"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdSs_Asc() { regOBA("WMS_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdSs_Desc() { regOBD("WMS_UPD_SS"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdUserCd_Asc() { regOBA("WMS_UPD_USER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_WmsUpdUserCd_Desc() { regOBD("WMS_UPD_USER_CD"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEInventoryRecordSumCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEInventoryRecordSumCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEInventoryRecordSumCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEInventoryRecordSumCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EInventoryRecordSumCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EInventoryRecordSumCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EInventoryRecordSumCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EInventoryRecordSumCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EInventoryRecordSumCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EInventoryRecordSumCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EInventoryRecordSumCQ> _myselfExistsMap;
    public Map<String, EInventoryRecordSumCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EInventoryRecordSumCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EInventoryRecordSumCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EInventoryRecordSumCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EInventoryRecordSumCB.class.getName(); }
    protected String xCQ() { return EInventoryRecordSumCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
