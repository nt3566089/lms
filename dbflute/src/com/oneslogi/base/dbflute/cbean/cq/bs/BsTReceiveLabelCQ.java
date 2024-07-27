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
 * The base condition-query of t_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceiveLabelCQ extends AbstractBsTReceiveLabelCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceiveLabelCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceiveLabelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_receive_label) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReceiveLabelCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReceiveLabelCIQ xcreateCIQ() {
        TReceiveLabelCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReceiveLabelCIQ xnewCIQ() {
        return new TReceiveLabelCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_receive_label on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReceiveLabelCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReceiveLabelCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receiveLabelId;
    public ConditionValue xdfgetReceiveLabelId()
    { if (_receiveLabelId == null) { _receiveLabelId = nCV(); }
      return _receiveLabelId; }
    protected ConditionValue xgetCValueReceiveLabelId() { return xdfgetReceiveLabelId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveLabelId_Asc() { regOBA("RECEIVE_LABEL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveLabelId_Desc() { regOBD("RECEIVE_LABEL_ID"); return this; }

    protected ConditionValue _stockId;
    public ConditionValue xdfgetStockId()
    { if (_stockId == null) { _stockId = nCV(); }
      return _stockId; }
    protected ConditionValue xgetCValueStockId() { return xdfgetStockId(); }

    public Map<String, TStockCQ> getStockId_InScopeRelation_TStock() { return xgetSQueMap("stockId_InScopeRelation_TStock"); }
    public String keepStockId_InScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_InScopeRelation_TStock", sq); }

    public Map<String, TStockCQ> getStockId_NotInScopeRelation_TStock() { return xgetSQueMap("stockId_NotInScopeRelation_TStock"); }
    public String keepStockId_NotInScopeRelation_TStock(TStockCQ sq) { return xkeepSQue("stockId_NotInScopeRelation_TStock", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_StockId_Asc() { regOBA("STOCK_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_StockId_Desc() { regOBD("STOCK_ID"); return this; }

    protected ConditionValue _receiveLabelNo;
    public ConditionValue xdfgetReceiveLabelNo()
    { if (_receiveLabelNo == null) { _receiveLabelNo = nCV(); }
      return _receiveLabelNo; }
    protected ConditionValue xgetCValueReceiveLabelNo() { return xdfgetReceiveLabelNo(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveLabelNo_Asc() { regOBA("RECEIVE_LABEL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveLabelNo_Desc() { regOBD("RECEIVE_LABEL_NO"); return this; }

    protected ConditionValue _num;
    public ConditionValue xdfgetNum()
    { if (_num == null) { _num = nCV(); }
      return _num; }
    protected ConditionValue xgetCValueNum() { return xdfgetNum(); }

    /**
     * Add order-by as ascend. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Num_Asc() { regOBA("NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Num_Desc() { regOBD("NUM"); return this; }

    protected ConditionValue _ownerCd;
    public ConditionValue xdfgetOwnerCd()
    { if (_ownerCd == null) { _ownerCd = nCV(); }
      return _ownerCd; }
    protected ConditionValue xgetCValueOwnerCd() { return xdfgetOwnerCd(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_OwnerCd_Asc() { regOBA("OWNER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_OwnerCd_Desc() { regOBD("OWNER_CD"); return this; }

    protected ConditionValue _ownerAbbr;
    public ConditionValue xdfgetOwnerAbbr()
    { if (_ownerAbbr == null) { _ownerAbbr = nCV(); }
      return _ownerAbbr; }
    protected ConditionValue xgetCValueOwnerAbbr() { return xdfgetOwnerAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_OwnerAbbr_Asc() { regOBA("OWNER_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_OwnerAbbr_Desc() { regOBD("OWNER_ABBR"); return this; }

    protected ConditionValue _recommendLocationCd;
    public ConditionValue xdfgetRecommendLocationCd()
    { if (_recommendLocationCd == null) { _recommendLocationCd = nCV(); }
      return _recommendLocationCd; }
    protected ConditionValue xgetCValueRecommendLocationCd() { return xdfgetRecommendLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RecommendLocationCd_Asc() { regOBA("RECOMMEND_LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RecommendLocationCd_Desc() { regOBD("RECOMMEND_LOCATION_CD"); return this; }

    protected ConditionValue _locationCd;
    public ConditionValue xdfgetLocationCd()
    { if (_locationCd == null) { _locationCd = nCV(); }
      return _locationCd; }
    protected ConditionValue xgetCValueLocationCd() { return xdfgetLocationCd(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_LocationCd_Asc() { regOBA("LOCATION_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_LocationCd_Desc() { regOBD("LOCATION_CD"); return this; }

    protected ConditionValue _jancd;
    public ConditionValue xdfgetJancd()
    { if (_jancd == null) { _jancd = nCV(); }
      return _jancd; }
    protected ConditionValue xgetCValueJancd() { return xdfgetJancd(); }

    /**
     * Add order-by as ascend. <br>
     * JANCD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Jancd_Asc() { regOBA("JANCD"); return this; }

    /**
     * Add order-by as descend. <br>
     * JANCD: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Jancd_Desc() { regOBD("JANCD"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_ProductNm_Asc() { regOBA("PRODUCT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ProductNm_Desc() { regOBD("PRODUCT_NM"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_UnitNm_Asc() { regOBA("UNIT_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_UnitNm_Desc() { regOBD("UNIT_NM"); return this; }

    protected ConditionValue _lot;
    public ConditionValue xdfgetLot()
    { if (_lot == null) { _lot = nCV(); }
      return _lot; }
    protected ConditionValue xgetCValueLot() { return xdfgetLot(); }

    /**
     * Add order-by as ascend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Lot_Asc() { regOBA("LOT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOT: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_Lot_Desc() { regOBD("LOT"); return this; }

    protected ConditionValue _limitDt;
    public ConditionValue xdfgetLimitDt()
    { if (_limitDt == null) { _limitDt = nCV(); }
      return _limitDt; }
    protected ConditionValue xgetCValueLimitDt() { return xdfgetLimitDt(); }

    /**
     * Add order-by as ascend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_LimitDt_Asc() { regOBA("LIMIT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_LimitDt_Desc() { regOBD("LIMIT_DT"); return this; }

    protected ConditionValue _prodDt;
    public ConditionValue xdfgetProdDt()
    { if (_prodDt == null) { _prodDt = nCV(); }
      return _prodDt; }
    protected ConditionValue xgetCValueProdDt() { return xdfgetProdDt(); }

    /**
     * Add order-by as ascend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ProdDt_Asc() { regOBA("PROD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PROD_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ProdDt_Desc() { regOBD("PROD_DT"); return this; }

    protected ConditionValue _receiveDt;
    public ConditionValue xdfgetReceiveDt()
    { if (_receiveDt == null) { _receiveDt = nCV(); }
      return _receiveDt; }
    protected ConditionValue xgetCValueReceiveDt() { return xdfgetReceiveDt(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveDt_Asc() { regOBA("RECEIVE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveDt_Desc() { regOBD("RECEIVE_DT"); return this; }

    protected ConditionValue _depositFlg;
    public ConditionValue xdfgetDepositFlg()
    { if (_depositFlg == null) { _depositFlg = nCV(); }
      return _depositFlg; }
    protected ConditionValue xgetCValueDepositFlg() { return xdfgetDepositFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_DepositFlg_Asc() { regOBA("DEPOSIT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_DepositFlg_Desc() { regOBD("DEPOSIT_FLG"); return this; }

    protected ConditionValue _reprintFlg;
    public ConditionValue xdfgetReprintFlg()
    { if (_reprintFlg == null) { _reprintFlg = nCV(); }
      return _reprintFlg; }
    protected ConditionValue xgetCValueReprintFlg() { return xdfgetReprintFlg(); }

    /**
     * Add order-by as ascend. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReprintFlg_Asc() { regOBA("REPRINT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReprintFlg_Desc() { regOBD("REPRINT_FLG"); return this; }

    protected ConditionValue _receiveUnitNum;
    public ConditionValue xdfgetReceiveUnitNum()
    { if (_receiveUnitNum == null) { _receiveUnitNum = nCV(); }
      return _receiveUnitNum; }
    protected ConditionValue xgetCValueReceiveUnitNum() { return xdfgetReceiveUnitNum(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveUnitNum_Asc() { regOBA("RECEIVE_UNIT_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceiveUnitNum_Desc() { regOBD("RECEIVE_UNIT_NUM"); return this; }

    protected ConditionValue _receivePlanBId;
    public ConditionValue xdfgetReceivePlanBId()
    { if (_receivePlanBId == null) { _receivePlanBId = nCV(); }
      return _receivePlanBId; }
    protected ConditionValue xgetCValueReceivePlanBId() { return xdfgetReceivePlanBId(); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_InScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_InScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_InScopeRelation_TReceivePlanB", sq); }

    public Map<String, TReceivePlanBCQ> getReceivePlanBId_NotInScopeRelation_TReceivePlanB() { return xgetSQueMap("receivePlanBId_NotInScopeRelation_TReceivePlanB"); }
    public String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq) { return xkeepSQue("receivePlanBId_NotInScopeRelation_TReceivePlanB", sq); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

    protected ConditionValue _rcvLblOutUserId;
    public ConditionValue xdfgetRcvLblOutUserId()
    { if (_rcvLblOutUserId == null) { _rcvLblOutUserId = nCV(); }
      return _rcvLblOutUserId; }
    protected ConditionValue xgetCValueRcvLblOutUserId() { return xdfgetRcvLblOutUserId(); }

    public Map<String, BUserCQ> getRcvLblOutUserId_InScopeRelation_BUser() { return xgetSQueMap("rcvLblOutUserId_InScopeRelation_BUser"); }
    public String keepRcvLblOutUserId_InScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("rcvLblOutUserId_InScopeRelation_BUser", sq); }

    public Map<String, BUserCQ> getRcvLblOutUserId_NotInScopeRelation_BUser() { return xgetSQueMap("rcvLblOutUserId_NotInScopeRelation_BUser"); }
    public String keepRcvLblOutUserId_NotInScopeRelation_BUser(BUserCQ sq) { return xkeepSQue("rcvLblOutUserId_NotInScopeRelation_BUser", sq); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RcvLblOutUserId_Asc() { regOBA("RCV_LBL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RcvLblOutUserId_Desc() { regOBD("RCV_LBL_OUT_USER_ID"); return this; }

    protected ConditionValue _rcvLblOutDt;
    public ConditionValue xdfgetRcvLblOutDt()
    { if (_rcvLblOutDt == null) { _rcvLblOutDt = nCV(); }
      return _rcvLblOutDt; }
    protected ConditionValue xgetCValueRcvLblOutDt() { return xdfgetRcvLblOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RcvLblOutDt_Asc() { regOBA("RCV_LBL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_RcvLblOutDt_Desc() { regOBD("RCV_LBL_OUT_DT"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTReceiveLabelCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceiveLabelCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTReceiveLabelCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReceiveLabelCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReceiveLabelCQ bq = (TReceiveLabelCQ)bqs;
        TReceiveLabelCQ uq = (TReceiveLabelCQ)uqs;
        if (bq.hasConditionQueryTReceivePlanB()) {
            uq.queryTReceivePlanB().reflectRelationOnUnionQuery(bq.queryTReceivePlanB(), uq.queryTReceivePlanB());
        }
        if (bq.hasConditionQueryTStock()) {
            uq.queryTStock().reflectRelationOnUnionQuery(bq.queryTStock(), uq.queryTStock());
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
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TReceivePlanBCQ queryTReceivePlanB() {
        return xdfgetConditionQueryTReceivePlanB();
    }
    public TReceivePlanBCQ xdfgetConditionQueryTReceivePlanB() {
        String prop = "tReceivePlanB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTReceivePlanB()); xsetupOuterJoinTReceivePlanB(); }
        return xgetQueRlMap(prop);
    }
    protected TReceivePlanBCQ xcreateQueryTReceivePlanB() {
        String nrp = xresolveNRP("t_receive_label", "tReceivePlanB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanB", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanB() { xregOutJo("tReceivePlanB"); }
    public boolean hasConditionQueryTReceivePlanB() { return xhasQueRlMap("tReceivePlanB"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The instance of condition-query. (NotNull)
     */
    public TStockCQ queryTStock() {
        return xdfgetConditionQueryTStock();
    }
    public TStockCQ xdfgetConditionQueryTStock() {
        String prop = "tStock";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTStock()); xsetupOuterJoinTStock(); }
        return xgetQueRlMap(prop);
    }
    protected TStockCQ xcreateQueryTStock() {
        String nrp = xresolveNRP("t_receive_label", "tStock"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TStockCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tStock", nrp);
    }
    protected void xsetupOuterJoinTStock() { xregOutJo("tStock"); }
    public boolean hasConditionQueryTStock() { return xhasQueRlMap("tStock"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
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
        String nrp = xresolveNRP("t_receive_label", "bUser"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, TReceiveLabelCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReceiveLabelCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TReceiveLabelCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TReceiveLabelCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TReceiveLabelCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TReceiveLabelCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TReceiveLabelCQ> _myselfExistsMap;
    public Map<String, TReceiveLabelCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TReceiveLabelCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TReceiveLabelCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TReceiveLabelCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReceiveLabelCB.class.getName(); }
    protected String xCQ() { return TReceiveLabelCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
