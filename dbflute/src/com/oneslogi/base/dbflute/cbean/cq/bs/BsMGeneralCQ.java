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
 * The base condition-query of m_general.
 * @author DBFlute(AutoGenerator)
 */
public class BsMGeneralCQ extends AbstractBsMGeneralCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MGeneralCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMGeneralCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from m_general) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MGeneralCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MGeneralCIQ xcreateCIQ() {
        MGeneralCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MGeneralCIQ xnewCIQ() {
        return new MGeneralCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join m_general on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MGeneralCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MGeneralCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _generalId;
    public ConditionValue xdfgetGeneralId()
    { if (_generalId == null) { _generalId = nCV(); }
      return _generalId; }
    protected ConditionValue xgetCValueGeneralId() { return xdfgetGeneralId(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralId_Asc() { regOBA("GENERAL_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralId_Desc() { regOBD("GENERAL_ID"); return this; }

    protected ConditionValue _centerId;
    public ConditionValue xdfgetCenterId()
    { if (_centerId == null) { _centerId = nCV(); }
      return _centerId; }
    protected ConditionValue xgetCValueCenterId() { return xdfgetCenterId(); }

    public Map<String, MCenterCQ> getCenterId_InScopeRelation_MCenter() { return xgetSQueMap("centerId_InScopeRelation_MCenter"); }
    public String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_InScopeRelation_MCenter", sq); }

    public Map<String, MCenterCQ> getCenterId_NotInScopeRelation_MCenter() { return xgetSQueMap("centerId_NotInScopeRelation_MCenter"); }
    public String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq) { return xkeepSQue("centerId_NotInScopeRelation_MCenter", sq); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_CenterId_Asc() { regOBA("CENTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_CenterId_Desc() { regOBD("CENTER_ID"); return this; }

    protected ConditionValue _centerCd;
    public ConditionValue xdfgetCenterCd()
    { if (_centerCd == null) { _centerCd = nCV(); }
      return _centerCd; }
    protected ConditionValue xgetCValueCenterCd() { return xdfgetCenterCd(); }

    /**
     * Add order-by as ascend. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_CenterCd_Asc() { regOBA("CENTER_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * CENTER_CD: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_CenterCd_Desc() { regOBD("CENTER_CD"); return this; }

    protected ConditionValue _generalMasterType;
    public ConditionValue xdfgetGeneralMasterType()
    { if (_generalMasterType == null) { _generalMasterType = nCV(); }
      return _generalMasterType; }
    protected ConditionValue xgetCValueGeneralMasterType() { return xdfgetGeneralMasterType(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralMasterType_Asc() { regOBA("GENERAL_MASTER_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_MASTER_TYPE: {UQ+, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralMasterType_Desc() { regOBD("GENERAL_MASTER_TYPE"); return this; }

    protected ConditionValue _generalMasterTypeNm;
    public ConditionValue xdfgetGeneralMasterTypeNm()
    { if (_generalMasterTypeNm == null) { _generalMasterTypeNm = nCV(); }
      return _generalMasterTypeNm; }
    protected ConditionValue xgetCValueGeneralMasterTypeNm() { return xdfgetGeneralMasterTypeNm(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralMasterTypeNm_Asc() { regOBA("GENERAL_MASTER_TYPE_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_MASTER_TYPE_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralMasterTypeNm_Desc() { regOBD("GENERAL_MASTER_TYPE_NM"); return this; }

    protected ConditionValue _generalCd;
    public ConditionValue xdfgetGeneralCd()
    { if (_generalCd == null) { _generalCd = nCV(); }
      return _generalCd; }
    protected ConditionValue xgetCValueGeneralCd() { return xdfgetGeneralCd(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralCd_Asc() { regOBA("GENERAL_CD"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_CD: {+UQ, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralCd_Desc() { regOBD("GENERAL_CD"); return this; }

    protected ConditionValue _generalNm;
    public ConditionValue xdfgetGeneralNm()
    { if (_generalNm == null) { _generalNm = nCV(); }
      return _generalNm; }
    protected ConditionValue xgetCValueGeneralNm() { return xdfgetGeneralNm(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralNm_Asc() { regOBA("GENERAL_NM"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_NM: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralNm_Desc() { regOBD("GENERAL_NM"); return this; }

    protected ConditionValue _generalAbbr;
    public ConditionValue xdfgetGeneralAbbr()
    { if (_generalAbbr == null) { _generalAbbr = nCV(); }
      return _generalAbbr; }
    protected ConditionValue xgetCValueGeneralAbbr() { return xdfgetGeneralAbbr(); }

    /**
     * Add order-by as ascend. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralAbbr_Asc() { regOBA("GENERAL_ABBR"); return this; }

    /**
     * Add order-by as descend. <br>
     * GENERAL_ABBR: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_GeneralAbbr_Desc() { regOBD("GENERAL_ABBR"); return this; }

    protected ConditionValue _character1;
    public ConditionValue xdfgetCharacter1()
    { if (_character1 == null) { _character1 = nCV(); }
      return _character1; }
    protected ConditionValue xgetCValueCharacter1() { return xdfgetCharacter1(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character1_Asc() { regOBA("CHARACTER1"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER1: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character1_Desc() { regOBD("CHARACTER1"); return this; }

    protected ConditionValue _character2;
    public ConditionValue xdfgetCharacter2()
    { if (_character2 == null) { _character2 = nCV(); }
      return _character2; }
    protected ConditionValue xgetCValueCharacter2() { return xdfgetCharacter2(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character2_Asc() { regOBA("CHARACTER2"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER2: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character2_Desc() { regOBD("CHARACTER2"); return this; }

    protected ConditionValue _character3;
    public ConditionValue xdfgetCharacter3()
    { if (_character3 == null) { _character3 = nCV(); }
      return _character3; }
    protected ConditionValue xgetCValueCharacter3() { return xdfgetCharacter3(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character3_Asc() { regOBA("CHARACTER3"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER3: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character3_Desc() { regOBD("CHARACTER3"); return this; }

    protected ConditionValue _character4;
    public ConditionValue xdfgetCharacter4()
    { if (_character4 == null) { _character4 = nCV(); }
      return _character4; }
    protected ConditionValue xgetCValueCharacter4() { return xdfgetCharacter4(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character4_Asc() { regOBA("CHARACTER4"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER4: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character4_Desc() { regOBD("CHARACTER4"); return this; }

    protected ConditionValue _character5;
    public ConditionValue xdfgetCharacter5()
    { if (_character5 == null) { _character5 = nCV(); }
      return _character5; }
    protected ConditionValue xgetCValueCharacter5() { return xdfgetCharacter5(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character5_Asc() { regOBA("CHARACTER5"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER5: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character5_Desc() { regOBD("CHARACTER5"); return this; }

    protected ConditionValue _character6;
    public ConditionValue xdfgetCharacter6()
    { if (_character6 == null) { _character6 = nCV(); }
      return _character6; }
    protected ConditionValue xgetCValueCharacter6() { return xdfgetCharacter6(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character6_Asc() { regOBA("CHARACTER6"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER6: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character6_Desc() { regOBD("CHARACTER6"); return this; }

    protected ConditionValue _character7;
    public ConditionValue xdfgetCharacter7()
    { if (_character7 == null) { _character7 = nCV(); }
      return _character7; }
    protected ConditionValue xgetCValueCharacter7() { return xdfgetCharacter7(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character7_Asc() { regOBA("CHARACTER7"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER7: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character7_Desc() { regOBD("CHARACTER7"); return this; }

    protected ConditionValue _character8;
    public ConditionValue xdfgetCharacter8()
    { if (_character8 == null) { _character8 = nCV(); }
      return _character8; }
    protected ConditionValue xgetCValueCharacter8() { return xdfgetCharacter8(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character8_Asc() { regOBA("CHARACTER8"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER8: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character8_Desc() { regOBD("CHARACTER8"); return this; }

    protected ConditionValue _character9;
    public ConditionValue xdfgetCharacter9()
    { if (_character9 == null) { _character9 = nCV(); }
      return _character9; }
    protected ConditionValue xgetCValueCharacter9() { return xdfgetCharacter9(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character9_Asc() { regOBA("CHARACTER9"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER9: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character9_Desc() { regOBD("CHARACTER9"); return this; }

    protected ConditionValue _character10;
    public ConditionValue xdfgetCharacter10()
    { if (_character10 == null) { _character10 = nCV(); }
      return _character10; }
    protected ConditionValue xgetCValueCharacter10() { return xdfgetCharacter10(); }

    /**
     * Add order-by as ascend. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character10_Asc() { regOBA("CHARACTER10"); return this; }

    /**
     * Add order-by as descend. <br>
     * CHARACTER10: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Character10_Desc() { regOBD("CHARACTER10"); return this; }

    protected ConditionValue _num1;
    public ConditionValue xdfgetNum1()
    { if (_num1 == null) { _num1 = nCV(); }
      return _num1; }
    protected ConditionValue xgetCValueNum1() { return xdfgetNum1(); }

    /**
     * Add order-by as ascend. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num1_Asc() { regOBA("NUM1"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM1: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num1_Desc() { regOBD("NUM1"); return this; }

    protected ConditionValue _num2;
    public ConditionValue xdfgetNum2()
    { if (_num2 == null) { _num2 = nCV(); }
      return _num2; }
    protected ConditionValue xgetCValueNum2() { return xdfgetNum2(); }

    /**
     * Add order-by as ascend. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num2_Asc() { regOBA("NUM2"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM2: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num2_Desc() { regOBD("NUM2"); return this; }

    protected ConditionValue _num3;
    public ConditionValue xdfgetNum3()
    { if (_num3 == null) { _num3 = nCV(); }
      return _num3; }
    protected ConditionValue xgetCValueNum3() { return xdfgetNum3(); }

    /**
     * Add order-by as ascend. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num3_Asc() { regOBA("NUM3"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM3: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num3_Desc() { regOBD("NUM3"); return this; }

    protected ConditionValue _num4;
    public ConditionValue xdfgetNum4()
    { if (_num4 == null) { _num4 = nCV(); }
      return _num4; }
    protected ConditionValue xgetCValueNum4() { return xdfgetNum4(); }

    /**
     * Add order-by as ascend. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num4_Asc() { regOBA("NUM4"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM4: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num4_Desc() { regOBD("NUM4"); return this; }

    protected ConditionValue _num5;
    public ConditionValue xdfgetNum5()
    { if (_num5 == null) { _num5 = nCV(); }
      return _num5; }
    protected ConditionValue xgetCValueNum5() { return xdfgetNum5(); }

    /**
     * Add order-by as ascend. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num5_Asc() { regOBA("NUM5"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM5: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num5_Desc() { regOBD("NUM5"); return this; }

    protected ConditionValue _num6;
    public ConditionValue xdfgetNum6()
    { if (_num6 == null) { _num6 = nCV(); }
      return _num6; }
    protected ConditionValue xgetCValueNum6() { return xdfgetNum6(); }

    /**
     * Add order-by as ascend. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num6_Asc() { regOBA("NUM6"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM6: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num6_Desc() { regOBD("NUM6"); return this; }

    protected ConditionValue _num7;
    public ConditionValue xdfgetNum7()
    { if (_num7 == null) { _num7 = nCV(); }
      return _num7; }
    protected ConditionValue xgetCValueNum7() { return xdfgetNum7(); }

    /**
     * Add order-by as ascend. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num7_Asc() { regOBA("NUM7"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM7: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num7_Desc() { regOBD("NUM7"); return this; }

    protected ConditionValue _num8;
    public ConditionValue xdfgetNum8()
    { if (_num8 == null) { _num8 = nCV(); }
      return _num8; }
    protected ConditionValue xgetCValueNum8() { return xdfgetNum8(); }

    /**
     * Add order-by as ascend. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num8_Asc() { regOBA("NUM8"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM8: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num8_Desc() { regOBD("NUM8"); return this; }

    protected ConditionValue _num9;
    public ConditionValue xdfgetNum9()
    { if (_num9 == null) { _num9 = nCV(); }
      return _num9; }
    protected ConditionValue xgetCValueNum9() { return xdfgetNum9(); }

    /**
     * Add order-by as ascend. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num9_Asc() { regOBA("NUM9"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM9: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num9_Desc() { regOBD("NUM9"); return this; }

    protected ConditionValue _num10;
    public ConditionValue xdfgetNum10()
    { if (_num10 == null) { _num10 = nCV(); }
      return _num10; }
    protected ConditionValue xgetCValueNum10() { return xdfgetNum10(); }

    /**
     * Add order-by as ascend. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num10_Asc() { regOBA("NUM10"); return this; }

    /**
     * Add order-by as descend. <br>
     * NUM10: {DECIMAL(14, 4), default=[0.0000]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Num10_Desc() { regOBD("NUM10"); return this; }

    protected ConditionValue _comment1;
    public ConditionValue xdfgetComment1()
    { if (_comment1 == null) { _comment1 = nCV(); }
      return _comment1; }
    protected ConditionValue xgetCValueComment1() { return xdfgetComment1(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENT1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Comment1_Asc() { regOBA("COMMENT1"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENT1: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Comment1_Desc() { regOBD("COMMENT1"); return this; }

    protected ConditionValue _comment2;
    public ConditionValue xdfgetComment2()
    { if (_comment2 == null) { _comment2 = nCV(); }
      return _comment2; }
    protected ConditionValue xgetCValueComment2() { return xdfgetComment2(); }

    /**
     * Add order-by as ascend. <br>
     * COMMENT2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Comment2_Asc() { regOBA("COMMENT2"); return this; }

    /**
     * Add order-by as descend. <br>
     * COMMENT2: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_Comment2_Desc() { regOBD("COMMENT2"); return this; }

    protected ConditionValue _defaultType;
    public ConditionValue xdfgetDefaultType()
    { if (_defaultType == null) { _defaultType = nCV(); }
      return _defaultType; }
    protected ConditionValue xgetCValueDefaultType() { return xdfgetDefaultType(); }

    /**
     * Add order-by as ascend. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_DefaultType_Asc() { regOBA("DEFAULT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEFAULT_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_DefaultType_Desc() { regOBD("DEFAULT_TYPE"); return this; }

    protected ConditionValue _systemType;
    public ConditionValue xdfgetSystemType()
    { if (_systemType == null) { _systemType = nCV(); }
      return _systemType; }
    protected ConditionValue xgetCValueSystemType() { return xdfgetSystemType(); }

    /**
     * Add order-by as ascend. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_SystemType_Asc() { regOBA("SYSTEM_TYPE"); return this; }

    /**
     * Add order-by as descend. <br>
     * SYSTEM_TYPE: {VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_SystemType_Desc() { regOBD("SYSTEM_TYPE"); return this; }

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
    public BsMGeneralCQ addOrderBy_DelFlg_Asc() { regOBA("DEL_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_DelFlg_Desc() { regOBD("DEL_FLG"); return this; }

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
    public BsMGeneralCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMGeneralCQ addOrderBy_ControlNo_Asc() { regOBA("CONTROL_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_ControlNo_Desc() { regOBD("CONTROL_NO"); return this; }

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
    public BsMGeneralCQ addOrderBy_AddDt_Asc() { regOBA("ADD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_AddDt_Desc() { regOBD("ADD_DT"); return this; }

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
    public BsMGeneralCQ addOrderBy_AddUser_Asc() { regOBA("ADD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_AddUser_Desc() { regOBD("ADD_USER"); return this; }

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
    public BsMGeneralCQ addOrderBy_AddProcess_Asc() { regOBA("ADD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_AddProcess_Desc() { regOBD("ADD_PROCESS"); return this; }

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
    public BsMGeneralCQ addOrderBy_UpdDt_Asc() { regOBA("UPD_DT"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_DT: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_UpdDt_Desc() { regOBD("UPD_DT"); return this; }

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
    public BsMGeneralCQ addOrderBy_UpdUser_Asc() { regOBA("UPD_USER"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_USER: {VARCHAR(60)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_UpdUser_Desc() { regOBD("UPD_USER"); return this; }

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
    public BsMGeneralCQ addOrderBy_UpdProcess_Asc() { regOBA("UPD_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @return this. (NotNull)
     */
    public BsMGeneralCQ addOrderBy_UpdProcess_Desc() { regOBD("UPD_PROCESS"); return this; }

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
    public BsMGeneralCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMGeneralCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MGeneralCQ bq = (MGeneralCQ)bqs;
        MGeneralCQ uq = (MGeneralCQ)uqs;
        if (bq.hasConditionQueryMCenter()) {
            uq.queryMCenter().reflectRelationOnUnionQuery(bq.queryMCenter(), uq.queryMCenter());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The instance of condition-query. (NotNull)
     */
    public MCenterCQ queryMCenter() {
        return xdfgetConditionQueryMCenter();
    }
    public MCenterCQ xdfgetConditionQueryMCenter() {
        String prop = "mCenter";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMCenter()); xsetupOuterJoinMCenter(); }
        return xgetQueRlMap(prop);
    }
    protected MCenterCQ xcreateQueryMCenter() {
        String nrp = xresolveNRP("m_general", "mCenter"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MCenterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mCenter", nrp);
    }
    protected void xsetupOuterJoinMCenter() { xregOutJo("mCenter"); }
    public boolean hasConditionQueryMCenter() { return xhasQueRlMap("mCenter"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MGeneralCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MGeneralCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MGeneralCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MGeneralCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MGeneralCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MGeneralCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MGeneralCQ> _myselfExistsMap;
    public Map<String, MGeneralCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MGeneralCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MGeneralCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MGeneralCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MGeneralCB.class.getName(); }
    protected String xCQ() { return MGeneralCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
