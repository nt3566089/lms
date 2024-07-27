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
 * The abstract condition-query of t_alloc_inst_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAllocInstHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAllocInstHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_alloc_inst_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_H_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstBList for 'exists'. (NotNull)
     */
    public void existsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstBList");
    }
    public abstract String keepAllocInstHId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_H_ID from t_packing_h where ...)} <br>
     * t_packing_h by ALLOC_INST_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingHList for 'exists'. (NotNull)
     */
    public void existsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_ExistsReferrer_TPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPackingHList");
    }
    public abstract String keepAllocInstHId_ExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_H_ID from t_picking_h where ...)} <br>
     * t_picking_h by ALLOC_INST_H_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPickingHList for 'exists'. (NotNull)
     */
    public void existsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_ExistsReferrer_TPickingHList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPickingHList");
    }
    public abstract String keepAllocInstHId_ExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ALLOC_INST_H_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tShippingInstHList");
    }
    public abstract String keepAllocInstHId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_H_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstHId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstBList");
    }
    public abstract String keepAllocInstHId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_H_ID from t_packing_h where ...)} <br>
     * t_packing_h by ALLOC_INST_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstHId_NotExistsReferrer_TPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingHList(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_NotExistsReferrer_TPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPackingHList");
    }
    public abstract String keepAllocInstHId_NotExistsReferrer_TPackingHList(TPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_H_ID from t_picking_h where ...)} <br>
     * t_picking_h by ALLOC_INST_H_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPickingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstHId_NotExistsReferrer_TPickingHList for 'not exists'. (NotNull)
     */
    public void notExistsTPickingHList(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_NotExistsReferrer_TPickingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPickingHList");
    }
    public abstract String keepAllocInstHId_NotExistsReferrer_TPickingHList(TPickingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ALLOC_INST_H_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AllocInstHId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAllocInstHId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tShippingInstHList");
    }
    public abstract String keepAllocInstHId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstHId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepAllocInstHId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstHId_SpecifyDerivedReferrer_TPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPackingHList", al, op);
    }
    public abstract String keepAllocInstHId_SpecifyDerivedReferrer_TPackingHList(TPackingHCQ sq);

    public void xsderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstHId_SpecifyDerivedReferrer_TPickingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tPickingHList", al, op);
    }
    public abstract String keepAllocInstHId_SpecifyDerivedReferrer_TPickingHList(TPickingHCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAllocInstHId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepAllocInstHId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by ALLOC_INST_H_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> derivedTAllocInstBList() {
        return xcreateQDRFunctionTAllocInstBList();
    }
    protected HpQDRFunction<TAllocInstBCB> xcreateQDRFunctionTAllocInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstHId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepAllocInstHId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_packing_h where ...)} <br>
     * t_packing_h by ALLOC_INST_H_ID, named 'TPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> derivedTPackingHList() {
        return xcreateQDRFunctionTPackingHList();
    }
    protected HpQDRFunction<TPackingHCB> xcreateQDRFunctionTPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingHList(String fn, SubQuery<TPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstHId_QueryDerivedReferrer_TPackingHList(cb.query()); String prpp = keepAllocInstHId_QueryDerivedReferrer_TPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", sqpp, "tPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TPackingHList(TPackingHCQ sq);
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_picking_h where ...)} <br>
     * t_picking_h by ALLOC_INST_H_ID, named 'TPickingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPickingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPickingHCB> derivedTPickingHList() {
        return xcreateQDRFunctionTPickingHList();
    }
    protected HpQDRFunction<TPickingHCB> xcreateQDRFunctionTPickingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPickingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPickingHList(String fn, SubQuery<TPickingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstHId_QueryDerivedReferrer_TPickingHList(cb.query()); String prpp = keepAllocInstHId_QueryDerivedReferrer_TPickingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", sqpp, "tPickingHList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TPickingHList(TPickingHCQ sq);
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TPickingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by ALLOC_INST_H_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHList() {
        return xcreateQDRFunctionTShippingInstHList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepAllocInstHId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepAllocInstHId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepAllocInstHId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     */
    public void setAllocInstHId_IsNull() { regAllocInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {PK, ID, NotNull, BIGINT(19), FK to T_PICKING_H}
     */
    public void setAllocInstHId_IsNotNull() { regAllocInstHId(CK_ISNN, DOBJ); }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19), FK to m_process_type}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PROCESS_TYPE_ID from m_process_type where ...)} <br />
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'in-scope'. (NotNull)
     */
    public void inScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_InScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", false);
    }
    public abstract String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PROCESS_TYPE_ID from m_process_type where ...)} <br />
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_NotInScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", true);
    }
    public abstract String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq);

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_Equal(String shippingDt) {
        doSetShippingDt_Equal(fRES(shippingDt));
    }

    protected void doSetShippingDt_Equal(String shippingDt) {
        regShippingDt(CK_EQ, shippingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotEqual(String shippingDt) {
        doSetShippingDt_NotEqual(fRES(shippingDt));
    }

    protected void doSetShippingDt_NotEqual(String shippingDt) {
        regShippingDt(CK_NES, shippingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDtList The collection of shippingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_InScope(Collection<String> shippingDtList) {
        doSetShippingDt_InScope(shippingDtList);
    }

    protected void doSetShippingDt_InScope(Collection<String> shippingDtList) {
        regINS(CK_INS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDtList The collection of shippingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotInScope(Collection<String> shippingDtList) {
        doSetShippingDt_NotInScope(shippingDtList);
    }

    protected void doSetShippingDt_NotInScope(Collection<String> shippingDtList) {
        regINS(CK_NINS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)} <br>
     * <pre>e.g. setShippingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingDt The value of shippingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingDt_LikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     */
    public void setShippingDt_IsNull() { regShippingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     */
    public void setShippingDt_IsNullOrEmpty() { regShippingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, VARCHAR(8)}
     */
    public void setShippingDt_IsNotNull() { regShippingDt(CK_ISNN, DOBJ); }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_Equal(String delivPlanDt) {
        doSetDelivPlanDt_Equal(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_Equal(String delivPlanDt) {
        regDelivPlanDt(CK_EQ, delivPlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotEqual(String delivPlanDt) {
        doSetDelivPlanDt_NotEqual(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_NotEqual(String delivPlanDt) {
        regDelivPlanDt(CK_NES, delivPlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterThan(String delivPlanDt) {
        regDelivPlanDt(CK_GT, fRES(delivPlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessThan(String delivPlanDt) {
        regDelivPlanDt(CK_LT, fRES(delivPlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterEqual(String delivPlanDt) {
        regDelivPlanDt(CK_GE, fRES(delivPlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessEqual(String delivPlanDt) {
        regDelivPlanDt(CK_LE, fRES(delivPlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_InScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        regINS(CK_INS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_NotInScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        regINS(CK_NINS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivPlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivPlanDt The value of delivPlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivPlanDt_LikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivPlanDt_NotLikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_PrefixSearch(String delivPlanDt) {
        setDelivPlanDt_LikeSearch(delivPlanDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNull() { regDelivPlanDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNullOrEmpty() { regDelivPlanDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNotNull() { regDelivPlanDt(CK_ISNN, DOBJ); }

    protected void regDelivPlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivPlanDt(), "DELIV_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueDelivPlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    /**
     * Equal(=). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_Equal_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_Equal_$A() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Equal(=). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_Equal_$B() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Equal(=). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_Equal_$C() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Equal(=). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_Equal_$D() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Equal(=). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_Equal_$E() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Equal(=). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_Equal_$F() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Equal(=). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_Equal_$G() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Equal(=). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_Equal_$H() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Equal(=). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_Equal_$I() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Equal(=). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_Equal_$J() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    /**
     * NotEqual(&lt;&gt;). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_NotEqual_$A() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * NotEqual(&lt;&gt;). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_NotEqual_$B() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * NotEqual(&lt;&gt;). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_NotEqual_$C() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * NotEqual(&lt;&gt;). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_NotEqual_$D() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * NotEqual(&lt;&gt;). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_NotEqual_$E() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * NotEqual(&lt;&gt;). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_NotEqual_$F() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * NotEqual(&lt;&gt;). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_NotEqual_$G() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * NotEqual(&lt;&gt;). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_NotEqual_$H() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * NotEqual(&lt;&gt;). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_NotEqual_$I() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * NotEqual(&lt;&gt;). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_NotEqual_$J() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_InScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_Equal(Long supplyCustomerId) {
        doSetSupplyCustomerId_Equal(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_Equal(Long supplyCustomerId) {
        regSupplyCustomerId(CK_EQ, supplyCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        doSetSupplyCustomerId_NotEqual(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_NES, supplyCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GT, supplyCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LT, supplyCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GE, supplyCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerId The value of supplyCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LE, supplyCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplyCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerIdList The collection of supplyCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_InScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_INS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param supplyCustomerIdList The collection of supplyCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_NotInScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_NINS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SUPPLY_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplyCustomerId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerBySupplyCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLY_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplyCustomerId", false);
    }
    public abstract String keepSupplyCustomerId_InScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SUPPLY_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my SUPPLY_CUSTOMER_ID, named 'MCustomerBySupplyCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerBySupplyCustomerId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerBySupplyCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "SUPPLY_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerBySupplyCustomerId", true);
    }
    public abstract String keepSupplyCustomerId_NotInScopeRelation_MCustomerBySupplyCustomerId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setSupplyCustomerId_IsNull() { regSupplyCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setSupplyCustomerId_IsNotNull() { regSupplyCustomerId(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_Equal(String supplyCustomerCd) {
        doSetSupplyCustomerCd_Equal(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_Equal(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_EQ, supplyCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        doSetSupplyCustomerCd_NotEqual(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_NES, supplyCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GT, fRES(supplyCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LT, fRES(supplyCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GE, fRES(supplyCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LE, fRES(supplyCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_InScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_INS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_NotInScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_NINS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setSupplyCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerCd The value of supplyCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerCd_LikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerCd_NotLikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_PrefixSearch(String supplyCustomerCd) {
        setSupplyCustomerCd_LikeSearch(supplyCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNull() { regSupplyCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNullOrEmpty() { regSupplyCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNotNull() { regSupplyCustomerCd(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_Equal(String supplyCustomerNm) {
        doSetSupplyCustomerNm_Equal(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_Equal(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_EQ, supplyCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        doSetSupplyCustomerNm_NotEqual(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_NES, supplyCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GT, fRES(supplyCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LT, fRES(supplyCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GE, fRES(supplyCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LE, fRES(supplyCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_InScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_INS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_NotInScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_NINS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * <pre>e.g. setSupplyCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerNm The value of supplyCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerNm_LikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerNm_NotLikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_PrefixSearch(String supplyCustomerNm) {
        setSupplyCustomerNm_LikeSearch(supplyCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNull() { regSupplyCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNullOrEmpty() { regSupplyCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNotNull() { regSupplyCustomerNm(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_Equal(Long delivCustomerId) {
        doSetDelivCustomerId_Equal(delivCustomerId);
    }

    protected void doSetDelivCustomerId_Equal(Long delivCustomerId) {
        regDelivCustomerId(CK_EQ, delivCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotEqual(Long delivCustomerId) {
        doSetDelivCustomerId_NotEqual(delivCustomerId);
    }

    protected void doSetDelivCustomerId_NotEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_NES, delivCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerIdList The collection of delivCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_InScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_INS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDelivCustomerId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerByDelivCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerByDelivCustomerId", false);
    }
    public abstract String keepDelivCustomerId_InScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerByDelivCustomerId'.
     * @param subCBLambda The callback for sub-query of MCustomerByDelivCustomerId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerByDelivCustomerId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerByDelivCustomerId", true);
    }
    public abstract String keepDelivCustomerId_NotInScopeRelation_MCustomerByDelivCustomerId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_Equal(String delivCustomerCd) {
        doSetDelivCustomerCd_Equal(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_Equal(String delivCustomerCd) {
        regDelivCustomerCd(CK_EQ, delivCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotEqual(String delivCustomerCd) {
        doSetDelivCustomerCd_NotEqual(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_NotEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_NES, delivCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_GT, fRES(delivCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_LT, fRES(delivCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_GE, fRES(delivCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_LE, fRES(delivCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_InScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        regINS(CK_INS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_NotInScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        regINS(CK_NINS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerCd The value of delivCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerCd_LikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerCd_NotLikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_PrefixSearch(String delivCustomerCd) {
        setDelivCustomerCd_LikeSearch(delivCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNull() { regDelivCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNullOrEmpty() { regDelivCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNotNull() { regDelivCustomerCd(CK_ISNN, DOBJ); }

    protected void regDelivCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueDelivCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_Equal(String delivZipCd) {
        doSetDelivZipCd_Equal(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_Equal(String delivZipCd) {
        regDelivZipCd(CK_EQ, delivZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotEqual(String delivZipCd) {
        doSetDelivZipCd_NotEqual(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_NotEqual(String delivZipCd) {
        regDelivZipCd(CK_NES, delivZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterThan(String delivZipCd) {
        regDelivZipCd(CK_GT, fRES(delivZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessThan(String delivZipCd) {
        regDelivZipCd(CK_LT, fRES(delivZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterEqual(String delivZipCd) {
        regDelivZipCd(CK_GE, fRES(delivZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessEqual(String delivZipCd) {
        regDelivZipCd(CK_LE, fRES(delivZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCdList The collection of delivZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_InScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_InScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_InScope(Collection<String> delivZipCdList) {
        regINS(CK_INS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCdList The collection of delivZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_NotInScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        regINS(CK_NINS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd The value of delivZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd_LikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd_NotLikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_PrefixSearch(String delivZipCd) {
        setDelivZipCd_LikeSearch(delivZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNull() { regDelivZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNullOrEmpty() { regDelivZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNotNull() { regDelivZipCd(CK_ISNN, DOBJ); }

    protected void regDelivZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd(), "DELIV_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDelivZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_Equal(String delivAddressSupply) {
        doSetDelivAddressSupply_Equal(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_Equal(String delivAddressSupply) {
        regDelivAddressSupply(CK_EQ, delivAddressSupply);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotEqual(String delivAddressSupply) {
        doSetDelivAddressSupply_NotEqual(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_NotEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_NES, delivAddressSupply);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_GT, fRES(delivAddressSupply));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_LT, fRES(delivAddressSupply));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_GE, fRES(delivAddressSupply));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_LE, fRES(delivAddressSupply));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_InScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_INS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_NotInScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_NINS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * <pre>e.g. setDelivAddressSupply_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddressSupply The value of delivAddressSupply as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddressSupply_LikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddressSupply_NotLikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_PrefixSearch(String delivAddressSupply) {
        setDelivAddressSupply_LikeSearch(delivAddressSupply, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNull() { regDelivAddressSupply(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNullOrEmpty() { regDelivAddressSupply(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNotNull() { regDelivAddressSupply(CK_ISNN, DOBJ); }

    protected void regDelivAddressSupply(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY"); }
    protected abstract ConditionValue xgetCValueDelivAddressSupply();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_Equal(String delivCustomerNm) {
        doSetDelivCustomerNm_Equal(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_Equal(String delivCustomerNm) {
        regDelivCustomerNm(CK_EQ, delivCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotEqual(String delivCustomerNm) {
        doSetDelivCustomerNm_NotEqual(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_NotEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_NES, delivCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_GT, fRES(delivCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_LT, fRES(delivCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_GE, fRES(delivCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_LE, fRES(delivCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_InScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        regINS(CK_INS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_NotInScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        regINS(CK_NINS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm The value of delivCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm_LikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm_NotLikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     * @param delivCustomerNm The value of delivCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_PrefixSearch(String delivCustomerNm) {
        setDelivCustomerNm_LikeSearch(delivCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNull() { regDelivCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNullOrEmpty() { regDelivCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setDelivCustomerNm_IsNotNull() { regDelivCustomerNm(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_Equal(String delivCustomerNm1) {
        doSetDelivCustomerNm1_Equal(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_Equal(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_EQ, delivCustomerNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        doSetDelivCustomerNm1_NotEqual(fRES(delivCustomerNm1));
    }

    protected void doSetDelivCustomerNm1_NotEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_NES, delivCustomerNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GT, fRES(delivCustomerNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessThan(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LT, fRES(delivCustomerNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_GreaterEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_GE, fRES(delivCustomerNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_LessEqual(String delivCustomerNm1) {
        regDelivCustomerNm1(CK_LE, fRES(delivCustomerNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_InScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_InScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_INS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1List The collection of delivCustomerNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        doSetDelivCustomerNm1_NotInScope(delivCustomerNm1List);
    }

    protected void doSetDelivCustomerNm1_NotInScope(Collection<String> delivCustomerNm1List) {
        regINS(CK_NINS, cTL(delivCustomerNm1List), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm1 The value of delivCustomerNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm1_LikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm1_NotLikeSearch(String delivCustomerNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm1), xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     * @param delivCustomerNm1 The value of delivCustomerNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm1_PrefixSearch(String delivCustomerNm1) {
        setDelivCustomerNm1_LikeSearch(delivCustomerNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNull() { regDelivCustomerNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNullOrEmpty() { regDelivCustomerNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM1: {VARCHAR(255)}
     */
    public void setDelivCustomerNm1_IsNotNull() { regDelivCustomerNm1(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm1(), "DELIV_CUSTOMER_NM1"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_Equal(String delivCustomerNm2) {
        doSetDelivCustomerNm2_Equal(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_Equal(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_EQ, delivCustomerNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        doSetDelivCustomerNm2_NotEqual(fRES(delivCustomerNm2));
    }

    protected void doSetDelivCustomerNm2_NotEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_NES, delivCustomerNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GT, fRES(delivCustomerNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessThan(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LT, fRES(delivCustomerNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_GreaterEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_GE, fRES(delivCustomerNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_LessEqual(String delivCustomerNm2) {
        regDelivCustomerNm2(CK_LE, fRES(delivCustomerNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_InScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_InScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_INS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2List The collection of delivCustomerNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        doSetDelivCustomerNm2_NotInScope(delivCustomerNm2List);
    }

    protected void doSetDelivCustomerNm2_NotInScope(Collection<String> delivCustomerNm2List) {
        regINS(CK_NINS, cTL(delivCustomerNm2List), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivCustomerNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm2 The value of delivCustomerNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm2_LikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm2_NotLikeSearch(String delivCustomerNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm2), xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     * @param delivCustomerNm2 The value of delivCustomerNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm2_PrefixSearch(String delivCustomerNm2) {
        setDelivCustomerNm2_LikeSearch(delivCustomerNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNull() { regDelivCustomerNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNullOrEmpty() { regDelivCustomerNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM2: {VARCHAR(255)}
     */
    public void setDelivCustomerNm2_IsNotNull() { regDelivCustomerNm2(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm2(), "DELIV_CUSTOMER_NM2"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_Equal(String delivTelNo) {
        doSetDelivTelNo_Equal(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_Equal(String delivTelNo) {
        regDelivTelNo(CK_EQ, delivTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotEqual(String delivTelNo) {
        doSetDelivTelNo_NotEqual(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_NotEqual(String delivTelNo) {
        regDelivTelNo(CK_NES, delivTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterThan(String delivTelNo) {
        regDelivTelNo(CK_GT, fRES(delivTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessThan(String delivTelNo) {
        regDelivTelNo(CK_LT, fRES(delivTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterEqual(String delivTelNo) {
        regDelivTelNo(CK_GE, fRES(delivTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessEqual(String delivTelNo) {
        regDelivTelNo(CK_LE, fRES(delivTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_InScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_InScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_InScope(Collection<String> delivTelNoList) {
        regINS(CK_INS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_NotInScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        regINS(CK_NINS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo The value of delivTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo_LikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo_NotLikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_PrefixSearch(String delivTelNo) {
        setDelivTelNo_LikeSearch(delivTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNull() { regDelivTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNullOrEmpty() { regDelivTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNotNull() { regDelivTelNo(CK_ISNN, DOBJ); }

    protected void regDelivTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo(), "DELIV_TEL_NO"); }
    protected abstract ConditionValue xgetCValueDelivTelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_Equal(Long deliveryCourseId) {
        doSetDeliveryCourseId_Equal(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_Equal(Long deliveryCourseId) {
        regDeliveryCourseId(CK_EQ, deliveryCourseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        doSetDeliveryCourseId_NotEqual(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_NES, deliveryCourseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseIdList The collection of deliveryCourseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_InScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_INS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIVERY_COURSE_ID from m_delivery_course where ...)} <br />
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'in-scope'. (NotNull)
     */
    public void inScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", false);
    }
    public abstract String keepDeliveryCourseId_InScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIVERY_COURSE_ID from m_delivery_course where ...)} <br />
     * m_delivery_course by my DELIVERY_COURSE_ID, named 'MDeliveryCourse'.
     * @param subCBLambda The callback for sub-query of MDeliveryCourse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMDeliveryCourse(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(cb.query());
        registerInScopeRelation(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mDeliveryCourse", true);
    }
    public abstract String keepDeliveryCourseId_NotInScopeRelation_MDeliveryCourse(MDeliveryCourseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19), FK to m_delivery_course}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_Equal(String nizoroeNo) {
        doSetNizoroeNo_Equal(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_Equal(String nizoroeNo) {
        regNizoroeNo(CK_EQ, nizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotEqual(String nizoroeNo) {
        doSetNizoroeNo_NotEqual(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_NotEqual(String nizoroeNo) {
        regNizoroeNo(CK_NES, nizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterThan(String nizoroeNo) {
        regNizoroeNo(CK_GT, fRES(nizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessThan(String nizoroeNo) {
        regNizoroeNo(CK_LT, fRES(nizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterEqual(String nizoroeNo) {
        regNizoroeNo(CK_GE, fRES(nizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessEqual(String nizoroeNo) {
        regNizoroeNo(CK_LE, fRES(nizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_InScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        regINS(CK_INS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_NotInScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        regINS(CK_NINS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo The value of nizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo_LikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo_NotLikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_PrefixSearch(String nizoroeNo) {
        setNizoroeNo_LikeSearch(nizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNull() { regNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNullOrEmpty() { regNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNotNull() { regNizoroeNo(CK_ISNN, DOBJ); }

    protected void regNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo(), "NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueNizoroeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_Equal(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_EQ, daihyoNizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_NotEqual(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_NES, daihyoNizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GT, fRES(daihyoNizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LT, fRES(daihyoNizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GE, fRES(daihyoNizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LE, fRES(daihyoNizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_InScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_INS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_NotInScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_NINS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_LikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_NotLikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_PrefixSearch(String daihyoNizoroeNo) {
        setDaihyoNizoroeNo_LikeSearch(daihyoNizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNull() { regDaihyoNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNullOrEmpty() { regDaihyoNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNotNull() { regDaihyoNizoroeNo(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_Equal(String nizoroeNo2) {
        doSetNizoroeNo2_Equal(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_Equal(String nizoroeNo2) {
        regNizoroeNo2(CK_EQ, nizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotEqual(String nizoroeNo2) {
        doSetNizoroeNo2_NotEqual(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_NotEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_NES, nizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterThan(String nizoroeNo2) {
        regNizoroeNo2(CK_GT, fRES(nizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessThan(String nizoroeNo2) {
        regNizoroeNo2(CK_LT, fRES(nizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_GE, fRES(nizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_LE, fRES(nizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_InScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        regINS(CK_INS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_NotInScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        regINS(CK_NINS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo2 The value of nizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo2_LikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo2_NotLikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_PrefixSearch(String nizoroeNo2) {
        setNizoroeNo2_LikeSearch(nizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNull() { regNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNullOrEmpty() { regNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNotNull() { regNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo2(), "NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueNizoroeNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_Equal(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_EQ, daihyoNizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_NotEqual(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_NES, daihyoNizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GT, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LT, fRES(daihyoNizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GE, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LE, fRES(daihyoNizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_InScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_INS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_NotInScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_NINS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_LikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_NotLikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_PrefixSearch(String daihyoNizoroeNo2) {
        setDaihyoNizoroeNo2_LikeSearch(daihyoNizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNull() { regDaihyoNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNullOrEmpty() { regDaihyoNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNotNull() { regDaihyoNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_Equal(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_EQ, specifyDeliveryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_NotEqual(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_NES, specifyDeliveryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GT, fRES(specifyDeliveryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LT, fRES(specifyDeliveryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GE, fRES(specifyDeliveryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LE, fRES(specifyDeliveryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_InScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_INS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_NotInScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_NINS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setSpecifyDeliveryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryDt The value of specifyDeliveryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_LikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_NotLikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_PrefixSearch(String specifyDeliveryDt) {
        setSpecifyDeliveryDt_LikeSearch(specifyDeliveryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNull() { regSpecifyDeliveryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNullOrEmpty() { regSpecifyDeliveryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setSpecifyDeliveryDt_IsNotNull() { regSpecifyDeliveryDt(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_Equal(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_EQ, specifyDeliveryTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_NotEqual(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_NES, specifyDeliveryTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GT, fRES(specifyDeliveryTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LT, fRES(specifyDeliveryTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GE, fRES(specifyDeliveryTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LE, fRES(specifyDeliveryTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_InScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_INS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_NotInScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_NINS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * <pre>e.g. setSpecifyDeliveryTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryTime The value of specifyDeliveryTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_LikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_NotLikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_PrefixSearch(String specifyDeliveryTime) {
        setSpecifyDeliveryTime_LikeSearch(specifyDeliveryTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNull() { regSpecifyDeliveryTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNullOrEmpty() { regSpecifyDeliveryTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNotNull() { regSpecifyDeliveryTime(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_Equal(String 共通管理送信済フラグ) {
        doSet共通管理送信済フラグ_Equal(fRES(共通管理送信済フラグ));
    }

    protected void doSet共通管理送信済フラグ_Equal(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_EQ, 共通管理送信済フラグ);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_NotEqual(String 共通管理送信済フラグ) {
        doSet共通管理送信済フラグ_NotEqual(fRES(共通管理送信済フラグ));
    }

    protected void doSet共通管理送信済フラグ_NotEqual(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_NES, 共通管理送信済フラグ);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_GreaterThan(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_GT, fRES(共通管理送信済フラグ));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_LessThan(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_LT, fRES(共通管理送信済フラグ));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_GreaterEqual(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_GE, fRES(共通管理送信済フラグ));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_LessEqual(String 共通管理送信済フラグ) {
        reg共通管理送信済フラグ(CK_LE, fRES(共通管理送信済フラグ));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグList The collection of 共通管理送信済フラグ as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_InScope(Collection<String> 共通管理送信済フラグList) {
        doSet共通管理送信済フラグ_InScope(共通管理送信済フラグList);
    }

    protected void doSet共通管理送信済フラグ_InScope(Collection<String> 共通管理送信済フラグList) {
        regINS(CK_INS, cTL(共通管理送信済フラグList), xgetCValue共通管理送信済フラグ(), "共通管理送信済フラグ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグList The collection of 共通管理送信済フラグ as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_NotInScope(Collection<String> 共通管理送信済フラグList) {
        doSet共通管理送信済フラグ_NotInScope(共通管理送信済フラグList);
    }

    protected void doSet共通管理送信済フラグ_NotInScope(Collection<String> 共通管理送信済フラグList) {
        regINS(CK_NINS, cTL(共通管理送信済フラグList), xgetCValue共通管理送信済フラグ(), "共通管理送信済フラグ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)} <br>
     * <pre>e.g. set共通管理送信済フラグ_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void set共通管理送信済フラグ_LikeSearch(String 共通管理送信済フラグ, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(共通管理送信済フラグ), xgetCValue共通管理送信済フラグ(), "共通管理送信済フラグ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void set共通管理送信済フラグ_NotLikeSearch(String 共通管理送信済フラグ, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(共通管理送信済フラグ), xgetCValue共通管理送信済フラグ(), "共通管理送信済フラグ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     * @param 共通管理送信済フラグ The value of 共通管理送信済フラグ as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void set共通管理送信済フラグ_PrefixSearch(String 共通管理送信済フラグ) {
        set共通管理送信済フラグ_LikeSearch(共通管理送信済フラグ, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     */
    public void set共通管理送信済フラグ_IsNull() { reg共通管理送信済フラグ(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     */
    public void set共通管理送信済フラグ_IsNullOrEmpty() { reg共通管理送信済フラグ(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * 共通管理送信済フラグ: {CHAR(1)}
     */
    public void set共通管理送信済フラグ_IsNotNull() { reg共通管理送信済フラグ(CK_ISNN, DOBJ); }

    protected void reg共通管理送信済フラグ(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValue共通管理送信済フラグ(), "共通管理送信済フラグ"); }
    protected abstract ConditionValue xgetCValue共通管理送信済フラグ();

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
    public HpSLCFunction<TAllocInstHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TAllocInstHCB.class);
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
    public HpSLCFunction<TAllocInstHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TAllocInstHCB.class);
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
    public HpSLCFunction<TAllocInstHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TAllocInstHCB.class);
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
    public HpSLCFunction<TAllocInstHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TAllocInstHCB.class);
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
    public HpSLCFunction<TAllocInstHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TAllocInstHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TAllocInstHCB&gt;() {
     *     public void query(TAllocInstHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TAllocInstHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TAllocInstHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TAllocInstHCQ sq);

    protected TAllocInstHCB xcreateScalarConditionCB() {
        TAllocInstHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TAllocInstHCB xcreateScalarConditionPartitionByCB() {
        TAllocInstHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ALLOC_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TAllocInstHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TAllocInstHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ALLOC_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TAllocInstHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TAllocInstHCQ sq);

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
    protected TAllocInstHCB newMyCB() {
        return new TAllocInstHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TAllocInstHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
