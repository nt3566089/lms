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
 * The base condition-query of t_inventory_r.
 * @author DBFlute(AutoGenerator)
 */
public class BsTInventoryRCQ extends AbstractBsTInventoryRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TInventoryRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTInventoryRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_inventory_r) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TInventoryRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TInventoryRCIQ xcreateCIQ() {
        TInventoryRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TInventoryRCIQ xnewCIQ() {
        return new TInventoryRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_inventory_r on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TInventoryRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TInventoryRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _inventoryBId;
    public ConditionValue xdfgetInventoryBId()
    { if (_inventoryBId == null) { _inventoryBId = nCV(); }
      return _inventoryBId; }
    protected ConditionValue xgetCValueInventoryBId() { return xdfgetInventoryBId(); }

    public Map<String, TInventoryBCQ> getInventoryBId_InScopeRelation_TInventoryB() { return xgetSQueMap("inventoryBId_InScopeRelation_TInventoryB"); }
    public String keepInventoryBId_InScopeRelation_TInventoryB(TInventoryBCQ sq) { return xkeepSQue("inventoryBId_InScopeRelation_TInventoryB", sq); }

    public Map<String, TInventoryBCQ> getInventoryBId_NotInScopeRelation_TInventoryB() { return xgetSQueMap("inventoryBId_NotInScopeRelation_TInventoryB"); }
    public String keepInventoryBId_NotInScopeRelation_TInventoryB(TInventoryBCQ sq) { return xkeepSQue("inventoryBId_NotInScopeRelation_TInventoryB", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryBId_Asc() { regOBA("INVENTORY_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryBId_Desc() { regOBD("INVENTORY_B_ID"); return this; }

    protected ConditionValue _twlOutFlg;
    public ConditionValue xdfgetTwlOutFlg()
    { if (_twlOutFlg == null) { _twlOutFlg = nCV(); }
      return _twlOutFlg; }
    protected ConditionValue xgetCValueTwlOutFlg() { return xdfgetTwlOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutFlg_Asc() { regOBA("TWL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutFlg_Desc() { regOBD("TWL_OUT_FLG"); return this; }

    protected ConditionValue _twlOutUserId;
    public ConditionValue xdfgetTwlOutUserId()
    { if (_twlOutUserId == null) { _twlOutUserId = nCV(); }
      return _twlOutUserId; }
    protected ConditionValue xgetCValueTwlOutUserId() { return xdfgetTwlOutUserId(); }

    public Map<String, BUserCQ> getTwlOutUserId_InScopeRelation_BUserByTwlOutUserId() { return xgetSQueMap("twlOutUserId_InScopeRelation_BUserByTwlOutUserId"); }
    public String keepTwlOutUserId_InScopeRelation_BUserByTwlOutUserId(BUserCQ sq) { return xkeepSQue("twlOutUserId_InScopeRelation_BUserByTwlOutUserId", sq); }

    public Map<String, BUserCQ> getTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId() { return xgetSQueMap("twlOutUserId_NotInScopeRelation_BUserByTwlOutUserId"); }
    public String keepTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId(BUserCQ sq) { return xkeepSQue("twlOutUserId_NotInScopeRelation_BUserByTwlOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutUserId_Asc() { regOBA("TWL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutUserId_Desc() { regOBD("TWL_OUT_USER_ID"); return this; }

    protected ConditionValue _twlOutDt;
    public ConditionValue xdfgetTwlOutDt()
    { if (_twlOutDt == null) { _twlOutDt = nCV(); }
      return _twlOutDt; }
    protected ConditionValue xgetCValueTwlOutDt() { return xdfgetTwlOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutDt_Asc() { regOBA("TWL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_TwlOutDt_Desc() { regOBD("TWL_OUT_DT"); return this; }

    protected ConditionValue _inventoryDiffOutFlg;
    public ConditionValue xdfgetInventoryDiffOutFlg()
    { if (_inventoryDiffOutFlg == null) { _inventoryDiffOutFlg = nCV(); }
      return _inventoryDiffOutFlg; }
    protected ConditionValue xgetCValueInventoryDiffOutFlg() { return xdfgetInventoryDiffOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutFlg_Asc() { regOBA("INVENTORY_DIFF_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutFlg_Desc() { regOBD("INVENTORY_DIFF_OUT_FLG"); return this; }

    protected ConditionValue _inventoryDiffOutUserId;
    public ConditionValue xdfgetInventoryDiffOutUserId()
    { if (_inventoryDiffOutUserId == null) { _inventoryDiffOutUserId = nCV(); }
      return _inventoryDiffOutUserId; }
    protected ConditionValue xgetCValueInventoryDiffOutUserId() { return xdfgetInventoryDiffOutUserId(); }

    public Map<String, BUserCQ> getInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId() { return xgetSQueMap("inventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId"); }
    public String keepInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq) { return xkeepSQue("inventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId", sq); }

    public Map<String, BUserCQ> getInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId() { return xgetSQueMap("inventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId"); }
    public String keepInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq) { return xkeepSQue("inventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutUserId_Asc() { regOBA("INVENTORY_DIFF_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutUserId_Desc() { regOBD("INVENTORY_DIFF_OUT_USER_ID"); return this; }

    protected ConditionValue _inventoryDiffOutDt;
    public ConditionValue xdfgetInventoryDiffOutDt()
    { if (_inventoryDiffOutDt == null) { _inventoryDiffOutDt = nCV(); }
      return _inventoryDiffOutDt; }
    protected ConditionValue xgetCValueInventoryDiffOutDt() { return xdfgetInventoryDiffOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutDt_Asc() { regOBA("INVENTORY_DIFF_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryDiffOutDt_Desc() { regOBD("INVENTORY_DIFF_OUT_DT"); return this; }

    protected ConditionValue _inventoryRecordOutFlg;
    public ConditionValue xdfgetInventoryRecordOutFlg()
    { if (_inventoryRecordOutFlg == null) { _inventoryRecordOutFlg = nCV(); }
      return _inventoryRecordOutFlg; }
    protected ConditionValue xgetCValueInventoryRecordOutFlg() { return xdfgetInventoryRecordOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutFlg_Asc() { regOBA("INVENTORY_RECORD_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutFlg_Desc() { regOBD("INVENTORY_RECORD_OUT_FLG"); return this; }

    protected ConditionValue _inventoryRecordOutUserId;
    public ConditionValue xdfgetInventoryRecordOutUserId()
    { if (_inventoryRecordOutUserId == null) { _inventoryRecordOutUserId = nCV(); }
      return _inventoryRecordOutUserId; }
    protected ConditionValue xgetCValueInventoryRecordOutUserId() { return xdfgetInventoryRecordOutUserId(); }

    public Map<String, BUserCQ> getInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId() { return xgetSQueMap("inventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId"); }
    public String keepInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq) { return xkeepSQue("inventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId", sq); }

    public Map<String, BUserCQ> getInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId() { return xgetSQueMap("inventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId"); }
    public String keepInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq) { return xkeepSQue("inventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutUserId_Asc() { regOBA("INVENTORY_RECORD_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutUserId_Desc() { regOBD("INVENTORY_RECORD_OUT_USER_ID"); return this; }

    protected ConditionValue _inventoryRecordOutDt;
    public ConditionValue xdfgetInventoryRecordOutDt()
    { if (_inventoryRecordOutDt == null) { _inventoryRecordOutDt = nCV(); }
      return _inventoryRecordOutDt; }
    protected ConditionValue xgetCValueInventoryRecordOutDt() { return xdfgetInventoryRecordOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutDt_Asc() { regOBA("INVENTORY_RECORD_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordOutDt_Desc() { regOBD("INVENTORY_RECORD_OUT_DT"); return this; }

    protected ConditionValue _inventoryRecordLocOutFlg;
    public ConditionValue xdfgetInventoryRecordLocOutFlg()
    { if (_inventoryRecordLocOutFlg == null) { _inventoryRecordLocOutFlg = nCV(); }
      return _inventoryRecordLocOutFlg; }
    protected ConditionValue xgetCValueInventoryRecordLocOutFlg() { return xdfgetInventoryRecordLocOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutFlg_Asc() { regOBA("INVENTORY_RECORD_LOC_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutFlg_Desc() { regOBD("INVENTORY_RECORD_LOC_OUT_FLG"); return this; }

    protected ConditionValue _inventoryRecordLocOutUserId;
    public ConditionValue xdfgetInventoryRecordLocOutUserId()
    { if (_inventoryRecordLocOutUserId == null) { _inventoryRecordLocOutUserId = nCV(); }
      return _inventoryRecordLocOutUserId; }
    protected ConditionValue xgetCValueInventoryRecordLocOutUserId() { return xdfgetInventoryRecordLocOutUserId(); }

    public Map<String, BUserCQ> getInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId() { return xgetSQueMap("inventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId"); }
    public String keepInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq) { return xkeepSQue("inventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId", sq); }

    public Map<String, BUserCQ> getInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId() { return xgetSQueMap("inventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId"); }
    public String keepInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq) { return xkeepSQue("inventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutUserId_Asc() { regOBA("INVENTORY_RECORD_LOC_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutUserId_Desc() { regOBD("INVENTORY_RECORD_LOC_OUT_USER_ID"); return this; }

    protected ConditionValue _inventoryRecordLocOutDt;
    public ConditionValue xdfgetInventoryRecordLocOutDt()
    { if (_inventoryRecordLocOutDt == null) { _inventoryRecordLocOutDt = nCV(); }
      return _inventoryRecordLocOutDt; }
    protected ConditionValue xgetCValueInventoryRecordLocOutDt() { return xdfgetInventoryRecordLocOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutDt_Asc() { regOBA("INVENTORY_RECORD_LOC_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_InventoryRecordLocOutDt_Desc() { regOBD("INVENTORY_RECORD_LOC_OUT_DT"); return this; }

    protected ConditionValue _stockDiffOutFlg;
    public ConditionValue xdfgetStockDiffOutFlg()
    { if (_stockDiffOutFlg == null) { _stockDiffOutFlg = nCV(); }
      return _stockDiffOutFlg; }
    protected ConditionValue xgetCValueStockDiffOutFlg() { return xdfgetStockDiffOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutFlg_Asc() { regOBA("STOCK_DIFF_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutFlg_Desc() { regOBD("STOCK_DIFF_OUT_FLG"); return this; }

    protected ConditionValue _stockDiffOutUserId;
    public ConditionValue xdfgetStockDiffOutUserId()
    { if (_stockDiffOutUserId == null) { _stockDiffOutUserId = nCV(); }
      return _stockDiffOutUserId; }
    protected ConditionValue xgetCValueStockDiffOutUserId() { return xdfgetStockDiffOutUserId(); }

    public Map<String, BUserCQ> getStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId() { return xgetSQueMap("stockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId"); }
    public String keepStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq) { return xkeepSQue("stockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId", sq); }

    public Map<String, BUserCQ> getStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId() { return xgetSQueMap("stockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId"); }
    public String keepStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq) { return xkeepSQue("stockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutUserId_Asc() { regOBA("STOCK_DIFF_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutUserId_Desc() { regOBD("STOCK_DIFF_OUT_USER_ID"); return this; }

    protected ConditionValue _stockDiffOutDt;
    public ConditionValue xdfgetStockDiffOutDt()
    { if (_stockDiffOutDt == null) { _stockDiffOutDt = nCV(); }
      return _stockDiffOutDt; }
    protected ConditionValue xgetCValueStockDiffOutDt() { return xdfgetStockDiffOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutDt_Asc() { regOBA("STOCK_DIFF_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_StockDiffOutDt_Desc() { regOBD("STOCK_DIFF_OUT_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTInventoryRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTInventoryRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTInventoryRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTInventoryRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTInventoryRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTInventoryRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTInventoryRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TInventoryRCQ bq = (TInventoryRCQ)bqs;
        TInventoryRCQ uq = (TInventoryRCQ)uqs;
        if (bq.hasConditionQueryBUserByInventoryRecordLocOutUserId()) {
            uq.queryBUserByInventoryRecordLocOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByInventoryRecordLocOutUserId(), uq.queryBUserByInventoryRecordLocOutUserId());
        }
        if (bq.hasConditionQueryBUserByStockDiffOutUserId()) {
            uq.queryBUserByStockDiffOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByStockDiffOutUserId(), uq.queryBUserByStockDiffOutUserId());
        }
        if (bq.hasConditionQueryBUserByTwlOutUserId()) {
            uq.queryBUserByTwlOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByTwlOutUserId(), uq.queryBUserByTwlOutUserId());
        }
        if (bq.hasConditionQueryBUserByInventoryRecordOutUserId()) {
            uq.queryBUserByInventoryRecordOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByInventoryRecordOutUserId(), uq.queryBUserByInventoryRecordOutUserId());
        }
        if (bq.hasConditionQueryTInventoryB()) {
            uq.queryTInventoryB().reflectRelationOnUnionQuery(bq.queryTInventoryB(), uq.queryTInventoryB());
        }
        if (bq.hasConditionQueryBUserByInventoryDiffOutUserId()) {
            uq.queryBUserByInventoryDiffOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByInventoryDiffOutUserId(), uq.queryBUserByInventoryDiffOutUserId());
        }
        if (bq.hasConditionQueryBClassDtlByTwlOutFlg()) {
            uq.queryBClassDtlByTwlOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTwlOutFlg(), uq.queryBClassDtlByTwlOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByInventoryRecordLocOutUserId() {
        return xdfgetConditionQueryBUserByInventoryRecordLocOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByInventoryRecordLocOutUserId() {
        String prop = "bUserByInventoryRecordLocOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByInventoryRecordLocOutUserId()); xsetupOuterJoinBUserByInventoryRecordLocOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByInventoryRecordLocOutUserId() {
        String nrp = xresolveNRP("t_inventory_r", "bUserByInventoryRecordLocOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByInventoryRecordLocOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByInventoryRecordLocOutUserId() { xregOutJo("bUserByInventoryRecordLocOutUserId"); }
    public boolean hasConditionQueryBUserByInventoryRecordLocOutUserId() { return xhasQueRlMap("bUserByInventoryRecordLocOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByStockDiffOutUserId() {
        return xdfgetConditionQueryBUserByStockDiffOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByStockDiffOutUserId() {
        String prop = "bUserByStockDiffOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByStockDiffOutUserId()); xsetupOuterJoinBUserByStockDiffOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByStockDiffOutUserId() {
        String nrp = xresolveNRP("t_inventory_r", "bUserByStockDiffOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByStockDiffOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByStockDiffOutUserId() { xregOutJo("bUserByStockDiffOutUserId"); }
    public boolean hasConditionQueryBUserByStockDiffOutUserId() { return xhasQueRlMap("bUserByStockDiffOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByTwlOutUserId() {
        return xdfgetConditionQueryBUserByTwlOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByTwlOutUserId() {
        String prop = "bUserByTwlOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByTwlOutUserId()); xsetupOuterJoinBUserByTwlOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByTwlOutUserId() {
        String nrp = xresolveNRP("t_inventory_r", "bUserByTwlOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByTwlOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByTwlOutUserId() { xregOutJo("bUserByTwlOutUserId"); }
    public boolean hasConditionQueryBUserByTwlOutUserId() { return xhasQueRlMap("bUserByTwlOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByInventoryRecordOutUserId() {
        return xdfgetConditionQueryBUserByInventoryRecordOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByInventoryRecordOutUserId() {
        String prop = "bUserByInventoryRecordOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByInventoryRecordOutUserId()); xsetupOuterJoinBUserByInventoryRecordOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByInventoryRecordOutUserId() {
        String nrp = xresolveNRP("t_inventory_r", "bUserByInventoryRecordOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByInventoryRecordOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByInventoryRecordOutUserId() { xregOutJo("bUserByInventoryRecordOutUserId"); }
    public boolean hasConditionQueryBUserByInventoryRecordOutUserId() { return xhasQueRlMap("bUserByInventoryRecordOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The instance of condition-query. (NotNull)
     */
    public TInventoryBCQ queryTInventoryB() {
        return xdfgetConditionQueryTInventoryB();
    }
    public TInventoryBCQ xdfgetConditionQueryTInventoryB() {
        String prop = "tInventoryB";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTInventoryB()); xsetupOuterJoinTInventoryB(); }
        return xgetQueRlMap(prop);
    }
    protected TInventoryBCQ xcreateQueryTInventoryB() {
        String nrp = xresolveNRP("t_inventory_r", "tInventoryB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TInventoryBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tInventoryB", nrp);
    }
    protected void xsetupOuterJoinTInventoryB() { xregOutJo("tInventoryB"); }
    public boolean hasConditionQueryTInventoryB() { return xhasQueRlMap("tInventoryB"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByInventoryDiffOutUserId() {
        return xdfgetConditionQueryBUserByInventoryDiffOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByInventoryDiffOutUserId() {
        String prop = "bUserByInventoryDiffOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByInventoryDiffOutUserId()); xsetupOuterJoinBUserByInventoryDiffOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByInventoryDiffOutUserId() {
        String nrp = xresolveNRP("t_inventory_r", "bUserByInventoryDiffOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByInventoryDiffOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByInventoryDiffOutUserId() { xregOutJo("bUserByInventoryDiffOutUserId"); }
    public boolean hasConditionQueryBUserByInventoryDiffOutUserId() { return xhasQueRlMap("bUserByInventoryDiffOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTwlOutFlg() {
        return xdfgetConditionQueryBClassDtlByTwlOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTwlOutFlg() {
        String prop = "bClassDtlByTwlOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTwlOutFlg()); xsetupOuterJoinBClassDtlByTwlOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTwlOutFlg() {
        String nrp = xresolveNRP("t_inventory_r", "bClassDtlByTwlOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTwlOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTwlOutFlg() { xregOutJo("bClassDtlByTwlOutFlg"); }
    public boolean hasConditionQueryBClassDtlByTwlOutFlg() { return xhasQueRlMap("bClassDtlByTwlOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TInventoryRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TInventoryRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TInventoryRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TInventoryRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TInventoryRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TInventoryRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TInventoryRCQ> _myselfExistsMap;
    public Map<String, TInventoryRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TInventoryRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TInventoryRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TInventoryRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TInventoryRCB.class.getName(); }
    protected String xCQ() { return TInventoryRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
