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
 * The abstract condition-query of t_store_record_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStoreRecordBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStoreRecordBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_store_record_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_Equal(Long storeRecordBId) {
        doSetStoreRecordBId_Equal(storeRecordBId);
    }

    protected void doSetStoreRecordBId_Equal(Long storeRecordBId) {
        regStoreRecordBId(CK_EQ, storeRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotEqual(Long storeRecordBId) {
        doSetStoreRecordBId_NotEqual(storeRecordBId);
    }

    protected void doSetStoreRecordBId_NotEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_NES, storeRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterThan(Long storeRecordBId) {
        regStoreRecordBId(CK_GT, storeRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessThan(Long storeRecordBId) {
        regStoreRecordBId(CK_LT, storeRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_GreaterEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_GE, storeRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBId The value of storeRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordBId_LessEqual(Long storeRecordBId) {
        regStoreRecordBId(CK_LE, storeRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBIdList The collection of storeRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_InScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_InScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_INS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param storeRecordBIdList The collection of storeRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        doSetStoreRecordBId_NotInScope(storeRecordBIdList);
    }

    protected void doSetStoreRecordBId_NotInScope(Collection<Long> storeRecordBIdList) {
        regINS(CK_NINS, cTL(storeRecordBIdList), xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select STORE_RECORD_B_ID from t_stock_inout where ...)} <br>
     * t_stock_inout by STORE_RECORD_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockInoutList for 'exists'. (NotNull)
     */
    public void existsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStoreRecordBId_ExistsReferrer_TStockInoutList(cb.query());
        registerExistsReferrer(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepStoreRecordBId_ExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select STORE_RECORD_B_ID from t_stock_inout where ...)} <br>
     * t_stock_inout by STORE_RECORD_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockInoutList</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StoreRecordBId_NotExistsReferrer_TStockInoutList for 'not exists'. (NotNull)
     */
    public void notExistsTStockInoutList(SubQuery<TStockInoutCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepStoreRecordBId_NotExistsReferrer_TStockInoutList(cb.query());
        registerNotExistsReferrer(cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "tStockInoutList");
    }
    public abstract String keepStoreRecordBId_NotExistsReferrer_TStockInoutList(TStockInoutCQ sq);

    public void xsderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepStoreRecordBId_SpecifyDerivedReferrer_TStockInoutList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", pp, "tStockInoutList", al, op);
    }
    public abstract String keepStoreRecordBId_SpecifyDerivedReferrer_TStockInoutList(TStockInoutCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_stock_inout where ...)} <br>
     * t_stock_inout by STORE_RECORD_B_ID, named 'TStockInoutAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockInoutList()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inoutCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inoutCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockInoutCB> derivedTStockInoutList() {
        return xcreateQDRFunctionTStockInoutList();
    }
    protected HpQDRFunction<TStockInoutCB> xcreateQDRFunctionTStockInoutList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockInoutList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockInoutList(String fn, SubQuery<TStockInoutCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockInoutCB cb = new TStockInoutCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepStoreRecordBId_QueryDerivedReferrer_TStockInoutList(cb.query()); String prpp = keepStoreRecordBId_QueryDerivedReferrer_TStockInoutListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "STORE_RECORD_B_ID", "STORE_RECORD_B_ID", sqpp, "tStockInoutList", rd, vl, prpp, op);
    }
    public abstract String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutList(TStockInoutCQ sq);
    public abstract String keepStoreRecordBId_QueryDerivedReferrer_TStockInoutListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStoreRecordBId_IsNull() { regStoreRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setStoreRecordBId_IsNotNull() { regStoreRecordBId(CK_ISNN, DOBJ); }

    protected void regStoreRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordBId(), "STORE_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_Equal(Long storeRecordHId) {
        doSetStoreRecordHId_Equal(storeRecordHId);
    }

    protected void doSetStoreRecordHId_Equal(Long storeRecordHId) {
        regStoreRecordHId(CK_EQ, storeRecordHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_NotEqual(Long storeRecordHId) {
        doSetStoreRecordHId_NotEqual(storeRecordHId);
    }

    protected void doSetStoreRecordHId_NotEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_NES, storeRecordHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterThan(Long storeRecordHId) {
        regStoreRecordHId(CK_GT, storeRecordHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessThan(Long storeRecordHId) {
        regStoreRecordHId(CK_LT, storeRecordHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_GreaterEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_GE, storeRecordHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHId The value of storeRecordHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreRecordHId_LessEqual(Long storeRecordHId) {
        regStoreRecordHId(CK_LE, storeRecordHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param minNumber The min number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreRecordHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHIdList The collection of storeRecordHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordHId_InScope(Collection<Long> storeRecordHIdList) {
        doSetStoreRecordHId_InScope(storeRecordHIdList);
    }

    protected void doSetStoreRecordHId_InScope(Collection<Long> storeRecordHIdList) {
        regINS(CK_INS, cTL(storeRecordHIdList), xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
     * @param storeRecordHIdList The collection of storeRecordHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordHId_NotInScope(Collection<Long> storeRecordHIdList) {
        doSetStoreRecordHId_NotInScope(storeRecordHIdList);
    }

    protected void doSetStoreRecordHId_NotInScope(Collection<Long> storeRecordHIdList) {
        regINS(CK_NINS, cTL(storeRecordHIdList), xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_RECORD_H_ID from t_store_record_h where ...)} <br />
     * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @param subCBLambda The callback for sub-query of TStoreRecordH for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreRecordH(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_InScopeRelation_TStoreRecordH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "tStoreRecordH", false);
    }
    public abstract String keepStoreRecordHId_InScopeRelation_TStoreRecordH(TStoreRecordHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_RECORD_H_ID from t_store_record_h where ...)} <br />
     * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @param subCBLambda The callback for sub-query of TStoreRecordH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreRecordH(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(cb.query());
        registerInScopeRelation(cb.query(), "STORE_RECORD_H_ID", "STORE_RECORD_H_ID", pp, "tStoreRecordH", true);
    }
    public abstract String keepStoreRecordHId_NotInScopeRelation_TStoreRecordH(TStoreRecordHCQ sq);

    protected void regStoreRecordHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordHId(), "STORE_RECORD_H_ID"); }
    protected abstract ConditionValue xgetCValueStoreRecordHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_Equal(Long receivePlanBId) {
        doSetReceivePlanBId_Equal(receivePlanBId);
    }

    protected void doSetReceivePlanBId_Equal(Long receivePlanBId) {
        regReceivePlanBId(CK_EQ, receivePlanBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotEqual(Long receivePlanBId) {
        doSetReceivePlanBId_NotEqual(receivePlanBId);
    }

    protected void doSetReceivePlanBId_NotEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_NES, receivePlanBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterThan(Long receivePlanBId) {
        regReceivePlanBId(CK_GT, receivePlanBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessThan(Long receivePlanBId) {
        regReceivePlanBId(CK_LT, receivePlanBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_GE, receivePlanBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_LE, receivePlanBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param minNumber The min number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBIdList The collection of receivePlanBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_InScope(Collection<Long> receivePlanBIdList) {
        doSetReceivePlanBId_InScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_InScope(Collection<Long> receivePlanBIdList) {
        regINS(CK_INS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBIdList The collection of receivePlanBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        doSetReceivePlanBId_NotInScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        regINS(CK_NINS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RECEIVE_PLAN_B_ID from t_receive_plan_b where ...)} <br />
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param subCBLambda The callback for sub-query of TReceivePlanB for 'in-scope'. (NotNull)
     */
    public void inScopeTReceivePlanB(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanBId_InScopeRelation_TReceivePlanB(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanB", false);
    }
    public abstract String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RECEIVE_PLAN_B_ID from t_receive_plan_b where ...)} <br />
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param subCBLambda The callback for sub-query of TReceivePlanB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTReceivePlanB(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanB", true);
    }
    public abstract String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq);

    protected void regReceivePlanBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_Equal(String processNo) {
        doSetProcessNo_Equal(fRES(processNo));
    }

    protected void doSetProcessNo_Equal(String processNo) {
        regProcessNo(CK_EQ, processNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotEqual(String processNo) {
        doSetProcessNo_NotEqual(fRES(processNo));
    }

    protected void doSetProcessNo_NotEqual(String processNo) {
        regProcessNo(CK_NES, processNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterThan(String processNo) {
        regProcessNo(CK_GT, fRES(processNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessThan(String processNo) {
        regProcessNo(CK_LT, fRES(processNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_GreaterEqual(String processNo) {
        regProcessNo(CK_GE, fRES(processNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_LessEqual(String processNo) {
        regProcessNo(CK_LE, fRES(processNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNoList The collection of processNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_InScope(Collection<String> processNoList) {
        doSetProcessNo_InScope(processNoList);
    }

    protected void doSetProcessNo_InScope(Collection<String> processNoList) {
        regINS(CK_INS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNoList The collection of processNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_NotInScope(Collection<String> processNoList) {
        doSetProcessNo_NotInScope(processNoList);
    }

    protected void doSetProcessNo_NotInScope(Collection<String> processNoList) {
        regINS(CK_NINS, cTL(processNoList), xgetCValueProcessNo(), "PROCESS_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setProcessNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processNo The value of processNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessNo_LikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessNo_NotLikeSearch(String processNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processNo), xgetCValueProcessNo(), "PROCESS_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_NO: {NotNull, VARCHAR(30)}
     * @param processNo The value of processNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessNo_PrefixSearch(String processNo) {
        setProcessNo_LikeSearch(processNo, xcLSOPPre());
    }

    protected void regProcessNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessNo(), "PROCESS_NO"); }
    protected abstract ConditionValue xgetCValueProcessNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_Equal(String clientOrderNo) {
        doSetClientOrderNo_Equal(fRES(clientOrderNo));
    }

    protected void doSetClientOrderNo_Equal(String clientOrderNo) {
        regClientOrderNo(CK_EQ, clientOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_NotEqual(String clientOrderNo) {
        doSetClientOrderNo_NotEqual(fRES(clientOrderNo));
    }

    protected void doSetClientOrderNo_NotEqual(String clientOrderNo) {
        regClientOrderNo(CK_NES, clientOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_GreaterThan(String clientOrderNo) {
        regClientOrderNo(CK_GT, fRES(clientOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_LessThan(String clientOrderNo) {
        regClientOrderNo(CK_LT, fRES(clientOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_GreaterEqual(String clientOrderNo) {
        regClientOrderNo(CK_GE, fRES(clientOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_LessEqual(String clientOrderNo) {
        regClientOrderNo(CK_LE, fRES(clientOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNoList The collection of clientOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_InScope(Collection<String> clientOrderNoList) {
        doSetClientOrderNo_InScope(clientOrderNoList);
    }

    protected void doSetClientOrderNo_InScope(Collection<String> clientOrderNoList) {
        regINS(CK_INS, cTL(clientOrderNoList), xgetCValueClientOrderNo(), "CLIENT_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNoList The collection of clientOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_NotInScope(Collection<String> clientOrderNoList) {
        doSetClientOrderNo_NotInScope(clientOrderNoList);
    }

    protected void doSetClientOrderNo_NotInScope(Collection<String> clientOrderNoList) {
        regINS(CK_NINS, cTL(clientOrderNoList), xgetCValueClientOrderNo(), "CLIENT_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setClientOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientOrderNo The value of clientOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientOrderNo_LikeSearch(String clientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientOrderNo), xgetCValueClientOrderNo(), "CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientOrderNo_NotLikeSearch(String clientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientOrderNo), xgetCValueClientOrderNo(), "CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param clientOrderNo The value of clientOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientOrderNo_PrefixSearch(String clientOrderNo) {
        setClientOrderNo_LikeSearch(clientOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setClientOrderNo_IsNull() { regClientOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setClientOrderNo_IsNullOrEmpty() { regClientOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setClientOrderNo_IsNotNull() { regClientOrderNo(CK_ISNN, DOBJ); }

    protected void regClientOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientOrderNo(), "CLIENT_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueClientOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_Equal(String storeDt) {
        doSetStoreDt_Equal(fRES(storeDt));
    }

    protected void doSetStoreDt_Equal(String storeDt) {
        regStoreDt(CK_EQ, storeDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotEqual(String storeDt) {
        doSetStoreDt_NotEqual(fRES(storeDt));
    }

    protected void doSetStoreDt_NotEqual(String storeDt) {
        regStoreDt(CK_NES, storeDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDtList The collection of storeDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_InScope(Collection<String> storeDtList) {
        doSetStoreDt_InScope(storeDtList);
    }

    protected void doSetStoreDt_InScope(Collection<String> storeDtList) {
        regINS(CK_INS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDtList The collection of storeDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotInScope(Collection<String> storeDtList) {
        doSetStoreDt_NotInScope(storeDtList);
    }

    protected void doSetStoreDt_NotInScope(Collection<String> storeDtList) {
        regINS(CK_NINS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)} <br>
     * <pre>e.g. setStoreDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeDt The value of storeDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreDt_LikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {IX, NotNull, VARCHAR(8)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_Equal(java.math.BigDecimal storeNum) {
        doSetStoreNum_Equal(storeNum);
    }

    protected void doSetStoreNum_Equal(java.math.BigDecimal storeNum) {
        regStoreNum(CK_EQ, storeNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        doSetStoreNum_NotEqual(storeNum);
    }

    protected void doSetStoreNum_NotEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_NES, storeNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GT, storeNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessThan(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LT, storeNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_GreaterEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_GE, storeNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNum The value of storeNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNum_LessEqual(java.math.BigDecimal storeNum) {
        regStoreNum(CK_LE, storeNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNum(), "STORE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNumList The collection of storeNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_InScope(storeNumList);
    }

    protected void doSetStoreNum_InScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_INS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param storeNumList The collection of storeNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        doSetStoreNum_NotInScope(storeNumList);
    }

    protected void doSetStoreNum_NotInScope(Collection<java.math.BigDecimal> storeNumList) {
        regINS(CK_NINS, cTL(storeNumList), xgetCValueStoreNum(), "STORE_NUM");
    }

    protected void regStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNum(), "STORE_NUM"); }
    protected abstract ConditionValue xgetCValueStoreNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlg The value of storeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_Equal(String storeFlg) {
        doSetStoreFlg_Equal(fRES(storeFlg));
    }

    /**
     * Equal(=). As StoreFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg cdef) {
        doSetStoreFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未格納
     */
    public void setStoreFlg_Equal_$0() {
        setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 格納
     */
    public void setStoreFlg_Equal_$1() {
        setStoreFlg_Equal_AsStoreFlg(CDef.StoreFlg.$1);
    }

    protected void doSetStoreFlg_Equal(String storeFlg) {
        regStoreFlg(CK_EQ, storeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlg The value of storeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotEqual(String storeFlg) {
        doSetStoreFlg_NotEqual(fRES(storeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As StoreFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg cdef) {
        doSetStoreFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未格納
     */
    public void setStoreFlg_NotEqual_$0() {
        setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 格納
     */
    public void setStoreFlg_NotEqual_$1() {
        setStoreFlg_NotEqual_AsStoreFlg(CDef.StoreFlg.$1);
    }

    protected void doSetStoreFlg_NotEqual(String storeFlg) {
        regStoreFlg(CK_NES, storeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlgList The collection of storeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_InScope(Collection<String> storeFlgList) {
        doSetStoreFlg_InScope(storeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As StoreFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_InScope_AsStoreFlg(Collection<CDef.StoreFlg> cdefList) {
        doSetStoreFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetStoreFlg_InScope(Collection<String> storeFlgList) {
        regINS(CK_INS, cTL(storeFlgList), xgetCValueStoreFlg(), "STORE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
     * @param storeFlgList The collection of storeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotInScope(Collection<String> storeFlgList) {
        doSetStoreFlg_NotInScope(storeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As StoreFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg} <br>
     * 格納フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreFlg_NotInScope_AsStoreFlg(Collection<CDef.StoreFlg> cdefList) {
        doSetStoreFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetStoreFlg_NotInScope(Collection<String> storeFlgList) {
        regINS(CK_NINS, cTL(storeFlgList), xgetCValueStoreFlg(), "STORE_FLG");
    }

    protected void regStoreFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreFlg(), "STORE_FLG"); }
    protected abstract ConditionValue xgetCValueStoreFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_Equal(Long storeLocationId) {
        doSetStoreLocationId_Equal(storeLocationId);
    }

    protected void doSetStoreLocationId_Equal(Long storeLocationId) {
        regStoreLocationId(CK_EQ, storeLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_NotEqual(Long storeLocationId) {
        doSetStoreLocationId_NotEqual(storeLocationId);
    }

    protected void doSetStoreLocationId_NotEqual(Long storeLocationId) {
        regStoreLocationId(CK_NES, storeLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_GreaterThan(Long storeLocationId) {
        regStoreLocationId(CK_GT, storeLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_LessThan(Long storeLocationId) {
        regStoreLocationId(CK_LT, storeLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_GreaterEqual(Long storeLocationId) {
        regStoreLocationId(CK_GE, storeLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationId The value of storeLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreLocationId_LessEqual(Long storeLocationId) {
        regStoreLocationId(CK_LE, storeLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param minNumber The min number of storeLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreLocationId(), "STORE_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationIdList The collection of storeLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationId_InScope(Collection<Long> storeLocationIdList) {
        doSetStoreLocationId_InScope(storeLocationIdList);
    }

    protected void doSetStoreLocationId_InScope(Collection<Long> storeLocationIdList) {
        regINS(CK_INS, cTL(storeLocationIdList), xgetCValueStoreLocationId(), "STORE_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param storeLocationIdList The collection of storeLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreLocationId_NotInScope(Collection<Long> storeLocationIdList) {
        doSetStoreLocationId_NotInScope(storeLocationIdList);
    }

    protected void doSetStoreLocationId_NotInScope(Collection<Long> storeLocationIdList) {
        regINS(CK_NINS, cTL(storeLocationIdList), xgetCValueStoreLocationId(), "STORE_LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_LOCATION_ID from m_location where ...)} <br />
     * m_location by my STORE_LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "STORE_LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepStoreLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_LOCATION_ID from m_location where ...)} <br />
     * m_location by my STORE_LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "STORE_LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepStoreLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setStoreLocationId_IsNull() { regStoreLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setStoreLocationId_IsNotNull() { regStoreLocationId(CK_ISNN, DOBJ); }

    protected void regStoreLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreLocationId(), "STORE_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueStoreLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_Equal(String inputType) {
        doSetInputType_Equal(fRES(inputType));
    }

    /**
     * Equal(=). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
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
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputType The value of inputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotEqual(String inputType) {
        doSetInputType_NotEqual(fRES(inputType));
    }

    /**
     * NotEqual(&lt;&gt;). As InputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
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
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope(Collection<String> inputTypeList) {
        doSetInputType_InScope(inputTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
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
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     * @param inputTypeList The collection of inputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope(Collection<String> inputTypeList) {
        doSetInputType_NotInScope(inputTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType} <br>
     * 入力区分
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope_AsInputType(Collection<CDef.InputType> cdefList) {
        doSetInputType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInputType_NotInScope(Collection<String> inputTypeList) {
        regINS(CK_NINS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNull() { regInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNullOrEmpty() { regInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
     */
    public void setInputType_IsNotNull() { regInputType(CK_ISNN, DOBJ); }

    protected void regInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputType(), "INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_Equal(String htStoreInspectionDt) {
        doSetHtStoreInspectionDt_Equal(fRES(htStoreInspectionDt));
    }

    protected void doSetHtStoreInspectionDt_Equal(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_EQ, htStoreInspectionDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_NotEqual(String htStoreInspectionDt) {
        doSetHtStoreInspectionDt_NotEqual(fRES(htStoreInspectionDt));
    }

    protected void doSetHtStoreInspectionDt_NotEqual(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_NES, htStoreInspectionDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_GreaterThan(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_GT, fRES(htStoreInspectionDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_LessThan(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_LT, fRES(htStoreInspectionDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_GreaterEqual(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_GE, fRES(htStoreInspectionDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_LessEqual(String htStoreInspectionDt) {
        regHtStoreInspectionDt(CK_LE, fRES(htStoreInspectionDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDtList The collection of htStoreInspectionDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_InScope(Collection<String> htStoreInspectionDtList) {
        doSetHtStoreInspectionDt_InScope(htStoreInspectionDtList);
    }

    protected void doSetHtStoreInspectionDt_InScope(Collection<String> htStoreInspectionDtList) {
        regINS(CK_INS, cTL(htStoreInspectionDtList), xgetCValueHtStoreInspectionDt(), "HT_STORE_INSPECTION_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDtList The collection of htStoreInspectionDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_NotInScope(Collection<String> htStoreInspectionDtList) {
        doSetHtStoreInspectionDt_NotInScope(htStoreInspectionDtList);
    }

    protected void doSetHtStoreInspectionDt_NotInScope(Collection<String> htStoreInspectionDtList) {
        regINS(CK_NINS, cTL(htStoreInspectionDtList), xgetCValueHtStoreInspectionDt(), "HT_STORE_INSPECTION_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setHtStoreInspectionDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htStoreInspectionDt The value of htStoreInspectionDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtStoreInspectionDt_LikeSearch(String htStoreInspectionDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htStoreInspectionDt), xgetCValueHtStoreInspectionDt(), "HT_STORE_INSPECTION_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtStoreInspectionDt_NotLikeSearch(String htStoreInspectionDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htStoreInspectionDt), xgetCValueHtStoreInspectionDt(), "HT_STORE_INSPECTION_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     * @param htStoreInspectionDt The value of htStoreInspectionDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionDt_PrefixSearch(String htStoreInspectionDt) {
        setHtStoreInspectionDt_LikeSearch(htStoreInspectionDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     */
    public void setHtStoreInspectionDt_IsNull() { regHtStoreInspectionDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     */
    public void setHtStoreInspectionDt_IsNullOrEmpty() { regHtStoreInspectionDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
     */
    public void setHtStoreInspectionDt_IsNotNull() { regHtStoreInspectionDt(CK_ISNN, DOBJ); }

    protected void regHtStoreInspectionDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtStoreInspectionDt(), "HT_STORE_INSPECTION_DT"); }
    protected abstract ConditionValue xgetCValueHtStoreInspectionDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_Equal(String htStoreInspectionUserId) {
        doSetHtStoreInspectionUserId_Equal(fRES(htStoreInspectionUserId));
    }

    protected void doSetHtStoreInspectionUserId_Equal(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_EQ, htStoreInspectionUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_NotEqual(String htStoreInspectionUserId) {
        doSetHtStoreInspectionUserId_NotEqual(fRES(htStoreInspectionUserId));
    }

    protected void doSetHtStoreInspectionUserId_NotEqual(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_NES, htStoreInspectionUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_GreaterThan(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_GT, fRES(htStoreInspectionUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_LessThan(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_LT, fRES(htStoreInspectionUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_GreaterEqual(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_GE, fRES(htStoreInspectionUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_LessEqual(String htStoreInspectionUserId) {
        regHtStoreInspectionUserId(CK_LE, fRES(htStoreInspectionUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserIdList The collection of htStoreInspectionUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_InScope(Collection<String> htStoreInspectionUserIdList) {
        doSetHtStoreInspectionUserId_InScope(htStoreInspectionUserIdList);
    }

    protected void doSetHtStoreInspectionUserId_InScope(Collection<String> htStoreInspectionUserIdList) {
        regINS(CK_INS, cTL(htStoreInspectionUserIdList), xgetCValueHtStoreInspectionUserId(), "HT_STORE_INSPECTION_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserIdList The collection of htStoreInspectionUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_NotInScope(Collection<String> htStoreInspectionUserIdList) {
        doSetHtStoreInspectionUserId_NotInScope(htStoreInspectionUserIdList);
    }

    protected void doSetHtStoreInspectionUserId_NotInScope(Collection<String> htStoreInspectionUserIdList) {
        regINS(CK_NINS, cTL(htStoreInspectionUserIdList), xgetCValueHtStoreInspectionUserId(), "HT_STORE_INSPECTION_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)} <br>
     * <pre>e.g. setHtStoreInspectionUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtStoreInspectionUserId_LikeSearch(String htStoreInspectionUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(htStoreInspectionUserId), xgetCValueHtStoreInspectionUserId(), "HT_STORE_INSPECTION_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHtStoreInspectionUserId_NotLikeSearch(String htStoreInspectionUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(htStoreInspectionUserId), xgetCValueHtStoreInspectionUserId(), "HT_STORE_INSPECTION_USER_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     * @param htStoreInspectionUserId The value of htStoreInspectionUserId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtStoreInspectionUserId_PrefixSearch(String htStoreInspectionUserId) {
        setHtStoreInspectionUserId_LikeSearch(htStoreInspectionUserId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     */
    public void setHtStoreInspectionUserId_IsNull() { regHtStoreInspectionUserId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     */
    public void setHtStoreInspectionUserId_IsNullOrEmpty() { regHtStoreInspectionUserId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
     */
    public void setHtStoreInspectionUserId_IsNotNull() { regHtStoreInspectionUserId(CK_ISNN, DOBJ); }

    protected void regHtStoreInspectionUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtStoreInspectionUserId(), "HT_STORE_INSPECTION_USER_ID"); }
    protected abstract ConditionValue xgetCValueHtStoreInspectionUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_Equal(String storeRecordBComment) {
        doSetStoreRecordBComment_Equal(fRES(storeRecordBComment));
    }

    protected void doSetStoreRecordBComment_Equal(String storeRecordBComment) {
        regStoreRecordBComment(CK_EQ, storeRecordBComment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_NotEqual(String storeRecordBComment) {
        doSetStoreRecordBComment_NotEqual(fRES(storeRecordBComment));
    }

    protected void doSetStoreRecordBComment_NotEqual(String storeRecordBComment) {
        regStoreRecordBComment(CK_NES, storeRecordBComment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_GreaterThan(String storeRecordBComment) {
        regStoreRecordBComment(CK_GT, fRES(storeRecordBComment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_LessThan(String storeRecordBComment) {
        regStoreRecordBComment(CK_LT, fRES(storeRecordBComment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_GreaterEqual(String storeRecordBComment) {
        regStoreRecordBComment(CK_GE, fRES(storeRecordBComment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_LessEqual(String storeRecordBComment) {
        regStoreRecordBComment(CK_LE, fRES(storeRecordBComment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBCommentList The collection of storeRecordBComment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_InScope(Collection<String> storeRecordBCommentList) {
        doSetStoreRecordBComment_InScope(storeRecordBCommentList);
    }

    protected void doSetStoreRecordBComment_InScope(Collection<String> storeRecordBCommentList) {
        regINS(CK_INS, cTL(storeRecordBCommentList), xgetCValueStoreRecordBComment(), "STORE_RECORD_B_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBCommentList The collection of storeRecordBComment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_NotInScope(Collection<String> storeRecordBCommentList) {
        doSetStoreRecordBComment_NotInScope(storeRecordBCommentList);
    }

    protected void doSetStoreRecordBComment_NotInScope(Collection<String> storeRecordBCommentList) {
        regINS(CK_NINS, cTL(storeRecordBCommentList), xgetCValueStoreRecordBComment(), "STORE_RECORD_B_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)} <br>
     * <pre>e.g. setStoreRecordBComment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeRecordBComment The value of storeRecordBComment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreRecordBComment_LikeSearch(String storeRecordBComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeRecordBComment), xgetCValueStoreRecordBComment(), "STORE_RECORD_B_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreRecordBComment_NotLikeSearch(String storeRecordBComment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeRecordBComment), xgetCValueStoreRecordBComment(), "STORE_RECORD_B_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     * @param storeRecordBComment The value of storeRecordBComment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordBComment_PrefixSearch(String storeRecordBComment) {
        setStoreRecordBComment_LikeSearch(storeRecordBComment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     */
    public void setStoreRecordBComment_IsNull() { regStoreRecordBComment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     */
    public void setStoreRecordBComment_IsNullOrEmpty() { regStoreRecordBComment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
     */
    public void setStoreRecordBComment_IsNotNull() { regStoreRecordBComment(CK_ISNN, DOBJ); }

    protected void regStoreRecordBComment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordBComment(), "STORE_RECORD_B_COMMENT"); }
    protected abstract ConditionValue xgetCValueStoreRecordBComment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_Equal(String prodDt) {
        doSetProdDt_Equal(fRES(prodDt));
    }

    protected void doSetProdDt_Equal(String prodDt) {
        regProdDt(CK_EQ, prodDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotEqual(String prodDt) {
        doSetProdDt_NotEqual(fRES(prodDt));
    }

    protected void doSetProdDt_NotEqual(String prodDt) {
        regProdDt(CK_NES, prodDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterThan(String prodDt) {
        regProdDt(CK_GT, fRES(prodDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessThan(String prodDt) {
        regProdDt(CK_LT, fRES(prodDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterEqual(String prodDt) {
        regProdDt(CK_GE, fRES(prodDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessEqual(String prodDt) {
        regProdDt(CK_LE, fRES(prodDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_InScope(Collection<String> prodDtList) {
        doSetProdDt_InScope(prodDtList);
    }

    protected void doSetProdDt_InScope(Collection<String> prodDtList) {
        regINS(CK_INS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotInScope(Collection<String> prodDtList) {
        doSetProdDt_NotInScope(prodDtList);
    }

    protected void doSetProdDt_NotInScope(Collection<String> prodDtList) {
        regINS(CK_NINS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setProdDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDt The value of prodDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDt_LikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDt_NotLikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_PrefixSearch(String prodDt) {
        setProdDt_LikeSearch(prodDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNull() { regProdDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNullOrEmpty() { regProdDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNotNull() { regProdDt(CK_ISNN, DOBJ); }

    protected void regProdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDt(), "PROD_DT"); }
    protected abstract ConditionValue xgetCValueProdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_Equal(String storeReasonCd) {
        doSetStoreReasonCd_Equal(fRES(storeReasonCd));
    }

    protected void doSetStoreReasonCd_Equal(String storeReasonCd) {
        regStoreReasonCd(CK_EQ, storeReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_NotEqual(String storeReasonCd) {
        doSetStoreReasonCd_NotEqual(fRES(storeReasonCd));
    }

    protected void doSetStoreReasonCd_NotEqual(String storeReasonCd) {
        regStoreReasonCd(CK_NES, storeReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_GreaterThan(String storeReasonCd) {
        regStoreReasonCd(CK_GT, fRES(storeReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_LessThan(String storeReasonCd) {
        regStoreReasonCd(CK_LT, fRES(storeReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_GreaterEqual(String storeReasonCd) {
        regStoreReasonCd(CK_GE, fRES(storeReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_LessEqual(String storeReasonCd) {
        regStoreReasonCd(CK_LE, fRES(storeReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCdList The collection of storeReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_InScope(Collection<String> storeReasonCdList) {
        doSetStoreReasonCd_InScope(storeReasonCdList);
    }

    protected void doSetStoreReasonCd_InScope(Collection<String> storeReasonCdList) {
        regINS(CK_INS, cTL(storeReasonCdList), xgetCValueStoreReasonCd(), "STORE_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCdList The collection of storeReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_NotInScope(Collection<String> storeReasonCdList) {
        doSetStoreReasonCd_NotInScope(storeReasonCdList);
    }

    protected void doSetStoreReasonCd_NotInScope(Collection<String> storeReasonCdList) {
        regINS(CK_NINS, cTL(storeReasonCdList), xgetCValueStoreReasonCd(), "STORE_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeReasonCd The value of storeReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreReasonCd_LikeSearch(String storeReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeReasonCd), xgetCValueStoreReasonCd(), "STORE_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreReasonCd_NotLikeSearch(String storeReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeReasonCd), xgetCValueStoreReasonCd(), "STORE_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_PrefixSearch(String storeReasonCd) {
        setStoreReasonCd_LikeSearch(storeReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNull() { regStoreReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNullOrEmpty() { regStoreReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNotNull() { regStoreReasonCd(CK_ISNN, DOBJ); }

    protected void regStoreReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreReasonCd(), "STORE_REASON_CD"); }
    protected abstract ConditionValue xgetCValueStoreReasonCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_Equal(String receiveNo) {
        doSetReceiveNo_Equal(fRES(receiveNo));
    }

    protected void doSetReceiveNo_Equal(String receiveNo) {
        regReceiveNo(CK_EQ, receiveNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_NotEqual(String receiveNo) {
        doSetReceiveNo_NotEqual(fRES(receiveNo));
    }

    protected void doSetReceiveNo_NotEqual(String receiveNo) {
        regReceiveNo(CK_NES, receiveNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_GreaterThan(String receiveNo) {
        regReceiveNo(CK_GT, fRES(receiveNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_LessThan(String receiveNo) {
        regReceiveNo(CK_LT, fRES(receiveNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_GreaterEqual(String receiveNo) {
        regReceiveNo(CK_GE, fRES(receiveNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_LessEqual(String receiveNo) {
        regReceiveNo(CK_LE, fRES(receiveNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNoList The collection of receiveNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_InScope(Collection<String> receiveNoList) {
        doSetReceiveNo_InScope(receiveNoList);
    }

    protected void doSetReceiveNo_InScope(Collection<String> receiveNoList) {
        regINS(CK_INS, cTL(receiveNoList), xgetCValueReceiveNo(), "RECEIVE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNoList The collection of receiveNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_NotInScope(Collection<String> receiveNoList) {
        doSetReceiveNo_NotInScope(receiveNoList);
    }

    protected void doSetReceiveNo_NotInScope(Collection<String> receiveNoList) {
        regINS(CK_NINS, cTL(receiveNoList), xgetCValueReceiveNo(), "RECEIVE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveNo The value of receiveNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveNo_LikeSearch(String receiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveNo), xgetCValueReceiveNo(), "RECEIVE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveNo_NotLikeSearch(String receiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveNo), xgetCValueReceiveNo(), "RECEIVE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_PrefixSearch(String receiveNo) {
        setReceiveNo_LikeSearch(receiveNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNull() { regReceiveNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNullOrEmpty() { regReceiveNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNotNull() { regReceiveNo(CK_ISNN, DOBJ); }

    protected void regReceiveNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveNo(), "RECEIVE_NO"); }
    protected abstract ConditionValue xgetCValueReceiveNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_Equal(String processTypeCd) {
        doSetProcessTypeCd_Equal(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_Equal(String processTypeCd) {
        regProcessTypeCd(CK_EQ, processTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotEqual(String processTypeCd) {
        doSetProcessTypeCd_NotEqual(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_NotEqual(String processTypeCd) {
        regProcessTypeCd(CK_NES, processTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterThan(String processTypeCd) {
        regProcessTypeCd(CK_GT, fRES(processTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessThan(String processTypeCd) {
        regProcessTypeCd(CK_LT, fRES(processTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterEqual(String processTypeCd) {
        regProcessTypeCd(CK_GE, fRES(processTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessEqual(String processTypeCd) {
        regProcessTypeCd(CK_LE, fRES(processTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCdList The collection of processTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_InScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        regINS(CK_INS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCdList The collection of processTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_NotInScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        regINS(CK_NINS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setProcessTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processTypeCd The value of processTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessTypeCd_LikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessTypeCd_NotLikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_PrefixSearch(String processTypeCd) {
        setProcessTypeCd_LikeSearch(processTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNull() { regProcessTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNullOrEmpty() { regProcessTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNotNull() { regProcessTypeCd(CK_ISNN, DOBJ); }

    protected void regProcessTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProcessTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_Equal(String slipNo) {
        doSetSlipNo_Equal(fRES(slipNo));
    }

    protected void doSetSlipNo_Equal(String slipNo) {
        regSlipNo(CK_EQ, slipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotEqual(String slipNo) {
        doSetSlipNo_NotEqual(fRES(slipNo));
    }

    protected void doSetSlipNo_NotEqual(String slipNo) {
        regSlipNo(CK_NES, slipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterThan(String slipNo) {
        regSlipNo(CK_GT, fRES(slipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessThan(String slipNo) {
        regSlipNo(CK_LT, fRES(slipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterEqual(String slipNo) {
        regSlipNo(CK_GE, fRES(slipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessEqual(String slipNo) {
        regSlipNo(CK_LE, fRES(slipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNoList The collection of slipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_InScope(Collection<String> slipNoList) {
        doSetSlipNo_InScope(slipNoList);
    }

    protected void doSetSlipNo_InScope(Collection<String> slipNoList) {
        regINS(CK_INS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNoList The collection of slipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotInScope(Collection<String> slipNoList) {
        doSetSlipNo_NotInScope(slipNoList);
    }

    protected void doSetSlipNo_NotInScope(Collection<String> slipNoList) {
        regINS(CK_NINS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipNo The value of slipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipNo_LikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipNo_NotLikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_PrefixSearch(String slipNo) {
        setSlipNo_LikeSearch(slipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNull() { regSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNullOrEmpty() { regSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNotNull() { regSlipNo(CK_ISNN, DOBJ); }

    protected void regSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipNo(), "SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSlipNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_Equal(Long receiveUnitNum) {
        doSetReceiveUnitNum_Equal(receiveUnitNum);
    }

    protected void doSetReceiveUnitNum_Equal(Long receiveUnitNum) {
        regReceiveUnitNum(CK_EQ, receiveUnitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_NotEqual(Long receiveUnitNum) {
        doSetReceiveUnitNum_NotEqual(receiveUnitNum);
    }

    protected void doSetReceiveUnitNum_NotEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_NES, receiveUnitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_GreaterThan(Long receiveUnitNum) {
        regReceiveUnitNum(CK_GT, receiveUnitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_LessThan(Long receiveUnitNum) {
        regReceiveUnitNum(CK_LT, receiveUnitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_GreaterEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_GE, receiveUnitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_LessEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_LE, receiveUnitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param minNumber The min number of receiveUnitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveUnitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveUnitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNumList The collection of receiveUnitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_InScope(Collection<Long> receiveUnitNumList) {
        doSetReceiveUnitNum_InScope(receiveUnitNumList);
    }

    protected void doSetReceiveUnitNum_InScope(Collection<Long> receiveUnitNumList) {
        regINS(CK_INS, cTL(receiveUnitNumList), xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNumList The collection of receiveUnitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_NotInScope(Collection<Long> receiveUnitNumList) {
        doSetReceiveUnitNum_NotInScope(receiveUnitNumList);
    }

    protected void doSetReceiveUnitNum_NotInScope(Collection<Long> receiveUnitNumList) {
        regINS(CK_NINS, cTL(receiveUnitNumList), xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     */
    public void setReceiveUnitNum_IsNull() { regReceiveUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     */
    public void setReceiveUnitNum_IsNotNull() { regReceiveUnitNum(CK_ISNN, DOBJ); }

    protected void regReceiveUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueReceiveUnitNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_Equal(String storeRecordSendFlg) {
        doSetStoreRecordSendFlg_Equal(fRES(storeRecordSendFlg));
    }

    protected void doSetStoreRecordSendFlg_Equal(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_EQ, storeRecordSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_NotEqual(String storeRecordSendFlg) {
        doSetStoreRecordSendFlg_NotEqual(fRES(storeRecordSendFlg));
    }

    protected void doSetStoreRecordSendFlg_NotEqual(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_NES, storeRecordSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_GreaterThan(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_GT, fRES(storeRecordSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_LessThan(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_LT, fRES(storeRecordSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_GreaterEqual(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_GE, fRES(storeRecordSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_LessEqual(String storeRecordSendFlg) {
        regStoreRecordSendFlg(CK_LE, fRES(storeRecordSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlgList The collection of storeRecordSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_InScope(Collection<String> storeRecordSendFlgList) {
        doSetStoreRecordSendFlg_InScope(storeRecordSendFlgList);
    }

    protected void doSetStoreRecordSendFlg_InScope(Collection<String> storeRecordSendFlgList) {
        regINS(CK_INS, cTL(storeRecordSendFlgList), xgetCValueStoreRecordSendFlg(), "STORE_RECORD_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlgList The collection of storeRecordSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_NotInScope(Collection<String> storeRecordSendFlgList) {
        doSetStoreRecordSendFlg_NotInScope(storeRecordSendFlgList);
    }

    protected void doSetStoreRecordSendFlg_NotInScope(Collection<String> storeRecordSendFlgList) {
        regINS(CK_NINS, cTL(storeRecordSendFlgList), xgetCValueStoreRecordSendFlg(), "STORE_RECORD_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)} <br>
     * <pre>e.g. setStoreRecordSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeRecordSendFlg The value of storeRecordSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreRecordSendFlg_LikeSearch(String storeRecordSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeRecordSendFlg), xgetCValueStoreRecordSendFlg(), "STORE_RECORD_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreRecordSendFlg_NotLikeSearch(String storeRecordSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeRecordSendFlg), xgetCValueStoreRecordSendFlg(), "STORE_RECORD_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     * @param storeRecordSendFlg The value of storeRecordSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRecordSendFlg_PrefixSearch(String storeRecordSendFlg) {
        setStoreRecordSendFlg_LikeSearch(storeRecordSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     */
    public void setStoreRecordSendFlg_IsNull() { regStoreRecordSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     */
    public void setStoreRecordSendFlg_IsNullOrEmpty() { regStoreRecordSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_RECORD_SEND_FLG: {CHAR(1)}
     */
    public void setStoreRecordSendFlg_IsNotNull() { regStoreRecordSendFlg(CK_ISNN, DOBJ); }

    protected void regStoreRecordSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRecordSendFlg(), "STORE_RECORD_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueStoreRecordSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_Equal(String transferSendFlg) {
        doSetTransferSendFlg_Equal(fRES(transferSendFlg));
    }

    protected void doSetTransferSendFlg_Equal(String transferSendFlg) {
        regTransferSendFlg(CK_EQ, transferSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_NotEqual(String transferSendFlg) {
        doSetTransferSendFlg_NotEqual(fRES(transferSendFlg));
    }

    protected void doSetTransferSendFlg_NotEqual(String transferSendFlg) {
        regTransferSendFlg(CK_NES, transferSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_GreaterThan(String transferSendFlg) {
        regTransferSendFlg(CK_GT, fRES(transferSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_LessThan(String transferSendFlg) {
        regTransferSendFlg(CK_LT, fRES(transferSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_GreaterEqual(String transferSendFlg) {
        regTransferSendFlg(CK_GE, fRES(transferSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_LessEqual(String transferSendFlg) {
        regTransferSendFlg(CK_LE, fRES(transferSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlgList The collection of transferSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_InScope(Collection<String> transferSendFlgList) {
        doSetTransferSendFlg_InScope(transferSendFlgList);
    }

    protected void doSetTransferSendFlg_InScope(Collection<String> transferSendFlgList) {
        regINS(CK_INS, cTL(transferSendFlgList), xgetCValueTransferSendFlg(), "TRANSFER_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlgList The collection of transferSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_NotInScope(Collection<String> transferSendFlgList) {
        doSetTransferSendFlg_NotInScope(transferSendFlgList);
    }

    protected void doSetTransferSendFlg_NotInScope(Collection<String> transferSendFlgList) {
        regINS(CK_NINS, cTL(transferSendFlgList), xgetCValueTransferSendFlg(), "TRANSFER_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)} <br>
     * <pre>e.g. setTransferSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transferSendFlg The value of transferSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransferSendFlg_LikeSearch(String transferSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transferSendFlg), xgetCValueTransferSendFlg(), "TRANSFER_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransferSendFlg_NotLikeSearch(String transferSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transferSendFlg), xgetCValueTransferSendFlg(), "TRANSFER_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     * @param transferSendFlg The value of transferSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferSendFlg_PrefixSearch(String transferSendFlg) {
        setTransferSendFlg_LikeSearch(transferSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     */
    public void setTransferSendFlg_IsNull() { regTransferSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     */
    public void setTransferSendFlg_IsNullOrEmpty() { regTransferSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSFER_SEND_FLG: {CHAR(1)}
     */
    public void setTransferSendFlg_IsNotNull() { regTransferSendFlg(CK_ISNN, DOBJ); }

    protected void regTransferSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransferSendFlg(), "TRANSFER_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueTransferSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_Equal(String productStoreStatus) {
        doSetProductStoreStatus_Equal(fRES(productStoreStatus));
    }

    protected void doSetProductStoreStatus_Equal(String productStoreStatus) {
        regProductStoreStatus(CK_EQ, productStoreStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_NotEqual(String productStoreStatus) {
        doSetProductStoreStatus_NotEqual(fRES(productStoreStatus));
    }

    protected void doSetProductStoreStatus_NotEqual(String productStoreStatus) {
        regProductStoreStatus(CK_NES, productStoreStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_GreaterThan(String productStoreStatus) {
        regProductStoreStatus(CK_GT, fRES(productStoreStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_LessThan(String productStoreStatus) {
        regProductStoreStatus(CK_LT, fRES(productStoreStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_GreaterEqual(String productStoreStatus) {
        regProductStoreStatus(CK_GE, fRES(productStoreStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_LessEqual(String productStoreStatus) {
        regProductStoreStatus(CK_LE, fRES(productStoreStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatusList The collection of productStoreStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_InScope(Collection<String> productStoreStatusList) {
        doSetProductStoreStatus_InScope(productStoreStatusList);
    }

    protected void doSetProductStoreStatus_InScope(Collection<String> productStoreStatusList) {
        regINS(CK_INS, cTL(productStoreStatusList), xgetCValueProductStoreStatus(), "PRODUCT_STORE_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatusList The collection of productStoreStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_NotInScope(Collection<String> productStoreStatusList) {
        doSetProductStoreStatus_NotInScope(productStoreStatusList);
    }

    protected void doSetProductStoreStatus_NotInScope(Collection<String> productStoreStatusList) {
        regINS(CK_NINS, cTL(productStoreStatusList), xgetCValueProductStoreStatus(), "PRODUCT_STORE_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)} <br>
     * <pre>e.g. setProductStoreStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productStoreStatus The value of productStoreStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStoreStatus_LikeSearch(String productStoreStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStoreStatus), xgetCValueProductStoreStatus(), "PRODUCT_STORE_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStoreStatus_NotLikeSearch(String productStoreStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStoreStatus), xgetCValueProductStoreStatus(), "PRODUCT_STORE_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     * @param productStoreStatus The value of productStoreStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductStoreStatus_PrefixSearch(String productStoreStatus) {
        setProductStoreStatus_LikeSearch(productStoreStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     */
    public void setProductStoreStatus_IsNull() { regProductStoreStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     */
    public void setProductStoreStatus_IsNullOrEmpty() { regProductStoreStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_STORE_STATUS: {VARCHAR(30)}
     */
    public void setProductStoreStatus_IsNotNull() { regProductStoreStatus(CK_ISNN, DOBJ); }

    protected void regProductStoreStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductStoreStatus(), "PRODUCT_STORE_STATUS"); }
    protected abstract ConditionValue xgetCValueProductStoreStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {BIGINT(19)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {BIGINT(19)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_Equal(String cmSendFlgStore) {
        doSetCmSendFlgStore_Equal(fRES(cmSendFlgStore));
    }

    protected void doSetCmSendFlgStore_Equal(String cmSendFlgStore) {
        regCmSendFlgStore(CK_EQ, cmSendFlgStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_NotEqual(String cmSendFlgStore) {
        doSetCmSendFlgStore_NotEqual(fRES(cmSendFlgStore));
    }

    protected void doSetCmSendFlgStore_NotEqual(String cmSendFlgStore) {
        regCmSendFlgStore(CK_NES, cmSendFlgStore);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_GreaterThan(String cmSendFlgStore) {
        regCmSendFlgStore(CK_GT, fRES(cmSendFlgStore));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_LessThan(String cmSendFlgStore) {
        regCmSendFlgStore(CK_LT, fRES(cmSendFlgStore));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_GreaterEqual(String cmSendFlgStore) {
        regCmSendFlgStore(CK_GE, fRES(cmSendFlgStore));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_LessEqual(String cmSendFlgStore) {
        regCmSendFlgStore(CK_LE, fRES(cmSendFlgStore));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStoreList The collection of cmSendFlgStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_InScope(Collection<String> cmSendFlgStoreList) {
        doSetCmSendFlgStore_InScope(cmSendFlgStoreList);
    }

    protected void doSetCmSendFlgStore_InScope(Collection<String> cmSendFlgStoreList) {
        regINS(CK_INS, cTL(cmSendFlgStoreList), xgetCValueCmSendFlgStore(), "CM_SEND_FLG_STORE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStoreList The collection of cmSendFlgStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_NotInScope(Collection<String> cmSendFlgStoreList) {
        doSetCmSendFlgStore_NotInScope(cmSendFlgStoreList);
    }

    protected void doSetCmSendFlgStore_NotInScope(Collection<String> cmSendFlgStoreList) {
        regINS(CK_NINS, cTL(cmSendFlgStoreList), xgetCValueCmSendFlgStore(), "CM_SEND_FLG_STORE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setCmSendFlgStore_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmSendFlgStore The value of cmSendFlgStore as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmSendFlgStore_LikeSearch(String cmSendFlgStore, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmSendFlgStore), xgetCValueCmSendFlgStore(), "CM_SEND_FLG_STORE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmSendFlgStore_NotLikeSearch(String cmSendFlgStore, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmSendFlgStore), xgetCValueCmSendFlgStore(), "CM_SEND_FLG_STORE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     * @param cmSendFlgStore The value of cmSendFlgStore as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgStore_PrefixSearch(String cmSendFlgStore) {
        setCmSendFlgStore_LikeSearch(cmSendFlgStore, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgStore_IsNull() { regCmSendFlgStore(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgStore_IsNullOrEmpty() { regCmSendFlgStore(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgStore_IsNotNull() { regCmSendFlgStore(CK_ISNN, DOBJ); }

    protected void regCmSendFlgStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmSendFlgStore(), "CM_SEND_FLG_STORE"); }
    protected abstract ConditionValue xgetCValueCmSendFlgStore();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_Equal(String cmSendFlgTransfer) {
        doSetCmSendFlgTransfer_Equal(fRES(cmSendFlgTransfer));
    }

    protected void doSetCmSendFlgTransfer_Equal(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_EQ, cmSendFlgTransfer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_NotEqual(String cmSendFlgTransfer) {
        doSetCmSendFlgTransfer_NotEqual(fRES(cmSendFlgTransfer));
    }

    protected void doSetCmSendFlgTransfer_NotEqual(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_NES, cmSendFlgTransfer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_GreaterThan(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_GT, fRES(cmSendFlgTransfer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_LessThan(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_LT, fRES(cmSendFlgTransfer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_GreaterEqual(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_GE, fRES(cmSendFlgTransfer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_LessEqual(String cmSendFlgTransfer) {
        regCmSendFlgTransfer(CK_LE, fRES(cmSendFlgTransfer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransferList The collection of cmSendFlgTransfer as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_InScope(Collection<String> cmSendFlgTransferList) {
        doSetCmSendFlgTransfer_InScope(cmSendFlgTransferList);
    }

    protected void doSetCmSendFlgTransfer_InScope(Collection<String> cmSendFlgTransferList) {
        regINS(CK_INS, cTL(cmSendFlgTransferList), xgetCValueCmSendFlgTransfer(), "CM_SEND_FLG_TRANSFER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransferList The collection of cmSendFlgTransfer as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_NotInScope(Collection<String> cmSendFlgTransferList) {
        doSetCmSendFlgTransfer_NotInScope(cmSendFlgTransferList);
    }

    protected void doSetCmSendFlgTransfer_NotInScope(Collection<String> cmSendFlgTransferList) {
        regINS(CK_NINS, cTL(cmSendFlgTransferList), xgetCValueCmSendFlgTransfer(), "CM_SEND_FLG_TRANSFER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setCmSendFlgTransfer_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmSendFlgTransfer_LikeSearch(String cmSendFlgTransfer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmSendFlgTransfer), xgetCValueCmSendFlgTransfer(), "CM_SEND_FLG_TRANSFER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmSendFlgTransfer_NotLikeSearch(String cmSendFlgTransfer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmSendFlgTransfer), xgetCValueCmSendFlgTransfer(), "CM_SEND_FLG_TRANSFER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     * @param cmSendFlgTransfer The value of cmSendFlgTransfer as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmSendFlgTransfer_PrefixSearch(String cmSendFlgTransfer) {
        setCmSendFlgTransfer_LikeSearch(cmSendFlgTransfer, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgTransfer_IsNull() { regCmSendFlgTransfer(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgTransfer_IsNullOrEmpty() { regCmSendFlgTransfer(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
     */
    public void setCmSendFlgTransfer_IsNotNull() { regCmSendFlgTransfer(CK_ISNN, DOBJ); }

    protected void regCmSendFlgTransfer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmSendFlgTransfer(), "CM_SEND_FLG_TRANSFER"); }
    protected abstract ConditionValue xgetCValueCmSendFlgTransfer();

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
    public HpSLCFunction<TStoreRecordBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStoreRecordBCB.class);
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
    public HpSLCFunction<TStoreRecordBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStoreRecordBCB.class);
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
    public HpSLCFunction<TStoreRecordBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStoreRecordBCB.class);
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
    public HpSLCFunction<TStoreRecordBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStoreRecordBCB.class);
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
    public HpSLCFunction<TStoreRecordBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStoreRecordBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStoreRecordBCB&gt;() {
     *     public void query(TStoreRecordBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStoreRecordBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStoreRecordBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStoreRecordBCQ sq);

    protected TStoreRecordBCB xcreateScalarConditionCB() {
        TStoreRecordBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStoreRecordBCB xcreateScalarConditionPartitionByCB() {
        TStoreRecordBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStoreRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STORE_RECORD_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStoreRecordBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStoreRecordBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STORE_RECORD_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStoreRecordBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStoreRecordBCQ sq);

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
    protected TStoreRecordBCB newMyCB() {
        return new TStoreRecordBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStoreRecordBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
