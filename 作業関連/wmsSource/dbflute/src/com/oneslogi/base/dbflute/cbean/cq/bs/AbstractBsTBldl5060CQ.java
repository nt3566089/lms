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
 * The abstract condition-query of t_bldl5060.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5060CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5060CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5060";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_Equal(Long bldl5060Id) {
        doSetBldl5060Id_Equal(bldl5060Id);
    }

    protected void doSetBldl5060Id_Equal(Long bldl5060Id) {
        regBldl5060Id(CK_EQ, bldl5060Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_NotEqual(Long bldl5060Id) {
        doSetBldl5060Id_NotEqual(bldl5060Id);
    }

    protected void doSetBldl5060Id_NotEqual(Long bldl5060Id) {
        regBldl5060Id(CK_NES, bldl5060Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_GreaterThan(Long bldl5060Id) {
        regBldl5060Id(CK_GT, bldl5060Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_LessThan(Long bldl5060Id) {
        regBldl5060Id(CK_LT, bldl5060Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_GreaterEqual(Long bldl5060Id) {
        regBldl5060Id(CK_GE, bldl5060Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060Id The value of bldl5060Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5060Id_LessEqual(Long bldl5060Id) {
        regBldl5060Id(CK_LE, bldl5060Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5060Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5060Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5060Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5060Id(), "BLDL5060_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060IdList The collection of bldl5060Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5060Id_InScope(Collection<Long> bldl5060IdList) {
        doSetBldl5060Id_InScope(bldl5060IdList);
    }

    protected void doSetBldl5060Id_InScope(Collection<Long> bldl5060IdList) {
        regINS(CK_INS, cTL(bldl5060IdList), xgetCValueBldl5060Id(), "BLDL5060_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5060IdList The collection of bldl5060Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5060Id_NotInScope(Collection<Long> bldl5060IdList) {
        doSetBldl5060Id_NotInScope(bldl5060IdList);
    }

    protected void doSetBldl5060Id_NotInScope(Collection<Long> bldl5060IdList) {
        regINS(CK_NINS, cTL(bldl5060IdList), xgetCValueBldl5060Id(), "BLDL5060_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5060Id_IsNull() { regBldl5060Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5060Id_IsNotNull() { regBldl5060Id(CK_ISNN, DOBJ); }

    protected void regBldl5060Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5060Id(), "BLDL5060_ID"); }
    protected abstract ConditionValue xgetCValueBldl5060Id();

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
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_Equal(String rowNo) {
        doSetRowNo_Equal(fRES(rowNo));
    }

    protected void doSetRowNo_Equal(String rowNo) {
        regRowNo(CK_EQ, rowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_NotEqual(String rowNo) {
        doSetRowNo_NotEqual(fRES(rowNo));
    }

    protected void doSetRowNo_NotEqual(String rowNo) {
        regRowNo(CK_NES, rowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_GreaterThan(String rowNo) {
        regRowNo(CK_GT, fRES(rowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_LessThan(String rowNo) {
        regRowNo(CK_LT, fRES(rowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_GreaterEqual(String rowNo) {
        regRowNo(CK_GE, fRES(rowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_LessEqual(String rowNo) {
        regRowNo(CK_LE, fRES(rowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNoList The collection of rowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_InScope(Collection<String> rowNoList) {
        doSetRowNo_InScope(rowNoList);
    }

    protected void doSetRowNo_InScope(Collection<String> rowNoList) {
        regINS(CK_INS, cTL(rowNoList), xgetCValueRowNo(), "ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNoList The collection of rowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_NotInScope(Collection<String> rowNoList) {
        doSetRowNo_NotInScope(rowNoList);
    }

    protected void doSetRowNo_NotInScope(Collection<String> rowNoList) {
        regINS(CK_NINS, cTL(rowNoList), xgetCValueRowNo(), "ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rowNo The value of rowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRowNo_LikeSearch(String rowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rowNo), xgetCValueRowNo(), "ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRowNo_NotLikeSearch(String rowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rowNo), xgetCValueRowNo(), "ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     * @param rowNo The value of rowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRowNo_PrefixSearch(String rowNo) {
        setRowNo_LikeSearch(rowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     */
    public void setRowNo_IsNull() { regRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     */
    public void setRowNo_IsNullOrEmpty() { regRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ROW_NO: {VARCHAR(30)}
     */
    public void setRowNo_IsNotNull() { regRowNo(CK_ISNN, DOBJ); }

    protected void regRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRowNo(), "ROW_NO"); }
    protected abstract ConditionValue xgetCValueRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_Equal(String returnDt) {
        doSetReturnDt_Equal(fRES(returnDt));
    }

    protected void doSetReturnDt_Equal(String returnDt) {
        regReturnDt(CK_EQ, returnDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_NotEqual(String returnDt) {
        doSetReturnDt_NotEqual(fRES(returnDt));
    }

    protected void doSetReturnDt_NotEqual(String returnDt) {
        regReturnDt(CK_NES, returnDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_GreaterThan(String returnDt) {
        regReturnDt(CK_GT, fRES(returnDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_LessThan(String returnDt) {
        regReturnDt(CK_LT, fRES(returnDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_GreaterEqual(String returnDt) {
        regReturnDt(CK_GE, fRES(returnDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_LessEqual(String returnDt) {
        regReturnDt(CK_LE, fRES(returnDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDtList The collection of returnDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_InScope(Collection<String> returnDtList) {
        doSetReturnDt_InScope(returnDtList);
    }

    protected void doSetReturnDt_InScope(Collection<String> returnDtList) {
        regINS(CK_INS, cTL(returnDtList), xgetCValueReturnDt(), "RETURN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDtList The collection of returnDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_NotInScope(Collection<String> returnDtList) {
        doSetReturnDt_NotInScope(returnDtList);
    }

    protected void doSetReturnDt_NotInScope(Collection<String> returnDtList) {
        regINS(CK_NINS, cTL(returnDtList), xgetCValueReturnDt(), "RETURN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RETURN_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setReturnDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param returnDt The value of returnDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReturnDt_LikeSearch(String returnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(returnDt), xgetCValueReturnDt(), "RETURN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReturnDt_NotLikeSearch(String returnDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(returnDt), xgetCValueReturnDt(), "RETURN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     * @param returnDt The value of returnDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReturnDt_PrefixSearch(String returnDt) {
        setReturnDt_LikeSearch(returnDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     */
    public void setReturnDt_IsNull() { regReturnDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     */
    public void setReturnDt_IsNullOrEmpty() { regReturnDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RETURN_DT: {VARCHAR(30)}
     */
    public void setReturnDt_IsNotNull() { regReturnDt(CK_ISNN, DOBJ); }

    protected void regReturnDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReturnDt(), "RETURN_DT"); }
    protected abstract ConditionValue xgetCValueReturnDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_Equal(Long fwReturnCnt) {
        doSetFwReturnCnt_Equal(fwReturnCnt);
    }

    protected void doSetFwReturnCnt_Equal(Long fwReturnCnt) {
        regFwReturnCnt(CK_EQ, fwReturnCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_NotEqual(Long fwReturnCnt) {
        doSetFwReturnCnt_NotEqual(fwReturnCnt);
    }

    protected void doSetFwReturnCnt_NotEqual(Long fwReturnCnt) {
        regFwReturnCnt(CK_NES, fwReturnCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_GreaterThan(Long fwReturnCnt) {
        regFwReturnCnt(CK_GT, fwReturnCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_LessThan(Long fwReturnCnt) {
        regFwReturnCnt(CK_LT, fwReturnCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_GreaterEqual(Long fwReturnCnt) {
        regFwReturnCnt(CK_GE, fwReturnCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCnt The value of fwReturnCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnCnt_LessEqual(Long fwReturnCnt) {
        regFwReturnCnt(CK_LE, fwReturnCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param minNumber The min number of fwReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwReturnCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwReturnCnt(), "FW_RETURN_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCntList The collection of fwReturnCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReturnCnt_InScope(Collection<Long> fwReturnCntList) {
        doSetFwReturnCnt_InScope(fwReturnCntList);
    }

    protected void doSetFwReturnCnt_InScope(Collection<Long> fwReturnCntList) {
        regINS(CK_INS, cTL(fwReturnCntList), xgetCValueFwReturnCnt(), "FW_RETURN_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     * @param fwReturnCntList The collection of fwReturnCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReturnCnt_NotInScope(Collection<Long> fwReturnCntList) {
        doSetFwReturnCnt_NotInScope(fwReturnCntList);
    }

    protected void doSetFwReturnCnt_NotInScope(Collection<Long> fwReturnCntList) {
        regINS(CK_NINS, cTL(fwReturnCntList), xgetCValueFwReturnCnt(), "FW_RETURN_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     */
    public void setFwReturnCnt_IsNull() { regFwReturnCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RETURN_CNT: {BIGINT(19)}
     */
    public void setFwReturnCnt_IsNotNull() { regFwReturnCnt(CK_ISNN, DOBJ); }

    protected void regFwReturnCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwReturnCnt(), "FW_RETURN_CNT"); }
    protected abstract ConditionValue xgetCValueFwReturnCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_Equal(Long fwReturnNum) {
        doSetFwReturnNum_Equal(fwReturnNum);
    }

    protected void doSetFwReturnNum_Equal(Long fwReturnNum) {
        regFwReturnNum(CK_EQ, fwReturnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_NotEqual(Long fwReturnNum) {
        doSetFwReturnNum_NotEqual(fwReturnNum);
    }

    protected void doSetFwReturnNum_NotEqual(Long fwReturnNum) {
        regFwReturnNum(CK_NES, fwReturnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_GreaterThan(Long fwReturnNum) {
        regFwReturnNum(CK_GT, fwReturnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_LessThan(Long fwReturnNum) {
        regFwReturnNum(CK_LT, fwReturnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_GreaterEqual(Long fwReturnNum) {
        regFwReturnNum(CK_GE, fwReturnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNum The value of fwReturnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReturnNum_LessEqual(Long fwReturnNum) {
        regFwReturnNum(CK_LE, fwReturnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwReturnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwReturnNum(), "FW_RETURN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNumList The collection of fwReturnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReturnNum_InScope(Collection<Long> fwReturnNumList) {
        doSetFwReturnNum_InScope(fwReturnNumList);
    }

    protected void doSetFwReturnNum_InScope(Collection<Long> fwReturnNumList) {
        regINS(CK_INS, cTL(fwReturnNumList), xgetCValueFwReturnNum(), "FW_RETURN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     * @param fwReturnNumList The collection of fwReturnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReturnNum_NotInScope(Collection<Long> fwReturnNumList) {
        doSetFwReturnNum_NotInScope(fwReturnNumList);
    }

    protected void doSetFwReturnNum_NotInScope(Collection<Long> fwReturnNumList) {
        regINS(CK_NINS, cTL(fwReturnNumList), xgetCValueFwReturnNum(), "FW_RETURN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     */
    public void setFwReturnNum_IsNull() { regFwReturnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RETURN_NUM: {BIGINT(19)}
     */
    public void setFwReturnNum_IsNotNull() { regFwReturnNum(CK_ISNN, DOBJ); }

    protected void regFwReturnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwReturnNum(), "FW_RETURN_NUM"); }
    protected abstract ConditionValue xgetCValueFwReturnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_Equal(Long unReturnCnt) {
        doSetUnReturnCnt_Equal(unReturnCnt);
    }

    protected void doSetUnReturnCnt_Equal(Long unReturnCnt) {
        regUnReturnCnt(CK_EQ, unReturnCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_NotEqual(Long unReturnCnt) {
        doSetUnReturnCnt_NotEqual(unReturnCnt);
    }

    protected void doSetUnReturnCnt_NotEqual(Long unReturnCnt) {
        regUnReturnCnt(CK_NES, unReturnCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_GreaterThan(Long unReturnCnt) {
        regUnReturnCnt(CK_GT, unReturnCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_LessThan(Long unReturnCnt) {
        regUnReturnCnt(CK_LT, unReturnCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_GreaterEqual(Long unReturnCnt) {
        regUnReturnCnt(CK_GE, unReturnCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCnt The value of unReturnCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnCnt_LessEqual(Long unReturnCnt) {
        regUnReturnCnt(CK_LE, unReturnCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param minNumber The min number of unReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnReturnCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnReturnCnt(), "UN_RETURN_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCntList The collection of unReturnCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReturnCnt_InScope(Collection<Long> unReturnCntList) {
        doSetUnReturnCnt_InScope(unReturnCntList);
    }

    protected void doSetUnReturnCnt_InScope(Collection<Long> unReturnCntList) {
        regINS(CK_INS, cTL(unReturnCntList), xgetCValueUnReturnCnt(), "UN_RETURN_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     * @param unReturnCntList The collection of unReturnCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReturnCnt_NotInScope(Collection<Long> unReturnCntList) {
        doSetUnReturnCnt_NotInScope(unReturnCntList);
    }

    protected void doSetUnReturnCnt_NotInScope(Collection<Long> unReturnCntList) {
        regINS(CK_NINS, cTL(unReturnCntList), xgetCValueUnReturnCnt(), "UN_RETURN_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     */
    public void setUnReturnCnt_IsNull() { regUnReturnCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RETURN_CNT: {BIGINT(19)}
     */
    public void setUnReturnCnt_IsNotNull() { regUnReturnCnt(CK_ISNN, DOBJ); }

    protected void regUnReturnCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnReturnCnt(), "UN_RETURN_CNT"); }
    protected abstract ConditionValue xgetCValueUnReturnCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_Equal(Long unReturnNum) {
        doSetUnReturnNum_Equal(unReturnNum);
    }

    protected void doSetUnReturnNum_Equal(Long unReturnNum) {
        regUnReturnNum(CK_EQ, unReturnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_NotEqual(Long unReturnNum) {
        doSetUnReturnNum_NotEqual(unReturnNum);
    }

    protected void doSetUnReturnNum_NotEqual(Long unReturnNum) {
        regUnReturnNum(CK_NES, unReturnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_GreaterThan(Long unReturnNum) {
        regUnReturnNum(CK_GT, unReturnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_LessThan(Long unReturnNum) {
        regUnReturnNum(CK_LT, unReturnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_GreaterEqual(Long unReturnNum) {
        regUnReturnNum(CK_GE, unReturnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNum The value of unReturnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReturnNum_LessEqual(Long unReturnNum) {
        regUnReturnNum(CK_LE, unReturnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param minNumber The min number of unReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnReturnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnReturnNum(), "UN_RETURN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNumList The collection of unReturnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReturnNum_InScope(Collection<Long> unReturnNumList) {
        doSetUnReturnNum_InScope(unReturnNumList);
    }

    protected void doSetUnReturnNum_InScope(Collection<Long> unReturnNumList) {
        regINS(CK_INS, cTL(unReturnNumList), xgetCValueUnReturnNum(), "UN_RETURN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     * @param unReturnNumList The collection of unReturnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReturnNum_NotInScope(Collection<Long> unReturnNumList) {
        doSetUnReturnNum_NotInScope(unReturnNumList);
    }

    protected void doSetUnReturnNum_NotInScope(Collection<Long> unReturnNumList) {
        regINS(CK_NINS, cTL(unReturnNumList), xgetCValueUnReturnNum(), "UN_RETURN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     */
    public void setUnReturnNum_IsNull() { regUnReturnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RETURN_NUM: {BIGINT(19)}
     */
    public void setUnReturnNum_IsNotNull() { regUnReturnNum(CK_ISNN, DOBJ); }

    protected void regUnReturnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnReturnNum(), "UN_RETURN_NUM"); }
    protected abstract ConditionValue xgetCValueUnReturnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_Equal(Long shReturnCnt) {
        doSetShReturnCnt_Equal(shReturnCnt);
    }

    protected void doSetShReturnCnt_Equal(Long shReturnCnt) {
        regShReturnCnt(CK_EQ, shReturnCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_NotEqual(Long shReturnCnt) {
        doSetShReturnCnt_NotEqual(shReturnCnt);
    }

    protected void doSetShReturnCnt_NotEqual(Long shReturnCnt) {
        regShReturnCnt(CK_NES, shReturnCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_GreaterThan(Long shReturnCnt) {
        regShReturnCnt(CK_GT, shReturnCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_LessThan(Long shReturnCnt) {
        regShReturnCnt(CK_LT, shReturnCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_GreaterEqual(Long shReturnCnt) {
        regShReturnCnt(CK_GE, shReturnCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCnt The value of shReturnCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnCnt_LessEqual(Long shReturnCnt) {
        regShReturnCnt(CK_LE, shReturnCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param minNumber The min number of shReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShReturnCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShReturnCnt(), "SH_RETURN_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCntList The collection of shReturnCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReturnCnt_InScope(Collection<Long> shReturnCntList) {
        doSetShReturnCnt_InScope(shReturnCntList);
    }

    protected void doSetShReturnCnt_InScope(Collection<Long> shReturnCntList) {
        regINS(CK_INS, cTL(shReturnCntList), xgetCValueShReturnCnt(), "SH_RETURN_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     * @param shReturnCntList The collection of shReturnCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReturnCnt_NotInScope(Collection<Long> shReturnCntList) {
        doSetShReturnCnt_NotInScope(shReturnCntList);
    }

    protected void doSetShReturnCnt_NotInScope(Collection<Long> shReturnCntList) {
        regINS(CK_NINS, cTL(shReturnCntList), xgetCValueShReturnCnt(), "SH_RETURN_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     */
    public void setShReturnCnt_IsNull() { regShReturnCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RETURN_CNT: {BIGINT(19)}
     */
    public void setShReturnCnt_IsNotNull() { regShReturnCnt(CK_ISNN, DOBJ); }

    protected void regShReturnCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShReturnCnt(), "SH_RETURN_CNT"); }
    protected abstract ConditionValue xgetCValueShReturnCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_Equal(Long shReturnNum) {
        doSetShReturnNum_Equal(shReturnNum);
    }

    protected void doSetShReturnNum_Equal(Long shReturnNum) {
        regShReturnNum(CK_EQ, shReturnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_NotEqual(Long shReturnNum) {
        doSetShReturnNum_NotEqual(shReturnNum);
    }

    protected void doSetShReturnNum_NotEqual(Long shReturnNum) {
        regShReturnNum(CK_NES, shReturnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_GreaterThan(Long shReturnNum) {
        regShReturnNum(CK_GT, shReturnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_LessThan(Long shReturnNum) {
        regShReturnNum(CK_LT, shReturnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_GreaterEqual(Long shReturnNum) {
        regShReturnNum(CK_GE, shReturnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNum The value of shReturnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReturnNum_LessEqual(Long shReturnNum) {
        regShReturnNum(CK_LE, shReturnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param minNumber The min number of shReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShReturnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShReturnNum(), "SH_RETURN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNumList The collection of shReturnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReturnNum_InScope(Collection<Long> shReturnNumList) {
        doSetShReturnNum_InScope(shReturnNumList);
    }

    protected void doSetShReturnNum_InScope(Collection<Long> shReturnNumList) {
        regINS(CK_INS, cTL(shReturnNumList), xgetCValueShReturnNum(), "SH_RETURN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     * @param shReturnNumList The collection of shReturnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReturnNum_NotInScope(Collection<Long> shReturnNumList) {
        doSetShReturnNum_NotInScope(shReturnNumList);
    }

    protected void doSetShReturnNum_NotInScope(Collection<Long> shReturnNumList) {
        regINS(CK_NINS, cTL(shReturnNumList), xgetCValueShReturnNum(), "SH_RETURN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     */
    public void setShReturnNum_IsNull() { regShReturnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RETURN_NUM: {BIGINT(19)}
     */
    public void setShReturnNum_IsNotNull() { regShReturnNum(CK_ISNN, DOBJ); }

    protected void regShReturnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShReturnNum(), "SH_RETURN_NUM"); }
    protected abstract ConditionValue xgetCValueShReturnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_Equal(Long hmReturnCnt) {
        doSetHmReturnCnt_Equal(hmReturnCnt);
    }

    protected void doSetHmReturnCnt_Equal(Long hmReturnCnt) {
        regHmReturnCnt(CK_EQ, hmReturnCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_NotEqual(Long hmReturnCnt) {
        doSetHmReturnCnt_NotEqual(hmReturnCnt);
    }

    protected void doSetHmReturnCnt_NotEqual(Long hmReturnCnt) {
        regHmReturnCnt(CK_NES, hmReturnCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_GreaterThan(Long hmReturnCnt) {
        regHmReturnCnt(CK_GT, hmReturnCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_LessThan(Long hmReturnCnt) {
        regHmReturnCnt(CK_LT, hmReturnCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_GreaterEqual(Long hmReturnCnt) {
        regHmReturnCnt(CK_GE, hmReturnCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCnt The value of hmReturnCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnCnt_LessEqual(Long hmReturnCnt) {
        regHmReturnCnt(CK_LE, hmReturnCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param minNumber The min number of hmReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmReturnCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmReturnCnt(), "HM_RETURN_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCntList The collection of hmReturnCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmReturnCnt_InScope(Collection<Long> hmReturnCntList) {
        doSetHmReturnCnt_InScope(hmReturnCntList);
    }

    protected void doSetHmReturnCnt_InScope(Collection<Long> hmReturnCntList) {
        regINS(CK_INS, cTL(hmReturnCntList), xgetCValueHmReturnCnt(), "HM_RETURN_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     * @param hmReturnCntList The collection of hmReturnCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmReturnCnt_NotInScope(Collection<Long> hmReturnCntList) {
        doSetHmReturnCnt_NotInScope(hmReturnCntList);
    }

    protected void doSetHmReturnCnt_NotInScope(Collection<Long> hmReturnCntList) {
        regINS(CK_NINS, cTL(hmReturnCntList), xgetCValueHmReturnCnt(), "HM_RETURN_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     */
    public void setHmReturnCnt_IsNull() { regHmReturnCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_RETURN_CNT: {BIGINT(19)}
     */
    public void setHmReturnCnt_IsNotNull() { regHmReturnCnt(CK_ISNN, DOBJ); }

    protected void regHmReturnCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmReturnCnt(), "HM_RETURN_CNT"); }
    protected abstract ConditionValue xgetCValueHmReturnCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_Equal(Long hmReturnNum) {
        doSetHmReturnNum_Equal(hmReturnNum);
    }

    protected void doSetHmReturnNum_Equal(Long hmReturnNum) {
        regHmReturnNum(CK_EQ, hmReturnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_NotEqual(Long hmReturnNum) {
        doSetHmReturnNum_NotEqual(hmReturnNum);
    }

    protected void doSetHmReturnNum_NotEqual(Long hmReturnNum) {
        regHmReturnNum(CK_NES, hmReturnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_GreaterThan(Long hmReturnNum) {
        regHmReturnNum(CK_GT, hmReturnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_LessThan(Long hmReturnNum) {
        regHmReturnNum(CK_LT, hmReturnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_GreaterEqual(Long hmReturnNum) {
        regHmReturnNum(CK_GE, hmReturnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNum The value of hmReturnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmReturnNum_LessEqual(Long hmReturnNum) {
        regHmReturnNum(CK_LE, hmReturnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param minNumber The min number of hmReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmReturnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmReturnNum(), "HM_RETURN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNumList The collection of hmReturnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmReturnNum_InScope(Collection<Long> hmReturnNumList) {
        doSetHmReturnNum_InScope(hmReturnNumList);
    }

    protected void doSetHmReturnNum_InScope(Collection<Long> hmReturnNumList) {
        regINS(CK_INS, cTL(hmReturnNumList), xgetCValueHmReturnNum(), "HM_RETURN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     * @param hmReturnNumList The collection of hmReturnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmReturnNum_NotInScope(Collection<Long> hmReturnNumList) {
        doSetHmReturnNum_NotInScope(hmReturnNumList);
    }

    protected void doSetHmReturnNum_NotInScope(Collection<Long> hmReturnNumList) {
        regINS(CK_NINS, cTL(hmReturnNumList), xgetCValueHmReturnNum(), "HM_RETURN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     */
    public void setHmReturnNum_IsNull() { regHmReturnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_RETURN_NUM: {BIGINT(19)}
     */
    public void setHmReturnNum_IsNotNull() { regHmReturnNum(CK_ISNN, DOBJ); }

    protected void regHmReturnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmReturnNum(), "HM_RETURN_NUM"); }
    protected abstract ConditionValue xgetCValueHmReturnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_Equal(Long totalReturnCnt) {
        doSetTotalReturnCnt_Equal(totalReturnCnt);
    }

    protected void doSetTotalReturnCnt_Equal(Long totalReturnCnt) {
        regTotalReturnCnt(CK_EQ, totalReturnCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_NotEqual(Long totalReturnCnt) {
        doSetTotalReturnCnt_NotEqual(totalReturnCnt);
    }

    protected void doSetTotalReturnCnt_NotEqual(Long totalReturnCnt) {
        regTotalReturnCnt(CK_NES, totalReturnCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_GreaterThan(Long totalReturnCnt) {
        regTotalReturnCnt(CK_GT, totalReturnCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_LessThan(Long totalReturnCnt) {
        regTotalReturnCnt(CK_LT, totalReturnCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_GreaterEqual(Long totalReturnCnt) {
        regTotalReturnCnt(CK_GE, totalReturnCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCnt The value of totalReturnCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_LessEqual(Long totalReturnCnt) {
        regTotalReturnCnt(CK_LE, totalReturnCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param minNumber The min number of totalReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalReturnCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalReturnCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalReturnCnt(), "TOTAL_RETURN_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCntList The collection of totalReturnCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_InScope(Collection<Long> totalReturnCntList) {
        doSetTotalReturnCnt_InScope(totalReturnCntList);
    }

    protected void doSetTotalReturnCnt_InScope(Collection<Long> totalReturnCntList) {
        regINS(CK_INS, cTL(totalReturnCntList), xgetCValueTotalReturnCnt(), "TOTAL_RETURN_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     * @param totalReturnCntList The collection of totalReturnCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReturnCnt_NotInScope(Collection<Long> totalReturnCntList) {
        doSetTotalReturnCnt_NotInScope(totalReturnCntList);
    }

    protected void doSetTotalReturnCnt_NotInScope(Collection<Long> totalReturnCntList) {
        regINS(CK_NINS, cTL(totalReturnCntList), xgetCValueTotalReturnCnt(), "TOTAL_RETURN_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     */
    public void setTotalReturnCnt_IsNull() { regTotalReturnCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_RETURN_CNT: {BIGINT(19)}
     */
    public void setTotalReturnCnt_IsNotNull() { regTotalReturnCnt(CK_ISNN, DOBJ); }

    protected void regTotalReturnCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalReturnCnt(), "TOTAL_RETURN_CNT"); }
    protected abstract ConditionValue xgetCValueTotalReturnCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_Equal(Long totalReturnNum) {
        doSetTotalReturnNum_Equal(totalReturnNum);
    }

    protected void doSetTotalReturnNum_Equal(Long totalReturnNum) {
        regTotalReturnNum(CK_EQ, totalReturnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_NotEqual(Long totalReturnNum) {
        doSetTotalReturnNum_NotEqual(totalReturnNum);
    }

    protected void doSetTotalReturnNum_NotEqual(Long totalReturnNum) {
        regTotalReturnNum(CK_NES, totalReturnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_GreaterThan(Long totalReturnNum) {
        regTotalReturnNum(CK_GT, totalReturnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_LessThan(Long totalReturnNum) {
        regTotalReturnNum(CK_LT, totalReturnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_GreaterEqual(Long totalReturnNum) {
        regTotalReturnNum(CK_GE, totalReturnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNum The value of totalReturnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReturnNum_LessEqual(Long totalReturnNum) {
        regTotalReturnNum(CK_LE, totalReturnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalReturnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalReturnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalReturnNum(), "TOTAL_RETURN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNumList The collection of totalReturnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReturnNum_InScope(Collection<Long> totalReturnNumList) {
        doSetTotalReturnNum_InScope(totalReturnNumList);
    }

    protected void doSetTotalReturnNum_InScope(Collection<Long> totalReturnNumList) {
        regINS(CK_INS, cTL(totalReturnNumList), xgetCValueTotalReturnNum(), "TOTAL_RETURN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     * @param totalReturnNumList The collection of totalReturnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReturnNum_NotInScope(Collection<Long> totalReturnNumList) {
        doSetTotalReturnNum_NotInScope(totalReturnNumList);
    }

    protected void doSetTotalReturnNum_NotInScope(Collection<Long> totalReturnNumList) {
        regINS(CK_NINS, cTL(totalReturnNumList), xgetCValueTotalReturnNum(), "TOTAL_RETURN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     */
    public void setTotalReturnNum_IsNull() { regTotalReturnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_RETURN_NUM: {BIGINT(19)}
     */
    public void setTotalReturnNum_IsNotNull() { regTotalReturnNum(CK_ISNN, DOBJ); }

    protected void regTotalReturnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalReturnNum(), "TOTAL_RETURN_NUM"); }
    protected abstract ConditionValue xgetCValueTotalReturnNum();

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
    public HpSLCFunction<TBldl5060CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5060CB.class);
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
    public HpSLCFunction<TBldl5060CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5060CB.class);
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
    public HpSLCFunction<TBldl5060CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5060CB.class);
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
    public HpSLCFunction<TBldl5060CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5060CB.class);
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
    public HpSLCFunction<TBldl5060CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5060CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5060CB&gt;() {
     *     public void query(TBldl5060CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5060CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5060CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5060CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5060CQ sq);

    protected TBldl5060CB xcreateScalarConditionCB() {
        TBldl5060CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5060CB xcreateScalarConditionPartitionByCB() {
        TBldl5060CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5060CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5060CB cb = new TBldl5060CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5060_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5060CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5060CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5060CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5060CB cb = new TBldl5060CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5060_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5060CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5060CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5060CB cb = new TBldl5060CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5060CQ sq);

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
    protected TBldl5060CB newMyCB() {
        return new TBldl5060CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5060CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
