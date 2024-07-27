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
 * The abstract condition-query of t_bldl350k.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl350kCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl350kCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl350k";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_Equal(Long bldl350kId) {
        doSetBldl350kId_Equal(bldl350kId);
    }

    protected void doSetBldl350kId_Equal(Long bldl350kId) {
        regBldl350kId(CK_EQ, bldl350kId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_NotEqual(Long bldl350kId) {
        doSetBldl350kId_NotEqual(bldl350kId);
    }

    protected void doSetBldl350kId_NotEqual(Long bldl350kId) {
        regBldl350kId(CK_NES, bldl350kId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_GreaterThan(Long bldl350kId) {
        regBldl350kId(CK_GT, bldl350kId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_LessThan(Long bldl350kId) {
        regBldl350kId(CK_LT, bldl350kId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_GreaterEqual(Long bldl350kId) {
        regBldl350kId(CK_GE, bldl350kId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kId The value of bldl350kId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl350kId_LessEqual(Long bldl350kId) {
        regBldl350kId(CK_LE, bldl350kId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl350kId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl350kId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl350kId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl350kId(), "BLDL350K_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kIdList The collection of bldl350kId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl350kId_InScope(Collection<Long> bldl350kIdList) {
        doSetBldl350kId_InScope(bldl350kIdList);
    }

    protected void doSetBldl350kId_InScope(Collection<Long> bldl350kIdList) {
        regINS(CK_INS, cTL(bldl350kIdList), xgetCValueBldl350kId(), "BLDL350K_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl350kIdList The collection of bldl350kId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl350kId_NotInScope(Collection<Long> bldl350kIdList) {
        doSetBldl350kId_NotInScope(bldl350kIdList);
    }

    protected void doSetBldl350kId_NotInScope(Collection<Long> bldl350kIdList) {
        regINS(CK_NINS, cTL(bldl350kIdList), xgetCValueBldl350kId(), "BLDL350K_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl350kId_IsNull() { regBldl350kId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl350kId_IsNotNull() { regBldl350kId(CK_ISNN, DOBJ); }

    protected void regBldl350kId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl350kId(), "BLDL350K_ID"); }
    protected abstract ConditionValue xgetCValueBldl350kId();

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
    public HpSLCFunction<TBldl350kCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl350kCB.class);
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
    public HpSLCFunction<TBldl350kCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl350kCB.class);
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
    public HpSLCFunction<TBldl350kCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl350kCB.class);
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
    public HpSLCFunction<TBldl350kCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl350kCB.class);
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
    public HpSLCFunction<TBldl350kCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl350kCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl350kCB&gt;() {
     *     public void query(TBldl350kCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl350kCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl350kCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350kCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl350kCQ sq);

    protected TBldl350kCB xcreateScalarConditionCB() {
        TBldl350kCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl350kCB xcreateScalarConditionPartitionByCB() {
        TBldl350kCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl350kCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350kCB cb = new TBldl350kCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL350K_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl350kCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl350kCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl350kCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl350kCB cb = new TBldl350kCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL350K_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl350kCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl350kCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl350kCB cb = new TBldl350kCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl350kCQ sq);

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
    protected TBldl350kCB newMyCB() {
        return new TBldl350kCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl350kCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
