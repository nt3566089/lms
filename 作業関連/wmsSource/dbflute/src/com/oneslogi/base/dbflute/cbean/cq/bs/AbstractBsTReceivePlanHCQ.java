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
 * The abstract condition-query of t_receive_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReceivePlanHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReceivePlanHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_receive_plan_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_H_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanBList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_ExistsReferrer_TReceivePlanBList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepReceivePlanHId_ExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select OLD_RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHSelfList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHSelfList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHSelfList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_ExistsReferrer_TReceivePlanHSelfList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "OLD_RECEIVE_PLAN_H_ID", pp, "tReceivePlanHSelfList");
    }
    public abstract String keepReceivePlanHId_ExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_H_ID from t_receive_plan_r where ...)} <br>
     * t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanRAsOne for 'exists'. (NotNull)
     */
    public void existsTReceivePlanRAsOne(SubQuery<TReceivePlanRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_ExistsReferrer_TReceivePlanRAsOne(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanRAsOne");
    }
    public abstract String keepReceivePlanHId_ExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_H_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_ExistsReferrer_TStoreRecordHList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepReceivePlanHId_ExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_H_ID from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanHId_NotExistsReferrer_TReceivePlanBList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanBList(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_NotExistsReferrer_TReceivePlanBList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanBList");
    }
    public abstract String keepReceivePlanHId_NotExistsReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select OLD_RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHSelfList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHSelfList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "OLD_RECEIVE_PLAN_H_ID", pp, "tReceivePlanHSelfList");
    }
    public abstract String keepReceivePlanHId_NotExistsReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_H_ID from t_receive_plan_r where ...)} <br>
     * t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanRAsOne(SubQuery<TReceivePlanRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanRAsOne");
    }
    public abstract String keepReceivePlanHId_NotExistsReferrer_TReceivePlanRAsOne(TReceivePlanRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_H_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanHId_NotExistsReferrer_TStoreRecordHList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanHId_NotExistsReferrer_TStoreRecordHList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tStoreRecordHList");
    }
    public abstract String keepReceivePlanHId_NotExistsReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    public void xsderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanBList", al, op);
    }
    public abstract String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);

    public void xsderiveTReceivePlanHSelfList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "OLD_RECEIVE_PLAN_H_ID", pp, "tReceivePlanHSelfList", al, op);
    }
    public abstract String keepReceivePlanHId_SpecifyDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq);

    public void xsderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tStoreRecordHList", al, op);
    }
    public abstract String keepReceivePlanHId_SpecifyDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_b where ...)} <br>
     * t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanBCB> derivedTReceivePlanBList() {
        return xcreateQDRFunctionTReceivePlanBList();
    }
    protected HpQDRFunction<TReceivePlanBCB> xcreateQDRFunctionTReceivePlanBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanBList(String fn, SubQuery<TReceivePlanBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBList(cb.query()); String prpp = keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", sqpp, "tReceivePlanBList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBList(TReceivePlanBCQ sq);
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHSelfList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHSelfList() {
        return xcreateQDRFunctionTReceivePlanHSelfList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHSelfList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList(cb.query()); String prpp = keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "OLD_RECEIVE_PLAN_H_ID", sqpp, "tReceivePlanHSelfList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfList(TReceivePlanHCQ sq);
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TReceivePlanHSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_h where ...)} <br>
     * t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHList() {
        return xcreateQDRFunctionTStoreRecordHList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHList(cb.query()); String prpp = keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", sqpp, "tStoreRecordHList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHList(TStoreRecordHCQ sq);
    public abstract String keepReceivePlanHId_QueryDerivedReferrer_TStoreRecordHListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

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
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
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
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
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
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
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
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     */
    public void setProcessTypeId_IsNull() { regProcessTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, BIGINT(19), FK to m_process_type}
     */
    public void setProcessTypeId_IsNotNull() { regProcessTypeId(CK_ISNN, DOBJ); }

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_Equal(Long stockTypeId) {
        doSetStockTypeId_Equal(stockTypeId);
    }

    protected void doSetStockTypeId_Equal(Long stockTypeId) {
        regStockTypeId(CK_EQ, stockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_NotEqual(Long stockTypeId) {
        doSetStockTypeId_NotEqual(stockTypeId);
    }

    protected void doSetStockTypeId_NotEqual(Long stockTypeId) {
        regStockTypeId(CK_NES, stockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterThan(Long stockTypeId) {
        regStockTypeId(CK_GT, stockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessThan(Long stockTypeId) {
        regStockTypeId(CK_LT, stockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_GreaterEqual(Long stockTypeId) {
        regStockTypeId(CK_GE, stockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeId The value of stockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockTypeId_LessEqual(Long stockTypeId) {
        regStockTypeId(CK_LE, stockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param minNumber The min number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockTypeId(), "STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeIdList The collection of stockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_InScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_InScope(Collection<Long> stockTypeIdList) {
        regINS(CK_INS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param stockTypeIdList The collection of stockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        doSetStockTypeId_NotInScope(stockTypeIdList);
    }

    protected void doSetStockTypeId_NotInScope(Collection<Long> stockTypeIdList) {
        regINS(CK_NINS, cTL(stockTypeIdList), xgetCValueStockTypeId(), "STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setStockTypeId_IsNull() { regStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setStockTypeId_IsNotNull() { regStockTypeId(CK_ISNN, DOBJ); }

    protected void regStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTypeId(), "STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueStockTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_Equal(String receivePlanDt) {
        doSetReceivePlanDt_Equal(fRES(receivePlanDt));
    }

    protected void doSetReceivePlanDt_Equal(String receivePlanDt) {
        regReceivePlanDt(CK_EQ, receivePlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_NotEqual(String receivePlanDt) {
        doSetReceivePlanDt_NotEqual(fRES(receivePlanDt));
    }

    protected void doSetReceivePlanDt_NotEqual(String receivePlanDt) {
        regReceivePlanDt(CK_NES, receivePlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_GreaterThan(String receivePlanDt) {
        regReceivePlanDt(CK_GT, fRES(receivePlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_LessThan(String receivePlanDt) {
        regReceivePlanDt(CK_LT, fRES(receivePlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_GreaterEqual(String receivePlanDt) {
        regReceivePlanDt(CK_GE, fRES(receivePlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_LessEqual(String receivePlanDt) {
        regReceivePlanDt(CK_LE, fRES(receivePlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDtList The collection of receivePlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_InScope(Collection<String> receivePlanDtList) {
        doSetReceivePlanDt_InScope(receivePlanDtList);
    }

    protected void doSetReceivePlanDt_InScope(Collection<String> receivePlanDtList) {
        regINS(CK_INS, cTL(receivePlanDtList), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDtList The collection of receivePlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_NotInScope(Collection<String> receivePlanDtList) {
        doSetReceivePlanDt_NotInScope(receivePlanDtList);
    }

    protected void doSetReceivePlanDt_NotInScope(Collection<String> receivePlanDtList) {
        regINS(CK_NINS, cTL(receivePlanDtList), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)} <br>
     * <pre>e.g. setReceivePlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivePlanDt The value of receivePlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivePlanDt_LikeSearch(String receivePlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivePlanDt), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivePlanDt_NotLikeSearch(String receivePlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivePlanDt), xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DT: {IX, NotNull, VARCHAR(8)}
     * @param receivePlanDt The value of receivePlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDt_PrefixSearch(String receivePlanDt) {
        setReceivePlanDt_LikeSearch(receivePlanDt, xcLSOPPre());
    }

    protected void regReceivePlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanDt(), "RECEIVE_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueReceivePlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_Equal(String planClientReceiveNo) {
        doSetPlanClientReceiveNo_Equal(fRES(planClientReceiveNo));
    }

    protected void doSetPlanClientReceiveNo_Equal(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_EQ, planClientReceiveNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_NotEqual(String planClientReceiveNo) {
        doSetPlanClientReceiveNo_NotEqual(fRES(planClientReceiveNo));
    }

    protected void doSetPlanClientReceiveNo_NotEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_NES, planClientReceiveNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_GreaterThan(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_GT, fRES(planClientReceiveNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_LessThan(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_LT, fRES(planClientReceiveNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_GreaterEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_GE, fRES(planClientReceiveNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_LessEqual(String planClientReceiveNo) {
        regPlanClientReceiveNo(CK_LE, fRES(planClientReceiveNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNoList The collection of planClientReceiveNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_InScope(Collection<String> planClientReceiveNoList) {
        doSetPlanClientReceiveNo_InScope(planClientReceiveNoList);
    }

    protected void doSetPlanClientReceiveNo_InScope(Collection<String> planClientReceiveNoList) {
        regINS(CK_INS, cTL(planClientReceiveNoList), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNoList The collection of planClientReceiveNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_NotInScope(Collection<String> planClientReceiveNoList) {
        doSetPlanClientReceiveNo_NotInScope(planClientReceiveNoList);
    }

    protected void doSetPlanClientReceiveNo_NotInScope(Collection<String> planClientReceiveNoList) {
        regINS(CK_NINS, cTL(planClientReceiveNoList), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPlanClientReceiveNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planClientReceiveNo The value of planClientReceiveNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanClientReceiveNo_LikeSearch(String planClientReceiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planClientReceiveNo), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanClientReceiveNo_NotLikeSearch(String planClientReceiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planClientReceiveNo), xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     * @param planClientReceiveNo The value of planClientReceiveNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientReceiveNo_PrefixSearch(String planClientReceiveNo) {
        setPlanClientReceiveNo_LikeSearch(planClientReceiveNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientReceiveNo_IsNull() { regPlanClientReceiveNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientReceiveNo_IsNullOrEmpty() { regPlanClientReceiveNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_RECEIVE_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientReceiveNo_IsNotNull() { regPlanClientReceiveNo(CK_ISNN, DOBJ); }

    protected void regPlanClientReceiveNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanClientReceiveNo(), "PLAN_CLIENT_RECEIVE_NO"); }
    protected abstract ConditionValue xgetCValuePlanClientReceiveNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_Equal(String receiveSlipNo) {
        doSetReceiveSlipNo_Equal(fRES(receiveSlipNo));
    }

    protected void doSetReceiveSlipNo_Equal(String receiveSlipNo) {
        regReceiveSlipNo(CK_EQ, receiveSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_NotEqual(String receiveSlipNo) {
        doSetReceiveSlipNo_NotEqual(fRES(receiveSlipNo));
    }

    protected void doSetReceiveSlipNo_NotEqual(String receiveSlipNo) {
        regReceiveSlipNo(CK_NES, receiveSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_GreaterThan(String receiveSlipNo) {
        regReceiveSlipNo(CK_GT, fRES(receiveSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_LessThan(String receiveSlipNo) {
        regReceiveSlipNo(CK_LT, fRES(receiveSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_GreaterEqual(String receiveSlipNo) {
        regReceiveSlipNo(CK_GE, fRES(receiveSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_LessEqual(String receiveSlipNo) {
        regReceiveSlipNo(CK_LE, fRES(receiveSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNoList The collection of receiveSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_InScope(Collection<String> receiveSlipNoList) {
        doSetReceiveSlipNo_InScope(receiveSlipNoList);
    }

    protected void doSetReceiveSlipNo_InScope(Collection<String> receiveSlipNoList) {
        regINS(CK_INS, cTL(receiveSlipNoList), xgetCValueReceiveSlipNo(), "RECEIVE_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNoList The collection of receiveSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_NotInScope(Collection<String> receiveSlipNoList) {
        doSetReceiveSlipNo_NotInScope(receiveSlipNoList);
    }

    protected void doSetReceiveSlipNo_NotInScope(Collection<String> receiveSlipNoList) {
        regINS(CK_NINS, cTL(receiveSlipNoList), xgetCValueReceiveSlipNo(), "RECEIVE_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setReceiveSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveSlipNo The value of receiveSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveSlipNo_LikeSearch(String receiveSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveSlipNo), xgetCValueReceiveSlipNo(), "RECEIVE_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveSlipNo_NotLikeSearch(String receiveSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveSlipNo), xgetCValueReceiveSlipNo(), "RECEIVE_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_SLIP_NO: {IX, NotNull, VARCHAR(30)}
     * @param receiveSlipNo The value of receiveSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveSlipNo_PrefixSearch(String receiveSlipNo) {
        setReceiveSlipNo_LikeSearch(receiveSlipNo, xcLSOPPre());
    }

    protected void regReceiveSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveSlipNo(), "RECEIVE_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueReceiveSlipNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_Equal(Long planSupplierId) {
        doSetPlanSupplierId_Equal(planSupplierId);
    }

    protected void doSetPlanSupplierId_Equal(Long planSupplierId) {
        regPlanSupplierId(CK_EQ, planSupplierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_NotEqual(Long planSupplierId) {
        doSetPlanSupplierId_NotEqual(planSupplierId);
    }

    protected void doSetPlanSupplierId_NotEqual(Long planSupplierId) {
        regPlanSupplierId(CK_NES, planSupplierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_GreaterThan(Long planSupplierId) {
        regPlanSupplierId(CK_GT, planSupplierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_LessThan(Long planSupplierId) {
        regPlanSupplierId(CK_LT, planSupplierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_GreaterEqual(Long planSupplierId) {
        regPlanSupplierId(CK_GE, planSupplierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierId The value of planSupplierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanSupplierId_LessEqual(Long planSupplierId) {
        regPlanSupplierId(CK_LE, planSupplierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of planSupplierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planSupplierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanSupplierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanSupplierId(), "PLAN_SUPPLIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierIdList The collection of planSupplierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierId_InScope(Collection<Long> planSupplierIdList) {
        doSetPlanSupplierId_InScope(planSupplierIdList);
    }

    protected void doSetPlanSupplierId_InScope(Collection<Long> planSupplierIdList) {
        regINS(CK_INS, cTL(planSupplierIdList), xgetCValuePlanSupplierId(), "PLAN_SUPPLIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planSupplierIdList The collection of planSupplierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierId_NotInScope(Collection<Long> planSupplierIdList) {
        doSetPlanSupplierId_NotInScope(planSupplierIdList);
    }

    protected void doSetPlanSupplierId_NotInScope(Collection<Long> planSupplierIdList) {
        regINS(CK_NINS, cTL(planSupplierIdList), xgetCValuePlanSupplierId(), "PLAN_SUPPLIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PLAN_SUPPLIER_ID from m_customer where ...)} <br />
     * m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @param subCBLambda The callback for sub-query of MCustomerByPlanSupplierId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerByPlanSupplierId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_SUPPLIER_ID", "CUSTOMER_ID", pp, "mCustomerByPlanSupplierId", false);
    }
    public abstract String keepPlanSupplierId_InScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PLAN_SUPPLIER_ID from m_customer where ...)} <br />
     * m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @param subCBLambda The callback for sub-query of MCustomerByPlanSupplierId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerByPlanSupplierId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_SUPPLIER_ID", "CUSTOMER_ID", pp, "mCustomerByPlanSupplierId", true);
    }
    public abstract String keepPlanSupplierId_NotInScopeRelation_MCustomerByPlanSupplierId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setPlanSupplierId_IsNull() { regPlanSupplierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setPlanSupplierId_IsNotNull() { regPlanSupplierId(CK_ISNN, DOBJ); }

    protected void regPlanSupplierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanSupplierId(), "PLAN_SUPPLIER_ID"); }
    protected abstract ConditionValue xgetCValuePlanSupplierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_Equal(String planSupplierCd) {
        doSetPlanSupplierCd_Equal(fRES(planSupplierCd));
    }

    protected void doSetPlanSupplierCd_Equal(String planSupplierCd) {
        regPlanSupplierCd(CK_EQ, planSupplierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_NotEqual(String planSupplierCd) {
        doSetPlanSupplierCd_NotEqual(fRES(planSupplierCd));
    }

    protected void doSetPlanSupplierCd_NotEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_NES, planSupplierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_GreaterThan(String planSupplierCd) {
        regPlanSupplierCd(CK_GT, fRES(planSupplierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_LessThan(String planSupplierCd) {
        regPlanSupplierCd(CK_LT, fRES(planSupplierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_GreaterEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_GE, fRES(planSupplierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_LessEqual(String planSupplierCd) {
        regPlanSupplierCd(CK_LE, fRES(planSupplierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCdList The collection of planSupplierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_InScope(Collection<String> planSupplierCdList) {
        doSetPlanSupplierCd_InScope(planSupplierCdList);
    }

    protected void doSetPlanSupplierCd_InScope(Collection<String> planSupplierCdList) {
        regINS(CK_INS, cTL(planSupplierCdList), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCdList The collection of planSupplierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_NotInScope(Collection<String> planSupplierCdList) {
        doSetPlanSupplierCd_NotInScope(planSupplierCdList);
    }

    protected void doSetPlanSupplierCd_NotInScope(Collection<String> planSupplierCdList) {
        regINS(CK_NINS, cTL(planSupplierCdList), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPlanSupplierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planSupplierCd The value of planSupplierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanSupplierCd_LikeSearch(String planSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planSupplierCd), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanSupplierCd_NotLikeSearch(String planSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planSupplierCd), xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     * @param planSupplierCd The value of planSupplierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanSupplierCd_PrefixSearch(String planSupplierCd) {
        setPlanSupplierCd_LikeSearch(planSupplierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     */
    public void setPlanSupplierCd_IsNull() { regPlanSupplierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     */
    public void setPlanSupplierCd_IsNullOrEmpty() { regPlanSupplierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_SUPPLIER_CD: {IX, VARCHAR(30)}
     */
    public void setPlanSupplierCd_IsNotNull() { regPlanSupplierCd(CK_ISNN, DOBJ); }

    protected void regPlanSupplierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanSupplierCd(), "PLAN_SUPPLIER_CD"); }
    protected abstract ConditionValue xgetCValuePlanSupplierCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_Equal(Long planDepositId) {
        doSetPlanDepositId_Equal(planDepositId);
    }

    protected void doSetPlanDepositId_Equal(Long planDepositId) {
        regPlanDepositId(CK_EQ, planDepositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_NotEqual(Long planDepositId) {
        doSetPlanDepositId_NotEqual(planDepositId);
    }

    protected void doSetPlanDepositId_NotEqual(Long planDepositId) {
        regPlanDepositId(CK_NES, planDepositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_GreaterThan(Long planDepositId) {
        regPlanDepositId(CK_GT, planDepositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_LessThan(Long planDepositId) {
        regPlanDepositId(CK_LT, planDepositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_GreaterEqual(Long planDepositId) {
        regPlanDepositId(CK_GE, planDepositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositId The value of planDepositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanDepositId_LessEqual(Long planDepositId) {
        regPlanDepositId(CK_LE, planDepositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of planDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanDepositId(), "PLAN_DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositIdList The collection of planDepositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositId_InScope(Collection<Long> planDepositIdList) {
        doSetPlanDepositId_InScope(planDepositIdList);
    }

    protected void doSetPlanDepositId_InScope(Collection<Long> planDepositIdList) {
        regINS(CK_INS, cTL(planDepositIdList), xgetCValuePlanDepositId(), "PLAN_DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param planDepositIdList The collection of planDepositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositId_NotInScope(Collection<Long> planDepositIdList) {
        doSetPlanDepositId_NotInScope(planDepositIdList);
    }

    protected void doSetPlanDepositId_NotInScope(Collection<Long> planDepositIdList) {
        regINS(CK_NINS, cTL(planDepositIdList), xgetCValuePlanDepositId(), "PLAN_DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PLAN_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @param subCBLambda The callback for sub-query of MCustomerByPlanDepositId for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerByPlanDepositId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanDepositId_InScopeRelation_MCustomerByPlanDepositId(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomerByPlanDepositId", false);
    }
    public abstract String keepPlanDepositId_InScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PLAN_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @param subCBLambda The callback for sub-query of MCustomerByPlanDepositId for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerByPlanDepositId(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomerByPlanDepositId", true);
    }
    public abstract String keepPlanDepositId_NotInScopeRelation_MCustomerByPlanDepositId(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setPlanDepositId_IsNull() { regPlanDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setPlanDepositId_IsNotNull() { regPlanDepositId(CK_ISNN, DOBJ); }

    protected void regPlanDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanDepositId(), "PLAN_DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValuePlanDepositId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_Equal(String planDepositCd) {
        doSetPlanDepositCd_Equal(fRES(planDepositCd));
    }

    protected void doSetPlanDepositCd_Equal(String planDepositCd) {
        regPlanDepositCd(CK_EQ, planDepositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_NotEqual(String planDepositCd) {
        doSetPlanDepositCd_NotEqual(fRES(planDepositCd));
    }

    protected void doSetPlanDepositCd_NotEqual(String planDepositCd) {
        regPlanDepositCd(CK_NES, planDepositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_GreaterThan(String planDepositCd) {
        regPlanDepositCd(CK_GT, fRES(planDepositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_LessThan(String planDepositCd) {
        regPlanDepositCd(CK_LT, fRES(planDepositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_GreaterEqual(String planDepositCd) {
        regPlanDepositCd(CK_GE, fRES(planDepositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_LessEqual(String planDepositCd) {
        regPlanDepositCd(CK_LE, fRES(planDepositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCdList The collection of planDepositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_InScope(Collection<String> planDepositCdList) {
        doSetPlanDepositCd_InScope(planDepositCdList);
    }

    protected void doSetPlanDepositCd_InScope(Collection<String> planDepositCdList) {
        regINS(CK_INS, cTL(planDepositCdList), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCdList The collection of planDepositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_NotInScope(Collection<String> planDepositCdList) {
        doSetPlanDepositCd_NotInScope(planDepositCdList);
    }

    protected void doSetPlanDepositCd_NotInScope(Collection<String> planDepositCdList) {
        regINS(CK_NINS, cTL(planDepositCdList), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlanDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planDepositCd The value of planDepositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanDepositCd_LikeSearch(String planDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planDepositCd), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanDepositCd_NotLikeSearch(String planDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planDepositCd), xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     * @param planDepositCd The value of planDepositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanDepositCd_PrefixSearch(String planDepositCd) {
        setPlanDepositCd_LikeSearch(planDepositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setPlanDepositCd_IsNull() { regPlanDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setPlanDepositCd_IsNullOrEmpty() { regPlanDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_DEPOSIT_CD: {VARCHAR(30)}
     */
    public void setPlanDepositCd_IsNotNull() { regPlanDepositCd(CK_ISNN, DOBJ); }

    protected void regPlanDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanDepositCd(), "PLAN_DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValuePlanDepositCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @param receiveStatus The value of receiveStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_Equal(String receiveStatus) {
        doSetReceiveStatus_Equal(fRES(receiveStatus));
    }

    /**
     * Equal(=). As ReceiveStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus cdef) {
        doSetReceiveStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 未入荷
     */
    public void setReceiveStatus_Equal_$01() {
        setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 入荷中
     */
    public void setReceiveStatus_Equal_$02() {
        setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus.$02);
    }

    /**
     * Equal(=). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 入荷済
     */
    public void setReceiveStatus_Equal_$03() {
        setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus.$03);
    }

    /**
     * Equal(=). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: 入荷削除
     */
    public void setReceiveStatus_Equal_$90() {
        setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus.$90);
    }

    /**
     * Equal(=). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setReceiveStatus_Equal_$99() {
        setReceiveStatus_Equal_AsReceiveStatus(CDef.ReceiveStatus.$99);
    }

    protected void doSetReceiveStatus_Equal(String receiveStatus) {
        regReceiveStatus(CK_EQ, receiveStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @param receiveStatus The value of receiveStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_NotEqual(String receiveStatus) {
        doSetReceiveStatus_NotEqual(fRES(receiveStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As ReceiveStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus cdef) {
        doSetReceiveStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 未入荷
     */
    public void setReceiveStatus_NotEqual_$01() {
        setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 入荷中
     */
    public void setReceiveStatus_NotEqual_$02() {
        setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 入荷済
     */
    public void setReceiveStatus_NotEqual_$03() {
        setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus.$03);
    }

    /**
     * NotEqual(&lt;&gt;). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: 入荷削除
     */
    public void setReceiveStatus_NotEqual_$90() {
        setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus.$90);
    }

    /**
     * NotEqual(&lt;&gt;). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setReceiveStatus_NotEqual_$99() {
        setReceiveStatus_NotEqual_AsReceiveStatus(CDef.ReceiveStatus.$99);
    }

    protected void doSetReceiveStatus_NotEqual(String receiveStatus) {
        regReceiveStatus(CK_NES, receiveStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @param receiveStatusList The collection of receiveStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_InScope(Collection<String> receiveStatusList) {
        doSetReceiveStatus_InScope(receiveStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReceiveStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_InScope_AsReceiveStatus(Collection<CDef.ReceiveStatus> cdefList) {
        doSetReceiveStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetReceiveStatus_InScope(Collection<String> receiveStatusList) {
        regINS(CK_INS, cTL(receiveStatusList), xgetCValueReceiveStatus(), "RECEIVE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus}
     * @param receiveStatusList The collection of receiveStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_NotInScope(Collection<String> receiveStatusList) {
        doSetReceiveStatus_NotInScope(receiveStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReceiveStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STATUS: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveStatus} <br>
     * 入荷ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStatus_NotInScope_AsReceiveStatus(Collection<CDef.ReceiveStatus> cdefList) {
        doSetReceiveStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetReceiveStatus_NotInScope(Collection<String> receiveStatusList) {
        regINS(CK_NINS, cTL(receiveStatusList), xgetCValueReceiveStatus(), "RECEIVE_STATUS");
    }

    protected void regReceiveStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveStatus(), "RECEIVE_STATUS"); }
    protected abstract ConditionValue xgetCValueReceiveStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_Equal(String inputType) {
        doSetInputType_Equal(fRES(inputType));
    }

    /**
     * Equal(=). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_Equal_AsInputType(CDef.InputType cdef) {
        doSetInputType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_Equal_$00() {
        setInputType_Equal_AsInputType(CDef.InputType.$00);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_Equal_$10() {
        setInputType_Equal_AsInputType(CDef.InputType.$10);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_Equal_$20() {
        setInputType_Equal_AsInputType(CDef.InputType.$20);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_Equal_$30() {
        setInputType_Equal_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_Equal(String inputType) {
        regInputType(CK_EQ, inputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotEqual(String inputType) {
        doSetInputType_NotEqual(fRES(inputType));
    }

    /**
     * NotEqual(&lt;&gt;). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInputType_NotEqual_AsInputType(CDef.InputType cdef) {
        doSetInputType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 画面入力
     */
    public void setInputType_NotEqual_$00() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: アップロード
     */
    public void setInputType_NotEqual_$10() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: EDI
     */
    public void setInputType_NotEqual_$20() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: HT
     */
    public void setInputType_NotEqual_$30() {
        setInputType_NotEqual_AsInputType(CDef.InputType.$30);
    }

    protected void doSetInputType_NotEqual(String inputType) {
        regInputType(CK_NES, inputType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope(Collection<String> inputTypeList) {
        doSetInputType_InScope(inputTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_InScope(cTStrL(cdefList));
    }

    protected void doSetInputType_InScope(Collection<String> inputTypeList) {
        regINS(CK_INS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope(Collection<String> inputTypeList) {
        doSetInputType_NotInScope(inputTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {NotNull, VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInputType_NotInScope(Collection<String> inputTypeList) {
        regINS(CK_NINS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    protected void regInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputType(), "INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @param receiveDeliveryStatus The value of receiveDeliveryStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_Equal(String receiveDeliveryStatus) {
        doSetReceiveDeliveryStatus_Equal(fRES(receiveDeliveryStatus));
    }

    /**
     * Equal(=). As ReceiveDeliveryStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_Equal_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus cdef) {
        doSetReceiveDeliveryStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 未完
     */
    public void setReceiveDeliveryStatus_Equal_$00() {
        setReceiveDeliveryStatus_Equal_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$00);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 完納
     */
    public void setReceiveDeliveryStatus_Equal_$01() {
        setReceiveDeliveryStatus_Equal_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 分納
     */
    public void setReceiveDeliveryStatus_Equal_$02() {
        setReceiveDeliveryStatus_Equal_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$02);
    }

    /**
     * Equal(=). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 打切り
     */
    public void setReceiveDeliveryStatus_Equal_$09() {
        setReceiveDeliveryStatus_Equal_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$09);
    }

    protected void doSetReceiveDeliveryStatus_Equal(String receiveDeliveryStatus) {
        regReceiveDeliveryStatus(CK_EQ, receiveDeliveryStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @param receiveDeliveryStatus The value of receiveDeliveryStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_NotEqual(String receiveDeliveryStatus) {
        doSetReceiveDeliveryStatus_NotEqual(fRES(receiveDeliveryStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As ReceiveDeliveryStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_NotEqual_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus cdef) {
        doSetReceiveDeliveryStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $00 (00). And OnlyOnceRegistered. <br>
     * $00: 未完
     */
    public void setReceiveDeliveryStatus_NotEqual_$00() {
        setReceiveDeliveryStatus_NotEqual_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$00);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 完納
     */
    public void setReceiveDeliveryStatus_NotEqual_$01() {
        setReceiveDeliveryStatus_NotEqual_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 分納
     */
    public void setReceiveDeliveryStatus_NotEqual_$02() {
        setReceiveDeliveryStatus_NotEqual_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 打切り
     */
    public void setReceiveDeliveryStatus_NotEqual_$09() {
        setReceiveDeliveryStatus_NotEqual_AsReceiveDeliveryStatus(CDef.ReceiveDeliveryStatus.$09);
    }

    protected void doSetReceiveDeliveryStatus_NotEqual(String receiveDeliveryStatus) {
        regReceiveDeliveryStatus(CK_NES, receiveDeliveryStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @param receiveDeliveryStatusList The collection of receiveDeliveryStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_InScope(Collection<String> receiveDeliveryStatusList) {
        doSetReceiveDeliveryStatus_InScope(receiveDeliveryStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As ReceiveDeliveryStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_InScope_AsReceiveDeliveryStatus(Collection<CDef.ReceiveDeliveryStatus> cdefList) {
        doSetReceiveDeliveryStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetReceiveDeliveryStatus_InScope(Collection<String> receiveDeliveryStatusList) {
        regINS(CK_INS, cTL(receiveDeliveryStatusList), xgetCValueReceiveDeliveryStatus(), "RECEIVE_DELIVERY_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     * @param receiveDeliveryStatusList The collection of receiveDeliveryStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_NotInScope(Collection<String> receiveDeliveryStatusList) {
        doSetReceiveDeliveryStatus_NotInScope(receiveDeliveryStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ReceiveDeliveryStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus} <br>
     * 入荷納品ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDeliveryStatus_NotInScope_AsReceiveDeliveryStatus(Collection<CDef.ReceiveDeliveryStatus> cdefList) {
        doSetReceiveDeliveryStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetReceiveDeliveryStatus_NotInScope(Collection<String> receiveDeliveryStatusList) {
        regINS(CK_NINS, cTL(receiveDeliveryStatusList), xgetCValueReceiveDeliveryStatus(), "RECEIVE_DELIVERY_STATUS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     */
    public void setReceiveDeliveryStatus_IsNull() { regReceiveDeliveryStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     */
    public void setReceiveDeliveryStatus_IsNullOrEmpty() { regReceiveDeliveryStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DELIVERY_STATUS: {VARCHAR(30), FK to B_CLASS_DTL, classification=ReceiveDeliveryStatus}
     */
    public void setReceiveDeliveryStatus_IsNotNull() { regReceiveDeliveryStatus(CK_ISNN, DOBJ); }

    protected void regReceiveDeliveryStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDeliveryStatus(), "RECEIVE_DELIVERY_STATUS"); }
    protected abstract ConditionValue xgetCValueReceiveDeliveryStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_Equal(Long oldReceivePlanHId) {
        doSetOldReceivePlanHId_Equal(oldReceivePlanHId);
    }

    protected void doSetOldReceivePlanHId_Equal(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_EQ, oldReceivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_NotEqual(Long oldReceivePlanHId) {
        doSetOldReceivePlanHId_NotEqual(oldReceivePlanHId);
    }

    protected void doSetOldReceivePlanHId_NotEqual(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_NES, oldReceivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_GreaterThan(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_GT, oldReceivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_LessThan(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_LT, oldReceivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_GreaterEqual(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_GE, oldReceivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHId The value of oldReceivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_LessEqual(Long oldReceivePlanHId) {
        regOldReceivePlanHId(CK_LE, oldReceivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param minNumber The min number of oldReceivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oldReceivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOldReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOldReceivePlanHId(), "OLD_RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHIdList The collection of oldReceivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_InScope(Collection<Long> oldReceivePlanHIdList) {
        doSetOldReceivePlanHId_InScope(oldReceivePlanHIdList);
    }

    protected void doSetOldReceivePlanHId_InScope(Collection<Long> oldReceivePlanHIdList) {
        regINS(CK_INS, cTL(oldReceivePlanHIdList), xgetCValueOldReceivePlanHId(), "OLD_RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     * @param oldReceivePlanHIdList The collection of oldReceivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOldReceivePlanHId_NotInScope(Collection<Long> oldReceivePlanHIdList) {
        doSetOldReceivePlanHId_NotInScope(oldReceivePlanHIdList);
    }

    protected void doSetOldReceivePlanHId_NotInScope(Collection<Long> oldReceivePlanHIdList) {
        regINS(CK_NINS, cTL(oldReceivePlanHIdList), xgetCValueOldReceivePlanHId(), "OLD_RECEIVE_PLAN_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select OLD_RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @param subCBLambda The callback for sub-query of TReceivePlanHSelf for 'in-scope'. (NotNull)
     */
    public void inScopeTReceivePlanHSelf(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf(cb.query());
        registerInScopeRelation(cb.query(), "OLD_RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanHSelf", false);
    }
    public abstract String keepOldReceivePlanHId_InScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select OLD_RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @param subCBLambda The callback for sub-query of TReceivePlanHSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeTReceivePlanHSelf(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf(cb.query());
        registerInScopeRelation(cb.query(), "OLD_RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanHSelf", true);
    }
    public abstract String keepOldReceivePlanHId_NotInScopeRelation_TReceivePlanHSelf(TReceivePlanHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     */
    public void setOldReceivePlanHId_IsNull() { regOldReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OLD_RECEIVE_PLAN_H_ID: {IX, BIGINT(19), FK to t_receive_plan_h}
     */
    public void setOldReceivePlanHId_IsNotNull() { regOldReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regOldReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOldReceivePlanHId(), "OLD_RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueOldReceivePlanHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    /**
     * Equal(=). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_Equal_$0() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_Equal_$1() {
        setErrorFlg_Equal_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg cdef) {
        doSetErrorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: エラー無
     */
    public void setErrorFlg_NotEqual_$0() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: エラー有
     */
    public void setErrorFlg_NotEqual_$1() {
        setErrorFlg_NotEqual_AsErrorFlg(CDef.ErrorFlg.$1);
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlg The value of centerTransitFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_Equal(String centerTransitFlg) {
        doSetCenterTransitFlg_Equal(fRES(centerTransitFlg));
    }

    /**
     * Equal(=). As CenterTransitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        doSetCenterTransitFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_Equal_$0() {
        setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_Equal_$1() {
        setCenterTransitFlg_Equal_AsCenterTransitFlg(CDef.CenterTransitFlg.$1);
    }

    protected void doSetCenterTransitFlg_Equal(String centerTransitFlg) {
        regCenterTransitFlg(CK_EQ, centerTransitFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlg The value of centerTransitFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotEqual(String centerTransitFlg) {
        doSetCenterTransitFlg_NotEqual(fRES(centerTransitFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTransitFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg cdef) {
        doSetCenterTransitFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setCenterTransitFlg_NotEqual_$0() {
        setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: センタ間移動
     */
    public void setCenterTransitFlg_NotEqual_$1() {
        setCenterTransitFlg_NotEqual_AsCenterTransitFlg(CDef.CenterTransitFlg.$1);
    }

    protected void doSetCenterTransitFlg_NotEqual(String centerTransitFlg) {
        regCenterTransitFlg(CK_NES, centerTransitFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlgList The collection of centerTransitFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_InScope(Collection<String> centerTransitFlgList) {
        doSetCenterTransitFlg_InScope(centerTransitFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTransitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_InScope_AsCenterTransitFlg(Collection<CDef.CenterTransitFlg> cdefList) {
        doSetCenterTransitFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCenterTransitFlg_InScope(Collection<String> centerTransitFlgList) {
        regINS(CK_INS, cTL(centerTransitFlgList), xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     * @param centerTransitFlgList The collection of centerTransitFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotInScope(Collection<String> centerTransitFlgList) {
        doSetCenterTransitFlg_NotInScope(centerTransitFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTransitFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg} <br>
     * センタ間移動フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterTransitFlg_NotInScope_AsCenterTransitFlg(Collection<CDef.CenterTransitFlg> cdefList) {
        doSetCenterTransitFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCenterTransitFlg_NotInScope(Collection<String> centerTransitFlgList) {
        regINS(CK_NINS, cTL(centerTransitFlgList), xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNull() { regCenterTransitFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNullOrEmpty() { regCenterTransitFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_TRANSIT_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=CenterTransitFlg}
     */
    public void setCenterTransitFlg_IsNotNull() { regCenterTransitFlg(CK_ISNN, DOBJ); }

    protected void regCenterTransitFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterTransitFlg(), "CENTER_TRANSIT_FLG"); }
    protected abstract ConditionValue xgetCValueCenterTransitFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
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
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     */
    public void setPickingHId_IsNull() { regPickingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, BIGINT(19), FK to t_picking_h}
     */
    public void setPickingHId_IsNotNull() { regPickingHId(CK_ISNN, DOBJ); }

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_Equal(String sapReceiveSlipNo) {
        doSetSapReceiveSlipNo_Equal(fRES(sapReceiveSlipNo));
    }

    protected void doSetSapReceiveSlipNo_Equal(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_EQ, sapReceiveSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_NotEqual(String sapReceiveSlipNo) {
        doSetSapReceiveSlipNo_NotEqual(fRES(sapReceiveSlipNo));
    }

    protected void doSetSapReceiveSlipNo_NotEqual(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_NES, sapReceiveSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_GreaterThan(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_GT, fRES(sapReceiveSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_LessThan(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_LT, fRES(sapReceiveSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_GreaterEqual(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_GE, fRES(sapReceiveSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_LessEqual(String sapReceiveSlipNo) {
        regSapReceiveSlipNo(CK_LE, fRES(sapReceiveSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNoList The collection of sapReceiveSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_InScope(Collection<String> sapReceiveSlipNoList) {
        doSetSapReceiveSlipNo_InScope(sapReceiveSlipNoList);
    }

    protected void doSetSapReceiveSlipNo_InScope(Collection<String> sapReceiveSlipNoList) {
        regINS(CK_INS, cTL(sapReceiveSlipNoList), xgetCValueSapReceiveSlipNo(), "SAP_RECEIVE_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNoList The collection of sapReceiveSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_NotInScope(Collection<String> sapReceiveSlipNoList) {
        doSetSapReceiveSlipNo_NotInScope(sapReceiveSlipNoList);
    }

    protected void doSetSapReceiveSlipNo_NotInScope(Collection<String> sapReceiveSlipNoList) {
        regINS(CK_NINS, cTL(sapReceiveSlipNoList), xgetCValueSapReceiveSlipNo(), "SAP_RECEIVE_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSapReceiveSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapReceiveSlipNo_LikeSearch(String sapReceiveSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapReceiveSlipNo), xgetCValueSapReceiveSlipNo(), "SAP_RECEIVE_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapReceiveSlipNo_NotLikeSearch(String sapReceiveSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapReceiveSlipNo), xgetCValueSapReceiveSlipNo(), "SAP_RECEIVE_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     * @param sapReceiveSlipNo The value of sapReceiveSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapReceiveSlipNo_PrefixSearch(String sapReceiveSlipNo) {
        setSapReceiveSlipNo_LikeSearch(sapReceiveSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     */
    public void setSapReceiveSlipNo_IsNull() { regSapReceiveSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     */
    public void setSapReceiveSlipNo_IsNullOrEmpty() { regSapReceiveSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_RECEIVE_SLIP_NO: {VARCHAR(30)}
     */
    public void setSapReceiveSlipNo_IsNotNull() { regSapReceiveSlipNo(CK_ISNN, DOBJ); }

    protected void regSapReceiveSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapReceiveSlipNo(), "SAP_RECEIVE_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSapReceiveSlipNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_Equal(Long slipTypeId) {
        doSetSlipTypeId_Equal(slipTypeId);
    }

    protected void doSetSlipTypeId_Equal(Long slipTypeId) {
        regSlipTypeId(CK_EQ, slipTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_NotEqual(Long slipTypeId) {
        doSetSlipTypeId_NotEqual(slipTypeId);
    }

    protected void doSetSlipTypeId_NotEqual(Long slipTypeId) {
        regSlipTypeId(CK_NES, slipTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_GreaterThan(Long slipTypeId) {
        regSlipTypeId(CK_GT, slipTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_LessThan(Long slipTypeId) {
        regSlipTypeId(CK_LT, slipTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_GreaterEqual(Long slipTypeId) {
        regSlipTypeId(CK_GE, slipTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeId The value of slipTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipTypeId_LessEqual(Long slipTypeId) {
        regSlipTypeId(CK_LE, slipTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of slipTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slipTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlipTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipTypeId(), "SLIP_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeIdList The collection of slipTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeId_InScope(Collection<Long> slipTypeIdList) {
        doSetSlipTypeId_InScope(slipTypeIdList);
    }

    protected void doSetSlipTypeId_InScope(Collection<Long> slipTypeIdList) {
        regINS(CK_INS, cTL(slipTypeIdList), xgetCValueSlipTypeId(), "SLIP_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     * @param slipTypeIdList The collection of slipTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeId_NotInScope(Collection<Long> slipTypeIdList) {
        doSetSlipTypeId_NotInScope(slipTypeIdList);
    }

    protected void doSetSlipTypeId_NotInScope(Collection<Long> slipTypeIdList) {
        regINS(CK_NINS, cTL(slipTypeIdList), xgetCValueSlipTypeId(), "SLIP_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     */
    public void setSlipTypeId_IsNull() { regSlipTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_ID: {BIGINT(19)}
     */
    public void setSlipTypeId_IsNotNull() { regSlipTypeId(CK_ISNN, DOBJ); }

    protected void regSlipTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipTypeId(), "SLIP_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueSlipTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_Equal(String slipTypeCd) {
        doSetSlipTypeCd_Equal(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_Equal(String slipTypeCd) {
        regSlipTypeCd(CK_EQ, slipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotEqual(String slipTypeCd) {
        doSetSlipTypeCd_NotEqual(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_NotEqual(String slipTypeCd) {
        regSlipTypeCd(CK_NES, slipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterThan(String slipTypeCd) {
        regSlipTypeCd(CK_GT, fRES(slipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessThan(String slipTypeCd) {
        regSlipTypeCd(CK_LT, fRES(slipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterEqual(String slipTypeCd) {
        regSlipTypeCd(CK_GE, fRES(slipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessEqual(String slipTypeCd) {
        regSlipTypeCd(CK_LE, fRES(slipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_InScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        regINS(CK_INS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_NotInScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        regINS(CK_NINS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipTypeCd The value of slipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipTypeCd_LikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipTypeCd_NotLikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_PrefixSearch(String slipTypeCd) {
        setSlipTypeCd_LikeSearch(slipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNull() { regSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNullOrEmpty() { regSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNotNull() { regSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipTypeCd(), "SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_Equal(String purchaseOrderNo) {
        doSetPurchaseOrderNo_Equal(fRES(purchaseOrderNo));
    }

    protected void doSetPurchaseOrderNo_Equal(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_EQ, purchaseOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_NotEqual(String purchaseOrderNo) {
        doSetPurchaseOrderNo_NotEqual(fRES(purchaseOrderNo));
    }

    protected void doSetPurchaseOrderNo_NotEqual(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_NES, purchaseOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_GreaterThan(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_GT, fRES(purchaseOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_LessThan(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_LT, fRES(purchaseOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_GreaterEqual(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_GE, fRES(purchaseOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_LessEqual(String purchaseOrderNo) {
        regPurchaseOrderNo(CK_LE, fRES(purchaseOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNoList The collection of purchaseOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_InScope(Collection<String> purchaseOrderNoList) {
        doSetPurchaseOrderNo_InScope(purchaseOrderNoList);
    }

    protected void doSetPurchaseOrderNo_InScope(Collection<String> purchaseOrderNoList) {
        regINS(CK_INS, cTL(purchaseOrderNoList), xgetCValuePurchaseOrderNo(), "PURCHASE_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNoList The collection of purchaseOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_NotInScope(Collection<String> purchaseOrderNoList) {
        doSetPurchaseOrderNo_NotInScope(purchaseOrderNoList);
    }

    protected void doSetPurchaseOrderNo_NotInScope(Collection<String> purchaseOrderNoList) {
        regINS(CK_NINS, cTL(purchaseOrderNoList), xgetCValuePurchaseOrderNo(), "PURCHASE_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPurchaseOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseOrderNo The value of purchaseOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseOrderNo_LikeSearch(String purchaseOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseOrderNo), xgetCValuePurchaseOrderNo(), "PURCHASE_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseOrderNo_NotLikeSearch(String purchaseOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseOrderNo), xgetCValuePurchaseOrderNo(), "PURCHASE_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     * @param purchaseOrderNo The value of purchaseOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrderNo_PrefixSearch(String purchaseOrderNo) {
        setPurchaseOrderNo_LikeSearch(purchaseOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     */
    public void setPurchaseOrderNo_IsNull() { regPurchaseOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     */
    public void setPurchaseOrderNo_IsNullOrEmpty() { regPurchaseOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORDER_NO: {VARCHAR(30)}
     */
    public void setPurchaseOrderNo_IsNotNull() { regPurchaseOrderNo(CK_ISNN, DOBJ); }

    protected void regPurchaseOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseOrderNo(), "PURCHASE_ORDER_NO"); }
    protected abstract ConditionValue xgetCValuePurchaseOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_Equal(String receiveReasonCd) {
        doSetReceiveReasonCd_Equal(fRES(receiveReasonCd));
    }

    protected void doSetReceiveReasonCd_Equal(String receiveReasonCd) {
        regReceiveReasonCd(CK_EQ, receiveReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_NotEqual(String receiveReasonCd) {
        doSetReceiveReasonCd_NotEqual(fRES(receiveReasonCd));
    }

    protected void doSetReceiveReasonCd_NotEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_NES, receiveReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_GreaterThan(String receiveReasonCd) {
        regReceiveReasonCd(CK_GT, fRES(receiveReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_LessThan(String receiveReasonCd) {
        regReceiveReasonCd(CK_LT, fRES(receiveReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_GreaterEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_GE, fRES(receiveReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_LessEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_LE, fRES(receiveReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCdList The collection of receiveReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_InScope(Collection<String> receiveReasonCdList) {
        doSetReceiveReasonCd_InScope(receiveReasonCdList);
    }

    protected void doSetReceiveReasonCd_InScope(Collection<String> receiveReasonCdList) {
        regINS(CK_INS, cTL(receiveReasonCdList), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCdList The collection of receiveReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_NotInScope(Collection<String> receiveReasonCdList) {
        doSetReceiveReasonCd_NotInScope(receiveReasonCdList);
    }

    protected void doSetReceiveReasonCd_NotInScope(Collection<String> receiveReasonCdList) {
        regINS(CK_NINS, cTL(receiveReasonCdList), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)} <br>
     * <pre>e.g. setReceiveReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveReasonCd The value of receiveReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveReasonCd_LikeSearch(String receiveReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveReasonCd), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveReasonCd_NotLikeSearch(String receiveReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveReasonCd), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     * @param receiveReasonCd The value of receiveReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_PrefixSearch(String receiveReasonCd) {
        setReceiveReasonCd_LikeSearch(receiveReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     */
    public void setReceiveReasonCd_IsNull() { regReceiveReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     */
    public void setReceiveReasonCd_IsNullOrEmpty() { regReceiveReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(255)}
     */
    public void setReceiveReasonCd_IsNotNull() { regReceiveReasonCd(CK_ISNN, DOBJ); }

    protected void regReceiveReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD"); }
    protected abstract ConditionValue xgetCValueReceiveReasonCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_Equal(String orderDate) {
        doSetOrderDate_Equal(fRES(orderDate));
    }

    protected void doSetOrderDate_Equal(String orderDate) {
        regOrderDate(CK_EQ, orderDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotEqual(String orderDate) {
        doSetOrderDate_NotEqual(fRES(orderDate));
    }

    protected void doSetOrderDate_NotEqual(String orderDate) {
        regOrderDate(CK_NES, orderDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterThan(String orderDate) {
        regOrderDate(CK_GT, fRES(orderDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessThan(String orderDate) {
        regOrderDate(CK_LT, fRES(orderDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterEqual(String orderDate) {
        regOrderDate(CK_GE, fRES(orderDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessEqual(String orderDate) {
        regOrderDate(CK_LE, fRES(orderDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDateList The collection of orderDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_InScope(Collection<String> orderDateList) {
        doSetOrderDate_InScope(orderDateList);
    }

    protected void doSetOrderDate_InScope(Collection<String> orderDateList) {
        regINS(CK_INS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDateList The collection of orderDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotInScope(Collection<String> orderDateList) {
        doSetOrderDate_NotInScope(orderDateList);
    }

    protected void doSetOrderDate_NotInScope(Collection<String> orderDateList) {
        regINS(CK_NINS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)} <br>
     * <pre>e.g. setOrderDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDate The value of orderDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDate_LikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDate_NotLikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     * @param orderDate The value of orderDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_PrefixSearch(String orderDate) {
        setOrderDate_LikeSearch(orderDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     */
    public void setOrderDate_IsNull() { regOrderDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     */
    public void setOrderDate_IsNullOrEmpty() { regOrderDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(8)}
     */
    public void setOrderDate_IsNotNull() { regOrderDate(CK_ISNN, DOBJ); }

    protected void regOrderDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDate(), "ORDER_DATE"); }
    protected abstract ConditionValue xgetCValueOrderDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_Equal(String orderTime) {
        doSetOrderTime_Equal(fRES(orderTime));
    }

    protected void doSetOrderTime_Equal(String orderTime) {
        regOrderTime(CK_EQ, orderTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotEqual(String orderTime) {
        doSetOrderTime_NotEqual(fRES(orderTime));
    }

    protected void doSetOrderTime_NotEqual(String orderTime) {
        regOrderTime(CK_NES, orderTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterThan(String orderTime) {
        regOrderTime(CK_GT, fRES(orderTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessThan(String orderTime) {
        regOrderTime(CK_LT, fRES(orderTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterEqual(String orderTime) {
        regOrderTime(CK_GE, fRES(orderTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessEqual(String orderTime) {
        regOrderTime(CK_LE, fRES(orderTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTimeList The collection of orderTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_InScope(Collection<String> orderTimeList) {
        doSetOrderTime_InScope(orderTimeList);
    }

    protected void doSetOrderTime_InScope(Collection<String> orderTimeList) {
        regINS(CK_INS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTimeList The collection of orderTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotInScope(Collection<String> orderTimeList) {
        doSetOrderTime_NotInScope(orderTimeList);
    }

    protected void doSetOrderTime_NotInScope(Collection<String> orderTimeList) {
        regINS(CK_NINS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)} <br>
     * <pre>e.g. setOrderTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTime The value of orderTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTime_LikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTime_NotLikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     * @param orderTime The value of orderTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_PrefixSearch(String orderTime) {
        setOrderTime_LikeSearch(orderTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     */
    public void setOrderTime_IsNull() { regOrderTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     */
    public void setOrderTime_IsNullOrEmpty() { regOrderTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(6)}
     */
    public void setOrderTime_IsNotNull() { regOrderTime(CK_ISNN, DOBJ); }

    protected void regOrderTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTime(), "ORDER_TIME"); }
    protected abstract ConditionValue xgetCValueOrderTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_Equal(String confirmedDeliveryDt) {
        doSetConfirmedDeliveryDt_Equal(fRES(confirmedDeliveryDt));
    }

    protected void doSetConfirmedDeliveryDt_Equal(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_EQ, confirmedDeliveryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_NotEqual(String confirmedDeliveryDt) {
        doSetConfirmedDeliveryDt_NotEqual(fRES(confirmedDeliveryDt));
    }

    protected void doSetConfirmedDeliveryDt_NotEqual(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_NES, confirmedDeliveryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_GreaterThan(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_GT, fRES(confirmedDeliveryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_LessThan(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_LT, fRES(confirmedDeliveryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_GreaterEqual(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_GE, fRES(confirmedDeliveryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_LessEqual(String confirmedDeliveryDt) {
        regConfirmedDeliveryDt(CK_LE, fRES(confirmedDeliveryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDtList The collection of confirmedDeliveryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_InScope(Collection<String> confirmedDeliveryDtList) {
        doSetConfirmedDeliveryDt_InScope(confirmedDeliveryDtList);
    }

    protected void doSetConfirmedDeliveryDt_InScope(Collection<String> confirmedDeliveryDtList) {
        regINS(CK_INS, cTL(confirmedDeliveryDtList), xgetCValueConfirmedDeliveryDt(), "CONFIRMED_DELIVERY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDtList The collection of confirmedDeliveryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_NotInScope(Collection<String> confirmedDeliveryDtList) {
        doSetConfirmedDeliveryDt_NotInScope(confirmedDeliveryDtList);
    }

    protected void doSetConfirmedDeliveryDt_NotInScope(Collection<String> confirmedDeliveryDtList) {
        regINS(CK_NINS, cTL(confirmedDeliveryDtList), xgetCValueConfirmedDeliveryDt(), "CONFIRMED_DELIVERY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setConfirmedDeliveryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConfirmedDeliveryDt_LikeSearch(String confirmedDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(confirmedDeliveryDt), xgetCValueConfirmedDeliveryDt(), "CONFIRMED_DELIVERY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConfirmedDeliveryDt_NotLikeSearch(String confirmedDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(confirmedDeliveryDt), xgetCValueConfirmedDeliveryDt(), "CONFIRMED_DELIVERY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     * @param confirmedDeliveryDt The value of confirmedDeliveryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDt_PrefixSearch(String confirmedDeliveryDt) {
        setConfirmedDeliveryDt_LikeSearch(confirmedDeliveryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setConfirmedDeliveryDt_IsNull() { regConfirmedDeliveryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setConfirmedDeliveryDt_IsNullOrEmpty() { regConfirmedDeliveryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DT: {VARCHAR(8)}
     */
    public void setConfirmedDeliveryDt_IsNotNull() { regConfirmedDeliveryDt(CK_ISNN, DOBJ); }

    protected void regConfirmedDeliveryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfirmedDeliveryDt(), "CONFIRMED_DELIVERY_DT"); }
    protected abstract ConditionValue xgetCValueConfirmedDeliveryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_Equal(String plantCd) {
        doSetPlantCd_Equal(fRES(plantCd));
    }

    protected void doSetPlantCd_Equal(String plantCd) {
        regPlantCd(CK_EQ, plantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotEqual(String plantCd) {
        doSetPlantCd_NotEqual(fRES(plantCd));
    }

    protected void doSetPlantCd_NotEqual(String plantCd) {
        regPlantCd(CK_NES, plantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterThan(String plantCd) {
        regPlantCd(CK_GT, fRES(plantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessThan(String plantCd) {
        regPlantCd(CK_LT, fRES(plantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterEqual(String plantCd) {
        regPlantCd(CK_GE, fRES(plantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessEqual(String plantCd) {
        regPlantCd(CK_LE, fRES(plantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_InScope(Collection<String> plantCdList) {
        doSetPlantCd_InScope(plantCdList);
    }

    protected void doSetPlantCd_InScope(Collection<String> plantCdList) {
        regINS(CK_INS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotInScope(Collection<String> plantCdList) {
        doSetPlantCd_NotInScope(plantCdList);
    }

    protected void doSetPlantCd_NotInScope(Collection<String> plantCdList) {
        regINS(CK_NINS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantCd The value of plantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantCd_LikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantCd_NotLikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_PrefixSearch(String plantCd) {
        setPlantCd_LikeSearch(plantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNull() { regPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNullOrEmpty() { regPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNotNull() { regPlantCd(CK_ISNN, DOBJ); }

    protected void regPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantCd(), "PLANT_CD"); }
    protected abstract ConditionValue xgetCValuePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_Equal(String storageSpaceCd) {
        doSetStorageSpaceCd_Equal(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_Equal(String storageSpaceCd) {
        regStorageSpaceCd(CK_EQ, storageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotEqual(String storageSpaceCd) {
        doSetStorageSpaceCd_NotEqual(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_NotEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_NES, storageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_GT, fRES(storageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_LT, fRES(storageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_GE, fRES(storageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_LE, fRES(storageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_InScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        regINS(CK_INS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_NotInScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        regINS(CK_NINS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceCd The value of storageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceCd_LikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceCd_NotLikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_PrefixSearch(String storageSpaceCd) {
        setStorageSpaceCd_LikeSearch(storageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNull() { regStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNullOrEmpty() { regStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNotNull() { regStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_Equal(String tenhanshaCd) {
        doSetTenhanshaCd_Equal(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_Equal(String tenhanshaCd) {
        regTenhanshaCd(CK_EQ, tenhanshaCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotEqual(String tenhanshaCd) {
        doSetTenhanshaCd_NotEqual(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_NotEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_NES, tenhanshaCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterThan(String tenhanshaCd) {
        regTenhanshaCd(CK_GT, fRES(tenhanshaCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessThan(String tenhanshaCd) {
        regTenhanshaCd(CK_LT, fRES(tenhanshaCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_GE, fRES(tenhanshaCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_LE, fRES(tenhanshaCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_InScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        regINS(CK_INS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_NotInScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        regINS(CK_NINS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaCd The value of tenhanshaCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaCd_LikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaCd_NotLikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_PrefixSearch(String tenhanshaCd) {
        setTenhanshaCd_LikeSearch(tenhanshaCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNull() { regTenhanshaCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNullOrEmpty() { regTenhanshaCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNotNull() { regTenhanshaCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaCd(), "TENHANSHA_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_Equal(Long salesOrgId) {
        doSetSalesOrgId_Equal(salesOrgId);
    }

    protected void doSetSalesOrgId_Equal(Long salesOrgId) {
        regSalesOrgId(CK_EQ, salesOrgId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotEqual(Long salesOrgId) {
        doSetSalesOrgId_NotEqual(salesOrgId);
    }

    protected void doSetSalesOrgId_NotEqual(Long salesOrgId) {
        regSalesOrgId(CK_NES, salesOrgId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterThan(Long salesOrgId) {
        regSalesOrgId(CK_GT, salesOrgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessThan(Long salesOrgId) {
        regSalesOrgId(CK_LT, salesOrgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterEqual(Long salesOrgId) {
        regSalesOrgId(CK_GE, salesOrgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessEqual(Long salesOrgId) {
        regSalesOrgId(CK_LE, salesOrgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param minNumber The min number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrgId(), "SALES_ORG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgIdList The collection of salesOrgId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_InScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        regINS(CK_INS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgIdList The collection of salesOrgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_NotInScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        regINS(CK_NINS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     */
    public void setSalesOrgId_IsNull() { regSalesOrgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     */
    public void setSalesOrgId_IsNotNull() { regSalesOrgId(CK_ISNN, DOBJ); }

    protected void regSalesOrgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgId(), "SALES_ORG_ID"); }
    protected abstract ConditionValue xgetCValueSalesOrgId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_Equal(String salesOrgCd) {
        doSetSalesOrgCd_Equal(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_Equal(String salesOrgCd) {
        regSalesOrgCd(CK_EQ, salesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotEqual(String salesOrgCd) {
        doSetSalesOrgCd_NotEqual(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_NotEqual(String salesOrgCd) {
        regSalesOrgCd(CK_NES, salesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_InScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        regINS(CK_INS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_NotInScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        regINS(CK_NINS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrgCd The value of salesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrgCd_LikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_Equal(String tenhanshaNm1) {
        doSetTenhanshaNm1_Equal(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_Equal(String tenhanshaNm1) {
        regTenhanshaNm1(CK_EQ, tenhanshaNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        doSetTenhanshaNm1_NotEqual(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_NES, tenhanshaNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GT, fRES(tenhanshaNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LT, fRES(tenhanshaNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GE, fRES(tenhanshaNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LE, fRES(tenhanshaNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_InScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_INS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_NotInScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_NINS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm1 The value of tenhanshaNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm1_LikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm1_NotLikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_PrefixSearch(String tenhanshaNm1) {
        setTenhanshaNm1_LikeSearch(tenhanshaNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNull() { regTenhanshaNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNullOrEmpty() { regTenhanshaNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNotNull() { regTenhanshaNm1(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm1(), "TENHANSHA_NM1"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_Equal(String tenhanshaNm2) {
        doSetTenhanshaNm2_Equal(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_Equal(String tenhanshaNm2) {
        regTenhanshaNm2(CK_EQ, tenhanshaNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        doSetTenhanshaNm2_NotEqual(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_NES, tenhanshaNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GT, fRES(tenhanshaNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LT, fRES(tenhanshaNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GE, fRES(tenhanshaNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LE, fRES(tenhanshaNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_InScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_INS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_NotInScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_NINS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm2 The value of tenhanshaNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm2_LikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm2_NotLikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_PrefixSearch(String tenhanshaNm2) {
        setTenhanshaNm2_LikeSearch(tenhanshaNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNull() { regTenhanshaNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNullOrEmpty() { regTenhanshaNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNotNull() { regTenhanshaNm2(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm2(), "TENHANSHA_NM2"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_Equal(String sapUserCd) {
        doSetSapUserCd_Equal(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_Equal(String sapUserCd) {
        regSapUserCd(CK_EQ, sapUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotEqual(String sapUserCd) {
        doSetSapUserCd_NotEqual(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_NotEqual(String sapUserCd) {
        regSapUserCd(CK_NES, sapUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterThan(String sapUserCd) {
        regSapUserCd(CK_GT, fRES(sapUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessThan(String sapUserCd) {
        regSapUserCd(CK_LT, fRES(sapUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterEqual(String sapUserCd) {
        regSapUserCd(CK_GE, fRES(sapUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessEqual(String sapUserCd) {
        regSapUserCd(CK_LE, fRES(sapUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_InScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_InScope(sapUserCdList);
    }

    protected void doSetSapUserCd_InScope(Collection<String> sapUserCdList) {
        regINS(CK_INS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_NotInScope(sapUserCdList);
    }

    protected void doSetSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        regINS(CK_NINS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserCd The value of sapUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserCd_LikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserCd_NotLikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_PrefixSearch(String sapUserCd) {
        setSapUserCd_LikeSearch(sapUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNull() { regSapUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNullOrEmpty() { regSapUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNotNull() { regSapUserCd(CK_ISNN, DOBJ); }

    protected void regSapUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserCd(), "SAP_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_Equal(String sapUserNm) {
        doSetSapUserNm_Equal(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_Equal(String sapUserNm) {
        regSapUserNm(CK_EQ, sapUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotEqual(String sapUserNm) {
        doSetSapUserNm_NotEqual(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_NotEqual(String sapUserNm) {
        regSapUserNm(CK_NES, sapUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterThan(String sapUserNm) {
        regSapUserNm(CK_GT, fRES(sapUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessThan(String sapUserNm) {
        regSapUserNm(CK_LT, fRES(sapUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterEqual(String sapUserNm) {
        regSapUserNm(CK_GE, fRES(sapUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessEqual(String sapUserNm) {
        regSapUserNm(CK_LE, fRES(sapUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_InScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_InScope(sapUserNmList);
    }

    protected void doSetSapUserNm_InScope(Collection<String> sapUserNmList) {
        regINS(CK_INS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_NotInScope(sapUserNmList);
    }

    protected void doSetSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        regINS(CK_NINS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setSapUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserNm The value of sapUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserNm_LikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserNm_NotLikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_PrefixSearch(String sapUserNm) {
        setSapUserNm_LikeSearch(sapUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNull() { regSapUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNullOrEmpty() { regSapUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNotNull() { regSapUserNm(CK_ISNN, DOBJ); }

    protected void regSapUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserNm(), "SAP_USER_NM"); }
    protected abstract ConditionValue xgetCValueSapUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_Equal(String customerOrderNo) {
        doSetCustomerOrderNo_Equal(fRES(customerOrderNo));
    }

    protected void doSetCustomerOrderNo_Equal(String customerOrderNo) {
        regCustomerOrderNo(CK_EQ, customerOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_NotEqual(String customerOrderNo) {
        doSetCustomerOrderNo_NotEqual(fRES(customerOrderNo));
    }

    protected void doSetCustomerOrderNo_NotEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_NES, customerOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_GreaterThan(String customerOrderNo) {
        regCustomerOrderNo(CK_GT, fRES(customerOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_LessThan(String customerOrderNo) {
        regCustomerOrderNo(CK_LT, fRES(customerOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_GreaterEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_GE, fRES(customerOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_LessEqual(String customerOrderNo) {
        regCustomerOrderNo(CK_LE, fRES(customerOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNoList The collection of customerOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_InScope(Collection<String> customerOrderNoList) {
        doSetCustomerOrderNo_InScope(customerOrderNoList);
    }

    protected void doSetCustomerOrderNo_InScope(Collection<String> customerOrderNoList) {
        regINS(CK_INS, cTL(customerOrderNoList), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNoList The collection of customerOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_NotInScope(Collection<String> customerOrderNoList) {
        doSetCustomerOrderNo_NotInScope(customerOrderNoList);
    }

    protected void doSetCustomerOrderNo_NotInScope(Collection<String> customerOrderNoList) {
        regINS(CK_NINS, cTL(customerOrderNoList), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)} <br>
     * <pre>e.g. setCustomerOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerOrderNo The value of customerOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerOrderNo_LikeSearch(String customerOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerOrderNo), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerOrderNo_NotLikeSearch(String customerOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerOrderNo), xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     * @param customerOrderNo The value of customerOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerOrderNo_PrefixSearch(String customerOrderNo) {
        setCustomerOrderNo_LikeSearch(customerOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     */
    public void setCustomerOrderNo_IsNull() { regCustomerOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     */
    public void setCustomerOrderNo_IsNullOrEmpty() { regCustomerOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ORDER_NO: {VARCHAR(100)}
     */
    public void setCustomerOrderNo_IsNotNull() { regCustomerOrderNo(CK_ISNN, DOBJ); }

    protected void regCustomerOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerOrderNo(), "CUSTOMER_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueCustomerOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_Equal(String sapVenderCd) {
        doSetSapVenderCd_Equal(fRES(sapVenderCd));
    }

    protected void doSetSapVenderCd_Equal(String sapVenderCd) {
        regSapVenderCd(CK_EQ, sapVenderCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_NotEqual(String sapVenderCd) {
        doSetSapVenderCd_NotEqual(fRES(sapVenderCd));
    }

    protected void doSetSapVenderCd_NotEqual(String sapVenderCd) {
        regSapVenderCd(CK_NES, sapVenderCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_GreaterThan(String sapVenderCd) {
        regSapVenderCd(CK_GT, fRES(sapVenderCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_LessThan(String sapVenderCd) {
        regSapVenderCd(CK_LT, fRES(sapVenderCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_GreaterEqual(String sapVenderCd) {
        regSapVenderCd(CK_GE, fRES(sapVenderCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_LessEqual(String sapVenderCd) {
        regSapVenderCd(CK_LE, fRES(sapVenderCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCdList The collection of sapVenderCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_InScope(Collection<String> sapVenderCdList) {
        doSetSapVenderCd_InScope(sapVenderCdList);
    }

    protected void doSetSapVenderCd_InScope(Collection<String> sapVenderCdList) {
        regINS(CK_INS, cTL(sapVenderCdList), xgetCValueSapVenderCd(), "SAP_VENDER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCdList The collection of sapVenderCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_NotInScope(Collection<String> sapVenderCdList) {
        doSetSapVenderCd_NotInScope(sapVenderCdList);
    }

    protected void doSetSapVenderCd_NotInScope(Collection<String> sapVenderCdList) {
        regINS(CK_NINS, cTL(sapVenderCdList), xgetCValueSapVenderCd(), "SAP_VENDER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapVenderCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapVenderCd The value of sapVenderCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapVenderCd_LikeSearch(String sapVenderCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapVenderCd), xgetCValueSapVenderCd(), "SAP_VENDER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapVenderCd_NotLikeSearch(String sapVenderCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapVenderCd), xgetCValueSapVenderCd(), "SAP_VENDER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_PrefixSearch(String sapVenderCd) {
        setSapVenderCd_LikeSearch(sapVenderCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNull() { regSapVenderCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNullOrEmpty() { regSapVenderCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNotNull() { regSapVenderCd(CK_ISNN, DOBJ); }

    protected void regSapVenderCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapVenderCd(), "SAP_VENDER_CD"); }
    protected abstract ConditionValue xgetCValueSapVenderCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_Equal(String sapSupplierCd) {
        doSetSapSupplierCd_Equal(fRES(sapSupplierCd));
    }

    protected void doSetSapSupplierCd_Equal(String sapSupplierCd) {
        regSapSupplierCd(CK_EQ, sapSupplierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_NotEqual(String sapSupplierCd) {
        doSetSapSupplierCd_NotEqual(fRES(sapSupplierCd));
    }

    protected void doSetSapSupplierCd_NotEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_NES, sapSupplierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_GreaterThan(String sapSupplierCd) {
        regSapSupplierCd(CK_GT, fRES(sapSupplierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_LessThan(String sapSupplierCd) {
        regSapSupplierCd(CK_LT, fRES(sapSupplierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_GreaterEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_GE, fRES(sapSupplierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_LessEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_LE, fRES(sapSupplierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCdList The collection of sapSupplierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_InScope(Collection<String> sapSupplierCdList) {
        doSetSapSupplierCd_InScope(sapSupplierCdList);
    }

    protected void doSetSapSupplierCd_InScope(Collection<String> sapSupplierCdList) {
        regINS(CK_INS, cTL(sapSupplierCdList), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCdList The collection of sapSupplierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_NotInScope(Collection<String> sapSupplierCdList) {
        doSetSapSupplierCd_NotInScope(sapSupplierCdList);
    }

    protected void doSetSapSupplierCd_NotInScope(Collection<String> sapSupplierCdList) {
        regINS(CK_NINS, cTL(sapSupplierCdList), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapSupplierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapSupplierCd The value of sapSupplierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapSupplierCd_LikeSearch(String sapSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapSupplierCd), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapSupplierCd_NotLikeSearch(String sapSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapSupplierCd), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_PrefixSearch(String sapSupplierCd) {
        setSapSupplierCd_LikeSearch(sapSupplierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNull() { regSapSupplierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNullOrEmpty() { regSapSupplierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNotNull() { regSapSupplierCd(CK_ISNN, DOBJ); }

    protected void regSapSupplierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD"); }
    protected abstract ConditionValue xgetCValueSapSupplierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_Equal(String todayFlg) {
        doSetTodayFlg_Equal(fRES(todayFlg));
    }

    protected void doSetTodayFlg_Equal(String todayFlg) {
        regTodayFlg(CK_EQ, todayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_NotEqual(String todayFlg) {
        doSetTodayFlg_NotEqual(fRES(todayFlg));
    }

    protected void doSetTodayFlg_NotEqual(String todayFlg) {
        regTodayFlg(CK_NES, todayFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_GreaterThan(String todayFlg) {
        regTodayFlg(CK_GT, fRES(todayFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_LessThan(String todayFlg) {
        regTodayFlg(CK_LT, fRES(todayFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_GreaterEqual(String todayFlg) {
        regTodayFlg(CK_GE, fRES(todayFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_LessEqual(String todayFlg) {
        regTodayFlg(CK_LE, fRES(todayFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlgList The collection of todayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_InScope(Collection<String> todayFlgList) {
        doSetTodayFlg_InScope(todayFlgList);
    }

    protected void doSetTodayFlg_InScope(Collection<String> todayFlgList) {
        regINS(CK_INS, cTL(todayFlgList), xgetCValueTodayFlg(), "TODAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlgList The collection of todayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_NotInScope(Collection<String> todayFlgList) {
        doSetTodayFlg_NotInScope(todayFlgList);
    }

    protected void doSetTodayFlg_NotInScope(Collection<String> todayFlgList) {
        regINS(CK_NINS, cTL(todayFlgList), xgetCValueTodayFlg(), "TODAY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {CHAR(1)} <br>
     * <pre>e.g. setTodayFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param todayFlg The value of todayFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTodayFlg_LikeSearch(String todayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(todayFlg), xgetCValueTodayFlg(), "TODAY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTodayFlg_NotLikeSearch(String todayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(todayFlg), xgetCValueTodayFlg(), "TODAY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     * @param todayFlg The value of todayFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_PrefixSearch(String todayFlg) {
        setTodayFlg_LikeSearch(todayFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     */
    public void setTodayFlg_IsNull() { regTodayFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     */
    public void setTodayFlg_IsNullOrEmpty() { regTodayFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {CHAR(1)}
     */
    public void setTodayFlg_IsNotNull() { regTodayFlg(CK_ISNN, DOBJ); }

    protected void regTodayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTodayFlg(), "TODAY_FLG"); }
    protected abstract ConditionValue xgetCValueTodayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_Equal(String sanshaDeliverySlipNo1) {
        doSetSanshaDeliverySlipNo1_Equal(fRES(sanshaDeliverySlipNo1));
    }

    protected void doSetSanshaDeliverySlipNo1_Equal(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_EQ, sanshaDeliverySlipNo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_NotEqual(String sanshaDeliverySlipNo1) {
        doSetSanshaDeliverySlipNo1_NotEqual(fRES(sanshaDeliverySlipNo1));
    }

    protected void doSetSanshaDeliverySlipNo1_NotEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_NES, sanshaDeliverySlipNo1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_GreaterThan(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_GT, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_LessThan(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_LT, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_GreaterEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_GE, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_LessEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_LE, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1List The collection of sanshaDeliverySlipNo1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_InScope(Collection<String> sanshaDeliverySlipNo1List) {
        doSetSanshaDeliverySlipNo1_InScope(sanshaDeliverySlipNo1List);
    }

    protected void doSetSanshaDeliverySlipNo1_InScope(Collection<String> sanshaDeliverySlipNo1List) {
        regINS(CK_INS, cTL(sanshaDeliverySlipNo1List), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1List The collection of sanshaDeliverySlipNo1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_NotInScope(Collection<String> sanshaDeliverySlipNo1List) {
        doSetSanshaDeliverySlipNo1_NotInScope(sanshaDeliverySlipNo1List);
    }

    protected void doSetSanshaDeliverySlipNo1_NotInScope(Collection<String> sanshaDeliverySlipNo1List) {
        regINS(CK_NINS, cTL(sanshaDeliverySlipNo1List), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * <pre>e.g. setSanshaDeliverySlipNo1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSanshaDeliverySlipNo1_LikeSearch(String sanshaDeliverySlipNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sanshaDeliverySlipNo1), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSanshaDeliverySlipNo1_NotLikeSearch(String sanshaDeliverySlipNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sanshaDeliverySlipNo1), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_PrefixSearch(String sanshaDeliverySlipNo1) {
        setSanshaDeliverySlipNo1_LikeSearch(sanshaDeliverySlipNo1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNull() { regSanshaDeliverySlipNo1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNullOrEmpty() { regSanshaDeliverySlipNo1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNotNull() { regSanshaDeliverySlipNo1(CK_ISNN, DOBJ); }

    protected void regSanshaDeliverySlipNo1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1"); }
    protected abstract ConditionValue xgetCValueSanshaDeliverySlipNo1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_Equal(String dataTypeCd) {
        doSetDataTypeCd_Equal(fRES(dataTypeCd));
    }

    protected void doSetDataTypeCd_Equal(String dataTypeCd) {
        regDataTypeCd(CK_EQ, dataTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_NotEqual(String dataTypeCd) {
        doSetDataTypeCd_NotEqual(fRES(dataTypeCd));
    }

    protected void doSetDataTypeCd_NotEqual(String dataTypeCd) {
        regDataTypeCd(CK_NES, dataTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_GreaterThan(String dataTypeCd) {
        regDataTypeCd(CK_GT, fRES(dataTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_LessThan(String dataTypeCd) {
        regDataTypeCd(CK_LT, fRES(dataTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_GreaterEqual(String dataTypeCd) {
        regDataTypeCd(CK_GE, fRES(dataTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_LessEqual(String dataTypeCd) {
        regDataTypeCd(CK_LE, fRES(dataTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCdList The collection of dataTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_InScope(Collection<String> dataTypeCdList) {
        doSetDataTypeCd_InScope(dataTypeCdList);
    }

    protected void doSetDataTypeCd_InScope(Collection<String> dataTypeCdList) {
        regINS(CK_INS, cTL(dataTypeCdList), xgetCValueDataTypeCd(), "DATA_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCdList The collection of dataTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_NotInScope(Collection<String> dataTypeCdList) {
        doSetDataTypeCd_NotInScope(dataTypeCdList);
    }

    protected void doSetDataTypeCd_NotInScope(Collection<String> dataTypeCdList) {
        regINS(CK_NINS, cTL(dataTypeCdList), xgetCValueDataTypeCd(), "DATA_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTypeCd The value of dataTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTypeCd_LikeSearch(String dataTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTypeCd), xgetCValueDataTypeCd(), "DATA_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTypeCd_NotLikeSearch(String dataTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTypeCd), xgetCValueDataTypeCd(), "DATA_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_PrefixSearch(String dataTypeCd) {
        setDataTypeCd_LikeSearch(dataTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNull() { regDataTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNullOrEmpty() { regDataTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNotNull() { regDataTypeCd(CK_ISNN, DOBJ); }

    protected void regDataTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTypeCd(), "DATA_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDataTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_Equal(String sanshaTypeCd) {
        doSetSanshaTypeCd_Equal(fRES(sanshaTypeCd));
    }

    protected void doSetSanshaTypeCd_Equal(String sanshaTypeCd) {
        regSanshaTypeCd(CK_EQ, sanshaTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_NotEqual(String sanshaTypeCd) {
        doSetSanshaTypeCd_NotEqual(fRES(sanshaTypeCd));
    }

    protected void doSetSanshaTypeCd_NotEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_NES, sanshaTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_GreaterThan(String sanshaTypeCd) {
        regSanshaTypeCd(CK_GT, fRES(sanshaTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_LessThan(String sanshaTypeCd) {
        regSanshaTypeCd(CK_LT, fRES(sanshaTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_GreaterEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_GE, fRES(sanshaTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_LessEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_LE, fRES(sanshaTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCdList The collection of sanshaTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_InScope(Collection<String> sanshaTypeCdList) {
        doSetSanshaTypeCd_InScope(sanshaTypeCdList);
    }

    protected void doSetSanshaTypeCd_InScope(Collection<String> sanshaTypeCdList) {
        regINS(CK_INS, cTL(sanshaTypeCdList), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCdList The collection of sanshaTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_NotInScope(Collection<String> sanshaTypeCdList) {
        doSetSanshaTypeCd_NotInScope(sanshaTypeCdList);
    }

    protected void doSetSanshaTypeCd_NotInScope(Collection<String> sanshaTypeCdList) {
        regINS(CK_NINS, cTL(sanshaTypeCdList), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSanshaTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sanshaTypeCd The value of sanshaTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSanshaTypeCd_LikeSearch(String sanshaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sanshaTypeCd), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSanshaTypeCd_NotLikeSearch(String sanshaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sanshaTypeCd), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_PrefixSearch(String sanshaTypeCd) {
        setSanshaTypeCd_LikeSearch(sanshaTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNull() { regSanshaTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNullOrEmpty() { regSanshaTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNotNull() { regSanshaTypeCd(CK_ISNN, DOBJ); }

    protected void regSanshaTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSanshaTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_Equal(String receiveReasonNm) {
        doSetReceiveReasonNm_Equal(fRES(receiveReasonNm));
    }

    protected void doSetReceiveReasonNm_Equal(String receiveReasonNm) {
        regReceiveReasonNm(CK_EQ, receiveReasonNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_NotEqual(String receiveReasonNm) {
        doSetReceiveReasonNm_NotEqual(fRES(receiveReasonNm));
    }

    protected void doSetReceiveReasonNm_NotEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_NES, receiveReasonNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_GreaterThan(String receiveReasonNm) {
        regReceiveReasonNm(CK_GT, fRES(receiveReasonNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_LessThan(String receiveReasonNm) {
        regReceiveReasonNm(CK_LT, fRES(receiveReasonNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_GreaterEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_GE, fRES(receiveReasonNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_LessEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_LE, fRES(receiveReasonNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNmList The collection of receiveReasonNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_InScope(Collection<String> receiveReasonNmList) {
        doSetReceiveReasonNm_InScope(receiveReasonNmList);
    }

    protected void doSetReceiveReasonNm_InScope(Collection<String> receiveReasonNmList) {
        regINS(CK_INS, cTL(receiveReasonNmList), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNmList The collection of receiveReasonNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_NotInScope(Collection<String> receiveReasonNmList) {
        doSetReceiveReasonNm_NotInScope(receiveReasonNmList);
    }

    protected void doSetReceiveReasonNm_NotInScope(Collection<String> receiveReasonNmList) {
        regINS(CK_NINS, cTL(receiveReasonNmList), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setReceiveReasonNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveReasonNm The value of receiveReasonNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveReasonNm_LikeSearch(String receiveReasonNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveReasonNm), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveReasonNm_NotLikeSearch(String receiveReasonNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveReasonNm), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     * @param receiveReasonNm The value of receiveReasonNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_PrefixSearch(String receiveReasonNm) {
        setReceiveReasonNm_LikeSearch(receiveReasonNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     */
    public void setReceiveReasonNm_IsNull() { regReceiveReasonNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     */
    public void setReceiveReasonNm_IsNullOrEmpty() { regReceiveReasonNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(60)}
     */
    public void setReceiveReasonNm_IsNotNull() { regReceiveReasonNm(CK_ISNN, DOBJ); }

    protected void regReceiveReasonNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM"); }
    protected abstract ConditionValue xgetCValueReceiveReasonNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_Equal(String modTypeCd) {
        doSetModTypeCd_Equal(fRES(modTypeCd));
    }

    protected void doSetModTypeCd_Equal(String modTypeCd) {
        regModTypeCd(CK_EQ, modTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_NotEqual(String modTypeCd) {
        doSetModTypeCd_NotEqual(fRES(modTypeCd));
    }

    protected void doSetModTypeCd_NotEqual(String modTypeCd) {
        regModTypeCd(CK_NES, modTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_GreaterThan(String modTypeCd) {
        regModTypeCd(CK_GT, fRES(modTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_LessThan(String modTypeCd) {
        regModTypeCd(CK_LT, fRES(modTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_GreaterEqual(String modTypeCd) {
        regModTypeCd(CK_GE, fRES(modTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_LessEqual(String modTypeCd) {
        regModTypeCd(CK_LE, fRES(modTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCdList The collection of modTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_InScope(Collection<String> modTypeCdList) {
        doSetModTypeCd_InScope(modTypeCdList);
    }

    protected void doSetModTypeCd_InScope(Collection<String> modTypeCdList) {
        regINS(CK_INS, cTL(modTypeCdList), xgetCValueModTypeCd(), "MOD_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCdList The collection of modTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_NotInScope(Collection<String> modTypeCdList) {
        doSetModTypeCd_NotInScope(modTypeCdList);
    }

    protected void doSetModTypeCd_NotInScope(Collection<String> modTypeCdList) {
        regINS(CK_NINS, cTL(modTypeCdList), xgetCValueModTypeCd(), "MOD_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setModTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param modTypeCd The value of modTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setModTypeCd_LikeSearch(String modTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(modTypeCd), xgetCValueModTypeCd(), "MOD_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setModTypeCd_NotLikeSearch(String modTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(modTypeCd), xgetCValueModTypeCd(), "MOD_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_PrefixSearch(String modTypeCd) {
        setModTypeCd_LikeSearch(modTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNull() { regModTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNullOrEmpty() { regModTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNotNull() { regModTypeCd(CK_ISNN, DOBJ); }

    protected void regModTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueModTypeCd(), "MOD_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueModTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_Equal(String ifId) {
        doSetIfId_Equal(fRES(ifId));
    }

    protected void doSetIfId_Equal(String ifId) {
        regIfId(CK_EQ, ifId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotEqual(String ifId) {
        doSetIfId_NotEqual(fRES(ifId));
    }

    protected void doSetIfId_NotEqual(String ifId) {
        regIfId(CK_NES, ifId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterThan(String ifId) {
        regIfId(CK_GT, fRES(ifId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessThan(String ifId) {
        regIfId(CK_LT, fRES(ifId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterEqual(String ifId) {
        regIfId(CK_GE, fRES(ifId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessEqual(String ifId) {
        regIfId(CK_LE, fRES(ifId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_InScope(Collection<String> ifIdList) {
        doSetIfId_InScope(ifIdList);
    }

    protected void doSetIfId_InScope(Collection<String> ifIdList) {
        regINS(CK_INS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotInScope(Collection<String> ifIdList) {
        doSetIfId_NotInScope(ifIdList);
    }

    protected void doSetIfId_NotInScope(Collection<String> ifIdList) {
        regINS(CK_NINS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)} <br>
     * <pre>e.g. setIfId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifId The value of ifId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfId_LikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfId_NotLikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_PrefixSearch(String ifId) {
        setIfId_LikeSearch(ifId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNull() { regIfId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNullOrEmpty() { regIfId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNotNull() { regIfId(CK_ISNN, DOBJ); }

    protected void regIfId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfId(), "IF_ID"); }
    protected abstract ConditionValue xgetCValueIfId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_Equal(String spareStr) {
        doSetSpareStr_Equal(fRES(spareStr));
    }

    protected void doSetSpareStr_Equal(String spareStr) {
        regSpareStr(CK_EQ, spareStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotEqual(String spareStr) {
        doSetSpareStr_NotEqual(fRES(spareStr));
    }

    protected void doSetSpareStr_NotEqual(String spareStr) {
        regSpareStr(CK_NES, spareStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterThan(String spareStr) {
        regSpareStr(CK_GT, fRES(spareStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessThan(String spareStr) {
        regSpareStr(CK_LT, fRES(spareStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterEqual(String spareStr) {
        regSpareStr(CK_GE, fRES(spareStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessEqual(String spareStr) {
        regSpareStr(CK_LE, fRES(spareStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_InScope(Collection<String> spareStrList) {
        doSetSpareStr_InScope(spareStrList);
    }

    protected void doSetSpareStr_InScope(Collection<String> spareStrList) {
        regINS(CK_INS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotInScope(Collection<String> spareStrList) {
        doSetSpareStr_NotInScope(spareStrList);
    }

    protected void doSetSpareStr_NotInScope(Collection<String> spareStrList) {
        regINS(CK_NINS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)} <br>
     * <pre>e.g. setSpareStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr The value of spareStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr_LikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr_NotLikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_PrefixSearch(String spareStr) {
        setSpareStr_LikeSearch(spareStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNull() { regSpareStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNullOrEmpty() { regSpareStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNotNull() { regSpareStr(CK_ISNN, DOBJ); }

    protected void regSpareStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr(), "SPARE_STR"); }
    protected abstract ConditionValue xgetCValueSpareStr();

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
    public HpSLCFunction<TReceivePlanHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReceivePlanHCB.class);
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
    public HpSLCFunction<TReceivePlanHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReceivePlanHCB.class);
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
    public HpSLCFunction<TReceivePlanHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReceivePlanHCB.class);
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
    public HpSLCFunction<TReceivePlanHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReceivePlanHCB.class);
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
    public HpSLCFunction<TReceivePlanHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReceivePlanHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReceivePlanHCB&gt;() {
     *     public void query(TReceivePlanHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReceivePlanHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReceivePlanHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReceivePlanHCQ sq);

    protected TReceivePlanHCB xcreateScalarConditionCB() {
        TReceivePlanHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReceivePlanHCB xcreateScalarConditionPartitionByCB() {
        TReceivePlanHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_PLAN_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReceivePlanHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReceivePlanHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_PLAN_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReceivePlanHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReceivePlanHCQ sq);

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
    protected TReceivePlanHCB newMyCB() {
        return new TReceivePlanHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReceivePlanHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
