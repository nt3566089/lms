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
 * The base condition-query of t_shipping_inst_b_print.
 * @author DBFlute(AutoGenerator)
 */
public class BsTShippingInstBPrintCQ extends AbstractBsTShippingInstBPrintCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TShippingInstBPrintCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTShippingInstBPrintCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_shipping_inst_b_print) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TShippingInstBPrintCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TShippingInstBPrintCIQ xcreateCIQ() {
        TShippingInstBPrintCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TShippingInstBPrintCIQ xnewCIQ() {
        return new TShippingInstBPrintCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_shipping_inst_b_print on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TShippingInstBPrintCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TShippingInstBPrintCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _shippingInstBPrintId;
    public ConditionValue xdfgetShippingInstBPrintId()
    { if (_shippingInstBPrintId == null) { _shippingInstBPrintId = nCV(); }
      return _shippingInstBPrintId; }
    protected ConditionValue xgetCValueShippingInstBPrintId() { return xdfgetShippingInstBPrintId(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_ShippingInstBPrintId_Asc() { regOBA("SHIPPING_INST_B_PRINT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_ShippingInstBPrintId_Desc() { regOBD("SHIPPING_INST_B_PRINT_ID"); return this; }

    protected ConditionValue _shippingInstBId;
    public ConditionValue xdfgetShippingInstBId()
    { if (_shippingInstBId == null) { _shippingInstBId = nCV(); }
      return _shippingInstBId; }
    protected ConditionValue xgetCValueShippingInstBId() { return xdfgetShippingInstBId(); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_InScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_InScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_InScopeRelation_TShippingInstB", sq); }

    public Map<String, TShippingInstBCQ> getShippingInstBId_NotInScopeRelation_TShippingInstB() { return xgetSQueMap("shippingInstBId_NotInScopeRelation_TShippingInstB"); }
    public String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq) { return xkeepSQue("shippingInstBId_NotInScopeRelation_TShippingInstB", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_ShippingInstBId_Asc() { regOBA("SHIPPING_INST_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_b}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_ShippingInstBId_Desc() { regOBD("SHIPPING_INST_B_ID"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_HinmokuCd_Asc() { regOBA("HINMOKU_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_HinmokuCd_Desc() { regOBD("HINMOKU_CD"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_HinmokuGroupCd_Asc() { regOBA("HINMOKU_GROUP_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * HINMOKU_GROUP_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_HinmokuGroupCd_Desc() { regOBD("HINMOKU_GROUP_CD"); return this; }

    protected ConditionValue _salesOrderNum;
    public ConditionValue xdfgetSalesOrderNum()
    { if (_salesOrderNum == null) { _salesOrderNum = nCV(); }
      return _salesOrderNum; }
    protected ConditionValue xgetCValueSalesOrderNum() { return xdfgetSalesOrderNum(); }

    /**
     * Add order-by as ascend. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_SalesOrderNum_Asc() { regOBA("SALES_ORDER_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * SALES_ORDER_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_SalesOrderNum_Desc() { regOBD("SALES_ORDER_NUM"); return this; }

    protected ConditionValue _logiWeightFlg;
    public ConditionValue xdfgetLogiWeightFlg()
    { if (_logiWeightFlg == null) { _logiWeightFlg = nCV(); }
      return _logiWeightFlg; }
    protected ConditionValue xgetCValueLogiWeightFlg() { return xdfgetLogiWeightFlg(); }

    /**
     * Add order-by as ascend. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_LogiWeightFlg_Asc() { regOBA("LOGI_WEIGHT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_WEIGHT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_LogiWeightFlg_Desc() { regOBD("LOGI_WEIGHT_FLG"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_LogiAttentionTypeCd_Asc() { regOBA("LOGI_ATTENTION_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_LogiAttentionTypeCd_Desc() { regOBD("LOGI_ATTENTION_TYPE_CD"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_LogiSpecialTypeCd_Asc() { regOBA("LOGI_SPECIAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_LogiSpecialTypeCd_Desc() { regOBD("LOGI_SPECIAL_TYPE_CD"); return this; }

    protected ConditionValue _unitPrice;
    public ConditionValue xdfgetUnitPrice()
    { if (_unitPrice == null) { _unitPrice = nCV(); }
      return _unitPrice; }
    protected ConditionValue xgetCValueUnitPrice() { return xdfgetUnitPrice(); }

    /**
     * Add order-by as ascend. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_UnitPrice_Asc() { regOBA("UNIT_PRICE"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_PRICE: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_UnitPrice_Desc() { regOBD("UNIT_PRICE"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_EcOrderBranchNo_Asc() { regOBA("EC_ORDER_BRANCH_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_EcOrderBranchNo_Desc() { regOBD("EC_ORDER_BRANCH_NO"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_EcProductNmKanji_Asc() { regOBA("EC_PRODUCT_NM_KANJI"); return this; }

    /**
     * Add order-by as descend. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_EcProductNmKanji_Desc() { regOBD("EC_PRODUCT_NM_KANJI"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_DealTypeCd_Asc() { regOBA("DEAL_TYPE_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_DealTypeCd_Desc() { regOBD("DEAL_TYPE_CD"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_SpareStr_Asc() { regOBA("SPARE_STR"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_SpareStr_Desc() { regOBD("SPARE_STR"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTShippingInstBPrintCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTShippingInstBPrintCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTShippingInstBPrintCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTShippingInstBPrintCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TShippingInstBPrintCQ bq = (TShippingInstBPrintCQ)bqs;
        TShippingInstBPrintCQ uq = (TShippingInstBPrintCQ)uqs;
        if (bq.hasConditionQueryTShippingInstB()) {
            uq.queryTShippingInstB().reflectRelationOnUnionQuery(bq.queryTShippingInstB(), uq.queryTShippingInstB());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TShippingInstBCQ queryTShippingInstB() {
        return xdfgetConditionQueryTShippingInstB();
    }
    public TShippingInstBCQ xdfgetConditionQueryTShippingInstB() {
        String prop = "tShippingInstB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTShippingInstB()); xsetupOuterJoinTShippingInstB(); }
        return xgetQueRlMap(prop);
    }
    protected TShippingInstBCQ xcreateQueryTShippingInstB() {
        String nrp = xresolveNRP("t_shipping_inst_b_print", "tShippingInstB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TShippingInstBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tShippingInstB", nrp);
    }
    protected void xsetupOuterJoinTShippingInstB() { xregOutJo("tShippingInstB"); }
    public boolean hasConditionQueryTShippingInstB() { return xhasQueRlMap("tShippingInstB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TShippingInstBPrintCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TShippingInstBPrintCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TShippingInstBPrintCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TShippingInstBPrintCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TShippingInstBPrintCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TShippingInstBPrintCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TShippingInstBPrintCQ> _myselfExistsMap;
    public Map<String, TShippingInstBPrintCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TShippingInstBPrintCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TShippingInstBPrintCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TShippingInstBPrintCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TShippingInstBPrintCB.class.getName(); }
    protected String xCQ() { return TShippingInstBPrintCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
