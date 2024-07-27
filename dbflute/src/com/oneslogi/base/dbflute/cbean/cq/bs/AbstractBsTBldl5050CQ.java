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
 * The abstract condition-query of t_bldl5050.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5050CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5050CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5050";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_Equal(Long bldl5050Id) {
        doSetBldl5050Id_Equal(bldl5050Id);
    }

    protected void doSetBldl5050Id_Equal(Long bldl5050Id) {
        regBldl5050Id(CK_EQ, bldl5050Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_NotEqual(Long bldl5050Id) {
        doSetBldl5050Id_NotEqual(bldl5050Id);
    }

    protected void doSetBldl5050Id_NotEqual(Long bldl5050Id) {
        regBldl5050Id(CK_NES, bldl5050Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_GreaterThan(Long bldl5050Id) {
        regBldl5050Id(CK_GT, bldl5050Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_LessThan(Long bldl5050Id) {
        regBldl5050Id(CK_LT, bldl5050Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_GreaterEqual(Long bldl5050Id) {
        regBldl5050Id(CK_GE, bldl5050Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050Id The value of bldl5050Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5050Id_LessEqual(Long bldl5050Id) {
        regBldl5050Id(CK_LE, bldl5050Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5050Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5050Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5050Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5050Id(), "BLDL5050_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050IdList The collection of bldl5050Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5050Id_InScope(Collection<Long> bldl5050IdList) {
        doSetBldl5050Id_InScope(bldl5050IdList);
    }

    protected void doSetBldl5050Id_InScope(Collection<Long> bldl5050IdList) {
        regINS(CK_INS, cTL(bldl5050IdList), xgetCValueBldl5050Id(), "BLDL5050_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5050IdList The collection of bldl5050Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5050Id_NotInScope(Collection<Long> bldl5050IdList) {
        doSetBldl5050Id_NotInScope(bldl5050IdList);
    }

    protected void doSetBldl5050Id_NotInScope(Collection<Long> bldl5050IdList) {
        regINS(CK_NINS, cTL(bldl5050IdList), xgetCValueBldl5050Id(), "BLDL5050_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5050Id_IsNull() { regBldl5050Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5050_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5050Id_IsNotNull() { regBldl5050Id(CK_ISNN, DOBJ); }

    protected void regBldl5050Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5050Id(), "BLDL5050_ID"); }
    protected abstract ConditionValue xgetCValueBldl5050Id();

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
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_Equal(Long fwItemCnt) {
        doSetFwItemCnt_Equal(fwItemCnt);
    }

    protected void doSetFwItemCnt_Equal(Long fwItemCnt) {
        regFwItemCnt(CK_EQ, fwItemCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_NotEqual(Long fwItemCnt) {
        doSetFwItemCnt_NotEqual(fwItemCnt);
    }

    protected void doSetFwItemCnt_NotEqual(Long fwItemCnt) {
        regFwItemCnt(CK_NES, fwItemCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_GreaterThan(Long fwItemCnt) {
        regFwItemCnt(CK_GT, fwItemCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_LessThan(Long fwItemCnt) {
        regFwItemCnt(CK_LT, fwItemCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_GreaterEqual(Long fwItemCnt) {
        regFwItemCnt(CK_GE, fwItemCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCnt The value of fwItemCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwItemCnt_LessEqual(Long fwItemCnt) {
        regFwItemCnt(CK_LE, fwItemCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param minNumber The min number of fwItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwItemCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwItemCnt(), "FW_ITEM_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCntList The collection of fwItemCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwItemCnt_InScope(Collection<Long> fwItemCntList) {
        doSetFwItemCnt_InScope(fwItemCntList);
    }

    protected void doSetFwItemCnt_InScope(Collection<Long> fwItemCntList) {
        regINS(CK_INS, cTL(fwItemCntList), xgetCValueFwItemCnt(), "FW_ITEM_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     * @param fwItemCntList The collection of fwItemCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwItemCnt_NotInScope(Collection<Long> fwItemCntList) {
        doSetFwItemCnt_NotInScope(fwItemCntList);
    }

    protected void doSetFwItemCnt_NotInScope(Collection<Long> fwItemCntList) {
        regINS(CK_NINS, cTL(fwItemCntList), xgetCValueFwItemCnt(), "FW_ITEM_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     */
    public void setFwItemCnt_IsNull() { regFwItemCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_ITEM_CNT: {BIGINT(19)}
     */
    public void setFwItemCnt_IsNotNull() { regFwItemCnt(CK_ISNN, DOBJ); }

    protected void regFwItemCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwItemCnt(), "FW_ITEM_CNT"); }
    protected abstract ConditionValue xgetCValueFwItemCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_Equal(Long fwPickNum) {
        doSetFwPickNum_Equal(fwPickNum);
    }

    protected void doSetFwPickNum_Equal(Long fwPickNum) {
        regFwPickNum(CK_EQ, fwPickNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_NotEqual(Long fwPickNum) {
        doSetFwPickNum_NotEqual(fwPickNum);
    }

    protected void doSetFwPickNum_NotEqual(Long fwPickNum) {
        regFwPickNum(CK_NES, fwPickNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_GreaterThan(Long fwPickNum) {
        regFwPickNum(CK_GT, fwPickNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_LessThan(Long fwPickNum) {
        regFwPickNum(CK_LT, fwPickNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_GreaterEqual(Long fwPickNum) {
        regFwPickNum(CK_GE, fwPickNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNum The value of fwPickNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwPickNum_LessEqual(Long fwPickNum) {
        regFwPickNum(CK_LE, fwPickNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwPickNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwPickNum(), "FW_PICK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNumList The collection of fwPickNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwPickNum_InScope(Collection<Long> fwPickNumList) {
        doSetFwPickNum_InScope(fwPickNumList);
    }

    protected void doSetFwPickNum_InScope(Collection<Long> fwPickNumList) {
        regINS(CK_INS, cTL(fwPickNumList), xgetCValueFwPickNum(), "FW_PICK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     * @param fwPickNumList The collection of fwPickNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwPickNum_NotInScope(Collection<Long> fwPickNumList) {
        doSetFwPickNum_NotInScope(fwPickNumList);
    }

    protected void doSetFwPickNum_NotInScope(Collection<Long> fwPickNumList) {
        regINS(CK_NINS, cTL(fwPickNumList), xgetCValueFwPickNum(), "FW_PICK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     */
    public void setFwPickNum_IsNull() { regFwPickNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_PICK_NUM: {BIGINT(19)}
     */
    public void setFwPickNum_IsNotNull() { regFwPickNum(CK_ISNN, DOBJ); }

    protected void regFwPickNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwPickNum(), "FW_PICK_NUM"); }
    protected abstract ConditionValue xgetCValueFwPickNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_Equal(Long fwRate) {
        doSetFwRate_Equal(fwRate);
    }

    protected void doSetFwRate_Equal(Long fwRate) {
        regFwRate(CK_EQ, fwRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_NotEqual(Long fwRate) {
        doSetFwRate_NotEqual(fwRate);
    }

    protected void doSetFwRate_NotEqual(Long fwRate) {
        regFwRate(CK_NES, fwRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_GreaterThan(Long fwRate) {
        regFwRate(CK_GT, fwRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_LessThan(Long fwRate) {
        regFwRate(CK_LT, fwRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_GreaterEqual(Long fwRate) {
        regFwRate(CK_GE, fwRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRate The value of fwRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRate_LessEqual(Long fwRate) {
        regFwRate(CK_LE, fwRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param minNumber The min number of fwRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwRate(), "FW_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRateList The collection of fwRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRate_InScope(Collection<Long> fwRateList) {
        doSetFwRate_InScope(fwRateList);
    }

    protected void doSetFwRate_InScope(Collection<Long> fwRateList) {
        regINS(CK_INS, cTL(fwRateList), xgetCValueFwRate(), "FW_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     * @param fwRateList The collection of fwRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRate_NotInScope(Collection<Long> fwRateList) {
        doSetFwRate_NotInScope(fwRateList);
    }

    protected void doSetFwRate_NotInScope(Collection<Long> fwRateList) {
        regINS(CK_NINS, cTL(fwRateList), xgetCValueFwRate(), "FW_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     */
    public void setFwRate_IsNull() { regFwRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RATE: {BIGINT(19)}
     */
    public void setFwRate_IsNotNull() { regFwRate(CK_ISNN, DOBJ); }

    protected void regFwRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwRate(), "FW_RATE"); }
    protected abstract ConditionValue xgetCValueFwRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_Equal(Long unItemCnt) {
        doSetUnItemCnt_Equal(unItemCnt);
    }

    protected void doSetUnItemCnt_Equal(Long unItemCnt) {
        regUnItemCnt(CK_EQ, unItemCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_NotEqual(Long unItemCnt) {
        doSetUnItemCnt_NotEqual(unItemCnt);
    }

    protected void doSetUnItemCnt_NotEqual(Long unItemCnt) {
        regUnItemCnt(CK_NES, unItemCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_GreaterThan(Long unItemCnt) {
        regUnItemCnt(CK_GT, unItemCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_LessThan(Long unItemCnt) {
        regUnItemCnt(CK_LT, unItemCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_GreaterEqual(Long unItemCnt) {
        regUnItemCnt(CK_GE, unItemCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCnt The value of unItemCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnItemCnt_LessEqual(Long unItemCnt) {
        regUnItemCnt(CK_LE, unItemCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param minNumber The min number of unItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnItemCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnItemCnt(), "UN_ITEM_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCntList The collection of unItemCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnItemCnt_InScope(Collection<Long> unItemCntList) {
        doSetUnItemCnt_InScope(unItemCntList);
    }

    protected void doSetUnItemCnt_InScope(Collection<Long> unItemCntList) {
        regINS(CK_INS, cTL(unItemCntList), xgetCValueUnItemCnt(), "UN_ITEM_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     * @param unItemCntList The collection of unItemCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnItemCnt_NotInScope(Collection<Long> unItemCntList) {
        doSetUnItemCnt_NotInScope(unItemCntList);
    }

    protected void doSetUnItemCnt_NotInScope(Collection<Long> unItemCntList) {
        regINS(CK_NINS, cTL(unItemCntList), xgetCValueUnItemCnt(), "UN_ITEM_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     */
    public void setUnItemCnt_IsNull() { regUnItemCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_ITEM_CNT: {BIGINT(19)}
     */
    public void setUnItemCnt_IsNotNull() { regUnItemCnt(CK_ISNN, DOBJ); }

    protected void regUnItemCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnItemCnt(), "UN_ITEM_CNT"); }
    protected abstract ConditionValue xgetCValueUnItemCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_Equal(Long unPickNum) {
        doSetUnPickNum_Equal(unPickNum);
    }

    protected void doSetUnPickNum_Equal(Long unPickNum) {
        regUnPickNum(CK_EQ, unPickNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_NotEqual(Long unPickNum) {
        doSetUnPickNum_NotEqual(unPickNum);
    }

    protected void doSetUnPickNum_NotEqual(Long unPickNum) {
        regUnPickNum(CK_NES, unPickNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_GreaterThan(Long unPickNum) {
        regUnPickNum(CK_GT, unPickNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_LessThan(Long unPickNum) {
        regUnPickNum(CK_LT, unPickNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_GreaterEqual(Long unPickNum) {
        regUnPickNum(CK_GE, unPickNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNum The value of unPickNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnPickNum_LessEqual(Long unPickNum) {
        regUnPickNum(CK_LE, unPickNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param minNumber The min number of unPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnPickNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnPickNum(), "UN_PICK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNumList The collection of unPickNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnPickNum_InScope(Collection<Long> unPickNumList) {
        doSetUnPickNum_InScope(unPickNumList);
    }

    protected void doSetUnPickNum_InScope(Collection<Long> unPickNumList) {
        regINS(CK_INS, cTL(unPickNumList), xgetCValueUnPickNum(), "UN_PICK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     * @param unPickNumList The collection of unPickNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnPickNum_NotInScope(Collection<Long> unPickNumList) {
        doSetUnPickNum_NotInScope(unPickNumList);
    }

    protected void doSetUnPickNum_NotInScope(Collection<Long> unPickNumList) {
        regINS(CK_NINS, cTL(unPickNumList), xgetCValueUnPickNum(), "UN_PICK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     */
    public void setUnPickNum_IsNull() { regUnPickNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_PICK_NUM: {BIGINT(19)}
     */
    public void setUnPickNum_IsNotNull() { regUnPickNum(CK_ISNN, DOBJ); }

    protected void regUnPickNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnPickNum(), "UN_PICK_NUM"); }
    protected abstract ConditionValue xgetCValueUnPickNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_Equal(Long unRate) {
        doSetUnRate_Equal(unRate);
    }

    protected void doSetUnRate_Equal(Long unRate) {
        regUnRate(CK_EQ, unRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_NotEqual(Long unRate) {
        doSetUnRate_NotEqual(unRate);
    }

    protected void doSetUnRate_NotEqual(Long unRate) {
        regUnRate(CK_NES, unRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_GreaterThan(Long unRate) {
        regUnRate(CK_GT, unRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_LessThan(Long unRate) {
        regUnRate(CK_LT, unRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_GreaterEqual(Long unRate) {
        regUnRate(CK_GE, unRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRate The value of unRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRate_LessEqual(Long unRate) {
        regUnRate(CK_LE, unRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param minNumber The min number of unRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnRate(), "UN_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRateList The collection of unRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRate_InScope(Collection<Long> unRateList) {
        doSetUnRate_InScope(unRateList);
    }

    protected void doSetUnRate_InScope(Collection<Long> unRateList) {
        regINS(CK_INS, cTL(unRateList), xgetCValueUnRate(), "UN_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     * @param unRateList The collection of unRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRate_NotInScope(Collection<Long> unRateList) {
        doSetUnRate_NotInScope(unRateList);
    }

    protected void doSetUnRate_NotInScope(Collection<Long> unRateList) {
        regINS(CK_NINS, cTL(unRateList), xgetCValueUnRate(), "UN_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     */
    public void setUnRate_IsNull() { regUnRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RATE: {BIGINT(19)}
     */
    public void setUnRate_IsNotNull() { regUnRate(CK_ISNN, DOBJ); }

    protected void regUnRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnRate(), "UN_RATE"); }
    protected abstract ConditionValue xgetCValueUnRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_Equal(Long shItemCnt) {
        doSetShItemCnt_Equal(shItemCnt);
    }

    protected void doSetShItemCnt_Equal(Long shItemCnt) {
        regShItemCnt(CK_EQ, shItemCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_NotEqual(Long shItemCnt) {
        doSetShItemCnt_NotEqual(shItemCnt);
    }

    protected void doSetShItemCnt_NotEqual(Long shItemCnt) {
        regShItemCnt(CK_NES, shItemCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_GreaterThan(Long shItemCnt) {
        regShItemCnt(CK_GT, shItemCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_LessThan(Long shItemCnt) {
        regShItemCnt(CK_LT, shItemCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_GreaterEqual(Long shItemCnt) {
        regShItemCnt(CK_GE, shItemCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCnt The value of shItemCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShItemCnt_LessEqual(Long shItemCnt) {
        regShItemCnt(CK_LE, shItemCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param minNumber The min number of shItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShItemCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShItemCnt(), "SH_ITEM_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCntList The collection of shItemCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShItemCnt_InScope(Collection<Long> shItemCntList) {
        doSetShItemCnt_InScope(shItemCntList);
    }

    protected void doSetShItemCnt_InScope(Collection<Long> shItemCntList) {
        regINS(CK_INS, cTL(shItemCntList), xgetCValueShItemCnt(), "SH_ITEM_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     * @param shItemCntList The collection of shItemCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShItemCnt_NotInScope(Collection<Long> shItemCntList) {
        doSetShItemCnt_NotInScope(shItemCntList);
    }

    protected void doSetShItemCnt_NotInScope(Collection<Long> shItemCntList) {
        regINS(CK_NINS, cTL(shItemCntList), xgetCValueShItemCnt(), "SH_ITEM_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     */
    public void setShItemCnt_IsNull() { regShItemCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_ITEM_CNT: {BIGINT(19)}
     */
    public void setShItemCnt_IsNotNull() { regShItemCnt(CK_ISNN, DOBJ); }

    protected void regShItemCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShItemCnt(), "SH_ITEM_CNT"); }
    protected abstract ConditionValue xgetCValueShItemCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_Equal(Long shPickNum) {
        doSetShPickNum_Equal(shPickNum);
    }

    protected void doSetShPickNum_Equal(Long shPickNum) {
        regShPickNum(CK_EQ, shPickNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_NotEqual(Long shPickNum) {
        doSetShPickNum_NotEqual(shPickNum);
    }

    protected void doSetShPickNum_NotEqual(Long shPickNum) {
        regShPickNum(CK_NES, shPickNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_GreaterThan(Long shPickNum) {
        regShPickNum(CK_GT, shPickNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_LessThan(Long shPickNum) {
        regShPickNum(CK_LT, shPickNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_GreaterEqual(Long shPickNum) {
        regShPickNum(CK_GE, shPickNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNum The value of shPickNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShPickNum_LessEqual(Long shPickNum) {
        regShPickNum(CK_LE, shPickNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param minNumber The min number of shPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShPickNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShPickNum(), "SH_PICK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNumList The collection of shPickNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShPickNum_InScope(Collection<Long> shPickNumList) {
        doSetShPickNum_InScope(shPickNumList);
    }

    protected void doSetShPickNum_InScope(Collection<Long> shPickNumList) {
        regINS(CK_INS, cTL(shPickNumList), xgetCValueShPickNum(), "SH_PICK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     * @param shPickNumList The collection of shPickNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShPickNum_NotInScope(Collection<Long> shPickNumList) {
        doSetShPickNum_NotInScope(shPickNumList);
    }

    protected void doSetShPickNum_NotInScope(Collection<Long> shPickNumList) {
        regINS(CK_NINS, cTL(shPickNumList), xgetCValueShPickNum(), "SH_PICK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     */
    public void setShPickNum_IsNull() { regShPickNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_PICK_NUM: {BIGINT(19)}
     */
    public void setShPickNum_IsNotNull() { regShPickNum(CK_ISNN, DOBJ); }

    protected void regShPickNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShPickNum(), "SH_PICK_NUM"); }
    protected abstract ConditionValue xgetCValueShPickNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_Equal(Long shRate) {
        doSetShRate_Equal(shRate);
    }

    protected void doSetShRate_Equal(Long shRate) {
        regShRate(CK_EQ, shRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_NotEqual(Long shRate) {
        doSetShRate_NotEqual(shRate);
    }

    protected void doSetShRate_NotEqual(Long shRate) {
        regShRate(CK_NES, shRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_GreaterThan(Long shRate) {
        regShRate(CK_GT, shRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_LessThan(Long shRate) {
        regShRate(CK_LT, shRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_GreaterEqual(Long shRate) {
        regShRate(CK_GE, shRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRate The value of shRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRate_LessEqual(Long shRate) {
        regShRate(CK_LE, shRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param minNumber The min number of shRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShRate(), "SH_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRateList The collection of shRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRate_InScope(Collection<Long> shRateList) {
        doSetShRate_InScope(shRateList);
    }

    protected void doSetShRate_InScope(Collection<Long> shRateList) {
        regINS(CK_INS, cTL(shRateList), xgetCValueShRate(), "SH_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     * @param shRateList The collection of shRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRate_NotInScope(Collection<Long> shRateList) {
        doSetShRate_NotInScope(shRateList);
    }

    protected void doSetShRate_NotInScope(Collection<Long> shRateList) {
        regINS(CK_NINS, cTL(shRateList), xgetCValueShRate(), "SH_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     */
    public void setShRate_IsNull() { regShRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RATE: {BIGINT(19)}
     */
    public void setShRate_IsNotNull() { regShRate(CK_ISNN, DOBJ); }

    protected void regShRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShRate(), "SH_RATE"); }
    protected abstract ConditionValue xgetCValueShRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_Equal(Long hmItemCnt) {
        doSetHmItemCnt_Equal(hmItemCnt);
    }

    protected void doSetHmItemCnt_Equal(Long hmItemCnt) {
        regHmItemCnt(CK_EQ, hmItemCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_NotEqual(Long hmItemCnt) {
        doSetHmItemCnt_NotEqual(hmItemCnt);
    }

    protected void doSetHmItemCnt_NotEqual(Long hmItemCnt) {
        regHmItemCnt(CK_NES, hmItemCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_GreaterThan(Long hmItemCnt) {
        regHmItemCnt(CK_GT, hmItemCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_LessThan(Long hmItemCnt) {
        regHmItemCnt(CK_LT, hmItemCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_GreaterEqual(Long hmItemCnt) {
        regHmItemCnt(CK_GE, hmItemCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCnt The value of hmItemCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmItemCnt_LessEqual(Long hmItemCnt) {
        regHmItemCnt(CK_LE, hmItemCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param minNumber The min number of hmItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmItemCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmItemCnt(), "HM_ITEM_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCntList The collection of hmItemCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmItemCnt_InScope(Collection<Long> hmItemCntList) {
        doSetHmItemCnt_InScope(hmItemCntList);
    }

    protected void doSetHmItemCnt_InScope(Collection<Long> hmItemCntList) {
        regINS(CK_INS, cTL(hmItemCntList), xgetCValueHmItemCnt(), "HM_ITEM_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     * @param hmItemCntList The collection of hmItemCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmItemCnt_NotInScope(Collection<Long> hmItemCntList) {
        doSetHmItemCnt_NotInScope(hmItemCntList);
    }

    protected void doSetHmItemCnt_NotInScope(Collection<Long> hmItemCntList) {
        regINS(CK_NINS, cTL(hmItemCntList), xgetCValueHmItemCnt(), "HM_ITEM_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     */
    public void setHmItemCnt_IsNull() { regHmItemCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_ITEM_CNT: {BIGINT(19)}
     */
    public void setHmItemCnt_IsNotNull() { regHmItemCnt(CK_ISNN, DOBJ); }

    protected void regHmItemCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmItemCnt(), "HM_ITEM_CNT"); }
    protected abstract ConditionValue xgetCValueHmItemCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_Equal(Long hmPickNum) {
        doSetHmPickNum_Equal(hmPickNum);
    }

    protected void doSetHmPickNum_Equal(Long hmPickNum) {
        regHmPickNum(CK_EQ, hmPickNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_NotEqual(Long hmPickNum) {
        doSetHmPickNum_NotEqual(hmPickNum);
    }

    protected void doSetHmPickNum_NotEqual(Long hmPickNum) {
        regHmPickNum(CK_NES, hmPickNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_GreaterThan(Long hmPickNum) {
        regHmPickNum(CK_GT, hmPickNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_LessThan(Long hmPickNum) {
        regHmPickNum(CK_LT, hmPickNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_GreaterEqual(Long hmPickNum) {
        regHmPickNum(CK_GE, hmPickNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNum The value of hmPickNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmPickNum_LessEqual(Long hmPickNum) {
        regHmPickNum(CK_LE, hmPickNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param minNumber The min number of hmPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmPickNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmPickNum(), "HM_PICK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNumList The collection of hmPickNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmPickNum_InScope(Collection<Long> hmPickNumList) {
        doSetHmPickNum_InScope(hmPickNumList);
    }

    protected void doSetHmPickNum_InScope(Collection<Long> hmPickNumList) {
        regINS(CK_INS, cTL(hmPickNumList), xgetCValueHmPickNum(), "HM_PICK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     * @param hmPickNumList The collection of hmPickNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmPickNum_NotInScope(Collection<Long> hmPickNumList) {
        doSetHmPickNum_NotInScope(hmPickNumList);
    }

    protected void doSetHmPickNum_NotInScope(Collection<Long> hmPickNumList) {
        regINS(CK_NINS, cTL(hmPickNumList), xgetCValueHmPickNum(), "HM_PICK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     */
    public void setHmPickNum_IsNull() { regHmPickNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_PICK_NUM: {BIGINT(19)}
     */
    public void setHmPickNum_IsNotNull() { regHmPickNum(CK_ISNN, DOBJ); }

    protected void regHmPickNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmPickNum(), "HM_PICK_NUM"); }
    protected abstract ConditionValue xgetCValueHmPickNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_Equal(Long hmRate) {
        doSetHmRate_Equal(hmRate);
    }

    protected void doSetHmRate_Equal(Long hmRate) {
        regHmRate(CK_EQ, hmRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_NotEqual(Long hmRate) {
        doSetHmRate_NotEqual(hmRate);
    }

    protected void doSetHmRate_NotEqual(Long hmRate) {
        regHmRate(CK_NES, hmRate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_GreaterThan(Long hmRate) {
        regHmRate(CK_GT, hmRate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_LessThan(Long hmRate) {
        regHmRate(CK_LT, hmRate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_GreaterEqual(Long hmRate) {
        regHmRate(CK_GE, hmRate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRate The value of hmRate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRate_LessEqual(Long hmRate) {
        regHmRate(CK_LE, hmRate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param minNumber The min number of hmRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmRate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmRate_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmRate(), "HM_RATE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRateList The collection of hmRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRate_InScope(Collection<Long> hmRateList) {
        doSetHmRate_InScope(hmRateList);
    }

    protected void doSetHmRate_InScope(Collection<Long> hmRateList) {
        regINS(CK_INS, cTL(hmRateList), xgetCValueHmRate(), "HM_RATE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     * @param hmRateList The collection of hmRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRate_NotInScope(Collection<Long> hmRateList) {
        doSetHmRate_NotInScope(hmRateList);
    }

    protected void doSetHmRate_NotInScope(Collection<Long> hmRateList) {
        regINS(CK_NINS, cTL(hmRateList), xgetCValueHmRate(), "HM_RATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     */
    public void setHmRate_IsNull() { regHmRate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_RATE: {BIGINT(19)}
     */
    public void setHmRate_IsNotNull() { regHmRate(CK_ISNN, DOBJ); }

    protected void regHmRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmRate(), "HM_RATE"); }
    protected abstract ConditionValue xgetCValueHmRate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_Equal(Long totalItemCnt) {
        doSetTotalItemCnt_Equal(totalItemCnt);
    }

    protected void doSetTotalItemCnt_Equal(Long totalItemCnt) {
        regTotalItemCnt(CK_EQ, totalItemCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_NotEqual(Long totalItemCnt) {
        doSetTotalItemCnt_NotEqual(totalItemCnt);
    }

    protected void doSetTotalItemCnt_NotEqual(Long totalItemCnt) {
        regTotalItemCnt(CK_NES, totalItemCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_GreaterThan(Long totalItemCnt) {
        regTotalItemCnt(CK_GT, totalItemCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_LessThan(Long totalItemCnt) {
        regTotalItemCnt(CK_LT, totalItemCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_GreaterEqual(Long totalItemCnt) {
        regTotalItemCnt(CK_GE, totalItemCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCnt The value of totalItemCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalItemCnt_LessEqual(Long totalItemCnt) {
        regTotalItemCnt(CK_LE, totalItemCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param minNumber The min number of totalItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalItemCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalItemCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalItemCnt(), "TOTAL_ITEM_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCntList The collection of totalItemCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalItemCnt_InScope(Collection<Long> totalItemCntList) {
        doSetTotalItemCnt_InScope(totalItemCntList);
    }

    protected void doSetTotalItemCnt_InScope(Collection<Long> totalItemCntList) {
        regINS(CK_INS, cTL(totalItemCntList), xgetCValueTotalItemCnt(), "TOTAL_ITEM_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     * @param totalItemCntList The collection of totalItemCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalItemCnt_NotInScope(Collection<Long> totalItemCntList) {
        doSetTotalItemCnt_NotInScope(totalItemCntList);
    }

    protected void doSetTotalItemCnt_NotInScope(Collection<Long> totalItemCntList) {
        regINS(CK_NINS, cTL(totalItemCntList), xgetCValueTotalItemCnt(), "TOTAL_ITEM_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     */
    public void setTotalItemCnt_IsNull() { regTotalItemCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_ITEM_CNT: {BIGINT(19)}
     */
    public void setTotalItemCnt_IsNotNull() { regTotalItemCnt(CK_ISNN, DOBJ); }

    protected void regTotalItemCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalItemCnt(), "TOTAL_ITEM_CNT"); }
    protected abstract ConditionValue xgetCValueTotalItemCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_Equal(Long totalPickNum) {
        doSetTotalPickNum_Equal(totalPickNum);
    }

    protected void doSetTotalPickNum_Equal(Long totalPickNum) {
        regTotalPickNum(CK_EQ, totalPickNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_NotEqual(Long totalPickNum) {
        doSetTotalPickNum_NotEqual(totalPickNum);
    }

    protected void doSetTotalPickNum_NotEqual(Long totalPickNum) {
        regTotalPickNum(CK_NES, totalPickNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_GreaterThan(Long totalPickNum) {
        regTotalPickNum(CK_GT, totalPickNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_LessThan(Long totalPickNum) {
        regTotalPickNum(CK_LT, totalPickNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_GreaterEqual(Long totalPickNum) {
        regTotalPickNum(CK_GE, totalPickNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNum The value of totalPickNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPickNum_LessEqual(Long totalPickNum) {
        regTotalPickNum(CK_LE, totalPickNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPickNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPickNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPickNum(), "TOTAL_PICK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNumList The collection of totalPickNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPickNum_InScope(Collection<Long> totalPickNumList) {
        doSetTotalPickNum_InScope(totalPickNumList);
    }

    protected void doSetTotalPickNum_InScope(Collection<Long> totalPickNumList) {
        regINS(CK_INS, cTL(totalPickNumList), xgetCValueTotalPickNum(), "TOTAL_PICK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     * @param totalPickNumList The collection of totalPickNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPickNum_NotInScope(Collection<Long> totalPickNumList) {
        doSetTotalPickNum_NotInScope(totalPickNumList);
    }

    protected void doSetTotalPickNum_NotInScope(Collection<Long> totalPickNumList) {
        regINS(CK_NINS, cTL(totalPickNumList), xgetCValueTotalPickNum(), "TOTAL_PICK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     */
    public void setTotalPickNum_IsNull() { regTotalPickNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PICK_NUM: {BIGINT(19)}
     */
    public void setTotalPickNum_IsNotNull() { regTotalPickNum(CK_ISNN, DOBJ); }

    protected void regTotalPickNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPickNum(), "TOTAL_PICK_NUM"); }
    protected abstract ConditionValue xgetCValueTotalPickNum();

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
    public HpSLCFunction<TBldl5050CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5050CB.class);
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
    public HpSLCFunction<TBldl5050CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5050CB.class);
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
    public HpSLCFunction<TBldl5050CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5050CB.class);
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
    public HpSLCFunction<TBldl5050CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5050CB.class);
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
    public HpSLCFunction<TBldl5050CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5050CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5050CB&gt;() {
     *     public void query(TBldl5050CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5050CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5050CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5050CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5050CQ sq);

    protected TBldl5050CB xcreateScalarConditionCB() {
        TBldl5050CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5050CB xcreateScalarConditionPartitionByCB() {
        TBldl5050CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5050CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5050CB cb = new TBldl5050CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5050_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5050CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5050CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5050CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5050CB cb = new TBldl5050CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5050_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5050CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5050CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5050CB cb = new TBldl5050CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5050CQ sq);

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
    protected TBldl5050CB newMyCB() {
        return new TBldl5050CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5050CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
