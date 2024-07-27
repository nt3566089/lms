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
 * The base condition-query of es_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsEsProductCQ extends AbstractBsEsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EsProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from es_product) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EsProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EsProductCIQ xcreateCIQ() {
        EsProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EsProductCIQ xnewCIQ() {
        return new EsProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join es_product on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EsProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EsProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _productId;
    public ConditionValue xdfgetProductId()
    { if (_productId == null) { _productId = nCV(); }
      return _productId; }
    protected ConditionValue xgetCValueProductId() { return xdfgetProductId(); }

    /**
     * Add order-by as ascend. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_ID: {PK, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

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
    public BsEsProductCQ addOrderBy_SendFlg_Asc() { regOBA("SEND_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SendFlg_Desc() { regOBD("SEND_FLG"); return this; }

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
    public BsEsProductCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

    protected ConditionValue _hinmokuGroupCd;
    public ConditionValue xdfgetHinmokuGroupCd()
    { if (_hinmokuGroupCd == null) { _hinmokuGroupCd = nCV(); }
      return _hinmokuGroupCd; }
    protected ConditionValue xgetCValueHinmokuGroupCd() { return xdfgetHinmokuGroupCd(); }

    /**
     * Add order-by as ascend. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_HinmokuGroupCd_Asc() { regOBA("HINMOKU_GROUP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_HinmokuGroupCd_Desc() { regOBD("HINMOKU_GROUP_CD"); return this; }

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
    public BsEsProductCQ addOrderBy_HinmokuText_Asc() { regOBA("HINMOKU_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_HinmokuText_Desc() { regOBD("HINMOKU_TEXT"); return this; }

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
    public BsEsProductCQ addOrderBy_JanCd_Asc() { regOBA("JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_JanCd_Desc() { regOBD("JAN_CD"); return this; }

    protected ConditionValue _sizeNm;
    public ConditionValue xdfgetSizeNm()
    { if (_sizeNm == null) { _sizeNm = nCV(); }
      return _sizeNm; }
    protected ConditionValue xgetCValueSizeNm() { return xdfgetSizeNm(); }

    /**
     * Add order-by as ascend. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SizeNm_Asc() { regOBA("SIZE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SIZE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SizeNm_Desc() { regOBD("SIZE_NM"); return this; }

    protected ConditionValue _caseTypeCd;
    public ConditionValue xdfgetCaseTypeCd()
    { if (_caseTypeCd == null) { _caseTypeCd = nCV(); }
      return _caseTypeCd; }
    protected ConditionValue xgetCValueCaseTypeCd() { return xdfgetCaseTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_CaseTypeCd_Asc() { regOBA("CASE_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_CaseTypeCd_Desc() { regOBD("CASE_TYPE_CD"); return this; }

    protected ConditionValue _unitNum;
    public ConditionValue xdfgetUnitNum()
    { if (_unitNum == null) { _unitNum = nCV(); }
      return _unitNum; }
    protected ConditionValue xgetCValueUnitNum() { return xdfgetUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UnitNum_Asc() { regOBA("UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UnitNum_Desc() { regOBD("UNIT_NUM"); return this; }

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
    public BsEsProductCQ addOrderBy_LogiWeightFlg_Asc() { regOBA("LOGI_WEIGHT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_LogiWeightFlg_Desc() { regOBD("LOGI_WEIGHT_FLG"); return this; }

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
    public BsEsProductCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

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
    public BsEsProductCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

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
    public BsEsProductCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _oldJanCd;
    public ConditionValue xdfgetOldJanCd()
    { if (_oldJanCd == null) { _oldJanCd = nCV(); }
      return _oldJanCd; }
    protected ConditionValue xgetCValueOldJanCd() { return xdfgetOldJanCd(); }

    /**
     * Add order-by as ascend. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_OldJanCd_Asc() { regOBA("OLD_JAN_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OLD_JAN_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_OldJanCd_Desc() { regOBD("OLD_JAN_CD"); return this; }

    protected ConditionValue _sapAddDt;
    public ConditionValue xdfgetSapAddDt()
    { if (_sapAddDt == null) { _sapAddDt = nCV(); }
      return _sapAddDt; }
    protected ConditionValue xgetCValueSapAddDt() { return xdfgetSapAddDt(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddDt_Asc() { regOBA("SAP_ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddDt_Desc() { regOBD("SAP_ADD_DT"); return this; }

    protected ConditionValue _sapAddTime;
    public ConditionValue xdfgetSapAddTime()
    { if (_sapAddTime == null) { _sapAddTime = nCV(); }
      return _sapAddTime; }
    protected ConditionValue xgetCValueSapAddTime() { return xdfgetSapAddTime(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddTime_Asc() { regOBA("SAP_ADD_TIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_TIME: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddTime_Desc() { regOBD("SAP_ADD_TIME"); return this; }

    protected ConditionValue _storageLocationTypeCd;
    public ConditionValue xdfgetStorageLocationTypeCd()
    { if (_storageLocationTypeCd == null) { _storageLocationTypeCd = nCV(); }
      return _storageLocationTypeCd; }
    protected ConditionValue xgetCValueStorageLocationTypeCd() { return xdfgetStorageLocationTypeCd(); }

    /**
     * Add order-by as ascend. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_StorageLocationTypeCd_Asc() { regOBA("STORAGE_LOCATION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * STORAGE_LOCATION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_StorageLocationTypeCd_Desc() { regOBD("STORAGE_LOCATION_TYPE_CD"); return this; }

    protected ConditionValue _medicalManagFlg;
    public ConditionValue xdfgetMedicalManagFlg()
    { if (_medicalManagFlg == null) { _medicalManagFlg = nCV(); }
      return _medicalManagFlg; }
    protected ConditionValue xgetCValueMedicalManagFlg() { return xdfgetMedicalManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_MedicalManagFlg_Asc() { regOBA("MEDICAL_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MEDICAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_MedicalManagFlg_Desc() { regOBD("MEDICAL_MANAG_FLG"); return this; }

    protected ConditionValue _prodDtManagFlg;
    public ConditionValue xdfgetProdDtManagFlg()
    { if (_prodDtManagFlg == null) { _prodDtManagFlg = nCV(); }
      return _prodDtManagFlg; }
    protected ConditionValue xgetCValueProdDtManagFlg() { return xdfgetProdDtManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtManagFlg_Asc() { regOBA("PROD_DT_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtManagFlg_Desc() { regOBD("PROD_DT_MANAG_FLG"); return this; }

    protected ConditionValue _prodDtLimitDaysRcv;
    public ConditionValue xdfgetProdDtLimitDaysRcv()
    { if (_prodDtLimitDaysRcv == null) { _prodDtLimitDaysRcv = nCV(); }
      return _prodDtLimitDaysRcv; }
    protected ConditionValue xgetCValueProdDtLimitDaysRcv() { return xdfgetProdDtLimitDaysRcv(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtLimitDaysRcv_Asc() { regOBA("PROD_DT_LIMIT_DAYS_RCV"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_LIMIT_DAYS_RCV: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtLimitDaysRcv_Desc() { regOBD("PROD_DT_LIMIT_DAYS_RCV"); return this; }

    protected ConditionValue _prodDtLimitDaysShp;
    public ConditionValue xdfgetProdDtLimitDaysShp()
    { if (_prodDtLimitDaysShp == null) { _prodDtLimitDaysShp = nCV(); }
      return _prodDtLimitDaysShp; }
    protected ConditionValue xgetCValueProdDtLimitDaysShp() { return xdfgetProdDtLimitDaysShp(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtLimitDaysShp_Asc() { regOBA("PROD_DT_LIMIT_DAYS_SHP"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT_LIMIT_DAYS_SHP: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ProdDtLimitDaysShp_Desc() { regOBD("PROD_DT_LIMIT_DAYS_SHP"); return this; }

    protected ConditionValue _nizoroe10Num;
    public ConditionValue xdfgetNizoroe10Num()
    { if (_nizoroe10Num == null) { _nizoroe10Num = nCV(); }
      return _nizoroe10Num; }
    protected ConditionValue xgetCValueNizoroe10Num() { return xdfgetNizoroe10Num(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_Nizoroe10Num_Asc() { regOBA("NIZOROE_10_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_10_NUM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_Nizoroe10Num_Desc() { regOBD("NIZOROE_10_NUM"); return this; }

    protected ConditionValue _serialManagFlg;
    public ConditionValue xdfgetSerialManagFlg()
    { if (_serialManagFlg == null) { _serialManagFlg = nCV(); }
      return _serialManagFlg; }
    protected ConditionValue xgetCValueSerialManagFlg() { return xdfgetSerialManagFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SerialManagFlg_Asc() { regOBA("SERIAL_MANAG_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SERIAL_MANAG_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SerialManagFlg_Desc() { regOBD("SERIAL_MANAG_FLG"); return this; }

    protected ConditionValue _ocrDateFormat;
    public ConditionValue xdfgetOcrDateFormat()
    { if (_ocrDateFormat == null) { _ocrDateFormat = nCV(); }
      return _ocrDateFormat; }
    protected ConditionValue xgetCValueOcrDateFormat() { return xdfgetOcrDateFormat(); }

    /**
     * Add order-by as ascend. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_OcrDateFormat_Asc() { regOBA("OCR_DATE_FORMAT"); return this; }

    /**
     * Add order-by as descend. <br>
     * OCR_DATE_FORMAT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_OcrDateFormat_Desc() { regOBD("OCR_DATE_FORMAT"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddYyyy_Asc() { regOBA("SAP_ADD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddYyyy_Desc() { regOBD("SAP_ADD_YYYY"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddMm_Asc() { regOBA("SAP_ADD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddMm_Desc() { regOBD("SAP_ADD_MM"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddDd_Asc() { regOBA("SAP_ADD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddDd_Desc() { regOBD("SAP_ADD_DD"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddHh_Asc() { regOBA("SAP_ADD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddHh_Desc() { regOBD("SAP_ADD_HH"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddMi_Asc() { regOBA("SAP_ADD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddMi_Desc() { regOBD("SAP_ADD_MI"); return this; }

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
    public BsEsProductCQ addOrderBy_SapAddSs_Asc() { regOBA("SAP_ADD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddSs_Desc() { regOBD("SAP_ADD_SS"); return this; }

    protected ConditionValue _sapAddUserNm;
    public ConditionValue xdfgetSapAddUserNm()
    { if (_sapAddUserNm == null) { _sapAddUserNm = nCV(); }
      return _sapAddUserNm; }
    protected ConditionValue xgetCValueSapAddUserNm() { return xdfgetSapAddUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddUserNm_Asc() { regOBA("SAP_ADD_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_ADD_USER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapAddUserNm_Desc() { regOBD("SAP_ADD_USER_NM"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdYyyy_Asc() { regOBA("SAP_UPD_YYYY"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdYyyy_Desc() { regOBD("SAP_UPD_YYYY"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdMm_Asc() { regOBA("SAP_UPD_MM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdMm_Desc() { regOBD("SAP_UPD_MM"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdDd_Asc() { regOBA("SAP_UPD_DD"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdDd_Desc() { regOBD("SAP_UPD_DD"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdHh_Asc() { regOBA("SAP_UPD_HH"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdHh_Desc() { regOBD("SAP_UPD_HH"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdMi_Asc() { regOBA("SAP_UPD_MI"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdMi_Desc() { regOBD("SAP_UPD_MI"); return this; }

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
    public BsEsProductCQ addOrderBy_SapUpdSs_Asc() { regOBA("SAP_UPD_SS"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdSs_Desc() { regOBD("SAP_UPD_SS"); return this; }

    protected ConditionValue _sapUpdUserNm;
    public ConditionValue xdfgetSapUpdUserNm()
    { if (_sapUpdUserNm == null) { _sapUpdUserNm = nCV(); }
      return _sapUpdUserNm; }
    protected ConditionValue xgetCValueSapUpdUserNm() { return xdfgetSapUpdUserNm(); }

    /**
     * Add order-by as ascend. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdUserNm_Asc() { regOBA("SAP_UPD_USER_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SAP_UPD_USER_NM: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SapUpdUserNm_Desc() { regOBD("SAP_UPD_USER_NM"); return this; }

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
    public BsEsProductCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsEsProductCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsEsProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsEsProductCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsEsProductCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsEsProductCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsEsProductCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsEsProductCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsEsProductCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsEsProductCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsEsProductCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsEsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsEsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, EsProductCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(EsProductCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, EsProductCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(EsProductCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, EsProductCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(EsProductCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EsProductCQ> _myselfExistsMap;
    public Map<String, EsProductCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(EsProductCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, EsProductCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(EsProductCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EsProductCB.class.getName(); }
    protected String xCQ() { return EsProductCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
