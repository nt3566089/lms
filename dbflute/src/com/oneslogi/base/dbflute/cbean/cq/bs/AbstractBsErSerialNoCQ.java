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
 * The abstract condition-query of er_serial_no.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsErSerialNoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsErSerialNoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "er_serial_no";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_Equal(Long serialNoId) {
        doSetSerialNoId_Equal(serialNoId);
    }

    protected void doSetSerialNoId_Equal(Long serialNoId) {
        regSerialNoId(CK_EQ, serialNoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_NotEqual(Long serialNoId) {
        doSetSerialNoId_NotEqual(serialNoId);
    }

    protected void doSetSerialNoId_NotEqual(Long serialNoId) {
        regSerialNoId(CK_NES, serialNoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_GreaterThan(Long serialNoId) {
        regSerialNoId(CK_GT, serialNoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_LessThan(Long serialNoId) {
        regSerialNoId(CK_LT, serialNoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_GreaterEqual(Long serialNoId) {
        regSerialNoId(CK_GE, serialNoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoId The value of serialNoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialNoId_LessEqual(Long serialNoId) {
        regSerialNoId(CK_LE, serialNoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of serialNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of serialNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSerialNoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSerialNoId(), "SERIAL_NO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoIdList The collection of serialNoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNoId_InScope(Collection<Long> serialNoIdList) {
        doSetSerialNoId_InScope(serialNoIdList);
    }

    protected void doSetSerialNoId_InScope(Collection<Long> serialNoIdList) {
        regINS(CK_INS, cTL(serialNoIdList), xgetCValueSerialNoId(), "SERIAL_NO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     * @param serialNoIdList The collection of serialNoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNoId_NotInScope(Collection<Long> serialNoIdList) {
        doSetSerialNoId_NotInScope(serialNoIdList);
    }

    protected void doSetSerialNoId_NotInScope(Collection<Long> serialNoIdList) {
        regINS(CK_NINS, cTL(serialNoIdList), xgetCValueSerialNoId(), "SERIAL_NO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setSerialNoId_IsNull() { regSerialNoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setSerialNoId_IsNotNull() { regSerialNoId(CK_ISNN, DOBJ); }

    protected void regSerialNoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialNoId(), "SERIAL_NO_ID"); }
    protected abstract ConditionValue xgetCValueSerialNoId();

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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
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
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
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
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_Equal(String shippingSlipNo) {
        doSetShippingSlipNo_Equal(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_Equal(String shippingSlipNo) {
        regShippingSlipNo(CK_EQ, shippingSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotEqual(String shippingSlipNo) {
        doSetShippingSlipNo_NotEqual(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_NotEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_NES, shippingSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterThan(String shippingSlipNo) {
        regShippingSlipNo(CK_GT, fRES(shippingSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessThan(String shippingSlipNo) {
        regShippingSlipNo(CK_LT, fRES(shippingSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_GE, fRES(shippingSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_LE, fRES(shippingSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_InScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        regINS(CK_INS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_NotInScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        regINS(CK_NINS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipNo The value of shippingSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipNo_LikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipNo_NotLikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        setShippingSlipNo_LikeSearch(shippingSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNull() { regShippingSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNullOrEmpty() { regShippingSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNotNull() { regShippingSlipNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_Equal(String shippingSlipRowNo) {
        doSetShippingSlipRowNo_Equal(fRES(shippingSlipRowNo));
    }

    protected void doSetShippingSlipRowNo_Equal(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_EQ, shippingSlipRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_NotEqual(String shippingSlipRowNo) {
        doSetShippingSlipRowNo_NotEqual(fRES(shippingSlipRowNo));
    }

    protected void doSetShippingSlipRowNo_NotEqual(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_NES, shippingSlipRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_GreaterThan(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_GT, fRES(shippingSlipRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_LessThan(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_LT, fRES(shippingSlipRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_GreaterEqual(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_GE, fRES(shippingSlipRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_LessEqual(String shippingSlipRowNo) {
        regShippingSlipRowNo(CK_LE, fRES(shippingSlipRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNoList The collection of shippingSlipRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_InScope(Collection<String> shippingSlipRowNoList) {
        doSetShippingSlipRowNo_InScope(shippingSlipRowNoList);
    }

    protected void doSetShippingSlipRowNo_InScope(Collection<String> shippingSlipRowNoList) {
        regINS(CK_INS, cTL(shippingSlipRowNoList), xgetCValueShippingSlipRowNo(), "SHIPPING_SLIP_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNoList The collection of shippingSlipRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_NotInScope(Collection<String> shippingSlipRowNoList) {
        doSetShippingSlipRowNo_NotInScope(shippingSlipRowNoList);
    }

    protected void doSetShippingSlipRowNo_NotInScope(Collection<String> shippingSlipRowNoList) {
        regINS(CK_NINS, cTL(shippingSlipRowNoList), xgetCValueShippingSlipRowNo(), "SHIPPING_SLIP_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingSlipRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipRowNo The value of shippingSlipRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipRowNo_LikeSearch(String shippingSlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipRowNo), xgetCValueShippingSlipRowNo(), "SHIPPING_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipRowNo_NotLikeSearch(String shippingSlipRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipRowNo), xgetCValueShippingSlipRowNo(), "SHIPPING_SLIP_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     * @param shippingSlipRowNo The value of shippingSlipRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNo_PrefixSearch(String shippingSlipRowNo) {
        setShippingSlipRowNo_LikeSearch(shippingSlipRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingSlipRowNo_IsNull() { regShippingSlipRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingSlipRowNo_IsNullOrEmpty() { regShippingSlipRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
     */
    public void setShippingSlipRowNo_IsNotNull() { regShippingSlipRowNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipRowNo(), "SHIPPING_SLIP_ROW_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_Equal(String serialNo) {
        doSetSerialNo_Equal(fRES(serialNo));
    }

    protected void doSetSerialNo_Equal(String serialNo) {
        regSerialNo(CK_EQ, serialNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_NotEqual(String serialNo) {
        doSetSerialNo_NotEqual(fRES(serialNo));
    }

    protected void doSetSerialNo_NotEqual(String serialNo) {
        regSerialNo(CK_NES, serialNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_GreaterThan(String serialNo) {
        regSerialNo(CK_GT, fRES(serialNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_LessThan(String serialNo) {
        regSerialNo(CK_LT, fRES(serialNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_GreaterEqual(String serialNo) {
        regSerialNo(CK_GE, fRES(serialNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_LessEqual(String serialNo) {
        regSerialNo(CK_LE, fRES(serialNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNoList The collection of serialNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_InScope(Collection<String> serialNoList) {
        doSetSerialNo_InScope(serialNoList);
    }

    protected void doSetSerialNo_InScope(Collection<String> serialNoList) {
        regINS(CK_INS, cTL(serialNoList), xgetCValueSerialNo(), "SERIAL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNoList The collection of serialNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_NotInScope(Collection<String> serialNoList) {
        doSetSerialNo_NotInScope(serialNoList);
    }

    protected void doSetSerialNo_NotInScope(Collection<String> serialNoList) {
        regINS(CK_NINS, cTL(serialNoList), xgetCValueSerialNo(), "SERIAL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)} <br>
     * <pre>e.g. setSerialNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param serialNo The value of serialNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSerialNo_LikeSearch(String serialNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(serialNo), xgetCValueSerialNo(), "SERIAL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSerialNo_NotLikeSearch(String serialNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(serialNo), xgetCValueSerialNo(), "SERIAL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     * @param serialNo The value of serialNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialNo_PrefixSearch(String serialNo) {
        setSerialNo_LikeSearch(serialNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     */
    public void setSerialNo_IsNull() { regSerialNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     */
    public void setSerialNo_IsNullOrEmpty() { regSerialNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SERIAL_NO: {VARCHAR(100)}
     */
    public void setSerialNo_IsNotNull() { regSerialNo(CK_ISNN, DOBJ); }

    protected void regSerialNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialNo(), "SERIAL_NO"); }
    protected abstract ConditionValue xgetCValueSerialNo();

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
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_Equal(String hinmokuGroup) {
        doSetHinmokuGroup_Equal(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_Equal(String hinmokuGroup) {
        regHinmokuGroup(CK_EQ, hinmokuGroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotEqual(String hinmokuGroup) {
        doSetHinmokuGroup_NotEqual(fRES(hinmokuGroup));
    }

    protected void doSetHinmokuGroup_NotEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_NES, hinmokuGroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterThan(String hinmokuGroup) {
        regHinmokuGroup(CK_GT, fRES(hinmokuGroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessThan(String hinmokuGroup) {
        regHinmokuGroup(CK_LT, fRES(hinmokuGroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_GreaterEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_GE, fRES(hinmokuGroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_LessEqual(String hinmokuGroup) {
        regHinmokuGroup(CK_LE, fRES(hinmokuGroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_InScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_InScope(Collection<String> hinmokuGroupList) {
        regINS(CK_INS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroupList The collection of hinmokuGroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        doSetHinmokuGroup_NotInScope(hinmokuGroupList);
    }

    protected void doSetHinmokuGroup_NotInScope(Collection<String> hinmokuGroupList) {
        regINS(CK_NINS, cTL(hinmokuGroupList), xgetCValueHinmokuGroup(), "HINMOKU_GROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)} <br>
     * <pre>e.g. setHinmokuGroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuGroup The value of hinmokuGroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuGroup_LikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuGroup_NotLikeSearch(String hinmokuGroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuGroup), xgetCValueHinmokuGroup(), "HINMOKU_GROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     * @param hinmokuGroup The value of hinmokuGroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuGroup_PrefixSearch(String hinmokuGroup) {
        setHinmokuGroup_LikeSearch(hinmokuGroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNull() { regHinmokuGroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNullOrEmpty() { regHinmokuGroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_GROUP: {VARCHAR(30)}
     */
    public void setHinmokuGroup_IsNotNull() { regHinmokuGroup(CK_ISNN, DOBJ); }

    protected void regHinmokuGroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuGroup(), "HINMOKU_GROUP"); }
    protected abstract ConditionValue xgetCValueHinmokuGroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_Equal(String hinmokuText) {
        doSetHinmokuText_Equal(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_Equal(String hinmokuText) {
        regHinmokuText(CK_EQ, hinmokuText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotEqual(String hinmokuText) {
        doSetHinmokuText_NotEqual(fRES(hinmokuText));
    }

    protected void doSetHinmokuText_NotEqual(String hinmokuText) {
        regHinmokuText(CK_NES, hinmokuText);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_InScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_InScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_InScope(Collection<String> hinmokuTextList) {
        regINS(CK_INS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuTextList The collection of hinmokuText as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        doSetHinmokuText_NotInScope(hinmokuTextList);
    }

    protected void doSetHinmokuText_NotInScope(Collection<String> hinmokuTextList) {
        regINS(CK_NINS, cTL(hinmokuTextList), xgetCValueHinmokuText(), "HINMOKU_TEXT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)} <br>
     * <pre>e.g. setHinmokuText_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hinmokuText The value of hinmokuText as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHinmokuText_LikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(60)}
     */
    public void setHinmokuText_IsNotNull() { regHinmokuText(CK_ISNN, DOBJ); }

    protected void regHinmokuText(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHinmokuText(), "HINMOKU_TEXT"); }
    protected abstract ConditionValue xgetCValueHinmokuText();

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
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_Equal(String unitNm) {
        doSetUnitNm_Equal(fRES(unitNm));
    }

    protected void doSetUnitNm_Equal(String unitNm) {
        regUnitNm(CK_EQ, unitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotEqual(String unitNm) {
        doSetUnitNm_NotEqual(fRES(unitNm));
    }

    protected void doSetUnitNm_NotEqual(String unitNm) {
        regUnitNm(CK_NES, unitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNmList The collection of unitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_InScope(Collection<String> unitNmList) {
        doSetUnitNm_InScope(unitNmList);
    }

    protected void doSetUnitNm_InScope(Collection<String> unitNmList) {
        regINS(CK_INS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNmList The collection of unitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_NotInScope(Collection<String> unitNmList) {
        doSetUnitNm_NotInScope(unitNmList);
    }

    protected void doSetUnitNm_NotInScope(Collection<String> unitNmList) {
        regINS(CK_NINS, cTL(unitNmList), xgetCValueUnitNm(), "UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitNm The value of unitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitNm_LikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(60)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNull() { regCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNullOrEmpty() { regCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setCustomerCd_IsNotNull() { regCustomerCd(CK_ISNN, DOBJ); }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_Equal(String destinationCd) {
        doSetDestinationCd_Equal(fRES(destinationCd));
    }

    protected void doSetDestinationCd_Equal(String destinationCd) {
        regDestinationCd(CK_EQ, destinationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_NotEqual(String destinationCd) {
        doSetDestinationCd_NotEqual(fRES(destinationCd));
    }

    protected void doSetDestinationCd_NotEqual(String destinationCd) {
        regDestinationCd(CK_NES, destinationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_GreaterThan(String destinationCd) {
        regDestinationCd(CK_GT, fRES(destinationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_LessThan(String destinationCd) {
        regDestinationCd(CK_LT, fRES(destinationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_GreaterEqual(String destinationCd) {
        regDestinationCd(CK_GE, fRES(destinationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_LessEqual(String destinationCd) {
        regDestinationCd(CK_LE, fRES(destinationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCdList The collection of destinationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_InScope(Collection<String> destinationCdList) {
        doSetDestinationCd_InScope(destinationCdList);
    }

    protected void doSetDestinationCd_InScope(Collection<String> destinationCdList) {
        regINS(CK_INS, cTL(destinationCdList), xgetCValueDestinationCd(), "DESTINATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCdList The collection of destinationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_NotInScope(Collection<String> destinationCdList) {
        doSetDestinationCd_NotInScope(destinationCdList);
    }

    protected void doSetDestinationCd_NotInScope(Collection<String> destinationCdList) {
        regINS(CK_NINS, cTL(destinationCdList), xgetCValueDestinationCd(), "DESTINATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationCd The value of destinationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationCd_LikeSearch(String destinationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationCd), xgetCValueDestinationCd(), "DESTINATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationCd_NotLikeSearch(String destinationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationCd), xgetCValueDestinationCd(), "DESTINATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_PrefixSearch(String destinationCd) {
        setDestinationCd_LikeSearch(destinationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNull() { regDestinationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNullOrEmpty() { regDestinationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNotNull() { regDestinationCd(CK_ISNN, DOBJ); }

    protected void regDestinationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationCd(), "DESTINATION_CD"); }
    protected abstract ConditionValue xgetCValueDestinationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_Equal(String destinationNm1) {
        doSetDestinationNm1_Equal(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_Equal(String destinationNm1) {
        regDestinationNm1(CK_EQ, destinationNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotEqual(String destinationNm1) {
        doSetDestinationNm1_NotEqual(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_NotEqual(String destinationNm1) {
        regDestinationNm1(CK_NES, destinationNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterThan(String destinationNm1) {
        regDestinationNm1(CK_GT, fRES(destinationNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessThan(String destinationNm1) {
        regDestinationNm1(CK_LT, fRES(destinationNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterEqual(String destinationNm1) {
        regDestinationNm1(CK_GE, fRES(destinationNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessEqual(String destinationNm1) {
        regDestinationNm1(CK_LE, fRES(destinationNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_InScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_InScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_InScope(Collection<String> destinationNm1List) {
        regINS(CK_INS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_NotInScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        regINS(CK_NINS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm1 The value of destinationNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm1_LikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm1_NotLikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_PrefixSearch(String destinationNm1) {
        setDestinationNm1_LikeSearch(destinationNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNull() { regDestinationNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNullOrEmpty() { regDestinationNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNotNull() { regDestinationNm1(CK_ISNN, DOBJ); }

    protected void regDestinationNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm1(), "DESTINATION_NM1"); }
    protected abstract ConditionValue xgetCValueDestinationNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_Equal(String destinationNm2) {
        doSetDestinationNm2_Equal(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_Equal(String destinationNm2) {
        regDestinationNm2(CK_EQ, destinationNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotEqual(String destinationNm2) {
        doSetDestinationNm2_NotEqual(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_NotEqual(String destinationNm2) {
        regDestinationNm2(CK_NES, destinationNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterThan(String destinationNm2) {
        regDestinationNm2(CK_GT, fRES(destinationNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessThan(String destinationNm2) {
        regDestinationNm2(CK_LT, fRES(destinationNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterEqual(String destinationNm2) {
        regDestinationNm2(CK_GE, fRES(destinationNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessEqual(String destinationNm2) {
        regDestinationNm2(CK_LE, fRES(destinationNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_InScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_InScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_InScope(Collection<String> destinationNm2List) {
        regINS(CK_INS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_NotInScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        regINS(CK_NINS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm2 The value of destinationNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm2_LikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm2_NotLikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_PrefixSearch(String destinationNm2) {
        setDestinationNm2_LikeSearch(destinationNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNull() { regDestinationNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNullOrEmpty() { regDestinationNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNotNull() { regDestinationNm2(CK_ISNN, DOBJ); }

    protected void regDestinationNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm2(), "DESTINATION_NM2"); }
    protected abstract ConditionValue xgetCValueDestinationNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_Equal(String destinationNmKana) {
        doSetDestinationNmKana_Equal(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_Equal(String destinationNmKana) {
        regDestinationNmKana(CK_EQ, destinationNmKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotEqual(String destinationNmKana) {
        doSetDestinationNmKana_NotEqual(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_NotEqual(String destinationNmKana) {
        regDestinationNmKana(CK_NES, destinationNmKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterThan(String destinationNmKana) {
        regDestinationNmKana(CK_GT, fRES(destinationNmKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessThan(String destinationNmKana) {
        regDestinationNmKana(CK_LT, fRES(destinationNmKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterEqual(String destinationNmKana) {
        regDestinationNmKana(CK_GE, fRES(destinationNmKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessEqual(String destinationNmKana) {
        regDestinationNmKana(CK_LE, fRES(destinationNmKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_InScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        regINS(CK_INS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_NotInScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        regINS(CK_NINS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNmKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNmKana The value of destinationNmKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNmKana_LikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNmKana_NotLikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_PrefixSearch(String destinationNmKana) {
        setDestinationNmKana_LikeSearch(destinationNmKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNull() { regDestinationNmKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNullOrEmpty() { regDestinationNmKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNotNull() { regDestinationNmKana(CK_ISNN, DOBJ); }

    protected void regDestinationNmKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA"); }
    protected abstract ConditionValue xgetCValueDestinationNmKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_Equal(String destinationZipCd) {
        doSetDestinationZipCd_Equal(fRES(destinationZipCd));
    }

    protected void doSetDestinationZipCd_Equal(String destinationZipCd) {
        regDestinationZipCd(CK_EQ, destinationZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_NotEqual(String destinationZipCd) {
        doSetDestinationZipCd_NotEqual(fRES(destinationZipCd));
    }

    protected void doSetDestinationZipCd_NotEqual(String destinationZipCd) {
        regDestinationZipCd(CK_NES, destinationZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterThan(String destinationZipCd) {
        regDestinationZipCd(CK_GT, fRES(destinationZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessThan(String destinationZipCd) {
        regDestinationZipCd(CK_LT, fRES(destinationZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterEqual(String destinationZipCd) {
        regDestinationZipCd(CK_GE, fRES(destinationZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessEqual(String destinationZipCd) {
        regDestinationZipCd(CK_LE, fRES(destinationZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCdList The collection of destinationZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_InScope(Collection<String> destinationZipCdList) {
        doSetDestinationZipCd_InScope(destinationZipCdList);
    }

    protected void doSetDestinationZipCd_InScope(Collection<String> destinationZipCdList) {
        regINS(CK_INS, cTL(destinationZipCdList), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCdList The collection of destinationZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_NotInScope(Collection<String> destinationZipCdList) {
        doSetDestinationZipCd_NotInScope(destinationZipCdList);
    }

    protected void doSetDestinationZipCd_NotInScope(Collection<String> destinationZipCdList) {
        regINS(CK_NINS, cTL(destinationZipCdList), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationZipCd The value of destinationZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationZipCd_LikeSearch(String destinationZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationZipCd), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationZipCd_NotLikeSearch(String destinationZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationZipCd), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     * @param destinationZipCd The value of destinationZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_PrefixSearch(String destinationZipCd) {
        setDestinationZipCd_LikeSearch(destinationZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     */
    public void setDestinationZipCd_IsNull() { regDestinationZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     */
    public void setDestinationZipCd_IsNullOrEmpty() { regDestinationZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(60)}
     */
    public void setDestinationZipCd_IsNotNull() { regDestinationZipCd(CK_ISNN, DOBJ); }

    protected void regDestinationZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDestinationZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_Equal(String destinationAddress1) {
        doSetDestinationAddress1_Equal(fRES(destinationAddress1));
    }

    protected void doSetDestinationAddress1_Equal(String destinationAddress1) {
        regDestinationAddress1(CK_EQ, destinationAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_NotEqual(String destinationAddress1) {
        doSetDestinationAddress1_NotEqual(fRES(destinationAddress1));
    }

    protected void doSetDestinationAddress1_NotEqual(String destinationAddress1) {
        regDestinationAddress1(CK_NES, destinationAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterThan(String destinationAddress1) {
        regDestinationAddress1(CK_GT, fRES(destinationAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessThan(String destinationAddress1) {
        regDestinationAddress1(CK_LT, fRES(destinationAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_GreaterEqual(String destinationAddress1) {
        regDestinationAddress1(CK_GE, fRES(destinationAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_LessEqual(String destinationAddress1) {
        regDestinationAddress1(CK_LE, fRES(destinationAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1List The collection of destinationAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_InScope(Collection<String> destinationAddress1List) {
        doSetDestinationAddress1_InScope(destinationAddress1List);
    }

    protected void doSetDestinationAddress1_InScope(Collection<String> destinationAddress1List) {
        regINS(CK_INS, cTL(destinationAddress1List), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1List The collection of destinationAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_NotInScope(Collection<String> destinationAddress1List) {
        doSetDestinationAddress1_NotInScope(destinationAddress1List);
    }

    protected void doSetDestinationAddress1_NotInScope(Collection<String> destinationAddress1List) {
        regINS(CK_NINS, cTL(destinationAddress1List), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationAddress1 The value of destinationAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationAddress1_LikeSearch(String destinationAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationAddress1), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress1_NotLikeSearch(String destinationAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress1), xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     * @param destinationAddress1 The value of destinationAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress1_PrefixSearch(String destinationAddress1) {
        setDestinationAddress1_LikeSearch(destinationAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNull() { regDestinationAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNullOrEmpty() { regDestinationAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS1: {VARCHAR(60)}
     */
    public void setDestinationAddress1_IsNotNull() { regDestinationAddress1(CK_ISNN, DOBJ); }

    protected void regDestinationAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationAddress1(), "DESTINATION_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDestinationAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_Equal(String destinationAddress2) {
        doSetDestinationAddress2_Equal(fRES(destinationAddress2));
    }

    protected void doSetDestinationAddress2_Equal(String destinationAddress2) {
        regDestinationAddress2(CK_EQ, destinationAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_NotEqual(String destinationAddress2) {
        doSetDestinationAddress2_NotEqual(fRES(destinationAddress2));
    }

    protected void doSetDestinationAddress2_NotEqual(String destinationAddress2) {
        regDestinationAddress2(CK_NES, destinationAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterThan(String destinationAddress2) {
        regDestinationAddress2(CK_GT, fRES(destinationAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessThan(String destinationAddress2) {
        regDestinationAddress2(CK_LT, fRES(destinationAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_GreaterEqual(String destinationAddress2) {
        regDestinationAddress2(CK_GE, fRES(destinationAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_LessEqual(String destinationAddress2) {
        regDestinationAddress2(CK_LE, fRES(destinationAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2List The collection of destinationAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_InScope(Collection<String> destinationAddress2List) {
        doSetDestinationAddress2_InScope(destinationAddress2List);
    }

    protected void doSetDestinationAddress2_InScope(Collection<String> destinationAddress2List) {
        regINS(CK_INS, cTL(destinationAddress2List), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2List The collection of destinationAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_NotInScope(Collection<String> destinationAddress2List) {
        doSetDestinationAddress2_NotInScope(destinationAddress2List);
    }

    protected void doSetDestinationAddress2_NotInScope(Collection<String> destinationAddress2List) {
        regINS(CK_NINS, cTL(destinationAddress2List), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationAddress2 The value of destinationAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationAddress2_LikeSearch(String destinationAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationAddress2), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationAddress2_NotLikeSearch(String destinationAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationAddress2), xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     * @param destinationAddress2 The value of destinationAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationAddress2_PrefixSearch(String destinationAddress2) {
        setDestinationAddress2_LikeSearch(destinationAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNull() { regDestinationAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNullOrEmpty() { regDestinationAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ADDRESS2: {VARCHAR(60)}
     */
    public void setDestinationAddress2_IsNotNull() { regDestinationAddress2(CK_ISNN, DOBJ); }

    protected void regDestinationAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationAddress2(), "DESTINATION_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDestinationAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_Equal(String destinationTel) {
        doSetDestinationTel_Equal(fRES(destinationTel));
    }

    protected void doSetDestinationTel_Equal(String destinationTel) {
        regDestinationTel(CK_EQ, destinationTel);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_NotEqual(String destinationTel) {
        doSetDestinationTel_NotEqual(fRES(destinationTel));
    }

    protected void doSetDestinationTel_NotEqual(String destinationTel) {
        regDestinationTel(CK_NES, destinationTel);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_GreaterThan(String destinationTel) {
        regDestinationTel(CK_GT, fRES(destinationTel));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_LessThan(String destinationTel) {
        regDestinationTel(CK_LT, fRES(destinationTel));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_GreaterEqual(String destinationTel) {
        regDestinationTel(CK_GE, fRES(destinationTel));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_LessEqual(String destinationTel) {
        regDestinationTel(CK_LE, fRES(destinationTel));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTelList The collection of destinationTel as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_InScope(Collection<String> destinationTelList) {
        doSetDestinationTel_InScope(destinationTelList);
    }

    protected void doSetDestinationTel_InScope(Collection<String> destinationTelList) {
        regINS(CK_INS, cTL(destinationTelList), xgetCValueDestinationTel(), "DESTINATION_TEL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTelList The collection of destinationTel as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_NotInScope(Collection<String> destinationTelList) {
        doSetDestinationTel_NotInScope(destinationTelList);
    }

    protected void doSetDestinationTel_NotInScope(Collection<String> destinationTelList) {
        regINS(CK_NINS, cTL(destinationTelList), xgetCValueDestinationTel(), "DESTINATION_TEL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationTel_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationTel The value of destinationTel as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationTel_LikeSearch(String destinationTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationTel), xgetCValueDestinationTel(), "DESTINATION_TEL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationTel_NotLikeSearch(String destinationTel, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationTel), xgetCValueDestinationTel(), "DESTINATION_TEL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     * @param destinationTel The value of destinationTel as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationTel_PrefixSearch(String destinationTel) {
        setDestinationTel_LikeSearch(destinationTel, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNull() { regDestinationTel(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNullOrEmpty() { regDestinationTel(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_TEL: {VARCHAR(30)}
     */
    public void setDestinationTel_IsNotNull() { regDestinationTel(CK_ISNN, DOBJ); }

    protected void regDestinationTel(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationTel(), "DESTINATION_TEL"); }
    protected abstract ConditionValue xgetCValueDestinationTel();

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
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_Equal(String wmsAddUserCd) {
        doSetWmsAddUserCd_Equal(fRES(wmsAddUserCd));
    }

    protected void doSetWmsAddUserCd_Equal(String wmsAddUserCd) {
        regWmsAddUserCd(CK_EQ, wmsAddUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_NotEqual(String wmsAddUserCd) {
        doSetWmsAddUserCd_NotEqual(fRES(wmsAddUserCd));
    }

    protected void doSetWmsAddUserCd_NotEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_NES, wmsAddUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_GreaterThan(String wmsAddUserCd) {
        regWmsAddUserCd(CK_GT, fRES(wmsAddUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_LessThan(String wmsAddUserCd) {
        regWmsAddUserCd(CK_LT, fRES(wmsAddUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_GreaterEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_GE, fRES(wmsAddUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_LessEqual(String wmsAddUserCd) {
        regWmsAddUserCd(CK_LE, fRES(wmsAddUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCdList The collection of wmsAddUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_InScope(Collection<String> wmsAddUserCdList) {
        doSetWmsAddUserCd_InScope(wmsAddUserCdList);
    }

    protected void doSetWmsAddUserCd_InScope(Collection<String> wmsAddUserCdList) {
        regINS(CK_INS, cTL(wmsAddUserCdList), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCdList The collection of wmsAddUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_NotInScope(Collection<String> wmsAddUserCdList) {
        doSetWmsAddUserCd_NotInScope(wmsAddUserCdList);
    }

    protected void doSetWmsAddUserCd_NotInScope(Collection<String> wmsAddUserCdList) {
        regINS(CK_NINS, cTL(wmsAddUserCdList), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsAddUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsAddUserCd The value of wmsAddUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsAddUserCd_LikeSearch(String wmsAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsAddUserCd), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsAddUserCd_NotLikeSearch(String wmsAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsAddUserCd), xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     * @param wmsAddUserCd The value of wmsAddUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsAddUserCd_PrefixSearch(String wmsAddUserCd) {
        setWmsAddUserCd_LikeSearch(wmsAddUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNull() { regWmsAddUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNullOrEmpty() { regWmsAddUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsAddUserCd_IsNotNull() { regWmsAddUserCd(CK_ISNN, DOBJ); }

    protected void regWmsAddUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsAddUserCd(), "WMS_ADD_USER_CD"); }
    protected abstract ConditionValue xgetCValueWmsAddUserCd();

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
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_Equal(String wmsUpdUserCd) {
        doSetWmsUpdUserCd_Equal(fRES(wmsUpdUserCd));
    }

    protected void doSetWmsUpdUserCd_Equal(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_EQ, wmsUpdUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_NotEqual(String wmsUpdUserCd) {
        doSetWmsUpdUserCd_NotEqual(fRES(wmsUpdUserCd));
    }

    protected void doSetWmsUpdUserCd_NotEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_NES, wmsUpdUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_GreaterThan(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_GT, fRES(wmsUpdUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_LessThan(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_LT, fRES(wmsUpdUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_GreaterEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_GE, fRES(wmsUpdUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_LessEqual(String wmsUpdUserCd) {
        regWmsUpdUserCd(CK_LE, fRES(wmsUpdUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCdList The collection of wmsUpdUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_InScope(Collection<String> wmsUpdUserCdList) {
        doSetWmsUpdUserCd_InScope(wmsUpdUserCdList);
    }

    protected void doSetWmsUpdUserCd_InScope(Collection<String> wmsUpdUserCdList) {
        regINS(CK_INS, cTL(wmsUpdUserCdList), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCdList The collection of wmsUpdUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_NotInScope(Collection<String> wmsUpdUserCdList) {
        doSetWmsUpdUserCd_NotInScope(wmsUpdUserCdList);
    }

    protected void doSetWmsUpdUserCd_NotInScope(Collection<String> wmsUpdUserCdList) {
        regINS(CK_NINS, cTL(wmsUpdUserCdList), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setWmsUpdUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsUpdUserCd The value of wmsUpdUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsUpdUserCd_LikeSearch(String wmsUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsUpdUserCd), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsUpdUserCd_NotLikeSearch(String wmsUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsUpdUserCd), xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     * @param wmsUpdUserCd The value of wmsUpdUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsUpdUserCd_PrefixSearch(String wmsUpdUserCd) {
        setWmsUpdUserCd_LikeSearch(wmsUpdUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNull() { regWmsUpdUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNullOrEmpty() { regWmsUpdUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setWmsUpdUserCd_IsNotNull() { regWmsUpdUserCd(CK_ISNN, DOBJ); }

    protected void regWmsUpdUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsUpdUserCd(), "WMS_UPD_USER_CD"); }
    protected abstract ConditionValue xgetCValueWmsUpdUserCd();

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
    public HpSLCFunction<ErSerialNoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ErSerialNoCB.class);
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
    public HpSLCFunction<ErSerialNoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ErSerialNoCB.class);
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
    public HpSLCFunction<ErSerialNoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ErSerialNoCB.class);
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
    public HpSLCFunction<ErSerialNoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ErSerialNoCB.class);
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
    public HpSLCFunction<ErSerialNoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ErSerialNoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ErSerialNoCB&gt;() {
     *     public void query(ErSerialNoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ErSerialNoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ErSerialNoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ErSerialNoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ErSerialNoCQ sq);

    protected ErSerialNoCB xcreateScalarConditionCB() {
        ErSerialNoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ErSerialNoCB xcreateScalarConditionPartitionByCB() {
        ErSerialNoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ErSerialNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErSerialNoCB cb = new ErSerialNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SERIAL_NO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ErSerialNoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ErSerialNoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ErSerialNoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ErSerialNoCB cb = new ErSerialNoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SERIAL_NO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ErSerialNoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ErSerialNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ErSerialNoCB cb = new ErSerialNoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ErSerialNoCQ sq);

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
    protected ErSerialNoCB newMyCB() {
        return new ErSerialNoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ErSerialNoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
