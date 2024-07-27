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
 * The abstract condition-query of m_holiday.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMHolidayCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMHolidayCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_holiday";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_Equal(Long holidayId) {
        doSetHolidayId_Equal(holidayId);
    }

    protected void doSetHolidayId_Equal(Long holidayId) {
        regHolidayId(CK_EQ, holidayId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_NotEqual(Long holidayId) {
        doSetHolidayId_NotEqual(holidayId);
    }

    protected void doSetHolidayId_NotEqual(Long holidayId) {
        regHolidayId(CK_NES, holidayId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_GreaterThan(Long holidayId) {
        regHolidayId(CK_GT, holidayId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_LessThan(Long holidayId) {
        regHolidayId(CK_LT, holidayId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_GreaterEqual(Long holidayId) {
        regHolidayId(CK_GE, holidayId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayId The value of holidayId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHolidayId_LessEqual(Long holidayId) {
        regHolidayId(CK_LE, holidayId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of holidayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of holidayId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHolidayId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHolidayId(), "HOLIDAY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayIdList The collection of holidayId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayId_InScope(Collection<Long> holidayIdList) {
        doSetHolidayId_InScope(holidayIdList);
    }

    protected void doSetHolidayId_InScope(Collection<Long> holidayIdList) {
        regINS(CK_INS, cTL(holidayIdList), xgetCValueHolidayId(), "HOLIDAY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param holidayIdList The collection of holidayId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayId_NotInScope(Collection<Long> holidayIdList) {
        doSetHolidayId_NotInScope(holidayIdList);
    }

    protected void doSetHolidayId_NotInScope(Collection<Long> holidayIdList) {
        regINS(CK_NINS, cTL(holidayIdList), xgetCValueHolidayId(), "HOLIDAY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setHolidayId_IsNull() { regHolidayId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HOLIDAY_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setHolidayId_IsNotNull() { regHolidayId(CK_ISNN, DOBJ); }

    protected void regHolidayId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHolidayId(), "HOLIDAY_ID"); }
    protected abstract ConditionValue xgetCValueHolidayId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_Equal(String baseCd) {
        doSetBaseCd_Equal(fRES(baseCd));
    }

    protected void doSetBaseCd_Equal(String baseCd) {
        regBaseCd(CK_EQ, baseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotEqual(String baseCd) {
        doSetBaseCd_NotEqual(fRES(baseCd));
    }

    protected void doSetBaseCd_NotEqual(String baseCd) {
        regBaseCd(CK_NES, baseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterThan(String baseCd) {
        regBaseCd(CK_GT, fRES(baseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessThan(String baseCd) {
        regBaseCd(CK_LT, fRES(baseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_GreaterEqual(String baseCd) {
        regBaseCd(CK_GE, fRES(baseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_LessEqual(String baseCd) {
        regBaseCd(CK_LE, fRES(baseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_InScope(Collection<String> baseCdList) {
        doSetBaseCd_InScope(baseCdList);
    }

    protected void doSetBaseCd_InScope(Collection<String> baseCdList) {
        regINS(CK_INS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCdList The collection of baseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_NotInScope(Collection<String> baseCdList) {
        doSetBaseCd_NotInScope(baseCdList);
    }

    protected void doSetBaseCd_NotInScope(Collection<String> baseCdList) {
        regINS(CK_NINS, cTL(baseCdList), xgetCValueBaseCd(), "BASE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setBaseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param baseCd The value of baseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBaseCd_LikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBaseCd_NotLikeSearch(String baseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(baseCd), xgetCValueBaseCd(), "BASE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     * @param baseCd The value of baseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBaseCd_PrefixSearch(String baseCd) {
        setBaseCd_LikeSearch(baseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNull() { regBaseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNullOrEmpty() { regBaseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BASE_CD: {VARCHAR(30)}
     */
    public void setBaseCd_IsNotNull() { regBaseCd(CK_ISNN, DOBJ); }

    protected void regBaseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBaseCd(), "BASE_CD"); }
    protected abstract ConditionValue xgetCValueBaseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_Equal(String calenderDt) {
        doSetCalenderDt_Equal(fRES(calenderDt));
    }

    protected void doSetCalenderDt_Equal(String calenderDt) {
        regCalenderDt(CK_EQ, calenderDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_NotEqual(String calenderDt) {
        doSetCalenderDt_NotEqual(fRES(calenderDt));
    }

    protected void doSetCalenderDt_NotEqual(String calenderDt) {
        regCalenderDt(CK_NES, calenderDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_GreaterThan(String calenderDt) {
        regCalenderDt(CK_GT, fRES(calenderDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_LessThan(String calenderDt) {
        regCalenderDt(CK_LT, fRES(calenderDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_GreaterEqual(String calenderDt) {
        regCalenderDt(CK_GE, fRES(calenderDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_LessEqual(String calenderDt) {
        regCalenderDt(CK_LE, fRES(calenderDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDtList The collection of calenderDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_InScope(Collection<String> calenderDtList) {
        doSetCalenderDt_InScope(calenderDtList);
    }

    protected void doSetCalenderDt_InScope(Collection<String> calenderDtList) {
        regINS(CK_INS, cTL(calenderDtList), xgetCValueCalenderDt(), "CALENDER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDtList The collection of calenderDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_NotInScope(Collection<String> calenderDtList) {
        doSetCalenderDt_NotInScope(calenderDtList);
    }

    protected void doSetCalenderDt_NotInScope(Collection<String> calenderDtList) {
        regINS(CK_NINS, cTL(calenderDtList), xgetCValueCalenderDt(), "CALENDER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setCalenderDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param calenderDt The value of calenderDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCalenderDt_LikeSearch(String calenderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(calenderDt), xgetCValueCalenderDt(), "CALENDER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCalenderDt_NotLikeSearch(String calenderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(calenderDt), xgetCValueCalenderDt(), "CALENDER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     * @param calenderDt The value of calenderDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalenderDt_PrefixSearch(String calenderDt) {
        setCalenderDt_LikeSearch(calenderDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     */
    public void setCalenderDt_IsNull() { regCalenderDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     */
    public void setCalenderDt_IsNullOrEmpty() { regCalenderDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CALENDER_DT: {VARCHAR(8)}
     */
    public void setCalenderDt_IsNotNull() { regCalenderDt(CK_ISNN, DOBJ); }

    protected void regCalenderDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCalenderDt(), "CALENDER_DT"); }
    protected abstract ConditionValue xgetCValueCalenderDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_Equal(String holidayFlg) {
        doSetHolidayFlg_Equal(fRES(holidayFlg));
    }

    protected void doSetHolidayFlg_Equal(String holidayFlg) {
        regHolidayFlg(CK_EQ, holidayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_NotEqual(String holidayFlg) {
        doSetHolidayFlg_NotEqual(fRES(holidayFlg));
    }

    protected void doSetHolidayFlg_NotEqual(String holidayFlg) {
        regHolidayFlg(CK_NES, holidayFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_GreaterThan(String holidayFlg) {
        regHolidayFlg(CK_GT, fRES(holidayFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_LessThan(String holidayFlg) {
        regHolidayFlg(CK_LT, fRES(holidayFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_GreaterEqual(String holidayFlg) {
        regHolidayFlg(CK_GE, fRES(holidayFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_LessEqual(String holidayFlg) {
        regHolidayFlg(CK_LE, fRES(holidayFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlgList The collection of holidayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_InScope(Collection<String> holidayFlgList) {
        doSetHolidayFlg_InScope(holidayFlgList);
    }

    protected void doSetHolidayFlg_InScope(Collection<String> holidayFlgList) {
        regINS(CK_INS, cTL(holidayFlgList), xgetCValueHolidayFlg(), "HOLIDAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlgList The collection of holidayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_NotInScope(Collection<String> holidayFlgList) {
        doSetHolidayFlg_NotInScope(holidayFlgList);
    }

    protected void doSetHolidayFlg_NotInScope(Collection<String> holidayFlgList) {
        regINS(CK_NINS, cTL(holidayFlgList), xgetCValueHolidayFlg(), "HOLIDAY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setHolidayFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param holidayFlg The value of holidayFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHolidayFlg_LikeSearch(String holidayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(holidayFlg), xgetCValueHolidayFlg(), "HOLIDAY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHolidayFlg_NotLikeSearch(String holidayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(holidayFlg), xgetCValueHolidayFlg(), "HOLIDAY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param holidayFlg The value of holidayFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHolidayFlg_PrefixSearch(String holidayFlg) {
        setHolidayFlg_LikeSearch(holidayFlg, xcLSOPPre());
    }

    protected void regHolidayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHolidayFlg(), "HOLIDAY_FLG"); }
    protected abstract ConditionValue xgetCValueHolidayFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_Equal(String nationalHolidayFlg) {
        doSetNationalHolidayFlg_Equal(fRES(nationalHolidayFlg));
    }

    protected void doSetNationalHolidayFlg_Equal(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_EQ, nationalHolidayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_NotEqual(String nationalHolidayFlg) {
        doSetNationalHolidayFlg_NotEqual(fRES(nationalHolidayFlg));
    }

    protected void doSetNationalHolidayFlg_NotEqual(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_NES, nationalHolidayFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_GreaterThan(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_GT, fRES(nationalHolidayFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_LessThan(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_LT, fRES(nationalHolidayFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_GreaterEqual(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_GE, fRES(nationalHolidayFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_LessEqual(String nationalHolidayFlg) {
        regNationalHolidayFlg(CK_LE, fRES(nationalHolidayFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlgList The collection of nationalHolidayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_InScope(Collection<String> nationalHolidayFlgList) {
        doSetNationalHolidayFlg_InScope(nationalHolidayFlgList);
    }

    protected void doSetNationalHolidayFlg_InScope(Collection<String> nationalHolidayFlgList) {
        regINS(CK_INS, cTL(nationalHolidayFlgList), xgetCValueNationalHolidayFlg(), "NATIONAL_HOLIDAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlgList The collection of nationalHolidayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_NotInScope(Collection<String> nationalHolidayFlgList) {
        doSetNationalHolidayFlg_NotInScope(nationalHolidayFlgList);
    }

    protected void doSetNationalHolidayFlg_NotInScope(Collection<String> nationalHolidayFlgList) {
        regINS(CK_NINS, cTL(nationalHolidayFlgList), xgetCValueNationalHolidayFlg(), "NATIONAL_HOLIDAY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setNationalHolidayFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nationalHolidayFlg The value of nationalHolidayFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNationalHolidayFlg_LikeSearch(String nationalHolidayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nationalHolidayFlg), xgetCValueNationalHolidayFlg(), "NATIONAL_HOLIDAY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNationalHolidayFlg_NotLikeSearch(String nationalHolidayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nationalHolidayFlg), xgetCValueNationalHolidayFlg(), "NATIONAL_HOLIDAY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NATIONAL_HOLIDAY_FLG: {NotNull, CHAR(1), default=[0]}
     * @param nationalHolidayFlg The value of nationalHolidayFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNationalHolidayFlg_PrefixSearch(String nationalHolidayFlg) {
        setNationalHolidayFlg_LikeSearch(nationalHolidayFlg, xcLSOPPre());
    }

    protected void regNationalHolidayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNationalHolidayFlg(), "NATIONAL_HOLIDAY_FLG"); }
    protected abstract ConditionValue xgetCValueNationalHolidayFlg();

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
    public HpSLCFunction<MHolidayCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MHolidayCB.class);
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
    public HpSLCFunction<MHolidayCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MHolidayCB.class);
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
    public HpSLCFunction<MHolidayCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MHolidayCB.class);
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
    public HpSLCFunction<MHolidayCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MHolidayCB.class);
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
    public HpSLCFunction<MHolidayCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MHolidayCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MHolidayCB&gt;() {
     *     public void query(MHolidayCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MHolidayCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MHolidayCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MHolidayCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MHolidayCQ sq);

    protected MHolidayCB xcreateScalarConditionCB() {
        MHolidayCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MHolidayCB xcreateScalarConditionPartitionByCB() {
        MHolidayCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MHolidayCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MHolidayCB cb = new MHolidayCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "HOLIDAY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MHolidayCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MHolidayCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MHolidayCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MHolidayCB cb = new MHolidayCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "HOLIDAY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MHolidayCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MHolidayCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MHolidayCB cb = new MHolidayCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MHolidayCQ sq);

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
    protected MHolidayCB newMyCB() {
        return new MHolidayCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MHolidayCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
