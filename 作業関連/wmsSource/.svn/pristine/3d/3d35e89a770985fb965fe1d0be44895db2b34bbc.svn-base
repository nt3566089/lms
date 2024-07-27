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
 * The base condition-query of t_receive_plan_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanDataTransferCQ extends AbstractBsTReceivePlanDataTransferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanDataTransferCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanDataTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_receive_plan_data_transfer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TReceivePlanDataTransferCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TReceivePlanDataTransferCIQ xcreateCIQ() {
        TReceivePlanDataTransferCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TReceivePlanDataTransferCIQ xnewCIQ() {
        return new TReceivePlanDataTransferCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_receive_plan_data_transfer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TReceivePlanDataTransferCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TReceivePlanDataTransferCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _receivePlanDataTransferId;
    public ConditionValue xdfgetReceivePlanDataTransferId()
    { if (_receivePlanDataTransferId == null) { _receivePlanDataTransferId = nCV(); }
      return _receivePlanDataTransferId; }
    protected ConditionValue xgetCValueReceivePlanDataTransferId() { return xdfgetReceivePlanDataTransferId(); }

    /**
     * Add order-by as ascend. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_ReceivePlanDataTransferId_Asc() { regOBA("RECEIVE_PLAN_DATA_TRANSFER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_ReceivePlanDataTransferId_Desc() { regOBD("RECEIVE_PLAN_DATA_TRANSFER_ID"); return this; }

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
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_ReceivePlanBId_Asc() { regOBA("RECEIVE_PLAN_B_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_ReceivePlanBId_Desc() { regOBD("RECEIVE_PLAN_B_ID"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr01_Asc() { regOBA("DATA_TRANSFER_ONLY_STR01"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr01_Desc() { regOBD("DATA_TRANSFER_ONLY_STR01"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr02_Asc() { regOBA("DATA_TRANSFER_ONLY_STR02"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr02_Desc() { regOBD("DATA_TRANSFER_ONLY_STR02"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr03_Asc() { regOBA("DATA_TRANSFER_ONLY_STR03"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr03_Desc() { regOBD("DATA_TRANSFER_ONLY_STR03"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr04_Asc() { regOBA("DATA_TRANSFER_ONLY_STR04"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr04_Desc() { regOBD("DATA_TRANSFER_ONLY_STR04"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr05_Asc() { regOBA("DATA_TRANSFER_ONLY_STR05"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr05_Desc() { regOBD("DATA_TRANSFER_ONLY_STR05"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr06_Asc() { regOBA("DATA_TRANSFER_ONLY_STR06"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr06_Desc() { regOBD("DATA_TRANSFER_ONLY_STR06"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr07_Asc() { regOBA("DATA_TRANSFER_ONLY_STR07"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr07_Desc() { regOBD("DATA_TRANSFER_ONLY_STR07"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr08_Asc() { regOBA("DATA_TRANSFER_ONLY_STR08"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr08_Desc() { regOBD("DATA_TRANSFER_ONLY_STR08"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr09_Asc() { regOBA("DATA_TRANSFER_ONLY_STR09"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr09_Desc() { regOBD("DATA_TRANSFER_ONLY_STR09"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr10_Asc() { regOBA("DATA_TRANSFER_ONLY_STR10"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr10_Desc() { regOBD("DATA_TRANSFER_ONLY_STR10"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr11_Asc() { regOBA("DATA_TRANSFER_ONLY_STR11"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr11_Desc() { regOBD("DATA_TRANSFER_ONLY_STR11"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr12_Asc() { regOBA("DATA_TRANSFER_ONLY_STR12"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr12_Desc() { regOBD("DATA_TRANSFER_ONLY_STR12"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr13_Asc() { regOBA("DATA_TRANSFER_ONLY_STR13"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr13_Desc() { regOBD("DATA_TRANSFER_ONLY_STR13"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr14_Asc() { regOBA("DATA_TRANSFER_ONLY_STR14"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr14_Desc() { regOBD("DATA_TRANSFER_ONLY_STR14"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr15_Asc() { regOBA("DATA_TRANSFER_ONLY_STR15"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr15_Desc() { regOBD("DATA_TRANSFER_ONLY_STR15"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr16_Asc() { regOBA("DATA_TRANSFER_ONLY_STR16"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr16_Desc() { regOBD("DATA_TRANSFER_ONLY_STR16"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr17_Asc() { regOBA("DATA_TRANSFER_ONLY_STR17"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr17_Desc() { regOBD("DATA_TRANSFER_ONLY_STR17"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr18_Asc() { regOBA("DATA_TRANSFER_ONLY_STR18"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr18_Desc() { regOBD("DATA_TRANSFER_ONLY_STR18"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr19_Asc() { regOBA("DATA_TRANSFER_ONLY_STR19"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr19_Desc() { regOBD("DATA_TRANSFER_ONLY_STR19"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr20_Asc() { regOBA("DATA_TRANSFER_ONLY_STR20"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr20_Desc() { regOBD("DATA_TRANSFER_ONLY_STR20"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr21_Asc() { regOBA("DATA_TRANSFER_ONLY_STR21"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr21_Desc() { regOBD("DATA_TRANSFER_ONLY_STR21"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr22_Asc() { regOBA("DATA_TRANSFER_ONLY_STR22"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr22_Desc() { regOBD("DATA_TRANSFER_ONLY_STR22"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr23_Asc() { regOBA("DATA_TRANSFER_ONLY_STR23"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr23_Desc() { regOBD("DATA_TRANSFER_ONLY_STR23"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr24_Asc() { regOBA("DATA_TRANSFER_ONLY_STR24"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr24_Desc() { regOBD("DATA_TRANSFER_ONLY_STR24"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr25_Asc() { regOBA("DATA_TRANSFER_ONLY_STR25"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr25_Desc() { regOBD("DATA_TRANSFER_ONLY_STR25"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr26_Asc() { regOBA("DATA_TRANSFER_ONLY_STR26"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr26_Desc() { regOBD("DATA_TRANSFER_ONLY_STR26"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr27_Asc() { regOBA("DATA_TRANSFER_ONLY_STR27"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr27_Desc() { regOBD("DATA_TRANSFER_ONLY_STR27"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr28_Asc() { regOBA("DATA_TRANSFER_ONLY_STR28"); return this; }

    /**
     * Add order-by as descend. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DataTransferOnlyStr28_Desc() { regOBD("DATA_TRANSFER_ONLY_STR28"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTReceivePlanDataTransferCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTReceivePlanDataTransferCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTReceivePlanDataTransferCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TReceivePlanDataTransferCQ bq = (TReceivePlanDataTransferCQ)bqs;
        TReceivePlanDataTransferCQ uq = (TReceivePlanDataTransferCQ)uqs;
        if (bq.hasConditionQueryTReceivePlanB()) {
            uq.queryTReceivePlanB().reflectRelationOnUnionQuery(bq.queryTReceivePlanB(), uq.queryTReceivePlanB());
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
        String nrp = xresolveNRP("t_receive_plan_data_transfer", "tReceivePlanB"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TReceivePlanBCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tReceivePlanB", nrp);
    }
    protected void xsetupOuterJoinTReceivePlanB() { xregOutJo("tReceivePlanB"); }
    public boolean hasConditionQueryTReceivePlanB() { return xhasQueRlMap("tReceivePlanB"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TReceivePlanDataTransferCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TReceivePlanDataTransferCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TReceivePlanDataTransferCB.class.getName(); }
    protected String xCQ() { return TReceivePlanDataTransferCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
