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
 * The abstract condition-query of t_bldl5630.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBldl5630CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBldl5630CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_bldl5630";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_Equal(Long bldl5630Id) {
        doSetBldl5630Id_Equal(bldl5630Id);
    }

    protected void doSetBldl5630Id_Equal(Long bldl5630Id) {
        regBldl5630Id(CK_EQ, bldl5630Id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_NotEqual(Long bldl5630Id) {
        doSetBldl5630Id_NotEqual(bldl5630Id);
    }

    protected void doSetBldl5630Id_NotEqual(Long bldl5630Id) {
        regBldl5630Id(CK_NES, bldl5630Id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_GreaterThan(Long bldl5630Id) {
        regBldl5630Id(CK_GT, bldl5630Id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_LessThan(Long bldl5630Id) {
        regBldl5630Id(CK_LT, bldl5630Id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_GreaterEqual(Long bldl5630Id) {
        regBldl5630Id(CK_GE, bldl5630Id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630Id The value of bldl5630Id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBldl5630Id_LessEqual(Long bldl5630Id) {
        regBldl5630Id(CK_LE, bldl5630Id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of bldl5630Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bldl5630Id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBldl5630Id_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBldl5630Id(), "BLDL5630_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630IdList The collection of bldl5630Id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5630Id_InScope(Collection<Long> bldl5630IdList) {
        doSetBldl5630Id_InScope(bldl5630IdList);
    }

    protected void doSetBldl5630Id_InScope(Collection<Long> bldl5630IdList) {
        regINS(CK_INS, cTL(bldl5630IdList), xgetCValueBldl5630Id(), "BLDL5630_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param bldl5630IdList The collection of bldl5630Id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBldl5630Id_NotInScope(Collection<Long> bldl5630IdList) {
        doSetBldl5630Id_NotInScope(bldl5630IdList);
    }

    protected void doSetBldl5630Id_NotInScope(Collection<Long> bldl5630IdList) {
        regINS(CK_NINS, cTL(bldl5630IdList), xgetCValueBldl5630Id(), "BLDL5630_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5630Id_IsNull() { regBldl5630Id(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLDL5630_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setBldl5630Id_IsNotNull() { regBldl5630Id(CK_ISNN, DOBJ); }

    protected void regBldl5630Id(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBldl5630Id(), "BLDL5630_ID"); }
    protected abstract ConditionValue xgetCValueBldl5630Id();

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
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_Equal(Long koshigayaUs) {
        doSetKoshigayaUs_Equal(koshigayaUs);
    }

    protected void doSetKoshigayaUs_Equal(Long koshigayaUs) {
        regKoshigayaUs(CK_EQ, koshigayaUs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_NotEqual(Long koshigayaUs) {
        doSetKoshigayaUs_NotEqual(koshigayaUs);
    }

    protected void doSetKoshigayaUs_NotEqual(Long koshigayaUs) {
        regKoshigayaUs(CK_NES, koshigayaUs);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_GreaterThan(Long koshigayaUs) {
        regKoshigayaUs(CK_GT, koshigayaUs);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_LessThan(Long koshigayaUs) {
        regKoshigayaUs(CK_LT, koshigayaUs);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_GreaterEqual(Long koshigayaUs) {
        regKoshigayaUs(CK_GE, koshigayaUs);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUs The value of koshigayaUs as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setKoshigayaUs_LessEqual(Long koshigayaUs) {
        regKoshigayaUs(CK_LE, koshigayaUs);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param minNumber The min number of koshigayaUs. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of koshigayaUs. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setKoshigayaUs_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueKoshigayaUs(), "KOSHIGAYA_US", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUsList The collection of koshigayaUs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaUs_InScope(Collection<Long> koshigayaUsList) {
        doSetKoshigayaUs_InScope(koshigayaUsList);
    }

    protected void doSetKoshigayaUs_InScope(Collection<Long> koshigayaUsList) {
        regINS(CK_INS, cTL(koshigayaUsList), xgetCValueKoshigayaUs(), "KOSHIGAYA_US");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     * @param koshigayaUsList The collection of koshigayaUs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoshigayaUs_NotInScope(Collection<Long> koshigayaUsList) {
        doSetKoshigayaUs_NotInScope(koshigayaUsList);
    }

    protected void doSetKoshigayaUs_NotInScope(Collection<Long> koshigayaUsList) {
        regINS(CK_NINS, cTL(koshigayaUsList), xgetCValueKoshigayaUs(), "KOSHIGAYA_US");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     */
    public void setKoshigayaUs_IsNull() { regKoshigayaUs(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOSHIGAYA_US: {BIGINT(19)}
     */
    public void setKoshigayaUs_IsNotNull() { regKoshigayaUs(CK_ISNN, DOBJ); }

    protected void regKoshigayaUs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoshigayaUs(), "KOSHIGAYA_US"); }
    protected abstract ConditionValue xgetCValueKoshigayaUs();

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
    public HpSLCFunction<TBldl5630CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBldl5630CB.class);
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
    public HpSLCFunction<TBldl5630CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBldl5630CB.class);
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
    public HpSLCFunction<TBldl5630CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBldl5630CB.class);
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
    public HpSLCFunction<TBldl5630CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBldl5630CB.class);
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
    public HpSLCFunction<TBldl5630CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBldl5630CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBldl5630CB&gt;() {
     *     public void query(TBldl5630CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBldl5630CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBldl5630CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5630CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBldl5630CQ sq);

    protected TBldl5630CB xcreateScalarConditionCB() {
        TBldl5630CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBldl5630CB xcreateScalarConditionPartitionByCB() {
        TBldl5630CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBldl5630CB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5630CB cb = new TBldl5630CB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "BLDL5630_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBldl5630CQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBldl5630CB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBldl5630CB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBldl5630CB cb = new TBldl5630CB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "BLDL5630_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBldl5630CQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBldl5630CB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBldl5630CB cb = new TBldl5630CB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBldl5630CQ sq);

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
    protected TBldl5630CB newMyCB() {
        return new TBldl5630CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBldl5630CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
