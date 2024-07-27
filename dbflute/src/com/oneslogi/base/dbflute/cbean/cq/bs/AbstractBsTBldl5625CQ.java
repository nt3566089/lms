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
 * The abstract condition-query of t_bldl5625.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5625CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5625CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5625";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_Equal(Long bldl5625Id) {
        doSetBldl5625Id_Equal(bldl5625Id);
    }

    protected void doSetBldl5625Id_Equal(Long bldl5625Id) {
        regBldl5625Id(CK_EQ, bldl5625Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_NotEqual(Long bldl5625Id) {
        doSetBldl5625Id_NotEqual(bldl5625Id);
    }

    protected void doSetBldl5625Id_NotEqual(Long bldl5625Id) {
        regBldl5625Id(CK_NES, bldl5625Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_GreaterThan(Long bldl5625Id) {
        regBldl5625Id(CK_GT, bldl5625Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_LessThan(Long bldl5625Id) {
        regBldl5625Id(CK_LT, bldl5625Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_GreaterEqual(Long bldl5625Id) {
        regBldl5625Id(CK_GE, bldl5625Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625Id The value of bldl5625Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5625Id_LessEqual(Long bldl5625Id) {
        regBldl5625Id(CK_LE, bldl5625Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5625Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5625Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5625Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5625Id(), "BLDL5625_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625IdList The collection of bldl5625Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5625Id_InScope(Collection<Long> bldl5625IdList) {
        doSetBldl5625Id_InScope(bldl5625IdList);
    }

    protected void doSetBldl5625Id_InScope(Collection<Long> bldl5625IdList) {
        regINS(CK_INS, cTL(bldl5625IdList), xgetCValueBldl5625Id(), "BLDL5625_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5625IdList The collection of bldl5625Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5625Id_NotInScope(Collection<Long> bldl5625IdList) {
        doSetBldl5625Id_NotInScope(bldl5625IdList);
    }

    protected void doSetBldl5625Id_NotInScope(Collection<Long> bldl5625IdList) {
        regINS(CK_NINS, cTL(bldl5625IdList), xgetCValueBldl5625Id(), "BLDL5625_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5625Id_IsNull() { regBldl5625Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5625_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5625Id_IsNotNull() { regBldl5625Id(CK_ISNN, DOBJ); }

    protected void regBldl5625Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5625Id(), "BLDL5625_ID"); }
    protected abstract ConditionValue xgetCValueBldl5625Id();

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
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_Equal(Long fwShippingCnt) {
        doSetFwShippingCnt_Equal(fwShippingCnt);
    }

    protected void doSetFwShippingCnt_Equal(Long fwShippingCnt) {
        regFwShippingCnt(CK_EQ, fwShippingCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_NotEqual(Long fwShippingCnt) {
        doSetFwShippingCnt_NotEqual(fwShippingCnt);
    }

    protected void doSetFwShippingCnt_NotEqual(Long fwShippingCnt) {
        regFwShippingCnt(CK_NES, fwShippingCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_GreaterThan(Long fwShippingCnt) {
        regFwShippingCnt(CK_GT, fwShippingCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_LessThan(Long fwShippingCnt) {
        regFwShippingCnt(CK_LT, fwShippingCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_GreaterEqual(Long fwShippingCnt) {
        regFwShippingCnt(CK_GE, fwShippingCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCnt The value of fwShippingCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwShippingCnt_LessEqual(Long fwShippingCnt) {
        regFwShippingCnt(CK_LE, fwShippingCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param minNumber The min number of fwShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwShippingCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwShippingCnt(), "FW_SHIPPING_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCntList The collection of fwShippingCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwShippingCnt_InScope(Collection<Long> fwShippingCntList) {
        doSetFwShippingCnt_InScope(fwShippingCntList);
    }

    protected void doSetFwShippingCnt_InScope(Collection<Long> fwShippingCntList) {
        regINS(CK_INS, cTL(fwShippingCntList), xgetCValueFwShippingCnt(), "FW_SHIPPING_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     * @param fwShippingCntList The collection of fwShippingCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwShippingCnt_NotInScope(Collection<Long> fwShippingCntList) {
        doSetFwShippingCnt_NotInScope(fwShippingCntList);
    }

    protected void doSetFwShippingCnt_NotInScope(Collection<Long> fwShippingCntList) {
        regINS(CK_NINS, cTL(fwShippingCntList), xgetCValueFwShippingCnt(), "FW_SHIPPING_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setFwShippingCnt_IsNull() { regFwShippingCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setFwShippingCnt_IsNotNull() { regFwShippingCnt(CK_ISNN, DOBJ); }

    protected void regFwShippingCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwShippingCnt(), "FW_SHIPPING_CNT"); }
    protected abstract ConditionValue xgetCValueFwShippingCnt();

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
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_Equal(Long unShippingCnt) {
        doSetUnShippingCnt_Equal(unShippingCnt);
    }

    protected void doSetUnShippingCnt_Equal(Long unShippingCnt) {
        regUnShippingCnt(CK_EQ, unShippingCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_NotEqual(Long unShippingCnt) {
        doSetUnShippingCnt_NotEqual(unShippingCnt);
    }

    protected void doSetUnShippingCnt_NotEqual(Long unShippingCnt) {
        regUnShippingCnt(CK_NES, unShippingCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_GreaterThan(Long unShippingCnt) {
        regUnShippingCnt(CK_GT, unShippingCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_LessThan(Long unShippingCnt) {
        regUnShippingCnt(CK_LT, unShippingCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_GreaterEqual(Long unShippingCnt) {
        regUnShippingCnt(CK_GE, unShippingCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCnt The value of unShippingCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnShippingCnt_LessEqual(Long unShippingCnt) {
        regUnShippingCnt(CK_LE, unShippingCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param minNumber The min number of unShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnShippingCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnShippingCnt(), "UN_SHIPPING_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCntList The collection of unShippingCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnShippingCnt_InScope(Collection<Long> unShippingCntList) {
        doSetUnShippingCnt_InScope(unShippingCntList);
    }

    protected void doSetUnShippingCnt_InScope(Collection<Long> unShippingCntList) {
        regINS(CK_INS, cTL(unShippingCntList), xgetCValueUnShippingCnt(), "UN_SHIPPING_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     * @param unShippingCntList The collection of unShippingCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnShippingCnt_NotInScope(Collection<Long> unShippingCntList) {
        doSetUnShippingCnt_NotInScope(unShippingCntList);
    }

    protected void doSetUnShippingCnt_NotInScope(Collection<Long> unShippingCntList) {
        regINS(CK_NINS, cTL(unShippingCntList), xgetCValueUnShippingCnt(), "UN_SHIPPING_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setUnShippingCnt_IsNull() { regUnShippingCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setUnShippingCnt_IsNotNull() { regUnShippingCnt(CK_ISNN, DOBJ); }

    protected void regUnShippingCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnShippingCnt(), "UN_SHIPPING_CNT"); }
    protected abstract ConditionValue xgetCValueUnShippingCnt();

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
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_Equal(Long shShippingCnt) {
        doSetShShippingCnt_Equal(shShippingCnt);
    }

    protected void doSetShShippingCnt_Equal(Long shShippingCnt) {
        regShShippingCnt(CK_EQ, shShippingCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_NotEqual(Long shShippingCnt) {
        doSetShShippingCnt_NotEqual(shShippingCnt);
    }

    protected void doSetShShippingCnt_NotEqual(Long shShippingCnt) {
        regShShippingCnt(CK_NES, shShippingCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_GreaterThan(Long shShippingCnt) {
        regShShippingCnt(CK_GT, shShippingCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_LessThan(Long shShippingCnt) {
        regShShippingCnt(CK_LT, shShippingCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_GreaterEqual(Long shShippingCnt) {
        regShShippingCnt(CK_GE, shShippingCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCnt The value of shShippingCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShShippingCnt_LessEqual(Long shShippingCnt) {
        regShShippingCnt(CK_LE, shShippingCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param minNumber The min number of shShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShShippingCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShShippingCnt(), "SH_SHIPPING_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCntList The collection of shShippingCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShShippingCnt_InScope(Collection<Long> shShippingCntList) {
        doSetShShippingCnt_InScope(shShippingCntList);
    }

    protected void doSetShShippingCnt_InScope(Collection<Long> shShippingCntList) {
        regINS(CK_INS, cTL(shShippingCntList), xgetCValueShShippingCnt(), "SH_SHIPPING_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     * @param shShippingCntList The collection of shShippingCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShShippingCnt_NotInScope(Collection<Long> shShippingCntList) {
        doSetShShippingCnt_NotInScope(shShippingCntList);
    }

    protected void doSetShShippingCnt_NotInScope(Collection<Long> shShippingCntList) {
        regINS(CK_NINS, cTL(shShippingCntList), xgetCValueShShippingCnt(), "SH_SHIPPING_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setShShippingCnt_IsNull() { regShShippingCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setShShippingCnt_IsNotNull() { regShShippingCnt(CK_ISNN, DOBJ); }

    protected void regShShippingCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShShippingCnt(), "SH_SHIPPING_CNT"); }
    protected abstract ConditionValue xgetCValueShShippingCnt();

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
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_Equal(Long totalShippingCnt) {
        doSetTotalShippingCnt_Equal(totalShippingCnt);
    }

    protected void doSetTotalShippingCnt_Equal(Long totalShippingCnt) {
        regTotalShippingCnt(CK_EQ, totalShippingCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_NotEqual(Long totalShippingCnt) {
        doSetTotalShippingCnt_NotEqual(totalShippingCnt);
    }

    protected void doSetTotalShippingCnt_NotEqual(Long totalShippingCnt) {
        regTotalShippingCnt(CK_NES, totalShippingCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_GreaterThan(Long totalShippingCnt) {
        regTotalShippingCnt(CK_GT, totalShippingCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_LessThan(Long totalShippingCnt) {
        regTotalShippingCnt(CK_LT, totalShippingCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_GreaterEqual(Long totalShippingCnt) {
        regTotalShippingCnt(CK_GE, totalShippingCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCnt The value of totalShippingCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_LessEqual(Long totalShippingCnt) {
        regTotalShippingCnt(CK_LE, totalShippingCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param minNumber The min number of totalShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalShippingCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalShippingCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalShippingCnt(), "TOTAL_SHIPPING_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCntList The collection of totalShippingCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_InScope(Collection<Long> totalShippingCntList) {
        doSetTotalShippingCnt_InScope(totalShippingCntList);
    }

    protected void doSetTotalShippingCnt_InScope(Collection<Long> totalShippingCntList) {
        regINS(CK_INS, cTL(totalShippingCntList), xgetCValueTotalShippingCnt(), "TOTAL_SHIPPING_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     * @param totalShippingCntList The collection of totalShippingCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalShippingCnt_NotInScope(Collection<Long> totalShippingCntList) {
        doSetTotalShippingCnt_NotInScope(totalShippingCntList);
    }

    protected void doSetTotalShippingCnt_NotInScope(Collection<Long> totalShippingCntList) {
        regINS(CK_NINS, cTL(totalShippingCntList), xgetCValueTotalShippingCnt(), "TOTAL_SHIPPING_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setTotalShippingCnt_IsNull() { regTotalShippingCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_CNT: {BIGINT(19)}
     */
    public void setTotalShippingCnt_IsNotNull() { regTotalShippingCnt(CK_ISNN, DOBJ); }

    protected void regTotalShippingCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalShippingCnt(), "TOTAL_SHIPPING_CNT"); }
    protected abstract ConditionValue xgetCValueTotalShippingCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_Equal(Long totalShippingNum) {
        doSetTotalShippingNum_Equal(totalShippingNum);
    }

    protected void doSetTotalShippingNum_Equal(Long totalShippingNum) {
        regTotalShippingNum(CK_EQ, totalShippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_NotEqual(Long totalShippingNum) {
        doSetTotalShippingNum_NotEqual(totalShippingNum);
    }

    protected void doSetTotalShippingNum_NotEqual(Long totalShippingNum) {
        regTotalShippingNum(CK_NES, totalShippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_GreaterThan(Long totalShippingNum) {
        regTotalShippingNum(CK_GT, totalShippingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_LessThan(Long totalShippingNum) {
        regTotalShippingNum(CK_LT, totalShippingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_GreaterEqual(Long totalShippingNum) {
        regTotalShippingNum(CK_GE, totalShippingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNum The value of totalShippingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalShippingNum_LessEqual(Long totalShippingNum) {
        regTotalShippingNum(CK_LE, totalShippingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalShippingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalShippingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalShippingNum(), "TOTAL_SHIPPING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNumList The collection of totalShippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalShippingNum_InScope(Collection<Long> totalShippingNumList) {
        doSetTotalShippingNum_InScope(totalShippingNumList);
    }

    protected void doSetTotalShippingNum_InScope(Collection<Long> totalShippingNumList) {
        regINS(CK_INS, cTL(totalShippingNumList), xgetCValueTotalShippingNum(), "TOTAL_SHIPPING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     * @param totalShippingNumList The collection of totalShippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalShippingNum_NotInScope(Collection<Long> totalShippingNumList) {
        doSetTotalShippingNum_NotInScope(totalShippingNumList);
    }

    protected void doSetTotalShippingNum_NotInScope(Collection<Long> totalShippingNumList) {
        regINS(CK_NINS, cTL(totalShippingNumList), xgetCValueTotalShippingNum(), "TOTAL_SHIPPING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setTotalShippingNum_IsNull() { regTotalShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_SHIPPING_NUM: {BIGINT(19)}
     */
    public void setTotalShippingNum_IsNotNull() { regTotalShippingNum(CK_ISNN, DOBJ); }

    protected void regTotalShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalShippingNum(), "TOTAL_SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueTotalShippingNum();

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
    public HpSLCFunction<TBldl5625CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5625CB.class);
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
    public HpSLCFunction<TBldl5625CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5625CB.class);
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
    public HpSLCFunction<TBldl5625CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5625CB.class);
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
    public HpSLCFunction<TBldl5625CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5625CB.class);
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
    public HpSLCFunction<TBldl5625CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5625CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5625CB&gt;() {
     *     public void query(TBldl5625CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5625CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5625CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5625CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5625CQ sq);

    protected TBldl5625CB xcreateScalarConditionCB() {
        TBldl5625CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5625CB xcreateScalarConditionPartitionByCB() {
        TBldl5625CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5625CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5625CB cb = new TBldl5625CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5625_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5625CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5625CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5625CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5625CB cb = new TBldl5625CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5625_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5625CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5625CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5625CB cb = new TBldl5625CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5625CQ sq);

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
    protected TBldl5625CB newMyCB() {
        return new TBldl5625CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5625CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
