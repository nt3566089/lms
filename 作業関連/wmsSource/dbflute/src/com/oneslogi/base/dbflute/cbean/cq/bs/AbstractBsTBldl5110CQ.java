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
 * The abstract condition-query of t_bldl5110.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5110CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5110CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5110";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_Equal(Long bldl5110Id) {
        doSetBldl5110Id_Equal(bldl5110Id);
    }

    protected void doSetBldl5110Id_Equal(Long bldl5110Id) {
        regBldl5110Id(CK_EQ, bldl5110Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_NotEqual(Long bldl5110Id) {
        doSetBldl5110Id_NotEqual(bldl5110Id);
    }

    protected void doSetBldl5110Id_NotEqual(Long bldl5110Id) {
        regBldl5110Id(CK_NES, bldl5110Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_GreaterThan(Long bldl5110Id) {
        regBldl5110Id(CK_GT, bldl5110Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_LessThan(Long bldl5110Id) {
        regBldl5110Id(CK_LT, bldl5110Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_GreaterEqual(Long bldl5110Id) {
        regBldl5110Id(CK_GE, bldl5110Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110Id The value of bldl5110Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5110Id_LessEqual(Long bldl5110Id) {
        regBldl5110Id(CK_LE, bldl5110Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5110Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5110Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5110Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5110Id(), "BLDL5110_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110IdList The collection of bldl5110Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5110Id_InScope(Collection<Long> bldl5110IdList) {
        doSetBldl5110Id_InScope(bldl5110IdList);
    }

    protected void doSetBldl5110Id_InScope(Collection<Long> bldl5110IdList) {
        regINS(CK_INS, cTL(bldl5110IdList), xgetCValueBldl5110Id(), "BLDL5110_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5110IdList The collection of bldl5110Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5110Id_NotInScope(Collection<Long> bldl5110IdList) {
        doSetBldl5110Id_NotInScope(bldl5110IdList);
    }

    protected void doSetBldl5110Id_NotInScope(Collection<Long> bldl5110IdList) {
        regINS(CK_NINS, cTL(bldl5110IdList), xgetCValueBldl5110Id(), "BLDL5110_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5110Id_IsNull() { regBldl5110Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5110_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5110Id_IsNotNull() { regBldl5110Id(CK_ISNN, DOBJ); }

    protected void regBldl5110Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5110Id(), "BLDL5110_ID"); }
    protected abstract ConditionValue xgetCValueBldl5110Id();

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
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_Equal(String carrierCd) {
        doSetCarrierCd_Equal(fRES(carrierCd));
    }

    protected void doSetCarrierCd_Equal(String carrierCd) {
        regCarrierCd(CK_EQ, carrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotEqual(String carrierCd) {
        doSetCarrierCd_NotEqual(fRES(carrierCd));
    }

    protected void doSetCarrierCd_NotEqual(String carrierCd) {
        regCarrierCd(CK_NES, carrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCdList The collection of carrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_InScope(Collection<String> carrierCdList) {
        doSetCarrierCd_InScope(carrierCdList);
    }

    protected void doSetCarrierCd_InScope(Collection<String> carrierCdList) {
        regINS(CK_INS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCdList The collection of carrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotInScope(Collection<String> carrierCdList) {
        doSetCarrierCd_NotInScope(carrierCdList);
    }

    protected void doSetCarrierCd_NotInScope(Collection<String> carrierCdList) {
        regINS(CK_NINS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd The value of carrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd_LikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNull() { regCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNullOrEmpty() { regCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {VARCHAR(30)}
     */
    public void setCarrierCd_IsNotNull() { regCarrierCd(CK_ISNN, DOBJ); }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_Equal(String carrierNm) {
        doSetCarrierNm_Equal(fRES(carrierNm));
    }

    protected void doSetCarrierNm_Equal(String carrierNm) {
        regCarrierNm(CK_EQ, carrierNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotEqual(String carrierNm) {
        doSetCarrierNm_NotEqual(fRES(carrierNm));
    }

    protected void doSetCarrierNm_NotEqual(String carrierNm) {
        regCarrierNm(CK_NES, carrierNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterThan(String carrierNm) {
        regCarrierNm(CK_GT, fRES(carrierNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessThan(String carrierNm) {
        regCarrierNm(CK_LT, fRES(carrierNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterEqual(String carrierNm) {
        regCarrierNm(CK_GE, fRES(carrierNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessEqual(String carrierNm) {
        regCarrierNm(CK_LE, fRES(carrierNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNmList The collection of carrierNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_InScope(Collection<String> carrierNmList) {
        doSetCarrierNm_InScope(carrierNmList);
    }

    protected void doSetCarrierNm_InScope(Collection<String> carrierNmList) {
        regINS(CK_INS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNmList The collection of carrierNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotInScope(Collection<String> carrierNmList) {
        doSetCarrierNm_NotInScope(carrierNmList);
    }

    protected void doSetCarrierNm_NotInScope(Collection<String> carrierNmList) {
        regINS(CK_NINS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierNm The value of carrierNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierNm_LikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNm_NotLikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     * @param carrierNm The value of carrierNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_PrefixSearch(String carrierNm) {
        setCarrierNm_LikeSearch(carrierNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     */
    public void setCarrierNm_IsNull() { regCarrierNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     */
    public void setCarrierNm_IsNullOrEmpty() { regCarrierNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {VARCHAR(30)}
     */
    public void setCarrierNm_IsNotNull() { regCarrierNm(CK_ISNN, DOBJ); }

    protected void regCarrierNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNm(), "CARRIER_NM"); }
    protected abstract ConditionValue xgetCValueCarrierNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
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
     * SHIPPING_DT: {VARCHAR(30)}
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
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
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
     * SHIPPING_DT: {VARCHAR(30)}
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
     * SHIPPING_DT: {VARCHAR(30)} <br>
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
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     */
    public void setShippingDt_IsNull() { regShippingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     */
    public void setShippingDt_IsNullOrEmpty() { regShippingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {VARCHAR(30)}
     */
    public void setShippingDt_IsNotNull() { regShippingDt(CK_ISNN, DOBJ); }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_Equal(Long fwStore) {
        doSetFwStore_Equal(fwStore);
    }

    protected void doSetFwStore_Equal(Long fwStore) {
        regFwStore(CK_EQ, fwStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_NotEqual(Long fwStore) {
        doSetFwStore_NotEqual(fwStore);
    }

    protected void doSetFwStore_NotEqual(Long fwStore) {
        regFwStore(CK_NES, fwStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_GreaterThan(Long fwStore) {
        regFwStore(CK_GT, fwStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_LessThan(Long fwStore) {
        regFwStore(CK_LT, fwStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_GreaterEqual(Long fwStore) {
        regFwStore(CK_GE, fwStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStore The value of fwStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwStore_LessEqual(Long fwStore) {
        regFwStore(CK_LE, fwStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param minNumber The min number of fwStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwStore(), "FW_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStoreList The collection of fwStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwStore_InScope(Collection<Long> fwStoreList) {
        doSetFwStore_InScope(fwStoreList);
    }

    protected void doSetFwStore_InScope(Collection<Long> fwStoreList) {
        regINS(CK_INS, cTL(fwStoreList), xgetCValueFwStore(), "FW_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     * @param fwStoreList The collection of fwStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwStore_NotInScope(Collection<Long> fwStoreList) {
        doSetFwStore_NotInScope(fwStoreList);
    }

    protected void doSetFwStore_NotInScope(Collection<Long> fwStoreList) {
        regINS(CK_NINS, cTL(fwStoreList), xgetCValueFwStore(), "FW_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     */
    public void setFwStore_IsNull() { regFwStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_STORE: {BIGINT(19)}
     */
    public void setFwStore_IsNotNull() { regFwStore(CK_ISNN, DOBJ); }

    protected void regFwStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwStore(), "FW_STORE"); }
    protected abstract ConditionValue xgetCValueFwStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_Equal(Long fwDirect) {
        doSetFwDirect_Equal(fwDirect);
    }

    protected void doSetFwDirect_Equal(Long fwDirect) {
        regFwDirect(CK_EQ, fwDirect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_NotEqual(Long fwDirect) {
        doSetFwDirect_NotEqual(fwDirect);
    }

    protected void doSetFwDirect_NotEqual(Long fwDirect) {
        regFwDirect(CK_NES, fwDirect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_GreaterThan(Long fwDirect) {
        regFwDirect(CK_GT, fwDirect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_LessThan(Long fwDirect) {
        regFwDirect(CK_LT, fwDirect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_GreaterEqual(Long fwDirect) {
        regFwDirect(CK_GE, fwDirect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirect The value of fwDirect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwDirect_LessEqual(Long fwDirect) {
        regFwDirect(CK_LE, fwDirect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param minNumber The min number of fwDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwDirect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwDirect(), "FW_DIRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirectList The collection of fwDirect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwDirect_InScope(Collection<Long> fwDirectList) {
        doSetFwDirect_InScope(fwDirectList);
    }

    protected void doSetFwDirect_InScope(Collection<Long> fwDirectList) {
        regINS(CK_INS, cTL(fwDirectList), xgetCValueFwDirect(), "FW_DIRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     * @param fwDirectList The collection of fwDirect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwDirect_NotInScope(Collection<Long> fwDirectList) {
        doSetFwDirect_NotInScope(fwDirectList);
    }

    protected void doSetFwDirect_NotInScope(Collection<Long> fwDirectList) {
        regINS(CK_NINS, cTL(fwDirectList), xgetCValueFwDirect(), "FW_DIRECT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     */
    public void setFwDirect_IsNull() { regFwDirect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_DIRECT: {BIGINT(19)}
     */
    public void setFwDirect_IsNotNull() { regFwDirect(CK_ISNN, DOBJ); }

    protected void regFwDirect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwDirect(), "FW_DIRECT"); }
    protected abstract ConditionValue xgetCValueFwDirect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_Equal(Long unStore) {
        doSetUnStore_Equal(unStore);
    }

    protected void doSetUnStore_Equal(Long unStore) {
        regUnStore(CK_EQ, unStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_NotEqual(Long unStore) {
        doSetUnStore_NotEqual(unStore);
    }

    protected void doSetUnStore_NotEqual(Long unStore) {
        regUnStore(CK_NES, unStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_GreaterThan(Long unStore) {
        regUnStore(CK_GT, unStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_LessThan(Long unStore) {
        regUnStore(CK_LT, unStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_GreaterEqual(Long unStore) {
        regUnStore(CK_GE, unStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStore The value of unStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnStore_LessEqual(Long unStore) {
        regUnStore(CK_LE, unStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param minNumber The min number of unStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnStore(), "UN_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStoreList The collection of unStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnStore_InScope(Collection<Long> unStoreList) {
        doSetUnStore_InScope(unStoreList);
    }

    protected void doSetUnStore_InScope(Collection<Long> unStoreList) {
        regINS(CK_INS, cTL(unStoreList), xgetCValueUnStore(), "UN_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     * @param unStoreList The collection of unStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnStore_NotInScope(Collection<Long> unStoreList) {
        doSetUnStore_NotInScope(unStoreList);
    }

    protected void doSetUnStore_NotInScope(Collection<Long> unStoreList) {
        regINS(CK_NINS, cTL(unStoreList), xgetCValueUnStore(), "UN_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     */
    public void setUnStore_IsNull() { regUnStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_STORE: {BIGINT(19)}
     */
    public void setUnStore_IsNotNull() { regUnStore(CK_ISNN, DOBJ); }

    protected void regUnStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnStore(), "UN_STORE"); }
    protected abstract ConditionValue xgetCValueUnStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_Equal(Long unDirect) {
        doSetUnDirect_Equal(unDirect);
    }

    protected void doSetUnDirect_Equal(Long unDirect) {
        regUnDirect(CK_EQ, unDirect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_NotEqual(Long unDirect) {
        doSetUnDirect_NotEqual(unDirect);
    }

    protected void doSetUnDirect_NotEqual(Long unDirect) {
        regUnDirect(CK_NES, unDirect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_GreaterThan(Long unDirect) {
        regUnDirect(CK_GT, unDirect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_LessThan(Long unDirect) {
        regUnDirect(CK_LT, unDirect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_GreaterEqual(Long unDirect) {
        regUnDirect(CK_GE, unDirect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirect The value of unDirect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnDirect_LessEqual(Long unDirect) {
        regUnDirect(CK_LE, unDirect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param minNumber The min number of unDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnDirect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnDirect(), "UN_DIRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirectList The collection of unDirect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnDirect_InScope(Collection<Long> unDirectList) {
        doSetUnDirect_InScope(unDirectList);
    }

    protected void doSetUnDirect_InScope(Collection<Long> unDirectList) {
        regINS(CK_INS, cTL(unDirectList), xgetCValueUnDirect(), "UN_DIRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     * @param unDirectList The collection of unDirect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnDirect_NotInScope(Collection<Long> unDirectList) {
        doSetUnDirect_NotInScope(unDirectList);
    }

    protected void doSetUnDirect_NotInScope(Collection<Long> unDirectList) {
        regINS(CK_NINS, cTL(unDirectList), xgetCValueUnDirect(), "UN_DIRECT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     */
    public void setUnDirect_IsNull() { regUnDirect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_DIRECT: {BIGINT(19)}
     */
    public void setUnDirect_IsNotNull() { regUnDirect(CK_ISNN, DOBJ); }

    protected void regUnDirect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnDirect(), "UN_DIRECT"); }
    protected abstract ConditionValue xgetCValueUnDirect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_Equal(Long shStore) {
        doSetShStore_Equal(shStore);
    }

    protected void doSetShStore_Equal(Long shStore) {
        regShStore(CK_EQ, shStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_NotEqual(Long shStore) {
        doSetShStore_NotEqual(shStore);
    }

    protected void doSetShStore_NotEqual(Long shStore) {
        regShStore(CK_NES, shStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_GreaterThan(Long shStore) {
        regShStore(CK_GT, shStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_LessThan(Long shStore) {
        regShStore(CK_LT, shStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_GreaterEqual(Long shStore) {
        regShStore(CK_GE, shStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStore The value of shStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShStore_LessEqual(Long shStore) {
        regShStore(CK_LE, shStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param minNumber The min number of shStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShStore(), "SH_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStoreList The collection of shStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShStore_InScope(Collection<Long> shStoreList) {
        doSetShStore_InScope(shStoreList);
    }

    protected void doSetShStore_InScope(Collection<Long> shStoreList) {
        regINS(CK_INS, cTL(shStoreList), xgetCValueShStore(), "SH_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     * @param shStoreList The collection of shStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShStore_NotInScope(Collection<Long> shStoreList) {
        doSetShStore_NotInScope(shStoreList);
    }

    protected void doSetShStore_NotInScope(Collection<Long> shStoreList) {
        regINS(CK_NINS, cTL(shStoreList), xgetCValueShStore(), "SH_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     */
    public void setShStore_IsNull() { regShStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_STORE: {BIGINT(19)}
     */
    public void setShStore_IsNotNull() { regShStore(CK_ISNN, DOBJ); }

    protected void regShStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShStore(), "SH_STORE"); }
    protected abstract ConditionValue xgetCValueShStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_Equal(Long shDirect) {
        doSetShDirect_Equal(shDirect);
    }

    protected void doSetShDirect_Equal(Long shDirect) {
        regShDirect(CK_EQ, shDirect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_NotEqual(Long shDirect) {
        doSetShDirect_NotEqual(shDirect);
    }

    protected void doSetShDirect_NotEqual(Long shDirect) {
        regShDirect(CK_NES, shDirect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_GreaterThan(Long shDirect) {
        regShDirect(CK_GT, shDirect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_LessThan(Long shDirect) {
        regShDirect(CK_LT, shDirect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_GreaterEqual(Long shDirect) {
        regShDirect(CK_GE, shDirect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirect The value of shDirect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShDirect_LessEqual(Long shDirect) {
        regShDirect(CK_LE, shDirect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param minNumber The min number of shDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShDirect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShDirect(), "SH_DIRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirectList The collection of shDirect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShDirect_InScope(Collection<Long> shDirectList) {
        doSetShDirect_InScope(shDirectList);
    }

    protected void doSetShDirect_InScope(Collection<Long> shDirectList) {
        regINS(CK_INS, cTL(shDirectList), xgetCValueShDirect(), "SH_DIRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     * @param shDirectList The collection of shDirect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShDirect_NotInScope(Collection<Long> shDirectList) {
        doSetShDirect_NotInScope(shDirectList);
    }

    protected void doSetShDirect_NotInScope(Collection<Long> shDirectList) {
        regINS(CK_NINS, cTL(shDirectList), xgetCValueShDirect(), "SH_DIRECT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     */
    public void setShDirect_IsNull() { regShDirect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_DIRECT: {BIGINT(19)}
     */
    public void setShDirect_IsNotNull() { regShDirect(CK_ISNN, DOBJ); }

    protected void regShDirect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShDirect(), "SH_DIRECT"); }
    protected abstract ConditionValue xgetCValueShDirect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_Equal(Long hmStore) {
        doSetHmStore_Equal(hmStore);
    }

    protected void doSetHmStore_Equal(Long hmStore) {
        regHmStore(CK_EQ, hmStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_NotEqual(Long hmStore) {
        doSetHmStore_NotEqual(hmStore);
    }

    protected void doSetHmStore_NotEqual(Long hmStore) {
        regHmStore(CK_NES, hmStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_GreaterThan(Long hmStore) {
        regHmStore(CK_GT, hmStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_LessThan(Long hmStore) {
        regHmStore(CK_LT, hmStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_GreaterEqual(Long hmStore) {
        regHmStore(CK_GE, hmStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStore The value of hmStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmStore_LessEqual(Long hmStore) {
        regHmStore(CK_LE, hmStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param minNumber The min number of hmStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmStore(), "HM_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStoreList The collection of hmStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmStore_InScope(Collection<Long> hmStoreList) {
        doSetHmStore_InScope(hmStoreList);
    }

    protected void doSetHmStore_InScope(Collection<Long> hmStoreList) {
        regINS(CK_INS, cTL(hmStoreList), xgetCValueHmStore(), "HM_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     * @param hmStoreList The collection of hmStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmStore_NotInScope(Collection<Long> hmStoreList) {
        doSetHmStore_NotInScope(hmStoreList);
    }

    protected void doSetHmStore_NotInScope(Collection<Long> hmStoreList) {
        regINS(CK_NINS, cTL(hmStoreList), xgetCValueHmStore(), "HM_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     */
    public void setHmStore_IsNull() { regHmStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_STORE: {BIGINT(19)}
     */
    public void setHmStore_IsNotNull() { regHmStore(CK_ISNN, DOBJ); }

    protected void regHmStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmStore(), "HM_STORE"); }
    protected abstract ConditionValue xgetCValueHmStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_Equal(Long hmDirect) {
        doSetHmDirect_Equal(hmDirect);
    }

    protected void doSetHmDirect_Equal(Long hmDirect) {
        regHmDirect(CK_EQ, hmDirect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_NotEqual(Long hmDirect) {
        doSetHmDirect_NotEqual(hmDirect);
    }

    protected void doSetHmDirect_NotEqual(Long hmDirect) {
        regHmDirect(CK_NES, hmDirect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_GreaterThan(Long hmDirect) {
        regHmDirect(CK_GT, hmDirect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_LessThan(Long hmDirect) {
        regHmDirect(CK_LT, hmDirect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_GreaterEqual(Long hmDirect) {
        regHmDirect(CK_GE, hmDirect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirect The value of hmDirect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmDirect_LessEqual(Long hmDirect) {
        regHmDirect(CK_LE, hmDirect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param minNumber The min number of hmDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmDirect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmDirect(), "HM_DIRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirectList The collection of hmDirect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmDirect_InScope(Collection<Long> hmDirectList) {
        doSetHmDirect_InScope(hmDirectList);
    }

    protected void doSetHmDirect_InScope(Collection<Long> hmDirectList) {
        regINS(CK_INS, cTL(hmDirectList), xgetCValueHmDirect(), "HM_DIRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     * @param hmDirectList The collection of hmDirect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmDirect_NotInScope(Collection<Long> hmDirectList) {
        doSetHmDirect_NotInScope(hmDirectList);
    }

    protected void doSetHmDirect_NotInScope(Collection<Long> hmDirectList) {
        regINS(CK_NINS, cTL(hmDirectList), xgetCValueHmDirect(), "HM_DIRECT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     */
    public void setHmDirect_IsNull() { regHmDirect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_DIRECT: {BIGINT(19)}
     */
    public void setHmDirect_IsNotNull() { regHmDirect(CK_ISNN, DOBJ); }

    protected void regHmDirect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmDirect(), "HM_DIRECT"); }
    protected abstract ConditionValue xgetCValueHmDirect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_Equal(Long totalStore) {
        doSetTotalStore_Equal(totalStore);
    }

    protected void doSetTotalStore_Equal(Long totalStore) {
        regTotalStore(CK_EQ, totalStore);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_NotEqual(Long totalStore) {
        doSetTotalStore_NotEqual(totalStore);
    }

    protected void doSetTotalStore_NotEqual(Long totalStore) {
        regTotalStore(CK_NES, totalStore);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_GreaterThan(Long totalStore) {
        regTotalStore(CK_GT, totalStore);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_LessThan(Long totalStore) {
        regTotalStore(CK_LT, totalStore);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_GreaterEqual(Long totalStore) {
        regTotalStore(CK_GE, totalStore);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStore The value of totalStore as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalStore_LessEqual(Long totalStore) {
        regTotalStore(CK_LE, totalStore);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param minNumber The min number of totalStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalStore. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalStore_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalStore(), "TOTAL_STORE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStoreList The collection of totalStore as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalStore_InScope(Collection<Long> totalStoreList) {
        doSetTotalStore_InScope(totalStoreList);
    }

    protected void doSetTotalStore_InScope(Collection<Long> totalStoreList) {
        regINS(CK_INS, cTL(totalStoreList), xgetCValueTotalStore(), "TOTAL_STORE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     * @param totalStoreList The collection of totalStore as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalStore_NotInScope(Collection<Long> totalStoreList) {
        doSetTotalStore_NotInScope(totalStoreList);
    }

    protected void doSetTotalStore_NotInScope(Collection<Long> totalStoreList) {
        regINS(CK_NINS, cTL(totalStoreList), xgetCValueTotalStore(), "TOTAL_STORE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     */
    public void setTotalStore_IsNull() { regTotalStore(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_STORE: {BIGINT(19)}
     */
    public void setTotalStore_IsNotNull() { regTotalStore(CK_ISNN, DOBJ); }

    protected void regTotalStore(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalStore(), "TOTAL_STORE"); }
    protected abstract ConditionValue xgetCValueTotalStore();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_Equal(Long totalDirect) {
        doSetTotalDirect_Equal(totalDirect);
    }

    protected void doSetTotalDirect_Equal(Long totalDirect) {
        regTotalDirect(CK_EQ, totalDirect);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_NotEqual(Long totalDirect) {
        doSetTotalDirect_NotEqual(totalDirect);
    }

    protected void doSetTotalDirect_NotEqual(Long totalDirect) {
        regTotalDirect(CK_NES, totalDirect);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_GreaterThan(Long totalDirect) {
        regTotalDirect(CK_GT, totalDirect);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_LessThan(Long totalDirect) {
        regTotalDirect(CK_LT, totalDirect);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_GreaterEqual(Long totalDirect) {
        regTotalDirect(CK_GE, totalDirect);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirect The value of totalDirect as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalDirect_LessEqual(Long totalDirect) {
        regTotalDirect(CK_LE, totalDirect);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param minNumber The min number of totalDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalDirect. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalDirect_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalDirect(), "TOTAL_DIRECT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirectList The collection of totalDirect as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalDirect_InScope(Collection<Long> totalDirectList) {
        doSetTotalDirect_InScope(totalDirectList);
    }

    protected void doSetTotalDirect_InScope(Collection<Long> totalDirectList) {
        regINS(CK_INS, cTL(totalDirectList), xgetCValueTotalDirect(), "TOTAL_DIRECT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     * @param totalDirectList The collection of totalDirect as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalDirect_NotInScope(Collection<Long> totalDirectList) {
        doSetTotalDirect_NotInScope(totalDirectList);
    }

    protected void doSetTotalDirect_NotInScope(Collection<Long> totalDirectList) {
        regINS(CK_NINS, cTL(totalDirectList), xgetCValueTotalDirect(), "TOTAL_DIRECT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     */
    public void setTotalDirect_IsNull() { regTotalDirect(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_DIRECT: {BIGINT(19)}
     */
    public void setTotalDirect_IsNotNull() { regTotalDirect(CK_ISNN, DOBJ); }

    protected void regTotalDirect(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalDirect(), "TOTAL_DIRECT"); }
    protected abstract ConditionValue xgetCValueTotalDirect();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_Equal(Long koguchiInclude) {
        doSetKoguchiInclude_Equal(koguchiInclude);
    }

    protected void doSetKoguchiInclude_Equal(Long koguchiInclude) {
        regKoguchiInclude(CK_EQ, koguchiInclude);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_NotEqual(Long koguchiInclude) {
        doSetKoguchiInclude_NotEqual(koguchiInclude);
    }

    protected void doSetKoguchiInclude_NotEqual(Long koguchiInclude) {
        regKoguchiInclude(CK_NES, koguchiInclude);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_GreaterThan(Long koguchiInclude) {
        regKoguchiInclude(CK_GT, koguchiInclude);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_LessThan(Long koguchiInclude) {
        regKoguchiInclude(CK_LT, koguchiInclude);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_GreaterEqual(Long koguchiInclude) {
        regKoguchiInclude(CK_GE, koguchiInclude);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiInclude The value of koguchiInclude as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiInclude_LessEqual(Long koguchiInclude) {
        regKoguchiInclude(CK_LE, koguchiInclude);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param minNumber The min number of koguchiInclude. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koguchiInclude. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoguchiInclude_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoguchiInclude(), "KOGUCHI_INCLUDE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiIncludeList The collection of koguchiInclude as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiInclude_InScope(Collection<Long> koguchiIncludeList) {
        doSetKoguchiInclude_InScope(koguchiIncludeList);
    }

    protected void doSetKoguchiInclude_InScope(Collection<Long> koguchiIncludeList) {
        regINS(CK_INS, cTL(koguchiIncludeList), xgetCValueKoguchiInclude(), "KOGUCHI_INCLUDE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     * @param koguchiIncludeList The collection of koguchiInclude as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiInclude_NotInScope(Collection<Long> koguchiIncludeList) {
        doSetKoguchiInclude_NotInScope(koguchiIncludeList);
    }

    protected void doSetKoguchiInclude_NotInScope(Collection<Long> koguchiIncludeList) {
        regINS(CK_NINS, cTL(koguchiIncludeList), xgetCValueKoguchiInclude(), "KOGUCHI_INCLUDE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     */
    public void setKoguchiInclude_IsNull() { regKoguchiInclude(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_INCLUDE: {BIGINT(19)}
     */
    public void setKoguchiInclude_IsNotNull() { regKoguchiInclude(CK_ISNN, DOBJ); }

    protected void regKoguchiInclude(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiInclude(), "KOGUCHI_INCLUDE"); }
    protected abstract ConditionValue xgetCValueKoguchiInclude();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_Equal(Long koguchiConst) {
        doSetKoguchiConst_Equal(koguchiConst);
    }

    protected void doSetKoguchiConst_Equal(Long koguchiConst) {
        regKoguchiConst(CK_EQ, koguchiConst);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_NotEqual(Long koguchiConst) {
        doSetKoguchiConst_NotEqual(koguchiConst);
    }

    protected void doSetKoguchiConst_NotEqual(Long koguchiConst) {
        regKoguchiConst(CK_NES, koguchiConst);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_GreaterThan(Long koguchiConst) {
        regKoguchiConst(CK_GT, koguchiConst);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_LessThan(Long koguchiConst) {
        regKoguchiConst(CK_LT, koguchiConst);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_GreaterEqual(Long koguchiConst) {
        regKoguchiConst(CK_GE, koguchiConst);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConst The value of koguchiConst as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoguchiConst_LessEqual(Long koguchiConst) {
        regKoguchiConst(CK_LE, koguchiConst);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param minNumber The min number of koguchiConst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koguchiConst. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoguchiConst_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoguchiConst(), "KOGUCHI_CONST", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConstList The collection of koguchiConst as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiConst_InScope(Collection<Long> koguchiConstList) {
        doSetKoguchiConst_InScope(koguchiConstList);
    }

    protected void doSetKoguchiConst_InScope(Collection<Long> koguchiConstList) {
        regINS(CK_INS, cTL(koguchiConstList), xgetCValueKoguchiConst(), "KOGUCHI_CONST");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     * @param koguchiConstList The collection of koguchiConst as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiConst_NotInScope(Collection<Long> koguchiConstList) {
        doSetKoguchiConst_NotInScope(koguchiConstList);
    }

    protected void doSetKoguchiConst_NotInScope(Collection<Long> koguchiConstList) {
        regINS(CK_NINS, cTL(koguchiConstList), xgetCValueKoguchiConst(), "KOGUCHI_CONST");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     */
    public void setKoguchiConst_IsNull() { regKoguchiConst(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_CONST: {BIGINT(19)}
     */
    public void setKoguchiConst_IsNotNull() { regKoguchiConst(CK_ISNN, DOBJ); }

    protected void regKoguchiConst(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiConst(), "KOGUCHI_CONST"); }
    protected abstract ConditionValue xgetCValueKoguchiConst();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_Equal(Long totalPackNum) {
        doSetTotalPackNum_Equal(totalPackNum);
    }

    protected void doSetTotalPackNum_Equal(Long totalPackNum) {
        regTotalPackNum(CK_EQ, totalPackNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_NotEqual(Long totalPackNum) {
        doSetTotalPackNum_NotEqual(totalPackNum);
    }

    protected void doSetTotalPackNum_NotEqual(Long totalPackNum) {
        regTotalPackNum(CK_NES, totalPackNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_GreaterThan(Long totalPackNum) {
        regTotalPackNum(CK_GT, totalPackNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_LessThan(Long totalPackNum) {
        regTotalPackNum(CK_LT, totalPackNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_GreaterEqual(Long totalPackNum) {
        regTotalPackNum(CK_GE, totalPackNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNum The value of totalPackNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPackNum_LessEqual(Long totalPackNum) {
        regTotalPackNum(CK_LE, totalPackNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalPackNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPackNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPackNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPackNum(), "TOTAL_PACK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNumList The collection of totalPackNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPackNum_InScope(Collection<Long> totalPackNumList) {
        doSetTotalPackNum_InScope(totalPackNumList);
    }

    protected void doSetTotalPackNum_InScope(Collection<Long> totalPackNumList) {
        regINS(CK_INS, cTL(totalPackNumList), xgetCValueTotalPackNum(), "TOTAL_PACK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     * @param totalPackNumList The collection of totalPackNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPackNum_NotInScope(Collection<Long> totalPackNumList) {
        doSetTotalPackNum_NotInScope(totalPackNumList);
    }

    protected void doSetTotalPackNum_NotInScope(Collection<Long> totalPackNumList) {
        regINS(CK_NINS, cTL(totalPackNumList), xgetCValueTotalPackNum(), "TOTAL_PACK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     */
    public void setTotalPackNum_IsNull() { regTotalPackNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PACK_NUM: {BIGINT(19)}
     */
    public void setTotalPackNum_IsNotNull() { regTotalPackNum(CK_ISNN, DOBJ); }

    protected void regTotalPackNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPackNum(), "TOTAL_PACK_NUM"); }
    protected abstract ConditionValue xgetCValueTotalPackNum();

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
    public HpSLCFunction<TBldl5110CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5110CB.class);
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
    public HpSLCFunction<TBldl5110CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5110CB.class);
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
    public HpSLCFunction<TBldl5110CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5110CB.class);
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
    public HpSLCFunction<TBldl5110CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5110CB.class);
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
    public HpSLCFunction<TBldl5110CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5110CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5110CB&gt;() {
     *     public void query(TBldl5110CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5110CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5110CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5110CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5110CQ sq);

    protected TBldl5110CB xcreateScalarConditionCB() {
        TBldl5110CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5110CB xcreateScalarConditionPartitionByCB() {
        TBldl5110CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5110CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5110CB cb = new TBldl5110CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5110_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5110CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5110CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5110CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5110CB cb = new TBldl5110CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5110_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5110CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5110CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5110CB cb = new TBldl5110CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5110CQ sq);

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
    protected TBldl5110CB newMyCB() {
        return new TBldl5110CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5110CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
