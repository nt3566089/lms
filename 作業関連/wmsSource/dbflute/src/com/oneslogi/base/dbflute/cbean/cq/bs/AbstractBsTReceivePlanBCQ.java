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
 * The abstract condition-query of t_receive_plan_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReceivePlanBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReceivePlanBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_receive_plan_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanBId The value of receivePlanBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterThan(Long receivePlanBId) {
        regReceivePlanBId(CK_GT, receivePlanBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanBId The value of receivePlanBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessThan(Long receivePlanBId) {
        regReceivePlanBId(CK_LT, receivePlanBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanBId The value of receivePlanBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_GE, receivePlanBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanBId The value of receivePlanBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_LE, receivePlanBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanBIdList The collection of receivePlanBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        doSetReceivePlanBId_NotInScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        regINS(CK_NINS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_B_ID from t_receive_label where ...)} <br>
     * t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceiveLabelList</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceiveLabelList for 'exists'. (NotNull)
     */
    public void existsTReceiveLabelList(SubQuery<TReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_ExistsReferrer_TReceiveLabelList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceiveLabelList");
    }
    public abstract String keepReceivePlanBId_ExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_B_ID from t_receive_plan_data_transfer where ...)} <br>
     * t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanDataTransferList</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanDataTransferList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanDataTransferList(SubQuery<TReceivePlanDataTransferCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_ExistsReferrer_TReceivePlanDataTransferList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanDataTransferList");
    }
    public abstract String keepReceivePlanBId_ExistsReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_B_ID from t_receive_plan_spare where ...)} <br>
     * t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanSpareAsOne for 'exists'. (NotNull)
     */
    public void existsTReceivePlanSpareAsOne(SubQuery<TReceivePlanSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanSpareCB cb = new TReceivePlanSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanSpareAsOne");
    }
    public abstract String keepReceivePlanBId_ExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select RECEIVE_PLAN_B_ID from t_store_record_b where ...)} <br>
     * t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordBList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordBList(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_ExistsReferrer_TStoreRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tStoreRecordBList");
    }
    public abstract String keepReceivePlanBId_ExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_B_ID from t_receive_label where ...)} <br>
     * t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceiveLabelList</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanBId_NotExistsReferrer_TReceiveLabelList for 'not exists'. (NotNull)
     */
    public void notExistsTReceiveLabelList(SubQuery<TReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_NotExistsReferrer_TReceiveLabelList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceiveLabelList");
    }
    public abstract String keepReceivePlanBId_NotExistsReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_B_ID from t_receive_plan_data_transfer where ...)} <br>
     * t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanDataTransferList</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanDataTransferList(SubQuery<TReceivePlanDataTransferCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanDataTransferList");
    }
    public abstract String keepReceivePlanBId_NotExistsReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_B_ID from t_receive_plan_spare where ...)} <br>
     * t_receive_plan_spare by RECEIVE_PLAN_B_ID, named 'TReceivePlanSpareAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanSpareAsOne</span>(spareCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     spareCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanSpareAsOne(SubQuery<TReceivePlanSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanSpareCB cb = new TReceivePlanSpareCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanSpareAsOne");
    }
    public abstract String keepReceivePlanBId_NotExistsReferrer_TReceivePlanSpareAsOne(TReceivePlanSpareCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select RECEIVE_PLAN_B_ID from t_store_record_b where ...)} <br>
     * t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ReceivePlanBId_NotExistsReferrer_TStoreRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordBList(SubQuery<TStoreRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepReceivePlanBId_NotExistsReferrer_TStoreRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tStoreRecordBList");
    }
    public abstract String keepReceivePlanBId_NotExistsReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    public void xsderiveTReceiveLabelList(String fn, SubQuery<TReceiveLabelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceiveLabelList", al, op);
    }
    public abstract String keepReceivePlanBId_SpecifyDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq);

    public void xsderiveTReceivePlanDataTransferList(String fn, SubQuery<TReceivePlanDataTransferCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanDataTransferList", al, op);
    }
    public abstract String keepReceivePlanBId_SpecifyDerivedReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq);

    public void xsderiveTStoreRecordBList(String fn, SubQuery<TStoreRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tStoreRecordBList", al, op);
    }
    public abstract String keepReceivePlanBId_SpecifyDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_label where ...)} <br>
     * t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceiveLabelList()</span>.<span style="color: #CC4747">max</span>(labelCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     labelCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     labelCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceiveLabelCB> derivedTReceiveLabelList() {
        return xcreateQDRFunctionTReceiveLabelList();
    }
    protected HpQDRFunction<TReceiveLabelCB> xcreateQDRFunctionTReceiveLabelList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceiveLabelList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceiveLabelList(String fn, SubQuery<TReceiveLabelCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelList(cb.query()); String prpp = keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", sqpp, "tReceiveLabelList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelList(TReceiveLabelCQ sq);
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TReceiveLabelListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_data_transfer where ...)} <br>
     * t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanDataTransferList()</span>.<span style="color: #CC4747">max</span>(transferCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     transferCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     transferCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanDataTransferCB> derivedTReceivePlanDataTransferList() {
        return xcreateQDRFunctionTReceivePlanDataTransferList();
    }
    protected HpQDRFunction<TReceivePlanDataTransferCB> xcreateQDRFunctionTReceivePlanDataTransferList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanDataTransferList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanDataTransferList(String fn, SubQuery<TReceivePlanDataTransferCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList(cb.query()); String prpp = keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", sqpp, "tReceivePlanDataTransferList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferList(TReceivePlanDataTransferCQ sq);
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TReceivePlanDataTransferListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_b where ...)} <br>
     * t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordBCB> derivedTStoreRecordBList() {
        return xcreateQDRFunctionTStoreRecordBList();
    }
    protected HpQDRFunction<TStoreRecordBCB> xcreateQDRFunctionTStoreRecordBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordBList(String fn, SubQuery<TStoreRecordBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList(cb.query()); String prpp = keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", sqpp, "tStoreRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBList(TStoreRecordBCQ sq);
    public abstract String keepReceivePlanBId_QueryDerivedReferrer_TStoreRecordBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanBId_IsNull() { regReceivePlanBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanBId_IsNotNull() { regReceivePlanBId(CK_ISNN, DOBJ); }

    protected void regReceivePlanBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
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
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
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
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
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
     * RECEIVE_PLAN_H_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @param subCBLambda The callback for sub-query of TReceivePlanH for 'in-scope'. (NotNull)
     */
    public void inScopeTReceivePlanH(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanHId_InScopeRelation_TReceivePlanH(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanH", false);
    }
    public abstract String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @param subCBLambda The callback for sub-query of TReceivePlanH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTReceivePlanH(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanH", true);
    }
    public abstract String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq);

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_Equal(Long lineNo) {
        doSetLineNo_Equal(lineNo);
    }

    protected void doSetLineNo_Equal(Long lineNo) {
        regLineNo(CK_EQ, lineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_NotEqual(Long lineNo) {
        doSetLineNo_NotEqual(lineNo);
    }

    protected void doSetLineNo_NotEqual(Long lineNo) {
        regLineNo(CK_NES, lineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterThan(Long lineNo) {
        regLineNo(CK_GT, lineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessThan(Long lineNo) {
        regLineNo(CK_LT, lineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterEqual(Long lineNo) {
        regLineNo(CK_GE, lineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNo The value of lineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessEqual(Long lineNo) {
        regLineNo(CK_LE, lineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param minNumber The min number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineNo(), "LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNoList The collection of lineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_InScope(Collection<Long> lineNoList) {
        doSetLineNo_InScope(lineNoList);
    }

    protected void doSetLineNo_InScope(Collection<Long> lineNoList) {
        regINS(CK_INS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, BIGINT(19)}
     * @param lineNoList The collection of lineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_NotInScope(Collection<Long> lineNoList) {
        doSetLineNo_NotInScope(lineNoList);
    }

    protected void doSetLineNo_NotInScope(Collection<Long> lineNoList) {
        regINS(CK_NINS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    protected void regLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineNo(), "LINE_NO"); }
    protected abstract ConditionValue xgetCValueLineNo();

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
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_Equal(String planClientOrderNo) {
        doSetPlanClientOrderNo_Equal(fRES(planClientOrderNo));
    }

    protected void doSetPlanClientOrderNo_Equal(String planClientOrderNo) {
        regPlanClientOrderNo(CK_EQ, planClientOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_NotEqual(String planClientOrderNo) {
        doSetPlanClientOrderNo_NotEqual(fRES(planClientOrderNo));
    }

    protected void doSetPlanClientOrderNo_NotEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_NES, planClientOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_GreaterThan(String planClientOrderNo) {
        regPlanClientOrderNo(CK_GT, fRES(planClientOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_LessThan(String planClientOrderNo) {
        regPlanClientOrderNo(CK_LT, fRES(planClientOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_GreaterEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_GE, fRES(planClientOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_LessEqual(String planClientOrderNo) {
        regPlanClientOrderNo(CK_LE, fRES(planClientOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNoList The collection of planClientOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_InScope(Collection<String> planClientOrderNoList) {
        doSetPlanClientOrderNo_InScope(planClientOrderNoList);
    }

    protected void doSetPlanClientOrderNo_InScope(Collection<String> planClientOrderNoList) {
        regINS(CK_INS, cTL(planClientOrderNoList), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNoList The collection of planClientOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_NotInScope(Collection<String> planClientOrderNoList) {
        doSetPlanClientOrderNo_NotInScope(planClientOrderNoList);
    }

    protected void doSetPlanClientOrderNo_NotInScope(Collection<String> planClientOrderNoList) {
        regINS(CK_NINS, cTL(planClientOrderNoList), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPlanClientOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planClientOrderNo The value of planClientOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanClientOrderNo_LikeSearch(String planClientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planClientOrderNo), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanClientOrderNo_NotLikeSearch(String planClientOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planClientOrderNo), xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     * @param planClientOrderNo The value of planClientOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanClientOrderNo_PrefixSearch(String planClientOrderNo) {
        setPlanClientOrderNo_LikeSearch(planClientOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientOrderNo_IsNull() { regPlanClientOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientOrderNo_IsNullOrEmpty() { regPlanClientOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_CLIENT_ORDER_NO: {IX, VARCHAR(30)}
     */
    public void setPlanClientOrderNo_IsNotNull() { regPlanClientOrderNo(CK_ISNN, DOBJ); }

    protected void regPlanClientOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanClientOrderNo(), "PLAN_CLIENT_ORDER_NO"); }
    protected abstract ConditionValue xgetCValuePlanClientOrderNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_Equal(Long planWarehouseId) {
        doSetPlanWarehouseId_Equal(planWarehouseId);
    }

    protected void doSetPlanWarehouseId_Equal(Long planWarehouseId) {
        regPlanWarehouseId(CK_EQ, planWarehouseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_NotEqual(Long planWarehouseId) {
        doSetPlanWarehouseId_NotEqual(planWarehouseId);
    }

    protected void doSetPlanWarehouseId_NotEqual(Long planWarehouseId) {
        regPlanWarehouseId(CK_NES, planWarehouseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_GreaterThan(Long planWarehouseId) {
        regPlanWarehouseId(CK_GT, planWarehouseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_LessThan(Long planWarehouseId) {
        regPlanWarehouseId(CK_LT, planWarehouseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_GreaterEqual(Long planWarehouseId) {
        regPlanWarehouseId(CK_GE, planWarehouseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseId The value of planWarehouseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_LessEqual(Long planWarehouseId) {
        regPlanWarehouseId(CK_LE, planWarehouseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param minNumber The min number of planWarehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planWarehouseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanWarehouseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanWarehouseId(), "PLAN_WAREHOUSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseIdList The collection of planWarehouseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_InScope(Collection<Long> planWarehouseIdList) {
        doSetPlanWarehouseId_InScope(planWarehouseIdList);
    }

    protected void doSetPlanWarehouseId_InScope(Collection<Long> planWarehouseIdList) {
        regINS(CK_INS, cTL(planWarehouseIdList), xgetCValuePlanWarehouseId(), "PLAN_WAREHOUSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     * @param planWarehouseIdList The collection of planWarehouseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseId_NotInScope(Collection<Long> planWarehouseIdList) {
        doSetPlanWarehouseId_NotInScope(planWarehouseIdList);
    }

    protected void doSetPlanWarehouseId_NotInScope(Collection<Long> planWarehouseIdList) {
        regINS(CK_NINS, cTL(planWarehouseIdList), xgetCValuePlanWarehouseId(), "PLAN_WAREHOUSE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PLAN_WAREHOUSE_ID from m_warehouse where ...)} <br />
     * m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'in-scope'. (NotNull)
     */
    public void inScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanWarehouseId_InScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", false);
    }
    public abstract String keepPlanWarehouseId_InScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PLAN_WAREHOUSE_ID from m_warehouse where ...)} <br />
     * m_warehouse by my PLAN_WAREHOUSE_ID, named 'MWarehouse'.
     * @param subCBLambda The callback for sub-query of MWarehouse for 'not in-scope'. (NotNull)
     */
    public void notInScopeMWarehouse(SubQuery<MWarehouseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MWarehouseCB cb = new MWarehouseCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanWarehouseId_NotInScopeRelation_MWarehouse(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_WAREHOUSE_ID", "WAREHOUSE_ID", pp, "mWarehouse", true);
    }
    public abstract String keepPlanWarehouseId_NotInScopeRelation_MWarehouse(MWarehouseCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     */
    public void setPlanWarehouseId_IsNull() { regPlanWarehouseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_ID: {IX, BIGINT(19), FK to m_warehouse}
     */
    public void setPlanWarehouseId_IsNotNull() { regPlanWarehouseId(CK_ISNN, DOBJ); }

    protected void regPlanWarehouseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanWarehouseId(), "PLAN_WAREHOUSE_ID"); }
    protected abstract ConditionValue xgetCValuePlanWarehouseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_Equal(String planWarehouseCd) {
        doSetPlanWarehouseCd_Equal(fRES(planWarehouseCd));
    }

    protected void doSetPlanWarehouseCd_Equal(String planWarehouseCd) {
        regPlanWarehouseCd(CK_EQ, planWarehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_NotEqual(String planWarehouseCd) {
        doSetPlanWarehouseCd_NotEqual(fRES(planWarehouseCd));
    }

    protected void doSetPlanWarehouseCd_NotEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_NES, planWarehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_GreaterThan(String planWarehouseCd) {
        regPlanWarehouseCd(CK_GT, fRES(planWarehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_LessThan(String planWarehouseCd) {
        regPlanWarehouseCd(CK_LT, fRES(planWarehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_GreaterEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_GE, fRES(planWarehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_LessEqual(String planWarehouseCd) {
        regPlanWarehouseCd(CK_LE, fRES(planWarehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCdList The collection of planWarehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_InScope(Collection<String> planWarehouseCdList) {
        doSetPlanWarehouseCd_InScope(planWarehouseCdList);
    }

    protected void doSetPlanWarehouseCd_InScope(Collection<String> planWarehouseCdList) {
        regINS(CK_INS, cTL(planWarehouseCdList), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCdList The collection of planWarehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_NotInScope(Collection<String> planWarehouseCdList) {
        doSetPlanWarehouseCd_NotInScope(planWarehouseCdList);
    }

    protected void doSetPlanWarehouseCd_NotInScope(Collection<String> planWarehouseCdList) {
        regINS(CK_NINS, cTL(planWarehouseCdList), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlanWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planWarehouseCd The value of planWarehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanWarehouseCd_LikeSearch(String planWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planWarehouseCd), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanWarehouseCd_NotLikeSearch(String planWarehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planWarehouseCd), xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     * @param planWarehouseCd The value of planWarehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanWarehouseCd_PrefixSearch(String planWarehouseCd) {
        setPlanWarehouseCd_LikeSearch(planWarehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setPlanWarehouseCd_IsNull() { regPlanWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setPlanWarehouseCd_IsNullOrEmpty() { regPlanWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_WAREHOUSE_CD: {VARCHAR(30)}
     */
    public void setPlanWarehouseCd_IsNotNull() { regPlanWarehouseCd(CK_ISNN, DOBJ); }

    protected void regPlanWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanWarehouseCd(), "PLAN_WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValuePlanWarehouseCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, VARCHAR(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_Equal(String planLot) {
        doSetPlanLot_Equal(fRES(planLot));
    }

    protected void doSetPlanLot_Equal(String planLot) {
        regPlanLot(CK_EQ, planLot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_NotEqual(String planLot) {
        doSetPlanLot_NotEqual(fRES(planLot));
    }

    protected void doSetPlanLot_NotEqual(String planLot) {
        regPlanLot(CK_NES, planLot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_GreaterThan(String planLot) {
        regPlanLot(CK_GT, fRES(planLot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_LessThan(String planLot) {
        regPlanLot(CK_LT, fRES(planLot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_GreaterEqual(String planLot) {
        regPlanLot(CK_GE, fRES(planLot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_LessEqual(String planLot) {
        regPlanLot(CK_LE, fRES(planLot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLotList The collection of planLot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_InScope(Collection<String> planLotList) {
        doSetPlanLot_InScope(planLotList);
    }

    protected void doSetPlanLot_InScope(Collection<String> planLotList) {
        regINS(CK_INS, cTL(planLotList), xgetCValuePlanLot(), "PLAN_LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLotList The collection of planLot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_NotInScope(Collection<String> planLotList) {
        doSetPlanLot_NotInScope(planLotList);
    }

    protected void doSetPlanLot_NotInScope(Collection<String> planLotList) {
        regINS(CK_NINS, cTL(planLotList), xgetCValuePlanLot(), "PLAN_LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)} <br>
     * <pre>e.g. setPlanLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLot The value of planLot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLot_LikeSearch(String planLot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLot), xgetCValuePlanLot(), "PLAN_LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLot_NotLikeSearch(String planLot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLot), xgetCValuePlanLot(), "PLAN_LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     * @param planLot The value of planLot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLot_PrefixSearch(String planLot) {
        setPlanLot_LikeSearch(planLot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     */
    public void setPlanLot_IsNull() { regPlanLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     */
    public void setPlanLot_IsNullOrEmpty() { regPlanLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LOT: {VARCHAR(30)}
     */
    public void setPlanLot_IsNotNull() { regPlanLot(CK_ISNN, DOBJ); }

    protected void regPlanLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLot(), "PLAN_LOT"); }
    protected abstract ConditionValue xgetCValuePlanLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_Equal(String planLimitDt) {
        doSetPlanLimitDt_Equal(fRES(planLimitDt));
    }

    protected void doSetPlanLimitDt_Equal(String planLimitDt) {
        regPlanLimitDt(CK_EQ, planLimitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_NotEqual(String planLimitDt) {
        doSetPlanLimitDt_NotEqual(fRES(planLimitDt));
    }

    protected void doSetPlanLimitDt_NotEqual(String planLimitDt) {
        regPlanLimitDt(CK_NES, planLimitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_GreaterThan(String planLimitDt) {
        regPlanLimitDt(CK_GT, fRES(planLimitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_LessThan(String planLimitDt) {
        regPlanLimitDt(CK_LT, fRES(planLimitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_GreaterEqual(String planLimitDt) {
        regPlanLimitDt(CK_GE, fRES(planLimitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_LessEqual(String planLimitDt) {
        regPlanLimitDt(CK_LE, fRES(planLimitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDtList The collection of planLimitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_InScope(Collection<String> planLimitDtList) {
        doSetPlanLimitDt_InScope(planLimitDtList);
    }

    protected void doSetPlanLimitDt_InScope(Collection<String> planLimitDtList) {
        regINS(CK_INS, cTL(planLimitDtList), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDtList The collection of planLimitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_NotInScope(Collection<String> planLimitDtList) {
        doSetPlanLimitDt_NotInScope(planLimitDtList);
    }

    protected void doSetPlanLimitDt_NotInScope(Collection<String> planLimitDtList) {
        regINS(CK_NINS, cTL(planLimitDtList), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setPlanLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLimitDt The value of planLimitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLimitDt_LikeSearch(String planLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLimitDt), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLimitDt_NotLikeSearch(String planLimitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLimitDt), xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     * @param planLimitDt The value of planLimitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLimitDt_PrefixSearch(String planLimitDt) {
        setPlanLimitDt_LikeSearch(planLimitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     */
    public void setPlanLimitDt_IsNull() { regPlanLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     */
    public void setPlanLimitDt_IsNullOrEmpty() { regPlanLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LIMIT_DT: {VARCHAR(8)}
     */
    public void setPlanLimitDt_IsNotNull() { regPlanLimitDt(CK_ISNN, DOBJ); }

    protected void regPlanLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLimitDt(), "PLAN_LIMIT_DT"); }
    protected abstract ConditionValue xgetCValuePlanLimitDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_Equal(Long planLocationId) {
        doSetPlanLocationId_Equal(planLocationId);
    }

    protected void doSetPlanLocationId_Equal(Long planLocationId) {
        regPlanLocationId(CK_EQ, planLocationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_NotEqual(Long planLocationId) {
        doSetPlanLocationId_NotEqual(planLocationId);
    }

    protected void doSetPlanLocationId_NotEqual(Long planLocationId) {
        regPlanLocationId(CK_NES, planLocationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_GreaterThan(Long planLocationId) {
        regPlanLocationId(CK_GT, planLocationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_LessThan(Long planLocationId) {
        regPlanLocationId(CK_LT, planLocationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_GreaterEqual(Long planLocationId) {
        regPlanLocationId(CK_GE, planLocationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationId The value of planLocationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanLocationId_LessEqual(Long planLocationId) {
        regPlanLocationId(CK_LE, planLocationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param minNumber The min number of planLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planLocationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanLocationId(), "PLAN_LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationIdList The collection of planLocationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationId_InScope(Collection<Long> planLocationIdList) {
        doSetPlanLocationId_InScope(planLocationIdList);
    }

    protected void doSetPlanLocationId_InScope(Collection<Long> planLocationIdList) {
        regINS(CK_INS, cTL(planLocationIdList), xgetCValuePlanLocationId(), "PLAN_LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     * @param planLocationIdList The collection of planLocationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationId_NotInScope(Collection<Long> planLocationIdList) {
        doSetPlanLocationId_NotInScope(planLocationIdList);
    }

    protected void doSetPlanLocationId_NotInScope(Collection<Long> planLocationIdList) {
        regINS(CK_NINS, cTL(planLocationIdList), xgetCValuePlanLocationId(), "PLAN_LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PLAN_LOCATION_ID from m_location where ...)} <br />
     * m_location by my PLAN_LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepPlanLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PLAN_LOCATION_ID from m_location where ...)} <br />
     * m_location by my PLAN_LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPlanLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "PLAN_LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepPlanLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setPlanLocationId_IsNull() { regPlanLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
     */
    public void setPlanLocationId_IsNotNull() { regPlanLocationId(CK_ISNN, DOBJ); }

    protected void regPlanLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLocationId(), "PLAN_LOCATION_ID"); }
    protected abstract ConditionValue xgetCValuePlanLocationId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_Equal(String planLocationCd) {
        doSetPlanLocationCd_Equal(fRES(planLocationCd));
    }

    protected void doSetPlanLocationCd_Equal(String planLocationCd) {
        regPlanLocationCd(CK_EQ, planLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_NotEqual(String planLocationCd) {
        doSetPlanLocationCd_NotEqual(fRES(planLocationCd));
    }

    protected void doSetPlanLocationCd_NotEqual(String planLocationCd) {
        regPlanLocationCd(CK_NES, planLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_GreaterThan(String planLocationCd) {
        regPlanLocationCd(CK_GT, fRES(planLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_LessThan(String planLocationCd) {
        regPlanLocationCd(CK_LT, fRES(planLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_GreaterEqual(String planLocationCd) {
        regPlanLocationCd(CK_GE, fRES(planLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_LessEqual(String planLocationCd) {
        regPlanLocationCd(CK_LE, fRES(planLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCdList The collection of planLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_InScope(Collection<String> planLocationCdList) {
        doSetPlanLocationCd_InScope(planLocationCdList);
    }

    protected void doSetPlanLocationCd_InScope(Collection<String> planLocationCdList) {
        regINS(CK_INS, cTL(planLocationCdList), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCdList The collection of planLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_NotInScope(Collection<String> planLocationCdList) {
        doSetPlanLocationCd_NotInScope(planLocationCdList);
    }

    protected void doSetPlanLocationCd_NotInScope(Collection<String> planLocationCdList) {
        regINS(CK_NINS, cTL(planLocationCdList), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlanLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planLocationCd The value of planLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanLocationCd_LikeSearch(String planLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planLocationCd), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanLocationCd_NotLikeSearch(String planLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planLocationCd), xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     * @param planLocationCd The value of planLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanLocationCd_PrefixSearch(String planLocationCd) {
        setPlanLocationCd_LikeSearch(planLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     */
    public void setPlanLocationCd_IsNull() { regPlanLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     */
    public void setPlanLocationCd_IsNullOrEmpty() { regPlanLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_LOCATION_CD: {VARCHAR(30)}
     */
    public void setPlanLocationCd_IsNotNull() { regPlanLocationCd(CK_ISNN, DOBJ); }

    protected void regPlanLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanLocationCd(), "PLAN_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValuePlanLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_Equal(String planStoreLabelNo) {
        doSetPlanStoreLabelNo_Equal(fRES(planStoreLabelNo));
    }

    protected void doSetPlanStoreLabelNo_Equal(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_EQ, planStoreLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_NotEqual(String planStoreLabelNo) {
        doSetPlanStoreLabelNo_NotEqual(fRES(planStoreLabelNo));
    }

    protected void doSetPlanStoreLabelNo_NotEqual(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_NES, planStoreLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_GreaterThan(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_GT, fRES(planStoreLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_LessThan(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_LT, fRES(planStoreLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_GreaterEqual(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_GE, fRES(planStoreLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_LessEqual(String planStoreLabelNo) {
        regPlanStoreLabelNo(CK_LE, fRES(planStoreLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNoList The collection of planStoreLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_InScope(Collection<String> planStoreLabelNoList) {
        doSetPlanStoreLabelNo_InScope(planStoreLabelNoList);
    }

    protected void doSetPlanStoreLabelNo_InScope(Collection<String> planStoreLabelNoList) {
        regINS(CK_INS, cTL(planStoreLabelNoList), xgetCValuePlanStoreLabelNo(), "PLAN_STORE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNoList The collection of planStoreLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_NotInScope(Collection<String> planStoreLabelNoList) {
        doSetPlanStoreLabelNo_NotInScope(planStoreLabelNoList);
    }

    protected void doSetPlanStoreLabelNo_NotInScope(Collection<String> planStoreLabelNoList) {
        regINS(CK_NINS, cTL(planStoreLabelNoList), xgetCValuePlanStoreLabelNo(), "PLAN_STORE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPlanStoreLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planStoreLabelNo The value of planStoreLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanStoreLabelNo_LikeSearch(String planStoreLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planStoreLabelNo), xgetCValuePlanStoreLabelNo(), "PLAN_STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanStoreLabelNo_NotLikeSearch(String planStoreLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planStoreLabelNo), xgetCValuePlanStoreLabelNo(), "PLAN_STORE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     * @param planStoreLabelNo The value of planStoreLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanStoreLabelNo_PrefixSearch(String planStoreLabelNo) {
        setPlanStoreLabelNo_LikeSearch(planStoreLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setPlanStoreLabelNo_IsNull() { regPlanStoreLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setPlanStoreLabelNo_IsNullOrEmpty() { regPlanStoreLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_STORE_LABEL_NO: {VARCHAR(30)}
     */
    public void setPlanStoreLabelNo_IsNotNull() { regPlanStoreLabelNo(CK_ISNN, DOBJ); }

    protected void regPlanStoreLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanStoreLabelNo(), "PLAN_STORE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValuePlanStoreLabelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_Equal(java.math.BigDecimal planNum) {
        doSetPlanNum_Equal(planNum);
    }

    protected void doSetPlanNum_Equal(java.math.BigDecimal planNum) {
        regPlanNum(CK_EQ, planNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_NotEqual(java.math.BigDecimal planNum) {
        doSetPlanNum_NotEqual(planNum);
    }

    protected void doSetPlanNum_NotEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_NES, planNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_GT, planNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessThan(java.math.BigDecimal planNum) {
        regPlanNum(CK_LT, planNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_GreaterEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_GE, planNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNum The value of planNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanNum_LessEqual(java.math.BigDecimal planNum) {
        regPlanNum(CK_LE, planNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanNum(), "PLAN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNumList The collection of planNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_InScope(planNumList);
    }

    protected void doSetPlanNum_InScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_INS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLAN_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param planNumList The collection of planNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        doSetPlanNum_NotInScope(planNumList);
    }

    protected void doSetPlanNum_NotInScope(Collection<java.math.BigDecimal> planNumList) {
        regINS(CK_NINS, cTL(planNumList), xgetCValuePlanNum(), "PLAN_NUM");
    }

    protected void regPlanNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanNum(), "PLAN_NUM"); }
    protected abstract ConditionValue xgetCValuePlanNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    /**
     * Equal(=). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ErrorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
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
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ErrorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg} <br>
     * エラーフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope_AsErrorFlg(Collection<CDef.ErrorFlg> cdefList) {
        doSetErrorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNullOrEmpty() { regErrorFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ErrorFlg}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

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
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_Equal(String storeRowNo) {
        doSetStoreRowNo_Equal(fRES(storeRowNo));
    }

    protected void doSetStoreRowNo_Equal(String storeRowNo) {
        regStoreRowNo(CK_EQ, storeRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_NotEqual(String storeRowNo) {
        doSetStoreRowNo_NotEqual(fRES(storeRowNo));
    }

    protected void doSetStoreRowNo_NotEqual(String storeRowNo) {
        regStoreRowNo(CK_NES, storeRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_GreaterThan(String storeRowNo) {
        regStoreRowNo(CK_GT, fRES(storeRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_LessThan(String storeRowNo) {
        regStoreRowNo(CK_LT, fRES(storeRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_GreaterEqual(String storeRowNo) {
        regStoreRowNo(CK_GE, fRES(storeRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_LessEqual(String storeRowNo) {
        regStoreRowNo(CK_LE, fRES(storeRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNoList The collection of storeRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_InScope(Collection<String> storeRowNoList) {
        doSetStoreRowNo_InScope(storeRowNoList);
    }

    protected void doSetStoreRowNo_InScope(Collection<String> storeRowNoList) {
        regINS(CK_INS, cTL(storeRowNoList), xgetCValueStoreRowNo(), "STORE_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNoList The collection of storeRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_NotInScope(Collection<String> storeRowNoList) {
        doSetStoreRowNo_NotInScope(storeRowNoList);
    }

    protected void doSetStoreRowNo_NotInScope(Collection<String> storeRowNoList) {
        regINS(CK_NINS, cTL(storeRowNoList), xgetCValueStoreRowNo(), "STORE_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeRowNo The value of storeRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreRowNo_LikeSearch(String storeRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeRowNo), xgetCValueStoreRowNo(), "STORE_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreRowNo_NotLikeSearch(String storeRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeRowNo), xgetCValueStoreRowNo(), "STORE_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     * @param storeRowNo The value of storeRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreRowNo_PrefixSearch(String storeRowNo) {
        setStoreRowNo_LikeSearch(storeRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreRowNo_IsNull() { regStoreRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreRowNo_IsNullOrEmpty() { regStoreRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreRowNo_IsNotNull() { regStoreRowNo(CK_ISNN, DOBJ); }

    protected void regStoreRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreRowNo(), "STORE_ROW_NO"); }
    protected abstract ConditionValue xgetCValueStoreRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_Equal(String planProdDt) {
        doSetPlanProdDt_Equal(fRES(planProdDt));
    }

    protected void doSetPlanProdDt_Equal(String planProdDt) {
        regPlanProdDt(CK_EQ, planProdDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_NotEqual(String planProdDt) {
        doSetPlanProdDt_NotEqual(fRES(planProdDt));
    }

    protected void doSetPlanProdDt_NotEqual(String planProdDt) {
        regPlanProdDt(CK_NES, planProdDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_GreaterThan(String planProdDt) {
        regPlanProdDt(CK_GT, fRES(planProdDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_LessThan(String planProdDt) {
        regPlanProdDt(CK_LT, fRES(planProdDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_GreaterEqual(String planProdDt) {
        regPlanProdDt(CK_GE, fRES(planProdDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_LessEqual(String planProdDt) {
        regPlanProdDt(CK_LE, fRES(planProdDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDtList The collection of planProdDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_InScope(Collection<String> planProdDtList) {
        doSetPlanProdDt_InScope(planProdDtList);
    }

    protected void doSetPlanProdDt_InScope(Collection<String> planProdDtList) {
        regINS(CK_INS, cTL(planProdDtList), xgetCValuePlanProdDt(), "PLAN_PROD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDtList The collection of planProdDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_NotInScope(Collection<String> planProdDtList) {
        doSetPlanProdDt_NotInScope(planProdDtList);
    }

    protected void doSetPlanProdDt_NotInScope(Collection<String> planProdDtList) {
        regINS(CK_NINS, cTL(planProdDtList), xgetCValuePlanProdDt(), "PLAN_PROD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setPlanProdDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planProdDt The value of planProdDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanProdDt_LikeSearch(String planProdDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planProdDt), xgetCValuePlanProdDt(), "PLAN_PROD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanProdDt_NotLikeSearch(String planProdDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planProdDt), xgetCValuePlanProdDt(), "PLAN_PROD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     * @param planProdDt The value of planProdDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanProdDt_PrefixSearch(String planProdDt) {
        setPlanProdDt_LikeSearch(planProdDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     */
    public void setPlanProdDt_IsNull() { regPlanProdDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     */
    public void setPlanProdDt_IsNullOrEmpty() { regPlanProdDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLAN_PROD_DT: {VARCHAR(8)}
     */
    public void setPlanProdDt_IsNotNull() { regPlanProdDt(CK_ISNN, DOBJ); }

    protected void regPlanProdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanProdDt(), "PLAN_PROD_DT"); }
    protected abstract ConditionValue xgetCValuePlanProdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_Equal(String hinmokuGroup) {
        doSetHinmokuGroup_Equal(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_Equal(String hinmokuGroup) {
        regHinmokuGroup(CK_EQ, hinmokuGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotEqual(String hinmokuGroup) {
        doSetHinmokuGroup_NotEqual(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_NotEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_NES, hinmokuGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterThan(String hinmokuGroup) {
        regHinmokuGroup(CK_GT, fRES(hinmokuGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessThan(String hinmokuGroup) {
        regHinmokuGroup(CK_LT, fRES(hinmokuGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_GE, fRES(hinmokuGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_LE, fRES(hinmokuGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_InScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        regINS(CK_INS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_NotInScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        regINS(CK_NINS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuGroup The value of hinmokuGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuGroup_LikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuGroup_NotLikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_PrefixSearch(String hinmokuGroup) {
        setHinmokuGroup_LikeSearch(hinmokuGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNull() { regHinmokuGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNullOrEmpty() { regHinmokuGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNotNull() { regHinmokuGroup(CK_ISNN, DOBJ); }

    protected void regHinmokuGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuGroup(), "HINMOKU_GROUP"); }
    protected abstract ConditionValue xgetCValueHinmokuGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_Equal(String hinmokuText) {
        doSetHinmokuText_Equal(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_Equal(String hinmokuText) {
        regHinmokuText(CK_EQ, hinmokuText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotEqual(String hinmokuText) {
        doSetHinmokuText_NotEqual(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_NotEqual(String hinmokuText) {
        regHinmokuText(CK_NES, hinmokuText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_InScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_InScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_InScope(Collection<String> hinmokuTextList) {
        regINS(CK_INS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_NotInScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        regINS(CK_NINS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)} <br>
     * <pre>e.g. setHinmokuText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuText The value of hinmokuText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuText_LikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNotNull() { regHinmokuText(CK_ISNN, DOBJ); }

    protected void regHinmokuText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuText(), "HINMOKU_TEXT"); }
    protected abstract ConditionValue xgetCValueHinmokuText();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_Equal(String unitNm) {
        doSetUnitNm_Equal(fRES(unitNm));
    }

    protected void doSetUnitNm_Equal(String unitNm) {
        regUnitNm(CK_EQ, unitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotEqual(String unitNm) {
        doSetUnitNm_NotEqual(fRES(unitNm));
    }

    protected void doSetUnitNm_NotEqual(String unitNm) {
        regUnitNm(CK_NES, unitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNmList The collection of unitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_InScope(Collection<String> unitNmList) {
        doSetUnitNm_InScope(unitNmList);
    }

    protected void doSetUnitNm_InScope(Collection<String> unitNmList) {
        regINS(CK_INS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNmList The collection of unitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotInScope(Collection<String> unitNmList) {
        doSetUnitNm_NotInScope(unitNmList);
    }

    protected void doSetUnitNm_NotInScope(Collection<String> unitNmList) {
        regINS(CK_NINS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitNm The value of unitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitNm_LikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_Equal(java.math.BigDecimal remainingReceiveNum) {
        doSetRemainingReceiveNum_Equal(remainingReceiveNum);
    }

    protected void doSetRemainingReceiveNum_Equal(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_EQ, remainingReceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_NotEqual(java.math.BigDecimal remainingReceiveNum) {
        doSetRemainingReceiveNum_NotEqual(remainingReceiveNum);
    }

    protected void doSetRemainingReceiveNum_NotEqual(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_NES, remainingReceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_GreaterThan(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_GT, remainingReceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_LessThan(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_LT, remainingReceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_GreaterEqual(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_GE, remainingReceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNum The value of remainingReceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_LessEqual(java.math.BigDecimal remainingReceiveNum) {
        regRemainingReceiveNum(CK_LE, remainingReceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of remainingReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of remainingReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRemainingReceiveNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRemainingReceiveNum(), "REMAINING_RECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNumList The collection of remainingReceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_InScope(Collection<java.math.BigDecimal> remainingReceiveNumList) {
        doSetRemainingReceiveNum_InScope(remainingReceiveNumList);
    }

    protected void doSetRemainingReceiveNum_InScope(Collection<java.math.BigDecimal> remainingReceiveNumList) {
        regINS(CK_INS, cTL(remainingReceiveNumList), xgetCValueRemainingReceiveNum(), "REMAINING_RECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param remainingReceiveNumList The collection of remainingReceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainingReceiveNum_NotInScope(Collection<java.math.BigDecimal> remainingReceiveNumList) {
        doSetRemainingReceiveNum_NotInScope(remainingReceiveNumList);
    }

    protected void doSetRemainingReceiveNum_NotInScope(Collection<java.math.BigDecimal> remainingReceiveNumList) {
        regINS(CK_NINS, cTL(remainingReceiveNumList), xgetCValueRemainingReceiveNum(), "REMAINING_RECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setRemainingReceiveNum_IsNull() { regRemainingReceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REMAINING_RECEIVE_NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setRemainingReceiveNum_IsNotNull() { regRemainingReceiveNum(CK_ISNN, DOBJ); }

    protected void regRemainingReceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemainingReceiveNum(), "REMAINING_RECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueRemainingReceiveNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_Equal(Long lotManagTypeId) {
        doSetLotManagTypeId_Equal(lotManagTypeId);
    }

    protected void doSetLotManagTypeId_Equal(Long lotManagTypeId) {
        regLotManagTypeId(CK_EQ, lotManagTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_NotEqual(Long lotManagTypeId) {
        doSetLotManagTypeId_NotEqual(lotManagTypeId);
    }

    protected void doSetLotManagTypeId_NotEqual(Long lotManagTypeId) {
        regLotManagTypeId(CK_NES, lotManagTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_GreaterThan(Long lotManagTypeId) {
        regLotManagTypeId(CK_GT, lotManagTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_LessThan(Long lotManagTypeId) {
        regLotManagTypeId(CK_LT, lotManagTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_GreaterEqual(Long lotManagTypeId) {
        regLotManagTypeId(CK_GE, lotManagTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeId The value of lotManagTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotManagTypeId_LessEqual(Long lotManagTypeId) {
        regLotManagTypeId(CK_LE, lotManagTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of lotManagTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotManagTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotManagTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotManagTypeId(), "LOT_MANAG_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeIdList The collection of lotManagTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeId_InScope(Collection<Long> lotManagTypeIdList) {
        doSetLotManagTypeId_InScope(lotManagTypeIdList);
    }

    protected void doSetLotManagTypeId_InScope(Collection<Long> lotManagTypeIdList) {
        regINS(CK_INS, cTL(lotManagTypeIdList), xgetCValueLotManagTypeId(), "LOT_MANAG_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     * @param lotManagTypeIdList The collection of lotManagTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeId_NotInScope(Collection<Long> lotManagTypeIdList) {
        doSetLotManagTypeId_NotInScope(lotManagTypeIdList);
    }

    protected void doSetLotManagTypeId_NotInScope(Collection<Long> lotManagTypeIdList) {
        regINS(CK_NINS, cTL(lotManagTypeIdList), xgetCValueLotManagTypeId(), "LOT_MANAG_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     */
    public void setLotManagTypeId_IsNull() { regLotManagTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_ID: {BIGINT(19)}
     */
    public void setLotManagTypeId_IsNotNull() { regLotManagTypeId(CK_ISNN, DOBJ); }

    protected void regLotManagTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagTypeId(), "LOT_MANAG_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueLotManagTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_Equal(String lotManagTypeCd) {
        doSetLotManagTypeCd_Equal(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_Equal(String lotManagTypeCd) {
        regLotManagTypeCd(CK_EQ, lotManagTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        doSetLotManagTypeCd_NotEqual(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_NES, lotManagTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GT, fRES(lotManagTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LT, fRES(lotManagTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GE, fRES(lotManagTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LE, fRES(lotManagTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_InScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_INS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_NotInScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_NINS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLotManagTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotManagTypeCd The value of lotManagTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotManagTypeCd_LikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotManagTypeCd_NotLikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_PrefixSearch(String lotManagTypeCd) {
        setLotManagTypeCd_LikeSearch(lotManagTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNull() { regLotManagTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNullOrEmpty() { regLotManagTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNotNull() { regLotManagTypeCd(CK_ISNN, DOBJ); }

    protected void regLotManagTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotManagTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_Equal(String shippingPlantCd) {
        doSetShippingPlantCd_Equal(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_Equal(String shippingPlantCd) {
        regShippingPlantCd(CK_EQ, shippingPlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotEqual(String shippingPlantCd) {
        doSetShippingPlantCd_NotEqual(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_NotEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_NES, shippingPlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterThan(String shippingPlantCd) {
        regShippingPlantCd(CK_GT, fRES(shippingPlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessThan(String shippingPlantCd) {
        regShippingPlantCd(CK_LT, fRES(shippingPlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_GE, fRES(shippingPlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_LE, fRES(shippingPlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_InScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        regINS(CK_INS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_NotInScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        regINS(CK_NINS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingPlantCd The value of shippingPlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingPlantCd_LikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingPlantCd_NotLikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_PrefixSearch(String shippingPlantCd) {
        setShippingPlantCd_LikeSearch(shippingPlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNull() { regShippingPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNullOrEmpty() { regShippingPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNotNull() { regShippingPlantCd(CK_ISNN, DOBJ); }

    protected void regShippingPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueShippingPlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_Equal(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_EQ, shippingStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_NotEqual(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_NES, shippingStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GT, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LT, fRES(shippingStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GE, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LE, fRES(shippingStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_InScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_INS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_NotInScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_NINS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_LikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_NotLikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_PrefixSearch(String shippingStorageSpaceCd) {
        setShippingStorageSpaceCd_LikeSearch(shippingStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNull() { regShippingStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNullOrEmpty() { regShippingStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNotNull() { regShippingStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regShippingStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueShippingStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_Equal(String remainFlg) {
        doSetRemainFlg_Equal(fRES(remainFlg));
    }

    protected void doSetRemainFlg_Equal(String remainFlg) {
        regRemainFlg(CK_EQ, remainFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_NotEqual(String remainFlg) {
        doSetRemainFlg_NotEqual(fRES(remainFlg));
    }

    protected void doSetRemainFlg_NotEqual(String remainFlg) {
        regRemainFlg(CK_NES, remainFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_GreaterThan(String remainFlg) {
        regRemainFlg(CK_GT, fRES(remainFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_LessThan(String remainFlg) {
        regRemainFlg(CK_LT, fRES(remainFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_GreaterEqual(String remainFlg) {
        regRemainFlg(CK_GE, fRES(remainFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_LessEqual(String remainFlg) {
        regRemainFlg(CK_LE, fRES(remainFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlgList The collection of remainFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_InScope(Collection<String> remainFlgList) {
        doSetRemainFlg_InScope(remainFlgList);
    }

    protected void doSetRemainFlg_InScope(Collection<String> remainFlgList) {
        regINS(CK_INS, cTL(remainFlgList), xgetCValueRemainFlg(), "REMAIN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlgList The collection of remainFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_NotInScope(Collection<String> remainFlgList) {
        doSetRemainFlg_NotInScope(remainFlgList);
    }

    protected void doSetRemainFlg_NotInScope(Collection<String> remainFlgList) {
        regINS(CK_NINS, cTL(remainFlgList), xgetCValueRemainFlg(), "REMAIN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]} <br>
     * <pre>e.g. setRemainFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remainFlg The value of remainFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRemainFlg_LikeSearch(String remainFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remainFlg), xgetCValueRemainFlg(), "REMAIN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRemainFlg_NotLikeSearch(String remainFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remainFlg), xgetCValueRemainFlg(), "REMAIN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REMAIN_FLG: {NotNull, CHAR(1), default=[1]}
     * @param remainFlg The value of remainFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRemainFlg_PrefixSearch(String remainFlg) {
        setRemainFlg_LikeSearch(remainFlg, xcLSOPPre());
    }

    protected void regRemainFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemainFlg(), "REMAIN_FLG"); }
    protected abstract ConditionValue xgetCValueRemainFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_Equal(String wmSendFlg) {
        doSetWmSendFlg_Equal(fRES(wmSendFlg));
    }

    protected void doSetWmSendFlg_Equal(String wmSendFlg) {
        regWmSendFlg(CK_EQ, wmSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_NotEqual(String wmSendFlg) {
        doSetWmSendFlg_NotEqual(fRES(wmSendFlg));
    }

    protected void doSetWmSendFlg_NotEqual(String wmSendFlg) {
        regWmSendFlg(CK_NES, wmSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterThan(String wmSendFlg) {
        regWmSendFlg(CK_GT, fRES(wmSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessThan(String wmSendFlg) {
        regWmSendFlg(CK_LT, fRES(wmSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_GreaterEqual(String wmSendFlg) {
        regWmSendFlg(CK_GE, fRES(wmSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_LessEqual(String wmSendFlg) {
        regWmSendFlg(CK_LE, fRES(wmSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlgList The collection of wmSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_InScope(Collection<String> wmSendFlgList) {
        doSetWmSendFlg_InScope(wmSendFlgList);
    }

    protected void doSetWmSendFlg_InScope(Collection<String> wmSendFlgList) {
        regINS(CK_INS, cTL(wmSendFlgList), xgetCValueWmSendFlg(), "WM_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlgList The collection of wmSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_NotInScope(Collection<String> wmSendFlgList) {
        doSetWmSendFlg_NotInScope(wmSendFlgList);
    }

    protected void doSetWmSendFlg_NotInScope(Collection<String> wmSendFlgList) {
        regINS(CK_NINS, cTL(wmSendFlgList), xgetCValueWmSendFlg(), "WM_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setWmSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmSendFlg The value of wmSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmSendFlg_LikeSearch(String wmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmSendFlg), xgetCValueWmSendFlg(), "WM_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmSendFlg_NotLikeSearch(String wmSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmSendFlg), xgetCValueWmSendFlg(), "WM_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmSendFlg The value of wmSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmSendFlg_PrefixSearch(String wmSendFlg) {
        setWmSendFlg_LikeSearch(wmSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNull() { regWmSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNullOrEmpty() { regWmSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WM_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmSendFlg_IsNotNull() { regWmSendFlg(CK_ISNN, DOBJ); }

    protected void regWmSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmSendFlg(), "WM_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueWmSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_Equal(String lpSendFlg) {
        doSetLpSendFlg_Equal(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_Equal(String lpSendFlg) {
        regLpSendFlg(CK_EQ, lpSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotEqual(String lpSendFlg) {
        doSetLpSendFlg_NotEqual(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_NotEqual(String lpSendFlg) {
        regLpSendFlg(CK_NES, lpSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterThan(String lpSendFlg) {
        regLpSendFlg(CK_GT, fRES(lpSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessThan(String lpSendFlg) {
        regLpSendFlg(CK_LT, fRES(lpSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterEqual(String lpSendFlg) {
        regLpSendFlg(CK_GE, fRES(lpSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessEqual(String lpSendFlg) {
        regLpSendFlg(CK_LE, fRES(lpSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_InScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        regINS(CK_INS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_NotInScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        regINS(CK_NINS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLpSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lpSendFlg The value of lpSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLpSendFlg_LikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLpSendFlg_NotLikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_PrefixSearch(String lpSendFlg) {
        setLpSendFlg_LikeSearch(lpSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNull() { regLpSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNullOrEmpty() { regLpSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNotNull() { regLpSendFlg(CK_ISNN, DOBJ); }

    protected void regLpSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLpSendFlg(), "LP_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueLpSendFlg();

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
    public HpSLCFunction<TReceivePlanBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReceivePlanBCB.class);
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
    public HpSLCFunction<TReceivePlanBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReceivePlanBCB.class);
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
    public HpSLCFunction<TReceivePlanBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReceivePlanBCB.class);
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
    public HpSLCFunction<TReceivePlanBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReceivePlanBCB.class);
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
    public HpSLCFunction<TReceivePlanBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReceivePlanBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReceivePlanBCB&gt;() {
     *     public void query(TReceivePlanBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReceivePlanBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReceivePlanBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReceivePlanBCQ sq);

    protected TReceivePlanBCB xcreateScalarConditionCB() {
        TReceivePlanBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReceivePlanBCB xcreateScalarConditionPartitionByCB() {
        TReceivePlanBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReceivePlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_PLAN_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReceivePlanBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReceivePlanBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_PLAN_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReceivePlanBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReceivePlanBCQ sq);

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
    protected TReceivePlanBCB newMyCB() {
        return new TReceivePlanBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReceivePlanBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
