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
 * The base condition-query of t_picking_r.
 * @author DBFlute(AutoGenerator)
 */
public class BsTPickingRCQ extends AbstractBsTPickingRCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPickingRCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from t_picking_r) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TPickingRCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TPickingRCIQ xcreateCIQ() {
        TPickingRCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TPickingRCIQ xnewCIQ() {
        return new TPickingRCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join t_picking_r on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TPickingRCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TPickingRCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _pickingHId;
    public ConditionValue xdfgetPickingHId()
    { if (_pickingHId == null) { _pickingHId = nCV(); }
      return _pickingHId; }
    protected ConditionValue xgetCValuePickingHId() { return xdfgetPickingHId(); }

    public Map<String, TPickingHCQ> getPickingHId_InScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_InScopeRelation_TPickingH"); }
    public String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_InScopeRelation_TPickingH", sq); }

    public Map<String, TPickingHCQ> getPickingHId_NotInScopeRelation_TPickingH() { return xgetSQueMap("pickingHId_NotInScopeRelation_TPickingH"); }
    public String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq) { return xkeepSQue("pickingHId_NotInScopeRelation_TPickingH", sq); }

    /**
     * Add order-by as ascend. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PickingHId_Asc() { regOBA("PICKING_H_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PickingHId_Desc() { regOBD("PICKING_H_ID"); return this; }

    protected ConditionValue _oplOutFlg;
    public ConditionValue xdfgetOplOutFlg()
    { if (_oplOutFlg == null) { _oplOutFlg = nCV(); }
      return _oplOutFlg; }
    protected ConditionValue xgetCValueOplOutFlg() { return xdfgetOplOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_OplOutFlg_Asc() { regOBA("OPL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_OplOutFlg_Desc() { regOBD("OPL_OUT_FLG"); return this; }

    protected ConditionValue _tplOutFlg;
    public ConditionValue xdfgetTplOutFlg()
    { if (_tplOutFlg == null) { _tplOutFlg = nCV(); }
      return _tplOutFlg; }
    protected ConditionValue xgetCValueTplOutFlg() { return xdfgetTplOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TplOutFlg_Asc() { regOBA("TPL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TplOutFlg_Desc() { regOBD("TPL_OUT_FLG"); return this; }

    protected ConditionValue _mltOutFlg;
    public ConditionValue xdfgetMltOutFlg()
    { if (_mltOutFlg == null) { _mltOutFlg = nCV(); }
      return _mltOutFlg; }
    protected ConditionValue xgetCValueMltOutFlg() { return xdfgetMltOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_MltOutFlg_Asc() { regOBA("MLT_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_MltOutFlg_Desc() { regOBD("MLT_OUT_FLG"); return this; }

    protected ConditionValue _splOutFlg;
    public ConditionValue xdfgetSplOutFlg()
    { if (_splOutFlg == null) { _splOutFlg = nCV(); }
      return _splOutFlg; }
    protected ConditionValue xgetCValueSplOutFlg() { return xdfgetSplOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SplOutFlg_Asc() { regOBA("SPL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SplOutFlg_Desc() { regOBD("SPL_OUT_FLG"); return this; }

    protected ConditionValue _pl1OutFlg;
    public ConditionValue xdfgetPl1OutFlg()
    { if (_pl1OutFlg == null) { _pl1OutFlg = nCV(); }
      return _pl1OutFlg; }
    protected ConditionValue xgetCValuePl1OutFlg() { return xdfgetPl1OutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutFlg_Asc() { regOBA("PL1_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutFlg_Desc() { regOBD("PL1_OUT_FLG"); return this; }

    protected ConditionValue _pl1OutUserId;
    public ConditionValue xdfgetPl1OutUserId()
    { if (_pl1OutUserId == null) { _pl1OutUserId = nCV(); }
      return _pl1OutUserId; }
    protected ConditionValue xgetCValuePl1OutUserId() { return xdfgetPl1OutUserId(); }

    public Map<String, BUserCQ> getPl1OutUserId_InScopeRelation_BUserByPl1OutUserId() { return xgetSQueMap("pl1OutUserId_InScopeRelation_BUserByPl1OutUserId"); }
    public String keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(BUserCQ sq) { return xkeepSQue("pl1OutUserId_InScopeRelation_BUserByPl1OutUserId", sq); }

    public Map<String, BUserCQ> getPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId() { return xgetSQueMap("pl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId"); }
    public String keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(BUserCQ sq) { return xkeepSQue("pl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutUserId_Asc() { regOBA("PL1_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutUserId_Desc() { regOBD("PL1_OUT_USER_ID"); return this; }

    protected ConditionValue _pl1OutDt;
    public ConditionValue xdfgetPl1OutDt()
    { if (_pl1OutDt == null) { _pl1OutDt = nCV(); }
      return _pl1OutDt; }
    protected ConditionValue xgetCValuePl1OutDt() { return xdfgetPl1OutDt(); }

    /**
     * Add order-by as ascend. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutDt_Asc() { regOBA("PL1_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL1_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl1OutDt_Desc() { regOBD("PL1_OUT_DT"); return this; }

    protected ConditionValue _plOutFlg;
    public ConditionValue xdfgetPlOutFlg()
    { if (_plOutFlg == null) { _plOutFlg = nCV(); }
      return _plOutFlg; }
    protected ConditionValue xgetCValuePlOutFlg() { return xdfgetPlOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutFlg_Asc() { regOBA("PL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutFlg_Desc() { regOBD("PL_OUT_FLG"); return this; }

    protected ConditionValue _plOutUserId;
    public ConditionValue xdfgetPlOutUserId()
    { if (_plOutUserId == null) { _plOutUserId = nCV(); }
      return _plOutUserId; }
    protected ConditionValue xgetCValuePlOutUserId() { return xdfgetPlOutUserId(); }

    public Map<String, BUserCQ> getPlOutUserId_InScopeRelation_BUserByPlOutUserId() { return xgetSQueMap("plOutUserId_InScopeRelation_BUserByPlOutUserId"); }
    public String keepPlOutUserId_InScopeRelation_BUserByPlOutUserId(BUserCQ sq) { return xkeepSQue("plOutUserId_InScopeRelation_BUserByPlOutUserId", sq); }

    public Map<String, BUserCQ> getPlOutUserId_NotInScopeRelation_BUserByPlOutUserId() { return xgetSQueMap("plOutUserId_NotInScopeRelation_BUserByPlOutUserId"); }
    public String keepPlOutUserId_NotInScopeRelation_BUserByPlOutUserId(BUserCQ sq) { return xkeepSQue("plOutUserId_NotInScopeRelation_BUserByPlOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutUserId_Asc() { regOBA("PL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutUserId_Desc() { regOBD("PL_OUT_USER_ID"); return this; }

    protected ConditionValue _plOutDt;
    public ConditionValue xdfgetPlOutDt()
    { if (_plOutDt == null) { _plOutDt = nCV(); }
      return _plOutDt; }
    protected ConditionValue xgetCValuePlOutDt() { return xdfgetPlOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutDt_Asc() { regOBA("PL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PlOutDt_Desc() { regOBD("PL_OUT_DT"); return this; }

    protected ConditionValue _slOutFlg;
    public ConditionValue xdfgetSlOutFlg()
    { if (_slOutFlg == null) { _slOutFlg = nCV(); }
      return _slOutFlg; }
    protected ConditionValue xgetCValueSlOutFlg() { return xdfgetSlOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlOutFlg_Asc() { regOBA("SL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlOutFlg_Desc() { regOBD("SL_OUT_FLG"); return this; }

    protected ConditionValue _pl2OutFlg;
    public ConditionValue xdfgetPl2OutFlg()
    { if (_pl2OutFlg == null) { _pl2OutFlg = nCV(); }
      return _pl2OutFlg; }
    protected ConditionValue xgetCValuePl2OutFlg() { return xdfgetPl2OutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutFlg_Asc() { regOBA("PL2_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutFlg_Desc() { regOBD("PL2_OUT_FLG"); return this; }

    protected ConditionValue _pl2OutUserId;
    public ConditionValue xdfgetPl2OutUserId()
    { if (_pl2OutUserId == null) { _pl2OutUserId = nCV(); }
      return _pl2OutUserId; }
    protected ConditionValue xgetCValuePl2OutUserId() { return xdfgetPl2OutUserId(); }

    public Map<String, BUserCQ> getPl2OutUserId_InScopeRelation_BUserByPl2OutUserId() { return xgetSQueMap("pl2OutUserId_InScopeRelation_BUserByPl2OutUserId"); }
    public String keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(BUserCQ sq) { return xkeepSQue("pl2OutUserId_InScopeRelation_BUserByPl2OutUserId", sq); }

    public Map<String, BUserCQ> getPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId() { return xgetSQueMap("pl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId"); }
    public String keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(BUserCQ sq) { return xkeepSQue("pl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutUserId_Asc() { regOBA("PL2_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutUserId_Desc() { regOBD("PL2_OUT_USER_ID"); return this; }

    protected ConditionValue _pl2OutDt;
    public ConditionValue xdfgetPl2OutDt()
    { if (_pl2OutDt == null) { _pl2OutDt = nCV(); }
      return _pl2OutDt; }
    protected ConditionValue xgetCValuePl2OutDt() { return xdfgetPl2OutDt(); }

    /**
     * Add order-by as ascend. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutDt_Asc() { regOBA("PL2_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PL2_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_Pl2OutDt_Desc() { regOBD("PL2_OUT_DT"); return this; }

    protected ConditionValue _caseOutFlg;
    public ConditionValue xdfgetCaseOutFlg()
    { if (_caseOutFlg == null) { _caseOutFlg = nCV(); }
      return _caseOutFlg; }
    protected ConditionValue xgetCValueCaseOutFlg() { return xdfgetCaseOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutFlg_Asc() { regOBA("CASE_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutFlg_Desc() { regOBD("CASE_OUT_FLG"); return this; }

    protected ConditionValue _caseOutUserId;
    public ConditionValue xdfgetCaseOutUserId()
    { if (_caseOutUserId == null) { _caseOutUserId = nCV(); }
      return _caseOutUserId; }
    protected ConditionValue xgetCValueCaseOutUserId() { return xdfgetCaseOutUserId(); }

    public Map<String, BUserCQ> getCaseOutUserId_InScopeRelation_BUserByCaseOutUserId() { return xgetSQueMap("caseOutUserId_InScopeRelation_BUserByCaseOutUserId"); }
    public String keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(BUserCQ sq) { return xkeepSQue("caseOutUserId_InScopeRelation_BUserByCaseOutUserId", sq); }

    public Map<String, BUserCQ> getCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId() { return xgetSQueMap("caseOutUserId_NotInScopeRelation_BUserByCaseOutUserId"); }
    public String keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(BUserCQ sq) { return xkeepSQue("caseOutUserId_NotInScopeRelation_BUserByCaseOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutUserId_Asc() { regOBA("CASE_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutUserId_Desc() { regOBD("CASE_OUT_USER_ID"); return this; }

    protected ConditionValue _caseOutDt;
    public ConditionValue xdfgetCaseOutDt()
    { if (_caseOutDt == null) { _caseOutDt = nCV(); }
      return _caseOutDt; }
    protected ConditionValue xgetCValueCaseOutDt() { return xdfgetCaseOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutDt_Asc() { regOBA("CASE_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * CASE_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_CaseOutDt_Desc() { regOBD("CASE_OUT_DT"); return this; }

    protected ConditionValue _packingOutFlg;
    public ConditionValue xdfgetPackingOutFlg()
    { if (_packingOutFlg == null) { _packingOutFlg = nCV(); }
      return _packingOutFlg; }
    protected ConditionValue xgetCValuePackingOutFlg() { return xdfgetPackingOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutFlg_Asc() { regOBA("PACKING_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutFlg_Desc() { regOBD("PACKING_OUT_FLG"); return this; }

    protected ConditionValue _packingOutUserId;
    public ConditionValue xdfgetPackingOutUserId()
    { if (_packingOutUserId == null) { _packingOutUserId = nCV(); }
      return _packingOutUserId; }
    protected ConditionValue xgetCValuePackingOutUserId() { return xdfgetPackingOutUserId(); }

    public Map<String, BUserCQ> getPackingOutUserId_InScopeRelation_BUserByPackingOutUserId() { return xgetSQueMap("packingOutUserId_InScopeRelation_BUserByPackingOutUserId"); }
    public String keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(BUserCQ sq) { return xkeepSQue("packingOutUserId_InScopeRelation_BUserByPackingOutUserId", sq); }

    public Map<String, BUserCQ> getPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId() { return xgetSQueMap("packingOutUserId_NotInScopeRelation_BUserByPackingOutUserId"); }
    public String keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(BUserCQ sq) { return xkeepSQue("packingOutUserId_NotInScopeRelation_BUserByPackingOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutUserId_Asc() { regOBA("PACKING_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutUserId_Desc() { regOBD("PACKING_OUT_USER_ID"); return this; }

    protected ConditionValue _packingOutDt;
    public ConditionValue xdfgetPackingOutDt()
    { if (_packingOutDt == null) { _packingOutDt = nCV(); }
      return _packingOutDt; }
    protected ConditionValue xgetCValuePackingOutDt() { return xdfgetPackingOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutDt_Asc() { regOBA("PACKING_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PACKING_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PackingOutDt_Desc() { regOBD("PACKING_OUT_DT"); return this; }

    protected ConditionValue _slipOutFlg;
    public ConditionValue xdfgetSlipOutFlg()
    { if (_slipOutFlg == null) { _slipOutFlg = nCV(); }
      return _slipOutFlg; }
    protected ConditionValue xgetCValueSlipOutFlg() { return xdfgetSlipOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutFlg_Asc() { regOBA("SLIP_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutFlg_Desc() { regOBD("SLIP_OUT_FLG"); return this; }

    protected ConditionValue _slipOutUserId;
    public ConditionValue xdfgetSlipOutUserId()
    { if (_slipOutUserId == null) { _slipOutUserId = nCV(); }
      return _slipOutUserId; }
    protected ConditionValue xgetCValueSlipOutUserId() { return xdfgetSlipOutUserId(); }

    public Map<String, BUserCQ> getSlipOutUserId_InScopeRelation_BUserBySlipOutUserId() { return xgetSQueMap("slipOutUserId_InScopeRelation_BUserBySlipOutUserId"); }
    public String keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(BUserCQ sq) { return xkeepSQue("slipOutUserId_InScopeRelation_BUserBySlipOutUserId", sq); }

    public Map<String, BUserCQ> getSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId() { return xgetSQueMap("slipOutUserId_NotInScopeRelation_BUserBySlipOutUserId"); }
    public String keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(BUserCQ sq) { return xkeepSQue("slipOutUserId_NotInScopeRelation_BUserBySlipOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutUserId_Asc() { regOBA("SLIP_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutUserId_Desc() { regOBD("SLIP_OUT_USER_ID"); return this; }

    protected ConditionValue _slipOutDt;
    public ConditionValue xdfgetSlipOutDt()
    { if (_slipOutDt == null) { _slipOutDt = nCV(); }
      return _slipOutDt; }
    protected ConditionValue xgetCValueSlipOutDt() { return xdfgetSlipOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutDt_Asc() { regOBA("SLIP_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SLIP_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_SlipOutDt_Desc() { regOBD("SLIP_OUT_DT"); return this; }

    protected ConditionValue _invoiceCreateFlg;
    public ConditionValue xdfgetInvoiceCreateFlg()
    { if (_invoiceCreateFlg == null) { _invoiceCreateFlg = nCV(); }
      return _invoiceCreateFlg; }
    protected ConditionValue xgetCValueInvoiceCreateFlg() { return xdfgetInvoiceCreateFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceCreateFlg_Asc() { regOBA("INVOICE_CREATE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceCreateFlg_Desc() { regOBD("INVOICE_CREATE_FLG"); return this; }

    protected ConditionValue _invoiceCreateDt;
    public ConditionValue xdfgetInvoiceCreateDt()
    { if (_invoiceCreateDt == null) { _invoiceCreateDt = nCV(); }
      return _invoiceCreateDt; }
    protected ConditionValue xgetCValueInvoiceCreateDt() { return xdfgetInvoiceCreateDt(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceCreateDt_Asc() { regOBA("INVOICE_CREATE_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_CREATE_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceCreateDt_Desc() { regOBD("INVOICE_CREATE_DT"); return this; }

    protected ConditionValue _invoiceIssueNum;
    public ConditionValue xdfgetInvoiceIssueNum()
    { if (_invoiceIssueNum == null) { _invoiceIssueNum = nCV(); }
      return _invoiceIssueNum; }
    protected ConditionValue xgetCValueInvoiceIssueNum() { return xdfgetInvoiceIssueNum(); }

    /**
     * Add order-by as ascend. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceIssueNum_Asc() { regOBA("INVOICE_ISSUE_NUM"); return this; }

    /**
     * Add order-by as descend. <br>
     * INVOICE_ISSUE_NUM: {BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_InvoiceIssueNum_Desc() { regOBD("INVOICE_ISSUE_NUM"); return this; }

    protected ConditionValue _shippingRecordOutFlg;
    public ConditionValue xdfgetShippingRecordOutFlg()
    { if (_shippingRecordOutFlg == null) { _shippingRecordOutFlg = nCV(); }
      return _shippingRecordOutFlg; }
    protected ConditionValue xgetCValueShippingRecordOutFlg() { return xdfgetShippingRecordOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutFlg_Asc() { regOBA("SHIPPING_RECORD_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutFlg_Desc() { regOBD("SHIPPING_RECORD_OUT_FLG"); return this; }

    protected ConditionValue _shippingRecordOutUserId;
    public ConditionValue xdfgetShippingRecordOutUserId()
    { if (_shippingRecordOutUserId == null) { _shippingRecordOutUserId = nCV(); }
      return _shippingRecordOutUserId; }
    protected ConditionValue xgetCValueShippingRecordOutUserId() { return xdfgetShippingRecordOutUserId(); }

    public Map<String, BUserCQ> getShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId() { return xgetSQueMap("shippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId"); }
    public String keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq) { return xkeepSQue("shippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId", sq); }

    public Map<String, BUserCQ> getShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId() { return xgetSQueMap("shippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId"); }
    public String keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq) { return xkeepSQue("shippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutUserId_Asc() { regOBA("SHIPPING_RECORD_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutUserId_Desc() { regOBD("SHIPPING_RECORD_OUT_USER_ID"); return this; }

    protected ConditionValue _shippingRecordOutDt;
    public ConditionValue xdfgetShippingRecordOutDt()
    { if (_shippingRecordOutDt == null) { _shippingRecordOutDt = nCV(); }
      return _shippingRecordOutDt; }
    protected ConditionValue xgetCValueShippingRecordOutDt() { return xdfgetShippingRecordOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutDt_Asc() { regOBA("SHIPPING_RECORD_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * SHIPPING_RECORD_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ShippingRecordOutDt_Desc() { regOBD("SHIPPING_RECORD_OUT_DT"); return this; }

    protected ConditionValue _bolOutFlg;
    public ConditionValue xdfgetBolOutFlg()
    { if (_bolOutFlg == null) { _bolOutFlg = nCV(); }
      return _bolOutFlg; }
    protected ConditionValue xgetCValueBolOutFlg() { return xdfgetBolOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutFlg_Asc() { regOBA("BOL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutFlg_Desc() { regOBD("BOL_OUT_FLG"); return this; }

    protected ConditionValue _bolOutUserId;
    public ConditionValue xdfgetBolOutUserId()
    { if (_bolOutUserId == null) { _bolOutUserId = nCV(); }
      return _bolOutUserId; }
    protected ConditionValue xgetCValueBolOutUserId() { return xdfgetBolOutUserId(); }

    public Map<String, BUserCQ> getBolOutUserId_InScopeRelation_BUserByBolOutUserId() { return xgetSQueMap("bolOutUserId_InScopeRelation_BUserByBolOutUserId"); }
    public String keepBolOutUserId_InScopeRelation_BUserByBolOutUserId(BUserCQ sq) { return xkeepSQue("bolOutUserId_InScopeRelation_BUserByBolOutUserId", sq); }

    public Map<String, BUserCQ> getBolOutUserId_NotInScopeRelation_BUserByBolOutUserId() { return xgetSQueMap("bolOutUserId_NotInScopeRelation_BUserByBolOutUserId"); }
    public String keepBolOutUserId_NotInScopeRelation_BUserByBolOutUserId(BUserCQ sq) { return xkeepSQue("bolOutUserId_NotInScopeRelation_BUserByBolOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutUserId_Asc() { regOBA("BOL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutUserId_Desc() { regOBD("BOL_OUT_USER_ID"); return this; }

    protected ConditionValue _bolOutDt;
    public ConditionValue xdfgetBolOutDt()
    { if (_bolOutDt == null) { _bolOutDt = nCV(); }
      return _bolOutDt; }
    protected ConditionValue xgetCValueBolOutDt() { return xdfgetBolOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutDt_Asc() { regOBA("BOL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * BOL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_BolOutDt_Desc() { regOBD("BOL_OUT_DT"); return this; }

    protected ConditionValue _tagOutFlg;
    public ConditionValue xdfgetTagOutFlg()
    { if (_tagOutFlg == null) { _tagOutFlg = nCV(); }
      return _tagOutFlg; }
    protected ConditionValue xgetCValueTagOutFlg() { return xdfgetTagOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutFlg_Asc() { regOBA("TAG_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutFlg_Desc() { regOBD("TAG_OUT_FLG"); return this; }

    protected ConditionValue _tagOutUserId;
    public ConditionValue xdfgetTagOutUserId()
    { if (_tagOutUserId == null) { _tagOutUserId = nCV(); }
      return _tagOutUserId; }
    protected ConditionValue xgetCValueTagOutUserId() { return xdfgetTagOutUserId(); }

    public Map<String, BUserCQ> getTagOutUserId_InScopeRelation_BUserByTagOutUserId() { return xgetSQueMap("tagOutUserId_InScopeRelation_BUserByTagOutUserId"); }
    public String keepTagOutUserId_InScopeRelation_BUserByTagOutUserId(BUserCQ sq) { return xkeepSQue("tagOutUserId_InScopeRelation_BUserByTagOutUserId", sq); }

    public Map<String, BUserCQ> getTagOutUserId_NotInScopeRelation_BUserByTagOutUserId() { return xgetSQueMap("tagOutUserId_NotInScopeRelation_BUserByTagOutUserId"); }
    public String keepTagOutUserId_NotInScopeRelation_BUserByTagOutUserId(BUserCQ sq) { return xkeepSQue("tagOutUserId_NotInScopeRelation_BUserByTagOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutUserId_Asc() { regOBA("TAG_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutUserId_Desc() { regOBD("TAG_OUT_USER_ID"); return this; }

    protected ConditionValue _tagOutDt;
    public ConditionValue xdfgetTagOutDt()
    { if (_tagOutDt == null) { _tagOutDt = nCV(); }
      return _tagOutDt; }
    protected ConditionValue xgetCValueTagOutDt() { return xdfgetTagOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutDt_Asc() { regOBA("TAG_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * TAG_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_TagOutDt_Desc() { regOBD("TAG_OUT_DT"); return this; }

    protected ConditionValue _delivOutFlg;
    public ConditionValue xdfgetDelivOutFlg()
    { if (_delivOutFlg == null) { _delivOutFlg = nCV(); }
      return _delivOutFlg; }
    protected ConditionValue xgetCValueDelivOutFlg() { return xdfgetDelivOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutFlg_Asc() { regOBA("DELIV_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutFlg_Desc() { regOBD("DELIV_OUT_FLG"); return this; }

    protected ConditionValue _delivOutUserId;
    public ConditionValue xdfgetDelivOutUserId()
    { if (_delivOutUserId == null) { _delivOutUserId = nCV(); }
      return _delivOutUserId; }
    protected ConditionValue xgetCValueDelivOutUserId() { return xdfgetDelivOutUserId(); }

    public Map<String, BUserCQ> getDelivOutUserId_InScopeRelation_BUserByDelivOutUserId() { return xgetSQueMap("delivOutUserId_InScopeRelation_BUserByDelivOutUserId"); }
    public String keepDelivOutUserId_InScopeRelation_BUserByDelivOutUserId(BUserCQ sq) { return xkeepSQue("delivOutUserId_InScopeRelation_BUserByDelivOutUserId", sq); }

    public Map<String, BUserCQ> getDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId() { return xgetSQueMap("delivOutUserId_NotInScopeRelation_BUserByDelivOutUserId"); }
    public String keepDelivOutUserId_NotInScopeRelation_BUserByDelivOutUserId(BUserCQ sq) { return xkeepSQue("delivOutUserId_NotInScopeRelation_BUserByDelivOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutUserId_Asc() { regOBA("DELIV_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutUserId_Desc() { regOBD("DELIV_OUT_USER_ID"); return this; }

    protected ConditionValue _delivOutDt;
    public ConditionValue xdfgetDelivOutDt()
    { if (_delivOutDt == null) { _delivOutDt = nCV(); }
      return _delivOutDt; }
    protected ConditionValue xgetCValueDelivOutDt() { return xdfgetDelivOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutDt_Asc() { regOBA("DELIV_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * DELIV_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelivOutDt_Desc() { regOBD("DELIV_OUT_DT"); return this; }

    protected ConditionValue _pllOutFlg;
    public ConditionValue xdfgetPllOutFlg()
    { if (_pllOutFlg == null) { _pllOutFlg = nCV(); }
      return _pllOutFlg; }
    protected ConditionValue xgetCValuePllOutFlg() { return xdfgetPllOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutFlg_Asc() { regOBA("PLL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLL_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutFlg_Desc() { regOBD("PLL_OUT_FLG"); return this; }

    protected ConditionValue _pllOutUserId;
    public ConditionValue xdfgetPllOutUserId()
    { if (_pllOutUserId == null) { _pllOutUserId = nCV(); }
      return _pllOutUserId; }
    protected ConditionValue xgetCValuePllOutUserId() { return xdfgetPllOutUserId(); }

    public Map<String, BUserCQ> getPllOutUserId_InScopeRelation_BUserByPllOutUserId() { return xgetSQueMap("pllOutUserId_InScopeRelation_BUserByPllOutUserId"); }
    public String keepPllOutUserId_InScopeRelation_BUserByPllOutUserId(BUserCQ sq) { return xkeepSQue("pllOutUserId_InScopeRelation_BUserByPllOutUserId", sq); }

    public Map<String, BUserCQ> getPllOutUserId_NotInScopeRelation_BUserByPllOutUserId() { return xgetSQueMap("pllOutUserId_NotInScopeRelation_BUserByPllOutUserId"); }
    public String keepPllOutUserId_NotInScopeRelation_BUserByPllOutUserId(BUserCQ sq) { return xkeepSQue("pllOutUserId_NotInScopeRelation_BUserByPllOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutUserId_Asc() { regOBA("PLL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutUserId_Desc() { regOBD("PLL_OUT_USER_ID"); return this; }

    protected ConditionValue _pllOutDt;
    public ConditionValue xdfgetPllOutDt()
    { if (_pllOutDt == null) { _pllOutDt = nCV(); }
      return _pllOutDt; }
    protected ConditionValue xgetCValuePllOutDt() { return xdfgetPllOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutDt_Asc() { regOBA("PLL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * PLL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_PllOutDt_Desc() { regOBD("PLL_OUT_DT"); return this; }

    protected ConditionValue _nizoroeOutFlg;
    public ConditionValue xdfgetNizoroeOutFlg()
    { if (_nizoroeOutFlg == null) { _nizoroeOutFlg = nCV(); }
      return _nizoroeOutFlg; }
    protected ConditionValue xgetCValueNizoroeOutFlg() { return xdfgetNizoroeOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutFlg_Asc() { regOBA("NIZOROE_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutFlg_Desc() { regOBD("NIZOROE_OUT_FLG"); return this; }

    protected ConditionValue _nizoroeOutUserId;
    public ConditionValue xdfgetNizoroeOutUserId()
    { if (_nizoroeOutUserId == null) { _nizoroeOutUserId = nCV(); }
      return _nizoroeOutUserId; }
    protected ConditionValue xgetCValueNizoroeOutUserId() { return xdfgetNizoroeOutUserId(); }

    public Map<String, BUserCQ> getNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId() { return xgetSQueMap("nizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId"); }
    public String keepNizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq) { return xkeepSQue("nizoroeOutUserId_InScopeRelation_BUserByNizoroeOutUserId", sq); }

    public Map<String, BUserCQ> getNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId() { return xgetSQueMap("nizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId"); }
    public String keepNizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId(BUserCQ sq) { return xkeepSQue("nizoroeOutUserId_NotInScopeRelation_BUserByNizoroeOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutUserId_Asc() { regOBA("NIZOROE_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutUserId_Desc() { regOBD("NIZOROE_OUT_USER_ID"); return this; }

    protected ConditionValue _nizoroeOutDt;
    public ConditionValue xdfgetNizoroeOutDt()
    { if (_nizoroeOutDt == null) { _nizoroeOutDt = nCV(); }
      return _nizoroeOutDt; }
    protected ConditionValue xgetCValueNizoroeOutDt() { return xdfgetNizoroeOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutDt_Asc() { regOBA("NIZOROE_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * NIZOROE_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_NizoroeOutDt_Desc() { regOBD("NIZOROE_OUT_DT"); return this; }

    protected ConditionValue _indvSupplyOutFlg;
    public ConditionValue xdfgetIndvSupplyOutFlg()
    { if (_indvSupplyOutFlg == null) { _indvSupplyOutFlg = nCV(); }
      return _indvSupplyOutFlg; }
    protected ConditionValue xgetCValueIndvSupplyOutFlg() { return xdfgetIndvSupplyOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutFlg_Asc() { regOBA("INDV_SUPPLY_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_SUPPLY_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutFlg_Desc() { regOBD("INDV_SUPPLY_OUT_FLG"); return this; }

    protected ConditionValue _indvSupplyOutUserId;
    public ConditionValue xdfgetIndvSupplyOutUserId()
    { if (_indvSupplyOutUserId == null) { _indvSupplyOutUserId = nCV(); }
      return _indvSupplyOutUserId; }
    protected ConditionValue xgetCValueIndvSupplyOutUserId() { return xdfgetIndvSupplyOutUserId(); }

    public Map<String, BUserCQ> getIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId() { return xgetSQueMap("indvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId"); }
    public String keepIndvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq) { return xkeepSQue("indvSupplyOutUserId_InScopeRelation_BUserByIndvSupplyOutUserId", sq); }

    public Map<String, BUserCQ> getIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId() { return xgetSQueMap("indvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId"); }
    public String keepIndvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId(BUserCQ sq) { return xkeepSQue("indvSupplyOutUserId_NotInScopeRelation_BUserByIndvSupplyOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutUserId_Asc() { regOBA("INDV_SUPPLY_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutUserId_Desc() { regOBD("INDV_SUPPLY_OUT_USER_ID"); return this; }

    protected ConditionValue _indvSupplyOutDt;
    public ConditionValue xdfgetIndvSupplyOutDt()
    { if (_indvSupplyOutDt == null) { _indvSupplyOutDt = nCV(); }
      return _indvSupplyOutDt; }
    protected ConditionValue xgetCValueIndvSupplyOutDt() { return xdfgetIndvSupplyOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutDt_Asc() { regOBA("INDV_SUPPLY_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_SUPPLY_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvSupplyOutDt_Desc() { regOBD("INDV_SUPPLY_OUT_DT"); return this; }

    protected ConditionValue _indvLabelOutFlg;
    public ConditionValue xdfgetIndvLabelOutFlg()
    { if (_indvLabelOutFlg == null) { _indvLabelOutFlg = nCV(); }
      return _indvLabelOutFlg; }
    protected ConditionValue xgetCValueIndvLabelOutFlg() { return xdfgetIndvLabelOutFlg(); }

    /**
     * Add order-by as ascend. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutFlg_Asc() { regOBA("INDV_LABEL_OUT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_LABEL_OUT_FLG: {CHAR(1)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutFlg_Desc() { regOBD("INDV_LABEL_OUT_FLG"); return this; }

    protected ConditionValue _indvLabelOutUserId;
    public ConditionValue xdfgetIndvLabelOutUserId()
    { if (_indvLabelOutUserId == null) { _indvLabelOutUserId = nCV(); }
      return _indvLabelOutUserId; }
    protected ConditionValue xgetCValueIndvLabelOutUserId() { return xdfgetIndvLabelOutUserId(); }

    public Map<String, BUserCQ> getIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId() { return xgetSQueMap("indvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId"); }
    public String keepIndvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq) { return xkeepSQue("indvLabelOutUserId_InScopeRelation_BUserByIndvLabelOutUserId", sq); }

    public Map<String, BUserCQ> getIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId() { return xgetSQueMap("indvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId"); }
    public String keepIndvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId(BUserCQ sq) { return xkeepSQue("indvLabelOutUserId_NotInScopeRelation_BUserByIndvLabelOutUserId", sq); }

    /**
     * Add order-by as ascend. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutUserId_Asc() { regOBA("INDV_LABEL_OUT_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutUserId_Desc() { regOBD("INDV_LABEL_OUT_USER_ID"); return this; }

    protected ConditionValue _indvLabelOutDt;
    public ConditionValue xdfgetIndvLabelOutDt()
    { if (_indvLabelOutDt == null) { _indvLabelOutDt = nCV(); }
      return _indvLabelOutDt; }
    protected ConditionValue xgetCValueIndvLabelOutDt() { return xdfgetIndvLabelOutDt(); }

    /**
     * Add order-by as ascend. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutDt_Asc() { regOBA("INDV_LABEL_OUT_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * INDV_LABEL_OUT_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_IndvLabelOutDt_Desc() { regOBD("INDV_LABEL_OUT_DT"); return this; }

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
    public BsTPickingRCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsTPickingRCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsTPickingRCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsTPickingRCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsTPickingRCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsTPickingRCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsTPickingRCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsTPickingRCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsTPickingRCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsTPickingRCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsTPickingRCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsTPickingRCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        TPickingRCQ bq = (TPickingRCQ)bqs;
        TPickingRCQ uq = (TPickingRCQ)uqs;
        if (bq.hasConditionQueryTPickingH()) {
            uq.queryTPickingH().reflectRelationOnUnionQuery(bq.queryTPickingH(), uq.queryTPickingH());
        }
        if (bq.hasConditionQueryBUserByCaseOutUserId()) {
            uq.queryBUserByCaseOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByCaseOutUserId(), uq.queryBUserByCaseOutUserId());
        }
        if (bq.hasConditionQueryBUserByBolOutUserId()) {
            uq.queryBUserByBolOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByBolOutUserId(), uq.queryBUserByBolOutUserId());
        }
        if (bq.hasConditionQueryBUserByPl1OutUserId()) {
            uq.queryBUserByPl1OutUserId().reflectRelationOnUnionQuery(bq.queryBUserByPl1OutUserId(), uq.queryBUserByPl1OutUserId());
        }
        if (bq.hasConditionQueryBUserByTagOutUserId()) {
            uq.queryBUserByTagOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByTagOutUserId(), uq.queryBUserByTagOutUserId());
        }
        if (bq.hasConditionQueryBUserByShippingRecordOutUserId()) {
            uq.queryBUserByShippingRecordOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByShippingRecordOutUserId(), uq.queryBUserByShippingRecordOutUserId());
        }
        if (bq.hasConditionQueryBUserByDelivOutUserId()) {
            uq.queryBUserByDelivOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByDelivOutUserId(), uq.queryBUserByDelivOutUserId());
        }
        if (bq.hasConditionQueryBUserByIndvSupplyOutUserId()) {
            uq.queryBUserByIndvSupplyOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByIndvSupplyOutUserId(), uq.queryBUserByIndvSupplyOutUserId());
        }
        if (bq.hasConditionQueryBUserByPackingOutUserId()) {
            uq.queryBUserByPackingOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByPackingOutUserId(), uq.queryBUserByPackingOutUserId());
        }
        if (bq.hasConditionQueryBUserByPlOutUserId()) {
            uq.queryBUserByPlOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByPlOutUserId(), uq.queryBUserByPlOutUserId());
        }
        if (bq.hasConditionQueryBUserByIndvLabelOutUserId()) {
            uq.queryBUserByIndvLabelOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByIndvLabelOutUserId(), uq.queryBUserByIndvLabelOutUserId());
        }
        if (bq.hasConditionQueryBUserByPl2OutUserId()) {
            uq.queryBUserByPl2OutUserId().reflectRelationOnUnionQuery(bq.queryBUserByPl2OutUserId(), uq.queryBUserByPl2OutUserId());
        }
        if (bq.hasConditionQueryBUserBySlipOutUserId()) {
            uq.queryBUserBySlipOutUserId().reflectRelationOnUnionQuery(bq.queryBUserBySlipOutUserId(), uq.queryBUserBySlipOutUserId());
        }
        if (bq.hasConditionQueryBUserByNizoroeOutUserId()) {
            uq.queryBUserByNizoroeOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByNizoroeOutUserId(), uq.queryBUserByNizoroeOutUserId());
        }
        if (bq.hasConditionQueryBUserByPllOutUserId()) {
            uq.queryBUserByPllOutUserId().reflectRelationOnUnionQuery(bq.queryBUserByPllOutUserId(), uq.queryBUserByPllOutUserId());
        }
        if (bq.hasConditionQueryBClassDtlByInvoiceCreateFlg()) {
            uq.queryBClassDtlByInvoiceCreateFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByInvoiceCreateFlg(), uq.queryBClassDtlByInvoiceCreateFlg());
        }
        if (bq.hasConditionQueryBClassDtlByOplOutFlg()) {
            uq.queryBClassDtlByOplOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByOplOutFlg(), uq.queryBClassDtlByOplOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByTplOutFlg()) {
            uq.queryBClassDtlByTplOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByTplOutFlg(), uq.queryBClassDtlByTplOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByCaseOutFlg()) {
            uq.queryBClassDtlByCaseOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByCaseOutFlg(), uq.queryBClassDtlByCaseOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByMltOutFlg()) {
            uq.queryBClassDtlByMltOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByMltOutFlg(), uq.queryBClassDtlByMltOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySplOutFlg()) {
            uq.queryBClassDtlBySplOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySplOutFlg(), uq.queryBClassDtlBySplOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPlOutFlg()) {
            uq.queryBClassDtlByPlOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPlOutFlg(), uq.queryBClassDtlByPlOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySlOutFlg()) {
            uq.queryBClassDtlBySlOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySlOutFlg(), uq.queryBClassDtlBySlOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPl1OutFlg()) {
            uq.queryBClassDtlByPl1OutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPl1OutFlg(), uq.queryBClassDtlByPl1OutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPl2OutFlg()) {
            uq.queryBClassDtlByPl2OutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPl2OutFlg(), uq.queryBClassDtlByPl2OutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByPackingOutFlg()) {
            uq.queryBClassDtlByPackingOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByPackingOutFlg(), uq.queryBClassDtlByPackingOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlBySlipOutFlg()) {
            uq.queryBClassDtlBySlipOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlBySlipOutFlg(), uq.queryBClassDtlBySlipOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByShippingRecordOutFlg()) {
            uq.queryBClassDtlByShippingRecordOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByShippingRecordOutFlg(), uq.queryBClassDtlByShippingRecordOutFlg());
        }
        if (bq.hasConditionQueryBClassDtlByBolOutFlg()) {
            uq.queryBClassDtlByBolOutFlg().reflectRelationOnUnionQuery(bq.queryBClassDtlByBolOutFlg(), uq.queryBClassDtlByBolOutFlg());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The instance of condition-query. (NotNull)
     */
    public TPickingHCQ queryTPickingH() {
        return xdfgetConditionQueryTPickingH();
    }
    public TPickingHCQ xdfgetConditionQueryTPickingH() {
        String prop = "tPickingH";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryTPickingH()); xsetupOuterJoinTPickingH(); }
        return xgetQueRlMap(prop);
    }
    protected TPickingHCQ xcreateQueryTPickingH() {
        String nrp = xresolveNRP("t_picking_r", "tPickingH"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new TPickingHCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "tPickingH", nrp);
    }
    protected void xsetupOuterJoinTPickingH() { xregOutJo("tPickingH"); }
    public boolean hasConditionQueryTPickingH() { return xhasQueRlMap("tPickingH"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByCaseOutUserId() {
        return xdfgetConditionQueryBUserByCaseOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByCaseOutUserId() {
        String prop = "bUserByCaseOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByCaseOutUserId()); xsetupOuterJoinBUserByCaseOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByCaseOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByCaseOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByCaseOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByCaseOutUserId() { xregOutJo("bUserByCaseOutUserId"); }
    public boolean hasConditionQueryBUserByCaseOutUserId() { return xhasQueRlMap("bUserByCaseOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my BOL_OUT_USER_ID, named 'BUserByBolOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByBolOutUserId() {
        return xdfgetConditionQueryBUserByBolOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByBolOutUserId() {
        String prop = "bUserByBolOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByBolOutUserId()); xsetupOuterJoinBUserByBolOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByBolOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByBolOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByBolOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByBolOutUserId() { xregOutJo("bUserByBolOutUserId"); }
    public boolean hasConditionQueryBUserByBolOutUserId() { return xhasQueRlMap("bUserByBolOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByPl1OutUserId() {
        return xdfgetConditionQueryBUserByPl1OutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByPl1OutUserId() {
        String prop = "bUserByPl1OutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByPl1OutUserId()); xsetupOuterJoinBUserByPl1OutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByPl1OutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByPl1OutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByPl1OutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByPl1OutUserId() { xregOutJo("bUserByPl1OutUserId"); }
    public boolean hasConditionQueryBUserByPl1OutUserId() { return xhasQueRlMap("bUserByPl1OutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByTagOutUserId() {
        return xdfgetConditionQueryBUserByTagOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByTagOutUserId() {
        String prop = "bUserByTagOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByTagOutUserId()); xsetupOuterJoinBUserByTagOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByTagOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByTagOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByTagOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByTagOutUserId() { xregOutJo("bUserByTagOutUserId"); }
    public boolean hasConditionQueryBUserByTagOutUserId() { return xhasQueRlMap("bUserByTagOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByShippingRecordOutUserId() {
        return xdfgetConditionQueryBUserByShippingRecordOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByShippingRecordOutUserId() {
        String prop = "bUserByShippingRecordOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByShippingRecordOutUserId()); xsetupOuterJoinBUserByShippingRecordOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByShippingRecordOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByShippingRecordOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByShippingRecordOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByShippingRecordOutUserId() { xregOutJo("bUserByShippingRecordOutUserId"); }
    public boolean hasConditionQueryBUserByShippingRecordOutUserId() { return xhasQueRlMap("bUserByShippingRecordOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my DELIV_OUT_USER_ID, named 'BUserByDelivOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByDelivOutUserId() {
        return xdfgetConditionQueryBUserByDelivOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByDelivOutUserId() {
        String prop = "bUserByDelivOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByDelivOutUserId()); xsetupOuterJoinBUserByDelivOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByDelivOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByDelivOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByDelivOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByDelivOutUserId() { xregOutJo("bUserByDelivOutUserId"); }
    public boolean hasConditionQueryBUserByDelivOutUserId() { return xhasQueRlMap("bUserByDelivOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my INDV_SUPPLY_OUT_USER_ID, named 'BUserByIndvSupplyOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByIndvSupplyOutUserId() {
        return xdfgetConditionQueryBUserByIndvSupplyOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByIndvSupplyOutUserId() {
        String prop = "bUserByIndvSupplyOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByIndvSupplyOutUserId()); xsetupOuterJoinBUserByIndvSupplyOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByIndvSupplyOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByIndvSupplyOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByIndvSupplyOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByIndvSupplyOutUserId() { xregOutJo("bUserByIndvSupplyOutUserId"); }
    public boolean hasConditionQueryBUserByIndvSupplyOutUserId() { return xhasQueRlMap("bUserByIndvSupplyOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByPackingOutUserId() {
        return xdfgetConditionQueryBUserByPackingOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByPackingOutUserId() {
        String prop = "bUserByPackingOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByPackingOutUserId()); xsetupOuterJoinBUserByPackingOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByPackingOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByPackingOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByPackingOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByPackingOutUserId() { xregOutJo("bUserByPackingOutUserId"); }
    public boolean hasConditionQueryBUserByPackingOutUserId() { return xhasQueRlMap("bUserByPackingOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my PL_OUT_USER_ID, named 'BUserByPlOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByPlOutUserId() {
        return xdfgetConditionQueryBUserByPlOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByPlOutUserId() {
        String prop = "bUserByPlOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByPlOutUserId()); xsetupOuterJoinBUserByPlOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByPlOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByPlOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByPlOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByPlOutUserId() { xregOutJo("bUserByPlOutUserId"); }
    public boolean hasConditionQueryBUserByPlOutUserId() { return xhasQueRlMap("bUserByPlOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my INDV_LABEL_OUT_USER_ID, named 'BUserByIndvLabelOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByIndvLabelOutUserId() {
        return xdfgetConditionQueryBUserByIndvLabelOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByIndvLabelOutUserId() {
        String prop = "bUserByIndvLabelOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByIndvLabelOutUserId()); xsetupOuterJoinBUserByIndvLabelOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByIndvLabelOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByIndvLabelOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByIndvLabelOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByIndvLabelOutUserId() { xregOutJo("bUserByIndvLabelOutUserId"); }
    public boolean hasConditionQueryBUserByIndvLabelOutUserId() { return xhasQueRlMap("bUserByIndvLabelOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByPl2OutUserId() {
        return xdfgetConditionQueryBUserByPl2OutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByPl2OutUserId() {
        String prop = "bUserByPl2OutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByPl2OutUserId()); xsetupOuterJoinBUserByPl2OutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByPl2OutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByPl2OutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByPl2OutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByPl2OutUserId() { xregOutJo("bUserByPl2OutUserId"); }
    public boolean hasConditionQueryBUserByPl2OutUserId() { return xhasQueRlMap("bUserByPl2OutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserBySlipOutUserId() {
        return xdfgetConditionQueryBUserBySlipOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserBySlipOutUserId() {
        String prop = "bUserBySlipOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserBySlipOutUserId()); xsetupOuterJoinBUserBySlipOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserBySlipOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserBySlipOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserBySlipOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserBySlipOutUserId() { xregOutJo("bUserBySlipOutUserId"); }
    public boolean hasConditionQueryBUserBySlipOutUserId() { return xhasQueRlMap("bUserBySlipOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my NIZOROE_OUT_USER_ID, named 'BUserByNizoroeOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByNizoroeOutUserId() {
        return xdfgetConditionQueryBUserByNizoroeOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByNizoroeOutUserId() {
        String prop = "bUserByNizoroeOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByNizoroeOutUserId()); xsetupOuterJoinBUserByNizoroeOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByNizoroeOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByNizoroeOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByNizoroeOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByNizoroeOutUserId() { xregOutJo("bUserByNizoroeOutUserId"); }
    public boolean hasConditionQueryBUserByNizoroeOutUserId() { return xhasQueRlMap("bUserByNizoroeOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_user by my PLL_OUT_USER_ID, named 'BUserByPllOutUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public BUserCQ queryBUserByPllOutUserId() {
        return xdfgetConditionQueryBUserByPllOutUserId();
    }
    public BUserCQ xdfgetConditionQueryBUserByPllOutUserId() {
        String prop = "bUserByPllOutUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBUserByPllOutUserId()); xsetupOuterJoinBUserByPllOutUserId(); }
        return xgetQueRlMap(prop);
    }
    protected BUserCQ xcreateQueryBUserByPllOutUserId() {
        String nrp = xresolveNRP("t_picking_r", "bUserByPllOutUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BUserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bUserByPllOutUserId", nrp);
    }
    protected void xsetupOuterJoinBUserByPllOutUserId() { xregOutJo("bUserByPllOutUserId"); }
    public boolean hasConditionQueryBUserByPllOutUserId() { return xhasQueRlMap("bUserByPllOutUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByInvoiceCreateFlg() {
        return xdfgetConditionQueryBClassDtlByInvoiceCreateFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByInvoiceCreateFlg() {
        String prop = "bClassDtlByInvoiceCreateFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByInvoiceCreateFlg()); xsetupOuterJoinBClassDtlByInvoiceCreateFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByInvoiceCreateFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByInvoiceCreateFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByInvoiceCreateFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByInvoiceCreateFlg() { xregOutJo("bClassDtlByInvoiceCreateFlg"); }
    public boolean hasConditionQueryBClassDtlByInvoiceCreateFlg() { return xhasQueRlMap("bClassDtlByInvoiceCreateFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByOplOutFlg() {
        return xdfgetConditionQueryBClassDtlByOplOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByOplOutFlg() {
        String prop = "bClassDtlByOplOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByOplOutFlg()); xsetupOuterJoinBClassDtlByOplOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByOplOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByOplOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByOplOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByOplOutFlg() { xregOutJo("bClassDtlByOplOutFlg"); }
    public boolean hasConditionQueryBClassDtlByOplOutFlg() { return xhasQueRlMap("bClassDtlByOplOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByTplOutFlg() {
        return xdfgetConditionQueryBClassDtlByTplOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByTplOutFlg() {
        String prop = "bClassDtlByTplOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByTplOutFlg()); xsetupOuterJoinBClassDtlByTplOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByTplOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByTplOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByTplOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByTplOutFlg() { xregOutJo("bClassDtlByTplOutFlg"); }
    public boolean hasConditionQueryBClassDtlByTplOutFlg() { return xhasQueRlMap("bClassDtlByTplOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByCaseOutFlg() {
        return xdfgetConditionQueryBClassDtlByCaseOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByCaseOutFlg() {
        String prop = "bClassDtlByCaseOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByCaseOutFlg()); xsetupOuterJoinBClassDtlByCaseOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByCaseOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByCaseOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByCaseOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByCaseOutFlg() { xregOutJo("bClassDtlByCaseOutFlg"); }
    public boolean hasConditionQueryBClassDtlByCaseOutFlg() { return xhasQueRlMap("bClassDtlByCaseOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByMltOutFlg() {
        return xdfgetConditionQueryBClassDtlByMltOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByMltOutFlg() {
        String prop = "bClassDtlByMltOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByMltOutFlg()); xsetupOuterJoinBClassDtlByMltOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByMltOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByMltOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByMltOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByMltOutFlg() { xregOutJo("bClassDtlByMltOutFlg"); }
    public boolean hasConditionQueryBClassDtlByMltOutFlg() { return xhasQueRlMap("bClassDtlByMltOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySplOutFlg() {
        return xdfgetConditionQueryBClassDtlBySplOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySplOutFlg() {
        String prop = "bClassDtlBySplOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySplOutFlg()); xsetupOuterJoinBClassDtlBySplOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySplOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlBySplOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySplOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySplOutFlg() { xregOutJo("bClassDtlBySplOutFlg"); }
    public boolean hasConditionQueryBClassDtlBySplOutFlg() { return xhasQueRlMap("bClassDtlBySplOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPlOutFlg() {
        return xdfgetConditionQueryBClassDtlByPlOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPlOutFlg() {
        String prop = "bClassDtlByPlOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPlOutFlg()); xsetupOuterJoinBClassDtlByPlOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPlOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByPlOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPlOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPlOutFlg() { xregOutJo("bClassDtlByPlOutFlg"); }
    public boolean hasConditionQueryBClassDtlByPlOutFlg() { return xhasQueRlMap("bClassDtlByPlOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySlOutFlg() {
        return xdfgetConditionQueryBClassDtlBySlOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySlOutFlg() {
        String prop = "bClassDtlBySlOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySlOutFlg()); xsetupOuterJoinBClassDtlBySlOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySlOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlBySlOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySlOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySlOutFlg() { xregOutJo("bClassDtlBySlOutFlg"); }
    public boolean hasConditionQueryBClassDtlBySlOutFlg() { return xhasQueRlMap("bClassDtlBySlOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPl1OutFlg() {
        return xdfgetConditionQueryBClassDtlByPl1OutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPl1OutFlg() {
        String prop = "bClassDtlByPl1OutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPl1OutFlg()); xsetupOuterJoinBClassDtlByPl1OutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPl1OutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByPl1OutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPl1OutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPl1OutFlg() { xregOutJo("bClassDtlByPl1OutFlg"); }
    public boolean hasConditionQueryBClassDtlByPl1OutFlg() { return xhasQueRlMap("bClassDtlByPl1OutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPl2OutFlg() {
        return xdfgetConditionQueryBClassDtlByPl2OutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPl2OutFlg() {
        String prop = "bClassDtlByPl2OutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPl2OutFlg()); xsetupOuterJoinBClassDtlByPl2OutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPl2OutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByPl2OutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPl2OutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPl2OutFlg() { xregOutJo("bClassDtlByPl2OutFlg"); }
    public boolean hasConditionQueryBClassDtlByPl2OutFlg() { return xhasQueRlMap("bClassDtlByPl2OutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByPackingOutFlg() {
        return xdfgetConditionQueryBClassDtlByPackingOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByPackingOutFlg() {
        String prop = "bClassDtlByPackingOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByPackingOutFlg()); xsetupOuterJoinBClassDtlByPackingOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByPackingOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByPackingOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByPackingOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByPackingOutFlg() { xregOutJo("bClassDtlByPackingOutFlg"); }
    public boolean hasConditionQueryBClassDtlByPackingOutFlg() { return xhasQueRlMap("bClassDtlByPackingOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlBySlipOutFlg() {
        return xdfgetConditionQueryBClassDtlBySlipOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlBySlipOutFlg() {
        String prop = "bClassDtlBySlipOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlBySlipOutFlg()); xsetupOuterJoinBClassDtlBySlipOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlBySlipOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlBySlipOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlBySlipOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlBySlipOutFlg() { xregOutJo("bClassDtlBySlipOutFlg"); }
    public boolean hasConditionQueryBClassDtlBySlipOutFlg() { return xhasQueRlMap("bClassDtlBySlipOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByShippingRecordOutFlg() {
        return xdfgetConditionQueryBClassDtlByShippingRecordOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByShippingRecordOutFlg() {
        String prop = "bClassDtlByShippingRecordOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByShippingRecordOutFlg()); xsetupOuterJoinBClassDtlByShippingRecordOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByShippingRecordOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByShippingRecordOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByShippingRecordOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByShippingRecordOutFlg() { xregOutJo("bClassDtlByShippingRecordOutFlg"); }
    public boolean hasConditionQueryBClassDtlByShippingRecordOutFlg() { return xhasQueRlMap("bClassDtlByShippingRecordOutFlg"); }

    /**
     * Get the condition-query for relation table. <br>
     * b_class_dtl by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * @return The instance of condition-query. (NotNull)
     */
    public BClassDtlCQ queryBClassDtlByBolOutFlg() {
        return xdfgetConditionQueryBClassDtlByBolOutFlg();
    }
    public BClassDtlCQ xdfgetConditionQueryBClassDtlByBolOutFlg() {
        String prop = "bClassDtlByBolOutFlg";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryBClassDtlByBolOutFlg()); xsetupOuterJoinBClassDtlByBolOutFlg(); }
        return xgetQueRlMap(prop);
    }
    protected BClassDtlCQ xcreateQueryBClassDtlByBolOutFlg() {
        String nrp = xresolveNRP("t_picking_r", "bClassDtlByBolOutFlg"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new BClassDtlCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "bClassDtlByBolOutFlg", nrp);
    }
    protected void xsetupOuterJoinBClassDtlByBolOutFlg() { xregOutJo("bClassDtlByBolOutFlg"); }
    public boolean hasConditionQueryBClassDtlByBolOutFlg() { return xhasQueRlMap("bClassDtlByBolOutFlg"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TPickingRCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TPickingRCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TPickingRCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TPickingRCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TPickingRCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TPickingRCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TPickingRCQ> _myselfExistsMap;
    public Map<String, TPickingRCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TPickingRCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TPickingRCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TPickingRCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TPickingRCB.class.getName(); }
    protected String xCQ() { return TPickingRCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
