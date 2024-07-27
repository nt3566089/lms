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
 * The abstract condition-query of t_bldl350n.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl350nCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl350nCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl350n";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_Equal(Long bldl350nId) {
        doSetBldl350nId_Equal(bldl350nId);
    }

    protected void doSetBldl350nId_Equal(Long bldl350nId) {
        regBldl350nId(CK_EQ, bldl350nId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_NotEqual(Long bldl350nId) {
        doSetBldl350nId_NotEqual(bldl350nId);
    }

    protected void doSetBldl350nId_NotEqual(Long bldl350nId) {
        regBldl350nId(CK_NES, bldl350nId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_GreaterThan(Long bldl350nId) {
        regBldl350nId(CK_GT, bldl350nId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_LessThan(Long bldl350nId) {
        regBldl350nId(CK_LT, bldl350nId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_GreaterEqual(Long bldl350nId) {
        regBldl350nId(CK_GE, bldl350nId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nId The value of bldl350nId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350nId_LessEqual(Long bldl350nId) {
        regBldl350nId(CK_LE, bldl350nId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl350nId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl350nId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl350nId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl350nId(), "BLDL350N_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nIdList The collection of bldl350nId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl350nId_InScope(Collection<Long> bldl350nIdList) {
        doSetBldl350nId_InScope(bldl350nIdList);
    }

    protected void doSetBldl350nId_InScope(Collection<Long> bldl350nIdList) {
        regINS(CK_INS, cTL(bldl350nIdList), xgetCValueBldl350nId(), "BLDL350N_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350nIdList The collection of bldl350nId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl350nId_NotInScope(Collection<Long> bldl350nIdList) {
        doSetBldl350nId_NotInScope(bldl350nIdList);
    }

    protected void doSetBldl350nId_NotInScope(Collection<Long> bldl350nIdList) {
        regINS(CK_NINS, cTL(bldl350nIdList), xgetCValueBldl350nId(), "BLDL350N_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl350nId_IsNull() { regBldl350nId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL350N_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl350nId_IsNotNull() { regBldl350nId(CK_ISNN, DOBJ); }

    protected void regBldl350nId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl350nId(), "BLDL350N_ID"); }
    protected abstract ConditionValue xgetCValueBldl350nId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_Equal(String yearmonth) {
        doSetYearmonth_Equal(fRES(yearmonth));
    }

    protected void doSetYearmonth_Equal(String yearmonth) {
        regYearmonth(CK_EQ, yearmonth);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_NotEqual(String yearmonth) {
        doSetYearmonth_NotEqual(fRES(yearmonth));
    }

    protected void doSetYearmonth_NotEqual(String yearmonth) {
        regYearmonth(CK_NES, yearmonth);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_GreaterThan(String yearmonth) {
        regYearmonth(CK_GT, fRES(yearmonth));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_LessThan(String yearmonth) {
        regYearmonth(CK_LT, fRES(yearmonth));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_GreaterEqual(String yearmonth) {
        regYearmonth(CK_GE, fRES(yearmonth));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_LessEqual(String yearmonth) {
        regYearmonth(CK_LE, fRES(yearmonth));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonthList The collection of yearmonth as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_InScope(Collection<String> yearmonthList) {
        doSetYearmonth_InScope(yearmonthList);
    }

    protected void doSetYearmonth_InScope(Collection<String> yearmonthList) {
        regINS(CK_INS, cTL(yearmonthList), xgetCValueYearmonth(), "YEARMONTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonthList The collection of yearmonth as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_NotInScope(Collection<String> yearmonthList) {
        doSetYearmonth_NotInScope(yearmonthList);
    }

    protected void doSetYearmonth_NotInScope(Collection<String> yearmonthList) {
        regINS(CK_NINS, cTL(yearmonthList), xgetCValueYearmonth(), "YEARMONTH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YEARMONTH: {VARCHAR(30)} <br>
     * <pre>e.g. setYearmonth_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param yearmonth The value of yearmonth as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setYearmonth_LikeSearch(String yearmonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(yearmonth), xgetCValueYearmonth(), "YEARMONTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setYearmonth_NotLikeSearch(String yearmonth, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(yearmonth), xgetCValueYearmonth(), "YEARMONTH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     * @param yearmonth The value of yearmonth as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYearmonth_PrefixSearch(String yearmonth) {
        setYearmonth_LikeSearch(yearmonth, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     */
    public void setYearmonth_IsNull() { regYearmonth(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     */
    public void setYearmonth_IsNullOrEmpty() { regYearmonth(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YEARMONTH: {VARCHAR(30)}
     */
    public void setYearmonth_IsNotNull() { regYearmonth(CK_ISNN, DOBJ); }

    protected void regYearmonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYearmonth(), "YEARMONTH"); }
    protected abstract ConditionValue xgetCValueYearmonth();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_Equal(String baseNm) {
        doSetBaseNm_Equal(fRES(baseNm));
    }

    protected void doSetBaseNm_Equal(String baseNm) {
        regBaseNm(CK_EQ, baseNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_NotEqual(String baseNm) {
        doSetBaseNm_NotEqual(fRES(baseNm));
    }

    protected void doSetBaseNm_NotEqual(String baseNm) {
        regBaseNm(CK_NES, baseNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_GreaterThan(String baseNm) {
        regBaseNm(CK_GT, fRES(baseNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_LessThan(String baseNm) {
        regBaseNm(CK_LT, fRES(baseNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_GreaterEqual(String baseNm) {
        regBaseNm(CK_GE, fRES(baseNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_LessEqual(String baseNm) {
        regBaseNm(CK_LE, fRES(baseNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNmList The collection of baseNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_InScope(Collection<String> baseNmList) {
        doSetBaseNm_InScope(baseNmList);
    }

    protected void doSetBaseNm_InScope(Collection<String> baseNmList) {
        regINS(CK_INS, cTL(baseNmList), xgetCValueBaseNm(), "BASE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNmList The collection of baseNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_NotInScope(Collection<String> baseNmList) {
        doSetBaseNm_NotInScope(baseNmList);
    }

    protected void doSetBaseNm_NotInScope(Collection<String> baseNmList) {
        regINS(CK_NINS, cTL(baseNmList), xgetCValueBaseNm(), "BASE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setBaseNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseNm The value of baseNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseNm_LikeSearch(String baseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseNm), xgetCValueBaseNm(), "BASE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseNm_NotLikeSearch(String baseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseNm), xgetCValueBaseNm(), "BASE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     * @param baseNm The value of baseNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseNm_PrefixSearch(String baseNm) {
        setBaseNm_LikeSearch(baseNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNull() { regBaseNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNullOrEmpty() { regBaseNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_NM: {VARCHAR(60)}
     */
    public void setBaseNm_IsNotNull() { regBaseNm(CK_ISNN, DOBJ); }

    protected void regBaseNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseNm(), "BASE_NM"); }
    protected abstract ConditionValue xgetCValueBaseNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_Equal(String month) {
        doSetMonth_Equal(fRES(month));
    }

    protected void doSetMonth_Equal(String month) {
        regMonth(CK_EQ, month);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_NotEqual(String month) {
        doSetMonth_NotEqual(fRES(month));
    }

    protected void doSetMonth_NotEqual(String month) {
        regMonth(CK_NES, month);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_GreaterThan(String month) {
        regMonth(CK_GT, fRES(month));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_LessThan(String month) {
        regMonth(CK_LT, fRES(month));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_GreaterEqual(String month) {
        regMonth(CK_GE, fRES(month));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_LessEqual(String month) {
        regMonth(CK_LE, fRES(month));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param monthList The collection of month as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_InScope(Collection<String> monthList) {
        doSetMonth_InScope(monthList);
    }

    protected void doSetMonth_InScope(Collection<String> monthList) {
        regINS(CK_INS, cTL(monthList), xgetCValueMonth(), "MONTH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param monthList The collection of month as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_NotInScope(Collection<String> monthList) {
        doSetMonth_NotInScope(monthList);
    }

    protected void doSetMonth_NotInScope(Collection<String> monthList) {
        regINS(CK_NINS, cTL(monthList), xgetCValueMonth(), "MONTH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH: {VARCHAR(60)} <br>
     * <pre>e.g. setMonth_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param month The value of month as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMonth_LikeSearch(String month, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(month), xgetCValueMonth(), "MONTH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMonth_NotLikeSearch(String month, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(month), xgetCValueMonth(), "MONTH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH: {VARCHAR(60)}
     * @param month The value of month as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonth_PrefixSearch(String month) {
        setMonth_LikeSearch(month, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     */
    public void setMonth_IsNull() { regMonth(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     */
    public void setMonth_IsNullOrEmpty() { regMonth(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MONTH: {VARCHAR(60)}
     */
    public void setMonth_IsNotNull() { regMonth(CK_ISNN, DOBJ); }

    protected void regMonth(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMonth(), "MONTH"); }
    protected abstract ConditionValue xgetCValueMonth();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_Equal(String contractorNm) {
        doSetContractorNm_Equal(fRES(contractorNm));
    }

    protected void doSetContractorNm_Equal(String contractorNm) {
        regContractorNm(CK_EQ, contractorNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_NotEqual(String contractorNm) {
        doSetContractorNm_NotEqual(fRES(contractorNm));
    }

    protected void doSetContractorNm_NotEqual(String contractorNm) {
        regContractorNm(CK_NES, contractorNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_GreaterThan(String contractorNm) {
        regContractorNm(CK_GT, fRES(contractorNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_LessThan(String contractorNm) {
        regContractorNm(CK_LT, fRES(contractorNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_GreaterEqual(String contractorNm) {
        regContractorNm(CK_GE, fRES(contractorNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_LessEqual(String contractorNm) {
        regContractorNm(CK_LE, fRES(contractorNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNmList The collection of contractorNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_InScope(Collection<String> contractorNmList) {
        doSetContractorNm_InScope(contractorNmList);
    }

    protected void doSetContractorNm_InScope(Collection<String> contractorNmList) {
        regINS(CK_INS, cTL(contractorNmList), xgetCValueContractorNm(), "CONTRACTOR_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNmList The collection of contractorNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_NotInScope(Collection<String> contractorNmList) {
        doSetContractorNm_NotInScope(contractorNmList);
    }

    protected void doSetContractorNm_NotInScope(Collection<String> contractorNmList) {
        regINS(CK_NINS, cTL(contractorNmList), xgetCValueContractorNm(), "CONTRACTOR_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setContractorNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param contractorNm The value of contractorNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContractorNm_LikeSearch(String contractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(contractorNm), xgetCValueContractorNm(), "CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setContractorNm_NotLikeSearch(String contractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(contractorNm), xgetCValueContractorNm(), "CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     * @param contractorNm The value of contractorNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setContractorNm_PrefixSearch(String contractorNm) {
        setContractorNm_LikeSearch(contractorNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setContractorNm_IsNull() { regContractorNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setContractorNm_IsNullOrEmpty() { regContractorNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setContractorNm_IsNotNull() { regContractorNm(CK_ISNN, DOBJ); }

    protected void regContractorNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueContractorNm(), "CONTRACTOR_NM"); }
    protected abstract ConditionValue xgetCValueContractorNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
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
     * SHIPPING_DT: {VARCHAR(8)}
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
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
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
     * SHIPPING_DT: {VARCHAR(8)}
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
     * SHIPPING_DT: {VARCHAR(8)} <br>
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
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     */
    public void setShippingDt_IsNull() { regShippingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     */
    public void setShippingDt_IsNullOrEmpty() { regShippingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(8)}
     */
    public void setShippingDt_IsNotNull() { regShippingDt(CK_ISNN, DOBJ); }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_Equal(String destinationNm) {
        doSetDestinationNm_Equal(fRES(destinationNm));
    }

    protected void doSetDestinationNm_Equal(String destinationNm) {
        regDestinationNm(CK_EQ, destinationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_NotEqual(String destinationNm) {
        doSetDestinationNm_NotEqual(fRES(destinationNm));
    }

    protected void doSetDestinationNm_NotEqual(String destinationNm) {
        regDestinationNm(CK_NES, destinationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_GreaterThan(String destinationNm) {
        regDestinationNm(CK_GT, fRES(destinationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_LessThan(String destinationNm) {
        regDestinationNm(CK_LT, fRES(destinationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_GreaterEqual(String destinationNm) {
        regDestinationNm(CK_GE, fRES(destinationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_LessEqual(String destinationNm) {
        regDestinationNm(CK_LE, fRES(destinationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNmList The collection of destinationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_InScope(Collection<String> destinationNmList) {
        doSetDestinationNm_InScope(destinationNmList);
    }

    protected void doSetDestinationNm_InScope(Collection<String> destinationNmList) {
        regINS(CK_INS, cTL(destinationNmList), xgetCValueDestinationNm(), "DESTINATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNmList The collection of destinationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_NotInScope(Collection<String> destinationNmList) {
        doSetDestinationNm_NotInScope(destinationNmList);
    }

    protected void doSetDestinationNm_NotInScope(Collection<String> destinationNmList) {
        regINS(CK_NINS, cTL(destinationNmList), xgetCValueDestinationNm(), "DESTINATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm The value of destinationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm_LikeSearch(String destinationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm), xgetCValueDestinationNm(), "DESTINATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm_NotLikeSearch(String destinationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm), xgetCValueDestinationNm(), "DESTINATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     * @param destinationNm The value of destinationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm_PrefixSearch(String destinationNm) {
        setDestinationNm_LikeSearch(destinationNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     */
    public void setDestinationNm_IsNull() { regDestinationNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     */
    public void setDestinationNm_IsNullOrEmpty() { regDestinationNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM: {VARCHAR(60)}
     */
    public void setDestinationNm_IsNotNull() { regDestinationNm(CK_ISNN, DOBJ); }

    protected void regDestinationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm(), "DESTINATION_NM"); }
    protected abstract ConditionValue xgetCValueDestinationNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_Equal(Long shippingNum) {
        doSetShippingNum_Equal(shippingNum);
    }

    protected void doSetShippingNum_Equal(Long shippingNum) {
        regShippingNum(CK_EQ, shippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_NotEqual(Long shippingNum) {
        doSetShippingNum_NotEqual(shippingNum);
    }

    protected void doSetShippingNum_NotEqual(Long shippingNum) {
        regShippingNum(CK_NES, shippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterThan(Long shippingNum) {
        regShippingNum(CK_GT, shippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_LessThan(Long shippingNum) {
        regShippingNum(CK_LT, shippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterEqual(Long shippingNum) {
        regShippingNum(CK_GE, shippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNum The value of shippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingNum_LessEqual(Long shippingNum) {
        regShippingNum(CK_LE, shippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of shippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingNum(), "SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNumList The collection of shippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_InScope(Collection<Long> shippingNumList) {
        doSetShippingNum_InScope(shippingNumList);
    }

    protected void doSetShippingNum_InScope(Collection<Long> shippingNumList) {
        regINS(CK_INS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     * @param shippingNumList The collection of shippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_NotInScope(Collection<Long> shippingNumList) {
        doSetShippingNum_NotInScope(shippingNumList);
    }

    protected void doSetShippingNum_NotInScope(Collection<Long> shippingNumList) {
        regINS(CK_NINS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     */
    public void setShippingNum_IsNull() { regShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {BIGINT(19)}
     */
    public void setShippingNum_IsNotNull() { regShippingNum(CK_ISNN, DOBJ); }

    protected void regShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingNum(), "SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_Equal(Long shippingFee) {
        doSetShippingFee_Equal(shippingFee);
    }

    protected void doSetShippingFee_Equal(Long shippingFee) {
        regShippingFee(CK_EQ, shippingFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_NotEqual(Long shippingFee) {
        doSetShippingFee_NotEqual(shippingFee);
    }

    protected void doSetShippingFee_NotEqual(Long shippingFee) {
        regShippingFee(CK_NES, shippingFee);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterThan(Long shippingFee) {
        regShippingFee(CK_GT, shippingFee);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_LessThan(Long shippingFee) {
        regShippingFee(CK_LT, shippingFee);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterEqual(Long shippingFee) {
        regShippingFee(CK_GE, shippingFee);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFee The value of shippingFee as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingFee_LessEqual(Long shippingFee) {
        regShippingFee(CK_LE, shippingFee);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param minNumber The min number of shippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingFee. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingFee_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingFee(), "SHIPPING_FEE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFeeList The collection of shippingFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_InScope(Collection<Long> shippingFeeList) {
        doSetShippingFee_InScope(shippingFeeList);
    }

    protected void doSetShippingFee_InScope(Collection<Long> shippingFeeList) {
        regINS(CK_INS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     * @param shippingFeeList The collection of shippingFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_NotInScope(Collection<Long> shippingFeeList) {
        doSetShippingFee_NotInScope(shippingFeeList);
    }

    protected void doSetShippingFee_NotInScope(Collection<Long> shippingFeeList) {
        regINS(CK_NINS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     */
    public void setShippingFee_IsNull() { regShippingFee(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {BIGINT(19)}
     */
    public void setShippingFee_IsNotNull() { regShippingFee(CK_ISNN, DOBJ); }

    protected void regShippingFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingFee(), "SHIPPING_FEE"); }
    protected abstract ConditionValue xgetCValueShippingFee();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_Equal(Long fwShippingNum) {
        doSetFwShippingNum_Equal(fwShippingNum);
    }

    protected void doSetFwShippingNum_Equal(Long fwShippingNum) {
        regFwShippingNum(CK_EQ, fwShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_NotEqual(Long fwShippingNum) {
        doSetFwShippingNum_NotEqual(fwShippingNum);
    }

    protected void doSetFwShippingNum_NotEqual(Long fwShippingNum) {
        regFwShippingNum(CK_NES, fwShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_GreaterThan(Long fwShippingNum) {
        regFwShippingNum(CK_GT, fwShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_LessThan(Long fwShippingNum) {
        regFwShippingNum(CK_LT, fwShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_GreaterEqual(Long fwShippingNum) {
        regFwShippingNum(CK_GE, fwShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNum The value of fwShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingNum_LessEqual(Long fwShippingNum) {
        regFwShippingNum(CK_LE, fwShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwShippingNum(), "FW_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNumList The collection of fwShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwShippingNum_InScope(Collection<Long> fwShippingNumList) {
        doSetFwShippingNum_InScope(fwShippingNumList);
    }

    protected void doSetFwShippingNum_InScope(Collection<Long> fwShippingNumList) {
        regINS(CK_INS, cTL(fwShippingNumList), xgetCValueFwShippingNum(), "FW_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     * @param fwShippingNumList The collection of fwShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwShippingNum_NotInScope(Collection<Long> fwShippingNumList) {
        doSetFwShippingNum_NotInScope(fwShippingNumList);
    }

    protected void doSetFwShippingNum_NotInScope(Collection<Long> fwShippingNumList) {
        regINS(CK_NINS, cTL(fwShippingNumList), xgetCValueFwShippingNum(), "FW_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setFwShippingNum_IsNull() { regFwShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setFwShippingNum_IsNotNull() { regFwShippingNum(CK_ISNN, DOBJ); }

    protected void regFwShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwShippingNum(), "FW_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueFwShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_Equal(Long unShippingNum) {
        doSetUnShippingNum_Equal(unShippingNum);
    }

    protected void doSetUnShippingNum_Equal(Long unShippingNum) {
        regUnShippingNum(CK_EQ, unShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_NotEqual(Long unShippingNum) {
        doSetUnShippingNum_NotEqual(unShippingNum);
    }

    protected void doSetUnShippingNum_NotEqual(Long unShippingNum) {
        regUnShippingNum(CK_NES, unShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_GreaterThan(Long unShippingNum) {
        regUnShippingNum(CK_GT, unShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_LessThan(Long unShippingNum) {
        regUnShippingNum(CK_LT, unShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_GreaterEqual(Long unShippingNum) {
        regUnShippingNum(CK_GE, unShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNum The value of unShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingNum_LessEqual(Long unShippingNum) {
        regUnShippingNum(CK_LE, unShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of unShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnShippingNum(), "UN_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNumList The collection of unShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnShippingNum_InScope(Collection<Long> unShippingNumList) {
        doSetUnShippingNum_InScope(unShippingNumList);
    }

    protected void doSetUnShippingNum_InScope(Collection<Long> unShippingNumList) {
        regINS(CK_INS, cTL(unShippingNumList), xgetCValueUnShippingNum(), "UN_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     * @param unShippingNumList The collection of unShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnShippingNum_NotInScope(Collection<Long> unShippingNumList) {
        doSetUnShippingNum_NotInScope(unShippingNumList);
    }

    protected void doSetUnShippingNum_NotInScope(Collection<Long> unShippingNumList) {
        regINS(CK_NINS, cTL(unShippingNumList), xgetCValueUnShippingNum(), "UN_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setUnShippingNum_IsNull() { regUnShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setUnShippingNum_IsNotNull() { regUnShippingNum(CK_ISNN, DOBJ); }

    protected void regUnShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnShippingNum(), "UN_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueUnShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_Equal(Long shShippingNum) {
        doSetShShippingNum_Equal(shShippingNum);
    }

    protected void doSetShShippingNum_Equal(Long shShippingNum) {
        regShShippingNum(CK_EQ, shShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_NotEqual(Long shShippingNum) {
        doSetShShippingNum_NotEqual(shShippingNum);
    }

    protected void doSetShShippingNum_NotEqual(Long shShippingNum) {
        regShShippingNum(CK_NES, shShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_GreaterThan(Long shShippingNum) {
        regShShippingNum(CK_GT, shShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_LessThan(Long shShippingNum) {
        regShShippingNum(CK_LT, shShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_GreaterEqual(Long shShippingNum) {
        regShShippingNum(CK_GE, shShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNum The value of shShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingNum_LessEqual(Long shShippingNum) {
        regShShippingNum(CK_LE, shShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of shShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShShippingNum(), "SH_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNumList The collection of shShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShShippingNum_InScope(Collection<Long> shShippingNumList) {
        doSetShShippingNum_InScope(shShippingNumList);
    }

    protected void doSetShShippingNum_InScope(Collection<Long> shShippingNumList) {
        regINS(CK_INS, cTL(shShippingNumList), xgetCValueShShippingNum(), "SH_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     * @param shShippingNumList The collection of shShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShShippingNum_NotInScope(Collection<Long> shShippingNumList) {
        doSetShShippingNum_NotInScope(shShippingNumList);
    }

    protected void doSetShShippingNum_NotInScope(Collection<Long> shShippingNumList) {
        regINS(CK_NINS, cTL(shShippingNumList), xgetCValueShShippingNum(), "SH_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setShShippingNum_IsNull() { regShShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setShShippingNum_IsNotNull() { regShShippingNum(CK_ISNN, DOBJ); }

    protected void regShShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShShippingNum(), "SH_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueShShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_Equal(Long hmShippingNum) {
        doSetHmShippingNum_Equal(hmShippingNum);
    }

    protected void doSetHmShippingNum_Equal(Long hmShippingNum) {
        regHmShippingNum(CK_EQ, hmShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_NotEqual(Long hmShippingNum) {
        doSetHmShippingNum_NotEqual(hmShippingNum);
    }

    protected void doSetHmShippingNum_NotEqual(Long hmShippingNum) {
        regHmShippingNum(CK_NES, hmShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_GreaterThan(Long hmShippingNum) {
        regHmShippingNum(CK_GT, hmShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_LessThan(Long hmShippingNum) {
        regHmShippingNum(CK_LT, hmShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_GreaterEqual(Long hmShippingNum) {
        regHmShippingNum(CK_GE, hmShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNum The value of hmShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmShippingNum_LessEqual(Long hmShippingNum) {
        regHmShippingNum(CK_LE, hmShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of hmShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmShippingNum(), "HM_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNumList The collection of hmShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmShippingNum_InScope(Collection<Long> hmShippingNumList) {
        doSetHmShippingNum_InScope(hmShippingNumList);
    }

    protected void doSetHmShippingNum_InScope(Collection<Long> hmShippingNumList) {
        regINS(CK_INS, cTL(hmShippingNumList), xgetCValueHmShippingNum(), "HM_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     * @param hmShippingNumList The collection of hmShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmShippingNum_NotInScope(Collection<Long> hmShippingNumList) {
        doSetHmShippingNum_NotInScope(hmShippingNumList);
    }

    protected void doSetHmShippingNum_NotInScope(Collection<Long> hmShippingNumList) {
        regINS(CK_NINS, cTL(hmShippingNumList), xgetCValueHmShippingNum(), "HM_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setHmShippingNum_IsNull() { regHmShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setHmShippingNum_IsNotNull() { regHmShippingNum(CK_ISNN, DOBJ); }

    protected void regHmShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmShippingNum(), "HM_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueHmShippingNum();

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
    public HpSLCFunction<TBldl350nCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl350nCB.class);
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
    public HpSLCFunction<TBldl350nCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl350nCB.class);
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
    public HpSLCFunction<TBldl350nCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl350nCB.class);
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
    public HpSLCFunction<TBldl350nCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl350nCB.class);
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
    public HpSLCFunction<TBldl350nCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl350nCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl350nCB&gt;() {
     *     public void query(TBldl350nCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl350nCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl350nCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350nCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl350nCQ sq);

    protected TBldl350nCB xcreateScalarConditionCB() {
        TBldl350nCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl350nCB xcreateScalarConditionPartitionByCB() {
        TBldl350nCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl350nCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350nCB cb = new TBldl350nCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL350N_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl350nCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl350nCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl350nCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350nCB cb = new TBldl350nCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL350N_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl350nCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl350nCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl350nCB cb = new TBldl350nCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl350nCQ sq);

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
    protected TBldl350nCB newMyCB() {
        return new TBldl350nCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl350nCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
