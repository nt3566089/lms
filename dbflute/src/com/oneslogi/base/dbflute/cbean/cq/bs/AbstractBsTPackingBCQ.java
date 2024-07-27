package com.oneslogi.base.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.oneslogi.base.dbflute.allcommon.*;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of t_packing_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPackingBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPackingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "t_packing_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_Equal(Long packingBId) {
        doSetPackingBId_Equal(packingBId);
    }

    protected void doSetPackingBId_Equal(Long packingBId) {
        regPackingBId(CK_EQ, packingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_NotEqual(Long packingBId) {
        doSetPackingBId_NotEqual(packingBId);
    }

    protected void doSetPackingBId_NotEqual(Long packingBId) {
        regPackingBId(CK_NES, packingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_GreaterThan(Long packingBId) {
        regPackingBId(CK_GT, packingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_LessThan(Long packingBId) {
        regPackingBId(CK_LT, packingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_GreaterEqual(Long packingBId) {
        regPackingBId(CK_GE, packingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBId The value of packingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingBId_LessEqual(Long packingBId) {
        regPackingBId(CK_LE, packingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of packingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingBId(), "PACKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBIdList The collection of packingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBId_InScope(Collection<Long> packingBIdList) {
        doSetPackingBId_InScope(packingBIdList);
    }

    protected void doSetPackingBId_InScope(Collection<Long> packingBIdList) {
        regINS(CK_INS, cTL(packingBIdList), xgetCValuePackingBId(), "PACKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingBIdList The collection of packingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingBId_NotInScope(Collection<Long> packingBIdList) {
        doSetPackingBId_NotInScope(packingBIdList);
    }

    protected void doSetPackingBId_NotInScope(Collection<Long> packingBIdList) {
        regINS(CK_NINS, cTL(packingBIdList), xgetCValuePackingBId(), "PACKING_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPackingBId_IsNull() { regPackingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPackingBId_IsNotNull() { regPackingBId(CK_ISNN, DOBJ); }

    protected void regPackingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingBId(), "PACKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePackingBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_Equal(Long packingHId) {
        doSetPackingHId_Equal(packingHId);
    }

    protected void doSetPackingHId_Equal(Long packingHId) {
        regPackingHId(CK_EQ, packingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_NotEqual(Long packingHId) {
        doSetPackingHId_NotEqual(packingHId);
    }

    protected void doSetPackingHId_NotEqual(Long packingHId) {
        regPackingHId(CK_NES, packingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterThan(Long packingHId) {
        regPackingHId(CK_GT, packingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessThan(Long packingHId) {
        regPackingHId(CK_LT, packingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterEqual(Long packingHId) {
        regPackingHId(CK_GE, packingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHId The value of packingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessEqual(Long packingHId) {
        regPackingHId(CK_LE, packingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param minNumber The min number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingHId(), "PACKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHIdList The collection of packingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_InScope(Collection<Long> packingHIdList) {
        doSetPackingHId_InScope(packingHIdList);
    }

    protected void doSetPackingHId_InScope(Collection<Long> packingHIdList) {
        regINS(CK_INS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_packing_h}
     * @param packingHIdList The collection of packingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_NotInScope(Collection<Long> packingHIdList) {
        doSetPackingHId_NotInScope(packingHIdList);
    }

    protected void doSetPackingHId_NotInScope(Collection<Long> packingHIdList) {
        regINS(CK_NINS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_H_ID from t_packing_h where ...)} <br />
     * t_packing_h by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_InScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", false);
    }
    public abstract String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_H_ID from t_packing_h where ...)} <br />
     * t_packing_h by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_NotInScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", true);
    }
    public abstract String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq);

    protected void regPackingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingHId(), "PACKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePackingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_Equal(Long pickingBId) {
        doSetPickingBId_Equal(pickingBId);
    }

    protected void doSetPickingBId_Equal(Long pickingBId) {
        regPickingBId(CK_EQ, pickingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_NotEqual(Long pickingBId) {
        doSetPickingBId_NotEqual(pickingBId);
    }

    protected void doSetPickingBId_NotEqual(Long pickingBId) {
        regPickingBId(CK_NES, pickingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterThan(Long pickingBId) {
        regPickingBId(CK_GT, pickingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessThan(Long pickingBId) {
        regPickingBId(CK_LT, pickingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterEqual(Long pickingBId) {
        regPickingBId(CK_GE, pickingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBId The value of pickingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessEqual(Long pickingBId) {
        regPickingBId(CK_LE, pickingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param minNumber The min number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingBId(), "PICKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBIdList The collection of pickingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_InScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_InScope(pickingBIdList);
    }

    protected void doSetPickingBId_InScope(Collection<Long> pickingBIdList) {
        regINS(CK_INS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     * @param pickingBIdList The collection of pickingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_NotInScope(pickingBIdList);
    }

    protected void doSetPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        regINS(CK_NINS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_B_ID from t_picking_b where ...)} <br />
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @param subCBLambda The callback for sub-query of TPickingB for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingB(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingBId_InScopeRelation_TPickingB(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingB", false);
    }
    public abstract String keepPickingBId_InScopeRelation_TPickingB(TPickingBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_B_ID from t_picking_b where ...)} <br />
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @param subCBLambda The callback for sub-query of TPickingB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingB(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingBId_NotInScopeRelation_TPickingB(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingB", true);
    }
    public abstract String keepPickingBId_NotInScopeRelation_TPickingB(TPickingBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     */
    public void setPickingBId_IsNull() { regPickingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {IX, BIGINT(19), FK to t_picking_b}
     */
    public void setPickingBId_IsNotNull() { regPickingBId(CK_ISNN, DOBJ); }

    protected void regPickingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBId(), "PICKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePickingBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_Equal(Long allocInstBId) {
        doSetAllocInstBId_Equal(allocInstBId);
    }

    protected void doSetAllocInstBId_Equal(Long allocInstBId) {
        regAllocInstBId(CK_EQ, allocInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotEqual(Long allocInstBId) {
        doSetAllocInstBId_NotEqual(allocInstBId);
    }

    protected void doSetAllocInstBId_NotEqual(Long allocInstBId) {
        regAllocInstBId(CK_NES, allocInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterThan(Long allocInstBId) {
        regAllocInstBId(CK_GT, allocInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessThan(Long allocInstBId) {
        regAllocInstBId(CK_LT, allocInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_GreaterEqual(Long allocInstBId) {
        regAllocInstBId(CK_GE, allocInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBId The value of allocInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstBId_LessEqual(Long allocInstBId) {
        regAllocInstBId(CK_LE, allocInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param minNumber The min number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBIdList The collection of allocInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_InScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_InScope(Collection<Long> allocInstBIdList) {
        regINS(CK_INS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     * @param allocInstBIdList The collection of allocInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        doSetAllocInstBId_NotInScope(allocInstBIdList);
    }

    protected void doSetAllocInstBId_NotInScope(Collection<Long> allocInstBIdList) {
        regINS(CK_NINS, cTL(allocInstBIdList), xgetCValueAllocInstBId(), "ALLOC_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_B_ID from t_alloc_inst_b where ...)} <br />
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_InScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", false);
    }
    public abstract String keepAllocInstBId_InScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_B_ID from t_alloc_inst_b where ...)} <br />
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @param subCBLambda The callback for sub-query of TAllocInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstB(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstBId_NotInScopeRelation_TAllocInstB(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_B_ID", "ALLOC_INST_B_ID", pp, "tAllocInstB", true);
    }
    public abstract String keepAllocInstBId_NotInScopeRelation_TAllocInstB(TAllocInstBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     */
    public void setAllocInstBId_IsNull() { regAllocInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_B_ID: {IX, BIGINT(19), FK to t_alloc_inst_b}
     */
    public void setAllocInstBId_IsNotNull() { regAllocInstBId(CK_ISNN, DOBJ); }

    protected void regAllocInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstBId(), "ALLOC_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_Equal(java.math.BigDecimal packingNum) {
        doSetPackingNum_Equal(packingNum);
    }

    protected void doSetPackingNum_Equal(java.math.BigDecimal packingNum) {
        regPackingNum(CK_EQ, packingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_NotEqual(java.math.BigDecimal packingNum) {
        doSetPackingNum_NotEqual(packingNum);
    }

    protected void doSetPackingNum_NotEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_NES, packingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterThan(java.math.BigDecimal packingNum) {
        regPackingNum(CK_GT, packingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessThan(java.math.BigDecimal packingNum) {
        regPackingNum(CK_LT, packingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_GE, packingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNum The value of packingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessEqual(java.math.BigDecimal packingNum) {
        regPackingNum(CK_LE, packingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingNum(), "PACKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNumList The collection of packingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_InScope(Collection<java.math.BigDecimal> packingNumList) {
        doSetPackingNum_InScope(packingNumList);
    }

    protected void doSetPackingNum_InScope(Collection<java.math.BigDecimal> packingNumList) {
        regINS(CK_INS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param packingNumList The collection of packingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_NotInScope(Collection<java.math.BigDecimal> packingNumList) {
        doSetPackingNum_NotInScope(packingNumList);
    }

    protected void doSetPackingNum_NotInScope(Collection<java.math.BigDecimal> packingNumList) {
        regINS(CK_NINS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    protected void regPackingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingNum(), "PACKING_NUM"); }
    protected abstract ConditionValue xgetCValuePackingNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @param pickingFlg The value of pickingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_Equal(String pickingFlg) {
        doSetPickingFlg_Equal(fRES(pickingFlg));
    }

    /**
     * Equal(=). As PickingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingFlg_Equal_AsPickingFlg(CDef.PickingFlg cdef) {
        doSetPickingFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出庫
     */
    public void setPickingFlg_Equal_$0() {
        setPickingFlg_Equal_AsPickingFlg(CDef.PickingFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫済
     */
    public void setPickingFlg_Equal_$1() {
        setPickingFlg_Equal_AsPickingFlg(CDef.PickingFlg.$1);
    }

    /**
     * Equal(=). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 出庫作業中
     */
    public void setPickingFlg_Equal_$7() {
        setPickingFlg_Equal_AsPickingFlg(CDef.PickingFlg.$7);
    }

    protected void doSetPickingFlg_Equal(String pickingFlg) {
        regPickingFlg(CK_EQ, pickingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @param pickingFlg The value of pickingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_NotEqual(String pickingFlg) {
        doSetPickingFlg_NotEqual(fRES(pickingFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PickingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingFlg_NotEqual_AsPickingFlg(CDef.PickingFlg cdef) {
        doSetPickingFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出庫
     */
    public void setPickingFlg_NotEqual_$0() {
        setPickingFlg_NotEqual_AsPickingFlg(CDef.PickingFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫済
     */
    public void setPickingFlg_NotEqual_$1() {
        setPickingFlg_NotEqual_AsPickingFlg(CDef.PickingFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 出庫作業中
     */
    public void setPickingFlg_NotEqual_$7() {
        setPickingFlg_NotEqual_AsPickingFlg(CDef.PickingFlg.$7);
    }

    protected void doSetPickingFlg_NotEqual(String pickingFlg) {
        regPickingFlg(CK_NES, pickingFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @param pickingFlgList The collection of pickingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_InScope(Collection<String> pickingFlgList) {
        doSetPickingFlg_InScope(pickingFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PickingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_InScope_AsPickingFlg(Collection<CDef.PickingFlg> cdefList) {
        doSetPickingFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPickingFlg_InScope(Collection<String> pickingFlgList) {
        regINS(CK_INS, cTL(pickingFlgList), xgetCValuePickingFlg(), "PICKING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     * @param pickingFlgList The collection of pickingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_NotInScope(Collection<String> pickingFlgList) {
        doSetPickingFlg_NotInScope(pickingFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PickingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg} <br>
     * 出庫フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingFlg_NotInScope_AsPickingFlg(Collection<CDef.PickingFlg> cdefList) {
        doSetPickingFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPickingFlg_NotInScope(Collection<String> pickingFlgList) {
        regINS(CK_NINS, cTL(pickingFlgList), xgetCValuePickingFlg(), "PICKING_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     */
    public void setPickingFlg_IsNull() { regPickingFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     */
    public void setPickingFlg_IsNullOrEmpty() { regPickingFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=PickingFlg}
     */
    public void setPickingFlg_IsNotNull() { regPickingFlg(CK_ISNN, DOBJ); }

    protected void regPickingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingFlg(), "PICKING_FLG"); }
    protected abstract ConditionValue xgetCValuePickingFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlg The value of inspectionFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_Equal(String inspectionFlg) {
        doSetInspectionFlg_Equal(fRES(inspectionFlg));
    }

    /**
     * Equal(=). As InspectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg cdef) {
        doSetInspectionFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setInspectionFlg_Equal_$0() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setInspectionFlg_Equal_$1() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$1);
    }

    /**
     * Equal(=). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 検品作業中
     */
    public void setInspectionFlg_Equal_$7() {
        setInspectionFlg_Equal_AsInspectionFlg(CDef.InspectionFlg.$7);
    }

    protected void doSetInspectionFlg_Equal(String inspectionFlg) {
        regInspectionFlg(CK_EQ, inspectionFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlg The value of inspectionFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotEqual(String inspectionFlg) {
        doSetInspectionFlg_NotEqual(fRES(inspectionFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InspectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg cdef) {
        doSetInspectionFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setInspectionFlg_NotEqual_$0() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setInspectionFlg_NotEqual_$1() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 検品作業中
     */
    public void setInspectionFlg_NotEqual_$7() {
        setInspectionFlg_NotEqual_AsInspectionFlg(CDef.InspectionFlg.$7);
    }

    protected void doSetInspectionFlg_NotEqual(String inspectionFlg) {
        regInspectionFlg(CK_NES, inspectionFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlgList The collection of inspectionFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_InScope(Collection<String> inspectionFlgList) {
        doSetInspectionFlg_InScope(inspectionFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InspectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_InScope_AsInspectionFlg(Collection<CDef.InspectionFlg> cdefList) {
        doSetInspectionFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInspectionFlg_InScope(Collection<String> inspectionFlgList) {
        regINS(CK_INS, cTL(inspectionFlgList), xgetCValueInspectionFlg(), "INSPECTION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     * @param inspectionFlgList The collection of inspectionFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotInScope(Collection<String> inspectionFlgList) {
        doSetInspectionFlg_NotInScope(inspectionFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InspectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg} <br>
     * 検品フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectionFlg_NotInScope_AsInspectionFlg(Collection<CDef.InspectionFlg> cdefList) {
        doSetInspectionFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInspectionFlg_NotInScope(Collection<String> inspectionFlgList) {
        regINS(CK_NINS, cTL(inspectionFlgList), xgetCValueInspectionFlg(), "INSPECTION_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     */
    public void setInspectionFlg_IsNull() { regInspectionFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     */
    public void setInspectionFlg_IsNullOrEmpty() { regInspectionFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTION_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=InspectionFlg}
     */
    public void setInspectionFlg_IsNotNull() { regInspectionFlg(CK_ISNN, DOBJ); }

    protected void regInspectionFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectionFlg(), "INSPECTION_FLG"); }
    protected abstract ConditionValue xgetCValueInspectionFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_Equal(String casePickingNo) {
        doSetCasePickingNo_Equal(fRES(casePickingNo));
    }

    protected void doSetCasePickingNo_Equal(String casePickingNo) {
        regCasePickingNo(CK_EQ, casePickingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_NotEqual(String casePickingNo) {
        doSetCasePickingNo_NotEqual(fRES(casePickingNo));
    }

    protected void doSetCasePickingNo_NotEqual(String casePickingNo) {
        regCasePickingNo(CK_NES, casePickingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_GreaterThan(String casePickingNo) {
        regCasePickingNo(CK_GT, fRES(casePickingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_LessThan(String casePickingNo) {
        regCasePickingNo(CK_LT, fRES(casePickingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_GreaterEqual(String casePickingNo) {
        regCasePickingNo(CK_GE, fRES(casePickingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_LessEqual(String casePickingNo) {
        regCasePickingNo(CK_LE, fRES(casePickingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNoList The collection of casePickingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_InScope(Collection<String> casePickingNoList) {
        doSetCasePickingNo_InScope(casePickingNoList);
    }

    protected void doSetCasePickingNo_InScope(Collection<String> casePickingNoList) {
        regINS(CK_INS, cTL(casePickingNoList), xgetCValueCasePickingNo(), "CASE_PICKING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNoList The collection of casePickingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_NotInScope(Collection<String> casePickingNoList) {
        doSetCasePickingNo_NotInScope(casePickingNoList);
    }

    protected void doSetCasePickingNo_NotInScope(Collection<String> casePickingNoList) {
        regINS(CK_NINS, cTL(casePickingNoList), xgetCValueCasePickingNo(), "CASE_PICKING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setCasePickingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casePickingNo The value of casePickingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasePickingNo_LikeSearch(String casePickingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casePickingNo), xgetCValueCasePickingNo(), "CASE_PICKING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasePickingNo_NotLikeSearch(String casePickingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casePickingNo), xgetCValueCasePickingNo(), "CASE_PICKING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     * @param casePickingNo The value of casePickingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasePickingNo_PrefixSearch(String casePickingNo) {
        setCasePickingNo_LikeSearch(casePickingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     */
    public void setCasePickingNo_IsNull() { regCasePickingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     */
    public void setCasePickingNo_IsNullOrEmpty() { regCasePickingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_PICKING_NO: {VARCHAR(30)}
     */
    public void setCasePickingNo_IsNotNull() { regCasePickingNo(CK_ISNN, DOBJ); }

    protected void regCasePickingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasePickingNo(), "CASE_PICKING_NO"); }
    protected abstract ConditionValue xgetCValueCasePickingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_Equal(String shippingPackingRowNo) {
        doSetShippingPackingRowNo_Equal(fRES(shippingPackingRowNo));
    }

    protected void doSetShippingPackingRowNo_Equal(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_EQ, shippingPackingRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_NotEqual(String shippingPackingRowNo) {
        doSetShippingPackingRowNo_NotEqual(fRES(shippingPackingRowNo));
    }

    protected void doSetShippingPackingRowNo_NotEqual(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_NES, shippingPackingRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_GreaterThan(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_GT, fRES(shippingPackingRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_LessThan(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_LT, fRES(shippingPackingRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_GreaterEqual(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_GE, fRES(shippingPackingRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_LessEqual(String shippingPackingRowNo) {
        regShippingPackingRowNo(CK_LE, fRES(shippingPackingRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNoList The collection of shippingPackingRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_InScope(Collection<String> shippingPackingRowNoList) {
        doSetShippingPackingRowNo_InScope(shippingPackingRowNoList);
    }

    protected void doSetShippingPackingRowNo_InScope(Collection<String> shippingPackingRowNoList) {
        regINS(CK_INS, cTL(shippingPackingRowNoList), xgetCValueShippingPackingRowNo(), "SHIPPING_PACKING_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNoList The collection of shippingPackingRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_NotInScope(Collection<String> shippingPackingRowNoList) {
        doSetShippingPackingRowNo_NotInScope(shippingPackingRowNoList);
    }

    protected void doSetShippingPackingRowNo_NotInScope(Collection<String> shippingPackingRowNoList) {
        regINS(CK_NINS, cTL(shippingPackingRowNoList), xgetCValueShippingPackingRowNo(), "SHIPPING_PACKING_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingPackingRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingPackingRowNo The value of shippingPackingRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingPackingRowNo_LikeSearch(String shippingPackingRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingPackingRowNo), xgetCValueShippingPackingRowNo(), "SHIPPING_PACKING_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingPackingRowNo_NotLikeSearch(String shippingPackingRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingPackingRowNo), xgetCValueShippingPackingRowNo(), "SHIPPING_PACKING_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     * @param shippingPackingRowNo The value of shippingPackingRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingRowNo_PrefixSearch(String shippingPackingRowNo) {
        setShippingPackingRowNo_LikeSearch(shippingPackingRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingPackingRowNo_IsNull() { regShippingPackingRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingPackingRowNo_IsNullOrEmpty() { regShippingPackingRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingPackingRowNo_IsNotNull() { regShippingPackingRowNo(CK_ISNN, DOBJ); }

    protected void regShippingPackingRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPackingRowNo(), "SHIPPING_PACKING_ROW_NO"); }
    protected abstract ConditionValue xgetCValueShippingPackingRowNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_Equal(Long oldPackingBId) {
        doSetOldPackingBId_Equal(oldPackingBId);
    }

    protected void doSetOldPackingBId_Equal(Long oldPackingBId) {
        regOldPackingBId(CK_EQ, oldPackingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_NotEqual(Long oldPackingBId) {
        doSetOldPackingBId_NotEqual(oldPackingBId);
    }

    protected void doSetOldPackingBId_NotEqual(Long oldPackingBId) {
        regOldPackingBId(CK_NES, oldPackingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_GreaterThan(Long oldPackingBId) {
        regOldPackingBId(CK_GT, oldPackingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_LessThan(Long oldPackingBId) {
        regOldPackingBId(CK_LT, oldPackingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_GreaterEqual(Long oldPackingBId) {
        regOldPackingBId(CK_GE, oldPackingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBId The value of oldPackingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPackingBId_LessEqual(Long oldPackingBId) {
        regOldPackingBId(CK_LE, oldPackingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param minNumber The min number of oldPackingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oldPackingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOldPackingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOldPackingBId(), "OLD_PACKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBIdList The collection of oldPackingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldPackingBId_InScope(Collection<Long> oldPackingBIdList) {
        doSetOldPackingBId_InScope(oldPackingBIdList);
    }

    protected void doSetOldPackingBId_InScope(Collection<Long> oldPackingBIdList) {
        regINS(CK_INS, cTL(oldPackingBIdList), xgetCValueOldPackingBId(), "OLD_PACKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     * @param oldPackingBIdList The collection of oldPackingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldPackingBId_NotInScope(Collection<Long> oldPackingBIdList) {
        doSetOldPackingBId_NotInScope(oldPackingBIdList);
    }

    protected void doSetOldPackingBId_NotInScope(Collection<Long> oldPackingBIdList) {
        regINS(CK_NINS, cTL(oldPackingBIdList), xgetCValueOldPackingBId(), "OLD_PACKING_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     */
    public void setOldPackingBId_IsNull() { regOldPackingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OLD_PACKING_B_ID: {BIGINT(19)}
     */
    public void setOldPackingBId_IsNotNull() { regOldPackingBId(CK_ISNN, DOBJ); }

    protected void regOldPackingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOldPackingBId(), "OLD_PACKING_B_ID"); }
    protected abstract ConditionValue xgetCValueOldPackingBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_Equal(String receiveLabelNo) {
        doSetReceiveLabelNo_Equal(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_Equal(String receiveLabelNo) {
        regReceiveLabelNo(CK_EQ, receiveLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotEqual(String receiveLabelNo) {
        doSetReceiveLabelNo_NotEqual(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_NotEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_NES, receiveLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_GT, fRES(receiveLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_LT, fRES(receiveLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_GE, fRES(receiveLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_LE, fRES(receiveLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNoList The collection of receiveLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_InScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        regINS(CK_INS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNoList The collection of receiveLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_NotInScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        regINS(CK_NINS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveLabelNo The value of receiveLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveLabelNo_LikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveLabelNo_NotLikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     * @param receiveLabelNo The value of receiveLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_PrefixSearch(String receiveLabelNo) {
        setReceiveLabelNo_LikeSearch(receiveLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNull() { regReceiveLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNullOrEmpty() { regReceiveLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {VARCHAR(30)}
     */
    public void setReceiveLabelNo_IsNotNull() { regReceiveLabelNo(CK_ISNN, DOBJ); }

    protected void regReceiveLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueReceiveLabelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal_AsDelFlg(CDef.DelFlg cdef) {
        doSetDelFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未削除
     */
    public void setDelFlg_Equal_$0() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 削除済
     */
    public void setDelFlg_Equal_$1() {
        setDelFlg_Equal_AsDelFlg(CDef.DelFlg.$1);
    }

    protected void doSetDelFlg_Equal(String delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_Equal(Long controlNo) {
        doSetControlNo_Equal(controlNo);
    }

    protected void doSetControlNo_Equal(Long controlNo) {
        regControlNo(CK_EQ, controlNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param controlNo The value of controlNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setControlNo_NotEqual(Long controlNo) {
        doSetControlNo_NotEqual(controlNo);
    }

    protected void doSetControlNo_NotEqual(Long controlNo) {
        regControlNo(CK_NES, controlNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     * @param minNumber The min number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of controlNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setControlNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueControlNo(), "CONTROL_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNull() { regControlNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTROL_NO: {IX, BIGINT(19)}
     */
    public void setControlNo_IsNotNull() { regControlNo(CK_ISNN, DOBJ); }

    protected void regControlNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueControlNo(), "CONTROL_NO"); }
    protected abstract ConditionValue xgetCValueControlNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_Equal(java.sql.Timestamp addDt) {
        regAddDt(CK_EQ,  addDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     * @param addDt The value of addDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAddDt_LessEqual(java.sql.Timestamp addDt) {
        regAddDt(CK_LE, addDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNull() { regAddDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_DT: {DATETIME(19)}
     */
    public void setAddDt_IsNotNull() { regAddDt(CK_ISNN, DOBJ); }

    protected void regAddDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddDt(), "ADD_DT"); }
    protected abstract ConditionValue xgetCValueAddDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     * @param addUser The value of addUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddUser_Equal(String addUser) {
        doSetAddUser_Equal(fRES(addUser));
    }

    protected void doSetAddUser_Equal(String addUser) {
        regAddUser(CK_EQ, addUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNull() { regAddUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNullOrEmpty() { regAddUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_USER: {VARCHAR(60)}
     */
    public void setAddUser_IsNotNull() { regAddUser(CK_ISNN, DOBJ); }

    protected void regAddUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddUser(), "ADD_USER"); }
    protected abstract ConditionValue xgetCValueAddUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     * @param addProcess The value of addProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddProcess_Equal(String addProcess) {
        doSetAddProcess_Equal(fRES(addProcess));
    }

    protected void doSetAddProcess_Equal(String addProcess) {
        regAddProcess(CK_EQ, addProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNull() { regAddProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNullOrEmpty() { regAddProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADD_PROCESS: {VARCHAR(255)}
     */
    public void setAddProcess_IsNotNull() { regAddProcess(CK_ISNN, DOBJ); }

    protected void regAddProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddProcess(), "ADD_PROCESS"); }
    protected abstract ConditionValue xgetCValueAddProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_Equal(java.sql.Timestamp updDt) {
        regUpdDt(CK_EQ,  updDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     * @param updDt The value of updDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdDt_LessEqual(java.sql.Timestamp updDt) {
        regUpdDt(CK_LE, updDt);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNull() { regUpdDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_DT: {DATETIME(19)}
     */
    public void setUpdDt_IsNotNull() { regUpdDt(CK_ISNN, DOBJ); }

    protected void regUpdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdDt(), "UPD_DT"); }
    protected abstract ConditionValue xgetCValueUpdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {VARCHAR(60)}
     */
    public void setUpdUser_IsNotNull() { regUpdUser(CK_ISNN, DOBJ); }

    protected void regUpdUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUser(), "UPD_USER"); }
    protected abstract ConditionValue xgetCValueUpdUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     * @param updProcess The value of updProcess as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdProcess_Equal(String updProcess) {
        doSetUpdProcess_Equal(fRES(updProcess));
    }

    protected void doSetUpdProcess_Equal(String updProcess) {
        regUpdProcess(CK_EQ, updProcess);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNull() { regUpdProcess(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNullOrEmpty() { regUpdProcess(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_PROCESS: {VARCHAR(255)}
     */
    public void setUpdProcess_IsNotNull() { regUpdProcess(CK_ISNN, DOBJ); }

    protected void regUpdProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdProcess(), "UPD_PROCESS"); }
    protected abstract ConditionValue xgetCValueUpdProcess();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPackingBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPackingBCB&gt;() {
     *     public void query(TPackingBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPackingBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPackingBCQ sq);

    protected TPackingBCB xcreateScalarConditionCB() {
        TPackingBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPackingBCB xcreateScalarConditionPartitionByCB() {
        TPackingBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPackingBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPackingBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPackingBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPackingBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPackingBCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * ManualOrderOption mop = new ManualOrderOption();
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     * mop.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(mop)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param option The option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOption option) { // is user public!
        xdoWithManualOrder(option);
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    /**
     * Order along the list of manual values. #beforejava8 <br>
     * This function with Union is unsupported! <br>
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderOption option = new ManualOrderOption();
        option.acceptOrderValueList(orderValueList);
        withManualOrder(option);
    }

    @Override
    protected void filterFromToOption(String columnDbName, FromToOption option) {
        option.allowOneSide();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TPackingBCB newMyCB() {
        return new TPackingBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPackingBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
