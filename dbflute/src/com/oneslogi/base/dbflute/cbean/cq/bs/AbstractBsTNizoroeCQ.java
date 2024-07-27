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
 * The abstract condition-query of t_nizoroe.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTNizoroeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTNizoroeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_nizoroe";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_Equal(Long nizoroeId) {
        doSetNizoroeId_Equal(nizoroeId);
    }

    protected void doSetNizoroeId_Equal(Long nizoroeId) {
        regNizoroeId(CK_EQ, nizoroeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_NotEqual(Long nizoroeId) {
        doSetNizoroeId_NotEqual(nizoroeId);
    }

    protected void doSetNizoroeId_NotEqual(Long nizoroeId) {
        regNizoroeId(CK_NES, nizoroeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_GreaterThan(Long nizoroeId) {
        regNizoroeId(CK_GT, nizoroeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_LessThan(Long nizoroeId) {
        regNizoroeId(CK_LT, nizoroeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_GreaterEqual(Long nizoroeId) {
        regNizoroeId(CK_GE, nizoroeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeId The value of nizoroeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNizoroeId_LessEqual(Long nizoroeId) {
        regNizoroeId(CK_LE, nizoroeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of nizoroeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nizoroeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNizoroeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNizoroeId(), "NIZOROE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeIdList The collection of nizoroeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeId_InScope(Collection<Long> nizoroeIdList) {
        doSetNizoroeId_InScope(nizoroeIdList);
    }

    protected void doSetNizoroeId_InScope(Collection<Long> nizoroeIdList) {
        regINS(CK_INS, cTL(nizoroeIdList), xgetCValueNizoroeId(), "NIZOROE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param nizoroeIdList The collection of nizoroeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeId_NotInScope(Collection<Long> nizoroeIdList) {
        doSetNizoroeId_NotInScope(nizoroeIdList);
    }

    protected void doSetNizoroeId_NotInScope(Collection<Long> nizoroeIdList) {
        regINS(CK_NINS, cTL(nizoroeIdList), xgetCValueNizoroeId(), "NIZOROE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNizoroeId_IsNull() { regNizoroeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setNizoroeId_IsNotNull() { regNizoroeId(CK_ISNN, DOBJ); }

    protected void regNizoroeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeId(), "NIZOROE_ID"); }
    protected abstract ConditionValue xgetCValueNizoroeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_Equal(String baseCd) {
        doSetBaseCd_Equal(fRES(baseCd));
    }

    protected void doSetBaseCd_Equal(String baseCd) {
        regBaseCd(CK_EQ, baseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotEqual(String baseCd) {
        doSetBaseCd_NotEqual(fRES(baseCd));
    }

    protected void doSetBaseCd_NotEqual(String baseCd) {
        regBaseCd(CK_NES, baseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterThan(String baseCd) {
        regBaseCd(CK_GT, fRES(baseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessThan(String baseCd) {
        regBaseCd(CK_LT, fRES(baseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterEqual(String baseCd) {
        regBaseCd(CK_GE, fRES(baseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessEqual(String baseCd) {
        regBaseCd(CK_LE, fRES(baseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_InScope(Collection<String> baseCdList) {
        doSetBaseCd_InScope(baseCdList);
    }

    protected void doSetBaseCd_InScope(Collection<String> baseCdList) {
        regINS(CK_INS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotInScope(Collection<String> baseCdList) {
        doSetBaseCd_NotInScope(baseCdList);
    }

    protected void doSetBaseCd_NotInScope(Collection<String> baseCdList) {
        regINS(CK_NINS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setBaseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseCd The value of baseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseCd_LikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseCd_NotLikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_PrefixSearch(String baseCd) {
        setBaseCd_LikeSearch(baseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNull() { regBaseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNullOrEmpty() { regBaseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNotNull() { regBaseCd(CK_ISNN, DOBJ); }

    protected void regBaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseCd(), "BASE_CD"); }
    protected abstract ConditionValue xgetCValueBaseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_Equal(String nizoroeProcUnit) {
        doSetNizoroeProcUnit_Equal(fRES(nizoroeProcUnit));
    }

    protected void doSetNizoroeProcUnit_Equal(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_EQ, nizoroeProcUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_NotEqual(String nizoroeProcUnit) {
        doSetNizoroeProcUnit_NotEqual(fRES(nizoroeProcUnit));
    }

    protected void doSetNizoroeProcUnit_NotEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_NES, nizoroeProcUnit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_GreaterThan(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_GT, fRES(nizoroeProcUnit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_LessThan(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_LT, fRES(nizoroeProcUnit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_GreaterEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_GE, fRES(nizoroeProcUnit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_LessEqual(String nizoroeProcUnit) {
        regNizoroeProcUnit(CK_LE, fRES(nizoroeProcUnit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnitList The collection of nizoroeProcUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_InScope(Collection<String> nizoroeProcUnitList) {
        doSetNizoroeProcUnit_InScope(nizoroeProcUnitList);
    }

    protected void doSetNizoroeProcUnit_InScope(Collection<String> nizoroeProcUnitList) {
        regINS(CK_INS, cTL(nizoroeProcUnitList), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnitList The collection of nizoroeProcUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_NotInScope(Collection<String> nizoroeProcUnitList) {
        doSetNizoroeProcUnit_NotInScope(nizoroeProcUnitList);
    }

    protected void doSetNizoroeProcUnit_NotInScope(Collection<String> nizoroeProcUnitList) {
        regINS(CK_NINS, cTL(nizoroeProcUnitList), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeProcUnit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeProcUnit The value of nizoroeProcUnit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeProcUnit_LikeSearch(String nizoroeProcUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeProcUnit), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeProcUnit_NotLikeSearch(String nizoroeProcUnit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeProcUnit), xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     * @param nizoroeProcUnit The value of nizoroeProcUnit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeProcUnit_PrefixSearch(String nizoroeProcUnit) {
        setNizoroeProcUnit_LikeSearch(nizoroeProcUnit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNull() { regNizoroeProcUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNullOrEmpty() { regNizoroeProcUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_PROC_UNIT: {VARCHAR(30)}
     */
    public void setNizoroeProcUnit_IsNotNull() { regNizoroeProcUnit(CK_ISNN, DOBJ); }

    protected void regNizoroeProcUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeProcUnit(), "NIZOROE_PROC_UNIT"); }
    protected abstract ConditionValue xgetCValueNizoroeProcUnit();

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
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_Equal(String status) {
        doSetStatus_Equal(fRES(status));
    }

    protected void doSetStatus_Equal(String status) {
        regStatus(CK_EQ, status);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotEqual(String status) {
        doSetStatus_NotEqual(fRES(status));
    }

    protected void doSetStatus_NotEqual(String status) {
        regStatus(CK_NES, status);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterThan(String status) {
        regStatus(CK_GT, fRES(status));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessThan(String status) {
        regStatus(CK_LT, fRES(status));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_GreaterEqual(String status) {
        regStatus(CK_GE, fRES(status));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_LessEqual(String status) {
        regStatus(CK_LE, fRES(status));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param statusList The collection of status as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_InScope(Collection<String> statusList) {
        doSetStatus_InScope(statusList);
    }

    protected void doSetStatus_InScope(Collection<String> statusList) {
        regINS(CK_INS, cTL(statusList), xgetCValueStatus(), "STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param statusList The collection of status as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_NotInScope(Collection<String> statusList) {
        doSetStatus_NotInScope(statusList);
    }

    protected void doSetStatus_NotInScope(Collection<String> statusList) {
        regINS(CK_NINS, cTL(statusList), xgetCValueStatus(), "STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {VARCHAR(30)} <br>
     * <pre>e.g. setStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param status The value of status as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatus_LikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(status), xgetCValueStatus(), "STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatus_NotLikeSearch(String status, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(status), xgetCValueStatus(), "STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STATUS: {VARCHAR(30)}
     * @param status The value of status as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStatus_PrefixSearch(String status) {
        setStatus_LikeSearch(status, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     */
    public void setStatus_IsNull() { regStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     */
    public void setStatus_IsNullOrEmpty() { regStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STATUS: {VARCHAR(30)}
     */
    public void setStatus_IsNotNull() { regStatus(CK_ISNN, DOBJ); }

    protected void regStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStatus(), "STATUS"); }
    protected abstract ConditionValue xgetCValueStatus();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_Equal(String procDt) {
        doSetProcDt_Equal(fRES(procDt));
    }

    protected void doSetProcDt_Equal(String procDt) {
        regProcDt(CK_EQ, procDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_NotEqual(String procDt) {
        doSetProcDt_NotEqual(fRES(procDt));
    }

    protected void doSetProcDt_NotEqual(String procDt) {
        regProcDt(CK_NES, procDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_GreaterThan(String procDt) {
        regProcDt(CK_GT, fRES(procDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_LessThan(String procDt) {
        regProcDt(CK_LT, fRES(procDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_GreaterEqual(String procDt) {
        regProcDt(CK_GE, fRES(procDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_LessEqual(String procDt) {
        regProcDt(CK_LE, fRES(procDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDtList The collection of procDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_InScope(Collection<String> procDtList) {
        doSetProcDt_InScope(procDtList);
    }

    protected void doSetProcDt_InScope(Collection<String> procDtList) {
        regINS(CK_INS, cTL(procDtList), xgetCValueProcDt(), "PROC_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDtList The collection of procDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_NotInScope(Collection<String> procDtList) {
        doSetProcDt_NotInScope(procDtList);
    }

    protected void doSetProcDt_NotInScope(Collection<String> procDtList) {
        regINS(CK_NINS, cTL(procDtList), xgetCValueProcDt(), "PROC_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROC_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setProcDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param procDt The value of procDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcDt_LikeSearch(String procDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(procDt), xgetCValueProcDt(), "PROC_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcDt_NotLikeSearch(String procDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(procDt), xgetCValueProcDt(), "PROC_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     * @param procDt The value of procDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcDt_PrefixSearch(String procDt) {
        setProcDt_LikeSearch(procDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     */
    public void setProcDt_IsNull() { regProcDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     */
    public void setProcDt_IsNullOrEmpty() { regProcDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROC_DT: {VARCHAR(8)}
     */
    public void setProcDt_IsNotNull() { regProcDt(CK_ISNN, DOBJ); }

    protected void regProcDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcDt(), "PROC_DT"); }
    protected abstract ConditionValue xgetCValueProcDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @param procStartTime The value of procStartTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcStartTime_Equal(java.sql.Timestamp procStartTime) {
        regProcStartTime(CK_EQ,  procStartTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @param procStartTime The value of procStartTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcStartTime_GreaterThan(java.sql.Timestamp procStartTime) {
        regProcStartTime(CK_GT,  procStartTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @param procStartTime The value of procStartTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcStartTime_LessThan(java.sql.Timestamp procStartTime) {
        regProcStartTime(CK_LT,  procStartTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @param procStartTime The value of procStartTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcStartTime_GreaterEqual(java.sql.Timestamp procStartTime) {
        regProcStartTime(CK_GE,  procStartTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * @param procStartTime The value of procStartTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcStartTime_LessEqual(java.sql.Timestamp procStartTime) {
        regProcStartTime(CK_LE, procStartTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * <pre>e.g. setProcStartTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of procStartTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of procStartTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcStartTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueProcStartTime(), "PROC_START_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of procStartTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of procStartTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setProcStartTime_DateFromTo(Date fromDate, Date toDate) {
        setProcStartTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     */
    public void setProcStartTime_IsNull() { regProcStartTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROC_START_TIME: {DATETIME(19)}
     */
    public void setProcStartTime_IsNotNull() { regProcStartTime(CK_ISNN, DOBJ); }

    protected void regProcStartTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcStartTime(), "PROC_START_TIME"); }
    protected abstract ConditionValue xgetCValueProcStartTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @param procEndTime The value of procEndTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcEndTime_Equal(java.sql.Timestamp procEndTime) {
        regProcEndTime(CK_EQ,  procEndTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @param procEndTime The value of procEndTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcEndTime_GreaterThan(java.sql.Timestamp procEndTime) {
        regProcEndTime(CK_GT,  procEndTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @param procEndTime The value of procEndTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcEndTime_LessThan(java.sql.Timestamp procEndTime) {
        regProcEndTime(CK_LT,  procEndTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @param procEndTime The value of procEndTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcEndTime_GreaterEqual(java.sql.Timestamp procEndTime) {
        regProcEndTime(CK_GE,  procEndTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * @param procEndTime The value of procEndTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcEndTime_LessEqual(java.sql.Timestamp procEndTime) {
        regProcEndTime(CK_LE, procEndTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * <pre>e.g. setProcEndTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of procEndTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of procEndTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcEndTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueProcEndTime(), "PROC_END_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of procEndTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of procEndTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setProcEndTime_DateFromTo(Date fromDate, Date toDate) {
        setProcEndTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     */
    public void setProcEndTime_IsNull() { regProcEndTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROC_END_TIME: {DATETIME(19)}
     */
    public void setProcEndTime_IsNotNull() { regProcEndTime(CK_ISNN, DOBJ); }

    protected void regProcEndTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcEndTime(), "PROC_END_TIME"); }
    protected abstract ConditionValue xgetCValueProcEndTime();

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
    public HpSLCFunction<TNizoroeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TNizoroeCB.class);
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
    public HpSLCFunction<TNizoroeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TNizoroeCB.class);
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
    public HpSLCFunction<TNizoroeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TNizoroeCB.class);
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
    public HpSLCFunction<TNizoroeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TNizoroeCB.class);
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
    public HpSLCFunction<TNizoroeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TNizoroeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TNizoroeCB&gt;() {
     *     public void query(TNizoroeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TNizoroeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TNizoroeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TNizoroeCQ sq);

    protected TNizoroeCB xcreateScalarConditionCB() {
        TNizoroeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TNizoroeCB xcreateScalarConditionPartitionByCB() {
        TNizoroeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TNizoroeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeCB cb = new TNizoroeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "NIZOROE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TNizoroeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TNizoroeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TNizoroeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TNizoroeCB cb = new TNizoroeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "NIZOROE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TNizoroeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TNizoroeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TNizoroeCB cb = new TNizoroeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TNizoroeCQ sq);

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
    protected TNizoroeCB newMyCB() {
        return new TNizoroeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TNizoroeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
