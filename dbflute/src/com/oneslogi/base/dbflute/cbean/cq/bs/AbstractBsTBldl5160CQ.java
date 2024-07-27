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
 * The abstract condition-query of t_bldl5160.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5160CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5160CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5160";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_Equal(Long bldl5160Id) {
        doSetBldl5160Id_Equal(bldl5160Id);
    }

    protected void doSetBldl5160Id_Equal(Long bldl5160Id) {
        regBldl5160Id(CK_EQ, bldl5160Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_NotEqual(Long bldl5160Id) {
        doSetBldl5160Id_NotEqual(bldl5160Id);
    }

    protected void doSetBldl5160Id_NotEqual(Long bldl5160Id) {
        regBldl5160Id(CK_NES, bldl5160Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_GreaterThan(Long bldl5160Id) {
        regBldl5160Id(CK_GT, bldl5160Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_LessThan(Long bldl5160Id) {
        regBldl5160Id(CK_LT, bldl5160Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_GreaterEqual(Long bldl5160Id) {
        regBldl5160Id(CK_GE, bldl5160Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160Id The value of bldl5160Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5160Id_LessEqual(Long bldl5160Id) {
        regBldl5160Id(CK_LE, bldl5160Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5160Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5160Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5160Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5160Id(), "BLDL5160_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160IdList The collection of bldl5160Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5160Id_InScope(Collection<Long> bldl5160IdList) {
        doSetBldl5160Id_InScope(bldl5160IdList);
    }

    protected void doSetBldl5160Id_InScope(Collection<Long> bldl5160IdList) {
        regINS(CK_INS, cTL(bldl5160IdList), xgetCValueBldl5160Id(), "BLDL5160_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5160IdList The collection of bldl5160Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5160Id_NotInScope(Collection<Long> bldl5160IdList) {
        doSetBldl5160Id_NotInScope(bldl5160IdList);
    }

    protected void doSetBldl5160Id_NotInScope(Collection<Long> bldl5160IdList) {
        regINS(CK_NINS, cTL(bldl5160IdList), xgetCValueBldl5160Id(), "BLDL5160_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5160Id_IsNull() { regBldl5160Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5160_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5160Id_IsNotNull() { regBldl5160Id(CK_ISNN, DOBJ); }

    protected void regBldl5160Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5160Id(), "BLDL5160_ID"); }
    protected abstract ConditionValue xgetCValueBldl5160Id();

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
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_Equal(Long fwReceiveCnt) {
        doSetFwReceiveCnt_Equal(fwReceiveCnt);
    }

    protected void doSetFwReceiveCnt_Equal(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_EQ, fwReceiveCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_NotEqual(Long fwReceiveCnt) {
        doSetFwReceiveCnt_NotEqual(fwReceiveCnt);
    }

    protected void doSetFwReceiveCnt_NotEqual(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_NES, fwReceiveCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_GreaterThan(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_GT, fwReceiveCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_LessThan(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_LT, fwReceiveCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_GreaterEqual(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_GE, fwReceiveCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCnt The value of fwReceiveCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_LessEqual(Long fwReceiveCnt) {
        regFwReceiveCnt(CK_LE, fwReceiveCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param minNumber The min number of fwReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwReceiveCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwReceiveCnt(), "FW_RECEIVE_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCntList The collection of fwReceiveCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_InScope(Collection<Long> fwReceiveCntList) {
        doSetFwReceiveCnt_InScope(fwReceiveCntList);
    }

    protected void doSetFwReceiveCnt_InScope(Collection<Long> fwReceiveCntList) {
        regINS(CK_INS, cTL(fwReceiveCntList), xgetCValueFwReceiveCnt(), "FW_RECEIVE_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     * @param fwReceiveCntList The collection of fwReceiveCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReceiveCnt_NotInScope(Collection<Long> fwReceiveCntList) {
        doSetFwReceiveCnt_NotInScope(fwReceiveCntList);
    }

    protected void doSetFwReceiveCnt_NotInScope(Collection<Long> fwReceiveCntList) {
        regINS(CK_NINS, cTL(fwReceiveCntList), xgetCValueFwReceiveCnt(), "FW_RECEIVE_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setFwReceiveCnt_IsNull() { regFwReceiveCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setFwReceiveCnt_IsNotNull() { regFwReceiveCnt(CK_ISNN, DOBJ); }

    protected void regFwReceiveCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwReceiveCnt(), "FW_RECEIVE_CNT"); }
    protected abstract ConditionValue xgetCValueFwReceiveCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_Equal(Long fwReceiveNum) {
        doSetFwReceiveNum_Equal(fwReceiveNum);
    }

    protected void doSetFwReceiveNum_Equal(Long fwReceiveNum) {
        regFwReceiveNum(CK_EQ, fwReceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_NotEqual(Long fwReceiveNum) {
        doSetFwReceiveNum_NotEqual(fwReceiveNum);
    }

    protected void doSetFwReceiveNum_NotEqual(Long fwReceiveNum) {
        regFwReceiveNum(CK_NES, fwReceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_GreaterThan(Long fwReceiveNum) {
        regFwReceiveNum(CK_GT, fwReceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_LessThan(Long fwReceiveNum) {
        regFwReceiveNum(CK_LT, fwReceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_GreaterEqual(Long fwReceiveNum) {
        regFwReceiveNum(CK_GE, fwReceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNum The value of fwReceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFwReceiveNum_LessEqual(Long fwReceiveNum) {
        regFwReceiveNum(CK_LE, fwReceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param minNumber The min number of fwReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fwReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFwReceiveNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFwReceiveNum(), "FW_RECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNumList The collection of fwReceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReceiveNum_InScope(Collection<Long> fwReceiveNumList) {
        doSetFwReceiveNum_InScope(fwReceiveNumList);
    }

    protected void doSetFwReceiveNum_InScope(Collection<Long> fwReceiveNumList) {
        regINS(CK_INS, cTL(fwReceiveNumList), xgetCValueFwReceiveNum(), "FW_RECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     * @param fwReceiveNumList The collection of fwReceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFwReceiveNum_NotInScope(Collection<Long> fwReceiveNumList) {
        doSetFwReceiveNum_NotInScope(fwReceiveNumList);
    }

    protected void doSetFwReceiveNum_NotInScope(Collection<Long> fwReceiveNumList) {
        regINS(CK_NINS, cTL(fwReceiveNumList), xgetCValueFwReceiveNum(), "FW_RECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setFwReceiveNum_IsNull() { regFwReceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FW_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setFwReceiveNum_IsNotNull() { regFwReceiveNum(CK_ISNN, DOBJ); }

    protected void regFwReceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFwReceiveNum(), "FW_RECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueFwReceiveNum();

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
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_Equal(Long unReceiveCnt) {
        doSetUnReceiveCnt_Equal(unReceiveCnt);
    }

    protected void doSetUnReceiveCnt_Equal(Long unReceiveCnt) {
        regUnReceiveCnt(CK_EQ, unReceiveCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_NotEqual(Long unReceiveCnt) {
        doSetUnReceiveCnt_NotEqual(unReceiveCnt);
    }

    protected void doSetUnReceiveCnt_NotEqual(Long unReceiveCnt) {
        regUnReceiveCnt(CK_NES, unReceiveCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_GreaterThan(Long unReceiveCnt) {
        regUnReceiveCnt(CK_GT, unReceiveCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_LessThan(Long unReceiveCnt) {
        regUnReceiveCnt(CK_LT, unReceiveCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_GreaterEqual(Long unReceiveCnt) {
        regUnReceiveCnt(CK_GE, unReceiveCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCnt The value of unReceiveCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_LessEqual(Long unReceiveCnt) {
        regUnReceiveCnt(CK_LE, unReceiveCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param minNumber The min number of unReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnReceiveCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnReceiveCnt(), "UN_RECEIVE_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCntList The collection of unReceiveCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_InScope(Collection<Long> unReceiveCntList) {
        doSetUnReceiveCnt_InScope(unReceiveCntList);
    }

    protected void doSetUnReceiveCnt_InScope(Collection<Long> unReceiveCntList) {
        regINS(CK_INS, cTL(unReceiveCntList), xgetCValueUnReceiveCnt(), "UN_RECEIVE_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     * @param unReceiveCntList The collection of unReceiveCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReceiveCnt_NotInScope(Collection<Long> unReceiveCntList) {
        doSetUnReceiveCnt_NotInScope(unReceiveCntList);
    }

    protected void doSetUnReceiveCnt_NotInScope(Collection<Long> unReceiveCntList) {
        regINS(CK_NINS, cTL(unReceiveCntList), xgetCValueUnReceiveCnt(), "UN_RECEIVE_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setUnReceiveCnt_IsNull() { regUnReceiveCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setUnReceiveCnt_IsNotNull() { regUnReceiveCnt(CK_ISNN, DOBJ); }

    protected void regUnReceiveCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnReceiveCnt(), "UN_RECEIVE_CNT"); }
    protected abstract ConditionValue xgetCValueUnReceiveCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_Equal(Long unReceiveNum) {
        doSetUnReceiveNum_Equal(unReceiveNum);
    }

    protected void doSetUnReceiveNum_Equal(Long unReceiveNum) {
        regUnReceiveNum(CK_EQ, unReceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_NotEqual(Long unReceiveNum) {
        doSetUnReceiveNum_NotEqual(unReceiveNum);
    }

    protected void doSetUnReceiveNum_NotEqual(Long unReceiveNum) {
        regUnReceiveNum(CK_NES, unReceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_GreaterThan(Long unReceiveNum) {
        regUnReceiveNum(CK_GT, unReceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_LessThan(Long unReceiveNum) {
        regUnReceiveNum(CK_LT, unReceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_GreaterEqual(Long unReceiveNum) {
        regUnReceiveNum(CK_GE, unReceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNum The value of unReceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUnReceiveNum_LessEqual(Long unReceiveNum) {
        regUnReceiveNum(CK_LE, unReceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param minNumber The min number of unReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of unReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUnReceiveNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUnReceiveNum(), "UN_RECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNumList The collection of unReceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReceiveNum_InScope(Collection<Long> unReceiveNumList) {
        doSetUnReceiveNum_InScope(unReceiveNumList);
    }

    protected void doSetUnReceiveNum_InScope(Collection<Long> unReceiveNumList) {
        regINS(CK_INS, cTL(unReceiveNumList), xgetCValueUnReceiveNum(), "UN_RECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     * @param unReceiveNumList The collection of unReceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnReceiveNum_NotInScope(Collection<Long> unReceiveNumList) {
        doSetUnReceiveNum_NotInScope(unReceiveNumList);
    }

    protected void doSetUnReceiveNum_NotInScope(Collection<Long> unReceiveNumList) {
        regINS(CK_NINS, cTL(unReceiveNumList), xgetCValueUnReceiveNum(), "UN_RECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setUnReceiveNum_IsNull() { regUnReceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UN_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setUnReceiveNum_IsNotNull() { regUnReceiveNum(CK_ISNN, DOBJ); }

    protected void regUnReceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnReceiveNum(), "UN_RECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueUnReceiveNum();

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
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_Equal(Long shReceiveCnt) {
        doSetShReceiveCnt_Equal(shReceiveCnt);
    }

    protected void doSetShReceiveCnt_Equal(Long shReceiveCnt) {
        regShReceiveCnt(CK_EQ, shReceiveCnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_NotEqual(Long shReceiveCnt) {
        doSetShReceiveCnt_NotEqual(shReceiveCnt);
    }

    protected void doSetShReceiveCnt_NotEqual(Long shReceiveCnt) {
        regShReceiveCnt(CK_NES, shReceiveCnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_GreaterThan(Long shReceiveCnt) {
        regShReceiveCnt(CK_GT, shReceiveCnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_LessThan(Long shReceiveCnt) {
        regShReceiveCnt(CK_LT, shReceiveCnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_GreaterEqual(Long shReceiveCnt) {
        regShReceiveCnt(CK_GE, shReceiveCnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCnt The value of shReceiveCnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveCnt_LessEqual(Long shReceiveCnt) {
        regShReceiveCnt(CK_LE, shReceiveCnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param minNumber The min number of shReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shReceiveCnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShReceiveCnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShReceiveCnt(), "SH_RECEIVE_CNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCntList The collection of shReceiveCnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReceiveCnt_InScope(Collection<Long> shReceiveCntList) {
        doSetShReceiveCnt_InScope(shReceiveCntList);
    }

    protected void doSetShReceiveCnt_InScope(Collection<Long> shReceiveCntList) {
        regINS(CK_INS, cTL(shReceiveCntList), xgetCValueShReceiveCnt(), "SH_RECEIVE_CNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     * @param shReceiveCntList The collection of shReceiveCnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReceiveCnt_NotInScope(Collection<Long> shReceiveCntList) {
        doSetShReceiveCnt_NotInScope(shReceiveCntList);
    }

    protected void doSetShReceiveCnt_NotInScope(Collection<Long> shReceiveCntList) {
        regINS(CK_NINS, cTL(shReceiveCntList), xgetCValueShReceiveCnt(), "SH_RECEIVE_CNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setShReceiveCnt_IsNull() { regShReceiveCnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RECEIVE_CNT: {BIGINT(19)}
     */
    public void setShReceiveCnt_IsNotNull() { regShReceiveCnt(CK_ISNN, DOBJ); }

    protected void regShReceiveCnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShReceiveCnt(), "SH_RECEIVE_CNT"); }
    protected abstract ConditionValue xgetCValueShReceiveCnt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_Equal(Long shReceiveNum) {
        doSetShReceiveNum_Equal(shReceiveNum);
    }

    protected void doSetShReceiveNum_Equal(Long shReceiveNum) {
        regShReceiveNum(CK_EQ, shReceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_NotEqual(Long shReceiveNum) {
        doSetShReceiveNum_NotEqual(shReceiveNum);
    }

    protected void doSetShReceiveNum_NotEqual(Long shReceiveNum) {
        regShReceiveNum(CK_NES, shReceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_GreaterThan(Long shReceiveNum) {
        regShReceiveNum(CK_GT, shReceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_LessThan(Long shReceiveNum) {
        regShReceiveNum(CK_LT, shReceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_GreaterEqual(Long shReceiveNum) {
        regShReceiveNum(CK_GE, shReceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNum The value of shReceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShReceiveNum_LessEqual(Long shReceiveNum) {
        regShReceiveNum(CK_LE, shReceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param minNumber The min number of shReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShReceiveNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShReceiveNum(), "SH_RECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNumList The collection of shReceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReceiveNum_InScope(Collection<Long> shReceiveNumList) {
        doSetShReceiveNum_InScope(shReceiveNumList);
    }

    protected void doSetShReceiveNum_InScope(Collection<Long> shReceiveNumList) {
        regINS(CK_INS, cTL(shReceiveNumList), xgetCValueShReceiveNum(), "SH_RECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     * @param shReceiveNumList The collection of shReceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShReceiveNum_NotInScope(Collection<Long> shReceiveNumList) {
        doSetShReceiveNum_NotInScope(shReceiveNumList);
    }

    protected void doSetShReceiveNum_NotInScope(Collection<Long> shReceiveNumList) {
        regINS(CK_NINS, cTL(shReceiveNumList), xgetCValueShReceiveNum(), "SH_RECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setShReceiveNum_IsNull() { regShReceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SH_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setShReceiveNum_IsNotNull() { regShReceiveNum(CK_ISNN, DOBJ); }

    protected void regShReceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShReceiveNum(), "SH_RECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueShReceiveNum();

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
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_Equal(Long totalReceiveNum) {
        doSetTotalReceiveNum_Equal(totalReceiveNum);
    }

    protected void doSetTotalReceiveNum_Equal(Long totalReceiveNum) {
        regTotalReceiveNum(CK_EQ, totalReceiveNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_NotEqual(Long totalReceiveNum) {
        doSetTotalReceiveNum_NotEqual(totalReceiveNum);
    }

    protected void doSetTotalReceiveNum_NotEqual(Long totalReceiveNum) {
        regTotalReceiveNum(CK_NES, totalReceiveNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_GreaterThan(Long totalReceiveNum) {
        regTotalReceiveNum(CK_GT, totalReceiveNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_LessThan(Long totalReceiveNum) {
        regTotalReceiveNum(CK_LT, totalReceiveNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_GreaterEqual(Long totalReceiveNum) {
        regTotalReceiveNum(CK_GE, totalReceiveNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNum The value of totalReceiveNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_LessEqual(Long totalReceiveNum) {
        regTotalReceiveNum(CK_LE, totalReceiveNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalReceiveNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalReceiveNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalReceiveNum(), "TOTAL_RECEIVE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNumList The collection of totalReceiveNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_InScope(Collection<Long> totalReceiveNumList) {
        doSetTotalReceiveNum_InScope(totalReceiveNumList);
    }

    protected void doSetTotalReceiveNum_InScope(Collection<Long> totalReceiveNumList) {
        regINS(CK_INS, cTL(totalReceiveNumList), xgetCValueTotalReceiveNum(), "TOTAL_RECEIVE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     * @param totalReceiveNumList The collection of totalReceiveNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalReceiveNum_NotInScope(Collection<Long> totalReceiveNumList) {
        doSetTotalReceiveNum_NotInScope(totalReceiveNumList);
    }

    protected void doSetTotalReceiveNum_NotInScope(Collection<Long> totalReceiveNumList) {
        regINS(CK_NINS, cTL(totalReceiveNumList), xgetCValueTotalReceiveNum(), "TOTAL_RECEIVE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setTotalReceiveNum_IsNull() { regTotalReceiveNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_RECEIVE_NUM: {BIGINT(19)}
     */
    public void setTotalReceiveNum_IsNotNull() { regTotalReceiveNum(CK_ISNN, DOBJ); }

    protected void regTotalReceiveNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalReceiveNum(), "TOTAL_RECEIVE_NUM"); }
    protected abstract ConditionValue xgetCValueTotalReceiveNum();

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
    public HpSLCFunction<TBldl5160CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5160CB.class);
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
    public HpSLCFunction<TBldl5160CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5160CB.class);
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
    public HpSLCFunction<TBldl5160CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5160CB.class);
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
    public HpSLCFunction<TBldl5160CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5160CB.class);
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
    public HpSLCFunction<TBldl5160CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5160CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5160CB&gt;() {
     *     public void query(TBldl5160CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5160CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5160CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5160CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5160CQ sq);

    protected TBldl5160CB xcreateScalarConditionCB() {
        TBldl5160CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5160CB xcreateScalarConditionPartitionByCB() {
        TBldl5160CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5160CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5160CB cb = new TBldl5160CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5160_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5160CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5160CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5160CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5160CB cb = new TBldl5160CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5160_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5160CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5160CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5160CB cb = new TBldl5160CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5160CQ sq);

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
    protected TBldl5160CB newMyCB() {
        return new TBldl5160CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5160CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
