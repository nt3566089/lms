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
 * The abstract condition-query of t_picking_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_picking_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingBId The value of pickingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterThan(Long pickingBId) {
        regPickingBId(CK_GT, pickingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingBId The value of pickingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessThan(Long pickingBId) {
        regPickingBId(CK_LT, pickingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingBId The value of pickingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_GreaterEqual(Long pickingBId) {
        regPickingBId(CK_GE, pickingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingBId The value of pickingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingBId_LessEqual(Long pickingBId) {
        regPickingBId(CK_LE, pickingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingBId(), "PICKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param pickingBIdList The collection of pickingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        doSetPickingBId_NotInScope(pickingBIdList);
    }

    protected void doSetPickingBId_NotInScope(Collection<Long> pickingBIdList) {
        regINS(CK_NINS, cTL(pickingBIdList), xgetCValuePickingBId(), "PICKING_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_B_ID from t_packing_b where ...)} <br>
     * t_packing_b by PICKING_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingBList for 'exists'. (NotNull)
     */
    public void existsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingBId_ExistsReferrer_TPackingBList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPackingBList");
    }
    public abstract String keepPickingBId_ExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PICKING_B_ID from t_picking_record_stock where ...)} <br>
     * t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingRecordStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingRecordStockList for 'exists'. (NotNull)
     */
    public void existsTPickingRecordStockList(SubQuery<TPickingRecordStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingBId_ExistsReferrer_TPickingRecordStockList(cb.query());
        registerExistsReferrer(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingRecordStockList");
    }
    public abstract String keepPickingBId_ExistsReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_B_ID from t_packing_b where ...)} <br>
     * t_packing_b by PICKING_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingBId_NotExistsReferrer_TPackingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingBId_NotExistsReferrer_TPackingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPackingBList");
    }
    public abstract String keepPickingBId_NotExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PICKING_B_ID from t_picking_record_stock where ...)} <br>
     * t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingRecordStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PickingBId_NotExistsReferrer_TPickingRecordStockList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingRecordStockList(SubQuery<TPickingRecordStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPickingBId_NotExistsReferrer_TPickingRecordStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingRecordStockList");
    }
    public abstract String keepPickingBId_NotExistsReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq);

    public void xsderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingBId_SpecifyDerivedReferrer_TPackingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPackingBList", al, op);
    }
    public abstract String keepPickingBId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq);

    public void xsderiveTPickingRecordStockList(String fn, SubQuery<TPickingRecordStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPickingBId_SpecifyDerivedReferrer_TPickingRecordStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PICKING_B_ID", "PICKING_B_ID", pp, "tPickingRecordStockList", al, op);
    }
    public abstract String keepPickingBId_SpecifyDerivedReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_b where ...)} <br>
     * t_packing_b by PICKING_B_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingBCB> derivedTPackingBList() {
        return xcreateQDRFunctionTPackingBList();
    }
    protected HpQDRFunction<TPackingBCB> xcreateQDRFunctionTPackingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingBId_QueryDerivedReferrer_TPackingBList(cb.query()); String prpp = keepPickingBId_QueryDerivedReferrer_TPackingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_B_ID", "PICKING_B_ID", sqpp, "tPackingBList", rd, vl, prpp, op);
    }
    public abstract String keepPickingBId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq);
    public abstract String keepPickingBId_QueryDerivedReferrer_TPackingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_record_stock where ...)} <br>
     * t_picking_record_stock by PICKING_B_ID, named 'TPickingRecordStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingRecordStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingRecordStockCB> derivedTPickingRecordStockList() {
        return xcreateQDRFunctionTPickingRecordStockList();
    }
    protected HpQDRFunction<TPickingRecordStockCB> xcreateQDRFunctionTPickingRecordStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingRecordStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingRecordStockList(String fn, SubQuery<TPickingRecordStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRecordStockCB cb = new TPickingRecordStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPickingBId_QueryDerivedReferrer_TPickingRecordStockList(cb.query()); String prpp = keepPickingBId_QueryDerivedReferrer_TPickingRecordStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PICKING_B_ID", "PICKING_B_ID", sqpp, "tPickingRecordStockList", rd, vl, prpp, op);
    }
    public abstract String keepPickingBId_QueryDerivedReferrer_TPickingRecordStockList(TPickingRecordStockCQ sq);
    public abstract String keepPickingBId_QueryDerivedReferrer_TPickingRecordStockListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingBId_IsNull() { regPickingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPickingBId_IsNotNull() { regPickingBId(CK_ISNN, DOBJ); }

    protected void regPickingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBId(), "PICKING_B_ID"); }
    protected abstract ConditionValue xgetCValuePickingBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_Equal(Long pickingHId) {
        doSetPickingHId_Equal(pickingHId);
    }

    protected void doSetPickingHId_Equal(Long pickingHId) {
        regPickingHId(CK_EQ, pickingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_NotEqual(Long pickingHId) {
        doSetPickingHId_NotEqual(pickingHId);
    }

    protected void doSetPickingHId_NotEqual(Long pickingHId) {
        regPickingHId(CK_NES, pickingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHIdList The collection of pickingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_InScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_InScope(pickingHIdList);
    }

    protected void doSetPickingHId_InScope(Collection<Long> pickingHIdList) {
        regINS(CK_INS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, NotNull, BIGINT(19), FK to t_picking_h}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_H_ID from t_picking_h where ...)} <br />
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_InScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", false);
    }
    public abstract String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_H_ID from t_picking_h where ...)} <br />
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_NotInScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", true);
    }
    public abstract String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq);

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_Equal(Long shippingInstBId) {
        doSetShippingInstBId_Equal(shippingInstBId);
    }

    protected void doSetShippingInstBId_Equal(Long shippingInstBId) {
        regShippingInstBId(CK_EQ, shippingInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotEqual(Long shippingInstBId) {
        doSetShippingInstBId_NotEqual(shippingInstBId);
    }

    protected void doSetShippingInstBId_NotEqual(Long shippingInstBId) {
        regShippingInstBId(CK_NES, shippingInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBIdList The collection of shippingInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_InScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_INS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     * @param shippingInstBIdList The collection of shippingInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_NotInScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_NINS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_B_ID from t_shipping_inst_b where ...)} <br />
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param subCBLambda The callback for sub-query of TShippingInstB for 'in-scope'. (NotNull)
     */
    public void inScopeTShippingInstB(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_InScopeRelation_TShippingInstB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstB", false);
    }
    public abstract String keepShippingInstBId_InScopeRelation_TShippingInstB(TShippingInstBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_B_ID from t_shipping_inst_b where ...)} <br />
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @param subCBLambda The callback for sub-query of TShippingInstB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTShippingInstB(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_NotInScopeRelation_TShippingInstB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "tShippingInstB", true);
    }
    public abstract String keepShippingInstBId_NotInScopeRelation_TShippingInstB(TShippingInstBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     */
    public void setShippingInstBId_IsNull() { regShippingInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {IX, BIGINT(19), FK to t_shipping_inst_b}
     */
    public void setShippingInstBId_IsNotNull() { regShippingInstBId(CK_ISNN, DOBJ); }

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

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
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     */
    public void setStockId_IsNull() { regStockId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, BIGINT(19), FK to t_stock}
     */
    public void setStockId_IsNotNull() { regStockId(CK_ISNN, DOBJ); }

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_Equal(java.math.BigDecimal pickingNum) {
        doSetPickingNum_Equal(pickingNum);
    }

    protected void doSetPickingNum_Equal(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_EQ, pickingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_NotEqual(java.math.BigDecimal pickingNum) {
        doSetPickingNum_NotEqual(pickingNum);
    }

    protected void doSetPickingNum_NotEqual(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_NES, pickingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_GreaterThan(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_GT, pickingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_LessThan(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_LT, pickingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_GreaterEqual(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_GE, pickingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNum The value of pickingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingNum_LessEqual(java.math.BigDecimal pickingNum) {
        regPickingNum(CK_LE, pickingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of pickingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingNum(), "PICKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNumList The collection of pickingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNum_InScope(Collection<java.math.BigDecimal> pickingNumList) {
        doSetPickingNum_InScope(pickingNumList);
    }

    protected void doSetPickingNum_InScope(Collection<java.math.BigDecimal> pickingNumList) {
        regINS(CK_INS, cTL(pickingNumList), xgetCValuePickingNum(), "PICKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param pickingNumList The collection of pickingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingNum_NotInScope(Collection<java.math.BigDecimal> pickingNumList) {
        doSetPickingNum_NotInScope(pickingNumList);
    }

    protected void doSetPickingNum_NotInScope(Collection<java.math.BigDecimal> pickingNumList) {
        regINS(CK_NINS, cTL(pickingNumList), xgetCValuePickingNum(), "PICKING_NUM");
    }

    protected void regPickingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingNum(), "PICKING_NUM"); }
    protected abstract ConditionValue xgetCValuePickingNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_Equal(String tempNo) {
        doSetTempNo_Equal(fRES(tempNo));
    }

    protected void doSetTempNo_Equal(String tempNo) {
        regTempNo(CK_EQ, tempNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_NotEqual(String tempNo) {
        doSetTempNo_NotEqual(fRES(tempNo));
    }

    protected void doSetTempNo_NotEqual(String tempNo) {
        regTempNo(CK_NES, tempNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_GreaterThan(String tempNo) {
        regTempNo(CK_GT, fRES(tempNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_LessThan(String tempNo) {
        regTempNo(CK_LT, fRES(tempNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_GreaterEqual(String tempNo) {
        regTempNo(CK_GE, fRES(tempNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_LessEqual(String tempNo) {
        regTempNo(CK_LE, fRES(tempNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNoList The collection of tempNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_InScope(Collection<String> tempNoList) {
        doSetTempNo_InScope(tempNoList);
    }

    protected void doSetTempNo_InScope(Collection<String> tempNoList) {
        regINS(CK_INS, cTL(tempNoList), xgetCValueTempNo(), "TEMP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNoList The collection of tempNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_NotInScope(Collection<String> tempNoList) {
        doSetTempNo_NotInScope(tempNoList);
    }

    protected void doSetTempNo_NotInScope(Collection<String> tempNoList) {
        regINS(CK_NINS, cTL(tempNoList), xgetCValueTempNo(), "TEMP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTempNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tempNo The value of tempNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTempNo_LikeSearch(String tempNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tempNo), xgetCValueTempNo(), "TEMP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTempNo_NotLikeSearch(String tempNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tempNo), xgetCValueTempNo(), "TEMP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     * @param tempNo The value of tempNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTempNo_PrefixSearch(String tempNo) {
        setTempNo_LikeSearch(tempNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     */
    public void setTempNo_IsNull() { regTempNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     */
    public void setTempNo_IsNullOrEmpty() { regTempNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEMP_NO: {VARCHAR(30)}
     */
    public void setTempNo_IsNotNull() { regTempNo(CK_ISNN, DOBJ); }

    protected void regTempNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTempNo(), "TEMP_NO"); }
    protected abstract ConditionValue xgetCValueTempNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_Equal(java.math.BigDecimal transitNum) {
        doSetTransitNum_Equal(transitNum);
    }

    protected void doSetTransitNum_Equal(java.math.BigDecimal transitNum) {
        regTransitNum(CK_EQ, transitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        doSetTransitNum_NotEqual(transitNum);
    }

    protected void doSetTransitNum_NotEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_NES, transitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GT, transitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessThan(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LT, transitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_GreaterEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_GE, transitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNum The value of transitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransitNum_LessEqual(java.math.BigDecimal transitNum) {
        regTransitNum(CK_LE, transitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransitNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransitNum(), "TRANSIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNumList The collection of transitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_InScope(transitNumList);
    }

    protected void doSetTransitNum_InScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_INS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param transitNumList The collection of transitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        doSetTransitNum_NotInScope(transitNumList);
    }

    protected void doSetTransitNum_NotInScope(Collection<java.math.BigDecimal> transitNumList) {
        regINS(CK_NINS, cTL(transitNumList), xgetCValueTransitNum(), "TRANSIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setTransitNum_IsNull() { regTransitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSIT_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setTransitNum_IsNotNull() { regTransitNum(CK_ISNN, DOBJ); }

    protected void regTransitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransitNum(), "TRANSIT_NUM"); }
    protected abstract ConditionValue xgetCValueTransitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_Equal(Long shapeId) {
        doSetShapeId_Equal(shapeId);
    }

    protected void doSetShapeId_Equal(Long shapeId) {
        regShapeId(CK_EQ, shapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_NotEqual(Long shapeId) {
        doSetShapeId_NotEqual(shapeId);
    }

    protected void doSetShapeId_NotEqual(Long shapeId) {
        regShapeId(CK_NES, shapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterThan(Long shapeId) {
        regShapeId(CK_GT, shapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessThan(Long shapeId) {
        regShapeId(CK_LT, shapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_GreaterEqual(Long shapeId) {
        regShapeId(CK_GE, shapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeId The value of shapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShapeId_LessEqual(Long shapeId) {
        regShapeId(CK_LE, shapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param minNumber The min number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShapeId(), "SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeIdList The collection of shapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_InScope(Collection<Long> shapeIdList) {
        doSetShapeId_InScope(shapeIdList);
    }

    protected void doSetShapeId_InScope(Collection<Long> shapeIdList) {
        regINS(CK_INS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param shapeIdList The collection of shapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShapeId_NotInScope(Collection<Long> shapeIdList) {
        doSetShapeId_NotInScope(shapeIdList);
    }

    protected void doSetShapeId_NotInScope(Collection<Long> shapeIdList) {
        regINS(CK_NINS, cTL(shapeIdList), xgetCValueShapeId(), "SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'in-scope'. (NotNull)
     */
    public void inScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_InScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", false);
    }
    public abstract String keepShapeId_InScopeRelation_MShape(MShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShapeId_NotInScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "SHAPE_ID", "SHAPE_ID", pp, "mShape", true);
    }
    public abstract String keepShapeId_NotInScopeRelation_MShape(MShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setShapeId_IsNull() { regShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setShapeId_IsNotNull() { regShapeId(CK_ISNN, DOBJ); }

    protected void regShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShapeId(), "SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueShapeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_Equal(Long pickedNum) {
        doSetPickedNum_Equal(pickedNum);
    }

    protected void doSetPickedNum_Equal(Long pickedNum) {
        regPickedNum(CK_EQ, pickedNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_NotEqual(Long pickedNum) {
        doSetPickedNum_NotEqual(pickedNum);
    }

    protected void doSetPickedNum_NotEqual(Long pickedNum) {
        regPickedNum(CK_NES, pickedNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_GreaterThan(Long pickedNum) {
        regPickedNum(CK_GT, pickedNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_LessThan(Long pickedNum) {
        regPickedNum(CK_LT, pickedNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_GreaterEqual(Long pickedNum) {
        regPickedNum(CK_GE, pickedNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNum The value of pickedNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedNum_LessEqual(Long pickedNum) {
        regPickedNum(CK_LE, pickedNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param minNumber The min number of pickedNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedNum(), "PICKED_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNumList The collection of pickedNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedNum_InScope(Collection<Long> pickedNumList) {
        doSetPickedNum_InScope(pickedNumList);
    }

    protected void doSetPickedNum_InScope(Collection<Long> pickedNumList) {
        regINS(CK_INS, cTL(pickedNumList), xgetCValuePickedNum(), "PICKED_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     * @param pickedNumList The collection of pickedNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedNum_NotInScope(Collection<Long> pickedNumList) {
        doSetPickedNum_NotInScope(pickedNumList);
    }

    protected void doSetPickedNum_NotInScope(Collection<Long> pickedNumList) {
        regINS(CK_NINS, cTL(pickedNumList), xgetCValuePickedNum(), "PICKED_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     */
    public void setPickedNum_IsNull() { regPickedNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKED_NUM: {BIGINT(19)}
     */
    public void setPickedNum_IsNotNull() { regPickedNum(CK_ISNN, DOBJ); }

    protected void regPickedNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedNum(), "PICKED_NUM"); }
    protected abstract ConditionValue xgetCValuePickedNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_Equal(String pickingPaternCd) {
        doSetPickingPaternCd_Equal(fRES(pickingPaternCd));
    }

    protected void doSetPickingPaternCd_Equal(String pickingPaternCd) {
        regPickingPaternCd(CK_EQ, pickingPaternCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_NotEqual(String pickingPaternCd) {
        doSetPickingPaternCd_NotEqual(fRES(pickingPaternCd));
    }

    protected void doSetPickingPaternCd_NotEqual(String pickingPaternCd) {
        regPickingPaternCd(CK_NES, pickingPaternCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_GreaterThan(String pickingPaternCd) {
        regPickingPaternCd(CK_GT, fRES(pickingPaternCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_LessThan(String pickingPaternCd) {
        regPickingPaternCd(CK_LT, fRES(pickingPaternCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_GreaterEqual(String pickingPaternCd) {
        regPickingPaternCd(CK_GE, fRES(pickingPaternCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_LessEqual(String pickingPaternCd) {
        regPickingPaternCd(CK_LE, fRES(pickingPaternCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCdList The collection of pickingPaternCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_InScope(Collection<String> pickingPaternCdList) {
        doSetPickingPaternCd_InScope(pickingPaternCdList);
    }

    protected void doSetPickingPaternCd_InScope(Collection<String> pickingPaternCdList) {
        regINS(CK_INS, cTL(pickingPaternCdList), xgetCValuePickingPaternCd(), "PICKING_PATERN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCdList The collection of pickingPaternCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_NotInScope(Collection<String> pickingPaternCdList) {
        doSetPickingPaternCd_NotInScope(pickingPaternCdList);
    }

    protected void doSetPickingPaternCd_NotInScope(Collection<String> pickingPaternCdList) {
        regINS(CK_NINS, cTL(pickingPaternCdList), xgetCValuePickingPaternCd(), "PICKING_PATERN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPickingPaternCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingPaternCd The value of pickingPaternCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingPaternCd_LikeSearch(String pickingPaternCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingPaternCd), xgetCValuePickingPaternCd(), "PICKING_PATERN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingPaternCd_NotLikeSearch(String pickingPaternCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingPaternCd), xgetCValuePickingPaternCd(), "PICKING_PATERN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     * @param pickingPaternCd The value of pickingPaternCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingPaternCd_PrefixSearch(String pickingPaternCd) {
        setPickingPaternCd_LikeSearch(pickingPaternCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     */
    public void setPickingPaternCd_IsNull() { regPickingPaternCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     */
    public void setPickingPaternCd_IsNullOrEmpty() { regPickingPaternCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_PATERN_CD: {VARCHAR(30)}
     */
    public void setPickingPaternCd_IsNotNull() { regPickingPaternCd(CK_ISNN, DOBJ); }

    protected void regPickingPaternCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingPaternCd(), "PICKING_PATERN_CD"); }
    protected abstract ConditionValue xgetCValuePickingPaternCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_Equal(String indvLabelNo) {
        doSetIndvLabelNo_Equal(fRES(indvLabelNo));
    }

    protected void doSetIndvLabelNo_Equal(String indvLabelNo) {
        regIndvLabelNo(CK_EQ, indvLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_NotEqual(String indvLabelNo) {
        doSetIndvLabelNo_NotEqual(fRES(indvLabelNo));
    }

    protected void doSetIndvLabelNo_NotEqual(String indvLabelNo) {
        regIndvLabelNo(CK_NES, indvLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_GreaterThan(String indvLabelNo) {
        regIndvLabelNo(CK_GT, fRES(indvLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_LessThan(String indvLabelNo) {
        regIndvLabelNo(CK_LT, fRES(indvLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_GreaterEqual(String indvLabelNo) {
        regIndvLabelNo(CK_GE, fRES(indvLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_LessEqual(String indvLabelNo) {
        regIndvLabelNo(CK_LE, fRES(indvLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNoList The collection of indvLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_InScope(Collection<String> indvLabelNoList) {
        doSetIndvLabelNo_InScope(indvLabelNoList);
    }

    protected void doSetIndvLabelNo_InScope(Collection<String> indvLabelNoList) {
        regINS(CK_INS, cTL(indvLabelNoList), xgetCValueIndvLabelNo(), "INDV_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNoList The collection of indvLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_NotInScope(Collection<String> indvLabelNoList) {
        doSetIndvLabelNo_NotInScope(indvLabelNoList);
    }

    protected void doSetIndvLabelNo_NotInScope(Collection<String> indvLabelNoList) {
        regINS(CK_NINS, cTL(indvLabelNoList), xgetCValueIndvLabelNo(), "INDV_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setIndvLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param indvLabelNo The value of indvLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIndvLabelNo_LikeSearch(String indvLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(indvLabelNo), xgetCValueIndvLabelNo(), "INDV_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIndvLabelNo_NotLikeSearch(String indvLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(indvLabelNo), xgetCValueIndvLabelNo(), "INDV_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     * @param indvLabelNo The value of indvLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIndvLabelNo_PrefixSearch(String indvLabelNo) {
        setIndvLabelNo_LikeSearch(indvLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     */
    public void setIndvLabelNo_IsNull() { regIndvLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     */
    public void setIndvLabelNo_IsNullOrEmpty() { regIndvLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INDV_LABEL_NO: {VARCHAR(30)}
     */
    public void setIndvLabelNo_IsNotNull() { regIndvLabelNo(CK_ISNN, DOBJ); }

    protected void regIndvLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIndvLabelNo(), "INDV_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueIndvLabelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_Equal(Long oldPickingBId) {
        doSetOldPickingBId_Equal(oldPickingBId);
    }

    protected void doSetOldPickingBId_Equal(Long oldPickingBId) {
        regOldPickingBId(CK_EQ, oldPickingBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_NotEqual(Long oldPickingBId) {
        doSetOldPickingBId_NotEqual(oldPickingBId);
    }

    protected void doSetOldPickingBId_NotEqual(Long oldPickingBId) {
        regOldPickingBId(CK_NES, oldPickingBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_GreaterThan(Long oldPickingBId) {
        regOldPickingBId(CK_GT, oldPickingBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_LessThan(Long oldPickingBId) {
        regOldPickingBId(CK_LT, oldPickingBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_GreaterEqual(Long oldPickingBId) {
        regOldPickingBId(CK_GE, oldPickingBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBId The value of oldPickingBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldPickingBId_LessEqual(Long oldPickingBId) {
        regOldPickingBId(CK_LE, oldPickingBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param minNumber The min number of oldPickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oldPickingBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOldPickingBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOldPickingBId(), "OLD_PICKING_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBIdList The collection of oldPickingBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldPickingBId_InScope(Collection<Long> oldPickingBIdList) {
        doSetOldPickingBId_InScope(oldPickingBIdList);
    }

    protected void doSetOldPickingBId_InScope(Collection<Long> oldPickingBIdList) {
        regINS(CK_INS, cTL(oldPickingBIdList), xgetCValueOldPickingBId(), "OLD_PICKING_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     * @param oldPickingBIdList The collection of oldPickingBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldPickingBId_NotInScope(Collection<Long> oldPickingBIdList) {
        doSetOldPickingBId_NotInScope(oldPickingBIdList);
    }

    protected void doSetOldPickingBId_NotInScope(Collection<Long> oldPickingBIdList) {
        regINS(CK_NINS, cTL(oldPickingBIdList), xgetCValueOldPickingBId(), "OLD_PICKING_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     */
    public void setOldPickingBId_IsNull() { regOldPickingBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OLD_PICKING_B_ID: {BIGINT(19)}
     */
    public void setOldPickingBId_IsNotNull() { regOldPickingBId(CK_ISNN, DOBJ); }

    protected void regOldPickingBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOldPickingBId(), "OLD_PICKING_B_ID"); }
    protected abstract ConditionValue xgetCValueOldPickingBId();

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
    public HpSLCFunction<TPickingBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingBCB.class);
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
    public HpSLCFunction<TPickingBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingBCB.class);
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
    public HpSLCFunction<TPickingBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingBCB.class);
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
    public HpSLCFunction<TPickingBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingBCB.class);
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
    public HpSLCFunction<TPickingBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingBCB&gt;() {
     *     public void query(TPickingBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingBCQ sq);

    protected TPickingBCB xcreateScalarConditionCB() {
        TPickingBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingBCB xcreateScalarConditionPartitionByCB() {
        TPickingBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingBCB cb = new TPickingBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingBCQ sq);

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
    protected TPickingBCB newMyCB() {
        return new TPickingBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
