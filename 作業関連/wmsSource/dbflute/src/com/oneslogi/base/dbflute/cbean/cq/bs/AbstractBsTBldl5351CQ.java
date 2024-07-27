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
 * The abstract condition-query of t_bldl5351.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5351CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5351CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5351";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_Equal(Long bldl5351Id) {
        doSetBldl5351Id_Equal(bldl5351Id);
    }

    protected void doSetBldl5351Id_Equal(Long bldl5351Id) {
        regBldl5351Id(CK_EQ, bldl5351Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_NotEqual(Long bldl5351Id) {
        doSetBldl5351Id_NotEqual(bldl5351Id);
    }

    protected void doSetBldl5351Id_NotEqual(Long bldl5351Id) {
        regBldl5351Id(CK_NES, bldl5351Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_GreaterThan(Long bldl5351Id) {
        regBldl5351Id(CK_GT, bldl5351Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_LessThan(Long bldl5351Id) {
        regBldl5351Id(CK_LT, bldl5351Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_GreaterEqual(Long bldl5351Id) {
        regBldl5351Id(CK_GE, bldl5351Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351Id The value of bldl5351Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5351Id_LessEqual(Long bldl5351Id) {
        regBldl5351Id(CK_LE, bldl5351Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5351Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5351Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5351Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5351Id(), "BLDL5351_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351IdList The collection of bldl5351Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5351Id_InScope(Collection<Long> bldl5351IdList) {
        doSetBldl5351Id_InScope(bldl5351IdList);
    }

    protected void doSetBldl5351Id_InScope(Collection<Long> bldl5351IdList) {
        regINS(CK_INS, cTL(bldl5351IdList), xgetCValueBldl5351Id(), "BLDL5351_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5351IdList The collection of bldl5351Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5351Id_NotInScope(Collection<Long> bldl5351IdList) {
        doSetBldl5351Id_NotInScope(bldl5351IdList);
    }

    protected void doSetBldl5351Id_NotInScope(Collection<Long> bldl5351IdList) {
        regINS(CK_NINS, cTL(bldl5351IdList), xgetCValueBldl5351Id(), "BLDL5351_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5351Id_IsNull() { regBldl5351Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5351_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5351Id_IsNotNull() { regBldl5351Id(CK_ISNN, DOBJ); }

    protected void regBldl5351Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5351Id(), "BLDL5351_ID"); }
    protected abstract ConditionValue xgetCValueBldl5351Id();

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
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_Equal(String salesOrgCd) {
        doSetSalesOrgCd_Equal(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_Equal(String salesOrgCd) {
        regSalesOrgCd(CK_EQ, salesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotEqual(String salesOrgCd) {
        doSetSalesOrgCd_NotEqual(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_NotEqual(String salesOrgCd) {
        regSalesOrgCd(CK_NES, salesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_InScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        regINS(CK_INS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_NotInScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        regINS(CK_NINS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrgCd The value of salesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrgCd_LikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

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
     * DATE: {VARCHAR(30)}
     * @param date The value of date as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_Equal(String date) {
        doSetDate_Equal(fRES(date));
    }

    protected void doSetDate_Equal(String date) {
        regDate(CK_EQ, date);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_NotEqual(String date) {
        doSetDate_NotEqual(fRES(date));
    }

    protected void doSetDate_NotEqual(String date) {
        regDate(CK_NES, date);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_GreaterThan(String date) {
        regDate(CK_GT, fRES(date));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_LessThan(String date) {
        regDate(CK_LT, fRES(date));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_GreaterEqual(String date) {
        regDate(CK_GE, fRES(date));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_LessEqual(String date) {
        regDate(CK_LE, fRES(date));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param dateList The collection of date as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_InScope(Collection<String> dateList) {
        doSetDate_InScope(dateList);
    }

    protected void doSetDate_InScope(Collection<String> dateList) {
        regINS(CK_INS, cTL(dateList), xgetCValueDate(), "DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param dateList The collection of date as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_NotInScope(Collection<String> dateList) {
        doSetDate_NotInScope(dateList);
    }

    protected void doSetDate_NotInScope(Collection<String> dateList) {
        regINS(CK_NINS, cTL(dateList), xgetCValueDate(), "DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE: {VARCHAR(30)} <br>
     * <pre>e.g. setDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param date The value of date as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDate_LikeSearch(String date, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(date), xgetCValueDate(), "DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDate_NotLikeSearch(String date, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(date), xgetCValueDate(), "DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE: {VARCHAR(30)}
     * @param date The value of date as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDate_PrefixSearch(String date) {
        setDate_LikeSearch(date, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     */
    public void setDate_IsNull() { regDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     */
    public void setDate_IsNullOrEmpty() { regDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE: {VARCHAR(30)}
     */
    public void setDate_IsNotNull() { regDate(CK_ISNN, DOBJ); }

    protected void regDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDate(), "DATE"); }
    protected abstract ConditionValue xgetCValueDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_Equal(String holiday) {
        doSetHoliday_Equal(fRES(holiday));
    }

    protected void doSetHoliday_Equal(String holiday) {
        regHoliday(CK_EQ, holiday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_NotEqual(String holiday) {
        doSetHoliday_NotEqual(fRES(holiday));
    }

    protected void doSetHoliday_NotEqual(String holiday) {
        regHoliday(CK_NES, holiday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_GreaterThan(String holiday) {
        regHoliday(CK_GT, fRES(holiday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_LessThan(String holiday) {
        regHoliday(CK_LT, fRES(holiday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_GreaterEqual(String holiday) {
        regHoliday(CK_GE, fRES(holiday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_LessEqual(String holiday) {
        regHoliday(CK_LE, fRES(holiday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holidayList The collection of holiday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_InScope(Collection<String> holidayList) {
        doSetHoliday_InScope(holidayList);
    }

    protected void doSetHoliday_InScope(Collection<String> holidayList) {
        regINS(CK_INS, cTL(holidayList), xgetCValueHoliday(), "HOLIDAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holidayList The collection of holiday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_NotInScope(Collection<String> holidayList) {
        doSetHoliday_NotInScope(holidayList);
    }

    protected void doSetHoliday_NotInScope(Collection<String> holidayList) {
        regINS(CK_NINS, cTL(holidayList), xgetCValueHoliday(), "HOLIDAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY: {VARCHAR(30)} <br>
     * <pre>e.g. setHoliday_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param holiday The value of holiday as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHoliday_LikeSearch(String holiday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(holiday), xgetCValueHoliday(), "HOLIDAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHoliday_NotLikeSearch(String holiday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(holiday), xgetCValueHoliday(), "HOLIDAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     * @param holiday The value of holiday as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHoliday_PrefixSearch(String holiday) {
        setHoliday_LikeSearch(holiday, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     */
    public void setHoliday_IsNull() { regHoliday(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     */
    public void setHoliday_IsNullOrEmpty() { regHoliday(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HOLIDAY: {VARCHAR(30)}
     */
    public void setHoliday_IsNotNull() { regHoliday(CK_ISNN, DOBJ); }

    protected void regHoliday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHoliday(), "HOLIDAY"); }
    protected abstract ConditionValue xgetCValueHoliday();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_Equal(Long soukaFwNum) {
        doSetSoukaFwNum_Equal(soukaFwNum);
    }

    protected void doSetSoukaFwNum_Equal(Long soukaFwNum) {
        regSoukaFwNum(CK_EQ, soukaFwNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_NotEqual(Long soukaFwNum) {
        doSetSoukaFwNum_NotEqual(soukaFwNum);
    }

    protected void doSetSoukaFwNum_NotEqual(Long soukaFwNum) {
        regSoukaFwNum(CK_NES, soukaFwNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_GreaterThan(Long soukaFwNum) {
        regSoukaFwNum(CK_GT, soukaFwNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_LessThan(Long soukaFwNum) {
        regSoukaFwNum(CK_LT, soukaFwNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_GreaterEqual(Long soukaFwNum) {
        regSoukaFwNum(CK_GE, soukaFwNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNum The value of soukaFwNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaFwNum_LessEqual(Long soukaFwNum) {
        regSoukaFwNum(CK_LE, soukaFwNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param minNumber The min number of soukaFwNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soukaFwNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoukaFwNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoukaFwNum(), "SOUKA_FW_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNumList The collection of soukaFwNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaFwNum_InScope(Collection<Long> soukaFwNumList) {
        doSetSoukaFwNum_InScope(soukaFwNumList);
    }

    protected void doSetSoukaFwNum_InScope(Collection<Long> soukaFwNumList) {
        regINS(CK_INS, cTL(soukaFwNumList), xgetCValueSoukaFwNum(), "SOUKA_FW_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     * @param soukaFwNumList The collection of soukaFwNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaFwNum_NotInScope(Collection<Long> soukaFwNumList) {
        doSetSoukaFwNum_NotInScope(soukaFwNumList);
    }

    protected void doSetSoukaFwNum_NotInScope(Collection<Long> soukaFwNumList) {
        regINS(CK_NINS, cTL(soukaFwNumList), xgetCValueSoukaFwNum(), "SOUKA_FW_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     */
    public void setSoukaFwNum_IsNull() { regSoukaFwNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOUKA_FW_NUM: {BIGINT(19)}
     */
    public void setSoukaFwNum_IsNotNull() { regSoukaFwNum(CK_ISNN, DOBJ); }

    protected void regSoukaFwNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoukaFwNum(), "SOUKA_FW_NUM"); }
    protected abstract ConditionValue xgetCValueSoukaFwNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_Equal(Long soukaUnNum) {
        doSetSoukaUnNum_Equal(soukaUnNum);
    }

    protected void doSetSoukaUnNum_Equal(Long soukaUnNum) {
        regSoukaUnNum(CK_EQ, soukaUnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_NotEqual(Long soukaUnNum) {
        doSetSoukaUnNum_NotEqual(soukaUnNum);
    }

    protected void doSetSoukaUnNum_NotEqual(Long soukaUnNum) {
        regSoukaUnNum(CK_NES, soukaUnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_GreaterThan(Long soukaUnNum) {
        regSoukaUnNum(CK_GT, soukaUnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_LessThan(Long soukaUnNum) {
        regSoukaUnNum(CK_LT, soukaUnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_GreaterEqual(Long soukaUnNum) {
        regSoukaUnNum(CK_GE, soukaUnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNum The value of soukaUnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaUnNum_LessEqual(Long soukaUnNum) {
        regSoukaUnNum(CK_LE, soukaUnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param minNumber The min number of soukaUnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soukaUnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoukaUnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoukaUnNum(), "SOUKA_UN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNumList The collection of soukaUnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaUnNum_InScope(Collection<Long> soukaUnNumList) {
        doSetSoukaUnNum_InScope(soukaUnNumList);
    }

    protected void doSetSoukaUnNum_InScope(Collection<Long> soukaUnNumList) {
        regINS(CK_INS, cTL(soukaUnNumList), xgetCValueSoukaUnNum(), "SOUKA_UN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     * @param soukaUnNumList The collection of soukaUnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaUnNum_NotInScope(Collection<Long> soukaUnNumList) {
        doSetSoukaUnNum_NotInScope(soukaUnNumList);
    }

    protected void doSetSoukaUnNum_NotInScope(Collection<Long> soukaUnNumList) {
        regINS(CK_NINS, cTL(soukaUnNumList), xgetCValueSoukaUnNum(), "SOUKA_UN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     */
    public void setSoukaUnNum_IsNull() { regSoukaUnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOUKA_UN_NUM: {BIGINT(19)}
     */
    public void setSoukaUnNum_IsNotNull() { regSoukaUnNum(CK_ISNN, DOBJ); }

    protected void regSoukaUnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoukaUnNum(), "SOUKA_UN_NUM"); }
    protected abstract ConditionValue xgetCValueSoukaUnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_Equal(Long soukaShNum) {
        doSetSoukaShNum_Equal(soukaShNum);
    }

    protected void doSetSoukaShNum_Equal(Long soukaShNum) {
        regSoukaShNum(CK_EQ, soukaShNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_NotEqual(Long soukaShNum) {
        doSetSoukaShNum_NotEqual(soukaShNum);
    }

    protected void doSetSoukaShNum_NotEqual(Long soukaShNum) {
        regSoukaShNum(CK_NES, soukaShNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_GreaterThan(Long soukaShNum) {
        regSoukaShNum(CK_GT, soukaShNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_LessThan(Long soukaShNum) {
        regSoukaShNum(CK_LT, soukaShNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_GreaterEqual(Long soukaShNum) {
        regSoukaShNum(CK_GE, soukaShNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNum The value of soukaShNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaShNum_LessEqual(Long soukaShNum) {
        regSoukaShNum(CK_LE, soukaShNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param minNumber The min number of soukaShNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soukaShNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoukaShNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoukaShNum(), "SOUKA_SH_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNumList The collection of soukaShNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaShNum_InScope(Collection<Long> soukaShNumList) {
        doSetSoukaShNum_InScope(soukaShNumList);
    }

    protected void doSetSoukaShNum_InScope(Collection<Long> soukaShNumList) {
        regINS(CK_INS, cTL(soukaShNumList), xgetCValueSoukaShNum(), "SOUKA_SH_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     * @param soukaShNumList The collection of soukaShNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaShNum_NotInScope(Collection<Long> soukaShNumList) {
        doSetSoukaShNum_NotInScope(soukaShNumList);
    }

    protected void doSetSoukaShNum_NotInScope(Collection<Long> soukaShNumList) {
        regINS(CK_NINS, cTL(soukaShNumList), xgetCValueSoukaShNum(), "SOUKA_SH_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     */
    public void setSoukaShNum_IsNull() { regSoukaShNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOUKA_SH_NUM: {BIGINT(19)}
     */
    public void setSoukaShNum_IsNotNull() { regSoukaShNum(CK_ISNN, DOBJ); }

    protected void regSoukaShNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoukaShNum(), "SOUKA_SH_NUM"); }
    protected abstract ConditionValue xgetCValueSoukaShNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_Equal(Long soukaTotalNum) {
        doSetSoukaTotalNum_Equal(soukaTotalNum);
    }

    protected void doSetSoukaTotalNum_Equal(Long soukaTotalNum) {
        regSoukaTotalNum(CK_EQ, soukaTotalNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_NotEqual(Long soukaTotalNum) {
        doSetSoukaTotalNum_NotEqual(soukaTotalNum);
    }

    protected void doSetSoukaTotalNum_NotEqual(Long soukaTotalNum) {
        regSoukaTotalNum(CK_NES, soukaTotalNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_GreaterThan(Long soukaTotalNum) {
        regSoukaTotalNum(CK_GT, soukaTotalNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_LessThan(Long soukaTotalNum) {
        regSoukaTotalNum(CK_LT, soukaTotalNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_GreaterEqual(Long soukaTotalNum) {
        regSoukaTotalNum(CK_GE, soukaTotalNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNum The value of soukaTotalNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_LessEqual(Long soukaTotalNum) {
        regSoukaTotalNum(CK_LE, soukaTotalNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param minNumber The min number of soukaTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soukaTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoukaTotalNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoukaTotalNum(), "SOUKA_TOTAL_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNumList The collection of soukaTotalNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_InScope(Collection<Long> soukaTotalNumList) {
        doSetSoukaTotalNum_InScope(soukaTotalNumList);
    }

    protected void doSetSoukaTotalNum_InScope(Collection<Long> soukaTotalNumList) {
        regINS(CK_INS, cTL(soukaTotalNumList), xgetCValueSoukaTotalNum(), "SOUKA_TOTAL_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     * @param soukaTotalNumList The collection of soukaTotalNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoukaTotalNum_NotInScope(Collection<Long> soukaTotalNumList) {
        doSetSoukaTotalNum_NotInScope(soukaTotalNumList);
    }

    protected void doSetSoukaTotalNum_NotInScope(Collection<Long> soukaTotalNumList) {
        regINS(CK_NINS, cTL(soukaTotalNumList), xgetCValueSoukaTotalNum(), "SOUKA_TOTAL_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     */
    public void setSoukaTotalNum_IsNull() { regSoukaTotalNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOUKA_TOTAL_NUM: {BIGINT(19)}
     */
    public void setSoukaTotalNum_IsNotNull() { regSoukaTotalNum(CK_ISNN, DOBJ); }

    protected void regSoukaTotalNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoukaTotalNum(), "SOUKA_TOTAL_NUM"); }
    protected abstract ConditionValue xgetCValueSoukaTotalNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_Equal(Long koshigayaFwNum) {
        doSetKoshigayaFwNum_Equal(koshigayaFwNum);
    }

    protected void doSetKoshigayaFwNum_Equal(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_EQ, koshigayaFwNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_NotEqual(Long koshigayaFwNum) {
        doSetKoshigayaFwNum_NotEqual(koshigayaFwNum);
    }

    protected void doSetKoshigayaFwNum_NotEqual(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_NES, koshigayaFwNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_GreaterThan(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_GT, koshigayaFwNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_LessThan(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_LT, koshigayaFwNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_GreaterEqual(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_GE, koshigayaFwNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNum The value of koshigayaFwNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_LessEqual(Long koshigayaFwNum) {
        regKoshigayaFwNum(CK_LE, koshigayaFwNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param minNumber The min number of koshigayaFwNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koshigayaFwNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoshigayaFwNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoshigayaFwNum(), "KOSHIGAYA_FW_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNumList The collection of koshigayaFwNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_InScope(Collection<Long> koshigayaFwNumList) {
        doSetKoshigayaFwNum_InScope(koshigayaFwNumList);
    }

    protected void doSetKoshigayaFwNum_InScope(Collection<Long> koshigayaFwNumList) {
        regINS(CK_INS, cTL(koshigayaFwNumList), xgetCValueKoshigayaFwNum(), "KOSHIGAYA_FW_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     * @param koshigayaFwNumList The collection of koshigayaFwNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaFwNum_NotInScope(Collection<Long> koshigayaFwNumList) {
        doSetKoshigayaFwNum_NotInScope(koshigayaFwNumList);
    }

    protected void doSetKoshigayaFwNum_NotInScope(Collection<Long> koshigayaFwNumList) {
        regINS(CK_NINS, cTL(koshigayaFwNumList), xgetCValueKoshigayaFwNum(), "KOSHIGAYA_FW_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     */
    public void setKoshigayaFwNum_IsNull() { regKoshigayaFwNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_FW_NUM: {BIGINT(19)}
     */
    public void setKoshigayaFwNum_IsNotNull() { regKoshigayaFwNum(CK_ISNN, DOBJ); }

    protected void regKoshigayaFwNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoshigayaFwNum(), "KOSHIGAYA_FW_NUM"); }
    protected abstract ConditionValue xgetCValueKoshigayaFwNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_Equal(Long koshigayaUnNum) {
        doSetKoshigayaUnNum_Equal(koshigayaUnNum);
    }

    protected void doSetKoshigayaUnNum_Equal(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_EQ, koshigayaUnNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_NotEqual(Long koshigayaUnNum) {
        doSetKoshigayaUnNum_NotEqual(koshigayaUnNum);
    }

    protected void doSetKoshigayaUnNum_NotEqual(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_NES, koshigayaUnNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_GreaterThan(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_GT, koshigayaUnNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_LessThan(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_LT, koshigayaUnNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_GreaterEqual(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_GE, koshigayaUnNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNum The value of koshigayaUnNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_LessEqual(Long koshigayaUnNum) {
        regKoshigayaUnNum(CK_LE, koshigayaUnNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param minNumber The min number of koshigayaUnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koshigayaUnNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoshigayaUnNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoshigayaUnNum(), "KOSHIGAYA_UN_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNumList The collection of koshigayaUnNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_InScope(Collection<Long> koshigayaUnNumList) {
        doSetKoshigayaUnNum_InScope(koshigayaUnNumList);
    }

    protected void doSetKoshigayaUnNum_InScope(Collection<Long> koshigayaUnNumList) {
        regINS(CK_INS, cTL(koshigayaUnNumList), xgetCValueKoshigayaUnNum(), "KOSHIGAYA_UN_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     * @param koshigayaUnNumList The collection of koshigayaUnNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaUnNum_NotInScope(Collection<Long> koshigayaUnNumList) {
        doSetKoshigayaUnNum_NotInScope(koshigayaUnNumList);
    }

    protected void doSetKoshigayaUnNum_NotInScope(Collection<Long> koshigayaUnNumList) {
        regINS(CK_NINS, cTL(koshigayaUnNumList), xgetCValueKoshigayaUnNum(), "KOSHIGAYA_UN_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     */
    public void setKoshigayaUnNum_IsNull() { regKoshigayaUnNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_UN_NUM: {BIGINT(19)}
     */
    public void setKoshigayaUnNum_IsNotNull() { regKoshigayaUnNum(CK_ISNN, DOBJ); }

    protected void regKoshigayaUnNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoshigayaUnNum(), "KOSHIGAYA_UN_NUM"); }
    protected abstract ConditionValue xgetCValueKoshigayaUnNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_Equal(Long koshigayaShNum) {
        doSetKoshigayaShNum_Equal(koshigayaShNum);
    }

    protected void doSetKoshigayaShNum_Equal(Long koshigayaShNum) {
        regKoshigayaShNum(CK_EQ, koshigayaShNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_NotEqual(Long koshigayaShNum) {
        doSetKoshigayaShNum_NotEqual(koshigayaShNum);
    }

    protected void doSetKoshigayaShNum_NotEqual(Long koshigayaShNum) {
        regKoshigayaShNum(CK_NES, koshigayaShNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_GreaterThan(Long koshigayaShNum) {
        regKoshigayaShNum(CK_GT, koshigayaShNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_LessThan(Long koshigayaShNum) {
        regKoshigayaShNum(CK_LT, koshigayaShNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_GreaterEqual(Long koshigayaShNum) {
        regKoshigayaShNum(CK_GE, koshigayaShNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNum The value of koshigayaShNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_LessEqual(Long koshigayaShNum) {
        regKoshigayaShNum(CK_LE, koshigayaShNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param minNumber The min number of koshigayaShNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koshigayaShNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoshigayaShNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoshigayaShNum(), "KOSHIGAYA_SH_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNumList The collection of koshigayaShNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_InScope(Collection<Long> koshigayaShNumList) {
        doSetKoshigayaShNum_InScope(koshigayaShNumList);
    }

    protected void doSetKoshigayaShNum_InScope(Collection<Long> koshigayaShNumList) {
        regINS(CK_INS, cTL(koshigayaShNumList), xgetCValueKoshigayaShNum(), "KOSHIGAYA_SH_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     * @param koshigayaShNumList The collection of koshigayaShNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaShNum_NotInScope(Collection<Long> koshigayaShNumList) {
        doSetKoshigayaShNum_NotInScope(koshigayaShNumList);
    }

    protected void doSetKoshigayaShNum_NotInScope(Collection<Long> koshigayaShNumList) {
        regINS(CK_NINS, cTL(koshigayaShNumList), xgetCValueKoshigayaShNum(), "KOSHIGAYA_SH_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     */
    public void setKoshigayaShNum_IsNull() { regKoshigayaShNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_SH_NUM: {BIGINT(19)}
     */
    public void setKoshigayaShNum_IsNotNull() { regKoshigayaShNum(CK_ISNN, DOBJ); }

    protected void regKoshigayaShNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoshigayaShNum(), "KOSHIGAYA_SH_NUM"); }
    protected abstract ConditionValue xgetCValueKoshigayaShNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_Equal(Long koshigayaTotalNum) {
        doSetKoshigayaTotalNum_Equal(koshigayaTotalNum);
    }

    protected void doSetKoshigayaTotalNum_Equal(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_EQ, koshigayaTotalNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_NotEqual(Long koshigayaTotalNum) {
        doSetKoshigayaTotalNum_NotEqual(koshigayaTotalNum);
    }

    protected void doSetKoshigayaTotalNum_NotEqual(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_NES, koshigayaTotalNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_GreaterThan(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_GT, koshigayaTotalNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_LessThan(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_LT, koshigayaTotalNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_GreaterEqual(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_GE, koshigayaTotalNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNum The value of koshigayaTotalNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_LessEqual(Long koshigayaTotalNum) {
        regKoshigayaTotalNum(CK_LE, koshigayaTotalNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param minNumber The min number of koshigayaTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koshigayaTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoshigayaTotalNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoshigayaTotalNum(), "KOSHIGAYA_TOTAL_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNumList The collection of koshigayaTotalNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_InScope(Collection<Long> koshigayaTotalNumList) {
        doSetKoshigayaTotalNum_InScope(koshigayaTotalNumList);
    }

    protected void doSetKoshigayaTotalNum_InScope(Collection<Long> koshigayaTotalNumList) {
        regINS(CK_INS, cTL(koshigayaTotalNumList), xgetCValueKoshigayaTotalNum(), "KOSHIGAYA_TOTAL_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     * @param koshigayaTotalNumList The collection of koshigayaTotalNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaTotalNum_NotInScope(Collection<Long> koshigayaTotalNumList) {
        doSetKoshigayaTotalNum_NotInScope(koshigayaTotalNumList);
    }

    protected void doSetKoshigayaTotalNum_NotInScope(Collection<Long> koshigayaTotalNumList) {
        regINS(CK_NINS, cTL(koshigayaTotalNumList), xgetCValueKoshigayaTotalNum(), "KOSHIGAYA_TOTAL_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     */
    public void setKoshigayaTotalNum_IsNull() { regKoshigayaTotalNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_TOTAL_NUM: {BIGINT(19)}
     */
    public void setKoshigayaTotalNum_IsNotNull() { regKoshigayaTotalNum(CK_ISNN, DOBJ); }

    protected void regKoshigayaTotalNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoshigayaTotalNum(), "KOSHIGAYA_TOTAL_NUM"); }
    protected abstract ConditionValue xgetCValueKoshigayaTotalNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_Equal(Long otherTotalNum) {
        doSetOtherTotalNum_Equal(otherTotalNum);
    }

    protected void doSetOtherTotalNum_Equal(Long otherTotalNum) {
        regOtherTotalNum(CK_EQ, otherTotalNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_NotEqual(Long otherTotalNum) {
        doSetOtherTotalNum_NotEqual(otherTotalNum);
    }

    protected void doSetOtherTotalNum_NotEqual(Long otherTotalNum) {
        regOtherTotalNum(CK_NES, otherTotalNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_GreaterThan(Long otherTotalNum) {
        regOtherTotalNum(CK_GT, otherTotalNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_LessThan(Long otherTotalNum) {
        regOtherTotalNum(CK_LT, otherTotalNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_GreaterEqual(Long otherTotalNum) {
        regOtherTotalNum(CK_GE, otherTotalNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNum The value of otherTotalNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherTotalNum_LessEqual(Long otherTotalNum) {
        regOtherTotalNum(CK_LE, otherTotalNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param minNumber The min number of otherTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherTotalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherTotalNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherTotalNum(), "OTHER_TOTAL_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNumList The collection of otherTotalNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherTotalNum_InScope(Collection<Long> otherTotalNumList) {
        doSetOtherTotalNum_InScope(otherTotalNumList);
    }

    protected void doSetOtherTotalNum_InScope(Collection<Long> otherTotalNumList) {
        regINS(CK_INS, cTL(otherTotalNumList), xgetCValueOtherTotalNum(), "OTHER_TOTAL_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     * @param otherTotalNumList The collection of otherTotalNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherTotalNum_NotInScope(Collection<Long> otherTotalNumList) {
        doSetOtherTotalNum_NotInScope(otherTotalNumList);
    }

    protected void doSetOtherTotalNum_NotInScope(Collection<Long> otherTotalNumList) {
        regINS(CK_NINS, cTL(otherTotalNumList), xgetCValueOtherTotalNum(), "OTHER_TOTAL_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     */
    public void setOtherTotalNum_IsNull() { regOtherTotalNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER_TOTAL_NUM: {BIGINT(19)}
     */
    public void setOtherTotalNum_IsNotNull() { regOtherTotalNum(CK_ISNN, DOBJ); }

    protected void regOtherTotalNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherTotalNum(), "OTHER_TOTAL_NUM"); }
    protected abstract ConditionValue xgetCValueOtherTotalNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_Equal(Long totalNum) {
        doSetTotalNum_Equal(totalNum);
    }

    protected void doSetTotalNum_Equal(Long totalNum) {
        regTotalNum(CK_EQ, totalNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_NotEqual(Long totalNum) {
        doSetTotalNum_NotEqual(totalNum);
    }

    protected void doSetTotalNum_NotEqual(Long totalNum) {
        regTotalNum(CK_NES, totalNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_GreaterThan(Long totalNum) {
        regTotalNum(CK_GT, totalNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_LessThan(Long totalNum) {
        regTotalNum(CK_LT, totalNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_GreaterEqual(Long totalNum) {
        regTotalNum(CK_GE, totalNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNum The value of totalNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalNum_LessEqual(Long totalNum) {
        regTotalNum(CK_LE, totalNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param minNumber The min number of totalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalNum(), "TOTAL_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNumList The collection of totalNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalNum_InScope(Collection<Long> totalNumList) {
        doSetTotalNum_InScope(totalNumList);
    }

    protected void doSetTotalNum_InScope(Collection<Long> totalNumList) {
        regINS(CK_INS, cTL(totalNumList), xgetCValueTotalNum(), "TOTAL_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     * @param totalNumList The collection of totalNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalNum_NotInScope(Collection<Long> totalNumList) {
        doSetTotalNum_NotInScope(totalNumList);
    }

    protected void doSetTotalNum_NotInScope(Collection<Long> totalNumList) {
        regINS(CK_NINS, cTL(totalNumList), xgetCValueTotalNum(), "TOTAL_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     */
    public void setTotalNum_IsNull() { regTotalNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_NUM: {BIGINT(19)}
     */
    public void setTotalNum_IsNotNull() { regTotalNum(CK_ISNN, DOBJ); }

    protected void regTotalNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalNum(), "TOTAL_NUM"); }
    protected abstract ConditionValue xgetCValueTotalNum();

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
    public HpSLCFunction<TBldl5351CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5351CB.class);
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
    public HpSLCFunction<TBldl5351CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5351CB.class);
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
    public HpSLCFunction<TBldl5351CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5351CB.class);
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
    public HpSLCFunction<TBldl5351CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5351CB.class);
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
    public HpSLCFunction<TBldl5351CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5351CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5351CB&gt;() {
     *     public void query(TBldl5351CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5351CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5351CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5351CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5351CQ sq);

    protected TBldl5351CB xcreateScalarConditionCB() {
        TBldl5351CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5351CB xcreateScalarConditionPartitionByCB() {
        TBldl5351CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5351CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5351CB cb = new TBldl5351CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5351_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5351CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5351CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5351CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5351CB cb = new TBldl5351CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5351_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5351CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5351CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5351CB cb = new TBldl5351CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5351CQ sq);

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
    protected TBldl5351CB newMyCB() {
        return new TBldl5351CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5351CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
