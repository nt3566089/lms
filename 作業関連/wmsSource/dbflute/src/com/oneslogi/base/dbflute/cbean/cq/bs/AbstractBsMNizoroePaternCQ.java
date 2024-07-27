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
 * The abstract condition-query of m_nizoroe_patern.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMNizoroePaternCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMNizoroePaternCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_nizoroe_patern";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_Equal(Long nizoroePaternId) {
        doSetNizoroePaternId_Equal(nizoroePaternId);
    }

    protected void doSetNizoroePaternId_Equal(Long nizoroePaternId) {
        regNizoroePaternId(CK_EQ, nizoroePaternId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_NotEqual(Long nizoroePaternId) {
        doSetNizoroePaternId_NotEqual(nizoroePaternId);
    }

    protected void doSetNizoroePaternId_NotEqual(Long nizoroePaternId) {
        regNizoroePaternId(CK_NES, nizoroePaternId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_GreaterThan(Long nizoroePaternId) {
        regNizoroePaternId(CK_GT, nizoroePaternId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_LessThan(Long nizoroePaternId) {
        regNizoroePaternId(CK_LT, nizoroePaternId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_GreaterEqual(Long nizoroePaternId) {
        regNizoroePaternId(CK_GE, nizoroePaternId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternId The value of nizoroePaternId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroePaternId_LessEqual(Long nizoroePaternId) {
        regNizoroePaternId(CK_LE, nizoroePaternId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of nizoroePaternId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nizoroePaternId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNizoroePaternId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNizoroePaternId(), "NIZOROE_PATERN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternIdList The collection of nizoroePaternId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePaternId_InScope(Collection<Long> nizoroePaternIdList) {
        doSetNizoroePaternId_InScope(nizoroePaternIdList);
    }

    protected void doSetNizoroePaternId_InScope(Collection<Long> nizoroePaternIdList) {
        regINS(CK_INS, cTL(nizoroePaternIdList), xgetCValueNizoroePaternId(), "NIZOROE_PATERN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroePaternIdList The collection of nizoroePaternId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroePaternId_NotInScope(Collection<Long> nizoroePaternIdList) {
        doSetNizoroePaternId_NotInScope(nizoroePaternIdList);
    }

    protected void doSetNizoroePaternId_NotInScope(Collection<Long> nizoroePaternIdList) {
        regINS(CK_NINS, cTL(nizoroePaternIdList), xgetCValueNizoroePaternId(), "NIZOROE_PATERN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select NIZOROE_PATERN_ID from m_nizoroe where ...)} <br>
     * m_nizoroe by NIZOROE_PATERN_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMNizoroeList</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MNizoroeList for 'exists'. (NotNull)
     */
    public void existsMNizoroeList(SubQuery<MNizoroeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNizoroePaternId_ExistsReferrer_MNizoroeList(cb.query());
        registerExistsReferrer(cb.query(), "NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", pp, "mNizoroeList");
    }
    public abstract String keepNizoroePaternId_ExistsReferrer_MNizoroeList(MNizoroeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select NIZOROE_PATERN_ID from m_nizoroe where ...)} <br>
     * m_nizoroe by NIZOROE_PATERN_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMNizoroeList</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of NizoroePaternId_NotExistsReferrer_MNizoroeList for 'not exists'. (NotNull)
     */
    public void notExistsMNizoroeList(SubQuery<MNizoroeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepNizoroePaternId_NotExistsReferrer_MNizoroeList(cb.query());
        registerNotExistsReferrer(cb.query(), "NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", pp, "mNizoroeList");
    }
    public abstract String keepNizoroePaternId_NotExistsReferrer_MNizoroeList(MNizoroeCQ sq);

    public void xsderiveMNizoroeList(String fn, SubQuery<MNizoroeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepNizoroePaternId_SpecifyDerivedReferrer_MNizoroeList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", pp, "mNizoroeList", al, op);
    }
    public abstract String keepNizoroePaternId_SpecifyDerivedReferrer_MNizoroeList(MNizoroeCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_nizoroe where ...)} <br>
     * m_nizoroe by NIZOROE_PATERN_ID, named 'MNizoroeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMNizoroeList()</span>.<span style="color: #CC4747">max</span>(nizoroeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     nizoroeCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     nizoroeCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MNizoroeCB> derivedMNizoroeList() {
        return xcreateQDRFunctionMNizoroeList();
    }
    protected HpQDRFunction<MNizoroeCB> xcreateQDRFunctionMNizoroeList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMNizoroeList(fn, sq, rd, vl, op));
    }
    public void xqderiveMNizoroeList(String fn, SubQuery<MNizoroeCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroeCB cb = new MNizoroeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepNizoroePaternId_QueryDerivedReferrer_MNizoroeList(cb.query()); String prpp = keepNizoroePaternId_QueryDerivedReferrer_MNizoroeListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "NIZOROE_PATERN_ID", "NIZOROE_PATERN_ID", sqpp, "mNizoroeList", rd, vl, prpp, op);
    }
    public abstract String keepNizoroePaternId_QueryDerivedReferrer_MNizoroeList(MNizoroeCQ sq);
    public abstract String keepNizoroePaternId_QueryDerivedReferrer_MNizoroeListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNizoroePaternId_IsNull() { regNizoroePaternId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PATERN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNizoroePaternId_IsNotNull() { regNizoroePaternId(CK_ISNN, DOBJ); }

    protected void regNizoroePaternId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroePaternId(), "NIZOROE_PATERN_ID"); }
    protected abstract ConditionValue xgetCValueNizoroePaternId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_Equal(String nizoroeTypeCd) {
        doSetNizoroeTypeCd_Equal(fRES(nizoroeTypeCd));
    }

    protected void doSetNizoroeTypeCd_Equal(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_EQ, nizoroeTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_NotEqual(String nizoroeTypeCd) {
        doSetNizoroeTypeCd_NotEqual(fRES(nizoroeTypeCd));
    }

    protected void doSetNizoroeTypeCd_NotEqual(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_NES, nizoroeTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_GreaterThan(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_GT, fRES(nizoroeTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_LessThan(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_LT, fRES(nizoroeTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_GreaterEqual(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_GE, fRES(nizoroeTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_LessEqual(String nizoroeTypeCd) {
        regNizoroeTypeCd(CK_LE, fRES(nizoroeTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCdList The collection of nizoroeTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_InScope(Collection<String> nizoroeTypeCdList) {
        doSetNizoroeTypeCd_InScope(nizoroeTypeCdList);
    }

    protected void doSetNizoroeTypeCd_InScope(Collection<String> nizoroeTypeCdList) {
        regINS(CK_INS, cTL(nizoroeTypeCdList), xgetCValueNizoroeTypeCd(), "NIZOROE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCdList The collection of nizoroeTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_NotInScope(Collection<String> nizoroeTypeCdList) {
        doSetNizoroeTypeCd_NotInScope(nizoroeTypeCdList);
    }

    protected void doSetNizoroeTypeCd_NotInScope(Collection<String> nizoroeTypeCdList) {
        regINS(CK_NINS, cTL(nizoroeTypeCdList), xgetCValueNizoroeTypeCd(), "NIZOROE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeTypeCd The value of nizoroeTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeTypeCd_LikeSearch(String nizoroeTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeTypeCd), xgetCValueNizoroeTypeCd(), "NIZOROE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeTypeCd_NotLikeSearch(String nizoroeTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeTypeCd), xgetCValueNizoroeTypeCd(), "NIZOROE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     * @param nizoroeTypeCd The value of nizoroeTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeTypeCd_PrefixSearch(String nizoroeTypeCd) {
        setNizoroeTypeCd_LikeSearch(nizoroeTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroeTypeCd_IsNull() { regNizoroeTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroeTypeCd_IsNullOrEmpty() { regNizoroeTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_TYPE_CD: {VARCHAR(30)}
     */
    public void setNizoroeTypeCd_IsNotNull() { regNizoroeTypeCd(CK_ISNN, DOBJ); }

    protected void regNizoroeTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeTypeCd(), "NIZOROE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueNizoroeTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_Equal(String nizoroeProcId) {
        doSetNizoroeProcId_Equal(fRES(nizoroeProcId));
    }

    protected void doSetNizoroeProcId_Equal(String nizoroeProcId) {
        regNizoroeProcId(CK_EQ, nizoroeProcId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_NotEqual(String nizoroeProcId) {
        doSetNizoroeProcId_NotEqual(fRES(nizoroeProcId));
    }

    protected void doSetNizoroeProcId_NotEqual(String nizoroeProcId) {
        regNizoroeProcId(CK_NES, nizoroeProcId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_GreaterThan(String nizoroeProcId) {
        regNizoroeProcId(CK_GT, fRES(nizoroeProcId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_LessThan(String nizoroeProcId) {
        regNizoroeProcId(CK_LT, fRES(nizoroeProcId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_GreaterEqual(String nizoroeProcId) {
        regNizoroeProcId(CK_GE, fRES(nizoroeProcId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_LessEqual(String nizoroeProcId) {
        regNizoroeProcId(CK_LE, fRES(nizoroeProcId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcIdList The collection of nizoroeProcId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_InScope(Collection<String> nizoroeProcIdList) {
        doSetNizoroeProcId_InScope(nizoroeProcIdList);
    }

    protected void doSetNizoroeProcId_InScope(Collection<String> nizoroeProcIdList) {
        regINS(CK_INS, cTL(nizoroeProcIdList), xgetCValueNizoroeProcId(), "NIZOROE_PROC_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcIdList The collection of nizoroeProcId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_NotInScope(Collection<String> nizoroeProcIdList) {
        doSetNizoroeProcId_NotInScope(nizoroeProcIdList);
    }

    protected void doSetNizoroeProcId_NotInScope(Collection<String> nizoroeProcIdList) {
        regINS(CK_NINS, cTL(nizoroeProcIdList), xgetCValueNizoroeProcId(), "NIZOROE_PROC_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeProcId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeProcId The value of nizoroeProcId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeProcId_LikeSearch(String nizoroeProcId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeProcId), xgetCValueNizoroeProcId(), "NIZOROE_PROC_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeProcId_NotLikeSearch(String nizoroeProcId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeProcId), xgetCValueNizoroeProcId(), "NIZOROE_PROC_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_ID: {UQ, NotNull, VARCHAR(30)}
     * @param nizoroeProcId The value of nizoroeProcId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcId_PrefixSearch(String nizoroeProcId) {
        setNizoroeProcId_LikeSearch(nizoroeProcId, xcLSOPPre());
    }

    protected void regNizoroeProcId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeProcId(), "NIZOROE_PROC_ID"); }
    protected abstract ConditionValue xgetCValueNizoroeProcId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_Equal(String nizoroeProcNm) {
        doSetNizoroeProcNm_Equal(fRES(nizoroeProcNm));
    }

    protected void doSetNizoroeProcNm_Equal(String nizoroeProcNm) {
        regNizoroeProcNm(CK_EQ, nizoroeProcNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_NotEqual(String nizoroeProcNm) {
        doSetNizoroeProcNm_NotEqual(fRES(nizoroeProcNm));
    }

    protected void doSetNizoroeProcNm_NotEqual(String nizoroeProcNm) {
        regNizoroeProcNm(CK_NES, nizoroeProcNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_GreaterThan(String nizoroeProcNm) {
        regNizoroeProcNm(CK_GT, fRES(nizoroeProcNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_LessThan(String nizoroeProcNm) {
        regNizoroeProcNm(CK_LT, fRES(nizoroeProcNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_GreaterEqual(String nizoroeProcNm) {
        regNizoroeProcNm(CK_GE, fRES(nizoroeProcNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_LessEqual(String nizoroeProcNm) {
        regNizoroeProcNm(CK_LE, fRES(nizoroeProcNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNmList The collection of nizoroeProcNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_InScope(Collection<String> nizoroeProcNmList) {
        doSetNizoroeProcNm_InScope(nizoroeProcNmList);
    }

    protected void doSetNizoroeProcNm_InScope(Collection<String> nizoroeProcNmList) {
        regINS(CK_INS, cTL(nizoroeProcNmList), xgetCValueNizoroeProcNm(), "NIZOROE_PROC_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNmList The collection of nizoroeProcNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_NotInScope(Collection<String> nizoroeProcNmList) {
        doSetNizoroeProcNm_NotInScope(nizoroeProcNmList);
    }

    protected void doSetNizoroeProcNm_NotInScope(Collection<String> nizoroeProcNmList) {
        regINS(CK_NINS, cTL(nizoroeProcNmList), xgetCValueNizoroeProcNm(), "NIZOROE_PROC_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setNizoroeProcNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeProcNm The value of nizoroeProcNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeProcNm_LikeSearch(String nizoroeProcNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeProcNm), xgetCValueNizoroeProcNm(), "NIZOROE_PROC_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeProcNm_NotLikeSearch(String nizoroeProcNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeProcNm), xgetCValueNizoroeProcNm(), "NIZOROE_PROC_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     * @param nizoroeProcNm The value of nizoroeProcNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcNm_PrefixSearch(String nizoroeProcNm) {
        setNizoroeProcNm_LikeSearch(nizoroeProcNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     */
    public void setNizoroeProcNm_IsNull() { regNizoroeProcNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     */
    public void setNizoroeProcNm_IsNullOrEmpty() { regNizoroeProcNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_NM: {VARCHAR(60)}
     */
    public void setNizoroeProcNm_IsNotNull() { regNizoroeProcNm(CK_ISNN, DOBJ); }

    protected void regNizoroeProcNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeProcNm(), "NIZOROE_PROC_NM"); }
    protected abstract ConditionValue xgetCValueNizoroeProcNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_Equal(String programId) {
        doSetProgramId_Equal(fRES(programId));
    }

    protected void doSetProgramId_Equal(String programId) {
        regProgramId(CK_EQ, programId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_NotEqual(String programId) {
        doSetProgramId_NotEqual(fRES(programId));
    }

    protected void doSetProgramId_NotEqual(String programId) {
        regProgramId(CK_NES, programId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_GreaterThan(String programId) {
        regProgramId(CK_GT, fRES(programId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_LessThan(String programId) {
        regProgramId(CK_LT, fRES(programId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_GreaterEqual(String programId) {
        regProgramId(CK_GE, fRES(programId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_LessEqual(String programId) {
        regProgramId(CK_LE, fRES(programId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programIdList The collection of programId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_InScope(Collection<String> programIdList) {
        doSetProgramId_InScope(programIdList);
    }

    protected void doSetProgramId_InScope(Collection<String> programIdList) {
        regINS(CK_INS, cTL(programIdList), xgetCValueProgramId(), "PROGRAM_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programIdList The collection of programId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_NotInScope(Collection<String> programIdList) {
        doSetProgramId_NotInScope(programIdList);
    }

    protected void doSetProgramId_NotInScope(Collection<String> programIdList) {
        regINS(CK_NINS, cTL(programIdList), xgetCValueProgramId(), "PROGRAM_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)} <br>
     * <pre>e.g. setProgramId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param programId The value of programId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProgramId_LikeSearch(String programId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(programId), xgetCValueProgramId(), "PROGRAM_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProgramId_NotLikeSearch(String programId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(programId), xgetCValueProgramId(), "PROGRAM_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     * @param programId The value of programId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProgramId_PrefixSearch(String programId) {
        setProgramId_LikeSearch(programId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     */
    public void setProgramId_IsNull() { regProgramId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     */
    public void setProgramId_IsNullOrEmpty() { regProgramId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROGRAM_ID: {VARCHAR(60)}
     */
    public void setProgramId_IsNotNull() { regProgramId(CK_ISNN, DOBJ); }

    protected void regProgramId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProgramId(), "PROGRAM_ID"); }
    protected abstract ConditionValue xgetCValueProgramId();

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
    public HpSLCFunction<MNizoroePaternCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MNizoroePaternCB.class);
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
    public HpSLCFunction<MNizoroePaternCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MNizoroePaternCB.class);
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
    public HpSLCFunction<MNizoroePaternCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MNizoroePaternCB.class);
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
    public HpSLCFunction<MNizoroePaternCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MNizoroePaternCB.class);
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
    public HpSLCFunction<MNizoroePaternCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MNizoroePaternCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MNizoroePaternCB&gt;() {
     *     public void query(MNizoroePaternCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MNizoroePaternCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MNizoroePaternCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroePaternCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MNizoroePaternCQ sq);

    protected MNizoroePaternCB xcreateScalarConditionCB() {
        MNizoroePaternCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MNizoroePaternCB xcreateScalarConditionPartitionByCB() {
        MNizoroePaternCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MNizoroePaternCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroePaternCB cb = new MNizoroePaternCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NIZOROE_PATERN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MNizoroePaternCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MNizoroePaternCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MNizoroePaternCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MNizoroePaternCB cb = new MNizoroePaternCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NIZOROE_PATERN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MNizoroePaternCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MNizoroePaternCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MNizoroePaternCB cb = new MNizoroePaternCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MNizoroePaternCQ sq);

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
    protected MNizoroePaternCB newMyCB() {
        return new MNizoroePaternCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MNizoroePaternCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
