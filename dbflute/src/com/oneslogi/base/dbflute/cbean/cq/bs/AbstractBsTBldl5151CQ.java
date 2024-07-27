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
 * The abstract condition-query of t_bldl5151.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5151CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5151CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5151";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_Equal(Long bldl5151Id) {
        doSetBldl5151Id_Equal(bldl5151Id);
    }

    protected void doSetBldl5151Id_Equal(Long bldl5151Id) {
        regBldl5151Id(CK_EQ, bldl5151Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_NotEqual(Long bldl5151Id) {
        doSetBldl5151Id_NotEqual(bldl5151Id);
    }

    protected void doSetBldl5151Id_NotEqual(Long bldl5151Id) {
        regBldl5151Id(CK_NES, bldl5151Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_GreaterThan(Long bldl5151Id) {
        regBldl5151Id(CK_GT, bldl5151Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_LessThan(Long bldl5151Id) {
        regBldl5151Id(CK_LT, bldl5151Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_GreaterEqual(Long bldl5151Id) {
        regBldl5151Id(CK_GE, bldl5151Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151Id The value of bldl5151Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5151Id_LessEqual(Long bldl5151Id) {
        regBldl5151Id(CK_LE, bldl5151Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5151Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5151Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5151Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5151Id(), "BLDL5151_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151IdList The collection of bldl5151Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5151Id_InScope(Collection<Long> bldl5151IdList) {
        doSetBldl5151Id_InScope(bldl5151IdList);
    }

    protected void doSetBldl5151Id_InScope(Collection<Long> bldl5151IdList) {
        regINS(CK_INS, cTL(bldl5151IdList), xgetCValueBldl5151Id(), "BLDL5151_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5151IdList The collection of bldl5151Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5151Id_NotInScope(Collection<Long> bldl5151IdList) {
        doSetBldl5151Id_NotInScope(bldl5151IdList);
    }

    protected void doSetBldl5151Id_NotInScope(Collection<Long> bldl5151IdList) {
        regINS(CK_NINS, cTL(bldl5151IdList), xgetCValueBldl5151Id(), "BLDL5151_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5151Id_IsNull() { regBldl5151Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5151_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5151Id_IsNotNull() { regBldl5151Id(CK_ISNN, DOBJ); }

    protected void regBldl5151Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5151Id(), "BLDL5151_ID"); }
    protected abstract ConditionValue xgetCValueBldl5151Id();

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
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_Equal(String receiveDt) {
        doSetReceiveDt_Equal(fRES(receiveDt));
    }

    protected void doSetReceiveDt_Equal(String receiveDt) {
        regReceiveDt(CK_EQ, receiveDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotEqual(String receiveDt) {
        doSetReceiveDt_NotEqual(fRES(receiveDt));
    }

    protected void doSetReceiveDt_NotEqual(String receiveDt) {
        regReceiveDt(CK_NES, receiveDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterThan(String receiveDt) {
        regReceiveDt(CK_GT, fRES(receiveDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessThan(String receiveDt) {
        regReceiveDt(CK_LT, fRES(receiveDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterEqual(String receiveDt) {
        regReceiveDt(CK_GE, fRES(receiveDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessEqual(String receiveDt) {
        regReceiveDt(CK_LE, fRES(receiveDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_InScope(Collection<String> receiveDtList) {
        doSetReceiveDt_InScope(receiveDtList);
    }

    protected void doSetReceiveDt_InScope(Collection<String> receiveDtList) {
        regINS(CK_INS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotInScope(Collection<String> receiveDtList) {
        doSetReceiveDt_NotInScope(receiveDtList);
    }

    protected void doSetReceiveDt_NotInScope(Collection<String> receiveDtList) {
        regINS(CK_NINS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setReceiveDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveDt The value of receiveDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveDt_LikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveDt_NotLikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_PrefixSearch(String receiveDt) {
        setReceiveDt_LikeSearch(receiveDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNull() { regReceiveDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNullOrEmpty() { regReceiveDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNotNull() { regReceiveDt(CK_ISNN, DOBJ); }

    protected void regReceiveDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDt(), "RECEIVE_DT"); }
    protected abstract ConditionValue xgetCValueReceiveDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_Equal(Long fwRcvCnt) {
        doSetFwRcvCnt_Equal(fwRcvCnt);
    }

    protected void doSetFwRcvCnt_Equal(Long fwRcvCnt) {
        regFwRcvCnt(CK_EQ, fwRcvCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_NotEqual(Long fwRcvCnt) {
        doSetFwRcvCnt_NotEqual(fwRcvCnt);
    }

    protected void doSetFwRcvCnt_NotEqual(Long fwRcvCnt) {
        regFwRcvCnt(CK_NES, fwRcvCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_GreaterThan(Long fwRcvCnt) {
        regFwRcvCnt(CK_GT, fwRcvCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_LessThan(Long fwRcvCnt) {
        regFwRcvCnt(CK_LT, fwRcvCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_GreaterEqual(Long fwRcvCnt) {
        regFwRcvCnt(CK_GE, fwRcvCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCnt The value of fwRcvCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvCnt_LessEqual(Long fwRcvCnt) {
        regFwRcvCnt(CK_LE, fwRcvCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param minNumber The min number of fwRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwRcvCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwRcvCnt(), "FW_RCV_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCntList The collection of fwRcvCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRcvCnt_InScope(Collection<Long> fwRcvCntList) {
        doSetFwRcvCnt_InScope(fwRcvCntList);
    }

    protected void doSetFwRcvCnt_InScope(Collection<Long> fwRcvCntList) {
        regINS(CK_INS, cTL(fwRcvCntList), xgetCValueFwRcvCnt(), "FW_RCV_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     * @param fwRcvCntList The collection of fwRcvCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRcvCnt_NotInScope(Collection<Long> fwRcvCntList) {
        doSetFwRcvCnt_NotInScope(fwRcvCntList);
    }

    protected void doSetFwRcvCnt_NotInScope(Collection<Long> fwRcvCntList) {
        regINS(CK_NINS, cTL(fwRcvCntList), xgetCValueFwRcvCnt(), "FW_RCV_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     */
    public void setFwRcvCnt_IsNull() { regFwRcvCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RCV_CNT: {BIGINT(19)}
     */
    public void setFwRcvCnt_IsNotNull() { regFwRcvCnt(CK_ISNN, DOBJ); }

    protected void regFwRcvCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwRcvCnt(), "FW_RCV_CNT"); }
    protected abstract ConditionValue xgetCValueFwRcvCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_Equal(Long fwRcvNum) {
        doSetFwRcvNum_Equal(fwRcvNum);
    }

    protected void doSetFwRcvNum_Equal(Long fwRcvNum) {
        regFwRcvNum(CK_EQ, fwRcvNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_NotEqual(Long fwRcvNum) {
        doSetFwRcvNum_NotEqual(fwRcvNum);
    }

    protected void doSetFwRcvNum_NotEqual(Long fwRcvNum) {
        regFwRcvNum(CK_NES, fwRcvNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_GreaterThan(Long fwRcvNum) {
        regFwRcvNum(CK_GT, fwRcvNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_LessThan(Long fwRcvNum) {
        regFwRcvNum(CK_LT, fwRcvNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_GreaterEqual(Long fwRcvNum) {
        regFwRcvNum(CK_GE, fwRcvNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNum The value of fwRcvNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwRcvNum_LessEqual(Long fwRcvNum) {
        regFwRcvNum(CK_LE, fwRcvNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwRcvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwRcvNum(), "FW_RCV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNumList The collection of fwRcvNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRcvNum_InScope(Collection<Long> fwRcvNumList) {
        doSetFwRcvNum_InScope(fwRcvNumList);
    }

    protected void doSetFwRcvNum_InScope(Collection<Long> fwRcvNumList) {
        regINS(CK_INS, cTL(fwRcvNumList), xgetCValueFwRcvNum(), "FW_RCV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     * @param fwRcvNumList The collection of fwRcvNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwRcvNum_NotInScope(Collection<Long> fwRcvNumList) {
        doSetFwRcvNum_NotInScope(fwRcvNumList);
    }

    protected void doSetFwRcvNum_NotInScope(Collection<Long> fwRcvNumList) {
        regINS(CK_NINS, cTL(fwRcvNumList), xgetCValueFwRcvNum(), "FW_RCV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     */
    public void setFwRcvNum_IsNull() { regFwRcvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RCV_NUM: {BIGINT(19)}
     */
    public void setFwRcvNum_IsNotNull() { regFwRcvNum(CK_ISNN, DOBJ); }

    protected void regFwRcvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwRcvNum(), "FW_RCV_NUM"); }
    protected abstract ConditionValue xgetCValueFwRcvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_Equal(Long fwCaseNum) {
        doSetFwCaseNum_Equal(fwCaseNum);
    }

    protected void doSetFwCaseNum_Equal(Long fwCaseNum) {
        regFwCaseNum(CK_EQ, fwCaseNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_NotEqual(Long fwCaseNum) {
        doSetFwCaseNum_NotEqual(fwCaseNum);
    }

    protected void doSetFwCaseNum_NotEqual(Long fwCaseNum) {
        regFwCaseNum(CK_NES, fwCaseNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_GreaterThan(Long fwCaseNum) {
        regFwCaseNum(CK_GT, fwCaseNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_LessThan(Long fwCaseNum) {
        regFwCaseNum(CK_LT, fwCaseNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_GreaterEqual(Long fwCaseNum) {
        regFwCaseNum(CK_GE, fwCaseNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNum The value of fwCaseNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwCaseNum_LessEqual(Long fwCaseNum) {
        regFwCaseNum(CK_LE, fwCaseNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwCaseNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwCaseNum(), "FW_CASE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNumList The collection of fwCaseNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwCaseNum_InScope(Collection<Long> fwCaseNumList) {
        doSetFwCaseNum_InScope(fwCaseNumList);
    }

    protected void doSetFwCaseNum_InScope(Collection<Long> fwCaseNumList) {
        regINS(CK_INS, cTL(fwCaseNumList), xgetCValueFwCaseNum(), "FW_CASE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     * @param fwCaseNumList The collection of fwCaseNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwCaseNum_NotInScope(Collection<Long> fwCaseNumList) {
        doSetFwCaseNum_NotInScope(fwCaseNumList);
    }

    protected void doSetFwCaseNum_NotInScope(Collection<Long> fwCaseNumList) {
        regINS(CK_NINS, cTL(fwCaseNumList), xgetCValueFwCaseNum(), "FW_CASE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     */
    public void setFwCaseNum_IsNull() { regFwCaseNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_CASE_NUM: {BIGINT(19)}
     */
    public void setFwCaseNum_IsNotNull() { regFwCaseNum(CK_ISNN, DOBJ); }

    protected void regFwCaseNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwCaseNum(), "FW_CASE_NUM"); }
    protected abstract ConditionValue xgetCValueFwCaseNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_Equal(Long unRcvCnt) {
        doSetUnRcvCnt_Equal(unRcvCnt);
    }

    protected void doSetUnRcvCnt_Equal(Long unRcvCnt) {
        regUnRcvCnt(CK_EQ, unRcvCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_NotEqual(Long unRcvCnt) {
        doSetUnRcvCnt_NotEqual(unRcvCnt);
    }

    protected void doSetUnRcvCnt_NotEqual(Long unRcvCnt) {
        regUnRcvCnt(CK_NES, unRcvCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_GreaterThan(Long unRcvCnt) {
        regUnRcvCnt(CK_GT, unRcvCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_LessThan(Long unRcvCnt) {
        regUnRcvCnt(CK_LT, unRcvCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_GreaterEqual(Long unRcvCnt) {
        regUnRcvCnt(CK_GE, unRcvCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCnt The value of unRcvCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvCnt_LessEqual(Long unRcvCnt) {
        regUnRcvCnt(CK_LE, unRcvCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param minNumber The min number of unRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnRcvCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnRcvCnt(), "UN_RCV_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCntList The collection of unRcvCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRcvCnt_InScope(Collection<Long> unRcvCntList) {
        doSetUnRcvCnt_InScope(unRcvCntList);
    }

    protected void doSetUnRcvCnt_InScope(Collection<Long> unRcvCntList) {
        regINS(CK_INS, cTL(unRcvCntList), xgetCValueUnRcvCnt(), "UN_RCV_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     * @param unRcvCntList The collection of unRcvCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRcvCnt_NotInScope(Collection<Long> unRcvCntList) {
        doSetUnRcvCnt_NotInScope(unRcvCntList);
    }

    protected void doSetUnRcvCnt_NotInScope(Collection<Long> unRcvCntList) {
        regINS(CK_NINS, cTL(unRcvCntList), xgetCValueUnRcvCnt(), "UN_RCV_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     */
    public void setUnRcvCnt_IsNull() { regUnRcvCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RCV_CNT: {BIGINT(19)}
     */
    public void setUnRcvCnt_IsNotNull() { regUnRcvCnt(CK_ISNN, DOBJ); }

    protected void regUnRcvCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnRcvCnt(), "UN_RCV_CNT"); }
    protected abstract ConditionValue xgetCValueUnRcvCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_Equal(Long unRcvNum) {
        doSetUnRcvNum_Equal(unRcvNum);
    }

    protected void doSetUnRcvNum_Equal(Long unRcvNum) {
        regUnRcvNum(CK_EQ, unRcvNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_NotEqual(Long unRcvNum) {
        doSetUnRcvNum_NotEqual(unRcvNum);
    }

    protected void doSetUnRcvNum_NotEqual(Long unRcvNum) {
        regUnRcvNum(CK_NES, unRcvNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_GreaterThan(Long unRcvNum) {
        regUnRcvNum(CK_GT, unRcvNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_LessThan(Long unRcvNum) {
        regUnRcvNum(CK_LT, unRcvNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_GreaterEqual(Long unRcvNum) {
        regUnRcvNum(CK_GE, unRcvNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNum The value of unRcvNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnRcvNum_LessEqual(Long unRcvNum) {
        regUnRcvNum(CK_LE, unRcvNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param minNumber The min number of unRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnRcvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnRcvNum(), "UN_RCV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNumList The collection of unRcvNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRcvNum_InScope(Collection<Long> unRcvNumList) {
        doSetUnRcvNum_InScope(unRcvNumList);
    }

    protected void doSetUnRcvNum_InScope(Collection<Long> unRcvNumList) {
        regINS(CK_INS, cTL(unRcvNumList), xgetCValueUnRcvNum(), "UN_RCV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     * @param unRcvNumList The collection of unRcvNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnRcvNum_NotInScope(Collection<Long> unRcvNumList) {
        doSetUnRcvNum_NotInScope(unRcvNumList);
    }

    protected void doSetUnRcvNum_NotInScope(Collection<Long> unRcvNumList) {
        regINS(CK_NINS, cTL(unRcvNumList), xgetCValueUnRcvNum(), "UN_RCV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     */
    public void setUnRcvNum_IsNull() { regUnRcvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RCV_NUM: {BIGINT(19)}
     */
    public void setUnRcvNum_IsNotNull() { regUnRcvNum(CK_ISNN, DOBJ); }

    protected void regUnRcvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnRcvNum(), "UN_RCV_NUM"); }
    protected abstract ConditionValue xgetCValueUnRcvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_Equal(Long unCaseNum) {
        doSetUnCaseNum_Equal(unCaseNum);
    }

    protected void doSetUnCaseNum_Equal(Long unCaseNum) {
        regUnCaseNum(CK_EQ, unCaseNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_NotEqual(Long unCaseNum) {
        doSetUnCaseNum_NotEqual(unCaseNum);
    }

    protected void doSetUnCaseNum_NotEqual(Long unCaseNum) {
        regUnCaseNum(CK_NES, unCaseNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_GreaterThan(Long unCaseNum) {
        regUnCaseNum(CK_GT, unCaseNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_LessThan(Long unCaseNum) {
        regUnCaseNum(CK_LT, unCaseNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_GreaterEqual(Long unCaseNum) {
        regUnCaseNum(CK_GE, unCaseNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNum The value of unCaseNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnCaseNum_LessEqual(Long unCaseNum) {
        regUnCaseNum(CK_LE, unCaseNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param minNumber The min number of unCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnCaseNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnCaseNum(), "UN_CASE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNumList The collection of unCaseNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnCaseNum_InScope(Collection<Long> unCaseNumList) {
        doSetUnCaseNum_InScope(unCaseNumList);
    }

    protected void doSetUnCaseNum_InScope(Collection<Long> unCaseNumList) {
        regINS(CK_INS, cTL(unCaseNumList), xgetCValueUnCaseNum(), "UN_CASE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     * @param unCaseNumList The collection of unCaseNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnCaseNum_NotInScope(Collection<Long> unCaseNumList) {
        doSetUnCaseNum_NotInScope(unCaseNumList);
    }

    protected void doSetUnCaseNum_NotInScope(Collection<Long> unCaseNumList) {
        regINS(CK_NINS, cTL(unCaseNumList), xgetCValueUnCaseNum(), "UN_CASE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     */
    public void setUnCaseNum_IsNull() { regUnCaseNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_CASE_NUM: {BIGINT(19)}
     */
    public void setUnCaseNum_IsNotNull() { regUnCaseNum(CK_ISNN, DOBJ); }

    protected void regUnCaseNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnCaseNum(), "UN_CASE_NUM"); }
    protected abstract ConditionValue xgetCValueUnCaseNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_Equal(Long shRcvCnt) {
        doSetShRcvCnt_Equal(shRcvCnt);
    }

    protected void doSetShRcvCnt_Equal(Long shRcvCnt) {
        regShRcvCnt(CK_EQ, shRcvCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_NotEqual(Long shRcvCnt) {
        doSetShRcvCnt_NotEqual(shRcvCnt);
    }

    protected void doSetShRcvCnt_NotEqual(Long shRcvCnt) {
        regShRcvCnt(CK_NES, shRcvCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_GreaterThan(Long shRcvCnt) {
        regShRcvCnt(CK_GT, shRcvCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_LessThan(Long shRcvCnt) {
        regShRcvCnt(CK_LT, shRcvCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_GreaterEqual(Long shRcvCnt) {
        regShRcvCnt(CK_GE, shRcvCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCnt The value of shRcvCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvCnt_LessEqual(Long shRcvCnt) {
        regShRcvCnt(CK_LE, shRcvCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param minNumber The min number of shRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShRcvCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShRcvCnt(), "SH_RCV_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCntList The collection of shRcvCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRcvCnt_InScope(Collection<Long> shRcvCntList) {
        doSetShRcvCnt_InScope(shRcvCntList);
    }

    protected void doSetShRcvCnt_InScope(Collection<Long> shRcvCntList) {
        regINS(CK_INS, cTL(shRcvCntList), xgetCValueShRcvCnt(), "SH_RCV_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     * @param shRcvCntList The collection of shRcvCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRcvCnt_NotInScope(Collection<Long> shRcvCntList) {
        doSetShRcvCnt_NotInScope(shRcvCntList);
    }

    protected void doSetShRcvCnt_NotInScope(Collection<Long> shRcvCntList) {
        regINS(CK_NINS, cTL(shRcvCntList), xgetCValueShRcvCnt(), "SH_RCV_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     */
    public void setShRcvCnt_IsNull() { regShRcvCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RCV_CNT: {BIGINT(19)}
     */
    public void setShRcvCnt_IsNotNull() { regShRcvCnt(CK_ISNN, DOBJ); }

    protected void regShRcvCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShRcvCnt(), "SH_RCV_CNT"); }
    protected abstract ConditionValue xgetCValueShRcvCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_Equal(Long shRcvNum) {
        doSetShRcvNum_Equal(shRcvNum);
    }

    protected void doSetShRcvNum_Equal(Long shRcvNum) {
        regShRcvNum(CK_EQ, shRcvNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_NotEqual(Long shRcvNum) {
        doSetShRcvNum_NotEqual(shRcvNum);
    }

    protected void doSetShRcvNum_NotEqual(Long shRcvNum) {
        regShRcvNum(CK_NES, shRcvNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_GreaterThan(Long shRcvNum) {
        regShRcvNum(CK_GT, shRcvNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_LessThan(Long shRcvNum) {
        regShRcvNum(CK_LT, shRcvNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_GreaterEqual(Long shRcvNum) {
        regShRcvNum(CK_GE, shRcvNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNum The value of shRcvNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShRcvNum_LessEqual(Long shRcvNum) {
        regShRcvNum(CK_LE, shRcvNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param minNumber The min number of shRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShRcvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShRcvNum(), "SH_RCV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNumList The collection of shRcvNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRcvNum_InScope(Collection<Long> shRcvNumList) {
        doSetShRcvNum_InScope(shRcvNumList);
    }

    protected void doSetShRcvNum_InScope(Collection<Long> shRcvNumList) {
        regINS(CK_INS, cTL(shRcvNumList), xgetCValueShRcvNum(), "SH_RCV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     * @param shRcvNumList The collection of shRcvNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShRcvNum_NotInScope(Collection<Long> shRcvNumList) {
        doSetShRcvNum_NotInScope(shRcvNumList);
    }

    protected void doSetShRcvNum_NotInScope(Collection<Long> shRcvNumList) {
        regINS(CK_NINS, cTL(shRcvNumList), xgetCValueShRcvNum(), "SH_RCV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     */
    public void setShRcvNum_IsNull() { regShRcvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RCV_NUM: {BIGINT(19)}
     */
    public void setShRcvNum_IsNotNull() { regShRcvNum(CK_ISNN, DOBJ); }

    protected void regShRcvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShRcvNum(), "SH_RCV_NUM"); }
    protected abstract ConditionValue xgetCValueShRcvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_Equal(Long shCaseNum) {
        doSetShCaseNum_Equal(shCaseNum);
    }

    protected void doSetShCaseNum_Equal(Long shCaseNum) {
        regShCaseNum(CK_EQ, shCaseNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_NotEqual(Long shCaseNum) {
        doSetShCaseNum_NotEqual(shCaseNum);
    }

    protected void doSetShCaseNum_NotEqual(Long shCaseNum) {
        regShCaseNum(CK_NES, shCaseNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_GreaterThan(Long shCaseNum) {
        regShCaseNum(CK_GT, shCaseNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_LessThan(Long shCaseNum) {
        regShCaseNum(CK_LT, shCaseNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_GreaterEqual(Long shCaseNum) {
        regShCaseNum(CK_GE, shCaseNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNum The value of shCaseNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShCaseNum_LessEqual(Long shCaseNum) {
        regShCaseNum(CK_LE, shCaseNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param minNumber The min number of shCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShCaseNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShCaseNum(), "SH_CASE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNumList The collection of shCaseNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShCaseNum_InScope(Collection<Long> shCaseNumList) {
        doSetShCaseNum_InScope(shCaseNumList);
    }

    protected void doSetShCaseNum_InScope(Collection<Long> shCaseNumList) {
        regINS(CK_INS, cTL(shCaseNumList), xgetCValueShCaseNum(), "SH_CASE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     * @param shCaseNumList The collection of shCaseNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShCaseNum_NotInScope(Collection<Long> shCaseNumList) {
        doSetShCaseNum_NotInScope(shCaseNumList);
    }

    protected void doSetShCaseNum_NotInScope(Collection<Long> shCaseNumList) {
        regINS(CK_NINS, cTL(shCaseNumList), xgetCValueShCaseNum(), "SH_CASE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     */
    public void setShCaseNum_IsNull() { regShCaseNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_CASE_NUM: {BIGINT(19)}
     */
    public void setShCaseNum_IsNotNull() { regShCaseNum(CK_ISNN, DOBJ); }

    protected void regShCaseNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShCaseNum(), "SH_CASE_NUM"); }
    protected abstract ConditionValue xgetCValueShCaseNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_Equal(Long hmRcvCnt) {
        doSetHmRcvCnt_Equal(hmRcvCnt);
    }

    protected void doSetHmRcvCnt_Equal(Long hmRcvCnt) {
        regHmRcvCnt(CK_EQ, hmRcvCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_NotEqual(Long hmRcvCnt) {
        doSetHmRcvCnt_NotEqual(hmRcvCnt);
    }

    protected void doSetHmRcvCnt_NotEqual(Long hmRcvCnt) {
        regHmRcvCnt(CK_NES, hmRcvCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_GreaterThan(Long hmRcvCnt) {
        regHmRcvCnt(CK_GT, hmRcvCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_LessThan(Long hmRcvCnt) {
        regHmRcvCnt(CK_LT, hmRcvCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_GreaterEqual(Long hmRcvCnt) {
        regHmRcvCnt(CK_GE, hmRcvCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCnt The value of hmRcvCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvCnt_LessEqual(Long hmRcvCnt) {
        regHmRcvCnt(CK_LE, hmRcvCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param minNumber The min number of hmRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmRcvCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmRcvCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmRcvCnt(), "HM_RCV_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCntList The collection of hmRcvCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRcvCnt_InScope(Collection<Long> hmRcvCntList) {
        doSetHmRcvCnt_InScope(hmRcvCntList);
    }

    protected void doSetHmRcvCnt_InScope(Collection<Long> hmRcvCntList) {
        regINS(CK_INS, cTL(hmRcvCntList), xgetCValueHmRcvCnt(), "HM_RCV_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     * @param hmRcvCntList The collection of hmRcvCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRcvCnt_NotInScope(Collection<Long> hmRcvCntList) {
        doSetHmRcvCnt_NotInScope(hmRcvCntList);
    }

    protected void doSetHmRcvCnt_NotInScope(Collection<Long> hmRcvCntList) {
        regINS(CK_NINS, cTL(hmRcvCntList), xgetCValueHmRcvCnt(), "HM_RCV_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     */
    public void setHmRcvCnt_IsNull() { regHmRcvCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_RCV_CNT: {BIGINT(19)}
     */
    public void setHmRcvCnt_IsNotNull() { regHmRcvCnt(CK_ISNN, DOBJ); }

    protected void regHmRcvCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmRcvCnt(), "HM_RCV_CNT"); }
    protected abstract ConditionValue xgetCValueHmRcvCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_Equal(Long hmRcvNum) {
        doSetHmRcvNum_Equal(hmRcvNum);
    }

    protected void doSetHmRcvNum_Equal(Long hmRcvNum) {
        regHmRcvNum(CK_EQ, hmRcvNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_NotEqual(Long hmRcvNum) {
        doSetHmRcvNum_NotEqual(hmRcvNum);
    }

    protected void doSetHmRcvNum_NotEqual(Long hmRcvNum) {
        regHmRcvNum(CK_NES, hmRcvNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_GreaterThan(Long hmRcvNum) {
        regHmRcvNum(CK_GT, hmRcvNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_LessThan(Long hmRcvNum) {
        regHmRcvNum(CK_LT, hmRcvNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_GreaterEqual(Long hmRcvNum) {
        regHmRcvNum(CK_GE, hmRcvNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNum The value of hmRcvNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmRcvNum_LessEqual(Long hmRcvNum) {
        regHmRcvNum(CK_LE, hmRcvNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param minNumber The min number of hmRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmRcvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmRcvNum(), "HM_RCV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNumList The collection of hmRcvNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRcvNum_InScope(Collection<Long> hmRcvNumList) {
        doSetHmRcvNum_InScope(hmRcvNumList);
    }

    protected void doSetHmRcvNum_InScope(Collection<Long> hmRcvNumList) {
        regINS(CK_INS, cTL(hmRcvNumList), xgetCValueHmRcvNum(), "HM_RCV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     * @param hmRcvNumList The collection of hmRcvNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmRcvNum_NotInScope(Collection<Long> hmRcvNumList) {
        doSetHmRcvNum_NotInScope(hmRcvNumList);
    }

    protected void doSetHmRcvNum_NotInScope(Collection<Long> hmRcvNumList) {
        regINS(CK_NINS, cTL(hmRcvNumList), xgetCValueHmRcvNum(), "HM_RCV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     */
    public void setHmRcvNum_IsNull() { regHmRcvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_RCV_NUM: {BIGINT(19)}
     */
    public void setHmRcvNum_IsNotNull() { regHmRcvNum(CK_ISNN, DOBJ); }

    protected void regHmRcvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmRcvNum(), "HM_RCV_NUM"); }
    protected abstract ConditionValue xgetCValueHmRcvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_Equal(Long hmCaseNum) {
        doSetHmCaseNum_Equal(hmCaseNum);
    }

    protected void doSetHmCaseNum_Equal(Long hmCaseNum) {
        regHmCaseNum(CK_EQ, hmCaseNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_NotEqual(Long hmCaseNum) {
        doSetHmCaseNum_NotEqual(hmCaseNum);
    }

    protected void doSetHmCaseNum_NotEqual(Long hmCaseNum) {
        regHmCaseNum(CK_NES, hmCaseNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_GreaterThan(Long hmCaseNum) {
        regHmCaseNum(CK_GT, hmCaseNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_LessThan(Long hmCaseNum) {
        regHmCaseNum(CK_LT, hmCaseNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_GreaterEqual(Long hmCaseNum) {
        regHmCaseNum(CK_GE, hmCaseNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNum The value of hmCaseNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHmCaseNum_LessEqual(Long hmCaseNum) {
        regHmCaseNum(CK_LE, hmCaseNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param minNumber The min number of hmCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of hmCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHmCaseNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHmCaseNum(), "HM_CASE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNumList The collection of hmCaseNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmCaseNum_InScope(Collection<Long> hmCaseNumList) {
        doSetHmCaseNum_InScope(hmCaseNumList);
    }

    protected void doSetHmCaseNum_InScope(Collection<Long> hmCaseNumList) {
        regINS(CK_INS, cTL(hmCaseNumList), xgetCValueHmCaseNum(), "HM_CASE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     * @param hmCaseNumList The collection of hmCaseNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHmCaseNum_NotInScope(Collection<Long> hmCaseNumList) {
        doSetHmCaseNum_NotInScope(hmCaseNumList);
    }

    protected void doSetHmCaseNum_NotInScope(Collection<Long> hmCaseNumList) {
        regINS(CK_NINS, cTL(hmCaseNumList), xgetCValueHmCaseNum(), "HM_CASE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     */
    public void setHmCaseNum_IsNull() { regHmCaseNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HM_CASE_NUM: {BIGINT(19)}
     */
    public void setHmCaseNum_IsNotNull() { regHmCaseNum(CK_ISNN, DOBJ); }

    protected void regHmCaseNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHmCaseNum(), "HM_CASE_NUM"); }
    protected abstract ConditionValue xgetCValueHmCaseNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_Equal(Long totalRcvNum) {
        doSetTotalRcvNum_Equal(totalRcvNum);
    }

    protected void doSetTotalRcvNum_Equal(Long totalRcvNum) {
        regTotalRcvNum(CK_EQ, totalRcvNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_NotEqual(Long totalRcvNum) {
        doSetTotalRcvNum_NotEqual(totalRcvNum);
    }

    protected void doSetTotalRcvNum_NotEqual(Long totalRcvNum) {
        regTotalRcvNum(CK_NES, totalRcvNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_GreaterThan(Long totalRcvNum) {
        regTotalRcvNum(CK_GT, totalRcvNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_LessThan(Long totalRcvNum) {
        regTotalRcvNum(CK_LT, totalRcvNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_GreaterEqual(Long totalRcvNum) {
        regTotalRcvNum(CK_GE, totalRcvNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNum The value of totalRcvNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalRcvNum_LessEqual(Long totalRcvNum) {
        regTotalRcvNum(CK_LE, totalRcvNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalRcvNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalRcvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalRcvNum(), "TOTAL_RCV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNumList The collection of totalRcvNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalRcvNum_InScope(Collection<Long> totalRcvNumList) {
        doSetTotalRcvNum_InScope(totalRcvNumList);
    }

    protected void doSetTotalRcvNum_InScope(Collection<Long> totalRcvNumList) {
        regINS(CK_INS, cTL(totalRcvNumList), xgetCValueTotalRcvNum(), "TOTAL_RCV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     * @param totalRcvNumList The collection of totalRcvNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalRcvNum_NotInScope(Collection<Long> totalRcvNumList) {
        doSetTotalRcvNum_NotInScope(totalRcvNumList);
    }

    protected void doSetTotalRcvNum_NotInScope(Collection<Long> totalRcvNumList) {
        regINS(CK_NINS, cTL(totalRcvNumList), xgetCValueTotalRcvNum(), "TOTAL_RCV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     */
    public void setTotalRcvNum_IsNull() { regTotalRcvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_RCV_NUM: {BIGINT(19)}
     */
    public void setTotalRcvNum_IsNotNull() { regTotalRcvNum(CK_ISNN, DOBJ); }

    protected void regTotalRcvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalRcvNum(), "TOTAL_RCV_NUM"); }
    protected abstract ConditionValue xgetCValueTotalRcvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_Equal(Long totalCaseNum) {
        doSetTotalCaseNum_Equal(totalCaseNum);
    }

    protected void doSetTotalCaseNum_Equal(Long totalCaseNum) {
        regTotalCaseNum(CK_EQ, totalCaseNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_NotEqual(Long totalCaseNum) {
        doSetTotalCaseNum_NotEqual(totalCaseNum);
    }

    protected void doSetTotalCaseNum_NotEqual(Long totalCaseNum) {
        regTotalCaseNum(CK_NES, totalCaseNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_GreaterThan(Long totalCaseNum) {
        regTotalCaseNum(CK_GT, totalCaseNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_LessThan(Long totalCaseNum) {
        regTotalCaseNum(CK_LT, totalCaseNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_GreaterEqual(Long totalCaseNum) {
        regTotalCaseNum(CK_GE, totalCaseNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNum The value of totalCaseNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalCaseNum_LessEqual(Long totalCaseNum) {
        regTotalCaseNum(CK_LE, totalCaseNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalCaseNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalCaseNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalCaseNum(), "TOTAL_CASE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNumList The collection of totalCaseNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalCaseNum_InScope(Collection<Long> totalCaseNumList) {
        doSetTotalCaseNum_InScope(totalCaseNumList);
    }

    protected void doSetTotalCaseNum_InScope(Collection<Long> totalCaseNumList) {
        regINS(CK_INS, cTL(totalCaseNumList), xgetCValueTotalCaseNum(), "TOTAL_CASE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     * @param totalCaseNumList The collection of totalCaseNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalCaseNum_NotInScope(Collection<Long> totalCaseNumList) {
        doSetTotalCaseNum_NotInScope(totalCaseNumList);
    }

    protected void doSetTotalCaseNum_NotInScope(Collection<Long> totalCaseNumList) {
        regINS(CK_NINS, cTL(totalCaseNumList), xgetCValueTotalCaseNum(), "TOTAL_CASE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     */
    public void setTotalCaseNum_IsNull() { regTotalCaseNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_CASE_NUM: {BIGINT(19)}
     */
    public void setTotalCaseNum_IsNotNull() { regTotalCaseNum(CK_ISNN, DOBJ); }

    protected void regTotalCaseNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalCaseNum(), "TOTAL_CASE_NUM"); }
    protected abstract ConditionValue xgetCValueTotalCaseNum();

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
    public HpSLCFunction<TBldl5151CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5151CB.class);
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
    public HpSLCFunction<TBldl5151CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5151CB.class);
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
    public HpSLCFunction<TBldl5151CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5151CB.class);
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
    public HpSLCFunction<TBldl5151CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5151CB.class);
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
    public HpSLCFunction<TBldl5151CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5151CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5151CB&gt;() {
     *     public void query(TBldl5151CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5151CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5151CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5151CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5151CQ sq);

    protected TBldl5151CB xcreateScalarConditionCB() {
        TBldl5151CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5151CB xcreateScalarConditionPartitionByCB() {
        TBldl5151CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5151CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5151CB cb = new TBldl5151CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5151_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5151CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5151CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5151CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5151CB cb = new TBldl5151CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5151_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5151CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5151CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5151CB cb = new TBldl5151CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5151CQ sq);

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
    protected TBldl5151CB newMyCB() {
        return new TBldl5151CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5151CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
