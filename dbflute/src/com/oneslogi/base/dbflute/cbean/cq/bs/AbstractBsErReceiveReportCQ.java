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
 * The abstract condition-query of er_receive_report.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsErReceiveReportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsErReceiveReportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "er_receive_report";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_Equal(Long receiveReportId) {
        doSetReceiveReportId_Equal(receiveReportId);
    }

    protected void doSetReceiveReportId_Equal(Long receiveReportId) {
        regReceiveReportId(CK_EQ, receiveReportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_NotEqual(Long receiveReportId) {
        doSetReceiveReportId_NotEqual(receiveReportId);
    }

    protected void doSetReceiveReportId_NotEqual(Long receiveReportId) {
        regReceiveReportId(CK_NES, receiveReportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_GreaterThan(Long receiveReportId) {
        regReceiveReportId(CK_GT, receiveReportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_LessThan(Long receiveReportId) {
        regReceiveReportId(CK_LT, receiveReportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_GreaterEqual(Long receiveReportId) {
        regReceiveReportId(CK_GE, receiveReportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportId The value of receiveReportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveReportId_LessEqual(Long receiveReportId) {
        regReceiveReportId(CK_LE, receiveReportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of receiveReportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveReportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveReportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveReportId(), "RECEIVE_REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportIdList The collection of receiveReportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReportId_InScope(Collection<Long> receiveReportIdList) {
        doSetReceiveReportId_InScope(receiveReportIdList);
    }

    protected void doSetReceiveReportId_InScope(Collection<Long> receiveReportIdList) {
        regINS(CK_INS, cTL(receiveReportIdList), xgetCValueReceiveReportId(), "RECEIVE_REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     * @param receiveReportIdList The collection of receiveReportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReportId_NotInScope(Collection<Long> receiveReportIdList) {
        doSetReceiveReportId_NotInScope(receiveReportIdList);
    }

    protected void doSetReceiveReportId_NotInScope(Collection<Long> receiveReportIdList) {
        regINS(CK_NINS, cTL(receiveReportIdList), xgetCValueReceiveReportId(), "RECEIVE_REPORT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReceiveReportId_IsNull() { regReceiveReportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReceiveReportId_IsNotNull() { regReceiveReportId(CK_ISNN, DOBJ); }

    protected void regReceiveReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveReportId(), "RECEIVE_REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReceiveReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1)}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(30)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_Equal(String storeSlipNo) {
        doSetStoreSlipNo_Equal(fRES(storeSlipNo));
    }

    protected void doSetStoreSlipNo_Equal(String storeSlipNo) {
        regStoreSlipNo(CK_EQ, storeSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_NotEqual(String storeSlipNo) {
        doSetStoreSlipNo_NotEqual(fRES(storeSlipNo));
    }

    protected void doSetStoreSlipNo_NotEqual(String storeSlipNo) {
        regStoreSlipNo(CK_NES, storeSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_GreaterThan(String storeSlipNo) {
        regStoreSlipNo(CK_GT, fRES(storeSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_LessThan(String storeSlipNo) {
        regStoreSlipNo(CK_LT, fRES(storeSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_GreaterEqual(String storeSlipNo) {
        regStoreSlipNo(CK_GE, fRES(storeSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_LessEqual(String storeSlipNo) {
        regStoreSlipNo(CK_LE, fRES(storeSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNoList The collection of storeSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_InScope(Collection<String> storeSlipNoList) {
        doSetStoreSlipNo_InScope(storeSlipNoList);
    }

    protected void doSetStoreSlipNo_InScope(Collection<String> storeSlipNoList) {
        regINS(CK_INS, cTL(storeSlipNoList), xgetCValueStoreSlipNo(), "STORE_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNoList The collection of storeSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_NotInScope(Collection<String> storeSlipNoList) {
        doSetStoreSlipNo_NotInScope(storeSlipNoList);
    }

    protected void doSetStoreSlipNo_NotInScope(Collection<String> storeSlipNoList) {
        regINS(CK_NINS, cTL(storeSlipNoList), xgetCValueStoreSlipNo(), "STORE_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeSlipNo The value of storeSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreSlipNo_LikeSearch(String storeSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeSlipNo), xgetCValueStoreSlipNo(), "STORE_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreSlipNo_NotLikeSearch(String storeSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeSlipNo), xgetCValueStoreSlipNo(), "STORE_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     * @param storeSlipNo The value of storeSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipNo_PrefixSearch(String storeSlipNo) {
        setStoreSlipNo_LikeSearch(storeSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     */
    public void setStoreSlipNo_IsNull() { regStoreSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     */
    public void setStoreSlipNo_IsNullOrEmpty() { regStoreSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_NO: {VARCHAR(30)}
     */
    public void setStoreSlipNo_IsNotNull() { regStoreSlipNo(CK_ISNN, DOBJ); }

    protected void regStoreSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreSlipNo(), "STORE_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueStoreSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_Equal(String storeSlipRowNo) {
        doSetStoreSlipRowNo_Equal(fRES(storeSlipRowNo));
    }

    protected void doSetStoreSlipRowNo_Equal(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_EQ, storeSlipRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_NotEqual(String storeSlipRowNo) {
        doSetStoreSlipRowNo_NotEqual(fRES(storeSlipRowNo));
    }

    protected void doSetStoreSlipRowNo_NotEqual(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_NES, storeSlipRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_GreaterThan(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_GT, fRES(storeSlipRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_LessThan(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_LT, fRES(storeSlipRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_GreaterEqual(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_GE, fRES(storeSlipRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_LessEqual(String storeSlipRowNo) {
        regStoreSlipRowNo(CK_LE, fRES(storeSlipRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNoList The collection of storeSlipRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_InScope(Collection<String> storeSlipRowNoList) {
        doSetStoreSlipRowNo_InScope(storeSlipRowNoList);
    }

    protected void doSetStoreSlipRowNo_InScope(Collection<String> storeSlipRowNoList) {
        regINS(CK_INS, cTL(storeSlipRowNoList), xgetCValueStoreSlipRowNo(), "STORE_SLIP_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNoList The collection of storeSlipRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_NotInScope(Collection<String> storeSlipRowNoList) {
        doSetStoreSlipRowNo_NotInScope(storeSlipRowNoList);
    }

    protected void doSetStoreSlipRowNo_NotInScope(Collection<String> storeSlipRowNoList) {
        regINS(CK_NINS, cTL(storeSlipRowNoList), xgetCValueStoreSlipRowNo(), "STORE_SLIP_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreSlipRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeSlipRowNo The value of storeSlipRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreSlipRowNo_LikeSearch(String storeSlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeSlipRowNo), xgetCValueStoreSlipRowNo(), "STORE_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreSlipRowNo_NotLikeSearch(String storeSlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeSlipRowNo), xgetCValueStoreSlipRowNo(), "STORE_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     * @param storeSlipRowNo The value of storeSlipRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreSlipRowNo_PrefixSearch(String storeSlipRowNo) {
        setStoreSlipRowNo_LikeSearch(storeSlipRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreSlipRowNo_IsNull() { regStoreSlipRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreSlipRowNo_IsNullOrEmpty() { regStoreSlipRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setStoreSlipRowNo_IsNotNull() { regStoreSlipRowNo(CK_ISNN, DOBJ); }

    protected void regStoreSlipRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreSlipRowNo(), "STORE_SLIP_ROW_NO"); }
    protected abstract ConditionValue xgetCValueStoreSlipRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_Equal(String slipTypeCd) {
        doSetSlipTypeCd_Equal(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_Equal(String slipTypeCd) {
        regSlipTypeCd(CK_EQ, slipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotEqual(String slipTypeCd) {
        doSetSlipTypeCd_NotEqual(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_NotEqual(String slipTypeCd) {
        regSlipTypeCd(CK_NES, slipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterThan(String slipTypeCd) {
        regSlipTypeCd(CK_GT, fRES(slipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessThan(String slipTypeCd) {
        regSlipTypeCd(CK_LT, fRES(slipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterEqual(String slipTypeCd) {
        regSlipTypeCd(CK_GE, fRES(slipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessEqual(String slipTypeCd) {
        regSlipTypeCd(CK_LE, fRES(slipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_InScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        regINS(CK_INS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_NotInScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        regINS(CK_NINS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipTypeCd The value of slipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipTypeCd_LikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipTypeCd_NotLikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_PrefixSearch(String slipTypeCd) {
        setSlipTypeCd_LikeSearch(slipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNull() { regSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNullOrEmpty() { regSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNotNull() { regSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipTypeCd(), "SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSlipTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_Equal(Long sn) {
        doSetSn_Equal(sn);
    }

    protected void doSetSn_Equal(Long sn) {
        regSn(CK_EQ, sn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_NotEqual(Long sn) {
        doSetSn_NotEqual(sn);
    }

    protected void doSetSn_NotEqual(Long sn) {
        regSn(CK_NES, sn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_GreaterThan(Long sn) {
        regSn(CK_GT, sn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_LessThan(Long sn) {
        regSn(CK_LT, sn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_GreaterEqual(Long sn) {
        regSn(CK_GE, sn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param sn The value of sn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSn_LessEqual(Long sn) {
        regSn(CK_LE, sn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param minNumber The min number of sn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSn(), "SN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param snList The collection of sn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_InScope(Collection<Long> snList) {
        doSetSn_InScope(snList);
    }

    protected void doSetSn_InScope(Collection<Long> snList) {
        regINS(CK_INS, cTL(snList), xgetCValueSn(), "SN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     * @param snList The collection of sn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSn_NotInScope(Collection<Long> snList) {
        doSetSn_NotInScope(snList);
    }

    protected void doSetSn_NotInScope(Collection<Long> snList) {
        regINS(CK_NINS, cTL(snList), xgetCValueSn(), "SN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     */
    public void setSn_IsNull() { regSn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SN: {BIGINT(19), default=[0]}
     */
    public void setSn_IsNotNull() { regSn(CK_ISNN, DOBJ); }

    protected void regSn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSn(), "SN"); }
    protected abstract ConditionValue xgetCValueSn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_Equal(String ifId) {
        doSetIfId_Equal(fRES(ifId));
    }

    protected void doSetIfId_Equal(String ifId) {
        regIfId(CK_EQ, ifId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotEqual(String ifId) {
        doSetIfId_NotEqual(fRES(ifId));
    }

    protected void doSetIfId_NotEqual(String ifId) {
        regIfId(CK_NES, ifId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterThan(String ifId) {
        regIfId(CK_GT, fRES(ifId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessThan(String ifId) {
        regIfId(CK_LT, fRES(ifId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_GreaterEqual(String ifId) {
        regIfId(CK_GE, fRES(ifId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_LessEqual(String ifId) {
        regIfId(CK_LE, fRES(ifId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_InScope(Collection<String> ifIdList) {
        doSetIfId_InScope(ifIdList);
    }

    protected void doSetIfId_InScope(Collection<String> ifIdList) {
        regINS(CK_INS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifIdList The collection of ifId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_NotInScope(Collection<String> ifIdList) {
        doSetIfId_NotInScope(ifIdList);
    }

    protected void doSetIfId_NotInScope(Collection<String> ifIdList) {
        regINS(CK_NINS, cTL(ifIdList), xgetCValueIfId(), "IF_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)} <br>
     * <pre>e.g. setIfId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifId The value of ifId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfId_LikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfId_NotLikeSearch(String ifId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifId), xgetCValueIfId(), "IF_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     * @param ifId The value of ifId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfId_PrefixSearch(String ifId) {
        setIfId_LikeSearch(ifId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNull() { regIfId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNullOrEmpty() { regIfId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IF_ID: {VARCHAR(30)}
     */
    public void setIfId_IsNotNull() { regIfId(CK_ISNN, DOBJ); }

    protected void regIfId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfId(), "IF_ID"); }
    protected abstract ConditionValue xgetCValueIfId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_Equal(String ifNo) {
        doSetIfNo_Equal(fRES(ifNo));
    }

    protected void doSetIfNo_Equal(String ifNo) {
        regIfNo(CK_EQ, ifNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_NotEqual(String ifNo) {
        doSetIfNo_NotEqual(fRES(ifNo));
    }

    protected void doSetIfNo_NotEqual(String ifNo) {
        regIfNo(CK_NES, ifNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_GreaterThan(String ifNo) {
        regIfNo(CK_GT, fRES(ifNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_LessThan(String ifNo) {
        regIfNo(CK_LT, fRES(ifNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_GreaterEqual(String ifNo) {
        regIfNo(CK_GE, fRES(ifNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_LessEqual(String ifNo) {
        regIfNo(CK_LE, fRES(ifNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNoList The collection of ifNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_InScope(Collection<String> ifNoList) {
        doSetIfNo_InScope(ifNoList);
    }

    protected void doSetIfNo_InScope(Collection<String> ifNoList) {
        regINS(CK_INS, cTL(ifNoList), xgetCValueIfNo(), "IF_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNoList The collection of ifNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_NotInScope(Collection<String> ifNoList) {
        doSetIfNo_NotInScope(ifNoList);
    }

    protected void doSetIfNo_NotInScope(Collection<String> ifNoList) {
        regINS(CK_NINS, cTL(ifNoList), xgetCValueIfNo(), "IF_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setIfNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifNo The value of ifNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfNo_LikeSearch(String ifNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifNo), xgetCValueIfNo(), "IF_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfNo_NotLikeSearch(String ifNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifNo), xgetCValueIfNo(), "IF_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     * @param ifNo The value of ifNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfNo_PrefixSearch(String ifNo) {
        setIfNo_LikeSearch(ifNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     */
    public void setIfNo_IsNull() { regIfNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     */
    public void setIfNo_IsNullOrEmpty() { regIfNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IF_NO: {VARCHAR(30)}
     */
    public void setIfNo_IsNotNull() { regIfNo(CK_ISNN, DOBJ); }

    protected void regIfNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfNo(), "IF_NO"); }
    protected abstract ConditionValue xgetCValueIfNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_Equal(String hinmokuCd) {
        doSetHinmokuCd_Equal(fRES(hinmokuCd));
    }

    protected void doSetHinmokuCd_Equal(String hinmokuCd) {
        regHinmokuCd(CK_EQ, hinmokuCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_NotEqual(String hinmokuCd) {
        doSetHinmokuCd_NotEqual(fRES(hinmokuCd));
    }

    protected void doSetHinmokuCd_NotEqual(String hinmokuCd) {
        regHinmokuCd(CK_NES, hinmokuCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterThan(String hinmokuCd) {
        regHinmokuCd(CK_GT, fRES(hinmokuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessThan(String hinmokuCd) {
        regHinmokuCd(CK_LT, fRES(hinmokuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_GreaterEqual(String hinmokuCd) {
        regHinmokuCd(CK_GE, fRES(hinmokuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_LessEqual(String hinmokuCd) {
        regHinmokuCd(CK_LE, fRES(hinmokuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCdList The collection of hinmokuCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_InScope(Collection<String> hinmokuCdList) {
        doSetHinmokuCd_InScope(hinmokuCdList);
    }

    protected void doSetHinmokuCd_InScope(Collection<String> hinmokuCdList) {
        regINS(CK_INS, cTL(hinmokuCdList), xgetCValueHinmokuCd(), "HINMOKU_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCdList The collection of hinmokuCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_NotInScope(Collection<String> hinmokuCdList) {
        doSetHinmokuCd_NotInScope(hinmokuCdList);
    }

    protected void doSetHinmokuCd_NotInScope(Collection<String> hinmokuCdList) {
        regINS(CK_NINS, cTL(hinmokuCdList), xgetCValueHinmokuCd(), "HINMOKU_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)} <br>
     * <pre>e.g. setHinmokuCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuCd The value of hinmokuCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuCd_LikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuCd_NotLikeSearch(String hinmokuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuCd), xgetCValueHinmokuCd(), "HINMOKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     * @param hinmokuCd The value of hinmokuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuCd_PrefixSearch(String hinmokuCd) {
        setHinmokuCd_LikeSearch(hinmokuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     */
    public void setHinmokuCd_IsNull() { regHinmokuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     */
    public void setHinmokuCd_IsNullOrEmpty() { regHinmokuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_CD: {VARCHAR(100)}
     */
    public void setHinmokuCd_IsNotNull() { regHinmokuCd(CK_ISNN, DOBJ); }

    protected void regHinmokuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuCd(), "HINMOKU_CD"); }
    protected abstract ConditionValue xgetCValueHinmokuCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_Equal(String janCd) {
        doSetJanCd_Equal(fRES(janCd));
    }

    protected void doSetJanCd_Equal(String janCd) {
        regJanCd(CK_EQ, janCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotEqual(String janCd) {
        doSetJanCd_NotEqual(fRES(janCd));
    }

    protected void doSetJanCd_NotEqual(String janCd) {
        regJanCd(CK_NES, janCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterThan(String janCd) {
        regJanCd(CK_GT, fRES(janCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessThan(String janCd) {
        regJanCd(CK_LT, fRES(janCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_GreaterEqual(String janCd) {
        regJanCd(CK_GE, fRES(janCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_LessEqual(String janCd) {
        regJanCd(CK_LE, fRES(janCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_InScope(Collection<String> janCdList) {
        doSetJanCd_InScope(janCdList);
    }

    protected void doSetJanCd_InScope(Collection<String> janCdList) {
        regINS(CK_INS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCdList The collection of janCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_NotInScope(Collection<String> janCdList) {
        doSetJanCd_NotInScope(janCdList);
    }

    protected void doSetJanCd_NotInScope(Collection<String> janCdList) {
        regINS(CK_NINS, cTL(janCdList), xgetCValueJanCd(), "JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param janCd The value of janCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJanCd_LikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJanCd_NotLikeSearch(String janCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(janCd), xgetCValueJanCd(), "JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     * @param janCd The value of janCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJanCd_PrefixSearch(String janCd) {
        setJanCd_LikeSearch(janCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNull() { regJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNullOrEmpty() { regJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JAN_CD: {VARCHAR(30)}
     */
    public void setJanCd_IsNotNull() { regJanCd(CK_ISNN, DOBJ); }

    protected void regJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJanCd(), "JAN_CD"); }
    protected abstract ConditionValue xgetCValueJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_Equal(String storeReasonCd) {
        doSetStoreReasonCd_Equal(fRES(storeReasonCd));
    }

    protected void doSetStoreReasonCd_Equal(String storeReasonCd) {
        regStoreReasonCd(CK_EQ, storeReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_NotEqual(String storeReasonCd) {
        doSetStoreReasonCd_NotEqual(fRES(storeReasonCd));
    }

    protected void doSetStoreReasonCd_NotEqual(String storeReasonCd) {
        regStoreReasonCd(CK_NES, storeReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_GreaterThan(String storeReasonCd) {
        regStoreReasonCd(CK_GT, fRES(storeReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_LessThan(String storeReasonCd) {
        regStoreReasonCd(CK_LT, fRES(storeReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_GreaterEqual(String storeReasonCd) {
        regStoreReasonCd(CK_GE, fRES(storeReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_LessEqual(String storeReasonCd) {
        regStoreReasonCd(CK_LE, fRES(storeReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCdList The collection of storeReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_InScope(Collection<String> storeReasonCdList) {
        doSetStoreReasonCd_InScope(storeReasonCdList);
    }

    protected void doSetStoreReasonCd_InScope(Collection<String> storeReasonCdList) {
        regINS(CK_INS, cTL(storeReasonCdList), xgetCValueStoreReasonCd(), "STORE_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCdList The collection of storeReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_NotInScope(Collection<String> storeReasonCdList) {
        doSetStoreReasonCd_NotInScope(storeReasonCdList);
    }

    protected void doSetStoreReasonCd_NotInScope(Collection<String> storeReasonCdList) {
        regINS(CK_NINS, cTL(storeReasonCdList), xgetCValueStoreReasonCd(), "STORE_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStoreReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeReasonCd The value of storeReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreReasonCd_LikeSearch(String storeReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeReasonCd), xgetCValueStoreReasonCd(), "STORE_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreReasonCd_NotLikeSearch(String storeReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeReasonCd), xgetCValueStoreReasonCd(), "STORE_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     * @param storeReasonCd The value of storeReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreReasonCd_PrefixSearch(String storeReasonCd) {
        setStoreReasonCd_LikeSearch(storeReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNull() { regStoreReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNullOrEmpty() { regStoreReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_REASON_CD: {VARCHAR(30)}
     */
    public void setStoreReasonCd_IsNotNull() { regStoreReasonCd(CK_ISNN, DOBJ); }

    protected void regStoreReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreReasonCd(), "STORE_REASON_CD"); }
    protected abstract ConditionValue xgetCValueStoreReasonCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_Equal(String storeDt) {
        doSetStoreDt_Equal(fRES(storeDt));
    }

    protected void doSetStoreDt_Equal(String storeDt) {
        regStoreDt(CK_EQ, storeDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotEqual(String storeDt) {
        doSetStoreDt_NotEqual(fRES(storeDt));
    }

    protected void doSetStoreDt_NotEqual(String storeDt) {
        regStoreDt(CK_NES, storeDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterThan(String storeDt) {
        regStoreDt(CK_GT, fRES(storeDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessThan(String storeDt) {
        regStoreDt(CK_LT, fRES(storeDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_GreaterEqual(String storeDt) {
        regStoreDt(CK_GE, fRES(storeDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_LessEqual(String storeDt) {
        regStoreDt(CK_LE, fRES(storeDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDtList The collection of storeDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_InScope(Collection<String> storeDtList) {
        doSetStoreDt_InScope(storeDtList);
    }

    protected void doSetStoreDt_InScope(Collection<String> storeDtList) {
        regINS(CK_INS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDtList The collection of storeDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_NotInScope(Collection<String> storeDtList) {
        doSetStoreDt_NotInScope(storeDtList);
    }

    protected void doSetStoreDt_NotInScope(Collection<String> storeDtList) {
        regINS(CK_NINS, cTL(storeDtList), xgetCValueStoreDt(), "STORE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setStoreDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeDt The value of storeDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreDt_LikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreDt_NotLikeSearch(String storeDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeDt), xgetCValueStoreDt(), "STORE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     * @param storeDt The value of storeDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreDt_PrefixSearch(String storeDt) {
        setStoreDt_LikeSearch(storeDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNull() { regStoreDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNullOrEmpty() { regStoreDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_DT: {VARCHAR(8)}
     */
    public void setStoreDt_IsNotNull() { regStoreDt(CK_ISNN, DOBJ); }

    protected void regStoreDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreDt(), "STORE_DT"); }
    protected abstract ConditionValue xgetCValueStoreDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_Equal(java.math.BigDecimal num) {
        doSetNum_Equal(num);
    }

    protected void doSetNum_Equal(java.math.BigDecimal num) {
        regNum(CK_EQ, num);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_NotEqual(java.math.BigDecimal num) {
        doSetNum_NotEqual(num);
    }

    protected void doSetNum_NotEqual(java.math.BigDecimal num) {
        regNum(CK_NES, num);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterThan(java.math.BigDecimal num) {
        regNum(CK_GT, num);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessThan(java.math.BigDecimal num) {
        regNum(CK_LT, num);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterEqual(java.math.BigDecimal num) {
        regNum(CK_GE, num);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param num The value of num as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessEqual(java.math.BigDecimal num) {
        regNum(CK_LE, num);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param minNumber The min number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum(), "NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param numList The collection of num as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_InScope(Collection<java.math.BigDecimal> numList) {
        doSetNum_InScope(numList);
    }

    protected void doSetNum_InScope(Collection<java.math.BigDecimal> numList) {
        regINS(CK_INS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     * @param numList The collection of num as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_NotInScope(Collection<java.math.BigDecimal> numList) {
        doSetNum_NotInScope(numList);
    }

    protected void doSetNum_NotInScope(Collection<java.math.BigDecimal> numList) {
        regINS(CK_NINS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     */
    public void setNum_IsNull() { regNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4)}
     */
    public void setNum_IsNotNull() { regNum(CK_ISNN, DOBJ); }

    protected void regNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum(), "NUM"); }
    protected abstract ConditionValue xgetCValueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_Equal(String lotManagTypeCd) {
        doSetLotManagTypeCd_Equal(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_Equal(String lotManagTypeCd) {
        regLotManagTypeCd(CK_EQ, lotManagTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        doSetLotManagTypeCd_NotEqual(fRES(lotManagTypeCd));
    }

    protected void doSetLotManagTypeCd_NotEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_NES, lotManagTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GT, fRES(lotManagTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessThan(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LT, fRES(lotManagTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_GreaterEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_GE, fRES(lotManagTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_LessEqual(String lotManagTypeCd) {
        regLotManagTypeCd(CK_LE, fRES(lotManagTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_InScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_InScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_INS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCdList The collection of lotManagTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        doSetLotManagTypeCd_NotInScope(lotManagTypeCdList);
    }

    protected void doSetLotManagTypeCd_NotInScope(Collection<String> lotManagTypeCdList) {
        regINS(CK_NINS, cTL(lotManagTypeCdList), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLotManagTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotManagTypeCd The value of lotManagTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotManagTypeCd_LikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotManagTypeCd_NotLikeSearch(String lotManagTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotManagTypeCd), xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     * @param lotManagTypeCd The value of lotManagTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotManagTypeCd_PrefixSearch(String lotManagTypeCd) {
        setLotManagTypeCd_LikeSearch(lotManagTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNull() { regLotManagTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNullOrEmpty() { regLotManagTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
     */
    public void setLotManagTypeCd_IsNotNull() { regLotManagTypeCd(CK_ISNN, DOBJ); }

    protected void regLotManagTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotManagTypeCd(), "LOT_MANAG_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotManagTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_Equal(String lot) {
        doSetLot_Equal(fRES(lot));
    }

    protected void doSetLot_Equal(String lot) {
        regLot(CK_EQ, lot);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotEqual(String lot) {
        doSetLot_NotEqual(fRES(lot));
    }

    protected void doSetLot_NotEqual(String lot) {
        regLot(CK_NES, lot);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lotList The collection of lot as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_InScope(Collection<String> lotList) {
        doSetLot_InScope(lotList);
    }

    protected void doSetLot_InScope(Collection<String> lotList) {
        regINS(CK_INS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lotList The collection of lot as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_NotInScope(Collection<String> lotList) {
        doSetLot_NotInScope(lotList);
    }

    protected void doSetLot_NotInScope(Collection<String> lotList) {
        regINS(CK_NINS, cTL(lotList), xgetCValueLot(), "LOT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)} <br>
     * <pre>e.g. setLot_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot The value of lot as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot_LikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(100)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(100)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_Equal(String receiveNo) {
        doSetReceiveNo_Equal(fRES(receiveNo));
    }

    protected void doSetReceiveNo_Equal(String receiveNo) {
        regReceiveNo(CK_EQ, receiveNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_NotEqual(String receiveNo) {
        doSetReceiveNo_NotEqual(fRES(receiveNo));
    }

    protected void doSetReceiveNo_NotEqual(String receiveNo) {
        regReceiveNo(CK_NES, receiveNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_GreaterThan(String receiveNo) {
        regReceiveNo(CK_GT, fRES(receiveNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_LessThan(String receiveNo) {
        regReceiveNo(CK_LT, fRES(receiveNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_GreaterEqual(String receiveNo) {
        regReceiveNo(CK_GE, fRES(receiveNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_LessEqual(String receiveNo) {
        regReceiveNo(CK_LE, fRES(receiveNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNoList The collection of receiveNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_InScope(Collection<String> receiveNoList) {
        doSetReceiveNo_InScope(receiveNoList);
    }

    protected void doSetReceiveNo_InScope(Collection<String> receiveNoList) {
        regINS(CK_INS, cTL(receiveNoList), xgetCValueReceiveNo(), "RECEIVE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNoList The collection of receiveNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_NotInScope(Collection<String> receiveNoList) {
        doSetReceiveNo_NotInScope(receiveNoList);
    }

    protected void doSetReceiveNo_NotInScope(Collection<String> receiveNoList) {
        regINS(CK_NINS, cTL(receiveNoList), xgetCValueReceiveNo(), "RECEIVE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveNo The value of receiveNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveNo_LikeSearch(String receiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveNo), xgetCValueReceiveNo(), "RECEIVE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveNo_NotLikeSearch(String receiveNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveNo), xgetCValueReceiveNo(), "RECEIVE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     * @param receiveNo The value of receiveNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveNo_PrefixSearch(String receiveNo) {
        setReceiveNo_LikeSearch(receiveNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNull() { regReceiveNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNullOrEmpty() { regReceiveNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_NO: {VARCHAR(30)}
     */
    public void setReceiveNo_IsNotNull() { regReceiveNo(CK_ISNN, DOBJ); }

    protected void regReceiveNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveNo(), "RECEIVE_NO"); }
    protected abstract ConditionValue xgetCValueReceiveNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_Equal(String shippingPlantCd) {
        doSetShippingPlantCd_Equal(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_Equal(String shippingPlantCd) {
        regShippingPlantCd(CK_EQ, shippingPlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotEqual(String shippingPlantCd) {
        doSetShippingPlantCd_NotEqual(fRES(shippingPlantCd));
    }

    protected void doSetShippingPlantCd_NotEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_NES, shippingPlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterThan(String shippingPlantCd) {
        regShippingPlantCd(CK_GT, fRES(shippingPlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessThan(String shippingPlantCd) {
        regShippingPlantCd(CK_LT, fRES(shippingPlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_GreaterEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_GE, fRES(shippingPlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_LessEqual(String shippingPlantCd) {
        regShippingPlantCd(CK_LE, fRES(shippingPlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_InScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_InScope(Collection<String> shippingPlantCdList) {
        regINS(CK_INS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCdList The collection of shippingPlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        doSetShippingPlantCd_NotInScope(shippingPlantCdList);
    }

    protected void doSetShippingPlantCd_NotInScope(Collection<String> shippingPlantCdList) {
        regINS(CK_NINS, cTL(shippingPlantCdList), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingPlantCd The value of shippingPlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingPlantCd_LikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingPlantCd_NotLikeSearch(String shippingPlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingPlantCd), xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     * @param shippingPlantCd The value of shippingPlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlantCd_PrefixSearch(String shippingPlantCd) {
        setShippingPlantCd_LikeSearch(shippingPlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNull() { regShippingPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNullOrEmpty() { regShippingPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLANT_CD: {VARCHAR(30)}
     */
    public void setShippingPlantCd_IsNotNull() { regShippingPlantCd(CK_ISNN, DOBJ); }

    protected void regShippingPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPlantCd(), "SHIPPING_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueShippingPlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_Equal(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_Equal(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_EQ, shippingStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        doSetShippingStorageSpaceCd_NotEqual(fRES(shippingStorageSpaceCd));
    }

    protected void doSetShippingStorageSpaceCd_NotEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_NES, shippingStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GT, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessThan(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LT, fRES(shippingStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_GreaterEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_GE, fRES(shippingStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_LessEqual(String shippingStorageSpaceCd) {
        regShippingStorageSpaceCd(CK_LE, fRES(shippingStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_InScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_InScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_INS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCdList The collection of shippingStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        doSetShippingStorageSpaceCd_NotInScope(shippingStorageSpaceCdList);
    }

    protected void doSetShippingStorageSpaceCd_NotInScope(Collection<String> shippingStorageSpaceCdList) {
        regINS(CK_NINS, cTL(shippingStorageSpaceCdList), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_LikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingStorageSpaceCd_NotLikeSearch(String shippingStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingStorageSpaceCd), xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param shippingStorageSpaceCd The value of shippingStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStorageSpaceCd_PrefixSearch(String shippingStorageSpaceCd) {
        setShippingStorageSpaceCd_LikeSearch(shippingStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNull() { regShippingStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNullOrEmpty() { regShippingStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setShippingStorageSpaceCd_IsNotNull() { regShippingStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regShippingStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStorageSpaceCd(), "SHIPPING_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueShippingStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_Equal(String storePlantCd) {
        doSetStorePlantCd_Equal(fRES(storePlantCd));
    }

    protected void doSetStorePlantCd_Equal(String storePlantCd) {
        regStorePlantCd(CK_EQ, storePlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_NotEqual(String storePlantCd) {
        doSetStorePlantCd_NotEqual(fRES(storePlantCd));
    }

    protected void doSetStorePlantCd_NotEqual(String storePlantCd) {
        regStorePlantCd(CK_NES, storePlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterThan(String storePlantCd) {
        regStorePlantCd(CK_GT, fRES(storePlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessThan(String storePlantCd) {
        regStorePlantCd(CK_LT, fRES(storePlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterEqual(String storePlantCd) {
        regStorePlantCd(CK_GE, fRES(storePlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessEqual(String storePlantCd) {
        regStorePlantCd(CK_LE, fRES(storePlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCdList The collection of storePlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_InScope(Collection<String> storePlantCdList) {
        doSetStorePlantCd_InScope(storePlantCdList);
    }

    protected void doSetStorePlantCd_InScope(Collection<String> storePlantCdList) {
        regINS(CK_INS, cTL(storePlantCdList), xgetCValueStorePlantCd(), "STORE_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCdList The collection of storePlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_NotInScope(Collection<String> storePlantCdList) {
        doSetStorePlantCd_NotInScope(storePlantCdList);
    }

    protected void doSetStorePlantCd_NotInScope(Collection<String> storePlantCdList) {
        regINS(CK_NINS, cTL(storePlantCdList), xgetCValueStorePlantCd(), "STORE_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setStorePlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storePlantCd The value of storePlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorePlantCd_LikeSearch(String storePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storePlantCd), xgetCValueStorePlantCd(), "STORE_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorePlantCd_NotLikeSearch(String storePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storePlantCd), xgetCValueStorePlantCd(), "STORE_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_PrefixSearch(String storePlantCd) {
        setStorePlantCd_LikeSearch(storePlantCd, xcLSOPPre());
    }

    protected void regStorePlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorePlantCd(), "STORE_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueStorePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_Equal(String storeStorageSpaceCd) {
        doSetStoreStorageSpaceCd_Equal(fRES(storeStorageSpaceCd));
    }

    protected void doSetStoreStorageSpaceCd_Equal(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_EQ, storeStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_NotEqual(String storeStorageSpaceCd) {
        doSetStoreStorageSpaceCd_NotEqual(fRES(storeStorageSpaceCd));
    }

    protected void doSetStoreStorageSpaceCd_NotEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_NES, storeStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GT, fRES(storeStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LT, fRES(storeStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GE, fRES(storeStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LE, fRES(storeStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCdList The collection of storeStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_InScope(Collection<String> storeStorageSpaceCdList) {
        doSetStoreStorageSpaceCd_InScope(storeStorageSpaceCdList);
    }

    protected void doSetStoreStorageSpaceCd_InScope(Collection<String> storeStorageSpaceCdList) {
        regINS(CK_INS, cTL(storeStorageSpaceCdList), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCdList The collection of storeStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_NotInScope(Collection<String> storeStorageSpaceCdList) {
        doSetStoreStorageSpaceCd_NotInScope(storeStorageSpaceCdList);
    }

    protected void doSetStoreStorageSpaceCd_NotInScope(Collection<String> storeStorageSpaceCdList) {
        regINS(CK_NINS, cTL(storeStorageSpaceCdList), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setStoreStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStoreStorageSpaceCd_LikeSearch(String storeStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storeStorageSpaceCd), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreStorageSpaceCd_NotLikeSearch(String storeStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeStorageSpaceCd), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_PrefixSearch(String storeStorageSpaceCd) {
        setStoreStorageSpaceCd_LikeSearch(storeStorageSpaceCd, xcLSOPPre());
    }

    protected void regStoreStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStoreStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_Equal(String tenhanshaCd) {
        doSetTenhanshaCd_Equal(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_Equal(String tenhanshaCd) {
        regTenhanshaCd(CK_EQ, tenhanshaCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotEqual(String tenhanshaCd) {
        doSetTenhanshaCd_NotEqual(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_NotEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_NES, tenhanshaCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterThan(String tenhanshaCd) {
        regTenhanshaCd(CK_GT, fRES(tenhanshaCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessThan(String tenhanshaCd) {
        regTenhanshaCd(CK_LT, fRES(tenhanshaCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_GE, fRES(tenhanshaCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_LE, fRES(tenhanshaCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_InScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        regINS(CK_INS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_NotInScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        regINS(CK_NINS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaCd The value of tenhanshaCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaCd_LikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaCd_NotLikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_PrefixSearch(String tenhanshaCd) {
        setTenhanshaCd_LikeSearch(tenhanshaCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNull() { regTenhanshaCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNullOrEmpty() { regTenhanshaCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNotNull() { regTenhanshaCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaCd(), "TENHANSHA_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaCd();

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
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_Equal(String sanshaDeliverySlipNo1) {
        doSetSanshaDeliverySlipNo1_Equal(fRES(sanshaDeliverySlipNo1));
    }

    protected void doSetSanshaDeliverySlipNo1_Equal(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_EQ, sanshaDeliverySlipNo1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_NotEqual(String sanshaDeliverySlipNo1) {
        doSetSanshaDeliverySlipNo1_NotEqual(fRES(sanshaDeliverySlipNo1));
    }

    protected void doSetSanshaDeliverySlipNo1_NotEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_NES, sanshaDeliverySlipNo1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_GreaterThan(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_GT, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_LessThan(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_LT, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_GreaterEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_GE, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_LessEqual(String sanshaDeliverySlipNo1) {
        regSanshaDeliverySlipNo1(CK_LE, fRES(sanshaDeliverySlipNo1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1List The collection of sanshaDeliverySlipNo1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_InScope(Collection<String> sanshaDeliverySlipNo1List) {
        doSetSanshaDeliverySlipNo1_InScope(sanshaDeliverySlipNo1List);
    }

    protected void doSetSanshaDeliverySlipNo1_InScope(Collection<String> sanshaDeliverySlipNo1List) {
        regINS(CK_INS, cTL(sanshaDeliverySlipNo1List), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1List The collection of sanshaDeliverySlipNo1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_NotInScope(Collection<String> sanshaDeliverySlipNo1List) {
        doSetSanshaDeliverySlipNo1_NotInScope(sanshaDeliverySlipNo1List);
    }

    protected void doSetSanshaDeliverySlipNo1_NotInScope(Collection<String> sanshaDeliverySlipNo1List) {
        regINS(CK_NINS, cTL(sanshaDeliverySlipNo1List), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)} <br>
     * <pre>e.g. setSanshaDeliverySlipNo1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSanshaDeliverySlipNo1_LikeSearch(String sanshaDeliverySlipNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sanshaDeliverySlipNo1), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSanshaDeliverySlipNo1_NotLikeSearch(String sanshaDeliverySlipNo1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sanshaDeliverySlipNo1), xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     * @param sanshaDeliverySlipNo1 The value of sanshaDeliverySlipNo1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaDeliverySlipNo1_PrefixSearch(String sanshaDeliverySlipNo1) {
        setSanshaDeliverySlipNo1_LikeSearch(sanshaDeliverySlipNo1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNull() { regSanshaDeliverySlipNo1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNullOrEmpty() { regSanshaDeliverySlipNo1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
     */
    public void setSanshaDeliverySlipNo1_IsNotNull() { regSanshaDeliverySlipNo1(CK_ISNN, DOBJ); }

    protected void regSanshaDeliverySlipNo1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaDeliverySlipNo1(), "SANSHA_DELIVERY_SLIP_NO1"); }
    protected abstract ConditionValue xgetCValueSanshaDeliverySlipNo1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_Equal(String dataTypeCd) {
        doSetDataTypeCd_Equal(fRES(dataTypeCd));
    }

    protected void doSetDataTypeCd_Equal(String dataTypeCd) {
        regDataTypeCd(CK_EQ, dataTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_NotEqual(String dataTypeCd) {
        doSetDataTypeCd_NotEqual(fRES(dataTypeCd));
    }

    protected void doSetDataTypeCd_NotEqual(String dataTypeCd) {
        regDataTypeCd(CK_NES, dataTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_GreaterThan(String dataTypeCd) {
        regDataTypeCd(CK_GT, fRES(dataTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_LessThan(String dataTypeCd) {
        regDataTypeCd(CK_LT, fRES(dataTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_GreaterEqual(String dataTypeCd) {
        regDataTypeCd(CK_GE, fRES(dataTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_LessEqual(String dataTypeCd) {
        regDataTypeCd(CK_LE, fRES(dataTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCdList The collection of dataTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_InScope(Collection<String> dataTypeCdList) {
        doSetDataTypeCd_InScope(dataTypeCdList);
    }

    protected void doSetDataTypeCd_InScope(Collection<String> dataTypeCdList) {
        regINS(CK_INS, cTL(dataTypeCdList), xgetCValueDataTypeCd(), "DATA_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCdList The collection of dataTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_NotInScope(Collection<String> dataTypeCdList) {
        doSetDataTypeCd_NotInScope(dataTypeCdList);
    }

    protected void doSetDataTypeCd_NotInScope(Collection<String> dataTypeCdList) {
        regINS(CK_NINS, cTL(dataTypeCdList), xgetCValueDataTypeCd(), "DATA_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTypeCd The value of dataTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTypeCd_LikeSearch(String dataTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTypeCd), xgetCValueDataTypeCd(), "DATA_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTypeCd_NotLikeSearch(String dataTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTypeCd), xgetCValueDataTypeCd(), "DATA_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     * @param dataTypeCd The value of dataTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTypeCd_PrefixSearch(String dataTypeCd) {
        setDataTypeCd_LikeSearch(dataTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNull() { regDataTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNullOrEmpty() { regDataTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE_CD: {VARCHAR(30)}
     */
    public void setDataTypeCd_IsNotNull() { regDataTypeCd(CK_ISNN, DOBJ); }

    protected void regDataTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTypeCd(), "DATA_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDataTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_Equal(String processTypeCd) {
        doSetProcessTypeCd_Equal(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_Equal(String processTypeCd) {
        regProcessTypeCd(CK_EQ, processTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotEqual(String processTypeCd) {
        doSetProcessTypeCd_NotEqual(fRES(processTypeCd));
    }

    protected void doSetProcessTypeCd_NotEqual(String processTypeCd) {
        regProcessTypeCd(CK_NES, processTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterThan(String processTypeCd) {
        regProcessTypeCd(CK_GT, fRES(processTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessThan(String processTypeCd) {
        regProcessTypeCd(CK_LT, fRES(processTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_GreaterEqual(String processTypeCd) {
        regProcessTypeCd(CK_GE, fRES(processTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_LessEqual(String processTypeCd) {
        regProcessTypeCd(CK_LE, fRES(processTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCdList The collection of processTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_InScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_InScope(Collection<String> processTypeCdList) {
        regINS(CK_INS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCdList The collection of processTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        doSetProcessTypeCd_NotInScope(processTypeCdList);
    }

    protected void doSetProcessTypeCd_NotInScope(Collection<String> processTypeCdList) {
        regINS(CK_NINS, cTL(processTypeCdList), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setProcessTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param processTypeCd The value of processTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProcessTypeCd_LikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProcessTypeCd_NotLikeSearch(String processTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(processTypeCd), xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     * @param processTypeCd The value of processTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeCd_PrefixSearch(String processTypeCd) {
        setProcessTypeCd_LikeSearch(processTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNull() { regProcessTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNullOrEmpty() { regProcessTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESS_TYPE_CD: {VARCHAR(30)}
     */
    public void setProcessTypeCd_IsNotNull() { regProcessTypeCd(CK_ISNN, DOBJ); }

    protected void regProcessTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeCd(), "PROCESS_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProcessTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_Equal(String slipNo) {
        doSetSlipNo_Equal(fRES(slipNo));
    }

    protected void doSetSlipNo_Equal(String slipNo) {
        regSlipNo(CK_EQ, slipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotEqual(String slipNo) {
        doSetSlipNo_NotEqual(fRES(slipNo));
    }

    protected void doSetSlipNo_NotEqual(String slipNo) {
        regSlipNo(CK_NES, slipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterThan(String slipNo) {
        regSlipNo(CK_GT, fRES(slipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessThan(String slipNo) {
        regSlipNo(CK_LT, fRES(slipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_GreaterEqual(String slipNo) {
        regSlipNo(CK_GE, fRES(slipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_LessEqual(String slipNo) {
        regSlipNo(CK_LE, fRES(slipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNoList The collection of slipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_InScope(Collection<String> slipNoList) {
        doSetSlipNo_InScope(slipNoList);
    }

    protected void doSetSlipNo_InScope(Collection<String> slipNoList) {
        regINS(CK_INS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNoList The collection of slipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_NotInScope(Collection<String> slipNoList) {
        doSetSlipNo_NotInScope(slipNoList);
    }

    protected void doSetSlipNo_NotInScope(Collection<String> slipNoList) {
        regINS(CK_NINS, cTL(slipNoList), xgetCValueSlipNo(), "SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipNo The value of slipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipNo_LikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipNo_NotLikeSearch(String slipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipNo), xgetCValueSlipNo(), "SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     * @param slipNo The value of slipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipNo_PrefixSearch(String slipNo) {
        setSlipNo_LikeSearch(slipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNull() { regSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNullOrEmpty() { regSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_NO: {VARCHAR(30)}
     */
    public void setSlipNo_IsNotNull() { regSlipNo(CK_ISNN, DOBJ); }

    protected void regSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipNo(), "SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_Equal(String wmsAddYyyy) {
        doSetWmsAddYyyy_Equal(fRES(wmsAddYyyy));
    }

    protected void doSetWmsAddYyyy_Equal(String wmsAddYyyy) {
        regWmsAddYyyy(CK_EQ, wmsAddYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_NotEqual(String wmsAddYyyy) {
        doSetWmsAddYyyy_NotEqual(fRES(wmsAddYyyy));
    }

    protected void doSetWmsAddYyyy_NotEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_NES, wmsAddYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_GreaterThan(String wmsAddYyyy) {
        regWmsAddYyyy(CK_GT, fRES(wmsAddYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_LessThan(String wmsAddYyyy) {
        regWmsAddYyyy(CK_LT, fRES(wmsAddYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_GreaterEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_GE, fRES(wmsAddYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_LessEqual(String wmsAddYyyy) {
        regWmsAddYyyy(CK_LE, fRES(wmsAddYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyyList The collection of wmsAddYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_InScope(Collection<String> wmsAddYyyyList) {
        doSetWmsAddYyyy_InScope(wmsAddYyyyList);
    }

    protected void doSetWmsAddYyyy_InScope(Collection<String> wmsAddYyyyList) {
        regINS(CK_INS, cTL(wmsAddYyyyList), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyyList The collection of wmsAddYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_NotInScope(Collection<String> wmsAddYyyyList) {
        doSetWmsAddYyyy_NotInScope(wmsAddYyyyList);
    }

    protected void doSetWmsAddYyyy_NotInScope(Collection<String> wmsAddYyyyList) {
        regINS(CK_NINS, cTL(wmsAddYyyyList), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddYyyy The value of wmsAddYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddYyyy_LikeSearch(String wmsAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddYyyy), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddYyyy_NotLikeSearch(String wmsAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddYyyy), xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     * @param wmsAddYyyy The value of wmsAddYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddYyyy_PrefixSearch(String wmsAddYyyy) {
        setWmsAddYyyy_LikeSearch(wmsAddYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNull() { regWmsAddYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNullOrEmpty() { regWmsAddYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_YYYY: {VARCHAR(30)}
     */
    public void setWmsAddYyyy_IsNotNull() { regWmsAddYyyy(CK_ISNN, DOBJ); }

    protected void regWmsAddYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddYyyy(), "WMS_ADD_YYYY"); }
    protected abstract ConditionValue xgetCValueWmsAddYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_Equal(String wmsAddMm) {
        doSetWmsAddMm_Equal(fRES(wmsAddMm));
    }

    protected void doSetWmsAddMm_Equal(String wmsAddMm) {
        regWmsAddMm(CK_EQ, wmsAddMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_NotEqual(String wmsAddMm) {
        doSetWmsAddMm_NotEqual(fRES(wmsAddMm));
    }

    protected void doSetWmsAddMm_NotEqual(String wmsAddMm) {
        regWmsAddMm(CK_NES, wmsAddMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_GreaterThan(String wmsAddMm) {
        regWmsAddMm(CK_GT, fRES(wmsAddMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_LessThan(String wmsAddMm) {
        regWmsAddMm(CK_LT, fRES(wmsAddMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_GreaterEqual(String wmsAddMm) {
        regWmsAddMm(CK_GE, fRES(wmsAddMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_LessEqual(String wmsAddMm) {
        regWmsAddMm(CK_LE, fRES(wmsAddMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMmList The collection of wmsAddMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_InScope(Collection<String> wmsAddMmList) {
        doSetWmsAddMm_InScope(wmsAddMmList);
    }

    protected void doSetWmsAddMm_InScope(Collection<String> wmsAddMmList) {
        regINS(CK_INS, cTL(wmsAddMmList), xgetCValueWmsAddMm(), "WMS_ADD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMmList The collection of wmsAddMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_NotInScope(Collection<String> wmsAddMmList) {
        doSetWmsAddMm_NotInScope(wmsAddMmList);
    }

    protected void doSetWmsAddMm_NotInScope(Collection<String> wmsAddMmList) {
        regINS(CK_NINS, cTL(wmsAddMmList), xgetCValueWmsAddMm(), "WMS_ADD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddMm The value of wmsAddMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddMm_LikeSearch(String wmsAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddMm), xgetCValueWmsAddMm(), "WMS_ADD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddMm_NotLikeSearch(String wmsAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddMm), xgetCValueWmsAddMm(), "WMS_ADD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     * @param wmsAddMm The value of wmsAddMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMm_PrefixSearch(String wmsAddMm) {
        setWmsAddMm_LikeSearch(wmsAddMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNull() { regWmsAddMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNullOrEmpty() { regWmsAddMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MM: {VARCHAR(30)}
     */
    public void setWmsAddMm_IsNotNull() { regWmsAddMm(CK_ISNN, DOBJ); }

    protected void regWmsAddMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddMm(), "WMS_ADD_MM"); }
    protected abstract ConditionValue xgetCValueWmsAddMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_Equal(String wmsAddDd) {
        doSetWmsAddDd_Equal(fRES(wmsAddDd));
    }

    protected void doSetWmsAddDd_Equal(String wmsAddDd) {
        regWmsAddDd(CK_EQ, wmsAddDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_NotEqual(String wmsAddDd) {
        doSetWmsAddDd_NotEqual(fRES(wmsAddDd));
    }

    protected void doSetWmsAddDd_NotEqual(String wmsAddDd) {
        regWmsAddDd(CK_NES, wmsAddDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_GreaterThan(String wmsAddDd) {
        regWmsAddDd(CK_GT, fRES(wmsAddDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_LessThan(String wmsAddDd) {
        regWmsAddDd(CK_LT, fRES(wmsAddDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_GreaterEqual(String wmsAddDd) {
        regWmsAddDd(CK_GE, fRES(wmsAddDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_LessEqual(String wmsAddDd) {
        regWmsAddDd(CK_LE, fRES(wmsAddDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDdList The collection of wmsAddDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_InScope(Collection<String> wmsAddDdList) {
        doSetWmsAddDd_InScope(wmsAddDdList);
    }

    protected void doSetWmsAddDd_InScope(Collection<String> wmsAddDdList) {
        regINS(CK_INS, cTL(wmsAddDdList), xgetCValueWmsAddDd(), "WMS_ADD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDdList The collection of wmsAddDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_NotInScope(Collection<String> wmsAddDdList) {
        doSetWmsAddDd_NotInScope(wmsAddDdList);
    }

    protected void doSetWmsAddDd_NotInScope(Collection<String> wmsAddDdList) {
        regINS(CK_NINS, cTL(wmsAddDdList), xgetCValueWmsAddDd(), "WMS_ADD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddDd The value of wmsAddDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddDd_LikeSearch(String wmsAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddDd), xgetCValueWmsAddDd(), "WMS_ADD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddDd_NotLikeSearch(String wmsAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddDd), xgetCValueWmsAddDd(), "WMS_ADD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     * @param wmsAddDd The value of wmsAddDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddDd_PrefixSearch(String wmsAddDd) {
        setWmsAddDd_LikeSearch(wmsAddDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNull() { regWmsAddDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNullOrEmpty() { regWmsAddDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_DD: {VARCHAR(30)}
     */
    public void setWmsAddDd_IsNotNull() { regWmsAddDd(CK_ISNN, DOBJ); }

    protected void regWmsAddDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddDd(), "WMS_ADD_DD"); }
    protected abstract ConditionValue xgetCValueWmsAddDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_Equal(String wmsAddHh) {
        doSetWmsAddHh_Equal(fRES(wmsAddHh));
    }

    protected void doSetWmsAddHh_Equal(String wmsAddHh) {
        regWmsAddHh(CK_EQ, wmsAddHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_NotEqual(String wmsAddHh) {
        doSetWmsAddHh_NotEqual(fRES(wmsAddHh));
    }

    protected void doSetWmsAddHh_NotEqual(String wmsAddHh) {
        regWmsAddHh(CK_NES, wmsAddHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_GreaterThan(String wmsAddHh) {
        regWmsAddHh(CK_GT, fRES(wmsAddHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_LessThan(String wmsAddHh) {
        regWmsAddHh(CK_LT, fRES(wmsAddHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_GreaterEqual(String wmsAddHh) {
        regWmsAddHh(CK_GE, fRES(wmsAddHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_LessEqual(String wmsAddHh) {
        regWmsAddHh(CK_LE, fRES(wmsAddHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHhList The collection of wmsAddHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_InScope(Collection<String> wmsAddHhList) {
        doSetWmsAddHh_InScope(wmsAddHhList);
    }

    protected void doSetWmsAddHh_InScope(Collection<String> wmsAddHhList) {
        regINS(CK_INS, cTL(wmsAddHhList), xgetCValueWmsAddHh(), "WMS_ADD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHhList The collection of wmsAddHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_NotInScope(Collection<String> wmsAddHhList) {
        doSetWmsAddHh_NotInScope(wmsAddHhList);
    }

    protected void doSetWmsAddHh_NotInScope(Collection<String> wmsAddHhList) {
        regINS(CK_NINS, cTL(wmsAddHhList), xgetCValueWmsAddHh(), "WMS_ADD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddHh The value of wmsAddHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddHh_LikeSearch(String wmsAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddHh), xgetCValueWmsAddHh(), "WMS_ADD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddHh_NotLikeSearch(String wmsAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddHh), xgetCValueWmsAddHh(), "WMS_ADD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     * @param wmsAddHh The value of wmsAddHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddHh_PrefixSearch(String wmsAddHh) {
        setWmsAddHh_LikeSearch(wmsAddHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNull() { regWmsAddHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNullOrEmpty() { regWmsAddHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_HH: {VARCHAR(30)}
     */
    public void setWmsAddHh_IsNotNull() { regWmsAddHh(CK_ISNN, DOBJ); }

    protected void regWmsAddHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddHh(), "WMS_ADD_HH"); }
    protected abstract ConditionValue xgetCValueWmsAddHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_Equal(String wmsAddMi) {
        doSetWmsAddMi_Equal(fRES(wmsAddMi));
    }

    protected void doSetWmsAddMi_Equal(String wmsAddMi) {
        regWmsAddMi(CK_EQ, wmsAddMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_NotEqual(String wmsAddMi) {
        doSetWmsAddMi_NotEqual(fRES(wmsAddMi));
    }

    protected void doSetWmsAddMi_NotEqual(String wmsAddMi) {
        regWmsAddMi(CK_NES, wmsAddMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_GreaterThan(String wmsAddMi) {
        regWmsAddMi(CK_GT, fRES(wmsAddMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_LessThan(String wmsAddMi) {
        regWmsAddMi(CK_LT, fRES(wmsAddMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_GreaterEqual(String wmsAddMi) {
        regWmsAddMi(CK_GE, fRES(wmsAddMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_LessEqual(String wmsAddMi) {
        regWmsAddMi(CK_LE, fRES(wmsAddMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMiList The collection of wmsAddMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_InScope(Collection<String> wmsAddMiList) {
        doSetWmsAddMi_InScope(wmsAddMiList);
    }

    protected void doSetWmsAddMi_InScope(Collection<String> wmsAddMiList) {
        regINS(CK_INS, cTL(wmsAddMiList), xgetCValueWmsAddMi(), "WMS_ADD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMiList The collection of wmsAddMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_NotInScope(Collection<String> wmsAddMiList) {
        doSetWmsAddMi_NotInScope(wmsAddMiList);
    }

    protected void doSetWmsAddMi_NotInScope(Collection<String> wmsAddMiList) {
        regINS(CK_NINS, cTL(wmsAddMiList), xgetCValueWmsAddMi(), "WMS_ADD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddMi The value of wmsAddMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddMi_LikeSearch(String wmsAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddMi), xgetCValueWmsAddMi(), "WMS_ADD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddMi_NotLikeSearch(String wmsAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddMi), xgetCValueWmsAddMi(), "WMS_ADD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     * @param wmsAddMi The value of wmsAddMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddMi_PrefixSearch(String wmsAddMi) {
        setWmsAddMi_LikeSearch(wmsAddMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNull() { regWmsAddMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNullOrEmpty() { regWmsAddMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_MI: {VARCHAR(30)}
     */
    public void setWmsAddMi_IsNotNull() { regWmsAddMi(CK_ISNN, DOBJ); }

    protected void regWmsAddMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddMi(), "WMS_ADD_MI"); }
    protected abstract ConditionValue xgetCValueWmsAddMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_Equal(String wmsAddSs) {
        doSetWmsAddSs_Equal(fRES(wmsAddSs));
    }

    protected void doSetWmsAddSs_Equal(String wmsAddSs) {
        regWmsAddSs(CK_EQ, wmsAddSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_NotEqual(String wmsAddSs) {
        doSetWmsAddSs_NotEqual(fRES(wmsAddSs));
    }

    protected void doSetWmsAddSs_NotEqual(String wmsAddSs) {
        regWmsAddSs(CK_NES, wmsAddSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_GreaterThan(String wmsAddSs) {
        regWmsAddSs(CK_GT, fRES(wmsAddSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_LessThan(String wmsAddSs) {
        regWmsAddSs(CK_LT, fRES(wmsAddSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_GreaterEqual(String wmsAddSs) {
        regWmsAddSs(CK_GE, fRES(wmsAddSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_LessEqual(String wmsAddSs) {
        regWmsAddSs(CK_LE, fRES(wmsAddSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSsList The collection of wmsAddSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_InScope(Collection<String> wmsAddSsList) {
        doSetWmsAddSs_InScope(wmsAddSsList);
    }

    protected void doSetWmsAddSs_InScope(Collection<String> wmsAddSsList) {
        regINS(CK_INS, cTL(wmsAddSsList), xgetCValueWmsAddSs(), "WMS_ADD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSsList The collection of wmsAddSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_NotInScope(Collection<String> wmsAddSsList) {
        doSetWmsAddSs_NotInScope(wmsAddSsList);
    }

    protected void doSetWmsAddSs_NotInScope(Collection<String> wmsAddSsList) {
        regINS(CK_NINS, cTL(wmsAddSsList), xgetCValueWmsAddSs(), "WMS_ADD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddSs The value of wmsAddSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddSs_LikeSearch(String wmsAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddSs), xgetCValueWmsAddSs(), "WMS_ADD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddSs_NotLikeSearch(String wmsAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddSs), xgetCValueWmsAddSs(), "WMS_ADD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     * @param wmsAddSs The value of wmsAddSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddSs_PrefixSearch(String wmsAddSs) {
        setWmsAddSs_LikeSearch(wmsAddSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNull() { regWmsAddSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNullOrEmpty() { regWmsAddSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_SS: {VARCHAR(30)}
     */
    public void setWmsAddSs_IsNotNull() { regWmsAddSs(CK_ISNN, DOBJ); }

    protected void regWmsAddSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddSs(), "WMS_ADD_SS"); }
    protected abstract ConditionValue xgetCValueWmsAddSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_Equal(String wmsAddUserNm) {
        doSetWmsAddUserNm_Equal(fRES(wmsAddUserNm));
    }

    protected void doSetWmsAddUserNm_Equal(String wmsAddUserNm) {
        regWmsAddUserNm(CK_EQ, wmsAddUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_NotEqual(String wmsAddUserNm) {
        doSetWmsAddUserNm_NotEqual(fRES(wmsAddUserNm));
    }

    protected void doSetWmsAddUserNm_NotEqual(String wmsAddUserNm) {
        regWmsAddUserNm(CK_NES, wmsAddUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_GreaterThan(String wmsAddUserNm) {
        regWmsAddUserNm(CK_GT, fRES(wmsAddUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_LessThan(String wmsAddUserNm) {
        regWmsAddUserNm(CK_LT, fRES(wmsAddUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_GreaterEqual(String wmsAddUserNm) {
        regWmsAddUserNm(CK_GE, fRES(wmsAddUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_LessEqual(String wmsAddUserNm) {
        regWmsAddUserNm(CK_LE, fRES(wmsAddUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNmList The collection of wmsAddUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_InScope(Collection<String> wmsAddUserNmList) {
        doSetWmsAddUserNm_InScope(wmsAddUserNmList);
    }

    protected void doSetWmsAddUserNm_InScope(Collection<String> wmsAddUserNmList) {
        regINS(CK_INS, cTL(wmsAddUserNmList), xgetCValueWmsAddUserNm(), "WMS_ADD_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNmList The collection of wmsAddUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_NotInScope(Collection<String> wmsAddUserNmList) {
        doSetWmsAddUserNm_NotInScope(wmsAddUserNmList);
    }

    protected void doSetWmsAddUserNm_NotInScope(Collection<String> wmsAddUserNmList) {
        regINS(CK_NINS, cTL(wmsAddUserNmList), xgetCValueWmsAddUserNm(), "WMS_ADD_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setWmsAddUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddUserNm The value of wmsAddUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddUserNm_LikeSearch(String wmsAddUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddUserNm), xgetCValueWmsAddUserNm(), "WMS_ADD_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddUserNm_NotLikeSearch(String wmsAddUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddUserNm), xgetCValueWmsAddUserNm(), "WMS_ADD_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     * @param wmsAddUserNm The value of wmsAddUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserNm_PrefixSearch(String wmsAddUserNm) {
        setWmsAddUserNm_LikeSearch(wmsAddUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsAddUserNm_IsNull() { regWmsAddUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsAddUserNm_IsNullOrEmpty() { regWmsAddUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsAddUserNm_IsNotNull() { regWmsAddUserNm(CK_ISNN, DOBJ); }

    protected void regWmsAddUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddUserNm(), "WMS_ADD_USER_NM"); }
    protected abstract ConditionValue xgetCValueWmsAddUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_Equal(String wmsUpdYyyy) {
        doSetWmsUpdYyyy_Equal(fRES(wmsUpdYyyy));
    }

    protected void doSetWmsUpdYyyy_Equal(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_EQ, wmsUpdYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_NotEqual(String wmsUpdYyyy) {
        doSetWmsUpdYyyy_NotEqual(fRES(wmsUpdYyyy));
    }

    protected void doSetWmsUpdYyyy_NotEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_NES, wmsUpdYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_GreaterThan(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_GT, fRES(wmsUpdYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_LessThan(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_LT, fRES(wmsUpdYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_GreaterEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_GE, fRES(wmsUpdYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_LessEqual(String wmsUpdYyyy) {
        regWmsUpdYyyy(CK_LE, fRES(wmsUpdYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyyList The collection of wmsUpdYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_InScope(Collection<String> wmsUpdYyyyList) {
        doSetWmsUpdYyyy_InScope(wmsUpdYyyyList);
    }

    protected void doSetWmsUpdYyyy_InScope(Collection<String> wmsUpdYyyyList) {
        regINS(CK_INS, cTL(wmsUpdYyyyList), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyyList The collection of wmsUpdYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_NotInScope(Collection<String> wmsUpdYyyyList) {
        doSetWmsUpdYyyy_NotInScope(wmsUpdYyyyList);
    }

    protected void doSetWmsUpdYyyy_NotInScope(Collection<String> wmsUpdYyyyList) {
        regINS(CK_NINS, cTL(wmsUpdYyyyList), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdYyyy The value of wmsUpdYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdYyyy_LikeSearch(String wmsUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdYyyy), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdYyyy_NotLikeSearch(String wmsUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdYyyy), xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     * @param wmsUpdYyyy The value of wmsUpdYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdYyyy_PrefixSearch(String wmsUpdYyyy) {
        setWmsUpdYyyy_LikeSearch(wmsUpdYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNull() { regWmsUpdYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNullOrEmpty() { regWmsUpdYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_YYYY: {VARCHAR(30)}
     */
    public void setWmsUpdYyyy_IsNotNull() { regWmsUpdYyyy(CK_ISNN, DOBJ); }

    protected void regWmsUpdYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdYyyy(), "WMS_UPD_YYYY"); }
    protected abstract ConditionValue xgetCValueWmsUpdYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_Equal(String wmsUpdMm) {
        doSetWmsUpdMm_Equal(fRES(wmsUpdMm));
    }

    protected void doSetWmsUpdMm_Equal(String wmsUpdMm) {
        regWmsUpdMm(CK_EQ, wmsUpdMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_NotEqual(String wmsUpdMm) {
        doSetWmsUpdMm_NotEqual(fRES(wmsUpdMm));
    }

    protected void doSetWmsUpdMm_NotEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_NES, wmsUpdMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_GreaterThan(String wmsUpdMm) {
        regWmsUpdMm(CK_GT, fRES(wmsUpdMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_LessThan(String wmsUpdMm) {
        regWmsUpdMm(CK_LT, fRES(wmsUpdMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_GreaterEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_GE, fRES(wmsUpdMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_LessEqual(String wmsUpdMm) {
        regWmsUpdMm(CK_LE, fRES(wmsUpdMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMmList The collection of wmsUpdMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_InScope(Collection<String> wmsUpdMmList) {
        doSetWmsUpdMm_InScope(wmsUpdMmList);
    }

    protected void doSetWmsUpdMm_InScope(Collection<String> wmsUpdMmList) {
        regINS(CK_INS, cTL(wmsUpdMmList), xgetCValueWmsUpdMm(), "WMS_UPD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMmList The collection of wmsUpdMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_NotInScope(Collection<String> wmsUpdMmList) {
        doSetWmsUpdMm_NotInScope(wmsUpdMmList);
    }

    protected void doSetWmsUpdMm_NotInScope(Collection<String> wmsUpdMmList) {
        regINS(CK_NINS, cTL(wmsUpdMmList), xgetCValueWmsUpdMm(), "WMS_UPD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdMm The value of wmsUpdMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdMm_LikeSearch(String wmsUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdMm), xgetCValueWmsUpdMm(), "WMS_UPD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdMm_NotLikeSearch(String wmsUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdMm), xgetCValueWmsUpdMm(), "WMS_UPD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     * @param wmsUpdMm The value of wmsUpdMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMm_PrefixSearch(String wmsUpdMm) {
        setWmsUpdMm_LikeSearch(wmsUpdMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNull() { regWmsUpdMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNullOrEmpty() { regWmsUpdMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MM: {VARCHAR(30)}
     */
    public void setWmsUpdMm_IsNotNull() { regWmsUpdMm(CK_ISNN, DOBJ); }

    protected void regWmsUpdMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdMm(), "WMS_UPD_MM"); }
    protected abstract ConditionValue xgetCValueWmsUpdMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_Equal(String wmsUpdDd) {
        doSetWmsUpdDd_Equal(fRES(wmsUpdDd));
    }

    protected void doSetWmsUpdDd_Equal(String wmsUpdDd) {
        regWmsUpdDd(CK_EQ, wmsUpdDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_NotEqual(String wmsUpdDd) {
        doSetWmsUpdDd_NotEqual(fRES(wmsUpdDd));
    }

    protected void doSetWmsUpdDd_NotEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_NES, wmsUpdDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_GreaterThan(String wmsUpdDd) {
        regWmsUpdDd(CK_GT, fRES(wmsUpdDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_LessThan(String wmsUpdDd) {
        regWmsUpdDd(CK_LT, fRES(wmsUpdDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_GreaterEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_GE, fRES(wmsUpdDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_LessEqual(String wmsUpdDd) {
        regWmsUpdDd(CK_LE, fRES(wmsUpdDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDdList The collection of wmsUpdDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_InScope(Collection<String> wmsUpdDdList) {
        doSetWmsUpdDd_InScope(wmsUpdDdList);
    }

    protected void doSetWmsUpdDd_InScope(Collection<String> wmsUpdDdList) {
        regINS(CK_INS, cTL(wmsUpdDdList), xgetCValueWmsUpdDd(), "WMS_UPD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDdList The collection of wmsUpdDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_NotInScope(Collection<String> wmsUpdDdList) {
        doSetWmsUpdDd_NotInScope(wmsUpdDdList);
    }

    protected void doSetWmsUpdDd_NotInScope(Collection<String> wmsUpdDdList) {
        regINS(CK_NINS, cTL(wmsUpdDdList), xgetCValueWmsUpdDd(), "WMS_UPD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdDd The value of wmsUpdDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdDd_LikeSearch(String wmsUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdDd), xgetCValueWmsUpdDd(), "WMS_UPD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdDd_NotLikeSearch(String wmsUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdDd), xgetCValueWmsUpdDd(), "WMS_UPD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     * @param wmsUpdDd The value of wmsUpdDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdDd_PrefixSearch(String wmsUpdDd) {
        setWmsUpdDd_LikeSearch(wmsUpdDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNull() { regWmsUpdDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNullOrEmpty() { regWmsUpdDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_DD: {VARCHAR(30)}
     */
    public void setWmsUpdDd_IsNotNull() { regWmsUpdDd(CK_ISNN, DOBJ); }

    protected void regWmsUpdDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdDd(), "WMS_UPD_DD"); }
    protected abstract ConditionValue xgetCValueWmsUpdDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_Equal(String wmsUpdHh) {
        doSetWmsUpdHh_Equal(fRES(wmsUpdHh));
    }

    protected void doSetWmsUpdHh_Equal(String wmsUpdHh) {
        regWmsUpdHh(CK_EQ, wmsUpdHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_NotEqual(String wmsUpdHh) {
        doSetWmsUpdHh_NotEqual(fRES(wmsUpdHh));
    }

    protected void doSetWmsUpdHh_NotEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_NES, wmsUpdHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_GreaterThan(String wmsUpdHh) {
        regWmsUpdHh(CK_GT, fRES(wmsUpdHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_LessThan(String wmsUpdHh) {
        regWmsUpdHh(CK_LT, fRES(wmsUpdHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_GreaterEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_GE, fRES(wmsUpdHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_LessEqual(String wmsUpdHh) {
        regWmsUpdHh(CK_LE, fRES(wmsUpdHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHhList The collection of wmsUpdHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_InScope(Collection<String> wmsUpdHhList) {
        doSetWmsUpdHh_InScope(wmsUpdHhList);
    }

    protected void doSetWmsUpdHh_InScope(Collection<String> wmsUpdHhList) {
        regINS(CK_INS, cTL(wmsUpdHhList), xgetCValueWmsUpdHh(), "WMS_UPD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHhList The collection of wmsUpdHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_NotInScope(Collection<String> wmsUpdHhList) {
        doSetWmsUpdHh_NotInScope(wmsUpdHhList);
    }

    protected void doSetWmsUpdHh_NotInScope(Collection<String> wmsUpdHhList) {
        regINS(CK_NINS, cTL(wmsUpdHhList), xgetCValueWmsUpdHh(), "WMS_UPD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdHh The value of wmsUpdHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdHh_LikeSearch(String wmsUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdHh), xgetCValueWmsUpdHh(), "WMS_UPD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdHh_NotLikeSearch(String wmsUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdHh), xgetCValueWmsUpdHh(), "WMS_UPD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     * @param wmsUpdHh The value of wmsUpdHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdHh_PrefixSearch(String wmsUpdHh) {
        setWmsUpdHh_LikeSearch(wmsUpdHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNull() { regWmsUpdHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNullOrEmpty() { regWmsUpdHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_HH: {VARCHAR(30)}
     */
    public void setWmsUpdHh_IsNotNull() { regWmsUpdHh(CK_ISNN, DOBJ); }

    protected void regWmsUpdHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdHh(), "WMS_UPD_HH"); }
    protected abstract ConditionValue xgetCValueWmsUpdHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_Equal(String wmsUpdMi) {
        doSetWmsUpdMi_Equal(fRES(wmsUpdMi));
    }

    protected void doSetWmsUpdMi_Equal(String wmsUpdMi) {
        regWmsUpdMi(CK_EQ, wmsUpdMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_NotEqual(String wmsUpdMi) {
        doSetWmsUpdMi_NotEqual(fRES(wmsUpdMi));
    }

    protected void doSetWmsUpdMi_NotEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_NES, wmsUpdMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_GreaterThan(String wmsUpdMi) {
        regWmsUpdMi(CK_GT, fRES(wmsUpdMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_LessThan(String wmsUpdMi) {
        regWmsUpdMi(CK_LT, fRES(wmsUpdMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_GreaterEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_GE, fRES(wmsUpdMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_LessEqual(String wmsUpdMi) {
        regWmsUpdMi(CK_LE, fRES(wmsUpdMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMiList The collection of wmsUpdMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_InScope(Collection<String> wmsUpdMiList) {
        doSetWmsUpdMi_InScope(wmsUpdMiList);
    }

    protected void doSetWmsUpdMi_InScope(Collection<String> wmsUpdMiList) {
        regINS(CK_INS, cTL(wmsUpdMiList), xgetCValueWmsUpdMi(), "WMS_UPD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMiList The collection of wmsUpdMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_NotInScope(Collection<String> wmsUpdMiList) {
        doSetWmsUpdMi_NotInScope(wmsUpdMiList);
    }

    protected void doSetWmsUpdMi_NotInScope(Collection<String> wmsUpdMiList) {
        regINS(CK_NINS, cTL(wmsUpdMiList), xgetCValueWmsUpdMi(), "WMS_UPD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdMi The value of wmsUpdMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdMi_LikeSearch(String wmsUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdMi), xgetCValueWmsUpdMi(), "WMS_UPD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdMi_NotLikeSearch(String wmsUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdMi), xgetCValueWmsUpdMi(), "WMS_UPD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     * @param wmsUpdMi The value of wmsUpdMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdMi_PrefixSearch(String wmsUpdMi) {
        setWmsUpdMi_LikeSearch(wmsUpdMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNull() { regWmsUpdMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNullOrEmpty() { regWmsUpdMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_MI: {VARCHAR(30)}
     */
    public void setWmsUpdMi_IsNotNull() { regWmsUpdMi(CK_ISNN, DOBJ); }

    protected void regWmsUpdMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdMi(), "WMS_UPD_MI"); }
    protected abstract ConditionValue xgetCValueWmsUpdMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_Equal(String wmsUpdSs) {
        doSetWmsUpdSs_Equal(fRES(wmsUpdSs));
    }

    protected void doSetWmsUpdSs_Equal(String wmsUpdSs) {
        regWmsUpdSs(CK_EQ, wmsUpdSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_NotEqual(String wmsUpdSs) {
        doSetWmsUpdSs_NotEqual(fRES(wmsUpdSs));
    }

    protected void doSetWmsUpdSs_NotEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_NES, wmsUpdSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_GreaterThan(String wmsUpdSs) {
        regWmsUpdSs(CK_GT, fRES(wmsUpdSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_LessThan(String wmsUpdSs) {
        regWmsUpdSs(CK_LT, fRES(wmsUpdSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_GreaterEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_GE, fRES(wmsUpdSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_LessEqual(String wmsUpdSs) {
        regWmsUpdSs(CK_LE, fRES(wmsUpdSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSsList The collection of wmsUpdSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_InScope(Collection<String> wmsUpdSsList) {
        doSetWmsUpdSs_InScope(wmsUpdSsList);
    }

    protected void doSetWmsUpdSs_InScope(Collection<String> wmsUpdSsList) {
        regINS(CK_INS, cTL(wmsUpdSsList), xgetCValueWmsUpdSs(), "WMS_UPD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSsList The collection of wmsUpdSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_NotInScope(Collection<String> wmsUpdSsList) {
        doSetWmsUpdSs_NotInScope(wmsUpdSsList);
    }

    protected void doSetWmsUpdSs_NotInScope(Collection<String> wmsUpdSsList) {
        regINS(CK_NINS, cTL(wmsUpdSsList), xgetCValueWmsUpdSs(), "WMS_UPD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdSs The value of wmsUpdSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdSs_LikeSearch(String wmsUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdSs), xgetCValueWmsUpdSs(), "WMS_UPD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdSs_NotLikeSearch(String wmsUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdSs), xgetCValueWmsUpdSs(), "WMS_UPD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     * @param wmsUpdSs The value of wmsUpdSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdSs_PrefixSearch(String wmsUpdSs) {
        setWmsUpdSs_LikeSearch(wmsUpdSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNull() { regWmsUpdSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNullOrEmpty() { regWmsUpdSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_SS: {VARCHAR(30)}
     */
    public void setWmsUpdSs_IsNotNull() { regWmsUpdSs(CK_ISNN, DOBJ); }

    protected void regWmsUpdSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdSs(), "WMS_UPD_SS"); }
    protected abstract ConditionValue xgetCValueWmsUpdSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_Equal(String wmsUpdUserNm) {
        doSetWmsUpdUserNm_Equal(fRES(wmsUpdUserNm));
    }

    protected void doSetWmsUpdUserNm_Equal(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_EQ, wmsUpdUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_NotEqual(String wmsUpdUserNm) {
        doSetWmsUpdUserNm_NotEqual(fRES(wmsUpdUserNm));
    }

    protected void doSetWmsUpdUserNm_NotEqual(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_NES, wmsUpdUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_GreaterThan(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_GT, fRES(wmsUpdUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_LessThan(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_LT, fRES(wmsUpdUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_GreaterEqual(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_GE, fRES(wmsUpdUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_LessEqual(String wmsUpdUserNm) {
        regWmsUpdUserNm(CK_LE, fRES(wmsUpdUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNmList The collection of wmsUpdUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_InScope(Collection<String> wmsUpdUserNmList) {
        doSetWmsUpdUserNm_InScope(wmsUpdUserNmList);
    }

    protected void doSetWmsUpdUserNm_InScope(Collection<String> wmsUpdUserNmList) {
        regINS(CK_INS, cTL(wmsUpdUserNmList), xgetCValueWmsUpdUserNm(), "WMS_UPD_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNmList The collection of wmsUpdUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_NotInScope(Collection<String> wmsUpdUserNmList) {
        doSetWmsUpdUserNm_NotInScope(wmsUpdUserNmList);
    }

    protected void doSetWmsUpdUserNm_NotInScope(Collection<String> wmsUpdUserNmList) {
        regINS(CK_NINS, cTL(wmsUpdUserNmList), xgetCValueWmsUpdUserNm(), "WMS_UPD_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setWmsUpdUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdUserNm The value of wmsUpdUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdUserNm_LikeSearch(String wmsUpdUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdUserNm), xgetCValueWmsUpdUserNm(), "WMS_UPD_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdUserNm_NotLikeSearch(String wmsUpdUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdUserNm), xgetCValueWmsUpdUserNm(), "WMS_UPD_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     * @param wmsUpdUserNm The value of wmsUpdUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserNm_PrefixSearch(String wmsUpdUserNm) {
        setWmsUpdUserNm_LikeSearch(wmsUpdUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsUpdUserNm_IsNull() { regWmsUpdUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsUpdUserNm_IsNullOrEmpty() { regWmsUpdUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_NM: {VARCHAR(60)}
     */
    public void setWmsUpdUserNm_IsNotNull() { regWmsUpdUserNm(CK_ISNN, DOBJ); }

    protected void regWmsUpdUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdUserNm(), "WMS_UPD_USER_NM"); }
    protected abstract ConditionValue xgetCValueWmsUpdUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_Equal(String dataTransferOnlyStr01) {
        doSetDataTransferOnlyStr01_Equal(fRES(dataTransferOnlyStr01));
    }

    protected void doSetDataTransferOnlyStr01_Equal(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_EQ, dataTransferOnlyStr01);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_NotEqual(String dataTransferOnlyStr01) {
        doSetDataTransferOnlyStr01_NotEqual(fRES(dataTransferOnlyStr01));
    }

    protected void doSetDataTransferOnlyStr01_NotEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_NES, dataTransferOnlyStr01);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_GreaterThan(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_GT, fRES(dataTransferOnlyStr01));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_LessThan(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_LT, fRES(dataTransferOnlyStr01));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_GreaterEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_GE, fRES(dataTransferOnlyStr01));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_LessEqual(String dataTransferOnlyStr01) {
        regDataTransferOnlyStr01(CK_LE, fRES(dataTransferOnlyStr01));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01List The collection of dataTransferOnlyStr01 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_InScope(Collection<String> dataTransferOnlyStr01List) {
        doSetDataTransferOnlyStr01_InScope(dataTransferOnlyStr01List);
    }

    protected void doSetDataTransferOnlyStr01_InScope(Collection<String> dataTransferOnlyStr01List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr01List), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01List The collection of dataTransferOnlyStr01 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_NotInScope(Collection<String> dataTransferOnlyStr01List) {
        doSetDataTransferOnlyStr01_NotInScope(dataTransferOnlyStr01List);
    }

    protected void doSetDataTransferOnlyStr01_NotInScope(Collection<String> dataTransferOnlyStr01List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr01List), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr01_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr01_LikeSearch(String dataTransferOnlyStr01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr01), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr01_NotLikeSearch(String dataTransferOnlyStr01, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr01), xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     * @param dataTransferOnlyStr01 The value of dataTransferOnlyStr01 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr01_PrefixSearch(String dataTransferOnlyStr01) {
        setDataTransferOnlyStr01_LikeSearch(dataTransferOnlyStr01, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNull() { regDataTransferOnlyStr01(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNullOrEmpty() { regDataTransferOnlyStr01(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr01_IsNotNull() { regDataTransferOnlyStr01(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr01(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr01(), "DATA_TRANSFER_ONLY_STR01"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr01();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_Equal(String spareStr) {
        doSetSpareStr_Equal(fRES(spareStr));
    }

    protected void doSetSpareStr_Equal(String spareStr) {
        regSpareStr(CK_EQ, spareStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotEqual(String spareStr) {
        doSetSpareStr_NotEqual(fRES(spareStr));
    }

    protected void doSetSpareStr_NotEqual(String spareStr) {
        regSpareStr(CK_NES, spareStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterThan(String spareStr) {
        regSpareStr(CK_GT, fRES(spareStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessThan(String spareStr) {
        regSpareStr(CK_LT, fRES(spareStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterEqual(String spareStr) {
        regSpareStr(CK_GE, fRES(spareStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessEqual(String spareStr) {
        regSpareStr(CK_LE, fRES(spareStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_InScope(Collection<String> spareStrList) {
        doSetSpareStr_InScope(spareStrList);
    }

    protected void doSetSpareStr_InScope(Collection<String> spareStrList) {
        regINS(CK_INS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotInScope(Collection<String> spareStrList) {
        doSetSpareStr_NotInScope(spareStrList);
    }

    protected void doSetSpareStr_NotInScope(Collection<String> spareStrList) {
        regINS(CK_NINS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)} <br>
     * <pre>e.g. setSpareStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr The value of spareStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr_LikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr_NotLikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_PrefixSearch(String spareStr) {
        setSpareStr_LikeSearch(spareStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNull() { regSpareStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNullOrEmpty() { regSpareStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNotNull() { regSpareStr(CK_ISNN, DOBJ); }

    protected void regSpareStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr(), "SPARE_STR"); }
    protected abstract ConditionValue xgetCValueSpareStr();

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
    public HpSLCFunction<ErReceiveReportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ErReceiveReportCB.class);
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
    public HpSLCFunction<ErReceiveReportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ErReceiveReportCB.class);
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
    public HpSLCFunction<ErReceiveReportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ErReceiveReportCB.class);
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
    public HpSLCFunction<ErReceiveReportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ErReceiveReportCB.class);
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
    public HpSLCFunction<ErReceiveReportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ErReceiveReportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ErReceiveReportCB&gt;() {
     *     public void query(ErReceiveReportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ErReceiveReportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ErReceiveReportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ErReceiveReportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ErReceiveReportCQ sq);

    protected ErReceiveReportCB xcreateScalarConditionCB() {
        ErReceiveReportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ErReceiveReportCB xcreateScalarConditionPartitionByCB() {
        ErReceiveReportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ErReceiveReportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErReceiveReportCB cb = new ErReceiveReportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_REPORT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ErReceiveReportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ErReceiveReportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ErReceiveReportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErReceiveReportCB cb = new ErReceiveReportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_REPORT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ErReceiveReportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ErReceiveReportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ErReceiveReportCB cb = new ErReceiveReportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ErReceiveReportCQ sq);

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
    protected ErReceiveReportCB newMyCB() {
        return new ErReceiveReportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ErReceiveReportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
