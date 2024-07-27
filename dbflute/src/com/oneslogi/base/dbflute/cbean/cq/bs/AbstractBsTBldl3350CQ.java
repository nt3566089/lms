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
 * The abstract condition-query of t_bldl3350.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl3350CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl3350CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl3350";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_Equal(Long bldl3350Id) {
        doSetBldl3350Id_Equal(bldl3350Id);
    }

    protected void doSetBldl3350Id_Equal(Long bldl3350Id) {
        regBldl3350Id(CK_EQ, bldl3350Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_NotEqual(Long bldl3350Id) {
        doSetBldl3350Id_NotEqual(bldl3350Id);
    }

    protected void doSetBldl3350Id_NotEqual(Long bldl3350Id) {
        regBldl3350Id(CK_NES, bldl3350Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_GreaterThan(Long bldl3350Id) {
        regBldl3350Id(CK_GT, bldl3350Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_LessThan(Long bldl3350Id) {
        regBldl3350Id(CK_LT, bldl3350Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_GreaterEqual(Long bldl3350Id) {
        regBldl3350Id(CK_GE, bldl3350Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350Id The value of bldl3350Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3350Id_LessEqual(Long bldl3350Id) {
        regBldl3350Id(CK_LE, bldl3350Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl3350Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl3350Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl3350Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl3350Id(), "BLDL3350_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350IdList The collection of bldl3350Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl3350Id_InScope(Collection<Long> bldl3350IdList) {
        doSetBldl3350Id_InScope(bldl3350IdList);
    }

    protected void doSetBldl3350Id_InScope(Collection<Long> bldl3350IdList) {
        regINS(CK_INS, cTL(bldl3350IdList), xgetCValueBldl3350Id(), "BLDL3350_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3350IdList The collection of bldl3350Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl3350Id_NotInScope(Collection<Long> bldl3350IdList) {
        doSetBldl3350Id_NotInScope(bldl3350IdList);
    }

    protected void doSetBldl3350Id_NotInScope(Collection<Long> bldl3350IdList) {
        regINS(CK_NINS, cTL(bldl3350IdList), xgetCValueBldl3350Id(), "BLDL3350_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl3350Id_IsNull() { regBldl3350Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl3350Id_IsNotNull() { regBldl3350Id(CK_ISNN, DOBJ); }

    protected void regBldl3350Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl3350Id(), "BLDL3350_ID"); }
    protected abstract ConditionValue xgetCValueBldl3350Id();

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
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_Equal(String salesOrgNm) {
        doSetSalesOrgNm_Equal(fRES(salesOrgNm));
    }

    protected void doSetSalesOrgNm_Equal(String salesOrgNm) {
        regSalesOrgNm(CK_EQ, salesOrgNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_NotEqual(String salesOrgNm) {
        doSetSalesOrgNm_NotEqual(fRES(salesOrgNm));
    }

    protected void doSetSalesOrgNm_NotEqual(String salesOrgNm) {
        regSalesOrgNm(CK_NES, salesOrgNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_GreaterThan(String salesOrgNm) {
        regSalesOrgNm(CK_GT, fRES(salesOrgNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_LessThan(String salesOrgNm) {
        regSalesOrgNm(CK_LT, fRES(salesOrgNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_GreaterEqual(String salesOrgNm) {
        regSalesOrgNm(CK_GE, fRES(salesOrgNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_LessEqual(String salesOrgNm) {
        regSalesOrgNm(CK_LE, fRES(salesOrgNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNmList The collection of salesOrgNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_InScope(Collection<String> salesOrgNmList) {
        doSetSalesOrgNm_InScope(salesOrgNmList);
    }

    protected void doSetSalesOrgNm_InScope(Collection<String> salesOrgNmList) {
        regINS(CK_INS, cTL(salesOrgNmList), xgetCValueSalesOrgNm(), "SALES_ORG_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNmList The collection of salesOrgNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_NotInScope(Collection<String> salesOrgNmList) {
        doSetSalesOrgNm_NotInScope(salesOrgNmList);
    }

    protected void doSetSalesOrgNm_NotInScope(Collection<String> salesOrgNmList) {
        regINS(CK_NINS, cTL(salesOrgNmList), xgetCValueSalesOrgNm(), "SALES_ORG_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setSalesOrgNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrgNm The value of salesOrgNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrgNm_LikeSearch(String salesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrgNm), xgetCValueSalesOrgNm(), "SALES_ORG_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgNm_NotLikeSearch(String salesOrgNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgNm), xgetCValueSalesOrgNm(), "SALES_ORG_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     * @param salesOrgNm The value of salesOrgNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgNm_PrefixSearch(String salesOrgNm) {
        setSalesOrgNm_LikeSearch(salesOrgNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setSalesOrgNm_IsNull() { regSalesOrgNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setSalesOrgNm_IsNullOrEmpty() { regSalesOrgNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_NM: {VARCHAR(60)}
     */
    public void setSalesOrgNm_IsNotNull() { regSalesOrgNm(CK_ISNN, DOBJ); }

    protected void regSalesOrgNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgNm(), "SALES_ORG_NM"); }
    protected abstract ConditionValue xgetCValueSalesOrgNm();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_Equal(Long yamatoShippingNum) {
        doSetYamatoShippingNum_Equal(yamatoShippingNum);
    }

    protected void doSetYamatoShippingNum_Equal(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_EQ, yamatoShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_NotEqual(Long yamatoShippingNum) {
        doSetYamatoShippingNum_NotEqual(yamatoShippingNum);
    }

    protected void doSetYamatoShippingNum_NotEqual(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_NES, yamatoShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_GreaterThan(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_GT, yamatoShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_LessThan(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_LT, yamatoShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_GreaterEqual(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_GE, yamatoShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNum The value of yamatoShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_LessEqual(Long yamatoShippingNum) {
        regYamatoShippingNum(CK_LE, yamatoShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of yamatoShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of yamatoShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYamatoShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYamatoShippingNum(), "YAMATO_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNumList The collection of yamatoShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_InScope(Collection<Long> yamatoShippingNumList) {
        doSetYamatoShippingNum_InScope(yamatoShippingNumList);
    }

    protected void doSetYamatoShippingNum_InScope(Collection<Long> yamatoShippingNumList) {
        regINS(CK_INS, cTL(yamatoShippingNumList), xgetCValueYamatoShippingNum(), "YAMATO_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoShippingNumList The collection of yamatoShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYamatoShippingNum_NotInScope(Collection<Long> yamatoShippingNumList) {
        doSetYamatoShippingNum_NotInScope(yamatoShippingNumList);
    }

    protected void doSetYamatoShippingNum_NotInScope(Collection<Long> yamatoShippingNumList) {
        regINS(CK_NINS, cTL(yamatoShippingNumList), xgetCValueYamatoShippingNum(), "YAMATO_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setYamatoShippingNum_IsNull() { regYamatoShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YAMATO_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setYamatoShippingNum_IsNotNull() { regYamatoShippingNum(CK_ISNN, DOBJ); }

    protected void regYamatoShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYamatoShippingNum(), "YAMATO_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueYamatoShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_Equal(Long yamatoEcShippingNum) {
        doSetYamatoEcShippingNum_Equal(yamatoEcShippingNum);
    }

    protected void doSetYamatoEcShippingNum_Equal(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_EQ, yamatoEcShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_NotEqual(Long yamatoEcShippingNum) {
        doSetYamatoEcShippingNum_NotEqual(yamatoEcShippingNum);
    }

    protected void doSetYamatoEcShippingNum_NotEqual(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_NES, yamatoEcShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_GreaterThan(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_GT, yamatoEcShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_LessThan(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_LT, yamatoEcShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_GreaterEqual(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_GE, yamatoEcShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNum The value of yamatoEcShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_LessEqual(Long yamatoEcShippingNum) {
        regYamatoEcShippingNum(CK_LE, yamatoEcShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of yamatoEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of yamatoEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYamatoEcShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYamatoEcShippingNum(), "YAMATO_EC_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNumList The collection of yamatoEcShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_InScope(Collection<Long> yamatoEcShippingNumList) {
        doSetYamatoEcShippingNum_InScope(yamatoEcShippingNumList);
    }

    protected void doSetYamatoEcShippingNum_InScope(Collection<Long> yamatoEcShippingNumList) {
        regINS(CK_INS, cTL(yamatoEcShippingNumList), xgetCValueYamatoEcShippingNum(), "YAMATO_EC_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param yamatoEcShippingNumList The collection of yamatoEcShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYamatoEcShippingNum_NotInScope(Collection<Long> yamatoEcShippingNumList) {
        doSetYamatoEcShippingNum_NotInScope(yamatoEcShippingNumList);
    }

    protected void doSetYamatoEcShippingNum_NotInScope(Collection<Long> yamatoEcShippingNumList) {
        regINS(CK_NINS, cTL(yamatoEcShippingNumList), xgetCValueYamatoEcShippingNum(), "YAMATO_EC_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setYamatoEcShippingNum_IsNull() { regYamatoEcShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YAMATO_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setYamatoEcShippingNum_IsNotNull() { regYamatoEcShippingNum(CK_ISNN, DOBJ); }

    protected void regYamatoEcShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYamatoEcShippingNum(), "YAMATO_EC_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueYamatoEcShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_Equal(Long sagawaShippingNum) {
        doSetSagawaShippingNum_Equal(sagawaShippingNum);
    }

    protected void doSetSagawaShippingNum_Equal(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_EQ, sagawaShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_NotEqual(Long sagawaShippingNum) {
        doSetSagawaShippingNum_NotEqual(sagawaShippingNum);
    }

    protected void doSetSagawaShippingNum_NotEqual(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_NES, sagawaShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_GreaterThan(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_GT, sagawaShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_LessThan(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_LT, sagawaShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_GreaterEqual(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_GE, sagawaShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNum The value of sagawaShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_LessEqual(Long sagawaShippingNum) {
        regSagawaShippingNum(CK_LE, sagawaShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of sagawaShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sagawaShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSagawaShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSagawaShippingNum(), "SAGAWA_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNumList The collection of sagawaShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_InScope(Collection<Long> sagawaShippingNumList) {
        doSetSagawaShippingNum_InScope(sagawaShippingNumList);
    }

    protected void doSetSagawaShippingNum_InScope(Collection<Long> sagawaShippingNumList) {
        regINS(CK_INS, cTL(sagawaShippingNumList), xgetCValueSagawaShippingNum(), "SAGAWA_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaShippingNumList The collection of sagawaShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawaShippingNum_NotInScope(Collection<Long> sagawaShippingNumList) {
        doSetSagawaShippingNum_NotInScope(sagawaShippingNumList);
    }

    protected void doSetSagawaShippingNum_NotInScope(Collection<Long> sagawaShippingNumList) {
        regINS(CK_NINS, cTL(sagawaShippingNumList), xgetCValueSagawaShippingNum(), "SAGAWA_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawaShippingNum_IsNull() { regSagawaShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAGAWA_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawaShippingNum_IsNotNull() { regSagawaShippingNum(CK_ISNN, DOBJ); }

    protected void regSagawaShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSagawaShippingNum(), "SAGAWA_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueSagawaShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_Equal(Long sagawaEcShippingNum) {
        doSetSagawaEcShippingNum_Equal(sagawaEcShippingNum);
    }

    protected void doSetSagawaEcShippingNum_Equal(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_EQ, sagawaEcShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_NotEqual(Long sagawaEcShippingNum) {
        doSetSagawaEcShippingNum_NotEqual(sagawaEcShippingNum);
    }

    protected void doSetSagawaEcShippingNum_NotEqual(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_NES, sagawaEcShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_GreaterThan(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_GT, sagawaEcShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_LessThan(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_LT, sagawaEcShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_GreaterEqual(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_GE, sagawaEcShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNum The value of sagawaEcShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_LessEqual(Long sagawaEcShippingNum) {
        regSagawaEcShippingNum(CK_LE, sagawaEcShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of sagawaEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sagawaEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSagawaEcShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSagawaEcShippingNum(), "SAGAWA_EC_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNumList The collection of sagawaEcShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_InScope(Collection<Long> sagawaEcShippingNumList) {
        doSetSagawaEcShippingNum_InScope(sagawaEcShippingNumList);
    }

    protected void doSetSagawaEcShippingNum_InScope(Collection<Long> sagawaEcShippingNumList) {
        regINS(CK_INS, cTL(sagawaEcShippingNumList), xgetCValueSagawaEcShippingNum(), "SAGAWA_EC_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawaEcShippingNumList The collection of sagawaEcShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawaEcShippingNum_NotInScope(Collection<Long> sagawaEcShippingNumList) {
        doSetSagawaEcShippingNum_NotInScope(sagawaEcShippingNumList);
    }

    protected void doSetSagawaEcShippingNum_NotInScope(Collection<Long> sagawaEcShippingNumList) {
        regINS(CK_NINS, cTL(sagawaEcShippingNumList), xgetCValueSagawaEcShippingNum(), "SAGAWA_EC_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawaEcShippingNum_IsNull() { regSagawaEcShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawaEcShippingNum_IsNotNull() { regSagawaEcShippingNum(CK_ISNN, DOBJ); }

    protected void regSagawaEcShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSagawaEcShippingNum(), "SAGAWA_EC_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueSagawaEcShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_Equal(Long sagawa2ShippingNum) {
        doSetSagawa2ShippingNum_Equal(sagawa2ShippingNum);
    }

    protected void doSetSagawa2ShippingNum_Equal(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_EQ, sagawa2ShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_NotEqual(Long sagawa2ShippingNum) {
        doSetSagawa2ShippingNum_NotEqual(sagawa2ShippingNum);
    }

    protected void doSetSagawa2ShippingNum_NotEqual(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_NES, sagawa2ShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_GreaterThan(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_GT, sagawa2ShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_LessThan(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_LT, sagawa2ShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_GreaterEqual(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_GE, sagawa2ShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNum The value of sagawa2ShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_LessEqual(Long sagawa2ShippingNum) {
        regSagawa2ShippingNum(CK_LE, sagawa2ShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of sagawa2ShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sagawa2ShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSagawa2ShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSagawa2ShippingNum(), "SAGAWA2_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNumList The collection of sagawa2ShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_InScope(Collection<Long> sagawa2ShippingNumList) {
        doSetSagawa2ShippingNum_InScope(sagawa2ShippingNumList);
    }

    protected void doSetSagawa2ShippingNum_InScope(Collection<Long> sagawa2ShippingNumList) {
        regINS(CK_INS, cTL(sagawa2ShippingNumList), xgetCValueSagawa2ShippingNum(), "SAGAWA2_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2ShippingNumList The collection of sagawa2ShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawa2ShippingNum_NotInScope(Collection<Long> sagawa2ShippingNumList) {
        doSetSagawa2ShippingNum_NotInScope(sagawa2ShippingNumList);
    }

    protected void doSetSagawa2ShippingNum_NotInScope(Collection<Long> sagawa2ShippingNumList) {
        regINS(CK_NINS, cTL(sagawa2ShippingNumList), xgetCValueSagawa2ShippingNum(), "SAGAWA2_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawa2ShippingNum_IsNull() { regSagawa2ShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAGAWA2_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawa2ShippingNum_IsNotNull() { regSagawa2ShippingNum(CK_ISNN, DOBJ); }

    protected void regSagawa2ShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSagawa2ShippingNum(), "SAGAWA2_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueSagawa2ShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_Equal(Long sagawa2EcShippingNum) {
        doSetSagawa2EcShippingNum_Equal(sagawa2EcShippingNum);
    }

    protected void doSetSagawa2EcShippingNum_Equal(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_EQ, sagawa2EcShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_NotEqual(Long sagawa2EcShippingNum) {
        doSetSagawa2EcShippingNum_NotEqual(sagawa2EcShippingNum);
    }

    protected void doSetSagawa2EcShippingNum_NotEqual(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_NES, sagawa2EcShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_GreaterThan(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_GT, sagawa2EcShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_LessThan(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_LT, sagawa2EcShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_GreaterEqual(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_GE, sagawa2EcShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNum The value of sagawa2EcShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_LessEqual(Long sagawa2EcShippingNum) {
        regSagawa2EcShippingNum(CK_LE, sagawa2EcShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of sagawa2EcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sagawa2EcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSagawa2EcShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSagawa2EcShippingNum(), "SAGAWA2_EC_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNumList The collection of sagawa2EcShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_InScope(Collection<Long> sagawa2EcShippingNumList) {
        doSetSagawa2EcShippingNum_InScope(sagawa2EcShippingNumList);
    }

    protected void doSetSagawa2EcShippingNum_InScope(Collection<Long> sagawa2EcShippingNumList) {
        regINS(CK_INS, cTL(sagawa2EcShippingNumList), xgetCValueSagawa2EcShippingNum(), "SAGAWA2_EC_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param sagawa2EcShippingNumList The collection of sagawa2EcShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSagawa2EcShippingNum_NotInScope(Collection<Long> sagawa2EcShippingNumList) {
        doSetSagawa2EcShippingNum_NotInScope(sagawa2EcShippingNumList);
    }

    protected void doSetSagawa2EcShippingNum_NotInScope(Collection<Long> sagawa2EcShippingNumList) {
        regINS(CK_NINS, cTL(sagawa2EcShippingNumList), xgetCValueSagawa2EcShippingNum(), "SAGAWA2_EC_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawa2EcShippingNum_IsNull() { regSagawa2EcShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setSagawa2EcShippingNum_IsNotNull() { regSagawa2EcShippingNum(CK_ISNN, DOBJ); }

    protected void regSagawa2EcShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSagawa2EcShippingNum(), "SAGAWA2_EC_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueSagawa2EcShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_Equal(Long otherShippingNum) {
        doSetOtherShippingNum_Equal(otherShippingNum);
    }

    protected void doSetOtherShippingNum_Equal(Long otherShippingNum) {
        regOtherShippingNum(CK_EQ, otherShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_NotEqual(Long otherShippingNum) {
        doSetOtherShippingNum_NotEqual(otherShippingNum);
    }

    protected void doSetOtherShippingNum_NotEqual(Long otherShippingNum) {
        regOtherShippingNum(CK_NES, otherShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_GreaterThan(Long otherShippingNum) {
        regOtherShippingNum(CK_GT, otherShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_LessThan(Long otherShippingNum) {
        regOtherShippingNum(CK_LT, otherShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_GreaterEqual(Long otherShippingNum) {
        regOtherShippingNum(CK_GE, otherShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNum The value of otherShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherShippingNum_LessEqual(Long otherShippingNum) {
        regOtherShippingNum(CK_LE, otherShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of otherShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherShippingNum(), "OTHER_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNumList The collection of otherShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherShippingNum_InScope(Collection<Long> otherShippingNumList) {
        doSetOtherShippingNum_InScope(otherShippingNumList);
    }

    protected void doSetOtherShippingNum_InScope(Collection<Long> otherShippingNumList) {
        regINS(CK_INS, cTL(otherShippingNumList), xgetCValueOtherShippingNum(), "OTHER_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     * @param otherShippingNumList The collection of otherShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherShippingNum_NotInScope(Collection<Long> otherShippingNumList) {
        doSetOtherShippingNum_NotInScope(otherShippingNumList);
    }

    protected void doSetOtherShippingNum_NotInScope(Collection<Long> otherShippingNumList) {
        regINS(CK_NINS, cTL(otherShippingNumList), xgetCValueOtherShippingNum(), "OTHER_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setOtherShippingNum_IsNull() { regOtherShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setOtherShippingNum_IsNotNull() { regOtherShippingNum(CK_ISNN, DOBJ); }

    protected void regOtherShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherShippingNum(), "OTHER_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueOtherShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_Equal(Long otherEcShippingNum) {
        doSetOtherEcShippingNum_Equal(otherEcShippingNum);
    }

    protected void doSetOtherEcShippingNum_Equal(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_EQ, otherEcShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_NotEqual(Long otherEcShippingNum) {
        doSetOtherEcShippingNum_NotEqual(otherEcShippingNum);
    }

    protected void doSetOtherEcShippingNum_NotEqual(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_NES, otherEcShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_GreaterThan(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_GT, otherEcShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_LessThan(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_LT, otherEcShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_GreaterEqual(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_GE, otherEcShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNum The value of otherEcShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_LessEqual(Long otherEcShippingNum) {
        regOtherEcShippingNum(CK_LE, otherEcShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of otherEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherEcShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherEcShippingNum(), "OTHER_EC_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNumList The collection of otherEcShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_InScope(Collection<Long> otherEcShippingNumList) {
        doSetOtherEcShippingNum_InScope(otherEcShippingNumList);
    }

    protected void doSetOtherEcShippingNum_InScope(Collection<Long> otherEcShippingNumList) {
        regINS(CK_INS, cTL(otherEcShippingNumList), xgetCValueOtherEcShippingNum(), "OTHER_EC_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param otherEcShippingNumList The collection of otherEcShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherEcShippingNum_NotInScope(Collection<Long> otherEcShippingNumList) {
        doSetOtherEcShippingNum_NotInScope(otherEcShippingNumList);
    }

    protected void doSetOtherEcShippingNum_NotInScope(Collection<Long> otherEcShippingNumList) {
        regINS(CK_NINS, cTL(otherEcShippingNumList), xgetCValueOtherEcShippingNum(), "OTHER_EC_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setOtherEcShippingNum_IsNull() { regOtherEcShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setOtherEcShippingNum_IsNotNull() { regOtherEcShippingNum(CK_ISNN, DOBJ); }

    protected void regOtherEcShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherEcShippingNum(), "OTHER_EC_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueOtherEcShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_Equal(Long cancelShippingNum) {
        doSetCancelShippingNum_Equal(cancelShippingNum);
    }

    protected void doSetCancelShippingNum_Equal(Long cancelShippingNum) {
        regCancelShippingNum(CK_EQ, cancelShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_NotEqual(Long cancelShippingNum) {
        doSetCancelShippingNum_NotEqual(cancelShippingNum);
    }

    protected void doSetCancelShippingNum_NotEqual(Long cancelShippingNum) {
        regCancelShippingNum(CK_NES, cancelShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_GreaterThan(Long cancelShippingNum) {
        regCancelShippingNum(CK_GT, cancelShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_LessThan(Long cancelShippingNum) {
        regCancelShippingNum(CK_LT, cancelShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_GreaterEqual(Long cancelShippingNum) {
        regCancelShippingNum(CK_GE, cancelShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNum The value of cancelShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelShippingNum_LessEqual(Long cancelShippingNum) {
        regCancelShippingNum(CK_LE, cancelShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of cancelShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cancelShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCancelShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCancelShippingNum(), "CANCEL_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNumList The collection of cancelShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCancelShippingNum_InScope(Collection<Long> cancelShippingNumList) {
        doSetCancelShippingNum_InScope(cancelShippingNumList);
    }

    protected void doSetCancelShippingNum_InScope(Collection<Long> cancelShippingNumList) {
        regINS(CK_INS, cTL(cancelShippingNumList), xgetCValueCancelShippingNum(), "CANCEL_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelShippingNumList The collection of cancelShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCancelShippingNum_NotInScope(Collection<Long> cancelShippingNumList) {
        doSetCancelShippingNum_NotInScope(cancelShippingNumList);
    }

    protected void doSetCancelShippingNum_NotInScope(Collection<Long> cancelShippingNumList) {
        regINS(CK_NINS, cTL(cancelShippingNumList), xgetCValueCancelShippingNum(), "CANCEL_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setCancelShippingNum_IsNull() { regCancelShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CANCEL_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setCancelShippingNum_IsNotNull() { regCancelShippingNum(CK_ISNN, DOBJ); }

    protected void regCancelShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCancelShippingNum(), "CANCEL_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueCancelShippingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_Equal(Long cancelEcShippingNum) {
        doSetCancelEcShippingNum_Equal(cancelEcShippingNum);
    }

    protected void doSetCancelEcShippingNum_Equal(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_EQ, cancelEcShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_NotEqual(Long cancelEcShippingNum) {
        doSetCancelEcShippingNum_NotEqual(cancelEcShippingNum);
    }

    protected void doSetCancelEcShippingNum_NotEqual(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_NES, cancelEcShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_GreaterThan(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_GT, cancelEcShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_LessThan(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_LT, cancelEcShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_GreaterEqual(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_GE, cancelEcShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNum The value of cancelEcShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_LessEqual(Long cancelEcShippingNum) {
        regCancelEcShippingNum(CK_LE, cancelEcShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of cancelEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cancelEcShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCancelEcShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCancelEcShippingNum(), "CANCEL_EC_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNumList The collection of cancelEcShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_InScope(Collection<Long> cancelEcShippingNumList) {
        doSetCancelEcShippingNum_InScope(cancelEcShippingNumList);
    }

    protected void doSetCancelEcShippingNum_InScope(Collection<Long> cancelEcShippingNumList) {
        regINS(CK_INS, cTL(cancelEcShippingNumList), xgetCValueCancelEcShippingNum(), "CANCEL_EC_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     * @param cancelEcShippingNumList The collection of cancelEcShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCancelEcShippingNum_NotInScope(Collection<Long> cancelEcShippingNumList) {
        doSetCancelEcShippingNum_NotInScope(cancelEcShippingNumList);
    }

    protected void doSetCancelEcShippingNum_NotInScope(Collection<Long> cancelEcShippingNumList) {
        regINS(CK_NINS, cTL(cancelEcShippingNumList), xgetCValueCancelEcShippingNum(), "CANCEL_EC_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setCancelEcShippingNum_IsNull() { regCancelEcShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CANCEL_EC_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setCancelEcShippingNum_IsNotNull() { regCancelEcShippingNum(CK_ISNN, DOBJ); }

    protected void regCancelEcShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCancelEcShippingNum(), "CANCEL_EC_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueCancelEcShippingNum();

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
    public HpSLCFunction<TBldl3350CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl3350CB.class);
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
    public HpSLCFunction<TBldl3350CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl3350CB.class);
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
    public HpSLCFunction<TBldl3350CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl3350CB.class);
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
    public HpSLCFunction<TBldl3350CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl3350CB.class);
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
    public HpSLCFunction<TBldl3350CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl3350CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl3350CB&gt;() {
     *     public void query(TBldl3350CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl3350CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl3350CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3350CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl3350CQ sq);

    protected TBldl3350CB xcreateScalarConditionCB() {
        TBldl3350CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl3350CB xcreateScalarConditionPartitionByCB() {
        TBldl3350CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl3350CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3350CB cb = new TBldl3350CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL3350_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl3350CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl3350CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl3350CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3350CB cb = new TBldl3350CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL3350_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl3350CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl3350CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl3350CB cb = new TBldl3350CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl3350CQ sq);

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
    protected TBldl3350CB newMyCB() {
        return new TBldl3350CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl3350CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
