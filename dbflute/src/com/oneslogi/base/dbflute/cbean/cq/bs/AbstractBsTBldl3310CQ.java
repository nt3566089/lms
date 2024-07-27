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
 * The abstract condition-query of t_bldl3310.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl3310CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl3310CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl3310";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_Equal(Long bldl3310Id) {
        doSetBldl3310Id_Equal(bldl3310Id);
    }

    protected void doSetBldl3310Id_Equal(Long bldl3310Id) {
        regBldl3310Id(CK_EQ, bldl3310Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_NotEqual(Long bldl3310Id) {
        doSetBldl3310Id_NotEqual(bldl3310Id);
    }

    protected void doSetBldl3310Id_NotEqual(Long bldl3310Id) {
        regBldl3310Id(CK_NES, bldl3310Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_GreaterThan(Long bldl3310Id) {
        regBldl3310Id(CK_GT, bldl3310Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_LessThan(Long bldl3310Id) {
        regBldl3310Id(CK_LT, bldl3310Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_GreaterEqual(Long bldl3310Id) {
        regBldl3310Id(CK_GE, bldl3310Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310Id The value of bldl3310Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl3310Id_LessEqual(Long bldl3310Id) {
        regBldl3310Id(CK_LE, bldl3310Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl3310Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl3310Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl3310Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl3310Id(), "BLDL3310_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310IdList The collection of bldl3310Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl3310Id_InScope(Collection<Long> bldl3310IdList) {
        doSetBldl3310Id_InScope(bldl3310IdList);
    }

    protected void doSetBldl3310Id_InScope(Collection<Long> bldl3310IdList) {
        regINS(CK_INS, cTL(bldl3310IdList), xgetCValueBldl3310Id(), "BLDL3310_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl3310IdList The collection of bldl3310Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl3310Id_NotInScope(Collection<Long> bldl3310IdList) {
        doSetBldl3310Id_NotInScope(bldl3310IdList);
    }

    protected void doSetBldl3310Id_NotInScope(Collection<Long> bldl3310IdList) {
        regINS(CK_NINS, cTL(bldl3310IdList), xgetCValueBldl3310Id(), "BLDL3310_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl3310Id_IsNull() { regBldl3310Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl3310Id_IsNotNull() { regBldl3310Id(CK_ISNN, DOBJ); }

    protected void regBldl3310Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl3310Id(), "BLDL3310_ID"); }
    protected abstract ConditionValue xgetCValueBldl3310Id();

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
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_Equal(String ecTypeCd) {
        doSetEcTypeCd_Equal(fRES(ecTypeCd));
    }

    protected void doSetEcTypeCd_Equal(String ecTypeCd) {
        regEcTypeCd(CK_EQ, ecTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_NotEqual(String ecTypeCd) {
        doSetEcTypeCd_NotEqual(fRES(ecTypeCd));
    }

    protected void doSetEcTypeCd_NotEqual(String ecTypeCd) {
        regEcTypeCd(CK_NES, ecTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_GreaterThan(String ecTypeCd) {
        regEcTypeCd(CK_GT, fRES(ecTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_LessThan(String ecTypeCd) {
        regEcTypeCd(CK_LT, fRES(ecTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_GreaterEqual(String ecTypeCd) {
        regEcTypeCd(CK_GE, fRES(ecTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_LessEqual(String ecTypeCd) {
        regEcTypeCd(CK_LE, fRES(ecTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCdList The collection of ecTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_InScope(Collection<String> ecTypeCdList) {
        doSetEcTypeCd_InScope(ecTypeCdList);
    }

    protected void doSetEcTypeCd_InScope(Collection<String> ecTypeCdList) {
        regINS(CK_INS, cTL(ecTypeCdList), xgetCValueEcTypeCd(), "EC_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCdList The collection of ecTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_NotInScope(Collection<String> ecTypeCdList) {
        doSetEcTypeCd_NotInScope(ecTypeCdList);
    }

    protected void doSetEcTypeCd_NotInScope(Collection<String> ecTypeCdList) {
        regINS(CK_NINS, cTL(ecTypeCdList), xgetCValueEcTypeCd(), "EC_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setEcTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecTypeCd The value of ecTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcTypeCd_LikeSearch(String ecTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecTypeCd), xgetCValueEcTypeCd(), "EC_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcTypeCd_NotLikeSearch(String ecTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecTypeCd), xgetCValueEcTypeCd(), "EC_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     * @param ecTypeCd The value of ecTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcTypeCd_PrefixSearch(String ecTypeCd) {
        setEcTypeCd_LikeSearch(ecTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     */
    public void setEcTypeCd_IsNull() { regEcTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     */
    public void setEcTypeCd_IsNullOrEmpty() { regEcTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_TYPE_CD: {VARCHAR(30)}
     */
    public void setEcTypeCd_IsNotNull() { regEcTypeCd(CK_ISNN, DOBJ); }

    protected void regEcTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcTypeCd(), "EC_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueEcTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_Equal(Long fwPrice) {
        doSetFwPrice_Equal(fwPrice);
    }

    protected void doSetFwPrice_Equal(Long fwPrice) {
        regFwPrice(CK_EQ, fwPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_NotEqual(Long fwPrice) {
        doSetFwPrice_NotEqual(fwPrice);
    }

    protected void doSetFwPrice_NotEqual(Long fwPrice) {
        regFwPrice(CK_NES, fwPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_GreaterThan(Long fwPrice) {
        regFwPrice(CK_GT, fwPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_LessThan(Long fwPrice) {
        regFwPrice(CK_LT, fwPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_GreaterEqual(Long fwPrice) {
        regFwPrice(CK_GE, fwPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPrice The value of fwPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPrice_LessEqual(Long fwPrice) {
        regFwPrice(CK_LE, fwPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param minNumber The min number of fwPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwPrice(), "FW_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPriceList The collection of fwPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwPrice_InScope(Collection<Long> fwPriceList) {
        doSetFwPrice_InScope(fwPriceList);
    }

    protected void doSetFwPrice_InScope(Collection<Long> fwPriceList) {
        regINS(CK_INS, cTL(fwPriceList), xgetCValueFwPrice(), "FW_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     * @param fwPriceList The collection of fwPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwPrice_NotInScope(Collection<Long> fwPriceList) {
        doSetFwPrice_NotInScope(fwPriceList);
    }

    protected void doSetFwPrice_NotInScope(Collection<Long> fwPriceList) {
        regINS(CK_NINS, cTL(fwPriceList), xgetCValueFwPrice(), "FW_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     */
    public void setFwPrice_IsNull() { regFwPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_PRICE: {BIGINT(19)}
     */
    public void setFwPrice_IsNotNull() { regFwPrice(CK_ISNN, DOBJ); }

    protected void regFwPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwPrice(), "FW_PRICE"); }
    protected abstract ConditionValue xgetCValueFwPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_Equal(Long sanshaFwPrice) {
        doSetSanshaFwPrice_Equal(sanshaFwPrice);
    }

    protected void doSetSanshaFwPrice_Equal(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_EQ, sanshaFwPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_NotEqual(Long sanshaFwPrice) {
        doSetSanshaFwPrice_NotEqual(sanshaFwPrice);
    }

    protected void doSetSanshaFwPrice_NotEqual(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_NES, sanshaFwPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_GreaterThan(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_GT, sanshaFwPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_LessThan(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_LT, sanshaFwPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_GreaterEqual(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_GE, sanshaFwPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPrice The value of sanshaFwPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_LessEqual(Long sanshaFwPrice) {
        regSanshaFwPrice(CK_LE, sanshaFwPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param minNumber The min number of sanshaFwPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sanshaFwPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSanshaFwPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSanshaFwPrice(), "SANSHA_FW_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPriceList The collection of sanshaFwPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_InScope(Collection<Long> sanshaFwPriceList) {
        doSetSanshaFwPrice_InScope(sanshaFwPriceList);
    }

    protected void doSetSanshaFwPrice_InScope(Collection<Long> sanshaFwPriceList) {
        regINS(CK_INS, cTL(sanshaFwPriceList), xgetCValueSanshaFwPrice(), "SANSHA_FW_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     * @param sanshaFwPriceList The collection of sanshaFwPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaFwPrice_NotInScope(Collection<Long> sanshaFwPriceList) {
        doSetSanshaFwPrice_NotInScope(sanshaFwPriceList);
    }

    protected void doSetSanshaFwPrice_NotInScope(Collection<Long> sanshaFwPriceList) {
        regINS(CK_NINS, cTL(sanshaFwPriceList), xgetCValueSanshaFwPrice(), "SANSHA_FW_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     */
    public void setSanshaFwPrice_IsNull() { regSanshaFwPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_FW_PRICE: {BIGINT(19)}
     */
    public void setSanshaFwPrice_IsNotNull() { regSanshaFwPrice(CK_ISNN, DOBJ); }

    protected void regSanshaFwPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaFwPrice(), "SANSHA_FW_PRICE"); }
    protected abstract ConditionValue xgetCValueSanshaFwPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_Equal(Long sanshaUnPrice) {
        doSetSanshaUnPrice_Equal(sanshaUnPrice);
    }

    protected void doSetSanshaUnPrice_Equal(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_EQ, sanshaUnPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_NotEqual(Long sanshaUnPrice) {
        doSetSanshaUnPrice_NotEqual(sanshaUnPrice);
    }

    protected void doSetSanshaUnPrice_NotEqual(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_NES, sanshaUnPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_GreaterThan(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_GT, sanshaUnPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_LessThan(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_LT, sanshaUnPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_GreaterEqual(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_GE, sanshaUnPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPrice The value of sanshaUnPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_LessEqual(Long sanshaUnPrice) {
        regSanshaUnPrice(CK_LE, sanshaUnPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param minNumber The min number of sanshaUnPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sanshaUnPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSanshaUnPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSanshaUnPrice(), "SANSHA_UN_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPriceList The collection of sanshaUnPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_InScope(Collection<Long> sanshaUnPriceList) {
        doSetSanshaUnPrice_InScope(sanshaUnPriceList);
    }

    protected void doSetSanshaUnPrice_InScope(Collection<Long> sanshaUnPriceList) {
        regINS(CK_INS, cTL(sanshaUnPriceList), xgetCValueSanshaUnPrice(), "SANSHA_UN_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     * @param sanshaUnPriceList The collection of sanshaUnPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaUnPrice_NotInScope(Collection<Long> sanshaUnPriceList) {
        doSetSanshaUnPrice_NotInScope(sanshaUnPriceList);
    }

    protected void doSetSanshaUnPrice_NotInScope(Collection<Long> sanshaUnPriceList) {
        regINS(CK_NINS, cTL(sanshaUnPriceList), xgetCValueSanshaUnPrice(), "SANSHA_UN_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     */
    public void setSanshaUnPrice_IsNull() { regSanshaUnPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_UN_PRICE: {BIGINT(19)}
     */
    public void setSanshaUnPrice_IsNotNull() { regSanshaUnPrice(CK_ISNN, DOBJ); }

    protected void regSanshaUnPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaUnPrice(), "SANSHA_UN_PRICE"); }
    protected abstract ConditionValue xgetCValueSanshaUnPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_Equal(Long sanshaShPrice) {
        doSetSanshaShPrice_Equal(sanshaShPrice);
    }

    protected void doSetSanshaShPrice_Equal(Long sanshaShPrice) {
        regSanshaShPrice(CK_EQ, sanshaShPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_NotEqual(Long sanshaShPrice) {
        doSetSanshaShPrice_NotEqual(sanshaShPrice);
    }

    protected void doSetSanshaShPrice_NotEqual(Long sanshaShPrice) {
        regSanshaShPrice(CK_NES, sanshaShPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_GreaterThan(Long sanshaShPrice) {
        regSanshaShPrice(CK_GT, sanshaShPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_LessThan(Long sanshaShPrice) {
        regSanshaShPrice(CK_LT, sanshaShPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_GreaterEqual(Long sanshaShPrice) {
        regSanshaShPrice(CK_GE, sanshaShPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPrice The value of sanshaShPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaShPrice_LessEqual(Long sanshaShPrice) {
        regSanshaShPrice(CK_LE, sanshaShPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param minNumber The min number of sanshaShPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sanshaShPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSanshaShPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSanshaShPrice(), "SANSHA_SH_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPriceList The collection of sanshaShPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaShPrice_InScope(Collection<Long> sanshaShPriceList) {
        doSetSanshaShPrice_InScope(sanshaShPriceList);
    }

    protected void doSetSanshaShPrice_InScope(Collection<Long> sanshaShPriceList) {
        regINS(CK_INS, cTL(sanshaShPriceList), xgetCValueSanshaShPrice(), "SANSHA_SH_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     * @param sanshaShPriceList The collection of sanshaShPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaShPrice_NotInScope(Collection<Long> sanshaShPriceList) {
        doSetSanshaShPrice_NotInScope(sanshaShPriceList);
    }

    protected void doSetSanshaShPrice_NotInScope(Collection<Long> sanshaShPriceList) {
        regINS(CK_NINS, cTL(sanshaShPriceList), xgetCValueSanshaShPrice(), "SANSHA_SH_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     */
    public void setSanshaShPrice_IsNull() { regSanshaShPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_SH_PRICE: {BIGINT(19)}
     */
    public void setSanshaShPrice_IsNotNull() { regSanshaShPrice(CK_ISNN, DOBJ); }

    protected void regSanshaShPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaShPrice(), "SANSHA_SH_PRICE"); }
    protected abstract ConditionValue xgetCValueSanshaShPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_Equal(Long sanshaHmPrice) {
        doSetSanshaHmPrice_Equal(sanshaHmPrice);
    }

    protected void doSetSanshaHmPrice_Equal(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_EQ, sanshaHmPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_NotEqual(Long sanshaHmPrice) {
        doSetSanshaHmPrice_NotEqual(sanshaHmPrice);
    }

    protected void doSetSanshaHmPrice_NotEqual(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_NES, sanshaHmPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_GreaterThan(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_GT, sanshaHmPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_LessThan(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_LT, sanshaHmPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_GreaterEqual(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_GE, sanshaHmPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPrice The value of sanshaHmPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_LessEqual(Long sanshaHmPrice) {
        regSanshaHmPrice(CK_LE, sanshaHmPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param minNumber The min number of sanshaHmPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sanshaHmPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSanshaHmPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSanshaHmPrice(), "SANSHA_HM_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPriceList The collection of sanshaHmPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_InScope(Collection<Long> sanshaHmPriceList) {
        doSetSanshaHmPrice_InScope(sanshaHmPriceList);
    }

    protected void doSetSanshaHmPrice_InScope(Collection<Long> sanshaHmPriceList) {
        regINS(CK_INS, cTL(sanshaHmPriceList), xgetCValueSanshaHmPrice(), "SANSHA_HM_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     * @param sanshaHmPriceList The collection of sanshaHmPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaHmPrice_NotInScope(Collection<Long> sanshaHmPriceList) {
        doSetSanshaHmPrice_NotInScope(sanshaHmPriceList);
    }

    protected void doSetSanshaHmPrice_NotInScope(Collection<Long> sanshaHmPriceList) {
        regINS(CK_NINS, cTL(sanshaHmPriceList), xgetCValueSanshaHmPrice(), "SANSHA_HM_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     */
    public void setSanshaHmPrice_IsNull() { regSanshaHmPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_HM_PRICE: {BIGINT(19)}
     */
    public void setSanshaHmPrice_IsNotNull() { regSanshaHmPrice(CK_ISNN, DOBJ); }

    protected void regSanshaHmPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaHmPrice(), "SANSHA_HM_PRICE"); }
    protected abstract ConditionValue xgetCValueSanshaHmPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_Equal(Long sanshaTotalPrice) {
        doSetSanshaTotalPrice_Equal(sanshaTotalPrice);
    }

    protected void doSetSanshaTotalPrice_Equal(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_EQ, sanshaTotalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_NotEqual(Long sanshaTotalPrice) {
        doSetSanshaTotalPrice_NotEqual(sanshaTotalPrice);
    }

    protected void doSetSanshaTotalPrice_NotEqual(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_NES, sanshaTotalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_GreaterThan(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_GT, sanshaTotalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_LessThan(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_LT, sanshaTotalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_GreaterEqual(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_GE, sanshaTotalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPrice The value of sanshaTotalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_LessEqual(Long sanshaTotalPrice) {
        regSanshaTotalPrice(CK_LE, sanshaTotalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param minNumber The min number of sanshaTotalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sanshaTotalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSanshaTotalPrice_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSanshaTotalPrice(), "SANSHA_TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPriceList The collection of sanshaTotalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_InScope(Collection<Long> sanshaTotalPriceList) {
        doSetSanshaTotalPrice_InScope(sanshaTotalPriceList);
    }

    protected void doSetSanshaTotalPrice_InScope(Collection<Long> sanshaTotalPriceList) {
        regINS(CK_INS, cTL(sanshaTotalPriceList), xgetCValueSanshaTotalPrice(), "SANSHA_TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     * @param sanshaTotalPriceList The collection of sanshaTotalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTotalPrice_NotInScope(Collection<Long> sanshaTotalPriceList) {
        doSetSanshaTotalPrice_NotInScope(sanshaTotalPriceList);
    }

    protected void doSetSanshaTotalPrice_NotInScope(Collection<Long> sanshaTotalPriceList) {
        regINS(CK_NINS, cTL(sanshaTotalPriceList), xgetCValueSanshaTotalPrice(), "SANSHA_TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     */
    public void setSanshaTotalPrice_IsNull() { regSanshaTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_TOTAL_PRICE: {BIGINT(19)}
     */
    public void setSanshaTotalPrice_IsNotNull() { regSanshaTotalPrice(CK_ISNN, DOBJ); }

    protected void regSanshaTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaTotalPrice(), "SANSHA_TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueSanshaTotalPrice();

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
    public HpSLCFunction<TBldl3310CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl3310CB.class);
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
    public HpSLCFunction<TBldl3310CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl3310CB.class);
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
    public HpSLCFunction<TBldl3310CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl3310CB.class);
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
    public HpSLCFunction<TBldl3310CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl3310CB.class);
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
    public HpSLCFunction<TBldl3310CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl3310CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl3310CB&gt;() {
     *     public void query(TBldl3310CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl3310CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl3310CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3310CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl3310CQ sq);

    protected TBldl3310CB xcreateScalarConditionCB() {
        TBldl3310CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl3310CB xcreateScalarConditionPartitionByCB() {
        TBldl3310CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl3310CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3310CB cb = new TBldl3310CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL3310_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl3310CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl3310CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl3310CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl3310CB cb = new TBldl3310CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL3310_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl3310CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl3310CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl3310CB cb = new TBldl3310CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl3310CQ sq);

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
    protected TBldl3310CB newMyCB() {
        return new TBldl3310CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl3310CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
